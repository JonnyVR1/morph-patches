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
import p153l.arx;
import p153l.brx;
import p153l.csx;
import p153l.dc1;
import p153l.dpl;
import p153l.ebl0;
import p153l.esx;
import p153l.fbl0;
import p153l.g510;
import p153l.gb1;
import p153l.gfj;
import p153l.gkl0;
import p153l.imw;
import p153l.iny;
import p153l.jj5;
import p153l.kod0;
import p153l.l6m;
import p153l.nnw;
import p153l.o410;
import p153l.oq70;
import p153l.oxd0;
import p153l.p7f;
import p153l.pwk;
import p153l.q210;
import p153l.ror;
import p153l.sti0;
import p153l.t9c;
import p153l.tpw;
import p153l.uow;
import p153l.upw;
import p153l.vpw;
import p153l.wpw;
import p153l.wvx;
import p153l.wyl;
import p153l.wzl;
import p153l.xhy;
import p153l.xpw;
import p153l.ypw;
import p153l.yt0;

/* JADX INFO: loaded from: classes8.dex */
public class MoMoRtcPushFilter extends MediaBaseCodecFilter implements IAudioFrameObserver, dpl, wyl, o410.InterfaceC19026f {

    /* JADX INFO: renamed from: T2 */
    private static final float[] f15020T2 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: U2 */
    static String f15021U2 = "v3.momoRtcMsgLogin";

    /* JADX INFO: renamed from: V2 */
    static String f15022V2 = "v3.momoRtcMsgOnLogin";

    /* JADX INFO: renamed from: W2 */
    static String f15023W2 = "v3.momoRtcMsgHeart";

    /* JADX INFO: renamed from: X2 */
    static String f15024X2 = "v3.momoRtcMsgJoin";

    /* JADX INFO: renamed from: Y2 */
    static String f15025Y2 = "v3.momoRtcMsgOnJoin";

    /* JADX INFO: renamed from: Z2 */
    static String f15026Z2 = "v3.momoRtcMsgLeave";

    /* JADX INFO: renamed from: a3 */
    static String f15027a3 = "v3.momoRtcMsgOnLeave";

    /* JADX INFO: renamed from: b3 */
    static String f15028b3 = "v3.momoRtcMsgPeerJoin";

    /* JADX INFO: renamed from: c3 */
    static String f15029c3 = "v3.momoRtcMsgPeerLeave";

    /* JADX INFO: renamed from: d3 */
    static String f15030d3 = "v3.momoRtcMsgAddUrl";

    /* JADX INFO: renamed from: e3 */
    static String f15031e3 = "v3.momoRtcMsgRemoveUrl";

    /* JADX INFO: renamed from: f3 */
    static String f15032f3 = "v3.momoRtcMsgTranscoding";

    /* JADX INFO: renamed from: g3 */
    static String f15033g3 = "v3.momoRtcMsgLocalAudioMute";

    /* JADX INFO: renamed from: h3 */
    static String f15034h3 = "v3.momoRtcMsgRemoteAudioMute";

    /* JADX INFO: renamed from: i3 */
    static String f15035i3 = "v3.momoRtcMsgLocalVideoMute";

    /* JADX INFO: renamed from: j3 */
    static String f15036j3 = "v3.momoRtcMsgRemoteVideoMute";

    /* JADX INFO: renamed from: k3 */
    static String f15037k3 = "v3.momoRtcMsgReJoin";

    /* JADX INFO: renamed from: l3 */
    static String f15038l3 = "v3.momoRtcMsgOnReJoin";

    /* JADX INFO: renamed from: m3 */
    static String f15039m3 = "v3.momoRtcMsgStartPK";

    /* JADX INFO: renamed from: n3 */
    static String f15040n3 = "v3.momoRtcMsgOnStartPK";

    /* JADX INFO: renamed from: o3 */
    static String f15041o3 = "v3.momoRtcMsgStopPK";

    /* JADX INFO: renamed from: p3 */
    static String f15042p3 = "v3.momoRtcMsgOnStopPK";

    /* JADX INFO: renamed from: q3 */
    static String f15043q3 = "v3.momoRtcMsgPeerLost";

    /* JADX INFO: renamed from: r3 */
    static String f15044r3 = "v3.momoRtcMsgKeyExpired";

    /* JADX INFO: renamed from: s3 */
    static String f15045s3 = "v3.momoRtcMsgKeyUpdate";

    /* JADX INFO: renamed from: t3 */
    static String f15046t3 = "v3.momoRtcMsgChangeRole";

    /* JADX INFO: renamed from: u3 */
    static String f15047u3 = "v3.momoRtcMsgOnChangeRole";

    /* JADX INFO: renamed from: v3 */
    static String f15048v3 = "v3.momoRtcMsgOnKicked";

    /* JADX INFO: renamed from: A1 */
    private Object f15049A1;

    /* JADX INFO: renamed from: A2 */
    private String f15050A2;

    /* JADX INFO: renamed from: B1 */
    private PipelineConcurrentHashMap f15051B1;

    /* JADX INFO: renamed from: B2 */
    private String f15052B2;

    /* JADX INFO: renamed from: C1 */
    private volatile boolean f15053C1;

    /* JADX INFO: renamed from: C2 */
    private final Map<Integer, SurfaceViewRenderer> f15054C2;

    /* JADX INFO: renamed from: D1 */
    private String f15055D1;

    /* JADX INFO: renamed from: D2 */
    Timer f15056D2;

    /* JADX INFO: renamed from: E0 */
    private boolean f15057E0;

    /* JADX INFO: renamed from: E1 */
    private String f15058E1;

    /* JADX INFO: renamed from: E2 */
    private boolean f15059E2;

    /* JADX INFO: renamed from: F0 */
    private boolean f15060F0;

    /* JADX INFO: renamed from: F1 */
    public SurfaceTexture f15061F1;

    /* JADX INFO: renamed from: F2 */
    private Handler f15062F2;

    /* JADX INFO: renamed from: G0 */
    private String f15063G0;

    /* JADX INFO: renamed from: G1 */
    private pcmDataAvailableCallback f15064G1;

    /* JADX INFO: renamed from: G2 */
    private boolean f15065G2;

    /* JADX INFO: renamed from: H0 */
    private g510 f15066H0;

    /* JADX INFO: renamed from: H1 */
    private int f15067H1;

    /* JADX INFO: renamed from: H2 */
    private boolean f15068H2;

    /* JADX INFO: renamed from: I0 */
    private dc1 f15069I0;

    /* JADX INFO: renamed from: I1 */
    private int f15070I1;

    /* JADX INFO: renamed from: I2 */
    private MRtcPusherHandler f15071I2;

    /* JADX INFO: renamed from: J0 */
    private long f15072J0;

    /* JADX INFO: renamed from: J1 */
    private String f15073J1;

    /* JADX INFO: renamed from: J2 */
    private int f15074J2;

    /* JADX INFO: renamed from: K0 */
    private int f15075K0;

    /* JADX INFO: renamed from: K1 */
    private boolean f15076K1;

    /* JADX INFO: renamed from: K2 */
    private int f15077K2;

    /* JADX INFO: renamed from: L0 */
    private int f15078L0;

    /* JADX INFO: renamed from: L1 */
    private boolean f15079L1;

    /* JADX INFO: renamed from: L2 */
    private volatile boolean f15080L2;

    /* JADX INFO: renamed from: M0 */
    private long f15081M0;

    /* JADX INFO: renamed from: M1 */
    private boolean f15082M1;

    /* JADX INFO: renamed from: M2 */
    private boolean f15083M2;

    /* JADX INFO: renamed from: N0 */
    private long f15084N0;

    /* JADX INFO: renamed from: N1 */
    private float f15085N1;

    /* JADX INFO: renamed from: N2 */
    private long f15086N2;

    /* JADX INFO: renamed from: O0 */
    private long f15087O0;

    /* JADX INFO: renamed from: O1 */
    private float f15088O1;

    /* JADX INFO: renamed from: O2 */
    private boolean f15089O2;

    /* JADX INFO: renamed from: P0 */
    private MMRtcStats f15090P0;

    /* JADX INFO: renamed from: P1 */
    private float f15091P1;

    /* JADX INFO: renamed from: P2 */
    private int f15092P2;

    /* JADX INFO: renamed from: Q0 */
    private IMMRtcEngineEventInterface.RemoteVideoStats f15093Q0;

    /* JADX INFO: renamed from: Q1 */
    private float f15094Q1;

    /* JADX INFO: renamed from: Q2 */
    private volatile boolean f15095Q2;

    /* JADX INFO: renamed from: R0 */
    private IMMRtcEngineEventInterface.LocalVideoStats f15096R0;

    /* JADX INFO: renamed from: R1 */
    IMMRtcEngineEventInterface f15097R1;

    /* JADX INFO: renamed from: R2 */
    private boolean f15098R2;

    /* JADX INFO: renamed from: S */
    private final String f15099S;

    /* JADX INFO: renamed from: S0 */
    private PipelineConcurrentHashMap<Long, iny> f15100S0;

    /* JADX INFO: renamed from: S1 */
    Runnable f15101S1;

    /* JADX INFO: renamed from: S2 */
    private final BroadcastReceiver f15102S2;

    /* JADX INFO: renamed from: T */
    private boolean f15103T;

    /* JADX INFO: renamed from: T0 */
    private PipelineConcurrentHashMap<Long, xhy> f15104T0;

    /* JADX INFO: renamed from: T1 */
    private AudioVolumeInfo[] f15105T1;

    /* JADX INFO: renamed from: U */
    private MMRtcEngine f15106U;

    /* JADX INFO: renamed from: U0 */
    private boolean f15107U0;

    /* JADX INFO: renamed from: U1 */
    private MRtcAudioHandler f15108U1;

    /* JADX INFO: renamed from: V */
    private int f15109V;

    /* JADX INFO: renamed from: V0 */
    private boolean f15110V0;

    /* JADX INFO: renamed from: V1 */
    private MRtcAudioHandlerEx f15111V1;

    /* JADX INFO: renamed from: W */
    private EGLContext f15112W;

    /* JADX INFO: renamed from: W0 */
    private int f15113W0;

    /* JADX INFO: renamed from: W1 */
    private MRtcEventHandler f15114W1;

    /* JADX INFO: renamed from: X */
    private volatile boolean f15115X;

    /* JADX INFO: renamed from: X0 */
    private int f15116X0;

    /* JADX INFO: renamed from: X1 */
    private MRtcChannelHandler f15117X1;

    /* JADX INFO: renamed from: Y */
    private boolean f15118Y;

    /* JADX INFO: renamed from: Y0 */
    private volatile int f15119Y0;

    /* JADX INFO: renamed from: Y1 */
    private MRtcTokenWillExpireHander f15120Y1;

    /* JADX INFO: renamed from: Z */
    private boolean f15121Z;

    /* JADX INFO: renamed from: Z0 */
    private String f15122Z0;

    /* JADX INFO: renamed from: Z1 */
    private wpw f15123Z1;

    /* JADX INFO: renamed from: a1 */
    private ebl0 f15124a1;

    /* JADX INFO: renamed from: a2 */
    private MRtcQualityHandler f15125a2;

    /* JADX INFO: renamed from: b1 */
    private fbl0 f15126b1;

    /* JADX INFO: renamed from: b2 */
    private MRtcReceiveSeiHandler f15127b2;

    /* JADX INFO: renamed from: c1 */
    private gkl0 f15128c1;

    /* JADX INFO: renamed from: c2 */
    private MRtcConnectHandler f15129c2;

    /* JADX INFO: renamed from: d1 */
    private MRtcRealLayoutNotifyHander f15130d1;

    /* JADX INFO: renamed from: d2 */
    private MRtcClientRoleChangedHandler f15131d2;

    /* JADX INFO: renamed from: e1 */
    private dpl.InterfaceC16599a f15132e1;

    /* JADX INFO: renamed from: e2 */
    private xpw f15133e2;

    /* JADX INFO: renamed from: f1 */
    private boolean f15134f1;

    /* JADX INFO: renamed from: f2 */
    private xpw f15135f2;

    /* JADX INFO: renamed from: g1 */
    private boolean f15136g1;

    /* JADX INFO: renamed from: g2 */
    private imw f15137g2;

    /* JADX INFO: renamed from: h1 */
    private q210.InterfaceC19500a f15138h1;

    /* JADX INFO: renamed from: h2 */
    private tpw f15139h2;

    /* JADX INFO: renamed from: i1 */
    private float f15140i1;

    /* JADX INFO: renamed from: i2 */
    private C4245f f15141i2;

    /* JADX INFO: renamed from: j1 */
    private float f15142j1;

    /* JADX INFO: renamed from: j2 */
    private boolean f15143j2;

    /* JADX INFO: renamed from: k0 */
    private int f15144k0;

    /* JADX INFO: renamed from: k1 */
    public int f15145k1;

    /* JADX INFO: renamed from: k2 */
    private boolean f15146k2;

    /* JADX INFO: renamed from: l1 */
    private int f15147l1;

    /* JADX INFO: renamed from: l2 */
    private boolean f15148l2;

    /* JADX INFO: renamed from: m1 */
    private int f15149m1;

    /* JADX INFO: renamed from: m2 */
    private boolean f15150m2;

    /* JADX INFO: renamed from: n1 */
    private int f15151n1;

    /* JADX INFO: renamed from: n2 */
    private MMLiveTranscoding f15152n2;

    /* JADX INFO: renamed from: o1 */
    private int f15153o1;

    /* JADX INFO: renamed from: o2 */
    private boolean f15154o2;

    /* JADX INFO: renamed from: p0 */
    private int f15155p0;

    /* JADX INFO: renamed from: p1 */
    private ror f15156p1;

    /* JADX INFO: renamed from: p2 */
    private String f15157p2;

    /* JADX INFO: renamed from: q1 */
    protected int f15158q1;

    /* JADX INFO: renamed from: q2 */
    private int f15159q2;

    /* JADX INFO: renamed from: r1 */
    private boolean f15160r1;

    /* JADX INFO: renamed from: r2 */
    private String f15161r2;

    /* JADX INFO: renamed from: s1 */
    private String f15162s1;

    /* JADX INFO: renamed from: s2 */
    private int f15163s2;

    /* JADX INFO: renamed from: t1 */
    private int f15164t1;

    /* JADX INFO: renamed from: t2 */
    private long f15165t2;

    /* JADX INFO: renamed from: u1 */
    private Object f15166u1;

    /* JADX INFO: renamed from: u2 */
    private AudioResampleUtils f15167u2;

    /* JADX INFO: renamed from: v1 */
    private int f15168v1;

    /* JADX INFO: renamed from: v2 */
    private AudioResampleUtils f15169v2;

    /* JADX INFO: renamed from: w1 */
    private EglBase f15170w1;

    /* JADX INFO: renamed from: w2 */
    ByteBuffer f15171w2;

    /* JADX INFO: renamed from: x1 */
    private boolean f15172x1;

    /* JADX INFO: renamed from: x2 */
    ByteBuffer f15173x2;

    /* JADX INFO: renamed from: y1 */
    private boolean f15174y1;

    /* JADX INFO: renamed from: y2 */
    private kod0 f15175y2;

    /* JADX INFO: renamed from: z1 */
    private boolean f15176z1;

    /* JADX INFO: renamed from: z2 */
    private brx f15177z2;

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$a */
    public class RunnableC4240a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f15179a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ byte[] f15180b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f15181c;

        public RunnableC4240a(byte[] bArr, byte[] bArr2, long j) {
            this.f15179a = bArr;
            this.f15180b = bArr2;
            this.f15181c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (MoMoRtcPushFilter.this.f15166u1) {
                try {
                    if (MoMoRtcPushFilter.this.f15130d1 != null) {
                        MoMoRtcPushFilter.this.f15130d1.OnRealLayoutChange(this.f15179a, this.f15180b, 4, this.f15181c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$b */
    public class C4241b implements ExtAudioWrapper.InterfaceC4259i {
        public C4241b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4259i
        /* JADX INFO: renamed from: a */
        public void mo21059a(String str) {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4259i
        /* JADX INFO: renamed from: b */
        public void mo21060b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4259i
        public int getStreamerType() {
            return 4;
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c */
    public class C4242c implements IMMRtcEngineEventInterface {

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f15185a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f15186b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f15187c;

            /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a$a, reason: collision with other inner class name */
            public class C22809a implements RendererCommon.RendererEvents {
                public C22809a() {
                }

                @Override // com.momo.rtcbase.RendererCommon.RendererEvents
                public void onFirstFrameRendered() {
                }

                @Override // com.momo.rtcbase.RendererCommon.RendererEvents
                public void onFrameResolutionChanged(int i, int i2, int i3) {
                }
            }

            /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a$b */
            public class b implements gkl0.InterfaceC17240c {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ SurfaceViewRenderer f15190a;

                public b(SurfaceViewRenderer surfaceViewRenderer) {
                    this.f15190a = surfaceViewRenderer;
                }

                @Override // p153l.gkl0.InterfaceC17240c
                /* JADX INFO: renamed from: a */
                public void mo21063a(SurfaceTexture surfaceTexture) {
                    a aVar = a.this;
                    surfaceTexture.setDefaultBufferSize(aVar.f15186b, aVar.f15187c);
                    this.f15190a.surfaceTextureCreated(surfaceTexture);
                    MoMoRtcPushFilter.this.f15106U.setupRemoteVideo(new VideoCanvas(this.f15190a, 1, a.this.f15185a));
                }
            }

            /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a$c */
            public class c implements gkl0.InterfaceC17240c {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ SurfaceViewRenderer f15192a;

                public c(SurfaceViewRenderer surfaceViewRenderer) {
                    this.f15192a = surfaceViewRenderer;
                }

                @Override // p153l.gkl0.InterfaceC17240c
                /* JADX INFO: renamed from: a */
                public void mo21063a(SurfaceTexture surfaceTexture) {
                    a aVar = a.this;
                    surfaceTexture.setDefaultBufferSize(aVar.f15186b, aVar.f15187c);
                    this.f15192a.surfaceTextureCreated(surfaceTexture);
                    MoMoRtcPushFilter.this.f15106U.setupRemoteVideo(new VideoCanvas(this.f15192a, 1, a.this.f15185a));
                }
            }

            public a(int i, int i2, int i3) {
                this.f15185a = i;
                this.f15186b = i2;
                this.f15187c = i3;
            }

            @Override // java.lang.Runnable
            @RequiresApi(api = 15)
            public void run() {
                if (MoMoRtcPushFilter.this.f15170w1 == null) {
                    MoMoRtcPushFilter.this.f15170w1 = EglBase.create();
                }
                SurfaceViewRenderer surfaceViewRendererCreateRendererView = MMRtcEngine.CreateRendererView(MoMoRtcPushFilter.this.m20725W1());
                surfaceViewRendererCreateRendererView.init(MoMoRtcPushFilter.this.f15170w1.getEglBaseContext(), new C22809a());
                surfaceViewRendererCreateRendererView.setZOrderOnTop(true);
                surfaceViewRendererCreateRendererView.setZOrderMediaOverlay(true);
                synchronized (MoMoRtcPushFilter.this.f15054C2) {
                    MoMoRtcPushFilter.this.f15054C2.put(Integer.valueOf(this.f15185a), surfaceViewRendererCreateRendererView);
                }
                if (MoMoRtcPushFilter.this.f15106U != null) {
                    MoMoRtcPushFilter.this.f15106U.setupRemoteVideo(new VideoCanvas(surfaceViewRendererCreateRendererView, 1, this.f15185a));
                }
                if (!MoMoRtcPushFilter.this.f15143j2 && MoMoRtcPushFilter.this.f15128c1 == null && MoMoRtcPushFilter.this.f15126b1 == null) {
                    if (MoMoRtcPushFilter.this.f15124a1 == null || MoMoRtcPushFilter.this.f15174y1 || MoMoRtcPushFilter.this.f15172x1) {
                        return;
                    }
                    oq70.m168791d().m168795c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelAdded: userID=" + this.f15185a);
                    MoMoRtcPushFilter.this.f15124a1.mo20117a((long) this.f15185a, surfaceViewRendererCreateRendererView, this.f15186b, this.f15187c);
                    return;
                }
                if (MoMoRtcPushFilter.this.f15051B1.containsKey(Integer.valueOf(this.f15185a))) {
                    return;
                }
                MoMoRtcPushFilter.this.f15051B1.put(Integer.valueOf(this.f15185a), Integer.valueOf(this.f15185a));
                if (MoMoRtcPushFilter.this.f15128c1 != null) {
                    MoMoRtcPushFilter.this.f15128c1.mo20123a(this.f15185a, new b(surfaceViewRendererCreateRendererView), this.f15186b, this.f15187c);
                    return;
                }
                sti0 sti0Var = new sti0(this.f15185a, this.f15186b, this.f15187c, new c(surfaceViewRendererCreateRendererView));
                if (MoMoRtcPushFilter.this.f15126b1 == null || MoMoRtcPushFilter.this.f15174y1 || MoMoRtcPushFilter.this.f15172x1) {
                    return;
                }
                oq70.m168791d().m168795c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + this.f15185a);
                MoMoRtcPushFilter.this.f15126b1.mo109337a((long) this.f15185a, sti0Var, this.f15186b, this.f15187c);
            }
        }

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f15194a;

            public b(int i) {
                this.f15194a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MoMoRtcPushFilter.this.f15124a1 != null) {
                    oq70.m168791d().m168795c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelAdded Audio: userID=" + this.f15194a);
                    MoMoRtcPushFilter.this.f15124a1.mo20117a((long) this.f15194a, null, 176, 176);
                }
            }
        }

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f15196a;

            public c(int i) {
                this.f15196a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14989J = MomoCodec.MomoCodecState.WAIT;
                boolean z = MoMoRtcPushFilter.this.f15156p1.f164227h1;
                C4242c c4242c = C4242c.this;
                if (z) {
                    MoMoRtcPushFilter.this.f15138h1.mo165950g(4353, this.f15196a, 0, MoMoRtcPushFilter.this);
                } else if (MoMoRtcPushFilter.this.f15138h1 != null) {
                    MoMoRtcPushFilter.this.f15138h1.mo165950g(4352, this.f15196a, 0, MoMoRtcPushFilter.this);
                    C4242c c4242c2 = C4242c.this;
                    c4242c2.onUserOffline(MoMoRtcPushFilter.this.f15156p1.f180157B0, 1);
                }
                if (MoMoRtcPushFilter.this.f15114W1 != null) {
                    MoMoRtcPushFilter.this.f15114W1.onError(this.f15196a);
                }
            }
        }

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$d */
        public class d extends TimerTask {
            public d() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(MoMoRtcPushFilter.this.f15055D1) || MoMoRtcPushFilter.this.f15106U == null) {
                    return;
                }
                MoMoRtcPushFilter.this.f15106U.setSei(MoMoRtcPushFilter.this.m20960P5());
            }
        }

        public C4242c() {
        }

        /* JADX INFO: renamed from: a */
        private void m21061a(IMMRtcEngineEventInterface.LocalVideoStats localVideoStats) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onLocalVideoStatsstats:" + localVideoStats);
            MoMoRtcPushFilter.this.f15096R0 = localVideoStats;
            if (MoMoRtcPushFilter.this.f15107U0 = false) {
                MoMoRtcPushFilter.this.f15107U0 = true;
                MoMoRtcPushFilter.this.f15110V0 = false;
                MoMoRtcPushFilter.this.f15138h1.mo165950g(4099, 0, 0, MoMoRtcPushFilter.this);
                MoMoRtcPushFilter.m20803K3(MoMoRtcPushFilter.this);
            }
            if (MoMoRtcPushFilter.this.f15123Z1 != null) {
                MoMoRtcPushFilter.this.f15137g2.f115838a = MoMoRtcPushFilter.this.f15096R0.sentBitrate;
                MoMoRtcPushFilter.this.f15137g2.f115839b = MoMoRtcPushFilter.this.f15096R0.sentFrameRate;
                MoMoRtcPushFilter.this.f15123Z1.mo20120b(MoMoRtcPushFilter.this.f15137g2);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m21062b(IMMRtcEngineEventInterface.RemoteVideoStats remoteVideoStats) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", " onRemoteVideoStatsstats:" + remoteVideoStats + "w " + remoteVideoStats.width + " h " + remoteVideoStats.height + " bits " + remoteVideoStats.receivedBitrate + " fps " + remoteVideoStats.receivedFrameRate);
            MoMoRtcPushFilter.this.f15093Q0 = remoteVideoStats;
            if (MoMoRtcPushFilter.this.f15123Z1 != null) {
                MoMoRtcPushFilter.this.f15139h2.f175656b = MoMoRtcPushFilter.this.f15093Q0.delay;
                MoMoRtcPushFilter.this.f15139h2.f175658d = MoMoRtcPushFilter.this.f15093Q0.height;
                MoMoRtcPushFilter.this.f15139h2.f175656b = MoMoRtcPushFilter.this.f15093Q0.delay;
                MoMoRtcPushFilter.this.f15139h2.f175659e = MoMoRtcPushFilter.this.f15093Q0.receivedBitrate;
                MoMoRtcPushFilter.this.f15139h2.f175660f = MoMoRtcPushFilter.this.f15093Q0.receivedFrameRate;
                MoMoRtcPushFilter.this.f15139h2.f175661g = MoMoRtcPushFilter.this.f15093Q0.rxStreamType;
                MoMoRtcPushFilter.this.f15139h2.f175655a = MoMoRtcPushFilter.this.f15093Q0.uid;
                MoMoRtcPushFilter.this.f15139h2.f175657c = MoMoRtcPushFilter.this.f15093Q0.width;
                MoMoRtcPushFilter.this.f15123Z1.mo20119a(MoMoRtcPushFilter.this.f15139h2);
            }
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void didOnKickedOut(String str, int i, int i2, int i3) {
            if (MoMoRtcPushFilter.this.f15175y2 != null) {
                MoMoRtcPushFilter.this.f15175y2.m150595j(str, i2);
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
            MoMoRtcPushFilter.m20802K2(MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioMixingError() {
            MoMoRtcPushFilter.m20802K2(MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioMixingFinished() {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onAudioMixingFinished");
            MoMoRtcPushFilter.this.f15053C1 = false;
            MoMoRtcPushFilter.this.m20797I6(null, 2, 0);
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onAudioMixingFinished();
            }
            MoMoRtcPushFilter.m20802K2(MoMoRtcPushFilter.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioQuality(int i, int i2, short s, short s2) {
            iny inyVar = (iny) MoMoRtcPushFilter.this.f15100S0.get(Long.valueOf(i));
            if (inyVar != null) {
                inyVar.m141183j(s, s2);
            }
            if (MoMoRtcPushFilter.this.f15125a2 != null) {
                MoMoRtcPushFilter.this.f15125a2.onAudioQuality(i, i2, s, s2);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioRouteChanged(int i) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            int length;
            if (MoMoRtcPushFilter.this.f15115X && (length = audioVolumeInfoArr.length) > 0) {
                MoMoRtcPushFilter.this.f15105T1 = audioVolumeInfoArr;
                if (MoMoRtcPushFilter.this.f15111V1 != null) {
                    AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[length];
                    int i2 = -1;
                    for (int i3 = 0; i3 < length; i3++) {
                        AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                        if (MoMoRtcPushFilter.this.f15105T1[i3].uid == 0) {
                            i2 = i3;
                        }
                        audioVolumeWeight.uid = (int) MoMoRtcPushFilter.this.f15105T1[i3].uid;
                        audioVolumeWeight.volume = (MoMoRtcPushFilter.this.f15105T1[i3].volume * 1.0f) / 10.0f;
                        audioVolumeWeightArr[i3] = audioVolumeWeight;
                    }
                    MoMoRtcPushFilter.this.f15111V1.onAudioVolumeIndication(audioVolumeWeightArr, i);
                    if (i2 > 0) {
                        AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                        audioVolumeWeight2.uid = MoMoRtcPushFilter.this.f15156p1.f180157B0;
                        if (MoMoRtcPushFilter.this.f15068H2) {
                            audioVolumeWeight2.volume = 0.0f;
                        } else {
                            audioVolumeWeight2.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 10.0f;
                        }
                        MoMoRtcPushFilter.this.f15111V1.onAudioVolumeIndication(new AudioVolumeWeight[]{audioVolumeWeight2}, i);
                    }
                }
                if (MoMoRtcPushFilter.this.f15108U1 != null) {
                    AudioVolumeWeight[] audioVolumeWeightArr2 = new AudioVolumeWeight[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        AudioVolumeWeight audioVolumeWeight3 = new AudioVolumeWeight();
                        long j = MoMoRtcPushFilter.this.f15105T1[i4].uid;
                        MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                        if (j == 0) {
                            moMoRtcPushFilter.f15105T1[i4].uid = MoMoRtcPushFilter.this.f15156p1.f180157B0;
                            if (MoMoRtcPushFilter.this.f15068H2) {
                                audioVolumeWeight3.volume = 0.0f;
                            } else {
                                audioVolumeWeight3.volume = (MoMoRtcPushFilter.this.f15105T1[i4].volume * 1.0f) / 10.0f;
                            }
                            audioVolumeWeight3.uid = (int) MoMoRtcPushFilter.this.f15105T1[i4].uid;
                        } else {
                            audioVolumeWeight3.uid = (int) moMoRtcPushFilter.f15105T1[i4].uid;
                            audioVolumeWeight3.volume = (MoMoRtcPushFilter.this.f15105T1[i4].volume * 1.0f) / 10.0f;
                        }
                        audioVolumeWeightArr2[i4] = audioVolumeWeight3;
                    }
                    MoMoRtcPushFilter.this.f15108U1.onAudioVolumeIndication(audioVolumeWeightArr2, i);
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
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122843l("onClientRoleChanged", Integer.valueOf(i), Integer.valueOf(i2));
            if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191053b) {
                int i3 = MoMoRtcPushFilter.this.f15164t1;
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                if (i3 == 1) {
                    moMoRtcPushFilter.mo20738h2();
                } else {
                    moMoRtcPushFilter.mo20736f2();
                }
            }
            if (MoMoRtcPushFilter.this.f15131d2 != null) {
                MoMoRtcPushFilter.this.f15131d2.onClientRoleChanged(i, i2);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onConnectionBanned() {
            Log.e("unint", "onConnectionBanned");
            if (MoMoRtcPushFilter.this.f15129c2 != null) {
                MoMoRtcPushFilter.this.f15129c2.onReconnectTimeout();
            }
            MoMoRtcPushFilter.this.f15138h1.mo165950g(4353, 10, 0, MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onConnectionInterrupted() {
            Log.e("unint", "onConnectionInterrupted");
            MoMoRtcPushFilter.m20836Z3(MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onConnectionLost() {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122843l("onConnectionLost");
            Log.e("unint", "onConnectionLost=");
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onConnectionLost();
            }
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191117y0 = 10L;
            MoMoRtcPushFilter.this.m20735e2(4353, 10);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onError(int i) {
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            if (i == 503) {
                ((MediaBaseCodecFilter) moMoRtcPushFilter).f14988I.m122843l("onDNSError", Integer.valueOf(i));
            } else {
                ((MediaBaseCodecFilter) moMoRtcPushFilter).f14988I.m122843l("onError", Integer.valueOf(i));
            }
            Log.e("unint", "onError=" + i);
            if (i == 0) {
                return;
            }
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onError(i);
            }
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onError,err:" + i);
            Log.e("->MOMORTC", "onError, err: " + i);
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191117y0 = (long) i;
            MoMoRtcPushFilter.this.f15062F2.post(new c(i));
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onFirstLocalAudioFrame(int i) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onFirstLocalVideoFrame(int i, int i2, int i3) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onFirstLocalVideoFrame:width:" + i + ",height:" + i2 + ",elapsed:" + i3);
            oq70.m168791d().m168795c("MediaEngineCallback", "onFirstLocalVideoFrame  " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i3);
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
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122843l("onFirstRemoteVideoFrame", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onFirstRemoteVideoDecoded:uid" + i + "width" + i2 + "height" + i3 + "elapsed" + i4);
            if (MoMoRtcPushFilter.this.m20725W1() == null) {
                return;
            }
            MoMoRtcPushFilter.this.f15062F2.postAtFrontOfQueue(new a(i, i2, i3));
            long j = i;
            xhy xhyVar = (xhy) MoMoRtcPushFilter.this.f15104T0.get(Long.valueOf(j));
            if (xhyVar != null && !xhyVar.m211085d()) {
                t9c.m189743a("zhengjijian", "agora get first idr");
                xhyVar.m211088g(true);
                if (MoMoRtcPushFilter.this.f15164t1 == 1) {
                    ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122836c(true, xhyVar.m211084c(), j, 0L, 0L, 0L);
                }
                MoMoRtcPushFilter.this.f15138h1.mo165950g(8198, i, 0, MoMoRtcPushFilter.this);
            }
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onFirstRemoteVideoDecoded(j, i2, i3, i4);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onHttpError(int i, String str) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122843l("onHttpError", Integer.valueOf(i), str);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onJoinChannelSuccess(String str, int i, int i2) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122843l("onJoinChannelSuccess", str, Integer.valueOf(i), Integer.valueOf(i2));
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
            sb.append(MoMoRtcPushFilter.this.f15106U.getSabineEnable());
            Log.e("unint", sb.toString());
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191053b = true;
            MoMoRtcPushFilter.this.m20743l2(MediaBaseCodecFilter.CodecFilterState.FILTER_PLAY);
            if (MoMoRtcPushFilter.this.f15106U != null) {
                MoMoRtcPushFilter.this.f15115X = true;
                if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191104s != 0) {
                    MoMoRtcPushFilter.this.f15106U.setRoomMode((int) ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191104s);
                }
            }
            if (MoMoRtcPushFilter.this.f15055D1 != null && MoMoRtcPushFilter.this.f15156p1.f164227h1) {
                Log.e("MoMoRtcPushFilter", "zhangjialiang onJoinChannelSuccess setJsonForPostion");
                MoMoRtcPushFilter.this.f15176z1 = false;
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                moMoRtcPushFilter.m21052w6(moMoRtcPushFilter.f15055D1);
            }
            csx.m112235R().m112244C1(MoMoRtcPushFilter.this.f15106U.getSabineEnable() == 1 ? 0 : 1);
            MoMoRtcPushFilter.this.m21056y6(1.0f);
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14989J = MomoCodec.MomoCodecState.START;
            MoMoRtcPushFilter.this.mo20731c2();
            MoMoRtcPushFilter.this.m20730b2();
            MoMoRtcPushFilter.this.f15138h1.mo165950g(4096, 0, 0, MoMoRtcPushFilter.this);
            MoMoRtcPushFilter.this.f15138h1.mo165950g(CommandMessage.COMMAND_GET_PUSH_STATUS, 0, 0, MoMoRtcPushFilter.this);
            if ((MoMoRtcPushFilter.this.f15174y1 || MoMoRtcPushFilter.this.f15172x1) && MoMoRtcPushFilter.this.f15067H1 != 0) {
                MoMoRtcPushFilter.this.m20810N5();
            }
            if (MoMoRtcPushFilter.this.f15154o2 && MoMoRtcPushFilter.this.f15106U != null) {
                MoMoRtcPushFilter.this.f15106U.startChannelMediaRelay(MoMoRtcPushFilter.this.f15159q2, MoMoRtcPushFilter.this.f15157p2);
                MoMoRtcPushFilter.this.f15154o2 = false;
            }
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onJoinChannelSuccess(str, j, i2);
            }
            int i3 = MoMoRtcPushFilter.this.f15156p1.f175490k;
            MoMoRtcPushFilter moMoRtcPushFilter2 = MoMoRtcPushFilter.this;
            if (i3 > 0) {
                moMoRtcPushFilter2.m20849d5(moMoRtcPushFilter2.f15156p1.f164227h1, MoMoRtcPushFilter.this.f15156p1.f175490k, MoMoRtcPushFilter.this.f15156p1.f175492l, MoMoRtcPushFilter.this.f15070I1, 15, MoMoRtcPushFilter.this.f15156p1.f180187v0);
            } else {
                moMoRtcPushFilter2.m20849d5(moMoRtcPushFilter2.f15156p1.f164227h1, MoMoRtcPushFilter.this.f15156p1.f175506s, MoMoRtcPushFilter.this.f15156p1.f175508t, MoMoRtcPushFilter.this.f15070I1, 15, MoMoRtcPushFilter.this.f15156p1.f180187v0);
            }
            MoMoRtcPushFilter.this.m20854f6();
            MoMoRtcPushFilter moMoRtcPushFilter3 = MoMoRtcPushFilter.this;
            if (moMoRtcPushFilter3.f15056D2 == null) {
                moMoRtcPushFilter3.f15056D2 = new Timer();
                MoMoRtcPushFilter.this.f15056D2.schedule(new d(), 100L, 1000L);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onLastmileQuality(int i) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onLastmileQuality " + i);
            MoMoRtcPushFilter.this.f15138h1.mo165950g(4101, i, 0, MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onLeaveChannel(MMRtcStats mMRtcStats) {
            Log.e("unint", "onLeaveChannel");
            oq70.m168791d().m168795c("MoMoRtcPushFilter", getClass().getSimpleName() + " onLeaveChannelstats:" + mMRtcStats);
            MoMoRtcPushFilter.this.f15115X = false;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14989J = MomoCodec.MomoCodecState.STOP;
            if (mMRtcStats != null) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191000B = mMRtcStats.txBytes;
                t9c.m189743a("AgoraJzheng", "" + mMRtcStats.txBytes + "/" + mMRtcStats.txBytes);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onLocalVideoQualityLimited(IMMRtcEngineEventInterface.LocalVideoStats localVideoStats, IMMRtcEngineEventInterface.QualityLimitationReason qualityLimitationReason) {
            int i = localVideoStats.targetBitrate * 1000;
            int i2 = localVideoStats.targetFrameRate;
            if (i == 0 || i2 == 0 || (MoMoRtcPushFilter.this.f15074J2 == i && MoMoRtcPushFilter.this.f15077K2 == i2)) {
                t9c.m189743a("DYNAMIC_SCALING", "xxxxxxxxx from [ " + MoMoRtcPushFilter.this.f15074J2 + ", " + ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f15000s.f180160E0 + " ] To [ " + i + ", " + localVideoStats.targetFrameRate + ",[[sentBitrate " + localVideoStats.sentBitrate + ", " + localVideoStats.sentFrameRate + Constants.AES_SUFFIX);
                return;
            }
            if (MoMoRtcPushFilter.this.f15071I2 != null) {
                MoMoRtcPushFilter.this.f15071I2.onPushLevelChange(i, i2);
            }
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            moMoRtcPushFilter.f15074J2 = ((MediaBaseCodecFilter) moMoRtcPushFilter).f15000s.f175451H;
            MoMoRtcPushFilter moMoRtcPushFilter2 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter2.f15077K2 = ((MediaBaseCodecFilter) moMoRtcPushFilter2).f15000s.f180160E0;
            t9c.m189743a("DYNAMIC_SCALING", "from [ " + MoMoRtcPushFilter.this.f15074J2 + ", " + ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f15000s.f180160E0 + " ] To [ " + i + ", " + localVideoStats.targetFrameRate + Constants.AES_SUFFIX);
            if (MoMoRtcPushFilter.this.f15074J2 > i || MoMoRtcPushFilter.this.f15077K2 > i2) {
                MoMoRtcPushFilter.this.m20828V5(1);
            } else {
                MoMoRtcPushFilter.this.m20828V5(0);
            }
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f15000s.f175451H = i;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f15000s.f180160E0 = i2;
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onLog(int i, String str) {
            if (i == 1) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122845n(str);
                return;
            }
            if (i == 2) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122846o(str);
                return;
            }
            if (i == 3) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122847p(str);
                return;
            }
            if (i == 4) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122844m(str);
                return;
            }
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            if (i == 5) {
                ((MediaBaseCodecFilter) moMoRtcPushFilter).f14988I.m122848q(str);
            } else {
                moMoRtcPushFilter.m20837Z6(i, str);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onMediaEngineLoadSuccess() {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onMediaEngineLoadSuccess");
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onMediaEngineStartCallSuccess() {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onMicrophoneEnabled(boolean z) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onNetworkQuality(int i, int i2, int i3) {
            if (MoMoRtcPushFilter.this.f15125a2 != null) {
                MoMoRtcPushFilter.this.f15125a2.onNetworkQuality(i, i2, i3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onReceiveSEI(int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("bType")) {
                    int iOptInt = jSONObject.optInt("bType");
                    ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191104s = iOptInt;
                    esx.m122399d("MoMoRtcPushFilter", "onReceiveSEI getbType: " + iOptInt);
                }
                if (jSONObject.has(com.tencent.connect.common.Constants.f58037TS)) {
                    long jM112304X = csx.m112235R().m112304X() - Long.valueOf(jSONObject.optString(com.tencent.connect.common.Constants.f58037TS)).longValue();
                    iny inyVar = (iny) MoMoRtcPushFilter.this.f15100S0.get(Long.valueOf(i));
                    if (inyVar != null) {
                        inyVar.f116016E++;
                        inyVar.f116015D = (int) (((long) inyVar.f116015D) + jM112304X);
                    }
                }
            } catch (JSONException | Exception unused) {
            }
            if (MoMoRtcPushFilter.this.f15127b2 == null || MoMoRtcPushFilter.this.f15156p1 == null) {
                return;
            }
            MoMoRtcPushFilter.this.f15127b2.OnReceiveH264Sei(str.getBytes(), i, "");
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onRefreshRecordingServiceStatus(int i) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onRejoinChannelSuccess(String str, int i, int i2) {
            oq70.m168791d().m168795c("MyEngineEventHandler", "onRejoinChannelSuccess " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
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
            if (MoMoRtcPushFilter.this.f15117X1 != null) {
                MoMoRtcPushFilter.this.f15117X1.onRequestChannelKey();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onRtcStats(MMRtcStats mMRtcStats) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onRtcStatsstats:" + mMRtcStats);
            if (MoMoRtcPushFilter.this.f15093Q0 == null) {
                MoMoRtcPushFilter.this.f15093Q0 = new IMMRtcEngineEventInterface.RemoteVideoStats();
            }
            long j = 0;
            long j2 = 0;
            boolean z = false;
            boolean z2 = true;
            for (MMRtcRemoteStats mMRtcRemoteStats : mMRtcStats.remoteStats) {
                t9c.m189743a("AgoraJzheng", "onRtcStats " + mMRtcRemoteStats.uid);
                iny inyVar = (iny) MoMoRtcPushFilter.this.f15100S0.get(Long.valueOf(mMRtcRemoteStats.uid));
                MMRtcRemoteAudioStats mMRtcRemoteAudioStats = mMRtcRemoteStats.AudioStats;
                if (mMRtcRemoteAudioStats != null && inyVar != null) {
                    inyVar.f116032j += mMRtcRemoteAudioStats.audioCache;
                    inyVar.f116033k = mMRtcRemoteAudioStats.audioLost;
                    int i = mMRtcRemoteAudioStats.audioPlayLag;
                    inyVar.f116036n = i;
                    long j3 = mMRtcRemoteAudioStats.aReceiveSize;
                    inyVar.f116028f = j3;
                    inyVar.f116042t = mMRtcRemoteAudioStats.expandCount;
                    inyVar.f116043u = mMRtcRemoteAudioStats.expandCartonCount;
                    j2 += j3;
                    if (i == 0) {
                        z2 = false;
                    }
                    inyVar.f116048z += mMRtcRemoteAudioStats.audiLossTimestamp;
                    inyVar.f116012A += mMRtcRemoteAudioStats.networkRtt;
                    inyVar.f116013B++;
                    z = true;
                }
                MMRtcRemoteVideoStats mMRtcRemoteVideoStats = mMRtcRemoteStats.videoStats;
                if (mMRtcRemoteVideoStats != null && inyVar != null) {
                    inyVar.f116024b = mMRtcRemoteVideoStats.videoBitrate;
                    inyVar.f116031i = mMRtcRemoteVideoStats.videoheight;
                    inyVar.f116030h = mMRtcRemoteVideoStats.videowidth;
                    inyVar.f116034l = mMRtcRemoteVideoStats.videoDelay;
                    inyVar.f116035m = (int) mMRtcRemoteVideoStats.videoLost;
                    long j4 = mMRtcRemoteVideoStats.vReceiveSize;
                    inyVar.f116027e = j4;
                    inyVar.f116025c += (long) mMRtcRemoteVideoStats.videoFramerate;
                    j += j4;
                    inyVar.f116014C++;
                }
                if (inyVar != null) {
                    inyVar.f116026d = inyVar.f116027e + inyVar.f116028f;
                }
                j2 = j2;
            }
            if (z && z2) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191098q++;
            }
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191083l = j2;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191080k = j;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191077j = j2 + j;
            m21062b(MoMoRtcPushFilter.this.f15093Q0);
            if (MoMoRtcPushFilter.this.f15096R0 == null) {
                MoMoRtcPushFilter.this.f15096R0 = new IMMRtcEngineEventInterface.LocalVideoStats();
            }
            MoMoRtcPushFilter.this.f15096R0.sentFrameRate = mMRtcStats.videoStats.videoFramerate;
            MoMoRtcPushFilter.this.f15096R0.sentBitrate = mMRtcStats.videoStats.videoBitrate;
            m21061a(MoMoRtcPushFilter.this.f15096R0);
            MoMoRtcPushFilter.this.f15090P0 = mMRtcStats;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191012H = MoMoRtcPushFilter.this.f15090P0.videoStats.vEncodeCount;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191000B = MoMoRtcPushFilter.this.f15090P0.txBytes;
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            moMoRtcPushFilter.f15072J0 = moMoRtcPushFilter.f15090P0.videoStats.vEncodeSize;
            MoMoRtcPushFilter moMoRtcPushFilter2 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter2.f15081M0 = moMoRtcPushFilter2.f15090P0.audioStats.aEncodeSize;
            MoMoRtcPushFilter moMoRtcPushFilter3 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter3.f15084N0 = moMoRtcPushFilter3.f15090P0.audioStats.aSendSize;
            MoMoRtcPushFilter moMoRtcPushFilter4 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter4.f15087O0 = moMoRtcPushFilter4.f15090P0.videoStats.vSendSize;
            MoMoRtcPushFilter.this.f15138h1.mo165950g(4098, 0, 0, MoMoRtcPushFilter.this);
            MoMoRtcPushFilter.m20836Z3(MoMoRtcPushFilter.this);
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamInjectedStatus(String str, int i, int i2) {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamMessage(int i, int i2, String str) {
            if (MoMoRtcPushFilter.this.f15117X1 != null) {
                MoMoRtcPushFilter.this.f15117X1.onStreamMessage(i, i2, str.getBytes());
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
            if (MoMoRtcPushFilter.this.f15117X1 != null) {
                MoMoRtcPushFilter.this.f15117X1.onStreamMessageError(i, i2, i3, i4, i5);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamPublished(String str, int i) {
            synchronized (MoMoRtcPushFilter.this.f15049A1) {
                if (i == 0) {
                    try {
                        MoMoRtcPushFilter.this.f15176z1 = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onStreamUnpublished(String str) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onStreamPublished finish:url=" + str);
            synchronized (MoMoRtcPushFilter.this.f15049A1) {
                MoMoRtcPushFilter.this.f15176z1 = false;
            }
            synchronized (MoMoRtcPushFilter.this.f15166u1) {
                try {
                    if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191051a0 != null && !MoMoRtcPushFilter.this.f15080L2 && !MoMoRtcPushFilter.this.f15059E2) {
                        ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122820B(((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191051a0, ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191114x);
                        MoMoRtcPushFilter.this.f15106U.addPublishStreamUrl(((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191051a0, true);
                        MoMoRtcPushFilter.this.f15138h1.mo165950g(CommandMessage.COMMAND_CLEAR_NOTIFICATION_TYPE, 0, 0, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onTokenPrivilegeWillExpire(String str) {
            if (MoMoRtcPushFilter.this.f15120Y1 != null) {
                MoMoRtcPushFilter.this.f15120Y1.onTokenPrivilegeWillExpire(str);
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
                if (moMoRtcPushFilter.m20729a2(moMoRtcPushFilter.m20725W1())) {
                    oq70.m168791d().m168793a("MoMoRtcPushFilter", "onMemberEnter:##### setSpeakerphoneOn(false)");
                    if (MoMoRtcPushFilter.this.f15106U != null) {
                        csx.m112235R().m112245D();
                    }
                } else {
                    oq70.m168791d().m168793a("MoMoRtcPushFilter", "onMemberEnter:##### setSpeakerphoneOn(true)");
                    if (MoMoRtcPushFilter.this.f15106U != null) {
                        csx.m112235R().m112245D();
                    }
                }
            } catch (Exception unused) {
            }
            long j = i;
            xhy xhyVar = new xhy(j, p7f.LATITUDE_SOUTH.equals(MoMoRtcPushFilter.this.mo21051w1()) ? 1 : 2);
            MoMoRtcPushFilter.this.f15104T0.put(Long.valueOf(j), xhyVar);
            if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14987H.f191058c1 == 1) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122838e(true, xhyVar.m211084c(), j, 0L, 0L);
            }
            oq70.m168791d().m168795c("MoMoRtcPushFilter", getClass().getSimpleName() + " onUserJoined:uid:" + i + ",elapsed:" + i2);
            if ((MoMoRtcPushFilter.this.f15174y1 || MoMoRtcPushFilter.this.f15172x1) && MoMoRtcPushFilter.this.f15156p1.f164228i1 != i) {
                xhyVar.m211087f(true);
                xhyVar.m211088g(true);
                if (MoMoRtcPushFilter.this.f15164t1 == 1) {
                    ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122836c(true, xhyVar.m211084c(), j, 0L, 0L, 0L);
                }
                MoMoRtcPushFilter.this.f15138h1.mo165950g(8198, i, 0, MoMoRtcPushFilter.this);
                MoMoRtcPushFilter.this.f15062F2.post(new b(i));
            }
            MoMoRtcPushFilter.this.f15100S0.put(Long.valueOf(j), new iny(j));
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onJoinChannelSuccess("", j, i2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onUserMuteAudio(int i, boolean z) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onUserMuteAudiouid:" + i + ",muted:" + z);
            iny inyVar = (iny) MoMoRtcPushFilter.this.f15100S0.get(Long.valueOf((long) i));
            if (inyVar != null) {
                inyVar.m141180g(z);
            }
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onUserMuteAudio(i, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onUserMuteVideo(int i, boolean z) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onUserMuteVideouid:" + i + ",muted:" + z);
            iny inyVar = (iny) MoMoRtcPushFilter.this.f15100S0.get(Long.valueOf((long) i));
            if (inyVar != null) {
                inyVar.m141181h(z);
            }
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onUserMuteVideo(i, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onUserOffline(int i, int i2) {
            Log.e("unint", "onUserOffline uid=" + i);
            long j = 0;
            if (MoMoRtcPushFilter.this.f15100S0 != null) {
                long j2 = i;
                if (MoMoRtcPushFilter.this.f15100S0.containsKey(Long.valueOf(j2))) {
                    iny inyVar = (iny) MoMoRtcPushFilter.this.f15100S0.get(Long.valueOf(j2));
                    j = inyVar != null ? inyVar.f116026d : 0L;
                    MoMoRtcPushFilter.this.f15100S0.remove(Long.valueOf(j2));
                }
            }
            long j3 = j;
            if (MoMoRtcPushFilter.this.f15104T0 != null) {
                long j4 = i;
                if (MoMoRtcPushFilter.this.f15104T0.containsKey(Long.valueOf(j4))) {
                    t9c.m189743a("zhengjijian", "onMemberExit userid " + i + " reason " + i2);
                    if (MoMoRtcPushFilter.this.f15164t1 == 1) {
                        ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122837d(true, ((xhy) MoMoRtcPushFilter.this.f15104T0.get(Long.valueOf(j4))).m211084c(), j4, i2);
                        ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).f14988I.m122839f(true, ((xhy) MoMoRtcPushFilter.this.f15104T0.get(Long.valueOf(j4))).m211084c(), j3, 0L, j4, i2);
                    }
                    MoMoRtcPushFilter.this.f15138h1.mo165950g(8199, i, 0, MoMoRtcPushFilter.this);
                }
            }
            if (MoMoRtcPushFilter.this.f15124a1 != null && (!MoMoRtcPushFilter.this.f15143j2 || MoMoRtcPushFilter.this.f15174y1 || MoMoRtcPushFilter.this.f15172x1)) {
                oq70.m168791d().m168795c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelRemove userID=" + i);
                MoMoRtcPushFilter.this.f15124a1.mo20118b((long) i, i2);
            }
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onUserOffline(i, i2);
            }
            if (MoMoRtcPushFilter.this.f15051B1 != null && (MoMoRtcPushFilter.this.f15051B1.containsKey(Integer.valueOf(i)) || i == MoMoRtcPushFilter.this.f15156p1.f180157B0)) {
                if (i != MoMoRtcPushFilter.this.f15156p1.f180157B0) {
                    MoMoRtcPushFilter.this.f15051B1.remove(Integer.valueOf(i));
                }
                boolean z = MoMoRtcPushFilter.this.f15143j2;
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                if (z) {
                    if (moMoRtcPushFilter.f15126b1 != null) {
                        oq70.m168791d().m168795c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelRemoveExt userID=" + i);
                        MoMoRtcPushFilter.this.f15126b1.mo109338b((long) i, i2);
                    }
                } else if (moMoRtcPushFilter.f15128c1 != null) {
                    MoMoRtcPushFilter.this.f15128c1.mo20124b(i, i2);
                }
            }
            synchronized (MoMoRtcPushFilter.this.f15054C2) {
                try {
                    SurfaceViewRenderer surfaceViewRenderer = (SurfaceViewRenderer) MoMoRtcPushFilter.this.f15054C2.remove(Integer.valueOf(i));
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
            if (MoMoRtcPushFilter.this.f15175y2 != null) {
                MoMoRtcPushFilter.this.f15175y2.m150596r(i, i2, i3);
            }
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onVideoStopped() {
        }

        @Override // com.momo.momortc.IMMRtcEngineEventInterface
        public void onWarning(int i) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "onWarning" + i);
            if (i == 701) {
                MoMoRtcPushFilter.this.m20797I6(null, -1, 0);
            }
            if (MoMoRtcPushFilter.this.f15114W1 != null) {
                MoMoRtcPushFilter.this.f15114W1.onWarning(i);
            }
        }

        @NonNull
        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$d */
    public class RunnableC4243d implements Runnable {
        public RunnableC4243d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MoMoRtcPushFilter.this.f15170w1 != null) {
                MoMoRtcPushFilter.this.f15170w1.release();
                MoMoRtcPushFilter.this.f15170w1 = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$e */
    public class RunnableC4244e implements Runnable {
        public RunnableC4244e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = MoMoRtcPushFilter.this.f15156p1.f164227h1;
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            if (z) {
                moMoRtcPushFilter.f15138h1.mo165950g(4353, 201, 0, MoMoRtcPushFilter.this);
                MoMoRtcPushFilter.this.m20735e2(4353, 201);
            } else {
                IMMRtcEngineEventInterface iMMRtcEngineEventInterface = moMoRtcPushFilter.f15097R1;
                if (iMMRtcEngineEventInterface != null) {
                    iMMRtcEngineEventInterface.onUserOffline(moMoRtcPushFilter.f15156p1.f180157B0, 201);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$f */
    public class C4245f extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f15201a;

        public C4245f(String str) {
            super(str);
            this.f15201a = false;
        }

        /* JADX INFO: renamed from: a */
        public void m21064a() {
            this.f15201a = true;
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f15201a) {
                try {
                    Thread.sleep(66L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (pwk.f154413f == null) {
                    pwk.f154413f = new byte[((MoMoRtcPushFilter.this.f15156p1.f175494m * MoMoRtcPushFilter.this.f15156p1.f175496n) * 3) / 2];
                }
                MoMoRtcPushFilter.this.mo20666o1(ByteBuffer.wrap(pwk.f154413f));
            }
        }
    }

    @RequiresApi(api = 15)
    public MoMoRtcPushFilter(Context context, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar) {
        super(context);
        this.f15099S = "MoMoRtcPushFilter";
        this.f15103T = true;
        this.f15109V = -1;
        this.f15115X = false;
        this.f15118Y = false;
        this.f15121Z = false;
        this.f15144k0 = 0;
        this.f15155p0 = 0;
        this.f15057E0 = false;
        this.f15060F0 = true;
        this.f15063G0 = null;
        this.f15072J0 = 0L;
        this.f15075K0 = 0;
        this.f15078L0 = 0;
        this.f15081M0 = 0L;
        this.f15084N0 = 0L;
        this.f15087O0 = 0L;
        this.f15100S0 = new PipelineConcurrentHashMap<>();
        this.f15104T0 = new PipelineConcurrentHashMap<>();
        this.f15107U0 = false;
        this.f15110V0 = true;
        this.f15113W0 = 0;
        this.f15116X0 = 0;
        this.f15119Y0 = 0;
        this.f15122Z0 = "1e6127d73cd4d405905aa6f2ad5e1a67";
        this.f15124a1 = null;
        this.f15126b1 = null;
        this.f15128c1 = null;
        this.f15130d1 = null;
        this.f15134f1 = false;
        this.f15136g1 = false;
        this.f15140i1 = 1.8f;
        this.f15142j1 = 1.0f;
        this.f15145k1 = 44100;
        this.f15147l1 = 0;
        this.f15149m1 = 0;
        this.f15151n1 = 0;
        this.f15153o1 = 0;
        this.f15158q1 = -1;
        this.f15162s1 = null;
        this.f15164t1 = 1;
        this.f15166u1 = new Object();
        this.f15168v1 = 0;
        this.f15172x1 = false;
        this.f15174y1 = false;
        this.f15176z1 = false;
        this.f15049A1 = new Object();
        this.f15051B1 = new PipelineConcurrentHashMap();
        this.f15053C1 = false;
        this.f15061F1 = null;
        this.f15067H1 = 0;
        this.f15070I1 = 750000;
        this.f15073J1 = "";
        this.f15076K1 = false;
        this.f15079L1 = false;
        this.f15082M1 = false;
        this.f15085N1 = 0.0f;
        this.f15088O1 = 0.0f;
        this.f15091P1 = 0.0f;
        this.f15094Q1 = 0.0f;
        this.f15101S1 = null;
        this.f15105T1 = null;
        this.f15127b2 = null;
        this.f15133e2 = new xpw();
        this.f15135f2 = new xpw();
        this.f15137g2 = new imw();
        this.f15139h2 = new tpw();
        this.f15143j2 = false;
        this.f15146k2 = false;
        this.f15148l2 = true;
        this.f15150m2 = false;
        this.f15152n2 = null;
        this.f15154o2 = false;
        this.f15161r2 = "";
        this.f15163s2 = 15;
        this.f15165t2 = 0L;
        this.f15167u2 = null;
        this.f15169v2 = null;
        this.f15171w2 = ByteBuffer.allocate(8192);
        this.f15173x2 = ByteBuffer.allocate(8192);
        this.f15050A2 = null;
        this.f15052B2 = null;
        this.f15054C2 = new ArrayMap();
        this.f15056D2 = null;
        this.f15059E2 = false;
        this.f15062F2 = new Handler(Looper.getMainLooper());
        this.f15065G2 = false;
        this.f15068H2 = false;
        this.f15074J2 = 0;
        this.f15077K2 = 0;
        this.f15080L2 = false;
        this.f15083M2 = false;
        this.f15086N2 = 0L;
        this.f15089O2 = false;
        this.f15092P2 = 0;
        this.f15095Q2 = false;
        this.f15098R2 = false;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.momo.piplineext.codec.MoMoRtcPushFilter.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent.getAction().equals("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                    if (intent.getIntExtra("state", 0) == 0) {
                        if (MoMoRtcPushFilter.this.f15106U == null || true != csx.m112235R().m112245D()) {
                            return;
                        }
                        MoMoRtcPushFilter.this.f15106U.setParameters("{\"che.audio.enable.ns\":true}");
                        return;
                    }
                    if (intent.getIntExtra("state", 0) == 1 && MoMoRtcPushFilter.this.f15106U != null && true == csx.m112235R().m112245D()) {
                        MoMoRtcPushFilter.this.f15106U.setParameters("{\"che.audio.enable.ns\":false}");
                    }
                }
            }
        };
        this.f15102S2 = broadcastReceiver;
        ContextUtils.initialize(context);
        this.f15066H0 = g510Var;
        this.f15156p1 = (ror) uowVar;
        this.f15107U0 = false;
        this.f15110V0 = true;
        this.f15138h1 = interfaceC19500a;
        m20869m5(uowVar);
        wvx wvxVar = this.f14987H;
        wvxVar.f191059d = 260L;
        wvxVar.f191064e1 = String.valueOf(hashCode());
        this.f14987H.f191067f1 = 1L;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        if (context != null) {
            jj5.m145018l(context, broadcastReceiver, intentFilter);
        }
        this.f14988I.m122843l("MoMoRtcPushFilter", this.f15106U);
    }

    /* JADX INFO: renamed from: B5 */
    private int m20773B5() {
        int i = 0;
        if (!this.f15174y1 && !this.f15065G2) {
            i = 1;
        }
        return i ^ 1;
    }

    /* JADX INFO: renamed from: C5 */
    private final void m20777C5(String str, int i, String str2, String str3) {
        if (this.f15106U != null) {
            this.f14987H.f191003C0 = m20874o5(this.f15144k0);
            int iM112388u0 = csx.m112235R().m112388u0();
            if (iM112388u0 == 0) {
                this.f15106U.setAudioProfile(0, 4);
            } else if (iM112388u0 == 1) {
                this.f15106U.setAudioProfile(4, 3);
            } else if (iM112388u0 == 2 || iM112388u0 == 3) {
                this.f15106U.setAudioProfile(5, 3);
            } else {
                MMRtcEngine mMRtcEngine = this.f15106U;
                if (iM112388u0 != 4) {
                    mMRtcEngine.setAudioProfile(0, 4);
                } else {
                    mMRtcEngine.setSteroAudioCapture(true);
                    this.f15106U.setAudioProfile(5, 3);
                }
            }
            if (!this.f15079L1) {
                csx.m112235R().m112391v0();
            }
            m21025l5(this.f15060F0);
            this.f15134f1 = false;
            this.f15106U.registerAudioFrameObserver(null);
            if (this.f15172x1 || this.f15143j2 || this.f15146k2 || this.f15132e1 != null) {
                this.f15106U.registerAudioFrameObserver(this);
                this.f15134f1 = true;
            }
            if (this.f15160r1) {
                m20781D5("1");
            }
            m20801J6();
            MMRtcEngine mMRtcEngine2 = this.f15106U;
            if (mMRtcEngine2 != null && this.f15148l2) {
                mMRtcEngine2.setDefaultAudioRoutetoSpeakerphone(true);
            }
            ror rorVar = this.f15156p1;
            int i2 = rorVar.f175490k;
            if (i2 > 0) {
                m20849d5(rorVar.f164227h1, i2, rorVar.f175492l, this.f15070I1, 15, rorVar.f180187v0);
            } else {
                m20849d5(rorVar.f164227h1, rorVar.f175506s, rorVar.f175508t, this.f15070I1, 15, rorVar.f180187v0);
            }
            Log.e("MoMoRtcPushFilter", "zhangjialiang joinChannel############# begin");
            this.f15106U.enableMiddleGroundSignal(this.f15082M1);
            Log.e("MoMoRtcPushFilter", "joinChannel#############" + this.f15106U.joinChannel(this.f15162s1, str, null, i, str2, str3, this.f15050A2, TextUtils.isEmpty(this.f15052B2) ? 0L : Long.parseLong(this.f15052B2)));
            this.f15160r1 = true;
            this.f15106U.setAudioLevel(iM112388u0);
            m21056y6(1.0f);
        }
    }

    /* JADX INFO: renamed from: D5 */
    private final void m20781D5(String str) {
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "leaveChannel >>>>>" + str);
        synchronized (this.f15166u1) {
            try {
                if (this.f15106U != null) {
                    String str2 = this.f15000s.f180187v0;
                    if (str2 != null && !TextUtils.isEmpty(str2)) {
                        this.f15106U.removePublishStreamUrl(this.f15000s.f180187v0);
                    }
                    Log.e("unint", "leaveChannel behin 2431");
                    this.f15106U.leaveChannel();
                    Log.e("unint", "leaveChannel end 2433");
                    this.f15106U.registerAudioFrameObserver(null);
                    this.f15134f1 = false;
                }
                this.f15160r1 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f15156p1.f164224e1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I6 */
    public void m20797I6(Object obj, int i, int i2) {
        gb1 gb1VarM21079C2;
        l6m l6mVar = this.f14990K;
        if (l6mVar == null || (gb1VarM21079C2 = ((ExtAudioWrapper) l6mVar).m21079C2()) == null) {
            return;
        }
        gb1VarM21079C2.mo19382a(obj, i, i2);
    }

    /* JADX INFO: renamed from: J6 */
    private void m20801J6() {
        if (this.f15156p1 == null) {
            return;
        }
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "setVideoProfileEx1 bitrate:" + this.f15156p1.f175494m + "<>" + this.f15156p1.f175496n + "<>" + this.f15156p1.f175451H + "<mergecanvasWidth>" + this.f15156p1.f175490k);
        m21025l5(this.f15060F0);
        if (this.f15174y1) {
            return;
        }
        this.f15106U.setParameters("{\"che.video.keyFrameInterval\":1}");
        ror rorVar = this.f15156p1;
        if (rorVar.f180161F0 && rorVar.m197027d() == 1) {
            MMRtcEngine mMRtcEngine = this.f15106U;
            ror rorVar2 = this.f15156p1;
            mMRtcEngine.setVideoProfile(rorVar2.f175496n, rorVar2.f175494m, this.f15163s2, rorVar2.f175451H);
        } else {
            MMRtcEngine mMRtcEngine2 = this.f15106U;
            ror rorVar3 = this.f15156p1;
            mMRtcEngine2.setVideoProfile(rorVar3.f175494m, rorVar3.f175496n, this.f15163s2, rorVar3.f175451H);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ nnw m20802K2(MoMoRtcPushFilter moMoRtcPushFilter) {
        moMoRtcPushFilter.getClass();
        return null;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ int m20803K3(MoMoRtcPushFilter moMoRtcPushFilter) {
        int i = moMoRtcPushFilter.f15113W0;
        moMoRtcPushFilter.f15113W0 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N5 */
    public void m20810N5() {
        if (this.f14987H.f191056c == 0) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "AGORA_PUBLISHING");
            this.f15138h1.mo165950g(4103, 0, 0, this);
            this.f14987H.f191056c = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: O5 */
    private void m20813O5(byte[] bArr, byte[] bArr2) {
        Handler handler;
        long j = this.f15156p1.f180157B0;
        if (this.f15130d1 == null || (handler = this.f15062F2) == null) {
            return;
        }
        handler.post(new RunnableC4240a(bArr, bArr2, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V5 */
    public void m20828V5(int i) {
        this.f15138h1.mo165950g(8197, i, 0, this);
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ ypw m20836Z3(MoMoRtcPushFilter moMoRtcPushFilter) {
        moMoRtcPushFilter.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z6 */
    public void m20837Z6(int i, String str) {
        String str2;
        switch (i) {
            case 11:
                str2 = f15021U2;
                break;
            case 12:
                str2 = f15022V2;
                break;
            case 13:
                str2 = f15023W2;
                break;
            case 14:
                str2 = f15024X2;
                break;
            case 15:
                str2 = f15025Y2;
                break;
            case 16:
                str2 = f15026Z2;
                break;
            case 17:
                str2 = f15027a3;
                break;
            case 18:
                str2 = f15028b3;
                break;
            case 19:
                str2 = f15029c3;
                break;
            case 20:
                str2 = f15030d3;
                break;
            case 21:
                str2 = f15031e3;
                break;
            case 22:
                str2 = f15032f3;
                break;
            case 23:
                str2 = f15033g3;
                break;
            case 24:
                str2 = f15034h3;
                break;
            case 25:
                str2 = f15035i3;
                break;
            case 26:
                str2 = f15036j3;
                break;
            case 27:
                str2 = f15037k3;
                break;
            case 28:
                str2 = f15038l3;
                break;
            case 29:
                str2 = f15039m3;
                break;
            case 30:
                str2 = f15040n3;
                break;
            case 31:
                str2 = f15041o3;
                break;
            case 32:
                str2 = f15042p3;
                break;
            case 33:
                str2 = f15043q3;
                break;
            case 34:
                str2 = f15044r3;
                break;
            case 35:
                str2 = f15045s3;
                break;
            case 36:
                str2 = f15046t3;
                break;
            case 37:
                str2 = f15047u3;
                break;
            case 38:
                str2 = f15048v3;
                break;
            default:
                str2 = null;
                break;
        }
        if (str2 != null) {
            this.f14988I.m122849r(str2, str);
        }
    }

    /* JADX INFO: renamed from: a7 */
    private void m20840a7() {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setExternalVideoSource(true, this.f15103T, true);
        }
    }

    /* JADX INFO: renamed from: b5 */
    private final void m20843b5(int i, int i2) {
        ror rorVar = this.f15156p1;
        rorVar.f164224e1 = i;
        rorVar.f164225f1 = i2;
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
        m20840a7();
        if (this.f15106U != null) {
            this.f14988I.m122843l("configEngine", Integer.valueOf(i), Integer.valueOf(i2));
            this.f15106U.setClientRole(i);
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m20846c5(String str) {
        MMLiveTranscoding mMLiveTranscoding;
        try {
            if (this.f15106U == null || (mMLiveTranscoding = this.f15152n2) == null || mMLiveTranscoding.transcodingUserMap == null || !this.f15115X || str == null || TextUtils.isEmpty(str) || this.f15152n2.transcodingUserMap.size() <= 0) {
                return;
            }
            String string = "{canvas:{w:" + this.f15152n2.width + ",h:" + this.f15152n2.height + "conf:[";
            for (String str2 : this.f15152n2.transcodingUserMap.keySet()) {
                MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser = this.f15152n2.transcodingUserMap.get(str2);
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "llcqxl:<<<<<<<<<,uid:" + str2 + ",uid:" + mMLiveTranscodingUser.uid + ",x:" + mMLiveTranscodingUser.posx + ",y:" + mMLiveTranscodingUser.posy + ",width:" + mMLiveTranscodingUser.width + ",height:" + mMLiveTranscodingUser.height + ",alpha:" + mMLiveTranscodingUser.alpha + ",zOrder:" + mMLiveTranscodingUser.zOrder + ">>>>>>>>>>");
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
            MMLiveTranscoding mMLiveTranscoding2 = this.f15152n2;
            mMLiveTranscoding2.lowLatency = true;
            mMLiveTranscoding2.videoGop = 15;
            this.f15106U.setLiveTranscoding(mMLiveTranscoding2);
            m20813O5(str3.getBytes(), this.f15152n2.transcodingExtraInfo.getBytes());
            if (!this.f15161r2.equals(str)) {
                this.f15161r2 = str.substring(0);
                this.f15176z1 = false;
            }
            synchronized (this.f15049A1) {
                try {
                    if (!this.f15176z1 && !this.f15059E2) {
                        this.f15106U.addPublishStreamUrl(str, true);
                        this.f15176z1 = true;
                        Log.e("MoMoRtcPushFilter", "zhangjialiang onStreamPublished addPublishStreamUrl:url=" + str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "addPublishStreamUrl configLiveTransCoding");
        } catch (Exception e) {
            Log.e("MoMoRtcPushFilter", "zhangjialiang configLiveTransCoding :" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public void m20849d5(boolean z, int i, int i2, int i3, int i4, String str) {
        if (str == null) {
            str = "";
        }
        if (z) {
            if (this.f15152n2 == null) {
                this.f15152n2 = new MMLiveTranscoding();
            }
            int iM112379r0 = csx.m112235R().m112379r0();
            MMLiveTranscoding mMLiveTranscoding = this.f15152n2;
            mMLiveTranscoding.width = i;
            mMLiveTranscoding.height = i2;
            mMLiveTranscoding.audioBitrate = iM112379r0 == 0 ? 128000 : iM112379r0 * 1000;
            mMLiveTranscoding.audioChannels = 2;
            mMLiveTranscoding.audioSampleRate = MMLiveTranscoding.MMLiveAudioSampleRateType.MMLiveAudioSampleRateType44100;
            mMLiveTranscoding.videoBitrate = i3;
            mMLiveTranscoding.videoFramerate = i4;
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", Constants.KEY_CONFIG + this.f15152n2);
            m20846c5(str);
            this.f14988I.m122843l("tanscode_aBitrate", Integer.valueOf(iM112379r0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f6 */
    public void m20854f6() {
        for (int i = 0; i < 6; i++) {
            Matrix matrix = new Matrix();
            matrix.mapVectors(f15020T2);
            ror rorVar = this.f15156p1;
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(rorVar.f175494m, rorVar.f175496n, VideoFrame.TextureBuffer.Type.RGB, this.texture_in, matrix, null, null, null);
            MMRtcEngine mMRtcEngine = this.f15106U;
            if (mMRtcEngine != null) {
                if (this.f15112W != null && !this.f15065G2) {
                    mMRtcEngine.pushExternalVideoFrame(new VideoFrame(textureBufferImpl, 0, System.nanoTime()), null);
                }
                t9c.m189745c("MoMoRtcPushFilter", "zhangjialiang unint pushExternalVideoFrame");
            }
        }
    }

    /* JADX INFO: renamed from: m5 */
    private MMRtcEngine m20869m5(uow uowVar) {
        this.f15000s = uowVar;
        m21026l6(uowVar.f175459P);
        this.f15057E0 = uowVar.f175502q;
        if (this.f15106U == null) {
            this.f15097R1 = new C4242c();
            try {
                String str = this.f15122Z0;
                if (str == null || TextUtils.isEmpty(str)) {
                    this.f15106U = MMRtcEngine.create(m20725W1(), "1e6127d73cd4d405905aa6f2ad5e1a67", this.f15097R1);
                } else {
                    this.f15106U = MMRtcEngine.create(m20725W1(), this.f15122Z0, this.f15097R1);
                }
                t9c.m189747e("MoMoRtcPushFilter", "agora_sdk_ver: " + MMRtcEngine.getSdkVersion());
                this.f15106U.setParameters("{\"rtc.log_filter\":34781}");
                this.f15106U.setLogFile(this.f15073J1);
                this.f15106U.setLogFilter(15);
                this.f15134f1 = false;
                this.f15106U.registerAudioFrameObserver(null);
                this.f15106U.setRecordingAudioFrameParameters(this.f15145k1, 1, 2, 1024);
                this.f15106U.setPlaybackAudioFrameParameters(this.f15145k1, 1, 0, 1024);
                this.f15106U.setChannelProfile(1);
                this.f15106U.enableDualStreamMode(this.f15057E0);
                m21025l5(this.f15060F0);
            } catch (Exception unused) {
                throw new InvalidParameterException("RtcEngineEx.create error");
            }
        }
        uow uowVar2 = this.f15000s;
        if (uowVar2 != null && uowVar2.f175473b0) {
            this.f15103T = false;
        }
        return this.f15106U;
    }

    /* JADX INFO: renamed from: o5 */
    private int m20874o5(int i) {
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
            return this.f15156p1.f175462S;
        }
        return 192000;
    }

    /* JADX INFO: renamed from: p5 */
    private String m20877p5() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<Long, iny>> it = this.f15100S0.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iny value = it.next().getValue();
            if (i != 0) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(value.m141176b());
            i++;
            value.m141179e(value.m141175a(), value.m141178d());
        }
        if (i == 0) {
            sb.append("(0)");
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    private void release() {
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "MoMoRtcPushFilter release");
        this.f14988I.m122843l("release");
        this.f15080L2 = true;
        this.f15115X = false;
        synchronized (this.f15166u1) {
            try {
                this.f14987H.f191051a0 = null;
                if (this.f15106U != null) {
                    oq70.m168791d().m168795c("MoMoRtcPushFilter", "release >>>>>");
                    this.f15106U.registerAudioFrameObserver(null);
                    this.f15134f1 = false;
                    String str = this.f15000s.f180187v0;
                    if (str != null && !TextUtils.isEmpty(str)) {
                        this.f15106U.removePublishStreamUrl(this.f15000s.f180187v0);
                    }
                    Log.e("unint", "leaveChannel begin 2778");
                    this.f15106U.leaveChannel();
                    Log.e("unint", "leaveChannel end 2480");
                    MMRtcEngine.destroy();
                    this.f15106U = null;
                    this.f15130d1 = null;
                    this.f15115X = false;
                    m20743l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                    this.f14989J = MomoCodec.MomoCodecState.STOP;
                    mo20734d2();
                    this.f15138h1.mo165950g(4097, 0, 0, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        dc1 dc1Var = this.f15069I0;
        if (dc1Var != null) {
            dc1Var.m115188f();
            this.f15069I0 = null;
        }
        AudioResampleUtils audioResampleUtils = this.f15167u2;
        if (audioResampleUtils != null) {
            audioResampleUtils.release();
            this.f15167u2 = null;
        }
        AudioResampleUtils audioResampleUtils2 = this.f15169v2;
        if (audioResampleUtils2 != null) {
            audioResampleUtils2.release();
            this.f15169v2 = null;
        }
        this.f15097R1 = null;
        this.f15062F2.post(new RunnableC4243d());
    }

    /* JADX INFO: renamed from: s5 */
    private void m20887s5(int i) {
        if (i > this.f15171w2.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + this.f15171w2.position());
            byteBufferAllocate.clear();
            if (this.f15171w2.position() > 0) {
                byteBufferAllocate.put(this.f15171w2.array(), 0, this.f15171w2.position());
            }
            this.f15171w2.clear();
            this.f15171w2 = byteBufferAllocate;
        }
    }

    /* JADX INFO: renamed from: t5 */
    private void m20891t5(int i) {
        if (i > this.f15173x2.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + this.f15173x2.position());
            byteBufferAllocate.clear();
            if (this.f15173x2.position() > 0) {
                byteBufferAllocate.put(this.f15173x2.array(), 0, this.f15173x2.position());
            }
            this.f15173x2.clear();
            this.f15173x2 = byteBufferAllocate;
        }
    }

    /* JADX INFO: renamed from: v5 */
    private IMMRtcEngineEventInterface.LocalVideoStats m20898v5() {
        return this.f15096R0;
    }

    /* JADX INFO: renamed from: w5 */
    private IMMRtcEngineEventInterface.RemoteVideoStats m20902w5() {
        return this.f15093Q0;
    }

    /* JADX INFO: renamed from: x5 */
    private String m20906x5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(com.tencent.connect.common.Constants.f58037TS)) {
                jSONObject.remove(com.tencent.connect.common.Constants.f58037TS);
            }
            jSONObject.put(com.tencent.connect.common.Constants.f58037TS, m20727Y1());
            if (jSONObject.has("bType")) {
                jSONObject.remove("bType");
            }
            jSONObject.put("bType", this.f14987H.f191104s);
            if (jSONObject.has(BaseSei.CONF) && this.f15172x1) {
                jSONObject.remove(BaseSei.CONF);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo20645A() {
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: A0 */
    public int mo20913A0() {
        ror rorVar = this.f15156p1;
        return rorVar.f175490k > 0 ? rorVar.f175492l : rorVar.f175508t;
    }

    /* JADX INFO: renamed from: A5 */
    public long m20914A5() {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            return mMRtcEngine.getAudioMixingCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: A6 */
    public void m20915A6(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.f15064G1 = pcmdataavailablecallback;
        if (pcmdataavailablecallback != null) {
            m20993Y5(true);
        } else {
            m20993Y5(false);
        }
    }

    /* JADX INFO: renamed from: B6 */
    public void m20916B6(int i) {
        this.f14988I.m122843l("setRole", Integer.valueOf(i), Integer.valueOf(this.f15119Y0));
        this.f15164t1 = i;
        if (this.f15106U == null || this.f15119Y0 != 1) {
            return;
        }
        this.f15106U.setClientRole(this.f15164t1);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C0 */
    public void mo20646C0() {
        mo20661f();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: C1 */
    public void mo20647C1(String str) {
        t9c.m189745c("zk", "setMergeSei");
        synchronized (this.f15166u1) {
            try {
                this.f15058E1 = str;
                m21054x6(str);
                MMRtcEngine mMRtcEngine = this.f15106U;
                if (mMRtcEngine != null) {
                    mMRtcEngine.setSei(m20960P5());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C6 */
    public void m20917C6(int i, boolean z) {
        this.f15067H1 = i;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: D0 */
    public long mo20918D0() {
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: D1 */
    public String mo20919D1() {
        String str = this.f14987H.f191114x;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: D6 */
    public void m20920D6(int i) {
        this.f15158q1 = i;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: E0 */
    public void mo20921E0(wzl wzlVar) {
        this.f14985F = wzlVar;
    }

    /* JADX INFO: renamed from: E5 */
    public void m20922E5(boolean z) {
        if (this.f15106U != null) {
            this.f14988I.m122843l("muteAllRemoteAudioStream", Boolean.valueOf(z));
            this.f15106U.muteAllRemoteAudioStreams(z);
        }
    }

    /* JADX INFO: renamed from: E6 */
    public void m20923E6(kod0 kod0Var) {
        this.f15175y2 = kod0Var;
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: F */
    public boolean mo20924F() {
        return this.f15136g1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: F0 */
    public int mo20925F0() {
        return this.f15151n1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: F1 */
    public long mo20926F1() {
        MMRtcStats mMRtcStats = this.f15090P0;
        if (mMRtcStats != null) {
            return mMRtcStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F5 */
    public void m20927F5(boolean z) {
        if (this.f15106U != null) {
            this.f14988I.m122843l("muteAllRemoteVideoStream", Boolean.valueOf(z));
            this.f15106U.muteAllRemoteVideoStreams(z);
        }
    }

    /* JADX INFO: renamed from: F6 */
    public void m20928F6(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        float f2 = f * 1.0f;
        this.f15142j1 = f2;
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.adjustAudioMixingVolume(f2);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: G0 */
    public long mo20929G0() {
        return 0L;
    }

    /* JADX INFO: renamed from: G5 */
    public void m20930G5(boolean z) {
        this.f15068H2 = z;
        this.f14988I.m122843l("muteLocalAudioStream", Boolean.valueOf(this.f15156p1.f164227h1), Boolean.valueOf(z));
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            if (this.f15156p1.f164227h1) {
                mMRtcEngine.muteLocalAudioStream(z);
                return;
            }
            this.f14988I.m122843l("muteLocalAudioStream, isHost, mute:", Boolean.FALSE, Boolean.valueOf(z));
            MMRtcEngine mMRtcEngine2 = this.f15106U;
            if (z) {
                mMRtcEngine2.adjustRecordingSignalVolume(((int) this.f15140i1) * 100);
            } else {
                mMRtcEngine2.adjustRecordingSignalVolume(((int) this.f15140i1) * 100);
                this.f15106U.muteLocalAudioStream(false);
            }
        }
    }

    /* JADX INFO: renamed from: G6 */
    public void m20931G6(boolean z) {
        if (z) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "set Stream ReplaceMode");
        }
        this.f15146k2 = z;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo20649H0(boolean z) {
        this.f15172x1 = z;
    }

    /* JADX INFO: renamed from: H5 */
    public void m20932H5(boolean z) {
        this.f15068H2 = z;
        if (this.f15106U != null) {
            this.f14988I.m122843l("muteLocalAudioStream", Boolean.valueOf(z));
            this.f15106U.muteLocalAudioStream(z);
        }
    }

    /* JADX INFO: renamed from: H6 */
    public void m20933H6(int i) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setAudioMixingPosition(i);
        }
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: I1 */
    public void mo20934I1() {
        this.f15136g1 = true;
    }

    /* JADX INFO: renamed from: I5 */
    public void m20935I5(boolean z) {
        this.f15065G2 = z;
        if (this.f15106U != null) {
            this.f14988I.m122843l("muteLocalVideoStream", Boolean.valueOf(z));
            this.f15106U.muteLocalVideoStream(z);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: J */
    public void mo20650J(String str) {
        t9c.m189745c("zk", "setSei" + this.f15058E1);
        synchronized (this.f15166u1) {
            try {
                this.f15055D1 = str;
                if (TextUtils.isEmpty(this.f15058E1)) {
                    m21052w6(str);
                } else {
                    m21054x6(this.f15058E1);
                }
                MMRtcEngine mMRtcEngine = this.f15106U;
                if (mMRtcEngine != null) {
                    mMRtcEngine.setSei(m20960P5());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: J0 */
    public long mo20936J0() {
        return 0L;
    }

    /* JADX INFO: renamed from: J5 */
    public void m20937J5(long j, boolean z) {
        if (this.f15106U != null) {
            this.f14988I.m122843l("muteRemoteAudioStream", Long.valueOf(j), Boolean.valueOf(z));
            this.f15106U.muteRemoteAudioStream((int) j, z);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public void m20938K4(MRtcEventHandler mRtcEventHandler) {
        this.f15114W1 = mRtcEventHandler;
    }

    /* JADX INFO: renamed from: K5 */
    public void m20939K5(long j, boolean z) {
        if (this.f15106U != null) {
            this.f14988I.m122843l("muteRemoteMsgStream", Long.valueOf(j), Boolean.valueOf(z));
            this.f15106U.muteRemoteMsgStream((int) j, z);
        }
    }

    /* JADX INFO: renamed from: K6 */
    public void m20940K6(ebl0 ebl0Var) {
        this.f15124a1 = ebl0Var;
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: L */
    public void mo20941L(dpl.InterfaceC16599a interfaceC16599a) {
        this.f15132e1 = interfaceC16599a;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: L0 */
    public long mo20942L0() {
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: L1 */
    public long mo20943L1() {
        return 0L;
    }

    /* JADX INFO: renamed from: L5 */
    public void m20945L5(long j, boolean z) {
        if (this.f15106U != null) {
            this.f14988I.m122843l("muteRemoteVideoStream", Long.valueOf(j), Boolean.valueOf(z));
            this.f15106U.muteRemoteVideoStream((int) j, z);
        }
    }

    /* JADX INFO: renamed from: L6 */
    public void m20946L6(fbl0 fbl0Var) {
        this.f15126b1 = fbl0Var;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: M0 */
    public int mo20947M0() {
        return (int) this.f14987H.f191074i;
    }

    @Override // p153l.hej, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: M1 */
    public void mo20652M1() {
        TextureBufferImpl textureBufferImpl;
        MMRtcEngine mMRtcEngine;
        g510 g510Var = this.f15066H0;
        if (g510Var != null && this.f15112W != g510Var.m128993l()) {
            this.f15112W = this.f15066H0.m128993l();
        }
        EGLContext eGLContext = this.f15112W;
        if (eGLContext != null && (mMRtcEngine = this.f15106U) != null) {
            mMRtcEngine.updateSharedContext(eGLContext);
        }
        if (this.texture_in == 0 || !this.f15115X || this.f15065G2) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.mapVectors(f15020T2);
        ror rorVar = this.f15156p1;
        if (rorVar.f180161F0 && rorVar.m197027d() == 1) {
            ror rorVar2 = this.f15156p1;
            textureBufferImpl = new TextureBufferImpl(rorVar2.f175496n, rorVar2.f175494m, VideoFrame.TextureBuffer.Type.RGB, this.texture_in, matrix, null, null, null);
        } else {
            ror rorVar3 = this.f15156p1;
            textureBufferImpl = new TextureBufferImpl(rorVar3.f175494m, rorVar3.f175496n, VideoFrame.TextureBuffer.Type.RGB, this.texture_in, matrix, null, null, null);
        }
        synchronized (this.f15166u1) {
            try {
                if (this.f15106U != null && !this.f15080L2) {
                    if (this.f15112W != null) {
                        this.f15106U.pushExternalVideoFrame(new VideoFrame(textureBufferImpl, 0, System.nanoTime()), null);
                    }
                    t9c.m189745c("MoMoRtcPushFilter", "zhangjialiang pushExternalVideoFrame");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wvx wvxVar = this.f14987H;
        long j = wvxVar.f191006E + 1;
        wvxVar.f191006E = j;
        if (j >= 30 || this.f15172x1) {
            m20810N5();
            if (this.f15086N2 <= 0) {
                this.f15086N2 = System.currentTimeMillis();
            }
        }
        if (!this.f15083M2 && this.f14987H.f191006E >= 120) {
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "Agora 推流成功 AGORA_RTMP_PUBLISHED");
            this.f15083M2 = true;
            this.f15138h1.mo165950g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, this);
        }
        if (this.f15083M2 || this.f15086N2 <= 0 || System.currentTimeMillis() - this.f15086N2 <= Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            return;
        }
        this.f15083M2 = true;
        this.f15138h1.mo165950g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, this);
    }

    /* JADX INFO: renamed from: M4 */
    public void m20948M4(MRtcAudioHandler mRtcAudioHandler) {
        this.f15108U1 = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: M5 */
    public void m20949M5(boolean z) {
        t9c.m189745c("zk", "--ktv,muteSingerAudioStream:" + this.f15150m2 + "-->" + z);
        this.f15150m2 = z;
    }

    /* JADX INFO: renamed from: M6 */
    public void m20950M6(String str) {
        if (this.f15152n2 == null) {
            this.f15152n2 = new MMLiveTranscoding();
        }
        m20846c5(this.f15156p1.f180187v0);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: N0 */
    public long mo20951N0() {
        MMRtcStats mMRtcStats = this.f15090P0;
        if (mMRtcStats != null) {
            return mMRtcStats.txBytes;
        }
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: N1 */
    public int mo20952N1() {
        return this.f15075K0;
    }

    /* JADX INFO: renamed from: N4 */
    public void m20953N4(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f15111V1 = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: N6 */
    public void m20954N6(int i, int i2, int i3, int i4) {
        this.f15070I1 = i;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: O0 */
    public long mo20955O0() {
        return this.f15081M0;
    }

    /* JADX INFO: renamed from: O6 */
    public void m20957O6(gkl0 gkl0Var) {
        this.f15128c1 = gkl0Var;
    }

    @Override // p153l.o410.InterfaceC19026f
    /* JADX INFO: renamed from: P0 */
    public void mo20958P0(g510 g510Var, int i, int i2, int i3, int i4) {
        this.f15149m1 = i4;
        this.f15151n1 = i2;
        this.f15153o1 = i3;
    }

    /* JADX INFO: renamed from: P4 */
    public void m20959P4(MRtcChannelHandler mRtcChannelHandler) {
        this.f15117X1 = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: P5 */
    public byte[] m20960P5() {
        byte[] bytes = "".getBytes();
        String str = this.f15055D1;
        if (str != null) {
            return m20906x5(str).getBytes();
        }
        String str2 = this.f15058E1;
        return str2 != null ? str2.getBytes() : bytes;
    }

    /* JADX INFO: renamed from: P6 */
    public void m20961P6(boolean z) {
        if (z) {
            this.f15106U.registerAudioFrameObserver(null);
            this.f15106U.registerAudioFrameObserver(this);
            this.f15134f1 = true;
        } else {
            if (this.f15132e1 != null || this.f15098R2) {
                return;
            }
            this.f15106U.registerAudioFrameObserver(null);
            this.f15134f1 = false;
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: Q0 */
    public int mo20962Q0() {
        return this.f15115X ? m21041r5() : m21048u5();
    }

    /* JADX INFO: renamed from: Q4 */
    public void m20963Q4(MRtcConnectHandler mRtcConnectHandler) {
        this.f15129c2 = mRtcConnectHandler;
    }

    /* JADX INFO: renamed from: Q5 */
    public void m20964Q5() {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).pauseAllEffects();
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public void m20965Q6(int i, double d) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).setVolumeOfEffect(i, ((float) d) * 100.0f);
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo20654R0(uow uowVar, EGLContext eGLContext) {
        int i = this.f15164t1;
        wvx wvxVar = this.f14987H;
        if (i == 1) {
            wvxVar.f191001B0 = "M".equals(mo21051w1()) ? "MrtcMaster" : "MrtcSlaver";
        } else {
            wvxVar.f191001B0 = "MrtcAudience";
        }
        super.mo20654R0(uowVar, eGLContext);
        if (uowVar.f175473b0 && !this.f15065G2 && !this.f15174y1 && this.f15141i2 == null) {
            C4245f c4245f = new C4245f("live-media-aFFrame");
            this.f15141i2 = c4245f;
            c4245f.start();
        }
        int i2 = uowVar.f180160E0;
        this.f15163s2 = i2;
        if (i2 <= 0 || i2 > 30) {
            Log.e("unint", "error maxFps=" + this.f15163s2);
            this.f15163s2 = 30;
        }
        if (!(uowVar instanceof ror)) {
            throw new InvalidParameterException("Parameters error");
        }
        oq70 oq70VarM168791d = oq70.m168791d();
        StringBuilder sb = new StringBuilder("videoWidth:");
        sb.append(uowVar.f175506s);
        sb.append(",videoHeight:");
        sb.append(uowVar.f175508t);
        sb.append(",visualWidth:");
        sb.append(uowVar.f175510u);
        sb.append(",visualHeight:");
        sb.append(uowVar.f175511v);
        sb.append(",encodeWidth:");
        sb.append(uowVar.f175494m);
        sb.append(",encodeHeight:");
        sb.append(uowVar.f175496n);
        sb.append(",videoBitrate:");
        sb.append(uowVar.f175451H);
        sb.append(",audioBitrate:");
        sb.append(uowVar.f175462S);
        sb.append(",videoFPS:");
        sb.append(uowVar.f175449F);
        sb.append(",codecFPS:");
        sb.append(uowVar.f180160E0);
        sb.append(",mergeCanvasWidth:");
        ror rorVar = (ror) uowVar;
        sb.append(rorVar.f175490k);
        sb.append(",mergeCanvasHeight:");
        sb.append(rorVar.f175492l);
        sb.append(",codecFPS:");
        sb.append(uowVar.f180160E0);
        sb.append(",isHard:");
        sb.append(uowVar.f180156A0);
        oq70VarM168791d.m168795c("MoMoRtcPushFilter", sb.toString());
        this.f15156p1 = rorVar;
        if (this.f15119Y0 == 1) {
            return;
        }
        if (uowVar.f180156A0 == MomoPipeline.DecodeType.SOFT_DECODE || rorVar.f175473b0) {
            this.f15103T = false;
        }
        this.f15069I0 = new dc1();
        g510 g510Var = this.f15066H0;
        if (g510Var != null) {
            this.f15112W = g510Var.m128993l();
        }
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setRobustSignal(csx.m112235R().m112251F() == 1);
        }
        this.f15080L2 = false;
        this.f15176z1 = false;
        this.f15083M2 = false;
        if (1 == csx.m112235R().m112242C()) {
            m21015h6(true);
        }
        synchronized (this.f15166u1) {
            try {
                m20843b5(this.f15164t1, 33);
                MMRtcEngine mMRtcEngine2 = this.f15106U;
                if (mMRtcEngine2 != null) {
                    mMRtcEngine2.setExpandCartonParams(csx.m112235R().m112376q0(), csx.m112235R().m112272M());
                }
                arx.C15814d c15814dM99797h = arx.m99789d().m99797h(this.f15177z2.m106170b());
                String str = "";
                String str2 = "";
                if (c15814dM99797h != null) {
                    str = c15814dM99797h.f73008a;
                    str2 = c15814dM99797h.f73009b;
                }
                ror rorVar2 = this.f15156p1;
                m20777C5(rorVar2.f164226g1, rorVar2.f180157B0, str, str2);
                oq70.m168791d().m168795c("momortc", "setChannalName:" + this.f15156p1.f164226g1);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15119Y0 = 1;
        yt0.m217280g().m217295p(m20725W1(), yt0.f201475f);
        this.f14987H.f191061d1 = uowVar.m197027d();
        wvx wvxVar2 = this.f14987H;
        wvxVar2.f191055b1 = uowVar.f175473b0 ? 1L : 0L;
        wvxVar2.f191114x = uowVar.f180187v0;
        int i3 = uowVar.f175451H;
        this.f15074J2 = i3;
        this.f15077K2 = uowVar.f180160E0;
        ror rorVar3 = this.f15156p1;
        wvxVar2.f191042W = rorVar3.f180157B0;
        wvxVar2.f191044X = rorVar3.f164226g1;
        wvxVar2.f191009F0 = i3;
        if (this.f15106U != null) {
            wvxVar2.f191095p = MMRtcEngine.getSdkVersion();
        }
        this.f14987H.f191062e = System.currentTimeMillis();
        this.f14987H.f191065f = System.currentTimeMillis();
        this.f14987H.f191009F0 = uowVar.f175451H;
        this.f14988I.m122843l("startRecord", Integer.valueOf(this.f15164t1));
    }

    /* JADX INFO: renamed from: R4 */
    public void m20966R4(wpw wpwVar) {
        this.f15123Z1 = wpwVar;
    }

    /* JADX INFO: renamed from: R5 */
    public void m20967R5(int i) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).pauseEffect(i);
        }
    }

    /* JADX INFO: renamed from: R6 */
    public void m20968R6() {
        this.f15098R2 = true;
        if (this.f15134f1) {
            return;
        }
        this.f15106U.registerAudioFrameObserver(null);
        this.f15106U.registerAudioFrameObserver(this);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: S0 */
    public void mo20655S0(brx brxVar) {
        super.mo20655S0(brxVar);
        this.f15177z2 = brxVar;
    }

    /* JADX INFO: renamed from: S4 */
    public void m20969S4(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        this.f15131d2 = mRtcClientRoleChangedHandler;
    }

    /* JADX INFO: renamed from: S5 */
    public void m20970S5() {
        this.f14988I.m122843l("pauseRecording");
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "pauseRecording");
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.muteLocalAudioStream(true);
        }
        RunnableC4244e runnableC4244e = new RunnableC4244e();
        this.f15101S1 = runnableC4244e;
        this.f15062F2.postDelayed(runnableC4244e, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    /* JADX INFO: renamed from: S6 */
    public void m20971S6(String str) {
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "startSurroundMusic");
        if (this.f15053C1) {
            return;
        }
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.startAudioMixing(str, false, false, 1L);
            this.f15106U.adjustAudioMixingVolume(this.f15142j1);
            this.f15053C1 = true;
        }
        m20797I6(null, 1, 0);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: T0 */
    public int mo20972T0() {
        return 0;
    }

    /* JADX INFO: renamed from: T4 */
    public void m20973T4(MRtcPusherHandler mRtcPusherHandler) {
        this.f15071I2 = mRtcPusherHandler;
    }

    /* JADX INFO: renamed from: T5 */
    public void m20974T5() {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.pauseAudioMixing();
        }
    }

    /* JADX INFO: renamed from: T6 */
    public void m20975T6(String str, boolean z, boolean z2, int i) {
        if (this.f15053C1) {
            return;
        }
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.startAudioMixing(str, z, z2, i);
            this.f15106U.adjustAudioMixingVolume(this.f15142j1);
            this.f15053C1 = true;
        }
        m20797I6(null, 1, 0);
    }

    /* JADX INFO: renamed from: U4 */
    public void m20976U4(MRtcQualityHandler mRtcQualityHandler) {
        this.f15125a2 = mRtcQualityHandler;
    }

    /* JADX INFO: renamed from: U5 */
    public boolean m20977U5(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).playEffect(i, str, i2, d, d3, d2 * 100.0d, !z);
        }
        return true;
    }

    /* JADX INFO: renamed from: U6 */
    public void m20978U6() {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).stopAllEffects();
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: V0 */
    public long mo20979V0() {
        return 0L;
    }

    /* JADX INFO: renamed from: V4 */
    public void m20980V4(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f15127b2 = mRtcReceiveSeiHandler;
    }

    /* JADX INFO: renamed from: V6 */
    public void m20981V6(int i) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).stopEffect(i);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: W0 */
    public int mo20982W0() {
        return this.f15078L0;
    }

    /* JADX INFO: renamed from: W5 */
    public void m20984W5() {
        this.f14987H.f191101r = m20877p5();
        MMRtcStats mMRtcStats = this.f15090P0;
        if (mMRtcStats == null || mMRtcStats.remoteStats.size() <= 0 || this.f15090P0.remoteStats.get(0).AudioStats == null) {
            wvx wvxVar = this.f14987H;
            wvxVar.f191066f0 = 0L;
            wvxVar.f191072h0 = 0L;
        } else {
            wvx wvxVar2 = this.f14987H;
            wvxVar2.f191069g0 += wvxVar2.f191066f0;
            wvxVar2.f191075i0 += wvxVar2.f191072h0;
            long j = this.f15090P0.remoteStats.get(0).AudioStats.expandCount * 10;
            wvx wvxVar3 = this.f14987H;
            wvxVar2.f191066f0 = j - wvxVar3.f191069g0;
            wvxVar3.f191072h0 = this.f15090P0.remoteStats.get(0).videoStats.videoRenderCount - this.f14987H.f191075i0;
        }
        this.f14988I.m122852u();
    }

    /* JADX INFO: renamed from: W6 */
    public void m20985W6() {
        this.f15098R2 = false;
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: X */
    public void mo20986X() {
        this.f15136g1 = false;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: X0 */
    public long mo20987X0() {
        return 0L;
    }

    /* JADX INFO: renamed from: X4 */
    public void m20988X4(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f15120Y1 = mRtcTokenWillExpireHander;
    }

    /* JADX INFO: renamed from: X5 */
    public void m20989X5() {
        this.f14987H.f191004D = mo21053x1();
        this.f14987H.f191008F = mo20955O0();
        this.f14987H.f191010G = mo21037q1();
        this.f14987H.f191000B = mo20926F1();
        this.f14987H.f191024N = mo21051w1();
        this.f14987H.f191026O = mo21013h1();
        this.f14987H.f191028P = mo20991Y0();
        this.f14987H.f191030Q = mo21027m0();
        this.f14987H.f191110v = getVideoWidth();
        this.f14987H.f191112w = mo21021k0();
        this.f14987H.f191077j = mo21012h0();
        this.f14987H.f191101r = m20877p5();
        this.f14987H.f191034S = m20728Z1().f175512w;
        this.f14987H.f191036T = m20728Z1().f175513x;
        this.f14987H.f191038U = m20773B5();
        wvx wvxVar = this.f14987H;
        wvxVar.f191040V = this.f15068H2 ? 1L : 0L;
        wvxVar.f191015I0 = this.f15084N0;
        wvxVar.f191017J0 = this.f15087O0;
        this.f14988I.m122826H();
    }

    /* JADX INFO: renamed from: X6 */
    public void m20990X6(String str) {
        this.f15162s1 = str;
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.renewToken(str);
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo20656Y(g510 g510Var, uow uowVar) {
        super.mo20656Y(g510Var, uowVar);
        this.f15066H0 = g510Var;
        if (uowVar == null) {
            return;
        }
        int i = uowVar.f180160E0;
        this.f15163s2 = i;
        if (i <= 0 || i > 30) {
            Log.e("unint", "error maxFps=" + this.f15163s2);
            this.f15163s2 = 30;
        }
        this.f15156p1 = (ror) uowVar;
        m20801J6();
        g510 g510Var2 = this.f15066H0;
        if (g510Var2 != null) {
            this.f15112W = g510Var2.m128993l();
        }
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "videoWidth:" + this.f15000s.f175506s + ",videoHeight:" + this.f15000s.f175508t + ",visualWidth:" + this.f15000s.f175510u + ",visualHeight:" + this.f15000s.f175511v + ",encodeWidth:" + this.f15000s.f175494m + ",encodeHeight:" + this.f15000s.f175496n + ",videoBitrate:" + this.f15000s.f175451H + ",audioBitrate:" + this.f15000s.f175462S + ",videoFPS:" + this.f15000s.f175449F + ",codecFPS:" + this.f15000s.f180160E0 + ",mergeCanvasWidth:" + ((ror) this.f15000s).f175490k + ",mergeCanvasHeight:" + ((ror) this.f15000s).f175492l + ",codecFPS:" + this.f15000s.f180160E0 + ",isHard:" + this.f15000s.f180156A0);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: Y0 */
    public int mo20991Y0() {
        MMRtcStats mMRtcStats = this.f15090P0;
        if (mMRtcStats != null) {
            return mMRtcStats.videoStats.videoBitrate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m20992Y4(int i) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.adjustPlaybackSignalVolume(i);
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public void m20993Y5(boolean z) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            if (z) {
                mMRtcEngine.registerAudioFrameObserver(null);
                this.f15106U.registerAudioFrameObserver(this);
                this.f15134f1 = true;
            } else {
                if (this.f15098R2) {
                    return;
                }
                mMRtcEngine.registerAudioFrameObserver(null);
                this.f15134f1 = false;
            }
        }
    }

    /* JADX INFO: renamed from: Y6 */
    public void m20994Y6(String str) {
        this.f14988I.m122843l("updateRtmpUrl", str);
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine == null || this.f15138h1 == null || str == null || this.f15059E2) {
            return;
        }
        this.f14987H.f191051a0 = str;
        mMRtcEngine.addPublishStreamUrl(this.f15156p1.f180187v0, true);
        this.f14988I.m122820B(str, this.f14987H.f191114x);
        q210.InterfaceC19500a interfaceC19500a = this.f15138h1;
        if (interfaceC19500a != null) {
            interfaceC19500a.mo165950g(CommandMessage.COMMAND_CLEAR_NOTIFICATION_TYPE, 0, 0, this);
        }
        this.f14987H.f191051a0 = str;
        MRtcPusherHandler mRtcPusherHandler = this.f15071I2;
        if (mRtcPusherHandler != null) {
            mRtcPusherHandler.onPushChangeStreamUrl(str);
        }
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "updateRtmpUrl:url=".concat(str));
    }

    /* JADX INFO: renamed from: Z4 */
    public void m20995Z4(long j, float f) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setParameters("{\"che.audio.playout.uid.volume\": {\"uid\":userid,\"volume\":volumeScale}}");
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public void m20996Z5(int i, int i2) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (i2 == 0) {
            mMRtcEngine.setRemoteVideoStreamType(i, 0);
        } else {
            mMRtcEngine.setRemoteVideoStreamType(i, 1);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: a0 */
    public long mo20997a0() {
        return this.f14987H.f191006E;
    }

    /* JADX INFO: renamed from: a5 */
    public int m20998a5(int i) {
        int clientRole;
        this.f14988I.m122843l("changeRole", Integer.valueOf(i));
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "call changeRole:" + i);
        this.f15164t1 = i;
        synchronized (this.f15166u1) {
            if (1 == i) {
                try {
                    m20801J6();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f15106U != null) {
                oq70.m168791d().m168795c("MoMoRtcPushFilter", "changeRole:" + i);
                clientRole = this.f15106U.setClientRole(i);
            } else {
                clientRole = 0;
            }
        }
        if (this.f15164t1 == 2) {
            mo20739i2();
            this.f14987H.f191001B0 = "MrtcAudience";
        } else {
            mo20737g2();
            this.f14987H.f191001B0 = "M".equals(mo21051w1()) ? "MrtcMaster" : "MrtcSlaver";
        }
        this.f14987H.f191062e = System.currentTimeMillis();
        this.f14987H.f191065f = System.currentTimeMillis();
        return clientRole;
    }

    /* JADX INFO: renamed from: a6 */
    public void m20999a6() {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).resumeAllEffects();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: b0 */
    public void mo20657b0() {
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: b1 */
    public long mo21000b1() {
        MMRtcLocalVideoStats mMRtcLocalVideoStats;
        MMRtcStats mMRtcStats = this.f15090P0;
        if (mMRtcStats == null || (mMRtcLocalVideoStats = mMRtcStats.videoStats) == null) {
            return 0L;
        }
        return mMRtcLocalVideoStats.vEncodeCount;
    }

    /* JADX INFO: renamed from: b6 */
    public void m21001b6(int i) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).resumeEffect(i);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: c0 */
    public long mo21002c0() {
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: c1 */
    public int mo20658c1() {
        return 1;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: c2 */
    public void mo20731c2() {
        if (this.f15164t1 == 1) {
            mo20738h2();
        } else {
            mo20736f2();
        }
    }

    /* JADX INFO: renamed from: c6 */
    public void m21003c6() {
        this.f14988I.m122843l("resumeRecording");
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "resumeRecording");
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.muteLocalAudioStream(false);
            this.f15115X = true;
        }
        Handler handler = this.f15062F2;
        if (handler != null) {
            handler.removeCallbacks(this.f15101S1);
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, p153l.evx.InterfaceC16844b
    /* JADX INFO: renamed from: d1 */
    public void mo20733d1() {
        if (this.f15164t1 == 1) {
            m20989X5();
        } else {
            m20984W5();
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: d2 */
    public void mo20734d2() {
        if (this.f15164t1 == 1) {
            mo20739i2();
        } else {
            mo20737g2();
        }
    }

    /* JADX INFO: renamed from: d6 */
    public void m21004d6() {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.resumeAudioMixing();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e0 */
    public Surface mo20659e0() {
        return null;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e1 */
    public void mo20660e1(l6m l6mVar) {
        l6m l6mVar2;
        super.mo20660e1(l6mVar);
        if ((l6mVar instanceof ExtAudioWrapper) && (l6mVar2 = this.f14990K) != null) {
            ((ExtAudioWrapper) l6mVar2).m144341r2();
            ((ExtAudioWrapper) this.f14990K).m21087J2(new C4241b());
            ((ExtAudioWrapper) this.f14990K).mo21127s1(1);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public void m21005e5(boolean z) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            if (z) {
                mMRtcEngine.enableAudio();
            } else {
                mMRtcEngine.disableAudio();
            }
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m21006e6(String str) {
        int i;
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null && this.f15109V == -1) {
            this.f15109V = mMRtcEngine.createDataStream(true, true);
        }
        MMRtcEngine mMRtcEngine2 = this.f15106U;
        if (mMRtcEngine2 == null || (i = this.f15109V) == -1) {
            return;
        }
        mMRtcEngine2.sendStreamMessage(i, str);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo20661f() {
        Log.e("unint", "stopRecord");
        this.f14988I.m122843l("stopRecord");
        this.f15115X = false;
        this.f15119Y0 = 0;
        this.f15136g1 = false;
        this.f15065G2 = true;
        super.mo20661f();
        C4245f c4245f = this.f15141i2;
        if (c4245f != null) {
            c4245f.m21064a();
            this.f15141i2 = null;
        }
        stopSurroundMusic();
        Timer timer = this.f15056D2;
        if (timer != null) {
            timer.cancel();
            this.f15056D2 = null;
        }
        release();
        l6m l6mVar = this.f14990K;
        if (l6mVar != null) {
            ror rorVar = this.f15156p1;
            ((ExtAudioWrapper) l6mVar).m21086I2(2048, rorVar.f175459P, rorVar.f175461R, "NULL");
        }
        l6m l6mVar2 = this.f14990K;
        if (l6mVar2 != null) {
            l6mVar2.mo21082G1(null);
            this.f14990K.mo21099V(null);
            this.f14990K.mo109296R(null);
            this.f14990K = null;
        }
        super.m20747p2();
        yt0.m217280g().m217296q(yt0.f201475f);
        PipelineConcurrentHashMap<Long, xhy> pipelineConcurrentHashMap = this.f15104T0;
        if (pipelineConcurrentHashMap != null && !pipelineConcurrentHashMap.isEmpty()) {
            t9c.m189743a("zhengjijian", "stopRecord memberInfoMap " + this.f15104T0.size());
            this.f15104T0.clear();
        }
        PipelineConcurrentHashMap<Long, iny> pipelineConcurrentHashMap2 = this.f15100S0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            this.f15100S0.clear();
        }
        synchronized (this.f15054C2) {
            try {
                if (!this.f15054C2.isEmpty()) {
                    for (SurfaceViewRenderer surfaceViewRenderer : this.f15054C2.values()) {
                        if (surfaceViewRenderer != null) {
                            surfaceViewRenderer.release();
                        }
                    }
                    this.f15054C2.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        csx.m112235R().m112244C1(0);
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "stopRecordOK!!!!!!!!!!!!!!!!!!!!");
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: f2 */
    public void mo20736f2() {
        this.f14988I.m122843l("pullStartV3", Boolean.valueOf(this.f15095Q2));
        if (this.f15095Q2) {
            return;
        }
        this.f15095Q2 = true;
        this.f14987H.f191050a = System.currentTimeMillis();
        wvx wvxVar = this.f14987H;
        long jCurrentTimeMillis = System.currentTimeMillis();
        wvx wvxVar2 = this.f14987H;
        wvxVar.f191062e = jCurrentTimeMillis - wvxVar2.f191062e;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        wvx wvxVar3 = this.f14987H;
        wvxVar2.f191065f = jCurrentTimeMillis2 - wvxVar3.f191065f;
        wvxVar3.f191116y = this.f15050A2;
        super.mo20736f2();
    }

    /* JADX INFO: renamed from: f5 */
    public void m21007f5(boolean z) {
        this.f15079L1 = z;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: g0 */
    public long mo21008g0() {
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: g1 */
    public String mo21009g1(int i, int i2, Object obj) {
        return "";
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: g2 */
    public void mo20737g2() {
        this.f15095Q2 = false;
        this.f14988I.m122843l("pullStop_v3");
        wvx wvxVar = this.f14987H;
        if (wvxVar.f191050a != -1) {
            wvxVar.f191071h = System.currentTimeMillis() - this.f14987H.f191050a;
        }
        MMRtcStats mMRtcStats = this.f15090P0;
        if (mMRtcStats == null || mMRtcStats.remoteStats.size() <= 0 || this.f15090P0.remoteStats.get(0).AudioStats == null) {
            wvx wvxVar2 = this.f14987H;
            wvxVar2.f191066f0 = 0L;
            wvxVar2.f191072h0 = 0L;
        } else {
            this.f14987H.f191066f0 = this.f15090P0.remoteStats.get(0).AudioStats.expandCount * 10;
            this.f14987H.f191072h0 = this.f15090P0.remoteStats.get(0).videoStats.videoRenderCount;
        }
        this.f14987H.f191116y = this.f15050A2;
        super.mo20737g2();
    }

    /* JADX INFO: renamed from: g5 */
    public void m21010g5(boolean z) {
        MMRtcEngine mMRtcEngine;
        if (z && (mMRtcEngine = this.f15106U) != null) {
            mMRtcEngine.setParameters("{\"che.audio.live_for_comm\":true}");
            return;
        }
        MMRtcEngine mMRtcEngine2 = this.f15106U;
        if (mMRtcEngine2 != null) {
            mMRtcEngine2.setParameters("{\"che.audio.live_for_comm\":false}");
        }
    }

    /* JADX INFO: renamed from: g6 */
    public void m21011g6(boolean z) {
        if (z) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "set double push");
        }
        this.f15143j2 = z;
        this.f15172x1 = z;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    @Override // p153l.wyl
    public int getRoomType() {
        return this.f15158q1;
    }

    @Override // p153l.wyl
    public String getServerIpAddr() {
        return StringUtil.ALL_INTERFACES;
    }

    @Override // p153l.wyl
    public int getVideoWidth() {
        if (this.f15174y1 || this.f15172x1) {
            return 0;
        }
        return this.f15000s.f175494m;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: h0 */
    public int mo21012h0() {
        MMRtcStats mMRtcStats = this.f15090P0;
        if (mMRtcStats != null) {
            return (int) mMRtcStats.rxBytes;
        }
        return 0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: h1 */
    public int mo21013h1() {
        MMRtcStats mMRtcStats = this.f15090P0;
        if (mMRtcStats != null) {
            return (int) mMRtcStats.audioStats.audioBitrate;
        }
        return 0;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: h2 */
    public void mo20738h2() {
        this.f14988I.m122843l("pushStartV3", Boolean.valueOf(this.f15095Q2));
        if (this.f15095Q2) {
            return;
        }
        this.f15095Q2 = true;
        this.f14987H.f191050a = System.currentTimeMillis();
        this.f14987H.f191114x = mo20919D1();
        this.f14987H.f191110v = getVideoWidth();
        this.f14987H.f191112w = mo21021k0();
        this.f14987H.f191118z = mo21035p1();
        this.f14987H.f190998A = mo20913A0();
        this.f14987H.f191062e = System.currentTimeMillis() - this.f14987H.f191062e;
        super.mo20738h2();
    }

    /* JADX INFO: renamed from: h5 */
    public void m21014h5(boolean z, String str) {
        this.f15076K1 = z;
        this.f15073J1 = str;
        if (!z || this.f15106U == null || str == null || str.length() <= 0) {
            return;
        }
        t9c.m189747e("MoMoRtcPushFilter", "agora_sdk_ver: " + MMRtcEngine.getSdkVersion());
        this.f15106U.setParameters("{\"rtc.log_filter\":34781}");
        this.f15106U.setLogFile(this.f15073J1);
        this.f15106U.setLogFilter(15);
    }

    /* JADX INFO: renamed from: h6 */
    public void m21015h6(boolean z) {
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: i2 */
    public void mo20739i2() {
        this.f14988I.m122843l("pushStop_v3");
        this.f15095Q2 = false;
        wvx wvxVar = this.f14987H;
        if (wvxVar.f191050a != -1) {
            wvxVar.f191071h = System.currentTimeMillis() - this.f14987H.f191050a;
        }
        super.mo20739i2();
    }

    /* JADX INFO: renamed from: i5 */
    public void m21016i5(boolean z) {
        this.f14988I.m122843l("enableDualStreamMode", Boolean.valueOf(z));
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "call enableDualStreamMode:" + z);
        this.f15057E0 = z;
    }

    /* JADX INFO: renamed from: i6 */
    public void m21017i6(int i) {
        Log.e("MoMoRtcPushFilter", "momortc setAudioMixingPitch:" + i);
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setAudioMixingPitch(i);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: j1 */
    public long mo21018j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j5 */
    public void m21019j5(boolean z) {
        this.f15082M1 = z;
    }

    /* JADX INFO: renamed from: j6 */
    public void m21020j6(boolean z) {
        this.f15174y1 = z;
        if (z) {
            this.f15060F0 = false;
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: k0 */
    public int mo21021k0() {
        if (this.f15174y1 || this.f15172x1) {
            return 0;
        }
        return this.f15000s.f175496n;
    }

    /* JADX INFO: renamed from: k5 */
    public void m21022k5(boolean z) {
    }

    /* JADX INFO: renamed from: k6 */
    public void m21023k6(int i, int i2) {
        if (this.f15106U == null || i < 0) {
            return;
        }
        this.f14987H.f191003C0 = m20874o5(i);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: l1 */
    public long mo21024l1() {
        return 0L;
    }

    /* JADX INFO: renamed from: l5 */
    public void m21025l5(boolean z) {
        this.f15060F0 = z;
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            if (!z || this.f15156p1 == null) {
                mMRtcEngine.disableVideo();
                this.f15065G2 = true;
                return;
            }
            this.f15065G2 = false;
            mMRtcEngine.enableVideo();
            EGLContext eGLContext = this.f15112W;
            if (eGLContext != null) {
                this.f15106U.updateSharedContext(eGLContext);
            }
            oq70.m168791d().m168795c("MoMoRtcPushFilter", "setVideoProfileEx1 bitrate:" + this.f15156p1.f175451H);
            this.f15106U.setParameters("{\"che.video.keyFrameInterval\":1}");
            ror rorVar = this.f15156p1;
            if (rorVar.f180161F0 && rorVar.m197027d() == 1) {
                MMRtcEngine mMRtcEngine2 = this.f15106U;
                ror rorVar2 = this.f15156p1;
                mMRtcEngine2.setVideoProfile(rorVar2.f175496n, rorVar2.f175494m, 15, rorVar2.f175451H);
            } else {
                MMRtcEngine mMRtcEngine3 = this.f15106U;
                ror rorVar3 = this.f15156p1;
                mMRtcEngine3.setVideoProfile(rorVar3.f175494m, rorVar3.f175496n, 15, rorVar3.f175451H);
            }
        }
    }

    /* JADX INFO: renamed from: l6 */
    public void m21026l6(int i) {
        this.f15145k1 = i;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: m0 */
    public int mo21027m0() {
        if (this.f15115X) {
            IMMRtcEngineEventInterface.LocalVideoStats localVideoStatsM20898v5 = m20898v5();
            if (localVideoStatsM20898v5 != null) {
                return localVideoStatsM20898v5.sentFrameRate;
            }
            return 0;
        }
        IMMRtcEngineEventInterface.RemoteVideoStats remoteVideoStatsM20902w5 = m20902w5();
        if (remoteVideoStatsM20902w5 != null) {
            return remoteVideoStatsM20902w5.receivedFrameRate;
        }
        return 0;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: m1 */
    public void mo20664m1(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: m6 */
    public void m21028m6(int i) {
        this.f14987H.f191074i = i;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: n0 */
    public long mo21029n0() {
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: n1 */
    public int mo21030n1() {
        return this.f15153o1;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: n2 */
    public void mo20745n2(uow uowVar) {
        super.mo20745n2(uowVar);
        uow uowVar2 = this.f15000s;
        ror rorVar = (ror) uowVar2;
        this.f15156p1 = rorVar;
        if (rorVar != null) {
            if (!this.f15103T || uowVar2.f180156A0 == MomoPipeline.DecodeType.SOFT_DECODE || ((ror) uowVar2).f175473b0) {
                uowVar2.f180156A0 = MomoPipeline.DecodeType.SOFT_DECODE;
            } else {
                uowVar2.f180156A0 = MomoPipeline.DecodeType.HARD_DECODE;
            }
        }
    }

    /* JADX INFO: renamed from: n5 */
    public void m21031n5(long j, boolean z) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.forwardDownlinkAudio(j, z);
        }
    }

    /* JADX INFO: renamed from: n6 */
    public void m21032n6(int i) {
        this.f14988I.m122843l("setBusinessType", Integer.valueOf(i));
        this.f14987H.f191104s = i;
        esx.m122399d("MoMoRtcPushFilter", "setBusinessType : " + i);
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setRoomMode(i);
        }
    }

    @Override // p153l.zej, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        t9c.m189745c("zk", "newTextureReady");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.texture_in = i;
        long j = 1000 / ((long) this.f15163s2);
        long j2 = this.f15165t2;
        long j3 = jCurrentTimeMillis - j2;
        if (j3 < j) {
            return;
        }
        if (j2 == 0 || j3 > 5 * j) {
            this.f15165t2 = System.currentTimeMillis();
        } else {
            this.f15165t2 = j2 + j;
        }
        mo20652M1();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o */
    public void mo20665o() {
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: o0 */
    public long mo21033o0() {
        return 0L;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o1 */
    public boolean mo20666o1(ByteBuffer byteBuffer) {
        mo20669v0(byteBuffer);
        return true;
    }

    /* JADX INFO: renamed from: o6 */
    public void m21034o6(String str) {
        this.f15162s1 = str;
    }

    @Override // com.momo.momortc.IAudioFrameObserver
    public boolean onPlaybackFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f15115X) {
            return true;
        }
        int i7 = 0;
        boolean z = (i3 == 2 && i4 == 441000) ? false : true;
        if (this.f15069I0 != null && this.f15132e1 != null && this.f15136g1) {
            if (this.f15167u2 == null && z) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.f15167u2 = audioResampleUtils;
                int iInitResampleInfo = audioResampleUtils.initResampleInfo(i4, i3, 16, this.f15145k1, 2, 16);
                this.f15171w2.clear();
                if (iInitResampleInfo < 0) {
                    Log.e("mmrtcpushfilter", "onPlaybackAudioFrame: 创建重采样模块失败！！");
                    this.f15167u2.release();
                    this.f15167u2 = null;
                }
            }
            AudioResampleUtils audioResampleUtils2 = this.f15167u2;
            if (audioResampleUtils2 != null) {
                ByteBuffer byteBufferResamplePcmData = audioResampleUtils2.resamplePcmData(bArr, i);
                if (byteBufferResamplePcmData != null) {
                    m20887s5(byteBufferResamplePcmData.capacity());
                    this.f15171w2.put(byteBufferResamplePcmData.array(), 0, byteBufferResamplePcmData.capacity());
                }
            } else {
                m20887s5(bArr.length);
                this.f15171w2.put(bArr, 0, bArr.length);
            }
            int iPosition = this.f15171w2.position();
            while (true) {
                i5 = i7 * 2048;
                i6 = iPosition - i5;
                if (i6 < 2048 || !this.f15136g1) {
                    break;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
                byteBufferAllocate.put(this.f15171w2.array(), i5, 2048);
                byteBufferAllocate.flip();
                if (this.f15164t1 == 2) {
                    this.f15132e1.mo109339C(new oxd0(byteBufferAllocate, System.currentTimeMillis(), 2));
                } else {
                    dc1 dc1Var = this.f15069I0;
                    if (dc1Var != null) {
                        dc1Var.m115191i(new oxd0(byteBufferAllocate, System.currentTimeMillis(), 2));
                    }
                }
                i7++;
            }
            if (i6 > 0) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
                byteBufferAllocate2.put(this.f15171w2.array(), i5, i6);
                byteBufferAllocate2.flip();
                this.f15171w2.clear();
                this.f15171w2.put(byteBufferAllocate2);
            } else if (i6 == 0) {
                this.f15171w2.clear();
            }
        }
        return true;
    }

    @Override // com.momo.momortc.IAudioFrameObserver
    public boolean onRecordFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        oxd0 oxd0Var;
        int i5;
        int i6;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (!this.f15115X) {
            return true;
        }
        if (this.f15147l1 % 200 == 0) {
            oq70.m168791d().m168796f("MoMoRtcPushFilter", "onRecordFrame samples.len" + bArr.length + " numOfSamples:" + i);
        }
        this.f15147l1++;
        boolean z = (i3 == 2 && i4 == 441000) ? false : true;
        byte[] bArr2 = new byte[bArr.length];
        if (!this.f15150m2) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        oxd0 oxd0VarM115189g = null;
        if (this.f14990K == null || !this.f15115X) {
            oxd0Var = null;
        } else {
            ((ExtAudioWrapper) this.f14990K).mo21100W1(this.f15142j1);
            ((ExtAudioWrapper) this.f14990K).mo21127s1(i3);
            ((ExtAudioWrapper) this.f14990K).m21086I2(bArr.length, i4, i3, "momortc");
            oxd0 oxd0VarMo19373C = ((ExtAudioWrapper) this.f14990K).mo19373C(new oxd0(bArr2, this.f15145k1, i3));
            if (oxd0VarMo19373C != null && (byteBuffer2 = oxd0VarMo19373C.f149639b) != null) {
                byteBuffer2.get(bArr, 0, bArr.length);
            }
            oxd0Var = oxd0VarMo19373C;
        }
        if ((this.f15064G1 != null || this.f15132e1 != null) && this.f15136g1) {
            if (this.f15169v2 == null && z) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.f15169v2 = audioResampleUtils;
                int iInitResampleInfo = audioResampleUtils.initResampleInfo(i4, i3, 16, this.f15145k1, 2, 16);
                this.f15173x2.clear();
                if (iInitResampleInfo < 0) {
                    Log.e("mmrtcpushfilter", "onRecordFrame: 创建重采样模块失败！！");
                    this.f15169v2.release();
                    this.f15169v2 = null;
                }
            }
            if (oxd0Var != null && (byteBuffer = oxd0Var.f149639b) != null) {
                AudioResampleUtils audioResampleUtils2 = this.f15169v2;
                if (audioResampleUtils2 == null || !z) {
                    m20891t5(byteBuffer.capacity());
                    this.f15173x2.put(oxd0Var.f149639b.array(), 0, oxd0Var.f149639b.capacity());
                } else {
                    ByteBuffer byteBufferResamplePcmData = audioResampleUtils2.resamplePcmData(byteBuffer.array(), i);
                    if (byteBufferResamplePcmData != null) {
                        m20891t5(byteBufferResamplePcmData.capacity());
                        this.f15173x2.put(byteBufferResamplePcmData.array(), 0, byteBufferResamplePcmData.capacity());
                    }
                }
            }
            int iPosition = this.f15173x2.position();
            int i7 = 0;
            while (true) {
                i5 = i7 * 2048;
                i6 = iPosition - i5;
                if (i6 < 2048 || !this.f15136g1) {
                    break;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
                byteBufferAllocate.put(this.f15173x2.array(), i5, 2048);
                byteBufferAllocate.flip();
                dc1 dc1Var = this.f15069I0;
                if (dc1Var != null) {
                    dc1Var.m115192j(1.0f);
                    oxd0VarM115189g = this.f15069I0.m115189g();
                }
                ByteBuffer byteBufferM115190h = oxd0VarM115189g != null ? this.f15069I0.m115190h(byteBufferAllocate.array(), oxd0VarM115189g.m169687c(), oxd0VarM115189g.m169689e()) : byteBufferAllocate;
                pcmDataAvailableCallback pcmdataavailablecallback = this.f15064G1;
                if (pcmdataavailablecallback != null) {
                    pcmdataavailablecallback.onPcmDateCallback(this.f15156p1.f180157B0, byteBufferAllocate.array(), this.f15145k1, false);
                }
                oxd0 oxd0Var2 = new oxd0(byteBufferM115190h.array(), this.f15145k1, 2);
                oxd0Var2.m169691g(false);
                dpl.InterfaceC16599a interfaceC16599a = this.f15132e1;
                if (interfaceC16599a != null) {
                    interfaceC16599a.mo109339C(oxd0Var2);
                    int i8 = this.f15092P2;
                    this.f15092P2 = i8 + 1;
                    if (i8 % 50 == 0) {
                        oq70.m168791d().m168795c("MoMoRtcPushFilter", "=====replace======:mmrtc send pcm to IJK ");
                    }
                }
                i7++;
            }
            if (i6 > 0) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
                byteBufferAllocate2.put(this.f15173x2.array(), i5, i6);
                byteBufferAllocate2.flip();
                this.f15173x2.clear();
                this.f15173x2.put(byteBufferAllocate2);
            } else if (i6 == 0) {
                this.f15173x2.clear();
            }
        }
        return true;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: p */
    public void mo20667p(String str, int i) {
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: p1 */
    public int mo21035p1() {
        ror rorVar = this.f15156p1;
        int i = rorVar.f175490k;
        return i > 0 ? i : rorVar.f175506s;
    }

    /* JADX INFO: renamed from: p6 */
    public void m21036p6(boolean z) {
        this.f15148l2 = z;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: q1 */
    public long mo21037q1() {
        return this.f15072J0;
    }

    /* JADX INFO: renamed from: q5 */
    public double m21038q5() {
        MMRtcEngine mMRtcEngine = this.f15106U;
        return mMRtcEngine != null ? ((MMRtcEngineImpl) mMRtcEngine).getEffectsVolume() / 100.0f : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: q6 */
    public void m21039q6(double d) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            ((MMRtcEngineImpl) mMRtcEngine).setEffectsVolume(((float) d) * 100.0f);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: r0 */
    public long mo21040r0() {
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: r1 */
    public boolean mo20668r1() {
        return this.f15143j2;
    }

    /* JADX INFO: renamed from: r5 */
    public int m21041r5() {
        return this.f15113W0;
    }

    /* JADX INFO: renamed from: r6 */
    public int m21042r6(boolean z) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            return mMRtcEngine.setEnableSpeakerphone(z);
        }
        return -1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: s0 */
    public int mo21043s0() {
        return 0;
    }

    /* JADX INFO: renamed from: s6 */
    public void m21044s6(String str) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setEncryptionMode(str);
        }
    }

    public void stopSurroundMusic() {
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "stopSurroundMusic:");
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.stopAudioMixing();
            this.f15053C1 = false;
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m21045t6(String str) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setEncryptionSecret(str);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: u0 */
    public long mo21046u0() {
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: u1 */
    public long mo21047u1() {
        return 0L;
    }

    /* JADX INFO: renamed from: u5 */
    public int m21048u5() {
        return this.f15116X0;
    }

    /* JADX INFO: renamed from: u6 */
    public void m21049u6(String str) {
        boolean zHas;
        try {
            zHas = new JSONObject(str).has("che.audio.profile");
        } catch (JSONException e) {
            e.printStackTrace();
            zHas = false;
        }
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine == null || zHas) {
            return;
        }
        mMRtcEngine.setParameters(str);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: v0 */
    public void mo20669v0(ByteBuffer byteBuffer) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        oq70.m168791d().m168795c("MoMoRtcPushFilter", "writevideo:" + byteBuffer.limit() + ";timeStamp:" + jCurrentTimeMillis);
        if (this.f15103T || !this.f15115X || this.f15065G2) {
            return;
        }
        int i = this.f15168v1 + 1;
        this.f15168v1 = i;
        if (i >= 30 || this.f15172x1) {
            m20810N5();
        }
    }

    /* JADX INFO: renamed from: v6 */
    public void m21050v6(boolean z, boolean z2) {
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: w1 */
    public String mo21051w1() {
        ror rorVar = this.f15156p1;
        return (rorVar == null || rorVar.f164227h1) ? "M" : p7f.LATITUDE_SOUTH;
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
    public void m21052w6(String str) {
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
        String str7 = BaseSei.f14626Z;
        String str8 = "h";
        String str9 = BaseSei.f14625Y;
        if (this.f15156p1 == null || string == null) {
            return;
        }
        MMLiveTranscoding mMLiveTranscoding = this.f15152n2;
        if (mMLiveTranscoding == null) {
            this.f15152n2 = new MMLiveTranscoding();
        } else {
            mMLiveTranscoding.transcodingUserMap.clear();
        }
        ror rorVar = this.f15156p1;
        String str10 = "renderMode";
        int i3 = rorVar.f175490k;
        String str11 = "alpha";
        MMLiveTranscoding mMLiveTranscoding2 = this.f15152n2;
        if (i3 > 0) {
            mMLiveTranscoding2.width = i3;
            mMLiveTranscoding2.height = rorVar.f175492l;
        } else {
            mMLiveTranscoding2.width = rorVar.f175506s;
            mMLiveTranscoding2.height = rorVar.f175508t;
        }
        int i4 = 1;
        if (rorVar.f180161F0 && rorVar.m197027d() == 1) {
            MMLiveTranscoding mMLiveTranscoding3 = this.f15152n2;
            double d4 = mMLiveTranscoding3.width;
            mMLiveTranscoding3.width = mMLiveTranscoding3.height;
            mMLiveTranscoding3.height = d4;
        }
        MMLiveTranscoding mMLiveTranscoding4 = this.f15152n2;
        if (mMLiveTranscoding4.width <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || mMLiveTranscoding4.height <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return;
        }
        try {
            jSONObject = new JSONObject(string);
            if (jSONObject.has(com.tencent.connect.common.Constants.f58037TS)) {
                jSONObject.remove(com.tencent.connect.common.Constants.f58037TS);
            }
            jSONObject.put(com.tencent.connect.common.Constants.f58037TS, m20727Y1());
            if (jSONObject.has("bType")) {
                jSONObject.remove("bType");
            }
            jSONObject.put("bType", this.f14987H.f191104s);
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
                MMLiveTranscoding mMLiveTranscoding5 = this.f15152n2;
                mMLiveTranscodingUser.width = (int) mMLiveTranscoding5.width;
                mMLiveTranscodingUser.height = (int) mMLiveTranscoding5.height;
                mMLiveTranscodingUser.alpha = 1.0d;
                mMLiveTranscoding5.transcodingUserMap.put(string2, mMLiveTranscodingUser);
                this.f15152n2.transcodingExtraInfo = m20906x5(string);
            }
        }
        if (jSONArray == null) {
            return;
        }
        int i5 = 0;
        while (i5 < jSONArray.length()) {
            JSONObject jSONObject3 = (JSONObject) jSONArray.get(i5);
            String string3 = (jSONObject3 == null || !jSONObject3.has("id")) ? "" : jSONObject3.getString("id");
            double d6 = (jSONObject3 == null || !jSONObject3.has(BaseSei.f14624X)) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : jSONObject3.getDouble(BaseSei.f14624X);
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
                        MMLiveTranscoding mMLiveTranscoding6 = this.f15152n2;
                        double d7 = mMLiveTranscoding6.width;
                        mMLiveTranscodingUser2.posx = (int) (d6 * d7);
                        double d8 = mMLiveTranscoding6.height;
                        mMLiveTranscodingUser2.posy = (int) (d8 * d);
                        mMLiveTranscodingUser2.width = (int) (d7 * d2);
                        mMLiveTranscodingUser2.height = (int) (d8 * d3);
                        mMLiveTranscoding6.transcodingUserMap.put(string3, mMLiveTranscodingUser2);
                        this.f15152n2.transcodingExtraInfo = m20906x5(string);
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
                    MMLiveTranscoding mMLiveTranscoding7 = this.f15152n2;
                    double d9 = mMLiveTranscoding7.width;
                    mMLiveTranscodingUser3.posx = (int) (d6 * d9);
                    double d10 = mMLiveTranscoding7.height;
                    mMLiveTranscodingUser3.posy = (int) (d10 * d);
                    mMLiveTranscodingUser3.width = (int) (d9 * d2);
                    mMLiveTranscodingUser3.height = (int) (d10 * d3);
                    mMLiveTranscoding7.transcodingUserMap.put(string3, mMLiveTranscodingUser3);
                    this.f15152n2.transcodingExtraInfo = m20906x5(string);
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
                    MMLiveTranscoding mMLiveTranscoding8 = this.f15152n2;
                    double d11 = mMLiveTranscoding8.width;
                    mMLiveTranscodingUser4.posx = (int) (d6 * d11);
                    double d12 = mMLiveTranscoding8.height;
                    mMLiveTranscodingUser4.posy = (int) (d12 * d);
                    mMLiveTranscodingUser4.width = (int) (d11 * d2);
                    mMLiveTranscodingUser4.height = (int) (d12 * d3);
                    mMLiveTranscoding8.transcodingUserMap.put(string3, mMLiveTranscodingUser4);
                    this.f15152n2.transcodingExtraInfo = m20906x5(string);
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
                MMLiveTranscoding mMLiveTranscoding9 = this.f15152n2;
                double d13 = mMLiveTranscoding9.width;
                mMLiveTranscodingUser5.posx = (int) (d6 * d13);
                double d14 = mMLiveTranscoding9.height;
                mMLiveTranscodingUser5.posy = (int) (d14 * d);
                mMLiveTranscodingUser5.width = (int) (d13 * d2);
                mMLiveTranscodingUser5.height = (int) (d14 * d3);
                mMLiveTranscoding9.transcodingUserMap.put(string3, mMLiveTranscodingUser5);
                this.f15152n2.transcodingExtraInfo = m20906x5(string);
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
                    MMLiveTranscoding mMLiveTranscoding10 = this.f15152n2;
                    double d15 = mMLiveTranscoding10.width;
                    mMLiveTranscodingUser6.posx = (int) (d6 * d15);
                    double d16 = mMLiveTranscoding10.height;
                    mMLiveTranscodingUser6.posy = (int) (d16 * d);
                    mMLiveTranscodingUser6.width = (int) (d15 * d2);
                    mMLiveTranscodingUser6.height = (int) (d16 * d3);
                    mMLiveTranscoding10.transcodingUserMap.put(string3, mMLiveTranscodingUser6);
                    this.f15152n2.transcodingExtraInfo = m20906x5(string);
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
                MMLiveTranscoding mMLiveTranscoding11 = this.f15152n2;
                double d17 = mMLiveTranscoding11.width;
                mMLiveTranscodingUser7.posx = (int) (d6 * d17);
                double d18 = mMLiveTranscoding11.height;
                mMLiveTranscodingUser7.posy = (int) (d18 * d);
                mMLiveTranscodingUser7.width = (int) (d17 * d2);
                mMLiveTranscodingUser7.height = (int) (d18 * d3);
                mMLiveTranscoding11.transcodingUserMap.put(string3, mMLiveTranscodingUser7);
                this.f15152n2.transcodingExtraInfo = m20906x5(string);
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
                MMLiveTranscoding mMLiveTranscoding12 = this.f15152n2;
                double d19 = mMLiveTranscoding12.width;
                mMLiveTranscodingUser8.posx = (int) (d6 * d19);
                double d110 = mMLiveTranscoding12.height;
                mMLiveTranscodingUser8.posy = (int) (d110 * d);
                mMLiveTranscodingUser8.width = (int) (d19 * d2);
                mMLiveTranscodingUser8.height = (int) (d110 * d3);
                mMLiveTranscoding12.transcodingUserMap.put(string3, mMLiveTranscodingUser8);
                this.f15152n2.transcodingExtraInfo = m20906x5(string);
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
            MMLiveTranscoding mMLiveTranscoding13 = this.f15152n2;
            double d111 = mMLiveTranscoding13.width;
            mMLiveTranscodingUser9.posx = (int) (d6 * d111);
            double d112 = mMLiveTranscoding13.height;
            mMLiveTranscodingUser9.posy = (int) (d112 * d);
            mMLiveTranscodingUser9.width = (int) (d111 * d2);
            mMLiveTranscodingUser9.height = (int) (d112 * d3);
            mMLiveTranscoding13.transcodingUserMap.put(string3, mMLiveTranscodingUser9);
            this.f15152n2.transcodingExtraInfo = m20906x5(string);
            i5++;
            jSONArray = jSONArray2;
            str7 = str4;
            i4 = i;
            d5 = 1.0d;
            str9 = str2;
        }
        m20846c5(this.f15156p1.f180187v0);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: x1 */
    public long mo21053x1() {
        return this.f15147l1 * 1024;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x016c A[Catch: JSONException -> 0x01d7, TryCatch #0 {JSONException -> 0x01d7, blocks: (B:15:0x0057, B:18:0x0064, B:20:0x006a, B:23:0x0072, B:25:0x007d, B:28:0x0085, B:30:0x008b, B:33:0x00dd, B:37:0x00e6, B:39:0x00ec, B:41:0x00f4, B:43:0x00fa, B:46:0x0102, B:48:0x0108, B:51:0x0111, B:53:0x0117, B:56:0x0120, B:58:0x0126, B:61:0x012f, B:63:0x0135, B:66:0x013e, B:68:0x0144, B:71:0x014d, B:73:0x0155, B:77:0x016c, B:79:0x0176, B:81:0x017e, B:31:0x00d7), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0176 A[Catch: JSONException -> 0x01d7, TryCatch #0 {JSONException -> 0x01d7, blocks: (B:15:0x0057, B:18:0x0064, B:20:0x006a, B:23:0x0072, B:25:0x007d, B:28:0x0085, B:30:0x008b, B:33:0x00dd, B:37:0x00e6, B:39:0x00ec, B:41:0x00f4, B:43:0x00fa, B:46:0x0102, B:48:0x0108, B:51:0x0111, B:53:0x0117, B:56:0x0120, B:58:0x0126, B:61:0x012f, B:63:0x0135, B:66:0x013e, B:68:0x0144, B:71:0x014d, B:73:0x0155, B:77:0x016c, B:79:0x0176, B:81:0x017e, B:31:0x00d7), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX INFO: renamed from: x6 */
    public void m21054x6(String str) {
        JSONArray jSONArray;
        String str2;
        int i;
        String str3;
        String str4 = BaseSei.f14626Z;
        String str5 = "h";
        String str6 = "w";
        String str7 = BaseSei.f14625Y;
        if (this.f15156p1 == null || str == null) {
            return;
        }
        MMLiveTranscoding mMLiveTranscoding = this.f15152n2;
        if (mMLiveTranscoding == null) {
            this.f15152n2 = new MMLiveTranscoding();
        } else {
            mMLiveTranscoding.transcodingUserMap.clear();
        }
        MMLiveTranscoding mMLiveTranscoding2 = this.f15152n2;
        ror rorVar = this.f15156p1;
        String str8 = "renderMode";
        String str9 = "alpha";
        double d = rorVar.f175490k;
        mMLiveTranscoding2.width = d;
        double d2 = rorVar.f175492l;
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
                    MMLiveTranscoding mMLiveTranscoding3 = this.f15152n2;
                    double d3 = mMLiveTranscoding3.width;
                    mMLiveTranscodingUser.posx = (int) (d3 * 0.02280000038444996d);
                    double d4 = mMLiveTranscoding3.height;
                    mMLiveTranscodingUser.posy = (int) (d4 * FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    mMLiveTranscodingUser.width = (int) (0.2614000141620636d * d3);
                    mMLiveTranscodingUser.height = (int) (0.2500399947166443d * d4);
                    mMLiveTranscoding3.transcodingUserMap.put(string, mMLiveTranscodingUser);
                    this.f15152n2.transcodingExtraInfo = m20906x5(this.f15055D1);
                }
            }
            if (jSONArray != null && jSONArray.length() != 0) {
                int i3 = 0;
                while (i3 < jSONArray.length()) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i3);
                    String string2 = (jSONObject2 == null || !jSONObject2.has("id")) ? "" : jSONObject2.getString("id");
                    double d5 = (jSONObject2 == null || !jSONObject2.has(BaseSei.f14624X)) ? 0.0d : jSONObject2.getDouble(BaseSei.f14624X);
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
                        MMLiveTranscoding mMLiveTranscoding4 = this.f15152n2;
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
                        this.f15152n2.transcodingExtraInfo = m20906x5(this.f15055D1);
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
                    MMLiveTranscoding mMLiveTranscoding5 = this.f15152n2;
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
                    this.f15152n2.transcodingExtraInfo = m20906x5(this.f15055D1);
                    str6 = str12;
                    str4 = str4;
                    str5 = str5;
                    str7 = str13;
                    str8 = str3;
                    i3 = i + 1;
                    str9 = str2;
                    i2 = 1;
                }
                m20846c5(this.f15156p1.f180187v0);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y */
    public void mo20670y(int i, int i2) {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.enableAudioVolumeIndication(i, i2);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y0 */
    public void mo20671y0(int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: y5 */
    public float m21055y5() {
        return this.f15142j1;
    }

    /* JADX INFO: renamed from: y6 */
    public void m21056y6(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        float f2 = f * 1.8f;
        this.f15140i1 = f2;
        this.f14987H.f191013H0 = f2;
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            mMRtcEngine.adjustRecordingSignalVolume((int) (f2 * 100.0f));
        }
    }

    /* JADX INFO: renamed from: z5 */
    public long m21057z5() {
        MMRtcEngine mMRtcEngine = this.f15106U;
        if (mMRtcEngine != null) {
            return mMRtcEngine.getAudioMixingDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: z6 */
    public void m21058z6(boolean z, int i) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo20651K1(oxd0 oxd0Var) {
    }

    /* JADX INFO: renamed from: L4 */
    public void m20944L4(upw upwVar) {
    }

    /* JADX INFO: renamed from: O4 */
    public void m20956O4(vpw vpwVar) {
    }

    /* JADX INFO: renamed from: W4 */
    public void m20983W4(ypw ypwVar) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo20663l0(uow uowVar, EGLContext eGLContext) {
    }

    public MoMoRtcPushFilter(Context context, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar, String str) {
        super(context);
        this.f15099S = "MoMoRtcPushFilter";
        this.f15103T = true;
        this.f15109V = -1;
        this.f15115X = false;
        this.f15118Y = false;
        this.f15121Z = false;
        this.f15144k0 = 0;
        this.f15155p0 = 0;
        this.f15057E0 = false;
        this.f15060F0 = true;
        this.f15063G0 = null;
        this.f15072J0 = 0L;
        this.f15075K0 = 0;
        this.f15078L0 = 0;
        this.f15081M0 = 0L;
        this.f15084N0 = 0L;
        this.f15087O0 = 0L;
        this.f15100S0 = new PipelineConcurrentHashMap<>();
        this.f15104T0 = new PipelineConcurrentHashMap<>();
        this.f15107U0 = false;
        this.f15110V0 = true;
        this.f15113W0 = 0;
        this.f15116X0 = 0;
        this.f15119Y0 = 0;
        this.f15122Z0 = "1e6127d73cd4d405905aa6f2ad5e1a67";
        this.f15124a1 = null;
        this.f15126b1 = null;
        this.f15128c1 = null;
        this.f15130d1 = null;
        this.f15134f1 = false;
        this.f15136g1 = false;
        this.f15140i1 = 1.8f;
        this.f15142j1 = 1.0f;
        this.f15145k1 = 44100;
        this.f15147l1 = 0;
        this.f15149m1 = 0;
        this.f15151n1 = 0;
        this.f15153o1 = 0;
        this.f15158q1 = -1;
        this.f15162s1 = null;
        this.f15164t1 = 1;
        this.f15166u1 = new Object();
        this.f15168v1 = 0;
        this.f15172x1 = false;
        this.f15174y1 = false;
        this.f15176z1 = false;
        this.f15049A1 = new Object();
        this.f15051B1 = new PipelineConcurrentHashMap();
        this.f15053C1 = false;
        this.f15061F1 = null;
        this.f15067H1 = 0;
        this.f15070I1 = 750000;
        this.f15073J1 = "";
        this.f15076K1 = false;
        this.f15079L1 = false;
        this.f15082M1 = false;
        this.f15085N1 = 0.0f;
        this.f15088O1 = 0.0f;
        this.f15091P1 = 0.0f;
        this.f15094Q1 = 0.0f;
        this.f15101S1 = null;
        this.f15105T1 = null;
        this.f15127b2 = null;
        this.f15133e2 = new xpw();
        this.f15135f2 = new xpw();
        this.f15137g2 = new imw();
        this.f15139h2 = new tpw();
        this.f15143j2 = false;
        this.f15146k2 = false;
        this.f15148l2 = true;
        this.f15150m2 = false;
        this.f15152n2 = null;
        this.f15154o2 = false;
        this.f15161r2 = "";
        this.f15163s2 = 15;
        this.f15165t2 = 0L;
        this.f15167u2 = null;
        this.f15169v2 = null;
        this.f15171w2 = ByteBuffer.allocate(8192);
        this.f15173x2 = ByteBuffer.allocate(8192);
        this.f15050A2 = null;
        this.f15052B2 = null;
        this.f15054C2 = new ArrayMap();
        this.f15056D2 = null;
        this.f15059E2 = false;
        this.f15062F2 = new Handler(Looper.getMainLooper());
        this.f15065G2 = false;
        this.f15068H2 = false;
        this.f15074J2 = 0;
        this.f15077K2 = 0;
        this.f15080L2 = false;
        this.f15083M2 = false;
        this.f15086N2 = 0L;
        this.f15089O2 = false;
        this.f15092P2 = 0;
        this.f15095Q2 = false;
        this.f15098R2 = false;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.momo.piplineext.codec.MoMoRtcPushFilter.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent.getAction().equals("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                    if (intent.getIntExtra("state", 0) == 0) {
                        if (MoMoRtcPushFilter.this.f15106U == null || true != csx.m112235R().m112245D()) {
                            return;
                        }
                        MoMoRtcPushFilter.this.f15106U.setParameters("{\"che.audio.enable.ns\":true}");
                        return;
                    }
                    if (intent.getIntExtra("state", 0) == 1 && MoMoRtcPushFilter.this.f15106U != null && true == csx.m112235R().m112245D()) {
                        MoMoRtcPushFilter.this.f15106U.setParameters("{\"che.audio.enable.ns\":false}");
                    }
                }
            }
        };
        this.f15102S2 = broadcastReceiver;
        this.f15122Z0 = str;
        ContextUtils.initialize(context);
        this.f15066H0 = g510Var;
        this.f15156p1 = (ror) uowVar;
        this.f15107U0 = false;
        this.f15110V0 = true;
        this.f15138h1 = interfaceC19500a;
        m20869m5(uowVar);
        wvx wvxVar = this.f14987H;
        wvxVar.f191059d = 260L;
        wvxVar.f191064e1 = String.valueOf(hashCode());
        this.f14987H.f191067f1 = 1L;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        if (context != null) {
            jj5.m145018l(context, broadcastReceiver, intentFilter);
        }
    }
}
