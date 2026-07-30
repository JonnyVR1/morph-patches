package com.tencent.liteav.audio;

import com.tencent.liteav.audio.impl.Play.TXCMultAudioTrackPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14215f;
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
    private WeakReference<InterfaceC14149g> mWeakListener;

    /* JADX INFO: renamed from: com.tencent.liteav.audio.TXCUGCBGMPlayer$a */
    public static class C14142a {

        /* JADX INFO: renamed from: a */
        private static TXCUGCBGMPlayer f58832a = new TXCUGCBGMPlayer();

        /* JADX INFO: renamed from: a */
        public static TXCUGCBGMPlayer m83847a() {
            return f58832a;
        }
    }

    static {
        C14215f.m84239f();
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
        return C14142a.m83847a();
    }

    private void onPlayEnd(int i) {
        InterfaceC14149g interfaceC14149g;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14149g> weakReference = this.mWeakListener;
                interfaceC14149g = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14149g != null) {
            interfaceC14149g.onPlayEnd(i);
        }
    }

    private void onPlayProgress(long j, long j2) {
        InterfaceC14149g interfaceC14149g;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14149g> weakReference = this.mWeakListener;
                interfaceC14149g = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14149g != null) {
            interfaceC14149g.onPlayProgress(j, j2);
        }
    }

    private void onPlayStart() {
        InterfaceC14149g interfaceC14149g;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14149g> weakReference = this.mWeakListener;
                interfaceC14149g = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14149g != null) {
            interfaceC14149g.onPlayStart();
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
        TXCLog.m84152i(TAG, "pause");
        TXAudioEffectManagerImpl.getCacheInstance().pausePlayMusic(this.mBGMId);
    }

    public void playFromTime(long j, long j2) {
        TXCLog.m84152i(TAG, "startPlayRange:" + j + ", " + j2);
        this.mStartTimeMS = j;
        this.mEndTimeMS = j2;
    }

    public void resume() {
        TXCLog.m84152i(TAG, "resume");
        TXAudioEffectManagerImpl.getCacheInstance().resumePlayMusic(this.mBGMId);
    }

    public void seekBytes(long j) {
        TXCLog.m84152i(TAG, "seekBytes:" + j);
        if (j < 0) {
            TXCLog.m84149e(TAG, "seek bytes can not be negative. change to 0");
            j = 0;
        }
        this.mSeekBytes = j;
        TXAudioEffectManagerImpl.getCacheInstance().seekMusicToPosInBytes(this.mBGMId, j);
    }

    public void setChangerType(int i) {
        TXCLog.m84152i(TAG, "changerType:" + i);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicChangerType(this.mBGMId, i);
    }

    public synchronized void setOnPlayListener(InterfaceC14149g interfaceC14149g) {
        if (interfaceC14149g == null) {
            try {
                this.mWeakListener = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mWeakListener = new WeakReference<>(interfaceC14149g);
    }

    public void setReverbType(int i) {
        TXCLog.m84152i(TAG, "int reverbType:" + i);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicReverbType(this.mBGMId, i);
    }

    public void setSpeedRate(float f) {
        TXCLog.m84152i(TAG, "setSpeedRate:" + f);
        this.mSpeedRate = f;
        TXAudioEffectManagerImpl.getCacheInstance().setMusicPlayoutSpeedRate(this.mBGMId, f);
    }

    public void setVolume(float f) {
        TXCLog.m84152i(TAG, "setVolume:" + f);
        this.mVolume = f;
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(this.mBGMId, (int) (f * 100.0f));
    }

    public void startPlay(String str, boolean z) {
        TXCLog.m84152i(TAG, "startPlay:" + str + "record:" + z);
        if (str == null || str.isEmpty()) {
            return;
        }
        if (this.mIsRunning) {
            TXCLog.m84156w(TAG, "BGM is playing, restarting...");
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
        TXCLog.m84152i(TAG, "start bgm play : filePath = " + str + " publish:" + z + " startTimeMS:" + this.mStartTimeMS + " endTimeMS:" + this.mEndTimeMS + " isShortFile:" + audioMusicParam.isShortFile + "mVolume:" + this.mVolume);
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
        TXCLog.m84152i(TAG, "stopPlay");
        this.mIsRunning = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(this.mBGMId, null);
            TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(this.mBGMId);
        }
        TXCLog.m84152i(TAG, "stopBGMPlay cost(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i, long j, long j2) {
        onPlayProgress(j, j2);
    }
}
