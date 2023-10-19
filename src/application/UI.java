package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print(8 - i + " "); // Imprime os números das linhas reversos
            for (int j = 0; j < pieces[i].length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println(); // Adicione uma quebra de linha no final de cada linha de peças
        }

        System.out.println("  a b c d e f g h"); // Imprime as letras das colunas
    }

    public static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("- "); // Adicione um espaço para separar as peças
        } else {
            System.out.print(piece + " "); // Adicione um espaço para separar as peças
        }
    }
}
