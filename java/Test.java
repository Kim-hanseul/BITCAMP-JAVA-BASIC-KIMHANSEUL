import java.util.Arrays;

/**
 * packageName: PACKAGE_NAME
 * fileName   : Test
 * author     : Kim-hanseul
 * date       : 2022-02-16
 * ================================
 * DATE         AUTHOR      NOTE
 * ================================
 * 2022-02-16  Kim-hanseul   최초 생성
 */
public class Test {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        if(random < 3){
            random = 3;
        }

        int[][] array = new int[random][random];
        for (int i = 0; i < random; i++) {
            if(i%2==0){
                for(int j=0; j<random; j++){
                    array [i][j] = random * i + (j+1);
                }
            }else { for(int j = 0; j<random; j++){
                array [i][j] = random * (i+1)-j;}
            }
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j]+ " ");
            }System.out.println();
        }
    }
}