public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        float[] floatArray = {1.57f, 7.654f, 9.986f};

        char[] charArray = new char[26];
        char letter = 'a';
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = letter;
            letter++;
        }

        //Task 2
        System.out.println("Task 2");
        for (int i = 0; i < intArray.length; i++) {     //чтоб вручную не писать каждый раз soutprintln придумал такой способ
            if (intArray.length - i > 1) {              //не уверен, что это - самый удачный вариант
                System.out.print(intArray[i] + ", ");   //но свое дело делает)
            } else {
                System.out.println(intArray[i]);
            }
        }

        for (int i = 0; i < floatArray.length; i++) {
            if (floatArray.length - i > 1) {
                System.out.print(floatArray[i] + ", ");
            } else {
                System.out.println(floatArray[i]);
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            if (charArray.length - i > 1) {
                System.out.print(charArray[i] + ", ");
            } else {
                System.out.println(charArray[i]);
            }
        }
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(intArray[i] + ", ");
            } else {
                System.out.println(intArray[i]);
            }
        }

        for (int i = floatArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(floatArray[i] + ", ");
            } else {
                System.out.println(floatArray[i]);
            }
        }

        for (int i = charArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(charArray[i] + ", ");
            } else {
                System.out.println(charArray[i]);
            }
        }
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
        }
        //в задании не указано каким именно способом распечатать, выбрал через ", " как во 2 задании
        for (int i = 0; i < intArray.length; i++) {
            if (intArray.length - i > 1) {
                System.out.print(intArray[i] + ", ");
            } else {
                System.out.println(intArray[i]);
            }
        }
        /*
        Прочитал конспект, оказывается, там не просто конспект урока, но ещё и много полезной информации. Там указан
        другой способ вывода массива с помощью цикла "if" и break. Если такой способ лучше - перепишу домашку.
         */
    }
}
