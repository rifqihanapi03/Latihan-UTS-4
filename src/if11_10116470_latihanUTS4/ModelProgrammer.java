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
public class ModelProgrammer extends ModelEmployee {

    int bonus;

    public void bonusProgrammer() {
        salary = 40000;
        bonus = 60000;
        System.out.println("Salary Employee Programmer      : " + salary);
        System.out.println("Bonus Programmer                : " + bonus);
    }
}
