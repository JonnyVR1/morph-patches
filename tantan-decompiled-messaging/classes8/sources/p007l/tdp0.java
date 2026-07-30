package p007l;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
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
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import com.momo.piplineext.bean.MMLiveSubtitleErrorCode;
import com.momo.piplineext.bean.MMLiveSubtitleMode;
import com.momo.piplineext.bean.MMLiveSubtitleState;
import com.momo.piplineext.http.HttpWrapper;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.IAudioFrameProcessor;
import com.ss.bytertc.engine.IMediaPlayerEventHandler;
import com.ss.bytertc.engine.RTCEngineEx;
import com.ss.bytertc.engine.RTCRoomConfig;
import com.ss.bytertc.engine.RTCRoomEx;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.ss.bytertc.engine.audio.IMediaPlayer;
import com.ss.bytertc.engine.data.AudioChannel;
import com.ss.bytertc.engine.data.AudioEffectPlayerConfig;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioMixingType;
import com.ss.bytertc.engine.data.AudioProcessorMethod;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioPropertiesInfo;
import com.ss.bytertc.engine.data.AudioReportMode;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.data.EarMonitorMode;
import com.ss.bytertc.engine.data.EngineConfig;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.MediaPlayerConfig;
import com.ss.bytertc.engine.data.PlayerError;
import com.ss.bytertc.engine.data.PlayerEvent;
import com.ss.bytertc.engine.data.PlayerState;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.StreamSyncInfoConfig;
import com.ss.bytertc.engine.data.SubscribeState;
import com.ss.bytertc.engine.data.SubscribeStateChangeReason;
import com.ss.bytertc.engine.data.VideoBufferType;
import com.ss.bytertc.engine.data.VideoFrameData;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandlerEx;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandlerEx;
import com.ss.bytertc.engine.live.MixedStreamAudioConfig;
import com.ss.bytertc.engine.live.MixedStreamAudioProfile;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.MixedStreamLayoutRegionConfig;
import com.ss.bytertc.engine.live.MixedStreamLayoutRegionType;
import com.ss.bytertc.engine.live.MixedStreamMediaType;
import com.ss.bytertc.engine.live.MixedStreamPushTargetConfig;
import com.ss.bytertc.engine.live.MixedStreamPushTargetType;
import com.ss.bytertc.engine.live.MixedStreamRenderMode;
import com.ss.bytertc.engine.live.MixedStreamTaskErrorCode;
import com.ss.bytertc.engine.live.MixedStreamTaskEvent;
import com.ss.bytertc.engine.live.MixedStreamTaskInfo;
import com.ss.bytertc.engine.live.MixedStreamVideoCodecType;
import com.ss.bytertc.engine.live.MixedStreamVideoConfig;
import com.ss.bytertc.engine.type.AudioDeviceType;
import com.ss.bytertc.engine.type.AudioProfileType;
import com.ss.bytertc.engine.type.AudioScenarioType;
import com.ss.bytertc.engine.type.ChannelProfile;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteAudioStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RemoteVideoStats;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.type.SubtitleErrorCode;
import com.ss.bytertc.engine.type.SubtitleMessage;
import com.ss.bytertc.engine.type.SubtitleMode;
import com.ss.bytertc.engine.type.SubtitleState;
import com.ss.bytertc.engine.type.VoiceChangerType;
import com.ss.bytertc.engine.type.VoiceReverbType;
import com.ss.bytertc.engine.utils.IAudioFrame;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import l.a2l0;
import l.a9y;
import l.abc0;
import l.anw;
import l.b2l0;
import l.bkw;
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
import l.jkw;
import l.jod0;
import l.ley;
import l.m2m;
import l.mcj;
import l.mpd0;
import l.n8c;
import l.sml;
import l.st0;
import l.u3m;
import l.ulw;
import l.vlw;
import l.vmw;
import l.w1f;
import l.wb1;
import l.wmw;
import l.xmw;
import l.xxx;
import l.ymw;
import l.yw00;
import l.z1l0;
import l.za1;
import l.zmw;
import l.zmx;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class tdp0 extends MediaBaseCodecFilter implements sml, ewl, gw00.f {

    /* JADX INFO: renamed from: k3 */
    private static final float[] f4265k3 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A1 */
    private zmw f4266A1;

    /* JADX INFO: renamed from: A2 */
    private long f4267A2;

    /* JADX INFO: renamed from: B1 */
    private zmw f4268B1;

    /* JADX INFO: renamed from: B2 */
    private long f4269B2;

    /* JADX INFO: renamed from: C1 */
    private jjw f4270C1;

    /* JADX INFO: renamed from: C2 */
    private long f4271C2;

    /* JADX INFO: renamed from: D1 */
    private vmw f4272D1;

    /* JADX INFO: renamed from: D2 */
    private int f4273D2;

    /* JADX INFO: renamed from: E0 */
    private long f4274E0;

    /* JADX INFO: renamed from: E1 */
    private boolean f4275E1;

    /* JADX INFO: renamed from: E2 */
    private Handler f4276E2;

    /* JADX INFO: renamed from: F0 */
    private int f4277F0;

    /* JADX INFO: renamed from: F1 */
    private boolean f4278F1;

    /* JADX INFO: renamed from: F2 */
    private boolean f4279F2;

    /* JADX INFO: renamed from: G0 */
    private long f4280G0;

    /* JADX INFO: renamed from: G1 */
    private boolean f4281G1;

    /* JADX INFO: renamed from: G2 */
    private int f4282G2;

    /* JADX INFO: renamed from: H0 */
    private PipelineConcurrentHashMap<Long, ley> f4283H0;

    /* JADX INFO: renamed from: H1 */
    private boolean f4284H1;

    /* JADX INFO: renamed from: H2 */
    private int f4285H2;

    /* JADX INFO: renamed from: I0 */
    private PipelineConcurrentHashMap<Long, a9y> f4286I0;

    /* JADX INFO: renamed from: I1 */
    private long f4287I1;

    /* JADX INFO: renamed from: I2 */
    public final int f4288I2;

    /* JADX INFO: renamed from: J0 */
    private int f4289J0;

    /* JADX INFO: renamed from: J1 */
    private MRtcRealLayoutNotifyHander f4290J1;

    /* JADX INFO: renamed from: J2 */
    public final int f4291J2;

    /* JADX INFO: renamed from: K0 */
    private int f4292K0;

    /* JADX INFO: renamed from: K1 */
    private boolean f4293K1;

    /* JADX INFO: renamed from: K2 */
    private boolean f4294K2;

    /* JADX INFO: renamed from: L0 */
    private String f4295L0;

    /* JADX INFO: renamed from: L1 */
    private long f4296L1;

    /* JADX INFO: renamed from: L2 */
    private String f4297L2;

    /* JADX INFO: renamed from: M0 */
    private sml.a f4298M0;

    /* JADX INFO: renamed from: M1 */
    private long f4299M1;

    /* JADX INFO: renamed from: M2 */
    private m2m f4300M2;

    /* JADX INFO: renamed from: N0 */
    private boolean f4301N0;

    /* JADX INFO: renamed from: N1 */
    MRtcReceiveSeiHandler f4302N1;

    /* JADX INFO: renamed from: N2 */
    private jkw f4303N2;

    /* JADX INFO: renamed from: O0 */
    private boolean f4304O0;

    /* JADX INFO: renamed from: O1 */
    private MRtcExitRoomHandler f4305O1;

    /* JADX INFO: renamed from: O2 */
    private int f4306O2;

    /* JADX INFO: renamed from: P0 */
    private hu00.a f4307P0;

    /* JADX INFO: renamed from: P1 */
    private hgd0 f4308P1;

    /* JADX INFO: renamed from: P2 */
    IRTCEngineEventHandlerEx f4309P2;

    /* JADX INFO: renamed from: Q0 */
    private float f4310Q0;

    /* JADX INFO: renamed from: Q1 */
    private int f4311Q1;

    /* JADX INFO: renamed from: Q2 */
    IRTCEngineEventHandler f4312Q2;

    /* JADX INFO: renamed from: R0 */
    private float f4313R0;

    /* JADX INFO: renamed from: R1 */
    private long f4314R1;

    /* JADX INFO: renamed from: R2 */
    private IRTCRoomEventHandlerEx f4315R2;

    /* JADX INFO: renamed from: S */
    private final String f4316S;

    /* JADX INFO: renamed from: S0 */
    public int f4317S0;

    /* JADX INFO: renamed from: S1 */
    private Runnable f4318S1;

    /* JADX INFO: renamed from: S2 */
    private IRTCRoomEventHandler f4319S2;

    /* JADX INFO: renamed from: T */
    private boolean f4320T;

    /* JADX INFO: renamed from: T0 */
    private int f4321T0;

    /* JADX INFO: renamed from: T1 */
    private int f4322T1;

    /* JADX INFO: renamed from: T2 */
    private int f4323T2;

    /* JADX INFO: renamed from: U */
    private int f4324U;

    /* JADX INFO: renamed from: U0 */
    private int f4325U0;

    /* JADX INFO: renamed from: U1 */
    RTCEngineEx f4326U1;

    /* JADX INFO: renamed from: U2 */
    private int f4327U2;

    /* JADX INFO: renamed from: V */
    private EGLContext f4328V;

    /* JADX INFO: renamed from: V0 */
    private int f4329V0;

    /* JADX INFO: renamed from: V1 */
    RTCRoomEx f4330V1;

    /* JADX INFO: renamed from: V2 */
    private FileOutputStream f4331V2;

    /* JADX INFO: renamed from: W */
    private boolean f4332W;

    /* JADX INFO: renamed from: W0 */
    private qmr f4333W0;

    /* JADX INFO: renamed from: W1 */
    private int f4334W1;

    /* JADX INFO: renamed from: W2 */
    private IAudioFrameProcessor f4335W2;

    /* JADX INFO: renamed from: X */
    private boolean f4336X;

    /* JADX INFO: renamed from: X0 */
    protected int f4337X0;

    /* JADX INFO: renamed from: X1 */
    private volatile boolean f4338X1;

    /* JADX INFO: renamed from: X2 */
    private IAudioFrameObserver f4339X2;

    /* JADX INFO: renamed from: Y */
    private boolean f4340Y;

    /* JADX INFO: renamed from: Y0 */
    private String f4341Y0;

    /* JADX INFO: renamed from: Y1 */
    MixedStreamConfig f4342Y1;

    /* JADX INFO: renamed from: Y2 */
    private volatile boolean f4343Y2;

    /* JADX INFO: renamed from: Z */
    private String f4344Z;

    /* JADX INFO: renamed from: Z0 */
    private Object f4345Z0;

    /* JADX INFO: renamed from: Z1 */
    MixedStreamPushTargetConfig f4346Z1;

    /* JADX INFO: renamed from: Z2 */
    private boolean f4347Z2;

    /* JADX INFO: renamed from: a1 */
    private int f4348a1;

    /* JADX INFO: renamed from: a2 */
    private boolean f4349a2;

    /* JADX INFO: renamed from: a3 */
    private long f4350a3;

    /* JADX INFO: renamed from: b1 */
    private boolean f4351b1;

    /* JADX INFO: renamed from: b2 */
    private boolean f4352b2;

    /* JADX INFO: renamed from: b3 */
    private boolean f4353b3;

    /* JADX INFO: renamed from: c1 */
    private boolean f4354c1;

    /* JADX INFO: renamed from: c2 */
    private boolean f4355c2;

    /* JADX INFO: renamed from: c3 */
    private int f4356c3;

    /* JADX INFO: renamed from: d1 */
    private Object f4357d1;

    /* JADX INFO: renamed from: d2 */
    private boolean f4358d2;

    /* JADX INFO: renamed from: d3 */
    IMediaPlayerEventHandler f4359d3;

    /* JADX INFO: renamed from: e1 */
    private PipelineConcurrentHashMap f4360e1;

    /* JADX INFO: renamed from: e2 */
    private boolean f4361e2;

    /* JADX INFO: renamed from: e3 */
    private int f4362e3;

    /* JADX INFO: renamed from: f1 */
    private volatile boolean f4363f1;

    /* JADX INFO: renamed from: f2 */
    Timer f4364f2;

    /* JADX INFO: renamed from: f3 */
    private volatile boolean f4365f3;

    /* JADX INFO: renamed from: g1 */
    private String f4366g1;

    /* JADX INFO: renamed from: g2 */
    private boolean f4367g2;

    /* JADX INFO: renamed from: g3 */
    private boolean f4368g3;

    /* JADX INFO: renamed from: h1 */
    private String f4369h1;

    /* JADX INFO: renamed from: h2 */
    private String f4370h2;

    /* JADX INFO: renamed from: h3 */
    private MRtcPusherHandler f4371h3;

    /* JADX INFO: renamed from: i1 */
    public SurfaceTexture f4372i1;

    /* JADX INFO: renamed from: i2 */
    private String f4373i2;

    /* JADX INFO: renamed from: i3 */
    private String f4374i3;

    /* JADX INFO: renamed from: j1 */
    private CongressUtil f4375j1;

    /* JADX INFO: renamed from: j2 */
    private int f4376j2;

    /* JADX INFO: renamed from: j3 */
    private boolean f4377j3;

    /* JADX INFO: renamed from: k0 */
    private yw00 f4378k0;

    /* JADX INFO: renamed from: k1 */
    private pcmDataAvailableCallback f4379k1;

    /* JADX INFO: renamed from: k2 */
    private boolean f4380k2;

    /* JADX INFO: renamed from: l1 */
    private int f4381l1;

    /* JADX INFO: renamed from: l2 */
    private boolean f4382l2;

    /* JADX INFO: renamed from: m1 */
    private int f4383m1;

    /* JADX INFO: renamed from: m2 */
    private int f4384m2;

    /* JADX INFO: renamed from: n1 */
    private int f4385n1;

    /* JADX INFO: renamed from: n2 */
    private int f4386n2;

    /* JADX INFO: renamed from: o1 */
    private int f4387o1;

    /* JADX INFO: renamed from: o2 */
    private PipelineConcurrentHashMap f4388o2;

    /* JADX INFO: renamed from: p0 */
    private wb1 f4389p0;

    /* JADX INFO: renamed from: p1 */
    private String f4390p1;

    /* JADX INFO: renamed from: p2 */
    private ArrayList<String> f4391p2;

    /* JADX INFO: renamed from: q1 */
    private boolean f4392q1;

    /* JADX INFO: renamed from: q2 */
    private z1l0 f4393q2;

    /* JADX INFO: renamed from: r1 */
    private MRtcAudioHandler f4394r1;

    /* JADX INFO: renamed from: r2 */
    private a2l0 f4395r2;

    /* JADX INFO: renamed from: s1 */
    private MRtcAudioHandlerEx f4396s1;

    /* JADX INFO: renamed from: s2 */
    private cbl0 f4397s2;

    /* JADX INFO: renamed from: t1 */
    private MRtcEventHandler f4398t1;

    /* JADX INFO: renamed from: t2 */
    private b2l0 f4399t2;

    /* JADX INFO: renamed from: u1 */
    private MRtcChannelHandler f4400u1;

    /* JADX INFO: renamed from: u2 */
    private RemoteAudioPropertiesInfo[] f4401u2;

    /* JADX INFO: renamed from: v1 */
    private MRtcTokenWillExpireHander f4402v1;

    /* JADX INFO: renamed from: v2 */
    private RTCRoomStats f4403v2;

    /* JADX INFO: renamed from: w1 */
    private ymw f4404w1;

    /* JADX INFO: renamed from: w2 */
    private volatile int f4405w2;

    /* JADX INFO: renamed from: x1 */
    private MRtcQualityHandler f4406x1;

    /* JADX INFO: renamed from: x2 */
    private AudioProfileType f4407x2;

    /* JADX INFO: renamed from: y1 */
    private MRtcConnectHandler f4408y1;

    /* JADX INFO: renamed from: y2 */
    private AudioScenarioType f4409y2;

    /* JADX INFO: renamed from: z1 */
    private MRtcClientRoleChangedHandler f4410z1;

    /* JADX INFO: renamed from: z2 */
    Runnable f4411z2;

    /* JADX INFO: renamed from: l.tdp0$b */
    public class RunnableC0707b implements Runnable {
        public RunnableC0707b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            tdp0.this.m11094f();
        }
    }

    /* JADX INFO: renamed from: l.tdp0$c */
    public static /* synthetic */ class C0708c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4414a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f4415b;

        static {
            int[] iArr = new int[AudioProfileType.values().length];
            f4415b = iArr;
            try {
                iArr[AudioProfileType.AUDIO_PROFILE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4415b[AudioProfileType.AUDIO_PROFILE_FLUENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4415b[AudioProfileType.AUDIO_PROFILE_STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4415b[AudioProfileType.AUDIO_PROFILE_HD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4415b[AudioProfileType.AUDIO_PROFILE_STANDARD_STEREO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4415b[AudioProfileType.AUDIO_PROFILE_HD_MONO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ForwardStreamStateInfo.ForwardStreamState.values().length];
            f4414a = iArr2;
            try {
                iArr2[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4414a[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: l.tdp0$d */
    public class C0709d extends IRTCEngineEventHandlerEx {
        public C0709d() {
        }

        public void onLocalStreamStats(StreamIndex streamIndex, LocalStreamStats localStreamStats) {
            super.onLocalStreamStats(streamIndex, localStreamStats);
            if (streamIndex == StreamIndex.STREAM_INDEX_MAIN && localStreamStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).H.g = ((MediaBaseCodecFilter) tdp0.this).s.H0 ? 2L : 0L;
                ((MediaBaseCodecFilter) tdp0.this).H.H = localStreamStats.videoStats.encodedFrameCount;
                ((MediaBaseCodecFilter) tdp0.this).H.Q = localStreamStats.videoStats.encoderOutputFrameRate;
            }
            tdp0.m10930o4(tdp0.this);
        }

        public void onRemoteStreamStats(StreamKey streamKey, RemoteStreamStats remoteStreamStats) {
            ley leyVar;
            super.onRemoteStreamStats(streamKey, remoteStreamStats);
            if (streamKey.getStreamIndex() != StreamIndex.STREAM_INDEX_MAIN) {
                if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_3RD) {
                    tdp0.m10930o4(tdp0.this);
                    return;
                }
                return;
            }
            if (remoteStreamStats == null || (leyVar = (ley) tdp0.this.f4283H0.get(Long.valueOf(remoteStreamStats.uid))) == null) {
                return;
            }
            RemoteAudioStats remoteAudioStats = remoteStreamStats.audioStats;
            if (remoteAudioStats != null) {
                float f = remoteAudioStats.receivedKBitrate;
                leyVar.a = (long) f;
                int i = leyVar.t;
                int i2 = remoteAudioStats.concealmentEvent;
                leyVar.t = i + i2;
                leyVar.u += i2;
                float f2 = leyVar.z;
                float f3 = remoteAudioStats.audioLossRate;
                leyVar.z = (int) (f2 + (10.0f * f3));
                leyVar.A = leyVar.A;
                leyVar.k = ((int) f3) * 100;
                leyVar.j = (int) (((long) leyVar.j) + remoteAudioStats.e2eDelay);
                leyVar.B++;
                leyVar.f += (long) ((((int) f) / 8) * 2000);
                leyVar.F += remoteAudioStats.stallDuration;
            }
            RemoteVideoStats remoteVideoStats = remoteStreamStats.videoStats;
            if (remoteVideoStats != null) {
                leyVar.k((int) remoteVideoStats.receivedKBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
                RemoteVideoStats remoteVideoStats2 = remoteStreamStats.videoStats;
                leyVar.m = ((int) remoteVideoStats2.videoLossRate) * 100;
                leyVar.e += (long) ((((int) remoteVideoStats2.receivedKBitrate) / 8) * 2000);
                leyVar.c += (long) remoteVideoStats2.decoderOutputFrameRate;
                leyVar.C++;
                leyVar.l = (int) remoteVideoStats2.e2eDelay;
                leyVar.G += remoteVideoStats2.stallDuration;
            }
        }
    }

    /* JADX INFO: renamed from: l.tdp0$e */
    public class C0710e extends IRTCEngineEventHandler {

        /* JADX INFO: renamed from: l.tdp0$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ long f4418a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ RemoteStreamKey f4419b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f4420c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f4421d;

            /* JADX INFO: renamed from: l.tdp0$e$a$a, reason: collision with other inner class name */
            public class SurfaceHolderCallbackC0824a implements SurfaceHolder.Callback {
                public SurfaceHolderCallbackC0824a() {
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"surfaceChanged", "uid:" + a.this.f4418a + "w:" + i2 + ",h:" + i3});
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"surfaceCreated", "uid:" + a.this.f4418a});
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"surfaceDestroyed", "uid:" + a.this.f4418a});
                }
            }

            public a(long j, RemoteStreamKey remoteStreamKey, int i, int i2) {
                this.f4418a = j;
                this.f4419b = remoteStreamKey;
                this.f4420c = i;
                this.f4421d = i2;
            }

            @Override // java.lang.Runnable
            @RequiresApi(api = 15)
            public void run() {
                RTCEngineEx rTCEngineEx;
                ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onFirstRemoteVideoFrameDecoded", "mIsAttachedMode:" + tdp0.this.f4275E1 + ",mVideoTextureListener is" + tdp0.this.f4397s2 + ",isUseTextureView" + ((vlw) tdp0.this.f4333W0).Z0});
                if (tdp0.this.f4275E1 || tdp0.this.f4397s2 != null || ((vlw) tdp0.this.f4333W0).Z0) {
                    if (((vlw) tdp0.this.f4333W0).Z0) {
                        ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"useTextureView", "width:" + ((ccj) tdp0.this).width + ",height:" + ((ccj) tdp0.this).height});
                        TextureView textureView = new TextureView(tdp0.this.W1());
                        VideoCanvas videoCanvas = new VideoCanvas();
                        String userId = this.f4419b.getUserId();
                        videoCanvas.renderView = textureView;
                        videoCanvas.renderMode = 1;
                        RemoteStreamKey remoteStreamKey = new RemoteStreamKey(tdp0.this.f4333W0.f3960g1, userId, StreamIndex.STREAM_INDEX_MAIN);
                        if (tdp0.this.f4399t2 == null || (rTCEngineEx = tdp0.this.f4326U1) == null) {
                            return;
                        }
                        rTCEngineEx.setRemoteVideoCanvas(remoteStreamKey, videoCanvas);
                        tdp0.this.f4388o2.put(userId, textureView);
                        ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onVideoChannelAdded use textureView"});
                        tdp0.this.f4399t2.a(Integer.valueOf(userId).intValue(), textureView, ((ccj) tdp0.this).width, ((ccj) tdp0.this).height);
                        return;
                    }
                    return;
                }
                SurfaceView surfaceView = new SurfaceView(tdp0.this.W1());
                surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC0824a());
                VideoCanvas videoCanvas2 = new VideoCanvas();
                String userId2 = this.f4419b.getUserId();
                videoCanvas2.renderView = surfaceView;
                videoCanvas2.renderMode = 1;
                ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onFirstRemoteVideoFrameDecoded", "roomid:" + tdp0.this.f4333W0.f3960g1 + ",rtcEngine is" + tdp0.this.f4326U1});
                RemoteStreamKey remoteStreamKey2 = new RemoteStreamKey(tdp0.this.f4333W0.f3960g1, userId2, StreamIndex.STREAM_INDEX_MAIN);
                RTCEngineEx rTCEngineEx2 = tdp0.this.f4326U1;
                if (rTCEngineEx2 != null) {
                    rTCEngineEx2.setRemoteVideoCanvas(remoteStreamKey2, videoCanvas2);
                    tdp0.this.f4391p2.add(userId2);
                    if (tdp0.this.f4393q2 != null) {
                        tdp0.this.f4393q2.a(Integer.valueOf(userId2).intValue(), surfaceView, this.f4420c, this.f4421d);
                    }
                }
            }
        }

        public C0710e() {
        }

        public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
            super.onAudioDeviceStateChanged(str, audioDeviceType, i, i2);
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onAudioDeviceStateChanged", "device_type:" + audioDeviceType + ",error:" + i2});
            AudioDeviceType audioDeviceType2 = AudioDeviceType.AUDIO_DEVICE_TYPE_UNKNOWN;
        }

        public void onAudioMixingPlayingProgress(int i, long j) {
            super.onAudioMixingPlayingProgress(i, j);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004d A[PHI: r0
          0x004d: PHI (r0v3 int) = (r0v2 int), (r0v8 int), (r0v9 int), (r0v10 int), (r0v10 int), (r0v10 int), (r0v11 int), (r0v11 int) binds: [B:3:0x0029, B:5:0x002c, B:7:0x002f, B:24:0x0088, B:26:0x0090, B:27:0x0092, B:16:0x0042, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        public void onConnectionStateChanged(int i, int i2) {
            super.onConnectionStateChanged(i, i2);
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onConnectionStateChanged", "state:" + i + ",reason:" + i2});
            int i3 = 1;
            if (i != 1) {
                i3 = 2;
                if (i != 2) {
                    i3 = 3;
                    if (i != 3) {
                        i3 = 4;
                        if (i != 4) {
                            i3 = 5;
                            if (i == 5) {
                                if (tdp0.this.f4276E2 != null) {
                                    ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onConnectionStateChanged", "CONNECTION_STATE_RECONNECTED"});
                                    tdp0.this.f4276E2.removeCallbacks(tdp0.this.f4318S1);
                                    tdp0.this.f4273D2 = 0;
                                    tdp0.m10930o4(tdp0.this);
                                }
                                i = 6;
                            } else if (i == 7) {
                                if (tdp0.this.f4408y1 != null) {
                                    tdp0.this.f4408y1.onReconnectTimeout();
                                }
                            }
                        } else if (tdp0.this.f4276E2 != null && !tdp0.this.f4294K2) {
                            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onConnectionStateChanged", "CONNECTION_STATE_RECONNECTING"});
                            tdp0.this.f4276E2.post(tdp0.this.f4318S1);
                        }
                        i = i3;
                    } else {
                        i = i3;
                    }
                } else {
                    i = i3;
                }
            } else {
                i = i3;
            }
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"volc onConnectionStateChanged callback", "state:" + i + ",reason:" + i2});
            if (tdp0.this.f4308P1 != null) {
                tdp0.this.f4308P1.m9322h(i, i2);
            }
        }

        public void onError(int i) {
            super.onError(i);
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"RTCVideo onError", "err:" + i});
        }

        public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
            super.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        }

        public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
            super.onFirstRemoteAudioFrame(remoteStreamKey);
            Long lValueOf = Long.valueOf(remoteStreamKey.getUserId());
            long jLongValue = lValueOf.longValue();
            a9y a9yVar = (a9y) tdp0.this.f4286I0.get(lValueOf);
            if (a9yVar == null || a9yVar.e()) {
                return;
            }
            a9yVar.h(true);
            ((MediaBaseCodecFilter) tdp0.this).I.b(a9yVar.c(), jLongValue, tdp0.this.f4267A2, a9yVar.a(), System.currentTimeMillis() - a9yVar.b());
        }

        public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            super.onFirstRemoteVideoFrameDecoded(remoteStreamKey, videoFrameInfo);
            if (tdp0.this.W1() == null) {
                ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onFirstRemoteVideoFrameDecoded", "context is null"});
                return;
            }
            int width = videoFrameInfo.getWidth();
            int height = videoFrameInfo.getHeight();
            Long lValueOf = Long.valueOf(remoteStreamKey.getUserId());
            long jLongValue = lValueOf.longValue();
            a9y a9yVar = (a9y) tdp0.this.f4286I0.get(lValueOf);
            if (a9yVar != null && !a9yVar.d()) {
                n8c.a("zhengjijian", "agora get first idr");
                a9yVar.g(true);
                ((MediaBaseCodecFilter) tdp0.this).I.c(true, a9yVar.c(), jLongValue, tdp0.this.f4267A2, a9yVar.a(), System.currentTimeMillis() - a9yVar.b());
                tdp0.this.f4307P0.g(8198, (int) jLongValue, 0, tdp0.this);
            }
            if (tdp0.this.f4398t1 != null) {
                tdp0.this.f4398t1.onFirstRemoteVideoDecoded(jLongValue, width, height, 0);
                jLongValue = jLongValue;
            }
            tdp0.this.f4276E2.postAtFrontOfQueue(new a(jLongValue, remoteStreamKey, width, height));
        }

        public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            super.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
        }

        public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
            super.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
            int length = (tdp0.this.f4401u2 == null || tdp0.this.f4401u2.length == 0) ? 1 : tdp0.this.f4401u2.length + 1;
            AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[length];
            int i = 0;
            audioVolumeWeightArr[0] = new AudioVolumeWeight();
            if (tdp0.this.f4382l2) {
                audioVolumeWeightArr[0].volume = 0.0f;
            } else {
                audioVolumeWeightArr[0].volume = (localAudioPropertiesInfoArr[0].audioPropertiesInfo.linearVolume * 1.0f) / 100.0f;
            }
            audioVolumeWeightArr[0].uid = ((vlw) tdp0.this.f4333W0).B0;
            AudioVolumeWeight audioVolumeWeight = audioVolumeWeightArr[0];
            AudioPropertiesInfo audioPropertiesInfo = localAudioPropertiesInfoArr[0].audioPropertiesInfo;
            audioVolumeWeight.voicePitch = audioPropertiesInfo.voicePitch;
            int i2 = audioPropertiesInfo.vad;
            audioVolumeWeight.vad = i2;
            if (i2 <= 0) {
                audioVolumeWeight.vad = 0;
            }
            while (i < length - 1) {
                AudioVolumeWeight audioVolumeWeight2 = new AudioVolumeWeight();
                audioVolumeWeight2.uid = Integer.valueOf(tdp0.this.f4401u2[i].streamKey.getUserId()).intValue();
                audioVolumeWeight2.volume = (tdp0.this.f4401u2[i].audioPropertiesInfo.linearVolume * 1.0f) / 100.0f;
                audioVolumeWeight2.voicePitch = tdp0.this.f4401u2[i].audioPropertiesInfo.voicePitch;
                i++;
                audioVolumeWeightArr[i] = audioVolumeWeight2;
            }
            if (tdp0.this.f4394r1 != null) {
                tdp0.this.f4394r1.onAudioVolumeIndication(audioVolumeWeightArr, 100);
            }
        }

        public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
            super.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        }

        public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
            super.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        }

        public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
            super.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        }

        public void onLogReport(String str, JSONObject jSONObject) {
            super.onLogReport(str, jSONObject);
        }

        public void onLoginResult(String str, int i, int i2) {
            super.onLoginResult(str, i, i2);
        }

        public void onLogout(int i) {
            super.onLogout(i);
        }

        public void onMixedStreamEvent(MixedStreamTaskInfo mixedStreamTaskInfo, MixedStreamTaskEvent mixedStreamTaskEvent, MixedStreamTaskErrorCode mixedStreamTaskErrorCode) {
            super.onMixedStreamEvent(mixedStreamTaskInfo, mixedStreamTaskEvent, mixedStreamTaskErrorCode);
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onMixedStreamEvent", "event:" + mixedStreamTaskEvent.value() + ",error:" + mixedStreamTaskErrorCode.value()});
            if (mixedStreamTaskEvent == MixedStreamTaskEvent.START_SUCCESS) {
                tdp0.this.f4355c2 = true;
                tdp0 tdp0Var = tdp0.this;
                MixedStreamConfig mixedStreamConfig = tdp0Var.f4342Y1;
                MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = mixedStreamConfig.regions;
                int length = mixedStreamLayoutRegionConfigArr != null ? mixedStreamLayoutRegionConfigArr.length : 0;
                if (mixedStreamConfig != null && length > 0) {
                    RTCEngineEx rTCEngineEx = tdp0Var.f4326U1;
                    String str = tdp0Var.f4297L2;
                    tdp0 tdp0Var2 = tdp0.this;
                    rTCEngineEx.updatePushMixedStream(str, tdp0Var2.f4346Z1, tdp0Var2.f4342Y1);
                    ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onMixedStreamEvent", "rtmpState updateRtmpTranscoding regilen " + length});
                }
                if (!tdp0.this.f4347Z2) {
                    tdp0.this.f4347Z2 = true;
                    ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"notifyPublished", "onStreamMixingEvent  notifyPublished"});
                    tdp0.this.f4307P0.g(4104, 0, 0, tdp0.this);
                }
            } else if (mixedStreamTaskEvent == MixedStreamTaskEvent.START_FAILED && tdp0.this.f4308P1 != null) {
                tdp0.this.f4308P1.m9330p("", mixedStreamTaskErrorCode.value());
            }
            if (tdp0.this.f4308P1 != null) {
                tdp0.this.f4308P1.m9331q("", mixedStreamTaskEvent.value(), mixedStreamTaskErrorCode.value(), "volc", tdp0.this.f4333W0.f3960g1, ((vlw) tdp0.this.f4333W0).B0);
            }
        }

        public void onNetworkTimeSynchronized() {
            super.onNetworkTimeSynchronized();
        }

        public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
            super.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
            if (tdp0.this.f4334W1 == 1) {
                tdp0.this.f4401u2 = remoteAudioPropertiesInfoArr;
                return;
            }
            int length = remoteAudioPropertiesInfoArr.length;
            AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[length];
            new AudioVolumeWeight();
            for (int i2 = 0; i2 < length; i2++) {
                AudioVolumeWeight audioVolumeWeight = new AudioVolumeWeight();
                audioVolumeWeight.uid = Integer.valueOf(remoteAudioPropertiesInfoArr[i2].streamKey.getUserId()).intValue();
                AudioPropertiesInfo audioPropertiesInfo = remoteAudioPropertiesInfoArr[i2].audioPropertiesInfo;
                audioVolumeWeight.volume = (audioPropertiesInfo.linearVolume * 1.0f) / 100.0f;
                audioVolumeWeight.voicePitch = audioPropertiesInfo.voicePitch;
                audioVolumeWeightArr[i2] = audioVolumeWeight;
            }
            if (tdp0.this.f4394r1 != null) {
                tdp0.this.f4394r1.onAudioVolumeIndication(audioVolumeWeightArr, 100);
            }
        }

        public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
            super.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
        }

        public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            super.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
        }

        public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
            super.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        }

        public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
            super.onSEIMessageReceived(remoteStreamKey, byteBuffer);
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.get(bArr);
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                if (jSONObject.has("bType")) {
                    int iOptInt = jSONObject.optInt("bType");
                    ((MediaBaseCodecFilter) tdp0.this).H.s = iOptInt;
                    tdp0.m10930o4(tdp0.this);
                    hjx.d("Pipeline_Normal_pip->PIPLINE->VOLC", "onReceiveSEI getbType: " + iOptInt);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
            super.onSEIStreamUpdate(remoteStreamKey, sEIStreamUpdateEvent);
        }

        public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, StreamSyncInfoConfig.SyncInfoStreamType syncInfoStreamType, ByteBuffer byteBuffer) {
            super.onStreamSyncInfoReceived(remoteStreamKey, syncInfoStreamType, byteBuffer);
            tdp0.m10930o4(tdp0.this);
        }
    }

    /* JADX INFO: renamed from: l.tdp0$f */
    public class C0711f extends IRTCRoomEventHandlerEx {
        public C0711f() {
        }

        public void onUserPublishStream(RemoteStreamKey remoteStreamKey, boolean z, MediaStreamType mediaStreamType) {
            super.onUserPublishStream(remoteStreamKey, z, mediaStreamType);
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onUserPublishStream", "uid:" + remoteStreamKey.userId + ",type:" + mediaStreamType});
            int iIntValue = Integer.valueOf(remoteStreamKey.userId).intValue();
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
                tdp0.this.m10914j7(iIntValue, false);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO) {
                tdp0.this.m10865V7(iIntValue, false);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH) {
                tdp0.this.m10914j7(iIntValue, false);
                tdp0.this.m10865V7(iIntValue, false);
            }
            tdp0.m10930o4(tdp0.this);
        }

        public void onUserUnpublishStream(RemoteStreamKey remoteStreamKey, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
            super.onUserUnpublishStream(remoteStreamKey, mediaStreamType, streamRemoveReason);
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onUserUnpublishStream", "uid:" + remoteStreamKey.userId + ",type:" + mediaStreamType + ", reason:" + streamRemoveReason.toString()});
            int iIntValue = Integer.valueOf(remoteStreamKey.userId).intValue();
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
                tdp0.this.m10914j7(iIntValue, true);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO) {
                tdp0.this.m10865V7(iIntValue, true);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH) {
                tdp0.this.m10865V7(iIntValue, true);
                tdp0.this.m10914j7(iIntValue, true);
            }
            tdp0.m10930o4(tdp0.this);
        }
    }

    /* JADX INFO: renamed from: l.tdp0$g */
    public class C0712g extends zac0 {

        /* JADX INFO: renamed from: l.tdp0$g$a */
        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                boolean z = tdp0.this.f4377j3;
                C0712g c0712g = C0712g.this;
                if (z) {
                    if (TextUtils.isEmpty(tdp0.this.f4374i3)) {
                        return;
                    }
                    tdp0 tdp0Var = tdp0.this;
                    tdp0Var.m11118k2(tdp0Var.f4374i3);
                    return;
                }
                if (TextUtils.isEmpty(tdp0.this.f4366g1)) {
                    return;
                }
                tdp0 tdp0Var2 = tdp0.this;
                tdp0Var2.m11118k2(tdp0Var2.f4366g1);
            }
        }

        /* JADX INFO: renamed from: l.tdp0$g$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ long f4427a;

            public b(long j) {
                this.f4427a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (tdp0.this.f4393q2 != null) {
                    ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + "----onVideoChannelAdded Audio: userID=" + this.f4427a);
                    tdp0.this.f4393q2.a((long) ((int) this.f4427a), (SurfaceView) null, 176, 176);
                }
            }
        }

        public C0712g() {
        }

        @Override // p007l.zac0
        public void onAudioSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
            super.onAudioSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
        }

        public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onForwardStreamEvent", "eventInfos:" + forwardStreamEventInfoArr[0].event});
        }

        public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onForwardStreamStateChanged", "stateInfo:" + forwardStreamStateInfoArr[0].state});
            if (forwardStreamStateInfoArr.length == 0) {
                return;
            }
            int i = C0708c.f4414a[forwardStreamStateInfoArr[0].state.ordinal()];
            if (i == 1) {
                if (tdp0.this.f4308P1 != null) {
                    tdp0.this.f4308P1.m9320f(0L, 1, "connect_success");
                }
            } else {
                if (i != 2) {
                    return;
                }
                if (tdp0.this.f4308P1 != null) {
                    tdp0.this.f4308P1.m9320f(0L, 3, "connect_failed,code:" + forwardStreamStateInfoArr[0].error.value());
                }
                eyx.c().e("ConnectOtherRoom", "volc", forwardStreamStateInfoArr[0].error.value(), "strartForwardStreamToRoom failed", LogLevel.FATAL.value());
                tdp0.this.f4279F2 = false;
            }
        }

        @Override // p007l.zac0
        public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"volc onLeaveRoom"});
            if (rTCRoomStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).H.B = rTCRoomStats.txBytes;
            }
            if (tdp0.this.f4305O1 != null) {
                tdp0.this.f4305O1.onExitRoom();
            }
            if (tdp0.this.f4286I0 == null || tdp0.this.f4286I0.isEmpty()) {
                return;
            }
            Log.e("lqdebug", "onLeaveRoom");
            n8c.a("lqdebug", "stopRecord memberInfoMap " + tdp0.this.f4286I0.size());
            tdp0.this.f4286I0.clear();
        }

        @Override // p007l.zac0
        public void onLocalStreamStats(LocalStreamStats localStreamStats) {
            if (localStreamStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).H.g = ((MediaBaseCodecFilter) tdp0.this).s.H0 ? 2L : 0L;
                ((MediaBaseCodecFilter) tdp0.this).H.H = localStreamStats.videoStats.encodedFrameCount;
                ((MediaBaseCodecFilter) tdp0.this).H.Q = localStreamStats.videoStats.encoderOutputFrameRate;
            }
        }

        @Override // p007l.zac0
        public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
            super.onNetworkQuality(networkQualityStats, networkQualityStatsArr);
            if (networkQualityStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).H.q0 = networkQualityStats.txQuality;
                ((MediaBaseCodecFilter) tdp0.this).H.r0 = networkQualityStats.rxQuality;
            }
            try {
                if (tdp0.this.f4308P1 == null || networkQualityStats == null) {
                    return;
                }
                tdp0.this.f4308P1.m9326l(Integer.parseInt(networkQualityStats.uid), networkQualityStats.txQuality, networkQualityStats.rxQuality);
            } catch (Exception unused) {
            }
        }

        @Override // p007l.zac0
        public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
            ley leyVar;
            if (remoteStreamStats == null || (leyVar = (ley) tdp0.this.f4283H0.get(Long.valueOf(remoteStreamStats.uid))) == null) {
                return;
            }
            RemoteAudioStats remoteAudioStats = remoteStreamStats.audioStats;
            if (remoteAudioStats != null) {
                float f = remoteAudioStats.receivedKBitrate;
                leyVar.a = (long) f;
                int i = leyVar.t;
                int i2 = remoteAudioStats.concealmentEvent;
                leyVar.t = i + i2;
                leyVar.u += i2;
                float f2 = leyVar.z;
                float f3 = remoteAudioStats.audioLossRate;
                leyVar.z = (int) (f2 + (10.0f * f3));
                leyVar.A = leyVar.A;
                leyVar.k = ((int) f3) * 100;
                leyVar.j = (int) (((long) leyVar.j) + remoteAudioStats.e2eDelay);
                leyVar.B++;
                leyVar.f += (long) ((((int) f) / 8) * 2000);
                leyVar.F += remoteAudioStats.stallDuration;
            }
            RemoteVideoStats remoteVideoStats = remoteStreamStats.videoStats;
            if (remoteVideoStats != null) {
                leyVar.k((int) remoteVideoStats.receivedKBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
                RemoteVideoStats remoteVideoStats2 = remoteStreamStats.videoStats;
                leyVar.m = ((int) remoteVideoStats2.videoLossRate) * 100;
                leyVar.e += (long) ((((int) remoteVideoStats2.receivedKBitrate) / 8) * 2000);
                leyVar.c += (long) remoteVideoStats2.decoderOutputFrameRate;
                leyVar.C++;
                leyVar.l = (int) remoteVideoStats2.e2eDelay;
                leyVar.G += remoteVideoStats2.stallDuration;
            }
        }

        @Override // p007l.zac0
        public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
            super.onRoomBinaryMessageReceived(str, byteBuffer);
        }

        @Override // p007l.zac0
        public void onRoomMessageReceived(String str, String str2) {
            super.onRoomMessageReceived(str, str2);
            if (tdp0.this.f4400u1 != null) {
                tdp0.this.f4400u1.onStreamMessage(Integer.valueOf(str).intValue(), 0, str2.getBytes());
            }
        }

        @Override // p007l.zac0
        public void onRoomMessageSendResult(long j, int i) {
            super.onRoomMessageSendResult(j, i);
        }

        @Override // p007l.zac0
        public void onRoomStateChanged(String str, String str2, int i, String str3) {
            int i2;
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onRoomStateChanged", "roomId:" + str + ",enterRoomState:" + i + ", host：" + tdp0.this.f4333W0.f3961h1});
            tdp0 tdp0Var = tdp0.this;
            if (i != 0) {
                ((MediaBaseCodecFilter) tdp0Var).I.l(new Object[]{"onRoomStateChanged", "进房失败:roomState:" + i});
                if (tdp0.this.f4307P0 != null) {
                    if (i != -1084 && i != -1010 && i != -1009 && i != -1007) {
                        if (i == -1006) {
                            ((MediaBaseCodecFilter) tdp0.this).H.y0 = 814L;
                            ((MediaBaseCodecFilter) tdp0.this).H.k0 = i;
                            if (tdp0.this.f4308P1 != null) {
                                tdp0.this.f4308P1.m9321g(i);
                                return;
                            }
                            return;
                        }
                        if (i != -1001 && i != -1000) {
                            return;
                        }
                    }
                    int iA = w1f.a(i);
                    ((MediaBaseCodecFilter) tdp0.this).H.y0 = iA;
                    ((MediaBaseCodecFilter) tdp0.this).H.k0 = i;
                    tdp0.this.f4307P0.g(4352, iA, 0, tdp0.this);
                    return;
                }
                return;
            }
            ((MediaBaseCodecFilter) tdp0Var).J = MomoCodec.MomoCodecState.START;
            ((MediaBaseCodecFilter) tdp0.this).H.b = true;
            if (tdp0.this.f4333W0.f3961h1) {
                int i3 = tdp0.this.f4387o1;
                tdp0 tdp0Var2 = tdp0.this;
                if (i3 > 0) {
                    i2 = tdp0Var2.f4387o1;
                } else {
                    i2 = ((vlw) tdp0Var2.f4333W0).S0 != 0 ? ((vlw) tdp0.this.f4333W0).S0 : 15;
                }
                int i4 = i2;
                tdp0 tdp0Var3 = tdp0.this;
                tdp0Var3.m10887b6(tdp0Var3.f4333W0.f3961h1, ((ulw) tdp0.this.f4333W0).k, ((ulw) tdp0.this.f4333W0).l, tdp0.this.f4385n1, i4, ((vlw) tdp0.this.f4333W0).v0, str2);
                if (tdp0.this.f4333W0.f3961h1 && !tdp0.this.f4349a2 && !TextUtils.isEmpty(((vlw) tdp0.this.f4333W0).v0)) {
                    tdp0 tdp0Var4 = tdp0.this;
                    tdp0Var4.m10819H7(((vlw) tdp0Var4.f4333W0).v0);
                }
                tdp0 tdp0Var5 = tdp0.this;
                if (tdp0Var5.f4364f2 == null) {
                    tdp0Var5.f4364f2 = new Timer();
                    tdp0.this.f4364f2.schedule(new a(), 100L, 1000L);
                }
            }
            if ((tdp0.this.f4354c1 || tdp0.this.f4351b1) && tdp0.this.f4381l1 != 0) {
                tdp0.this.m10835M6();
            }
            if (tdp0.this.f4367g2) {
                tdp0 tdp0Var6 = tdp0.this;
                tdp0Var6.m10910i8(tdp0Var6.f4373i2, tdp0.this.f4370h2);
                tdp0.this.f4367g2 = false;
            }
            try {
                if (new JSONObject(str3).getInt("join_type") == 0) {
                    if (tdp0.this.f4398t1 != null) {
                        tdp0.this.f4398t1.onJoinChannelSuccess(str, ((vlw) tdp0.this.f4333W0).B0, 0);
                    }
                    tdp0.this.f4271C2 = System.currentTimeMillis();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            tdp0.this.f4338X1 = true;
            tdp0.this.f4307P0.g(8192, 0, 0, tdp0.this);
            tdp0.this.m11082c2();
        }

        @Override // p007l.zac0
        public void onRoomStats(RTCRoomStats rTCRoomStats) {
            super.onRoomStats(rTCRoomStats);
            tdp0.this.f4403v2 = rTCRoomStats;
            if (rTCRoomStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).H.B += tdp0.this.f4403v2.txBytes;
                ((MediaBaseCodecFilter) tdp0.this).H.O = tdp0.this.f4403v2.txAudioKBitRate;
                ((MediaBaseCodecFilter) tdp0.this).H.j += tdp0.this.f4403v2.rxBytes;
                ((MediaBaseCodecFilter) tdp0.this).H.k += (long) ((tdp0.this.f4403v2.rxVideoKBitRate * 2000) / 8);
                ((MediaBaseCodecFilter) tdp0.this).H.l += (long) ((tdp0.this.f4403v2.rxAudioKBitRate * 2000) / 8);
                ((MediaBaseCodecFilter) tdp0.this).H.J0 += (long) ((tdp0.this.f4403v2.txVideoKBitRate * 2000) / 8);
                ((MediaBaseCodecFilter) tdp0.this).H.I0 += (long) ((tdp0.this.f4403v2.txAudioKBitRate * 2000) / 8);
                tdp0.this.f4274E0 += (long) ((tdp0.this.f4403v2.txVideoKBitRate * 2000) / 8);
                tdp0.this.f4280G0 += (long) ((tdp0.this.f4403v2.txAudioKBitRate * 2000) / 8);
                tdp0.this.f4277F0 += (tdp0.this.f4403v2.rxVideoKBitRate * 2000) / 8;
            }
        }

        public void onSubtitleMessageReceived(SubtitleMessage[] subtitleMessageArr) {
            super.onSubtitleMessageReceived(subtitleMessageArr);
            if (tdp0.this.f4300M2 == null) {
                return;
            }
            if (subtitleMessageArr == null) {
                tdp0.this.f4300M2.b((jkw) null);
                return;
            }
            for (SubtitleMessage subtitleMessage : subtitleMessageArr) {
                if (subtitleMessage != null) {
                    String str = subtitleMessage.userId;
                    String str2 = subtitleMessage.text;
                    String str3 = subtitleMessage.language;
                    SubtitleMode subtitleMode = subtitleMessage.mode;
                    MMLiveSubtitleMode mMLiveSubtitleModeFromId = subtitleMode != null ? MMLiveSubtitleMode.fromId(subtitleMode.value()) : MMLiveSubtitleMode.SUBTITLE_MODE_RECOGNITION;
                    int i = subtitleMessage.sequence;
                    boolean z = subtitleMessage.definite;
                    jkw jkwVar = tdp0.this.f4303N2;
                    tdp0 tdp0Var = tdp0.this;
                    if (jkwVar == null) {
                        tdp0Var.f4303N2 = new jkw(str, str2, str3, mMLiveSubtitleModeFromId, i, z);
                    } else {
                        tdp0Var.f4303N2.a = str;
                        tdp0.this.f4303N2.b = str2;
                        tdp0.this.f4303N2.c = str3;
                        tdp0.this.f4303N2.d = mMLiveSubtitleModeFromId;
                        tdp0.this.f4303N2.e = i;
                        tdp0.this.f4303N2.f = z;
                    }
                    tdp0.this.f4300M2.b(tdp0.this.f4303N2);
                }
            }
        }

        public void onSubtitleStateChanged(SubtitleState subtitleState, SubtitleErrorCode subtitleErrorCode, String str) {
            super.onSubtitleStateChanged(subtitleState, subtitleErrorCode, str);
            eyx.c().g(new Object[]{"onSubtitleStateChanged state：" + subtitleState + " error code：" + subtitleErrorCode + " error message：" + str});
            if (subtitleState == SubtitleState.SUBTITLE_STATE_STARTED) {
                ((MediaBaseCodecFilter) tdp0.this).H.p1 = 1;
            } else if (subtitleState == SubtitleState.SUBTITLE_STATE_STOPED) {
                ((MediaBaseCodecFilter) tdp0.this).H.p1 = 0;
            }
            if (tdp0.this.f4300M2 != null) {
                tdp0.this.f4300M2.a(MMLiveSubtitleState.fromId(subtitleState.value()), MMLiveSubtitleErrorCode.fromId(subtitleErrorCode.value()), str);
            }
            if (subtitleState == SubtitleState.SUBTITLE_STATE_ERROR) {
                eyx.c().i("volc", subtitleErrorCode.value(), str);
            }
        }

        @Override // p007l.zac0
        public void onTokenWillExpire() {
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onTokenWillExpire"});
            if (tdp0.this.f4402v1 != null) {
                tdp0.this.f4402v1.onTokenPrivilegeWillExpire("");
            }
            if (tdp0.this.f4400u1 != null) {
                tdp0.this.f4400u1.onRequestChannelKey();
            }
        }

        @Override // p007l.zac0
        public void onUserJoined(UserInfo userInfo) {
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onUserJoined", "uid:" + userInfo.getUid()});
            Long lValueOf = Long.valueOf(userInfo.getUid());
            long jLongValue = lValueOf.longValue();
            a9y a9yVar = new a9y(Long.valueOf(userInfo.getUid()).longValue(), "S".equals(tdp0.this.m11162w1()) ? 1 : 2);
            tdp0.this.f4286I0.put(lValueOf, a9yVar);
            if (tdp0.this.f4271C2 != -1) {
                a9yVar.j(System.currentTimeMillis());
                a9yVar.i(System.currentTimeMillis() - tdp0.this.f4271C2);
            }
            if (((MediaBaseCodecFilter) tdp0.this).H.c1 == 1) {
                ((MediaBaseCodecFilter) tdp0.this).I.e(true, a9yVar.c(), jLongValue, tdp0.this.f4267A2, a9yVar.a());
            }
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + " onUserJoined:uid:" + jLongValue);
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onUserJoined", "isAudioOnly:" + tdp0.this.f4354c1 + ",mIsAgnoreSET:" + tdp0.this.f4351b1});
            if ((tdp0.this.f4354c1 || tdp0.this.f4351b1) && tdp0.this.f4333W0.f3962i1 != jLongValue) {
                a9yVar.f(true);
                a9yVar.g(true);
                ((MediaBaseCodecFilter) tdp0.this).I.c(true, a9yVar.c(), jLongValue, tdp0.this.f4267A2, a9yVar.a(), -1L);
                tdp0.this.f4307P0.g(8198, (int) jLongValue, 0, tdp0.this);
                tdp0.this.f4276E2.post(new b(jLongValue));
            }
            tdp0.this.f4283H0.put(lValueOf, new ley(jLongValue));
            if (tdp0.this.f4398t1 != null) {
                tdp0.this.f4398t1.onJoinChannelSuccess("", jLongValue, 0);
            }
        }

        @Override // p007l.zac0
        public void onUserLeave(String str, int i) {
            int i2 = i;
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onUserOffline uid:" + str + ",reason:" + i2});
            StringBuilder sb = new StringBuilder("onUserLeave,userid:");
            sb.append(str);
            Log.e("lqdebug", sb.toString());
            Long lValueOf = Long.valueOf(str);
            long jLongValue = lValueOf.longValue();
            long j = 0;
            if (tdp0.this.f4283H0 != null && tdp0.this.f4283H0.containsKey(lValueOf)) {
                ley leyVar = (ley) tdp0.this.f4283H0.get(lValueOf);
                j = leyVar != null ? leyVar.d : 0L;
                tdp0.this.f4283H0.remove(lValueOf);
            }
            if (tdp0.this.f4286I0 != null && tdp0.this.f4286I0.containsKey(lValueOf)) {
                n8c.a("zhengjijian", "onMemberExit userid " + jLongValue + " reason " + i2);
                StringBuilder sb2 = new StringBuilder("onUserLeave,userid:");
                sb2.append(str);
                Log.e("lqdebug", sb2.toString());
                if (((MediaBaseCodecFilter) tdp0.this).H.c1 == 1) {
                    ((MediaBaseCodecFilter) tdp0.this).I.d(true, ((a9y) tdp0.this.f4286I0.get(lValueOf)).c(), jLongValue, i2);
                    ((MediaBaseCodecFilter) tdp0.this).I.f(true, ((a9y) tdp0.this.f4286I0.get(lValueOf)).c(), j, 0L, jLongValue, i);
                    jLongValue = jLongValue;
                    i2 = i;
                }
                tdp0.this.f4307P0.g(8199, (int) jLongValue, 0, tdp0.this);
            }
            if (tdp0.this.f4393q2 != null && (!tdp0.this.f4275E1 || tdp0.this.f4354c1 || tdp0.this.f4351b1)) {
                ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + "----onVideoChannelRemove userID=" + jLongValue);
                tdp0.this.f4393q2.b(jLongValue, i2);
                tdp0 tdp0Var = tdp0.this;
                if (tdp0Var.f4326U1 != null && tdp0Var.f4391p2.contains(str)) {
                    ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"setRemoteVideoCanvas 0531"});
                    tdp0.this.f4326U1.setRemoteVideoCanvas(new RemoteStreamKey(tdp0.this.f4333W0.f3960g1, str, StreamIndex.STREAM_INDEX_MAIN), (VideoCanvas) null);
                    tdp0.this.f4391p2.remove(lValueOf);
                }
                ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onVideoChannelRemove uid:" + jLongValue + ",reason:" + i2});
            }
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"isUseTextureView", Boolean.valueOf(((vlw) tdp0.this.f4333W0).Z0)});
            if (((vlw) tdp0.this.f4333W0).Z0) {
                tdp0 tdp0Var2 = tdp0.this;
                if (tdp0Var2.f4326U1 != null && tdp0Var2.f4388o2 != null && tdp0.this.f4388o2.containsKey(str)) {
                    ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"setupRemoteVideoview null"});
                    tdp0.this.f4388o2.remove(str);
                    if (tdp0.this.f4399t2 != null) {
                        tdp0.this.f4399t2.b(jLongValue, i2);
                    }
                }
            }
            if (tdp0.this.f4398t1 != null) {
                tdp0.this.f4398t1.onUserOffline(jLongValue, i2);
            }
            if (tdp0.this.f4360e1 != null) {
                if (tdp0.this.f4360e1.containsKey(lValueOf) || jLongValue == ((vlw) tdp0.this.f4333W0).B0) {
                    if (jLongValue != ((vlw) tdp0.this.f4333W0).B0) {
                        tdp0.this.f4360e1.remove(lValueOf);
                    }
                    boolean z = tdp0.this.f4275E1;
                    tdp0 tdp0Var3 = tdp0.this;
                    if (!z) {
                        if (tdp0Var3.f4397s2 != null) {
                            tdp0.this.f4397s2.b(jLongValue, i2);
                        }
                    } else if (tdp0Var3.f4395r2 != null) {
                        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + "----onVideoChannelRemoveExt userID=" + jLongValue);
                        tdp0.this.f4395r2.b(jLongValue, i2);
                    }
                }
            }
        }

        @Override // p007l.zac0
        public void onUserPublishStreamAudio(String str, String str2, boolean z) {
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onUserPublishStreamAudio", "uid:" + str2 + ",isPublish:" + z});
            ley leyVar = (ley) tdp0.this.f4283H0.get(Long.valueOf(str2));
            if (leyVar != null) {
                leyVar.g(!z);
            }
            if (tdp0.this.f4398t1 != null) {
                tdp0.this.f4398t1.onUserMuteAudio(Integer.valueOf(str2).intValue(), !z);
            }
        }

        @Override // p007l.zac0
        public void onUserPublishStreamVideo(String str, String str2, boolean z) {
            super.onUserPublishStreamVideo(str, str2, z);
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onUserPublishStreamVideo", "uid:" + str2 + ",isPublish:" + z});
            ley leyVar = (ley) tdp0.this.f4283H0.get(Long.valueOf(str2));
            if (leyVar != null) {
                leyVar.h(!z);
            }
            if (tdp0.this.f4398t1 != null) {
                tdp0.this.f4398t1.onUserMuteVideo(Integer.valueOf(str2).intValue(), !z);
            }
        }
    }

    /* JADX INFO: renamed from: l.tdp0$i */
    public class C0714i implements IAudioFrameProcessor {
        public C0714i() {
        }

        public int onProcessEarMonitorAudioFrame(IAudioFrame iAudioFrame) {
            return 0;
        }

        public int onProcessPlayBackAudioFrame(IAudioFrame iAudioFrame) {
            return 0;
        }

        public int onProcessRecordAudioFrame(IAudioFrame iAudioFrame) {
            mpd0 mpd0VarMo345C;
            ByteBuffer byteBuffer;
            int iValue = iAudioFrame.channel().value();
            int iData_size = iAudioFrame.data_size();
            int iValue2 = iAudioFrame.sample_rate().value();
            int unused = tdp0.this.f4376j2;
            tdp0.m10901g3(tdp0.this);
            int iData_size2 = iAudioFrame.data_size();
            byte[] bArrM9856o2 = new byte[iData_size2];
            if (!tdp0.this.f4284H1) {
                iAudioFrame.getDataBuffer().get(bArrM9856o2, 0, iData_size2);
            }
            if (tdp0.this.f4379k1 != null) {
                tdp0.this.f4379k1.onPcmDateCallback(((vlw) tdp0.this.f4333W0).B0, bArrM9856o2, 44100, iValue != 1);
            }
            mpd0 mpd0Var = null;
            if (((MediaBaseCodecFilter) tdp0.this).K != null) {
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).K).mo367W1(tdp0.this.f4313R0);
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).K).m353I2(iData_size, ((ulw) tdp0.this.f4333W0).P, iValue, "Volc");
                mpd0VarMo345C = ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).K).mo345C(new mpd0(bArrM9856o2, tdp0.this.f4317S0, iValue));
                if (mpd0VarMo345C != null && (byteBuffer = mpd0VarMo345C.b) != null) {
                    byteBuffer.get(bArrM9856o2, 0, iData_size2);
                    iAudioFrame.getDataBuffer().rewind();
                    iAudioFrame.getDataBuffer().put(bArrM9856o2);
                    iAudioFrame.getDataBuffer().rewind();
                }
            } else {
                mpd0VarMo345C = null;
            }
            if (tdp0.this.f4308P1 != null) {
                tdp0.this.f4308P1.m9329o(bArrM9856o2, iValue2, iValue);
            }
            if (tdp0.this.f4298M0 != null && tdp0.this.f4304O0) {
                if (((MediaBaseCodecFilter) tdp0.this).K != null) {
                    if (tdp0.this.f4389p0 != null) {
                        tdp0.this.f4389p0.j(1.0f);
                        if (((vlw) tdp0.this.f4333W0).X0) {
                            tdp0.this.f4389p0.k(1.0f);
                        }
                        mpd0Var = tdp0.this.f4389p0.g();
                    }
                    if (mpd0Var != null) {
                        tdp0 tdp0Var = tdp0.this;
                        ByteBuffer byteBufferH = mpd0VarMo345C != null ? tdp0Var.f4389p0.h(mpd0VarMo345C.c(), mpd0Var.c(), mpd0Var.e()) : tdp0Var.f4389p0.h(bArrM9856o2, mpd0Var.c(), mpd0Var.e());
                        if (byteBufferH != null) {
                            mpd0Var = new mpd0(byteBufferH.array(), mpd0Var.d(), iValue);
                        }
                    }
                }
                if (mpd0Var != null) {
                    mpd0 mpd0Var2 = new mpd0(iValue == 1 ? m300.m9856o2(mpd0Var.c(), mpd0Var.e()) : mpd0Var.c(), tdp0.this.f4317S0, 2);
                    mpd0Var2.g(false);
                    if (tdp0.this.f4298M0 != null) {
                        tdp0.this.f4298M0.C(mpd0Var2);
                        if (tdp0.m10949t3(tdp0.this) % 50 == 0) {
                            ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                        }
                    }
                } else if (tdp0.this.f4334W1 != 2) {
                    if (iValue == 1) {
                        bArrM9856o2 = m300.m9856o2(bArrM9856o2, iData_size2);
                    }
                    mpd0 mpd0Var3 = new mpd0(bArrM9856o2, tdp0.this.f4317S0, 2);
                    mpd0Var3.g(false);
                    if (tdp0.this.f4298M0 != null) {
                        tdp0.this.f4298M0.C(mpd0Var3);
                        if (tdp0.m10949t3(tdp0.this) % 50 == 0) {
                            ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                        }
                    }
                }
            }
            return 0;
        }

        public int onProcessRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame) {
            return 0;
        }

        public int onProcessScreenAudioFrame(IAudioFrame iAudioFrame) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: l.tdp0$k */
    public class RunnableC0716k implements Runnable {
        public RunnableC0716k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"configConnectLost", "errorcode 10"});
            if (tdp0.this.f4307P0 != null) {
                tdp0.this.f4307P0.g(4353, 10, 0, tdp0.this);
            }
            if (tdp0.this.f4398t1 != null) {
                tdp0.this.f4398t1.onConnectionLost();
            }
            tdp0.this.f4273D2 = 1;
            tdp0.m10930o4(tdp0.this);
            ((MediaBaseCodecFilter) tdp0.this).H.y0 = 812L;
            ((MediaBaseCodecFilter) tdp0.this).H.k0 = 812;
            tdp0.this.e2(4353, 10);
            if (((MediaBaseCodecFilter) tdp0.this).I != null) {
                ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onConnectionLost"});
            }
            tdp0.this.m11094f();
        }
    }

    public tdp0(Context context, yw00 yw00Var, hu00.a aVar, vlw vlwVar, String str) {
        super(context);
        this.f4316S = "Pipeline_Normal_pip->PIPLINE->VOLC";
        this.f4320T = true;
        this.f4324U = -1;
        this.f4332W = false;
        this.f4336X = false;
        this.f4340Y = true;
        this.f4344Z = null;
        this.f4274E0 = 0L;
        this.f4277F0 = 0;
        this.f4280G0 = 0L;
        this.f4283H0 = new PipelineConcurrentHashMap<>();
        this.f4286I0 = new PipelineConcurrentHashMap<>();
        this.f4289J0 = 0;
        this.f4292K0 = 0;
        this.f4295L0 = null;
        this.f4301N0 = false;
        this.f4304O0 = false;
        this.f4310Q0 = 1.0f;
        this.f4313R0 = 1.0f;
        this.f4317S0 = 44100;
        this.f4321T0 = 0;
        this.f4325U0 = 0;
        this.f4329V0 = 0;
        this.f4337X0 = -1;
        this.f4341Y0 = null;
        this.f4345Z0 = new Object();
        this.f4348a1 = 0;
        this.f4351b1 = false;
        this.f4354c1 = false;
        this.f4357d1 = new Object();
        this.f4360e1 = new PipelineConcurrentHashMap();
        this.f4363f1 = false;
        this.f4372i1 = null;
        this.f4375j1 = null;
        this.f4381l1 = 0;
        this.f4383m1 = 0;
        this.f4385n1 = 750;
        this.f4387o1 = 0;
        this.f4390p1 = "";
        this.f4392q1 = false;
        this.f4266A1 = new zmw();
        this.f4268B1 = new zmw();
        this.f4270C1 = new jjw();
        this.f4272D1 = new vmw();
        this.f4275E1 = false;
        this.f4278F1 = false;
        this.f4281G1 = true;
        this.f4284H1 = false;
        this.f4287I1 = 0L;
        this.f4290J1 = null;
        this.f4293K1 = false;
        this.f4296L1 = Long.MIN_VALUE;
        this.f4299M1 = 1000L;
        this.f4302N1 = null;
        this.f4311Q1 = 1;
        this.f4314R1 = System.currentTimeMillis();
        this.f4318S1 = null;
        this.f4322T1 = -1;
        this.f4326U1 = null;
        this.f4330V1 = null;
        this.f4334W1 = 1;
        this.f4338X1 = false;
        this.f4349a2 = false;
        this.f4352b2 = false;
        this.f4355c2 = false;
        this.f4358d2 = false;
        this.f4361e2 = false;
        this.f4364f2 = null;
        this.f4367g2 = false;
        this.f4370h2 = "";
        this.f4376j2 = 0;
        this.f4380k2 = false;
        this.f4382l2 = false;
        this.f4384m2 = 0;
        this.f4386n2 = 1;
        this.f4388o2 = new PipelineConcurrentHashMap();
        this.f4391p2 = new ArrayList<>();
        this.f4393q2 = null;
        this.f4395r2 = null;
        this.f4397s2 = null;
        this.f4399t2 = null;
        this.f4401u2 = null;
        this.f4405w2 = 0;
        this.f4407x2 = AudioProfileType.AUDIO_PROFILE_HD_MONO;
        this.f4409y2 = AudioScenarioType.GAMESTREAMING;
        this.f4411z2 = null;
        this.f4267A2 = -1L;
        this.f4269B2 = -1L;
        this.f4271C2 = -1L;
        this.f4273D2 = 0;
        this.f4276E2 = new Handler(Looper.getMainLooper());
        this.f4279F2 = false;
        this.f4282G2 = -1;
        this.f4285H2 = -1;
        this.f4288I2 = 1;
        this.f4291J2 = 3;
        this.f4294K2 = false;
        this.f4297L2 = "";
        this.f4300M2 = null;
        this.f4306O2 = 0;
        this.f4309P2 = new C0709d();
        this.f4312Q2 = new C0710e();
        this.f4315R2 = new C0711f();
        this.f4319S2 = new C0712g();
        this.f4323T2 = 0;
        this.f4327U2 = 0;
        this.f4331V2 = null;
        this.f4335W2 = new C0714i();
        this.f4339X2 = new C0715j();
        this.f4343Y2 = false;
        this.f4347Z2 = false;
        this.f4350a3 = 0L;
        this.f4353b3 = false;
        this.f4356c3 = 0;
        this.f4359d3 = new C0706a();
        this.f4362e3 = 0;
        this.f4365f3 = false;
        this.f4368g3 = false;
        this.f4374i3 = "";
        this.f4377j3 = false;
        this.f4295L0 = str;
        this.f4378k0 = yw00Var;
        this.f4333W0 = (qmr) vlwVar;
        this.f4307P0 = aVar;
        this.f4375j1 = new CongressUtil();
        m10788A6(vlwVar);
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.d = 261L;
        zmxVar.e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }

    /* JADX INFO: renamed from: A6 */
    private void m10788A6(vlw vlwVar) {
        ((MediaBaseCodecFilter) this).s = vlwVar;
        m11129m7(((ulw) vlwVar).P);
        this.f4358d2 = ((ulw) vlwVar).q;
        this.f4301N0 = false;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volcInit", "appid:" + this.f4295L0});
        ArrayList arrayListF0 = fjx.R().F0();
        String str = "{}";
        if (arrayListF0 != null) {
            for (Object obj : arrayListF0) {
                if (!TextUtils.isEmpty(this.f4295L0) && this.f4295L0.equals(obj)) {
                    str = "{\"config_hosts\":[\"rtc-test.bytedance.com\"],\"access_hosts\":[\"rtc-access-test.bytedance.com\"]}";
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Log.e("lqdebug", "volc engine init json");
            long jCurrentTimeMillis = System.currentTimeMillis();
            EngineConfig engineConfig = new EngineConfig();
            engineConfig.appID = this.f4295L0;
            engineConfig.parameters = jSONObject;
            engineConfig.context = W1();
            try {
                if (engineConfig.parameters == null) {
                    engineConfig.parameters = new JSONObject();
                }
                engineConfig.parameters.put("rtc.enable_auto_ntp_synchronized", true);
            } catch (Exception unused) {
            }
            yw00 yw00Var = this.f4378k0;
            if (yw00Var != null) {
                engineConfig.eglContext = yw00Var.l();
            }
            this.f4306O2 = 0;
            int i = ((vlw) this.f4333W0).d1;
            if (i >= 0) {
                this.f4306O2 = i;
            } else {
                this.f4306O2 = fjx.R().J0();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f4326U1 = sdp0.m10650b().m10652c(engineConfig, this.f4295L0, this.f4312Q2, this.f4309P2, this.f4306O2 == 0);
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
            if (this.f4326U1 == null) {
                boolean zInitializeNativeLibs = RTCEngineImpl.initializeNativeLibs();
                eyx.c().a("volcCreate", "isLoad:" + zInitializeNativeLibs, LogLevel.FATAL);
                return;
            }
            eyx.c().g(new Object[]{"volcCreate", "mRtcKeepAlive:" + this.f4306O2 + ",volcengineHash:" + this.f4326U1.hashCode() + ", cost:" + jCurrentTimeMillis3});
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rtc.start_sco_failed_force_to_media", true);
                this.f4326U1.setRuntimeParameters(jSONObject2);
            } catch (Exception unused2) {
            }
            ((MediaBaseCodecFilter) this).I.k("VolcEngine", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Exception e) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"VolcEngine.create error" + e.toString()});
        }
    }

    /* JADX INFO: renamed from: B6 */
    private int m10793B6() {
        int i = 0;
        if (!this.f4354c1 && !this.f4380k2) {
            i = 1;
        }
        return i ^ 1;
    }

    /* JADX INFO: renamed from: C6 */
    private final void m10798C6(String str, int i) {
        RTCEngineEx rTCEngineEx = this.f4326U1;
        if (rTCEngineEx == null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"joinChannel", "fatal error mRtcEngine is null"});
            return;
        }
        RTCRoomEx rTCRoomExCreateRTCRoomEx = rTCEngineEx.createRTCRoomEx(str);
        this.f4330V1 = rTCRoomExCreateRTCRoomEx;
        if (rTCRoomExCreateRTCRoomEx == null) {
            ((MediaBaseCodecFilter) this).I.k("joinChannel", "fatal error mRTCRoom is null");
            MRtcEventHandler mRtcEventHandler = this.f4398t1;
            if (mRtcEventHandler != null) {
                mRtcEventHandler.onJoinChannelfail(str, i, -6);
                return;
            }
            return;
        }
        sdp0.m10650b().m10653d(this.f4330V1);
        this.f4330V1.setRTCRoomEventHandler(this.f4319S2);
        this.f4330V1.setRTCRoomEventHandlerEx(this.f4315R2);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volcEngine", "3 createRTCRoom:uid" + i + ",channel:" + str});
        boolean z = this.f4334W1 == 1;
        m11029N7(z);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volcEngine", "4 setUserVisibility"});
        qmr qmrVar = this.f4333W0;
        int i2 = ((ulw) qmrVar).m;
        int i3 = ((ulw) qmrVar).n;
        if (((vlw) qmrVar).F0) {
            i3 = i2;
            i2 = i3;
        }
        m11047S7(i2, i3, ((ulw) qmrVar).H / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volcEngine", "5 setVideoConfig"});
        m11103g7();
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volcEngine", "6 setAudioConfig"});
        UserInfo userInfo = new UserInfo(String.valueOf(i), (String) null);
        if (!TextUtils.isEmpty(this.f4333W0.f3967n1)) {
            try {
                abc0 abc0Var = new abc0();
                abc0Var.a = this.f4333W0.f3967n1;
                userInfo = new UserInfo(String.valueOf(i), jod0.b().c(abc0Var));
            } catch (Exception unused) {
                userInfo = new UserInfo(String.valueOf(i), (String) null);
            }
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volcEngine", "joinRoom token:" + this.f4341Y0 + ", channelid:" + str + ",uid:" + i});
        int iJoinRoom = this.f4330V1.joinRoom(this.f4341Y0, userInfo, z, new RTCRoomConfig(ChannelProfile.CHANNEL_PROFILE_LIVE, true, true, true, true));
        if (iJoinRoom >= 0) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"volcEngine", "7 joinRoom"});
            this.f4326U1.registerAudioFrameObserver(this.f4339X2);
            this.f4326U1.registerAudioProcessor(this.f4335W2);
            m11060W6(true);
            m10879Z5();
            return;
        }
        MRtcEventHandler mRtcEventHandler2 = this.f4398t1;
        if (mRtcEventHandler2 != null) {
            mRtcEventHandler2.onJoinChannelfail(str, i, iJoinRoom);
        }
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.y0 = 810L;
        zmxVar.k0 = iJoinRoom;
    }

    /* JADX INFO: renamed from: D6 */
    private void m10803D6() {
        synchronized (this.f4345Z0) {
            try {
                RTCEngineEx rTCEngineEx = this.f4326U1;
                if (rTCEngineEx != null) {
                    ((MediaBaseCodecFilter) this).H.a0 = "";
                    rTCEngineEx.stopPushMixedStream(this.f4297L2, MixedStreamPushTargetType.PUSH_TO_CDN);
                    this.f4326U1.stopAudioCapture();
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"Volc", "10 stopAudioCapture"});
                }
                RTCRoomEx rTCRoomEx = this.f4330V1;
                if (rTCRoomEx != null) {
                    rTCRoomEx.leaveRoom();
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"Volc", "11 leaveRoom"});
                }
                this.f4355c2 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H7 */
    public int m10819H7(String str) {
        int iStartPushMixedStream;
        MixedStreamPushTargetConfig mixedStreamPushTargetConfig;
        hgd0 hgd0Var;
        synchronized (this.f4357d1) {
            try {
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"setRtcEnginePublishStreamUrl", "rtmpUrl:" + str + "mHavaPublish" + this.f4355c2});
                if (this.f4355c2 || this.f4352b2) {
                    iStartPushMixedStream = 0;
                } else if (this.f4326U1 == null || this.f4342Y1 == null || (mixedStreamPushTargetConfig = this.f4346Z1) == null) {
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"setRtcEnginePublishStreamUrl", "error:pushTargetConfig:" + this.f4346Z1 + ", mixedStreamConfig:" + this.f4342Y1});
                    iStartPushMixedStream = 0;
                } else {
                    mixedStreamPushTargetConfig.pushCDNURL = str;
                    mixedStreamPushTargetConfig.pushTargetType = MixedStreamPushTargetType.PUSH_TO_CDN;
                    String strM10891c6 = m10891c6();
                    iStartPushMixedStream = this.f4326U1.startPushMixedStream(strM10891c6, this.f4346Z1, this.f4342Y1);
                    if (iStartPushMixedStream != 0 && (hgd0Var = this.f4308P1) != null) {
                        hgd0Var.m9330p(str, iStartPushMixedStream);
                        ((MediaBaseCodecFilter) this).I.l(new Object[]{"startPushMixedStream", "error:" + iStartPushMixedStream});
                    }
                    this.f4297L2 = strM10891c6;
                    ((MediaBaseCodecFilter) this).I.l(new Object[]{"startPushMixedStream", "ret:" + iStartPushMixedStream});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iStartPushMixedStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M6 */
    public void m10835M6() {
        if (((MediaBaseCodecFilter) this).H.c == 0) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "AGORA_PUBLISHING");
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"notifyPublished", "VOLC PUBLISHING"});
            this.f4307P0.g(4103, 0, 0, this);
            Log.e("lqdebug", "VOLC VOLC_PUBLISHING");
            ((MediaBaseCodecFilter) this).H.c = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M7 */
    public void m10836M7(Object obj, int i, int i2) {
        za1 za1VarM346C2;
        u3m u3mVar = ((MediaBaseCodecFilter) this).K;
        if (u3mVar == null || (za1VarM346C2 = ((ExtAudioWrapper) u3mVar).m346C2()) == null) {
            return;
        }
        za1VarM346C2.a(obj, i, i2);
    }

    /* JADX INFO: renamed from: O7 */
    private void m10843O7() {
        qmr qmrVar = this.f4333W0;
        m11047S7(((ulw) qmrVar).m, ((ulw) qmrVar).n, ((ulw) qmrVar).H / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V7 */
    public void m10865V7(int i, boolean z) {
        ley leyVar = (ley) this.f4283H0.get(Long.valueOf(i));
        if (leyVar != null) {
            leyVar.h(z);
        }
        MRtcEventHandler mRtcEventHandler = this.f4398t1;
        if (mRtcEventHandler != null) {
            mRtcEventHandler.onUserMuteVideo(i, z);
        }
    }

    /* JADX INFO: renamed from: X6 */
    private void m10872X6() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"release"});
        boolean z = true;
        this.f4343Y2 = true;
        synchronized (this.f4345Z0) {
            try {
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"release begin"});
                RTCRoomEx rTCRoomEx = this.f4330V1;
                if (rTCRoomEx != null) {
                    rTCRoomEx.destroy();
                    this.f4330V1 = null;
                    sdp0.m10650b().m10653d(null);
                }
                this.f4342Y1 = null;
                IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
                if (iMediaPlayerM10978z6 != null) {
                    iMediaPlayerM10978z6.setEventHandler((IMediaPlayerEventHandler) null);
                }
                this.f4359d3 = null;
                long jCurrentTimeMillis = System.currentTimeMillis();
                sdp0 sdp0VarM10650b = sdp0.m10650b();
                if (this.f4306O2 != 0) {
                    z = false;
                }
                sdp0VarM10650b.m10651a(z);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                eyx.c().g(new Object[]{"volcDestroy", "mRtcKeepAlive:" + this.f4306O2 + ",cost:" + jCurrentTimeMillis2});
                this.f4326U1 = null;
                this.f4312Q2 = null;
                this.f4319S2 = null;
                this.f4300M2 = null;
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"volc", "12 releaseRTC"});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z5 */
    private void m10879Z5() {
        this.f4318S1 = new RunnableC0716k();
    }

    /* JADX INFO: renamed from: a6 */
    private final void m10883a6(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volcEngine", "2 setVideoSourceType"});
        m11061W7(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b6 */
    public void m10887b6(boolean z, int i, int i2, int i3, int i4, String str, String str2) {
        if (this.f4342Y1 == null) {
            this.f4342Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        if (this.f4346Z1 == null) {
            this.f4346Z1 = new MixedStreamPushTargetConfig();
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"configPublisher", "width:" + i + ",height" + i2 + ",url:" + str + ",bitrate:" + i3 + ",fps:" + i4 + ",uid:" + str2});
        MixedStreamConfig mixedStreamConfig = this.f4342Y1;
        mixedStreamConfig.roomID = this.f4333W0.f3960g1;
        mixedStreamConfig.userID = str2;
        MixedStreamPushTargetConfig mixedStreamPushTargetConfig = this.f4346Z1;
        mixedStreamPushTargetConfig.pushCDNURL = str;
        mixedStreamPushTargetConfig.pushTargetType = MixedStreamPushTargetType.PUSH_TO_CDN;
        MixedStreamVideoConfig mixedStreamVideoConfig = new MixedStreamVideoConfig();
        mixedStreamVideoConfig.width = i;
        mixedStreamVideoConfig.height = i2;
        mixedStreamVideoConfig.gop = 1;
        mixedStreamVideoConfig.fps = this.f4321T0;
        mixedStreamVideoConfig.bitrate = i3;
        if (((vlw) this.f4333W0).H0) {
            mixedStreamVideoConfig.videoCodec = MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1;
        }
        this.f4342Y1.videoConfig = mixedStreamVideoConfig;
        int iR0 = fjx.R().r0();
        MixedStreamAudioConfig mixedStreamAudioConfig = new MixedStreamAudioConfig();
        mixedStreamAudioConfig.sampleRate = 44100;
        mixedStreamAudioConfig.channels = 2;
        mixedStreamAudioConfig.audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
        if (iR0 == 0) {
            iR0 = 128;
        }
        mixedStreamAudioConfig.bitrate = iR0;
        this.f4342Y1.audioConfig = mixedStreamAudioConfig;
    }

    /* JADX INFO: renamed from: c6 */
    private String m10891c6() {
        return "and_" + ((vlw) this.f4333W0).B0 + "_" + Long.toString(System.currentTimeMillis() % 1000000);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ int m10901g3(tdp0 tdp0Var) {
        int i = tdp0Var.f4376j2;
        tdp0Var.f4376j2 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i8 */
    public int m10910i8(String str, String str2) {
        if (this.f4330V1 == null || this.f4279F2) {
            return 0;
        }
        int iStartForwardStreamToRooms = this.f4330V1.startForwardStreamToRooms(Collections.singletonList(new ForwardStreamInfo(str, str2)));
        if (iStartForwardStreamToRooms < 0) {
            this.f4308P1.m9320f(0L, 3, "");
            eyx.c().e("ConnectOtherRoom", "volc", iStartForwardStreamToRooms, "strartForwardStreamToRoom failed", LogLevel.FATAL.value());
            this.f4279F2 = false;
        } else {
            this.f4279F2 = true;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"subscribeOhterRoom", "channelid:" + str + ",ret = " + iStartForwardStreamToRooms});
        return iStartForwardStreamToRooms;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j7 */
    public void m10914j7(int i, boolean z) {
        ley leyVar = (ley) this.f4283H0.get(Long.valueOf(i));
        if (leyVar != null) {
            leyVar.g(z);
        }
        MRtcEventHandler mRtcEventHandler = this.f4398t1;
        if (mRtcEventHandler != null) {
            mRtcEventHandler.onUserMuteAudio(i, z);
        }
    }

    /* JADX INFO: renamed from: m6 */
    private int m10924m6(AudioProfileType audioProfileType) {
        switch (C0708c.f4415b[audioProfileType.ordinal()]) {
            case 1:
            case 2:
                return 32000;
            case 3:
                return 48000;
            case 4:
                return 128000;
            case 5:
                return 80000;
            case 6:
                return 64000;
            default:
                return ((ulw) this.f4333W0).S;
        }
    }

    /* JADX INFO: renamed from: m8 */
    private void m10925m8(String str) {
        if (this.f4326U1 == null || this.f4342Y1 == null || this.f4346Z1 == null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateLiveTransCoding error", "mixedStreamConfig:" + this.f4342Y1 + ", pushTargetConfig:" + this.f4346Z1});
            return;
        }
        synchronized (this.f4357d1) {
            this.f4326U1.updatePushMixedStream(this.f4297L2, this.f4346Z1, this.f4342Y1);
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateLiveTransCoding:" + this.f4342Y1.toString()});
        }
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ bkw m10930o4(tdp0 tdp0Var) {
        tdp0Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: p6 */
    private String m10935p6() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.f4283H0.entrySet().iterator();
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

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ int m10949t3(tdp0 tdp0Var) {
        int i = tdp0Var.f4356c3;
        tdp0Var.f4356c3 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: t6 */
    private String m10952t6(String str) {
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
            if (jSONObject.has("conf") && this.f4351b1) {
                jSONObject.remove("conf");
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: y6 */
    private IAudioEffectPlayer m10973y6() {
        RTCEngineEx rTCEngineEx = this.f4326U1;
        if (rTCEngineEx != null) {
            return rTCEngineEx.getAudioEffectPlayer();
        }
        return null;
    }

    /* JADX INFO: renamed from: z6 */
    private IMediaPlayer m10978z6() {
        RTCEngineEx rTCEngineEx = this.f4326U1;
        if (rTCEngineEx != null) {
            return rTCEngineEx.getMediaPlayer(this.f4384m2);
        }
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public int m10980A0() {
        qmr qmrVar = this.f4333W0;
        return ((ulw) qmrVar).k > 0 ? ((ulw) qmrVar).l : ((ulw) qmrVar).t;
    }

    /* JADX INFO: renamed from: A7 */
    public void m10981A7(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f4310Q0 = f;
        ((MediaBaseCodecFilter) this).H.H0 = f;
        int i = (int) (f * 100.0f);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setMasterAudioLevel", "level:" + this.f4310Q0 + ", volume:" + i});
        RTCEngineEx rTCEngineEx = this.f4326U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setCaptureVolume(StreamIndex.STREAM_INDEX_MAIN, i);
            this.f4326U1.setEarMonitorVolume(i);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m10983C0() {
        m11094f();
    }

    /* JADX INFO: renamed from: C1 */
    public void m10984C1(String str) {
        n8c.c("zk", "setMergeSei");
        synchronized (this.f4345Z0) {
            this.f4369h1 = str;
            if (!((vlw) this.f4333W0).X0) {
                m11171z7(str, true);
            }
            eyx.c().g(new Object[]{"volc setMergeSei:" + str});
        }
    }

    /* JADX INFO: renamed from: C7 */
    public void m10985C7(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.f4379k1 = pcmdataavailablecallback;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setRecordPcmDataCallback", "pcmDataCallback = " + pcmdataavailablecallback});
        if (this.f4379k1 != null) {
            m11060W6(true);
        } else {
            m11060W6(false);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public long m10986D0() {
        return 0L;
    }

    /* JADX INFO: renamed from: D1 */
    public String m10987D1() {
        String str = ((MediaBaseCodecFilter) this).H.x;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: D7 */
    public void m10988D7(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setRole", Integer.valueOf(i)});
        this.f4334W1 = i;
        m11029N7(i == 1);
    }

    /* JADX INFO: renamed from: E0 */
    public void m10989E0(dxl dxlVar) {
        ((MediaBaseCodecFilter) this).F = dxlVar;
    }

    /* JADX INFO: renamed from: E6 */
    public void m10990E6(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteRemoteAudioStream", "mute:" + z});
        RTCRoomEx rTCRoomEx = this.f4330V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeAllStreamsAudio(!z);
        }
    }

    /* JADX INFO: renamed from: E7 */
    public void m10991E7(boolean z) {
        this.f4352b2 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volcpusher setRoom24hMode:", Boolean.valueOf(z)});
    }

    /* JADX INFO: renamed from: F */
    public boolean m10992F() {
        return this.f4304O0;
    }

    /* JADX INFO: renamed from: F0 */
    public int m10993F0() {
        return this.f4325U0;
    }

    /* JADX INFO: renamed from: F1 */
    public long m10994F1() {
        RTCRoomStats rTCRoomStats = this.f4403v2;
        if (rTCRoomStats != null) {
            return rTCRoomStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F6 */
    public void m10995F6(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteAllRemoteVideoStream", "mute:" + z});
        RTCRoomEx rTCRoomEx = this.f4330V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeAllStreamsVideo(!z);
        }
    }

    /* JADX INFO: renamed from: F7 */
    public void m10996F7(int i, boolean z) {
        this.f4381l1 = i;
    }

    /* JADX INFO: renamed from: G0 */
    public long m10997G0() {
        return 0L;
    }

    /* JADX INFO: renamed from: G6 */
    public void m10998G6(boolean z) {
        this.f4382l2 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalAudioStream", "mute:" + z});
        RTCRoomEx rTCRoomEx = this.f4330V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.publishStreamAudio(!z);
        }
    }

    /* JADX INFO: renamed from: G7 */
    public void m10999G7(int i) {
        this.f4337X0 = i;
    }

    /* JADX INFO: renamed from: H0 */
    public void m11000H0(boolean z) {
        this.f4351b1 = z;
    }

    /* JADX INFO: renamed from: H5 */
    public void m11001H5(MRtcEventHandler mRtcEventHandler) {
        this.f4398t1 = mRtcEventHandler;
    }

    /* JADX INFO: renamed from: H6 */
    public void m11002H6(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalAudioStreamForEx", "mute:" + z});
        m10998G6(z);
    }

    /* JADX INFO: renamed from: I1 */
    public void m11003I1() {
        this.f4304O0 = true;
    }

    /* JADX INFO: renamed from: I5 */
    public void m11004I5(MRtcExitRoomHandler mRtcExitRoomHandler) {
        this.f4305O1 = mRtcExitRoomHandler;
    }

    /* JADX INFO: renamed from: I6 */
    public void m11005I6(boolean z) {
        this.f4380k2 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteLocalVideoStream", "mute:" + z});
        RTCRoomEx rTCRoomEx = this.f4330V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.publishStreamVideo(!z);
        }
    }

    /* JADX INFO: renamed from: I7 */
    public void m11006I7(hgd0 hgd0Var) {
        this.f4308P1 = hgd0Var;
    }

    /* JADX INFO: renamed from: J */
    public void m11007J(String str) {
        n8c.c("zk", "setSei" + this.f4369h1);
        eyx.c().g(new Object[]{"volc setSei:" + str});
        synchronized (this.f4345Z0) {
            try {
                this.f4366g1 = str;
                if (!((vlw) this.f4333W0).X0) {
                    if (TextUtils.isEmpty(this.f4369h1)) {
                        m11170y7(str);
                    } else {
                        m11171z7(this.f4369h1, false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public long m11008J0() {
        return 0L;
    }

    /* JADX INFO: renamed from: J6 */
    public void m11010J6(long j, boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteRemoteAudioStream", "uid:" + j + "mute:" + z});
        RTCRoomEx rTCRoomEx = this.f4330V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeStreamAudio(String.valueOf(j), !z);
        }
    }

    /* JADX INFO: renamed from: K5 */
    public void m11013K5(MRtcAudioHandler mRtcAudioHandler) {
        this.f4394r1 = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: K6 */
    public void m11014K6(long j, boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteRemoteVideoStream", "mute:" + z + ",uid:" + j});
        RTCRoomEx rTCRoomEx = this.f4330V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeStreamVideo(String.valueOf(j), !z);
        }
    }

    /* JADX INFO: renamed from: K7 */
    public void m11015K7(boolean z) {
        if (z) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "set Stream ReplaceMode");
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setStreamReplaceMode:" + z});
        this.f4278F1 = z;
    }

    /* JADX INFO: renamed from: L */
    public void m11016L(sml.a aVar) {
        this.f4298M0 = aVar;
    }

    /* JADX INFO: renamed from: L0 */
    public long m11017L0() {
        return 0L;
    }

    /* JADX INFO: renamed from: L1 */
    public long m11018L1() {
        return 0L;
    }

    /* JADX INFO: renamed from: L5 */
    public void m11019L5(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f4396s1 = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: L6 */
    public void m11020L6(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"muteSingerAudioStream", "mute:" + z});
        n8c.c("zk", "--ktv,muteSingerAudioStream:" + this.f4284H1 + "-->" + z);
        this.f4284H1 = z;
    }

    /* JADX INFO: renamed from: L7 */
    public void m11021L7(int i) {
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 != null) {
            iMediaPlayerM10978z6.setPosition(i);
        } else {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setSurroundMusicPos", "audioMixingManager is null"});
        }
    }

    /* JADX INFO: renamed from: M0 */
    public int m11022M0() {
        return (int) ((MediaBaseCodecFilter) this).H.i;
    }

    /* JADX INFO: renamed from: M1 */
    public void m11023M1() {
        yw00 yw00Var;
        if (this.f4328V == null && (yw00Var = this.f4378k0) != null) {
            this.f4328V = yw00Var.l();
        }
        if (((ccj) this).texture_in == 0 || this.f4380k2 || !this.f4338X1) {
            return;
        }
        synchronized (this.f4345Z0) {
            try {
                VideoFrameData videoFrameData = new VideoFrameData();
                videoFrameData.bufferType = VideoBufferType.GL_TEXTURE;
                videoFrameData.pixelFormat = VideoPixelFormat.TEXTURE_2D;
                videoFrameData.eglContext = this.f4328V;
                videoFrameData.textureId = ((ccj) this).texture_in;
                videoFrameData.textureMatrix = f4265k3;
                videoFrameData.seiData = null;
                videoFrameData.roiData = null;
                qmr qmrVar = this.f4333W0;
                videoFrameData.width = ((ulw) qmrVar).m;
                videoFrameData.height = ((ulw) qmrVar).n;
                videoFrameData.rotation = VideoRotation.VIDEO_ROTATION_0;
                videoFrameData.timestampUs = System.currentTimeMillis() * 1000000;
                RTCEngineEx rTCEngineEx = this.f4326U1;
                if (rTCEngineEx != null) {
                    rTCEngineEx.pushExternalVideoFrame(videoFrameData);
                }
                xxx.F().M();
            } catch (Throwable th) {
                throw th;
            }
        }
        long j = this.f4287I1 + 1;
        this.f4287I1 = j;
        if (j >= 30 || this.f4351b1) {
            m10835M6();
            if (this.f4350a3 <= 0) {
                this.f4350a3 = System.currentTimeMillis();
            }
        }
        if (this.f4347Z2 || this.f4350a3 <= 0 || System.currentTimeMillis() - this.f4350a3 <= 5000) {
            return;
        }
        this.f4347Z2 = true;
        Log.e("lqdebug", "VOLC PUBLISHED");
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"notifyPublished", "VOLC PUBLISHED"});
        this.f4307P0.g(4104, 0, 0, this);
    }

    /* JADX INFO: renamed from: N0 */
    public long m11025N0() {
        return 0L;
    }

    /* JADX INFO: renamed from: N1 */
    public int m11026N1() {
        return this.f4277F0;
    }

    /* JADX INFO: renamed from: N5 */
    public void m11027N5(MRtcChannelHandler mRtcChannelHandler) {
        this.f4400u1 = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: N6 */
    public void m11028N6(int i, int i2) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"onClientRoleChanged", Integer.valueOf(i), Integer.valueOf(i2)});
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        if (zmxVar.b) {
            if (zmxVar.c1 == 1) {
                m11107h2();
            } else {
                m11095f2();
            }
        }
        MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler = this.f4410z1;
        if (mRtcClientRoleChangedHandler != null) {
            mRtcClientRoleChangedHandler.onClientRoleChanged(i, i2);
        }
        hgd0 hgd0Var = this.f4308P1;
        if (hgd0Var != null) {
            hgd0Var.m9319e(i, i2);
        }
    }

    /* JADX INFO: renamed from: N7 */
    public void m11029N7(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setUserVisibility", Boolean.valueOf(z)});
        JSONObject jSONObject = new JSONObject();
        try {
            RTCRoomEx rTCRoomEx = this.f4330V1;
            if (rTCRoomEx == null || this.f4326U1 == null) {
                return;
            }
            rTCRoomEx.setUserVisibility(z);
            if (z) {
                jSONObject.put("rtc.audio_enable_playback_post", "{\"rtc.audio_enable_playback_post\":true}");
                this.f4326U1.setRuntimeParameters(jSONObject);
                this.f4326U1.startAudioCapture();
            } else {
                jSONObject.put("rtc.audio_enable_playback_post", "{\"rtc.audio_enable_playback_post\":false}");
                this.f4326U1.setRuntimeParameters(jSONObject);
                this.f4326U1.stopAudioCapture();
            }
        } catch (Exception e) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setUserVisibility falied:" + e.toString()});
        }
    }

    /* JADX INFO: renamed from: O0 */
    public long m11030O0() {
        return this.f4280G0;
    }

    /* JADX INFO: renamed from: O5 */
    public void m11031O5(MRtcConnectHandler mRtcConnectHandler) {
        this.f4408y1 = mRtcConnectHandler;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a0 A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02a5 A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:118:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[Catch: Exception -> 0x0361, TRY_ENTER, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009b A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4 A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5 A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x016d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0185  */
    /* JADX WARN: Code duplicated, block: B:81:0x018d A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0197 A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x019d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a1 A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9 A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b5 A[PHI: r18
      0x01b5: PHI (r18v5 java.lang.String) = (r18v4 java.lang.String), (r18v8 java.lang.String), (r18v9 java.lang.String) binds: [B:86:0x019f, B:93:0x01b7, B:90:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ef A[Catch: Exception -> 0x0361, TryCatch #3 {Exception -> 0x0361, blocks: (B:18:0x005c, B:20:0x0063, B:23:0x0070, B:25:0x0076, B:28:0x007e, B:30:0x008d, B:33:0x0095, B:35:0x009b, B:41:0x00df, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:51:0x00ff, B:53:0x0105, B:56:0x0110, B:58:0x0116, B:61:0x0122, B:63:0x0128, B:66:0x013d, B:68:0x0143, B:71:0x0158, B:73:0x015e, B:76:0x0172, B:78:0x0178, B:81:0x018d, B:83:0x0197, B:87:0x01a1, B:89:0x01a9, B:94:0x01ba, B:98:0x01d6, B:100:0x020a, B:102:0x02a0, B:104:0x02a9, B:103:0x02a5, B:99:0x01ef, B:105:0x031d, B:37:0x00d4), top: B:118:0x005c }] */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01b5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x01ef, please report this as an issue */
    /* JADX INFO: renamed from: O6 */
    public void m11032O6(String str) {
        String str2;
        String str3;
        JSONObject jSONObject;
        String string;
        JSONObject jSONObject2;
        String str4;
        String string2;
        ArrayList arrayList;
        JSONArray jSONArray;
        int i;
        JSONObject jSONObject3;
        String string3;
        double d;
        double d2;
        double d3;
        double d4;
        int i2;
        double d5;
        char c;
        MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig;
        String str5;
        String str6;
        String str7 = "alpha";
        String str8 = "z";
        String str9 = "h";
        String str10 = "w";
        String str11 = "y";
        String str12 = "x";
        String str13 = "id";
        String str14 = ",";
        String str15 = "regions code:";
        try {
            str2 = "pkmu";
            try {
                jSONObject = new JSONObject(str);
                if (jSONObject.has("ts")) {
                    jSONObject.remove("ts");
                }
                str3 = "renderMode";
                try {
                    jSONObject.put("ts", Y1());
                    if (jSONObject.has("bType")) {
                        jSONObject.remove("bType");
                    }
                    jSONObject.put("bType", ((MediaBaseCodecFilter) this).H.s);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            } catch (Exception unused2) {
                str3 = "renderMode";
                jSONObject = null;
                if (jSONObject != null) {
                    try {
                        string = jSONObject.toString();
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                } else {
                    string = str;
                }
                jSONObject2 = new JSONObject(string);
                str4 = "";
                if (jSONObject2.has("mid")) {
                    string2 = jSONObject2.getString("mid");
                } else {
                    string2 = "";
                }
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                arrayList = new ArrayList();
                if (!jSONObject2.has("conf")) {
                    jSONArray = jSONObject2.getJSONArray("conf");
                } else {
                    if (!jSONObject2.has("has")) {
                        return;
                    }
                    jSONArray = jSONObject2.getJSONArray("has");
                    if (jSONArray != null) {
                        MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig2 = new MixedStreamLayoutRegionConfig();
                        mixedStreamLayoutRegionConfig2.userID = string2;
                        mixedStreamLayoutRegionConfig2.zOrder = 1;
                        mixedStreamLayoutRegionConfig2.locationX = 0;
                        mixedStreamLayoutRegionConfig2.locationY = 0;
                        MixedStreamVideoConfig mixedStreamVideoConfig = this.f4342Y1.videoConfig;
                        mixedStreamLayoutRegionConfig2.width = mixedStreamVideoConfig.width;
                        mixedStreamLayoutRegionConfig2.height = mixedStreamVideoConfig.height;
                        mixedStreamLayoutRegionConfig2.alpha = 1.0d;
                        mixedStreamLayoutRegionConfig2.isLocalUser = true;
                        mixedStreamLayoutRegionConfig2.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                        mixedStreamLayoutRegionConfig2.roomID = this.f4333W0.f3960g1;
                        mixedStreamLayoutRegionConfig2.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
                        mixedStreamLayoutRegionConfig2.regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
                        arrayList.add(mixedStreamLayoutRegionConfig2);
                    }
                }
                if (jSONArray == null) {
                    return;
                }
                i = 0;
                while (i < jSONArray.length()) {
                    jSONObject3 = (JSONObject) jSONArray.get(i);
                    if (jSONObject3 == null) {
                        string3 = str4;
                    } else {
                        string3 = str4;
                    }
                    d = 0.0d;
                    if (jSONObject3 == null) {
                        d2 = 0.0d;
                    } else {
                        d2 = 0.0d;
                    }
                    if (jSONObject3 != null) {
                        d = jSONObject3.getDouble(str11);
                    }
                    String str16 = str11;
                    String str17 = str12;
                    double d6 = d;
                    if (jSONObject3 == null) {
                        d3 = 1.0d;
                    } else {
                        d3 = 1.0d;
                    }
                    if (jSONObject3 == null) {
                        d4 = 1.0d;
                    } else {
                        d4 = 1.0d;
                    }
                    if (jSONObject3 == null) {
                        i2 = 1;
                    } else {
                        i2 = 1;
                    }
                    if (jSONObject3 == null) {
                        d5 = 1.0d;
                    } else {
                        d5 = 1.0d;
                    }
                    if (jSONObject3 != null) {
                        str6 = str3;
                        if (jSONObject3.has(str6)) {
                            jSONObject3.getString(str6);
                        }
                        str3 = str6;
                    }
                    if (jSONObject3 != null) {
                        str5 = str2;
                        if (jSONObject3.has(str5)) {
                            str2 = str5;
                            c = jSONObject3.getInt(str5) == 2 ? (char) 255 : (char) 0;
                        } else {
                            str2 = str5;
                        }
                    }
                    mixedStreamLayoutRegionConfig = new MixedStreamLayoutRegionConfig();
                    ArrayList arrayList2 = arrayList;
                    if (string3.equals(String.valueOf(((vlw) this.f4333W0).B0))) {
                        mixedStreamLayoutRegionConfig.isLocalUser = true;
                        Log.e("lqdebug", "setLocalUser true id:" + string3);
                    } else {
                        mixedStreamLayoutRegionConfig.isLocalUser = false;
                        Log.e("lqdebug", "setLocalUser false id:" + string3);
                    }
                    mixedStreamLayoutRegionConfig.userID = string3;
                    mixedStreamLayoutRegionConfig.roomID = this.f4333W0.f3960g1;
                    MixedStreamVideoConfig mixedStreamVideoConfig2 = this.f4342Y1.videoConfig;
                    int i3 = mixedStreamVideoConfig2.width;
                    mixedStreamLayoutRegionConfig.locationX = (int) (((double) i3) * d2);
                    int i4 = mixedStreamVideoConfig2.height;
                    mixedStreamLayoutRegionConfig.locationY = (int) (((double) i4) * d6);
                    mixedStreamLayoutRegionConfig.width = (int) (((double) i3) * d3);
                    mixedStreamLayoutRegionConfig.height = (int) (((double) i4) * d4);
                    hmx hmxVar = ((MediaBaseCodecFilter) this).I;
                    StringBuilder sb = new StringBuilder();
                    String str18 = str15;
                    sb.append(str18);
                    sb.append(arrayList2.hashCode());
                    sb.append(", mv.height:");
                    sb.append(this.f4342Y1.videoConfig.height);
                    sb.append(",mv.width:");
                    sb.append(this.f4342Y1.videoConfig.width);
                    sb.append(",x:");
                    sb.append(d2);
                    sb.append(",y:");
                    sb.append(d6);
                    sb.append(",w:");
                    sb.append(d3);
                    sb.append(",h:");
                    sb.append(d4);
                    sb.append(",uerid:");
                    sb.append(string3);
                    hmxVar.l(new Object[]{sb.toString()});
                    mixedStreamLayoutRegionConfig.alpha = d5;
                    mixedStreamLayoutRegionConfig.zOrder = i2;
                    if (c == 255) {
                        mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY;
                    } else {
                        mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
                    }
                    mixedStreamLayoutRegionConfig.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                    mixedStreamLayoutRegionConfig.regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
                    hmx hmxVar2 = ((MediaBaseCodecFilter) this).I;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str18);
                    sb2.append(arrayList2.hashCode());
                    sb2.append(", add config: width");
                    sb2.append(mixedStreamLayoutRegionConfig.width);
                    sb2.append(",height:");
                    sb2.append(mixedStreamLayoutRegionConfig.height);
                    String str19 = str14;
                    sb2.append(str19);
                    sb2.append(mixedStreamLayoutRegionConfig.locationX);
                    sb2.append(str19);
                    sb2.append(mixedStreamLayoutRegionConfig.locationY);
                    sb2.append(",userid:");
                    sb2.append(string3);
                    hmxVar2.l(new Object[]{sb2.toString()});
                    arrayList2.add(mixedStreamLayoutRegionConfig);
                    i++;
                    str15 = str18;
                    str14 = str19;
                    str13 = str13;
                    str11 = str16;
                    str12 = str17;
                    str9 = str9;
                    str10 = str10;
                    jSONArray = jSONArray;
                    str7 = str7;
                    str8 = str8;
                    str4 = str4;
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = arrayList;
                MixedStreamConfig mixedStreamConfig = this.f4342Y1;
                mixedStreamConfig.userConfigExtraInfo = this.f4366g1;
                mixedStreamConfig.regions = (MixedStreamLayoutRegionConfig[]) arrayList3.toArray(new MixedStreamLayoutRegionConfig[arrayList3.size()]);
                hmx hmxVar3 = ((MediaBaseCodecFilter) this).I;
                hmxVar3.l(new Object[]{"volc setLayout", str4 + arrayList3.size() + ",regions.hashcode" + arrayList3.hashCode()});
            }
        } catch (Exception unused3) {
            str2 = "pkmu";
        }
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = str;
        }
        jSONObject2 = new JSONObject(string);
        str4 = "";
        if (jSONObject2.has("mid")) {
            string2 = jSONObject2.getString("mid");
        } else {
            string2 = "";
        }
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        arrayList = new ArrayList();
        if (!jSONObject2.has("conf")) {
            jSONArray = jSONObject2.getJSONArray("conf");
        } else {
            if (!jSONObject2.has("has")) {
                return;
            }
            jSONArray = jSONObject2.getJSONArray("has");
            if (jSONArray != null) {
                MixedStreamLayoutRegionConfig mixedStreamLayoutRegionConfig3 = new MixedStreamLayoutRegionConfig();
                mixedStreamLayoutRegionConfig3.userID = string2;
                mixedStreamLayoutRegionConfig3.zOrder = 1;
                mixedStreamLayoutRegionConfig3.locationX = 0;
                mixedStreamLayoutRegionConfig3.locationY = 0;
                MixedStreamVideoConfig mixedStreamVideoConfig3 = this.f4342Y1.videoConfig;
                mixedStreamLayoutRegionConfig3.width = mixedStreamVideoConfig3.width;
                mixedStreamLayoutRegionConfig3.height = mixedStreamVideoConfig3.height;
                mixedStreamLayoutRegionConfig3.alpha = 1.0d;
                mixedStreamLayoutRegionConfig3.isLocalUser = true;
                mixedStreamLayoutRegionConfig3.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                mixedStreamLayoutRegionConfig3.roomID = this.f4333W0.f3960g1;
                mixedStreamLayoutRegionConfig3.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
                mixedStreamLayoutRegionConfig3.regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
                arrayList.add(mixedStreamLayoutRegionConfig3);
            }
        }
        if (jSONArray == null) {
            return;
        }
        i = 0;
        while (i < jSONArray.length()) {
            jSONObject3 = (JSONObject) jSONArray.get(i);
            if (jSONObject3 == null && jSONObject3.has(str13)) {
                string3 = jSONObject3.getString(str13);
            } else {
                string3 = str4;
            }
            d = 0.0d;
            if (jSONObject3 == null && jSONObject3.has(str12)) {
                d2 = jSONObject3.getDouble(str12);
            } else {
                d2 = 0.0d;
            }
            if (jSONObject3 != null && jSONObject3.has(str11)) {
                d = jSONObject3.getDouble(str11);
            }
            String str110 = str11;
            String str111 = str12;
            double d7 = d;
            if (jSONObject3 == null && jSONObject3.has(str10)) {
                d3 = jSONObject3.getDouble(str10);
            } else {
                d3 = 1.0d;
            }
            if (jSONObject3 == null && jSONObject3.has(str9)) {
                d4 = jSONObject3.getDouble(str9);
            } else {
                d4 = 1.0d;
            }
            if (jSONObject3 == null && jSONObject3.has(str8)) {
                i2 = jSONObject3.getInt(str8) + 1;
            } else {
                i2 = 1;
            }
            if (jSONObject3 == null && jSONObject3.has(str7)) {
                d5 = jSONObject3.getDouble(str7);
            } else {
                d5 = 1.0d;
            }
            if (jSONObject3 != null) {
                str6 = str3;
                if (jSONObject3.has(str6)) {
                    jSONObject3.getString(str6);
                }
                str3 = str6;
            }
            if (jSONObject3 != null) {
                str5 = str2;
                if (jSONObject3.has(str5)) {
                    str2 = str5;
                    if (jSONObject3.getInt(str5) == 2) {
                    }
                } else {
                    str2 = str5;
                }
            }
            mixedStreamLayoutRegionConfig = new MixedStreamLayoutRegionConfig();
            ArrayList arrayList4 = arrayList;
            if (string3.equals(String.valueOf(((vlw) this.f4333W0).B0))) {
                mixedStreamLayoutRegionConfig.isLocalUser = true;
                Log.e("lqdebug", "setLocalUser true id:" + string3);
            } else {
                mixedStreamLayoutRegionConfig.isLocalUser = false;
                Log.e("lqdebug", "setLocalUser false id:" + string3);
            }
            mixedStreamLayoutRegionConfig.userID = string3;
            mixedStreamLayoutRegionConfig.roomID = this.f4333W0.f3960g1;
            MixedStreamVideoConfig mixedStreamVideoConfig4 = this.f4342Y1.videoConfig;
            int i5 = mixedStreamVideoConfig4.width;
            mixedStreamLayoutRegionConfig.locationX = (int) (((double) i5) * d2);
            int i6 = mixedStreamVideoConfig4.height;
            mixedStreamLayoutRegionConfig.locationY = (int) (((double) i6) * d7);
            mixedStreamLayoutRegionConfig.width = (int) (((double) i5) * d3);
            mixedStreamLayoutRegionConfig.height = (int) (((double) i6) * d4);
            hmx hmxVar4 = ((MediaBaseCodecFilter) this).I;
            StringBuilder sb3 = new StringBuilder();
            String str112 = str15;
            sb3.append(str112);
            sb3.append(arrayList4.hashCode());
            sb3.append(", mv.height:");
            sb3.append(this.f4342Y1.videoConfig.height);
            sb3.append(",mv.width:");
            sb3.append(this.f4342Y1.videoConfig.width);
            sb3.append(",x:");
            sb3.append(d2);
            sb3.append(",y:");
            sb3.append(d7);
            sb3.append(",w:");
            sb3.append(d3);
            sb3.append(",h:");
            sb3.append(d4);
            sb3.append(",uerid:");
            sb3.append(string3);
            hmxVar4.l(new Object[]{sb3.toString()});
            mixedStreamLayoutRegionConfig.alpha = d5;
            mixedStreamLayoutRegionConfig.zOrder = i2;
            if (c == 255) {
                mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY;
            } else {
                mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
            }
            mixedStreamLayoutRegionConfig.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
            mixedStreamLayoutRegionConfig.regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
            hmx hmxVar5 = ((MediaBaseCodecFilter) this).I;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str112);
            sb4.append(arrayList4.hashCode());
            sb4.append(", add config: width");
            sb4.append(mixedStreamLayoutRegionConfig.width);
            sb4.append(",height:");
            sb4.append(mixedStreamLayoutRegionConfig.height);
            String str113 = str14;
            sb4.append(str113);
            sb4.append(mixedStreamLayoutRegionConfig.locationX);
            sb4.append(str113);
            sb4.append(mixedStreamLayoutRegionConfig.locationY);
            sb4.append(",userid:");
            sb4.append(string3);
            hmxVar5.l(new Object[]{sb4.toString()});
            arrayList4.add(mixedStreamLayoutRegionConfig);
            i++;
            str15 = str112;
            str14 = str113;
            str13 = str13;
            str11 = str110;
            str12 = str111;
            str9 = str9;
            str10 = str10;
            jSONArray = jSONArray;
            str7 = str7;
            str8 = str8;
            str4 = str4;
            arrayList = arrayList4;
        }
        ArrayList arrayList5 = arrayList;
        MixedStreamConfig mixedStreamConfig2 = this.f4342Y1;
        mixedStreamConfig2.userConfigExtraInfo = this.f4366g1;
        mixedStreamConfig2.regions = (MixedStreamLayoutRegionConfig[]) arrayList5.toArray(new MixedStreamLayoutRegionConfig[arrayList5.size()]);
        hmx hmxVar6 = ((MediaBaseCodecFilter) this).I;
        hmxVar6.l(new Object[]{"volc setLayout", str4 + arrayList5.size() + ",regions.hashcode" + arrayList5.hashCode()});
    }

    /* JADX INFO: renamed from: P0 */
    public void m11033P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
        this.f4321T0 = i4;
        this.f4325U0 = i2;
        this.f4329V0 = i3;
    }

    /* JADX INFO: renamed from: P5 */
    public void m11034P5(ymw ymwVar) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"addMRtcLRemoteStatsUpdataHandle", "handler:" + ymwVar});
        this.f4404w1 = ymwVar;
    }

    /* JADX INFO: renamed from: P7 */
    public void m11036P7(b2l0 b2l0Var) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVideoChannelTextureViewListener", "listner:" + b2l0Var, "useTexture:" + ((vlw) this.f4333W0).Z0});
        this.f4399t2 = b2l0Var;
    }

    /* JADX INFO: renamed from: Q0 */
    public int m11037Q0() {
        return this.f4338X1 ? m11149r6() : m11152s6();
    }

    /* JADX INFO: renamed from: Q5 */
    public void m11038Q5(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        this.f4410z1 = mRtcClientRoleChangedHandler;
    }

    /* JADX INFO: renamed from: Q7 */
    public void m11040Q7(z1l0 z1l0Var) {
        this.f4393q2 = z1l0Var;
    }

    /* JADX INFO: renamed from: R0 */
    public void m11041R0(vlw vlwVar, EGLContext eGLContext) {
        if (vlwVar == null || this.f4405w2 == 1) {
            return;
        }
        if (this.f4326U1 == null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"startRecord", "engine == null, may be appid is null"});
            this.f4307P0.g(4352, 806, 0, this);
            return;
        }
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        long j = this.f4334W1;
        zmxVar.c1 = j;
        if (j == 1) {
            zmxVar.B0 = "M".equals(m11162w1()) ? "VolcMaster" : "VolcSlaver";
        } else {
            zmxVar.B0 = "VolcAudience";
        }
        Log.e("lqdebug", "volc startRecord");
        super.R0(vlwVar, eGLContext);
        if (!(vlwVar instanceof qmr)) {
            throw new InvalidParameterException("Parameters error");
        }
        qmr qmrVar = (qmr) vlwVar;
        this.f4333W0 = qmrVar;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volc startRecord"});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "VolcPushFilter startRecord");
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "videoWidth:" + ((ulw) vlwVar).s + ",videoHeight:" + ((ulw) vlwVar).t + ",visualWidth:" + ((ulw) vlwVar).u + ",visualHeight:" + ((ulw) vlwVar).v + ",encodeWidth:" + ((ulw) vlwVar).m + ",encodeHeight:" + ((ulw) vlwVar).n + ",videoBitrate:" + ((ulw) vlwVar).H + ",audioBitrate:" + ((ulw) vlwVar).S + ",videoFPS:" + ((ulw) vlwVar).F + ",codecFPS:" + vlwVar.E0 + ",mergeCanvasWidth:" + ((ulw) qmrVar).k + ",mergeCanvasHeight:" + ((ulw) qmrVar).l + ",codecFPS:" + vlwVar.E0 + ",isHard:" + vlwVar.A0);
        this.f4362e3 = 2;
        this.f4343Y2 = false;
        this.f4355c2 = false;
        this.f4347Z2 = false;
        synchronized (this.f4345Z0) {
            try {
                m10883a6(this.f4334W1);
                zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
                long jCurrentTimeMillis = System.currentTimeMillis();
                zmxVar2.e = jCurrentTimeMillis;
                this.f4269B2 = jCurrentTimeMillis;
                qmr qmrVar2 = this.f4333W0;
                m10798C6(qmrVar2.f3960g1, ((vlw) qmrVar2).B0);
                if (this.f4366g1 != null) {
                    qmr qmrVar3 = this.f4333W0;
                    if (qmrVar3.f3961h1 && this.f4369h1 == null && !((vlw) qmrVar3).X0) {
                        m11170y7(this.f4366g1);
                    }
                }
                this.f4405w2 = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        st0.g().p(W1(), st0.f);
        zmx zmxVar3 = ((MediaBaseCodecFilter) this).H;
        zmxVar3.W = ((vlw) this.f4333W0).B0;
        zmxVar3.d1 = vlwVar.d();
        zmx zmxVar4 = ((MediaBaseCodecFilter) this).H;
        zmxVar4.b1 = ((ulw) vlwVar).b0 ? 1L : 0L;
        zmxVar4.x = vlwVar.v0;
        zmxVar4.X = this.f4333W0.f3960g1;
        zmxVar4.F0 = ((ulw) vlwVar).H;
        if (this.f4326U1 != null) {
            zmxVar4.p = RTCEngineEx.getSDKVersion();
        }
        ((MediaBaseCodecFilter) this).H.f = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: R5 */
    public void m11042R5(MRtcPusherHandler mRtcPusherHandler) {
        this.f4371h3 = mRtcPusherHandler;
    }

    /* JADX INFO: renamed from: R6 */
    public void m11043R6() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pauseRecording"});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "pauseRecording");
        RTCRoomEx rTCRoomEx = this.f4330V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.publishStreamAudio(false);
        }
    }

    /* JADX INFO: renamed from: R7 */
    public void m11044R7(a2l0 a2l0Var) {
        this.f4395r2 = a2l0Var;
    }

    /* JADX INFO: renamed from: S5 */
    public void m11045S5(MRtcQualityHandler mRtcQualityHandler) {
        this.f4406x1 = mRtcQualityHandler;
    }

    /* JADX INFO: renamed from: S6 */
    public void m11046S6() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pauseSurroundMusic"});
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 != null) {
            iMediaPlayerM10978z6.pause();
        } else {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"pauseSurroundMusic", "audioMixingManager is null"});
        }
    }

    /* JADX INFO: renamed from: S7 */
    public void m11047S7(int i, int i2, int i3) {
        if (this.f4326U1 == null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVideoConfig", "fatal error mRtcEngine is null"});
            return;
        }
        int i4 = ((vlw) this.f4333W0).S0;
        if (i4 == 0) {
            i4 = 15;
        }
        VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig();
        videoEncoderConfig.width = i;
        videoEncoderConfig.height = i2;
        videoEncoderConfig.frameRate = i4;
        videoEncoderConfig.maxBitrate = i3;
        if (fjx.R().G0()) {
            int iH0 = (int) (fjx.R().H0() * i3);
            videoEncoderConfig.minBitrate = iH0;
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setMinBitrate", Integer.valueOf(iH0)});
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVideoConfig", "width:" + i + ",height:" + i2 + ",bitrate:" + i3 + ",fps:" + i4});
        this.f4326U1.setVideoEncoderConfig(videoEncoderConfig);
    }

    /* JADX INFO: renamed from: T0 */
    public int m11048T0() {
        return 0;
    }

    /* JADX INFO: renamed from: T5 */
    public void m11049T5(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f4302N1 = mRtcReceiveSeiHandler;
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m11050T6(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        IAudioEffectPlayer iAudioEffectPlayerM10973y6 = m10973y6();
        if (iAudioEffectPlayerM10973y6 == null) {
            ((MediaBaseCodecFilter) this).I.k("playEffect", "volc engine is null");
            return false;
        }
        AudioMixingType audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT;
        if (!z) {
            audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        }
        iAudioEffectPlayerM10973y6.unloadAll();
        iAudioEffectPlayerM10973y6.preload(i, str);
        return iAudioEffectPlayerM10973y6.start(i, str, new AudioEffectPlayerConfig(audioMixingType, 1, 0, 0)) > 0;
    }

    /* JADX INFO: renamed from: T7 */
    public void m11051T7(String str) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volc setVideoMixerBackgroundImgUrl", str});
        if (this.f4342Y1 == null) {
            this.f4342Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        this.f4342Y1.backgroundImageURL = str;
    }

    /* JADX INFO: renamed from: U6 */
    public void m11053U6() {
        ((MediaBaseCodecFilter) this).H.r = m10935p6();
        ((MediaBaseCodecFilter) this).I.u();
    }

    /* JADX INFO: renamed from: U7 */
    public void m11054U7(int i, int i2, int i3, int i4) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVideoMixerBitrate", "bitrate:" + i, "Mixfps:" + i2});
        this.f4385n1 = i / LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE;
        this.f4387o1 = i2;
    }

    /* JADX INFO: renamed from: V0 */
    public long m11055V0() {
        return 0L;
    }

    /* JADX INFO: renamed from: V5 */
    public void m11056V5(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f4402v1 = mRtcTokenWillExpireHander;
    }

    /* JADX INFO: renamed from: V6 */
    public void m11057V6() {
        ((MediaBaseCodecFilter) this).H.D = m11165x1();
        ((MediaBaseCodecFilter) this).H.F = m11030O0();
        ((MediaBaseCodecFilter) this).H.G = m11144q1();
        ((MediaBaseCodecFilter) this).H.B = m10994F1();
        ((MediaBaseCodecFilter) this).H.N = m11162w1();
        ((MediaBaseCodecFilter) this).H.O = m11106h1();
        ((MediaBaseCodecFilter) this).H.P = m11067Y0();
        ((MediaBaseCodecFilter) this).H.v = getVideoWidth();
        ((MediaBaseCodecFilter) this).H.w = m11117k0();
        ((MediaBaseCodecFilter) this).H.j = m11105h0();
        ((MediaBaseCodecFilter) this).H.k = m11026N1();
        ((MediaBaseCodecFilter) this).H.l = m11058W0();
        ((MediaBaseCodecFilter) this).H.r = m10935p6();
        ((MediaBaseCodecFilter) this).H.S = ((ulw) Z1()).w;
        ((MediaBaseCodecFilter) this).H.T = ((ulw) Z1()).x;
        ((MediaBaseCodecFilter) this).H.U = m10793B6();
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.V = this.f4382l2 ? 1L : 0L;
        zmxVar.R = 1000L;
        if (this.f4326U1 != null) {
            zmxVar.p = RTCEngineEx.getSDKVersion();
        }
        zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
        vlw vlwVar = ((MediaBaseCodecFilter) this).s;
        zmxVar2.F0 = ((ulw) vlwVar).H;
        zmxVar2.g = vlwVar.H0 ? 2L : 0L;
        zmxVar2.h1 = vlwVar.X0 ? 1 : 0;
        zmx zmxVar3 = ((MediaBaseCodecFilter) this).H;
        zmxVar3.k1 = ((MediaBaseCodecFilter) this).s.H0 ? 1 : 0;
        zmxVar3.a1 = this.f4385n1;
        zmxVar3.l1 = xxx.F().a().getWidth();
        ((MediaBaseCodecFilter) this).H.m1 = xxx.F().a().getHeight();
        ((MediaBaseCodecFilter) this).H.n1 = xxx.F().w();
        zmx zmxVar4 = ((MediaBaseCodecFilter) this).H;
        zmxVar4.o1 = ((MediaBaseCodecFilter) this).s.S0;
        zmxVar4.j0 = this.f4273D2;
        zmxVar4.q1.clear();
        ((MediaBaseCodecFilter) this).H.r1.clear();
        ((MediaBaseCodecFilter) this).I.H();
    }

    /* JADX INFO: renamed from: W0 */
    public int m11058W0() {
        return 0;
    }

    /* JADX INFO: renamed from: W5 */
    public void m11059W5(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"adjustPlaybackSignalVolume", "volume:" + i});
        RTCEngineEx rTCEngineEx = this.f4326U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setPlaybackVolume(i);
        }
    }

    /* JADX INFO: renamed from: W6 */
    public void m11060W6(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"registerAudioFrameObserver", "" + z});
        RTCEngineEx rTCEngineEx = this.f4326U1;
        if (rTCEngineEx != null) {
            AudioFrameCallbackMethod audioFrameCallbackMethod = AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_PLAYBACK;
            AudioProcessorMethod audioProcessorMethod = AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD;
            if (!z) {
                rTCEngineEx.disableAudioFrameCallback(audioFrameCallbackMethod);
                this.f4326U1.disableAudioProcessor(audioProcessorMethod);
            } else {
                AudioFormat audioFormat = new AudioFormat(AudioSampleRate.AUDIO_SAMPLE_RATE_44100, AudioChannel.AUDIO_CHANNEL_STEREO, 1024);
                this.f4326U1.enableAudioFrameCallback(audioFrameCallbackMethod, audioFormat);
                this.f4326U1.enableAudioProcessor(audioProcessorMethod, audioFormat);
            }
        }
    }

    /* JADX INFO: renamed from: W7 */
    public void m11061W7(int i, int i2) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVideoSourceType", "index:" + i + ", sourceType:" + i2});
        StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
        VideoSourceType videoSourceType = VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL;
        RTCEngineEx rTCEngineEx = this.f4326U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setVideoSourceType(streamIndex, videoSourceType);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m11062X() {
        this.f4304O0 = false;
    }

    /* JADX INFO: renamed from: X0 */
    public long m11063X0() {
        return 0L;
    }

    /* JADX INFO: renamed from: X7 */
    public void m11065X7(cbl0 cbl0Var) {
        this.f4397s2 = cbl0Var;
        m11079b8(0);
        m11079b8(1);
    }

    /* JADX INFO: renamed from: Y */
    public void m11066Y(yw00 yw00Var, vlw vlwVar) {
        super.Y(yw00Var, vlwVar);
        this.f4378k0 = yw00Var;
        if (vlwVar == null) {
            return;
        }
        this.f4333W0 = (qmr) vlwVar;
        m10843O7();
        yw00 yw00Var2 = this.f4378k0;
        if (yw00Var2 != null) {
            this.f4328V = yw00Var2.l();
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "videoWidth:" + ((ulw) ((MediaBaseCodecFilter) this).s).s + ",videoHeight:" + ((ulw) ((MediaBaseCodecFilter) this).s).t + ",visualWidth:" + ((ulw) ((MediaBaseCodecFilter) this).s).u + ",visualHeight:" + ((ulw) ((MediaBaseCodecFilter) this).s).v + ",encodeWidth:" + ((ulw) ((MediaBaseCodecFilter) this).s).m + ",encodeHeight:" + ((ulw) ((MediaBaseCodecFilter) this).s).n + ",videoBitrate:" + ((ulw) ((MediaBaseCodecFilter) this).s).H + ",audioBitrate:" + ((ulw) ((MediaBaseCodecFilter) this).s).S + ",videoFPS:" + ((ulw) ((MediaBaseCodecFilter) this).s).F + ",codecFPS:" + ((MediaBaseCodecFilter) this).s.E0 + ",mergeCanvasWidth:" + ((ulw) ((qmr) ((MediaBaseCodecFilter) this).s)).k + ",mergeCanvasHeight:" + ((ulw) ((qmr) ((MediaBaseCodecFilter) this).s)).l + ",codecFPS:" + ((MediaBaseCodecFilter) this).s.E0 + ",isHard:" + ((MediaBaseCodecFilter) this).s.A0);
    }

    /* JADX INFO: renamed from: Y0 */
    public int m11067Y0() {
        RTCRoomStats rTCRoomStats = this.f4403v2;
        if (rTCRoomStats != null) {
            return rTCRoomStats.txVideoKBitRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y5 */
    public int m11068Y5(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"changeRole", Integer.valueOf(i)});
        boolean z = i == 1;
        int i2 = this.f4334W1;
        boolean z2 = i != i2;
        m11029N7(z);
        synchronized (this.f4345Z0) {
            if (1 == i) {
                try {
                    m10843O7();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f4334W1 = i;
        long j = i;
        ((MediaBaseCodecFilter) this).H.c1 = j;
        if (z2) {
            if (j == 2) {
                m11111i2();
                ((MediaBaseCodecFilter) this).H.B0 = "VolcAudience";
            } else {
                m11101g2();
                ((MediaBaseCodecFilter) this).H.B0 = "M".equals(m11162w1()) ? "VolcMaster" : "VolcSlaver";
            }
            m11028N6(i2, this.f4334W1);
            ((MediaBaseCodecFilter) this).H.f = System.currentTimeMillis();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y7 */
    public int m11070Y7(int i) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVoiceReverbType", Integer.valueOf(i)});
        if (this.f4326U1 == null) {
            return -1;
        }
        VoiceChangerType voiceChangerTypeD = fa1.b().d(i);
        if (voiceChangerTypeD != null) {
            int voiceChangerType = this.f4326U1.setVoiceChangerType(voiceChangerTypeD);
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVoiceChangerType", Integer.valueOf(i), Integer.valueOf(voiceChangerType)});
            return voiceChangerType;
        }
        VoiceReverbType voiceReverbTypeC = fa1.b().c(i);
        if (voiceReverbTypeC != null) {
            int voiceReverbType = this.f4326U1.setVoiceReverbType(voiceReverbTypeC);
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVoiceReverbType", Integer.valueOf(i), Integer.valueOf(voiceReverbType)});
            return voiceReverbType;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setVoiceReverbType", "error preset" + i});
        return -1;
    }

    /* JADX INFO: renamed from: Z7 */
    public void m11072Z7(boolean z) {
        RTCEngineEx rTCEngineEx = this.f4326U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setEarMonitorMode(z ? EarMonitorMode.EAR_MONITOR_MODE_ON : EarMonitorMode.EAR_MONITOR_MODE_OFF);
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volc setVoicebackwardsEnable" + z});
    }

    /* JADX INFO: renamed from: a0 */
    public long m11073a0() {
        return xxx.F().l();
    }

    /* JADX INFO: renamed from: b1 */
    public long m11077b1() {
        return 0L;
    }

    /* JADX INFO: renamed from: b7 */
    public void m11078b7() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"resumeRecording"});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "resumeRecording");
        m10998G6(this.f4382l2);
        this.f4338X1 = true;
    }

    /* JADX INFO: renamed from: b8 */
    public void m11079b8(int i) {
        try {
            CongressUtil congressUtil = this.f4375j1;
            if (congressUtil != null) {
                congressUtil.setYuvCallback(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public long m11080c0() {
        return 0L;
    }

    /* JADX INFO: renamed from: c1 */
    public int m11081c1() {
        return 1;
    }

    /* JADX INFO: renamed from: c2 */
    public void m11082c2() {
        if (((MediaBaseCodecFilter) this).H.c1 == 1) {
            m11107h2();
        } else {
            m11095f2();
        }
    }

    /* JADX INFO: renamed from: c7 */
    public void m11083c7() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"resumeSurroundMusic"});
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 != null) {
            iMediaPlayerM10978z6.resume();
        } else {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"resumeSurroundMusic", "audioMixingManager is null"});
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m11085d1() {
        if (this.f4361e2) {
            return;
        }
        boolean z = this.f4362e3 > 0;
        if (((MediaBaseCodecFilter) this).H.c1 == 1) {
            m11057V6();
        } else {
            m11053U6();
        }
        if (z) {
            zmx zmxVar = ((MediaBaseCodecFilter) this).H;
            if (zmxVar.g1 < this.f4362e3 || this.f4294K2) {
                return;
            }
            zmxVar.y0 = 14L;
            zmxVar.k0 = 14;
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"MediaError", "14"});
            hu00.a aVar = this.f4307P0;
            if (aVar != null) {
                aVar.g(4353, 14, 0, this);
            }
            Handler handler = this.f4276E2;
            if (handler != null) {
                handler.post(new RunnableC0707b());
            }
        }
    }

    /* JADX INFO: renamed from: d7 */
    public void m11087d7(int i) {
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 != null) {
            iMediaPlayerM10978z6.selectAudioTrack(i);
        }
    }

    /* JADX INFO: renamed from: d8 */
    public void m11088d8(String str) {
        if (this.f4363f1) {
            return;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"startSurroundMusic", "" + str});
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 == null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"startSurroundMusic", "player is null"});
            return;
        }
        MediaPlayerConfig mediaPlayerConfig = new MediaPlayerConfig(AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH, 1);
        mediaPlayerConfig.autoPlay = true;
        iMediaPlayerM10978z6.setEventHandler(this.f4359d3);
        if (iMediaPlayerM10978z6.open(str, mediaPlayerConfig) == 0) {
            iMediaPlayerM10978z6.setProgressInterval(500L);
            this.f4363f1 = true;
            m10836M7(null, 1, 0);
        } else {
            hgd0 hgd0Var = this.f4308P1;
            if (hgd0Var != null) {
                hgd0Var.m9315a();
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public Surface m11089e0() {
        return null;
    }

    /* JADX INFO: renamed from: e1 */
    public void m11090e1(u3m u3mVar) {
        super.e1(u3mVar);
        if (!(u3mVar instanceof ExtAudioWrapper)) {
            throw new InvalidParameterException("ISurroundMusic must implement by ExtAudioWrapper");
        }
        u3m u3mVar2 = ((MediaBaseCodecFilter) this).K;
        if (u3mVar2 != null) {
            ((ExtAudioWrapper) u3mVar2).m9861r2();
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).m354J2(new C0713h());
            ((ExtAudioWrapper) ((MediaBaseCodecFilter) this).K).mo394s1(1);
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m11091e6(boolean z) {
        this.f4293K1 = z;
    }

    /* JADX INFO: renamed from: e7 */
    public int m11092e7(String str) {
        RTCRoomEx rTCRoomEx = this.f4330V1;
        if (rTCRoomEx != null) {
            return (int) rTCRoomEx.sendRoomMessage(str);
        }
        return -1;
    }

    /* JADX INFO: renamed from: e8 */
    public void m11093e8(String str, boolean z, boolean z2, int i) {
        if (this.f4363f1) {
            return;
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"startSurroundMusic", "" + str + ",loopback:" + z + ", cycle"});
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 != null) {
            AudioMixingType audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
            if (z) {
                audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT;
            }
            MediaPlayerConfig mediaPlayerConfig = new MediaPlayerConfig(audioMixingType, i);
            mediaPlayerConfig.autoPlay = true;
            iMediaPlayerM10978z6.setEventHandler(this.f4359d3);
            if (iMediaPlayerM10978z6.open(str, mediaPlayerConfig) == 0) {
                iMediaPlayerM10978z6.setProgressInterval(500L);
                this.f4363f1 = true;
                m10836M7(null, 1, 0);
            } else {
                hgd0 hgd0Var = this.f4308P1;
                if (hgd0Var != null) {
                    hgd0Var.m9315a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11094f() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"volc stopRecord"});
        this.f4338X1 = false;
        this.f4405w2 = 0;
        if (((MediaBaseCodecFilter) this).H.c1 == 1) {
            m11111i2();
        } else {
            m11101g2();
        }
        Timer timer = this.f4364f2;
        if (timer != null) {
            timer.cancel();
            this.f4364f2 = null;
        }
        m10803D6();
        m10872X6();
        PipelineConcurrentHashMap pipelineConcurrentHashMap = this.f4388o2;
        if (pipelineConcurrentHashMap != null) {
            pipelineConcurrentHashMap.clear();
        }
        super.p2();
        st0.g().q(st0.f);
        PipelineConcurrentHashMap<Long, ley> pipelineConcurrentHashMap2 = this.f4283H0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            this.f4283H0.clear();
        }
        ((MediaBaseCodecFilter) this).J = MomoCodec.MomoCodecState.STOP;
        this.f4307P0.g(8193, 0, 0, this);
    }

    /* JADX INFO: renamed from: f2 */
    public void m11095f2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pullStart_v3", Boolean.valueOf(this.f4365f3)});
        if (this.f4365f3) {
            return;
        }
        this.f4365f3 = true;
        ((MediaBaseCodecFilter) this).H.f1 = (!TextUtils.isEmpty(this.f4295L0) || TextUtils.isEmpty(this.f4341Y0)) ? 0L : 1L;
        ((MediaBaseCodecFilter) this).H.a = System.currentTimeMillis();
        long j = this.f4267A2;
        if (j == -1) {
            zmx zmxVar = ((MediaBaseCodecFilter) this).H;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
            zmxVar.e = jCurrentTimeMillis - zmxVar2.e;
            this.f4267A2 = zmxVar2.e;
        } else {
            this.f4267A2 = j;
        }
        ((MediaBaseCodecFilter) this).H.f = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.f;
        super.f2();
    }

    /* JADX INFO: renamed from: f7 */
    public void m11097f7(boolean z) {
        if (z) {
            ii70.d().c("Pipeline_Normal_pip->PIPLINE->AGORA", "set double push");
        }
        this.f4275E1 = z;
        this.f4351b1 = z;
    }

    /* JADX INFO: renamed from: g0 */
    public long m11099g0() {
        return 0L;
    }

    /* JADX INFO: renamed from: g1 */
    public String m11100g1(int i, int i2, Object obj) {
        return "";
    }

    /* JADX INFO: renamed from: g2 */
    public void m11101g2() {
        this.f4365f3 = false;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pullStop_v3"});
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.j0 = this.f4273D2;
        if (zmxVar.b) {
            zmxVar.h = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.a;
        }
        super.g2();
    }

    /* JADX INFO: renamed from: g6 */
    public void m11102g6(boolean z, String str) {
        this.f4392q1 = z;
        this.f4390p1 = str;
    }

    /* JADX INFO: renamed from: g7 */
    public void m11103g7() {
        RTCEngineEx rTCEngineEx = this.f4326U1;
        hmx hmxVar = ((MediaBaseCodecFilter) this).I;
        if (rTCEngineEx == null) {
            hmxVar.l(new Object[]{"setAudioConfig", "fatal error mRtcEngine is null"});
            return;
        }
        hmxVar.l(new Object[]{"mmLiveAudioProfile:" + this.f4282G2 + ",mmLiveAudioScenario:" + this.f4285H2 + ",getAudioProfile() = " + fjx.R().t() + ",getAudioScenario()=" + fjx.R().u()});
        int i = this.f4282G2;
        if (i != -1) {
            this.f4407x2 = m11166x6(i);
            ((MediaBaseCodecFilter) this).H.o0 = this.f4282G2;
        } else {
            int iT = fjx.R().t();
            if (iT != -1) {
                this.f4407x2 = m11166x6(iT);
                ((MediaBaseCodecFilter) this).H.o0 = iT;
            } else {
                this.f4407x2 = m11166x6(1);
                ((MediaBaseCodecFilter) this).H.o0 = 1;
            }
        }
        int i2 = this.f4285H2;
        if (i2 != -1) {
            this.f4409y2 = m11133n6(i2);
            ((MediaBaseCodecFilter) this).H.p0 = this.f4285H2;
        } else {
            int iU = fjx.R().u();
            if (iU != -1) {
                this.f4409y2 = m11133n6(iU);
                ((MediaBaseCodecFilter) this).H.p0 = iU;
            } else {
                this.f4409y2 = m11133n6(0);
                ((MediaBaseCodecFilter) this).H.p0 = 0;
            }
        }
        int i3 = ((vlw) this.f4333W0).b1;
        this.f4326U1.setAudioProfile(this.f4407x2);
        this.f4326U1.setAudioScenario(this.f4409y2);
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setAudioConfig", "audioProfile:" + this.f4407x2.value() + ", audioScenario:" + this.f4409y2.value()});
        ((MediaBaseCodecFilter) this).H.C0 = (long) m10924m6(this.f4407x2);
    }

    public int getRoomType() {
        return this.f4337X0;
    }

    public String getServerIpAddr() {
        return "0.0.0.0";
    }

    public int getVideoWidth() {
        if (this.f4354c1 || this.f4351b1) {
            return 0;
        }
        return ((ulw) ((MediaBaseCodecFilter) this).s).m;
    }

    /* JADX INFO: renamed from: h0 */
    public int m11105h0() {
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public int m11106h1() {
        RTCRoomStats rTCRoomStats = this.f4403v2;
        if (rTCRoomStats != null) {
            return rTCRoomStats.txAudioKBitRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: h2 */
    public void m11107h2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pushStart_v3"});
        if (this.f4365f3) {
            return;
        }
        this.f4365f3 = true;
        ((MediaBaseCodecFilter) this).H.a = System.currentTimeMillis();
        long j = this.f4267A2;
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        if (j == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zmx zmxVar2 = ((MediaBaseCodecFilter) this).H;
            zmxVar.e = jCurrentTimeMillis - zmxVar2.e;
            this.f4267A2 = zmxVar2.e;
        } else {
            zmxVar.e = j;
        }
        ((MediaBaseCodecFilter) this).H.v = getVideoWidth();
        ((MediaBaseCodecFilter) this).H.w = m11117k0();
        ((MediaBaseCodecFilter) this).H.z = m11142p1();
        ((MediaBaseCodecFilter) this).H.A = m10980A0();
        zmx zmxVar3 = ((MediaBaseCodecFilter) this).H;
        vlw vlwVar = ((MediaBaseCodecFilter) this).s;
        zmxVar3.g = vlwVar.H0 ? 2L : 0L;
        zmxVar3.h1 = vlwVar.X0 ? 1 : 0;
        ((MediaBaseCodecFilter) this).H.d1 = ((MediaBaseCodecFilter) this).s.d();
        zmx zmxVar4 = ((MediaBaseCodecFilter) this).H;
        vlw vlwVar2 = ((MediaBaseCodecFilter) this).s;
        zmxVar4.b1 = ((ulw) vlwVar2).b0 ? 1L : 0L;
        zmxVar4.x = vlwVar2.v0;
        zmxVar4.X = this.f4333W0.f3960g1;
        zmxVar4.k1 = vlwVar2.H0 ? 1 : 0;
        super.h2();
    }

    /* JADX INFO: renamed from: h6 */
    public void m11108h6(boolean z) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"enableDualStreamMode", Boolean.valueOf(z)});
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "call enableDualStreamMode:" + z);
        this.f4358d2 = z;
    }

    /* JADX INFO: renamed from: i2 */
    public void m11111i2() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"pushStop_v3"});
        this.f4365f3 = false;
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.j0 = this.f4273D2;
        if (zmxVar.b) {
            zmxVar.h = System.currentTimeMillis() - ((MediaBaseCodecFilter) this).H.a;
        }
        super.i2();
    }

    /* JADX INFO: renamed from: i7 */
    public void m11113i7(int i) {
        float f = i / 100.0f;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f4313R0 = f * 0.8f;
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 != null) {
            iMediaPlayerM10978z6.setVolume(i, AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH);
        } else {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setAudioMixingVolume audioMixingManager is null"});
        }
    }

    /* JADX INFO: renamed from: j1 */
    public long m11114j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j8 */
    public int m11116j8(String str, String str2, String str3) {
        if (((MediaBaseCodecFilter) this).H.b) {
            return m10910i8(str, str3);
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"subscribeOhterRoom", "not join room, stage:channelid:" + str});
        this.f4367g2 = true;
        this.f4370h2 = str3;
        this.f4373i2 = String.valueOf(str);
        return 0;
    }

    /* JADX INFO: renamed from: k0 */
    public int m11117k0() {
        if (this.f4354c1 || this.f4351b1) {
            return 0;
        }
        return ((ulw) ((MediaBaseCodecFilter) this).s).n;
    }

    /* JADX INFO: renamed from: k2 */
    public void m11118k2(String str) {
        String strM10952t6 = m10952t6(str);
        synchronized (this.f4345Z0) {
            try {
                RTCEngineEx rTCEngineEx = this.f4326U1;
                if (rTCEngineEx != null) {
                    rTCEngineEx.sendSEIMessage(StreamIndex.STREAM_INDEX_MAIN, strM10952t6.getBytes(), 0, SEICountPerFrame.SEI_COUNT_PER_FRAME_SINGLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k8 */
    public int m11121k8(String str) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"unSubscribeOtherRoom"});
        RTCRoomEx rTCRoomEx = this.f4330V1;
        if (rTCRoomEx == null) {
            return -4;
        }
        rTCRoomEx.stopForwardStreamToRooms();
        this.f4279F2 = false;
        return 0;
    }

    /* JADX INFO: renamed from: l1 */
    public long m11123l1() {
        return 0L;
    }

    /* JADX INFO: renamed from: l7 */
    public void m11125l7(int i, int i2) {
        this.f4282G2 = i;
        this.f4285H2 = i2;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"VolcPusherFilter", "setmmLiveAudioProfile:" + this.f4282G2 + "," + this.f4285H2});
    }

    /* JADX INFO: renamed from: l8 */
    public void m11126l8(String str) {
        this.f4341Y0 = str;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateChannelkey", "key:" + str});
        if (this.f4330V1 == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f4330V1.updateToken(this.f4341Y0);
    }

    /* JADX INFO: renamed from: m0 */
    public int m11127m0() {
        return 0;
    }

    /* JADX INFO: renamed from: m7 */
    public void m11129m7(int i) {
        this.f4317S0 = i;
    }

    /* JADX INFO: renamed from: n0 */
    public long m11130n0() {
        return 0L;
    }

    /* JADX INFO: renamed from: n1 */
    public int m11131n1() {
        return this.f4329V0;
    }

    /* JADX INFO: renamed from: n6 */
    public AudioScenarioType m11133n6(int i) {
        if (i != 0) {
            return i != 1 ? AudioScenarioType.GAMESTREAMING : AudioScenarioType.DEFAULT;
        }
        return AudioScenarioType.GAMESTREAMING;
    }

    /* JADX INFO: renamed from: n7 */
    public void m11134n7(int i) {
        ((MediaBaseCodecFilter) this).H.i = i;
    }

    /* JADX INFO: renamed from: n8 */
    public void m11135n8(String str) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateRtmpUrl", str});
        if (this.f4326U1 == null || this.f4307P0 == null || TextUtils.isEmpty(str)) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateRtmpUrl:" + str + ",errorengin is :" + this.f4326U1});
            return;
        }
        if (str.equals(((MediaBaseCodecFilter) this).H.x)) {
            ((MediaBaseCodecFilter) this).I.k("updateRtmpUrl", "url  is no difference: newUrl:" + str + ",old:is" + ((MediaBaseCodecFilter) this).H.x);
            return;
        }
        ((MediaBaseCodecFilter) this).H.x = str;
        this.f4326U1.stopPushMixedStream(this.f4297L2, MixedStreamPushTargetType.PUSH_TO_CDN);
        this.f4355c2 = false;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateRtmpUrl:" + str + ",stopLiveTranscoding:taskId" + this.f4297L2});
        MRtcPusherHandler mRtcPusherHandler = this.f4371h3;
        if (mRtcPusherHandler != null) {
            mRtcPusherHandler.onPushChangeStreamUrl(str);
        }
        m10819H7(str);
    }

    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (fjx.R().n2()) {
            GLES20.glFlush();
        }
        ((ccj) this).texture_in = i;
        m11023M1();
    }

    /* JADX INFO: renamed from: o0 */
    public long m11137o0() {
        return 0L;
    }

    /* JADX INFO: renamed from: o6 */
    public int m11138o6() {
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 != null) {
            return iMediaPlayerM10978z6.getAudioTrackCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o7 */
    public void m11139o7(int i) {
        ((MediaBaseCodecFilter) this).H.s = i;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setBusinessType volc", Integer.valueOf(i)});
    }

    /* JADX INFO: renamed from: o8 */
    public void m11140o8(int i, int i2) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateTranscodeVideoWH", "width:" + i, "height:" + i2, "mergeW:" + ((ulw) this.f4333W0).k, "mergeH:" + ((ulw) this.f4333W0).l, "parW:" + ((ulw) this.f4333W0).s, ",parH:" + ((ulw) this.f4333W0).t});
        MixedStreamConfig mixedStreamConfig = this.f4342Y1;
        if (mixedStreamConfig == null) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"updateTranscodeVideoWH", "mixedStreamConfig is null"});
            return;
        }
        MixedStreamVideoConfig mixedStreamVideoConfig = mixedStreamConfig.videoConfig;
        mixedStreamVideoConfig.width = i;
        mixedStreamVideoConfig.height = i2;
    }

    /* JADX INFO: renamed from: p1 */
    public int m11142p1() {
        qmr qmrVar = this.f4333W0;
        int i = ((ulw) qmrVar).k;
        return i > 0 ? i : ((ulw) qmrVar).s;
    }

    /* JADX INFO: renamed from: p7 */
    public void m11143p7(String str) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setChannelkey", "key:" + str});
        this.f4341Y0 = str;
    }

    /* JADX INFO: renamed from: q1 */
    public long m11144q1() {
        return this.f4274E0;
    }

    /* JADX INFO: renamed from: q6 */
    public double m11145q6() {
        return 0.0d;
    }

    /* JADX INFO: renamed from: q7 */
    public void m11146q7(boolean z) {
        this.f4281G1 = z;
    }

    /* JADX INFO: renamed from: r0 */
    public long m11147r0() {
        return 0L;
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m11148r1() {
        return this.f4275E1;
    }

    /* JADX INFO: renamed from: r6 */
    public int m11149r6() {
        return this.f4289J0;
    }

    /* JADX INFO: renamed from: s0 */
    public int m11151s0() {
        return 0;
    }

    /* JADX INFO: renamed from: s6 */
    public int m11152s6() {
        return this.f4292K0;
    }

    /* JADX INFO: renamed from: s7 */
    public void m11153s7(boolean z) {
        this.f4294K2 = z;
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"setEnableConferenceReconnect:" + z});
    }

    public void stopSurroundMusic() {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"stopSurroundMusic"});
        if (this.f4326U1 != null) {
            IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
            if (iMediaPlayerM10978z6 != null) {
                iMediaPlayerM10978z6.stop();
            } else {
                ((MediaBaseCodecFilter) this).I.l(new Object[]{"stopSurroundMusic", "audioMixingManager is null"});
            }
            this.f4363f1 = false;
        }
    }

    /* JADX INFO: renamed from: t7 */
    public int m11154t7(boolean z) {
        RTCEngineEx rTCEngineEx = this.f4326U1;
        if (rTCEngineEx != null) {
            return z ? rTCEngineEx.setDefaultAudioRoute(AudioRoute.AUDIO_ROUTE_SPEAKERPHONE) : rTCEngineEx.setDefaultAudioRoute(AudioRoute.AUDIO_ROUTE_EARPIECE);
        }
        return -1;
    }

    /* JADX INFO: renamed from: u0 */
    public long m11155u0() {
        return 0L;
    }

    /* JADX INFO: renamed from: u1 */
    public long m11156u1() {
        return 0L;
    }

    /* JADX INFO: renamed from: u6 */
    public float m11157u6() {
        return this.f4313R0;
    }

    /* JADX INFO: renamed from: v6 */
    public long m11160v6() {
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 != null && this.f4363f1) {
            return iMediaPlayerM10978z6.getTotalDuration();
        }
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"getSurroundMusicDuration", "audioMixingManager is null"});
        return 0L;
    }

    /* JADX INFO: renamed from: w1 */
    public String m11162w1() {
        qmr qmrVar = this.f4333W0;
        return (qmrVar == null || qmrVar.f3961h1) ? "M" : "S";
    }

    /* JADX INFO: renamed from: w6 */
    public long m11163w6() {
        IMediaPlayer iMediaPlayerM10978z6 = m10978z6();
        if (iMediaPlayerM10978z6 != null && this.f4363f1) {
            return iMediaPlayerM10978z6.getPosition();
        }
        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "getSurroundMusicPos");
        return 0L;
    }

    /* JADX INFO: renamed from: w7 */
    public void m11164w7(String str) {
        if (this.f4326U1 == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            eyx.c().f("setEngineParameters", "para", str);
            return;
        }
        try {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setEngineParameters", "success", Integer.valueOf(this.f4326U1.setRuntimeParameters(new JSONObject(str)))});
        } catch (JSONException e) {
            ((MediaBaseCodecFilter) this).I.l(new Object[]{"setEngineParameters", "failed", e.getMessage()});
        }
    }

    /* JADX INFO: renamed from: x1 */
    public long m11165x1() {
        return this.f4376j2 * 1024;
    }

    /* JADX INFO: renamed from: x6 */
    public AudioProfileType m11166x6(int i) {
        if (i == 0) {
            return AudioProfileType.AUDIO_PROFILE_FLUENT;
        }
        if (i != 1) {
            return i != 2 ? AudioProfileType.AUDIO_PROFILE_HD_MONO : AudioProfileType.AUDIO_PROFILE_HD;
        }
        return AudioProfileType.AUDIO_PROFILE_HD_MONO;
    }

    /* JADX INFO: renamed from: y */
    public void m11168y(int i, int i2) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"enableAudioVolumeIndication", Integer.valueOf(i), Integer.valueOf(i2)});
        if (this.f4326U1 != null) {
            float f = i2 / 10.0f;
            Log.e("lqdebug", "enableAudioVolumeIndication:" + i + ",smooth:" + f);
            AudioPropertiesConfig audioPropertiesConfig = new AudioPropertiesConfig(i, false, true, AudioReportMode.AUDIO_REPORT_MODE_NORMAL, f);
            audioPropertiesConfig.enableVoicePitch = true;
            this.f4326U1.enableAudioPropertiesReport(audioPropertiesConfig);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m11169y0(int i, int i2, int i3) {
        ((MediaBaseCodecFilter) this).I.l(new Object[]{"enableAudioVolumeIndication", Integer.valueOf(i), Integer.valueOf(i2), "vad:" + i3});
        boolean z = i3 != 0;
        if (this.f4326U1 != null) {
            AudioPropertiesConfig audioPropertiesConfig = new AudioPropertiesConfig(i, false, z, AudioReportMode.AUDIO_REPORT_MODE_NORMAL, i2 / 10.0f);
            audioPropertiesConfig.enableVoicePitch = true;
            this.f4326U1.enableAudioPropertiesReport(audioPropertiesConfig);
        }
    }

    /* JADX INFO: renamed from: y7 */
    public void m11170y7(String str) {
        if (this.f4333W0 == null || str == null) {
            return;
        }
        if (this.f4342Y1 == null) {
            this.f4342Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        qmr qmrVar = this.f4333W0;
        int i = ((ulw) qmrVar).k;
        if (i > 0) {
            m11140o8(i, ((ulw) qmrVar).l);
        } else {
            int i2 = ((ulw) qmrVar).s;
            if (i2 > 0) {
                m11140o8(i2, i2);
            }
        }
        m11032O6(str);
        m10925m8(((vlw) this.f4333W0).v0);
    }

    /* JADX INFO: renamed from: z7 */
    public void m11171z7(String str, boolean z) {
        if (this.f4333W0 == null || str == null) {
            return;
        }
        if (this.f4342Y1 == null) {
            this.f4342Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        qmr qmrVar = this.f4333W0;
        int i = ((ulw) qmrVar).k;
        if (i > 0) {
            m11140o8(i, ((ulw) qmrVar).l);
        } else {
            int i2 = ((ulw) qmrVar).s;
            if (i2 > 0) {
                m11140o8(i2, i2);
            }
        }
        m11032O6(str);
        if (!this.f4349a2) {
            m10925m8(((vlw) this.f4333W0).v0);
            return;
        }
        if (((MediaBaseCodecFilter) this).H.b && ((MediaBaseCodecFilter) this).R != null && z) {
            String string = "" + this.f4366g1;
            try {
                JSONObject jSONObject = new JSONObject(string);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("asr", 44100);
                jSONObject2.put("w", ((ulw) ((MediaBaseCodecFilter) this).s).k);
                jSONObject2.put("h", ((ulw) ((MediaBaseCodecFilter) this).s).l);
                jSONObject2.put("gop", ((ulw) ((MediaBaseCodecFilter) this).s).G);
                jSONObject2.put("fps", ((ulw) ((MediaBaseCodecFilter) this).s).F);
                jSONObject2.put("vbr", ((ulw) ((MediaBaseCodecFilter) this).s).H);
                jSONObject2.put("vcpf", ((MediaBaseCodecFilter) this).s.H0 ? 2 : 1);
                jSONObject.put("mixInfo", jSONObject2);
                string = jSONObject.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String str2 = string;
            dix.d dVarH = dix.d().h(((MediaBaseCodecFilter) this).R.b());
            hmx hmxVar = ((MediaBaseCodecFilter) this).I;
            StringBuilder sb = new StringBuilder("server mix update uid:");
            sb.append(((vlw) this.f4333W0).B0);
            sb.append(",momoid:");
            sb.append(dVarH.c);
            sb.append("roomid:");
            sb.append(((MediaBaseCodecFilter) this).R);
            hmxVar.l(new Object[]{((MediaBaseCodecFilter) this).R.h()});
            HttpWrapper httpWrapper = HttpWrapper.getInstance();
            String str3 = dVarH.a;
            String str4 = dVarH.b;
            qmr qmrVar2 = this.f4333W0;
            int i3 = ((vlw) qmrVar2).B0;
            String str5 = dVarH.c;
            eix eixVar = ((MediaBaseCodecFilter) this).R;
            String strH = eixVar != null ? eixVar.h() : qmrVar2.f3960g1;
            String str6 = this.f4333W0.f3960g1;
            zmx zmxVar = ((MediaBaseCodecFilter) this).H;
            httpWrapper.updateChannel(str3, str4, i3, str5, strH, str6, zmxVar.A0, str2, "agora", ((MediaBaseCodecFilter) this).s.v0, (int) zmxVar.s);
        }
    }

    /* JADX INFO: renamed from: l.tdp0$h */
    public class C0713h implements ExtAudioWrapper.InterfaceC0020i {
        public C0713h() {
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

    /* JADX INFO: renamed from: A */
    public void m10979A() {
    }

    /* JADX INFO: renamed from: P6 */
    public void m11035P6() {
    }

    /* JADX INFO: renamed from: Z6 */
    public void m11071Z6() {
    }

    /* JADX INFO: renamed from: b0 */
    public void m11076b0() {
    }

    /* JADX INFO: renamed from: c8 */
    public void m11084c8() {
    }

    /* JADX INFO: renamed from: f8 */
    public void m11098f8() {
    }

    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    /* JADX INFO: renamed from: h8 */
    public void m11110h8() {
    }

    /* JADX INFO: renamed from: o */
    public void m11136o() {
    }

    /* JADX INFO: renamed from: l.tdp0$j */
    public class C0715j implements IAudioFrameObserver {
        public C0715j() {
        }

        public void onPlaybackAudioFrame(IAudioFrame iAudioFrame) {
            if (tdp0.this.f4389p0 == null || tdp0.this.f4298M0 == null) {
                return;
            }
            int iData_size = iAudioFrame.data_size();
            byte[] bArrM9856o2 = new byte[iData_size];
            iAudioFrame.getDataBuffer().get(bArrM9856o2, 0, iData_size);
            int i = tdp0.this.f4334W1;
            tdp0 tdp0Var = tdp0.this;
            if (i != 2) {
                if (tdp0Var.f4389p0 != null) {
                    tdp0.this.f4389p0.i(new mpd0(bArrM9856o2, System.currentTimeMillis(), iAudioFrame.channel().value()));
                }
            } else {
                if (((ulw) tdp0Var.f4333W0).R != 1 && iAudioFrame.channel().value() == 1) {
                    bArrM9856o2 = m300.m9856o2(bArrM9856o2, iData_size);
                }
                tdp0.this.f4298M0.C(new mpd0(bArrM9856o2, System.currentTimeMillis(), 2));
            }
        }

        public void onRecordAudioFrame(IAudioFrame iAudioFrame) {
            mpd0 mpd0VarMo345C;
            ByteBuffer byteBuffer;
            int iValue = iAudioFrame.channel().value();
            int unused = tdp0.this.f4376j2;
            tdp0.m10901g3(tdp0.this);
            int iData_size = iAudioFrame.data_size();
            byte[] bArrM9856o2 = new byte[iData_size];
            if (!tdp0.this.f4284H1) {
                iAudioFrame.getDataBuffer().get(bArrM9856o2, 0, iData_size);
            }
            if (tdp0.this.f4379k1 != null) {
                tdp0.this.f4379k1.onPcmDateCallback(((vlw) tdp0.this.f4333W0).B0, bArrM9856o2, 44100, iValue != 1);
            }
            mpd0 mpd0Var = null;
            if (((MediaBaseCodecFilter) tdp0.this).K != null) {
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).K).mo367W1(tdp0.this.f4313R0);
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).K).m353I2(2048, ((ulw) tdp0.this.f4333W0).P, iValue, "Volc");
                mpd0VarMo345C = ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).K).mo345C(new mpd0(bArrM9856o2, tdp0.this.f4317S0, iValue));
                if (mpd0VarMo345C != null && (byteBuffer = mpd0VarMo345C.b) != null) {
                    byteBuffer.get(bArrM9856o2, 0, iData_size);
                    iAudioFrame.getDataBuffer().rewind();
                    iAudioFrame.getDataBuffer().put(bArrM9856o2);
                    iAudioFrame.getDataBuffer().rewind();
                }
            } else {
                mpd0VarMo345C = null;
            }
            if (tdp0.this.f4298M0 == null || !tdp0.this.f4304O0) {
                return;
            }
            if (((MediaBaseCodecFilter) tdp0.this).K != null) {
                if (tdp0.this.f4389p0 != null) {
                    tdp0.this.f4389p0.j(1.0f);
                    if (((vlw) tdp0.this.f4333W0).X0) {
                        tdp0.this.f4389p0.k(1.0f);
                    }
                    mpd0Var = tdp0.this.f4389p0.g();
                }
                if (mpd0Var != null) {
                    tdp0 tdp0Var = tdp0.this;
                    ByteBuffer byteBufferH = mpd0VarMo345C != null ? tdp0Var.f4389p0.h(mpd0VarMo345C.c(), mpd0Var.c(), mpd0Var.e()) : tdp0Var.f4389p0.h(bArrM9856o2, mpd0Var.c(), mpd0Var.e());
                    if (byteBufferH != null) {
                        mpd0Var = new mpd0(byteBufferH.array(), mpd0Var.d(), iValue);
                    }
                }
            }
            if (mpd0Var != null) {
                mpd0 mpd0Var2 = new mpd0(iValue == 1 ? m300.m9856o2(mpd0Var.c(), mpd0Var.e()) : mpd0Var.c(), tdp0.this.f4317S0, 2);
                mpd0Var2.g(false);
                if (tdp0.this.f4298M0 != null) {
                    tdp0.this.f4298M0.C(mpd0Var2);
                    if (tdp0.m10949t3(tdp0.this) % 50 == 0) {
                        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                        return;
                    }
                    return;
                }
                return;
            }
            if (tdp0.this.f4334W1 != 2) {
                if (iValue == 1) {
                    bArrM9856o2 = m300.m9856o2(bArrM9856o2, iData_size);
                }
                mpd0 mpd0Var3 = new mpd0(bArrM9856o2, tdp0.this.f4317S0, 2);
                mpd0Var3.g(false);
                if (tdp0.this.f4298M0 != null) {
                    tdp0.this.f4298M0.C(mpd0Var3);
                    if (tdp0.m10949t3(tdp0.this) % 50 == 0) {
                        ii70.d().c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                    }
                }
            }
        }

        public void onCaptureMixedAudioFrame(IAudioFrame iAudioFrame) {
        }

        public void onMixedAudioFrame(IAudioFrame iAudioFrame) {
        }

        public void onRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame) {
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m11009J5(wmw wmwVar) {
    }

    /* JADX INFO: renamed from: J7 */
    public void m11011J7(float f) {
    }

    /* JADX INFO: renamed from: K1 */
    public void m11012K1(mpd0 mpd0Var) {
    }

    /* JADX INFO: renamed from: M5 */
    public void m11024M5(xmw xmwVar) {
    }

    /* JADX INFO: renamed from: Q6 */
    public void m11039Q6(int i) {
    }

    /* JADX INFO: renamed from: U5 */
    public void m11052U5(anw anwVar) {
    }

    /* JADX INFO: renamed from: a7 */
    public void m11074a7(int i) {
    }

    /* JADX INFO: renamed from: d6 */
    public void m11086d6(boolean z) {
    }

    /* JADX INFO: renamed from: f6 */
    public void m11096f6(boolean z) {
    }

    /* JADX INFO: renamed from: g8 */
    public void m11104g8(int i) {
    }

    /* JADX INFO: renamed from: h7 */
    public void m11109h7(int i) {
    }

    /* JADX INFO: renamed from: i6 */
    public void m11112i6(boolean z) {
    }

    /* JADX INFO: renamed from: j6 */
    public void m11115j6(boolean z) {
    }

    /* JADX INFO: renamed from: k6 */
    public void m11119k6(boolean z) {
    }

    /* JADX INFO: renamed from: k7 */
    public void m11120k7(boolean z) {
    }

    /* JADX INFO: renamed from: m1 */
    public void m11128m1(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: n2 */
    public void m11132n2(vlw vlwVar) {
    }

    /* JADX INFO: renamed from: r7 */
    public void m11150r7(double d) {
    }

    /* JADX INFO: renamed from: u7 */
    public void m11158u7(String str) {
    }

    /* JADX INFO: renamed from: v0 */
    public void m11159v0(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: v7 */
    public void m11161v7(String str) {
    }

    /* JADX INFO: renamed from: l.tdp0$a */
    public class C0706a implements IMediaPlayerEventHandler {
        public C0706a() {
        }

        public void onMediaPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError) {
            ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onMediaPlayerStateChanged", "playerId:" + i + ", state:" + playerState.toString()});
            if (i == tdp0.this.f4384m2) {
                if (playerState == PlayerState.FINISHED || playerState == PlayerState.LOOP_FINISHED) {
                    tdp0.this.f4363f1 = false;
                    tdp0.this.m10836M7(null, 2, 0);
                    if (tdp0.this.f4398t1 != null) {
                        tdp0.this.f4398t1.onAudioMixingFinished();
                        ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onAudioMixingFinished"});
                        return;
                    }
                    return;
                }
                if (playerState == PlayerState.PLAYING) {
                    if (tdp0.this.f4308P1 != null) {
                        tdp0.this.f4308P1.m9317c();
                        ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onAudioMixingPlay"});
                        return;
                    }
                    return;
                }
                if (playerState == PlayerState.PAUSED) {
                    if (tdp0.this.f4308P1 != null) {
                        tdp0.this.f4308P1.m9316b();
                        ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onAudioMixingPaused"});
                        return;
                    }
                    return;
                }
                if (playerState == PlayerState.STOPPED) {
                    if (tdp0.this.f4308P1 != null) {
                        tdp0.this.f4308P1.m9318d();
                        ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onAudioMixingStoped"});
                        return;
                    }
                    return;
                }
                if (playerState != PlayerState.FAILED || tdp0.this.f4308P1 == null) {
                    return;
                }
                tdp0.this.f4308P1.m9315a();
                ((MediaBaseCodecFilter) tdp0.this).I.l(new Object[]{"onAudioMixingFailed"});
            }
        }

        public void onMediaPlayerPlayingProgress(int i, long j) {
        }

        public void onMediaPlayerEvent(int i, PlayerEvent playerEvent, String str) {
        }
    }

    /* JADX INFO: renamed from: B7 */
    public void m10982B7(boolean z, int i) {
    }

    /* JADX INFO: renamed from: X5 */
    public void m11064X5(long j, float f) {
    }

    /* JADX INFO: renamed from: Y6 */
    public void m11069Y6(int i, int i2) {
    }

    /* JADX INFO: renamed from: a8 */
    public void m11075a8(int i, double d) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m11122l0(vlw vlwVar, EGLContext eGLContext) {
    }

    /* JADX INFO: renamed from: l6 */
    public void m11124l6(long j, boolean z) {
    }

    /* JADX INFO: renamed from: p */
    public void m11141p(String str, int i) {
    }

    /* JADX INFO: renamed from: x7 */
    public void m11167x7(boolean z, boolean z2) {
    }

    @RequiresApi(api = 15)
    public tdp0(Context context, yw00 yw00Var, hu00.a aVar, vlw vlwVar) {
        super(context);
        this.f4316S = "Pipeline_Normal_pip->PIPLINE->VOLC";
        this.f4320T = true;
        this.f4324U = -1;
        this.f4332W = false;
        this.f4336X = false;
        this.f4340Y = true;
        this.f4344Z = null;
        this.f4274E0 = 0L;
        this.f4277F0 = 0;
        this.f4280G0 = 0L;
        this.f4283H0 = new PipelineConcurrentHashMap<>();
        this.f4286I0 = new PipelineConcurrentHashMap<>();
        this.f4289J0 = 0;
        this.f4292K0 = 0;
        this.f4295L0 = null;
        this.f4301N0 = false;
        this.f4304O0 = false;
        this.f4310Q0 = 1.0f;
        this.f4313R0 = 1.0f;
        this.f4317S0 = 44100;
        this.f4321T0 = 0;
        this.f4325U0 = 0;
        this.f4329V0 = 0;
        this.f4337X0 = -1;
        this.f4341Y0 = null;
        this.f4345Z0 = new Object();
        this.f4348a1 = 0;
        this.f4351b1 = false;
        this.f4354c1 = false;
        this.f4357d1 = new Object();
        this.f4360e1 = new PipelineConcurrentHashMap();
        this.f4363f1 = false;
        this.f4372i1 = null;
        this.f4375j1 = null;
        this.f4381l1 = 0;
        this.f4383m1 = 0;
        this.f4385n1 = 750;
        this.f4387o1 = 0;
        this.f4390p1 = "";
        this.f4392q1 = false;
        this.f4266A1 = new zmw();
        this.f4268B1 = new zmw();
        this.f4270C1 = new jjw();
        this.f4272D1 = new vmw();
        this.f4275E1 = false;
        this.f4278F1 = false;
        this.f4281G1 = true;
        this.f4284H1 = false;
        this.f4287I1 = 0L;
        this.f4290J1 = null;
        this.f4293K1 = false;
        this.f4296L1 = Long.MIN_VALUE;
        this.f4299M1 = 1000L;
        this.f4302N1 = null;
        this.f4311Q1 = 1;
        this.f4314R1 = System.currentTimeMillis();
        this.f4318S1 = null;
        this.f4322T1 = -1;
        this.f4326U1 = null;
        this.f4330V1 = null;
        this.f4334W1 = 1;
        this.f4338X1 = false;
        this.f4349a2 = false;
        this.f4352b2 = false;
        this.f4355c2 = false;
        this.f4358d2 = false;
        this.f4361e2 = false;
        this.f4364f2 = null;
        this.f4367g2 = false;
        this.f4370h2 = "";
        this.f4376j2 = 0;
        this.f4380k2 = false;
        this.f4382l2 = false;
        this.f4384m2 = 0;
        this.f4386n2 = 1;
        this.f4388o2 = new PipelineConcurrentHashMap();
        this.f4391p2 = new ArrayList<>();
        this.f4393q2 = null;
        this.f4395r2 = null;
        this.f4397s2 = null;
        this.f4399t2 = null;
        this.f4401u2 = null;
        this.f4405w2 = 0;
        this.f4407x2 = AudioProfileType.AUDIO_PROFILE_HD_MONO;
        this.f4409y2 = AudioScenarioType.GAMESTREAMING;
        this.f4411z2 = null;
        this.f4267A2 = -1L;
        this.f4269B2 = -1L;
        this.f4271C2 = -1L;
        this.f4273D2 = 0;
        this.f4276E2 = new Handler(Looper.getMainLooper());
        this.f4279F2 = false;
        this.f4282G2 = -1;
        this.f4285H2 = -1;
        this.f4288I2 = 1;
        this.f4291J2 = 3;
        this.f4294K2 = false;
        this.f4297L2 = "";
        this.f4300M2 = null;
        this.f4306O2 = 0;
        this.f4309P2 = new C0709d();
        this.f4312Q2 = new C0710e();
        this.f4315R2 = new C0711f();
        this.f4319S2 = new C0712g();
        this.f4323T2 = 0;
        this.f4327U2 = 0;
        this.f4331V2 = null;
        this.f4335W2 = new C0714i();
        this.f4339X2 = new C0715j();
        this.f4343Y2 = false;
        this.f4347Z2 = false;
        this.f4350a3 = 0L;
        this.f4353b3 = false;
        this.f4356c3 = 0;
        this.f4359d3 = new C0706a();
        this.f4362e3 = 0;
        this.f4365f3 = false;
        this.f4368g3 = false;
        this.f4374i3 = "";
        this.f4377j3 = false;
        this.f4378k0 = yw00Var;
        this.f4333W0 = (qmr) vlwVar;
        this.f4307P0 = aVar;
        this.f4375j1 = new CongressUtil();
        m10788A6(vlwVar);
        zmx zmxVar = ((MediaBaseCodecFilter) this).H;
        zmxVar.d = 261L;
        zmxVar.e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }
}
