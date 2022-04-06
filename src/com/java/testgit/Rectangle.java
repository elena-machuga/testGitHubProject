package com.java.testgit;

public class Rectangle {
    private int height;
   private int length;
   private static final int DEFAULT_VALUE=1;

   public Rectangle(int height,int length){
       setHeight(height);
       setLength(length);
   }

   public int calculateArea(){
       return height*length;
   }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height<=0){
           this.height=DEFAULT_VALUE;
        }else {
            this.height = height;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<=0){
            this.length=DEFAULT_VALUE;
        }else {
            this.length = length;
        }
    }
}
