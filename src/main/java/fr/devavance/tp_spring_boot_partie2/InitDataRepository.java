package fr.devavance.tp_spring_boot_partie2;

import fr.devavance.tp_spring_boot_partie2.beans.Employee;
import fr.devavance.tp_spring_boot_partie2.beans.Fonction;
import fr.devavance.tp_spring_boot_partie2.dao.IEmployeeRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDataRepository implements CommandLineRunner {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Employee> employees = Arrays.asList(
                new Employee(1L,"Karim Mahmoud", "kmshawky20@gmail.com", "0097450413948", "Egypt", Fonction.DEV_WEB),
                new Employee(2L,"Fran Wilson", "franwilson@mail.com", "(204) 619-5731", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_OPS),
                new Employee(3L,"Maria Anders", "mariaanders@mail.com", "(503) 555-9931", "25, rue Lauriston, Paris, France", Fonction.CHEF_PROJET),
                new Employee(4L,"Thomas Hardy", "thomashardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_AI),
                new Employee(5L,"Ahmed Omar", "amhedoomar@gmail.com", "0096650413948", "KSA", Fonction.SOFTWARE_ARCHITECT),
                new Employee(6L,"Idam Wilson", "idamwilson@mail.com", "(204) 619-5331", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_AI),
                new Employee(7L,"Peter Perrier", "peterperrier@mail.com", "(313) 555-5735", "Obere Str. 57, Berlin, Germany", Fonction.DEV_WEB),
                new Employee(8L,"Mark Hardy", "markshardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_OPS)
        );

        // Sauvegarde de tous les employés dans la base de données en une seule opération
        employeeRepository.saveAll(employees);
    }
}
