package Cifrado_AES;
public class crypt {

	public static void main(String[] args) 
	{
	    final String secretKey = "badMac";
	     
	    String originalString = "Abf inzbf qr rkphefvba";
	    String encryptedString = aes.encrypt(originalString, secretKey) ;
	    String decryptedString = aes.decrypt(encryptedString, secretKey) ;
	     
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
	}

}