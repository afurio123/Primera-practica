/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.Primera_practica;
import java.util.Scanner;

/**
 *
 * @author alumne_2n
 */
public class Exercisi4 {

    int numMonth;
    public static final String MSG_1 = "Introdueix un valor";
    Scanner sc = new Scanner(System.in);

    System.out.println (
    "Introdueix un número: ");
numMonth  = sc.nextInt();
    switch (numMonth) {
        case 1 ->
            System.out.println("Gener");
        case 2 ->
            System.out.println("Febrer");
        case 3 ->
            System.out.println("Març");
        case 4 ->
            System.out.println("Abril");
        case 3 ->
            System.out.println("Maig");
        case 3 ->
            System.out.println("Juny");
        case 3 ->
            System.out.println("Juliol");
        case 3 ->
            System.out.println("Agost");

    }
