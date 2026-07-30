package com.p046p1.mobile.putong.core.data;

import com.clevertap.android.sdk.Constants;
import p149l.mqi0;

/* JADX INFO: loaded from: classes10.dex */
public class SpecialNotifyFlag {
    private static long MINE_PLAY_ANIM_TIME = 2000;
    private long AUDIO_MAX_TIME = Constants.ONE_MIN_IN_MILLIS;
    private boolean hasPlayAudio = false;
    private boolean hasPlayAnim = false;
    private long latestPlayAnimTime = -1;
    private long audioExpTime = mqi0.m155944o() + this.AUDIO_MAX_TIME;

    public boolean checkAndPlayAnimOnce() {
        if (this.hasPlayAnim) {
            return false;
        }
        this.hasPlayAnim = true;
        if (mqi0.m155944o() - this.latestPlayAnimTime < MINE_PLAY_ANIM_TIME) {
            return false;
        }
        this.latestPlayAnimTime = mqi0.m155944o();
        return true;
    }

    public boolean checkAndPlayAudioOnce() {
        if (this.hasPlayAudio) {
            return false;
        }
        this.hasPlayAudio = true;
        return mqi0.m155944o() < this.audioExpTime;
    }

    public void reset() {
        this.audioExpTime = mqi0.m155944o() + this.AUDIO_MAX_TIME;
        this.hasPlayAudio = false;
        this.hasPlayAnim = false;
    }
}
