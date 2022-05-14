package com.example.Info.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long iin;

    private String fio;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_code", referencedColumnName = "address_code")
    private Address address;

}
