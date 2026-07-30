package com.p074ss.bytertc.engine.engineimpl;

import android.content.Context;
import android.content.Intent;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglBase14;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p074ss.bytertc.base.utils.RtcContextUtils;
import com.p074ss.bytertc.engine.AudioEffectPlayer;
import com.p074ss.bytertc.engine.GameRoomConfig;
import com.p074ss.bytertc.engine.GameRoomImpl;
import com.p074ss.bytertc.engine.IAudioFrameObserver;
import com.p074ss.bytertc.engine.IAudioFrameProcessor;
import com.p074ss.bytertc.engine.IGameRoom;
import com.p074ss.bytertc.engine.IMetadataObserver;
import com.p074ss.bytertc.engine.IRTCAudioDeviceManager;
import com.p074ss.bytertc.engine.IRTCAudioDeviceManagerEx;
import com.p074ss.bytertc.engine.IRemoteEncodedAudioFrameObserver;
import com.p074ss.bytertc.engine.IWTNStream;
import com.p074ss.bytertc.engine.InternalCloudProxyInfo;
import com.p074ss.bytertc.engine.InternalDestInfo;
import com.p074ss.bytertc.engine.InternalLocalProxyConfiguration;
import com.p074ss.bytertc.engine.InternalMediaTypeEnhancementConfig;
import com.p074ss.bytertc.engine.InternalVideoCaptureConfig;
import com.p074ss.bytertc.engine.InternalVideoEncoderConfig;
import com.p074ss.bytertc.engine.InternalVideoSourceConfig;
import com.p074ss.bytertc.engine.NativeRTCVideoFunctions;
import com.p074ss.bytertc.engine.NativeRTCVideoFunctionsEx;
import com.p074ss.bytertc.engine.NetworkTimeInfo;
import com.p074ss.bytertc.engine.RTCAudioDeviceManager;
import com.p074ss.bytertc.engine.RTCEngine;
import com.p074ss.bytertc.engine.RTCEngineEx;
import com.p074ss.bytertc.engine.RTCRoom;
import com.p074ss.bytertc.engine.RTCRoomEx;
import com.p074ss.bytertc.engine.RTCRoomImpl;
import com.p074ss.bytertc.engine.RTSRoom;
import com.p074ss.bytertc.engine.RTSRoomImpl;
import com.p074ss.bytertc.engine.RemoteVideoRenderConfig;
import com.p074ss.bytertc.engine.RtcMediaPlayer;
import com.p074ss.bytertc.engine.SingScoringManager;
import com.p074ss.bytertc.engine.VideoCanvas;
import com.p074ss.bytertc.engine.VideoDeviceManager;
import com.p074ss.bytertc.engine.VideoEncoderConfig;
import com.p074ss.bytertc.engine.WTNStream;
import com.p074ss.bytertc.engine.adapter.VideoSinkAdapter;
import com.p074ss.bytertc.engine.adapter.VideoSinkTask;
import com.p074ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.p074ss.bytertc.engine.audio.IMediaPlayer;
import com.p074ss.bytertc.engine.audio.ISingScoringManager;
import com.p074ss.bytertc.engine.data.AlphaLayout;
import com.p074ss.bytertc.engine.data.AudioAlignmentMode;
import com.p074ss.bytertc.engine.data.AudioContentTypeConfig;
import com.p074ss.bytertc.engine.data.AudioEncodeConfig;
import com.p074ss.bytertc.engine.data.AudioFormat;
import com.p074ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.p074ss.bytertc.engine.data.AudioProcessorMethod;
import com.p074ss.bytertc.engine.data.AudioPropertiesConfig;
import com.p074ss.bytertc.engine.data.AudioRecordingConfig;
import com.p074ss.bytertc.engine.data.AudioRenderType;
import com.p074ss.bytertc.engine.data.AudioRoute;
import com.p074ss.bytertc.engine.data.AudioSourceType;
import com.p074ss.bytertc.engine.data.CameraId;
import com.p074ss.bytertc.engine.data.CloudProxyInfo;
import com.p074ss.bytertc.engine.data.DestInfo;
import com.p074ss.bytertc.engine.data.EarMonitorMode;
import com.p074ss.bytertc.engine.data.EchoTestConfig;
import com.p074ss.bytertc.engine.data.EffectBeautyMode;
import com.p074ss.bytertc.engine.data.EngineConfig;
import com.p074ss.bytertc.engine.data.MirrorType;
import com.p074ss.bytertc.engine.data.RTCLogConfig;
import com.p074ss.bytertc.engine.data.RecordingConfig;
import com.p074ss.bytertc.engine.data.RemoteMirrorType;
import com.p074ss.bytertc.engine.data.RemoteStreamKey;
import com.p074ss.bytertc.engine.data.ReturnStatus;
import com.p074ss.bytertc.engine.data.SEICountPerFrame;
import com.p074ss.bytertc.engine.data.ScreenMediaType;
import com.p074ss.bytertc.engine.data.StreamIndex;
import com.p074ss.bytertc.engine.data.StreamPriority;
import com.p074ss.bytertc.engine.data.StreamSyncInfoConfig;
import com.p074ss.bytertc.engine.data.VideoDenoiseMode;
import com.p074ss.bytertc.engine.data.VideoFrameData;
import com.p074ss.bytertc.engine.data.VideoOrientation;
import com.p074ss.bytertc.engine.data.VideoPixelFormat;
import com.p074ss.bytertc.engine.data.VideoRotation;
import com.p074ss.bytertc.engine.data.VideoRotationMode;
import com.p074ss.bytertc.engine.data.VideoSimulcastMode;
import com.p074ss.bytertc.engine.data.VideoSourceType;
import com.p074ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.p074ss.bytertc.engine.data.ZoomConfigType;
import com.p074ss.bytertc.engine.data.ZoomDirectionType;
import com.p074ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p074ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p074ss.bytertc.engine.handler.IRTCEngineEventHandlerEx;
import com.p074ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.p074ss.bytertc.engine.handler.RTCEncryptHandler;
import com.p074ss.bytertc.engine.handler.RTCExternalVideoEncoderEventHandler;
import com.p074ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.p074ss.bytertc.engine.handler.RTCRemoteEncodedVideoFrameObserver;
import com.p074ss.bytertc.engine.handler.RTCVideoEventHandler;
import com.p074ss.bytertc.engine.handler.RTCVideoProcessor;
import com.p074ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.p074ss.bytertc.engine.live.ChorusCacheSyncObserver;
import com.p074ss.bytertc.engine.live.ClientMixedStreamConfig;
import com.p074ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.p074ss.bytertc.engine.live.IClientMixedStreamObserver;
import com.p074ss.bytertc.engine.live.MixedStreamConfig;
import com.p074ss.bytertc.engine.live.MixedStreamPushTargetConfig;
import com.p074ss.bytertc.engine.live.MixedStreamPushTargetType;
import com.p074ss.bytertc.engine.live.PushMixedStreamToCDNObserver;
import com.p074ss.bytertc.engine.live.PushSingleStreamParam;
import com.p074ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.p074ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.p074ss.bytertc.engine.loader.RTCNativeLibraryLoaderInfo;
import com.p074ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
import com.p074ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.p074ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
import com.p074ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.p074ss.bytertc.engine.type.AnsMode;
import com.p074ss.bytertc.engine.type.AudioProfileType;
import com.p074ss.bytertc.engine.type.AudioScenarioType;
import com.p074ss.bytertc.engine.type.ErrorCode;
import com.p074ss.bytertc.engine.type.LocalProxyConfiguration;
import com.p074ss.bytertc.engine.type.MediaTypeEnhancementConfig;
import com.p074ss.bytertc.engine.type.MessageConfig;
import com.p074ss.bytertc.engine.type.ProblemFeedbackInfo;
import com.p074ss.bytertc.engine.type.ProblemFeedbackOption;
import com.p074ss.bytertc.engine.type.PublishFallbackOption;
import com.p074ss.bytertc.engine.type.RecordingType;
import com.p074ss.bytertc.engine.type.RemoteUserPriority;
import com.p074ss.bytertc.engine.type.SubscribeFallbackOptions;
import com.p074ss.bytertc.engine.type.TorchState;
import com.p074ss.bytertc.engine.type.VoiceChangerType;
import com.p074ss.bytertc.engine.type.VoiceEqualizationConfig;
import com.p074ss.bytertc.engine.type.VoiceReverbConfig;
import com.p074ss.bytertc.engine.type.VoiceReverbType;
import com.p074ss.bytertc.engine.utils.AppMonitor;
import com.p074ss.bytertc.engine.utils.AudioFrame;
import com.p074ss.bytertc.engine.utils.EncodedAudioFrameData;
import com.p074ss.bytertc.engine.utils.LogRecover;
import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.engine.video.AmazingEffect;
import com.p074ss.bytertc.engine.video.ByteWatermark;
import com.p074ss.bytertc.engine.video.IAmazingEffect;
import com.p074ss.bytertc.engine.video.ISnapshotResultCallback;
import com.p074ss.bytertc.engine.video.IVideoDeviceManager;
import com.p074ss.bytertc.engine.video.IVideoEffect;
import com.p074ss.bytertc.engine.video.IVideoProcessor;
import com.p074ss.bytertc.engine.video.IVideoSink;
import com.p074ss.bytertc.engine.video.LocalVideoSinkConfig;
import com.p074ss.bytertc.engine.video.RTCVideoEffect;
import com.p074ss.bytertc.engine.video.RTCWatermarkConfig;
import com.p074ss.bytertc.engine.video.RemoteVideoSinkConfig;
import com.p074ss.bytertc.engine.video.VideoCaptureConfig;
import com.p074ss.bytertc.engine.video.VideoDecoderConfig;
import com.p074ss.bytertc.engine.video.VideoPreprocessorConfig;
import com.p074ss.bytertc.ktv.IKTVManager;
import com.p074ss.bytertc.ktv.KTVManagerImpl;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.wg3;

/* JADX INFO: loaded from: classes11.dex */
public class RTCEngineImpl extends RTCEngineEx {
    protected static final String TAG = "RtcVideoImpl";

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f56479a = 0;
    private static WeakReference<IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler> mAudioDeviceManagerEventHandler = null;
    private static boolean mLibraryLoaded = false;
    private static final String nativeLibraryPrefix = "lib";
    private static final String nativeLibrarySurffix = ".so";
    private static final String sSoLibraryName = "volcenginertc";
    private AppMonitor.Callback appStateCallback;
    private boolean isExEngine;
    private RTCVideoEffect mAdvanceVideoEffect;
    private ChorusCacheSyncObserver mChorusObserver;
    private Context mContext;
    private EglBase.Context mEglBaseCtx;
    private Handler mEglHandler;
    private HandlerThread mEglThread;
    private RTCVideoEventHandler mEngineEventHandler;
    private IExternalVideoEncoderEventHandler mExternalVideoEncoderHandler;
    private final ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private ILocalEncodedVideoFrameObserver mLocalEncodedVideoFrameObserver;
    private LogUtil.ILoggerSink mLoggerSink;
    private IMetadataObserver mMetadataObserver;
    private PushMixedStreamToCDNObserver mMixedStreamToCDNObserver;
    protected long mNativeEngine;
    private final ReentrantReadWriteLock mReadWriteLock;
    private IRemoteEncodedVideoFrameObserver mRemoteEncodedVideoFrameObserver;
    private Map<String, RTCRoomImpl> mRoomMap;
    private List<RTSRoomImpl> mRoomRtsLists;
    private IRTCEngineEventHandler mRtcEngineHandler;
    private IRTCEngineEventHandlerEx mRtcEngineHandlerEx;
    private RTCExternalVideoEncoderEventHandler mRtcExVideoEncoderHandler;
    private RTCLocalEncodedVideoFrameObserver mRtcLocalEncodedVideoFrameObserver;
    private RTCRemoteEncodedVideoFrameObserver mRtcRemoteEncodedVideoFrameObserver;
    private RTCVideoProcessor mRtcVideoPreprocessor;
    private State mState;
    private VideoSinkTask mVideoSinkTask;
    private static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    private static RTCNativeLibraryLoaderInfo sRtcLoaderInfo = new RTCNativeLibraryLoaderInfo();
    private static RTCAudioDeviceEventHandler mRTCAudioDeviceManagerEventHandler = null;
    private static String mDeviceId = "";
    private boolean mIsUseCustomEglEnv = false;
    private boolean mEnableTranscode = false;
    private Runnable mOnDestroyCompletedCallback = null;
    private EglBase mRootEglBase = null;
    private boolean mIsFront = true;
    private AudioEffectPlayer mAudioEffectPlayer = null;
    private Map<Integer, RtcMediaPlayer> mRtcMediaPlayerMap = null;
    private RTCAudioDeviceManager mAudioDeviceManagerInterval = null;
    private SingScoringManager mSingScoringManager = null;
    private KTVManagerImpl mKTVManager = null;
    private WTNStream mWTNStream = null;
    private VideoDeviceManager mVideoDevicemanager = null;
    private AmazingEffect mAmazingEffect = null;
    private Map<String, GameRoomImpl> mGameRoomMap = null;

    public enum State {
        IDLE,
        IN_ROOM,
        DESTORY
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    public RTCEngineImpl(EngineConfig engineConfig, IRTCEngineEventHandler iRTCEngineEventHandler, IRTCEngineEventHandlerEx iRTCEngineEventHandlerEx, boolean z, boolean z2) throws IllegalStateException {
        Context context;
        String str = z;
        this.isExEngine = false;
        this.mNativeEngine = 0L;
        this.mRtcVideoPreprocessor = null;
        this.mRtcExVideoEncoderHandler = null;
        this.mRtcLocalEncodedVideoFrameObserver = null;
        this.mRtcRemoteEncodedVideoFrameObserver = null;
        this.mEglBaseCtx = null;
        this.mChorusObserver = null;
        this.mMixedStreamToCDNObserver = null;
        this.mAdvanceVideoEffect = null;
        this.mRoomMap = null;
        this.mRoomRtsLists = null;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mLoggerSink = new LogUtil.ILoggerSink() { // from class: l.bjc0
            @Override // com.ss.bytertc.engine.utils.LogUtil.ILoggerSink
            public final void onLoggerMessage(LogUtil.LogLevel logLevel, String str2, Throwable th) {
                RTCEngineImpl.m82070e(this.f76973a, logLevel, str2, th);
            }
        };
        this.appStateCallback = new AppMonitor.Callback() { // from class: l.cjc0
            @Override // com.ss.bytertc.engine.utils.AppMonitor.Callback
            public final void callback(int i) {
                RTCEngineImpl.m82069d(this.f82135a, i);
            }
        };
        Context context2 = engineConfig.context;
        String str2 = engineConfig.appID;
        boolean z3 = engineConfig.isGameScene;
        Object obj = engineConfig.eglContext;
        JSONObject jSONObject = engineConfig.parameters;
        LogUtil.m82083d(TAG, "create RtcEngineImpl with appId: " + str2);
        if (obj != null && !(obj instanceof EGLContext)) {
            wg3.m206174a("eglContext is not an instance of android.opengl.EGLContext");
            throw null;
        }
        if (!mLibraryLoaded) {
            reportAndThrowError(str2, "rtc sdk load so failed", ErrorCode.ERROR_CODE_LOAD_SO_LIB);
        }
        if (str2 == null) {
            reportAndThrowError(str2, "app id is null", ErrorCode.ERROR_CODE_APP_ID_NULL);
        }
        try {
            HandlerThread handlerThread = new HandlerThread("rtc_egl_thread");
            this.mEglThread = handlerThread;
            try {
                try {
                    handlerThread.start();
                    VideoSinkTask videoSinkTask = new VideoSinkTask();
                    this.mVideoSinkTask = videoSinkTask;
                    videoSinkTask.init();
                    Handler handler = new Handler(this.mEglThread.getLooper());
                    this.mEglHandler = handler;
                    if (obj != null) {
                        this.mEglBaseCtx = new EglBase14.Context((EGLContext) obj);
                    } else {
                        if (!((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: l.djc0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return RTCEngineImpl.m82068c(this.f88829a);
                            }
                        })).booleanValue()) {
                            throw new IllegalStateException("init egl context failed");
                        }
                        this.mEglBaseCtx = this.mRootEglBase.getEglBaseContext();
                    }
                    this.mRtcVideoPreprocessor = new RTCVideoProcessor();
                    this.mContext = context2.getApplicationContext();
                    this.mState = State.IDLE;
                    this.mRtcEngineHandler = iRTCEngineEventHandler;
                    this.mRtcEngineHandlerEx = iRTCEngineEventHandlerEx;
                    LogUtil.setLoggerSink(this.mLoggerSink);
                    this.mEngineEventHandler = new RTCVideoEventHandler(this);
                    this.mRtcLocalEncodedVideoFrameObserver = new RTCLocalEncodedVideoFrameObserver(this);
                    this.mRtcRemoteEncodedVideoFrameObserver = new RTCRemoteEncodedVideoFrameObserver(this);
                    this.mChorusObserver = new ChorusCacheSyncObserver();
                    this.mMixedStreamToCDNObserver = new PushMixedStreamToCDNObserver();
                    this.mRtcExVideoEncoderHandler = new RTCExternalVideoEncoderEventHandler(this);
                    this.mRoomMap = new HashMap();
                    this.mRoomRtsLists = new ArrayList();
                    if (jSONObject != null) {
                        try {
                            context = context2;
                            try {
                                try {
                                    jSONObject.put("rtc.platform_init_elapse_ms", SystemClock.elapsedRealtime() - jSONObject.optLong("rtc.platform_init_elapse_ms"));
                                } catch (JSONException e) {
                                    LogUtil.m82084e(TAG, "error in recording create engine elpase. " + e.getMessage());
                                }
                            } catch (IllegalStateException e2) {
                                e = e2;
                                str = str2;
                                LogUtil.m82084e(TAG, "create native engine error, native engine is invalid.");
                                doDestroyOnCreate();
                                reportAndThrowError(str, "system resources check failed. " + e.getMessage(), 0);
                                this.mAdvanceVideoEffect = new RTCVideoEffect(this.mNativeEngine);
                                LogRecover.getInstance().startTimer();
                                AppMonitor.get(context).register(context, this.appStateCallback);
                                return;
                            } catch (UnsatisfiedLinkError e3) {
                                e = e3;
                            }
                        } catch (IllegalStateException e4) {
                            e = e4;
                            context = context2;
                        } catch (UnsatisfiedLinkError e5) {
                            e = e5;
                        }
                    } else {
                        context = context2;
                    }
                    String string = "";
                    try {
                        if (z2) {
                            this.isExEngine = str;
                            Context context3 = this.mContext;
                            if (str != 0) {
                                this.mNativeEngine = createRTCVideoExMulti(context3.getApplicationContext(), str2, this.mEngineEventHandler, jSONObject != null ? jSONObject.toString() : "", this.mEglBaseCtx, engineConfig.nativeLoadPath);
                            } else {
                                str = str2;
                                try {
                                    Context applicationContext = context3.getApplicationContext();
                                    RTCVideoEventHandler rTCVideoEventHandler = this.mEngineEventHandler;
                                    if (jSONObject != null) {
                                        string = jSONObject.toString();
                                    }
                                    this.mNativeEngine = createRTCVideoMulti(applicationContext, str, rTCVideoEventHandler, string, this.mEglBaseCtx, engineConfig.nativeLoadPath);
                                } catch (IllegalStateException e6) {
                                    e = e6;
                                    LogUtil.m82084e(TAG, "create native engine error, native engine is invalid.");
                                    doDestroyOnCreate();
                                    reportAndThrowError(str, "system resources check failed. " + e.getMessage(), 0);
                                } catch (UnsatisfiedLinkError e7) {
                                    e = e7;
                                }
                            }
                        } else {
                            this.isExEngine = str;
                            Context context4 = this.mContext;
                            if (str != 0) {
                                this.mNativeEngine = createRTCVideoEx(context4.getApplicationContext(), str2, this.mEngineEventHandler, jSONObject != null ? jSONObject.toString() : "", this.mEglBaseCtx, engineConfig.nativeLoadPath);
                            } else {
                                this.mNativeEngine = createRTCVideo(context4.getApplicationContext(), str2, z3, this.mEngineEventHandler, jSONObject != null ? jSONObject.toString() : "", this.mEglBaseCtx, engineConfig.nativeLoadPath);
                            }
                        }
                        if (engineInvalid()) {
                            throw new IllegalStateException("create native engine error.");
                        }
                        this.mAdvanceVideoEffect = new RTCVideoEffect(this.mNativeEngine);
                        LogRecover.getInstance().startTimer();
                        AppMonitor.get(context).register(context, this.appStateCallback);
                        return;
                    } catch (UnsatisfiedLinkError e8) {
                        e = e8;
                    }
                    e.printStackTrace();
                    throw new UnsatisfiedLinkError("rtc loader info:" + sRtcLoaderInfo.toString() + " exception info:" + e.getStackTrace().toString());
                } catch (OutOfMemoryError unused) {
                    throw new IllegalStateException("egl thread create thread failed as out of memory");
                }
            } catch (IllegalStateException e9) {
                e = e9;
            }
        } catch (IllegalStateException e10) {
            e = e10;
            str = str2;
            context = context2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82066a(RTCEngineImpl rTCEngineImpl) {
        EglBase eglBase = rTCEngineImpl.mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            rTCEngineImpl.mRootEglBase = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m82067b(RTCEngineImpl rTCEngineImpl) {
        EglBase eglBase = rTCEngineImpl.mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            rTCEngineImpl.mRootEglBase = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m82068c(RTCEngineImpl rTCEngineImpl) {
        rTCEngineImpl.getClass();
        try {
            rTCEngineImpl.initEglContext(null);
            rTCEngineImpl.mRootEglBase.createDummyPbufferSurface();
            rTCEngineImpl.mRootEglBase.makeCurrent();
            return Boolean.TRUE;
        } catch (RuntimeException unused) {
            LogUtil.m82084e(TAG, "init egl context falied");
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m82069d(RTCEngineImpl rTCEngineImpl, int i) {
        rTCEngineImpl.mJniReadLock.lock();
        try {
            if (rTCEngineImpl.engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetAppState failed.");
            } else {
                NativeRTCVideoFunctions.nativeSetAppState(rTCEngineImpl.mNativeEngine, i == 1 ? Active.TYPE : OMSResourceType.background);
            }
        } finally {
            rTCEngineImpl.mJniReadLock.unlock();
        }
    }

    private void doDestroyOnCreate() {
        RTCVideoProcessor rTCVideoProcessor = this.mRtcVideoPreprocessor;
        if (rTCVideoProcessor != null) {
            rTCVideoProcessor.dispose();
            this.mRtcVideoPreprocessor = null;
        }
        Handler handler = this.mEglHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: l.ajc0
                @Override // java.lang.Runnable
                public final void run() {
                    RTCEngineImpl.m82067b(this.f71808a);
                }
            });
        }
        HandlerThread handlerThread = this.mEglThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        VideoSinkTask videoSinkTask = this.mVideoSinkTask;
        if (videoSinkTask != null) {
            videoSinkTask.exit();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m82070e(RTCEngineImpl rTCEngineImpl, LogUtil.LogLevel logLevel, String str, Throwable th) {
        IRTCEngineEventHandler rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler();
        if (rtcEngineHandler != null) {
            try {
                rtcEngineHandler.onLoggerMessage(logLevel, str, th);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m82071f(RTCEngineImpl rTCEngineImpl) {
        Runnable runnable = rTCEngineImpl.mOnDestroyCompletedCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Context getApplicationContext() {
        return RtcContextUtils.getApplicationContext();
    }

    public static IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler getAudioDeviceManagerEvent() {
        return mAudioDeviceManagerEventHandler.get();
    }

    public static String getSdkVersion() {
        return NativeRTCVideoFunctions.nativeGetSDKVersion();
    }

    private void initEglContext(Object obj) {
        if (obj == null) {
            this.mRootEglBase = EglBase.create();
            this.mIsUseCustomEglEnv = false;
            return;
        }
        if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            this.mRootEglBase = EglBase.createEgl10((javax.microedition.khronos.egl.EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof EGLContext) {
            this.mRootEglBase = EglBase.createEgl14((EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof EglBase) {
            this.mRootEglBase = EglBase.create(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
        } else {
            this.mRootEglBase = EglBase.create();
        }
        this.mIsUseCustomEglEnv = true;
    }

    public static synchronized boolean initializeNativeLibs(String str) {
        try {
            if (mLibraryLoaded) {
                mRtcNativeLibraryListener.onLoadAlready("volcenginertc");
            } else {
                boolean zLoadNativeLib = loadNativeLib(str, "volcenginertc");
                mLibraryLoaded = zLoadNativeLib;
                if (!zLoadNativeLib) {
                    mRtcNativeLibraryListener.onLoadError("volcenginertc");
                    return mLibraryLoaded;
                }
            }
            mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
            sRtcLoaderInfo.setLoadResult(mLibraryLoaded);
            sRtcLoaderInfo.setLoadTimeStampMs(System.currentTimeMillis());
            return mLibraryLoaded;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static boolean loadNativeLib(String str, String str2) {
        LogUtil.m82086i(TAG, "Loading library: " + str2);
        String str3 = str + ("lib" + str2 + nativeLibrarySurffix);
        RTCNativeLibraryLoader rTCNativeLibraryLoader = RTCEngine.mRtcNativeLibraryLoader;
        if (rTCNativeLibraryLoader != null) {
            return rTCNativeLibraryLoader.load(str2);
        }
        try {
            if (TextUtils.isEmpty(str)) {
                System.loadLibrary(str2);
            } else {
                System.load(str3);
            }
            LogUtil.m82086i(TAG, "loadNativeLib: Success Load " + str2);
            return true;
        } catch (NullPointerException e) {
            LogUtil.m82085e(TAG, "loadNativeLib: Failed to load native library: " + str2, e);
            return false;
        } catch (SecurityException e2) {
            LogUtil.m82085e(TAG, "loadNativeLib: Failed to load native library: " + str2, e2);
            return false;
        } catch (Exception e3) {
            LogUtil.m82085e(TAG, "loadNativeLib: Failed to load native library: " + str2, e3);
            return false;
        } catch (UnsatisfiedLinkError e4) {
            LogUtil.m82085e(TAG, "loadNativeLib: Failed to load native library: " + str2, e4);
            return false;
        }
    }

    private void reportAndThrowError(String str, String str2, int i) throws IllegalStateException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_key", "rtc_error");
            jSONObject.put("rtc_app_id", str);
            jSONObject.put("device_id", mDeviceId);
            jSONObject.put(StateEvent.Name.ERROR_CODE, i);
            jSONObject.put("message", str2);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("rtc_timestamp", System.currentTimeMillis());
            jSONObject.put("os", "android");
            jSONObject.put("product_line", "rtc");
            jSONObject.put("report_version", 5);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        IRTCEngineEventHandler iRTCEngineEventHandler = this.mRtcEngineHandler;
        if (iRTCEngineEventHandler != null) {
            iRTCEngineEventHandler.onLogReport("live_webrtc_monitor_log", jSONObject);
            this.mRtcEngineHandler.onError(i);
        }
        LogUtil.m82084e(TAG, str2);
        throw new IllegalStateException("Create engine failed " + str2);
    }

    public static int setLogConfig(RTCLogConfig rTCLogConfig) {
        return NativeRTCVideoFunctions.nativeSetLogConfig(rTCLogConfig.logLevel.getValue(), rTCLogConfig.logPath, rTCLogConfig.logFileSize, rTCLogConfig.logFilenamePrefix);
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int clearVideoWatermark(StreamIndex streamIndex) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, clearVideoWatermark failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeClearVideoWatermark(this.mNativeEngine, streamIndex.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public IGameRoom createGameRoom(String str, GameRoomConfig gameRoomConfig) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, createGameRoom failed.");
            } else {
                if (str == null) {
                    str = "";
                }
                Map<String, GameRoomImpl> map = this.mGameRoomMap;
                if (map != null && map.containsKey(str)) {
                    long nativeHandle = this.mGameRoomMap.get(str).getNativeHandle();
                    Map<String, GameRoomImpl> map2 = this.mGameRoomMap;
                    if (nativeHandle != 0) {
                        return map2.get(str);
                    }
                    map2.get(str);
                    this.mGameRoomMap.remove(str);
                }
                long jNativeCreateGameRoom = NativeRTCVideoFunctions.nativeCreateGameRoom(this.mNativeEngine, str, gameRoomConfig);
                if (jNativeCreateGameRoom != 0) {
                    GameRoomImpl gameRoomImpl = new GameRoomImpl(str, jNativeCreateGameRoom);
                    if (this.mGameRoomMap == null) {
                        this.mGameRoomMap = new HashMap();
                    }
                    this.mGameRoomMap.put(str, gameRoomImpl);
                    return gameRoomImpl;
                }
                LogUtil.m82084e(TAG, "createRoom failed, native room is invalid");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public RTCRoom createRTCRoom(String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, createRoom failed.");
            } else {
                if (str == null) {
                    str = "";
                }
                long jNativeCreateRoom = NativeRTCVideoFunctions.nativeCreateRoom(this.mNativeEngine, str);
                if (jNativeCreateRoom != 0) {
                    Map<String, RTCRoomImpl> map = this.mRoomMap;
                    if (map != null && map.containsKey(str)) {
                        RTCRoomImpl rTCRoomImpl = this.mRoomMap.get(str);
                        if (rTCRoomImpl.getNativeHandle() != 0) {
                            rTCRoomImpl.addRtcRoomCount();
                            return this.mRoomMap.get(str);
                        }
                        this.mRoomMap.remove(str);
                    }
                    RTCRoomImpl rTCRoomImpl2 = new RTCRoomImpl(str, jNativeCreateRoom);
                    this.mRoomMap.put(str, rTCRoomImpl2);
                    return rTCRoomImpl2;
                }
                LogUtil.m82084e(TAG, "createRoom failed, native room is invalid");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public RTCRoomEx createRTCRoomEx(String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, createRoom failed.");
            } else {
                if (str == null) {
                    str = "";
                }
                long jNativeCreateRoomEx = NativeRTCVideoFunctions.nativeCreateRoomEx(this.mNativeEngine, str);
                if (jNativeCreateRoomEx != 0) {
                    Map<String, RTCRoomImpl> map = this.mRoomMap;
                    if (map != null && map.containsKey(str)) {
                        RTCRoomImpl rTCRoomImpl = this.mRoomMap.get(str);
                        if (rTCRoomImpl.getNativeHandle() != 0) {
                            rTCRoomImpl.addRtcRoomCount();
                            return this.mRoomMap.get(str);
                        }
                        this.mRoomMap.remove(str);
                    }
                    RTCRoomImpl rTCRoomImpl2 = new RTCRoomImpl(str, jNativeCreateRoomEx);
                    this.mRoomMap.put(str, rTCRoomImpl2);
                    return rTCRoomImpl2;
                }
                LogUtil.m82084e(TAG, "createRoom failed, native room is invalid");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createRTCVideo(Context context, String str, boolean z, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2, String str3) {
        return NativeRTCVideoFunctions.nativeCreateRTCVideo(context, str, z, rTCVideoEventHandler, str2, context2, str3);
    }

    public long createRTCVideoEx(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2, String str3) {
        return NativeRTCVideoFunctionsEx.nativeCreateRTCVideoEx(context, str, rTCVideoEventHandler, str2, context2, str3);
    }

    public long createRTCVideoExMulti(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2, String str3) {
        return NativeRTCVideoFunctionsEx.nativeCreateRTCVideoExMulti(context, str, rTCVideoEventHandler, str2, context2, str3);
    }

    public long createRTCVideoMulti(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2, EglBase.Context context2, String str3) {
        return NativeRTCVideoFunctions.nativeCreateRTCVideoMulti(context, str, rTCVideoEventHandler, str2, context2, str3);
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public RTSRoom createRTSRoom(String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, createRoom failed.");
            } else {
                if (str == null) {
                    str = "";
                }
                long jNativeCreateRtsRoom = NativeRTCVideoFunctions.nativeCreateRtsRoom(this.mNativeEngine, str);
                if (jNativeCreateRtsRoom != 0) {
                    RTSRoomImpl rTSRoomImpl = new RTSRoomImpl(str, jNativeCreateRtsRoom);
                    this.mRoomRtsLists.add(rTSRoomImpl);
                    return rTSRoomImpl;
                }
                LogUtil.m82084e(TAG, "createRoom failed, native room is invalid");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void destroyRTCVideo(long j) {
        NativeRTCVideoFunctions.nativeDestroyRTCVideo(j);
    }

    public void destroyRTCVideoEx(long j) {
        NativeRTCVideoFunctionsEx.nativeDestroyRTCVideoEx(j);
    }

    public void destroyRTCVideoExMulti(long j) {
        NativeRTCVideoFunctionsEx.nativeDestroyRTCVideoExMulti(j);
    }

    public void destroyRTCVideoMulti(long j) {
        NativeRTCVideoFunctions.nativeDestroyRTCVideoMulti(j);
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int disableAlphaChannelVideoEncode(StreamIndex streamIndex) {
        int iValue;
        LogUtil.m82083d(TAG, "disableAlphaChannelVideoEncode");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, disableAlphaChannelVideoEncode failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeDisableAlphaChannelVideoEncode(this.mNativeEngine, streamIndex.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod) {
        int iNativeDisableAudioFrameCallback;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, disableAudioFrameCallback failed.");
                iNativeDisableAudioFrameCallback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeDisableAudioFrameCallback = NativeRTCVideoFunctions.nativeDisableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value());
            }
            return iNativeDisableAudioFrameCallback;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod) {
        int iNativeDisableAudioProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, disableAudioProcessor failed.");
                iNativeDisableAudioProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeDisableAudioProcessor = NativeRTCVideoFunctions.nativeDisableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value());
            }
            return iNativeDisableAudioProcessor;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void doDestroy(boolean z) {
        LogUtil.m82083d(TAG, "destroy RtcEngineImpl.");
        this.mJniWriteLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, no need to destroy now.");
                this.mJniWriteLock.unlock();
                return;
            }
            long j = this.mNativeEngine;
            this.mNativeEngine = 0L;
            this.mJniWriteLock.unlock();
            this.mState = State.DESTORY;
            SingScoringManager singScoringManager = this.mSingScoringManager;
            if (singScoringManager != null) {
                singScoringManager.destroy();
            }
            KTVManagerImpl kTVManagerImpl = this.mKTVManager;
            if (kTVManagerImpl != null) {
                kTVManagerImpl.destroy();
            }
            RTCAudioDeviceManager rTCAudioDeviceManager = this.mAudioDeviceManagerInterval;
            if (rTCAudioDeviceManager != null) {
                rTCAudioDeviceManager.destroy();
            }
            Map<String, RTCRoomImpl> map = this.mRoomMap;
            if (map != null) {
                Iterator<RTCRoomImpl> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
            }
            Map<String, GameRoomImpl> map2 = this.mGameRoomMap;
            if (map2 != null) {
                Iterator<GameRoomImpl> it2 = map2.values().iterator();
                while (it2.hasNext()) {
                    it2.next().destroy();
                }
            }
            List<RTSRoomImpl> list = this.mRoomRtsLists;
            if (list != null) {
                Iterator<RTSRoomImpl> it3 = list.iterator();
                while (it3.hasNext()) {
                    it3.next().destroy();
                }
            }
            AudioEffectPlayer audioEffectPlayer = this.mAudioEffectPlayer;
            if (audioEffectPlayer != null) {
                audioEffectPlayer.setEventHandler(null);
            }
            Map<Integer, RtcMediaPlayer> map3 = this.mRtcMediaPlayerMap;
            if (map3 != null) {
                Iterator<RtcMediaPlayer> it4 = map3.values().iterator();
                while (it4.hasNext()) {
                    it4.next().setEventHandler(null);
                }
            }
            boolean z2 = this.isExEngine;
            if (z) {
                if (z2) {
                    destroyRTCVideoExMulti(j);
                } else {
                    destroyRTCVideoMulti(j);
                }
            } else if (z2) {
                destroyRTCVideoEx(j);
            } else {
                destroyRTCVideo(j);
            }
            if (audioEffectPlayer != null) {
                audioEffectPlayer.destroy();
            }
            Map<Integer, RtcMediaPlayer> map4 = this.mRtcMediaPlayerMap;
            if (map4 != null) {
                Iterator<RtcMediaPlayer> it5 = map4.values().iterator();
                while (it5.hasNext()) {
                    it5.next().destroy();
                }
            }
            this.mIsFront = true;
            RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
            if (rTCVideoEffect != null) {
                rTCVideoEffect.destroy();
                this.mAdvanceVideoEffect = null;
            }
            AmazingEffect amazingEffect = this.mAmazingEffect;
            if (amazingEffect != null) {
                amazingEffect.dispose();
                this.mAmazingEffect = null;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: l.ejc0
                @Override // java.lang.Runnable
                public final void run() {
                    RTCEngineImpl.m82071f(this.f94292a);
                }
            });
            AppMonitor.get(this.mContext).unRegister(this.appStateCallback).release(this.mContext);
            this.mRtcVideoPreprocessor.dispose();
            this.mRtcVideoPreprocessor = null;
            ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, new Runnable() { // from class: l.fjc0
                @Override // java.lang.Runnable
                public final void run() {
                    RTCEngineImpl.m82066a(this.f99312a);
                }
            });
            HandlerThread handlerThread = this.mEglThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            VideoSinkTask videoSinkTask = this.mVideoSinkTask;
            if (videoSinkTask != null) {
                videoSinkTask.exit();
            }
            KTVManagerImpl kTVManagerImpl2 = this.mKTVManager;
            if (kTVManagerImpl2 != null) {
                kTVManagerImpl2.destroy();
                this.mKTVManager = null;
            }
            LogUtil.setLoggerSink(null);
        } catch (Throwable th) {
            this.mJniWriteLock.unlock();
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableAlphaChannelVideoEncode(StreamIndex streamIndex, AlphaLayout alphaLayout) {
        int iValue;
        LogUtil.m82083d(TAG, "enableAlphaChannelVideoEncode");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, enableAlphaChannelVideoEncode failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = alphaLayout == null ? ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value() : NativeRTCVideoFunctions.nativeEnableAlphaChannelVideoEncode(this.mNativeEngine, streamIndex.value(), alphaLayout.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableAudioAEDReport(int i) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, enableAudioAEDReport failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeEnableAudioAEDReport(this.mNativeEngine, i);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public void enableAudioDecoding(boolean z) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, enableAudioDecoding failed.");
            } else {
                NativeRTCVideoFunctions.nativeEnableAudioDecoding(this.mNativeEngine, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public void enableAudioEncoding(boolean z) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, enableAudioEncoding failed.");
            } else {
                NativeRTCVideoFunctions.nativeEnableAudioEncoding(this.mNativeEngine, z);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat) {
        int iNativeEnableAudioFrameCallback;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, enableAudioFrameCallback failed.");
                iNativeEnableAudioFrameCallback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableAudioFrameCallback = NativeRTCVideoFunctions.nativeEnableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value());
            }
            return iNativeEnableAudioFrameCallback;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat) {
        int iNativeEnableAudioProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, enableAudioProcessor failed.");
                iNativeEnableAudioProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableAudioProcessor = NativeRTCVideoFunctions.nativeEnableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value(), audioFormat.samplesPerCall);
            }
            return iNativeEnableAudioProcessor;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, EnableAudioPropertiesReport failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeEnableAudioPropertiesReport(this.mNativeEngine, audioPropertiesConfig.interval, audioPropertiesConfig.enableSpectrum, audioPropertiesConfig.enableVad, audioPropertiesConfig.localMainReportMode.value(), audioPropertiesConfig.smooth, audioPropertiesConfig.audioReportMode.value(), audioPropertiesConfig.enableVoicePitch);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableAudioVADReport(int i) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, enableAudioVADReport failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeEnableAudioVADReport(this.mNativeEngine, i);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableCameraAutoExposureFaceMode(boolean z) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeEnableCameraAutoExposureFaceMode(this.mNativeEngine, z);
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableEffectBeauty(boolean z) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeEnableEffectBeauty(this.mNativeEngine, z);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, enableEffectBeauty failed.");
            return 1000;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableExternalSoundCard(boolean z) {
        int iNativeEnableExternalSoundCard;
        LogUtil.m82083d(TAG, "enableExternalSoundCard");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, enableExternalSoundCard failed.");
                iNativeEnableExternalSoundCard = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableExternalSoundCard = NativeRTCVideoFunctions.nativeEnableExternalSoundCard(this.mNativeEngine, z);
            }
            return iNativeEnableExternalSoundCard;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableLocalVoiceReverb(boolean z) {
        int iNativeEnableLocalVoiceReverb;
        LogUtil.m82083d(TAG, "enableLocalVoiceReverb...enable: " + z);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, enableLocalVoiceReverb failed.");
                iNativeEnableLocalVoiceReverb = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableLocalVoiceReverb = NativeRTCVideoFunctions.nativeEnableLocalVoiceReverb(this.mNativeEngine, z);
            }
            return iNativeEnableLocalVoiceReverb;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enablePlaybackDucking(boolean z) {
        int iNativeEnablePlaybackDucking;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, EnablePlaybackDucking failed.");
                iNativeEnablePlaybackDucking = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnablePlaybackDucking = NativeRTCVideoFunctions.nativeEnablePlaybackDucking(this.mNativeEngine, z);
            }
            return iNativeEnablePlaybackDucking;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int enableVocalInstrumentBalance(boolean z) {
        int iNativeEnableVocalInstrumentBalance;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, EnableVocalInstrumentBalance failed.");
                iNativeEnableVocalInstrumentBalance = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeEnableVocalInstrumentBalance = NativeRTCVideoFunctions.nativeEnableVocalInstrumentBalance(this.mNativeEngine, z);
            }
            return iNativeEnableVocalInstrumentBalance;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean engineInvalid() {
        return this.mNativeEngine == 0;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int feedback(List<ProblemFeedbackOption> list, ProblemFeedbackInfo problemFeedbackInfo) {
        int iNativeReportFeedback;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetRuntimeParameters failed.");
                iNativeReportFeedback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                long j = 0;
                for (int i = 0; i < list.size(); i++) {
                    j |= list.get(i).value;
                }
                iNativeReportFeedback = NativeRTCVideoFunctions.nativeReportFeedback(this.mNativeEngine, j, problemFeedbackInfo);
            }
            return iNativeReportFeedback;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IAmazingEffect getAmazingEffectInterface() {
        LogUtil.m82083d(TAG, "getAmazingEffectInterface");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                AmazingEffect amazingEffect = this.mAmazingEffect;
                if (amazingEffect == null) {
                    long jNativeGetAmazingEffectInterface = NativeRTCVideoFunctions.nativeGetAmazingEffectInterface(this.mNativeEngine);
                    if (jNativeGetAmazingEffectInterface == 0) {
                        LogUtil.m82084e(TAG, "getAmazingEffectInterface failed");
                    } else {
                        amazingEffect = new AmazingEffect(jNativeGetAmazingEffectInterface);
                        this.mAmazingEffect = amazingEffect;
                    }
                }
                return amazingEffect;
            }
            LogUtil.m82084e(TAG, "native engine is invalid, getAmazingEffectInterface");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public IRTCAudioDeviceManager getAudioDeviceManager() {
        LogUtil.m82083d(TAG, "getAudioDeviceManager");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, getAudioDeviceManager failed.");
                return null;
            }
            long jNativeGetAudioDeviceManager = NativeRTCVideoFunctions.nativeGetAudioDeviceManager(this.mNativeEngine);
            if (jNativeGetAudioDeviceManager == 0 || jNativeGetAudioDeviceManager == -1) {
                LogUtil.m82084e(TAG, "getAudioDeviceManager failed");
                this.mAudioDeviceManagerInterval = null;
            } else {
                this.mAudioDeviceManagerInterval = new RTCAudioDeviceManager(jNativeGetAudioDeviceManager);
            }
            return this.mAudioDeviceManagerInterval;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public IAudioEffectPlayer getAudioEffectPlayer() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                AudioEffectPlayer audioEffectPlayer = this.mAudioEffectPlayer;
                if (audioEffectPlayer == null) {
                    long jNativeGetAudioEffectPlayer = NativeRTCVideoFunctions.nativeGetAudioEffectPlayer(this.mNativeEngine);
                    if (jNativeGetAudioEffectPlayer == 0) {
                        LogUtil.m82084e(TAG, "getAudioEffectPlayer failed");
                    } else {
                        audioEffectPlayer = new AudioEffectPlayer(jNativeGetAudioEffectPlayer, this.mNativeEngine);
                        this.mAudioEffectPlayer = audioEffectPlayer;
                    }
                }
                return audioEffectPlayer;
            }
            LogUtil.m82084e(TAG, "native engine is invalid, getAudioEffectPlayer");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public AudioRoute getAudioRoute() {
        LogUtil.m82083d(TAG, "getAudioRoute");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return AudioRoute.fromId(NativeRTCVideoFunctions.nativeGetAudioRoute(this.mNativeEngine));
            }
            LogUtil.m82084e(TAG, "native engine is invalid, getAudioRoute failed.");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public float getCameraZoomMaxRatio() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeGetCameraZoomMaxRatio(this.mNativeEngine);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
            return -1.0f;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public EglBase getEGLContext() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            return eglBase;
        }
        return null;
    }

    public ILocalEncodedVideoFrameObserver getEncodedVideoFrameObserver() {
        return this.mLocalEncodedVideoFrameObserver;
    }

    public IExternalVideoEncoderEventHandler getExternalVideoEncoderEventHandler() {
        return this.mExternalVideoEncoderHandler;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public IKTVManager getKTVManager() {
        this.mJniReadLock.lock();
        try {
            KTVManagerImpl kTVManagerImpl = null;
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, getKTVManger failed.");
            } else {
                synchronized (RTCEngineImpl.class) {
                    KTVManagerImpl kTVManagerImpl2 = this.mKTVManager;
                    if (kTVManagerImpl2 != null) {
                        this.mJniReadLock.unlock();
                        return kTVManagerImpl2;
                    }
                    long jNativeGetKTVManager = NativeRTCVideoFunctions.nativeGetKTVManager(this.mNativeEngine);
                    if (jNativeGetKTVManager == 0) {
                        LogUtil.m82084e(TAG, "getKTVManger failed");
                    } else {
                        kTVManagerImpl = new KTVManagerImpl(jNativeGetKTVManager);
                        this.mKTVManager = kTVManagerImpl;
                    }
                }
            }
            this.mJniReadLock.unlock();
            return kTVManagerImpl;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public IMediaPlayer getMediaPlayer(int i) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, getMediaPlayer");
            } else {
                Map<Integer, RtcMediaPlayer> map = this.mRtcMediaPlayerMap;
                if (map != null && map.containsKey(Integer.valueOf(i))) {
                    return this.mRtcMediaPlayerMap.get(Integer.valueOf(i));
                }
                long jNativeGetMediaPlayer = NativeRTCVideoFunctions.nativeGetMediaPlayer(this.mNativeEngine, i);
                if (jNativeGetMediaPlayer != 0) {
                    RtcMediaPlayer rtcMediaPlayer = new RtcMediaPlayer(jNativeGetMediaPlayer, this.mNativeEngine);
                    if (this.mRtcMediaPlayerMap == null) {
                        this.mRtcMediaPlayerMap = new HashMap();
                    }
                    this.mRtcMediaPlayerMap.put(Integer.valueOf(i), rtcMediaPlayer);
                    return rtcMediaPlayer;
                }
                LogUtil.m82084e(TAG, "getMediaPlayer failed");
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IMetadataObserver getMetadataObserver() {
        return this.mMetadataObserver;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public long getNativeHandle() {
        if (!engineInvalid()) {
            return this.mNativeEngine;
        }
        LogUtil.m82084e(TAG, "native engine is invalid, getNativeHandle failed.");
        return -1L;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public NetworkTimeInfo getNetworkTimeInfo() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeGetNetworkTimeInfo(this.mNativeEngine);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, getNetworkTimeInfo");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int getPeerOnlineStatus(String str) {
        int iNativeGetPeerOnlineStatus;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeGetPeerOnlineStatus = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeGetPeerOnlineStatus = NativeRTCVideoFunctions.nativeGetPeerOnlineStatus(this.mNativeEngine, str);
            }
            return iNativeGetPeerOnlineStatus;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public IRemoteEncodedVideoFrameObserver getRemoteEncodedVideoFrameObserver() {
        return this.mRemoteEncodedVideoFrameObserver;
    }

    public IRTCEngineEventHandler getRtcEngineHandler() {
        return this.mRtcEngineHandler;
    }

    public IRTCEngineEventHandlerEx getRtcEngineHandlerEx() {
        return this.mRtcEngineHandlerEx;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public ISingScoringManager getSingScoringManager() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                SingScoringManager singScoringManager = this.mSingScoringManager;
                if (singScoringManager == null) {
                    long jNativeGetSingScoringManager = NativeRTCVideoFunctions.nativeGetSingScoringManager(this.mNativeEngine);
                    if (jNativeGetSingScoringManager == 0) {
                        LogUtil.m82084e(TAG, "getSingScoringManager failed");
                    } else {
                        singScoringManager = new SingScoringManager(this.mNativeEngine, jNativeGetSingScoringManager);
                        this.mSingScoringManager = singScoringManager;
                    }
                }
                return singScoringManager;
            }
            LogUtil.m82084e(TAG, "native engine is invalid, getSingScoringManager");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public IVideoDeviceManager getVideoDeviceManager() {
        LogUtil.m82083d(TAG, "getVideoDeviceManager");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                VideoDeviceManager videoDeviceManager = this.mVideoDevicemanager;
                if (videoDeviceManager == null) {
                    long jNativeGetVideoDeviceManager = NativeRTCVideoFunctions.nativeGetVideoDeviceManager(this.mNativeEngine);
                    if (jNativeGetVideoDeviceManager == 0) {
                        LogUtil.m82084e(TAG, "getVideoDeviceManager failed");
                    } else {
                        videoDeviceManager = new VideoDeviceManager(jNativeGetVideoDeviceManager);
                        this.mVideoDevicemanager = videoDeviceManager;
                    }
                }
                return videoDeviceManager;
            }
            LogUtil.m82084e(TAG, "native engine is invalid, getVideoDeviceManager");
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public IVideoEffect getVideoEffectInterface() {
        LogUtil.m82083d(TAG, "getVideoEffectInterface");
        return this.mAdvanceVideoEffect;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public IWTNStream getWTNStream() {
        this.mJniReadLock.lock();
        try {
            WTNStream wTNStream = null;
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, getKTVManger failed.");
            } else {
                synchronized (RTCEngineImpl.class) {
                    WTNStream wTNStream2 = this.mWTNStream;
                    if (wTNStream2 != null) {
                        this.mJniReadLock.unlock();
                        return wTNStream2;
                    }
                    long jNativeGetWTNStream = NativeRTCVideoFunctions.nativeGetWTNStream(this.mNativeEngine);
                    if (jNativeGetWTNStream == 0) {
                        LogUtil.m82084e(TAG, "getWTNStream failed");
                    } else {
                        wTNStream = new WTNStream(jNativeGetWTNStream);
                        this.mWTNStream = wTNStream;
                    }
                }
            }
            this.mJniReadLock.unlock();
            return wTNStream;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public boolean isCameraExposurePositionSupported() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeIsCameraExposurePositionSupported(this.mNativeEngine);
            }
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public boolean isCameraFocusPositionSupported() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeIsCameraFocusPositionSupported(this.mNativeEngine);
            }
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public boolean isCameraTorchSupported() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeIsSupportFlashLight(this.mNativeEngine);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public boolean isCameraZoomSupported() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeIsCameraZoomSupported(this.mNativeEngine);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int login(String str, String str2) {
        int iNativeLogin;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeLogin = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeLogin = NativeRTCVideoFunctions.nativeLogin(this.mNativeEngine, str, str2);
            }
            return iNativeLogin;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int logout() {
        int iNativeLogout;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeLogout = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeLogout = NativeRTCVideoFunctions.nativeLogout(this.mNativeEngine);
            }
            return iNativeLogout;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int muteAudioCapture(StreamIndex streamIndex, boolean z) {
        int iNativeMuteAudioCapture;
        LogUtil.m82083d(TAG, "muteAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, muteAudioCapture failed.");
                iNativeMuteAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeMuteAudioCapture = NativeRTCVideoFunctions.nativeMuteAudioCapture(this.mNativeEngine, streamIndex.value(), z);
            }
            return iNativeMuteAudioCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int pullExternalAudioFrame(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, pullExternalAudioFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativePullExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int pushClientMixedStreamExternalVideoFrame(String str, VideoFrameData videoFrameData) {
        int iValue;
        LogUtil.m82083d(TAG, "pushExternalVideoFrame");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "pushClientMixedStreamExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrameData == null) {
                LogUtil.m82086i(TAG, "pushClientMixedStreamExternalVideoFrame: videoFrame is null, drop frame.");
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ReturnStatus returnStatus = ReturnStatus.RETURN_STATUS_SUCCESS;
                iValue = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushClientMixedStreamExternalVideoFrame(this.mNativeEngine, str, videoFrameData)).value();
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int pushExternalAudioFrame(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, pushExternalAudioFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativePushExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value(), audioFrame.extraInfo);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int pushExternalEncodedAudioFrame(EncodedAudioFrameData encodedAudioFrameData) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, pushExternalEncodedAudioFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                ByteBuffer byteBuffer = encodedAudioFrameData.extraInfo;
                long j = this.mNativeEngine;
                if (byteBuffer != null) {
                    int iValue2 = encodedAudioFrameData.codecType.value();
                    ByteBuffer byteBuffer2 = encodedAudioFrameData.data;
                    int i = encodedAudioFrameData.size;
                    long j2 = encodedAudioFrameData.timestampUs;
                    int iValue3 = encodedAudioFrameData.sampleRate.value();
                    int iValue4 = encodedAudioFrameData.channelNum.value();
                    int i2 = encodedAudioFrameData.frameSizeMs;
                    ByteBuffer byteBuffer3 = encodedAudioFrameData.extraInfo;
                    iValue = NativeRTCVideoFunctions.nativePushExternalEncodedAudioFrame(j, iValue2, byteBuffer2, i, j2, iValue3, iValue4, i2, byteBuffer3, byteBuffer3.capacity());
                } else {
                    iValue = NativeRTCVideoFunctions.nativePushExternalEncodedAudioFrame(j, encodedAudioFrameData.codecType.value(), encodedAudioFrameData.data, encodedAudioFrameData.size, encodedAudioFrameData.timestampUs, encodedAudioFrameData.sampleRate.value(), encodedAudioFrameData.channelNum.value(), encodedAudioFrameData.frameSizeMs, null, 0);
                }
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame) {
        int iNativePushExternalEncodedVideoFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, PushExternalEncodedVideoFrame failed.");
                iNativePushExternalEncodedVideoFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativePushExternalEncodedVideoFrame = NativeRTCVideoFunctions.nativePushExternalEncodedVideoFrame(this.mNativeEngine, streamIndex.value(), i, rTCEncodedVideoFrame.buffer, rTCEncodedVideoFrame.timestampUs, rTCEncodedVideoFrame.timestampDtsUs, rTCEncodedVideoFrame.width, rTCEncodedVideoFrame.height, rTCEncodedVideoFrame.videoCodecType.value(), rTCEncodedVideoFrame.videoPictureType.value(), rTCEncodedVideoFrame.videoRotation.value());
            }
            return iNativePushExternalEncodedVideoFrame;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int pushExternalVideoFrame(StreamIndex streamIndex, VideoFrameData videoFrameData) {
        int iValue;
        LogUtil.m82083d(TAG, "pushExternalVideoFrame");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrameData == null) {
                LogUtil.m82086i(TAG, "pushExternalVideoFrame: videoFrame is null, drop frame.");
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ReturnStatus returnStatus = ReturnStatus.RETURN_STATUS_SUCCESS;
                iValue = ReturnStatus.fromId(NativeRTCVideoFunctionsEx.nativePushExternalVideoFrame(this.mNativeEngine, streamIndex.value(), videoFrameData)).value();
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int pushReferenceAudioPCMData(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, pushReferenceAudioPCMData failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativePushReferenceAudioPCMData(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int pushScreenAudioFrame(AudioFrame audioFrame) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativePushScreenAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int pushScreenVideoFrame(VideoFrameData videoFrameData) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "pushScreenVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrameData == null) {
                LogUtil.m82086i(TAG, "pushScreenVideoFrame: videoFrame is null, drop frame.");
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iValue = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushScreenFrame(this.mNativeEngine, videoFrameData)).value();
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        int iNativeSetAudioFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, registerAudioFrameObserver failed.");
                iNativeSetAudioFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioFrameObserver = NativeRTCVideoFunctions.nativeSetAudioFrameObserver(this.mNativeEngine, iAudioFrameObserver);
            }
            return iNativeSetAudioFrameObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor) {
        int iNativeSetAudioFrameProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, registerAudioProcessor failed.");
                iNativeSetAudioFrameProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioFrameProcessor = NativeRTCVideoFunctions.nativeSetAudioFrameProcessor(this.mNativeEngine, iAudioFrameProcessor);
            }
            return iNativeSetAudioFrameProcessor;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver) {
        int iNativeRegisterLocalEncodedVideoFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, registerAudioFrameObserver failed.");
                iNativeRegisterLocalEncodedVideoFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mLocalEncodedVideoFrameObserver = iLocalEncodedVideoFrameObserver;
                long j = this.mNativeEngine;
                iNativeRegisterLocalEncodedVideoFrameObserver = iLocalEncodedVideoFrameObserver == null ? NativeRTCVideoFunctions.nativeRegisterLocalEncodedVideoFrameObserver(j, null) : NativeRTCVideoFunctions.nativeRegisterLocalEncodedVideoFrameObserver(j, this.mRtcLocalEncodedVideoFrameObserver);
            }
            return iNativeRegisterLocalEncodedVideoFrameObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int registerLocalVideoProcessor(IVideoProcessor iVideoProcessor, VideoPreprocessorConfig videoPreprocessorConfig) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, registerLocalVideoProcessor failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (videoPreprocessorConfig == null) {
                    videoPreprocessorConfig = new VideoPreprocessorConfig();
                }
                VideoPixelFormat videoPixelFormat = videoPreprocessorConfig.requiredPixelFormat;
                if (videoPixelFormat == VideoPixelFormat.UNKNOWN || videoPixelFormat == VideoPixelFormat.I420 || videoPixelFormat == VideoPixelFormat.TEXTURE_2D) {
                    RTCVideoProcessor rTCVideoProcessor = this.mRtcVideoPreprocessor;
                    if (rTCVideoProcessor == null || rTCVideoProcessor.registerLocalVideoProcessor(iVideoProcessor) != 0) {
                        iValue = ReturnStatus.RETURN_STATUS_WRONG_STATE.value();
                    } else {
                        VideoPixelFormat videoPixelFormat2 = videoPreprocessorConfig.requiredPixelFormat;
                        long j = this.mNativeEngine;
                        iValue = iVideoProcessor == null ? NativeRTCVideoFunctions.nativeRegisterLocalVideoProcessor(j, null, videoPixelFormat2.value()) : NativeRTCVideoFunctions.nativeRegisterLocalVideoProcessor(j, this.mRtcVideoPreprocessor, videoPixelFormat2.value());
                    }
                } else {
                    iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                }
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public void registerRemoteEncodedAudioFrameObserver(IRemoteEncodedAudioFrameObserver iRemoteEncodedAudioFrameObserver) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, registerRemoteEncodedAudioFrameObserver failed.");
            } else {
                NativeRTCVideoFunctions.nativeSetRemoteEncodedAudioFrameObserver(this.mNativeEngine, iRemoteEncodedAudioFrameObserver);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver) {
        int iNativeRegisterRemoteEncodedVideoFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, RegisterRemoteEncodedVideoFrameObserver failed.");
                iNativeRegisterRemoteEncodedVideoFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mRemoteEncodedVideoFrameObserver = iRemoteEncodedVideoFrameObserver;
                long j = this.mNativeEngine;
                iNativeRegisterRemoteEncodedVideoFrameObserver = iRemoteEncodedVideoFrameObserver == null ? NativeRTCVideoFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(j, null) : NativeRTCVideoFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(j, this.mRtcRemoteEncodedVideoFrameObserver);
            }
            return iNativeRegisterRemoteEncodedVideoFrameObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int requestRemoteVideoKeyFrame(RemoteStreamKey remoteStreamKey) {
        int iNativeRequestRemoteVideoKeyFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, RequestRemoteVideoKeyFrame failed.");
                iNativeRequestRemoteVideoKeyFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeRequestRemoteVideoKeyFrame = NativeRTCVideoFunctions.nativeRequestRemoteVideoKeyFrame(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value());
            }
            return iNativeRequestRemoteVideoKeyFrame;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int sendPublicStreamSEIMessage(StreamIndex streamIndex, int i, byte[] bArr, int i2, SEICountPerFrame sEICountPerFrame) {
        int iNativeSendPublicStreamSEIMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendPublicStreamSEIMessage failed.");
                iNativeSendPublicStreamSEIMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSendPublicStreamSEIMessage = NativeRTCVideoFunctions.nativeSendPublicStreamSEIMessage(this.mNativeEngine, streamIndex.value(), i, bArr, i2, sEICountPerFrame.value());
            }
            return iNativeSendPublicStreamSEIMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame) {
        int iNativeSendMultiSEIMessagePerVideoFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, registerMetadataObserver failed.");
                iNativeSendMultiSEIMessagePerVideoFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSendMultiSEIMessagePerVideoFrame = NativeRTCVideoFunctions.nativeSendMultiSEIMessagePerVideoFrame(this.mNativeEngine, streamIndex.value(), bArr, i, sEICountPerFrame.value());
            }
            return iNativeSendMultiSEIMessagePerVideoFrame;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public long sendServerBinaryMessage(byte[] bArr) {
        long jNativeSendServerBinaryMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                jNativeSendServerBinaryMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                jNativeSendServerBinaryMessage = NativeRTCVideoFunctions.nativeSendServerBinaryMessage(this.mNativeEngine, bArr);
            }
            return jNativeSendServerBinaryMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public long sendServerMessage(String str) {
        long jNativeSendServerMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                jNativeSendServerMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                jNativeSendServerMessage = NativeRTCVideoFunctions.nativeSendServerMessage(this.mNativeEngine, str);
            }
            return jNativeSendServerMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int sendStreamSyncInfo(byte[] bArr, StreamSyncInfoConfig streamSyncInfoConfig) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, SendStreamSyncInfo failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeSendStreamSyncInfo(this.mNativeEngine, bArr, streamSyncInfoConfig.streamIndex.value(), streamSyncInfoConfig.repeatCount, 0);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr, MessageConfig messageConfig) {
        long jNativeSendUserBinaryMessageOutsideRoom;
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                if (str == null) {
                    LogUtil.m82084e(TAG, "sendUserBinaryMessageOutsideRoom: uid is null send failed");
                    iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    jNativeSendUserBinaryMessageOutsideRoom = NativeRTCVideoFunctions.nativeSendUserBinaryMessageOutsideRoom(this.mNativeEngine, str, bArr, messageConfig.value());
                }
                return jNativeSendUserBinaryMessageOutsideRoom;
            }
            LogUtil.m82084e(TAG, "native engine is invalid, sendBinaryMessage failed.");
            iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            jNativeSendUserBinaryMessageOutsideRoom = iValue;
            return jNativeSendUserBinaryMessageOutsideRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public long sendUserMessageOutsideRoom(String str, String str2, MessageConfig messageConfig) {
        long jNativeSendUserMessageOutsideRoom;
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                if (str == null) {
                    LogUtil.m82084e(TAG, "sendUserMessageOutsideRoom: uid is null send failed");
                    iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    jNativeSendUserMessageOutsideRoom = NativeRTCVideoFunctions.nativeSendUserMessageOutsideRoom(this.mNativeEngine, str, str2, messageConfig.value());
                }
                return jNativeSendUserMessageOutsideRoom;
            }
            LogUtil.m82084e(TAG, "native engine is invalid, sendBinaryMessage failed.");
            iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            jNativeSendUserMessageOutsideRoom = iValue;
            return jNativeSendUserMessageOutsideRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setAnsMode(AnsMode ansMode) {
        int iNativeSetAnsMode;
        LogUtil.m82083d(TAG, "setAnsMode:" + ansMode);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setAnsMode failed.");
                iNativeSetAnsMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (ansMode == null) {
                LogUtil.m82084e(TAG, "ansMode is invalid, setAnsMode failed.");
                iNativeSetAnsMode = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetAnsMode = NativeRTCVideoFunctions.nativeSetAnsMode(this.mNativeEngine, ansMode.value());
            }
            return iNativeSetAnsMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setAudioAlignmentProperty(RemoteStreamKey remoteStreamKey, AudioAlignmentMode audioAlignmentMode) {
        int iNativeSetAudioAlignmentProperty;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setAudioAlignmentProperty failed.");
                iNativeSetAudioAlignmentProperty = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (remoteStreamKey == null) {
                LogUtil.m82084e(TAG, "setAudioAlignmentProperty: streamKey is null");
                iNativeSetAudioAlignmentProperty = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetAudioAlignmentProperty = NativeRTCVideoFunctions.nativeSetAudioAlignmentProperty(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), audioAlignmentMode.value());
            }
            return iNativeSetAudioAlignmentProperty;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setAudioContentType(StreamIndex streamIndex, AudioContentTypeConfig audioContentTypeConfig) {
        int iNativeSetAudioContentType;
        LogUtil.m82083d(TAG, "SetAudioContentType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetAudioContentType failed.");
                iNativeSetAudioContentType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioContentType = NativeRTCVideoFunctionsEx.nativeSetAudioContentType(this.mNativeEngine, streamIndex.value(), audioContentTypeConfig.hasMic, audioContentTypeConfig.hasScreenAudio, audioContentTypeConfig.hasMediaPlayer);
            }
            return iNativeSetAudioContentType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setAudioEncodeConfig(StreamIndex streamIndex, AudioEncodeConfig audioEncodeConfig) {
        int iNativeSetAudioEncodeConfig;
        LogUtil.m82083d(TAG, "SetAudioEncodeConfig");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetAudioEncodeConfig failed.");
                iNativeSetAudioEncodeConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioEncodeConfig = NativeRTCVideoFunctionsEx.nativeSetAudioEncodeConfig(this.mNativeEngine, streamIndex.value(), audioEncodeConfig.codecType, audioEncodeConfig.encMode, audioEncodeConfig.channelNum, audioEncodeConfig.encBitrate, audioEncodeConfig.useDtx, audioEncodeConfig.useInbandfec, audioEncodeConfig.sampleRate, audioEncodeConfig.packetSize);
            }
            return iNativeSetAudioEncodeConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setAudioProfile(AudioProfileType audioProfileType) {
        int iNativeSetAudioProfile;
        LogUtil.m82083d(TAG, "setAudioProfile:" + audioProfileType);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setAudioProfile failed.");
                iNativeSetAudioProfile = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (audioProfileType == null) {
                LogUtil.m82084e(TAG, "audioProfile is invalid, setAudioProfile failed.");
                iNativeSetAudioProfile = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetAudioProfile = NativeRTCVideoFunctions.nativeSetAudioProfile(this.mNativeEngine, audioProfileType.value());
            }
            return iNativeSetAudioProfile;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setAudioRenderType(AudioRenderType audioRenderType) {
        int iNativeSetAudioRenderType;
        LogUtil.m82083d(TAG, "SetAudioRenderType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetAudioRenderType failed.");
                iNativeSetAudioRenderType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioRenderType = NativeRTCVideoFunctions.nativeSetAudioRenderType(this.mNativeEngine, audioRenderType.value());
            }
            return iNativeSetAudioRenderType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setAudioRoute(AudioRoute audioRoute) {
        int iNativeSetAudioRoute;
        LogUtil.m82083d(TAG, "setAudioRoute: " + audioRoute.value());
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setAudioRoute failed.");
                iNativeSetAudioRoute = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioRoute = NativeRTCVideoFunctions.nativeSetAudioRoute(this.mNativeEngine, audioRoute.value());
            }
            return iNativeSetAudioRoute;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setAudioScenario(AudioScenarioType audioScenarioType) {
        int iNativeSetAudioScenario;
        LogUtil.m82083d(TAG, "setAudioScenario...audioScenario: " + audioScenarioType);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setAudioScenario failed.");
                iNativeSetAudioScenario = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioScenario = NativeRTCVideoFunctions.nativeSetAudioScenario(this.mNativeEngine, audioScenarioType.value());
            }
            return iNativeSetAudioScenario;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setAudioSourceType(AudioSourceType audioSourceType) {
        int iNativeSetAudioSourceType;
        LogUtil.m82083d(TAG, "SetAudioSourceType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetAudioSourceType failed.");
                iNativeSetAudioSourceType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetAudioSourceType = NativeRTCVideoFunctions.nativeSetAudioSourceType(this.mNativeEngine, audioSourceType.value());
            }
            return iNativeSetAudioSourceType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setAudioSourceVolume(StreamIndex streamIndex, int i) {
        LogUtil.m82083d(TAG, "setSourceVolume");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctionsEx.nativeSetAudioSourceVolume(this.mNativeEngine, streamIndex.value(), i);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setSourceVolume failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setBeautyIntensity(EffectBeautyMode effectBeautyMode, float f) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                return NativeRTCVideoFunctions.nativeSetBeautyIntensity(this.mNativeEngine, effectBeautyMode.value(), f);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setBeautyIntensity failed.");
            return 1000;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setBusinessId(String str) {
        int iNativeSetBusinessId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setBusinessId failed.");
                iNativeSetBusinessId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetBusinessId = NativeRTCVideoFunctions.nativeSetBusinessId(this.mNativeEngine, str);
            }
            return iNativeSetBusinessId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setCameraAdaptiveMinimumFrameRate(int i) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCameraAdaptiveMinimumFrameRate(this.mNativeEngine, i);
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setCameraExposureCompensation(float f) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCameraExposureCompensation(this.mNativeEngine, f);
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setCameraExposurePosition(float f, float f2) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCameraExposurePosition(this.mNativeEngine, f, f2);
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setCameraFocusPosition(float f, float f2) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCameraFocusPosition(this.mNativeEngine, f, f2);
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setCameraTorch(TorchState torchState) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeEnableCameraTorch(this.mNativeEngine, torchState == TorchState.TORCH_STATE_ON);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setCameraZoomRatio(float f) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCameraZoomRatio(this.mNativeEngine, f);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, PushScreenAudioFrame failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setCaptureVolume(int i) {
        LogUtil.m82083d(TAG, "setCaptureVolume");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctionsEx.nativeSetCaptureVolume(this.mNativeEngine, i);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setCaptureVolume failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig) {
        LogUtil.m82083d(TAG, "setCellularEnhancement");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCellularEnhancement(this.mNativeEngine, new InternalMediaTypeEnhancementConfig(mediaTypeEnhancementConfig));
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setCellularEnhancement failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setClientMixedStreamObserver(IClientMixedStreamObserver iClientMixedStreamObserver) {
        this.mJniReadLock.lock();
        try {
            LogUtil.m82083d(TAG, "setClientMixedStreamObserver...");
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setClientMixedStreamObserver failed.");
                return -1;
            }
            LogUtil.m82083d(TAG, "setClientMixedStreamObserver...");
            this.mMixedStreamToCDNObserver.setUserObserver(iClientMixedStreamObserver);
            return NativeRTCVideoFunctions.nativeSetClientMixedStreamObserver(this.mNativeEngine, this.mMixedStreamToCDNObserver);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler) {
        int iNativeSetCustomizeEncryptHandler;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setCustomizeEncryptHandler failed.");
                iNativeSetCustomizeEncryptHandler = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetCustomizeEncryptHandler = NativeRTCVideoFunctions.nativeSetCustomizeEncryptHandler(this.mNativeEngine, rTCEncryptHandler);
            }
            return iNativeSetCustomizeEncryptHandler;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setDefaultAudioRoute(AudioRoute audioRoute) {
        int iNativeSetDefaultAudioRoute;
        LogUtil.m82083d(TAG, "setDefaultAudioRoute: " + audioRoute.value());
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setDefaultAudioRoute failed.");
                iNativeSetDefaultAudioRoute = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetDefaultAudioRoute = NativeRTCVideoFunctions.nativeSetDefaultAudioRoute(this.mNativeEngine, audioRoute.value());
            }
            return iNativeSetDefaultAudioRoute;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setDummyCaptureImagePath(String str) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, setDummyCaptureImagePath failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeSetDummyCaptureImagePath(this.mNativeEngine, str);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setEarMonitorMode(EarMonitorMode earMonitorMode) {
        int iNativeSetEarMonitorMode;
        LogUtil.m82083d(TAG, "setEarMonitorMode");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setEarMonitorMode failed.");
                iNativeSetEarMonitorMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetEarMonitorMode = NativeRTCVideoFunctions.nativeSetEarMonitorMode(this.mNativeEngine, earMonitorMode.value());
            }
            return iNativeSetEarMonitorMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setEarMonitorVolume(int i) {
        int iNativeSetEarMonitorVolume;
        LogUtil.m82083d(TAG, "setEarMonitorVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setEarMonitorVolume failed.");
                iNativeSetEarMonitorVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetEarMonitorVolume = NativeRTCVideoFunctions.nativeSetEarMonitorVolume(this.mNativeEngine, i);
            }
            return iNativeSetEarMonitorVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setEncryptInfo(int i, String str) {
        int iNativeSetEncryptInfo;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setEncryptInfo failed.");
                iNativeSetEncryptInfo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetEncryptInfo = NativeRTCVideoFunctions.nativeSetEncryptInfo(this.mNativeEngine, i, str);
            }
            return iNativeSetEncryptInfo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler) {
        int iNativeSetExternalVideoEncoderEventHandler;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setExternalVideoEncoderEventHandler failed.");
                iNativeSetExternalVideoEncoderEventHandler = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mExternalVideoEncoderHandler = iExternalVideoEncoderEventHandler;
                long j = this.mNativeEngine;
                iNativeSetExternalVideoEncoderEventHandler = iExternalVideoEncoderEventHandler == null ? NativeRTCVideoFunctions.nativeSetExternalVideoEncoderEventHandler(j, null) : NativeRTCVideoFunctions.nativeSetExternalVideoEncoderEventHandler(j, this.mRtcExVideoEncoderHandler);
            }
            return iNativeSetExternalVideoEncoderEventHandler;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalProxy(List<LocalProxyConfiguration> list) {
        LogUtil.m82083d(TAG, "setLocalProxy");
        this.mJniReadLock.lock();
        try {
            if (this.mNativeEngine != -1 && this.mState != State.DESTORY) {
                ArrayList arrayList = new ArrayList();
                Iterator<LocalProxyConfiguration> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InternalLocalProxyConfiguration(it.next()));
                }
                return NativeRTCVideoFunctions.nativeSetLocalProxy(this.mNativeEngine, arrayList);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setLocalProxy failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalSimulcastMode(VideoSimulcastMode videoSimulcastMode, VideoEncoderConfig[] videoEncoderConfigArr) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVideoEncoderConfig failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoEncoderConfigArr == null || videoSimulcastMode == null) {
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ArrayList arrayList = new ArrayList();
                for (VideoEncoderConfig videoEncoderConfig : videoEncoderConfigArr) {
                    if (videoEncoderConfig.isValid()) {
                        arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
                    } else {
                        LogUtil.m82084e(TAG, "setVideoEncoderConfig with illegal params");
                        iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                    }
                }
                iValue = NativeRTCVideoFunctions.nativeSetLocalSimulcastModeV1(this.mNativeEngine, videoSimulcastMode.value(), arrayList);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setLocalStreamPriority(StreamIndex streamIndex, StreamPriority streamPriority) {
        LogUtil.m82083d(TAG, "setLocalStreamPriority");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctionsEx.nativeSetLocalStreamPriority(this.mNativeEngine, streamIndex.value(), streamPriority.value());
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setLocalStreamPriority failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas) {
        int iNativeSetLocalVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setLocalVideoCanvas failed.");
                iNativeSetLocalVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (videoCanvas == null) {
                    videoCanvas = new VideoCanvas();
                }
                iNativeSetLocalVideoCanvas = NativeRTCVideoFunctions.nativeSetLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderSurface, videoCanvas.renderMode, videoCanvas.backgroundColor);
            }
            return iNativeSetLocalVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalVideoMirrorType(MirrorType mirrorType) {
        int iNativeSetLocalVideoMirrorType;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setLocalVideoMirrorType failed.");
                iNativeSetLocalVideoMirrorType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVideoMirrorType = NativeRTCVideoFunctions.nativeSetLocalVideoMirrorType(this.mNativeEngine, mirrorType.value());
            }
            return iNativeSetLocalVideoMirrorType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, LocalVideoSinkConfig localVideoSinkConfig) {
        int iNativesetLocalVideoSink;
        this.mJniReadLock.lock();
        try {
            if (streamIndex == null) {
                LogUtil.m82084e(TAG, "EventType: setLocalVideoSink, streamIndex is null");
                iNativesetLocalVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setLocalVideoSink failed.");
                iNativesetLocalVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (localVideoSinkConfig.pixelFormat.value() == VideoPixelFormat.I420.value() || localVideoSinkConfig.pixelFormat.value() == VideoPixelFormat.RGBA.value() || localVideoSinkConfig.pixelFormat.value() == VideoPixelFormat.UNKNOWN.value()) {
                iNativesetLocalVideoSink = NativeRTCVideoFunctions.nativesetLocalVideoSink(this.mNativeEngine, streamIndex.value(), iVideoSink != null ? new VideoSinkAdapter(iVideoSink) : null, localVideoSinkConfig.pixelFormat.value(), localVideoSinkConfig.position.getValue());
            } else {
                iNativesetLocalVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            }
            this.mJniReadLock.unlock();
            return iNativesetLocalVideoSink;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalVoiceEqualization(VoiceEqualizationConfig voiceEqualizationConfig) {
        int iNativeSetLocalVoiceEqualization;
        LogUtil.m82083d(TAG, "setLocalVoiceEqualization...frequency : " + voiceEqualizationConfig.frequency + ", gain: " + voiceEqualizationConfig.gain);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setLocalVoiceEqualization failed.");
                iNativeSetLocalVoiceEqualization = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVoiceEqualization = NativeRTCVideoFunctions.nativeSetLocalVoiceEqualization(this.mNativeEngine, voiceEqualizationConfig.frequency.value(), voiceEqualizationConfig.gain);
            }
            return iNativeSetLocalVoiceEqualization;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalVoicePitch(int i) {
        int iNativeSetLocalVoicePitch;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setLocalVoicePitch failed.");
                iNativeSetLocalVoicePitch = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVoicePitch = NativeRTCVideoFunctions.nativeSetLocalVoicePitch(this.mNativeEngine, i);
            }
            return iNativeSetLocalVoicePitch;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalVoiceReverbParam(VoiceReverbConfig voiceReverbConfig) {
        int iNativeSetLocalVoiceReverbParam;
        LogUtil.m82083d(TAG, "setLocalVoiceReverbParam...roomSize: " + voiceReverbConfig.roomSize + ", decayTime: " + voiceReverbConfig.decayTime + ", damping:" + voiceReverbConfig.damping + ", wetGain:" + voiceReverbConfig.wetGain + ", dryGain:" + voiceReverbConfig.dryGain + ", preDelay:" + voiceReverbConfig.preDelay);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setLocalVoiceReverbParam failed.");
                iNativeSetLocalVoiceReverbParam = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVoiceReverbParam = NativeRTCVideoFunctions.nativeSetLocalVoiceReverbParam(this.mNativeEngine, voiceReverbConfig.roomSize, voiceReverbConfig.decayTime, voiceReverbConfig.damping, voiceReverbConfig.wetGain, voiceReverbConfig.dryGain, voiceReverbConfig.preDelay);
            }
            return iNativeSetLocalVoiceReverbParam;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setPlaybackVolume(int i) {
        int iNativeSetPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setPlaybackVolume failed.");
                iNativeSetPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetPlaybackVolume = NativeRTCVideoFunctions.nativeSetPlaybackVolume(this.mNativeEngine, i);
            }
            return iNativeSetPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setPublishFallbackOption(PublishFallbackOption publishFallbackOption) {
        int iNativeSetPublishFallbackOption;
        LogUtil.m82083d(TAG, "setPublishFallbackOption: option: " + publishFallbackOption);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setPublishFallbackOption failed.");
                iNativeSetPublishFallbackOption = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetPublishFallbackOption = NativeRTCVideoFunctions.nativeSetPublishFallbackOption(this.mNativeEngine, publishFallbackOption.value());
            }
            return iNativeSetPublishFallbackOption;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setRemoteAudioPlaybackVolume(RemoteStreamKey remoteStreamKey, int i) {
        int iNativeSetRemoteAudioPlaybackVolume;
        LogUtil.m82083d(TAG, "setRemoteAudioPlaybackVolume");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                if (remoteStreamKey.getRoomId() == null) {
                    LogUtil.m82084e(TAG, "setRemoteAudioPlaybackVolume: roomId is null adjust failed");
                    iNativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else if (remoteStreamKey.getUserId() == null) {
                    LogUtil.m82084e(TAG, "setRemoteAudioPlaybackVolume: uid is null adjust failed");
                    iNativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    iNativeSetRemoteAudioPlaybackVolume = NativeRTCVideoFunctions.nativeSetRemoteAudioPlaybackVolume(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), i);
                }
                return iNativeSetRemoteAudioPlaybackVolume;
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setRemoteUserPriority(@NonNull String str, @NonNull String str2, RemoteUserPriority remoteUserPriority) {
        int iNativeSetRemoteUserPriority;
        LogUtil.m82083d(TAG, "setRemoteUserPriority: uid: " + str2 + ", priority: " + remoteUserPriority);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setRemoteUserPriority failed.");
                iNativeSetRemoteUserPriority = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (str2 == null) {
                LogUtil.m82084e(TAG, "setRemoteUserPriority: uid is null set failed");
                iNativeSetRemoteUserPriority = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                iNativeSetRemoteUserPriority = NativeRTCVideoFunctions.nativeSetRemoteUserPriority(this.mNativeEngine, str, str2, remoteUserPriority.value());
            }
            return iNativeSetRemoteUserPriority;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setRemoteVideoCanvas(RemoteStreamKey remoteStreamKey, VideoCanvas videoCanvas) {
        int iNativeSetRemoteVideoCanvas;
        this.mJniReadLock.lock();
        if (remoteStreamKey != null) {
            try {
                if (remoteStreamKey.hasNullProperty()) {
                    LogUtil.m82086i(TAG, "EventType: setupRemoteVideo stream_key has null property");
                    iNativeSetRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else if (engineInvalid()) {
                    LogUtil.m82084e(TAG, "native engine is invalid, setRemoteVideoCanvas failed.");
                    iNativeSetRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
                } else {
                    if (videoCanvas == null) {
                        videoCanvas = new VideoCanvas();
                    }
                    iNativeSetRemoteVideoCanvas = NativeRTCVideoFunctions.nativeSetRemoteVideoCanvas(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoCanvas.renderView, videoCanvas.renderSurface, videoCanvas.renderMode, videoCanvas.backgroundColor, videoCanvas.renderRotation.value());
                }
            } finally {
                this.mJniReadLock.unlock();
            }
        } else {
            LogUtil.m82086i(TAG, "EventType: setupRemoteVideo stream_key has null property");
            iNativeSetRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        }
        return iNativeSetRemoteVideoCanvas;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setRemoteVideoMirrorType(RemoteStreamKey remoteStreamKey, RemoteMirrorType remoteMirrorType) {
        int iNativeSetRemoteVideoMirrorType;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setLocalVideoMirrorType failed.");
                iNativeSetRemoteVideoMirrorType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoMirrorType = NativeRTCVideoFunctions.nativeSetRemoteVideoMirrorType(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), remoteMirrorType.value());
            }
            return iNativeSetRemoteVideoMirrorType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, RemoteVideoSinkConfig remoteVideoSinkConfig) {
        int iNativesetRemoteVideoSink;
        this.mJniReadLock.lock();
        try {
            if (remoteStreamKey == null) {
                LogUtil.m82084e(TAG, "EventType: setupRemoteRenderInternal, streamKey is null");
                iNativesetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (remoteStreamKey.getStreamIndex() == null) {
                LogUtil.m82084e(TAG, "EventType: setupRemoteRenderInternal, streamIndex is null");
                iNativesetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setRemoteVideoSink failed.");
                iNativesetRemoteVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (remoteVideoSinkConfig.pixelFormat.value() == VideoPixelFormat.I420.value() || remoteVideoSinkConfig.pixelFormat.value() == VideoPixelFormat.RGBA.value() || remoteVideoSinkConfig.pixelFormat.value() == VideoPixelFormat.UNKNOWN.value()) {
                iNativesetRemoteVideoSink = NativeRTCVideoFunctions.nativesetRemoteVideoSink(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), iVideoSink != null ? new VideoSinkAdapter(iVideoSink) : null, remoteVideoSinkConfig.pixelFormat.value(), remoteVideoSinkConfig.position.getValue(), remoteVideoSinkConfig.applyRotation.getValue(), remoteVideoSinkConfig.mirrorType.getValue());
            } else {
                iNativesetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            }
            this.mJniReadLock.unlock();
            return iNativesetRemoteVideoSink;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setRemoteVideoSuperResolution(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode) {
        int iNativeSetRemoteVideoSuperResolution;
        LogUtil.m82083d(TAG, "setRemoteVideoSuperResolution: " + remoteStreamKey.toString() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + videoSuperResolutionMode.toString());
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setRemoteVideoSuperResolution failed.");
                iNativeSetRemoteVideoSuperResolution = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoSuperResolution = NativeRTCVideoFunctions.nativeSetRemoteVideoSuperResolution(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoSuperResolutionMode.value());
            }
            return iNativeSetRemoteVideoSuperResolution;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setRtcVideoEventHandler(IRTCEngineEventHandler iRTCEngineEventHandler) {
        LogUtil.m82083d(TAG, "setRtcEngineEventHandler");
        this.mRtcEngineHandler = iRTCEngineEventHandler;
        return 0;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setRtcVideoEventHandlerEx(IRTCEngineEventHandlerEx iRTCEngineEventHandlerEx) {
        LogUtil.m82083d(TAG, "setRtcEngineEventHandlerEx");
        this.mRtcEngineHandlerEx = iRTCEngineEventHandlerEx;
        return 0;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setRuntimeParameters(JSONObject jSONObject) {
        int iNativeSetRuntimeParameters;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetRuntimeParameters failed.");
                iNativeSetRuntimeParameters = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRuntimeParameters = NativeRTCVideoFunctions.nativeSetRuntimeParameters(this.mNativeEngine, jSONObject == null ? "" : jSONObject.toString());
            }
            return iNativeSetRuntimeParameters;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setScreenAudioSourceType(AudioSourceType audioSourceType) {
        int iNativeSetScreenAudioSourceType;
        LogUtil.m82083d(TAG, "SetScreenAudioSourceType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetScreenAudioSourceType failed.");
                iNativeSetScreenAudioSourceType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetScreenAudioSourceType = NativeRTCVideoFunctions.nativeSetScreenAudioSourceType(this.mNativeEngine, audioSourceType.value());
            }
            return iNativeSetScreenAudioSourceType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setScreenAudioStreamIndex(StreamIndex streamIndex) {
        int iNativeSetScreenAudioStreamIndex;
        this.mJniReadLock.lock();
        try {
            LogUtil.m82083d(TAG, "SetScreenAudioStreamIndex");
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetScreenAudioStreamIndex failed.");
                iNativeSetScreenAudioStreamIndex = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetScreenAudioStreamIndex = NativeRTCVideoFunctions.nativeSetScreenAudioStreamIndex(this.mNativeEngine, streamIndex.value());
            }
            return iNativeSetScreenAudioStreamIndex;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setScreenCaptureVolume(int i) {
        LogUtil.m82083d(TAG, "setScreenCaptureVolume");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctionsEx.nativeSetScreenCaptureVolume(this.mNativeEngine, i);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setScreenCaptureVolume failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setScreenVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        int iNativeSetScreenVideoEncoderConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setScreenVideoEncoderConfig failed.");
                iNativeSetScreenVideoEncoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (videoEncoderConfig.encodePreference == VideoEncoderConfig.EncoderPreference.AUTO) {
                    videoEncoderConfig.encodePreference = VideoEncoderConfig.EncoderPreference.DISABLED;
                }
                iNativeSetScreenVideoEncoderConfig = NativeRTCVideoFunctions.nativeSetScreenVideoEncoderConfig(this.mNativeEngine, new InternalVideoEncoderConfig(videoEncoderConfig));
            }
            return iNativeSetScreenVideoEncoderConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setServerParams(String str, String str2) {
        int iNativeSetServerParams;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeSetServerParams = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetServerParams = NativeRTCVideoFunctions.nativeSetServerParams(this.mNativeEngine, str, str2);
            }
            return iNativeSetServerParams;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions) {
        int iNativeSetRemoteSubscribeFallbackOption;
        LogUtil.m82083d(TAG, "setRemoteSubscribeFallbackOption: option: " + subscribeFallbackOptions);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setRemoteSubscribeFallbackOption failed.");
                iNativeSetRemoteSubscribeFallbackOption = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteSubscribeFallbackOption = NativeRTCVideoFunctions.nativeSetRemoteSubscribeFallbackOption(this.mNativeEngine, subscribeFallbackOptions.value());
            }
            return iNativeSetRemoteSubscribeFallbackOption;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock] */
    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoCaptureConfig(VideoCaptureConfig videoCaptureConfig) {
        int iNativeSetVideoCaptureConfig;
        this.mJniReadLock.lock();
        try {
            if (videoCaptureConfig == null) {
                LogUtil.m82084e(TAG, "native engine is invalid or videoCaptureConfig is null, setVideoCaptureConfig failed.");
                iNativeSetVideoCaptureConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid or videoCaptureConfig is null, setVideoCaptureConfig failed.");
                iNativeSetVideoCaptureConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.m82083d(TAG, "setVideoCaptureConfig: " + videoCaptureConfig.toString());
                iNativeSetVideoCaptureConfig = NativeRTCVideoFunctions.nativeSetVideoCaptureConfig(this.mNativeEngine, new InternalVideoCaptureConfig(videoCaptureConfig.capturePreference.getValue(), videoCaptureConfig.width, videoCaptureConfig.height, videoCaptureConfig.frameRate));
            }
            this = this.mJniReadLock;
            this.unlock();
            return iNativeSetVideoCaptureConfig;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoCaptureRotation(VideoRotation videoRotation) {
        int iNativeSetVideoCaptureRotation;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVideoCaptureRotation failed.");
                iNativeSetVideoCaptureRotation = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoCaptureRotation = NativeRTCVideoFunctions.nativeSetVideoCaptureRotation(this.mNativeEngine, videoRotation.value());
            }
            return iNativeSetVideoCaptureRotation;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoDecoderConfig(RemoteStreamKey remoteStreamKey, VideoDecoderConfig videoDecoderConfig) {
        int iNativeSetVideoDecoderConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, SetVideoDecoderConfig failed.");
                iNativeSetVideoDecoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoDecoderConfig = NativeRTCVideoFunctions.nativeSetVideoDecoderConfig(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoDecoderConfig.value());
            }
            return iNativeSetVideoDecoderConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoDenoiser(VideoDenoiseMode videoDenoiseMode) {
        int iNativeSetVideoDenoiser;
        LogUtil.m82083d(TAG, "setVideoDenoiser: " + videoDenoiseMode.toString());
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVideoDenoiser failed.");
                iNativeSetVideoDenoiser = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoDenoiser = NativeRTCVideoFunctions.nativeSetVideoDenoiser(this.mNativeEngine, videoDenoiseMode.value());
            }
            return iNativeSetVideoDenoiser;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoDigitalZoomConfig(ZoomConfigType zoomConfigType, float f) {
        int iNativeSetVideoDigitalZoomConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVideoDigitalZoomConfig failed.");
                iNativeSetVideoDigitalZoomConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoDigitalZoomConfig = NativeRTCVideoFunctions.nativeSetVideoDigitalZoomConfig(this.mNativeEngine, zoomConfigType.value(), f);
            }
            return iNativeSetVideoDigitalZoomConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType) {
        int iNativeSetVideoDigitalZoomControl;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVideoDigitalZoomControl failed.");
                iNativeSetVideoDigitalZoomControl = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoDigitalZoomControl = NativeRTCVideoFunctions.nativeSetVideoDigitalZoomControl(this.mNativeEngine, zoomDirectionType.value());
            }
            return iNativeSetVideoDigitalZoomControl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setVideoEncoderConfig(StreamIndex streamIndex, List<VideoEncoderConfig> list) {
        int iNativeSetVideoEncoderConfig;
        this.mJniReadLock.lock();
        if (list == null) {
            try {
                list = new ArrayList<>();
            } finally {
                this.mJniReadLock.unlock();
            }
        }
        if (engineInvalid()) {
            LogUtil.m82084e(TAG, "native engine is invalid, setVideoResolutions failed.");
            iNativeSetVideoEncoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        } else {
            ArrayList arrayList = new ArrayList();
            for (VideoEncoderConfig videoEncoderConfig : list) {
                if (streamIndex != StreamIndex.STREAM_INDEX_MAIN || videoEncoderConfig.isValid()) {
                    arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
                } else {
                    LogUtil.m82084e(TAG, "setVideoResolutions with illegal params");
                    iNativeSetVideoEncoderConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                }
            }
            iNativeSetVideoEncoderConfig = NativeRTCVideoFunctionsEx.nativeSetVideoEncoderConfig(this.mNativeEngine, streamIndex.value(), arrayList);
        }
        return iNativeSetVideoEncoderConfig;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoOrientation(VideoOrientation videoOrientation) {
        int iNativeSetVideoOrientation;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVideoOrientation failed.");
                iNativeSetVideoOrientation = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoOrientation = NativeRTCVideoFunctions.nativeSetVideoOrientation(this.mNativeEngine, videoOrientation.value());
            }
            return iNativeSetVideoOrientation;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoRotationMode(VideoRotationMode videoRotationMode) {
        int iNativeSetVideoRotationMode;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVideoRotationMode failed.");
                iNativeSetVideoRotationMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoRotationMode = NativeRTCVideoFunctions.nativeSetVideoRotationMode(this.mNativeEngine, videoRotationMode.value());
            }
            return iNativeSetVideoRotationMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setVideoSource(StreamIndex streamIndex, InternalVideoSourceConfig internalVideoSourceConfig) {
        LogUtil.m82083d(TAG, "setVideoSource");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctionsEx.nativeSetVideoSource(this.mNativeEngine, streamIndex.value(), internalVideoSourceConfig.getVideoSourceType(), internalVideoSourceConfig.getVideoSourceCategory());
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setVideoSource failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType) {
        int iNativeSetVideoSourceTypeWithStreamId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVideoInputType failed.");
                iNativeSetVideoSourceTypeWithStreamId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVideoSourceTypeWithStreamId = NativeRTCVideoFunctions.nativeSetVideoSourceTypeWithStreamId(this.mNativeEngine, streamIndex.value(), videoSourceType.value());
            }
            return iNativeSetVideoSourceTypeWithStreamId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoWatermark(StreamIndex streamIndex, String str, RTCWatermarkConfig rTCWatermarkConfig) {
        int iValue;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, muteAudioPlayback failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                ByteWatermark byteWatermark = rTCWatermarkConfig.positionInLandscapeMode;
                if (byteWatermark != null) {
                    float f9 = byteWatermark.f56489x;
                    float f10 = byteWatermark.f56490y;
                    float f11 = byteWatermark.width;
                    f4 = byteWatermark.height;
                    f = f9;
                    f2 = f10;
                    f3 = f11;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                }
                ByteWatermark byteWatermark2 = rTCWatermarkConfig.positionInPortraitMode;
                if (byteWatermark2 != null) {
                    float f12 = byteWatermark2.f56489x;
                    float f13 = byteWatermark2.f56490y;
                    float f14 = byteWatermark2.width;
                    f8 = byteWatermark2.height;
                    f5 = f12;
                    f6 = f13;
                    f7 = f14;
                } else {
                    f5 = 0.0f;
                    f6 = 0.0f;
                    f7 = 0.0f;
                    f8 = 0.0f;
                }
                iValue = NativeRTCVideoFunctions.nativeSetVideoWatermark(this.mNativeEngine, streamIndex.value(), str, rTCWatermarkConfig.visibleInPreview, f, f2, f3, f4, f5, f6, f7, f8);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVoiceChangerType(VoiceChangerType voiceChangerType) {
        int iNativeSetVoiceChangerType;
        LogUtil.m82083d(TAG, "setVoiceChangerType...voiceChanger: " + voiceChangerType);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVoiceChangerType failed.");
                iNativeSetVoiceChangerType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVoiceChangerType = NativeRTCVideoFunctions.nativeSetVoiceChangerType(this.mNativeEngine, voiceChangerType.value());
            }
            return iNativeSetVoiceChangerType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVoiceReverbType(VoiceReverbType voiceReverbType) {
        int iNativeSetVoiceReverbType;
        LogUtil.m82083d(TAG, "setVoiceReverbType...voiceReverb: " + voiceReverbType);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVoiceReverbType failed.");
                iNativeSetVoiceReverbType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetVoiceReverbType = NativeRTCVideoFunctions.nativeSetVoiceReverbType(this.mNativeEngine, voiceReverbType.value());
            }
            return iNativeSetVoiceReverbType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startAudioCapture() {
        int iNativeStartAudioCapture;
        LogUtil.m82083d(TAG, "startAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startAudioCapture failed.");
                iNativeStartAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartAudioCapture = NativeRTCVideoFunctions.nativeStartAudioCapture(this.mNativeEngine);
            }
            return iNativeStartAudioCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startAudioRecording(AudioRecordingConfig audioRecordingConfig) {
        int iNativeStartAudioRecording;
        LogUtil.m82083d(TAG, "startAudioRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startFileRecording failed.");
                iNativeStartAudioRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartAudioRecording = NativeRTCVideoFunctions.nativeStartAudioRecording(this.mNativeEngine, audioRecordingConfig.absoluteFileName, audioRecordingConfig.sampleRate.value(), audioRecordingConfig.channel.value(), audioRecordingConfig.frameSource.value(), audioRecordingConfig.quality.value());
            }
            return iNativeStartAudioRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        int iNativeStartChorusCacheSync;
        this.mJniReadLock.lock();
        if (iChorusCacheSyncObserver != null) {
            try {
                this.mChorusObserver.setUserObserver(iChorusCacheSyncObserver);
            } finally {
                this.mJniReadLock.unlock();
            }
        }
        LogUtil.m82083d(TAG, "startChorusCacheSync...");
        if (chorusCacheSyncConfig == null) {
            LogUtil.m82083d(TAG, "startChorusCacheSync...chorusConfig is null, no effect, please check.");
            iNativeStartChorusCacheSync = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        } else if (engineInvalid()) {
            LogUtil.m82084e(TAG, "native engine is invalid, startChorusCacheSync failed.");
            iNativeStartChorusCacheSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        } else {
            iNativeStartChorusCacheSync = NativeRTCVideoFunctions.nativeStartChorusCacheSync(this.mNativeEngine, chorusCacheSyncConfig, this.mChorusObserver);
        }
        return iNativeStartChorusCacheSync;
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startClientMixedStream(String str, MixedStreamConfig mixedStreamConfig, ClientMixedStreamConfig clientMixedStreamConfig) {
        this.mJniReadLock.lock();
        try {
            LogUtil.m82083d(TAG, "startClientMixedStream...");
            if (mixedStreamConfig == null || clientMixedStreamConfig == null) {
                LogUtil.m82083d(TAG, "startClientMixedStream...liveTranscode is null, no effect, please check.");
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startClientMixedStream failed.");
            } else {
                this.mEnableTranscode = true;
                if (mixedStreamConfig.getTranscodeMessage() != null) {
                    LogUtil.m82083d(TAG, "startClientMixedStream...");
                    return NativeRTCVideoFunctions.nativeStartClientMixedStream(this.mNativeEngine, str, mixedStreamConfig, clientMixedStreamConfig);
                }
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startCloudProxy(List<CloudProxyInfo> list) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, startCloudProxy failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<CloudProxyInfo> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InternalCloudProxyInfo(it.next()));
                }
                iValue = NativeRTCVideoFunctions.nativeStartCloudProxy(this.mNativeEngine, arrayList);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startEchoTest(EchoTestConfig echoTestConfig, int i) {
        int iNativeStartEchoTest;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startEchoTest failed.");
                iNativeStartEchoTest = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.m82083d(TAG, "startEchoTest");
                iNativeStartEchoTest = NativeRTCVideoFunctions.nativeStartEchoTest(this.mNativeEngine, echoTestConfig, i);
            }
            return iNativeStartEchoTest;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig, RecordingType recordingType) {
        int iNativeStartFileRecording;
        LogUtil.m82083d(TAG, "startFileRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startFileRecording failed.");
                iNativeStartFileRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartFileRecording = NativeRTCVideoFunctions.nativeStartFileRecording(this.mNativeEngine, streamIndex.value(), recordingConfig.dirPath, recordingConfig.recordingFileType.value(), recordingType.value());
            }
            return iNativeStartFileRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startHardwareEchoDetection(String str) {
        LogUtil.m82083d(TAG, "startHardwareEchoDetection");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeStartHardwareEchoDetection(this.mNativeEngine, str);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, startHardwareEchoDetection failed.");
            return -2;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startNetworkDetection(boolean z, int i, boolean z2, int i2) {
        int iNativeStartNetworkProbe;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendCustomMessage failed.");
                iNativeStartNetworkProbe = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartNetworkProbe = NativeRTCVideoFunctions.nativeStartNetworkProbe(this.mNativeEngine, z, i, z2, i2);
            }
            return iNativeStartNetworkProbe;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startPushMixedStream(String str, MixedStreamPushTargetConfig mixedStreamPushTargetConfig, MixedStreamConfig mixedStreamConfig) {
        this.mJniReadLock.lock();
        try {
            LogUtil.m82083d(TAG, "startPushMixedStream...");
            if (mixedStreamConfig == null) {
                LogUtil.m82083d(TAG, "startPushMixedStream...liveTranscode is null, no effect, please check.");
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startPushMixedStream failed.");
            } else {
                this.mEnableTranscode = true;
                if (mixedStreamConfig.getTranscodeMessage() != null) {
                    LogUtil.m82083d(TAG, "startPushMixedStream...");
                    return NativeRTCVideoFunctions.nativeStartPushMixedStream(this.mNativeEngine, str, mixedStreamPushTargetConfig, mixedStreamConfig);
                }
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startPushSingleStream(String str, PushSingleStreamParam pushSingleStreamParam) {
        int iNativeStartPushSingleStream;
        this.mJniReadLock.lock();
        try {
            LogUtil.m82083d(TAG, "startPushSingleStream...");
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startPushSingleStream failed.");
                iNativeStartPushSingleStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LinkedList linkedList = new LinkedList();
                List<DestInfo> list = pushSingleStreamParam.destInfos;
                if (list != null) {
                    Iterator<DestInfo> it = list.iterator();
                    while (it.hasNext()) {
                        linkedList.add(new InternalDestInfo(it.next()));
                    }
                }
                iNativeStartPushSingleStream = NativeRTCVideoFunctions.nativeStartPushSingleStream(this.mNativeEngine, str, pushSingleStreamParam.roomId, pushSingleStreamParam.userId, pushSingleStreamParam.url, pushSingleStreamParam.isScreen, linkedList, pushSingleStreamParam.pushType.value());
            }
            return iNativeStartPushSingleStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startScreenCapture(ScreenMediaType screenMediaType, Intent intent) {
        int iNativeStartScreenCapture;
        LogUtil.m82083d(TAG, "StartScreenAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, StopScreenAudioCapture failed.");
                iNativeStartScreenCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartScreenCapture = NativeRTCVideoFunctions.nativeStartScreenCapture(this.mNativeEngine, screenMediaType.value(), intent);
            }
            return iNativeStartScreenCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int startVideoCapture(StreamIndex streamIndex, String str) {
        LogUtil.m82083d(TAG, "startVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctionsEx.nativeStartVideoCapture(this.mNativeEngine, streamIndex.value(), str);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, startVideoCapture failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType) {
        int iNativeStartVideoDigitalZoomControl;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startVideoDigitalZoomControl failed.");
                iNativeStartVideoDigitalZoomControl = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartVideoDigitalZoomControl = NativeRTCVideoFunctions.nativeStartVideoDigitalZoomControl(this.mNativeEngine, zoomDirectionType.value());
            }
            return iNativeStartVideoDigitalZoomControl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopAudioCapture() {
        int iNativeStopAudioCapture;
        LogUtil.m82083d(TAG, "stopAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopAudioCapture failed.");
                iNativeStopAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopAudioCapture = NativeRTCVideoFunctions.nativeStopAudioCapture(this.mNativeEngine);
            }
            return iNativeStopAudioCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopAudioRecording() {
        int iNativeStopAudioRecording;
        LogUtil.m82083d(TAG, "startAudioRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startFileRecording failed.");
                iNativeStopAudioRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopAudioRecording = NativeRTCVideoFunctions.nativeStopAudioRecording(this.mNativeEngine);
            }
            return iNativeStopAudioRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopChorusCacheSync() {
        int iNativeStopChorusCacheSync;
        LogUtil.m82083d(TAG, "stopChorusCacheSync...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopChorusCacheSync failed.");
                iNativeStopChorusCacheSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopChorusCacheSync = NativeRTCVideoFunctions.nativeStopChorusCacheSync(this.mNativeEngine);
            }
            return iNativeStopChorusCacheSync;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopClientMixedStream(String str) {
        int iNativeStopClientMixedStream;
        LogUtil.m82083d(TAG, "stopClientMixedStream...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopClientMixedStream failed.");
                iNativeStopClientMixedStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopClientMixedStream = NativeRTCVideoFunctions.nativeStopClientMixedStream(this.mNativeEngine, str);
            }
            return iNativeStopClientMixedStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopCloudProxy() {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopCloudProxy failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iValue = NativeRTCVideoFunctions.nativeStopCloudProxy(this.mNativeEngine);
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopEchoTest() {
        int iNativeStopEchoTest;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopEchoTest failed.");
                iNativeStopEchoTest = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.m82083d(TAG, "stopEchoTest");
                iNativeStopEchoTest = NativeRTCVideoFunctions.nativeStopEchoTest(this.mNativeEngine);
            }
            return iNativeStopEchoTest;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopFileRecording(StreamIndex streamIndex) {
        int iNativeStopFileRecording;
        LogUtil.m82083d(TAG, "stopFileRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopFileRecording failed.");
                iNativeStopFileRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopFileRecording = NativeRTCVideoFunctions.nativeStopFileRecording(this.mNativeEngine, streamIndex.value());
            }
            return iNativeStopFileRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopHardwareEchoDetection() {
        LogUtil.m82083d(TAG, "stopHardwareEchoDetection");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctions.nativeStopHardwareEchoDetection(this.mNativeEngine);
            }
            LogUtil.m82084e(TAG, "native engine is invalid, stopHardwareEchoDetection failed.");
            return -2;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopNetworkDetection() {
        int iNativeStopNetworkProbe;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendCustomMessage failed.");
                iNativeStopNetworkProbe = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopNetworkProbe = NativeRTCVideoFunctions.nativeStopNetworkProbe(this.mNativeEngine);
            }
            return iNativeStopNetworkProbe;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopPushMixedStream(String str, MixedStreamPushTargetType mixedStreamPushTargetType) {
        int iNativeStopPushMixedStream;
        LogUtil.m82083d(TAG, "stopPushMixedStream...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopPushMixedStream failed.");
                iNativeStopPushMixedStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopPushMixedStream = NativeRTCVideoFunctions.nativeStopPushMixedStream(this.mNativeEngine, str, mixedStreamPushTargetType.value());
            }
            return iNativeStopPushMixedStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopPushSingleStream(String str) {
        int iNativeStopPushSingleStream;
        LogUtil.m82083d(TAG, "stopPushSingleStream...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopPushSingleStream failed.");
                iNativeStopPushSingleStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopPushSingleStream = NativeRTCVideoFunctions.nativeStopPushSingleStream(this.mNativeEngine, str);
            }
            return iNativeStopPushSingleStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopScreenCapture() {
        int iNativeStopScreenCapture;
        LogUtil.m82083d(TAG, "StopScreenCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, StopScreenAudioCapture failed.");
                iNativeStopScreenCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopScreenCapture = NativeRTCVideoFunctions.nativeStopScreenCapture(this.mNativeEngine);
            }
            return iNativeStopScreenCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int stopVideoCapture(StreamIndex streamIndex) {
        LogUtil.m82083d(TAG, "stopVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctionsEx.nativeStopVideoCapture(this.mNativeEngine, streamIndex.value());
            }
            LogUtil.m82084e(TAG, "native engine is invalid, stopVideoCapture failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopVideoDigitalZoomControl() {
        int iNativeStopVideoDigitalZoomControl;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopVideoDigitalZoomControl failed.");
                iNativeStopVideoDigitalZoomControl = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopVideoDigitalZoomControl = NativeRTCVideoFunctions.nativeStopVideoDigitalZoomControl(this.mNativeEngine);
            }
            return iNativeStopVideoDigitalZoomControl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int switchCamera(CameraId cameraId) {
        int iNativeSwitchCamera;
        LogUtil.m82083d(TAG, BLiveButtonType.switchCamera);
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, switchCamera failed.");
                iNativeSwitchCamera = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSwitchCamera = NativeRTCVideoFunctions.nativeSwitchCamera(this.mNativeEngine, cameraId.value());
                this.mIsFront = !this.mIsFront;
            }
            return iNativeSwitchCamera;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public long takeLocalSnapshot(StreamIndex streamIndex, ISnapshotResultCallback iSnapshotResultCallback) {
        long jNativeTakeLocalSnapshot;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, takeLocalSnapshot failed.");
                jNativeTakeLocalSnapshot = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                jNativeTakeLocalSnapshot = NativeRTCVideoFunctions.nativeTakeLocalSnapshot(this.mNativeEngine, streamIndex.value(), iSnapshotResultCallback);
            }
            return jNativeTakeLocalSnapshot;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public long takeRemoteSnapshot(RemoteStreamKey remoteStreamKey, ISnapshotResultCallback iSnapshotResultCallback) {
        long jNativeTakeRemoteSnapshot;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                if (remoteStreamKey == null) {
                    LogUtil.m82084e(TAG, "EventType: setupRemoteRenderInternal, streamKey is null");
                } else if (remoteStreamKey.getStreamIndex() == null) {
                    LogUtil.m82084e(TAG, "EventType: setupRemoteRenderInternal, streamIndex is null");
                } else {
                    jNativeTakeRemoteSnapshot = NativeRTCVideoFunctions.nativeTakeRemoteSnapshot(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), iSnapshotResultCallback);
                }
                return -1L;
            }
            LogUtil.m82084e(TAG, "native engine is invalid, takeRemoteSnapshot failed.");
            jNativeTakeRemoteSnapshot = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            return jNativeTakeRemoteSnapshot;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public long takeSnapshotToFile(RemoteStreamKey remoteStreamKey, String str) {
        long jNativeTakeSnapshotToFile;
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid()) {
                if (remoteStreamKey == null) {
                    LogUtil.m82084e(TAG, "EventType: setupRemoteRenderInternal, streamKey is null");
                } else if (remoteStreamKey.getStreamIndex() == null) {
                    LogUtil.m82084e(TAG, "EventType: setupRemoteRenderInternal, streamIndex is null");
                } else {
                    jNativeTakeSnapshotToFile = NativeRTCVideoFunctions.nativeTakeSnapshotToFile(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), str);
                }
                return -1L;
            }
            LogUtil.m82084e(TAG, "native engine is invalid, takeRemoteSnapshot failed.");
            jNativeTakeSnapshotToFile = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            return jNativeTakeSnapshotToFile;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int updateClientMixedStream(String str, MixedStreamConfig mixedStreamConfig, ClientMixedStreamConfig clientMixedStreamConfig) {
        this.mJniReadLock.lock();
        try {
            LogUtil.m82083d(TAG, "updateClientMixedStream...");
            if (mixedStreamConfig == null || clientMixedStreamConfig == null) {
                LogUtil.m82083d(TAG, "updateClientMixedStream...mLiveTranscoding is null, no effect, please check.");
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, updateClientMixedStream failed.");
            } else if (mixedStreamConfig.getTranscodeMessage() != null) {
                LogUtil.m82083d(TAG, "updateClientMixedStream...");
                return NativeRTCVideoFunctions.nativeUpdateClientMixedStream(this.mNativeEngine, str, mixedStreamConfig, clientMixedStreamConfig);
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int updateLocalVideoCanvas(StreamIndex streamIndex, int i, int i2) {
        int iNativeUpdateLocalVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, updateLocalVideoCanvas failed.");
                iNativeUpdateLocalVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateLocalVideoCanvas = NativeRTCVideoFunctions.nativeUpdateLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), i, i2);
            }
            return iNativeUpdateLocalVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int updateLoginToken(String str) {
        int iNativeUpdateLoginToken;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, sendBinaryMessage failed.");
                iNativeUpdateLoginToken = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateLoginToken = NativeRTCVideoFunctions.nativeUpdateLoginToken(this.mNativeEngine, str);
            }
            return iNativeUpdateLoginToken;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int updatePushMixedStream(String str, MixedStreamPushTargetConfig mixedStreamPushTargetConfig, MixedStreamConfig mixedStreamConfig) {
        this.mJniReadLock.lock();
        try {
            LogUtil.m82083d(TAG, "updatePushMixedStream...");
            if (mixedStreamConfig == null) {
                LogUtil.m82083d(TAG, "updatePushMixedStream...mLiveTranscoding is null, no effect, please check.");
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, updatePushMixedStream failed.");
            } else if (mixedStreamConfig.getTranscodeMessage() != null) {
                LogUtil.m82083d(TAG, "updatePushMixedStream...");
                return NativeRTCVideoFunctions.nativeUpdatePushMixedStream(this.mNativeEngine, str, mixedStreamPushTargetConfig, mixedStreamConfig);
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock] */
    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, RemoteVideoRenderConfig remoteVideoRenderConfig) {
        int iNativeUpdateRemoteVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (remoteStreamKey == null) {
                LogUtil.m82084e(TAG, "EventType: updateRemoteStreamVideoCanvas, streamKey is null");
                iNativeUpdateRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (remoteStreamKey.hasNullProperty()) {
                LogUtil.m82084e(TAG, "EventType: updateRemoteStreamVideoCanvas, hasNullProperty");
                iNativeUpdateRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, updateRemoteStreamVideoCanvas failed.");
                iNativeUpdateRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateRemoteVideoCanvas = NativeRTCVideoFunctions.nativeUpdateRemoteVideoCanvas(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), remoteVideoRenderConfig.renderMode, remoteVideoRenderConfig.backgroundColor, remoteVideoRenderConfig.renderRotation.value());
            }
            this = this.mJniReadLock;
            this.unlock();
            return iNativeUpdateRemoteVideoCanvas;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int updateScreenCapture(ScreenMediaType screenMediaType) {
        int iNativeUpdateScreenCapture;
        LogUtil.m82083d(TAG, "UpdateScreenCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, StopScreenAudioCapture failed.");
                iNativeUpdateScreenCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeUpdateScreenCapture = NativeRTCVideoFunctions.nativeUpdateScreenCapture(this.mNativeEngine, screenMediaType.value());
            }
            return iNativeUpdateScreenCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setEarMonitorMode(EarMonitorMode earMonitorMode, int i) {
        int iNativeSetEarMonitorMode2;
        LogUtil.m82083d(TAG, "setEarMonitorMode");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setEarMonitorMode failed.");
                iNativeSetEarMonitorMode2 = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetEarMonitorMode2 = NativeRTCVideoFunctions.nativeSetEarMonitorMode2(this.mNativeEngine, earMonitorMode.value(), i);
            }
            return iNativeSetEarMonitorMode2;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setCaptureVolume(StreamIndex streamIndex, int i) {
        int iNativeSetCaptureVolume;
        LogUtil.m82083d(TAG, "setCaptureVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setCaptureVolume failed.");
                iNativeSetCaptureVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetCaptureVolume = NativeRTCVideoFunctions.nativeSetCaptureVolume(this.mNativeEngine, i, streamIndex.value());
            }
            return iNativeSetCaptureVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int startVideoCapture() {
        int iNativeStartVideoCapture;
        LogUtil.m82083d(TAG, "startVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, startVideoCapture failed.");
                iNativeStartVideoCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStartVideoCapture = NativeRTCVideoFunctions.nativeStartVideoCapture(this.mNativeEngine);
            }
            return iNativeStartVideoCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int stopVideoCapture() {
        int iNativeStopVideoCapture;
        LogUtil.m82083d(TAG, "stopVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, stopVideoCapture failed.");
                iNativeStopVideoCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeStopVideoCapture = NativeRTCVideoFunctions.nativeStopVideoCapture(this.mNativeEngine);
            }
            return iNativeStopVideoCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public static synchronized boolean initializeNativeLibs() {
        return initializeNativeLibs(null);
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int pushExternalVideoFrame(VideoFrameData videoFrameData) {
        int iValue;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == State.DESTORY) {
                LogUtil.m82084e(TAG, "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                iValue = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrameData == null) {
                LogUtil.m82086i(TAG, "pushExternalVideoFrame: videoFrame is null, drop frame.");
                iValue = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ReturnStatus returnStatus = ReturnStatus.RETURN_STATUS_SUCCESS;
                iValue = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushExternalVideoFrame(this.mNativeEngine, videoFrameData)).value();
            }
            return iValue;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngineEx
    public int setVideoCaptureConfig(StreamIndex streamIndex, VideoCaptureConfig videoCaptureConfig) {
        LogUtil.m82083d(TAG, "setVideoCaptureConfig");
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != State.DESTORY) {
                return NativeRTCVideoFunctionsEx.nativeSetVideoCaptureConfig(this.mNativeEngine, streamIndex.value(), new InternalVideoCaptureConfig(videoCaptureConfig.capturePreference.getValue(), videoCaptureConfig.width, videoCaptureConfig.height, videoCaptureConfig.frameRate));
            }
            LogUtil.m82084e(TAG, "native engine is invalid, setVideoCaptureConfig failed.");
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalSimulcastMode(VideoSimulcastMode videoSimulcastMode) {
        int iNativeSetLocalSimulcastMode;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setLocalSimulcastMode failed.");
                iNativeSetLocalSimulcastMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalSimulcastMode = NativeRTCVideoFunctions.nativeSetLocalSimulcastMode(this.mNativeEngine, videoSimulcastMode.value());
            }
            return iNativeSetLocalSimulcastMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, int i, int i2) {
        RemoteVideoRenderConfig remoteVideoRenderConfig = new RemoteVideoRenderConfig();
        remoteVideoRenderConfig.renderMode = i;
        remoteVideoRenderConfig.backgroundColor = i2;
        return updateRemoteStreamVideoCanvas(remoteStreamKey, remoteVideoRenderConfig);
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig, JSONObject jSONObject) {
        int iNativeSetVideoEncoderConfigV1;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setVideoResolutions failed.");
                iNativeSetVideoEncoderConfigV1 = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                String string = "";
                if (jSONObject != null) {
                    string = jSONObject.toString();
                }
                iNativeSetVideoEncoderConfigV1 = NativeRTCVideoFunctions.nativeSetVideoEncoderConfigV1(this.mNativeEngine, new InternalVideoEncoderConfig(videoEncoderConfig), string);
            }
            return iNativeSetVideoEncoderConfigV1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        return setVideoEncoderConfig(videoEncoderConfig, (JSONObject) null);
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i) {
        int iNativeSetLocalVideoSink;
        this.mJniReadLock.lock();
        try {
            if (streamIndex == null) {
                LogUtil.m82084e(TAG, "EventType: setLocalVideoSink, streamIndex is null");
                iNativeSetLocalVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setLocalVideoSink failed.");
                iNativeSetLocalVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetLocalVideoSink = NativeRTCVideoFunctions.nativeSetLocalVideoSink(this.mNativeEngine, streamIndex.value(), iVideoSink != null ? new VideoSinkAdapter(iVideoSink) : null, i);
            }
            this.mJniReadLock.unlock();
            return iNativeSetLocalVideoSink;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.engine.RTCEngine
    public int setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, int i) {
        int iNativeSetRemoteVideoSink;
        this.mJniReadLock.lock();
        try {
            if (remoteStreamKey == null) {
                LogUtil.m82084e(TAG, "EventType: setupRemoteRenderInternal, streamKey is null");
                iNativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (remoteStreamKey.getStreamIndex() == null) {
                LogUtil.m82084e(TAG, "EventType: setupRemoteRenderInternal, streamIndex is null");
                iNativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.m82084e(TAG, "native engine is invalid, setRemoteVideoSink failed.");
                iNativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                iNativeSetRemoteVideoSink = NativeRTCVideoFunctions.nativeSetRemoteVideoSink(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), iVideoSink != null ? new VideoSinkAdapter(iVideoSink) : null, i);
            }
            this.mJniReadLock.unlock();
            return iNativeSetRemoteVideoSink;
        } catch (Throwable th) {
            this.mJniReadLock.unlock();
            throw th;
        }
    }
}
