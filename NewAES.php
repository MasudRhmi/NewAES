<?php

class NewAES {

    private $key;
    private $iv;
    private $algorithm2 = "aes-256-cbc";

    public function __construct($key, $iv) {
        $this->key = $key;
        $this->iv= $iv;
    }

    public function encryption($plaintext) {
        $ciphertext = openssl_encrypt($plaintext, $this->algorithm2, $this->key, $options = OPENSSL_RAW_DATA, base64_decode($this->iv));
        return base64_encode($ciphertext);
    }

    public function decryption($ciphertext) {
        return openssl_decrypt(base64_decode($ciphertext), $this->algorithm2, $this->key, $options = OPENSSL_RAW_DATA, base64_decode($this->iv));
    }
}


