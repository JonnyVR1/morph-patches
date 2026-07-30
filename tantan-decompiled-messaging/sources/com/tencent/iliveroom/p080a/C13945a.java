package com.tencent.iliveroom.p080a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.gms.common.api.Api;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.iliveroom.IOneSecAdapter;
import com.tencent.iliveroom.OneSecAdapterParams;
import com.tencent.iliveroom.TXILiveRoomAudioDelegateAdapter;
import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.iliveroom.TXILiveRoomDelegateAdapter;
import com.tencent.iliveroom.TXILiveRoomVideoRenderDelegate;
import com.tencent.iliveroom.p080a.p081a.C13946a;
import com.tencent.iliveroom.p080a.p081a.C13947b;
import com.tencent.iliveroom.p080a.p081a.C13949d;
import com.tencent.iliveroom.p080a.p081a.C13950e;
import com.tencent.iliveroom.p080a.p082b.C13953a;
import com.tencent.iliveroom.p080a.p082b.C13954b;
import com.tencent.iliveroom.p080a.p083c.C13957a;
import com.tencent.iliveroom.p080a.p083c.C13958b;
import com.tencent.iliveroom.p080a.p083c.C13959c;
import com.tencent.iliveroom.p080a.p083c.C13960d;
import com.tencent.iliveroom.p080a.p083c.C13961e;
import com.tencent.liteav.C14110g;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.trtc.impl.TRTCCloudImpl;
import com.tencent.liteav.trtc.impl.TRTCRoomInfo;
import com.tencent.liteav.trtc.impl.TRTCTranscodingConfigInner;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13945a extends TRTCCloudImpl implements IOneSecAdapter, TXAudioEffectManager.TXMusicPlayObserver, TRTCCloudListener.TRTCAudioFrameListener, TRTCCloudListener.TRTCVideoRenderListener {

    /* JADX INFO: renamed from: A */
    private int f57594A;

    /* JADX INFO: renamed from: B */
    private int f57595B;

    /* JADX INFO: renamed from: C */
    private int f57596C;

    /* JADX INFO: renamed from: D */
    private long f57597D;

    /* JADX INFO: renamed from: E */
    private long f57598E;

    /* JADX INFO: renamed from: F */
    private long f57599F;

    /* JADX INFO: renamed from: G */
    private b f57600G;

    /* JADX INFO: renamed from: H */
    private Map<Integer, TRTCCloudDef.TRTCAudioEffectParam> f57601H;

    /* JADX INFO: renamed from: I */
    private int f57602I;

    /* JADX INFO: renamed from: J */
    private int f57603J;

    /* JADX INFO: renamed from: K */
    private C13950e f57604K;

    /* JADX INFO: renamed from: L */
    private TXILiveRoomDefine.TXILiveRoomLocalMixConfig f57605L;

    /* JADX INFO: renamed from: M */
    private String f57606M;

    /* JADX INFO: renamed from: N */
    private C13960d f57607N;

    /* JADX INFO: renamed from: O */
    private long f57608O;

    /* JADX INFO: renamed from: P */
    private Map<String, TXILiveRoomVideoRenderDelegate> f57609P;

    /* JADX INFO: renamed from: a */
    protected OneSecAdapterParams f57610a;

    /* JADX INFO: renamed from: b */
    protected boolean f57611b;

    /* JADX INFO: renamed from: c */
    protected C13961e f57612c;

    /* JADX INFO: renamed from: d */
    protected TXILiveRoomAudioDelegateAdapter f57613d;

    /* JADX INFO: renamed from: e */
    protected C13956c f57614e;

    /* JADX INFO: renamed from: f */
    protected Set<Integer> f57615f;

    /* JADX INFO: renamed from: g */
    protected boolean f57616g;

    /* JADX INFO: renamed from: h */
    protected Set<Long> f57617h;

    /* JADX INFO: renamed from: i */
    protected long f57618i;

    /* JADX INFO: renamed from: j */
    protected C13949d f57619j;

    /* JADX INFO: renamed from: k */
    protected C13957a f57620k;

    /* JADX INFO: renamed from: l */
    protected boolean f57621l;

    /* JADX INFO: renamed from: m */
    private Context f57622m;

    /* JADX INFO: renamed from: n */
    private Map<Long, a> f57623n;

    /* JADX INFO: renamed from: o */
    private TXILiveRoomDefine.TXILiveRoomConfig f57624o;

    /* JADX INFO: renamed from: p */
    private String f57625p;

    /* JADX INFO: renamed from: q */
    private boolean f57626q;

    /* JADX INFO: renamed from: r */
    private boolean f57627r;

    /* JADX INFO: renamed from: s */
    private AtomicBoolean f57628s;

    /* JADX INFO: renamed from: t */
    private C13947b f57629t;

    /* JADX INFO: renamed from: u */
    private long f57630u;

    /* JADX INFO: renamed from: v */
    private Object f57631v;

    /* JADX INFO: renamed from: w */
    private C13952b f57632w;

    /* JADX INFO: renamed from: x */
    private int f57633x;

    /* JADX INFO: renamed from: y */
    private int f57634y;

    /* JADX INFO: renamed from: z */
    private int f57635z;

    public C13945a(Context context, TXILiveRoomDefine.TXILiveConfig tXILiveConfig, TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        super(context);
        this.f57607N = new C13960d();
        this.f57622m = context.getApplicationContext();
        super.setAudioFrameListener(this);
        C14110g.a aVar = this.mRoomInfo.bigEncSize;
        aVar.f59332a = 0;
        aVar.f59333b = 0;
        C14110g c14110g = this.mConfig;
        c14110g.f59305a = 0;
        c14110g.f59306b = 0;
        c14110g.f59312h = 15;
        c14110g.f59314j = 1;
        this.mCaptureAndEnc.m83478a(c14110g);
        this.mCaptureAndEnc.m83499f(false);
        this.f57629t = new C13947b();
        this.f57628s = new AtomicBoolean(false);
        this.f57612c = new C13961e();
        this.f57632w = new C13952b(this);
        this.f57614e = new C13956c(this);
        this.f57612c.m82640a(tXILiveRoomDelegateAdapter);
        super.setListener(this.f57632w);
        super.setGSensorMode(0);
        super.setVideoEncoderMirror(true);
        super.setVideoEncoderRotation(2);
        this.f57601H = new HashMap();
        this.f57623n = new HashMap();
        this.f57609P = new HashMap();
        this.f57615f = new HashSet();
        this.f57617h = new HashSet();
        this.f57600G = new b(this);
        this.f57618i = -1L;
        this.f57620k = new C13957a(5);
        getAudioEffectManager().setMusicObserver(Api.BaseClientBuilder.API_PRIORITY_OTHER, this);
        TXCAudioEngine.getInstance().setPlayoutDataCallbackFormat(44100, 2, 512);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82470a(int i, int i2, int i3, int i4, int i5) {
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            TXCLog.m82966e("TRTCAdapter-ext", "setVideoEncParamsInner -> fail. type:" + i + " width:" + i2 + " height:" + i3 + " fps:" + i4 + " bitrate:" + i5);
            return;
        }
        if (i == 1) {
            super.enableEncSmallVideoStream(true, null);
        }
        TXCLog.m82969i("TRTCAdapter-ext", "setVideoEncParamsInner -> setEncParams type:" + i + " width:" + i2 + " height:" + i3 + " fps:" + i4 + " bitrate:" + i5);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("api", "setVideoEncodeParamEx");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(CommandMessage.PARAMS, jSONObject2);
            jSONObject2.put("codecType", 1);
            jSONObject2.put("streamType", i);
            jSONObject2.put("videoWidth", i2);
            jSONObject2.put("videoHeight", i3);
            jSONObject2.put("videoFps", i4);
            jSONObject2.put("videoBitrate", i5);
        } catch (JSONException e) {
            TXCLog.m82967e("TRTCAdapter-ext", "build json object failed.", e);
        }
        super.callExperimentalAPI(jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82496b() {
        TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam = new TRTCCloudDef.TRTCNetworkQosParam();
        tRTCNetworkQosParam.preference = 2;
        tRTCNetworkQosParam.controlMode = 1;
        super.setNetworkQosParam(tRTCNetworkQosParam);
        if (!TextUtils.isEmpty(this.f57625p)) {
            m82486a(this.f57625p, this.f57606M);
        }
        this.f57611b = this.f57610a.roomRole == 1;
        TRTCCloudDef.TRTCParams tRTCParams = new TRTCCloudDef.TRTCParams();
        tRTCParams.sdkAppId = (int) this.f57610a.sdkAppId;
        tRTCParams.userId = this.f57610a.userId + "";
        OneSecAdapterParams oneSecAdapterParams = this.f57610a;
        tRTCParams.role = oneSecAdapterParams.roomRole == 1 ? 20 : 21;
        tRTCParams.userSig = oneSecAdapterParams.userSig;
        byte[] bArr = oneSecAdapterParams.privateMapKey;
        if (bArr != null) {
            tRTCParams.privateMapKey = new String(bArr);
        }
        tRTCParams.roomId = -1;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("strGroupId", this.f57610a.roomName);
            jSONObject.put("Role", 0);
            if (this.f57610a.sdkAppId != 1400154900) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("pure_audio_push_mod", 1);
                jSONObject.put("Str_uc_params", jSONObject2);
            }
        } catch (JSONException e) {
            TXCLog.m82967e("TRTCAdapter-ext", "build json failed.", e);
        }
        tRTCParams.businessInfo = jSONObject.toString();
        super.enterRoom(tRTCParams, 1);
        if (this.f57611b) {
            m82512c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m82512c() {
        C13945a c13945a;
        super.enableCustomVideoCapture(true);
        this.f57628s.set(true);
        TXILiveRoomDefine.TXILiveRoomConfig tXILiveRoomConfig = this.f57624o;
        if (tXILiveRoomConfig != null) {
            c13945a = this;
            c13945a.m82470a(0, this.f57633x, this.f57634y, tXILiveRoomConfig.videoFps, tXILiveRoomConfig.videoBitrate);
        } else {
            c13945a = this;
        }
        super.setAudioFrameListener(c13945a);
        if (c13945a.f57624o.audioEncQuality == 3) {
            TXCLog.m82969i("TRTCAdapter-ext", "startPublish: enable high audio quality.");
            super.setAudioQuality(3);
            TXCAudioEngine.getInstance().setCaptureDataCallbackFormat(44100, 2, 512);
        } else {
            TXCLog.m82969i("TRTCAdapter-ext", "startPublish: enable standard audio quality.");
            super.setAudioQuality(2);
            TXCAudioEngine.getInstance().setCaptureDataCallbackFormat(44100, 1, 1024);
        }
        super.startLocalAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m82519d() {
        super.enableCustomVideoCapture(false);
        super.stopLocalAudio();
        this.f57628s.set(false);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void addDelegate(TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        this.f57612c.m82640a(tXILiveRoomDelegateAdapter);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void checkUserState(String str, long j, int i, int i2) {
        super.checkUserState(str, j, i, i2);
        try {
            long j2 = Long.parseLong(str);
            OneSecAdapterParams oneSecAdapterParams = this.f57610a;
            if (oneSecAdapterParams == null) {
                TXCLog.m82966e("TRTCAdapter-ext", "TRTCAdapter: check user state error. params is null.");
                return;
            }
            if (TRTCRoomInfo.isMuteAudio(i2) != TRTCRoomInfo.isMuteAudio(i)) {
                this.f57612c.onRoomAudioMuted(oneSecAdapterParams.roomName, j2, TRTCRoomInfo.isMuteAudio(i));
            }
            if (TRTCRoomInfo.isMuteMainVideo(i2) != TRTCRoomInfo.isMuteMainVideo(i)) {
                this.f57612c.onRoomVideoMuted(oneSecAdapterParams.roomName, j2, TRTCRoomInfo.isMuteMainVideo(i));
            }
        } catch (Exception unused) {
            TXCLog.m82966e("TRTCAdapter-ext", "TRTCAdapter: check user state error. user id error.id:" + str);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void clearDelegate() {
        this.f57612c.m82639a();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void clearLocalMixConfig() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.33
            @Override // java.lang.Runnable
            public void run() {
                Monitor.m82978a(2, "clear local mix config", "", 0);
                C13945a.super.setRemoteVideoRenderListener(C13945a.this.f57618i + "", 0, 0, null);
                C13945a.this.f57605L = null;
                C13945a c13945a = C13945a.this;
                c13945a.f57619j = null;
                c13945a.f57618i = -1L;
                c13945a.f57620k.m82634b();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void clearMixTranscodingConfig() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.31
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.setMixTranscodingConfig((TRTCCloudDef.TRTCTranscodingConfig) null);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void connectOtherRoom(String str, long j) {
        this.f57614e.m82629a(str, j);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.iliveroom.IOneSecAdapter
    public void destroy() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.34
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.getAudioEffectManager().setMusicObserver(Api.BaseClientBuilder.API_PRIORITY_OTHER, null);
                C13945a.this.f57612c.m82639a();
                C13945a.super.destroy();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void disconnectOtherRoom() {
        this.f57614e.m82628a();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void enableAudioMessage(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.27
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.m82969i("TRTCAdapter-ext", "TRTCAdapter: enable block message, enable:" + z);
                C13945a c13945a = C13945a.this;
                c13945a.f57616g = z;
                if (((TRTCCloudImpl) c13945a).mCaptureAndEnc != null) {
                    ((TRTCCloudImpl) C13945a.this).mCaptureAndEnc.m83487b(z);
                }
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int enableEncSmallVideoStream(final boolean z, final TXILiveRoomDefine.TXILiveSize tXILiveSize, final int i, final int i2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.13
            @Override // java.lang.Runnable
            public void run() {
                TXILiveRoomDefine.TXILiveSize tXILiveSize2;
                int i3;
                int i4;
                int i5;
                int i6;
                if (z && (tXILiveSize2 = tXILiveSize) != null && (i3 = tXILiveSize2.width) > 0 && (i4 = tXILiveSize2.height) > 0 && (i5 = i) > 0 && (i6 = i2) > 0) {
                    C13945a.this.m82470a(1, i3, i4, i5, i6);
                    return;
                }
                TXCLog.m82969i("TRTCAdapter-ext", "enableEncSmallVideoStream -> disable small " + z + " size = " + tXILiveSize + " fps = " + i + " videoBitrate = " + i2);
                C13945a.super.enableEncSmallVideoStream(false, null);
            }
        });
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public TXILiveRoomDefine.TXILiveRoomAVStatistic getAVStatistic() {
        return C13953a.m82602a().m82609c();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public long getMusicCurrentPosition() {
        return getAudioEffectManager().getMusicCurrentPosInMS(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int getMusicDuration() {
        return (int) this.f57608O;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void joinRoom(final OneSecAdapterParams oneSecAdapterParams, final TXILiveRoomDefine.TXILiveRoomConfig tXILiveRoomConfig) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                C13953a.m82602a().m82607b();
                C13953a.m82602a().m82605a(oneSecAdapterParams.userId);
                C13953a.m82602a().m82604a(oneSecAdapterParams.roomRole);
                C13945a.this.f57597D = 0L;
                C13945a.this.f57598E = 0L;
                C13945a.this.f57599F = 0L;
                C13945a.this.f57600G.m82581a();
                C13945a.this.f57624o = tXILiveRoomConfig;
                C13945a c13945a = C13945a.this;
                c13945a.f57610a = oneSecAdapterParams;
                c13945a.f57617h.clear();
                C13945a c13945a2 = C13945a.this;
                c13945a2.f57621l = false;
                if (tXILiveRoomConfig.cdnVideoCodecType == 2) {
                    OneSecAdapterParams oneSecAdapterParams2 = c13945a2.f57610a;
                    c13945a2.f57606M = c13945a2.m82494b(oneSecAdapterParams2.bizId, oneSecAdapterParams2.sdkAppId, oneSecAdapterParams2.roomName, oneSecAdapterParams2.userId);
                } else {
                    c13945a2.f57606M = "";
                }
                C13945a.this.m82496b();
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteAllRemoteAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.16
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.muteAllRemoteAudio(z);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteAllRemoteVideo(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.8
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.muteAllRemoteVideoStreams(z);
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.14
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.f57626q = z;
                C13945a.super.muteLocalAudio(z);
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalVideo(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.46
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.f57627r = z;
                C13945a.super.muteLocalVideo(z);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteRemoteAudio(final long j, final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.15
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.muteRemoteAudio(j + "", z);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteRemoteVideo(final long j, final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.7
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.muteRemoteVideoStream(j + "", z);
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void notifyEvent(String str, int i, Bundle bundle) {
        super.notifyEvent(str, i, bundle);
        C13952b c13952b = this.f57632w;
        if (c13952b != null) {
            c13952b.m82601a(str, i, bundle);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onAVMemberEnter(final long j, String str, int i, final int i2) {
        super.onAVMemberEnter(j, str, i, i2);
        TXCAudioEngine.getInstance().setRemoteStreamDataCallbackFormat(j + "", 44100, 2, 512);
        TXCAudioEngine.getInstance().setPlayoutDataCallbackFormat(44100, 2, 512);
        try {
            final long j2 = Long.parseLong(str);
            runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.41
                @Override // java.lang.Runnable
                public void run() {
                    C13953a.m82602a().m82606a(j2, j);
                    OneSecAdapterParams oneSecAdapterParams = C13945a.this.f57610a;
                    if (oneSecAdapterParams == null) {
                        TXCLog.m82966e("TRTCAdapter-ext", "TRTCAdapter: on av member enter. params is null.");
                        return;
                    }
                    if (TRTCRoomInfo.isMuteAudio(i2)) {
                        C13945a.this.f57612c.onRoomAudioMuted(oneSecAdapterParams.roomName, j2, true);
                    }
                    if (TRTCRoomInfo.isMuteMainVideo(i2)) {
                        C13945a.this.f57612c.onRoomVideoMuted(oneSecAdapterParams.roomName, j2, true);
                    }
                }
            });
        } catch (Exception unused) {
            TXCLog.m82966e("TRTCAdapter-ext", "TRTCAdapter: on av member enter.  user is is valid. user id:0");
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onAVMemberExit(final long j, String str, int i, int i2) {
        super.onAVMemberExit(j, str, i, i2);
        try {
            final long j2 = Long.parseLong(str);
            runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.42
                @Override // java.lang.Runnable
                public void run() {
                    C13953a.m82602a().m82608b(j2, j);
                    C13945a.this.f57617h.remove(Long.valueOf(j2));
                }
            });
        } catch (Exception e) {
            TXCLog.m82967e("TRTCAdapter-ext", "parse userid failed.", e);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onCancelTranscoding(final int i, final String str) {
        super.runOnListenerThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.39
            @Override // java.lang.Runnable
            public void run() {
                Monitor.m82978a(1, String.format("onCancelTranscoding err:%d, msg:%s", Integer.valueOf(i), str), "", 0);
                C13961e c13961e = C13945a.this.f57612c;
                if (c13961e != null) {
                    c13961e.onClearMixTranscodingConfig(i, str);
                }
            }
        });
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onCapturedRawAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        byte[] bArr = tRTCAudioFrame.data;
        int i = tRTCAudioFrame.channel;
        int i2 = tRTCAudioFrame.sampleRate;
        long j = tRTCAudioFrame.timestamp;
        TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f57613d;
        if (tXILiveRoomAudioDelegateAdapter != null) {
            TXILiveRoomDefine.TXILiveRoomAudioFrame tXILiveRoomAudioFrame = new TXILiveRoomDefine.TXILiveRoomAudioFrame();
            tXILiveRoomAudioFrame.audioData = bArr;
            tXILiveRoomAudioFrame.audioChannels = i;
            tXILiveRoomAudioFrame.audioSampleRate = i2;
            tXILiveRoomAudioFrame.timestamp = j;
            tXILiveRoomAudioDelegateAdapter.onRecordAudioFrame(tXILiveRoomAudioFrame);
            if (this.f57618i != -1) {
                if (i == 2) {
                    C13958b.m82635a(tXILiveRoomAudioFrame.audioData, 2, this.f57620k.m82632a(), 2);
                } else if (i == 1) {
                    C13958b.m82635a(tXILiveRoomAudioFrame.audioData, 1, this.f57620k.m82633a(2), 2);
                }
            }
        }
        if (bArr != null) {
            if (this.f57599F < 0) {
                TXCLog.m82966e("TRTCAdapter-ext", "onRecordPcmData -> statistic error occurred, fix it. bytes = " + this.f57599F);
                this.f57599F = 0L;
            }
            this.f57599F += (long) bArr.length;
        }
        AtomicBoolean atomicBoolean = this.f57628s;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            return;
        }
        this.f57628s.set(false);
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.43
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = C13945a.this.f57601H.values().iterator();
                while (it.hasNext()) {
                    C13945a.super.playAudioEffect((TRTCCloudDef.TRTCAudioEffectParam) it.next());
                }
                C13945a.this.f57601H.clear();
            }
        });
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            TXCLog.m82969i("TRTCAdapter-ext", "Music onComplete: id-" + i + " code-" + i2);
            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f57613d;
            if (tXILiveRoomAudioDelegateAdapter != null) {
                if (i2 == 0) {
                    tXILiveRoomAudioDelegateAdapter.onMusicPlayFinish();
                } else {
                    tXILiveRoomAudioDelegateAdapter.onMusicPlayError(TXILiveRoomDefine.TXILiveRoomErrorMusicInvalid);
                }
            }
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.liteav.C14107d.a
    public void onEncVideo(TXSNALPacket tXSNALPacket) {
        super.onEncVideo(tXSNALPacket);
        if (tXSNALPacket == null || tXSNALPacket.nalData == null) {
            return;
        }
        C13953a.m82602a().m82610d();
        if (this.f57597D < 0) {
            TXCLog.m82966e("TRTCAdapter-ext", "onEncVideo -> statistic error occurred, fix it. bytes = " + this.f57597D);
            this.f57597D = 0L;
        }
        this.f57597D += (long) tXSNALPacket.nalData.length;
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onLocalProcessedAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onMixedPlayAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f57613d;
        if (tXILiveRoomAudioDelegateAdapter != null) {
            TXILiveRoomDefine.TXILiveRoomAudioFrame tXILiveRoomAudioFrame = new TXILiveRoomDefine.TXILiveRoomAudioFrame();
            tXILiveRoomAudioFrame.audioData = tRTCAudioFrame.data;
            tXILiveRoomAudioFrame.audioChannels = tRTCAudioFrame.channel;
            tXILiveRoomAudioFrame.audioSampleRate = tRTCAudioFrame.sampleRate;
            tXILiveRoomAudioFrame.timestamp = tRTCAudioFrame.timestamp;
            tXILiveRoomAudioDelegateAdapter.onPlaybackAudioFrame(tXILiveRoomAudioFrame);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i, long j, long j2) {
        if (i == Integer.MAX_VALUE) {
            this.f57608O = j2;
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.liteav.audio.InterfaceC13985f
    public void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3) {
        super.onRecordEncData(bArr, j, i, i2, i3);
        if (bArr != null) {
            if (this.f57598E < 0) {
                TXCLog.m82966e("TRTCAdapter-ext", "onRecordEncData -> statistic error occurred, fix it. bytes = " + this.f57598E);
                this.f57598E = 0L;
            }
            this.f57598E += (long) bArr.length;
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onRemoteUserAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, String str) {
        try {
            long j = Long.parseLong(str);
            if (j == this.f57618i) {
                this.f57620k.m82631a(tRTCAudioFrame.data);
            }
            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f57613d;
            if (tXILiveRoomAudioDelegateAdapter != null) {
                TXILiveRoomDefine.TXILiveRoomAudioFrame tXILiveRoomAudioFrame = new TXILiveRoomDefine.TXILiveRoomAudioFrame();
                tXILiveRoomAudioFrame.audioData = tRTCAudioFrame.data;
                tXILiveRoomAudioFrame.audioChannels = tRTCAudioFrame.channel;
                tXILiveRoomAudioFrame.audioSampleRate = tRTCAudioFrame.sampleRate;
                tXILiveRoomAudioFrame.timestamp = tRTCAudioFrame.timestamp;
                tXILiveRoomAudioDelegateAdapter.onPlayPcmData(j, tXILiveRoomAudioFrame);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener
    public void onRenderVideoFrame(String str, int i, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (i == 0) {
            TXILiveRoomVideoRenderDelegate tXILiveRoomVideoRenderDelegate = this.f57609P.get(str);
            if (tXILiveRoomVideoRenderDelegate != null && tRTCVideoFrame.bufferType == 2 && tRTCVideoFrame.pixelFormat == 1) {
                tXILiveRoomVideoRenderDelegate.onPreRenderBufferFrame(Long.valueOf(str).longValue(), tRTCVideoFrame.data, tRTCVideoFrame.width, tRTCVideoFrame.height);
            }
            try {
                long j = Long.parseLong(str);
                TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig = this.f57605L;
                if (tXILiveRoomLocalMixConfig != null && !tXILiveRoomLocalMixConfig.onlyMixAudio && j == this.f57618i && tRTCVideoFrame.pixelFormat == 1 && tRTCVideoFrame.bufferType == 1) {
                    ByteBuffer byteBuffer = tRTCVideoFrame.buffer;
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
                    byteBufferAllocateDirect.rewind();
                    byteBufferAllocateDirect.put(byteBuffer);
                    byteBufferAllocateDirect.rewind();
                    byteBufferAllocateDirect.flip();
                    C13949d c13949d = new C13949d();
                    c13949d.f57776a = byteBufferAllocateDirect;
                    c13949d.f57777b = tRTCVideoFrame.width;
                    c13949d.f57778c = tRTCVideoFrame.height;
                    this.f57619j = c13949d;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            TXCLog.m82969i("TRTCAdapter-ext", "Music onStart: id-" + i + " code-" + i2);
            this.f57608O = 0L;
            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f57613d;
            if (tXILiveRoomAudioDelegateAdapter != null) {
                if (i2 == 0) {
                    tXILiveRoomAudioDelegateAdapter.onMusicPlayBegin();
                } else {
                    tXILiveRoomAudioDelegateAdapter.onMusicPlayError(TXILiveRoomDefine.TXILiveRoomErrorMusicInvalid);
                }
            }
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onVideoQosChanged(final int i, final int i2, final int i3, final int i4, final int i5, int i6, int i7) {
        super.onVideoQosChanged(i, i2, i3, i4, i5, i6, i7);
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.40
            @Override // java.lang.Runnable
            public void run() {
                if (i == 2) {
                    C13945a c13945a = C13945a.this;
                    if (c13945a.f57610a != null) {
                        if (i5 != c13945a.f57594A || i4 != C13945a.this.f57635z) {
                            C13945a.this.f57594A = i5;
                            C13945a.this.f57635z = i4;
                            C13945a c13945a2 = C13945a.this;
                            c13945a2.f57612c.onRoomVideoQosChanged(c13945a2.f57610a.roomName, c13945a2.f57635z, C13945a.this.f57594A);
                        }
                        if (C13945a.this.f57595B == i2 && C13945a.this.f57596C == i3) {
                            return;
                        }
                        C13945a.this.f57595B = i2;
                        C13945a.this.f57596C = i3;
                        C13945a c13945a3 = C13945a.this;
                        c13945a3.f57612c.onEvent(c13945a3.f57610a.userId, 13008, "视频分辨率改变 w:" + i2 + " h:" + i3);
                    }
                }
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void pause() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.37
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.pauseBGM();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void pauseMusic() {
        getAudioEffectManager().pausePlayMusic(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void playEffectWithId(final int i, final String str, final boolean z, final boolean z2) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.21
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.f57615f.add(Integer.valueOf(i));
                TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam = new TRTCCloudDef.TRTCAudioEffectParam(i, str);
                tRTCAudioEffectParam.loopCount = z2 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 0;
                tRTCAudioEffectParam.publish = z;
                boolean z3 = C13945a.this.f57628s.get();
                C13945a c13945a = C13945a.this;
                if (z3) {
                    c13945a.f57601H.put(Integer.valueOf(i), tRTCAudioEffectParam);
                } else {
                    C13945a.super.playAudioEffect(tRTCAudioEffectParam);
                }
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void playMusicWithUrl(String str, boolean z, int i) {
        if (i == 0) {
            TXCLog.m82966e("TRTCAdapter-ext", "playMusicWithUrl: play music fail, times is zero.");
            return;
        }
        int i2 = i > 0 ? i - 1 : Integer.MAX_VALUE;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(Api.BaseClientBuilder.API_PRIORITY_OTHER, str);
        audioMusicParam.loopCount = i2;
        audioMusicParam.publish = !z;
        getAudioEffectManager().startPlayMusic(audioMusicParam);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void quitRoom() {
        runOnSDKThreadAndWaitDone(new Runnable() { // from class: com.tencent.iliveroom.a.a.23
            @Override // java.lang.Runnable
            public void run() {
                C13945a c13945a = C13945a.this;
                c13945a.f57621l = false;
                c13945a.f57616g = false;
                if (((TRTCCloudImpl) c13945a).mCaptureAndEnc != null) {
                    ((TRTCCloudImpl) C13945a.this).mCaptureAndEnc.m83487b(false);
                }
                C13945a.this.f57629t.m82585a(new Runnable() { // from class: com.tencent.iliveroom.a.a.23.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((TRTCCloudImpl) C13945a.this).mCaptureAndEnc != null) {
                            TXCLog.m82969i("TRTCAdapter-ext", "quitRoom -> runOnGLThread -> Release Processor And Encoder.");
                            ((TRTCCloudImpl) C13945a.this).mCaptureAndEnc.m83516p();
                        }
                    }
                });
                C13945a.this.f57623n.clear();
                C13945a.this.f57601H.clear();
                C13945a.this.f57609P.clear();
                C13945a.this.f57629t.m82588c();
                C13945a.super.stopBGM();
                C13945a.super.stopAllAudioEffects();
                C13945a.this.f57617h.clear();
                C13953a.m82602a().m82607b();
                C13945a.this.f57597D = 0L;
                C13945a.this.f57598E = 0L;
                C13945a.this.f57599F = 0L;
                C13945a.this.f57600G.m82582b();
            }
        }, 1000L);
        super.exitRoom();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void removeDelegate(TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        this.f57612c.m82641b(tXILiveRoomDelegateAdapter);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void resume() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.38
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.resumeBGM();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public boolean resumeMusic() {
        getAudioEffectManager().resumePlayMusic(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return true;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void runOnSDKThread(Runnable runnable) {
        super.runOnSDKThread(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int sendCustomVideoTexture(final int i, int i2, final int i3, final int i4, int i5, boolean z, Object obj) {
        C13945a c13945a;
        if (this.f57616g) {
            TXCLog.m82966e("TRTCAdapter-ext", "TRTCAdapter: send custom video texture ignore, block pusher is pushing.");
            return -3000;
        }
        TXILiveRoomDefine.TXILiveRoomConfig tXILiveRoomConfig = this.f57624o;
        if (tXILiveRoomConfig == null) {
            c13945a = this;
        } else {
            TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig = this.f57605L;
            if (tXILiveRoomLocalMixConfig != null && !tXILiveRoomLocalMixConfig.onlyMixAudio) {
                int i6 = this.f57633x;
                int i7 = tXILiveRoomLocalMixConfig.videoWidth;
                if (i6 == i7 && this.f57634y == tXILiveRoomLocalMixConfig.videoHeight) {
                    c13945a = this;
                } else {
                    this.f57633x = i7;
                    this.f57634y = tXILiveRoomLocalMixConfig.videoHeight;
                    c13945a = this;
                    c13945a.m82470a(0, this.f57633x, this.f57634y, tXILiveRoomConfig.videoFps, tXILiveRoomConfig.videoBitrate);
                }
            } else if (this.f57633x == i3 && this.f57634y == i4) {
                c13945a = this;
            } else {
                this.f57633x = i3;
                this.f57634y = i4;
                c13945a = this;
                c13945a.m82470a(0, this.f57633x, this.f57634y, tXILiveRoomConfig.videoFps, tXILiveRoomConfig.videoBitrate);
            }
        }
        if (c13945a.f57630u == Thread.currentThread().getId()) {
            if (obj != c13945a.f57631v) {
            }
            c13945a.f57631v = obj;
            c13945a.f57630u = Thread.currentThread().getId();
            if (obj != null) {
                return 1000;
            }
            GLES20.glFinish();
            c13945a.f57629t.m82585a(new Runnable() { // from class: com.tencent.iliveroom.a.a.2
                @Override // java.lang.Runnable
                public void run() {
                    List<TXILiveRoomDefine.TXILiveRoomLocalMixUser> list;
                    C13945a.this.f57607N.m82637a();
                    int iM82591a = i;
                    int i8 = i3;
                    int i9 = i4;
                    C13945a c13945a2 = C13945a.this;
                    C13949d c13949d = c13945a2.f57619j;
                    TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig2 = c13945a2.f57605L;
                    if (C13945a.this.f57604K != null && C13945a.this.f57618i != -1 && c13949d != null && tXILiveRoomLocalMixConfig2 != null && !tXILiveRoomLocalMixConfig2.onlyMixAudio && (list = tXILiveRoomLocalMixConfig2.mixUsers) != null && list.size() == 2) {
                        C13946a[] c13946aArr = new C13946a[2];
                        int i10 = 0;
                        for (TXILiveRoomDefine.TXILiveRoomLocalMixUser tXILiveRoomLocalMixUser : tXILiveRoomLocalMixConfig2.mixUsers) {
                            C13946a c13946a = new C13946a();
                            int i11 = tXILiveRoomLocalMixUser.height;
                            c13946a.f57766f = i11;
                            int i12 = tXILiveRoomLocalMixUser.width;
                            c13946a.f57765e = i12;
                            c13946a.f57767g = tXILiveRoomLocalMixUser.f57590x;
                            c13946a.f57768h = tXILiveRoomLocalMixUser.f57591y;
                            if (tXILiveRoomLocalMixUser.userId == C13945a.this.f57618i) {
                                c13946a.f57762b = c13949d.f57776a;
                                c13946a.f57763c = c13949d.f57777b;
                                c13946a.f57764d = c13949d.f57778c;
                            } else {
                                c13946a.f57761a = i;
                                c13946a.f57763c = i12;
                                c13946a.f57764d = i11;
                            }
                            c13946aArr[i10] = c13946a;
                            i10++;
                        }
                        i8 = tXILiveRoomLocalMixConfig2.videoWidth;
                        i9 = tXILiveRoomLocalMixConfig2.videoHeight;
                        iM82591a = C13945a.this.f57604K.m82591a(c13946aArr, i8, i9);
                    }
                    int i13 = iM82591a;
                    int i14 = i8;
                    int i15 = i9;
                    C14110g c14110gM83488c = ((TRTCCloudImpl) C13945a.this).mCaptureAndEnc.m83488c();
                    if (c14110gM83488c != null) {
                        if (i14 <= i15) {
                            c14110gM83488c.f59316l = 1;
                            c14110gM83488c.f59305a = i14;
                            c14110gM83488c.f59306b = i15;
                        } else {
                            c14110gM83488c.f59316l = 0;
                            c14110gM83488c.f59305a = i15;
                            c14110gM83488c.f59306b = i14;
                        }
                    }
                    ((TRTCCloudImpl) C13945a.this).mCaptureAndEnc.m83465a(i13, i14, i15, C13945a.this.f57631v, 0L);
                }
            });
            return 1000;
        }
        TXCLog.m82969i("TRTCAdapter-ext", "sendCustomVideoTexture -> eglcontext's thread change!");
        if (c13945a.f57631v != null) {
            c13945a.f57629t.m82586b(new Runnable() { // from class: com.tencent.iliveroom.a.a.47
                @Override // java.lang.Runnable
                public void run() {
                    if (((TRTCCloudImpl) C13945a.this).mCaptureAndEnc != null) {
                        TXCLog.m82969i("TRTCAdapter-ext", "sendCustomVideoTexture -> runOnGLThread -> Release Processor And Encoder.");
                        ((TRTCCloudImpl) C13945a.this).mCaptureAndEnc.m83516p();
                    }
                    if (C13945a.this.f57604K != null) {
                        TXCLog.m82969i("TRTCAdapter-ext", "sendCustomVideoTexture: video combiner release in gl thread.");
                        C13945a.this.f57604K.m82592a();
                    }
                }
            });
            c13945a.f57629t.m82588c();
        }
        if (!c13945a.f57629t.m82587b()) {
            c13945a.f57629t.m82583a();
        }
        if (obj != null) {
            c13945a.f57629t.m82584a(obj);
        }
        c13945a.f57629t.m82585a(new Runnable() { // from class: com.tencent.iliveroom.a.a.48
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.f57604K = new C13950e();
                TXCLog.m82969i("TRTCAdapter-ext", "sendCustomVideoTexture: video combiner create in gl thread.");
            }
        });
        TXCLog.m82969i("TRTCAdapter-ext", "sendCustomVideoTexture -> thread attach egl context finish.");
        c13945a.f57631v = obj;
        c13945a.f57630u = Thread.currentThread().getId();
        if (obj != null) {
            return 1000;
        }
        GLES20.glFinish();
        c13945a.f57629t.m82585a(new Runnable() { // from class: com.tencent.iliveroom.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                List<TXILiveRoomDefine.TXILiveRoomLocalMixUser> list;
                C13945a.this.f57607N.m82637a();
                int iM82591a = i;
                int i8 = i3;
                int i9 = i4;
                C13945a c13945a2 = C13945a.this;
                C13949d c13949d = c13945a2.f57619j;
                TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig2 = c13945a2.f57605L;
                if (C13945a.this.f57604K != null && C13945a.this.f57618i != -1 && c13949d != null && tXILiveRoomLocalMixConfig2 != null && !tXILiveRoomLocalMixConfig2.onlyMixAudio && (list = tXILiveRoomLocalMixConfig2.mixUsers) != null && list.size() == 2) {
                    C13946a[] c13946aArr = new C13946a[2];
                    int i10 = 0;
                    for (TXILiveRoomDefine.TXILiveRoomLocalMixUser tXILiveRoomLocalMixUser : tXILiveRoomLocalMixConfig2.mixUsers) {
                        C13946a c13946a = new C13946a();
                        int i11 = tXILiveRoomLocalMixUser.height;
                        c13946a.f57766f = i11;
                        int i12 = tXILiveRoomLocalMixUser.width;
                        c13946a.f57765e = i12;
                        c13946a.f57767g = tXILiveRoomLocalMixUser.f57590x;
                        c13946a.f57768h = tXILiveRoomLocalMixUser.f57591y;
                        if (tXILiveRoomLocalMixUser.userId == C13945a.this.f57618i) {
                            c13946a.f57762b = c13949d.f57776a;
                            c13946a.f57763c = c13949d.f57777b;
                            c13946a.f57764d = c13949d.f57778c;
                        } else {
                            c13946a.f57761a = i;
                            c13946a.f57763c = i12;
                            c13946a.f57764d = i11;
                        }
                        c13946aArr[i10] = c13946a;
                        i10++;
                    }
                    i8 = tXILiveRoomLocalMixConfig2.videoWidth;
                    i9 = tXILiveRoomLocalMixConfig2.videoHeight;
                    iM82591a = C13945a.this.f57604K.m82591a(c13946aArr, i8, i9);
                }
                int i13 = iM82591a;
                int i14 = i8;
                int i15 = i9;
                C14110g c14110gM83488c = ((TRTCCloudImpl) C13945a.this).mCaptureAndEnc.m83488c();
                if (c14110gM83488c != null) {
                    if (i14 <= i15) {
                        c14110gM83488c.f59316l = 1;
                        c14110gM83488c.f59305a = i14;
                        c14110gM83488c.f59306b = i15;
                    } else {
                        c14110gM83488c.f59316l = 0;
                        c14110gM83488c.f59305a = i15;
                        c14110gM83488c.f59306b = i14;
                    }
                }
                ((TRTCCloudImpl) C13945a.this).mCaptureAndEnc.m83465a(i13, i14, i15, C13945a.this.f57631v, 0L);
            }
        });
        return 1000;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public boolean sendMessageEx(byte[] bArr) {
        super.sendSEIMsg(bArr, 1);
        return true;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public boolean sendStreamMessage(int i, byte[] bArr, boolean z, boolean z2) {
        super.sendCustomCmdMsg(i, bArr, z, z2);
        return true;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioDelegate(final TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.45
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.f57613d = tXILiveRoomAudioDelegateAdapter;
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioExpandBlockThreshold(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.35
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.f57602I = i;
                ((TRTCCloudImpl) C13945a.this).mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.iliveroom.a.a.35.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        long j = userInfo.tinyID;
                    }
                });
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioExpandCountPerBlock(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.36
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.f57603J = i;
                ((TRTCCloudImpl) C13945a.this).mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.iliveroom.a.a.36.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        long j = userInfo.tinyID;
                    }
                });
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioMode(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.18
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                int i3 = 0;
                if (i2 != 0 && i2 == 1) {
                    i3 = 1;
                }
                C13945a.super.setAudioRoute(i3);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioVolumeIndication(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.17
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.enableAudioVolumeEvaluation(i);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setCustomVideoParam(TXILiveRoomDefine.TXILiveSize tXILiveSize, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.12
            @Override // java.lang.Runnable
            public void run() {
                if (C13945a.this.f57624o != null) {
                    C13945a.this.f57624o.videoBitrate = i;
                    C13945a c13945a = C13945a.this;
                    c13945a.m82470a(0, c13945a.f57633x, C13945a.this.f57634y, C13945a.this.f57624o.videoFps, C13945a.this.f57624o.videoBitrate);
                }
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setEffectsVolume(final double d) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.25
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.setAllAudioEffectsVolume((int) (d * 100.0d));
                Iterator it = C13945a.this.f57601H.values().iterator();
                while (it.hasNext()) {
                    ((TRTCCloudDef.TRTCAudioEffectParam) it.next()).volume = (int) (d * 100.0d);
                }
            }
        });
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setLocalMixConfig(final TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.32
            @Override // java.lang.Runnable
            public void run() {
                List<TXILiveRoomDefine.TXILiveRoomLocalMixUser> list;
                StringBuilder sb = new StringBuilder("set local mix config:");
                TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig2 = tXILiveRoomLocalMixConfig;
                sb.append(tXILiveRoomLocalMixConfig2 != null ? tXILiveRoomLocalMixConfig2.toString() : "null");
                Monitor.m82978a(1, sb.toString(), "", 0);
                TXCLog.m82969i("TRTCAdapter-ext", "TRTCAdapter: set local mix config:" + tXILiveRoomLocalMixConfig);
                TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig3 = tXILiveRoomLocalMixConfig;
                if (tXILiveRoomLocalMixConfig3 == null || (list = tXILiveRoomLocalMixConfig3.mixUsers) == null || list.size() != 2) {
                    TXCLog.m82966e("TRTCAdapter-ext", "TRTCAdapter: set local mix config fail.");
                    return;
                }
                long j = C13945a.this.f57610a.userId;
                Iterator<TXILiveRoomDefine.TXILiveRoomLocalMixUser> it = tXILiveRoomLocalMixConfig.mixUsers.iterator();
                while (it.hasNext()) {
                    long j2 = it.next().userId;
                    if (j2 != j) {
                        C13945a.this.f57618i = j2;
                        break;
                    }
                }
                C13945a.this.f57620k.m82634b();
                if (C13945a.this.f57618i == -1) {
                    TXCLog.m82966e("TRTCAdapter-ext", "TRTCAdapter: set local mix config fail. can't find target user id.");
                    return;
                }
                TXCLog.m82969i("TRTCAdapter-ext", "TRTCAdapter: set local mix config success.");
                C13945a.this.f57605L = tXILiveRoomLocalMixConfig;
                if (tXILiveRoomLocalMixConfig.onlyMixAudio) {
                    TXCLog.m82969i("TRTCAdapter-ext", "TRTCAdapter: set local mix config, is pure mode, not need set video render listener.");
                    return;
                }
                C13945a.super.setRemoteVideoRenderListener(C13945a.this.f57618i + "", 1, 1, C13945a.this);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setLogPath(String str) {
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setMicVolume(float f) {
        getAudioEffectManager().setVoiceCaptureVolume((int) (f * 100.0f));
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setMixTranscodingConfig(final TXILiveRoomDefine.TXILiveRoomTranscodingConfig tXILiveRoomTranscodingConfig) {
        final TXILiveRoomDefine.TXILiveRoomTranscodingConfig tXILiveRoomTranscodingConfig2 = tXILiveRoomTranscodingConfig != null ? new TXILiveRoomDefine.TXILiveRoomTranscodingConfig(tXILiveRoomTranscodingConfig) : null;
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.30
            @Override // java.lang.Runnable
            public void run() {
                TXILiveRoomDefine.TXILiveRoomTranscodingConfig tXILiveRoomTranscodingConfig3 = tXILiveRoomTranscodingConfig2;
                C13945a c13945a = C13945a.this;
                if (tXILiveRoomTranscodingConfig3 == null) {
                    c13945a.apiLog("setMixTranscodingConfig: set null config.");
                    C13945a c13945a2 = C13945a.this;
                    C13945a.super.nativeSetMixTranscodingConfig(((TRTCCloudImpl) c13945a2).mNativeRtcContext, null);
                    return;
                }
                if (c13945a.f57610a == null) {
                    c13945a.apiLog("setMixTranscodingConfig: room params is null, ignore mix config.");
                    return;
                }
                c13945a.apiLog("setMixTranscodingConfig: set mix config");
                TXILiveRoomDefine.TXILiveRoomTranscodingConfig tXILiveRoomTranscodingConfig4 = tXILiveRoomTranscodingConfig2;
                String str = tXILiveRoomTranscodingConfig4.backgroundPicUrl;
                if (str == null) {
                    str = "";
                }
                String str2 = tXILiveRoomTranscodingConfig4.mixExtraInfo;
                if (str2 == null) {
                    str2 = "";
                }
                TRTCTranscodingConfigInner tRTCTranscodingConfigInner = new TRTCTranscodingConfigInner();
                OneSecAdapterParams oneSecAdapterParams = C13945a.this.f57610a;
                tRTCTranscodingConfigInner.appId = oneSecAdapterParams.appId;
                tRTCTranscodingConfigInner.bizId = oneSecAdapterParams.bizId;
                int i = 1;
                tRTCTranscodingConfigInner.mode = 1;
                TXILiveRoomDefine.TXILiveRoomTranscodingConfig tXILiveRoomTranscodingConfig5 = tXILiveRoomTranscodingConfig2;
                tRTCTranscodingConfigInner.videoWidth = tXILiveRoomTranscodingConfig5.videoWidth;
                tRTCTranscodingConfigInner.videoHeight = tXILiveRoomTranscodingConfig5.videoHeight;
                tRTCTranscodingConfigInner.videoBitrate = tXILiveRoomTranscodingConfig5.videoBitrate;
                tRTCTranscodingConfigInner.videoFramerate = tXILiveRoomTranscodingConfig5.videoFramerate;
                tRTCTranscodingConfigInner.videoGOP = tXILiveRoomTranscodingConfig5.videoGOP;
                tRTCTranscodingConfigInner.videoCodecType = tXILiveRoomTranscodingConfig5.videoCodecType;
                tRTCTranscodingConfigInner.enableBFrame = tXILiveRoomTranscodingConfig5.enableBFrame;
                tRTCTranscodingConfigInner.audioSampleRate = tXILiveRoomTranscodingConfig5.audioSampleRate;
                tRTCTranscodingConfigInner.audioBitrate = tXILiveRoomTranscodingConfig5.audioBitrate;
                tRTCTranscodingConfigInner.audioChannels = tXILiveRoomTranscodingConfig5.audioChannels;
                tRTCTranscodingConfigInner.mixExtraInfo = str2;
                tRTCTranscodingConfigInner.backgroundURL = str;
                tRTCTranscodingConfigInner.mixUsers = new ArrayList<>();
                if (tXILiveRoomTranscodingConfig.videoCodecType == 2) {
                    if (TextUtils.isEmpty(C13945a.this.f57606M)) {
                        C13945a c13945a3 = C13945a.this;
                        OneSecAdapterParams oneSecAdapterParams2 = c13945a3.f57610a;
                        c13945a3.f57606M = c13945a3.m82494b(oneSecAdapterParams2.bizId, oneSecAdapterParams2.sdkAppId, oneSecAdapterParams2.roomName, oneSecAdapterParams2.userId);
                    }
                    tRTCTranscodingConfigInner.streamId = C13945a.this.f57606M;
                }
                if (tXILiveRoomTranscodingConfig2.mixUsers != null) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<TXILiveRoomDefine.TXILiveRoomMixUser> it = tXILiveRoomTranscodingConfig2.mixUsers.iterator();
                    while (it.hasNext()) {
                        TXILiveRoomDefine.TXILiveRoomMixUser next = it.next();
                        if (next != null) {
                            TRTCTranscodingConfigInner.TRTCMixUserInner tRTCMixUserInner = new TRTCTranscodingConfigInner.TRTCMixUserInner(next.userId + "", next.f57592x, next.f57593y, next.width, next.height, next.zOrder);
                            tRTCMixUserInner.roomId = next.roomId;
                            sb.append("mixUserId:");
                            sb.append(next.userId);
                            sb.append(",roomId:");
                            sb.append(next.roomId);
                            if (tRTCMixUserInner.width != 0 || tRTCMixUserInner.height != 0) {
                                if (next.isMuteAudio) {
                                    tRTCMixUserInner.inputType = 2;
                                } else {
                                    tRTCMixUserInner.inputType = i;
                                }
                                C13945a c13945a4 = C13945a.this;
                                OneSecAdapterParams oneSecAdapterParams3 = c13945a4.f57610a;
                                tRTCMixUserInner.streamId = c13945a4.m82467a(oneSecAdapterParams3.bizId, oneSecAdapterParams3.sdkAppId, next.roomId, next.userId);
                                tRTCTranscodingConfigInner.mixUsers.add(tRTCMixUserInner);
                            } else if (next.isMuteAudio) {
                                sb.append(",isMute:");
                                sb.append(next.isMuteAudio);
                            } else {
                                tRTCMixUserInner.inputType = 3;
                                C13945a c13945a5 = C13945a.this;
                                OneSecAdapterParams oneSecAdapterParams4 = c13945a5.f57610a;
                                tRTCMixUserInner.streamId = c13945a5.m82467a(oneSecAdapterParams4.bizId, oneSecAdapterParams4.sdkAppId, next.roomId, next.userId);
                                tRTCTranscodingConfigInner.mixUsers.add(tRTCMixUserInner);
                            }
                        }
                        it = it;
                        i = 1;
                    }
                    Monitor.m82978a(2, "setMixTranscodingConfig", sb.toString(), 0);
                }
                C13945a c13945a6 = C13945a.this;
                C13945a.super.nativeSetMixTranscodingConfig(((TRTCCloudImpl) c13945a6).mNativeRtcContext, tRTCTranscodingConfigInner);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setMusicPitch(int i) {
        getAudioEffectManager().setMusicPitch(Api.BaseClientBuilder.API_PRIORITY_OTHER, i / 12.0f);
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setMusicPosition(int i) {
        getAudioEffectManager().seekMusicToPosInMS(Api.BaseClientBuilder.API_PRIORITY_OTHER, i);
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setMusicVolume(float f) {
        int i = (int) (f * 100.0f);
        getAudioEffectManager().setMusicPlayoutVolume(Api.BaseClientBuilder.API_PRIORITY_OTHER, i);
        getAudioEffectManager().setMusicPublishVolume(Api.BaseClientBuilder.API_PRIORITY_OTHER, i);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setPlaybackVolume(final float f) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.20
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.setAudioPlayoutVolume((int) (f * 100.0f));
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public int setPriorRemoteVideoStreamType(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.10
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                C13945a c13945a = C13945a.this;
                if (i2 == 0) {
                    C13945a.super.setPriorRemoteVideoStreamType(0);
                } else {
                    C13945a.super.setPriorRemoteVideoStreamType(1);
                }
            }
        });
        return 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public int setRemoteVideoStreamType(final String str, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.11
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                C13945a c13945a = C13945a.this;
                if (i2 == 0) {
                    C13945a.super.setRemoteVideoStreamType(str, 0);
                } else {
                    C13945a.super.setRemoteVideoStreamType(str, 1);
                }
            }
        });
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setSurfaceSize(long j, int i, int i2) {
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setVideoRenderDelegate(final long j, final TXILiveRoomVideoRenderDelegate tXILiveRoomVideoRenderDelegate) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.9
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.f57609P.put(String.valueOf(j), tXILiveRoomVideoRenderDelegate);
                C13945a.super.setRemoteVideoRenderListener(String.valueOf(j), 1, 2, C13945a.this);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setVolumeOfEffect(final int i, final double d) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.26
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.setAudioEffectVolume(i, (int) (d * 100.0d));
                TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam = (TRTCCloudDef.TRTCAudioEffectParam) C13945a.this.f57601H.get(Integer.valueOf(i));
                if (tRTCAudioEffectParam != null) {
                    tRTCAudioEffectParam.volume = (int) (d * 100.0d);
                }
            }
        });
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setVolumeType(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.19
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                C13945a c13945a = C13945a.this;
                if (i2 == 0) {
                    C13945a.super.setSystemVolumeType(0);
                } else {
                    C13945a.super.setSystemVolumeType(1);
                }
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void startPublishCDNStream(final String str) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.m82966e("TRTCAdapter-ext", "startPublishCDNStream -> error!!! cdn url is null.");
        } else {
            runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.28
                @Override // java.lang.Runnable
                public void run() {
                    C13959c.m82636a(true, str);
                    C13945a c13945a = C13945a.this;
                    OneSecAdapterParams oneSecAdapterParams = c13945a.f57610a;
                    String str2 = str;
                    if (oneSecAdapterParams == null) {
                        c13945a.f57625p = str2;
                    } else {
                        c13945a.m82486a(str2, c13945a.f57606M);
                    }
                }
            });
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void startRemoteRender(final long j, final SurfaceView surfaceView) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.3
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.startRemoteView(j + "", null);
                if (surfaceView == null) {
                    return;
                }
                if (C13945a.this.f57623n.containsKey(Long.valueOf(j))) {
                    ((a) C13945a.this.f57623n.remove(Long.valueOf(j))).m82578b();
                }
                SurfaceHolder holder = surfaceView.getHolder();
                if (holder.getSurface().isValid()) {
                    C13945a.super.setRemoteSurface(j + "", 0, holder.getSurface());
                    C13945a.super.setRemoteSurfaceSize(j + "", 0, holder.getSurfaceFrame().width(), holder.getSurfaceFrame().height());
                }
                C13945a.this.f57623n.put(Long.valueOf(j), C13945a.this.new a(j, surfaceView));
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopAllEffect() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.24
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.stopAllAudioEffects();
                C13945a.this.f57601H.clear();
                final ArrayList arrayList = new ArrayList(C13945a.this.f57615f);
                if (arrayList.size() != 0) {
                    C13945a.this.runOnMainThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.24.1
                        @Override // java.lang.Runnable
                        public void run() {
                            for (Integer num : arrayList) {
                                TXCLog.m82969i("TRTCAdapter-ext", "TRTCAdapter: callback finish when stop all effects, id:" + num);
                                TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = C13945a.this.f57613d;
                                if (tXILiveRoomAudioDelegateAdapter != null) {
                                    tXILiveRoomAudioDelegateAdapter.onEffectPlayFinish(num.intValue());
                                }
                            }
                        }
                    });
                }
                C13945a.this.f57615f.clear();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopAllRemoteRender() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.6
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = C13945a.this.f57623n.values().iterator();
                while (it.hasNext()) {
                    ((a) it.next()).m82578b();
                }
                C13945a.this.f57623n.clear();
                C13945a.this.f57617h.clear();
                C13945a.super.stopAllRemoteView();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopEffectWithId(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.22
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.stopAudioEffect(i);
                C13945a.this.f57601H.remove(Integer.valueOf(i));
                if (C13945a.this.f57615f.remove(Integer.valueOf(i))) {
                    C13945a.this.runOnMainThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.22.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TXCLog.m82969i("TRTCAdapter-ext", "TRTCAdapter: callback finish when stop effect, id:" + i);
                            AnonymousClass22 anonymousClass22 = AnonymousClass22.this;
                            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = C13945a.this.f57613d;
                            if (tXILiveRoomAudioDelegateAdapter != null) {
                                tXILiveRoomAudioDelegateAdapter.onEffectPlayFinish(i);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopMusic() {
        getAudioEffectManager().stopPlayMusic(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void stopPublishCDNStream() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.29
            @Override // java.lang.Runnable
            public void run() {
                C13959c.m82636a(false, null);
                C13945a.this.f57625p = "";
                C13945a.super.stopPublishCDNStream();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopRemoteRender(final long j) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.5
            @Override // java.lang.Runnable
            public void run() {
                C13945a.this.f57617h.remove(Long.valueOf(j));
                C13945a.super.stopRemoteView(j + "");
                a aVar = (a) C13945a.this.f57623n.remove(Long.valueOf(j));
                if (aVar != null) {
                    aVar.m82578b();
                }
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void switchRole(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.44
            @Override // java.lang.Runnable
            public void run() {
                if (i == 1 && C13945a.this.f57611b) {
                    TXCLog.m82966e("TRTCAdapter-ext", "switchRole -> ignore, already is broadcaster.");
                    return;
                }
                C13945a.this.f57594A = 0;
                C13945a.this.f57635z = 0;
                C13945a.this.f57596C = 0;
                C13945a.this.f57595B = 0;
                C13945a c13945a = C13945a.this;
                boolean z = i == 1;
                c13945a.f57611b = z;
                if (z) {
                    c13945a.m82512c();
                    C13945a c13945a2 = C13945a.this;
                    C13945a.super.muteLocalAudio(c13945a2.f57626q);
                    C13945a c13945a3 = C13945a.this;
                    C13945a.super.muteLocalVideo(c13945a3.f57627r);
                } else {
                    c13945a.m82519d();
                    C13945a.super.muteLocalAudio(true);
                    C13945a.super.muteLocalVideo(true);
                }
                C13945a c13945a4 = C13945a.this;
                C13945a.super.switchRole(c13945a4.f57611b ? 20 : 21);
                C13953a.m82602a().m82604a(i);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void startRemoteRender(final long j, final TextureView textureView) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.4
            @Override // java.lang.Runnable
            public void run() {
                C13945a.super.startRemoteView(j + "", null);
                if (textureView == null) {
                    return;
                }
                if (C13945a.this.f57623n.containsKey(Long.valueOf(j))) {
                    ((a) C13945a.this.f57623n.remove(Long.valueOf(j))).m82578b();
                }
                a aVar = C13945a.this.new a(j, textureView);
                C13945a.this.f57623n.put(Long.valueOf(j), aVar);
                if (aVar.m82577a() != null) {
                    C13945a.super.setRemoteSurface(j + "", 0, aVar.m82577a());
                    C13945a.super.setRemoteSurfaceSize(j + "", 0, textureView.getWidth(), textureView.getHeight());
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.tencent.iliveroom.a.a$b */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<C13945a> f57756a;

        /* JADX INFO: renamed from: b */
        private boolean f57757b = false;

        public b(C13945a c13945a) {
            this.f57756a = new WeakReference<>(c13945a);
        }

        /* JADX INFO: renamed from: a */
        public void m82581a() {
            final C13945a c13945a = this.f57756a.get();
            if (c13945a != null) {
                c13945a.runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (b.this.f57757b) {
                            return;
                        }
                        TXCLog.m82969i("TRTCAdapter-ext", "TRTCAdapter: start timer task.");
                        b.this.f57757b = true;
                        ((TRTCCloudImpl) c13945a).mSDKHandler.post(b.this);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public void m82582b() {
            C13945a c13945a = this.f57756a.get();
            if (c13945a != null) {
                c13945a.runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f57757b = false;
                        TXCLog.m82969i("TRTCAdapter-ext", "TRTCAdapter: stop timer task.");
                    }
                });
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C13945a c13945a = this.f57756a.get();
            if (c13945a == null) {
                TXCLog.m82966e("TRTCAdapter-ext", "TRTCAdapter: adapter is null in timer task, timer task is stop.");
                this.f57757b = false;
                return;
            }
            C13954b.m82612a(2, c13945a.f57597D);
            C13954b.m82612a(0, c13945a.f57599F);
            C13954b.m82612a(1, c13945a.f57598E);
            if (this.f57757b) {
                ((TRTCCloudImpl) c13945a).mSDKHandler.postDelayed(this, 1000L);
            } else {
                TXCLog.m82966e("TRTCAdapter-ext", "TRTCAdapter: timer task is stop. give up to delay task.");
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.iliveroom.a.a$a */
    public class a implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: b */
        private long f57752b;

        /* JADX INFO: renamed from: c */
        private WeakReference<TextureView> f57753c;

        /* JADX INFO: renamed from: d */
        private WeakReference<SurfaceView> f57754d;

        /* JADX INFO: renamed from: e */
        private Surface f57755e;

        public a(long j, TextureView textureView) {
            this.f57753c = new WeakReference<>(textureView);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture != null) {
                TXCLog.m82969i("TRTCAdapter-ext", "start textureview userId=" + this.f57752b + ",surfaceTexture=" + surfaceTexture);
                this.f57755e = new Surface(textureView.getSurfaceTexture());
            }
            textureView.setSurfaceTextureListener(this);
            this.f57752b = j;
        }

        /* JADX INFO: renamed from: a */
        public Surface m82577a() {
            return this.f57755e;
        }

        /* JADX INFO: renamed from: b */
        public void m82578b() {
            SurfaceView surfaceView;
            TextureView textureView;
            if (this.f57755e != null) {
                C13945a.super.setRemoteSurface(this.f57752b + "", 0, null);
                this.f57755e.release();
                this.f57755e = null;
            }
            WeakReference<TextureView> weakReference = this.f57753c;
            if (weakReference != null && (textureView = weakReference.get()) != null) {
                textureView.setSurfaceTextureListener(null);
            }
            WeakReference<SurfaceView> weakReference2 = this.f57754d;
            if (weakReference2 == null || (surfaceView = weakReference2.get()) == null) {
                return;
            }
            surfaceView.getHolder().removeCallback(this);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            TXCLog.m82969i("TRTCAdapter-ext", "onSurfaceTextureAvailable userId=" + this.f57752b + ",size=" + i + BaseSei.f13930X + i2 + ",texture=" + surfaceTexture);
            this.f57755e = new Surface(surfaceTexture);
            C13945a c13945a = C13945a.this;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57752b);
            sb.append("");
            C13945a.super.setRemoteSurface(sb.toString(), 0, this.f57755e);
            C13945a.super.setRemoteSurfaceSize(this.f57752b + "", 0, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            TXCLog.m82969i("TRTCAdapter-ext", "onSurfaceTextureDestroyed userId=" + this.f57752b + ",texture=" + surfaceTexture);
            C13945a.super.setRemoteSurface(this.f57752b + "", 0, null);
            Surface surface = this.f57755e;
            if (surface == null) {
                return true;
            }
            surface.release();
            this.f57755e = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            TXCLog.m82969i("TRTCAdapter-ext", "onSurfaceTextureSizeChanged userId=" + this.f57752b + ",size=" + i + BaseSei.f13930X + i2 + ",texture=" + surfaceTexture);
            C13945a c13945a = C13945a.this;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57752b);
            sb.append("");
            C13945a.super.setRemoteSurfaceSize(sb.toString(), 0, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            TXCLog.m82969i("TRTCAdapter-ext", "surfaceChanged userId=" + this.f57752b + ",size=" + i2 + BaseSei.f13930X + i3 + ",surface=" + surfaceHolder.getSurface());
            if (this.f57755e != surfaceHolder.getSurface()) {
                this.f57755e = surfaceHolder.getSurface();
                C13945a.super.setRemoteSurface(this.f57752b + "", 0, this.f57755e);
            }
            C13945a.super.setRemoteSurfaceSize(this.f57752b + "", 0, i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (surfaceHolder.getSurface().isValid()) {
                this.f57755e = surfaceHolder.getSurface();
                C13945a.super.setRemoteSurface(this.f57752b + "", 0, this.f57755e);
                TXCLog.m82969i("TRTCAdapter-ext", "surfaceCreated userId=" + this.f57752b + ",surface=" + this.f57755e);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            TXCLog.m82969i("TRTCAdapter-ext", "surfaceDestroyed userId=" + this.f57752b + ",surface=" + surfaceHolder.getSurface());
            C13945a.super.setRemoteSurface(this.f57752b + "", 0, null);
            this.f57755e = null;
        }

        public a(long j, SurfaceView surfaceView) {
            this.f57752b = j;
            this.f57754d = new WeakReference<>(surfaceView);
            if (!surfaceView.getHolder().getSurface().isValid()) {
                this.f57755e = surfaceView.getHolder().getSurface();
            }
            surfaceView.getHolder().addCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m82494b(int i, long j, String str, long j2) {
        if (i != 35476 && i != 113120) {
            return i + "_" + TXCCommonUtil.getMD5(str + "_" + j2 + "_H265");
        }
        return i + "_" + TXCCommonUtil.getMD5(j + "_" + str + "_" + j2 + "_H265");
    }

    /* JADX INFO: renamed from: a */
    public TRTCRoomInfo m82576a() {
        return this.mRoomInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82486a(String str, String str2) {
        if (this.f57610a != null) {
            TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam = new TRTCCloudDef.TRTCPublishCDNParam();
            OneSecAdapterParams oneSecAdapterParams = this.f57610a;
            tRTCPublishCDNParam.appId = oneSecAdapterParams.appId;
            tRTCPublishCDNParam.bizId = oneSecAdapterParams.bizId;
            tRTCPublishCDNParam.url = str;
            tRTCPublishCDNParam.streamId = str2;
            super.startPublishCDNStream(tRTCPublishCDNParam);
            this.f57625p = null;
            return;
        }
        TXCLog.m82966e("TRTCAdapter-ext", "startPublishCDNStreamInner -> error! room params is null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m82467a(int i, long j, String str, long j2) {
        if (i != 35476 && i != 113120) {
            return i + "_" + TXCCommonUtil.getMD5(str + "_" + j2 + "_main");
        }
        return i + "_" + TXCCommonUtil.getMD5(j + "_" + str + "_" + j2 + "_main");
    }
}
