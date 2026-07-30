package com.p006ss.bytertc.audio.device.webrtc.observer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.util.Log;
import com.bytedance.realx.base.ContextUtils;
import l.ii5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MicMuteChangedObserver {
    private static final String TAG = "MicMuteChangedObserver";
    private MicMuteBroadCastReceiver mMicMuteBroadCastReceiver;
    private OnMicMuteChangedListener mOnMicMuteChangedListener;

    public final class MicMuteBroadCastReceiver extends BroadcastReceiver {
        private MicMuteBroadCastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MicMuteChangedObserver micMuteChangedObserver = MicMuteChangedObserver.this;
            if (context == null || intent == null || micMuteChangedObserver == null || intent.getAction() != "android.media.action.MICROPHONE_MUTE_CHANGED") {
                return;
            }
            try {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager == null || micMuteChangedObserver.mOnMicMuteChangedListener == null) {
                    return;
                }
                micMuteChangedObserver.mOnMicMuteChangedListener.onMicMuteChanged(audioManager.isMicrophoneMute());
            } catch (Exception e) {
                Log.e(MicMuteChangedObserver.TAG, "MicMuteBroadCastReceiver.onReceive, exception: " + e.getMessage());
            }
        }
    }

    public interface OnMicMuteChangedListener {
        void onMicMuteChanged(boolean z);
    }

    public MicMuteChangedObserver(OnMicMuteChangedListener onMicMuteChangedListener) {
        this.mOnMicMuteChangedListener = onMicMuteChangedListener;
        registerReceiver();
    }

    private void registerReceiver() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Log.e(TAG, "registerReceiver, context is null. unable to register broadcast receiver.");
            return;
        }
        MicMuteBroadCastReceiver micMuteBroadCastReceiver = new MicMuteBroadCastReceiver();
        this.mMicMuteBroadCastReceiver = micMuteBroadCastReceiver;
        ii5.l(applicationContext, micMuteBroadCastReceiver, new IntentFilter("android.media.action.MICROPHONE_MUTE_CHANGED"));
    }

    private void unregisterReceiver() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Log.e(TAG, "unregisterReceiver, context is null. unable to register broadcast receiver.");
            return;
        }
        try {
            MicMuteBroadCastReceiver micMuteBroadCastReceiver = this.mMicMuteBroadCastReceiver;
            if (micMuteBroadCastReceiver != null) {
                applicationContext.unregisterReceiver(micMuteBroadCastReceiver);
                this.mMicMuteBroadCastReceiver = null;
            }
        } catch (Exception e) {
            Log.e(TAG, "unregisterReceiver, exception: " + e.getMessage());
        }
    }

    public void release() {
        unregisterReceiver();
        this.mOnMicMuteChangedListener = null;
    }
}
