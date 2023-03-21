/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimuladorMiniPato;

import patos.MallardDuck;
import patos.Duck;
import patos.ModelDuck;
import voos.FlyRocketPowered;

/**
 *
 * @author autologon
 */
public class SimuladorMiniPato {
    public static void main(String[]args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        
        System.out.println("\n////////Outro modelo abaixo/////////");
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
    }
}
