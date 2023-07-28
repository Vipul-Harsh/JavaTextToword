/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package texttoword;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author b
 */
public class Texttoword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("alan");
        Voice [] v = VoiceManager.getInstance().getVoices();
        for (Voice v1 : v) {
            System.out.println("# Voices" + v1.getName());
        
        if(voice!=null){
            voice.allocate();
            System.out.println("voice rate"+ voice.getRate());
            Boolean s=voice.speak("The time is 7 30 am");
            System.out.println(s);
            voice.deallocate();
              
        }else{
            System.out.println("error occured");
        
        }
    
}
    }
}

