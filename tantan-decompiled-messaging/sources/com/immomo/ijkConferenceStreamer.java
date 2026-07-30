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
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import com.momo.pub.MomoPipelineModuleRegister;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import io.agora.rtc2.RtcEngine;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.util.StringUtil;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.anw;
import p149l.b2l0;
import p149l.bnw;
import p149l.btl;
import p149l.bw00;
import p149l.cbl0;
import p149l.ccj;
import p149l.cn40;
import p149l.dix;
import p149l.eix;
import p149l.ejx;
import p149l.etf;
import p149l.eyx;
import p149l.fjx;
import p149l.g16;
import p149l.g860;
import p149l.gw00;
import p149l.gxl;
import p149l.hgd0;
import p149l.ii70;
import p149l.iql;
import p149l.j1m;
import p149l.mpd0;
import p149l.n8c;
import p149l.qmr;
import p149l.rnl;
import p149l.slw;
import p149l.sol;
import p149l.ts2;
import p149l.ttl;
import p149l.u3m;
import p149l.v2m;
import p149l.vif0;
import p149l.vv00;
import p149l.wmw;
import p149l.xgf0;
import p149l.xmw;
import p149l.xsl;
import p149l.ya1;
import p149l.ymw;
import p149l.z1l0;
import p149l.za1;
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
    private rnl cameraInputPipline;
    private iql emptyInputPipline;
    private boolean enableAudioStrero;
    private boolean enableVbr;
    private int faceBeautiful;
    private xsl ijkInputPipline;
    private Boolean isActiveSwitch;
    private ttl linkMicPusherPipeline;
    private int mActiveAudioTrack;
    private int mAdjustBrightnessInterval;
    private boolean mAllRemoteAudioStream;
    private wmw mAnchorStatusHanderhandler;
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
    private ts2 mBasicFilter;
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
    private sol mLoger;
    private float mMasterAudioLevel;
    private eix mMediaCfgParams;
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
    private xmw mRtcAudioStatsUpdataHandle;
    private MRtcChannelHandler mRtcChannelHandler;
    private MRtcConnectHandler mRtcConnectHandler;
    private MRtcEventHandler mRtcEventHandler;
    private hgd0 mRtcEventHandlerAdapter;
    private MRtcExitRoomHandler mRtcExitRoomHandler;
    private ymw mRtcLRemoteStatsUpdataHandle;
    private bnw mRtcLVideoLossUpdataHandle;
    private MRtcQualityHandler mRtcQualityHandler;
    private anw mRtcStatsUpdataHandle;
    private MRtcSurroundMusicHander mRtcSurroundMusicHander;
    qmr mScreenCodecParameters;
    v2m mScreenInputPipline;
    private boolean mScreenOnWhilePlaying;
    MomoPipelineModuleRegister mScreenPipelineModuleRegister;
    gxl mScreenPusherPipeline;
    private int mSelectAudioTrack;
    private boolean mSelectFileStop;
    private float mSlaveAudioLevel;
    private Object mSurface;
    private ijkMediaStreamer.OnSurroundMusicStatusListener mSurroundMusicStatusListener;
    private Object mSynRelease;
    private int mTargetVideoHeight;
    private int mTargetVideoWidth;
    private b2l0 mTextureViewListener;
    private boolean mUseServerAudioMixer;
    private boolean mUsingVoip;
    private int mVenderID;
    private int mVideoBitRate;
    private z1l0 mVideoChannelListener;
    private ttl.InterfaceC20269a mVideoChannelListenerEx;
    private int mVideoCodecRate;
    private int mVideoHeight;
    private boolean mVideoQualityFlg;
    private cbl0 mVideoTextureListener;
    private int mVideoWidth;
    private int mVisualHeight;
    private int mVisualWeigh;
    private boolean mVoicebackwardsEnable;
    private float mZoom;
    private MomoPipelineModuleRegister moduleRegister;
    private gxl momoPusherPipeline;
    private qmr mrCodecParameters;
    private slw mrConfig;
    private InterfaceC4109a surroundMusicExt;
    private Integer warpType;

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$a */
    public class C3757a implements MomoPipelineModuleRegister.InterfaceC4110a {
        public C3757a() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4110a
        /* JADX INFO: renamed from: a */
        public void mo18362a(int i, int i2, j1m j1mVar) {
            if (ijkConferenceStreamer.this.mOnRecordScreenErrorListener != null) {
                if (i == 12545 && i2 == 11) {
                    ijkConferenceStreamer.this.mRecordScreenError = true;
                }
                ijkConferenceStreamer.this.mOnRecordScreenErrorListener.m222839a(ijkConferenceStreamer.this, i, i2);
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4110a
        /* JADX INFO: renamed from: b */
        public void mo18363b(int i, int i2, j1m j1mVar) {
            if (ijkConferenceStreamer.this.mOnRecordScreenErrorListener != null) {
                ijkConferenceStreamer.this.mOnRecordScreenErrorListener.m222839a(ijkConferenceStreamer.this, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$d */
    public class C3760d implements sol {
        public C3760d() {
        }

        @Override // p149l.sol
        /* JADX INFO: renamed from: a */
        public int mo18365a() {
            ii70.m136344d().m136348c("pip->PIPLINE2", "getError: mOutErrorCode=" + ijkConferenceStreamer.this.mOutErrorCode + ";mErrorCode=" + ijkConferenceStreamer.this.mErrorCode);
            int i = ijkConferenceStreamer.this.mOutErrorCode;
            ijkConferenceStreamer ijkconferencestreamer = ijkConferenceStreamer.this;
            return i == 0 ? ijkconferencestreamer.mErrorCode : ijkconferencestreamer.mOutErrorCode;
        }

        @Override // p149l.sol
        /* JADX INFO: renamed from: b */
        public String mo18366b() {
            NetUtil netUtil = ijkConferenceStreamer.this.mNetUtil;
            ijkConferenceStreamer ijkconferencestreamer = ijkConferenceStreamer.this;
            return netUtil == null ? ijkconferencestreamer.mMemory : ijkconferencestreamer.mMemory = String.valueOf(ijkconferencestreamer.mNetUtil.m222495a());
        }

        @Override // p149l.sol
        /* JADX INFO: renamed from: c */
        public String mo18367c() {
            return StringUtil.ALL_INTERFACES;
        }

        @Override // p149l.sol
        /* JADX INFO: renamed from: d */
        public String mo18368d() {
            NetUtil netUtil = ijkConferenceStreamer.this.mNetUtil;
            ijkConferenceStreamer ijkconferencestreamer = ijkConferenceStreamer.this;
            if (netUtil == null) {
                return ijkconferencestreamer.mNetType;
            }
            return ijkconferencestreamer.mNetType = ijkconferencestreamer.mNetUtil.m222498d() ? "wifi" : "other";
        }

        @Override // p149l.sol
        public String getPushType() {
            return "1";
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$e */
    public class C3761e implements bw00.InterfaceC15993b {
        public C3761e() {
        }

        @Override // p149l.bw00.InterfaceC15993b
        /* JADX INFO: renamed from: a */
        public void mo18369a(String str, String str2) {
            if (ijkConferenceStreamer.this.mLogUploadCallBack != null) {
                ijkConferenceStreamer.this.mLogUploadCallBack.m222379a(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$f */
    public class C3762f implements MomoPipelineModuleRegister.InterfaceC4111b {
        public C3762f() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4111b
        /* JADX INFO: renamed from: a */
        public void mo18370a(int i, int i2, j1m j1mVar) {
            ii70.m136344d().m136348c("MomoCamera", "what#########" + i);
            if (ijkConferenceStreamer.this.mOnInfoListener != null) {
                ijkConferenceStreamer.this.mOnInfoListener.m222830a(ijkConferenceStreamer.this, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$h */
    public class C3764h implements MomoPipelineModuleRegister.InterfaceC4112c {
        public C3764h() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4112c
        /* JADX INFO: renamed from: a */
        public void mo18371a(j1m j1mVar) {
            synchronized (ijkConferenceStreamer.this.mSynRelease) {
                try {
                    if (ijkConferenceStreamer.this.moduleRegister != null) {
                        ijkConferenceStreamer.this.moduleRegister.mo20181z(j1mVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4112c
        /* JADX INFO: renamed from: b */
        public void mo18372b(j1m j1mVar) {
            ii70.m136344d().m136348c("MomoCamera", "onRecordPrepared");
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$i */
    public class C3765i implements ya1 {
        public C3765i() {
        }

        @Override // p149l.ya1
        /* JADX INFO: renamed from: C */
        public mpd0 mo18364C(mpd0 mpd0Var) {
            if (ijkConferenceStreamer.this.mRecordDateCallback != null) {
                ijkConferenceStreamer.this.mRecordDateCallback.onRecordFrame(mpd0Var.f135035a, 44100, true);
            }
            return mpd0Var;
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$j */
    public class C3766j implements za1 {
        public C3766j() {
        }

        @Override // p149l.za1
        /* JADX INFO: renamed from: a */
        public void mo18373a(Object obj, int i, int i2) {
            if (ijkConferenceStreamer.this.mSurroundMusicStatusListener != null) {
                ijkConferenceStreamer.this.mSurroundMusicStatusListener.m222834a(null, i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$k */
    public class C3767k implements ya1 {
        public C3767k() {
        }

        @Override // p149l.ya1
        /* JADX INFO: renamed from: C */
        public mpd0 mo18364C(mpd0 mpd0Var) {
            if (ijkConferenceStreamer.this.mPcmDateCallback != null) {
                ijkConferenceStreamer.this.mPcmDateCallback.onPcmDateCallback(0L, mpd0Var.f135035a, 44100, true);
            }
            return mpd0Var;
        }
    }

    public ijkConferenceStreamer(Activity activity, int i, String str, boolean z, eix eixVar) {
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
        this.mrCodecParameters = new qmr();
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
        this.mLoger = new C3760d();
        this.mLogHelper = null;
        this.mContextRef = new WeakReference<>(activity);
        this.mVenderID = i;
        this.mEnableVideo = !z;
        this.mEnableAudio = true;
        this.mOnlyAudio = z;
        this.mOutErrorCode = 0;
        this.mAppID = str;
        g16.m124054a(activity.getApplicationContext());
        initFilterCoreParameters();
        initPipeline(eixVar);
    }

    private void audioEffectReset() {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a == null) {
            return;
        }
        interfaceC4109a.mo20094P();
        this.surroundMusicExt.mo20097S1(false);
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
            this.mrCodecParameters = new qmr();
        }
        qmr qmrVar = this.mrCodecParameters;
        qmrVar.f182018G0 = true;
        qmrVar.f177107F = 20;
        qmrVar.f182015D0 = 20;
        qmrVar.f182016E0 = this.mVideoCodecRate;
        qmrVar.f177109H = this.mVideoBitRate;
        qmrVar.f177164s = this.mVideoWidth;
        qmrVar.f177166t = this.mVideoHeight;
        qmrVar.f177152m = this.mEncodeWidth;
        qmrVar.f177154n = this.mEncodeHeight;
        qmrVar.f177156o = this.mExternEncodeWidth;
        qmrVar.f177158p = this.mExternEncodeHeight;
        qmrVar.f177110I = this.mExternVideoBitRate;
        qmrVar.f177168u = this.mVisualWeigh;
        qmrVar.f177169v = this.mVisualHeight;
        qmrVar.f177160q = this.mEnableExternStream;
        qmrVar.f177119R = this.mAudioChannalNum;
        qmrVar.f177117P = this.mAudioSampleRate;
        qmrVar.f182028Q0 = this.mLinkMicLogEnable;
        qmrVar.f182029R0 = this.mLinkMicLogPath;
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20180y(qmrVar);
        }
        if (this.mrConfig == null) {
            this.mrConfig = slw.m184856k();
        }
        this.mrConfig.m184871O(new vif0(this.mVisualWeigh, this.mVisualHeight));
        this.mrConfig.m184888r(new vif0(this.mEncodeWidth, this.mEncodeHeight));
        int i = this.mCameraID;
        slw slwVar = this.mrConfig;
        if (i == 0) {
            slwVar.m184887q(0);
        } else {
            slwVar.m184887q(1);
        }
        this.mrConfig.m184864H(new vif0(this.mTargetVideoWidth, this.mTargetVideoHeight));
    }

    private void initPipeline(eix eixVar) {
        this.mMediaCfgParams = eixVar;
        MomoPipelineModuleRegister momoPipelineModuleRegisterM200149m = vv00.m200149m(this.mContextRef.get(), eixVar);
        this.moduleRegister = momoPipelineModuleRegisterM200149m;
        momoPipelineModuleRegisterM200149m.mo20180y(this.mrCodecParameters);
        this.moduleRegister.mo20169n();
        this.moduleRegister.mo20151K();
        this.moduleRegister.mo20147G(this.mLoger);
        this.moduleRegister.mo20144D(new C3761e());
        this.moduleRegister.mo20141A(new C3762f());
        this.moduleRegister.mo20160e(new C3763g());
        this.surroundMusicExt = this.moduleRegister.mo20167l();
        this.moduleRegister.mo20161f(new C3764h());
        fjx.m121638R().m121647C1(1);
        fjx.m121638R().m121786s1(false);
    }

    private void sabineMcEQ() {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a == null) {
            return;
        }
        interfaceC4109a.mo20110d0(0, 31.25f, 16);
        this.surroundMusicExt.mo20095Q(1, 62.5f, 8.0f);
        this.surroundMusicExt.mo20121n1(2, 125.0f, 2.0f, 8.0f);
        this.surroundMusicExt.mo20121n1(3, 250.0f, 2.0f, 8.0f);
        this.surroundMusicExt.mo20121n1(4, 500.0f, 2.0f, 8.0f);
        this.surroundMusicExt.mo20121n1(5, 1000.0f, 2.0f, 8.0f);
        this.surroundMusicExt.mo20121n1(6, 2000.0f, 2.0f, -8.0f);
        this.surroundMusicExt.mo20121n1(7, 4000.0f, 2.0f, -8.0f);
        this.surroundMusicExt.mo20095Q(8, 8000.0f, -8.0f);
        this.surroundMusicExt.mo20110d0(9, 16000.0f, 33);
    }

    private void setParameters_i(List<String> list) {
        if (this.linkMicPusherPipeline != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.linkMicPusherPipeline.mo162752v(it.next());
            }
        }
    }

    private void startPush(Activity activity, eix eixVar) {
        if (this.mScreenPipelineModuleRegister == null) {
            this.mScreenPipelineModuleRegister = vv00.m200149m(activity, this.mMediaCfgParams);
        }
        if (this.mScreenInputPipline == null) {
            this.mScreenCodecParameters.f182046y0 = getScreenWidth(activity);
            this.mScreenCodecParameters.f182047z0 = getScreenHeight(activity);
            this.mScreenCodecParameters.f177164s = getScreenWidth(activity);
            this.mScreenCodecParameters.f177166t = getScreenHeight(activity);
            this.mScreenPipelineModuleRegister.mo20180y(this.mScreenCodecParameters);
            this.mScreenPipelineModuleRegister.mo20151K();
            this.mScreenPipelineModuleRegister.mo20160e(new C3757a());
            v2m v2mVarMo20170o = this.mScreenPipelineModuleRegister.mo20170o();
            this.mScreenInputPipline = v2mVarMo20170o;
            v2mVarMo20170o.mo97708i(null);
            this.mScreenInputPipline.mo196807o(this.mMediaProjection);
            this.mScreenPusherPipeline = this.mScreenPipelineModuleRegister.mo20156P(null);
            ttl ttlVar = this.linkMicPusherPipeline;
            if (ttlVar != null) {
                ttlVar.mo160316P1(true);
            }
            MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
            MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.mScreenPipelineModuleRegister;
            if (momoPipelineModuleRegister != null) {
                momoPipelineModuleRegister2.mo20150J(momoPipelineModuleRegister.mo20179x());
            } else {
                momoPipelineModuleRegister2.mo20150J(null);
            }
            gxl gxlVar = this.mScreenPusherPipeline;
            qmr qmrVar = this.mScreenCodecParameters;
            gxlVar.mo139367p0(qmrVar.f155331m1, qmrVar.f182043v0);
            this.mScreenPusherPipeline.mo139369t0();
            String str = this.mScreenCodecParameters.f182043v0;
        }
    }

    public void JoinRoom(String str, int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139366p(str, i);
        }
    }

    public void LeaveRoom() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139365o();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void SabineEffectReset() {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20094P();
        }
    }

    public void SabineEffectReset_ex() {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20086I();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void SabineEffectSet(int i, int i2, float f) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20113e1(i, i2, f);
        }
    }

    public void SabineEffectSet_ans(float f) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20099U1(f);
        }
    }

    public void SabineEffectSet_peq_Shelving(int i, float f, float f2) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20095Q(i, f, f2);
        }
    }

    public void SabineEffectSet_peq_fliter(int i, float f, int i2) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20110d0(i, f, i2);
        }
    }

    public void SabineEffectSet_peq_peak(int i, float f, float f2, float f3) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20121n1(i, f, f2, f3);
        }
    }

    public void SabineEffectSet_reverb(int i, float f) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20116i1(i, f);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addEventHandler(MRtcEventHandler mRtcEventHandler) {
        this.mRtcEventHandler = mRtcEventHandler;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160325X1(mRtcEventHandler);
        }
    }

    public void addExitRoomHandler(MRtcExitRoomHandler mRtcExitRoomHandler) {
        this.mRtcExitRoomHandler = mRtcExitRoomHandler;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160313N0(mRtcExitRoomHandler);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addFilterToDestory(ts2 ts2Var) {
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar == null || rnlVar.mo103860a() == null) {
            return;
        }
        addFilterToDestroy(ts2Var, this.cameraInputPipline.mo103860a().toString());
    }

    public void addFilterToDestroy(ccj ccjVar, String str) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20149I(ccjVar, str);
        }
    }

    public void addMRtcAnchorStatusHandle(wmw wmwVar) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160314O0(null);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addMRtcAudioHandler(MRtcAudioHandler mRtcAudioHandler) {
        eyx.m118802c().m118808g("addMRtcAudioHandler");
        this.mRtcAudioHandler = mRtcAudioHandler;
        setAudioOnlyModel(mRtcAudioHandler, this.mAudioInterval, this.mAudiosmooth);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addMRtcAudioHandlerEx(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        eyx.m118802c().m118808g("addMRtcAudioHandlerEx");
        this.mRtcAudioHandlerEx = mRtcAudioHandlerEx;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139364n0(mRtcAudioHandlerEx);
        }
    }

    public void addMRtcAudioStatsUpdataHandler(xmw xmwVar) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160291B0(xmwVar);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void addMRtcChannelHandler(MRtcChannelHandler mRtcChannelHandler) {
        this.mRtcChannelHandler = mRtcChannelHandler;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160340i0(mRtcChannelHandler);
        }
    }

    public void addMRtcConnectHandler(MRtcConnectHandler mRtcConnectHandler) {
        this.mRtcConnectHandler = mRtcConnectHandler;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160331a2(mRtcConnectHandler);
        }
    }

    public void addMRtcLRemoteStatsUpdataHandle(ymw ymwVar) {
        this.mRtcLRemoteStatsUpdataHandle = ymwVar;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160301H0(ymwVar);
        }
    }

    public void addMRtcMRtcClientRoleChangedHandler(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160332c0(mRtcClientRoleChangedHandler);
        }
    }

    public void addMRtcQualityHandler(MRtcQualityHandler mRtcQualityHandler) {
        this.mRtcQualityHandler = mRtcQualityHandler;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160303J0(mRtcQualityHandler);
        }
    }

    public void addMRtcReceiveSeiHandler(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160327Y1(mRtcReceiveSeiHandler);
        }
    }

    public void addMRtcStatsUpdataHandle(anw anwVar) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160330a0(null);
        }
    }

    public void addMRtcSurroundMusicHander(MRtcSurroundMusicHander mRtcSurroundMusicHander) {
        this.mRtcSurroundMusicHander = mRtcSurroundMusicHander;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160353s0(mRtcSurroundMusicHander);
        }
    }

    public void addMRtcVideoLossHandler(bnw bnwVar) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160295D1(bnwVar);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void adjustAef(int i, boolean z) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20106b0(i, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void adjustEQ(int i, boolean z) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20134y0(i, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void adjustEf(int i, int i2) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20098T(i, i2);
        }
    }

    public void adjustPlaybackSignalVolume(int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139333F1(i);
        }
    }

    public void adjustRemoteUserVolumeScale(long j, float f) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160307L(j, f);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void adjustTune(int i, boolean z) {
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20118j0(i, z);
        }
    }

    public void captureImage(String str) {
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo139346V1(str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int changeRole(int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.mo160297E0(i);
        }
        return -1;
    }

    public void changeVideoEncodeSize() {
        MomoPipelineModuleRegister momoPipelineModuleRegister;
        MomoPipelineModuleRegister momoPipelineModuleRegister2;
        qmr qmrVar = this.mrCodecParameters;
        if (qmrVar == null) {
            return;
        }
        int i = this.mVenderID;
        if (i == 1 && (momoPipelineModuleRegister2 = this.moduleRegister) != null) {
            momoPipelineModuleRegister2.mo20157b(qmrVar);
            this.moduleRegister.mo20177v(this.mrCodecParameters);
        } else if ((i == 2 || i == 3) && (momoPipelineModuleRegister = this.moduleRegister) != null) {
            momoPipelineModuleRegister.mo20157b(qmrVar);
        }
        this.moduleRegister.mo20171p(this.mrCodecParameters);
    }

    public void disableSabinAns(boolean z) {
        eyx.m118802c().m118808g("disableSabinAns:" + z);
        if (z) {
            fjx.m121638R().m121758k1(1, 1);
        } else {
            fjx.m121638R().m121758k1(0, 0);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableAudio(boolean z) {
        this.mEnableAudio = z;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160354u1(z);
        }
    }

    public void enableAudioStereo(boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160319S(z);
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
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo162751k2(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableConfLog(boolean z, String str) {
        this.mLinkMicLogPath = str;
        this.mLinkMicLogEnable = z;
        if (this.mrCodecParameters != null && str.length() > 0) {
            qmr qmrVar = this.mrCodecParameters;
            qmrVar.f182029R0 = this.mLinkMicLogPath;
            qmrVar.f182028Q0 = this.mLinkMicLogEnable;
        }
        if (this.linkMicPusherPipeline == null || !this.mLinkMicLogEnable || this.mLinkMicLogPath.length() <= 0) {
            return;
        }
        this.linkMicPusherPipeline.mo160322W(this.mLinkMicLogEnable, this.mLinkMicLogPath);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableExternStream(boolean z) {
        this.mEnableExternStream = z;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160312N(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableMulPusherInRoom(boolean z) {
        this.mEnableMulPusherInRoom = z;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160329Z0(z);
        }
    }

    public void enableVbr(boolean z) {
        this.enableVbr = z;
        fjx.m121638R().m121792u1(z);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void enableVideo(boolean z) {
        this.mEnableVideo = z;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160292C0(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void enableWebSdkInteroperability(boolean z) {
        this.mEnableWebSdkInteroperability = z ? 1 : 0;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar == null || z == -1) {
            return;
        }
        ttlVar.mo139373v0(z);
    }

    public void enableWeilaVBR(boolean z) {
        fjx.m121638R().m121792u1(z);
    }

    public void forwardDownlinkAudio(long j, boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160356z0(j, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public RtcEngine getAgoraEngine() {
        return null;
    }

    public qmr getCodecParameters() {
        return this.mrCodecParameters;
    }

    public long getCurrentPos() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.mo20130w();
        }
        return 0L;
    }

    public double getEffectsVolume() {
        ttl ttlVar = this.linkMicPusherPipeline;
        return ttlVar != null ? ttlVar.getEffectsVolume() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public long getExternFileDuration() {
        xsl xslVar = this.ijkInputPipline;
        if (xslVar != null) {
            return xslVar.getDuration();
        }
        return 0L;
    }

    public long getExternFilePlayPos() {
        xsl xslVar = this.ijkInputPipline;
        if (xslVar != null) {
            return xslVar.getCurrentPosition();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public float getMasterAudioLevel() {
        return this.mMasterAudioLevel;
    }

    public eix getMediaCfgParams() {
        return this.mMediaCfgParams;
    }

    public gw00 getMomoProcessPipeline() {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister == null) {
            return null;
        }
        momoPipelineModuleRegister.mo20146F().mo19724z0();
        return null;
    }

    public long getMusicDuration() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.getMusicDuration();
        }
        return 0L;
    }

    public float getMusicVolume() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.mo20109d();
        }
        return 1.0f;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public vif0 getPreviewSize(int i, int i2) {
        rnl rnlVar = this.cameraInputPipline;
        return rnlVar != null ? rnlVar.mo180100x(i, i2) : new vif0(352, 640);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getRecordDuration() {
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            return gxlVar.mo139359k1();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getRecordHeight() {
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            return gxlVar.mo139339L1();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getRecordWidth() {
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            return gxlVar.mo139345V0();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getRoomType() {
        return this.mRoomtype;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public float getSlaveAudioLevel() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.mo20135y1();
        }
        return 0.5f;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int getStreamerType() {
        return this.mVenderID;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public long getSurroundMusicDuration() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.mo20108c();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public long getSurroundMusicPos() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.mo20127r();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public long getVideoPts() {
        return 0L;
    }

    public double getVolumeOfEffects(int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        return ttlVar != null ? ttlVar.mo160324X0(i) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void ignoreMonitor(boolean z) {
        this.mIgnoreMonitor = z;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139338J1(z);
        }
    }

    public void mergeInput(btl btlVar, String str) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20172q(btlVar, str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteAllRemoteAudioStream(boolean z) {
        this.mAllRemoteAudioStream = z;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139374x(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteAllRemoteVideoStream(boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139354f1(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteLocalAudioStream(boolean z) {
        this.mLocalAudioStreamMute = z;
        eyx.m118802c().m118808g("ijkconf muteLocalAudioStream", Boolean.valueOf(z));
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139348a(z);
        }
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo139348a(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void muteLocalAudioStreamEx(boolean z) {
        this.mLocalAudioStreamMute = z;
        eyx.m118802c().m118808g("ijkconf muteLocalAudioStreamEx", Boolean.valueOf(z));
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160300G(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteLocalVideoStream(boolean z) {
        this.mLocalVideoStreamMute = z;
        eyx.m118802c().m118808g("muteLocalVideoStream", Boolean.valueOf(z));
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139331B1(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteRemoteAudioStream(long j, boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139341Q0(j, z);
        }
    }

    public void muteRemoteMsgStream(long j, boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139344U0(j, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public final void muteRemoteVideoStream(long j, boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139335H1(j, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void muteSingerAudioStream(boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139349b(z);
        }
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a != null) {
            interfaceC4109a.mo20105b(z);
        }
    }

    @RequiresApi(api = 21)
    public void onActivityResult(Activity activity, int i, int i2, Intent intent, eix eixVar) {
        if (i != 1111) {
            return;
        }
        MediaProjection mediaProjection = this.mMediaProjectionManager.getMediaProjection(i2, intent);
        ijkMediaStreamer.OnInfoListener onInfoListener = this.mOnInfoListener;
        if (onInfoListener != null) {
            onInfoListener.m222830a(this, 12546, i2);
        }
        if (mediaProjection == null || i2 == 0) {
            return;
        }
        this.mMediaProjection = mediaProjection;
        startPush(activity, eixVar);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void openAudioTracks(boolean z) {
        this.mEnableSwitchAudioTrack = z;
        xsl xslVar = this.ijkInputPipline;
        if (xslVar != null) {
            xslVar.mo121002t(z);
        }
    }

    public void pasePlayMusic() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20132w1();
        }
    }

    public void pauseAllEffects() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.pauseAllEffects();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void pauseCamera() {
        if (this.cameraInputPipline != null) {
            eyx.m118802c().m118808g("pauseCamera");
            this.cameraInputPipline.mo180075N();
        }
    }

    public void pauseEffect(int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.pauseEffect(i);
        }
    }

    public void pauseExternFile() {
        if (!this.mHavaSelectFile || this.ijkInputPipline == null) {
            return;
        }
        eyx.m118802c().m118808g("pauseExternFile");
        this.ijkInputPipline.pause();
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void pauseRecording() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160352s();
        }
    }

    public void pauseRending() {
        if (this.mPauseRending) {
            return;
        }
        this.mPauseRending = true;
        if (this.cameraInputPipline != null) {
            eyx.m118802c().m118808g("cameraInputPipline pauseRendering");
            this.cameraInputPipline.mo97707K();
        }
        if (this.ijkInputPipline != null) {
            eyx.m118802c().m118808g("ijkInputPipline pauseRendering");
            this.ijkInputPipline.mo97707K();
        }
    }

    public void pauseScreenPusher() {
        v2m v2mVar = this.mScreenInputPipline;
        if (v2mVar != null) {
            v2mVar.mo97707K();
        }
        gxl gxlVar = this.mScreenPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo128618g2();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void pauseSurroundMusic() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20117j();
        }
    }

    public boolean playEffect(int i, String str, int i2, double d, double d2, boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.mo160306K1(i, str, i2, d, d2, z, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
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
                    netUtil.m222499e();
                    this.mNetUtil = null;
                }
                InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
                if (interfaceC4109a != null) {
                    interfaceC4109a.mo20111d1();
                    this.surroundMusicExt = null;
                }
                rnl rnlVar = this.cameraInputPipline;
                if (rnlVar != null) {
                    rnlVar.mo97705G();
                    this.cameraInputPipline.mo180095r();
                    this.moduleRegister.mo20142B(this.cameraInputPipline);
                    this.cameraInputPipline = null;
                }
                xsl xslVar = this.ijkInputPipline;
                if (xslVar != null) {
                    xslVar.mo97705G();
                    this.moduleRegister.mo20142B(this.ijkInputPipline);
                    this.ijkInputPipline = null;
                }
                iql iqlVar = this.emptyInputPipline;
                if (iqlVar != null) {
                    iqlVar.mo97705G();
                    this.moduleRegister.mo20142B(this.emptyInputPipline);
                    this.emptyInputPipline = null;
                }
                MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
                if (momoPipelineModuleRegister != null) {
                    momoPipelineModuleRegister.mo20175t();
                    this.moduleRegister = null;
                }
                IjkStreamerLogHelper ijkStreamerLogHelper = this.mLogHelper;
                if (ijkStreamerLogHelper != null) {
                    ijkStreamerLogHelper.m222359i(0, this.mrCodecParameters.f182043v0);
                    this.mLogHelper.m222362l();
                    this.mLogHelper.m222360j();
                    this.mLogHelper = null;
                    this.mLogUploadCallBack = null;
                }
                ttl ttlVar = this.linkMicPusherPipeline;
                if (ttlVar != null) {
                    ttlVar.release();
                    this.linkMicPusherPipeline = null;
                }
                gxl gxlVar = this.momoPusherPipeline;
                if (gxlVar != null) {
                    gxlVar.release();
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
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20122o0();
        }
    }

    public void removeMerge(btl btlVar) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20165j(btlVar);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void requestExpectStream(int i, int i2) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160288A0(i, i2);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void resetCamera() {
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180072B(this.mrConfig);
        }
    }

    public void resetCodec(int i, int i2, int i3) {
        this.mEncodeWidth = i;
        this.mEncodeHeight = i2;
        this.mVideoBitRate = i3;
        qmr qmrVar = this.mrCodecParameters;
        if (qmrVar != null) {
            if (i3 == qmrVar.f177109H && i == qmrVar.f177152m && i2 == qmrVar.f177154n) {
                return;
            }
            initFilterCoreParameters();
            ttl ttlVar = this.linkMicPusherPipeline;
            if (ttlVar != null) {
                ttlVar.mo139342S0(this.mrCodecParameters);
            }
        }
    }

    public void resetExtPlayerPath(String str) {
        this.mrCodecParameters.f182045x0 = str;
    }

    public void resumeAllEffects() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.resumeAllEffects();
        }
    }

    public void resumeCamera() {
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180102z();
        }
    }

    public void resumeEffect(int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.resumeEffect(i);
        }
    }

    public void resumeExternFile(Object obj) {
        if (!this.mHavaSelectFile || this.ijkInputPipline == null) {
            return;
        }
        eyx.m118802c().m118808g("resumeExternFile", "surface:" + obj);
        this.ijkInputPipline.resume();
        this.ijkInputPipline.mo97707K();
        this.ijkInputPipline.mo97704C(obj);
    }

    public void resumePlayMusic() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20123p1();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void resumeRecording() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160299F0();
        }
    }

    public void resumeRending() {
        Object obj;
        if (this.mPauseRending) {
            this.mPauseRending = false;
            rnl rnlVar = this.cameraInputPipline;
            if (rnlVar != null && (obj = this.mSurface) != null) {
                rnlVar.mo97704C(obj);
            }
            xsl xslVar = this.ijkInputPipline;
            if (xslVar != null) {
                xslVar.mo97704C(this.mSurface);
            }
        }
    }

    public void resumeScreenPusher() {
        v2m v2mVar = this.mScreenInputPipline;
        if (v2mVar != null) {
            v2mVar.mo97704C(null);
        }
        gxl gxlVar = this.mScreenPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo128616R0();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void resumeSurroundMusic() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20125q();
        }
    }

    public void seekExternFile(long j) {
        xsl xslVar;
        if (!this.mHavaSelectFile || (xslVar = this.ijkInputPipline) == null) {
            return;
        }
        xslVar.seek(j);
    }

    public void seekMusic(long j) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20126q0(j);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void seekToSurroundMusic(long j) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20131w0(j);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void selectCamera(Activity activity, int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void selectFaceDetectFilter(ts2 ts2Var) {
        selectFilter(ts2Var);
        if (ts2Var instanceof etf) {
            setFaceDetectInterFace((etf) ts2Var);
        }
    }

    public void selectFilter(ts2 ts2Var) {
        this.mBasicFilter = ts2Var;
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180090j(ts2Var);
        }
    }

    public void sendConferenceDate(String str) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160317Q1(str);
        }
    }

    public void setAdjustBrightnessInterval(int i) {
        this.mAdjustBrightnessInterval = i;
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180093m(i);
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
        InterfaceC4109a interfaceC4109a = this.surroundMusicExt;
        if (interfaceC4109a == null) {
            return;
        }
        if (i == 0) {
            audioEffectReset();
            this.surroundMusicExt.mo20118j0(0, false);
            return;
        }
        switch (i) {
            case 5:
                audioEffectReset();
                this.surroundMusicExt.mo20118j0(-4, true);
                break;
            case 6:
                audioEffectReset();
                this.surroundMusicExt.mo20118j0(6, true);
                break;
            case 7:
                audioEffectReset();
                this.surroundMusicExt.mo20118j0(9, true);
                break;
            case 8:
                interfaceC4109a.mo20118j0(0, false);
                this.surroundMusicExt.mo20086I();
                this.surroundMusicExt.mo20097S1(false);
                sabineMcEQ();
                break;
            case 9:
                audioEffectReset();
                this.surroundMusicExt.mo20118j0(0, false);
                this.surroundMusicExt.mo20097S1(true);
                break;
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setAudioHighQualityParameters(boolean z) {
        this.mAudioHighQualityFlg = z;
        ii70.m136344d().m136348c("newAudio", "setAudioHighQualityParameters:mAudioProfile=" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg);
    }

    public void setAudioMixingPitch(int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160289A1(i);
        }
    }

    public void setAudioOnlyModel(MRtcAudioHandler mRtcAudioHandler, int i, int i2) {
        if (mRtcAudioHandler == null || i < 0 || i2 < 0) {
            return;
        }
        eyx.m118802c().m118808g("setAudioOnlyModel", "interval:" + i + ",smooth:" + i2);
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139347Z1(mRtcAudioHandler, i, i2);
        }
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo139347Z1(mRtcAudioHandler, i, i2);
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
            ii70.m136344d().m136348c("newAudio", "setAudioProfile:mAudioProfile=" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg);
            eyx eyxVarM118802c = eyx.m118802c();
            StringBuilder sb = new StringBuilder("ijkconf setAudioProfile: profile=");
            sb.append(this.mAudioProfile);
            sb.append(", scenario=");
            sb.append(this.mAudioScenario);
            eyxVarM118802c.m118808g(sb.toString());
            this.linkMicPusherPipeline.mo160310M0(this.mAudioProfile, this.mAudioScenario);
        }
    }

    public void setAudioSampleRate(int i) {
        this.mAudioSampleRate = i;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setAudioTrackIndex(int i) {
        this.mActiveAudioTrack = i;
        xsl xslVar = this.ijkInputPipline;
        if (xslVar != null) {
            xslVar.mo121000n(i);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setAvFlag(int i) {
        this.mAvFlag = i;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139370t1(i);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setBlinkSwitch(boolean z) {
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180099w(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setBusinessType(int i) {
        this.mBusinessType = i;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139343T0(i);
        }
    }

    public void setCameraCutSize(int i, int i2) {
        this.moduleRegister.mo20174s(i, i2);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setChannalName(String str) {
        this.mrCodecParameters.f155325g1 = str;
        ii70.m136344d().m136348c("setChannalName", "setChannalName" + this.mrCodecParameters.f155325g1);
        try {
            setSessionID(Long.parseLong(str));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setChannelkey(String str) {
        ttl ttlVar;
        this.mChannelkey = str;
        if (TextUtils.isEmpty(str) || (ttlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        ttlVar.mo160337h0(this.mChannelkey);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setCustZoomFlag(boolean z) {
        this.mCusZoomFlag = z;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160302I0(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setDefaultAudioRoutetoSpeakerphone(boolean z) {
        this.mDefaultAudioRoutetoSpeakerphone = z;
    }

    public void setEffectsVolume(double d) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.setEffectsVolume(d);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public int setEnableSpeakerphone(boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.setEnableSpeakerphone(z);
        }
        return -1;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setEncoderSize(int i, int i2) {
        this.mEncodeWidth = i;
        this.mEncodeHeight = i2;
        eyx.m118802c().m118808g("setEncoderSize", "width:" + i + ", height:" + i2);
        initFilterCoreParameters();
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setEncryptionMode(String str) {
        ttl ttlVar;
        this.mEncryptionMode = str;
        if (TextUtils.isEmpty(str) || (ttlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        ttlVar.mo160338h1(str);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setEncryptionSecret(String str) {
        ttl ttlVar;
        this.mEncryptionSecret = str;
        if (TextUtils.isEmpty(str) || (ttlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        ttlVar.mo160328Z(str);
    }

    public void setError(int i) {
        this.mOutErrorCode = i;
        ii70.m136344d().m136348c("pip->PIPLINE2", "setError: mOutErrorCode=" + this.mOutErrorCode);
    }

    public void setExtAudioParameters(int i, int i2, int i3) {
        this.mAudio_channe_frq = i;
        this.mAudio_channe = i2;
        this.mAudio_channe_layout = i3;
        xsl xslVar = this.ijkInputPipline;
        if (xslVar != null) {
            xslVar.mo121001p(i, i2, i3);
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

    public void setFaceDetectInterFace(etf etfVar) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20148H(etfVar);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setFaceDetectModelPath(List<String> list) {
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180092l(list);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setFaceDetectTimeoutSwitch(boolean z) {
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180074I(z);
        }
    }

    public void setFaceExpressionDetectSwitch(Boolean bool) {
        if (bool == null) {
            return;
        }
        this.isActiveSwitch = bool;
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180091k(bool.booleanValue());
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setFaceEyeScale(Float f) {
        if (f == null) {
            return;
        }
        this.mFaceEyeScale = f;
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180098v(f.floatValue());
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setFaceThinScale(Float f) {
        if (f == null) {
            return;
        }
        this.mFaceThinScale = f;
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo180094q(f.floatValue());
        }
    }

    public void setForceChangeAudioRouter(boolean z, boolean z2) {
        if (z) {
            this.mAudioRoteoverrideDefault = 1;
        } else {
            this.mAudioRoteoverrideDefault = 0;
        }
        this.mUsingVoip = z2;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160298E1(z, z2);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setHost(boolean z) {
        this.mrCodecParameters.f155326h1 = z;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setLandMode(boolean z) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20155O(z);
            this.moduleRegister.mo20171p(this.mrCodecParameters);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setLocalMergeSei(String str) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139336I1(str);
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
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160335g0(f);
        }
    }

    public void setMediaCfgParams(eix eixVar) {
        this.mMediaCfgParams = eixVar;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setMediaCodecEnable(boolean z) {
        qmr qmrVar = this.mrCodecParameters;
        if (z) {
            qmrVar.f182012A0 = MomoPipeline.DecodeType.HARD_DECODE;
        } else {
            qmrVar.f182012A0 = MomoPipeline.DecodeType.SOFT_DECODE;
        }
    }

    public void setMergePosition(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20178w(btlVar, str, f, f2, f3, f4, f5, i);
        }
    }

    public void setMusicPath(String str, String str2) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20082F(str, str2);
        }
    }

    public void setMusicPitch(int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.setMusicPitch(i);
        }
    }

    public void setMusicVolume(float f) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.setMusicVolume(f);
        }
    }

    public void setNsStatus(boolean z, int i) {
        this.mNsStatus = z;
        this.mNsmode = i;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160342j1(z, i);
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
        this.surroundMusicExt.mo20083G1(new C3766j());
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setParameters(String str) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo162752v(str);
        } else {
            this.mConfParameters.add(str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPcmDataCallback(SinkBase.PcmDateCallback pcmDateCallback) {
        this.mPcmDateCallback = pcmDateCallback;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar == null || pcmDateCallback == null) {
            return;
        }
        ttlVar.mo160318R(new C3767k());
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPlayBackAudioLevel(float f) {
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPlayerStateCallback(OnPlayerStateCallback onPlayerStateCallback) {
        this.mPlayerStateCallback = onPlayerStateCallback;
        xsl xslVar = this.ijkInputPipline;
        if (xslVar != null) {
            xslVar.mo120999f(onPlayerStateCallback);
        }
    }

    public void setPreviewDisplay(Object obj) {
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            this.mSurface = obj;
            this.mPauseRending = false;
            rnlVar.mo97707K();
            this.cameraInputPipline.mo97704C(obj);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPreviewSize(int i, int i2) {
        this.mVisualWeigh = i;
        this.mVisualHeight = i2;
        initFilterCoreParameters();
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20168m(this.mrCodecParameters);
        }
        eyx.m118802c().m118808g("ijkconf setPreviewSize", "width:" + i + ",height:" + i2);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setPreviewSizeSetListener(ijkMediaStreamer.OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener) {
        this.mPreviewSizeSetListener = onVideoPreviewSizeSetListener;
    }

    public void setProvider(int i) {
        setBusinessType(i);
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139334H(i);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRecordDateCallback(SinkBase.RecordDateCallback recordDateCallback) {
        this.mRecordDateCallback = recordDateCallback;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar == null || recordDateCallback == null) {
            return;
        }
        ttlVar.mo160318R(new C3765i());
    }

    public void setRecordFileListener(u3m.InterfaceC20352a interfaceC20352a) {
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo139332C1(interfaceC20352a);
        }
    }

    public void setRecordPcmDataCallback(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.mRecordPcmDataCallback = pcmdataavailablecallback;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139361m1(pcmdataavailablecallback);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRole(int i) {
        this.mClientRole = i;
        eyx.m118802c().m118808g("setRole", "role:" + i);
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160293D(this.mClientRole);
        }
    }

    public void setRoom24hMode(boolean z) {
        this.mRoom24hMode = z;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160349q1(z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRoomMode(int i) {
        ttl ttlVar;
        this.mRoomMode = i;
        if (i == -1 || (ttlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        ttlVar.mo160333c1(i, this.mUseServerAudioMixer);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRoomType(int i) {
        this.mRoomtype = i;
    }

    public void setRtcEventHandlerAdapter(hgd0 hgd0Var) {
        this.mRtcEventHandlerAdapter = hgd0Var;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160343j2(hgd0Var);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRtmpPath(String str) {
        this.mrCodecParameters.f182043v0 = str;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setScreenOnWhilePublishing(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            this.mScreenOnWhilePlaying = z;
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setSei(String str) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139337J(str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setSessionID(long j) {
        this.mrCodecParameters.f155328j1 = j;
    }

    public void setSimpleMediaLogsUpload(int i, int i2, xgf0 xgf0Var) {
        if (this.moduleRegister != null) {
            fjx.m121638R().m121786s1(false);
            this.moduleRegister.mo20164i(i, i2, xgf0Var);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setSlaveAudioLevel(float f) {
        this.mSlaveAudioLevel = f;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20101W1(f);
        }
        xsl xslVar = this.ijkInputPipline;
        if (xslVar != null) {
            xslVar.setVolume(this.mSlaveAudioLevel);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setStreamerType(int i, String str) {
        this.mOutFileType = i;
        this.mOutputFilePath = str;
        this.mrCodecParameters.f182043v0 = str;
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo139367p0(i, str);
        }
    }

    public void setTargetVideoSize(int i, int i2) {
        this.mTargetVideoWidth = i;
        this.mTargetVideoHeight = i2;
        this.mrConfig.m184864H(new vif0(i, i2));
        setCameraCutSize(this.mTargetVideoWidth, this.mTargetVideoHeight);
        eyx.m118802c().m118808g("ijkconf setTargetVideoSize", "width:" + i + ",height:" + i2);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setUserID(int i) {
        qmr qmrVar = this.mrCodecParameters;
        qmrVar.f155327i1 = i;
        qmrVar.f182013B0 = i;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setUserSig(String str) {
        qmr qmrVar = this.mrCodecParameters;
        if (qmrVar != null) {
            qmrVar.f182014C0 = str;
        }
    }

    public void setVenderID(int i) {
        this.mVenderID = i;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoChannelListener(z1l0 z1l0Var) {
        this.mVideoChannelListener = z1l0Var;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160347m0(z1l0Var);
        }
    }

    public void setVideoChannelListenerExt(ttl.InterfaceC20269a interfaceC20269a) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160311M1(null);
        }
    }

    public void setVideoChannelTextureViewListener(b2l0 b2l0Var) {
        this.mTextureViewListener = b2l0Var;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160315P0(b2l0Var);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoCodeFrameRate(int i) {
        this.mVideoCodecRate = i;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoEncodingBitRate(int i) {
        this.mVideoBitRate = i;
        qmr qmrVar = this.mrCodecParameters;
        if (qmrVar == null || i == qmrVar.f177109H) {
            return;
        }
        initFilterCoreParameters();
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139342S0(this.mrCodecParameters);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoMixerBackgroundImgUrl(String str) {
        this.mBackgroundImgUrl = str;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar == null || str == null) {
            return;
        }
        ttlVar.mo160290B(str);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVideoQualityParameters(boolean z) {
        this.mVideoQualityFlg = z;
        if (getAgoraEngine() != null) {
            getAgoraEngine().setVideoQualityParameters(this.mVideoQualityFlg);
        }
    }

    public void setVideoTextureListener(cbl0 cbl0Var) {
        this.mVideoTextureListener = cbl0Var;
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setVoicebackwardsEnable(boolean z) {
        this.mVoicebackwardsEnable = z;
        eyx.m118802c().m118808g("setVoicebackwardsEnable:" + z);
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20136z(z);
        }
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo20136z(true);
        }
    }

    public void setVolumeOfEffects(int i, double d) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160309M(i, d);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setWarpType(Integer num) {
        if (num == null) {
            return;
        }
        this.warpType = num;
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.setWarpType(num.intValue());
        }
    }

    public void setWeilaCodecStatus(boolean z, boolean z2) {
        fjx.m121638R().m121723b2(z2 ? 1 : 0);
        fjx.m121638R().m121727c2(z ? 1 : 0);
    }

    public void startPlayMusic(long j) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20129v1(j);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void startPreview(String str, Object obj) {
        ii70.m136344d().m136348c("pip->PIPLINE2", "startPreview: HavaSelect=" + this.mHavaSelectFile + ";file=" + str + com.meituan.robust.Constants.PACKNAME_END + this.mSurface + "--->" + obj);
        eyx eyxVarM118802c = eyx.m118802c();
        StringBuilder sb = new StringBuilder("file:");
        sb.append(str);
        eyxVarM118802c.m118808g("startPreview", sb.toString());
        this.mSurface = obj;
        if (this.mHavaSelectFile && this.ijkInputPipline != null && this.mrCodecParameters.f182045x0.equals(str)) {
            this.ijkInputPipline.mo97707K();
            this.ijkInputPipline.mo97706J(obj);
            return;
        }
        this.mrCodecParameters.f182045x0 = str;
        this.mHavaSelectFile = true;
        initFilterCoreParameters();
        xsl xslVar = this.ijkInputPipline;
        if (xslVar != null && !this.mSelectFileStop) {
            this.mSelectFileStop = true;
            xslVar.mo97705G();
            this.moduleRegister.mo20142B(this.ijkInputPipline);
        }
        this.ijkInputPipline = this.moduleRegister.mo20173r(3, false, this.mMediaCfgParams);
        boolean z = this.mEnableSwitchAudioTrack;
        if (z) {
            openAudioTracks(z);
            setAudioTrackIndex(this.mActiveAudioTrack);
        }
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        qmr qmrVar = this.mrCodecParameters;
        int i = qmrVar.f177168u;
        int i2 = qmrVar.f177169v;
        momoPipelineModuleRegister.mo20176u(i, i2, i, i2, true);
        setPlayerStateCallback(this.mPlayerStateCallback);
        setExtAudioParameters(this.mAudio_channe_frq, this.mAudio_channe, this.mAudio_channe_layout);
        this.ijkInputPipline.mo97708i(obj);
        this.ijkInputPipline.mo121003y(this.surroundMusicExt);
        this.mSelectFileStop = false;
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160318R(new C3768l());
        }
        ii70.m136344d().m136348c("pip->PIPLINE2", "startPreview: end");
    }

    public void startPreviewEx(int i, Object obj) {
        this.mSurface = obj;
        if (this.mHavaSelectCamera && this.cameraInputPipline != null) {
            initFilterCoreParameters();
            this.moduleRegister.mo20177v(this.mrCodecParameters);
            this.cameraInputPipline.mo97707K();
            this.cameraInputPipline.mo97706J(obj);
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
        slw slwVar = this.mrConfig;
        if (i2 == 0) {
            slwVar.m184887q(0);
        } else {
            slwVar.m184887q(1);
        }
        this.cameraInputPipline = this.moduleRegister.mo20145E(this.mrConfig, new cn40());
        this.moduleRegister.mo20177v(this.mrCodecParameters);
        setWarpType(this.warpType);
        setFaceEyeScale(this.mFaceEyeScale);
        setFaceThinScale(this.mFaceThinScale);
        setFaceBeautiful(this.faceBeautiful);
        setFaceExpressionDetectSwitch(this.isActiveSwitch);
        this.cameraInputPipline.mo180080T(true);
        this.cameraInputPipline.mo97708i(obj);
        ts2 ts2Var = this.mBasicFilter;
        if (ts2Var != null) {
            selectFilter(ts2Var);
        }
    }

    public void startRecordFile(String str, String str2) {
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo139375y(str, str2);
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
    public void startRecordWithNotJoinRoom(eix eixVar) {
        dix.C16387d c16387dM111948h;
        boolean z;
        int i;
        MomoPipelineModuleRegister momoPipelineModuleRegister;
        MomoPipelineModuleRegister.LinkType linkType;
        ttl ttlVarMo20153M;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM121729d0;
        int iM121733e0;
        ejx ejxVar;
        boolean z2;
        int i6;
        int iM121729d1;
        int iM121733e1;
        ejx ejxVar2;
        ejx ejxVar3;
        ii70.m136344d().m136348c("zjlfound", "----startRecording");
        if (this.mRecording) {
            return;
        }
        this.moduleRegister.mo20180y(this.mrCodecParameters);
        if (this.cameraInputPipline == null) {
            this.emptyInputPipline = this.moduleRegister.mo20152L();
        }
        if (eixVar != null && !TextUtils.isEmpty(eixVar.m116726b())) {
            setBusinessType(eixVar.m116730f());
            c16387dM111948h = dix.m111940d().m111948h(eixVar.m116726b());
            if (c16387dM111948h != null && (ejxVar3 = c16387dM111948h.f86452e) != null && ejxVar3.f91851b == 0) {
                z = false;
            }
            if (!z) {
                eixVar = null;
            }
            i = this.mVenderID;
            momoPipelineModuleRegister = this.moduleRegister;
            if (i == 0) {
                gxl gxlVarMo20156P = momoPipelineModuleRegister.mo20156P(eixVar);
                this.momoPusherPipeline = gxlVarMo20156P;
                gxlVarMo20156P.mo160318R(new C3759c());
                this.momoPusherPipeline.mo139372u0(this.mOnlyAudio);
                this.momoPusherPipeline.mo139343T0(this.mBusinessType);
                muteLocalAudioStream(this.mLocalAudioStreamMute);
                addMRtcAudioHandler(this.mRtcAudioHandler);
                addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
                setStreamerType(this.mOutFileType, this.mOutputFilePath);
                if (z && c16387dM111948h != null) {
                    iM121729d1 = fjx.m121638R().m121729d0();
                    iM121733e1 = fjx.m121638R().m121733e0();
                    ejxVar2 = c16387dM111948h.f86452e;
                    if (ejxVar2 != null) {
                        iM121729d1 = ejxVar2.f91881l;
                        iM121733e1 = ejxVar2.f91878k;
                    }
                    this.momoPusherPipeline.mo139357i(iM121729d1, iM121733e1, new xgf0());
                }
                this.momoPusherPipeline.mo139369t0();
                this.momoPusherPipeline.mo139368t(this.mLogReportInterval);
                this.momoPusherPipeline.mo139363n(this.mLogReportCount);
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
                ttlVarMo20153M = momoPipelineModuleRegister.mo20153M(linkType, this.mAppID, eixVar);
                this.linkMicPusherPipeline = ttlVarMo20153M;
                if (ttlVarMo20153M == null) {
                    return;
                }
                enableVbr(this.enableVbr);
                this.linkMicPusherPipeline.mo160347m0(this.mVideoChannelListener);
                this.linkMicPusherPipeline.mo160351r1(this.mVideoTextureListener);
                i2 = this.mRoomMode;
                if (i2 != -1) {
                    this.linkMicPusherPipeline.mo160333c1(i2, this.mUseServerAudioMixer);
                }
                this.linkMicPusherPipeline.mo139368t(this.mLogReportInterval);
                this.linkMicPusherPipeline.mo139363n(this.mLogReportCount);
                this.linkMicPusherPipeline.mo139372u0(this.mOnlyAudio);
                this.linkMicPusherPipeline.mo139370t1(this.mAvFlag);
                this.linkMicPusherPipeline.mo139343T0(this.mBusinessType);
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
                    ii70.m136344d().m136348c("newAudio", "----startRecording:Audio Profile:" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus);
                }
                setAudioProfile(this.mAudioProfile, this.mAudioScenario);
                setVideoQualityParameters(this.mVideoQualityFlg);
                setParameters_i(this.mConfParameters);
                this.linkMicPusherPipeline.mo160294D0(this.mDefaultAudioRoutetoSpeakerphone);
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
                if (z && c16387dM111948h != null) {
                    iM121729d0 = fjx.m121638R().m121729d0();
                    iM121733e0 = fjx.m121638R().m121733e0();
                    ejxVar = c16387dM111948h.f86452e;
                    if (ejxVar != null) {
                        iM121729d0 = ejxVar.f91881l;
                        iM121733e0 = ejxVar.f91878k;
                    }
                    this.linkMicPusherPipeline.mo139357i(iM121729d0, iM121733e0, new xgf0());
                }
                fjx.m121638R().m121718a1(0);
                this.linkMicPusherPipeline.mo160319S(this.enableAudioStrero);
                this.linkMicPusherPipeline.mo139358k0();
            }
            setSlaveAudioLevel(this.mSlaveAudioLevel);
            setMasterAudioLevel(this.mMasterAudioLevel);
            setVoicebackwardsEnable(this.mVoicebackwardsEnable);
            ignoreMonitor(this.mIgnoreMonitor);
            setCustZoomFlag(this.mCusZoomFlag);
            setPcmDataCallback(this.mPcmDateCallback);
            this.mRecording = true;
        }
        c16387dM111948h = null;
        z = true;
        if (!z) {
            eixVar = null;
        }
        i = this.mVenderID;
        momoPipelineModuleRegister = this.moduleRegister;
        if (i == 0) {
            gxl gxlVarMo20156P2 = momoPipelineModuleRegister.mo20156P(eixVar);
            this.momoPusherPipeline = gxlVarMo20156P2;
            gxlVarMo20156P2.mo160318R(new C3759c());
            this.momoPusherPipeline.mo139372u0(this.mOnlyAudio);
            this.momoPusherPipeline.mo139343T0(this.mBusinessType);
            muteLocalAudioStream(this.mLocalAudioStreamMute);
            addMRtcAudioHandler(this.mRtcAudioHandler);
            addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
            setStreamerType(this.mOutFileType, this.mOutputFilePath);
            if (z) {
                iM121729d1 = fjx.m121638R().m121729d0();
                iM121733e1 = fjx.m121638R().m121733e0();
                ejxVar2 = c16387dM111948h.f86452e;
                if (ejxVar2 != null) {
                    iM121729d1 = ejxVar2.f91881l;
                    iM121733e1 = ejxVar2.f91878k;
                }
                this.momoPusherPipeline.mo139357i(iM121729d1, iM121733e1, new xgf0());
            }
            this.momoPusherPipeline.mo139369t0();
            this.momoPusherPipeline.mo139368t(this.mLogReportInterval);
            this.momoPusherPipeline.mo139363n(this.mLogReportCount);
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
            ttlVarMo20153M = momoPipelineModuleRegister.mo20153M(linkType, this.mAppID, eixVar);
            this.linkMicPusherPipeline = ttlVarMo20153M;
            if (ttlVarMo20153M == null) {
                return;
            }
            enableVbr(this.enableVbr);
            this.linkMicPusherPipeline.mo160347m0(this.mVideoChannelListener);
            this.linkMicPusherPipeline.mo160351r1(this.mVideoTextureListener);
            i2 = this.mRoomMode;
            if (i2 != -1) {
                this.linkMicPusherPipeline.mo160333c1(i2, this.mUseServerAudioMixer);
            }
            this.linkMicPusherPipeline.mo139368t(this.mLogReportInterval);
            this.linkMicPusherPipeline.mo139363n(this.mLogReportCount);
            this.linkMicPusherPipeline.mo139372u0(this.mOnlyAudio);
            this.linkMicPusherPipeline.mo139370t1(this.mAvFlag);
            this.linkMicPusherPipeline.mo139343T0(this.mBusinessType);
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
                ii70.m136344d().m136348c("newAudio", "----startRecording:Audio Profile:" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus);
            }
            setAudioProfile(this.mAudioProfile, this.mAudioScenario);
            setVideoQualityParameters(this.mVideoQualityFlg);
            setParameters_i(this.mConfParameters);
            this.linkMicPusherPipeline.mo160294D0(this.mDefaultAudioRoutetoSpeakerphone);
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
                iM121729d0 = fjx.m121638R().m121729d0();
                iM121733e0 = fjx.m121638R().m121733e0();
                ejxVar = c16387dM111948h.f86452e;
                if (ejxVar != null) {
                    iM121729d0 = ejxVar.f91881l;
                    iM121733e0 = ejxVar.f91878k;
                }
                this.linkMicPusherPipeline.mo139357i(iM121729d0, iM121733e0, new xgf0());
            }
            fjx.m121638R().m121718a1(0);
            this.linkMicPusherPipeline.mo160319S(this.enableAudioStrero);
            this.linkMicPusherPipeline.mo139358k0();
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
    public synchronized void startRecording(eix eixVar) {
        dix.C16387d c16387dM111948h;
        boolean z;
        int i;
        MomoPipelineModuleRegister momoPipelineModuleRegister;
        MomoPipelineModuleRegister.LinkType linkType;
        ttl ttlVarMo20153M;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM121729d0;
        int iM121733e0;
        ejx ejxVar;
        boolean z2;
        int i6;
        int iM121729d1;
        int iM121733e1;
        ejx ejxVar2;
        ejx ejxVar3;
        try {
            ii70.m136344d().m136348c("zjlfound", "----startRecording");
            if (this.mRecording) {
                return;
            }
            if (eixVar != null && !TextUtils.isEmpty(eixVar.m116726b())) {
                setBusinessType(eixVar.m116730f());
                c16387dM111948h = dix.m111940d().m111948h(eixVar.m116726b());
                if (c16387dM111948h != null && (ejxVar3 = c16387dM111948h.f86452e) != null && ejxVar3.f91851b == 0) {
                    z = false;
                }
                if (!z) {
                    eixVar = null;
                }
                this.moduleRegister.mo20180y(this.mrCodecParameters);
                if (this.cameraInputPipline == null) {
                    this.emptyInputPipline = this.moduleRegister.mo20152L();
                }
                i = this.mVenderID;
                momoPipelineModuleRegister = this.moduleRegister;
                if (i == 0) {
                    gxl gxlVarMo20156P = momoPipelineModuleRegister.mo20156P(eixVar);
                    this.momoPusherPipeline = gxlVarMo20156P;
                    gxlVarMo20156P.mo160318R(new C3758b());
                    if (z && c16387dM111948h != null) {
                        iM121729d1 = fjx.m121638R().m121729d0();
                        iM121733e1 = fjx.m121638R().m121733e0();
                        ejxVar2 = c16387dM111948h.f86452e;
                        if (ejxVar2 != null) {
                            iM121729d1 = ejxVar2.f91881l;
                            iM121733e1 = ejxVar2.f91878k;
                        }
                        this.momoPusherPipeline.mo139357i(iM121729d1, iM121733e1, new xgf0());
                    }
                    this.momoPusherPipeline.mo139372u0(this.mOnlyAudio);
                    this.momoPusherPipeline.mo139343T0(this.mBusinessType);
                    muteLocalAudioStream(this.mLocalAudioStreamMute);
                    addMRtcAudioHandler(this.mRtcAudioHandler);
                    addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
                    setStreamerType(this.mOutFileType, this.mOutputFilePath);
                    this.momoPusherPipeline.mo139369t0();
                    this.momoPusherPipeline.mo139368t(this.mLogReportInterval);
                    this.momoPusherPipeline.mo139363n(this.mLogReportCount);
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
                    ttlVarMo20153M = momoPipelineModuleRegister.mo20153M(linkType, this.mAppID, eixVar);
                    this.linkMicPusherPipeline = ttlVarMo20153M;
                    if (ttlVarMo20153M == null) {
                        return;
                    }
                    enableVbr(this.enableVbr);
                    this.linkMicPusherPipeline.mo160347m0(this.mVideoChannelListener);
                    this.linkMicPusherPipeline.mo160351r1(this.mVideoTextureListener);
                    this.linkMicPusherPipeline.mo160315P0(this.mTextureViewListener);
                    this.linkMicPusherPipeline.mo160311M1(null);
                    i2 = this.mRoomMode;
                    if (i2 != -1) {
                        this.linkMicPusherPipeline.mo160333c1(i2, this.mUseServerAudioMixer);
                    }
                    this.linkMicPusherPipeline.mo139368t(this.mLogReportInterval);
                    this.linkMicPusherPipeline.mo139363n(this.mLogReportCount);
                    this.linkMicPusherPipeline.mo139372u0(this.mOnlyAudio);
                    this.linkMicPusherPipeline.mo139370t1(this.mAvFlag);
                    this.linkMicPusherPipeline.mo139343T0(this.mBusinessType);
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
                        ii70.m136344d().m136348c("newAudio", "----startRecording:Audio Profile:" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus);
                    }
                    setAudioProfile(this.mAudioProfile, this.mAudioScenario);
                    setVideoQualityParameters(this.mVideoQualityFlg);
                    setParameters_i(this.mConfParameters);
                    this.linkMicPusherPipeline.mo160294D0(this.mDefaultAudioRoutetoSpeakerphone);
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
                    if (z && c16387dM111948h != null) {
                        iM121729d0 = fjx.m121638R().m121729d0();
                        iM121733e0 = fjx.m121638R().m121733e0();
                        ejxVar = c16387dM111948h.f86452e;
                        if (ejxVar != null) {
                            iM121729d0 = ejxVar.f91881l;
                            iM121733e0 = ejxVar.f91878k;
                        }
                        this.linkMicPusherPipeline.mo139357i(iM121729d0, iM121733e0, new xgf0());
                    }
                    fjx.m121638R().m121718a1(0);
                    this.linkMicPusherPipeline.mo160319S(this.enableAudioStrero);
                    this.linkMicPusherPipeline.mo139369t0();
                }
                setSlaveAudioLevel(this.mSlaveAudioLevel);
                setMasterAudioLevel(this.mMasterAudioLevel);
                setVoicebackwardsEnable(this.mVoicebackwardsEnable);
                ignoreMonitor(this.mIgnoreMonitor);
                setCustZoomFlag(this.mCusZoomFlag);
                setPcmDataCallback(this.mPcmDateCallback);
                this.mRecording = true;
            }
            c16387dM111948h = null;
            z = true;
            if (!z) {
                eixVar = null;
            }
            this.moduleRegister.mo20180y(this.mrCodecParameters);
            if (this.cameraInputPipline == null) {
                this.emptyInputPipline = this.moduleRegister.mo20152L();
            }
            i = this.mVenderID;
            momoPipelineModuleRegister = this.moduleRegister;
            if (i == 0) {
                gxl gxlVarMo20156P2 = momoPipelineModuleRegister.mo20156P(eixVar);
                this.momoPusherPipeline = gxlVarMo20156P2;
                gxlVarMo20156P2.mo160318R(new C3758b());
                if (z) {
                    iM121729d1 = fjx.m121638R().m121729d0();
                    iM121733e1 = fjx.m121638R().m121733e0();
                    ejxVar2 = c16387dM111948h.f86452e;
                    if (ejxVar2 != null) {
                        iM121729d1 = ejxVar2.f91881l;
                        iM121733e1 = ejxVar2.f91878k;
                    }
                    this.momoPusherPipeline.mo139357i(iM121729d1, iM121733e1, new xgf0());
                }
                this.momoPusherPipeline.mo139372u0(this.mOnlyAudio);
                this.momoPusherPipeline.mo139343T0(this.mBusinessType);
                muteLocalAudioStream(this.mLocalAudioStreamMute);
                addMRtcAudioHandler(this.mRtcAudioHandler);
                addMRtcAudioHandlerEx(this.mRtcAudioHandlerEx);
                setStreamerType(this.mOutFileType, this.mOutputFilePath);
                this.momoPusherPipeline.mo139369t0();
                this.momoPusherPipeline.mo139368t(this.mLogReportInterval);
                this.momoPusherPipeline.mo139363n(this.mLogReportCount);
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
                ttlVarMo20153M = momoPipelineModuleRegister.mo20153M(linkType, this.mAppID, eixVar);
                this.linkMicPusherPipeline = ttlVarMo20153M;
                if (ttlVarMo20153M == null) {
                    return;
                }
                enableVbr(this.enableVbr);
                this.linkMicPusherPipeline.mo160347m0(this.mVideoChannelListener);
                this.linkMicPusherPipeline.mo160351r1(this.mVideoTextureListener);
                this.linkMicPusherPipeline.mo160315P0(this.mTextureViewListener);
                this.linkMicPusherPipeline.mo160311M1(null);
                i2 = this.mRoomMode;
                if (i2 != -1) {
                    this.linkMicPusherPipeline.mo160333c1(i2, this.mUseServerAudioMixer);
                }
                this.linkMicPusherPipeline.mo139368t(this.mLogReportInterval);
                this.linkMicPusherPipeline.mo139363n(this.mLogReportCount);
                this.linkMicPusherPipeline.mo139372u0(this.mOnlyAudio);
                this.linkMicPusherPipeline.mo139370t1(this.mAvFlag);
                this.linkMicPusherPipeline.mo139343T0(this.mBusinessType);
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
                    ii70.m136344d().m136348c("newAudio", "----startRecording:Audio Profile:" + this.mAudioProfile + "/" + this.mAudioScenario + Constants.SEPARATOR_COMMA + this.mVenderID + Constants.SEPARATOR_COMMA + this.mAudioHighQualityFlg + Constants.SEPARATOR_COMMA + this.mAudioProfileStatus);
                }
                setAudioProfile(this.mAudioProfile, this.mAudioScenario);
                setVideoQualityParameters(this.mVideoQualityFlg);
                setParameters_i(this.mConfParameters);
                this.linkMicPusherPipeline.mo160294D0(this.mDefaultAudioRoutetoSpeakerphone);
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
                    iM121729d0 = fjx.m121638R().m121729d0();
                    iM121733e0 = fjx.m121638R().m121733e0();
                    ejxVar = c16387dM111948h.f86452e;
                    if (ejxVar != null) {
                        iM121729d0 = ejxVar.f91881l;
                        iM121733e0 = ejxVar.f91878k;
                    }
                    this.linkMicPusherPipeline.mo139357i(iM121729d0, iM121733e0, new xgf0());
                }
                fjx.m121638R().m121718a1(0);
                this.linkMicPusherPipeline.mo160319S(this.enableAudioStrero);
                this.linkMicPusherPipeline.mo139369t0();
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

    public void startScreenPushlish(Activity activity, qmr qmrVar) {
        this.mScreenCodecParameters = qmrVar;
        this.mMediaProjectionManager = (MediaProjectionManager) activity.getSystemService("media_projection");
        n8c.m158485c("ScreenRecordActivity", Build.VERSION.SDK_INT + ">=21");
        activity.startActivityForResult(this.mMediaProjectionManager.createScreenCaptureIntent(), 1111);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void startSurroundMusic(String str, int i, long j) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20093O1(str);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void startSurroundMusicEx(String str, boolean z, boolean z2, int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160350r0(str, z, z2, i);
        }
    }

    public void stopAllEffects() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.stopAllEffects();
        }
    }

    public void stopEffect(int i) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.stopEffect(i);
        }
    }

    public void stopPlayMusic() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20091N1();
        }
    }

    public void stopRecordFile() {
        gxl gxlVar = this.momoPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo139352e2();
        }
    }

    public void stopRecordWithNotLeaveRoom() {
        if (this.mRecording) {
            gxl gxlVar = this.momoPusherPipeline;
            if (gxlVar != null) {
                gxlVar.mo139353f();
                MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
                if (momoPipelineModuleRegister != null) {
                    momoPipelineModuleRegister.mo20181z(this.momoPusherPipeline);
                }
            }
            ttl ttlVar = this.linkMicPusherPipeline;
            if (ttlVar != null) {
                ttlVar.mo139330A();
                MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.moduleRegister;
                if (momoPipelineModuleRegister2 != null) {
                    momoPipelineModuleRegister2.mo20181z(this.linkMicPusherPipeline);
                }
            }
            this.mRecording = false;
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void stopRecording() {
        if (this.mRecording) {
            gxl gxlVar = this.momoPusherPipeline;
            if (gxlVar != null) {
                gxlVar.mo139353f();
                MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
                if (momoPipelineModuleRegister != null) {
                    momoPipelineModuleRegister.mo20181z(this.momoPusherPipeline);
                }
            }
            ttl ttlVar = this.linkMicPusherPipeline;
            if (ttlVar != null) {
                ttlVar.mo139353f();
                MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.moduleRegister;
                if (momoPipelineModuleRegister2 != null) {
                    momoPipelineModuleRegister2.mo20181z(this.linkMicPusherPipeline);
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
        eyx.m118802c().m118808g("stopRenderer");
        ii70.m136344d().m136348c("pip->PIPLINE2", "stopRenderer: stopRenderer()");
        this.mSelectFileStop = true;
        this.ijkInputPipline.mo97705G();
        this.moduleRegister.mo20142B(this.ijkInputPipline);
        this.ijkInputPipline = null;
        ii70.m136344d().m136348c("pip->PIPLINE2", "stopRenderer: stopRenderer() end");
    }

    public void stopScreenPushlish() {
        gxl gxlVar = this.mScreenPusherPipeline;
        if (gxlVar != null) {
            gxlVar.mo139353f();
            MomoPipelineModuleRegister momoPipelineModuleRegister = this.mScreenPipelineModuleRegister;
            if (momoPipelineModuleRegister != null) {
                momoPipelineModuleRegister.mo20143C(this.mScreenPusherPipeline);
            }
            this.mScreenPusherPipeline = null;
        }
        v2m v2mVar = this.mScreenInputPipline;
        if (v2mVar != null) {
            v2mVar.mo97705G();
            this.mScreenPipelineModuleRegister.mo20142B(this.emptyInputPipline);
            this.mScreenInputPipline = null;
        }
        MomoPipelineModuleRegister momoPipelineModuleRegister2 = this.mScreenPipelineModuleRegister;
        if (momoPipelineModuleRegister2 != null) {
            momoPipelineModuleRegister2.mo20175t();
            this.mScreenPipelineModuleRegister = null;
            ijkMediaStreamer.onRecordSuccessListener onrecordsuccesslistener = this.mOnRecordSuccessListener;
            if (onrecordsuccesslistener == null || this.mRecordScreenError) {
                return;
            }
            onrecordsuccesslistener.m222840a(this);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void stopSurroundMusic() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.stopSurroundMusic();
        }
    }

    public void stopSurroundMusic_NoDelay() {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo160326Y();
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void switchCamera() {
        eyx.m118802c().m118808g(BLiveButtonType.switchCamera);
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null && this.mrConfig != null) {
            rnlVar.mo180088i0(this.mContextRef.get(), this.mrConfig);
        }
        ii70.m136344d().m136348c("ijkConferenceStreamer", BLiveButtonType.switchCamera);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void unSelectCamera() {
        this.mHavaSelectCamera = false;
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null) {
            rnlVar.mo97705G();
            this.cameraInputPipline.mo180095r();
            this.moduleRegister.mo20142B(this.cameraInputPipline);
            this.cameraInputPipline = null;
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void updateChannelkey(String str) {
        ttl ttlVar;
        this.mChannelkey = str;
        if (TextUtils.isEmpty(str) || (ttlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        ttlVar.mo160346l2(str);
    }

    public void setMergePosition(btl btlVar, String str, float f, float f2, float f3, float f4, float f5, int i, int i2, int i3) {
        MomoPipelineModuleRegister momoPipelineModuleRegister = this.moduleRegister;
        if (momoPipelineModuleRegister != null) {
            momoPipelineModuleRegister.mo20166k(btlVar, str, f, f2, f3, f4, f5, i, i2, i3);
        }
    }

    public void startPlayMusic(long j, boolean z) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo20102Y0(j, z);
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void selectFaceDetectFilter(Context context, ts2 ts2Var) {
        selectFaceDetectFilter(ts2Var);
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void setRoomMode(int i, boolean z) {
        ttl ttlVar;
        this.mRoomMode = i;
        this.mUseServerAudioMixer = z;
        if (i == -1 || (ttlVar = this.linkMicPusherPipeline) == null) {
            return;
        }
        ttlVar.mo160333c1(i, z);
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$b */
    public class C3758b implements ya1 {
        public C3758b() {
        }

        @Override // p149l.ya1
        /* JADX INFO: renamed from: C */
        public mpd0 mo18364C(mpd0 mpd0Var) {
            return mpd0Var;
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$c */
    public class C3759c implements ya1 {
        public C3759c() {
        }

        @Override // p149l.ya1
        /* JADX INFO: renamed from: C */
        public mpd0 mo18364C(mpd0 mpd0Var) {
            return mpd0Var;
        }
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$l */
    public class C3768l implements ya1 {
        public C3768l() {
        }

        @Override // p149l.ya1
        /* JADX INFO: renamed from: C */
        public mpd0 mo18364C(mpd0 mpd0Var) {
            return mpd0Var;
        }
    }

    public boolean playEffect(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            return ttlVar.mo160306K1(i, str, i2, d, d2, z, d3);
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
        ttl ttlVar = this.linkMicPusherPipeline;
        if (ttlVar != null) {
            ttlVar.mo139342S0(this.mrCodecParameters);
        }
    }

    public void switchCamera(Activity activity) {
        slw slwVar;
        rnl rnlVar = this.cameraInputPipline;
        if (rnlVar != null && (slwVar = this.mrConfig) != null && activity != null) {
            rnlVar.mo180088i0(activity, slwVar);
        }
        ii70.m136344d().m136348c("ijkConferenceStreamer", BLiveButtonType.switchCamera);
    }

    /* JADX INFO: renamed from: com.immomo.ijkConferenceStreamer$g */
    public class C3763g implements MomoPipelineModuleRegister.InterfaceC4110a {
        public C3763g() {
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4110a
        /* JADX INFO: renamed from: b */
        public void mo18363b(int i, int i2, j1m j1mVar) {
            ijkConferenceStreamer.this.mErrorCode = g860.m124745a(i, i2);
            synchronized (ijkConferenceStreamer.this.mSynRelease) {
                try {
                    if (ijkConferenceStreamer.this.mOnErrorListener != null) {
                        ijkConferenceStreamer.this.mOnErrorListener.m222829a(ijkConferenceStreamer.this, i, i2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.pub.MomoPipelineModuleRegister.InterfaceC4110a
        /* JADX INFO: renamed from: a */
        public void mo18362a(int i, int i2, j1m j1mVar) {
        }
    }

    @Override // tv.danmaku.ijk.media.streamer.ijkMediaStreamer
    public void startPreview(int i, Object obj) {
        this.mSurface = obj;
        if (this.mHavaSelectCamera && this.cameraInputPipline != null) {
            initFilterCoreParameters();
            this.moduleRegister.mo20168m(this.mrCodecParameters);
            this.cameraInputPipline.mo97707K();
            this.cameraInputPipline.mo97704C(obj);
            return;
        }
        if (obj == null && this.cameraInputPipline == null) {
            return;
        }
        this.mHavaSelectCamera = true;
        this.mCameraID = i;
        initFilterCoreParameters();
        int i2 = this.mCameraID;
        slw slwVar = this.mrConfig;
        if (i2 == 0) {
            slwVar.m184887q(0);
        } else {
            slwVar.m184887q(1);
        }
        this.cameraInputPipline = this.moduleRegister.mo20145E(this.mrConfig, new cn40());
        setWarpType(this.warpType);
        setFaceEyeScale(this.mFaceEyeScale);
        setFaceThinScale(this.mFaceThinScale);
        setFaceBeautiful(this.faceBeautiful);
        setFaceExpressionDetectSwitch(this.isActiveSwitch);
        this.cameraInputPipline.mo180080T(true);
        this.cameraInputPipline.mo97708i(obj);
        ts2 ts2Var = this.mBasicFilter;
        if (ts2Var != null) {
            selectFilter(ts2Var);
        }
    }

    public ijkConferenceStreamer(Activity activity, eix eixVar) {
        this(activity, 1, "", false, eixVar);
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
