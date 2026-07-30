package com.tencent.liteav.audio;

import com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14052f;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class TXCUGCBGMPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final int PLAY_ERR_OPEN = -1;
    private static final int PLAY_SUCCESS = 0;
    private static final String TAG = "AudioCenter:TXCUGCBGMPlayer";
    private int mBGMId;
    private long mEndTimeMS;
    private boolean mIsRunning;
    private long mSeekBytes;
    private float mSpeedRate;
    private long mStartTimeMS;
    private float mVolume;
    private WeakReference<InterfaceC13986g> mWeakListener;

    /* JADX INFO: renamed from: com.tencent.liteav.audio.TXCUGCBGMPlayer$a */
    public static class C13979a {

        /* JADX INFO: renamed from: a */
        private static TXCUGCBGMPlayer f57984a = new TXCUGCBGMPlayer();

        /* JADX INFO: renamed from: a */
        public static TXCUGCBGMPlayer m82664a() {
            return f57984a;
        }
    }

    static {
        C14052f.m83056f();
    }

    private TXCUGCBGMPlayer() {
        this.mWeakListener = null;
        this.mIsRunning = false;
        this.mVolume = 1.0f;
        this.mSpeedRate = 1.0f;
        this.mStartTimeMS = 0L;
        this.mEndTimeMS = 0L;
        this.mSeekBytes = 0L;
        this.mBGMId = Integer.MIN_VALUE;
        TXCMultAudioTrackPlayer.getInstance();
    }

    public static TXCUGCBGMPlayer getInstance() {
        return C13979a.m82664a();
    }

    private void onPlayEnd(int i) {
        InterfaceC13986g interfaceC13986g;
        synchronized (this) {
            try {
                WeakReference<InterfaceC13986g> weakReference = this.mWeakListener;
                interfaceC13986g = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC13986g != null) {
            interfaceC13986g.onPlayEnd(i);
        }
    }

    private void onPlayProgress(long j, long j2) {
        InterfaceC13986g interfaceC13986g;
        synchronized (this) {
            try {
                WeakReference<InterfaceC13986g> weakReference = this.mWeakListener;
                interfaceC13986g = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC13986g != null) {
            interfaceC13986g.onPlayProgress(j, j2);
        }
    }

    private void onPlayStart() {
        InterfaceC13986g interfaceC13986g;
        synchronized (this) {
            try {
                WeakReference<InterfaceC13986g> weakReference = this.mWeakListener;
                interfaceC13986g = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC13986g != null) {
            interfaceC13986g.onPlayStart();
        }
    }

    public long getDurationMS(String str) {
        return TXAudioEffectManagerImpl.getCacheInstance().getMusicDurationInMS(str);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i, int i2) {
        onPlayEnd(i2);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i, int i2) {
        onPlayStart();
    }

    public void pause() {
        TXCLog.m82969i(TAG, "pause");
        TXAudioEffectManagerImpl.getCacheInstance().pausePlayMusic(this.mBGMId);
    }

    public void playFromTime(long j, long j2) {
        TXCLog.m82969i(TAG, "startPlayRange:" + j + ", " + j2);
        this.mStartTimeMS = j;
        this.mEndTimeMS = j2;
    }

    public void resume() {
        TXCLog.m82969i(TAG, "resume");
        TXAudioEffectManagerImpl.getCacheInstance().resumePlayMusic(this.mBGMId);
    }

    public void seekBytes(long j) {
        TXCLog.m82969i(TAG, "seekBytes:" + j);
        if (j < 0) {
            TXCLog.m82966e(TAG, "seek bytes can not be negative. change to 0");
            j = 0;
        }
        this.mSeekBytes = j;
        TXAudioEffectManagerImpl.getCacheInstance().seekMusicToPosInBytes(this.mBGMId, j);
    }

    public void setChangerType(int i) {
        TXCLog.m82969i(TAG, "changerType:" + i);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicChangerType(this.mBGMId, i);
    }

    public synchronized void setOnPlayListener(InterfaceC13986g interfaceC13986g) {
        if (interfaceC13986g == null) {
            try {
                this.mWeakListener = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mWeakListener = new WeakReference<>(interfaceC13986g);
    }

    public void setReverbType(int i) {
        TXCLog.m82969i(TAG, "int reverbType:" + i);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicReverbType(this.mBGMId, i);
    }

    public void setSpeedRate(float f) {
        TXCLog.m82969i(TAG, "setSpeedRate:" + f);
        this.mSpeedRate = f;
        TXAudioEffectManagerImpl.getCacheInstance().setMusicPlayoutSpeedRate(this.mBGMId, f);
    }

    public void setVolume(float f) {
        TXCLog.m82969i(TAG, "setVolume:" + f);
        this.mVolume = f;
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(this.mBGMId, (int) (f * 100.0f));
    }

    public void startPlay(String str, boolean z) {
        TXCLog.m82969i(TAG, "startPlay:" + str + "record:" + z);
        if (str == null || str.isEmpty()) {
            return;
        }
        if (this.mIsRunning) {
            TXCLog.m82973w(TAG, "BGM is playing, restarting...");
            stopPlay();
        }
        this.mSeekBytes = 0L;
        this.mIsRunning = true;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(this.mBGMId, str);
        audioMusicParam.publish = z;
        audioMusicParam.loopCount = 0;
        audioMusicParam.startTimeMS = this.mStartTimeMS;
        audioMusicParam.endTimeMS = this.mEndTimeMS;
        audioMusicParam.isShortFile = true;
        TXCLog.m82969i(TAG, "start bgm play : filePath = " + str + " publish:" + z + " startTimeMS:" + this.mStartTimeMS + " endTimeMS:" + this.mEndTimeMS + " isShortFile:" + audioMusicParam.isShortFile + "mVolume:" + this.mVolume);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(this.mBGMId, (int) (this.mVolume * 100.0f));
        TXAudioEffectManagerImpl.getCacheInstance().setMusicPlayoutSpeedRate(this.mBGMId, this.mSpeedRate);
        if (z) {
            TXAudioEffectManagerImpl.getCacheInstance().setMuteDataDurationToPublish(this.mBGMId, 200);
        }
        boolean zStartPlayMusic = TXAudioEffectManagerImpl.getCacheInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(this.mBGMId, this);
        if (zStartPlayMusic) {
            onPlayStart();
        } else {
            onPlayEnd(-1);
        }
    }

    public void stopPlay() {
        TXCLog.m82969i(TAG, "stopPlay");
        this.mIsRunning = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(this.mBGMId, null);
            TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(this.mBGMId);
        }
        TXCLog.m82969i(TAG, "stopBGMPlay cost(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i, long j, long j2) {
        onPlayProgress(j, j2);
    }
}
