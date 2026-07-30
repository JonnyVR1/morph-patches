package com.immomo.moment.mediautils;

import android.os.Handler;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.service.PushService;
import com.immomo.moment.mediautils.cmds.TimeRangeScale;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p149l.bmw;
import p149l.jpi0;
import p149l.kd1;
import p149l.kwv;
import p149l.tmw;
import p149l.u460;
import p149l.xc1;

/* JADX INFO: loaded from: classes7.dex */
public class AudioSpeedControlPlayer implements C3847d.d, C3847d.b, C3847d.a {
    public static final int AUDIO_NOT_FOUND = 3;
    public static final int DECODER_ERROR = 0;
    public static final int PLAYER_ERROR = 2;
    public static final int PROCESSOR_ERROR = 1;
    private final String TAG;
    private boolean decodeFinished;
    private boolean disableCodec;
    private AbstractC3844b mAudioDecoder;
    private C3847d mAudioPlayer;
    private Object mDecodeSync;
    private volatile boolean mDecoderPaused;
    private int mDuration;
    private int mEnd;
    private Handler mHandler;
    private volatile boolean mIgnoreCount;
    private boolean mIsLooping;
    private boolean mIsReachEnd;
    private boolean mIsUseSoftAudioDecoder;
    private boolean mNeedSeekRange;
    private bmw mOnErrorDotDataListener;
    private OnErrorListener mOnErrorListener;
    private OnPlayPositionListener mOnPlayPositionListener;
    private OnPreparedListener mOnPreparedListener;
    private String mPath;
    private int mPlayerState;
    private int mSampleBits;
    private int mSampleChannels;
    private int mSampleRate;
    private xc1 mScaleProcessor;
    private int mSeekTime;
    private float mSpeed;
    private int mStart;
    private Object mSync;
    private float mVolume;
    private kd1 mVolumeProcessor;
    private int serveCode;
    private final int state_paused;
    private final int state_playing;
    private final int state_prepared;
    private final int state_preparing;
    private final int state_uninitialized;

    public interface OnErrorListener {
        void onError(AudioSpeedControlPlayer audioSpeedControlPlayer, int i);
    }

    public interface OnPlayPositionListener {
        void onPlayPositionListener(AudioSpeedControlPlayer audioSpeedControlPlayer, int i);
    }

    public interface OnPreparedListener {
        void onPrepared(AudioSpeedControlPlayer audioSpeedControlPlayer);
    }

    public interface OnSeekCompleteListener {
        void onSeekComplete(AudioSpeedControlPlayer audioSpeedControlPlayer);
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.AudioSpeedControlPlayer$a */
    public class RunnableC3837a implements Runnable {
        public RunnableC3837a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (AudioSpeedControlPlayer.this.mSync) {
                try {
                    if (!AudioSpeedControlPlayer.this.initAudioDecoder()) {
                        if (AudioSpeedControlPlayer.this.mOnErrorListener != null) {
                            AudioSpeedControlPlayer.this.mOnErrorListener.onError(AudioSpeedControlPlayer.this, 0);
                        }
                        if (AudioSpeedControlPlayer.this.mOnErrorDotDataListener != null) {
                            AudioSpeedControlPlayer.this.mOnErrorDotDataListener.onError(AudioSpeedControlPlayer.this.serveCode + 6001, "Audio Decoder init failed!!!");
                        }
                    }
                    if (AudioSpeedControlPlayer.this.mAudioDecoder != null) {
                        AudioSpeedControlPlayer.this.mAudioDecoder.mo18698m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.AudioSpeedControlPlayer$b */
    public class C3838b implements AbstractC3844b.a {

        /* JADX INFO: renamed from: com.immomo.moment.mediautils.AudioSpeedControlPlayer$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                kwv.m147651a("AudioSpeedControlPlayer", "on prepared");
                if (AudioSpeedControlPlayer.this.mOnPreparedListener != null) {
                    AudioSpeedControlPlayer.this.mOnPreparedListener.onPrepared(AudioSpeedControlPlayer.this);
                }
            }
        }

        public C3838b() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3844b.a
        /* JADX INFO: renamed from: a */
        public void mo18681a(int i, int i2, int i3) {
            MDLog.m7395i("AudioSpeedControlPlayer", "on AudioFormatAvailable mPlayerState:" + AudioSpeedControlPlayer.this.mPlayerState);
            if (AudioSpeedControlPlayer.this.mPlayerState == 1 || AudioSpeedControlPlayer.this.mPlayerState == 3 || AudioSpeedControlPlayer.this.mPlayerState == 4) {
                AudioSpeedControlPlayer.this.mSampleBits = i3;
                AudioSpeedControlPlayer.this.mSampleChannels = i2;
                AudioSpeedControlPlayer.this.mSampleRate = i;
                if (!AudioSpeedControlPlayer.this.initAudioPlayer()) {
                    if (AudioSpeedControlPlayer.this.mOnErrorListener != null) {
                        AudioSpeedControlPlayer.this.mOnErrorListener.onError(AudioSpeedControlPlayer.this, 2);
                    }
                    MDLog.m7391e("AudioSpeedControlPlayer", "AudioPlayer init failed!!!");
                }
                AudioSpeedControlPlayer.this.mPlayerState = 2;
                AudioSpeedControlPlayer.this.mHandler.post(new a());
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.AudioSpeedControlPlayer$c */
    public class C3839c implements AbstractC3844b.b {
        public C3839c() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3844b.b
        /* JADX INFO: renamed from: a */
        public void mo18682a(ByteBuffer byteBuffer, int i, long j) {
            if (j < AudioSpeedControlPlayer.this.mStart * 1000 || i <= 0 || AudioSpeedControlPlayer.this.mIsReachEnd) {
                return;
            }
            if (AudioSpeedControlPlayer.this.mEnd > 0 && j > AudioSpeedControlPlayer.this.mEnd * 1000) {
                MDLog.m7395i("AudioSpeedControlPlayer", "Last audio packet pts:" + j);
                AudioSpeedControlPlayer.this.mIsReachEnd = true;
            }
            while (AudioSpeedControlPlayer.this.mDecoderPaused) {
                try {
                    synchronized (AudioSpeedControlPlayer.this.mDecodeSync) {
                        try {
                            AudioSpeedControlPlayer.this.mDecodeSync.wait(5L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            u460 u460Var = new u460(i);
            byteBuffer.position(0);
            u460Var.m191672a().position(0);
            byteBuffer.get(u460Var.m191672a().array());
            u460Var.m191675d(i, 0, 0, j, 0);
            u460Var.m191672a().position(0);
            byteBuffer.position(0);
            if (AudioSpeedControlPlayer.this.mAudioPlayer != null) {
                AudioSpeedControlPlayer.this.mAudioPlayer.m18739x(u460Var);
            }
        }

        @Override // com.immomo.moment.mediautils.AbstractC3844b.b
        public void onFinished() {
            MDLog.m7389d("AudioSpeedControlPlayer", "onFinished");
            AudioSpeedControlPlayer.this.decodeFinished = true;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.AudioSpeedControlPlayer$d */
    public class C3840d implements tmw {
        public C3840d() {
        }

        @Override // p149l.tmw
        public void onFail(int i, String str) {
            if (AudioSpeedControlPlayer.this.mOnErrorDotDataListener != null) {
                AudioSpeedControlPlayer.this.mOnErrorDotDataListener.onError(AudioSpeedControlPlayer.this.serveCode + i, str);
            }
            MDLog.m7391e("AudioSpeedControlPlayer", "[" + (AudioSpeedControlPlayer.this.serveCode + i) + Constants.AES_SUFFIX + str);
        }
    }

    public AudioSpeedControlPlayer(boolean z, boolean z2) {
        this.TAG = "AudioSpeedControlPlayer";
        this.state_uninitialized = 0;
        this.state_preparing = 1;
        this.state_prepared = 2;
        this.state_paused = 3;
        this.state_playing = 4;
        this.mPlayerState = 0;
        this.mIsUseSoftAudioDecoder = false;
        this.mSampleRate = 44100;
        this.mSampleBits = 16;
        this.mSampleChannels = 2;
        this.mStart = 0;
        this.mEnd = 0;
        this.mDuration = 0;
        this.mSpeed = 1.0f;
        this.mVolume = 1.0f;
        this.mSeekTime = -1;
        this.mIsLooping = true;
        this.mNeedSeekRange = false;
        this.mDecoderPaused = false;
        this.mIgnoreCount = false;
        this.decodeFinished = false;
        this.mSync = new Object();
        this.mDecodeSync = new Object();
        this.disableCodec = false;
        this.mIsReachEnd = false;
        this.mOnErrorDotDataListener = null;
        this.serveCode = 300000;
        MDLog.m7389d("AudioSpeedControlPlayer", PushService.COMMAND_CREATE);
        this.mHandler = new Handler();
        this.disableCodec = z;
        this.mIsUseSoftAudioDecoder = z2;
        MDLog.m7395i("AudioSpeedControlPlayer", "AudioDecoderType:".concat(z2 ? "Soft" : "Hard"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean initAudioDecoder() {
        if (this.mAudioDecoder == null) {
            this.mAudioDecoder = this.mIsUseSoftAudioDecoder ? new C3845c() : new C3843a();
        }
        this.mAudioDecoder.m18702i(new C3838b());
        this.mAudioDecoder.m18701h(false);
        AbstractC3844b abstractC3844b = this.mAudioDecoder;
        if (abstractC3844b != null) {
            if (!abstractC3844b.mo18694e(this.mPath)) {
                return false;
            }
            int iM18700a = ((int) this.mAudioDecoder.m18700a()) / 1000;
            this.mDuration = iM18700a;
            this.mAudioDecoder.mo18696g(0L, iM18700a);
        }
        this.mAudioDecoder.m18703j(new C3839c());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean initAudioPlayer() {
        if (this.mScaleProcessor == null) {
            this.mScaleProcessor = new xc1();
        }
        if (this.mVolumeProcessor == null) {
            this.mVolumeProcessor = new kd1();
        }
        this.mScaleProcessor.mo192814d(this.mSampleRate, this.mSampleBits, this.mSampleChannels);
        this.mVolumeProcessor.mo192814d(this.mSampleRate, this.mSampleBits, this.mSampleChannels);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TimeRangeScale(0L, this.mDuration, this.mSpeed));
        this.mScaleProcessor.m208058g(arrayList);
        this.mScaleProcessor.mo192813a();
        this.mVolumeProcessor.m145613g(this.mVolume);
        this.mVolumeProcessor.mo192813a();
        if (this.mAudioPlayer == null) {
            this.mAudioPlayer = new C3847d();
        }
        this.mAudioPlayer.m18735s(this);
        this.mAudioPlayer.m18737u(new C3840d());
        this.mAudioPlayer.m18735s(this);
        this.mAudioPlayer.m18734r(this);
        this.mAudioPlayer.m18736t(this);
        if (!this.mAudioPlayer.m18730n(this.mSampleRate, this.mSampleBits, this.mSampleChannels)) {
            return false;
        }
        this.mAudioPlayer.m18727j(this.mScaleProcessor);
        this.mAudioPlayer.m18727j(this.mVolumeProcessor);
        this.mAudioPlayer.m18729m();
        return true;
    }

    private void resetState() {
        this.mSpeed = 1.0f;
        this.mStart = 0;
        this.mEnd = 0;
        this.mDuration = 0;
        this.mPath = "";
        this.mIsLooping = true;
        this.mDecoderPaused = false;
        this.mNeedSeekRange = false;
        this.mSeekTime = -1;
        this.mIgnoreCount = false;
    }

    private void resume() {
        kwv.m147651a("AudioSpeedControlPlayer", "resume");
        synchronized (this.mSync) {
            try {
                C3847d c3847d = this.mAudioPlayer;
                if (c3847d != null) {
                    c3847d.m18733q();
                }
                if (this.mAudioDecoder != null) {
                    this.mDecoderPaused = false;
                }
                this.mDecoderPaused = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void seek(int i) {
        kwv.m147651a("AudioSpeedControlPlayer", "seek   =  " + i);
        synchronized (this.mSync) {
            try {
                seekWithOutReset(i);
                C3847d c3847d = this.mAudioPlayer;
                if (c3847d != null) {
                    c3847d.m18732p();
                }
                xc1 xc1Var = this.mScaleProcessor;
                if (xc1Var != null) {
                    xc1Var.mo130259c();
                }
                kd1 kd1Var = this.mVolumeProcessor;
                if (kd1Var != null) {
                    kd1Var.mo130259c();
                }
                this.mIsReachEnd = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void seekWithOutReset(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        kwv.m147651a("AudioSpeedControlPlayer", "seekWithoutReset   =  " + i);
        synchronized (this.mSync) {
            try {
                if (this.mAudioDecoder != null) {
                    this.mIgnoreCount = true;
                    this.mDecoderPaused = false;
                    this.mAudioDecoder.mo18693d(i * 1000);
                    this.mIgnoreCount = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kwv.m147651a("AudioSpeedControlPlayer", "seekWithoutReset  time cost =   " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public int getDuration() {
        return this.mDuration;
    }

    public void isLooping(boolean z) {
        this.mIsLooping = z;
    }

    public boolean isPlaying() {
        return this.mPlayerState == 4;
    }

    @Override // com.immomo.moment.mediautils.C3847d.a
    public void onAudioAvailableBufferCount(int i) {
        if (this.mIgnoreCount) {
            return;
        }
        if (i > 1500) {
            this.mDecoderPaused = true;
            return;
        }
        if (i < 500) {
            this.mDecoderPaused = false;
        } else if (i > 2000 || i < 50) {
            kwv.m147651a("AudioSpeedControlPlayer", "!!!!!!!!! count  = " + i);
        }
    }

    @Override // com.immomo.moment.mediautils.C3847d.b
    public void onAudioOriginPosition(long j) {
        OnPlayPositionListener onPlayPositionListener = this.mOnPlayPositionListener;
        if (onPlayPositionListener != null) {
            onPlayPositionListener.onPlayPositionListener(this, ((int) j) / 1000);
        }
        if (this.mIsLooping) {
            int i = this.mEnd;
            if ((j < i * 1000 || i == 0) && !this.decodeFinished) {
                return;
            }
            kwv.m147651a("AudioSpeedControlPlayer", "seek start " + this.mStart + " mEnd = " + this.mEnd + "  decodeFinished = " + this.decodeFinished + " pts = " + j);
            this.decodeFinished = false;
            seekWithOutReset(this.mStart);
            this.mIsReachEnd = false;
        }
    }

    @Override // com.immomo.moment.mediautils.C3847d.d
    public void onAudioPlayingPosition(long j) {
    }

    public void pause() {
        kwv.m147651a("AudioSpeedControlPlayer", "pause");
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.mSync) {
            try {
                if (this.mPlayerState == 0) {
                    return;
                }
                this.mDecoderPaused = false;
                if (this.mAudioDecoder != null) {
                    this.mDecoderPaused = true;
                }
                C3847d c3847d = this.mAudioPlayer;
                if (c3847d != null) {
                    c3847d.m18729m();
                }
                this.mDecoderPaused = true;
                this.mPlayerState = 3;
                kwv.m147651a("AudioSpeedControlPlayer", "pause time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void prepare() {
        kwv.m147651a("AudioSpeedControlPlayer", "prepare");
        if (this.disableCodec) {
            return;
        }
        if (!TextUtils.isEmpty(this.mPath)) {
            this.mPlayerState = 1;
            jpi0.m142740d(2, new RunnableC3837a());
            return;
        }
        OnErrorListener onErrorListener = this.mOnErrorListener;
        if (onErrorListener != null) {
            onErrorListener.onError(this, 3);
        }
        bmw bmwVar = this.mOnErrorDotDataListener;
        if (bmwVar != null) {
            bmwVar.onError(this.serveCode + 6002, "Audio file not found!!!");
        }
    }

    public void release() {
        kwv.m147651a("AudioSpeedControlPlayer", "release start");
        synchronized (this.mSync) {
            this.mDecoderPaused = false;
            this.mHandler.removeCallbacksAndMessages(null);
            if (this.mAudioDecoder != null) {
                this.mIgnoreCount = true;
                this.mDecoderPaused = false;
                try {
                    this.mSync.wait(10L);
                } catch (Exception unused) {
                }
                this.mAudioDecoder.mo18692c();
                this.mAudioDecoder = null;
            }
            C3847d c3847d = this.mAudioPlayer;
            if (c3847d != null) {
                c3847d.m18731o();
                this.mAudioPlayer = null;
            }
            xc1 xc1Var = this.mScaleProcessor;
            if (xc1Var != null) {
                xc1Var.m208057f();
                this.mScaleProcessor = null;
            }
            kd1 kd1Var = this.mVolumeProcessor;
            if (kd1Var != null) {
                kd1Var.m145612f();
                this.mVolumeProcessor = null;
            }
            resetState();
            this.mPlayerState = 0;
            this.decodeFinished = false;
        }
        kwv.m147651a("AudioSpeedControlPlayer", "release end");
    }

    public void reset() {
        kwv.m147651a("AudioSpeedControlPlayer", "reset");
        if (this.mPlayerState == 0) {
            return;
        }
        release();
    }

    public boolean seekPlayTime(int i) {
        kwv.m147651a("AudioSpeedControlPlayer", "seekPlayTime = " + i);
        synchronized (this.mSync) {
            try {
                if (this.mPlayerState == 0) {
                    return false;
                }
                if (i >= this.mStart && i <= this.mEnd) {
                    seek(i);
                    this.mSeekTime = i;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean setDataSource(String str) {
        kwv.m147651a("AudioSpeedControlPlayer", "setDataSource " + str);
        if (this.mPlayerState != 0) {
            return false;
        }
        this.mPath = str;
        return true;
    }

    public void setOnErrorDotDataListener(bmw bmwVar) {
        this.mOnErrorDotDataListener = bmwVar;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    public void setOnPlayPositionListener(OnPlayPositionListener onPlayPositionListener) {
        this.mOnPlayPositionListener = onPlayPositionListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    public void setPlaySpeed(float f) {
        kwv.m147651a("AudioSpeedControlPlayer", "setPlaySpeed = " + f);
        synchronized (this.mSync) {
            try {
                if (f != this.mSpeed) {
                    this.mSpeed = f;
                    xc1 xc1Var = this.mScaleProcessor;
                    if (xc1Var != null) {
                        xc1Var.m208059h(f);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean setPlayTimeRange(int i, int i2) {
        kwv.m147651a("AudioSpeedControlPlayer", "setPlayTimeRange  start = " + i + "  end = " + i2);
        synchronized (this.mSync) {
            try {
                int i3 = this.mPlayerState;
                if (i3 == 0) {
                    this.mStart = i;
                    this.mEnd = i2;
                    this.mNeedSeekRange = true;
                } else if (i3 == 3 || i3 == 2) {
                    this.mStart = i;
                    this.mEnd = i2;
                    if (this.mNeedSeekRange) {
                        this.mNeedSeekRange = false;
                        int i4 = this.mSeekTime;
                        if (i4 > i && i4 < i2) {
                            seek(i4);
                        } else if (i != 0) {
                            seek(i);
                        }
                    } else {
                        seek(i);
                    }
                } else if (i3 == 4) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setSoftAudioDecoder(boolean z) {
        MDLog.m7389d("AudioSpeedControlPlayer", "AudioDecoderType:".concat(z ? "Soft" : "Hard"));
        this.mIsUseSoftAudioDecoder = z;
    }

    public void setVolume(float f) {
        kwv.m147651a("AudioSpeedControlPlayer", "setVolume");
        synchronized (this.mSync) {
            try {
                if (f != this.mVolume) {
                    this.mVolume = f;
                    kd1 kd1Var = this.mVolumeProcessor;
                    if (kd1Var != null) {
                        kd1Var.m145613g(f);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void start() {
        kwv.m147651a("AudioSpeedControlPlayer", "start  play");
        synchronized (this.mSync) {
            try {
                if (this.mAudioDecoder != null) {
                    if (this.mNeedSeekRange) {
                        setPlayTimeRange(this.mStart, this.mEnd);
                        this.mNeedSeekRange = false;
                    }
                    MDLog.m7395i("AudioSpeedControlPlayer", "mPlayerState:" + this.mPlayerState);
                    int i = this.mPlayerState;
                    if (i == 2 || i == 3) {
                        resume();
                        this.mPlayerState = 4;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AudioSpeedControlPlayer(boolean z) {
        this.TAG = "AudioSpeedControlPlayer";
        this.state_uninitialized = 0;
        this.state_preparing = 1;
        this.state_prepared = 2;
        this.state_paused = 3;
        this.state_playing = 4;
        this.mPlayerState = 0;
        this.mIsUseSoftAudioDecoder = false;
        this.mSampleRate = 44100;
        this.mSampleBits = 16;
        this.mSampleChannels = 2;
        this.mStart = 0;
        this.mEnd = 0;
        this.mDuration = 0;
        this.mSpeed = 1.0f;
        this.mVolume = 1.0f;
        this.mSeekTime = -1;
        this.mIsLooping = true;
        this.mNeedSeekRange = false;
        this.mDecoderPaused = false;
        this.mIgnoreCount = false;
        this.decodeFinished = false;
        this.mSync = new Object();
        this.mDecodeSync = new Object();
        this.disableCodec = false;
        this.mIsReachEnd = false;
        this.mOnErrorDotDataListener = null;
        this.serveCode = 300000;
        MDLog.m7389d("AudioSpeedControlPlayer", PushService.COMMAND_CREATE);
        this.mHandler = new Handler();
        this.disableCodec = z;
    }

    public AudioSpeedControlPlayer() {
        this(false);
    }
}
