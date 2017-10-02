/**
 *
 * @author Briceyda Angeles
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMenor;
import views.ViewMenor;

public class ControllerMenor {
    ViewMenor view_menor;
    ModelMenor model_menor;
    public ControllerMenor(ViewMenor view_menor, ModelMenor model_menor){
        this.view_menor = view_menor;
        this.model_menor = model_menor;
        view_menor.jbtn_menor.addActionListener(e->jbtn_menor_click());
        initView();
    }
    public void initView(){
        view_menor.jtf_n1.setText(String.valueOf(model_menor.getN1()));
        view_menor.jtf_n2.setText(String.valueOf(model_menor.getN2()));
        view_menor.jtf_n3.setText(String.valueOf(model_menor.getN3()));
        view_menor.jtf_m.setText(String.valueOf(model_menor.getM()));
        view_menor.setVisible(true);
    }
    public void jbtn_menor_click(){
        model_menor.setN1(Integer.parseInt(view_menor.jtf_n1.getText()));
        model_menor.setN2(Integer.parseInt(view_menor.jtf_n2.getText()));
        model_menor.setN3(Integer.parseInt(view_menor.jtf_n3.getText()));
        model_menor.menor();
        view_menor.jtf_m.setText(String.valueOf(model_menor.getM()));
    }
        
}


      