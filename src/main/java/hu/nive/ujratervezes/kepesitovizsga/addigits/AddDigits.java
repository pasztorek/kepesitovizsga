package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

public int  addDigits(String input){
    int sum=0;

    if(input == null || input.equals("")){
        return -1;
    }

    for(int i=0; i<input.length(); i++){
        if (input.charAt(i)>=49 && input.charAt(i)<=57){
                int charnum = Integer.parseInt(input.substring(i,i+1));

                sum = sum + charnum;
        }

    }

     return sum;
}



}
