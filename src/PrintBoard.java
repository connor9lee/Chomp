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
                    System.out.println("The board is: " + board[0] + " " + board[1] + " " + board[2]);
                    System.out.println("Possible result board(s): ");
                    possibleResult(a,b,c);
                    System.out.println("Best move: (" + "),(" + ")");
                    System.out.println("");

                }
            }
        }
    }
    public void possibleResult (int a, int b, int c) {



        for(int c2 = c-1; c2 >= 0; c2--) {
            int[] board2 = new int[10];
            board2[0] = a;
            board2[1] = b;
            board2[2] = c2;
            System.out.println(a + " " + b + " " + c2);
        }
        for(int b2 = b-1; b2 >= 0; b2--) {
            int[] board3 = new int[10];
            board3[0] = a;
            board3[1] = b2;
            board3[2] = c;
            if (b2 < c){
                System.out.println(a + " " + b2 + " " + b2);
            }
            else {
                System.out.println(a + " " + b2  + " " + c);
            }

        }
        for(int a2 = a-1; a2 >= 1; a2--){
            int[] board2 = new int[10];
            board2[0] = a2;
            board2[1] = b;
            board2[2] = c;
            if (a2 < b && a2 < c ){
                System.out.println(a2 + " " + a2 + " " + a2);
            }
            else if (a2 < b){
                System.out.println(a2 + " " + a2 + " " + c);
            }
            else {
                System.out.println(a2 + " " + b + " " + c);
            }


        }
    }
}
