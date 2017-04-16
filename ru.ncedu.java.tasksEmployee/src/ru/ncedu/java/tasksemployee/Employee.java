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
public interface Employee {
	/**
	 * @return Зарплата сотрудника на настоящий момент.
	 */
	int getSalary();

	/**
	 * Увеличивает зарплату сотрудника на заданное значение
	 * @param value Значение, на которое нужно увеличить
	 */
	public void increaseSalary(int value);

	/**
	 * @return Имя сотрудника
	 */
	public String getFirstName();

	/**
	 * Устанавливает имя сотрудника
	 * @param firstName Новое имя
	 */
	public void setFirstName(String firstName);

        /**
	 * @return Фамилия сотрудника
	 */
	public String getLastName();

	/**
	 * Устанавливает фамилию сотрудника
	 * @param lastName Новая фамилия
	 */
	public void setLastName(String lastName);

	/**
	 * @return Имя и затем фамилия сотрудника, разделенные символом " " (пробел)
	 */
	public String getFullName();

	/**
	 * Устанавливает Менеджера сотрудника.
	 * @param manager Сотрудник, являющийся менеджером данного сотрудника. 
	 * НЕ следует предполагать, что менеджер является экземпляром класса EmployeeImpl.
	 */
	public void setManager(Employee manager);

	/**
	 * @return Имя и фамилия Менеджера, разделенные символом " " (пробел).
	 * Если Менеджер не задан, возвращает строку "No manager".
	 */
	public String getManagerName();

	/**
	 * Возвращает Менеджера верхнего уровня, т.е. вершину иерархии сотрудников, 
	 *   в которую входит данный сотрудник.
	 * Если над данным сотрудником нет ни одного менеджера, возвращает данного сотрудника.
            * Замечание: поскольку менеджер, установленный методом {@link #setManager(Employee)},
            *   может быть экзепляром другого класса, при поиске топ-менеджера нельзя обращаться
            *   к полям класса EmployeeImpl. Более того, поскольку в интерфейсе Employee не объявлено
	 *   метода getManager(), поиск топ-менеджера невозможно организовать в виде цикла.
	 *   Вместо этого нужно использовать рекурсию (и это "более объектно-ориентированно").
	 */
	public Employee getTopManager();
}