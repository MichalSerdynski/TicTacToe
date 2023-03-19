import java.util.Scanner;

public class GameBoard {

    static char[][] gameBoard = new char[3][7];

    public GameBoard() {

    }

    public void xToPlay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("X to play, choose number 1-9 to place your symbol");
        int choice = scan.nextInt();

        switch (choice) {

            case 1:
                gameBoard[0][1] = 'X';
                break;
            case 2:
                gameBoard[0][3] = 'X';
                break;
            case 3:
                gameBoard[0][5] = 'X';
                break;
            case 4:
                gameBoard[1][1] = 'X';
                break;
            case 5:
                gameBoard[1][3] = 'X';
                break;
            case 6:
                gameBoard[1][5] = 'X';
                break;
            case 7:
                gameBoard[2][1] = 'X';
                break;
            case 8:
                gameBoard[2][3] = 'X';
                break;
            case 9:
                gameBoard[2][5] = 'X';
                break;
            default:
                break;
        }
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.println(gameBoard[i]);
        }
    }

    public void oToPlay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("O to play, choose number 1-9 to place your symbol");
        int choice = scan.nextInt();

        switch (choice) {

            case 1:
                gameBoard[0][1] = 'O';
                break;
            case 2:
                gameBoard[0][3] = 'O';
                break;
            case 3:
                gameBoard[0][5] = 'O';
                break;
            case 4:
                gameBoard[1][1] = 'O';
                break;
            case 5:
                gameBoard[1][3] = 'O';
                break;
            case 6:
                gameBoard[1][5] = 'O';
                break;
            case 7:
                gameBoard[2][1] = 'O';
                break;
            case 8:
                gameBoard[2][3] = 'O';
                break;
            case 9:
                gameBoard[2][5] = 'O';
                break;
            default:
                break;
        }
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.println(gameBoard[i]);
        }
    }

    public boolean xWon() {
        if (gameBoard[0][1] == 'X' && gameBoard[0][3] == 'X' && gameBoard[0][5] == 'X') {
            return true;
        } else if (gameBoard[1][0] == 'X' && gameBoard[1][3] == 'X' && gameBoard[1][5] == 'X') {
            return true;
        } else if (gameBoard[2][1] == 'X' && gameBoard[2][3] == 'X' && gameBoard[2][5] == 'X') {
            return true;
        }else if (gameBoard[0][1] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][1] == 'X') {
            return true;
        }else if (gameBoard[0][3] == 'X' && gameBoard[1][3] == 'X' && gameBoard[2][3] == 'X') {
            return true;
        }else if (gameBoard[0][5] == 'X' && gameBoard[1][5] == 'X' && gameBoard[2][5] == 'X') {
            return true;
        }else if (gameBoard[0][1] == 'X' && gameBoard[1][3] == 'X' && gameBoard[2][5] == 'X') {
                return true;
        }else if (gameBoard[0][5] == 'X' && gameBoard[1][3] == 'X' && gameBoard[2][1] == 'X') {
            return true;
        } else {
            return false;
        }
    }

    public boolean oWon() {
        if (gameBoard[0][1] == 'O' && gameBoard[0][3] == 'O' && gameBoard[0][5] == 'O') {
            return true;
        } else if (gameBoard[1][0] == 'O' && gameBoard[1][3] == 'O' && gameBoard[1][5] == 'O') {
            return true;
        } else if (gameBoard[2][1] == 'O' && gameBoard[2][3] == 'O' && gameBoard[2][5] == 'O') {
            return true;
        }else if (gameBoard[0][1] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][1] == 'O') {
            return true;
        }else if (gameBoard[0][3] == 'O' && gameBoard[1][3] == 'O' && gameBoard[2][3] == 'O') {
            return true;
        }else if (gameBoard[0][5] == 'O' && gameBoard[1][5] == 'O' && gameBoard[2][5] == 'O') {
            return true;
        }else if (gameBoard[0][1] == 'O' && gameBoard[1][3] == 'O' && gameBoard[3][5] == 'O') {
            return true;
        }else if (gameBoard[0][5] == 'O' && gameBoard[1][3] == 'O' && gameBoard[2][1] == 'O') {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {


        gameBoard[0][0] = '|';
        gameBoard[0][1] = '1';
        gameBoard[0][2] = '|';
        gameBoard[0][3] = '2';
        gameBoard[0][4] = '|';
        gameBoard[0][5] = '3';
        gameBoard[0][6] = '|';
        gameBoard[1][0] = '|';
        gameBoard[1][1] = '4';
        gameBoard[1][2] = '|';
        gameBoard[1][3] = '5';
        gameBoard[1][4] = '|';
        gameBoard[1][5] = '6';
        gameBoard[1][6] = '|';
        gameBoard[2][0] = '|';
        gameBoard[2][1] = '7';
        gameBoard[2][2] = '|';
        gameBoard[2][3] = '8';
        gameBoard[2][4] = '|';
        gameBoard[2][5] = '9';
        gameBoard[2][6] = '|';

        boolean stillPlaying = true;
        while(stillPlaying) {
            stillPlaying = false;
            System.out.println("Local Game");
            for (int i = 0; i < gameBoard.length; i++) {
                System.out.println(gameBoard[i]);
            }

            GameBoard gameBoard1 = new GameBoard();
            int moves = 0;
            boolean gameDone;
            boolean xTurn = true;
            while (true) {
                if (xTurn) {
                    gameBoard1.xToPlay();
                    gameBoard1.xWon();
                    gameDone = gameBoard1.xWon();
                    if (gameDone) {
                        System.out.println("X WON! CONGRATULATIONS!");
                        break;
                    } else if (moves == 8) {
                        System.out.println("It is a tie.");
                        break;
                    } else {
                        xTurn = false;
                    }
                } else {
                    gameBoard1.oToPlay();
                    gameBoard1.oWon();
                    gameDone = gameBoard1.oWon();
                    if (gameDone) {
                        System.out.println("O WON! CONGRATULATIONS!");
                        break;
                    } else if (moves == 8) {
                        System.out.println("It is a tie.");
                        break;
                    } else {
                        xTurn = true;
                    }


                }
                moves++;
            }

        }
    }
    }

