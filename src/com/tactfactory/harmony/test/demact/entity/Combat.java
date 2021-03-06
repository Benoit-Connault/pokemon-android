package com.tactfactory.harmony.test.demact.entity;

import org.joda.time.DateTime;

import com.tactfactory.harmony.annotation.Column;
import com.tactfactory.harmony.annotation.Entity;
import com.tactfactory.harmony.annotation.GeneratedValue;
import com.tactfactory.harmony.annotation.Id;
import com.tactfactory.harmony.annotation.Column.Type;
import com.tactfactory.harmony.annotation.GeneratedValue.Strategy;
import com.tactfactory.harmony.annotation.OneToOne;


@Rest
@Entity
public class Combat {
    @Id
    @Column(type = Type.INTEGER, hidden = true)
    @GeneratedValue(strategy = Strategy.MODE_IDENTITY)
    private int id;

    @OneToOne
    @Column(name = "dresseur1")
    private Dresseur dresseur1;

    @OneToOne
    @Column(name = "dresseur2")
    private Dresseur dresseur2;
    
    @Column(type = Type.INTEGER)
    private int gagnant;

    @Column(type = Type.DATETIME)
    private DateTime date;
}
