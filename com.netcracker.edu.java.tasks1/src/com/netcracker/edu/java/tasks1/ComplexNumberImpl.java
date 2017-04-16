/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.edu.java.tasks1;

import static com.sun.org.apache.bcel.internal.Repository.instanceOf;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

/**
 *
 * @author Poly
 */
public class ComplexNumberImpl implements ComplexNumber{
    double Real;
    double Imaginary;

    public ComplexNumberImpl() {
        Real = 0;
        Imaginary = 0;
    }

    public ComplexNumberImpl(double re, double im) {
        Real = re;
        Imaginary = im;
    }
    
    /**
     * @return real part of this complex number
     */
    @Override
    public double getRe(){
        return Real;
    }
    /**
     * @return imaginary part of this complex number
     */
    @Override
    public double getIm(){
        return Imaginary;
    }
    /**
     * @return true if this complex number has real part only (otherwise false)
     */
    @Override
    public boolean isReal(){
        if (Imaginary == 0){
            return true;
        } else{
            return false;
        }
    }
    /**
     * Sets both real and imaginary part of this number.
     * @param re
     * @param im
     */
    @Override
    public void set(double re, double im){
        Real = re;
        Imaginary = im;
    }
    /**
     * Parses the given string value and sets the real and imaginary parts of this number accordingly.<br/>
     * The string format is "re+imi", where re and im are numbers (floating point or integer) and 'i' is a special symbol
     *  denoting imaginary part (if present, it's always the last character in the string).<br/>
     * Both '+' and '-' symbols can be the first characters of re and im; but '*' symbol is NOT allowed.<br/>
     * Correct examples: "-5+2i", 1+i", "+4-i", "i", "-3i", "3". Incorrect examples: "1+2*i", "2+2", "j".<br/>
     * Note: explicit exception generation is an OPTIONAL requirement for this task, 
     *   but NumberFormatException can be thrown by {@link Double#parseDouble(String)}).<br/>
     * Note: it is not reasonable to use regex while implementing this method: the parsing logic is too complicated.
     * @param value
     * @throws NumberFormatException if the given string value is incorrect
     */
    @Override
    public void set(String value) throws NumberFormatException{
        int signBeforeI = value.lastIndexOf((int)('+'));
        if (value.indexOf('i') != -1) {
            if (value.lastIndexOf((int)('-')) > signBeforeI){
                signBeforeI = value.lastIndexOf((int)('-'));
            }
            if (signBeforeI != -1){
                String realStr = value.substring(0, signBeforeI);
                if (realStr.length() != 0){
                    Real =  (double) Double.parseDouble(realStr);
                } else {
                    Real = 0;
                }
                String imaginaryStr = value.substring(signBeforeI, value.length() - 1);
                Imaginary = (double) Double.parseDouble(imaginaryStr);
            } else {
                Real = 0;
                String onlyImaginary;
                onlyImaginary = value.substring(0, value.length() - 1);
                Imaginary = (double) Double.parseDouble(onlyImaginary);
            }
        } else {
            Real = (double) Double.parseDouble(value);
            Imaginary = 0;
        }
    }
    
    
    
    
    
    
    /**
     * Creates and returns a copy of this object: <code>x.copy().equals(x)</code> but <code>x.copy()!=x</code>.
     * @see #clone()
     * @return the copy of this number
     */
    @Override
    public ComplexNumber copy(){
        ComplexNumber A;
        A = (ComplexNumber) new ComplexNumberImpl(Real, Imaginary);
        return A;
    }
    
    /**
     * Creates and returns a copy of this object: the same as {@link #copy()}.<br/>
     * Note: when implemented in your class, this method overrides the {@link Object#clone()} method but changes 
     * the visibility and the return type of the Object's method: the visibility modifier is changed 
     * from protected to public, and the return type is narrowed from Object to ComplexNumber (see also 
     * <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#d5e11368">covariant types example from JLS</a>).
     * @throws java.lang.CloneNotSupportedException
     * @see Object#clone()
     * @return the copy of this number
     */
    @Override
     public ComplexNumber clone() throws CloneNotSupportedException{
        return copy();
    }
    /**
     * Returns a string representation of this number, which must be compatible with {@link #set(String)}:
     * for any ComplexNumber x, the code <code>x.set(x.toString());</code> must not change x.<br/>
     * For example: 12.5-1.0i or 0.0 or 0.3333333333333333i<br/>
     * If the imaginary part of the number is 0, only "re" must be returned (where re is the real part).<br/>
     * If the real part of the number is 0 and the imaginary part is not 0, 
     *  "imi" must be returned (where im is the imaginary part).<br/>
     * Both re and im must be converted to string "as is" - without truncation of last digits, 
     * i.e. the number of characters in their string representation is not limited 
     *   (it is determined by {@link Double#toString(double)}).
     * @see Object#toString()
     */
    @Override
    public String toString(){
        String A;
        if (Imaginary > 0){
            if (Real != 0) {
                A = Double.toString(Real) + "+" + Double.toString(Imaginary) + "i";
            } else {
                A = Double.toString(Imaginary) + "i";
            }
        } else if (Imaginary < 0 ) {
            if (Real != 0) {
                A = Double.toString(Real) + Double.toString(Imaginary) + "i";
            } else {
                A = Double.toString(Imaginary) + "i";
            }
        } else {
            A = Double.toString(Real);
        }
        return A;
    }
    
    /**
     * Checks whether some other object is "equal to" this number.
     * @param other Any implementation of {@link ComplexNumber} interface (it may not be instance of ComplexNumberImpl!)
     * @return 
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object other){
        if (other instanceof ComplexNumber) {
            if  ((((ComplexNumber)other).getRe() == Real) && (((ComplexNumber)other).getIm() == Imaginary)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    /**
     * Compares this number with the other number by the absolute values of the numbers: 
     * x < y if and only if |x| < |y| where |x| denotes absolute value (modulus) of x.<br/>
     * Can also compare the square of the absolute value which is defined as the sum 
     * of the real part squared and the imaginary part squared: |re+imi|^2 = re^2 + im^2.
     * @see Comparable#compareTo(Object)
     * @param other the object to be compared with this object.
     * @return a negative integer, zero, or a positive integer as this object
     *   is less than, equal to, or greater than the given object.
     */
    @Override
    public int compareTo(ComplexNumber other){
        if (Real*Real + Imaginary * Imaginary > other.getRe() * other.getRe() + other.getIm() * other.getIm()) {
            return 1;
        } else if (Real*Real + Imaginary * Imaginary == other.getRe() * other.getRe() + other.getIm() * other.getIm()){
            return 0;
        } else {
            return -1;
        }
    }
    /**
     * Sorts the given array in ascending order according to the comparison rule defined in 
     *   {@link #compareTo(ComplexNumber)}.<br/>
     * It's strongly recommended to use {@link Arrays} utility class here
     *   (and do not transform the given array to a double[] array).<br/>
     * Note: this method could be static: it does not use this instance of the ComplexNumber.
     *    Nevertheless, it is not static because static methods can't be overridden.
     * @param array an array to sort
     */
    @Override
    public void sort(ComplexNumber[] array){
        ComplexNumber t = (ComplexNumber) new ComplexNumberImpl();
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1; j++){
                if (array[j].compareTo(array[j + 1]) > 0) {
                    t = array[j].copy();
                    array[j] = array[j + 1].copy();
                    array[j + 1] = t.copy();
                }
            }
        }
    }
    
    /**
     * Changes the sign of this number. Both real and imaginary parts change their sign here.
     * @return this number (the result of negation)
     */
    @Override
    public ComplexNumber negate() {
        double re;
        if (Real != 0) {
            re = -Real;
        } else {
            re = 0;
        }
        double im;
        if (Imaginary != 0){
            im = -Imaginary;
        } else {
            im = 0;
        }
        Real = re;
        Imaginary = im;
        return this;
    }
    
    /**
     * Adds the given complex number arg2 to this number. Both real and imaginary parts are added.
     * @param arg2 the second operand of the operation
     * @return this number (the sum)
     */
    @Override
    public ComplexNumber add(ComplexNumber arg2){
        Real = Real + arg2.getRe();
        Imaginary = Imaginary + arg2.getIm();
        return this;
    }
    /**
     * Multiplies this number by the given complex number arg2. If this number is a+bi and arg2 is c+di then
     * the result of their multiplication is (a*c-b*d)+(b*c+a*d)i<br/>
     * The method should work correctly even if arg2==this. 
     * @param arg2 the second operand of the operation
     * @return this number (the result of multiplication)
     */
    @Override
    public ComplexNumber multiply(ComplexNumber arg2){
        double re = Real * arg2.getRe() - Imaginary * arg2.getIm();
        double im = Real * arg2.getIm() + Imaginary * arg2.getRe();
        Real = re;
        Imaginary = im;
        return this;
    }
}
/*Test Maths (add); Mark=0; Status: Failed
Test Maths (multiply, negate); Mark=0; Status: Failed
Test Maths (all operations); Mark=0; Status: Failed
Test equals; Mark=0; Status: Failed
*/