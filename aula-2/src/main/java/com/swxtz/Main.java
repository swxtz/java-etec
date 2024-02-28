package com.swxtz;

import com.swxtz.utils.Student;
import com.swxtz.utils.Teacher;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.setName("Lucineia da Silva Bastos");

        Teacher teacher2 = new Teacher();

        teacher2.setName("Jeronimo Alves Correia");

        Student student1 = new Student();

        student1.setAge(18);
        student1.setName("Abigail Damares");

        Student student2 = new Student();
        student2.setAge(19);
        student2.setName("Jorge Jesus");

        System.out.println("-------------------");
        System.out.println("| Sistema Escolar |");
        System.out.println("-------------------");

        System.out.println("===================");

        System.out.println("\n Digite um numero \n");
        System.out.println("1 - Professores");
        System.out.println("2 - Alunos");



        System.out.print("\n\n Teclado: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (Objects.equals(input, "1")) {
            System.out.println("Professores: \n");
            System.out.println(teacher1.getName());
            System.out.println(teacher2.getName());
        }

        if (Objects.equals(input, "2")) {
            System.out.println("Alunos: \n");

            System.out.println("=============");
            System.out.println(student1.getAge());
            System.out.println(student1.getName());
            System.out.println("\n");

            System.out.println("=============");
            System.out.println(student2.getAge());
            System.out.println(student2.getName());
            System.out.println("\n");

        }

    }

}