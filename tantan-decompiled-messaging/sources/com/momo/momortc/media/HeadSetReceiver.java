package com.momo.momortc.media;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;
import com.momo.momortc.MMRtcEngine;
import com.momo.momortc.media.HeadSetReceiver;
import com.momo.rtcbase.voiceengine.WebRtcAudioRecord;
import p149l.ii5;

/* JADX INFO: loaded from: classes6.dex */
public class HeadSetReceiver extends BroadcastReceiver {
    private static final String TAG = "HeadSetReceiver";
    private static boolean isFocus = false;
    private static boolean isVoip = false;
    private static AudioManager.OnAudioFocusChangeListener mAudioFocusListener = new AudioManager.OnAudioFocusChangeListener() { // from class: l.gxk
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            HeadSetReceiver.m19645a(i);
        }
    };
    private static boolean mBlueHeadSet = false;
    private static Context mContext = null;
    private static boolean mEarBack = false;
    private static boolean mSpeakerphoneOn = true;
    private AudioManager audioManager;
    private BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    private boolean mHeadSet = false;
    private boolean mAudioRouterMedia = false;
    private boolean mAudioRouterFix = false;
    private boolean mHeadSetMic = false;

    public HeadSetReceiver(AudioManager audioManager) {
        this.audioManager = audioManager;
        WebRtcAudioRecord.setAudioManager(audioManager);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19645a(int i) {
    }

    public static void abandonAudioFocus() {
        AudioManager audioManager;
        Context context = mContext;
        if (context == null || !isFocus || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return;
        }
        audioManager.abandonAudioFocus(mAudioFocusListener);
        isFocus = false;
        Log.e("--------", "abandonAudioFocus");
    }

    public static boolean hasBluetoothHeadset() {
        return ii5.m136334d(BluetoothAdapter.getDefaultAdapter(), 1) == 2;
    }

    public static boolean hasWiredHeadset(AudioManager audioManager) {
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(3)) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 11) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHeadsetOn(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 22) {
                return true;
            }
        }
        return false;
    }

    public static void requestAudioFocus(Context context) {
        if (context == null || isFocus) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        mContext = applicationContext;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        audioManager.requestAudioFocus(mAudioFocusListener, 0, 3);
        isFocus = true;
    }

    public void autoSetHeadsetOn(AudioManager audioManager, boolean z, boolean z2) {
        boolean z3;
        isVoip = z;
        if (audioManager == null) {
            return;
        }
        try {
            boolean z4 = false;
            boolean z5 = false;
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 12 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 3) {
                    z5 = true;
                }
                if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                    z4 = true;
                }
            }
            boolean z6 = mBlueHeadSet;
            boolean z7 = z4 | z6;
            boolean z8 = z5 | z7;
            if (z2) {
                if (z6) {
                    setMediaRouter_i(true);
                } else if (!this.mHeadSet && !(z3 = this.mAudioRouterMedia)) {
                    setMediaRouter_i(z3);
                } else if (!this.mAudioRouterFix) {
                    setMediaRouter_i(true);
                }
            }
            if (z || z7) {
                boolean z9 = !z8 && mSpeakerphoneOn;
                if (z9 != audioManager.isSpeakerphoneOn()) {
                    audioManager.setSpeakerphoneOn(z9);
                }
            }
            if (z7) {
                if (z) {
                    audioManager.startBluetoothSco();
                    audioManager.setBluetoothScoOn(true);
                    audioManager.setBluetoothA2dpOn(false);
                } else {
                    audioManager.stopBluetoothSco();
                    audioManager.setBluetoothScoOn(false);
                    audioManager.setBluetoothA2dpOn(true);
                }
            }
            if (!z8 && !z7) {
                audioManager.setSpeakerphoneOn(mSpeakerphoneOn);
                audioManager.setWiredHeadsetOn(true);
                MMRtcEngine.getInstance().setEarBack(false);
                return;
            }
            audioManager.setSpeakerphoneOn(false);
            audioManager.setWiredHeadsetOn(false);
            if (mEarBack) {
                MMRtcEngine.getInstance().setEarBack(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean getHeadSetState() {
        return this.mHeadSet || mBlueHeadSet;
    }

    public boolean isEarBack() {
        return mEarBack;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if ("android.intent.action.HEADSET_PLUG".equals(action) && intent.hasExtra("state")) {
            int intExtra = intent.getIntExtra("state", 0);
            if (intExtra == 1) {
                this.mHeadSet = true;
            } else if (intExtra == 0) {
                this.mHeadSet = false;
            }
        }
        if (intent.hasExtra("microphone")) {
            this.mHeadSetMic = intent.getIntExtra("microphone", 0) == 1;
        }
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            mBlueHeadSet = false;
        } else {
            int iM136334d = ii5.m136334d(this.mBluetoothAdapter, 1);
            ii5.m136334d(this.mBluetoothAdapter, 2);
            if (iM136334d == 2 || iM136334d == 1) {
                mBlueHeadSet = true;
                if (audioManager != null) {
                    audioManager.setSpeakerphoneOn(false);
                    if (isVoip) {
                        audioManager.startBluetoothSco();
                        audioManager.setBluetoothScoOn(true);
                        audioManager.setBluetoothA2dpOn(false);
                    } else {
                        audioManager.stopBluetoothSco();
                        audioManager.setBluetoothScoOn(false);
                        audioManager.setBluetoothA2dpOn(true);
                    }
                }
            } else {
                mBlueHeadSet = false;
            }
        }
        try {
            if (!this.mHeadSet && !mBlueHeadSet) {
                audioManager.setSpeakerphoneOn(mSpeakerphoneOn);
                this.audioManager.setWiredHeadsetOn(true);
                MMRtcEngine.getInstance().setHeadset(false);
                MMRtcEngine.getInstance().setEarBack(false);
                return;
            }
            audioManager.setSpeakerphoneOn(false);
            this.audioManager.setWiredHeadsetOn(false);
            MMRtcEngine.getInstance().setHeadset(true);
            if (mEarBack) {
                MMRtcEngine.getInstance().setEarBack(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void release() {
        this.audioManager = null;
    }

    public void setEarBack(boolean z) {
        mEarBack = z;
        if (getHeadSetState()) {
            MMRtcEngine.getInstance().setEarBack(z);
        }
    }

    public void setMediaRouter(boolean z, boolean z2) {
        this.mAudioRouterMedia = z;
        this.mAudioRouterFix = z2;
        setMediaRouter_i(z);
    }

    public void setMediaRouter_i(boolean z) {
    }

    public void setSpeakerphoneOn(boolean z) {
        mSpeakerphoneOn = z;
    }
}
