import java.util.*;

public class LabExer5B {
    
    public static void main(String[] args) throws EmptyInputException {
    
    int right = 0;
    int wrong = 0;
    System.out.println("The Beatles Quiz");
    System.out.println("___________________________________________________");
    System.out.println("INSTRUCTIONS: Type the letter of the correct answer." + "\n");
    
    String input = "";
    String[] answers = {"B", "D", "A", "D", "C", "B", "B", "D", "B", "B"};
    String[] quiz = { "1.) Who was the bassist for The Beatles?" + "\n" +
                      "A. John Lennon" + "\n" + 
                      "B. Paul McCartney" + "\n" +
                      "C. George Harrison " + "\n" +
                      "D. Ringo Starr", "\n" +
            
                      "2.) Fill in the blank: Hey Jude, don't make it  bad. Take a sad song and make it ____. " + "\n" + 
                      "A. Happy" + "\n" +
                      "B. Stand" + "\n" +
                      "C. Cool" + "\n" +
                      "D. Better", "\n" +
           
                      "3.) Who was the lead guitarist of The Beatles?" + "\n" + 
                      "A. George Harrison" + "\n" +
                      "B. John Lennon" + "\n" +
                      "C. Paul McCartney " + "\n" +
                      "D. Ringo Starr", "\n" +
            
                      "4.) Fill in the blank: Yesterday, all my ______ seemed so far away." + "\n" + 
                      "A. Problems" + "\n" +
                      "B. Love" + "\n" +
                      "C. Friends" + "\n" +
                      "D. Troubles", "\n" +
            
                      "5.) Who was the Beatle who died first?" + "\n" + 
                      "A. George Harrison" + "\n" +
                      "B. Ringo Starr" + "\n" +
                      "C. John Lennon" + "\n" +
                      "D. Paul McCartney", "\n" +
            
                      "6.) What song of The Beatles that is about friends?" + "\n" + 
                      "A. All My Loving" + "\n" + 
                      "B. In My Life" + "\n" +
                      "C. All You Need Is Love" + "\n" +
                      "D. Let It Be", "\n" +
            
                      "7.) Fill in the blank: Let me take you down, cause i'm going to _____." + "\n" + 
                      "A. Party" + "\n" +
                      "B. Strawberry fields" + "\n" +
                      "C. Go home" + "\n" +
                      "D. Penny Lane", "\n" +
            
                      "8.) What was the one of the greatest masterpiece of The Beatles?" + "\n" + 
                      "A. Help!" + "\n" +
                      "B. She Loves You" + "\n" + 
                      "C. Penny Lane " + "\n" +
                      "D. A Day In The Life", "\n" +
            
                      "9.) Who was the drummer for The Beatles?" + "\n" +
                      "A. John Lennon" + "\n" +
                      "B. Ringo Starr" + "\n" +
                      "C. George Harrison" + "\n" +
                      "D. Paul McCartney", "\n" +
            
                      "10.) Who was the lead vocalist for The Beatles?" + "\n" + 
                      "A. Ringo Starr" + "\n" +
                      "B. John Lennon" + "\n" + 
                      "C. Paul McCartney" + "\n" +
                      "D. George Harrison" + "\n"};
        
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quiz.length; i++) {
            System.out.println(quiz[i]);
            System.out.print("ANSWER: ");
            do {
                try {
                    input = sc.nextLine();
                    if (input.isBlank()) {
                        throw new EmptyInputException();
                    } else if (!input.matches("^[a-zA-Z]+$")) {
                        throw new InputMismatchException();
                    } else if (!input.equalsIgnoreCase("A") && !input.equalsIgnoreCase("B") && !input.equalsIgnoreCase("C") && !input.equalsIgnoreCase("D")) {
                        throw new StringIndexOutOfBoundsException();
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Invalid input, again!");
                    System.out.print(i + 1 + ") " + "ANSWER: ");
                } catch (EmptyInputException e) {
                    System.out.println("Invalid input, again!");
                    System.out.print(i + 1 + ") " + "ANSWER: ");
                } catch (StringIndexOutOfBoundsException ex) {
                    System.out.println("Invalid input, again!");
                    System.out.print(i + 1 + ") " + "ANSWER: ");
                }
            } while (!input.equalsIgnoreCase("A") && !input.equalsIgnoreCase("B") && !input.equalsIgnoreCase("C") && !input.equalsIgnoreCase("D"));

            if (input.equalsIgnoreCase(answers[i])) {
                right++;
            } else if (!input.equalsIgnoreCase(answers[i])) {
                wrong++;
            }
        }
        System.out.println("\n" + "_____________________");
        System.out.println("YOU GOT");
        System.out.println("RIGHT: " + right);
        System.out.println("WRONG: " + wrong);
        System.out.println("RESULT: "+ right + "/10");
    }
    private static class EmptyInputException extends Exception {
        public EmptyInputException() {
        }
    }
}