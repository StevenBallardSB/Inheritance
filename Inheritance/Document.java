// CPW 143
// Programming Assignment 4
// Author: Steven Ballard
// Purpose: This program creates the document class.
public class Document {
    //inits text field
    private String text;
    
    //The no-arg constructor that sets the field text to 'This space is intentionaly left blank.'
    public Document(){
        text = "This space is intentionaly left blank.";
    }
    //The constructor that takes a parameter and sets the field to that.
    public Document(String text){
        this.text = text;
    }
    //Return the value of text
    public String getText(){
        return text;
    }
    //sets the value of text to that of str
    public void setText( String str ){
        text = str;
    }
    //returns the number of characters in the field 'text'
    public int size(){
        return text.length();
    }
    //Returns a string representing the doucments prefaced with the string 'Contents: '
    public String toString(){
        return "Contents: " + text;
    }
    
}
