/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ncedu.java.tasks;

/**
 *
 * @author Poly
 */
public class ControlFlowStatements3Impl implements ControlFlowStatements3{
   /**
	 * Для данного вещественного x найти значение следующей функции f, принимающей значения
	 * вещественного типа:<br/>
	 * <pre>
	 *        | -x, если x<=0, 
	 *  f(x)= | x^2, если 0<x<2, 
	 *        | 4, если x>=2.
	 * </pre>
	 * (x^2 - это x в квадрате)
	 * @return значение f.
	 */
        @Override
	public double getFunctionValue(double x){
            double f;
            if (x <= 0){
                f = -x;
            } else if (x < 2){
                f = x * x;
            } else {
                f = 4;
            }
            return f;
        }
        /**
	 * Дано целое число в диапазоне 1–7.
	 * Вернуть строку — название дня недели, соответствующее этому числу:<br/>
	 * Дан номер месяца monthNumber — целое число в диапазоне 1–12 (1 — January, 2 — February и т.д.).
	 * Вернуть название соответствующего времени года ("Winter", "Spring", "Summer", "Autumn")
	 *  или строку "Error", если monthNumber не лежит в диапазоне 1–12.
	 * @param monthNumber
	 * @return строковое представление monthNumber
	 */
        @Override
	public String decodeSeason(int monthNumber){
            String s;
            switch(monthNumber){
                case 1:
                    s = "Winter";
                    break;
                case 2:
                    s = "Winter";
                    break;
                case 3:
                    s = "Spring";
                    break;
                case 4:
                    s = "Spring";
                    break;
                case 5:
                    s = "Spring";
                    break;
                case 6:
                    s = "Summer";
                    break;
                case 7:
                    s = "Summer";
                    break;
                case 8:
                    s = "Summer";
                    break;
                case 9:
                    s = "Autumn";
                    break;
                case 10:
                    s = "Autumn";
                    break;
                case 11:
                    s = "Autumn";
                    break;
                case 12:
                    s = "Winter";
                    break;
                default:
                    s = "0";
                    break;
            }
            return s;
        }
        /**
	 * Создать двумерный массив, содержащий 8x5 целочисленных элементов, 
	 * и присвоить каждому элементу следующее значение, зависящее от его индексов: 
	 * array[i][j] = модуль разности i и j, возведенный в пятую степень. 
	 * Для возведения в степень рекомендуется использовать статический метод класса {@link Math}.
	 * @return массив.
	 */
        @Override
	public long[][] initArray(){
            long arr [][] = new long[8][5];
            for (int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = (long) Math.pow(Math.abs(i - j), 5);
                }
            }
            return arr;
        }
        /**
	* Определить индекс строки двумерного массива с наибольшим по модулю произведением элементов. 
	* Строкой считается подмассив с заданный первым индексом i: row = array[i].
	* @param array Массив, первый индекс которого соответствует строкам таблицы, второй - столбцам.
	* @return индекс строки массива array
	*/
        @Override
	public int getMaxProductIndex(long[][] array){
            long max = 0;
            int maxNum = 0;
            long mult;
            for (int i = 0; i < array.length; i++){
                mult = 1;
                for (int j = 0; j < array[i].length; j++){
                    mult = mult * array[i][j];
                }
                if (mult > max){
                    max = mult;
                    maxNum = i;
                }
            }
            return maxNum;
        }
        /**
	 * Даны положительные числа A и B (A>=B). На отрезке длины A размещено
	 * максимально возможное количество отрезков длины B (без наложений). 
	 * Не используя операции умножения и деления, найти длину незанятой части отрезка A.
	 * @param A длина большого отрезка (А)
	 * @param B длина отрезков, размещаемых на отрезке А
	 * @return длина незанятой части отрезка A (больше или равна 0)
	 */
		
        @Override
	public float calculateLineSegment(float A, float B){
            float R;
            R = A;
            while (R >= B){
                R = R - B;
            }
            return R;
        }
}
