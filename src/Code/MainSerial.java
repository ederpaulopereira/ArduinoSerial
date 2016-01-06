package Code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eder.paulo
 */

import gnu.io.CommPortIdentifier;
import java.util.Enumeration;
public class MainSerial {

    protected String[] portas;
    protected Enumeration listaDePortas;
    
    public MainSerial(){
        listaDePortas = CommPortIdentifier.getPortIdentifiers();
    }
    
    public String[] ObterPortas(){
        return portas;
    }
    
    public String[] ListarPortas(){
        int i = 0;
        
        portas = new String[10];
        
        while (listaDePortas.hasMoreElements()){
            CommPortIdentifier ips = (CommPortIdentifier)listaDePortas.nextElement();
            portas[i] = ips.getName();
            
            i++;
        }
        return portas;
        
        
    }
    
    public boolean PortaExiste(String COMp){
            String temp;
            boolean e = false;
            
            while (listaDePortas.hasMoreElements()){
                CommPortIdentifier ips = (CommPortIdentifier)listaDePortas.nextElement();
                temp = ips.getName();
                if (temp.equals(COMp) == true){
                    e = true;
                }
            }
            
            return e;
        }
    
    
}
