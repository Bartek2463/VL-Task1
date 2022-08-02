package com.example.vltask1.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String text;
    @ManyToOne
    private User user;
}
