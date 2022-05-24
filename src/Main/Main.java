/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;



/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        MovieView view = new MovieView();
        ModelMovie model = new ModelMovie();
        ControllerMovie controller = new ControllerMovie(model, view);
    }
    
}
