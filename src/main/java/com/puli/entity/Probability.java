package com.puli.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/3/23.
 */
@Entity
@Table(name = "t_probability")
public class Probability {

    @Id
    @GeneratedValue
    private Integer id;
    private String prize;
    private Double value;
    Probability(){}
    Probability(Integer id,String prize,Double value){
        this.id=id;
        this.prize=prize;
        this.value=value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Probability{" +
                "id=" + id +
                ", prize='" + prize + '\'' +
                ", value=" + value +
                '}';
    }
}
