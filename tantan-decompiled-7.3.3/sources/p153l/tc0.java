package p153l;

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
public class tc0 extends MediaBaseCodecFilter implements IAudioFrameObserver, dpl, wyl, o410.InterfaceC19026f {

    /* JADX INFO: renamed from: D3 */
    private static final float[] f173006D3 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A1 */
    private volatile boolean f173007A1;

    /* JADX INFO: renamed from: A2 */
    public final int f173008A2;

    /* JADX INFO: renamed from: A3 */
    private boolean f173009A3;

    /* JADX INFO: renamed from: B1 */
    private String f173010B1;

    /* JADX INFO: renamed from: B2 */
    public final int f173011B2;

    /* JADX INFO: renamed from: B3 */
    private MRtcPusherHandler f173012B3;

    /* JADX INFO: renamed from: C1 */
    private String f173013C1;

    /* JADX INFO: renamed from: C2 */
    public final int f173014C2;

    /* JADX INFO: renamed from: C3 */
    private boolean f173015C3;

    /* JADX INFO: renamed from: D1 */
    public SurfaceTexture f173016D1;

    /* JADX INFO: renamed from: D2 */
    private boolean f173017D2;

    /* JADX INFO: renamed from: E0 */
    private int f173018E0;

    /* JADX INFO: renamed from: E1 */
    private CongressUtil f173019E1;

    /* JADX INFO: renamed from: E2 */
    private long f173020E2;

    /* JADX INFO: renamed from: F0 */
    private int f173021F0;

    /* JADX INFO: renamed from: F1 */
    private pcmDataAvailableCallback f173022F1;

    /* JADX INFO: renamed from: F2 */
    private long f173023F2;

    /* JADX INFO: renamed from: G0 */
    private boolean f173024G0;

    /* JADX INFO: renamed from: G1 */
    private int f173025G1;

    /* JADX INFO: renamed from: G2 */
    MRtcReceiveSeiHandler f173026G2;

    /* JADX INFO: renamed from: H0 */
    private boolean f173027H0;

    /* JADX INFO: renamed from: H1 */
    private int f173028H1;

    /* JADX INFO: renamed from: H2 */
    private MRtcExitRoomHandler f173029H2;

    /* JADX INFO: renamed from: I0 */
    private String f173030I0;

    /* JADX INFO: renamed from: I1 */
    private int f173031I1;

    /* JADX INFO: renamed from: I2 */
    private kod0 f173032I2;

    /* JADX INFO: renamed from: J0 */
    private g510 f173033J0;

    /* JADX INFO: renamed from: J1 */
    private int f173034J1;

    /* JADX INFO: renamed from: J2 */
    private int f173035J2;

    /* JADX INFO: renamed from: K0 */
    private dc1 f173036K0;

    /* JADX INFO: renamed from: K1 */
    private String f173037K1;

    /* JADX INFO: renamed from: K2 */
    private long f173038K2;

    /* JADX INFO: renamed from: L0 */
    private long f173039L0;

    /* JADX INFO: renamed from: L1 */
    private boolean f173040L1;

    /* JADX INFO: renamed from: L2 */
    private Runnable f173041L2;

    /* JADX INFO: renamed from: M0 */
    private int f173042M0;

    /* JADX INFO: renamed from: M1 */
    IRtcEngineEventHandler f173043M1;

    /* JADX INFO: renamed from: M2 */
    private boolean f173044M2;

    /* JADX INFO: renamed from: N0 */
    private long f173045N0;

    /* JADX INFO: renamed from: N1 */
    Runnable f173046N1;

    /* JADX INFO: renamed from: N2 */
    private float f173047N2;

    /* JADX INFO: renamed from: O0 */
    private IRtcEngineEventHandler.RtcStats f173048O0;

    /* JADX INFO: renamed from: O1 */
    private IRtcEngineEventHandler.AudioVolumeInfo[] f173049O1;

    /* JADX INFO: renamed from: O2 */
    private float f173050O2;

    /* JADX INFO: renamed from: P0 */
    private IRtcEngineEventHandler.RemoteVideoStats f173051P0;

    /* JADX INFO: renamed from: P1 */
    private MRtcAudioHandler f173052P1;

    /* JADX INFO: renamed from: P2 */
    private float f173053P2;

    /* JADX INFO: renamed from: Q0 */
    private IRtcEngineEventHandler.LocalVideoStats f173054Q0;

    /* JADX INFO: renamed from: Q1 */
    private MRtcAudioHandlerEx f173055Q1;

    /* JADX INFO: renamed from: Q2 */
    private float f173056Q2;

    /* JADX INFO: renamed from: R0 */
    private PipelineConcurrentHashMap<Long, iny> f173057R0;

    /* JADX INFO: renamed from: R1 */
    private MRtcEventHandler f173058R1;

    /* JADX INFO: renamed from: R2 */
    private int f173059R2;

    /* JADX INFO: renamed from: S */
    private final String f173060S;

    /* JADX INFO: renamed from: S0 */
    private PipelineConcurrentHashMap<Long, xhy> f173061S0;

    /* JADX INFO: renamed from: S1 */
    private MRtcChannelHandler f173062S1;

    /* JADX INFO: renamed from: S2 */
    private int f173063S2;

    /* JADX INFO: renamed from: T */
    private boolean f173064T;

    /* JADX INFO: renamed from: T0 */
    private boolean f173065T0;

    /* JADX INFO: renamed from: T1 */
    private MRtcTokenWillExpireHander f173066T1;

    /* JADX INFO: renamed from: T2 */
    private int f173067T2;

    /* JADX INFO: renamed from: U */
    private RtcEngine f173068U;

    /* JADX INFO: renamed from: U0 */
    private boolean f173069U0;

    /* JADX INFO: renamed from: U1 */
    private wpw f173070U1;

    /* JADX INFO: renamed from: U2 */
    private int f173071U2;

    /* JADX INFO: renamed from: V */
    private int f173072V;

    /* JADX INFO: renamed from: V0 */
    private int f173073V0;

    /* JADX INFO: renamed from: V1 */
    private MRtcQualityHandler f173074V1;

    /* JADX INFO: renamed from: V2 */
    private boolean f173075V2;

    /* JADX INFO: renamed from: W */
    private EGLContext f173076W;

    /* JADX INFO: renamed from: W0 */
    private int f173077W0;

    /* JADX INFO: renamed from: W1 */
    private MRtcConnectHandler f173078W1;

    /* JADX INFO: renamed from: W2 */
    private boolean f173079W2;

    /* JADX INFO: renamed from: X */
    private volatile boolean f173080X;

    /* JADX INFO: renamed from: X0 */
    private volatile int f173081X0;

    /* JADX INFO: renamed from: X1 */
    private MRtcClientRoleChangedHandler f173082X1;

    /* JADX INFO: renamed from: X2 */
    public int f173083X2;

    /* JADX INFO: renamed from: Y */
    private boolean f173084Y;

    /* JADX INFO: renamed from: Y0 */
    private String f173085Y0;

    /* JADX INFO: renamed from: Y1 */
    private xpw f173086Y1;

    /* JADX INFO: renamed from: Y2 */
    private boolean f173087Y2;

    /* JADX INFO: renamed from: Z */
    private boolean f173088Z;

    /* JADX INFO: renamed from: Z0 */
    private ebl0 f173089Z0;

    /* JADX INFO: renamed from: Z1 */
    private xpw f173090Z1;

    /* JADX INFO: renamed from: Z2 */
    private PipelineConcurrentHashMap f173091Z2;

    /* JADX INFO: renamed from: a1 */
    private fbl0 f173092a1;

    /* JADX INFO: renamed from: a2 */
    private imw f173093a2;

    /* JADX INFO: renamed from: a3 */
    private ArrayList<Integer> f173094a3;

    /* JADX INFO: renamed from: b1 */
    private gkl0 f173095b1;

    /* JADX INFO: renamed from: b2 */
    private tpw f173096b2;

    /* JADX INFO: renamed from: b3 */
    private String f173097b3;

    /* JADX INFO: renamed from: c1 */
    private gbl0 f173098c1;

    /* JADX INFO: renamed from: c2 */
    private C20287l f173099c2;

    /* JADX INFO: renamed from: c3 */
    private boolean f173100c3;

    /* JADX INFO: renamed from: d1 */
    private dpl.InterfaceC16599a f173101d1;

    /* JADX INFO: renamed from: d2 */
    private boolean f173102d2;

    /* JADX INFO: renamed from: d3 */
    private int f173103d3;

    /* JADX INFO: renamed from: e1 */
    private boolean f173104e1;

    /* JADX INFO: renamed from: e2 */
    private boolean f173105e2;

    /* JADX INFO: renamed from: e3 */
    private boolean f173106e3;

    /* JADX INFO: renamed from: f1 */
    private boolean f173107f1;

    /* JADX INFO: renamed from: f2 */
    private boolean f173108f2;

    /* JADX INFO: renamed from: f3 */
    private boolean f173109f3;

    /* JADX INFO: renamed from: g1 */
    private q210.InterfaceC19500a f173110g1;

    /* JADX INFO: renamed from: g2 */
    private boolean f173111g2;

    /* JADX INFO: renamed from: g3 */
    private long f173112g3;

    /* JADX INFO: renamed from: h1 */
    private float f173113h1;

    /* JADX INFO: renamed from: h2 */
    private LiveTranscoding f173114h2;

    /* JADX INFO: renamed from: h3 */
    private long f173115h3;

    /* JADX INFO: renamed from: i1 */
    private float f173116i1;

    /* JADX INFO: renamed from: i2 */
    private boolean f173117i2;

    /* JADX INFO: renamed from: i3 */
    private int f173118i3;

    /* JADX INFO: renamed from: j1 */
    public int f173119j1;

    /* JADX INFO: renamed from: j2 */
    private String f173120j2;

    /* JADX INFO: renamed from: j3 */
    private int f173121j3;

    /* JADX INFO: renamed from: k0 */
    private int f173122k0;

    /* JADX INFO: renamed from: k1 */
    private int f173123k1;

    /* JADX INFO: renamed from: k2 */
    private long f173124k2;

    /* JADX INFO: renamed from: k3 */
    private int f173125k3;

    /* JADX INFO: renamed from: l1 */
    private int f173126l1;

    /* JADX INFO: renamed from: l2 */
    private ArrayList<Integer> f173127l2;

    /* JADX INFO: renamed from: l3 */
    private Handler f173128l3;

    /* JADX INFO: renamed from: m1 */
    private int f173129m1;

    /* JADX INFO: renamed from: m2 */
    public final int f173130m2;

    /* JADX INFO: renamed from: m3 */
    private boolean f173131m3;

    /* JADX INFO: renamed from: n1 */
    private int f173132n1;

    /* JADX INFO: renamed from: n2 */
    public final int f173133n2;

    /* JADX INFO: renamed from: n3 */
    private boolean f173134n3;

    /* JADX INFO: renamed from: o1 */
    private ror f173135o1;

    /* JADX INFO: renamed from: o2 */
    public final int f173136o2;

    /* JADX INFO: renamed from: o3 */
    private int f173137o3;

    /* JADX INFO: renamed from: p0 */
    private int f173138p0;

    /* JADX INFO: renamed from: p1 */
    protected int f173139p1;

    /* JADX INFO: renamed from: p2 */
    public final int f173140p2;

    /* JADX INFO: renamed from: p3 */
    private int f173141p3;

    /* JADX INFO: renamed from: q1 */
    private boolean f173142q1;

    /* JADX INFO: renamed from: q2 */
    public final int f173143q2;

    /* JADX INFO: renamed from: q3 */
    private int f173144q3;

    /* JADX INFO: renamed from: r1 */
    private String f173145r1;

    /* JADX INFO: renamed from: r2 */
    public final int f173146r2;

    /* JADX INFO: renamed from: r3 */
    private String f173147r3;

    /* JADX INFO: renamed from: s1 */
    private int f173148s1;

    /* JADX INFO: renamed from: s2 */
    public final int f173149s2;

    /* JADX INFO: renamed from: s3 */
    private volatile boolean f173150s3;

    /* JADX INFO: renamed from: t1 */
    private Object f173151t1;

    /* JADX INFO: renamed from: t2 */
    private final int f173152t2;

    /* JADX INFO: renamed from: t3 */
    private boolean f173153t3;

    /* JADX INFO: renamed from: u1 */
    private int f173154u1;

    /* JADX INFO: renamed from: u2 */
    private final int f173155u2;

    /* JADX INFO: renamed from: u3 */
    private long f173156u3;

    /* JADX INFO: renamed from: v1 */
    private boolean f173157v1;

    /* JADX INFO: renamed from: v2 */
    private MRtcRealLayoutNotifyHander f173158v2;

    /* JADX INFO: renamed from: v3 */
    private boolean f173159v3;

    /* JADX INFO: renamed from: w1 */
    private boolean f173160w1;

    /* JADX INFO: renamed from: w2 */
    public final int f173161w2;

    /* JADX INFO: renamed from: w3 */
    private boolean f173162w3;

    /* JADX INFO: renamed from: x1 */
    private boolean f173163x1;

    /* JADX INFO: renamed from: x2 */
    public final int f173164x2;

    /* JADX INFO: renamed from: x3 */
    private int f173165x3;

    /* JADX INFO: renamed from: y1 */
    private Object f173166y1;

    /* JADX INFO: renamed from: y2 */
    public final int f173167y2;

    /* JADX INFO: renamed from: y3 */
    private int f173168y3;

    /* JADX INFO: renamed from: z1 */
    private PipelineConcurrentHashMap f173169z1;

    /* JADX INFO: renamed from: z2 */
    public final int f173170z2;

    /* JADX INFO: renamed from: z3 */
    private volatile boolean f173171z3;

    /* JADX INFO: renamed from: l.tc0$a */
    public class RunnableC20276a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f173172a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f173173b;

        public RunnableC20276a(int i, View view) {
            this.f173172a = i;
            this.f173173b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("clear_view setupRemoteVideo", this.f173172a + ",view is " + this.f173173b);
            if (tc0.this.f173068U != null) {
                tc0.this.f173068U.setupRemoteVideo(new VideoCanvas(this.f173173b, 1, this.f173172a));
            }
        }
    }

    /* JADX INFO: renamed from: l.tc0$b */
    public class C20277b implements gkl0.InterfaceC17239b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f173175a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f173176b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f173177c;

        public C20277b(int i, int i2, int i3) {
            this.f173175a = i;
            this.f173176b = i2;
            this.f173177c = i3;
        }

        @Override // p153l.gkl0.InterfaceC17239b
        /* JADX INFO: renamed from: a */
        public void mo130586a(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(this.f173175a, this.f173176b);
            tc0.this.f173019E1.setVideoSurface(this.f173177c, new Surface(surfaceTexture));
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onSurfaceTextureReady surfaceTexture:" + surfaceTexture);
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE->AGORA", "onSurfaceTextureReady: uid=" + this.f173177c + ", size=" + this.f173175a + BaseSei.f14624X + this.f173176b);
        }
    }

    /* JADX INFO: renamed from: l.tc0$c */
    public class RunnableC20278c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ byte[] f173179a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ byte[] f173180b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f173181c;

        public RunnableC20278c(byte[] bArr, byte[] bArr2, long j) {
            this.f173179a = bArr;
            this.f173180b = bArr2;
            this.f173181c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            tc0.this.f173158v2.OnRealLayoutChange(this.f173179a, this.f173180b, 1, this.f173181c);
        }
    }

    /* JADX INFO: renamed from: l.tc0$f */
    public class RunnableC20281f implements Runnable {
        public RunnableC20281f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (tc0.this.f173110g1 != null) {
                tc0.this.f173110g1.mo165950g(4353, 10, 0, tc0.this);
            }
            if (tc0.this.f173058R1 != null) {
                tc0.this.f173058R1.onConnectionLost();
            }
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191117y0 = 812L;
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191081k0 = Constants.RHYTHM_PLAYER_STATE_DECODING;
            tc0.this.f173121j3 = 1;
            tc0.this.m20735e2(4353, 10);
            if (((MediaBaseCodecFilter) tc0.this).f14988I != null) {
                ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("configConnectLost", "errorcode 812");
            }
            tc0.this.mo20661f();
        }
    }

    /* JADX INFO: renamed from: l.tc0$g */
    public class C20282g implements IMetadataObserver {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f173188a;

        public C20282g(long j) {
            this.f173188a = j;
        }

        @Override // io.agora.rtc2.IMetadataObserver
        public int getMaxMetadataSize() {
            if (!tc0.this.f173075V2) {
                return 0;
            }
            boolean z = tc0.this.f173100c3;
            tc0 tc0Var = tc0.this;
            if (z) {
                if (TextUtils.isEmpty(tc0Var.f173097b3)) {
                    return 1024;
                }
                tc0.this.f173097b3.getClass();
                return 1024;
            }
            String str = tc0Var.f173010B1;
            tc0 tc0Var2 = tc0.this;
            if (str != null) {
                int length = tc0Var2.m190266v6(tc0Var2.f173010B1).getBytes().length;
                return 1024;
            }
            if (tc0Var2.f173013C1 == null) {
                return 1024;
            }
            int length2 = tc0.this.f173013C1.getBytes().length;
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
                    ((MediaBaseCodecFilter) tc0.this).f14987H.f191104s = iOptInt;
                    esx.m122399d("Pipeline_Normal_pip->PIPLINE->AGORA", "onReceiveSEI getbType: " + iOptInt);
                }
                if (jSONObject.has(com.tencent.connect.common.Constants.f58037TS)) {
                    long jM112304X = csx.m112235R().m112304X() - Long.valueOf(jSONObject.optString(com.tencent.connect.common.Constants.f58037TS)).longValue();
                    iny inyVar = (iny) tc0.this.f173057R0.get(Long.valueOf(this.f173188a));
                    if (inyVar != null) {
                        inyVar.f116016E++;
                        inyVar.f116015D = (int) (((long) inyVar.f116015D) + jM112304X);
                    }
                }
            } catch (Exception e) {
                ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onMetadataReceived error", "" + e.toString());
            }
            tc0 tc0Var = tc0.this;
            if (tc0Var.f173026G2 == null || tc0Var.f173135o1 == null) {
                return;
            }
            tc0 tc0Var2 = tc0.this;
            tc0Var2.f173026G2.OnReceiveH264Sei(agoraMetadata.data, tc0Var2.f173135o1.f180157B0, "");
        }

        @Override // io.agora.rtc2.IMetadataObserver
        public byte[] onReadyToSendMetadata(long j, int i) {
            if (tc0.this.f173020E2 == Long.MIN_VALUE) {
                tc0.this.f173020E2 = System.currentTimeMillis();
            }
            byte[] bytes = null;
            if (tc0.this.f173075V2 && System.currentTimeMillis() - tc0.this.f173020E2 > tc0.this.f173023F2) {
                boolean z = tc0.this.f173159v3;
                tc0 tc0Var = tc0.this;
                if (z) {
                    try {
                        JSONObject jSONObject = new JSONObject("" + tc0Var.f173010B1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("asr", 44100);
                        int i2 = tc0.this.f173114h2.audioBitrate;
                        if (i2 < 1000) {
                            i2 *= 1000;
                        }
                        jSONObject2.put("abr", i2);
                        jSONObject2.put("achl", tc0.this.f173114h2.audioChannels);
                        jSONObject2.put("acpf", LiveTranscoding.AudioCodecProfileType.getValue(tc0.this.f173114h2.audioCodecProfile));
                        jSONObject2.put("w", ((MediaBaseCodecFilter) tc0.this).f15000s.f175490k);
                        jSONObject2.put("h", ((MediaBaseCodecFilter) tc0.this).f15000s.f175492l);
                        jSONObject2.put("gop", ((MediaBaseCodecFilter) tc0.this).f15000s.f175450G);
                        jSONObject2.put("fps", ((MediaBaseCodecFilter) tc0.this).f15000s.f175449F);
                        jSONObject2.put("vbr", ((MediaBaseCodecFilter) tc0.this).f15000s.f175451H);
                        jSONObject2.put("vcpf", ((MediaBaseCodecFilter) tc0.this).f15000s.f180163H0 ? 2 : 1);
                        jSONObject.put("mixInfo", jSONObject2);
                        bytes = jSONObject.toString().getBytes();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    boolean z2 = tc0Var.f173100c3;
                    tc0 tc0Var2 = tc0.this;
                    if (!z2) {
                        String str = tc0Var2.f173010B1;
                        tc0 tc0Var3 = tc0.this;
                        if (str != null) {
                            bytes = tc0Var3.m190266v6(tc0Var3.f173010B1).getBytes();
                        } else if (tc0Var3.f173013C1 != null) {
                            bytes = tc0.this.f173013C1.getBytes();
                        }
                    } else if (!TextUtils.isEmpty(tc0Var2.f173097b3)) {
                        bytes = tc0.this.f173097b3.getBytes();
                    }
                }
                tc0.this.f173020E2 = System.currentTimeMillis();
            }
            return bytes;
        }
    }

    /* JADX INFO: renamed from: l.tc0$h */
    public class RunnableC20283h implements Runnable {
        public RunnableC20283h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            tc0.this.mo20661f();
        }
    }

    /* JADX INFO: renamed from: l.tc0$i */
    public class RunnableC20284i implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f173191a;

        public RunnableC20284i(int i) {
            this.f173191a = i;
        }

        @Override // java.lang.Runnable
        @RequiresApi(api = 15)
        public void run() {
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("old handleVideoRenderStart");
            tc0.this.m190282z6(this.f173191a);
        }
    }

    /* JADX INFO: renamed from: l.tc0$k */
    public class C20286k implements gkl0.InterfaceC17240c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f173195a;

        public C20286k(int i) {
            this.f173195a = i;
        }

        @Override // p153l.gkl0.InterfaceC17240c
        /* JADX INFO: renamed from: a */
        public void mo21063a(SurfaceTexture surfaceTexture) {
            surfaceTexture.setDefaultBufferSize(tc0.this.width, tc0.this.height);
            tc0.this.f173019E1.setVideoSurface(this.f173195a, new Surface(surfaceTexture));
        }
    }

    /* JADX INFO: renamed from: l.tc0$l */
    public class C20287l extends Thread {

        /* JADX INFO: renamed from: a */
        private boolean f173197a;

        public C20287l(String str) {
            super(str);
            this.f173197a = false;
        }

        /* JADX INFO: renamed from: a */
        public void m190407a() {
            this.f173197a = true;
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "SoftCodecThread quit");
            try {
                join();
            } catch (InterruptedException unused) {
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && !this.f173197a) {
                try {
                    Thread.sleep(66L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (pwk.f154413f == null) {
                    pwk.f154413f = new byte[((tc0.this.f173135o1.f175494m * tc0.this.f173135o1.f175496n) * 3) / 2];
                }
                tc0.this.mo20666o1(ByteBuffer.wrap(pwk.f154413f));
            }
        }
    }

    public tc0(Context context, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar, String str) {
        super(context);
        this.f173060S = "Pipeline_Normal_pip->PIPLINE->AGORA";
        this.f173064T = true;
        this.f173072V = -1;
        this.f173080X = false;
        this.f173084Y = false;
        this.f173088Z = false;
        this.f173122k0 = 2;
        this.f173138p0 = 3;
        this.f173018E0 = -1;
        this.f173021F0 = -1;
        this.f173024G0 = false;
        this.f173027H0 = true;
        this.f173030I0 = null;
        this.f173039L0 = 0L;
        this.f173042M0 = 0;
        this.f173045N0 = 0L;
        this.f173057R0 = new PipelineConcurrentHashMap<>();
        this.f173061S0 = new PipelineConcurrentHashMap<>();
        this.f173065T0 = false;
        this.f173069U0 = true;
        this.f173073V0 = 0;
        this.f173077W0 = 0;
        this.f173081X0 = 0;
        this.f173085Y0 = null;
        this.f173089Z0 = null;
        this.f173092a1 = null;
        this.f173095b1 = null;
        this.f173098c1 = null;
        this.f173104e1 = false;
        this.f173107f1 = false;
        this.f173113h1 = 1.0f;
        this.f173116i1 = 1.0f;
        this.f173119j1 = 44100;
        this.f173123k1 = 0;
        this.f173126l1 = 0;
        this.f173129m1 = 0;
        this.f173132n1 = 0;
        this.f173139p1 = -1;
        this.f173145r1 = null;
        this.f173148s1 = 1;
        this.f173151t1 = new Object();
        this.f173154u1 = 0;
        this.f173157v1 = false;
        this.f173160w1 = false;
        this.f173163x1 = false;
        this.f173166y1 = new Object();
        this.f173169z1 = new PipelineConcurrentHashMap();
        this.f173007A1 = false;
        this.f173016D1 = null;
        this.f173019E1 = null;
        this.f173025G1 = 0;
        this.f173028H1 = 2;
        this.f173031I1 = DetectDelayStopHelper.TYPE_DETECT_PICKNOISE;
        this.f173034J1 = 0;
        this.f173037K1 = "";
        this.f173040L1 = false;
        this.f173046N1 = null;
        this.f173049O1 = null;
        this.f173086Y1 = new xpw();
        this.f173090Z1 = new xpw();
        this.f173093a2 = new imw();
        this.f173096b2 = new tpw();
        this.f173102d2 = false;
        this.f173105e2 = false;
        this.f173108f2 = true;
        this.f173111g2 = false;
        this.f173114h2 = null;
        this.f173117i2 = false;
        this.f173124k2 = 0L;
        this.f173127l2 = new ArrayList<>(20);
        this.f173130m2 = 0;
        this.f173133n2 = 1;
        this.f173136o2 = 2;
        this.f173140p2 = 3;
        this.f173143q2 = 4;
        this.f173146r2 = 5;
        this.f173149s2 = 6;
        this.f173152t2 = 7;
        this.f173155u2 = 8;
        this.f173158v2 = null;
        this.f173161w2 = 0;
        this.f173164x2 = 1;
        this.f173167y2 = 2;
        this.f173170z2 = 3;
        this.f173008A2 = 0;
        this.f173011B2 = 1;
        this.f173014C2 = 2;
        this.f173017D2 = false;
        this.f173020E2 = Long.MIN_VALUE;
        this.f173023F2 = 1000L;
        this.f173026G2 = null;
        this.f173035J2 = 1;
        this.f173038K2 = System.currentTimeMillis();
        this.f173041L2 = null;
        this.f173044M2 = false;
        this.f173047N2 = 0.0f;
        this.f173050O2 = 0.0f;
        this.f173053P2 = 0.0f;
        this.f173056Q2 = 0.0f;
        this.f173059R2 = 0;
        this.f173063S2 = 0;
        this.f173067T2 = 0;
        this.f173071U2 = 0;
        this.f173075V2 = true;
        this.f173079W2 = false;
        this.f173083X2 = 0;
        this.f173087Y2 = false;
        this.f173091Z2 = new PipelineConcurrentHashMap();
        this.f173094a3 = new ArrayList<>(20);
        this.f173097b3 = "";
        this.f173100c3 = false;
        this.f173103d3 = 0;
        this.f173106e3 = false;
        this.f173109f3 = false;
        this.f173112g3 = -1L;
        this.f173115h3 = -1L;
        this.f173118i3 = 0;
        this.f173121j3 = 0;
        this.f173125k3 = 0;
        this.f173128l3 = new Handler(Looper.getMainLooper());
        this.f173131m3 = false;
        this.f173134n3 = false;
        this.f173137o3 = 0;
        this.f173141p3 = 0;
        this.f173144q3 = 0;
        this.f173147r3 = "";
        this.f173150s3 = false;
        this.f173153t3 = false;
        this.f173156u3 = 0L;
        this.f173159v3 = false;
        this.f173162w3 = false;
        this.f173165x3 = 0;
        this.f173168y3 = 0;
        this.f173171z3 = false;
        this.f173009A3 = false;
        this.f173015C3 = false;
        this.f173085Y0 = str;
        this.f173033J0 = g510Var;
        this.f173135o1 = (ror) uowVar;
        this.f173065T0 = false;
        this.f173069U0 = true;
        this.f173110g1 = interfaceC19500a;
        this.f173019E1 = new CongressUtil();
        m190212h6(uowVar);
        wvx wvxVar = this.f14987H;
        wvxVar.f191059d = 258L;
        wvxVar.f191064e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }

    /* JADX INFO: renamed from: A6 */
    private int m190100A6() {
        int i = 0;
        if (!this.f173160w1 && !this.f173131m3) {
            i = 1;
        }
        return i ^ 1;
    }

    /* JADX INFO: renamed from: B6 */
    private final void m190104B6(String str, int i) {
        tc0 tc0Var;
        if (this.f173068U != null) {
            this.f14988I.m122843l("mmLiveAudioProfile:" + this.f173018E0 + ",mmLiveAudioScenario:" + this.f173021F0 + ",getAudioProfile() = " + csx.m112235R().m112384t() + ",getAudioScenario()=" + csx.m112235R().m112387u());
            int i2 = this.f173018E0;
            if (i2 != -1) {
                this.f173122k0 = m190374j6(i2);
                this.f14987H.f191093o0 = this.f173018E0;
            } else {
                int iM112384t = csx.m112235R().m112384t();
                wvx wvxVar = this.f14987H;
                if (iM112384t != -1) {
                    wvxVar.f191093o0 = iM112384t;
                    this.f173122k0 = m190374j6(iM112384t);
                } else {
                    wvxVar.f191093o0 = 1;
                    this.f173122k0 = m190374j6(1);
                }
            }
            int i3 = this.f173021F0;
            if (i3 != -1) {
                this.f173138p0 = m190379l6(i3);
                this.f14987H.f191096p0 = this.f173021F0;
            } else {
                int iM112387u = csx.m112235R().m112387u();
                if (iM112387u != -1) {
                    this.f173138p0 = m190379l6(iM112387u);
                    this.f14987H.f191096p0 = iM112387u;
                } else {
                    this.f173138p0 = m190379l6(0);
                    this.f14987H.f191096p0 = 0;
                }
            }
            m190366g6(this.f173122k0, this.f173138p0);
            m190360e6(this.f173027H0);
            this.f173104e1 = false;
            this.f173068U.registerAudioFrameObserver(null);
            if (this.f173157v1 || this.f173102d2 || this.f173105e2 || this.f173101d1 != null) {
                this.f14988I.m122843l("registerAudioFrameObserver 2458");
                this.f173068U.registerAudioFrameObserver(this);
                this.f173104e1 = true;
            }
            if (this.f173142q1) {
                m190108C6("1");
            }
            m190152P7();
            RtcEngine rtcEngine = this.f173068U;
            if (rtcEngine != null && this.f173108f2) {
                rtcEngine.setDefaultAudioRoutetoSpeakerphone(true);
            }
            int i4 = this.f173034J1;
            if (i4 <= 0 && (i4 = this.f173135o1.f180174S0) == 0) {
                i4 = 15;
            }
            int i5 = i4;
            ror rorVar = this.f173135o1;
            int i6 = rorVar.f175490k;
            if (i6 > 0) {
                tc0Var = this;
                tc0Var.m190177W5(rorVar.f164227h1, i6, rorVar.f175492l, this.f173031I1, i5, rorVar.f180187v0);
            } else {
                tc0Var = this;
                tc0Var.m190177W5(rorVar.f164227h1, rorVar.f175506s, rorVar.f175508t, tc0Var.f173031I1, i5, rorVar.f180187v0);
            }
            RtcEngine rtcEngine2 = tc0Var.f173068U;
            if (rtcEngine2 != null) {
                rtcEngine2.setRemoteSubscribeFallbackOption(0);
            }
            tc0Var.f173035J2 = csx.m112235R().m112369o();
            tc0Var.f173041L2 = tc0Var.new RunnableC20281f();
            if (tc0Var.f173135o1.f180183b1 == 1) {
                tc0Var.f173068U.setParameters("{\"che.audio.force_bluetooth_a2dp\":true}");
                tc0Var.f14988I.m122843l("force_bluetooth_a2dp", "true");
            }
            int iM112378r = csx.m112235R().m112378r();
            RtcEngine rtcEngine3 = tc0Var.f173068U;
            if (iM112378r == 1) {
                rtcEngine3.setParameters("{\"che.audio.aiaec.working_mode\":1}");
            } else {
                rtcEngine3.setParameters("{\"che.audio.aiaec.working_mode\":0}");
            }
            int iM112381s = csx.m112235R().m112381s();
            RtcEngine rtcEngine4 = tc0Var.f173068U;
            if (iM112381s == 1) {
                rtcEngine4.setParameters("{\"che.audio.ains_mode\":2}");
                tc0Var.f173068U.setParameters("{\"che.audio.nsng.lowerBound\":80}");
                tc0Var.f173068U.setParameters("{\"che.audio.nsng.lowerMask\":50}");
                tc0Var.f173068U.setParameters("{\"che.audio.nsng.statisticalbound\":5}");
                tc0Var.f173068U.setParameters("{\"che.audio.nsng.finallowermask\":30}");
                tc0Var.f173068U.setParameters("{\"che.audio.nsng.enhfactorstastical\":200}");
            } else {
                rtcEngine4.setParameters("{\"che.audio.ains_mode\":0}");
            }
            tc0Var.f14988I.m122843l("joinChannel", "channel:" + str + ",uid:" + i + ",token:" + tc0Var.f173145r1 + ", aec:" + csx.m112235R().m112378r() + ",ns:" + csx.m112235R().m112381s());
            int iJoinChannel = tc0Var.f173068U.joinChannel(tc0Var.f173145r1, str, (String) null, i);
            evx evxVar = tc0Var.f14988I;
            StringBuilder sb = new StringBuilder(" ret:");
            sb.append(iJoinChannel);
            sb.append(",channel:");
            sb.append(str);
            sb.append(",uid:");
            sb.append(i);
            evxVar.m122843l("joinChannel", sb.toString());
            if (iJoinChannel < 0) {
                wvx wvxVar2 = tc0Var.f14987H;
                wvxVar2.f191117y0 = 810L;
                wvxVar2.f191081k0 = iJoinChannel;
            }
            tc0Var.f14988I.m122842k("joinChannel", "" + iJoinChannel);
            if (iJoinChannel < 0 && tc0Var.f173058R1 != null) {
                tc0Var.f14988I.m122843l("joinChannel failed", " ret:" + iJoinChannel + "channel:" + str + ",uid:" + i);
                tc0Var.f173058R1.onJoinChannelfail(str, (long) i, iJoinChannel);
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "joinChannel#############" + iJoinChannel + "xx channel" + str);
            tc0Var.f173142q1 = true;
            tc0Var.m190286B7(1.0f);
        }
    }

    /* JADX INFO: renamed from: C6 */
    private final void m190108C6(String str) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "leaveChannel >>>>>" + str);
        this.f14988I.m122843l("leaveChannel");
        synchronized (this.f173151t1) {
            try {
                if (this.f173068U != null) {
                    if (this.f15000s.f180187v0 != null) {
                        this.f14988I.m122843l("stopRtmpStream:" + this.f15000s.f180187v0);
                        this.f173068U.stopRtmpStream(this.f15000s.f180187v0);
                    }
                    this.f173068U.leaveChannel();
                    this.f173068U.registerAudioFrameObserver(null);
                    this.f173104e1 = false;
                }
                this.f173142q1 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f173135o1.f164224e1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J7 */
    public void m190130J7(String str) {
        RtcEngine rtcEngine;
        synchronized (this.f173166y1) {
            try {
                if (!this.f173163x1 && !this.f173079W2 && (rtcEngine = this.f173068U) != null) {
                    rtcEngine.startRtmpStreamWithTranscoding(str, this.f173114h2);
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onStreamPublished addPublishStreamUrl:url=" + str);
                    this.f14988I.m122842k("setRtcEnginePublishStreamUrl", "startRtmpStreamWithTranscoding enable:" + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M6 */
    public void m190140M6() {
        if (this.f14987H.f191056c == 0) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "AGORA_PUBLISHING");
            this.f173110g1.mo165950g(4103, 0, 0, this);
            this.f14987H.f191056c = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: N6 */
    private void m190144N6(byte[] bArr, byte[] bArr2) {
        Handler handler;
        long j = this.f173135o1.f180157B0;
        if (this.f173158v2 == null || (handler = this.f173128l3) == null) {
            return;
        }
        handler.post(new RunnableC20278c(bArr, bArr2, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O7 */
    public void m190148O7(Object obj, int i, int i2) {
        gb1 gb1VarM21079C2;
        l6m l6mVar = this.f14990K;
        if (l6mVar == null || (gb1VarM21079C2 = ((ExtAudioWrapper) l6mVar).m21079C2()) == null) {
            return;
        }
        gb1VarM21079C2.mo19382a(obj, i, i2);
    }

    /* JADX INFO: renamed from: P7 */
    private void m190152P7() {
        RtcEngine rtcEngine;
        if (this.f173135o1 == null) {
            return;
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "setVideoProfileEx1 bitrate:" + this.f173135o1.f175494m + "<>" + this.f173135o1.f175496n + "<>" + this.f173135o1.f175451H + "<mergecanvasWidth>" + this.f173135o1.f175490k);
        m190360e6(this.f173027H0);
        if (this.f173160w1 || (rtcEngine = this.f173068U) == null) {
            return;
        }
        rtcEngine.setParameters("{\"che.video.keyFrameInterval\":1}");
        ror rorVar = this.f173135o1;
        int i = rorVar.f180174S0;
        if (i == 0) {
            i = 15;
        }
        int i2 = i;
        if (rorVar.f180161F0 && rorVar.m197027d() == 1) {
            ror rorVar2 = this.f173135o1;
            m190337V7(rorVar2.f175496n, rorVar2.f175494m, i2, rorVar2.f175451H / 1000, rorVar2.f180182a1);
        } else {
            ror rorVar3 = this.f173135o1;
            m190337V7(rorVar3.f175494m, rorVar3.f175496n, i2, rorVar3.f175451H / 1000, rorVar3.f180182a1);
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ int m190158R4(tc0 tc0Var) {
        int i = tc0Var.f173073V0;
        tc0Var.f173073V0 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: T5 */
    private final void m190165T5(int i, int i2) {
        ror rorVar = this.f173135o1;
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
        m190233n8();
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.setClientRole(i);
        }
    }

    /* JADX INFO: renamed from: U5 */
    private void m190169U5(String str) {
        if (this.f173068U == null || this.f173114h2 == null) {
            return;
        }
        this.f14988I.m122843l("configLiveTransCoding: user count" + this.f173114h2.getUsers().size() + ",mHavaPublish" + this.f173163x1);
        if (str == null || TextUtils.isEmpty(str) || this.f173114h2.getUsers().size() <= 0) {
            return;
        }
        String string = "{ \"canvas\":{ \"w\":" + this.f173114h2.width + ",\"h\":" + this.f173114h2.height + ",\"conf\":[";
        for (LiveTranscoding.TranscodingUser transcodingUser : this.f173114h2.getUsers()) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "llcqxl:<<<<<<<<<,uid:" + transcodingUser.uid + ",x:" + transcodingUser.f64039x + ",y:" + transcodingUser.f64040y + ",width:" + transcodingUser.width + ",height:" + transcodingUser.height + ",alpha:" + transcodingUser.alpha + ",zOrder:" + transcodingUser.zOrder + ">>>>>>>>>>");
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("{\"id\":");
            sb.append(transcodingUser.uid);
            sb.append(",\"x\":");
            sb.append(transcodingUser.f64039x);
            sb.append(",\"y\":");
            sb.append(transcodingUser.f64040y);
            sb.append(",\"width\":");
            sb.append(transcodingUser.width);
            sb.append(",\"height\":");
            sb.append(transcodingUser.height);
            sb.append("},");
            string = sb.toString();
        }
        String strConcat = string.concat(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        LiveTranscoding liveTranscoding = this.f173114h2;
        liveTranscoding.lowLatency = true;
        liveTranscoding.videoGop = 15;
        synchronized (this.f173166y1) {
            try {
                if (this.f173163x1) {
                    Log.e("lqdebug", "publishConfig:w:" + this.f173114h2.width + ",height:" + this.f173114h2.height);
                    this.f173068U.updateRtmpTranscoding(this.f173114h2);
                    m190290D6();
                    this.f14988I.m122843l("publishConfig:" + this.f173114h2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(this.f173114h2.userConfigExtraInfo)) {
            m190144N6(strConcat.getBytes(), this.f173114h2.userConfigExtraInfo.getBytes());
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "addPublishStreamUrl configLiveTransCoding");
    }

    /* JADX INFO: renamed from: V5 */
    private void m190173V5(long j) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine == null) {
            return;
        }
        rtcEngine.registerMediaMetadataObserver(new C20282g(j), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W5 */
    public void m190177W5(boolean z, int i, int i2, int i3, int i4, String str) {
        if (z) {
            this.f173028H1 = 1;
            if (this.f173114h2 == null) {
                this.f173114h2 = new LiveTranscoding();
            }
            this.f14988I.m122843l("agoraTranscode", "width:" + i + ",height:" + i2 + ",br:" + i3 + ",fps:" + i4);
            int iM112379r0 = csx.m112235R().m112379r0();
            LiveTranscoding liveTranscoding = this.f173114h2;
            liveTranscoding.width = i;
            liveTranscoding.height = i2;
            liveTranscoding.audioBitrate = iM112379r0 == 0 ? 128 : iM112379r0;
            liveTranscoding.audioChannels = 2;
            liveTranscoding.audioSampleRate = LiveTranscoding.AudioSampleRateType.TYPE_44100;
            liveTranscoding.videoBitrate = i3;
            liveTranscoding.videoFramerate = i4;
            csx.m112235R().m112266K();
            this.f173114h2.videoCodecType = this.f15000s.f180163H0 ? LiveTranscoding.VideoCodecType.H265 : LiveTranscoding.VideoCodecType.H264;
            int iM112325d = csx.m112235R().m112325d();
            if (1 == iM112325d) {
                this.f173114h2.audioCodecProfile = LiveTranscoding.AudioCodecProfileType.HE_AAC;
            } else if (2 == iM112325d) {
                this.f173114h2.audioCodecProfile = LiveTranscoding.AudioCodecProfileType.HE_AAC_V2;
            }
            this.f14988I.m122843l("tanscode_aBitrate", Integer.valueOf(iM112379r0));
            this.f14988I.m122842k("audioProfile", "[pub=Agora,profile=" + iM112325d + com.clevertap.android.sdk.Constants.AES_SUFFIX);
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", com.clevertap.android.sdk.Constants.KEY_CONFIG + this.f173114h2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a8 */
    public int m190190a8(String str) {
        ChannelMediaInfo channelMediaInfo = new ChannelMediaInfo("", "", 0);
        ChannelMediaInfo channelMediaInfo2 = new ChannelMediaInfo(str, "", this.f173135o1.f164228i1);
        ChannelMediaRelayConfiguration channelMediaRelayConfiguration = new ChannelMediaRelayConfiguration();
        channelMediaRelayConfiguration.setSrcChannelInfo(channelMediaInfo);
        channelMediaRelayConfiguration.setDestChannelInfo(str, channelMediaInfo2);
        if (this.f173106e3) {
            return 0;
        }
        int iStartOrUpdateChannelMediaRelay = this.f173068U.startOrUpdateChannelMediaRelay(channelMediaRelayConfiguration);
        this.f14988I.m122843l("startChannelMediaRelay ret:" + iStartOrUpdateChannelMediaRelay);
        if (iStartOrUpdateChannelMediaRelay >= 0) {
            this.f173106e3 = true;
            return iStartOrUpdateChannelMediaRelay;
        }
        this.f173106e3 = false;
        b7y.m102882c().m102886e("ConnectOtherRoom", "agora", iStartOrUpdateChannelMediaRelay, "startChannelMediaRelay falied", LogLevel.FATAL.value());
        this.f173032I2.mo20134f(0L, 3, "");
        return iStartOrUpdateChannelMediaRelay;
    }

    /* JADX INFO: renamed from: h6 */
    private RtcEngine m190212h6(uow uowVar) {
        this.f15000s = uowVar;
        m190380l7(uowVar.f175459P);
        this.f173024G0 = uowVar.f175502q;
        if (this.f173068U == null) {
            CongressUtil congressUtil = this.f173019E1;
            if (congressUtil != null) {
                congressUtil.getPara(new byte[]{1, 1, 1});
            }
            this.f14988I.m122843l("AgoraPusher", "mAppid:" + this.f173085Y0);
            this.f173043M1 = new C20280e();
            try {
                String str = this.f173085Y0;
                if (str != null && !TextUtils.isEmpty(str)) {
                    this.f173125k3 = 0;
                    int i = this.f173135o1.f180184c1;
                    if (i >= 0) {
                        this.f173125k3 = i;
                    } else {
                        this.f173125k3 = csx.m112235R().m112261I0();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f173068U = x1f.m209047b().m209049c(m20725W1(), this.f173085Y0, this.f173043M1, this.f173125k3 == 0);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    b7y.m102882c().m102888g("agoraCreate", "mRtcKeepAlive:" + this.f173125k3 + ",agoraHash:" + this.f173068U.hashCode() + ",cost:" + jCurrentTimeMillis2);
                    RtcEngine rtcEngine = this.f173068U;
                    if (rtcEngine == null) {
                        boolean zInitializeNativeLibs = RtcEngineImpl.initializeNativeLibs();
                        b7y.m102882c().m102883a("agoraCreate", "isLoad " + zInitializeNativeLibs, LogLevel.FATAL);
                        return null;
                    }
                    rtcEngine.setParameters("{\"rtc.stat_interval_ms\":1000}");
                    this.f173068U.setParameters("{\"rtc.video.max_metadata_size\":2048}");
                    this.f173104e1 = false;
                    this.f173068U.registerAudioFrameObserver(null);
                    int i2 = this.f173135o1.f175461R;
                    this.f173068U.setRecordingAudioFrameParameters(this.f173119j1, i2, 2, 1024);
                    if (this.f173135o1.f164234o1) {
                        this.f173068U.setPlaybackAudioFrameParameters(this.f173119j1, i2, 0, 1024);
                    }
                    this.f173068U.setChannelProfile(1);
                    this.f173068U.enableDualStreamMode(this.f173024G0);
                    m190360e6(this.f173027H0);
                }
                this.f14988I.m122843l("agora createEngine failed:", this.f173085Y0);
                q210.InterfaceC19500a interfaceC19500a = this.f173110g1;
                if (interfaceC19500a != null) {
                    interfaceC19500a.mo165950g(4352, 806, 0, this);
                }
                return null;
            } catch (Exception unused) {
                this.f14988I.m122843l("agora createEngine failed:", this.f173085Y0);
                q210.InterfaceC19500a interfaceC19500a2 = this.f173110g1;
                if (interfaceC19500a2 != null) {
                    interfaceC19500a2.mo165950g(4352, 806, 0, this);
                }
                return null;
            }
        }
        this.f173064T = this.f173068U.isTextureEncodeSupported();
        uow uowVar2 = this.f15000s;
        if (uowVar2 != null && uowVar2.f175473b0) {
            this.f173064T = false;
        }
        this.f14988I.m122843l("isDynamicKey", Boolean.valueOf(!TextUtils.isEmpty(this.f173085Y0)), "channelkey", Boolean.valueOf(TextUtils.isEmpty(this.f173145r1)));
        return this.f173068U;
    }

    /* JADX INFO: renamed from: k6 */
    private int m190222k6(int i) {
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
            return this.f173135o1.f175462S;
        }
        return 128000;
    }

    /* JADX INFO: renamed from: n6 */
    private String m190232n6() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<Long, iny>> it = this.f173057R0.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iny value = it.next().getValue();
            if (i != 0) {
                sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            }
            value.f116026d = value.f116028f + value.f116027e;
            sb.append(value.m141176b());
            i++;
        }
        if (i == 0) {
            sb.append("(0)");
        }
        sb.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n8 */
    private void m190233n8() {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.setExternalVideoSource(true, this.f173064T, Constants.ExternalVideoSourceType.VIDEO_FRAME);
            this.f14988I.m122843l("writerTexturePrepare");
        }
    }

    /* JADX INFO: renamed from: p6 */
    private String m190240p6(String str) {
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
            b7y.m102882c().m102888g("getFixSei error" + e.toString());
            return str;
        }
    }

    private void release() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter release");
        boolean z = true;
        this.f173150s3 = true;
        this.f173080X = false;
        synchronized (this.f173151t1) {
            try {
                this.f14987H.f191051a0 = null;
                if (this.f173068U != null) {
                    if (this.f173159v3) {
                        arx.C15814d c15814dM99797h = arx.m99789d().m99797h(this.f14997R.m106170b());
                        evx evxVar = this.f14988I;
                        StringBuilder sb = new StringBuilder("server mix destory uid:");
                        sb.append(this.f173135o1.f180157B0);
                        sb.append(",momoid:");
                        sb.append(c15814dM99797h.f73010c);
                        sb.append("roomid:");
                        sb.append(this.f14997R);
                        evxVar.m122843l(this.f14997R.m106176h());
                        HttpWrapper httpWrapper = HttpWrapper.getInstance();
                        String str = c15814dM99797h.f73008a;
                        String str2 = c15814dM99797h.f73009b;
                        int i = this.f173135o1.f180157B0;
                        String strM106179k = this.f14997R.m106179k();
                        String strM106176h = this.f14997R.m106176h();
                        String str3 = this.f173135o1.f164226g1;
                        wvx wvxVar = this.f14987H;
                        httpWrapper.destoryChannel(str, str2, i, strM106179k, strM106176h, str3, wvxVar.f190999A0, "agora", (int) wvxVar.f191104s);
                    }
                    m190329S5();
                    m190345Y7(0);
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "release >>>>>");
                    this.f173068U.registerAudioFrameObserver(null);
                    this.f173104e1 = false;
                    if (this.f15000s.f180187v0 != null) {
                        this.f14988I.m122843l("stopRtmpStream line 2702 mrCoreParameters.mRtmpPath:" + this.f14987H.f191114x);
                        this.f173068U.stopRtmpStream(this.f14987H.f191114x);
                    }
                    this.f173068U.leaveChannel();
                    this.f173068U.registerMediaMetadataObserver(null, 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    x1f x1fVarM209047b = x1f.m209047b();
                    IRtcEngineEventHandler iRtcEngineEventHandler = this.f173043M1;
                    if (this.f173125k3 != 0) {
                        z = false;
                    }
                    x1fVarM209047b.m209048a(iRtcEngineEventHandler, z);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    b7y.m102882c().m102888g("agoraDestroy", "mRtcKeepAlive:" + this.f173125k3 + ",cost:" + jCurrentTimeMillis2);
                    Log.e("lqdebug", "mRtcEngine.destroy() end");
                    this.f173080X = false;
                    m20743l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                    this.f14989J = MomoCodec.MomoCodecState.STOP;
                    this.f173110g1.mo165950g(4097, 0, 0, this);
                    this.f173072V = -1;
                    this.f173026G2 = null;
                }
                this.f173080X = false;
                m20743l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                this.f14989J = MomoCodec.MomoCodecState.STOP;
                mo20734d2();
                this.f173110g1.mo165950g(4097, 0, 0, this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: t6 */
    private IRtcEngineEventHandler.LocalVideoStats m190256t6() {
        return this.f173054Q0;
    }

    /* JADX INFO: renamed from: u6 */
    private IRtcEngineEventHandler.RemoteVideoStats m190261u6() {
        return this.f173051P0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v6 */
    public String m190266v6(String str) {
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
            if (jSONObject.has(BaseSei.CONF) && this.f173157v1) {
                jSONObject.remove(BaseSei.CONF);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ ypw m190281z4(tc0 tc0Var) {
        tc0Var.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z6 */
    public void m190282z6(int i) {
        int i2;
        int i3;
        int i4;
        if (this.f173044M2) {
            float f = this.f173047N2;
            if (f >= 0.0f) {
                float f2 = this.f173050O2;
                if (f2 >= 0.0f) {
                    float f3 = this.f173053P2;
                    if (f3 > 0.0f) {
                        float f4 = this.f173056Q2;
                        if (f4 > 0.0f) {
                            CongressUtil.setCutPostion(f, f2, f3, f4);
                        }
                    }
                }
            }
            int i5 = this.f173059R2;
            if (i5 >= 0 && (i2 = this.f173063S2) >= 0 && (i3 = this.f173067T2) > 0 && (i4 = this.f173071U2) > 0) {
                CongressUtil.setCutPostion(i5, i2, i3, i4);
            }
            if (!this.f173169z1.containsKey(Integer.valueOf(i))) {
                this.f173169z1.put(Integer.valueOf(i), Integer.valueOf(i));
            }
            SurfaceView surfaceView = new SurfaceView(m20725W1());
            surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC20285j(i));
            this.f173089Z0.mo20117a(i, surfaceView, this.width, this.height);
            return;
        }
        if (!this.f173102d2 && this.f173095b1 == null && !this.f173135o1.f180181Z0) {
            SurfaceView surfaceView2 = new SurfaceView(m20725W1());
            if (this.f173068U != null) {
                this.f173094a3.add(Integer.valueOf(i));
                this.f173068U.setupRemoteVideo(new VideoCanvas(surfaceView2, 1, i));
            }
            if (this.f173089Z0 != null && !this.f173160w1 && !this.f173157v1) {
                this.f14988I.m122843l("onVideoChannelAdded", Boolean.valueOf(this.f173135o1.f180181Z0), "mVideoTextureListener:" + this.f173095b1);
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAdded: userID=" + i);
                this.f173089Z0.mo20117a((long) i, surfaceView2, this.width, this.height);
            }
            if (this.f173135o1.f180179X0) {
                this.f14988I.m122843l("isLocalMix:" + this.f173135o1.f180179X0, true, "mergeCanvansWidth:" + this.f173135o1.f175490k + ", mergeHeight:" + this.f173135o1.f175492l + ", mix bitrate:" + this.f173031I1);
                return;
            }
            return;
        }
        if (this.f173135o1.f180181Z0) {
            this.f14988I.m122843l("useTextureView", "width:" + this.width + ",height:" + this.height);
            TextureView textureView = new TextureView(m20725W1());
            RtcEngine rtcEngine = this.f173068U;
            if (rtcEngine != null) {
                rtcEngine.setupRemoteVideo(new VideoCanvas(textureView, 1, i));
            }
            if (this.f173098c1 != null) {
                this.f173091Z2.put(Integer.valueOf(i), textureView);
                this.f14988I.m122843l("onVideoChannelAdded use textureView");
                this.f173098c1.mo20121a(i, textureView, this.width, this.height);
                return;
            }
            return;
        }
        if (this.f173169z1.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.f173169z1.put(Integer.valueOf(i), Integer.valueOf(i));
        if (this.f173095b1 != null) {
            m190373i8(i, this.width, this.height);
        }
        long j = i;
        sti0 sti0Var = new sti0(j, this.width, this.height, this.f173019E1);
        if (this.f173092a1 == null || this.f173160w1 || this.f173157v1) {
            return;
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAddedExt: userID=" + i);
        this.f173092a1.mo109337a(j, sti0Var, this.width, this.height);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo20645A() {
        this.f14988I.m122843l("stopRecordWithNotLeaveRoom");
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter stopRecord");
        this.f173080X = false;
        dc1 dc1Var = this.f173036K0;
        if (dc1Var != null) {
            dc1Var.m115188f();
            this.f173036K0 = null;
        }
        this.f173081X0 = 0;
        super.mo20645A();
        C20287l c20287l = this.f173099c2;
        if (c20287l != null) {
            c20287l.m190407a();
            this.f173099c2 = null;
        }
        stopSurroundMusic();
        m190389q2();
        l6m l6mVar = this.f14990K;
        if (l6mVar != null) {
            ror rorVar = this.f173135o1;
            ((ExtAudioWrapper) l6mVar).m21086I2(2048, rorVar.f175459P, rorVar.f175461R, "Momo");
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
        PipelineConcurrentHashMap<Long, xhy> pipelineConcurrentHashMap = this.f173061S0;
        if (pipelineConcurrentHashMap != null && !pipelineConcurrentHashMap.isEmpty()) {
            t9c.m189743a("zhengjijian", "stopRecord memberInfoMap " + this.f173061S0.size());
            this.f173061S0.clear();
        }
        PipelineConcurrentHashMap<Long, iny> pipelineConcurrentHashMap2 = this.f173057R0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            this.f173057R0.clear();
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "stopRecordOK!!!!!!!!!!!!!!!!!!!!");
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: A0 */
    public int mo20913A0() {
        ror rorVar = this.f173135o1;
        return rorVar.f175490k > 0 ? rorVar.f175492l : rorVar.f175508t;
    }

    /* JADX INFO: renamed from: A5 */
    public void m190283A5(MRtcExitRoomHandler mRtcExitRoomHandler) {
        this.f173029H2 = mRtcExitRoomHandler;
    }

    /* JADX INFO: renamed from: A7 */
    public void m190284A7(String str, boolean z) {
        int i;
        JSONArray jSONArray;
        int i2;
        int i3;
        String str2 = "pkmu";
        String str3 = "renderMode";
        String str4 = "alpha";
        if (this.f173135o1 == null || str == null) {
            return;
        }
        if (this.f173114h2 == null) {
            this.f173114h2 = new LiveTranscoding();
        }
        LiveTranscoding liveTranscoding = this.f173114h2;
        liveTranscoding.backgroundColor = 0;
        ror rorVar = this.f173135o1;
        int i4 = rorVar.f175490k;
        liveTranscoding.width = i4;
        int i5 = rorVar.f175492l;
        liveTranscoding.height = i5;
        liveTranscoding.videoGop = 15;
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        this.f14988I.m122843l("setJsonForWindowPostion publishConfig", "w:" + this.f173114h2.width, "h:" + this.f173114h2.height);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.has(BaseSei.MID) ? jSONObject.getString(BaseSei.MID) : "";
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f173114h2.setUsers((ArrayList<LiveTranscoding.TranscodingUser>) null);
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
                    LiveTranscoding liveTranscoding2 = this.f173114h2;
                    int i7 = liveTranscoding2.width;
                    transcodingUser.f64039x = (int) (i7 * 0.0228f);
                    int i8 = liveTranscoding2.height;
                    i = 0;
                    transcodingUser.f64040y = 0;
                    transcodingUser.width = (int) (i7 * 0.2614f);
                    transcodingUser.height = (int) (i8 * 0.25004f);
                    liveTranscoding2.addUser(transcodingUser);
                    this.f173114h2.userConfigExtraInfo = m190266v6(this.f173010B1);
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
                double d2 = (jSONObject2 == null || !jSONObject2.has(BaseSei.f14624X)) ? 0.0d : jSONObject2.getDouble(BaseSei.f14624X);
                if (jSONObject2 != null && jSONObject2.has(BaseSei.f14625Y)) {
                    d = jSONObject2.getDouble(BaseSei.f14625Y);
                }
                double d3 = 1.0d;
                double d4 = (jSONObject2 == null || !jSONObject2.has("w")) ? 1.0d : jSONObject2.getDouble("w");
                double d5 = (jSONObject2 == null || !jSONObject2.has("h")) ? 1.0d : jSONObject2.getDouble("h");
                int i10 = (jSONObject2 == null || !jSONObject2.has(BaseSei.f14626Z)) ? i3 : jSONObject2.getInt(BaseSei.f14626Z) + 1;
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
                LiveTranscoding liveTranscoding3 = this.f173114h2;
                int i12 = liveTranscoding3.width;
                String str5 = str2;
                String str6 = str3;
                transcodingUser2.f64039x = (int) (((double) i12) * d2);
                int i13 = liveTranscoding3.height;
                String str7 = str4;
                transcodingUser2.f64040y = (int) (((double) i13) * d);
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
            this.f173114h2.userConfigExtraInfo = m190266v6(this.f173010B1);
            if (!this.f173159v3) {
                m190169U5(this.f173135o1.f180187v0);
                return;
            }
            if (this.f14987H.f191053b && this.f14997R != null && z) {
                String string3 = "" + this.f173010B1;
                try {
                    JSONObject jSONObject3 = new JSONObject(string3);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("asr", 44100);
                    int i14 = this.f173114h2.audioBitrate;
                    if (i14 < 1000) {
                        i14 *= 1000;
                    }
                    jSONObject4.put("abr", i14);
                    jSONObject4.put("achl", this.f173114h2.audioChannels);
                    jSONObject4.put("acpf", LiveTranscoding.AudioCodecProfileType.getValue(this.f173114h2.audioCodecProfile));
                    jSONObject4.put("w", this.f15000s.f175490k);
                    jSONObject4.put("h", this.f15000s.f175492l);
                    jSONObject4.put("gop", this.f15000s.f175450G);
                    jSONObject4.put("fps", this.f15000s.f175449F);
                    jSONObject4.put("vbr", this.f15000s.f175451H);
                    if (!this.f15000s.f180163H0) {
                        i2 = i3;
                    }
                    jSONObject4.put("vcpf", i2);
                    jSONObject3.put("mixInfo", jSONObject4);
                    string3 = jSONObject3.toString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String str8 = string3;
                arx.C15814d c15814dM99797h = arx.m99789d().m99797h(this.f14997R.m106170b());
                this.f173144q3++;
                evx evxVar = this.f14988I;
                StringBuilder sb = new StringBuilder("server mix update uid:");
                sb.append(this.f173135o1.f180157B0);
                sb.append(",momoid:");
                sb.append(c15814dM99797h.f73010c);
                sb.append("roomid:");
                sb.append(this.f14997R);
                evxVar.m122843l(this.f14997R.m106176h());
                HttpWrapper httpWrapper = HttpWrapper.getInstance();
                String str9 = c15814dM99797h.f73008a;
                String str10 = c15814dM99797h.f73009b;
                ror rorVar2 = this.f173135o1;
                int i15 = rorVar2.f180157B0;
                String str11 = c15814dM99797h.f73010c;
                brx brxVar = this.f14997R;
                String strM106176h = brxVar != null ? brxVar.m106176h() : rorVar2.f164226g1;
                String str12 = this.f173135o1.f164226g1;
                wvx wvxVar = this.f14987H;
                httpWrapper.updateChannel(str9, str10, i15, str11, strM106176h, str12, wvxVar.f190999A0, str8, "agora", this.f15000s.f180187v0, (int) wvxVar.f191104s);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: B7 */
    public void m190286B7(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f14988I.m122843l("agora setMasterAudioLevel", Float.valueOf(f));
        float f2 = 1.3f * f;
        this.f173113h1 = f2;
        this.f14987H.f191013H0 = f2;
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.adjustRecordingSignalVolume((int) (f * 100.0f));
        }
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
        this.f14988I.m122843l("agora setMergeSei", str);
        synchronized (this.f173151t1) {
            this.f173013C1 = str;
            if (!this.f173135o1.f180179X0) {
                m190284A7(str, true);
            }
        }
    }

    /* JADX INFO: renamed from: C5 */
    public void m190287C5(MRtcAudioHandler mRtcAudioHandler) {
        this.f173052P1 = mRtcAudioHandler;
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

    /* JADX INFO: renamed from: D5 */
    public void m190289D5(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f173055Q1 = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: D6 */
    public void m190290D6() {
        String str = "{ \"canvas\":{ \"w\":" + this.f173114h2.width + ",\"h\":" + this.f173114h2.height + ",\"conf\":{";
        for (LiveTranscoding.TranscodingUser transcodingUser : this.f173114h2.getUsers()) {
            str = str + "{\"id\":" + transcodingUser.uid + ",\"x\":" + transcodingUser.f64039x + ",\"y\":" + transcodingUser.f64040y + ",\"width\":" + transcodingUser.width + ",\"height\":" + transcodingUser.height + "},";
        }
        this.f14988I.m122843l("updateTranscoding", (str + "extraInfo:" + this.f173114h2.userConfigExtraInfo).concat("}"));
    }

    /* JADX INFO: renamed from: D7 */
    public void m190291D7(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.f173022F1 = pcmdataavailablecallback;
        if (pcmdataavailablecallback != null) {
            m190338W6(true);
        } else {
            m190338W6(false);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: E0 */
    public void mo20921E0(wzl wzlVar) {
        this.f14985F = wzlVar;
    }

    /* JADX INFO: renamed from: E6 */
    public void m190293E6(boolean z) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(z);
        }
    }

    /* JADX INFO: renamed from: E7 */
    public int m190294E7(int i) {
        this.f14988I.m122843l("setRemoteDefaultVideoStreamType", Integer.valueOf(i));
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine == null) {
            return -1;
        }
        this.f14987H.f191090n0 = i;
        return rtcEngine.setRemoteDefaultVideoStreamType(i);
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: F */
    public boolean mo20924F() {
        return this.f173107f1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: F0 */
    public int mo20925F0() {
        return this.f173129m1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: F1 */
    public long mo20926F1() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f173048O0;
        if (rtcStats != null) {
            return rtcStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F5 */
    public void m190295F5(MRtcChannelHandler mRtcChannelHandler) {
        this.f173062S1 = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: F6 */
    public void m190296F6(boolean z) {
        this.f14988I.m122843l("muteAllRemoteVideoStream", "mute:" + z);
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteVideoStreams(z);
        }
    }

    /* JADX INFO: renamed from: F7 */
    public void m190297F7(int i) {
        this.f14988I.m122843l("setRole", Integer.valueOf(i));
        this.f173148s1 = i;
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.setClientRole(i);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: G0 */
    public long mo20929G0() {
        return 0L;
    }

    /* JADX INFO: renamed from: G5 */
    public void m190298G5(MRtcConnectHandler mRtcConnectHandler) {
        this.f173078W1 = mRtcConnectHandler;
    }

    /* JADX INFO: renamed from: G6 */
    public void m190299G6(boolean z) {
        this.f14988I.m122843l("agoraFilter muteLocalAudioStream", Boolean.valueOf(z));
        this.f173134n3 = z;
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
    }

    /* JADX INFO: renamed from: G7 */
    public void m190300G7(boolean z) {
        this.f173079W2 = z;
        this.f14988I.m122843l("setRoom24hMode:", Boolean.valueOf(z));
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo20649H0(boolean z) {
        this.f173157v1 = z;
    }

    /* JADX INFO: renamed from: H5 */
    public void m190301H5(wpw wpwVar) {
        this.f173070U1 = wpwVar;
    }

    /* JADX INFO: renamed from: H6 */
    public void m190302H6(boolean z) {
        this.f173134n3 = z;
        this.f14988I.m122843l("muteLocalAudioStreamForEx", Boolean.valueOf(z));
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
    }

    /* JADX INFO: renamed from: H7 */
    public void m190303H7(int i, boolean z) {
        this.f173025G1 = i;
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: I1 */
    public void mo20934I1() {
        this.f173107f1 = true;
    }

    /* JADX INFO: renamed from: I5 */
    public void m190304I5(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        this.f173082X1 = mRtcClientRoleChangedHandler;
    }

    /* JADX INFO: renamed from: I6 */
    public void m190305I6(boolean z) {
        this.f173131m3 = z;
        this.f14988I.m122843l("muteLocalVideoStream", Boolean.valueOf(z));
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.muteLocalVideoStream(z);
        }
    }

    /* JADX INFO: renamed from: I7 */
    public void m190306I7(int i) {
        this.f173139p1 = i;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: J */
    public void mo20650J(String str) {
        t9c.m189745c("zk", "setSei" + this.f173013C1);
        b7y.m102882c().m102888g("Agora setSei:" + str);
        synchronized (this.f173151t1) {
            try {
                this.f173010B1 = str;
                if (!this.f173135o1.f180179X0) {
                    if (TextUtils.isEmpty(this.f173013C1)) {
                        m190406z7(str);
                    } else {
                        m190284A7(this.f173013C1, false);
                    }
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
    public void m190307J5(MRtcPusherHandler mRtcPusherHandler) {
        this.f173012B3 = mRtcPusherHandler;
    }

    /* JADX INFO: renamed from: J6 */
    public void m190308J6(long j, boolean z) {
        RtcEngine rtcEngine;
        this.f14988I.m122843l("muteRemoteAudioStream", "uid:" + j + ",mute:" + z);
        if (j == this.f173135o1.f180157B0 || (rtcEngine = this.f173068U) == null) {
            return;
        }
        rtcEngine.muteRemoteAudioStream((int) j, z);
    }

    /* JADX INFO: renamed from: K5 */
    public void m190309K5(MRtcQualityHandler mRtcQualityHandler) {
        this.f173074V1 = mRtcQualityHandler;
    }

    /* JADX INFO: renamed from: K6 */
    public void m190310K6(long j, boolean z) {
        RtcEngine rtcEngine;
        this.f14988I.m122843l("muteRemoteVideoStream", "uid:" + j + ",mute:" + z);
        if (j == this.f173135o1.f180157B0 || (rtcEngine = this.f173068U) == null) {
            return;
        }
        rtcEngine.muteRemoteVideoStream((int) j, z);
    }

    /* JADX INFO: renamed from: K7 */
    public void m190311K7(kod0 kod0Var) {
        this.f173032I2 = kod0Var;
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: L */
    public void mo20941L(dpl.InterfaceC16599a interfaceC16599a) {
        this.f14988I.m122843l("setOnFrameAvailabelCallback :" + interfaceC16599a);
        this.f173101d1 = interfaceC16599a;
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
    public void m190312L5(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f173026G2 = mRtcReceiveSeiHandler;
    }

    /* JADX INFO: renamed from: L6 */
    public void m190313L6(boolean z) {
        t9c.m189745c("zk", "--ktv,muteSingerAudioStream:" + this.f173111g2 + "-->" + z);
        this.f14988I.m122843l("muteSingerAudioStream", Boolean.valueOf(z));
        this.f173111g2 = z;
    }

    /* JADX INFO: renamed from: L7 */
    public void m190314L7(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f173116i1 = 0.8f * f;
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.adjustAudioMixingVolume((int) (f * 100.0f));
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: M0 */
    public int mo20947M0() {
        return (int) this.f14987H.f191074i;
    }

    @Override // p153l.hej, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: M1 */
    public void mo20652M1() {
        g510 g510Var;
        if (this.f173076W == null && (g510Var = this.f173033J0) != null) {
            this.f173076W = g510Var.m128993l();
        }
        if (!this.f173064T || this.texture_in == 0 || !this.f173080X || this.f173131m3) {
            return;
        }
        if (this.f173124k2 > 2) {
            ror rorVar = this.f173135o1;
            int i = rorVar.f175494m;
            int i2 = rorVar.f175496n;
            if (rorVar.f180161F0 && rorVar.m197027d() == 1) {
                ror rorVar2 = this.f173135o1;
                i = rorVar2.f175496n;
                i2 = rorVar2.f175494m;
            }
            VideoFrame videoFrame = new VideoFrame(new TextureBuffer(this.f173076W, i, i2, VideoFrame.TextureBuffer.Type.RGB, this.texture_in, m190390q6(), RendererCommon.m20766a(f173006D3), (Handler) null, (YuvConverter) null, (Runnable) null), 0, System.nanoTime());
            synchronized (this.f173151t1) {
                try {
                    if (this.f173068U != null && !this.f173150s3) {
                        this.f173068U.pushExternalVideoFrame(videoFrame);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            u6y.m194722F().m194734M();
        }
        long j = this.f173124k2 + 1;
        this.f173124k2 = j;
        if (j >= 30 || this.f173157v1) {
            m190140M6();
            if (this.f173156u3 <= 0) {
                this.f173156u3 = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: M7 */
    public void m190316M7(boolean z) {
        if (z) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "set Stream ReplaceMode");
        }
        this.f14988I.m122843l("setStreamReplaceMode:" + z);
        this.f173105e2 = z;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: N0 */
    public long mo20951N0() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f173048O0;
        if (rtcStats != null) {
            return rtcStats.txBytes;
        }
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: N1 */
    public int mo20952N1() {
        return this.f173042M0;
    }

    /* JADX INFO: renamed from: N5 */
    public void m190317N5(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f173066T1 = mRtcTokenWillExpireHander;
    }

    /* JADX INFO: renamed from: N7 */
    public void m190318N7(int i) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.setAudioMixingPosition(i);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: O0 */
    public long mo20955O0() {
        return this.f173045N0;
    }

    /* JADX INFO: renamed from: O5 */
    public void m190319O5(int i) {
        float f = i / 100.0f;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f173116i1 = f * 0.8f;
        this.f14988I.m122843l("adjustAudioMixingVolume", Integer.valueOf(i), Float.valueOf(this.f173116i1));
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.adjustAudioMixingVolume(i);
        }
    }

    /* JADX INFO: renamed from: O6 */
    public void m190320O6(int i, int i2) {
        long j;
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onFirstRemoteVideoDecoded:uid" + i + "width" + this.width + "height" + this.height + "elapsed" + i2);
        if (m20725W1() == null) {
            return;
        }
        long j2 = i;
        xhy xhyVar = this.f173061S0.get(Long.valueOf(j2));
        if (xhyVar == null || xhyVar.m211085d()) {
            j = j2;
        } else {
            t9c.m189743a("zhengjijian", "agora get first idr");
            xhyVar.m211088g(true);
            j = j2;
            this.f14988I.m122836c(true, xhyVar.m211084c(), j, this.f173112g3, xhyVar.m211082a(), System.currentTimeMillis() - xhyVar.m211083b());
            this.f173110g1.mo165950g(8198, i, 0, this);
        }
        MRtcEventHandler mRtcEventHandler = this.f173058R1;
        if (mRtcEventHandler != null) {
            mRtcEventHandler.onFirstRemoteVideoDecoded(j, this.width, this.height, i2);
        }
        Handler handler = this.f173128l3;
        if (handler != null) {
            handler.postAtFrontOfQueue(new RunnableC20284i(i));
        }
    }

    @Override // p153l.o410.InterfaceC19026f
    /* JADX INFO: renamed from: P0 */
    public void mo20958P0(g510 g510Var, int i, int i2, int i3, int i4) {
        this.f173126l1 = i4;
        this.f173129m1 = i2;
        this.f173132n1 = i3;
    }

    /* JADX INFO: renamed from: P5 */
    public void m190321P5(int i) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.adjustPlaybackSignalVolume(i);
        }
    }

    /* JADX INFO: renamed from: P6 */
    public void m190322P6() {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).pauseAllEffects();
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: Q0 */
    public int mo20962Q0() {
        return this.f173080X ? m190392r6() : m190394s6();
    }

    /* JADX INFO: renamed from: Q5 */
    public void m190323Q5(long j, float f) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.adjustUserPlaybackSignalVolume((int) j, (int) f);
        }
    }

    /* JADX INFO: renamed from: Q6 */
    public void m190324Q6(int i) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).pauseEffect(i);
        }
    }

    /* JADX INFO: renamed from: Q7 */
    public void m190325Q7(gbl0 gbl0Var) {
        this.f14988I.m122843l("setVideoChannelTextureViewListener", "listner:" + gbl0Var, "useTexture:" + this.f173135o1.f180181Z0);
        this.f173098c1 = gbl0Var;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo20654R0(uow uowVar, EGLContext eGLContext) {
        if (this.f173068U == null) {
            this.f14988I.m122843l("startRecord", "engine == null, may be appid is null");
            this.f173110g1.mo165950g(4352, 806, 0, this);
            return;
        }
        if (uowVar == null || this.f173081X0 == 1) {
            return;
        }
        wvx wvxVar = this.f14987H;
        long j = this.f173148s1;
        wvxVar.f191058c1 = j;
        if (j == 1) {
            wvxVar.f191001B0 = "M".equals(mo21051w1()) ? "AgoraMaster" : "AgoraSlaver";
        } else {
            wvxVar.f191001B0 = "AgoraAudience";
        }
        super.mo20654R0(uowVar, eGLContext);
        if (uowVar.f175473b0 && !this.f173131m3 && !this.f173160w1 && this.f173099c2 == null) {
            C20287l c20287l = new C20287l("live-media-aFFrame");
            this.f173099c2 = c20287l;
            c20287l.start();
        }
        if (!(uowVar instanceof ror)) {
            throw new InvalidParameterException("Parameters error");
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter startRecord");
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
        oq70VarM168791d.m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", sb.toString());
        this.f173135o1 = rorVar;
        if (!TextUtils.isEmpty(uowVar.f180187v0)) {
            this.f173159v3 = uowVar.f180187v0.contains("mixprovider=1");
        }
        this.f14988I.m122843l("serverMix:" + this.f173159v3);
        if (uowVar.f180156A0 == MomoPipeline.DecodeType.SOFT_DECODE || rorVar.f175473b0) {
            this.f173064T = false;
        }
        this.f173036K0 = new dc1();
        g510 g510Var = this.f173033J0;
        if (g510Var != null) {
            this.f173076W = g510Var.m128993l();
        }
        if (csx.m112235R().m112372p()) {
            int iM112375q = (int) (csx.m112235R().m112375q() * (uowVar.f175451H / 1000));
            VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration();
            videoEncoderConfiguration.minBitrate = iM112375q;
            RtcEngine rtcEngine = this.f173068U;
            if (rtcEngine != null) {
                rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
            }
            t9c.m189748f("agora_minkbs", "minBitrate parms = " + iM112375q);
        }
        this.f173168y3 = 2;
        this.f173150s3 = false;
        this.f173163x1 = false;
        this.f173153t3 = false;
        synchronized (this.f173151t1) {
            try {
                this.f14987H.f191062e = System.currentTimeMillis();
                m190173V5(this.f173135o1.f180157B0);
                m190165T5(this.f173148s1, 33);
                ror rorVar2 = this.f173135o1;
                m190104B6(rorVar2.f164226g1, rorVar2.f180157B0);
                if (this.f173010B1 != null) {
                    ror rorVar3 = this.f173135o1;
                    if (rorVar3.f164227h1 && this.f173013C1 == null && !rorVar3.f180179X0) {
                        m190406z7(this.f173010B1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f173102d2) {
            m190345Y7(0);
            m190345Y7(1);
        }
        this.f173081X0 = 1;
        yt0.m217280g().m217295p(m20725W1(), yt0.f201475f);
        this.f14987H.f191061d1 = uowVar.m197027d();
        wvx wvxVar2 = this.f14987H;
        wvxVar2.f191055b1 = uowVar.f175473b0 ? 1L : 0L;
        wvxVar2.f191114x = uowVar.f180187v0;
        int i = uowVar.f175451H;
        this.f173137o3 = i;
        this.f173141p3 = uowVar.f180160E0;
        ror rorVar4 = this.f173135o1;
        wvxVar2.f191042W = rorVar4.f180157B0;
        wvxVar2.f191044X = rorVar4.f164226g1;
        wvxVar2.f191009F0 = i;
        if (this.f173068U != null) {
            wvxVar2.f191095p = RtcEngine.getSdkVersion();
        }
        this.f14987H.f191065f = System.currentTimeMillis();
        this.f14987H.f191009F0 = uowVar.f175451H;
        this.f14988I.m122843l("startRecord");
        this.f173023F2 = uowVar.f180178W0;
        csx.m112235R().m112244C1(1);
        this.f14988I.m122843l("mrCoreParameters ignoreSabin", Boolean.valueOf(csx.m112235R().m112279O0()), "isLocalMix", Boolean.valueOf(uowVar.f180179X0));
        this.f14988I.m122843l("agoraGlFlush", Boolean.valueOf(csx.m112235R().m112313a()));
    }

    /* JADX INFO: renamed from: R5 */
    public int m190326R5(int i) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "call changeRole:" + i);
        this.f14988I.m122843l("changeRole", Integer.valueOf(i));
        int clientRole = 0;
        boolean z = i != this.f173148s1;
        this.f173148s1 = i;
        long j = i;
        this.f14987H.f191058c1 = j;
        if (z) {
            if (j == 2) {
                mo20739i2();
                this.f14987H.f191001B0 = "AgoraAudience";
            } else {
                mo20737g2();
                this.f14987H.f191001B0 = "M".equals(mo21051w1()) ? "AgoraMaster" : "AgoraSlaver";
            }
            this.f14987H.f191065f = System.currentTimeMillis();
        }
        synchronized (this.f173151t1) {
            if (1 == i) {
                try {
                    m190152P7();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f173068U != null) {
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "changeRole:" + i);
                clientRole = this.f173068U.setClientRole(i);
            }
        }
        return clientRole;
    }

    /* JADX INFO: renamed from: R6 */
    public void m190327R6() {
        this.f14988I.m122843l("pauseRecording");
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "pauseRecording");
        if (this.f173068U != null) {
            this.f14988I.m122843l("pauseRecording muteLocalAudioStream", "true");
            this.f173068U.muteLocalAudioStream(true);
        }
    }

    /* JADX INFO: renamed from: R7 */
    public void m190328R7(ebl0 ebl0Var) {
        this.f173089Z0 = ebl0Var;
    }

    /* JADX INFO: renamed from: S5 */
    public void m190329S5() {
        try {
            CongressUtil congressUtil = this.f173019E1;
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
    public void m190330S6() {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.pauseAudioMixing();
        }
    }

    /* JADX INFO: renamed from: S7 */
    public void m190331S7(fbl0 fbl0Var) {
        this.f173092a1 = fbl0Var;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: T0 */
    public int mo20972T0() {
        return 0;
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m190332T6(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        this.f14988I.m122843l("playEffect", "playEffect filename:" + str);
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).playEffect(i, str, i2, d, d3, d2 * 100.0d, !z);
        }
        return true;
    }

    /* JADX INFO: renamed from: T7 */
    public void m190333T7(String str) {
        this.f14988I.m122843l("agora setVideoMixerBackgroundImgUrl", "url is" + str);
        this.f173147r3 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f173114h2 == null) {
            this.f173114h2 = new LiveTranscoding();
        }
        AgoraImage agoraImage = new AgoraImage();
        uow uowVar = this.f15000s;
        int i = uowVar.f175490k;
        if (i > 0) {
            agoraImage.width = i;
            agoraImage.height = uowVar.f175492l;
        } else {
            agoraImage.width = uowVar.f175506s;
            agoraImage.height = uowVar.f175508t;
        }
        agoraImage.url = str;
        agoraImage.f64041x = 0;
        agoraImage.f64042y = 0;
        ArrayList<AgoraImage> backgroundImageList = this.f173114h2.getBackgroundImageList();
        if (backgroundImageList != null) {
            backgroundImageList.clear();
        }
        this.f173114h2.addBackgroundImage(agoraImage);
        m190169U5(this.f173135o1.f180187v0);
    }

    /* JADX INFO: renamed from: U6 */
    public void m190334U6() {
        this.f14987H.f191101r = m190232n6();
        this.f14988I.m122852u();
    }

    /* JADX INFO: renamed from: U7 */
    public void m190335U7(int i, int i2, int i3, int i4) {
        this.f173031I1 = i / 1000;
        this.f173034J1 = i2;
        this.f14988I.m122843l("setVideoMixerBitrate:" + this.f173031I1 + ", fps:" + i2);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: V0 */
    public long mo20979V0() {
        return 0L;
    }

    /* JADX INFO: renamed from: V6 */
    public void m190336V6() {
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
        this.f14987H.f191080k = mo20952N1();
        this.f14987H.f191083l = mo20982W0();
        this.f14987H.f191101r = m190232n6();
        this.f14987H.f191034S = m20728Z1().f175512w;
        this.f14987H.f191036T = m20728Z1().f175513x;
        this.f14987H.f191038U = m190100A6();
        wvx wvxVar = this.f14987H;
        wvxVar.f191040V = this.f173134n3 ? 1L : 0L;
        wvxVar.f191032R = 1000L;
        uow uowVar = this.f15000s;
        wvxVar.f191009F0 = uowVar.f175451H;
        wvxVar.f191068g = uowVar.f180163H0 ? 2L : 0L;
        wvxVar.f191073h1 = uowVar.f180179X0 ? 1 : 0;
        wvx wvxVar2 = this.f14987H;
        wvxVar2.f191082k1 = this.f15000s.f180163H0 ? 1 : 0;
        wvxVar2.f191052a1 = this.f173031I1;
        wvxVar2.f191085l1 = u6y.m194722F().m194748a().getWidth();
        this.f14987H.f191088m1 = u6y.m194722F().m194748a().getHeight();
        this.f14987H.f191091n1 = u6y.m194722F().m194788w();
        this.f14987H.f191094o1 = this.f15000s.f180174S0;
        this.f14988I.m122826H();
    }

    /* JADX INFO: renamed from: V7 */
    public void m190337V7(int i, int i2, int i3, int i4, int i5) {
        VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration();
        videoEncoderConfiguration.frameRate = i3;
        VideoEncoderConfiguration.VideoDimensions videoDimensions = new VideoEncoderConfiguration.VideoDimensions();
        videoDimensions.width = i;
        videoDimensions.height = i2;
        videoEncoderConfiguration.bitrate = i4;
        if (csx.m112235R().m112372p()) {
            videoEncoderConfiguration.minBitrate = (int) (csx.m112235R().m112375q() * i4);
        }
        videoEncoderConfiguration.dimensions = videoDimensions;
        if (i5 == 100) {
            videoEncoderConfiguration.degradationPrefer = VideoEncoderConfiguration.DEGRADATION_PREFERENCE.DISABLED;
            this.f173103d3 = i5;
        }
        this.f14988I.m122843l("setVideoProfile", "width:" + i + ",height:" + i2 + ",fps:" + i3 + ", bitrate:" + i4 + ",min:" + csx.m112235R().m112372p() + ",degradationPrefer:" + i5);
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: W0 */
    public int mo20982W0() {
        return 0;
    }

    /* JADX INFO: renamed from: W6 */
    public void m190338W6(boolean z) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            if (!z) {
                if (this.f173009A3) {
                    return;
                }
                rtcEngine.registerAudioFrameObserver(null);
                this.f173104e1 = false;
                return;
            }
            if (!this.f173104e1) {
                rtcEngine.registerAudioFrameObserver(null);
                this.f14988I.m122843l("registerAudioFrameObserver 2417");
                this.f173068U.registerAudioFrameObserver(this);
            }
            this.f173104e1 = true;
            Log.e("lqdebug", "registerAudioFrameObserver this");
        }
    }

    /* JADX INFO: renamed from: W7 */
    public void m190339W7(gkl0 gkl0Var) {
        this.f173095b1 = gkl0Var;
        if (gkl0Var != null) {
            m190345Y7(1);
        }
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: X */
    public void mo20986X() {
        this.f173107f1 = false;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: X0 */
    public long mo20987X0() {
        return 0L;
    }

    /* JADX INFO: renamed from: X5 */
    public void m190340X5(boolean z) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            if (z) {
                rtcEngine.enableAudio();
            } else {
                rtcEngine.disableAudio();
            }
        }
    }

    /* JADX INFO: renamed from: X6 */
    public void m190341X6(int i, int i2) {
        if (this.f173068U != null) {
            this.f14988I.m122843l("enableDualStreamMode", Integer.valueOf(i), Integer.valueOf(i2));
            RtcEngine rtcEngine = this.f173068U;
            if (i2 == 0) {
                rtcEngine.setRemoteVideoStreamType(i, 0);
            } else {
                rtcEngine.setRemoteVideoStreamType(i, 1);
            }
        }
    }

    /* JADX INFO: renamed from: X7 */
    public void m190342X7(int i, double d) throws Throwable {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).setVolumeOfEffect(i, d * 100.0d);
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo20656Y(g510 g510Var, uow uowVar) {
        super.mo20656Y(g510Var, uowVar);
        this.f173033J0 = g510Var;
        if (uowVar == null) {
            return;
        }
        this.f173135o1 = (ror) uowVar;
        this.f14988I.m122843l("resetCodec:width" + uowVar.f175494m + ",height:" + uowVar.f175496n + ", videoBit:" + uowVar.f175451H);
        m190152P7();
        g510 g510Var2 = this.f173033J0;
        if (g510Var2 != null) {
            this.f173076W = g510Var2.m128993l();
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "videoWidth:" + this.f15000s.f175506s + ",videoHeight:" + this.f15000s.f175508t + ",visualWidth:" + this.f15000s.f175510u + ",visualHeight:" + this.f15000s.f175511v + ",encodeWidth:" + this.f15000s.f175494m + ",encodeHeight:" + this.f15000s.f175496n + ",videoBitrate:" + this.f15000s.f175451H + ",audioBitrate:" + this.f15000s.f175462S + ",videoFPS:" + this.f15000s.f175449F + ",codecFPS:" + this.f15000s.f180160E0 + ",mergeCanvasWidth:" + ((ror) this.f15000s).f175490k + ",mergeCanvasHeight:" + ((ror) this.f15000s).f175492l + ",codecFPS:" + this.f15000s.f180160E0 + ",isHard:" + this.f15000s.f180156A0);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: Y0 */
    public int mo20991Y0() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f173048O0;
        if (rtcStats != null) {
            return rtcStats.txVideoKBitRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y5 */
    public void m190343Y5(boolean z) {
        this.f173017D2 = z;
    }

    /* JADX INFO: renamed from: Y6 */
    public void m190344Y6() {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).resumeAllEffects();
        }
    }

    /* JADX INFO: renamed from: Y7 */
    public void m190345Y7(int i) {
        this.f14988I.m122843l("setYuvCallback 0115fix", Integer.valueOf(i));
        try {
            CongressUtil congressUtil = this.f173019E1;
            if (congressUtil != null) {
                if (i == 1) {
                    congressUtil.setRtcEngineHandler(this.f173068U.getNativeHandle());
                } else {
                    congressUtil.setRtcEngineHandler(0L);
                }
                this.f173019E1.setYuvCallback(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: Z6 */
    public void m190347Z6(int i) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).resumeEffect(i);
        }
    }

    /* JADX INFO: renamed from: Z7 */
    public void m190348Z7(int i, View view) {
        if (csx.m112235R().m112317b()) {
            Handler handler = this.f173128l3;
            if (handler != null) {
                handler.postAtFrontOfQueue(new RunnableC20276a(i, view));
                return;
            }
            return;
        }
        this.f14988I.m122843l("old setupRemoteVideo", i + ",view is " + view);
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.setupRemoteVideo(new VideoCanvas(view, 1, i));
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: a0 */
    public long mo20997a0() {
        return u6y.m194722F().m194770l();
    }

    /* JADX INFO: renamed from: a6 */
    public void m190349a6(boolean z, String str) {
        this.f173040L1 = z;
        this.f173037K1 = str;
        if (!z || this.f173068U == null || str == null || str.length() <= 0) {
            return;
        }
        t9c.m189747e("Pipeline_Normal_pip->PIPLINE->AGORA", "agora_sdk_ver: " + RtcEngine.getSdkVersion());
        this.f173068U.setParameters("{\"rtc.log_filter\":34781}");
        this.f173068U.setLogFile(this.f173037K1);
        this.f173068U.setLogFilter(15);
    }

    /* JADX INFO: renamed from: a7 */
    public void m190350a7() {
        this.f14988I.m122843l("resumeRecording");
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "resumeRecording");
        if (this.f173068U != null) {
            m190299G6(this.f173134n3);
            this.f173080X = true;
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: b1 */
    public long mo21000b1() {
        return 0L;
    }

    /* JADX INFO: renamed from: b6 */
    public void m190351b6(boolean z) {
        this.f14988I.m122843l("enableDualStreamMode", Boolean.valueOf(z));
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "call enableDualStreamMode:" + z);
        this.f173024G0 = z;
    }

    /* JADX INFO: renamed from: b7 */
    public void m190352b7() {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.resumeAudioMixing();
        }
    }

    /* JADX INFO: renamed from: b8 */
    public void m190353b8() {
        this.f173009A3 = true;
        if (this.f173104e1) {
            return;
        }
        this.f173068U.registerAudioFrameObserver(null);
        this.f14988I.m122843l("registerAudioFrameObserver 4416");
        this.f173068U.registerAudioFrameObserver(this);
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
        if (this.f14987H.f191058c1 == 1) {
            mo20738h2();
        } else {
            mo20736f2();
        }
    }

    /* JADX INFO: renamed from: c6 */
    public void m190354c6(boolean z) {
        RtcEngine rtcEngine = this.f173068U;
        int iEnableInEarMonitoring = rtcEngine != null ? rtcEngine.enableInEarMonitoring(z, 32768) : 0;
        this.f14988I.m122843l("agora enableInEarMonitoring enable " + z, "ret:", Integer.valueOf(iEnableInEarMonitoring));
    }

    /* JADX INFO: renamed from: c7 */
    public int m190355c7(int i) {
        this.f14988I.m122843l("selectAudioTrack:" + i);
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            return rtcEngine.selectAudioTrack(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c8 */
    public void m190356c8(String str) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "startSurroundMusic");
        if (this.f173007A1) {
            return;
        }
        this.f14988I.m122843l("startSurroundMusic", "" + str);
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.startAudioMixing(str, false, 1, 0);
            this.f173007A1 = true;
        }
        m190148O7(null, 1, 0);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, p153l.evx.InterfaceC16844b
    /* JADX INFO: renamed from: d1 */
    public void mo20733d1() {
        if (this.f173015C3) {
            return;
        }
        boolean z = this.f173168y3 > 0;
        if (this.f14987H.f191058c1 == 1) {
            m190336V6();
        } else {
            m190334U6();
        }
        if (z) {
            wvx wvxVar = this.f14987H;
            if (wvxVar.f191070g1 < this.f173168y3 || this.f173109f3) {
                return;
            }
            wvxVar.f191117y0 = 14L;
            wvxVar.f191081k0 = 14;
            this.f14988I.m122843l("MediaError", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_MAKE_FRIEND);
            q210.InterfaceC19500a interfaceC19500a = this.f173110g1;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(4353, 14, 0, this);
            }
            Handler handler = this.f173128l3;
            if (handler != null) {
                handler.post(new RunnableC20283h());
            }
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: d2 */
    public void mo20734d2() {
        if (this.f14987H.f191058c1 == 1) {
            mo20739i2();
        } else {
            mo20737g2();
        }
    }

    /* JADX INFO: renamed from: d6 */
    public void m190357d6(boolean z) {
        if (z) {
            this.f173028H1 = 1;
        } else {
            this.f173028H1 = 2;
        }
    }

    /* JADX INFO: renamed from: d7 */
    public void m190358d7(String str) {
        int i;
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null && this.f173072V == -1) {
            this.f173072V = rtcEngine.createDataStream(true, true);
        }
        RtcEngine rtcEngine2 = this.f173068U;
        if (rtcEngine2 == null || (i = this.f173072V) == -1) {
            return;
        }
        rtcEngine2.sendStreamMessage(i, str.getBytes());
    }

    /* JADX INFO: renamed from: d8 */
    public void m190359d8(String str, boolean z, boolean z2, int i) {
        if (this.f173007A1) {
            return;
        }
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.startAudioMixing(str, z, i);
            this.f173007A1 = true;
        }
        m190148O7(null, 1, 0);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e0 */
    public Surface mo20659e0() {
        return null;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: e1 */
    public void mo20660e1(l6m l6mVar) {
        super.mo20660e1(l6mVar);
        if (!(l6mVar instanceof ExtAudioWrapper)) {
            this.f14988I.m122843l("wrap is not ExtAudioWrapper");
        }
        l6m l6mVar2 = this.f14990K;
        if (l6mVar2 != null) {
            ((ExtAudioWrapper) l6mVar2).m144341r2();
            ((ExtAudioWrapper) this.f14990K).m21087J2(new C20279d());
            ((ExtAudioWrapper) this.f14990K).mo21127s1(1);
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m190360e6(boolean z) {
        this.f173027H0 = z;
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            if (!z || this.f173135o1 == null) {
                rtcEngine.disableVideo();
                return;
            }
            rtcEngine.enableVideo();
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "setVideoProfileEx1 bitrate:" + this.f173135o1.f175451H);
            this.f173068U.setParameters("{\"che.video.keyFrameInterval\":1}");
            ror rorVar = this.f173135o1;
            int i = rorVar.f180174S0;
            if (i == 0) {
                i = 15;
            }
            int i2 = i;
            if (rorVar.f180161F0 && rorVar.m197027d() == 1) {
                ror rorVar2 = this.f173135o1;
                m190337V7(rorVar2.f175496n, rorVar2.f175494m, i2, rorVar2.f175451H / 1000, rorVar2.f180182a1);
            } else {
                ror rorVar3 = this.f173135o1;
                m190337V7(rorVar3.f175494m, rorVar3.f175496n, i2, rorVar3.f175451H / 1000, rorVar3.f180182a1);
            }
        }
    }

    /* JADX INFO: renamed from: e7 */
    public void m190361e7(byte[] bArr) {
        int i;
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null && this.f173072V == -1) {
            this.f173072V = rtcEngine.createDataStream(true, true);
        }
        RtcEngine rtcEngine2 = this.f173068U;
        if (rtcEngine2 == null || (i = this.f173072V) == -1) {
            return;
        }
        rtcEngine2.sendStreamMessage(i, bArr);
    }

    /* JADX INFO: renamed from: e8 */
    public void m190362e8() {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).stopAllEffects();
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo20661f() {
        this.f14988I.m122843l("stopRecord");
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter stopRecord");
        this.f173080X = false;
        dc1 dc1Var = this.f173036K0;
        if (dc1Var != null) {
            dc1Var.m115188f();
            this.f173036K0 = null;
        }
        this.f173081X0 = 0;
        super.mo20661f();
        C20287l c20287l = this.f173099c2;
        if (c20287l != null) {
            c20287l.m190407a();
            this.f173099c2 = null;
        }
        stopSurroundMusic();
        release();
        PipelineConcurrentHashMap pipelineConcurrentHashMap = this.f173091Z2;
        if (pipelineConcurrentHashMap != null) {
            pipelineConcurrentHashMap.clear();
        }
        l6m l6mVar = this.f14990K;
        if (l6mVar != null) {
            ror rorVar = this.f173135o1;
            ((ExtAudioWrapper) l6mVar).m21086I2(2048, rorVar.f175459P, rorVar.f175461R, "Momo");
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
        csx.m112235R().m112244C1(1);
        PipelineConcurrentHashMap<Long, xhy> pipelineConcurrentHashMap2 = this.f173061S0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            t9c.m189743a("zhengjijian", "stopRecord memberInfoMap " + this.f173061S0.size());
            this.f173061S0.clear();
        }
        PipelineConcurrentHashMap<Long, iny> pipelineConcurrentHashMap3 = this.f173057R0;
        if (pipelineConcurrentHashMap3 != null && !pipelineConcurrentHashMap3.isEmpty()) {
            this.f173057R0.clear();
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "stopRecordOK!!!!!!!!!!!!!!!!!!!!");
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: f2 */
    public void mo20736f2() {
        this.f14988I.m122843l("pullStart_v3", Boolean.valueOf(this.f173171z3));
        if (this.f173171z3) {
            return;
        }
        this.f173171z3 = true;
        this.f14987H.f191067f1 = (!TextUtils.isEmpty(this.f173085Y0) || TextUtils.isEmpty(this.f173145r1)) ? 0L : 1L;
        this.f14987H.f191050a = System.currentTimeMillis();
        long j = this.f173112g3;
        wvx wvxVar = this.f14987H;
        if (j == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            wvx wvxVar2 = this.f14987H;
            wvxVar.f191062e = jCurrentTimeMillis - wvxVar2.f191062e;
            this.f173112g3 = wvxVar2.f191062e;
        } else {
            wvxVar.f191062e = j;
        }
        this.f14987H.f191065f = System.currentTimeMillis() - this.f14987H.f191065f;
        super.mo20736f2();
    }

    /* JADX INFO: renamed from: f6 */
    public void m190363f6(boolean z) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.enableWebSdkInteroperability(z);
        }
    }

    /* JADX INFO: renamed from: f7 */
    public void m190364f7(boolean z) {
        if (z) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "set double push");
        }
        this.f173102d2 = z;
        this.f173157v1 = z;
    }

    /* JADX INFO: renamed from: f8 */
    public void m190365f8(int i) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).stopEffect(i);
        }
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
        this.f173171z3 = false;
        this.f14988I.m122843l("pullStop_v3");
        wvx wvxVar = this.f14987H;
        wvxVar.f191078j0 = this.f173121j3;
        if (wvxVar.f191053b) {
            wvxVar.f191071h = System.currentTimeMillis() - this.f14987H.f191050a;
        }
        super.mo20737g2();
    }

    /* JADX INFO: renamed from: g6 */
    public void m190366g6(int i, int i2) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.setAudioProfile(i, i2);
            evx evxVar = this.f14988I;
            if (evxVar != null) {
                evxVar.m122843l("setAudioProfile", "profile:" + i + ",scenario:" + i2);
            }
            this.f14987H.f191003C0 = m190222k6(i);
        }
    }

    /* JADX INFO: renamed from: g7 */
    public int m190367g7(int i) {
        RtcEngine rtcEngine;
        this.f14988I.m122843l("setAudioEffectPreset", Integer.valueOf(i));
        int iM157615a = ma1.m157614b().m157615a(i);
        if (iM157615a == -1 || (rtcEngine = this.f173068U) == null) {
            return -1;
        }
        return rtcEngine.setAudioEffectPreset(iM157615a);
    }

    /* JADX INFO: renamed from: g8 */
    public void m190368g8() {
        if (!this.f173104e1) {
            this.f173068U.registerAudioFrameObserver(null);
        }
        this.f173009A3 = false;
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

    @Override // p153l.wyl
    public int getRoomType() {
        return this.f173139p1;
    }

    @Override // p153l.wyl
    public String getServerIpAddr() {
        return StringUtil.ALL_INTERFACES;
    }

    @Override // p153l.wyl
    public int getVideoWidth() {
        if (this.f173160w1 || this.f173157v1) {
            return 0;
        }
        return this.f15000s.f175494m;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: h0 */
    public int mo21012h0() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f173048O0;
        if (rtcStats != null) {
            return rtcStats.rxBytes;
        }
        return 0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: h1 */
    public int mo21013h1() {
        IRtcEngineEventHandler.RtcStats rtcStats = this.f173048O0;
        if (rtcStats != null) {
            return rtcStats.txAudioKBitRate;
        }
        return 0;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: h2 */
    public void mo20738h2() {
        this.f14988I.m122843l("pushStart_v3", Boolean.valueOf(this.f173171z3));
        if (this.f173171z3) {
            return;
        }
        this.f173171z3 = true;
        this.f14987H.f191067f1 = (!TextUtils.isEmpty(this.f173085Y0) || TextUtils.isEmpty(this.f173145r1)) ? 0L : 1L;
        this.f14987H.f191050a = System.currentTimeMillis();
        this.f14987H.f191110v = getVideoWidth();
        this.f14987H.f191112w = mo21021k0();
        this.f14987H.f191118z = mo21035p1();
        this.f14987H.f190998A = mo20913A0();
        long j = this.f173112g3;
        wvx wvxVar = this.f14987H;
        if (j == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            wvx wvxVar2 = this.f14987H;
            wvxVar.f191062e = jCurrentTimeMillis - wvxVar2.f191062e;
            this.f173112g3 = wvxVar2.f191062e;
        } else {
            wvxVar.f191062e = j;
        }
        this.f14987H.f191073h1 = this.f173135o1.f180179X0 ? 1 : 0;
        wvx wvxVar3 = this.f14987H;
        boolean z = this.f15000s.f180163H0;
        wvxVar3.f191068g = z ? 2L : 0L;
        wvxVar3.f191082k1 = z ? 1 : 0;
        super.mo20738h2();
    }

    /* JADX INFO: renamed from: h7 */
    public int m190369h7(int i) {
        this.f14988I.m122843l("setAudioMixingDualMonoMode:" + i);
        Constants.AudioMixingDualMonoMode audioMixingDualMonoMode = Constants.AudioMixingDualMonoMode.values()[i];
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            return rtcEngine.setAudioMixingDualMonoMode(audioMixingDualMonoMode);
        }
        return -1;
    }

    /* JADX INFO: renamed from: h8 */
    public int m190370h8(String str, String str2) {
        int iM190190a8;
        if (this.f173068U == null) {
            return -4;
        }
        this.f14988I.m122843l("subscribeOhterRoom", str, str2, "isStartMediaRelay:" + this.f173106e3 + ",my:" + this.f173135o1.f164228i1);
        if (!this.f14987H.f191053b || this.f173135o1 == null) {
            this.f173117i2 = true;
            this.f173120j2 = String.valueOf(str);
            iM190190a8 = 0;
        } else {
            iM190190a8 = m190190a8(str);
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "lqdebug startChannelMediaRelay ret " + iM190190a8 + "channelid =" + str + "myUid =" + str2);
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "lqdebug startChannelMediaRelay channelid =" + str + "dstUid =" + str2);
        return iM190190a8;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: i2 */
    public void mo20739i2() {
        this.f173171z3 = false;
        this.f14988I.m122843l("pushStop_v3");
        wvx wvxVar = this.f14987H;
        wvxVar.f191078j0 = this.f173121j3;
        if (wvxVar.f191053b) {
            wvxVar.f191071h = System.currentTimeMillis() - this.f14987H.f191050a;
        }
        super.mo20739i2();
    }

    /* JADX INFO: renamed from: i7 */
    public void m190372i7(int i) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.setAudioMixingPitch(i);
        }
    }

    /* JADX INFO: renamed from: i8 */
    public void m190373i8(int i, int i2, int i3) {
        gkl0 gkl0Var = this.f173095b1;
        if (gkl0Var != null) {
            gkl0Var.mo20125c(i, new C20277b(i2, i3, i), i2, i3);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: j1 */
    public long mo21018j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j6 */
    public int m190374j6(int i) {
        if (i != 0) {
            return i != 2 ? 2 : 5;
        }
        return 1;
    }

    /* JADX INFO: renamed from: j7 */
    public void m190375j7(boolean z) {
        this.f173160w1 = z;
        if (z) {
            this.f173027H0 = false;
        }
    }

    /* JADX INFO: renamed from: j8 */
    public void m190376j8(int i) {
        gkl0 gkl0Var = this.f173095b1;
        if (gkl0Var != null) {
            gkl0Var.mo20123a(i, new C20286k(i), this.width, this.height);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: k0 */
    public int mo21021k0() {
        if (this.f173160w1 || this.f173157v1) {
            return 0;
        }
        return this.f15000s.f175496n;
    }

    /* JADX INFO: renamed from: k7 */
    public void m190377k7(int i, int i2) {
        this.f14988I.m122843l("setmmLiveAudioProfile", "profile:" + i + ",scenario:" + i2);
        this.f173018E0 = i;
        this.f173021F0 = i2;
    }

    /* JADX INFO: renamed from: k8 */
    public int m190378k8(String str) {
        this.f14988I.m122843l("unSubscribeOtherRoom", str);
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine == null) {
            return -4;
        }
        int iStopChannelMediaRelay = rtcEngine.stopChannelMediaRelay();
        this.f14988I.m122843l("stopChannelMediaRelay ret:" + iStopChannelMediaRelay);
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "lqdebug stopChannelMediaRelay ");
        this.f173106e3 = false;
        return iStopChannelMediaRelay;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo20663l0(uow uowVar, EGLContext eGLContext) {
        if (uowVar == null || this.f173081X0 == 1) {
            return;
        }
        super.mo20654R0(uowVar, eGLContext);
        if (uowVar.f175473b0 && !this.f173131m3 && !this.f173160w1 && this.f173099c2 == null) {
            C20287l c20287l = new C20287l("live-media-aFFrame");
            this.f173099c2 = c20287l;
            c20287l.start();
        }
        if (!(uowVar instanceof ror)) {
            throw new InvalidParameterException("Parameters error");
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter startRecord");
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
        oq70VarM168791d.m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", sb.toString());
        this.f173135o1 = rorVar;
        if (uowVar.f180156A0 == MomoPipeline.DecodeType.SOFT_DECODE || rorVar.f175473b0) {
            this.f173064T = false;
        }
        this.f173036K0 = new dc1();
        g510 g510Var = this.f173033J0;
        if (g510Var != null) {
            this.f173076W = g510Var.m128993l();
        }
        if (csx.m112235R().m112372p()) {
            int iM112375q = (int) (csx.m112235R().m112375q() * (uowVar.f175451H / 1000));
            VideoEncoderConfiguration videoEncoderConfiguration = new VideoEncoderConfiguration();
            videoEncoderConfiguration.minBitrate = iM112375q;
            RtcEngine rtcEngine = this.f173068U;
            if (rtcEngine != null) {
                rtcEngine.setVideoEncoderConfiguration(videoEncoderConfiguration);
            }
            t9c.m189748f("agora_minkbs", "minBitrate parms = " + iM112375q);
        }
        this.f173150s3 = false;
        this.f173163x1 = false;
        this.f173153t3 = false;
        if (this.f173102d2) {
            m190345Y7(0);
            m190345Y7(1);
        }
        this.f173081X0 = 1;
        this.f14987H.f191058c1 = this.f173148s1;
        yt0.m217280g().m217295p(m20725W1(), yt0.f201475f);
        wvx wvxVar = this.f14987H;
        if (wvxVar.f191058c1 == 1) {
            wvxVar.f191001B0 = "M".equals(mo21051w1()) ? "AgoraMaster" : "AgoraSlaver";
        } else {
            wvxVar.f191001B0 = "AgoraAudience";
        }
        this.f14987H.f191061d1 = uowVar.m197027d();
        wvx wvxVar2 = this.f14987H;
        wvxVar2.f191055b1 = uowVar.f175473b0 ? 1L : 0L;
        wvxVar2.f191114x = uowVar.f180187v0;
        int i = uowVar.f175451H;
        this.f173137o3 = i;
        this.f173141p3 = uowVar.f180160E0;
        ror rorVar2 = this.f173135o1;
        wvxVar2.f191042W = rorVar2.f180157B0;
        wvxVar2.f191044X = rorVar2.f164226g1;
        wvxVar2.f191009F0 = i;
        if (this.f173068U != null) {
            wvxVar2.f191095p = RtcEngine.getSdkVersion();
        }
        this.f14987H.f191065f = System.currentTimeMillis();
        this.f14987H.f191009F0 = uowVar.f175451H;
        this.f14988I.m122843l("startRecordWithNotJoinRoom");
        csx.m112235R().m112244C1(csx.m112235R().m112279O0() ? 1 : 0);
        this.f14988I.m122843l("mrCoreParameters", Boolean.valueOf(csx.m112235R().m112279O0()));
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: l1 */
    public long mo21024l1() {
        return 0L;
    }

    /* JADX INFO: renamed from: l6 */
    public int m190379l6(int i) {
        return i != 1 ? 3 : 0;
    }

    /* JADX INFO: renamed from: l7 */
    public void m190380l7(int i) {
        this.f173119j1 = i;
    }

    /* JADX INFO: renamed from: l8 */
    public void m190381l8(String str) {
        this.f173145r1 = str;
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.renewToken(str);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: m0 */
    public int mo21027m0() {
        if (this.f173080X) {
            IRtcEngineEventHandler.LocalVideoStats localVideoStatsM190256t6 = m190256t6();
            if (localVideoStatsM190256t6 != null) {
                return localVideoStatsM190256t6.sentFrameRate;
            }
            return 0;
        }
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM190261u6 = m190261u6();
        if (remoteVideoStatsM190261u6 != null) {
            return remoteVideoStatsM190261u6.rendererOutputFrameRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: m6 */
    public int m190382m6() {
        this.f14988I.m122843l("getAudioTrackCount");
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            return rtcEngine.getAudioTrackCount();
        }
        return -1;
    }

    /* JADX INFO: renamed from: m7 */
    public void m190383m7(int i) {
        this.f14987H.f191074i = i;
    }

    /* JADX INFO: renamed from: m8 */
    public void m190384m8(String str) {
        this.f14988I.m122843l("updateRtmpUrl", str);
        if (this.f173068U == null || TextUtils.isEmpty(str) || this.f173114h2 == null) {
            this.f14988I.m122842k("updateRtmpUrl", "updateRtmpUrl error : engine" + this.f173068U + ", publishConfig:" + this.f173114h2 + ",path:" + str);
            return;
        }
        if (str.equals(this.f14987H.f191114x)) {
            this.f14988I.m122842k("updateRtmpUrl", "url  is no difference: newUrl:" + str + ",old is:" + this.f14987H.f191114x);
            return;
        }
        this.f14987H.f191114x = str;
        this.f173068U.startRtmpStreamWithTranscoding(str, this.f173114h2);
        MRtcPusherHandler mRtcPusherHandler = this.f173012B3;
        if (mRtcPusherHandler != null) {
            mRtcPusherHandler.onPushChangeStreamUrl(str);
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "updateRtmpUrl:url=".concat(str));
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: n0 */
    public long mo21029n0() {
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: n1 */
    public int mo21030n1() {
        return this.f173132n1;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: n2 */
    public void mo20745n2(uow uowVar) {
        super.mo20745n2(uowVar);
        uow uowVar2 = this.f15000s;
        ror rorVar = (ror) uowVar2;
        this.f173135o1 = rorVar;
        if (rorVar != null) {
            if (!this.f173064T || uowVar2.f180156A0 == MomoPipeline.DecodeType.SOFT_DECODE || ((ror) uowVar2).f175473b0) {
                uowVar2.f180156A0 = MomoPipeline.DecodeType.SOFT_DECODE;
            } else {
                uowVar2.f180156A0 = MomoPipeline.DecodeType.HARD_DECODE;
            }
        }
    }

    /* JADX INFO: renamed from: n7 */
    public void m190385n7(int i) {
        this.f14987H.f191104s = i;
        this.f14988I.m122843l("setBusinessType agora", Integer.valueOf(i));
        esx.m122399d("Pipeline_Normal_pip->PIPLINE->AGORA", "setBusinessType : " + i);
    }

    @Override // p153l.zej, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        this.texture_in = i;
        mo20652M1();
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o */
    public void mo20665o() {
        this.f14988I.m122843l("LeaveRoom");
        if (this.f173068U != null) {
            m190329S5();
            m190345Y7(0);
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "LeaveRoom >>>>>");
            this.f173068U.registerAudioFrameObserver(null);
            this.f173104e1 = false;
            String str = this.f15000s.f180187v0;
            if (str != null) {
                this.f173068U.stopRtmpStream(str);
            }
            this.f173068U.leaveChannel();
            if (this.f173015C3) {
                return;
            }
            this.f173015C3 = true;
            mo20734d2();
        }
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
    public double m190386o6() {
        RtcEngine rtcEngine = this.f173068U;
        return rtcEngine != null ? ((RtcEngineImpl) rtcEngine).getEffectsVolume() / 100.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: o7 */
    public void m190387o7(String str) {
        this.f173145r1 = str;
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
        if (this.f173036K0 != null && this.f173101d1 != null) {
            int i7 = i2 * i3 * i4;
            byte[] bArr = new byte[i7];
            byteBuffer.get(bArr, 0, i7);
            if (this.f173148s1 == 2) {
                this.f173101d1.mo109339C(new oxd0((this.f173135o1.f175461R == 1 || i4 != 1) ? bArr : jc00.m144336o2(bArr, i7), System.currentTimeMillis(), 2));
            } else {
                dc1 dc1Var = this.f173036K0;
                if (dc1Var != null) {
                    dc1Var.m115191i(new oxd0(bArr, System.currentTimeMillis(), i4));
                }
            }
            kod0 kod0Var = this.f173032I2;
            if (kod0Var != null) {
                kod0Var.mo20140m(bArr, i5, i4);
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
        oxd0 oxd0VarMo19373C;
        ByteBuffer byteBuffer2;
        this.f173123k1++;
        int i7 = i2 * i4 * i3;
        byte[] bArrM144336o2 = new byte[i7];
        if (!this.f173111g2) {
            byteBuffer.get(bArrM144336o2, 0, i7);
        }
        pcmDataAvailableCallback pcmdataavailablecallback = this.f173022F1;
        if (pcmdataavailablecallback != null) {
            pcmdataavailablecallback.onPcmDateCallback(this.f173135o1.f180157B0, bArrM144336o2, 44100, i4 != 1);
        }
        l6m l6mVar = this.f14990K;
        oxd0 oxd0Var = null;
        if (l6mVar != null) {
            ((ExtAudioWrapper) l6mVar).mo21100W1(this.f173116i1);
            ((ExtAudioWrapper) this.f14990K).m21086I2(2048, this.f173135o1.f175459P, i4, "Agora");
            oxd0VarMo19373C = ((ExtAudioWrapper) this.f14990K).mo19373C(new oxd0(bArrM144336o2, this.f173119j1, i4));
            if (oxd0VarMo19373C != null && (byteBuffer2 = oxd0VarMo19373C.f149639b) != null) {
                byteBuffer2.get(bArrM144336o2, 0, i7);
                byteBuffer.rewind();
                byteBuffer.put(bArrM144336o2);
                byteBuffer.rewind();
            }
        } else {
            oxd0VarMo19373C = null;
        }
        kod0 kod0Var = this.f173032I2;
        if (kod0Var != null) {
            kod0Var.mo20142o(bArrM144336o2, i5, i4);
        }
        if (this.f173101d1 != null && this.f173107f1) {
            if (this.f14990K != null) {
                dc1 dc1Var = this.f173036K0;
                if (dc1Var != null) {
                    dc1Var.m115192j(1.0f);
                    if (this.f173135o1.f180179X0) {
                        this.f173036K0.m115193k(1.0f);
                    }
                    oxd0Var = this.f173036K0.m115189g();
                }
                if (oxd0Var != null) {
                    dc1 dc1Var2 = this.f173036K0;
                    ByteBuffer byteBufferM115190h = oxd0VarMo19373C != null ? dc1Var2.m115190h(oxd0VarMo19373C.m169687c(), oxd0Var.m169687c(), oxd0Var.m169689e()) : dc1Var2.m115190h(bArrM144336o2, oxd0Var.m169687c(), oxd0Var.m169689e());
                    if (byteBufferM115190h != null) {
                        oxd0Var = new oxd0(byteBufferM115190h.array(), oxd0Var.m169688d(), i4);
                    }
                }
            }
            if (oxd0Var != null) {
                byte[] bArrM144336o3 = i4 == 1 ? jc00.m144336o2(oxd0Var.m169687c(), oxd0Var.m169689e()) : oxd0Var.m169687c();
                oxd0 oxd0Var2 = new oxd0(bArrM144336o3, this.f173119j1, 2);
                oxd0Var2.m169691g(false);
                dpl.InterfaceC16599a interfaceC16599a = this.f173101d1;
                if (interfaceC16599a != null) {
                    interfaceC16599a.mo109339C(oxd0Var2);
                    int i8 = this.f173165x3;
                    this.f173165x3 = i8 + 1;
                    if (i8 % 50 == 0) {
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "=====replace======:Agora send pcm to IJK ");
                    }
                }
                kod0 kod0Var2 = this.f173032I2;
                if (kod0Var2 != null) {
                    kod0Var2.mo20141n(bArrM144336o3, i5, i4);
                }
            } else if (this.f173148s1 != 2) {
                if (i4 == 1) {
                    bArrM144336o2 = jc00.m144336o2(bArrM144336o2, i7);
                }
                oxd0 oxd0Var3 = new oxd0(bArrM144336o2, this.f173119j1, 2);
                oxd0Var3.m169691g(false);
                dpl.InterfaceC16599a interfaceC16599a2 = this.f173101d1;
                if (interfaceC16599a2 != null) {
                    interfaceC16599a2.mo109339C(oxd0Var3);
                    int i9 = this.f173165x3;
                    this.f173165x3 = i9 + 1;
                    if (i9 % 50 == 0) {
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "=====replace======:Agora send pcm to IJK ");
                    }
                }
                kod0 kod0Var3 = this.f173032I2;
                if (kod0Var3 != null) {
                    kod0Var3.mo20141n(bArrM144336o2, i5, i4);
                }
            }
        }
        return true;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: p */
    public void mo20667p(String str, int i) {
        this.f14988I.m122843l("JoinRoom", str, Integer.valueOf(i));
        this.f173015C3 = false;
        this.f14987H.f191062e = System.currentTimeMillis();
        m190165T5(this.f173148s1, 33);
        m190104B6(str, this.f173135o1.f180157B0);
        String str2 = this.f173010B1;
        if (str2 != null && this.f173135o1.f164227h1 && this.f173013C1 == null) {
            m190406z7(str2);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: p1 */
    public int mo21035p1() {
        ror rorVar = this.f173135o1;
        int i = rorVar.f175490k;
        return i > 0 ? i : rorVar.f175506s;
    }

    /* JADX INFO: renamed from: p7 */
    public void m190388p7(boolean z) {
        this.f173044M2 = z;
        if (z) {
            m190345Y7(1);
        }
        evx evxVar = this.f14988I;
        if (evxVar != null) {
            evxVar.m122842k("setCustomPreview", "[" + z + com.clevertap.android.sdk.Constants.AES_SUFFIX);
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: q1 */
    public long mo21037q1() {
        return this.f173039L0;
    }

    /* JADX INFO: renamed from: q2 */
    public void m190389q2() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "AgoraPushFilter release");
        this.f14988I.m122843l("ReleaseNotLeave");
        boolean z = true;
        this.f173150s3 = true;
        this.f173080X = false;
        synchronized (this.f173151t1) {
            try {
                this.f14987H.f191051a0 = null;
                if (this.f173068U != null) {
                    x1f x1fVarM209047b = x1f.m209047b();
                    IRtcEngineEventHandler iRtcEngineEventHandler = this.f173043M1;
                    if (this.f173125k3 != 0) {
                        z = false;
                    }
                    x1fVarM209047b.m209048a(iRtcEngineEventHandler, z);
                    this.f173080X = false;
                    m20743l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                    this.f14989J = MomoCodec.MomoCodecState.STOP;
                    this.f173110g1.mo165950g(4097, 0, 0, this);
                    this.f173072V = -1;
                }
                this.f173080X = false;
                m20743l2(MediaBaseCodecFilter.CodecFilterState.FILTER_IDLE);
                this.f14989J = MomoCodec.MomoCodecState.STOP;
                this.f173110g1.mo165950g(4097, 0, 0, this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q6 */
    public long m190390q6() {
        if (!csx.m112235R().m112313a()) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        GLES20.glFlush();
        return jGlFenceSync;
    }

    /* JADX INFO: renamed from: q7 */
    public void m190391q7(boolean z) {
        this.f173108f2 = z;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: r0 */
    public long mo21040r0() {
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: r1 */
    public boolean mo20668r1() {
        return this.f173102d2;
    }

    /* JADX INFO: renamed from: r6 */
    public int m190392r6() {
        return this.f173073V0;
    }

    /* JADX INFO: renamed from: r7 */
    public int m190393r7(int i, hnw hnwVar) {
        this.f14988I.m122843l("setDualStreamMode", "mode:" + i + ",config:" + hnwVar.toString());
        SimulcastStreamConfig simulcastStreamConfig = new SimulcastStreamConfig();
        int i2 = hnwVar.f110837b;
        simulcastStreamConfig.bitrate = i2;
        simulcastStreamConfig.framerate = hnwVar.f110838c;
        VideoEncoderConfiguration.VideoDimensions videoDimensions = simulcastStreamConfig.dimensions;
        knw knwVar = hnwVar.f110836a;
        videoDimensions.height = knwVar.f127648b;
        videoDimensions.width = knwVar.f127647a;
        wvx wvxVar = this.f14987H;
        wvxVar.f191087m0 = i2;
        wvxVar.f191084l0 = i == 1 ? 1L : 0L;
        Constants.SimulcastStreamMode simulcastStreamMode = Constants.SimulcastStreamMode.AUTO_SIMULCAST_STREAM;
        if (i != -1) {
            if (i == 0) {
                simulcastStreamMode = Constants.SimulcastStreamMode.DISABLE_SIMULCAST_STREAM;
            } else if (i == 1) {
                simulcastStreamMode = Constants.SimulcastStreamMode.ENABLE_SIMULCAST_STREAM;
            }
        }
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            return rtcEngine.setDualStreamMode(simulcastStreamMode, simulcastStreamConfig);
        }
        return -1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: s0 */
    public int mo21043s0() {
        return 0;
    }

    /* JADX INFO: renamed from: s6 */
    public int m190394s6() {
        return this.f173077W0;
    }

    /* JADX INFO: renamed from: s7 */
    public void m190395s7(double d) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            ((RtcEngineImpl) rtcEngine).setEffectsVolume(d * 100.0d);
        }
    }

    public void stopSurroundMusic() {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "stopSurroundMusic:");
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.stopAudioMixing();
            this.f173007A1 = false;
        }
    }

    /* JADX INFO: renamed from: t7 */
    public void m190396t7(boolean z) {
        this.f173109f3 = z;
        this.f14988I.m122843l("setEnableConferenceReconnect:" + z);
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

    /* JADX INFO: renamed from: u7 */
    public int m190397u7(boolean z) {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            return rtcEngine.setEnableSpeakerphone(z);
        }
        return -1;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: v0 */
    public void mo20669v0(ByteBuffer byteBuffer) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "writevideo:" + byteBuffer.limit() + ";timeStamp:" + jCurrentTimeMillis);
        if (this.f173064T || !this.f173080X || this.f173131m3) {
            return;
        }
        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
        agoraVideoFrame.format = 1;
        agoraVideoFrame.timeStamp = System.currentTimeMillis();
        ror rorVar = this.f173135o1;
        agoraVideoFrame.stride = rorVar.f175494m;
        agoraVideoFrame.height = rorVar.f175496n;
        agoraVideoFrame.rotation = 0;
        agoraVideoFrame.buf = byteBuffer.array();
        synchronized (this.f173151t1) {
            try {
                if (this.f173068U != null && !this.f173150s3) {
                    this.f173068U.pushExternalVideoFrame(agoraVideoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i = this.f173154u1 + 1;
        this.f173154u1 = i;
        if (i >= 30 || this.f173157v1) {
            m190140M6();
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: w1 */
    public String mo21051w1() {
        ror rorVar = this.f173135o1;
        return (rorVar == null || rorVar.f164227h1) ? "M" : p7f.LATITUDE_SOUTH;
    }

    /* JADX INFO: renamed from: w6 */
    public float m190399w6() {
        return this.f173116i1;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: x1 */
    public long mo21053x1() {
        return this.f173123k1 * 1024;
    }

    /* JADX INFO: renamed from: x6 */
    public long m190401x6() {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x7 */
    public void m190402x7(String str) {
        boolean zHas;
        try {
            zHas = new JSONObject(str).has("che.audio.profile");
        } catch (Exception e) {
            e.printStackTrace();
            zHas = false;
        }
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine == null || zHas) {
            return;
        }
        rtcEngine.setParameters(str);
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y */
    public void mo20670y(int i, int i2) {
        this.f14988I.m122843l("agoraPusherFilter", "interval:" + i + ",smooth:" + i2);
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.enableAudioVolumeIndication(i, i2, true);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y0 */
    public void mo20671y0(int i, int i2, int i3) {
        this.f14988I.m122843l("agoraPusherFilter", "interval:" + i + ",smooth:" + i2);
        boolean z = i3 != 0;
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            rtcEngine.enableAudioVolumeIndication(i, i2, z);
        }
    }

    /* JADX INFO: renamed from: y6 */
    public long m190403y6() {
        RtcEngine rtcEngine = this.f173068U;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: z5 */
    public void m190405z5(MRtcEventHandler mRtcEventHandler) {
        this.f173058R1 = mRtcEventHandler;
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
    public void m190406z7(String str) {
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
        String str8 = BaseSei.f14625Y;
        String str9 = "pkmu";
        String str10 = "renderMode";
        if (this.f173135o1 == null || string == null) {
            return;
        }
        if (this.f173114h2 == null) {
            this.f173114h2 = new LiveTranscoding();
        }
        ror rorVar = this.f173135o1;
        String str11 = "alpha";
        int i4 = rorVar.f175490k;
        String str12 = BaseSei.f14626Z;
        LiveTranscoding liveTranscoding = this.f173114h2;
        String str13 = "h";
        if (i4 > 0) {
            liveTranscoding.width = i4;
            liveTranscoding.height = rorVar.f175492l;
            if (rorVar.f180161F0 && rorVar.m197027d() == 1) {
                LiveTranscoding liveTranscoding2 = this.f173114h2;
                ror rorVar2 = this.f173135o1;
                liveTranscoding2.width = rorVar2.f175492l;
                liveTranscoding2.height = rorVar2.f175490k;
            }
        } else {
            liveTranscoding.width = rorVar.f175506s;
            liveTranscoding.height = rorVar.f175508t;
        }
        this.f14988I.m122843l("setJsonForPostion publishConfig", "w:" + this.f173114h2.width, "h:" + this.f173114h2.height);
        LiveTranscoding liveTranscoding3 = this.f173114h2;
        if (liveTranscoding3.width <= 0 || liveTranscoding3.height <= 0) {
            return;
        }
        liveTranscoding3.backgroundColor = 0;
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
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                string = jSONObject.toString();
            } catch (Exception unused2) {
                this.f14988I.m122843l("setJsonForPostion parseInt err", "pos:" + string);
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
        this.f173114h2.setUsers((ArrayList<LiveTranscoding.TranscodingUser>) null);
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
                transcodingUser2.f64039x = 0;
                transcodingUser2.f64040y = 0;
                LiveTranscoding liveTranscoding4 = this.f173114h2;
                transcodingUser2.width = liveTranscoding4.width;
                transcodingUser2.height = liveTranscoding4.height;
                transcodingUser2.alpha = 1.0f;
                liveTranscoding4.addUser(transcodingUser2);
                this.f173114h2.userConfigExtraInfo = m190266v6(string);
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
            double d2 = (jSONObject3 == null || !jSONObject3.has(BaseSei.f14624X)) ? 0.0d : jSONObject3.getDouble(BaseSei.f14624X);
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
                            this.f14988I.m122843l("setJsonForPostion ", "id is empty string");
                            return;
                        }
                        transcodingUser.uid = Integer.parseInt(string3);
                        transcodingUser.zOrder = i2;
                        transcodingUser.alpha = 1.0f;
                        LiveTranscoding liveTranscoding5 = this.f173114h2;
                        int i6 = liveTranscoding5.width;
                        int i7 = i5;
                        String str15 = str14;
                        transcodingUser.f64039x = (int) (((double) i6) * d2);
                        int i8 = liveTranscoding5.height;
                        String str16 = str7;
                        String str17 = str8;
                        transcodingUser.f64040y = (int) (((double) i8) * d);
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
                    this.f14988I.m122843l("setJsonForPostion ", "id is empty string");
                    return;
                }
                transcodingUser.uid = Integer.parseInt(string3);
                transcodingUser.zOrder = i2;
                transcodingUser.alpha = 1.0f;
                LiveTranscoding liveTranscoding6 = this.f173114h2;
                int i9 = liveTranscoding6.width;
                int i10 = i5;
                String str18 = str14;
                transcodingUser.f64039x = (int) (((double) i9) * d2);
                int i11 = liveTranscoding6.height;
                String str19 = str7;
                String str110 = str8;
                transcodingUser.f64040y = (int) (((double) i11) * d);
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
                        this.f14988I.m122843l("setJsonForPostion ", "id is empty string");
                        return;
                    }
                    transcodingUser.uid = Integer.parseInt(string3);
                    transcodingUser.zOrder = i2;
                    transcodingUser.alpha = 1.0f;
                    LiveTranscoding liveTranscoding7 = this.f173114h2;
                    int i12 = liveTranscoding7.width;
                    int i13 = i5;
                    String str111 = str14;
                    transcodingUser.f64039x = (int) (((double) i12) * d2);
                    int i14 = liveTranscoding7.height;
                    String str112 = str7;
                    String str113 = str8;
                    transcodingUser.f64040y = (int) (((double) i14) * d);
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
                this.f14988I.m122843l("setJsonForPostion ", "id is empty string");
                return;
            }
            transcodingUser.uid = Integer.parseInt(string3);
            transcodingUser.zOrder = i2;
            transcodingUser.alpha = 1.0f;
            LiveTranscoding liveTranscoding8 = this.f173114h2;
            int i15 = liveTranscoding8.width;
            int i16 = i5;
            String str114 = str14;
            transcodingUser.f64039x = (int) (((double) i15) * d2);
            int i17 = liveTranscoding8.height;
            String str115 = str7;
            String str116 = str8;
            transcodingUser.f64040y = (int) (((double) i17) * d);
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
        this.f173114h2.userConfigExtraInfo = m190266v6(string);
        if (iOptInt == 1) {
            this.f173114h2.userConfigExtraInfo = m190240p6(string);
        }
        m190169U5(this.f173135o1.f180187v0);
    }

    /* JADX INFO: renamed from: l.tc0$d */
    public class C20279d implements ExtAudioWrapper.InterfaceC4259i {
        public C20279d() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4259i
        public int getStreamerType() {
            return 2;
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4259i
        /* JADX INFO: renamed from: b */
        public void mo21060b() {
        }

        @Override // com.momo.piplinemomoext.input.audio.ExtAudioWrapper.InterfaceC4259i
        /* JADX INFO: renamed from: a */
        public void mo21059a(String str) {
        }
    }

    /* JADX INFO: renamed from: l.tc0$e */
    public class C20280e extends IRtcEngineEventHandler {

        /* JADX INFO: renamed from: l.tc0$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f173185a;

            public a(int i) {
                this.f173185a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (tc0.this.f173089Z0 != null) {
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelAdded Audio: userID=" + this.f173185a);
                    tc0.this.f173089Z0.mo20117a((long) this.f173185a, null, 176, 176);
                }
            }
        }

        public C20280e() {
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioMixingStateChanged(int i, int i2) {
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onAudioMixingStateChanged", "state:" + i + ", reasonCode:" + i2);
            switch (i) {
                case Constants.AUDIO_MIXING_STATE_PLAYING /* 710 */:
                    if (tc0.this.f173032I2 != null) {
                        tc0.this.f173032I2.mo20131c();
                    }
                    break;
                case Constants.AUDIO_MIXING_STATE_PAUSED /* 711 */:
                    if (tc0.this.f173032I2 != null) {
                        tc0.this.f173032I2.mo20130b();
                    }
                    break;
                case Constants.AUDIO_MIXING_STATE_STOPPED /* 713 */:
                    if (i2 == 723) {
                        tc0.this.f173007A1 = false;
                        tc0.this.m190148O7(null, 2, 0);
                        if (tc0.this.f173058R1 != null) {
                            tc0.this.f173058R1.onAudioMixingFinished();
                        }
                        break;
                    } else if (i2 == 724 && tc0.this.f173032I2 != null) {
                        tc0.this.f173032I2.mo20132d();
                        break;
                    }
                    break;
                case Constants.AUDIO_MIXING_STATE_FAILED /* 714 */:
                    if (tc0.this.f173032I2 != null) {
                        tc0.this.f173032I2.mo20129a();
                    }
                    break;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onAudioQuality(int i, int i2, short s, short s2) {
            iny inyVar = (iny) tc0.this.f173057R0.get(Long.valueOf(i));
            if (inyVar != null) {
                inyVar.m141183j(s, s2);
            }
            if (tc0.this.f173074V1 != null) {
                tc0.this.f173074V1.onAudioQuality(i, i2, s, s2);
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
                if (i2 != 0 && i2 != tc0.this.f173135o1.f180157B0) {
                    tc0.this.f173049O1 = audioVolumeInfoArr;
                    if (tc0.this.f173055Q1 != null) {
                        AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[audioVolumeInfoArr.length];
                        for (int i3 = 0; i3 < audioVolumeInfoArr.length; i3++) {
                            AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                            audioVolumeWeight.uid = tc0.this.f173049O1[i3].uid;
                            audioVolumeWeight.volume = (tc0.this.f173049O1[i3].volume * 1.0f) / 255.0f;
                            audioVolumeWeightArr[i3] = audioVolumeWeight;
                        }
                        tc0.this.f173055Q1.onAudioVolumeIndication(audioVolumeWeightArr, i);
                    }
                    if (!tc0.this.f173134n3 && tc0.this.f173148s1 == 1) {
                        return;
                    }
                } else if (tc0.this.f173055Q1 != null) {
                    AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                    audioVolumeWeight2.uid = tc0.this.f173135o1.f180157B0;
                    if (tc0.this.f173134n3) {
                        audioVolumeWeight2.volume = 0.0f;
                    } else {
                        audioVolumeWeight2.volume = (audioVolumeInfoArr[0].volume * 1.0f) / 255.0f;
                    }
                    tc0.this.f173055Q1.onAudioVolumeIndication(new AudioVolumeWeight[]{audioVolumeWeight2}, i);
                }
                int i4 = audioVolumeInfoArr[0].uid;
                if (i4 == 0 || i4 == tc0.this.f173135o1.f180157B0) {
                    length = tc0.this.f173049O1 != null ? tc0.this.f173049O1.length + 1 : 1;
                    AudioVolumeWeight[] audioVolumeWeightArr2 = new AudioVolumeWeight[length];
                    AudioVolumeWeight audioVolumeWeight3 = new AudioVolumeWeight();
                    audioVolumeWeight3.uid = tc0.this.f173135o1.f180157B0;
                    if (tc0.this.f173134n3) {
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
                        audioVolumeWeight4.uid = tc0.this.f173049O1[i5].uid;
                        audioVolumeWeight4.volume = (tc0.this.f173049O1[i5].volume * 1.0f) / 255.0f;
                        audioVolumeWeight4.voicePitch = tc0.this.f173049O1[i5].voicePitch;
                        i5++;
                        audioVolumeWeightArr2[i5] = audioVolumeWeight4;
                    }
                    if (tc0.this.f173052P1 != null) {
                        tc0.this.f173052P1.onAudioVolumeIndication(audioVolumeWeightArr2, i);
                    }
                    tc0.this.f173049O1 = null;
                } else {
                    length = 1;
                }
            }
            if (tc0.this.f173148s1 == 1 || tc0.this.f173049O1 == null) {
                return;
            }
            AudioVolumeWeight[] audioVolumeWeightArr3 = new AudioVolumeWeight[length];
            new AudioVolumeWeight();
            for (int i6 = 0; i6 < length; i6++) {
                AudioVolumeWeight audioVolumeWeight5 = new AudioVolumeWeight();
                audioVolumeWeight5.uid = tc0.this.f173049O1[i6].uid;
                audioVolumeWeight5.volume = (tc0.this.f173049O1[i6].volume * 1.0f) / 255.0f;
                audioVolumeWeight5.voicePitch = tc0.this.f173049O1[i6].voicePitch;
                audioVolumeWeightArr3[i6] = audioVolumeWeight5;
            }
            if (tc0.this.f173052P1 != null) {
                tc0.this.f173052P1.onAudioVolumeIndication(audioVolumeWeightArr3, i);
            }
            tc0.this.f173049O1 = null;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x004d  */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onChannelMediaRelayStateChanged(int i, int i2) {
            int i3;
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onChannelMediaRelayStateChanged:", i + ", code:" + i2);
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "state" + i + ", code = " + i2);
            if (i == 0) {
                i3 = i2;
                if (i3 == 0) {
                    tc0.this.f173106e3 = false;
                    if (tc0.this.f173032I2 != null) {
                        tc0.this.f173032I2.mo20137i(0, "RELAY_STATE_IDLE");
                    }
                }
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "初始化状态 code" + i3);
            } else if (i == 2) {
                i3 = i2;
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", " 源频道主播成功加入目标频道 code " + i3);
                if (tc0.this.f173032I2 != null) {
                    tc0.this.f173032I2.mo20134f(0L, 1, "connect_success");
                }
            } else if (i != 3) {
                i3 = i2;
            } else {
                tc0.this.f173106e3 = false;
                if (tc0.this.f173032I2 != null) {
                    i3 = i2;
                    b7y.m102882c().m102886e("ConnectOtherRoom", "agora", i3, "onChannelMediaRelayStateChanged connect_failed", LogLevel.FATAL.value());
                    tc0.this.f173032I2.mo20134f(0L, 3, "connect_failed,code:" + i3);
                } else {
                    i3 = i2;
                }
            }
            if (i3 == 8) {
                tc0.this.f173110g1.mo165950g(4352, i3, 0, this);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onClientRoleChanged(int i, int i2, ClientRoleOptions clientRoleOptions) {
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onClientRoleChanged", Integer.valueOf(i), Integer.valueOf(i2));
            if (((MediaBaseCodecFilter) tc0.this).f14987H.f191053b) {
                long j = ((MediaBaseCodecFilter) tc0.this).f14987H.f191058c1;
                tc0 tc0Var = tc0.this;
                if (j == 1) {
                    tc0Var.mo20738h2();
                } else {
                    tc0Var.mo20736f2();
                }
            }
            if (tc0.this.f173082X1 != null) {
                tc0.this.f173082X1.onClientRoleChanged(i, i2);
            }
            if (tc0.this.f173032I2 != null) {
                tc0.this.f173032I2.mo20133e(i, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onConnectionStateChanged(int i, int i2) {
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onConnectionStateChanged", "state:" + i + ",reason:" + i2);
            switch (i2) {
                case 4:
                    ((MediaBaseCodecFilter) tc0.this).f14987H.f191117y0 = 810L;
                    ((MediaBaseCodecFilter) tc0.this).f14987H.f191081k0 = i2;
                    if (tc0.this.f173110g1 != null) {
                        tc0.this.f173110g1.mo165950g(4352, (int) ((MediaBaseCodecFilter) tc0.this).f14987H.f191117y0, i2, this);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    ((MediaBaseCodecFilter) tc0.this).f14987H.f191117y0 = i2 + 800;
                    ((MediaBaseCodecFilter) tc0.this).f14987H.f191081k0 = i2;
                    if (tc0.this.f173110g1 != null) {
                        tc0.this.f173110g1.mo165950g(4352, (int) ((MediaBaseCodecFilter) tc0.this).f14987H.f191117y0, i2, this);
                    }
                    break;
                case 10:
                    ((MediaBaseCodecFilter) tc0.this).f14987H.f191117y0 = 811L;
                    ((MediaBaseCodecFilter) tc0.this).f14987H.f191081k0 = i2;
                    if (tc0.this.f173110g1 != null) {
                        tc0.this.f173110g1.mo165950g(4352, (int) ((MediaBaseCodecFilter) tc0.this).f14987H.f191117y0, i2, this);
                    }
                    break;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i == 5 && i2 == 3) {
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onConnectionBanned");
                        if (tc0.this.f173078W1 != null) {
                            tc0.this.f173078W1.onReconnectTimeout();
                        }
                        if (tc0.this.f173032I2 != null) {
                            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onConnectionBannedByServer", "state:" + i + ",reason:" + i2);
                            tc0.this.f173032I2.mo20135g(i2);
                        }
                    }
                } else if (i2 == 2) {
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onConnectionInterrupted");
                    tc0.m190281z4(tc0.this);
                }
            } else if (tc0.this.f173128l3 != null) {
                tc0.this.f173128l3.removeCallbacks(tc0.this.f173041L2);
                tc0.this.f173121j3 = 0;
            }
            if (i2 == 15) {
                i = 6;
            }
            if (i2 == 16 && !tc0.this.f173109f3 && tc0.this.f173128l3 != null) {
                tc0.this.f173128l3.post(tc0.this.f173041L2);
            }
            if (tc0.this.f173032I2 != null) {
                ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onConnectionStateChanged", "state:" + i + ",reason:" + i2);
                tc0.this.f173032I2.mo20136h(i, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onError(int i) {
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("agora onError", Integer.valueOf(i));
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onJoinChannelSuccess(String str, int i, int i2) {
            int i3;
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onJoinChannelSuccess", str, Integer.valueOf(i), Integer.valueOf(i2));
            oq70 oq70VarM168791d = oq70.m168791d();
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
            oq70VarM168791d.m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", sb.toString());
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191053b = true;
            tc0.this.m20743l2(MediaBaseCodecFilter.CodecFilterState.FILTER_PLAY);
            if (tc0.this.f173068U != null) {
                tc0.this.f173080X = true;
            }
            ((MediaBaseCodecFilter) tc0.this).f14989J = MomoCodec.MomoCodecState.START;
            tc0.this.mo20731c2();
            tc0.this.m20730b2();
            tc0.this.f173110g1.mo165950g(4096, 0, 0, tc0.this);
            tc0.this.f173110g1.mo165950g(CommandMessage.COMMAND_GET_PUSH_STATUS, 0, 0, tc0.this);
            if ((tc0.this.f173160w1 || tc0.this.f173157v1) && tc0.this.f173025G1 != 0) {
                tc0.this.m190140M6();
            }
            tc0.this.f173115h3 = System.currentTimeMillis();
            if (tc0.this.f173117i2 && tc0.this.f173068U != null) {
                tc0 tc0Var = tc0.this;
                tc0Var.m190190a8(tc0Var.f173120j2);
                tc0.this.f173117i2 = false;
            }
            if (tc0.this.f173058R1 != null) {
                tc0.this.f173058R1.onJoinChannelSuccess(str, j, i2);
            }
            int i4 = tc0.this.f173034J1;
            tc0 tc0Var2 = tc0.this;
            if (i4 > 0) {
                i3 = tc0Var2.f173034J1;
            } else {
                i3 = tc0Var2.f173135o1.f180174S0 != 0 ? tc0.this.f173135o1.f180174S0 : 15;
            }
            int i5 = i3;
            int i6 = tc0.this.f173135o1.f175490k;
            tc0 tc0Var3 = tc0.this;
            if (i6 > 0) {
                tc0Var3.m190177W5(tc0Var3.f173135o1.f164227h1, tc0.this.f173135o1.f175490k, tc0.this.f173135o1.f175492l, tc0.this.f173031I1, i5, tc0.this.f173135o1.f180187v0);
            } else {
                tc0Var3.m190177W5(tc0Var3.f173135o1.f164227h1, tc0.this.f173135o1.f175506s, tc0.this.f173135o1.f175508t, tc0.this.f173031I1, i5, tc0.this.f173135o1.f180187v0);
            }
            if (!tc0.this.f173135o1.f164227h1 || tc0.this.f173114h2.getUsers().size() <= 0 || tc0.this.f173159v3 || TextUtils.isEmpty(tc0.this.f173135o1.f180187v0)) {
                return;
            }
            tc0 tc0Var4 = tc0.this;
            tc0Var4.m190130J7(tc0Var4.f173135o1.f180187v0);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLastmileQuality(int i) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onLastmileQuality " + i);
            tc0.this.f173110g1.mo165950g(4101, i, 0, tc0.this);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + " onLeaveChannelstats:" + rtcStats);
            if (rtcStats != null) {
                ((MediaBaseCodecFilter) tc0.this).f14987H.f191000B = rtcStats.txBytes;
                t9c.m189743a("AgoraJzheng", "" + rtcStats.txBytes + "/" + rtcStats.totalDuration);
            }
            if (tc0.this.f173029H2 != null) {
                tc0.this.f173029H2.onExitRoom();
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLocalAudioStateChanged(int i, int i2) {
            if (tc0.this.f173032I2 != null) {
                tc0.this.f173032I2.mo20138k(i, i2);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onLocalVideoStats(Constants.VideoSourceType videoSourceType, IRtcEngineEventHandler.LocalVideoStats localVideoStats) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onLocalVideoStatsstats:" + localVideoStats);
            tc0.this.f173054Q0 = localVideoStats;
            if (localVideoStats != null) {
                ((MediaBaseCodecFilter) tc0.this).f14987H.f191068g = ((MediaBaseCodecFilter) tc0.this).f15000s.f180163H0 ? 2L : 0L;
                ((MediaBaseCodecFilter) tc0.this).f14987H.f191012H = localVideoStats.encodedFrameCount;
            }
            if (tc0.this.f173065T0 = false) {
                tc0.this.f173065T0 = true;
                tc0.this.f173069U0 = false;
                tc0.this.f173110g1.mo165950g(4099, 0, 0, tc0.this);
                tc0.m190158R4(tc0.this);
            }
            if (tc0.this.f173070U1 != null) {
                tc0.this.f173093a2.f115838a = tc0.this.f173054Q0.sentBitrate;
                tc0.this.f173093a2.f115839b = tc0.this.f173054Q0.sentFrameRate;
                tc0.this.f173070U1.mo20120b(tc0.this.f173093a2);
            }
            int i = localVideoStats.targetBitrate * 1000;
            int i2 = localVideoStats.targetFrameRate;
            if (i == 0 || i2 == 0) {
                return;
            }
            if (tc0.this.f173137o3 == i && tc0.this.f173141p3 == i2) {
                return;
            }
            if (tc0.this.f173137o3 > i || tc0.this.f173141p3 > i2) {
                tc0.this.f173110g1.mo165950g(8197, 1, 0, this);
            } else {
                tc0.this.f173110g1.mo165950g(8197, 0, 0, this);
            }
            tc0.this.f173137o3 = i;
            tc0.this.f173141p3 = i2;
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onMediaEngineLoadSuccess() {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onMediaEngineLoadSuccess");
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onNetworkQuality(int i, int i2, int i3) {
            if (tc0.this.f173074V1 != null) {
                tc0.this.f173074V1.onNetworkQuality(i, i2, i3);
            }
            if (tc0.this.f173032I2 != null) {
                if (i == 0) {
                    i = tc0.this.f173135o1.f180157B0;
                    ((MediaBaseCodecFilter) tc0.this).f14987H.f191099q0 = i2;
                    ((MediaBaseCodecFilter) tc0.this).f14987H.f191102r0 = i3;
                }
                tc0.this.f173032I2.mo20139l(i, i2, i3);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRejoinChannelSuccess(String str, int i, int i2) {
            oq70.m168791d().m168795c("MyEngineEventHandler", "onRejoinChannelSuccess " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteAudioStateChanged(int i, int i2, int i3, int i4) {
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onRemoteAudioStateChanged", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            if (i2 == 1) {
                super.onRemoteAudioStateChanged(i, i2, i3, i4);
                long j = i;
                xhy xhyVar = (xhy) tc0.this.f173061S0.get(Long.valueOf(j));
                if (xhyVar == null || xhyVar.m211086e()) {
                    return;
                }
                xhyVar.m211089h(true);
                ((MediaBaseCodecFilter) tc0.this).f14988I.m122835b(xhyVar.m211084c(), j, tc0.this.f173112g3, xhyVar.m211082a(), System.currentTimeMillis() - xhyVar.m211083b());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteAudioStats(IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats) {
            iny inyVar;
            if (remoteAudioStats == null || (inyVar = (iny) tc0.this.f173057R0.get(Long.valueOf(remoteAudioStats.uid))) == null) {
                return;
            }
            inyVar.f116023a = remoteAudioStats.receivedBitrate;
            int i = inyVar.f116042t;
            int i2 = remoteAudioStats.plcCount;
            inyVar.f116042t = i + i2;
            inyVar.f116043u += remoteAudioStats.frozenRateByCustomPlcCount;
            inyVar.f116048z += remoteAudioStats.audioLossRate * 10;
            int i3 = inyVar.f116012A;
            int i4 = remoteAudioStats.networkTransportDelay;
            inyVar.f116012A = i3 + i4;
            inyVar.f116032j += remoteAudioStats.jitterBufferDelay + i4;
            inyVar.f116013B++;
            inyVar.f116017F += i2 * 10;
            inyVar.f116028f = remoteAudioStats.rxAudioBytes;
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteVideoStateChanged(int i, int i2, int i3, int i4) {
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onRemoteVideoStateChanged", "uid:" + i + ", state:" + i2 + ", reason:" + i3);
            if (i2 == 1 && i3 == 6) {
                tc0 tc0Var = tc0.this;
                tc0Var.f173083X2 = i;
                boolean zContains = tc0Var.f173127l2.contains(Integer.valueOf(i));
                tc0 tc0Var2 = tc0.this;
                if (!zContains) {
                    tc0Var2.m190320O6(i, i4);
                    return;
                }
                if (((MediaBaseCodecFilter) tc0Var2).f14988I != null) {
                    ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onRemoteVideoStateChanged remoteUid " + i + ",text");
                }
                tc0.this.m190376j8(i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteVideoStats(IRtcEngineEventHandler.RemoteVideoStats remoteVideoStats) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", " onRemoteVideoStatsstats:" + remoteVideoStats + "w " + remoteVideoStats.width + " h " + remoteVideoStats.height + " bits " + remoteVideoStats.receivedBitrate + " fps " + remoteVideoStats.rendererOutputFrameRate);
            iny inyVar = (iny) tc0.this.f173057R0.get(Long.valueOf((long) remoteVideoStats.uid));
            if (inyVar != null) {
                inyVar.m141184k(remoteVideoStats.receivedBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
                inyVar.f116035m = remoteVideoStats.packetLossRate;
                inyVar.f116027e = remoteVideoStats.rxVideoBytes;
                inyVar.f116025c += (long) remoteVideoStats.decoderOutputFrameRate;
                inyVar.f116014C++;
                inyVar.f116034l = remoteVideoStats.e2eDelay;
                int i = remoteVideoStats.totalFrozenTime;
                int i2 = inyVar.f116019H;
                if (i - i2 > 0) {
                    inyVar.f116018G += i - i2;
                }
                inyVar.f116019H = i;
            }
            tc0.this.f173051P0 = remoteVideoStats;
            if (tc0.this.f173070U1 != null) {
                tc0.this.f173096b2.f175656b = tc0.this.f173051P0.delay;
                tc0.this.f173096b2.f175658d = tc0.this.f173051P0.height;
                tc0.this.f173096b2.f175656b = tc0.this.f173051P0.delay;
                tc0.this.f173096b2.f175659e = tc0.this.f173051P0.receivedBitrate;
                tc0.this.f173096b2.f175660f = tc0.this.f173051P0.rendererOutputFrameRate;
                tc0.this.f173096b2.f175661g = tc0.this.f173051P0.rxStreamType;
                tc0.this.f173096b2.f175655a = tc0.this.f173051P0.uid;
                tc0.this.f173096b2.f175657c = tc0.this.f173051P0.width;
                tc0.this.f173070U1.mo20119a(tc0.this.f173096b2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRemoteVideoTransportStats(int i, int i2, int i3, int i4) {
            iny inyVar;
            if (tc0.this.f173057R0 != null) {
                long j = i;
                if (!tc0.this.f173057R0.containsKey(Long.valueOf(j)) || (inyVar = (iny) tc0.this.f173057R0.get(Long.valueOf(j))) == null) {
                    return;
                }
                inyVar.f116024b = i4;
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onRtcStatsstats:" + rtcStats);
            tc0.this.f173048O0 = rtcStats;
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191000B = (long) tc0.this.f173048O0.txBytes;
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191026O = tc0.this.f173048O0.rxAudioKBitRate;
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191077j = tc0.this.f173048O0.rxBytes;
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191080k = tc0.this.f173048O0.rxVideoBytes;
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191083l = tc0.this.f173048O0.rxAudioBytes;
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191017J0 = tc0.this.f173048O0.txVideoBytes;
            ((MediaBaseCodecFilter) tc0.this).f14987H.f191015I0 = tc0.this.f173048O0.txAudioBytes;
            tc0.this.f173039L0 += (long) ((tc0.this.f173048O0.txVideoKBitRate * 1000) / 8);
            tc0.this.f173045N0 += (long) ((tc0.this.f173048O0.txAudioKBitRate * 1000) / 8);
            tc0.this.f173042M0 += (tc0.this.f173048O0.rxVideoKBitRate * 1000) / 8;
            tc0.this.f173110g1.mo165950g(4098, 0, 0, tc0.this);
            tc0.m190281z4(tc0.this);
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onRtmpStreamingStateChanged(String str, int i, int i2) {
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onRtmpStreamingStateChanged " + str + ",state:" + i + ",code:" + i2);
            evx evxVar = ((MediaBaseCodecFilter) tc0.this).f14988I;
            StringBuilder sb = new StringBuilder("");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            evxVar.m122842k("AgoraRtmpState", sb.toString());
            if (2 == i) {
                tc0.this.f173163x1 = true;
                if (tc0.this.f173114h2 != null && tc0.this.f173114h2.getUsers().size() > 0 && tc0.this.f173068U != null) {
                    tc0.this.f173068U.updateRtmpTranscoding(tc0.this.f173114h2);
                    tc0.this.m190290D6();
                    ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onRtmpStreamingStateChanged", "rtmpState updateRtmpTranscoding");
                }
                ((MediaBaseCodecFilter) tc0.this).f14987H.f191114x = str;
                tc0.this.f173153t3 = true;
                tc0.this.f173110g1.mo165950g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, tc0.this);
            }
            if (4 == i && ((i2 == 1 || i2 == 3 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 9 || i2 == 11 || i2 == 13 || i2 == 14 || i2 == 15) && tc0.this.f173032I2 != null)) {
                tc0.this.f173032I2.mo20143p(str, i2);
            }
            if (i == 0 || 4 == i) {
                tc0.this.f173163x1 = false;
            }
            if (tc0.this.f173032I2 != null) {
                tc0.this.f173032I2.mo20144q(str, i, i2, "agora", tc0.this.f173135o1.f164226g1, tc0.this.f173135o1.f180157B0);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onStreamMessage(int i, int i2, byte[] bArr) {
            if (tc0.this.f173062S1 != null) {
                tc0.this.f173062S1.onStreamMessage(i, i2, bArr);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
            if (tc0.this.f173062S1 != null) {
                tc0.this.f173062S1.onStreamMessageError(i, i2, i3, i4, i5);
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onTokenPrivilegeWillExpire(String str) {
            if (tc0.this.f173066T1 != null) {
                tc0.this.f173066T1.onTokenPrivilegeWillExpire(str);
            }
            if (tc0.this.f173062S1 != null) {
                tc0.this.f173062S1.onRequestChannelKey();
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserJoined(int i, int i2) {
            long j = i;
            xhy xhyVar = new xhy(j, p7f.LATITUDE_SOUTH.equals(tc0.this.mo21051w1()) ? 1 : 2);
            if (tc0.this.f173115h3 != -1) {
                xhyVar.m211091j(System.currentTimeMillis());
                xhyVar.m211090i(System.currentTimeMillis() - tc0.this.f173115h3);
            }
            tc0.this.f173061S0.put(Long.valueOf(j), xhyVar);
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122838e(true, xhyVar.m211084c(), j, tc0.this.f173112g3, xhyVar.m211082a());
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onUserJoined", "uid:" + i);
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + " onUserJoined:uid:" + i + ",elapsed:" + i2);
            if ((tc0.this.f173160w1 || tc0.this.f173157v1) && tc0.this.f173135o1.f164228i1 != i) {
                xhyVar.m211087f(true);
                xhyVar.m211088g(true);
                ((MediaBaseCodecFilter) tc0.this).f14988I.m122836c(true, xhyVar.m211084c(), j, tc0.this.f173112g3, xhyVar.m211082a(), -1L);
                tc0.this.f173110g1.mo165950g(8198, i, 0, tc0.this);
                tc0.this.f173128l3.post(new a(i));
            }
            tc0.this.f173057R0.put(Long.valueOf(j), new iny(j));
            if (tc0.this.f173058R1 != null) {
                tc0.this.f173058R1.onJoinChannelSuccess("", j, i2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserMuteAudio(int i, boolean z) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onUserMuteAudiouid:" + i + ",muted:" + z);
            iny inyVar = (iny) tc0.this.f173057R0.get(Long.valueOf((long) i));
            if (inyVar != null) {
                inyVar.m141180g(z);
            }
            if (tc0.this.f173058R1 != null) {
                tc0.this.f173058R1.onUserMuteAudio(i, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserMuteVideo(int i, boolean z) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onUserMuteVideouid:" + i + ",muted:" + z);
            iny inyVar = (iny) tc0.this.f173057R0.get(Long.valueOf((long) i));
            if (inyVar != null) {
                inyVar.m141181h(z);
            }
            if (tc0.this.f173058R1 != null) {
                tc0.this.f173058R1.onUserMuteVideo(i, z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onUserOffline(int i, int i2) {
            int i3 = i2;
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "onUserOffline:uid:" + i + ",reason:" + i3);
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onUserOffline uid:" + i + ",reason:" + i3);
            long j = 0;
            if (tc0.this.f173057R0 != null) {
                long j2 = i;
                if (tc0.this.f173057R0.containsKey(Long.valueOf(j2))) {
                    iny inyVar = (iny) tc0.this.f173057R0.get(Long.valueOf(j2));
                    j = inyVar != null ? inyVar.f116026d : 0L;
                    tc0.this.f173057R0.remove(Long.valueOf(j2));
                }
            }
            long j3 = j;
            if (tc0.this.f173061S0 != null) {
                long j4 = i;
                if (tc0.this.f173061S0.containsKey(Long.valueOf(j4))) {
                    t9c.m189743a("zhengjijian", "onMemberExit userid " + i + " reason " + i3);
                    if (((MediaBaseCodecFilter) tc0.this).f14987H.f191058c1 == 1) {
                        ((MediaBaseCodecFilter) tc0.this).f14988I.m122837d(true, ((xhy) tc0.this.f173061S0.get(Long.valueOf(j4))).m211084c(), j4, i3);
                        ((MediaBaseCodecFilter) tc0.this).f14988I.m122839f(true, ((xhy) tc0.this.f173061S0.get(Long.valueOf(j4))).m211084c(), j3, 0L, j4, i2);
                        i3 = i2;
                    }
                    tc0.this.f173110g1.mo165950g(8199, i, 0, tc0.this);
                }
            }
            if (tc0.this.f173089Z0 != null && (!tc0.this.f173102d2 || tc0.this.f173160w1 || tc0.this.f173157v1)) {
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemove userID=" + i);
                if (tc0.this.f173094a3.contains(Integer.valueOf(i)) && tc0.this.f173068U != null) {
                    tc0.this.m190348Z7(i, null);
                    tc0.this.f173094a3.remove(Integer.valueOf(i));
                }
                tc0.this.f173089Z0.mo20118b(i, i3);
                ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onVideoChannelRemove uid:" + i + ",reason:" + i3);
            }
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("isUseTextureView", Boolean.valueOf(tc0.this.f173135o1.f180181Z0));
            if (tc0.this.f173135o1.f180181Z0 && tc0.this.f173068U != null && tc0.this.f173091Z2 != null && tc0.this.f173091Z2.containsKey(Integer.valueOf(i))) {
                ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("setupRemoteVideoview null");
                tc0.this.m190348Z7(i, null);
                tc0.this.f173091Z2.remove(Integer.valueOf(i));
                if (tc0.this.f173098c1 != null) {
                    tc0.this.f173098c1.mo20122b(i, i3);
                }
            }
            if (tc0.this.f173058R1 != null) {
                tc0.this.f173058R1.onUserOffline(i, i3);
            }
            if (tc0.this.f173127l2.contains(Integer.valueOf(i)) && tc0.this.f173095b1 != null) {
                ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("remoteUidList removeid" + i);
                tc0.this.f173095b1.mo20124b((long) i, i3);
                tc0.this.f173127l2.remove(i);
            }
            if (tc0.this.f173169z1 != null) {
                if (tc0.this.f173169z1.containsKey(Integer.valueOf(i)) || i == tc0.this.f173135o1.f180157B0) {
                    if (i != tc0.this.f173135o1.f180157B0) {
                        tc0.this.f173169z1.remove(Integer.valueOf(i));
                    }
                    boolean z = tc0.this.f173102d2;
                    tc0 tc0Var = tc0.this;
                    if (!z) {
                        if (tc0Var.f173095b1 != null) {
                            long j5 = i;
                            tc0.this.f173095b1.mo20124b(j5, i3);
                            tc0.this.f173019E1.setVideoSurface(j5, null);
                            return;
                        }
                        return;
                    }
                    if (tc0Var.f173092a1 != null) {
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", getClass().getSimpleName() + "----onVideoChannelRemoveExt userID=" + i);
                        tc0.this.f173092a1.mo109338b((long) i, i3);
                    }
                }
            }
        }

        @Override // io.agora.rtc2.IRtcEngineEventHandler
        public void onVideoSizeChanged(Constants.VideoSourceType videoSourceType, int i, int i2, int i3, int i4) {
            Log.e("lqdebug", "onVideoSizeChanged uid" + i + ",width " + i2 + ", height" + i3);
            ((MediaBaseCodecFilter) tc0.this).f14988I.m122843l("onVideoSizeChanged uid:" + i + ", width:" + i2 + ", height:" + i3);
            if (tc0.this.f173032I2 == null || i == 0) {
                return;
            }
            tc0.this.f173032I2.m150596r(i, i2, i3);
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
    public void mo20657b0() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    /* JADX INFO: renamed from: B5 */
    public void m190285B5(upw upwVar) {
    }

    /* JADX INFO: renamed from: E5 */
    public void m190292E5(vpw vpwVar) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo20651K1(oxd0 oxd0Var) {
    }

    /* JADX INFO: renamed from: M5 */
    public void m190315M5(ypw ypwVar) {
    }

    /* JADX INFO: renamed from: Z5 */
    public void m190346Z5(boolean z) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: m1 */
    public void mo20664m1(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: v7 */
    public void m190398v7(String str) {
    }

    /* JADX INFO: renamed from: w7 */
    public void m190400w7(String str) {
    }

    /* JADX INFO: renamed from: C7 */
    public void m190288C7(boolean z, int i) {
    }

    /* JADX INFO: renamed from: i6 */
    public void m190371i6(long j, boolean z) {
    }

    /* JADX INFO: renamed from: y7 */
    public void m190404y7(boolean z, boolean z2) {
    }

    @RequiresApi(api = 15)
    public tc0(Context context, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar) {
        super(context);
        this.f173060S = "Pipeline_Normal_pip->PIPLINE->AGORA";
        this.f173064T = true;
        this.f173072V = -1;
        this.f173080X = false;
        this.f173084Y = false;
        this.f173088Z = false;
        this.f173122k0 = 2;
        this.f173138p0 = 3;
        this.f173018E0 = -1;
        this.f173021F0 = -1;
        this.f173024G0 = false;
        this.f173027H0 = true;
        this.f173030I0 = null;
        this.f173039L0 = 0L;
        this.f173042M0 = 0;
        this.f173045N0 = 0L;
        this.f173057R0 = new PipelineConcurrentHashMap<>();
        this.f173061S0 = new PipelineConcurrentHashMap<>();
        this.f173065T0 = false;
        this.f173069U0 = true;
        this.f173073V0 = 0;
        this.f173077W0 = 0;
        this.f173081X0 = 0;
        this.f173085Y0 = null;
        this.f173089Z0 = null;
        this.f173092a1 = null;
        this.f173095b1 = null;
        this.f173098c1 = null;
        this.f173104e1 = false;
        this.f173107f1 = false;
        this.f173113h1 = 1.0f;
        this.f173116i1 = 1.0f;
        this.f173119j1 = 44100;
        this.f173123k1 = 0;
        this.f173126l1 = 0;
        this.f173129m1 = 0;
        this.f173132n1 = 0;
        this.f173139p1 = -1;
        this.f173145r1 = null;
        this.f173148s1 = 1;
        this.f173151t1 = new Object();
        this.f173154u1 = 0;
        this.f173157v1 = false;
        this.f173160w1 = false;
        this.f173163x1 = false;
        this.f173166y1 = new Object();
        this.f173169z1 = new PipelineConcurrentHashMap();
        this.f173007A1 = false;
        this.f173016D1 = null;
        this.f173019E1 = null;
        this.f173025G1 = 0;
        this.f173028H1 = 2;
        this.f173031I1 = DetectDelayStopHelper.TYPE_DETECT_PICKNOISE;
        this.f173034J1 = 0;
        this.f173037K1 = "";
        this.f173040L1 = false;
        this.f173046N1 = null;
        this.f173049O1 = null;
        this.f173086Y1 = new xpw();
        this.f173090Z1 = new xpw();
        this.f173093a2 = new imw();
        this.f173096b2 = new tpw();
        this.f173102d2 = false;
        this.f173105e2 = false;
        this.f173108f2 = true;
        this.f173111g2 = false;
        this.f173114h2 = null;
        this.f173117i2 = false;
        this.f173124k2 = 0L;
        this.f173127l2 = new ArrayList<>(20);
        this.f173130m2 = 0;
        this.f173133n2 = 1;
        this.f173136o2 = 2;
        this.f173140p2 = 3;
        this.f173143q2 = 4;
        this.f173146r2 = 5;
        this.f173149s2 = 6;
        this.f173152t2 = 7;
        this.f173155u2 = 8;
        this.f173158v2 = null;
        this.f173161w2 = 0;
        this.f173164x2 = 1;
        this.f173167y2 = 2;
        this.f173170z2 = 3;
        this.f173008A2 = 0;
        this.f173011B2 = 1;
        this.f173014C2 = 2;
        this.f173017D2 = false;
        this.f173020E2 = Long.MIN_VALUE;
        this.f173023F2 = 1000L;
        this.f173026G2 = null;
        this.f173035J2 = 1;
        this.f173038K2 = System.currentTimeMillis();
        this.f173041L2 = null;
        this.f173044M2 = false;
        this.f173047N2 = 0.0f;
        this.f173050O2 = 0.0f;
        this.f173053P2 = 0.0f;
        this.f173056Q2 = 0.0f;
        this.f173059R2 = 0;
        this.f173063S2 = 0;
        this.f173067T2 = 0;
        this.f173071U2 = 0;
        this.f173075V2 = true;
        this.f173079W2 = false;
        this.f173083X2 = 0;
        this.f173087Y2 = false;
        this.f173091Z2 = new PipelineConcurrentHashMap();
        this.f173094a3 = new ArrayList<>(20);
        this.f173097b3 = "";
        this.f173100c3 = false;
        this.f173103d3 = 0;
        this.f173106e3 = false;
        this.f173109f3 = false;
        this.f173112g3 = -1L;
        this.f173115h3 = -1L;
        this.f173118i3 = 0;
        this.f173121j3 = 0;
        this.f173125k3 = 0;
        this.f173128l3 = new Handler(Looper.getMainLooper());
        this.f173131m3 = false;
        this.f173134n3 = false;
        this.f173137o3 = 0;
        this.f173141p3 = 0;
        this.f173144q3 = 0;
        this.f173147r3 = "";
        this.f173150s3 = false;
        this.f173153t3 = false;
        this.f173156u3 = 0L;
        this.f173159v3 = false;
        this.f173162w3 = false;
        this.f173165x3 = 0;
        this.f173168y3 = 0;
        this.f173171z3 = false;
        this.f173009A3 = false;
        this.f173015C3 = false;
        this.f173033J0 = g510Var;
        this.f173135o1 = (ror) uowVar;
        this.f173065T0 = false;
        this.f173069U0 = true;
        this.f173110g1 = interfaceC19500a;
        this.f173019E1 = new CongressUtil();
        m190212h6(uowVar);
        wvx wvxVar = this.f14987H;
        wvxVar.f191059d = 258L;
        wvxVar.f191064e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }

    /* JADX INFO: renamed from: l.tc0$j */
    public class SurfaceHolderCallbackC20285j implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f173193a;

        public SurfaceHolderCallbackC20285j(int i) {
            this.f173193a = i;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            tc0.this.f173019E1.setVideoSurface(this.f173193a, surfaceHolder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            tc0.this.f173019E1.setVideoSurface(this.f173193a, null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }
    }
}
