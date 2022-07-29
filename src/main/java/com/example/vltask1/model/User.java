package com.example.vltask1.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max = 45)
    @Column(name = "USERNAME")
    private String username;
    @NotNull
    @Size(max = 45)
    @Column(name = "PASSWORD")
    private String password;
    @NotNull
    @Size(max = 45)
    @Column(name = "PERMISSION")
    private String permission;
    @NotNull
    @Size(max = 45)
    @Column(name = "READ_ONLY")
    private String readOnly;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.REFRESH,mappedBy = "user")
    private Set<Blog> blogs = new HashSet<>();




}
