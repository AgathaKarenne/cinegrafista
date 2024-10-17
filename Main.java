/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinegrafista;

/**
 *
 * @author agatha.machado
 */
public class Main {
    public static void main(String[] args){
        Camera dsrl = new CameraDSLR();
        Camera action = new CameraAction();
        
        Cinegrafista cinegrafista = new Cinegrafista(dsrl);
        cinegrafista.iniciarGravação();
        
        cinegrafista.trocarCamera(action);
        cinegrafista.iniciarGravação();
    }
}
