package ajedrez;

import java.util.Scanner;

public class Ajedrez {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Pieza[][] tablero = new Pieza[8][8];
        boolean blanco = true;
//llenando piezas negras
        tablero[0][0] = new Torre(0, 0, 'T', false);
        tablero[0][1] = new Caballo(0, 1, 'C', false);
        tablero[0][2] = new Alfil(0, 2, 'A', false);
        tablero[0][3] = new Rey(0, 3, 'R', false);
        tablero[0][4] = new Reina(0, 4, 'Q', false);
        tablero[0][5] = new Alfil(0, 5, 'A', false);
        tablero[0][6] = new Caballo(0, 6, 'C', false);
        tablero[0][7] = new Torre(0, 7, 'T', false);
//llenando peones negros
        for (int i = 0; i < tablero[1].length; i++) {
            tablero[1][i] = new Peon(1, i, 'P', false);
        }
//llenando espacios
        for (int i = 2; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = new Pieza(i, j, ' ', false);
            }
        }
//llenando peones blancos
        for (int i = 0; i < tablero[6].length; i++) {
            tablero[6][i] = new Peon(1, i, 'P', true);
        }
//llenando piezas blancas
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
        boolean blancas = true;
        while (estado == true) {
            if (blancas == true) {
                System.out.println("Turno Blancas");
            } else {
                System.out.println("Turno Negras");
            }
            System.out.println("ingrese coordenada en x de la pieza que movera: ");
            int x = read.nextInt();
            System.out.println("ingrese coordenada en y de la pieza que movera: ");
            int y = read.nextInt();
            Pieza seleccionada = tablero[x][y];
            System.out.println(seleccionada.isWhite());
//validar si es blanca o no
            if (blancas == false) {
                while (seleccionada.isWhite()) {
                    System.out.println("Es el turno de las piezas Negras");
                    System.out.println("ingrese coordenada en x de la pieza que movera: ");
                    x = read.nextInt();
                    System.out.println("ingrese coordenada en y de la pieza que movera: ");
                    y = read.nextInt();
                    seleccionada = tablero[x][y];
                }
            } else if (blancas == true) {
                while (!seleccionada.isWhite()) {
                    System.out.println("Es el turno de las piezas Blancas");
                    System.out.println("ingrese coordenada en x de la pieza que movera: ");
                    x = read.nextInt();
                    System.out.println("ingrese coordenada en y de la pieza que movera: ");
                    y = read.nextInt();
                    seleccionada = tablero[x][y];
                }
            }
//fin de validar si es blanca o no
            System.out.println("ingrese coordenada en x de la casilla donde movera: ");
            int x2 = read.nextInt();
            System.out.println("ingrese coordenada en y de la casilla donde movera: ");
            int y2 = read.nextInt();
//inicio validacion movimiento
            if (seleccionada instanceof Torre) {
                while (seleccionada.movimiento(x, y, x2, y2) == false) {
                    System.out.println("el movimiento no es valido");
                    System.out.println("ingrese coordenada en x de la casilla donde movera: ");
                    x2 = read.nextInt();
                    System.out.println("ingrese coordenada en y de la casilla donde movera: ");
                    y2 = read.nextInt();
                }
            } else if (seleccionada instanceof Caballo) {
                while (seleccionada.movimiento(x, y, x2, y2) == false) {
                    System.out.println("el movimiento no es valido");
                    System.out.println("ingrese coordenada en x de la casilla donde movera: ");
                    x2 = read.nextInt();
                    System.out.println("ingrese coordenada en y de la casilla donde movera: ");
                    y2 = read.nextInt();
                }
            } else if (seleccionada instanceof Alfil) {
                while (seleccionada.movimiento(x, y, x2, y2) == false) {
                    System.out.println("el movimiento no es valido");
                    System.out.println("ingrese coordenada en x de la casilla donde movera: ");
                    x2 = read.nextInt();
                    System.out.println("ingrese coordenada en y de la casilla donde movera: ");
                    y2 = read.nextInt();
                }
            } else if (seleccionada instanceof Rey) {
                while (seleccionada.movimiento(x, y, x2, y2) == false) {
                    System.out.println("el movimiento no es valido");
                    System.out.println("ingrese coordenada en x de la casilla donde movera: ");
                    x2 = read.nextInt();
                    System.out.println("ingrese coordenada en y de la casilla donde movera: ");
                    y2 = read.nextInt();
                }
            } else if (seleccionada instanceof Reina) {
                while (seleccionada.movimiento(x, y, x2, y2) == false) {
                    System.out.println("el movimiento no es valido");
                    System.out.println("ingrese coordenada en x de la casilla donde movera: ");
                    x2 = read.nextInt();
                    System.out.println("ingrese coordenada en y de la casilla donde movera: ");
                    y2 = read.nextInt();
                }
            } else if (seleccionada instanceof Peon) {
                while (seleccionada.movimiento(x, y, x2, y2) == false) {
                    System.out.println("el movimiento no es valido");
                    System.out.println("ingrese coordenada en x de la casilla donde movera: ");
                    x2 = read.nextInt();
                    System.out.println("ingrese coordenada en y de la casilla donde movera: ");
                    y2 = read.nextInt();
                }
            }
//fin validacion movimiento
            tablero[x][y] = new Pieza(x, y, ' ', false);
            tablero[x2][y2] = seleccionada;
            Imprimir(tablero, 0, 0);
            if (blancas == true) {
                blancas = false;
            } else {
                blancas = true;
            }
        }
    }
//metodo recursivo
    public static void Imprimir(Pieza[][] matriz, int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            System.out.print("[" + matriz[filas][cols].getLetra() + "]" + "    \n");
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
