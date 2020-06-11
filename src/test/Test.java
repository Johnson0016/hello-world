package test;

/**
 * @author zhangxinlei
 * @description:
 * @create 2020-06-11 15:44
 */
public class Test {
    public static void main(String[] args) {
        String a = "d 5";
        String res = "";
        String[] split = a.split("");
        for (String item : split){
            if (item.equals(" ")){
                res = res + "%20";
            } else {
              res = res + item;
            }
        }
        System.out.println(res);
    }
}
