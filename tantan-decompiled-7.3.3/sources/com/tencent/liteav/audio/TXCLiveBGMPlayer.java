package com.tencent.liteav.audio;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14215f;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class TXCLiveBGMPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final int PLAY_ERR_OPEN = -1;
    private static final int PLAY_SUCCESS = 0;
    private static final String TAG = "AudioCenter:TXCLiveBGMPlayer";
    private int mBGMId;
    private final Handler mHandler;
    private boolean mIsPause;
    private boolean mIsRunning;
    private WeakReference<InterfaceC14149g> mWeakListener;

    /* JADX INFO: renamed from: com.tencent.liteav.audio.TXCLiveBGMPlayer$a */
    public static class C14139a {

        /* JADX INFO: renamed from: a */
        private static TXCLiveBGMPlayer f58830a = new TXCLiveBGMPlayer();

        /* JADX INFO: renamed from: a */
        public static TXCLiveBGMPlayer m83845a() {
            return f58830a;
        }
    }

    static {
        C14215f.m84239f();
    }

    private TXCLiveBGMPlayer() {
        this.mIsRunning = false;
        this.mIsPause = false;
        this.mWeakListener = null;
        this.mBGMId = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public static TXCLiveBGMPlayer getInstance() {
        return C14139a.m83845a();
    }

    private void onPlayEnd(final int i) {
        final InterfaceC14149g interfaceC14149g;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14149g> weakReference = this.mWeakListener;
                interfaceC14149g = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXCLiveBGMPlayer.2
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC14149g interfaceC14149g2 = interfaceC14149g;
                if (interfaceC14149g2 != null) {
                    interfaceC14149g2.onPlayEnd(i);
                }
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0027
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private void onPlayProgress(final long r9, final long r11) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.ref.WeakReference<com.tencent.liteav.audio.g> r0 = r8.mWeakListener     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Ld
            com.tencent.liteav.audio.g r0 = (com.tencent.liteav.audio.InterfaceC14149g) r0     // Catch: java.lang.Throwable -> Ld
        Lb:
            r3 = r0
            goto L13
        Ld:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L25
        L11:
            r0 = 0
            goto Lb
        L13:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L22
            android.os.Handler r0 = r8.mHandler
            com.tencent.liteav.audio.TXCLiveBGMPlayer$3 r1 = new com.tencent.liteav.audio.TXCLiveBGMPlayer$3
            r2 = r8
            r4 = r9
            r6 = r11
            r1.<init>()
            r0.post(r1)
            return
        L22:
            r0 = move-exception
            r2 = r8
        L24:
            r9 = r0
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r9
        L27:
            r0 = move-exception
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.TXCLiveBGMPlayer.onPlayProgress(long, long):void");
    }

    private void onPlayStart(int i) {
        final InterfaceC14149g interfaceC14149g;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14149g> weakReference = this.mWeakListener;
                interfaceC14149g = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mHandler.post(new Runnable() { // from class: com.tencent.liteav.audio.TXCLiveBGMPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC14149g interfaceC14149g2 = interfaceC14149g;
                if (interfaceC14149g2 != null) {
                    interfaceC14149g2.onPlayStart();
                }
            }
        });
    }

    public int getBGMDuration(String str) {
        return (int) TXAudioEffectManagerImpl.getInstance().getMusicDurationInMS(str);
    }

    public long getBGMGetCurrentProgressInMs(String str) {
        if (str == null) {
            return TXAudioEffectManagerImpl.getInstance().getMusicCurrentPosInMS(this.mBGMId);
        }
        return 0L;
    }

    public boolean isPlaying() {
        return this.mIsRunning;
    }

    public boolean isRunning() {
        return this.mIsRunning && !this.mIsPause;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i, int i2) {
        onPlayEnd(i2);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i, int i2) {
        onPlayStart(i2);
    }

    public boolean pause() {
        TXCLog.m84152i(TAG, "pause");
        this.mIsPause = true;
        TXAudioEffectManagerImpl.getInstance().pausePlayMusic(this.mBGMId);
        return true;
    }

    public boolean resume() {
        TXCLog.m84152i(TAG, "resume");
        this.mIsPause = false;
        TXAudioEffectManagerImpl.getInstance().resumePlayMusic(this.mBGMId);
        return true;
    }

    public void setBGMPosition(int i) {
        TXAudioEffectManagerImpl.getInstance().seekMusicToPosInMS(this.mBGMId, i);
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

    public void setPitch(float f) {
        TXAudioEffectManagerImpl.getInstance().setMusicPitch(this.mBGMId, f);
    }

    public boolean setPlayoutVolume(float f) {
        TXCLog.m84152i(TAG, "setPlayoutVolume:" + f);
        TXAudioEffectManagerImpl.getInstance().setMusicPlayoutVolume(this.mBGMId, (int) (f * 100.0f));
        return true;
    }

    public boolean setPublishVolume(float f) {
        TXAudioEffectManagerImpl.getInstance().setMusicPublishVolume(this.mBGMId, (int) (f * 100.0f));
        return true;
    }

    public boolean setVolume(float f) {
        TXCLog.m84152i(TAG, "setVolume");
        TXAudioEffectManagerImpl.getInstance().setMusicVolume(this.mBGMId, (int) (f * 100.0f));
        return true;
    }

    public boolean startPlay(String str) {
        if (str == null || str.isEmpty()) {
            TXCLog.m84149e(TAG, "start live bgm failed! invalid params!");
            return false;
        }
        this.mIsRunning = true;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(this.mBGMId, str);
        audioMusicParam.publish = true;
        audioMusicParam.loopCount = 0;
        boolean zStartPlayMusic = TXAudioEffectManagerImpl.getInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getInstance().setMusicObserver(this.mBGMId, this);
        if (zStartPlayMusic) {
            TXCLog.m84152i(TAG, "start bgm play : filePath = ".concat(str));
            return true;
        }
        onPlayEnd(-1);
        return false;
    }

    public void stopAll() {
        TXAudioEffectManagerImpl.getInstance().stopAllMusics();
        TXAudioEffectManagerImpl.getAutoCacheHolder().stopAllMusics();
        TXAudioEffectManagerImpl.getCacheInstance().stopAllMusics();
    }

    public boolean stopPlay() {
        this.mIsRunning = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TXAudioEffectManagerImpl.getInstance().setMusicObserver(this.mBGMId, null);
        TXAudioEffectManagerImpl.getInstance().stopPlayMusic(this.mBGMId);
        this.mIsPause = false;
        TXCLog.m84152i(TAG, "stopBGMPlay cost(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return true;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i, long j, long j2) throws Throwable {
        onPlayProgress(j, j2);
    }
}
