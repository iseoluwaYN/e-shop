package com.ecommerce.shop.data.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class NewsLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String subcriber_email;
}
