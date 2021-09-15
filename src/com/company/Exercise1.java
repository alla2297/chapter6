package com.company;

public class Exercise1 {
    public static void main(String[] args) {                //
        loop(10);                                        //1. int n=10
    }

    public static void loop(int n) {                        //2.
        int i = n;                                          //3. (n=10)=i
        while (i > 1) {                                     //4. true  8. true  13. true 17. true 22.true 26.true
            System.out.println(i);                          //5.  10  9. 5  14. 6 18. 3 23. 4 27. 2
            if (i % 2 == 0) {                               //6. true 10. false 15.true 19. false 24. true 27.
                i = i / 2;                                  //7. i=5 16. i=3 25. i=2
            } else {                                        //11. 20.
                i = i + 1;                                  //12. i=6 21. i=4
            }
        }
    }
}

/* output
10
5
6
3
4
2
3
1 // men det en int så den siger kun 1 og ikke 1,5
 */

// opgave 3 nej