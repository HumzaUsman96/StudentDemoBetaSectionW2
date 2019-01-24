/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pillbox;

/**
 *
 * @author humza
 */
public class Bead {
    
    private String color;
    private char letter;
    
    public Bead (){}
    
    public Bead(String color, char letter){
        this.color=color;
        this.letter=letter;
        
        
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String getColor() {
        return color;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Bead{" + "color=" + color + ", letter=" + letter + '}';
    }
    
    
    
}
