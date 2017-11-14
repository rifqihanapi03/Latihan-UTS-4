/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116470_latihanUTS4;

/**
 *
 * @author fataelislami
 */
public class ModelSystemAnalyst extends ModelEmployee {

    int bonus;

    public void bonusSystemAnalyst() {
        salary = 40000;
        bonus = 90000;
        System.out.println("Salary Employee System Analyst  : " + salary);
        System.out.println("Bonus System Analyst            : " + bonus);

    }

}
