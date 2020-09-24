/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparandsort;
import java.util.*;

class ComparAndSort {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter number of players : ");
    int n = input.nextInt();

    Player[] player = new Player[n];
    Checker checker = new Checker();
 System.out.println("enter players name and number : ");
    for(int i = 0; i < n; i++){
      player[i] = new Player(input.next(), input.nextInt());
    }
    input.close();

    Arrays.sort(player, checker);
     System.out.println(" players sorting result : ");
    for(int i = 0; i < player.length; i++){
      System.out.printf("%s %s\n", player[i].name, player[i].score);
    }
  }
}

class Checker implements Comparator<Player> {

  @Override
  public int compare(Player a1, Player a2) {
    if (a1.score < a2.score) {
      return 1;
    } else if (a1.score > a2.score) {
      return -1;
    } else {
      return a1.name.compareTo(a2.name);
    }
  }
}

class Player {
  String name;
  int score;

  Player(String name, int score){
    this.name = name;
    this.score = score;
  }
}



 