package com.tencent.liteav.audio;

import android.os.Handler;
import android.os.Looper;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14215f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TXAudioEffectManagerImpl implements TXAudioEffectManager {
    private static final int EFFECT_PLAYER_ID_TYPE = 2;
    private static final int NEW_BGM_PLAYER_ID_TYPE = 1;
    private static final int OLD_BGM_PLAYER_ID_TYPE = 0;
    private static final String TAG = "AudioCenter:TXAudioEffectManager";
    private final int mIdType;
    private final List<Long> mPlayingMusicIDList;
    private static final HashMap<Long, TXAudioEffectManager.TXMusicPlayObserver> mMusicObserverMap = new HashMap<>();
    private static final Handler mMainHandler = new Handler(Looper.getMainLooper());

    public static class AudioEffectManagerAutoCacheHolder {
        private static final TXAudioEffectManagerImpl INSTANCE = new TXAudioEffectManagerImpl(1);

        private AudioEffectManagerAutoCacheHolder() {
        }
    }

    public static class AudioEffectManagerCacheHolder {
        private static final TXAudioEffectManagerImpl INSTANCE = new TXAudioEffectManagerImpl(2);

        private AudioEffectManagerCacheHolder() {
        }
    }

    public static class AudioEffectManagerHolder {
        private static final TXAudioEffectManagerImpl INSTANCE = new TXAudioEffectManagerImpl(0);

        private AudioEffectManagerHolder() {
        }
    }

    static {
        C14215f.m84239f();
        nativeClassInit();
    }

    private TXAudioEffectManagerImpl(int i) {
        this.mPlayingMusicIDList = new ArrayList();
        this.mIdType = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long convertIdToInt64(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    public static TXAudioEffectManagerImpl getAutoCacheHolder() {
        return AudioEffectManagerAutoCacheHolder.INSTANCE;
    }

    public static TXAudioEffectManagerImpl getCacheInstance() {
        return AudioEffectManagerCacheHolder.INSTANCE;
    }

    public static TXAudioEffectManagerImpl getInstance() {
        return AudioEffectManagerHolder.INSTANCE;
    }

    private static native void nativeClassInit();

    private native long nativeGetCurrentPositionInMs(long j);

    private static native long nativeGetDurationMSByPath(String str);

    private native void nativePause(long j);

    private native void nativeResume(long j);

    private native void nativeSeekToPosition(long j, long j2);

    private native void nativeSeekToTime(long j, int i);

    private native void nativeSetAllVolume(int i);

    private native void nativeSetChangerType(long j, int i);

    private native void nativeSetMuteDataDurationToPublish(long j, int i);

    private native void nativeSetPitch(long j, float f);

    private native void nativeSetPlayoutSpeedRate(long j, float f);

    private native void nativeSetPlayoutVolume(long j, int i);

    private native void nativeSetPublishVolume(long j, int i);

    private native void nativeSetReverbType(long j, int i);

    private native void nativeSetSpeedRate(long j, float f);

    private native void nativeSetVolume(long j, int i);

    private native boolean nativeStartPlay(long j, String str, int i, boolean z, boolean z2);

    private native void nativeStartPlayRange(long j, long j2, long j3);

    private native void nativeStopPlay(long j);

    public static void onEffectFinish(final long j, final int i) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.3
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.m84152i(TXAudioEffectManagerImpl.TAG, "onEffectFinish -> effect id = " + j + ", errCode = " + i);
                if (TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j)) != null) {
                    ((TXAudioEffectManager.TXMusicPlayObserver) TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j))).onComplete((int) j, i);
                }
            }
        });
    }

    public static void onEffectProgress(final long j, final long j2, final long j3) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.5
            @Override // java.lang.Runnable
            public void run() {
                if (TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j)) != null) {
                    ((TXAudioEffectManager.TXMusicPlayObserver) TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j))).onPlayProgress((int) j, j2, j3);
                }
            }
        });
    }

    public static void onEffectStart(final long j, final int i) {
        mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.4
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.m84152i(TXAudioEffectManagerImpl.TAG, "onEffectStart -> effect id = " + j + ", errCode = " + i);
                if (TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j)) != null) {
                    ((TXAudioEffectManager.TXMusicPlayObserver) TXAudioEffectManagerImpl.mMusicObserverMap.get(Long.valueOf(j))).onStart((int) j, i);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void enableVoiceEarMonitor(boolean z) {
        TXCAudioEngine.enableAudioEarMonitoring(z);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicCurrentPosInMS(int i) {
        return nativeGetCurrentPositionInMs(convertIdToInt64(this.mIdType, i));
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicDurationInMS(String str) {
        return nativeGetDurationMSByPath(str);
    }

    public void interruptAllMusics() {
        TXCLog.m84152i(TAG, "interruptAllMusics");
        Iterator<Long> it = this.mPlayingMusicIDList.iterator();
        while (it.hasNext()) {
            nativePause(it.next().longValue());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void pausePlayMusic(int i) {
        long jConvertIdToInt64 = convertIdToInt64(this.mIdType, i);
        this.mPlayingMusicIDList.remove(Long.valueOf(jConvertIdToInt64));
        nativePause(jConvertIdToInt64);
    }

    public void recoverAllMusics() {
        TXCLog.m84152i(TAG, "recoverAllMusics");
        Iterator<Long> it = this.mPlayingMusicIDList.iterator();
        while (it.hasNext()) {
            nativeResume(it.next().longValue());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void resumePlayMusic(int i) {
        long jConvertIdToInt64 = convertIdToInt64(this.mIdType, i);
        if (!this.mPlayingMusicIDList.contains(Long.valueOf(jConvertIdToInt64))) {
            this.mPlayingMusicIDList.add(Long.valueOf(jConvertIdToInt64));
        }
        nativeResume(jConvertIdToInt64);
    }

    public void seekMusicToPosInBytes(int i, long j) {
        nativeSeekToPosition(convertIdToInt64(this.mIdType, i), j);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void seekMusicToPosInMS(int i, int i2) {
        nativeSeekToTime(convertIdToInt64(this.mIdType, i), i2);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setAllMusicVolume(int i) {
        nativeSetAllVolume(i);
    }

    public void setAudioPlayoutVolume(int i) {
        TXCAudioEngine.getInstance().setMixingPlayoutVolume(i / 100.0f);
    }

    public void setMusicChangerType(int i, int i2) {
        nativeSetChangerType(convertIdToInt64(this.mIdType, i), i2);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicObserver(final int i, final TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                if (tXMusicPlayObserver == null) {
                    TXAudioEffectManagerImpl.mMusicObserverMap.remove(Long.valueOf(TXAudioEffectManagerImpl.convertIdToInt64(TXAudioEffectManagerImpl.this.mIdType, i)));
                } else {
                    TXAudioEffectManagerImpl.mMusicObserverMap.put(Long.valueOf(TXAudioEffectManagerImpl.convertIdToInt64(TXAudioEffectManagerImpl.this.mIdType, i)), tXMusicPlayObserver);
                }
                TXCLog.m84153i(TXAudioEffectManagerImpl.TAG, "setMusicObserver map count: %d", Integer.valueOf(TXAudioEffectManagerImpl.mMusicObserverMap.size()));
            }
        };
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = mMainHandler;
        if (looperMyLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPitch(int i, float f) {
        nativeSetPitch(convertIdToInt64(this.mIdType, i), f);
    }

    public void setMusicPlayoutSpeedRate(int i, float f) {
        nativeSetPlayoutSpeedRate(convertIdToInt64(this.mIdType, i), f);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPlayoutVolume(int i, int i2) {
        nativeSetPlayoutVolume(convertIdToInt64(this.mIdType, i), i2);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPublishVolume(int i, int i2) {
        nativeSetPublishVolume(convertIdToInt64(this.mIdType, i), i2);
    }

    public void setMusicReverbType(int i, int i2) {
        nativeSetReverbType(convertIdToInt64(this.mIdType, i), i2);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicSpeedRate(int i, float f) {
        nativeSetSpeedRate(convertIdToInt64(this.mIdType, i), f);
    }

    public void setMusicVolume(int i, int i2) {
        TXCLog.m84152i(TAG, "setMusicVolume " + i2);
        nativeSetVolume(convertIdToInt64(this.mIdType, i), i2);
    }

    public void setMuteDataDurationToPublish(int i, int i2) {
        nativeSetMuteDataDurationToPublish(convertIdToInt64(this.mIdType, i), i2);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceCaptureVolume(int i) {
        TXCAudioEngine.getInstance().setSoftwareCaptureVolume(i / 100.0f);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        TXCAudioEngine.getInstance().setVoiceChangerType(tXVoiceChangerType);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceEarMonitorVolume(int i) {
        TXCAudioEngine.setAudioEarMonitoringVolume(i);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        TXCAudioEngine.getInstance().setReverbType(tXVoiceReverbType);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean startPlayMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        TXCLog.m84152i(TAG, "startPlay");
        long j = audioMusicParam.startTimeMS;
        long j2 = audioMusicParam.endTimeMS;
        long j3 = j < 0 ? 0L : j;
        long j4 = j2 < 0 ? 0L : j2;
        long jConvertIdToInt64 = convertIdToInt64(this.mIdType, audioMusicParam.f58820id);
        if (!this.mPlayingMusicIDList.contains(Long.valueOf(jConvertIdToInt64))) {
            this.mPlayingMusicIDList.add(Long.valueOf(jConvertIdToInt64));
        }
        nativeStartPlayRange(jConvertIdToInt64, j3, j4);
        return nativeStartPlay(jConvertIdToInt64, audioMusicParam.path, audioMusicParam.loopCount, audioMusicParam.publish, audioMusicParam.isShortFile);
    }

    public void stopAllMusics() {
        TXCLog.m84152i(TAG, "stopAllMusics");
        Iterator<Long> it = this.mPlayingMusicIDList.iterator();
        while (it.hasNext()) {
            final long jLongValue = it.next().longValue();
            nativeStopPlay(jLongValue);
            mMainHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXAudioEffectManagerImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    TXAudioEffectManagerImpl.mMusicObserverMap.remove(Long.valueOf(jLongValue));
                }
            });
        }
        this.mPlayingMusicIDList.clear();
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void stopPlayMusic(int i) {
        long jConvertIdToInt64 = convertIdToInt64(this.mIdType, i);
        this.mPlayingMusicIDList.remove(Long.valueOf(jConvertIdToInt64));
        nativeStopPlay(jConvertIdToInt64);
    }
}
