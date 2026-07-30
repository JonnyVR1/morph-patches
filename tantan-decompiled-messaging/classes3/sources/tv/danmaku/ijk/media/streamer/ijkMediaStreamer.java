package tv.danmaku.ijk.media.streamer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.sink.IjkWriter;
import com.immomo.mediacore.sink.SinkBase;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.immomo.mediacore.strinf.VideoQuality;
import io.agora.rtc2.RtcEngine;
import java.io.FileDescriptor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.List;
import l.g16;
import l.ig3;
import l.n050;
import l.n8c;
import l.rdc0;
import l.s7y;
import l.vif0;
import l.z1l0;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;
import p003l.ijf0;
import p003l.ldq0;
import p003l.ts2;
import tv.danmaku.ijk.media.player.IjkLibLoader;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;
import tv.danmaku.ijk.media.sink.AgoraWriter;
import tv.danmaku.ijk.media.source.CameraSource;
import tv.danmaku.ijk.media.source.ImageSource;
import tv.danmaku.ijk.media.source.ScreenSource;
import tv.danmaku.ijk.media.source.SourceBase;
import tv.danmaku.ijk.media.util.GPUImageFilterTools;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ijkMediaStreamer {
    public static final String CNNModelFileName = "alignment_v2.model";
    public static final int CONFERENCE_ROLE_AUDIENCE = 2;
    public static final int CONFERENCE_ROLE_BROADCASTER = 1;
    public static final int FFS_PROP_INT64_BIT_RATE = 20100;
    private static final int FFS_PROP_INT64_PIX_FMT = 30000;
    public static final int FFS_PROP_INT64_TCP_SPEED = 20200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
    public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
    public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
    public static final int MEDIA_RECORDER_TRACK_INFO_COMPLETION_STATUS = 1000;
    public static final int MEDIA_RECORDER_TRACK_INFO_DATA_KBYTES = 1009;
    public static final int MEDIA_RECORDER_TRACK_INFO_INITIAL_DELAY_MS = 1007;
    public static final int MEDIA_RECORDER_TRACK_INFO_LIST_END = 2000;
    public static final int MEDIA_RECORDER_TRACK_INFO_LIST_START = 1000;
    public static final String NpdModelFileName = "detect_v1.model";
    public static final String ObjectDetectModelFileName = "od_v0.3.2.model";
    private static final String TAG = "ijkMediaStreamer";
    public static final int VIEW_MODE_FRIEND = 2;
    public static final int VIEW_MODE_NORMAL = 1;
    private static volatile boolean mIsLibLoaded = false;
    private static volatile boolean mIsNativeInitialized = false;
    private static IjkLibLoader sLocalLibLoader = new IjkLibLoader() { // from class: tv.danmaku.ijk.media.streamer.ijkMediaStreamer.1
        @Override // tv.danmaku.ijk.media.player.IjkLibLoader
        public void loadLibrary(String str) throws SecurityException, UnsatisfiedLinkError {
            rdc0.a(g16.a, str);
        }
    };
    private SinkBase mAttachedWriter;
    private boolean mAudioHighQualityFlg;
    private int mCameraID;
    private int mCaptureType;
    HandlerThread mCmdHT;
    private CmdHandler mCmdHandler;
    private Context mContext;
    private int mCount;
    private boolean mDefaultAudioRoutetoSpeakerphone;
    private EventHandler mEventHandler;
    private MomoSurface mFakeSurface;
    private FileDescriptor mFd;
    int mFileType;
    private SourceBase mIjkSource;
    private SinkBase mIjkWriter;
    String mInpath;
    private int mInterval;
    IjkStreamerLogHelper mLogHelper;
    MediaReportLogManager.LogUploadCallBack mLogUploadCallBack;
    private float mMasterAudioLevel;
    private Handler mMonitorHandler;
    private HandlerThread mMonitorTread;
    private OnCameraSetListener mOnCameraSetListener;
    public OnErrorListener mOnErrorListener;
    private OnFPSRateListener mOnFPSChangeListener;
    private OnInfoListener mOnInfoListener;
    private OnPreparedListener mOnPreparedListener;
    private OnRecordStopedListener mOnRecordStopedListener;
    private OnRtcStatusListener mOnRtcStatusListener;
    private boolean mOnlyAudio;
    String mOutpath;
    private Activity mParent;
    private String mPath;
    private volatile int mPlayStatus;
    private SinkBase mPreIjkWriter;
    private boolean mPrepared;
    private OnVideoPreviewSizeSetListener mPreviewSizeSetListener;
    private boolean mScreenOnWhilePlaying;
    private float mSlaveAudioLevel;
    private Object mSurface;
    private SurfaceHolder mSurfaceHolder;
    private int mVenderID;
    private z1l0 mVideoChannelListener;
    private VideoQuality mVideoQuality;
    private boolean mVideoQualityFlg;
    private int mVideoResolution;
    private float mZoom;
    private StreamProducer streamProduct;

    public final class AudioEncoder {
    }

    public final class AudioSource {
    }

    public class CmdHandler extends Handler {
        public CmdHandler(ijkMediaStreamer ijkmediastreamer, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            n8c.c(ijkMediaStreamer.TAG, "----CmdHandler handleMessage what:" + message.what + ";msg.arg1:" + message.arg1 + ";;msg.arg2:" + message.arg2 + ";mPlayStatus:" + ijkMediaStreamer.this.mPlayStatus);
            int i = message.what;
            if (i == 200) {
                ijkMediaStreamer.this.selectFilter_l(GPUImageFilterTools.FilterType.values()[message.arg1], message.arg2, ((Integer) message.obj).intValue());
                return;
            }
            if (i == 600) {
                if (ijkMediaStreamer.this.mPreIjkWriter != null) {
                    ijkMediaStreamer.this.mPreIjkWriter.stopRecording();
                    ijkMediaStreamer.this.mPreIjkWriter.release();
                    ijkMediaStreamer.this.mPreIjkWriter = null;
                    return;
                }
                return;
            }
            switch (i) {
                case 100:
                    if (ijkMediaStreamer.this.mPlayStatus == 0) {
                        ijkMediaStreamer.this.startRecording_l();
                    }
                    break;
                case 101:
                    if (ijkMediaStreamer.this.mPlayStatus == 1) {
                        ijkMediaStreamer.this.stopRecording_l();
                    }
                    break;
                case 102:
                case 103:
                    break;
                default:
                    n8c.c(ijkMediaStreamer.TAG, "Unknown message type " + message.what);
                    break;
            }
        }
    }

    public class EventHandler extends Handler {

        /* JADX INFO: renamed from: a */
        private ijkMediaStreamer f12494a;

        public EventHandler(ijkMediaStreamer ijkmediastreamer, Looper looper) {
            super(looper);
            this.f12494a = ijkmediastreamer;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IjkStreamerLogHelper ijkStreamerLogHelper;
            IjkStreamerLogHelper ijkStreamerLogHelper2;
            if (ijkMediaStreamer.this.mIjkWriter == null) {
                n8c.c(ijkMediaStreamer.TAG, "ijkMediaStreamer went away with unhandled events");
                return;
            }
            n8c.c(ijkMediaStreamer.TAG, "ijkMediaStreamer handleMessage what:" + message.what + ";msg.arg1:" + message.arg1 + ";;msg.arg2:" + message.arg2 + ";mPlayStatus:" + ijkMediaStreamer.this.mPlayStatus);
            int i = message.what;
            if (i == 200) {
                if (ijkMediaStreamer.this.mOnInfoListener != null) {
                    ijkMediaStreamer.this.mOnInfoListener.m11301a(this.f12494a, message.arg1, message.arg2);
                    return;
                }
                return;
            }
            if (i == 201) {
                n8c.c(ijkMediaStreamer.TAG, "MEDIA_RECORDER_FRAMERATE_INFO");
                if (ijkMediaStreamer.this.streamProduct != null) {
                    ijkMediaStreamer.this.streamProduct.m11167d(message.arg1, message.arg2 == 1);
                    return;
                }
                return;
            }
            if (i == 300) {
                if (message.obj == ijkMediaStreamer.this.mAttachedWriter && ijkMediaStreamer.this.mAttachedWriter != null) {
                    ijkMediaStreamer.this.deAttachStreamer();
                    return;
                }
                ijkMediaStreamer.this.stopRecording_l();
                OnErrorListener onErrorListener = ijkMediaStreamer.this.mOnErrorListener;
                if (onErrorListener != null) {
                    onErrorListener.m11300a(this.f12494a, message.arg1, message.arg2);
                }
                IjkStreamerLogHelper ijkStreamerLogHelper3 = ijkMediaStreamer.this.mLogHelper;
                if (ijkStreamerLogHelper3 != null) {
                    ijkStreamerLogHelper3.m10833l();
                    ijkMediaStreamer ijkmediastreamer = ijkMediaStreamer.this;
                    ijkmediastreamer.mLogHelper.m10830i(message.arg2, ijkmediastreamer.mOutpath);
                    return;
                }
                return;
            }
            switch (i) {
                case 100:
                    if (ijkMediaStreamer.this.mOnPreparedListener != null && ijkMediaStreamer.this.mPlayStatus == 0) {
                        ijkMediaStreamer.this.mOnPreparedListener.m11302a(this.f12494a);
                    }
                    ijkMediaStreamer.this.mPlayStatus = 1;
                    return;
                case 101:
                    if (ijkMediaStreamer.this.mOnRecordStopedListener != null && ijkMediaStreamer.this.mPlayStatus == 1) {
                        ijkMediaStreamer.this.mOnRecordStopedListener.m11303a(this.f12494a);
                    }
                    ijkMediaStreamer.this.mPlayStatus = 0;
                    return;
                case 102:
                    n8c.c(ijkMediaStreamer.TAG, "MEDIA_RECORDER_EVENT_PUBLISHING");
                    if (ijkMediaStreamer.this.mOnInfoListener != null) {
                        ijkMediaStreamer.this.mOnInfoListener.m11301a(this.f12494a, message.what, message.arg1);
                    }
                    if (ijkMediaStreamer.this.mMonitorHandler != null) {
                        ijkMediaStreamer.this.mMonitorHandler.removeCallbacks(null);
                        ijkMediaStreamer.this.mMonitorHandler.removeCallbacksAndMessages(null);
                    }
                    ijkMediaStreamer ijkmediastreamer2 = ijkMediaStreamer.this;
                    IjkStreamerLogHelper ijkStreamerLogHelper4 = ijkmediastreamer2.mLogHelper;
                    if (ijkStreamerLogHelper4 != null) {
                        ijkStreamerLogHelper4.m10829h(ijkmediastreamer2.mOutpath);
                        ijkMediaStreamer.this.mLogHelper.m10832k();
                        return;
                    }
                    return;
                case 103:
                    break;
                default:
                    switch (i) {
                        case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA256 /* 105 */:
                        case 106:
                        case 107:
                            break;
                        case 108:
                            if (ijkMediaStreamer.this.mOnInfoListener != null) {
                                ijkMediaStreamer.this.mOnInfoListener.m11301a(this.f12494a, message.what, message.arg1);
                            }
                            break;
                        case 109:
                            if (ijkMediaStreamer.this.mOnRtcStatusListener != null) {
                                ijkMediaStreamer.this.mOnRtcStatusListener.m11304a(this.f12494a, message.obj);
                            }
                            break;
                        default:
                            n8c.c(ijkMediaStreamer.TAG, "Unknown message type " + message.what);
                            break;
                    }
                    return;
            }
            if (ijkMediaStreamer.this.mOnInfoListener != null) {
                ijkMediaStreamer.this.mOnInfoListener.m11301a(this.f12494a, message.what, message.arg1);
            }
            if (message.what == 103 && (ijkStreamerLogHelper2 = ijkMediaStreamer.this.mLogHelper) != null) {
                ijkStreamerLogHelper2.m10827f();
            }
            if (message.what != 105 || (ijkStreamerLogHelper = ijkMediaStreamer.this.mLogHelper) == null) {
                return;
            }
            ijkStreamerLogHelper.m10828g();
        }
    }

    public interface OnCameraSetListener {
        /* JADX INFO: renamed from: a */
        void m11299a(Camera camera);
    }

    public interface OnErrorListener {
        /* JADX INFO: renamed from: a */
        void m11300a(ijkMediaStreamer ijkmediastreamer, int i, int i2);
    }

    public interface OnFPSRateListener {
    }

    public interface OnInfoListener {
        /* JADX INFO: renamed from: a */
        void m11301a(ijkMediaStreamer ijkmediastreamer, int i, int i2);
    }

    public interface OnPreparedListener {
        /* JADX INFO: renamed from: a */
        void m11302a(ijkMediaStreamer ijkmediastreamer);
    }

    public interface OnRecordStopedListener {
        /* JADX INFO: renamed from: a */
        void m11303a(ijkMediaStreamer ijkmediastreamer);
    }

    public interface OnRtcStatusListener {
        /* JADX INFO: renamed from: a */
        void m11304a(ijkMediaStreamer ijkmediastreamer, Object obj);
    }

    public interface OnSurroundMusicStatusListener {
        /* JADX INFO: renamed from: a */
        void m11305a(ijkMediaStreamer ijkmediastreamer, int i, int i2);
    }

    public interface OnVideoPreviewSizeSetListener {
        /* JADX INFO: renamed from: a */
        void m11306a(int i, int i2);
    }

    public interface OnWiredHeadsetStatusListener {
        /* JADX INFO: renamed from: a */
        void m11307a(ijkMediaStreamer ijkmediastreamer, int i, int i2);
    }

    public final class OutputFormat {
    }

    public interface SizeChangedCallback {
        /* JADX INFO: renamed from: a */
        void m11308a(int i, int i2);
    }

    public final class VideoEncoder {
    }

    public final class VideoSource {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewShowMode {
    }

    public interface aidSwitchResolution {
        /* JADX INFO: renamed from: a */
        void m11309a(int i, int i2);
    }

    public interface onRecordScreenErrorListener {
        /* JADX INFO: renamed from: a */
        void m11310a(ijkMediaStreamer ijkmediastreamer, int i, int i2);
    }

    public interface onRecordSuccessListener {
        /* JADX INFO: renamed from: a */
        void m11311a(ijkMediaStreamer ijkmediastreamer);
    }

    public final class videoResolution {
    }

    public ijkMediaStreamer(Context context) {
        this.mMasterAudioLevel = 1.0f;
        this.mSlaveAudioLevel = 0.5f;
        this.mDefaultAudioRoutetoSpeakerphone = true;
        this.mInpath = null;
        this.mOutpath = null;
        this.mFileType = 10;
        this.streamProduct = null;
        this.mPlayStatus = 0;
        this.mPrepared = false;
        this.mVideoChannelListener = null;
        this.mCaptureType = 0;
        this.mIjkWriter = null;
        this.mAttachedWriter = null;
        this.mPreIjkWriter = null;
        this.mIjkSource = null;
        this.mVideoResolution = 1;
        this.mZoom = 1.0f;
        this.mVideoQuality = null;
        this.mMonitorHandler = null;
        this.mMonitorTread = null;
        this.mInterval = -1;
        this.mCount = -1;
        this.mVideoQualityFlg = false;
        this.mAudioHighQualityFlg = false;
        this.mLogHelper = null;
        this.mParent = null;
        this.mCameraID = 0;
        this.mContext = context;
        this.mVenderID = 0;
        this.mOnlyAudio = false;
        initMediaStreamer(sLocalLibLoader, 1, 0, null);
    }

    private void initMediaStreamer(IjkLibLoader ijkLibLoader, int i, int i2, String str) {
        g16.a(this.mContext);
        loadLibrariesOnce(ijkLibLoader);
        s7y.h().n(this.mContext);
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.mEventHandler = new EventHandler(this, looperMyLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(this, mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        HandlerThread handlerThread = new HandlerThread("ijkRecordingCmdHandle", -4);
        this.mCmdHT = handlerThread;
        handlerThread.start();
        this.mCmdHandler = new CmdHandler(this, this.mCmdHT.getLooper());
        if (this.mFakeSurface == null) {
            this.mFakeSurface = new MomoSurface(this.mCaptureType);
            if (this.mVideoQuality != null) {
                n8c.c(TAG, "----initMediaStreamer call getVideoQuality(): " + this.mVideoQuality.resX + "," + this.mVideoQuality.resY);
            }
            StreamProducer streamProducer = this.streamProduct;
            VideoQuality videoQuality = streamProducer != null ? streamProducer.getVideoQuality() : null;
            if (videoQuality != null) {
                n8c.c(TAG, "----initMediaStreamer call getVideoQuality(): " + videoQuality.resX + "," + videoQuality.resY);
            }
            this.mFakeSurface.m10935Y0(videoQuality);
            this.mFakeSurface.m10928U(null);
            if (this.mFakeSurface.m10959s0() != 0) {
                this.mFakeSurface.m10912B0();
                this.mFakeSurface = null;
                n8c.a(TAG, "mFakeSurface creat error use softdec");
            }
        }
        StreamProducer streamProducer2 = new StreamProducer(this.mContext, this, this.mFakeSurface);
        this.streamProduct = streamProducer2;
        MomoSurface momoSurface = this.mFakeSurface;
        if (momoSurface != null) {
            momoSurface.m10923P0(streamProducer2);
        }
        if (this.streamProduct != null && this.mFakeSurface != null) {
            int i3 = this.mVenderID;
            if (i3 == 0) {
                this.mIjkWriter = new IjkWriter(this.streamProduct, this.mOnlyAudio);
            } else if (i3 == 1) {
                this.mIjkWriter = new AgoraWriter(this.mContext, this.mFakeSurface.m10954n0(), this.streamProduct, str, this.mOnlyAudio);
            }
            this.streamProduct.m11197q2(this.mIjkWriter);
        }
        this.mVideoResolution = i;
        if (this.mMonitorTread == null) {
            HandlerThread handlerThread2 = new HandlerThread("ijkStrMonitor");
            this.mMonitorTread = handlerThread2;
            handlerThread2.start();
            this.mMonitorHandler = new Handler(this.mMonitorTread.getLooper());
        }
        StreamProducer streamProducer3 = this.streamProduct;
        if (streamProducer3 != null) {
            streamProducer3.m11192o2(this.mVenderID);
        }
    }

    private static void loadLibrariesOnce(IjkLibLoader ijkLibLoader) {
        synchronized (ijkMediaStreamer.class) {
            if (!mIsLibLoaded) {
                if (ijkLibLoader == null) {
                    ijkLibLoader = sLocalLibLoader;
                }
                try {
                    rdc0.a(g16.a, "mmcrypto");
                    rdc0.a(g16.a, "mmssl");
                    rdc0.a(g16.a, "cosmosffmpeg");
                    rdc0.a(g16.a, "ijklivesdl");
                    rdc0.a(g16.a, "ijkstreamer");
                    rdc0.a(g16.a, "congressUtil");
                    rdc0.a(g16.a, "apm-congressRender");
                    mIsLibLoaded = true;
                } catch (Error unused) {
                    mIsLibLoaded = false;
                } catch (Exception unused2) {
                    mIsLibLoaded = false;
                }
                try {
                    rdc0.a(g16.a, "ijkaudioprocess");
                    mIsLibLoaded = true;
                } catch (Error unused3) {
                    mIsLibLoaded = false;
                } catch (Exception unused4) {
                    mIsLibLoaded = false;
                }
                try {
                    ijkLibLoader.loadLibrary("yuvutils");
                    ijkLibLoader.loadLibrary("mmcv");
                    ijkLibLoader.loadLibrary("videoprocess");
                    ijkLibLoader.loadLibrary("tracker");
                    ijkLibLoader.loadLibrary("coverpicker");
                    ijkLibLoader.loadLibrary("flowextent");
                    mIsLibLoaded = true;
                } catch (Error unused5) {
                    mIsLibLoaded = false;
                } catch (Exception unused6) {
                    mIsLibLoaded = false;
                }
            }
        }
    }

    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        EventHandler eventHandler;
        ijkMediaStreamer ijkmediastreamer = (ijkMediaStreamer) ((WeakReference) obj).get();
        if (ijkmediastreamer == null || (eventHandler = ijkmediastreamer.mEventHandler) == null) {
            return;
        }
        ijkmediastreamer.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, i3, obj2));
    }

    public static void postEventFromStreamPro(ijkMediaStreamer ijkmediastreamer, int i, int i2, int i3, Object obj) {
        EventHandler eventHandler;
        if (ijkmediastreamer == null || (eventHandler = ijkmediastreamer.mEventHandler) == null) {
            return;
        }
        ijkmediastreamer.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, i3, obj));
    }

    private void release_l() {
        setScreenOnWhilePublishing(false);
        try {
            IjkStreamerLogHelper ijkStreamerLogHelper = this.mLogHelper;
            if (ijkStreamerLogHelper != null) {
                ijkStreamerLogHelper.m10833l();
                this.mLogHelper.m10830i(0, this.mOutpath);
                this.mLogHelper.m10831j();
                this.mLogHelper = null;
                this.mLogUploadCallBack = null;
            }
            this.mLogUploadCallBack = null;
            Handler handler = this.mMonitorHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.mMonitorTread.quit();
                this.mMonitorTread = null;
                this.mMonitorHandler = null;
            }
        } catch (Exception unused) {
        }
        try {
            stopRecording_l();
            SourceBase sourceBase = this.mIjkSource;
            if (sourceBase != null) {
                sourceBase.mo10762q();
                this.mIjkSource = null;
            }
            if (this.mIjkWriter != null) {
                n8c.c(TAG, "MediaStreamer.release _stop");
                this.mIjkWriter.release();
                this.mIjkWriter = null;
            }
            n8c.c(TAG, "MediaStreamer.release _stop end");
            deAttachStreamer();
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11116C1(null);
                this.streamProduct.stopSurroundMusic();
                this.streamProduct.release();
                this.streamProduct = null;
            }
            reset();
            n8c.c(TAG, "MediaStreamer.release mFakeSurface.release");
            MomoSurface momoSurface = this.mFakeSurface;
            if (momoSurface != null) {
                momoSurface.m10912B0();
                this.mFakeSurface = null;
            }
            this.mParent = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        n8c.c(TAG, "MediaStreamer.release end");
        this.mCmdHT = null;
        this.mParent = null;
        this.mCmdHandler = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        this.mOnPreparedListener = null;
        this.mOnRecordStopedListener = null;
        this.mOnCameraSetListener = null;
        this.mPreviewSizeSetListener = null;
        this.mContext = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectFilter_l(GPUImageFilterTools.FilterType filterType, int i, int i2) {
        ts2 ts2VarM11334a = GPUImageFilterTools.m11334a(this.mContext, filterType, i);
        if (i2 != 1) {
            SourceBase sourceBase = this.mIjkSource;
            if (sourceBase != null) {
                sourceBase.mo10766t(this.mContext, ts2VarM11334a);
                this.mIjkSource.mo10771x(0);
                return;
            }
            return;
        }
        ijf0 ijf0Var = new ijf0(ts2VarM11334a);
        SourceBase sourceBase2 = this.mIjkSource;
        if (sourceBase2 != null) {
            sourceBase2.mo10766t(this.mContext, ijf0Var);
            this.mIjkSource.mo10771x(1);
        }
    }

    private void startMonitor() {
        Handler handler = this.mMonitorHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mMonitorHandler.postDelayed(new Runnable() { // from class: tv.danmaku.ijk.media.streamer.ijkMediaStreamer.3
                @Override // java.lang.Runnable
                public void run() {
                    n8c.c(ijkMediaStreamer.TAG, "MonitorTask:too long not data receive notify user");
                    ijkMediaStreamer ijkmediastreamer = ijkMediaStreamer.this;
                    OnErrorListener onErrorListener = ijkmediastreamer.mOnErrorListener;
                    if (onErrorListener != null) {
                        onErrorListener.m11300a(ijkmediastreamer, HttpStatus.MULTIPLE_CHOICES_300, 12);
                    }
                }
            }, 20000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRecording_l() {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                n8c.c("zjlfound", "----startRecording_l mIjkWriter:".concat(sinkBase.getClass().getSimpleName()));
                this.mIjkWriter.setDefaultAudioRoutetoSpeakerphone(this.mDefaultAudioRoutetoSpeakerphone);
                this.mIjkWriter.startRecording();
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        n8c.c("zjlfound", "startRecording_l");
        this.mPlayStatus = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRecording_l() {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.stopRecording();
            }
            SinkBase sinkBase2 = this.mAttachedWriter;
            if (sinkBase2 != null) {
                sinkBase2.stopRecording();
            }
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11179i2();
            }
            this.mPlayStatus = 0;
            IjkStreamerLogHelper ijkStreamerLogHelper = this.mLogHelper;
            if (ijkStreamerLogHelper != null) {
                ijkStreamerLogHelper.m10833l();
                this.mLogHelper.m10830i(0, this.mOutpath);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        n8c.c("zjlfound", "stopRecording_l");
    }

    public void EnableExternalAudio(boolean z) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11164c(z);
        }
    }

    public void SabineEffectReset() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.SabineEffectReset();
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.SabineEffectReset();
        }
    }

    public void SabineEffectSet(int i, int i2, float f) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.SabineEffectSet(i, i2, f);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.SabineEffectSet(i, i2, f);
        }
    }

    public void SetSubVideoFullScreen(long j, boolean z) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11128I1(j, z);
        }
    }

    public void SetSubVideoPos(long j, int i, int i2, int i3, int i4) {
        SetSubVideoPos(j, i, i2, i3, i4, 0);
    }

    public void addEventHandler(MRtcEventHandler mRtcEventHandler) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.addEventHandler(mRtcEventHandler);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.addEventHandler(mRtcEventHandler);
        }
    }

    public void addFilterToDestory(ts2 ts2Var) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10746a(ts2Var);
        }
    }

    public void addMRtcAudioHandler(MRtcAudioHandler mRtcAudioHandler) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.addMRtcAudioHandler(mRtcAudioHandler);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.addMRtcAudioHandler(mRtcAudioHandler);
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11190o0(mRtcAudioHandler);
        }
    }

    public void addMRtcAudioHandlerEx(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.addMRtcAudioHandlerEx(mRtcAudioHandlerEx);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.addMRtcAudioHandlerEx(mRtcAudioHandlerEx);
        }
    }

    public void addMRtcChannelHandler(MRtcChannelHandler mRtcChannelHandler) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.addMRtcChannelHandler(mRtcChannelHandler);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.addMRtcChannelHandler(mRtcChannelHandler);
        }
    }

    public void addMediaCodecSurface(Surface surface) {
        MomoSurface momoSurface = this.mFakeSurface;
        if (momoSurface != null) {
            momoSurface.m10936Z(surface);
        }
    }

    public void addSoftListener(ldq0.InterfaceC0404a interfaceC0404a) {
        MomoSurface momoSurface = this.mFakeSurface;
        if (momoSurface != null) {
            momoSurface.m10940c0(interfaceC0404a);
        }
    }

    public void adjustAef(int i, boolean z) {
    }

    public void adjustEQ(int i, boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.adjustEQ(i, z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.adjustEQ(i, z);
        }
    }

    public void adjustEf(int i, int i2) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.adjustEf(i, i2);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.adjustEf(i, i2);
        }
    }

    public void adjustTune(int i, boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.adjustTune(i, z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.adjustTune(i, z);
        }
    }

    public long aidGetCurrentPosition(long j) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11195q0(j);
        }
        return 0L;
    }

    public long aidGetDuration(long j) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11198r0(j);
        }
        return 0L;
    }

    public void aidSeekTo(long j, long j2) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11201s0(j, j2);
        }
    }

    public void attachStreamer(int i) {
        int i2 = this.mVenderID;
        if (i2 != i) {
            if (i2 == 0 || (this.mIjkWriter instanceof IjkWriter)) {
                this.mVenderID = i;
                SinkBase sinkBase = this.mAttachedWriter;
                if (sinkBase != null) {
                    sinkBase.release();
                    this.mAttachedWriter = null;
                }
                if (i == -1) {
                    deAttachStreamer();
                    return;
                }
                if (i == 0) {
                    this.mAttachedWriter = new IjkWriter(this.streamProduct, this.mOnlyAudio);
                }
                if (i == 1) {
                    this.mAttachedWriter = new AgoraWriter(this.mContext, this.mFakeSurface.m10954n0(), this.streamProduct, this.mOnlyAudio);
                }
                this.streamProduct.m11184l2(this.mAttachedWriter);
            }
        }
    }

    public void attachStreamerForAudio(ijkMediaStreamer ijkmediastreamer) {
        if (ijkmediastreamer != null) {
            ijkmediastreamer.setPcmDataCallback(new SinkBase.PcmDateCallback() { // from class: tv.danmaku.ijk.media.streamer.ijkMediaStreamer.2
                public void onPcmDateCallback(long j, byte[] bArr, int i, boolean z) {
                    ijkMediaStreamer.this.qbuffer(bArr, bArr.length, System.currentTimeMillis());
                }
            });
        }
    }

    public void attachToSpecStreamer(int i) {
        n8c.c("zjlfound", "----attachToSpecStreamer:" + i + ",mVenderID=" + this.mVenderID);
        int i2 = this.mVenderID;
        if (i2 != i || i2 == 0) {
            this.mVenderID = i;
            if (this.streamProduct != null) {
                n8c.c(TAG, "----attachToSpecStreamer: call stopRecording()");
                this.streamProduct.m11179i2();
            }
            if (this.mIjkWriter != null) {
                n8c.c(TAG, "----attachToSpecStreamer: call mIjkWriter.stopRecording()");
                this.mIjkWriter.stopRecording();
                this.mIjkWriter.release();
            }
            if (i == 0) {
                this.mIjkWriter = new IjkWriter(this.streamProduct, this.mOnlyAudio);
            }
            if (i == 1) {
                this.mIjkWriter = new AgoraWriter(this.mContext, this.mFakeSurface.m10954n0(), this.streamProduct, this.mOnlyAudio);
            }
            z1l0 z1l0Var = this.mVideoChannelListener;
            if (z1l0Var != null) {
                this.mIjkWriter.setVideoChannellistener(z1l0Var);
            }
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setMasterAudioLevel(this.mMasterAudioLevel);
                this.mIjkWriter.setSlaveAudioLevel(this.mSlaveAudioLevel);
            }
            this.streamProduct.m11197q2(this.mIjkWriter);
            n8c.c("zjlfound", "----attachToSpecStreamer mIjkWriter:" + this.mIjkWriter + ";type=" + i + "; mIjkWriter" + this.mIjkWriter);
            this.mPlayStatus = 0;
            startMonitor();
        }
    }

    public int changeRole(int i) {
        n8c.c(TAG, "changeRole:" + i);
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.changeRole(i);
        }
        return -1;
    }

    public void deAttachStreamer() {
        this.streamProduct.m11184l2(null);
        SinkBase sinkBase = this.mAttachedWriter;
        if (sinkBase != null) {
            sinkBase.stop();
            this.mAttachedWriter.release();
            this.mAttachedWriter = null;
        }
        setAttachedVideoQuality(null);
    }

    public void enableAudio(boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.enableAudio(z);
        }
    }

    public void enableAudioVolumeIndication(int i, int i2) {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.enableAudioVolumeIndication(i, i2);
            }
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11205u0(i, i2);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void enableCommMode(boolean z) {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.enableCommMode(z);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void enableConfLog(boolean z, String str) {
    }

    public void enableExternStream(boolean z) {
    }

    public void enableMulPusherInRoom(boolean z) {
    }

    public void enableVideo(boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.enableVideo(z);
        }
    }

    public void focusOnRect(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10747b(rect, autoFocusCallback);
        }
    }

    public long getAVDiff() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getAVDiff();
        }
        return 0L;
    }

    public long getAcodecSendSize() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase == null) {
            return 0L;
        }
        try {
            return sinkBase.getAcodecSendSize();
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public RtcEngine getAgoraEngine() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return (RtcEngine) sinkBase.getAgoraEngine();
        }
        return null;
    }

    public int getAudioBitRate() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getAudioBitRate();
        }
        return 0;
    }

    public long getAudioCacheSize() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getAudioCacheSize();
        }
        return 0L;
    }

    public long getAudioEncoderSizes() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11111A0();
        }
        return 0L;
    }

    public long getAudioFrameCache() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11113B0();
        }
        return 0L;
    }

    public long getAudioFrameCapture() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11115C0();
        }
        return 0L;
    }

    public long getAudioPacketCache() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11117D0();
        }
        return 0L;
    }

    public long getAudioRxbytes() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getAudioRxbytes();
        }
        return 0L;
    }

    public long getAudioTxbytes() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getAudioTxbytes();
        }
        return 0L;
    }

    public String getAudioVideoStatics() {
        SinkBase sinkBase = this.mIjkWriter;
        return sinkBase != null ? sinkBase.getAudioVideoStatics() : "[(0)]";
    }

    public int getAvFlag() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getAvFlag();
        }
        return 0;
    }

    public long getAverageSendBitRateB() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getAverageSendBitRateB();
        }
        return 0L;
    }

    public int getBusinessType() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getBusinessType();
        }
        return -1;
    }

    public String getCPUandMemStatistics() {
        return s7y.h().b();
    }

    public long getConnectTime() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 0L);
        }
        return 0L;
    }

    public long getCpuVideoProcessingCount() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10748c();
        }
        return 0L;
    }

    public long getCpuVideoProcessingDuration() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10749d();
        }
        return 0L;
    }

    public Camera getCurCamera() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10750e();
        }
        return null;
    }

    public int getCurrentZoomLevel() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10752g();
        }
        return 0;
    }

    public int getDefaultAecParam() {
        SinkBase sinkBase = this.mAttachedWriter;
        if (sinkBase != null) {
            return sinkBase.getDefaultAecParam();
        }
        SinkBase sinkBase2 = this.mIjkWriter;
        if (sinkBase2 != null) {
            return sinkBase2.getDefaultAecParam();
        }
        return 0;
    }

    public long getExternFileDuration() {
        return 0L;
    }

    public long getFaceDetectionCount() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10753h();
        }
        return 0L;
    }

    public long getFaceDetectionDuration() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10754i();
        }
        return 0L;
    }

    public long getFirstAuidoPacketTime() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer == null || this.mIjkWriter == null) {
            return 0L;
        }
        long jM11119E0 = streamProducer.m11119E0() - this.mIjkWriter.getPropertyLong(20000, 0L);
        if (jM11119E0 < 0) {
            return 0L;
        }
        return jM11119E0;
    }

    public long getFirstSendPacketTime() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_VIDEO_DECODER, 0L);
        }
        return 0L;
    }

    public long getFirstVideoPacketTime() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer == null || this.mIjkWriter == null) {
            return 0L;
        }
        long jM11121F0 = streamProducer.m11121F0() - this.mIjkWriter.getPropertyLong(20000, 0L);
        if (jM11121F0 < 0) {
            return 0L;
        }
        return jM11121F0;
    }

    public long getGpuVideoProcessingCount() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10755j();
        }
        return 0L;
    }

    public long getGpuVideoProcessingDuration() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10756k();
        }
        return 0L;
    }

    public SinkBase getIjkWriter() {
        return this.mIjkWriter;
    }

    public float getMasterAudioLevel() {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                return sinkBase.getMasterAudioLevel();
            }
            return 0.5f;
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11123G0();
        }
        return 0.5f;
    }

    public int getMaxZoomLevel() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10757l();
        }
        return 0;
    }

    public int getMediaStatus() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11127I0();
        }
        return 17;
    }

    public long getPacketCacheDuration() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11131K0();
        }
        return 0L;
    }

    public vif0 getPreviewSize(int i, int i2) {
        return new vif0(352, 640);
    }

    public float getPropertyFloat(int i, float f) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase == null) {
            return 0.0f;
        }
        try {
            return sinkBase.getPropertyFloat(i, f);
        } catch (Error e) {
            e.printStackTrace();
            return 0.0f;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0f;
        }
    }

    public long getPropertyLong(int i, long j) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase == null) {
            return 0L;
        }
        try {
            return sinkBase.getPropertyLong(i, j);
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public int getPublisherVideoHigh() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getPublisherVideoHigh();
        }
        return 0;
    }

    public int getPublisherVideoWidth() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getPublisherVideoWidth();
        }
        return 0;
    }

    public int getRecordDuration() {
        return 0;
    }

    public int getRecordHeight() {
        return 0;
    }

    public int getRecordWidth() {
        return 0;
    }

    public int getRenderToCodecSurfaceCost() {
        MomoSurface momoSurface = this.mFakeSurface;
        if (momoSurface != null) {
            return momoSurface.m10960t0();
        }
        return 0;
    }

    public int getRenderToDisplayCost() {
        MomoSurface momoSurface = this.mFakeSurface;
        if (momoSurface != null) {
            return momoSurface.m10961u0();
        }
        return 0;
    }

    public int getRoomType() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getRoomType();
        }
        return 0;
    }

    public long getRtmpSendSize() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase == null) {
            return 0L;
        }
        try {
            return sinkBase.getRtmpSendSize();
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public long getRxbytes() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getRxbytes();
        }
        return 0L;
    }

    public String getServerIpAddr() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase == null) {
            return "";
        }
        try {
            return sinkBase.getServerIpAddr();
        } catch (Error e) {
            e.printStackTrace();
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public float getSlaveAudioLevel() {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                return sinkBase.getMasterAudioLevel();
            }
            return 0.5f;
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11135M0();
        }
        return 0.5f;
    }

    public int getStreamerType() {
        return this.mVenderID;
    }

    public long getSurroundMusicDuration() {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                return sinkBase.getSurroundMusicPos();
            }
            return 0L;
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11136N0();
        }
        return 0L;
    }

    public long getSurroundMusicPos() {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                return sinkBase.getSurroundMusicPos();
            }
            return 0L;
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11138O0();
        }
        return 0L;
    }

    public long getTxbytes() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getTxbytes();
        }
        return 0L;
    }

    public long getVcodecSendSize() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase == null) {
            return 0L;
        }
        try {
            return sinkBase.getVcodecSendSize();
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public int getVideoBitRate() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getVideoBitRate();
        }
        return 0;
    }

    public long getVideoCacheSize() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getVideoCacheSize();
        }
        return 0L;
    }

    public z1l0 getVideoChannelListener() {
        return this.mVideoChannelListener;
    }

    public long getVideoEncoderPackets() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11140P0();
        }
        return 0L;
    }

    public long getVideoEncoderSize() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11142Q0();
        }
        return 0L;
    }

    public long getVideoFrameCapture() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11146S0();
        }
        return 0L;
    }

    public int getVideoFrameRate() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase instanceof AgoraWriter) {
            return sinkBase.getVideoFrameRate();
        }
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10758m();
        }
        return 0;
    }

    public int getVideoFreezeCount() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11148T0();
        }
        return 0;
    }

    public long getVideoPacketCache() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getVideoPacketCache();
        }
        return 0L;
    }

    public long getVideoPts() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getVideoPts();
        }
        return 0L;
    }

    public VideoQuality getVideoQuality() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer == null) {
            return null;
        }
        this.mVideoQuality = streamProducer.getVideoQuality();
        n8c.c(TAG, "----getVideoQuality: " + this.mVideoQuality.resX + "," + this.mVideoQuality.resY);
        return this.mVideoQuality;
    }

    public int getVideoResolution() {
        return this.mVideoResolution;
    }

    public long getVideoRxbytes() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getVideoRxbytes();
        }
        return 0L;
    }

    public long getVideoTxbytes() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            return sinkBase.getVideoTxbytes();
        }
        return 0L;
    }

    public long getWriteByte() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase == null) {
            return 0L;
        }
        try {
            return sinkBase.getWriteByte();
        } catch (Error e) {
            e.printStackTrace();
            return 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public void ignoreMonitor(boolean z) {
    }

    public void ignoreWriterSEI(boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.ignoreWriterSEI(z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.ignoreWriterSEI(z);
        }
    }

    public void initConfApi(String str, int i, long j, long j2, boolean z, String str2, String str3) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.initConfApi(str, i, j, j2, z, str2, str3);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.initConfApi(str, i, j, j2, z, str2, str3);
        }
    }

    public boolean isFrontCamera() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            return sourceBase.mo10760o();
        }
        return true;
    }

    public boolean isRecording() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11133L0();
        }
        return false;
    }

    public boolean isWiredHeadsetOn() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            return streamProducer.m11155X0();
        }
        return false;
    }

    public void loadFaceModel() {
    }

    public boolean loadGestureModel(String str) {
        return n050.b().d(str);
    }

    public void mixAndSetSubVideoPos(long j, String str, boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.mixAndSetSubVideoPos(j, str, z);
        }
    }

    public void muteAllRemoteAudioStream(boolean z) {
        n8c.c(TAG, "muteRemoteAudioStream mute" + z);
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11157Y0(z);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.muteAllRemoteAudioStream(z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.muteAllRemoteAudioStream(z);
        }
    }

    public void muteAllRemoteVideoStream(boolean z) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11159Z0(z);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.muteAllRemoteVideoStream(z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.muteAllRemoteVideoStream(z);
        }
    }

    public void muteLocalAudioStream(boolean z) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11160a1(z);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.muteLocalAudioStream(z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.muteLocalAudioStream(z);
        }
    }

    public void muteLocalAudioStreamEx(boolean z) {
        n8c.c(TAG, "muteLocalAudioStreamEx mute" + z);
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.muteLocalAudioStreamForGame(z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.muteLocalAudioStreamForGame(z);
        }
    }

    public void muteLocalVideoStream(boolean z) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11162b1(z);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.muteLocalVideoStream(z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.muteLocalVideoStream(z);
        }
    }

    public void muteRemoteAudioStream(long j, boolean z) {
        n8c.c(TAG, "muteRemoteAudioStream uid" + j + ";mute:" + z);
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11165c1(j, z);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.muteRemoteAudioStream(j, z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.muteRemoteAudioStream(j, z);
        }
    }

    public void muteRemoteVideoStream(long j, boolean z) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11168d1(j, z);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.muteRemoteVideoStream(j, z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.muteRemoteVideoStream(j, z);
        }
    }

    public void muteSingerAudioStream(boolean z) {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void openAudioTracks(boolean z) {
    }

    public void openPublishHelp(Activity activity, long j, String str, int i, int i2, SizeChangedCallback sizeChangedCallback, int i3) {
        n8c.c(TAG, "----openPublishHelp 1:" + i3);
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11173f1(activity, this, j, str, i, i2, sizeChangedCallback, i3, null);
        }
    }

    public void pauseCamera() {
    }

    public void pausePlaying() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.pausePlaying();
        }
    }

    public void pauseRecording() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.pauseRecording();
        }
    }

    public void pauseSurroundMusic() {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                sinkBase.pauseSurroundMusic();
            }
        } else {
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11176h1();
            }
        }
    }

    public boolean prepare() {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setStreamerInOutAndType(this.mFileType, this.mInpath, this.mOutpath);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        boolean zPrepare = true;
        try {
            SinkBase sinkBase2 = this.mIjkWriter;
            if (sinkBase2 != null) {
                zPrepare = sinkBase2.prepare();
            }
        } catch (Error e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        n8c.c("zjlfound", "prepare");
        return zPrepare;
    }

    public void qbuffer(byte[] bArr, int i, long j) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11180j1(bArr, i, j);
        }
    }

    public void release() {
        n8c.c(TAG, "MediaStreamer.release");
        this.mCmdHandler.removeCallbacksAndMessages(null);
        this.mCmdHandler.removeCallbacks(null);
        release_l();
    }

    public final void removePcmDataCallback(SinkBase.PcmDateCallback pcmDateCallback) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.removePcmDataCallback(pcmDateCallback);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setPcmDataCallback((SinkBase.PcmDateCallback) null);
        }
    }

    public final void removeRecordDateCallback(SinkBase.RecordDateCallback recordDateCallback) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.removeRecordDateCallback(recordDateCallback);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setRecordDateCallback((SinkBase.RecordDateCallback) null);
        }
    }

    public void requestExpectStream(int i, int i2) {
    }

    public void reset() {
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
            this.mEventHandler.removeCallbacks(null);
        }
        CmdHandler cmdHandler = this.mCmdHandler;
        if (cmdHandler != null) {
            cmdHandler.removeCallbacks(null);
            this.mCmdHandler.removeCallbacksAndMessages(null);
        }
        try {
            HandlerThread handlerThread = this.mCmdHT;
            if (handlerThread != null) {
                handlerThread.quit();
                this.mCmdHT.join(3000L);
            }
        } catch (Exception unused) {
        }
    }

    public void resetCamera() {
    }

    public void resumePlaying() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.resumePlaying();
        }
    }

    public void resumeRecording() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.resumeRecording();
        }
    }

    public void resumeSurroundMusic() {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                sinkBase.resumeSurroundMusic();
            }
        } else {
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11170e();
            }
        }
    }

    public void seekToSurroundMusic(long j) {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                sinkBase.seekToSurroundMusic(j);
            }
        } else {
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11183l1(j);
            }
        }
    }

    public void selectAudioTrack(int i) {
    }

    public void selectCamera(Activity activity, int i) {
        this.mParent = activity;
        this.mCameraID = i;
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10762q();
        }
        CameraSource cameraSource = new CameraSource(activity, this.streamProduct);
        this.mIjkSource = cameraSource;
        OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener = this.mPreviewSizeSetListener;
        if (onVideoPreviewSizeSetListener != null) {
            cameraSource.mo10735C(onVideoPreviewSizeSetListener);
        }
        int i2 = this.mVideoResolution;
        if (i2 == 3) {
            this.mIjkSource.mo10733B(720, 1280);
        } else {
            SourceBase sourceBase2 = this.mIjkSource;
            if (i2 == 5) {
                sourceBase2.mo10733B(528, 960);
            } else {
                sourceBase2.mo10733B(480, 640);
            }
        }
        this.mIjkSource.mo10739G(this.mVideoResolution);
        if (this.streamProduct != null && this.mFakeSurface != null) {
            n8c.c(TAG, "set select camere");
            this.mCaptureType = 0;
            this.streamProduct.m11200r2(activity, this.mIjkSource);
            this.mFakeSurface.m10919L0(this.mCaptureType);
            this.mIjkSource.mo10764r(activity, i, this.mFakeSurface);
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.notifyResumeRecording();
            n8c.c(TAG, "----selectCamera 1: notifyResumeRecording end");
        }
    }

    public void selectCameraSize(int i) {
        int iMo10751f;
        this.mVideoResolution = i;
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            this.mCameraID = sourceBase.mo10760o() ? 1 : 0;
            iMo10751f = this.mIjkSource.mo10751f();
            this.mIjkSource.mo10762q();
            this.mIjkSource = null;
        } else {
            iMo10751f = 1;
        }
        n8c.c(TAG, "----selectCameraSize:level=" + i + ";cameraID=" + this.mCameraID + "; orient=" + iMo10751f);
        CameraSource cameraSource = new CameraSource(this.mParent, this.streamProduct);
        this.mIjkSource = cameraSource;
        cameraSource.mo10768v(iMo10751f);
        OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener = this.mPreviewSizeSetListener;
        if (onVideoPreviewSizeSetListener != null) {
            this.mIjkSource.mo10735C(onVideoPreviewSizeSetListener);
        }
        int i2 = this.mVideoResolution;
        if (i2 == 3) {
            this.mIjkSource.mo10733B(720, 1280);
        } else {
            SourceBase sourceBase2 = this.mIjkSource;
            if (i2 == 5) {
                sourceBase2.mo10733B(528, 960);
            } else {
                sourceBase2.mo10733B(480, 640);
            }
        }
        this.mIjkSource.mo10739G(this.mVideoResolution);
        if (this.streamProduct != null) {
            n8c.c(TAG, "set select camere");
            this.mCaptureType = 0;
            this.streamProduct.m11200r2(this.mParent, this.mIjkSource);
            this.mFakeSurface.m10919L0(this.mCaptureType);
            this.mIjkSource.mo10764r(this.mParent, this.mCameraID, this.mFakeSurface);
        }
    }

    public void selectFaceDetectFilter(Context context, ts2 ts2Var) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10765s(this.mContext, ts2Var);
        }
    }

    public void selectFilter(Activity activity, GPUImageFilterTools.FilterType filterType, int i) {
        this.mCmdHandler.removeMessages(200);
        this.mCmdHandler.sendMessage(this.mCmdHandler.obtainMessage(200, filterType.ordinal(), i, 0));
    }

    public void sendAecParam(int i) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.sendAecParam(i);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.sendAecParam(i);
        }
    }

    public void setAttachedVideoQuality(VideoQuality videoQuality) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11185m1(videoQuality);
        }
    }

    public void setAudioChannelNum(int i) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11188n1(i);
        }
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setAudioChannelNum(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAudioEncoder(int i) {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setAudioEncoder(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAudioEncodingBitRate(int i) {
        if (i <= 0) {
            ig3.a("Audio encoding bit rate is not positive");
            return;
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11191o1(i);
        }
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setAudioEncodingBitRate(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAudioHighQualityParameters(boolean z) {
        this.mAudioHighQualityFlg = z;
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setAudioHighQualityParameters(z);
        }
    }

    public void setAudioSamplingRate(int i) {
        if (i <= 0) {
            ig3.a("Audio sampling rate is not positive");
            return;
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11193p1(i);
        }
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setAudioSamplingRate(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAudioSource(int i) {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setAudioSource(i);
            }
            SinkBase sinkBase2 = this.mAttachedWriter;
            if (sinkBase2 != null) {
                sinkBase2.setAudioSource(i);
            }
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11196q1(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAudioTrackIndex(int i) {
    }

    public void setAvFlag(int i) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setAvFlag(i);
        }
    }

    public void setBitRateAdaptEnable(int i) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11199r1(i);
        }
    }

    public void setBitRateAdaptiveEnable(boolean z) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11202s1(z);
        }
    }

    public void setBlinkSwitch(boolean z) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10767u(z);
        }
    }

    public void setBusinessType(int i) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setBusinessType(i);
        }
    }

    public void setCameraRotation(int i, int i2) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11203t1(i, i2);
        }
    }

    public void setCameraSuccess() {
        OnCameraSetListener onCameraSetListener = this.mOnCameraSetListener;
        if (onCameraSetListener != null) {
            onCameraSetListener.m11299a(getCurCamera());
        }
    }

    public void setChannalName(String str) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setChannalName(str);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setChannalName(str);
        }
        try {
            setSessionID(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void setChannelkey(String str) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setChannelkey(str);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setChannelkey(str);
        }
    }

    public void setCrop(boolean z) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11206u1(z);
        }
    }

    public void setCustZoomFlag(boolean z) {
    }

    public void setDefaultAudioRoutetoSpeakerphone(boolean z) {
        this.mDefaultAudioRoutetoSpeakerphone = z;
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setDefaultAudioRoutetoSpeakerphone(z);
        }
    }

    public void setDelayoffset(int i) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setDelayoffset(i);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setDelayoffset(i);
        }
    }

    public void setDoFaceDetect(Boolean bool) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10769w(bool.booleanValue());
        }
    }

    public int setEnableSpeakerphone(boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setEnableSpeakerphone(z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 == null) {
            return 0;
        }
        sinkBase2.setEnableSpeakerphone(z);
        return 0;
    }

    public void setEncoderSize(int i, int i2) {
    }

    public void setEncryptionMode(String str) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setEncryptionMode(str);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setEncryptionMode(str);
        }
    }

    public void setEncryptionSecret(String str) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setEncryptionSecret(str);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setEncryptionSecret(str);
        }
    }

    public final void setExternAudioDevStatusCallback(ijkStreamerUtil.ExternAudioDevStatusCallback externAudioDevStatusCallback) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.setExternAudioDevStatusCallback(externAudioDevStatusCallback);
        }
    }

    public void setExternEncoderSize(int i, int i2) {
    }

    public void setExternVideoEncodingBitRate(int i) {
    }

    public void setFaceBeautiful(int i) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10771x(i);
        }
    }

    @Deprecated
    public void setFaceDetectEnable(int i) {
    }

    public void setFaceDetectModelPath(List<String> list) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10772y(list);
        }
    }

    public void setFaceDetectTimeoutSwitch(boolean z) {
    }

    public void setFaceEyeScale(Float f) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10773z(f.floatValue());
        }
    }

    public void setFaceThinScale(Float f) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10731A(f.floatValue());
        }
    }

    public void setHost(boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setHost(z);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setHost(z);
        }
    }

    public final void setJsonDataCallback(ijkStreamerUtil.JsonDateCallback jsonDateCallback) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.setJsonDataCallback(jsonDateCallback);
        }
    }

    public void setJsonForPostion(String str) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setJsonForPostion(str);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setJsonForPostion(str);
        }
    }

    public void setLandMode(boolean z) {
    }

    public void setLocalMergeSei(String str) {
    }

    public void setLogUploadCallBack(int i, int i2, MediaReportLogManager.LogUploadCallBack logUploadCallBack) {
        this.mLogUploadCallBack = logUploadCallBack;
        this.mInterval = i;
        this.mCount = i2;
    }

    public void setMasterAudioLevel(float f) {
        this.mMasterAudioLevel = f;
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                sinkBase.setMasterAudioLevel(f);
            }
        } else {
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11207v1(f);
            }
        }
    }

    public void setMaxCacheDuration(long j) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11208w1(j);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_STREAM_COUNT, j);
        }
    }

    public void setMaxPacketDuration(long j) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11208w1(j);
        }
    }

    public void setMediaCodecEnable(boolean z) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11212y1(z);
        }
    }

    public void setMinCacheDuration(long j) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11214z1(j);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_AUDIO_DECODER_BYTES, j);
        }
    }

    public void setNetAnchorTime(long j) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11112A1(j);
        }
    }

    public void setNotifyTriggerDuration(long j) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11114B1(j);
        }
    }

    public void setOnCameraSetListener(OnCameraSetListener onCameraSetListener) {
        this.mOnCameraSetListener = onCameraSetListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    public void setOnFPSChangeListener(OnFPSRateListener onFPSRateListener) {
        this.mOnFPSChangeListener = onFPSRateListener;
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    public void setOnRecordStoped(OnRecordStopedListener onRecordStopedListener) {
        this.mOnRecordStopedListener = onRecordStopedListener;
    }

    public void setOnRtcStatusListener(OnRtcStatusListener onRtcStatusListener) {
        this.mOnRtcStatusListener = onRtcStatusListener;
    }

    public void setOnSurroundMusicStatusListener(OnSurroundMusicStatusListener onSurroundMusicStatusListener) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11116C1(onSurroundMusicStatusListener);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setOnSurroundMusicStatusListener(onSurroundMusicStatusListener);
        }
    }

    public void setOnWiredHeadsetStatusListener(OnWiredHeadsetStatusListener onWiredHeadsetStatusListener) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11118D1(onWiredHeadsetStatusListener);
        }
    }

    public void setParameters(String str) {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setParameters(str);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setPcmDataCallback(SinkBase.PcmDateCallback pcmDateCallback) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.setPcmDataCallback(pcmDateCallback);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setPcmDataCallback(pcmDateCallback);
        }
    }

    public void setPlayBackAudioLevel(float f) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setPlayBackAudioLevel(f);
        }
    }

    public final void setPlaybackDateCallback(SinkBase.PlaybackDateCallback playbackDateCallback) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.setPlaybackDateCallback(playbackDateCallback);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setPlaybackDateCallback(playbackDateCallback);
        }
    }

    public void setPlayerStateCallback(OnPlayerStateCallback onPlayerStateCallback) {
    }

    public void setPreferCameraSize(int i, int i2) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10733B(i, i2);
        }
    }

    public void setPreviewDisplay(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.getSurface();
            this.mSurface = surfaceHolder;
        } else {
            this.mSurface = null;
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11187n0(surfaceHolder);
        }
    }

    public void setPreviewScale(PointF pointF) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11120E1(pointF);
        }
    }

    public void setPreviewSize(int i, int i2) {
    }

    public void setPreviewSizeSetListener(OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener) {
        this.mPreviewSizeSetListener = onVideoPreviewSizeSetListener;
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10735C(onVideoPreviewSizeSetListener);
        }
    }

    public void setPreviewSurfaceTexture(SurfaceTexture surfaceTexture) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11187n0(surfaceTexture);
        }
    }

    public void setPreviewZoom(float f) {
        if (f == 0.0f) {
            f = 1.0f;
        }
        this.mZoom = f;
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10736D(f);
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11122F1(this.mZoom);
        }
    }

    public void setPropertyFloat(int i, float f) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            try {
                sinkBase.setPropertyFloat(i, f);
            } catch (Error e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void setPropertyLong(int i, long j) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            try {
                sinkBase.setPropertyLong(i, j);
            } catch (Error e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void setRecordDateCallback(SinkBase.RecordDateCallback recordDateCallback) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.setRecordDateCallback(recordDateCallback);
        }
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setRecordDateCallback(recordDateCallback);
        }
    }

    public void setRenderFrameRate(int i) {
        n8c.c(TAG, "----setRenderFrameRate:" + i);
        MomoSurface momoSurface = this.mFakeSurface;
        if (momoSurface != null) {
            momoSurface.m10924Q0(i);
        }
    }

    public void setRole(int i) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setRole(i);
        }
    }

    public void setRoomMode(int i) {
        SinkBase sinkBase = this.mAttachedWriter;
        if (sinkBase != null) {
            sinkBase.setRoomMode(i);
        }
        SinkBase sinkBase2 = this.mIjkWriter;
        if (sinkBase2 != null) {
            sinkBase2.setRoomMode(i);
        }
    }

    public void setRoomType(int i) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setRoomType(i);
        }
    }

    public void setRtmpPath(String str) {
        this.mOutpath = str;
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setRtmpPath(str);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setRtmpPath(str);
        }
    }

    public void setScreenOnWhilePublishing(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            this.mScreenOnWhilePlaying = z;
        }
    }

    public void setScreenQuality(VideoQuality videoQuality) {
        MomoSurface momoSurface = this.mFakeSurface;
        if (momoSurface != null) {
            momoSurface.m10926S0(videoQuality);
        }
    }

    public void setSei(String str) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setSei(str);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setSei(str);
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11124G1(str);
        }
    }

    public void setServerSystemTime(long j) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setPropertyLong(IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, j);
        }
    }

    public void setSessionID(long j) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setSessionID(j);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setSessionID(j);
        }
    }

    public void setSlaveAudioLevel(float f) {
        this.mSlaveAudioLevel = f;
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                sinkBase.setSlaveAudioLevel(f);
            }
        } else {
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11126H1(f);
            }
        }
    }

    public void setStreamPixFmt(long j) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setPropertyLong(FFS_PROP_INT64_PIX_FMT, j);
        }
        n8c.c(TAG, "setStreamPixFmt:" + j);
    }

    public void setStreamerCaptureType(int i, int i2) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10737E(i, i2);
        }
    }

    public void setStreamerInOutAndType(int i, String str, String str2) {
        n8c.c(TAG, "setStreamerInOutAndType:type:" + i + ";inpath:" + str + ";;outpath:" + str2);
        this.mInpath = str;
        this.mOutpath = str2;
        this.mFileType = i;
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setStreamerInOutAndType(i, str, str2);
            }
            SinkBase sinkBase2 = this.mAttachedWriter;
            if (sinkBase2 != null) {
                sinkBase2.setStreamerInOutAndType(i, str, str2);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setStreamerType(int i, String str) {
    }

    public void setUserID(int i) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setUserID(i);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setUserID(i);
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11137N1(i);
        }
    }

    public void setUserSig(String str) {
    }

    public void setVideoChannelListener(z1l0 z1l0Var) {
        this.mVideoChannelListener = z1l0Var;
        this.streamProduct.m11139O1(z1l0Var);
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setVideoChannellistener(z1l0Var);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.setVideoChannellistener(z1l0Var);
        }
    }

    public void setVideoCodeFrameRate(int i) {
    }

    public void setVideoEncoder(int i) {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setVideoEncoder(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setVideoEncodingBitRate(int i) {
        n8c.c(TAG, "----setVideoEncodingBitRate: Rate=" + i);
        if (i <= 0) {
            i = 100000;
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11141P1(i);
        }
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setVideoEncodingBitRate(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setVideoFrameRate(int i) {
        n8c.c(TAG, "----setVideoFrameRate: videoFrameRate=" + i);
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11143Q1(i);
        }
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setVideoFrameRate(i);
            }
            SourceBase sourceBase = this.mIjkSource;
            if (sourceBase != null) {
                sourceBase.mo10738F(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setVideoMixerBackgroundImgUrl(String str) {
    }

    public void setVideoQualityParameters(boolean z) {
        this.mVideoQualityFlg = z;
        if (getAgoraEngine() != null) {
            getAgoraEngine().setVideoQualityParameters(this.mVideoQualityFlg);
        }
    }

    public void setVideoResolution(int i) {
        this.mVideoResolution = i;
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10739G(i);
        }
    }

    public void setVideoSize(int i, int i2) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11145R1(i, i2);
        }
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setVideoSize(i, i2);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setVideoSource(int i) {
        try {
            SinkBase sinkBase = this.mIjkWriter;
            if (sinkBase != null) {
                sinkBase.setVideoSource(i);
            }
            SinkBase sinkBase2 = this.mAttachedWriter;
            if (sinkBase2 != null) {
                sinkBase2.setVideoSource(i);
            }
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.m11147S1(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setViewShowMode(int i) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11149T1(i);
        }
    }

    public void setVoicebackwardsEnable(boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.setVoicebackwardsEnable(z);
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11151U1(z);
        }
    }

    public void setWarpType(Integer num) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10740H(num.intValue());
        }
    }

    public void setZoomLevel(int i) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10741I(i);
        }
    }

    public void startAttachStreamer() {
        SinkBase sinkBase = this.mAttachedWriter;
        if (sinkBase != null) {
            sinkBase.startAttachStreamer();
        }
    }

    public void startAudioCapture() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11152V1();
        }
    }

    public void startCaptureImage(Activity activity, Bitmap bitmap, int i, int i2, int i3) {
        SourceBase sourceBase;
        SourceBase sourceBase2 = this.mIjkSource;
        if (sourceBase2 != null) {
            sourceBase2.mo10762q();
        }
        this.mIjkSource = new ImageSource(this.mFakeSurface, this.streamProduct);
        n8c.c(TAG, "----set select image: " + this.mFakeSurface + "," + this.streamProduct);
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer == null || this.mFakeSurface == null || (sourceBase = this.mIjkSource) == null) {
            return;
        }
        this.mCaptureType = 2;
        streamProducer.m11200r2(activity, sourceBase);
        this.mFakeSurface.m10919L0(this.mCaptureType);
        this.streamProduct.m11156X1(activity, bitmap, i, i2, i3, 0);
    }

    public void startCaptureScreen(Activity activity, int i, int i2, MediaProjection mediaProjection, int i3) {
        SourceBase sourceBase;
        SourceBase sourceBase2 = this.mIjkSource;
        if (sourceBase2 != null) {
            sourceBase2.mo10762q();
        }
        this.mIjkSource = new ScreenSource(this.mFakeSurface, this.streamProduct);
        n8c.c(TAG, "----set select screen: " + this.mFakeSurface + "," + this.streamProduct);
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer == null || this.mFakeSurface == null || (sourceBase = this.mIjkSource) == null) {
            return;
        }
        this.mCaptureType = 1;
        streamProducer.m11200r2(activity, sourceBase);
        this.mFakeSurface.m10919L0(this.mCaptureType);
        this.streamProduct.m11158Y1(activity, i, i2, mediaProjection, i3);
    }

    public void startPlaying() {
        ijkMediaStreamer ijkmediastreamer;
        int i;
        int i2;
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.startPlaying();
        }
        if (this.mLogHelper != null || (i = this.mInterval) <= 0 || (i2 = this.mCount) <= 0) {
            ijkmediastreamer = this;
        } else {
            ijkmediastreamer = this;
            ijkmediastreamer.mLogHelper = new IjkStreamerLogHelper(this.mContext, ijkmediastreamer, i, i2, this.mLogUploadCallBack);
        }
        IjkStreamerLogHelper ijkStreamerLogHelper = ijkmediastreamer.mLogHelper;
        if (ijkStreamerLogHelper != null) {
            ijkStreamerLogHelper.m10832k();
            ijkmediastreamer.mLogHelper.m10829h(ijkmediastreamer.mOutpath);
        }
    }

    public void startPreview(int i, Object obj) {
    }

    public void startRecording() {
        int i;
        int i2;
        n8c.c("zjlfound", "----startRecording");
        s7y.h().r();
        this.mCmdHandler.removeMessages(100);
        this.mCmdHandler.sendMessage(this.mCmdHandler.obtainMessage(100, 0, 0, 0));
        startMonitor();
        if (this.mLogHelper != null || (i = this.mInterval) <= 0 || (i2 = this.mCount) <= 0) {
            return;
        }
        this.mLogHelper = new IjkStreamerLogHelper(this.mContext, this, i, i2, this.mLogUploadCallBack);
    }

    public void startSurroundMusic(String str, int i, long j) {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                sinkBase.startSurroundMusic(str, i, j);
            }
        } else {
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.startSurroundMusic(str, i, j);
            }
        }
    }

    public void startSurroundMusicEx(String str, boolean z, boolean z2, int i) {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            sinkBase.startSurroundMusicEx(str, z, z2, i);
            return;
        }
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.startSurroundMusic(str, 0, 0L);
        }
    }

    public void stopAudioCapture() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11172e2();
        }
    }

    public void stopCaptureImage() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10789L();
        }
    }

    public void stopCaptureScreen() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10803M();
        }
    }

    public void stopPlaying() {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.stopPlaying();
        }
        IjkStreamerLogHelper ijkStreamerLogHelper = this.mLogHelper;
        if (ijkStreamerLogHelper != null) {
            ijkStreamerLogHelper.m10833l();
            this.mLogHelper.m10830i(0, this.mOutpath);
        }
    }

    public void stopPublishHelp(long j) {
        n8c.c(TAG, "----stopPublishHelp");
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11177h2(j);
        }
    }

    public void stopRecording() {
        n8c.c("zjlfound", "stopRecording");
        s7y.h().s();
        this.mCmdHandler.removeMessages(101);
        this.mCmdHandler.sendMessage(this.mCmdHandler.obtainMessage(101, 0, 0, 0));
        IjkStreamerLogHelper ijkStreamerLogHelper = this.mLogHelper;
        if (ijkStreamerLogHelper != null) {
            ijkStreamerLogHelper.m10833l();
        }
    }

    public void stopRenderer() {
    }

    public void stopSurroundMusic() {
        SinkBase sinkBase = this.mIjkWriter;
        if (!(sinkBase instanceof IjkWriter)) {
            if (sinkBase != null) {
                sinkBase.stopSurroundMusic();
            }
        } else {
            StreamProducer streamProducer = this.streamProduct;
            if (streamProducer != null) {
                streamProducer.stopSurroundMusic();
            }
        }
    }

    public void switchCamera() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10742N();
            this.mCameraID = this.mIjkSource.mo10760o() ? 1 : 0;
        }
    }

    public void switchFilterTo(Activity activity, ts2 ts2Var) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10743O(activity.getApplicationContext(), ts2Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    public void switchVideoResolution(int i, int i2) {
        boolean z = true;
        if (i == 720 || i2 == 1280) {
            if (this.mVideoResolution != 3) {
                n8c.c(TAG, "----switchVideoResolution: 3w:" + i + ",h:" + i2);
                selectCameraSize(3);
            } else {
                z = false;
            }
        } else if (i == 528 || i2 == 960) {
            if (this.mVideoResolution != 5) {
                n8c.c(TAG, "----switchVideoResolution: 5w:" + i + ",h:" + i2);
                selectCameraSize(5);
            } else {
                z = false;
            }
        } else if (this.mVideoResolution != 1) {
            n8c.c(TAG, "----switchVideoResolution: 1w:" + i + ",h:" + i2);
            selectCameraSize(1);
        } else {
            z = false;
        }
        if (this.streamProduct == null || !z) {
            return;
        }
        n8c.c(TAG, "----switchVideoResolution: sizeChanged=" + z);
        this.streamProduct.notifyResumeRecording();
        n8c.c(TAG, "----switchVideoResolution: call notifyResumeRecording end");
    }

    public void unRegisterHeadsetPlugReceiver() {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11182k2();
        }
    }

    public void unSelectCamera() {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10744P();
        }
    }

    public void updateCaptureImage(Bitmap bitmap, int i, int i2, int i3) {
        StreamProducer streamProducer;
        if (this.mIjkSource == null || (streamProducer = this.streamProduct) == null || this.mFakeSurface == null || this.mCaptureType != 2) {
            return;
        }
        streamProducer.m11186m2(bitmap, i, i2, i3);
    }

    public void updateChannelkey(String str) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.updateChannelkey(str);
        }
        SinkBase sinkBase2 = this.mAttachedWriter;
        if (sinkBase2 != null) {
            sinkBase2.updateChannelkey(str);
        }
    }

    public void updateVideoVideoQuality(VideoQuality videoQuality) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11194p2(videoQuality);
        }
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10745R(videoQuality);
        }
    }

    public void uploadLocalVideo(boolean z) {
        SinkBase sinkBase = this.mIjkWriter;
        if (sinkBase != null) {
            sinkBase.uploadLocalVideo(z);
        }
    }

    public void startPreview(String str, Object obj) {
    }

    public void SetSubVideoPos(long j, int i, int i2, int i3, int i4, int i5) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11132K1(j, i, i2, i3, i4, i5);
        }
    }

    public void setRoomMode(int i, boolean z) {
        SinkBase sinkBase = this.mAttachedWriter;
        if (sinkBase != null) {
            sinkBase.setRoomMode(i, z);
        }
        SinkBase sinkBase2 = this.mIjkWriter;
        if (sinkBase2 != null) {
            sinkBase2.setRoomMode(i, z);
        }
    }

    public void selectFilter(Context context, ts2 ts2Var) {
        SourceBase sourceBase = this.mIjkSource;
        if (sourceBase != null) {
            sourceBase.mo10766t(this.mContext, ts2Var);
        }
    }

    public void selectFilter(Activity activity, GPUImageFilterTools.FilterType filterType, int i, int i2) {
        this.mCmdHandler.removeMessages(200);
        this.mCmdHandler.sendMessage(this.mCmdHandler.obtainMessage(200, filterType.ordinal(), i, Integer.valueOf(i2)));
    }

    public void openPublishHelp(Activity activity, long j, String str) {
        n8c.c(TAG, "----openPublishHelp 6:");
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11174g1(activity, this, j, str, null, 0);
        }
    }

    public void openPublishHelp(Activity activity, long j, String str, SizeChangedCallback sizeChangedCallback) {
        n8c.c(TAG, "----openPublishHelp 5:");
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11174g1(activity, this, j, str, sizeChangedCallback, 0);
        }
    }

    public void openPublishHelp(Activity activity, long j, String str, SizeChangedCallback sizeChangedCallback, int i) {
        n8c.c(TAG, "----openPublishHelp 4:" + i);
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11174g1(activity, this, j, str, sizeChangedCallback, i);
        }
    }

    public void openPublishHelp(Activity activity, long j, String str, int i, int i2) {
        n8c.c(TAG, "----openPublishHelp 3:");
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11173f1(activity, this, j, str, i, i2, null, 0, null);
        }
    }

    public void openPublishHelp(Activity activity, long j, String str, int i, int i2, SizeChangedCallback sizeChangedCallback) {
        n8c.c(TAG, "----openPublishHelp 2:");
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11173f1(activity, this, j, str, i, i2, sizeChangedCallback, 0, null);
        }
    }

    public void openPublishHelp(Activity activity, long j, Bitmap bitmap) {
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer != null) {
            streamProducer.m11171e1(activity, j, bitmap);
        }
    }

    public void attachStreamer(int i, boolean z) {
        int i2 = this.mVenderID;
        if (i2 != i) {
            if (i2 == 0 || (this.mIjkWriter instanceof IjkWriter)) {
                this.mVenderID = i;
                SinkBase sinkBase = this.mAttachedWriter;
                if (sinkBase != null) {
                    sinkBase.release();
                    this.mAttachedWriter = null;
                }
                if (i == -1) {
                    deAttachStreamer();
                    return;
                }
                if (i == 0) {
                    this.mAttachedWriter = new IjkWriter(this.streamProduct, z);
                }
                if (i == 1) {
                    this.mAttachedWriter = new AgoraWriter(this.mContext, this.mFakeSurface.m10954n0(), this.streamProduct, z);
                }
                this.streamProduct.m11184l2(this.mAttachedWriter);
            }
        }
    }

    public ijkMediaStreamer(Context context, int i, int i2) {
        this.mMasterAudioLevel = 1.0f;
        this.mSlaveAudioLevel = 0.5f;
        this.mDefaultAudioRoutetoSpeakerphone = true;
        this.mInpath = null;
        this.mOutpath = null;
        this.mFileType = 10;
        this.streamProduct = null;
        this.mPlayStatus = 0;
        this.mPrepared = false;
        this.mVideoChannelListener = null;
        this.mCaptureType = 0;
        this.mIjkWriter = null;
        this.mAttachedWriter = null;
        this.mPreIjkWriter = null;
        this.mIjkSource = null;
        this.mVideoResolution = 1;
        this.mZoom = 1.0f;
        this.mVideoQuality = null;
        this.mMonitorHandler = null;
        this.mMonitorTread = null;
        this.mInterval = -1;
        this.mCount = -1;
        this.mVideoQualityFlg = false;
        this.mAudioHighQualityFlg = false;
        this.mLogHelper = null;
        this.mParent = null;
        this.mCameraID = 0;
        this.mContext = context;
        this.mVenderID = i2;
        this.mOnlyAudio = false;
        initMediaStreamer(sLocalLibLoader, 1, i2, null);
    }

    public void startCaptureImage(Activity activity, Bitmap bitmap, int i, int i2, int i3, int i4) {
        SourceBase sourceBase;
        SourceBase sourceBase2 = this.mIjkSource;
        if (sourceBase2 != null) {
            sourceBase2.mo10762q();
        }
        this.mIjkSource = new ImageSource(this.mFakeSurface, this.streamProduct);
        n8c.c(TAG, "----set select image: " + this.mFakeSurface + "," + this.streamProduct);
        StreamProducer streamProducer = this.streamProduct;
        if (streamProducer == null || this.mFakeSurface == null || (sourceBase = this.mIjkSource) == null) {
            return;
        }
        this.mCaptureType = 2;
        streamProducer.m11200r2(activity, sourceBase);
        this.mFakeSurface.m10919L0(this.mCaptureType);
        this.streamProduct.m11156X1(activity, bitmap, i, i2, i3, i4);
    }

    public ijkMediaStreamer(Context context, int i, int i2, boolean z) {
        this.mMasterAudioLevel = 1.0f;
        this.mSlaveAudioLevel = 0.5f;
        this.mDefaultAudioRoutetoSpeakerphone = true;
        this.mInpath = null;
        this.mOutpath = null;
        this.mFileType = 10;
        this.streamProduct = null;
        this.mPlayStatus = 0;
        this.mPrepared = false;
        this.mVideoChannelListener = null;
        this.mCaptureType = 0;
        this.mIjkWriter = null;
        this.mAttachedWriter = null;
        this.mPreIjkWriter = null;
        this.mIjkSource = null;
        this.mVideoResolution = 1;
        this.mZoom = 1.0f;
        this.mVideoQuality = null;
        this.mMonitorHandler = null;
        this.mMonitorTread = null;
        this.mInterval = -1;
        this.mCount = -1;
        this.mVideoQualityFlg = false;
        this.mAudioHighQualityFlg = false;
        this.mLogHelper = null;
        this.mParent = null;
        this.mCameraID = 0;
        this.mContext = context;
        this.mVenderID = i2;
        this.mOnlyAudio = z;
        initMediaStreamer(sLocalLibLoader, 1, i2, null);
    }

    public ijkMediaStreamer(Context context, int i, int i2, String str) {
        this.mMasterAudioLevel = 1.0f;
        this.mSlaveAudioLevel = 0.5f;
        this.mDefaultAudioRoutetoSpeakerphone = true;
        this.mInpath = null;
        this.mOutpath = null;
        this.mFileType = 10;
        this.streamProduct = null;
        this.mPlayStatus = 0;
        this.mPrepared = false;
        this.mVideoChannelListener = null;
        this.mCaptureType = 0;
        this.mIjkWriter = null;
        this.mAttachedWriter = null;
        this.mPreIjkWriter = null;
        this.mIjkSource = null;
        this.mVideoResolution = 1;
        this.mZoom = 1.0f;
        this.mVideoQuality = null;
        this.mMonitorHandler = null;
        this.mMonitorTread = null;
        this.mInterval = -1;
        this.mCount = -1;
        this.mVideoQualityFlg = false;
        this.mAudioHighQualityFlg = false;
        this.mLogHelper = null;
        this.mParent = null;
        this.mCameraID = 0;
        this.mContext = context;
        this.mVenderID = i2;
        this.mOnlyAudio = false;
        initMediaStreamer(sLocalLibLoader, 1, i2, str);
    }

    public ijkMediaStreamer(Context context, int i, int i2, String str, boolean z) {
        this.mMasterAudioLevel = 1.0f;
        this.mSlaveAudioLevel = 0.5f;
        this.mDefaultAudioRoutetoSpeakerphone = true;
        this.mInpath = null;
        this.mOutpath = null;
        this.mFileType = 10;
        this.streamProduct = null;
        this.mPlayStatus = 0;
        this.mPrepared = false;
        this.mVideoChannelListener = null;
        this.mCaptureType = 0;
        this.mIjkWriter = null;
        this.mAttachedWriter = null;
        this.mPreIjkWriter = null;
        this.mIjkSource = null;
        this.mVideoResolution = 1;
        this.mZoom = 1.0f;
        this.mVideoQuality = null;
        this.mMonitorHandler = null;
        this.mMonitorTread = null;
        this.mInterval = -1;
        this.mCount = -1;
        this.mVideoQualityFlg = false;
        this.mAudioHighQualityFlg = false;
        this.mLogHelper = null;
        this.mParent = null;
        this.mCameraID = 0;
        this.mContext = context;
        this.mVenderID = i2;
        this.mOnlyAudio = z;
        initMediaStreamer(sLocalLibLoader, 1, i2, str);
    }

    public ijkMediaStreamer(Context context, int i) {
        this.mMasterAudioLevel = 1.0f;
        this.mSlaveAudioLevel = 0.5f;
        this.mDefaultAudioRoutetoSpeakerphone = true;
        this.mInpath = null;
        this.mOutpath = null;
        this.mFileType = 10;
        this.streamProduct = null;
        this.mPlayStatus = 0;
        this.mPrepared = false;
        this.mOnlyAudio = false;
        this.mVenderID = 0;
        this.mVideoChannelListener = null;
        this.mCaptureType = 0;
        this.mIjkWriter = null;
        this.mAttachedWriter = null;
        this.mPreIjkWriter = null;
        this.mIjkSource = null;
        this.mVideoResolution = 1;
        this.mZoom = 1.0f;
        this.mVideoQuality = null;
        this.mMonitorHandler = null;
        this.mMonitorTread = null;
        this.mInterval = -1;
        this.mCount = -1;
        this.mVideoQualityFlg = false;
        this.mAudioHighQualityFlg = false;
        this.mLogHelper = null;
        this.mParent = null;
        this.mCameraID = 0;
    }
}
