/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinegrafista;

/**
 *
 * @author agatha.machado
 */
public class Cinegrafista {
    private Camera camera;
    
    public Cinegrafista(Camera camera){
        this.camera = camera;
        
    }
    
    public void iniciarGravação(){
        System.out.println("Começando a filmagem");
    }
    
    public void terminandoGravação(){
        System.out.println("Terminando a filmagem");
    }
    
    public void trocarCamera(Camera novaCamera){
        this.camera = novaCamera;
        
    }
}
