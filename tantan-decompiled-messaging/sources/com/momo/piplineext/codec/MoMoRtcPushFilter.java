package com.momo.piplineext.codec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bef.effectsdk.message.MessageCenter;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.mediabase.AudioResampleUtils;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.mediacore.audio.pcmDataAvailableCallback;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcClientRoleChangedHandler;
import com.immomo.mediacore.coninf.MRtcConnectHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.coninf.MRtcPusherHandler;
import com.immomo.mediacore.coninf.MRtcQualityHandler;
import com.immomo.mediacore.coninf.MRtcRealLayoutNotifyHander;
import com.immomo.mediacore.coninf.MRtcReceiveSeiHandler;
import com.immomo.mediacore.coninf.MRtcTokenWillExpireHander;
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.momortc.AudioVolumeInfo;
import com.momo.momortc.IAudioFrameObserver;
import com.momo.momortc.IMMRtcEngineEventInterface;
import com.momo.momortc.MMRtcEngine;
import com.momo.momortc.MMRtcEngineImpl;
import com.momo.momortc.live.MMLiveTranscoding;
import com.momo.momortc.live.MMRtcLocalVideoStats;
import com.momo.momortc.live.MMRtcRemoteAudioStats;
import com.momo.momortc.live.MMRtcRemoteStats;
import com.momo.momortc.live.MMRtcRemoteVideoStats;
import com.momo.momortc.live.MMRtcStats;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.rtcbase.ContextUtils;
import com.momo.rtcbase.EglBase;
import com.momo.rtcbase.RendererCommon;
import com.momo.rtcbase.SurfaceViewRenderer;
import com.momo.rtcbase.TextureBufferImpl;
import com.momo.rtcbase.VideoCanvas;
import com.momo.rtcbase.VideoFrame;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.a2l0;
import p149l.a9y;
import p149l.anw;
import p149l.cbl0;
import p149l.dix;
import p149l.dxl;
import p149l.eix;
import p149l.ewl;
import p149l.fjx;
import p149l.gw00;
import p149l.hgd0;
import p149l.hjx;
import p149l.hu00;
import p149l.ii5;
import p149l.ii70;
import p149l.j6f;
import p149l.jjw;
import p149l.ley;
import p149l.mcj;
import p149l.mpd0;
import p149l.n8c;
import p149l.okw;
import p149l.qmr;
import p149l.ski0;
import p149l.sml;
import p149l.st0;
import p149l.u3m;
import p149l.vlw;
import p149l.vmw;
import p149l.wb1;
import p149l.wmw;
import p149l.xmw;
import p149l.ymw;
import p149l.yw00;
import p149l.z1l0;
import p149l.za1;
import p149l.zmw;
import p149l.zmx;
import p149l.ztk;

/* JADX INFO: loaded from: classes8.dex */
public class MoMoRtcPushFilter extends MediaBaseCodecFilter implements IAudioFrameObserver, sml, ewl, gw00.InterfaceC17174f {

    /* JADX INFO: renamed from: T2 */
    private static final float[] f14301T2 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: U2 */
    static String f14302U2 = "v3.momoRtcMsgLogin";

    /* JADX INFO: renamed from: V2 */
    static String f14303V2 = "v3.momoRtcMsgOnLogin";

    /* JADX INFO: renamed from: W2 */
    static String f14304W2 = "v3.momoRtcMsgHeart";

    /* JADX INFO: renamed from: X2 */
    static String f14305X2 = "v3.momoRtcMsgJoin";

    /* JADX INFO: renamed from: Y2 */
    static String f14306Y2 = "v3.momoRtcMsgOnJoin";

    /* JADX INFO: renamed from: Z2 */
    static String f14307Z2 = "v3.momoRtcMsgLeave";

    /* JADX INFO: renamed from: a3 */
    static String f14308a3 = "v3.momoRtcMsgOnLeave";

    /* JADX INFO: renamed from: b3 */
    static String f14309b3 = "v3.momoRtcMsgPeerJoin";

    /* JADX INFO: renamed from: c3 */
    static String f14310c3 = "v3.momoRtcMsgPeerLeave";

    /* JADX INFO: renamed from: d3 */
    static String f14311d3 = "v3.momoRtcMsgAddUrl";

    /* JADX INFO: renamed from: e3 */
    static String f14312e3 = "v3.momoRtcMsgRemoveUrl";

    /* JADX INFO: renamed from: f3 */
    static String f14313f3 = "v3.momoRtcMsgTranscoding";

    /* JADX INFO: renamed from: g3 */
    static String f14314g3 = "v3.momoRtcMsgLocalAudioMute";

    /* JADX INFO: renamed from: h3 */
    static String f14315h3 = "v3.momoRtcMsgRemoteAudioMute";

    /* JADX INFO: renamed from: i3 */
    static String f14316i3 = "v3.momoRtcMsgLocalVideoMute";

    /* JADX INFO: renamed from: j3 */
    static String f14317j3 = "v3.momoRtcMsgRemoteVideoMute";

    /* JADX INFO: renamed from: k3 */
    static String f14318k3 = "v3.momoRtcMsgReJoin";

    /* JADX INFO: renamed from: l3 */
    static String f14319l3 = "v3.momoRtcMsgOnReJoin";

    /* JADX INFO: renamed from: m3 */
    static String f14320m3 = "v3.momoRtcMsgStartPK";

    /* JADX INFO: renamed from: n3 */
    static String f14321n3 = "v3.momoRtcMsgOnStartPK";

    /* JADX INFO: renamed from: o3 */
    static String f14322o3 = "v3.momoRtcMsgStopPK";

    /* JADX INFO: renamed from: p3 */
    static String f14323p3 = "v3.momoRtcMsgOnStopPK";

    /* JADX INFO: renamed from: q3 */
    static String f14324q3 = "v3.momoRtcMsgPeerLost";

    /* JADX INFO: renamed from: r3 */
    static String f14325r3 = "v3.momoRtcMsgKeyExpired";

    /* JADX INFO: renamed from: s3 */
    static String f14326s3 = "v3.momoRtcMsgKeyUpdate";

    /* JADX INFO: renamed from: t3 */
    static String f14327t3 = "v3.momoRtcMsgChangeRole";

    /* JADX INFO: renamed from: u3 */
    static String f14328u3 = "v3.momoRtcMsgOnChangeRole";

    /* JADX INFO: renamed from: v3 */
    static String f14329v3 = "v3.momoRtcMsgOnKicked";

    /* JADX INFO: renamed from: A1 */
    private Object f14330A1;

    /* JADX INFO: renamed from: A2 */
    private String f14331A2;

    /* JADX INFO: renamed from: B1 */
    private PipelineConcurrentHashMap f14332B1;

    /* JADX INFO: renamed from: B2 */
    private String f14333B2;

    /* JADX INFO: renamed from: C1 */
    private volatile boolean f14334C1;

    /* JADX INFO: renamed from: C2 */
    private final Map<Integer, SurfaceViewRenderer> f14335C2;

    /* JADX INFO: renamed from: D1 */
    private String f14336D1;

    /* JADX INFO: renamed from: D2 */
    Timer f14337D2;

    /* JADX INFO: renamed from: E0 */
    private boolean f14338E0;

    /* JADX INFO: renamed from: E1 */
    private String f14339E1;

    /* JADX INFO: renamed from: E2 */
    private boolean f14340E2;

    /* JADX INFO: renamed from: F0 */
    private boolean f14341F0;

    /* JADX INFO: renamed from: F1 */
    public SurfaceTexture f14342F1;

    /* JADX INFO: renamed from: F2 */
    private Handler f14343F2;

    /* JADX INFO: renamed from: G0 */
    private String f14344G0;

    /* JADX INFO: renamed from: G1 */
    private pcmDataAvailableCallback f14345G1;

    /* JADX INFO: renamed from: G2 */
    private boolean f14346G2;

    /* JADX INFO: renamed from: H0 */
    private yw00 f14347H0;

    /* JADX INFO: renamed from: H1 */
    private int f14348H1;

    /* JADX INFO: renamed from: H2 */
    private boolean f14349H2;

    /* JADX INFO: renamed from: I0 */
    private wb1 f14350I0;

    /* JADX INFO: renamed from: I1 */
    private int f14351I1;

    /* JADX INFO: renamed from: I2 */
    private MRtcPusherHandler f14352I2;

    /* JADX INFO: renamed from: J0 */
    private long f14353J0;

    /* JADX INFO: renamed from: J1 */
    private String f14354J1;

    /* JADX INFO: renamed from: J2 */
    private int f14355J2;

    /* JADX INFO: renamed from: K0 */
    private int f14356K0;

    /* JADX INFO: renamed from: K1 */
    private boolean f14357K1;

    /* JADX INFO: renamed from: K2 */
    private int f14358K2;

    /* JADX INFO: renamed from: L0 */
    private int f14359L0;

    /* JADX INFO: renamed from: L1 */
    private boolean f14360L1;

    /* JADX INFO: renamed from: L2 */
    private volatile boolean f14361L2;

    /* JADX INFO: renamed from: M0 */
    private long f14362M0;

    /* JADX INFO: renamed from: M1 */
    private boolean f14363M1;

    /* JADX INFO: renamed from: M2 */
    private boolean f14364M2;

    /* JADX INFO: renamed from: N0 */
    private long f14365N0;

    /* JADX INFO: renamed from: N1 */
    private float f14366N1;

    /* JADX INFO: renamed from: N2 */
    private long f14367N2;

    /* JADX INFO: renamed from: O0 */
    private long f14368O0;

    /* JADX INFO: renamed from: O1 */
    private float f14369O1;

    /* JADX INFO: renamed from: O2 */
    private boolean f14370O2;

    /* JADX INFO: renamed from: P0 */
    private MMRtcStats f14371P0;

    /* JADX INFO: renamed from: P1 */
    private float f14372P1;

    /* JADX INFO: renamed from: P2 */
    private int f14373P2;

    /* JADX INFO: renamed from: Q0 */
    private IMMRtcEngineEventInterface.RemoteVideoStats f14374Q0;

    /* JADX INFO: renamed from: Q1 */
    private float f14375Q1;

    /* JADX INFO: renamed from: Q2 */
    private volatile boolean f14376Q2;

    /* JADX INFO: renamed from: R0 */
    private IMMRtcEngineEventInterface.LocalVideoStats f14377R0;

    /* JADX INFO: renamed from: R1 */
    IMMRtcEngineEventInterface f14378R1;

    /* JADX INFO: renamed from: R2 */
    private boolean f14379R2;

    /* JADX INFO: renamed from: S */
    private final String f14380S;

    /* JADX INFO: renamed from: S0 */
    private PipelineConcurrentHashMap<Long, ley> f14381S0;

    /* JADX INFO: renamed from: S1 */
    Runnable f14382S1;

    /* JADX INFO: renamed from: S2 */
    private final BroadcastReceiver f14383S2;

    /* JADX INFO: renamed from: T */
    private boolean f14384T;

    /* JADX INFO: renamed from: T0 */
    private PipelineConcurrentHashMap<Long, a9y> f14385T0;

    /* JADX INFO: renamed from: T1 */
    private AudioVolumeInfo[] f14386T1;

    /* JADX INFO: renamed from: U */
    private MMRtcEngine f14387U;

    /* JADX INFO: renamed from: U0 */
    private boolean f14388U0;

    /* JADX INFO: renamed from: U1 */
    private MRtcAudioHandler f14389U1;

    /* JADX INFO: renamed from: V */
    private int f14390V;

    /* JADX INFO: renamed from: V0 */
    private boolean f14391V0;

    /* JADX INFO: renamed from: V1 */
    private MRtcAudioHandlerEx f14392V1;

    /* JADX INFO: renamed from: W */
    private EGLContext f14393W;

    /* JADX INFO: renamed from: W0 */
    private int f14394W0;

    /* JADX INFO: renamed from: W1 */
    private MRtcEventHandler f14395W1;

    /* JADX INFO: renamed from: X */
    private volatile boolean f14396X;

    /* JADX INFO: renamed from: X0 */
    private int f14397X0;

    /* JADX INFO: renamed from: X1 */
    private MRtcChannelHandler f14398X1;

    /* JADX INFO: renamed from: Y */
    private boolean f14399Y;

    /* JADX INFO: renamed from: Y0 */
    private volatile int f14400Y0;

    /* JADX INFO: renamed from: Y1 */
    private MRtcTokenWillExpireHander f14401Y1;

    /* JADX INFO: renamed from: Z */
    private boolean f14402Z;

    /* JADX INFO: renamed from: Z0 */
    private String f14403Z0;

    /* JADX INFO: renamed from: Z1 */
    private ymw f14404Z1;

    /* JADX INFO: renamed from: a1 */
    private z1l0 f14405a1;

    /* JADX INFO: renamed from: a2 */
    private MRtcQualityHandler f14406a2;

    /* JADX INFO: renamed from: b1 */
    private a2l0 f14407b1;

    /* JADX INFO: renamed from: b2 */
    private MRtcReceiveSeiHandler f14408b2;

    /* JADX INFO: renamed from: c1 */
    private cbl0 f14409c1;

    /* JADX INFO: renamed from: c2 */
    private MRtcConnectHandler f14410c2;

    /* JADX INFO: renamed from: d1 */
    private MRtcRealLayoutNotifyHander f14411d1;

    /* JADX INFO: renamed from: d2 */
    private MRtcClientRoleChangedHandler f14412d2;

    /* JADX INFO: renamed from: e1 */
    private sml.InterfaceC19992a f14413e1;

    /* JADX INFO: renamed from: e2 */
    private zmw f14414e2;

    /* JADX INFO: renamed from: f1 */
    private boolean f14415f1;

    /* JADX INFO: renamed from: f2 */
    private zmw f14416f2;

    /* JADX INFO: renamed from: g1 */
    private boolean f14417g1;

    /* JADX INFO: renamed from: g2 */
    private jjw f14418g2;

    /* JADX INFO: renamed from: h1 */
    private hu00.InterfaceC17392a f14419h1;

    /* JADX INFO: renamed from: h2 */
    private vmw f14420h2;

    /* JADX INFO: renamed from: i1 */
    private float f14421i1;

    /* JADX INFO: renamed from: i2 */
    private C4094f f14422i2;

    /* JADX INFO: renamed from: j1 */
    private float f14423j1;

    /* JADX INFO: renamed from: j2 */
    private boolean f14424j2;

    /* JADX INFO: renamed from: k0 */
    private int f14425k0;

    /* JADX INFO: renamed from: k1 */
    public int f14426k1;

    /* JADX INFO: renamed from: k2 */
    private boolean f14427k2;

    /* JADX INFO: renamed from: l1 */
    private int f14428l1;

    /* JADX INFO: renamed from: l2 */
    private boolean f14429l2;

    /* JADX INFO: renamed from: m1 */
    private int f14430m1;

    /* JADX INFO: renamed from: m2 */
    private boolean f14431m2;

    /* JADX INFO: renamed from: n1 */
    private int f14432n1;

    /* JADX INFO: renamed from: n2 */
    private MMLiveTranscoding f14433n2;

    /* JADX INFO: renamed from: o1 */
    private int f14434o1;

    /* JADX INFO: renamed from: o2 */
    private boolean f14435o2;

    /* JADX INFO: renamed from: p0 */
    private int f14436p0;

    /* JADX INFO: renamed from: p1 */
    private qmr f14437p1;

    /* JADX INFO: renamed from: p2 */
    private String f14438p2;

    /* JADX INFO: renamed from: q1 */
    protected int f14439q1;

    /* JADX INFO: renamed from: q2 */
    private int f14440q2;

    /* JADX INFO: renamed from: r1 */
    private boolean f14441r1;

    /* JADX INFO: renamed from: r2 */
    private String f14442r2;

    /* JADX INFO: renamed from: s1 */
    private String f14443s1;

    /* JADX INFO: renamed from: s2 */
    private int f14444s2;

    /* JADX INFO: renamed from: t1 */
    private int f14445t1;

    /* JADX INFO: renamed from: t2 */
    private long f14446t2;

    /* JADX INFO: renamed from: u1 */
    private Object f14447u1;

    /* JADX INFO: renamed from: u2 */
    private AudioResampleUtils f14448u2;

    /* JADX INFO: renamed from: v1 */
    private int f14449v1;

    /* JADX INFO: renamed from: v2 */
    private AudioResampleUtils f14450v2;

    /* JADX INFO: renamed from: w1 */
    private EglBase f14451w1;

    /* JADX INFO: renamed from: w2 */
    ByteBuffer f14452w2;

    /* JADX INFO: renamed from: x1 */
    private boolean f14453x1;

    /* JADX INFO: renamed from: x2 */
    ByteBuffer f14454x2;

    /* JADX INFO: renamed from: y1 */
    private boolean f14455y1;

    /* JADX INFO: renamed from: y2 */
    private hgd0 f14456y2;

    /* JADX INFO: renamed from: z1 */
    private boolean f14457z1;

    /* JADX INFO: renamed from: z2 */
    private eix f14458z2;

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$a */
    public class RunnableC4089a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f14460a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ byte[] f14461b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f14462c;

        public RunnableC4089a(byte[] bArr, byte[] bArr2, long j) {
            this.f14460a = bArr;
            this.f14461b = bArr2;
            this.f14462c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (MoMoRtcPushFilter.this.f14447u1) {
                try {
                    if (MoMoRtcPushFilter.this.f14411d1 != null) {
                        MoMoRtcPushFilter.this.f14411d1.OnRealLayoutChange(this.f14460a, this.f14461b, 4, this.f14462c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$b */
    public class C4090b implements ExtAudioWrapper.InterfaceC4108i {
        public C4090b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4108i
        /* JADX INFO: renamed from: a */
        public void mo20060a(String str) {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4108i
        /* JADX INFO: renamed from: b */
        public void mo20061b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4108i
        public int getStreamerType() {
            return 4;
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c */
    public class C4091c implements IMMRtcEngineEventInterface {

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14466a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f14467b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f14468c;

            /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a$a, reason: collision with other inner class name */
            public class C22693a implements RendererCommon.RendererEvents {
                public C22693a() {
                }

                @Override // com.momo.rtcbase.RendererCommon.RendererEvents
                public void onFirstFrameRendered() {
                }

                @Override // com.momo.rtcbase.RendererCommon.RendererEvents
                public void onFrameResolutionChanged(int i, int i2, int i3) {
                }
            }

            /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a$b */
            public class b implements cbl0.InterfaceC16103c {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ SurfaceViewRenderer f14471a;

                public b(SurfaceViewRenderer surfaceViewRenderer) {
                    this.f14471a = surfaceViewRenderer;
                }

                @Override // p149l.cbl0.InterfaceC16103c
                /* JADX INFO: renamed from: a */
                public void mo20064a(SurfaceTexture surfaceTexture) {
                    a aVar = a.this;
                    surfaceTexture.setDefaultBufferSize(aVar.f14467b, aVar.f14468c);
                    this.f14471a.surfaceTextureCreated(surfaceTexture);
                    MoMoRtcPushFilter.this.f14387U.setupRemoteVideo(new VideoCanvas(this.f14471a, 1, a.this.f14466a));
                }
            }

            /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a$c */
            public class c implements cbl0.InterfaceC16103c {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ SurfaceViewRenderer f14473a;

                public c(SurfaceViewRenderer surfaceViewRenderer) {
                    this.f14473a = surfaceViewRenderer;
                }

                @Override // p149l.cbl0.InterfaceC16103c
                /* JADX INFO: renamed from: a */
                public void mo20064a(SurfaceTexture surfaceTexture) {
                    a aVar = a.this;
                    surfaceTexture.setDefaultBufferSize(aVar.f14467b, aVar.f14468c);
                    this.f14473a.surfaceTextureCreated(surfaceTexture);
                    MoMoRtcPushFilter.this.f14387U.setupRemoteVideo(new VideoCanvas(this.f14473a, 1, a.this.f14466a));
                }
            }

            public a(int i, int i2, int i3) {
                this.f14466a = i;
                this.f14467b = i2;
                this.f14468c = i3;
            }

            @Override // java.lang.Runnable
            @RequiresApi(api = 15)
            public void run() {
                if (MoMoRtcPushFilter.this.f14451w1 == null) {
                    MoMoRtcPushFilter.this.f14451w1 = EglBase.create();
                }
                SurfaceViewRenderer surfaceViewRendererCreateRendererView = MMRtcEngine.CreateRendererView(MoMoRtcPushFilter.this.m19726W1());
                surfaceViewRendererCreateRendererView.init(MoMoRtcPushFilter.this.f14451w1.getEglBaseContext(), new C22693a());
                surfaceViewRendererCreateRendererView.setZOrderOnTop(true);
                surfaceViewRendererCreateRendererView.setZOrderMediaOverlay(true);
                synchronized (MoMoRtcPushFilter.this.f14335C2) {
                    MoMoRtcPushFilter.this.f14335C2.put(Integer.valueOf(this.f14466a), surfaceViewRendererCreateRendererView);
                }
                if (MoMoRtcPushFilter.this.f14387U != null) {
                    MoMoRtcPushFilter.this.f14387U.setupRemoteVideo(new VideoCanvas(surfaceViewRendererCreateRendererView, 1, this.f14466a));
                }
                if (!MoMoRtcPushFilter.this.f14424j2 && MoMoRtcPushFilter.this.f14409c1 == null && MoMoRtcPushFilter.this.f14407b1 == null) {
                    if (MoMoRtcPushFilter.this.f14405a1 == null || MoMoRtcPushFilter.this.f14455y1 || MoMoRtcPushFilter.this.f14453x1) {
                        return;
                    }
                    ii70.m136344d().m136348c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelAdded: userID=" + this.f14466a);
                    MoMoRtcPushFilter.this.f14405a1.mo19137a((long) this.f14466a, surfaceViewRendererCreateRendererView, this.f14467b, this.f14468c);
                    return;
                }
                if (MoMoRtcPushFilter.this.f14332B1.containsKey(Integer.valueOf(this.f14466a))) {
                    return;
                }
                MoMoRtcPushFilter.this.f14332B1.put(Integer.valueOf(this.f14466a), Integer.valueOf(this.f14466a));
                if (MoMoRtcPushFilter.this.f14409c1 != null) {
                    MoMoRtcPushFilter.this.f14409c1.mo19143a(this.f14466a, new b(surfaceViewRendererCreateRendererView), this.f14467b, this.f14468c);
                    return;
                }
                ski0 ski0Var = new ski0(this.f14466a, this.f14467b, this.f14468c, new c(surfaceViewRendererCreateRendererView));
                if (MoMoRtcPushFilter.this.f14407b1 == null || MoMoRtcPushFilter.this.f14455y1 || MoMoRtcPushFilter.this.f14453x1) {
                    return;
                }
                ii70.m136344d().m136348c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + this.f14466a);
                MoMoRtcPushFilter.this.f14407b1.mo94620a((long) this.f14466a, ski0Var, this.f14467b, this.f14468c);
            }
        }

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14475a;

            public b(int i) {
                this.f14475a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MoMoRtcPushFilter.this.f14405a1 != null) {
                    ii70.m136344d().m136348c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelAdded Audio: userID=" + this.f14475a);
                    MoMoRtcPushFilter.this.f14405a1.mo19137a((long) this.f14475a, null, 176, 176);
                }
            }
        }

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f14477a;

            public c(int i) {
                this.f14477a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14270J = MomoCodec.MomoCodecState.WAIT;
                boolean z = MoMoRtcPushFilter.this.f14437p1.f155326h1;
                C4091c c4091c = C4091c.this;
                if (z) {
                    MoMoRtcPushFilter.this.f14419h1.mo128349g(4353, this.f14477a, 0, MoMoRtcPushFilter.this);
                } else if (MoMoRtcPushFilter.this.f14419h1 != null) {
                    MoMoRtcPushFilter.this.f14419h1.mo128349g(4352, this.f14477a, 0, MoMoRtcPushFilter.this);
                    C4091c c4091c2 = C4091c.this;
                    c4091c2.onUserOffline(MoMoRtcPushFilter.this.f14437p1.f182013B0, 1);
                }
                if (MoMoRtcPushFilter.this.f14395W1 != null) {
                    MoMoRtcPushFilter.this.f14395W1.onError(this.f14477a);
                }
            }
        }

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$d */
        public class d extends TimerTask {
            public d() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(MoMoRtcPushFilter.this.f14336D1) || MoMoRtcPushFilter.this.f14387U == null) {
                    return;
                }
                MoMoRtcPushFilter.this.f14387U.setSei(MoMoRtcPushFilter.this.m19961P5());
            }
        }

        public C4091c() {
        }

        /* JADX INFO: renamed from: a */
        private void m20062a(IMMRtcEngineEventInterface.LocalVideoStats localVideoStats) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onLocalVideoStatsstats:" + localVideoStats);
            MoMoRtcPushFilter.this.f14377R0 = localVideoStats;
            if (MoMoRtcPushFilter.this.f14388U0 = false) {
                MoMoRtcPushFilter.this.f14388U0 = true;
                MoMoRtcPushFilter.this.f14391V0 = false;
                MoMoRtcPushFilter.this.f14419h1.mo128349g(4099, 0, 0, MoMoRtcPushFilter.this);
                MoMoRtcPushFilter.m19804K3(MoMoRtcPushFilter.this);
            }
            if (MoMoRtcPushFilter.this.f14404Z1 != null) {
                MoMoRtcPushFilter.this.f14418g2.f118323a = MoMoRtcPushFilter.this.f14377R0.sentBitrate;
                MoMoRtcPushFilter.this.f14418g2.f118324b = MoMoRtcPushFilter.this.f14377R0.sentFrameRate;
                MoMoRtcPushFilter.this.f14404Z1.mo19140b(MoMoRtcPushFilter.this.f14418g2);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m20063b(IMMRtcEngineEventInterface.RemoteVideoStats remoteVideoStats) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", " onRemoteVideoStatsstats:" + remoteVideoStats + "w " + remoteVideoStats.width + " h " + remoteVideoStats.height + " bits " + remoteVideoStats.receivedBitrate + " fps " + remoteVideoStats.receivedFrameRate);
            MoMoRtcPushFilter.this.f14374Q0 = remoteVideoStats;
            if (MoMoRtcPushFilter.this.f14404Z1 != null) {
                MoMoRtcPushFilter.this.f14420h2.f182161b = MoMoRtcPushFilter.this.f14374Q0.delay;
                MoMoRtcPushFilter.this.f14420h2.f182163d = MoMoRtcPushFilter.this.f14374Q0.height;
                MoMoRtcPushFilter.this.f14420h2.f182161b = MoMoRtcPushFilter.this.f14374Q0.delay;
                MoMoRtcPushFilter.this.f14420h2.f182164e = MoMoRtcPushFilter.this.f14374Q0.receivedBitrate;
                MoMoRtcPushFilter.this.f14420h2.f182165f = MoMoRtcPushFilter.this.f14374Q0.receivedFrameRate;
                MoMoRtcPushFilter.this.f14420h2.f182166g = MoMoRtcPushFilter.this.f14374Q0.rxStreamType;
                MoMoRtcPushFilter.this.f14420h2.f182160a = MoMoRtcPushFilter.this.f14374Q0.uid;
                MoMoRtcPushFilter.this.f14420h2.f182162c = MoMoRtcPushFilter.this.f14374Q0.width;
                MoMoRtcPushFilter.this.f14404Z1.mo19139a(MoMoRtcPushFilter.this.f14420h2);
            }
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void didOnKickedOut(String str, int i, int i2, int i3) {
            if (MoMoRtcPushFilter.this.f14456y2 != null) {
                MoMoRtcPushFilter.this.f14456y2.m130813j(str, i2);
            }
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj;
        }

        public void finalize() throws Throwable {
            super.finalize();
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onActiveSpeaker(int i) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onApiCallExecuted(int i, String str, String str2) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioEffectFinished(int i) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioMixingBegin() {
            MoMoRtcPushFilter.m19803K2(MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioMixingError() {
            MoMoRtcPushFilter.m19803K2(MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioMixingFinished() {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onAudioMixingFinished");
            MoMoRtcPushFilter.this.f14334C1 = false;
            MoMoRtcPushFilter.this.m19798I6(null, 2, 0);
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onAudioMixingFinished();
            }
            MoMoRtcPushFilter.m19803K2(MoMoRtcPushFilter.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioQuality(int i, int i2, short s, short s2) {
            ley leyVar = (ley) MoMoRtcPushFilter.this.f14381S0.get(Long.valueOf(i));
            if (leyVar != null) {
                leyVar.m149627j(s, s2);
            }
            if (MoMoRtcPushFilter.this.f14406a2 != null) {
                MoMoRtcPushFilter.this.f14406a2.onAudioQuality(i, i2, s, s2);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioRouteChanged(int i) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            int length;
            if (MoMoRtcPushFilter.this.f14396X && (length = audioVolumeInfoArr.length) > 0) {
                MoMoRtcPushFilter.this.f14386T1 = audioVolumeInfoArr;
                if (MoMoRtcPushFilter.this.f14392V1 != null) {
                    AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[length];
                    int i2 = -1;
                    for (int i3 = 0; i3 < length; i3++) {
                        AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                        if (MoMoRtcPushFilter.this.f14386T1[i3].uid == 0) {
                            i2 = i3;
                        }
                        audioVolumeWeight.uid = (int) MoMoRtcPushFilter.this.f14386T1[i3].uid;
                        audioVolumeWeight.volume = (MoMoRtcPushFilter.this.f14386T1[i3].volume * 1.0f) / 10.0f;
                        audioVolumeWeightArr[i3] = audioVolumeWeight;
                    }
                    MoMoRtcPushFilter.this.f14392V1.onAudioVolumeIndication(audioVolumeWeightArr, i);
                    if (i2 > 0) {
                        AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                        audioVolumeWeight2.uid = MoMoRtcPushFilter.this.f14437p1.f182013B0;
                        if (MoMoRtcPushFilter.this.f14349H2) {
                            audioVolumeWeight2.volume = 0.0f;
                        } else {
                            audioVolumeWeight2.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 10.0f;
                        }
                        MoMoRtcPushFilter.this.f14392V1.onAudioVolumeIndication(new AudioVolumeWeight[]{audioVolumeWeight2}, i);
                    }
                }
                if (MoMoRtcPushFilter.this.f14389U1 != null) {
                    AudioVolumeWeight[] audioVolumeWeightArr2 = new AudioVolumeWeight[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        AudioVolumeWeight audioVolumeWeight3 = new AudioVolumeWeight();
                        long j = MoMoRtcPushFilter.this.f14386T1[i4].uid;
                        MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                        if (j == 0) {
                            moMoRtcPushFilter.f14386T1[i4].uid = MoMoRtcPushFilter.this.f14437p1.f182013B0;
                            if (MoMoRtcPushFilter.this.f14349H2) {
                                audioVolumeWeight3.volume = 0.0f;
                            } else {
                                audioVolumeWeight3.volume = (MoMoRtcPushFilter.this.f14386T1[i4].volume * 1.0f) / 10.0f;
                            }
                            audioVolumeWeight3.uid = (int) MoMoRtcPushFilter.this.f14386T1[i4].uid;
                        } else {
                            audioVolumeWeight3.uid = (int) moMoRtcPushFilter.f14386T1[i4].uid;
                            audioVolumeWeight3.volume = (MoMoRtcPushFilter.this.f14386T1[i4].volume * 1.0f) / 10.0f;
                        }
                        audioVolumeWeightArr2[i4] = audioVolumeWeight3;
                    }
                    MoMoRtcPushFilter.this.f14389U1.onAudioVolumeIndication(audioVolumeWeightArr2, i);
                }
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onCameraFocusAreaChanged(Rect rect) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onCameraReady() {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onChannelList(ArrayList<String> arrayList) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onClientRoleChanged(int i, int i2) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131787l("onClientRoleChanged", Integer.valueOf(i), Integer.valueOf(i2));
            if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203837b) {
                int i3 = MoMoRtcPushFilter.this.f14445t1;
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                if (i3 == 1) {
                    moMoRtcPushFilter.mo19739h2();
                } else {
                    moMoRtcPushFilter.mo19737f2();
                }
            }
            if (MoMoRtcPushFilter.this.f14412d2 != null) {
                MoMoRtcPushFilter.this.f14412d2.onClientRoleChanged(i, i2);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onConnectionBanned() {
            Log.e("unint", "onConnectionBanned");
            if (MoMoRtcPushFilter.this.f14410c2 != null) {
                MoMoRtcPushFilter.this.f14410c2.onReconnectTimeout();
            }
            MoMoRtcPushFilter.this.f14419h1.mo128349g(4353, 10, 0, MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onConnectionInterrupted() {
            Log.e("unint", "onConnectionInterrupted");
            MoMoRtcPushFilter.m19837Z3(MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onConnectionLost() {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131787l("onConnectionLost");
            Log.e("unint", "onConnectionLost=");
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onConnectionLost();
            }
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203901y0 = 10L;
            MoMoRtcPushFilter.this.m19736e2(4353, 10);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onError(int i) {
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            if (i == 503) {
                ((MediaBaseCodecFilter) moMoRtcPushFilter).f14269I.m131787l("onDNSError", Integer.valueOf(i));
            } else {
                ((MediaBaseCodecFilter) moMoRtcPushFilter).f14269I.m131787l("onError", Integer.valueOf(i));
            }
            Log.e("unint", "onError=" + i);
            if (i == 0) {
                return;
            }
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onError(i);
            }
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onError,err:" + i);
            Log.e("->MOMORTC", "onError, err: " + i);
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203901y0 = (long) i;
            MoMoRtcPushFilter.this.f14343F2.post(new c(i));
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onFirstLocalAudioFrame(int i) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onFirstLocalVideoFrame(int i, int i2, int i3) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onFirstLocalVideoFrame:width:" + i + ",height:" + i2 + ",elapsed:" + i3);
            ii70.m136344d().m136348c("MediaEngineCallback", "onFirstLocalVideoFrame  " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i3);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onFirstRemoteAudioFrame(int i, int i2) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onFirstRemoteVideoDecoded(int i, int i2, int i3, int i4) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onFirstRemoteVideoFrame(int i, int i2, int i3, int i4) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131787l("onFirstRemoteVideoFrame", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onFirstRemoteVideoDecoded:uid" + i + "width" + i2 + "height" + i3 + "elapsed" + i4);
            if (MoMoRtcPushFilter.this.m19726W1() == null) {
                return;
            }
            MoMoRtcPushFilter.this.f14343F2.postAtFrontOfQueue(new a(i, i2, i3));
            long j = i;
            a9y a9yVar = (a9y) MoMoRtcPushFilter.this.f14385T0.get(Long.valueOf(j));
            if (a9yVar != null && !a9yVar.m95471d()) {
                n8c.m158483a("zhengjijian", "agora get first idr");
                a9yVar.m95474g(true);
                if (MoMoRtcPushFilter.this.f14445t1 == 1) {
                    ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131780c(true, a9yVar.m95470c(), j, 0L, 0L, 0L);
                }
                MoMoRtcPushFilter.this.f14419h1.mo128349g(8198, i, 0, MoMoRtcPushFilter.this);
            }
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onFirstRemoteVideoDecoded(j, i2, i3, i4);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onHttpError(int i, String str) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131787l("onHttpError", Integer.valueOf(i), str);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onJoinChannelSuccess(String str, int i, int i2) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131787l("onJoinChannelSuccess", str, Integer.valueOf(i), Integer.valueOf(i2));
            StringBuilder sb = new StringBuilder(" onJoinChannelSuccess ");
            sb.append(str);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(i);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            long j = i;
            sb.append(4294967295L & j);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(i2);
            sb.append(";getSabineEnable=");
            sb.append(MoMoRtcPushFilter.this.f14387U.getSabineEnable());
            Log.e("unint", sb.toString());
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203837b = true;
            MoMoRtcPushFilter.this.m19744l2(MediaBaseCodecFilter.CodecFilterState.FILTER_PLAY);
            if (MoMoRtcPushFilter.this.f14387U != null) {
                MoMoRtcPushFilter.this.f14396X = true;
                if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203888s != 0) {
                    MoMoRtcPushFilter.this.f14387U.setRoomMode((int) ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203888s);
                }
            }
            if (MoMoRtcPushFilter.this.f14336D1 != null && MoMoRtcPushFilter.this.f14437p1.f155326h1) {
                Log.e("MoMoRtcPushFilter", "zhangjialiang onJoinChannelSuccess setJsonForPostion");
                MoMoRtcPushFilter.this.f14457z1 = false;
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                moMoRtcPushFilter.m20053w6(moMoRtcPushFilter.f14336D1);
            }
            fjx.m121638R().m121647C1(MoMoRtcPushFilter.this.f14387U.getSabineEnable() == 1 ? 0 : 1);
            MoMoRtcPushFilter.this.m20057y6(1.0f);
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14270J = MomoCodec.MomoCodecState.START;
            MoMoRtcPushFilter.this.mo19732c2();
            MoMoRtcPushFilter.this.m19731b2();
            MoMoRtcPushFilter.this.f14419h1.mo128349g(4096, 0, 0, MoMoRtcPushFilter.this);
            MoMoRtcPushFilter.this.f14419h1.mo128349g(CommandMessage.COMMAND_GET_PUSH_STATUS, 0, 0, MoMoRtcPushFilter.this);
            if ((MoMoRtcPushFilter.this.f14455y1 || MoMoRtcPushFilter.this.f14453x1) && MoMoRtcPushFilter.this.f14348H1 != 0) {
                MoMoRtcPushFilter.this.m19811N5();
            }
            if (MoMoRtcPushFilter.this.f14435o2 && MoMoRtcPushFilter.this.f14387U != null) {
                MoMoRtcPushFilter.this.f14387U.startChannelMediaRelay(MoMoRtcPushFilter.this.f14440q2, MoMoRtcPushFilter.this.f14438p2);
                MoMoRtcPushFilter.this.f14435o2 = false;
            }
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onJoinChannelSuccess(str, j, i2);
            }
            int i3 = MoMoRtcPushFilter.this.f14437p1.f177148k;
            MoMoRtcPushFilter moMoRtcPushFilter2 = MoMoRtcPushFilter.this;
            if (i3 > 0) {
                moMoRtcPushFilter2.m19850d5(moMoRtcPushFilter2.f14437p1.f155326h1, MoMoRtcPushFilter.this.f14437p1.f177148k, MoMoRtcPushFilter.this.f14437p1.f177150l, MoMoRtcPushFilter.this.f14351I1, 15, MoMoRtcPushFilter.this.f14437p1.f182043v0);
            } else {
                moMoRtcPushFilter2.m19850d5(moMoRtcPushFilter2.f14437p1.f155326h1, MoMoRtcPushFilter.this.f14437p1.f177164s, MoMoRtcPushFilter.this.f14437p1.f177166t, MoMoRtcPushFilter.this.f14351I1, 15, MoMoRtcPushFilter.this.f14437p1.f182043v0);
            }
            MoMoRtcPushFilter.this.m19855f6();
            MoMoRtcPushFilter moMoRtcPushFilter3 = MoMoRtcPushFilter.this;
            if (moMoRtcPushFilter3.f14337D2 == null) {
                moMoRtcPushFilter3.f14337D2 = new Timer();
                MoMoRtcPushFilter.this.f14337D2.schedule(new d(), 100L, 1000L);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onLastmileQuality(int i) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onLastmileQuality " + i);
            MoMoRtcPushFilter.this.f14419h1.mo128349g(4101, i, 0, MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onLeaveChannel(MMRtcStats mMRtcStats) {
            Log.e("unint", "onLeaveChannel");
            ii70.m136344d().m136348c("MoMoRtcPushFilter", getClass().getSimpleName() + " onLeaveChannelstats:" + mMRtcStats);
            MoMoRtcPushFilter.this.f14396X = false;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14270J = MomoCodec.MomoCodecState.STOP;
            if (mMRtcStats != null) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203784B = mMRtcStats.txBytes;
                n8c.m158483a("AgoraJzheng", "" + mMRtcStats.txBytes + "/" + mMRtcStats.txBytes);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onLocalVideoQualityLimited(IMMRtcEngineEventInterface.LocalVideoStats localVideoStats, IMMRtcEngineEventInterface.QualityLimitationReason qualityLimitationReason) {
            int i = localVideoStats.targetBitrate * 1000;
            int i2 = localVideoStats.targetFrameRate;
            if (i == 0 || i2 == 0 || (MoMoRtcPushFilter.this.f14355J2 == i && MoMoRtcPushFilter.this.f14358K2 == i2)) {
                n8c.m158483a("DYNAMIC_SCALING", "xxxxxxxxx from [ " + MoMoRtcPushFilter.this.f14355J2 + ", " + ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14281s.f182016E0 + " ] To [ " + i + ", " + localVideoStats.targetFrameRate + ",[[sentBitrate " + localVideoStats.sentBitrate + ", " + localVideoStats.sentFrameRate + Constants.AES_SUFFIX);
                return;
            }
            if (MoMoRtcPushFilter.this.f14352I2 != null) {
                MoMoRtcPushFilter.this.f14352I2.onPushLevelChange(i, i2);
            }
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            moMoRtcPushFilter.f14355J2 = ((MediaBaseCodecFilter) moMoRtcPushFilter).f14281s.f177109H;
            MoMoRtcPushFilter moMoRtcPushFilter2 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter2.f14358K2 = ((MediaBaseCodecFilter) moMoRtcPushFilter2).f14281s.f182016E0;
            n8c.m158483a("DYNAMIC_SCALING", "from [ " + MoMoRtcPushFilter.this.f14355J2 + ", " + ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14281s.f182016E0 + " ] To [ " + i + ", " + localVideoStats.targetFrameRate + Constants.AES_SUFFIX);
            if (MoMoRtcPushFilter.this.f14355J2 > i || MoMoRtcPushFilter.this.f14358K2 > i2) {
                MoMoRtcPushFilter.this.m19829V5(1);
            } else {
                MoMoRtcPushFilter.this.m19829V5(0);
            }
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14281s.f177109H = i;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14281s.f182016E0 = i2;
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onLog(int i, String str) {
            if (i == 1) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131789n(str);
                return;
            }
            if (i == 2) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131790o(str);
                return;
            }
            if (i == 3) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131791p(str);
                return;
            }
            if (i == 4) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131788m(str);
                return;
            }
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            if (i == 5) {
                ((MediaBaseCodecFilter) moMoRtcPushFilter).f14269I.m131792q(str);
            } else {
                moMoRtcPushFilter.m19838Z6(i, str);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onMediaEngineLoadSuccess() {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onMediaEngineLoadSuccess");
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onMediaEngineStartCallSuccess() {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onMicrophoneEnabled(boolean z) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onNetworkQuality(int i, int i2, int i3) {
            if (MoMoRtcPushFilter.this.f14406a2 != null) {
                MoMoRtcPushFilter.this.f14406a2.onNetworkQuality(i, i2, i3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onReceiveSEI(int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("bType")) {
                    int iOptInt = jSONObject.optInt("bType");
                    ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203888s = iOptInt;
                    hjx.m131421d("MoMoRtcPushFilter", "onReceiveSEI getbType: " + iOptInt);
                }
                if (jSONObject.has(com.tencent.connect.common.Constants.f57189TS)) {
                    long jM121707X = fjx.m121638R().m121707X() - Long.valueOf(jSONObject.optString(com.tencent.connect.common.Constants.f57189TS)).longValue();
                    ley leyVar = (ley) MoMoRtcPushFilter.this.f14381S0.get(Long.valueOf(i));
                    if (leyVar != null) {
                        leyVar.f127786E++;
                        leyVar.f127785D = (int) (((long) leyVar.f127785D) + jM121707X);
                    }
                }
            } catch (JSONException | Exception unused) {
            }
            if (MoMoRtcPushFilter.this.f14408b2 == null || MoMoRtcPushFilter.this.f14437p1 == null) {
                return;
            }
            MoMoRtcPushFilter.this.f14408b2.OnReceiveH264Sei(str.getBytes(), i, "");
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onRefreshRecordingServiceStatus(int i) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onRejoinChannelSuccess(String str, int i, int i2) {
            ii70.m136344d().m136348c("MyEngineEventHandler", "onRejoinChannelSuccess " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
            Log.e("unint", "onRejoinChannelSuccess " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onRemoteVideoFrame(int i, VideoFrame videoFrame) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onRemoteVideoStateChanged(int i, int i2) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onRequestToken() {
            if (MoMoRtcPushFilter.this.f14398X1 != null) {
                MoMoRtcPushFilter.this.f14398X1.onRequestChannelKey();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onRtcStats(MMRtcStats mMRtcStats) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onRtcStatsstats:" + mMRtcStats);
            if (MoMoRtcPushFilter.this.f14374Q0 == null) {
                MoMoRtcPushFilter.this.f14374Q0 = new IMMRtcEngineEventInterface.RemoteVideoStats();
            }
            long j = 0;
            long j2 = 0;
            boolean z = false;
            boolean z2 = true;
            for (MMRtcRemoteStats mMRtcRemoteStats : mMRtcStats.remoteStats) {
                n8c.m158483a("AgoraJzheng", "onRtcStats " + mMRtcRemoteStats.uid);
                ley leyVar = (ley) MoMoRtcPushFilter.this.f14381S0.get(Long.valueOf(mMRtcRemoteStats.uid));
                MMRtcRemoteAudioStats mMRtcRemoteAudioStats = mMRtcRemoteStats.AudioStats;
                if (mMRtcRemoteAudioStats != null && leyVar != null) {
                    leyVar.f127802j += mMRtcRemoteAudioStats.audioCache;
                    leyVar.f127803k = mMRtcRemoteAudioStats.audioLost;
                    int i = mMRtcRemoteAudioStats.audioPlayLag;
                    leyVar.f127806n = i;
                    long j3 = mMRtcRemoteAudioStats.aReceiveSize;
                    leyVar.f127798f = j3;
                    leyVar.f127812t = mMRtcRemoteAudioStats.expandCount;
                    leyVar.f127813u = mMRtcRemoteAudioStats.expandCartonCount;
                    j2 += j3;
                    if (i == 0) {
                        z2 = false;
                    }
                    leyVar.f127818z += mMRtcRemoteAudioStats.audiLossTimestamp;
                    leyVar.f127782A += mMRtcRemoteAudioStats.networkRtt;
                    leyVar.f127783B++;
                    z = true;
                }
                MMRtcRemoteVideoStats mMRtcRemoteVideoStats = mMRtcRemoteStats.videoStats;
                if (mMRtcRemoteVideoStats != null && leyVar != null) {
                    leyVar.f127794b = mMRtcRemoteVideoStats.videoBitrate;
                    leyVar.f127801i = mMRtcRemoteVideoStats.videoheight;
                    leyVar.f127800h = mMRtcRemoteVideoStats.videowidth;
                    leyVar.f127804l = mMRtcRemoteVideoStats.videoDelay;
                    leyVar.f127805m = (int) mMRtcRemoteVideoStats.videoLost;
                    long j4 = mMRtcRemoteVideoStats.vReceiveSize;
                    leyVar.f127797e = j4;
                    leyVar.f127795c += (long) mMRtcRemoteVideoStats.videoFramerate;
                    j += j4;
                    leyVar.f127784C++;
                }
                if (leyVar != null) {
                    leyVar.f127796d = leyVar.f127797e + leyVar.f127798f;
                }
                j2 = j2;
            }
            if (z && z2) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203882q++;
            }
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203867l = j2;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203864k = j;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203861j = j2 + j;
            m20063b(MoMoRtcPushFilter.this.f14374Q0);
            if (MoMoRtcPushFilter.this.f14377R0 == null) {
                MoMoRtcPushFilter.this.f14377R0 = new IMMRtcEngineEventInterface.LocalVideoStats();
            }
            MoMoRtcPushFilter.this.f14377R0.sentFrameRate = mMRtcStats.videoStats.videoFramerate;
            MoMoRtcPushFilter.this.f14377R0.sentBitrate = mMRtcStats.videoStats.videoBitrate;
            m20062a(MoMoRtcPushFilter.this.f14377R0);
            MoMoRtcPushFilter.this.f14371P0 = mMRtcStats;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203796H = MoMoRtcPushFilter.this.f14371P0.videoStats.vEncodeCount;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203784B = MoMoRtcPushFilter.this.f14371P0.txBytes;
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            moMoRtcPushFilter.f14353J0 = moMoRtcPushFilter.f14371P0.videoStats.vEncodeSize;
            MoMoRtcPushFilter moMoRtcPushFilter2 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter2.f14362M0 = moMoRtcPushFilter2.f14371P0.audioStats.aEncodeSize;
            MoMoRtcPushFilter moMoRtcPushFilter3 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter3.f14365N0 = moMoRtcPushFilter3.f14371P0.audioStats.aSendSize;
            MoMoRtcPushFilter moMoRtcPushFilter4 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter4.f14368O0 = moMoRtcPushFilter4.f14371P0.videoStats.vSendSize;
            MoMoRtcPushFilter.this.f14419h1.mo128349g(4098, 0, 0, MoMoRtcPushFilter.this);
            MoMoRtcPushFilter.m19837Z3(MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamInjectedStatus(String str, int i, int i2) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamMessage(int i, int i2, String str) {
            if (MoMoRtcPushFilter.this.f14398X1 != null) {
                MoMoRtcPushFilter.this.f14398X1.onStreamMessage(i, i2, str.getBytes());
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
            if (MoMoRtcPushFilter.this.f14398X1 != null) {
                MoMoRtcPushFilter.this.f14398X1.onStreamMessageError(i, i2, i3, i4, i5);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamPublished(String str, int i) {
            synchronized (MoMoRtcPushFilter.this.f14330A1) {
                if (i == 0) {
                    try {
                        MoMoRtcPushFilter.this.f14457z1 = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamUnpublished(String str) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onStreamPublished finish:url=" + str);
            synchronized (MoMoRtcPushFilter.this.f14330A1) {
                MoMoRtcPushFilter.this.f14457z1 = false;
            }
            synchronized (MoMoRtcPushFilter.this.f14447u1) {
                try {
                    if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203835a0 != null && !MoMoRtcPushFilter.this.f14361L2 && !MoMoRtcPushFilter.this.f14340E2) {
                        ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131764B(((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203835a0, ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203898x);
                        MoMoRtcPushFilter.this.f14387U.addPublishStreamUrl(((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203835a0, true);
                        MoMoRtcPushFilter.this.f14419h1.mo128349g(CommandMessage.COMMAND_CLEAR_NOTIFICATION_TYPE, 0, 0, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onTokenPrivilegeWillExpire(String str) {
            if (MoMoRtcPushFilter.this.f14401Y1 != null) {
                MoMoRtcPushFilter.this.f14401Y1.onTokenPrivilegeWillExpire(str);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onTranscodingUpdated() {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onUserEnableLocalVideo(int i, boolean z) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onUserEnableVideo(int i, boolean z) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onUserJoined(int i, int i2) {
            Log.e("unint", "onUserJoined uid=" + i);
            try {
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                if (moMoRtcPushFilter.m19730a2(moMoRtcPushFilter.m19726W1())) {
                    ii70.m136344d().m136346a("MoMoRtcPushFilter", "onMemberEnter:##### setSpeakerphoneOn(false)");
                    if (MoMoRtcPushFilter.this.f14387U != null) {
                        fjx.m121638R().m121648D();
                    }
                } else {
                    ii70.m136344d().m136346a("MoMoRtcPushFilter", "onMemberEnter:##### setSpeakerphoneOn(true)");
                    if (MoMoRtcPushFilter.this.f14387U != null) {
                        fjx.m121638R().m121648D();
                    }
                }
            } catch (Exception unused) {
            }
            long j = i;
            a9y a9yVar = new a9y(j, j6f.LATITUDE_SOUTH.equals(MoMoRtcPushFilter.this.mo20052w1()) ? 1 : 2);
            MoMoRtcPushFilter.this.f14385T0.put(Long.valueOf(j), a9yVar);
            if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14268H.f203842c1 == 1) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131782e(true, a9yVar.m95470c(), j, 0L, 0L);
            }
            ii70.m136344d().m136348c("MoMoRtcPushFilter", getClass().getSimpleName() + " onUserJoined:uid:" + i + ",elapsed:" + i2);
            if ((MoMoRtcPushFilter.this.f14455y1 || MoMoRtcPushFilter.this.f14453x1) && MoMoRtcPushFilter.this.f14437p1.f155327i1 != i) {
                a9yVar.m95473f(true);
                a9yVar.m95474g(true);
                if (MoMoRtcPushFilter.this.f14445t1 == 1) {
                    ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131780c(true, a9yVar.m95470c(), j, 0L, 0L, 0L);
                }
                MoMoRtcPushFilter.this.f14419h1.mo128349g(8198, i, 0, MoMoRtcPushFilter.this);
                MoMoRtcPushFilter.this.f14343F2.post(new b(i));
            }
            MoMoRtcPushFilter.this.f14381S0.put(Long.valueOf(j), new ley(j));
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onJoinChannelSuccess("", j, i2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onUserMuteAudio(int i, boolean z) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onUserMuteAudiouid:" + i + ",muted:" + z);
            ley leyVar = (ley) MoMoRtcPushFilter.this.f14381S0.get(Long.valueOf((long) i));
            if (leyVar != null) {
                leyVar.m149624g(z);
            }
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onUserMuteAudio(i, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onUserMuteVideo(int i, boolean z) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onUserMuteVideouid:" + i + ",muted:" + z);
            ley leyVar = (ley) MoMoRtcPushFilter.this.f14381S0.get(Long.valueOf((long) i));
            if (leyVar != null) {
                leyVar.m149625h(z);
            }
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onUserMuteVideo(i, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onUserOffline(int i, int i2) {
            Log.e("unint", "onUserOffline uid=" + i);
            long j = 0;
            if (MoMoRtcPushFilter.this.f14381S0 != null) {
                long j2 = i;
                if (MoMoRtcPushFilter.this.f14381S0.containsKey(Long.valueOf(j2))) {
                    ley leyVar = (ley) MoMoRtcPushFilter.this.f14381S0.get(Long.valueOf(j2));
                    j = leyVar != null ? leyVar.f127796d : 0L;
                    MoMoRtcPushFilter.this.f14381S0.remove(Long.valueOf(j2));
                }
            }
            long j3 = j;
            if (MoMoRtcPushFilter.this.f14385T0 != null) {
                long j4 = i;
                if (MoMoRtcPushFilter.this.f14385T0.containsKey(Long.valueOf(j4))) {
                    n8c.m158483a("zhengjijian", "onMemberExit userid " + i + " reason " + i2);
                    if (MoMoRtcPushFilter.this.f14445t1 == 1) {
                        ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131781d(true, ((a9y) MoMoRtcPushFilter.this.f14385T0.get(Long.valueOf(j4))).m95470c(), j4, i2);
                        ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14269I.m131783f(true, ((a9y) MoMoRtcPushFilter.this.f14385T0.get(Long.valueOf(j4))).m95470c(), j3, 0L, j4, i2);
                    }
                    MoMoRtcPushFilter.this.f14419h1.mo128349g(8199, i, 0, MoMoRtcPushFilter.this);
                }
            }
            if (MoMoRtcPushFilter.this.f14405a1 != null && (!MoMoRtcPushFilter.this.f14424j2 || MoMoRtcPushFilter.this.f14455y1 || MoMoRtcPushFilter.this.f14453x1)) {
                ii70.m136344d().m136348c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelRemove userID=" + i);
                MoMoRtcPushFilter.this.f14405a1.mo19138b((long) i, i2);
            }
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onUserOffline(i, i2);
            }
            if (MoMoRtcPushFilter.this.f14332B1 != null && (MoMoRtcPushFilter.this.f14332B1.containsKey(Integer.valueOf(i)) || i == MoMoRtcPushFilter.this.f14437p1.f182013B0)) {
                if (i != MoMoRtcPushFilter.this.f14437p1.f182013B0) {
                    MoMoRtcPushFilter.this.f14332B1.remove(Integer.valueOf(i));
                }
                boolean z = MoMoRtcPushFilter.this.f14424j2;
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                if (z) {
                    if (moMoRtcPushFilter.f14407b1 != null) {
                        ii70.m136344d().m136348c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelRemoveExt userID=" + i);
                        MoMoRtcPushFilter.this.f14407b1.mo94621b((long) i, i2);
                    }
                } else if (moMoRtcPushFilter.f14409c1 != null) {
                    MoMoRtcPushFilter.this.f14409c1.mo19144b(i, i2);
                }
            }
            synchronized (MoMoRtcPushFilter.this.f14335C2) {
                try {
                    SurfaceViewRenderer surfaceViewRenderer = (SurfaceViewRenderer) MoMoRtcPushFilter.this.f14335C2.remove(Integer.valueOf(i));
                    if (surfaceViewRenderer != null) {
                        surfaceViewRenderer.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onVideoSizeChanged(int i, int i2, int i3) {
            if (MoMoRtcPushFilter.this.f14456y2 != null) {
                MoMoRtcPushFilter.this.f14456y2.m130814r(i, i2, i3);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onVideoStopped() {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onWarning(int i) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "onWarning" + i);
            if (i == 701) {
                MoMoRtcPushFilter.this.m19798I6(null, -1, 0);
            }
            if (MoMoRtcPushFilter.this.f14395W1 != null) {
                MoMoRtcPushFilter.this.f14395W1.onWarning(i);
            }
        }

        @NonNull
        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$d */
    public class RunnableC4092d implements Runnable {
        public RunnableC4092d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MoMoRtcPushFilter.this.f14451w1 != null) {
                MoMoRtcPushFilter.this.f14451w1.release();
                MoMoRtcPushFilter.this.f14451w1 = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$e */
    public class RunnableC4093e implements Runnable {
        public RunnableC4093e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = MoMoRtcPushFilter.this.f14437p1.f155326h1;
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            if (z) {
                moMoRtcPushFilter.f14419h1.mo128349g(4353, 201, 0, MoMoRtcPushFilter.this);
                MoMoRtcPushFilter.this.m19736e2(4353, 201);
            } else {
                IMMRtcEngineEventInterface iMMRtcEngineEventInterface = moMoRtcPushFilter.f14378R1;
                if (iMMRtcEngineEventInterface != null) {
                    iMMRtcEngineEventInterface.onUserOffline(moMoRtcPushFilter.f14437p1.f182013B0, 201);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$f */
    public class C4094f extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f14482a;

        public C4094f(String str) {
            super(str);
            this.f14482a = false;
        }

        /* JADX INFO: renamed from: a */
        public void m20065a() {
            this.f14482a = true;
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f14482a) {
                try {
                    Thread.sleep(66L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ztk.f204735f == null) {
                    ztk.f204735f = new byte[((MoMoRtcPushFilter.this.f14437p1.f177152m * MoMoRtcPushFilter.this.f14437p1.f177154n) * 3) / 2];
                }
                MoMoRtcPushFilter.this.mo19667o1(ByteBuffer.wrap(ztk.f204735f));
            }
        }
    }

    @RequiresApi(api = 15)
    public MoMoRtcPushFilter(Context context, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar) {
        super(context);
        this.f14380S = "MoMoRtcPushFilter";
        this.f14384T = true;
        this.f14390V = -1;
        this.f14396X = false;
        this.f14399Y = false;
        this.f14402Z = false;
        this.f14425k0 = 0;
        this.f14436p0 = 0;
        this.f14338E0 = false;
        this.f14341F0 = true;
        this.f14344G0 = null;
        this.f14353J0 = 0L;
        this.f14356K0 = 0;
        this.f14359L0 = 0;
        this.f14362M0 = 0L;
        this.f14365N0 = 0L;
        this.f14368O0 = 0L;
        this.f14381S0 = new PipelineConcurrentHashMap<>();
        this.f14385T0 = new PipelineConcurrentHashMap<>();
        this.f14388U0 = false;
        this.f14391V0 = true;
        this.f14394W0 = 0;
        this.f14397X0 = 0;
        this.f14400Y0 = 0;
        this.f14403Z0 = "1e6127d73cd4d405905aa6f2ad5e1a67";
        this.f14405a1 = null;
        this.f14407b1 = null;
        this.f14409c1 = null;
        this.f14411d1 = null;
        this.f14415f1 = false;
        this.f14417g1 = false;
        this.f14421i1 = 1.8f;
        this.f14423j1 = 1.0f;
        this.f14426k1 = 44100;
        this.f14428l1 = 0;
        this.f14430m1 = 0;
        this.f14432n1 = 0;
        this.f14434o1 = 0;
        this.f14439q1 = -1;
        this.f14443s1 = null;
        this.f14445t1 = 1;
        this.f14447u1 = new Object();
        this.f14449v1 = 0;
        this.f14453x1 = false;
        this.f14455y1 = false;
        this.f14457z1 = false;
        this.f14330A1 = new Object();
        this.f14332B1 = new PipelineConcurrentHashMap();
        this.f14334C1 = false;
        this.f14342F1 = null;
        this.f14348H1 = 0;
        this.f14351I1 = 750000;
        this.f14354J1 = "";
        this.f14357K1 = false;
        this.f14360L1 = false;
        this.f14363M1 = false;
        this.f14366N1 = 0.0f;
        this.f14369O1 = 0.0f;
        this.f14372P1 = 0.0f;
        this.f14375Q1 = 0.0f;
        this.f14382S1 = null;
        this.f14386T1 = null;
        this.f14408b2 = null;
        this.f14414e2 = new zmw();
        this.f14416f2 = new zmw();
        this.f14418g2 = new jjw();
        this.f14420h2 = new vmw();
        this.f14424j2 = false;
        this.f14427k2 = false;
        this.f14429l2 = true;
        this.f14431m2 = false;
        this.f14433n2 = null;
        this.f14435o2 = false;
        this.f14442r2 = "";
        this.f14444s2 = 15;
        this.f14446t2 = 0L;
        this.f14448u2 = null;
        this.f14450v2 = null;
        this.f14452w2 = ByteBuffer.allocate(8192);
        this.f14454x2 = ByteBuffer.allocate(8192);
        this.f14331A2 = null;
        this.f14333B2 = null;
        this.f14335C2 = new ArrayMap();
        this.f14337D2 = null;
        this.f14340E2 = false;
        this.f14343F2 = new Handler(Looper.getMainLooper());
        this.f14346G2 = false;
        this.f14349H2 = false;
        this.f14355J2 = 0;
        this.f14358K2 = 0;
        this.f14361L2 = false;
        this.f14364M2 = false;
        this.f14367N2 = 0L;
        this.f14370O2 = false;
        this.f14373P2 = 0;
        this.f14376Q2 = false;
        this.f14379R2 = false;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.momo.piplineext.codec.MoMoRtcPushFilter.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent.getAction().equals("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                    if (intent.getIntExtra("state", 0) == 0) {
                        if (MoMoRtcPushFilter.this.f14387U == null || true != fjx.m121638R().m121648D()) {
                            return;
                        }
                        MoMoRtcPushFilter.this.f14387U.setParameters("{\"che.audio.enable.ns\":true}");
                        return;
                    }
                    if (intent.getIntExtra("state", 0) == 1 && MoMoRtcPushFilter.this.f14387U != null && true == fjx.m121638R().m121648D()) {
                        MoMoRtcPushFilter.this.f14387U.setParameters("{\"che.audio.enable.ns\":false}");
                    }
                }
            }
        };
        this.f14383S2 = broadcastReceiver;
        ContextUtils.initialize(context);
        this.f14347H0 = yw00Var;
        this.f14437p1 = (qmr) vlwVar;
        this.f14388U0 = false;
        this.f14391V0 = true;
        this.f14419h1 = interfaceC17392a;
        m19870m5(vlwVar);
        zmx zmxVar = this.f14268H;
        zmxVar.f203843d = 260L;
        zmxVar.f203848e1 = String.valueOf(hashCode());
        this.f14268H.f203851f1 = 1L;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        if (context != null) {
            ii5.m136342l(context, broadcastReceiver, intentFilter);
        }
        this.f14269I.m131787l("MoMoRtcPushFilter", this.f14387U);
    }

    /* JADX INFO: renamed from: B5 */
    private int m19774B5() {
        int i = 0;
        if (!this.f14455y1 && !this.f14346G2) {
            i = 1;
        }
        return i ^ 1;
    }

    /* JADX INFO: renamed from: C5 */
    private final void m19778C5(String str, int i, String str2, String str3) {
        if (this.f14387U != null) {
            this.f14268H.f203787C0 = m19875o5(this.f14425k0);
            int iM121791u0 = fjx.m121638R().m121791u0();
            if (iM121791u0 == 0) {
                this.f14387U.setAudioProfile(0, 4);
            } else if (iM121791u0 == 1) {
                this.f14387U.setAudioProfile(4, 3);
            } else if (iM121791u0 == 2 || iM121791u0 == 3) {
                this.f14387U.setAudioProfile(5, 3);
            } else {
                MMRtcEngine mMRtcEngine = this.f14387U;
                if (iM121791u0 != 4) {
                    mMRtcEngine.setAudioProfile(0, 4);
                } else {
                    mMRtcEngine.setSteroAudioCapture(true);
                    this.f14387U.setAudioProfile(5, 3);
                }
            }
            if (!this.f14360L1) {
                fjx.m121638R().m121794v0();
            }
            m20026l5(this.f14341F0);
            this.f14415f1 = false;
            this.f14387U.registerAudioFrameObserver(null);
            if (this.f14453x1 || this.f14424j2 || this.f14427k2 || this.f14413e1 != null) {
                this.f14387U.registerAudioFrameObserver(this);
                this.f14415f1 = true;
            }
            if (this.f14441r1) {
                m19782D5("1");
            }
            m19802J6();
            MMRtcEngine mMRtcEngine2 = this.f14387U;
            if (mMRtcEngine2 != null && this.f14429l2) {
                mMRtcEngine2.setDefaultAudioRoutetoSpeakerphone(true);
            }
            qmr qmrVar = this.f14437p1;
            int i2 = qmrVar.f177148k;
            if (i2 > 0) {
                m19850d5(qmrVar.f155326h1, i2, qmrVar.f177150l, this.f14351I1, 15, qmrVar.f182043v0);
            } else {
                m19850d5(qmrVar.f155326h1, qmrVar.f177164s, qmrVar.f177166t, this.f14351I1, 15, qmrVar.f182043v0);
            }
            Log.e("MoMoRtcPushFilter", "zhangjialiang joinChannel############# begin");
            this.f14387U.enableMiddleGroundSignal(this.f14363M1);
            Log.e("MoMoRtcPushFilter", "joinChannel#############" + this.f14387U.joinChannel(this.f14443s1, str, null, i, str2, str3, this.f14331A2, TextUtils.isEmpty(this.f14333B2) ? 0L : Long.parseLong(this.f14333B2)));
            this.f14441r1 = true;
            this.f14387U.setAudioLevel(iM121791u0);
            m20057y6(1.0f);
        }
    }

    /* JADX INFO: renamed from: D5 */
    private final void m19782D5(String str) {
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "leaveChannel >>>>>" + str);
        synchronized (this.f14447u1) {
            try {
                if (this.f14387U != null) {
                    String str2 = this.f14281s.f182043v0;
                    if (str2 != null && !TextUtils.isEmpty(str2)) {
                        this.f14387U.removePublishStreamUrl(this.f14281s.f182043v0);
                    }
                    Log.e("unint", "leaveChannel behin 2431");
                    this.f14387U.leaveChannel();
                    Log.e("unint", "leaveChannel end 2433");
                    this.f14387U.registerAudioFrameObserver(null);
                    this.f14415f1 = false;
                }
                this.f14441r1 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f14437p1.f155323e1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I6 */
    public void m19798I6(Object obj, int i, int i2) {
        za1 za1VarM20080C2;
        u3m u3mVar = this.f14271K;
        if (u3mVar == null || (za1VarM20080C2 = ((ExtAudioWrapper) u3mVar).m20080C2()) == null) {
            return;
        }
        za1VarM20080C2.mo18373a(obj, i, i2);
    }

    /* JADX INFO: renamed from: J6 */
    private void m19802J6() {
        if (this.f14437p1 == null) {
            return;
        }
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "setVideoProfileEx1 bitrate:" + this.f14437p1.f177152m + "<>" + this.f14437p1.f177154n + "<>" + this.f14437p1.f177109H + "<mergecanvasWidth>" + this.f14437p1.f177148k);
        m20026l5(this.f14341F0);
        if (this.f14455y1) {
            return;
        }
        this.f14387U.setParameters("{\"che.video.keyFrameInterval\":1}");
        qmr qmrVar = this.f14437p1;
        if (qmrVar.f182017F0 && qmrVar.m198870d() == 1) {
            MMRtcEngine mMRtcEngine = this.f14387U;
            qmr qmrVar2 = this.f14437p1;
            mMRtcEngine.setVideoProfile(qmrVar2.f177154n, qmrVar2.f177152m, this.f14444s2, qmrVar2.f177109H);
        } else {
            MMRtcEngine mMRtcEngine2 = this.f14387U;
            qmr qmrVar3 = this.f14437p1;
            mMRtcEngine2.setVideoProfile(qmrVar3.f177152m, qmrVar3.f177154n, this.f14444s2, qmrVar3.f177109H);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ okw m19803K2(MoMoRtcPushFilter moMoRtcPushFilter) {
        moMoRtcPushFilter.getClass();
        return null;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ int m19804K3(MoMoRtcPushFilter moMoRtcPushFilter) {
        int i = moMoRtcPushFilter.f14394W0;
        moMoRtcPushFilter.f14394W0 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N5 */
    public void m19811N5() {
        if (this.f14268H.f203840c == 0) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "AGORA_PUBLISHING");
            this.f14419h1.mo128349g(4103, 0, 0, this);
            this.f14268H.f203840c = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: O5 */
    private void m19814O5(byte[] bArr, byte[] bArr2) {
        Handler handler;
        long j = this.f14437p1.f182013B0;
        if (this.f14411d1 == null || (handler = this.f14343F2) == null) {
            return;
        }
        handler.post(new RunnableC4089a(bArr, bArr2, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V5 */
    public void m19829V5(int i) {
        this.f14419h1.mo128349g(8197, i, 0, this);
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ anw m19837Z3(MoMoRtcPushFilter moMoRtcPushFilter) {
        moMoRtcPushFilter.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z6 */
    public void m19838Z6(int i, String str) {
        String str2;
        switch (i) {
            case 11:
                str2 = f14302U2;
                break;
            case 12:
                str2 = f14303V2;
                break;
            case 13:
                str2 = f14304W2;
                break;
            case 14:
                str2 = f14305X2;
                break;
            case 15:
                str2 = f14306Y2;
                break;
            case 16:
                str2 = f14307Z2;
                break;
            case 17:
                str2 = f14308a3;
                break;
            case 18:
                str2 = f14309b3;
                break;
            case 19:
                str2 = f14310c3;
                break;
            case 20:
                str2 = f14311d3;
                break;
            case 21:
                str2 = f14312e3;
                break;
            case 22:
                str2 = f14313f3;
                break;
            case 23:
                str2 = f14314g3;
                break;
            case 24:
                str2 = f14315h3;
                break;
            case 25:
                str2 = f14316i3;
                break;
            case 26:
                str2 = f14317j3;
                break;
            case 27:
                str2 = f14318k3;
                break;
            case 28:
                str2 = f14319l3;
                break;
            case 29:
                str2 = f14320m3;
                break;
            case 30:
                str2 = f14321n3;
                break;
            case 31:
                str2 = f14322o3;
                break;
            case 32:
                str2 = f14323p3;
                break;
            case 33:
                str2 = f14324q3;
                break;
            case 34:
                str2 = f14325r3;
                break;
            case 35:
                str2 = f14326s3;
                break;
            case 36:
                str2 = f14327t3;
                break;
            case 37:
                str2 = f14328u3;
                break;
            case 38:
                str2 = f14329v3;
                break;
            default:
                str2 = null;
                break;
        }
        if (str2 != null) {
            this.f14269I.m131793r(str2, str);
        }
    }

    /* JADX INFO: renamed from: a7 */
    private void m19841a7() {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setExternalVideoSource(true, this.f14384T, true);
        }
    }

    /* JADX INFO: renamed from: b5 */
    private final void m19844b5(int i, int i2) {
        qmr qmrVar = this.f14437p1;
        qmrVar.f155323e1 = i;
        qmrVar.f155324f1 = i2;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!line.contains("Qualcomm") && !line.contains("qualcomm") && !line.contains("MSM")) {
                    line.contains("msm");
                }
            }
            fileReader.close();
        } catch (IOException unused) {
        }
        m19841a7();
        if (this.f14387U != null) {
            this.f14269I.m131787l("configEngine", Integer.valueOf(i), Integer.valueOf(i2));
            this.f14387U.setClientRole(i);
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m19847c5(String str) {
        MMLiveTranscoding mMLiveTranscoding;
        try {
            if (this.f14387U == null || (mMLiveTranscoding = this.f14433n2) == null || mMLiveTranscoding.transcodingUserMap == null || !this.f14396X || str == null || TextUtils.isEmpty(str) || this.f14433n2.transcodingUserMap.size() <= 0) {
                return;
            }
            String string = "{canvas:{w:" + this.f14433n2.width + ",h:" + this.f14433n2.height + "conf:[";
            for (String str2 : this.f14433n2.transcodingUserMap.keySet()) {
                MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser = this.f14433n2.transcodingUserMap.get(str2);
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "llcqxl:<<<<<<<<<,uid:" + str2 + ",uid:" + mMLiveTranscodingUser.uid + ",x:" + mMLiveTranscodingUser.posx + ",y:" + mMLiveTranscodingUser.posy + ",width:" + mMLiveTranscodingUser.width + ",height:" + mMLiveTranscodingUser.height + ",alpha:" + mMLiveTranscodingUser.alpha + ",zOrder:" + mMLiveTranscodingUser.zOrder + ">>>>>>>>>>");
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append("{id:");
                sb.append(mMLiveTranscodingUser.uid);
                sb.append(",x:");
                sb.append(mMLiveTranscodingUser.posx);
                sb.append(",y:");
                sb.append(mMLiveTranscodingUser.posy);
                sb.append(",width:");
                sb.append(mMLiveTranscodingUser.width);
                sb.append(",height:");
                sb.append(mMLiveTranscodingUser.height);
                sb.append("}");
                string = sb.toString();
            }
            String str3 = string + Constants.AES_SUFFIX;
            MMLiveTranscoding mMLiveTranscoding2 = this.f14433n2;
            mMLiveTranscoding2.lowLatency = true;
            mMLiveTranscoding2.videoGop = 15;
            this.f14387U.setLiveTranscoding(mMLiveTranscoding2);
            m19814O5(str3.getBytes(), this.f14433n2.transcodingExtraInfo.getBytes());
            if (!this.f14442r2.equals(str)) {
                this.f14442r2 = str.substring(0);
                this.f14457z1 = false;
            }
            synchronized (this.f14330A1) {
                try {
                    if (!this.f14457z1 && !this.f14340E2) {
                        this.f14387U.addPublishStreamUrl(str, true);
                        this.f14457z1 = true;
                        Log.e("MoMoRtcPushFilter", "zhangjialiang onStreamPublished addPublishStreamUrl:url=" + str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "addPublishStreamUrl configLiveTransCoding");
        } catch (Exception e) {
            Log.e("MoMoRtcPushFilter", "zhangjialiang configLiveTransCoding :" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public void m19850d5(boolean z, int i, int i2, int i3, int i4, String str) {
        if (str == null) {
            str = "";
        }
        if (z) {
            if (this.f14433n2 == null) {
                this.f14433n2 = new MMLiveTranscoding();
            }
            int iM121782r0 = fjx.m121638R().m121782r0();
            MMLiveTranscoding mMLiveTranscoding = this.f14433n2;
            mMLiveTranscoding.width = i;
            mMLiveTranscoding.height = i2;
            mMLiveTranscoding.audioBitrate = iM121782r0 == 0 ? 128000 : iM121782r0 * 1000;
            mMLiveTranscoding.audioChannels = 2;
            mMLiveTranscoding.audioSampleRate = MMLiveTranscoding.MMLiveAudioSampleRateType.MMLiveAudioSampleRateType44100;
            mMLiveTranscoding.videoBitrate = i3;
            mMLiveTranscoding.videoFramerate = i4;
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", Constants.KEY_CONFIG + this.f14433n2);
            m19847c5(str);
            this.f14269I.m131787l("tanscode_aBitrate", Integer.valueOf(iM121782r0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f6 */
    public void m19855f6() {
        for (int i = 0; i < 6; i++) {
            Matrix matrix = new Matrix();
            matrix.mapVectors(f14301T2);
            qmr qmrVar = this.f14437p1;
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(qmrVar.f177152m, qmrVar.f177154n, VideoFrame.TextureBuffer.Type.RGB, this.texture_in, matrix, null, null, null);
            MMRtcEngine mMRtcEngine = this.f14387U;
            if (mMRtcEngine != null) {
                if (this.f14393W != null && !this.f14346G2) {
                    mMRtcEngine.pushExternalVideoFrame(new VideoFrame(textureBufferImpl, 0, System.nanoTime()), null);
                }
                n8c.m158485c("MoMoRtcPushFilter", "zhangjialiang unint pushExternalVideoFrame");
            }
        }
    }

    /* JADX INFO: renamed from: m5 */
    private MMRtcEngine m19870m5(vlw vlwVar) {
        this.f14281s = vlwVar;
        m20027l6(vlwVar.f177117P);
        this.f14338E0 = vlwVar.f177160q;
        if (this.f14387U == null) {
            this.f14378R1 = new C4091c();
            try {
                String str = this.f14403Z0;
                if (str == null || TextUtils.isEmpty(str)) {
                    this.f14387U = MMRtcEngine.create(m19726W1(), "1e6127d73cd4d405905aa6f2ad5e1a67", this.f14378R1);
                } else {
                    this.f14387U = MMRtcEngine.create(m19726W1(), this.f14403Z0, this.f14378R1);
                }
                n8c.m158487e("MoMoRtcPushFilter", "agora_sdk_ver: " + MMRtcEngine.getSdkVersion());
                this.f14387U.setParameters("{\"rtc.log_filter\":34781}");
                this.f14387U.setLogFile(this.f14354J1);
                this.f14387U.setLogFilter(15);
                this.f14415f1 = false;
                this.f14387U.registerAudioFrameObserver(null);
                this.f14387U.setRecordingAudioFrameParameters(this.f14426k1, 1, 2, 1024);
                this.f14387U.setPlaybackAudioFrameParameters(this.f14426k1, 1, 0, 1024);
                this.f14387U.setChannelProfile(1);
                this.f14387U.enableDualStreamMode(this.f14338E0);
                m20026l5(this.f14341F0);
            } catch (Exception unused) {
                throw new InvalidParameterException("RtcEngineEx.create error");
            }
        }
        vlw vlwVar2 = this.f14281s;
        if (vlwVar2 != null && vlwVar2.f177131b0) {
            this.f14384T = false;
        }
        return this.f14387U;
    }

    /* JADX INFO: renamed from: o5 */
    private int m19875o5(int i) {
        if (i == 0) {
            return 48000;
        }
        if (i == 1) {
            return 18000;
        }
        if (i == 2) {
            return 48000;
        }
        if (i == 3) {
            return 56000;
        }
        if (i == 4) {
            return 128000;
        }
        if (i != 5) {
            return this.f14437p1.f177120S;
        }
        return 192000;
    }

    /* JADX INFO: renamed from: p5 */
    private String m19878p5() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<Long, ley>> it = this.f14381S0.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ley value = it.next().getValue();
            if (i != 0) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(value.m149620b());
            i++;
            value.m149623e(value.m149619a(), value.m149622d());
        }
        if (i == 0) {
            sb.append("(0)");
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    private void release() {
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "MoMoRtcPushFilter release");
        this.f14269I.m131787l("release");
        this.f14361L2 = true;
        this.f14396X = false;
        synchronized (this.f14447u1) {
            try {
                this.f14268H.f203835a0 = null;
                if (this.f14387U != null) {
                    ii70.m136344d().m136348c("MoMoRtcPushFilter", "release >>>>>");
                    this.f14387U.registerAudioFrameObserver(null);
                    this.f14415f1 = false;
                    String str = this.f14281s.f182043v0;
                    if (str != null && !TextUtils.isEmpty(str)) {
                        this.f14387U.removePublishStreamUrl(this.f14281s.f182043v0);
                    }
                    Log.e("unint", "leaveChannel begin 2778");
                    this.f14387U.leaveChannel();
                    Log.e("unint", "leaveChannel end 2480");
                    MMRtcEngine.destroy();
                    this.f14387U = null;
                    this.f14411d1 = null;
                    this.f14396X = false;
                    m19744l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                    this.f14270J = MomoCodec.MomoCodecState.STOP;
                    mo19735d2();
                    this.f14419h1.mo128349g(4097, 0, 0, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wb1 wb1Var = this.f14350I0;
        if (wb1Var != null) {
            wb1Var.m202490f();
            this.f14350I0 = null;
        }
        AudioResampleUtils audioResampleUtils = this.f14448u2;
        if (audioResampleUtils != null) {
            audioResampleUtils.release();
            this.f14448u2 = null;
        }
        AudioResampleUtils audioResampleUtils2 = this.f14450v2;
        if (audioResampleUtils2 != null) {
            audioResampleUtils2.release();
            this.f14450v2 = null;
        }
        this.f14378R1 = null;
        this.f14343F2.post(new RunnableC4092d());
    }

    /* JADX INFO: renamed from: s5 */
    private void m19888s5(int i) {
        if (i > this.f14452w2.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + this.f14452w2.position());
            byteBufferAllocate.clear();
            if (this.f14452w2.position() > 0) {
                byteBufferAllocate.put(this.f14452w2.array(), 0, this.f14452w2.position());
            }
            this.f14452w2.clear();
            this.f14452w2 = byteBufferAllocate;
        }
    }

    /* JADX INFO: renamed from: t5 */
    private void m19892t5(int i) {
        if (i > this.f14454x2.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + this.f14454x2.position());
            byteBufferAllocate.clear();
            if (this.f14454x2.position() > 0) {
                byteBufferAllocate.put(this.f14454x2.array(), 0, this.f14454x2.position());
            }
            this.f14454x2.clear();
            this.f14454x2 = byteBufferAllocate;
        }
    }

    /* JADX INFO: renamed from: v5 */
    private IMMRtcEngineEventInterface.LocalVideoStats m19899v5() {
        return this.f14377R0;
    }

    /* JADX INFO: renamed from: w5 */
    private IMMRtcEngineEventInterface.RemoteVideoStats m19903w5() {
        return this.f14374Q0;
    }

    /* JADX INFO: renamed from: x5 */
    private String m19907x5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(com.tencent.connect.common.Constants.f57189TS)) {
                jSONObject.remove(com.tencent.connect.common.Constants.f57189TS);
            }
            jSONObject.put(com.tencent.connect.common.Constants.f57189TS, m19728Y1());
            if (jSONObject.has("bType")) {
                jSONObject.remove("bType");
            }
            jSONObject.put("bType", this.f14268H.f203888s);
            if (jSONObject.has(BaseSei.CONF) && this.f14453x1) {
                jSONObject.remove(BaseSei.CONF);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo19646A() {
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: A0 */
    public int mo19914A0() {
        qmr qmrVar = this.f14437p1;
        return qmrVar.f177148k > 0 ? qmrVar.f177150l : qmrVar.f177166t;
    }

    /* JADX INFO: renamed from: A5 */
    public long m19915A5() {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            return mMRtcEngine.getAudioMixingCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: A6 */
    public void m19916A6(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.f14345G1 = pcmdataavailablecallback;
        if (pcmdataavailablecallback != null) {
            m19994Y5(true);
        } else {
            m19994Y5(false);
        }
    }

    /* JADX INFO: renamed from: B6 */
    public void m19917B6(int i) {
        this.f14269I.m131787l("setRole", Integer.valueOf(i), Integer.valueOf(this.f14400Y0));
        this.f14445t1 = i;
        if (this.f14387U == null || this.f14400Y0 != 1) {
            return;
        }
        this.f14387U.setClientRole(this.f14445t1);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C0 */
    public void mo19647C0() {
        mo19662f();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C1 */
    public void mo19648C1(String str) {
        n8c.m158485c("zk", "setMergeSei");
        synchronized (this.f14447u1) {
            try {
                this.f14339E1 = str;
                m20055x6(str);
                MMRtcEngine mMRtcEngine = this.f14387U;
                if (mMRtcEngine != null) {
                    mMRtcEngine.setSei(m19961P5());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C6 */
    public void m19918C6(int i, boolean z) {
        this.f14348H1 = i;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: D0 */
    public long mo19919D0() {
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: D1 */
    public String mo19920D1() {
        String str = this.f14268H.f203898x;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: D6 */
    public void m19921D6(int i) {
        this.f14439q1 = i;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: E0 */
    public void mo19922E0(dxl dxlVar) {
        this.f14266F = dxlVar;
    }

    /* JADX INFO: renamed from: E5 */
    public void m19923E5(boolean z) {
        if (this.f14387U != null) {
            this.f14269I.m131787l("muteAllRemoteAudioStream", Boolean.valueOf(z));
            this.f14387U.muteAllRemoteAudioStreams(z);
        }
    }

    /* JADX INFO: renamed from: E6 */
    public void m19924E6(hgd0 hgd0Var) {
        this.f14456y2 = hgd0Var;
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: F */
    public boolean mo19925F() {
        return this.f14417g1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: F0 */
    public int mo19926F0() {
        return this.f14432n1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: F1 */
    public long mo19927F1() {
        MMRtcStats mMRtcStats = this.f14371P0;
        if (mMRtcStats != null) {
            return mMRtcStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F5 */
    public void m19928F5(boolean z) {
        if (this.f14387U != null) {
            this.f14269I.m131787l("muteAllRemoteVideoStream", Boolean.valueOf(z));
            this.f14387U.muteAllRemoteVideoStreams(z);
        }
    }

    /* JADX INFO: renamed from: F6 */
    public void m19929F6(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        float f2 = f * 1.0f;
        this.f14423j1 = f2;
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.adjustAudioMixingVolume(f2);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: G0 */
    public long mo19930G0() {
        return 0L;
    }

    /* JADX INFO: renamed from: G5 */
    public void m19931G5(boolean z) {
        this.f14349H2 = z;
        this.f14269I.m131787l("muteLocalAudioStream", Boolean.valueOf(this.f14437p1.f155326h1), Boolean.valueOf(z));
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            if (this.f14437p1.f155326h1) {
                mMRtcEngine.muteLocalAudioStream(z);
                return;
            }
            this.f14269I.m131787l("muteLocalAudioStream, isHost, mute:", Boolean.FALSE, Boolean.valueOf(z));
            MMRtcEngine mMRtcEngine2 = this.f14387U;
            if (z) {
                mMRtcEngine2.adjustRecordingSignalVolume(((int) this.f14421i1) * 100);
            } else {
                mMRtcEngine2.adjustRecordingSignalVolume(((int) this.f14421i1) * 100);
                this.f14387U.muteLocalAudioStream(false);
            }
        }
    }

    /* JADX INFO: renamed from: G6 */
    public void m19932G6(boolean z) {
        if (z) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "set Stream ReplaceMode");
        }
        this.f14427k2 = z;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo19650H0(boolean z) {
        this.f14453x1 = z;
    }

    /* JADX INFO: renamed from: H5 */
    public void m19933H5(boolean z) {
        this.f14349H2 = z;
        if (this.f14387U != null) {
            this.f14269I.m131787l("muteLocalAudioStream", Boolean.valueOf(z));
            this.f14387U.muteLocalAudioStream(z);
        }
    }

    /* JADX INFO: renamed from: H6 */
    public void m19934H6(int i) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setAudioMixingPosition(i);
        }
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: I1 */
    public void mo19935I1() {
        this.f14417g1 = true;
    }

    /* JADX INFO: renamed from: I5 */
    public void m19936I5(boolean z) {
        this.f14346G2 = z;
        if (this.f14387U != null) {
            this.f14269I.m131787l("muteLocalVideoStream", Boolean.valueOf(z));
            this.f14387U.muteLocalVideoStream(z);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: J */
    public void mo19651J(String str) {
        n8c.m158485c("zk", "setSei" + this.f14339E1);
        synchronized (this.f14447u1) {
            try {
                this.f14336D1 = str;
                if (TextUtils.isEmpty(this.f14339E1)) {
                    m20053w6(str);
                } else {
                    m20055x6(this.f14339E1);
                }
                MMRtcEngine mMRtcEngine = this.f14387U;
                if (mMRtcEngine != null) {
                    mMRtcEngine.setSei(m19961P5());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: J0 */
    public long mo19937J0() {
        return 0L;
    }

    /* JADX INFO: renamed from: J5 */
    public void m19938J5(long j, boolean z) {
        if (this.f14387U != null) {
            this.f14269I.m131787l("muteRemoteAudioStream", Long.valueOf(j), Boolean.valueOf(z));
            this.f14387U.muteRemoteAudioStream((int) j, z);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public void m19939K4(MRtcEventHandler mRtcEventHandler) {
        this.f14395W1 = mRtcEventHandler;
    }

    /* JADX INFO: renamed from: K5 */
    public void m19940K5(long j, boolean z) {
        if (this.f14387U != null) {
            this.f14269I.m131787l("muteRemoteMsgStream", Long.valueOf(j), Boolean.valueOf(z));
            this.f14387U.muteRemoteMsgStream((int) j, z);
        }
    }

    /* JADX INFO: renamed from: K6 */
    public void m19941K6(z1l0 z1l0Var) {
        this.f14405a1 = z1l0Var;
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: L */
    public void mo19942L(sml.InterfaceC19992a interfaceC19992a) {
        this.f14413e1 = interfaceC19992a;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: L0 */
    public long mo19943L0() {
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: L1 */
    public long mo19944L1() {
        return 0L;
    }

    /* JADX INFO: renamed from: L5 */
    public void m19946L5(long j, boolean z) {
        if (this.f14387U != null) {
            this.f14269I.m131787l("muteRemoteVideoStream", Long.valueOf(j), Boolean.valueOf(z));
            this.f14387U.muteRemoteVideoStream((int) j, z);
        }
    }

    /* JADX INFO: renamed from: L6 */
    public void m19947L6(a2l0 a2l0Var) {
        this.f14407b1 = a2l0Var;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: M0 */
    public int mo19948M0() {
        return (int) this.f14268H.f203858i;
    }

    @Override // p149l.nbj, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: M1 */
    public void mo19653M1() {
        TextureBufferImpl textureBufferImpl;
        MMRtcEngine mMRtcEngine;
        yw00 yw00Var = this.f14347H0;
        if (yw00Var != null && this.f14393W != yw00Var.m216278l()) {
            this.f14393W = this.f14347H0.m216278l();
        }
        EGLContext eGLContext = this.f14393W;
        if (eGLContext != null && (mMRtcEngine = this.f14387U) != null) {
            mMRtcEngine.updateSharedContext(eGLContext);
        }
        if (this.texture_in == 0 || !this.f14396X || this.f14346G2) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.mapVectors(f14301T2);
        qmr qmrVar = this.f14437p1;
        if (qmrVar.f182017F0 && qmrVar.m198870d() == 1) {
            qmr qmrVar2 = this.f14437p1;
            textureBufferImpl = new TextureBufferImpl(qmrVar2.f177154n, qmrVar2.f177152m, VideoFrame.TextureBuffer.Type.RGB, this.texture_in, matrix, null, null, null);
        } else {
            qmr qmrVar3 = this.f14437p1;
            textureBufferImpl = new TextureBufferImpl(qmrVar3.f177152m, qmrVar3.f177154n, VideoFrame.TextureBuffer.Type.RGB, this.texture_in, matrix, null, null, null);
        }
        synchronized (this.f14447u1) {
            try {
                if (this.f14387U != null && !this.f14361L2) {
                    if (this.f14393W != null) {
                        this.f14387U.pushExternalVideoFrame(new VideoFrame(textureBufferImpl, 0, System.nanoTime()), null);
                    }
                    n8c.m158485c("MoMoRtcPushFilter", "zhangjialiang pushExternalVideoFrame");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zmx zmxVar = this.f14268H;
        long j = zmxVar.f203790E + 1;
        zmxVar.f203790E = j;
        if (j >= 30 || this.f14453x1) {
            m19811N5();
            if (this.f14367N2 <= 0) {
                this.f14367N2 = System.currentTimeMillis();
            }
        }
        if (!this.f14364M2 && this.f14268H.f203790E >= 120) {
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "Agora 推流成功 AGORA_RTMP_PUBLISHED");
            this.f14364M2 = true;
            this.f14419h1.mo128349g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, this);
        }
        if (this.f14364M2 || this.f14367N2 <= 0 || System.currentTimeMillis() - this.f14367N2 <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            return;
        }
        this.f14364M2 = true;
        this.f14419h1.mo128349g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, this);
    }

    /* JADX INFO: renamed from: M4 */
    public void m19949M4(MRtcAudioHandler mRtcAudioHandler) {
        this.f14389U1 = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: M5 */
    public void m19950M5(boolean z) {
        n8c.m158485c("zk", "--ktv,muteSingerAudioStream:" + this.f14431m2 + "-->" + z);
        this.f14431m2 = z;
    }

    /* JADX INFO: renamed from: M6 */
    public void m19951M6(String str) {
        if (this.f14433n2 == null) {
            this.f14433n2 = new MMLiveTranscoding();
        }
        m19847c5(this.f14437p1.f182043v0);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: N0 */
    public long mo19952N0() {
        MMRtcStats mMRtcStats = this.f14371P0;
        if (mMRtcStats != null) {
            return mMRtcStats.txBytes;
        }
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: N1 */
    public int mo19953N1() {
        return this.f14356K0;
    }

    /* JADX INFO: renamed from: N4 */
    public void m19954N4(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f14392V1 = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: N6 */
    public void m19955N6(int i, int i2, int i3, int i4) {
        this.f14351I1 = i;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: O0 */
    public long mo19956O0() {
        return this.f14362M0;
    }

    /* JADX INFO: renamed from: O6 */
    public void m19958O6(cbl0 cbl0Var) {
        this.f14409c1 = cbl0Var;
    }

    @Override // p149l.gw00.InterfaceC17174f
    /* JADX INFO: renamed from: P0 */
    public void mo19959P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
        this.f14430m1 = i4;
        this.f14432n1 = i2;
        this.f14434o1 = i3;
    }

    /* JADX INFO: renamed from: P4 */
    public void m19960P4(MRtcChannelHandler mRtcChannelHandler) {
        this.f14398X1 = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: P5 */
    public byte[] m19961P5() {
        byte[] bytes = "".getBytes();
        String str = this.f14336D1;
        if (str != null) {
            return m19907x5(str).getBytes();
        }
        String str2 = this.f14339E1;
        return str2 != null ? str2.getBytes() : bytes;
    }

    /* JADX INFO: renamed from: P6 */
    public void m19962P6(boolean z) {
        if (z) {
            this.f14387U.registerAudioFrameObserver(null);
            this.f14387U.registerAudioFrameObserver(this);
            this.f14415f1 = true;
        } else {
            if (this.f14413e1 != null || this.f14379R2) {
                return;
            }
            this.f14387U.registerAudioFrameObserver(null);
            this.f14415f1 = false;
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: Q0 */
    public int mo19963Q0() {
        return this.f14396X ? m20042r5() : m20049u5();
    }

    /* JADX INFO: renamed from: Q4 */
    public void m19964Q4(MRtcConnectHandler mRtcConnectHandler) {
        this.f14410c2 = mRtcConnectHandler;
    }

    /* JADX INFO: renamed from: Q5 */
    public void m19965Q5() {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).pauseAllEffects();
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public void m19966Q6(int i, double d) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).setVolumeOfEffect(i, ((float) d) * 100.0f);
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo19655R0(vlw vlwVar, EGLContext eGLContext) {
        int i = this.f14445t1;
        zmx zmxVar = this.f14268H;
        if (i == 1) {
            zmxVar.f203785B0 = "M".equals(mo20052w1()) ? "MrtcMaster" : "MrtcSlaver";
        } else {
            zmxVar.f203785B0 = "MrtcAudience";
        }
        super.mo19655R0(vlwVar, eGLContext);
        if (vlwVar.f177131b0 && !this.f14346G2 && !this.f14455y1 && this.f14422i2 == null) {
            C4094f c4094f = new C4094f("live-media-aFFrame");
            this.f14422i2 = c4094f;
            c4094f.start();
        }
        int i2 = vlwVar.f182016E0;
        this.f14444s2 = i2;
        if (i2 <= 0 || i2 > 30) {
            Log.e("unint", "error maxFps=" + this.f14444s2);
            this.f14444s2 = 30;
        }
        if (!(vlwVar instanceof qmr)) {
            throw new InvalidParameterException("Parameters error");
        }
        ii70 ii70VarM136344d = ii70.m136344d();
        StringBuilder sb = new StringBuilder("videoWidth:");
        sb.append(vlwVar.f177164s);
        sb.append(",videoHeight:");
        sb.append(vlwVar.f177166t);
        sb.append(",visualWidth:");
        sb.append(vlwVar.f177168u);
        sb.append(",visualHeight:");
        sb.append(vlwVar.f177169v);
        sb.append(",encodeWidth:");
        sb.append(vlwVar.f177152m);
        sb.append(",encodeHeight:");
        sb.append(vlwVar.f177154n);
        sb.append(",videoBitrate:");
        sb.append(vlwVar.f177109H);
        sb.append(",audioBitrate:");
        sb.append(vlwVar.f177120S);
        sb.append(",videoFPS:");
        sb.append(vlwVar.f177107F);
        sb.append(",codecFPS:");
        sb.append(vlwVar.f182016E0);
        sb.append(",mergeCanvasWidth:");
        qmr qmrVar = (qmr) vlwVar;
        sb.append(qmrVar.f177148k);
        sb.append(",mergeCanvasHeight:");
        sb.append(qmrVar.f177150l);
        sb.append(",codecFPS:");
        sb.append(vlwVar.f182016E0);
        sb.append(",isHard:");
        sb.append(vlwVar.f182012A0);
        ii70VarM136344d.m136348c("MoMoRtcPushFilter", sb.toString());
        this.f14437p1 = qmrVar;
        if (this.f14400Y0 == 1) {
            return;
        }
        if (vlwVar.f182012A0 == MomoPipeline.DecodeType.SOFT_DECODE || qmrVar.f177131b0) {
            this.f14384T = false;
        }
        this.f14350I0 = new wb1();
        yw00 yw00Var = this.f14347H0;
        if (yw00Var != null) {
            this.f14393W = yw00Var.m216278l();
        }
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setRobustSignal(fjx.m121638R().m121654F() == 1);
        }
        this.f14361L2 = false;
        this.f14457z1 = false;
        this.f14364M2 = false;
        if (1 == fjx.m121638R().m121645C()) {
            m20016h6(true);
        }
        synchronized (this.f14447u1) {
            try {
                m19844b5(this.f14445t1, 33);
                MMRtcEngine mMRtcEngine2 = this.f14387U;
                if (mMRtcEngine2 != null) {
                    mMRtcEngine2.setExpandCartonParams(fjx.m121638R().m121779q0(), fjx.m121638R().m121675M());
                }
                dix.C16387d c16387dM111948h = dix.m111940d().m111948h(this.f14458z2.m116726b());
                String str = "";
                String str2 = "";
                if (c16387dM111948h != null) {
                    str = c16387dM111948h.f86448a;
                    str2 = c16387dM111948h.f86449b;
                }
                qmr qmrVar2 = this.f14437p1;
                m19778C5(qmrVar2.f155325g1, qmrVar2.f182013B0, str, str2);
                ii70.m136344d().m136348c("momortc", "setChannalName:" + this.f14437p1.f155325g1);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14400Y0 = 1;
        st0.m185792g().m185807p(m19726W1(), st0.f166270f);
        this.f14268H.f203845d1 = vlwVar.m198870d();
        zmx zmxVar2 = this.f14268H;
        zmxVar2.f203839b1 = vlwVar.f177131b0 ? 1L : 0L;
        zmxVar2.f203898x = vlwVar.f182043v0;
        int i3 = vlwVar.f177109H;
        this.f14355J2 = i3;
        this.f14358K2 = vlwVar.f182016E0;
        qmr qmrVar3 = this.f14437p1;
        zmxVar2.f203826W = qmrVar3.f182013B0;
        zmxVar2.f203828X = qmrVar3.f155325g1;
        zmxVar2.f203793F0 = i3;
        if (this.f14387U != null) {
            zmxVar2.f203879p = MMRtcEngine.getSdkVersion();
        }
        this.f14268H.f203846e = System.currentTimeMillis();
        this.f14268H.f203849f = System.currentTimeMillis();
        this.f14268H.f203793F0 = vlwVar.f177109H;
        this.f14269I.m131787l("startRecord", Integer.valueOf(this.f14445t1));
    }

    /* JADX INFO: renamed from: R4 */
    public void m19967R4(ymw ymwVar) {
        this.f14404Z1 = ymwVar;
    }

    /* JADX INFO: renamed from: R5 */
    public void m19968R5(int i) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).pauseEffect(i);
        }
    }

    /* JADX INFO: renamed from: R6 */
    public void m19969R6() {
        this.f14379R2 = true;
        if (this.f14415f1) {
            return;
        }
        this.f14387U.registerAudioFrameObserver(null);
        this.f14387U.registerAudioFrameObserver(this);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: S0 */
    public void mo19656S0(eix eixVar) {
        super.mo19656S0(eixVar);
        this.f14458z2 = eixVar;
    }

    /* JADX INFO: renamed from: S4 */
    public void m19970S4(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        this.f14412d2 = mRtcClientRoleChangedHandler;
    }

    /* JADX INFO: renamed from: S5 */
    public void m19971S5() {
        this.f14269I.m131787l("pauseRecording");
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "pauseRecording");
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.muteLocalAudioStream(true);
        }
        RunnableC4093e runnableC4093e = new RunnableC4093e();
        this.f14382S1 = runnableC4093e;
        this.f14343F2.postDelayed(runnableC4093e, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    /* JADX INFO: renamed from: S6 */
    public void m19972S6(String str) {
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "startSurroundMusic");
        if (this.f14334C1) {
            return;
        }
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.startAudioMixing(str, false, false, 1L);
            this.f14387U.adjustAudioMixingVolume(this.f14423j1);
            this.f14334C1 = true;
        }
        m19798I6(null, 1, 0);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: T0 */
    public int mo19973T0() {
        return 0;
    }

    /* JADX INFO: renamed from: T4 */
    public void m19974T4(MRtcPusherHandler mRtcPusherHandler) {
        this.f14352I2 = mRtcPusherHandler;
    }

    /* JADX INFO: renamed from: T5 */
    public void m19975T5() {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.pauseAudioMixing();
        }
    }

    /* JADX INFO: renamed from: T6 */
    public void m19976T6(String str, boolean z, boolean z2, int i) {
        if (this.f14334C1) {
            return;
        }
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.startAudioMixing(str, z, z2, i);
            this.f14387U.adjustAudioMixingVolume(this.f14423j1);
            this.f14334C1 = true;
        }
        m19798I6(null, 1, 0);
    }

    /* JADX INFO: renamed from: U4 */
    public void m19977U4(MRtcQualityHandler mRtcQualityHandler) {
        this.f14406a2 = mRtcQualityHandler;
    }

    /* JADX INFO: renamed from: U5 */
    public boolean m19978U5(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).playEffect(i, str, i2, d, d3, d2 * 100.0d, !z);
        }
        return true;
    }

    /* JADX INFO: renamed from: U6 */
    public void m19979U6() {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).stopAllEffects();
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: V0 */
    public long mo19980V0() {
        return 0L;
    }

    /* JADX INFO: renamed from: V4 */
    public void m19981V4(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f14408b2 = mRtcReceiveSeiHandler;
    }

    /* JADX INFO: renamed from: V6 */
    public void m19982V6(int i) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).stopEffect(i);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: W0 */
    public int mo19983W0() {
        return this.f14359L0;
    }

    /* JADX INFO: renamed from: W5 */
    public void m19985W5() {
        this.f14268H.f203885r = m19878p5();
        MMRtcStats mMRtcStats = this.f14371P0;
        if (mMRtcStats == null || mMRtcStats.remoteStats.size() <= 0 || this.f14371P0.remoteStats.get(0).AudioStats == null) {
            zmx zmxVar = this.f14268H;
            zmxVar.f203850f0 = 0L;
            zmxVar.f203856h0 = 0L;
        } else {
            zmx zmxVar2 = this.f14268H;
            zmxVar2.f203853g0 += zmxVar2.f203850f0;
            zmxVar2.f203859i0 += zmxVar2.f203856h0;
            long j = this.f14371P0.remoteStats.get(0).AudioStats.expandCount * 10;
            zmx zmxVar3 = this.f14268H;
            zmxVar2.f203850f0 = j - zmxVar3.f203853g0;
            zmxVar3.f203856h0 = this.f14371P0.remoteStats.get(0).videoStats.videoRenderCount - this.f14268H.f203859i0;
        }
        this.f14269I.m131796u();
    }

    /* JADX INFO: renamed from: W6 */
    public void m19986W6() {
        this.f14379R2 = false;
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: X */
    public void mo19987X() {
        this.f14417g1 = false;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: X0 */
    public long mo19988X0() {
        return 0L;
    }

    /* JADX INFO: renamed from: X4 */
    public void m19989X4(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f14401Y1 = mRtcTokenWillExpireHander;
    }

    /* JADX INFO: renamed from: X5 */
    public void m19990X5() {
        this.f14268H.f203788D = mo20054x1();
        this.f14268H.f203792F = mo19956O0();
        this.f14268H.f203794G = mo20038q1();
        this.f14268H.f203784B = mo19927F1();
        this.f14268H.f203808N = mo20052w1();
        this.f14268H.f203810O = mo20014h1();
        this.f14268H.f203812P = mo19992Y0();
        this.f14268H.f203814Q = mo20028m0();
        this.f14268H.f203894v = getVideoWidth();
        this.f14268H.f203896w = mo20022k0();
        this.f14268H.f203861j = mo20013h0();
        this.f14268H.f203885r = m19878p5();
        this.f14268H.f203818S = m19729Z1().f177170w;
        this.f14268H.f203820T = m19729Z1().f177171x;
        this.f14268H.f203822U = m19774B5();
        zmx zmxVar = this.f14268H;
        zmxVar.f203824V = this.f14349H2 ? 1L : 0L;
        zmxVar.f203799I0 = this.f14365N0;
        zmxVar.f203801J0 = this.f14368O0;
        this.f14269I.m131770H();
    }

    /* JADX INFO: renamed from: X6 */
    public void m19991X6(String str) {
        this.f14443s1 = str;
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.renewToken(str);
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo19657Y(yw00 yw00Var, vlw vlwVar) {
        super.mo19657Y(yw00Var, vlwVar);
        this.f14347H0 = yw00Var;
        if (vlwVar == null) {
            return;
        }
        int i = vlwVar.f182016E0;
        this.f14444s2 = i;
        if (i <= 0 || i > 30) {
            Log.e("unint", "error maxFps=" + this.f14444s2);
            this.f14444s2 = 30;
        }
        this.f14437p1 = (qmr) vlwVar;
        m19802J6();
        yw00 yw00Var2 = this.f14347H0;
        if (yw00Var2 != null) {
            this.f14393W = yw00Var2.m216278l();
        }
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "videoWidth:" + this.f14281s.f177164s + ",videoHeight:" + this.f14281s.f177166t + ",visualWidth:" + this.f14281s.f177168u + ",visualHeight:" + this.f14281s.f177169v + ",encodeWidth:" + this.f14281s.f177152m + ",encodeHeight:" + this.f14281s.f177154n + ",videoBitrate:" + this.f14281s.f177109H + ",audioBitrate:" + this.f14281s.f177120S + ",videoFPS:" + this.f14281s.f177107F + ",codecFPS:" + this.f14281s.f182016E0 + ",mergeCanvasWidth:" + ((qmr) this.f14281s).f177148k + ",mergeCanvasHeight:" + ((qmr) this.f14281s).f177150l + ",codecFPS:" + this.f14281s.f182016E0 + ",isHard:" + this.f14281s.f182012A0);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: Y0 */
    public int mo19992Y0() {
        MMRtcStats mMRtcStats = this.f14371P0;
        if (mMRtcStats != null) {
            return mMRtcStats.videoStats.videoBitrate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m19993Y4(int i) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.adjustPlaybackSignalVolume(i);
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public void m19994Y5(boolean z) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            if (z) {
                mMRtcEngine.registerAudioFrameObserver(null);
                this.f14387U.registerAudioFrameObserver(this);
                this.f14415f1 = true;
            } else {
                if (this.f14379R2) {
                    return;
                }
                mMRtcEngine.registerAudioFrameObserver(null);
                this.f14415f1 = false;
            }
        }
    }

    /* JADX INFO: renamed from: Y6 */
    public void m19995Y6(String str) {
        this.f14269I.m131787l("updateRtmpUrl", str);
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine == null || this.f14419h1 == null || str == null || this.f14340E2) {
            return;
        }
        this.f14268H.f203835a0 = str;
        mMRtcEngine.addPublishStreamUrl(this.f14437p1.f182043v0, true);
        this.f14269I.m131764B(str, this.f14268H.f203898x);
        hu00.InterfaceC17392a interfaceC17392a = this.f14419h1;
        if (interfaceC17392a != null) {
            interfaceC17392a.mo128349g(CommandMessage.COMMAND_CLEAR_NOTIFICATION_TYPE, 0, 0, this);
        }
        this.f14268H.f203835a0 = str;
        MRtcPusherHandler mRtcPusherHandler = this.f14352I2;
        if (mRtcPusherHandler != null) {
            mRtcPusherHandler.onPushChangeStreamUrl(str);
        }
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "updateRtmpUrl:url=".concat(str));
    }

    /* JADX INFO: renamed from: Z4 */
    public void m19996Z4(long j, float f) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setParameters("{\"che.audio.playout.uid.volume\": {\"uid\":userid,\"volume\":volumeScale}}");
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public void m19997Z5(int i, int i2) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (i2 == 0) {
            mMRtcEngine.setRemoteVideoStreamType(i, 0);
        } else {
            mMRtcEngine.setRemoteVideoStreamType(i, 1);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: a0 */
    public long mo19998a0() {
        return this.f14268H.f203790E;
    }

    /* JADX INFO: renamed from: a5 */
    public int m19999a5(int i) {
        int clientRole;
        this.f14269I.m131787l("changeRole", Integer.valueOf(i));
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "call changeRole:" + i);
        this.f14445t1 = i;
        synchronized (this.f14447u1) {
            if (1 == i) {
                try {
                    m19802J6();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f14387U != null) {
                ii70.m136344d().m136348c("MoMoRtcPushFilter", "changeRole:" + i);
                clientRole = this.f14387U.setClientRole(i);
            } else {
                clientRole = 0;
            }
        }
        if (this.f14445t1 == 2) {
            mo19740i2();
            this.f14268H.f203785B0 = "MrtcAudience";
        } else {
            mo19738g2();
            this.f14268H.f203785B0 = "M".equals(mo20052w1()) ? "MrtcMaster" : "MrtcSlaver";
        }
        this.f14268H.f203846e = System.currentTimeMillis();
        this.f14268H.f203849f = System.currentTimeMillis();
        return clientRole;
    }

    /* JADX INFO: renamed from: a6 */
    public void m20000a6() {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).resumeAllEffects();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: b0 */
    public void mo19658b0() {
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: b1 */
    public long mo20001b1() {
        MMRtcLocalVideoStats mMRtcLocalVideoStats;
        MMRtcStats mMRtcStats = this.f14371P0;
        if (mMRtcStats == null || (mMRtcLocalVideoStats = mMRtcStats.videoStats) == null) {
            return 0L;
        }
        return mMRtcLocalVideoStats.vEncodeCount;
    }

    /* JADX INFO: renamed from: b6 */
    public void m20002b6(int i) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).resumeEffect(i);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: c0 */
    public long mo20003c0() {
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: c1 */
    public int mo19659c1() {
        return 1;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: c2 */
    public void mo19732c2() {
        if (this.f14445t1 == 1) {
            mo19739h2();
        } else {
            mo19737f2();
        }
    }

    /* JADX INFO: renamed from: c6 */
    public void m20004c6() {
        this.f14269I.m131787l("resumeRecording");
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "resumeRecording");
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.muteLocalAudioStream(false);
            this.f14396X = true;
        }
        Handler handler = this.f14343F2;
        if (handler != null) {
            handler.removeCallbacks(this.f14382S1);
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, p149l.hmx.InterfaceC17343b
    /* JADX INFO: renamed from: d1 */
    public void mo19734d1() {
        if (this.f14445t1 == 1) {
            m19990X5();
        } else {
            m19985W5();
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: d2 */
    public void mo19735d2() {
        if (this.f14445t1 == 1) {
            mo19740i2();
        } else {
            mo19738g2();
        }
    }

    /* JADX INFO: renamed from: d6 */
    public void m20005d6() {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.resumeAudioMixing();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e0 */
    public Surface mo19660e0() {
        return null;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e1 */
    public void mo19661e1(u3m u3mVar) {
        u3m u3mVar2;
        super.mo19661e1(u3mVar);
        if ((u3mVar instanceof ExtAudioWrapper) && (u3mVar2 = this.f14271K) != null) {
            ((ExtAudioWrapper) u3mVar2).m152749r2();
            ((ExtAudioWrapper) this.f14271K).m20088J2(new C4090b());
            ((ExtAudioWrapper) this.f14271K).mo20128s1(1);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public void m20006e5(boolean z) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            if (z) {
                mMRtcEngine.enableAudio();
            } else {
                mMRtcEngine.disableAudio();
            }
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m20007e6(String str) {
        int i;
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null && this.f14390V == -1) {
            this.f14390V = mMRtcEngine.createDataStream(true, true);
        }
        MMRtcEngine mMRtcEngine2 = this.f14387U;
        if (mMRtcEngine2 == null || (i = this.f14390V) == -1) {
            return;
        }
        mMRtcEngine2.sendStreamMessage(i, str);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo19662f() {
        Log.e("unint", "stopRecord");
        this.f14269I.m131787l("stopRecord");
        this.f14396X = false;
        this.f14400Y0 = 0;
        this.f14417g1 = false;
        this.f14346G2 = true;
        super.mo19662f();
        C4094f c4094f = this.f14422i2;
        if (c4094f != null) {
            c4094f.m20065a();
            this.f14422i2 = null;
        }
        stopSurroundMusic();
        Timer timer = this.f14337D2;
        if (timer != null) {
            timer.cancel();
            this.f14337D2 = null;
        }
        release();
        u3m u3mVar = this.f14271K;
        if (u3mVar != null) {
            qmr qmrVar = this.f14437p1;
            ((ExtAudioWrapper) u3mVar).m20087I2(2048, qmrVar.f177117P, qmrVar.f177119R, "NULL");
        }
        u3m u3mVar2 = this.f14271K;
        if (u3mVar2 != null) {
            u3mVar2.mo20083G1(null);
            this.f14271K.mo20100V(null);
            this.f14271K.mo160318R(null);
            this.f14271K = null;
        }
        super.m19748p2();
        st0.m185792g().m185808q(st0.f166270f);
        PipelineConcurrentHashMap<Long, a9y> pipelineConcurrentHashMap = this.f14385T0;
        if (pipelineConcurrentHashMap != null && !pipelineConcurrentHashMap.isEmpty()) {
            n8c.m158483a("zhengjijian", "stopRecord memberInfoMap " + this.f14385T0.size());
            this.f14385T0.clear();
        }
        PipelineConcurrentHashMap<Long, ley> pipelineConcurrentHashMap2 = this.f14381S0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            this.f14381S0.clear();
        }
        synchronized (this.f14335C2) {
            try {
                if (!this.f14335C2.isEmpty()) {
                    for (SurfaceViewRenderer surfaceViewRenderer : this.f14335C2.values()) {
                        if (surfaceViewRenderer != null) {
                            surfaceViewRenderer.release();
                        }
                    }
                    this.f14335C2.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fjx.m121638R().m121647C1(0);
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "stopRecordOK!!!!!!!!!!!!!!!!!!!!");
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: f2 */
    public void mo19737f2() {
        this.f14269I.m131787l("pullStartV3", Boolean.valueOf(this.f14376Q2));
        if (this.f14376Q2) {
            return;
        }
        this.f14376Q2 = true;
        this.f14268H.f203834a = System.currentTimeMillis();
        zmx zmxVar = this.f14268H;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zmx zmxVar2 = this.f14268H;
        zmxVar.f203846e = jCurrentTimeMillis - zmxVar2.f203846e;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        zmx zmxVar3 = this.f14268H;
        zmxVar2.f203849f = jCurrentTimeMillis2 - zmxVar3.f203849f;
        zmxVar3.f203900y = this.f14331A2;
        super.mo19737f2();
    }

    /* JADX INFO: renamed from: f5 */
    public void m20008f5(boolean z) {
        this.f14360L1 = z;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: g0 */
    public long mo20009g0() {
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: g1 */
    public String mo20010g1(int i, int i2, Object obj) {
        return "";
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: g2 */
    public void mo19738g2() {
        this.f14376Q2 = false;
        this.f14269I.m131787l("pullStop_v3");
        zmx zmxVar = this.f14268H;
        if (zmxVar.f203834a != -1) {
            zmxVar.f203855h = System.currentTimeMillis() - this.f14268H.f203834a;
        }
        MMRtcStats mMRtcStats = this.f14371P0;
        if (mMRtcStats == null || mMRtcStats.remoteStats.size() <= 0 || this.f14371P0.remoteStats.get(0).AudioStats == null) {
            zmx zmxVar2 = this.f14268H;
            zmxVar2.f203850f0 = 0L;
            zmxVar2.f203856h0 = 0L;
        } else {
            this.f14268H.f203850f0 = this.f14371P0.remoteStats.get(0).AudioStats.expandCount * 10;
            this.f14268H.f203856h0 = this.f14371P0.remoteStats.get(0).videoStats.videoRenderCount;
        }
        this.f14268H.f203900y = this.f14331A2;
        super.mo19738g2();
    }

    /* JADX INFO: renamed from: g5 */
    public void m20011g5(boolean z) {
        MMRtcEngine mMRtcEngine;
        if (z && (mMRtcEngine = this.f14387U) != null) {
            mMRtcEngine.setParameters("{\"che.audio.live_for_comm\":true}");
            return;
        }
        MMRtcEngine mMRtcEngine2 = this.f14387U;
        if (mMRtcEngine2 != null) {
            mMRtcEngine2.setParameters("{\"che.audio.live_for_comm\":false}");
        }
    }

    /* JADX INFO: renamed from: g6 */
    public void m20012g6(boolean z) {
        if (z) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "set double push");
        }
        this.f14424j2 = z;
        this.f14453x1 = z;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    @Override // p149l.ewl
    public int getRoomType() {
        return this.f14439q1;
    }

    @Override // p149l.ewl
    public String getServerIpAddr() {
        return StringUtil.ALL_INTERFACES;
    }

    @Override // p149l.ewl
    public int getVideoWidth() {
        if (this.f14455y1 || this.f14453x1) {
            return 0;
        }
        return this.f14281s.f177152m;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: h0 */
    public int mo20013h0() {
        MMRtcStats mMRtcStats = this.f14371P0;
        if (mMRtcStats != null) {
            return (int) mMRtcStats.rxBytes;
        }
        return 0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: h1 */
    public int mo20014h1() {
        MMRtcStats mMRtcStats = this.f14371P0;
        if (mMRtcStats != null) {
            return (int) mMRtcStats.audioStats.audioBitrate;
        }
        return 0;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: h2 */
    public void mo19739h2() {
        this.f14269I.m131787l("pushStartV3", Boolean.valueOf(this.f14376Q2));
        if (this.f14376Q2) {
            return;
        }
        this.f14376Q2 = true;
        this.f14268H.f203834a = System.currentTimeMillis();
        this.f14268H.f203898x = mo19920D1();
        this.f14268H.f203894v = getVideoWidth();
        this.f14268H.f203896w = mo20022k0();
        this.f14268H.f203902z = mo20036p1();
        this.f14268H.f203782A = mo19914A0();
        this.f14268H.f203846e = System.currentTimeMillis() - this.f14268H.f203846e;
        super.mo19739h2();
    }

    /* JADX INFO: renamed from: h5 */
    public void m20015h5(boolean z, String str) {
        this.f14357K1 = z;
        this.f14354J1 = str;
        if (!z || this.f14387U == null || str == null || str.length() <= 0) {
            return;
        }
        n8c.m158487e("MoMoRtcPushFilter", "agora_sdk_ver: " + MMRtcEngine.getSdkVersion());
        this.f14387U.setParameters("{\"rtc.log_filter\":34781}");
        this.f14387U.setLogFile(this.f14354J1);
        this.f14387U.setLogFilter(15);
    }

    /* JADX INFO: renamed from: h6 */
    public void m20016h6(boolean z) {
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: i2 */
    public void mo19740i2() {
        this.f14269I.m131787l("pushStop_v3");
        this.f14376Q2 = false;
        zmx zmxVar = this.f14268H;
        if (zmxVar.f203834a != -1) {
            zmxVar.f203855h = System.currentTimeMillis() - this.f14268H.f203834a;
        }
        super.mo19740i2();
    }

    /* JADX INFO: renamed from: i5 */
    public void m20017i5(boolean z) {
        this.f14269I.m131787l("enableDualStreamMode", Boolean.valueOf(z));
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "call enableDualStreamMode:" + z);
        this.f14338E0 = z;
    }

    /* JADX INFO: renamed from: i6 */
    public void m20018i6(int i) {
        Log.e("MoMoRtcPushFilter", "momortc setAudioMixingPitch:" + i);
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setAudioMixingPitch(i);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: j1 */
    public long mo20019j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j5 */
    public void m20020j5(boolean z) {
        this.f14363M1 = z;
    }

    /* JADX INFO: renamed from: j6 */
    public void m20021j6(boolean z) {
        this.f14455y1 = z;
        if (z) {
            this.f14341F0 = false;
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: k0 */
    public int mo20022k0() {
        if (this.f14455y1 || this.f14453x1) {
            return 0;
        }
        return this.f14281s.f177154n;
    }

    /* JADX INFO: renamed from: k5 */
    public void m20023k5(boolean z) {
    }

    /* JADX INFO: renamed from: k6 */
    public void m20024k6(int i, int i2) {
        if (this.f14387U == null || i < 0) {
            return;
        }
        this.f14268H.f203787C0 = m19875o5(i);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: l1 */
    public long mo20025l1() {
        return 0L;
    }

    /* JADX INFO: renamed from: l5 */
    public void m20026l5(boolean z) {
        this.f14341F0 = z;
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            if (!z || this.f14437p1 == null) {
                mMRtcEngine.disableVideo();
                this.f14346G2 = true;
                return;
            }
            this.f14346G2 = false;
            mMRtcEngine.enableVideo();
            EGLContext eGLContext = this.f14393W;
            if (eGLContext != null) {
                this.f14387U.updateSharedContext(eGLContext);
            }
            ii70.m136344d().m136348c("MoMoRtcPushFilter", "setVideoProfileEx1 bitrate:" + this.f14437p1.f177109H);
            this.f14387U.setParameters("{\"che.video.keyFrameInterval\":1}");
            qmr qmrVar = this.f14437p1;
            if (qmrVar.f182017F0 && qmrVar.m198870d() == 1) {
                MMRtcEngine mMRtcEngine2 = this.f14387U;
                qmr qmrVar2 = this.f14437p1;
                mMRtcEngine2.setVideoProfile(qmrVar2.f177154n, qmrVar2.f177152m, 15, qmrVar2.f177109H);
            } else {
                MMRtcEngine mMRtcEngine3 = this.f14387U;
                qmr qmrVar3 = this.f14437p1;
                mMRtcEngine3.setVideoProfile(qmrVar3.f177152m, qmrVar3.f177154n, 15, qmrVar3.f177109H);
            }
        }
    }

    /* JADX INFO: renamed from: l6 */
    public void m20027l6(int i) {
        this.f14426k1 = i;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: m0 */
    public int mo20028m0() {
        if (this.f14396X) {
            IMMRtcEngineEventInterface.LocalVideoStats localVideoStatsM19899v5 = m19899v5();
            if (localVideoStatsM19899v5 != null) {
                return localVideoStatsM19899v5.sentFrameRate;
            }
            return 0;
        }
        IMMRtcEngineEventInterface.RemoteVideoStats remoteVideoStatsM19903w5 = m19903w5();
        if (remoteVideoStatsM19903w5 != null) {
            return remoteVideoStatsM19903w5.receivedFrameRate;
        }
        return 0;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: m1 */
    public void mo19665m1(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: m6 */
    public void m20029m6(int i) {
        this.f14268H.f203858i = i;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: n0 */
    public long mo20030n0() {
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: n1 */
    public int mo20031n1() {
        return this.f14434o1;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: n2 */
    public void mo19746n2(vlw vlwVar) {
        super.mo19746n2(vlwVar);
        vlw vlwVar2 = this.f14281s;
        qmr qmrVar = (qmr) vlwVar2;
        this.f14437p1 = qmrVar;
        if (qmrVar != null) {
            if (!this.f14384T || vlwVar2.f182012A0 == MomoPipeline.DecodeType.SOFT_DECODE || ((qmr) vlwVar2).f177131b0) {
                vlwVar2.f182012A0 = MomoPipeline.DecodeType.SOFT_DECODE;
            } else {
                vlwVar2.f182012A0 = MomoPipeline.DecodeType.HARD_DECODE;
            }
        }
    }

    /* JADX INFO: renamed from: n5 */
    public void m20032n5(long j, boolean z) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.forwardDownlinkAudio(j, z);
        }
    }

    /* JADX INFO: renamed from: n6 */
    public void m20033n6(int i) {
        this.f14269I.m131787l("setBusinessType", Integer.valueOf(i));
        this.f14268H.f203888s = i;
        hjx.m131421d("MoMoRtcPushFilter", "setBusinessType : " + i);
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setRoomMode(i);
        }
    }

    @Override // p149l.fcj, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        n8c.m158485c("zk", "newTextureReady");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.texture_in = i;
        long j = 1000 / ((long) this.f14444s2);
        long j2 = this.f14446t2;
        long j3 = jCurrentTimeMillis - j2;
        if (j3 < j) {
            return;
        }
        if (j2 == 0 || j3 > 5 * j) {
            this.f14446t2 = System.currentTimeMillis();
        } else {
            this.f14446t2 = j2 + j;
        }
        mo19653M1();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o */
    public void mo19666o() {
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: o0 */
    public long mo20034o0() {
        return 0L;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o1 */
    public boolean mo19667o1(ByteBuffer byteBuffer) {
        mo19670v0(byteBuffer);
        return true;
    }

    /* JADX INFO: renamed from: o6 */
    public void m20035o6(String str) {
        this.f14443s1 = str;
    }

    @Override // com.momo.momortc.IAudioFrameObserver
    public boolean onPlaybackFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f14396X) {
            return true;
        }
        int i7 = 0;
        boolean z = (i3 == 2 && i4 == 441000) ? false : true;
        if (this.f14350I0 != null && this.f14413e1 != null && this.f14417g1) {
            if (this.f14448u2 == null && z) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.f14448u2 = audioResampleUtils;
                int iInitResampleInfo = audioResampleUtils.initResampleInfo(i4, i3, 16, this.f14426k1, 2, 16);
                this.f14452w2.clear();
                if (iInitResampleInfo < 0) {
                    Log.e("mmrtcpushfilter", "onPlaybackAudioFrame: 创建重采样模块失败！！");
                    this.f14448u2.release();
                    this.f14448u2 = null;
                }
            }
            AudioResampleUtils audioResampleUtils2 = this.f14448u2;
            if (audioResampleUtils2 != null) {
                ByteBuffer byteBufferResamplePcmData = audioResampleUtils2.resamplePcmData(bArr, i);
                if (byteBufferResamplePcmData != null) {
                    m19888s5(byteBufferResamplePcmData.capacity());
                    this.f14452w2.put(byteBufferResamplePcmData.array(), 0, byteBufferResamplePcmData.capacity());
                }
            } else {
                m19888s5(bArr.length);
                this.f14452w2.put(bArr, 0, bArr.length);
            }
            int iPosition = this.f14452w2.position();
            while (true) {
                i5 = i7 * 2048;
                i6 = iPosition - i5;
                if (i6 < 2048 || !this.f14417g1) {
                    break;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
                byteBufferAllocate.put(this.f14452w2.array(), i5, 2048);
                byteBufferAllocate.flip();
                if (this.f14445t1 == 2) {
                    this.f14413e1.mo128315C(new mpd0(byteBufferAllocate, System.currentTimeMillis(), 2));
                } else {
                    wb1 wb1Var = this.f14350I0;
                    if (wb1Var != null) {
                        wb1Var.m202493i(new mpd0(byteBufferAllocate, System.currentTimeMillis(), 2));
                    }
                }
                i7++;
            }
            if (i6 > 0) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
                byteBufferAllocate2.put(this.f14452w2.array(), i5, i6);
                byteBufferAllocate2.flip();
                this.f14452w2.clear();
                this.f14452w2.put(byteBufferAllocate2);
            } else if (i6 == 0) {
                this.f14452w2.clear();
            }
        }
        return true;
    }

    @Override // com.momo.momortc.IAudioFrameObserver
    public boolean onRecordFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        mpd0 mpd0Var;
        int i5;
        int i6;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (!this.f14396X) {
            return true;
        }
        if (this.f14428l1 % 200 == 0) {
            ii70.m136344d().m136349f("MoMoRtcPushFilter", "onRecordFrame samples.len" + bArr.length + " numOfSamples:" + i);
        }
        this.f14428l1++;
        boolean z = (i3 == 2 && i4 == 441000) ? false : true;
        byte[] bArr2 = new byte[bArr.length];
        if (!this.f14431m2) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        mpd0 mpd0VarM202491g = null;
        if (this.f14271K == null || !this.f14396X) {
            mpd0Var = null;
        } else {
            ((ExtAudioWrapper) this.f14271K).mo20101W1(this.f14423j1);
            ((ExtAudioWrapper) this.f14271K).mo20128s1(i3);
            ((ExtAudioWrapper) this.f14271K).m20087I2(bArr.length, i4, i3, "momortc");
            mpd0 mpd0VarMo18364C = ((ExtAudioWrapper) this.f14271K).mo18364C(new mpd0(bArr2, this.f14426k1, i3));
            if (mpd0VarMo18364C != null && (byteBuffer2 = mpd0VarMo18364C.f135036b) != null) {
                byteBuffer2.get(bArr, 0, bArr.length);
            }
            mpd0Var = mpd0VarMo18364C;
        }
        if ((this.f14345G1 != null || this.f14413e1 != null) && this.f14417g1) {
            if (this.f14450v2 == null && z) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.f14450v2 = audioResampleUtils;
                int iInitResampleInfo = audioResampleUtils.initResampleInfo(i4, i3, 16, this.f14426k1, 2, 16);
                this.f14454x2.clear();
                if (iInitResampleInfo < 0) {
                    Log.e("mmrtcpushfilter", "onRecordFrame: 创建重采样模块失败！！");
                    this.f14450v2.release();
                    this.f14450v2 = null;
                }
            }
            if (mpd0Var != null && (byteBuffer = mpd0Var.f135036b) != null) {
                AudioResampleUtils audioResampleUtils2 = this.f14450v2;
                if (audioResampleUtils2 == null || !z) {
                    m19892t5(byteBuffer.capacity());
                    this.f14454x2.put(mpd0Var.f135036b.array(), 0, mpd0Var.f135036b.capacity());
                } else {
                    ByteBuffer byteBufferResamplePcmData = audioResampleUtils2.resamplePcmData(byteBuffer.array(), i);
                    if (byteBufferResamplePcmData != null) {
                        m19892t5(byteBufferResamplePcmData.capacity());
                        this.f14454x2.put(byteBufferResamplePcmData.array(), 0, byteBufferResamplePcmData.capacity());
                    }
                }
            }
            int iPosition = this.f14454x2.position();
            int i7 = 0;
            while (true) {
                i5 = i7 * 2048;
                i6 = iPosition - i5;
                if (i6 < 2048 || !this.f14417g1) {
                    break;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
                byteBufferAllocate.put(this.f14454x2.array(), i5, 2048);
                byteBufferAllocate.flip();
                wb1 wb1Var = this.f14350I0;
                if (wb1Var != null) {
                    wb1Var.m202494j(1.0f);
                    mpd0VarM202491g = this.f14350I0.m202491g();
                }
                ByteBuffer byteBufferM202492h = mpd0VarM202491g != null ? this.f14350I0.m202492h(byteBufferAllocate.array(), mpd0VarM202491g.m155800c(), mpd0VarM202491g.m155802e()) : byteBufferAllocate;
                pcmDataAvailableCallback pcmdataavailablecallback = this.f14345G1;
                if (pcmdataavailablecallback != null) {
                    pcmdataavailablecallback.onPcmDateCallback(this.f14437p1.f182013B0, byteBufferAllocate.array(), this.f14426k1, false);
                }
                mpd0 mpd0Var2 = new mpd0(byteBufferM202492h.array(), this.f14426k1, 2);
                mpd0Var2.m155804g(false);
                sml.InterfaceC19992a interfaceC19992a = this.f14413e1;
                if (interfaceC19992a != null) {
                    interfaceC19992a.mo128315C(mpd0Var2);
                    int i8 = this.f14373P2;
                    this.f14373P2 = i8 + 1;
                    if (i8 % 50 == 0) {
                        ii70.m136344d().m136348c("MoMoRtcPushFilter", "=====replace======:mmrtc send pcm to IJK ");
                    }
                }
                i7++;
            }
            if (i6 > 0) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
                byteBufferAllocate2.put(this.f14454x2.array(), i5, i6);
                byteBufferAllocate2.flip();
                this.f14454x2.clear();
                this.f14454x2.put(byteBufferAllocate2);
            } else if (i6 == 0) {
                this.f14454x2.clear();
            }
        }
        return true;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: p */
    public void mo19668p(String str, int i) {
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: p1 */
    public int mo20036p1() {
        qmr qmrVar = this.f14437p1;
        int i = qmrVar.f177148k;
        return i > 0 ? i : qmrVar.f177164s;
    }

    /* JADX INFO: renamed from: p6 */
    public void m20037p6(boolean z) {
        this.f14429l2 = z;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: q1 */
    public long mo20038q1() {
        return this.f14353J0;
    }

    /* JADX INFO: renamed from: q5 */
    public double m20039q5() {
        MMRtcEngine mMRtcEngine = this.f14387U;
        return mMRtcEngine != null ? ((MMRtcEngineImpl) mMRtcEngine).getEffectsVolume() / 100.0f : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: q6 */
    public void m20040q6(double d) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).setEffectsVolume(((float) d) * 100.0f);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: r0 */
    public long mo20041r0() {
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: r1 */
    public boolean mo19669r1() {
        return this.f14424j2;
    }

    /* JADX INFO: renamed from: r5 */
    public int m20042r5() {
        return this.f14394W0;
    }

    /* JADX INFO: renamed from: r6 */
    public int m20043r6(boolean z) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            return mMRtcEngine.setEnableSpeakerphone(z);
        }
        return -1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: s0 */
    public int mo20044s0() {
        return 0;
    }

    /* JADX INFO: renamed from: s6 */
    public void m20045s6(String str) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setEncryptionMode(str);
        }
    }

    public void stopSurroundMusic() {
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "stopSurroundMusic:");
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.stopAudioMixing();
            this.f14334C1 = false;
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m20046t6(String str) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setEncryptionSecret(str);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: u0 */
    public long mo20047u0() {
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: u1 */
    public long mo20048u1() {
        return 0L;
    }

    /* JADX INFO: renamed from: u5 */
    public int m20049u5() {
        return this.f14397X0;
    }

    /* JADX INFO: renamed from: u6 */
    public void m20050u6(String str) {
        boolean zHas;
        try {
            zHas = new JSONObject(str).has("che.audio.profile");
        } catch (JSONException e) {
            e.printStackTrace();
            zHas = false;
        }
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine == null || zHas) {
            return;
        }
        mMRtcEngine.setParameters(str);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: v0 */
    public void mo19670v0(ByteBuffer byteBuffer) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ii70.m136344d().m136348c("MoMoRtcPushFilter", "writevideo:" + byteBuffer.limit() + ";timeStamp:" + jCurrentTimeMillis);
        if (this.f14384T || !this.f14396X || this.f14346G2) {
            return;
        }
        int i = this.f14449v1 + 1;
        this.f14449v1 = i;
        if (i >= 30 || this.f14453x1) {
            m19811N5();
        }
    }

    /* JADX INFO: renamed from: v6 */
    public void m20051v6(boolean z, boolean z2) {
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: w1 */
    public String mo20052w1() {
        qmr qmrVar = this.f14437p1;
        return (qmrVar == null || qmrVar.f155326h1) ? "M" : j6f.LATITUDE_SOUTH;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b5 A[Catch: JSONException -> 0x0210, TryCatch #1 {JSONException -> 0x0210, blocks: (B:35:0x00b5, B:36:0x00b9, B:39:0x00c6, B:41:0x00cc, B:44:0x00d4, B:46:0x00dc, B:49:0x00e4, B:51:0x00ea, B:56:0x011e, B:58:0x0124, B:60:0x012c, B:62:0x0132, B:65:0x013a, B:67:0x0140, B:70:0x0149, B:72:0x0151, B:76:0x015c, B:78:0x0162, B:81:0x016b, B:83:0x0175, B:87:0x0182, B:89:0x018a, B:93:0x0197, B:95:0x01a1, B:98:0x01ab, B:100:0x01b5, B:102:0x01bd, B:52:0x0115), top: B:111:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0167  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b A[Catch: JSONException -> 0x0210, TryCatch #1 {JSONException -> 0x0210, blocks: (B:35:0x00b5, B:36:0x00b9, B:39:0x00c6, B:41:0x00cc, B:44:0x00d4, B:46:0x00dc, B:49:0x00e4, B:51:0x00ea, B:56:0x011e, B:58:0x0124, B:60:0x012c, B:62:0x0132, B:65:0x013a, B:67:0x0140, B:70:0x0149, B:72:0x0151, B:76:0x015c, B:78:0x0162, B:81:0x016b, B:83:0x0175, B:87:0x0182, B:89:0x018a, B:93:0x0197, B:95:0x01a1, B:98:0x01ab, B:100:0x01b5, B:102:0x01bd, B:52:0x0115), top: B:111:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0175 A[Catch: JSONException -> 0x0210, TryCatch #1 {JSONException -> 0x0210, blocks: (B:35:0x00b5, B:36:0x00b9, B:39:0x00c6, B:41:0x00cc, B:44:0x00d4, B:46:0x00dc, B:49:0x00e4, B:51:0x00ea, B:56:0x011e, B:58:0x0124, B:60:0x012c, B:62:0x0132, B:65:0x013a, B:67:0x0140, B:70:0x0149, B:72:0x0151, B:76:0x015c, B:78:0x0162, B:81:0x016b, B:83:0x0175, B:87:0x0182, B:89:0x018a, B:93:0x0197, B:95:0x01a1, B:98:0x01ab, B:100:0x01b5, B:102:0x01bd, B:52:0x0115), top: B:111:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0182 A[Catch: JSONException -> 0x0210, TryCatch #1 {JSONException -> 0x0210, blocks: (B:35:0x00b5, B:36:0x00b9, B:39:0x00c6, B:41:0x00cc, B:44:0x00d4, B:46:0x00dc, B:49:0x00e4, B:51:0x00ea, B:56:0x011e, B:58:0x0124, B:60:0x012c, B:62:0x0132, B:65:0x013a, B:67:0x0140, B:70:0x0149, B:72:0x0151, B:76:0x015c, B:78:0x0162, B:81:0x016b, B:83:0x0175, B:87:0x0182, B:89:0x018a, B:93:0x0197, B:95:0x01a1, B:98:0x01ab, B:100:0x01b5, B:102:0x01bd, B:52:0x0115), top: B:111:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x018a A[Catch: JSONException -> 0x0210, TryCatch #1 {JSONException -> 0x0210, blocks: (B:35:0x00b5, B:36:0x00b9, B:39:0x00c6, B:41:0x00cc, B:44:0x00d4, B:46:0x00dc, B:49:0x00e4, B:51:0x00ea, B:56:0x011e, B:58:0x0124, B:60:0x012c, B:62:0x0132, B:65:0x013a, B:67:0x0140, B:70:0x0149, B:72:0x0151, B:76:0x015c, B:78:0x0162, B:81:0x016b, B:83:0x0175, B:87:0x0182, B:89:0x018a, B:93:0x0197, B:95:0x01a1, B:98:0x01ab, B:100:0x01b5, B:102:0x01bd, B:52:0x0115), top: B:111:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0191  */
    /* JADX WARN: Code duplicated, block: B:93:0x0197 A[Catch: JSONException -> 0x0210, TryCatch #1 {JSONException -> 0x0210, blocks: (B:35:0x00b5, B:36:0x00b9, B:39:0x00c6, B:41:0x00cc, B:44:0x00d4, B:46:0x00dc, B:49:0x00e4, B:51:0x00ea, B:56:0x011e, B:58:0x0124, B:60:0x012c, B:62:0x0132, B:65:0x013a, B:67:0x0140, B:70:0x0149, B:72:0x0151, B:76:0x015c, B:78:0x0162, B:81:0x016b, B:83:0x0175, B:87:0x0182, B:89:0x018a, B:93:0x0197, B:95:0x01a1, B:98:0x01ab, B:100:0x01b5, B:102:0x01bd, B:52:0x0115), top: B:111:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a1 A[Catch: JSONException -> 0x0210, TryCatch #1 {JSONException -> 0x0210, blocks: (B:35:0x00b5, B:36:0x00b9, B:39:0x00c6, B:41:0x00cc, B:44:0x00d4, B:46:0x00dc, B:49:0x00e4, B:51:0x00ea, B:56:0x011e, B:58:0x0124, B:60:0x012c, B:62:0x0132, B:65:0x013a, B:67:0x0140, B:70:0x0149, B:72:0x0151, B:76:0x015c, B:78:0x0162, B:81:0x016b, B:83:0x0175, B:87:0x0182, B:89:0x018a, B:93:0x0197, B:95:0x01a1, B:98:0x01ab, B:100:0x01b5, B:102:0x01bd, B:52:0x0115), top: B:111:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ab A[Catch: JSONException -> 0x0210, TryCatch #1 {JSONException -> 0x0210, blocks: (B:35:0x00b5, B:36:0x00b9, B:39:0x00c6, B:41:0x00cc, B:44:0x00d4, B:46:0x00dc, B:49:0x00e4, B:51:0x00ea, B:56:0x011e, B:58:0x0124, B:60:0x012c, B:62:0x0132, B:65:0x013a, B:67:0x0140, B:70:0x0149, B:72:0x0151, B:76:0x015c, B:78:0x0162, B:81:0x016b, B:83:0x0175, B:87:0x0182, B:89:0x018a, B:93:0x0197, B:95:0x01a1, B:98:0x01ab, B:100:0x01b5, B:102:0x01bd, B:52:0x0115), top: B:111:0x00b5 }] */
    /* JADX INFO: renamed from: w6 */
    public void m20053w6(String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str2;
        double d;
        double d2;
        int i;
        String str3;
        double d3;
        String str4;
        int i2;
        JSONArray jSONArray2;
        String str5;
        String str6;
        String string = str;
        String str7 = BaseSei.f13932Z;
        String str8 = "h";
        String str9 = BaseSei.f13931Y;
        if (this.f14437p1 == null || string == null) {
            return;
        }
        MMLiveTranscoding mMLiveTranscoding = this.f14433n2;
        if (mMLiveTranscoding == null) {
            this.f14433n2 = new MMLiveTranscoding();
        } else {
            mMLiveTranscoding.transcodingUserMap.clear();
        }
        qmr qmrVar = this.f14437p1;
        String str10 = "renderMode";
        int i3 = qmrVar.f177148k;
        String str11 = "alpha";
        MMLiveTranscoding mMLiveTranscoding2 = this.f14433n2;
        if (i3 > 0) {
            mMLiveTranscoding2.width = i3;
            mMLiveTranscoding2.height = qmrVar.f177150l;
        } else {
            mMLiveTranscoding2.width = qmrVar.f177164s;
            mMLiveTranscoding2.height = qmrVar.f177166t;
        }
        int i4 = 1;
        if (qmrVar.f182017F0 && qmrVar.m198870d() == 1) {
            MMLiveTranscoding mMLiveTranscoding3 = this.f14433n2;
            double d4 = mMLiveTranscoding3.width;
            mMLiveTranscoding3.width = mMLiveTranscoding3.height;
            mMLiveTranscoding3.height = d4;
        }
        MMLiveTranscoding mMLiveTranscoding4 = this.f14433n2;
        if (mMLiveTranscoding4.width <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || mMLiveTranscoding4.height <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        try {
            jSONObject = new JSONObject(string);
            if (jSONObject.has(com.tencent.connect.common.Constants.f57189TS)) {
                jSONObject.remove(com.tencent.connect.common.Constants.f57189TS);
            }
            jSONObject.put(com.tencent.connect.common.Constants.f57189TS, m19728Y1());
            if (jSONObject.has("bType")) {
                jSONObject.remove("bType");
            }
            jSONObject.put("bType", this.f14268H.f203888s);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                string = jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject(string);
        String string2 = jSONObject2.has(BaseSei.MID) ? jSONObject2.getString(BaseSei.MID) : "";
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        double d5 = 1.0d;
        if (jSONObject2.has(BaseSei.CONF)) {
            jSONArray = jSONObject2.getJSONArray(BaseSei.CONF);
        } else {
            if (!jSONObject2.has("has")) {
                return;
            }
            jSONArray = jSONObject2.getJSONArray("has");
            if (jSONArray != null) {
                MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser = new MMLiveTranscoding.MMLiveTranscodingUser();
                mMLiveTranscodingUser.uid = string2;
                mMLiveTranscodingUser.zOrder = 1;
                mMLiveTranscodingUser.posx = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                mMLiveTranscodingUser.posy = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                MMLiveTranscoding mMLiveTranscoding5 = this.f14433n2;
                mMLiveTranscodingUser.width = (int) mMLiveTranscoding5.width;
                mMLiveTranscodingUser.height = (int) mMLiveTranscoding5.height;
                mMLiveTranscodingUser.alpha = 1.0d;
                mMLiveTranscoding5.transcodingUserMap.put(string2, mMLiveTranscodingUser);
                this.f14433n2.transcodingExtraInfo = m19907x5(string);
            }
        }
        if (jSONArray == null) {
            return;
        }
        int i5 = 0;
        while (i5 < jSONArray.length()) {
            JSONObject jSONObject3 = (JSONObject) jSONArray.get(i5);
            String string3 = (jSONObject3 == null || !jSONObject3.has("id")) ? "" : jSONObject3.getString("id");
            double d6 = (jSONObject3 == null || !jSONObject3.has(BaseSei.f13930X)) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : jSONObject3.getDouble(BaseSei.f13930X);
            if (jSONObject3 != null) {
                str2 = str9;
                if (jSONObject3.has(str2)) {
                    d = jSONObject3.getDouble(str2);
                }
                if (jSONObject3 == null && jSONObject3.has(r6)) {
                    d2 = jSONObject3.getDouble("w");
                } else {
                    d2 = d5;
                }
                if (jSONObject3 != null) {
                    i = i4;
                    str3 = str8;
                    if (jSONObject3.has(str3)) {
                        d3 = jSONObject3.getDouble(str3);
                    }
                    if (jSONObject3 != null) {
                        str4 = str7;
                        if (jSONObject3.has(str4)) {
                            i2 = jSONObject3.getInt(str4) + 1;
                        }
                        if (jSONObject3 != null) {
                            jSONArray2 = jSONArray;
                            str5 = str11;
                            if (jSONObject3.has(str5)) {
                                jSONObject3.getDouble(str5);
                            }
                        } else {
                            jSONArray2 = jSONArray;
                            str5 = str11;
                        }
                        if (jSONObject3 != null) {
                            str11 = str5;
                            str6 = str10;
                            if (jSONObject3.has(str6)) {
                                jSONObject3.getString(str6);
                            }
                        } else {
                            str11 = str5;
                            str6 = str10;
                        }
                        MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser2 = new MMLiveTranscoding.MMLiveTranscodingUser();
                        mMLiveTranscodingUser2.uid = string3;
                        mMLiveTranscodingUser2.zOrder = i2;
                        str10 = str6;
                        str8 = str3;
                        mMLiveTranscodingUser2.alpha = 1.0d;
                        MMLiveTranscoding mMLiveTranscoding6 = this.f14433n2;
                        double d7 = mMLiveTranscoding6.width;
                        mMLiveTranscodingUser2.posx = (int) (d6 * d7);
                        double d8 = mMLiveTranscoding6.height;
                        mMLiveTranscodingUser2.posy = (int) (d8 * d);
                        mMLiveTranscodingUser2.width = (int) (d7 * d2);
                        mMLiveTranscodingUser2.height = (int) (d8 * d3);
                        mMLiveTranscoding6.transcodingUserMap.put(string3, mMLiveTranscodingUser2);
                        this.f14433n2.transcodingExtraInfo = m19907x5(string);
                        i5++;
                        jSONArray = jSONArray2;
                        str7 = str4;
                        i4 = i;
                        d5 = 1.0d;
                        str9 = str2;
                    } else {
                        str4 = str7;
                    }
                    i2 = i;
                    if (jSONObject3 != null) {
                        jSONArray2 = jSONArray;
                        str5 = str11;
                        if (jSONObject3.has(str5)) {
                            jSONObject3.getDouble(str5);
                        }
                    } else {
                        jSONArray2 = jSONArray;
                        str5 = str11;
                    }
                    if (jSONObject3 != null) {
                        str11 = str5;
                        str6 = str10;
                        if (jSONObject3.has(str6)) {
                            jSONObject3.getString(str6);
                        }
                    } else {
                        str11 = str5;
                        str6 = str10;
                    }
                    MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser3 = new MMLiveTranscoding.MMLiveTranscodingUser();
                    mMLiveTranscodingUser3.uid = string3;
                    mMLiveTranscodingUser3.zOrder = i2;
                    str10 = str6;
                    str8 = str3;
                    mMLiveTranscodingUser3.alpha = 1.0d;
                    MMLiveTranscoding mMLiveTranscoding7 = this.f14433n2;
                    double d9 = mMLiveTranscoding7.width;
                    mMLiveTranscodingUser3.posx = (int) (d6 * d9);
                    double d10 = mMLiveTranscoding7.height;
                    mMLiveTranscodingUser3.posy = (int) (d10 * d);
                    mMLiveTranscodingUser3.width = (int) (d9 * d2);
                    mMLiveTranscodingUser3.height = (int) (d10 * d3);
                    mMLiveTranscoding7.transcodingUserMap.put(string3, mMLiveTranscodingUser3);
                    this.f14433n2.transcodingExtraInfo = m19907x5(string);
                    i5++;
                    jSONArray = jSONArray2;
                    str7 = str4;
                    i4 = i;
                    d5 = 1.0d;
                    str9 = str2;
                } else {
                    i = i4;
                    str3 = str8;
                }
                d3 = d5;
                if (jSONObject3 != null) {
                    str4 = str7;
                    if (jSONObject3.has(str4)) {
                        i2 = jSONObject3.getInt(str4) + 1;
                    }
                    if (jSONObject3 != null) {
                        jSONArray2 = jSONArray;
                        str5 = str11;
                        if (jSONObject3.has(str5)) {
                            jSONObject3.getDouble(str5);
                        }
                    } else {
                        jSONArray2 = jSONArray;
                        str5 = str11;
                    }
                    if (jSONObject3 != null) {
                        str11 = str5;
                        str6 = str10;
                        if (jSONObject3.has(str6)) {
                            jSONObject3.getString(str6);
                        }
                    } else {
                        str11 = str5;
                        str6 = str10;
                    }
                    MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser4 = new MMLiveTranscoding.MMLiveTranscodingUser();
                    mMLiveTranscodingUser4.uid = string3;
                    mMLiveTranscodingUser4.zOrder = i2;
                    str10 = str6;
                    str8 = str3;
                    mMLiveTranscodingUser4.alpha = 1.0d;
                    MMLiveTranscoding mMLiveTranscoding8 = this.f14433n2;
                    double d11 = mMLiveTranscoding8.width;
                    mMLiveTranscodingUser4.posx = (int) (d6 * d11);
                    double d12 = mMLiveTranscoding8.height;
                    mMLiveTranscodingUser4.posy = (int) (d12 * d);
                    mMLiveTranscodingUser4.width = (int) (d11 * d2);
                    mMLiveTranscodingUser4.height = (int) (d12 * d3);
                    mMLiveTranscoding8.transcodingUserMap.put(string3, mMLiveTranscodingUser4);
                    this.f14433n2.transcodingExtraInfo = m19907x5(string);
                    i5++;
                    jSONArray = jSONArray2;
                    str7 = str4;
                    i4 = i;
                    d5 = 1.0d;
                    str9 = str2;
                } else {
                    str4 = str7;
                }
                i2 = i;
                if (jSONObject3 != null) {
                    jSONArray2 = jSONArray;
                    str5 = str11;
                    if (jSONObject3.has(str5)) {
                        jSONObject3.getDouble(str5);
                    }
                } else {
                    jSONArray2 = jSONArray;
                    str5 = str11;
                }
                if (jSONObject3 != null) {
                    str11 = str5;
                    str6 = str10;
                    if (jSONObject3.has(str6)) {
                        jSONObject3.getString(str6);
                    }
                } else {
                    str11 = str5;
                    str6 = str10;
                }
                MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser5 = new MMLiveTranscoding.MMLiveTranscodingUser();
                mMLiveTranscodingUser5.uid = string3;
                mMLiveTranscodingUser5.zOrder = i2;
                str10 = str6;
                str8 = str3;
                mMLiveTranscodingUser5.alpha = 1.0d;
                MMLiveTranscoding mMLiveTranscoding9 = this.f14433n2;
                double d13 = mMLiveTranscoding9.width;
                mMLiveTranscodingUser5.posx = (int) (d6 * d13);
                double d14 = mMLiveTranscoding9.height;
                mMLiveTranscodingUser5.posy = (int) (d14 * d);
                mMLiveTranscodingUser5.width = (int) (d13 * d2);
                mMLiveTranscodingUser5.height = (int) (d14 * d3);
                mMLiveTranscoding9.transcodingUserMap.put(string3, mMLiveTranscodingUser5);
                this.f14433n2.transcodingExtraInfo = m19907x5(string);
                i5++;
                jSONArray = jSONArray2;
                str7 = str4;
                i4 = i;
                d5 = 1.0d;
                str9 = str2;
            } else {
                str2 = str9;
            }
            d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (jSONObject3 == null) {
                d2 = d5;
            } else {
                d2 = d5;
            }
            if (jSONObject3 != null) {
                i = i4;
                str3 = str8;
                if (jSONObject3.has(str3)) {
                    d3 = jSONObject3.getDouble(str3);
                }
                if (jSONObject3 != null) {
                    str4 = str7;
                    if (jSONObject3.has(str4)) {
                        i2 = jSONObject3.getInt(str4) + 1;
                    }
                    if (jSONObject3 != null) {
                        jSONArray2 = jSONArray;
                        str5 = str11;
                        if (jSONObject3.has(str5)) {
                            jSONObject3.getDouble(str5);
                        }
                    } else {
                        jSONArray2 = jSONArray;
                        str5 = str11;
                    }
                    if (jSONObject3 != null) {
                        str11 = str5;
                        str6 = str10;
                        if (jSONObject3.has(str6)) {
                            jSONObject3.getString(str6);
                        }
                    } else {
                        str11 = str5;
                        str6 = str10;
                    }
                    MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser6 = new MMLiveTranscoding.MMLiveTranscodingUser();
                    mMLiveTranscodingUser6.uid = string3;
                    mMLiveTranscodingUser6.zOrder = i2;
                    str10 = str6;
                    str8 = str3;
                    mMLiveTranscodingUser6.alpha = 1.0d;
                    MMLiveTranscoding mMLiveTranscoding10 = this.f14433n2;
                    double d15 = mMLiveTranscoding10.width;
                    mMLiveTranscodingUser6.posx = (int) (d6 * d15);
                    double d16 = mMLiveTranscoding10.height;
                    mMLiveTranscodingUser6.posy = (int) (d16 * d);
                    mMLiveTranscodingUser6.width = (int) (d15 * d2);
                    mMLiveTranscodingUser6.height = (int) (d16 * d3);
                    mMLiveTranscoding10.transcodingUserMap.put(string3, mMLiveTranscodingUser6);
                    this.f14433n2.transcodingExtraInfo = m19907x5(string);
                    i5++;
                    jSONArray = jSONArray2;
                    str7 = str4;
                    i4 = i;
                    d5 = 1.0d;
                    str9 = str2;
                } else {
                    str4 = str7;
                }
                i2 = i;
                if (jSONObject3 != null) {
                    jSONArray2 = jSONArray;
                    str5 = str11;
                    if (jSONObject3.has(str5)) {
                        jSONObject3.getDouble(str5);
                    }
                } else {
                    jSONArray2 = jSONArray;
                    str5 = str11;
                }
                if (jSONObject3 != null) {
                    str11 = str5;
                    str6 = str10;
                    if (jSONObject3.has(str6)) {
                        jSONObject3.getString(str6);
                    }
                } else {
                    str11 = str5;
                    str6 = str10;
                }
                MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser7 = new MMLiveTranscoding.MMLiveTranscodingUser();
                mMLiveTranscodingUser7.uid = string3;
                mMLiveTranscodingUser7.zOrder = i2;
                str10 = str6;
                str8 = str3;
                mMLiveTranscodingUser7.alpha = 1.0d;
                MMLiveTranscoding mMLiveTranscoding11 = this.f14433n2;
                double d17 = mMLiveTranscoding11.width;
                mMLiveTranscodingUser7.posx = (int) (d6 * d17);
                double d18 = mMLiveTranscoding11.height;
                mMLiveTranscodingUser7.posy = (int) (d18 * d);
                mMLiveTranscodingUser7.width = (int) (d17 * d2);
                mMLiveTranscodingUser7.height = (int) (d18 * d3);
                mMLiveTranscoding11.transcodingUserMap.put(string3, mMLiveTranscodingUser7);
                this.f14433n2.transcodingExtraInfo = m19907x5(string);
                i5++;
                jSONArray = jSONArray2;
                str7 = str4;
                i4 = i;
                d5 = 1.0d;
                str9 = str2;
            } else {
                i = i4;
                str3 = str8;
            }
            d3 = d5;
            if (jSONObject3 != null) {
                str4 = str7;
                if (jSONObject3.has(str4)) {
                    i2 = jSONObject3.getInt(str4) + 1;
                }
                if (jSONObject3 != null) {
                    jSONArray2 = jSONArray;
                    str5 = str11;
                    if (jSONObject3.has(str5)) {
                        jSONObject3.getDouble(str5);
                    }
                } else {
                    jSONArray2 = jSONArray;
                    str5 = str11;
                }
                if (jSONObject3 != null) {
                    str11 = str5;
                    str6 = str10;
                    if (jSONObject3.has(str6)) {
                        jSONObject3.getString(str6);
                    }
                } else {
                    str11 = str5;
                    str6 = str10;
                }
                MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser8 = new MMLiveTranscoding.MMLiveTranscodingUser();
                mMLiveTranscodingUser8.uid = string3;
                mMLiveTranscodingUser8.zOrder = i2;
                str10 = str6;
                str8 = str3;
                mMLiveTranscodingUser8.alpha = 1.0d;
                MMLiveTranscoding mMLiveTranscoding12 = this.f14433n2;
                double d19 = mMLiveTranscoding12.width;
                mMLiveTranscodingUser8.posx = (int) (d6 * d19);
                double d110 = mMLiveTranscoding12.height;
                mMLiveTranscodingUser8.posy = (int) (d110 * d);
                mMLiveTranscodingUser8.width = (int) (d19 * d2);
                mMLiveTranscodingUser8.height = (int) (d110 * d3);
                mMLiveTranscoding12.transcodingUserMap.put(string3, mMLiveTranscodingUser8);
                this.f14433n2.transcodingExtraInfo = m19907x5(string);
                i5++;
                jSONArray = jSONArray2;
                str7 = str4;
                i4 = i;
                d5 = 1.0d;
                str9 = str2;
            } else {
                str4 = str7;
            }
            i2 = i;
            if (jSONObject3 != null) {
                jSONArray2 = jSONArray;
                str5 = str11;
                if (jSONObject3.has(str5)) {
                    jSONObject3.getDouble(str5);
                }
            } else {
                jSONArray2 = jSONArray;
                str5 = str11;
            }
            if (jSONObject3 != null) {
                str11 = str5;
                str6 = str10;
                if (jSONObject3.has(str6)) {
                    jSONObject3.getString(str6);
                }
            } else {
                str11 = str5;
                str6 = str10;
            }
            MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser9 = new MMLiveTranscoding.MMLiveTranscodingUser();
            mMLiveTranscodingUser9.uid = string3;
            mMLiveTranscodingUser9.zOrder = i2;
            str10 = str6;
            str8 = str3;
            mMLiveTranscodingUser9.alpha = 1.0d;
            MMLiveTranscoding mMLiveTranscoding13 = this.f14433n2;
            double d111 = mMLiveTranscoding13.width;
            mMLiveTranscodingUser9.posx = (int) (d6 * d111);
            double d112 = mMLiveTranscoding13.height;
            mMLiveTranscodingUser9.posy = (int) (d112 * d);
            mMLiveTranscodingUser9.width = (int) (d111 * d2);
            mMLiveTranscodingUser9.height = (int) (d112 * d3);
            mMLiveTranscoding13.transcodingUserMap.put(string3, mMLiveTranscodingUser9);
            this.f14433n2.transcodingExtraInfo = m19907x5(string);
            i5++;
            jSONArray = jSONArray2;
            str7 = str4;
            i4 = i;
            d5 = 1.0d;
            str9 = str2;
        }
        m19847c5(this.f14437p1.f182043v0);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: x1 */
    public long mo20054x1() {
        return this.f14428l1 * 1024;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x016c A[Catch: JSONException -> 0x01d7, TryCatch #0 {JSONException -> 0x01d7, blocks: (B:15:0x0057, B:18:0x0064, B:20:0x006a, B:23:0x0072, B:25:0x007d, B:28:0x0085, B:30:0x008b, B:33:0x00dd, B:37:0x00e6, B:39:0x00ec, B:41:0x00f4, B:43:0x00fa, B:46:0x0102, B:48:0x0108, B:51:0x0111, B:53:0x0117, B:56:0x0120, B:58:0x0126, B:61:0x012f, B:63:0x0135, B:66:0x013e, B:68:0x0144, B:71:0x014d, B:73:0x0155, B:77:0x016c, B:79:0x0176, B:81:0x017e, B:31:0x00d7), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0176 A[Catch: JSONException -> 0x01d7, TryCatch #0 {JSONException -> 0x01d7, blocks: (B:15:0x0057, B:18:0x0064, B:20:0x006a, B:23:0x0072, B:25:0x007d, B:28:0x0085, B:30:0x008b, B:33:0x00dd, B:37:0x00e6, B:39:0x00ec, B:41:0x00f4, B:43:0x00fa, B:46:0x0102, B:48:0x0108, B:51:0x0111, B:53:0x0117, B:56:0x0120, B:58:0x0126, B:61:0x012f, B:63:0x0135, B:66:0x013e, B:68:0x0144, B:71:0x014d, B:73:0x0155, B:77:0x016c, B:79:0x0176, B:81:0x017e, B:31:0x00d7), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX INFO: renamed from: x6 */
    public void m20055x6(String str) {
        JSONArray jSONArray;
        String str2;
        int i;
        String str3;
        String str4 = BaseSei.f13932Z;
        String str5 = "h";
        String str6 = "w";
        String str7 = BaseSei.f13931Y;
        if (this.f14437p1 == null || str == null) {
            return;
        }
        MMLiveTranscoding mMLiveTranscoding = this.f14433n2;
        if (mMLiveTranscoding == null) {
            this.f14433n2 = new MMLiveTranscoding();
        } else {
            mMLiveTranscoding.transcodingUserMap.clear();
        }
        MMLiveTranscoding mMLiveTranscoding2 = this.f14433n2;
        qmr qmrVar = this.f14437p1;
        String str8 = "renderMode";
        String str9 = "alpha";
        double d = qmrVar.f177148k;
        mMLiveTranscoding2.width = d;
        double d2 = qmrVar.f177150l;
        mMLiveTranscoding2.height = d2;
        mMLiveTranscoding2.videoGop = 15;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.has(BaseSei.MID) ? jSONObject.getString(BaseSei.MID) : "";
            if (TextUtils.isEmpty(string)) {
                return;
            }
            int i2 = 1;
            if (jSONObject.has(BaseSei.CONF)) {
                jSONArray = jSONObject.getJSONArray(BaseSei.CONF);
            } else {
                if (!jSONObject.has("has")) {
                    return;
                }
                jSONArray = jSONObject.getJSONArray("has");
                if (jSONArray != null) {
                    MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser = new MMLiveTranscoding.MMLiveTranscodingUser();
                    mMLiveTranscodingUser.zOrder = 1;
                    mMLiveTranscodingUser.alpha = 1.0d;
                    mMLiveTranscodingUser.uid = string;
                    MMLiveTranscoding mMLiveTranscoding3 = this.f14433n2;
                    double d3 = mMLiveTranscoding3.width;
                    mMLiveTranscodingUser.posx = (int) (d3 * 0.02280000038444996d);
                    double d4 = mMLiveTranscoding3.height;
                    mMLiveTranscodingUser.posy = (int) (d4 * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    mMLiveTranscodingUser.width = (int) (0.2614000141620636d * d3);
                    mMLiveTranscodingUser.height = (int) (0.2500399947166443d * d4);
                    mMLiveTranscoding3.transcodingUserMap.put(string, mMLiveTranscodingUser);
                    this.f14433n2.transcodingExtraInfo = m19907x5(this.f14336D1);
                }
            }
            if (jSONArray != null && jSONArray.length() != 0) {
                int i3 = 0;
                while (i3 < jSONArray.length()) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i3);
                    String string2 = (jSONObject2 == null || !jSONObject2.has("id")) ? "" : jSONObject2.getString("id");
                    double d5 = (jSONObject2 == null || !jSONObject2.has(BaseSei.f13930X)) ? 0.0d : jSONObject2.getDouble(BaseSei.f13930X);
                    double d6 = (jSONObject2 == null || !jSONObject2.has(str7)) ? 0.0d : jSONObject2.getDouble(str7);
                    double d7 = (jSONObject2 == null || !jSONObject2.has(str6)) ? 1.0d : jSONObject2.getDouble(str6);
                    double d8 = (jSONObject2 == null || !jSONObject2.has(str5)) ? 1.0d : jSONObject2.getDouble(str5);
                    int i4 = (jSONObject2 == null || !jSONObject2.has(str4)) ? i2 : jSONObject2.getInt(str4) + i2;
                    if (jSONObject2 != null) {
                        str2 = str9;
                        double d9 = jSONObject2.has(str2) ? jSONObject2.getDouble(str2) : 1.0d;
                        if (jSONObject2 != null) {
                            i = i3;
                            str3 = str8;
                            if (jSONObject2.has(str3)) {
                                jSONObject2.getString(str3);
                            }
                        } else {
                            i = i3;
                            str3 = str8;
                        }
                        MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser2 = new MMLiveTranscoding.MMLiveTranscodingUser();
                        mMLiveTranscodingUser2.uid = string2;
                        mMLiveTranscodingUser2.zOrder = i4;
                        MMLiveTranscoding mMLiveTranscoding4 = this.f14433n2;
                        String str10 = str6;
                        String str11 = str7;
                        double d10 = mMLiveTranscoding4.width;
                        mMLiveTranscodingUser2.posx = (int) (d5 * d10);
                        double d11 = mMLiveTranscoding4.height;
                        mMLiveTranscodingUser2.posy = (int) (d11 * d6);
                        mMLiveTranscodingUser2.width = (int) (d10 * d7);
                        mMLiveTranscodingUser2.height = (int) (d11 * d8);
                        mMLiveTranscodingUser2.alpha = (float) d9;
                        mMLiveTranscoding4.transcodingUserMap.put(string2, mMLiveTranscodingUser2);
                        this.f14433n2.transcodingExtraInfo = m19907x5(this.f14336D1);
                        str6 = str10;
                        str4 = str4;
                        str5 = str5;
                        str7 = str11;
                        str8 = str3;
                        i3 = i + 1;
                        str9 = str2;
                        i2 = 1;
                    } else {
                        str2 = str9;
                    }
                    if (jSONObject2 != null) {
                        i = i3;
                        str3 = str8;
                        if (jSONObject2.has(str3)) {
                            jSONObject2.getString(str3);
                        }
                    } else {
                        i = i3;
                        str3 = str8;
                    }
                    MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser3 = new MMLiveTranscoding.MMLiveTranscodingUser();
                    mMLiveTranscodingUser3.uid = string2;
                    mMLiveTranscodingUser3.zOrder = i4;
                    MMLiveTranscoding mMLiveTranscoding5 = this.f14433n2;
                    String str12 = str6;
                    String str13 = str7;
                    double d12 = mMLiveTranscoding5.width;
                    mMLiveTranscodingUser3.posx = (int) (d5 * d12);
                    double d13 = mMLiveTranscoding5.height;
                    mMLiveTranscodingUser3.posy = (int) (d13 * d6);
                    mMLiveTranscodingUser3.width = (int) (d12 * d7);
                    mMLiveTranscodingUser3.height = (int) (d13 * d8);
                    mMLiveTranscodingUser3.alpha = (float) d9;
                    mMLiveTranscoding5.transcodingUserMap.put(string2, mMLiveTranscodingUser3);
                    this.f14433n2.transcodingExtraInfo = m19907x5(this.f14336D1);
                    str6 = str12;
                    str4 = str4;
                    str5 = str5;
                    str7 = str13;
                    str8 = str3;
                    i3 = i + 1;
                    str9 = str2;
                    i2 = 1;
                }
                m19847c5(this.f14437p1.f182043v0);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y */
    public void mo19671y(int i, int i2) {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.enableAudioVolumeIndication(i, i2);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y0 */
    public void mo19672y0(int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: y5 */
    public float m20056y5() {
        return this.f14423j1;
    }

    /* JADX INFO: renamed from: y6 */
    public void m20057y6(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        float f2 = f * 1.8f;
        this.f14421i1 = f2;
        this.f14268H.f203797H0 = f2;
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            mMRtcEngine.adjustRecordingSignalVolume((int) (f2 * 100.0f));
        }
    }

    /* JADX INFO: renamed from: z5 */
    public long m20058z5() {
        MMRtcEngine mMRtcEngine = this.f14387U;
        if (mMRtcEngine != null) {
            return mMRtcEngine.getAudioMixingDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: z6 */
    public void m20059z6(boolean z, int i) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo19652K1(mpd0 mpd0Var) {
    }

    /* JADX INFO: renamed from: L4 */
    public void m19945L4(wmw wmwVar) {
    }

    /* JADX INFO: renamed from: O4 */
    public void m19957O4(xmw xmwVar) {
    }

    /* JADX INFO: renamed from: W4 */
    public void m19984W4(anw anwVar) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo19664l0(vlw vlwVar, EGLContext eGLContext) {
    }

    public MoMoRtcPushFilter(Context context, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar, String str) {
        super(context);
        this.f14380S = "MoMoRtcPushFilter";
        this.f14384T = true;
        this.f14390V = -1;
        this.f14396X = false;
        this.f14399Y = false;
        this.f14402Z = false;
        this.f14425k0 = 0;
        this.f14436p0 = 0;
        this.f14338E0 = false;
        this.f14341F0 = true;
        this.f14344G0 = null;
        this.f14353J0 = 0L;
        this.f14356K0 = 0;
        this.f14359L0 = 0;
        this.f14362M0 = 0L;
        this.f14365N0 = 0L;
        this.f14368O0 = 0L;
        this.f14381S0 = new PipelineConcurrentHashMap<>();
        this.f14385T0 = new PipelineConcurrentHashMap<>();
        this.f14388U0 = false;
        this.f14391V0 = true;
        this.f14394W0 = 0;
        this.f14397X0 = 0;
        this.f14400Y0 = 0;
        this.f14403Z0 = "1e6127d73cd4d405905aa6f2ad5e1a67";
        this.f14405a1 = null;
        this.f14407b1 = null;
        this.f14409c1 = null;
        this.f14411d1 = null;
        this.f14415f1 = false;
        this.f14417g1 = false;
        this.f14421i1 = 1.8f;
        this.f14423j1 = 1.0f;
        this.f14426k1 = 44100;
        this.f14428l1 = 0;
        this.f14430m1 = 0;
        this.f14432n1 = 0;
        this.f14434o1 = 0;
        this.f14439q1 = -1;
        this.f14443s1 = null;
        this.f14445t1 = 1;
        this.f14447u1 = new Object();
        this.f14449v1 = 0;
        this.f14453x1 = false;
        this.f14455y1 = false;
        this.f14457z1 = false;
        this.f14330A1 = new Object();
        this.f14332B1 = new PipelineConcurrentHashMap();
        this.f14334C1 = false;
        this.f14342F1 = null;
        this.f14348H1 = 0;
        this.f14351I1 = 750000;
        this.f14354J1 = "";
        this.f14357K1 = false;
        this.f14360L1 = false;
        this.f14363M1 = false;
        this.f14366N1 = 0.0f;
        this.f14369O1 = 0.0f;
        this.f14372P1 = 0.0f;
        this.f14375Q1 = 0.0f;
        this.f14382S1 = null;
        this.f14386T1 = null;
        this.f14408b2 = null;
        this.f14414e2 = new zmw();
        this.f14416f2 = new zmw();
        this.f14418g2 = new jjw();
        this.f14420h2 = new vmw();
        this.f14424j2 = false;
        this.f14427k2 = false;
        this.f14429l2 = true;
        this.f14431m2 = false;
        this.f14433n2 = null;
        this.f14435o2 = false;
        this.f14442r2 = "";
        this.f14444s2 = 15;
        this.f14446t2 = 0L;
        this.f14448u2 = null;
        this.f14450v2 = null;
        this.f14452w2 = ByteBuffer.allocate(8192);
        this.f14454x2 = ByteBuffer.allocate(8192);
        this.f14331A2 = null;
        this.f14333B2 = null;
        this.f14335C2 = new ArrayMap();
        this.f14337D2 = null;
        this.f14340E2 = false;
        this.f14343F2 = new Handler(Looper.getMainLooper());
        this.f14346G2 = false;
        this.f14349H2 = false;
        this.f14355J2 = 0;
        this.f14358K2 = 0;
        this.f14361L2 = false;
        this.f14364M2 = false;
        this.f14367N2 = 0L;
        this.f14370O2 = false;
        this.f14373P2 = 0;
        this.f14376Q2 = false;
        this.f14379R2 = false;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.momo.piplineext.codec.MoMoRtcPushFilter.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent.getAction().equals("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                    if (intent.getIntExtra("state", 0) == 0) {
                        if (MoMoRtcPushFilter.this.f14387U == null || true != fjx.m121638R().m121648D()) {
                            return;
                        }
                        MoMoRtcPushFilter.this.f14387U.setParameters("{\"che.audio.enable.ns\":true}");
                        return;
                    }
                    if (intent.getIntExtra("state", 0) == 1 && MoMoRtcPushFilter.this.f14387U != null && true == fjx.m121638R().m121648D()) {
                        MoMoRtcPushFilter.this.f14387U.setParameters("{\"che.audio.enable.ns\":false}");
                    }
                }
            }
        };
        this.f14383S2 = broadcastReceiver;
        this.f14403Z0 = str;
        ContextUtils.initialize(context);
        this.f14347H0 = yw00Var;
        this.f14437p1 = (qmr) vlwVar;
        this.f14388U0 = false;
        this.f14391V0 = true;
        this.f14419h1 = interfaceC17392a;
        m19870m5(vlwVar);
        zmx zmxVar = this.f14268H;
        zmxVar.f203843d = 260L;
        zmxVar.f203848e1 = String.valueOf(hashCode());
        this.f14268H.f203851f1 = 1L;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        if (context != null) {
            ii5.m136342l(context, broadcastReceiver, intentFilter);
        }
    }
}
