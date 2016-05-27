package com.tactfactory.harmony.test.demact.entity;

import com.tactfactory.harmony.annotation.Column;
import com.tactfactory.harmony.annotation.Column.Type;
import com.tactfactory.harmony.annotation.Entity;
import com.tactfactory.harmony.annotation.GeneratedValue;
import com.tactfactory.harmony.annotation.GeneratedValue.Strategy;
import com.tactfactory.harmony.annotation.Id;
import com.tactfactory.harmony.annotation.OneToOne;

@Rest
@Entity
public class Pokemon {
    @Id
    @Column(type = Type.INTEGER, hidden = true)
    @GeneratedValue(strategy = Strategy.MODE_IDENTITY)
    private int id;

    @Column(type = Type.STRING)
    private String nom;

    @Column(type = Type.INTEGER)
    private int niveau;

    @OneToOne
    @Column()
    private Dresseur dresseur;

    @OneToOne
    @Column()
    private Attaque attaque1;

    @OneToOne
    @Column()
    private Attaque attaque2;

    @OneToOne
    @Column()
    private Attaque attaque3;

    @OneToOne
    @Column()
    private Attaque attaque4;

    @OneToOne
    @Column()
    private TypePokemon typePokemon;

    @Column(type = Type.INTEGER)
    private int attaque;

    @Column(type = Type.INTEGER)
    private int attaqueSpe;

    @Column(type = Type.INTEGER)
    private int defense;

    @Column(type = Type.INTEGER)
    private int defenseSpe;

    @Column(type = Type.INTEGER)
    private int vitesse;

    @Column(type = Type.INTEGER)
    private int pv;
    
}
