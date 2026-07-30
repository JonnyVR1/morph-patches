package com.immomo.mediacore.sink;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLContext;
import p149l.fjx;
import p149l.g16;
import p149l.gdm;
import p149l.n8c;
import p149l.rdc0;

/* JADX INFO: loaded from: classes7.dex */
public class IjkWriter extends SinkBase {
    private static final String CLASS_LABEL = "IjkWriter";
    private static final String LOG_TAG = "IjkWriter";
    public static final int NETERROR = 300;
    private static volatile boolean mIsLibLoaded = false;
    private static volatile boolean mIsNativeInitialized = false;
    private static gdm sLocalLibLoader = new gdm() { // from class: com.immomo.mediacore.sink.IjkWriter.1
        @Override // p149l.gdm
        public void loadLibrary(String str) throws SecurityException, UnsatisfiedLinkError {
            rdc0.m178959a(g16.f100119a, str);
        }
    };
    public NotifyCenter mContext;
    private boolean mOnlyAudio;
    public long mNativeMediaStreamer = 0;
    private long mAudioTimeStampBase = 0;
    private long mVideoTimeStampBase = 0;
    private long mPreAudioTimeStamp = 0;
    private long mPreVideoTimeStamp = 0;
    private long mAudioTimeStamp = 0;
    private long mVideoTimeStamp = 0;
    public long mPreSendBitB = 0;
    private long mSendVideoByte = 0;
    private long mSendAudioByte = 0;
    public long mAverageSendBitRateB = 0;
    public long mPreCacleBitRateTime = 0;
    private Handler mUIHandler = new Handler(Looper.getMainLooper());
    private String mOutputUrl = null;
    protected String mProxyConfig = null;
    protected String mProxyMediaConfig = null;
    protected Object mFPreparedSyncObject = new Object();
    private AtomicBoolean mLastError = new AtomicBoolean(false);
    private int videoWidth = 0;
    private int videoHeight = 0;
    private long lastdts1 = -1;
    private long lastpts1 = -1;
    private long lastdts = -1;
    private long lastpts = -1;
    private long startToGetAudioPacketsMs = -1;
    private long lastAudioBitrateCalcTimeMs = 0;
    private long lastVideoBitrateCalcTimeMs = 0;
    private long pre_audioTotalSendBytes = 0;
    private long pre_videoTotalSendBytes = 0;

    public IjkWriter(NotifyCenter notifyCenter, boolean z) {
        this.mOnlyAudio = false;
        loadLibrariesOnce(null);
        initNativeOnce();
        native_setup(new WeakReference(this));
        this.mOnlyAudio = z;
        this.mContext = notifyCenter;
    }

    private native long _getAcodecSendSize();

    private native float _getPropertyFloat(int i, float f);

    private native long _getPropertyLong(int i, long j);

    private native long _getRtmpSendSize();

    private native String _getServerIpAddr();

    private native long _getVcodecSendSize();

    private native long _getWriteByte();

    private native void _release();

    private native void _setAudioChannelNum(int i);

    private native void _setAudioEncoder(int i);

    private native void _setAudioEncodingBitRate(int i);

    private native void _setAudioSamplingRate(int i);

    private native void _setAudioSource(int i);

    private native void _setBitRateAdaptEnable(int i);

    private native void _setDropCache(int i, int i2, int i3);

    private native void _setPropertyFloat(int i, float f);

    private native void _setPropertyLong(int i, long j);

    private native void _setStreamerInOutAndType(int i, String str, String str2);

    private native void _setVideoEncoder(int i);

    private native void _setVideoEncodingBitRate(int i);

    private native void _setVideoFrameRate(int i);

    private native void _setVideoSize(int i, int i2);

    private native void _setVideoSource(int i);

    private native void _start();

    private native void _stop();

    private static void initNativeOnce() {
        synchronized (IjkWriter.class) {
            try {
                if (!mIsNativeInitialized) {
                    native_init();
                    mIsNativeInitialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void loadLibrariesOnce(gdm gdmVar) {
        synchronized (IjkWriter.class) {
            if (!mIsLibLoaded) {
                if (gdmVar == null) {
                    gdmVar = sLocalLibLoader;
                }
                try {
                    gdmVar.loadLibrary("ijkstreamer");
                    mIsLibLoaded = true;
                } catch (UnsatisfiedLinkError unused) {
                    mIsLibLoaded = false;
                }
            }
        }
    }

    private final native void native_finalize();

    private static final native void native_init();

    private final native void native_setup(Object obj) throws IllegalStateException;

    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        NotifyCenter notifyCenter;
        IjkWriter ijkWriter = (IjkWriter) ((WeakReference) obj).get();
        if (ijkWriter != null && (notifyCenter = ijkWriter.mContext) != null && notifyCenter.getWriter() != null && ijkWriter == ijkWriter.mContext.getWriter()) {
            ijkWriter.mContext.notify(i, i2, i3, ijkWriter);
            if (i == 300) {
                ijkWriter.getLastError().set(true);
                ijkWriter.notifyPrepared();
            }
        }
        if (i == 100) {
            ijkWriter.notifyPrepared();
        }
    }

    private native void setMaxDuration(int i);

    private native void setMaxFileSize(long j);

    @Override // com.immomo.mediacore.sink.SinkBase
    public void SabineEffectReset() {
        NotifyCenter notifyCenter = this.mContext;
        if (notifyCenter != null) {
            notifyCenter.notifyEffectReset();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void SabineEffectSet(int i, int i2, float f) {
        NotifyCenter notifyCenter = this.mContext;
        if (notifyCenter != null) {
            notifyCenter.notifyEffectSet(i, i2, f);
        }
    }

    public native void _prepare();

    public native void _setMediaCodecEnable(int i);

    public final native void _writeAudio(long j, ByteBuffer byteBuffer, long j2);

    public final native void _writeAudioExtradata(ByteBuffer byteBuffer, long j);

    public final native void _writeAudioPacket(long j, ByteBuffer byteBuffer, long j2);

    public final native void _writeVideo(long j, ByteBuffer byteBuffer, long j2);

    public final native void _writeVideoExtradata(ByteBuffer byteBuffer, long j);

    public final native void _writeVideoPacket(long j, ByteBuffer byteBuffer, long j2, boolean z);

    public final native void _writeVideoPacket2(long j, long j2, ByteBuffer byteBuffer, long j3, boolean z);

    public final native void _writeVideoPacketWH(long j, ByteBuffer byteBuffer, long j2, boolean z, int i, int i2);

    public void adjustAef(int i, boolean z) {
        NotifyCenter notifyCenter = this.mContext;
        if (notifyCenter != null) {
            notifyCenter.notifyAdjustAef(i, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void adjustEQ(int i, boolean z) {
        NotifyCenter notifyCenter = this.mContext;
        if (notifyCenter != null) {
            notifyCenter.notifyAdjustEQ(i, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void adjustEf(int i, int i2) {
        NotifyCenter notifyCenter = this.mContext;
        if (notifyCenter != null) {
            notifyCenter.notifyAdjustEf(i, i2);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void adjustTune(int i, boolean z) {
        NotifyCenter notifyCenter = this.mContext;
        if (notifyCenter != null) {
            notifyCenter.notifyAdjustTune(i, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAVDiff() {
        return this.mAudioTimeStamp - this.mVideoTimeStamp;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAcodecSendSize() {
        try {
            return _getAcodecSendSize();
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public int getAdapt() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    @Override // com.immomo.mediacore.sink.SinkBase
    public synchronized int getAudioBitRate() {
        long j;
        try {
            long j2 = this.mSendAudioByte;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j3 = this.pre_audioTotalSendBytes;
            if (j2 > j3) {
                long j4 = this.lastAudioBitrateCalcTimeMs;
                if (jCurrentTimeMillis > j4) {
                    j = ((j2 - j3) * 8) / (jCurrentTimeMillis - j4);
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            this.pre_audioTotalSendBytes = j2;
            this.lastAudioBitrateCalcTimeMs = jCurrentTimeMillis;
        } catch (Throwable th) {
            throw th;
        }
        return (int) j;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAudioCacheSize() {
        return getPropertyLong(20009, 0L);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAudioRxbytes() {
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAudioTxbytes() {
        return this.mSendAudioByte;
    }

    public long getAudioWritedDPackets() {
        return getPropertyLong(20020, 0L);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAverageSendBitRateB() {
        return this.mAverageSendBitRateB;
    }

    public AtomicBoolean getLastError() {
        return this.mLastError;
    }

    public String getOutputUrl() {
        return this.mOutputUrl;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public float getPropertyFloat(int i, float f) {
        try {
            return _getPropertyFloat(i, f);
        } catch (Error e) {
            e.printStackTrace();
            return 0.0f;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0f;
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getPropertyLong(int i, long j) {
        try {
            return _getPropertyLong(i, j);
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getPublisherVideoHigh() {
        if (this.mOnlyAudio) {
            return 0;
        }
        NotifyCenter notifyCenter = this.mContext;
        VideoQuality videoQuality = notifyCenter != null ? notifyCenter.getVideoQuality() : null;
        if (videoQuality != null) {
            return videoQuality.resX;
        }
        return 0;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getPublisherVideoWidth() {
        if (this.mOnlyAudio) {
            return 0;
        }
        NotifyCenter notifyCenter = this.mContext;
        VideoQuality videoQuality = notifyCenter != null ? notifyCenter.getVideoQuality() : null;
        if (videoQuality != null) {
            return videoQuality.resX;
        }
        return 0;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getRtmpSendSize() {
        try {
            long j_getRtmpSendSize = _getRtmpSendSize();
            if (j_getRtmpSendSize < 0) {
                return 0L;
            }
            return j_getRtmpSendSize;
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getRxbytes() {
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public String getServerIpAddr() {
        return _getServerIpAddr();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getTxbytes() {
        return getRtmpSendSize();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getVcodecSendSize() {
        try {
            return _getVcodecSendSize();
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    @Override // com.immomo.mediacore.sink.SinkBase
    public synchronized int getVideoBitRate() {
        long j;
        try {
            long rtmpSendSize = getRtmpSendSize();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.pre_videoTotalSendBytes;
            if (rtmpSendSize > j2) {
                long j3 = this.lastVideoBitrateCalcTimeMs;
                if (jCurrentTimeMillis > j3) {
                    j = ((rtmpSendSize - j2) * 8) / (jCurrentTimeMillis - j3);
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            this.pre_videoTotalSendBytes = rtmpSendSize;
            this.lastVideoBitrateCalcTimeMs = jCurrentTimeMillis;
        } catch (Throwable th) {
            throw th;
        }
        return (int) j;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getVideoCacheSize() {
        return getPropertyLong(20006, 0L);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getVideoPacketCache() {
        return getPropertyLong(20005, 0L);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getVideoPts() {
        return this.mVideoTimeStamp;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getVideoRxbytes() {
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getVideoTxbytes() {
        return this.mSendVideoByte;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getWriteByte() {
        try {
            long j_getWriteByte = _getWriteByte();
            n8c.m158485c("IjkWriter", "----getWriteByte: " + j_getWriteByte);
            return j_getWriteByte;
        } catch (Error e) {
            e.printStackTrace();
            n8c.m158485c("IjkWriter", "----getWriteByte: ----0");
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            n8c.m158485c("IjkWriter", "----getWriteByte: ----0");
            return 0L;
        }
    }

    public void notifyPrepared() {
        synchronized (this.mFPreparedSyncObject) {
            this.mFPreparedSyncObject.notifyAll();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void pause() {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public boolean prepare() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        try {
            setErrorCode(0);
            n8c.m158485c("zjlfound", "prepare:");
            this.mLastError.set(false);
            synchronized (this.mFPreparedSyncObject) {
                _prepare();
                try {
                    this.mFPreparedSyncObject.wait(20000L);
                } catch (InterruptedException unused) {
                }
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.mLastError.compareAndSet(true, false)) {
            return false;
        }
        getServerIpAddr();
        if (System.currentTimeMillis() - jCurrentTimeMillis >= 20000) {
            this.mUIHandler.removeCallbacksAndMessages(null);
            this.mUIHandler.post(new Runnable() { // from class: com.immomo.mediacore.sink.IjkWriter.2
                @Override // java.lang.Runnable
                public void run() {
                    IjkWriter ijkWriter = IjkWriter.this;
                    if (ijkWriter.mContext != null) {
                        if (ijkWriter.mAudioTimeStamp == 0 || IjkWriter.this.mVideoTimeStamp == 0) {
                            IjkWriter ijkWriter2 = IjkWriter.this;
                            ijkWriter2.mContext.notify(300, -304, 1, ijkWriter2);
                        }
                    }
                }
            });
        } else {
            z = true;
        }
        n8c.m158485c("zjlfound", "prepare:end ret :" + z);
        return z;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void release() {
        this.mContext = null;
        this.mUIHandler.removeCallbacksAndMessages(null);
        notifyPrepared();
        try {
            _release();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        n8c.m158485c("zjlfound", "release:");
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void resume() {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setAudioChannelNum(int i) {
        try {
            _setAudioChannelNum(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setAudioEncoder(int i) {
        try {
            _setAudioEncoder(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setAudioEncodingBitRate(int i) {
        try {
            _setAudioEncodingBitRate(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setAudioSamplingRate(int i) {
        try {
            _setAudioSamplingRate(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setAudioSource(int i) {
        try {
            _setAudioSource(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setBitRateAdaptEnable(int i) {
        try {
            _setBitRateAdaptEnable(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setDropCache(int i, int i2, int i3) {
        try {
            _setDropCache(i, i2, i3);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setPropertyFloat(int i, float f) {
        try {
            _setPropertyFloat(i, f);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setPropertyLong(int i, long j) {
        try {
            _setPropertyLong(i, j);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setProxyConfig(String str) {
        this.mProxyConfig = str;
    }

    public void setProxyMediaConfig(String str) {
        this.mProxyMediaConfig = str;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setStreamerInOutAndType(int i, String str, String str2) {
        try {
            this.mOutputUrl = str2;
            _setStreamerInOutAndType(i, str, str2);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setVideoEncoder(int i) {
        try {
            _setVideoEncoder(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setVideoEncodingBitRate(int i) {
        try {
            _setVideoEncodingBitRate(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setVideoFrameRate(int i) {
        try {
            _setVideoFrameRate(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setVideoSize(int i, int i2) {
        try {
            _setVideoSize(i, i2);
            this.videoWidth = i;
            this.videoHeight = i2;
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setVideoSource(int i) {
        try {
            _setVideoSource(i);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void start() {
        try {
            _start();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startRecording() {
        n8c.m158485c("IjkWriter", "zjlfound startRecording");
        this.mContext.notifyRecording();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startSurroundMusic(String str, int i, long j) {
        this.mContext.startSurroundMusic(str, i, j);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void stopRecording() {
        try {
            _stop();
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void stopSurroundMusic() {
        n8c.m158485c("IjkWriter", "stopSurroundMusic:");
        this.mContext.stopSurroundMusic();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeAudio(long j, ByteBuffer byteBuffer, long j2) {
        this.mVideoTimeStamp = j;
        try {
            _writeAudio(j, byteBuffer, j2);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeAudioExtradata(ByteBuffer byteBuffer, long j) {
        this.mSendAudioByte += j;
        try {
            _writeAudioExtradata(byteBuffer, j);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeAudioPacket(long j, ByteBuffer byteBuffer, int i, int i2) {
        if (this.mPreAudioTimeStamp > j) {
            return;
        }
        this.mPreAudioTimeStamp = j;
        this.mAudioTimeStamp = j;
        long j2 = i;
        this.mSendAudioByte += j2;
        if (this.startToGetAudioPacketsMs == -1) {
            this.startToGetAudioPacketsMs = SystemClock.elapsedRealtime();
        }
        try {
            _writeAudioPacket(this.mAudioTimeStamp, byteBuffer, j2);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeVideo(long j, ByteBuffer byteBuffer, long j2) {
        this.mAudioTimeStamp = j;
        try {
            _writeVideo(j, byteBuffer, j2);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeVideoExtradata(ByteBuffer byteBuffer, long j) {
        this.mSendVideoByte += j;
        try {
            _writeVideoExtradata(byteBuffer, j);
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void writeVideoPacket(long j, ByteBuffer byteBuffer, int i, boolean z) {
        if (this.mPreVideoTimeStamp > j) {
            this.mVideoTimeStampBase = this.mAudioTimeStamp;
        }
        this.mPreVideoTimeStamp = j;
        this.mVideoTimeStamp = this.mVideoTimeStampBase + j;
        long j2 = i;
        this.mSendVideoByte += j2;
        if (this.mPreCacleBitRateTime == 0) {
            this.mPreCacleBitRateTime = System.currentTimeMillis();
            this.mPreSendBitB = getRtmpSendSize();
        } else {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.mPreCacleBitRateTime) / 1000;
            if (jCurrentTimeMillis > 1) {
                this.mAverageSendBitRateB = ((getRtmpSendSize() - this.mPreSendBitB) * 8) / (jCurrentTimeMillis * 1024);
                this.mPreCacleBitRateTime = System.currentTimeMillis();
                this.mPreSendBitB = getRtmpSendSize();
            }
        }
        try {
            boolean zM121670K0 = fjx.m121638R().m121670K0();
            long j3 = this.mVideoTimeStamp;
            if (zM121670K0) {
                _writeVideoPacketWH(j3, byteBuffer, j2, z, this.videoWidth, this.videoHeight);
            } else {
                _writeVideoPacket(j3, byteBuffer, j2, z);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void writeVideoPacket2(long j, long j2, ByteBuffer byteBuffer, int i, boolean z) {
        if (this.lastdts1 < 0) {
            this.lastdts1 = j;
        }
        if (this.lastpts1 < 0) {
            this.lastpts1 = j2;
        }
        this.lastpts1 = j2;
        this.lastdts1 = j;
        if (this.mPreVideoTimeStamp > j) {
            this.mVideoTimeStampBase = this.mAudioTimeStamp;
        }
        this.mPreVideoTimeStamp = j;
        this.mVideoTimeStamp = this.mVideoTimeStampBase + j;
        long j3 = i;
        this.mSendVideoByte += j3;
        if (this.mPreCacleBitRateTime == 0) {
            this.mPreCacleBitRateTime = System.currentTimeMillis();
            this.mPreSendBitB = getRtmpSendSize();
        } else {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.mPreCacleBitRateTime) / 1000;
            if (jCurrentTimeMillis > 1) {
                this.mAverageSendBitRateB = ((getRtmpSendSize() - this.mPreSendBitB) * 8) / (jCurrentTimeMillis * 1024);
                this.mPreCacleBitRateTime = System.currentTimeMillis();
                this.mPreSendBitB = getRtmpSendSize();
            }
        }
        try {
            if (this.lastdts < 0) {
                this.lastdts = j;
            }
            if (this.lastpts < 0) {
                this.lastpts = j2;
            }
            _writeVideoPacket2(j, j2, byteBuffer, j3, z);
            this.lastpts = j2;
            this.lastdts = j;
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeVideoTexture(int i, EGLContext eGLContext, int i2, int i3, long j) {
    }
}
