public class homework2 {
    public static void main(String[] args) {
        home(22,38);
        home(12,53);
        home(15,43);
        home(10,99);
        home(5,73);
        int a=0,b=100;
        int ageRandom=a+(int)(Math.random()*b);
        System.out.println("Ваш возраст :"+ageRandom);
    }
    public static void home(int age,int temperature){
        System.out.println("Ваш возраст:"+age);
        System.out.println("Ваша температура:"+temperature);
        if(20<age && age==45 || -20<temperature && temperature<30) {
            System.out.println("Можно идти гулять");
        }
         else if(20>age||0<temperature&&temperature<28){
            System.out.println("Можно идти гулять");
        }else if(age>45){
            System.out.println("Можно идти гулять");
        }else if (-10==temperature&& 25==temperature){
            System.out.println();
        }else{
            System.out.println("Оставайтесь дома");
        }

        }
    }

