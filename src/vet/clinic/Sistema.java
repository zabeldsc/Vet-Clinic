/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vet.clinic;

import java.util.ArrayList;

/**
 *
 * @author Caiyo
 */
public class Sistema {
    
    private ArrayList<Tutor> tutores;
    
    public Sistema(){
        this.tutores = new ArrayList<>();
    }
    
    public ArrayList<Tutor> getTutores(){
        return tutores;
    }
    
}
