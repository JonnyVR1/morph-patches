package com.tencent.iliveroom.p085a;

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
import com.tencent.iliveroom.p085a.p086a.C14109a;
import com.tencent.iliveroom.p085a.p086a.C14110b;
import com.tencent.iliveroom.p085a.p086a.C14112d;
import com.tencent.iliveroom.p085a.p086a.C14113e;
import com.tencent.iliveroom.p085a.p087b.C14116a;
import com.tencent.iliveroom.p085a.p087b.C14117b;
import com.tencent.iliveroom.p085a.p088c.C14120a;
import com.tencent.iliveroom.p085a.p088c.C14121b;
import com.tencent.iliveroom.p085a.p088c.C14122c;
import com.tencent.iliveroom.p085a.p088c.C14123d;
import com.tencent.iliveroom.p085a.p088c.C14124e;
import com.tencent.liteav.C14273g;
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
/* JADX INFO: loaded from: classes12.dex */
public class C14108a extends TRTCCloudImpl implements IOneSecAdapter, TXAudioEffectManager.TXMusicPlayObserver, TRTCCloudListener.TRTCAudioFrameListener, TRTCCloudListener.TRTCVideoRenderListener {

    /* JADX INFO: renamed from: A */
    private int f58442A;

    /* JADX INFO: renamed from: B */
    private int f58443B;

    /* JADX INFO: renamed from: C */
    private int f58444C;

    /* JADX INFO: renamed from: D */
    private long f58445D;

    /* JADX INFO: renamed from: E */
    private long f58446E;

    /* JADX INFO: renamed from: F */
    private long f58447F;

    /* JADX INFO: renamed from: G */
    private b f58448G;

    /* JADX INFO: renamed from: H */
    private Map<Integer, TRTCCloudDef.TRTCAudioEffectParam> f58449H;

    /* JADX INFO: renamed from: I */
    private int f58450I;

    /* JADX INFO: renamed from: J */
    private int f58451J;

    /* JADX INFO: renamed from: K */
    private C14113e f58452K;

    /* JADX INFO: renamed from: L */
    private TXILiveRoomDefine.TXILiveRoomLocalMixConfig f58453L;

    /* JADX INFO: renamed from: M */
    private String f58454M;

    /* JADX INFO: renamed from: N */
    private C14123d f58455N;

    /* JADX INFO: renamed from: O */
    private long f58456O;

    /* JADX INFO: renamed from: P */
    private Map<String, TXILiveRoomVideoRenderDelegate> f58457P;

    /* JADX INFO: renamed from: a */
    protected OneSecAdapterParams f58458a;

    /* JADX INFO: renamed from: b */
    protected boolean f58459b;

    /* JADX INFO: renamed from: c */
    protected C14124e f58460c;

    /* JADX INFO: renamed from: d */
    protected TXILiveRoomAudioDelegateAdapter f58461d;

    /* JADX INFO: renamed from: e */
    protected C14119c f58462e;

    /* JADX INFO: renamed from: f */
    protected Set<Integer> f58463f;

    /* JADX INFO: renamed from: g */
    protected boolean f58464g;

    /* JADX INFO: renamed from: h */
    protected Set<Long> f58465h;

    /* JADX INFO: renamed from: i */
    protected long f58466i;

    /* JADX INFO: renamed from: j */
    protected C14112d f58467j;

    /* JADX INFO: renamed from: k */
    protected C14120a f58468k;

    /* JADX INFO: renamed from: l */
    protected boolean f58469l;

    /* JADX INFO: renamed from: m */
    private Context f58470m;

    /* JADX INFO: renamed from: n */
    private Map<Long, a> f58471n;

    /* JADX INFO: renamed from: o */
    private TXILiveRoomDefine.TXILiveRoomConfig f58472o;

    /* JADX INFO: renamed from: p */
    private String f58473p;

    /* JADX INFO: renamed from: q */
    private boolean f58474q;

    /* JADX INFO: renamed from: r */
    private boolean f58475r;

    /* JADX INFO: renamed from: s */
    private AtomicBoolean f58476s;

    /* JADX INFO: renamed from: t */
    private C14110b f58477t;

    /* JADX INFO: renamed from: u */
    private long f58478u;

    /* JADX INFO: renamed from: v */
    private Object f58479v;

    /* JADX INFO: renamed from: w */
    private C14115b f58480w;

    /* JADX INFO: renamed from: x */
    private int f58481x;

    /* JADX INFO: renamed from: y */
    private int f58482y;

    /* JADX INFO: renamed from: z */
    private int f58483z;

    public C14108a(Context context, TXILiveRoomDefine.TXILiveConfig tXILiveConfig, TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        super(context);
        this.f58455N = new C14123d();
        this.f58470m = context.getApplicationContext();
        super.setAudioFrameListener(this);
        C14273g.a aVar = this.mRoomInfo.bigEncSize;
        aVar.f60180a = 0;
        aVar.f60181b = 0;
        C14273g c14273g = this.mConfig;
        c14273g.f60153a = 0;
        c14273g.f60154b = 0;
        c14273g.f60160h = 15;
        c14273g.f60162j = 1;
        this.mCaptureAndEnc.m84661a(c14273g);
        this.mCaptureAndEnc.m84682f(false);
        this.f58477t = new C14110b();
        this.f58476s = new AtomicBoolean(false);
        this.f58460c = new C14124e();
        this.f58480w = new C14115b(this);
        this.f58462e = new C14119c(this);
        this.f58460c.m83823a(tXILiveRoomDelegateAdapter);
        super.setListener(this.f58480w);
        super.setGSensorMode(0);
        super.setVideoEncoderMirror(true);
        super.setVideoEncoderRotation(2);
        this.f58449H = new HashMap();
        this.f58471n = new HashMap();
        this.f58457P = new HashMap();
        this.f58463f = new HashSet();
        this.f58465h = new HashSet();
        this.f58448G = new b(this);
        this.f58466i = -1L;
        this.f58468k = new C14120a(5);
        getAudioEffectManager().setMusicObserver(Api.BaseClientBuilder.API_PRIORITY_OTHER, this);
        TXCAudioEngine.getInstance().setPlayoutDataCallbackFormat(44100, 2, 512);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83653a(int i, int i2, int i3, int i4, int i5) {
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            TXCLog.m84149e("TRTCAdapter-ext", "setVideoEncParamsInner -> fail. type:" + i + " width:" + i2 + " height:" + i3 + " fps:" + i4 + " bitrate:" + i5);
            return;
        }
        if (i == 1) {
            super.enableEncSmallVideoStream(true, null);
        }
        TXCLog.m84152i("TRTCAdapter-ext", "setVideoEncParamsInner -> setEncParams type:" + i + " width:" + i2 + " height:" + i3 + " fps:" + i4 + " bitrate:" + i5);
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
            TXCLog.m84150e("TRTCAdapter-ext", "build json object failed.", e);
        }
        super.callExperimentalAPI(jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m83679b() {
        TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam = new TRTCCloudDef.TRTCNetworkQosParam();
        tRTCNetworkQosParam.preference = 2;
        tRTCNetworkQosParam.controlMode = 1;
        super.setNetworkQosParam(tRTCNetworkQosParam);
        if (!TextUtils.isEmpty(this.f58473p)) {
            m83669a(this.f58473p, this.f58454M);
        }
        this.f58459b = this.f58458a.roomRole == 1;
        TRTCCloudDef.TRTCParams tRTCParams = new TRTCCloudDef.TRTCParams();
        tRTCParams.sdkAppId = (int) this.f58458a.sdkAppId;
        tRTCParams.userId = this.f58458a.userId + "";
        OneSecAdapterParams oneSecAdapterParams = this.f58458a;
        tRTCParams.role = oneSecAdapterParams.roomRole == 1 ? 20 : 21;
        tRTCParams.userSig = oneSecAdapterParams.userSig;
        byte[] bArr = oneSecAdapterParams.privateMapKey;
        if (bArr != null) {
            tRTCParams.privateMapKey = new String(bArr);
        }
        tRTCParams.roomId = -1;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("strGroupId", this.f58458a.roomName);
            jSONObject.put("Role", 0);
            if (this.f58458a.sdkAppId != 1400154900) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("pure_audio_push_mod", 1);
                jSONObject.put("Str_uc_params", jSONObject2);
            }
        } catch (JSONException e) {
            TXCLog.m84150e("TRTCAdapter-ext", "build json failed.", e);
        }
        tRTCParams.businessInfo = jSONObject.toString();
        super.enterRoom(tRTCParams, 1);
        if (this.f58459b) {
            m83695c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m83695c() {
        C14108a c14108a;
        super.enableCustomVideoCapture(true);
        this.f58476s.set(true);
        TXILiveRoomDefine.TXILiveRoomConfig tXILiveRoomConfig = this.f58472o;
        if (tXILiveRoomConfig != null) {
            c14108a = this;
            c14108a.m83653a(0, this.f58481x, this.f58482y, tXILiveRoomConfig.videoFps, tXILiveRoomConfig.videoBitrate);
        } else {
            c14108a = this;
        }
        super.setAudioFrameListener(c14108a);
        if (c14108a.f58472o.audioEncQuality == 3) {
            TXCLog.m84152i("TRTCAdapter-ext", "startPublish: enable high audio quality.");
            super.setAudioQuality(3);
            TXCAudioEngine.getInstance().setCaptureDataCallbackFormat(44100, 2, 512);
        } else {
            TXCLog.m84152i("TRTCAdapter-ext", "startPublish: enable standard audio quality.");
            super.setAudioQuality(2);
            TXCAudioEngine.getInstance().setCaptureDataCallbackFormat(44100, 1, 1024);
        }
        super.startLocalAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m83702d() {
        super.enableCustomVideoCapture(false);
        super.stopLocalAudio();
        this.f58476s.set(false);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void addDelegate(TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        this.f58460c.m83823a(tXILiveRoomDelegateAdapter);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void checkUserState(String str, long j, int i, int i2) {
        super.checkUserState(str, j, i, i2);
        try {
            long j2 = Long.parseLong(str);
            OneSecAdapterParams oneSecAdapterParams = this.f58458a;
            if (oneSecAdapterParams == null) {
                TXCLog.m84149e("TRTCAdapter-ext", "TRTCAdapter: check user state error. params is null.");
                return;
            }
            if (TRTCRoomInfo.isMuteAudio(i2) != TRTCRoomInfo.isMuteAudio(i)) {
                this.f58460c.onRoomAudioMuted(oneSecAdapterParams.roomName, j2, TRTCRoomInfo.isMuteAudio(i));
            }
            if (TRTCRoomInfo.isMuteMainVideo(i2) != TRTCRoomInfo.isMuteMainVideo(i)) {
                this.f58460c.onRoomVideoMuted(oneSecAdapterParams.roomName, j2, TRTCRoomInfo.isMuteMainVideo(i));
            }
        } catch (Exception unused) {
            TXCLog.m84149e("TRTCAdapter-ext", "TRTCAdapter: check user state error. user id error.id:" + str);
        }
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void clearDelegate() {
        this.f58460c.m83822a();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void clearLocalMixConfig() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.33
            @Override // java.lang.Runnable
            public void run() {
                Monitor.m84161a(2, "clear local mix config", "", 0);
                C14108a.super.setRemoteVideoRenderListener(C14108a.this.f58466i + "", 0, 0, null);
                C14108a.this.f58453L = null;
                C14108a c14108a = C14108a.this;
                c14108a.f58467j = null;
                c14108a.f58466i = -1L;
                c14108a.f58468k.m83817b();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void clearMixTranscodingConfig() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.31
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.setMixTranscodingConfig((TRTCCloudDef.TRTCTranscodingConfig) null);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void connectOtherRoom(String str, long j) {
        this.f58462e.m83812a(str, j);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.iliveroom.IOneSecAdapter
    public void destroy() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.34
            @Override // java.lang.Runnable
            public void run() {
                C14108a.this.getAudioEffectManager().setMusicObserver(Api.BaseClientBuilder.API_PRIORITY_OTHER, null);
                C14108a.this.f58460c.m83822a();
                C14108a.super.destroy();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void disconnectOtherRoom() {
        this.f58462e.m83811a();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void enableAudioMessage(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.27
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.m84152i("TRTCAdapter-ext", "TRTCAdapter: enable block message, enable:" + z);
                C14108a c14108a = C14108a.this;
                c14108a.f58464g = z;
                if (((TRTCCloudImpl) c14108a).mCaptureAndEnc != null) {
                    ((TRTCCloudImpl) C14108a.this).mCaptureAndEnc.m84670b(z);
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
                    C14108a.this.m83653a(1, i3, i4, i5, i6);
                    return;
                }
                TXCLog.m84152i("TRTCAdapter-ext", "enableEncSmallVideoStream -> disable small " + z + " size = " + tXILiveSize + " fps = " + i + " videoBitrate = " + i2);
                C14108a.super.enableEncSmallVideoStream(false, null);
            }
        });
        return 0;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public TXILiveRoomDefine.TXILiveRoomAVStatistic getAVStatistic() {
        return C14116a.m83785a().m83792c();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public long getMusicCurrentPosition() {
        return getAudioEffectManager().getMusicCurrentPosInMS(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int getMusicDuration() {
        return (int) this.f58456O;
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void joinRoom(final OneSecAdapterParams oneSecAdapterParams, final TXILiveRoomDefine.TXILiveRoomConfig tXILiveRoomConfig) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                C14116a.m83785a().m83790b();
                C14116a.m83785a().m83788a(oneSecAdapterParams.userId);
                C14116a.m83785a().m83787a(oneSecAdapterParams.roomRole);
                C14108a.this.f58445D = 0L;
                C14108a.this.f58446E = 0L;
                C14108a.this.f58447F = 0L;
                C14108a.this.f58448G.m83764a();
                C14108a.this.f58472o = tXILiveRoomConfig;
                C14108a c14108a = C14108a.this;
                c14108a.f58458a = oneSecAdapterParams;
                c14108a.f58465h.clear();
                C14108a c14108a2 = C14108a.this;
                c14108a2.f58469l = false;
                if (tXILiveRoomConfig.cdnVideoCodecType == 2) {
                    OneSecAdapterParams oneSecAdapterParams2 = c14108a2.f58458a;
                    c14108a2.f58454M = c14108a2.m83677b(oneSecAdapterParams2.bizId, oneSecAdapterParams2.sdkAppId, oneSecAdapterParams2.roomName, oneSecAdapterParams2.userId);
                } else {
                    c14108a2.f58454M = "";
                }
                C14108a.this.m83679b();
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteAllRemoteAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.16
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.muteAllRemoteAudio(z);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteAllRemoteVideo(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.8
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.muteAllRemoteVideoStreams(z);
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.14
            @Override // java.lang.Runnable
            public void run() {
                C14108a.this.f58474q = z;
                C14108a.super.muteLocalAudio(z);
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalVideo(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.46
            @Override // java.lang.Runnable
            public void run() {
                C14108a.this.f58475r = z;
                C14108a.super.muteLocalVideo(z);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteRemoteAudio(final long j, final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.15
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.muteRemoteAudio(j + "", z);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void muteRemoteVideo(final long j, final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.7
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.muteRemoteVideoStream(j + "", z);
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void notifyEvent(String str, int i, Bundle bundle) {
        super.notifyEvent(str, i, bundle);
        C14115b c14115b = this.f58480w;
        if (c14115b != null) {
            c14115b.m83784a(str, i, bundle);
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
                    C14116a.m83785a().m83789a(j2, j);
                    OneSecAdapterParams oneSecAdapterParams = C14108a.this.f58458a;
                    if (oneSecAdapterParams == null) {
                        TXCLog.m84149e("TRTCAdapter-ext", "TRTCAdapter: on av member enter. params is null.");
                        return;
                    }
                    if (TRTCRoomInfo.isMuteAudio(i2)) {
                        C14108a.this.f58460c.onRoomAudioMuted(oneSecAdapterParams.roomName, j2, true);
                    }
                    if (TRTCRoomInfo.isMuteMainVideo(i2)) {
                        C14108a.this.f58460c.onRoomVideoMuted(oneSecAdapterParams.roomName, j2, true);
                    }
                }
            });
        } catch (Exception unused) {
            TXCLog.m84149e("TRTCAdapter-ext", "TRTCAdapter: on av member enter.  user is is valid. user id:0");
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
                    C14116a.m83785a().m83791b(j2, j);
                    C14108a.this.f58465h.remove(Long.valueOf(j2));
                }
            });
        } catch (Exception e) {
            TXCLog.m84150e("TRTCAdapter-ext", "parse userid failed.", e);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onCancelTranscoding(final int i, final String str) {
        super.runOnListenerThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.39
            @Override // java.lang.Runnable
            public void run() {
                Monitor.m84161a(1, String.format("onCancelTranscoding err:%d, msg:%s", Integer.valueOf(i), str), "", 0);
                C14124e c14124e = C14108a.this.f58460c;
                if (c14124e != null) {
                    c14124e.onClearMixTranscodingConfig(i, str);
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
        TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f58461d;
        if (tXILiveRoomAudioDelegateAdapter != null) {
            TXILiveRoomDefine.TXILiveRoomAudioFrame tXILiveRoomAudioFrame = new TXILiveRoomDefine.TXILiveRoomAudioFrame();
            tXILiveRoomAudioFrame.audioData = bArr;
            tXILiveRoomAudioFrame.audioChannels = i;
            tXILiveRoomAudioFrame.audioSampleRate = i2;
            tXILiveRoomAudioFrame.timestamp = j;
            tXILiveRoomAudioDelegateAdapter.onRecordAudioFrame(tXILiveRoomAudioFrame);
            if (this.f58466i != -1) {
                if (i == 2) {
                    C14121b.m83818a(tXILiveRoomAudioFrame.audioData, 2, this.f58468k.m83815a(), 2);
                } else if (i == 1) {
                    C14121b.m83818a(tXILiveRoomAudioFrame.audioData, 1, this.f58468k.m83816a(2), 2);
                }
            }
        }
        if (bArr != null) {
            if (this.f58447F < 0) {
                TXCLog.m84149e("TRTCAdapter-ext", "onRecordPcmData -> statistic error occurred, fix it. bytes = " + this.f58447F);
                this.f58447F = 0L;
            }
            this.f58447F += (long) bArr.length;
        }
        AtomicBoolean atomicBoolean = this.f58476s;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            return;
        }
        this.f58476s.set(false);
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.43
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = C14108a.this.f58449H.values().iterator();
                while (it.hasNext()) {
                    C14108a.super.playAudioEffect((TRTCCloudDef.TRTCAudioEffectParam) it.next());
                }
                C14108a.this.f58449H.clear();
            }
        });
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            TXCLog.m84152i("TRTCAdapter-ext", "Music onComplete: id-" + i + " code-" + i2);
            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f58461d;
            if (tXILiveRoomAudioDelegateAdapter != null) {
                if (i2 == 0) {
                    tXILiveRoomAudioDelegateAdapter.onMusicPlayFinish();
                } else {
                    tXILiveRoomAudioDelegateAdapter.onMusicPlayError(TXILiveRoomDefine.TXILiveRoomErrorMusicInvalid);
                }
            }
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.liteav.C14270d.a
    public void onEncVideo(TXSNALPacket tXSNALPacket) {
        super.onEncVideo(tXSNALPacket);
        if (tXSNALPacket == null || tXSNALPacket.nalData == null) {
            return;
        }
        C14116a.m83785a().m83793d();
        if (this.f58445D < 0) {
            TXCLog.m84149e("TRTCAdapter-ext", "onEncVideo -> statistic error occurred, fix it. bytes = " + this.f58445D);
            this.f58445D = 0L;
        }
        this.f58445D += (long) tXSNALPacket.nalData.length;
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onLocalProcessedAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onMixedPlayAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f58461d;
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
            this.f58456O = j2;
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.liteav.audio.InterfaceC14148f
    public void onRecordEncData(byte[] bArr, long j, int i, int i2, int i3) {
        super.onRecordEncData(bArr, j, i, i2, i3);
        if (bArr != null) {
            if (this.f58446E < 0) {
                TXCLog.m84149e("TRTCAdapter-ext", "onRecordEncData -> statistic error occurred, fix it. bytes = " + this.f58446E);
                this.f58446E = 0L;
            }
            this.f58446E += (long) bArr.length;
        }
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onRemoteUserAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, String str) {
        try {
            long j = Long.parseLong(str);
            if (j == this.f58466i) {
                this.f58468k.m83814a(tRTCAudioFrame.data);
            }
            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f58461d;
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
            TXILiveRoomVideoRenderDelegate tXILiveRoomVideoRenderDelegate = this.f58457P.get(str);
            if (tXILiveRoomVideoRenderDelegate != null && tRTCVideoFrame.bufferType == 2 && tRTCVideoFrame.pixelFormat == 1) {
                tXILiveRoomVideoRenderDelegate.onPreRenderBufferFrame(Long.valueOf(str).longValue(), tRTCVideoFrame.data, tRTCVideoFrame.width, tRTCVideoFrame.height);
            }
            try {
                long j = Long.parseLong(str);
                TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig = this.f58453L;
                if (tXILiveRoomLocalMixConfig != null && !tXILiveRoomLocalMixConfig.onlyMixAudio && j == this.f58466i && tRTCVideoFrame.pixelFormat == 1 && tRTCVideoFrame.bufferType == 1) {
                    ByteBuffer byteBuffer = tRTCVideoFrame.buffer;
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
                    byteBufferAllocateDirect.rewind();
                    byteBufferAllocateDirect.put(byteBuffer);
                    byteBufferAllocateDirect.rewind();
                    byteBufferAllocateDirect.flip();
                    C14112d c14112d = new C14112d();
                    c14112d.f58624a = byteBufferAllocateDirect;
                    c14112d.f58625b = tRTCVideoFrame.width;
                    c14112d.f58626c = tRTCVideoFrame.height;
                    this.f58467j = c14112d;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            TXCLog.m84152i("TRTCAdapter-ext", "Music onStart: id-" + i + " code-" + i2);
            this.f58456O = 0L;
            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = this.f58461d;
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
                    C14108a c14108a = C14108a.this;
                    if (c14108a.f58458a != null) {
                        if (i5 != c14108a.f58442A || i4 != C14108a.this.f58483z) {
                            C14108a.this.f58442A = i5;
                            C14108a.this.f58483z = i4;
                            C14108a c14108a2 = C14108a.this;
                            c14108a2.f58460c.onRoomVideoQosChanged(c14108a2.f58458a.roomName, c14108a2.f58483z, C14108a.this.f58442A);
                        }
                        if (C14108a.this.f58443B == i2 && C14108a.this.f58444C == i3) {
                            return;
                        }
                        C14108a.this.f58443B = i2;
                        C14108a.this.f58444C = i3;
                        C14108a c14108a3 = C14108a.this;
                        c14108a3.f58460c.onEvent(c14108a3.f58458a.userId, 13008, "视频分辨率改变 w:" + i2 + " h:" + i3);
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
                C14108a.super.pauseBGM();
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
                C14108a.this.f58463f.add(Integer.valueOf(i));
                TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam = new TRTCCloudDef.TRTCAudioEffectParam(i, str);
                tRTCAudioEffectParam.loopCount = z2 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 0;
                tRTCAudioEffectParam.publish = z;
                boolean z3 = C14108a.this.f58476s.get();
                C14108a c14108a = C14108a.this;
                if (z3) {
                    c14108a.f58449H.put(Integer.valueOf(i), tRTCAudioEffectParam);
                } else {
                    C14108a.super.playAudioEffect(tRTCAudioEffectParam);
                }
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void playMusicWithUrl(String str, boolean z, int i) {
        if (i == 0) {
            TXCLog.m84149e("TRTCAdapter-ext", "playMusicWithUrl: play music fail, times is zero.");
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
                C14108a c14108a = C14108a.this;
                c14108a.f58469l = false;
                c14108a.f58464g = false;
                if (((TRTCCloudImpl) c14108a).mCaptureAndEnc != null) {
                    ((TRTCCloudImpl) C14108a.this).mCaptureAndEnc.m84670b(false);
                }
                C14108a.this.f58477t.m83768a(new Runnable() { // from class: com.tencent.iliveroom.a.a.23.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((TRTCCloudImpl) C14108a.this).mCaptureAndEnc != null) {
                            TXCLog.m84152i("TRTCAdapter-ext", "quitRoom -> runOnGLThread -> Release Processor And Encoder.");
                            ((TRTCCloudImpl) C14108a.this).mCaptureAndEnc.m84699p();
                        }
                    }
                });
                C14108a.this.f58471n.clear();
                C14108a.this.f58449H.clear();
                C14108a.this.f58457P.clear();
                C14108a.this.f58477t.m83771c();
                C14108a.super.stopBGM();
                C14108a.super.stopAllAudioEffects();
                C14108a.this.f58465h.clear();
                C14116a.m83785a().m83790b();
                C14108a.this.f58445D = 0L;
                C14108a.this.f58446E = 0L;
                C14108a.this.f58447F = 0L;
                C14108a.this.f58448G.m83765b();
            }
        }, 1000L);
        super.exitRoom();
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void removeDelegate(TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        this.f58460c.m83824b(tXILiveRoomDelegateAdapter);
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void resume() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.38
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.resumeBGM();
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
        C14108a c14108a;
        if (this.f58464g) {
            TXCLog.m84149e("TRTCAdapter-ext", "TRTCAdapter: send custom video texture ignore, block pusher is pushing.");
            return -3000;
        }
        TXILiveRoomDefine.TXILiveRoomConfig tXILiveRoomConfig = this.f58472o;
        if (tXILiveRoomConfig == null) {
            c14108a = this;
        } else {
            TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig = this.f58453L;
            if (tXILiveRoomLocalMixConfig != null && !tXILiveRoomLocalMixConfig.onlyMixAudio) {
                int i6 = this.f58481x;
                int i7 = tXILiveRoomLocalMixConfig.videoWidth;
                if (i6 == i7 && this.f58482y == tXILiveRoomLocalMixConfig.videoHeight) {
                    c14108a = this;
                } else {
                    this.f58481x = i7;
                    this.f58482y = tXILiveRoomLocalMixConfig.videoHeight;
                    c14108a = this;
                    c14108a.m83653a(0, this.f58481x, this.f58482y, tXILiveRoomConfig.videoFps, tXILiveRoomConfig.videoBitrate);
                }
            } else if (this.f58481x == i3 && this.f58482y == i4) {
                c14108a = this;
            } else {
                this.f58481x = i3;
                this.f58482y = i4;
                c14108a = this;
                c14108a.m83653a(0, this.f58481x, this.f58482y, tXILiveRoomConfig.videoFps, tXILiveRoomConfig.videoBitrate);
            }
        }
        if (c14108a.f58478u == Thread.currentThread().getId()) {
            if (obj != c14108a.f58479v) {
            }
            c14108a.f58479v = obj;
            c14108a.f58478u = Thread.currentThread().getId();
            if (obj != null) {
                return 1000;
            }
            GLES20.glFinish();
            c14108a.f58477t.m83768a(new Runnable() { // from class: com.tencent.iliveroom.a.a.2
                @Override // java.lang.Runnable
                public void run() {
                    List<TXILiveRoomDefine.TXILiveRoomLocalMixUser> list;
                    C14108a.this.f58455N.m83820a();
                    int iM83774a = i;
                    int i8 = i3;
                    int i9 = i4;
                    C14108a c14108a2 = C14108a.this;
                    C14112d c14112d = c14108a2.f58467j;
                    TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig2 = c14108a2.f58453L;
                    if (C14108a.this.f58452K != null && C14108a.this.f58466i != -1 && c14112d != null && tXILiveRoomLocalMixConfig2 != null && !tXILiveRoomLocalMixConfig2.onlyMixAudio && (list = tXILiveRoomLocalMixConfig2.mixUsers) != null && list.size() == 2) {
                        C14109a[] c14109aArr = new C14109a[2];
                        int i10 = 0;
                        for (TXILiveRoomDefine.TXILiveRoomLocalMixUser tXILiveRoomLocalMixUser : tXILiveRoomLocalMixConfig2.mixUsers) {
                            C14109a c14109a = new C14109a();
                            int i11 = tXILiveRoomLocalMixUser.height;
                            c14109a.f58614f = i11;
                            int i12 = tXILiveRoomLocalMixUser.width;
                            c14109a.f58613e = i12;
                            c14109a.f58615g = tXILiveRoomLocalMixUser.f58438x;
                            c14109a.f58616h = tXILiveRoomLocalMixUser.f58439y;
                            if (tXILiveRoomLocalMixUser.userId == C14108a.this.f58466i) {
                                c14109a.f58610b = c14112d.f58624a;
                                c14109a.f58611c = c14112d.f58625b;
                                c14109a.f58612d = c14112d.f58626c;
                            } else {
                                c14109a.f58609a = i;
                                c14109a.f58611c = i12;
                                c14109a.f58612d = i11;
                            }
                            c14109aArr[i10] = c14109a;
                            i10++;
                        }
                        i8 = tXILiveRoomLocalMixConfig2.videoWidth;
                        i9 = tXILiveRoomLocalMixConfig2.videoHeight;
                        iM83774a = C14108a.this.f58452K.m83774a(c14109aArr, i8, i9);
                    }
                    int i13 = iM83774a;
                    int i14 = i8;
                    int i15 = i9;
                    C14273g c14273gM84671c = ((TRTCCloudImpl) C14108a.this).mCaptureAndEnc.m84671c();
                    if (c14273gM84671c != null) {
                        if (i14 <= i15) {
                            c14273gM84671c.f60164l = 1;
                            c14273gM84671c.f60153a = i14;
                            c14273gM84671c.f60154b = i15;
                        } else {
                            c14273gM84671c.f60164l = 0;
                            c14273gM84671c.f60153a = i15;
                            c14273gM84671c.f60154b = i14;
                        }
                    }
                    ((TRTCCloudImpl) C14108a.this).mCaptureAndEnc.m84648a(i13, i14, i15, C14108a.this.f58479v, 0L);
                }
            });
            return 1000;
        }
        TXCLog.m84152i("TRTCAdapter-ext", "sendCustomVideoTexture -> eglcontext's thread change!");
        if (c14108a.f58479v != null) {
            c14108a.f58477t.m83769b(new Runnable() { // from class: com.tencent.iliveroom.a.a.47
                @Override // java.lang.Runnable
                public void run() {
                    if (((TRTCCloudImpl) C14108a.this).mCaptureAndEnc != null) {
                        TXCLog.m84152i("TRTCAdapter-ext", "sendCustomVideoTexture -> runOnGLThread -> Release Processor And Encoder.");
                        ((TRTCCloudImpl) C14108a.this).mCaptureAndEnc.m84699p();
                    }
                    if (C14108a.this.f58452K != null) {
                        TXCLog.m84152i("TRTCAdapter-ext", "sendCustomVideoTexture: video combiner release in gl thread.");
                        C14108a.this.f58452K.m83775a();
                    }
                }
            });
            c14108a.f58477t.m83771c();
        }
        if (!c14108a.f58477t.m83770b()) {
            c14108a.f58477t.m83766a();
        }
        if (obj != null) {
            c14108a.f58477t.m83767a(obj);
        }
        c14108a.f58477t.m83768a(new Runnable() { // from class: com.tencent.iliveroom.a.a.48
            @Override // java.lang.Runnable
            public void run() {
                C14108a.this.f58452K = new C14113e();
                TXCLog.m84152i("TRTCAdapter-ext", "sendCustomVideoTexture: video combiner create in gl thread.");
            }
        });
        TXCLog.m84152i("TRTCAdapter-ext", "sendCustomVideoTexture -> thread attach egl context finish.");
        c14108a.f58479v = obj;
        c14108a.f58478u = Thread.currentThread().getId();
        if (obj != null) {
            return 1000;
        }
        GLES20.glFinish();
        c14108a.f58477t.m83768a(new Runnable() { // from class: com.tencent.iliveroom.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                List<TXILiveRoomDefine.TXILiveRoomLocalMixUser> list;
                C14108a.this.f58455N.m83820a();
                int iM83774a = i;
                int i8 = i3;
                int i9 = i4;
                C14108a c14108a2 = C14108a.this;
                C14112d c14112d = c14108a2.f58467j;
                TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig2 = c14108a2.f58453L;
                if (C14108a.this.f58452K != null && C14108a.this.f58466i != -1 && c14112d != null && tXILiveRoomLocalMixConfig2 != null && !tXILiveRoomLocalMixConfig2.onlyMixAudio && (list = tXILiveRoomLocalMixConfig2.mixUsers) != null && list.size() == 2) {
                    C14109a[] c14109aArr = new C14109a[2];
                    int i10 = 0;
                    for (TXILiveRoomDefine.TXILiveRoomLocalMixUser tXILiveRoomLocalMixUser : tXILiveRoomLocalMixConfig2.mixUsers) {
                        C14109a c14109a = new C14109a();
                        int i11 = tXILiveRoomLocalMixUser.height;
                        c14109a.f58614f = i11;
                        int i12 = tXILiveRoomLocalMixUser.width;
                        c14109a.f58613e = i12;
                        c14109a.f58615g = tXILiveRoomLocalMixUser.f58438x;
                        c14109a.f58616h = tXILiveRoomLocalMixUser.f58439y;
                        if (tXILiveRoomLocalMixUser.userId == C14108a.this.f58466i) {
                            c14109a.f58610b = c14112d.f58624a;
                            c14109a.f58611c = c14112d.f58625b;
                            c14109a.f58612d = c14112d.f58626c;
                        } else {
                            c14109a.f58609a = i;
                            c14109a.f58611c = i12;
                            c14109a.f58612d = i11;
                        }
                        c14109aArr[i10] = c14109a;
                        i10++;
                    }
                    i8 = tXILiveRoomLocalMixConfig2.videoWidth;
                    i9 = tXILiveRoomLocalMixConfig2.videoHeight;
                    iM83774a = C14108a.this.f58452K.m83774a(c14109aArr, i8, i9);
                }
                int i13 = iM83774a;
                int i14 = i8;
                int i15 = i9;
                C14273g c14273gM84671c = ((TRTCCloudImpl) C14108a.this).mCaptureAndEnc.m84671c();
                if (c14273gM84671c != null) {
                    if (i14 <= i15) {
                        c14273gM84671c.f60164l = 1;
                        c14273gM84671c.f60153a = i14;
                        c14273gM84671c.f60154b = i15;
                    } else {
                        c14273gM84671c.f60164l = 0;
                        c14273gM84671c.f60153a = i15;
                        c14273gM84671c.f60154b = i14;
                    }
                }
                ((TRTCCloudImpl) C14108a.this).mCaptureAndEnc.m84648a(i13, i14, i15, C14108a.this.f58479v, 0L);
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
                C14108a.this.f58461d = tXILiveRoomAudioDelegateAdapter;
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioExpandBlockThreshold(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.35
            @Override // java.lang.Runnable
            public void run() {
                C14108a.this.f58450I = i;
                ((TRTCCloudImpl) C14108a.this).mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.iliveroom.a.a.35.1
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
                C14108a.this.f58451J = i;
                ((TRTCCloudImpl) C14108a.this).mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.iliveroom.a.a.36.1
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
                C14108a.super.setAudioRoute(i3);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setAudioVolumeIndication(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.17
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.enableAudioVolumeEvaluation(i);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void setCustomVideoParam(TXILiveRoomDefine.TXILiveSize tXILiveSize, final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.12
            @Override // java.lang.Runnable
            public void run() {
                if (C14108a.this.f58472o != null) {
                    C14108a.this.f58472o.videoBitrate = i;
                    C14108a c14108a = C14108a.this;
                    c14108a.m83653a(0, c14108a.f58481x, C14108a.this.f58482y, C14108a.this.f58472o.videoFps, C14108a.this.f58472o.videoBitrate);
                }
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setEffectsVolume(final double d) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.25
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.setAllAudioEffectsVolume((int) (d * 100.0d));
                Iterator it = C14108a.this.f58449H.values().iterator();
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
                Monitor.m84161a(1, sb.toString(), "", 0);
                TXCLog.m84152i("TRTCAdapter-ext", "TRTCAdapter: set local mix config:" + tXILiveRoomLocalMixConfig);
                TXILiveRoomDefine.TXILiveRoomLocalMixConfig tXILiveRoomLocalMixConfig3 = tXILiveRoomLocalMixConfig;
                if (tXILiveRoomLocalMixConfig3 == null || (list = tXILiveRoomLocalMixConfig3.mixUsers) == null || list.size() != 2) {
                    TXCLog.m84149e("TRTCAdapter-ext", "TRTCAdapter: set local mix config fail.");
                    return;
                }
                long j = C14108a.this.f58458a.userId;
                Iterator<TXILiveRoomDefine.TXILiveRoomLocalMixUser> it = tXILiveRoomLocalMixConfig.mixUsers.iterator();
                while (it.hasNext()) {
                    long j2 = it.next().userId;
                    if (j2 != j) {
                        C14108a.this.f58466i = j2;
                        break;
                    }
                }
                C14108a.this.f58468k.m83817b();
                if (C14108a.this.f58466i == -1) {
                    TXCLog.m84149e("TRTCAdapter-ext", "TRTCAdapter: set local mix config fail. can't find target user id.");
                    return;
                }
                TXCLog.m84152i("TRTCAdapter-ext", "TRTCAdapter: set local mix config success.");
                C14108a.this.f58453L = tXILiveRoomLocalMixConfig;
                if (tXILiveRoomLocalMixConfig.onlyMixAudio) {
                    TXCLog.m84152i("TRTCAdapter-ext", "TRTCAdapter: set local mix config, is pure mode, not need set video render listener.");
                    return;
                }
                C14108a.super.setRemoteVideoRenderListener(C14108a.this.f58466i + "", 1, 1, C14108a.this);
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
                C14108a c14108a = C14108a.this;
                if (tXILiveRoomTranscodingConfig3 == null) {
                    c14108a.apiLog("setMixTranscodingConfig: set null config.");
                    C14108a c14108a2 = C14108a.this;
                    C14108a.super.nativeSetMixTranscodingConfig(((TRTCCloudImpl) c14108a2).mNativeRtcContext, null);
                    return;
                }
                if (c14108a.f58458a == null) {
                    c14108a.apiLog("setMixTranscodingConfig: room params is null, ignore mix config.");
                    return;
                }
                c14108a.apiLog("setMixTranscodingConfig: set mix config");
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
                OneSecAdapterParams oneSecAdapterParams = C14108a.this.f58458a;
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
                    if (TextUtils.isEmpty(C14108a.this.f58454M)) {
                        C14108a c14108a3 = C14108a.this;
                        OneSecAdapterParams oneSecAdapterParams2 = c14108a3.f58458a;
                        c14108a3.f58454M = c14108a3.m83677b(oneSecAdapterParams2.bizId, oneSecAdapterParams2.sdkAppId, oneSecAdapterParams2.roomName, oneSecAdapterParams2.userId);
                    }
                    tRTCTranscodingConfigInner.streamId = C14108a.this.f58454M;
                }
                if (tXILiveRoomTranscodingConfig2.mixUsers != null) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<TXILiveRoomDefine.TXILiveRoomMixUser> it = tXILiveRoomTranscodingConfig2.mixUsers.iterator();
                    while (it.hasNext()) {
                        TXILiveRoomDefine.TXILiveRoomMixUser next = it.next();
                        if (next != null) {
                            TRTCTranscodingConfigInner.TRTCMixUserInner tRTCMixUserInner = new TRTCTranscodingConfigInner.TRTCMixUserInner(next.userId + "", next.f58440x, next.f58441y, next.width, next.height, next.zOrder);
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
                                C14108a c14108a4 = C14108a.this;
                                OneSecAdapterParams oneSecAdapterParams3 = c14108a4.f58458a;
                                tRTCMixUserInner.streamId = c14108a4.m83650a(oneSecAdapterParams3.bizId, oneSecAdapterParams3.sdkAppId, next.roomId, next.userId);
                                tRTCTranscodingConfigInner.mixUsers.add(tRTCMixUserInner);
                            } else if (next.isMuteAudio) {
                                sb.append(",isMute:");
                                sb.append(next.isMuteAudio);
                            } else {
                                tRTCMixUserInner.inputType = 3;
                                C14108a c14108a5 = C14108a.this;
                                OneSecAdapterParams oneSecAdapterParams4 = c14108a5.f58458a;
                                tRTCMixUserInner.streamId = c14108a5.m83650a(oneSecAdapterParams4.bizId, oneSecAdapterParams4.sdkAppId, next.roomId, next.userId);
                                tRTCTranscodingConfigInner.mixUsers.add(tRTCMixUserInner);
                            }
                        }
                        it = it;
                        i = 1;
                    }
                    Monitor.m84161a(2, "setMixTranscodingConfig", sb.toString(), 0);
                }
                C14108a c14108a6 = C14108a.this;
                C14108a.super.nativeSetMixTranscodingConfig(((TRTCCloudImpl) c14108a6).mNativeRtcContext, tRTCTranscodingConfigInner);
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
                C14108a.super.setAudioPlayoutVolume((int) (f * 100.0f));
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public int setPriorRemoteVideoStreamType(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.10
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                C14108a c14108a = C14108a.this;
                if (i2 == 0) {
                    C14108a.super.setPriorRemoteVideoStreamType(0);
                } else {
                    C14108a.super.setPriorRemoteVideoStreamType(1);
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
                C14108a c14108a = C14108a.this;
                if (i2 == 0) {
                    C14108a.super.setRemoteVideoStreamType(str, 0);
                } else {
                    C14108a.super.setRemoteVideoStreamType(str, 1);
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
                C14108a.this.f58457P.put(String.valueOf(j), tXILiveRoomVideoRenderDelegate);
                C14108a.super.setRemoteVideoRenderListener(String.valueOf(j), 1, 2, C14108a.this);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public int setVolumeOfEffect(final int i, final double d) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.26
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.setAudioEffectVolume(i, (int) (d * 100.0d));
                TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam = (TRTCCloudDef.TRTCAudioEffectParam) C14108a.this.f58449H.get(Integer.valueOf(i));
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
                C14108a c14108a = C14108a.this;
                if (i2 == 0) {
                    C14108a.super.setSystemVolumeType(0);
                } else {
                    C14108a.super.setSystemVolumeType(1);
                }
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void startPublishCDNStream(final String str) {
        if (TextUtils.isEmpty(str)) {
            TXCLog.m84149e("TRTCAdapter-ext", "startPublishCDNStream -> error!!! cdn url is null.");
        } else {
            runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.28
                @Override // java.lang.Runnable
                public void run() {
                    C14122c.m83819a(true, str);
                    C14108a c14108a = C14108a.this;
                    OneSecAdapterParams oneSecAdapterParams = c14108a.f58458a;
                    String str2 = str;
                    if (oneSecAdapterParams == null) {
                        c14108a.f58473p = str2;
                    } else {
                        c14108a.m83669a(str2, c14108a.f58454M);
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
                C14108a.super.startRemoteView(j + "", null);
                if (surfaceView == null) {
                    return;
                }
                if (C14108a.this.f58471n.containsKey(Long.valueOf(j))) {
                    ((a) C14108a.this.f58471n.remove(Long.valueOf(j))).m83761b();
                }
                SurfaceHolder holder = surfaceView.getHolder();
                if (holder.getSurface().isValid()) {
                    C14108a.super.setRemoteSurface(j + "", 0, holder.getSurface());
                    C14108a.super.setRemoteSurfaceSize(j + "", 0, holder.getSurfaceFrame().width(), holder.getSurfaceFrame().height());
                }
                C14108a.this.f58471n.put(Long.valueOf(j), C14108a.this.new a(j, surfaceView));
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopAllEffect() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.24
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.stopAllAudioEffects();
                C14108a.this.f58449H.clear();
                final ArrayList arrayList = new ArrayList(C14108a.this.f58463f);
                if (arrayList.size() != 0) {
                    C14108a.this.runOnMainThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.24.1
                        @Override // java.lang.Runnable
                        public void run() {
                            for (Integer num : arrayList) {
                                TXCLog.m84152i("TRTCAdapter-ext", "TRTCAdapter: callback finish when stop all effects, id:" + num);
                                TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = C14108a.this.f58461d;
                                if (tXILiveRoomAudioDelegateAdapter != null) {
                                    tXILiveRoomAudioDelegateAdapter.onEffectPlayFinish(num.intValue());
                                }
                            }
                        }
                    });
                }
                C14108a.this.f58463f.clear();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopAllRemoteRender() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.6
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = C14108a.this.f58471n.values().iterator();
                while (it.hasNext()) {
                    ((a) it.next()).m83761b();
                }
                C14108a.this.f58471n.clear();
                C14108a.this.f58465h.clear();
                C14108a.super.stopAllRemoteView();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopEffectWithId(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.22
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.stopAudioEffect(i);
                C14108a.this.f58449H.remove(Integer.valueOf(i));
                if (C14108a.this.f58463f.remove(Integer.valueOf(i))) {
                    C14108a.this.runOnMainThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.22.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TXCLog.m84152i("TRTCAdapter-ext", "TRTCAdapter: callback finish when stop effect, id:" + i);
                            AnonymousClass22 anonymousClass22 = AnonymousClass22.this;
                            TXILiveRoomAudioDelegateAdapter tXILiveRoomAudioDelegateAdapter = C14108a.this.f58461d;
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
                C14122c.m83819a(false, null);
                C14108a.this.f58473p = "";
                C14108a.super.stopPublishCDNStream();
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void stopRemoteRender(final long j) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.5
            @Override // java.lang.Runnable
            public void run() {
                C14108a.this.f58465h.remove(Long.valueOf(j));
                C14108a.super.stopRemoteView(j + "");
                a aVar = (a) C14108a.this.f58471n.remove(Long.valueOf(j));
                if (aVar != null) {
                    aVar.m83761b();
                }
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void switchRole(final int i) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.44
            @Override // java.lang.Runnable
            public void run() {
                if (i == 1 && C14108a.this.f58459b) {
                    TXCLog.m84149e("TRTCAdapter-ext", "switchRole -> ignore, already is broadcaster.");
                    return;
                }
                C14108a.this.f58442A = 0;
                C14108a.this.f58483z = 0;
                C14108a.this.f58444C = 0;
                C14108a.this.f58443B = 0;
                C14108a c14108a = C14108a.this;
                boolean z = i == 1;
                c14108a.f58459b = z;
                if (z) {
                    c14108a.m83695c();
                    C14108a c14108a2 = C14108a.this;
                    C14108a.super.muteLocalAudio(c14108a2.f58474q);
                    C14108a c14108a3 = C14108a.this;
                    C14108a.super.muteLocalVideo(c14108a3.f58475r);
                } else {
                    c14108a.m83702d();
                    C14108a.super.muteLocalAudio(true);
                    C14108a.super.muteLocalVideo(true);
                }
                C14108a c14108a4 = C14108a.this;
                C14108a.super.switchRole(c14108a4.f58459b ? 20 : 21);
                C14116a.m83785a().m83787a(i);
            }
        });
    }

    @Override // com.tencent.iliveroom.IOneSecAdapter
    public void startRemoteRender(final long j, final TextureView textureView) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.4
            @Override // java.lang.Runnable
            public void run() {
                C14108a.super.startRemoteView(j + "", null);
                if (textureView == null) {
                    return;
                }
                if (C14108a.this.f58471n.containsKey(Long.valueOf(j))) {
                    ((a) C14108a.this.f58471n.remove(Long.valueOf(j))).m83761b();
                }
                a aVar = C14108a.this.new a(j, textureView);
                C14108a.this.f58471n.put(Long.valueOf(j), aVar);
                if (aVar.m83760a() != null) {
                    C14108a.super.setRemoteSurface(j + "", 0, aVar.m83760a());
                    C14108a.super.setRemoteSurfaceSize(j + "", 0, textureView.getWidth(), textureView.getHeight());
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.tencent.iliveroom.a.a$b */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<C14108a> f58604a;

        /* JADX INFO: renamed from: b */
        private boolean f58605b = false;

        public b(C14108a c14108a) {
            this.f58604a = new WeakReference<>(c14108a);
        }

        /* JADX INFO: renamed from: a */
        public void m83764a() {
            final C14108a c14108a = this.f58604a.get();
            if (c14108a != null) {
                c14108a.runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (b.this.f58605b) {
                            return;
                        }
                        TXCLog.m84152i("TRTCAdapter-ext", "TRTCAdapter: start timer task.");
                        b.this.f58605b = true;
                        ((TRTCCloudImpl) c14108a).mSDKHandler.post(b.this);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: b */
        public void m83765b() {
            C14108a c14108a = this.f58604a.get();
            if (c14108a != null) {
                c14108a.runOnSDKThread(new Runnable() { // from class: com.tencent.iliveroom.a.a.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f58605b = false;
                        TXCLog.m84152i("TRTCAdapter-ext", "TRTCAdapter: stop timer task.");
                    }
                });
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C14108a c14108a = this.f58604a.get();
            if (c14108a == null) {
                TXCLog.m84149e("TRTCAdapter-ext", "TRTCAdapter: adapter is null in timer task, timer task is stop.");
                this.f58605b = false;
                return;
            }
            C14117b.m83795a(2, c14108a.f58445D);
            C14117b.m83795a(0, c14108a.f58447F);
            C14117b.m83795a(1, c14108a.f58446E);
            if (this.f58605b) {
                ((TRTCCloudImpl) c14108a).mSDKHandler.postDelayed(this, 1000L);
            } else {
                TXCLog.m84149e("TRTCAdapter-ext", "TRTCAdapter: timer task is stop. give up to delay task.");
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.iliveroom.a.a$a */
    public class a implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: b */
        private long f58600b;

        /* JADX INFO: renamed from: c */
        private WeakReference<TextureView> f58601c;

        /* JADX INFO: renamed from: d */
        private WeakReference<SurfaceView> f58602d;

        /* JADX INFO: renamed from: e */
        private Surface f58603e;

        public a(long j, TextureView textureView) {
            this.f58601c = new WeakReference<>(textureView);
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture != null) {
                TXCLog.m84152i("TRTCAdapter-ext", "start textureview userId=" + this.f58600b + ",surfaceTexture=" + surfaceTexture);
                this.f58603e = new Surface(textureView.getSurfaceTexture());
            }
            textureView.setSurfaceTextureListener(this);
            this.f58600b = j;
        }

        /* JADX INFO: renamed from: a */
        public Surface m83760a() {
            return this.f58603e;
        }

        /* JADX INFO: renamed from: b */
        public void m83761b() {
            SurfaceView surfaceView;
            TextureView textureView;
            if (this.f58603e != null) {
                C14108a.super.setRemoteSurface(this.f58600b + "", 0, null);
                this.f58603e.release();
                this.f58603e = null;
            }
            WeakReference<TextureView> weakReference = this.f58601c;
            if (weakReference != null && (textureView = weakReference.get()) != null) {
                textureView.setSurfaceTextureListener(null);
            }
            WeakReference<SurfaceView> weakReference2 = this.f58602d;
            if (weakReference2 == null || (surfaceView = weakReference2.get()) == null) {
                return;
            }
            surfaceView.getHolder().removeCallback(this);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            TXCLog.m84152i("TRTCAdapter-ext", "onSurfaceTextureAvailable userId=" + this.f58600b + ",size=" + i + BaseSei.f14624X + i2 + ",texture=" + surfaceTexture);
            this.f58603e = new Surface(surfaceTexture);
            C14108a c14108a = C14108a.this;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f58600b);
            sb.append("");
            C14108a.super.setRemoteSurface(sb.toString(), 0, this.f58603e);
            C14108a.super.setRemoteSurfaceSize(this.f58600b + "", 0, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            TXCLog.m84152i("TRTCAdapter-ext", "onSurfaceTextureDestroyed userId=" + this.f58600b + ",texture=" + surfaceTexture);
            C14108a.super.setRemoteSurface(this.f58600b + "", 0, null);
            Surface surface = this.f58603e;
            if (surface == null) {
                return true;
            }
            surface.release();
            this.f58603e = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            TXCLog.m84152i("TRTCAdapter-ext", "onSurfaceTextureSizeChanged userId=" + this.f58600b + ",size=" + i + BaseSei.f14624X + i2 + ",texture=" + surfaceTexture);
            C14108a c14108a = C14108a.this;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f58600b);
            sb.append("");
            C14108a.super.setRemoteSurfaceSize(sb.toString(), 0, i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            TXCLog.m84152i("TRTCAdapter-ext", "surfaceChanged userId=" + this.f58600b + ",size=" + i2 + BaseSei.f14624X + i3 + ",surface=" + surfaceHolder.getSurface());
            if (this.f58603e != surfaceHolder.getSurface()) {
                this.f58603e = surfaceHolder.getSurface();
                C14108a.super.setRemoteSurface(this.f58600b + "", 0, this.f58603e);
            }
            C14108a.super.setRemoteSurfaceSize(this.f58600b + "", 0, i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (surfaceHolder.getSurface().isValid()) {
                this.f58603e = surfaceHolder.getSurface();
                C14108a.super.setRemoteSurface(this.f58600b + "", 0, this.f58603e);
                TXCLog.m84152i("TRTCAdapter-ext", "surfaceCreated userId=" + this.f58600b + ",surface=" + this.f58603e);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            TXCLog.m84152i("TRTCAdapter-ext", "surfaceDestroyed userId=" + this.f58600b + ",surface=" + surfaceHolder.getSurface());
            C14108a.super.setRemoteSurface(this.f58600b + "", 0, null);
            this.f58603e = null;
        }

        public a(long j, SurfaceView surfaceView) {
            this.f58600b = j;
            this.f58602d = new WeakReference<>(surfaceView);
            if (!surfaceView.getHolder().getSurface().isValid()) {
                this.f58603e = surfaceView.getHolder().getSurface();
            }
            surfaceView.getHolder().addCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m83677b(int i, long j, String str, long j2) {
        if (i != 35476 && i != 113120) {
            return i + "_" + TXCCommonUtil.getMD5(str + "_" + j2 + "_H265");
        }
        return i + "_" + TXCCommonUtil.getMD5(j + "_" + str + "_" + j2 + "_H265");
    }

    /* JADX INFO: renamed from: a */
    public TRTCRoomInfo m83759a() {
        return this.mRoomInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83669a(String str, String str2) {
        if (this.f58458a != null) {
            TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam = new TRTCCloudDef.TRTCPublishCDNParam();
            OneSecAdapterParams oneSecAdapterParams = this.f58458a;
            tRTCPublishCDNParam.appId = oneSecAdapterParams.appId;
            tRTCPublishCDNParam.bizId = oneSecAdapterParams.bizId;
            tRTCPublishCDNParam.url = str;
            tRTCPublishCDNParam.streamId = str2;
            super.startPublishCDNStream(tRTCPublishCDNParam);
            this.f58473p = null;
            return;
        }
        TXCLog.m84149e("TRTCAdapter-ext", "startPublishCDNStreamInner -> error! room params is null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m83650a(int i, long j, String str, long j2) {
        if (i != 35476 && i != 113120) {
            return i + "_" + TXCCommonUtil.getMD5(str + "_" + j2 + "_main");
        }
        return i + "_" + TXCCommonUtil.getMD5(j + "_" + str + "_" + j2 + "_main");
    }
}
