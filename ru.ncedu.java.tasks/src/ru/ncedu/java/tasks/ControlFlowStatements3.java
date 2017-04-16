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

/**
 * ЦЕЛЬ ЗАДАЧИ - научиться использовать управляющие конструкции <code>if, case, for, while</code> в Java.<br/>
 * Дополнительно: разобраться с простыми типами и массивами, а также вызовом методов класса {@link Math}.<br/>
 * <p/>
 * ЗАДАНИЕ<br/>
 * <dl>
 * <dt>Оператор if</dt>
 * <dd>Применить ту или иную формулу в зависимости от условия. </dd>
 * <dt>Оператор case</dt>
 * <dd>Вывести строковое значение в зависимости от целочисленного значения.</dd>
 * <dt>Оператор for</dt>
 * <dd>Заполнить и обработать двумерный массив. </dd>
 * <dt>Оператор while</dt>
 * <dd>Рассчитать остаточную длину отрезка в цикле. </dd>
 * <p/>
 * ПРИМЕЧАНИЯ<br/>
 * Задачу можно решать без явной обработки и генерации исключительных ситуаций (Exceptions).<br/>
 * Вот как должна выглядеть реализация данного интерфейса:<br/>
 * <code>
 * public class ControlFlowStatements3Impl implements ControlFlowStatements3 {  }
 * </code>
 * <p/>
 * Метод main не тестируется, но для себя в main вы можете проверить, что возвращают ваши методы, например: 
 * <code>
 * ControlFlowStatements3 object = new ControlFlowStatements3Impl();
 * System.out.println(object.decodeSeason(2));
 * </code>
 * 
 *  @author Elena Protsenko
 *  @author Alexey Evdokimov
 */
public interface ControlFlowStatements3{
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
	public double getFunctionValue(double x);
	/**
	 * Дано целое число в диапазоне 1–7.
	 * Вернуть строку — название дня недели, соответствующее этому числу:<br/>
	 * Дан номер месяца monthNumber — целое число в диапазоне 1–12 (1 — January, 2 — February и т.д.).
	 * Вернуть название соответствующего времени года ("Winter", "Spring", "Summer", "Autumn")
	 *  или строку "Error", если monthNumber не лежит в диапазоне 1–12.
	 * @param monthNumber
	 * @return строковое представление monthNumber
	 */
	public String decodeSeason(int monthNumber);
	/**
	 * Создать двумерный массив, содержащий 8x5 целочисленных элементов, 
	 * и присвоить каждому элементу следующее значение, зависящее от его индексов: 
	 * array[i][j] = модуль разности i и j, возведенный в пятую степень. 
	 * Для возведения в степень рекомендуется использовать статический метод класса {@link Math}.
	 * @return массив.
	 */
	long[][] initArray();
	/**
	* Определить индекс строки двумерного массива с наибольшим по модулю произведением элементов. 
	* Строкой считается подмассив с заданный первым индексом i: row = array[i].
	* @param array Массив, первый индекс которого соответствует строкам таблицы, второй - столбцам.
	* @return индекс строки массива array
	*/
	int getMaxProductIndex(long[][] array);
		
	/**
	 * Даны положительные числа A и B (A>=B). На отрезке длины A размещено
	 * максимально возможное количество отрезков длины B (без наложений). 
	 * Не используя операции умножения и деления, найти длину незанятой части отрезка A.
	 * @param A длина большого отрезка (А)
	 * @param B длина отрезков, размещаемых на отрезке А
	 * @return длина незанятой части отрезка A (больше или равна 0)
	 */
		
	public float calculateLineSegment(float A, float B);
}	

