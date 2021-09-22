**

## AES Encryption (Android & PHP)

** To use this source code, you need download the files and put them in your project.
**

> Example to use PHP source code:

    <?php  
    include('NewAES.php');  
    $key = "reyhwe$#oikposif" //Change it
    $iv = "nmb@hnd78^6$23" //Change it
    $aes = new NewAES($key, $iv);  
      
    echo "Encrypted Text: " . $aes->encryption("Your Text Here");  
    echo "Decrypted Text: " . $aes->decryption("Your Encrypted Text Here");


> Example to use Android source code:

-----Kotlin

    val key = "reyhwe$#oikposif" //Change it
        val iv = "nmb@hnd78^6$23" //Change it
    
    val aes = NewAES(key, iv)
    aes.encryption("Your Text Here")
    aes.decryption("Your Encrypted Text Here")

-----Java

     String key = "reyhwe$#oikposif"; //Change it
            String iv = "nmb@hnd78^6$23"; //Change it
        
        NewAES aes = new NewAES(key, iv)
        aes.encryption("Your Text Here");
        aes.decryption("Your Encrypted Text Here");

instagram: @Masoud_Rmn
