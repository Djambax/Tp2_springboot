package fr.devavance.tp_spring_boot_partie2.controllers;

import ch.qos.logback.core.model.Model;
import fr.devavance.tp_spring_boot_partie2.beans.Employee;

public interface IEmployeeController
{
    public String displayHome(Model model);
    public String addEmployee(Employee employee);
}
