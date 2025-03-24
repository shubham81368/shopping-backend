package com.backendshopping.shopping.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.annotation.Id;

import javax.swing.text.html.parser.Entity;
import java.util.UUID;

@Entity
public class ApplicationUser {
@Id//primary key ban dega
        @GeneratedValue(Strategy=Genrationtype.AUTO)
    UUID id;

}
