/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXRadioButton jkl;
    @FXML
    private ToggleGroup pilih;
    @FXML
    private JFXRadioButton jkp;
    @FXML
    private JFXTextField editnama;
    @FXML
    private JFXTextField editbb;
    @FXML
    private JFXTextField edittb;
    @FXML
    private JFXTextField idealbb;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private JFXButton proses;
    @FXML
    private JFXButton reset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
         String name = editnama.getText();
        int weight = Integer.parseInt(editbb.getText());
    int height = Integer.parseInt(edittb.getText());
    String jk;
    String asil = null;
    String print1 = null;
    int ideall =  height - 105;
    int idealp =  height - 110;
    String saran1 = null;

    if (jkl.isSelected()){
        jk="Laki-laki";
        if(weight == ideall){
            idealbb.setText("50");
            asil = "ideal";
            print1="\n Nama :" +name+"\n Tinggi Anda :" +height+" \n Anda : "+asil;
            saran1 = "Pertahankan";
        }
        else if(weight > ideall){
        idealbb.setText("50");
        asil="Overweight";
        print1="\n Nama :" +name+"\n Tinggi Anda :" +height+" \n Anda : "+asil;
        saran1="\n Kurangi makanan yang tidak sehat dan perbanyak makan sayur ";
    }
         else{
         idealbb.setText("50");
         asil = "Underweight";
         print1 = "\n Nama :"+name+ "\n Tinggi Anda :" +height+ "\n Anda : "+asil;
         saran1= "\n Lebih banyak makan makanan yang bergizi ";
         }
    }
    else if(jkp.isSelected()){
        jk="Perempuan";
        if(weight == idealp){
            idealbb.setText("50");
            asil = "Ideal";
            print1="\n Nama :" +name+"\n Tinggi Anda :" +height+" \n Anda : "+asil;
            saran1 = " Pertahankan ";
        }
        else if(weight > idealp){
        idealbb.setText("45");
        asil="Overweight";
        print1 = "\n Nama :" +name+"\n Tinggi Anda :" +height+"\n Anda : "+asil;
        saran1 = "\n Kurangi makanan yang tidak sehat dan perbanyak makan sayur ";
    }
         else if(weight < idealp){
         idealbb.setText("45");
         asil="Underweight";
         print1 = "\n Nama :" +name+"\n Tinggi Anda :" +height+"\n Anda : "+asil;
         saran1 = "\n Lebih banyak makan makanan yang bergizi ";
         }
    }
    else{
        jk="Unknown";
    }
    hasil.setText(" Hasil : "+ print1);
   saran.setText(" Saran : " + saran1);
    }

    @FXML
    private void reset(ActionEvent event) {
         editnama.setText("");
        editbb.setText("");
        edittb.setText("");
        idealbb.setText("");
        hasil.setText("");
        saran.setText("");
        jkl.setSelected(false);
        jkp.setSelected(false);
        
    }
    
}
