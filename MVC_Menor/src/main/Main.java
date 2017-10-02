/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewMenor;
import models.ModelMenor;
import controllers.ControllerMenor;
/**
 *
 * @author Briceyda Angeles
 */
public class Main {
    public static ViewMenor view_menor;
    public static ModelMenor model_menor;
    public static ControllerMenor controller_menor;
    
    
    
    public static void main(String BAP[]){
         model_menor = new ModelMenor();
         view_menor  = new ViewMenor();
        controller_menor = new ControllerMenor(view_menor, model_menor);
    }
}
