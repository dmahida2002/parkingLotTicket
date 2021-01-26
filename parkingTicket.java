public class parkingTicket {
    public static void main(String args[]) {
      
      int i = 0;
      int runs = 1;
      int time = 0;
      int numbers = 0;
      double amount = 0;
      double rate = 0.04;
      int randomTime = (int)(Math.random()*(200 - 10 + 1) + 10);
      int ticketNumber = (int)(Math.random()*(40 - 2 + 1) + 2);
      
      System.out.println("======= THE RATE IS " + rate + "% ========");
      System.out.println("Your ticket number is: " + ticketNumber);
      System.out.println();
      
      while(i < runs){
          
          time = randomTime;
          amount = (time * rate);
      
              if (time >= 60){
                  
                  int minutes = 0;
                  
                  while (time >= 60){
                      
                      numbers = numbers + 1;
                      time = time - 60;
                  }//end inner while
                  
                  time  = randomTime; 
                  minutes = (time - (numbers * 60));
                  
                  if(numbers == 1){
                      
                      System.out.println("You parked your vehicle for " + numbers + " hour and " + minutes + " minutes");
                  }//end inner if
                  
                  else if(numbers > 1){
                      
                      System.out.println("You parked your vehicle for " + numbers + " hours and " + minutes + " minutes");
                  }//end innerelse
                  
                  
                  numbers = numbers + 1;
              }//end if
              
              else{
                  
                  System.out.println("You parked your vehicle for " + time + " minutes");
              }//end else
          
          System.out.printf("Amount left to pay: $%.2f \n", amount);
          System.out.println("Please pay!");
          
          i = i + 1;
      }//end while
      
    }//end main
}//end parkingTicket
