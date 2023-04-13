<?php
$shift = 3;

$message = "hello world";

$chars = str_split($message);

foreach ($chars as &$char) {
    if (ctype_alpha($char)) {
        
        $ascii = ord($char);
        
        $shifted_ascii = ($ascii - 65 + $shift) % 26 + 65;
        
        $char = chr($shifted_ascii);
    }
}

$ciphertext = implode("", $chars);

echo $ciphertext;
?>
