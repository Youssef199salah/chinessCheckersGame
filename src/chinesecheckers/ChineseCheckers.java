/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinesecheckers;

/**
 *
 * @author a
 */
import java.rmi.Remote;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

class ChineseCheckers {
    private String[][] board;
   private int difficulty; 
    public ChineseCheckers() {
        difficulty=3;
        board = new String[17][25];

        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 25; j++) {
                board[i][j] = " ";
            }
        }
        board[0][12] = "X";
        board[1][11] = "X";
        board[1][13] = "X";
        board[2][10] = "X";
        board[2][12] = "X";
        board[2][14] = "X";
        board[3][9] = "X";
        board[3][11] = "X";
        board[3][13] = "X";
        board[3][15] = "X";

        board[4][18] = "*";
        board[4][20] = "*";
        board[4][22] = "*";
        board[4][24] = "*";
        board[5][19] = "*";
        board[5][21] = "*";
        board[5][23] = "*";
        board[6][20] = "*";
        board[6][22] = "*";
        board[7][21] = "*";

        board[9][21] = "*";
        board[10][20] = "*";
        board[10][22] = "*";
        board[11][19] = "*";
        board[11][21] = "*";
        board[11][23] = "*";
        board[12][18] = "*";
        board[12][20] = "*";
        board[12][22] = "*";
        board[12][24] = "*";

        board[13][9] = "0";
        board[13][11] = "0";
        board[13][13] = "0";
        board[13][15] = "0";
        board[14][10] = "0";
        board[14][12] = "0";
        board[14][14] = "0";
        board[15][11] = "0";
        board[15][13] = "0";
        board[16][12] = "0";

        board[9][21 - 18] = "*";
        board[10][20 - 18] = "*";
        board[10][22 - 18] = "*";
        board[11][19 - 18] = "*";
        board[11][21 - 18] = "*";
        board[11][23 - 18] = "*";
        board[12][18 - 18] = "*";
        board[12][20 - 18] = "*";
        board[12][22 - 18] = "*";
        board[12][24 - 18] = "*";

        board[4][18 - 18] = "*";
        board[4][20 - 18] = "*";
        board[4][22 - 18] = "*";
        board[4][24 - 18] = "*";
        board[5][19 - 18] = "*";
        board[5][21 - 18] = "*";
        board[5][23 - 18] = "*";
        board[6][20 - 18] = "*";
        board[6][22 - 18] = "*";
        board[7][21 - 18] = "*";

        board[4][8] = "*";
        board[4][10] = "*";
        board[4][12] = "*";
        board[4][14] = "*";
        board[4][16] = "*";
        board[5][7] = "*";
        board[5][9] = "*";
        board[5][11] = "*";
        board[5][13] = "*";
        board[5][15] = "*";
        board[5][17] = "*";

        board[6][6] = "*";
        board[6][8] = "*";
        board[6][10] = "*";
        board[6][12] = "*";
        board[6][14] = "*";
        board[6][16] = "*";
        board[6][18] = "*";

        board[7][5] = "*";
        board[7][7] = "*";
        board[7][9] = "*";
        board[7][11] = "*";
        board[7][13] = "*";
        board[7][15] = "*";
        board[7][17] = "*";
        board[7][19] = "*";

        board[7][5] = "*";
        board[7][7] = "*";
        board[7][9] = "*";
        board[7][11] = "*";
        board[7][13] = "*";
        board[7][15] = "*";
        board[7][17] = "*";
        board[7][19] = "*";

        board[8][4] = "*";
        board[8][6] = "*";
        board[8][8] = "*";
        board[8][10] = "*";
        board[8][12] = "*";
        board[8][14] = "*";
        board[8][16] = "*";
        board[8][18] = "*";
        board[8][20] = "*";

        board[9][5] = "*";
        board[9][7] = "*";
        board[9][9] = "*";
        board[9][11] = "*";
        board[9][13] = "*";
        board[9][15] = "*";
        board[9][17] = "*";
        board[9][19] = "*";

        board[10][6] = "*";
        board[10][8] = "*";
        board[10][10] = "*";
        board[10][12] = "*";
        board[10][14] = "*";
        board[10][16] = "*";
        board[10][18] = "*";

        board[11][7] = "*";
        board[11][9] = "*";
        board[11][11] = "*";
        board[11][13] = "*";
        board[11][15] = "*";
        board[11][17] = "*";

        board[12][8] = "*";
        board[12][10] = "*";
        board[12][12] = "*";
        board[12][14] = "*";
        board[12][16] = "*";
    }
    
    public void set_difficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    public int get_difficulty() {
        return difficulty;
    }

public void check_win(){
    
    if( board[13][9] == "X"&&
     board[13][11] == "X"
     &&board[13][13] == "X"
     &&board[13][15] == "X"
     &&board[14][10] == "X"
     &&board[14][12] == "X"
     &&board[14][14] == "X"
     &&board[15][11] == "X"
     &&board[15][13] == "X"
     &&board[16][12] == "X"){
        System.out.println("PC  wins!");
        System.exit(0);
    }
    if(
        board[0][12] == "0"&&
        board[1][11] == "0"&&
        board[1][13] == "0"&&
        board[2][10] == "0"&&
        board[2][12] == "0"&&
        board[2][14] == "0"&&
        board[3][9] ==  "0"&&
        board[3][11] == "0"&&
        board[3][13] == "0"&&
        board[3][15] == "0"
    ){
        System.out.println("Player 1 wins!");
        System.exit(0);
    }
}

    public void draw_board() {
        System.out.println("   00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24");
        for (int i = 0; i < 17; i++) {
            if (i < 10) {
                System.out.print("0" + i + "  ");
            } else {
                System.out.print(i + "  ");
            }
            for (int j = 0; j < 25; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j] + "  ");
                }

            }
            System.out.println();
        }
        System.out.println("   00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24");
    }

    public void move() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the coordinates of the piece you want to move");
        System.out.println("Enter the row number");
        int row = input.nextInt();
        System.out.println("Enter the column number");
        int col = input.nextInt();
        if(row >-1 && row<17 && col>-1 && col<25){
            if (board[row][col] == "*") {
                System.out.println("You cannot move a piece that is X or 0");
                draw_board();
                move();
            }
        }else{
            System.out.println("You entered an invalid coordinate");
            draw_board();
            move();
        }
        System.out.println("-----------------------------------------------------");
        ArrayList<ArrayList<Integer>> all_moves = get_all_possible_moves(row, col);
        System.out.println("The possible moves are:");
        for (int i = 0; i < all_moves.size(); i++) {
            System.out.println(all_moves.get(i).get(0) + " " + all_moves.get(i).get(1));

        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Enter the row number you want to move to");
        int row_move = input.nextInt();
        System.out.println("Enter the column number you want to move to");
        int col_move = input.nextInt();
       if(row_move>-1&&row_move<17&&col_move>-1&&col_move<25){
        if (board[row_move][col_move] == "X" || board[row_move][col_move] == "0") {
            System.out.println("You cannot move to a spot that is X or 0");
            draw_board();
            move();
        }
       }else{
        System.out.println("You entered an invalid coordinate");
        draw_board();
        move();
    }
        ArrayList<Integer> move_to = new ArrayList<Integer>(Arrays.asList(row_move, col_move));
        if (all_moves.contains(move_to)) {
            if (board[row][col] == "0") {
                board[row][col] = "*";
                board[row_move][col_move] = "0";
            } else if (board[row][col] == "X") {
                board[row][col] = "*";
                board[row_move][col_move] = "X";

            }
            check_win();
        } else {
            System.out.println("You cannot move there");
        }
        play_pc();
        draw_board();
        check_win();
        move();
    }

  
    public ArrayList<ArrayList<Integer>> get_all_possible_moves(int row, int col) {
        ArrayList<ArrayList<Integer>> all_moves = new ArrayList<>();
        ArrayList<ArrayList<Integer>> normal_moves = check_move(row, col);
        ArrayList<ArrayList<Integer>> jump_moves = check_jump(row, col);
        all_moves.addAll(normal_moves);
        all_moves.addAll(jump_moves);
        
        return all_moves;

    }

    public ArrayList<ArrayList<Integer>> check_move(int row, int col) {
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        if ((row >-1 && row<17 && col>-1 && col<25)&&(board[row][col] == "X" || board[row][col] == "0")) {
            
            if (((row - 1 > -1 && row - 1 < 17) && (col - 1 > -1 && col - 1 < 25)) && board[row - 1][col - 1] == "*") {
                int row_move = row - 1;
                int col_move = col - 1;
                x.add(new ArrayList<Integer>(Arrays.asList(row_move, col_move)));
            }

            if (((row - 1 > -1 && row - 1 < 17) && (col - 1 > -1 && col + 1 < 25)) && board[row - 1][col + 1] == "*") {
                int row_move = row - 1;
                int col_move = col + 1;
                x.add(new ArrayList<Integer>(Arrays.asList(row_move, col_move)));
            }
            
            if (((row + 1 > -1 && row + 1 < 17) && (col + 1 > -1 && col + 1 < 25)) && board[row + 1][col + 1] == "*") {
                int row_move = row + 1;
                int col_move = col + 1;
                x.add(new ArrayList<Integer>(Arrays.asList(row_move, col_move)));
            }
            if (((row + 1 > -1 && row + 1 < 17) && (col - 1 > -1 && col - 1 < 25)) && board[row + 1][col - 1] == "*") {
                int row_move = row + 1;
                int col_move = col - 1;
                x.add(new ArrayList<Integer>(Arrays.asList(row_move, col_move)));
            }
            if (((row  > -1 && row  < 17) && (col - 2 > -1 && col - 2 < 25)) && board[row][col - 2] == "*") {
                int row_move = row;
                int col_move = col - 2;
                x.add(new ArrayList<Integer>(Arrays.asList(row_move, col_move)));
            }
            if (((row  > -1 && row  < 17) && (col + 2 > -1 && col + 2 < 25)) &&board[row][col + 2] == "*") {
                int row_move = row;
                int col_move = col + 2;
                x.add(new ArrayList<Integer>(Arrays.asList(row_move, col_move)));
            }

        }
        return x;
    }

    public ArrayList<ArrayList<Integer>> check_jump(int row, int col) {
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        x = get_possible_jumps(row, col, x);
        ArrayList<ArrayList<Integer>> visited = new ArrayList<>();
        while (!x.isEmpty()) {
            
            ArrayList<Integer> y = x.get(0);
            x.remove(0);

            if (!visited.contains(y)) {
               
                x = get_possible_jumps(y.get(0), y.get(1), x);
                
                visited.add(y);
            }
        }
        return visited;
    }

   
 
    public ArrayList<ArrayList<Integer>> get_possible_jumps(int row, int col, ArrayList<ArrayList<Integer>> x) {
        
        if (((row - 2 > -1 && row - 2 < 17) && (col - 2 > -1 && col - 2 < 25)) && board[row - 1][col - 1] != "*") {
            int row_move = row - 2;
            int col_move = col - 2;
            if (board[row_move][col_move] == "*") {
                ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(row_move, col_move));
                if (!x.contains(temp)) {
                    x.add(temp);
                }
            }
        }
        if (((row - 2 > -1 && row - 2 < 17) && (col + 2 > -1 && col + 2 < 25)) && board[row - 1][col + 1] != "*") {
            int row_move = row - 2;
            int col_move = col + 2;
            if (board[row_move][col_move] == "*") {
                ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(row_move, col_move));
                if (!x.contains(temp)) {
                    x.add(temp);
                }
            }
        }
        if (((row + 2 > -1 && row + 2 < 17) && (col + 2 > -1 && col + 2 < 25)) &&board[row + 1][col + 1] != "*") {
            int row_move = row + 2;
            int col_move = col + 2;
            if (board[row_move][col_move] == "*") {
                ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(row_move, col_move));
                if (!x.contains(temp)) {
                    x.add(temp);
                }
            }
        }
        if (((row + 2 > -1 && row + 2 < 17) && (col - 2 > -1 && col - 2 < 25)) && board[row + 1][col - 1] != "*") {
            int row_move = row + 2;
            int col_move = col - 2;
            if (board[row_move][col_move] == "*") {
                ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(row_move, col_move));
                if (!x.contains(temp)) {
                    x.add(temp);
                }
            }
        }
        if (((row  > -1 && row  < 17) && (col - 4 > -1 && col - 4 < 25)) && board[row][col - 2] != "*") {
            int row_move = row;
            int col_move = col - 4;
            if (board[row_move][col_move] == "*") {
                ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(row_move, col_move));
                if (!x.contains(temp)) {
                    x.add(temp);
                }
            }
        }
        if (((row  > -1 && row  < 17) && (col + 4 > -1 && col + 4 < 25)) && board[row][col + 2] != "*") {
            int row_move = row;
            int col_move = col + 4;
            if (board[row_move][col_move] == "*") {
                ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(row_move, col_move));
                if (!x.contains(temp)) {
                    x.add(temp);
                }
            }
        }

       
        return x;
    }

    
    public ArrayList<ArrayList<Integer>> get_all_X() {
        ArrayList<ArrayList<Integer>> x = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == "X") {
                    ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(i, j));
                    x.add(temp);
                }
            }
        }
        return x;
    }

    
    public HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> get_all_possible_moves_pc() {
        HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> x = new HashMap<>();
        ArrayList<ArrayList<Integer>> all_X = get_all_X();
        for (int i = 0; i < all_X.size(); i++) {
            ArrayList<ArrayList<Integer>> temp = get_all_possible_moves(all_X.get(i).get(0), all_X.get(i).get(1));
            x.put(all_X.get(i), temp);
        }
       
        return x;
    }

    public HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> get_heuristic_hard(
            HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> x) {
        HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> y = new HashMap<>(x);
        for (Map.Entry<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> entry : x.entrySet()) {
            Entry<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> temp = entry;
            for (int i = 0; i < temp.getValue().size(); i++) {
                int source = temp.getKey().get(0);
                int dest = temp.getValue().get(i).get(0);
                int heuristic_value = dest - source;
                if (temp.getValue().get(i).get(1) >= 9 && temp.getValue().get(i).get(1) <= 15) {
                    heuristic_value = heuristic_value + 2;
                }
                y.get(temp.getKey()).get(i).add(heuristic_value);
            }

        } 
       
        return y;
    }

    public HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> get_heuristic_meduim(
        HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> x) {
    HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> y = new HashMap<>(x);
    for (Map.Entry<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> entry : x.entrySet()) {
        Entry<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> temp = entry;
        for (int i = 0; i < temp.getValue().size(); i++) {
            int source = temp.getKey().get(0);
            int dest = temp.getValue().get(i).get(0);
            int heuristic_value = dest - source;
            if (temp.getValue().get(i).get(1) >= 9 && temp.getValue().get(i).get(1) <= 15) {
                heuristic_value = heuristic_value + 1;
            }
            y.get(temp.getKey()).get(i).add(heuristic_value);
        }

    } 
   
    return y;
}

public HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> get_heuristic_easy(
    HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> x) {
HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> y = new HashMap<>(x);
for (Map.Entry<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> entry : x.entrySet()) {
    Entry<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> temp = entry;
    for (int i = 0; i < temp.getValue().size(); i++) {
        int source = temp.getKey().get(0);
        int dest = temp.getValue().get(i).get(0);
        int heuristic_value = dest - source;
        if (temp.getValue().get(i).get(1) >= 9 && temp.getValue().get(i).get(1) <= 15) {
            heuristic_value = heuristic_value + 0 ;
        }
        y.get(temp.getKey()).get(i).add(heuristic_value);
    }

} 

return y;
}
    
    public ArrayList<Integer> alpha_beta(HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> x) {
        ArrayList<Integer> best_move = new ArrayList<>();
        int alpha = Integer.MIN_VALUE;
        int beta = Integer.MAX_VALUE;
    
        for (Map.Entry<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> entry : x.entrySet()) {
            Entry<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> temp = entry;
            for (int i = 0; i < temp.getValue().size(); i++) {
                if (temp.getValue().get(i).get(2) > alpha && temp.getValue().get(i).get(2) < beta) {
                    
                    alpha = temp.getValue().get(i).get(2);
                    best_move.clear();
                    best_move.add(temp.getKey().get(0));
                    best_move.add(temp.getKey().get(1));
                    best_move.add(temp.getValue().get(i).get(0));
                    best_move.add(temp.getValue().get(i).get(1));
                    best_move.add(temp.getValue().get(i).get(2));
                }
            }
        }
        return best_move;
    }

    public void play_pc() {
        HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> x = get_all_possible_moves_pc();
        HashMap<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> y = new HashMap<>();
        
        if(this.difficulty==3){
            y = get_heuristic_hard(x);
        }
        else if(this.difficulty==2){
            y = get_heuristic_meduim(x);
        }
        else if(this.difficulty==1){
             y = get_heuristic_easy(x);
        }
        
        ArrayList<Integer> best_move = alpha_beta(y);
        board[best_move.get(0)][best_move.get(1)] = "*";
        board[best_move.get(2)][best_move.get(3)] = "X";
    }
    
   

    public static void main(String[] args) throws Exception {
        ChineseCheckers c = new ChineseCheckers();
        System.out.println("enter difficulty level 1 or 2 or 3");

        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        if (level<1 || level>3) {
            System.out.println("invalid input");
            System.exit(0);
        }
        c.set_difficulty(level);
        c.draw_board();
        c.move();

    }
}

