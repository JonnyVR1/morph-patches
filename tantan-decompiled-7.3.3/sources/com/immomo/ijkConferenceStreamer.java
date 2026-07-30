package com.immomo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.SegmentHelper;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.mediacore.audio.pcmDataAvailableCallback;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcClientRoleChangedHandler;
import com.immomo.mediacore.coninf.MRtcConnectHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.coninf.MRtcExitRoomHandler;
import com.immomo.mediacore.coninf.MRtcQualityHandler;
import com.immomo.mediacore.coninf.MRtcReceiveSeiHandler;
import com.immomo.mediacore.coninf.MRtcSurroundMusicHander;
import com.immomo.mediacore.sink.SinkBase;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import com.momo.pub.MomoPipelineModuleRegister;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import io.agora.rtc2.RtcEngine;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.util.StringUtil;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.arx;
import p153l.b7y;
import p153l.brx;
import p153l.bsx;
import p153l.c4m;
import p153l.cql;
import p153l.csx;
import p153l.d410;
import p153l.drl;
import p153l.ebl0;
import p153l.erf0;
import p153l.fb1;
import p153l.fpf0;
import p153l.gb1;
import p153l.gbl0;
import p153l.gkl0;
import p153l.hwl;
import p153l.j410;
import p153l.jt2;
import p153l.kod0;
import p153l.l26;
import p153l.l6m;
import p153l.lg60;
import p153l.lvl;
import p153l.n5m;
import p153l.o410;
import p153l.oq70;
import p153l.oxd0;
import p153l.pvl;
import p153l.qv40;
import p153l.ror;
import p153l.row;
import p153l.suf;
import p153l.t9c;
import p153l.upw;
import p153l.usl;
import p153l.vpw;
import p153l.wej;
import p153l.wpw;
import p153l.ypw;
import p153l.zpw;
import p153l.zzl;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;
import tv.danmaku.ijk.media.streamer.IjkStreamerLogHelper;
import tv.danmaku.ijk.media.streamer.MediaReportLogManager;
import tv.danmaku.ijk.media.streamer.NetUtil;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;

/* JADX INFO: loaded from: classes7.dex */
public class ijkConferenceStreamer extends ijkMediaStreamer {
    public static final int AUDIO_EFFECT_TYPE_ELC_TUNE = 9;
    public static final int AUDIO_EFFECT_TYPE_FEMALE = 6;
    public static final int AUDIO_EFFECT_TYPE_MALE = 5;
    public static final int AUDIO_EFFECT_TYPE_MC = 8;
    public static final int AUDIO_EFFECT_TYPE_ORIGINAL = 0;
    public static final int AUDIO_EFFECT_TYPE_WAWA = 7;
    public static final int DEFAULT_RECORD_INTERVAL = 1000;
    public static final int DEFAULT_REPORT_COUNT = 30;
    private final int FEMALE_PITCH;
    private final int MALE_PITCH;
    private final int WAWA_PITCH;
    private cql cameraInputPipline;
    private usl emptyInputPipline;
    private boolean enableAudioStrero;
    private boolean enableVbr;
    private int faceBeautiful;
    private lvl ijkInputPipline;
    private Boolean isActiveSwitch;
    private hwl linkMicPusherPipeline;
    private int mActiveAudioTrack;
    private int mAdjustBrightnessInterval;
    private boolean mAllRemoteAudioStream;
    private upw mAnchorStatusHanderhandler;
    private String mAppID;
    private int mAudioChannalNum;
    private boolean mAudioHighQualityFlg;
    private int mAudioInterval;
    private int mAudioProfile;
    private boolean mAudioProfileStatus;
    private int mAudioRoteoverrideDefault;
    private int mAudioSampleRate;
    private int mAudioScenario;
    private int mAudio_channe;
    private int mAudio_channe_frq;
    private int mAudio_channe_layout;
    private int mAudiosmooth;
    private int mAvFlag;
    private String mBackgroundImgUrl;
    private jt2 mBasicFilter;
    private int mBusinessType;
    private int mCameraID;
    private String mChannelkey;
    private int mClientRole;
    private boolean mCommMode;
    List<String> mConfParameters;
    WeakReference<Activity> mContextRef;
    private boolean mCusZoomFlag;
    private boolean mDefaultAudioRoutetoSpeakerphone;
    private boolean mEnableAudio;
    private boolean mEnableExternStream;
    private boolean mEnableMulPusherInRoom;
    private boolean mEnableSwitchAudioTrack;
    private boolean mEnableVideo;
    private int mEnableWebSdkInteroperability;
    private int mEncodeHeight;
    private int mEncodeWidth;
    private String mEncryptionMode;
    private String mEncryptionSecret;
    private int mErrorCode;
    private int mExternEncodeHeight;
    private int mExternEncodeWidth;
    private int mExternVideoBitRate;
    private Float mFaceEyeScale;
    private Float mFaceThinScale;
    private boolean mHavaSelectCamera;
    private boolean mHavaSelectFile;
    private boolean mIgnoreMonitor;
    private boolean mLinkMicLogEnable;
    private String mLinkMicLogPath;
    private boolean mLocalAudioStreamMute;
    private boolean mLocalVideoStreamMute;
    private IjkStreamerLogHelper mLogHelper;
    private int mLogReportCount;
    protected int mLogReportInterval;
    private MediaReportLogManager.LogUploadCallBack mLogUploadCallBack;
    private drl mLoger;
    private float mMasterAudioLevel;
    private brx mMediaCfgParams;
    MediaProjection mMediaProjection;
    MediaProjectionManager mMediaProjectionManager;
    private String mMemory;
    private String mNetType;
    private NetUtil mNetUtil;
    private boolean mNsStatus;
    private int mNsmode;
    private ijkMediaStreamer.OnErrorListener mOnErrorListener;
    private ijkMediaStreamer.OnInfoListener mOnInfoListener;
    private ijkMediaStreamer.onRecordScreenErrorListener mOnRecordScreenErrorListener;
    private ijkMediaStreamer.onRecordSuccessListener mOnRecordSuccessListener;
    private ijkMediaStreamer.OnRtcStatusListener mOnRtcStatusListener;
    private boolean mOnlyAudio;
    private int mOutErrorCode;
    private int mOutFileType;
    private String mOutpath;
    private String mOutputFilePath;
    private boolean mPauseRending;
    private SinkBase.PcmDateCallback mPcmDateCallback;
    private OnPlayerStateCallback mPlayerStateCallback;
    private ijkMediaStreamer.OnVideoPreviewSizeSetListener mPreviewSizeSetListener;
    private SinkBase.RecordDateCallback mRecordDateCallback;
    private pcmDataAvailableCallback mRecordPcmDataCallback;
    private boolean mRecordScreenError;
    private volatile boolean mRecording;
    private boolean mRoom24hMode;
    private int mRoomMode;
    private int mRoomtype;
    private MRtcAudioHandler mRtcAudioHandler;
    private MRtcAudioHandlerEx mRtcAudioHandlerEx;
    private vpw mRtcAudioStatsUpdataHandle;
    private MRtcChannelHandler mRtcChannelHandler;
    private MRtcConnectHandler mRtcConnectHandler;
    private MRtcEventHandler mRtcEventHandler;
    private kod0 mRtcEventHandlerAdapter;
    private MRtcExitRoomHandler mRtcExitRoomHandler;
    private wpw mRtcLRemoteStatsUpdataHandle;
    private zpw mRtcLVideoLossUpdataHandle;
    private MRtcQualityHandler mRtcQualityHandler;
    private ypw mRtcStatsUpdataHandle;
    private MRtcSurroundMusicHander mRtcSurroundMusicHander;
    ror mScreenCodecParameters;
    n5m mScreenInputPipline;
    private boolean mScreenOnWhilePlaying;
    MomoPipelineModuleRegister mScreenPipelineModuleRegister;
    zzl mScreenPusherPipeline;
    private int mSelectAudioTrack;
    private boolean mSelectFileStop;
    private float mSlaveAudioLevel;
    private Object mSurface;
    private ijkMediaStreamer.OnSurroundMusicStatusListener mSurroundMusicStatusListener;
    private Object mSynRelease;
    private int mTargetVideoHeight;
    private int mTargetVideoWidth;
    private gbl0 mTextureViewListener;
    private boolean mUseServerAudioMixer;
    private boolean mUsingVoip;
    private int mVenderID;
    private int mVideoBitRate;
    private ebl0 mVideoChannelListener;
    private hwl.InterfaceC17586a mVideoChannelListenerEx;
    private int mVideoCodecRate;
    private int mVideoHeight;
    private boolean mVideoQualityFlg;
    private gkl0 mVideoTextureListener;
    private int mVideoWidth;
    private int mVisualHeight;
    private int mVisualWeigh;
    private boolean mVoicebackwardsEnable;
    private float mZoom;
    private MomoPipelineModuleRegister moduleRegister;
    private zzl momoPusherPipeline;
    private ror mrCodecParameters;
    private row mrConfig;
    private InterfaceC4260a surroundMusicExt;
    private Integer warpType;

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$a */
    public class C3909a implements MomoPipelineModuleRegister.InterfaceC4261a {
        public C3909a() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4261a
        /* JADX INFO: renamed from: a */
        public void mo19371a(int i, int i2, c4m c4mVar) {
            if (ijkConferenceStreamer.this.mOnRecordScreenErrorListener != null) {
                if (i == 12545 && i2 == 11) {
                    ijkConferenceStreamer.this.mRecordScreenError = true;
                }
                ijkConferenceStreamer.this.mOnRecordScreenErrorListener.m224085a(ijkConferenceStreamer.this, i, i2);
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4261a
        /* JADX INFO: renamed from: b */
        public void mo19372b(int i, int i2, c4m c4mVar) {
            if (ijkConferenceStreamer.this.mOnRecordScreenErrorListener != null) {
                ijkConferenceStreamer.this.mOnRecordScreenErrorListener.m224085a(ijkConferenceStreamer.this, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$d */
    public class C3912d implements drl {
        public C3912d() {
        }

        @Override // p153l.drl
        /* JADX INFO: renamed from: a */
        public int mo19374a() {
            oq70.m168791d().m168795c("pip->PIPLINE2", "getError: mOutErrorCode=" + ijkConferenceStreamer.this.mOutErrorCode + ";mErrorCode=" + ijkConferenceStreamer.this.mErrorCode);
            int i = ijkConferenceStreamer.this.mOutErrorCode;
            ijkConferenceStreamer ijkconferencestreamer = ijkConferenceStreamer.this;
            return i == 0 ? ijkconferencestreamer.mErrorCode : ijkconferencestreamer.mOutErrorCode;
        }

        @Override // p153l.drl
        /* JADX INFO: renamed from: b */
        public String mo19375b() {
            NetUtil netUtil = ijkConferenceStreamer.this.mNetUtil;
            ijkConferenceStreamer ijkconferencestreamer = ijkConferenceStreamer.this;
            return netUtil == null ? ijkconferencestreamer.mMemory : ijkconferencestreamer.mMemory = String.valueOf(ijkconferencestreamer.mNetUtil.m223741a());
        }

        @Override // p153l.drl
        /* JADX INFO: renamed from: c */
        public String mo19376c() {
            return StringUtil.ALL_INTERFACES;
        }

        @Override // p153l.drl
        /* JADX INFO: renamed from: d */
        public String mo19377d() {
            NetUtil netUtil = ijkConferenceStreamer.this.mNetUtil;
            ijkConferenceStreamer ijkconferencestreamer = ijkConferenceStreamer.this;
            if (netUtil == null) {
                return ijkconferencestreamer.mNetType;
            }
            return ijkconferencestreamer.mNetType = ijkconferencestreamer.mNetUtil.m223744d() ? "wifi" : "other";
        }

        @Override // p153l.drl
        public String getPushType() {
            return "1";
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$e */
    public class C3913e implements j410.InterfaceC17870b {
        public C3913e() {
        }

        @Override // p153l.j410.InterfaceC17870b
        /* JADX INFO: renamed from: a */
        public void mo19378a(String str, String str2) {
            if (ijkConferenceStreamer.this.mLogUploadCallBack != null) {
                ijkConferenceStreamer.this.mLogUploadCallBack.m223625a(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$f */
    public class C3914f implements MomoPipelineModuleRegister.InterfaceC4262b {
        public C3914f() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4262b
        /* JADX INFO: renamed from: a */
        public void mo19379a(int i, int i2, c4m c4mVar) {
            oq70.m168791d().m168795c("MomoCamera", "what#########" + i);
            if (ijkConferenceStreamer.this.mOnInfoListener != null) {
                ijkConferenceStreamer.this.mOnInfoListener.m224076a(ijkConferenceStreamer.this, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$h */
    public class C3916h implements MomoPipelineModuleRegister.InterfaceC4263c {
        public C3916h() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4263c
        /* JADX INFO: renamed from: a */
        public void mo19380a(c4m c4mVar) {
            synchronized (ijkConferenceStreamer.this.mSynRelease) {
                try {
                    if (ijkConferenceStreamer.this.moduleRegister != null) {
                        ijkConferenceStreamer.this.moduleRegister.mo21180z(c4mVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4263c
        /* JADX INFO: renamed from: b */
        public void mo19381b(c4m c4mVar) {
            oq70.m168791d().m168795c("MomoCamera", "onRecordPrepared");
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$i */
    public class C3917i implements fb1 {
        public C3917i() {
        }

        @Override // p153l.fb1
        /* JADX INFO: renamed from: C */
        public oxd0 mo19373C(oxd0 oxd0Var) {
            if (ijkConferenceStreamer.this.mRecordDateCallback != null) {
                ijkConferenceStreamer.this.mRecordDateCallback.onRecordFrame(oxd0Var.f149638a, 44100, true);
            }
            return oxd0Var;
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$j */
    public class C3918j implements gb1 {
        public C3918j() {
        }

        @Override // p153l.gb1
        /* JADX INFO: renamed from: a */
        public void mo19382a(Object obj, int i, int i2) {
            if (ijkConferenceStreamer.this.mSurroundMusicStatusListener != null) {
                ijkConferenceStreamer.this.mSurroundMusicStatusListener.m224080a(null, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$k */
    public class C3919k implements fb1 {
        public C3919k() {
        }

        @Override // p153l.fb1
        /* JADX INFO: renamed from: C */
        public oxd0 mo19373C(oxd0 oxd0Var) {
            if (ijkConferenceStreamer.this.mPcmDateCallback != null) {
                ijkConferenceStreamer.this.mPcmDateCallback.onPcmDateCallback(0L, oxd0Var.f149638a, 44100, true);
            }
            return oxd0Var;
        }
    }

    public ijkConferenceStreamer(Activity activity, int i, String str, boolean z, brx brxVar) {
        super(activity, i);
        this.mCameraID = 0;
        this.mHavaSelectCamera = false;
        this.mHavaSelectFile = false;
        this.mConfParameters = new ArrayList();
        this.mAllRemoteAudioStream = false;
        this.mVoicebackwardsEnable = false;
        this.mIgnoreMonitor = true;
        this.mOnlyAudio = false;
        this.mCommMode = false;
        this.mCusZoomFlag = false;
        this.mSlaveAudioLevel = 1.0f;
        this.mMasterAudioLevel = 1.0f;
        this.mChannelkey = null;
        this.mEncryptionSecret = null;
        this.mEncryptionMode = null;
        this.mLocalAudioStreamMute = false;
        this.mLocalVideoStreamMute = false;
        this.mEnableVideo = true;
        this.mEnableAudio = true;
        this.mAdjustBrightnessInterval = -1;
        this.mEnableWebSdkInteroperability = -1;
        this.mDefaultAudioRoutetoSpeakerphone = true;
        this.mRoom24hMode = false;
        this.mRoomMode = -1;
        this.mUseServerAudioMixer = false;
        this.mAudioProfile = 0;
        this.mAudioScenario = 0;
        this.mNsStatus = false;
        this.mNsmode = -1;
        this.mPcmDateCallback = null;
        this.mRecordDateCallback = null;
        this.mAudioInterval = -1;
        this.mAudiosmooth = -1;
        this.mRtcEventHandler = null;
        this.mRtcAudioHandler = null;
        this.mRtcAudioHandlerEx = null;
        this.mRtcChannelHandler = null;
        this.mRtcQualityHandler = null;
        this.mRtcConnectHandler = null;
        this.mRtcSurroundMusicHander = null;
        this.mRtcExitRoomHandler = null;
        this.mLogReportInterval = 1000;
        this.mLogReportCount = 30;
        this.mOutpath = null;
        this.mEnableMulPusherInRoom = false;
        this.mrCodecParameters = new ror();
        this.mPauseRending = false;
        this.mPlayerStateCallback = null;
        this.mVenderID = 0;
        this.mAppID = "";
        this.mRecording = false;
        this.mVideoChannelListener = null;
        this.mVideoTextureListener = null;
        this.mTextureViewListener = null;
        this.mZoom = 1.0f;
        this.mVisualWeigh = 352;
        this.mVisualHeight = 640;
        this.mEncodeWidth = 352;
        this.mEncodeHeight = 640;
        this.mExternEncodeWidth = 160;
        this.mExternEncodeHeight = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;
        this.mTargetVideoWidth = 640;
        this.mTargetVideoHeight = 480;
        this.mAudioChannalNum = 2;
        this.mAudioSampleRate = 44100;
        this.mVideoWidth = 480;
        this.mVideoHeight = 640;
        this.mClientRole = 1;
        this.mEnableExternStream = false;
        this.mVideoCodecRate = 15;
        this.mVideoBitRate = 500000;
        this.mExternVideoBitRate = 80000;
        this.mNetUtil = null;
        this.mErrorCode = 0;
        this.mOutErrorCode = 0;
        this.mVideoQualityFlg = false;
        this.mAudioHighQualityFlg = false;
        this.mAudioProfileStatus = false;
        this.mRoomtype = 0;
        this.mAvFlag = 0;
        this.mBusinessType = 0;
        this.mNetType = "";
        this.mMemory = "";
        this.mLinkMicLogPath = "";
        this.mLinkMicLogEnable = false;
        this.mSelectAudioTrack = 1;
        this.mOutFileType = 10;
        this.mOutputFilePath = null;
        this.mSelectFileStop = true;
        this.mAudio_channe_frq = 44100;
        this.mAudio_channe = 1;
        this.mAudio_channe_layout = 1;
        this.mBackgroundImgUrl = null;
        this.mAudioRoteoverrideDefault = -1;
        this.mUsingVoip = false;
        this.MALE_PITCH = -4;
        this.FEMALE_PITCH = 6;
        this.WAWA_PITCH = 9;
        this.enableAudioStrero = false;
        this.enableVbr = true;
        this.mSynRelease = new Object();
        this.mRecordScreenError = false;
        this.mRtcEventHandlerAdapter = null;
        this.mMediaCfgParams = null;
        this.mEnableSwitchAudioTrack = false;
        this.mActiveAudioTrack = 1;
        this.mLoger = new C3912d();
        this.mLogHelper = null;
        this.mContextRef = new WeakReference<>(activity);
        this.mVenderID = i;
        this.mEnableVideo = !z;
        this.mEnableAudio = true;
        this.mOnlyAudio = z;
        this.mOutErrorCode = 0;
        this.mAppID = str;
        l26.m152569a(activity.getApplicationContext());
        initFilterCoreParameters();
        initPipeline(brxVar);
    }

    private void audioEffectReset() {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a == null) {
            return;
        }
        interfaceC4260a.mo21093P();
        this.surroundMusicExt.mo21096S1(false);
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private void initFilterCoreParameters() {
        if (this.mNetUtil == null && this.mContextRef.get() != null) {
            this.mNetUtil = new NetUtil(this.mContextRef.get().getApplicationContext());
        }
        if (this.mrCodecParameters == null) {
            this.mrCodecParameters = new ror();
        }
        ror rorVar = this.mrCodecParameters;
        rorVar.f180162G0 = true;
        rorVar.f175449F = 20;
        rorVar.f180159D0 = 20;
        rorVar.f180160E0 = this.mVideoCodecRate;
        rorVar.f175451H = this.mVideoBitRate;
        rorVar.f175506s = this.mVideoWidth;
        rorVar.f175508t = this.mVideoHeight;
        rorVar.f175494m = this.mEncodeWidth;
        rorVar.f175496n = this.mEncodeHeight;
        rorVar.f175498o = this.mExternEncodeWidth;
        rorVar.f175500p = this.mExternEncodeHeight;
        rorVar.f175452I = this.mExternVideoBitRate;
        rorVar.f175510u = this.mVisualWeigh;
        rorVar.f175511v = this.mVisualHeight;
        rorVar.f175502q = this.mEnableExternStream;
        rorVar.f175461R = this.mAudioChannalNum;
        rorVar.f175459P = this.mAudioSampleRate;
        rorVar.f180172Q0 = this.mLinkMicLogEnable;
        rorVar.f180173R0 = this.mLinkMicLogPath;
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21179y(rorVar);
        }
        if (this.mrConfig == null) {
            this.mrConfig = row.m182447k();
        }
        this.mrConfig.m182462O(new erf0(this.mVisualWeigh, this.mVisualHeight));
        this.mrConfig.m182479r(new erf0(this.mEncodeWidth, this.mEncodeHeight));
        int i = this.mCameraID;
        row rowVar = this.mrConfig;
        if (i == 0) {
            rowVar.m182478q(0);
        } else {
            rowVar.m182478q(1);
        }
        this.mrConfig.m182455H(new erf0(this.mTargetVideoWidth, this.mTargetVideoHeight));
    }

    private void initPipeline(brx brxVar) {
        this.mMediaCfgParams = brxVar;
        MomoPipelineModuleRegister momoPipelineModuleRegisterM114076m = d410.m114076m(this.mContextRef.get(), brxVar);
        this.moduleRegister = momoPipelineModuleRegisterM114076m;
        momoPipelineModuleRegisterM114076m.mo21179y(this.mrCodecParameters);
        this.moduleRegister.mo21168n();
        this.moduleRegister.mo21150K();
        this.moduleRegister.mo21146G(this.mLoger);
        this.moduleRegister.mo21143D(new C3913e());
        this.moduleRegister.mo21140A(new C3914f());
        this.moduleRegister.mo21159e(new C3915g());
        this.surroundMusicExt = this.moduleRegister.mo21166l();
        this.moduleRegister.mo21160f(new C3916h());
        csx.m112235R().m112244C1(1);
        csx.m112235R().m112383s1(false);
    }

    private void sabineMcEQ() {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a == null) {
            return;
        }
        interfaceC4260a.mo21109d0(0, 31.25f, 16);
        this.surroundMusicExt.mo21094Q(1, 62.5f, 8.0f);
        this.surroundMusicExt.mo21120n1(2, 125.0f, 2.0f, 8.0f);
        this.surroundMusicExt.mo21120n1(3, 250.0f, 2.0f, 8.0f);
        this.surroundMusicExt.mo21120n1(4, 500.0f, 2.0f, 8.0f);
        this.surroundMusicExt.mo21120n1(5, 1000.0f, 2.0f, 8.0f);
        this.surroundMusicExt.mo21120n1(6, 2000.0f, 2.0f, -8.0f);
        this.surroundMusicExt.mo21120n1(7, 4000.0f, 2.0f, -8.0f);
        this.surroundMusicExt.mo21094Q(8, 8000.0f, -8.0f);
        this.surroundMusicExt.mo21109d0(9, 16000.0f, 33);
    }

    private void setParameters_i(List<String> list) {
        if (this.linkMicPusherPipeline != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.linkMicPusherPipeline.mo109334v(it.next());
            }
        }
    }

    private void startPush(Activity activity, brx brxVar) {
        if (this.mScreenPipelineModuleRegister == null) {
            this.mScreenPipelineModuleRegister = d410.m114076m(activity, this.mMediaCfgParams);
        }
        if (this.mScreenInputPipline == null) {
            this.mScreenCodecParameters.f180190y0 = getScreenWidth(activity);
            this.mScreenCodecParameters.f180191z0 = getScreenHeight(activity);
            this.mScreenCodecParameters.f175506s = getScreenWidth(activity);
            this.mScreenCodecParameters.f175508t = getScreenHeight(activity);
            this.mScreenPipelineModuleRegister.mo21179y(this.mScreenCodecParameters);
            this.mScreenPipelineModuleRegister.mo21150K();
            this.mScreenPipelineModuleRegister.mo21159e(new C3909a());
            n5m n5mVarMo21169o = this.mScreenPipelineModuleRegister.mo21169o();
            this.mScreenInputPipline = n5mVarMo21169o;
            n5mVarMo21169o.mo136017i(null);
            this.mScreenInputPipline.mo109168o(this.mMediaProjection);
            this.mScreenPusherPipeline = this.mScreenPipelineModuleRegister.mo21155P(null);
            hwl hwlVar = this.linkMicPusherPipeline;
            if (hwlVar != null) {
                hwlVar.mo109294P1(true);
            }
            MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
            MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.mScreenPipelineModuleRegister;
            if (momoPipelineModuleRegister != null) {
                momoPipelineModuleRegister2.mo21149J(momoPipelineModuleRegister.mo21178x());
            } else {
                momoPipelineModuleRegister2.mo21149J(null);
            }
            zzl zzlVar = this.mScreenPusherPipeline;
            ror rorVar = this.mScreenCodecParameters;
            zzlVar.mo107925p0(rorVar.f164232m1, rorVar.f180187v0);
            this.mScreenPusherPipeline.mo107927t0();
            String str = this.mScreenCodecParameters.f180187v0;
        }
    }

    public void JoinRoom(String str, int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107924p(str, i);
        }
    }

    public void LeaveRoom() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107923o();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void SabineEffectReset() {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21093P();
        }
    }

    public void SabineEffectReset_ex() {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21085I();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void SabineEffectSet(int i, int i2, float f) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21112e1(i, i2, f);
        }
    }

    public void SabineEffectSet_ans(float f) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21098U1(f);
        }
    }

    public void SabineEffectSet_peq_Shelving(int i, float f, float f2) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21094Q(i, f, f2);
        }
    }

    public void SabineEffectSet_peq_fliter(int i, float f, int i2) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21109d0(i, f, i2);
        }
    }

    public void SabineEffectSet_peq_peak(int i, float f, float f2, float f3) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21120n1(i, f, f2, f3);
        }
    }

    public void SabineEffectSet_reverb(int i, float f) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21115i1(i, f);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addEventHandler(MRtcEventHandler mRtcEventHandler) {
        this.mRtcEventHandler = mRtcEventHandler;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109303X1(mRtcEventHandler);
        }
    }

    public void addExitRoomHandler(MRtcExitRoomHandler mRtcExitRoomHandler) {
        this.mRtcExitRoomHandler = mRtcExitRoomHandler;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109291N0(mRtcExitRoomHandler);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addFilterToDestory(jt2 jt2Var) {
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar == null || cqlVar.mo109167a() == null) {
            return;
        }
        addFilterToDestroy(jt2Var, this.cameraInputPipline.mo109167a().toString());
    }

    public void addFilterToDestroy(wej wejVar, String str) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21148I(wejVar, str);
        }
    }

    public void addMRtcAnchorStatusHandle(upw upwVar) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109292O0(null);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addMRtcAudioHandler(MRtcAudioHandler mRtcAudioHandler) {
        b7y.m102882c().m102888g("addMRtcAudioHandler");
        this.mRtcAudioHandler = mRtcAudioHandler;
        setAudioOnlyModel(mRtcAudioHandler, this.mAudioInterval, this.mAudiosmooth);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addMRtcAudioHandlerEx(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        b7y.m102882c().m102888g("addMRtcAudioHandlerEx");
        this.mRtcAudioHandlerEx = mRtcAudioHandlerEx;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107922n0(mRtcAudioHandlerEx);
        }
    }

    public void addMRtcAudioStatsUpdataHandler(vpw vpwVar) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109269B0(vpwVar);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addMRtcChannelHandler(MRtcChannelHandler mRtcChannelHandler) {
        this.mRtcChannelHandler = mRtcChannelHandler;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109318i0(mRtcChannelHandler);
        }
    }

    public void addMRtcConnectHandler(MRtcConnectHandler mRtcConnectHandler) {
        this.mRtcConnectHandler = mRtcConnectHandler;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109309a2(mRtcConnectHandler);
        }
    }

    public void addMRtcLRemoteStatsUpdataHandle(wpw wpwVar) {
        this.mRtcLRemoteStatsUpdataHandle = wpwVar;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109279H0(wpwVar);
        }
    }

    public void addMRtcMRtcClientRoleChangedHandler(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109310c0(mRtcClientRoleChangedHandler);
        }
    }

    public void addMRtcQualityHandler(MRtcQualityHandler mRtcQualityHandler) {
        this.mRtcQualityHandler = mRtcQualityHandler;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109281J0(mRtcQualityHandler);
        }
    }

    public void addMRtcReceiveSeiHandler(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109305Y1(mRtcReceiveSeiHandler);
        }
    }

    public void addMRtcStatsUpdataHandle(ypw ypwVar) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109308a0(null);
        }
    }

    public void addMRtcSurroundMusicHander(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
        this.mRtcSurroundMusicHander = mRtcSurroundMusicHander;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109332s0(mRtcSurroundMusicHander);
        }
    }

    public void addMRtcVideoLossHandler(zpw zpwVar) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109273D1(zpwVar);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void adjustAef(int i, boolean z) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21105b0(i, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void adjustEQ(int i, boolean z) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21133y0(i, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void adjustEf(int i, int i2) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21097T(i, i2);
        }
    }

    public void adjustPlaybackSignalVolume(int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107891F1(i);
        }
    }

    public void adjustRemoteUserVolumeScale(long j, float f) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109285L(j, f);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void adjustTune(int i, boolean z) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21117j0(i, z);
        }
    }

    public void captureImage(String str) {
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo107904V1(str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int changeRole(int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.mo109275E0(i);
        }
        return -1;
    }

    public void changeVideoEncodeSize() {
        MomoPipelineModuleRegister momoPipelineModuleRegister;
        MomoPipelineModuleRegister momoPipelineModuleRegister2;
        ror rorVar = this.mrCodecParameters;
        if (rorVar == null) {
            return;
        }
        int i = this.mVenderID;
        if (i == 1 && (momoPipelineModuleRegister2 = this.moduleRegister) != null) {
            momoPipelineModuleRegister2.mo21156b(rorVar);
            this.moduleRegister.mo21176v(this.mrCodecParameters);
        } else if ((i == 2 || i == 3) && (momoPipelineModuleRegister = this.moduleRegister) != null) {
            momoPipelineModuleRegister.mo21156b(rorVar);
        }
        this.moduleRegister.mo21170p(this.mrCodecParameters);
    }

    public void disableSabinAns(boolean z) {
        b7y.m102882c().m102888g("disableSabinAns:" + z);
        if (z) {
            csx.m112235R().m112355k1(1, 1);
        } else {
            csx.m112235R().m112355k1(0, 0);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableAudio(boolean z) {
        this.mEnableAudio = z;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109333u1(z);
        }
    }

    public void enableAudioStereo(boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109297S(z);
        }
        this.enableAudioStrero = z;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableAudioVolumeIndication(int i, int i2) {
        this.mAudioInterval = i;
        this.mAudiosmooth = i2;
        setAudioOnlyModel(this.mRtcAudioHandler, i, i2);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableCommMode(boolean z) {
        this.mCommMode = z;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109323k2(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableConfLog(boolean z, String str) {
        this.mLinkMicLogPath = str;
        this.mLinkMicLogEnable = z;
        if (this.mrCodecParameters != null && str.length() > 0) {
            ror rorVar = this.mrCodecParameters;
            rorVar.f180173R0 = this.mLinkMicLogPath;
            rorVar.f180172Q0 = this.mLinkMicLogEnable;
        }
        if (this.linkMicPusherPipeline == null || !this.mLinkMicLogEnable || this.mLinkMicLogPath.length() <= 0) {
            return;
        }
        this.linkMicPusherPipeline.mo109300W(this.mLinkMicLogEnable, this.mLinkMicLogPath);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableExternStream(boolean z) {
        this.mEnableExternStream = z;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109290N(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableMulPusherInRoom(boolean z) {
        this.mEnableMulPusherInRoom = z;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109307Z0(z);
        }
    }

    public void enableVbr(boolean z) {
        this.enableVbr = z;
        csx.m112235R().m112389u1(z);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableVideo(boolean z) {
        this.mEnableVideo = z;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109270C0(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void enableWebSdkInteroperability(boolean z) {
        this.mEnableWebSdkInteroperability = z ? 1 : 0;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar == null || z == -1) {
            return;
        }
        hwlVar.mo107931v0(z);
    }

    public void enableWeilaVBR(boolean z) {
        csx.m112235R().m112389u1(z);
    }

    public void forwardDownlinkAudio(long j, boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109336z0(j, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public RtcEngine getAgoraEngine() {
        return null;
    }

    public ror getCodecParameters() {
        return this.mrCodecParameters;
    }

    public long getCurrentPos() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.mo21129w();
        }
        return 0L;
    }

    public double getEffectsVolume() {
        hwl hwlVar = this.linkMicPusherPipeline;
        return hwlVar != null ? hwlVar.getEffectsVolume() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public long getExternFileDuration() {
        lvl lvlVar = this.ijkInputPipline;
        if (lvlVar != null) {
            return lvlVar.getDuration();
        }
        return 0L;
    }

    public long getExternFilePlayPos() {
        lvl lvlVar = this.ijkInputPipline;
        if (lvlVar != null) {
            return lvlVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public float getMasterAudioLevel() {
        return this.mMasterAudioLevel;
    }

    public brx getMediaCfgParams() {
        return this.mMediaCfgParams;
    }

    public o410 getMomoProcessPipeline() {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister == null) {
            return null;
        }
        momoPipelineModuleRegister.mo21145F().mo20723z0();
        return null;
    }

    public long getMusicDuration() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.getMusicDuration();
        }
        return 0L;
    }

    public float getMusicVolume() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.mo21108d();
        }
        return 1.0f;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public erf0 getPreviewSize(int i, int i2) {
        cql cqlVar = this.cameraInputPipline;
        return cqlVar != null ? cqlVar.mo111956x(i, i2) : new erf0(352, 640);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getRecordDuration() {
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            return zzlVar.mo107917k1();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getRecordHeight() {
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            return zzlVar.mo107897L1();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getRecordWidth() {
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            return zzlVar.mo107903V0();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getRoomType() {
        return this.mRoomtype;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public float getSlaveAudioLevel() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.mo21134y1();
        }
        return 0.5f;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getStreamerType() {
        return this.mVenderID;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public long getSurroundMusicDuration() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.mo21107c();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public long getSurroundMusicPos() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.mo21126r();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public long getVideoPts() {
        return 0L;
    }

    public double getVolumeOfEffects(int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        return hwlVar != null ? hwlVar.mo126848X0(i) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void ignoreMonitor(boolean z) {
        this.mIgnoreMonitor = z;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107896J1(z);
        }
    }

    public void mergeInput(pvl pvlVar, String str) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21171q(pvlVar, str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteAllRemoteAudioStream(boolean z) {
        this.mAllRemoteAudioStream = z;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107932x(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteAllRemoteVideoStream(boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107912f1(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteLocalAudioStream(boolean z) {
        this.mLocalAudioStreamMute = z;
        b7y.m102882c().m102888g("ijkconf muteLocalAudioStream", Boolean.valueOf(z));
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107906a(z);
        }
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo107906a(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void muteLocalAudioStreamEx(boolean z) {
        this.mLocalAudioStreamMute = z;
        b7y.m102882c().m102888g("ijkconf muteLocalAudioStreamEx", Boolean.valueOf(z));
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109278G(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteLocalVideoStream(boolean z) {
        this.mLocalVideoStreamMute = z;
        b7y.m102882c().m102888g("muteLocalVideoStream", Boolean.valueOf(z));
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107889B1(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteRemoteAudioStream(long j, boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107899Q0(j, z);
        }
    }

    public void muteRemoteMsgStream(long j, boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107902U0(j, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteRemoteVideoStream(long j, boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107893H1(j, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void muteSingerAudioStream(boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107907b(z);
        }
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a != null) {
            interfaceC4260a.mo21104b(z);
        }
    }

    @RequiresApi(api = 21)
    public void onActivityResult(Activity activity, int i, int i2, Intent intent, brx brxVar) {
        if (i != 1111) {
            return;
        }
        MediaProjection mediaProjection = this.mMediaProjectionManager.getMediaProjection(i2, intent);
        ijkMediaStreamer.OnInfoListener onInfoListener = this.mOnInfoListener;
        if (onInfoListener != null) {
            onInfoListener.m224076a(this, 12546, i2);
        }
        if (mediaProjection == null || i2 == 0) {
            return;
        }
        this.mMediaProjection = mediaProjection;
        startPush(activity, brxVar);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void openAudioTracks(boolean z) {
        this.mEnableSwitchAudioTrack = z;
        lvl lvlVar = this.ijkInputPipline;
        if (lvlVar != null) {
            lvlVar.mo155998t(z);
        }
    }

    public void pasePlayMusic() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21131w1();
        }
    }

    public void pauseAllEffects() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.pauseAllEffects();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void pauseCamera() {
        if (this.cameraInputPipline != null) {
            b7y.m102882c().m102888g("pauseCamera");
            this.cameraInputPipline.mo111931N();
        }
    }

    public void pauseEffect(int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.pauseEffect(i);
        }
    }

    public void pauseExternFile() {
        if (!this.mHavaSelectFile || this.ijkInputPipline == null) {
            return;
        }
        b7y.m102882c().m102888g("pauseExternFile");
        this.ijkInputPipline.pause();
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void pauseRecording() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109331s();
        }
    }

    public void pauseRending() {
        if (this.mPauseRending) {
            return;
        }
        this.mPauseRending = true;
        if (this.cameraInputPipline != null) {
            b7y.m102882c().m102888g("cameraInputPipline pauseRendering");
            this.cameraInputPipline.mo136016K();
        }
        if (this.ijkInputPipline != null) {
            b7y.m102882c().m102888g("ijkInputPipline pauseRendering");
            this.ijkInputPipline.mo136016K();
        }
    }

    public void pauseScreenPusher() {
        n5m n5mVar = this.mScreenInputPipline;
        if (n5mVar != null) {
            n5mVar.mo136016K();
        }
        zzl zzlVar = this.mScreenPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo189142g2();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void pauseSurroundMusic() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21116j();
        }
    }

    public boolean playEffect(int i, String str, int i2, double d, double d2, boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.mo109284K1(i, str, i2, d, d2, z, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        return true;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void release() {
        setScreenOnWhilePublishing(false);
        stopRecording();
        stopScreenPushlish();
        SegmentHelper.release();
        synchronized (this.mSynRelease) {
            try {
                NetUtil netUtil = this.mNetUtil;
                if (netUtil != null) {
                    netUtil.m223745e();
                    this.mNetUtil = null;
                }
                InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
                if (interfaceC4260a != null) {
                    interfaceC4260a.mo21110d1();
                    this.surroundMusicExt = null;
                }
                cql cqlVar = this.cameraInputPipline;
                if (cqlVar != null) {
                    cqlVar.mo109166G();
                    this.cameraInputPipline.mo111951r();
                    this.moduleRegister.mo21141B(this.cameraInputPipline);
                    this.cameraInputPipline = null;
                }
                lvl lvlVar = this.ijkInputPipline;
                if (lvlVar != null) {
                    lvlVar.mo109166G();
                    this.moduleRegister.mo21141B(this.ijkInputPipline);
                    this.ijkInputPipline = null;
                }
                usl uslVar = this.emptyInputPipline;
                if (uslVar != null) {
                    uslVar.mo109166G();
                    this.moduleRegister.mo21141B(this.emptyInputPipline);
                    this.emptyInputPipline = null;
                }
                MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
                if (momoPipelineModuleRegister != null) {
                    momoPipelineModuleRegister.mo21174t();
                    this.moduleRegister = null;
                }
                IjkStreamerLogHelper ijkStreamerLogHelper = this.mLogHelper;
                if (ijkStreamerLogHelper != null) {
                    ijkStreamerLogHelper.m223605i(0, this.mrCodecParameters.f180187v0);
                    this.mLogHelper.m223608l();
                    this.mLogHelper.m223606j();
                    this.mLogHelper = null;
                    this.mLogUploadCallBack = null;
                }
                hwl hwlVar = this.linkMicPusherPipeline;
                if (hwlVar != null) {
                    hwlVar.release();
                    this.linkMicPusherPipeline = null;
                }
                zzl zzlVar = this.momoPusherPipeline;
                if (zzlVar != null) {
                    zzlVar.release();
                    this.momoPusherPipeline = null;
                }
                this.mLogUploadCallBack = null;
                this.mOnErrorListener = null;
                this.mPreviewSizeSetListener = null;
                this.mContextRef.clear();
                this.mContextRef = null;
                this.mSurface = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void releasePlayMusic() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21121o0();
        }
    }

    public void removeMerge(pvl pvlVar) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21164j(pvlVar);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void requestExpectStream(int i, int i2) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109266A0(i, i2);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void resetCamera() {
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111928B(this.mrConfig);
        }
    }

    public void resetCodec(int i, int i2, int i3) {
        this.mEncodeWidth = i;
        this.mEncodeHeight = i2;
        this.mVideoBitRate = i3;
        ror rorVar = this.mrCodecParameters;
        if (rorVar != null) {
            if (i3 == rorVar.f175451H && i == rorVar.f175494m && i2 == rorVar.f175496n) {
                return;
            }
            initFilterCoreParameters();
            hwl hwlVar = this.linkMicPusherPipeline;
            if (hwlVar != null) {
                hwlVar.mo107900S0(this.mrCodecParameters);
            }
        }
    }

    public void resetExtPlayerPath(String str) {
        this.mrCodecParameters.f180189x0 = str;
    }

    public void resumeAllEffects() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.resumeAllEffects();
        }
    }

    public void resumeCamera() {
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111958z();
        }
    }

    public void resumeEffect(int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.resumeEffect(i);
        }
    }

    public void resumeExternFile(Object obj) {
        if (!this.mHavaSelectFile || this.ijkInputPipline == null) {
            return;
        }
        b7y.m102882c().m102888g("resumeExternFile", "surface:" + obj);
        this.ijkInputPipline.resume();
        this.ijkInputPipline.mo136016K();
        this.ijkInputPipline.mo136014C(obj);
    }

    public void resumePlayMusic() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21122p1();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void resumeRecording() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109277F0();
        }
    }

    public void resumeRending() {
        Object obj;
        if (this.mPauseRending) {
            this.mPauseRending = false;
            cql cqlVar = this.cameraInputPipline;
            if (cqlVar != null && (obj = this.mSurface) != null) {
                cqlVar.mo136014C(obj);
            }
            lvl lvlVar = this.ijkInputPipline;
            if (lvlVar != null) {
                lvlVar.mo136014C(this.mSurface);
            }
        }
    }

    public void resumeScreenPusher() {
        n5m n5mVar = this.mScreenInputPipline;
        if (n5mVar != null) {
            n5mVar.mo136014C(null);
        }
        zzl zzlVar = this.mScreenPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo189140R0();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void resumeSurroundMusic() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21124q();
        }
    }

    public void seekExternFile(long j) {
        lvl lvlVar;
        if (!this.mHavaSelectFile || (lvlVar = this.ijkInputPipline) == null) {
            return;
        }
        lvlVar.seek(j);
    }

    public void seekMusic(long j) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21125q0(j);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void seekToSurroundMusic(long j) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21130w0(j);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void selectCamera(Activity activity, int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void selectFaceDetectFilter(jt2 jt2Var) {
        selectFilter(jt2Var);
        if (jt2Var instanceof suf) {
            setFaceDetectInterFace((suf) jt2Var);
        }
    }

    public void selectFilter(jt2 jt2Var) {
        this.mBasicFilter = jt2Var;
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111946j(jt2Var);
        }
    }

    public void sendConferenceDate(String str) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109295Q1(str);
        }
    }

    public void setAdjustBrightnessInterval(int i) {
        this.mAdjustBrightnessInterval = i;
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111949m(i);
        }
    }

    public void setAppID(String str) {
        this.mAppID = str;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setAudioChannelNum(int i) {
        this.mAudioChannalNum = i;
    }

    public void setAudioEffectType(int i) {
        InterfaceC4260a interfaceC4260a = this.surroundMusicExt;
        if (interfaceC4260a == null) {
            return;
        }
        if (i == 0) {
            audioEffectReset();
            this.surroundMusicExt.mo21117j0(0, false);
            return;
        }
        switch (i) {
            case 5:
                audioEffectReset();
                this.surroundMusicExt.mo21117j0(-4, true);
                break;
            case 6:
                audioEffectReset();
                this.surroundMusicExt.mo21117j0(6, true);
                break;
            case 7:
                audioEffectReset();
                this.surroundMusicExt.mo21117j0(9, true);
                break;
            case 8:
                interfaceC4260a.mo21117j0(0, false);
                this.surroundMusicExt.mo21085I();
                this.surroundMusicExt.mo21096S1(false);
                sabineMcEQ();
                break;
            case 9:
                audioEffectReset();
                this.surroundMusicExt.mo21117j0(0, false);
                this.surroundMusicExt.mo21096S1(true);
                break;
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setAudioHighQualityParameters(boolean z) {
        this.mAudioHighQualityFlg = z;
        oq70.m168791d().m168795c("newAudio", "setAudioHighQualityParameters:mAudioProfile=" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg);
    }

    public void setAudioMixingPitch(int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109267A1(i);
        }
    }

    public void setAudioOnlyModel(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        if (mRtcAudioHandler == null || i < 0 || i2 < 0) {
            return;
        }
        b7y.m102882c().m102888g("setAudioOnlyModel", "interval:" + i + ",smooth:" + i2);
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107905Z1(mRtcAudioHandler, i, i2);
        }
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo107905Z1(mRtcAudioHandler, i, i2);
        }
    }

    public void setAudioProfile(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return;
        }
        this.mAudioProfileStatus = true;
        this.mAudioProfile = i;
        this.mAudioScenario = i2;
        if (this.linkMicPusherPipeline != null) {
            oq70.m168791d().m168795c("newAudio", "setAudioProfile:mAudioProfile=" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg);
            b7y b7yVarM102882c = b7y.m102882c();
            StringBuilder sb = new StringBuilder("ijkconf setAudioProfile: profile=");
            sb.append(this.mAudioProfile);
            sb.append(", scenario=");
            sb.append(this.mAudioScenario);
            b7yVarM102882c.m102888g(sb.toString());
            this.linkMicPusherPipeline.mo109288M0(this.mAudioProfile, this.mAudioScenario);
        }
    }

    public void setAudioSampleRate(int i) {
        this.mAudioSampleRate = i;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setAudioTrackIndex(int i) {
        this.mActiveAudioTrack = i;
        lvl lvlVar = this.ijkInputPipline;
        if (lvlVar != null) {
            lvlVar.mo155996n(i);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setAvFlag(int i) {
        this.mAvFlag = i;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107928t1(i);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setBlinkSwitch(boolean z) {
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111955w(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setBusinessType(int i) {
        this.mBusinessType = i;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107901T0(i);
        }
    }

    public void setCameraCutSize(int i, int i2) {
        this.moduleRegister.mo21173s(i, i2);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setChannalName(String str) {
        this.mrCodecParameters.f164226g1 = str;
        oq70.m168791d().m168795c("setChannalName", "setChannalName" + this.mrCodecParameters.f164226g1);
        try {
            setSessionID(Long.parseLong(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setChannelkey(String str) {
        hwl hwlVar;
        this.mChannelkey = str;
        if (TextUtils.isEmpty(str) || (hwlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        hwlVar.mo109315h0(this.mChannelkey);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setCustZoomFlag(boolean z) {
        this.mCusZoomFlag = z;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109280I0(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setDefaultAudioRoutetoSpeakerphone(boolean z) {
        this.mDefaultAudioRoutetoSpeakerphone = z;
    }

    public void setEffectsVolume(double d) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.setEffectsVolume(d);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int setEnableSpeakerphone(boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.setEnableSpeakerphone(z);
        }
        return -1;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setEncoderSize(int i, int i2) {
        this.mEncodeWidth = i;
        this.mEncodeHeight = i2;
        b7y.m102882c().m102888g("setEncoderSize", "width:" + i + ", height:" + i2);
        initFilterCoreParameters();
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setEncryptionMode(String str) {
        hwl hwlVar;
        this.mEncryptionMode = str;
        if (TextUtils.isEmpty(str) || (hwlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        hwlVar.mo109316h1(str);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setEncryptionSecret(String str) {
        hwl hwlVar;
        this.mEncryptionSecret = str;
        if (TextUtils.isEmpty(str) || (hwlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        hwlVar.mo109306Z(str);
    }

    public void setError(int i) {
        this.mOutErrorCode = i;
        oq70.m168791d().m168795c("pip->PIPLINE2", "setError: mOutErrorCode=" + this.mOutErrorCode);
    }

    public void setExtAudioParameters(int i, int i2, int i3) {
        this.mAudio_channe_frq = i;
        this.mAudio_channe = i2;
        this.mAudio_channe_layout = i3;
        lvl lvlVar = this.ijkInputPipline;
        if (lvlVar != null) {
            lvlVar.mo155997p(i, i2, i3);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setExternEncoderSize(int i, int i2) {
        this.mExternEncodeWidth = i;
        this.mExternEncodeHeight = i2;
        initFilterCoreParameters();
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setExternVideoEncodingBitRate(int i) {
        this.mExternVideoBitRate = i;
        initFilterCoreParameters();
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setFaceBeautiful(int i) {
        this.faceBeautiful = i;
    }

    public void setFaceDetectInterFace(suf sufVar) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21147H(sufVar);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setFaceDetectModelPath(List<String> list) {
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111948l(list);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setFaceDetectTimeoutSwitch(boolean z) {
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111930I(z);
        }
    }

    public void setFaceExpressionDetectSwitch(Boolean bool) {
        if (bool == null) {
            return;
        }
        this.isActiveSwitch = bool;
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111947k(bool.booleanValue());
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setFaceEyeScale(Float f) {
        if (f == null) {
            return;
        }
        this.mFaceEyeScale = f;
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111954v(f.floatValue());
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setFaceThinScale(Float f) {
        if (f == null) {
            return;
        }
        this.mFaceThinScale = f;
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo111950q(f.floatValue());
        }
    }

    public void setForceChangeAudioRouter(boolean z, boolean z2) {
        if (z) {
            this.mAudioRoteoverrideDefault = 1;
        } else {
            this.mAudioRoteoverrideDefault = 0;
        }
        this.mUsingVoip = z2;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109276E1(z, z2);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setHost(boolean z) {
        this.mrCodecParameters.f164227h1 = z;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setLandMode(boolean z) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21154O(z);
            this.moduleRegister.mo21170p(this.mrCodecParameters);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setLocalMergeSei(String str) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107894I1(str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setLogUploadCallBack(int i, int i2, MediaReportLogManager.LogUploadCallBack logUploadCallBack) {
        this.mLogUploadCallBack = logUploadCallBack;
        this.mLogReportInterval = i;
        this.mLogReportCount = i2;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setMasterAudioLevel(float f) {
        this.mMasterAudioLevel = f;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109313g0(f);
        }
    }

    public void setMediaCfgParams(brx brxVar) {
        this.mMediaCfgParams = brxVar;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setMediaCodecEnable(boolean z) {
        ror rorVar = this.mrCodecParameters;
        if (z) {
            rorVar.f180156A0 = MomoPipeline.DecodeType.HARD_DECODE;
        } else {
            rorVar.f180156A0 = MomoPipeline.DecodeType.SOFT_DECODE;
        }
    }

    public void setMergePosition(pvl pvlVar, String str, float f, float f2, float f3, float f4, float f5, int i) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21177w(pvlVar, str, f, f2, f3, f4, f5, i);
        }
    }

    public void setMusicPath(String str, String str2) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21081F(str, str2);
        }
    }

    public void setMusicPitch(int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.setMusicPitch(i);
        }
    }

    public void setMusicVolume(float f) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.setMusicVolume(f);
        }
    }

    public void setNsStatus(boolean z, int i) {
        this.mNsStatus = z;
        this.mNsmode = i;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109320j1(z, i);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setOnErrorListener(ijkMediaStreamer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setOnInfoListener(ijkMediaStreamer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    public void setOnRecordScreenErrorListener(ijkMediaStreamer.onRecordScreenErrorListener onrecordscreenerrorlistener) {
        this.mOnRecordScreenErrorListener = onrecordscreenerrorlistener;
    }

    public void setOnRecordSuccessListener(ijkMediaStreamer.onRecordSuccessListener onrecordsuccesslistener) {
        this.mOnRecordSuccessListener = onrecordsuccesslistener;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setOnRtcStatusListener(ijkMediaStreamer.OnRtcStatusListener onRtcStatusListener) {
        this.mOnRtcStatusListener = onRtcStatusListener;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setOnSurroundMusicStatusListener(ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener) {
        this.mSurroundMusicStatusListener = onSurroundMusicStatusListener;
        this.surroundMusicExt.mo21082G1(new C3918j());
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setParameters(String str) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109334v(str);
        } else {
            this.mConfParameters.add(str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPcmDataCallback(SinkBase.PcmDateCallback pcmDateCallback) {
        this.mPcmDateCallback = pcmDateCallback;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar == null || pcmDateCallback == null) {
            return;
        }
        hwlVar.mo109296R(new C3919k());
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPlayBackAudioLevel(float f) {
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPlayerStateCallback(OnPlayerStateCallback onPlayerStateCallback) {
        this.mPlayerStateCallback = onPlayerStateCallback;
        lvl lvlVar = this.ijkInputPipline;
        if (lvlVar != null) {
            lvlVar.mo155995f(onPlayerStateCallback);
        }
    }

    public void setPreviewDisplay(Object obj) {
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            this.mSurface = obj;
            this.mPauseRending = false;
            cqlVar.mo136016K();
            this.cameraInputPipline.mo136014C(obj);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPreviewSize(int i, int i2) {
        this.mVisualWeigh = i;
        this.mVisualHeight = i2;
        initFilterCoreParameters();
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21167m(this.mrCodecParameters);
        }
        b7y.m102882c().m102888g("ijkconf setPreviewSize", "width:" + i + ",height:" + i2);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPreviewSizeSetListener(ijkMediaStreamer.OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener) {
        this.mPreviewSizeSetListener = onVideoPreviewSizeSetListener;
    }

    public void setProvider(int i) {
        setBusinessType(i);
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107892H(i);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRecordDateCallback(SinkBase.RecordDateCallback recordDateCallback) {
        this.mRecordDateCallback = recordDateCallback;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar == null || recordDateCallback == null) {
            return;
        }
        hwlVar.mo109296R(new C3917i());
    }

    public void setRecordFileListener(l6m.InterfaceC18358a interfaceC18358a) {
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo107890C1(interfaceC18358a);
        }
    }

    public void setRecordPcmDataCallback(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.mRecordPcmDataCallback = pcmdataavailablecallback;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107919m1(pcmdataavailablecallback);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRole(int i) {
        this.mClientRole = i;
        b7y.m102882c().m102888g("setRole", "role:" + i);
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109271D(this.mClientRole);
        }
    }

    public void setRoom24hMode(boolean z) {
        this.mRoom24hMode = z;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109328q1(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRoomMode(int i) {
        hwl hwlVar;
        this.mRoomMode = i;
        if (i == -1 || (hwlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        hwlVar.mo109311c1(i, this.mUseServerAudioMixer);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRoomType(int i) {
        this.mRoomtype = i;
    }

    public void setRtcEventHandlerAdapter(kod0 kod0Var) {
        this.mRtcEventHandlerAdapter = kod0Var;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109321j2(kod0Var);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRtmpPath(String str) {
        this.mrCodecParameters.f180187v0 = str;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setScreenOnWhilePublishing(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            this.mScreenOnWhilePlaying = z;
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setSei(String str) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107895J(str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setSessionID(long j) {
        this.mrCodecParameters.f164229j1 = j;
    }

    public void setSimpleMediaLogsUpload(int i, int i2, fpf0 fpf0Var) {
        if (this.moduleRegister != null) {
            csx.m112235R().m112383s1(false);
            this.moduleRegister.mo21163i(i, i2, fpf0Var);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setSlaveAudioLevel(float f) {
        this.mSlaveAudioLevel = f;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21100W1(f);
        }
        lvl lvlVar = this.ijkInputPipline;
        if (lvlVar != null) {
            lvlVar.setVolume(this.mSlaveAudioLevel);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setStreamerType(int i, String str) {
        this.mOutFileType = i;
        this.mOutputFilePath = str;
        this.mrCodecParameters.f180187v0 = str;
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo107925p0(i, str);
        }
    }

    public void setTargetVideoSize(int i, int i2) {
        this.mTargetVideoWidth = i;
        this.mTargetVideoHeight = i2;
        this.mrConfig.m182455H(new erf0(i, i2));
        setCameraCutSize(this.mTargetVideoWidth, this.mTargetVideoHeight);
        b7y.m102882c().m102888g("ijkconf setTargetVideoSize", "width:" + i + ",height:" + i2);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setUserID(int i) {
        ror rorVar = this.mrCodecParameters;
        rorVar.f164228i1 = i;
        rorVar.f180157B0 = i;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setUserSig(String str) {
        ror rorVar = this.mrCodecParameters;
        if (rorVar != null) {
            rorVar.f180158C0 = str;
        }
    }

    public void setVenderID(int i) {
        this.mVenderID = i;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoChannelListener(ebl0 ebl0Var) {
        this.mVideoChannelListener = ebl0Var;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109326m0(ebl0Var);
        }
    }

    public void setVideoChannelListenerExt(hwl.InterfaceC17586a interfaceC17586a) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109289M1(null);
        }
    }

    public void setVideoChannelTextureViewListener(gbl0 gbl0Var) {
        this.mTextureViewListener = gbl0Var;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109293P0(gbl0Var);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoCodeFrameRate(int i) {
        this.mVideoCodecRate = i;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoEncodingBitRate(int i) {
        this.mVideoBitRate = i;
        ror rorVar = this.mrCodecParameters;
        if (rorVar == null || i == rorVar.f175451H) {
            return;
        }
        initFilterCoreParameters();
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107900S0(this.mrCodecParameters);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoMixerBackgroundImgUrl(String str) {
        this.mBackgroundImgUrl = str;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar == null || str == null) {
            return;
        }
        hwlVar.mo109268B(str);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoQualityParameters(boolean z) {
        this.mVideoQualityFlg = z;
        if (getAgoraEngine() != null) {
            getAgoraEngine().setVideoQualityParameters(this.mVideoQualityFlg);
        }
    }

    public void setVideoTextureListener(gkl0 gkl0Var) {
        this.mVideoTextureListener = gkl0Var;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVoicebackwardsEnable(boolean z) {
        this.mVoicebackwardsEnable = z;
        b7y.m102882c().m102888g("setVoicebackwardsEnable:" + z);
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21135z(z);
        }
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo21135z(true);
        }
    }

    public void setVolumeOfEffects(int i, double d) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109287M(i, d);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setWarpType(Integer num) {
        if (num == null) {
            return;
        }
        this.warpType = num;
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.setWarpType(num.intValue());
        }
    }

    public void setWeilaCodecStatus(boolean z, boolean z2) {
        csx.m112235R().m112320b2(z2 ? 1 : 0);
        csx.m112235R().m112324c2(z ? 1 : 0);
    }

    public void startPlayMusic(long j) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21128v1(j);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void startPreview(String str, Object obj) {
        oq70.m168791d().m168795c("pip->PIPLINE2", "startPreview: HavaSelect=" + this.mHavaSelectFile + ";file=" + str + com.meituan.robust.Constants.PACKNAME_END + this.mSurface + "--->" + obj);
        b7y b7yVarM102882c = b7y.m102882c();
        StringBuilder sb = new StringBuilder("file:");
        sb.append(str);
        b7yVarM102882c.m102888g("startPreview", sb.toString());
        this.mSurface = obj;
        if (this.mHavaSelectFile && this.ijkInputPipline != null && this.mrCodecParameters.f180189x0.equals(str)) {
            this.ijkInputPipline.mo136016K();
            this.ijkInputPipline.mo136015J(obj);
            return;
        }
        this.mrCodecParameters.f180189x0 = str;
        this.mHavaSelectFile = true;
        initFilterCoreParameters();
        lvl lvlVar = this.ijkInputPipline;
        if (lvlVar != null && !this.mSelectFileStop) {
            this.mSelectFileStop = true;
            lvlVar.mo109166G();
            this.moduleRegister.mo21141B(this.ijkInputPipline);
        }
        this.ijkInputPipline = this.moduleRegister.mo21172r(3, false, this.mMediaCfgParams);
        boolean z = this.mEnableSwitchAudioTrack;
        if (z) {
            openAudioTracks(z);
            setAudioTrackIndex(this.mActiveAudioTrack);
        }
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        ror rorVar = this.mrCodecParameters;
        int i = rorVar.f175510u;
        int i2 = rorVar.f175511v;
        momoPipelineModuleRegister.mo21175u(i, i2, i, i2, true);
        setPlayerStateCallback(this.mPlayerStateCallback);
        setExtAudioParameters(this.mAudio_channe_frq, this.mAudio_channe, this.mAudio_channe_layout);
        this.ijkInputPipline.mo136017i(obj);
        this.ijkInputPipline.mo155999y(this.surroundMusicExt);
        this.mSelectFileStop = false;
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109296R(new C3920l());
        }
        oq70.m168791d().m168795c("pip->PIPLINE2", "startPreview: end");
    }

    public void startPreviewEx(int i, Object obj) {
        this.mSurface = obj;
        if (this.mHavaSelectCamera && this.cameraInputPipline != null) {
            initFilterCoreParameters();
            this.moduleRegister.mo21176v(this.mrCodecParameters);
            this.cameraInputPipline.mo136016K();
            this.cameraInputPipline.mo136015J(obj);
            this.mPauseRending = false;
            return;
        }
        if (obj == null && this.cameraInputPipline == null) {
            return;
        }
        this.mHavaSelectCamera = true;
        this.mCameraID = i;
        initFilterCoreParameters();
        int i2 = this.mCameraID;
        row rowVar = this.mrConfig;
        if (i2 == 0) {
            rowVar.m182478q(0);
        } else {
            rowVar.m182478q(1);
        }
        this.cameraInputPipline = this.moduleRegister.mo21144E(this.mrConfig, new qv40());
        this.moduleRegister.mo21176v(this.mrCodecParameters);
        setWarpType(this.warpType);
        setFaceEyeScale(this.mFaceEyeScale);
        setFaceThinScale(this.mFaceThinScale);
        setFaceBeautiful(this.faceBeautiful);
        setFaceExpressionDetectSwitch(this.isActiveSwitch);
        this.cameraInputPipline.mo111936T(true);
        this.cameraInputPipline.mo136017i(obj);
        jt2 jt2Var = this.mBasicFilter;
        if (jt2Var != null) {
            selectFilter(jt2Var);
        }
    }

    public void startRecordFile(String str, String str2) {
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo107933y(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:49:0x0198  */
    /* JADX WARN: Code duplicated, block: B:51:0x019c  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0235  */
    /* JADX WARN: Code duplicated, block: B:65:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x023d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0246 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0248  */
    /* JADX WARN: Code duplicated, block: B:71:0x024a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0252  */
    /* JADX WARN: Code duplicated, block: B:80:0x026f  */
    public void startRecordWithNotJoinRoom(brx brxVar) {
        arx.C15814d c15814dM99797h;
        boolean z;
        int i;
        MomoPipelineModuleRegister momoPipelineModuleRegister;
        MomoPipelineModuleRegister.LinkType linkType;
        hwl hwlVarMo21152M;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM112326d0;
        int iM112330e0;
        bsx bsxVar;
        boolean z2;
        int i6;
        int iM112326d1;
        int iM112330e1;
        bsx bsxVar2;
        bsx bsxVar3;
        oq70.m168791d().m168795c("zjlfound", "----startRecording");
        if (this.mRecording) {
            return;
        }
        this.moduleRegister.mo21179y(this.mrCodecParameters);
        if (this.cameraInputPipline == null) {
            this.emptyInputPipline = this.moduleRegister.mo21151L();
        }
        if (brxVar != null && !TextUtils.isEmpty(brxVar.m106170b())) {
            setBusinessType(brxVar.m106174f());
            c15814dM99797h = arx.m99789d().m99797h(brxVar.m106170b());
            if (c15814dM99797h != null && (bsxVar3 = c15814dM99797h.f73012e) != null && bsxVar3.f78251b == 0) {
                z = false;
            }
            if (!z) {
                brxVar = null;
            }
            i = this.mVenderID;
            momoPipelineModuleRegister = this.moduleRegister;
            if (i == 0) {
                zzl zzlVarMo21155P = momoPipelineModuleRegister.mo21155P(brxVar);
                this.momoPusherPipeline = zzlVarMo21155P;
                zzlVarMo21155P.mo109296R(new C3911c());
                this.momoPusherPipeline.mo107930u0(this.mOnlyAudio);
                this.momoPusherPipeline.mo107901T0(this.mBusinessType);
                muteLocalAudioStream(this.mLocalAudioStreamMute);
                addMRtcAudioHandler(this.mRtcAudioHandler);
                addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
                setStreamerType(this.mOutFileType, this.mOutputFilePath);
                if (z && c15814dM99797h != null) {
                    iM112326d1 = csx.m112235R().m112326d0();
                    iM112330e1 = csx.m112235R().m112330e0();
                    bsxVar2 = c15814dM99797h.f73012e;
                    if (bsxVar2 != null) {
                        iM112326d1 = bsxVar2.f78281l;
                        iM112330e1 = bsxVar2.f78278k;
                    }
                    this.momoPusherPipeline.mo107915i(iM112326d1, iM112330e1, new fpf0());
                }
                this.momoPusherPipeline.mo107927t0();
                this.momoPusherPipeline.mo107926t(this.mLogReportInterval);
                this.momoPusherPipeline.mo107921n(this.mLogReportCount);
            } else {
                if (i == 2) {
                    linkType = MomoPipelineModuleRegister.LinkType.WEILALINK;
                } else if (i == 1) {
                    linkType = MomoPipelineModuleRegister.LinkType.AGORALINK;
                } else if (i == 4) {
                    linkType = MomoPipelineModuleRegister.LinkType.MOMORTCLINK;
                } else {
                    linkType = MomoPipelineModuleRegister.LinkType.TXLINK;
                }
                hwlVarMo21152M = momoPipelineModuleRegister.mo21152M(linkType, this.mAppID, brxVar);
                this.linkMicPusherPipeline = hwlVarMo21152M;
                if (hwlVarMo21152M == null) {
                    return;
                }
                enableVbr(this.enableVbr);
                this.linkMicPusherPipeline.mo109326m0(this.mVideoChannelListener);
                this.linkMicPusherPipeline.mo109330r1(this.mVideoTextureListener);
                i2 = this.mRoomMode;
                if (i2 != -1) {
                    this.linkMicPusherPipeline.mo109311c1(i2, this.mUseServerAudioMixer);
                }
                this.linkMicPusherPipeline.mo107926t(this.mLogReportInterval);
                this.linkMicPusherPipeline.mo107921n(this.mLogReportCount);
                this.linkMicPusherPipeline.mo107930u0(this.mOnlyAudio);
                this.linkMicPusherPipeline.mo107928t1(this.mAvFlag);
                this.linkMicPusherPipeline.mo107901T0(this.mBusinessType);
                setRole(this.mClientRole);
                enableExternStream(this.mEnableExternStream);
                enableCommMode(this.mCommMode);
                setChannelkey(this.mChannelkey);
                setEncryptionSecret(this.mEncryptionSecret);
                setEncryptionMode(this.mEncryptionMode);
                addMRtcAudioHandler(this.mRtcAudioHandler);
                addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
                muteAllRemoteAudioStream(this.mAllRemoteAudioStream);
                muteLocalAudioStreamEx(this.mLocalAudioStreamMute);
                muteLocalVideoStream(this.mLocalVideoStreamMute);
                addEventHandler(this.mRtcEventHandler);
                addMRtcConnectHandler(this.mRtcConnectHandler);
                addMRtcVideoLossHandler(null);
                addMRtcChannelHandler(this.mRtcChannelHandler);
                addMRtcStatsUpdataHandle(null);
                addMRtcLRemoteStatsUpdataHandle(this.mRtcLRemoteStatsUpdataHandle);
                addMRtcAudioStatsUpdataHandler(null);
                addMRtcAnchorStatusHandle(null);
                addMRtcQualityHandler(this.mRtcQualityHandler);
                addMRtcSurroundMusicHander(this.mRtcSurroundMusicHander);
                addExitRoomHandler(this.mRtcExitRoomHandler);
                this.mRoomMode = -1;
                if (!this.mAudioProfileStatus) {
                    i6 = this.mVenderID;
                    if (i6 == 1) {
                        if (this.mAudioHighQualityFlg) {
                            this.mAudioProfile = 4;
                            this.mAudioScenario = 0;
                        } else {
                            this.mAudioProfile = 0;
                            this.mAudioScenario = 0;
                        }
                    } else if (i6 == 2) {
                        if (this.mAudioHighQualityFlg) {
                            this.mAudioProfile = 4;
                        } else {
                            this.mAudioProfile = 1;
                        }
                        this.mAudioScenario = 0;
                    }
                    oq70.m168791d().m168795c("newAudio", "----startRecording:Audio Profile:" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus);
                }
                setAudioProfile(this.mAudioProfile, this.mAudioScenario);
                setVideoQualityParameters(this.mVideoQualityFlg);
                setParameters_i(this.mConfParameters);
                this.linkMicPusherPipeline.mo109272D0(this.mDefaultAudioRoutetoSpeakerphone);
                enableAudio(this.mEnableAudio);
                enableVideo(this.mEnableVideo);
                setRoom24hMode(this.mRoom24hMode);
                enableConfLog(this.mLinkMicLogEnable, this.mLinkMicLogPath);
                enableMulPusherInRoom(this.mEnableMulPusherInRoom);
                setVideoMixerBackgroundImgUrl(this.mBackgroundImgUrl);
                setRecordPcmDataCallback(this.mRecordPcmDataCallback);
                i3 = this.mAudioRoteoverrideDefault;
                if (i3 == 1) {
                    setForceChangeAudioRouter(true, this.mUsingVoip);
                } else if (i3 == 0) {
                    setForceChangeAudioRouter(false, this.mUsingVoip);
                }
                i4 = this.mEnableWebSdkInteroperability;
                if (i4 != -1) {
                    if (i4 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    enableWebSdkInteroperability(z2);
                }
                i5 = this.mNsmode;
                if (i5 > 0) {
                    setNsStatus(this.mNsStatus, i5);
                }
                if (z && c15814dM99797h != null) {
                    iM112326d0 = csx.m112235R().m112326d0();
                    iM112330e0 = csx.m112235R().m112330e0();
                    bsxVar = c15814dM99797h.f73012e;
                    if (bsxVar != null) {
                        iM112326d0 = bsxVar.f78281l;
                        iM112330e0 = bsxVar.f78278k;
                    }
                    this.linkMicPusherPipeline.mo107915i(iM112326d0, iM112330e0, new fpf0());
                }
                csx.m112235R().m112315a1(0);
                this.linkMicPusherPipeline.mo109297S(this.enableAudioStrero);
                this.linkMicPusherPipeline.mo107916k0();
            }
            setSlaveAudioLevel(this.mSlaveAudioLevel);
            setMasterAudioLevel(this.mMasterAudioLevel);
            setVoicebackwardsEnable(this.mVoicebackwardsEnable);
            ignoreMonitor(this.mIgnoreMonitor);
            setCustZoomFlag(this.mCusZoomFlag);
            setPcmDataCallback(this.mPcmDateCallback);
            this.mRecording = true;
        }
        c15814dM99797h = null;
        z = true;
        if (!z) {
            brxVar = null;
        }
        i = this.mVenderID;
        momoPipelineModuleRegister = this.moduleRegister;
        if (i == 0) {
            zzl zzlVarMo21155P2 = momoPipelineModuleRegister.mo21155P(brxVar);
            this.momoPusherPipeline = zzlVarMo21155P2;
            zzlVarMo21155P2.mo109296R(new C3911c());
            this.momoPusherPipeline.mo107930u0(this.mOnlyAudio);
            this.momoPusherPipeline.mo107901T0(this.mBusinessType);
            muteLocalAudioStream(this.mLocalAudioStreamMute);
            addMRtcAudioHandler(this.mRtcAudioHandler);
            addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
            setStreamerType(this.mOutFileType, this.mOutputFilePath);
            if (z) {
                iM112326d1 = csx.m112235R().m112326d0();
                iM112330e1 = csx.m112235R().m112330e0();
                bsxVar2 = c15814dM99797h.f73012e;
                if (bsxVar2 != null) {
                    iM112326d1 = bsxVar2.f78281l;
                    iM112330e1 = bsxVar2.f78278k;
                }
                this.momoPusherPipeline.mo107915i(iM112326d1, iM112330e1, new fpf0());
            }
            this.momoPusherPipeline.mo107927t0();
            this.momoPusherPipeline.mo107926t(this.mLogReportInterval);
            this.momoPusherPipeline.mo107921n(this.mLogReportCount);
        } else {
            if (i == 2) {
                linkType = MomoPipelineModuleRegister.LinkType.WEILALINK;
            } else if (i == 1) {
                linkType = MomoPipelineModuleRegister.LinkType.AGORALINK;
            } else if (i == 4) {
                linkType = MomoPipelineModuleRegister.LinkType.MOMORTCLINK;
            } else {
                linkType = MomoPipelineModuleRegister.LinkType.TXLINK;
            }
            hwlVarMo21152M = momoPipelineModuleRegister.mo21152M(linkType, this.mAppID, brxVar);
            this.linkMicPusherPipeline = hwlVarMo21152M;
            if (hwlVarMo21152M == null) {
                return;
            }
            enableVbr(this.enableVbr);
            this.linkMicPusherPipeline.mo109326m0(this.mVideoChannelListener);
            this.linkMicPusherPipeline.mo109330r1(this.mVideoTextureListener);
            i2 = this.mRoomMode;
            if (i2 != -1) {
                this.linkMicPusherPipeline.mo109311c1(i2, this.mUseServerAudioMixer);
            }
            this.linkMicPusherPipeline.mo107926t(this.mLogReportInterval);
            this.linkMicPusherPipeline.mo107921n(this.mLogReportCount);
            this.linkMicPusherPipeline.mo107930u0(this.mOnlyAudio);
            this.linkMicPusherPipeline.mo107928t1(this.mAvFlag);
            this.linkMicPusherPipeline.mo107901T0(this.mBusinessType);
            setRole(this.mClientRole);
            enableExternStream(this.mEnableExternStream);
            enableCommMode(this.mCommMode);
            setChannelkey(this.mChannelkey);
            setEncryptionSecret(this.mEncryptionSecret);
            setEncryptionMode(this.mEncryptionMode);
            addMRtcAudioHandler(this.mRtcAudioHandler);
            addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
            muteAllRemoteAudioStream(this.mAllRemoteAudioStream);
            muteLocalAudioStreamEx(this.mLocalAudioStreamMute);
            muteLocalVideoStream(this.mLocalVideoStreamMute);
            addEventHandler(this.mRtcEventHandler);
            addMRtcConnectHandler(this.mRtcConnectHandler);
            addMRtcVideoLossHandler(null);
            addMRtcChannelHandler(this.mRtcChannelHandler);
            addMRtcStatsUpdataHandle(null);
            addMRtcLRemoteStatsUpdataHandle(this.mRtcLRemoteStatsUpdataHandle);
            addMRtcAudioStatsUpdataHandler(null);
            addMRtcAnchorStatusHandle(null);
            addMRtcQualityHandler(this.mRtcQualityHandler);
            addMRtcSurroundMusicHander(this.mRtcSurroundMusicHander);
            addExitRoomHandler(this.mRtcExitRoomHandler);
            this.mRoomMode = -1;
            if (!this.mAudioProfileStatus) {
                i6 = this.mVenderID;
                if (i6 == 1) {
                    if (this.mAudioHighQualityFlg) {
                        this.mAudioProfile = 4;
                        this.mAudioScenario = 0;
                    } else {
                        this.mAudioProfile = 0;
                        this.mAudioScenario = 0;
                    }
                } else if (i6 == 2) {
                    if (this.mAudioHighQualityFlg) {
                        this.mAudioProfile = 4;
                    } else {
                        this.mAudioProfile = 1;
                    }
                    this.mAudioScenario = 0;
                }
                oq70.m168791d().m168795c("newAudio", "----startRecording:Audio Profile:" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus);
            }
            setAudioProfile(this.mAudioProfile, this.mAudioScenario);
            setVideoQualityParameters(this.mVideoQualityFlg);
            setParameters_i(this.mConfParameters);
            this.linkMicPusherPipeline.mo109272D0(this.mDefaultAudioRoutetoSpeakerphone);
            enableAudio(this.mEnableAudio);
            enableVideo(this.mEnableVideo);
            setRoom24hMode(this.mRoom24hMode);
            enableConfLog(this.mLinkMicLogEnable, this.mLinkMicLogPath);
            enableMulPusherInRoom(this.mEnableMulPusherInRoom);
            setVideoMixerBackgroundImgUrl(this.mBackgroundImgUrl);
            setRecordPcmDataCallback(this.mRecordPcmDataCallback);
            i3 = this.mAudioRoteoverrideDefault;
            if (i3 == 1) {
                setForceChangeAudioRouter(true, this.mUsingVoip);
            } else if (i3 == 0) {
                setForceChangeAudioRouter(false, this.mUsingVoip);
            }
            i4 = this.mEnableWebSdkInteroperability;
            if (i4 != -1) {
                if (i4 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                enableWebSdkInteroperability(z2);
            }
            i5 = this.mNsmode;
            if (i5 > 0) {
                setNsStatus(this.mNsStatus, i5);
            }
            if (z) {
                iM112326d0 = csx.m112235R().m112326d0();
                iM112330e0 = csx.m112235R().m112330e0();
                bsxVar = c15814dM99797h.f73012e;
                if (bsxVar != null) {
                    iM112326d0 = bsxVar.f78281l;
                    iM112330e0 = bsxVar.f78278k;
                }
                this.linkMicPusherPipeline.mo107915i(iM112326d0, iM112330e0, new fpf0());
            }
            csx.m112235R().m112315a1(0);
            this.linkMicPusherPipeline.mo109297S(this.enableAudioStrero);
            this.linkMicPusherPipeline.mo107916k0();
        }
        setSlaveAudioLevel(this.mSlaveAudioLevel);
        setMasterAudioLevel(this.mMasterAudioLevel);
        setVoicebackwardsEnable(this.mVoicebackwardsEnable);
        ignoreMonitor(this.mIgnoreMonitor);
        setCustZoomFlag(this.mCusZoomFlag);
        setPcmDataCallback(this.mPcmDateCallback);
        this.mRecording = true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0115 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ab A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01af A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01b3 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bf A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c3 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01c6 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x024a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0252 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x025d  */
    /* JADX WARN: Code duplicated, block: B:78:0x025f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0267 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0284 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0003, B:10:0x0019, B:12:0x0023, B:14:0x0038, B:16:0x003c, B:25:0x004c, B:27:0x0057, B:28:0x005f, B:31:0x0065, B:34:0x0077, B:36:0x008b, B:37:0x008f, B:38:0x0099, B:90:0x02a5, B:41:0x00d6, B:47:0x00e5, B:51:0x00f1, B:53:0x0115, B:54:0x011c, B:56:0x01ab, B:58:0x01af, B:60:0x01b3, B:68:0x01ca, B:61:0x01b8, B:63:0x01bf, B:65:0x01c3, B:67:0x01c8, B:66:0x01c6, B:69:0x0209, B:71:0x024a, B:74:0x0257, B:79:0x0260, B:80:0x0263, B:82:0x0267, B:85:0x0270, B:87:0x0284, B:88:0x0288, B:89:0x0292, B:73:0x0252, B:43:0x00db, B:45:0x00e0, B:46:0x00e3), top: B:95:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00ef, please report this as an issue */
    public synchronized void startRecording(brx brxVar) {
        arx.C15814d c15814dM99797h;
        boolean z;
        int i;
        MomoPipelineModuleRegister momoPipelineModuleRegister;
        MomoPipelineModuleRegister.LinkType linkType;
        hwl hwlVarMo21152M;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM112326d0;
        int iM112330e0;
        bsx bsxVar;
        boolean z2;
        int i6;
        int iM112326d1;
        int iM112330e1;
        bsx bsxVar2;
        bsx bsxVar3;
        try {
            oq70.m168791d().m168795c("zjlfound", "----startRecording");
            if (this.mRecording) {
                return;
            }
            if (brxVar != null && !TextUtils.isEmpty(brxVar.m106170b())) {
                setBusinessType(brxVar.m106174f());
                c15814dM99797h = arx.m99789d().m99797h(brxVar.m106170b());
                if (c15814dM99797h != null && (bsxVar3 = c15814dM99797h.f73012e) != null && bsxVar3.f78251b == 0) {
                    z = false;
                }
                if (!z) {
                    brxVar = null;
                }
                this.moduleRegister.mo21179y(this.mrCodecParameters);
                if (this.cameraInputPipline == null) {
                    this.emptyInputPipline = this.moduleRegister.mo21151L();
                }
                i = this.mVenderID;
                momoPipelineModuleRegister = this.moduleRegister;
                if (i == 0) {
                    zzl zzlVarMo21155P = momoPipelineModuleRegister.mo21155P(brxVar);
                    this.momoPusherPipeline = zzlVarMo21155P;
                    zzlVarMo21155P.mo109296R(new C3910b());
                    if (z && c15814dM99797h != null) {
                        iM112326d1 = csx.m112235R().m112326d0();
                        iM112330e1 = csx.m112235R().m112330e0();
                        bsxVar2 = c15814dM99797h.f73012e;
                        if (bsxVar2 != null) {
                            iM112326d1 = bsxVar2.f78281l;
                            iM112330e1 = bsxVar2.f78278k;
                        }
                        this.momoPusherPipeline.mo107915i(iM112326d1, iM112330e1, new fpf0());
                    }
                    this.momoPusherPipeline.mo107930u0(this.mOnlyAudio);
                    this.momoPusherPipeline.mo107901T0(this.mBusinessType);
                    muteLocalAudioStream(this.mLocalAudioStreamMute);
                    addMRtcAudioHandler(this.mRtcAudioHandler);
                    addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
                    setStreamerType(this.mOutFileType, this.mOutputFilePath);
                    this.momoPusherPipeline.mo107927t0();
                    this.momoPusherPipeline.mo107926t(this.mLogReportInterval);
                    this.momoPusherPipeline.mo107921n(this.mLogReportCount);
                } else {
                    if (i == 2) {
                        linkType = MomoPipelineModuleRegister.LinkType.WEILALINK;
                    } else if (i == 1) {
                        linkType = MomoPipelineModuleRegister.LinkType.AGORALINK;
                    } else if (i == 4) {
                        linkType = MomoPipelineModuleRegister.LinkType.MOMORTCLINK;
                    } else {
                        linkType = MomoPipelineModuleRegister.LinkType.TXLINK;
                    }
                    hwlVarMo21152M = momoPipelineModuleRegister.mo21152M(linkType, this.mAppID, brxVar);
                    this.linkMicPusherPipeline = hwlVarMo21152M;
                    if (hwlVarMo21152M == null) {
                        return;
                    }
                    enableVbr(this.enableVbr);
                    this.linkMicPusherPipeline.mo109326m0(this.mVideoChannelListener);
                    this.linkMicPusherPipeline.mo109330r1(this.mVideoTextureListener);
                    this.linkMicPusherPipeline.mo109293P0(this.mTextureViewListener);
                    this.linkMicPusherPipeline.mo109289M1(null);
                    i2 = this.mRoomMode;
                    if (i2 != -1) {
                        this.linkMicPusherPipeline.mo109311c1(i2, this.mUseServerAudioMixer);
                    }
                    this.linkMicPusherPipeline.mo107926t(this.mLogReportInterval);
                    this.linkMicPusherPipeline.mo107921n(this.mLogReportCount);
                    this.linkMicPusherPipeline.mo107930u0(this.mOnlyAudio);
                    this.linkMicPusherPipeline.mo107928t1(this.mAvFlag);
                    this.linkMicPusherPipeline.mo107901T0(this.mBusinessType);
                    setRole(this.mClientRole);
                    enableExternStream(this.mEnableExternStream);
                    enableCommMode(this.mCommMode);
                    setChannelkey(this.mChannelkey);
                    setEncryptionSecret(this.mEncryptionSecret);
                    setEncryptionMode(this.mEncryptionMode);
                    addMRtcAudioHandler(this.mRtcAudioHandler);
                    addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
                    muteAllRemoteAudioStream(this.mAllRemoteAudioStream);
                    muteLocalAudioStreamEx(this.mLocalAudioStreamMute);
                    muteLocalVideoStream(this.mLocalVideoStreamMute);
                    addEventHandler(this.mRtcEventHandler);
                    addMRtcConnectHandler(this.mRtcConnectHandler);
                    setRtcEventHandlerAdapter(this.mRtcEventHandlerAdapter);
                    addMRtcVideoLossHandler(null);
                    addMRtcChannelHandler(this.mRtcChannelHandler);
                    addMRtcStatsUpdataHandle(null);
                    addMRtcLRemoteStatsUpdataHandle(this.mRtcLRemoteStatsUpdataHandle);
                    addMRtcAudioStatsUpdataHandler(null);
                    addMRtcAnchorStatusHandle(null);
                    addMRtcQualityHandler(this.mRtcQualityHandler);
                    addMRtcSurroundMusicHander(this.mRtcSurroundMusicHander);
                    this.mRoomMode = -1;
                    if (!this.mAudioProfileStatus) {
                        i6 = this.mVenderID;
                        if (i6 == 1) {
                            if (this.mAudioHighQualityFlg) {
                                this.mAudioProfile = 4;
                                this.mAudioScenario = 0;
                            } else {
                                this.mAudioProfile = 0;
                                this.mAudioScenario = 0;
                            }
                        } else if (i6 == 2) {
                            if (this.mAudioHighQualityFlg) {
                                this.mAudioProfile = 4;
                            } else {
                                this.mAudioProfile = 1;
                            }
                            this.mAudioScenario = 0;
                        }
                        oq70.m168791d().m168795c("newAudio", "----startRecording:Audio Profile:" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus);
                    }
                    setAudioProfile(this.mAudioProfile, this.mAudioScenario);
                    setVideoQualityParameters(this.mVideoQualityFlg);
                    setParameters_i(this.mConfParameters);
                    this.linkMicPusherPipeline.mo109272D0(this.mDefaultAudioRoutetoSpeakerphone);
                    enableAudio(this.mEnableAudio);
                    enableVideo(this.mEnableVideo);
                    setRoom24hMode(this.mRoom24hMode);
                    enableConfLog(this.mLinkMicLogEnable, this.mLinkMicLogPath);
                    enableMulPusherInRoom(this.mEnableMulPusherInRoom);
                    setVideoMixerBackgroundImgUrl(this.mBackgroundImgUrl);
                    setRecordPcmDataCallback(this.mRecordPcmDataCallback);
                    i3 = this.mAudioRoteoverrideDefault;
                    if (i3 == 1) {
                        setForceChangeAudioRouter(true, this.mUsingVoip);
                    } else if (i3 == 0) {
                        setForceChangeAudioRouter(false, this.mUsingVoip);
                    }
                    i4 = this.mEnableWebSdkInteroperability;
                    if (i4 != -1) {
                        if (i4 == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        enableWebSdkInteroperability(z2);
                    }
                    i5 = this.mNsmode;
                    if (i5 > 0) {
                        setNsStatus(this.mNsStatus, i5);
                    }
                    if (z && c15814dM99797h != null) {
                        iM112326d0 = csx.m112235R().m112326d0();
                        iM112330e0 = csx.m112235R().m112330e0();
                        bsxVar = c15814dM99797h.f73012e;
                        if (bsxVar != null) {
                            iM112326d0 = bsxVar.f78281l;
                            iM112330e0 = bsxVar.f78278k;
                        }
                        this.linkMicPusherPipeline.mo107915i(iM112326d0, iM112330e0, new fpf0());
                    }
                    csx.m112235R().m112315a1(0);
                    this.linkMicPusherPipeline.mo109297S(this.enableAudioStrero);
                    this.linkMicPusherPipeline.mo107927t0();
                }
                setSlaveAudioLevel(this.mSlaveAudioLevel);
                setMasterAudioLevel(this.mMasterAudioLevel);
                setVoicebackwardsEnable(this.mVoicebackwardsEnable);
                ignoreMonitor(this.mIgnoreMonitor);
                setCustZoomFlag(this.mCusZoomFlag);
                setPcmDataCallback(this.mPcmDateCallback);
                this.mRecording = true;
            }
            c15814dM99797h = null;
            z = true;
            if (!z) {
                brxVar = null;
            }
            this.moduleRegister.mo21179y(this.mrCodecParameters);
            if (this.cameraInputPipline == null) {
                this.emptyInputPipline = this.moduleRegister.mo21151L();
            }
            i = this.mVenderID;
            momoPipelineModuleRegister = this.moduleRegister;
            if (i == 0) {
                zzl zzlVarMo21155P2 = momoPipelineModuleRegister.mo21155P(brxVar);
                this.momoPusherPipeline = zzlVarMo21155P2;
                zzlVarMo21155P2.mo109296R(new C3910b());
                if (z) {
                    iM112326d1 = csx.m112235R().m112326d0();
                    iM112330e1 = csx.m112235R().m112330e0();
                    bsxVar2 = c15814dM99797h.f73012e;
                    if (bsxVar2 != null) {
                        iM112326d1 = bsxVar2.f78281l;
                        iM112330e1 = bsxVar2.f78278k;
                    }
                    this.momoPusherPipeline.mo107915i(iM112326d1, iM112330e1, new fpf0());
                }
                this.momoPusherPipeline.mo107930u0(this.mOnlyAudio);
                this.momoPusherPipeline.mo107901T0(this.mBusinessType);
                muteLocalAudioStream(this.mLocalAudioStreamMute);
                addMRtcAudioHandler(this.mRtcAudioHandler);
                addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
                setStreamerType(this.mOutFileType, this.mOutputFilePath);
                this.momoPusherPipeline.mo107927t0();
                this.momoPusherPipeline.mo107926t(this.mLogReportInterval);
                this.momoPusherPipeline.mo107921n(this.mLogReportCount);
            } else {
                if (i == 2) {
                    linkType = MomoPipelineModuleRegister.LinkType.WEILALINK;
                } else if (i == 1) {
                    linkType = MomoPipelineModuleRegister.LinkType.AGORALINK;
                } else if (i == 4) {
                    linkType = MomoPipelineModuleRegister.LinkType.MOMORTCLINK;
                } else {
                    linkType = MomoPipelineModuleRegister.LinkType.TXLINK;
                }
                hwlVarMo21152M = momoPipelineModuleRegister.mo21152M(linkType, this.mAppID, brxVar);
                this.linkMicPusherPipeline = hwlVarMo21152M;
                if (hwlVarMo21152M == null) {
                    return;
                }
                enableVbr(this.enableVbr);
                this.linkMicPusherPipeline.mo109326m0(this.mVideoChannelListener);
                this.linkMicPusherPipeline.mo109330r1(this.mVideoTextureListener);
                this.linkMicPusherPipeline.mo109293P0(this.mTextureViewListener);
                this.linkMicPusherPipeline.mo109289M1(null);
                i2 = this.mRoomMode;
                if (i2 != -1) {
                    this.linkMicPusherPipeline.mo109311c1(i2, this.mUseServerAudioMixer);
                }
                this.linkMicPusherPipeline.mo107926t(this.mLogReportInterval);
                this.linkMicPusherPipeline.mo107921n(this.mLogReportCount);
                this.linkMicPusherPipeline.mo107930u0(this.mOnlyAudio);
                this.linkMicPusherPipeline.mo107928t1(this.mAvFlag);
                this.linkMicPusherPipeline.mo107901T0(this.mBusinessType);
                setRole(this.mClientRole);
                enableExternStream(this.mEnableExternStream);
                enableCommMode(this.mCommMode);
                setChannelkey(this.mChannelkey);
                setEncryptionSecret(this.mEncryptionSecret);
                setEncryptionMode(this.mEncryptionMode);
                addMRtcAudioHandler(this.mRtcAudioHandler);
                addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
                muteAllRemoteAudioStream(this.mAllRemoteAudioStream);
                muteLocalAudioStreamEx(this.mLocalAudioStreamMute);
                muteLocalVideoStream(this.mLocalVideoStreamMute);
                addEventHandler(this.mRtcEventHandler);
                addMRtcConnectHandler(this.mRtcConnectHandler);
                setRtcEventHandlerAdapter(this.mRtcEventHandlerAdapter);
                addMRtcVideoLossHandler(null);
                addMRtcChannelHandler(this.mRtcChannelHandler);
                addMRtcStatsUpdataHandle(null);
                addMRtcLRemoteStatsUpdataHandle(this.mRtcLRemoteStatsUpdataHandle);
                addMRtcAudioStatsUpdataHandler(null);
                addMRtcAnchorStatusHandle(null);
                addMRtcQualityHandler(this.mRtcQualityHandler);
                addMRtcSurroundMusicHander(this.mRtcSurroundMusicHander);
                this.mRoomMode = -1;
                if (!this.mAudioProfileStatus) {
                    i6 = this.mVenderID;
                    if (i6 == 1) {
                        if (this.mAudioHighQualityFlg) {
                            this.mAudioProfile = 4;
                            this.mAudioScenario = 0;
                        } else {
                            this.mAudioProfile = 0;
                            this.mAudioScenario = 0;
                        }
                    } else if (i6 == 2) {
                        if (this.mAudioHighQualityFlg) {
                            this.mAudioProfile = 4;
                        } else {
                            this.mAudioProfile = 1;
                        }
                        this.mAudioScenario = 0;
                    }
                    oq70.m168791d().m168795c("newAudio", "----startRecording:Audio Profile:" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus);
                }
                setAudioProfile(this.mAudioProfile, this.mAudioScenario);
                setVideoQualityParameters(this.mVideoQualityFlg);
                setParameters_i(this.mConfParameters);
                this.linkMicPusherPipeline.mo109272D0(this.mDefaultAudioRoutetoSpeakerphone);
                enableAudio(this.mEnableAudio);
                enableVideo(this.mEnableVideo);
                setRoom24hMode(this.mRoom24hMode);
                enableConfLog(this.mLinkMicLogEnable, this.mLinkMicLogPath);
                enableMulPusherInRoom(this.mEnableMulPusherInRoom);
                setVideoMixerBackgroundImgUrl(this.mBackgroundImgUrl);
                setRecordPcmDataCallback(this.mRecordPcmDataCallback);
                i3 = this.mAudioRoteoverrideDefault;
                if (i3 == 1) {
                    setForceChangeAudioRouter(true, this.mUsingVoip);
                } else if (i3 == 0) {
                    setForceChangeAudioRouter(false, this.mUsingVoip);
                }
                i4 = this.mEnableWebSdkInteroperability;
                if (i4 != -1) {
                    if (i4 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    enableWebSdkInteroperability(z2);
                }
                i5 = this.mNsmode;
                if (i5 > 0) {
                    setNsStatus(this.mNsStatus, i5);
                }
                if (z) {
                    iM112326d0 = csx.m112235R().m112326d0();
                    iM112330e0 = csx.m112235R().m112330e0();
                    bsxVar = c15814dM99797h.f73012e;
                    if (bsxVar != null) {
                        iM112326d0 = bsxVar.f78281l;
                        iM112330e0 = bsxVar.f78278k;
                    }
                    this.linkMicPusherPipeline.mo107915i(iM112326d0, iM112330e0, new fpf0());
                }
                csx.m112235R().m112315a1(0);
                this.linkMicPusherPipeline.mo109297S(this.enableAudioStrero);
                this.linkMicPusherPipeline.mo107927t0();
            }
            setSlaveAudioLevel(this.mSlaveAudioLevel);
            setMasterAudioLevel(this.mMasterAudioLevel);
            setVoicebackwardsEnable(this.mVoicebackwardsEnable);
            ignoreMonitor(this.mIgnoreMonitor);
            setCustZoomFlag(this.mCusZoomFlag);
            setPcmDataCallback(this.mPcmDateCallback);
            this.mRecording = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void startScreenPushlish(Activity activity, ror rorVar) {
        this.mScreenCodecParameters = rorVar;
        this.mMediaProjectionManager = (MediaProjectionManager) activity.getSystemService("media_projection");
        t9c.m189745c("ScreenRecordActivity", Build.VERSION.SDK_INT + ">=21");
        activity.startActivityForResult(this.mMediaProjectionManager.createScreenCaptureIntent(), 1111);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void startSurroundMusic(String str, int i, long j) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21092O1(str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void startSurroundMusicEx(String str, boolean z, boolean z2, int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109329r0(str, z, z2, i);
        }
    }

    public void stopAllEffects() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.stopAllEffects();
        }
    }

    public void stopEffect(int i) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.stopEffect(i);
        }
    }

    public void stopPlayMusic() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21090N1();
        }
    }

    public void stopRecordFile() {
        zzl zzlVar = this.momoPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo107910e2();
        }
    }

    public void stopRecordWithNotLeaveRoom() {
        if (this.mRecording) {
            zzl zzlVar = this.momoPusherPipeline;
            if (zzlVar != null) {
                zzlVar.mo107911f();
                MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
                if (momoPipelineModuleRegister != null) {
                    momoPipelineModuleRegister.mo21180z(this.momoPusherPipeline);
                }
            }
            hwl hwlVar = this.linkMicPusherPipeline;
            if (hwlVar != null) {
                hwlVar.mo107888A();
                MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.moduleRegister;
                if (momoPipelineModuleRegister2 != null) {
                    momoPipelineModuleRegister2.mo21180z(this.linkMicPusherPipeline);
                }
            }
            this.mRecording = false;
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void stopRecording() {
        if (this.mRecording) {
            zzl zzlVar = this.momoPusherPipeline;
            if (zzlVar != null) {
                zzlVar.mo107911f();
                MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
                if (momoPipelineModuleRegister != null) {
                    momoPipelineModuleRegister.mo21180z(this.momoPusherPipeline);
                }
            }
            hwl hwlVar = this.linkMicPusherPipeline;
            if (hwlVar != null) {
                hwlVar.mo107911f();
                MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.moduleRegister;
                if (momoPipelineModuleRegister2 != null) {
                    momoPipelineModuleRegister2.mo21180z(this.linkMicPusherPipeline);
                }
            }
            this.mRecording = false;
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void stopRenderer() {
        if (this.ijkInputPipline == null || this.mSelectFileStop) {
            return;
        }
        b7y.m102882c().m102888g("stopRenderer");
        oq70.m168791d().m168795c("pip->PIPLINE2", "stopRenderer: stopRenderer()");
        this.mSelectFileStop = true;
        this.ijkInputPipline.mo109166G();
        this.moduleRegister.mo21141B(this.ijkInputPipline);
        this.ijkInputPipline = null;
        oq70.m168791d().m168795c("pip->PIPLINE2", "stopRenderer: stopRenderer() end");
    }

    public void stopScreenPushlish() {
        zzl zzlVar = this.mScreenPusherPipeline;
        if (zzlVar != null) {
            zzlVar.mo107911f();
            MomoPipelineModuleRegister momoPipelineModuleRegister = this.mScreenPipelineModuleRegister;
            if (momoPipelineModuleRegister != null) {
                momoPipelineModuleRegister.mo21142C(this.mScreenPusherPipeline);
            }
            this.mScreenPusherPipeline = null;
        }
        n5m n5mVar = this.mScreenInputPipline;
        if (n5mVar != null) {
            n5mVar.mo109166G();
            this.mScreenPipelineModuleRegister.mo21141B(this.emptyInputPipline);
            this.mScreenInputPipline = null;
        }
        MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.mScreenPipelineModuleRegister;
        if (momoPipelineModuleRegister2 != null) {
            momoPipelineModuleRegister2.mo21174t();
            this.mScreenPipelineModuleRegister = null;
            ijkMediaStreamer.onRecordSuccessListener onrecordsuccesslistener = this.mOnRecordSuccessListener;
            if (onrecordsuccesslistener == null || this.mRecordScreenError) {
                return;
            }
            onrecordsuccesslistener.m224086a(this);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void stopSurroundMusic() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.stopSurroundMusic();
        }
    }

    public void stopSurroundMusic_NoDelay() {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo109304Y();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void switchCamera() {
        b7y.m102882c().m102888g(BLiveButtonType.switchCamera);
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null && this.mrConfig != null) {
            cqlVar.mo111944i0(this.mContextRef.get(), this.mrConfig);
        }
        oq70.m168791d().m168795c("ijkConferenceStreamer", BLiveButtonType.switchCamera);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void unSelectCamera() {
        this.mHavaSelectCamera = false;
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null) {
            cqlVar.mo109166G();
            this.cameraInputPipline.mo111951r();
            this.moduleRegister.mo21141B(this.cameraInputPipline);
            this.cameraInputPipline = null;
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void updateChannelkey(String str) {
        hwl hwlVar;
        this.mChannelkey = str;
        if (TextUtils.isEmpty(str) || (hwlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        hwlVar.mo109325l2(str);
    }

    public void setMergePosition(pvl pvlVar, String str, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo21165k(pvlVar, str, f, f2, f3, f4, f5, i, i2, i3);
        }
    }

    public void startPlayMusic(long j, boolean z) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo21101Y0(j, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void selectFaceDetectFilter(Context context, jt2 jt2Var) {
        selectFaceDetectFilter(jt2Var);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRoomMode(int i, boolean z) {
        hwl hwlVar;
        this.mRoomMode = i;
        this.mUseServerAudioMixer = z;
        if (i == -1 || (hwlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        hwlVar.mo109311c1(i, z);
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$b */
    public class C3910b implements fb1 {
        public C3910b() {
        }

        @Override // p153l.fb1
        /* JADX INFO: renamed from: C */
        public oxd0 mo19373C(oxd0 oxd0Var) {
            return oxd0Var;
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$c */
    public class C3911c implements fb1 {
        public C3911c() {
        }

        @Override // p153l.fb1
        /* JADX INFO: renamed from: C */
        public oxd0 mo19373C(oxd0 oxd0Var) {
            return oxd0Var;
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$l */
    public class C3920l implements fb1 {
        public C3920l() {
        }

        @Override // p153l.fb1
        /* JADX INFO: renamed from: C */
        public oxd0 mo19373C(oxd0 oxd0Var) {
            return oxd0Var;
        }
    }

    public boolean playEffect(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            return hwlVar.mo109284K1(i, str, i2, d, d2, z, d3);
        }
        return true;
    }

    @RequiresApi(api = 21)
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        onActivityResult(activity, i, i2, intent, null);
    }

    public void resetCodec(int i, int i2) {
        this.mEncodeWidth = i;
        this.mEncodeHeight = i2;
        initFilterCoreParameters();
        hwl hwlVar = this.linkMicPusherPipeline;
        if (hwlVar != null) {
            hwlVar.mo107900S0(this.mrCodecParameters);
        }
    }

    public void switchCamera(Activity activity) {
        row rowVar;
        cql cqlVar = this.cameraInputPipline;
        if (cqlVar != null && (rowVar = this.mrConfig) != null && activity != null) {
            cqlVar.mo111944i0(activity, rowVar);
        }
        oq70.m168791d().m168795c("ijkConferenceStreamer", BLiveButtonType.switchCamera);
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$g */
    public class C3915g implements MomoPipelineModuleRegister.InterfaceC4261a {
        public C3915g() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4261a
        /* JADX INFO: renamed from: b */
        public void mo19372b(int i, int i2, c4m c4mVar) {
            ijkConferenceStreamer.this.mErrorCode = lg60.m154064a(i, i2);
            synchronized (ijkConferenceStreamer.this.mSynRelease) {
                try {
                    if (ijkConferenceStreamer.this.mOnErrorListener != null) {
                        ijkConferenceStreamer.this.mOnErrorListener.m224075a(ijkConferenceStreamer.this, i, i2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4261a
        /* JADX INFO: renamed from: a */
        public void mo19371a(int i, int i2, c4m c4mVar) {
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void startPreview(int i, Object obj) {
        this.mSurface = obj;
        if (this.mHavaSelectCamera && this.cameraInputPipline != null) {
            initFilterCoreParameters();
            this.moduleRegister.mo21167m(this.mrCodecParameters);
            this.cameraInputPipline.mo136016K();
            this.cameraInputPipline.mo136014C(obj);
            return;
        }
        if (obj == null && this.cameraInputPipline == null) {
            return;
        }
        this.mHavaSelectCamera = true;
        this.mCameraID = i;
        initFilterCoreParameters();
        int i2 = this.mCameraID;
        row rowVar = this.mrConfig;
        if (i2 == 0) {
            rowVar.m182478q(0);
        } else {
            rowVar.m182478q(1);
        }
        this.cameraInputPipline = this.moduleRegister.mo21144E(this.mrConfig, new qv40());
        setWarpType(this.warpType);
        setFaceEyeScale(this.mFaceEyeScale);
        setFaceThinScale(this.mFaceThinScale);
        setFaceBeautiful(this.faceBeautiful);
        setFaceExpressionDetectSwitch(this.isActiveSwitch);
        this.cameraInputPipline.mo111936T(true);
        this.cameraInputPipline.mo136017i(obj);
        jt2 jt2Var = this.mBasicFilter;
        if (jt2Var != null) {
            selectFilter(jt2Var);
        }
    }

    public ijkConferenceStreamer(Activity activity, brx brxVar) {
        this(activity, 1, "", false, brxVar);
    }

    public ijkConferenceStreamer(Activity activity, int i) {
        this(activity, i, "", false, null);
    }

    public ijkConferenceStreamer(Activity activity, int i, String str, boolean z) {
        this(activity, i, str, z, null);
    }

    public ijkConferenceStreamer(Activity activity) {
        this(activity, 1);
    }

    public void startRecordWithNotJoinRoom() {
        startRecordWithNotJoinRoom(this.mMediaCfgParams);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void startRecording() {
        startRecording(this.mMediaCfgParams);
    }
}
