package p007l;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.immomo.mediacore.audio.AudioVolumeWeight;
import com.immomo.mediacore.audio.pcmDataAvailableCallback;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcClientRoleChangedHandler;
import com.immomo.mediacore.coninf.MRtcConnectHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.coninf.MRtcExitRoomHandler;
import com.immomo.mediacore.coninf.MRtcPusherHandler;
import com.immomo.mediacore.coninf.MRtcQualityHandler;
import com.immomo.mediacore.coninf.MRtcRealLayoutNotifyHander;
import com.immomo.mediacore.coninf.MRtcReceiveSeiHandler;
import com.immomo.mediacore.coninf.MRtcTokenWillExpireHander;
import com.immomo.mediacore.sink.CongressUtil;
import com.immomo.medialog.LogLevel;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import com.momo.piplineext.RendererCommon;
import com.momo.piplineext.http.HttpWrapper;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.momo.xeengine.gift.GiftLogEvent;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.video.YuvConverter;
import io.agora.rtc2.ClientRoleOptions;
import io.agora.rtc2.Constants;
import io.agora.rtc2.IAudioFrameObserver;
import io.agora.rtc2.IMetadataObserver;
import io.agora.rtc2.IRtcEngineEventHandler;
import io.agora.rtc2.RtcEngine;
import io.agora.rtc2.SimulcastStreamConfig;
import io.agora.rtc2.audio.AudioParams;
import io.agora.rtc2.internal.RtcEngineImpl;
import io.agora.rtc2.live.LiveTranscoding;
import io.agora.rtc2.video.AgoraImage;
import io.agora.rtc2.video.AgoraMetadata;
import io.agora.rtc2.video.AgoraVideoFrame;
import io.agora.rtc2.video.ChannelMediaInfo;
import io.agora.rtc2.video.ChannelMediaRelayConfiguration;
import io.agora.rtc2.video.VideoCanvas;
import io.agora.rtc2.video.VideoEncoderConfiguration;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l.a2l0;
import l.a9y;
import l.ab1;
import l.anw;
import l.b2l0;
import l.cbl0;
import l.ccj;
import l.dix;
import l.dxl;
import l.eix;
import l.ewl;
import l.eyx;
import l.fa1;
import l.fjx;
import l.gw00;
import l.hjx;
import l.hmx;
import l.hu00;
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
import l.xxx;
import l.ya1;
import l.ymw;
import l.yw00;
import l.z1l0;
import l.za1;
import l.zmw;
import l.zmx;
import l.ztk;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class xc0 extends MediaBaseCodecFilter implements IAudioFrameObserver, sml, ewl, gw00.f {

    /* JADX INFO: renamed from: D3 */
    private static final float[] f5091D3 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A1 */
    private volatile boolean f5092A1;

    /* JADX INFO: renamed from: A2 */
    public final int f5093A2;

    /* JADX INFO: renamed from: A3 */
    private boolean f5094A3;

    /* JADX INFO: renamed from: B1 */
    private String f5095B1;

    /* JADX INFO: renamed from: B2 */
    public final int f5096B2;

    /* JADX INFO: renamed from: B3 */
    private MRtcPusherHandler f5097B3;

    /* JADX INFO: renamed from: C1 */
    private String f5098C1;

    /* JADX INFO: renamed from: C2 */
    public final int f5099C2;

    /* JADX INFO: renamed from: C3 */
    private boolean f5100C3;

    /* JADX INFO: renamed from: D1 */
    public SurfaceTexture f5101D1;

    /* JADX INFO: renamed from: D2 */
    private boolean f5102D2;

    /* JADX INFO: renamed from: E0 */
    private int f5103E0;

    /* JADX INFO: renamed from: E1 */
    private CongressUtil f5104E1;

    /* JADX INFO: renamed from: E2 */
    private long f5105E2;

    /* JADX INFO: renamed from: F0 */
    private int f5106F0;

    /* JADX INFO: renamed from: F1 */
    private pcmDataAvailableCallback f5107F1;

    /* JADX INFO: renamed from: F2 */
    private long f5108F2;

    /* JADX INFO: renamed from: G0 */
    private boolean f5109G0;

    /* JADX INFO: renamed from: G1 */
    private int f5110G1;

    /* JADX INFO: renamed from: G2 */
    MRtcReceiveSeiHandler f5111G2;

    /* JADX INFO: renamed from: H0 */
    private boolean f5112H0;

    /* JADX INFO: renamed from: H1 */
    private int f5113H1;

    /* JADX INFO: renamed from: H2 */
    private MRtcExitRoomHandler f5114H2;

    /* JADX INFO: renamed from: I0 */
    private String f5115I0;

    /* JADX INFO: renamed from: I1 */
    private int f5116I1;

    /* JADX INFO: renamed from: I2 */
    private hgd0 f5117I2;

    /* JADX INFO: renamed from: J0 */
    private yw00 f5118J0;

    /* JADX INFO: renamed from: J1 */
    private int f5119J1;

    /* JADX INFO: renamed from: J2 */
    private int f5120J2;

    /* JADX INFO: renamed from: K0 */
    private wb1 f5121K0;

    /* JADX INFO: renamed from: K1 */
    private String f5122K1;

    /* JADX INFO: renamed from: K2 */
    private long f5123K2;

    /* JADX INFO: renamed from: L0 */
    private long f5124L0;

    /* JADX INFO: renamed from: L1 */
    private boolean f5125L1;

    /* JADX INFO: renamed from: L2 */
    private Runnable f5126L2;

    /* JADX INFO: renamed from: M0 */
    private int f5127M0;

    /* JADX INFO: renamed from: M1 */
    IRtcEngineEventHandler f5128M1;

    /* JADX INFO: renamed from: M2 */
    private boolean f5129M2;

    /* JADX INFO: renamed from: N0 */
    private long f5130N0;

    /* JADX INFO: renamed from: N1 */
    Runnable f5131N1;

    /* JADX INFO: renamed from: N2 */
    private float f5132N2;

    /* JADX INFO: renamed from: O0 */
    private IRtcEngineEventHandler.RtcStats f5133O0;

    /* JADX INFO: renamed from: O1 */
    private IRtcEngineEventHandler.AudioVolumeInfo[] f5134O1;

    /* JADX INFO: renamed from: O2 */
    private float f5135O2;

    /* JADX INFO: renamed from: P0 */
    private IRtcEngineEventHandler.RemoteVideoStats f5136P0;

    /* JADX INFO: renamed from: P1 */
    private MRtcAudioHandler f5137P1;

    /* JADX INFO: renamed from: P2 */
    private float f5138P2;

    /* JADX INFO: renamed from: Q0 */
    private IRtcEngineEventHandler.LocalVideoStats f5139Q0;

    /* JADX INFO: renamed from: Q1 */
    private MRtcAudioHandlerEx f5140Q1;

    /* JADX INFO: renamed from: Q2 */
    private float f5141Q2;

    /* JADX INFO: renamed from: R0 */
    private PipelineConcurrentHashMap<Long, ley> f5142R0;

    /* JADX INFO: renamed from: R1 */
    private MRtcEventHandler f5143R1;

    /* JADX INFO: renamed from: R2 */
    private int f5144R2;

    /* JADX INFO: renamed from: S */
    private final String f5145S;

    /* JADX INFO: renamed from: S0 */
    private PipelineConcurrentHashMap<Long, a9y> f5146S0;

    /* JADX INFO: renamed from: S1 */
    private MRtcChannelHandler f5147S1;

    /* JADX INFO: renamed from: S2 */
    private int f5148S2;

    /* JADX INFO: renamed from: T */
    private boolean f5149T;

    /* JADX INFO: renamed from: T0 */
    private boolean f5150T0;

    /* JADX INFO: renamed from: T1 */
    private MRtcTokenWillExpireHander f5151T1;

    /* JADX INFO: renamed from: T2 */
    private int f5152T2;

    /* JADX INFO: renamed from: U */
    private RtcEngine f5153U;

    /* JADX INFO: renamed from: U0 */
    private boolean f5154U0;

    /* JADX INFO: renamed from: U1 */
    private ymw f5155U1;

    /* JADX INFO: renamed from: U2 */
    private int f5156U2;

    /* JADX INFO: renamed from: V */
    private int f5157V;

    /* JADX INFO: renamed from: V0 */
    private int f5158V0;

    /* JADX INFO: renamed from: V1 */
    private MRtcQualityHandler f5159V1;

    /* JADX INFO: renamed from: V2 */
    private boolean f5160V2;

    /* JADX INFO: renamed from: W */
    private EGLContext f5161W;

    /* JADX INFO: renamed from: W0 */
    private int f5162W0;

    /* JADX INFO: renamed from: W1 */
    private MRtcConnectHandler f5163W1;

    /* JADX INFO: renamed from: W2 */
    private boolean f5164W2;

    /* JADX INFO: renamed from: X */
    private volatile boolean f5165X;

    /* JADX INFO: renamed from: X0 */
    private volatile int f5166X0;

    /* JADX INFO: renamed from: X1 */
    private MRtcClientRoleChangedHandler f5167X1;

    /* JADX INFO: renamed from: X2 */
    public int f5168X2;

    /* JADX INFO: renamed from: Y */
    private boolean f5169Y;

    /* JADX INFO: renamed from: Y0 */
    private String f5170Y0;

    /* JADX INFO: renamed from: Y1 */
    private zmw f5171Y1;

    /* JADX INFO: renamed from: Y2 */
    private boolean f5172Y2;

    /* JADX INFO: renamed from: Z */
    private boolean f5173Z;

    /* JADX INFO: renamed from: Z0 */
    private z1l0 f5174Z0;

    /* JADX INFO: renamed from: Z1 */
    private zmw f5175Z1;

    /* JADX INFO: renamed from: Z2 */
    private PipelineConcurrentHashMap f5176Z2;

    /* JADX INFO: renamed from: a1 */
    private a2l0 f5177a1;

    /* JADX INFO: renamed from: a2 */
    private jjw f5178a2;

    /* JADX INFO: renamed from: a3 */
    private ArrayList<Integer> f5179a3;

    /* JADX INFO: renamed from: b1 */
    private cbl0 f5180b1;

    /* JADX INFO: renamed from: b2 */
    private vmw f5181b2;

    /* JADX INFO: renamed from: b3 */
    private String f5182b3;

    /* JADX INFO: renamed from: c1 */
    private b2l0 f5183c1;

    /* JADX INFO: renamed from: c2 */
    private C0774l f5184c2;

    /* JADX INFO: renamed from: c3 */
    private boolean f5185c3;

    /* JADX INFO: renamed from: d1 */
    private sml.a f5186d1;

    /* JADX INFO: renamed from: d2 */
    private boolean f5187d2;

    /* JADX INFO: renamed from: d3 */
    private int f5188d3;

    /* JADX INFO: renamed from: e1 */
    private boolean f5189e1;

    /* JADX INFO: renamed from: e2 */
    private boolean f5190e2;

    /* JADX INFO: renamed from: e3 */
    private boolean f5191e3;

    /* JADX INFO: renamed from: f1 */
    private boolean f5192f1;

    /* JADX INFO: renamed from: f2 */
    private boolean f5193f2;

    /* JADX INFO: renamed from: f3 */
    private boolean f5194f3;

    /* JADX INFO: renamed from: g1 */
    private hu00.a f5195g1;

    /* JADX INFO: renamed from: g2 */
    private boolean f5196g2;

    /* JADX INFO: renamed from: g3 */
    private long f5197g3;

    /* JADX INFO: renamed from: h1 */
    private float f5198h1;

    /* JADX INFO: renamed from: h2 */
    private LiveTranscoding f5199h2;

    /* JADX INFO: renamed from: h3 */
    private long f5200h3;

    /* JADX INFO: renamed from: i1 */
    private float f5201i1;

    /* JADX INFO: renamed from: i2 */
    private boolean f5202i2;

    /* JADX INFO: renamed from: i3 */
    private int f5203i3;

    /* JADX INFO: renamed from: j1 */
    public int f5204j1;

    /* JADX INFO: renamed from: j2 */
    private String f5205j2;

    /* JADX INFO: renamed from: j3 */
    private int f5206j3;

    /* JADX INFO: renamed from: k0 */
    private int f5207k0;

    /* JADX INFO: renamed from: k1 */
    private int f5208k1;

    /* JADX INFO: renamed from: k2 */
    private long f5209k2;

    /* JADX INFO: renamed from: k3 */
    private int f5210k3;

    /* JADX INFO: renamed from: l1 */
    private int f5211l1;

    /* JADX INFO: renamed from: l2 */
    private ArrayList<Integer> f5212l2;

    /* JADX INFO: renamed from: l3 */
    private Handler f5213l3;

    /* JADX INFO: renamed from: m1 */
    private int f5214m1;

    /* JADX INFO: renamed from: m2 */
    public final int f5215m2;

    /* JADX INFO: renamed from: m3 */
    private boolean f5216m3;

    /* JADX INFO: renamed from: n1 */
    private int f5217n1;

    /* JADX INFO: renamed from: n2 */
    public final int f5218n2;

    /* JADX INFO: renamed from: n3 */
    private boolean f5219n3;

    /* JADX INFO: renamed from: o1 */
    private qmr f5220o1;

    /* JADX INFO: renamed from: o2 */
    public final int f5221o2;

    /* JADX INFO: renamed from: o3 */
    private int f5222o3;

    /* JADX INFO: renamed from: p0 */
    private int f5223p0;

    /* JADX INFO: renamed from: p1 */
    protected int f5224p1;

    /* JADX INFO: renamed from: p2 */
    public final int f5225p2;

    /* JADX INFO: renamed from: p3 */
    private int f5226p3;

    /* JADX INFO: renamed from: q1 */
    private boolean f5227q1;

    /* JADX INFO: renamed from: q2 */
    public final int f5228q2;

    /* JADX INFO: renamed from: q3 */
    private int f5229q3;

    /* JADX INFO: renamed from: r1 */
    private String f5230r1;

    /* JADX INFO: renamed from: r2 */
    public final int f5231r2;

    /* JADX INFO: renamed from: r3 */
    private String f5232r3;

    /* JADX INFO: renamed from: s1 */
    private int f5233s1;

    /* JADX INFO: renamed from: s2 */
    public final int f5234s2;

    /* JADX INFO: renamed from: s3 */
    private volatile boolean f5235s3;

    /* JADX INFO: renamed from: t1 */
    private Object f5236t1;

    /* JADX INFO: renamed from: t2 */
    private final int f5237t2;

    /* JADX INFO: renamed from: t3 */
    private boolean f5238t3;

    /* JADX INFO: renamed from: u1 */
    private int f5239u1;

    /* JADX INFO: renamed from: u2 */
    private final int f5240u2;

    /* JADX INFO: renamed from: u3 */
    private long f5241u3;

    /* JADX INFO: renamed from: v1 */
    private boolean f5242v1;

    /* JADX INFO: renamed from: v2 */
    private MRtcRealLayoutNotifyHander f5243v2;

    /* JADX INFO: renamed from: v3 */
    private boolean f5244v3;

    /* JADX INFO: renamed from: w1 */
    private boolean f5245w1;

    /* JADX INFO: renamed from: w2 */
    public final int f5246w2;

    /* JADX INFO: renamed from: w3 */
    private boolean f5247w3;

    /* JADX INFO: renamed from: x1 */
    private boolean f5248x1;

    /* JADX INFO: renamed from: x2 */
    public final int f5249x2;

    /* JADX INFO: renamed from: x3 */
    private int f5250x3;

    /* JADX INFO: renamed from: y1 */
    private Object f5251y1;

    /* JADX INFO: renamed from: y2 */
    public final int f5252y2;

    /* JADX INFO: renamed from: y3 */
    private int f5253y3;

    /* JADX INFO: renamed from: z1 */
    private PipelineConcurrentHashMap f5254z1;

    /* JADX INFO: renamed from: z2 */
    public final int f5255z2;

    /* JADX INFO: renamed from: z3 */
    private volatile boolean f5256z3;

    /* JADX INFO: renamed from: l.xc0$a */
    public class RunnableC0763a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f5257a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f5258b;

        public RunnableC0763a(int i, View view) {
            this.f5257a = i;
            this.f5258b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"clear_view setupRemoteVideo", this.f5257a + ",view is " + this.f5258b});
            if (xc0.this.f5153U != null) {
                xc0.this.f5153U.setupRemoteVideo(new VideoCanvas(this.f5258b, 1, this.f5257a));
            }
        }
    }

    /* JADX INFO: renamed from: l.xc0$b */
    public class C0764b implements cbl0.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f5260a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f5261b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f5262c;

        public C0764b(int i, int i2, int i3) {
            this.f5260a = i;
            this.f5261b = i2;
            this.f5262c = i3;
        }

        /* JADX INFO: renamed from: a */
        public void m11786a(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(this.f5260a, this.f5261b);
            xc0.this.f5104E1.setVideoSurface(this.f5262c, new Surface(surfaceTexture));
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onSurfaceTextureReady surfaceTexture:" + surfaceTexture});
            ii70.d().a("Pipeline_Normal_pip->PIPLINE->AGORA", "onSurfaceTextureReady: uid=" + this.f5262c + ", size=" + this.f5260a + "x" + this.f5261b);
        }
    }

    /* JADX INFO: renamed from: l.xc0$c */
    public class RunnableC0765c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f5264a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ byte[] f5265b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f5266c;

        public RunnableC0765c(byte[] bArr, byte[] bArr2, long j) {
            this.f5264a = bArr;
            this.f5265b = bArr2;
            this.f5266c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            xc0.this.f5243v2.OnRealLayoutChange(this.f5264a, this.f5265b, 1, this.f5266c);
        }
    }

    /* JADX INFO: renamed from: l.xc0$f */
    public class RunnableC0768f implements Runnable {
        public RunnableC0768f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (xc0.this.f5195g1 != null) {
                xc0.this.f5195g1.g(4353, 10, 0, xc0.this);
            }
            if (xc0.this.f5143R1 != null) {
                xc0.this.f5143R1.onConnectionLost();
            }
            ((MediaBaseCodecFilter) xc0.this).H.y0 = 812L;
            ((MediaBaseCodecFilter) xc0.this).H.k0 = 812;
            xc0.this.f5206j3 = 1;
            xc0.this.e2(4353, 10);
            if (((MediaBaseCodecFilter) xc0.this).I != null) {
                ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"configConnectLost", "errorcode 812"});
            }
            xc0.this.m11708f();
        }
    }

    /* JADX INFO: renamed from: l.xc0$g */
    public class C0769g implements IMetadataObserver {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f5273a;

        public C0769g(long j) {
            this.f5273a = j;
        }

        public int getMaxMetadataSize() {
            if (!xc0.this.f5160V2) {
                return 0;
            }
            boolean z = xc0.this.f5185c3;
            xc0 xc0Var = xc0.this;
            if (z) {
                if (TextUtils.isEmpty(xc0Var.f5182b3)) {
                    return 1024;
                }
                xc0.this.f5182b3.getClass();
                return 1024;
            }
            String str = xc0Var.f5095B1;
            xc0 xc0Var2 = xc0.this;
            if (str != null) {
                int length = xc0Var2.m11567v6(xc0Var2.f5095B1).getBytes().length;
                return 1024;
            }
            if (xc0Var2.f5098C1 == null) {
                return 1024;
            }
            int length2 = xc0.this.f5098C1.getBytes().length;
            return 1024;
        }

        public void onMetadataReceived(AgoraMetadata agoraMetadata) {
            if (agoraMetadata == null || agoraMetadata.data == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(agoraMetadata.data));
                if (jSONObject.has("bType")) {
                    int iOptInt = jSONObject.optInt("bType");
                    ((MediaBaseCodecFilter) xc0.this).H.s = iOptInt;
                    hjx.d("Pipeline_Normal_pip->PIPLINE->AGORA", "onReceiveSEI getbType: " + iOptInt);
                }
                if (jSONObject.has("ts")) {
                    long jX = fjx.R().X() - Long.valueOf(jSONObject.optString("ts")).longValue();
                    ley leyVar = (ley) xc0.this.f5142R0.get(Long.valueOf(this.f5273a));
                    if (leyVar != null) {
                        leyVar.E++;
                        leyVar.D = (int) (((long) leyVar.D) + jX);
                    }
                }
            } catch (Exception e) {
                ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onMetadataReceived error", "" + e.toString()});
            }
            xc0 xc0Var = xc0.this;
            if (xc0Var.f5111G2 == null || xc0Var.f5220o1 == null) {
                return;
            }
            xc0 xc0Var2 = xc0.this;
            xc0Var2.f5111G2.OnReceiveH264Sei(agoraMetadata.data, ((vlw) xc0Var2.f5220o1).B0, "");
        }

        public byte[] onReadyToSendMetadata(long j, int i) {
            if (xc0.this.f5105E2 == Long.MIN_VALUE) {
                xc0.this.f5105E2 = System.currentTimeMillis();
            }
            byte[] bytes = null;
            if (xc0.this.f5160V2 && System.currentTimeMillis() - xc0.this.f5105E2 > xc0.this.f5108F2) {
                boolean z = xc0.this.f5244v3;
                xc0 xc0Var = xc0.this;
                if (z) {
                    try {
                        JSONObject jSONObject = new JSONObject("" + xc0Var.f5095B1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("asr", 44100);
                        int i2 = xc0.this.f5199h2.audioBitrate;
                        if (i2 < 1000) {
                            i2 *= LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE;
                        }
                        jSONObject2.put("abr", i2);
                        jSONObject2.put("achl", xc0.this.f5199h2.audioChannels);
                        jSONObject2.put("acpf", LiveTranscoding.AudioCodecProfileType.getValue(xc0.this.f5199h2.audioCodecProfile));
                        jSONObject2.put("w", ((ulw) ((MediaBaseCodecFilter) xc0.this).s).k);
                        jSONObject2.put("h", ((ulw) ((MediaBaseCodecFilter) xc0.this).s).l);
                        jSONObject2.put("gop", ((ulw) ((MediaBaseCodecFilter) xc0.this).s).G);
                        jSONObject2.put("fps", ((ulw) ((MediaBaseCodecFilter) xc0.this).s).F);
                        jSONObject2.put("vbr", ((ulw) ((MediaBaseCodecFilter) xc0.this).s).H);
                        jSONObject2.put("vcpf", ((MediaBaseCodecFilter) xc0.this).s.H0 ? 2 : 1);
                        jSONObject.put("mixInfo", jSONObject2);
                        bytes = jSONObject.toString().getBytes();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    boolean z2 = xc0Var.f5185c3;
                    xc0 xc0Var2 = xc0.this;
                    if (!z2) {
                        String str = xc0Var2.f5095B1;
                        xc0 xc0Var3 = xc0.this;
                        if (str != null) {
                            bytes = xc0Var3.m11567v6(xc0Var3.f5095B1).getBytes();
                        } else if (xc0Var3.f5098C1 != null) {
                            bytes = xc0.this.f5098C1.getBytes();
                        }
                    } else if (!TextUtils.isEmpty(xc0Var2.f5182b3)) {
                        bytes = xc0.this.f5182b3.getBytes();
                    }
                }
                xc0.this.f5105E2 = System.currentTimeMillis();
            }
            return bytes;
        }
    }

    /* JADX INFO: renamed from: l.xc0$h */
    public class RunnableC0770h implements Runnable {
        public RunnableC0770h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xc0.this.m11708f();
        }
    }

    /* JADX INFO: renamed from: l.xc0$i */
    public class RunnableC0771i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f5276a;

        public RunnableC0771i(int i) {
            this.f5276a = i;
        }

        @Override // java.lang.Runnable
        @RequiresApi(api = 15)
        public void run() {
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"old handleVideoRenderStart"});
            xc0.this.m11583z6(this.f5276a);
        }
    }

    /* JADX INFO: renamed from: l.xc0$k */
    public class C0773k implements cbl0.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f5280a;

        public C0773k(int i) {
            this.f5280a = i;
        }

        /* JADX INFO: renamed from: a */
        public void m11787a(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(((ccj) xc0.this).width, ((ccj) xc0.this).height);
            xc0.this.f5104E1.setVideoSurface(this.f5280a, new Surface(surfaceTexture));
        }
    }

    /* JADX INFO: renamed from: l.xc0$l */
    public class C0774l extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f5282a;

        public C0774l(String str) {
            super(str);
            this.f5282a = false;
        }

        /* JADX INFO: renamed from: a */
        public void m11788a() {
            this.f5282a = true;
            ii70.d().c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f5282a) {
                try {
                    Thread.sleep(66L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ztk.f == null) {
                    ztk.f = new byte[((((ulw) xc0.this.f5220o1).m * ((ulw) xc0.this.f5220o1).n) * 3) / 2];
                }
                xc0.this.m11751o1(ByteBuffer.wrap(ztk.f));
            }
        }
    }

    public xc0(Context context, yw00 yw00Var, hu00.a aVar, vlw vlwVar, String str) {
        super(context);
        this.f5145S = "Pipeline_Normal_pip->PIPLINE->AGORA";
        this.f5149T = true;
        this.f5157V = -1;
        this.f5165X = false;
        this.f5169Y = false;
        this.f5173Z = false;
        this.f5207k0 = 2;
        this.f5223p0 = 3;
        this.f5103E0 = -1;
        this.f5106F0 = -1;
        this.f5109G0 = false;
        this.f5112H0 = true;
        this.f5115I0 = null;
        this.f5124L0 = 0L;
        this.f5127M0 = 0;
        this.f5130N0 = 0L;
        this.f5142R0 = new PipelineConcurrentHashMap<>();
        this.f5146S0 = new PipelineConcurrentHashMap<>();
        this.f5150T0 = false;
        this.f5154U0 = true;
        this.f5158V0 = 0;
        this.f5162W0 = 0;
        this.f5166X0 = 0;
        this.f5170Y0 = null;
        this.f5174Z0 = null;
        this.f5177a1 = null;
        this.f5180b1 = null;
        this.f5183c1 = null;
        this.f5189e1 = false;
        this.f5192f1 = false;
        this.f5198h1 = 1.0f;
        this.f5201i1 = 1.0f;
        this.f5204j1 = 44100;
        this.f5208k1 = 0;
        this.f5211l1 = 0;
        this.f5214m1 = 0;
        this.f5217n1 = 0;
        this.f5224p1 = -1;
        this.f5230r1 = null;
        this.f5233s1 = 1;
        this.f5236t1 = new Object();
        this.f5239u1 = 0;
        this.f5242v1 = false;
        this.f5245w1 = false;
        this.f5248x1 = false;
        this.f5251y1 = new Object();
        this.f5254z1 = new PipelineConcurrentHashMap();
        this.f5092A1 = false;
        this.f5101D1 = null;
        this.f5104E1 = null;
        this.f5110G1 = 0;
        this.f5113H1 = 2;
        this.f5116I1 = 750;
        this.f5119J1 = 0;
        this.f5122K1 = "";
        this.f5125L1 = false;
        this.f5131N1 = null;
        this.f5134O1 = null;
        this.f5171Y1 = new zmw();
        this.f5175Z1 = new zmw();
        this.f5178a2 = new jjw();
        this.f5181b2 = new vmw();
        this.f5187d2 = false;
        this.f5190e2 = false;
        this.f5193f2 = true;
        this.f5196g2 = false;
        this.f5199h2 = null;
        this.f5202i2 = false;
        this.f5209k2 = 0L;
        this.f5212l2 = new ArrayList<>(20);
        this.f5215m2 = 0;
        this.f5218n2 = 1;
        this.f5221o2 = 2;
        this.f5225p2 = 3;
        this.f5228q2 = 4;
        this.f5231r2 = 5;
        this.f5234s2 = 6;
        this.f5237t2 = 7;
        this.f5240u2 = 8;
        this.f5243v2 = null;
        this.f5246w2 = 0;
        this.f5249x2 = 1;
        this.f5252y2 = 2;
        this.f5255z2 = 3;
        this.f5093A2 = 0;
        this.f5096B2 = 1;
        this.f5099C2 = 2;
        this.f5102D2 = false;
        this.f5105E2 = Long.MIN_VALUE;
        this.f5108F2 = 1000L;
        this.f5111G2 = null;
        this.f5120J2 = 1;
        this.f5123K2 = System.currentTimeMillis();
        this.f5126L2 = null;
        this.f5129M2 = false;
        this.f5132N2 = 0.0f;
        this.f5135O2 = 0.0f;
        this.f5138P2 = 0.0f;
        this.f5141Q2 = 0.0f;
        this.f5144R2 = 0;
        this.f5148S2 = 0;
        this.f5152T2 = 0;
        this.f5156U2 = 0;
        this.f5160V2 = true;
        this.f5164W2 = false;
        this.f5168X2 = 0;
        this.f5172Y2 = false;
        this.f5176Z2 = new PipelineConcurrentHashMap();
        this.f5179a3 = new ArrayList<>(20);
        this.f5182b3 = "";
        this.f5185c3 = false;
        this.f5188d3 = 0;
        this.f5191e3 = false;
        this.f5194f3 = false;
        this.f5197g3 = -1L;
        this.f5200h3 = -1L;
        this.f5203i3 = 0;
        this.f5206j3 = 0;
        this.f5210k3 = 0;
        this.f5213l3 = new Handler(Looper.getMainLooper());
        this.f5216m3 = false;
        this.f5219n3 = false;
        this.f5222o3 = 0;
        this.f5226p3 = 0;
        this.f5229q3 = 0;
        this.f5232r3 = "";
        this.f5235s3 = false;
        this.f5238t3 = false;
        this.f5241u3 = 0L;
        this.f5244v3 = false;
        this.f5247w3 = false;
        this.f5250x3 = 0;
        this.f5253y3 = 0;
        this.f5256z3 = false;
        this.f5094A3 = false;
        this.f5100C3 = false;
        this.f5170Y0 = str;
        this.f5118J0 = yw00Var;
        this.f5220o1 = (qmr) vlwVar;
        this.f5150T0 = false;
        this.f5154U0 = true;
        this.f5195g1 = aVar;
        this.f5104E1 = new CongressUtil();
        m11513h6(vlwVar);
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.d = 258L;
        zmxVar.e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }

    /* JADX INFO: renamed from: A6 */
    private int m11401A6() {
        int i = 0;
        if (!this.f5245w1 && !this.f5216m3) {
            i = 1;
        }
        return i ^ 1;
    }

    /* JADX INFO: renamed from: B6 */
    private final void m11405B6(String str, int i) {
        xc0 xc0Var;
        if (this.f5153U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"mmLiveAudioProfile:" + this.f5103E0 + ",mmLiveAudioScenario:" + this.f5106F0 + ",getAudioProfile() = " + fjx.R().t() + ",getAudioScenario()=" + fjx.R().u()});
            int i2 = this.f5103E0;
            if (i2 != -1) {
                this.f5207k0 = m11729j6(i2);
                ((MediaBaseCodecFilter) this).H.o0 = this.f5103E0;
            } else {
                int iT = fjx.R().t();
                zmx zmxVar = ((MediaBaseCodecFilter) this).H;
                if (iT != -1) {
                    zmxVar.o0 = iT;
                    this.f5207k0 = m11729j6(iT);
                } else {
                    zmxVar.o0 = 1;
                    this.f5207k0 = m11729j6(1);
                }
            }
            int i3 = this.f5106F0;
            if (i3 != -1) {
                this.f5223p0 = m11737l6(i3);
                ((MediaBaseCodecFilter) this).H.p0 = this.f5106F0;
            } else {
                int iU = fjx.R().u();
                if (iU != -1) {
                    this.f5223p0 = m11737l6(iU);
                    ((MediaBaseCodecFilter) this).H.p0 = iU;
                } else {
                    this.f5223p0 = m11737l6(0);
                    ((MediaBaseCodecFilter) this).H.p0 = 0;
                }
            }
            m11716g6(this.f5207k0, this.f5223p0);
            m11705e6(this.f5112H0);
            this.f5189e1 = false;
            this.f5153U.registerAudioFrameObserver((IAudioFrameObserver) null);
            if (this.f5242v1 || this.f5187d2 || this.f5190e2 || this.f5186d1 != null) {
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"registerAudioFrameObserver 2458"});
                this.f5153U.registerAudioFrameObserver(this);
                this.f5189e1 = true;
            }
            if (this.f5227q1) {
                m11409C6(GiftLogEvent.EVENT_ID_PLAY_SUCCESS);
            }
            m11453P7();
            RtcEngine rtcEngine = this.f5153U;
            if (rtcEngine != null && this.f5193f2) {
                rtcEngine.setDefaultAudioRoutetoSpeakerphone(true);
            }
            int i4 = this.f5119J1;
            if (i4 <= 0 && (i4 = ((vlw) this.f5220o1).S0) == 0) {
                i4 = 15;
            }
            int i5 = i4;
            qmr qmrVar = this.f5220o1;
            int i6 = ((ulw) qmrVar).k;
            if (i6 > 0) {
                xc0Var = this;
                xc0Var.m11478W5(qmrVar.f3961h1, i6, ((ulw) qmrVar).l, this.f5116I1, i5, ((vlw) qmrVar).v0);
            } else {
                xc0Var = this;
                xc0Var.m11478W5(qmrVar.f3961h1, ((ulw) qmrVar).s, ((ulw) qmrVar).t, xc0Var.f5116I1, i5, ((vlw) qmrVar).v0);
            }
            RtcEngine rtcEngine2 = xc0Var.f5153U;
            if (rtcEngine2 != null) {
                rtcEngine2.setRemoteSubscribeFallbackOption(0);
            }
            xc0Var.f5120J2 = fjx.R().o();
            xc0Var.f5126L2 = xc0Var.new RunnableC0768f();
            if (((vlw) xc0Var.f5220o1).b1 == 1) {
                xc0Var.f5153U.setParameters("{\"che.audio.force_bluetooth_a2dp\":true}");
                ((MediaBaseCodecFilter) xc0Var).I.l(new Object[]{"force_bluetooth_a2dp", "true"});
            }
            int iR = fjx.R().r();
            RtcEngine rtcEngine3 = xc0Var.f5153U;
            if (iR == 1) {
                rtcEngine3.setParameters("{\"che.audio.aiaec.working_mode\":1}");
            } else {
                rtcEngine3.setParameters("{\"che.audio.aiaec.working_mode\":0}");
            }
            int iS = fjx.R().s();
            RtcEngine rtcEngine4 = xc0Var.f5153U;
            if (iS == 1) {
                rtcEngine4.setParameters("{\"che.audio.ains_mode\":2}");
                xc0Var.f5153U.setParameters("{\"che.audio.nsng.lowerBound\":80}");
                xc0Var.f5153U.setParameters("{\"che.audio.nsng.lowerMask\":50}");
                xc0Var.f5153U.setParameters("{\"che.audio.nsng.statisticalbound\":5}");
                xc0Var.f5153U.setParameters("{\"che.audio.nsng.finallowermask\":30}");
                xc0Var.f5153U.setParameters("{\"che.audio.nsng.enhfactorstastical\":200}");
            } else {
                rtcEngine4.setParameters("{\"che.audio.ains_mode\":0}");
            }
            ((MediaBaseCodecFilter) xc0Var).I.l(new Object[]{"joinChannel", "channel:" + str + ",uid:" + i + ",token:" + xc0Var.f5230r1 + ", aec:" + fjx.R().r() + ",ns:" + fjx.R().s()});
            int iJoinChannel = xc0Var.f5153U.joinChannel(xc0Var.f5230r1, str, (String) null, i);
            hmx hmxVar = ((MediaBaseCodecFilter) xc0Var).I;
            StringBuilder sb = new StringBuilder(" ret:");
            sb.append(iJoinChannel);
            sb.append(",channel:");
            sb.append(str);
            sb.append(",uid:");
            sb.append(i);
            hmxVar.l(new Object[]{"joinChannel", sb.toString()});
            if (iJoinChannel < 0) {
                zmx zmxVar2 = ((MediaBaseCodecFilter) xc0Var).H;
                zmxVar2.y0 = 810L;
                zmxVar2.k0 = iJoinChannel;
            }
            ((MediaBaseCodecFilter) xc0Var).I.k("joinChannel", "" + iJoinChannel);
            if (iJoinChannel < 0 && xc0Var.f5143R1 != null) {
                ((MediaBaseCodecFilter) xc0Var).I.l(new Object[]{"joinChannel failed", " ret:" + iJoinChannel + "channel:" + str + ",uid:" + i});
                xc0Var.f5143R1.onJoinChannelfail(str, (long) i, iJoinChannel);
            }
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "joinChannel#############" + iJoinChannel + "xx channel" + str);
            xc0Var.f5227q1 = true;
            xc0Var.m11589B7(1.0f);
        }
    }

    /* JADX INFO: renamed from: C6 */
    private final void m11409C6(String str) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "leaveChannel >>>>>" + str);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"leaveChannel"});
        synchronized (this.f5236t1) {
            try {
                if (this.f5153U != null) {
                    if (((MediaBaseCodecFilter) this).s.v0 != null) {
                        ((MediaBaseCodecFilter) this).I.l(new Object[]{"stopRtmpStream:" + ((MediaBaseCodecFilter) this).s.v0});
                        this.f5153U.stopRtmpStream(((MediaBaseCodecFilter) this).s.v0);
                    }
                    this.f5153U.leaveChannel();
                    this.f5153U.registerAudioFrameObserver((IAudioFrameObserver) null);
                    this.f5189e1 = false;
                }
                this.f5227q1 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f5220o1.f3958e1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J7 */
    public void m11431J7(String str) {
        RtcEngine rtcEngine;
        synchronized (this.f5251y1) {
            try {
                if (!this.f5248x1 && !this.f5164W2 && (rtcEngine = this.f5153U) != null) {
                    rtcEngine.startRtmpStreamWithTranscoding(str, this.f5199h2);
                    ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onStreamPublished addPublishStreamUrl:url=" + str);
                    ((MediaBaseCodecFilter) this).I.k("setRtcEnginePublishStreamUrl", "startRtmpStreamWithTranscoding enable:" + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M6 */
    public void m11441M6() {
        if (((MediaBaseCodecFilter) this).H.c == 0) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "AGORA_PUBLISHING");
            this.f5195g1.g(4103, 0, 0, this);
            ((MediaBaseCodecFilter) this).H.c = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: N6 */
    private void m11445N6(byte[] bArr, byte[] bArr2) {
        Handler handler;
        long j = ((vlw) this.f5220o1).B0;
        if (this.f5243v2 == null || (handler = this.f5213l3) == null) {
            return;
        }
        handler.post(new RunnableC0765c(bArr, bArr2, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O7 */
    public void m11449O7(Object obj, int i, int i2) {
        za1 za1VarM346C2;
        u3m u3mVar = ((MediaBaseCodecFilter) this).K;
        if (u3mVar == null || (za1VarM346C2 = ((ExtAudioWrapper) u3mVar).m346C2()) == null) {
            return;
        }
        za1VarM346C2.a(obj, i, i2);
    }

    /* JADX INFO: renamed from: P7 */
    private void m11453P7() {
        RtcEngine rtcEngine;
        if (this.f5220o1 == null) {
            return;
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "setVideoProfileEx1 bitrate:" + ((ulw) this.f5220o1).m + "<>" + ((ulw) this.f5220o1).n + "<>" + ((ulw) this.f5220o1).H + "<mergecanvasWidth>" + ((ulw) this.f5220o1).k);
        m11705e6(this.f5112H0);
        if (this.f5245w1 || (rtcEngine = this.f5153U) == null) {
            return;
        }
        rtcEngine.setParameters("{\"che.video.keyFrameInterval\":1}");
        qmr qmrVar = this.f5220o1;
        int i = ((vlw) qmrVar).S0;
        if (i == 0) {
            i = 15;
        }
        int i2 = i;
        if (((vlw) qmrVar).F0 && qmrVar.d() == 1) {
            qmr qmrVar2 = this.f5220o1;
            m11667V7(((ulw) qmrVar2).n, ((ulw) qmrVar2).m, i2, ((ulw) qmrVar2).H / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE, ((vlw) qmrVar2).a1);
        } else {
            qmr qmrVar3 = this.f5220o1;
            m11667V7(((ulw) qmrVar3).m, ((ulw) qmrVar3).n, i2, ((ulw) qmrVar3).H / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE, ((vlw) qmrVar3).a1);
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ int m11459R4(xc0 xc0Var) {
        int i = xc0Var.f5158V0;
        xc0Var.f5158V0 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: T5 */
    private final void m11466T5(int i, int i2) {
        qmr qmrVar = this.f5220o1;
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
        m11534n8();
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.setClientRole(i);
        }
    }

    /* JADX INFO: renamed from: U5 */
    private void m11470U5(String str) {
        if (this.f5153U == null || this.f5199h2 == null) {
            return;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"configLiveTransCoding: user count" + this.f5199h2.getUsers().size() + ",mHavaPublish" + this.f5248x1});
        if (str == null || TextUtils.isEmpty(str) || this.f5199h2.getUsers().size() <= 0) {
            return;
        }
        String string = "{ \"canvas\":{ \"w\":" + this.f5199h2.width + ",\"h\":" + this.f5199h2.height + ",\"conf\":[";
        for (LiveTranscoding.TranscodingUser transcodingUser : this.f5199h2.getUsers()) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "llcqxl:<<<<<<<<<,uid:" + transcodingUser.uid + ",x:" + transcodingUser.x + ",y:" + transcodingUser.y + ",width:" + transcodingUser.width + ",height:" + transcodingUser.height + ",alpha:" + transcodingUser.alpha + ",zOrder:" + transcodingUser.zOrder + ">>>>>>>>>>");
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("{\"id\":");
            sb.append(transcodingUser.uid);
            sb.append(",\"x\":");
            sb.append(transcodingUser.x);
            sb.append(",\"y\":");
            sb.append(transcodingUser.y);
            sb.append(",\"width\":");
            sb.append(transcodingUser.width);
            sb.append(",\"height\":");
            sb.append(transcodingUser.height);
            sb.append("},");
            string = sb.toString();
        }
        String strConcat = string.concat("]");
        LiveTranscoding liveTranscoding = this.f5199h2;
        liveTranscoding.lowLatency = true;
        liveTranscoding.videoGop = 15;
        synchronized (this.f5251y1) {
            try {
                if (this.f5248x1) {
                    Log.e("lqdebug", "publishConfig:w:" + this.f5199h2.width + ",height:" + this.f5199h2.height);
                    this.f5153U.updateRtmpTranscoding(this.f5199h2);
                    m11597D6();
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"publishConfig:" + this.f5199h2.toString()});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(this.f5199h2.userConfigExtraInfo)) {
            m11445N6(strConcat.getBytes(), this.f5199h2.userConfigExtraInfo.getBytes());
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "addPublishStreamUrl configLiveTransCoding");
    }

    /* JADX INFO: renamed from: V5 */
    private void m11474V5(long j) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine == null) {
            return;
        }
        rtcEngine.registerMediaMetadataObserver(new C0769g(j), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W5 */
    public void m11478W5(boolean z, int i, int i2, int i3, int i4, String str) {
        if (z) {
            this.f5113H1 = 1;
            if (this.f5199h2 == null) {
                this.f5199h2 = new LiveTranscoding();
            }
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"agoraTranscode", "width:" + i + ",height:" + i2 + ",br:" + i3 + ",fps:" + i4});
            int iR0 = fjx.R().r0();
            LiveTranscoding liveTranscoding = this.f5199h2;
            liveTranscoding.width = i;
            liveTranscoding.height = i2;
            liveTranscoding.audioBitrate = iR0 == 0 ? 128 : iR0;
            liveTranscoding.audioChannels = 2;
            liveTranscoding.audioSampleRate = LiveTranscoding.AudioSampleRateType.TYPE_44100;
            liveTranscoding.videoBitrate = i3;
            liveTranscoding.videoFramerate = i4;
            fjx.R().K();
            this.f5199h2.videoCodecType = ((MediaBaseCodecFilter) this).s.H0 ? LiveTranscoding.VideoCodecType.H265 : LiveTranscoding.VideoCodecType.H264;
            int iD = fjx.R().d();
            if (1 == iD) {
                this.f5199h2.audioCodecProfile = LiveTranscoding.AudioCodecProfileType.HE_AAC;
            } else if (2 == iD) {
                this.f5199h2.audioCodecProfile = LiveTranscoding.AudioCodecProfileType.HE_AAC_V2;
            }
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"tanscode_aBitrate", Integer.valueOf(iR0)});
            ((MediaBaseCodecFilter) this).I.k("audioProfile", "[pub=Agora,profile=" + iD + "]");
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "config" + this.f5199h2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a8 */
    public int m11491a8(String str) {
        ChannelMediaInfo channelMediaInfo = new ChannelMediaInfo("", "", 0);
        ChannelMediaInfo channelMediaInfo2 = new ChannelMediaInfo(str, "", this.f5220o1.f3962i1);
        ChannelMediaRelayConfiguration channelMediaRelayConfiguration = new ChannelMediaRelayConfiguration();
        channelMediaRelayConfiguration.setSrcChannelInfo(channelMediaInfo);
        channelMediaRelayConfiguration.setDestChannelInfo(str, channelMediaInfo2);
        if (this.f5191e3) {
            return 0;
        }
        int iStartOrUpdateChannelMediaRelay = this.f5153U.startOrUpdateChannelMediaRelay(channelMediaRelayConfiguration);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"startChannelMediaRelay ret:" + iStartOrUpdateChannelMediaRelay});
        if (iStartOrUpdateChannelMediaRelay >= 0) {
            this.f5191e3 = true;
            return iStartOrUpdateChannelMediaRelay;
        }
        this.f5191e3 = false;
        eyx.c().e("ConnectOtherRoom", "agora", iStartOrUpdateChannelMediaRelay, "startChannelMediaRelay falied", LogLevel.FATAL.value());
        this.f5117I2.m9320f(0L, 3, "");
        return iStartOrUpdateChannelMediaRelay;
    }

    /* JADX INFO: renamed from: h6 */
    private RtcEngine m11513h6(vlw vlwVar) {
        ((MediaBaseCodecFilter) this).s = vlwVar;
        m11738l7(((ulw) vlwVar).P);
        this.f5109G0 = ((ulw) vlwVar).q;
        if (this.f5153U == null) {
            CongressUtil congressUtil = this.f5104E1;
            if (congressUtil != null) {
                congressUtil.getPara(new byte[]{1, 1, 1});
            }
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"AgoraPusher", "mAppid:" + this.f5170Y0});
            this.f5128M1 = new C0767e();
            try {
                String str = this.f5170Y0;
                if (str != null && !TextUtils.isEmpty(str)) {
                    this.f5210k3 = 0;
                    int i = ((vlw) this.f5220o1).c1;
                    if (i >= 0) {
                        this.f5210k3 = i;
                    } else {
                        this.f5210k3 = fjx.R().I0();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f5153U = t0f.m10771b().m10773c(W1(), this.f5170Y0, this.f5128M1, this.f5210k3 == 0);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    eyx.c().g(new Object[]{"agoraCreate", "mRtcKeepAlive:" + this.f5210k3 + ",agoraHash:" + this.f5153U.hashCode() + ",cost:" + jCurrentTimeMillis2});
                    RtcEngine rtcEngine = this.f5153U;
                    if (rtcEngine == null) {
                        boolean zInitializeNativeLibs = RtcEngineImpl.initializeNativeLibs();
                        eyx.c().a("agoraCreate", "isLoad " + zInitializeNativeLibs, LogLevel.FATAL);
                        return null;
                    }
                    rtcEngine.setParameters("{\"rtc.stat_interval_ms\":1000}");
                    this.f5153U.setParameters("{\"rtc.video.max_metadata_size\":2048}");
                    this.f5189e1 = false;
                    this.f5153U.registerAudioFrameObserver((IAudioFrameObserver) null);
                    int i2 = ((ulw) this.f5220o1).R;
                    this.f5153U.setRecordingAudioFrameParameters(this.f5204j1, i2, 2, 1024);
                    if (this.f5220o1.f3968o1) {
                        this.f5153U.setPlaybackAudioFrameParameters(this.f5204j1, i2, 0, 1024);
                    }
                    this.f5153U.setChannelProfile(1);
                    this.f5153U.enableDualStreamMode(this.f5109G0);
                    m11705e6(this.f5112H0);
                }
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"agora createEngine failed:", this.f5170Y0});
                hu00.a aVar = this.f5195g1;
                if (aVar != null) {
                    aVar.g(4352, 806, 0, this);
                }
                return null;
            } catch (Exception unused) {
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"agora createEngine failed:", this.f5170Y0});
                hu00.a aVar2 = this.f5195g1;
                if (aVar2 != null) {
                    aVar2.g(4352, 806, 0, this);
                }
                return null;
            }
        }
        this.f5149T = this.f5153U.isTextureEncodeSupported();
        vlw vlwVar2 = ((MediaBaseCodecFilter) this).s;
        if (vlwVar2 != null && ((ulw) vlwVar2).b0) {
            this.f5149T = false;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"isDynamicKey", Boolean.valueOf(!TextUtils.isEmpty(this.f5170Y0)), "channelkey", Boolean.valueOf(TextUtils.isEmpty(this.f5230r1))});
        return this.f5153U;
    }

    /* JADX INFO: renamed from: k6 */
    private int m11523k6(int i) {
        if (i == 0) {
            return 64000;
        }
        if (i == 1) {
            return 18000;
        }
        if (i == 2) {
            return 64000;
        }
        if (i == 3) {
            return 80000;
        }
        if (i == 4) {
            return 96000;
        }
        if (i != 5) {
            return ((ulw) this.f5220o1).S;
        }
        return 128000;
    }

    /* JADX INFO: renamed from: n6 */
    private String m11533n6() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.f5142R0.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ley leyVar = (ley) ((Map.Entry) it.next()).getValue();
            if (i != 0) {
                sb.append(",");
            }
            leyVar.d = leyVar.f + leyVar.e;
            sb.append(leyVar.b());
            i++;
        }
        if (i == 0) {
            sb.append("(0)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: n8 */
    private void m11534n8() {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.setExternalVideoSource(true, this.f5149T, Constants.ExternalVideoSourceType.VIDEO_FRAME);
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"writerTexturePrepare"});
        }
    }

    /* JADX INFO: renamed from: p6 */
    private String m11541p6(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("conf")) {
                jSONObject.remove("conf");
            }
            return jSONObject.toString();
        } catch (Exception e) {
            eyx.c().g(new Object[]{"getFixSei error" + e.toString()});
            return str;
        }
    }

    private void release() {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter release");
        boolean z = true;
        this.f5235s3 = true;
        this.f5165X = false;
        synchronized (this.f5236t1) {
            try {
                ((MediaBaseCodecFilter) this).H.a0 = null;
                if (this.f5153U != null) {
                    if (this.f5244v3) {
                        dix.d dVarH = dix.d().h(((MediaBaseCodecFilter) this).R.b());
                        hmx hmxVar = ((MediaBaseCodecFilter) this).I;
                        StringBuilder sb = new StringBuilder("server mix destory uid:");
                        sb.append(((vlw) this.f5220o1).B0);
                        sb.append(",momoid:");
                        sb.append(dVarH.c);
                        sb.append("roomid:");
                        sb.append(((MediaBaseCodecFilter) this).R);
                        hmxVar.l(new Object[]{((MediaBaseCodecFilter) this).R.h()});
                        HttpWrapper httpWrapper = HttpWrapper.getInstance();
                        String str = dVarH.a;
                        String str2 = dVarH.b;
                        int i = ((vlw) this.f5220o1).B0;
                        String strK = ((MediaBaseCodecFilter) this).R.k();
                        String strH = ((MediaBaseCodecFilter) this).R.h();
                        String str3 = this.f5220o1.f3960g1;
                        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
                        httpWrapper.destoryChannel(str, str2, i, strK, strH, str3, zmxVar.A0, "agora", (int) zmxVar.s);
                    }
                    m11657S5();
                    m11680Y7(0);
                    ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "release >>>>>");
                    this.f5153U.registerAudioFrameObserver((IAudioFrameObserver) null);
                    this.f5189e1 = false;
                    if (((MediaBaseCodecFilter) this).s.v0 != null) {
                        ((MediaBaseCodecFilter) this).I.l(new Object[]{"stopRtmpStream line 2702 mrCoreParameters.mRtmpPath:" + ((MediaBaseCodecFilter) this).H.x});
                        this.f5153U.stopRtmpStream(((MediaBaseCodecFilter) this).H.x);
                    }
                    this.f5153U.leaveChannel();
                    this.f5153U.registerMediaMetadataObserver((IMetadataObserver) null, 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    t0f t0fVarM10771b = t0f.m10771b();
                    IRtcEngineEventHandler iRtcEngineEventHandler = this.f5128M1;
                    if (this.f5210k3 != 0) {
                        z = false;
                    }
                    t0fVarM10771b.m10772a(iRtcEngineEventHandler, z);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    eyx.c().g(new Object[]{"agoraDestroy", "mRtcKeepAlive:" + this.f5210k3 + ",cost:" + jCurrentTimeMillis2});
                    Log.e("lqdebug", "mRtcEngine.destroy() end");
                    this.f5165X = false;
                    l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                    ((MediaBaseCodecFilter) this).J = MomoCodec.MomoCodecState.STOP;
                    this.f5195g1.g(4097, 0, 0, this);
                    this.f5157V = -1;
                    this.f5111G2 = null;
                }
                this.f5165X = false;
                l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                ((MediaBaseCodecFilter) this).J = MomoCodec.MomoCodecState.STOP;
                m11699d2();
                this.f5195g1.g(4097, 0, 0, this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t6 */
    private IRtcEngineEventHandler.LocalVideoStats m11557t6() {
        return this.f5139Q0;
    }

    /* JADX INFO: renamed from: u6 */
    private IRtcEngineEventHandler.RemoteVideoStats m11562u6() {
        return this.f5136P0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v6 */
    public String m11567v6(String str) {
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
            if (jSONObject.has("conf") && this.f5242v1) {
                jSONObject.remove("conf");
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ anw m11582z4(xc0 xc0Var) {
        xc0Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z6 */
    public void m11583z6(int i) {
        int i2;
        int i3;
        int i4;
        if (this.f5129M2) {
            float f = this.f5132N2;
            if (f >= 0.0f) {
                float f2 = this.f5135O2;
                if (f2 >= 0.0f) {
                    float f3 = this.f5138P2;
                    if (f3 > 0.0f) {
                        float f4 = this.f5141Q2;
                        if (f4 > 0.0f) {
                            CongressUtil.setCutPostion(f, f2, f3, f4);
                        }
                    }
                }
            }
            int i5 = this.f5144R2;
            if (i5 >= 0 && (i2 = this.f5148S2) >= 0 && (i3 = this.f5152T2) > 0 && (i4 = this.f5156U2) > 0) {
                CongressUtil.setCutPostion(i5, i2, i3, i4);
            }
            if (!this.f5254z1.containsKey(Integer.valueOf(i))) {
                this.f5254z1.put(Integer.valueOf(i), Integer.valueOf(i));
            }
            SurfaceView surfaceView = new SurfaceView(W1());
            surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC0772j(i));
            this.f5174Z0.a(i, surfaceView, ((ccj) this).width, ((ccj) this).height);
            return;
        }
        if (!this.f5187d2 && this.f5180b1 == null && !((vlw) this.f5220o1).Z0) {
            SurfaceView surfaceView2 = new SurfaceView(W1());
            if (this.f5153U != null) {
                this.f5179a3.add(Integer.valueOf(i));
                this.f5153U.setupRemoteVideo(new VideoCanvas(surfaceView2, 1, i));
            }
            if (this.f5174Z0 != null && !this.f5245w1 && !this.f5242v1) {
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"onVideoChannelAdded", Boolean.valueOf(((vlw) this.f5220o1).Z0), "mVideoTextureListener:" + this.f5180b1});
                ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAdded: userID=" + i);
                this.f5174Z0.a((long) i, surfaceView2, ((ccj) this).width, ((ccj) this).height);
            }
            if (((vlw) this.f5220o1).X0) {
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"isLocalMix:" + ((vlw) this.f5220o1).X0, true, "mergeCanvansWidth:" + ((ulw) this.f5220o1).k + ", mergeHeight:" + ((ulw) this.f5220o1).l + ", mix bitrate:" + this.f5116I1});
                return;
            }
            return;
        }
        if (((vlw) this.f5220o1).Z0) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"useTextureView", "width:" + ((ccj) this).width + ",height:" + ((ccj) this).height});
            TextureView textureView = new TextureView(W1());
            RtcEngine rtcEngine = this.f5153U;
            if (rtcEngine != null) {
                rtcEngine.setupRemoteVideo(new VideoCanvas(textureView, 1, i));
            }
            if (this.f5183c1 != null) {
                this.f5176Z2.put(Integer.valueOf(i), textureView);
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"onVideoChannelAdded use textureView"});
                this.f5183c1.a(i, textureView, ((ccj) this).width, ((ccj) this).height);
                return;
            }
            return;
        }
        if (this.f5254z1.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.f5254z1.put(Integer.valueOf(i), Integer.valueOf(i));
        if (this.f5180b1 != null) {
            m11727i8(i, ((ccj) this).width, ((ccj) this).height);
        }
        long j = i;
        ski0 ski0Var = new ski0(j, ((ccj) this).width, ((ccj) this).height, this.f5104E1);
        if (this.f5177a1 == null || this.f5245w1 || this.f5242v1) {
            return;
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + i);
        this.f5177a1.a(j, ski0Var, ((ccj) this).width, ((ccj) this).height);
    }

    /* JADX INFO: renamed from: A */
    public void m11584A() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"stopRecordWithNotLeaveRoom"});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter stopRecord");
        this.f5165X = false;
        wb1 wb1Var = this.f5121K0;
        if (wb1Var != null) {
            wb1Var.f();
            this.f5121K0 = null;
        }
        this.f5166X0 = 0;
        super.A();
        C0774l c0774l = this.f5184c2;
        if (c0774l != null) {
            c0774l.m11788a();
            this.f5184c2 = null;
        }
        stopSurroundMusic();
        m11758q2();
        u3m u3mVar = ((MediaBaseCodecFilter) this).K;
        if (u3mVar != null) {
            qmr qmrVar = this.f5220o1;
            ((ExtAudioWrapper) u3mVar).m353I2(2048, ((ulw) qmrVar).P, ((ulw) qmrVar).R, "Momo");
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
        PipelineConcurrentHashMap<Long, a9y> pipelineConcurrentHashMap = this.f5146S0;
        if (pipelineConcurrentHashMap != null && !pipelineConcurrentHashMap.isEmpty()) {
            n8c.a("zhengjijian", "stopRecord memberInfoMap " + this.f5146S0.size());
            this.f5146S0.clear();
        }
        PipelineConcurrentHashMap<Long, ley> pipelineConcurrentHashMap2 = this.f5142R0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            this.f5142R0.clear();
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "stopRecordOK!!!!!!!!!!!!!!!!!!!!");
    }

    /* JADX INFO: renamed from: A0 */
    public int m11585A0() {
        qmr qmrVar = this.f5220o1;
        return ((ulw) qmrVar).k > 0 ? ((ulw) qmrVar).l : ((ulw) qmrVar).t;
    }

    /* JADX INFO: renamed from: A5 */
    public void m11586A5(MRtcExitRoomHandler mRtcExitRoomHandler) {
        this.f5114H2 = mRtcExitRoomHandler;
    }

    /* JADX INFO: renamed from: A7 */
    public void m11587A7(String str, boolean z) {
        int i;
        JSONArray jSONArray;
        int i2;
        int i3;
        String str2 = "pkmu";
        String str3 = "renderMode";
        String str4 = "alpha";
        if (this.f5220o1 == null || str == null) {
            return;
        }
        if (this.f5199h2 == null) {
            this.f5199h2 = new LiveTranscoding();
        }
        LiveTranscoding liveTranscoding = this.f5199h2;
        liveTranscoding.backgroundColor = 0;
        qmr qmrVar = this.f5220o1;
        int i4 = ((ulw) qmrVar).k;
        liveTranscoding.width = i4;
        int i5 = ((ulw) qmrVar).l;
        liveTranscoding.height = i5;
        liveTranscoding.videoGop = 15;
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setJsonForWindowPostion publishConfig", "w:" + this.f5199h2.width, "h:" + this.f5199h2.height});
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.has("mid") ? jSONObject.getString("mid") : "";
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f5199h2.setUsers((ArrayList) null);
            int i6 = 1;
            if (jSONObject.has("conf")) {
                i = 0;
                jSONArray = jSONObject.getJSONArray("conf");
            } else {
                if (!jSONObject.has("has")) {
                    return;
                }
                jSONArray = jSONObject.getJSONArray("has");
                if (jSONArray != null) {
                    LiveTranscoding.TranscodingUser transcodingUser = new LiveTranscoding.TranscodingUser();
                    transcodingUser.zOrder = 1;
                    transcodingUser.alpha = 1.0f;
                    transcodingUser.uid = Integer.parseInt(string);
                    LiveTranscoding liveTranscoding2 = this.f5199h2;
                    int i7 = liveTranscoding2.width;
                    transcodingUser.x = (int) (i7 * 0.0228f);
                    int i8 = liveTranscoding2.height;
                    i = 0;
                    transcodingUser.y = 0;
                    transcodingUser.width = (int) (i7 * 0.2614f);
                    transcodingUser.height = (int) (i8 * 0.25004f);
                    liveTranscoding2.addUser(transcodingUser);
                    this.f5199h2.userConfigExtraInfo = m11567v6(this.f5095B1);
                } else {
                    i = 0;
                }
            }
            if (jSONArray == null) {
                return;
            }
            int i9 = i;
            while (true) {
                i2 = 2;
                i3 = i6;
                if (i9 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i9);
                String string2 = (jSONObject2 == null || !jSONObject2.has("id")) ? "" : jSONObject2.getString("id");
                double d = 0.0d;
                double d2 = (jSONObject2 == null || !jSONObject2.has("x")) ? 0.0d : jSONObject2.getDouble("x");
                if (jSONObject2 != null && jSONObject2.has("y")) {
                    d = jSONObject2.getDouble("y");
                }
                double d3 = 1.0d;
                double d4 = (jSONObject2 == null || !jSONObject2.has("w")) ? 1.0d : jSONObject2.getDouble("w");
                double d5 = (jSONObject2 == null || !jSONObject2.has("h")) ? 1.0d : jSONObject2.getDouble("h");
                int i10 = (jSONObject2 == null || !jSONObject2.has("z")) ? i3 : jSONObject2.getInt("z") + 1;
                if (jSONObject2 != null && jSONObject2.has(str4)) {
                    d3 = jSONObject2.getDouble(str4);
                }
                double d6 = d3;
                if (jSONObject2 != null && jSONObject2.has(str3)) {
                    jSONObject2.getString(str3);
                }
                int i11 = (jSONObject2 != null && jSONObject2.has(str2) && jSONObject2.getInt(str2) == 2) ? 255 : i;
                LiveTranscoding.TranscodingUser transcodingUser2 = new LiveTranscoding.TranscodingUser();
                transcodingUser2.uid = Integer.parseInt(string2);
                transcodingUser2.zOrder = i10;
                LiveTranscoding liveTranscoding3 = this.f5199h2;
                int i12 = liveTranscoding3.width;
                String str5 = str2;
                String str6 = str3;
                transcodingUser2.x = (int) (((double) i12) * d2);
                int i13 = liveTranscoding3.height;
                String str7 = str4;
                transcodingUser2.y = (int) (((double) i13) * d);
                transcodingUser2.width = (int) (((double) i12) * d4);
                transcodingUser2.height = (int) (((double) i13) * d5);
                transcodingUser2.alpha = (float) d6;
                transcodingUser2.audioChannel = i11;
                liveTranscoding3.addUser(transcodingUser2);
                i9++;
                i6 = i3;
                str2 = str5;
                str4 = str7;
                str3 = str6;
            }
            this.f5199h2.userConfigExtraInfo = m11567v6(this.f5095B1);
            if (!this.f5244v3) {
                m11470U5(((vlw) this.f5220o1).v0);
                return;
            }
            if (((MediaBaseCodecFilter) this).H.b && ((MediaBaseCodecFilter) this).R != null && z) {
                String string3 = "" + this.f5095B1;
                try {
                    JSONObject jSONObject3 = new JSONObject(string3);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("asr", 44100);
                    int i14 = this.f5199h2.audioBitrate;
                    if (i14 < 1000) {
                        i14 *= LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE;
                    }
                    jSONObject4.put("abr", i14);
                    jSONObject4.put("achl", this.f5199h2.audioChannels);
                    jSONObject4.put("acpf", LiveTranscoding.AudioCodecProfileType.getValue(this.f5199h2.audioCodecProfile));
                    jSONObject4.put("w", ((ulw) ((MediaBaseCodecFilter) this).s).k);
                    jSONObject4.put("h", ((ulw) ((MediaBaseCodecFilter) this).s).l);
                    jSONObject4.put("gop", ((ulw) ((MediaBaseCodecFilter) this).s).G);
                    jSONObject4.put("fps", ((ulw) ((MediaBaseCodecFilter) this).s).F);
                    jSONObject4.put("vbr", ((ulw) ((MediaBaseCodecFilter) this).s).H);
                    if (!((MediaBaseCodecFilter) this).s.H0) {
                        i2 = i3;
                    }
                    jSONObject4.put("vcpf", i2);
                    jSONObject3.put("mixInfo", jSONObject4);
                    string3 = jSONObject3.toString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String str8 = string3;
                dix.d dVarH = dix.d().h(((MediaBaseCodecFilter) this).R.b());
                this.f5229q3++;
                hmx hmxVar = ((MediaBaseCodecFilter) this).I;
                StringBuilder sb = new StringBuilder("server mix update uid:");
                sb.append(((vlw) this.f5220o1).B0);
                sb.append(",momoid:");
                sb.append(dVarH.c);
                sb.append("roomid:");
                sb.append(((MediaBaseCodecFilter) this).R);
                hmxVar.l(new Object[]{((MediaBaseCodecFilter) this).R.h()});
                HttpWrapper httpWrapper = HttpWrapper.getInstance();
                String str9 = dVarH.a;
                String str10 = dVarH.b;
                qmr qmrVar2 = this.f5220o1;
                int i15 = ((vlw) qmrVar2).B0;
                String str11 = dVarH.c;
                eix eixVar = ((MediaBaseCodecFilter) this).R;
                String strH = eixVar != null ? eixVar.h() : qmrVar2.f3960g1;
                String str12 = this.f5220o1.f3960g1;
                zmx zmxVar = ((MediaBaseCodecFilter) this).H;
                httpWrapper.updateChannel(str9, str10, i15, str11, strH, str12, zmxVar.A0, str8, "agora", ((MediaBaseCodecFilter) this).s.v0, (int) zmxVar.s);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: B7 */
    public void m11589B7(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"agora setMasterAudioLevel", Float.valueOf(f)});
        float f2 = 1.3f * f;
        this.f5198h1 = f2;
        ((MediaBaseCodecFilter) this).H.H0 = f2;
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.adjustRecordingSignalVolume((int) (f * 100.0f));
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m11590C0() {
        m11708f();
    }

    /* JADX INFO: renamed from: C1 */
    public void m11591C1(String str) {
        n8c.c("zk", "setMergeSei");
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"agora setMergeSei", str});
        synchronized (this.f5236t1) {
            this.f5098C1 = str;
            if (!((vlw) this.f5220o1).X0) {
                m11587A7(str, true);
            }
        }
    }

    /* JADX INFO: renamed from: C5 */
    public void m11592C5(MRtcAudioHandler mRtcAudioHandler) {
        this.f5137P1 = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: D0 */
    public long m11594D0() {
        return 0L;
    }

    /* JADX INFO: renamed from: D1 */
    public String m11595D1() {
        String str = ((MediaBaseCodecFilter) this).H.x;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: D5 */
    public void m11596D5(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f5140Q1 = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: D6 */
    public void m11597D6() {
        String str = "{ \"canvas\":{ \"w\":" + this.f5199h2.width + ",\"h\":" + this.f5199h2.height + ",\"conf\":{";
        for (LiveTranscoding.TranscodingUser transcodingUser : this.f5199h2.getUsers()) {
            str = str + "{\"id\":" + transcodingUser.uid + ",\"x\":" + transcodingUser.x + ",\"y\":" + transcodingUser.y + ",\"width\":" + transcodingUser.width + ",\"height\":" + transcodingUser.height + "},";
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateTranscoding", (str + "extraInfo:" + this.f5199h2.userConfigExtraInfo).concat("}")});
    }

    /* JADX INFO: renamed from: D7 */
    public void m11598D7(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.f5107F1 = pcmdataavailablecallback;
        if (pcmdataavailablecallback != null) {
            m11669W6(true);
        } else {
            m11669W6(false);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m11599E0(dxl dxlVar) {
        ((MediaBaseCodecFilter) this).F = dxlVar;
    }

    /* JADX INFO: renamed from: E6 */
    public void m11601E6(boolean z) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(z);
        }
    }

    /* JADX INFO: renamed from: E7 */
    public int m11602E7(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setRemoteDefaultVideoStreamType", Integer.valueOf(i)});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine == null) {
            return -1;
        }
        ((MediaBaseCodecFilter) this).H.n0 = i;
        return rtcEngine.setRemoteDefaultVideoStreamType(i);
    }

    /* JADX INFO: renamed from: F */
    public boolean m11603F() {
        return this.f5192f1;
    }

    /* JADX INFO: renamed from: F0 */
    public int m11604F0() {
        return this.f5214m1;
    }

    /* JADX INFO: renamed from: F1 */
    public long m11605F1() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f5133O0;
        if (rtcStats != null) {
            return rtcStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F5 */
    public void m11606F5(MRtcChannelHandler mRtcChannelHandler) {
        this.f5147S1 = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: F6 */
    public void m11607F6(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteAllRemoteVideoStream", "mute:" + z});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteVideoStreams(z);
        }
    }

    /* JADX INFO: renamed from: F7 */
    public void m11608F7(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setRole", Integer.valueOf(i)});
        this.f5233s1 = i;
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.setClientRole(i);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public long m11609G0() {
        return 0L;
    }

    /* JADX INFO: renamed from: G5 */
    public void m11610G5(MRtcConnectHandler mRtcConnectHandler) {
        this.f5163W1 = mRtcConnectHandler;
    }

    /* JADX INFO: renamed from: G6 */
    public void m11611G6(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"agoraFilter muteLocalAudioStream", Boolean.valueOf(z)});
        this.f5219n3 = z;
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
    }

    /* JADX INFO: renamed from: G7 */
    public void m11612G7(boolean z) {
        this.f5164W2 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setRoom24hMode:", Boolean.valueOf(z)});
    }

    /* JADX INFO: renamed from: H0 */
    public void m11613H0(boolean z) {
        this.f5242v1 = z;
    }

    /* JADX INFO: renamed from: H5 */
    public void m11614H5(ymw ymwVar) {
        this.f5155U1 = ymwVar;
    }

    /* JADX INFO: renamed from: H6 */
    public void m11615H6(boolean z) {
        this.f5219n3 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalAudioStreamForEx", Boolean.valueOf(z)});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
    }

    /* JADX INFO: renamed from: H7 */
    public void m11616H7(int i, boolean z) {
        this.f5110G1 = i;
    }

    /* JADX INFO: renamed from: I1 */
    public void m11617I1() {
        this.f5192f1 = true;
    }

    /* JADX INFO: renamed from: I5 */
    public void m11618I5(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        this.f5167X1 = mRtcClientRoleChangedHandler;
    }

    /* JADX INFO: renamed from: I6 */
    public void m11619I6(boolean z) {
        this.f5216m3 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalVideoStream", Boolean.valueOf(z)});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.muteLocalVideoStream(z);
        }
    }

    /* JADX INFO: renamed from: I7 */
    public void m11620I7(int i) {
        this.f5224p1 = i;
    }

    /* JADX INFO: renamed from: J */
    public void m11621J(String str) {
        n8c.c("zk", "setSei" + this.f5098C1);
        eyx.c().g(new Object[]{"Agora setSei:" + str});
        synchronized (this.f5236t1) {
            try {
                this.f5095B1 = str;
                if (!((vlw) this.f5220o1).X0) {
                    if (TextUtils.isEmpty(this.f5098C1)) {
                        m11785z7(str);
                    } else {
                        m11587A7(this.f5098C1, false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public long m11622J0() {
        return 0L;
    }

    /* JADX INFO: renamed from: J5 */
    public void m11623J5(MRtcPusherHandler mRtcPusherHandler) {
        this.f5097B3 = mRtcPusherHandler;
    }

    /* JADX INFO: renamed from: J6 */
    public void m11624J6(long j, boolean z) {
        RtcEngine rtcEngine;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteRemoteAudioStream", "uid:" + j + ",mute:" + z});
        if (j == ((vlw) this.f5220o1).B0 || (rtcEngine = this.f5153U) == null) {
            return;
        }
        rtcEngine.muteRemoteAudioStream((int) j, z);
    }

    /* JADX INFO: renamed from: K5 */
    public void m11626K5(MRtcQualityHandler mRtcQualityHandler) {
        this.f5159V1 = mRtcQualityHandler;
    }

    /* JADX INFO: renamed from: K6 */
    public void m11627K6(long j, boolean z) {
        RtcEngine rtcEngine;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteRemoteVideoStream", "uid:" + j + ",mute:" + z});
        if (j == ((vlw) this.f5220o1).B0 || (rtcEngine = this.f5153U) == null) {
            return;
        }
        rtcEngine.muteRemoteVideoStream((int) j, z);
    }

    /* JADX INFO: renamed from: K7 */
    public void m11628K7(hgd0 hgd0Var) {
        this.f5117I2 = hgd0Var;
    }

    /* JADX INFO: renamed from: L */
    public void m11629L(sml.a aVar) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setOnFrameAvailabelCallback :" + aVar});
        this.f5186d1 = aVar;
    }

    /* JADX INFO: renamed from: L0 */
    public long m11630L0() {
        return 0L;
    }

    /* JADX INFO: renamed from: L1 */
    public long m11631L1() {
        return 0L;
    }

    /* JADX INFO: renamed from: L5 */
    public void m11632L5(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f5111G2 = mRtcReceiveSeiHandler;
    }

    /* JADX INFO: renamed from: L6 */
    public void m11633L6(boolean z) {
        n8c.c("zk", "--ktv,muteSingerAudioStream:" + this.f5196g2 + "-->" + z);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteSingerAudioStream", Boolean.valueOf(z)});
        this.f5196g2 = z;
    }

    /* JADX INFO: renamed from: L7 */
    public void m11634L7(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f5201i1 = 0.8f * f;
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.adjustAudioMixingVolume((int) (f * 100.0f));
        }
    }

    /* JADX INFO: renamed from: M0 */
    public int m11635M0() {
        return (int) ((MediaBaseCodecFilter) this).H.i;
    }

    /* JADX INFO: renamed from: M1 */
    public void m11636M1() {
        yw00 yw00Var;
        if (this.f5161W == null && (yw00Var = this.f5118J0) != null) {
            this.f5161W = yw00Var.l();
        }
        if (!this.f5149T || ((ccj) this).texture_in == 0 || !this.f5165X || this.f5216m3) {
            return;
        }
        if (this.f5209k2 > 2) {
            qmr qmrVar = this.f5220o1;
            int i = ((ulw) qmrVar).m;
            int i2 = ((ulw) qmrVar).n;
            if (((vlw) qmrVar).F0 && qmrVar.d() == 1) {
                qmr qmrVar2 = this.f5220o1;
                i = ((ulw) qmrVar2).n;
                i2 = ((ulw) qmrVar2).m;
            }
            VideoFrame videoFrame = new VideoFrame(new TextureBuffer(this.f5161W, i, i2, VideoFrame.TextureBuffer.Type.RGB, ((ccj) this).texture_in, m11759q6(), RendererCommon.a(f5091D3), (Handler) null, (YuvConverter) null, (Runnable) null), 0, System.nanoTime());
            synchronized (this.f5236t1) {
                try {
                    if (this.f5153U != null && !this.f5235s3) {
                        this.f5153U.pushExternalVideoFrame(videoFrame);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            xxx.F().M();
        }
        long j = this.f5209k2 + 1;
        this.f5209k2 = j;
        if (j >= 30 || this.f5242v1) {
            m11441M6();
            if (this.f5241u3 <= 0) {
                this.f5241u3 = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: M7 */
    public void m11638M7(boolean z) {
        if (z) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "set Stream ReplaceMode");
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setStreamReplaceMode:" + z});
        this.f5190e2 = z;
    }

    /* JADX INFO: renamed from: N0 */
    public long m11639N0() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f5133O0;
        if (rtcStats != null) {
            return rtcStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: N1 */
    public int m11640N1() {
        return this.f5127M0;
    }

    /* JADX INFO: renamed from: N5 */
    public void m11641N5(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f5151T1 = mRtcTokenWillExpireHander;
    }

    /* JADX INFO: renamed from: N7 */
    public void m11642N7(int i) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.setAudioMixingPosition(i);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public long m11643O0() {
        return this.f5130N0;
    }

    /* JADX INFO: renamed from: O5 */
    public void m11644O5(int i) {
        float f = i / 100.0f;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f5201i1 = f * 0.8f;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"adjustAudioMixingVolume", Integer.valueOf(i), Float.valueOf(this.f5201i1)});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.adjustAudioMixingVolume(i);
        }
    }

    /* JADX INFO: renamed from: O6 */
    public void m11645O6(int i, int i2) {
        long j;
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onFirstRemoteVideoDecoded:uid" + i + "width" + ((ccj) this).width + "height" + ((ccj) this).height + "elapsed" + i2);
        if (W1() == null) {
            return;
        }
        long j2 = i;
        a9y a9yVar = (a9y) this.f5146S0.get(Long.valueOf(j2));
        if (a9yVar == null || a9yVar.d()) {
            j = j2;
        } else {
            n8c.a("zhengjijian", "agora get first idr");
            a9yVar.g(true);
            j = j2;
            ((MediaBaseCodecFilter) this).I.c(true, a9yVar.c(), j, this.f5197g3, a9yVar.a(), System.currentTimeMillis() - a9yVar.b());
            this.f5195g1.g(8198, i, 0, this);
        }
        MRtcEventHandler mRtcEventHandler = this.f5143R1;
        if (mRtcEventHandler != null) {
            mRtcEventHandler.onFirstRemoteVideoDecoded(j, ((ccj) this).width, ((ccj) this).height, i2);
        }
        Handler handler = this.f5213l3;
        if (handler != null) {
            handler.postAtFrontOfQueue(new RunnableC0771i(i));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m11646P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
        this.f5211l1 = i4;
        this.f5214m1 = i2;
        this.f5217n1 = i3;
    }

    /* JADX INFO: renamed from: P5 */
    public void m11647P5(int i) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.adjustPlaybackSignalVolume(i);
        }
    }

    /* JADX INFO: renamed from: P6 */
    public void m11648P6() {
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            rtcEngineImpl.pauseAllEffects();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public int m11649Q0() {
        return this.f5165X ? m11763r6() : m11766s6();
    }

    /* JADX INFO: renamed from: Q5 */
    public void m11650Q5(long j, float f) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.adjustUserPlaybackSignalVolume((int) j, (int) f);
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public void m11651Q6(int i) {
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            rtcEngineImpl.pauseEffect(i);
        }
    }

    /* JADX INFO: renamed from: Q7 */
    public void m11652Q7(b2l0 b2l0Var) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVideoChannelTextureViewListener", "listner:" + b2l0Var, "useTexture:" + ((vlw) this.f5220o1).Z0});
        this.f5183c1 = b2l0Var;
    }

    /* JADX INFO: renamed from: R0 */
    public void m11653R0(vlw vlwVar, EGLContext eGLContext) {
        if (this.f5153U == null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"startRecord", "engine == null, may be appid is null"});
            this.f5195g1.g(4352, 806, 0, this);
            return;
        }
        if (vlwVar == null || this.f5166X0 == 1) {
            return;
        }
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        long j = this.f5233s1;
        zmxVar.c1 = j;
        if (j == 1) {
            zmxVar.B0 = "M".equals(m11774w1()) ? "AgoraMaster" : "AgoraSlaver";
        } else {
            zmxVar.B0 = "AgoraAudience";
        }
        super.R0(vlwVar, eGLContext);
        if (((ulw) vlwVar).b0 && !this.f5216m3 && !this.f5245w1 && this.f5184c2 == null) {
            C0774l c0774l = new C0774l("live-media-aFFrame");
            this.f5184c2 = c0774l;
            c0774l.start();
        }
        if (!(vlwVar instanceof qmr)) {
            throw new InvalidParameterException("Parameters error");
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter startRecord");
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
        ii70VarD.c("Pipeline_Normal_pip->PIPLINE->AGORA", sb.toString());
        this.f5220o1 = qmrVar;
        if (!TextUtils.isEmpty(vlwVar.v0)) {
            this.f5244v3 = vlwVar.v0.contains("mixprovider=1");
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"serverMix:" + this.f5244v3});
        if (vlwVar.A0 == MomoPipeline.DecodeType.SOFT_DECODE || ((ulw) qmrVar).b0) {
            this.f5149T = false;
        }
        this.f5121K0 = new wb1();
        yw00 yw00Var = this.f5118J0;
        if (yw00Var != null) {
            this.f5161W = yw00Var.l();
        }
        if (fjx.R().p()) {
            int iQ = (int) (fjx.R().q() * (((ulw) vlwVar).H / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE));
            VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration();
            videoEncoderConfiguration.minBitrate = iQ;
            RtcEngine rtcEngine = this.f5153U;
            if (rtcEngine != null) {
                rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
            }
            n8c.f("agora_minkbs", "minBitrate parms = " + iQ);
        }
        this.f5253y3 = 2;
        this.f5235s3 = false;
        this.f5248x1 = false;
        this.f5238t3 = false;
        synchronized (this.f5236t1) {
            try {
                ((MediaBaseCodecFilter) this).H.e = System.currentTimeMillis();
                m11474V5(((vlw) this.f5220o1).B0);
                m11466T5(this.f5233s1, 33);
                qmr qmrVar2 = this.f5220o1;
                m11405B6(qmrVar2.f3960g1, ((vlw) qmrVar2).B0);
                if (this.f5095B1 != null) {
                    qmr qmrVar3 = this.f5220o1;
                    if (qmrVar3.f3961h1 && this.f5098C1 == null && !((vlw) qmrVar3).X0) {
                        m11785z7(this.f5095B1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f5187d2) {
            m11680Y7(0);
            m11680Y7(1);
        }
        this.f5166X0 = 1;
        st0.g().p(W1(), st0.f);
        ((MediaBaseCodecFilter) this).H.d1 = vlwVar.d();
        zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
        zmxVar2.b1 = ((ulw) vlwVar).b0 ? 1L : 0L;
        zmxVar2.x = vlwVar.v0;
        int i = ((ulw) vlwVar).H;
        this.f5222o3 = i;
        this.f5226p3 = vlwVar.E0;
        qmr qmrVar4 = this.f5220o1;
        zmxVar2.W = ((vlw) qmrVar4).B0;
        zmxVar2.X = qmrVar4.f3960g1;
        zmxVar2.F0 = i;
        if (this.f5153U != null) {
            zmxVar2.p = RtcEngine.getSdkVersion();
        }
        ((MediaBaseCodecFilter) this).H.f = System.currentTimeMillis();
        ((MediaBaseCodecFilter) this).H.F0 = ((ulw) vlwVar).H;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"startRecord"});
        this.f5108F2 = vlwVar.W0;
        fjx.R().C1(1);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"mrCoreParameters ignoreSabin", Boolean.valueOf(fjx.R().O0()), "isLocalMix", Boolean.valueOf(vlwVar.X0)});
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"agoraGlFlush", Boolean.valueOf(fjx.R().a())});
    }

    /* JADX INFO: renamed from: R5 */
    public int m11654R5(int i) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "call changeRole:" + i);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"changeRole", Integer.valueOf(i)});
        int clientRole = 0;
        boolean z = i != this.f5233s1;
        this.f5233s1 = i;
        long j = i;
        ((MediaBaseCodecFilter) this).H.c1 = j;
        if (z) {
            if (j == 2) {
                m11724i2();
                ((MediaBaseCodecFilter) this).H.B0 = "AgoraAudience";
            } else {
                m11715g2();
                ((MediaBaseCodecFilter) this).H.B0 = "M".equals(m11774w1()) ? "AgoraMaster" : "AgoraSlaver";
            }
            ((MediaBaseCodecFilter) this).H.f = System.currentTimeMillis();
        }
        synchronized (this.f5236t1) {
            if (1 == i) {
                try {
                    m11453P7();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f5153U != null) {
                ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "changeRole:" + i);
                clientRole = this.f5153U.setClientRole(i);
            }
        }
        return clientRole;
    }

    /* JADX INFO: renamed from: R6 */
    public void m11655R6() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pauseRecording"});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "pauseRecording");
        if (this.f5153U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"pauseRecording muteLocalAudioStream", "true"});
            this.f5153U.muteLocalAudioStream(true);
        }
    }

    /* JADX INFO: renamed from: R7 */
    public void m11656R7(z1l0 z1l0Var) {
        this.f5174Z0 = z1l0Var;
    }

    /* JADX INFO: renamed from: S5 */
    public void m11657S5() {
        try {
            CongressUtil congressUtil = this.f5104E1;
            if (congressUtil != null) {
                congressUtil.clearPcmCallback();
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: S6 */
    public void m11658S6() {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.pauseAudioMixing();
        }
    }

    /* JADX INFO: renamed from: S7 */
    public void m11659S7(a2l0 a2l0Var) {
        this.f5177a1 = a2l0Var;
    }

    /* JADX INFO: renamed from: T0 */
    public int m11660T0() {
        return 0;
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m11661T6(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"playEffect", "playEffect filename:" + str});
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            rtcEngineImpl.playEffect(i, str, i2, d, d3, d2 * 100.0d, !z);
        }
        return true;
    }

    /* JADX INFO: renamed from: T7 */
    public void m11662T7(String str) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"agora setVideoMixerBackgroundImgUrl", "url is" + str});
        this.f5232r3 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f5199h2 == null) {
            this.f5199h2 = new LiveTranscoding();
        }
        AgoraImage agoraImage = new AgoraImage();
        vlw vlwVar = ((MediaBaseCodecFilter) this).s;
        int i = ((ulw) vlwVar).k;
        if (i > 0) {
            agoraImage.width = i;
            agoraImage.height = ((ulw) vlwVar).l;
        } else {
            agoraImage.width = ((ulw) vlwVar).s;
            agoraImage.height = ((ulw) vlwVar).t;
        }
        agoraImage.url = str;
        agoraImage.x = 0;
        agoraImage.y = 0;
        ArrayList backgroundImageList = this.f5199h2.getBackgroundImageList();
        if (backgroundImageList != null) {
            backgroundImageList.clear();
        }
        this.f5199h2.addBackgroundImage(agoraImage);
        m11470U5(((vlw) this.f5220o1).v0);
    }

    /* JADX INFO: renamed from: U6 */
    public void m11663U6() {
        ((MediaBaseCodecFilter) this).H.r = m11533n6();
        ((MediaBaseCodecFilter) this).I.u();
    }

    /* JADX INFO: renamed from: U7 */
    public void m11664U7(int i, int i2, int i3, int i4) {
        this.f5116I1 = i / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE;
        this.f5119J1 = i2;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVideoMixerBitrate:" + this.f5116I1 + ", fps:" + i2});
    }

    /* JADX INFO: renamed from: V0 */
    public long m11665V0() {
        return 0L;
    }

    /* JADX INFO: renamed from: V6 */
    public void m11666V6() {
        ((MediaBaseCodecFilter) this).H.D = m11777x1();
        ((MediaBaseCodecFilter) this).H.F = m11643O0();
        ((MediaBaseCodecFilter) this).H.G = m11757q1();
        ((MediaBaseCodecFilter) this).H.B = m11605F1();
        ((MediaBaseCodecFilter) this).H.N = m11774w1();
        ((MediaBaseCodecFilter) this).H.O = m11720h1();
        ((MediaBaseCodecFilter) this).H.P = m11677Y0();
        ((MediaBaseCodecFilter) this).H.Q = m11740m0();
        ((MediaBaseCodecFilter) this).H.v = getVideoWidth();
        ((MediaBaseCodecFilter) this).H.w = m11732k0();
        ((MediaBaseCodecFilter) this).H.j = m11719h0();
        ((MediaBaseCodecFilter) this).H.k = m11640N1();
        ((MediaBaseCodecFilter) this).H.l = m11668W0();
        ((MediaBaseCodecFilter) this).H.r = m11533n6();
        ((MediaBaseCodecFilter) this).H.S = ((ulw) Z1()).w;
        ((MediaBaseCodecFilter) this).H.T = ((ulw) Z1()).x;
        ((MediaBaseCodecFilter) this).H.U = m11401A6();
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.V = this.f5219n3 ? 1L : 0L;
        zmxVar.R = 1000L;
        vlw vlwVar = ((MediaBaseCodecFilter) this).s;
        zmxVar.F0 = ((ulw) vlwVar).H;
        zmxVar.g = vlwVar.H0 ? 2L : 0L;
        zmxVar.h1 = vlwVar.X0 ? 1 : 0;
        zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
        zmxVar2.k1 = ((MediaBaseCodecFilter) this).s.H0 ? 1 : 0;
        zmxVar2.a1 = this.f5116I1;
        zmxVar2.l1 = xxx.F().a().getWidth();
        ((MediaBaseCodecFilter) this).H.m1 = xxx.F().a().getHeight();
        ((MediaBaseCodecFilter) this).H.n1 = xxx.F().w();
        ((MediaBaseCodecFilter) this).H.o1 = ((MediaBaseCodecFilter) this).s.S0;
        ((MediaBaseCodecFilter) this).I.H();
    }

    /* JADX INFO: renamed from: V7 */
    public void m11667V7(int i, int i2, int i3, int i4, int i5) {
        VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration();
        videoEncoderConfiguration.frameRate = i3;
        VideoEncoderConfiguration.VideoDimensions videoDimensions = new VideoEncoderConfiguration.VideoDimensions();
        videoDimensions.width = i;
        videoDimensions.height = i2;
        videoEncoderConfiguration.bitrate = i4;
        if (fjx.R().p()) {
            videoEncoderConfiguration.minBitrate = (int) (fjx.R().q() * i4);
        }
        videoEncoderConfiguration.dimensions = videoDimensions;
        if (i5 == 100) {
            videoEncoderConfiguration.degradationPrefer = VideoEncoderConfiguration.DEGRADATION_PREFERENCE.DISABLED;
            this.f5188d3 = i5;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVideoProfile", "width:" + i + ",height:" + i2 + ",fps:" + i3 + ", bitrate:" + i4 + ",min:" + fjx.R().p() + ",degradationPrefer:" + i5});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public int m11668W0() {
        return 0;
    }

    /* JADX INFO: renamed from: W6 */
    public void m11669W6(boolean z) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            if (!z) {
                if (this.f5094A3) {
                    return;
                }
                rtcEngine.registerAudioFrameObserver((IAudioFrameObserver) null);
                this.f5189e1 = false;
                return;
            }
            if (!this.f5189e1) {
                rtcEngine.registerAudioFrameObserver((IAudioFrameObserver) null);
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"registerAudioFrameObserver 2417"});
                this.f5153U.registerAudioFrameObserver(this);
            }
            this.f5189e1 = true;
            Log.e("lqdebug", "registerAudioFrameObserver this");
        }
    }

    /* JADX INFO: renamed from: W7 */
    public void m11670W7(cbl0 cbl0Var) {
        this.f5180b1 = cbl0Var;
        if (cbl0Var != null) {
            m11680Y7(1);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m11671X() {
        this.f5192f1 = false;
    }

    /* JADX INFO: renamed from: X0 */
    public long m11672X0() {
        return 0L;
    }

    /* JADX INFO: renamed from: X5 */
    public void m11673X5(boolean z) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            if (z) {
                rtcEngine.enableAudio();
            } else {
                rtcEngine.disableAudio();
            }
        }
    }

    /* JADX INFO: renamed from: X6 */
    public void m11674X6(int i, int i2) {
        if (this.f5153U != null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"enableDualStreamMode", Integer.valueOf(i), Integer.valueOf(i2)});
            RtcEngine rtcEngine = this.f5153U;
            if (i2 == 0) {
                rtcEngine.setRemoteVideoStreamType(i, 0);
            } else {
                rtcEngine.setRemoteVideoStreamType(i, 1);
            }
        }
    }

    /* JADX INFO: renamed from: X7 */
    public void m11675X7(int i, double d) {
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            rtcEngineImpl.setVolumeOfEffect(i, d * 100.0d);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m11676Y(yw00 yw00Var, vlw vlwVar) {
        super.Y(yw00Var, vlwVar);
        this.f5118J0 = yw00Var;
        if (vlwVar == null) {
            return;
        }
        this.f5220o1 = (qmr) vlwVar;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"resetCodec:width" + ((ulw) vlwVar).m + ",height:" + ((ulw) vlwVar).n + ", videoBit:" + ((ulw) vlwVar).H});
        m11453P7();
        yw00 yw00Var2 = this.f5118J0;
        if (yw00Var2 != null) {
            this.f5161W = yw00Var2.l();
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "videoWidth:" + ((ulw) ((MediaBaseCodecFilter) this).s).s + ",videoHeight:" + ((ulw) ((MediaBaseCodecFilter) this).s).t + ",visualWidth:" + ((ulw) ((MediaBaseCodecFilter) this).s).u + ",visualHeight:" + ((ulw) ((MediaBaseCodecFilter) this).s).v + ",encodeWidth:" + ((ulw) ((MediaBaseCodecFilter) this).s).m + ",encodeHeight:" + ((ulw) ((MediaBaseCodecFilter) this).s).n + ",videoBitrate:" + ((ulw) ((MediaBaseCodecFilter) this).s).H + ",audioBitrate:" + ((ulw) ((MediaBaseCodecFilter) this).s).S + ",videoFPS:" + ((ulw) ((MediaBaseCodecFilter) this).s).F + ",codecFPS:" + ((MediaBaseCodecFilter) this).s.E0 + ",mergeCanvasWidth:" + ((ulw) ((qmr) ((MediaBaseCodecFilter) this).s)).k + ",mergeCanvasHeight:" + ((ulw) ((qmr) ((MediaBaseCodecFilter) this).s)).l + ",codecFPS:" + ((MediaBaseCodecFilter) this).s.E0 + ",isHard:" + ((MediaBaseCodecFilter) this).s.A0);
    }

    /* JADX INFO: renamed from: Y0 */
    public int m11677Y0() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f5133O0;
        if (rtcStats != null) {
            return rtcStats.txVideoKBitRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y5 */
    public void m11678Y5(boolean z) {
        this.f5102D2 = z;
    }

    /* JADX INFO: renamed from: Y6 */
    public void m11679Y6() {
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            rtcEngineImpl.resumeAllEffects();
        }
    }

    /* JADX INFO: renamed from: Y7 */
    public void m11680Y7(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setYuvCallback 0115fix", Integer.valueOf(i)});
        try {
            CongressUtil congressUtil = this.f5104E1;
            if (congressUtil != null) {
                if (i == 1) {
                    congressUtil.setRtcEngineHandler(this.f5153U.getNativeHandle());
                } else {
                    congressUtil.setRtcEngineHandler(0L);
                }
                this.f5104E1.setYuvCallback(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: Z6 */
    public void m11682Z6(int i) {
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            rtcEngineImpl.resumeEffect(i);
        }
    }

    /* JADX INFO: renamed from: Z7 */
    public void m11683Z7(int i, View view) {
        if (fjx.R().b()) {
            Handler handler = this.f5213l3;
            if (handler != null) {
                handler.postAtFrontOfQueue(new RunnableC0763a(i, view));
                return;
            }
            return;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"old setupRemoteVideo", i + ",view is " + view});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.setupRemoteVideo(new VideoCanvas(view, 1, i));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public long m11684a0() {
        return xxx.F().l();
    }

    /* JADX INFO: renamed from: a6 */
    public void m11685a6(boolean z, String str) {
        this.f5125L1 = z;
        this.f5122K1 = str;
        if (!z || this.f5153U == null || str == null || str.length() <= 0) {
            return;
        }
        n8c.e("Pipeline_Normal_pip->PIPLINE->AGORA", "agora_sdk_ver: " + RtcEngine.getSdkVersion());
        this.f5153U.setParameters("{\"rtc.log_filter\":34781}");
        this.f5153U.setLogFile(this.f5122K1);
        this.f5153U.setLogFilter(15);
    }

    /* JADX INFO: renamed from: a7 */
    public void m11686a7() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"resumeRecording"});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "resumeRecording");
        if (this.f5153U != null) {
            m11611G6(this.f5219n3);
            this.f5165X = true;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public long m11688b1() {
        return 0L;
    }

    /* JADX INFO: renamed from: b6 */
    public void m11689b6(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"enableDualStreamMode", Boolean.valueOf(z)});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "call enableDualStreamMode:" + z);
        this.f5109G0 = z;
    }

    /* JADX INFO: renamed from: b7 */
    public void m11690b7() {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.resumeAudioMixing();
        }
    }

    /* JADX INFO: renamed from: b8 */
    public void m11691b8() {
        this.f5094A3 = true;
        if (this.f5189e1) {
            return;
        }
        this.f5153U.registerAudioFrameObserver((IAudioFrameObserver) null);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"registerAudioFrameObserver 4416"});
        this.f5153U.registerAudioFrameObserver(this);
    }

    /* JADX INFO: renamed from: c0 */
    public long m11692c0() {
        return 0L;
    }

    /* JADX INFO: renamed from: c1 */
    public int m11693c1() {
        return 1;
    }

    /* JADX INFO: renamed from: c2 */
    public void m11694c2() {
        if (((MediaBaseCodecFilter) this).H.c1 == 1) {
            m11721h2();
        } else {
            m11709f2();
        }
    }

    /* JADX INFO: renamed from: c6 */
    public void m11695c6(boolean z) {
        RtcEngine rtcEngine = this.f5153U;
        int iEnableInEarMonitoring = rtcEngine != null ? rtcEngine.enableInEarMonitoring(z, 32768) : 0;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"agora enableInEarMonitoring enable " + z, "ret:", Integer.valueOf(iEnableInEarMonitoring)});
    }

    /* JADX INFO: renamed from: c7 */
    public int m11696c7(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"selectAudioTrack:" + i});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            return rtcEngine.selectAudioTrack(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c8 */
    public void m11697c8(String str) {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "startSurroundMusic");
        if (this.f5092A1) {
            return;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"startSurroundMusic", "" + str});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.startAudioMixing(str, false, 1, 0);
            this.f5092A1 = true;
        }
        m11449O7(null, 1, 0);
    }

    /* JADX INFO: renamed from: d1 */
    public void m11698d1() {
        if (this.f5100C3) {
            return;
        }
        boolean z = this.f5253y3 > 0;
        if (((MediaBaseCodecFilter) this).H.c1 == 1) {
            m11666V6();
        } else {
            m11663U6();
        }
        if (z) {
            zmx zmxVar = ((MediaBaseCodecFilter) this).H;
            if (zmxVar.g1 < this.f5253y3 || this.f5194f3) {
                return;
            }
            zmxVar.y0 = 14L;
            zmxVar.k0 = 14;
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"MediaError", "14"});
            hu00.a aVar = this.f5195g1;
            if (aVar != null) {
                aVar.g(4353, 14, 0, this);
            }
            Handler handler = this.f5213l3;
            if (handler != null) {
                handler.post(new RunnableC0770h());
            }
        }
    }

    /* JADX INFO: renamed from: d2 */
    public void m11699d2() {
        if (((MediaBaseCodecFilter) this).H.c1 == 1) {
            m11724i2();
        } else {
            m11715g2();
        }
    }

    /* JADX INFO: renamed from: d6 */
    public void m11700d6(boolean z) {
        if (z) {
            this.f5113H1 = 1;
        } else {
            this.f5113H1 = 2;
        }
    }

    /* JADX INFO: renamed from: d7 */
    public void m11701d7(String str) {
        int i;
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null && this.f5157V == -1) {
            this.f5157V = rtcEngine.createDataStream(true, true);
        }
        RtcEngine rtcEngine2 = this.f5153U;
        if (rtcEngine2 == null || (i = this.f5157V) == -1) {
            return;
        }
        rtcEngine2.sendStreamMessage(i, str.getBytes());
    }

    /* JADX INFO: renamed from: d8 */
    public void m11702d8(String str, boolean z, boolean z2, int i) {
        if (this.f5092A1) {
            return;
        }
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.startAudioMixing(str, z, i);
            this.f5092A1 = true;
        }
        m11449O7(null, 1, 0);
    }

    /* JADX INFO: renamed from: e0 */
    public Surface m11703e0() {
        return null;
    }

    /* JADX INFO: renamed from: e1 */
    public void m11704e1(u3m u3mVar) {
        super.e1(u3mVar);
        if (!(u3mVar instanceof ExtAudioWrapper)) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"wrap is not ExtAudioWrapper"});
        }
        u3m u3mVar2 = ((MediaBaseCodecFilter) this).K;
        if (u3mVar2 != null) {
            ((ExtAudioWrapper) u3mVar2).m9861r2();
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).m354J2(new C0766d());
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).mo394s1(1);
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m11705e6(boolean z) {
        this.f5112H0 = z;
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            if (!z || this.f5220o1 == null) {
                rtcEngine.disableVideo();
                return;
            }
            rtcEngine.enableVideo();
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "setVideoProfileEx1 bitrate:" + ((ulw) this.f5220o1).H);
            this.f5153U.setParameters("{\"che.video.keyFrameInterval\":1}");
            qmr qmrVar = this.f5220o1;
            int i = ((vlw) qmrVar).S0;
            if (i == 0) {
                i = 15;
            }
            int i2 = i;
            if (((vlw) qmrVar).F0 && qmrVar.d() == 1) {
                qmr qmrVar2 = this.f5220o1;
                m11667V7(((ulw) qmrVar2).n, ((ulw) qmrVar2).m, i2, ((ulw) qmrVar2).H / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE, ((vlw) qmrVar2).a1);
            } else {
                qmr qmrVar3 = this.f5220o1;
                m11667V7(((ulw) qmrVar3).m, ((ulw) qmrVar3).n, i2, ((ulw) qmrVar3).H / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE, ((vlw) qmrVar3).a1);
            }
        }
    }

    /* JADX INFO: renamed from: e7 */
    public void m11706e7(byte[] bArr) {
        int i;
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null && this.f5157V == -1) {
            this.f5157V = rtcEngine.createDataStream(true, true);
        }
        RtcEngine rtcEngine2 = this.f5153U;
        if (rtcEngine2 == null || (i = this.f5157V) == -1) {
            return;
        }
        rtcEngine2.sendStreamMessage(i, bArr);
    }

    /* JADX INFO: renamed from: e8 */
    public void m11707e8() {
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            rtcEngineImpl.stopAllEffects();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11708f() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"stopRecord"});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter stopRecord");
        this.f5165X = false;
        wb1 wb1Var = this.f5121K0;
        if (wb1Var != null) {
            wb1Var.f();
            this.f5121K0 = null;
        }
        this.f5166X0 = 0;
        super.f();
        C0774l c0774l = this.f5184c2;
        if (c0774l != null) {
            c0774l.m11788a();
            this.f5184c2 = null;
        }
        stopSurroundMusic();
        release();
        PipelineConcurrentHashMap pipelineConcurrentHashMap = this.f5176Z2;
        if (pipelineConcurrentHashMap != null) {
            pipelineConcurrentHashMap.clear();
        }
        u3m u3mVar = ((MediaBaseCodecFilter) this).K;
        if (u3mVar != null) {
            qmr qmrVar = this.f5220o1;
            ((ExtAudioWrapper) u3mVar).m353I2(2048, ((ulw) qmrVar).P, ((ulw) qmrVar).R, "Momo");
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
        fjx.R().C1(1);
        PipelineConcurrentHashMap<Long, a9y> pipelineConcurrentHashMap2 = this.f5146S0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            n8c.a("zhengjijian", "stopRecord memberInfoMap " + this.f5146S0.size());
            this.f5146S0.clear();
        }
        PipelineConcurrentHashMap<Long, ley> pipelineConcurrentHashMap3 = this.f5142R0;
        if (pipelineConcurrentHashMap3 != null && !pipelineConcurrentHashMap3.isEmpty()) {
            this.f5142R0.clear();
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "stopRecordOK!!!!!!!!!!!!!!!!!!!!");
    }

    /* JADX INFO: renamed from: f2 */
    public void m11709f2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pullStart_v3", Boolean.valueOf(this.f5256z3)});
        if (this.f5256z3) {
            return;
        }
        this.f5256z3 = true;
        ((MediaBaseCodecFilter) this).H.f1 = (!TextUtils.isEmpty(this.f5170Y0) || TextUtils.isEmpty(this.f5230r1)) ? 0L : 1L;
        ((MediaBaseCodecFilter) this).H.a = System.currentTimeMillis();
        long j = this.f5197g3;
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        if (j == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
            zmxVar.e = jCurrentTimeMillis - zmxVar2.e;
            this.f5197g3 = zmxVar2.e;
        } else {
            zmxVar.e = j;
        }
        ((MediaBaseCodecFilter) this).H.f = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.f;
        super.f2();
    }

    /* JADX INFO: renamed from: f6 */
    public void m11710f6(boolean z) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.enableWebSdkInteroperability(z);
        }
    }

    /* JADX INFO: renamed from: f7 */
    public void m11711f7(boolean z) {
        if (z) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "set double push");
        }
        this.f5187d2 = z;
        this.f5242v1 = z;
    }

    /* JADX INFO: renamed from: f8 */
    public void m11712f8(int i) {
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            rtcEngineImpl.stopEffect(i);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public long m11713g0() {
        return 0L;
    }

    /* JADX INFO: renamed from: g1 */
    public String m11714g1(int i, int i2, Object obj) {
        return "";
    }

    /* JADX INFO: renamed from: g2 */
    public void m11715g2() {
        this.f5256z3 = false;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pullStop_v3"});
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.j0 = this.f5206j3;
        if (zmxVar.b) {
            zmxVar.h = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.a;
        }
        super.g2();
    }

    /* JADX INFO: renamed from: g6 */
    public void m11716g6(int i, int i2) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.setAudioProfile(i, i2);
            hmx hmxVar = ((MediaBaseCodecFilter) this).I;
            if (hmxVar != null) {
                hmxVar.l(new Object[]{"setAudioProfile", "profile:" + i + ",scenario:" + i2});
            }
            ((MediaBaseCodecFilter) this).H.C0 = m11523k6(i);
        }
    }

    /* JADX INFO: renamed from: g7 */
    public int m11717g7(int i) {
        RtcEngine rtcEngine;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setAudioEffectPreset", Integer.valueOf(i)});
        int iA = fa1.b().a(i);
        if (iA == -1 || (rtcEngine = this.f5153U) == null) {
            return -1;
        }
        return rtcEngine.setAudioEffectPreset(iA);
    }

    /* JADX INFO: renamed from: g8 */
    public void m11718g8() {
        if (!this.f5189e1) {
            this.f5153U.registerAudioFrameObserver((IAudioFrameObserver) null);
        }
        this.f5094A3 = false;
    }

    public AudioParams getEarMonitoringAudioParams() {
        return null;
    }

    public AudioParams getMixedAudioParams() {
        return null;
    }

    public int getObservedAudioFramePosition() {
        return 0;
    }

    public AudioParams getPlaybackAudioParams() {
        return null;
    }

    public AudioParams getRecordAudioParams() {
        return null;
    }

    public int getRoomType() {
        return this.f5224p1;
    }

    public String getServerIpAddr() {
        return "0.0.0.0";
    }

    public int getVideoWidth() {
        if (this.f5245w1 || this.f5242v1) {
            return 0;
        }
        return ((ulw) ((MediaBaseCodecFilter) this).s).m;
    }

    /* JADX INFO: renamed from: h0 */
    public int m11719h0() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f5133O0;
        if (rtcStats != null) {
            return rtcStats.rxBytes;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public int m11720h1() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f5133O0;
        if (rtcStats != null) {
            return rtcStats.txAudioKBitRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h2 */
    public void m11721h2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pushStart_v3", Boolean.valueOf(this.f5256z3)});
        if (this.f5256z3) {
            return;
        }
        this.f5256z3 = true;
        ((MediaBaseCodecFilter) this).H.f1 = (!TextUtils.isEmpty(this.f5170Y0) || TextUtils.isEmpty(this.f5230r1)) ? 0L : 1L;
        ((MediaBaseCodecFilter) this).H.a = System.currentTimeMillis();
        ((MediaBaseCodecFilter) this).H.v = getVideoWidth();
        ((MediaBaseCodecFilter) this).H.w = m11732k0();
        ((MediaBaseCodecFilter) this).H.z = m11755p1();
        ((MediaBaseCodecFilter) this).H.A = m11585A0();
        long j = this.f5197g3;
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        if (j == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
            zmxVar.e = jCurrentTimeMillis - zmxVar2.e;
            this.f5197g3 = zmxVar2.e;
        } else {
            zmxVar.e = j;
        }
        ((MediaBaseCodecFilter) this).H.h1 = ((vlw) this.f5220o1).X0 ? 1 : 0;
        zmx zmxVar3 = ((MediaBaseCodecFilter) this).H;
        boolean z = ((MediaBaseCodecFilter) this).s.H0;
        zmxVar3.g = z ? 2L : 0L;
        zmxVar3.k1 = z ? 1 : 0;
        super.h2();
    }

    /* JADX INFO: renamed from: h7 */
    public int m11722h7(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setAudioMixingDualMonoMode:" + i});
        Constants.AudioMixingDualMonoMode audioMixingDualMonoMode = Constants.AudioMixingDualMonoMode.values()[i];
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            return rtcEngine.setAudioMixingDualMonoMode(audioMixingDualMonoMode);
        }
        return -1;
    }

    /* JADX INFO: renamed from: h8 */
    public int m11723h8(String str, String str2) {
        int iM11491a8;
        if (this.f5153U == null) {
            return -4;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"subscribeOhterRoom", str, str2, "isStartMediaRelay:" + this.f5191e3 + ",my:" + this.f5220o1.f3962i1});
        if (!((MediaBaseCodecFilter) this).H.b || this.f5220o1 == null) {
            this.f5202i2 = true;
            this.f5205j2 = String.valueOf(str);
            iM11491a8 = 0;
        } else {
            iM11491a8 = m11491a8(str);
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "lqdebug startChannelMediaRelay ret " + iM11491a8 + "channelid =" + str + "myUid =" + str2);
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "lqdebug startChannelMediaRelay channelid =" + str + "dstUid =" + str2);
        return iM11491a8;
    }

    /* JADX INFO: renamed from: i2 */
    public void m11724i2() {
        this.f5256z3 = false;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pushStop_v3"});
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.j0 = this.f5206j3;
        if (zmxVar.b) {
            zmxVar.h = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.a;
        }
        super.i2();
    }

    /* JADX INFO: renamed from: i7 */
    public void m11726i7(int i) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.setAudioMixingPitch(i);
        }
    }

    /* JADX INFO: renamed from: i8 */
    public void m11727i8(int i, int i2, int i3) {
        cbl0 cbl0Var = this.f5180b1;
        if (cbl0Var != null) {
            cbl0Var.c(i, new C0764b(i2, i3, i), i2, i3);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public long m11728j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j6 */
    public int m11729j6(int i) {
        if (i != 0) {
            return i != 2 ? 2 : 5;
        }
        return 1;
    }

    /* JADX INFO: renamed from: j7 */
    public void m11730j7(boolean z) {
        this.f5245w1 = z;
        if (z) {
            this.f5112H0 = false;
        }
    }

    /* JADX INFO: renamed from: j8 */
    public void m11731j8(int i) {
        cbl0 cbl0Var = this.f5180b1;
        if (cbl0Var != null) {
            cbl0Var.a(i, new C0773k(i), ((ccj) this).width, ((ccj) this).height);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public int m11732k0() {
        if (this.f5245w1 || this.f5242v1) {
            return 0;
        }
        return ((ulw) ((MediaBaseCodecFilter) this).s).n;
    }

    /* JADX INFO: renamed from: k7 */
    public void m11733k7(int i, int i2) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setmmLiveAudioProfile", "profile:" + i + ",scenario:" + i2});
        this.f5103E0 = i;
        this.f5106F0 = i2;
    }

    /* JADX INFO: renamed from: k8 */
    public int m11734k8(String str) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"unSubscribeOtherRoom", str});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine == null) {
            return -4;
        }
        int iStopChannelMediaRelay = rtcEngine.stopChannelMediaRelay();
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"stopChannelMediaRelay ret:" + iStopChannelMediaRelay});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "lqdebug stopChannelMediaRelay ");
        this.f5191e3 = false;
        return iStopChannelMediaRelay;
    }

    /* JADX INFO: renamed from: l0 */
    public void m11735l0(vlw vlwVar, EGLContext eGLContext) {
        if (vlwVar == null || this.f5166X0 == 1) {
            return;
        }
        super.R0(vlwVar, eGLContext);
        if (((ulw) vlwVar).b0 && !this.f5216m3 && !this.f5245w1 && this.f5184c2 == null) {
            C0774l c0774l = new C0774l("live-media-aFFrame");
            this.f5184c2 = c0774l;
            c0774l.start();
        }
        if (!(vlwVar instanceof qmr)) {
            throw new InvalidParameterException("Parameters error");
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter startRecord");
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
        ii70VarD.c("Pipeline_Normal_pip->PIPLINE->AGORA", sb.toString());
        this.f5220o1 = qmrVar;
        if (vlwVar.A0 == MomoPipeline.DecodeType.SOFT_DECODE || ((ulw) qmrVar).b0) {
            this.f5149T = false;
        }
        this.f5121K0 = new wb1();
        yw00 yw00Var = this.f5118J0;
        if (yw00Var != null) {
            this.f5161W = yw00Var.l();
        }
        if (fjx.R().p()) {
            int iQ = (int) (fjx.R().q() * (((ulw) vlwVar).H / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE));
            VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration();
            videoEncoderConfiguration.minBitrate = iQ;
            RtcEngine rtcEngine = this.f5153U;
            if (rtcEngine != null) {
                rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
            }
            n8c.f("agora_minkbs", "minBitrate parms = " + iQ);
        }
        this.f5235s3 = false;
        this.f5248x1 = false;
        this.f5238t3 = false;
        if (this.f5187d2) {
            m11680Y7(0);
            m11680Y7(1);
        }
        this.f5166X0 = 1;
        ((MediaBaseCodecFilter) this).H.c1 = this.f5233s1;
        st0.g().p(W1(), st0.f);
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        if (zmxVar.c1 == 1) {
            zmxVar.B0 = "M".equals(m11774w1()) ? "AgoraMaster" : "AgoraSlaver";
        } else {
            zmxVar.B0 = "AgoraAudience";
        }
        ((MediaBaseCodecFilter) this).H.d1 = vlwVar.d();
        zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
        zmxVar2.b1 = ((ulw) vlwVar).b0 ? 1L : 0L;
        zmxVar2.x = vlwVar.v0;
        int i = ((ulw) vlwVar).H;
        this.f5222o3 = i;
        this.f5226p3 = vlwVar.E0;
        qmr qmrVar2 = this.f5220o1;
        zmxVar2.W = ((vlw) qmrVar2).B0;
        zmxVar2.X = qmrVar2.f3960g1;
        zmxVar2.F0 = i;
        if (this.f5153U != null) {
            zmxVar2.p = RtcEngine.getSdkVersion();
        }
        ((MediaBaseCodecFilter) this).H.f = System.currentTimeMillis();
        ((MediaBaseCodecFilter) this).H.F0 = ((ulw) vlwVar).H;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"startRecordWithNotJoinRoom"});
        fjx.R().C1(fjx.R().O0() ? 1 : 0);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"mrCoreParameters", Boolean.valueOf(fjx.R().O0())});
    }

    /* JADX INFO: renamed from: l1 */
    public long m11736l1() {
        return 0L;
    }

    /* JADX INFO: renamed from: l6 */
    public int m11737l6(int i) {
        return i != 1 ? 3 : 0;
    }

    /* JADX INFO: renamed from: l7 */
    public void m11738l7(int i) {
        this.f5204j1 = i;
    }

    /* JADX INFO: renamed from: l8 */
    public void m11739l8(String str) {
        this.f5230r1 = str;
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.renewToken(str);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public int m11740m0() {
        if (this.f5165X) {
            IRtcEngineEventHandler.LocalVideoStats localVideoStatsM11557t6 = m11557t6();
            if (localVideoStatsM11557t6 != null) {
                return localVideoStatsM11557t6.sentFrameRate;
            }
            return 0;
        }
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM11562u6 = m11562u6();
        if (remoteVideoStatsM11562u6 != null) {
            return remoteVideoStatsM11562u6.rendererOutputFrameRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m6 */
    public int m11742m6() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"getAudioTrackCount"});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            return rtcEngine.getAudioTrackCount();
        }
        return -1;
    }

    /* JADX INFO: renamed from: m7 */
    public void m11743m7(int i) {
        ((MediaBaseCodecFilter) this).H.i = i;
    }

    /* JADX INFO: renamed from: m8 */
    public void m11744m8(String str) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateRtmpUrl", str});
        if (this.f5153U == null || TextUtils.isEmpty(str) || this.f5199h2 == null) {
            ((MediaBaseCodecFilter) this).I.k("updateRtmpUrl", "updateRtmpUrl error : engine" + this.f5153U + ", publishConfig:" + this.f5199h2 + ",path:" + str);
            return;
        }
        if (str.equals(((MediaBaseCodecFilter) this).H.x)) {
            ((MediaBaseCodecFilter) this).I.k("updateRtmpUrl", "url  is no difference: newUrl:" + str + ",old is:" + ((MediaBaseCodecFilter) this).H.x);
            return;
        }
        ((MediaBaseCodecFilter) this).H.x = str;
        this.f5153U.startRtmpStreamWithTranscoding(str, this.f5199h2);
        MRtcPusherHandler mRtcPusherHandler = this.f5097B3;
        if (mRtcPusherHandler != null) {
            mRtcPusherHandler.onPushChangeStreamUrl(str);
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "updateRtmpUrl:url=".concat(str));
    }

    /* JADX INFO: renamed from: n0 */
    public long m11745n0() {
        return 0L;
    }

    /* JADX INFO: renamed from: n1 */
    public int m11746n1() {
        return this.f5217n1;
    }

    /* JADX INFO: renamed from: n2 */
    public void m11747n2(vlw vlwVar) {
        super.n2(vlwVar);
        vlw vlwVar2 = ((MediaBaseCodecFilter) this).s;
        qmr qmrVar = (qmr) vlwVar2;
        this.f5220o1 = qmrVar;
        if (qmrVar != null) {
            if (!this.f5149T || vlwVar2.A0 == MomoPipeline.DecodeType.SOFT_DECODE || ((ulw) ((qmr) vlwVar2)).b0) {
                vlwVar2.A0 = MomoPipeline.DecodeType.SOFT_DECODE;
            } else {
                vlwVar2.A0 = MomoPipeline.DecodeType.HARD_DECODE;
            }
        }
    }

    /* JADX INFO: renamed from: n7 */
    public void m11748n7(int i) {
        ((MediaBaseCodecFilter) this).H.s = i;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setBusinessType agora", Integer.valueOf(i)});
        hjx.d("Pipeline_Normal_pip->PIPLINE->AGORA", "setBusinessType : " + i);
    }

    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        ((ccj) this).texture_in = i;
        m11636M1();
    }

    /* JADX INFO: renamed from: o */
    public void m11749o() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"LeaveRoom"});
        if (this.f5153U != null) {
            m11657S5();
            m11680Y7(0);
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "LeaveRoom >>>>>");
            this.f5153U.registerAudioFrameObserver((IAudioFrameObserver) null);
            this.f5189e1 = false;
            String str = ((MediaBaseCodecFilter) this).s.v0;
            if (str != null) {
                this.f5153U.stopRtmpStream(str);
            }
            this.f5153U.leaveChannel();
            if (this.f5100C3) {
                return;
            }
            this.f5100C3 = true;
            m11699d2();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public long m11750o0() {
        return 0L;
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m11751o1(ByteBuffer byteBuffer) {
        m11772v0(byteBuffer);
        return true;
    }

    /* JADX INFO: renamed from: o6 */
    public double m11752o6() {
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            return rtcEngineImpl.getEffectsVolume() / 100.0d;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: o7 */
    public void m11753o7(String str) {
        this.f5230r1 = str;
    }

    public boolean onEarMonitoringAudioFrame(int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        return false;
    }

    public boolean onMixedAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        return false;
    }

    public boolean onPlaybackAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        if (this.f5121K0 != null && this.f5186d1 != null) {
            int i7 = i2 * i3 * i4;
            byte[] bArr = new byte[i7];
            byteBuffer.get(bArr, 0, i7);
            if (this.f5233s1 == 2) {
                this.f5186d1.C(new mpd0((((ulw) this.f5220o1).R == 1 || i4 != 1) ? bArr : m300.m9856o2(bArr, i7), System.currentTimeMillis(), 2));
            } else {
                wb1 wb1Var = this.f5121K0;
                if (wb1Var != null) {
                    wb1Var.i(new mpd0(bArr, System.currentTimeMillis(), i4));
                }
            }
            hgd0 hgd0Var = this.f5117I2;
            if (hgd0Var != null) {
                hgd0Var.m9327m(bArr, i5, i4);
            }
        }
        return true;
    }

    public boolean onPlaybackAudioFrameBeforeMixing(String str, int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, long j, int i7, int i8, long j2) {
        return false;
    }

    public boolean onRecordAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        mpd0 mpd0VarMo345C;
        ByteBuffer byteBuffer2;
        this.f5208k1++;
        int i7 = i2 * i4 * i3;
        byte[] bArrM9856o2 = new byte[i7];
        if (!this.f5196g2) {
            byteBuffer.get(bArrM9856o2, 0, i7);
        }
        pcmDataAvailableCallback pcmdataavailablecallback = this.f5107F1;
        if (pcmdataavailablecallback != null) {
            pcmdataavailablecallback.onPcmDateCallback(((vlw) this.f5220o1).B0, bArrM9856o2, 44100, i4 != 1);
        }
        u3m u3mVar = ((MediaBaseCodecFilter) this).K;
        mpd0 mpd0Var = null;
        if (u3mVar != null) {
            ((ExtAudioWrapper) u3mVar).mo367W1(this.f5201i1);
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).m353I2(2048, ((ulw) this.f5220o1).P, i4, "Agora");
            mpd0VarMo345C = ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).mo345C(new mpd0(bArrM9856o2, this.f5204j1, i4));
            if (mpd0VarMo345C != null && (byteBuffer2 = mpd0VarMo345C.b) != null) {
                byteBuffer2.get(bArrM9856o2, 0, i7);
                byteBuffer.rewind();
                byteBuffer.put(bArrM9856o2);
                byteBuffer.rewind();
            }
        } else {
            mpd0VarMo345C = null;
        }
        hgd0 hgd0Var = this.f5117I2;
        if (hgd0Var != null) {
            hgd0Var.m9329o(bArrM9856o2, i5, i4);
        }
        if (this.f5186d1 != null && this.f5192f1) {
            if (((MediaBaseCodecFilter) this).K != null) {
                wb1 wb1Var = this.f5121K0;
                if (wb1Var != null) {
                    wb1Var.j(1.0f);
                    if (((vlw) this.f5220o1).X0) {
                        this.f5121K0.k(1.0f);
                    }
                    mpd0Var = this.f5121K0.g();
                }
                if (mpd0Var != null) {
                    wb1 wb1Var2 = this.f5121K0;
                    ByteBuffer byteBufferH = mpd0VarMo345C != null ? wb1Var2.h(mpd0VarMo345C.c(), mpd0Var.c(), mpd0Var.e()) : wb1Var2.h(bArrM9856o2, mpd0Var.c(), mpd0Var.e());
                    if (byteBufferH != null) {
                        mpd0Var = new mpd0(byteBufferH.array(), mpd0Var.d(), i4);
                    }
                }
            }
            if (mpd0Var != null) {
                byte[] bArrM9856o3 = i4 == 1 ? m300.m9856o2(mpd0Var.c(), mpd0Var.e()) : mpd0Var.c();
                mpd0 mpd0Var2 = new mpd0(bArrM9856o3, this.f5204j1, 2);
                mpd0Var2.g(false);
                sml.a aVar = this.f5186d1;
                if (aVar != null) {
                    aVar.C(mpd0Var2);
                    int i8 = this.f5250x3;
                    this.f5250x3 = i8 + 1;
                    if (i8 % 50 == 0) {
                        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "=====replace======:Agora send pcm to IJK ");
                    }
                }
                hgd0 hgd0Var2 = this.f5117I2;
                if (hgd0Var2 != null) {
                    hgd0Var2.m9328n(bArrM9856o3, i5, i4);
                }
            } else if (this.f5233s1 != 2) {
                if (i4 == 1) {
                    bArrM9856o2 = m300.m9856o2(bArrM9856o2, i7);
                }
                mpd0 mpd0Var3 = new mpd0(bArrM9856o2, this.f5204j1, 2);
                mpd0Var3.g(false);
                sml.a aVar2 = this.f5186d1;
                if (aVar2 != null) {
                    aVar2.C(mpd0Var3);
                    int i9 = this.f5250x3;
                    this.f5250x3 = i9 + 1;
                    if (i9 % 50 == 0) {
                        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "=====replace======:Agora send pcm to IJK ");
                    }
                }
                hgd0 hgd0Var3 = this.f5117I2;
                if (hgd0Var3 != null) {
                    hgd0Var3.m9328n(bArrM9856o2, i5, i4);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m11754p(String str, int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"JoinRoom", str, Integer.valueOf(i)});
        this.f5100C3 = false;
        ((MediaBaseCodecFilter) this).H.e = System.currentTimeMillis();
        m11466T5(this.f5233s1, 33);
        m11405B6(str, ((vlw) this.f5220o1).B0);
        String str2 = this.f5095B1;
        if (str2 != null && this.f5220o1.f3961h1 && this.f5098C1 == null) {
            m11785z7(str2);
        }
    }

    /* JADX INFO: renamed from: p1 */
    public int m11755p1() {
        qmr qmrVar = this.f5220o1;
        int i = ((ulw) qmrVar).k;
        return i > 0 ? i : ((ulw) qmrVar).s;
    }

    /* JADX INFO: renamed from: p7 */
    public void m11756p7(boolean z) {
        this.f5129M2 = z;
        if (z) {
            m11680Y7(1);
        }
        hmx hmxVar = ((MediaBaseCodecFilter) this).I;
        if (hmxVar != null) {
            hmxVar.k("setCustomPreview", "[" + z + "]");
        }
    }

    /* JADX INFO: renamed from: q1 */
    public long m11757q1() {
        return this.f5124L0;
    }

    /* JADX INFO: renamed from: q2 */
    public void m11758q2() {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter release");
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"ReleaseNotLeave"});
        boolean z = true;
        this.f5235s3 = true;
        this.f5165X = false;
        synchronized (this.f5236t1) {
            try {
                ((MediaBaseCodecFilter) this).H.a0 = null;
                if (this.f5153U != null) {
                    t0f t0fVarM10771b = t0f.m10771b();
                    IRtcEngineEventHandler iRtcEngineEventHandler = this.f5128M1;
                    if (this.f5210k3 != 0) {
                        z = false;
                    }
                    t0fVarM10771b.m10772a(iRtcEngineEventHandler, z);
                    this.f5165X = false;
                    l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                    ((MediaBaseCodecFilter) this).J = MomoCodec.MomoCodecState.STOP;
                    this.f5195g1.g(4097, 0, 0, this);
                    this.f5157V = -1;
                }
                this.f5165X = false;
                l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                ((MediaBaseCodecFilter) this).J = MomoCodec.MomoCodecState.STOP;
                this.f5195g1.g(4097, 0, 0, this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q6 */
    public long m11759q6() {
        if (!fjx.R().a()) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        GLES20.glFlush();
        return jGlFenceSync;
    }

    /* JADX INFO: renamed from: q7 */
    public void m11760q7(boolean z) {
        this.f5193f2 = z;
    }

    /* JADX INFO: renamed from: r0 */
    public long m11761r0() {
        return 0L;
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m11762r1() {
        return this.f5187d2;
    }

    /* JADX INFO: renamed from: r6 */
    public int m11763r6() {
        return this.f5158V0;
    }

    /* JADX INFO: renamed from: r7 */
    public int m11764r7(int i, ikw ikwVar) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setDualStreamMode", "mode:" + i + ",config:" + ikwVar.toString()});
        SimulcastStreamConfig simulcastStreamConfig = new SimulcastStreamConfig();
        int i2 = ikwVar.f2919b;
        simulcastStreamConfig.bitrate = i2;
        simulcastStreamConfig.framerate = ikwVar.f2920c;
        VideoEncoderConfiguration.VideoDimensions videoDimensions = simulcastStreamConfig.dimensions;
        lkw lkwVar = ikwVar.f2918a;
        videoDimensions.height = lkwVar.f3238b;
        videoDimensions.width = lkwVar.f3237a;
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.m0 = i2;
        zmxVar.l0 = i == 1 ? 1L : 0L;
        Constants.SimulcastStreamMode simulcastStreamMode = Constants.SimulcastStreamMode.AUTO_SIMULCAST_STREAM;
        if (i != -1) {
            if (i == 0) {
                simulcastStreamMode = Constants.SimulcastStreamMode.DISABLE_SIMULCAST_STREAM;
            } else if (i == 1) {
                simulcastStreamMode = Constants.SimulcastStreamMode.ENABLE_SIMULCAST_STREAM;
            }
        }
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            return rtcEngine.setDualStreamMode(simulcastStreamMode, simulcastStreamConfig);
        }
        return -1;
    }

    /* JADX INFO: renamed from: s0 */
    public int m11765s0() {
        return 0;
    }

    /* JADX INFO: renamed from: s6 */
    public int m11766s6() {
        return this.f5162W0;
    }

    /* JADX INFO: renamed from: s7 */
    public void m11767s7(double d) {
        RtcEngineImpl rtcEngineImpl = this.f5153U;
        if (rtcEngineImpl != null) {
            rtcEngineImpl.setEffectsVolume(d * 100.0d);
        }
    }

    public void stopSurroundMusic() {
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "stopSurroundMusic:");
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.stopAudioMixing();
            this.f5092A1 = false;
        }
    }

    /* JADX INFO: renamed from: t7 */
    public void m11768t7(boolean z) {
        this.f5194f3 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setEnableConferenceReconnect:" + z});
    }

    /* JADX INFO: renamed from: u0 */
    public long m11769u0() {
        return 0L;
    }

    /* JADX INFO: renamed from: u1 */
    public long m11770u1() {
        return 0L;
    }

    /* JADX INFO: renamed from: u7 */
    public int m11771u7(boolean z) {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            return rtcEngine.setEnableSpeakerphone(z);
        }
        return -1;
    }

    /* JADX INFO: renamed from: v0 */
    public void m11772v0(ByteBuffer byteBuffer) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "writevideo:" + byteBuffer.limit() + ";timeStamp:" + jCurrentTimeMillis);
        if (this.f5149T || !this.f5165X || this.f5216m3) {
            return;
        }
        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
        agoraVideoFrame.format = 1;
        agoraVideoFrame.timeStamp = System.currentTimeMillis();
        qmr qmrVar = this.f5220o1;
        agoraVideoFrame.stride = ((ulw) qmrVar).m;
        agoraVideoFrame.height = ((ulw) qmrVar).n;
        agoraVideoFrame.rotation = 0;
        agoraVideoFrame.buf = byteBuffer.array();
        synchronized (this.f5236t1) {
            try {
                if (this.f5153U != null && !this.f5235s3) {
                    this.f5153U.pushExternalVideoFrame(agoraVideoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f5239u1 + 1;
        this.f5239u1 = i;
        if (i >= 30 || this.f5242v1) {
            m11441M6();
        }
    }

    /* JADX INFO: renamed from: w1 */
    public String m11774w1() {
        qmr qmrVar = this.f5220o1;
        return (qmrVar == null || qmrVar.f3961h1) ? "M" : "S";
    }

    /* JADX INFO: renamed from: w6 */
    public float m11775w6() {
        return this.f5201i1;
    }

    /* JADX INFO: renamed from: x1 */
    public long m11777x1() {
        return this.f5208k1 * 1024;
    }

    /* JADX INFO: renamed from: x6 */
    public long m11778x6() {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x7 */
    public void m11779x7(String str) {
        boolean zHas;
        try {
            zHas = new JSONObject(str).has("che.audio.profile");
        } catch (Exception e) {
            e.printStackTrace();
            zHas = false;
        }
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine == null || zHas) {
            return;
        }
        rtcEngine.setParameters(str);
    }

    /* JADX INFO: renamed from: y */
    public void m11780y(int i, int i2) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"agoraPusherFilter", "interval:" + i + ",smooth:" + i2});
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.enableAudioVolumeIndication(i, i2, true);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m11781y0(int i, int i2, int i3) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"agoraPusherFilter", "interval:" + i + ",smooth:" + i2});
        boolean z = i3 != 0;
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            rtcEngine.enableAudioVolumeIndication(i, i2, z);
        }
    }

    /* JADX INFO: renamed from: y6 */
    public long m11782y6() {
        RtcEngine rtcEngine = this.f5153U;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: z5 */
    public void m11784z5(MRtcEventHandler mRtcEventHandler) {
        this.f5143R1 = mRtcEventHandler;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d6 A[Catch: Exception -> 0x0287, TryCatch #0 {Exception -> 0x0287, blocks: (B:33:0x00d4, B:34:0x00d8, B:37:0x00e5, B:39:0x00eb, B:42:0x00f3, B:44:0x00f9, B:46:0x0100, B:48:0x010e, B:51:0x0116, B:53:0x011c, B:59:0x0153, B:61:0x0159, B:63:0x0161, B:65:0x0167, B:69:0x0171, B:71:0x0177, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:81:0x0194, B:84:0x019d, B:86:0x01a5, B:89:0x01ae, B:91:0x01b6, B:95:0x01c6, B:97:0x01ce, B:100:0x01d6, B:102:0x01e0, B:105:0x01ea, B:107:0x01f4, B:113:0x0208, B:115:0x0213, B:116:0x0222, B:55:0x0149), top: B:125:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01e0 A[Catch: Exception -> 0x0287, TryCatch #0 {Exception -> 0x0287, blocks: (B:33:0x00d4, B:34:0x00d8, B:37:0x00e5, B:39:0x00eb, B:42:0x00f3, B:44:0x00f9, B:46:0x0100, B:48:0x010e, B:51:0x0116, B:53:0x011c, B:59:0x0153, B:61:0x0159, B:63:0x0161, B:65:0x0167, B:69:0x0171, B:71:0x0177, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:81:0x0194, B:84:0x019d, B:86:0x01a5, B:89:0x01ae, B:91:0x01b6, B:95:0x01c6, B:97:0x01ce, B:100:0x01d6, B:102:0x01e0, B:105:0x01ea, B:107:0x01f4, B:113:0x0208, B:115:0x0213, B:116:0x0222, B:55:0x0149), top: B:125:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ea A[Catch: Exception -> 0x0287, TryCatch #0 {Exception -> 0x0287, blocks: (B:33:0x00d4, B:34:0x00d8, B:37:0x00e5, B:39:0x00eb, B:42:0x00f3, B:44:0x00f9, B:46:0x0100, B:48:0x010e, B:51:0x0116, B:53:0x011c, B:59:0x0153, B:61:0x0159, B:63:0x0161, B:65:0x0167, B:69:0x0171, B:71:0x0177, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:81:0x0194, B:84:0x019d, B:86:0x01a5, B:89:0x01ae, B:91:0x01b6, B:95:0x01c6, B:97:0x01ce, B:100:0x01d6, B:102:0x01e0, B:105:0x01ea, B:107:0x01f4, B:113:0x0208, B:115:0x0213, B:116:0x0222, B:55:0x0149), top: B:125:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f4 A[Catch: Exception -> 0x0287, TryCatch #0 {Exception -> 0x0287, blocks: (B:33:0x00d4, B:34:0x00d8, B:37:0x00e5, B:39:0x00eb, B:42:0x00f3, B:44:0x00f9, B:46:0x0100, B:48:0x010e, B:51:0x0116, B:53:0x011c, B:59:0x0153, B:61:0x0159, B:63:0x0161, B:65:0x0167, B:69:0x0171, B:71:0x0177, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:81:0x0194, B:84:0x019d, B:86:0x01a5, B:89:0x01ae, B:91:0x01b6, B:95:0x01c6, B:97:0x01ce, B:100:0x01d6, B:102:0x01e0, B:105:0x01ea, B:107:0x01f4, B:113:0x0208, B:115:0x0213, B:116:0x0222, B:55:0x0149), top: B:125:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0202  */
    /* JADX WARN: Code duplicated, block: B:112:0x0205  */
    /* JADX WARN: Code duplicated, block: B:116:0x0222 A[Catch: Exception -> 0x0287, TRY_LEAVE, TryCatch #0 {Exception -> 0x0287, blocks: (B:33:0x00d4, B:34:0x00d8, B:37:0x00e5, B:39:0x00eb, B:42:0x00f3, B:44:0x00f9, B:46:0x0100, B:48:0x010e, B:51:0x0116, B:53:0x011c, B:59:0x0153, B:61:0x0159, B:63:0x0161, B:65:0x0167, B:69:0x0171, B:71:0x0177, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:81:0x0194, B:84:0x019d, B:86:0x01a5, B:89:0x01ae, B:91:0x01b6, B:95:0x01c6, B:97:0x01ce, B:100:0x01d6, B:102:0x01e0, B:105:0x01ea, B:107:0x01f4, B:113:0x0208, B:115:0x0213, B:116:0x0222, B:55:0x0149), top: B:125:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01c6 A[Catch: Exception -> 0x0287, TryCatch #0 {Exception -> 0x0287, blocks: (B:33:0x00d4, B:34:0x00d8, B:37:0x00e5, B:39:0x00eb, B:42:0x00f3, B:44:0x00f9, B:46:0x0100, B:48:0x010e, B:51:0x0116, B:53:0x011c, B:59:0x0153, B:61:0x0159, B:63:0x0161, B:65:0x0167, B:69:0x0171, B:71:0x0177, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:81:0x0194, B:84:0x019d, B:86:0x01a5, B:89:0x01ae, B:91:0x01b6, B:95:0x01c6, B:97:0x01ce, B:100:0x01d6, B:102:0x01e0, B:105:0x01ea, B:107:0x01f4, B:113:0x0208, B:115:0x0213, B:116:0x0222, B:55:0x0149), top: B:125:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ce A[Catch: Exception -> 0x0287, TryCatch #0 {Exception -> 0x0287, blocks: (B:33:0x00d4, B:34:0x00d8, B:37:0x00e5, B:39:0x00eb, B:42:0x00f3, B:44:0x00f9, B:46:0x0100, B:48:0x010e, B:51:0x0116, B:53:0x011c, B:59:0x0153, B:61:0x0159, B:63:0x0161, B:65:0x0167, B:69:0x0171, B:71:0x0177, B:74:0x0180, B:76:0x0186, B:79:0x018e, B:81:0x0194, B:84:0x019d, B:86:0x01a5, B:89:0x01ae, B:91:0x01b6, B:95:0x01c6, B:97:0x01ce, B:100:0x01d6, B:102:0x01e0, B:105:0x01ea, B:107:0x01f4, B:113:0x0208, B:115:0x0213, B:116:0x0222, B:55:0x0149), top: B:125:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d2  */
    /* JADX INFO: renamed from: z7 */
    public void m11785z7(String str) {
        JSONObject jSONObject;
        int i;
        JSONArray jSONArray;
        String str2;
        String str3;
        int i2;
        String str4;
        JSONArray jSONArray2;
        String str5;
        int i3;
        LiveTranscoding.TranscodingUser transcodingUser;
        String str6;
        String string = str;
        String str7 = "w";
        String str8 = "y";
        String str9 = "pkmu";
        String str10 = "renderMode";
        if (this.f5220o1 == null || string == null) {
            return;
        }
        if (this.f5199h2 == null) {
            this.f5199h2 = new LiveTranscoding();
        }
        qmr qmrVar = this.f5220o1;
        String str11 = "alpha";
        int i4 = ((ulw) qmrVar).k;
        String str12 = "z";
        LiveTranscoding liveTranscoding = this.f5199h2;
        String str13 = "h";
        if (i4 > 0) {
            liveTranscoding.width = i4;
            liveTranscoding.height = ((ulw) qmrVar).l;
            if (((vlw) qmrVar).F0 && qmrVar.d() == 1) {
                LiveTranscoding liveTranscoding2 = this.f5199h2;
                qmr qmrVar2 = this.f5220o1;
                liveTranscoding2.width = ((ulw) qmrVar2).l;
                liveTranscoding2.height = ((ulw) qmrVar2).k;
            }
        } else {
            liveTranscoding.width = ((ulw) qmrVar).s;
            liveTranscoding.height = ((ulw) qmrVar).t;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setJsonForPostion publishConfig", "w:" + this.f5199h2.width, "h:" + this.f5199h2.height});
        LiveTranscoding liveTranscoding3 = this.f5199h2;
        if (liveTranscoding3.width <= 0 || liveTranscoding3.height <= 0) {
            return;
        }
        liveTranscoding3.backgroundColor = 0;
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
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                string = jSONObject.toString();
            } catch (Exception unused2) {
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"setJsonForPostion parseInt err", "pos:" + string});
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject(string);
        String str14 = "";
        String string2 = jSONObject2.has("mid") ? jSONObject2.getString("mid") : "";
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        int iOptInt = jSONObject2.has("shortSei") ? jSONObject2.optInt("shortSei", 0) : 0;
        this.f5199h2.setUsers((ArrayList) null);
        if (jSONObject2.has("conf")) {
            i = 0;
            jSONArray = jSONObject2.getJSONArray("conf");
        } else {
            if (!jSONObject2.has("has")) {
                return;
            }
            jSONArray = jSONObject2.getJSONArray("has");
            if (jSONArray != null) {
                LiveTranscoding.TranscodingUser transcodingUser2 = new LiveTranscoding.TranscodingUser();
                transcodingUser2.uid = Integer.parseInt(string2);
                transcodingUser2.zOrder = 1;
                i = 0;
                transcodingUser2.x = 0;
                transcodingUser2.y = 0;
                LiveTranscoding liveTranscoding4 = this.f5199h2;
                transcodingUser2.width = liveTranscoding4.width;
                transcodingUser2.height = liveTranscoding4.height;
                transcodingUser2.alpha = 1.0f;
                liveTranscoding4.addUser(transcodingUser2);
                this.f5199h2.userConfigExtraInfo = m11567v6(string);
            } else {
                i = 0;
            }
        }
        if (jSONArray == null) {
            return;
        }
        int i5 = i;
        while (i5 < jSONArray.length()) {
            JSONObject jSONObject3 = (JSONObject) jSONArray.get(i5);
            String string3 = (jSONObject3 == null || !jSONObject3.has("id")) ? str14 : jSONObject3.getString("id");
            double d = 0.0d;
            double d2 = (jSONObject3 == null || !jSONObject3.has("x")) ? 0.0d : jSONObject3.getDouble("x");
            if (jSONObject3 != null && jSONObject3.has(str8)) {
                d = jSONObject3.getDouble(str8);
            }
            double d3 = 1.0d;
            double d4 = (jSONObject3 == null || !jSONObject3.has(str7)) ? 1.0d : jSONObject3.getDouble(str7);
            if (jSONObject3 != null) {
                str2 = str13;
                if (jSONObject3.has(str2)) {
                    d3 = jSONObject3.getDouble(str2);
                }
            } else {
                str2 = str13;
            }
            if (jSONObject3 != null) {
                str3 = str12;
                i2 = jSONObject3.has(str3) ? jSONObject3.getInt(str3) + 1 : 1;
                if (jSONObject3 != null) {
                    str4 = str11;
                    if (jSONObject3.has(str4)) {
                        jSONObject3.getDouble(str4);
                    }
                } else {
                    str4 = str11;
                }
                if (jSONObject3 != null) {
                    jSONArray2 = jSONArray;
                    str5 = str10;
                    if (jSONObject3.has(str5)) {
                        jSONObject3.getString(str5);
                    }
                } else {
                    jSONArray2 = jSONArray;
                    str5 = str10;
                }
                if (jSONObject3 != null) {
                    str10 = str5;
                    str6 = str9;
                    if (jSONObject3.has(str6)) {
                        str9 = str6;
                        i3 = jSONObject3.getInt(str6) == 2 ? 255 : 0;
                        transcodingUser = new LiveTranscoding.TranscodingUser();
                        if (TextUtils.isEmpty(string3)) {
                            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setJsonForPostion ", "id is empty string"});
                            return;
                        }
                        transcodingUser.uid = Integer.parseInt(string3);
                        transcodingUser.zOrder = i2;
                        transcodingUser.alpha = 1.0f;
                        LiveTranscoding liveTranscoding5 = this.f5199h2;
                        int i6 = liveTranscoding5.width;
                        int i7 = i5;
                        String str15 = str14;
                        transcodingUser.x = (int) (((double) i6) * d2);
                        int i8 = liveTranscoding5.height;
                        String str16 = str7;
                        String str17 = str8;
                        transcodingUser.y = (int) (((double) i8) * d);
                        transcodingUser.width = (int) (((double) i6) * d4);
                        transcodingUser.height = (int) (((double) i8) * d3);
                        transcodingUser.audioChannel = i3;
                        liveTranscoding5.addUser(transcodingUser);
                        i5 = i7 + 1;
                        str7 = str16;
                        str12 = str3;
                        jSONArray = jSONArray2;
                        str14 = str15;
                        str8 = str17;
                        str13 = str2;
                        str11 = str4;
                    } else {
                        str9 = str6;
                    }
                } else {
                    str10 = str5;
                }
                transcodingUser = new LiveTranscoding.TranscodingUser();
                if (TextUtils.isEmpty(string3)) {
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"setJsonForPostion ", "id is empty string"});
                    return;
                }
                transcodingUser.uid = Integer.parseInt(string3);
                transcodingUser.zOrder = i2;
                transcodingUser.alpha = 1.0f;
                LiveTranscoding liveTranscoding6 = this.f5199h2;
                int i9 = liveTranscoding6.width;
                int i10 = i5;
                String str18 = str14;
                transcodingUser.x = (int) (((double) i9) * d2);
                int i11 = liveTranscoding6.height;
                String str19 = str7;
                String str110 = str8;
                transcodingUser.y = (int) (((double) i11) * d);
                transcodingUser.width = (int) (((double) i9) * d4);
                transcodingUser.height = (int) (((double) i11) * d3);
                transcodingUser.audioChannel = i3;
                liveTranscoding6.addUser(transcodingUser);
                i5 = i10 + 1;
                str7 = str19;
                str12 = str3;
                jSONArray = jSONArray2;
                str14 = str18;
                str8 = str110;
                str13 = str2;
                str11 = str4;
            } else {
                str3 = str12;
            }
            if (jSONObject3 != null) {
                str4 = str11;
                if (jSONObject3.has(str4)) {
                    jSONObject3.getDouble(str4);
                }
            } else {
                str4 = str11;
            }
            if (jSONObject3 != null) {
                jSONArray2 = jSONArray;
                str5 = str10;
                if (jSONObject3.has(str5)) {
                    jSONObject3.getString(str5);
                }
            } else {
                jSONArray2 = jSONArray;
                str5 = str10;
            }
            if (jSONObject3 != null) {
                str10 = str5;
                str6 = str9;
                if (jSONObject3.has(str6)) {
                    str9 = str6;
                    if (jSONObject3.getInt(str6) == 2) {
                    }
                    transcodingUser = new LiveTranscoding.TranscodingUser();
                    if (TextUtils.isEmpty(string3)) {
                        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setJsonForPostion ", "id is empty string"});
                        return;
                    }
                    transcodingUser.uid = Integer.parseInt(string3);
                    transcodingUser.zOrder = i2;
                    transcodingUser.alpha = 1.0f;
                    LiveTranscoding liveTranscoding7 = this.f5199h2;
                    int i12 = liveTranscoding7.width;
                    int i13 = i5;
                    String str111 = str14;
                    transcodingUser.x = (int) (((double) i12) * d2);
                    int i14 = liveTranscoding7.height;
                    String str112 = str7;
                    String str113 = str8;
                    transcodingUser.y = (int) (((double) i14) * d);
                    transcodingUser.width = (int) (((double) i12) * d4);
                    transcodingUser.height = (int) (((double) i14) * d3);
                    transcodingUser.audioChannel = i3;
                    liveTranscoding7.addUser(transcodingUser);
                    i5 = i13 + 1;
                    str7 = str112;
                    str12 = str3;
                    jSONArray = jSONArray2;
                    str14 = str111;
                    str8 = str113;
                    str13 = str2;
                    str11 = str4;
                } else {
                    str9 = str6;
                }
            } else {
                str10 = str5;
            }
            transcodingUser = new LiveTranscoding.TranscodingUser();
            if (TextUtils.isEmpty(string3)) {
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"setJsonForPostion ", "id is empty string"});
                return;
            }
            transcodingUser.uid = Integer.parseInt(string3);
            transcodingUser.zOrder = i2;
            transcodingUser.alpha = 1.0f;
            LiveTranscoding liveTranscoding8 = this.f5199h2;
            int i15 = liveTranscoding8.width;
            int i16 = i5;
            String str114 = str14;
            transcodingUser.x = (int) (((double) i15) * d2);
            int i17 = liveTranscoding8.height;
            String str115 = str7;
            String str116 = str8;
            transcodingUser.y = (int) (((double) i17) * d);
            transcodingUser.width = (int) (((double) i15) * d4);
            transcodingUser.height = (int) (((double) i17) * d3);
            transcodingUser.audioChannel = i3;
            liveTranscoding8.addUser(transcodingUser);
            i5 = i16 + 1;
            str7 = str115;
            str12 = str3;
            jSONArray = jSONArray2;
            str14 = str114;
            str8 = str116;
            str13 = str2;
            str11 = str4;
        }
        this.f5199h2.userConfigExtraInfo = m11567v6(string);
        if (iOptInt == 1) {
            this.f5199h2.userConfigExtraInfo = m11541p6(string);
        }
        m11470U5(((vlw) this.f5220o1).v0);
    }

    /* JADX INFO: renamed from: l.xc0$d */
    public class C0766d implements ExtAudioWrapper.InterfaceC0020i {
        public C0766d() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC0020i
        public int getStreamerType() {
            return 2;
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC0020i
        /* JADX INFO: renamed from: b */
        public void mo325b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC0020i
        /* JADX INFO: renamed from: a */
        public void mo324a(String str) {
        }
    }

    /* JADX INFO: renamed from: l.xc0$e */
    public class C0767e extends IRtcEngineEventHandler {

        /* JADX INFO: renamed from: l.xc0$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f5270a;

            public a(int i) {
                this.f5270a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (xc0.this.f5174Z0 != null) {
                    ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAdded Audio: userID=" + this.f5270a);
                    xc0.this.f5174Z0.a((long) this.f5270a, (SurfaceView) null, 176, 176);
                }
            }
        }

        public C0767e() {
        }

        public void onAudioMixingStateChanged(int i, int i2) {
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onAudioMixingStateChanged", "state:" + i + ", reasonCode:" + i2});
            switch (i) {
                case 710:
                    if (xc0.this.f5117I2 != null) {
                        xc0.this.f5117I2.m9317c();
                    }
                    break;
                case 711:
                    if (xc0.this.f5117I2 != null) {
                        xc0.this.f5117I2.m9316b();
                    }
                    break;
                case 713:
                    if (i2 == 723) {
                        xc0.this.f5092A1 = false;
                        xc0.this.m11449O7(null, 2, 0);
                        if (xc0.this.f5143R1 != null) {
                            xc0.this.f5143R1.onAudioMixingFinished();
                        }
                        break;
                    } else if (i2 == 724 && xc0.this.f5117I2 != null) {
                        xc0.this.f5117I2.m9318d();
                        break;
                    }
                    break;
                case 714:
                    if (xc0.this.f5117I2 != null) {
                        xc0.this.f5117I2.m9315a();
                    }
                    break;
            }
        }

        public void onAudioQuality(int i, int i2, short s, short s2) {
            ley leyVar = (ley) xc0.this.f5142R0.get(Long.valueOf(i));
            if (leyVar != null) {
                leyVar.j(s, s2);
            }
            if (xc0.this.f5159V1 != null) {
                xc0.this.f5159V1.onAudioQuality(i, i2, s, s2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:49:0x014b  */
        public void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            int length;
            if (audioVolumeInfoArr == null || audioVolumeInfoArr.length <= 0) {
                length = 1;
            } else {
                int i2 = audioVolumeInfoArr[0].uid;
                if (i2 != 0 && i2 != ((vlw) xc0.this.f5220o1).B0) {
                    xc0.this.f5134O1 = audioVolumeInfoArr;
                    if (xc0.this.f5140Q1 != null) {
                        AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[audioVolumeInfoArr.length];
                        for (int i3 = 0; i3 < audioVolumeInfoArr.length; i3++) {
                            AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                            audioVolumeWeight.uid = xc0.this.f5134O1[i3].uid;
                            audioVolumeWeight.volume = (xc0.this.f5134O1[i3].volume * 1.0f) / 255.0f;
                            audioVolumeWeightArr[i3] = audioVolumeWeight;
                        }
                        xc0.this.f5140Q1.onAudioVolumeIndication(audioVolumeWeightArr, i);
                    }
                    if (!xc0.this.f5219n3 && xc0.this.f5233s1 == 1) {
                        return;
                    }
                } else if (xc0.this.f5140Q1 != null) {
                    AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                    audioVolumeWeight2.uid = ((vlw) xc0.this.f5220o1).B0;
                    if (xc0.this.f5219n3) {
                        audioVolumeWeight2.volume = 0.0f;
                    } else {
                        audioVolumeWeight2.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
                    }
                    xc0.this.f5140Q1.onAudioVolumeIndication(new AudioVolumeWeight[]{audioVolumeWeight2}, i);
                }
                int i4 = audioVolumeInfoArr[0].uid;
                if (i4 == 0 || i4 == ((vlw) xc0.this.f5220o1).B0) {
                    length = xc0.this.f5134O1 != null ? xc0.this.f5134O1.length + 1 : 1;
                    AudioVolumeWeight[] audioVolumeWeightArr2 = new AudioVolumeWeight[length];
                    AudioVolumeWeight audioVolumeWeight3 = new AudioVolumeWeight();
                    audioVolumeWeight3.uid = ((vlw) xc0.this.f5220o1).B0;
                    if (xc0.this.f5219n3) {
                        audioVolumeWeight3.volume = 0.0f;
                    } else {
                        audioVolumeWeight3.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
                    }
                    audioVolumeWeight3.voicePitch = audioVolumeInfoArr[0].voicePitch;
                    audioVolumeWeightArr2[0] = audioVolumeWeight3;
                    audioVolumeWeight3.vad = audioVolumeInfoArr[0].vad;
                    int i5 = 0;
                    while (i5 < length - 1) {
                        AudioVolumeWeight audioVolumeWeight4 = new AudioVolumeWeight();
                        audioVolumeWeight4.uid = xc0.this.f5134O1[i5].uid;
                        audioVolumeWeight4.volume = (xc0.this.f5134O1[i5].volume * 1.0f) / 255.0f;
                        audioVolumeWeight4.voicePitch = xc0.this.f5134O1[i5].voicePitch;
                        i5++;
                        audioVolumeWeightArr2[i5] = audioVolumeWeight4;
                    }
                    if (xc0.this.f5137P1 != null) {
                        xc0.this.f5137P1.onAudioVolumeIndication(audioVolumeWeightArr2, i);
                    }
                    xc0.this.f5134O1 = null;
                } else {
                    length = 1;
                }
            }
            if (xc0.this.f5233s1 == 1 || xc0.this.f5134O1 == null) {
                return;
            }
            AudioVolumeWeight[] audioVolumeWeightArr3 = new AudioVolumeWeight[length];
            new AudioVolumeWeight();
            for (int i6 = 0; i6 < length; i6++) {
                AudioVolumeWeight audioVolumeWeight5 = new AudioVolumeWeight();
                audioVolumeWeight5.uid = xc0.this.f5134O1[i6].uid;
                audioVolumeWeight5.volume = (xc0.this.f5134O1[i6].volume * 1.0f) / 255.0f;
                audioVolumeWeight5.voicePitch = xc0.this.f5134O1[i6].voicePitch;
                audioVolumeWeightArr3[i6] = audioVolumeWeight5;
            }
            if (xc0.this.f5137P1 != null) {
                xc0.this.f5137P1.onAudioVolumeIndication(audioVolumeWeightArr3, i);
            }
            xc0.this.f5134O1 = null;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x004d  */
        public void onChannelMediaRelayStateChanged(int i, int i2) {
            int i3;
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onChannelMediaRelayStateChanged:", i + ", code:" + i2});
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "state" + i + ", code = " + i2);
            if (i == 0) {
                i3 = i2;
                if (i3 == 0) {
                    xc0.this.f5191e3 = false;
                    if (xc0.this.f5117I2 != null) {
                        xc0.this.f5117I2.m9323i(0, "RELAY_STATE_IDLE");
                    }
                }
                ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "初始化状态 code" + i3);
            } else if (i == 2) {
                i3 = i2;
                ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", " 源频道主播成功加入目标频道 code " + i3);
                if (xc0.this.f5117I2 != null) {
                    xc0.this.f5117I2.m9320f(0L, 1, "connect_success");
                }
            } else if (i != 3) {
                i3 = i2;
            } else {
                xc0.this.f5191e3 = false;
                if (xc0.this.f5117I2 != null) {
                    i3 = i2;
                    eyx.c().e("ConnectOtherRoom", "agora", i3, "onChannelMediaRelayStateChanged connect_failed", LogLevel.FATAL.value());
                    xc0.this.f5117I2.m9320f(0L, 3, "connect_failed,code:" + i3);
                } else {
                    i3 = i2;
                }
            }
            if (i3 == 8) {
                xc0.this.f5195g1.g(4352, i3, 0, this);
            }
        }

        public void onClientRoleChanged(int i, int i2, ClientRoleOptions clientRoleOptions) {
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onClientRoleChanged", Integer.valueOf(i), Integer.valueOf(i2)});
            if (((MediaBaseCodecFilter) xc0.this).H.b) {
                long j = ((MediaBaseCodecFilter) xc0.this).H.c1;
                xc0 xc0Var = xc0.this;
                if (j == 1) {
                    xc0Var.m11721h2();
                } else {
                    xc0Var.m11709f2();
                }
            }
            if (xc0.this.f5167X1 != null) {
                xc0.this.f5167X1.onClientRoleChanged(i, i2);
            }
            if (xc0.this.f5117I2 != null) {
                xc0.this.f5117I2.m9319e(i, i2);
            }
        }

        public void onConnectionStateChanged(int i, int i2) {
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onConnectionStateChanged", "state:" + i + ",reason:" + i2});
            switch (i2) {
                case 4:
                    ((MediaBaseCodecFilter) xc0.this).H.y0 = 810L;
                    ((MediaBaseCodecFilter) xc0.this).H.k0 = i2;
                    if (xc0.this.f5195g1 != null) {
                        xc0.this.f5195g1.g(4352, (int) ((MediaBaseCodecFilter) xc0.this).H.y0, i2, this);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    ((MediaBaseCodecFilter) xc0.this).H.y0 = i2 + 800;
                    ((MediaBaseCodecFilter) xc0.this).H.k0 = i2;
                    if (xc0.this.f5195g1 != null) {
                        xc0.this.f5195g1.g(4352, (int) ((MediaBaseCodecFilter) xc0.this).H.y0, i2, this);
                    }
                    break;
                case 10:
                    ((MediaBaseCodecFilter) xc0.this).H.y0 = 811L;
                    ((MediaBaseCodecFilter) xc0.this).H.k0 = i2;
                    if (xc0.this.f5195g1 != null) {
                        xc0.this.f5195g1.g(4352, (int) ((MediaBaseCodecFilter) xc0.this).H.y0, i2, this);
                    }
                    break;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i == 5 && i2 == 3) {
                        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onConnectionBanned");
                        if (xc0.this.f5163W1 != null) {
                            xc0.this.f5163W1.onReconnectTimeout();
                        }
                        if (xc0.this.f5117I2 != null) {
                            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onConnectionBannedByServer", "state:" + i + ",reason:" + i2});
                            xc0.this.f5117I2.m9321g(i2);
                        }
                    }
                } else if (i2 == 2) {
                    ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onConnectionInterrupted");
                    xc0.m11582z4(xc0.this);
                }
            } else if (xc0.this.f5213l3 != null) {
                xc0.this.f5213l3.removeCallbacks(xc0.this.f5126L2);
                xc0.this.f5206j3 = 0;
            }
            if (i2 == 15) {
                i = 6;
            }
            if (i2 == 16 && !xc0.this.f5194f3 && xc0.this.f5213l3 != null) {
                xc0.this.f5213l3.post(xc0.this.f5126L2);
            }
            if (xc0.this.f5117I2 != null) {
                ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onConnectionStateChanged", "state:" + i + ",reason:" + i2});
                xc0.this.f5117I2.m9322h(i, i2);
            }
        }

        public void onError(int i) {
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"agora onError", Integer.valueOf(i)});
        }

        public void onJoinChannelSuccess(String str, int i, int i2) {
            int i3;
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onJoinChannelSuccess", str, Integer.valueOf(i), Integer.valueOf(i2)});
            ii70 ii70VarD = ii70.d();
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" onJoinChannelSuccess ");
            sb.append(str);
            sb.append(" ");
            sb.append(i);
            sb.append(" ");
            long j = i;
            sb.append(4294967295L & j);
            sb.append(" ");
            sb.append(i2);
            ii70VarD.c("Pipeline_Normal_pip->PIPLINE->AGORA", sb.toString());
            ((MediaBaseCodecFilter) xc0.this).H.b = true;
            xc0.this.l2(MediaBaseCodecFilter.CodecFilterState.FILTER_PLAY);
            if (xc0.this.f5153U != null) {
                xc0.this.f5165X = true;
            }
            ((MediaBaseCodecFilter) xc0.this).J = MomoCodec.MomoCodecState.START;
            xc0.this.m11694c2();
            xc0.this.b2();
            xc0.this.f5195g1.g(4096, 0, 0, xc0.this);
            xc0.this.f5195g1.g(12306, 0, 0, xc0.this);
            if ((xc0.this.f5245w1 || xc0.this.f5242v1) && xc0.this.f5110G1 != 0) {
                xc0.this.m11441M6();
            }
            xc0.this.f5200h3 = System.currentTimeMillis();
            if (xc0.this.f5202i2 && xc0.this.f5153U != null) {
                xc0 xc0Var = xc0.this;
                xc0Var.m11491a8(xc0Var.f5205j2);
                xc0.this.f5202i2 = false;
            }
            if (xc0.this.f5143R1 != null) {
                xc0.this.f5143R1.onJoinChannelSuccess(str, j, i2);
            }
            int i4 = xc0.this.f5119J1;
            xc0 xc0Var2 = xc0.this;
            if (i4 > 0) {
                i3 = xc0Var2.f5119J1;
            } else {
                i3 = ((vlw) xc0Var2.f5220o1).S0 != 0 ? ((vlw) xc0.this.f5220o1).S0 : 15;
            }
            int i5 = i3;
            int i6 = ((ulw) xc0.this.f5220o1).k;
            xc0 xc0Var3 = xc0.this;
            if (i6 > 0) {
                xc0Var3.m11478W5(xc0Var3.f5220o1.f3961h1, ((ulw) xc0.this.f5220o1).k, ((ulw) xc0.this.f5220o1).l, xc0.this.f5116I1, i5, ((vlw) xc0.this.f5220o1).v0);
            } else {
                xc0Var3.m11478W5(xc0Var3.f5220o1.f3961h1, ((ulw) xc0.this.f5220o1).s, ((ulw) xc0.this.f5220o1).t, xc0.this.f5116I1, i5, ((vlw) xc0.this.f5220o1).v0);
            }
            if (!xc0.this.f5220o1.f3961h1 || xc0.this.f5199h2.getUsers().size() <= 0 || xc0.this.f5244v3 || TextUtils.isEmpty(((vlw) xc0.this.f5220o1).v0)) {
                return;
            }
            xc0 xc0Var4 = xc0.this;
            xc0Var4.m11431J7(((vlw) xc0Var4.f5220o1).v0);
        }

        public void onLastmileQuality(int i) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onLastmileQuality " + i);
            xc0.this.f5195g1.g(4101, i, 0, xc0.this);
        }

        public void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + " onLeaveChannelstats:" + rtcStats);
            if (rtcStats != null) {
                ((MediaBaseCodecFilter) xc0.this).H.B = rtcStats.txBytes;
                n8c.a("AgoraJzheng", "" + rtcStats.txBytes + "/" + rtcStats.totalDuration);
            }
            if (xc0.this.f5114H2 != null) {
                xc0.this.f5114H2.onExitRoom();
            }
        }

        public void onLocalAudioStateChanged(int i, int i2) {
            if (xc0.this.f5117I2 != null) {
                xc0.this.f5117I2.m9325k(i, i2);
            }
        }

        public void onLocalVideoStats(Constants.VideoSourceType videoSourceType, IRtcEngineEventHandler.LocalVideoStats localVideoStats) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onLocalVideoStatsstats:" + localVideoStats);
            xc0.this.f5139Q0 = localVideoStats;
            if (localVideoStats != null) {
                ((MediaBaseCodecFilter) xc0.this).H.g = ((MediaBaseCodecFilter) xc0.this).s.H0 ? 2L : 0L;
                ((MediaBaseCodecFilter) xc0.this).H.H = localVideoStats.encodedFrameCount;
            }
            if (xc0.this.f5150T0 = false) {
                xc0.this.f5150T0 = true;
                xc0.this.f5154U0 = false;
                xc0.this.f5195g1.g(4099, 0, 0, xc0.this);
                xc0.m11459R4(xc0.this);
            }
            if (xc0.this.f5155U1 != null) {
                xc0.this.f5178a2.a = xc0.this.f5139Q0.sentBitrate;
                xc0.this.f5178a2.b = xc0.this.f5139Q0.sentFrameRate;
                xc0.this.f5155U1.b(xc0.this.f5178a2);
            }
            int i = localVideoStats.targetBitrate * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE;
            int i2 = localVideoStats.targetFrameRate;
            if (i == 0 || i2 == 0) {
                return;
            }
            if (xc0.this.f5222o3 == i && xc0.this.f5226p3 == i2) {
                return;
            }
            if (xc0.this.f5222o3 > i || xc0.this.f5226p3 > i2) {
                xc0.this.f5195g1.g(8197, 1, 0, this);
            } else {
                xc0.this.f5195g1.g(8197, 0, 0, this);
            }
            xc0.this.f5222o3 = i;
            xc0.this.f5226p3 = i2;
        }

        public void onMediaEngineLoadSuccess() {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onMediaEngineLoadSuccess");
        }

        public void onNetworkQuality(int i, int i2, int i3) {
            if (xc0.this.f5159V1 != null) {
                xc0.this.f5159V1.onNetworkQuality(i, i2, i3);
            }
            if (xc0.this.f5117I2 != null) {
                if (i == 0) {
                    i = ((vlw) xc0.this.f5220o1).B0;
                    ((MediaBaseCodecFilter) xc0.this).H.q0 = i2;
                    ((MediaBaseCodecFilter) xc0.this).H.r0 = i3;
                }
                xc0.this.f5117I2.m9326l(i, i2, i3);
            }
        }

        public void onRejoinChannelSuccess(String str, int i, int i2) {
            ii70.d().c("MyEngineEventHandler", "onRejoinChannelSuccess " + str + " " + i + " " + i2);
        }

        public void onRemoteAudioStateChanged(int i, int i2, int i3, int i4) {
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onRemoteAudioStateChanged", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            if (i2 == 1) {
                super.onRemoteAudioStateChanged(i, i2, i3, i4);
                long j = i;
                a9y a9yVar = (a9y) xc0.this.f5146S0.get(Long.valueOf(j));
                if (a9yVar == null || a9yVar.e()) {
                    return;
                }
                a9yVar.h(true);
                ((MediaBaseCodecFilter) xc0.this).I.b(a9yVar.c(), j, xc0.this.f5197g3, a9yVar.a(), System.currentTimeMillis() - a9yVar.b());
            }
        }

        public void onRemoteAudioStats(IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats) {
            ley leyVar;
            if (remoteAudioStats == null || (leyVar = (ley) xc0.this.f5142R0.get(Long.valueOf(remoteAudioStats.uid))) == null) {
                return;
            }
            leyVar.a = remoteAudioStats.receivedBitrate;
            int i = leyVar.t;
            int i2 = remoteAudioStats.plcCount;
            leyVar.t = i + i2;
            leyVar.u += remoteAudioStats.frozenRateByCustomPlcCount;
            leyVar.z += remoteAudioStats.audioLossRate * 10;
            int i3 = leyVar.A;
            int i4 = remoteAudioStats.networkTransportDelay;
            leyVar.A = i3 + i4;
            leyVar.j += remoteAudioStats.jitterBufferDelay + i4;
            leyVar.B++;
            leyVar.F += i2 * 10;
            leyVar.f = remoteAudioStats.rxAudioBytes;
        }

        public void onRemoteVideoStateChanged(int i, int i2, int i3, int i4) {
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onRemoteVideoStateChanged", "uid:" + i + ", state:" + i2 + ", reason:" + i3});
            if (i2 == 1 && i3 == 6) {
                xc0 xc0Var = xc0.this;
                xc0Var.f5168X2 = i;
                boolean zContains = xc0Var.f5212l2.contains(Integer.valueOf(i));
                xc0 xc0Var2 = xc0.this;
                if (!zContains) {
                    xc0Var2.m11645O6(i, i4);
                    return;
                }
                if (((MediaBaseCodecFilter) xc0Var2).I != null) {
                    ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onRemoteVideoStateChanged remoteUid " + i + ",text"});
                }
                xc0.this.m11731j8(i);
            }
        }

        public void onRemoteVideoStats(IRtcEngineEventHandler.RemoteVideoStats remoteVideoStats) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", " onRemoteVideoStatsstats:" + remoteVideoStats + "w " + remoteVideoStats.width + " h " + remoteVideoStats.height + " bits " + remoteVideoStats.receivedBitrate + " fps " + remoteVideoStats.rendererOutputFrameRate);
            ley leyVar = (ley) xc0.this.f5142R0.get(Long.valueOf((long) remoteVideoStats.uid));
            if (leyVar != null) {
                leyVar.k(remoteVideoStats.receivedBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
                leyVar.m = remoteVideoStats.packetLossRate;
                leyVar.e = remoteVideoStats.rxVideoBytes;
                leyVar.c += (long) remoteVideoStats.decoderOutputFrameRate;
                leyVar.C++;
                leyVar.l = remoteVideoStats.e2eDelay;
                int i = remoteVideoStats.totalFrozenTime;
                int i2 = leyVar.H;
                if (i - i2 > 0) {
                    leyVar.G += i - i2;
                }
                leyVar.H = i;
            }
            xc0.this.f5136P0 = remoteVideoStats;
            if (xc0.this.f5155U1 != null) {
                xc0.this.f5181b2.b = xc0.this.f5136P0.delay;
                xc0.this.f5181b2.d = xc0.this.f5136P0.height;
                xc0.this.f5181b2.b = xc0.this.f5136P0.delay;
                xc0.this.f5181b2.e = xc0.this.f5136P0.receivedBitrate;
                xc0.this.f5181b2.f = xc0.this.f5136P0.rendererOutputFrameRate;
                xc0.this.f5181b2.g = xc0.this.f5136P0.rxStreamType;
                xc0.this.f5181b2.a = xc0.this.f5136P0.uid;
                xc0.this.f5181b2.c = xc0.this.f5136P0.width;
                xc0.this.f5155U1.a(xc0.this.f5181b2);
            }
        }

        public void onRemoteVideoTransportStats(int i, int i2, int i3, int i4) {
            ley leyVar;
            if (xc0.this.f5142R0 != null) {
                long j = i;
                if (!xc0.this.f5142R0.containsKey(Long.valueOf(j)) || (leyVar = (ley) xc0.this.f5142R0.get(Long.valueOf(j))) == null) {
                    return;
                }
                leyVar.b = i4;
            }
        }

        public void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onRtcStatsstats:" + rtcStats);
            xc0.this.f5133O0 = rtcStats;
            ((MediaBaseCodecFilter) xc0.this).H.B = (long) xc0.this.f5133O0.txBytes;
            ((MediaBaseCodecFilter) xc0.this).H.O = xc0.this.f5133O0.rxAudioKBitRate;
            ((MediaBaseCodecFilter) xc0.this).H.j = xc0.this.f5133O0.rxBytes;
            ((MediaBaseCodecFilter) xc0.this).H.k = xc0.this.f5133O0.rxVideoBytes;
            ((MediaBaseCodecFilter) xc0.this).H.l = xc0.this.f5133O0.rxAudioBytes;
            ((MediaBaseCodecFilter) xc0.this).H.J0 = xc0.this.f5133O0.txVideoBytes;
            ((MediaBaseCodecFilter) xc0.this).H.I0 = xc0.this.f5133O0.txAudioBytes;
            xc0.this.f5124L0 += (long) ((xc0.this.f5133O0.txVideoKBitRate * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE) / 8);
            xc0.this.f5130N0 += (long) ((xc0.this.f5133O0.txAudioKBitRate * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE) / 8);
            xc0.this.f5127M0 += (xc0.this.f5133O0.rxVideoKBitRate * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE) / 8;
            xc0.this.f5195g1.g(4098, 0, 0, xc0.this);
            xc0.m11582z4(xc0.this);
        }

        public void onRtmpStreamingStateChanged(String str, int i, int i2) {
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onRtmpStreamingStateChanged " + str + ",state:" + i + ",code:" + i2});
            hmx hmxVar = ((MediaBaseCodecFilter) xc0.this).I;
            StringBuilder sb = new StringBuilder("");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            hmxVar.k("AgoraRtmpState", sb.toString());
            if (2 == i) {
                xc0.this.f5248x1 = true;
                if (xc0.this.f5199h2 != null && xc0.this.f5199h2.getUsers().size() > 0 && xc0.this.f5153U != null) {
                    xc0.this.f5153U.updateRtmpTranscoding(xc0.this.f5199h2);
                    xc0.this.m11597D6();
                    ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onRtmpStreamingStateChanged", "rtmpState updateRtmpTranscoding"});
                }
                ((MediaBaseCodecFilter) xc0.this).H.x = str;
                xc0.this.f5238t3 = true;
                xc0.this.f5195g1.g(4104, 0, 0, xc0.this);
            }
            if (4 == i && ((i2 == 1 || i2 == 3 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 11 || i2 == 13 || i2 == 14 || i2 == 15) && xc0.this.f5117I2 != null)) {
                xc0.this.f5117I2.m9330p(str, i2);
            }
            if (i == 0 || 4 == i) {
                xc0.this.f5248x1 = false;
            }
            if (xc0.this.f5117I2 != null) {
                xc0.this.f5117I2.m9331q(str, i, i2, "agora", xc0.this.f5220o1.f3960g1, ((vlw) xc0.this.f5220o1).B0);
            }
        }

        public void onStreamMessage(int i, int i2, byte[] bArr) {
            if (xc0.this.f5147S1 != null) {
                xc0.this.f5147S1.onStreamMessage(i, i2, bArr);
            }
        }

        public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
            if (xc0.this.f5147S1 != null) {
                xc0.this.f5147S1.onStreamMessageError(i, i2, i3, i4, i5);
            }
        }

        public void onTokenPrivilegeWillExpire(String str) {
            if (xc0.this.f5151T1 != null) {
                xc0.this.f5151T1.onTokenPrivilegeWillExpire(str);
            }
            if (xc0.this.f5147S1 != null) {
                xc0.this.f5147S1.onRequestChannelKey();
            }
        }

        public void onUserJoined(int i, int i2) {
            long j = i;
            a9y a9yVar = new a9y(j, "S".equals(xc0.this.m11774w1()) ? 1 : 2);
            if (xc0.this.f5200h3 != -1) {
                a9yVar.j(System.currentTimeMillis());
                a9yVar.i(System.currentTimeMillis() - xc0.this.f5200h3);
            }
            xc0.this.f5146S0.put(Long.valueOf(j), a9yVar);
            ((MediaBaseCodecFilter) xc0.this).I.e(true, a9yVar.c(), j, xc0.this.f5197g3, a9yVar.a());
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onUserJoined", "uid:" + i});
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + " onUserJoined:uid:" + i + ",elapsed:" + i2);
            if ((xc0.this.f5245w1 || xc0.this.f5242v1) && xc0.this.f5220o1.f3962i1 != i) {
                a9yVar.f(true);
                a9yVar.g(true);
                ((MediaBaseCodecFilter) xc0.this).I.c(true, a9yVar.c(), j, xc0.this.f5197g3, a9yVar.a(), -1L);
                xc0.this.f5195g1.g(8198, i, 0, xc0.this);
                xc0.this.f5213l3.post(new a(i));
            }
            xc0.this.f5142R0.put(Long.valueOf(j), new ley(j));
            if (xc0.this.f5143R1 != null) {
                xc0.this.f5143R1.onJoinChannelSuccess("", j, i2);
            }
        }

        public void onUserMuteAudio(int i, boolean z) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onUserMuteAudiouid:" + i + ",muted:" + z);
            ley leyVar = (ley) xc0.this.f5142R0.get(Long.valueOf((long) i));
            if (leyVar != null) {
                leyVar.g(z);
            }
            if (xc0.this.f5143R1 != null) {
                xc0.this.f5143R1.onUserMuteAudio(i, z);
            }
        }

        public void onUserMuteVideo(int i, boolean z) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onUserMuteVideouid:" + i + ",muted:" + z);
            ley leyVar = (ley) xc0.this.f5142R0.get(Long.valueOf((long) i));
            if (leyVar != null) {
                leyVar.h(z);
            }
            if (xc0.this.f5143R1 != null) {
                xc0.this.f5143R1.onUserMuteVideo(i, z);
            }
        }

        public void onUserOffline(int i, int i2) {
            int i3 = i2;
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "onUserOffline:uid:" + i + ",reason:" + i3);
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onUserOffline uid:" + i + ",reason:" + i3});
            long j = 0;
            if (xc0.this.f5142R0 != null) {
                long j2 = i;
                if (xc0.this.f5142R0.containsKey(Long.valueOf(j2))) {
                    ley leyVar = (ley) xc0.this.f5142R0.get(Long.valueOf(j2));
                    j = leyVar != null ? leyVar.d : 0L;
                    xc0.this.f5142R0.remove(Long.valueOf(j2));
                }
            }
            long j3 = j;
            if (xc0.this.f5146S0 != null) {
                long j4 = i;
                if (xc0.this.f5146S0.containsKey(Long.valueOf(j4))) {
                    n8c.a("zhengjijian", "onMemberExit userid " + i + " reason " + i3);
                    if (((MediaBaseCodecFilter) xc0.this).H.c1 == 1) {
                        ((MediaBaseCodecFilter) xc0.this).I.d(true, ((a9y) xc0.this.f5146S0.get(Long.valueOf(j4))).c(), j4, i3);
                        ((MediaBaseCodecFilter) xc0.this).I.f(true, ((a9y) xc0.this.f5146S0.get(Long.valueOf(j4))).c(), j3, 0L, j4, i2);
                        i3 = i2;
                    }
                    xc0.this.f5195g1.g(8199, i, 0, xc0.this);
                }
            }
            if (xc0.this.f5174Z0 != null && (!xc0.this.f5187d2 || xc0.this.f5245w1 || xc0.this.f5242v1)) {
                ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemove userID=" + i);
                if (xc0.this.f5179a3.contains(Integer.valueOf(i)) && xc0.this.f5153U != null) {
                    xc0.this.m11683Z7(i, null);
                    xc0.this.f5179a3.remove(Integer.valueOf(i));
                }
                xc0.this.f5174Z0.b(i, i3);
                ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onVideoChannelRemove uid:" + i + ",reason:" + i3});
            }
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"isUseTextureView", Boolean.valueOf(((vlw) xc0.this.f5220o1).Z0)});
            if (((vlw) xc0.this.f5220o1).Z0 && xc0.this.f5153U != null && xc0.this.f5176Z2 != null && xc0.this.f5176Z2.containsKey(Integer.valueOf(i))) {
                ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"setupRemoteVideoview null"});
                xc0.this.m11683Z7(i, null);
                xc0.this.f5176Z2.remove(Integer.valueOf(i));
                if (xc0.this.f5183c1 != null) {
                    xc0.this.f5183c1.b(i, i3);
                }
            }
            if (xc0.this.f5143R1 != null) {
                xc0.this.f5143R1.onUserOffline(i, i3);
            }
            if (xc0.this.f5212l2.contains(Integer.valueOf(i)) && xc0.this.f5180b1 != null) {
                ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"remoteUidList removeid" + i});
                xc0.this.f5180b1.b((long) i, i3);
                xc0.this.f5212l2.remove(i);
            }
            if (xc0.this.f5254z1 != null) {
                if (xc0.this.f5254z1.containsKey(Integer.valueOf(i)) || i == ((vlw) xc0.this.f5220o1).B0) {
                    if (i != ((vlw) xc0.this.f5220o1).B0) {
                        xc0.this.f5254z1.remove(Integer.valueOf(i));
                    }
                    boolean z = xc0.this.f5187d2;
                    xc0 xc0Var = xc0.this;
                    if (!z) {
                        if (xc0Var.f5180b1 != null) {
                            long j5 = i;
                            xc0.this.f5180b1.b(j5, i3);
                            xc0.this.f5104E1.setVideoSurface(j5, (Surface) null);
                            return;
                        }
                        return;
                    }
                    if (xc0Var.f5177a1 != null) {
                        ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt userID=" + i);
                        xc0.this.f5177a1.b((long) i, i3);
                    }
                }
            }
        }

        public void onVideoSizeChanged(Constants.VideoSourceType videoSourceType, int i, int i2, int i3, int i4) {
            Log.e("lqdebug", "onVideoSizeChanged uid" + i + ",width " + i2 + ", height" + i3);
            ((MediaBaseCodecFilter) xc0.this).I.l(new Object[]{"onVideoSizeChanged uid:" + i + ", width:" + i2 + ", height:" + i3});
            if (xc0.this.f5117I2 == null || i == 0) {
                return;
            }
            xc0.this.f5117I2.m9332r(i, i2, i3);
        }

        public void onAudioMixingFinished() {
        }

        public void onConnectionLost() {
        }

        public void onRequestToken() {
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m11687b0() {
    }

    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    /* JADX INFO: renamed from: B5 */
    public void m11588B5(wmw wmwVar) {
    }

    /* JADX INFO: renamed from: E5 */
    public void m11600E5(xmw xmwVar) {
    }

    /* JADX INFO: renamed from: K1 */
    public void m11625K1(mpd0 mpd0Var) {
    }

    /* JADX INFO: renamed from: M5 */
    public void m11637M5(anw anwVar) {
    }

    /* JADX INFO: renamed from: Z5 */
    public void m11681Z5(boolean z) {
    }

    /* JADX INFO: renamed from: m1 */
    public void m11741m1(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: v7 */
    public void m11773v7(String str) {
    }

    /* JADX INFO: renamed from: w7 */
    public void m11776w7(String str) {
    }

    /* JADX INFO: renamed from: C7 */
    public void m11593C7(boolean z, int i) {
    }

    /* JADX INFO: renamed from: i6 */
    public void m11725i6(long j, boolean z) {
    }

    /* JADX INFO: renamed from: y7 */
    public void m11783y7(boolean z, boolean z2) {
    }

    @RequiresApi(api = 15)
    public xc0(Context context, yw00 yw00Var, hu00.a aVar, vlw vlwVar) {
        super(context);
        this.f5145S = "Pipeline_Normal_pip->PIPLINE->AGORA";
        this.f5149T = true;
        this.f5157V = -1;
        this.f5165X = false;
        this.f5169Y = false;
        this.f5173Z = false;
        this.f5207k0 = 2;
        this.f5223p0 = 3;
        this.f5103E0 = -1;
        this.f5106F0 = -1;
        this.f5109G0 = false;
        this.f5112H0 = true;
        this.f5115I0 = null;
        this.f5124L0 = 0L;
        this.f5127M0 = 0;
        this.f5130N0 = 0L;
        this.f5142R0 = new PipelineConcurrentHashMap<>();
        this.f5146S0 = new PipelineConcurrentHashMap<>();
        this.f5150T0 = false;
        this.f5154U0 = true;
        this.f5158V0 = 0;
        this.f5162W0 = 0;
        this.f5166X0 = 0;
        this.f5170Y0 = null;
        this.f5174Z0 = null;
        this.f5177a1 = null;
        this.f5180b1 = null;
        this.f5183c1 = null;
        this.f5189e1 = false;
        this.f5192f1 = false;
        this.f5198h1 = 1.0f;
        this.f5201i1 = 1.0f;
        this.f5204j1 = 44100;
        this.f5208k1 = 0;
        this.f5211l1 = 0;
        this.f5214m1 = 0;
        this.f5217n1 = 0;
        this.f5224p1 = -1;
        this.f5230r1 = null;
        this.f5233s1 = 1;
        this.f5236t1 = new Object();
        this.f5239u1 = 0;
        this.f5242v1 = false;
        this.f5245w1 = false;
        this.f5248x1 = false;
        this.f5251y1 = new Object();
        this.f5254z1 = new PipelineConcurrentHashMap();
        this.f5092A1 = false;
        this.f5101D1 = null;
        this.f5104E1 = null;
        this.f5110G1 = 0;
        this.f5113H1 = 2;
        this.f5116I1 = 750;
        this.f5119J1 = 0;
        this.f5122K1 = "";
        this.f5125L1 = false;
        this.f5131N1 = null;
        this.f5134O1 = null;
        this.f5171Y1 = new zmw();
        this.f5175Z1 = new zmw();
        this.f5178a2 = new jjw();
        this.f5181b2 = new vmw();
        this.f5187d2 = false;
        this.f5190e2 = false;
        this.f5193f2 = true;
        this.f5196g2 = false;
        this.f5199h2 = null;
        this.f5202i2 = false;
        this.f5209k2 = 0L;
        this.f5212l2 = new ArrayList<>(20);
        this.f5215m2 = 0;
        this.f5218n2 = 1;
        this.f5221o2 = 2;
        this.f5225p2 = 3;
        this.f5228q2 = 4;
        this.f5231r2 = 5;
        this.f5234s2 = 6;
        this.f5237t2 = 7;
        this.f5240u2 = 8;
        this.f5243v2 = null;
        this.f5246w2 = 0;
        this.f5249x2 = 1;
        this.f5252y2 = 2;
        this.f5255z2 = 3;
        this.f5093A2 = 0;
        this.f5096B2 = 1;
        this.f5099C2 = 2;
        this.f5102D2 = false;
        this.f5105E2 = Long.MIN_VALUE;
        this.f5108F2 = 1000L;
        this.f5111G2 = null;
        this.f5120J2 = 1;
        this.f5123K2 = System.currentTimeMillis();
        this.f5126L2 = null;
        this.f5129M2 = false;
        this.f5132N2 = 0.0f;
        this.f5135O2 = 0.0f;
        this.f5138P2 = 0.0f;
        this.f5141Q2 = 0.0f;
        this.f5144R2 = 0;
        this.f5148S2 = 0;
        this.f5152T2 = 0;
        this.f5156U2 = 0;
        this.f5160V2 = true;
        this.f5164W2 = false;
        this.f5168X2 = 0;
        this.f5172Y2 = false;
        this.f5176Z2 = new PipelineConcurrentHashMap();
        this.f5179a3 = new ArrayList<>(20);
        this.f5182b3 = "";
        this.f5185c3 = false;
        this.f5188d3 = 0;
        this.f5191e3 = false;
        this.f5194f3 = false;
        this.f5197g3 = -1L;
        this.f5200h3 = -1L;
        this.f5203i3 = 0;
        this.f5206j3 = 0;
        this.f5210k3 = 0;
        this.f5213l3 = new Handler(Looper.getMainLooper());
        this.f5216m3 = false;
        this.f5219n3 = false;
        this.f5222o3 = 0;
        this.f5226p3 = 0;
        this.f5229q3 = 0;
        this.f5232r3 = "";
        this.f5235s3 = false;
        this.f5238t3 = false;
        this.f5241u3 = 0L;
        this.f5244v3 = false;
        this.f5247w3 = false;
        this.f5250x3 = 0;
        this.f5253y3 = 0;
        this.f5256z3 = false;
        this.f5094A3 = false;
        this.f5100C3 = false;
        this.f5118J0 = yw00Var;
        this.f5220o1 = (qmr) vlwVar;
        this.f5150T0 = false;
        this.f5154U0 = true;
        this.f5195g1 = aVar;
        this.f5104E1 = new CongressUtil();
        m11513h6(vlwVar);
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.d = 258L;
        zmxVar.e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }

    /* JADX INFO: renamed from: l.xc0$j */
    public class SurfaceHolderCallbackC0772j implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f5278a;

        public SurfaceHolderCallbackC0772j(int i) {
            this.f5278a = i;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            xc0.this.f5104E1.setVideoSurface(this.f5278a, surfaceHolder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            xc0.this.f5104E1.setVideoSurface(this.f5278a, (Surface) null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }
    }
}
