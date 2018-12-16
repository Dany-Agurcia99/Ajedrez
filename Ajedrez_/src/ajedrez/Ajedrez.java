package ajedrez;

import java.util.Scanner;

public class Ajedrez {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Pieza[][] tablero = new Pieza[8][8];
        boolean blanco = true;
        tablero[0][0] = new Torre(0, 0, 'T', false);
        tablero[0][1] = new Caballo(0, 1, 'C', false);
        tablero[0][2] = new Alfil(0, 2, 'A', false);
        tablero[0][3] = new Rey(0, 3, 'R', false);
        tablero[0][4] = new Reina(0, 4, 'Q', false);
        tablero[0][5] = new Alfil(0, 5, 'A', false);
        tablero[0][6] = new Caballo(0, 6, 'C', false);
        tablero[0][7] = new Torre(0, 7, 'T', false);
        for (int i = 0; i < tablero[1].length; i++) {
            tablero[1][i] = new Peon(1, i, 'P', false);
        }
        for (int i = 2; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = new Pieza(i, j, ' ', false);
            }
        }
        for (int i = 0; i < tablero[6].length; i++) {
            tablero[6][i] = new Peon(1, i, 'P', true);
        }
        tablero[7][0] = new Torre(7, 0, 'T', true);
        tablero[7][1] = new Caballo(7, 1, 'C', true);
        tablero[7][2] = new Alfil(7, 2, 'A', true);
        tablero[7][3] = new Rey(7, 3, 'R', true);
        tablero[7][4] = new Reina(7, 4, 'Q', true);
        tablero[7][5] = new Alfil(7, 5, 'A', true);
        tablero[7][6] = new Caballo(7, 6, 'C', true);
        tablero[7][7] = new Torre(7, 7, 'T', true);
        Imprimir(tablero, 0, 0);
        boolean estado = true;
        while (estado == true) {
            System.out.println("ingrese coordenada en x de la pieza que movera: ");
            int x = read.nextInt();
            System.out.println("ingrese coordenada en y de la pieza que movera: ");
            int y = read.nextInt();
            System.out.println("ingrese coordenada en x de la casilla donde movera: ");
            int x2 = read.nextInt();
            System.out.println("ingrese coordenada en y de la casilla donde movera: ");
            int y2 = read.nextInt();
            
        }
    }

    public static void Imprimir(Pieza[][] matriz, int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            System.out.print("[" + matriz[filas][cols].getLetra() + "]" + "   ");
        } else {
            if (cols == matriz[0].length - 1) {
                System.out.println("[" + matriz[filas][cols].getLetra() + "]");
                Imprimir(matriz, filas + 1, 0);
            } else {
                System.out.print("[" + matriz[filas][cols].getLetra() + "]" + "   ");
                Imprimir(matriz, filas, cols + 1);
            }
        }
    }
}
