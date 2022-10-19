public class PrintBoard {
    public static void main(String[] args) {
        PrintBoard myBoard = new PrintBoard();
        myBoard.Board();


    }

    public void Board() {
        for (int a = 1; a <= 3; a++) {
            for (int b = 0; b <= a; b++) {
                for (int c = 0; c <= b; c++) {
                    int[] board = new int[10];
                    board[0] = a;
                    board[1] = b;
                    board[2] = c;
                    //System.out.println(board[0] + ", " + board[1] + ", " + board[2]);
                    System.out.println("board: " + board[0] + ", " + board[1] + ", " + board[2] + "; possible result board(s): " + "; best move: (" + "),(" + ")");
                    possibleResult(a,b,c);

                }
            }
        }
    }
    public void possibleResult (int a, int b, int c) {
        for(int c2 = c; c2 <= b; c2--) {
            int[] board2 = new int[10];
            board2[0] = a;
            board2[1] = b;
            board2[3] = c2;
            System.out.println(a + ", " + b + ", " + c2);
        }
        for(int b2 = b; b2 <= a; b2--) {
            int[] board3 = new int[10];
            board3[0] = a;
            board3[1] = b2;
            board3[3] = 2;
            System.out.println(a + ", " + b + ", " + c2);
            }
        for(int a2 = a; a2 <= 3; a2--){
            int[] board2 = new int[10];
            board2[0] = a;
            board2[1] = b;
            board2[3] = c2;
            System.out.println(a + ", " + b + ", " + c2);
                }
            }
        }
    }
    //System.out.println("a b c represents columns.");
    //System.out.println("The possible combinations for a 3x3 are:");
    //System.out.println("3 3 3, 3 3 2, 3 3 1, 3 2 2, 3 2 1, 3 1 1, 3 1 0, 3 3 0, 3 2 0, 3 0 0, ");
    //System.out.println("2 2 2, 2 2 1, 2 2 0, 2 1 1, 2 1 0, 2 0 0,");
    //System.out.println(" 1 1 1, 1 1 0, 1 0 0");
}
