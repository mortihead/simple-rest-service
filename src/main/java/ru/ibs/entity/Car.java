package ru.ibs.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*; // Импортируем jakarta.persistence

import java.math.BigDecimal;

@Entity
@Table(name = "cars")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Уникальный идентификатор записи

    @Column(nullable = false, length = 50)
    private String brand; // Марка автомобиля

    @Column(nullable = false, length = 100)
    private String model; // Модель автомобиля

    @Column(nullable = false)
    private int year; // Год выпуска

    @Column(length = 50)
    private String color; // Цвет автомобиля

    @Column(precision = 10, scale = 2)
    private BigDecimal price; // Цена автомобиля
}