package ru.ncedu.java.tasks1;
import java.io.PrintStream;
public class ArrayVectorImpl implements ArrayVector {
    double []array;
    public ArrayVectorImpl(double[] array){
        this.array = array;
    }
    public ArrayVectorImpl() {
        double [] arr = new double[10];
        array = arr;
    }
    @Override
    public void set(double... elements) {
        for(int i = 0; i < elements.length; i++){
            array[i] = elements[i];
        }
    }
    @Override
    public double[] get(){
        return array;
    }
    @Override
    public ArrayVector clone(){
        ArrayVector A = new ArrayVectorImpl(this.array);
        return A;
    }
    @Override
    public int getSize(){
        return this.array.length;
    }
    @Override
    public void set(int index, double value){
        if (index >= 0) {
                array[index] = value;
        }
    }
    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException{
        double c = 0;
        try {
            c = array[index];
        } 
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        return c;
    }
    @Override
    public double getMax(){
        double max = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    @Override
    public double getMin(){
        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    @Override
    public void sortAscending(){
        double t;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] > array[j + 1]){
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }
    @Override
    public void mult(double factor){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * factor;
        }
    }
    @Override
    public ArrayVector sum(ArrayVector anotherVector){
        for(int i = 0; i < Math.min(array.length, anotherVector.getSize()); i++){
            array[i] = array[i] + anotherVector.get(i);
        }
        return this;
    }
    @Override
    public double scalarMult(ArrayVector anotherVector){
        double c = 0;
        for (int i = 0; i < Math.min(array.length, anotherVector.getSize()); i++){
            c = c + array[i] * anotherVector.get(i);
        }
        return c;
    }
    @Override
    public double getNorm(){
        return Math.sqrt(this.scalarMult(this));
    }
}
