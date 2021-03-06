import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i=0;i< arr.length;i++){
            System.out.print((i+1)+". Elemani:");
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {        //Dizimizin değerlerini sırası ile alıyoruz

            int sayi = arr[i];                          //sıradaki değeri sayi değişkenine atıyoruz
            int temp = i;                               //sayi 'nin indeksini temp değerine atıyoruz

            for (int j = i+1; j < arr.length ; j++) {  //dizimizde i' den sonraki elemanlara bakıyoruz
                if(arr[j]<sayi){                       //sayi değişkeninden küçük sayı var mı
                    sayi = arr[j];                      //varsa sayi değişkenimizide değiştiriyoruz
                    temp = j;                           //indeks değerinide değiştiriyoruz
                }
            }

            if(temp != i){                              //temp değeri başlangıç değeri ile aynı değil ise yani list[i]'nin
                arr[temp] = arr[i];                     //değerinden küçük sayı varsa onları yer değiştiriyoruz
                arr[i] = sayi;
            }

        }

        System.out.print("Siralama:");

        for (int sayi:arr) {
            //Bu kısım sıralamanın doğru calısıp calısmadıgını kontrol etmek için
            System.out.print(sayi+" ");

        }

    }
}