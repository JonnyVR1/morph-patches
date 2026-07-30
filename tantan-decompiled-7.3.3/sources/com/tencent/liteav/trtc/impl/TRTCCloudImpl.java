package com.tencent.liteav.trtc.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.DetectDelayStopHelper;
import com.core.glcore.util.ErrorCode;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.FirebaseError;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.liteav.C14270d;
import com.tencent.liteav.C14273g;
import com.tencent.liteav.C14274h;
import com.tencent.liteav.InterfaceC14318o;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.audio.C14143a;
import com.tencent.liteav.audio.InterfaceC14145c;
import com.tencent.liteav.audio.InterfaceC14146d;
import com.tencent.liteav.audio.InterfaceC14147e;
import com.tencent.liteav.audio.InterfaceC14148f;
import com.tencent.liteav.audio.InterfaceC14149g;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.audio.TXCAudioEncoderConfig;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.audio.TXCLiveBGMPlayer;
import com.tencent.liteav.audio.TXCSoundEffectPlayer;
import com.tencent.liteav.audio.impl.TXCAudioEngineJNI;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p091a.C14166a;
import com.tencent.liteav.basic.p091a.EnumC14167b;
import com.tencent.liteav.basic.p091a.EnumC14168c;
import com.tencent.liteav.basic.p092b.InterfaceC14169a;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.InterfaceC14185o;
import com.tencent.liteav.basic.structs.C14204a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14213d;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.HandlerC14214e;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.renderer.C14344a;
import com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e;
import com.tencent.liteav.screencapture.C14352a;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.p114ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import com.tencent.trtc.TRTCStatistics;
import com.tencent.trtc.TRTCSubCloud;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.microedition.khronos.egl.EGLContext;
import org.eclipse.jetty.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
public class TRTCCloudImpl extends TRTCCloud implements SurfaceHolder.Callback, TXCRenderAndDec.InterfaceC14127b, InterfaceC14145c, InterfaceC14146d, InterfaceC14147e, InterfaceC14148f, InterfaceC14149g, InterfaceC14170b, C14270d.a, InterfaceC14318o, C14352a.a {
    private static final int DEFAULT_FPS_FOR_SCREEN_CAPTURE = 10;
    private static final int DEFAULT_GOP_FOR_SCREEN_CAPTURE = 3;
    private static final String KEY_CONFIG_ADJUST_RESOLUTION = "config_adjust_resolution";
    private static final String KEY_CONFIG_FPS = "config_fps";
    private static final String KEY_CONFIG_GOP = "config_gop";
    private static final int MIN_VOLUME_EVALUATION_INTERVAL_MS = 100;
    private static final int RECV_MODE_AUTO_AUDIO_ONLY = 2;
    private static final int RECV_MODE_AUTO_AUDIO_VIDEO = 1;
    private static final int RECV_MODE_AUTO_VIDEO_ONLY = 3;
    private static final int RECV_MODE_MANUAL = 4;
    private static final int RECV_MODE_UNKNOWN = 0;
    protected static final int ROOM_STATE_ENTRING = 1;
    private static final int ROOM_STATE_IN = 2;
    protected static final int ROOM_STATE_OUT = 0;
    private static final int STATE_INTERVAL = 2000;
    private static final String TAG = "TRTCCloudImpl";
    private static TRTCCloudImpl sInstance;
    protected int mAppScene;
    private int mAudioCaptureVolume;
    protected TRTCCloudListener.TRTCAudioFrameListener mAudioFrameListener;
    private int mAudioPlayoutVolume;
    protected int mAudioVolumeEvalInterval;
    private TRTCCloud.BGMNotify mBGMNotify;
    private int mBackground;
    private InterfaceC14169a mCallback;
    protected C14270d mCaptureAndEnc;
    private long mCaptureFrameCount;
    private int mCodecType;
    protected C14273g mConfig;
    protected Context mContext;
    private int mCurrentOrientation;
    protected HashMap<Integer, TRTCCloudImpl> mCurrentPublishClouds;
    protected int mCurrentRole;
    private boolean mCustomRemoteRender;
    private TRTCCustomTextureUtil mCustomVideoUtil;
    protected int mDebugType;
    private Display mDisplay;
    private boolean mEnableCustomAudioCapture;
    private boolean mEnableCustomVideoCapture;
    protected boolean mEnableEosMode;
    private boolean mEnableSmallStream;
    private boolean mEnableSoftAEC;
    private boolean mEnableSoftAGC;
    private boolean mEnableSoftANS;
    private View mFloatingWindow;
    private int mFramework;
    private boolean mIsAudioCapturing;
    protected boolean mIsExitOldRoom;
    private boolean mIsVideoCapturing;
    private long mLastCaptureCalculateTS;
    private long mLastCaptureFrameCount;
    private long mLastLogCustomCmdMsgTs;
    private long mLastLogSEIMsgTs;
    private long mLastSendMsgTimeMs;
    protected long mLastStateTimeMs;
    private final Bundle mLatestParamsOfBigEncoder;
    private final Bundle mLatestParamsOfSmallEncoder;
    private Handler mListenerHandler;
    private HandlerC14214e mMainHandler;
    protected Object mNativeLock;
    protected long mNativeRtcContext;
    private int mNetType;
    private DisplayOrientationDetector mOrientationEventListener;
    private boolean mOverrideFPSFromUser;
    protected int mPerformanceMode;
    protected int mPriorStreamType;
    private int mQosMode;
    private int mQosPreference;
    private long mRecvCustomCmdMsgCountInPeriod;
    protected int mRecvMode;
    private long mRecvSEIMsgCountInPeriod;
    protected HashMap<String, RenderListenerAdapter> mRenderListenerMap;
    protected TRTCRoomInfo mRoomInfo;
    protected int mRoomState;
    protected HandlerC14214e mSDKHandler;
    private int mSendMsgCount;
    private int mSendMsgSize;
    private int mSensorMode;
    private final TRTCCloudDef.TRTCVideoEncParam mSmallEncParam;
    private int mSoftAECLevel;
    private int mSoftAGCLevel;
    private int mSoftANSLevel;
    private StatusTask mStatusNotifyTask;
    private Set<Integer> mStreamTypes;
    protected ArrayList<WeakReference<TRTCCloudImpl>> mSubClouds;
    protected TRTCCloudListener mTRTCListener;
    protected int mTargetRole;
    private int mVideoRenderMirror;
    private TRTCVideoServerConfig mVideoServerConfig;
    private VideoSourceType mVideoSourceType;
    private VolumeLevelNotifyTask mVolumeLevelNotifyTask;
    final TXAudioEffectManager.TXVoiceReverbType[] reverbTypes;
    final TXAudioEffectManager.TXVoiceChangerType[] voiceChangerTypes;

    /* JADX INFO: renamed from: com.tencent.liteav.trtc.impl.TRTCCloudImpl$108, reason: invalid class name */
    public class AnonymousClass108 implements Runnable {
        final /* synthetic */ int val$showType;

        public AnonymousClass108(int i) {
            this.val$showType = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TRTCCloudImpl.this.apiLog("showDebugView " + this.val$showType);
            TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
            tRTCCloudImpl.mDebugType = this.val$showType;
            final TXCloudVideoView tXCloudVideoView = tRTCCloudImpl.mRoomInfo.localView;
            if (tXCloudVideoView != null) {
                tRTCCloudImpl.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.108.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tXCloudVideoView.showVideoDebugLog(AnonymousClass108.this.val$showType);
                    }
                });
            }
            TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.108.2
                @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                    final TXCloudVideoView tXCloudVideoView2 = userInfo.mainRender.view;
                    final TXCloudVideoView tXCloudVideoView3 = userInfo.subRender.view;
                    if (tXCloudVideoView2 == null && tXCloudVideoView3 == null) {
                        return;
                    }
                    TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.108.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TXCloudVideoView tXCloudVideoView4 = tXCloudVideoView2;
                            if (tXCloudVideoView4 != null) {
                                tXCloudVideoView4.showVideoDebugLog(AnonymousClass108.this.val$showType);
                            }
                            TXCloudVideoView tXCloudVideoView5 = tXCloudVideoView3;
                            if (tXCloudVideoView5 != null) {
                                tXCloudVideoView5.showVideoDebugLog(AnonymousClass108.this.val$showType);
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.trtc.impl.TRTCCloudImpl$130, reason: invalid class name */
    public class AnonymousClass130 implements Runnable {
        final /* synthetic */ int val$err;

        public AnonymousClass130(int i) {
            this.val$err = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
            if (tRTCCloudImpl.mIsExitOldRoom) {
                tRTCCloudImpl.mIsExitOldRoom = false;
                tRTCCloudImpl.apiLog("exit no current room, ignore onExitRoom.");
                return;
            }
            boolean zIsMicStard = tRTCCloudImpl.mRoomInfo.isMicStard();
            TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
            if (!zIsMicStard) {
                tRTCCloudImpl2.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.130.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass130 anonymousClass130 = AnonymousClass130.this;
                        TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                        if (tRTCCloudListener != null) {
                            tRTCCloudListener.onExitRoom(anonymousClass130.val$err);
                        }
                    }
                });
                return;
            }
            tRTCCloudImpl2.mRoomInfo.setRoomExit(true, this.val$err);
            TRTCCloudImpl.this.apiLog("onExitRoom delay 2s when mic is not release.");
            TRTCCloudImpl.this.runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.130.1
                @Override // java.lang.Runnable
                public void run() {
                    if (TRTCCloudImpl.this.mRoomInfo.isRoomExit()) {
                        TRTCCloudImpl.this.apiLog("force onExitRoom after 2s");
                        final int roomExitCode = TRTCCloudImpl.this.mRoomInfo.getRoomExitCode();
                        TRTCCloudImpl.this.mRoomInfo.setRoomExit(false, 0);
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.130.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                                if (tRTCCloudListener != null) {
                                    tRTCCloudListener.onExitRoom(roomExitCode);
                                }
                            }
                        });
                    }
                }
            }, 2000);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.trtc.impl.TRTCCloudImpl$24 */
    public class RunnableC1439124 implements Runnable {
        final /* synthetic */ TRTCCloudListener.TRTCSnapshotListener val$listener;
        final /* synthetic */ int val$streamType;
        final /* synthetic */ String val$userId;

        public RunnableC1439124(String str, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, int i) {
            this.val$userId = str;
            this.val$listener = tRTCSnapshotListener;
            this.val$streamType = i;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0073  */
        @Override // java.lang.Runnable
        public void run() {
            TRTCRoomInfo.RenderInfo renderInfo;
            TextureViewSurfaceTextureListenerC14348e videoRender;
            TRTCRoomInfo.RenderInfo renderInfo2;
            String str = this.val$userId;
            TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
            if (str == null) {
                tRTCCloudImpl.apiLog("snapshotLocalView");
                TRTCCloudImpl.this.mCaptureAndEnc.m84659a(new InterfaceC14185o() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.24.1
                    @Override // com.tencent.liteav.basic.p093c.InterfaceC14185o
                    public void onTakePhotoComplete(final Bitmap bitmap) {
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.24.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener = RunnableC1439124.this.val$listener;
                                if (tRTCSnapshotListener != null) {
                                    tRTCSnapshotListener.onSnapshotComplete(bitmap);
                                }
                            }
                        });
                    }
                });
                return;
            }
            TRTCRoomInfo.UserInfo user = tRTCCloudImpl.mRoomInfo.getUser(str);
            if (this.val$streamType == 2) {
                if (user == null || (renderInfo2 = user.mainRender) == null || renderInfo2.render == null) {
                    videoRender = null;
                } else {
                    TRTCCloudImpl.this.apiLog("snapshotRemoteSubStreamView->userId: " + this.val$userId);
                    videoRender = user.subRender.render.getVideoRender();
                }
            } else if (user == null || (renderInfo = user.mainRender) == null || renderInfo.render == null) {
                videoRender = null;
            } else {
                TRTCCloudImpl.this.apiLog("snapshotRemoteView->userId: " + this.val$userId);
                videoRender = user.mainRender.render.getVideoRender();
            }
            if (videoRender != null) {
                videoRender.m85101a(new InterfaceC14185o() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.24.2
                    @Override // com.tencent.liteav.basic.p093c.InterfaceC14185o
                    public void onTakePhotoComplete(final Bitmap bitmap) {
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.24.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener = RunnableC1439124.this.val$listener;
                                if (tRTCSnapshotListener != null) {
                                    tRTCSnapshotListener.onSnapshotComplete(bitmap);
                                }
                            }
                        });
                    }
                });
            } else {
                TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.24.3
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener = RunnableC1439124.this.val$listener;
                        if (tRTCSnapshotListener != null) {
                            tRTCSnapshotListener.onSnapshotComplete(null);
                        }
                    }
                });
            }
        }
    }

    public static class DisplayOrientationDetector extends OrientationEventListener {
        public int mCurOrientation;
        private int mCurrentDisplayRotation;
        private WeakReference<TRTCCloudImpl> mTRTCEngine;

        public DisplayOrientationDetector(Context context, TRTCCloudImpl tRTCCloudImpl) {
            super(context);
            this.mCurOrientation = -1;
            this.mCurrentDisplayRotation = 0;
            this.mTRTCEngine = new WeakReference<>(tRTCCloudImpl);
        }

        public void checkOrientation() {
            int displayRotation;
            TRTCCloudImpl tRTCCloudImpl = this.mTRTCEngine.get();
            if (tRTCCloudImpl == null || this.mCurrentDisplayRotation == (displayRotation = tRTCCloudImpl.getDisplayRotation())) {
                return;
            }
            this.mCurrentDisplayRotation = displayRotation;
            tRTCCloudImpl.setOrientation(this.mCurOrientation);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            if (i == -1) {
                TXCLog.m84152i("DisplayOrientationDetector", "rotation-change invalid " + i);
                return;
            }
            int i2 = 1;
            if (i > 45) {
                if (i <= 135) {
                    i2 = 2;
                } else if (i <= 225) {
                    i2 = 3;
                } else if (i <= 315) {
                    i2 = 0;
                }
            }
            if (this.mCurOrientation != i2) {
                this.mCurOrientation = i2;
                TRTCCloudImpl tRTCCloudImpl = this.mTRTCEngine.get();
                if (tRTCCloudImpl != null) {
                    this.mCurrentDisplayRotation = tRTCCloudImpl.getDisplayRotation();
                    tRTCCloudImpl.setOrientation(this.mCurOrientation);
                }
                StringBuilder sb = new StringBuilder("rotation-change onOrientationChanged ");
                sb.append(i);
                sb.append(", orientation ");
                sb.append(this.mCurOrientation);
                sb.append(" self:");
                sb.append(tRTCCloudImpl != null ? Integer.valueOf(tRTCCloudImpl.hashCode()) : "");
                TXCLog.m84147d("DisplayOrientationDetector", sb.toString());
            }
        }
    }

    public static class RenderListenerAdapter {
        public int bufferType;
        public TRTCCloudListener.TRTCVideoRenderListener listener;
        public int pixelFormat;
        public String strTinyID;
    }

    public static class StatusTask implements Runnable {
        private WeakReference<TRTCCloudImpl> mTRTCEngine;

        public StatusTask(TRTCCloudImpl tRTCCloudImpl) {
            this.mTRTCEngine = new WeakReference<>(tRTCCloudImpl);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            TRTCCloudImpl tRTCCloudImpl = this.mTRTCEngine.get();
            if (tRTCCloudImpl == null) {
                return;
            }
            int iM84236e = C14215f.m84236e(tRTCCloudImpl.mContext);
            int[] iArrM84226a = C14215f.m84226a();
            int iM84227b = C14215f.m84227b() * 1024;
            TXCStatus.m84178a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomErrorUnsupportSamplerate, Integer.valueOf(iM84236e));
            TXCStatus.m84178a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomErrorUpVideoAuthFailed, Integer.valueOf(iArrM84226a[0] / 10));
            TXCStatus.m84178a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomErrorDisconnect, Integer.valueOf(iArrM84226a[1] / 10));
            TXCStatus.m84178a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomErrorOpenCameraFailed, Integer.valueOf(iM84227b));
            if (C14215f.m84222a(tRTCCloudImpl.mContext)) {
                TXCStatus.m84178a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomErrorOpenMicFailed, (Object) 1);
                i = 1;
            } else {
                TXCStatus.m84178a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomErrorOpenMicFailed, (Object) 0);
                i = 0;
            }
            if (tRTCCloudImpl.mNetType != iM84236e) {
                if (tRTCCloudImpl.mNetType >= 0 && iM84236e > 0) {
                    tRTCCloudImpl.nativeReenterRoom(tRTCCloudImpl.mNativeRtcContext, 100);
                }
                TXCEventRecorderProxy.m84163a("18446744073709551615", 1003, iM84236e == 0 ? 0L : iM84236e, -1L, "", 0);
                Monitor.m84161a(2, String.format("network switch from:%d to %d", Integer.valueOf(tRTCCloudImpl.mNetType), Integer.valueOf(iM84236e)) + " self:" + tRTCCloudImpl.hashCode(), "1:wifi/2:4G/3:3G/4:2G/5:Cable", 0);
                tRTCCloudImpl.mNetType = iM84236e;
                TXCKeyPointReportProxy.m84167a(40039, iM84236e, 0);
            }
            if (tRTCCloudImpl.mBackground != i) {
                TXCEventRecorderProxy.m84163a("18446744073709551615", 2001, i, -1L, "", 0);
                tRTCCloudImpl.mBackground = i;
                if (i == 0) {
                    Monitor.m84161a(1, "onAppDidBecomeActive self:" + tRTCCloudImpl.hashCode(), "", 0);
                } else {
                    Monitor.m84161a(1, "onAppEnterBackground self:" + tRTCCloudImpl.hashCode(), "", 0);
                }
                TXCKeyPointReportProxy.m84173c(50001, i);
            }
            TXCKeyPointReportProxy.m84166a(iArrM84226a[0] / 10, iArrM84226a[1] / 10);
            TXCKeyPointReportProxy.m84164a();
            tRTCCloudImpl.checkRTCState();
            tRTCCloudImpl.checkDashBoard();
            tRTCCloudImpl.collectCustomCaptureFps();
            tRTCCloudImpl.startCollectStatus();
            if (tRTCCloudImpl.mSensorMode != 0) {
                tRTCCloudImpl.mOrientationEventListener.checkOrientation();
            }
        }
    }

    public enum VideoSourceType {
        NONE,
        CAMERA,
        SCREEN,
        CUSTOM
    }

    public static class VolumeLevelNotifyTask implements Runnable {
        private WeakReference<TRTCCloudImpl> mWeakTRTCEngine;

        public VolumeLevelNotifyTask(TRTCCloudImpl tRTCCloudImpl) {
            this.mWeakTRTCEngine = new WeakReference<>(tRTCCloudImpl);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<TRTCCloudImpl> weakReference = this.mWeakTRTCEngine;
            TRTCCloudImpl tRTCCloudImpl = weakReference != null ? weakReference.get() : null;
            if (tRTCCloudImpl != null) {
                final ArrayList arrayList = new ArrayList();
                int softwareCaptureVolumeLevel = tRTCCloudImpl.mCaptureAndEnc != null ? TXCAudioEngine.getInstance().getSoftwareCaptureVolumeLevel() : 0;
                if (softwareCaptureVolumeLevel > 0) {
                    TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = new TRTCCloudDef.TRTCVolumeInfo();
                    tRTCVolumeInfo.userId = tRTCCloudImpl.mRoomInfo.userId;
                    tRTCVolumeInfo.volume = softwareCaptureVolumeLevel;
                    arrayList.add(tRTCVolumeInfo);
                }
                tRTCCloudImpl.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.VolumeLevelNotifyTask.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        int remotePlayoutVolumeLevel = TXCAudioEngine.getInstance().getRemotePlayoutVolumeLevel(String.valueOf(userInfo.tinyID));
                        if (remotePlayoutVolumeLevel > 0) {
                            TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo2 = new TRTCCloudDef.TRTCVolumeInfo();
                            tRTCVolumeInfo2.userId = userInfo.userID;
                            tRTCVolumeInfo2.volume = remotePlayoutVolumeLevel;
                            arrayList.add(tRTCVolumeInfo2);
                        }
                    }
                });
                final int mixingPlayoutVolumeLevel = TXCAudioEngine.getMixingPlayoutVolumeLevel();
                final TRTCCloudListener tRTCCloudListener = tRTCCloudImpl.mTRTCListener;
                tRTCCloudImpl.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.VolumeLevelNotifyTask.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudListener tRTCCloudListener2 = tRTCCloudListener;
                        if (tRTCCloudListener2 != null) {
                            tRTCCloudListener2.onUserVoiceVolume(arrayList, mixingPlayoutVolumeLevel);
                        }
                    }
                });
                if (tRTCCloudImpl.mAudioVolumeEvalInterval > 0) {
                    tRTCCloudImpl.mSDKHandler.postDelayed(tRTCCloudImpl.mVolumeLevelNotifyTask, tRTCCloudImpl.mAudioVolumeEvalInterval);
                }
            }
        }
    }

    static {
        C14215f.m84239f();
    }

    public TRTCCloudImpl(Context context) {
        this.reverbTypes = new TXAudioEffectManager.TXVoiceReverbType[]{TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7};
        this.voiceChangerTypes = new TXAudioEffectManager.TXVoiceChangerType[]{TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11};
        this.mNativeLock = new Object();
        this.mAudioFrameListener = null;
        this.mPriorStreamType = 2;
        this.mEnableSmallStream = false;
        this.mVideoRenderMirror = 0;
        this.mCustomRemoteRender = false;
        this.mAudioVolumeEvalInterval = 0;
        this.mSmallEncParam = new TRTCCloudDef.TRTCVideoEncParam();
        this.mQosMode = 1;
        this.mEnableEosMode = false;
        this.mCodecType = 2;
        this.mEnableSoftAEC = true;
        this.mEnableSoftANS = false;
        this.mEnableSoftAGC = false;
        this.mSoftAECLevel = 100;
        this.mSoftANSLevel = 100;
        this.mSoftAGCLevel = 100;
        this.mAudioCaptureVolume = 100;
        this.mAudioPlayoutVolume = 100;
        this.mCustomVideoUtil = null;
        this.mEnableCustomAudioCapture = false;
        this.mEnableCustomVideoCapture = false;
        this.mCurrentRole = 20;
        this.mTargetRole = 20;
        this.mLastCaptureCalculateTS = 0L;
        this.mCaptureFrameCount = 0L;
        this.mLastCaptureFrameCount = 0L;
        this.mPerformanceMode = 0;
        this.mCurrentOrientation = -1;
        this.mFloatingWindow = null;
        this.mOverrideFPSFromUser = false;
        this.mLatestParamsOfBigEncoder = new Bundle();
        this.mLatestParamsOfSmallEncoder = new Bundle();
        this.mFramework = 1;
        this.mCallback = new InterfaceC14169a() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.1
            @Override // com.tencent.liteav.basic.p092b.InterfaceC14169a
            public void onError(String str, int i, String str2, String str3) {
                TXCLog.m84149e(TRTCCloudImpl.TAG, "onError => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("EVT_USERID", str);
                    bundle.putInt("EVT_ID", i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str2.concat(str3 != null ? str3 : ""));
                    }
                    TRTCCloudImpl.this.onNotifyEvent(i, bundle);
                }
                Monitor.m84160a(3, i, str2, str3, 0, 0);
            }

            @Override // com.tencent.liteav.basic.p092b.InterfaceC14169a
            public void onEvent(String str, int i, String str2, String str3) {
                TXCLog.m84152i(TRTCCloudImpl.TAG, "onEvent => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("EVT_USERID", str);
                    bundle.putInt("EVT_ID", i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str2.concat(str3 != null ? str3 : ""));
                    }
                    TRTCCloudImpl.this.onNotifyEvent(i, bundle);
                }
                Monitor.m84160a(2, i, str2, str3, 0, 0);
            }
        };
        this.mSubClouds = new ArrayList<>();
        this.mCurrentPublishClouds = new HashMap<>();
        this.mVolumeLevelNotifyTask = null;
        this.mDebugType = 0;
        this.mStatusNotifyTask = null;
        this.mNetType = -1;
        this.mBackground = -1;
        init(context, null);
        TXCCommonUtil.setAppContext(this.mContext);
        TXCLog.init();
        TRTCAudioServerConfig tRTCAudioServerConfigLoadFromSharedPreferences = TRTCAudioServerConfig.loadFromSharedPreferences(context);
        TXCLog.m84153i(TAG, "audio config from shared preference: %s", tRTCAudioServerConfigLoadFromSharedPreferences);
        TXCAudioEngine.CreateInstanceWithoutInitDevice(this.mContext, TXCAudioEngine.buildTRAEConfig(context, Boolean.valueOf(tRTCAudioServerConfigLoadFromSharedPreferences.enableOpenSL), tRTCAudioServerConfigLoadFromSharedPreferences.isLowLatencySampleRateSupported, tRTCAudioServerConfigLoadFromSharedPreferences.lowLatencySampleRateBlockTime));
        TXCAudioEngine.getInstance().clean();
        TXCAudioEngine.getInstance().setAudioCaptureDataListener(this);
        TXCAudioEngine.getInstance().addEventCallback(new WeakReference<>(this.mCallback));
        TXCAudioEngine.getInstance().enableAutoRestartDevice(tRTCAudioServerConfigLoadFromSharedPreferences.enableAutoRestartDevice);
        TXCAudioEngine.getInstance().setMaxSelectedPlayStreams(tRTCAudioServerConfigLoadFromSharedPreferences.maxSelectedPlayStreams);
        TXCAudioEngineJNI.nativeSetAudioPlayoutTunnelEnabled(true);
        C14270d c14270d = new C14270d(context);
        this.mCaptureAndEnc = c14270d;
        c14270d.m84689i(2);
        this.mCaptureAndEnc.m84661a(this.mConfig);
        this.mCaptureAndEnc.m84686h(true);
        this.mCaptureAndEnc.m84682f(true);
        this.mCaptureAndEnc.m84658a((InterfaceC14170b) this);
        this.mCaptureAndEnc.m84660a((C14270d.a) this);
        this.mCaptureAndEnc.setID("18446744073709551615");
        this.mCaptureAndEnc.m84685g(true);
        TXCKeyPointReportProxy.m84168a(this.mContext);
        apiLog("reset audio volume");
        setAudioCaptureVolume(100);
        setAudioPlayoutVolume(100);
        TXCSoundEffectPlayer.getInstance().setSoundEffectListener(this);
    }

    public static /* synthetic */ long access$8108(TRTCCloudImpl tRTCCloudImpl) {
        long j = tRTCCloudImpl.mRecvSEIMsgCountInPeriod;
        tRTCCloudImpl.mRecvSEIMsgCountInPeriod = 1 + j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRemoteStatistics(TXCRenderAndDec tXCRenderAndDec, TRTCRoomInfo.UserInfo userInfo, TRTCStatistics tRTCStatistics, ArrayList<TRTCCloudDef.TRTCQuality> arrayList) {
        TRTCStatistics.TRTCRemoteStatistics remoteStatistics = getRemoteStatistics(tXCRenderAndDec, userInfo);
        tRTCStatistics.remoteArray.add(remoteStatistics);
        tRTCStatistics.downLoss = TXCStatus.m84182c(String.valueOf(userInfo.tinyID), 16002);
        TRTCCloudDef.TRTCQuality tRTCQuality = new TRTCCloudDef.TRTCQuality();
        tRTCQuality.userId = userInfo.userID;
        tRTCQuality.quality = getNetworkQuality(tRTCStatistics.rtt, remoteStatistics.finalLoss);
        arrayList.add(tRTCQuality);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpStreamType(int i) {
        if (!this.mStreamTypes.contains(Integer.valueOf(i))) {
            this.mStreamTypes.add(Integer.valueOf(i));
        }
        addUpstream(i);
    }

    private void addUpstream(int i) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(i));
        if (tRTCCloudImpl != null) {
            nativeAddUpstream(tRTCCloudImpl.getNetworkContext(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendDashboardLog(String str, int i, final String str2, String str3) {
        final TXCloudVideoView tXCloudVideoView;
        String str4;
        apiLog(str3 + str2);
        if (TextUtils.isEmpty(str) || ((str4 = this.mRoomInfo.userId) != null && str.equalsIgnoreCase(str4))) {
            tXCloudVideoView = this.mRoomInfo.localView;
        } else {
            TRTCRoomInfo.UserInfo user = this.mRoomInfo.getUser(str);
            if (user != null) {
                tXCloudVideoView = i == 7 ? user.subRender.view : user.mainRender.view;
            } else {
                tXCloudVideoView = null;
            }
        }
        runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.169
            @Override // java.lang.Runnable
            public void run() {
                TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                if (tXCloudVideoView2 != null) {
                    tXCloudVideoView2.appendEventInfo(str2);
                }
            }
        });
    }

    private void applyRenderConfig(TXCRenderAndDec tXCRenderAndDec) {
        C14274h c14274h = new C14274h();
        c14274h.f60189h = false;
        if (this.mAppScene == 1) {
            c14274h.f60189h = true;
        }
        int iM84182c = TXCStatus.m84182c("18446744073709551615", FirebaseError.ERROR_NETWORK_REQUEST_FAILED);
        if (iM84182c == 0) {
            iM84182c = 600;
        }
        c14274h.f60185d = iM84182c;
        c14274h.f60199r = this.mRoomInfo.decProperties;
        applyRenderPlayStrategy(tXCRenderAndDec, c14274h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyRenderPlayStrategy(TXCRenderAndDec tXCRenderAndDec, C14274h c14274h) {
        c14274h.f60188g = true;
        int i = this.mCurrentRole;
        if (i == 20) {
            c14274h.f60182a = C14166a.f58890a;
            c14274h.f60184c = C14166a.f58891b;
            c14274h.f60183b = C14166a.f58892c;
        } else if (i == 21) {
            c14274h.f60182a = C14166a.f58893d;
            c14274h.f60184c = C14166a.f58894e;
            c14274h.f60183b = C14166a.f58895f;
        }
        tXCRenderAndDec.setConfig(c14274h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRTCState() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < this.mLastStateTimeMs + 2000) {
            return;
        }
        this.mLastStateTimeMs = jCurrentTimeMillis;
        int[] iArrM84226a = C14215f.m84226a();
        final ArrayList arrayList = new ArrayList();
        final TRTCStatistics tRTCStatistics = new TRTCStatistics();
        tRTCStatistics.appCpu = iArrM84226a[0] / 10;
        tRTCStatistics.systemCpu = iArrM84226a[1] / 10;
        tRTCStatistics.rtt = TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningNetBusy);
        tRTCStatistics.sendBytes = TXCStatus.m84174a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningVideoEncodeFailed);
        tRTCStatistics.receiveBytes = TXCStatus.m84174a("18446744073709551615", 16004);
        tRTCStatistics.upLoss = TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed);
        tRTCStatistics.localArray = new ArrayList<>();
        tRTCStatistics.remoteArray = new ArrayList<>();
        tRTCStatistics.localArray.add(getLocalStatistics(2));
        if (this.mEnableSmallStream) {
            tRTCStatistics.localArray.add(getLocalStatistics(3));
        }
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.177
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                if (tXCRenderAndDec != null) {
                    TRTCCloudImpl.this.addRemoteStatistics(tXCRenderAndDec, userInfo, tRTCStatistics, arrayList);
                }
                TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
                if (tXCRenderAndDec2 == null || !tXCRenderAndDec2.isRendering()) {
                    return;
                }
                TRTCCloudImpl.this.addRemoteStatistics(userInfo.subRender.render, userInfo, tRTCStatistics, arrayList);
            }
        });
        final TRTCCloudDef.TRTCQuality tRTCQuality = new TRTCCloudDef.TRTCQuality();
        tRTCQuality.userId = this.mRoomInfo.getUserId();
        tRTCQuality.quality = TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningAudioEncodeFailed);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.178
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStatistics(tRTCStatistics);
                    tRTCCloudListener.onNetworkQuality(tRTCQuality, arrayList);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRenderRotation(int i) {
        int displayRotation = getDisplayRotation();
        C14273g c14273g = this.mConfig;
        int i2 = c14273g.f60164l;
        int i3 = ((360 - displayRotation) - ((i2 - 1) * 90)) % 360;
        int i4 = i % 2;
        int i5 = displayRotation % 2;
        boolean z = (i4 == i5 && i2 == 1) || (i4 != i5 && i2 == 0);
        int i6 = this.mVideoRenderMirror;
        if (i6 != 1 ? !(i6 != 2 || !c14273g.f60165m || !z) : !(c14273g.f60165m || !z)) {
            i3 += 180;
        }
        TXCLog.m84147d(TAG, String.format("vrotation rotation-change %d-%d-%d ======= renderRotation %d-%d", Integer.valueOf(i), Integer.valueOf(this.mConfig.f60164l), Integer.valueOf(displayRotation), Integer.valueOf(i3), Integer.valueOf(this.mRoomInfo.localRenderRotation)) + " self:" + hashCode());
        this.mCaptureAndEnc.m84684g((this.mRoomInfo.localRenderRotation + i3) % 360);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkVideoEncRotation(int i) {
        int i2;
        C14273g c14273g = this.mConfig;
        int i3 = 0;
        if (c14273g.f60164l != 1) {
            boolean z = c14273g.f60146S;
            i2 = (!(z && c14273g.f60165m) && (z || c14273g.f60165m)) ? 270 : 90;
        } else {
            i2 = 0;
        }
        if (i == 0) {
            int i4 = (i2 + 90) % 360;
            if (!c14273g.f60165m) {
                i4 = (i4 + 180) % 360;
            }
            i3 = i4;
            if (c14273g.f60146S) {
                i3 = (i3 + 180) % 360;
            }
        } else if (i == 1) {
            i3 = i2 % 360;
        } else if (i == 2) {
            int i5 = (i2 + 270) % 360;
            if (!c14273g.f60165m) {
                i5 = (i5 + 180) % 360;
            }
            i3 = i5;
            if (c14273g.f60146S) {
                i3 = (i3 + 180) % 360;
            }
        } else if (i == 3) {
            i3 = (i2 + 180) % 360;
        }
        TXCLog.m84147d(TAG, String.format("vrotation rotation-change %d-%d ======= encRotation %d", Integer.valueOf(i), Integer.valueOf(this.mConfig.f60164l), Integer.valueOf(i3)) + " self:" + hashCode());
        this.mCurrentOrientation = i;
        this.mCaptureAndEnc.m84652a(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void collectCustomCaptureFps() {
        if (this.mVideoSourceType == VideoSourceType.CUSTOM) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.mLastCaptureCalculateTS;
            if (j >= 1000) {
                long j2 = this.mCaptureFrameCount;
                double d = ((j2 - this.mLastCaptureFrameCount) * 1000.0d) / j;
                this.mLastCaptureFrameCount = j2;
                this.mLastCaptureCalculateTS = jCurrentTimeMillis;
                TXCStatus.m84177a("18446744073709551615", 1001, 2, Double.valueOf(d));
            }
        }
    }

    private static TRTCAudioServerConfig createAudioServerConfigFromNative() {
        return new TRTCAudioServerConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TXCRenderAndDec createRender(long j, int i) {
        TXCRenderAndDec tXCRenderAndDec = new TXCRenderAndDec(this.mContext);
        tXCRenderAndDec.setID(String.valueOf(j));
        tXCRenderAndDec.setVideoRender(new C14344a());
        tXCRenderAndDec.setStreamType(i);
        tXCRenderAndDec.setNotifyListener(this);
        tXCRenderAndDec.setRenderAndDecDelegate(this);
        tXCRenderAndDec.setRenderMode(0);
        tXCRenderAndDec.enableDecoderChange(this.mPerformanceMode != 1);
        tXCRenderAndDec.enableRestartDecoder(this.mRoomInfo.enableRestartDecoder);
        tXCRenderAndDec.enableLimitDecCache(this.mVideoServerConfig.enableHWVUI);
        applyRenderConfig(tXCRenderAndDec);
        return tXCRenderAndDec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TRTCRoomInfo.UserInfo createUserInfo(String str) {
        TRTCRoomInfo.UserInfo userInfo = new TRTCRoomInfo.UserInfo(0L, str, 0, 0);
        TRTCRoomInfo.RenderInfo renderInfo = userInfo.mainRender;
        TRTCRoomInfo tRTCRoomInfo = this.mRoomInfo;
        renderInfo.muteVideo = tRTCRoomInfo.muteRemoteVideo;
        renderInfo.muteAudio = tRTCRoomInfo.muteRemoteAudio;
        return userInfo;
    }

    private static TRTCVideoServerConfig createVideoServerConfigFromNative() {
        return new TRTCVideoServerConfig();
    }

    public static void destroySharedInstance() {
        synchronized (TRTCCloudImpl.class) {
            try {
                if (sInstance != null) {
                    TXCLog.m84152i(TAG, "trtc_api destroy instance self:" + sInstance.hashCode());
                    sInstance.destroy();
                    sInstance = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableAudioAEC(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("enable")) {
            apiLog("enableAudioAEC[lack parameter or illegal type]: enable");
        }
        if (jSONObject.getInt("enable") == 0) {
            this.mEnableSoftAEC = false;
        } else {
            this.mEnableSoftAEC = true;
        }
        if (jSONObject.has(FirebaseAnalytics.Param.LEVEL)) {
            this.mSoftAECLevel = jSONObject.getInt(FirebaseAnalytics.Param.LEVEL);
        } else {
            this.mSoftAECLevel = 100;
        }
        TXCAudioEngine.getInstance().enableSoftAEC(this.mEnableSoftAEC, this.mSoftAECLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableAudioAGC(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("enable")) {
            apiLog("enableAudioAGC[lack parameter or illegal type]: enable");
        }
        if (jSONObject.getInt("enable") == 0) {
            this.mEnableSoftAGC = false;
        } else {
            this.mEnableSoftAGC = true;
        }
        if (jSONObject.has(FirebaseAnalytics.Param.LEVEL)) {
            this.mSoftAGCLevel = jSONObject.getInt(FirebaseAnalytics.Param.LEVEL);
        } else {
            this.mSoftAGCLevel = 100;
        }
        TXCAudioEngine.getInstance().enableSoftAGC(this.mEnableSoftAGC, this.mSoftAGCLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enableAudioANS(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("enable")) {
            apiLog("enableAudioANS[lack parameter or illegal type]: enable");
        }
        if (jSONObject.getInt("enable") == 0) {
            this.mEnableSoftANS = false;
        } else {
            this.mEnableSoftANS = true;
        }
        if (jSONObject.has(FirebaseAnalytics.Param.LEVEL)) {
            this.mSoftANSLevel = jSONObject.getInt(FirebaseAnalytics.Param.LEVEL);
        } else {
            this.mSoftANSLevel = 100;
        }
        TXCAudioEngine.getInstance().enableSoftANS(this.mEnableSoftANS, this.mSoftANSLevel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void forceCallbackMixedPlayAudioFrame(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("forceCallbackMixedPlayAudioFrame param is null");
        } else if (!jSONObject.has("enable")) {
            apiLog("forceCallbackMixedPlayAudioFrame[lack parameter]: enable");
        } else {
            TXCAudioEngine.getInstance().forceCallbackMixedPlayAudioFrame(jSONObject.optInt("enable", 0) != 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getDisplayRotation() {
        int rotation = this.mDisplay.getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    private CharSequence getDownloadStreamInfo(TXCRenderAndDec tXCRenderAndDec, TRTCRoomInfo.UserInfo userInfo) {
        String str;
        String strValueOf = String.valueOf(userInfo.tinyID);
        int[] iArrM84226a = C14215f.m84226a();
        int streamType = tXCRenderAndDec.getStreamType();
        long jM84175a = TXCStatus.m84175a(strValueOf, FirebaseError.ERROR_REQUIRES_RECENT_LOGIN, streamType);
        int iM84183c = TXCStatus.m84183c(strValueOf, ErrorCode.EDIT_PREVIEW_FAILED, streamType);
        if (streamType == 3) {
            str = p7f.LATITUDE_SOUTH;
        } else if (streamType == 7) {
            str = "Sub";
        } else {
            str = streamType == 1 ? "A" : "B";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("REMOTE: [%s]%s RTT:%dms\n", userInfo.userID, str, Integer.valueOf(TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningNetBusy))));
        Locale locale = Locale.CHINA;
        sb.append(String.format(locale, "RECV:%dkbps LOSS:%d-%d-%d%%|%d-%d-%d%%|%d%%\n", Integer.valueOf(TXCStatus.m84183c(strValueOf, 17001, streamType) + TXCStatus.m84182c(strValueOf, 18001)), Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_TOO_MANY_REQUESTS, streamType)), Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_USER_DISABLED, streamType)), Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_USER_NOT_FOUND, streamType)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18013)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18007)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18014)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 16002))));
        sb.append(String.format(locale, "BIT:%d|%dkbps RES:%dx%d FPS:%d-%d\n", Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_CUSTOM_TOKEN_MISMATCH, streamType)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18002)), Integer.valueOf(iM84183c >> 16), Integer.valueOf(iM84183c & p7f.COLOR_SPACE_UNCALIBRATED), Integer.valueOf((int) TXCStatus.m84185d(strValueOf, 6002, streamType)), Integer.valueOf((int) TXCStatus.m84185d(strValueOf, 17003, streamType))));
        sb.append(String.format(locale, "FEC:%d-%d-%d%%|%d-%d-%d%%    ARQ:%d-%d|%d-%d\n", Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_EMAIL_ALREADY_IN_USE, streamType)), Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_USER_DISABLED, streamType)), Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_OPERATION_NOT_ALLOWED, streamType)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18009)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18007)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18008)), Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_WRONG_PASSWORD, streamType)), Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_INVALID_EMAIL, streamType)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18012)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18010))));
        sb.append(String.format(locale, "CPU:%d%%|%d%%  RPS:%d  LFR:%d  DERR:%d\n", Integer.valueOf(iArrM84226a[0] / 10), Integer.valueOf(iArrM84226a[1] / 10), Integer.valueOf(TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL, streamType)), Integer.valueOf(TXCStatus.m84183c(strValueOf, 17013, streamType)), Long.valueOf(jM84175a)));
        sb.append(String.format(locale, "Jitter: %d,%d|%d,%d|%d  p2pDelay: %d  ADROP: %d\n", Integer.valueOf(TXCStatus.m84182c(strValueOf, 2007)), Integer.valueOf(TXCStatus.m84183c(strValueOf, 6010, streamType)), Integer.valueOf(TXCStatus.m84183c(strValueOf, 6011, streamType)), Integer.valueOf(TXCStatus.m84183c(strValueOf, 6012, streamType)), Integer.valueOf(TXCStatus.m84182c(strValueOf, TXLiteAVCode.EVT_HW_DECODER_START_SUCC)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18042)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18015))));
        sb.append(String.format(locale, "QUALITY: %d   LEN: %d\n", Integer.valueOf(TXCStatus.m84182c(strValueOf, 18023)), Integer.valueOf(TXCStatus.m84182c(strValueOf, 18016))));
        String string = sb.toString();
        SpannableString spannableString = new SpannableString(string);
        int iLastIndexOf = string.lastIndexOf("DECERR:");
        if (-1 != iLastIndexOf && jM84175a > 0) {
            spannableString.setSpan(new ForegroundColorSpan(-65536), iLastIndexOf + 7, string.length(), 33);
        }
        return spannableString;
    }

    private TRTCStatistics.TRTCLocalStatistics getLocalStatistics(int i) {
        int iM84183c = TXCStatus.m84183c("18446744073709551615", 4003, i);
        TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics = new TRTCStatistics.TRTCLocalStatistics();
        tRTCLocalStatistics.width = iM84183c >> 16;
        tRTCLocalStatistics.height = iM84183c & p7f.COLOR_SPACE_UNCALIBRATED;
        tRTCLocalStatistics.frameRate = (int) (TXCStatus.m84185d("18446744073709551615", 4001, i) + 0.5d);
        tRTCLocalStatistics.videoBitrate = TXCStatus.m84183c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomEventOpenCameraSucc, i);
        tRTCLocalStatistics.audioSampleRate = TXCStatus.m84182c("18446744073709551615", RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STAT);
        tRTCLocalStatistics.audioBitrate = TXCStatus.m84182c("18446744073709551615", RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME);
        tRTCLocalStatistics.streamType = translateStreamType(i);
        return tRTCLocalStatistics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EnumC14167b getPixelFormat(int i) {
        if (i == 1) {
            return EnumC14167b.I420;
        }
        if (i == 2) {
            return EnumC14167b.TEXTURE_2D;
        }
        if (i != 3) {
            return i != 4 ? EnumC14167b.UNKNOWN : EnumC14167b.NV21;
        }
        return EnumC14167b.TEXTURE_EXTERNAL_OES;
    }

    private String getQosValue(int i) {
        if (i == 0) {
            return "HOLD";
        }
        if (i != 1) {
            return i != 2 ? "ERR" : "DOWN";
        }
        return "UP";
    }

    private TRTCStatistics.TRTCRemoteStatistics getRemoteStatistics(TXCRenderAndDec tXCRenderAndDec, TRTCRoomInfo.UserInfo userInfo) {
        String strValueOf = String.valueOf(userInfo.tinyID);
        int streamType = tXCRenderAndDec.getStreamType();
        int iM84183c = TXCStatus.m84183c(strValueOf, ErrorCode.EDIT_PREVIEW_FAILED, streamType);
        int iM84183c2 = TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_USER_NOT_FOUND, streamType);
        int iM84182c = TXCStatus.m84182c(strValueOf, 18047);
        TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics = new TRTCStatistics.TRTCRemoteStatistics();
        tRTCRemoteStatistics.userId = userInfo.userID;
        tRTCRemoteStatistics.videoPacketLoss = iM84183c2;
        tRTCRemoteStatistics.audioPacketLoss = iM84182c;
        if (iM84182c > iM84183c2) {
            iM84183c2 = iM84182c;
        }
        tRTCRemoteStatistics.finalLoss = iM84183c2;
        tRTCRemoteStatistics.width = iM84183c >> 16;
        tRTCRemoteStatistics.height = 65535 & iM84183c;
        tRTCRemoteStatistics.frameRate = (int) (TXCStatus.m84185d(strValueOf, 6002, streamType) + 0.5d);
        tRTCRemoteStatistics.videoBitrate = TXCStatus.m84183c(strValueOf, FirebaseError.ERROR_CUSTOM_TOKEN_MISMATCH, streamType);
        tRTCRemoteStatistics.audioSampleRate = TXCStatus.m84182c(strValueOf, 18003);
        tRTCRemoteStatistics.audioBitrate = TXCStatus.m84182c(strValueOf, 18002);
        tRTCRemoteStatistics.jitterBufferDelay = TXCStatus.m84182c(strValueOf, 2007);
        tRTCRemoteStatistics.point2PointDelay = TXCStatus.m84182c(strValueOf, 18042);
        tRTCRemoteStatistics.streamType = translateStreamType(streamType);
        tRTCRemoteStatistics.audioTotalBlockTime = TXCStatus.m84182c(strValueOf, 18031);
        int iM84182c2 = TXCStatus.m84182c(strValueOf, 18030);
        tRTCRemoteStatistics.audioBlockRate = iM84182c2 > 0 ? (int) (((((double) tRTCRemoteStatistics.audioTotalBlockTime) * 100.0d) / ((double) iM84182c2)) + 0.9d) : 0;
        tRTCRemoteStatistics.videoTotalBlockTime = TXCStatus.m84183c(strValueOf, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR, streamType);
        int iM84183c3 = TXCStatus.m84183c(strValueOf, 6020, streamType);
        tRTCRemoteStatistics.videoBlockRate = iM84183c3 > 0 ? (int) (((((double) tRTCRemoteStatistics.videoTotalBlockTime) * 100.0d) / ((double) iM84183c3)) + 0.9d) : 0;
        return tRTCRemoteStatistics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C14273g.a getSizeByResolution(int i, int i2) {
        int i3 = 176;
        int i4 = 192;
        switch (i) {
            case 1:
                i3 = 128;
                i4 = i3;
                break;
            case 3:
                i3 = 160;
                i4 = i3;
                break;
            case 5:
                i3 = 272;
                i4 = i3;
                break;
            case 7:
                i3 = 480;
                i4 = i3;
                break;
            case 50:
                i4 = 128;
                break;
            case 52:
                i3 = 256;
                break;
            case 54:
                i3 = 288;
                i4 = 224;
                break;
            case 56:
                i3 = 320;
                i4 = 240;
                break;
            case 58:
                i3 = 400;
                i4 = HttpStatus.NOT_MODIFIED_304;
                break;
            case 60:
                i4 = 368;
                i3 = 480;
                break;
            case 62:
                i3 = 640;
                i4 = 480;
                break;
            case 64:
                i3 = 960;
                i4 = 720;
                break;
            case 100:
                i4 = 96;
                break;
            case 102:
                i4 = 144;
                i3 = 256;
                break;
            case 104:
                i3 = 336;
                break;
            case 106:
                i4 = 272;
                i3 = 480;
                break;
            case 108:
            default:
                i4 = 368;
                i3 = 640;
                break;
            case 110:
                i4 = 544;
                i3 = 960;
                break;
            case 112:
                i3 = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                i4 = 720;
                break;
            case 114:
                i3 = WBConstants.SDK_NEW_PAY_VERSION;
                i4 = 1088;
                break;
        }
        C14273g.a aVar = new C14273g.a();
        if (i2 == 1) {
            aVar.f60180a = i4;
            aVar.f60181b = i3;
            return aVar;
        }
        aVar.f60180a = i3;
        aVar.f60181b = i4;
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideFloatingWindow() {
        View view = this.mFloatingWindow;
        if (view == null) {
            return;
        }
        ((WindowManager) view.getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window)).removeViewImmediate(this.mFloatingWindow);
        this.mFloatingWindow = null;
    }

    private void identifyTRTCFrameworkType() {
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                String className = stackTraceElement.getClassName();
                if (className.contains("TUIKitImpl")) {
                    TXCLog.m84152i(TAG, "identifyTRTCFrameworkType callName:" + className);
                    this.mFramework = 6;
                    return;
                }
                if (className.contains("WXTRTCCloud")) {
                    TXCLog.m84152i(TAG, "identifyTRTCFrameworkType callName:" + className);
                    this.mFramework = 3;
                    return;
                }
                if (className.contains("TRTCMeetingImpl") || className.contains("TRTCLiveRoomImpl") || className.contains("TRTCAudioCallImpl") || className.contains("TRTCVideoCallImpl") || className.contains("TRTCVoiceRoomImpl") || className.contains("TRTCAVCallImpl")) {
                    TXCLog.m84152i(TAG, "identifyTRTCFrameworkType callName:" + className);
                    this.mFramework = 5;
                }
            }
        } catch (Exception e) {
            TXCLog.m84149e(TAG, "identifyTRTCFrameworkType catch exception:" + e.getCause());
        }
    }

    private void init(Context context, HandlerC14214e handlerC14214e) {
        this.mCurrentPublishClouds.put(2, this);
        this.mCurrentPublishClouds.put(3, this);
        this.mCurrentPublishClouds.put(7, this);
        this.mCurrentPublishClouds.put(1, this);
        this.mContext = context.getApplicationContext();
        C14273g c14273g = new C14273g();
        this.mConfig = c14273g;
        c14273g.f60163k = EnumC14168c.RESOLUTION_TYPE_640_360;
        c14273g.f60151X = 90;
        c14273g.f60162j = 0;
        c14273g.f60143P = true;
        c14273g.f60160h = 15;
        c14273g.f60138K = false;
        c14273g.f60147T = false;
        c14273g.f60148U = false;
        c14273g.f60153a = 368;
        c14273g.f60154b = 640;
        c14273g.f60155c = DetectDelayStopHelper.TYPE_DETECT_PICKNOISE;
        c14273g.f60157e = 0;
        c14273g.f60150W = false;
        TRTCRoomInfo tRTCRoomInfo = new TRTCRoomInfo();
        this.mRoomInfo = tRTCRoomInfo;
        C14273g.a aVar = tRTCRoomInfo.bigEncSize;
        aVar.f60180a = 368;
        aVar.f60181b = 640;
        this.mMainHandler = new HandlerC14214e(context.getMainLooper());
        this.mListenerHandler = new Handler(context.getMainLooper());
        if (handlerC14214e != null) {
            this.mSDKHandler = handlerC14214e;
        } else {
            HandlerThread handlerThread = new HandlerThread("TRTCCloudApi");
            handlerThread.start();
            this.mSDKHandler = new HandlerC14214e(handlerThread.getLooper());
        }
        this.mStatusNotifyTask = new StatusTask(this);
        this.mLastSendMsgTimeMs = 0L;
        this.mSendMsgCount = 0;
        this.mSendMsgSize = 0;
        this.mSensorMode = 2;
        this.mAppScene = 0;
        this.mQosPreference = 2;
        this.mQosMode = 1;
        this.mOrientationEventListener = new DisplayOrientationDetector(this.mContext, this);
        this.mDisplay = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay();
        this.mRenderListenerMap = new HashMap<>();
        this.mStreamTypes = new HashSet();
        synchronized (this.mNativeLock) {
            try {
                int[] sDKVersion = TXCCommonUtil.getSDKVersion();
                this.mNativeRtcContext = nativeCreateContext(sDKVersion.length >= 1 ? sDKVersion[0] : 0, sDKVersion.length >= 2 ? sDKVersion[1] : 0, sDKVersion.length >= 3 ? sDKVersion[2] : 0);
            } catch (Throwable th) {
                throw th;
            }
        }
        apiLog("trtc cloud create");
        this.mRoomState = 0;
        this.mVideoSourceType = VideoSourceType.NONE;
        this.mIsAudioCapturing = false;
        this.mIsVideoCapturing = false;
        this.mCurrentRole = 20;
        this.mTargetRole = 20;
        this.mRecvMode = 1;
        this.mLatestParamsOfBigEncoder.putInt(KEY_CONFIG_GOP, this.mConfig.f60161i);
        this.mLatestParamsOfSmallEncoder.putInt(KEY_CONFIG_GOP, this.mConfig.f60161i);
        identifyTRTCFrameworkType();
        this.mVideoServerConfig = TRTCVideoServerConfig.loadFromSharedPreferences(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TextureViewSurfaceTextureListenerC14348e internalGetRemoteUserRender(String str, int i) {
        TRTCRoomInfo.UserInfo user = this.mRoomInfo.getUser(str);
        if (user == null) {
            TXCLog.m84149e(TAG, "user no exist");
            return null;
        }
        TXCRenderAndDec tXCRenderAndDec = (i == 2 ? user.subRender : user.mainRender).render;
        if (tXCRenderAndDec == null) {
            TXCLog.m84149e(TAG, "render no exist");
            return null;
        }
        TextureViewSurfaceTextureListenerC14348e videoRender = tXCRenderAndDec.getVideoRender();
        if (videoRender != null) {
            return videoRender;
        }
        apiLog("videoRender no exist");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNumericRoom(int i) {
        return (i == 0 || i == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void muteUpstream(int i, boolean z) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(i));
        if (tRTCCloudImpl != null) {
            nativeMuteUpstream(tRTCCloudImpl.getNetworkContext(), i, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeCancelDownStream(long j, long j2, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeChangeRole(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeConnectOtherRoom(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeDisconnectOtherRoom(long j);

    private native void nativeEnableBlackStream(long j, boolean z);

    private native void nativeEnableSmallStream(long j, boolean z);

    private native void nativeMuteUpstream(long j, int i, boolean z);

    private native void nativePushVideo(long j, int i, int i2, int i3, byte[] bArr, long j2, long j3, long j4, long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeReenterRoom(long j, int i);

    private native int nativeRemoveUpstream(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeRequestDownStream(long j, long j2, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRequestKeyFrame(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSendCustomCmdMsg(long j, int i, String str, boolean z, boolean z2);

    private native void nativeSendJsonCmd(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSendSEIMsg(long j, byte[] bArr, int i);

    private native void nativeSetAudioEncodeConfiguration(long j, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetDataReportDeviceInfo(String str, String str2, int i);

    private native void nativeSetEncodedDataProcessingListener(long j, long j2);

    private native boolean nativeSetSEIPayloadType(long j, int i);

    private native void nativeSetVideoEncoderConfiguration(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7);

    private native void nativeSetVideoQuality(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStartPublishCDNStream(long j, TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStartPublishing(long j, String str, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStartSpeedTest(long j, int i, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStopPublishCDNStream(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStopPublishing(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStopSpeedTest(long j);

    private native void nativeUpdatePrivateMapKey(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyCaptureStarted(final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.180
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener == null) {
                    return;
                }
                tRTCCloudListener.onWarning(TXLiteAVCode.WARNING_START_CAPTURE_IGNORED, str, null);
            }
        });
        apiLog(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyEvent(String str, int i, String str2) {
        Bundle bundle = new Bundle();
        bundle.putLong("EVT_ID", i);
        bundle.putLong("EVT_TIME", System.currentTimeMillis());
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str2);
        notifyEvent(str, i, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyEventByUserId(final String str, final int i, final Bundle bundle) {
        if (str == null || bundle == null) {
            return;
        }
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.168
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                if (str.equalsIgnoreCase(String.valueOf(userInfo.tinyID))) {
                    TRTCCloudImpl.this.notifyEvent(userInfo.userID, i, bundle);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyLogByUserId(String str, int i, int i2, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("EVT_ID", i2);
        bundle.putLong("EVT_TIME", System.currentTimeMillis());
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str2);
        bundle.putInt("EVT_STREAM_TYPE", i);
        notifyEventByUserId(str, i2, bundle);
    }

    private void onAVMemberChange(final long j, final String str, int i, final int i2, final int i3) {
        final WeakReference weakReference = new WeakReference(this);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.140
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (tRTCCloudImpl.mRoomState == 0) {
                    tRTCCloudImpl.apiLog("ignore onAVMemberChange when out room");
                    return;
                }
                if (((TRTCCloudImpl) weakReference.get()) == null) {
                    return;
                }
                TRTCCloudImpl.this.apiLog("onAVMemberChange " + j + ", " + str + ", old state:" + i3 + ", new state:" + i2);
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user != null) {
                    int i4 = i2;
                    user.streamState = i4;
                    TRTCCloudImpl.this.checkUserState(str, j, i4, i3);
                }
            }
        });
    }

    private void onCallExperimentalAPI(int i, String str) {
        apiLog("onCallExperimentalAPI " + i + ", " + str);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.135
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
            }
        });
    }

    private void onChangeRole(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.162
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (i2 == 0) {
                    tRTCCloudImpl.mCurrentRole = tRTCCloudImpl.mTargetRole;
                } else {
                    tRTCCloudImpl.mCurrentRole = 21;
                    tRTCCloudImpl.mTargetRole = 21;
                }
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSwitchRole(i2, str);
                }
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.162.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                        TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                        if (tXCRenderAndDec != null) {
                            TRTCCloudImpl.this.applyRenderPlayStrategy(tXCRenderAndDec, tXCRenderAndDec.getConfig());
                        }
                    }
                });
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.notifyEvent(tRTCCloudImpl2.mRoomInfo.getUserId(), 0, "onChangeRole:" + i);
                Monitor.m84161a(1, String.format("onChangeRole err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
            }
        });
    }

    private void onConnectOtherRoom(final String str, final int i, final String str2) {
        apiLog("onConnectOtherRoom " + str + ", " + i + ", " + str2);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("onConnectOtherRoom userId:%s err:%d, msg:%s", str, Integer.valueOf(i), str2));
        sb.append(" self:");
        sb.append(hashCode());
        Monitor.m84161a(1, sb.toString(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.132
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onConnectOtherRoom(str, i, str2);
                }
            }
        });
    }

    private void onConnectionLost() {
        TRTCRoomInfo tRTCRoomInfo = this.mRoomInfo;
        tRTCRoomInfo.networkStatus = 1;
        notifyEvent(tRTCRoomInfo.getUserId(), 0, "Network anomaly.");
        Monitor.m84161a(1, "onConnectionLost self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.147
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onConnectionLost();
                }
            }
        });
    }

    private void onConnectionRecovery() {
        TRTCRoomInfo tRTCRoomInfo = this.mRoomInfo;
        tRTCRoomInfo.networkStatus = 3;
        notifyEvent(tRTCRoomInfo.getUserId(), 0, "Network recovered. Successfully re-enter room");
        Monitor.m84161a(1, "onConnectionRecovery self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.149
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onConnectionRecovery();
                }
            }
        });
    }

    private void onDisConnectOtherRoom(final int i, final String str) {
        apiLog("onDisConnectOtherRoom " + i + ", " + str);
        Monitor.m84161a(1, String.format("onDisConnectOtherRoom err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.133
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onDisConnectOtherRoom(i, str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExitRoom(int i, String str) {
        apiLog("onExitRoom " + i + ", " + str);
        Monitor.m84161a(1, String.format("onExitRoom err:%d msg:%s", Integer.valueOf(i), str) + " self:" + hashCode(), "", 0);
        runOnSDKThread(new AnonymousClass130(i));
    }

    private void onKickOut(final int i, final String str) {
        apiLog("onKickOut " + i + ", " + str);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.131
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.exitRoomInternal(false, "onKickOut " + str);
                TRTCCloudImpl.this.onExitRoom(i, str);
            }
        });
    }

    private void onNotify(long j, int i, int i2, String str) {
        apiLog(j + " event " + i2 + ", " + str);
        String strValueOf = String.valueOf(j);
        Bundle bundle = new Bundle();
        bundle.putLong("EVT_ID", (long) i2);
        bundle.putLong("EVT_TIME", System.currentTimeMillis());
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
        bundle.putInt("EVT_STREAM_TYPE", i);
        if (TextUtils.isEmpty(strValueOf) || j == 0 || strValueOf.equalsIgnoreCase("18446744073709551615") || strValueOf.equalsIgnoreCase(this.mRoomInfo.getTinyId())) {
            notifyEvent(this.mRoomInfo.getUserId(), i2, bundle);
        } else {
            notifyLogByUserId(String.valueOf(j), i, i2, str);
        }
    }

    private void onRecvAudioServerConfig(TRTCAudioServerConfig tRTCAudioServerConfig) {
        TXCLog.m84153i(TAG, "on receive audio config: [%s]", tRTCAudioServerConfig);
        TRTCAudioServerConfig.saveToSharedPreferences(this.mContext, tRTCAudioServerConfig);
        TXCAudioEngine.getInstance().enableAutoRestartDevice(tRTCAudioServerConfig.enableAutoRestartDevice);
        TXCAudioEngine.getInstance().setMaxSelectedPlayStreams(tRTCAudioServerConfig.maxSelectedPlayStreams);
    }

    private void onRecvCustomCmdMsg(final String str, long j, final int i, final int i2, final String str2, final boolean z, final int i3, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mRecvCustomCmdMsgCountInPeriod++;
        if (jCurrentTimeMillis - this.mLastLogCustomCmdMsgTs > 10000) {
            TXCLog.m84152i(TAG, "onRecvMsg. tinyId=" + j + ", streamId = " + i + ", msg = " + str2 + ", recvTime = " + j2 + ", recvCustomMsgCountInPeriod = " + this.mRecvCustomCmdMsgCountInPeriod + " self:" + hashCode());
            this.mLastLogCustomCmdMsgTs = jCurrentTimeMillis;
            this.mRecvCustomCmdMsgCountInPeriod = 0L;
        }
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.150
            @Override // java.lang.Runnable
            public void run() {
                int i4;
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    try {
                        tRTCCloudListener.onRecvCustomCmdMsg(str, i, i2, str2.getBytes("UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        TXCLog.m84150e(TRTCCloudImpl.TAG, "onRecvCustomCmdMsg failed.", e);
                    }
                    if (!z || (i4 = i3) <= 0) {
                        return;
                    }
                    tRTCCloudListener.onMissCustomCmdMsg(str, i, -1, i4);
                }
            }
        });
    }

    private void onRecvFirstAudio(long j) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.154
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    private void onRecvFirstVideo(final long j, int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.155
            @Override // java.lang.Runnable
            public void run() {
                int iRecvFirstIFrame = TRTCCloudImpl.this.mRoomInfo.recvFirstIFrame(j);
                TRTCRoomInfo.UserInfo user = null;
                try {
                    String userIdByTinyId = TRTCCloudImpl.this.mRoomInfo.getUserIdByTinyId(j);
                    if (userIdByTinyId != null) {
                        user = TRTCCloudImpl.this.mRoomInfo.getUser(userIdByTinyId);
                    }
                } catch (Exception e) {
                    TXCLog.m84150e(TRTCCloudImpl.TAG, "get user info failed.", e);
                }
                TRTCCloudImpl.this.apiLog("onRecvFirstVideo " + j + ", " + iRecvFirstIFrame);
                if (user == null || iRecvFirstIFrame > 1) {
                    return;
                }
                final String str = user.userID;
                if ((TRTCRoomInfo.hasMainVideo(user.streamState) || TRTCRoomInfo.hasSmallVideo(user.streamState)) && !TRTCRoomInfo.isMuteMainVideo(user.streamState)) {
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.155.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            TXCLog.m84152i(TRTCCloudImpl.TAG, "notify onUserVideoAvailable:" + j + " [true] by IDR. self:" + TRTCCloudImpl.this.hashCode());
                            if (tRTCCloudListener != null) {
                                tRTCCloudListener.onUserVideoAvailable(str, true);
                                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                                tRTCCloudImpl.appendDashboardLog(tRTCCloudImpl.mRoomInfo.getUserId(), 0, String.format("[%s]video Available[%b]", str, Boolean.TRUE));
                            }
                        }
                    });
                }
            }
        });
    }

    private void onRecvSEIMsg(final long j, final byte[] bArr) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.151
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                TRTCCloudListener tRTCCloudListener = tRTCCloudImpl.mTRTCListener;
                if (tRTCCloudListener != null) {
                    try {
                        String userIdByTinyId = tRTCCloudImpl.mRoomInfo.getUserIdByTinyId(j);
                        if (userIdByTinyId == null) {
                            TXCLog.m84152i(TRTCCloudImpl.TAG, "onRecvSEIMsg Error, user id is null for tinyId=" + j + " self:" + TRTCCloudImpl.this.hashCode());
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        TRTCCloudImpl.access$8108(TRTCCloudImpl.this);
                        if (jCurrentTimeMillis - TRTCCloudImpl.this.mLastLogSEIMsgTs > 10000) {
                            TXCLog.m84152i(TRTCCloudImpl.TAG, "onRecvSEIMsg. userId=" + userIdByTinyId + ", message = " + new String(bArr) + ", recvSEIMsgCountInPeriod = " + TRTCCloudImpl.this.mRecvSEIMsgCountInPeriod + " self:" + TRTCCloudImpl.this.hashCode());
                            TRTCCloudImpl.this.mLastLogSEIMsgTs = jCurrentTimeMillis;
                            TRTCCloudImpl.this.mRecvSEIMsgCountInPeriod = 0L;
                        }
                        tRTCCloudListener.onRecvSEIMsg(userIdByTinyId, bArr);
                    } catch (Exception e) {
                        TXCLog.m84150e(TRTCCloudImpl.TAG, "onRecvSEIMsg failed.", e);
                    }
                }
            }
        });
    }

    private void onRecvVideoServerConfig(final TRTCVideoServerConfig tRTCVideoServerConfig) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.165
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onRecvVideoServerConfig " + tRTCVideoServerConfig);
                TRTCCloudImpl.this.mVideoServerConfig = tRTCVideoServerConfig;
                TRTCVideoServerConfig.saveToSharedPreferences(TRTCCloudImpl.this.mContext, tRTCVideoServerConfig);
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.165.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                        if (tXCRenderAndDec != null) {
                            tXCRenderAndDec.enableLimitDecCache(TRTCCloudImpl.this.mVideoServerConfig.enableHWVUI);
                        }
                        TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
                        if (tXCRenderAndDec2 != null) {
                            tXCRenderAndDec2.enableLimitDecCache(TRTCCloudImpl.this.mVideoServerConfig.enableHWVUI);
                        }
                    }
                });
            }
        });
    }

    private void onRequestAccIP(int i, String str, boolean z) {
        apiLog("onRequestAccIP err:" + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str + " isAcc:" + z);
        if (i == 0) {
            String str2 = z ? "connect ACC" : "connect PROXY";
            Bundle bundle = new Bundle();
            bundle.putLong("EVT_ID", i);
            bundle.putLong("EVT_TIME", System.currentTimeMillis());
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str2);
            bundle.putInt("EVT_STREAM_TYPE", 2);
            notifyEvent(this.mRoomInfo.getUserId(), i, bundle);
        }
    }

    private void onRequestDownStream(final int i, final String str, final long j, final int i2) {
        if (i != 0) {
            runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.136
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                    if (tRTCCloudListener != null) {
                        tRTCCloudListener.onError(i, str, null);
                    }
                }
            });
        } else {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.137
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.137.1
                        @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                        public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                            AnonymousClass137 anonymousClass137 = AnonymousClass137.this;
                            if (i2 == 1 || j != userInfo.tinyID) {
                                return;
                            }
                            TRTCCloudImpl.this.apiLog("onRequestDownStream " + userInfo.tinyID + ", " + userInfo.userID + ", " + i2);
                            if (i2 == 7) {
                                TXCRenderAndDec tXCRenderAndDec = userInfo.subRender.render;
                                if (tXCRenderAndDec == null || tXCRenderAndDec.getStreamType() == i2) {
                                    return;
                                }
                                userInfo.subRender.render.stopVideo();
                                userInfo.subRender.render.setStreamType(i2);
                                userInfo.subRender.render.startVideo();
                                return;
                            }
                            TXCRenderAndDec tXCRenderAndDec2 = userInfo.mainRender.render;
                            if (tXCRenderAndDec2 == null || tXCRenderAndDec2.getStreamType() == i2) {
                                return;
                            }
                            userInfo.mainRender.render.stopVideo();
                            userInfo.mainRender.render.setStreamType(i2);
                            userInfo.mainRender.render.startVideo();
                            TXCKeyPointReportProxy.m84170a(String.valueOf(userInfo.tinyID), 40038, 0L, i2);
                        }
                    });
                }
            });
        }
    }

    private void onRequestToken(int i, String str, final long j, final byte[] bArr) {
        apiLog("onRequestToken " + j + Constants.SEPARATOR_COMMA + i + ", " + str);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.127
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mRoomInfo.setTinyId(String.valueOf(j));
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.mRoomInfo.setToken(tRTCCloudImpl.mContext, bArr);
            }
        });
    }

    private void onSendCustomCmdMsgResult(int i, int i2, int i3, String str) {
    }

    private void onSpeedTest(final String str, final int i, final float f, final float f2, final int i2, final int i3) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.152
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult = new TRTCCloudDef.TRTCSpeedTestResult();
                    tRTCSpeedTestResult.f61313ip = str;
                    int i4 = i;
                    tRTCSpeedTestResult.rtt = i4;
                    float f3 = f;
                    tRTCSpeedTestResult.upLostRate = f3;
                    float f4 = f2;
                    tRTCSpeedTestResult.downLostRate = f4;
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    if (f3 >= f4) {
                        tRTCSpeedTestResult.quality = tRTCCloudImpl.getNetworkQuality(i4, (int) (f3 * 100.0f));
                    } else {
                        tRTCSpeedTestResult.quality = tRTCCloudImpl.getNetworkQuality(i4, (int) (f4 * 100.0f));
                    }
                    tRTCCloudListener.onSpeedTest(tRTCSpeedTestResult, i2, i3);
                    TRTCCloudImpl.this.apiLog(String.format("SpeedTest progress %d/%d, result: %s", Integer.valueOf(i2), Integer.valueOf(i3), tRTCSpeedTestResult.toString()));
                }
            }
        });
    }

    private void onStartPublishing(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.156
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onStartPublishing " + i + ", " + str);
                Monitor.m84161a(1, String.format("onStartPublishing err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStartPublishing(i, str);
                }
            }
        });
    }

    private void onStopPublishing(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.157
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onStopPublishing " + i + ", " + str);
                Monitor.m84161a(1, String.format("onStopPublishing err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStopPublishing(i, str);
                }
            }
        });
    }

    private void onStreamPublished(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.158
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onStreamPublished " + i + ", " + str);
                Monitor.m84161a(1, String.format("onStreamPublished err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStartPublishCDNStream(i, str);
                }
            }
        });
    }

    private void onStreamUnpublished(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.159
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onStreamUnpublished " + i + ", " + str);
                Monitor.m84161a(1, String.format("onStreamUnpublished err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onStopPublishCDNStream(i, str);
                }
            }
        });
    }

    private void onSwitchRoom(final int i, final String str) {
        apiLog("onSwitchRoom " + i + ", " + str);
        Monitor.m84161a(1, String.format("onSwitchRoom err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.134
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSwitchRoom(i, str);
                }
            }
        });
    }

    private void onTranscodingUpdated(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.160
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onTranscodingUpdated " + i + ", " + str);
                Monitor.m84161a(1, String.format("onTranscodingUpdated err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSetMixTranscodingConfig(i, str);
                }
            }
        });
    }

    private void onTryToReconnect() {
        TRTCRoomInfo tRTCRoomInfo = this.mRoomInfo;
        tRTCRoomInfo.networkStatus = 2;
        notifyEvent(tRTCRoomInfo.getUserId(), 0, "Retry enter room.");
        Monitor.m84161a(1, "onTryToReconnect self:" + hashCode(), "", 0);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.148
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onTryToReconnect();
                }
            }
        });
    }

    private void onVideoBlockThresholdChanged(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.146
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.146.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                        if (tXCRenderAndDec != null) {
                            tXCRenderAndDec.setBlockInterval(i);
                        }
                        TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
                        if (tXCRenderAndDec2 != null) {
                            tXCRenderAndDec2.setBlockInterval(i);
                        }
                    }
                });
            }
        });
    }

    private void onWholeMemberEnter(long j, final String str) {
        final WeakReference weakReference = new WeakReference(this);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.141
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener;
                if (((TRTCCloudImpl) weakReference.get()) == null || (tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener) == null) {
                    return;
                }
                tRTCCloudListener.onRemoteUserEnterRoom(str);
            }
        });
    }

    private void onWholeMemberExit(long j, final String str, final int i) {
        final WeakReference weakReference = new WeakReference(this);
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.142
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener;
                if (((TRTCCloudImpl) weakReference.get()) == null || (tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener) == null) {
                    return;
                }
                tRTCCloudListener.onRemoteUserLeaveRoom(str, i);
            }
        });
    }

    private void pushVideoFrame(TXSNALPacket tXSNALPacket) {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (this.mCurrentPublishClouds) {
            tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(tXSNALPacket.streamType));
        }
        if (tRTCCloudImpl != null) {
            nativePushVideo(tRTCCloudImpl.getNetworkContext(), tXSNALPacket.streamType, 1, tXSNALPacket.nalType, tXSNALPacket.nalData, tXSNALPacket.gopIndex, tXSNALPacket.gopFrameIndex, tXSNALPacket.refFremeIndex, tXSNALPacket.pts, tXSNALPacket.dts);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUpStreamType(int i) {
        if (this.mStreamTypes.contains(Integer.valueOf(i))) {
            this.mStreamTypes.remove(Integer.valueOf(i));
        }
        removeUpstream(i);
    }

    private void removeUpstream(int i) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(i));
        if (tRTCCloudImpl != null) {
            nativeRemoveUpstream(tRTCCloudImpl.getNetworkContext(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnMainThreadAndWaitDone(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.mMainHandler.m84212a(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioEncodeConfiguration() {
        setQoSParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioSampleRate(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("sampleRate")) {
            apiLog("setAudioSampleRate[lack parameter or illegal type]: sampleRate");
            return;
        }
        int i = jSONObject.getInt("sampleRate");
        if (this.mEnableCustomAudioCapture || this.mIsAudioCapturing) {
            apiLog("setAudioSampleRate[illegal state]");
            return;
        }
        if (16000 == i || 48000 == i) {
            TXCAudioEngine.getInstance().setEncoderSampleRate(i);
            return;
        }
        apiLog("muteRemoteAudioInSpeaker[illegal sampleRate]: " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomRenderMode(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setCustomRenderMode param is null");
            return;
        }
        if (!jSONObject.has("mode")) {
            apiLog("setCustomRenderMode[lack parameter]: mode");
            return;
        }
        int iOptInt = jSONObject.optInt("mode", 0);
        TRTCRoomInfo tRTCRoomInfo = this.mRoomInfo;
        boolean z = iOptInt == 1;
        tRTCRoomInfo.enableCustomPreprocessor = z;
        this.mCaptureAndEnc.m84665a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFramework(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setFramework[lack parameter]");
        } else if (jSONObject.has("framework")) {
            this.mFramework = jSONObject.getInt("framework");
        } else {
            apiLog("setFramework[lack parameter]: framework");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalAudioMuteMode(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("mode")) {
            apiLog("setLocalAudioMuteMode[lack parameter or illegal type]: mode");
        }
        if (jSONObject.getInt("mode") == 0) {
            this.mEnableEosMode = false;
        } else {
            this.mEnableEosMode = true;
        }
        TXCAudioEngine.getInstance().enableCaptureEOSMode(this.mEnableEosMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaCodecConfig(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setMediaCodecConfig param is null");
            return;
        }
        JSONArray jSONArray = jSONObject.has("encProperties") ? jSONObject.getJSONArray("encProperties") : null;
        C14273g c14273g = this.mConfig;
        c14273g.f60152Y = jSONArray;
        this.mCaptureAndEnc.m84661a(c14273g);
        this.mRoomInfo.decProperties = jSONObject.has("decProperties") ? jSONObject.getJSONArray("decProperties") : null;
        int i = jSONObject.has("restartDecoder") ? jSONObject.getInt("restartDecoder") : 0;
        this.mRoomInfo.enableRestartDecoder = i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrientation(final int i) {
        if (i == -1) {
            return;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.179
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.checkRenderRotation(i);
                if (TRTCCloudImpl.this.mSensorMode != 0) {
                    TRTCCloudImpl.this.checkVideoEncRotation(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQoSParams() {
        TXCAudioEncoderConfig audioEncoderConfig = TXCAudioEngine.getInstance().getAudioEncoderConfig();
        TXCLog.m84152i("", "setQoSParams:" + audioEncoderConfig.sampleRate + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + audioEncoderConfig.channels + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + audioEncoderConfig.minBitrate + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + audioEncoderConfig.maxBitrate);
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(1);
        if (tRTCCloudImpl != null) {
            nativeSetAudioEncodeConfiguration(tRTCCloudImpl.getNetworkContext(), audioEncoderConfig.minBitrate, audioEncoderConfig.maxBitrate, audioEncoderConfig.sampleRate, audioEncoderConfig.channels);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoEncConfig(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        if (this.mRoomState == 0) {
            apiLog("setVideoEncConfig ignore when no in room");
        } else if (this.mCodecType != 2) {
            setVideoEncoderConfiguration(i, i2, i3, i4, i5, 1, z, i6);
        } else {
            setVideoEncoderConfiguration(i, i2, i3, i4, i5, this.mAppScene, z, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoEncoderConfiguration(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(Integer.valueOf(i));
        if (tRTCCloudImpl != null) {
            nativeSetVideoEncoderConfiguration(tRTCCloudImpl.getNetworkContext(), i, i2, i3, i4, i5, i6, z, i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoEncoderParamEx(JSONObject jSONObject) throws JSONException {
        TRTCCloudImpl tRTCCloudImpl;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            apiLog("callExperimentalAPI[lack parameter or illegal type]: codecType");
            return;
        }
        int iOptInt = jSONObject.optInt("codecType", -1);
        if (iOptInt != -1) {
            this.mCodecType = iOptInt;
            if (iOptInt == 0 && (jSONObjectOptJSONObject = jSONObject.optJSONObject("softwareCodecParams")) != null) {
                this.mConfig.f60143P = jSONObjectOptJSONObject.optInt("enableRealTime") != 0;
                this.mConfig.f60166n = jSONObjectOptJSONObject.optInt("profile");
            }
        }
        int iOptInt2 = jSONObject.optInt("videoWidth", 0);
        int iOptInt3 = jSONObject.optInt("videoHeight", 0);
        int iOptInt4 = jSONObject.optInt("videoFps", 0);
        int iOptInt5 = jSONObject.optInt("videoBitrate", 0);
        int iOptInt6 = jSONObject.optInt("minVideoBitrate", 0);
        int iOptInt7 = jSONObject.optInt("rcMethod", 0);
        if (iOptInt2 <= 0 || iOptInt3 <= 0) {
            return;
        }
        int i = WBConstants.SDK_NEW_PAY_VERSION;
        if (iOptInt2 > 1920) {
            iOptInt3 = (iOptInt3 * WBConstants.SDK_NEW_PAY_VERSION) / WBConstants.SDK_NEW_PAY_VERSION;
            iOptInt2 = 1920;
        }
        if (iOptInt3 > 1920) {
            iOptInt2 = (iOptInt2 * WBConstants.SDK_NEW_PAY_VERSION) / WBConstants.SDK_NEW_PAY_VERSION;
        } else {
            i = iOptInt3;
        }
        int i2 = 90;
        if (iOptInt2 < 90) {
            i = (i * 90) / 90;
            iOptInt2 = 90;
        }
        if (i < 90) {
            iOptInt2 = (iOptInt2 * 90) / 90;
        } else {
            i2 = i;
        }
        int i3 = ((iOptInt2 + 15) / 16) * 16;
        int i4 = ((i2 + 15) / 16) * 16;
        int iOptInt8 = jSONObject.optInt("streamType", 0);
        if (iOptInt8 == 0) {
            this.mLatestParamsOfBigEncoder.putInt(KEY_CONFIG_FPS, iOptInt4);
            tRTCCloudImpl = this;
            tRTCCloudImpl.updateBigStreamEncoder(i3 <= i4, i3, i4, iOptInt4, iOptInt5, this.mConfig.f60168p, iOptInt6);
            iOptInt4 = iOptInt4;
            iOptInt5 = iOptInt5;
            tRTCCloudImpl.mCaptureAndEnc.m84695m(iOptInt7);
        } else {
            tRTCCloudImpl = this;
            if (iOptInt8 == 1) {
                tRTCCloudImpl.mLatestParamsOfSmallEncoder.putInt(KEY_CONFIG_FPS, iOptInt4);
                tRTCCloudImpl.updateSmallStreamEncoder(i3, i4, iOptInt4, iOptInt5, iOptInt6);
            }
        }
        tRTCCloudImpl.apiLog("vsize setVideoEncoderParamEx->width:" + tRTCCloudImpl.mRoomInfo.bigEncSize.f60180a + ", height:" + tRTCCloudImpl.mRoomInfo.bigEncSize.f60181b + ", fps:" + iOptInt4 + ", bitrate:" + iOptInt5 + ", stream:" + iOptInt8);
        tRTCCloudImpl.updateOrientation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoEncoderParamInternal(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        if (tRTCVideoEncParam == null) {
            apiLog("setVideoEncoderParam param is null");
            return;
        }
        this.mLatestParamsOfBigEncoder.putInt(KEY_CONFIG_FPS, tRTCVideoEncParam.videoFps);
        this.mLatestParamsOfBigEncoder.putBoolean(KEY_CONFIG_ADJUST_RESOLUTION, tRTCVideoEncParam.enableAdjustRes);
        C14273g.a sizeByResolution = getSizeByResolution(tRTCVideoEncParam.videoResolution, tRTCVideoEncParam.videoResolutionMode);
        updateBigStreamEncoder(tRTCVideoEncParam.videoResolutionMode == 1, sizeByResolution.f60180a, sizeByResolution.f60181b, tRTCVideoEncParam.videoFps, tRTCVideoEncParam.videoBitrate, tRTCVideoEncParam.enableAdjustRes, tRTCVideoEncParam.minVideoBitrate);
        apiLog("vsize setVideoEncoderParam->width:" + this.mRoomInfo.bigEncSize.f60180a + ", height:" + this.mRoomInfo.bigEncSize.f60181b + ", fps:" + tRTCVideoEncParam.videoFps + ", bitrate:" + tRTCVideoEncParam.videoBitrate + ", mode:" + tRTCVideoEncParam.videoResolutionMode + " minVideoBitrate:" + tRTCVideoEncParam.minVideoBitrate);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("setVideoEncoderParam width:%d, height:%d, fps:%d, bitrate:%d, mode:%d, minBitrate:%d", Integer.valueOf(this.mRoomInfo.bigEncSize.f60180a), Integer.valueOf(this.mRoomInfo.bigEncSize.f60181b), Integer.valueOf(tRTCVideoEncParam.videoFps), Integer.valueOf(tRTCVideoEncParam.videoBitrate), Integer.valueOf(tRTCVideoEncParam.videoResolutionMode), Integer.valueOf(tRTCVideoEncParam.minVideoBitrate)));
        sb.append(" self:");
        sb.append(hashCode());
        Monitor.m84161a(1, sb.toString(), "", 0);
        updateOrientation();
        C14273g.a aVar = this.mRoomInfo.bigEncSize;
        TXCEventRecorderProxy.m84163a("18446744073709551615", ErrorCode.CAMEAR_GET_STATUS_FAILED, (long) aVar.f60180a, (long) aVar.f60181b, "", 2);
        TXCEventRecorderProxy.m84163a("18446744073709551615", ErrorCode.CAMERA_SWITCH_FAILED, (long) tRTCVideoEncParam.videoFps, -1L, "", 2);
        TXCEventRecorderProxy.m84163a("18446744073709551615", ErrorCode.CAMERA_TAKE_PHOTO_FAILED, (long) tRTCVideoEncParam.videoBitrate, -1L, "", 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoQuality(int i, int i2) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(2);
        if (tRTCCloudImpl != null) {
            nativeSetVideoQuality(tRTCCloudImpl.getNetworkContext(), i, i2);
        }
    }

    public static TRTCCloud sharedInstance(Context context) {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            try {
                if (sInstance == null) {
                    sInstance = new TRTCCloudImpl(context);
                }
                tRTCCloudImpl = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tRTCCloudImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFloatingWindow(View view) {
        int i;
        if (view == null) {
            return;
        }
        if (!Settings.canDrawOverlays(view.getContext())) {
            TXCLog.m84149e(TAG, "can't show floating window for no drawing overlay permission");
            return;
        }
        this.mFloatingWindow = view;
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            i = 2038;
        } else {
            i = i2 > 24 ? 2002 : 2005;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i);
        layoutParams.flags = 8 | 262144;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        windowManager.addView(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRemoteRender(TXCRenderAndDec tXCRenderAndDec, int i) {
        tXCRenderAndDec.stopVideo();
        tXCRenderAndDec.setStreamType(i);
        tXCRenderAndDec.startVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopLocalAudioInternal() {
        if (!this.mIsAudioCapturing) {
            apiLog("stopLocalAudio when no capturing audio, ignore!!!");
            return;
        }
        apiLog("stopLocalAudio");
        Monitor.m84161a(1, "stopLocalAudio self:" + hashCode(), "", 0);
        TXCEventRecorderProxy.m84163a("18446744073709551615", 3001, 2L, -1L, "", 0);
        this.mIsAudioCapturing = false;
        TXCAudioEngine.getInstance().stopLocalAudio();
        if (!this.mEnableCustomAudioCapture) {
            enableAudioStream(false);
        }
        TXCKeyPointReportProxy.m84167a(40050, 0, 1);
        TXCLog.m84153i(TAG, "(%d)stopLocalAudioInternal end", Integer.valueOf(hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRemoteMainRender(TRTCRoomInfo.UserInfo userInfo, Boolean bool) {
        if (userInfo == null) {
            return;
        }
        apiLog(String.format("stopRemoteRender userID:%s tinyID:%d streamType:%d", userInfo.userID, Long.valueOf(userInfo.tinyID), Integer.valueOf(userInfo.streamType)));
        nativeCancelDownStream(this.mNativeRtcContext, userInfo.tinyID, 2, bool.booleanValue());
        nativeCancelDownStream(this.mNativeRtcContext, userInfo.tinyID, 3, bool.booleanValue());
        TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.stopVideo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRemoteSubRender(TRTCRoomInfo.UserInfo userInfo) {
        if (userInfo == null) {
            return;
        }
        apiLog(String.format("stopRemoteRender userID:%s tinyID:%d streamType:%d", userInfo.userID, Long.valueOf(userInfo.tinyID), 7));
        nativeCancelDownStream(this.mNativeRtcContext, userInfo.tinyID, 7, false);
        TXCRenderAndDec tXCRenderAndDec = userInfo.subRender.render;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.stopVideo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int translateStreamType(int i) {
        if (i != 3) {
            return i != 7 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBigStreamEncoder(boolean z, int i, int i2, int i3, int i4, boolean z2, int i5) {
        if (i > 0 && i2 > 0) {
            C14273g.a aVar = this.mRoomInfo.bigEncSize;
            aVar.f60180a = i;
            aVar.f60181b = i2;
            if (this.mVideoSourceType == VideoSourceType.SCREEN) {
                C14273g c14273g = this.mConfig;
                c14273g.f60164l = 1;
                c14273g.f60153a = i;
                c14273g.f60154b = i2;
            } else {
                C14273g c14273g2 = this.mConfig;
                if (z) {
                    c14273g2.f60164l = 1;
                    c14273g2.f60153a = i;
                    c14273g2.f60154b = i2;
                } else {
                    c14273g2.f60164l = 0;
                    c14273g2.f60153a = i2;
                    c14273g2.f60154b = i;
                }
            }
            this.mConfig.f60163k = EnumC14168c.RESOLUTION_TYPE_INVALID;
        }
        if (i3 > 0) {
            if (i3 > 30) {
                apiLog("setVideoEncoderParam fps > 30, limit fps to 30");
                this.mConfig.f60160h = 30;
            } else {
                this.mConfig.f60160h = i3;
            }
        }
        if (i4 > 0) {
            this.mConfig.f60155c = i4;
        }
        if (i5 >= 0) {
            this.mConfig.f60157e = i5;
        }
        VideoSourceType videoSourceType = this.mVideoSourceType;
        VideoSourceType videoSourceType2 = VideoSourceType.SCREEN;
        C14273g c14273g3 = this.mConfig;
        if (videoSourceType == videoSourceType2) {
            c14273g3.f60161i = 3;
            c14273g3.f60168p = false;
            if (this.mOverrideFPSFromUser) {
                c14273g3.f60160h = 10;
            }
        } else {
            c14273g3.f60168p = z2;
        }
        C14273g.a aVar2 = this.mRoomInfo.bigEncSize;
        int i6 = aVar2.f60180a;
        int i7 = aVar2.f60181b;
        C14273g c14273g4 = this.mConfig;
        setVideoEncConfig(2, i6, i7, c14273g4.f60160h, c14273g4.f60155c, c14273g4.f60168p, c14273g4.f60157e);
        if (this.mCodecType == 2) {
            C14273g c14273g5 = this.mConfig;
            if (c14273g5.f60153a * c14273g5.f60154b >= 518400) {
                c14273g5.f60162j = 1;
            }
        }
        this.mCaptureAndEnc.m84678e(this.mConfig.f60160h);
        this.mCaptureAndEnc.m84661a(this.mConfig);
    }

    private void updateEncType() {
        int i = this.mCodecType;
        if (i == 0 || i == 1) {
            this.mConfig.f60162j = i;
        } else if (this.mAppScene == 1) {
            this.mConfig.f60162j = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateOrientation() {
        VideoSourceType videoSourceType = this.mVideoSourceType;
        if (videoSourceType == VideoSourceType.CUSTOM || videoSourceType == VideoSourceType.SCREEN) {
            return;
        }
        if (this.mCurrentOrientation == -1) {
            if (this.mDisplay.getRotation() == 1) {
                this.mCurrentOrientation = 0;
            } else {
                this.mCurrentOrientation = 1;
            }
        }
        setOrientation(this.mCurrentOrientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSmallStreamEncoder(int i, int i2, int i3, int i4, int i5) {
        if (i > 0 && i2 > 0) {
            C14273g.a aVar = this.mRoomInfo.smallEncSize;
            aVar.f60180a = i;
            aVar.f60181b = i2;
        }
        if (i3 > 0) {
            if (i3 > 20) {
                apiLog("setVideoSmallEncoderParam fps > 20, limit fps to 20");
                this.mSmallEncParam.videoFps = 20;
            } else {
                this.mSmallEncParam.videoFps = i3;
            }
        }
        if (i4 > 0) {
            this.mSmallEncParam.videoBitrate = i4;
        }
        if (i5 >= 0) {
            this.mSmallEncParam.minVideoBitrate = i5;
        }
        int i6 = this.mConfig.f60161i;
        if (this.mVideoSourceType == VideoSourceType.SCREEN) {
            TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam = this.mSmallEncParam;
            tRTCVideoEncParam.enableAdjustRes = false;
            if (this.mOverrideFPSFromUser) {
                tRTCVideoEncParam.videoFps = 10;
            }
            i6 = 3;
        }
        int i7 = i6;
        C14270d c14270d = this.mCaptureAndEnc;
        boolean z = this.mEnableSmallStream;
        C14273g.a aVar2 = this.mRoomInfo.smallEncSize;
        int i8 = aVar2.f60180a;
        int i9 = aVar2.f60181b;
        TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam2 = this.mSmallEncParam;
        c14270d.m84650a(z, i8, i9, tRTCVideoEncParam2.videoFps, tRTCVideoEncParam2.videoBitrate, i7);
        C14273g.a aVar3 = this.mRoomInfo.smallEncSize;
        int i10 = aVar3.f60180a;
        int i11 = aVar3.f60181b;
        TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam3 = this.mSmallEncParam;
        setVideoEncConfig(3, i10, i11, tRTCVideoEncParam3.videoFps, tRTCVideoEncParam3.videoBitrate, this.mConfig.f60168p, tRTCVideoEncParam3.minVideoBitrate);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void ConnectOtherRoom(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.8
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("ConnectOtherRoom " + str);
                Monitor.m84161a(1, String.format("ConnectOtherRoom param:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.nativeConnectOtherRoom(tRTCCloudImpl.mNativeRtcContext, str);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void DisconnectOtherRoom() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.9
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("DisconnectOtherRoom");
                Monitor.m84161a(1, "DisconnectOtherRoom self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.nativeDisconnectOtherRoom(tRTCCloudImpl.mNativeRtcContext);
            }
        });
    }

    public void apiLog(String str) {
        TXCLog.m84152i(TAG, "(" + hashCode() + ")trtc_api " + str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void callExperimentalAPI(final String str) {
        final JSONObject jSONObject;
        final String string = "";
        if (str != null) {
            StringBuilder sb = new StringBuilder("callExperimentalAPI  ");
            sb.append(str);
            sb.append(", roomid = ");
            TRTCRoomInfo tRTCRoomInfo = this.mRoomInfo;
            long j = tRTCRoomInfo.roomId;
            sb.append(j != -1 ? Long.valueOf(j) : tRTCRoomInfo.strRoomId);
            apiLog(sb.toString());
            Monitor.m84161a(1, String.format("callExperimentalAPI:%s", str) + " self:" + hashCode(), "", 0);
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (!jSONObject2.has("api")) {
                apiLog("callExperimentalAPI[lack api or illegal type]: " + str);
                return;
            }
            string = jSONObject2.getString("api");
            if (jSONObject2.has(CommandMessage.PARAMS)) {
                jSONObject = jSONObject2.getJSONObject(CommandMessage.PARAMS);
                if (string.equals("setEncodedDataProcessingListener")) {
                    setEncodedDataProcessingListener(jSONObject);
                } else {
                    runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.83
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                if (string.equals("setSEIPayloadType")) {
                                    TRTCCloudImpl.this.setSEIPayloadType(jSONObject);
                                    return;
                                }
                                if (string.equals("setLocalAudioMuteMode")) {
                                    TRTCCloudImpl.this.setLocalAudioMuteMode(jSONObject);
                                    return;
                                }
                                if (string.equals("setVideoEncodeParamEx")) {
                                    TRTCCloudImpl.this.setVideoEncoderParamEx(jSONObject);
                                    return;
                                }
                                if (string.equals("setAudioSampleRate")) {
                                    TRTCCloudImpl.this.setAudioSampleRate(jSONObject);
                                    return;
                                }
                                if (string.equals("muteRemoteAudioInSpeaker")) {
                                    TRTCCloudImpl.this.muteRemoteAudioInSpeaker(jSONObject);
                                    return;
                                }
                                if (string.equals("enableAudioAGC")) {
                                    TRTCCloudImpl.this.enableAudioAGC(jSONObject);
                                    return;
                                }
                                if (string.equals("enableAudioAEC")) {
                                    TRTCCloudImpl.this.enableAudioAEC(jSONObject);
                                    return;
                                }
                                if (string.equals("enableAudioANS")) {
                                    TRTCCloudImpl.this.enableAudioANS(jSONObject);
                                    return;
                                }
                                if (string.equals("setPerformanceMode")) {
                                    TRTCCloudImpl.this.setPerformanceMode(jSONObject);
                                    return;
                                }
                                if (string.equals("setCustomRenderMode")) {
                                    TRTCCloudImpl.this.setCustomRenderMode(jSONObject);
                                    return;
                                }
                                if (string.equals("setMediaCodecConfig")) {
                                    TRTCCloudImpl.this.setMediaCodecConfig(jSONObject);
                                    return;
                                }
                                if (string.equals("sendJsonCMD")) {
                                    TRTCCloudImpl.this.sendJsonCmd(jSONObject, str);
                                    return;
                                }
                                if (string.equals("updatePrivateMapKey")) {
                                    TRTCCloudImpl.this.updatePrivateMapKey(jSONObject);
                                    return;
                                }
                                if (string.equals("setFramework")) {
                                    TRTCCloudImpl.this.setFramework(jSONObject);
                                    return;
                                }
                                if (string.equals("forceCallbackMixedPlayAudioFrame")) {
                                    TRTCCloudImpl.this.forceCallbackMixedPlayAudioFrame(jSONObject);
                                    return;
                                }
                                if (string.equals("setSystemAudioKitEnabled")) {
                                    TXCAudioEngine.getInstance().setSystemAudioKitEnabled();
                                    return;
                                }
                                TRTCCloudImpl.this.apiLog("callExperimentalAPI[illegal api]: " + string);
                            } catch (Exception e) {
                                TRTCCloudImpl.this.apiLog("callExperimentalAPI[failed]: " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + e.getMessage());
                            }
                        }
                    });
                }
            }
        } catch (Exception unused) {
            apiLog("callExperimentalAPI[failed]: " + str);
            jSONObject = null;
        }
    }

    public void checkDashBoard() {
        final TXCloudVideoView tXCloudVideoView;
        if (this.mDebugType != 0 && (tXCloudVideoView = this.mRoomInfo.localView) != null) {
            final CharSequence uploadStreamInfo = getUploadStreamInfo();
            TXCLog.m84152i(TAG, "[STATUS]" + uploadStreamInfo.toString().replace(SignParameters.NEW_LINE, "") + " self:" + hashCode());
            runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.175
                @Override // java.lang.Runnable
                public void run() {
                    tXCloudVideoView.setDashBoardStatusInfo(uploadStreamInfo);
                }
            });
        }
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.176
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                if (tXCRenderAndDec != null && tXCRenderAndDec.isRendering()) {
                    userInfo.mainRender.render.updateLoadInfo();
                }
                TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
                if (tXCRenderAndDec2 != null && tXCRenderAndDec2.isRendering()) {
                    userInfo.subRender.render.updateLoadInfo();
                }
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (tRTCCloudImpl.mDebugType != 0) {
                    TRTCRoomInfo.RenderInfo renderInfo = userInfo.mainRender;
                    tRTCCloudImpl.checkRemoteDashBoard(renderInfo.view, renderInfo.render, userInfo);
                    TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                    TRTCRoomInfo.RenderInfo renderInfo2 = userInfo.subRender;
                    tRTCCloudImpl2.checkRemoteDashBoard(renderInfo2.view, renderInfo2.render, userInfo);
                }
            }
        });
    }

    public void checkRemoteDashBoard(final TXCloudVideoView tXCloudVideoView, TXCRenderAndDec tXCRenderAndDec, TRTCRoomInfo.UserInfo userInfo) {
        if (tXCloudVideoView == null || tXCRenderAndDec == null || !tXCRenderAndDec.isRendering()) {
            return;
        }
        final CharSequence downloadStreamInfo = getDownloadStreamInfo(tXCRenderAndDec, userInfo);
        TXCLog.m84152i(TAG, "[STATUS]" + downloadStreamInfo.toString().replace(SignParameters.NEW_LINE, "") + " self:" + hashCode());
        runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.174
            @Override // java.lang.Runnable
            public void run() {
                tXCloudVideoView.setDashBoardStatusInfo(downloadStreamInfo);
            }
        });
    }

    public void checkUserState(final String str, long j, int i, int i2) {
        final TRTCCloudListener tRTCCloudListener = this.mTRTCListener;
        if (tRTCCloudListener == null || TextUtils.isEmpty(str)) {
            return;
        }
        final boolean z = TRTCRoomInfo.hasAudio(i) && !TRTCRoomInfo.isMuteAudio(i);
        if ((TRTCRoomInfo.hasAudio(i2) && !TRTCRoomInfo.isMuteAudio(i2)) != z) {
            runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.171
                @Override // java.lang.Runnable
                public void run() {
                    tRTCCloudListener.onUserAudioAvailable(str, z);
                }
            });
            appendDashboardLog(this.mRoomInfo.getUserId(), 0, String.format("[%s]audio Available[%b]", str, Boolean.valueOf(z)));
            Monitor.m84161a(2, String.format("onUserAudioAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z)) + " self:" + hashCode(), "", 0);
        }
        final boolean z2 = (TRTCRoomInfo.hasMainVideo(i) || TRTCRoomInfo.hasSmallVideo(i)) && !TRTCRoomInfo.isMuteMainVideo(i);
        boolean z3 = ((TRTCRoomInfo.hasMainVideo(i2) || TRTCRoomInfo.hasSmallVideo(i2)) && !TRTCRoomInfo.isMuteMainVideo(i2)) != z2;
        int i3 = this.mRecvMode;
        boolean z4 = (i3 == 3 || i3 == 1) ? false : true;
        if (z3 && (this.mRoomInfo.hasRecvFirstIFrame(j) || z4)) {
            runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.172
                @Override // java.lang.Runnable
                public void run() {
                    tRTCCloudListener.onUserVideoAvailable(str, z2);
                }
            });
            appendDashboardLog(this.mRoomInfo.getUserId(), 0, String.format("[%s]video Available[%b]", str, Boolean.valueOf(z2)));
            Monitor.m84161a(2, String.format("onUserVideoAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z2)) + " self:" + hashCode(), "", 0);
        }
        final boolean z5 = TRTCRoomInfo.hasSubVideo(i) && !TRTCRoomInfo.isMuteSubVideo(i);
        if ((TRTCRoomInfo.hasSubVideo(i2) && !TRTCRoomInfo.isMuteSubVideo(i2)) != z5) {
            runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.173
                @Override // java.lang.Runnable
                public void run() {
                    tRTCCloudListener.onUserSubStreamAvailable(str, z5);
                }
            });
            appendDashboardLog(this.mRoomInfo.getUserId(), 0, String.format("[%s]subVideo Available[%b]", str, Boolean.valueOf(z5)));
            Monitor.m84161a(2, String.format("onUserSubStreamAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z5)) + " self:" + hashCode(), "", 0);
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TRTCCloud createSubCloud() {
        final TRTCSubCloud tRTCSubCloud = new TRTCSubCloud(this.mContext, new WeakReference(this), this.mSDKHandler);
        tRTCSubCloud.setListenerHandler(this.mListenerHandler);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.12
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mSubClouds.add(new WeakReference<>(tRTCSubCloud));
            }
        });
        return tRTCSubCloud;
    }

    public void destroy() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.2
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl;
                TXCAudioEngineJNI.nativeSetAudioPlayoutTunnelEnabled(false);
                synchronized (TRTCCloudImpl.this.mNativeLock) {
                    try {
                        TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                        if (tRTCCloudImpl2.mNativeRtcContext != 0) {
                            tRTCCloudImpl2.apiLog("destroy context");
                            TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                            tRTCCloudImpl3.nativeDestroyContext(tRTCCloudImpl3.mNativeRtcContext);
                        }
                        tRTCCloudImpl = TRTCCloudImpl.this;
                        tRTCCloudImpl.mNativeRtcContext = 0L;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                tRTCCloudImpl.mTRTCListener = null;
                tRTCCloudImpl.mAudioFrameListener = null;
                tRTCCloudImpl.setAudioCaptureVolume(100);
                TRTCCloudImpl.this.setAudioPlayoutVolume(100);
                TXCSoundEffectPlayer.getInstance().setSoundEffectListener(null);
                TXCAudioEngine.getInstance().clean();
                synchronized (TRTCCloudImpl.this.mCurrentPublishClouds) {
                    TRTCCloudImpl.this.mCurrentPublishClouds.clear();
                }
                Iterator<WeakReference<TRTCCloudImpl>> it = TRTCCloudImpl.this.mSubClouds.iterator();
                while (it.hasNext()) {
                    TRTCCloudImpl tRTCCloudImpl4 = it.next().get();
                    if (tRTCCloudImpl4 != null) {
                        tRTCCloudImpl4.destroy();
                    }
                }
                TRTCCloudImpl.this.mSubClouds.clear();
                C14143a.m83848a().m83849a(TRTCCloudImpl.this.hashCode());
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void destroySubCloud(final TRTCCloud tRTCCloud) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.13
            @Override // java.lang.Runnable
            public void run() {
                Iterator<WeakReference<TRTCCloudImpl>> it = TRTCCloudImpl.this.mSubClouds.iterator();
                while (it.hasNext()) {
                    TRTCCloudImpl tRTCCloudImpl = it.next().get();
                    if (tRTCCloudImpl != null && tRTCCloudImpl == tRTCCloud) {
                        tRTCCloudImpl.destroy();
                        it.remove();
                        return;
                    }
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioEarMonitoring(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.59
            @Override // java.lang.Runnable
            public void run() {
                Monitor.m84161a(1, String.format("enableAudioEarMonitoring enable:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TXAudioEffectManagerImpl.getInstance().enableVoiceEarMonitor(z);
            }
        });
    }

    public void enableAudioStream(boolean z) {
        if (z) {
            addUpStreamType(1);
        } else {
            removeUpStreamType(1);
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableAudioVolumeEvaluation(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.64
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 <= 0) {
                    i2 = 0;
                } else if (i2 < 100) {
                    i2 = 100;
                }
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (i2 == tRTCCloudImpl.mAudioVolumeEvalInterval) {
                    return;
                }
                tRTCCloudImpl.apiLog("enableAudioVolumeEvaluation " + i2);
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.mAudioVolumeEvalInterval = i2;
                if (i2 > 0) {
                    tRTCCloudImpl2.startVolumeLevelCal(true);
                } else {
                    tRTCCloudImpl2.startVolumeLevelCal(false);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomAudioCapture(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.86
            @Override // java.lang.Runnable
            public void run() {
                boolean z2 = TRTCCloudImpl.this.mEnableCustomAudioCapture;
                boolean z3 = z;
                if (z2 == z3) {
                    return;
                }
                TRTCCloudImpl.this.mEnableCustomAudioCapture = z3;
                boolean z4 = z;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (z4) {
                    tRTCCloudImpl.mConfig.f60145R |= 1;
                    if (tRTCCloudImpl.mCurrentRole == 21) {
                        tRTCCloudImpl.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.86.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                                if (tRTCCloudListener == null) {
                                    return;
                                }
                                tRTCCloudListener.onWarning(6001, "ignore send custom audio,for role audience", null);
                            }
                        });
                        TRTCCloudImpl.this.apiLog("ignore enableCustomAudioCapture,for role audience");
                    }
                } else {
                    tRTCCloudImpl.mConfig.f60145R &= -2;
                }
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.mCaptureAndEnc.m84661a(tRTCCloudImpl2.mConfig);
                TRTCCloudImpl.this.apiLog("enableCustomAudioCapture " + z);
                Monitor.m84161a(1, String.format("enableCustomAudioCapture:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                if (!TRTCCloudImpl.this.mIsAudioCapturing) {
                    TRTCCloudImpl.this.enableAudioStream(z);
                }
                if (z) {
                    TRTCCloudImpl.this.setQoSParams();
                    TXCAudioEngineJNI.nativeUseSysAudioDevice(false);
                    TXCAudioEngine.getInstance().startLocalAudio(11, true);
                    TXCAudioEngine.getInstance().enableEncodedDataPackWithTRAEHeaderCallback(true);
                    TXCEventRecorderProxy.m84163a("18446744073709551615", 3003, 11L, -1L, "", 0);
                } else {
                    TXCAudioEngine.getInstance().stopLocalAudio();
                }
                TXCKeyPointReportProxy.m84167a(40050, z ? 1 : 0, 1);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.82
            @Override // java.lang.Runnable
            public void run() {
                if (z && TRTCCloudImpl.this.mVideoSourceType != VideoSourceType.NONE) {
                    TRTCCloudImpl.this.notifyCaptureStarted("Has started capturing, ignore enableCustomVideoCapture");
                    return;
                }
                if (z || TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.CUSTOM) {
                    TRTCCloudImpl.this.mVideoSourceType = z ? VideoSourceType.CUSTOM : VideoSourceType.NONE;
                    boolean z2 = z;
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    if (z2) {
                        tRTCCloudImpl.mConfig.f60145R |= 2;
                        tRTCCloudImpl.mLastCaptureCalculateTS = 0L;
                        TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                        if (tRTCCloudImpl2.mCurrentRole == 21) {
                            tRTCCloudImpl2.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.82.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                                    if (tRTCCloudListener == null) {
                                        return;
                                    }
                                    tRTCCloudListener.onWarning(6001, "ignore send custom video,for role audience", null);
                                }
                            });
                            TRTCCloudImpl.this.apiLog("ignore enableCustomVideoCapture,for role audience");
                        }
                    } else {
                        tRTCCloudImpl.mConfig.f60145R &= -3;
                        synchronized (this) {
                            try {
                                if (TRTCCloudImpl.this.mCustomVideoUtil != null) {
                                    TRTCCloudImpl.this.mCustomVideoUtil.release();
                                    TRTCCloudImpl.this.mCustomVideoUtil = null;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                    tRTCCloudImpl3.mCaptureAndEnc.m84661a(tRTCCloudImpl3.mConfig);
                    TRTCCloudImpl.this.mEnableCustomVideoCapture = z;
                    TRTCCloudImpl.this.apiLog("enableCustomVideoCapture " + z);
                    Monitor.m84161a(1, String.format("enableCustomVideoCapture:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    boolean z3 = z;
                    TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                    if (z3) {
                        tRTCCloudImpl4.enableVideoStream(true);
                    } else if (!tRTCCloudImpl4.mIsVideoCapturing) {
                        TRTCCloudImpl.this.enableVideoStream(false);
                    }
                    TXCKeyPointReportProxy.m84167a(40046, z ? 1 : 0, 2);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int enableEncSmallVideoStream(final boolean z, final TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.42
            @Override // java.lang.Runnable
            public void run() {
                int i;
                TRTCCloudImpl.this.apiLog("enableEncSmallVideoStream " + z);
                TRTCCloudImpl.this.mEnableSmallStream = z;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.enableNetworkSmallStream(tRTCCloudImpl.mEnableSmallStream);
                if (tRTCVideoEncParam != null) {
                    TRTCCloudImpl.this.mSmallEncParam.videoBitrate = tRTCVideoEncParam.videoBitrate;
                    TRTCCloudImpl.this.mSmallEncParam.minVideoBitrate = tRTCVideoEncParam.minVideoBitrate;
                    TRTCCloudImpl.this.mSmallEncParam.videoFps = tRTCVideoEncParam.videoFps;
                    TRTCCloudImpl.this.mSmallEncParam.videoResolution = tRTCVideoEncParam.videoResolution;
                    TRTCCloudImpl.this.mSmallEncParam.videoResolutionMode = tRTCVideoEncParam.videoResolutionMode;
                    TRTCCloudImpl.this.mLatestParamsOfSmallEncoder.putInt(TRTCCloudImpl.KEY_CONFIG_FPS, tRTCVideoEncParam.videoFps);
                    TRTCCloudImpl.this.mLatestParamsOfSmallEncoder.putBoolean(TRTCCloudImpl.KEY_CONFIG_ADJUST_RESOLUTION, tRTCVideoEncParam.enableAdjustRes);
                }
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                C14273g c14273g = tRTCCloudImpl2.mConfig;
                boolean z2 = c14273g.f60168p;
                int i2 = c14273g.f60161i;
                if (tRTCCloudImpl2.mVideoSourceType == VideoSourceType.SCREEN) {
                    if (TRTCCloudImpl.this.mOverrideFPSFromUser) {
                        TRTCCloudImpl.this.mSmallEncParam.videoFps = 10;
                    }
                    z2 = false;
                    i = 3;
                } else {
                    i = i2;
                }
                boolean z3 = z2;
                TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                tRTCCloudImpl3.mRoomInfo.smallEncSize = tRTCCloudImpl3.getSizeByResolution(tRTCCloudImpl3.mSmallEncParam.videoResolution, TRTCCloudImpl.this.mSmallEncParam.videoResolutionMode);
                TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                C14270d c14270d = tRTCCloudImpl4.mCaptureAndEnc;
                boolean z4 = tRTCCloudImpl4.mEnableSmallStream;
                TRTCCloudImpl tRTCCloudImpl5 = TRTCCloudImpl.this;
                C14273g.a aVar = tRTCCloudImpl5.mRoomInfo.smallEncSize;
                c14270d.m84650a(z4, aVar.f60180a, aVar.f60181b, tRTCCloudImpl5.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, i);
                boolean z5 = TRTCCloudImpl.this.mEnableSmallStream;
                TRTCCloudImpl tRTCCloudImpl6 = TRTCCloudImpl.this;
                if (!z5) {
                    tRTCCloudImpl6.setVideoEncoderConfiguration(3, 0, 0, 0, 0, 0, tRTCCloudImpl6.mConfig.f60168p, 0);
                    TRTCCloudImpl.this.removeUpStreamType(3);
                } else {
                    C14273g.a aVar2 = tRTCCloudImpl6.mRoomInfo.smallEncSize;
                    tRTCCloudImpl6.setVideoEncConfig(3, aVar2.f60180a, aVar2.f60181b, tRTCCloudImpl6.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, z3, TRTCCloudImpl.this.mSmallEncParam.minVideoBitrate);
                    TRTCCloudImpl.this.addUpStreamType(3);
                }
            }
        });
        return 0;
    }

    public void enableNetworkBlackStream(boolean z) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(2);
        if (tRTCCloudImpl != null) {
            nativeEnableBlackStream(tRTCCloudImpl.getNetworkContext(), z);
        }
    }

    public void enableNetworkSmallStream(boolean z) {
        TRTCCloudImpl tRTCCloudImpl = this.mCurrentPublishClouds.get(2);
        if (tRTCCloudImpl != null) {
            nativeEnableSmallStream(tRTCCloudImpl.getNetworkContext(), z);
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean enableTorch(boolean z) {
        apiLog("enableTorch " + z);
        return this.mCaptureAndEnc.m84676d(z);
    }

    public void enableVideoStream(boolean z) {
        if (!z) {
            if (!this.mCaptureAndEnc.m84687h()) {
                removeUpStreamType(2);
            }
            removeUpStreamType(3);
        } else {
            addUpStreamType(2);
            if (this.mEnableSmallStream) {
                addUpStreamType(3);
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, final int i) {
        if (tRTCParams == null) {
            apiLog("enter room, param nil!");
            onEnterRoom(TXLiteAVCode.ERR_ENTER_ROOM_PARAM_NULL, "enter room param null");
            return;
        }
        final TRTCCloudDef.TRTCParams tRTCParams2 = new TRTCCloudDef.TRTCParams(tRTCParams);
        if (tRTCParams2.sdkAppId == 0 || TextUtils.isEmpty(tRTCParams2.userId) || TextUtils.isEmpty(tRTCParams2.userSig)) {
            apiLog("enterRoom param invalid:" + tRTCParams2);
            if (tRTCParams2.sdkAppId == 0) {
                onEnterRoom(TXLiteAVCode.ERR_SDK_APPID_INVALID, "enter room sdkAppId invalid.");
            }
            if (TextUtils.isEmpty(tRTCParams2.userSig)) {
                onEnterRoom(TXLiteAVCode.ERR_USER_SIG_INVALID, "enter room userSig invalid.");
            }
            if (TextUtils.isEmpty(tRTCParams2.userId)) {
                onEnterRoom(TXLiteAVCode.ERR_USER_ID_INVALID, "enter room userId invalid.");
                return;
            }
            return;
        }
        int i2 = tRTCParams2.roomId;
        final long j = ((long) i2) & 4294967295L;
        String string = tRTCParams2.businessInfo;
        String str = "";
        if (j == 0 || (i2 == -1 && !TextUtils.isEmpty(string))) {
            String string2 = j == 0 ? tRTCParams2.strRoomId : "";
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    StringBuilder sb = new StringBuilder("");
                    extractBizInfo(jSONObject, "strGroupId", sb);
                    if (tRTCParams2.roomId == -1) {
                        string2 = sb.toString();
                    }
                    string = jSONObject.length() != 0 ? jSONObject.toString() : "";
                } catch (Exception unused) {
                    apiLog("enter room, room id error, busInfo " + tRTCParams2.businessInfo);
                }
            }
            str = string2;
            if (TextUtils.isEmpty(str)) {
                onEnterRoom(TXLiteAVCode.ERR_ROOM_ID_INVALID, "room id invalid.");
                return;
            }
        }
        final String str2 = string;
        final String str3 = str;
        TXCKeyPointReportProxy.m84165a(30001);
        final int i3 = tRTCParams2.role;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.5
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                String str4;
                int i4;
                TRTCCloudDef.TRTCParams tRTCParams3 = tRTCParams2;
                String str5 = tRTCParams3.userId;
                int i5 = tRTCParams3.sdkAppId;
                if (TextUtils.isEmpty(str3)) {
                    str4 = j + "";
                } else {
                    str4 = str3;
                }
                Monitor.m84162a(str5, i5, str4);
                boolean z = false;
                if (TRTCCloudImpl.this.mRoomState != 0) {
                    if (TextUtils.isEmpty(str3) || !str3.equalsIgnoreCase(TRTCCloudImpl.this.mRoomInfo.strRoomId)) {
                        TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                        long j2 = tRTCCloudImpl.mRoomInfo.roomId;
                        long j3 = j;
                        if (j2 != j3 || j3 == 0 || j3 == -1) {
                            tRTCCloudImpl.apiLog(String.format("enter another room[%d] when in room[%d], exit the old room!!!", Long.valueOf(j3), Long.valueOf(TRTCCloudImpl.this.mRoomInfo.roomId)));
                            TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                            tRTCCloudImpl2.mIsExitOldRoom = true;
                            tRTCCloudImpl2.exitRoom();
                        }
                    }
                    TRTCCloudImpl.this.apiLog(String.format("enter the same room[%d] again!!!", Long.valueOf(j)));
                    TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                    tRTCCloudImpl3.mRoomInfo.enterTime = jCurrentTimeMillis;
                    tRTCCloudImpl3.onEnterRoom(0, "enter the same room.");
                    return;
                }
                TRTCCloudImpl.this.apiLog("========================================================================================================");
                TRTCCloudImpl.this.apiLog("========================================================================================================");
                TRTCCloudImpl.this.apiLog(String.format("============= SDK Version:%s Device Name:%s System Version:%s =============", TXCCommonUtil.getSDKVersionStr(), C14215f.m84232c(), C14215f.m84234d()));
                TRTCCloudImpl.this.apiLog("========================================================================================================");
                TRTCCloudImpl.this.apiLog("========================================================================================================");
                TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                Long lValueOf = Long.valueOf(j);
                String str6 = str3;
                TRTCCloudDef.TRTCParams tRTCParams4 = tRTCParams2;
                tRTCCloudImpl4.apiLog(String.format("enterRoom roomId:%d(%s)  userId:%s sdkAppId:%d scene:%d, bizinfo:%s", lValueOf, str6, tRTCParams4.userId, Integer.valueOf(tRTCParams4.sdkAppId), Integer.valueOf(i), str2));
                String str7 = "enterRoom self:" + TRTCCloudImpl.this.hashCode();
                int i6 = i;
                String str8 = "VideoCall";
                if (i6 == 0) {
                    i4 = 1;
                } else {
                    if (i6 == 1) {
                        str8 = "Live";
                    } else if (i6 == 2) {
                        str8 = "AudioCall";
                        i6 = 0;
                        i4 = 1;
                    } else if (i6 != 3) {
                        TXCLog.m84156w(TRTCCloudImpl.TAG, "enter room scene:%u error! default to VideoCall! " + i + " self:" + TRTCCloudImpl.this.hashCode());
                        i6 = 0;
                    } else {
                        str8 = "VoiceChatRoom";
                        i6 = 1;
                    }
                    i4 = 2;
                }
                TXCAudioEngine.getInstance().setAudioQuality(i4, 1);
                Monitor.m84161a(1, str7, String.format("bussInfo:%s, appScene:%s, role:%s, streamid:%s", str2, str8, i3 == 20 ? "Anchor" : "Audience", tRTCParams2.streamId), 0);
                if (TRTCCloudImpl.this.mAudioFrameListener != null) {
                    TXCAudioEngine.setPlayoutDataListener(this);
                }
                TXCEventRecorderProxy.m84163a("18446744073709551615", 5001, j, -1L, "", 0);
                TXCStatus.m84178a("18446744073709551615", 10003, C14215f.m84232c());
                TRTCCloudImpl tRTCCloudImpl5 = TRTCCloudImpl.this;
                tRTCCloudImpl5.mRoomState = 1;
                if (tRTCCloudImpl5.mNativeRtcContext == 0) {
                    int[] sDKVersion = TXCCommonUtil.getSDKVersion();
                    int i7 = sDKVersion.length >= 1 ? sDKVersion[0] : 0;
                    int i8 = sDKVersion.length >= 2 ? sDKVersion[1] : 0;
                    int i9 = sDKVersion.length >= 3 ? sDKVersion[2] : 0;
                    TRTCCloudImpl tRTCCloudImpl6 = TRTCCloudImpl.this;
                    tRTCCloudImpl6.mNativeRtcContext = tRTCCloudImpl6.nativeCreateContext(i7, i8, i9);
                }
                TRTCCloudImpl.this.updateAppScene(i6);
                TRTCCloudImpl tRTCCloudImpl7 = TRTCCloudImpl.this;
                tRTCCloudImpl7.mCaptureAndEnc.m84661a(tRTCCloudImpl7.mConfig);
                if (i == 0 && TRTCCloudImpl.this.mCodecType == 2) {
                    z = true;
                }
                boolean z2 = z;
                TRTCCloudImpl.this.mCaptureAndEnc.m84682f(z);
                TRTCCloudImpl tRTCCloudImpl8 = TRTCCloudImpl.this;
                tRTCCloudImpl8.setVideoQuality(tRTCCloudImpl8.mQosMode, TRTCCloudImpl.this.mQosPreference);
                TRTCCloudImpl tRTCCloudImpl9 = TRTCCloudImpl.this;
                C14273g.a aVar = tRTCCloudImpl9.mRoomInfo.bigEncSize;
                int i10 = aVar.f60180a;
                int i11 = aVar.f60181b;
                C14273g c14273g = tRTCCloudImpl9.mConfig;
                tRTCCloudImpl9.setVideoEncConfig(2, i10, i11, c14273g.f60160h, c14273g.f60155c, c14273g.f60168p, c14273g.f60157e);
                boolean z3 = TRTCCloudImpl.this.mEnableSmallStream;
                TRTCCloudImpl tRTCCloudImpl10 = TRTCCloudImpl.this;
                if (z3) {
                    C14273g.a aVar2 = tRTCCloudImpl10.mRoomInfo.smallEncSize;
                    int i12 = aVar2.f60180a;
                    int i13 = aVar2.f60181b;
                    int i14 = tRTCCloudImpl10.mSmallEncParam.videoFps;
                    int i15 = TRTCCloudImpl.this.mSmallEncParam.videoBitrate;
                    TRTCCloudImpl tRTCCloudImpl11 = TRTCCloudImpl.this;
                    tRTCCloudImpl10.setVideoEncConfig(3, i12, i13, i14, i15, tRTCCloudImpl11.mConfig.f60168p, tRTCCloudImpl11.mSmallEncParam.minVideoBitrate);
                } else {
                    tRTCCloudImpl10.setVideoEncoderConfiguration(3, 0, 0, 0, 0, 0, tRTCCloudImpl10.mConfig.f60168p, 0);
                }
                TRTCCloudImpl tRTCCloudImpl12 = TRTCCloudImpl.this;
                C14270d c14270d = tRTCCloudImpl12.mCaptureAndEnc;
                boolean z4 = tRTCCloudImpl12.mEnableSmallStream;
                TRTCCloudImpl tRTCCloudImpl13 = TRTCCloudImpl.this;
                C14273g.a aVar3 = tRTCCloudImpl13.mRoomInfo.smallEncSize;
                c14270d.m84650a(z4, aVar3.f60180a, aVar3.f60181b, tRTCCloudImpl13.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, TRTCCloudImpl.this.mConfig.f60161i);
                String strM84234d = C14215f.m84234d();
                String strM84232c = C14215f.m84232c();
                TRTCCloudImpl.this.nativeSetDataReportDeviceInfo(strM84232c, strM84234d, tRTCParams2.sdkAppId);
                TXCKeyPointReportProxy.C14202a c14202a = new TXCKeyPointReportProxy.C14202a();
                c14202a.f59297d = i;
                c14202a.f59298e = strM84232c;
                c14202a.f59299f = strM84234d;
                Context context = TRTCCloudImpl.this.mContext;
                c14202a.f59301h = context != null ? context.getPackageName() : "";
                c14202a.f59295b = tRTCParams2.sdkAppId;
                c14202a.f59300g = TXCCommonUtil.getSDKVersionStr();
                c14202a.f59296c = TRTCCloudImpl.this.mFramework;
                TXCKeyPointReportProxy.m84169a(c14202a);
                TRTCCloudImpl tRTCCloudImpl14 = TRTCCloudImpl.this;
                tRTCCloudImpl14.nativeSetPriorRemoteVideoStreamType(tRTCCloudImpl14.mNativeRtcContext, tRTCCloudImpl14.mPriorStreamType);
                TRTCCloudImpl tRTCCloudImpl15 = TRTCCloudImpl.this;
                byte[] token = tRTCCloudImpl15.mRoomInfo.getToken(tRTCCloudImpl15.mContext);
                TRTCCloudImpl tRTCCloudImpl16 = TRTCCloudImpl.this;
                long j4 = tRTCCloudImpl16.mNativeRtcContext;
                TRTCCloudDef.TRTCParams tRTCParams5 = tRTCParams2;
                tRTCCloudImpl16.nativeInit(j4, tRTCParams5.sdkAppId, tRTCParams5.userId, tRTCParams5.userSig, token);
                Iterator it = TRTCCloudImpl.this.mStreamTypes.iterator();
                while (it.hasNext()) {
                    TRTCCloudImpl.this.addUpStreamType(((Integer) it.next()).intValue());
                }
                TRTCCloudImpl tRTCCloudImpl17 = TRTCCloudImpl.this;
                tRTCCloudImpl17.enableNetworkSmallStream(tRTCCloudImpl17.mEnableSmallStream);
                TRTCCloudImpl tRTCCloudImpl18 = TRTCCloudImpl.this;
                tRTCCloudImpl18.enableNetworkBlackStream(tRTCCloudImpl18.mCaptureAndEnc.m84687h());
                TRTCCloudDef.TRTCParams tRTCParams6 = tRTCParams2;
                String str9 = tRTCParams6.privateMapKey;
                String str10 = str9 != null ? str9 : "";
                String str11 = str3;
                String str12 = str11 != null ? str11 : "";
                String str13 = str2;
                String str14 = str13 != null ? str13 : "";
                String str15 = tRTCParams6.userDefineRecordId;
                String str16 = str15 != null ? str15 : "";
                String str17 = tRTCParams6.streamId;
                String str18 = str17 != null ? str17 : "";
                TRTCCloudImpl tRTCCloudImpl19 = TRTCCloudImpl.this;
                tRTCCloudImpl19.nativeEnterRoom(tRTCCloudImpl19.mNativeRtcContext, j, str14, str10, str12, i3, 255, z2 ? 1 : 0, i, tRTCCloudImpl19.mPerformanceMode, C14215f.m84232c(), C14215f.m84234d(), TRTCCloudImpl.this.mRecvMode, str16, str18);
                TRTCCloudImpl tRTCCloudImpl20 = TRTCCloudImpl.this;
                int i16 = i3;
                tRTCCloudImpl20.mCurrentRole = i16;
                tRTCCloudImpl20.mTargetRole = i16;
                if (i16 == 21 && (tRTCCloudImpl20.mEnableCustomAudioCapture || TRTCCloudImpl.this.mIsAudioCapturing || TRTCCloudImpl.this.mVideoSourceType != VideoSourceType.NONE)) {
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener == null) {
                                return;
                            }
                            tRTCCloudListener.onWarning(6001, "ignore upstream for audience", null);
                        }
                    });
                    TRTCCloudImpl.this.apiLog("ignore upstream for audience, when enter room!!");
                }
                TRTCCloudImpl.this.mCaptureAndEnc.m84674d();
                TRTCCloudImpl.this.startCollectStatus();
                TRTCCloudImpl tRTCCloudImpl21 = TRTCCloudImpl.this;
                tRTCCloudImpl21.mLastStateTimeMs = 0L;
                tRTCCloudImpl21.mRoomInfo.init(j, tRTCParams2.userId);
                TRTCCloudImpl tRTCCloudImpl22 = TRTCCloudImpl.this;
                TRTCRoomInfo tRTCRoomInfo = tRTCCloudImpl22.mRoomInfo;
                tRTCRoomInfo.strRoomId = str12;
                TRTCCloudDef.TRTCParams tRTCParams7 = tRTCParams2;
                tRTCRoomInfo.sdkAppId = tRTCParams7.sdkAppId;
                tRTCRoomInfo.userSig = tRTCParams7.userSig;
                tRTCRoomInfo.privateMapKey = str10;
                tRTCRoomInfo.enterTime = jCurrentTimeMillis;
                C14273g c14273g2 = tRTCCloudImpl22.mConfig;
                TXCEventRecorderProxy.m84163a("18446744073709551615", ErrorCode.CAMEAR_GET_STATUS_FAILED, c14273g2.f60153a, c14273g2.f60154b, "", 2);
                TXCEventRecorderProxy.m84163a("18446744073709551615", ErrorCode.CAMERA_SWITCH_FAILED, TRTCCloudImpl.this.mConfig.f60160h, -1L, "", 2);
                TXCEventRecorderProxy.m84163a("18446744073709551615", ErrorCode.CAMERA_TAKE_PHOTO_FAILED, TRTCCloudImpl.this.mConfig.f60155c, -1L, "", 2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void exitRoom() {
        runOnSDKThreadAndWaitDone(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.6
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.exitRoomInternal(true, "call from api");
            }
        }, 2000L);
    }

    public void exitRoomInternal(boolean z, String str) {
        String str2 = String.format(Locale.ENGLISH, "exitRoom %s, self: %d, reason: %s", Long.valueOf(this.mRoomInfo.getRoomId()), Integer.valueOf(hashCode()), str);
        apiLog(str2);
        Monitor.m84161a(1, str2, "", 0);
        if (this.mRoomState == 0) {
            Monitor.m84159a();
            apiLog("exitRoom ignore when no in room.");
            return;
        }
        this.mRoomState = 0;
        this.mCaptureAndEnc.m84677e();
        TXCSoundEffectPlayer.getInstance().stopAllEffect();
        stopCollectStatus();
        startVolumeLevelCal(false);
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.7
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str3, TRTCRoomInfo.UserInfo userInfo) {
                TRTCCloudImpl.this.stopRemoteRender(userInfo);
                C14143a.m83848a().m83850a(String.valueOf(userInfo.tinyID), TRTCCloudImpl.this.hashCode());
                TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                if (tXCRenderAndDec != null) {
                    tXCRenderAndDec.setVideoFrameListener(null, EnumC14167b.UNKNOWN);
                }
                TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
                if (tXCRenderAndDec2 != null) {
                    tXCRenderAndDec2.setVideoFrameListener(null, EnumC14167b.UNKNOWN);
                }
            }
        });
        TXCAudioEngine.getInstance();
        TXCAudioEngine.setPlayoutDataListener(null);
        enableVideoStream(false);
        enableAudioStream(false);
        if (z) {
            nativeExitRoom(this.mNativeRtcContext);
        }
        enableAudioEarMonitoring(false);
        stopLocalAudioInternal();
        stopBGM();
        TXCKeyPointReportProxy.m84165a(31004);
        stopLocalPreview();
        stopScreenCapture();
        TXCKeyPointReportProxy.m84172b(31004, 0);
        C14273g c14273g = this.mConfig;
        c14273g.f60128A = null;
        c14273g.f60130C = 10;
        this.mRoomInfo.clear();
        this.mRenderListenerMap.clear();
        this.mVideoSourceType = VideoSourceType.NONE;
        this.mEnableSmallStream = false;
        this.mEnableEosMode = false;
        this.mCodecType = 2;
        this.mEnableSoftAEC = true;
        this.mEnableSoftANS = false;
        this.mEnableSoftAGC = false;
        this.mCaptureAndEnc.m84665a(false);
        TXCAudioEngine.getInstance().muteLocalAudio(false);
        TXCAudioEngine.getInstance().clean();
        enableCustomAudioCapture(false);
        enableCustomVideoCapture(false);
        synchronized (this) {
            try {
                TRTCCustomTextureUtil tRTCCustomTextureUtil = this.mCustomVideoUtil;
                if (tRTCCustomTextureUtil != null) {
                    tRTCCustomTextureUtil.release();
                    this.mCustomVideoUtil = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mCaptureAndEnc.m84662a((InterfaceC14318o) null, 0);
        stopAudioRecording();
        TXCSoundEffectPlayer.getInstance().clearCache();
        Monitor.m84159a();
        TXCLog.m84153i(TAG, "(%d) exitRoomInternal end", Integer.valueOf(hashCode()));
    }

    public void extractBizInfo(JSONObject jSONObject, String str, StringBuilder sb) {
        if (str.equals("strGroupId")) {
            sb.append(jSONObject.optString("strGroupId").toString());
            jSONObject.remove("strGroupId");
            jSONObject.remove("Role");
        }
        apiLog("extractBizInfo: key" + str + " value:" + sb.toString());
    }

    public void finalize() throws Throwable {
        super.finalize();
        try {
            destroy();
            HandlerC14214e handlerC14214e = this.mSDKHandler;
            if (handlerC14214e != null) {
                handlerC14214e.getLooper().quit();
            }
        } catch (Error | Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioCaptureVolume() {
        return this.mAudioCaptureVolume;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXAudioEffectManager getAudioEffectManager() {
        return TXAudioEffectManagerImpl.getAutoCacheHolder();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getAudioPlayoutVolume() {
        return this.mAudioPlayoutVolume;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int getBGMDuration(String str) {
        return TXCLiveBGMPlayer.getInstance().getBGMDuration(str);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public TXBeautyManager getBeautyManager() {
        if (this.mCaptureAndEnc == null) {
            this.mCaptureAndEnc = new C14270d(this.mContext);
        }
        return this.mCaptureAndEnc.m84666b();
    }

    public long getNetworkContext() {
        return this.mNativeRtcContext;
    }

    public int getNetworkQuality(int i, int i2) {
        if (!C14215f.m84235d(this.mContext)) {
            return 6;
        }
        if (i2 > 50 || i > 500) {
            return 5;
        }
        if (i2 > 30 || i > 350) {
            return 4;
        }
        if (i2 > 20 || i > 200) {
            return 3;
        }
        if (i2 > 10 || i > 100) {
            return 2;
        }
        return (i2 >= 0 || i >= 0) ? 1 : 0;
    }

    public CharSequence getUploadStreamInfo() {
        int[] iArrM84226a = C14215f.m84226a();
        int iM84183c = TXCStatus.m84183c("18446744073709551615", 4003, 2);
        String strM84179b = TXCStatus.m84179b("18446744073709551615", 10001);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("LOCAL: [%s] RTT:%dms\n", this.mRoomInfo.getUserId(), Integer.valueOf(TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningNetBusy))));
        Locale locale = Locale.CHINA;
        sb.append(String.format(locale, "SEND:% 5dkbps LOSS:%d-%d-%d-%d|%d-%d-%d-%d|%d%%\n", Integer.valueOf(TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningReconnect)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomEventStartPlayAudioFrame, 2)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomEventVideoPlayLag, 2)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", 13013, 2)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", 13010, 2)), Integer.valueOf(TXCStatus.m84182c("18446744073709551615", RtcEngineEvent.EvtType.EVT_QUERY_RECORDING_SERVICE_STATUS)), Integer.valueOf(TXCStatus.m84182c("18446744073709551615", RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE_ERROR)), Integer.valueOf(TXCStatus.m84182c("18446744073709551615", RtcEngineEvent.EvtType.EVT_VIDEO_SIZE_CHANGED)), Integer.valueOf(TXCStatus.m84182c("18446744073709551615", RtcEngineEvent.EvtType.EVT_CONNECTION_INTERRUPTED)), Integer.valueOf(TXCStatus.m84182c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningHWAcceFailed))));
        sb.append(String.format(locale, "BIT:%d|%d|%dkbps RES:%dx%d FPS:%d-%d\n", Integer.valueOf(TXCStatus.m84183c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomEventOpenCameraSucc, 2)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", TXILiveRoomDefine.TXILiveRoomEventOpenCameraSucc, 3)), Integer.valueOf(TXCStatus.m84182c("18446744073709551615", RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME)), Integer.valueOf(iM84183c >> 16), Integer.valueOf(iM84183c & p7f.COLOR_SPACE_UNCALIBRATED), Integer.valueOf((int) TXCStatus.m84185d("18446744073709551615", 4001, 2)), Integer.valueOf((int) TXCStatus.m84185d("18446744073709551615", 13014, 2))));
        sb.append(String.format(locale, "FEC:%d%%|%d%%  ARQ:%d|%dkbps  RPS:%d\n", Integer.valueOf(TXCStatus.m84183c("18446744073709551615", 13004, 2)), Integer.valueOf(TXCStatus.m84182c("18446744073709551615", 14006)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", 13008, 2)), Integer.valueOf(TXCStatus.m84182c("18446744073709551615", RtcEngineEvent.EvtType.EVT_CONNECTION_LOST)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", 13007, 2))));
        sb.append(String.format(locale, "CPU:%d%%|%d%%    QOS:%s|%dkbps|%d-%d\n", Integer.valueOf(iArrM84226a[0] / 10), Integer.valueOf(iArrM84226a[1] / 10), getQosValue(TXCStatus.m84183c("18446744073709551615", 15009, 2)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", 15002, 2)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", 15010, 2)), Integer.valueOf(TXCStatus.m84183c("18446744073709551615", 15005, 2))));
        sb.append(String.format(locale, "SVR:%s", strM84179b));
        return sb.toString();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraAutoFocusFaceModeSupported() {
        return this.mCaptureAndEnc.m84698o();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraFocusPositionInPreviewSupported() {
        return this.mCaptureAndEnc.m84697n();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraTorchSupported() {
        return this.mCaptureAndEnc.m84696m();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean isCameraZoomSupported() {
        return this.mCaptureAndEnc.m84694l();
    }

    public boolean isPublishingInCloud(TRTCCloudImpl tRTCCloudImpl, int i) {
        synchronized (this.mCurrentPublishClouds) {
            try {
                return this.mCurrentPublishClouds.get(Integer.valueOf(i)) == tRTCCloudImpl;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteAllRemoteAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.56
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("muteAllRemoteAudio " + z);
                Monitor.m84161a(1, String.format("muteAllRemoteAudio mute:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCRoomInfo tRTCRoomInfo = TRTCCloudImpl.this.mRoomInfo;
                tRTCRoomInfo.muteRemoteAudio = z;
                tRTCRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.56.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        userInfo.mainRender.muteAudio = z;
                        TXCAudioEngine.getInstance().muteRemoteAudio(String.valueOf(userInfo.tinyID), z);
                        RunnableC1442656 runnableC1442656 = RunnableC1442656.this;
                        if (z) {
                            TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                            tRTCCloudImpl.nativeCancelDownStream(tRTCCloudImpl.mNativeRtcContext, userInfo.tinyID, 1, true);
                        } else {
                            TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                            tRTCCloudImpl2.nativeRequestDownStream(tRTCCloudImpl2.mNativeRtcContext, userInfo.tinyID, 1, true);
                        }
                    }
                });
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteAllRemoteVideoStreams(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.33
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("muteAllRemoteVideoStreams mute " + z);
                Monitor.m84161a(1, String.format("muteAllRemoteVideoStreams mute:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCRoomInfo tRTCRoomInfo = TRTCCloudImpl.this.mRoomInfo;
                tRTCRoomInfo.muteRemoteVideo = z;
                tRTCRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.33.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        TRTCRoomInfo.RenderInfo renderInfo = userInfo.mainRender;
                        RunnableC1440133 runnableC1440133 = RunnableC1440133.this;
                        renderInfo.muteVideo = z;
                        TRTCCloudImpl.this.apiLog("muteRemoteVideoStream " + userInfo.userID + ", mute " + z);
                        TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                        if (tXCRenderAndDec != null) {
                            tXCRenderAndDec.muteVideo(z);
                        }
                        RunnableC1440133 runnableC1440134 = RunnableC1440133.this;
                        if (z) {
                            TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                            tRTCCloudImpl.nativeCancelDownStream(tRTCCloudImpl.mNativeRtcContext, userInfo.tinyID, 2, true);
                            TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                            tRTCCloudImpl2.nativeCancelDownStream(tRTCCloudImpl2.mNativeRtcContext, userInfo.tinyID, 3, true);
                            TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                            tRTCCloudImpl3.nativeCancelDownStream(tRTCCloudImpl3.mNativeRtcContext, userInfo.tinyID, 7, true);
                            return;
                        }
                        TXCRenderAndDec tXCRenderAndDec2 = userInfo.mainRender.render;
                        if (tXCRenderAndDec2 != null && tXCRenderAndDec2.isRendering()) {
                            TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                            tRTCCloudImpl4.nativeRequestDownStream(tRTCCloudImpl4.mNativeRtcContext, userInfo.tinyID, userInfo.streamType, true);
                        }
                        TXCRenderAndDec tXCRenderAndDec3 = userInfo.subRender.render;
                        if (tXCRenderAndDec3 == null || !tXCRenderAndDec3.isRendering()) {
                            return;
                        }
                        TRTCCloudImpl tRTCCloudImpl5 = TRTCCloudImpl.this;
                        tRTCCloudImpl5.nativeRequestDownStream(tRTCCloudImpl5.mNativeRtcContext, userInfo.tinyID, 7, true);
                    }
                });
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.53
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("muteLocalAudio " + z);
                Monitor.m84161a(1, String.format("muteLocalAudio mute:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.muteLocalAudio(z, tRTCCloudImpl);
                if (z) {
                    TXCEventRecorderProxy.m84163a("18446744073709551615", 3001, 1L, -1L, "", 0);
                } else {
                    TXCEventRecorderProxy.m84163a("18446744073709551615", 3001, 3L, -1L, "", 0);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalVideo(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.29
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("muteLocalVideo " + z + ", " + TRTCCloudImpl.this.mConfig.f60128A);
                Monitor.m84161a(1, String.format("muteLocalVideo mute:%b", Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TXCEventRecorderProxy.m84163a("18446744073709551615", ErrorCode.CAMERA_SELECT_COLORFORMAT_FAILED, z ? 1L : 0L, -1L, "", 2);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.muteLocalVideo(z, tRTCCloudImpl);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteAudio(final String str, final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.55
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl.this.apiLog("muteRemoteAudio " + str + " no exist.");
                    TRTCRoomInfo.UserInfo userInfoCreateUserInfo = TRTCCloudImpl.this.createUserInfo(str);
                    userInfoCreateUserInfo.mainRender.muteAudio = z;
                    TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, userInfoCreateUserInfo);
                    return;
                }
                user.mainRender.muteAudio = z;
                TRTCCloudImpl.this.apiLog("muteRemoteAudio " + str + ", " + z);
                Monitor.m84161a(1, String.format("muteRemoteAudio userId:%s mute:%b", str, Boolean.valueOf(z)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                if (user.tinyID == 0) {
                    return;
                }
                TXCAudioEngine.getInstance().muteRemoteAudio(String.valueOf(user.tinyID), z);
                boolean z2 = z;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (z2) {
                    tRTCCloudImpl.nativeCancelDownStream(tRTCCloudImpl.mNativeRtcContext, user.tinyID, 1, true);
                } else {
                    tRTCCloudImpl.nativeRequestDownStream(tRTCCloudImpl.mNativeRtcContext, user.tinyID, 1, true);
                }
            }
        });
    }

    public void muteRemoteAudioInSpeaker(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("muteRemoteAudioInSpeaker[lack parameter]");
            return;
        }
        if (!jSONObject.has("userID")) {
            apiLog("muteRemoteAudioInSpeaker[lack parameter]: userID");
            return;
        }
        String string = jSONObject.getString("userID");
        if (string == null) {
            apiLog("muteRemoteAudioInSpeaker[illegal type]: userID");
            return;
        }
        if (!jSONObject.has(BLiveButtonType.mute)) {
            apiLog("muteRemoteAudioInSpeaker[lack parameter]: mute");
            return;
        }
        int i = jSONObject.getInt(BLiveButtonType.mute);
        TRTCRoomInfo.UserInfo user = this.mRoomInfo.getUser(string);
        if (user != null) {
            TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(String.valueOf(user.tinyID), i == 1);
            return;
        }
        apiLog("muteRemoteAudioInSpeaker " + string + " no exist, create one.");
        TRTCRoomInfo.UserInfo userInfoCreateUserInfo = createUserInfo(string);
        userInfoCreateUserInfo.muteAudioInSpeaker = i == 1;
        this.mRoomInfo.addUserInfo(string, userInfoCreateUserInfo);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(final String str, final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.32
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl.this.apiLog("muteRemoteVideoStream " + str + " no exist.");
                    TRTCRoomInfo.UserInfo userInfoCreateUserInfo = TRTCCloudImpl.this.createUserInfo(str);
                    userInfoCreateUserInfo.mainRender.muteVideo = z;
                    TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, userInfoCreateUserInfo);
                    return;
                }
                user.mainRender.muteVideo = z;
                TRTCCloudImpl.this.apiLog("muteRemoteVideoStream " + str + ", mute:" + z);
                StringBuilder sb = new StringBuilder("muteRemoteVideoStream userId:%s mute:%b self:");
                sb.append(TRTCCloudImpl.this.hashCode());
                Monitor.m84161a(1, String.format(sb.toString(), str, Boolean.valueOf(z)), "", 0);
                if (user.tinyID == 0) {
                    return;
                }
                TXCRenderAndDec tXCRenderAndDec = user.mainRender.render;
                if (tXCRenderAndDec != null) {
                    tXCRenderAndDec.muteVideo(z);
                }
                boolean z2 = z;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (!z2) {
                    tRTCCloudImpl.nativeRequestDownStream(tRTCCloudImpl.mNativeRtcContext, user.tinyID, user.streamType, true);
                    TXCEventRecorderProxy.m84163a(String.valueOf(user.tinyID), 4014, 0L, -1L, "", 0);
                } else {
                    tRTCCloudImpl.nativeCancelDownStream(tRTCCloudImpl.mNativeRtcContext, user.tinyID, 2, true);
                    TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                    tRTCCloudImpl2.nativeCancelDownStream(tRTCCloudImpl2.mNativeRtcContext, user.tinyID, 3, true);
                    TXCEventRecorderProxy.m84163a(String.valueOf(user.tinyID), 4014, 1L, -1L, "", 0);
                }
            }
        });
    }

    public native int nativeAddUpstream(long j, int i);

    public native long nativeCreateContext(int i, int i2, int i3);

    public native void nativeDestroyContext(long j);

    public native int nativeEnterRoom(long j, long j2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, String str4, String str5, int i6, String str6, String str7);

    public native int nativeExitRoom(long j);

    public native void nativeInit(long j, int i, String str, String str2, byte[] bArr);

    public native void nativeSetMixTranscodingConfig(long j, TRTCTranscodingConfigInner tRTCTranscodingConfigInner);

    public native int nativeSetPriorRemoteVideoStreamType(long j, int i);

    public native void nativeSwitchRoom(long j, long j2, String str, String str2, String str3);

    public void onAVMemberEnter(final long j, final String str, final int i, final int i2) {
        final WeakReference weakReference = new WeakReference(this);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.138
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (tRTCCloudImpl.mRoomState == 0) {
                    tRTCCloudImpl.apiLog("ignore onAVMemberEnter when out room.");
                    return;
                }
                if (((TRTCCloudImpl) weakReference.get()) == null) {
                    return;
                }
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user != null) {
                    TRTCCloudImpl.this.apiLog(" user " + str + "enter room when user is in room " + j);
                }
                String strValueOf = String.valueOf(j);
                if (user == null) {
                    user = TRTCCloudImpl.this.createUserInfo(str);
                }
                TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(strValueOf, TRTCCloudImpl.this);
                if (TRTCCloudImpl.this.mAudioFrameListener != null) {
                    TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(strValueOf, TRTCCloudImpl.this);
                }
                C14143a.m83848a().m83851a(strValueOf, true, TRTCCloudImpl.this.hashCode());
                TXCAudioEngine.getInstance().muteRemoteAudio(strValueOf, user.mainRender.muteAudio);
                TXCAudioEngine.getInstance().muteRemoteAudioInSpeaker(strValueOf, user.muteAudioInSpeaker);
                if (user.mainRender.muteAudio) {
                    TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                    tRTCCloudImpl2.nativeCancelDownStream(tRTCCloudImpl2.mNativeRtcContext, j, 1, true);
                }
                TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                TXCRenderAndDec tXCRenderAndDecCreateRender = tRTCCloudImpl3.createRender(j, tRTCCloudImpl3.mPriorStreamType);
                RenderListenerAdapter renderListenerAdapter = TRTCCloudImpl.this.mRenderListenerMap.get(str);
                if (renderListenerAdapter != null) {
                    renderListenerAdapter.strTinyID = strValueOf;
                    if (renderListenerAdapter.listener != null) {
                        TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                        tXCRenderAndDecCreateRender.setVideoFrameListener(tRTCCloudImpl4, tRTCCloudImpl4.getPixelFormat(renderListenerAdapter.pixelFormat));
                    }
                }
                long j2 = j;
                user.tinyID = j2;
                String str2 = str;
                user.userID = str2;
                user.terminalType = i;
                user.streamState = i2;
                TRTCRoomInfo.RenderInfo renderInfo = user.mainRender;
                renderInfo.render = tXCRenderAndDecCreateRender;
                renderInfo.tinyID = j2;
                TRTCCloudImpl tRTCCloudImpl5 = TRTCCloudImpl.this;
                user.streamType = tRTCCloudImpl5.mPriorStreamType;
                TXCloudVideoView tXCloudVideoView = renderInfo.view;
                if (tXCloudVideoView != null) {
                    tRTCCloudImpl5.setRenderView(str2, renderInfo, tXCloudVideoView, user.debugMargin);
                    TRTCCloudImpl.this.apiLog(String.format("startRemoteView when user enter userID:%s tinyID:%d streamType:%d", str, Long.valueOf(user.tinyID), Integer.valueOf(user.streamType)));
                    TRTCCloudImpl.this.notifyLogByUserId(String.valueOf(user.tinyID), user.streamType, 0, "Start watching " + str);
                    TRTCCloudImpl.this.startRemoteRender(user.mainRender.render, user.streamType);
                    TXCKeyPointReportProxy.m84170a(String.valueOf(user.tinyID), TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD, 0L, user.streamType);
                    boolean z = user.mainRender.muteVideo;
                    TRTCCloudImpl tRTCCloudImpl6 = TRTCCloudImpl.this;
                    if (z) {
                        tRTCCloudImpl6.nativeCancelDownStream(tRTCCloudImpl6.mNativeRtcContext, user.tinyID, user.streamType, true);
                    } else {
                        tRTCCloudImpl6.nativeRequestDownStream(tRTCCloudImpl6.mNativeRtcContext, user.tinyID, user.streamType, true);
                    }
                }
                TXCRenderAndDec tXCRenderAndDecCreateRender2 = TRTCCloudImpl.this.createRender(j, 7);
                TRTCRoomInfo.RenderInfo renderInfo2 = user.subRender;
                renderInfo2.render = tXCRenderAndDecCreateRender2;
                renderInfo2.tinyID = j;
                TRTCCloudImpl tRTCCloudImpl7 = TRTCCloudImpl.this;
                renderInfo2.muteVideo = tRTCCloudImpl7.mRoomInfo.muteRemoteVideo;
                TXCloudVideoView tXCloudVideoView2 = renderInfo2.view;
                if (tXCloudVideoView2 != null) {
                    tRTCCloudImpl7.setRenderView(str, renderInfo2, tXCloudVideoView2, user.debugMargin);
                    TRTCCloudImpl.this.apiLog(String.format("onUserScreenAvailable when user enter userID:%s tinyID:%d streamType:%d", str, Long.valueOf(user.tinyID), 7));
                    Monitor.m84161a(1, String.format("startRemoteSubStreamView userID:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    TRTCCloudImpl.this.notifyLogByUserId(String.valueOf(user.tinyID), 7, 0, "Start watching " + str);
                    TRTCCloudImpl.this.startRemoteRender(user.subRender.render, 7);
                    TXCKeyPointReportProxy.m84170a(String.valueOf(user.tinyID), TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD, 0L, 7);
                    if (!user.subRender.muteVideo) {
                        TRTCCloudImpl tRTCCloudImpl8 = TRTCCloudImpl.this;
                        tRTCCloudImpl8.nativeRequestDownStream(tRTCCloudImpl8.mNativeRtcContext, user.tinyID, 7, true);
                    }
                }
                TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, user);
                TRTCCloudImpl.this.apiLog("onAVMemberEnter " + j + ", " + str + ", " + i2);
                TRTCCloudImpl tRTCCloudImpl9 = TRTCCloudImpl.this;
                final TRTCCloudListener tRTCCloudListener = tRTCCloudImpl9.mTRTCListener;
                tRTCCloudImpl9.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.138.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudListener tRTCCloudListener2 = tRTCCloudListener;
                        if (tRTCCloudListener2 != null) {
                            tRTCCloudListener2.onUserEnter(str);
                        }
                    }
                });
                final boolean z2 = TRTCRoomInfo.hasAudio(i2) && !TRTCRoomInfo.isMuteAudio(i2);
                if (z2) {
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.138.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener2 = tRTCCloudListener;
                            if (tRTCCloudListener2 != null) {
                                tRTCCloudListener2.onUserAudioAvailable(str, z2);
                            }
                            Monitor.m84161a(2, String.format("onUserAudioAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z2)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                        }
                    });
                    TRTCCloudImpl tRTCCloudImpl10 = TRTCCloudImpl.this;
                    tRTCCloudImpl10.appendDashboardLog(tRTCCloudImpl10.mRoomInfo.getUserId(), 0, String.format("[%s]audio Available[true]", str));
                }
                final boolean z3 = (TRTCRoomInfo.hasMainVideo(i2) || TRTCRoomInfo.hasSmallVideo(i2)) && !TRTCRoomInfo.isMuteMainVideo(i2);
                if (z3 && TRTCCloudImpl.this.mRoomInfo.hasRecvFirstIFrame(j)) {
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.138.3
                        @Override // java.lang.Runnable
                        public void run() {
                            TXCLog.m84152i(TRTCCloudImpl.TAG, "notify onUserVideoAvailable:" + j + " [" + z3 + "] by bit state. self:" + TRTCCloudImpl.this.hashCode());
                            TRTCCloudListener tRTCCloudListener2 = tRTCCloudListener;
                            if (tRTCCloudListener2 != null) {
                                tRTCCloudListener2.onUserVideoAvailable(str, z3);
                            }
                            Monitor.m84161a(2, String.format("onUserVideoAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z3)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                        }
                    });
                    TRTCCloudImpl tRTCCloudImpl11 = TRTCCloudImpl.this;
                    tRTCCloudImpl11.appendDashboardLog(tRTCCloudImpl11.mRoomInfo.getUserId(), 0, String.format("[%s]video Available[true]", str));
                }
                final boolean z4 = TRTCRoomInfo.hasSubVideo(i2) && !TRTCRoomInfo.isMuteSubVideo(i2);
                if (z4) {
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.138.4
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener2 = tRTCCloudListener;
                            if (tRTCCloudListener2 != null) {
                                tRTCCloudListener2.onUserSubStreamAvailable(str, z4);
                            }
                            Monitor.m84161a(2, String.format("onUserSubStreamAvailable userID:%s, bAvailable:%b", str, Boolean.valueOf(z4)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                        }
                    });
                    TRTCCloudImpl tRTCCloudImpl12 = TRTCCloudImpl.this;
                    tRTCCloudImpl12.appendDashboardLog(tRTCCloudImpl12.mRoomInfo.getUserId(), 0, String.format("[%s]subvideo Available[true]", str));
                }
                TRTCCloudImpl tRTCCloudImpl13 = TRTCCloudImpl.this;
                tRTCCloudImpl13.notifyEvent(tRTCCloudImpl13.mRoomInfo.getUserId(), 0, String.format("[%s]enter room", str));
            }
        });
    }

    public void onAVMemberExit(final long j, final String str, int i, final int i2) {
        final WeakReference weakReference = new WeakReference(this);
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.139
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (tRTCCloudImpl.mRoomState == 0) {
                    tRTCCloudImpl.apiLog("ignore onAVMemberExit when out room.");
                    return;
                }
                if (((TRTCCloudImpl) weakReference.get()) == null) {
                    return;
                }
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                if (user != null) {
                    tRTCCloudImpl2.stopRemoteRender(user);
                    TRTCCloudImpl.this.mRoomInfo.removeRenderInfo(user.userID);
                } else {
                    tRTCCloudImpl2.apiLog("user " + str + " exit room when user is not in room " + j);
                }
                C14143a.m83848a().m83850a(String.valueOf(j), TRTCCloudImpl.this.hashCode());
                TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(String.valueOf(j), null);
                TXCAudioEngine.getInstance().setRemoteAudioStreamEventListener(String.valueOf(j), null);
                TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.139.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudImpl.this.apiLog("onAVMemberExit " + j + ", " + str + ", " + i2);
                        AnonymousClass139 anonymousClass139 = AnonymousClass139.this;
                        TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                        if (tRTCCloudListener != null) {
                            if (TRTCRoomInfo.hasAudio(i2) && !TRTCRoomInfo.isMuteAudio(i2)) {
                                tRTCCloudListener.onUserAudioAvailable(str, false);
                                TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                                String userId = tRTCCloudImpl3.mRoomInfo.getUserId();
                                String str2 = str;
                                Boolean bool = Boolean.FALSE;
                                tRTCCloudImpl3.appendDashboardLog(userId, 0, String.format("[%s]audio Available[%b]", str2, bool));
                                Monitor.m84161a(2, String.format("onUserAudioAvailable userID:%s, bAvailable:%b", str, bool) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            }
                            if ((TRTCRoomInfo.hasMainVideo(i2) || TRTCRoomInfo.hasSmallVideo(i2)) && !TRTCRoomInfo.isMuteMainVideo(i2)) {
                                tRTCCloudListener.onUserVideoAvailable(str, false);
                                TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                                String userId2 = tRTCCloudImpl4.mRoomInfo.getUserId();
                                String str3 = str;
                                Boolean bool2 = Boolean.FALSE;
                                tRTCCloudImpl4.appendDashboardLog(userId2, 0, String.format("[%s]video Available[%b]", str3, bool2));
                                Monitor.m84161a(2, String.format("onUserVideoAvailable userID:%s, bAvailable:%b", str, bool2) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            }
                            if (TRTCRoomInfo.hasSubVideo(i2) && !TRTCRoomInfo.isMuteSubVideo(i2)) {
                                tRTCCloudListener.onUserSubStreamAvailable(str, false);
                                TRTCCloudImpl tRTCCloudImpl5 = TRTCCloudImpl.this;
                                String userId3 = tRTCCloudImpl5.mRoomInfo.getUserId();
                                String str4 = str;
                                Boolean bool3 = Boolean.FALSE;
                                tRTCCloudImpl5.appendDashboardLog(userId3, 0, String.format("[%s]subVideo Available[%b]", str4, bool3));
                                Monitor.m84161a(2, String.format("onUserSubStreamAvailable userID:%s, bAvailable:%b", str, bool3) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            }
                            tRTCCloudListener.onUserExit(str, 0);
                        }
                    }
                });
            }
        });
        notifyEvent(this.mRoomInfo.getUserId(), 0, String.format("[%s]leave room", str));
    }

    public void onAudioJitterBufferError(String str, int i, String str2) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC14146d
    public void onAudioJitterBufferNotify(final String str, final int i, final String str2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.123
            @Override // java.lang.Runnable
            public void run() {
                Bundle bundle = new Bundle();
                bundle.putLong("EVT_ID", i);
                bundle.putLong("EVT_TIME", System.currentTimeMillis());
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str2);
                TRTCCloudImpl.this.notifyEventByUserId(str, i, bundle);
            }
        });
    }

    @Override // com.tencent.liteav.audio.InterfaceC14147e
    public void onAudioPlayPcmData(final String str, final byte[] bArr, final long j, final int i, final int i2) {
        if (str != null) {
            runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.122
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = TRTCCloudImpl.this.mAudioFrameListener;
                    if (tRTCAudioFrameListener != null) {
                        TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
                        tRTCAudioFrame.data = bArr;
                        tRTCAudioFrame.timestamp = j;
                        tRTCAudioFrame.sampleRate = i;
                        tRTCAudioFrame.channel = i2;
                        try {
                            tRTCAudioFrameListener.onRemoteUserAudioFrame(tRTCAudioFrame, TRTCCloudImpl.this.mRoomInfo.getUserIdByTinyId(Long.valueOf(str).longValue()));
                        } catch (Exception e) {
                            TXCLog.m84149e(TRTCCloudImpl.TAG, "onPlayAudioFrame failed." + e.getMessage());
                        }
                    }
                }
            });
            return;
        }
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.timestamp = j;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrameListener.onMixedPlayAudioFrame(tRTCAudioFrame);
        }
    }

    public void onAudioQosChanged(TRTCCloudImpl tRTCCloudImpl, final int i, final int i2, final int i3) {
        if (isPublishingInCloud(tRTCCloudImpl, 1)) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.143
                @Override // java.lang.Runnable
                public void run() {
                    TXCAudioEngine.getInstance().setAudioEncoderParam(i, i2);
                    TXCAudioEngine.getInstance().setEncoderFECPercent(i3);
                }
            });
        }
    }

    @Override // com.tencent.liteav.C14270d.a
    public void onBackgroudPushStop() {
    }

    public void onCancelTranscoding(final int i, final String str) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.161
            @Override // java.lang.Runnable
            public void run() {
                Monitor.m84161a(1, String.format("onCancelTranscoding err:%d, msg:%s", Integer.valueOf(i), str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSetMixTranscodingConfig(i, str);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.InterfaceC14145c
    public void onEffectPlayFinish(final int i) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.99
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onEffectPlayFinish -> effectId = " + i);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onAudioEffectFinished(i, 0);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.InterfaceC14145c
    public void onEffectPlayStart(final int i, final int i2) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.100
            @Override // java.lang.Runnable
            public void run() {
                int i3;
                TRTCCloudImpl.this.apiLog("onEffectPlayStart -> effectId = " + i + " code = " + i2);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener == null || (i3 = i2) >= 0) {
                    return;
                }
                tRTCCloudListener.onAudioEffectFinished(i, i3);
            }
        });
    }

    public void onEncVideo(TXSNALPacket tXSNALPacket) {
        if (tXSNALPacket == null) {
            return;
        }
        synchronized (this.mNativeLock) {
            pushVideoFrame(tXSNALPacket);
        }
    }

    @Override // com.tencent.liteav.C14270d.a
    public void onEncVideoFormat(MediaFormat mediaFormat) {
    }

    public void onEnterRoom(final int i, final String str) {
        apiLog("onEnterRoom " + i + ", " + str);
        Monitor.m84161a(1, String.format("onEnterRoom err:%d msg:%s", Integer.valueOf(i), str) + " self:" + hashCode(), "", 0);
        if (i == 0) {
            TXCEventRecorderProxy.m84163a("18446744073709551615", ErrorCode.EDIT_PREVIEW_FAILED, 1L, -1L, "", 0);
        } else {
            TXCEventRecorderProxy.m84163a("18446744073709551615", ErrorCode.EDIT_PREVIEW_FAILED, 0L, -1L, "", 0);
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.128
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (i2 != 0) {
                    tRTCCloudImpl.exitRoomInternal(false, "enter room failed");
                    TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                    tRTCCloudImpl2.notifyEvent(tRTCCloudImpl2.mRoomInfo.getUserId(), i, "Enter room fail " + str);
                    int i3 = i;
                    switch (i3) {
                        case TXLiteAVCode.ERR_USER_SIG_INVALID /* -3320 */:
                        case TXLiteAVCode.ERR_USER_ID_INVALID /* -3319 */:
                        case TXLiteAVCode.ERR_ROOM_ID_INVALID /* -3318 */:
                        case TXLiteAVCode.ERR_SDK_APPID_INVALID /* -3317 */:
                        case TXLiteAVCode.ERR_ENTER_ROOM_PARAM_NULL /* -3316 */:
                            TXCKeyPointReportProxy.m84171b(i3);
                            break;
                    }
                }
                tRTCCloudImpl.mRoomState = 2;
                TRTCRoomInfo tRTCRoomInfo = tRTCCloudImpl.mRoomInfo;
                tRTCRoomInfo.networkStatus = 3;
                boolean z = tRTCRoomInfo.muteLocalVideo;
                if (z) {
                    tRTCCloudImpl.muteUpstream(2, z);
                }
                TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                boolean z2 = tRTCCloudImpl3.mRoomInfo.muteLocalAudio;
                if (z2) {
                    tRTCCloudImpl3.muteUpstream(1, z2);
                }
                TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                tRTCCloudImpl4.notifyEvent(tRTCCloudImpl4.mRoomInfo.getUserId(), 0, "Enter room success");
            }
        });
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.129
            @Override // java.lang.Runnable
            public void run() {
                TXCKeyPointReportProxy.m84172b(30001, i);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                TRTCCloudListener tRTCCloudListener = tRTCCloudImpl.mTRTCListener;
                long roomElapsed = tRTCCloudImpl.mRoomInfo.getRoomElapsed();
                if (tRTCCloudListener != null) {
                    int i2 = i;
                    if (i2 == 0) {
                        tRTCCloudListener.onEnterRoom(roomElapsed);
                    } else {
                        tRTCCloudListener.onEnterRoom(i2);
                    }
                }
            }
        });
    }

    public void onIdrFpsChanged(TRTCCloudImpl tRTCCloudImpl, final int i) {
        if (isPublishingInCloud(tRTCCloudImpl, 2)) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.145
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.mCaptureAndEnc.m84672c(i);
                }
            });
        }
    }

    @Override // com.tencent.liteav.basic.p092b.InterfaceC14170b
    public void onNotifyEvent(final int i, final Bundle bundle) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.120
            @Override // java.lang.Runnable
            public void run() {
                Bundle bundle2 = bundle;
                if (bundle2 == null) {
                    return;
                }
                String string = bundle2.getString("EVT_USERID", "");
                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("18446744073709551615") && !string.equalsIgnoreCase(TRTCCloudImpl.this.mRoomInfo.getTinyId())) {
                    TRTCCloudImpl.this.notifyEventByUserId(string, i, bundle);
                } else {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.notifyEvent(tRTCCloudImpl.mRoomInfo.getUserId(), i, bundle);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.InterfaceC14149g
    public void onPlayEnd(final int i) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.125
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloud.BGMNotify bGMNotify = TRTCCloudImpl.this.mBGMNotify;
                if (bGMNotify != null) {
                    bGMNotify.onBGMComplete(i);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.InterfaceC14149g
    public void onPlayProgress(final long j, final long j2) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.126
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloud.BGMNotify bGMNotify = TRTCCloudImpl.this.mBGMNotify;
                if (bGMNotify != null) {
                    bGMNotify.onBGMProgress(j, j2);
                }
            }
        });
    }

    @Override // com.tencent.liteav.audio.InterfaceC14149g
    public void onPlayStart() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.124
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloud.BGMNotify bGMNotify = TRTCCloudImpl.this.mBGMNotify;
                if (bGMNotify != null) {
                    bGMNotify.onBGMStart(0);
                }
            }
        });
    }

    public void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3) {
    }

    @Override // com.tencent.liteav.audio.InterfaceC14148f
    public void onRecordError(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", "18446744073709551615");
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        TXCLog.m84149e(TAG, "onRecordError code = " + i + ":" + str + " self:" + hashCode());
        if (i == -1) {
            bundle.putInt("EVT_ID", -1302);
            onNotifyEvent(-1302, bundle);
        }
        if (i == -6) {
            bundle.putInt("EVT_ID", TXLiteAVCode.EVT_MIC_START_SUCC);
            onNotifyEvent(TXLiteAVCode.EVT_MIC_START_SUCC, bundle);
        }
        if (i == -7) {
            bundle.putInt("EVT_ID", TXLiteAVCode.EVT_MIC_RELEASE_SUCC);
            onNotifyEvent(TXLiteAVCode.EVT_MIC_RELEASE_SUCC, bundle);
        }
    }

    @Override // com.tencent.liteav.audio.InterfaceC14148f
    public void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.timestamp = j;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrameListener.onLocalProcessedAudioFrame(tRTCAudioFrame);
        }
    }

    @Override // com.tencent.liteav.audio.InterfaceC14148f
    public void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z) {
        TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener != null) {
            TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new TRTCCloudDef.TRTCAudioFrame();
            tRTCAudioFrame.data = bArr;
            tRTCAudioFrame.timestamp = j;
            tRTCAudioFrame.sampleRate = i;
            tRTCAudioFrame.channel = i2;
            tRTCAudioFrameListener.onCapturedRawAudioFrame(tRTCAudioFrame);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14318o
    public void onRenderVideoFrame(String str, int i, TXSVideoFrame tXSVideoFrame) {
        TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener;
        String key;
        if (tXSVideoFrame == null) {
            return;
        }
        TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = new TRTCCloudDef.TRTCVideoFrame();
        tRTCVideoFrame.width = tXSVideoFrame.width;
        tRTCVideoFrame.height = tXSVideoFrame.height;
        tRTCVideoFrame.rotation = tXSVideoFrame.rotation;
        tRTCVideoFrame.timestamp = tXSVideoFrame.pts;
        int iTranslateStreamType = translateStreamType(i);
        boolean z = TextUtils.isEmpty(str) || str.equalsIgnoreCase("18446744073709551615") || str.equalsIgnoreCase(this.mRoomInfo.getTinyId());
        if (!z) {
            Iterator<Map.Entry<String, RenderListenerAdapter>> it = this.mRenderListenerMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    tRTCVideoRenderListener = null;
                    key = "";
                    break;
                }
                Map.Entry<String, RenderListenerAdapter> next = it.next();
                RenderListenerAdapter value = next.getValue();
                if (value != null && str.equalsIgnoreCase(next.getValue().strTinyID)) {
                    tRTCVideoFrame.pixelFormat = value.pixelFormat;
                    tRTCVideoFrame.bufferType = value.bufferType;
                    tRTCVideoRenderListener = value.listener;
                    key = next.getKey();
                    break;
                }
            }
        } else {
            key = this.mRoomInfo.getUserId();
            TRTCRoomInfo tRTCRoomInfo = this.mRoomInfo;
            tRTCVideoFrame.pixelFormat = tRTCRoomInfo.localPixelFormat;
            tRTCVideoFrame.bufferType = tRTCRoomInfo.localBufferType;
            tRTCVideoRenderListener = tRTCRoomInfo.localListener;
        }
        if (tRTCVideoRenderListener != null) {
            int i2 = tRTCVideoFrame.bufferType;
            if (i2 == 1) {
                if (tXSVideoFrame.buffer == null) {
                    tXSVideoFrame.loadYUVBufferFromGL();
                }
                tRTCVideoFrame.buffer = tXSVideoFrame.buffer;
            } else if (i2 == 2) {
                byte[] bArr = tXSVideoFrame.data;
                tRTCVideoFrame.data = bArr;
                if (bArr == null) {
                    byte[] bArr2 = new byte[((tXSVideoFrame.width * tXSVideoFrame.height) * 3) / 2];
                    tRTCVideoFrame.data = bArr2;
                    tXSVideoFrame.loadYUVArray(bArr2);
                }
            } else if (i2 == 3) {
                if (tXSVideoFrame.eglContext == null) {
                    return;
                }
                TRTCCloudDef.TRTCTexture tRTCTexture = new TRTCCloudDef.TRTCTexture();
                tRTCVideoFrame.texture = tRTCTexture;
                tRTCTexture.textureId = tXSVideoFrame.textureId;
                Object obj = tXSVideoFrame.eglContext;
                if (obj instanceof EGLContext) {
                    tRTCTexture.eglContext10 = (EGLContext) obj;
                } else if (obj instanceof android.opengl.EGLContext) {
                    tRTCTexture.eglContext14 = (android.opengl.EGLContext) obj;
                }
            }
            tRTCVideoRenderListener.onRenderVideoFrame(key, iTranslateStreamType, tRTCVideoFrame);
            if (this.mRoomInfo.enableCustomPreprocessor && z) {
                int i3 = tRTCVideoFrame.bufferType;
                if (i3 == 2) {
                    tXSVideoFrame.data = tRTCVideoFrame.data;
                } else if (i3 == 3) {
                    tXSVideoFrame.textureId = tRTCVideoFrame.texture.textureId;
                }
            }
        }
    }

    @Override // com.tencent.liteav.TXCRenderAndDec.InterfaceC14127b
    public void onRequestKeyFrame(final String str, final int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.121
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.nativeRequestKeyFrame(tRTCCloudImpl.mNativeRtcContext, Long.valueOf(str).longValue(), i);
            }
        });
    }

    @Override // com.tencent.liteav.screencapture.C14352a.a
    public void onScreenCapturePaused() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.62
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onScreenCapturePaused();
                }
            }
        });
    }

    @Override // com.tencent.liteav.screencapture.C14352a.a
    public void onScreenCaptureResumed() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.61
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onScreenCaptureResumed();
                }
            }
        });
    }

    @Override // com.tencent.liteav.screencapture.C14352a.a
    public void onScreenCaptureStarted() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.60
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onScreenCaptureStarted();
                }
            }
        });
    }

    @Override // com.tencent.liteav.screencapture.C14352a.a
    public void onScreenCaptureStopped(final int i) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.63
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onScreenCaptureStopped(i);
                }
            }
        });
    }

    public void onSendFirstLocalAudioFrame() {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.164
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onSendFirstLocalAudioFrame");
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.appendDashboardLog(tRTCCloudImpl.mRoomInfo.getUserId(), 0, "onSendFirstLocalAudioFrame");
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSendFirstLocalAudioFrame();
                }
            }
        });
    }

    public void onSendFirstLocalVideoFrame(final int i) {
        runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.163
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("onSendFirstLocalVideoFrame " + i);
                int iTranslateStreamType = TRTCCloudImpl.this.translateStreamType(i);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.appendDashboardLog(tRTCCloudImpl.mRoomInfo.getUserId(), 0, "onSendFirstLocalVideoFrame:" + iTranslateStreamType);
                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                if (tRTCCloudListener != null) {
                    tRTCCloudListener.onSendFirstLocalVideoFrame(iTranslateStreamType);
                }
            }
        });
    }

    public void onVideoConfigChanged(TRTCCloudImpl tRTCCloudImpl, final int i, final boolean z) {
        if (isPublishingInCloud(tRTCCloudImpl, i)) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.153
                @Override // java.lang.Runnable
                public void run() {
                    if (i == 2) {
                        TRTCCloudImpl.this.mCaptureAndEnc.m84682f(z);
                    }
                }
            });
        }
    }

    public void onVideoQosChanged(TRTCCloudImpl tRTCCloudImpl, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7) {
        if (isPublishingInCloud(tRTCCloudImpl, i)) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.144
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.mCaptureAndEnc.m84654a(i, i2, i3, i4, i5, i6, i7);
                    if (i == 2) {
                        int i8 = i2;
                        int i9 = i3;
                        int i10 = i8 > i9 ? 0 : 1;
                        TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                        C14273g c14273g = tRTCCloudImpl2.mConfig;
                        if (c14273g.f60164l == i10 || i8 == i9) {
                            return;
                        }
                        c14273g.f60164l = i10;
                        tRTCCloudImpl2.updateOrientation();
                    }
                }
            });
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseAudioEffect(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.106
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("pauseAudioEffect -> effectId = " + i);
                TXCSoundEffectPlayer.getInstance().pauseEffectWithId(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseBGM() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.90
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("pauseBGM");
                TXCLiveBGMPlayer.getInstance().pause();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void pauseScreenCapture() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.27
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.SCREEN) {
                    TRTCCloudImpl.this.apiLog("pause screen capture");
                    Monitor.m84161a(1, "pause screen capture self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    TRTCCloudImpl.this.mCaptureAndEnc.m84680f();
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void playAudioEffect(final TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.101
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("playAudioEffect -> effectId = " + tRTCAudioEffectParam.effectId + " path = " + tRTCAudioEffectParam.path + " publish = " + tRTCAudioEffectParam.publish + " loopCount = " + tRTCAudioEffectParam.loopCount);
                TXCSoundEffectPlayer tXCSoundEffectPlayer = TXCSoundEffectPlayer.getInstance();
                TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam2 = tRTCAudioEffectParam;
                tXCSoundEffectPlayer.playEffectWithId(tRTCAudioEffectParam2.effectId, tRTCAudioEffectParam2.path, tRTCAudioEffectParam2.publish, tRTCAudioEffectParam2.loopCount);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void playBGM(final String str, final TRTCCloud.BGMNotify bGMNotify) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.88
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("playBGM");
                TRTCCloudImpl.this.mBGMNotify = bGMNotify;
                if (TRTCCloudImpl.this.mBGMNotify != null) {
                    TXCLiveBGMPlayer.getInstance().setOnPlayListener(TRTCCloudImpl.this);
                } else {
                    TXCLiveBGMPlayer.getInstance().setOnPlayListener(null);
                }
                TXCLiveBGMPlayer.getInstance().startPlay(str);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeAudioEffect(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.107
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("resumeAudioEffect -> effectId = " + i);
                TXCSoundEffectPlayer.getInstance().resumeEffectWithId(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeBGM() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.91
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("resumeBGM");
                TXCLiveBGMPlayer.getInstance().resume();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void resumeScreenCapture() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.28
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.SCREEN) {
                    TRTCCloudImpl.this.apiLog("resume screen capture");
                    Monitor.m84161a(1, "resume screen capture self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    TRTCCloudImpl.this.mCaptureAndEnc.m84683g();
                }
            }
        });
    }

    public void runOnListenerThread(Runnable runnable) {
        Handler handler = this.mListenerHandler;
        if (handler == null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.mMainHandler.post(runnable);
                return;
            } else {
                runnable.run();
                return;
            }
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void runOnMainThread(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.mMainHandler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void runOnSDKThread(Runnable runnable) {
        if (this.mSDKHandler != null) {
            if (Looper.myLooper() != this.mSDKHandler.getLooper()) {
                this.mSDKHandler.post(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public void runOnSDKThreadAndWaitDone(Runnable runnable, long j) {
        if (this.mSDKHandler != null) {
            if (Looper.myLooper() != this.mSDKHandler.getLooper()) {
                this.mSDKHandler.m84213a(runnable, j);
            } else {
                runnable.run();
            }
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void selectMotionTmpl(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.72
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("selectMotionTmpl " + str);
                TRTCCloudImpl.this.getBeautyManager().setMotionTmpl(str);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        if (tRTCAudioFrame == null) {
            apiLog("sendCustomAudioData parameter is null");
            return;
        }
        final C14204a c14204a = new C14204a();
        byte[] bArr = tRTCAudioFrame.data;
        byte[] bArr2 = new byte[bArr.length];
        c14204a.f59307f = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        c14204a.f59302a = tRTCAudioFrame.sampleRate;
        c14204a.f59303b = tRTCAudioFrame.channel;
        c14204a.f59304c = 16;
        long j = tRTCAudioFrame.timestamp;
        if (0 == j) {
            c14204a.f59306e = TXCTimeUtil.generatePtsMS();
        } else {
            c14204a.f59306e = j;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.87
            @Override // java.lang.Runnable
            public void run() {
                if (TRTCCloudImpl.this.mEnableCustomAudioCapture) {
                    TXCAudioEngine.getInstance().sendCustomPCMData(c14204a);
                } else {
                    TRTCCloudImpl.this.apiLog("sendCustomAudioData when mEnableCustomAudioCapture is false");
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendCustomCmdMsg(final int i, byte[] bArr, final boolean z, final boolean z2) {
        String str;
        int i2;
        boolean z3 = false;
        if (bArr == null) {
            return false;
        }
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            TXCLog.m84150e(TAG, "invalid message data", e);
            str = null;
        }
        final String str2 = str;
        if (this.mCurrentRole == 21) {
            apiLog("ignore send custom cmd msg for audience");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.mLastSendMsgTimeMs == 0) {
            this.mLastSendMsgTimeMs = jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis - this.mLastSendMsgTimeMs < 1000) {
            int i3 = this.mSendMsgCount;
            if (i3 >= 30 || (i2 = this.mSendMsgSize) >= 8192) {
                TXCLog.m84149e(TAG, "send msg too more self:" + hashCode());
            } else {
                this.mSendMsgCount = i3 + 1;
                this.mSendMsgSize = i2 + str2.length();
            }
            if (z3) {
                runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.117
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                        tRTCCloudImpl.nativeSendCustomCmdMsg(tRTCCloudImpl.mNativeRtcContext, i, str2, z, z2);
                    }
                });
            }
            return z3;
        }
        this.mLastSendMsgTimeMs = jCurrentTimeMillis;
        this.mSendMsgCount = 1;
        this.mSendMsgSize = str2.length();
        z3 = true;
        if (z3) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.117
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.nativeSendCustomCmdMsg(tRTCCloudImpl.mNativeRtcContext, i, str2, z, z2);
                }
            });
        }
        return z3;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            apiLog("sendCustomVideoData parameter is null");
            return;
        }
        int i = tRTCVideoFrame.pixelFormat;
        if (i != 1 && i != 4 && i != 2) {
            apiLog("sendCustomVideoData parameter error unsupported pixel format " + tRTCVideoFrame.pixelFormat);
            return;
        }
        if (tRTCVideoFrame.bufferType != 2 && tRTCVideoFrame.texture == null) {
            apiLog("sendCustomVideoData parameter error unsupported buffer type " + tRTCVideoFrame.bufferType);
            return;
        }
        if (this.mVideoSourceType == VideoSourceType.CUSTOM && this.mRoomState == 2 && !this.mRoomInfo.muteLocalVideo) {
            synchronized (this) {
                try {
                    if (this.mCustomVideoUtil == null) {
                        this.mCustomVideoUtil = new TRTCCustomTextureUtil(this.mCaptureAndEnc);
                    }
                    TRTCCustomTextureUtil tRTCCustomTextureUtil = this.mCustomVideoUtil;
                    if (tRTCCustomTextureUtil != null) {
                        tRTCCustomTextureUtil.sendCustomTexture(tRTCVideoFrame);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.mLastCaptureCalculateTS != 0) {
                this.mCaptureFrameCount++;
                return;
            }
            this.mLastCaptureCalculateTS = System.currentTimeMillis();
            this.mLastCaptureFrameCount = 0L;
            this.mCaptureFrameCount = 0L;
        }
    }

    public void sendJsonCmd(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has("jsonParam") || !(jSONObject.get("jsonParam") instanceof JSONObject)) {
            apiLog("callExperimentalAPI[lack parameter or illegal type]: sendJsonCMD");
        } else {
            nativeSendJsonCmd(this.mNativeRtcContext, jSONObject.getJSONObject("jsonParam").toString(), str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    @Override // com.tencent.trtc.TRTCCloud
    public boolean sendSEIMsg(final byte[] bArr, final int i) {
        int i2;
        boolean z = false;
        if (bArr == null) {
            return false;
        }
        if (this.mCurrentRole == 21) {
            apiLog("ignore send sei msg for audience");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.mLastSendMsgTimeMs == 0) {
            this.mLastSendMsgTimeMs = jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis - this.mLastSendMsgTimeMs < 1000) {
            int i3 = this.mSendMsgCount;
            if (i3 >= 30 || (i2 = this.mSendMsgSize) >= 8192) {
                TXCLog.m84149e(TAG, "send msg too more self:" + hashCode());
            } else {
                this.mSendMsgCount = i3 + 1;
                this.mSendMsgSize = i2 + bArr.length;
            }
            if (z) {
                runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.118
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                        tRTCCloudImpl.nativeSendSEIMsg(tRTCCloudImpl.mNativeRtcContext, bArr, i);
                    }
                });
            }
            return z;
        }
        this.mLastSendMsgTimeMs = jCurrentTimeMillis;
        this.mSendMsgCount = 1;
        this.mSendMsgSize = bArr.length;
        z = true;
        if (z) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.118
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.nativeSendSEIMsg(tRTCCloudImpl.mNativeRtcContext, bArr, i);
                }
            });
        }
        return z;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAllAudioEffectsVolume(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.105
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setAllAudioEffectsVolume volume = " + i);
                TXCSoundEffectPlayer.getInstance().setEffectsVolume(((float) i) / 100.0f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioCaptureVolume(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mAudioCaptureVolume = i;
        apiLog("setAudioCaptureVolume:  volume=" + this.mAudioCaptureVolume);
        TXAudioEffectManagerImpl.getInstance().setVoiceCaptureVolume(i);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioEffectVolume(final int i, final int i2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.102
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setAudioEffectVolume -> effectId = " + i + " volume = " + i2);
                TXCSoundEffectPlayer.getInstance().setVolumeOfEffect(i, ((float) i2) / 100.0f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioFrameListener(final TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.119
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setAudioFrameListener " + tRTCAudioFrameListener);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener2 = tRTCAudioFrameListener;
                tRTCCloudImpl.mAudioFrameListener = tRTCAudioFrameListener2;
                if (tRTCAudioFrameListener2 == null) {
                    TXCAudioEngine.setPlayoutDataListener(null);
                    TXCAudioEngine.getInstance().setAudioCaptureDataListener(null);
                    TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.119.1
                        @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                        public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                            TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(String.valueOf(userInfo.tinyID), null);
                        }
                    });
                } else {
                    TXCAudioEngine.setPlayoutDataListener(this);
                    TXCAudioEngine.getInstance().setAudioCaptureDataListener(this);
                    TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.119.2
                        @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                        public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                            TXCAudioEngine.getInstance().setSetAudioEngineRemoteStreamDataListener(String.valueOf(userInfo.tinyID), this);
                        }
                    });
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioPlayoutVolume(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mAudioPlayoutVolume = i;
        apiLog("setAudioPlayoutVolume:  volume=" + this.mAudioPlayoutVolume);
        TXAudioEffectManagerImpl.getInstance().setAudioPlayoutVolume(i);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioQuality(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.46
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setAudioQuality " + i);
                TXCAudioEngine.getInstance().setAudioQuality(i, 2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setAudioRoute(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.52
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setAudioRoute " + i);
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("setAudioRoute route:%s", i == 0 ? "Speaker" : "Earpiece"));
                sb.append(" self:");
                sb.append(TRTCCloudImpl.this.hashCode());
                Monitor.m84161a(1, sb.toString(), "", 0);
                TXCAudioEngine.setAudioRoute(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBGMPlayoutVolume(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.95
            @Override // java.lang.Runnable
            public void run() {
                float f = i / 100.0f;
                TRTCCloudImpl.this.apiLog("setBGMPlayoutVolume:" + i + " fVolume:" + f);
                TXCLiveBGMPlayer.getInstance().setPlayoutVolume(f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setBGMPosition(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.92
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setBGMPosition " + i);
                TXCLiveBGMPlayer.getInstance().setBGMPosition(i);
            }
        });
        return 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBGMPublishVolume(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.96
            @Override // java.lang.Runnable
            public void run() {
                float f = i / 100.0f;
                TRTCCloudImpl.this.apiLog("setBGMPublishVolume " + i);
                TXCLiveBGMPlayer.getInstance().setPublishVolume(f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBGMVolume(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.94
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setBGMVolume " + i);
                TXCLiveBGMPlayer.getInstance().setVolume(((float) i) / 100.0f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setBeautyStyle(final int i, final int i2, final int i3, final int i4) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.69
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.getBeautyManager().setBeautyStyle(i);
                TRTCCloudImpl.this.getBeautyManager().setBeautyLevel(i2);
                TRTCCloudImpl.this.getBeautyManager().setWhitenessLevel(i3);
                TRTCCloudImpl.this.getBeautyManager().setRuddyLevel(i4);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setChinLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.79
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setChinLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setChinLevel(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDebugViewMargin(final String str, final TRTCCloud.TRTCViewMargin tRTCViewMargin) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.109
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setDebugViewMargin");
                final TXCloudVideoView tXCloudVideoView = TRTCCloudImpl.this.mRoomInfo.localView;
                if (tXCloudVideoView != null && str.equalsIgnoreCase(tXCloudVideoView.getUserId())) {
                    TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.109.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                            TRTCCloud.TRTCViewMargin tRTCViewMargin2 = tRTCViewMargin;
                            tXCloudVideoView2.setLogMarginRatio(tRTCViewMargin2.leftMargin, tRTCViewMargin2.rightMargin, tRTCViewMargin2.topMargin, tRTCViewMargin2.bottomMargin);
                        }
                    });
                }
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user != null) {
                    user.debugMargin = tRTCViewMargin;
                    final TXCloudVideoView tXCloudVideoView2 = user.mainRender.view;
                    final TXCloudVideoView tXCloudVideoView3 = user.subRender.view;
                    if (tXCloudVideoView2 == null && tXCloudVideoView3 == null) {
                        return;
                    }
                    TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.109.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TXCloudVideoView tXCloudVideoView4 = tXCloudVideoView2;
                            if (tXCloudVideoView4 != null) {
                                TRTCCloud.TRTCViewMargin tRTCViewMargin2 = tRTCViewMargin;
                                tXCloudVideoView4.setLogMarginRatio(tRTCViewMargin2.leftMargin, tRTCViewMargin2.rightMargin, tRTCViewMargin2.topMargin, tRTCViewMargin2.bottomMargin);
                            }
                            TXCloudVideoView tXCloudVideoView5 = tXCloudVideoView3;
                            if (tXCloudVideoView5 != null) {
                                TRTCCloud.TRTCViewMargin tRTCViewMargin3 = tRTCViewMargin;
                                tXCloudVideoView5.setLogMarginRatio(tRTCViewMargin3.leftMargin, tRTCViewMargin3.rightMargin, tRTCViewMargin3.topMargin, tRTCViewMargin3.bottomMargin);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setDefaultStreamRecvMode(final boolean z, final boolean z2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.10
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.mRecvMode = 0;
                boolean z3 = z;
                if (z3 && z2) {
                    tRTCCloudImpl.mRecvMode = 1;
                } else if (z3) {
                    tRTCCloudImpl.mRecvMode = 2;
                } else if (z2) {
                    tRTCCloudImpl.mRecvMode = 3;
                } else {
                    tRTCCloudImpl.mRecvMode = 4;
                }
                String str = String.format("setDefaultStreamRecvMode audio:%b, video:%b", Boolean.valueOf(z), Boolean.valueOf(z2)) + " self:" + TRTCCloudImpl.this.hashCode();
                TRTCCloudImpl.this.apiLog(str);
                Monitor.m84161a(1, str, "", 0);
            }
        });
    }

    public void setEncodedDataProcessingListener(JSONObject jSONObject) {
        long j;
        if (jSONObject == null || !jSONObject.has(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER)) {
            apiLog("setEncodedDataProcessingListener [lack parameter or illegal type]: listener");
            return;
        }
        try {
            j = jSONObject.getLong(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        } catch (JSONException e) {
            e.printStackTrace();
            j = 0;
        }
        apiLog("setEncodedDataProcessingListener:" + Long.toHexString(j));
        nativeSetEncodedDataProcessingListener(this.mNativeRtcContext, j);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setEyeScaleLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.75
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setEyeScaleLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setEyeScaleLevel(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFaceShortLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.78
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setFaceShortLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setFaceShortLevel(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFaceSlimLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.76
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setFaceSlimLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setFaceSlimLevel(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFaceVLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.77
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setFaceVLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setFaceVLevel(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFilter(final Bitmap bitmap) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.70
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setFilter");
                TRTCCloudImpl.this.getBeautyManager().setFilter(bitmap);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFilterConcentration(final float f) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.71
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setFilterStrength: " + f);
                TRTCCloudImpl.this.getBeautyManager().setFilterStrength(f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setFocusPosition(final int i, final int i2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.68
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mCaptureAndEnc.m84668b(i, i2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setGSensorMode(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.41
            @Override // java.lang.Runnable
            public void run() {
                VideoSourceType videoSourceType = TRTCCloudImpl.this.mVideoSourceType;
                VideoSourceType videoSourceType2 = VideoSourceType.SCREEN;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (videoSourceType == videoSourceType2) {
                    tRTCCloudImpl.apiLog("setGSensorMode has been ignored for screen capturing");
                    return;
                }
                tRTCCloudImpl.mSensorMode = i;
                TRTCCloudImpl.this.apiLog("vrotation setGSensorMode " + i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    @TargetApi(18)
    public boolean setGreenScreenFile(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.74
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setGreenScreenFile " + str);
                TRTCCloudImpl.this.getBeautyManager().setGreenScreenFile(str);
            }
        });
        return true;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListener(final TRTCCloudListener tRTCCloudListener) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.3
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setListener " + tRTCCloudListener);
                TRTCCloudImpl.this.mTRTCListener = tRTCCloudListener;
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setListenerHandler(Handler handler) {
        apiLog("setListenerHandler " + handler);
        if (handler == null) {
            this.mListenerHandler = new Handler(Looper.getMainLooper());
        } else {
            this.mListenerHandler = handler;
        }
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator<WeakReference<TRTCCloudImpl>> it = TRTCCloudImpl.this.mSubClouds.iterator();
                while (it.hasNext()) {
                    TRTCCloudImpl tRTCCloudImpl = it.next().get();
                    if (tRTCCloudImpl != null) {
                        tRTCCloudImpl.setListenerHandler(TRTCCloudImpl.this.mListenerHandler);
                    } else {
                        it.remove();
                    }
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setLocalVideoRenderListener(final int i, final int i2, final TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        if (i != 1 && i != 4 && i != 2) {
            apiLog("setLocalVideoRenderListener unsupported pixelFormat : " + i);
            return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.84
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.apiLog(String.format("setLocalVideoRenderListener pixelFormat:%d bufferType:%d", Integer.valueOf(i), Integer.valueOf(i2)));
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    TRTCRoomInfo tRTCRoomInfo = tRTCCloudImpl.mRoomInfo;
                    int i3 = i;
                    tRTCRoomInfo.localPixelFormat = i3;
                    tRTCRoomInfo.localBufferType = i2;
                    TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener2 = tRTCVideoRenderListener;
                    tRTCRoomInfo.localListener = tRTCVideoRenderListener2;
                    if (tRTCVideoRenderListener2 == null) {
                        tRTCCloudImpl.mCaptureAndEnc.m84662a((InterfaceC14318o) null, i3);
                    } else {
                        tRTCCloudImpl.mCaptureAndEnc.m84662a(tRTCCloudImpl, i3);
                    }
                }
            });
            return 0;
        }
        apiLog("setLocalVideoRenderListener unsupported bufferType : " + i2);
        return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalViewFillMode(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.36
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setLocalViewFillMode " + i);
                TRTCCloudImpl.this.mCaptureAndEnc.m84681f(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalViewMirror(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.44
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.mVideoRenderMirror = i;
                TRTCCloudImpl.this.apiLog("setLocalViewMirror " + i);
                TRTCCloudImpl.this.mCaptureAndEnc.m84667b(i);
                TRTCCloudImpl.this.updateOrientation();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setLocalViewRotation(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.38
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("vrotation setLocalViewRotation " + i);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                TRTCRoomInfo tRTCRoomInfo = tRTCCloudImpl.mRoomInfo;
                int i2 = i;
                tRTCRoomInfo.localRenderRotation = i2 * 90;
                tRTCCloudImpl.mCaptureAndEnc.m84684g(i2 * 90);
                TRTCCloudImpl.this.updateOrientation();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMicVolumeOnMixing(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.93
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setMicVolume " + i);
                TXCAudioEngine.getInstance().setSoftwareCaptureVolume(((float) i) / 100.0f);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMixTranscodingConfig(final TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.116
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setMixTranscodingConfig " + tRTCTranscodingConfig);
                if (tRTCTranscodingConfig == null) {
                    Monitor.m84161a(1, "cancelLiveMixTranscoding self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                }
                TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig2 = tRTCTranscodingConfig;
                if (tRTCTranscodingConfig2 == null) {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.nativeSetMixTranscodingConfig(tRTCCloudImpl.mNativeRtcContext, null);
                } else {
                    TRTCTranscodingConfigInner tRTCTranscodingConfigInner = new TRTCTranscodingConfigInner(tRTCTranscodingConfig2);
                    TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                    tRTCCloudImpl2.nativeSetMixTranscodingConfig(tRTCCloudImpl2.mNativeRtcContext, tRTCTranscodingConfigInner);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setMotionMute(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.73
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setMotionMute " + z);
                TRTCCloudImpl.this.getBeautyManager().setMotionMute(z);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNetworkQosParam(final TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.35
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam2 = tRTCNetworkQosParam;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (tRTCNetworkQosParam2 == null) {
                    tRTCCloudImpl.apiLog("setNetworkQosParam param is null");
                    return;
                }
                tRTCCloudImpl.apiLog("setNetworkQosParam");
                TRTCCloudImpl.this.mQosPreference = tRTCNetworkQosParam.preference;
                TRTCCloudImpl.this.mQosMode = tRTCNetworkQosParam.controlMode;
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.setVideoQuality(tRTCCloudImpl2.mQosMode, TRTCCloudImpl.this.mQosPreference);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setNoseSlimLevel(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.80
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setNoseSlimLevel " + i);
                TRTCCloudImpl.this.getBeautyManager().setNoseSlimLevel(i);
            }
        });
    }

    public void setPerformanceMode(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("setPerformanceMode[lack parameter]");
            return;
        }
        if (!jSONObject.has("mode")) {
            apiLog("setPerformanceMode[lack parameter]: mode");
        } else if (jSONObject.getInt("mode") != 1) {
            this.mPerformanceMode = 0;
        } else {
            this.mPerformanceMode = 1;
            this.mCaptureAndEnc.m84666b().enableSharpnessEnhancement(false);
        }
    }

    @Override // com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public int setPriorRemoteVideoStreamType(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.43
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 == 0) {
                    TRTCCloudImpl.this.mPriorStreamType = 2;
                } else {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    if (i2 == 1) {
                        tRTCCloudImpl.mPriorStreamType = 3;
                    } else {
                        tRTCCloudImpl.mPriorStreamType = 2;
                    }
                }
                TRTCCloudImpl.this.apiLog("setPriorRemoteVideoStreamType " + TRTCCloudImpl.this.mPriorStreamType);
            }
        });
        return 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteAudioVolume(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.57
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 < 0) {
                    i2 = 0;
                }
                TRTCCloudImpl.this.apiLog("setRemoteAudioVolume: userId = " + str + " volume = " + i2);
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user != null) {
                    TXCAudioEngine.getInstance().setRemotePlayoutVolume(String.valueOf(user.tinyID), i2);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewFillMode(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.21
            @Override // java.lang.Runnable
            public void run() {
                TXCRenderAndDec tXCRenderAndDec;
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                TRTCCloudImpl.this.apiLog("setSubStreamRemoteViewFillMode->userId: " + str + ", fillMode: " + i);
                if (user == null || (tXCRenderAndDec = user.subRender.render) == null) {
                    return;
                }
                tXCRenderAndDec.setRenderMode(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewRotation(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.22
            @Override // java.lang.Runnable
            public void run() {
                TXCRenderAndDec tXCRenderAndDec;
                TRTCCloudImpl.this.apiLog("setRemoteSubStreamViewRotation->userId: " + str + ", rotation: " + i);
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null || (tXCRenderAndDec = user.subRender.render) == null) {
                    return;
                }
                tXCRenderAndDec.setRenderRotation(i * 90);
            }
        });
    }

    public void setRemoteSurface(final String str, final int i, final Surface surface) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.50
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setRemoteSurface " + str + ", " + surface);
                TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348eInternalGetRemoteUserRender = TRTCCloudImpl.this.internalGetRemoteUserRender(str, i);
                if (textureViewSurfaceTextureListenerC14348eInternalGetRemoteUserRender != null) {
                    textureViewSurfaceTextureListenerC14348eInternalGetRemoteUserRender.m85098a(surface);
                }
            }
        });
    }

    public void setRemoteSurfaceSize(final String str, final int i, final int i2, final int i3) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.51
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setRemoteSurfaceSize: " + str + ", " + i2 + Constants.SEPARATOR_COMMA + i3);
                TextureViewSurfaceTextureListenerC14348e textureViewSurfaceTextureListenerC14348eInternalGetRemoteUserRender = TRTCCloudImpl.this.internalGetRemoteUserRender(str, i);
                if (textureViewSurfaceTextureListenerC14348eInternalGetRemoteUserRender != null) {
                    textureViewSurfaceTextureListenerC14348eInternalGetRemoteUserRender.m85108c(i2, i3);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int setRemoteVideoRenderListener(final String str, final int i, final int i2, final TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        if (i != 1 && i != 4 && i != 2) {
            apiLog("setRemoteVideoRenderListener unsupported pixelFormat : " + i);
            return TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
        }
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.85
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.apiLog(String.format("setRemoteVideoRenderListener userid:%s pixelFormat:%d bufferType:%d", str, Integer.valueOf(i), Integer.valueOf(i2)));
                    if (tRTCVideoRenderListener == null) {
                        TRTCCloudImpl.this.mRenderListenerMap.remove(str);
                    } else {
                        RenderListenerAdapter renderListenerAdapter = new RenderListenerAdapter();
                        renderListenerAdapter.bufferType = i2;
                        renderListenerAdapter.pixelFormat = i;
                        renderListenerAdapter.listener = tRTCVideoRenderListener;
                        TRTCCloudImpl.this.mRenderListenerMap.put(str, renderListenerAdapter);
                        TRTCCloudImpl.this.mCustomRemoteRender = true;
                    }
                    TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.85.1
                        @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                        public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                            if (str2.equalsIgnoreCase(str)) {
                                RunnableC1445885 runnableC1445885 = RunnableC1445885.this;
                                RenderListenerAdapter renderListenerAdapter2 = TRTCCloudImpl.this.mRenderListenerMap.get(str);
                                if (renderListenerAdapter2 != null) {
                                    renderListenerAdapter2.strTinyID = String.valueOf(userInfo.tinyID);
                                }
                                RunnableC1445885 runnableC1445886 = RunnableC1445885.this;
                                TRTCCloudImpl tRTCCloudImpl = tRTCVideoRenderListener != null ? TRTCCloudImpl.this : null;
                                TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                                if (tXCRenderAndDec != null) {
                                    tXCRenderAndDec.setVideoFrameListener(tRTCCloudImpl, TRTCCloudImpl.this.getPixelFormat(renderListenerAdapter2.pixelFormat));
                                }
                                TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
                                if (tXCRenderAndDec2 != null) {
                                    tXCRenderAndDec2.setVideoFrameListener(tRTCCloudImpl, TRTCCloudImpl.this.getPixelFormat(renderListenerAdapter2.pixelFormat));
                                }
                            }
                        }
                    });
                }
            });
            return 0;
        }
        apiLog("setRemoteVideoRenderListener unsupported bufferType : " + i2);
        return TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
    }

    @Override // com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public int setRemoteVideoStreamType(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.49
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    return;
                }
                int i2 = i == 1 ? 3 : 2;
                if (user.streamType == i2) {
                    return;
                }
                user.streamType = i2;
                TRTCCloudImpl.this.apiLog("setRemoteVideoStreamType " + str + ", " + i2 + ", " + user.tinyID);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.nativeRequestDownStream(tRTCCloudImpl.mNativeRtcContext, user.tinyID, i2, false);
            }
        });
        return 0;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteViewFillMode(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.37
            @Override // java.lang.Runnable
            public void run() {
                TXCRenderAndDec tXCRenderAndDec;
                TRTCCloudImpl.this.apiLog("setRemoteViewFillMode " + str + ", " + i);
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null || (tXCRenderAndDec = user.mainRender.render) == null) {
                    return;
                }
                tXCRenderAndDec.setRenderMode(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setRemoteViewRotation(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.39
            @Override // java.lang.Runnable
            public void run() {
                TXCRenderAndDec tXCRenderAndDec;
                TRTCCloudImpl.this.apiLog("vrotation setRemoteViewRotation " + str + ", " + i);
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null || (tXCRenderAndDec = user.mainRender.render) == null) {
                    return;
                }
                tXCRenderAndDec.setRenderRotation(i * 90);
            }
        });
    }

    public void setRenderView(final String str, final TRTCRoomInfo.RenderInfo renderInfo, final TXCloudVideoView tXCloudVideoView, final TRTCCloud.TRTCViewMargin tRTCViewMargin) {
        TXCRenderAndDec tXCRenderAndDec;
        if (renderInfo == null || (tXCRenderAndDec = renderInfo.render) == null || tXCRenderAndDec.getVideoRender() == null) {
            return;
        }
        final TextureViewSurfaceTextureListenerC14348e videoRender = renderInfo.render.getVideoRender();
        if (tXCloudVideoView == null) {
            videoRender.mo85045c((Object) null);
        } else {
            runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.166
                @Override // java.lang.Runnable
                public void run() {
                    SurfaceView surfaceView = tXCloudVideoView.getSurfaceView();
                    if (surfaceView == null) {
                        TextureView textureView = new TextureView(tXCloudVideoView.getContext());
                        tXCloudVideoView.addVideoView(textureView);
                        tXCloudVideoView.setVisibility(0);
                        tXCloudVideoView.setUserId(str);
                        tXCloudVideoView.showVideoDebugLog(TRTCCloudImpl.this.mDebugType);
                        TRTCCloud.TRTCViewMargin tRTCViewMargin2 = tRTCViewMargin;
                        if (tRTCViewMargin2 != null) {
                            tXCloudVideoView.setLogMarginRatio(tRTCViewMargin2.leftMargin, tRTCViewMargin2.rightMargin, tRTCViewMargin2.topMargin, tRTCViewMargin2.bottomMargin);
                        }
                        videoRender.m85099a(textureView);
                        return;
                    }
                    surfaceView.setVisibility(0);
                    SurfaceHolder holder = surfaceView.getHolder();
                    holder.removeCallback(renderInfo);
                    holder.addCallback(renderInfo);
                    boolean zIsValid = holder.getSurface().isValid();
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    if (zIsValid) {
                        tRTCCloudImpl.apiLog(String.format(Locale.ENGLISH, "startRemoteView with valid surface %s, width: %d, height: %d", holder.getSurface(), Integer.valueOf(surfaceView.getWidth()), Integer.valueOf(surfaceView.getHeight())));
                        videoRender.m85098a(holder.getSurface());
                        videoRender.m85108c(surfaceView.getWidth(), surfaceView.getHeight());
                    } else {
                        tRTCCloudImpl.apiLog("startRemoteView with surfaceView add callback " + renderInfo);
                    }
                }
            });
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setReverbType(final int i) {
        if (i >= 0 && i <= 7) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.97
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.apiLog("setLocalViewFillMode");
                    TXAudioEffectManagerImpl.getInstance().setVoiceReverbType(TRTCCloudImpl.this.reverbTypes[i]);
                }
            });
            return;
        }
        TXCLog.m84149e(TAG, "reverbType not support :" + i);
    }

    public void setSEIPayloadType(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("payloadType")) {
            apiLog("callExperimentalAPI[lack parameter or illegal type]: payloadType");
            return;
        }
        int i = jSONObject.getInt("payloadType");
        if (i != 5 && i != 243) {
            apiLog("callExperimentalAPI[invalid param]: payloadType[" + i + Constants.AES_SUFFIX);
            return;
        }
        if (nativeSetSEIPayloadType(this.mNativeRtcContext, i)) {
            apiLog("callExperimentalAPI[succeeded]: setSEIPayloadType (" + i + ")");
            return;
        }
        apiLog("callExperimentalAPI[failed]: setSEIPayloadType (" + i + ")");
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setSystemVolumeType(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.58
            @Override // java.lang.Runnable
            public void run() {
                Monitor.m84161a(1, String.format("setSystemVolumeType type:%d,  auto(0),media(1),VOIP(2)", Integer.valueOf(i)) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                int i2 = i;
                if (i2 == 0 || 1 == i2 || 2 == i2) {
                    TXCAudioEngine.getInstance();
                    TXCAudioEngine.setSystemVolumeType(i);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderMirror(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.45
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setVideoEncoderMirror " + z);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                C14273g c14273g = tRTCCloudImpl.mConfig;
                boolean z2 = z;
                c14273g.f60146S = z2;
                tRTCCloudImpl.mCaptureAndEnc.m84679e(z2);
                TRTCCloudImpl.this.updateOrientation();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderParam(final TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.34
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.setVideoEncoderParamInternal(tRTCVideoEncParam);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoEncoderRotation(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.40
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("vrotation setVideoEncoderRotation " + i + ", g sensor mode " + TRTCCloudImpl.this.mSensorMode);
                if (TRTCCloudImpl.this.mSensorMode == 0) {
                    TRTCCloudImpl.this.mCaptureAndEnc.m84652a(i * 90);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setVideoMuteImage(final Bitmap bitmap, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.30
            /* JADX WARN: Code duplicated, block: B:4:0x0025 A[PHI: r1
              0x0025: PHI (r1v5 int) = (r1v2 int), (r1v3 int) binds: [B:3:0x0023, B:6:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setVideoMuteImage " + bitmap + ", " + i);
                int i2 = i;
                int i3 = 20;
                if (i2 > 20) {
                    i2 = i3;
                } else {
                    i3 = 5;
                    if (i2 < 5) {
                        i2 = i3;
                    }
                }
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                C14273g c14273g = tRTCCloudImpl.mConfig;
                c14273g.f60128A = bitmap;
                c14273g.f60130C = i2;
                c14273g.f60129B = -1;
                tRTCCloudImpl.mCaptureAndEnc.m84661a(c14273g);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public boolean setVoiceChangerType(final int i) {
        if (i >= 0 && i <= 11) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.98
                @Override // java.lang.Runnable
                public void run() {
                    TXAudioEffectManagerImpl.getInstance().setVoiceChangerType(TRTCCloudImpl.this.voiceChangerTypes[i]);
                }
            });
            return true;
        }
        TXCLog.m84149e(TAG, "voiceChangerType not support :" + i);
        return false;
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setWatermark(final Bitmap bitmap, final int i, final float f, final float f2, final float f3) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.81
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("addWatermark stream:" + i);
                if (i != 2) {
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    C14273g c14273g = tRTCCloudImpl.mConfig;
                    Bitmap bitmap2 = bitmap;
                    c14273g.f60132E = bitmap2;
                    float f4 = f;
                    c14273g.f60135H = f4;
                    float f5 = f2;
                    c14273g.f60136I = f5;
                    float f6 = f3;
                    c14273g.f60137J = f6;
                    tRTCCloudImpl.mCaptureAndEnc.m84655a(bitmap2, f4, f5, f6);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void setZoom(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.67
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("setZoom " + i);
                TRTCCloudImpl.this.mCaptureAndEnc.m84688h(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void showDebugView(int i) {
        runOnSDKThread(new AnonymousClass108(i));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void snapshotVideo(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        apiLog(String.format("snapshotVideo user:%s streamType:%d", str, Integer.valueOf(i)));
        runOnSDKThread(new RunnableC1439124(str, tRTCSnapshotListener, i));
    }

    @Override // com.tencent.trtc.TRTCCloud
    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        boolean zIsEmpty = TextUtils.isEmpty(tRTCAudioRecordingParams.filePath);
        String str = tRTCAudioRecordingParams.filePath;
        if (zIsEmpty) {
            apiLog("startLocalAudioRecord error:" + str);
            return -1;
        }
        apiLog("startLocalAudioRecord:" + str);
        TXCAudioEngine.getInstance().setAudioDumpingListener(new TXCAudioEngineJNI.InterfaceC14154a() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.65
            @Override // com.tencent.liteav.audio.impl.TXCAudioEngineJNI.InterfaceC14154a
            public void onLocalAudioWriteFailed() {
                TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.65.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                        TRTCCloudListener tRTCCloudListener = tRTCCloudImpl.mTRTCListener;
                        if (tRTCCloudListener == null) {
                            return;
                        }
                        tRTCCloudImpl.apiLog("startLocalAudioRecord onWarning:7001");
                        tRTCCloudListener.onWarning(7001, "write file failed when recording audio.", null);
                    }
                });
            }
        });
        return TXCAudioEngine.getInstance().startLocalAudioDumping(48000, 16, tRTCAudioRecordingParams.filePath);
    }

    public void startCollectStatus() {
        HandlerC14214e handlerC14214e = this.mSDKHandler;
        if (handlerC14214e != null) {
            handlerC14214e.postDelayed(this.mStatusNotifyTask, 1000L);
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalAudio() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.47
            @Override // java.lang.Runnable
            public void run() {
                boolean z = TRTCCloudImpl.this.mEnableCustomAudioCapture;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (z) {
                    tRTCCloudImpl.apiLog("startLocalAudio when enable custom audio capturing, ignore!!!");
                    return;
                }
                boolean z2 = tRTCCloudImpl.mIsAudioCapturing;
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                if (z2) {
                    tRTCCloudImpl2.apiLog("startLocalAudio when capturing audio, ignore!!!");
                    return;
                }
                if (tRTCCloudImpl2.mCurrentRole == 21) {
                    tRTCCloudImpl2.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.47.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener == null) {
                                return;
                            }
                            tRTCCloudListener.onWarning(6001, "ignore start local audio,for role audience", null);
                        }
                    });
                    TRTCCloudImpl.this.apiLog("ignore startLocalAudio,for role audience");
                }
                TRTCCloudImpl.this.apiLog("startLocalAudio");
                Monitor.m84161a(1, "startLocalAudio self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TXCEventRecorderProxy.m84163a("18446744073709551615", 3001, 0L, -1L, "", 0);
                TRTCCloudImpl.this.mIsAudioCapturing = true;
                TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                tRTCCloudImpl3.mCaptureAndEnc.m84661a(tRTCCloudImpl3.mConfig);
                TRTCCloudImpl.this.setQoSParams();
                TXCAudioEngine.getInstance().enableCaptureEOSMode(TRTCCloudImpl.this.mEnableEosMode);
                TXCAudioEngineJNI.nativeUseSysAudioDevice(false);
                TXCAudioEngine.getInstance().startLocalAudio(11, false);
                TXCAudioEngine.getInstance().enableEncodedDataPackWithTRAEHeaderCallback(true);
                TXCAudioEngine.getInstance().muteLocalAudio(TRTCCloudImpl.this.mRoomInfo.muteLocalAudio);
                TXCEventRecorderProxy.m84163a("18446744073709551615", 3003, 11L, -1L, "", 0);
                TRTCCloudImpl.this.enableAudioStream(true);
                TXCKeyPointReportProxy.m84167a(40050, 1, 1);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startLocalPreview(final boolean z, final TXCloudVideoView tXCloudVideoView) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.15
            @Override // java.lang.Runnable
            public void run() {
                VideoSourceType videoSourceType = TRTCCloudImpl.this.mVideoSourceType;
                VideoSourceType videoSourceType2 = VideoSourceType.NONE;
                boolean z2 = videoSourceType != videoSourceType2;
                if (z2) {
                    TRTCCloudImpl.this.apiLog("startLocalPreview just reset view when is started");
                }
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (tRTCCloudImpl.mCurrentRole == 21) {
                    tRTCCloudImpl.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.15.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener == null) {
                                return;
                            }
                            tRTCCloudListener.onWarning(6001, "ignore start local preview,for role audience", null);
                        }
                    });
                    TRTCCloudImpl.this.apiLog("ignore startLocalPreview for audience");
                }
                StringBuilder sb = new StringBuilder("startLocalPreview front:");
                sb.append(z);
                sb.append(", view:");
                TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                sb.append(tXCloudVideoView2 != null ? Integer.valueOf(tXCloudVideoView2.hashCode()) : "");
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(TRTCCloudImpl.this.hashCode());
                String string = sb.toString();
                TRTCCloudImpl.this.apiLog(string);
                Monitor.m84161a(1, string, "", 0);
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.mRoomInfo.localView = tXCloudVideoView;
                C14273g c14273g = tRTCCloudImpl2.mConfig;
                c14273g.f60165m = z;
                int i = tRTCCloudImpl2.mPerformanceMode;
                c14273g.f60150W = i == 0;
                c14273g.f60148U = i == 1;
                tRTCCloudImpl2.mCaptureAndEnc.m84661a(c14273g);
                TXCKeyPointReportProxy.m84167a(40046, 1, 2);
                TRTCCloudImpl.this.mIsVideoCapturing = true;
                TRTCCloudImpl.this.mOrientationEventListener.enable();
                TRTCCloudImpl.this.updateOrientation();
                TRTCCloudImpl.this.enableVideoStream(true);
                TXCloudVideoView tXCloudVideoView3 = tXCloudVideoView;
                final SurfaceView surfaceView = tXCloudVideoView3 != null ? tXCloudVideoView3.getSurfaceView() : null;
                if (surfaceView != null) {
                    if (z2 || TRTCCloudImpl.this.mVideoSourceType != videoSourceType2) {
                        TRTCCloudImpl.this.apiLog("startLocalPreview with surface view when is started");
                    } else {
                        TRTCCloudImpl.this.mVideoSourceType = VideoSourceType.CAMERA;
                        TRTCCloudImpl.this.mCaptureAndEnc.m84664a((TXCloudVideoView) null);
                    }
                } else if (z2 || TRTCCloudImpl.this.mVideoSourceType != videoSourceType2) {
                    TRTCCloudImpl.this.apiLog("startLocalPreview with view view when is started");
                } else {
                    TRTCCloudImpl.this.mVideoSourceType = VideoSourceType.CAMERA;
                    TRTCCloudImpl.this.mCaptureAndEnc.m84664a(tXCloudVideoView);
                }
                final Surface[] surfaceArr = new Surface[1];
                final C14213d c14213d = new C14213d();
                TRTCCloudImpl.this.runOnMainThreadAndWaitDone(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.15.2
                    @Override // java.lang.Runnable
                    public void run() {
                        SurfaceView surfaceView2 = surfaceView;
                        if (surfaceView2 != null) {
                            SurfaceHolder holder = surfaceView2.getHolder();
                            holder.removeCallback(TRTCCloudImpl.this);
                            holder.addCallback(TRTCCloudImpl.this);
                            boolean zIsValid = holder.getSurface().isValid();
                            RunnableC1437615 runnableC1437615 = RunnableC1437615.this;
                            if (zIsValid) {
                                TRTCCloudImpl.this.apiLog("startLocalPreview with valid surface " + holder.getSurface() + " width " + surfaceView.getWidth() + ", height " + surfaceView.getHeight());
                                surfaceArr[0] = holder.getSurface();
                                c14213d.f59350a = surfaceView.getWidth();
                                c14213d.f59351b = surfaceView.getHeight();
                            } else {
                                TRTCCloudImpl.this.apiLog("startLocalPreview with surfaceView add callback");
                            }
                        }
                        RunnableC1437615 runnableC1437616 = RunnableC1437615.this;
                        TXCloudVideoView tXCloudVideoView4 = tXCloudVideoView;
                        if (tXCloudVideoView4 != null) {
                            tXCloudVideoView4.showVideoDebugLog(TRTCCloudImpl.this.mDebugType);
                            RunnableC1437615 runnableC1437617 = RunnableC1437615.this;
                            TRTCCloud.TRTCViewMargin tRTCViewMargin = TRTCCloudImpl.this.mRoomInfo.debugMargin;
                            if (tRTCViewMargin != null) {
                                tXCloudVideoView.setLogMarginRatio(tRTCViewMargin.leftMargin, tRTCViewMargin.rightMargin, tRTCViewMargin.topMargin, tRTCViewMargin.bottomMargin);
                            }
                        }
                    }
                });
                Surface surface = surfaceArr[0];
                if (surface != null) {
                    TRTCCloudImpl.this.mCaptureAndEnc.m84657a(surface);
                    TRTCCloudImpl.this.mCaptureAndEnc.m84653a(c14213d.f59350a, c14213d.f59351b);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishCDNStream(final TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        if (tRTCPublishCDNParam == null) {
            apiLog("startPublishCDNStream param is null");
        } else {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.112
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.apiLog("startPublishCDNStream");
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.nativeStartPublishCDNStream(tRTCCloudImpl.mNativeRtcContext, tRTCPublishCDNParam);
                }
            });
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startPublishing(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.115
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("startPublishing streamId:" + str + ", streamType:" + i);
                int i2 = i == 2 ? 7 : 2;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.nativeStartPublishing(tRTCCloudImpl.mNativeRtcContext, str, i2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteSubStreamView(final String str, final TXCloudVideoView tXCloudVideoView) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.19
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl.this.apiLog("startRemoteSubStreamView user is not exist save view" + str);
                    TRTCRoomInfo.UserInfo userInfoCreateUserInfo = TRTCCloudImpl.this.createUserInfo(str);
                    userInfoCreateUserInfo.subRender.view = tXCloudVideoView;
                    TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, userInfoCreateUserInfo);
                    return;
                }
                TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                if (tXCloudVideoView2 != null && tXCloudVideoView2.equals(user.subRender.view)) {
                    TRTCCloudImpl.this.apiLog("startRemoteSubStreamView user view is the same, ignore " + str);
                    return;
                }
                TRTCRoomInfo.RenderInfo renderInfo = user.subRender;
                boolean z = renderInfo.view != null;
                TXCloudVideoView tXCloudVideoView3 = tXCloudVideoView;
                renderInfo.view = tXCloudVideoView3;
                long j = renderInfo.tinyID;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (j == 0) {
                    tRTCCloudImpl.apiLog("startRemoteSubStreamView user tinyID is 0, ignore " + str);
                    return;
                }
                tRTCCloudImpl.setRenderView(str, renderInfo, tXCloudVideoView3, user.debugMargin);
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                String str2 = str;
                Long lValueOf = Long.valueOf(user.tinyID);
                TXCloudVideoView tXCloudVideoView4 = tXCloudVideoView;
                tRTCCloudImpl2.apiLog(String.format("startRemoteSubStreamView userID:%s tinyID:%d streamType:%d view:%d", str2, lValueOf, 7, Integer.valueOf(tXCloudVideoView4 != null ? tXCloudVideoView4.hashCode() : 0)));
                Monitor.m84161a(1, String.format("startRemoteSubStreamView userID:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.notifyLogByUserId(String.valueOf(user.tinyID), 7, 0, "Start watching " + str);
                TXCKeyPointReportProxy.m84170a(String.valueOf(user.tinyID), TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD, 0L, 7);
                if (!z || !user.subRender.render.isRendering()) {
                    TRTCCloudImpl.this.startRemoteRender(user.subRender.render, 7);
                }
                if (user.subRender.muteVideo) {
                    return;
                }
                TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                tRTCCloudImpl3.nativeRequestDownStream(tRTCCloudImpl3.mNativeRtcContext, user.tinyID, 7, true);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startRemoteView(final String str, final TXCloudVideoView tXCloudVideoView) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.17
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                if (user == null) {
                    TRTCCloudImpl.this.apiLog("startRemoteView user is not exist save view" + str);
                    TRTCRoomInfo.UserInfo userInfoCreateUserInfo = TRTCCloudImpl.this.createUserInfo(str);
                    userInfoCreateUserInfo.mainRender.view = tXCloudVideoView;
                    TRTCCloudImpl.this.mRoomInfo.addUserInfo(str, userInfoCreateUserInfo);
                    Monitor.m84161a(1, String.format("Remote-startRemoteView userID:%s (save view before user enter)", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                    return;
                }
                TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                if (tXCloudVideoView2 != null && tXCloudVideoView2.equals(user.mainRender.view)) {
                    TRTCCloudImpl.this.apiLog("startRemoteView user view is the same, ignore " + str);
                    return;
                }
                TRTCRoomInfo.RenderInfo renderInfo = user.mainRender;
                boolean z = renderInfo.view != null;
                TXCloudVideoView tXCloudVideoView3 = tXCloudVideoView;
                renderInfo.view = tXCloudVideoView3;
                long j = renderInfo.tinyID;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (j == 0) {
                    tRTCCloudImpl.apiLog("startRemoteView user tinyID is 0, ignore " + str);
                    return;
                }
                tRTCCloudImpl.setRenderView(str, renderInfo, tXCloudVideoView3, user.debugMargin);
                StringBuilder sb = new StringBuilder();
                String str2 = str;
                Long lValueOf = Long.valueOf(user.tinyID);
                Integer numValueOf = Integer.valueOf(user.streamType);
                TXCloudVideoView tXCloudVideoView4 = tXCloudVideoView;
                sb.append(String.format("Remote-startRemoteView userID:%s tinyID:%d streamType:%d view:%d", str2, lValueOf, numValueOf, Integer.valueOf(tXCloudVideoView4 != null ? tXCloudVideoView4.hashCode() : 0)));
                sb.append(" self:");
                sb.append(TRTCCloudImpl.this.hashCode());
                String string = sb.toString();
                TRTCCloudImpl.this.apiLog(string);
                Monitor.m84161a(1, string, "", 0);
                TRTCCloudImpl.this.notifyLogByUserId(String.valueOf(user.tinyID), user.streamType, 0, "Start watching " + str);
                if (!z || !user.mainRender.render.isRendering()) {
                    TRTCCloudImpl.this.startRemoteRender(user.mainRender.render, user.streamType);
                }
                TXCKeyPointReportProxy.m84170a(String.valueOf(user.tinyID), TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD, 0L, user.streamType);
                boolean z2 = user.mainRender.muteVideo;
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                if (z2) {
                    tRTCCloudImpl2.nativeCancelDownStream(tRTCCloudImpl2.mNativeRtcContext, user.tinyID, user.streamType, true);
                } else {
                    tRTCCloudImpl2.nativeRequestDownStream(tRTCCloudImpl2.mNativeRtcContext, user.tinyID, user.streamType, true);
                }
                TXCEventRecorderProxy.m84163a(String.valueOf(user.tinyID), 4015, 1L, -1L, "", 0);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startScreenCapture(final TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, final TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.25
            @Override // java.lang.Runnable
            public void run() {
                VideoSourceType videoSourceType = TRTCCloudImpl.this.mVideoSourceType;
                VideoSourceType videoSourceType2 = VideoSourceType.NONE;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (videoSourceType != videoSourceType2) {
                    tRTCCloudImpl.notifyCaptureStarted("Has started capturing, ignore startScreenCapture");
                    return;
                }
                tRTCCloudImpl.mVideoSourceType = VideoSourceType.SCREEN;
                TRTCCloudImpl.this.mSensorMode = 0;
                TRTCCloudImpl.this.mOrientationEventListener.disable();
                TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam2 = tRTCVideoEncParam;
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                if (tRTCVideoEncParam2 != null) {
                    tRTCCloudImpl2.mOverrideFPSFromUser = false;
                    TRTCCloudImpl.this.setVideoEncoderParamInternal(tRTCVideoEncParam);
                } else {
                    tRTCCloudImpl2.mOverrideFPSFromUser = true;
                }
                TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                if (tRTCCloudImpl3.mCurrentRole == 21) {
                    tRTCCloudImpl3.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.25.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener == null) {
                                return;
                            }
                            tRTCCloudListener.onWarning(6001, "ignore start local preview,for role audience", null);
                        }
                    });
                    TRTCCloudImpl.this.apiLog("ignore startLocalPreview for audience");
                }
                String str = "start screen capture self:" + TRTCCloudImpl.this.hashCode();
                TRTCCloudImpl.this.apiLog(str);
                Monitor.m84161a(1, str, "", 0);
                TRTCCloudImpl.this.mCaptureAndEnc.m84652a(0);
                TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                C14273g c14273g = tRTCCloudImpl4.mConfig;
                int i = c14273g.f60164l;
                if (i == 1 || i == 3) {
                    tRTCCloudImpl4.updateBigStreamEncoder(true, c14273g.f60153a, c14273g.f60154b, c14273g.f60160h, c14273g.f60155c, c14273g.f60168p, c14273g.f60157e);
                } else {
                    tRTCCloudImpl4.updateBigStreamEncoder(false, c14273g.f60154b, c14273g.f60153a, c14273g.f60160h, c14273g.f60155c, c14273g.f60168p, c14273g.f60157e);
                }
                TRTCCloudImpl tRTCCloudImpl5 = TRTCCloudImpl.this;
                C14273g.a sizeByResolution = tRTCCloudImpl5.getSizeByResolution(tRTCCloudImpl5.mSmallEncParam.videoResolution, TRTCCloudImpl.this.mSmallEncParam.videoResolutionMode);
                TRTCCloudImpl tRTCCloudImpl6 = TRTCCloudImpl.this;
                tRTCCloudImpl6.updateSmallStreamEncoder(sizeByResolution.f60180a, sizeByResolution.f60181b, tRTCCloudImpl6.mSmallEncParam.videoFps, TRTCCloudImpl.this.mSmallEncParam.videoBitrate, TRTCCloudImpl.this.mSmallEncParam.minVideoBitrate);
                TRTCCloudImpl tRTCCloudImpl7 = TRTCCloudImpl.this;
                tRTCCloudImpl7.mRoomInfo.localView = null;
                tRTCCloudImpl7.enableVideoStream(true);
                TXCKeyPointReportProxy.m84167a(40046, 1, 7);
                TRTCCloudImpl tRTCCloudImpl8 = TRTCCloudImpl.this;
                tRTCCloudImpl8.mCaptureAndEnc.m84663a((C14352a.a) tRTCCloudImpl8);
                TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.25.2
                    @Override // java.lang.Runnable
                    public void run() {
                        RunnableC1439225 runnableC1439225 = RunnableC1439225.this;
                        TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams2 = tRTCScreenShareParams;
                        if (tRTCScreenShareParams2 != null) {
                            TRTCCloudImpl.this.showFloatingWindow(tRTCScreenShareParams2.floatingView);
                        }
                    }
                });
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void startSpeedTest(final int i, final String str, final String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.110
                @Override // java.lang.Runnable
                public void run() {
                    TRTCCloudImpl.this.apiLog("startSpeedTest");
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.nativeStartSpeedTest(tRTCCloudImpl.mNativeRtcContext, i, str, str2);
                }
            });
            return;
        }
        TXCLog.m84149e(TAG, "startSpeedTest failed with invalid params. userId = " + str + ", userSig = " + str2 + " self:" + hashCode());
    }

    public void startVolumeLevelCal(boolean z) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(z, this.mAudioVolumeEvalInterval);
        if (!z) {
            this.mVolumeLevelNotifyTask = null;
            this.mAudioVolumeEvalInterval = 0;
        } else if (this.mVolumeLevelNotifyTask == null) {
            VolumeLevelNotifyTask volumeLevelNotifyTask = new VolumeLevelNotifyTask(this);
            this.mVolumeLevelNotifyTask = volumeLevelNotifyTask;
            this.mSDKHandler.postDelayed(volumeLevelNotifyTask, this.mAudioVolumeEvalInterval);
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllAudioEffects() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.104
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopAllAudioEffects");
                TXCSoundEffectPlayer.getInstance().stopAllEffect();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAllRemoteView() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.23
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopAllRemoteView");
                Monitor.m84161a(1, "stopAllRemoteView self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.23.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        TRTCCloudImpl.this.stopRemoteMainRender(userInfo, Boolean.TRUE);
                        TRTCCloudImpl.this.stopRemoteSubRender(userInfo);
                        userInfo.mainRender.view = null;
                        userInfo.subRender.view = null;
                    }
                });
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioEffect(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.103
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopAudioEffect -> effectId = " + i);
                TXCSoundEffectPlayer.getInstance().stopEffectWithId(i);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopAudioRecording() {
        TXCAudioEngine.getInstance().stopLocalAudioDumping();
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopBGM() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.89
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopBGM");
                TXCLiveBGMPlayer.getInstance().stopPlay();
                TRTCCloudImpl.this.mBGMNotify = null;
            }
        });
    }

    public void stopCollectStatus() {
        HandlerC14214e handlerC14214e = this.mSDKHandler;
        if (handlerC14214e != null) {
            handlerC14214e.removeCallbacks(this.mStatusNotifyTask);
        }
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalAudio() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.48
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.stopLocalAudioInternal();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopLocalPreview() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.16
            @Override // java.lang.Runnable
            public void run() {
                final SurfaceView surfaceView;
                String str = "stopLocalPreview self:" + TRTCCloudImpl.this.hashCode();
                TRTCCloudImpl.this.apiLog(str);
                Monitor.m84161a(1, str, "", 0);
                if (TRTCCloudImpl.this.mVideoSourceType == VideoSourceType.CAMERA) {
                    TRTCCloudImpl.this.mVideoSourceType = VideoSourceType.NONE;
                    TRTCCloudImpl.this.mCaptureAndEnc.m84673c(true);
                }
                TXCloudVideoView tXCloudVideoView = TRTCCloudImpl.this.mRoomInfo.localView;
                if (tXCloudVideoView != null && (surfaceView = tXCloudVideoView.getSurfaceView()) != null) {
                    TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.16.1
                        @Override // java.lang.Runnable
                        public void run() {
                            surfaceView.getHolder().removeCallback(TRTCCloudImpl.this);
                        }
                    });
                }
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.mRoomInfo.localView = null;
                tRTCCloudImpl.mIsVideoCapturing = false;
                TRTCCloudImpl.this.mOrientationEventListener.disable();
                if (!TRTCCloudImpl.this.mEnableCustomVideoCapture) {
                    TRTCCloudImpl.this.enableVideoStream(false);
                }
                TXCKeyPointReportProxy.m84167a(40046, 0, 2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void stopPublishCDNStream() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.114
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopPublishCDNStream");
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.nativeStopPublishCDNStream(tRTCCloudImpl.mNativeRtcContext);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopPublishing() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.113
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopPublishing");
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.nativeStopPublishing(tRTCCloudImpl.mNativeRtcContext);
            }
        });
    }

    public void stopRemoteRender(TRTCRoomInfo.UserInfo userInfo) {
        if (userInfo == null) {
            return;
        }
        apiLog(String.format("stopRemoteRender userID:%s tinyID:%d streamType:%d", userInfo.userID, Long.valueOf(userInfo.tinyID), Integer.valueOf(userInfo.streamType)));
        C14143a.m83848a().m83850a(String.valueOf(userInfo.tinyID), hashCode());
        TRTCRoomInfo.RenderInfo renderInfo = userInfo.mainRender;
        final TXCloudVideoView tXCloudVideoView = renderInfo.view;
        final TXCloudVideoView tXCloudVideoView2 = userInfo.subRender.view;
        TXCRenderAndDec tXCRenderAndDec = renderInfo.render;
        if (tXCRenderAndDec != null) {
            tXCRenderAndDec.setVideoFrameListener(null, EnumC14167b.UNKNOWN);
            userInfo.mainRender.render.stop();
            if (tXCloudVideoView == null && userInfo.mainRender.render.getVideoRender() != null) {
                userInfo.mainRender.render.getVideoRender().mo85048e();
            }
        }
        TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
        if (tXCRenderAndDec2 != null) {
            tXCRenderAndDec2.setVideoFrameListener(null, EnumC14167b.UNKNOWN);
            userInfo.subRender.render.stop();
            if (tXCloudVideoView2 == null && userInfo.subRender.render.getVideoRender() != null) {
                userInfo.subRender.render.getVideoRender().mo85048e();
            }
        }
        userInfo.mainRender.stop();
        userInfo.subRender.stop();
        runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.167
            @Override // java.lang.Runnable
            public void run() {
                TXCloudVideoView tXCloudVideoView3 = tXCloudVideoView;
                if (tXCloudVideoView3 != null) {
                    tXCloudVideoView3.removeVideoView();
                }
                TXCloudVideoView tXCloudVideoView4 = tXCloudVideoView2;
                if (tXCloudVideoView4 != null) {
                    tXCloudVideoView4.removeVideoView();
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteSubStreamView(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.20
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (user == null) {
                    tRTCCloudImpl.apiLog("stopRemoteSubStreamView user is not exist " + str);
                    return;
                }
                tRTCCloudImpl.apiLog(String.format("stopRemoteSubStreamView userID:%s tinyID:%d streamType:%d", str, Long.valueOf(user.tinyID), Integer.valueOf(user.streamType)));
                Monitor.m84161a(1, String.format("stopRemoteSubStreamView userID:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TRTCCloudImpl.this.stopRemoteSubRender(user);
                final TXCloudVideoView tXCloudVideoView = user.subRender.view;
                TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.20.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                        if (tXCloudVideoView2 != null) {
                            tXCloudVideoView2.removeVideoView();
                        }
                    }
                });
                user.subRender.view = null;
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopRemoteView(final String str) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.18
            @Override // java.lang.Runnable
            public void run() {
                TRTCRoomInfo.UserInfo user = TRTCCloudImpl.this.mRoomInfo.getUser(str);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (user == null) {
                    tRTCCloudImpl.apiLog("stopRemoteRender user is not exist " + str);
                    return;
                }
                tRTCCloudImpl.apiLog(String.format("stopRemoteView userID:%s tinyID:%d streamType:%d", str, Long.valueOf(user.tinyID), Integer.valueOf(user.streamType)));
                Monitor.m84161a(1, String.format("stopRemoteView userID:%s", str) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                TXCEventRecorderProxy.m84163a(String.valueOf(user.tinyID), 4015, 0L, -1L, "", 0);
                TRTCCloudImpl.this.stopRemoteMainRender(user, Boolean.FALSE);
                final TXCloudVideoView tXCloudVideoView = user.mainRender.view;
                TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.18.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                        if (tXCloudVideoView2 != null) {
                            tXCloudVideoView2.removeVideoView();
                        }
                    }
                });
                user.mainRender.view = null;
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopScreenCapture() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.26
            @Override // java.lang.Runnable
            public void run() {
                VideoSourceType videoSourceType = TRTCCloudImpl.this.mVideoSourceType;
                VideoSourceType videoSourceType2 = VideoSourceType.SCREEN;
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                if (videoSourceType != videoSourceType2) {
                    tRTCCloudImpl.apiLog("stopScreenCapture been ignored for Screen capture is not started");
                    return;
                }
                tRTCCloudImpl.mVideoSourceType = VideoSourceType.NONE;
                String str = "stopScreenCapture self:" + TRTCCloudImpl.this.hashCode();
                TRTCCloudImpl.this.apiLog(str);
                Monitor.m84161a(1, str, "", 0);
                TRTCCloudImpl.this.runOnMainThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.26.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudImpl.this.hideFloatingWindow();
                    }
                });
                TRTCCloudImpl.this.mCaptureAndEnc.m84693k();
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.mRoomInfo.localView = null;
                tRTCCloudImpl2.enableVideoStream(false);
                TXCKeyPointReportProxy.m84167a(40046, 0, 7);
                TRTCCloudImpl tRTCCloudImpl3 = TRTCCloudImpl.this;
                tRTCCloudImpl3.mConfig.f60160h = tRTCCloudImpl3.mLatestParamsOfBigEncoder.getInt(TRTCCloudImpl.KEY_CONFIG_FPS, TRTCCloudImpl.this.mConfig.f60160h);
                TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                tRTCCloudImpl4.mConfig.f60161i = tRTCCloudImpl4.mLatestParamsOfBigEncoder.getInt(TRTCCloudImpl.KEY_CONFIG_GOP, TRTCCloudImpl.this.mConfig.f60161i);
                TRTCCloudImpl tRTCCloudImpl5 = TRTCCloudImpl.this;
                tRTCCloudImpl5.mConfig.f60168p = tRTCCloudImpl5.mLatestParamsOfBigEncoder.getBoolean(TRTCCloudImpl.KEY_CONFIG_ADJUST_RESOLUTION, TRTCCloudImpl.this.mConfig.f60168p);
                TRTCCloudImpl.this.mSmallEncParam.videoFps = TRTCCloudImpl.this.mLatestParamsOfSmallEncoder.getInt(TRTCCloudImpl.KEY_CONFIG_FPS, TRTCCloudImpl.this.mSmallEncParam.videoFps);
                TRTCCloudImpl.this.mSmallEncParam.enableAdjustRes = TRTCCloudImpl.this.mLatestParamsOfSmallEncoder.getBoolean(TRTCCloudImpl.KEY_CONFIG_ADJUST_RESOLUTION, TRTCCloudImpl.this.mSmallEncParam.enableAdjustRes);
                TXCLog.m84152i(TRTCCloudImpl.TAG, String.format(Locale.ENGLISH, "restore big encoder's fps: %d, gop: %d, small encoder's fps: %d", Integer.valueOf(TRTCCloudImpl.this.mConfig.f60160h), Integer.valueOf(TRTCCloudImpl.this.mConfig.f60161i), Integer.valueOf(TRTCCloudImpl.this.mSmallEncParam.videoFps)));
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void stopSpeedTest() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.111
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("stopSpeedTest");
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                tRTCCloudImpl.nativeStopSpeedTest(tRTCCloudImpl.mNativeRtcContext);
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        apiLog("startLocalPreview surfaceChanged " + surfaceHolder.getSurface() + " width " + i2 + ", height " + i3);
        this.mCaptureAndEnc.m84653a(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (surfaceHolder.getSurface().isValid()) {
            apiLog("startLocalPreview surfaceCreated " + surfaceHolder.getSurface());
            this.mCaptureAndEnc.m84657a(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        apiLog("startLocalPreview surfaceDestroyed " + surfaceHolder.getSurface());
        this.mCaptureAndEnc.m84657a((Surface) null);
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchCamera() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.66
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                C14273g c14273g = tRTCCloudImpl.mConfig;
                c14273g.f60165m = !c14273g.f60165m;
                tRTCCloudImpl.mCaptureAndEnc.m84691j();
                TRTCCloudImpl.this.apiLog("switchCamera " + TRTCCloudImpl.this.mConfig.f60165m);
                TRTCCloudImpl.this.updateOrientation();
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void switchRole(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.11
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.apiLog("switchRole:" + i);
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("switchRole:%s", i == 20 ? "Anchor" : "Audience"));
                sb.append(" self:");
                sb.append(TRTCCloudImpl.this.hashCode());
                Monitor.m84161a(1, sb.toString(), "", 0);
                TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                int i2 = i;
                tRTCCloudImpl.mTargetRole = i2;
                tRTCCloudImpl.nativeChangeRole(tRTCCloudImpl.mNativeRtcContext, i2);
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloud
    public void switchRoom(final TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.14
            /* JADX WARN: Code duplicated, block: B:27:0x00f8  */
            /* JADX WARN: Code duplicated, block: B:28:0x0104  */
            /* JADX WARN: Code duplicated, block: B:31:0x010f  */
            @Override // java.lang.Runnable
            public void run() {
                String str;
                String str2;
                String str3 = String.format("switchRoom roomId:%d, strRoomId:%s", Integer.valueOf(tRTCSwitchRoomConfig.roomId), tRTCSwitchRoomConfig.strRoomId) + " self:" + TRTCCloudImpl.this.hashCode();
                TRTCCloudImpl.this.apiLog(str3);
                String str4 = "";
                int i = 0;
                Monitor.m84161a(1, str3, "", 0);
                if (!TRTCCloudImpl.this.isNumericRoom(tRTCSwitchRoomConfig.roomId) && TextUtils.isEmpty(tRTCSwitchRoomConfig.strRoomId)) {
                    TRTCCloudImpl.this.apiLog("Switch room failed with invalid room id");
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.14.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener != null) {
                                tRTCCloudListener.onSwitchRoom(TXLiteAVCode.ERR_ROOM_ENTER_FAIL, "Invalid room id");
                            }
                        }
                    });
                    return;
                }
                if ((TRTCCloudImpl.this.isNumericRoom(tRTCSwitchRoomConfig.roomId) && tRTCSwitchRoomConfig.roomId == TRTCCloudImpl.this.mRoomInfo.roomId) || (!TRTCCloudImpl.this.isNumericRoom(tRTCSwitchRoomConfig.roomId) && tRTCSwitchRoomConfig.strRoomId == TRTCCloudImpl.this.mRoomInfo.strRoomId)) {
                    TRTCCloudImpl.this.apiLog("Switch room to the same one");
                    TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.14.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                            if (tRTCCloudListener != null) {
                                tRTCCloudListener.onSwitchRoom(0, "Switch room to the same one");
                            }
                        }
                    });
                    return;
                }
                TRTCCloudImpl.this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.14.3
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str5, TRTCRoomInfo.UserInfo userInfo) {
                        TRTCCloudImpl.this.stopRemoteRender(userInfo);
                        C14143a.m83848a().m83850a(String.valueOf(userInfo.tinyID), TRTCCloudImpl.this.hashCode());
                        TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                        if (tXCRenderAndDec != null) {
                            tXCRenderAndDec.setVideoFrameListener(null, EnumC14167b.UNKNOWN);
                        }
                        TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
                        if (tXCRenderAndDec2 != null) {
                            tXCRenderAndDec2.setVideoFrameListener(null, EnumC14167b.UNKNOWN);
                        }
                    }
                });
                TRTCCloudImpl.this.mRoomInfo.clearUserList();
                boolean zIsNumericRoom = TRTCCloudImpl.this.isNumericRoom(tRTCSwitchRoomConfig.roomId);
                TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig2 = tRTCSwitchRoomConfig;
                if (!zIsNumericRoom) {
                    if (!TextUtils.isEmpty(tRTCSwitchRoomConfig2.strRoomId)) {
                        TRTCRoomInfo tRTCRoomInfo = TRTCCloudImpl.this.mRoomInfo;
                        String str5 = tRTCSwitchRoomConfig.strRoomId;
                        tRTCRoomInfo.strRoomId = str5;
                        tRTCRoomInfo.roomId = -1L;
                        str = str5;
                    }
                    if (TextUtils.isEmpty(tRTCSwitchRoomConfig.userSig)) {
                        str2 = "";
                    } else {
                        TRTCRoomInfo tRTCRoomInfo2 = TRTCCloudImpl.this.mRoomInfo;
                        String str6 = tRTCSwitchRoomConfig.userSig;
                        tRTCRoomInfo2.userSig = str6;
                        str2 = str6;
                    }
                    if (!TextUtils.isEmpty(tRTCSwitchRoomConfig.privateMapKey)) {
                        TRTCRoomInfo tRTCRoomInfo3 = TRTCCloudImpl.this.mRoomInfo;
                        str4 = tRTCSwitchRoomConfig.privateMapKey;
                        tRTCRoomInfo3.privateMapKey = str4;
                    }
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    tRTCCloudImpl.nativeSwitchRoom(tRTCCloudImpl.mNativeRtcContext, i, str, str2, str4);
                }
                i = tRTCSwitchRoomConfig2.roomId;
                TRTCRoomInfo tRTCRoomInfo4 = TRTCCloudImpl.this.mRoomInfo;
                tRTCRoomInfo4.roomId = i;
                tRTCRoomInfo4.strRoomId = "";
                str = "";
                if (TextUtils.isEmpty(tRTCSwitchRoomConfig.userSig)) {
                    TRTCRoomInfo tRTCRoomInfo5 = TRTCCloudImpl.this.mRoomInfo;
                    String str7 = tRTCSwitchRoomConfig.userSig;
                    tRTCRoomInfo5.userSig = str7;
                    str2 = str7;
                } else {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(tRTCSwitchRoomConfig.privateMapKey)) {
                    TRTCRoomInfo tRTCRoomInfo6 = TRTCCloudImpl.this.mRoomInfo;
                    str4 = tRTCSwitchRoomConfig.privateMapKey;
                    tRTCRoomInfo6.privateMapKey = str4;
                }
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                tRTCCloudImpl2.nativeSwitchRoom(tRTCCloudImpl2.mNativeRtcContext, i, str, str2, str4);
            }
        });
    }

    public void updateAppScene(int i) {
        this.mAppScene = i;
        if (i != 0 && i != 1) {
            this.mAppScene = 0;
        }
        C14273g c14273g = this.mConfig;
        if (c14273g.f60153a * c14273g.f60154b >= 518400) {
            this.mAppScene = 1;
        }
        updateEncType();
        apiLog(String.format("update appScene[%d] for video enc[%d] source scene[%d]", Integer.valueOf(this.mAppScene), Integer.valueOf(this.mConfig.f60162j), Integer.valueOf(i)));
    }

    public void updatePrivateMapKey(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            apiLog("callExperimentalAPI[update private map key fail, params is null");
            return;
        }
        String string = jSONObject.getString("privateMapKey");
        if (TextUtils.isEmpty(string)) {
            apiLog("callExperimentalAPI[update private map key fail, key is empty");
        } else {
            nativeUpdatePrivateMapKey(this.mNativeRtcContext, string);
        }
    }

    public void muteLocalAudio(final boolean z, final TRTCCloudImpl tRTCCloudImpl) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.54
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this.mCurrentPublishClouds.get(1);
                boolean z2 = z;
                TRTCCloudImpl tRTCCloudImpl3 = tRTCCloudImpl;
                if (z2) {
                    if (tRTCCloudImpl2 == tRTCCloudImpl3) {
                        TRTCCloudImpl.this.mRoomInfo.muteLocalAudio = z2;
                        TXCAudioEngine.getInstance().muteLocalAudio(z);
                        TRTCCloudImpl.this.muteUpstream(1, z);
                        return;
                    }
                    return;
                }
                if (tRTCCloudImpl2 != tRTCCloudImpl3) {
                    TRTCCloudImpl.this.enableAudioStream(false);
                    synchronized (TRTCCloudImpl.this.mCurrentPublishClouds) {
                        TRTCCloudImpl.this.mCurrentPublishClouds.put(1, tRTCCloudImpl);
                    }
                    TRTCCloudImpl.this.setAudioEncodeConfiguration();
                }
                TRTCCloudImpl.this.mRoomInfo.muteLocalAudio = z;
                TXCAudioEngine.getInstance().muteLocalAudio(z);
                TRTCCloudImpl.this.muteUpstream(1, z);
                TRTCCloudImpl.this.enableAudioStream(true);
            }
        });
    }

    public void muteLocalVideo(final boolean z, final TRTCCloudImpl tRTCCloudImpl) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.31
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this.mCurrentPublishClouds.get(2);
                boolean z2 = z;
                TRTCCloudImpl tRTCCloudImpl3 = tRTCCloudImpl;
                if (z2) {
                    if (tRTCCloudImpl2 == tRTCCloudImpl3) {
                        TRTCCloudImpl tRTCCloudImpl4 = TRTCCloudImpl.this;
                        tRTCCloudImpl4.mRoomInfo.muteLocalVideo = z2;
                        tRTCCloudImpl4.enableNetworkBlackStream(tRTCCloudImpl4.mCaptureAndEnc.m84687h());
                        TRTCCloudImpl tRTCCloudImpl5 = TRTCCloudImpl.this;
                        if (tRTCCloudImpl5.mConfig.f60128A != null) {
                            tRTCCloudImpl5.mCaptureAndEnc.m84680f();
                            return;
                        } else {
                            tRTCCloudImpl5.muteUpstream(2, z);
                            return;
                        }
                    }
                    return;
                }
                if (tRTCCloudImpl2 != tRTCCloudImpl3) {
                    TRTCCloudImpl.this.enableVideoStream(false);
                    synchronized (TRTCCloudImpl.this.mCurrentPublishClouds) {
                        TRTCCloudImpl.this.mCurrentPublishClouds.put(2, tRTCCloudImpl);
                        TRTCCloudImpl.this.mCurrentPublishClouds.put(3, tRTCCloudImpl);
                        TRTCCloudImpl.this.mCurrentPublishClouds.put(7, tRTCCloudImpl);
                    }
                    TRTCCloudImpl tRTCCloudImpl6 = TRTCCloudImpl.this;
                    tRTCCloudImpl6.enableNetworkBlackStream(tRTCCloudImpl6.mCaptureAndEnc.m84687h());
                    TRTCCloudImpl tRTCCloudImpl7 = TRTCCloudImpl.this;
                    tRTCCloudImpl7.enableNetworkSmallStream(tRTCCloudImpl7.mEnableSmallStream);
                    TRTCCloudImpl tRTCCloudImpl8 = TRTCCloudImpl.this;
                    tRTCCloudImpl8.setVideoQuality(tRTCCloudImpl8.mQosMode, TRTCCloudImpl.this.mQosPreference);
                    TRTCCloudImpl tRTCCloudImpl9 = TRTCCloudImpl.this;
                    C14273g.a aVar = tRTCCloudImpl9.mRoomInfo.bigEncSize;
                    int i = aVar.f60180a;
                    int i2 = aVar.f60181b;
                    C14273g c14273g = tRTCCloudImpl9.mConfig;
                    tRTCCloudImpl9.setVideoEncConfig(2, i, i2, c14273g.f60160h, c14273g.f60155c, c14273g.f60168p, c14273g.f60157e);
                    boolean z3 = TRTCCloudImpl.this.mEnableSmallStream;
                    TRTCCloudImpl tRTCCloudImpl10 = TRTCCloudImpl.this;
                    if (z3) {
                        C14273g.a aVar2 = tRTCCloudImpl10.mRoomInfo.smallEncSize;
                        int i3 = aVar2.f60180a;
                        int i4 = aVar2.f60181b;
                        int i5 = tRTCCloudImpl10.mSmallEncParam.videoFps;
                        int i6 = TRTCCloudImpl.this.mSmallEncParam.videoBitrate;
                        TRTCCloudImpl tRTCCloudImpl11 = TRTCCloudImpl.this;
                        tRTCCloudImpl10.setVideoEncConfig(3, i3, i4, i5, i6, tRTCCloudImpl11.mConfig.f60168p, tRTCCloudImpl11.mSmallEncParam.minVideoBitrate);
                    } else {
                        tRTCCloudImpl10.setVideoEncoderConfiguration(3, 0, 0, 0, 0, 0, tRTCCloudImpl10.mConfig.f60168p, 0);
                    }
                    TRTCCloudImpl.this.enableVideoStream(true);
                }
                TRTCCloudImpl.this.mCaptureAndEnc.m84683g();
                TRTCCloudImpl tRTCCloudImpl12 = TRTCCloudImpl.this;
                tRTCCloudImpl12.mRoomInfo.muteLocalVideo = z;
                tRTCCloudImpl12.enableNetworkBlackStream(tRTCCloudImpl12.mCaptureAndEnc.m84687h());
                TRTCCloudImpl.this.muteUpstream(2, z);
                TRTCCloudImpl.this.mCaptureAndEnc.m84692j(2);
                if (TRTCCloudImpl.this.mEnableSmallStream) {
                    TRTCCloudImpl.this.mCaptureAndEnc.m84692j(3);
                }
            }
        });
    }

    public void onVideoConfigChanged(int i, boolean z) {
        onVideoConfigChanged(this, i, z);
    }

    public void onAudioQosChanged(int i, int i2, int i3) {
        onAudioQosChanged(this, i, i2, i3);
    }

    public void onIdrFpsChanged(int i) {
        onIdrFpsChanged(this, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnSDKThread(Runnable runnable, int i) {
        HandlerC14214e handlerC14214e = this.mSDKHandler;
        if (handlerC14214e != null) {
            handlerC14214e.postDelayed(runnable, i);
        }
    }

    public void onVideoQosChanged(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        onVideoQosChanged(this, i, i2, i3, i4, i5, i6, i7);
    }

    public void notifyEvent(final String str, final int i, final Bundle bundle) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.170
            @Override // java.lang.Runnable
            public void run() {
                TRTCCloudImpl.this.appendDashboardLog(str, bundle.getInt("EVT_STREAM_TYPE", 2), bundle.getString(TXLiveConstants.EVT_DESCRIPTION, ""), String.format("event %d, ", Integer.valueOf(i)));
                int i2 = i;
                if (i2 == 2029) {
                    TRTCCloudImpl.this.apiLog("release mic~");
                    boolean zIsRoomExit = TRTCCloudImpl.this.mRoomInfo.isRoomExit();
                    TRTCCloudImpl tRTCCloudImpl = TRTCCloudImpl.this;
                    if (zIsRoomExit) {
                        tRTCCloudImpl.apiLog("onExitRoom when mic release.");
                        final int roomExitCode = TRTCCloudImpl.this.mRoomInfo.getRoomExitCode();
                        TRTCCloudImpl.this.mRoomInfo.setRoomExit(false, 0);
                        TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.170.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TRTCCloudListener tRTCCloudListener = TRTCCloudImpl.this.mTRTCListener;
                                if (tRTCCloudListener != null) {
                                    tRTCCloudListener.onExitRoom(roomExitCode);
                                }
                            }
                        });
                    } else {
                        tRTCCloudImpl.mRoomInfo.micStart(false);
                    }
                } else if (i2 == 2027) {
                    TRTCCloudImpl.this.apiLog(String.format("onMicDidReady~", new Object[0]));
                    TRTCCloudImpl.this.mRoomInfo.micStart(true);
                }
                final int iTranslateStreamType = TRTCCloudImpl.this.translateStreamType(bundle.getInt("EVT_STREAM_TYPE", 2));
                TRTCCloudImpl.this.runOnListenerThread(new Runnable() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.170.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass170 anonymousClass170 = AnonymousClass170.this;
                        TRTCCloudImpl tRTCCloudImpl2 = TRTCCloudImpl.this;
                        TRTCCloudListener tRTCCloudListener = tRTCCloudImpl2.mTRTCListener;
                        if (tRTCCloudListener == null) {
                            return;
                        }
                        int i3 = i;
                        if (i3 == 2003) {
                            String str2 = str;
                            if (str2 != null && str2.equals(tRTCCloudImpl2.mRoomInfo.getUserId())) {
                                TRTCCloudImpl.this.apiLog("onFirstVideoFrame local.");
                                tRTCCloudListener.onFirstVideoFrame(null, iTranslateStreamType, bundle.getInt("EVT_PARAM1"), bundle.getInt("EVT_PARAM2"));
                                return;
                            }
                            TRTCCloudImpl.this.apiLog("onFirstVideoFrame " + str);
                            AnonymousClass170 anonymousClass171 = AnonymousClass170.this;
                            tRTCCloudListener.onFirstVideoFrame(str, iTranslateStreamType, bundle.getInt("EVT_PARAM1"), bundle.getInt("EVT_PARAM2"));
                            return;
                        }
                        if (i3 == 2026) {
                            tRTCCloudImpl2.apiLog("onFirstAudioFrame " + str);
                            tRTCCloudListener.onFirstAudioFrame(str);
                            return;
                        }
                        if (i3 == 1003) {
                            tRTCCloudListener.onCameraDidReady();
                            Monitor.m84161a(1, "onCameraDidReady self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            return;
                        }
                        if (i3 == 2027) {
                            tRTCCloudListener.onMicDidReady();
                            Monitor.m84161a(1, "onMicDidReady self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            return;
                        }
                        if (i3 < 0) {
                            tRTCCloudListener.onError(i3, bundle.getString(TXLiveConstants.EVT_DESCRIPTION, ""), bundle);
                            Monitor.m84161a(3, String.format("onError event:%d, msg:%s", Integer.valueOf(i), bundle) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                            TXCKeyPointReportProxy.m84171b(i);
                            return;
                        }
                        if ((i3 <= 1100 || i3 >= 1110) && ((i3 <= 1200 || i3 >= 1206) && ((i3 <= 2100 || i3 >= 2110) && ((i3 <= 3001 || i3 >= 3011) && (i3 <= 5100 || i3 >= 5104))))) {
                            return;
                        }
                        tRTCCloudListener.onWarning(i3, bundle.getString(TXLiveConstants.EVT_DESCRIPTION, ""), bundle);
                        if (i != 2105) {
                            Monitor.m84161a(1, String.format("onWarning event:%d, msg:%s", Integer.valueOf(i), bundle) + " self:" + TRTCCloudImpl.this.hashCode(), "", 0);
                        }
                        int i4 = i;
                        if (i4 == 1103 || i4 == 1109 || i4 == 2106 || i4 == 2109 || i4 == 2101 || i4 == 2102) {
                            TXCKeyPointReportProxy.m84171b(i4);
                        }
                    }
                });
            }
        });
    }

    private void runOnListenerThread(Runnable runnable, int i) {
        Handler handler = this.mListenerHandler;
        if (handler == null) {
            this.mMainHandler.postDelayed(runnable, i);
        } else {
            handler.postDelayed(runnable, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendDashboardLog(String str, int i, String str2) {
        appendDashboardLog(str, i, str2, "");
    }

    public TRTCCloudImpl(Context context, HandlerC14214e handlerC14214e) {
        this.reverbTypes = new TXAudioEffectManager.TXVoiceReverbType[]{TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6, TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7};
        this.voiceChangerTypes = new TXAudioEffectManager.TXVoiceChangerType[]{TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10, TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11};
        this.mNativeLock = new Object();
        this.mAudioFrameListener = null;
        this.mPriorStreamType = 2;
        this.mEnableSmallStream = false;
        this.mVideoRenderMirror = 0;
        this.mCustomRemoteRender = false;
        this.mAudioVolumeEvalInterval = 0;
        this.mSmallEncParam = new TRTCCloudDef.TRTCVideoEncParam();
        this.mQosMode = 1;
        this.mEnableEosMode = false;
        this.mCodecType = 2;
        this.mEnableSoftAEC = true;
        this.mEnableSoftANS = false;
        this.mEnableSoftAGC = false;
        this.mSoftAECLevel = 100;
        this.mSoftANSLevel = 100;
        this.mSoftAGCLevel = 100;
        this.mAudioCaptureVolume = 100;
        this.mAudioPlayoutVolume = 100;
        this.mCustomVideoUtil = null;
        this.mEnableCustomAudioCapture = false;
        this.mEnableCustomVideoCapture = false;
        this.mCurrentRole = 20;
        this.mTargetRole = 20;
        this.mLastCaptureCalculateTS = 0L;
        this.mCaptureFrameCount = 0L;
        this.mLastCaptureFrameCount = 0L;
        this.mPerformanceMode = 0;
        this.mCurrentOrientation = -1;
        this.mFloatingWindow = null;
        this.mOverrideFPSFromUser = false;
        this.mLatestParamsOfBigEncoder = new Bundle();
        this.mLatestParamsOfSmallEncoder = new Bundle();
        this.mFramework = 1;
        this.mCallback = new InterfaceC14169a() { // from class: com.tencent.liteav.trtc.impl.TRTCCloudImpl.1
            @Override // com.tencent.liteav.basic.p092b.InterfaceC14169a
            public void onError(String str, int i, String str2, String str3) {
                TXCLog.m84149e(TRTCCloudImpl.TAG, "onError => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("EVT_USERID", str);
                    bundle.putInt("EVT_ID", i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str2.concat(str3 != null ? str3 : ""));
                    }
                    TRTCCloudImpl.this.onNotifyEvent(i, bundle);
                }
                Monitor.m84160a(3, i, str2, str3, 0, 0);
            }

            @Override // com.tencent.liteav.basic.p092b.InterfaceC14169a
            public void onEvent(String str, int i, String str2, String str3) {
                TXCLog.m84152i(TRTCCloudImpl.TAG, "onEvent => id:" + str + " code:" + i + " msg:" + str2 + " params:" + str3);
                if (TRTCCloudImpl.this.mTRTCListener != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("EVT_USERID", str);
                    bundle.putInt("EVT_ID", i);
                    bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    if (str2 != null) {
                        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str2.concat(str3 != null ? str3 : ""));
                    }
                    TRTCCloudImpl.this.onNotifyEvent(i, bundle);
                }
                Monitor.m84160a(2, i, str2, str3, 0, 0);
            }
        };
        this.mSubClouds = new ArrayList<>();
        this.mCurrentPublishClouds = new HashMap<>();
        this.mVolumeLevelNotifyTask = null;
        this.mDebugType = 0;
        this.mStatusNotifyTask = null;
        this.mNetType = -1;
        this.mBackground = -1;
        init(context, handlerC14214e);
        this.mCurrentRole = 21;
        this.mTargetRole = 21;
    }
}
