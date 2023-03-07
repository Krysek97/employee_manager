package com.app.demo.vacation;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "VACATION")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vacation_id")
    private Long id;
    private LocalDate date;

}
