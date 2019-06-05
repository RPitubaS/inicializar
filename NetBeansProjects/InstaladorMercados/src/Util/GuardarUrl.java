/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Pituba
 */
public class GuardarUrl {
    
     public static Properties prop = new Properties();
    
    public void SaveProp(){
         
        
        try {
            prop.setProperty("Internalizar", "dentro");
            prop.store(new FileOutputStream("C:\\Windows\\System32\\ent.txt"), null);
            JOptionPane.showMessageDialog(null, "Os aquivos de instalação, já\n"
                    + "forão atualizados!", "Instalação.", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex + " ao salvar URL!");
        }
    }
    
    public String GetProp(String nome){
          
            String valor = "";
            
            try{
                prop.load(new FileInputStream("C:\\Windows\\System32\\ent.txt"));
                valor = prop.getProperty(nome);
            }catch(IOException ex){
                         //JOptionPane.showMessageDialog(null, "Erro: \nO sistema não pode encontrar o " +
                                                       //"arquivo especificado!" +
                                                       //"\nPor favor entre em contato com seu fornecedor.");
            }
            return valor;
    }
}
