public class Exercise {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
    
  
        // PATTERN 1
        int total = 0;
        for (int i = 0; i < mdArray.length; i++) {
            total += mdArray[0][i];
        }
        System.out.println("1. SUM OF PATTERN 1 is: " + total);
        
        // PATTERN 2
        System.out.println("");
        int ttotal = 0;
        for (int i = 0; i < mdArray.length; i++) {
            ttotal += mdArray[i][0];
        }
        System.out.println("2. SUM OF PATTERN 2 is: " + ttotal);
        
        // PATTERN 3
        System.out.println("");
        int tttotal = 0;
        for (int i = 0; i < mdArray.length; i++) {
                for (int j = 0; j < mdArray.length; j++) {
                  if (i == 0 || j == 0) {
                    tttotal += mdArray[i][j];
                  }
                  else {
                    continue;
                  }
                }
            }
        System.out.println("3. SUM OF PATTERN 3 is: " + tttotal);
        
        // PATTERN 4
        System.out.println("");
        int ttttotal = 0;
        for (int i = 0; i < mdArray.length; i++) {
                for (int j = 0; j < mdArray.length; j++) {
                  if ((i == 0 & j == 0) || (i == 0 & j == 3) || (i == 3 & j == 0) || (i == 3 & j == 3)) {
                    ttttotal += mdArray[i][j];
                  }
                  else {
                    continue;
                  }
                }
            }
            System.out.println("4. SUM OF PATTERN 4 is: " + ttttotal);
        
        // PATTERN 5
        System.out.println("");
        int tttttotal = 0;
        for (int i = 0; i < mdArray.length; i++) {
                for (int j = 0; j < mdArray.length; j++) {
                  if ((i == 1 & j == 1) || (i == 1 & j == 2) || (i == 2 & j == 1) || (i == 2 & j == 2)) {
                    tttttotal += mdArray[i][j];
                  }
                  else {
                    continue;
                  }
                }
            }
            System.out.println("5. SUM OF PATTERN 5 is: " + tttttotal);
      
        // PATTERN 6
        System.out.println("");
        int ttttttotal = 0;
        for (int i = 0; i < mdArray.length; i++) {
                for (int j = 0; j < mdArray.length; j++) {
                  if ((i == 0 & j == 0) || (i == 0 & j == 3) || (i == 3 & j == 0) || (i == 3 & j == 3) || (i == 1 & j == 1) || (i == 1 & j == 2) || (i == 2 & j == 1) || (i == 2 & j == 2)) {
                    ttttttotal += mdArray[i][j];
                  }
                  else {
                    continue;
                  }
                }
            }
            System.out.println("5. SUM OF PATTERN 5 is: " + ttttttotal);
    }
  }
