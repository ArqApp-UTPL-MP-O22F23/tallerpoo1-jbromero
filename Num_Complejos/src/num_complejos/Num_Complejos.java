/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package num_complejos;

/**
 *
 * @author jbromero
 */
public class Num_Complejos implements ComplejosInter{

    private float RealNum;
    private float ImagNum;

    public Num_Complejos(float RealNum, float ImagNum) {
        this.RealNum = RealNum;
        this.ImagNum = ImagNum;
    }

    public Num_Complejos() {
    }
    
    @Override
    public Num_Complejos Suma (Num_Complejos Suma){
        
        float RealRespuesta = RealNum + Suma.RealNum;
        float ImaginarioRespuesta = ImagNum + Suma.ImagNum;
        
        return new Num_Complejos(RealRespuesta, ImaginarioRespuesta);
    }
    
    @Override
    public Num_Complejos Resta (Num_Complejos Resta){
        
        float RealRespuesta = RealNum - Resta.RealNum;
        float ImaginarioRespuesta = ImagNum - Resta.ImagNum;
        
        return new Num_Complejos(RealRespuesta, ImaginarioRespuesta);
    }

    @Override
    public String toString() {
        return "Numeros Complejos: \n Numenro Real=" + RealNum + ", Numero Imaginario=" + ImagNum ;
    }
       
}