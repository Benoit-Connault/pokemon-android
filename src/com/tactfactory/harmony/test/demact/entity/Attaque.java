package com.tactfactory.harmony.test.demact.entity;

import java.util.ArrayList;

import com.tactfactory.harmony.annotation.Column;
import com.tactfactory.harmony.annotation.Entity;
import com.tactfactory.harmony.annotation.GeneratedValue;
import com.tactfactory.harmony.annotation.Id;
import com.tactfactory.harmony.annotation.OneToMany;
import com.tactfactory.harmony.annotation.Column.Type;
import com.tactfactory.harmony.annotation.GeneratedValue.Strategy;

@Rest
@Entity
public class Attaque {
    @Id
    @Column(type = Type.INTEGER, hidden = true)
    @GeneratedValue(strategy = Strategy.MODE_IDENTITY)
    private int id;

    @Column(type = Type.STRING)
    private String nom;
    
    @Column(type = Type.INTEGER)
    private int power;

    @Column(type = Type.INTEGER)
    private int precision;
    
    @OneToMany
    @Column()
    private ArrayList<Element> typePokemon;
}
