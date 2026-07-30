package com.p006ss.bytertc.audio.device.router.device;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.util.Log;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VivoKTVHelper {
    private static final int[][] EQCustomGain;
    private static final int[][] EchoCustomParams;
    private static final String KEY_EXT_SPKR = "vivo_ktv_ext_speaker";
    private static final String KEY_KTV_MODE = "vivo_ktv_mode";
    private static final String KEY_MIC_SRC = "vivo_ktv_rec_source";
    private static final String KEY_MIC_TYPE = "vivo_ktv_mic_type";
    private static final String KEY_PLAY_SRC = "vivo_ktv_play_source";
    private static final String KEY_PRESET = "vivo_ktv_preset_effect";
    private static final String KEY_VOL_MIC = "vivo_ktv_volume_mic";
    public static final int MODE_CUSTOM_3DDRAEMY = 6;
    public static final int MODE_CUSTOM_AIRY = 4;
    public static final int MODE_CUSTOM_ATTRACTIVE = 3;
    public static final int MODE_CUSTOM_DISTANT = 5;
    public static final int MODE_CUSTOM_GRAMOPHONE = 7;
    public static final int MODE_CUSTOM_KTV = 1;
    public static final int MODE_CUSTOM_NOEFFECT = 8;
    public static final int MODE_CUSTOM_RECSTUDIO = 0;
    public static final int MODE_CUSTOM_WARM = 2;
    private static final int[][] ReverbCustomParams;
    private static final String TAG = "VivoKTVHelper";
    private static final String TAG_ECHO_DELAY = "vivo_ktv_echo_delay";
    private static final String TAG_ECHO_DRY = "vivo_ktv_echo_dry";
    private static final String TAG_ECHO_ENABLE = "vivo_ktv_echo_enable";
    private static final String TAG_ECHO_GAIN = "vivo_ktv_echo_feedback";
    private static final String TAG_ECHO_WET = "vivo_ktv_echo_wet";
    private static final String TAG_MEQ_BAND_1 = "vivo_ktv_miceq_band1";
    private static final String TAG_MEQ_BAND_2 = "vivo_ktv_miceq_band2";
    private static final String TAG_MEQ_BAND_3 = "vivo_ktv_miceq_band3";
    private static final String TAG_MEQ_BAND_4 = "vivo_ktv_miceq_band4";
    private static final String TAG_MEQ_BAND_5 = "vivo_ktv_miceq_band5";
    private static final String TAG_RB_DAMP = "vivo_ktv_rb_damp";
    private static final String TAG_RB_DRY = "vivo_ktv_rb_dry";
    private static final String TAG_RB_GAIN = "vivo_ktv_rb_gain";
    private static final String TAG_RB_ROOMSIZE = "vivo_ktv_rb_roomsize";
    private static final String TAG_RB_WET = "vivo_ktv_rb_wet";
    private static final String TAG_RB_WIDTH = "vivo_ktv_rb_width";
    private static final String TAG_REVERB = "vivo_ktv_reverb_preset";
    private static final int effect_size;
    private static VivoKTVHelper mVivoKTVHelper;
    private AudioManager mAudioManager;
    private Context mContext;
    private final Object mParamLock = new Object();

    static {
        int[][] iArr = {new int[]{GivenGiftBrief.ADVANCED_GIFT_LEVEL, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, 500, 4500, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, 1500}, new int[]{5000, 4500, 1200, 4500, 6500, 1200}, new int[]{4500, 8000, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, 4000, 6500, 1500}, new int[]{2500, 3000, 1500, 4000, 5000, 1500}, new int[]{3500, 5500, 1500, 5000, 5500, 1500}, new int[]{4000, 3000, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, 2500, 5500, 1200}, new int[]{500, 5000, 800, 4500, 3000, 1200}, new int[]{20, 500, 60, 4500, 5000, 1500}, new int[]{0, 0, 0, 4000, 0, 1200}};
        ReverbCustomParams = iArr;
        effect_size = iArr.length;
        EQCustomGain = new int[][]{new int[]{0, 0, 0, 2, 2}, new int[]{0, 0, 0, 0, 0}, new int[]{3, 4, 2, 0, -3}, new int[]{3, 2, 0, 0, 2}, new int[]{3, 2, 0, -1, -3}, new int[]{2, 2, 2, 0, 0}, new int[]{5, 2, -2, 1, 3}, new int[]{-2, 0, 1, 2, 1}, new int[]{0, 0, 0, 0, 0}};
        EchoCustomParams = new int[][]{new int[]{3200, 150, 1500, 2000}};
    }

    public VivoKTVHelper(Context context) {
        this.mContext = context;
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
    }

    public static VivoKTVHelper getInstance(Context context) {
        if (mVivoKTVHelper == null) {
            mVivoKTVHelper = new VivoKTVHelper(context);
        }
        return mVivoKTVHelper;
    }

    private int getKTVParam(String str) {
        if (!Build.MANUFACTURER.trim().contains("vivo")) {
            return 0;
        }
        String parameters = this.mAudioManager.getParameters(str);
        StringTokenizer stringTokenizer = new StringTokenizer(parameters, "=");
        if (stringTokenizer.countTokens() == 2) {
            if (str.equals(stringTokenizer.nextToken())) {
                return Integer.parseInt(stringTokenizer.nextToken().trim());
            }
            return 0;
        }
        Log.e(TAG, "getKTVParam: malformated string " + parameters);
        return 0;
    }

    private void setEQParams(int i) {
        AudioManager audioManager = this.mAudioManager;
        StringBuilder sb = new StringBuilder("vivo_ktv_miceq_band1=");
        int[][] iArr = EQCustomGain;
        sb.append(iArr[i][0] + 8);
        audioManager.setParameters(sb.toString());
        this.mAudioManager.setParameters("vivo_ktv_miceq_band2=" + (iArr[i][1] + 8));
        this.mAudioManager.setParameters("vivo_ktv_miceq_band3=" + (iArr[i][2] + 8));
        this.mAudioManager.setParameters("vivo_ktv_miceq_band4=" + (iArr[i][3] + 8));
        this.mAudioManager.setParameters("vivo_ktv_miceq_band5=" + (iArr[i][4] + 8));
    }

    private void setEchoParams(int i) {
        if (i == 4) {
            this.mAudioManager.setParameters("vivo_ktv_echo_enable=1");
            AudioManager audioManager = this.mAudioManager;
            StringBuilder sb = new StringBuilder("vivo_ktv_echo_feedback=");
            int[][] iArr = EchoCustomParams;
            sb.append(iArr[0][0]);
            audioManager.setParameters(sb.toString());
            this.mAudioManager.setParameters("vivo_ktv_echo_delay=" + iArr[0][1]);
            this.mAudioManager.setParameters("vivo_ktv_echo_wet=" + iArr[0][2]);
            this.mAudioManager.setParameters("vivo_ktv_echo_dry=" + iArr[0][3]);
        }
    }

    private void setGramophoneParams(int i) {
        AudioManager audioManager = this.mAudioManager;
        if (i == 7) {
            audioManager.setParameters("vivo_ktv_reverb_preset=4");
        } else {
            audioManager.setParameters("vivo_ktv_reverb_preset=0");
        }
    }

    private void setReverbParams(int i) {
        AudioManager audioManager = this.mAudioManager;
        StringBuilder sb = new StringBuilder("vivo_ktv_rb_roomsize=");
        int[][] iArr = ReverbCustomParams;
        sb.append(iArr[i][0]);
        audioManager.setParameters(sb.toString());
        this.mAudioManager.setParameters("vivo_ktv_rb_damp=" + iArr[i][1]);
        this.mAudioManager.setParameters("vivo_ktv_rb_wet=" + iArr[i][2]);
        this.mAudioManager.setParameters("vivo_ktv_rb_dry=" + iArr[i][3]);
        this.mAudioManager.setParameters("vivo_ktv_rb_width=" + iArr[i][4]);
        this.mAudioManager.setParameters("vivo_ktv_rb_gain=" + iArr[i][5]);
        this.mAudioManager.setParameters("vivo_ktv_echo_enable=0");
    }

    public void closeKTVDevice() {
        this.mAudioManager.setParameters("vivo_ktv_mode=0");
    }

    public int getEffectSize() {
        return effect_size;
    }

    public int getExtSpeakerParam() {
        return getKTVParam(KEY_EXT_SPKR);
    }

    public int getMicTypeParam() {
        return getKTVParam(KEY_MIC_TYPE);
    }

    public int getMicVolParam() {
        return getKTVParam(KEY_VOL_MIC);
    }

    public int getPlayFeedbackParam() {
        return getKTVParam(KEY_PLAY_SRC);
    }

    public int getPreModeParam() {
        return getKTVParam(KEY_PRESET);
    }

    public int getVoiceOutParam() {
        return getKTVParam(KEY_MIC_SRC);
    }

    public boolean isDeviceSupportKaraoke() {
        int i;
        if (Build.MANUFACTURER.trim().contains("vivo")) {
            StringTokenizer stringTokenizer = new StringTokenizer(this.mAudioManager.getParameters(KEY_MIC_TYPE), "=");
            if (stringTokenizer.countTokens() == 2 && stringTokenizer.nextToken().equals(KEY_MIC_TYPE) && ((i = Integer.parseInt(stringTokenizer.nextToken())) == 1 || i == 0)) {
                return true;
            }
        }
        return false;
    }

    public void openKTVDevice() {
        this.mAudioManager.setParameters("vivo_ktv_mode=1");
    }

    public void setCustomMode(int i) {
        synchronized (this.mParamLock) {
            setExtSpeakerParam(0);
            setGramophoneParams(i);
            setReverbParams(i);
            setEQParams(i);
            setEchoParams(i);
        }
    }

    public void setExtSpeakerParam(int i) {
        synchronized (this.mParamLock) {
            try {
                if (this.mAudioManager != null) {
                    this.mAudioManager.setParameters("vivo_ktv_ext_speaker=" + i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setMicVolParam(int i) {
        synchronized (this.mParamLock) {
            try {
                if (this.mAudioManager != null) {
                    this.mAudioManager.setParameters("vivo_ktv_volume_mic=" + i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPlayFeedbackParam(int i) {
        synchronized (this.mParamLock) {
            try {
                AudioManager audioManager = this.mAudioManager;
                if (audioManager != null) {
                    audioManager.setParameters("vivo_ktv_play_source=" + i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setVoiceOutParam(int i) {
        synchronized (this.mParamLock) {
            try {
                AudioManager audioManager = this.mAudioManager;
                if (audioManager != null) {
                    audioManager.setParameters("vivo_ktv_rec_source=" + i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
