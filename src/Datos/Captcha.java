/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.Random;

/**
 *
 * @author 51935
 */
public class Captcha {
    public static  String createCaptchaValue(){
        Random rand = new Random();
    int length = 7 + (Math.abs(rand.nextInt()) % 3);
    StringBuilder strBuff = new StringBuilder();

    for (int i = 0; i < length; i++) {
        int baseCharNum = Math.abs(rand.nextInt()) % 36; // Solo letras mayúsculas y números
        int charNum = 0;
        if (baseCharNum < 26)
            charNum = 65 + baseCharNum; // Letras mayúsculas
        else
            charNum = 48 + baseCharNum - 26; // Números

        strBuff.append((char) charNum);
    }
    return strBuff.toString();
        }
      
    }

