package com.tech.model;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_news")
@Setter
@Getter
public class News extends BaseItem {

}
