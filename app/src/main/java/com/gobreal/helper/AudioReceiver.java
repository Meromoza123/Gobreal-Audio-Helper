package com.gobreal.helper;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
public class AudioReceiver extends BroadcastReceiver {
      @Override
      public void onReceive(Context context, Intent intent) {
                if ("com.gobreal.helper.SPEAKER".equals(intent.getAction())) {
                              boolean turnOn = intent.getBooleanExtra("state", false);
                              AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
                              if (audioManager != null) {
                                                audioManager.setMode(AudioManager.MODE_IN_CALL);
                                                audioManager.setSpeakerphoneOn(turnOn);
                              }
                }
      }
}
