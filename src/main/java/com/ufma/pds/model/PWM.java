package com.ufma.pds.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(schema = "estudojpa", name = "pwm")
public class PWM {
    @Id
    @Column(name = "ID_PWM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "VALOR_PWM")
    private BigDecimal valorPwm;
    @Column(name = "TIME_STAMP_PWM")
    private Long timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorPwm() {
        return valorPwm;
    }

    public void setValorPwm(BigDecimal valorPwm) {
        this.valorPwm = valorPwm;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
