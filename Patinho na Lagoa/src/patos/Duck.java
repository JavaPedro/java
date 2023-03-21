/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patos;

import quack.QuackBehavior;
import voos.FlyBehavior;

/**
 *
 * @author autologon
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}
    
    public abstract void display();
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
        System.out.println("Todos os patos flutuam, até iscas! ");
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
