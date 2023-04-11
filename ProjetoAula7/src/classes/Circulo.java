
package classes;
import java.math.*;
/**
 *
 * @author Administrator
 */
public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double Area(){
        return Math.pow(this.getRaio(), 2) * Math.PI;
    }
    
}   
