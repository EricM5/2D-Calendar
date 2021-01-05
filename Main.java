import java.util.Scanner;
class Main {
  static void calendar (int day, int daysinmonth , int[][] calendardays) {
    int counter = day - 1;
    int a = 0;

    if (counter != 0) {
      for (int i = 1; i < day - 1; i++) {
          System.out.print("\t\t");
      }
    }
      for (int i = 0; i < calendardays.length; i++) {
        
        for (int j = 0; j < calendardays[i].length; j++) {
          if (counter % 7 == 0) {
            if (counter != 0)
              System.out.println("");
              System.out.print("" + calendardays[i][j]);
              if (calendardays[i][j] == daysinmonth) {
                System.out.println("");
                break;
              }
                
          }
          else {
            System.out.print("\t\t" + calendardays[i][j]);
            if (calendardays[i][j] == daysinmonth) {
              System.out.println("");
              break;
            }
          }
          counter++;
          a++;
        }
      }
      System.out.println("");
  }
  /*
  NEW METHOD
  */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] calendardays = new int[][] {
      {1,2,3,4,5,6,7},
      {8,9,10,11,12,13,14},
      {15,16,17,18,19,20},
      {21,22,23,24,25,26,27},
      {28,29,30,31}
      };
    int day = 0;
    int daysinmonth;
    for (;;) { 
      while(true) { //loop to check for valid day
        System.out.print("Enter the day: ");
        day = in.nextInt();
          if (day > 7 || day == 0) {
            System.out.print("Invalid day, try again.\n\n");
          } else {
              break;
          }
      }
      while (true) { //loop to check for valid days in month
        System.out.print("Enter the number of days in the month: ");
        daysinmonth = in.nextInt();
        if (daysinmonth <= 31 && daysinmonth > 28) {
          break;
          }
        if (daysinmonth == 28)
          break;
          System.out.print("Invalid number of days in month, try again.\n\n");
        }
        System.out.println("\nSun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
        calendar(day, daysinmonth , calendardays);
    }
  }
} 
  
