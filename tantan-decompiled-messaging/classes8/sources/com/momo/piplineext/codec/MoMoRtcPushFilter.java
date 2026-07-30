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
import android.view.SurfaceView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
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
import com.momo.xeengine.gift.GiftLogEvent;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p003p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
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
import l.a2l0;
import l.a9y;
import l.ab1;
import l.anw;
import l.cbl0;
import l.ccj;
import l.dix;
import l.dxl;
import l.eix;
import l.ewl;
import l.fjx;
import l.gw00;
import l.hjx;
import l.hu00;
import l.ii5;
import l.ii70;
import l.jjw;
import l.ley;
import l.mcj;
import l.mpd0;
import l.n8c;
import l.sml;
import l.st0;
import l.u3m;
import l.ulw;
import l.vlw;
import l.vmw;
import l.wb1;
import l.wmw;
import l.xmw;
import l.ya1;
import l.ymw;
import l.yw00;
import l.z1l0;
import l.za1;
import l.zmw;
import l.zmx;
import l.ztk;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007l.hgd0;
import p007l.okw;
import p007l.qmr;
import p007l.ski0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class MoMoRtcPushFilter extends MediaBaseCodecFilter implements IAudioFrameObserver, sml, ewl, gw00.f {

    /* JADX INFO: renamed from: T2 */
    private static final float[] f0T2 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: U2 */
    static String f1U2 = "v3.momoRtcMsgLogin";

    /* JADX INFO: renamed from: V2 */
    static String f2V2 = "v3.momoRtcMsgOnLogin";

    /* JADX INFO: renamed from: W2 */
    static String f3W2 = "v3.momoRtcMsgHeart";

    /* JADX INFO: renamed from: X2 */
    static String f4X2 = "v3.momoRtcMsgJoin";

    /* JADX INFO: renamed from: Y2 */
    static String f5Y2 = "v3.momoRtcMsgOnJoin";

    /* JADX INFO: renamed from: Z2 */
    static String f6Z2 = "v3.momoRtcMsgLeave";

    /* JADX INFO: renamed from: a3 */
    static String f7a3 = "v3.momoRtcMsgOnLeave";

    /* JADX INFO: renamed from: b3 */
    static String f8b3 = "v3.momoRtcMsgPeerJoin";

    /* JADX INFO: renamed from: c3 */
    static String f9c3 = "v3.momoRtcMsgPeerLeave";

    /* JADX INFO: renamed from: d3 */
    static String f10d3 = "v3.momoRtcMsgAddUrl";

    /* JADX INFO: renamed from: e3 */
    static String f11e3 = "v3.momoRtcMsgRemoveUrl";

    /* JADX INFO: renamed from: f3 */
    static String f12f3 = "v3.momoRtcMsgTranscoding";

    /* JADX INFO: renamed from: g3 */
    static String f13g3 = "v3.momoRtcMsgLocalAudioMute";

    /* JADX INFO: renamed from: h3 */
    static String f14h3 = "v3.momoRtcMsgRemoteAudioMute";

    /* JADX INFO: renamed from: i3 */
    static String f15i3 = "v3.momoRtcMsgLocalVideoMute";

    /* JADX INFO: renamed from: j3 */
    static String f16j3 = "v3.momoRtcMsgRemoteVideoMute";

    /* JADX INFO: renamed from: k3 */
    static String f17k3 = "v3.momoRtcMsgReJoin";

    /* JADX INFO: renamed from: l3 */
    static String f18l3 = "v3.momoRtcMsgOnReJoin";

    /* JADX INFO: renamed from: m3 */
    static String f19m3 = "v3.momoRtcMsgStartPK";

    /* JADX INFO: renamed from: n3 */
    static String f20n3 = "v3.momoRtcMsgOnStartPK";

    /* JADX INFO: renamed from: o3 */
    static String f21o3 = "v3.momoRtcMsgStopPK";

    /* JADX INFO: renamed from: p3 */
    static String f22p3 = "v3.momoRtcMsgOnStopPK";

    /* JADX INFO: renamed from: q3 */
    static String f23q3 = "v3.momoRtcMsgPeerLost";

    /* JADX INFO: renamed from: r3 */
    static String f24r3 = "v3.momoRtcMsgKeyExpired";

    /* JADX INFO: renamed from: s3 */
    static String f25s3 = "v3.momoRtcMsgKeyUpdate";

    /* JADX INFO: renamed from: t3 */
    static String f26t3 = "v3.momoRtcMsgChangeRole";

    /* JADX INFO: renamed from: u3 */
    static String f27u3 = "v3.momoRtcMsgOnChangeRole";

    /* JADX INFO: renamed from: v3 */
    static String f28v3 = "v3.momoRtcMsgOnKicked";

    /* JADX INFO: renamed from: A1 */
    private Object f29A1;

    /* JADX INFO: renamed from: A2 */
    private String f30A2;

    /* JADX INFO: renamed from: B1 */
    private PipelineConcurrentHashMap f31B1;

    /* JADX INFO: renamed from: B2 */
    private String f32B2;

    /* JADX INFO: renamed from: C1 */
    private volatile boolean f33C1;

    /* JADX INFO: renamed from: C2 */
    private final Map<Integer, SurfaceViewRenderer> f34C2;

    /* JADX INFO: renamed from: D1 */
    private String f35D1;

    /* JADX INFO: renamed from: D2 */
    Timer f36D2;

    /* JADX INFO: renamed from: E0 */
    private boolean f37E0;

    /* JADX INFO: renamed from: E1 */
    private String f38E1;

    /* JADX INFO: renamed from: E2 */
    private boolean f39E2;

    /* JADX INFO: renamed from: F0 */
    private boolean f40F0;

    /* JADX INFO: renamed from: F1 */
    public SurfaceTexture f41F1;

    /* JADX INFO: renamed from: F2 */
    private Handler f42F2;

    /* JADX INFO: renamed from: G0 */
    private String f43G0;

    /* JADX INFO: renamed from: G1 */
    private pcmDataAvailableCallback f44G1;

    /* JADX INFO: renamed from: G2 */
    private boolean f45G2;

    /* JADX INFO: renamed from: H0 */
    private yw00 f46H0;

    /* JADX INFO: renamed from: H1 */
    private int f47H1;

    /* JADX INFO: renamed from: H2 */
    private boolean f48H2;

    /* JADX INFO: renamed from: I0 */
    private wb1 f49I0;

    /* JADX INFO: renamed from: I1 */
    private int f50I1;

    /* JADX INFO: renamed from: I2 */
    private MRtcPusherHandler f51I2;

    /* JADX INFO: renamed from: J0 */
    private long f52J0;

    /* JADX INFO: renamed from: J1 */
    private String f53J1;

    /* JADX INFO: renamed from: J2 */
    private int f54J2;

    /* JADX INFO: renamed from: K0 */
    private int f55K0;

    /* JADX INFO: renamed from: K1 */
    private boolean f56K1;

    /* JADX INFO: renamed from: K2 */
    private int f57K2;

    /* JADX INFO: renamed from: L0 */
    private int f58L0;

    /* JADX INFO: renamed from: L1 */
    private boolean f59L1;

    /* JADX INFO: renamed from: L2 */
    private volatile boolean f60L2;

    /* JADX INFO: renamed from: M0 */
    private long f61M0;

    /* JADX INFO: renamed from: M1 */
    private boolean f62M1;

    /* JADX INFO: renamed from: M2 */
    private boolean f63M2;

    /* JADX INFO: renamed from: N0 */
    private long f64N0;

    /* JADX INFO: renamed from: N1 */
    private float f65N1;

    /* JADX INFO: renamed from: N2 */
    private long f66N2;

    /* JADX INFO: renamed from: O0 */
    private long f67O0;

    /* JADX INFO: renamed from: O1 */
    private float f68O1;

    /* JADX INFO: renamed from: O2 */
    private boolean f69O2;

    /* JADX INFO: renamed from: P0 */
    private MMRtcStats f70P0;

    /* JADX INFO: renamed from: P1 */
    private float f71P1;

    /* JADX INFO: renamed from: P2 */
    private int f72P2;

    /* JADX INFO: renamed from: Q0 */
    private IMMRtcEngineEventInterface.RemoteVideoStats f73Q0;

    /* JADX INFO: renamed from: Q1 */
    private float f74Q1;

    /* JADX INFO: renamed from: Q2 */
    private volatile boolean f75Q2;

    /* JADX INFO: renamed from: R0 */
    private IMMRtcEngineEventInterface.LocalVideoStats f76R0;

    /* JADX INFO: renamed from: R1 */
    IMMRtcEngineEventInterface f77R1;

    /* JADX INFO: renamed from: R2 */
    private boolean f78R2;

    /* JADX INFO: renamed from: S */
    private final String f79S;

    /* JADX INFO: renamed from: S0 */
    private PipelineConcurrentHashMap<Long, ley> f80S0;

    /* JADX INFO: renamed from: S1 */
    Runnable f81S1;

    /* JADX INFO: renamed from: S2 */
    private final BroadcastReceiver f82S2;

    /* JADX INFO: renamed from: T */
    private boolean f83T;

    /* JADX INFO: renamed from: T0 */
    private PipelineConcurrentHashMap<Long, a9y> f84T0;

    /* JADX INFO: renamed from: T1 */
    private AudioVolumeInfo[] f85T1;

    /* JADX INFO: renamed from: U */
    private MMRtcEngine f86U;

    /* JADX INFO: renamed from: U0 */
    private boolean f87U0;

    /* JADX INFO: renamed from: U1 */
    private MRtcAudioHandler f88U1;

    /* JADX INFO: renamed from: V */
    private int f89V;

    /* JADX INFO: renamed from: V0 */
    private boolean f90V0;

    /* JADX INFO: renamed from: V1 */
    private MRtcAudioHandlerEx f91V1;

    /* JADX INFO: renamed from: W */
    private EGLContext f92W;

    /* JADX INFO: renamed from: W0 */
    private int f93W0;

    /* JADX INFO: renamed from: W1 */
    private MRtcEventHandler f94W1;

    /* JADX INFO: renamed from: X */
    private volatile boolean f95X;

    /* JADX INFO: renamed from: X0 */
    private int f96X0;

    /* JADX INFO: renamed from: X1 */
    private MRtcChannelHandler f97X1;

    /* JADX INFO: renamed from: Y */
    private boolean f98Y;

    /* JADX INFO: renamed from: Y0 */
    private volatile int f99Y0;

    /* JADX INFO: renamed from: Y1 */
    private MRtcTokenWillExpireHander f100Y1;

    /* JADX INFO: renamed from: Z */
    private boolean f101Z;

    /* JADX INFO: renamed from: Z0 */
    private String f102Z0;

    /* JADX INFO: renamed from: Z1 */
    private ymw f103Z1;

    /* JADX INFO: renamed from: a1 */
    private z1l0 f104a1;

    /* JADX INFO: renamed from: a2 */
    private MRtcQualityHandler f105a2;

    /* JADX INFO: renamed from: b1 */
    private a2l0 f106b1;

    /* JADX INFO: renamed from: b2 */
    private MRtcReceiveSeiHandler f107b2;

    /* JADX INFO: renamed from: c1 */
    private cbl0 f108c1;

    /* JADX INFO: renamed from: c2 */
    private MRtcConnectHandler f109c2;

    /* JADX INFO: renamed from: d1 */
    private MRtcRealLayoutNotifyHander f110d1;

    /* JADX INFO: renamed from: d2 */
    private MRtcClientRoleChangedHandler f111d2;

    /* JADX INFO: renamed from: e1 */
    private sml.a f112e1;

    /* JADX INFO: renamed from: e2 */
    private zmw f113e2;

    /* JADX INFO: renamed from: f1 */
    private boolean f114f1;

    /* JADX INFO: renamed from: f2 */
    private zmw f115f2;

    /* JADX INFO: renamed from: g1 */
    private boolean f116g1;

    /* JADX INFO: renamed from: g2 */
    private jjw f117g2;

    /* JADX INFO: renamed from: h1 */
    private hu00.a f118h1;

    /* JADX INFO: renamed from: h2 */
    private vmw f119h2;

    /* JADX INFO: renamed from: i1 */
    private float f120i1;

    /* JADX INFO: renamed from: i2 */
    private C0006f f121i2;

    /* JADX INFO: renamed from: j1 */
    private float f122j1;

    /* JADX INFO: renamed from: j2 */
    private boolean f123j2;

    /* JADX INFO: renamed from: k0 */
    private int f124k0;

    /* JADX INFO: renamed from: k1 */
    public int f125k1;

    /* JADX INFO: renamed from: k2 */
    private boolean f126k2;

    /* JADX INFO: renamed from: l1 */
    private int f127l1;

    /* JADX INFO: renamed from: l2 */
    private boolean f128l2;

    /* JADX INFO: renamed from: m1 */
    private int f129m1;

    /* JADX INFO: renamed from: m2 */
    private boolean f130m2;

    /* JADX INFO: renamed from: n1 */
    private int f131n1;

    /* JADX INFO: renamed from: n2 */
    private MMLiveTranscoding f132n2;

    /* JADX INFO: renamed from: o1 */
    private int f133o1;

    /* JADX INFO: renamed from: o2 */
    private boolean f134o2;

    /* JADX INFO: renamed from: p0 */
    private int f135p0;

    /* JADX INFO: renamed from: p1 */
    private qmr f136p1;

    /* JADX INFO: renamed from: p2 */
    private String f137p2;

    /* JADX INFO: renamed from: q1 */
    protected int f138q1;

    /* JADX INFO: renamed from: q2 */
    private int f139q2;

    /* JADX INFO: renamed from: r1 */
    private boolean f140r1;

    /* JADX INFO: renamed from: r2 */
    private String f141r2;

    /* JADX INFO: renamed from: s1 */
    private String f142s1;

    /* JADX INFO: renamed from: s2 */
    private int f143s2;

    /* JADX INFO: renamed from: t1 */
    private int f144t1;

    /* JADX INFO: renamed from: t2 */
    private long f145t2;

    /* JADX INFO: renamed from: u1 */
    private Object f146u1;

    /* JADX INFO: renamed from: u2 */
    private AudioResampleUtils f147u2;

    /* JADX INFO: renamed from: v1 */
    private int f148v1;

    /* JADX INFO: renamed from: v2 */
    private AudioResampleUtils f149v2;

    /* JADX INFO: renamed from: w1 */
    private EglBase f150w1;

    /* JADX INFO: renamed from: w2 */
    ByteBuffer f151w2;

    /* JADX INFO: renamed from: x1 */
    private boolean f152x1;

    /* JADX INFO: renamed from: x2 */
    ByteBuffer f153x2;

    /* JADX INFO: renamed from: y1 */
    private boolean f154y1;

    /* JADX INFO: renamed from: y2 */
    private hgd0 f155y2;

    /* JADX INFO: renamed from: z1 */
    private boolean f156z1;

    /* JADX INFO: renamed from: z2 */
    private eix f157z2;

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$a */
    public class RunnableC0001a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f159a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ byte[] f160b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f161c;

        public RunnableC0001a(byte[] bArr, byte[] bArr2, long j) {
            this.f159a = bArr;
            this.f160b = bArr2;
            this.f161c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (MoMoRtcPushFilter.this.f146u1) {
                try {
                    if (MoMoRtcPushFilter.this.f110d1 != null) {
                        MoMoRtcPushFilter.this.f110d1.OnRealLayoutChange(this.f159a, this.f160b, 4, this.f161c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$b */
    public class C0002b implements ExtAudioWrapper.InterfaceC0020i {
        public C0002b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC0020i
        /* JADX INFO: renamed from: a */
        public void mo324a(String str) {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC0020i
        /* JADX INFO: renamed from: b */
        public void mo325b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC0020i
        public int getStreamerType() {
            return 4;
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c */
    public class C0003c implements IMMRtcEngineEventInterface {

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f165a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f166b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f167c;

            /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a$a, reason: collision with other inner class name */
            public class C0819a implements RendererCommon.RendererEvents {
                public C0819a() {
                }

                @Override // com.momo.rtcbase.RendererCommon.RendererEvents
                public void onFirstFrameRendered() {
                }

                @Override // com.momo.rtcbase.RendererCommon.RendererEvents
                public void onFrameResolutionChanged(int i, int i2, int i3) {
                }
            }

            /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a$b */
            public class b implements cbl0.c {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ SurfaceViewRenderer f170a;

                public b(SurfaceViewRenderer surfaceViewRenderer) {
                    this.f170a = surfaceViewRenderer;
                }

                /* JADX INFO: renamed from: a */
                public void m328a(SurfaceTexture surfaceTexture) {
                    a aVar = a.this;
                    surfaceTexture.setDefaultBufferSize(aVar.f166b, aVar.f167c);
                    this.f170a.surfaceTextureCreated(surfaceTexture);
                    MoMoRtcPushFilter.this.f86U.setupRemoteVideo(new VideoCanvas(this.f170a, 1, a.this.f165a));
                }
            }

            /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$a$c */
            public class c implements cbl0.c {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ SurfaceViewRenderer f172a;

                public c(SurfaceViewRenderer surfaceViewRenderer) {
                    this.f172a = surfaceViewRenderer;
                }

                /* JADX INFO: renamed from: a */
                public void m329a(SurfaceTexture surfaceTexture) {
                    a aVar = a.this;
                    surfaceTexture.setDefaultBufferSize(aVar.f166b, aVar.f167c);
                    this.f172a.surfaceTextureCreated(surfaceTexture);
                    MoMoRtcPushFilter.this.f86U.setupRemoteVideo(new VideoCanvas(this.f172a, 1, a.this.f165a));
                }
            }

            public a(int i, int i2, int i3) {
                this.f165a = i;
                this.f166b = i2;
                this.f167c = i3;
            }

            @Override // java.lang.Runnable
            @RequiresApi(api = 15)
            public void run() {
                if (MoMoRtcPushFilter.this.f150w1 == null) {
                    MoMoRtcPushFilter.this.f150w1 = EglBase.create();
                }
                SurfaceViewRenderer surfaceViewRendererCreateRendererView = MMRtcEngine.CreateRendererView(MoMoRtcPushFilter.this.W1());
                surfaceViewRendererCreateRendererView.init(MoMoRtcPushFilter.this.f150w1.getEglBaseContext(), new C0819a());
                surfaceViewRendererCreateRendererView.setZOrderOnTop(true);
                surfaceViewRendererCreateRendererView.setZOrderMediaOverlay(true);
                synchronized (MoMoRtcPushFilter.this.f34C2) {
                    MoMoRtcPushFilter.this.f34C2.put(Integer.valueOf(this.f165a), surfaceViewRendererCreateRendererView);
                }
                if (MoMoRtcPushFilter.this.f86U != null) {
                    MoMoRtcPushFilter.this.f86U.setupRemoteVideo(new VideoCanvas(surfaceViewRendererCreateRendererView, 1, this.f165a));
                }
                if (!MoMoRtcPushFilter.this.f123j2 && MoMoRtcPushFilter.this.f108c1 == null && MoMoRtcPushFilter.this.f106b1 == null) {
                    if (MoMoRtcPushFilter.this.f104a1 == null || MoMoRtcPushFilter.this.f154y1 || MoMoRtcPushFilter.this.f152x1) {
                        return;
                    }
                    ii70.d().c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelAdded: userID=" + this.f165a);
                    MoMoRtcPushFilter.this.f104a1.a((long) this.f165a, surfaceViewRendererCreateRendererView, this.f166b, this.f167c);
                    return;
                }
                if (MoMoRtcPushFilter.this.f31B1.containsKey(Integer.valueOf(this.f165a))) {
                    return;
                }
                MoMoRtcPushFilter.this.f31B1.put(Integer.valueOf(this.f165a), Integer.valueOf(this.f165a));
                if (MoMoRtcPushFilter.this.f108c1 != null) {
                    MoMoRtcPushFilter.this.f108c1.a(this.f165a, new b(surfaceViewRendererCreateRendererView), this.f166b, this.f167c);
                    return;
                }
                ski0 ski0Var = new ski0(this.f165a, this.f166b, this.f167c, new c(surfaceViewRendererCreateRendererView));
                if (MoMoRtcPushFilter.this.f106b1 == null || MoMoRtcPushFilter.this.f154y1 || MoMoRtcPushFilter.this.f152x1) {
                    return;
                }
                ii70.d().c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + this.f165a);
                MoMoRtcPushFilter.this.f106b1.a((long) this.f165a, ski0Var, this.f166b, this.f167c);
            }
        }

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f174a;

            public b(int i) {
                this.f174a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (MoMoRtcPushFilter.this.f104a1 != null) {
                    ii70.d().c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelAdded Audio: userID=" + this.f174a);
                    MoMoRtcPushFilter.this.f104a1.a((long) this.f174a, (SurfaceView) null, 176, 176);
                }
            }
        }

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f176a;

            public c(int i) {
                this.f176a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).J = MomoCodec.MomoCodecState.WAIT;
                boolean z = MoMoRtcPushFilter.this.f136p1.f3961h1;
                C0003c c0003c = C0003c.this;
                if (z) {
                    MoMoRtcPushFilter.this.f118h1.g(4353, this.f176a, 0, MoMoRtcPushFilter.this);
                } else if (MoMoRtcPushFilter.this.f118h1 != null) {
                    MoMoRtcPushFilter.this.f118h1.g(4352, this.f176a, 0, MoMoRtcPushFilter.this);
                    C0003c c0003c2 = C0003c.this;
                    c0003c2.onUserOffline(((vlw) MoMoRtcPushFilter.this.f136p1).B0, 1);
                }
                if (MoMoRtcPushFilter.this.f94W1 != null) {
                    MoMoRtcPushFilter.this.f94W1.onError(this.f176a);
                }
            }
        }

        /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$c$d */
        public class d extends TimerTask {
            public d() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(MoMoRtcPushFilter.this.f35D1) || MoMoRtcPushFilter.this.f86U == null) {
                    return;
                }
                MoMoRtcPushFilter.this.f86U.setSei(MoMoRtcPushFilter.this.m200P5());
            }
        }

        public C0003c() {
        }

        /* JADX INFO: renamed from: a */
        private void m326a(IMMRtcEngineEventInterface.LocalVideoStats localVideoStats) {
            ii70.d().c("MoMoRtcPushFilter", "onLocalVideoStatsstats:" + localVideoStats);
            MoMoRtcPushFilter.this.f76R0 = localVideoStats;
            if (MoMoRtcPushFilter.this.f87U0 = false) {
                MoMoRtcPushFilter.this.f87U0 = true;
                MoMoRtcPushFilter.this.f90V0 = false;
                MoMoRtcPushFilter.this.f118h1.g(4099, 0, 0, MoMoRtcPushFilter.this);
                MoMoRtcPushFilter.m36K3(MoMoRtcPushFilter.this);
            }
            if (MoMoRtcPushFilter.this.f103Z1 != null) {
                MoMoRtcPushFilter.this.f117g2.a = MoMoRtcPushFilter.this.f76R0.sentBitrate;
                MoMoRtcPushFilter.this.f117g2.b = MoMoRtcPushFilter.this.f76R0.sentFrameRate;
                MoMoRtcPushFilter.this.f103Z1.b(MoMoRtcPushFilter.this.f117g2);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m327b(IMMRtcEngineEventInterface.RemoteVideoStats remoteVideoStats) {
            ii70.d().c("MoMoRtcPushFilter", " onRemoteVideoStatsstats:" + remoteVideoStats + "w " + remoteVideoStats.width + " h " + remoteVideoStats.height + " bits " + remoteVideoStats.receivedBitrate + " fps " + remoteVideoStats.receivedFrameRate);
            MoMoRtcPushFilter.this.f73Q0 = remoteVideoStats;
            if (MoMoRtcPushFilter.this.f103Z1 != null) {
                MoMoRtcPushFilter.this.f119h2.b = MoMoRtcPushFilter.this.f73Q0.delay;
                MoMoRtcPushFilter.this.f119h2.d = MoMoRtcPushFilter.this.f73Q0.height;
                MoMoRtcPushFilter.this.f119h2.b = MoMoRtcPushFilter.this.f73Q0.delay;
                MoMoRtcPushFilter.this.f119h2.e = MoMoRtcPushFilter.this.f73Q0.receivedBitrate;
                MoMoRtcPushFilter.this.f119h2.f = MoMoRtcPushFilter.this.f73Q0.receivedFrameRate;
                MoMoRtcPushFilter.this.f119h2.g = MoMoRtcPushFilter.this.f73Q0.rxStreamType;
                MoMoRtcPushFilter.this.f119h2.a = MoMoRtcPushFilter.this.f73Q0.uid;
                MoMoRtcPushFilter.this.f119h2.c = MoMoRtcPushFilter.this.f73Q0.width;
                MoMoRtcPushFilter.this.f103Z1.a(MoMoRtcPushFilter.this.f119h2);
            }
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public void didOnKickedOut(String str, int i, int i2, int i3) {
            if (MoMoRtcPushFilter.this.f155y2 != null) {
                MoMoRtcPushFilter.this.f155y2.m9324j(str, i2);
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

        public void onActiveSpeaker(int i) {
        }

        public void onApiCallExecuted(int i, String str, String str2) {
        }

        public void onAudioEffectFinished(int i) {
        }

        public void onAudioMixingBegin() {
            MoMoRtcPushFilter.m35K2(MoMoRtcPushFilter.this);
        }

        public void onAudioMixingError() {
            MoMoRtcPushFilter.m35K2(MoMoRtcPushFilter.this);
        }

        public void onAudioMixingFinished() {
            ii70.d().c("MoMoRtcPushFilter", "onAudioMixingFinished");
            MoMoRtcPushFilter.this.f33C1 = false;
            MoMoRtcPushFilter.this.m30I6(null, 2, 0);
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onAudioMixingFinished();
            }
            MoMoRtcPushFilter.m35K2(MoMoRtcPushFilter.this);
        }

        public void onAudioQuality(int i, int i2, short s, short s2) {
            ley leyVar = (ley) MoMoRtcPushFilter.this.f80S0.get(Long.valueOf(i));
            if (leyVar != null) {
                leyVar.j(s, s2);
            }
            if (MoMoRtcPushFilter.this.f105a2 != null) {
                MoMoRtcPushFilter.this.f105a2.onAudioQuality(i, i2, s, s2);
            }
        }

        public void onAudioRouteChanged(int i) {
        }

        public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            int length;
            if (MoMoRtcPushFilter.this.f95X && (length = audioVolumeInfoArr.length) > 0) {
                MoMoRtcPushFilter.this.f85T1 = audioVolumeInfoArr;
                if (MoMoRtcPushFilter.this.f91V1 != null) {
                    AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[length];
                    int i2 = -1;
                    for (int i3 = 0; i3 < length; i3++) {
                        AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                        if (MoMoRtcPushFilter.this.f85T1[i3].uid == 0) {
                            i2 = i3;
                        }
                        audioVolumeWeight.uid = (int) MoMoRtcPushFilter.this.f85T1[i3].uid;
                        audioVolumeWeight.volume = (MoMoRtcPushFilter.this.f85T1[i3].volume * 1.0f) / 10.0f;
                        audioVolumeWeightArr[i3] = audioVolumeWeight;
                    }
                    MoMoRtcPushFilter.this.f91V1.onAudioVolumeIndication(audioVolumeWeightArr, i);
                    if (i2 > 0) {
                        AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                        audioVolumeWeight2.uid = ((vlw) MoMoRtcPushFilter.this.f136p1).B0;
                        if (MoMoRtcPushFilter.this.f48H2) {
                            audioVolumeWeight2.volume = 0.0f;
                        } else {
                            audioVolumeWeight2.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 10.0f;
                        }
                        MoMoRtcPushFilter.this.f91V1.onAudioVolumeIndication(new AudioVolumeWeight[]{audioVolumeWeight2}, i);
                    }
                }
                if (MoMoRtcPushFilter.this.f88U1 != null) {
                    AudioVolumeWeight[] audioVolumeWeightArr2 = new AudioVolumeWeight[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        AudioVolumeWeight audioVolumeWeight3 = new AudioVolumeWeight();
                        long j = MoMoRtcPushFilter.this.f85T1[i4].uid;
                        MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                        if (j == 0) {
                            moMoRtcPushFilter.f85T1[i4].uid = ((vlw) MoMoRtcPushFilter.this.f136p1).B0;
                            if (MoMoRtcPushFilter.this.f48H2) {
                                audioVolumeWeight3.volume = 0.0f;
                            } else {
                                audioVolumeWeight3.volume = (MoMoRtcPushFilter.this.f85T1[i4].volume * 1.0f) / 10.0f;
                            }
                            audioVolumeWeight3.uid = (int) MoMoRtcPushFilter.this.f85T1[i4].uid;
                        } else {
                            audioVolumeWeight3.uid = (int) moMoRtcPushFilter.f85T1[i4].uid;
                            audioVolumeWeight3.volume = (MoMoRtcPushFilter.this.f85T1[i4].volume * 1.0f) / 10.0f;
                        }
                        audioVolumeWeightArr2[i4] = audioVolumeWeight3;
                    }
                    MoMoRtcPushFilter.this.f88U1.onAudioVolumeIndication(audioVolumeWeightArr2, i);
                }
            }
        }

        public void onCameraFocusAreaChanged(Rect rect) {
        }

        public void onCameraReady() {
        }

        public void onChannelList(ArrayList<String> arrayList) {
        }

        public void onClientRoleChanged(int i, int i2) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.l(new Object[]{"onClientRoleChanged", Integer.valueOf(i), Integer.valueOf(i2)});
            if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.b) {
                int i3 = MoMoRtcPushFilter.this.f144t1;
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                if (i3 == 1) {
                    moMoRtcPushFilter.m267h2();
                } else {
                    moMoRtcPushFilter.m258f2();
                }
            }
            if (MoMoRtcPushFilter.this.f111d2 != null) {
                MoMoRtcPushFilter.this.f111d2.onClientRoleChanged(i, i2);
            }
        }

        public void onConnectionBanned() {
            Log.e("unint", "onConnectionBanned");
            if (MoMoRtcPushFilter.this.f109c2 != null) {
                MoMoRtcPushFilter.this.f109c2.onReconnectTimeout();
            }
            MoMoRtcPushFilter.this.f118h1.g(4353, 10, 0, MoMoRtcPushFilter.this);
        }

        public void onConnectionInterrupted() {
            Log.e("unint", "onConnectionInterrupted");
            MoMoRtcPushFilter.m69Z3(MoMoRtcPushFilter.this);
        }

        public void onConnectionLost() {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.l(new Object[]{"onConnectionLost"});
            Log.e("unint", "onConnectionLost=");
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onConnectionLost();
            }
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.y0 = 10L;
            MoMoRtcPushFilter.this.e2(4353, 10);
        }

        public void onError(int i) {
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            if (i == 503) {
                ((MediaBaseCodecFilter) moMoRtcPushFilter).I.l(new Object[]{"onDNSError", Integer.valueOf(i)});
            } else {
                ((MediaBaseCodecFilter) moMoRtcPushFilter).I.l(new Object[]{"onError", Integer.valueOf(i)});
            }
            Log.e("unint", "onError=" + i);
            if (i == 0) {
                return;
            }
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onError(i);
            }
            ii70.d().c("MoMoRtcPushFilter", "onError,err:" + i);
            Log.e("->MOMORTC", "onError, err: " + i);
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.y0 = (long) i;
            MoMoRtcPushFilter.this.f42F2.post(new c(i));
        }

        public void onFirstLocalAudioFrame(int i) {
        }

        public void onFirstLocalVideoFrame(int i, int i2, int i3) {
            ii70.d().c("MoMoRtcPushFilter", "onFirstLocalVideoFrame:width:" + i + ",height:" + i2 + ",elapsed:" + i3);
            ii70.d().c("MediaEngineCallback", "onFirstLocalVideoFrame  " + i + " " + i2 + " " + i3);
        }

        public void onFirstRemoteAudioFrame(int i, int i2) {
        }

        public void onFirstRemoteVideoDecoded(int i, int i2, int i3, int i4) {
        }

        public void onFirstRemoteVideoFrame(int i, int i2, int i3, int i4) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.l(new Object[]{"onFirstRemoteVideoFrame", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            ii70.d().c("MoMoRtcPushFilter", "onFirstRemoteVideoDecoded:uid" + i + "width" + i2 + "height" + i3 + "elapsed" + i4);
            if (MoMoRtcPushFilter.this.W1() == null) {
                return;
            }
            MoMoRtcPushFilter.this.f42F2.postAtFrontOfQueue(new a(i, i2, i3));
            long j = i;
            a9y a9yVar = (a9y) MoMoRtcPushFilter.this.f84T0.get(Long.valueOf(j));
            if (a9yVar != null && !a9yVar.d()) {
                n8c.a("zhengjijian", "agora get first idr");
                a9yVar.g(true);
                if (MoMoRtcPushFilter.this.f144t1 == 1) {
                    ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.c(true, a9yVar.c(), j, 0L, 0L, 0L);
                }
                MoMoRtcPushFilter.this.f118h1.g(8198, i, 0, MoMoRtcPushFilter.this);
            }
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onFirstRemoteVideoDecoded(j, i2, i3, i4);
            }
        }

        public void onHttpError(int i, String str) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.l(new Object[]{"onHttpError", Integer.valueOf(i), str});
        }

        public void onJoinChannelSuccess(String str, int i, int i2) {
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.l(new Object[]{"onJoinChannelSuccess", str, Integer.valueOf(i), Integer.valueOf(i2)});
            StringBuilder sb = new StringBuilder(" onJoinChannelSuccess ");
            sb.append(str);
            sb.append(" ");
            sb.append(i);
            sb.append(" ");
            long j = i;
            sb.append(4294967295L & j);
            sb.append(" ");
            sb.append(i2);
            sb.append(";getSabineEnable=");
            sb.append(MoMoRtcPushFilter.this.f86U.getSabineEnable());
            Log.e("unint", sb.toString());
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.b = true;
            MoMoRtcPushFilter.this.l2(MediaBaseCodecFilter.CodecFilterState.FILTER_PLAY);
            if (MoMoRtcPushFilter.this.f86U != null) {
                MoMoRtcPushFilter.this.f95X = true;
                if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.s != 0) {
                    MoMoRtcPushFilter.this.f86U.setRoomMode((int) ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.s);
                }
            }
            if (MoMoRtcPushFilter.this.f35D1 != null && MoMoRtcPushFilter.this.f136p1.f3961h1) {
                Log.e("MoMoRtcPushFilter", "zhangjialiang onJoinChannelSuccess setJsonForPostion");
                MoMoRtcPushFilter.this.f156z1 = false;
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                moMoRtcPushFilter.m315w6(moMoRtcPushFilter.f35D1);
            }
            fjx.R().C1(MoMoRtcPushFilter.this.f86U.getSabineEnable() == 1 ? 0 : 1);
            MoMoRtcPushFilter.this.m321y6(1.0f);
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).J = MomoCodec.MomoCodecState.START;
            MoMoRtcPushFilter.this.m248c2();
            MoMoRtcPushFilter.this.b2();
            MoMoRtcPushFilter.this.f118h1.g(4096, 0, 0, MoMoRtcPushFilter.this);
            MoMoRtcPushFilter.this.f118h1.g(12306, 0, 0, MoMoRtcPushFilter.this);
            if ((MoMoRtcPushFilter.this.f154y1 || MoMoRtcPushFilter.this.f152x1) && MoMoRtcPushFilter.this.f47H1 != 0) {
                MoMoRtcPushFilter.this.m43N5();
            }
            if (MoMoRtcPushFilter.this.f134o2 && MoMoRtcPushFilter.this.f86U != null) {
                MoMoRtcPushFilter.this.f86U.startChannelMediaRelay(MoMoRtcPushFilter.this.f139q2, MoMoRtcPushFilter.this.f137p2);
                MoMoRtcPushFilter.this.f134o2 = false;
            }
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onJoinChannelSuccess(str, j, i2);
            }
            int i3 = ((ulw) MoMoRtcPushFilter.this.f136p1).k;
            MoMoRtcPushFilter moMoRtcPushFilter2 = MoMoRtcPushFilter.this;
            if (i3 > 0) {
                moMoRtcPushFilter2.m82d5(moMoRtcPushFilter2.f136p1.f3961h1, ((ulw) MoMoRtcPushFilter.this.f136p1).k, ((ulw) MoMoRtcPushFilter.this.f136p1).l, MoMoRtcPushFilter.this.f50I1, 15, ((vlw) MoMoRtcPushFilter.this.f136p1).v0);
            } else {
                moMoRtcPushFilter2.m82d5(moMoRtcPushFilter2.f136p1.f3961h1, ((ulw) MoMoRtcPushFilter.this.f136p1).s, ((ulw) MoMoRtcPushFilter.this.f136p1).t, MoMoRtcPushFilter.this.f50I1, 15, ((vlw) MoMoRtcPushFilter.this.f136p1).v0);
            }
            MoMoRtcPushFilter.this.m87f6();
            MoMoRtcPushFilter moMoRtcPushFilter3 = MoMoRtcPushFilter.this;
            if (moMoRtcPushFilter3.f36D2 == null) {
                moMoRtcPushFilter3.f36D2 = new Timer();
                MoMoRtcPushFilter.this.f36D2.schedule(new d(), 100L, 1000L);
            }
        }

        public void onLastmileQuality(int i) {
            ii70.d().c("MoMoRtcPushFilter", "onLastmileQuality " + i);
            MoMoRtcPushFilter.this.f118h1.g(4101, i, 0, MoMoRtcPushFilter.this);
        }

        public void onLeaveChannel(MMRtcStats mMRtcStats) {
            Log.e("unint", "onLeaveChannel");
            ii70.d().c("MoMoRtcPushFilter", getClass().getSimpleName() + " onLeaveChannelstats:" + mMRtcStats);
            MoMoRtcPushFilter.this.f95X = false;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).J = MomoCodec.MomoCodecState.STOP;
            if (mMRtcStats != null) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.B = mMRtcStats.txBytes;
                n8c.a("AgoraJzheng", "" + mMRtcStats.txBytes + "/" + mMRtcStats.txBytes);
            }
        }

        public void onLocalVideoQualityLimited(IMMRtcEngineEventInterface.LocalVideoStats localVideoStats, IMMRtcEngineEventInterface.QualityLimitationReason qualityLimitationReason) {
            int i = localVideoStats.targetBitrate * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE;
            int i2 = localVideoStats.targetFrameRate;
            if (i == 0 || i2 == 0 || (MoMoRtcPushFilter.this.f54J2 == i && MoMoRtcPushFilter.this.f57K2 == i2)) {
                n8c.a("DYNAMIC_SCALING", "xxxxxxxxx from [ " + MoMoRtcPushFilter.this.f54J2 + ", " + ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).s.E0 + " ] To [ " + i + ", " + localVideoStats.targetFrameRate + ",[[sentBitrate " + localVideoStats.sentBitrate + ", " + localVideoStats.sentFrameRate + "]");
                return;
            }
            if (MoMoRtcPushFilter.this.f51I2 != null) {
                MoMoRtcPushFilter.this.f51I2.onPushLevelChange(i, i2);
            }
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            moMoRtcPushFilter.f54J2 = ((ulw) ((MediaBaseCodecFilter) moMoRtcPushFilter).s).H;
            MoMoRtcPushFilter moMoRtcPushFilter2 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter2.f57K2 = ((MediaBaseCodecFilter) moMoRtcPushFilter2).s.E0;
            n8c.a("DYNAMIC_SCALING", "from [ " + MoMoRtcPushFilter.this.f54J2 + ", " + ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).s.E0 + " ] To [ " + i + ", " + localVideoStats.targetFrameRate + "]");
            if (MoMoRtcPushFilter.this.f54J2 > i || MoMoRtcPushFilter.this.f57K2 > i2) {
                MoMoRtcPushFilter.this.m61V5(1);
            } else {
                MoMoRtcPushFilter.this.m61V5(0);
            }
            ((ulw) ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).s).H = i;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).s.E0 = i2;
        }

        public void onLog(int i, String str) {
            if (i == 1) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.n(str);
                return;
            }
            if (i == 2) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.o(str);
                return;
            }
            if (i == 3) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.p(str);
                return;
            }
            if (i == 4) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.m(str);
                return;
            }
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            if (i == 5) {
                ((MediaBaseCodecFilter) moMoRtcPushFilter).I.q(str);
            } else {
                moMoRtcPushFilter.m70Z6(i, str);
            }
        }

        public void onMediaEngineLoadSuccess() {
            ii70.d().c("MoMoRtcPushFilter", "onMediaEngineLoadSuccess");
        }

        public void onMediaEngineStartCallSuccess() {
        }

        public void onMicrophoneEnabled(boolean z) {
        }

        public void onNetworkQuality(int i, int i2, int i3) {
            if (MoMoRtcPushFilter.this.f105a2 != null) {
                MoMoRtcPushFilter.this.f105a2.onNetworkQuality(i, i2, i3);
            }
        }

        public void onReceiveSEI(int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("bType")) {
                    int iOptInt = jSONObject.optInt("bType");
                    ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.s = iOptInt;
                    hjx.d("MoMoRtcPushFilter", "onReceiveSEI getbType: " + iOptInt);
                }
                if (jSONObject.has("ts")) {
                    long jX = fjx.R().X() - Long.valueOf(jSONObject.optString("ts")).longValue();
                    ley leyVar = (ley) MoMoRtcPushFilter.this.f80S0.get(Long.valueOf(i));
                    if (leyVar != null) {
                        leyVar.E++;
                        leyVar.D = (int) (((long) leyVar.D) + jX);
                    }
                }
            } catch (JSONException | Exception unused) {
            }
            if (MoMoRtcPushFilter.this.f107b2 == null || MoMoRtcPushFilter.this.f136p1 == null) {
                return;
            }
            MoMoRtcPushFilter.this.f107b2.OnReceiveH264Sei(str.getBytes(), i, "");
        }

        public void onRefreshRecordingServiceStatus(int i) {
        }

        public void onRejoinChannelSuccess(String str, int i, int i2) {
            ii70.d().c("MyEngineEventHandler", "onRejoinChannelSuccess " + str + " " + i + " " + i2);
            Log.e("unint", "onRejoinChannelSuccess " + str + " " + i + " " + i2);
        }

        public void onRemoteVideoFrame(int i, VideoFrame videoFrame) {
        }

        public void onRemoteVideoStateChanged(int i, int i2) {
        }

        public void onRequestToken() {
            if (MoMoRtcPushFilter.this.f97X1 != null) {
                MoMoRtcPushFilter.this.f97X1.onRequestChannelKey();
            }
        }

        public void onRtcStats(MMRtcStats mMRtcStats) {
            ii70.d().c("MoMoRtcPushFilter", "onRtcStatsstats:" + mMRtcStats);
            if (MoMoRtcPushFilter.this.f73Q0 == null) {
                MoMoRtcPushFilter.this.f73Q0 = new IMMRtcEngineEventInterface.RemoteVideoStats();
            }
            long j = 0;
            long j2 = 0;
            boolean z = false;
            boolean z2 = true;
            for (MMRtcRemoteStats mMRtcRemoteStats : mMRtcStats.remoteStats) {
                n8c.a("AgoraJzheng", "onRtcStats " + mMRtcRemoteStats.uid);
                ley leyVar = (ley) MoMoRtcPushFilter.this.f80S0.get(Long.valueOf(mMRtcRemoteStats.uid));
                MMRtcRemoteAudioStats mMRtcRemoteAudioStats = mMRtcRemoteStats.AudioStats;
                if (mMRtcRemoteAudioStats != null && leyVar != null) {
                    leyVar.j += mMRtcRemoteAudioStats.audioCache;
                    leyVar.k = mMRtcRemoteAudioStats.audioLost;
                    int i = mMRtcRemoteAudioStats.audioPlayLag;
                    leyVar.n = i;
                    long j3 = mMRtcRemoteAudioStats.aReceiveSize;
                    leyVar.f = j3;
                    leyVar.t = mMRtcRemoteAudioStats.expandCount;
                    leyVar.u = mMRtcRemoteAudioStats.expandCartonCount;
                    j2 += j3;
                    if (i == 0) {
                        z2 = false;
                    }
                    leyVar.z += mMRtcRemoteAudioStats.audiLossTimestamp;
                    leyVar.A += mMRtcRemoteAudioStats.networkRtt;
                    leyVar.B++;
                    z = true;
                }
                MMRtcRemoteVideoStats mMRtcRemoteVideoStats = mMRtcRemoteStats.videoStats;
                if (mMRtcRemoteVideoStats != null && leyVar != null) {
                    leyVar.b = mMRtcRemoteVideoStats.videoBitrate;
                    leyVar.i = mMRtcRemoteVideoStats.videoheight;
                    leyVar.h = mMRtcRemoteVideoStats.videowidth;
                    leyVar.l = mMRtcRemoteVideoStats.videoDelay;
                    leyVar.m = (int) mMRtcRemoteVideoStats.videoLost;
                    long j4 = mMRtcRemoteVideoStats.vReceiveSize;
                    leyVar.e = j4;
                    leyVar.c += (long) mMRtcRemoteVideoStats.videoFramerate;
                    j += j4;
                    leyVar.C++;
                }
                if (leyVar != null) {
                    leyVar.d = leyVar.e + leyVar.f;
                }
                j2 = j2;
            }
            if (z && z2) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.q++;
            }
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.l = j2;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.k = j;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.j = j2 + j;
            m327b(MoMoRtcPushFilter.this.f73Q0);
            if (MoMoRtcPushFilter.this.f76R0 == null) {
                MoMoRtcPushFilter.this.f76R0 = new IMMRtcEngineEventInterface.LocalVideoStats();
            }
            MoMoRtcPushFilter.this.f76R0.sentFrameRate = mMRtcStats.videoStats.videoFramerate;
            MoMoRtcPushFilter.this.f76R0.sentBitrate = mMRtcStats.videoStats.videoBitrate;
            m326a(MoMoRtcPushFilter.this.f76R0);
            MoMoRtcPushFilter.this.f70P0 = mMRtcStats;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.H = MoMoRtcPushFilter.this.f70P0.videoStats.vEncodeCount;
            ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.B = MoMoRtcPushFilter.this.f70P0.txBytes;
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            moMoRtcPushFilter.f52J0 = moMoRtcPushFilter.f70P0.videoStats.vEncodeSize;
            MoMoRtcPushFilter moMoRtcPushFilter2 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter2.f61M0 = moMoRtcPushFilter2.f70P0.audioStats.aEncodeSize;
            MoMoRtcPushFilter moMoRtcPushFilter3 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter3.f64N0 = moMoRtcPushFilter3.f70P0.audioStats.aSendSize;
            MoMoRtcPushFilter moMoRtcPushFilter4 = MoMoRtcPushFilter.this;
            moMoRtcPushFilter4.f67O0 = moMoRtcPushFilter4.f70P0.videoStats.vSendSize;
            MoMoRtcPushFilter.this.f118h1.g(4098, 0, 0, MoMoRtcPushFilter.this);
            MoMoRtcPushFilter.m69Z3(MoMoRtcPushFilter.this);
        }

        public void onStreamInjectedStatus(String str, int i, int i2) {
        }

        public void onStreamMessage(int i, int i2, String str) {
            if (MoMoRtcPushFilter.this.f97X1 != null) {
                MoMoRtcPushFilter.this.f97X1.onStreamMessage(i, i2, str.getBytes());
            }
        }

        public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
            if (MoMoRtcPushFilter.this.f97X1 != null) {
                MoMoRtcPushFilter.this.f97X1.onStreamMessageError(i, i2, i3, i4, i5);
            }
        }

        public void onStreamPublished(String str, int i) {
            synchronized (MoMoRtcPushFilter.this.f29A1) {
                if (i == 0) {
                    try {
                        MoMoRtcPushFilter.this.f156z1 = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public void onStreamUnpublished(String str) {
            ii70.d().c("MoMoRtcPushFilter", "onStreamPublished finish:url=" + str);
            synchronized (MoMoRtcPushFilter.this.f29A1) {
                MoMoRtcPushFilter.this.f156z1 = false;
            }
            synchronized (MoMoRtcPushFilter.this.f146u1) {
                try {
                    if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.a0 != null && !MoMoRtcPushFilter.this.f60L2 && !MoMoRtcPushFilter.this.f39E2) {
                        ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.B(((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.a0, ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.x);
                        MoMoRtcPushFilter.this.f86U.addPublishStreamUrl(((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.a0, true);
                        MoMoRtcPushFilter.this.f118h1.g(12308, 0, 0, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void onTokenPrivilegeWillExpire(String str) {
            if (MoMoRtcPushFilter.this.f100Y1 != null) {
                MoMoRtcPushFilter.this.f100Y1.onTokenPrivilegeWillExpire(str);
            }
        }

        public void onTranscodingUpdated() {
        }

        public void onUserEnableLocalVideo(int i, boolean z) {
        }

        public void onUserEnableVideo(int i, boolean z) {
        }

        public void onUserJoined(int i, int i2) {
            Log.e("unint", "onUserJoined uid=" + i);
            try {
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                if (moMoRtcPushFilter.a2(moMoRtcPushFilter.W1())) {
                    ii70.d().a("MoMoRtcPushFilter", "onMemberEnter:##### setSpeakerphoneOn(false)");
                    if (MoMoRtcPushFilter.this.f86U != null) {
                        fjx.R().D();
                    }
                } else {
                    ii70.d().a("MoMoRtcPushFilter", "onMemberEnter:##### setSpeakerphoneOn(true)");
                    if (MoMoRtcPushFilter.this.f86U != null) {
                        fjx.R().D();
                    }
                }
            } catch (Exception unused) {
            }
            long j = i;
            a9y a9yVar = new a9y(j, "S".equals(MoMoRtcPushFilter.this.m314w1()) ? 1 : 2);
            MoMoRtcPushFilter.this.f84T0.put(Long.valueOf(j), a9yVar);
            if (((MediaBaseCodecFilter) MoMoRtcPushFilter.this).H.c1 == 1) {
                ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.e(true, a9yVar.c(), j, 0L, 0L);
            }
            ii70.d().c("MoMoRtcPushFilter", getClass().getSimpleName() + " onUserJoined:uid:" + i + ",elapsed:" + i2);
            if ((MoMoRtcPushFilter.this.f154y1 || MoMoRtcPushFilter.this.f152x1) && MoMoRtcPushFilter.this.f136p1.f3962i1 != i) {
                a9yVar.f(true);
                a9yVar.g(true);
                if (MoMoRtcPushFilter.this.f144t1 == 1) {
                    ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.c(true, a9yVar.c(), j, 0L, 0L, 0L);
                }
                MoMoRtcPushFilter.this.f118h1.g(8198, i, 0, MoMoRtcPushFilter.this);
                MoMoRtcPushFilter.this.f42F2.post(new b(i));
            }
            MoMoRtcPushFilter.this.f80S0.put(Long.valueOf(j), new ley(j));
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onJoinChannelSuccess("", j, i2);
            }
        }

        public void onUserMuteAudio(int i, boolean z) {
            ii70.d().c("MoMoRtcPushFilter", "onUserMuteAudiouid:" + i + ",muted:" + z);
            ley leyVar = (ley) MoMoRtcPushFilter.this.f80S0.get(Long.valueOf((long) i));
            if (leyVar != null) {
                leyVar.g(z);
            }
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onUserMuteAudio(i, z);
            }
        }

        public void onUserMuteVideo(int i, boolean z) {
            ii70.d().c("MoMoRtcPushFilter", "onUserMuteVideouid:" + i + ",muted:" + z);
            ley leyVar = (ley) MoMoRtcPushFilter.this.f80S0.get(Long.valueOf((long) i));
            if (leyVar != null) {
                leyVar.h(z);
            }
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onUserMuteVideo(i, z);
            }
        }

        public void onUserOffline(int i, int i2) {
            Log.e("unint", "onUserOffline uid=" + i);
            long j = 0;
            if (MoMoRtcPushFilter.this.f80S0 != null) {
                long j2 = i;
                if (MoMoRtcPushFilter.this.f80S0.containsKey(Long.valueOf(j2))) {
                    ley leyVar = (ley) MoMoRtcPushFilter.this.f80S0.get(Long.valueOf(j2));
                    j = leyVar != null ? leyVar.d : 0L;
                    MoMoRtcPushFilter.this.f80S0.remove(Long.valueOf(j2));
                }
            }
            long j3 = j;
            if (MoMoRtcPushFilter.this.f84T0 != null) {
                long j4 = i;
                if (MoMoRtcPushFilter.this.f84T0.containsKey(Long.valueOf(j4))) {
                    n8c.a("zhengjijian", "onMemberExit userid " + i + " reason " + i2);
                    if (MoMoRtcPushFilter.this.f144t1 == 1) {
                        ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.d(true, ((a9y) MoMoRtcPushFilter.this.f84T0.get(Long.valueOf(j4))).c(), j4, i2);
                        ((MediaBaseCodecFilter) MoMoRtcPushFilter.this).I.f(true, ((a9y) MoMoRtcPushFilter.this.f84T0.get(Long.valueOf(j4))).c(), j3, 0L, j4, i2);
                    }
                    MoMoRtcPushFilter.this.f118h1.g(8199, i, 0, MoMoRtcPushFilter.this);
                }
            }
            if (MoMoRtcPushFilter.this.f104a1 != null && (!MoMoRtcPushFilter.this.f123j2 || MoMoRtcPushFilter.this.f154y1 || MoMoRtcPushFilter.this.f152x1)) {
                ii70.d().c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelRemove userID=" + i);
                MoMoRtcPushFilter.this.f104a1.b((long) i, i2);
            }
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onUserOffline(i, i2);
            }
            if (MoMoRtcPushFilter.this.f31B1 != null && (MoMoRtcPushFilter.this.f31B1.containsKey(Integer.valueOf(i)) || i == ((vlw) MoMoRtcPushFilter.this.f136p1).B0)) {
                if (i != ((vlw) MoMoRtcPushFilter.this.f136p1).B0) {
                    MoMoRtcPushFilter.this.f31B1.remove(Integer.valueOf(i));
                }
                boolean z = MoMoRtcPushFilter.this.f123j2;
                MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
                if (z) {
                    if (moMoRtcPushFilter.f106b1 != null) {
                        ii70.d().c("MoMoRtcPushFilter", getClass().getSimpleName() + "----onVideoChannelRemoveExt userID=" + i);
                        MoMoRtcPushFilter.this.f106b1.b((long) i, i2);
                    }
                } else if (moMoRtcPushFilter.f108c1 != null) {
                    MoMoRtcPushFilter.this.f108c1.b(i, i2);
                }
            }
            synchronized (MoMoRtcPushFilter.this.f34C2) {
                try {
                    SurfaceViewRenderer surfaceViewRenderer = (SurfaceViewRenderer) MoMoRtcPushFilter.this.f34C2.remove(Integer.valueOf(i));
                    if (surfaceViewRenderer != null) {
                        surfaceViewRenderer.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void onVideoSizeChanged(int i, int i2, int i3) {
            if (MoMoRtcPushFilter.this.f155y2 != null) {
                MoMoRtcPushFilter.this.f155y2.m9332r(i, i2, i3);
            }
        }

        public void onVideoStopped() {
        }

        public void onWarning(int i) {
            ii70.d().c("MoMoRtcPushFilter", "onWarning" + i);
            if (i == 701) {
                MoMoRtcPushFilter.this.m30I6(null, -1, 0);
            }
            if (MoMoRtcPushFilter.this.f94W1 != null) {
                MoMoRtcPushFilter.this.f94W1.onWarning(i);
            }
        }

        @NonNull
        public String toString() {
            return super.toString();
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$d */
    public class RunnableC0004d implements Runnable {
        public RunnableC0004d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MoMoRtcPushFilter.this.f150w1 != null) {
                MoMoRtcPushFilter.this.f150w1.release();
                MoMoRtcPushFilter.this.f150w1 = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$e */
    public class RunnableC0005e implements Runnable {
        public RunnableC0005e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = MoMoRtcPushFilter.this.f136p1.f3961h1;
            MoMoRtcPushFilter moMoRtcPushFilter = MoMoRtcPushFilter.this;
            if (z) {
                moMoRtcPushFilter.f118h1.g(4353, 201, 0, MoMoRtcPushFilter.this);
                MoMoRtcPushFilter.this.e2(4353, 201);
            } else {
                IMMRtcEngineEventInterface iMMRtcEngineEventInterface = moMoRtcPushFilter.f77R1;
                if (iMMRtcEngineEventInterface != null) {
                    iMMRtcEngineEventInterface.onUserOffline(((vlw) moMoRtcPushFilter.f136p1).B0, 201);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.momo.piplineext.codec.MoMoRtcPushFilter$f */
    public class C0006f extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f181a;

        public C0006f(String str) {
            super(str);
            this.f181a = false;
        }

        /* JADX INFO: renamed from: a */
        public void m330a() {
            this.f181a = true;
            ii70.d().c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f181a) {
                try {
                    Thread.sleep(66L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ztk.f == null) {
                    ztk.f = new byte[((((ulw) MoMoRtcPushFilter.this.f136p1).m * ((ulw) MoMoRtcPushFilter.this.f136p1).n) * 3) / 2];
                }
                MoMoRtcPushFilter.this.m293o1(ByteBuffer.wrap(ztk.f));
            }
        }
    }

    @RequiresApi(api = 15)
    public MoMoRtcPushFilter(Context context, yw00 yw00Var, hu00.a aVar, vlw vlwVar) {
        super(context);
        this.f79S = "MoMoRtcPushFilter";
        this.f83T = true;
        this.f89V = -1;
        this.f95X = false;
        this.f98Y = false;
        this.f101Z = false;
        this.f124k0 = 0;
        this.f135p0 = 0;
        this.f37E0 = false;
        this.f40F0 = true;
        this.f43G0 = null;
        this.f52J0 = 0L;
        this.f55K0 = 0;
        this.f58L0 = 0;
        this.f61M0 = 0L;
        this.f64N0 = 0L;
        this.f67O0 = 0L;
        this.f80S0 = new PipelineConcurrentHashMap<>();
        this.f84T0 = new PipelineConcurrentHashMap<>();
        this.f87U0 = false;
        this.f90V0 = true;
        this.f93W0 = 0;
        this.f96X0 = 0;
        this.f99Y0 = 0;
        this.f102Z0 = "1e6127d73cd4d405905aa6f2ad5e1a67";
        this.f104a1 = null;
        this.f106b1 = null;
        this.f108c1 = null;
        this.f110d1 = null;
        this.f114f1 = false;
        this.f116g1 = false;
        this.f120i1 = 1.8f;
        this.f122j1 = 1.0f;
        this.f125k1 = 44100;
        this.f127l1 = 0;
        this.f129m1 = 0;
        this.f131n1 = 0;
        this.f133o1 = 0;
        this.f138q1 = -1;
        this.f142s1 = null;
        this.f144t1 = 1;
        this.f146u1 = new Object();
        this.f148v1 = 0;
        this.f152x1 = false;
        this.f154y1 = false;
        this.f156z1 = false;
        this.f29A1 = new Object();
        this.f31B1 = new PipelineConcurrentHashMap();
        this.f33C1 = false;
        this.f41F1 = null;
        this.f47H1 = 0;
        this.f50I1 = 750000;
        this.f53J1 = "";
        this.f56K1 = false;
        this.f59L1 = false;
        this.f62M1 = false;
        this.f65N1 = 0.0f;
        this.f68O1 = 0.0f;
        this.f71P1 = 0.0f;
        this.f74Q1 = 0.0f;
        this.f81S1 = null;
        this.f85T1 = null;
        this.f107b2 = null;
        this.f113e2 = new zmw();
        this.f115f2 = new zmw();
        this.f117g2 = new jjw();
        this.f119h2 = new vmw();
        this.f123j2 = false;
        this.f126k2 = false;
        this.f128l2 = true;
        this.f130m2 = false;
        this.f132n2 = null;
        this.f134o2 = false;
        this.f141r2 = "";
        this.f143s2 = 15;
        this.f145t2 = 0L;
        this.f147u2 = null;
        this.f149v2 = null;
        this.f151w2 = ByteBuffer.allocate(8192);
        this.f153x2 = ByteBuffer.allocate(8192);
        this.f30A2 = null;
        this.f32B2 = null;
        this.f34C2 = new ArrayMap();
        this.f36D2 = null;
        this.f39E2 = false;
        this.f42F2 = new Handler(Looper.getMainLooper());
        this.f45G2 = false;
        this.f48H2 = false;
        this.f54J2 = 0;
        this.f57K2 = 0;
        this.f60L2 = false;
        this.f63M2 = false;
        this.f66N2 = 0L;
        this.f69O2 = false;
        this.f72P2 = 0;
        this.f75Q2 = false;
        this.f78R2 = false;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.momo.piplineext.codec.MoMoRtcPushFilter.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent.getAction().equals("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                    if (intent.getIntExtra("state", 0) == 0) {
                        if (MoMoRtcPushFilter.this.f86U == null || true != fjx.R().D()) {
                            return;
                        }
                        MoMoRtcPushFilter.this.f86U.setParameters("{\"che.audio.enable.ns\":true}");
                        return;
                    }
                    if (intent.getIntExtra("state", 0) == 1 && MoMoRtcPushFilter.this.f86U != null && true == fjx.R().D()) {
                        MoMoRtcPushFilter.this.f86U.setParameters("{\"che.audio.enable.ns\":false}");
                    }
                }
            }
        };
        this.f82S2 = broadcastReceiver;
        ContextUtils.initialize(context);
        this.f46H0 = yw00Var;
        this.f136p1 = (qmr) vlwVar;
        this.f87U0 = false;
        this.f90V0 = true;
        this.f118h1 = aVar;
        m102m5(vlwVar);
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.d = 260L;
        zmxVar.e1 = String.valueOf(hashCode());
        ((MediaBaseCodecFilter) this).H.f1 = 1L;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        if (context != null) {
            ii5.l(context, broadcastReceiver, intentFilter);
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"MoMoRtcPushFilter", this.f86U});
    }

    /* JADX INFO: renamed from: B5 */
    private int m6B5() {
        int i = 0;
        if (!this.f154y1 && !this.f45G2) {
            i = 1;
        }
        return i ^ 1;
    }

    /* JADX INFO: renamed from: C5 */
    private final void m10C5(String str, int i, String str2, String str3) {
        if (this.f86U != null) {
            ((MediaBaseCodecFilter) this).H.C0 = m107o5(this.f124k0);
            int iU0 = fjx.R().u0();
            if (iU0 == 0) {
                this.f86U.setAudioProfile(0, 4);
            } else if (iU0 == 1) {
                this.f86U.setAudioProfile(4, 3);
            } else if (iU0 == 2 || iU0 == 3) {
                this.f86U.setAudioProfile(5, 3);
            } else {
                MMRtcEngine mMRtcEngine = this.f86U;
                if (iU0 != 4) {
                    mMRtcEngine.setAudioProfile(0, 4);
                } else {
                    mMRtcEngine.setSteroAudioCapture(true);
                    this.f86U.setAudioProfile(5, 3);
                }
            }
            if (!this.f59L1) {
                fjx.R().v0();
            }
            m281l5(this.f40F0);
            this.f114f1 = false;
            this.f86U.registerAudioFrameObserver((IAudioFrameObserver) null);
            if (this.f152x1 || this.f123j2 || this.f126k2 || this.f112e1 != null) {
                this.f86U.registerAudioFrameObserver(this);
                this.f114f1 = true;
            }
            if (this.f140r1) {
                m14D5(GiftLogEvent.EVENT_ID_PLAY_SUCCESS);
            }
            m34J6();
            MMRtcEngine mMRtcEngine2 = this.f86U;
            if (mMRtcEngine2 != null && this.f128l2) {
                mMRtcEngine2.setDefaultAudioRoutetoSpeakerphone(true);
            }
            qmr qmrVar = this.f136p1;
            int i2 = ((ulw) qmrVar).k;
            if (i2 > 0) {
                m82d5(qmrVar.f3961h1, i2, ((ulw) qmrVar).l, this.f50I1, 15, ((vlw) qmrVar).v0);
            } else {
                m82d5(qmrVar.f3961h1, ((ulw) qmrVar).s, ((ulw) qmrVar).t, this.f50I1, 15, ((vlw) qmrVar).v0);
            }
            Log.e("MoMoRtcPushFilter", "zhangjialiang joinChannel############# begin");
            this.f86U.enableMiddleGroundSignal(this.f62M1);
            Log.e("MoMoRtcPushFilter", "joinChannel#############" + this.f86U.joinChannel(this.f142s1, str, (String) null, i, str2, str3, this.f30A2, TextUtils.isEmpty(this.f32B2) ? 0L : Long.parseLong(this.f32B2)));
            this.f140r1 = true;
            this.f86U.setAudioLevel(iU0);
            m321y6(1.0f);
        }
    }

    /* JADX INFO: renamed from: D5 */
    private final void m14D5(String str) {
        ii70.d().c("MoMoRtcPushFilter", "leaveChannel >>>>>" + str);
        synchronized (this.f146u1) {
            try {
                if (this.f86U != null) {
                    String str2 = ((MediaBaseCodecFilter) this).s.v0;
                    if (str2 != null && !TextUtils.isEmpty(str2)) {
                        this.f86U.removePublishStreamUrl(((MediaBaseCodecFilter) this).s.v0);
                    }
                    Log.e("unint", "leaveChannel behin 2431");
                    this.f86U.leaveChannel();
                    Log.e("unint", "leaveChannel end 2433");
                    this.f86U.registerAudioFrameObserver((IAudioFrameObserver) null);
                    this.f114f1 = false;
                }
                this.f140r1 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f136p1.f3958e1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I6 */
    public void m30I6(Object obj, int i, int i2) {
        za1 za1VarM346C2;
        u3m u3mVar = ((MediaBaseCodecFilter) this).K;
        if (u3mVar == null || (za1VarM346C2 = ((ExtAudioWrapper) u3mVar).m346C2()) == null) {
            return;
        }
        za1VarM346C2.a(obj, i, i2);
    }

    /* JADX INFO: renamed from: J6 */
    private void m34J6() {
        if (this.f136p1 == null) {
            return;
        }
        ii70.d().c("MoMoRtcPushFilter", "setVideoProfileEx1 bitrate:" + ((ulw) this.f136p1).m + "<>" + ((ulw) this.f136p1).n + "<>" + ((ulw) this.f136p1).H + "<mergecanvasWidth>" + ((ulw) this.f136p1).k);
        m281l5(this.f40F0);
        if (this.f154y1) {
            return;
        }
        this.f86U.setParameters("{\"che.video.keyFrameInterval\":1}");
        qmr qmrVar = this.f136p1;
        if (((vlw) qmrVar).F0 && qmrVar.d() == 1) {
            MMRtcEngine mMRtcEngine = this.f86U;
            qmr qmrVar2 = this.f136p1;
            mMRtcEngine.setVideoProfile(((ulw) qmrVar2).n, ((ulw) qmrVar2).m, this.f143s2, ((ulw) qmrVar2).H);
        } else {
            MMRtcEngine mMRtcEngine2 = this.f86U;
            qmr qmrVar3 = this.f136p1;
            mMRtcEngine2.setVideoProfile(((ulw) qmrVar3).m, ((ulw) qmrVar3).n, this.f143s2, ((ulw) qmrVar3).H);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ okw m35K2(MoMoRtcPushFilter moMoRtcPushFilter) {
        moMoRtcPushFilter.getClass();
        return null;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ int m36K3(MoMoRtcPushFilter moMoRtcPushFilter) {
        int i = moMoRtcPushFilter.f93W0;
        moMoRtcPushFilter.f93W0 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N5 */
    public void m43N5() {
        if (((MediaBaseCodecFilter) this).H.c == 0) {
            ii70.d().c("MoMoRtcPushFilter", "AGORA_PUBLISHING");
            this.f118h1.g(4103, 0, 0, this);
            ((MediaBaseCodecFilter) this).H.c = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: O5 */
    private void m46O5(byte[] bArr, byte[] bArr2) {
        Handler handler;
        long j = ((vlw) this.f136p1).B0;
        if (this.f110d1 == null || (handler = this.f42F2) == null) {
            return;
        }
        handler.post(new RunnableC0001a(bArr, bArr2, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V5 */
    public void m61V5(int i) {
        this.f118h1.g(8197, i, 0, this);
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ anw m69Z3(MoMoRtcPushFilter moMoRtcPushFilter) {
        moMoRtcPushFilter.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z6 */
    public void m70Z6(int i, String str) {
        String str2;
        switch (i) {
            case 11:
                str2 = f1U2;
                break;
            case 12:
                str2 = f2V2;
                break;
            case 13:
                str2 = f3W2;
                break;
            case 14:
                str2 = f4X2;
                break;
            case 15:
                str2 = f5Y2;
                break;
            case 16:
                str2 = f6Z2;
                break;
            case 17:
                str2 = f7a3;
                break;
            case 18:
                str2 = f8b3;
                break;
            case 19:
                str2 = f9c3;
                break;
            case 20:
                str2 = f10d3;
                break;
            case 21:
                str2 = f11e3;
                break;
            case 22:
                str2 = f12f3;
                break;
            case 23:
                str2 = f13g3;
                break;
            case 24:
                str2 = f14h3;
                break;
            case 25:
                str2 = f15i3;
                break;
            case 26:
                str2 = f16j3;
                break;
            case 27:
                str2 = f17k3;
                break;
            case 28:
                str2 = f18l3;
                break;
            case 29:
                str2 = f19m3;
                break;
            case 30:
                str2 = f20n3;
                break;
            case 31:
                str2 = f21o3;
                break;
            case LongLinkChatMessage.LiveChatMessage.SOURCE_FIELD_NUMBER /* 32 */:
                str2 = f22p3;
                break;
            case LongLinkChatMessage.LiveChatMessage.STARLIGHTHIERARCHY_FIELD_NUMBER /* 33 */:
                str2 = f23q3;
                break;
            case 34:
                str2 = f24r3;
                break;
            case 35:
                str2 = f25s3;
                break;
            case 36:
                str2 = f26t3;
                break;
            case 37:
                str2 = f27u3;
                break;
            case 38:
                str2 = f28v3;
                break;
            default:
                str2 = null;
                break;
        }
        if (str2 != null) {
            ((MediaBaseCodecFilter) this).I.r(str2, str);
        }
    }

    /* JADX INFO: renamed from: a7 */
    private void m73a7() {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setExternalVideoSource(true, this.f83T, true);
        }
    }

    /* JADX INFO: renamed from: b5 */
    private final void m76b5(int i, int i2) {
        qmr qmrVar = this.f136p1;
        qmrVar.f3958e1 = i;
        qmrVar.f3959f1 = i2;
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
        m73a7();
        if (this.f86U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"configEngine", Integer.valueOf(i), Integer.valueOf(i2)});
            this.f86U.setClientRole(i);
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m79c5(String str) {
        MMLiveTranscoding mMLiveTranscoding;
        try {
            if (this.f86U == null || (mMLiveTranscoding = this.f132n2) == null || mMLiveTranscoding.transcodingUserMap == null || !this.f95X || str == null || TextUtils.isEmpty(str) || this.f132n2.transcodingUserMap.size() <= 0) {
                return;
            }
            String string = "{canvas:{w:" + this.f132n2.width + ",h:" + this.f132n2.height + "conf:[";
            for (String str2 : this.f132n2.transcodingUserMap.keySet()) {
                MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser = (MMLiveTranscoding.MMLiveTranscodingUser) this.f132n2.transcodingUserMap.get(str2);
                ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "llcqxl:<<<<<<<<<,uid:" + str2 + ",uid:" + mMLiveTranscodingUser.uid + ",x:" + mMLiveTranscodingUser.posx + ",y:" + mMLiveTranscodingUser.posy + ",width:" + mMLiveTranscodingUser.width + ",height:" + mMLiveTranscodingUser.height + ",alpha:" + mMLiveTranscodingUser.alpha + ",zOrder:" + mMLiveTranscodingUser.zOrder + ">>>>>>>>>>");
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
            MMLiveTranscoding mMLiveTranscoding2 = this.f132n2;
            mMLiveTranscoding2.lowLatency = true;
            mMLiveTranscoding2.videoGop = 15;
            this.f86U.setLiveTranscoding(mMLiveTranscoding2);
            m46O5((string + "]").getBytes(), this.f132n2.transcodingExtraInfo.getBytes());
            if (!this.f141r2.equals(str)) {
                this.f141r2 = str.substring(0);
                this.f156z1 = false;
            }
            synchronized (this.f29A1) {
                try {
                    if (!this.f156z1 && !this.f39E2) {
                        this.f86U.addPublishStreamUrl(str, true);
                        this.f156z1 = true;
                        Log.e("MoMoRtcPushFilter", "zhangjialiang onStreamPublished addPublishStreamUrl:url=" + str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "addPublishStreamUrl configLiveTransCoding");
        } catch (Exception e) {
            Log.e("MoMoRtcPushFilter", "zhangjialiang configLiveTransCoding :" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public void m82d5(boolean z, int i, int i2, int i3, int i4, String str) {
        if (str == null) {
            str = "";
        }
        if (z) {
            if (this.f132n2 == null) {
                this.f132n2 = new MMLiveTranscoding();
            }
            int iR0 = fjx.R().r0();
            MMLiveTranscoding mMLiveTranscoding = this.f132n2;
            mMLiveTranscoding.width = i;
            mMLiveTranscoding.height = i2;
            mMLiveTranscoding.audioBitrate = iR0 == 0 ? 128000 : iR0 * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE;
            mMLiveTranscoding.audioChannels = 2;
            mMLiveTranscoding.audioSampleRate = MMLiveTranscoding.MMLiveAudioSampleRateType.MMLiveAudioSampleRateType44100;
            mMLiveTranscoding.videoBitrate = i3;
            mMLiveTranscoding.videoFramerate = i4;
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "config" + this.f132n2);
            m79c5(str);
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"tanscode_aBitrate", Integer.valueOf(iR0)});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f6 */
    public void m87f6() {
        for (int i = 0; i < 6; i++) {
            Matrix matrix = new Matrix();
            matrix.mapVectors(f0T2);
            qmr qmrVar = this.f136p1;
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(((ulw) qmrVar).m, ((ulw) qmrVar).n, VideoFrame.TextureBuffer.Type.RGB, ((ccj) this).texture_in, matrix, null, null, null);
            MMRtcEngine mMRtcEngine = this.f86U;
            if (mMRtcEngine != null) {
                if (this.f92W != null && !this.f45G2) {
                    mMRtcEngine.pushExternalVideoFrame(new VideoFrame(textureBufferImpl, 0, System.nanoTime()), (EglBase.Context) null);
                }
                n8c.c("MoMoRtcPushFilter", "zhangjialiang unint pushExternalVideoFrame");
            }
        }
    }

    /* JADX INFO: renamed from: m5 */
    private MMRtcEngine m102m5(vlw vlwVar) {
        ((MediaBaseCodecFilter) this).s = vlwVar;
        m282l6(((ulw) vlwVar).P);
        this.f37E0 = ((ulw) vlwVar).q;
        if (this.f86U == null) {
            this.f77R1 = new C0003c();
            try {
                String str = this.f102Z0;
                if (str == null || TextUtils.isEmpty(str)) {
                    this.f86U = MMRtcEngine.create(W1(), "1e6127d73cd4d405905aa6f2ad5e1a67", this.f77R1);
                } else {
                    this.f86U = MMRtcEngine.create(W1(), this.f102Z0, this.f77R1);
                }
                n8c.e("MoMoRtcPushFilter", "agora_sdk_ver: " + MMRtcEngine.getSdkVersion());
                this.f86U.setParameters("{\"rtc.log_filter\":34781}");
                this.f86U.setLogFile(this.f53J1);
                this.f86U.setLogFilter(15);
                this.f114f1 = false;
                this.f86U.registerAudioFrameObserver((IAudioFrameObserver) null);
                this.f86U.setRecordingAudioFrameParameters(this.f125k1, 1, 2, 1024);
                this.f86U.setPlaybackAudioFrameParameters(this.f125k1, 1, 0, 1024);
                this.f86U.setChannelProfile(1);
                this.f86U.enableDualStreamMode(this.f37E0);
                m281l5(this.f40F0);
            } catch (Exception unused) {
                throw new InvalidParameterException("RtcEngineEx.create error");
            }
        }
        vlw vlwVar2 = ((MediaBaseCodecFilter) this).s;
        if (vlwVar2 != null && ((ulw) vlwVar2).b0) {
            this.f83T = false;
        }
        return this.f86U;
    }

    /* JADX INFO: renamed from: o5 */
    private int m107o5(int i) {
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
            return ((ulw) this.f136p1).S;
        }
        return 192000;
    }

    /* JADX INFO: renamed from: p5 */
    private String m110p5() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.f80S0.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ley leyVar = (ley) ((Map.Entry) it.next()).getValue();
            if (i != 0) {
                sb.append(",");
            }
            sb.append(leyVar.b());
            i++;
            leyVar.e(leyVar.a(), leyVar.d());
        }
        if (i == 0) {
            sb.append("(0)");
        }
        sb.append("]");
        return sb.toString();
    }

    private void release() {
        ii70.d().c("MoMoRtcPushFilter", "MoMoRtcPushFilter release");
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"release"});
        this.f60L2 = true;
        this.f95X = false;
        synchronized (this.f146u1) {
            try {
                ((MediaBaseCodecFilter) this).H.a0 = null;
                if (this.f86U != null) {
                    ii70.d().c("MoMoRtcPushFilter", "release >>>>>");
                    this.f86U.registerAudioFrameObserver((IAudioFrameObserver) null);
                    this.f114f1 = false;
                    String str = ((MediaBaseCodecFilter) this).s.v0;
                    if (str != null && !TextUtils.isEmpty(str)) {
                        this.f86U.removePublishStreamUrl(((MediaBaseCodecFilter) this).s.v0);
                    }
                    Log.e("unint", "leaveChannel begin 2778");
                    this.f86U.leaveChannel();
                    Log.e("unint", "leaveChannel end 2480");
                    MMRtcEngine.destroy();
                    this.f86U = null;
                    this.f110d1 = null;
                    this.f95X = false;
                    l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                    ((MediaBaseCodecFilter) this).J = MomoCodec.MomoCodecState.STOP;
                    m251d2();
                    this.f118h1.g(4097, 0, 0, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wb1 wb1Var = this.f49I0;
        if (wb1Var != null) {
            wb1Var.f();
            this.f49I0 = null;
        }
        AudioResampleUtils audioResampleUtils = this.f147u2;
        if (audioResampleUtils != null) {
            audioResampleUtils.release();
            this.f147u2 = null;
        }
        AudioResampleUtils audioResampleUtils2 = this.f149v2;
        if (audioResampleUtils2 != null) {
            audioResampleUtils2.release();
            this.f149v2 = null;
        }
        this.f77R1 = null;
        this.f42F2.post(new RunnableC0004d());
    }

    /* JADX INFO: renamed from: s5 */
    private void m120s5(int i) {
        if (i > this.f151w2.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + this.f151w2.position());
            byteBufferAllocate.clear();
            if (this.f151w2.position() > 0) {
                byteBufferAllocate.put(this.f151w2.array(), 0, this.f151w2.position());
            }
            this.f151w2.clear();
            this.f151w2 = byteBufferAllocate;
        }
    }

    /* JADX INFO: renamed from: t5 */
    private void m124t5(int i) {
        if (i > this.f153x2.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + this.f153x2.position());
            byteBufferAllocate.clear();
            if (this.f153x2.position() > 0) {
                byteBufferAllocate.put(this.f153x2.array(), 0, this.f153x2.position());
            }
            this.f153x2.clear();
            this.f153x2 = byteBufferAllocate;
        }
    }

    /* JADX INFO: renamed from: v5 */
    private IMMRtcEngineEventInterface.LocalVideoStats m131v5() {
        return this.f76R0;
    }

    /* JADX INFO: renamed from: w5 */
    private IMMRtcEngineEventInterface.RemoteVideoStats m135w5() {
        return this.f73Q0;
    }

    /* JADX INFO: renamed from: x5 */
    private String m139x5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("ts")) {
                jSONObject.remove("ts");
            }
            jSONObject.put("ts", Y1());
            if (jSONObject.has("bType")) {
                jSONObject.remove("bType");
            }
            jSONObject.put("bType", ((MediaBaseCodecFilter) this).H.s);
            if (jSONObject.has("conf") && this.f152x1) {
                jSONObject.remove("conf");
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m146A() {
    }

    /* JADX INFO: renamed from: A0 */
    public int m147A0() {
        qmr qmrVar = this.f136p1;
        return ((ulw) qmrVar).k > 0 ? ((ulw) qmrVar).l : ((ulw) qmrVar).t;
    }

    /* JADX INFO: renamed from: A5 */
    public long m148A5() {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            return mMRtcEngine.getAudioMixingCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: A6 */
    public void m149A6(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.f44G1 = pcmdataavailablecallback;
        if (pcmdataavailablecallback != null) {
            m236Y5(true);
        } else {
            m236Y5(false);
        }
    }

    /* JADX INFO: renamed from: B6 */
    public void m150B6(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setRole", Integer.valueOf(i), Integer.valueOf(this.f99Y0)});
        this.f144t1 = i;
        if (this.f86U == null || this.f99Y0 != 1) {
            return;
        }
        this.f86U.setClientRole(this.f144t1);
    }

    /* JADX INFO: renamed from: C0 */
    public void m151C0() {
        m257f();
    }

    /* JADX INFO: renamed from: C1 */
    public void m152C1(String str) {
        n8c.c("zk", "setMergeSei");
        synchronized (this.f146u1) {
            try {
                this.f38E1 = str;
                m317x6(str);
                MMRtcEngine mMRtcEngine = this.f86U;
                if (mMRtcEngine != null) {
                    mMRtcEngine.setSei(m200P5());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C6 */
    public void m153C6(int i, boolean z) {
        this.f47H1 = i;
    }

    /* JADX INFO: renamed from: D0 */
    public long m154D0() {
        return 0L;
    }

    /* JADX INFO: renamed from: D1 */
    public String m155D1() {
        String str = ((MediaBaseCodecFilter) this).H.x;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: D6 */
    public void m156D6(int i) {
        this.f138q1 = i;
    }

    /* JADX INFO: renamed from: E0 */
    public void m157E0(dxl dxlVar) {
        ((MediaBaseCodecFilter) this).F = dxlVar;
    }

    /* JADX INFO: renamed from: E5 */
    public void m158E5(boolean z) {
        if (this.f86U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteAllRemoteAudioStream", Boolean.valueOf(z)});
            this.f86U.muteAllRemoteAudioStreams(z);
        }
    }

    /* JADX INFO: renamed from: E6 */
    public void m159E6(hgd0 hgd0Var) {
        this.f155y2 = hgd0Var;
    }

    /* JADX INFO: renamed from: F */
    public boolean m160F() {
        return this.f116g1;
    }

    /* JADX INFO: renamed from: F0 */
    public int m161F0() {
        return this.f131n1;
    }

    /* JADX INFO: renamed from: F1 */
    public long m162F1() {
        MMRtcStats mMRtcStats = this.f70P0;
        if (mMRtcStats != null) {
            return mMRtcStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F5 */
    public void m163F5(boolean z) {
        if (this.f86U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteAllRemoteVideoStream", Boolean.valueOf(z)});
            this.f86U.muteAllRemoteVideoStreams(z);
        }
    }

    /* JADX INFO: renamed from: F6 */
    public void m164F6(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        float f2 = f * 1.0f;
        this.f122j1 = f2;
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.adjustAudioMixingVolume(f2);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public long m165G0() {
        return 0L;
    }

    /* JADX INFO: renamed from: G5 */
    public void m166G5(boolean z) {
        this.f48H2 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalAudioStream", Boolean.valueOf(this.f136p1.f3961h1), Boolean.valueOf(z)});
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            if (this.f136p1.f3961h1) {
                mMRtcEngine.muteLocalAudioStream(z);
                return;
            }
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalAudioStream, isHost, mute:", Boolean.FALSE, Boolean.valueOf(z)});
            MMRtcEngine mMRtcEngine2 = this.f86U;
            if (z) {
                mMRtcEngine2.adjustRecordingSignalVolume(((int) this.f120i1) * 100);
            } else {
                mMRtcEngine2.adjustRecordingSignalVolume(((int) this.f120i1) * 100);
                this.f86U.muteLocalAudioStream(false);
            }
        }
    }

    /* JADX INFO: renamed from: G6 */
    public void m167G6(boolean z) {
        if (z) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "set Stream ReplaceMode");
        }
        this.f126k2 = z;
    }

    /* JADX INFO: renamed from: H0 */
    public void m168H0(boolean z) {
        this.f152x1 = z;
    }

    /* JADX INFO: renamed from: H5 */
    public void m169H5(boolean z) {
        this.f48H2 = z;
        if (this.f86U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalAudioStream", Boolean.valueOf(z)});
            this.f86U.muteLocalAudioStream(z);
        }
    }

    /* JADX INFO: renamed from: H6 */
    public void m170H6(int i) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setAudioMixingPosition(i);
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m171I1() {
        this.f116g1 = true;
    }

    /* JADX INFO: renamed from: I5 */
    public void m172I5(boolean z) {
        this.f45G2 = z;
        if (this.f86U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalVideoStream", Boolean.valueOf(z)});
            this.f86U.muteLocalVideoStream(z);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m173J(String str) {
        n8c.c("zk", "setSei" + this.f38E1);
        synchronized (this.f146u1) {
            try {
                this.f35D1 = str;
                if (TextUtils.isEmpty(this.f38E1)) {
                    m315w6(str);
                } else {
                    m317x6(this.f38E1);
                }
                MMRtcEngine mMRtcEngine = this.f86U;
                if (mMRtcEngine != null) {
                    mMRtcEngine.setSei(m200P5());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public long m174J0() {
        return 0L;
    }

    /* JADX INFO: renamed from: J5 */
    public void m175J5(long j, boolean z) {
        if (this.f86U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteRemoteAudioStream", Long.valueOf(j), Boolean.valueOf(z)});
            this.f86U.muteRemoteAudioStream((int) j, z);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public void m177K4(MRtcEventHandler mRtcEventHandler) {
        this.f94W1 = mRtcEventHandler;
    }

    /* JADX INFO: renamed from: K5 */
    public void m178K5(long j, boolean z) {
        if (this.f86U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteRemoteMsgStream", Long.valueOf(j), Boolean.valueOf(z)});
            this.f86U.muteRemoteMsgStream((int) j, z);
        }
    }

    /* JADX INFO: renamed from: K6 */
    public void m179K6(z1l0 z1l0Var) {
        this.f104a1 = z1l0Var;
    }

    /* JADX INFO: renamed from: L */
    public void m180L(sml.a aVar) {
        this.f112e1 = aVar;
    }

    /* JADX INFO: renamed from: L0 */
    public long m181L0() {
        return 0L;
    }

    /* JADX INFO: renamed from: L1 */
    public long m182L1() {
        return 0L;
    }

    /* JADX INFO: renamed from: L5 */
    public void m184L5(long j, boolean z) {
        if (this.f86U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteRemoteVideoStream", Long.valueOf(j), Boolean.valueOf(z)});
            this.f86U.muteRemoteVideoStream((int) j, z);
        }
    }

    /* JADX INFO: renamed from: L6 */
    public void m185L6(a2l0 a2l0Var) {
        this.f106b1 = a2l0Var;
    }

    /* JADX INFO: renamed from: M0 */
    public int m186M0() {
        return (int) ((MediaBaseCodecFilter) this).H.i;
    }

    /* JADX INFO: renamed from: M1 */
    public void m187M1() {
        TextureBufferImpl textureBufferImpl;
        MMRtcEngine mMRtcEngine;
        yw00 yw00Var = this.f46H0;
        if (yw00Var != null && this.f92W != yw00Var.l()) {
            this.f92W = this.f46H0.l();
        }
        EGLContext eGLContext = this.f92W;
        if (eGLContext != null && (mMRtcEngine = this.f86U) != null) {
            mMRtcEngine.updateSharedContext(eGLContext);
        }
        if (((ccj) this).texture_in == 0 || !this.f95X || this.f45G2) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.mapVectors(f0T2);
        qmr qmrVar = this.f136p1;
        if (((vlw) qmrVar).F0 && qmrVar.d() == 1) {
            qmr qmrVar2 = this.f136p1;
            textureBufferImpl = new TextureBufferImpl(((ulw) qmrVar2).n, ((ulw) qmrVar2).m, VideoFrame.TextureBuffer.Type.RGB, ((ccj) this).texture_in, matrix, null, null, null);
        } else {
            qmr qmrVar3 = this.f136p1;
            textureBufferImpl = new TextureBufferImpl(((ulw) qmrVar3).m, ((ulw) qmrVar3).n, VideoFrame.TextureBuffer.Type.RGB, ((ccj) this).texture_in, matrix, null, null, null);
        }
        synchronized (this.f146u1) {
            try {
                if (this.f86U != null && !this.f60L2) {
                    if (this.f92W != null) {
                        this.f86U.pushExternalVideoFrame(new VideoFrame(textureBufferImpl, 0, System.nanoTime()), (EglBase.Context) null);
                    }
                    n8c.c("MoMoRtcPushFilter", "zhangjialiang pushExternalVideoFrame");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        long j = zmxVar.E + 1;
        zmxVar.E = j;
        if (j >= 30 || this.f152x1) {
            m43N5();
            if (this.f66N2 <= 0) {
                this.f66N2 = System.currentTimeMillis();
            }
        }
        if (!this.f63M2 && ((MediaBaseCodecFilter) this).H.E >= 120) {
            ii70.d().c("MoMoRtcPushFilter", "Agora 推流成功 AGORA_RTMP_PUBLISHED");
            this.f63M2 = true;
            this.f118h1.g(4104, 0, 0, this);
        }
        if (this.f63M2 || this.f66N2 <= 0 || System.currentTimeMillis() - this.f66N2 <= 5000) {
            return;
        }
        this.f63M2 = true;
        this.f118h1.g(4104, 0, 0, this);
    }

    /* JADX INFO: renamed from: M4 */
    public void m188M4(MRtcAudioHandler mRtcAudioHandler) {
        this.f88U1 = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: M5 */
    public void m189M5(boolean z) {
        n8c.c("zk", "--ktv,muteSingerAudioStream:" + this.f130m2 + "-->" + z);
        this.f130m2 = z;
    }

    /* JADX INFO: renamed from: M6 */
    public void m190M6(String str) {
        if (this.f132n2 == null) {
            this.f132n2 = new MMLiveTranscoding();
        }
        m79c5(((vlw) this.f136p1).v0);
    }

    /* JADX INFO: renamed from: N0 */
    public long m191N0() {
        MMRtcStats mMRtcStats = this.f70P0;
        if (mMRtcStats != null) {
            return mMRtcStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N1 */
    public int m192N1() {
        return this.f55K0;
    }

    /* JADX INFO: renamed from: N4 */
    public void m193N4(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f91V1 = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: N6 */
    public void m194N6(int i, int i2, int i3, int i4) {
        this.f50I1 = i;
    }

    /* JADX INFO: renamed from: O0 */
    public long m195O0() {
        return this.f61M0;
    }

    /* JADX INFO: renamed from: O6 */
    public void m197O6(cbl0 cbl0Var) {
        this.f108c1 = cbl0Var;
    }

    /* JADX INFO: renamed from: P0 */
    public void m198P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
        this.f129m1 = i4;
        this.f131n1 = i2;
        this.f133o1 = i3;
    }

    /* JADX INFO: renamed from: P4 */
    public void m199P4(MRtcChannelHandler mRtcChannelHandler) {
        this.f97X1 = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: P5 */
    public byte[] m200P5() {
        byte[] bytes = "".getBytes();
        String str = this.f35D1;
        if (str != null) {
            return m139x5(str).getBytes();
        }
        String str2 = this.f38E1;
        return str2 != null ? str2.getBytes() : bytes;
    }

    /* JADX INFO: renamed from: P6 */
    public void m201P6(boolean z) {
        if (z) {
            this.f86U.registerAudioFrameObserver((IAudioFrameObserver) null);
            this.f86U.registerAudioFrameObserver(this);
            this.f114f1 = true;
        } else {
            if (this.f112e1 != null || this.f78R2) {
                return;
            }
            this.f86U.registerAudioFrameObserver((IAudioFrameObserver) null);
            this.f114f1 = false;
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public int m202Q0() {
        return this.f95X ? m303r5() : m310u5();
    }

    /* JADX INFO: renamed from: Q4 */
    public void m203Q4(MRtcConnectHandler mRtcConnectHandler) {
        this.f109c2 = mRtcConnectHandler;
    }

    /* JADX INFO: renamed from: Q5 */
    public void m204Q5() {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.pauseAllEffects();
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public void m205Q6(int i, double d) {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.setVolumeOfEffect(i, ((float) d) * 100.0f);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m206R0(vlw vlwVar, EGLContext eGLContext) {
        int i = this.f144t1;
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        if (i == 1) {
            zmxVar.B0 = "M".equals(m314w1()) ? "MrtcMaster" : "MrtcSlaver";
        } else {
            zmxVar.B0 = "MrtcAudience";
        }
        super.R0(vlwVar, eGLContext);
        if (((ulw) vlwVar).b0 && !this.f45G2 && !this.f154y1 && this.f121i2 == null) {
            C0006f c0006f = new C0006f("live-media-aFFrame");
            this.f121i2 = c0006f;
            c0006f.start();
        }
        int i2 = vlwVar.E0;
        this.f143s2 = i2;
        if (i2 <= 0 || i2 > 30) {
            Log.e("unint", "error maxFps=" + this.f143s2);
            this.f143s2 = 30;
        }
        if (!(vlwVar instanceof qmr)) {
            throw new InvalidParameterException("Parameters error");
        }
        ii70 ii70VarD = ii70.d();
        StringBuilder sb = new StringBuilder("videoWidth:");
        sb.append(((ulw) vlwVar).s);
        sb.append(",videoHeight:");
        sb.append(((ulw) vlwVar).t);
        sb.append(",visualWidth:");
        sb.append(((ulw) vlwVar).u);
        sb.append(",visualHeight:");
        sb.append(((ulw) vlwVar).v);
        sb.append(",encodeWidth:");
        sb.append(((ulw) vlwVar).m);
        sb.append(",encodeHeight:");
        sb.append(((ulw) vlwVar).n);
        sb.append(",videoBitrate:");
        sb.append(((ulw) vlwVar).H);
        sb.append(",audioBitrate:");
        sb.append(((ulw) vlwVar).S);
        sb.append(",videoFPS:");
        sb.append(((ulw) vlwVar).F);
        sb.append(",codecFPS:");
        sb.append(vlwVar.E0);
        sb.append(",mergeCanvasWidth:");
        qmr qmrVar = (qmr) vlwVar;
        sb.append(((ulw) qmrVar).k);
        sb.append(",mergeCanvasHeight:");
        sb.append(((ulw) qmrVar).l);
        sb.append(",codecFPS:");
        sb.append(vlwVar.E0);
        sb.append(",isHard:");
        sb.append(vlwVar.A0);
        ii70VarD.c("MoMoRtcPushFilter", sb.toString());
        this.f136p1 = qmrVar;
        if (this.f99Y0 == 1) {
            return;
        }
        if (vlwVar.A0 == MomoPipeline.DecodeType.SOFT_DECODE || ((ulw) qmrVar).b0) {
            this.f83T = false;
        }
        this.f49I0 = new wb1();
        yw00 yw00Var = this.f46H0;
        if (yw00Var != null) {
            this.f92W = yw00Var.l();
        }
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setRobustSignal(fjx.R().F() == 1);
        }
        this.f60L2 = false;
        this.f156z1 = false;
        this.f63M2 = false;
        if (1 == fjx.R().C()) {
            m269h6(true);
        }
        synchronized (this.f146u1) {
            try {
                m76b5(this.f144t1, 33);
                MMRtcEngine mMRtcEngine2 = this.f86U;
                if (mMRtcEngine2 != null) {
                    mMRtcEngine2.setExpandCartonParams(fjx.R().q0(), fjx.R().M());
                }
                dix.d dVarH = dix.d().h(this.f157z2.b());
                String str = "";
                String str2 = "";
                if (dVarH != null) {
                    str = dVarH.a;
                    str2 = dVarH.b;
                }
                qmr qmrVar2 = this.f136p1;
                m10C5(qmrVar2.f3960g1, ((vlw) qmrVar2).B0, str, str2);
                ii70.d().c("momortc", "setChannalName:" + this.f136p1.f3960g1);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f99Y0 = 1;
        st0.g().p(W1(), st0.f);
        ((MediaBaseCodecFilter) this).H.d1 = vlwVar.d();
        zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
        zmxVar2.b1 = ((ulw) vlwVar).b0 ? 1L : 0L;
        zmxVar2.x = vlwVar.v0;
        int i3 = ((ulw) vlwVar).H;
        this.f54J2 = i3;
        this.f57K2 = vlwVar.E0;
        qmr qmrVar3 = this.f136p1;
        zmxVar2.W = ((vlw) qmrVar3).B0;
        zmxVar2.X = qmrVar3.f3960g1;
        zmxVar2.F0 = i3;
        if (this.f86U != null) {
            zmxVar2.p = MMRtcEngine.getSdkVersion();
        }
        ((MediaBaseCodecFilter) this).H.e = System.currentTimeMillis();
        ((MediaBaseCodecFilter) this).H.f = System.currentTimeMillis();
        ((MediaBaseCodecFilter) this).H.F0 = ((ulw) vlwVar).H;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"startRecord", Integer.valueOf(this.f144t1)});
    }

    /* JADX INFO: renamed from: R4 */
    public void m207R4(ymw ymwVar) {
        this.f103Z1 = ymwVar;
    }

    /* JADX INFO: renamed from: R5 */
    public void m208R5(int i) {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.pauseEffect(i);
        }
    }

    /* JADX INFO: renamed from: R6 */
    public void m209R6() {
        this.f78R2 = true;
        if (this.f114f1) {
            return;
        }
        this.f86U.registerAudioFrameObserver((IAudioFrameObserver) null);
        this.f86U.registerAudioFrameObserver(this);
    }

    /* JADX INFO: renamed from: S0 */
    public void m210S0(eix eixVar) {
        super.S0(eixVar);
        this.f157z2 = eixVar;
    }

    /* JADX INFO: renamed from: S4 */
    public void m211S4(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        this.f111d2 = mRtcClientRoleChangedHandler;
    }

    /* JADX INFO: renamed from: S5 */
    public void m212S5() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pauseRecording"});
        ii70.d().c("MoMoRtcPushFilter", "pauseRecording");
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.muteLocalAudioStream(true);
        }
        RunnableC0005e runnableC0005e = new RunnableC0005e();
        this.f81S1 = runnableC0005e;
        this.f42F2.postDelayed(runnableC0005e, 30000L);
    }

    /* JADX INFO: renamed from: S6 */
    public void m213S6(String str) {
        ii70.d().c("MoMoRtcPushFilter", "startSurroundMusic");
        if (this.f33C1) {
            return;
        }
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.startAudioMixing(str, false, false, 1L);
            this.f86U.adjustAudioMixingVolume(this.f122j1);
            this.f33C1 = true;
        }
        m30I6(null, 1, 0);
    }

    /* JADX INFO: renamed from: T0 */
    public int m214T0() {
        return 0;
    }

    /* JADX INFO: renamed from: T4 */
    public void m215T4(MRtcPusherHandler mRtcPusherHandler) {
        this.f51I2 = mRtcPusherHandler;
    }

    /* JADX INFO: renamed from: T5 */
    public void m216T5() {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.pauseAudioMixing();
        }
    }

    /* JADX INFO: renamed from: T6 */
    public void m217T6(String str, boolean z, boolean z2, int i) {
        if (this.f33C1) {
            return;
        }
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.startAudioMixing(str, z, z2, i);
            this.f86U.adjustAudioMixingVolume(this.f122j1);
            this.f33C1 = true;
        }
        m30I6(null, 1, 0);
    }

    /* JADX INFO: renamed from: U4 */
    public void m218U4(MRtcQualityHandler mRtcQualityHandler) {
        this.f105a2 = mRtcQualityHandler;
    }

    /* JADX INFO: renamed from: U5 */
    public boolean m219U5(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.playEffect(i, str, i2, d, d3, d2 * 100.0d, !z);
        }
        return true;
    }

    /* JADX INFO: renamed from: U6 */
    public void m220U6() {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.stopAllEffects();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public long m221V0() {
        return 0L;
    }

    /* JADX INFO: renamed from: V4 */
    public void m222V4(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f107b2 = mRtcReceiveSeiHandler;
    }

    /* JADX INFO: renamed from: V6 */
    public void m223V6(int i) {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.stopEffect(i);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public int m224W0() {
        return this.f58L0;
    }

    /* JADX INFO: renamed from: W5 */
    public void m226W5() {
        ((MediaBaseCodecFilter) this).H.r = m110p5();
        MMRtcStats mMRtcStats = this.f70P0;
        if (mMRtcStats == null || mMRtcStats.remoteStats.size() <= 0 || ((MMRtcRemoteStats) this.f70P0.remoteStats.get(0)).AudioStats == null) {
            zmx zmxVar = ((MediaBaseCodecFilter) this).H;
            zmxVar.f0 = 0L;
            zmxVar.h0 = 0L;
        } else {
            zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
            zmxVar2.g0 += zmxVar2.f0;
            zmxVar2.i0 += zmxVar2.h0;
            long j = ((MMRtcRemoteStats) this.f70P0.remoteStats.get(0)).AudioStats.expandCount * 10;
            zmx zmxVar3 = ((MediaBaseCodecFilter) this).H;
            zmxVar2.f0 = j - zmxVar3.g0;
            zmxVar3.h0 = ((MMRtcRemoteStats) this.f70P0.remoteStats.get(0)).videoStats.videoRenderCount - ((MediaBaseCodecFilter) this).H.i0;
        }
        ((MediaBaseCodecFilter) this).I.u();
    }

    /* JADX INFO: renamed from: W6 */
    public void m227W6() {
        this.f78R2 = false;
    }

    /* JADX INFO: renamed from: X */
    public void m228X() {
        this.f116g1 = false;
    }

    /* JADX INFO: renamed from: X0 */
    public long m229X0() {
        return 0L;
    }

    /* JADX INFO: renamed from: X4 */
    public void m230X4(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f100Y1 = mRtcTokenWillExpireHander;
    }

    /* JADX INFO: renamed from: X5 */
    public void m231X5() {
        ((MediaBaseCodecFilter) this).H.D = m316x1();
        ((MediaBaseCodecFilter) this).H.F = m195O0();
        ((MediaBaseCodecFilter) this).H.G = m298q1();
        ((MediaBaseCodecFilter) this).H.B = m162F1();
        ((MediaBaseCodecFilter) this).H.N = m314w1();
        ((MediaBaseCodecFilter) this).H.O = m266h1();
        ((MediaBaseCodecFilter) this).H.P = m234Y0();
        ((MediaBaseCodecFilter) this).H.Q = m283m0();
        ((MediaBaseCodecFilter) this).H.v = getVideoWidth();
        ((MediaBaseCodecFilter) this).H.w = m276k0();
        ((MediaBaseCodecFilter) this).H.j = m265h0();
        ((MediaBaseCodecFilter) this).H.r = m110p5();
        ((MediaBaseCodecFilter) this).H.S = ((ulw) Z1()).w;
        ((MediaBaseCodecFilter) this).H.T = ((ulw) Z1()).x;
        ((MediaBaseCodecFilter) this).H.U = m6B5();
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.V = this.f48H2 ? 1L : 0L;
        zmxVar.I0 = this.f64N0;
        zmxVar.J0 = this.f67O0;
        ((MediaBaseCodecFilter) this).I.H();
    }

    /* JADX INFO: renamed from: X6 */
    public void m232X6(String str) {
        this.f142s1 = str;
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.renewToken(str);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m233Y(yw00 yw00Var, vlw vlwVar) {
        super.Y(yw00Var, vlwVar);
        this.f46H0 = yw00Var;
        if (vlwVar == null) {
            return;
        }
        int i = vlwVar.E0;
        this.f143s2 = i;
        if (i <= 0 || i > 30) {
            Log.e("unint", "error maxFps=" + this.f143s2);
            this.f143s2 = 30;
        }
        this.f136p1 = (qmr) vlwVar;
        m34J6();
        yw00 yw00Var2 = this.f46H0;
        if (yw00Var2 != null) {
            this.f92W = yw00Var2.l();
        }
        ii70.d().c("MoMoRtcPushFilter", "videoWidth:" + ((ulw) ((MediaBaseCodecFilter) this).s).s + ",videoHeight:" + ((ulw) ((MediaBaseCodecFilter) this).s).t + ",visualWidth:" + ((ulw) ((MediaBaseCodecFilter) this).s).u + ",visualHeight:" + ((ulw) ((MediaBaseCodecFilter) this).s).v + ",encodeWidth:" + ((ulw) ((MediaBaseCodecFilter) this).s).m + ",encodeHeight:" + ((ulw) ((MediaBaseCodecFilter) this).s).n + ",videoBitrate:" + ((ulw) ((MediaBaseCodecFilter) this).s).H + ",audioBitrate:" + ((ulw) ((MediaBaseCodecFilter) this).s).S + ",videoFPS:" + ((ulw) ((MediaBaseCodecFilter) this).s).F + ",codecFPS:" + ((MediaBaseCodecFilter) this).s.E0 + ",mergeCanvasWidth:" + ((ulw) ((qmr) ((MediaBaseCodecFilter) this).s)).k + ",mergeCanvasHeight:" + ((ulw) ((qmr) ((MediaBaseCodecFilter) this).s)).l + ",codecFPS:" + ((MediaBaseCodecFilter) this).s.E0 + ",isHard:" + ((MediaBaseCodecFilter) this).s.A0);
    }

    /* JADX INFO: renamed from: Y0 */
    public int m234Y0() {
        MMRtcStats mMRtcStats = this.f70P0;
        if (mMRtcStats != null) {
            return mMRtcStats.videoStats.videoBitrate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y4 */
    public void m235Y4(int i) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.adjustPlaybackSignalVolume(i);
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public void m236Y5(boolean z) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            if (z) {
                mMRtcEngine.registerAudioFrameObserver((IAudioFrameObserver) null);
                this.f86U.registerAudioFrameObserver(this);
                this.f114f1 = true;
            } else {
                if (this.f78R2) {
                    return;
                }
                mMRtcEngine.registerAudioFrameObserver((IAudioFrameObserver) null);
                this.f114f1 = false;
            }
        }
    }

    /* JADX INFO: renamed from: Y6 */
    public void m237Y6(String str) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateRtmpUrl", str});
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine == null || this.f118h1 == null || str == null || this.f39E2) {
            return;
        }
        ((MediaBaseCodecFilter) this).H.a0 = str;
        mMRtcEngine.addPublishStreamUrl(((vlw) this.f136p1).v0, true);
        ((MediaBaseCodecFilter) this).I.B(str, ((MediaBaseCodecFilter) this).H.x);
        hu00.a aVar = this.f118h1;
        if (aVar != null) {
            aVar.g(12308, 0, 0, this);
        }
        ((MediaBaseCodecFilter) this).H.a0 = str;
        MRtcPusherHandler mRtcPusherHandler = this.f51I2;
        if (mRtcPusherHandler != null) {
            mRtcPusherHandler.onPushChangeStreamUrl(str);
        }
        ii70.d().c("MoMoRtcPushFilter", "updateRtmpUrl:url=".concat(str));
    }

    /* JADX INFO: renamed from: Z4 */
    public void m238Z4(long j, float f) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setParameters("{\"che.audio.playout.uid.volume\": {\"uid\":userid,\"volume\":volumeScale}}");
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public void m239Z5(int i, int i2) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (i2 == 0) {
            mMRtcEngine.setRemoteVideoStreamType(i, 0);
        } else {
            mMRtcEngine.setRemoteVideoStreamType(i, 1);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public long m240a0() {
        return ((MediaBaseCodecFilter) this).H.E;
    }

    /* JADX INFO: renamed from: a5 */
    public int m241a5(int i) {
        int clientRole;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"changeRole", Integer.valueOf(i)});
        ii70.d().c("MoMoRtcPushFilter", "call changeRole:" + i);
        this.f144t1 = i;
        synchronized (this.f146u1) {
            if (1 == i) {
                try {
                    m34J6();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f86U != null) {
                ii70.d().c("MoMoRtcPushFilter", "changeRole:" + i);
                clientRole = this.f86U.setClientRole(i);
            } else {
                clientRole = 0;
            }
        }
        if (this.f144t1 == 2) {
            m270i2();
            ((MediaBaseCodecFilter) this).H.B0 = "MrtcAudience";
        } else {
            m262g2();
            ((MediaBaseCodecFilter) this).H.B0 = "M".equals(m314w1()) ? "MrtcMaster" : "MrtcSlaver";
        }
        ((MediaBaseCodecFilter) this).H.e = System.currentTimeMillis();
        ((MediaBaseCodecFilter) this).H.f = System.currentTimeMillis();
        return clientRole;
    }

    /* JADX INFO: renamed from: a6 */
    public void m242a6() {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.resumeAllEffects();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m243b0() {
    }

    /* JADX INFO: renamed from: b1 */
    public long m244b1() {
        MMRtcLocalVideoStats mMRtcLocalVideoStats;
        MMRtcStats mMRtcStats = this.f70P0;
        if (mMRtcStats == null || (mMRtcLocalVideoStats = mMRtcStats.videoStats) == null) {
            return 0L;
        }
        return mMRtcLocalVideoStats.vEncodeCount;
    }

    /* JADX INFO: renamed from: b6 */
    public void m245b6(int i) {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.resumeEffect(i);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public long m246c0() {
        return 0L;
    }

    /* JADX INFO: renamed from: c1 */
    public int m247c1() {
        return 1;
    }

    /* JADX INFO: renamed from: c2 */
    public void m248c2() {
        if (this.f144t1 == 1) {
            m267h2();
        } else {
            m258f2();
        }
    }

    /* JADX INFO: renamed from: c6 */
    public void m249c6() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"resumeRecording"});
        ii70.d().c("MoMoRtcPushFilter", "resumeRecording");
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.muteLocalAudioStream(false);
            this.f95X = true;
        }
        Handler handler = this.f42F2;
        if (handler != null) {
            handler.removeCallbacks(this.f81S1);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m250d1() {
        if (this.f144t1 == 1) {
            m231X5();
        } else {
            m226W5();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public void m251d2() {
        if (this.f144t1 == 1) {
            m270i2();
        } else {
            m262g2();
        }
    }

    /* JADX INFO: renamed from: d6 */
    public void m252d6() {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.resumeAudioMixing();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public Surface m253e0() {
        return null;
    }

    /* JADX INFO: renamed from: e1 */
    public void m254e1(u3m u3mVar) {
        u3m u3mVar2;
        super.e1(u3mVar);
        if ((u3mVar instanceof ExtAudioWrapper) && (u3mVar2 = ((MediaBaseCodecFilter) this).K) != null) {
            ((ExtAudioWrapper) u3mVar2).m9861r2();
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).m354J2(new C0002b());
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).mo394s1(1);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public void m255e5(boolean z) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            if (z) {
                mMRtcEngine.enableAudio();
            } else {
                mMRtcEngine.disableAudio();
            }
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m256e6(String str) {
        int i;
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null && this.f89V == -1) {
            this.f89V = mMRtcEngine.createDataStream(true, true);
        }
        MMRtcEngine mMRtcEngine2 = this.f86U;
        if (mMRtcEngine2 == null || (i = this.f89V) == -1) {
            return;
        }
        mMRtcEngine2.sendStreamMessage(i, str);
    }

    /* JADX INFO: renamed from: f */
    public void m257f() {
        Log.e("unint", "stopRecord");
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"stopRecord"});
        this.f95X = false;
        this.f99Y0 = 0;
        this.f116g1 = false;
        this.f45G2 = true;
        super.f();
        C0006f c0006f = this.f121i2;
        if (c0006f != null) {
            c0006f.m330a();
            this.f121i2 = null;
        }
        stopSurroundMusic();
        Timer timer = this.f36D2;
        if (timer != null) {
            timer.cancel();
            this.f36D2 = null;
        }
        release();
        u3m u3mVar = ((MediaBaseCodecFilter) this).K;
        if (u3mVar != null) {
            qmr qmrVar = this.f136p1;
            ((ExtAudioWrapper) u3mVar).m353I2(2048, ((ulw) qmrVar).P, ((ulw) qmrVar).R, "NULL");
        }
        u3m u3mVar2 = ((MediaBaseCodecFilter) this).K;
        if (u3mVar2 != null) {
            u3mVar2.G1((za1) null);
            ((MediaBaseCodecFilter) this).K.V((ab1) null);
            ((MediaBaseCodecFilter) this).K.R((ya1) null);
            ((MediaBaseCodecFilter) this).K = null;
        }
        super.p2();
        st0.g().q(st0.f);
        PipelineConcurrentHashMap<Long, a9y> pipelineConcurrentHashMap = this.f84T0;
        if (pipelineConcurrentHashMap != null && !pipelineConcurrentHashMap.isEmpty()) {
            n8c.a("zhengjijian", "stopRecord memberInfoMap " + this.f84T0.size());
            this.f84T0.clear();
        }
        PipelineConcurrentHashMap<Long, ley> pipelineConcurrentHashMap2 = this.f80S0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            this.f80S0.clear();
        }
        synchronized (this.f34C2) {
            try {
                if (!this.f34C2.isEmpty()) {
                    for (SurfaceViewRenderer surfaceViewRenderer : this.f34C2.values()) {
                        if (surfaceViewRenderer != null) {
                            surfaceViewRenderer.release();
                        }
                    }
                    this.f34C2.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fjx.R().C1(0);
        ii70.d().c("MoMoRtcPushFilter", "stopRecordOK!!!!!!!!!!!!!!!!!!!!");
    }

    /* JADX INFO: renamed from: f2 */
    public void m258f2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pullStartV3", Boolean.valueOf(this.f75Q2)});
        if (this.f75Q2) {
            return;
        }
        this.f75Q2 = true;
        ((MediaBaseCodecFilter) this).H.a = System.currentTimeMillis();
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
        zmxVar.e = jCurrentTimeMillis - zmxVar2.e;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        zmx zmxVar3 = ((MediaBaseCodecFilter) this).H;
        zmxVar2.f = jCurrentTimeMillis2 - zmxVar3.f;
        zmxVar3.y = this.f30A2;
        super.f2();
    }

    /* JADX INFO: renamed from: f5 */
    public void m259f5(boolean z) {
        this.f59L1 = z;
    }

    /* JADX INFO: renamed from: g0 */
    public long m260g0() {
        return 0L;
    }

    /* JADX INFO: renamed from: g1 */
    public String m261g1(int i, int i2, Object obj) {
        return "";
    }

    /* JADX INFO: renamed from: g2 */
    public void m262g2() {
        this.f75Q2 = false;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pullStop_v3"});
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        if (zmxVar.a != -1) {
            zmxVar.h = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.a;
        }
        MMRtcStats mMRtcStats = this.f70P0;
        if (mMRtcStats == null || mMRtcStats.remoteStats.size() <= 0 || ((MMRtcRemoteStats) this.f70P0.remoteStats.get(0)).AudioStats == null) {
            zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
            zmxVar2.f0 = 0L;
            zmxVar2.h0 = 0L;
        } else {
            ((MediaBaseCodecFilter) this).H.f0 = ((MMRtcRemoteStats) this.f70P0.remoteStats.get(0)).AudioStats.expandCount * 10;
            ((MediaBaseCodecFilter) this).H.h0 = ((MMRtcRemoteStats) this.f70P0.remoteStats.get(0)).videoStats.videoRenderCount;
        }
        ((MediaBaseCodecFilter) this).H.y = this.f30A2;
        super.g2();
    }

    /* JADX INFO: renamed from: g5 */
    public void m263g5(boolean z) {
        MMRtcEngine mMRtcEngine;
        if (z && (mMRtcEngine = this.f86U) != null) {
            mMRtcEngine.setParameters("{\"che.audio.live_for_comm\":true}");
            return;
        }
        MMRtcEngine mMRtcEngine2 = this.f86U;
        if (mMRtcEngine2 != null) {
            mMRtcEngine2.setParameters("{\"che.audio.live_for_comm\":false}");
        }
    }

    /* JADX INFO: renamed from: g6 */
    public void m264g6(boolean z) {
        if (z) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "set double push");
        }
        this.f123j2 = z;
        this.f152x1 = z;
    }

    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    public int getRoomType() {
        return this.f138q1;
    }

    public String getServerIpAddr() {
        return "0.0.0.0";
    }

    public int getVideoWidth() {
        if (this.f154y1 || this.f152x1) {
            return 0;
        }
        return ((ulw) ((MediaBaseCodecFilter) this).s).m;
    }

    /* JADX INFO: renamed from: h0 */
    public int m265h0() {
        MMRtcStats mMRtcStats = this.f70P0;
        if (mMRtcStats != null) {
            return (int) mMRtcStats.rxBytes;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public int m266h1() {
        MMRtcStats mMRtcStats = this.f70P0;
        if (mMRtcStats != null) {
            return (int) mMRtcStats.audioStats.audioBitrate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h2 */
    public void m267h2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pushStartV3", Boolean.valueOf(this.f75Q2)});
        if (this.f75Q2) {
            return;
        }
        this.f75Q2 = true;
        ((MediaBaseCodecFilter) this).H.a = System.currentTimeMillis();
        ((MediaBaseCodecFilter) this).H.x = m155D1();
        ((MediaBaseCodecFilter) this).H.v = getVideoWidth();
        ((MediaBaseCodecFilter) this).H.w = m276k0();
        ((MediaBaseCodecFilter) this).H.z = m296p1();
        ((MediaBaseCodecFilter) this).H.A = m147A0();
        ((MediaBaseCodecFilter) this).H.e = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.e;
        super.h2();
    }

    /* JADX INFO: renamed from: h5 */
    public void m268h5(boolean z, String str) {
        this.f56K1 = z;
        this.f53J1 = str;
        if (!z || this.f86U == null || str == null || str.length() <= 0) {
            return;
        }
        n8c.e("MoMoRtcPushFilter", "agora_sdk_ver: " + MMRtcEngine.getSdkVersion());
        this.f86U.setParameters("{\"rtc.log_filter\":34781}");
        this.f86U.setLogFile(this.f53J1);
        this.f86U.setLogFilter(15);
    }

    /* JADX INFO: renamed from: h6 */
    public void m269h6(boolean z) {
    }

    /* JADX INFO: renamed from: i2 */
    public void m270i2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pushStop_v3"});
        this.f75Q2 = false;
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        if (zmxVar.a != -1) {
            zmxVar.h = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.a;
        }
        super.i2();
    }

    /* JADX INFO: renamed from: i5 */
    public void m271i5(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"enableDualStreamMode", Boolean.valueOf(z)});
        ii70.d().c("MoMoRtcPushFilter", "call enableDualStreamMode:" + z);
        this.f37E0 = z;
    }

    /* JADX INFO: renamed from: i6 */
    public void m272i6(int i) {
        Log.e("MoMoRtcPushFilter", "momortc setAudioMixingPitch:" + i);
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setAudioMixingPitch(i);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public long m273j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j5 */
    public void m274j5(boolean z) {
        this.f62M1 = z;
    }

    /* JADX INFO: renamed from: j6 */
    public void m275j6(boolean z) {
        this.f154y1 = z;
        if (z) {
            this.f40F0 = false;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public int m276k0() {
        if (this.f154y1 || this.f152x1) {
            return 0;
        }
        return ((ulw) ((MediaBaseCodecFilter) this).s).n;
    }

    /* JADX INFO: renamed from: k5 */
    public void m277k5(boolean z) {
    }

    /* JADX INFO: renamed from: k6 */
    public void m278k6(int i, int i2) {
        if (this.f86U == null || i < 0) {
            return;
        }
        ((MediaBaseCodecFilter) this).H.C0 = m107o5(i);
    }

    /* JADX INFO: renamed from: l1 */
    public long m280l1() {
        return 0L;
    }

    /* JADX INFO: renamed from: l5 */
    public void m281l5(boolean z) {
        this.f40F0 = z;
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            if (!z || this.f136p1 == null) {
                mMRtcEngine.disableVideo();
                this.f45G2 = true;
                return;
            }
            this.f45G2 = false;
            mMRtcEngine.enableVideo();
            EGLContext eGLContext = this.f92W;
            if (eGLContext != null) {
                this.f86U.updateSharedContext(eGLContext);
            }
            ii70.d().c("MoMoRtcPushFilter", "setVideoProfileEx1 bitrate:" + ((ulw) this.f136p1).H);
            this.f86U.setParameters("{\"che.video.keyFrameInterval\":1}");
            qmr qmrVar = this.f136p1;
            if (((vlw) qmrVar).F0 && qmrVar.d() == 1) {
                MMRtcEngine mMRtcEngine2 = this.f86U;
                qmr qmrVar2 = this.f136p1;
                mMRtcEngine2.setVideoProfile(((ulw) qmrVar2).n, ((ulw) qmrVar2).m, 15, ((ulw) qmrVar2).H);
            } else {
                MMRtcEngine mMRtcEngine3 = this.f86U;
                qmr qmrVar3 = this.f136p1;
                mMRtcEngine3.setVideoProfile(((ulw) qmrVar3).m, ((ulw) qmrVar3).n, 15, ((ulw) qmrVar3).H);
            }
        }
    }

    /* JADX INFO: renamed from: l6 */
    public void m282l6(int i) {
        this.f125k1 = i;
    }

    /* JADX INFO: renamed from: m0 */
    public int m283m0() {
        if (this.f95X) {
            IMMRtcEngineEventInterface.LocalVideoStats localVideoStatsM131v5 = m131v5();
            if (localVideoStatsM131v5 != null) {
                return localVideoStatsM131v5.sentFrameRate;
            }
            return 0;
        }
        IMMRtcEngineEventInterface.RemoteVideoStats remoteVideoStatsM135w5 = m135w5();
        if (remoteVideoStatsM135w5 != null) {
            return remoteVideoStatsM135w5.receivedFrameRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m1 */
    public void m284m1(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: m6 */
    public void m285m6(int i) {
        ((MediaBaseCodecFilter) this).H.i = i;
    }

    /* JADX INFO: renamed from: n0 */
    public long m286n0() {
        return 0L;
    }

    /* JADX INFO: renamed from: n1 */
    public int m287n1() {
        return this.f133o1;
    }

    /* JADX INFO: renamed from: n2 */
    public void m288n2(vlw vlwVar) {
        super.n2(vlwVar);
        vlw vlwVar2 = ((MediaBaseCodecFilter) this).s;
        qmr qmrVar = (qmr) vlwVar2;
        this.f136p1 = qmrVar;
        if (qmrVar != null) {
            if (!this.f83T || vlwVar2.A0 == MomoPipeline.DecodeType.SOFT_DECODE || ((ulw) ((qmr) vlwVar2)).b0) {
                vlwVar2.A0 = MomoPipeline.DecodeType.SOFT_DECODE;
            } else {
                vlwVar2.A0 = MomoPipeline.DecodeType.HARD_DECODE;
            }
        }
    }

    /* JADX INFO: renamed from: n5 */
    public void m289n5(long j, boolean z) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.forwardDownlinkAudio(j, z);
        }
    }

    /* JADX INFO: renamed from: n6 */
    public void m290n6(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setBusinessType", Integer.valueOf(i)});
        ((MediaBaseCodecFilter) this).H.s = i;
        hjx.d("MoMoRtcPushFilter", "setBusinessType : " + i);
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setRoomMode(i);
        }
    }

    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        n8c.c("zk", "newTextureReady");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((ccj) this).texture_in = i;
        long j = 1000 / ((long) this.f143s2);
        long j2 = this.f145t2;
        long j3 = jCurrentTimeMillis - j2;
        if (j3 < j) {
            return;
        }
        if (j2 == 0 || j3 > 5 * j) {
            this.f145t2 = System.currentTimeMillis();
        } else {
            this.f145t2 = j2 + j;
        }
        m187M1();
    }

    /* JADX INFO: renamed from: o */
    public void m291o() {
    }

    /* JADX INFO: renamed from: o0 */
    public long m292o0() {
        return 0L;
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m293o1(ByteBuffer byteBuffer) {
        m312v0(byteBuffer);
        return true;
    }

    /* JADX INFO: renamed from: o6 */
    public void m294o6(String str) {
        this.f142s1 = str;
    }

    public boolean onPlaybackFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f95X) {
            return true;
        }
        int i7 = 0;
        boolean z = (i3 == 2 && i4 == 441000) ? false : true;
        if (this.f49I0 != null && this.f112e1 != null && this.f116g1) {
            if (this.f147u2 == null && z) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.f147u2 = audioResampleUtils;
                int iInitResampleInfo = audioResampleUtils.initResampleInfo(i4, i3, 16, this.f125k1, 2, 16);
                this.f151w2.clear();
                if (iInitResampleInfo < 0) {
                    Log.e("mmrtcpushfilter", "onPlaybackAudioFrame: 创建重采样模块失败！！");
                    this.f147u2.release();
                    this.f147u2 = null;
                }
            }
            AudioResampleUtils audioResampleUtils2 = this.f147u2;
            if (audioResampleUtils2 != null) {
                ByteBuffer byteBufferResamplePcmData = audioResampleUtils2.resamplePcmData(bArr, i);
                if (byteBufferResamplePcmData != null) {
                    m120s5(byteBufferResamplePcmData.capacity());
                    this.f151w2.put(byteBufferResamplePcmData.array(), 0, byteBufferResamplePcmData.capacity());
                }
            } else {
                m120s5(bArr.length);
                this.f151w2.put(bArr, 0, bArr.length);
            }
            int iPosition = this.f151w2.position();
            while (true) {
                i5 = i7 * 2048;
                i6 = iPosition - i5;
                if (i6 < 2048 || !this.f116g1) {
                    break;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
                byteBufferAllocate.put(this.f151w2.array(), i5, 2048);
                byteBufferAllocate.flip();
                if (this.f144t1 == 2) {
                    this.f112e1.C(new mpd0(byteBufferAllocate, System.currentTimeMillis(), 2));
                } else {
                    wb1 wb1Var = this.f49I0;
                    if (wb1Var != null) {
                        wb1Var.i(new mpd0(byteBufferAllocate, System.currentTimeMillis(), 2));
                    }
                }
                i7++;
            }
            if (i6 > 0) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
                byteBufferAllocate2.put(this.f151w2.array(), i5, i6);
                byteBufferAllocate2.flip();
                this.f151w2.clear();
                this.f151w2.put(byteBufferAllocate2);
            } else if (i6 == 0) {
                this.f151w2.clear();
            }
        }
        return true;
    }

    public boolean onRecordFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        mpd0 mpd0Var;
        int i5;
        int i6;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (!this.f95X) {
            return true;
        }
        if (this.f127l1 % 200 == 0) {
            ii70.d().f("MoMoRtcPushFilter", "onRecordFrame samples.len" + bArr.length + " numOfSamples:" + i);
        }
        this.f127l1++;
        boolean z = (i3 == 2 && i4 == 441000) ? false : true;
        byte[] bArr2 = new byte[bArr.length];
        if (!this.f130m2) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        mpd0 mpd0VarG = null;
        if (((MediaBaseCodecFilter) this).K == null || !this.f95X) {
            mpd0Var = null;
        } else {
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).mo367W1(this.f122j1);
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).mo394s1(i3);
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).m353I2(bArr.length, i4, i3, "momortc");
            mpd0 mpd0VarMo345C = ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).mo345C(new mpd0(bArr2, this.f125k1, i3));
            if (mpd0VarMo345C != null && (byteBuffer2 = mpd0VarMo345C.b) != null) {
                byteBuffer2.get(bArr, 0, bArr.length);
            }
            mpd0Var = mpd0VarMo345C;
        }
        if ((this.f44G1 != null || this.f112e1 != null) && this.f116g1) {
            if (this.f149v2 == null && z) {
                AudioResampleUtils audioResampleUtils = new AudioResampleUtils();
                this.f149v2 = audioResampleUtils;
                int iInitResampleInfo = audioResampleUtils.initResampleInfo(i4, i3, 16, this.f125k1, 2, 16);
                this.f153x2.clear();
                if (iInitResampleInfo < 0) {
                    Log.e("mmrtcpushfilter", "onRecordFrame: 创建重采样模块失败！！");
                    this.f149v2.release();
                    this.f149v2 = null;
                }
            }
            if (mpd0Var != null && (byteBuffer = mpd0Var.b) != null) {
                AudioResampleUtils audioResampleUtils2 = this.f149v2;
                if (audioResampleUtils2 == null || !z) {
                    m124t5(byteBuffer.capacity());
                    this.f153x2.put(mpd0Var.b.array(), 0, mpd0Var.b.capacity());
                } else {
                    ByteBuffer byteBufferResamplePcmData = audioResampleUtils2.resamplePcmData(byteBuffer.array(), i);
                    if (byteBufferResamplePcmData != null) {
                        m124t5(byteBufferResamplePcmData.capacity());
                        this.f153x2.put(byteBufferResamplePcmData.array(), 0, byteBufferResamplePcmData.capacity());
                    }
                }
            }
            int iPosition = this.f153x2.position();
            int i7 = 0;
            while (true) {
                i5 = i7 * 2048;
                i6 = iPosition - i5;
                if (i6 < 2048 || !this.f116g1) {
                    break;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2048);
                byteBufferAllocate.put(this.f153x2.array(), i5, 2048);
                byteBufferAllocate.flip();
                wb1 wb1Var = this.f49I0;
                if (wb1Var != null) {
                    wb1Var.j(1.0f);
                    mpd0VarG = this.f49I0.g();
                }
                ByteBuffer byteBufferH = mpd0VarG != null ? this.f49I0.h(byteBufferAllocate.array(), mpd0VarG.c(), mpd0VarG.e()) : byteBufferAllocate;
                pcmDataAvailableCallback pcmdataavailablecallback = this.f44G1;
                if (pcmdataavailablecallback != null) {
                    pcmdataavailablecallback.onPcmDateCallback(((vlw) this.f136p1).B0, byteBufferAllocate.array(), this.f125k1, false);
                }
                mpd0 mpd0Var2 = new mpd0(byteBufferH.array(), this.f125k1, 2);
                mpd0Var2.g(false);
                sml.a aVar = this.f112e1;
                if (aVar != null) {
                    aVar.C(mpd0Var2);
                    int i8 = this.f72P2;
                    this.f72P2 = i8 + 1;
                    if (i8 % 50 == 0) {
                        ii70.d().c("MoMoRtcPushFilter", "=====replace======:mmrtc send pcm to IJK ");
                    }
                }
                i7++;
            }
            if (i6 > 0) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i6);
                byteBufferAllocate2.put(this.f153x2.array(), i5, i6);
                byteBufferAllocate2.flip();
                this.f153x2.clear();
                this.f153x2.put(byteBufferAllocate2);
            } else if (i6 == 0) {
                this.f153x2.clear();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m295p(String str, int i) {
    }

    /* JADX INFO: renamed from: p1 */
    public int m296p1() {
        qmr qmrVar = this.f136p1;
        int i = ((ulw) qmrVar).k;
        return i > 0 ? i : ((ulw) qmrVar).s;
    }

    /* JADX INFO: renamed from: p6 */
    public void m297p6(boolean z) {
        this.f128l2 = z;
    }

    /* JADX INFO: renamed from: q1 */
    public long m298q1() {
        return this.f52J0;
    }

    /* JADX INFO: renamed from: q5 */
    public double m299q5() {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            return mMRtcEngineImpl.getEffectsVolume() / 100.0f;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: q6 */
    public void m300q6(double d) {
        MMRtcEngineImpl mMRtcEngineImpl = this.f86U;
        if (mMRtcEngineImpl != null) {
            mMRtcEngineImpl.setEffectsVolume(((float) d) * 100.0f);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public long m301r0() {
        return 0L;
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m302r1() {
        return this.f123j2;
    }

    /* JADX INFO: renamed from: r5 */
    public int m303r5() {
        return this.f93W0;
    }

    /* JADX INFO: renamed from: r6 */
    public int m304r6(boolean z) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            return mMRtcEngine.setEnableSpeakerphone(z);
        }
        return -1;
    }

    /* JADX INFO: renamed from: s0 */
    public int m305s0() {
        return 0;
    }

    /* JADX INFO: renamed from: s6 */
    public void m306s6(String str) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setEncryptionMode(str);
        }
    }

    public void stopSurroundMusic() {
        ii70.d().c("MoMoRtcPushFilter", "stopSurroundMusic:");
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.stopAudioMixing();
            this.f33C1 = false;
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m307t6(String str) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.setEncryptionSecret(str);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public long m308u0() {
        return 0L;
    }

    /* JADX INFO: renamed from: u1 */
    public long m309u1() {
        return 0L;
    }

    /* JADX INFO: renamed from: u5 */
    public int m310u5() {
        return this.f96X0;
    }

    /* JADX INFO: renamed from: u6 */
    public void m311u6(String str) {
        boolean zHas;
        try {
            zHas = new JSONObject(str).has("che.audio.profile");
        } catch (JSONException e) {
            e.printStackTrace();
            zHas = false;
        }
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine == null || zHas) {
            return;
        }
        mMRtcEngine.setParameters(str);
    }

    /* JADX INFO: renamed from: v0 */
    public void m312v0(ByteBuffer byteBuffer) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ii70.d().c("MoMoRtcPushFilter", "writevideo:" + byteBuffer.limit() + ";timeStamp:" + jCurrentTimeMillis);
        if (this.f83T || !this.f95X || this.f45G2) {
            return;
        }
        int i = this.f148v1 + 1;
        this.f148v1 = i;
        if (i >= 30 || this.f152x1) {
            m43N5();
        }
    }

    /* JADX INFO: renamed from: v6 */
    public void m313v6(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: w1 */
    public String m314w1() {
        qmr qmrVar = this.f136p1;
        return (qmrVar == null || qmrVar.f3961h1) ? "M" : "S";
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
    public void m315w6(String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str2;
        double d;
        int i;
        String str3;
        double d2;
        String str4;
        int i2;
        JSONArray jSONArray2;
        String str5;
        String str6;
        String string = str;
        String str7 = "z";
        String str8 = "h";
        String str9 = "y";
        if (this.f136p1 == null || string == null) {
            return;
        }
        MMLiveTranscoding mMLiveTranscoding = this.f132n2;
        if (mMLiveTranscoding == null) {
            this.f132n2 = new MMLiveTranscoding();
        } else {
            mMLiveTranscoding.transcodingUserMap.clear();
        }
        qmr qmrVar = this.f136p1;
        String str10 = "renderMode";
        int i3 = ((ulw) qmrVar).k;
        String str11 = "alpha";
        MMLiveTranscoding mMLiveTranscoding2 = this.f132n2;
        if (i3 > 0) {
            mMLiveTranscoding2.width = i3;
            mMLiveTranscoding2.height = ((ulw) qmrVar).l;
        } else {
            mMLiveTranscoding2.width = ((ulw) qmrVar).s;
            mMLiveTranscoding2.height = ((ulw) qmrVar).t;
        }
        int i4 = 1;
        if (((vlw) qmrVar).F0 && qmrVar.d() == 1) {
            MMLiveTranscoding mMLiveTranscoding3 = this.f132n2;
            double d3 = mMLiveTranscoding3.width;
            mMLiveTranscoding3.width = mMLiveTranscoding3.height;
            mMLiveTranscoding3.height = d3;
        }
        MMLiveTranscoding mMLiveTranscoding4 = this.f132n2;
        if (mMLiveTranscoding4.width <= 0.0d || mMLiveTranscoding4.height <= 0.0d) {
            return;
        }
        try {
            jSONObject = new JSONObject(string);
            if (jSONObject.has("ts")) {
                jSONObject.remove("ts");
            }
            jSONObject.put("ts", Y1());
            if (jSONObject.has("bType")) {
                jSONObject.remove("bType");
            }
            jSONObject.put("bType", ((MediaBaseCodecFilter) this).H.s);
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
        String string2 = jSONObject2.has("mid") ? jSONObject2.getString("mid") : "";
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        double d4 = 1.0d;
        if (jSONObject2.has("conf")) {
            jSONArray = jSONObject2.getJSONArray("conf");
        } else {
            if (!jSONObject2.has("has")) {
                return;
            }
            jSONArray = jSONObject2.getJSONArray("has");
            if (jSONArray != null) {
                MMLiveTranscoding.MMLiveTranscodingUser mMLiveTranscodingUser = new MMLiveTranscoding.MMLiveTranscodingUser();
                mMLiveTranscodingUser.uid = string2;
                mMLiveTranscodingUser.zOrder = 1;
                mMLiveTranscodingUser.posx = 0.0d;
                mMLiveTranscodingUser.posy = 0.0d;
                MMLiveTranscoding mMLiveTranscoding5 = this.f132n2;
                mMLiveTranscodingUser.width = (int) mMLiveTranscoding5.width;
                mMLiveTranscodingUser.height = (int) mMLiveTranscoding5.height;
                mMLiveTranscodingUser.alpha = 1.0d;
                mMLiveTranscoding5.transcodingUserMap.put(string2, mMLiveTranscodingUser);
                this.f132n2.transcodingExtraInfo = m139x5(string);
            }
        }
        if (jSONArray == null) {
            return;
        }
        int i5 = 0;
        while (i5 < jSONArray.length()) {
            JSONObject jSONObject3 = (JSONObject) jSONArray.get(i5);
            String string3 = (jSONObject3 == null || !jSONObject3.has("id")) ? "" : jSONObject3.getString("id");
            double d5 = (jSONObject3 == null || !jSONObject3.has("x")) ? 0.0d : jSONObject3.getDouble("x");
            if (jSONObject3 != null) {
                str2 = str9;
                double d6 = jSONObject3.has(str2) ? jSONObject3.getDouble(str2) : 0.0d;
                if (jSONObject3 == null && jSONObject3.has(r6)) {
                    d = jSONObject3.getDouble("w");
                } else {
                    d = d4;
                }
                if (jSONObject3 != null) {
                    i = i4;
                    str3 = str8;
                    if (jSONObject3.has(str3)) {
                        d2 = jSONObject3.getDouble(str3);
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
                        MMLiveTranscoding mMLiveTranscoding6 = this.f132n2;
                        double d7 = mMLiveTranscoding6.width;
                        mMLiveTranscodingUser2.posx = (int) (d5 * d7);
                        double d8 = mMLiveTranscoding6.height;
                        mMLiveTranscodingUser2.posy = (int) (d8 * d6);
                        mMLiveTranscodingUser2.width = (int) (d7 * d);
                        mMLiveTranscodingUser2.height = (int) (d8 * d2);
                        mMLiveTranscoding6.transcodingUserMap.put(string3, mMLiveTranscodingUser2);
                        this.f132n2.transcodingExtraInfo = m139x5(string);
                        i5++;
                        jSONArray = jSONArray2;
                        str7 = str4;
                        i4 = i;
                        d4 = 1.0d;
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
                    MMLiveTranscoding mMLiveTranscoding7 = this.f132n2;
                    double d9 = mMLiveTranscoding7.width;
                    mMLiveTranscodingUser3.posx = (int) (d5 * d9);
                    double d10 = mMLiveTranscoding7.height;
                    mMLiveTranscodingUser3.posy = (int) (d10 * d6);
                    mMLiveTranscodingUser3.width = (int) (d9 * d);
                    mMLiveTranscodingUser3.height = (int) (d10 * d2);
                    mMLiveTranscoding7.transcodingUserMap.put(string3, mMLiveTranscodingUser3);
                    this.f132n2.transcodingExtraInfo = m139x5(string);
                    i5++;
                    jSONArray = jSONArray2;
                    str7 = str4;
                    i4 = i;
                    d4 = 1.0d;
                    str9 = str2;
                } else {
                    i = i4;
                    str3 = str8;
                }
                d2 = d4;
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
                    MMLiveTranscoding mMLiveTranscoding8 = this.f132n2;
                    double d11 = mMLiveTranscoding8.width;
                    mMLiveTranscodingUser4.posx = (int) (d5 * d11);
                    double d12 = mMLiveTranscoding8.height;
                    mMLiveTranscodingUser4.posy = (int) (d12 * d6);
                    mMLiveTranscodingUser4.width = (int) (d11 * d);
                    mMLiveTranscodingUser4.height = (int) (d12 * d2);
                    mMLiveTranscoding8.transcodingUserMap.put(string3, mMLiveTranscodingUser4);
                    this.f132n2.transcodingExtraInfo = m139x5(string);
                    i5++;
                    jSONArray = jSONArray2;
                    str7 = str4;
                    i4 = i;
                    d4 = 1.0d;
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
                MMLiveTranscoding mMLiveTranscoding9 = this.f132n2;
                double d13 = mMLiveTranscoding9.width;
                mMLiveTranscodingUser5.posx = (int) (d5 * d13);
                double d14 = mMLiveTranscoding9.height;
                mMLiveTranscodingUser5.posy = (int) (d14 * d6);
                mMLiveTranscodingUser5.width = (int) (d13 * d);
                mMLiveTranscodingUser5.height = (int) (d14 * d2);
                mMLiveTranscoding9.transcodingUserMap.put(string3, mMLiveTranscodingUser5);
                this.f132n2.transcodingExtraInfo = m139x5(string);
                i5++;
                jSONArray = jSONArray2;
                str7 = str4;
                i4 = i;
                d4 = 1.0d;
                str9 = str2;
            } else {
                str2 = str9;
            }
            if (jSONObject3 == null) {
                d = d4;
            } else {
                d = d4;
            }
            if (jSONObject3 != null) {
                i = i4;
                str3 = str8;
                if (jSONObject3.has(str3)) {
                    d2 = jSONObject3.getDouble(str3);
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
                    MMLiveTranscoding mMLiveTranscoding10 = this.f132n2;
                    double d15 = mMLiveTranscoding10.width;
                    mMLiveTranscodingUser6.posx = (int) (d5 * d15);
                    double d16 = mMLiveTranscoding10.height;
                    mMLiveTranscodingUser6.posy = (int) (d16 * d6);
                    mMLiveTranscodingUser6.width = (int) (d15 * d);
                    mMLiveTranscodingUser6.height = (int) (d16 * d2);
                    mMLiveTranscoding10.transcodingUserMap.put(string3, mMLiveTranscodingUser6);
                    this.f132n2.transcodingExtraInfo = m139x5(string);
                    i5++;
                    jSONArray = jSONArray2;
                    str7 = str4;
                    i4 = i;
                    d4 = 1.0d;
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
                MMLiveTranscoding mMLiveTranscoding11 = this.f132n2;
                double d17 = mMLiveTranscoding11.width;
                mMLiveTranscodingUser7.posx = (int) (d5 * d17);
                double d18 = mMLiveTranscoding11.height;
                mMLiveTranscodingUser7.posy = (int) (d18 * d6);
                mMLiveTranscodingUser7.width = (int) (d17 * d);
                mMLiveTranscodingUser7.height = (int) (d18 * d2);
                mMLiveTranscoding11.transcodingUserMap.put(string3, mMLiveTranscodingUser7);
                this.f132n2.transcodingExtraInfo = m139x5(string);
                i5++;
                jSONArray = jSONArray2;
                str7 = str4;
                i4 = i;
                d4 = 1.0d;
                str9 = str2;
            } else {
                i = i4;
                str3 = str8;
            }
            d2 = d4;
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
                MMLiveTranscoding mMLiveTranscoding12 = this.f132n2;
                double d19 = mMLiveTranscoding12.width;
                mMLiveTranscodingUser8.posx = (int) (d5 * d19);
                double d110 = mMLiveTranscoding12.height;
                mMLiveTranscodingUser8.posy = (int) (d110 * d6);
                mMLiveTranscodingUser8.width = (int) (d19 * d);
                mMLiveTranscodingUser8.height = (int) (d110 * d2);
                mMLiveTranscoding12.transcodingUserMap.put(string3, mMLiveTranscodingUser8);
                this.f132n2.transcodingExtraInfo = m139x5(string);
                i5++;
                jSONArray = jSONArray2;
                str7 = str4;
                i4 = i;
                d4 = 1.0d;
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
            MMLiveTranscoding mMLiveTranscoding13 = this.f132n2;
            double d111 = mMLiveTranscoding13.width;
            mMLiveTranscodingUser9.posx = (int) (d5 * d111);
            double d112 = mMLiveTranscoding13.height;
            mMLiveTranscodingUser9.posy = (int) (d112 * d6);
            mMLiveTranscodingUser9.width = (int) (d111 * d);
            mMLiveTranscodingUser9.height = (int) (d112 * d2);
            mMLiveTranscoding13.transcodingUserMap.put(string3, mMLiveTranscodingUser9);
            this.f132n2.transcodingExtraInfo = m139x5(string);
            i5++;
            jSONArray = jSONArray2;
            str7 = str4;
            i4 = i;
            d4 = 1.0d;
            str9 = str2;
        }
        m79c5(((vlw) this.f136p1).v0);
    }

    /* JADX INFO: renamed from: x1 */
    public long m316x1() {
        return this.f127l1 * 1024;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x016c A[Catch: JSONException -> 0x01d7, TryCatch #0 {JSONException -> 0x01d7, blocks: (B:15:0x0057, B:18:0x0064, B:20:0x006a, B:23:0x0072, B:25:0x007d, B:28:0x0085, B:30:0x008b, B:33:0x00dd, B:37:0x00e6, B:39:0x00ec, B:41:0x00f4, B:43:0x00fa, B:46:0x0102, B:48:0x0108, B:51:0x0111, B:53:0x0117, B:56:0x0120, B:58:0x0126, B:61:0x012f, B:63:0x0135, B:66:0x013e, B:68:0x0144, B:71:0x014d, B:73:0x0155, B:77:0x016c, B:79:0x0176, B:81:0x017e, B:31:0x00d7), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0176 A[Catch: JSONException -> 0x01d7, TryCatch #0 {JSONException -> 0x01d7, blocks: (B:15:0x0057, B:18:0x0064, B:20:0x006a, B:23:0x0072, B:25:0x007d, B:28:0x0085, B:30:0x008b, B:33:0x00dd, B:37:0x00e6, B:39:0x00ec, B:41:0x00f4, B:43:0x00fa, B:46:0x0102, B:48:0x0108, B:51:0x0111, B:53:0x0117, B:56:0x0120, B:58:0x0126, B:61:0x012f, B:63:0x0135, B:66:0x013e, B:68:0x0144, B:71:0x014d, B:73:0x0155, B:77:0x016c, B:79:0x0176, B:81:0x017e, B:31:0x00d7), top: B:88:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX INFO: renamed from: x6 */
    public void m317x6(String str) {
        JSONArray jSONArray;
        String str2;
        int i;
        String str3;
        String str4 = "z";
        String str5 = "h";
        String str6 = "w";
        String str7 = "y";
        if (this.f136p1 == null || str == null) {
            return;
        }
        MMLiveTranscoding mMLiveTranscoding = this.f132n2;
        if (mMLiveTranscoding == null) {
            this.f132n2 = new MMLiveTranscoding();
        } else {
            mMLiveTranscoding.transcodingUserMap.clear();
        }
        MMLiveTranscoding mMLiveTranscoding2 = this.f132n2;
        qmr qmrVar = this.f136p1;
        String str8 = "renderMode";
        String str9 = "alpha";
        double d = ((ulw) qmrVar).k;
        mMLiveTranscoding2.width = d;
        double d2 = ((ulw) qmrVar).l;
        mMLiveTranscoding2.height = d2;
        mMLiveTranscoding2.videoGop = 15;
        if (d <= 0.0d || d2 <= 0.0d) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.has("mid") ? jSONObject.getString("mid") : "";
            if (TextUtils.isEmpty(string)) {
                return;
            }
            int i2 = 1;
            if (jSONObject.has("conf")) {
                jSONArray = jSONObject.getJSONArray("conf");
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
                    MMLiveTranscoding mMLiveTranscoding3 = this.f132n2;
                    double d3 = mMLiveTranscoding3.width;
                    mMLiveTranscodingUser.posx = (int) (d3 * 0.02280000038444996d);
                    double d4 = mMLiveTranscoding3.height;
                    mMLiveTranscodingUser.posy = (int) (d4 * 0.0d);
                    mMLiveTranscodingUser.width = (int) (0.2614000141620636d * d3);
                    mMLiveTranscodingUser.height = (int) (0.2500399947166443d * d4);
                    mMLiveTranscoding3.transcodingUserMap.put(string, mMLiveTranscodingUser);
                    this.f132n2.transcodingExtraInfo = m139x5(this.f35D1);
                }
            }
            if (jSONArray != null && jSONArray.length() != 0) {
                int i3 = 0;
                while (i3 < jSONArray.length()) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i3);
                    String string2 = (jSONObject2 == null || !jSONObject2.has("id")) ? "" : jSONObject2.getString("id");
                    double d5 = (jSONObject2 == null || !jSONObject2.has("x")) ? 0.0d : jSONObject2.getDouble("x");
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
                        MMLiveTranscoding mMLiveTranscoding4 = this.f132n2;
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
                        this.f132n2.transcodingExtraInfo = m139x5(this.f35D1);
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
                    MMLiveTranscoding mMLiveTranscoding5 = this.f132n2;
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
                    this.f132n2.transcodingExtraInfo = m139x5(this.f35D1);
                    str6 = str12;
                    str4 = str4;
                    str5 = str5;
                    str7 = str13;
                    str8 = str3;
                    i3 = i + 1;
                    str9 = str2;
                    i2 = 1;
                }
                m79c5(((vlw) this.f136p1).v0);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m318y(int i, int i2) {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.enableAudioVolumeIndication(i, i2);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m319y0(int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: y5 */
    public float m320y5() {
        return this.f122j1;
    }

    /* JADX INFO: renamed from: y6 */
    public void m321y6(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        float f2 = f * 1.8f;
        this.f120i1 = f2;
        ((MediaBaseCodecFilter) this).H.H0 = f2;
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            mMRtcEngine.adjustRecordingSignalVolume((int) (f2 * 100.0f));
        }
    }

    /* JADX INFO: renamed from: z5 */
    public long m322z5() {
        MMRtcEngine mMRtcEngine = this.f86U;
        if (mMRtcEngine != null) {
            return mMRtcEngine.getAudioMixingDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: z6 */
    public void m323z6(boolean z, int i) {
    }

    /* JADX INFO: renamed from: K1 */
    public void m176K1(mpd0 mpd0Var) {
    }

    /* JADX INFO: renamed from: L4 */
    public void m183L4(wmw wmwVar) {
    }

    /* JADX INFO: renamed from: O4 */
    public void m196O4(xmw xmwVar) {
    }

    /* JADX INFO: renamed from: W4 */
    public void m225W4(anw anwVar) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m279l0(vlw vlwVar, EGLContext eGLContext) {
    }

    public MoMoRtcPushFilter(Context context, yw00 yw00Var, hu00.a aVar, vlw vlwVar, String str) {
        super(context);
        this.f79S = "MoMoRtcPushFilter";
        this.f83T = true;
        this.f89V = -1;
        this.f95X = false;
        this.f98Y = false;
        this.f101Z = false;
        this.f124k0 = 0;
        this.f135p0 = 0;
        this.f37E0 = false;
        this.f40F0 = true;
        this.f43G0 = null;
        this.f52J0 = 0L;
        this.f55K0 = 0;
        this.f58L0 = 0;
        this.f61M0 = 0L;
        this.f64N0 = 0L;
        this.f67O0 = 0L;
        this.f80S0 = new PipelineConcurrentHashMap<>();
        this.f84T0 = new PipelineConcurrentHashMap<>();
        this.f87U0 = false;
        this.f90V0 = true;
        this.f93W0 = 0;
        this.f96X0 = 0;
        this.f99Y0 = 0;
        this.f102Z0 = "1e6127d73cd4d405905aa6f2ad5e1a67";
        this.f104a1 = null;
        this.f106b1 = null;
        this.f108c1 = null;
        this.f110d1 = null;
        this.f114f1 = false;
        this.f116g1 = false;
        this.f120i1 = 1.8f;
        this.f122j1 = 1.0f;
        this.f125k1 = 44100;
        this.f127l1 = 0;
        this.f129m1 = 0;
        this.f131n1 = 0;
        this.f133o1 = 0;
        this.f138q1 = -1;
        this.f142s1 = null;
        this.f144t1 = 1;
        this.f146u1 = new Object();
        this.f148v1 = 0;
        this.f152x1 = false;
        this.f154y1 = false;
        this.f156z1 = false;
        this.f29A1 = new Object();
        this.f31B1 = new PipelineConcurrentHashMap();
        this.f33C1 = false;
        this.f41F1 = null;
        this.f47H1 = 0;
        this.f50I1 = 750000;
        this.f53J1 = "";
        this.f56K1 = false;
        this.f59L1 = false;
        this.f62M1 = false;
        this.f65N1 = 0.0f;
        this.f68O1 = 0.0f;
        this.f71P1 = 0.0f;
        this.f74Q1 = 0.0f;
        this.f81S1 = null;
        this.f85T1 = null;
        this.f107b2 = null;
        this.f113e2 = new zmw();
        this.f115f2 = new zmw();
        this.f117g2 = new jjw();
        this.f119h2 = new vmw();
        this.f123j2 = false;
        this.f126k2 = false;
        this.f128l2 = true;
        this.f130m2 = false;
        this.f132n2 = null;
        this.f134o2 = false;
        this.f141r2 = "";
        this.f143s2 = 15;
        this.f145t2 = 0L;
        this.f147u2 = null;
        this.f149v2 = null;
        this.f151w2 = ByteBuffer.allocate(8192);
        this.f153x2 = ByteBuffer.allocate(8192);
        this.f30A2 = null;
        this.f32B2 = null;
        this.f34C2 = new ArrayMap();
        this.f36D2 = null;
        this.f39E2 = false;
        this.f42F2 = new Handler(Looper.getMainLooper());
        this.f45G2 = false;
        this.f48H2 = false;
        this.f54J2 = 0;
        this.f57K2 = 0;
        this.f60L2 = false;
        this.f63M2 = false;
        this.f66N2 = 0L;
        this.f69O2 = false;
        this.f72P2 = 0;
        this.f75Q2 = false;
        this.f78R2 = false;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.momo.piplineext.codec.MoMoRtcPushFilter.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent.getAction().equals("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                    if (intent.getIntExtra("state", 0) == 0) {
                        if (MoMoRtcPushFilter.this.f86U == null || true != fjx.R().D()) {
                            return;
                        }
                        MoMoRtcPushFilter.this.f86U.setParameters("{\"che.audio.enable.ns\":true}");
                        return;
                    }
                    if (intent.getIntExtra("state", 0) == 1 && MoMoRtcPushFilter.this.f86U != null && true == fjx.R().D()) {
                        MoMoRtcPushFilter.this.f86U.setParameters("{\"che.audio.enable.ns\":false}");
                    }
                }
            }
        };
        this.f82S2 = broadcastReceiver;
        this.f102Z0 = str;
        ContextUtils.initialize(context);
        this.f46H0 = yw00Var;
        this.f136p1 = (qmr) vlwVar;
        this.f87U0 = false;
        this.f90V0 = true;
        this.f118h1 = aVar;
        m102m5(vlwVar);
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.d = 260L;
        zmxVar.e1 = String.valueOf(hashCode());
        ((MediaBaseCodecFilter) this).H.f1 = 1L;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        if (context != null) {
            ii5.l(context, broadcastReceiver, intentFilter);
        }
    }
}
