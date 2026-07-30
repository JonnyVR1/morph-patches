package p149l;

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
import com.bef.effectsdk.message.MessageCenter;
import com.core.glcore.util.DetectDelayStopHelper;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.heytap.mcssdk.mode.CommandMessage;
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
import com.immomo.momomediaext.sei.BaseSei;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.MomoInterface.MomoPipeline;
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import com.momo.piplineext.RendererCommon;
import com.momo.piplineext.http.HttpWrapper;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
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
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class xc0 extends MediaBaseCodecFilter implements IAudioFrameObserver, sml, ewl, gw00.InterfaceC17174f {

    /* JADX INFO: renamed from: D3 */
    private static final float[] f191976D3 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A1 */
    private volatile boolean f191977A1;

    /* JADX INFO: renamed from: A2 */
    public final int f191978A2;

    /* JADX INFO: renamed from: A3 */
    private boolean f191979A3;

    /* JADX INFO: renamed from: B1 */
    private String f191980B1;

    /* JADX INFO: renamed from: B2 */
    public final int f191981B2;

    /* JADX INFO: renamed from: B3 */
    private MRtcPusherHandler f191982B3;

    /* JADX INFO: renamed from: C1 */
    private String f191983C1;

    /* JADX INFO: renamed from: C2 */
    public final int f191984C2;

    /* JADX INFO: renamed from: C3 */
    private boolean f191985C3;

    /* JADX INFO: renamed from: D1 */
    public SurfaceTexture f191986D1;

    /* JADX INFO: renamed from: D2 */
    private boolean f191987D2;

    /* JADX INFO: renamed from: E0 */
    private int f191988E0;

    /* JADX INFO: renamed from: E1 */
    private CongressUtil f191989E1;

    /* JADX INFO: renamed from: E2 */
    private long f191990E2;

    /* JADX INFO: renamed from: F0 */
    private int f191991F0;

    /* JADX INFO: renamed from: F1 */
    private pcmDataAvailableCallback f191992F1;

    /* JADX INFO: renamed from: F2 */
    private long f191993F2;

    /* JADX INFO: renamed from: G0 */
    private boolean f191994G0;

    /* JADX INFO: renamed from: G1 */
    private int f191995G1;

    /* JADX INFO: renamed from: G2 */
    MRtcReceiveSeiHandler f191996G2;

    /* JADX INFO: renamed from: H0 */
    private boolean f191997H0;

    /* JADX INFO: renamed from: H1 */
    private int f191998H1;

    /* JADX INFO: renamed from: H2 */
    private MRtcExitRoomHandler f191999H2;

    /* JADX INFO: renamed from: I0 */
    private String f192000I0;

    /* JADX INFO: renamed from: I1 */
    private int f192001I1;

    /* JADX INFO: renamed from: I2 */
    private hgd0 f192002I2;

    /* JADX INFO: renamed from: J0 */
    private yw00 f192003J0;

    /* JADX INFO: renamed from: J1 */
    private int f192004J1;

    /* JADX INFO: renamed from: J2 */
    private int f192005J2;

    /* JADX INFO: renamed from: K0 */
    private wb1 f192006K0;

    /* JADX INFO: renamed from: K1 */
    private String f192007K1;

    /* JADX INFO: renamed from: K2 */
    private long f192008K2;

    /* JADX INFO: renamed from: L0 */
    private long f192009L0;

    /* JADX INFO: renamed from: L1 */
    private boolean f192010L1;

    /* JADX INFO: renamed from: L2 */
    private Runnable f192011L2;

    /* JADX INFO: renamed from: M0 */
    private int f192012M0;

    /* JADX INFO: renamed from: M1 */
    IRtcEngineEventHandler f192013M1;

    /* JADX INFO: renamed from: M2 */
    private boolean f192014M2;

    /* JADX INFO: renamed from: N0 */
    private long f192015N0;

    /* JADX INFO: renamed from: N1 */
    Runnable f192016N1;

    /* JADX INFO: renamed from: N2 */
    private float f192017N2;

    /* JADX INFO: renamed from: O0 */
    private IRtcEngineEventHandler.RtcStats f192018O0;

    /* JADX INFO: renamed from: O1 */
    private IRtcEngineEventHandler.AudioVolumeInfo[] f192019O1;

    /* JADX INFO: renamed from: O2 */
    private float f192020O2;

    /* JADX INFO: renamed from: P0 */
    private IRtcEngineEventHandler.RemoteVideoStats f192021P0;

    /* JADX INFO: renamed from: P1 */
    private MRtcAudioHandler f192022P1;

    /* JADX INFO: renamed from: P2 */
    private float f192023P2;

    /* JADX INFO: renamed from: Q0 */
    private IRtcEngineEventHandler.LocalVideoStats f192024Q0;

    /* JADX INFO: renamed from: Q1 */
    private MRtcAudioHandlerEx f192025Q1;

    /* JADX INFO: renamed from: Q2 */
    private float f192026Q2;

    /* JADX INFO: renamed from: R0 */
    private PipelineConcurrentHashMap<Long, ley> f192027R0;

    /* JADX INFO: renamed from: R1 */
    private MRtcEventHandler f192028R1;

    /* JADX INFO: renamed from: R2 */
    private int f192029R2;

    /* JADX INFO: renamed from: S */
    private final String f192030S;

    /* JADX INFO: renamed from: S0 */
    private PipelineConcurrentHashMap<Long, a9y> f192031S0;

    /* JADX INFO: renamed from: S1 */
    private MRtcChannelHandler f192032S1;

    /* JADX INFO: renamed from: S2 */
    private int f192033S2;

    /* JADX INFO: renamed from: T */
    private boolean f192034T;

    /* JADX INFO: renamed from: T0 */
    private boolean f192035T0;

    /* JADX INFO: renamed from: T1 */
    private MRtcTokenWillExpireHander f192036T1;

    /* JADX INFO: renamed from: T2 */
    private int f192037T2;

    /* JADX INFO: renamed from: U */
    private RtcEngine f192038U;

    /* JADX INFO: renamed from: U0 */
    private boolean f192039U0;

    /* JADX INFO: renamed from: U1 */
    private ymw f192040U1;

    /* JADX INFO: renamed from: U2 */
    private int f192041U2;

    /* JADX INFO: renamed from: V */
    private int f192042V;

    /* JADX INFO: renamed from: V0 */
    private int f192043V0;

    /* JADX INFO: renamed from: V1 */
    private MRtcQualityHandler f192044V1;

    /* JADX INFO: renamed from: V2 */
    private boolean f192045V2;

    /* JADX INFO: renamed from: W */
    private EGLContext f192046W;

    /* JADX INFO: renamed from: W0 */
    private int f192047W0;

    /* JADX INFO: renamed from: W1 */
    private MRtcConnectHandler f192048W1;

    /* JADX INFO: renamed from: W2 */
    private boolean f192049W2;

    /* JADX INFO: renamed from: X */
    private volatile boolean f192050X;

    /* JADX INFO: renamed from: X0 */
    private volatile int f192051X0;

    /* JADX INFO: renamed from: X1 */
    private MRtcClientRoleChangedHandler f192052X1;

    /* JADX INFO: renamed from: X2 */
    public int f192053X2;

    /* JADX INFO: renamed from: Y */
    private boolean f192054Y;

    /* JADX INFO: renamed from: Y0 */
    private String f192055Y0;

    /* JADX INFO: renamed from: Y1 */
    private zmw f192056Y1;

    /* JADX INFO: renamed from: Y2 */
    private boolean f192057Y2;

    /* JADX INFO: renamed from: Z */
    private boolean f192058Z;

    /* JADX INFO: renamed from: Z0 */
    private z1l0 f192059Z0;

    /* JADX INFO: renamed from: Z1 */
    private zmw f192060Z1;

    /* JADX INFO: renamed from: Z2 */
    private PipelineConcurrentHashMap f192061Z2;

    /* JADX INFO: renamed from: a1 */
    private a2l0 f192062a1;

    /* JADX INFO: renamed from: a2 */
    private jjw f192063a2;

    /* JADX INFO: renamed from: a3 */
    private ArrayList<Integer> f192064a3;

    /* JADX INFO: renamed from: b1 */
    private cbl0 f192065b1;

    /* JADX INFO: renamed from: b2 */
    private vmw f192066b2;

    /* JADX INFO: renamed from: b3 */
    private String f192067b3;

    /* JADX INFO: renamed from: c1 */
    private b2l0 f192068c1;

    /* JADX INFO: renamed from: c2 */
    private C21081l f192069c2;

    /* JADX INFO: renamed from: c3 */
    private boolean f192070c3;

    /* JADX INFO: renamed from: d1 */
    private sml.InterfaceC19992a f192071d1;

    /* JADX INFO: renamed from: d2 */
    private boolean f192072d2;

    /* JADX INFO: renamed from: d3 */
    private int f192073d3;

    /* JADX INFO: renamed from: e1 */
    private boolean f192074e1;

    /* JADX INFO: renamed from: e2 */
    private boolean f192075e2;

    /* JADX INFO: renamed from: e3 */
    private boolean f192076e3;

    /* JADX INFO: renamed from: f1 */
    private boolean f192077f1;

    /* JADX INFO: renamed from: f2 */
    private boolean f192078f2;

    /* JADX INFO: renamed from: f3 */
    private boolean f192079f3;

    /* JADX INFO: renamed from: g1 */
    private hu00.InterfaceC17392a f192080g1;

    /* JADX INFO: renamed from: g2 */
    private boolean f192081g2;

    /* JADX INFO: renamed from: g3 */
    private long f192082g3;

    /* JADX INFO: renamed from: h1 */
    private float f192083h1;

    /* JADX INFO: renamed from: h2 */
    private LiveTranscoding f192084h2;

    /* JADX INFO: renamed from: h3 */
    private long f192085h3;

    /* JADX INFO: renamed from: i1 */
    private float f192086i1;

    /* JADX INFO: renamed from: i2 */
    private boolean f192087i2;

    /* JADX INFO: renamed from: i3 */
    private int f192088i3;

    /* JADX INFO: renamed from: j1 */
    public int f192089j1;

    /* JADX INFO: renamed from: j2 */
    private String f192090j2;

    /* JADX INFO: renamed from: j3 */
    private int f192091j3;

    /* JADX INFO: renamed from: k0 */
    private int f192092k0;

    /* JADX INFO: renamed from: k1 */
    private int f192093k1;

    /* JADX INFO: renamed from: k2 */
    private long f192094k2;

    /* JADX INFO: renamed from: k3 */
    private int f192095k3;

    /* JADX INFO: renamed from: l1 */
    private int f192096l1;

    /* JADX INFO: renamed from: l2 */
    private ArrayList<Integer> f192097l2;

    /* JADX INFO: renamed from: l3 */
    private Handler f192098l3;

    /* JADX INFO: renamed from: m1 */
    private int f192099m1;

    /* JADX INFO: renamed from: m2 */
    public final int f192100m2;

    /* JADX INFO: renamed from: m3 */
    private boolean f192101m3;

    /* JADX INFO: renamed from: n1 */
    private int f192102n1;

    /* JADX INFO: renamed from: n2 */
    public final int f192103n2;

    /* JADX INFO: renamed from: n3 */
    private boolean f192104n3;

    /* JADX INFO: renamed from: o1 */
    private qmr f192105o1;

    /* JADX INFO: renamed from: o2 */
    public final int f192106o2;

    /* JADX INFO: renamed from: o3 */
    private int f192107o3;

    /* JADX INFO: renamed from: p0 */
    private int f192108p0;

    /* JADX INFO: renamed from: p1 */
    protected int f192109p1;

    /* JADX INFO: renamed from: p2 */
    public final int f192110p2;

    /* JADX INFO: renamed from: p3 */
    private int f192111p3;

    /* JADX INFO: renamed from: q1 */
    private boolean f192112q1;

    /* JADX INFO: renamed from: q2 */
    public final int f192113q2;

    /* JADX INFO: renamed from: q3 */
    private int f192114q3;

    /* JADX INFO: renamed from: r1 */
    private String f192115r1;

    /* JADX INFO: renamed from: r2 */
    public final int f192116r2;

    /* JADX INFO: renamed from: r3 */
    private String f192117r3;

    /* JADX INFO: renamed from: s1 */
    private int f192118s1;

    /* JADX INFO: renamed from: s2 */
    public final int f192119s2;

    /* JADX INFO: renamed from: s3 */
    private volatile boolean f192120s3;

    /* JADX INFO: renamed from: t1 */
    private Object f192121t1;

    /* JADX INFO: renamed from: t2 */
    private final int f192122t2;

    /* JADX INFO: renamed from: t3 */
    private boolean f192123t3;

    /* JADX INFO: renamed from: u1 */
    private int f192124u1;

    /* JADX INFO: renamed from: u2 */
    private final int f192125u2;

    /* JADX INFO: renamed from: u3 */
    private long f192126u3;

    /* JADX INFO: renamed from: v1 */
    private boolean f192127v1;

    /* JADX INFO: renamed from: v2 */
    private MRtcRealLayoutNotifyHander f192128v2;

    /* JADX INFO: renamed from: v3 */
    private boolean f192129v3;

    /* JADX INFO: renamed from: w1 */
    private boolean f192130w1;

    /* JADX INFO: renamed from: w2 */
    public final int f192131w2;

    /* JADX INFO: renamed from: w3 */
    private boolean f192132w3;

    /* JADX INFO: renamed from: x1 */
    private boolean f192133x1;

    /* JADX INFO: renamed from: x2 */
    public final int f192134x2;

    /* JADX INFO: renamed from: x3 */
    private int f192135x3;

    /* JADX INFO: renamed from: y1 */
    private Object f192136y1;

    /* JADX INFO: renamed from: y2 */
    public final int f192137y2;

    /* JADX INFO: renamed from: y3 */
    private int f192138y3;

    /* JADX INFO: renamed from: z1 */
    private PipelineConcurrentHashMap f192139z1;

    /* JADX INFO: renamed from: z2 */
    public final int f192140z2;

    /* JADX INFO: renamed from: z3 */
    private volatile boolean f192141z3;

    /* JADX INFO: renamed from: l.xc0$a */
    public class RunnableC21070a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f192142a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f192143b;

        public RunnableC21070a(int i, View view) {
            this.f192142a = i;
            this.f192143b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("clear_view setupRemoteVideo", this.f192142a + ",view is " + this.f192143b);
            if (xc0.this.f192038U != null) {
                xc0.this.f192038U.setupRemoteVideo(new VideoCanvas(this.f192143b, 1, this.f192142a));
            }
        }
    }

    /* JADX INFO: renamed from: l.xc0$b */
    public class C21071b implements cbl0.InterfaceC16102b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f192145a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f192146b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f192147c;

        public C21071b(int i, int i2, int i3) {
            this.f192145a = i;
            this.f192146b = i2;
            this.f192147c = i3;
        }

        @Override // p149l.cbl0.InterfaceC16102b
        /* JADX INFO: renamed from: a */
        public void mo106018a(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(this.f192145a, this.f192146b);
            xc0.this.f191989E1.setVideoSurface(this.f192147c, new Surface(surfaceTexture));
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onSurfaceTextureReady surfaceTexture:" + surfaceTexture);
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE->AGORA", "onSurfaceTextureReady: uid=" + this.f192147c + ", size=" + this.f192145a + BaseSei.f13930X + this.f192146b);
        }
    }

    /* JADX INFO: renamed from: l.xc0$c */
    public class RunnableC21072c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f192149a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ byte[] f192150b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f192151c;

        public RunnableC21072c(byte[] bArr, byte[] bArr2, long j) {
            this.f192149a = bArr;
            this.f192150b = bArr2;
            this.f192151c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            xc0.this.f192128v2.OnRealLayoutChange(this.f192149a, this.f192150b, 1, this.f192151c);
        }
    }

    /* JADX INFO: renamed from: l.xc0$f */
    public class RunnableC21075f implements Runnable {
        public RunnableC21075f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (xc0.this.f192080g1 != null) {
                xc0.this.f192080g1.mo128349g(4353, 10, 0, xc0.this);
            }
            if (xc0.this.f192028R1 != null) {
                xc0.this.f192028R1.onConnectionLost();
            }
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203901y0 = 812L;
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203865k0 = Constants.RHYTHM_PLAYER_STATE_DECODING;
            xc0.this.f192091j3 = 1;
            xc0.this.m19736e2(4353, 10);
            if (((MediaBaseCodecFilter) xc0.this).f14269I != null) {
                ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("configConnectLost", "errorcode 812");
            }
            xc0.this.mo19662f();
        }
    }

    /* JADX INFO: renamed from: l.xc0$g */
    public class C21076g implements IMetadataObserver {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f192158a;

        public C21076g(long j) {
            this.f192158a = j;
        }

        @Override // io.agora.rtc2.IMetadataObserver
        public int getMaxMetadataSize() {
            if (!xc0.this.f192045V2) {
                return 0;
            }
            boolean z = xc0.this.f192070c3;
            xc0 xc0Var = xc0.this;
            if (z) {
                if (TextUtils.isEmpty(xc0Var.f192067b3)) {
                    return 1024;
                }
                xc0.this.f192067b3.getClass();
                return 1024;
            }
            String str = xc0Var.f191980B1;
            xc0 xc0Var2 = xc0.this;
            if (str != null) {
                int length = xc0Var2.m207914v6(xc0Var2.f191980B1).getBytes().length;
                return 1024;
            }
            if (xc0Var2.f191983C1 == null) {
                return 1024;
            }
            int length2 = xc0.this.f191983C1.getBytes().length;
            return 1024;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IMetadataObserver
        public void onMetadataReceived(AgoraMetadata agoraMetadata) {
            if (agoraMetadata == null || agoraMetadata.data == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(agoraMetadata.data));
                if (jSONObject.has("bType")) {
                    int iOptInt = jSONObject.optInt("bType");
                    ((MediaBaseCodecFilter) xc0.this).f14268H.f203888s = iOptInt;
                    hjx.m131421d("Pipeline_Normal_pip->PIPLINE->AGORA", "onReceiveSEI getbType: " + iOptInt);
                }
                if (jSONObject.has(com.tencent.connect.common.Constants.f57189TS)) {
                    long jM121707X = fjx.m121638R().m121707X() - Long.valueOf(jSONObject.optString(com.tencent.connect.common.Constants.f57189TS)).longValue();
                    ley leyVar = (ley) xc0.this.f192027R0.get(Long.valueOf(this.f192158a));
                    if (leyVar != null) {
                        leyVar.f127786E++;
                        leyVar.f127785D = (int) (((long) leyVar.f127785D) + jM121707X);
                    }
                }
            } catch (Exception e) {
                ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onMetadataReceived error", "" + e.toString());
            }
            xc0 xc0Var = xc0.this;
            if (xc0Var.f191996G2 == null || xc0Var.f192105o1 == null) {
                return;
            }
            xc0 xc0Var2 = xc0.this;
            xc0Var2.f191996G2.OnReceiveH264Sei(agoraMetadata.data, xc0Var2.f192105o1.f182013B0, "");
        }

        @Override // io.agora.rtc2.IMetadataObserver
        public byte[] onReadyToSendMetadata(long j, int i) {
            if (xc0.this.f191990E2 == Long.MIN_VALUE) {
                xc0.this.f191990E2 = System.currentTimeMillis();
            }
            byte[] bytes = null;
            if (xc0.this.f192045V2 && System.currentTimeMillis() - xc0.this.f191990E2 > xc0.this.f191993F2) {
                boolean z = xc0.this.f192129v3;
                xc0 xc0Var = xc0.this;
                if (z) {
                    try {
                        JSONObject jSONObject = new JSONObject("" + xc0Var.f191980B1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("asr", 44100);
                        int i2 = xc0.this.f192084h2.audioBitrate;
                        if (i2 < 1000) {
                            i2 *= 1000;
                        }
                        jSONObject2.put("abr", i2);
                        jSONObject2.put("achl", xc0.this.f192084h2.audioChannels);
                        jSONObject2.put("acpf", LiveTranscoding.AudioCodecProfileType.getValue(xc0.this.f192084h2.audioCodecProfile));
                        jSONObject2.put("w", ((MediaBaseCodecFilter) xc0.this).f14281s.f177148k);
                        jSONObject2.put("h", ((MediaBaseCodecFilter) xc0.this).f14281s.f177150l);
                        jSONObject2.put("gop", ((MediaBaseCodecFilter) xc0.this).f14281s.f177108G);
                        jSONObject2.put("fps", ((MediaBaseCodecFilter) xc0.this).f14281s.f177107F);
                        jSONObject2.put("vbr", ((MediaBaseCodecFilter) xc0.this).f14281s.f177109H);
                        jSONObject2.put("vcpf", ((MediaBaseCodecFilter) xc0.this).f14281s.f182019H0 ? 2 : 1);
                        jSONObject.put("mixInfo", jSONObject2);
                        bytes = jSONObject.toString().getBytes();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    boolean z2 = xc0Var.f192070c3;
                    xc0 xc0Var2 = xc0.this;
                    if (!z2) {
                        String str = xc0Var2.f191980B1;
                        xc0 xc0Var3 = xc0.this;
                        if (str != null) {
                            bytes = xc0Var3.m207914v6(xc0Var3.f191980B1).getBytes();
                        } else if (xc0Var3.f191983C1 != null) {
                            bytes = xc0.this.f191983C1.getBytes();
                        }
                    } else if (!TextUtils.isEmpty(xc0Var2.f192067b3)) {
                        bytes = xc0.this.f192067b3.getBytes();
                    }
                }
                xc0.this.f191990E2 = System.currentTimeMillis();
            }
            return bytes;
        }
    }

    /* JADX INFO: renamed from: l.xc0$h */
    public class RunnableC21077h implements Runnable {
        public RunnableC21077h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xc0.this.mo19662f();
        }
    }

    /* JADX INFO: renamed from: l.xc0$i */
    public class RunnableC21078i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f192161a;

        public RunnableC21078i(int i) {
            this.f192161a = i;
        }

        @Override // java.lang.Runnable
        @RequiresApi(api = 15)
        public void run() {
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("old handleVideoRenderStart");
            xc0.this.m207930z6(this.f192161a);
        }
    }

    /* JADX INFO: renamed from: l.xc0$k */
    public class C21080k implements cbl0.InterfaceC16103c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f192165a;

        public C21080k(int i) {
            this.f192165a = i;
        }

        @Override // p149l.cbl0.InterfaceC16103c
        /* JADX INFO: renamed from: a */
        public void mo20064a(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(xc0.this.width, xc0.this.height);
            xc0.this.f191989E1.setVideoSurface(this.f192165a, new Surface(surfaceTexture));
        }
    }

    /* JADX INFO: renamed from: l.xc0$l */
    public class C21081l extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f192167a;

        public C21081l(String str) {
            super(str);
            this.f192167a = false;
        }

        /* JADX INFO: renamed from: a */
        public void m208055a() {
            this.f192167a = true;
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f192167a) {
                try {
                    Thread.sleep(66L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (ztk.f204735f == null) {
                    ztk.f204735f = new byte[((xc0.this.f192105o1.f177152m * xc0.this.f192105o1.f177154n) * 3) / 2];
                }
                xc0.this.mo19667o1(ByteBuffer.wrap(ztk.f204735f));
            }
        }
    }

    public xc0(Context context, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar, String str) {
        super(context);
        this.f192030S = "Pipeline_Normal_pip->PIPLINE->AGORA";
        this.f192034T = true;
        this.f192042V = -1;
        this.f192050X = false;
        this.f192054Y = false;
        this.f192058Z = false;
        this.f192092k0 = 2;
        this.f192108p0 = 3;
        this.f191988E0 = -1;
        this.f191991F0 = -1;
        this.f191994G0 = false;
        this.f191997H0 = true;
        this.f192000I0 = null;
        this.f192009L0 = 0L;
        this.f192012M0 = 0;
        this.f192015N0 = 0L;
        this.f192027R0 = new PipelineConcurrentHashMap<>();
        this.f192031S0 = new PipelineConcurrentHashMap<>();
        this.f192035T0 = false;
        this.f192039U0 = true;
        this.f192043V0 = 0;
        this.f192047W0 = 0;
        this.f192051X0 = 0;
        this.f192055Y0 = null;
        this.f192059Z0 = null;
        this.f192062a1 = null;
        this.f192065b1 = null;
        this.f192068c1 = null;
        this.f192074e1 = false;
        this.f192077f1 = false;
        this.f192083h1 = 1.0f;
        this.f192086i1 = 1.0f;
        this.f192089j1 = 44100;
        this.f192093k1 = 0;
        this.f192096l1 = 0;
        this.f192099m1 = 0;
        this.f192102n1 = 0;
        this.f192109p1 = -1;
        this.f192115r1 = null;
        this.f192118s1 = 1;
        this.f192121t1 = new Object();
        this.f192124u1 = 0;
        this.f192127v1 = false;
        this.f192130w1 = false;
        this.f192133x1 = false;
        this.f192136y1 = new Object();
        this.f192139z1 = new PipelineConcurrentHashMap();
        this.f191977A1 = false;
        this.f191986D1 = null;
        this.f191989E1 = null;
        this.f191995G1 = 0;
        this.f191998H1 = 2;
        this.f192001I1 = DetectDelayStopHelper.TYPE_DETECT_PICKNOISE;
        this.f192004J1 = 0;
        this.f192007K1 = "";
        this.f192010L1 = false;
        this.f192016N1 = null;
        this.f192019O1 = null;
        this.f192056Y1 = new zmw();
        this.f192060Z1 = new zmw();
        this.f192063a2 = new jjw();
        this.f192066b2 = new vmw();
        this.f192072d2 = false;
        this.f192075e2 = false;
        this.f192078f2 = true;
        this.f192081g2 = false;
        this.f192084h2 = null;
        this.f192087i2 = false;
        this.f192094k2 = 0L;
        this.f192097l2 = new ArrayList<>(20);
        this.f192100m2 = 0;
        this.f192103n2 = 1;
        this.f192106o2 = 2;
        this.f192110p2 = 3;
        this.f192113q2 = 4;
        this.f192116r2 = 5;
        this.f192119s2 = 6;
        this.f192122t2 = 7;
        this.f192125u2 = 8;
        this.f192128v2 = null;
        this.f192131w2 = 0;
        this.f192134x2 = 1;
        this.f192137y2 = 2;
        this.f192140z2 = 3;
        this.f191978A2 = 0;
        this.f191981B2 = 1;
        this.f191984C2 = 2;
        this.f191987D2 = false;
        this.f191990E2 = Long.MIN_VALUE;
        this.f191993F2 = 1000L;
        this.f191996G2 = null;
        this.f192005J2 = 1;
        this.f192008K2 = System.currentTimeMillis();
        this.f192011L2 = null;
        this.f192014M2 = false;
        this.f192017N2 = 0.0f;
        this.f192020O2 = 0.0f;
        this.f192023P2 = 0.0f;
        this.f192026Q2 = 0.0f;
        this.f192029R2 = 0;
        this.f192033S2 = 0;
        this.f192037T2 = 0;
        this.f192041U2 = 0;
        this.f192045V2 = true;
        this.f192049W2 = false;
        this.f192053X2 = 0;
        this.f192057Y2 = false;
        this.f192061Z2 = new PipelineConcurrentHashMap();
        this.f192064a3 = new ArrayList<>(20);
        this.f192067b3 = "";
        this.f192070c3 = false;
        this.f192073d3 = 0;
        this.f192076e3 = false;
        this.f192079f3 = false;
        this.f192082g3 = -1L;
        this.f192085h3 = -1L;
        this.f192088i3 = 0;
        this.f192091j3 = 0;
        this.f192095k3 = 0;
        this.f192098l3 = new Handler(Looper.getMainLooper());
        this.f192101m3 = false;
        this.f192104n3 = false;
        this.f192107o3 = 0;
        this.f192111p3 = 0;
        this.f192114q3 = 0;
        this.f192117r3 = "";
        this.f192120s3 = false;
        this.f192123t3 = false;
        this.f192126u3 = 0L;
        this.f192129v3 = false;
        this.f192132w3 = false;
        this.f192135x3 = 0;
        this.f192138y3 = 0;
        this.f192141z3 = false;
        this.f191979A3 = false;
        this.f191985C3 = false;
        this.f192055Y0 = str;
        this.f192003J0 = yw00Var;
        this.f192105o1 = (qmr) vlwVar;
        this.f192035T0 = false;
        this.f192039U0 = true;
        this.f192080g1 = interfaceC17392a;
        this.f191989E1 = new CongressUtil();
        m207860h6(vlwVar);
        zmx zmxVar = this.f14268H;
        zmxVar.f203843d = 258L;
        zmxVar.f203848e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }

    /* JADX INFO: renamed from: A6 */
    private int m207748A6() {
        int i = 0;
        if (!this.f192130w1 && !this.f192101m3) {
            i = 1;
        }
        return i ^ 1;
    }

    /* JADX INFO: renamed from: B6 */
    private final void m207752B6(String str, int i) {
        xc0 xc0Var;
        if (this.f192038U != null) {
            this.f14269I.m131787l("mmLiveAudioProfile:" + this.f191988E0 + ",mmLiveAudioScenario:" + this.f191991F0 + ",getAudioProfile() = " + fjx.m121638R().m121787t() + ",getAudioScenario()=" + fjx.m121638R().m121790u());
            int i2 = this.f191988E0;
            if (i2 != -1) {
                this.f192092k0 = m208022j6(i2);
                this.f14268H.f203877o0 = this.f191988E0;
            } else {
                int iM121787t = fjx.m121638R().m121787t();
                zmx zmxVar = this.f14268H;
                if (iM121787t != -1) {
                    zmxVar.f203877o0 = iM121787t;
                    this.f192092k0 = m208022j6(iM121787t);
                } else {
                    zmxVar.f203877o0 = 1;
                    this.f192092k0 = m208022j6(1);
                }
            }
            int i3 = this.f191991F0;
            if (i3 != -1) {
                this.f192108p0 = m208027l6(i3);
                this.f14268H.f203880p0 = this.f191991F0;
            } else {
                int iM121790u = fjx.m121638R().m121790u();
                if (iM121790u != -1) {
                    this.f192108p0 = m208027l6(iM121790u);
                    this.f14268H.f203880p0 = iM121790u;
                } else {
                    this.f192108p0 = m208027l6(0);
                    this.f14268H.f203880p0 = 0;
                }
            }
            m208014g6(this.f192092k0, this.f192108p0);
            m208008e6(this.f191997H0);
            this.f192074e1 = false;
            this.f192038U.registerAudioFrameObserver(null);
            if (this.f192127v1 || this.f192072d2 || this.f192075e2 || this.f192071d1 != null) {
                this.f14269I.m131787l("registerAudioFrameObserver 2458");
                this.f192038U.registerAudioFrameObserver(this);
                this.f192074e1 = true;
            }
            if (this.f192112q1) {
                m207756C6("1");
            }
            m207800P7();
            RtcEngine rtcEngine = this.f192038U;
            if (rtcEngine != null && this.f192078f2) {
                rtcEngine.setDefaultAudioRoutetoSpeakerphone(true);
            }
            int i4 = this.f192004J1;
            if (i4 <= 0 && (i4 = this.f192105o1.f182030S0) == 0) {
                i4 = 15;
            }
            int i5 = i4;
            qmr qmrVar = this.f192105o1;
            int i6 = qmrVar.f177148k;
            if (i6 > 0) {
                xc0Var = this;
                xc0Var.m207825W5(qmrVar.f155326h1, i6, qmrVar.f177150l, this.f192001I1, i5, qmrVar.f182043v0);
            } else {
                xc0Var = this;
                xc0Var.m207825W5(qmrVar.f155326h1, qmrVar.f177164s, qmrVar.f177166t, xc0Var.f192001I1, i5, qmrVar.f182043v0);
            }
            RtcEngine rtcEngine2 = xc0Var.f192038U;
            if (rtcEngine2 != null) {
                rtcEngine2.setRemoteSubscribeFallbackOption(0);
            }
            xc0Var.f192005J2 = fjx.m121638R().m121772o();
            xc0Var.f192011L2 = xc0Var.new RunnableC21075f();
            if (xc0Var.f192105o1.f182039b1 == 1) {
                xc0Var.f192038U.setParameters("{\"che.audio.force_bluetooth_a2dp\":true}");
                xc0Var.f14269I.m131787l("force_bluetooth_a2dp", "true");
            }
            int iM121781r = fjx.m121638R().m121781r();
            RtcEngine rtcEngine3 = xc0Var.f192038U;
            if (iM121781r == 1) {
                rtcEngine3.setParameters("{\"che.audio.aiaec.working_mode\":1}");
            } else {
                rtcEngine3.setParameters("{\"che.audio.aiaec.working_mode\":0}");
            }
            int iM121784s = fjx.m121638R().m121784s();
            RtcEngine rtcEngine4 = xc0Var.f192038U;
            if (iM121784s == 1) {
                rtcEngine4.setParameters("{\"che.audio.ains_mode\":2}");
                xc0Var.f192038U.setParameters("{\"che.audio.nsng.lowerBound\":80}");
                xc0Var.f192038U.setParameters("{\"che.audio.nsng.lowerMask\":50}");
                xc0Var.f192038U.setParameters("{\"che.audio.nsng.statisticalbound\":5}");
                xc0Var.f192038U.setParameters("{\"che.audio.nsng.finallowermask\":30}");
                xc0Var.f192038U.setParameters("{\"che.audio.nsng.enhfactorstastical\":200}");
            } else {
                rtcEngine4.setParameters("{\"che.audio.ains_mode\":0}");
            }
            xc0Var.f14269I.m131787l("joinChannel", "channel:" + str + ",uid:" + i + ",token:" + xc0Var.f192115r1 + ", aec:" + fjx.m121638R().m121781r() + ",ns:" + fjx.m121638R().m121784s());
            int iJoinChannel = xc0Var.f192038U.joinChannel(xc0Var.f192115r1, str, (String) null, i);
            hmx hmxVar = xc0Var.f14269I;
            StringBuilder sb = new StringBuilder(" ret:");
            sb.append(iJoinChannel);
            sb.append(",channel:");
            sb.append(str);
            sb.append(",uid:");
            sb.append(i);
            hmxVar.m131787l("joinChannel", sb.toString());
            if (iJoinChannel < 0) {
                zmx zmxVar2 = xc0Var.f14268H;
                zmxVar2.f203901y0 = 810L;
                zmxVar2.f203865k0 = iJoinChannel;
            }
            xc0Var.f14269I.m131786k("joinChannel", "" + iJoinChannel);
            if (iJoinChannel < 0 && xc0Var.f192028R1 != null) {
                xc0Var.f14269I.m131787l("joinChannel failed", " ret:" + iJoinChannel + "channel:" + str + ",uid:" + i);
                xc0Var.f192028R1.onJoinChannelfail(str, (long) i, iJoinChannel);
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "joinChannel#############" + iJoinChannel + "xx channel" + str);
            xc0Var.f192112q1 = true;
            xc0Var.m207934B7(1.0f);
        }
    }

    /* JADX INFO: renamed from: C6 */
    private final void m207756C6(String str) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "leaveChannel >>>>>" + str);
        this.f14269I.m131787l("leaveChannel");
        synchronized (this.f192121t1) {
            try {
                if (this.f192038U != null) {
                    if (this.f14281s.f182043v0 != null) {
                        this.f14269I.m131787l("stopRtmpStream:" + this.f14281s.f182043v0);
                        this.f192038U.stopRtmpStream(this.f14281s.f182043v0);
                    }
                    this.f192038U.leaveChannel();
                    this.f192038U.registerAudioFrameObserver(null);
                    this.f192074e1 = false;
                }
                this.f192112q1 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f192105o1.f155323e1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J7 */
    public void m207778J7(String str) {
        RtcEngine rtcEngine;
        synchronized (this.f192136y1) {
            try {
                if (!this.f192133x1 && !this.f192049W2 && (rtcEngine = this.f192038U) != null) {
                    rtcEngine.startRtmpStreamWithTranscoding(str, this.f192084h2);
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onStreamPublished addPublishStreamUrl:url=" + str);
                    this.f14269I.m131786k("setRtcEnginePublishStreamUrl", "startRtmpStreamWithTranscoding enable:" + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M6 */
    public void m207788M6() {
        if (this.f14268H.f203840c == 0) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "AGORA_PUBLISHING");
            this.f192080g1.mo128349g(4103, 0, 0, this);
            this.f14268H.f203840c = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: N6 */
    private void m207792N6(byte[] bArr, byte[] bArr2) {
        Handler handler;
        long j = this.f192105o1.f182013B0;
        if (this.f192128v2 == null || (handler = this.f192098l3) == null) {
            return;
        }
        handler.post(new RunnableC21072c(bArr, bArr2, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O7 */
    public void m207796O7(Object obj, int i, int i2) {
        za1 za1VarM20080C2;
        u3m u3mVar = this.f14271K;
        if (u3mVar == null || (za1VarM20080C2 = ((ExtAudioWrapper) u3mVar).m20080C2()) == null) {
            return;
        }
        za1VarM20080C2.mo18373a(obj, i, i2);
    }

    /* JADX INFO: renamed from: P7 */
    private void m207800P7() {
        RtcEngine rtcEngine;
        if (this.f192105o1 == null) {
            return;
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "setVideoProfileEx1 bitrate:" + this.f192105o1.f177152m + "<>" + this.f192105o1.f177154n + "<>" + this.f192105o1.f177109H + "<mergecanvasWidth>" + this.f192105o1.f177148k);
        m208008e6(this.f191997H0);
        if (this.f192130w1 || (rtcEngine = this.f192038U) == null) {
            return;
        }
        rtcEngine.setParameters("{\"che.video.keyFrameInterval\":1}");
        qmr qmrVar = this.f192105o1;
        int i = qmrVar.f182030S0;
        if (i == 0) {
            i = 15;
        }
        int i2 = i;
        if (qmrVar.f182017F0 && qmrVar.m198870d() == 1) {
            qmr qmrVar2 = this.f192105o1;
            m207985V7(qmrVar2.f177154n, qmrVar2.f177152m, i2, qmrVar2.f177109H / 1000, qmrVar2.f182038a1);
        } else {
            qmr qmrVar3 = this.f192105o1;
            m207985V7(qmrVar3.f177152m, qmrVar3.f177154n, i2, qmrVar3.f177109H / 1000, qmrVar3.f182038a1);
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ int m207806R4(xc0 xc0Var) {
        int i = xc0Var.f192043V0;
        xc0Var.f192043V0 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: T5 */
    private final void m207813T5(int i, int i2) {
        qmr qmrVar = this.f192105o1;
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
        m207881n8();
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.setClientRole(i);
        }
    }

    /* JADX INFO: renamed from: U5 */
    private void m207817U5(String str) {
        if (this.f192038U == null || this.f192084h2 == null) {
            return;
        }
        this.f14269I.m131787l("configLiveTransCoding: user count" + this.f192084h2.getUsers().size() + ",mHavaPublish" + this.f192133x1);
        if (str == null || TextUtils.isEmpty(str) || this.f192084h2.getUsers().size() <= 0) {
            return;
        }
        String string = "{ \"canvas\":{ \"w\":" + this.f192084h2.width + ",\"h\":" + this.f192084h2.height + ",\"conf\":[";
        for (LiveTranscoding.TranscodingUser transcodingUser : this.f192084h2.getUsers()) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "llcqxl:<<<<<<<<<,uid:" + transcodingUser.uid + ",x:" + transcodingUser.f63365x + ",y:" + transcodingUser.f63366y + ",width:" + transcodingUser.width + ",height:" + transcodingUser.height + ",alpha:" + transcodingUser.alpha + ",zOrder:" + transcodingUser.zOrder + ">>>>>>>>>>");
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("{\"id\":");
            sb.append(transcodingUser.uid);
            sb.append(",\"x\":");
            sb.append(transcodingUser.f63365x);
            sb.append(",\"y\":");
            sb.append(transcodingUser.f63366y);
            sb.append(",\"width\":");
            sb.append(transcodingUser.width);
            sb.append(",\"height\":");
            sb.append(transcodingUser.height);
            sb.append("},");
            string = sb.toString();
        }
        String strConcat = string.concat(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        LiveTranscoding liveTranscoding = this.f192084h2;
        liveTranscoding.lowLatency = true;
        liveTranscoding.videoGop = 15;
        synchronized (this.f192136y1) {
            try {
                if (this.f192133x1) {
                    Log.e("lqdebug", "publishConfig:w:" + this.f192084h2.width + ",height:" + this.f192084h2.height);
                    this.f192038U.updateRtmpTranscoding(this.f192084h2);
                    m207938D6();
                    this.f14269I.m131787l("publishConfig:" + this.f192084h2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(this.f192084h2.userConfigExtraInfo)) {
            m207792N6(strConcat.getBytes(), this.f192084h2.userConfigExtraInfo.getBytes());
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "addPublishStreamUrl configLiveTransCoding");
    }

    /* JADX INFO: renamed from: V5 */
    private void m207821V5(long j) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine == null) {
            return;
        }
        rtcEngine.registerMediaMetadataObserver(new C21076g(j), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W5 */
    public void m207825W5(boolean z, int i, int i2, int i3, int i4, String str) {
        if (z) {
            this.f191998H1 = 1;
            if (this.f192084h2 == null) {
                this.f192084h2 = new LiveTranscoding();
            }
            this.f14269I.m131787l("agoraTranscode", "width:" + i + ",height:" + i2 + ",br:" + i3 + ",fps:" + i4);
            int iM121782r0 = fjx.m121638R().m121782r0();
            LiveTranscoding liveTranscoding = this.f192084h2;
            liveTranscoding.width = i;
            liveTranscoding.height = i2;
            liveTranscoding.audioBitrate = iM121782r0 == 0 ? 128 : iM121782r0;
            liveTranscoding.audioChannels = 2;
            liveTranscoding.audioSampleRate = LiveTranscoding.AudioSampleRateType.TYPE_44100;
            liveTranscoding.videoBitrate = i3;
            liveTranscoding.videoFramerate = i4;
            fjx.m121638R().m121669K();
            this.f192084h2.videoCodecType = this.f14281s.f182019H0 ? LiveTranscoding.VideoCodecType.H265 : LiveTranscoding.VideoCodecType.H264;
            int iM121728d = fjx.m121638R().m121728d();
            if (1 == iM121728d) {
                this.f192084h2.audioCodecProfile = LiveTranscoding.AudioCodecProfileType.HE_AAC;
            } else if (2 == iM121728d) {
                this.f192084h2.audioCodecProfile = LiveTranscoding.AudioCodecProfileType.HE_AAC_V2;
            }
            this.f14269I.m131787l("tanscode_aBitrate", Integer.valueOf(iM121782r0));
            this.f14269I.m131786k("audioProfile", "[pub=Agora,profile=" + iM121728d + com.clevertap.android.sdk.Constants.AES_SUFFIX);
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", com.clevertap.android.sdk.Constants.KEY_CONFIG + this.f192084h2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a8 */
    public int m207838a8(String str) {
        ChannelMediaInfo channelMediaInfo = new ChannelMediaInfo("", "", 0);
        ChannelMediaInfo channelMediaInfo2 = new ChannelMediaInfo(str, "", this.f192105o1.f155327i1);
        ChannelMediaRelayConfiguration channelMediaRelayConfiguration = new ChannelMediaRelayConfiguration();
        channelMediaRelayConfiguration.setSrcChannelInfo(channelMediaInfo);
        channelMediaRelayConfiguration.setDestChannelInfo(str, channelMediaInfo2);
        if (this.f192076e3) {
            return 0;
        }
        int iStartOrUpdateChannelMediaRelay = this.f192038U.startOrUpdateChannelMediaRelay(channelMediaRelayConfiguration);
        this.f14269I.m131787l("startChannelMediaRelay ret:" + iStartOrUpdateChannelMediaRelay);
        if (iStartOrUpdateChannelMediaRelay >= 0) {
            this.f192076e3 = true;
            return iStartOrUpdateChannelMediaRelay;
        }
        this.f192076e3 = false;
        eyx.m118802c().m118806e("ConnectOtherRoom", "agora", iStartOrUpdateChannelMediaRelay, "startChannelMediaRelay falied", LogLevel.FATAL.value());
        this.f192002I2.mo19154f(0L, 3, "");
        return iStartOrUpdateChannelMediaRelay;
    }

    /* JADX INFO: renamed from: h6 */
    private RtcEngine m207860h6(vlw vlwVar) {
        this.f14281s = vlwVar;
        m208028l7(vlwVar.f177117P);
        this.f191994G0 = vlwVar.f177160q;
        if (this.f192038U == null) {
            CongressUtil congressUtil = this.f191989E1;
            if (congressUtil != null) {
                congressUtil.getPara(new byte[]{1, 1, 1});
            }
            this.f14269I.m131787l("AgoraPusher", "mAppid:" + this.f192055Y0);
            this.f192013M1 = new C21074e();
            try {
                String str = this.f192055Y0;
                if (str != null && !TextUtils.isEmpty(str)) {
                    this.f192095k3 = 0;
                    int i = this.f192105o1.f182040c1;
                    if (i >= 0) {
                        this.f192095k3 = i;
                    } else {
                        this.f192095k3 = fjx.m121638R().m121664I0();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f192038U = t0f.m186855b().m186857c(m19726W1(), this.f192055Y0, this.f192013M1, this.f192095k3 == 0);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    eyx.m118802c().m118808g("agoraCreate", "mRtcKeepAlive:" + this.f192095k3 + ",agoraHash:" + this.f192038U.hashCode() + ",cost:" + jCurrentTimeMillis2);
                    RtcEngine rtcEngine = this.f192038U;
                    if (rtcEngine == null) {
                        boolean zInitializeNativeLibs = RtcEngineImpl.initializeNativeLibs();
                        eyx.m118802c().m118803a("agoraCreate", "isLoad " + zInitializeNativeLibs, LogLevel.FATAL);
                        return null;
                    }
                    rtcEngine.setParameters("{\"rtc.stat_interval_ms\":1000}");
                    this.f192038U.setParameters("{\"rtc.video.max_metadata_size\":2048}");
                    this.f192074e1 = false;
                    this.f192038U.registerAudioFrameObserver(null);
                    int i2 = this.f192105o1.f177119R;
                    this.f192038U.setRecordingAudioFrameParameters(this.f192089j1, i2, 2, 1024);
                    if (this.f192105o1.f155333o1) {
                        this.f192038U.setPlaybackAudioFrameParameters(this.f192089j1, i2, 0, 1024);
                    }
                    this.f192038U.setChannelProfile(1);
                    this.f192038U.enableDualStreamMode(this.f191994G0);
                    m208008e6(this.f191997H0);
                }
                this.f14269I.m131787l("agora createEngine failed:", this.f192055Y0);
                hu00.InterfaceC17392a interfaceC17392a = this.f192080g1;
                if (interfaceC17392a != null) {
                    interfaceC17392a.mo128349g(4352, 806, 0, this);
                }
                return null;
            } catch (Exception unused) {
                this.f14269I.m131787l("agora createEngine failed:", this.f192055Y0);
                hu00.InterfaceC17392a interfaceC17392a2 = this.f192080g1;
                if (interfaceC17392a2 != null) {
                    interfaceC17392a2.mo128349g(4352, 806, 0, this);
                }
                return null;
            }
        }
        this.f192034T = this.f192038U.isTextureEncodeSupported();
        vlw vlwVar2 = this.f14281s;
        if (vlwVar2 != null && vlwVar2.f177131b0) {
            this.f192034T = false;
        }
        this.f14269I.m131787l("isDynamicKey", Boolean.valueOf(!TextUtils.isEmpty(this.f192055Y0)), "channelkey", Boolean.valueOf(TextUtils.isEmpty(this.f192115r1)));
        return this.f192038U;
    }

    /* JADX INFO: renamed from: k6 */
    private int m207870k6(int i) {
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
            return this.f192105o1.f177120S;
        }
        return 128000;
    }

    /* JADX INFO: renamed from: n6 */
    private String m207880n6() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<Long, ley>> it = this.f192027R0.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ley value = it.next().getValue();
            if (i != 0) {
                sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            }
            value.f127796d = value.f127798f + value.f127797e;
            sb.append(value.m149620b());
            i++;
        }
        if (i == 0) {
            sb.append("(0)");
        }
        sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n8 */
    private void m207881n8() {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.setExternalVideoSource(true, this.f192034T, Constants.ExternalVideoSourceType.VIDEO_FRAME);
            this.f14269I.m131787l("writerTexturePrepare");
        }
    }

    /* JADX INFO: renamed from: p6 */
    private String m207888p6(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(BaseSei.CONF)) {
                jSONObject.remove(BaseSei.CONF);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            eyx.m118802c().m118808g("getFixSei error" + e.toString());
            return str;
        }
    }

    private void release() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter release");
        boolean z = true;
        this.f192120s3 = true;
        this.f192050X = false;
        synchronized (this.f192121t1) {
            try {
                this.f14268H.f203835a0 = null;
                if (this.f192038U != null) {
                    if (this.f192129v3) {
                        dix.C16387d c16387dM111948h = dix.m111940d().m111948h(this.f14278R.m116726b());
                        hmx hmxVar = this.f14269I;
                        StringBuilder sb = new StringBuilder("server mix destory uid:");
                        sb.append(this.f192105o1.f182013B0);
                        sb.append(",momoid:");
                        sb.append(c16387dM111948h.f86450c);
                        sb.append("roomid:");
                        sb.append(this.f14278R);
                        hmxVar.m131787l(this.f14278R.m116732h());
                        HttpWrapper httpWrapper = HttpWrapper.getInstance();
                        String str = c16387dM111948h.f86448a;
                        String str2 = c16387dM111948h.f86449b;
                        int i = this.f192105o1.f182013B0;
                        String strM116735k = this.f14278R.m116735k();
                        String strM116732h = this.f14278R.m116732h();
                        String str3 = this.f192105o1.f155325g1;
                        zmx zmxVar = this.f14268H;
                        httpWrapper.destoryChannel(str, str2, i, strM116735k, strM116732h, str3, zmxVar.f203783A0, "agora", (int) zmxVar.f203888s);
                    }
                    m207977S5();
                    m207993Y7(0);
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "release >>>>>");
                    this.f192038U.registerAudioFrameObserver(null);
                    this.f192074e1 = false;
                    if (this.f14281s.f182043v0 != null) {
                        this.f14269I.m131787l("stopRtmpStream line 2702 mrCoreParameters.mRtmpPath:" + this.f14268H.f203898x);
                        this.f192038U.stopRtmpStream(this.f14268H.f203898x);
                    }
                    this.f192038U.leaveChannel();
                    this.f192038U.registerMediaMetadataObserver(null, 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    t0f t0fVarM186855b = t0f.m186855b();
                    IRtcEngineEventHandler iRtcEngineEventHandler = this.f192013M1;
                    if (this.f192095k3 != 0) {
                        z = false;
                    }
                    t0fVarM186855b.m186856a(iRtcEngineEventHandler, z);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    eyx.m118802c().m118808g("agoraDestroy", "mRtcKeepAlive:" + this.f192095k3 + ",cost:" + jCurrentTimeMillis2);
                    Log.e("lqdebug", "mRtcEngine.destroy() end");
                    this.f192050X = false;
                    m19744l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                    this.f14270J = MomoCodec.MomoCodecState.STOP;
                    this.f192080g1.mo128349g(4097, 0, 0, this);
                    this.f192042V = -1;
                    this.f191996G2 = null;
                }
                this.f192050X = false;
                m19744l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                this.f14270J = MomoCodec.MomoCodecState.STOP;
                mo19735d2();
                this.f192080g1.mo128349g(4097, 0, 0, this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t6 */
    private IRtcEngineEventHandler.LocalVideoStats m207904t6() {
        return this.f192024Q0;
    }

    /* JADX INFO: renamed from: u6 */
    private IRtcEngineEventHandler.RemoteVideoStats m207909u6() {
        return this.f192021P0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v6 */
    public String m207914v6(String str) {
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
            if (jSONObject.has(BaseSei.CONF) && this.f192127v1) {
                jSONObject.remove(BaseSei.CONF);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ anw m207929z4(xc0 xc0Var) {
        xc0Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z6 */
    public void m207930z6(int i) {
        int i2;
        int i3;
        int i4;
        if (this.f192014M2) {
            float f = this.f192017N2;
            if (f >= 0.0f) {
                float f2 = this.f192020O2;
                if (f2 >= 0.0f) {
                    float f3 = this.f192023P2;
                    if (f3 > 0.0f) {
                        float f4 = this.f192026Q2;
                        if (f4 > 0.0f) {
                            CongressUtil.setCutPostion(f, f2, f3, f4);
                        }
                    }
                }
            }
            int i5 = this.f192029R2;
            if (i5 >= 0 && (i2 = this.f192033S2) >= 0 && (i3 = this.f192037T2) > 0 && (i4 = this.f192041U2) > 0) {
                CongressUtil.setCutPostion(i5, i2, i3, i4);
            }
            if (!this.f192139z1.containsKey(Integer.valueOf(i))) {
                this.f192139z1.put(Integer.valueOf(i), Integer.valueOf(i));
            }
            SurfaceView surfaceView = new SurfaceView(m19726W1());
            surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC21079j(i));
            this.f192059Z0.mo19137a(i, surfaceView, this.width, this.height);
            return;
        }
        if (!this.f192072d2 && this.f192065b1 == null && !this.f192105o1.f182037Z0) {
            SurfaceView surfaceView2 = new SurfaceView(m19726W1());
            if (this.f192038U != null) {
                this.f192064a3.add(Integer.valueOf(i));
                this.f192038U.setupRemoteVideo(new VideoCanvas(surfaceView2, 1, i));
            }
            if (this.f192059Z0 != null && !this.f192130w1 && !this.f192127v1) {
                this.f14269I.m131787l("onVideoChannelAdded", Boolean.valueOf(this.f192105o1.f182037Z0), "mVideoTextureListener:" + this.f192065b1);
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAdded: userID=" + i);
                this.f192059Z0.mo19137a((long) i, surfaceView2, this.width, this.height);
            }
            if (this.f192105o1.f182035X0) {
                this.f14269I.m131787l("isLocalMix:" + this.f192105o1.f182035X0, true, "mergeCanvansWidth:" + this.f192105o1.f177148k + ", mergeHeight:" + this.f192105o1.f177150l + ", mix bitrate:" + this.f192001I1);
                return;
            }
            return;
        }
        if (this.f192105o1.f182037Z0) {
            this.f14269I.m131787l("useTextureView", "width:" + this.width + ",height:" + this.height);
            TextureView textureView = new TextureView(m19726W1());
            RtcEngine rtcEngine = this.f192038U;
            if (rtcEngine != null) {
                rtcEngine.setupRemoteVideo(new VideoCanvas(textureView, 1, i));
            }
            if (this.f192068c1 != null) {
                this.f192061Z2.put(Integer.valueOf(i), textureView);
                this.f14269I.m131787l("onVideoChannelAdded use textureView");
                this.f192068c1.mo19141a(i, textureView, this.width, this.height);
                return;
            }
            return;
        }
        if (this.f192139z1.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.f192139z1.put(Integer.valueOf(i), Integer.valueOf(i));
        if (this.f192065b1 != null) {
            m208021i8(i, this.width, this.height);
        }
        long j = i;
        ski0 ski0Var = new ski0(j, this.width, this.height, this.f191989E1);
        if (this.f192062a1 == null || this.f192130w1 || this.f192127v1) {
            return;
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + i);
        this.f192062a1.mo94620a(j, ski0Var, this.width, this.height);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo19646A() {
        this.f14269I.m131787l("stopRecordWithNotLeaveRoom");
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter stopRecord");
        this.f192050X = false;
        wb1 wb1Var = this.f192006K0;
        if (wb1Var != null) {
            wb1Var.m202490f();
            this.f192006K0 = null;
        }
        this.f192051X0 = 0;
        super.mo19646A();
        C21081l c21081l = this.f192069c2;
        if (c21081l != null) {
            c21081l.m208055a();
            this.f192069c2 = null;
        }
        stopSurroundMusic();
        m208037q2();
        u3m u3mVar = this.f14271K;
        if (u3mVar != null) {
            qmr qmrVar = this.f192105o1;
            ((ExtAudioWrapper) u3mVar).m20087I2(2048, qmrVar.f177117P, qmrVar.f177119R, "Momo");
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
        PipelineConcurrentHashMap<Long, a9y> pipelineConcurrentHashMap = this.f192031S0;
        if (pipelineConcurrentHashMap != null && !pipelineConcurrentHashMap.isEmpty()) {
            n8c.m158483a("zhengjijian", "stopRecord memberInfoMap " + this.f192031S0.size());
            this.f192031S0.clear();
        }
        PipelineConcurrentHashMap<Long, ley> pipelineConcurrentHashMap2 = this.f192027R0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            this.f192027R0.clear();
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "stopRecordOK!!!!!!!!!!!!!!!!!!!!");
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: A0 */
    public int mo19914A0() {
        qmr qmrVar = this.f192105o1;
        return qmrVar.f177148k > 0 ? qmrVar.f177150l : qmrVar.f177166t;
    }

    /* JADX INFO: renamed from: A5 */
    public void m207931A5(MRtcExitRoomHandler mRtcExitRoomHandler) {
        this.f191999H2 = mRtcExitRoomHandler;
    }

    /* JADX INFO: renamed from: A7 */
    public void m207932A7(String str, boolean z) {
        int i;
        JSONArray jSONArray;
        int i2;
        int i3;
        String str2 = "pkmu";
        String str3 = "renderMode";
        String str4 = "alpha";
        if (this.f192105o1 == null || str == null) {
            return;
        }
        if (this.f192084h2 == null) {
            this.f192084h2 = new LiveTranscoding();
        }
        LiveTranscoding liveTranscoding = this.f192084h2;
        liveTranscoding.backgroundColor = 0;
        qmr qmrVar = this.f192105o1;
        int i4 = qmrVar.f177148k;
        liveTranscoding.width = i4;
        int i5 = qmrVar.f177150l;
        liveTranscoding.height = i5;
        liveTranscoding.videoGop = 15;
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        this.f14269I.m131787l("setJsonForWindowPostion publishConfig", "w:" + this.f192084h2.width, "h:" + this.f192084h2.height);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.has(BaseSei.MID) ? jSONObject.getString(BaseSei.MID) : "";
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f192084h2.setUsers((ArrayList<LiveTranscoding.TranscodingUser>) null);
            int i6 = 1;
            if (jSONObject.has(BaseSei.CONF)) {
                i = 0;
                jSONArray = jSONObject.getJSONArray(BaseSei.CONF);
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
                    LiveTranscoding liveTranscoding2 = this.f192084h2;
                    int i7 = liveTranscoding2.width;
                    transcodingUser.f63365x = (int) (i7 * 0.0228f);
                    int i8 = liveTranscoding2.height;
                    i = 0;
                    transcodingUser.f63366y = 0;
                    transcodingUser.width = (int) (i7 * 0.2614f);
                    transcodingUser.height = (int) (i8 * 0.25004f);
                    liveTranscoding2.addUser(transcodingUser);
                    this.f192084h2.userConfigExtraInfo = m207914v6(this.f191980B1);
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
                double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                double d2 = (jSONObject2 == null || !jSONObject2.has(BaseSei.f13930X)) ? 0.0d : jSONObject2.getDouble(BaseSei.f13930X);
                if (jSONObject2 != null && jSONObject2.has(BaseSei.f13931Y)) {
                    d = jSONObject2.getDouble(BaseSei.f13931Y);
                }
                double d3 = 1.0d;
                double d4 = (jSONObject2 == null || !jSONObject2.has("w")) ? 1.0d : jSONObject2.getDouble("w");
                double d5 = (jSONObject2 == null || !jSONObject2.has("h")) ? 1.0d : jSONObject2.getDouble("h");
                int i10 = (jSONObject2 == null || !jSONObject2.has(BaseSei.f13932Z)) ? i3 : jSONObject2.getInt(BaseSei.f13932Z) + 1;
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
                LiveTranscoding liveTranscoding3 = this.f192084h2;
                int i12 = liveTranscoding3.width;
                String str5 = str2;
                String str6 = str3;
                transcodingUser2.f63365x = (int) (((double) i12) * d2);
                int i13 = liveTranscoding3.height;
                String str7 = str4;
                transcodingUser2.f63366y = (int) (((double) i13) * d);
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
            this.f192084h2.userConfigExtraInfo = m207914v6(this.f191980B1);
            if (!this.f192129v3) {
                m207817U5(this.f192105o1.f182043v0);
                return;
            }
            if (this.f14268H.f203837b && this.f14278R != null && z) {
                String string3 = "" + this.f191980B1;
                try {
                    JSONObject jSONObject3 = new JSONObject(string3);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("asr", 44100);
                    int i14 = this.f192084h2.audioBitrate;
                    if (i14 < 1000) {
                        i14 *= 1000;
                    }
                    jSONObject4.put("abr", i14);
                    jSONObject4.put("achl", this.f192084h2.audioChannels);
                    jSONObject4.put("acpf", LiveTranscoding.AudioCodecProfileType.getValue(this.f192084h2.audioCodecProfile));
                    jSONObject4.put("w", this.f14281s.f177148k);
                    jSONObject4.put("h", this.f14281s.f177150l);
                    jSONObject4.put("gop", this.f14281s.f177108G);
                    jSONObject4.put("fps", this.f14281s.f177107F);
                    jSONObject4.put("vbr", this.f14281s.f177109H);
                    if (!this.f14281s.f182019H0) {
                        i2 = i3;
                    }
                    jSONObject4.put("vcpf", i2);
                    jSONObject3.put("mixInfo", jSONObject4);
                    string3 = jSONObject3.toString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String str8 = string3;
                dix.C16387d c16387dM111948h = dix.m111940d().m111948h(this.f14278R.m116726b());
                this.f192114q3++;
                hmx hmxVar = this.f14269I;
                StringBuilder sb = new StringBuilder("server mix update uid:");
                sb.append(this.f192105o1.f182013B0);
                sb.append(",momoid:");
                sb.append(c16387dM111948h.f86450c);
                sb.append("roomid:");
                sb.append(this.f14278R);
                hmxVar.m131787l(this.f14278R.m116732h());
                HttpWrapper httpWrapper = HttpWrapper.getInstance();
                String str9 = c16387dM111948h.f86448a;
                String str10 = c16387dM111948h.f86449b;
                qmr qmrVar2 = this.f192105o1;
                int i15 = qmrVar2.f182013B0;
                String str11 = c16387dM111948h.f86450c;
                eix eixVar = this.f14278R;
                String strM116732h = eixVar != null ? eixVar.m116732h() : qmrVar2.f155325g1;
                String str12 = this.f192105o1.f155325g1;
                zmx zmxVar = this.f14268H;
                httpWrapper.updateChannel(str9, str10, i15, str11, strM116732h, str12, zmxVar.f203783A0, str8, "agora", this.f14281s.f182043v0, (int) zmxVar.f203888s);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: B7 */
    public void m207934B7(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f14269I.m131787l("agora setMasterAudioLevel", Float.valueOf(f));
        float f2 = 1.3f * f;
        this.f192083h1 = f2;
        this.f14268H.f203797H0 = f2;
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.adjustRecordingSignalVolume((int) (f * 100.0f));
        }
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
        this.f14269I.m131787l("agora setMergeSei", str);
        synchronized (this.f192121t1) {
            this.f191983C1 = str;
            if (!this.f192105o1.f182035X0) {
                m207932A7(str, true);
            }
        }
    }

    /* JADX INFO: renamed from: C5 */
    public void m207935C5(MRtcAudioHandler mRtcAudioHandler) {
        this.f192022P1 = mRtcAudioHandler;
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

    /* JADX INFO: renamed from: D5 */
    public void m207937D5(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f192025Q1 = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: D6 */
    public void m207938D6() {
        String str = "{ \"canvas\":{ \"w\":" + this.f192084h2.width + ",\"h\":" + this.f192084h2.height + ",\"conf\":{";
        for (LiveTranscoding.TranscodingUser transcodingUser : this.f192084h2.getUsers()) {
            str = str + "{\"id\":" + transcodingUser.uid + ",\"x\":" + transcodingUser.f63365x + ",\"y\":" + transcodingUser.f63366y + ",\"width\":" + transcodingUser.width + ",\"height\":" + transcodingUser.height + "},";
        }
        this.f14269I.m131787l("updateTranscoding", (str + "extraInfo:" + this.f192084h2.userConfigExtraInfo).concat("}"));
    }

    /* JADX INFO: renamed from: D7 */
    public void m207939D7(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.f191992F1 = pcmdataavailablecallback;
        if (pcmdataavailablecallback != null) {
            m207986W6(true);
        } else {
            m207986W6(false);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: E0 */
    public void mo19922E0(dxl dxlVar) {
        this.f14266F = dxlVar;
    }

    /* JADX INFO: renamed from: E6 */
    public void m207941E6(boolean z) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(z);
        }
    }

    /* JADX INFO: renamed from: E7 */
    public int m207942E7(int i) {
        this.f14269I.m131787l("setRemoteDefaultVideoStreamType", Integer.valueOf(i));
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine == null) {
            return -1;
        }
        this.f14268H.f203874n0 = i;
        return rtcEngine.setRemoteDefaultVideoStreamType(i);
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: F */
    public boolean mo19925F() {
        return this.f192077f1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: F0 */
    public int mo19926F0() {
        return this.f192099m1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: F1 */
    public long mo19927F1() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f192018O0;
        if (rtcStats != null) {
            return rtcStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F5 */
    public void m207943F5(MRtcChannelHandler mRtcChannelHandler) {
        this.f192032S1 = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: F6 */
    public void m207944F6(boolean z) {
        this.f14269I.m131787l("muteAllRemoteVideoStream", "mute:" + z);
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteVideoStreams(z);
        }
    }

    /* JADX INFO: renamed from: F7 */
    public void m207945F7(int i) {
        this.f14269I.m131787l("setRole", Integer.valueOf(i));
        this.f192118s1 = i;
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.setClientRole(i);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: G0 */
    public long mo19930G0() {
        return 0L;
    }

    /* JADX INFO: renamed from: G5 */
    public void m207946G5(MRtcConnectHandler mRtcConnectHandler) {
        this.f192048W1 = mRtcConnectHandler;
    }

    /* JADX INFO: renamed from: G6 */
    public void m207947G6(boolean z) {
        this.f14269I.m131787l("agoraFilter muteLocalAudioStream", Boolean.valueOf(z));
        this.f192104n3 = z;
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
    }

    /* JADX INFO: renamed from: G7 */
    public void m207948G7(boolean z) {
        this.f192049W2 = z;
        this.f14269I.m131787l("setRoom24hMode:", Boolean.valueOf(z));
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo19650H0(boolean z) {
        this.f192127v1 = z;
    }

    /* JADX INFO: renamed from: H5 */
    public void m207949H5(ymw ymwVar) {
        this.f192040U1 = ymwVar;
    }

    /* JADX INFO: renamed from: H6 */
    public void m207950H6(boolean z) {
        this.f192104n3 = z;
        this.f14269I.m131787l("muteLocalAudioStreamForEx", Boolean.valueOf(z));
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
    }

    /* JADX INFO: renamed from: H7 */
    public void m207951H7(int i, boolean z) {
        this.f191995G1 = i;
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: I1 */
    public void mo19935I1() {
        this.f192077f1 = true;
    }

    /* JADX INFO: renamed from: I5 */
    public void m207952I5(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        this.f192052X1 = mRtcClientRoleChangedHandler;
    }

    /* JADX INFO: renamed from: I6 */
    public void m207953I6(boolean z) {
        this.f192101m3 = z;
        this.f14269I.m131787l("muteLocalVideoStream", Boolean.valueOf(z));
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.muteLocalVideoStream(z);
        }
    }

    /* JADX INFO: renamed from: I7 */
    public void m207954I7(int i) {
        this.f192109p1 = i;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: J */
    public void mo19651J(String str) {
        n8c.m158485c("zk", "setSei" + this.f191983C1);
        eyx.m118802c().m118808g("Agora setSei:" + str);
        synchronized (this.f192121t1) {
            try {
                this.f191980B1 = str;
                if (!this.f192105o1.f182035X0) {
                    if (TextUtils.isEmpty(this.f191983C1)) {
                        m208054z7(str);
                    } else {
                        m207932A7(this.f191983C1, false);
                    }
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
    public void m207955J5(MRtcPusherHandler mRtcPusherHandler) {
        this.f191982B3 = mRtcPusherHandler;
    }

    /* JADX INFO: renamed from: J6 */
    public void m207956J6(long j, boolean z) {
        RtcEngine rtcEngine;
        this.f14269I.m131787l("muteRemoteAudioStream", "uid:" + j + ",mute:" + z);
        if (j == this.f192105o1.f182013B0 || (rtcEngine = this.f192038U) == null) {
            return;
        }
        rtcEngine.muteRemoteAudioStream((int) j, z);
    }

    /* JADX INFO: renamed from: K5 */
    public void m207957K5(MRtcQualityHandler mRtcQualityHandler) {
        this.f192044V1 = mRtcQualityHandler;
    }

    /* JADX INFO: renamed from: K6 */
    public void m207958K6(long j, boolean z) {
        RtcEngine rtcEngine;
        this.f14269I.m131787l("muteRemoteVideoStream", "uid:" + j + ",mute:" + z);
        if (j == this.f192105o1.f182013B0 || (rtcEngine = this.f192038U) == null) {
            return;
        }
        rtcEngine.muteRemoteVideoStream((int) j, z);
    }

    /* JADX INFO: renamed from: K7 */
    public void m207959K7(hgd0 hgd0Var) {
        this.f192002I2 = hgd0Var;
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: L */
    public void mo19942L(sml.InterfaceC19992a interfaceC19992a) {
        this.f14269I.m131787l("setOnFrameAvailabelCallback :" + interfaceC19992a);
        this.f192071d1 = interfaceC19992a;
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
    public void m207960L5(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f191996G2 = mRtcReceiveSeiHandler;
    }

    /* JADX INFO: renamed from: L6 */
    public void m207961L6(boolean z) {
        n8c.m158485c("zk", "--ktv,muteSingerAudioStream:" + this.f192081g2 + "-->" + z);
        this.f14269I.m131787l("muteSingerAudioStream", Boolean.valueOf(z));
        this.f192081g2 = z;
    }

    /* JADX INFO: renamed from: L7 */
    public void m207962L7(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f192086i1 = 0.8f * f;
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.adjustAudioMixingVolume((int) (f * 100.0f));
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: M0 */
    public int mo19948M0() {
        return (int) this.f14268H.f203858i;
    }

    @Override // p149l.nbj, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: M1 */
    public void mo19653M1() {
        yw00 yw00Var;
        if (this.f192046W == null && (yw00Var = this.f192003J0) != null) {
            this.f192046W = yw00Var.m216278l();
        }
        if (!this.f192034T || this.texture_in == 0 || !this.f192050X || this.f192101m3) {
            return;
        }
        if (this.f192094k2 > 2) {
            qmr qmrVar = this.f192105o1;
            int i = qmrVar.f177152m;
            int i2 = qmrVar.f177154n;
            if (qmrVar.f182017F0 && qmrVar.m198870d() == 1) {
                qmr qmrVar2 = this.f192105o1;
                i = qmrVar2.f177154n;
                i2 = qmrVar2.f177152m;
            }
            VideoFrame videoFrame = new VideoFrame(new TextureBuffer(this.f192046W, i, i2, VideoFrame.TextureBuffer.Type.RGB, this.texture_in, m208038q6(), RendererCommon.m19767a(f191976D3), (Handler) null, (YuvConverter) null, (Runnable) null), 0, System.nanoTime());
            synchronized (this.f192121t1) {
                try {
                    if (this.f192038U != null && !this.f192120s3) {
                        this.f192038U.pushExternalVideoFrame(videoFrame);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            xxx.m211572F().m211584M();
        }
        long j = this.f192094k2 + 1;
        this.f192094k2 = j;
        if (j >= 30 || this.f192127v1) {
            m207788M6();
            if (this.f192126u3 <= 0) {
                this.f192126u3 = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: M7 */
    public void m207964M7(boolean z) {
        if (z) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "set Stream ReplaceMode");
        }
        this.f14269I.m131787l("setStreamReplaceMode:" + z);
        this.f192075e2 = z;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: N0 */
    public long mo19952N0() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f192018O0;
        if (rtcStats != null) {
            return rtcStats.txBytes;
        }
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: N1 */
    public int mo19953N1() {
        return this.f192012M0;
    }

    /* JADX INFO: renamed from: N5 */
    public void m207965N5(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f192036T1 = mRtcTokenWillExpireHander;
    }

    /* JADX INFO: renamed from: N7 */
    public void m207966N7(int i) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.setAudioMixingPosition(i);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: O0 */
    public long mo19956O0() {
        return this.f192015N0;
    }

    /* JADX INFO: renamed from: O5 */
    public void m207967O5(int i) {
        float f = i / 100.0f;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f192086i1 = f * 0.8f;
        this.f14269I.m131787l("adjustAudioMixingVolume", Integer.valueOf(i), Float.valueOf(this.f192086i1));
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.adjustAudioMixingVolume(i);
        }
    }

    /* JADX INFO: renamed from: O6 */
    public void m207968O6(int i, int i2) {
        long j;
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onFirstRemoteVideoDecoded:uid" + i + "width" + this.width + "height" + this.height + "elapsed" + i2);
        if (m19726W1() == null) {
            return;
        }
        long j2 = i;
        a9y a9yVar = this.f192031S0.get(Long.valueOf(j2));
        if (a9yVar == null || a9yVar.m95471d()) {
            j = j2;
        } else {
            n8c.m158483a("zhengjijian", "agora get first idr");
            a9yVar.m95474g(true);
            j = j2;
            this.f14269I.m131780c(true, a9yVar.m95470c(), j, this.f192082g3, a9yVar.m95468a(), System.currentTimeMillis() - a9yVar.m95469b());
            this.f192080g1.mo128349g(8198, i, 0, this);
        }
        MRtcEventHandler mRtcEventHandler = this.f192028R1;
        if (mRtcEventHandler != null) {
            mRtcEventHandler.onFirstRemoteVideoDecoded(j, this.width, this.height, i2);
        }
        Handler handler = this.f192098l3;
        if (handler != null) {
            handler.postAtFrontOfQueue(new RunnableC21078i(i));
        }
    }

    @Override // p149l.gw00.InterfaceC17174f
    /* JADX INFO: renamed from: P0 */
    public void mo19959P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
        this.f192096l1 = i4;
        this.f192099m1 = i2;
        this.f192102n1 = i3;
    }

    /* JADX INFO: renamed from: P5 */
    public void m207969P5(int i) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.adjustPlaybackSignalVolume(i);
        }
    }

    /* JADX INFO: renamed from: P6 */
    public void m207970P6() {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).pauseAllEffects();
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: Q0 */
    public int mo19963Q0() {
        return this.f192050X ? m208040r6() : m208042s6();
    }

    /* JADX INFO: renamed from: Q5 */
    public void m207971Q5(long j, float f) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.adjustUserPlaybackSignalVolume((int) j, (int) f);
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public void m207972Q6(int i) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).pauseEffect(i);
        }
    }

    /* JADX INFO: renamed from: Q7 */
    public void m207973Q7(b2l0 b2l0Var) {
        this.f14269I.m131787l("setVideoChannelTextureViewListener", "listner:" + b2l0Var, "useTexture:" + this.f192105o1.f182037Z0);
        this.f192068c1 = b2l0Var;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo19655R0(vlw vlwVar, EGLContext eGLContext) {
        if (this.f192038U == null) {
            this.f14269I.m131787l("startRecord", "engine == null, may be appid is null");
            this.f192080g1.mo128349g(4352, 806, 0, this);
            return;
        }
        if (vlwVar == null || this.f192051X0 == 1) {
            return;
        }
        zmx zmxVar = this.f14268H;
        long j = this.f192118s1;
        zmxVar.f203842c1 = j;
        if (j == 1) {
            zmxVar.f203785B0 = "M".equals(mo20052w1()) ? "AgoraMaster" : "AgoraSlaver";
        } else {
            zmxVar.f203785B0 = "AgoraAudience";
        }
        super.mo19655R0(vlwVar, eGLContext);
        if (vlwVar.f177131b0 && !this.f192101m3 && !this.f192130w1 && this.f192069c2 == null) {
            C21081l c21081l = new C21081l("live-media-aFFrame");
            this.f192069c2 = c21081l;
            c21081l.start();
        }
        if (!(vlwVar instanceof qmr)) {
            throw new InvalidParameterException("Parameters error");
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter startRecord");
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
        ii70VarM136344d.m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", sb.toString());
        this.f192105o1 = qmrVar;
        if (!TextUtils.isEmpty(vlwVar.f182043v0)) {
            this.f192129v3 = vlwVar.f182043v0.contains("mixprovider=1");
        }
        this.f14269I.m131787l("serverMix:" + this.f192129v3);
        if (vlwVar.f182012A0 == MomoPipeline.DecodeType.SOFT_DECODE || qmrVar.f177131b0) {
            this.f192034T = false;
        }
        this.f192006K0 = new wb1();
        yw00 yw00Var = this.f192003J0;
        if (yw00Var != null) {
            this.f192046W = yw00Var.m216278l();
        }
        if (fjx.m121638R().m121775p()) {
            int iM121778q = (int) (fjx.m121638R().m121778q() * (vlwVar.f177109H / 1000));
            VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration();
            videoEncoderConfiguration.minBitrate = iM121778q;
            RtcEngine rtcEngine = this.f192038U;
            if (rtcEngine != null) {
                rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
            }
            n8c.m158488f("agora_minkbs", "minBitrate parms = " + iM121778q);
        }
        this.f192138y3 = 2;
        this.f192120s3 = false;
        this.f192133x1 = false;
        this.f192123t3 = false;
        synchronized (this.f192121t1) {
            try {
                this.f14268H.f203846e = System.currentTimeMillis();
                m207821V5(this.f192105o1.f182013B0);
                m207813T5(this.f192118s1, 33);
                qmr qmrVar2 = this.f192105o1;
                m207752B6(qmrVar2.f155325g1, qmrVar2.f182013B0);
                if (this.f191980B1 != null) {
                    qmr qmrVar3 = this.f192105o1;
                    if (qmrVar3.f155326h1 && this.f191983C1 == null && !qmrVar3.f182035X0) {
                        m208054z7(this.f191980B1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f192072d2) {
            m207993Y7(0);
            m207993Y7(1);
        }
        this.f192051X0 = 1;
        st0.m185792g().m185807p(m19726W1(), st0.f166270f);
        this.f14268H.f203845d1 = vlwVar.m198870d();
        zmx zmxVar2 = this.f14268H;
        zmxVar2.f203839b1 = vlwVar.f177131b0 ? 1L : 0L;
        zmxVar2.f203898x = vlwVar.f182043v0;
        int i = vlwVar.f177109H;
        this.f192107o3 = i;
        this.f192111p3 = vlwVar.f182016E0;
        qmr qmrVar4 = this.f192105o1;
        zmxVar2.f203826W = qmrVar4.f182013B0;
        zmxVar2.f203828X = qmrVar4.f155325g1;
        zmxVar2.f203793F0 = i;
        if (this.f192038U != null) {
            zmxVar2.f203879p = RtcEngine.getSdkVersion();
        }
        this.f14268H.f203849f = System.currentTimeMillis();
        this.f14268H.f203793F0 = vlwVar.f177109H;
        this.f14269I.m131787l("startRecord");
        this.f191993F2 = vlwVar.f182034W0;
        fjx.m121638R().m121647C1(1);
        this.f14269I.m131787l("mrCoreParameters ignoreSabin", Boolean.valueOf(fjx.m121638R().m121682O0()), "isLocalMix", Boolean.valueOf(vlwVar.f182035X0));
        this.f14269I.m131787l("agoraGlFlush", Boolean.valueOf(fjx.m121638R().m121716a()));
    }

    /* JADX INFO: renamed from: R5 */
    public int m207974R5(int i) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "call changeRole:" + i);
        this.f14269I.m131787l("changeRole", Integer.valueOf(i));
        int clientRole = 0;
        boolean z = i != this.f192118s1;
        this.f192118s1 = i;
        long j = i;
        this.f14268H.f203842c1 = j;
        if (z) {
            if (j == 2) {
                mo19740i2();
                this.f14268H.f203785B0 = "AgoraAudience";
            } else {
                mo19738g2();
                this.f14268H.f203785B0 = "M".equals(mo20052w1()) ? "AgoraMaster" : "AgoraSlaver";
            }
            this.f14268H.f203849f = System.currentTimeMillis();
        }
        synchronized (this.f192121t1) {
            if (1 == i) {
                try {
                    m207800P7();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f192038U != null) {
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "changeRole:" + i);
                clientRole = this.f192038U.setClientRole(i);
            }
        }
        return clientRole;
    }

    /* JADX INFO: renamed from: R6 */
    public void m207975R6() {
        this.f14269I.m131787l("pauseRecording");
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "pauseRecording");
        if (this.f192038U != null) {
            this.f14269I.m131787l("pauseRecording muteLocalAudioStream", "true");
            this.f192038U.muteLocalAudioStream(true);
        }
    }

    /* JADX INFO: renamed from: R7 */
    public void m207976R7(z1l0 z1l0Var) {
        this.f192059Z0 = z1l0Var;
    }

    /* JADX INFO: renamed from: S5 */
    public void m207977S5() {
        try {
            CongressUtil congressUtil = this.f191989E1;
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
    public void m207978S6() {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.pauseAudioMixing();
        }
    }

    /* JADX INFO: renamed from: S7 */
    public void m207979S7(a2l0 a2l0Var) {
        this.f192062a1 = a2l0Var;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: T0 */
    public int mo19973T0() {
        return 0;
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m207980T6(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        this.f14269I.m131787l("playEffect", "playEffect filename:" + str);
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).playEffect(i, str, i2, d, d3, d2 * 100.0d, !z);
        }
        return true;
    }

    /* JADX INFO: renamed from: T7 */
    public void m207981T7(String str) {
        this.f14269I.m131787l("agora setVideoMixerBackgroundImgUrl", "url is" + str);
        this.f192117r3 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f192084h2 == null) {
            this.f192084h2 = new LiveTranscoding();
        }
        AgoraImage agoraImage = new AgoraImage();
        vlw vlwVar = this.f14281s;
        int i = vlwVar.f177148k;
        if (i > 0) {
            agoraImage.width = i;
            agoraImage.height = vlwVar.f177150l;
        } else {
            agoraImage.width = vlwVar.f177164s;
            agoraImage.height = vlwVar.f177166t;
        }
        agoraImage.url = str;
        agoraImage.f63367x = 0;
        agoraImage.f63368y = 0;
        ArrayList<AgoraImage> backgroundImageList = this.f192084h2.getBackgroundImageList();
        if (backgroundImageList != null) {
            backgroundImageList.clear();
        }
        this.f192084h2.addBackgroundImage(agoraImage);
        m207817U5(this.f192105o1.f182043v0);
    }

    /* JADX INFO: renamed from: U6 */
    public void m207982U6() {
        this.f14268H.f203885r = m207880n6();
        this.f14269I.m131796u();
    }

    /* JADX INFO: renamed from: U7 */
    public void m207983U7(int i, int i2, int i3, int i4) {
        this.f192001I1 = i / 1000;
        this.f192004J1 = i2;
        this.f14269I.m131787l("setVideoMixerBitrate:" + this.f192001I1 + ", fps:" + i2);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: V0 */
    public long mo19980V0() {
        return 0L;
    }

    /* JADX INFO: renamed from: V6 */
    public void m207984V6() {
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
        this.f14268H.f203864k = mo19953N1();
        this.f14268H.f203867l = mo19983W0();
        this.f14268H.f203885r = m207880n6();
        this.f14268H.f203818S = m19729Z1().f177170w;
        this.f14268H.f203820T = m19729Z1().f177171x;
        this.f14268H.f203822U = m207748A6();
        zmx zmxVar = this.f14268H;
        zmxVar.f203824V = this.f192104n3 ? 1L : 0L;
        zmxVar.f203816R = 1000L;
        vlw vlwVar = this.f14281s;
        zmxVar.f203793F0 = vlwVar.f177109H;
        zmxVar.f203852g = vlwVar.f182019H0 ? 2L : 0L;
        zmxVar.f203857h1 = vlwVar.f182035X0 ? 1 : 0;
        zmx zmxVar2 = this.f14268H;
        zmxVar2.f203866k1 = this.f14281s.f182019H0 ? 1 : 0;
        zmxVar2.f203836a1 = this.f192001I1;
        zmxVar2.f203869l1 = xxx.m211572F().m211598a().getWidth();
        this.f14268H.f203872m1 = xxx.m211572F().m211598a().getHeight();
        this.f14268H.f203875n1 = xxx.m211572F().m211638w();
        this.f14268H.f203878o1 = this.f14281s.f182030S0;
        this.f14269I.m131770H();
    }

    /* JADX INFO: renamed from: V7 */
    public void m207985V7(int i, int i2, int i3, int i4, int i5) {
        VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration();
        videoEncoderConfiguration.frameRate = i3;
        VideoEncoderConfiguration.VideoDimensions videoDimensions = new VideoEncoderConfiguration.VideoDimensions();
        videoDimensions.width = i;
        videoDimensions.height = i2;
        videoEncoderConfiguration.bitrate = i4;
        if (fjx.m121638R().m121775p()) {
            videoEncoderConfiguration.minBitrate = (int) (fjx.m121638R().m121778q() * i4);
        }
        videoEncoderConfiguration.dimensions = videoDimensions;
        if (i5 == 100) {
            videoEncoderConfiguration.degradationPrefer = VideoEncoderConfiguration.DEGRADATION_PREFERENCE.DISABLED;
            this.f192073d3 = i5;
        }
        this.f14269I.m131787l("setVideoProfile", "width:" + i + ",height:" + i2 + ",fps:" + i3 + ", bitrate:" + i4 + ",min:" + fjx.m121638R().m121775p() + ",degradationPrefer:" + i5);
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: W0 */
    public int mo19983W0() {
        return 0;
    }

    /* JADX INFO: renamed from: W6 */
    public void m207986W6(boolean z) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            if (!z) {
                if (this.f191979A3) {
                    return;
                }
                rtcEngine.registerAudioFrameObserver(null);
                this.f192074e1 = false;
                return;
            }
            if (!this.f192074e1) {
                rtcEngine.registerAudioFrameObserver(null);
                this.f14269I.m131787l("registerAudioFrameObserver 2417");
                this.f192038U.registerAudioFrameObserver(this);
            }
            this.f192074e1 = true;
            Log.e("lqdebug", "registerAudioFrameObserver this");
        }
    }

    /* JADX INFO: renamed from: W7 */
    public void m207987W7(cbl0 cbl0Var) {
        this.f192065b1 = cbl0Var;
        if (cbl0Var != null) {
            m207993Y7(1);
        }
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: X */
    public void mo19987X() {
        this.f192077f1 = false;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: X0 */
    public long mo19988X0() {
        return 0L;
    }

    /* JADX INFO: renamed from: X5 */
    public void m207988X5(boolean z) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            if (z) {
                rtcEngine.enableAudio();
            } else {
                rtcEngine.disableAudio();
            }
        }
    }

    /* JADX INFO: renamed from: X6 */
    public void m207989X6(int i, int i2) {
        if (this.f192038U != null) {
            this.f14269I.m131787l("enableDualStreamMode", Integer.valueOf(i), Integer.valueOf(i2));
            RtcEngine rtcEngine = this.f192038U;
            if (i2 == 0) {
                rtcEngine.setRemoteVideoStreamType(i, 0);
            } else {
                rtcEngine.setRemoteVideoStreamType(i, 1);
            }
        }
    }

    /* JADX INFO: renamed from: X7 */
    public void m207990X7(int i, double d) throws Throwable {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).setVolumeOfEffect(i, d * 100.0d);
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo19657Y(yw00 yw00Var, vlw vlwVar) {
        super.mo19657Y(yw00Var, vlwVar);
        this.f192003J0 = yw00Var;
        if (vlwVar == null) {
            return;
        }
        this.f192105o1 = (qmr) vlwVar;
        this.f14269I.m131787l("resetCodec:width" + vlwVar.f177152m + ",height:" + vlwVar.f177154n + ", videoBit:" + vlwVar.f177109H);
        m207800P7();
        yw00 yw00Var2 = this.f192003J0;
        if (yw00Var2 != null) {
            this.f192046W = yw00Var2.m216278l();
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "videoWidth:" + this.f14281s.f177164s + ",videoHeight:" + this.f14281s.f177166t + ",visualWidth:" + this.f14281s.f177168u + ",visualHeight:" + this.f14281s.f177169v + ",encodeWidth:" + this.f14281s.f177152m + ",encodeHeight:" + this.f14281s.f177154n + ",videoBitrate:" + this.f14281s.f177109H + ",audioBitrate:" + this.f14281s.f177120S + ",videoFPS:" + this.f14281s.f177107F + ",codecFPS:" + this.f14281s.f182016E0 + ",mergeCanvasWidth:" + ((qmr) this.f14281s).f177148k + ",mergeCanvasHeight:" + ((qmr) this.f14281s).f177150l + ",codecFPS:" + this.f14281s.f182016E0 + ",isHard:" + this.f14281s.f182012A0);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: Y0 */
    public int mo19992Y0() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f192018O0;
        if (rtcStats != null) {
            return rtcStats.txVideoKBitRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y5 */
    public void m207991Y5(boolean z) {
        this.f191987D2 = z;
    }

    /* JADX INFO: renamed from: Y6 */
    public void m207992Y6() {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).resumeAllEffects();
        }
    }

    /* JADX INFO: renamed from: Y7 */
    public void m207993Y7(int i) {
        this.f14269I.m131787l("setYuvCallback 0115fix", Integer.valueOf(i));
        try {
            CongressUtil congressUtil = this.f191989E1;
            if (congressUtil != null) {
                if (i == 1) {
                    congressUtil.setRtcEngineHandler(this.f192038U.getNativeHandle());
                } else {
                    congressUtil.setRtcEngineHandler(0L);
                }
                this.f191989E1.setYuvCallback(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: Z6 */
    public void m207995Z6(int i) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).resumeEffect(i);
        }
    }

    /* JADX INFO: renamed from: Z7 */
    public void m207996Z7(int i, View view) {
        if (fjx.m121638R().m121720b()) {
            Handler handler = this.f192098l3;
            if (handler != null) {
                handler.postAtFrontOfQueue(new RunnableC21070a(i, view));
                return;
            }
            return;
        }
        this.f14269I.m131787l("old setupRemoteVideo", i + ",view is " + view);
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.setupRemoteVideo(new VideoCanvas(view, 1, i));
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: a0 */
    public long mo19998a0() {
        return xxx.m211572F().m211620l();
    }

    /* JADX INFO: renamed from: a6 */
    public void m207997a6(boolean z, String str) {
        this.f192010L1 = z;
        this.f192007K1 = str;
        if (!z || this.f192038U == null || str == null || str.length() <= 0) {
            return;
        }
        n8c.m158487e("Pipeline_Normal_pip->PIPLINE->AGORA", "agora_sdk_ver: " + RtcEngine.getSdkVersion());
        this.f192038U.setParameters("{\"rtc.log_filter\":34781}");
        this.f192038U.setLogFile(this.f192007K1);
        this.f192038U.setLogFilter(15);
    }

    /* JADX INFO: renamed from: a7 */
    public void m207998a7() {
        this.f14269I.m131787l("resumeRecording");
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "resumeRecording");
        if (this.f192038U != null) {
            m207947G6(this.f192104n3);
            this.f192050X = true;
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: b1 */
    public long mo20001b1() {
        return 0L;
    }

    /* JADX INFO: renamed from: b6 */
    public void m207999b6(boolean z) {
        this.f14269I.m131787l("enableDualStreamMode", Boolean.valueOf(z));
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "call enableDualStreamMode:" + z);
        this.f191994G0 = z;
    }

    /* JADX INFO: renamed from: b7 */
    public void m208000b7() {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.resumeAudioMixing();
        }
    }

    /* JADX INFO: renamed from: b8 */
    public void m208001b8() {
        this.f191979A3 = true;
        if (this.f192074e1) {
            return;
        }
        this.f192038U.registerAudioFrameObserver(null);
        this.f14269I.m131787l("registerAudioFrameObserver 4416");
        this.f192038U.registerAudioFrameObserver(this);
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
        if (this.f14268H.f203842c1 == 1) {
            mo19739h2();
        } else {
            mo19737f2();
        }
    }

    /* JADX INFO: renamed from: c6 */
    public void m208002c6(boolean z) {
        RtcEngine rtcEngine = this.f192038U;
        int iEnableInEarMonitoring = rtcEngine != null ? rtcEngine.enableInEarMonitoring(z, 32768) : 0;
        this.f14269I.m131787l("agora enableInEarMonitoring enable " + z, "ret:", Integer.valueOf(iEnableInEarMonitoring));
    }

    /* JADX INFO: renamed from: c7 */
    public int m208003c7(int i) {
        this.f14269I.m131787l("selectAudioTrack:" + i);
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            return rtcEngine.selectAudioTrack(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c8 */
    public void m208004c8(String str) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "startSurroundMusic");
        if (this.f191977A1) {
            return;
        }
        this.f14269I.m131787l("startSurroundMusic", "" + str);
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.startAudioMixing(str, false, 1, 0);
            this.f191977A1 = true;
        }
        m207796O7(null, 1, 0);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, p149l.hmx.InterfaceC17343b
    /* JADX INFO: renamed from: d1 */
    public void mo19734d1() {
        if (this.f191985C3) {
            return;
        }
        boolean z = this.f192138y3 > 0;
        if (this.f14268H.f203842c1 == 1) {
            m207984V6();
        } else {
            m207982U6();
        }
        if (z) {
            zmx zmxVar = this.f14268H;
            if (zmxVar.f203854g1 < this.f192138y3 || this.f192079f3) {
                return;
            }
            zmxVar.f203901y0 = 14L;
            zmxVar.f203865k0 = 14;
            this.f14269I.m131787l("MediaError", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_MAKE_FRIEND);
            hu00.InterfaceC17392a interfaceC17392a = this.f192080g1;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(4353, 14, 0, this);
            }
            Handler handler = this.f192098l3;
            if (handler != null) {
                handler.post(new RunnableC21077h());
            }
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: d2 */
    public void mo19735d2() {
        if (this.f14268H.f203842c1 == 1) {
            mo19740i2();
        } else {
            mo19738g2();
        }
    }

    /* JADX INFO: renamed from: d6 */
    public void m208005d6(boolean z) {
        if (z) {
            this.f191998H1 = 1;
        } else {
            this.f191998H1 = 2;
        }
    }

    /* JADX INFO: renamed from: d7 */
    public void m208006d7(String str) {
        int i;
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null && this.f192042V == -1) {
            this.f192042V = rtcEngine.createDataStream(true, true);
        }
        RtcEngine rtcEngine2 = this.f192038U;
        if (rtcEngine2 == null || (i = this.f192042V) == -1) {
            return;
        }
        rtcEngine2.sendStreamMessage(i, str.getBytes());
    }

    /* JADX INFO: renamed from: d8 */
    public void m208007d8(String str, boolean z, boolean z2, int i) {
        if (this.f191977A1) {
            return;
        }
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.startAudioMixing(str, z, i);
            this.f191977A1 = true;
        }
        m207796O7(null, 1, 0);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e0 */
    public Surface mo19660e0() {
        return null;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e1 */
    public void mo19661e1(u3m u3mVar) {
        super.mo19661e1(u3mVar);
        if (!(u3mVar instanceof ExtAudioWrapper)) {
            this.f14269I.m131787l("wrap is not ExtAudioWrapper");
        }
        u3m u3mVar2 = this.f14271K;
        if (u3mVar2 != null) {
            ((ExtAudioWrapper) u3mVar2).m152749r2();
            ((ExtAudioWrapper) this.f14271K).m20088J2(new C21073d());
            ((ExtAudioWrapper) this.f14271K).mo20128s1(1);
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m208008e6(boolean z) {
        this.f191997H0 = z;
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            if (!z || this.f192105o1 == null) {
                rtcEngine.disableVideo();
                return;
            }
            rtcEngine.enableVideo();
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "setVideoProfileEx1 bitrate:" + this.f192105o1.f177109H);
            this.f192038U.setParameters("{\"che.video.keyFrameInterval\":1}");
            qmr qmrVar = this.f192105o1;
            int i = qmrVar.f182030S0;
            if (i == 0) {
                i = 15;
            }
            int i2 = i;
            if (qmrVar.f182017F0 && qmrVar.m198870d() == 1) {
                qmr qmrVar2 = this.f192105o1;
                m207985V7(qmrVar2.f177154n, qmrVar2.f177152m, i2, qmrVar2.f177109H / 1000, qmrVar2.f182038a1);
            } else {
                qmr qmrVar3 = this.f192105o1;
                m207985V7(qmrVar3.f177152m, qmrVar3.f177154n, i2, qmrVar3.f177109H / 1000, qmrVar3.f182038a1);
            }
        }
    }

    /* JADX INFO: renamed from: e7 */
    public void m208009e7(byte[] bArr) {
        int i;
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null && this.f192042V == -1) {
            this.f192042V = rtcEngine.createDataStream(true, true);
        }
        RtcEngine rtcEngine2 = this.f192038U;
        if (rtcEngine2 == null || (i = this.f192042V) == -1) {
            return;
        }
        rtcEngine2.sendStreamMessage(i, bArr);
    }

    /* JADX INFO: renamed from: e8 */
    public void m208010e8() {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).stopAllEffects();
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo19662f() {
        this.f14269I.m131787l("stopRecord");
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter stopRecord");
        this.f192050X = false;
        wb1 wb1Var = this.f192006K0;
        if (wb1Var != null) {
            wb1Var.m202490f();
            this.f192006K0 = null;
        }
        this.f192051X0 = 0;
        super.mo19662f();
        C21081l c21081l = this.f192069c2;
        if (c21081l != null) {
            c21081l.m208055a();
            this.f192069c2 = null;
        }
        stopSurroundMusic();
        release();
        PipelineConcurrentHashMap pipelineConcurrentHashMap = this.f192061Z2;
        if (pipelineConcurrentHashMap != null) {
            pipelineConcurrentHashMap.clear();
        }
        u3m u3mVar = this.f14271K;
        if (u3mVar != null) {
            qmr qmrVar = this.f192105o1;
            ((ExtAudioWrapper) u3mVar).m20087I2(2048, qmrVar.f177117P, qmrVar.f177119R, "Momo");
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
        fjx.m121638R().m121647C1(1);
        PipelineConcurrentHashMap<Long, a9y> pipelineConcurrentHashMap2 = this.f192031S0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            n8c.m158483a("zhengjijian", "stopRecord memberInfoMap " + this.f192031S0.size());
            this.f192031S0.clear();
        }
        PipelineConcurrentHashMap<Long, ley> pipelineConcurrentHashMap3 = this.f192027R0;
        if (pipelineConcurrentHashMap3 != null && !pipelineConcurrentHashMap3.isEmpty()) {
            this.f192027R0.clear();
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "stopRecordOK!!!!!!!!!!!!!!!!!!!!");
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: f2 */
    public void mo19737f2() {
        this.f14269I.m131787l("pullStart_v3", Boolean.valueOf(this.f192141z3));
        if (this.f192141z3) {
            return;
        }
        this.f192141z3 = true;
        this.f14268H.f203851f1 = (!TextUtils.isEmpty(this.f192055Y0) || TextUtils.isEmpty(this.f192115r1)) ? 0L : 1L;
        this.f14268H.f203834a = System.currentTimeMillis();
        long j = this.f192082g3;
        zmx zmxVar = this.f14268H;
        if (j == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zmx zmxVar2 = this.f14268H;
            zmxVar.f203846e = jCurrentTimeMillis - zmxVar2.f203846e;
            this.f192082g3 = zmxVar2.f203846e;
        } else {
            zmxVar.f203846e = j;
        }
        this.f14268H.f203849f = System.currentTimeMillis() - this.f14268H.f203849f;
        super.mo19737f2();
    }

    /* JADX INFO: renamed from: f6 */
    public void m208011f6(boolean z) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.enableWebSdkInteroperability(z);
        }
    }

    /* JADX INFO: renamed from: f7 */
    public void m208012f7(boolean z) {
        if (z) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "set double push");
        }
        this.f192072d2 = z;
        this.f192127v1 = z;
    }

    /* JADX INFO: renamed from: f8 */
    public void m208013f8(int i) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).stopEffect(i);
        }
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
        this.f192141z3 = false;
        this.f14269I.m131787l("pullStop_v3");
        zmx zmxVar = this.f14268H;
        zmxVar.f203862j0 = this.f192091j3;
        if (zmxVar.f203837b) {
            zmxVar.f203855h = System.currentTimeMillis() - this.f14268H.f203834a;
        }
        super.mo19738g2();
    }

    /* JADX INFO: renamed from: g6 */
    public void m208014g6(int i, int i2) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.setAudioProfile(i, i2);
            hmx hmxVar = this.f14269I;
            if (hmxVar != null) {
                hmxVar.m131787l("setAudioProfile", "profile:" + i + ",scenario:" + i2);
            }
            this.f14268H.f203787C0 = m207870k6(i);
        }
    }

    /* JADX INFO: renamed from: g7 */
    public int m208015g7(int i) {
        RtcEngine rtcEngine;
        this.f14269I.m131787l("setAudioEffectPreset", Integer.valueOf(i));
        int iM120139a = fa1.m120138b().m120139a(i);
        if (iM120139a == -1 || (rtcEngine = this.f192038U) == null) {
            return -1;
        }
        return rtcEngine.setAudioEffectPreset(iM120139a);
    }

    /* JADX INFO: renamed from: g8 */
    public void m208016g8() {
        if (!this.f192074e1) {
            this.f192038U.registerAudioFrameObserver(null);
        }
        this.f191979A3 = false;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getEarMonitoringAudioParams() {
        return null;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getMixedAudioParams() {
        return null;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public int getObservedAudioFramePosition() {
        return 0;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getPlaybackAudioParams() {
        return null;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getRecordAudioParams() {
        return null;
    }

    @Override // p149l.ewl
    public int getRoomType() {
        return this.f192109p1;
    }

    @Override // p149l.ewl
    public String getServerIpAddr() {
        return StringUtil.ALL_INTERFACES;
    }

    @Override // p149l.ewl
    public int getVideoWidth() {
        if (this.f192130w1 || this.f192127v1) {
            return 0;
        }
        return this.f14281s.f177152m;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: h0 */
    public int mo20013h0() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f192018O0;
        if (rtcStats != null) {
            return rtcStats.rxBytes;
        }
        return 0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: h1 */
    public int mo20014h1() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f192018O0;
        if (rtcStats != null) {
            return rtcStats.txAudioKBitRate;
        }
        return 0;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: h2 */
    public void mo19739h2() {
        this.f14269I.m131787l("pushStart_v3", Boolean.valueOf(this.f192141z3));
        if (this.f192141z3) {
            return;
        }
        this.f192141z3 = true;
        this.f14268H.f203851f1 = (!TextUtils.isEmpty(this.f192055Y0) || TextUtils.isEmpty(this.f192115r1)) ? 0L : 1L;
        this.f14268H.f203834a = System.currentTimeMillis();
        this.f14268H.f203894v = getVideoWidth();
        this.f14268H.f203896w = mo20022k0();
        this.f14268H.f203902z = mo20036p1();
        this.f14268H.f203782A = mo19914A0();
        long j = this.f192082g3;
        zmx zmxVar = this.f14268H;
        if (j == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zmx zmxVar2 = this.f14268H;
            zmxVar.f203846e = jCurrentTimeMillis - zmxVar2.f203846e;
            this.f192082g3 = zmxVar2.f203846e;
        } else {
            zmxVar.f203846e = j;
        }
        this.f14268H.f203857h1 = this.f192105o1.f182035X0 ? 1 : 0;
        zmx zmxVar3 = this.f14268H;
        boolean z = this.f14281s.f182019H0;
        zmxVar3.f203852g = z ? 2L : 0L;
        zmxVar3.f203866k1 = z ? 1 : 0;
        super.mo19739h2();
    }

    /* JADX INFO: renamed from: h7 */
    public int m208017h7(int i) {
        this.f14269I.m131787l("setAudioMixingDualMonoMode:" + i);
        Constants.AudioMixingDualMonoMode audioMixingDualMonoMode = Constants.AudioMixingDualMonoMode.values()[i];
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            return rtcEngine.setAudioMixingDualMonoMode(audioMixingDualMonoMode);
        }
        return -1;
    }

    /* JADX INFO: renamed from: h8 */
    public int m208018h8(String str, String str2) {
        int iM207838a8;
        if (this.f192038U == null) {
            return -4;
        }
        this.f14269I.m131787l("subscribeOhterRoom", str, str2, "isStartMediaRelay:" + this.f192076e3 + ",my:" + this.f192105o1.f155327i1);
        if (!this.f14268H.f203837b || this.f192105o1 == null) {
            this.f192087i2 = true;
            this.f192090j2 = String.valueOf(str);
            iM207838a8 = 0;
        } else {
            iM207838a8 = m207838a8(str);
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "lqdebug startChannelMediaRelay ret " + iM207838a8 + "channelid =" + str + "myUid =" + str2);
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "lqdebug startChannelMediaRelay channelid =" + str + "dstUid =" + str2);
        return iM207838a8;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: i2 */
    public void mo19740i2() {
        this.f192141z3 = false;
        this.f14269I.m131787l("pushStop_v3");
        zmx zmxVar = this.f14268H;
        zmxVar.f203862j0 = this.f192091j3;
        if (zmxVar.f203837b) {
            zmxVar.f203855h = System.currentTimeMillis() - this.f14268H.f203834a;
        }
        super.mo19740i2();
    }

    /* JADX INFO: renamed from: i7 */
    public void m208020i7(int i) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.setAudioMixingPitch(i);
        }
    }

    /* JADX INFO: renamed from: i8 */
    public void m208021i8(int i, int i2, int i3) {
        cbl0 cbl0Var = this.f192065b1;
        if (cbl0Var != null) {
            cbl0Var.mo19145c(i, new C21071b(i2, i3, i), i2, i3);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: j1 */
    public long mo20019j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j6 */
    public int m208022j6(int i) {
        if (i != 0) {
            return i != 2 ? 2 : 5;
        }
        return 1;
    }

    /* JADX INFO: renamed from: j7 */
    public void m208023j7(boolean z) {
        this.f192130w1 = z;
        if (z) {
            this.f191997H0 = false;
        }
    }

    /* JADX INFO: renamed from: j8 */
    public void m208024j8(int i) {
        cbl0 cbl0Var = this.f192065b1;
        if (cbl0Var != null) {
            cbl0Var.mo19143a(i, new C21080k(i), this.width, this.height);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: k0 */
    public int mo20022k0() {
        if (this.f192130w1 || this.f192127v1) {
            return 0;
        }
        return this.f14281s.f177154n;
    }

    /* JADX INFO: renamed from: k7 */
    public void m208025k7(int i, int i2) {
        this.f14269I.m131787l("setmmLiveAudioProfile", "profile:" + i + ",scenario:" + i2);
        this.f191988E0 = i;
        this.f191991F0 = i2;
    }

    /* JADX INFO: renamed from: k8 */
    public int m208026k8(String str) {
        this.f14269I.m131787l("unSubscribeOtherRoom", str);
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine == null) {
            return -4;
        }
        int iStopChannelMediaRelay = rtcEngine.stopChannelMediaRelay();
        this.f14269I.m131787l("stopChannelMediaRelay ret:" + iStopChannelMediaRelay);
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "lqdebug stopChannelMediaRelay ");
        this.f192076e3 = false;
        return iStopChannelMediaRelay;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo19664l0(vlw vlwVar, EGLContext eGLContext) {
        if (vlwVar == null || this.f192051X0 == 1) {
            return;
        }
        super.mo19655R0(vlwVar, eGLContext);
        if (vlwVar.f177131b0 && !this.f192101m3 && !this.f192130w1 && this.f192069c2 == null) {
            C21081l c21081l = new C21081l("live-media-aFFrame");
            this.f192069c2 = c21081l;
            c21081l.start();
        }
        if (!(vlwVar instanceof qmr)) {
            throw new InvalidParameterException("Parameters error");
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter startRecord");
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
        ii70VarM136344d.m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", sb.toString());
        this.f192105o1 = qmrVar;
        if (vlwVar.f182012A0 == MomoPipeline.DecodeType.SOFT_DECODE || qmrVar.f177131b0) {
            this.f192034T = false;
        }
        this.f192006K0 = new wb1();
        yw00 yw00Var = this.f192003J0;
        if (yw00Var != null) {
            this.f192046W = yw00Var.m216278l();
        }
        if (fjx.m121638R().m121775p()) {
            int iM121778q = (int) (fjx.m121638R().m121778q() * (vlwVar.f177109H / 1000));
            VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration();
            videoEncoderConfiguration.minBitrate = iM121778q;
            RtcEngine rtcEngine = this.f192038U;
            if (rtcEngine != null) {
                rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
            }
            n8c.m158488f("agora_minkbs", "minBitrate parms = " + iM121778q);
        }
        this.f192120s3 = false;
        this.f192133x1 = false;
        this.f192123t3 = false;
        if (this.f192072d2) {
            m207993Y7(0);
            m207993Y7(1);
        }
        this.f192051X0 = 1;
        this.f14268H.f203842c1 = this.f192118s1;
        st0.m185792g().m185807p(m19726W1(), st0.f166270f);
        zmx zmxVar = this.f14268H;
        if (zmxVar.f203842c1 == 1) {
            zmxVar.f203785B0 = "M".equals(mo20052w1()) ? "AgoraMaster" : "AgoraSlaver";
        } else {
            zmxVar.f203785B0 = "AgoraAudience";
        }
        this.f14268H.f203845d1 = vlwVar.m198870d();
        zmx zmxVar2 = this.f14268H;
        zmxVar2.f203839b1 = vlwVar.f177131b0 ? 1L : 0L;
        zmxVar2.f203898x = vlwVar.f182043v0;
        int i = vlwVar.f177109H;
        this.f192107o3 = i;
        this.f192111p3 = vlwVar.f182016E0;
        qmr qmrVar2 = this.f192105o1;
        zmxVar2.f203826W = qmrVar2.f182013B0;
        zmxVar2.f203828X = qmrVar2.f155325g1;
        zmxVar2.f203793F0 = i;
        if (this.f192038U != null) {
            zmxVar2.f203879p = RtcEngine.getSdkVersion();
        }
        this.f14268H.f203849f = System.currentTimeMillis();
        this.f14268H.f203793F0 = vlwVar.f177109H;
        this.f14269I.m131787l("startRecordWithNotJoinRoom");
        fjx.m121638R().m121647C1(fjx.m121638R().m121682O0() ? 1 : 0);
        this.f14269I.m131787l("mrCoreParameters", Boolean.valueOf(fjx.m121638R().m121682O0()));
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: l1 */
    public long mo20025l1() {
        return 0L;
    }

    /* JADX INFO: renamed from: l6 */
    public int m208027l6(int i) {
        return i != 1 ? 3 : 0;
    }

    /* JADX INFO: renamed from: l7 */
    public void m208028l7(int i) {
        this.f192089j1 = i;
    }

    /* JADX INFO: renamed from: l8 */
    public void m208029l8(String str) {
        this.f192115r1 = str;
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.renewToken(str);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: m0 */
    public int mo20028m0() {
        if (this.f192050X) {
            IRtcEngineEventHandler.LocalVideoStats localVideoStatsM207904t6 = m207904t6();
            if (localVideoStatsM207904t6 != null) {
                return localVideoStatsM207904t6.sentFrameRate;
            }
            return 0;
        }
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM207909u6 = m207909u6();
        if (remoteVideoStatsM207909u6 != null) {
            return remoteVideoStatsM207909u6.rendererOutputFrameRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m6 */
    public int m208030m6() {
        this.f14269I.m131787l("getAudioTrackCount");
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            return rtcEngine.getAudioTrackCount();
        }
        return -1;
    }

    /* JADX INFO: renamed from: m7 */
    public void m208031m7(int i) {
        this.f14268H.f203858i = i;
    }

    /* JADX INFO: renamed from: m8 */
    public void m208032m8(String str) {
        this.f14269I.m131787l("updateRtmpUrl", str);
        if (this.f192038U == null || TextUtils.isEmpty(str) || this.f192084h2 == null) {
            this.f14269I.m131786k("updateRtmpUrl", "updateRtmpUrl error : engine" + this.f192038U + ", publishConfig:" + this.f192084h2 + ",path:" + str);
            return;
        }
        if (str.equals(this.f14268H.f203898x)) {
            this.f14269I.m131786k("updateRtmpUrl", "url  is no difference: newUrl:" + str + ",old is:" + this.f14268H.f203898x);
            return;
        }
        this.f14268H.f203898x = str;
        this.f192038U.startRtmpStreamWithTranscoding(str, this.f192084h2);
        MRtcPusherHandler mRtcPusherHandler = this.f191982B3;
        if (mRtcPusherHandler != null) {
            mRtcPusherHandler.onPushChangeStreamUrl(str);
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "updateRtmpUrl:url=".concat(str));
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: n0 */
    public long mo20030n0() {
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: n1 */
    public int mo20031n1() {
        return this.f192102n1;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: n2 */
    public void mo19746n2(vlw vlwVar) {
        super.mo19746n2(vlwVar);
        vlw vlwVar2 = this.f14281s;
        qmr qmrVar = (qmr) vlwVar2;
        this.f192105o1 = qmrVar;
        if (qmrVar != null) {
            if (!this.f192034T || vlwVar2.f182012A0 == MomoPipeline.DecodeType.SOFT_DECODE || ((qmr) vlwVar2).f177131b0) {
                vlwVar2.f182012A0 = MomoPipeline.DecodeType.SOFT_DECODE;
            } else {
                vlwVar2.f182012A0 = MomoPipeline.DecodeType.HARD_DECODE;
            }
        }
    }

    /* JADX INFO: renamed from: n7 */
    public void m208033n7(int i) {
        this.f14268H.f203888s = i;
        this.f14269I.m131787l("setBusinessType agora", Integer.valueOf(i));
        hjx.m131421d("Pipeline_Normal_pip->PIPLINE->AGORA", "setBusinessType : " + i);
    }

    @Override // p149l.fcj, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        this.texture_in = i;
        mo19653M1();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o */
    public void mo19666o() {
        this.f14269I.m131787l("LeaveRoom");
        if (this.f192038U != null) {
            m207977S5();
            m207993Y7(0);
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "LeaveRoom >>>>>");
            this.f192038U.registerAudioFrameObserver(null);
            this.f192074e1 = false;
            String str = this.f14281s.f182043v0;
            if (str != null) {
                this.f192038U.stopRtmpStream(str);
            }
            this.f192038U.leaveChannel();
            if (this.f191985C3) {
                return;
            }
            this.f191985C3 = true;
            mo19735d2();
        }
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
    public double m208034o6() {
        RtcEngine rtcEngine = this.f192038U;
        return rtcEngine != null ? ((RtcEngineImpl) rtcEngine).getEffectsVolume() / 100.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: o7 */
    public void m208035o7(String str) {
        this.f192115r1 = str;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public boolean onEarMonitoringAudioFrame(int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        return false;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public boolean onMixedAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        return false;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public boolean onPlaybackAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        if (this.f192006K0 != null && this.f192071d1 != null) {
            int i7 = i2 * i3 * i4;
            byte[] bArr = new byte[i7];
            byteBuffer.get(bArr, 0, i7);
            if (this.f192118s1 == 2) {
                this.f192071d1.mo128315C(new mpd0((this.f192105o1.f177119R == 1 || i4 != 1) ? bArr : m300.m152744o2(bArr, i7), System.currentTimeMillis(), 2));
            } else {
                wb1 wb1Var = this.f192006K0;
                if (wb1Var != null) {
                    wb1Var.m202493i(new mpd0(bArr, System.currentTimeMillis(), i4));
                }
            }
            hgd0 hgd0Var = this.f192002I2;
            if (hgd0Var != null) {
                hgd0Var.mo19160m(bArr, i5, i4);
            }
        }
        return true;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public boolean onPlaybackAudioFrameBeforeMixing(String str, int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, long j, int i7, int i8, long j2) {
        return false;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public boolean onRecordAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        mpd0 mpd0VarMo18364C;
        ByteBuffer byteBuffer2;
        this.f192093k1++;
        int i7 = i2 * i4 * i3;
        byte[] bArrM152744o2 = new byte[i7];
        if (!this.f192081g2) {
            byteBuffer.get(bArrM152744o2, 0, i7);
        }
        pcmDataAvailableCallback pcmdataavailablecallback = this.f191992F1;
        if (pcmdataavailablecallback != null) {
            pcmdataavailablecallback.onPcmDateCallback(this.f192105o1.f182013B0, bArrM152744o2, 44100, i4 != 1);
        }
        u3m u3mVar = this.f14271K;
        mpd0 mpd0Var = null;
        if (u3mVar != null) {
            ((ExtAudioWrapper) u3mVar).mo20101W1(this.f192086i1);
            ((ExtAudioWrapper) this.f14271K).m20087I2(2048, this.f192105o1.f177117P, i4, "Agora");
            mpd0VarMo18364C = ((ExtAudioWrapper) this.f14271K).mo18364C(new mpd0(bArrM152744o2, this.f192089j1, i4));
            if (mpd0VarMo18364C != null && (byteBuffer2 = mpd0VarMo18364C.f135036b) != null) {
                byteBuffer2.get(bArrM152744o2, 0, i7);
                byteBuffer.rewind();
                byteBuffer.put(bArrM152744o2);
                byteBuffer.rewind();
            }
        } else {
            mpd0VarMo18364C = null;
        }
        hgd0 hgd0Var = this.f192002I2;
        if (hgd0Var != null) {
            hgd0Var.mo19162o(bArrM152744o2, i5, i4);
        }
        if (this.f192071d1 != null && this.f192077f1) {
            if (this.f14271K != null) {
                wb1 wb1Var = this.f192006K0;
                if (wb1Var != null) {
                    wb1Var.m202494j(1.0f);
                    if (this.f192105o1.f182035X0) {
                        this.f192006K0.m202495k(1.0f);
                    }
                    mpd0Var = this.f192006K0.m202491g();
                }
                if (mpd0Var != null) {
                    wb1 wb1Var2 = this.f192006K0;
                    ByteBuffer byteBufferM202492h = mpd0VarMo18364C != null ? wb1Var2.m202492h(mpd0VarMo18364C.m155800c(), mpd0Var.m155800c(), mpd0Var.m155802e()) : wb1Var2.m202492h(bArrM152744o2, mpd0Var.m155800c(), mpd0Var.m155802e());
                    if (byteBufferM202492h != null) {
                        mpd0Var = new mpd0(byteBufferM202492h.array(), mpd0Var.m155801d(), i4);
                    }
                }
            }
            if (mpd0Var != null) {
                byte[] bArrM152744o3 = i4 == 1 ? m300.m152744o2(mpd0Var.m155800c(), mpd0Var.m155802e()) : mpd0Var.m155800c();
                mpd0 mpd0Var2 = new mpd0(bArrM152744o3, this.f192089j1, 2);
                mpd0Var2.m155804g(false);
                sml.InterfaceC19992a interfaceC19992a = this.f192071d1;
                if (interfaceC19992a != null) {
                    interfaceC19992a.mo128315C(mpd0Var2);
                    int i8 = this.f192135x3;
                    this.f192135x3 = i8 + 1;
                    if (i8 % 50 == 0) {
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "=====replace======:Agora send pcm to IJK ");
                    }
                }
                hgd0 hgd0Var2 = this.f192002I2;
                if (hgd0Var2 != null) {
                    hgd0Var2.mo19161n(bArrM152744o3, i5, i4);
                }
            } else if (this.f192118s1 != 2) {
                if (i4 == 1) {
                    bArrM152744o2 = m300.m152744o2(bArrM152744o2, i7);
                }
                mpd0 mpd0Var3 = new mpd0(bArrM152744o2, this.f192089j1, 2);
                mpd0Var3.m155804g(false);
                sml.InterfaceC19992a interfaceC19992a2 = this.f192071d1;
                if (interfaceC19992a2 != null) {
                    interfaceC19992a2.mo128315C(mpd0Var3);
                    int i9 = this.f192135x3;
                    this.f192135x3 = i9 + 1;
                    if (i9 % 50 == 0) {
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "=====replace======:Agora send pcm to IJK ");
                    }
                }
                hgd0 hgd0Var3 = this.f192002I2;
                if (hgd0Var3 != null) {
                    hgd0Var3.mo19161n(bArrM152744o2, i5, i4);
                }
            }
        }
        return true;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: p */
    public void mo19668p(String str, int i) {
        this.f14269I.m131787l("JoinRoom", str, Integer.valueOf(i));
        this.f191985C3 = false;
        this.f14268H.f203846e = System.currentTimeMillis();
        m207813T5(this.f192118s1, 33);
        m207752B6(str, this.f192105o1.f182013B0);
        String str2 = this.f191980B1;
        if (str2 != null && this.f192105o1.f155326h1 && this.f191983C1 == null) {
            m208054z7(str2);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: p1 */
    public int mo20036p1() {
        qmr qmrVar = this.f192105o1;
        int i = qmrVar.f177148k;
        return i > 0 ? i : qmrVar.f177164s;
    }

    /* JADX INFO: renamed from: p7 */
    public void m208036p7(boolean z) {
        this.f192014M2 = z;
        if (z) {
            m207993Y7(1);
        }
        hmx hmxVar = this.f14269I;
        if (hmxVar != null) {
            hmxVar.m131786k("setCustomPreview", "[" + z + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: q1 */
    public long mo20038q1() {
        return this.f192009L0;
    }

    /* JADX INFO: renamed from: q2 */
    public void m208037q2() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter release");
        this.f14269I.m131787l("ReleaseNotLeave");
        boolean z = true;
        this.f192120s3 = true;
        this.f192050X = false;
        synchronized (this.f192121t1) {
            try {
                this.f14268H.f203835a0 = null;
                if (this.f192038U != null) {
                    t0f t0fVarM186855b = t0f.m186855b();
                    IRtcEngineEventHandler iRtcEngineEventHandler = this.f192013M1;
                    if (this.f192095k3 != 0) {
                        z = false;
                    }
                    t0fVarM186855b.m186856a(iRtcEngineEventHandler, z);
                    this.f192050X = false;
                    m19744l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                    this.f14270J = MomoCodec.MomoCodecState.STOP;
                    this.f192080g1.mo128349g(4097, 0, 0, this);
                    this.f192042V = -1;
                }
                this.f192050X = false;
                m19744l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                this.f14270J = MomoCodec.MomoCodecState.STOP;
                this.f192080g1.mo128349g(4097, 0, 0, this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q6 */
    public long m208038q6() {
        if (!fjx.m121638R().m121716a()) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        GLES20.glFlush();
        return jGlFenceSync;
    }

    /* JADX INFO: renamed from: q7 */
    public void m208039q7(boolean z) {
        this.f192078f2 = z;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: r0 */
    public long mo20041r0() {
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: r1 */
    public boolean mo19669r1() {
        return this.f192072d2;
    }

    /* JADX INFO: renamed from: r6 */
    public int m208040r6() {
        return this.f192043V0;
    }

    /* JADX INFO: renamed from: r7 */
    public int m208041r7(int i, ikw ikwVar) {
        this.f14269I.m131787l("setDualStreamMode", "mode:" + i + ",config:" + ikwVar.toString());
        SimulcastStreamConfig simulcastStreamConfig = new SimulcastStreamConfig();
        int i2 = ikwVar.f113736b;
        simulcastStreamConfig.bitrate = i2;
        simulcastStreamConfig.framerate = ikwVar.f113737c;
        VideoEncoderConfiguration.VideoDimensions videoDimensions = simulcastStreamConfig.dimensions;
        lkw lkwVar = ikwVar.f113735a;
        videoDimensions.height = lkwVar.f128614b;
        videoDimensions.width = lkwVar.f128613a;
        zmx zmxVar = this.f14268H;
        zmxVar.f203871m0 = i2;
        zmxVar.f203868l0 = i == 1 ? 1L : 0L;
        Constants.SimulcastStreamMode simulcastStreamMode = Constants.SimulcastStreamMode.AUTO_SIMULCAST_STREAM;
        if (i != -1) {
            if (i == 0) {
                simulcastStreamMode = Constants.SimulcastStreamMode.DISABLE_SIMULCAST_STREAM;
            } else if (i == 1) {
                simulcastStreamMode = Constants.SimulcastStreamMode.ENABLE_SIMULCAST_STREAM;
            }
        }
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            return rtcEngine.setDualStreamMode(simulcastStreamMode, simulcastStreamConfig);
        }
        return -1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: s0 */
    public int mo20044s0() {
        return 0;
    }

    /* JADX INFO: renamed from: s6 */
    public int m208042s6() {
        return this.f192047W0;
    }

    /* JADX INFO: renamed from: s7 */
    public void m208043s7(double d) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).setEffectsVolume(d * 100.0d);
        }
    }

    public void stopSurroundMusic() {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "stopSurroundMusic:");
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.stopAudioMixing();
            this.f191977A1 = false;
        }
    }

    /* JADX INFO: renamed from: t7 */
    public void m208044t7(boolean z) {
        this.f192079f3 = z;
        this.f14269I.m131787l("setEnableConferenceReconnect:" + z);
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

    /* JADX INFO: renamed from: u7 */
    public int m208045u7(boolean z) {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            return rtcEngine.setEnableSpeakerphone(z);
        }
        return -1;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: v0 */
    public void mo19670v0(ByteBuffer byteBuffer) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "writevideo:" + byteBuffer.limit() + ";timeStamp:" + jCurrentTimeMillis);
        if (this.f192034T || !this.f192050X || this.f192101m3) {
            return;
        }
        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
        agoraVideoFrame.format = 1;
        agoraVideoFrame.timeStamp = System.currentTimeMillis();
        qmr qmrVar = this.f192105o1;
        agoraVideoFrame.stride = qmrVar.f177152m;
        agoraVideoFrame.height = qmrVar.f177154n;
        agoraVideoFrame.rotation = 0;
        agoraVideoFrame.buf = byteBuffer.array();
        synchronized (this.f192121t1) {
            try {
                if (this.f192038U != null && !this.f192120s3) {
                    this.f192038U.pushExternalVideoFrame(agoraVideoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f192124u1 + 1;
        this.f192124u1 = i;
        if (i >= 30 || this.f192127v1) {
            m207788M6();
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: w1 */
    public String mo20052w1() {
        qmr qmrVar = this.f192105o1;
        return (qmrVar == null || qmrVar.f155326h1) ? "M" : j6f.LATITUDE_SOUTH;
    }

    /* JADX INFO: renamed from: w6 */
    public float m208047w6() {
        return this.f192086i1;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: x1 */
    public long mo20054x1() {
        return this.f192093k1 * 1024;
    }

    /* JADX INFO: renamed from: x6 */
    public long m208049x6() {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x7 */
    public void m208050x7(String str) {
        boolean zHas;
        try {
            zHas = new JSONObject(str).has("che.audio.profile");
        } catch (Exception e) {
            e.printStackTrace();
            zHas = false;
        }
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine == null || zHas) {
            return;
        }
        rtcEngine.setParameters(str);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y */
    public void mo19671y(int i, int i2) {
        this.f14269I.m131787l("agoraPusherFilter", "interval:" + i + ",smooth:" + i2);
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.enableAudioVolumeIndication(i, i2, true);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y0 */
    public void mo19672y0(int i, int i2, int i3) {
        this.f14269I.m131787l("agoraPusherFilter", "interval:" + i + ",smooth:" + i2);
        boolean z = i3 != 0;
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            rtcEngine.enableAudioVolumeIndication(i, i2, z);
        }
    }

    /* JADX INFO: renamed from: y6 */
    public long m208051y6() {
        RtcEngine rtcEngine = this.f192038U;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: z5 */
    public void m208053z5(MRtcEventHandler mRtcEventHandler) {
        this.f192028R1 = mRtcEventHandler;
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
    public void m208054z7(String str) {
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
        String str8 = BaseSei.f13931Y;
        String str9 = "pkmu";
        String str10 = "renderMode";
        if (this.f192105o1 == null || string == null) {
            return;
        }
        if (this.f192084h2 == null) {
            this.f192084h2 = new LiveTranscoding();
        }
        qmr qmrVar = this.f192105o1;
        String str11 = "alpha";
        int i4 = qmrVar.f177148k;
        String str12 = BaseSei.f13932Z;
        LiveTranscoding liveTranscoding = this.f192084h2;
        String str13 = "h";
        if (i4 > 0) {
            liveTranscoding.width = i4;
            liveTranscoding.height = qmrVar.f177150l;
            if (qmrVar.f182017F0 && qmrVar.m198870d() == 1) {
                LiveTranscoding liveTranscoding2 = this.f192084h2;
                qmr qmrVar2 = this.f192105o1;
                liveTranscoding2.width = qmrVar2.f177150l;
                liveTranscoding2.height = qmrVar2.f177148k;
            }
        } else {
            liveTranscoding.width = qmrVar.f177164s;
            liveTranscoding.height = qmrVar.f177166t;
        }
        this.f14269I.m131787l("setJsonForPostion publishConfig", "w:" + this.f192084h2.width, "h:" + this.f192084h2.height);
        LiveTranscoding liveTranscoding3 = this.f192084h2;
        if (liveTranscoding3.width <= 0 || liveTranscoding3.height <= 0) {
            return;
        }
        liveTranscoding3.backgroundColor = 0;
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
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                string = jSONObject.toString();
            } catch (Exception unused2) {
                this.f14269I.m131787l("setJsonForPostion parseInt err", "pos:" + string);
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject(string);
        String str14 = "";
        String string2 = jSONObject2.has(BaseSei.MID) ? jSONObject2.getString(BaseSei.MID) : "";
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        int iOptInt = jSONObject2.has(BaseSei.ShortSei) ? jSONObject2.optInt(BaseSei.ShortSei, 0) : 0;
        this.f192084h2.setUsers((ArrayList<LiveTranscoding.TranscodingUser>) null);
        if (jSONObject2.has(BaseSei.CONF)) {
            i = 0;
            jSONArray = jSONObject2.getJSONArray(BaseSei.CONF);
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
                transcodingUser2.f63365x = 0;
                transcodingUser2.f63366y = 0;
                LiveTranscoding liveTranscoding4 = this.f192084h2;
                transcodingUser2.width = liveTranscoding4.width;
                transcodingUser2.height = liveTranscoding4.height;
                transcodingUser2.alpha = 1.0f;
                liveTranscoding4.addUser(transcodingUser2);
                this.f192084h2.userConfigExtraInfo = m207914v6(string);
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
            double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d2 = (jSONObject3 == null || !jSONObject3.has(BaseSei.f13930X)) ? 0.0d : jSONObject3.getDouble(BaseSei.f13930X);
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
                            this.f14269I.m131787l("setJsonForPostion ", "id is empty string");
                            return;
                        }
                        transcodingUser.uid = Integer.parseInt(string3);
                        transcodingUser.zOrder = i2;
                        transcodingUser.alpha = 1.0f;
                        LiveTranscoding liveTranscoding5 = this.f192084h2;
                        int i6 = liveTranscoding5.width;
                        int i7 = i5;
                        String str15 = str14;
                        transcodingUser.f63365x = (int) (((double) i6) * d2);
                        int i8 = liveTranscoding5.height;
                        String str16 = str7;
                        String str17 = str8;
                        transcodingUser.f63366y = (int) (((double) i8) * d);
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
                    this.f14269I.m131787l("setJsonForPostion ", "id is empty string");
                    return;
                }
                transcodingUser.uid = Integer.parseInt(string3);
                transcodingUser.zOrder = i2;
                transcodingUser.alpha = 1.0f;
                LiveTranscoding liveTranscoding6 = this.f192084h2;
                int i9 = liveTranscoding6.width;
                int i10 = i5;
                String str18 = str14;
                transcodingUser.f63365x = (int) (((double) i9) * d2);
                int i11 = liveTranscoding6.height;
                String str19 = str7;
                String str110 = str8;
                transcodingUser.f63366y = (int) (((double) i11) * d);
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
                        this.f14269I.m131787l("setJsonForPostion ", "id is empty string");
                        return;
                    }
                    transcodingUser.uid = Integer.parseInt(string3);
                    transcodingUser.zOrder = i2;
                    transcodingUser.alpha = 1.0f;
                    LiveTranscoding liveTranscoding7 = this.f192084h2;
                    int i12 = liveTranscoding7.width;
                    int i13 = i5;
                    String str111 = str14;
                    transcodingUser.f63365x = (int) (((double) i12) * d2);
                    int i14 = liveTranscoding7.height;
                    String str112 = str7;
                    String str113 = str8;
                    transcodingUser.f63366y = (int) (((double) i14) * d);
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
                this.f14269I.m131787l("setJsonForPostion ", "id is empty string");
                return;
            }
            transcodingUser.uid = Integer.parseInt(string3);
            transcodingUser.zOrder = i2;
            transcodingUser.alpha = 1.0f;
            LiveTranscoding liveTranscoding8 = this.f192084h2;
            int i15 = liveTranscoding8.width;
            int i16 = i5;
            String str114 = str14;
            transcodingUser.f63365x = (int) (((double) i15) * d2);
            int i17 = liveTranscoding8.height;
            String str115 = str7;
            String str116 = str8;
            transcodingUser.f63366y = (int) (((double) i17) * d);
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
        this.f192084h2.userConfigExtraInfo = m207914v6(string);
        if (iOptInt == 1) {
            this.f192084h2.userConfigExtraInfo = m207888p6(string);
        }
        m207817U5(this.f192105o1.f182043v0);
    }

    /* JADX INFO: renamed from: l.xc0$d */
    public class C21073d implements ExtAudioWrapper.InterfaceC4108i {
        public C21073d() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4108i
        public int getStreamerType() {
            return 2;
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4108i
        /* JADX INFO: renamed from: b */
        public void mo20061b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4108i
        /* JADX INFO: renamed from: a */
        public void mo20060a(String str) {
        }
    }

    /* JADX INFO: renamed from: l.xc0$e */
    public class C21074e extends IRtcEngineEventHandler {

        /* JADX INFO: renamed from: l.xc0$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f192155a;

            public a(int i) {
                this.f192155a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (xc0.this.f192059Z0 != null) {
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAdded Audio: userID=" + this.f192155a);
                    xc0.this.f192059Z0.mo19137a((long) this.f192155a, null, 176, 176);
                }
            }
        }

        public C21074e() {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioMixingStateChanged(int i, int i2) {
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onAudioMixingStateChanged", "state:" + i + ", reasonCode:" + i2);
            switch (i) {
                case Constants.AUDIO_MIXING_STATE_PLAYING /* 710 */:
                    if (xc0.this.f192002I2 != null) {
                        xc0.this.f192002I2.mo19151c();
                    }
                    break;
                case Constants.AUDIO_MIXING_STATE_PAUSED /* 711 */:
                    if (xc0.this.f192002I2 != null) {
                        xc0.this.f192002I2.mo19150b();
                    }
                    break;
                case Constants.AUDIO_MIXING_STATE_STOPPED /* 713 */:
                    if (i2 == 723) {
                        xc0.this.f191977A1 = false;
                        xc0.this.m207796O7(null, 2, 0);
                        if (xc0.this.f192028R1 != null) {
                            xc0.this.f192028R1.onAudioMixingFinished();
                        }
                        break;
                    } else if (i2 == 724 && xc0.this.f192002I2 != null) {
                        xc0.this.f192002I2.mo19152d();
                        break;
                    }
                    break;
                case Constants.AUDIO_MIXING_STATE_FAILED /* 714 */:
                    if (xc0.this.f192002I2 != null) {
                        xc0.this.f192002I2.mo19149a();
                    }
                    break;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioQuality(int i, int i2, short s, short s2) {
            ley leyVar = (ley) xc0.this.f192027R0.get(Long.valueOf(i));
            if (leyVar != null) {
                leyVar.m149627j(s, s2);
            }
            if (xc0.this.f192044V1 != null) {
                xc0.this.f192044V1.onAudioQuality(i, i2, s, s2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:49:0x014b  */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            int length;
            if (audioVolumeInfoArr == null || audioVolumeInfoArr.length <= 0) {
                length = 1;
            } else {
                int i2 = audioVolumeInfoArr[0].uid;
                if (i2 != 0 && i2 != xc0.this.f192105o1.f182013B0) {
                    xc0.this.f192019O1 = audioVolumeInfoArr;
                    if (xc0.this.f192025Q1 != null) {
                        AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[audioVolumeInfoArr.length];
                        for (int i3 = 0; i3 < audioVolumeInfoArr.length; i3++) {
                            AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                            audioVolumeWeight.uid = xc0.this.f192019O1[i3].uid;
                            audioVolumeWeight.volume = (xc0.this.f192019O1[i3].volume * 1.0f) / 255.0f;
                            audioVolumeWeightArr[i3] = audioVolumeWeight;
                        }
                        xc0.this.f192025Q1.onAudioVolumeIndication(audioVolumeWeightArr, i);
                    }
                    if (!xc0.this.f192104n3 && xc0.this.f192118s1 == 1) {
                        return;
                    }
                } else if (xc0.this.f192025Q1 != null) {
                    AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                    audioVolumeWeight2.uid = xc0.this.f192105o1.f182013B0;
                    if (xc0.this.f192104n3) {
                        audioVolumeWeight2.volume = 0.0f;
                    } else {
                        audioVolumeWeight2.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
                    }
                    xc0.this.f192025Q1.onAudioVolumeIndication(new AudioVolumeWeight[]{audioVolumeWeight2}, i);
                }
                int i4 = audioVolumeInfoArr[0].uid;
                if (i4 == 0 || i4 == xc0.this.f192105o1.f182013B0) {
                    length = xc0.this.f192019O1 != null ? xc0.this.f192019O1.length + 1 : 1;
                    AudioVolumeWeight[] audioVolumeWeightArr2 = new AudioVolumeWeight[length];
                    AudioVolumeWeight audioVolumeWeight3 = new AudioVolumeWeight();
                    audioVolumeWeight3.uid = xc0.this.f192105o1.f182013B0;
                    if (xc0.this.f192104n3) {
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
                        audioVolumeWeight4.uid = xc0.this.f192019O1[i5].uid;
                        audioVolumeWeight4.volume = (xc0.this.f192019O1[i5].volume * 1.0f) / 255.0f;
                        audioVolumeWeight4.voicePitch = xc0.this.f192019O1[i5].voicePitch;
                        i5++;
                        audioVolumeWeightArr2[i5] = audioVolumeWeight4;
                    }
                    if (xc0.this.f192022P1 != null) {
                        xc0.this.f192022P1.onAudioVolumeIndication(audioVolumeWeightArr2, i);
                    }
                    xc0.this.f192019O1 = null;
                } else {
                    length = 1;
                }
            }
            if (xc0.this.f192118s1 == 1 || xc0.this.f192019O1 == null) {
                return;
            }
            AudioVolumeWeight[] audioVolumeWeightArr3 = new AudioVolumeWeight[length];
            new AudioVolumeWeight();
            for (int i6 = 0; i6 < length; i6++) {
                AudioVolumeWeight audioVolumeWeight5 = new AudioVolumeWeight();
                audioVolumeWeight5.uid = xc0.this.f192019O1[i6].uid;
                audioVolumeWeight5.volume = (xc0.this.f192019O1[i6].volume * 1.0f) / 255.0f;
                audioVolumeWeight5.voicePitch = xc0.this.f192019O1[i6].voicePitch;
                audioVolumeWeightArr3[i6] = audioVolumeWeight5;
            }
            if (xc0.this.f192022P1 != null) {
                xc0.this.f192022P1.onAudioVolumeIndication(audioVolumeWeightArr3, i);
            }
            xc0.this.f192019O1 = null;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x004d  */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onChannelMediaRelayStateChanged(int i, int i2) {
            int i3;
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onChannelMediaRelayStateChanged:", i + ", code:" + i2);
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "state" + i + ", code = " + i2);
            if (i == 0) {
                i3 = i2;
                if (i3 == 0) {
                    xc0.this.f192076e3 = false;
                    if (xc0.this.f192002I2 != null) {
                        xc0.this.f192002I2.mo19157i(0, "RELAY_STATE_IDLE");
                    }
                }
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "初始化状态 code" + i3);
            } else if (i == 2) {
                i3 = i2;
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", " 源频道主播成功加入目标频道 code " + i3);
                if (xc0.this.f192002I2 != null) {
                    xc0.this.f192002I2.mo19154f(0L, 1, "connect_success");
                }
            } else if (i != 3) {
                i3 = i2;
            } else {
                xc0.this.f192076e3 = false;
                if (xc0.this.f192002I2 != null) {
                    i3 = i2;
                    eyx.m118802c().m118806e("ConnectOtherRoom", "agora", i3, "onChannelMediaRelayStateChanged connect_failed", LogLevel.FATAL.value());
                    xc0.this.f192002I2.mo19154f(0L, 3, "connect_failed,code:" + i3);
                } else {
                    i3 = i2;
                }
            }
            if (i3 == 8) {
                xc0.this.f192080g1.mo128349g(4352, i3, 0, this);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onClientRoleChanged(int i, int i2, ClientRoleOptions clientRoleOptions) {
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onClientRoleChanged", Integer.valueOf(i), Integer.valueOf(i2));
            if (((MediaBaseCodecFilter) xc0.this).f14268H.f203837b) {
                long j = ((MediaBaseCodecFilter) xc0.this).f14268H.f203842c1;
                xc0 xc0Var = xc0.this;
                if (j == 1) {
                    xc0Var.mo19739h2();
                } else {
                    xc0Var.mo19737f2();
                }
            }
            if (xc0.this.f192052X1 != null) {
                xc0.this.f192052X1.onClientRoleChanged(i, i2);
            }
            if (xc0.this.f192002I2 != null) {
                xc0.this.f192002I2.mo19153e(i, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onConnectionStateChanged(int i, int i2) {
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onConnectionStateChanged", "state:" + i + ",reason:" + i2);
            switch (i2) {
                case 4:
                    ((MediaBaseCodecFilter) xc0.this).f14268H.f203901y0 = 810L;
                    ((MediaBaseCodecFilter) xc0.this).f14268H.f203865k0 = i2;
                    if (xc0.this.f192080g1 != null) {
                        xc0.this.f192080g1.mo128349g(4352, (int) ((MediaBaseCodecFilter) xc0.this).f14268H.f203901y0, i2, this);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    ((MediaBaseCodecFilter) xc0.this).f14268H.f203901y0 = i2 + 800;
                    ((MediaBaseCodecFilter) xc0.this).f14268H.f203865k0 = i2;
                    if (xc0.this.f192080g1 != null) {
                        xc0.this.f192080g1.mo128349g(4352, (int) ((MediaBaseCodecFilter) xc0.this).f14268H.f203901y0, i2, this);
                    }
                    break;
                case 10:
                    ((MediaBaseCodecFilter) xc0.this).f14268H.f203901y0 = 811L;
                    ((MediaBaseCodecFilter) xc0.this).f14268H.f203865k0 = i2;
                    if (xc0.this.f192080g1 != null) {
                        xc0.this.f192080g1.mo128349g(4352, (int) ((MediaBaseCodecFilter) xc0.this).f14268H.f203901y0, i2, this);
                    }
                    break;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i == 5 && i2 == 3) {
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onConnectionBanned");
                        if (xc0.this.f192048W1 != null) {
                            xc0.this.f192048W1.onReconnectTimeout();
                        }
                        if (xc0.this.f192002I2 != null) {
                            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onConnectionBannedByServer", "state:" + i + ",reason:" + i2);
                            xc0.this.f192002I2.mo19155g(i2);
                        }
                    }
                } else if (i2 == 2) {
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onConnectionInterrupted");
                    xc0.m207929z4(xc0.this);
                }
            } else if (xc0.this.f192098l3 != null) {
                xc0.this.f192098l3.removeCallbacks(xc0.this.f192011L2);
                xc0.this.f192091j3 = 0;
            }
            if (i2 == 15) {
                i = 6;
            }
            if (i2 == 16 && !xc0.this.f192079f3 && xc0.this.f192098l3 != null) {
                xc0.this.f192098l3.post(xc0.this.f192011L2);
            }
            if (xc0.this.f192002I2 != null) {
                ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onConnectionStateChanged", "state:" + i + ",reason:" + i2);
                xc0.this.f192002I2.mo19156h(i, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onError(int i) {
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("agora onError", Integer.valueOf(i));
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onJoinChannelSuccess(String str, int i, int i2) {
            int i3;
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onJoinChannelSuccess", str, Integer.valueOf(i), Integer.valueOf(i2));
            ii70 ii70VarM136344d = ii70.m136344d();
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" onJoinChannelSuccess ");
            sb.append(str);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(i);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            long j = i;
            sb.append(4294967295L & j);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(i2);
            ii70VarM136344d.m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", sb.toString());
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203837b = true;
            xc0.this.m19744l2(MediaBaseCodecFilter.CodecFilterState.FILTER_PLAY);
            if (xc0.this.f192038U != null) {
                xc0.this.f192050X = true;
            }
            ((MediaBaseCodecFilter) xc0.this).f14270J = MomoCodec.MomoCodecState.START;
            xc0.this.mo19732c2();
            xc0.this.m19731b2();
            xc0.this.f192080g1.mo128349g(4096, 0, 0, xc0.this);
            xc0.this.f192080g1.mo128349g(CommandMessage.COMMAND_GET_PUSH_STATUS, 0, 0, xc0.this);
            if ((xc0.this.f192130w1 || xc0.this.f192127v1) && xc0.this.f191995G1 != 0) {
                xc0.this.m207788M6();
            }
            xc0.this.f192085h3 = System.currentTimeMillis();
            if (xc0.this.f192087i2 && xc0.this.f192038U != null) {
                xc0 xc0Var = xc0.this;
                xc0Var.m207838a8(xc0Var.f192090j2);
                xc0.this.f192087i2 = false;
            }
            if (xc0.this.f192028R1 != null) {
                xc0.this.f192028R1.onJoinChannelSuccess(str, j, i2);
            }
            int i4 = xc0.this.f192004J1;
            xc0 xc0Var2 = xc0.this;
            if (i4 > 0) {
                i3 = xc0Var2.f192004J1;
            } else {
                i3 = xc0Var2.f192105o1.f182030S0 != 0 ? xc0.this.f192105o1.f182030S0 : 15;
            }
            int i5 = i3;
            int i6 = xc0.this.f192105o1.f177148k;
            xc0 xc0Var3 = xc0.this;
            if (i6 > 0) {
                xc0Var3.m207825W5(xc0Var3.f192105o1.f155326h1, xc0.this.f192105o1.f177148k, xc0.this.f192105o1.f177150l, xc0.this.f192001I1, i5, xc0.this.f192105o1.f182043v0);
            } else {
                xc0Var3.m207825W5(xc0Var3.f192105o1.f155326h1, xc0.this.f192105o1.f177164s, xc0.this.f192105o1.f177166t, xc0.this.f192001I1, i5, xc0.this.f192105o1.f182043v0);
            }
            if (!xc0.this.f192105o1.f155326h1 || xc0.this.f192084h2.getUsers().size() <= 0 || xc0.this.f192129v3 || TextUtils.isEmpty(xc0.this.f192105o1.f182043v0)) {
                return;
            }
            xc0 xc0Var4 = xc0.this;
            xc0Var4.m207778J7(xc0Var4.f192105o1.f182043v0);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLastmileQuality(int i) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onLastmileQuality " + i);
            xc0.this.f192080g1.mo128349g(4101, i, 0, xc0.this);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + " onLeaveChannelstats:" + rtcStats);
            if (rtcStats != null) {
                ((MediaBaseCodecFilter) xc0.this).f14268H.f203784B = rtcStats.txBytes;
                n8c.m158483a("AgoraJzheng", "" + rtcStats.txBytes + "/" + rtcStats.totalDuration);
            }
            if (xc0.this.f191999H2 != null) {
                xc0.this.f191999H2.onExitRoom();
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLocalAudioStateChanged(int i, int i2) {
            if (xc0.this.f192002I2 != null) {
                xc0.this.f192002I2.mo19158k(i, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLocalVideoStats(Constants.VideoSourceType videoSourceType, IRtcEngineEventHandler.LocalVideoStats localVideoStats) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onLocalVideoStatsstats:" + localVideoStats);
            xc0.this.f192024Q0 = localVideoStats;
            if (localVideoStats != null) {
                ((MediaBaseCodecFilter) xc0.this).f14268H.f203852g = ((MediaBaseCodecFilter) xc0.this).f14281s.f182019H0 ? 2L : 0L;
                ((MediaBaseCodecFilter) xc0.this).f14268H.f203796H = localVideoStats.encodedFrameCount;
            }
            if (xc0.this.f192035T0 = false) {
                xc0.this.f192035T0 = true;
                xc0.this.f192039U0 = false;
                xc0.this.f192080g1.mo128349g(4099, 0, 0, xc0.this);
                xc0.m207806R4(xc0.this);
            }
            if (xc0.this.f192040U1 != null) {
                xc0.this.f192063a2.f118323a = xc0.this.f192024Q0.sentBitrate;
                xc0.this.f192063a2.f118324b = xc0.this.f192024Q0.sentFrameRate;
                xc0.this.f192040U1.mo19140b(xc0.this.f192063a2);
            }
            int i = localVideoStats.targetBitrate * 1000;
            int i2 = localVideoStats.targetFrameRate;
            if (i == 0 || i2 == 0) {
                return;
            }
            if (xc0.this.f192107o3 == i && xc0.this.f192111p3 == i2) {
                return;
            }
            if (xc0.this.f192107o3 > i || xc0.this.f192111p3 > i2) {
                xc0.this.f192080g1.mo128349g(8197, 1, 0, this);
            } else {
                xc0.this.f192080g1.mo128349g(8197, 0, 0, this);
            }
            xc0.this.f192107o3 = i;
            xc0.this.f192111p3 = i2;
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onMediaEngineLoadSuccess() {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onMediaEngineLoadSuccess");
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onNetworkQuality(int i, int i2, int i3) {
            if (xc0.this.f192044V1 != null) {
                xc0.this.f192044V1.onNetworkQuality(i, i2, i3);
            }
            if (xc0.this.f192002I2 != null) {
                if (i == 0) {
                    i = xc0.this.f192105o1.f182013B0;
                    ((MediaBaseCodecFilter) xc0.this).f14268H.f203883q0 = i2;
                    ((MediaBaseCodecFilter) xc0.this).f14268H.f203886r0 = i3;
                }
                xc0.this.f192002I2.mo19159l(i, i2, i3);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRejoinChannelSuccess(String str, int i, int i2) {
            ii70.m136344d().m136348c("MyEngineEventHandler", "onRejoinChannelSuccess " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteAudioStateChanged(int i, int i2, int i3, int i4) {
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onRemoteAudioStateChanged", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            if (i2 == 1) {
                super.onRemoteAudioStateChanged(i, i2, i3, i4);
                long j = i;
                a9y a9yVar = (a9y) xc0.this.f192031S0.get(Long.valueOf(j));
                if (a9yVar == null || a9yVar.m95472e()) {
                    return;
                }
                a9yVar.m95475h(true);
                ((MediaBaseCodecFilter) xc0.this).f14269I.m131779b(a9yVar.m95470c(), j, xc0.this.f192082g3, a9yVar.m95468a(), System.currentTimeMillis() - a9yVar.m95469b());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteAudioStats(IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats) {
            ley leyVar;
            if (remoteAudioStats == null || (leyVar = (ley) xc0.this.f192027R0.get(Long.valueOf(remoteAudioStats.uid))) == null) {
                return;
            }
            leyVar.f127793a = remoteAudioStats.receivedBitrate;
            int i = leyVar.f127812t;
            int i2 = remoteAudioStats.plcCount;
            leyVar.f127812t = i + i2;
            leyVar.f127813u += remoteAudioStats.frozenRateByCustomPlcCount;
            leyVar.f127818z += remoteAudioStats.audioLossRate * 10;
            int i3 = leyVar.f127782A;
            int i4 = remoteAudioStats.networkTransportDelay;
            leyVar.f127782A = i3 + i4;
            leyVar.f127802j += remoteAudioStats.jitterBufferDelay + i4;
            leyVar.f127783B++;
            leyVar.f127787F += i2 * 10;
            leyVar.f127798f = remoteAudioStats.rxAudioBytes;
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteVideoStateChanged(int i, int i2, int i3, int i4) {
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onRemoteVideoStateChanged", "uid:" + i + ", state:" + i2 + ", reason:" + i3);
            if (i2 == 1 && i3 == 6) {
                xc0 xc0Var = xc0.this;
                xc0Var.f192053X2 = i;
                boolean zContains = xc0Var.f192097l2.contains(Integer.valueOf(i));
                xc0 xc0Var2 = xc0.this;
                if (!zContains) {
                    xc0Var2.m207968O6(i, i4);
                    return;
                }
                if (((MediaBaseCodecFilter) xc0Var2).f14269I != null) {
                    ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onRemoteVideoStateChanged remoteUid " + i + ",text");
                }
                xc0.this.m208024j8(i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteVideoStats(IRtcEngineEventHandler.RemoteVideoStats remoteVideoStats) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", " onRemoteVideoStatsstats:" + remoteVideoStats + "w " + remoteVideoStats.width + " h " + remoteVideoStats.height + " bits " + remoteVideoStats.receivedBitrate + " fps " + remoteVideoStats.rendererOutputFrameRate);
            ley leyVar = (ley) xc0.this.f192027R0.get(Long.valueOf((long) remoteVideoStats.uid));
            if (leyVar != null) {
                leyVar.m149628k(remoteVideoStats.receivedBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
                leyVar.f127805m = remoteVideoStats.packetLossRate;
                leyVar.f127797e = remoteVideoStats.rxVideoBytes;
                leyVar.f127795c += (long) remoteVideoStats.decoderOutputFrameRate;
                leyVar.f127784C++;
                leyVar.f127804l = remoteVideoStats.e2eDelay;
                int i = remoteVideoStats.totalFrozenTime;
                int i2 = leyVar.f127789H;
                if (i - i2 > 0) {
                    leyVar.f127788G += i - i2;
                }
                leyVar.f127789H = i;
            }
            xc0.this.f192021P0 = remoteVideoStats;
            if (xc0.this.f192040U1 != null) {
                xc0.this.f192066b2.f182161b = xc0.this.f192021P0.delay;
                xc0.this.f192066b2.f182163d = xc0.this.f192021P0.height;
                xc0.this.f192066b2.f182161b = xc0.this.f192021P0.delay;
                xc0.this.f192066b2.f182164e = xc0.this.f192021P0.receivedBitrate;
                xc0.this.f192066b2.f182165f = xc0.this.f192021P0.rendererOutputFrameRate;
                xc0.this.f192066b2.f182166g = xc0.this.f192021P0.rxStreamType;
                xc0.this.f192066b2.f182160a = xc0.this.f192021P0.uid;
                xc0.this.f192066b2.f182162c = xc0.this.f192021P0.width;
                xc0.this.f192040U1.mo19139a(xc0.this.f192066b2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteVideoTransportStats(int i, int i2, int i3, int i4) {
            ley leyVar;
            if (xc0.this.f192027R0 != null) {
                long j = i;
                if (!xc0.this.f192027R0.containsKey(Long.valueOf(j)) || (leyVar = (ley) xc0.this.f192027R0.get(Long.valueOf(j))) == null) {
                    return;
                }
                leyVar.f127794b = i4;
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onRtcStatsstats:" + rtcStats);
            xc0.this.f192018O0 = rtcStats;
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203784B = (long) xc0.this.f192018O0.txBytes;
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203810O = xc0.this.f192018O0.rxAudioKBitRate;
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203861j = xc0.this.f192018O0.rxBytes;
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203864k = xc0.this.f192018O0.rxVideoBytes;
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203867l = xc0.this.f192018O0.rxAudioBytes;
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203801J0 = xc0.this.f192018O0.txVideoBytes;
            ((MediaBaseCodecFilter) xc0.this).f14268H.f203799I0 = xc0.this.f192018O0.txAudioBytes;
            xc0.this.f192009L0 += (long) ((xc0.this.f192018O0.txVideoKBitRate * 1000) / 8);
            xc0.this.f192015N0 += (long) ((xc0.this.f192018O0.txAudioKBitRate * 1000) / 8);
            xc0.this.f192012M0 += (xc0.this.f192018O0.rxVideoKBitRate * 1000) / 8;
            xc0.this.f192080g1.mo128349g(4098, 0, 0, xc0.this);
            xc0.m207929z4(xc0.this);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRtmpStreamingStateChanged(String str, int i, int i2) {
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onRtmpStreamingStateChanged " + str + ",state:" + i + ",code:" + i2);
            hmx hmxVar = ((MediaBaseCodecFilter) xc0.this).f14269I;
            StringBuilder sb = new StringBuilder("");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            hmxVar.m131786k("AgoraRtmpState", sb.toString());
            if (2 == i) {
                xc0.this.f192133x1 = true;
                if (xc0.this.f192084h2 != null && xc0.this.f192084h2.getUsers().size() > 0 && xc0.this.f192038U != null) {
                    xc0.this.f192038U.updateRtmpTranscoding(xc0.this.f192084h2);
                    xc0.this.m207938D6();
                    ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onRtmpStreamingStateChanged", "rtmpState updateRtmpTranscoding");
                }
                ((MediaBaseCodecFilter) xc0.this).f14268H.f203898x = str;
                xc0.this.f192123t3 = true;
                xc0.this.f192080g1.mo128349g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, xc0.this);
            }
            if (4 == i && ((i2 == 1 || i2 == 3 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 11 || i2 == 13 || i2 == 14 || i2 == 15) && xc0.this.f192002I2 != null)) {
                xc0.this.f192002I2.mo19163p(str, i2);
            }
            if (i == 0 || 4 == i) {
                xc0.this.f192133x1 = false;
            }
            if (xc0.this.f192002I2 != null) {
                xc0.this.f192002I2.mo19164q(str, i, i2, "agora", xc0.this.f192105o1.f155325g1, xc0.this.f192105o1.f182013B0);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onStreamMessage(int i, int i2, byte[] bArr) {
            if (xc0.this.f192032S1 != null) {
                xc0.this.f192032S1.onStreamMessage(i, i2, bArr);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
            if (xc0.this.f192032S1 != null) {
                xc0.this.f192032S1.onStreamMessageError(i, i2, i3, i4, i5);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onTokenPrivilegeWillExpire(String str) {
            if (xc0.this.f192036T1 != null) {
                xc0.this.f192036T1.onTokenPrivilegeWillExpire(str);
            }
            if (xc0.this.f192032S1 != null) {
                xc0.this.f192032S1.onRequestChannelKey();
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserJoined(int i, int i2) {
            long j = i;
            a9y a9yVar = new a9y(j, j6f.LATITUDE_SOUTH.equals(xc0.this.mo20052w1()) ? 1 : 2);
            if (xc0.this.f192085h3 != -1) {
                a9yVar.m95477j(System.currentTimeMillis());
                a9yVar.m95476i(System.currentTimeMillis() - xc0.this.f192085h3);
            }
            xc0.this.f192031S0.put(Long.valueOf(j), a9yVar);
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131782e(true, a9yVar.m95470c(), j, xc0.this.f192082g3, a9yVar.m95468a());
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onUserJoined", "uid:" + i);
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + " onUserJoined:uid:" + i + ",elapsed:" + i2);
            if ((xc0.this.f192130w1 || xc0.this.f192127v1) && xc0.this.f192105o1.f155327i1 != i) {
                a9yVar.m95473f(true);
                a9yVar.m95474g(true);
                ((MediaBaseCodecFilter) xc0.this).f14269I.m131780c(true, a9yVar.m95470c(), j, xc0.this.f192082g3, a9yVar.m95468a(), -1L);
                xc0.this.f192080g1.mo128349g(8198, i, 0, xc0.this);
                xc0.this.f192098l3.post(new a(i));
            }
            xc0.this.f192027R0.put(Long.valueOf(j), new ley(j));
            if (xc0.this.f192028R1 != null) {
                xc0.this.f192028R1.onJoinChannelSuccess("", j, i2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserMuteAudio(int i, boolean z) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onUserMuteAudiouid:" + i + ",muted:" + z);
            ley leyVar = (ley) xc0.this.f192027R0.get(Long.valueOf((long) i));
            if (leyVar != null) {
                leyVar.m149624g(z);
            }
            if (xc0.this.f192028R1 != null) {
                xc0.this.f192028R1.onUserMuteAudio(i, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserMuteVideo(int i, boolean z) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onUserMuteVideouid:" + i + ",muted:" + z);
            ley leyVar = (ley) xc0.this.f192027R0.get(Long.valueOf((long) i));
            if (leyVar != null) {
                leyVar.m149625h(z);
            }
            if (xc0.this.f192028R1 != null) {
                xc0.this.f192028R1.onUserMuteVideo(i, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserOffline(int i, int i2) {
            int i3 = i2;
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "onUserOffline:uid:" + i + ",reason:" + i3);
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onUserOffline uid:" + i + ",reason:" + i3);
            long j = 0;
            if (xc0.this.f192027R0 != null) {
                long j2 = i;
                if (xc0.this.f192027R0.containsKey(Long.valueOf(j2))) {
                    ley leyVar = (ley) xc0.this.f192027R0.get(Long.valueOf(j2));
                    j = leyVar != null ? leyVar.f127796d : 0L;
                    xc0.this.f192027R0.remove(Long.valueOf(j2));
                }
            }
            long j3 = j;
            if (xc0.this.f192031S0 != null) {
                long j4 = i;
                if (xc0.this.f192031S0.containsKey(Long.valueOf(j4))) {
                    n8c.m158483a("zhengjijian", "onMemberExit userid " + i + " reason " + i3);
                    if (((MediaBaseCodecFilter) xc0.this).f14268H.f203842c1 == 1) {
                        ((MediaBaseCodecFilter) xc0.this).f14269I.m131781d(true, ((a9y) xc0.this.f192031S0.get(Long.valueOf(j4))).m95470c(), j4, i3);
                        ((MediaBaseCodecFilter) xc0.this).f14269I.m131783f(true, ((a9y) xc0.this.f192031S0.get(Long.valueOf(j4))).m95470c(), j3, 0L, j4, i2);
                        i3 = i2;
                    }
                    xc0.this.f192080g1.mo128349g(8199, i, 0, xc0.this);
                }
            }
            if (xc0.this.f192059Z0 != null && (!xc0.this.f192072d2 || xc0.this.f192130w1 || xc0.this.f192127v1)) {
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemove userID=" + i);
                if (xc0.this.f192064a3.contains(Integer.valueOf(i)) && xc0.this.f192038U != null) {
                    xc0.this.m207996Z7(i, null);
                    xc0.this.f192064a3.remove(Integer.valueOf(i));
                }
                xc0.this.f192059Z0.mo19138b(i, i3);
                ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onVideoChannelRemove uid:" + i + ",reason:" + i3);
            }
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("isUseTextureView", Boolean.valueOf(xc0.this.f192105o1.f182037Z0));
            if (xc0.this.f192105o1.f182037Z0 && xc0.this.f192038U != null && xc0.this.f192061Z2 != null && xc0.this.f192061Z2.containsKey(Integer.valueOf(i))) {
                ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("setupRemoteVideoview null");
                xc0.this.m207996Z7(i, null);
                xc0.this.f192061Z2.remove(Integer.valueOf(i));
                if (xc0.this.f192068c1 != null) {
                    xc0.this.f192068c1.mo19142b(i, i3);
                }
            }
            if (xc0.this.f192028R1 != null) {
                xc0.this.f192028R1.onUserOffline(i, i3);
            }
            if (xc0.this.f192097l2.contains(Integer.valueOf(i)) && xc0.this.f192065b1 != null) {
                ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("remoteUidList removeid" + i);
                xc0.this.f192065b1.mo19144b((long) i, i3);
                xc0.this.f192097l2.remove(i);
            }
            if (xc0.this.f192139z1 != null) {
                if (xc0.this.f192139z1.containsKey(Integer.valueOf(i)) || i == xc0.this.f192105o1.f182013B0) {
                    if (i != xc0.this.f192105o1.f182013B0) {
                        xc0.this.f192139z1.remove(Integer.valueOf(i));
                    }
                    boolean z = xc0.this.f192072d2;
                    xc0 xc0Var = xc0.this;
                    if (!z) {
                        if (xc0Var.f192065b1 != null) {
                            long j5 = i;
                            xc0.this.f192065b1.mo19144b(j5, i3);
                            xc0.this.f191989E1.setVideoSurface(j5, null);
                            return;
                        }
                        return;
                    }
                    if (xc0Var.f192062a1 != null) {
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt userID=" + i);
                        xc0.this.f192062a1.mo94621b((long) i, i3);
                    }
                }
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onVideoSizeChanged(Constants.VideoSourceType videoSourceType, int i, int i2, int i3, int i4) {
            Log.e("lqdebug", "onVideoSizeChanged uid" + i + ",width " + i2 + ", height" + i3);
            ((MediaBaseCodecFilter) xc0.this).f14269I.m131787l("onVideoSizeChanged uid:" + i + ", width:" + i2 + ", height:" + i3);
            if (xc0.this.f192002I2 == null || i == 0) {
                return;
            }
            xc0.this.f192002I2.m130814r(i, i2, i3);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioMixingFinished() {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onConnectionLost() {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRequestToken() {
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: b0 */
    public void mo19658b0() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    /* JADX INFO: renamed from: B5 */
    public void m207933B5(wmw wmwVar) {
    }

    /* JADX INFO: renamed from: E5 */
    public void m207940E5(xmw xmwVar) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo19652K1(mpd0 mpd0Var) {
    }

    /* JADX INFO: renamed from: M5 */
    public void m207963M5(anw anwVar) {
    }

    /* JADX INFO: renamed from: Z5 */
    public void m207994Z5(boolean z) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: m1 */
    public void mo19665m1(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: v7 */
    public void m208046v7(String str) {
    }

    /* JADX INFO: renamed from: w7 */
    public void m208048w7(String str) {
    }

    /* JADX INFO: renamed from: C7 */
    public void m207936C7(boolean z, int i) {
    }

    /* JADX INFO: renamed from: i6 */
    public void m208019i6(long j, boolean z) {
    }

    /* JADX INFO: renamed from: y7 */
    public void m208052y7(boolean z, boolean z2) {
    }

    @RequiresApi(api = 15)
    public xc0(Context context, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar) {
        super(context);
        this.f192030S = "Pipeline_Normal_pip->PIPLINE->AGORA";
        this.f192034T = true;
        this.f192042V = -1;
        this.f192050X = false;
        this.f192054Y = false;
        this.f192058Z = false;
        this.f192092k0 = 2;
        this.f192108p0 = 3;
        this.f191988E0 = -1;
        this.f191991F0 = -1;
        this.f191994G0 = false;
        this.f191997H0 = true;
        this.f192000I0 = null;
        this.f192009L0 = 0L;
        this.f192012M0 = 0;
        this.f192015N0 = 0L;
        this.f192027R0 = new PipelineConcurrentHashMap<>();
        this.f192031S0 = new PipelineConcurrentHashMap<>();
        this.f192035T0 = false;
        this.f192039U0 = true;
        this.f192043V0 = 0;
        this.f192047W0 = 0;
        this.f192051X0 = 0;
        this.f192055Y0 = null;
        this.f192059Z0 = null;
        this.f192062a1 = null;
        this.f192065b1 = null;
        this.f192068c1 = null;
        this.f192074e1 = false;
        this.f192077f1 = false;
        this.f192083h1 = 1.0f;
        this.f192086i1 = 1.0f;
        this.f192089j1 = 44100;
        this.f192093k1 = 0;
        this.f192096l1 = 0;
        this.f192099m1 = 0;
        this.f192102n1 = 0;
        this.f192109p1 = -1;
        this.f192115r1 = null;
        this.f192118s1 = 1;
        this.f192121t1 = new Object();
        this.f192124u1 = 0;
        this.f192127v1 = false;
        this.f192130w1 = false;
        this.f192133x1 = false;
        this.f192136y1 = new Object();
        this.f192139z1 = new PipelineConcurrentHashMap();
        this.f191977A1 = false;
        this.f191986D1 = null;
        this.f191989E1 = null;
        this.f191995G1 = 0;
        this.f191998H1 = 2;
        this.f192001I1 = DetectDelayStopHelper.TYPE_DETECT_PICKNOISE;
        this.f192004J1 = 0;
        this.f192007K1 = "";
        this.f192010L1 = false;
        this.f192016N1 = null;
        this.f192019O1 = null;
        this.f192056Y1 = new zmw();
        this.f192060Z1 = new zmw();
        this.f192063a2 = new jjw();
        this.f192066b2 = new vmw();
        this.f192072d2 = false;
        this.f192075e2 = false;
        this.f192078f2 = true;
        this.f192081g2 = false;
        this.f192084h2 = null;
        this.f192087i2 = false;
        this.f192094k2 = 0L;
        this.f192097l2 = new ArrayList<>(20);
        this.f192100m2 = 0;
        this.f192103n2 = 1;
        this.f192106o2 = 2;
        this.f192110p2 = 3;
        this.f192113q2 = 4;
        this.f192116r2 = 5;
        this.f192119s2 = 6;
        this.f192122t2 = 7;
        this.f192125u2 = 8;
        this.f192128v2 = null;
        this.f192131w2 = 0;
        this.f192134x2 = 1;
        this.f192137y2 = 2;
        this.f192140z2 = 3;
        this.f191978A2 = 0;
        this.f191981B2 = 1;
        this.f191984C2 = 2;
        this.f191987D2 = false;
        this.f191990E2 = Long.MIN_VALUE;
        this.f191993F2 = 1000L;
        this.f191996G2 = null;
        this.f192005J2 = 1;
        this.f192008K2 = System.currentTimeMillis();
        this.f192011L2 = null;
        this.f192014M2 = false;
        this.f192017N2 = 0.0f;
        this.f192020O2 = 0.0f;
        this.f192023P2 = 0.0f;
        this.f192026Q2 = 0.0f;
        this.f192029R2 = 0;
        this.f192033S2 = 0;
        this.f192037T2 = 0;
        this.f192041U2 = 0;
        this.f192045V2 = true;
        this.f192049W2 = false;
        this.f192053X2 = 0;
        this.f192057Y2 = false;
        this.f192061Z2 = new PipelineConcurrentHashMap();
        this.f192064a3 = new ArrayList<>(20);
        this.f192067b3 = "";
        this.f192070c3 = false;
        this.f192073d3 = 0;
        this.f192076e3 = false;
        this.f192079f3 = false;
        this.f192082g3 = -1L;
        this.f192085h3 = -1L;
        this.f192088i3 = 0;
        this.f192091j3 = 0;
        this.f192095k3 = 0;
        this.f192098l3 = new Handler(Looper.getMainLooper());
        this.f192101m3 = false;
        this.f192104n3 = false;
        this.f192107o3 = 0;
        this.f192111p3 = 0;
        this.f192114q3 = 0;
        this.f192117r3 = "";
        this.f192120s3 = false;
        this.f192123t3 = false;
        this.f192126u3 = 0L;
        this.f192129v3 = false;
        this.f192132w3 = false;
        this.f192135x3 = 0;
        this.f192138y3 = 0;
        this.f192141z3 = false;
        this.f191979A3 = false;
        this.f191985C3 = false;
        this.f192003J0 = yw00Var;
        this.f192105o1 = (qmr) vlwVar;
        this.f192035T0 = false;
        this.f192039U0 = true;
        this.f192080g1 = interfaceC17392a;
        this.f191989E1 = new CongressUtil();
        m207860h6(vlwVar);
        zmx zmxVar = this.f14268H;
        zmxVar.f203843d = 258L;
        zmxVar.f203848e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }

    /* JADX INFO: renamed from: l.xc0$j */
    public class SurfaceHolderCallbackC21079j implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f192163a;

        public SurfaceHolderCallbackC21079j(int i) {
            this.f192163a = i;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            xc0.this.f191989E1.setVideoSurface(this.f192163a, surfaceHolder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            xc0.this.f191989E1.setVideoSurface(this.f192163a, null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }
    }
}
