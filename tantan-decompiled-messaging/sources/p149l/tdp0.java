package p149l;

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
import com.bef.effectsdk.message.MessageCenter;
import com.core.glcore.util.DetectDelayStopHelper;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
import com.momo.pipline.codec.MediaBaseCodecFilter;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import com.momo.piplineext.bean.MMLiveSubtitleErrorCode;
import com.momo.piplineext.bean.MMLiveSubtitleMode;
import com.momo.piplineext.bean.MMLiveSubtitleState;
import com.momo.piplineext.http.HttpWrapper;
import com.momo.piplinemomoext.input.audio.ExtAudioWrapper;
import com.p069ss.bytertc.engine.IAudioFrameObserver;
import com.p069ss.bytertc.engine.IAudioFrameProcessor;
import com.p069ss.bytertc.engine.IMediaPlayerEventHandler;
import com.p069ss.bytertc.engine.RTCEngineEx;
import com.p069ss.bytertc.engine.RTCRoomConfig;
import com.p069ss.bytertc.engine.RTCRoomEx;
import com.p069ss.bytertc.engine.UserInfo;
import com.p069ss.bytertc.engine.VideoCanvas;
import com.p069ss.bytertc.engine.VideoEncoderConfig;
import com.p069ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.p069ss.bytertc.engine.audio.IMediaPlayer;
import com.p069ss.bytertc.engine.data.AudioChannel;
import com.p069ss.bytertc.engine.data.AudioEffectPlayerConfig;
import com.p069ss.bytertc.engine.data.AudioFormat;
import com.p069ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.p069ss.bytertc.engine.data.AudioMixingType;
import com.p069ss.bytertc.engine.data.AudioProcessorMethod;
import com.p069ss.bytertc.engine.data.AudioPropertiesConfig;
import com.p069ss.bytertc.engine.data.AudioPropertiesInfo;
import com.p069ss.bytertc.engine.data.AudioReportMode;
import com.p069ss.bytertc.engine.data.AudioRoute;
import com.p069ss.bytertc.engine.data.AudioSampleRate;
import com.p069ss.bytertc.engine.data.EarMonitorMode;
import com.p069ss.bytertc.engine.data.EngineConfig;
import com.p069ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.p069ss.bytertc.engine.data.ForwardStreamInfo;
import com.p069ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.p069ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.p069ss.bytertc.engine.data.LocalAudioStreamError;
import com.p069ss.bytertc.engine.data.LocalAudioStreamState;
import com.p069ss.bytertc.engine.data.MediaPlayerConfig;
import com.p069ss.bytertc.engine.data.PlayerError;
import com.p069ss.bytertc.engine.data.PlayerEvent;
import com.p069ss.bytertc.engine.data.PlayerState;
import com.p069ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.p069ss.bytertc.engine.data.RemoteAudioState;
import com.p069ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.p069ss.bytertc.engine.data.RemoteStreamKey;
import com.p069ss.bytertc.engine.data.SEICountPerFrame;
import com.p069ss.bytertc.engine.data.StreamIndex;
import com.p069ss.bytertc.engine.data.StreamKey;
import com.p069ss.bytertc.engine.data.StreamSyncInfoConfig;
import com.p069ss.bytertc.engine.data.SubscribeState;
import com.p069ss.bytertc.engine.data.SubscribeStateChangeReason;
import com.p069ss.bytertc.engine.data.VideoBufferType;
import com.p069ss.bytertc.engine.data.VideoFrameData;
import com.p069ss.bytertc.engine.data.VideoFrameInfo;
import com.p069ss.bytertc.engine.data.VideoPixelFormat;
import com.p069ss.bytertc.engine.data.VideoRotation;
import com.p069ss.bytertc.engine.data.VideoSourceType;
import com.p069ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p069ss.bytertc.engine.handler.IRTCEngineEventHandlerEx;
import com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.p069ss.bytertc.engine.handler.IRTCRoomEventHandlerEx;
import com.p069ss.bytertc.engine.live.MixedStreamAudioConfig;
import com.p069ss.bytertc.engine.live.MixedStreamAudioProfile;
import com.p069ss.bytertc.engine.live.MixedStreamConfig;
import com.p069ss.bytertc.engine.live.MixedStreamLayoutRegionConfig;
import com.p069ss.bytertc.engine.live.MixedStreamLayoutRegionType;
import com.p069ss.bytertc.engine.live.MixedStreamMediaType;
import com.p069ss.bytertc.engine.live.MixedStreamPushTargetConfig;
import com.p069ss.bytertc.engine.live.MixedStreamPushTargetType;
import com.p069ss.bytertc.engine.live.MixedStreamRenderMode;
import com.p069ss.bytertc.engine.live.MixedStreamTaskErrorCode;
import com.p069ss.bytertc.engine.live.MixedStreamTaskEvent;
import com.p069ss.bytertc.engine.live.MixedStreamTaskInfo;
import com.p069ss.bytertc.engine.live.MixedStreamVideoCodecType;
import com.p069ss.bytertc.engine.live.MixedStreamVideoConfig;
import com.p069ss.bytertc.engine.type.AudioDeviceType;
import com.p069ss.bytertc.engine.type.AudioProfileType;
import com.p069ss.bytertc.engine.type.AudioScenarioType;
import com.p069ss.bytertc.engine.type.ChannelProfile;
import com.p069ss.bytertc.engine.type.LocalStreamStats;
import com.p069ss.bytertc.engine.type.LocalVideoStreamError;
import com.p069ss.bytertc.engine.type.LocalVideoStreamState;
import com.p069ss.bytertc.engine.type.MediaStreamType;
import com.p069ss.bytertc.engine.type.NetworkQualityStats;
import com.p069ss.bytertc.engine.type.RTCRoomStats;
import com.p069ss.bytertc.engine.type.RemoteAudioStats;
import com.p069ss.bytertc.engine.type.RemoteStreamStats;
import com.p069ss.bytertc.engine.type.RemoteVideoState;
import com.p069ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.p069ss.bytertc.engine.type.RemoteVideoStats;
import com.p069ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.p069ss.bytertc.engine.type.StreamRemoveReason;
import com.p069ss.bytertc.engine.type.SubtitleErrorCode;
import com.p069ss.bytertc.engine.type.SubtitleMessage;
import com.p069ss.bytertc.engine.type.SubtitleMode;
import com.p069ss.bytertc.engine.type.SubtitleState;
import com.p069ss.bytertc.engine.type.VoiceChangerType;
import com.p069ss.bytertc.engine.type.VoiceReverbType;
import com.p069ss.bytertc.engine.utils.IAudioFrame;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import io.agora.rtc2.Constants;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class tdp0 extends MediaBaseCodecFilter implements sml, ewl, gw00.InterfaceC17174f {

    /* JADX INFO: renamed from: k3 */
    private static final float[] f169580k3 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A1 */
    private zmw f169581A1;

    /* JADX INFO: renamed from: A2 */
    private long f169582A2;

    /* JADX INFO: renamed from: B1 */
    private zmw f169583B1;

    /* JADX INFO: renamed from: B2 */
    private long f169584B2;

    /* JADX INFO: renamed from: C1 */
    private jjw f169585C1;

    /* JADX INFO: renamed from: C2 */
    private long f169586C2;

    /* JADX INFO: renamed from: D1 */
    private vmw f169587D1;

    /* JADX INFO: renamed from: D2 */
    private int f169588D2;

    /* JADX INFO: renamed from: E0 */
    private long f169589E0;

    /* JADX INFO: renamed from: E1 */
    private boolean f169590E1;

    /* JADX INFO: renamed from: E2 */
    private Handler f169591E2;

    /* JADX INFO: renamed from: F0 */
    private int f169592F0;

    /* JADX INFO: renamed from: F1 */
    private boolean f169593F1;

    /* JADX INFO: renamed from: F2 */
    private boolean f169594F2;

    /* JADX INFO: renamed from: G0 */
    private long f169595G0;

    /* JADX INFO: renamed from: G1 */
    private boolean f169596G1;

    /* JADX INFO: renamed from: G2 */
    private int f169597G2;

    /* JADX INFO: renamed from: H0 */
    private PipelineConcurrentHashMap<Long, ley> f169598H0;

    /* JADX INFO: renamed from: H1 */
    private boolean f169599H1;

    /* JADX INFO: renamed from: H2 */
    private int f169600H2;

    /* JADX INFO: renamed from: I0 */
    private PipelineConcurrentHashMap<Long, a9y> f169601I0;

    /* JADX INFO: renamed from: I1 */
    private long f169602I1;

    /* JADX INFO: renamed from: I2 */
    public final int f169603I2;

    /* JADX INFO: renamed from: J0 */
    private int f169604J0;

    /* JADX INFO: renamed from: J1 */
    private MRtcRealLayoutNotifyHander f169605J1;

    /* JADX INFO: renamed from: J2 */
    public final int f169606J2;

    /* JADX INFO: renamed from: K0 */
    private int f169607K0;

    /* JADX INFO: renamed from: K1 */
    private boolean f169608K1;

    /* JADX INFO: renamed from: K2 */
    private boolean f169609K2;

    /* JADX INFO: renamed from: L0 */
    private String f169610L0;

    /* JADX INFO: renamed from: L1 */
    private long f169611L1;

    /* JADX INFO: renamed from: L2 */
    private String f169612L2;

    /* JADX INFO: renamed from: M0 */
    private sml.InterfaceC19992a f169613M0;

    /* JADX INFO: renamed from: M1 */
    private long f169614M1;

    /* JADX INFO: renamed from: M2 */
    private m2m f169615M2;

    /* JADX INFO: renamed from: N0 */
    private boolean f169616N0;

    /* JADX INFO: renamed from: N1 */
    MRtcReceiveSeiHandler f169617N1;

    /* JADX INFO: renamed from: N2 */
    private jkw f169618N2;

    /* JADX INFO: renamed from: O0 */
    private boolean f169619O0;

    /* JADX INFO: renamed from: O1 */
    private MRtcExitRoomHandler f169620O1;

    /* JADX INFO: renamed from: O2 */
    private int f169621O2;

    /* JADX INFO: renamed from: P0 */
    private hu00.InterfaceC17392a f169622P0;

    /* JADX INFO: renamed from: P1 */
    private hgd0 f169623P1;

    /* JADX INFO: renamed from: P2 */
    IRTCEngineEventHandlerEx f169624P2;

    /* JADX INFO: renamed from: Q0 */
    private float f169625Q0;

    /* JADX INFO: renamed from: Q1 */
    private int f169626Q1;

    /* JADX INFO: renamed from: Q2 */
    IRTCEngineEventHandler f169627Q2;

    /* JADX INFO: renamed from: R0 */
    private float f169628R0;

    /* JADX INFO: renamed from: R1 */
    private long f169629R1;

    /* JADX INFO: renamed from: R2 */
    private IRTCRoomEventHandlerEx f169630R2;

    /* JADX INFO: renamed from: S */
    private final String f169631S;

    /* JADX INFO: renamed from: S0 */
    public int f169632S0;

    /* JADX INFO: renamed from: S1 */
    private Runnable f169633S1;

    /* JADX INFO: renamed from: S2 */
    private IRTCRoomEventHandler f169634S2;

    /* JADX INFO: renamed from: T */
    private boolean f169635T;

    /* JADX INFO: renamed from: T0 */
    private int f169636T0;

    /* JADX INFO: renamed from: T1 */
    private int f169637T1;

    /* JADX INFO: renamed from: T2 */
    private int f169638T2;

    /* JADX INFO: renamed from: U */
    private int f169639U;

    /* JADX INFO: renamed from: U0 */
    private int f169640U0;

    /* JADX INFO: renamed from: U1 */
    RTCEngineEx f169641U1;

    /* JADX INFO: renamed from: U2 */
    private int f169642U2;

    /* JADX INFO: renamed from: V */
    private EGLContext f169643V;

    /* JADX INFO: renamed from: V0 */
    private int f169644V0;

    /* JADX INFO: renamed from: V1 */
    RTCRoomEx f169645V1;

    /* JADX INFO: renamed from: V2 */
    private FileOutputStream f169646V2;

    /* JADX INFO: renamed from: W */
    private boolean f169647W;

    /* JADX INFO: renamed from: W0 */
    private qmr f169648W0;

    /* JADX INFO: renamed from: W1 */
    private int f169649W1;

    /* JADX INFO: renamed from: W2 */
    private IAudioFrameProcessor f169650W2;

    /* JADX INFO: renamed from: X */
    private boolean f169651X;

    /* JADX INFO: renamed from: X0 */
    protected int f169652X0;

    /* JADX INFO: renamed from: X1 */
    private volatile boolean f169653X1;

    /* JADX INFO: renamed from: X2 */
    private IAudioFrameObserver f169654X2;

    /* JADX INFO: renamed from: Y */
    private boolean f169655Y;

    /* JADX INFO: renamed from: Y0 */
    private String f169656Y0;

    /* JADX INFO: renamed from: Y1 */
    MixedStreamConfig f169657Y1;

    /* JADX INFO: renamed from: Y2 */
    private volatile boolean f169658Y2;

    /* JADX INFO: renamed from: Z */
    private String f169659Z;

    /* JADX INFO: renamed from: Z0 */
    private Object f169660Z0;

    /* JADX INFO: renamed from: Z1 */
    MixedStreamPushTargetConfig f169661Z1;

    /* JADX INFO: renamed from: Z2 */
    private boolean f169662Z2;

    /* JADX INFO: renamed from: a1 */
    private int f169663a1;

    /* JADX INFO: renamed from: a2 */
    private boolean f169664a2;

    /* JADX INFO: renamed from: a3 */
    private long f169665a3;

    /* JADX INFO: renamed from: b1 */
    private boolean f169666b1;

    /* JADX INFO: renamed from: b2 */
    private boolean f169667b2;

    /* JADX INFO: renamed from: b3 */
    private boolean f169668b3;

    /* JADX INFO: renamed from: c1 */
    private boolean f169669c1;

    /* JADX INFO: renamed from: c2 */
    private boolean f169670c2;

    /* JADX INFO: renamed from: c3 */
    private int f169671c3;

    /* JADX INFO: renamed from: d1 */
    private Object f169672d1;

    /* JADX INFO: renamed from: d2 */
    private boolean f169673d2;

    /* JADX INFO: renamed from: d3 */
    IMediaPlayerEventHandler f169674d3;

    /* JADX INFO: renamed from: e1 */
    private PipelineConcurrentHashMap f169675e1;

    /* JADX INFO: renamed from: e2 */
    private boolean f169676e2;

    /* JADX INFO: renamed from: e3 */
    private int f169677e3;

    /* JADX INFO: renamed from: f1 */
    private volatile boolean f169678f1;

    /* JADX INFO: renamed from: f2 */
    Timer f169679f2;

    /* JADX INFO: renamed from: f3 */
    private volatile boolean f169680f3;

    /* JADX INFO: renamed from: g1 */
    private String f169681g1;

    /* JADX INFO: renamed from: g2 */
    private boolean f169682g2;

    /* JADX INFO: renamed from: g3 */
    private boolean f169683g3;

    /* JADX INFO: renamed from: h1 */
    private String f169684h1;

    /* JADX INFO: renamed from: h2 */
    private String f169685h2;

    /* JADX INFO: renamed from: h3 */
    private MRtcPusherHandler f169686h3;

    /* JADX INFO: renamed from: i1 */
    public SurfaceTexture f169687i1;

    /* JADX INFO: renamed from: i2 */
    private String f169688i2;

    /* JADX INFO: renamed from: i3 */
    private String f169689i3;

    /* JADX INFO: renamed from: j1 */
    private CongressUtil f169690j1;

    /* JADX INFO: renamed from: j2 */
    private int f169691j2;

    /* JADX INFO: renamed from: j3 */
    private boolean f169692j3;

    /* JADX INFO: renamed from: k0 */
    private yw00 f169693k0;

    /* JADX INFO: renamed from: k1 */
    private pcmDataAvailableCallback f169694k1;

    /* JADX INFO: renamed from: k2 */
    private boolean f169695k2;

    /* JADX INFO: renamed from: l1 */
    private int f169696l1;

    /* JADX INFO: renamed from: l2 */
    private boolean f169697l2;

    /* JADX INFO: renamed from: m1 */
    private int f169698m1;

    /* JADX INFO: renamed from: m2 */
    private int f169699m2;

    /* JADX INFO: renamed from: n1 */
    private int f169700n1;

    /* JADX INFO: renamed from: n2 */
    private int f169701n2;

    /* JADX INFO: renamed from: o1 */
    private int f169702o1;

    /* JADX INFO: renamed from: o2 */
    private PipelineConcurrentHashMap f169703o2;

    /* JADX INFO: renamed from: p0 */
    private wb1 f169704p0;

    /* JADX INFO: renamed from: p1 */
    private String f169705p1;

    /* JADX INFO: renamed from: p2 */
    private ArrayList<String> f169706p2;

    /* JADX INFO: renamed from: q1 */
    private boolean f169707q1;

    /* JADX INFO: renamed from: q2 */
    private z1l0 f169708q2;

    /* JADX INFO: renamed from: r1 */
    private MRtcAudioHandler f169709r1;

    /* JADX INFO: renamed from: r2 */
    private a2l0 f169710r2;

    /* JADX INFO: renamed from: s1 */
    private MRtcAudioHandlerEx f169711s1;

    /* JADX INFO: renamed from: s2 */
    private cbl0 f169712s2;

    /* JADX INFO: renamed from: t1 */
    private MRtcEventHandler f169713t1;

    /* JADX INFO: renamed from: t2 */
    private b2l0 f169714t2;

    /* JADX INFO: renamed from: u1 */
    private MRtcChannelHandler f169715u1;

    /* JADX INFO: renamed from: u2 */
    private RemoteAudioPropertiesInfo[] f169716u2;

    /* JADX INFO: renamed from: v1 */
    private MRtcTokenWillExpireHander f169717v1;

    /* JADX INFO: renamed from: v2 */
    private RTCRoomStats f169718v2;

    /* JADX INFO: renamed from: w1 */
    private ymw f169719w1;

    /* JADX INFO: renamed from: w2 */
    private volatile int f169720w2;

    /* JADX INFO: renamed from: x1 */
    private MRtcQualityHandler f169721x1;

    /* JADX INFO: renamed from: x2 */
    private AudioProfileType f169722x2;

    /* JADX INFO: renamed from: y1 */
    private MRtcConnectHandler f169723y1;

    /* JADX INFO: renamed from: y2 */
    private AudioScenarioType f169724y2;

    /* JADX INFO: renamed from: z1 */
    private MRtcClientRoleChangedHandler f169725z1;

    /* JADX INFO: renamed from: z2 */
    Runnable f169726z2;

    /* JADX INFO: renamed from: l.tdp0$b */
    public class RunnableC20149b implements Runnable {
        public RunnableC20149b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            tdp0.this.mo19662f();
        }
    }

    /* JADX INFO: renamed from: l.tdp0$c */
    public static /* synthetic */ class C20150c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f169729a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f169730b;

        static {
            int[] iArr = new int[AudioProfileType.values().length];
            f169730b = iArr;
            try {
                iArr[AudioProfileType.AUDIO_PROFILE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f169730b[AudioProfileType.AUDIO_PROFILE_FLUENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f169730b[AudioProfileType.AUDIO_PROFILE_STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f169730b[AudioProfileType.AUDIO_PROFILE_HD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f169730b[AudioProfileType.AUDIO_PROFILE_STANDARD_STEREO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f169730b[AudioProfileType.AUDIO_PROFILE_HD_MONO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ForwardStreamStateInfo.ForwardStreamState.values().length];
            f169729a = iArr2;
            try {
                iArr2[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f169729a[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: l.tdp0$d */
    public class C20151d extends IRTCEngineEventHandlerEx {
        public C20151d() {
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandlerEx
        public void onLocalStreamStats(StreamIndex streamIndex, LocalStreamStats localStreamStats) {
            super.onLocalStreamStats(streamIndex, localStreamStats);
            if (streamIndex == StreamIndex.STREAM_INDEX_MAIN && localStreamStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203852g = ((MediaBaseCodecFilter) tdp0.this).f14281s.f182019H0 ? 2L : 0L;
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203796H = localStreamStats.videoStats.encodedFrameCount;
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203814Q = localStreamStats.videoStats.encoderOutputFrameRate;
            }
            tdp0.m188286o4(tdp0.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandlerEx
        public void onRemoteStreamStats(StreamKey streamKey, RemoteStreamStats remoteStreamStats) {
            ley leyVar;
            super.onRemoteStreamStats(streamKey, remoteStreamStats);
            if (streamKey.getStreamIndex() != StreamIndex.STREAM_INDEX_MAIN) {
                if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_3RD) {
                    tdp0.m188286o4(tdp0.this);
                    return;
                }
                return;
            }
            if (remoteStreamStats == null || (leyVar = (ley) tdp0.this.f169598H0.get(Long.valueOf(remoteStreamStats.uid))) == null) {
                return;
            }
            RemoteAudioStats remoteAudioStats = remoteStreamStats.audioStats;
            if (remoteAudioStats != null) {
                float f = remoteAudioStats.receivedKBitrate;
                leyVar.f127793a = (long) f;
                int i = leyVar.f127812t;
                int i2 = remoteAudioStats.concealmentEvent;
                leyVar.f127812t = i + i2;
                leyVar.f127813u += i2;
                float f2 = leyVar.f127818z;
                float f3 = remoteAudioStats.audioLossRate;
                leyVar.f127818z = (int) (f2 + (10.0f * f3));
                leyVar.f127782A = leyVar.f127782A;
                leyVar.f127803k = ((int) f3) * 100;
                leyVar.f127802j = (int) (((long) leyVar.f127802j) + remoteAudioStats.e2eDelay);
                leyVar.f127783B++;
                leyVar.f127798f += (long) ((((int) f) / 8) * 2000);
                leyVar.f127787F += remoteAudioStats.stallDuration;
            }
            RemoteVideoStats remoteVideoStats = remoteStreamStats.videoStats;
            if (remoteVideoStats != null) {
                leyVar.m149628k((int) remoteVideoStats.receivedKBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
                RemoteVideoStats remoteVideoStats2 = remoteStreamStats.videoStats;
                leyVar.f127805m = ((int) remoteVideoStats2.videoLossRate) * 100;
                leyVar.f127797e += (long) ((((int) remoteVideoStats2.receivedKBitrate) / 8) * 2000);
                leyVar.f127795c += (long) remoteVideoStats2.decoderOutputFrameRate;
                leyVar.f127784C++;
                leyVar.f127804l = (int) remoteVideoStats2.e2eDelay;
                leyVar.f127788G += remoteVideoStats2.stallDuration;
            }
        }
    }

    /* JADX INFO: renamed from: l.tdp0$e */
    public class C20152e extends IRTCEngineEventHandler {

        /* JADX INFO: renamed from: l.tdp0$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ long f169733a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ RemoteStreamKey f169734b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f169735c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f169736d;

            /* JADX INFO: renamed from: l.tdp0$e$a$a, reason: collision with other inner class name */
            public class SurfaceHolderCallbackC22730a implements SurfaceHolder.Callback {
                public SurfaceHolderCallbackC22730a() {
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("surfaceChanged", "uid:" + a.this.f169733a + "w:" + i2 + ",h:" + i3);
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("surfaceCreated", "uid:" + a.this.f169733a);
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("surfaceDestroyed", "uid:" + a.this.f169733a);
                }
            }

            public a(long j, RemoteStreamKey remoteStreamKey, int i, int i2) {
                this.f169733a = j;
                this.f169734b = remoteStreamKey;
                this.f169735c = i;
                this.f169736d = i2;
            }

            @Override // java.lang.Runnable
            @RequiresApi(api = 15)
            public void run() {
                RTCEngineEx rTCEngineEx;
                ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onFirstRemoteVideoFrameDecoded", "mIsAttachedMode:" + tdp0.this.f169590E1 + ",mVideoTextureListener is" + tdp0.this.f169712s2 + ",isUseTextureView" + tdp0.this.f169648W0.f182037Z0);
                if (tdp0.this.f169590E1 || tdp0.this.f169712s2 != null || tdp0.this.f169648W0.f182037Z0) {
                    if (tdp0.this.f169648W0.f182037Z0) {
                        ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("useTextureView", "width:" + tdp0.this.width + ",height:" + tdp0.this.height);
                        TextureView textureView = new TextureView(tdp0.this.m19726W1());
                        VideoCanvas videoCanvas = new VideoCanvas();
                        String userId = this.f169734b.getUserId();
                        videoCanvas.renderView = textureView;
                        videoCanvas.renderMode = 1;
                        RemoteStreamKey remoteStreamKey = new RemoteStreamKey(tdp0.this.f169648W0.f155325g1, userId, StreamIndex.STREAM_INDEX_MAIN);
                        if (tdp0.this.f169714t2 == null || (rTCEngineEx = tdp0.this.f169641U1) == null) {
                            return;
                        }
                        rTCEngineEx.setRemoteVideoCanvas(remoteStreamKey, videoCanvas);
                        tdp0.this.f169703o2.put(userId, textureView);
                        ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onVideoChannelAdded use textureView");
                        tdp0.this.f169714t2.mo19141a(Integer.valueOf(userId).intValue(), textureView, tdp0.this.width, tdp0.this.height);
                        return;
                    }
                    return;
                }
                SurfaceView surfaceView = new SurfaceView(tdp0.this.m19726W1());
                surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC22730a());
                VideoCanvas videoCanvas2 = new VideoCanvas();
                String userId2 = this.f169734b.getUserId();
                videoCanvas2.renderView = surfaceView;
                videoCanvas2.renderMode = 1;
                ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onFirstRemoteVideoFrameDecoded", "roomid:" + tdp0.this.f169648W0.f155325g1 + ",rtcEngine is" + tdp0.this.f169641U1);
                RemoteStreamKey remoteStreamKey2 = new RemoteStreamKey(tdp0.this.f169648W0.f155325g1, userId2, StreamIndex.STREAM_INDEX_MAIN);
                RTCEngineEx rTCEngineEx2 = tdp0.this.f169641U1;
                if (rTCEngineEx2 != null) {
                    rTCEngineEx2.setRemoteVideoCanvas(remoteStreamKey2, videoCanvas2);
                    tdp0.this.f169706p2.add(userId2);
                    if (tdp0.this.f169708q2 != null) {
                        tdp0.this.f169708q2.mo19137a(Integer.valueOf(userId2).intValue(), surfaceView, this.f169735c, this.f169736d);
                    }
                }
            }
        }

        public C20152e() {
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
            super.onAudioDeviceStateChanged(str, audioDeviceType, i, i2);
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onAudioDeviceStateChanged", "device_type:" + audioDeviceType + ",error:" + i2);
            AudioDeviceType audioDeviceType2 = AudioDeviceType.AUDIO_DEVICE_TYPE_UNKNOWN;
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onAudioMixingPlayingProgress(int i, long j) {
            super.onAudioMixingPlayingProgress(i, j);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004d A[PHI: r0
          0x004d: PHI (r0v3 int) = (r0v2 int), (r0v8 int), (r0v9 int), (r0v10 int), (r0v10 int), (r0v10 int), (r0v11 int), (r0v11 int) binds: [B:3:0x0029, B:5:0x002c, B:7:0x002f, B:24:0x0088, B:26:0x0090, B:27:0x0092, B:16:0x0042, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onConnectionStateChanged(int i, int i2) {
            super.onConnectionStateChanged(i, i2);
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onConnectionStateChanged", "state:" + i + ",reason:" + i2);
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
                                if (tdp0.this.f169591E2 != null) {
                                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onConnectionStateChanged", "CONNECTION_STATE_RECONNECTED");
                                    tdp0.this.f169591E2.removeCallbacks(tdp0.this.f169633S1);
                                    tdp0.this.f169588D2 = 0;
                                    tdp0.m188286o4(tdp0.this);
                                }
                                i = 6;
                            } else if (i == 7) {
                                if (tdp0.this.f169723y1 != null) {
                                    tdp0.this.f169723y1.onReconnectTimeout();
                                }
                            }
                        } else if (tdp0.this.f169591E2 != null && !tdp0.this.f169609K2) {
                            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onConnectionStateChanged", "CONNECTION_STATE_RECONNECTING");
                            tdp0.this.f169591E2.post(tdp0.this.f169633S1);
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
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("volc onConnectionStateChanged callback", "state:" + i + ",reason:" + i2);
            if (tdp0.this.f169623P1 != null) {
                tdp0.this.f169623P1.mo19156h(i, i2);
            }
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onError(int i) {
            super.onError(i);
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("RTCVideo onError", "err:" + i);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
            super.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
            super.onFirstRemoteAudioFrame(remoteStreamKey);
            Long lValueOf = Long.valueOf(remoteStreamKey.getUserId());
            long jLongValue = lValueOf.longValue();
            a9y a9yVar = (a9y) tdp0.this.f169601I0.get(lValueOf);
            if (a9yVar == null || a9yVar.m95472e()) {
                return;
            }
            a9yVar.m95475h(true);
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131779b(a9yVar.m95470c(), jLongValue, tdp0.this.f169582A2, a9yVar.m95468a(), System.currentTimeMillis() - a9yVar.m95469b());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            super.onFirstRemoteVideoFrameDecoded(remoteStreamKey, videoFrameInfo);
            if (tdp0.this.m19726W1() == null) {
                ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onFirstRemoteVideoFrameDecoded", "context is null");
                return;
            }
            int width = videoFrameInfo.getWidth();
            int height = videoFrameInfo.getHeight();
            Long lValueOf = Long.valueOf(remoteStreamKey.getUserId());
            long jLongValue = lValueOf.longValue();
            a9y a9yVar = (a9y) tdp0.this.f169601I0.get(lValueOf);
            if (a9yVar != null && !a9yVar.m95471d()) {
                n8c.m158483a("zhengjijian", "agora get first idr");
                a9yVar.m95474g(true);
                ((MediaBaseCodecFilter) tdp0.this).f14269I.m131780c(true, a9yVar.m95470c(), jLongValue, tdp0.this.f169582A2, a9yVar.m95468a(), System.currentTimeMillis() - a9yVar.m95469b());
                tdp0.this.f169622P0.mo128349g(8198, (int) jLongValue, 0, tdp0.this);
            }
            if (tdp0.this.f169713t1 != null) {
                tdp0.this.f169713t1.onFirstRemoteVideoDecoded(jLongValue, width, height, 0);
                jLongValue = jLongValue;
            }
            tdp0.this.f169591E2.postAtFrontOfQueue(new a(jLongValue, remoteStreamKey, width, height));
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            super.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
            super.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
            int length = (tdp0.this.f169716u2 == null || tdp0.this.f169716u2.length == 0) ? 1 : tdp0.this.f169716u2.length + 1;
            AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[length];
            int i = 0;
            audioVolumeWeightArr[0] = new AudioVolumeWeight();
            if (tdp0.this.f169697l2) {
                audioVolumeWeightArr[0].volume = 0.0f;
            } else {
                audioVolumeWeightArr[0].volume = (localAudioPropertiesInfoArr[0].audioPropertiesInfo.linearVolume * 1.0f) / 100.0f;
            }
            audioVolumeWeightArr[0].uid = tdp0.this.f169648W0.f182013B0;
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
                audioVolumeWeight2.uid = Integer.valueOf(tdp0.this.f169716u2[i].streamKey.getUserId()).intValue();
                audioVolumeWeight2.volume = (tdp0.this.f169716u2[i].audioPropertiesInfo.linearVolume * 1.0f) / 100.0f;
                audioVolumeWeight2.voicePitch = tdp0.this.f169716u2[i].audioPropertiesInfo.voicePitch;
                i++;
                audioVolumeWeightArr[i] = audioVolumeWeight2;
            }
            if (tdp0.this.f169709r1 != null) {
                tdp0.this.f169709r1.onAudioVolumeIndication(audioVolumeWeightArr, 100);
            }
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
            super.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
            super.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
            super.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLogReport(String str, JSONObject jSONObject) {
            super.onLogReport(str, jSONObject);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLoginResult(String str, int i, int i2) {
            super.onLoginResult(str, i, i2);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLogout(int i) {
            super.onLogout(i);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onMixedStreamEvent(MixedStreamTaskInfo mixedStreamTaskInfo, MixedStreamTaskEvent mixedStreamTaskEvent, MixedStreamTaskErrorCode mixedStreamTaskErrorCode) {
            super.onMixedStreamEvent(mixedStreamTaskInfo, mixedStreamTaskEvent, mixedStreamTaskErrorCode);
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onMixedStreamEvent", "event:" + mixedStreamTaskEvent.value() + ",error:" + mixedStreamTaskErrorCode.value());
            if (mixedStreamTaskEvent == MixedStreamTaskEvent.START_SUCCESS) {
                tdp0.this.f169670c2 = true;
                tdp0 tdp0Var = tdp0.this;
                MixedStreamConfig mixedStreamConfig = tdp0Var.f169657Y1;
                MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = mixedStreamConfig.regions;
                int length = mixedStreamLayoutRegionConfigArr != null ? mixedStreamLayoutRegionConfigArr.length : 0;
                if (mixedStreamConfig != null && length > 0) {
                    RTCEngineEx rTCEngineEx = tdp0Var.f169641U1;
                    String str = tdp0Var.f169612L2;
                    tdp0 tdp0Var2 = tdp0.this;
                    rTCEngineEx.updatePushMixedStream(str, tdp0Var2.f169661Z1, tdp0Var2.f169657Y1);
                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onMixedStreamEvent", "rtmpState updateRtmpTranscoding regilen " + length);
                }
                if (!tdp0.this.f169662Z2) {
                    tdp0.this.f169662Z2 = true;
                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("notifyPublished", "onStreamMixingEvent  notifyPublished");
                    tdp0.this.f169622P0.mo128349g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, tdp0.this);
                }
            } else if (mixedStreamTaskEvent == MixedStreamTaskEvent.START_FAILED && tdp0.this.f169623P1 != null) {
                tdp0.this.f169623P1.mo19163p("", mixedStreamTaskErrorCode.value());
            }
            if (tdp0.this.f169623P1 != null) {
                tdp0.this.f169623P1.mo19164q("", mixedStreamTaskEvent.value(), mixedStreamTaskErrorCode.value(), "volc", tdp0.this.f169648W0.f155325g1, tdp0.this.f169648W0.f182013B0);
            }
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onNetworkTimeSynchronized() {
            super.onNetworkTimeSynchronized();
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
            super.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
            if (tdp0.this.f169649W1 == 1) {
                tdp0.this.f169716u2 = remoteAudioPropertiesInfoArr;
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
            if (tdp0.this.f169709r1 != null) {
                tdp0.this.f169709r1.onAudioVolumeIndication(audioVolumeWeightArr, 100);
            }
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
            super.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            super.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
            super.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
            super.onSEIMessageReceived(remoteStreamKey, byteBuffer);
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.get(bArr);
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                if (jSONObject.has("bType")) {
                    int iOptInt = jSONObject.optInt("bType");
                    ((MediaBaseCodecFilter) tdp0.this).f14268H.f203888s = iOptInt;
                    tdp0.m188286o4(tdp0.this);
                    hjx.m131421d("Pipeline_Normal_pip->PIPLINE->VOLC", "onReceiveSEI getbType: " + iOptInt);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
            super.onSEIStreamUpdate(remoteStreamKey, sEIStreamUpdateEvent);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, StreamSyncInfoConfig.SyncInfoStreamType syncInfoStreamType, ByteBuffer byteBuffer) {
            super.onStreamSyncInfoReceived(remoteStreamKey, syncInfoStreamType, byteBuffer);
            tdp0.m188286o4(tdp0.this);
        }
    }

    /* JADX INFO: renamed from: l.tdp0$f */
    public class C20153f extends IRTCRoomEventHandlerEx {
        public C20153f() {
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandlerEx
        public void onUserPublishStream(RemoteStreamKey remoteStreamKey, boolean z, MediaStreamType mediaStreamType) {
            super.onUserPublishStream(remoteStreamKey, z, mediaStreamType);
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onUserPublishStream", "uid:" + remoteStreamKey.userId + ",type:" + mediaStreamType);
            int iIntValue = Integer.valueOf(remoteStreamKey.userId).intValue();
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
                tdp0.this.m188270j7(iIntValue, false);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO) {
                tdp0.this.m188221V7(iIntValue, false);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH) {
                tdp0.this.m188270j7(iIntValue, false);
                tdp0.this.m188221V7(iIntValue, false);
            }
            tdp0.m188286o4(tdp0.this);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandlerEx
        public void onUserUnpublishStream(RemoteStreamKey remoteStreamKey, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
            super.onUserUnpublishStream(remoteStreamKey, mediaStreamType, streamRemoveReason);
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onUserUnpublishStream", "uid:" + remoteStreamKey.userId + ",type:" + mediaStreamType + ", reason:" + streamRemoveReason.toString());
            int iIntValue = Integer.valueOf(remoteStreamKey.userId).intValue();
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
                tdp0.this.m188270j7(iIntValue, true);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO) {
                tdp0.this.m188221V7(iIntValue, true);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH) {
                tdp0.this.m188221V7(iIntValue, true);
                tdp0.this.m188270j7(iIntValue, true);
            }
            tdp0.m188286o4(tdp0.this);
        }
    }

    /* JADX INFO: renamed from: l.tdp0$g */
    public class C20154g extends zac0 {

        /* JADX INFO: renamed from: l.tdp0$g$a */
        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                boolean z = tdp0.this.f169692j3;
                C20154g c20154g = C20154g.this;
                if (z) {
                    if (TextUtils.isEmpty(tdp0.this.f169689i3)) {
                        return;
                    }
                    tdp0 tdp0Var = tdp0.this;
                    tdp0Var.mo19743k2(tdp0Var.f169689i3);
                    return;
                }
                if (TextUtils.isEmpty(tdp0.this.f169681g1)) {
                    return;
                }
                tdp0 tdp0Var2 = tdp0.this;
                tdp0Var2.mo19743k2(tdp0Var2.f169681g1);
            }
        }

        /* JADX INFO: renamed from: l.tdp0$g$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ long f169742a;

            public b(long j) {
                this.f169742a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (tdp0.this.f169708q2 != null) {
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + "----onVideoChannelAdded Audio: userID=" + this.f169742a);
                    tdp0.this.f169708q2.mo19137a((long) ((int) this.f169742a), null, 176, 176);
                }
            }
        }

        public C20154g() {
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onAudioSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
            super.onAudioSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onForwardStreamEvent", "eventInfos:" + forwardStreamEventInfoArr[0].event);
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onForwardStreamStateChanged", "stateInfo:" + forwardStreamStateInfoArr[0].state);
            if (forwardStreamStateInfoArr.length == 0) {
                return;
            }
            int i = C20150c.f169729a[forwardStreamStateInfoArr[0].state.ordinal()];
            if (i == 1) {
                if (tdp0.this.f169623P1 != null) {
                    tdp0.this.f169623P1.mo19154f(0L, 1, "connect_success");
                }
            } else {
                if (i != 2) {
                    return;
                }
                if (tdp0.this.f169623P1 != null) {
                    tdp0.this.f169623P1.mo19154f(0L, 3, "connect_failed,code:" + forwardStreamStateInfoArr[0].error.value());
                }
                eyx.m118802c().m118806e("ConnectOtherRoom", "volc", forwardStreamStateInfoArr[0].error.value(), "strartForwardStreamToRoom failed", LogLevel.FATAL.value());
                tdp0.this.f169594F2 = false;
            }
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("volc onLeaveRoom");
            if (rTCRoomStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203784B = rTCRoomStats.txBytes;
            }
            if (tdp0.this.f169620O1 != null) {
                tdp0.this.f169620O1.onExitRoom();
            }
            if (tdp0.this.f169601I0 == null || tdp0.this.f169601I0.isEmpty()) {
                return;
            }
            Log.e("lqdebug", "onLeaveRoom");
            n8c.m158483a("lqdebug", "stopRecord memberInfoMap " + tdp0.this.f169601I0.size());
            tdp0.this.f169601I0.clear();
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onLocalStreamStats(LocalStreamStats localStreamStats) {
            if (localStreamStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203852g = ((MediaBaseCodecFilter) tdp0.this).f14281s.f182019H0 ? 2L : 0L;
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203796H = localStreamStats.videoStats.encodedFrameCount;
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203814Q = localStreamStats.videoStats.encoderOutputFrameRate;
            }
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
            super.onNetworkQuality(networkQualityStats, networkQualityStatsArr);
            if (networkQualityStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203883q0 = networkQualityStats.txQuality;
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203886r0 = networkQualityStats.rxQuality;
            }
            try {
                if (tdp0.this.f169623P1 == null || networkQualityStats == null) {
                    return;
                }
                tdp0.this.f169623P1.mo19159l(Integer.parseInt(networkQualityStats.uid), networkQualityStats.txQuality, networkQualityStats.rxQuality);
            } catch (Exception unused) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
            ley leyVar;
            if (remoteStreamStats == null || (leyVar = (ley) tdp0.this.f169598H0.get(Long.valueOf(remoteStreamStats.uid))) == null) {
                return;
            }
            RemoteAudioStats remoteAudioStats = remoteStreamStats.audioStats;
            if (remoteAudioStats != null) {
                float f = remoteAudioStats.receivedKBitrate;
                leyVar.f127793a = (long) f;
                int i = leyVar.f127812t;
                int i2 = remoteAudioStats.concealmentEvent;
                leyVar.f127812t = i + i2;
                leyVar.f127813u += i2;
                float f2 = leyVar.f127818z;
                float f3 = remoteAudioStats.audioLossRate;
                leyVar.f127818z = (int) (f2 + (10.0f * f3));
                leyVar.f127782A = leyVar.f127782A;
                leyVar.f127803k = ((int) f3) * 100;
                leyVar.f127802j = (int) (((long) leyVar.f127802j) + remoteAudioStats.e2eDelay);
                leyVar.f127783B++;
                leyVar.f127798f += (long) ((((int) f) / 8) * 2000);
                leyVar.f127787F += remoteAudioStats.stallDuration;
            }
            RemoteVideoStats remoteVideoStats = remoteStreamStats.videoStats;
            if (remoteVideoStats != null) {
                leyVar.m149628k((int) remoteVideoStats.receivedKBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
                RemoteVideoStats remoteVideoStats2 = remoteStreamStats.videoStats;
                leyVar.f127805m = ((int) remoteVideoStats2.videoLossRate) * 100;
                leyVar.f127797e += (long) ((((int) remoteVideoStats2.receivedKBitrate) / 8) * 2000);
                leyVar.f127795c += (long) remoteVideoStats2.decoderOutputFrameRate;
                leyVar.f127784C++;
                leyVar.f127804l = (int) remoteVideoStats2.e2eDelay;
                leyVar.f127788G += remoteVideoStats2.stallDuration;
            }
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
            super.onRoomBinaryMessageReceived(str, byteBuffer);
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomMessageReceived(String str, String str2) {
            super.onRoomMessageReceived(str, str2);
            if (tdp0.this.f169715u1 != null) {
                tdp0.this.f169715u1.onStreamMessage(Integer.valueOf(str).intValue(), 0, str2.getBytes());
            }
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomMessageSendResult(long j, int i) {
            super.onRoomMessageSendResult(j, i);
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomStateChanged(String str, String str2, int i, String str3) {
            int i2;
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onRoomStateChanged", "roomId:" + str + ",enterRoomState:" + i + ", host：" + tdp0.this.f169648W0.f155326h1);
            tdp0 tdp0Var = tdp0.this;
            if (i != 0) {
                ((MediaBaseCodecFilter) tdp0Var).f14269I.m131787l("onRoomStateChanged", "进房失败:roomState:" + i);
                if (tdp0.this.f169622P0 != null) {
                    if (i != -1084 && i != -1010 && i != -1009 && i != -1007) {
                        if (i == -1006) {
                            ((MediaBaseCodecFilter) tdp0.this).f14268H.f203901y0 = 814L;
                            ((MediaBaseCodecFilter) tdp0.this).f14268H.f203865k0 = i;
                            if (tdp0.this.f169623P1 != null) {
                                tdp0.this.f169623P1.mo19155g(i);
                                return;
                            }
                            return;
                        }
                        if (i != -1001 && i != -1000) {
                            return;
                        }
                    }
                    int iM200927a = w1f.m200927a(i);
                    ((MediaBaseCodecFilter) tdp0.this).f14268H.f203901y0 = iM200927a;
                    ((MediaBaseCodecFilter) tdp0.this).f14268H.f203865k0 = i;
                    tdp0.this.f169622P0.mo128349g(4352, iM200927a, 0, tdp0.this);
                    return;
                }
                return;
            }
            ((MediaBaseCodecFilter) tdp0Var).f14270J = MomoCodec.MomoCodecState.START;
            ((MediaBaseCodecFilter) tdp0.this).f14268H.f203837b = true;
            if (tdp0.this.f169648W0.f155326h1) {
                int i3 = tdp0.this.f169702o1;
                tdp0 tdp0Var2 = tdp0.this;
                if (i3 > 0) {
                    i2 = tdp0Var2.f169702o1;
                } else {
                    i2 = tdp0Var2.f169648W0.f182030S0 != 0 ? tdp0.this.f169648W0.f182030S0 : 15;
                }
                int i4 = i2;
                tdp0 tdp0Var3 = tdp0.this;
                tdp0Var3.m188243b6(tdp0Var3.f169648W0.f155326h1, tdp0.this.f169648W0.f177148k, tdp0.this.f169648W0.f177150l, tdp0.this.f169700n1, i4, tdp0.this.f169648W0.f182043v0, str2);
                if (tdp0.this.f169648W0.f155326h1 && !tdp0.this.f169664a2 && !TextUtils.isEmpty(tdp0.this.f169648W0.f182043v0)) {
                    tdp0 tdp0Var4 = tdp0.this;
                    tdp0Var4.m188175H7(tdp0Var4.f169648W0.f182043v0);
                }
                tdp0 tdp0Var5 = tdp0.this;
                if (tdp0Var5.f169679f2 == null) {
                    tdp0Var5.f169679f2 = new Timer();
                    tdp0.this.f169679f2.schedule(new a(), 100L, 1000L);
                }
            }
            if ((tdp0.this.f169669c1 || tdp0.this.f169666b1) && tdp0.this.f169696l1 != 0) {
                tdp0.this.m188191M6();
            }
            if (tdp0.this.f169682g2) {
                tdp0 tdp0Var6 = tdp0.this;
                tdp0Var6.m188266i8(tdp0Var6.f169688i2, tdp0.this.f169685h2);
                tdp0.this.f169682g2 = false;
            }
            try {
                if (new JSONObject(str3).getInt("join_type") == 0) {
                    if (tdp0.this.f169713t1 != null) {
                        tdp0.this.f169713t1.onJoinChannelSuccess(str, tdp0.this.f169648W0.f182013B0, 0);
                    }
                    tdp0.this.f169586C2 = System.currentTimeMillis();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            tdp0.this.f169653X1 = true;
            tdp0.this.f169622P0.mo128349g(8192, 0, 0, tdp0.this);
            tdp0.this.mo19732c2();
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomStats(RTCRoomStats rTCRoomStats) {
            super.onRoomStats(rTCRoomStats);
            tdp0.this.f169718v2 = rTCRoomStats;
            if (rTCRoomStats != null) {
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203784B += tdp0.this.f169718v2.txBytes;
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203810O = tdp0.this.f169718v2.txAudioKBitRate;
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203861j += tdp0.this.f169718v2.rxBytes;
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203864k += (long) ((tdp0.this.f169718v2.rxVideoKBitRate * 2000) / 8);
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203867l += (long) ((tdp0.this.f169718v2.rxAudioKBitRate * 2000) / 8);
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203801J0 += (long) ((tdp0.this.f169718v2.txVideoKBitRate * 2000) / 8);
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203799I0 += (long) ((tdp0.this.f169718v2.txAudioKBitRate * 2000) / 8);
                tdp0.this.f169589E0 += (long) ((tdp0.this.f169718v2.txVideoKBitRate * 2000) / 8);
                tdp0.this.f169595G0 += (long) ((tdp0.this.f169718v2.txAudioKBitRate * 2000) / 8);
                tdp0.this.f169592F0 += (tdp0.this.f169718v2.rxVideoKBitRate * 2000) / 8;
            }
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onSubtitleMessageReceived(SubtitleMessage[] subtitleMessageArr) {
            super.onSubtitleMessageReceived(subtitleMessageArr);
            if (tdp0.this.f169615M2 == null) {
                return;
            }
            if (subtitleMessageArr == null) {
                tdp0.this.f169615M2.mo19168b(null);
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
                    jkw jkwVar = tdp0.this.f169618N2;
                    tdp0 tdp0Var = tdp0.this;
                    if (jkwVar == null) {
                        tdp0Var.f169618N2 = new jkw(str, str2, str3, mMLiveSubtitleModeFromId, i, z);
                    } else {
                        tdp0Var.f169618N2.f118418a = str;
                        tdp0.this.f169618N2.f118419b = str2;
                        tdp0.this.f169618N2.f118420c = str3;
                        tdp0.this.f169618N2.f118421d = mMLiveSubtitleModeFromId;
                        tdp0.this.f169618N2.f118422e = i;
                        tdp0.this.f169618N2.f118423f = z;
                    }
                    tdp0.this.f169615M2.mo19168b(tdp0.this.f169618N2);
                }
            }
        }

        @Override // com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onSubtitleStateChanged(SubtitleState subtitleState, SubtitleErrorCode subtitleErrorCode, String str) {
            super.onSubtitleStateChanged(subtitleState, subtitleErrorCode, str);
            eyx.m118802c().m118808g("onSubtitleStateChanged state：" + subtitleState + " error code：" + subtitleErrorCode + " error message：" + str);
            if (subtitleState == SubtitleState.SUBTITLE_STATE_STARTED) {
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203881p1 = 1;
            } else if (subtitleState == SubtitleState.SUBTITLE_STATE_STOPED) {
                ((MediaBaseCodecFilter) tdp0.this).f14268H.f203881p1 = 0;
            }
            if (tdp0.this.f169615M2 != null) {
                tdp0.this.f169615M2.mo19167a(MMLiveSubtitleState.fromId(subtitleState.value()), MMLiveSubtitleErrorCode.fromId(subtitleErrorCode.value()), str);
            }
            if (subtitleState == SubtitleState.SUBTITLE_STATE_ERROR) {
                eyx.m118802c().m118810i("volc", subtitleErrorCode.value(), str);
            }
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onTokenWillExpire() {
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onTokenWillExpire");
            if (tdp0.this.f169717v1 != null) {
                tdp0.this.f169717v1.onTokenPrivilegeWillExpire("");
            }
            if (tdp0.this.f169715u1 != null) {
                tdp0.this.f169715u1.onRequestChannelKey();
            }
        }

        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserJoined(UserInfo userInfo) {
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onUserJoined", "uid:" + userInfo.getUid());
            Long lValueOf = Long.valueOf(userInfo.getUid());
            long jLongValue = lValueOf.longValue();
            a9y a9yVar = new a9y(Long.valueOf(userInfo.getUid()).longValue(), j6f.LATITUDE_SOUTH.equals(tdp0.this.mo20052w1()) ? 1 : 2);
            tdp0.this.f169601I0.put(lValueOf, a9yVar);
            if (tdp0.this.f169586C2 != -1) {
                a9yVar.m95477j(System.currentTimeMillis());
                a9yVar.m95476i(System.currentTimeMillis() - tdp0.this.f169586C2);
            }
            if (((MediaBaseCodecFilter) tdp0.this).f14268H.f203842c1 == 1) {
                ((MediaBaseCodecFilter) tdp0.this).f14269I.m131782e(true, a9yVar.m95470c(), jLongValue, tdp0.this.f169582A2, a9yVar.m95468a());
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + " onUserJoined:uid:" + jLongValue);
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onUserJoined", "isAudioOnly:" + tdp0.this.f169669c1 + ",mIsAgnoreSET:" + tdp0.this.f169666b1);
            if ((tdp0.this.f169669c1 || tdp0.this.f169666b1) && tdp0.this.f169648W0.f155327i1 != jLongValue) {
                a9yVar.m95473f(true);
                a9yVar.m95474g(true);
                ((MediaBaseCodecFilter) tdp0.this).f14269I.m131780c(true, a9yVar.m95470c(), jLongValue, tdp0.this.f169582A2, a9yVar.m95468a(), -1L);
                tdp0.this.f169622P0.mo128349g(8198, (int) jLongValue, 0, tdp0.this);
                tdp0.this.f169591E2.post(new b(jLongValue));
            }
            tdp0.this.f169598H0.put(lValueOf, new ley(jLongValue));
            if (tdp0.this.f169713t1 != null) {
                tdp0.this.f169713t1.onJoinChannelSuccess("", jLongValue, 0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserLeave(String str, int i) {
            int i2 = i;
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onUserOffline uid:" + str + ",reason:" + i2);
            StringBuilder sb = new StringBuilder("onUserLeave,userid:");
            sb.append(str);
            Log.e("lqdebug", sb.toString());
            Long lValueOf = Long.valueOf(str);
            long jLongValue = lValueOf.longValue();
            long j = 0;
            if (tdp0.this.f169598H0 != null && tdp0.this.f169598H0.containsKey(lValueOf)) {
                ley leyVar = (ley) tdp0.this.f169598H0.get(lValueOf);
                j = leyVar != null ? leyVar.f127796d : 0L;
                tdp0.this.f169598H0.remove(lValueOf);
            }
            if (tdp0.this.f169601I0 != null && tdp0.this.f169601I0.containsKey(lValueOf)) {
                n8c.m158483a("zhengjijian", "onMemberExit userid " + jLongValue + " reason " + i2);
                StringBuilder sb2 = new StringBuilder("onUserLeave,userid:");
                sb2.append(str);
                Log.e("lqdebug", sb2.toString());
                if (((MediaBaseCodecFilter) tdp0.this).f14268H.f203842c1 == 1) {
                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131781d(true, ((a9y) tdp0.this.f169601I0.get(lValueOf)).m95470c(), jLongValue, i2);
                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131783f(true, ((a9y) tdp0.this.f169601I0.get(lValueOf)).m95470c(), j, 0L, jLongValue, i);
                    jLongValue = jLongValue;
                    i2 = i;
                }
                tdp0.this.f169622P0.mo128349g(8199, (int) jLongValue, 0, tdp0.this);
            }
            if (tdp0.this.f169708q2 != null && (!tdp0.this.f169590E1 || tdp0.this.f169669c1 || tdp0.this.f169666b1)) {
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + "----onVideoChannelRemove userID=" + jLongValue);
                tdp0.this.f169708q2.mo19138b(jLongValue, i2);
                tdp0 tdp0Var = tdp0.this;
                if (tdp0Var.f169641U1 != null && tdp0Var.f169706p2.contains(str)) {
                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("setRemoteVideoCanvas 0531");
                    tdp0.this.f169641U1.setRemoteVideoCanvas(new RemoteStreamKey(tdp0.this.f169648W0.f155325g1, str, StreamIndex.STREAM_INDEX_MAIN), null);
                    tdp0.this.f169706p2.remove(lValueOf);
                }
                ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onVideoChannelRemove uid:" + jLongValue + ",reason:" + i2);
            }
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("isUseTextureView", Boolean.valueOf(tdp0.this.f169648W0.f182037Z0));
            if (tdp0.this.f169648W0.f182037Z0) {
                tdp0 tdp0Var2 = tdp0.this;
                if (tdp0Var2.f169641U1 != null && tdp0Var2.f169703o2 != null && tdp0.this.f169703o2.containsKey(str)) {
                    ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("setupRemoteVideoview null");
                    tdp0.this.f169703o2.remove(str);
                    if (tdp0.this.f169714t2 != null) {
                        tdp0.this.f169714t2.mo19142b(jLongValue, i2);
                    }
                }
            }
            if (tdp0.this.f169713t1 != null) {
                tdp0.this.f169713t1.onUserOffline(jLongValue, i2);
            }
            if (tdp0.this.f169675e1 != null) {
                if (tdp0.this.f169675e1.containsKey(lValueOf) || jLongValue == tdp0.this.f169648W0.f182013B0) {
                    if (jLongValue != tdp0.this.f169648W0.f182013B0) {
                        tdp0.this.f169675e1.remove(lValueOf);
                    }
                    boolean z = tdp0.this.f169590E1;
                    tdp0 tdp0Var3 = tdp0.this;
                    if (!z) {
                        if (tdp0Var3.f169712s2 != null) {
                            tdp0.this.f169712s2.mo19144b(jLongValue, i2);
                        }
                    } else if (tdp0Var3.f169710r2 != null) {
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + "----onVideoChannelRemoveExt userID=" + jLongValue);
                        tdp0.this.f169710r2.mo94621b(jLongValue, i2);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserPublishStreamAudio(String str, String str2, boolean z) {
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onUserPublishStreamAudio", "uid:" + str2 + ",isPublish:" + z);
            ley leyVar = (ley) tdp0.this.f169598H0.get(Long.valueOf(str2));
            if (leyVar != null) {
                leyVar.m149624g(!z);
            }
            if (tdp0.this.f169713t1 != null) {
                tdp0.this.f169713t1.onUserMuteAudio(Integer.valueOf(str2).intValue(), !z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.zac0, com.p069ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserPublishStreamVideo(String str, String str2, boolean z) {
            super.onUserPublishStreamVideo(str, str2, z);
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onUserPublishStreamVideo", "uid:" + str2 + ",isPublish:" + z);
            ley leyVar = (ley) tdp0.this.f169598H0.get(Long.valueOf(str2));
            if (leyVar != null) {
                leyVar.m149625h(!z);
            }
            if (tdp0.this.f169713t1 != null) {
                tdp0.this.f169713t1.onUserMuteVideo(Integer.valueOf(str2).intValue(), !z);
            }
        }
    }

    /* JADX INFO: renamed from: l.tdp0$i */
    public class C20156i implements IAudioFrameProcessor {
        public C20156i() {
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessEarMonitorAudioFrame(IAudioFrame iAudioFrame) {
            return 0;
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessPlayBackAudioFrame(IAudioFrame iAudioFrame) {
            return 0;
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessRecordAudioFrame(IAudioFrame iAudioFrame) {
            mpd0 mpd0VarMo18364C;
            ByteBuffer byteBuffer;
            int iValue = iAudioFrame.channel().value();
            int iData_size = iAudioFrame.data_size();
            int iValue2 = iAudioFrame.sample_rate().value();
            int unused = tdp0.this.f169691j2;
            tdp0.m188257g3(tdp0.this);
            int iData_size2 = iAudioFrame.data_size();
            byte[] bArrM152744o2 = new byte[iData_size2];
            if (!tdp0.this.f169599H1) {
                iAudioFrame.getDataBuffer().get(bArrM152744o2, 0, iData_size2);
            }
            if (tdp0.this.f169694k1 != null) {
                tdp0.this.f169694k1.onPcmDateCallback(tdp0.this.f169648W0.f182013B0, bArrM152744o2, 44100, iValue != 1);
            }
            mpd0 mpd0Var = null;
            if (((MediaBaseCodecFilter) tdp0.this).f14271K != null) {
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).f14271K).mo20101W1(tdp0.this.f169628R0);
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).f14271K).m20087I2(iData_size, tdp0.this.f169648W0.f177117P, iValue, "Volc");
                mpd0VarMo18364C = ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).f14271K).mo18364C(new mpd0(bArrM152744o2, tdp0.this.f169632S0, iValue));
                if (mpd0VarMo18364C != null && (byteBuffer = mpd0VarMo18364C.f135036b) != null) {
                    byteBuffer.get(bArrM152744o2, 0, iData_size2);
                    iAudioFrame.getDataBuffer().rewind();
                    iAudioFrame.getDataBuffer().put(bArrM152744o2);
                    iAudioFrame.getDataBuffer().rewind();
                }
            } else {
                mpd0VarMo18364C = null;
            }
            if (tdp0.this.f169623P1 != null) {
                tdp0.this.f169623P1.mo19162o(bArrM152744o2, iValue2, iValue);
            }
            if (tdp0.this.f169613M0 != null && tdp0.this.f169619O0) {
                if (((MediaBaseCodecFilter) tdp0.this).f14271K != null) {
                    if (tdp0.this.f169704p0 != null) {
                        tdp0.this.f169704p0.m202494j(1.0f);
                        if (tdp0.this.f169648W0.f182035X0) {
                            tdp0.this.f169704p0.m202495k(1.0f);
                        }
                        mpd0Var = tdp0.this.f169704p0.m202491g();
                    }
                    if (mpd0Var != null) {
                        tdp0 tdp0Var = tdp0.this;
                        ByteBuffer byteBufferM202492h = mpd0VarMo18364C != null ? tdp0Var.f169704p0.m202492h(mpd0VarMo18364C.m155800c(), mpd0Var.m155800c(), mpd0Var.m155802e()) : tdp0Var.f169704p0.m202492h(bArrM152744o2, mpd0Var.m155800c(), mpd0Var.m155802e());
                        if (byteBufferM202492h != null) {
                            mpd0Var = new mpd0(byteBufferM202492h.array(), mpd0Var.m155801d(), iValue);
                        }
                    }
                }
                if (mpd0Var != null) {
                    mpd0 mpd0Var2 = new mpd0(iValue == 1 ? m300.m152744o2(mpd0Var.m155800c(), mpd0Var.m155802e()) : mpd0Var.m155800c(), tdp0.this.f169632S0, 2);
                    mpd0Var2.m155804g(false);
                    if (tdp0.this.f169613M0 != null) {
                        tdp0.this.f169613M0.mo128315C(mpd0Var2);
                        if (tdp0.m188305t3(tdp0.this) % 50 == 0) {
                            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                        }
                    }
                } else if (tdp0.this.f169649W1 != 2) {
                    if (iValue == 1) {
                        bArrM152744o2 = m300.m152744o2(bArrM152744o2, iData_size2);
                    }
                    mpd0 mpd0Var3 = new mpd0(bArrM152744o2, tdp0.this.f169632S0, 2);
                    mpd0Var3.m155804g(false);
                    if (tdp0.this.f169613M0 != null) {
                        tdp0.this.f169613M0.mo128315C(mpd0Var3);
                        if (tdp0.m188305t3(tdp0.this) % 50 == 0) {
                            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                        }
                    }
                }
            }
            return 0;
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame) {
            return 0;
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessScreenAudioFrame(IAudioFrame iAudioFrame) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: l.tdp0$k */
    public class RunnableC20158k implements Runnable {
        public RunnableC20158k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("configConnectLost", "errorcode 10");
            if (tdp0.this.f169622P0 != null) {
                tdp0.this.f169622P0.mo128349g(4353, 10, 0, tdp0.this);
            }
            if (tdp0.this.f169713t1 != null) {
                tdp0.this.f169713t1.onConnectionLost();
            }
            tdp0.this.f169588D2 = 1;
            tdp0.m188286o4(tdp0.this);
            ((MediaBaseCodecFilter) tdp0.this).f14268H.f203901y0 = 812L;
            ((MediaBaseCodecFilter) tdp0.this).f14268H.f203865k0 = Constants.RHYTHM_PLAYER_STATE_DECODING;
            tdp0.this.m19736e2(4353, 10);
            if (((MediaBaseCodecFilter) tdp0.this).f14269I != null) {
                ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onConnectionLost");
            }
            tdp0.this.mo19662f();
        }
    }

    public tdp0(Context context, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar, String str) {
        super(context);
        this.f169631S = "Pipeline_Normal_pip->PIPLINE->VOLC";
        this.f169635T = true;
        this.f169639U = -1;
        this.f169647W = false;
        this.f169651X = false;
        this.f169655Y = true;
        this.f169659Z = null;
        this.f169589E0 = 0L;
        this.f169592F0 = 0;
        this.f169595G0 = 0L;
        this.f169598H0 = new PipelineConcurrentHashMap<>();
        this.f169601I0 = new PipelineConcurrentHashMap<>();
        this.f169604J0 = 0;
        this.f169607K0 = 0;
        this.f169610L0 = null;
        this.f169616N0 = false;
        this.f169619O0 = false;
        this.f169625Q0 = 1.0f;
        this.f169628R0 = 1.0f;
        this.f169632S0 = 44100;
        this.f169636T0 = 0;
        this.f169640U0 = 0;
        this.f169644V0 = 0;
        this.f169652X0 = -1;
        this.f169656Y0 = null;
        this.f169660Z0 = new Object();
        this.f169663a1 = 0;
        this.f169666b1 = false;
        this.f169669c1 = false;
        this.f169672d1 = new Object();
        this.f169675e1 = new PipelineConcurrentHashMap();
        this.f169678f1 = false;
        this.f169687i1 = null;
        this.f169690j1 = null;
        this.f169696l1 = 0;
        this.f169698m1 = 0;
        this.f169700n1 = DetectDelayStopHelper.TYPE_DETECT_PICKNOISE;
        this.f169702o1 = 0;
        this.f169705p1 = "";
        this.f169707q1 = false;
        this.f169581A1 = new zmw();
        this.f169583B1 = new zmw();
        this.f169585C1 = new jjw();
        this.f169587D1 = new vmw();
        this.f169590E1 = false;
        this.f169593F1 = false;
        this.f169596G1 = true;
        this.f169599H1 = false;
        this.f169602I1 = 0L;
        this.f169605J1 = null;
        this.f169608K1 = false;
        this.f169611L1 = Long.MIN_VALUE;
        this.f169614M1 = 1000L;
        this.f169617N1 = null;
        this.f169626Q1 = 1;
        this.f169629R1 = System.currentTimeMillis();
        this.f169633S1 = null;
        this.f169637T1 = -1;
        this.f169641U1 = null;
        this.f169645V1 = null;
        this.f169649W1 = 1;
        this.f169653X1 = false;
        this.f169664a2 = false;
        this.f169667b2 = false;
        this.f169670c2 = false;
        this.f169673d2 = false;
        this.f169676e2 = false;
        this.f169679f2 = null;
        this.f169682g2 = false;
        this.f169685h2 = "";
        this.f169691j2 = 0;
        this.f169695k2 = false;
        this.f169697l2 = false;
        this.f169699m2 = 0;
        this.f169701n2 = 1;
        this.f169703o2 = new PipelineConcurrentHashMap();
        this.f169706p2 = new ArrayList<>();
        this.f169708q2 = null;
        this.f169710r2 = null;
        this.f169712s2 = null;
        this.f169714t2 = null;
        this.f169716u2 = null;
        this.f169720w2 = 0;
        this.f169722x2 = AudioProfileType.AUDIO_PROFILE_HD_MONO;
        this.f169724y2 = AudioScenarioType.GAMESTREAMING;
        this.f169726z2 = null;
        this.f169582A2 = -1L;
        this.f169584B2 = -1L;
        this.f169586C2 = -1L;
        this.f169588D2 = 0;
        this.f169591E2 = new Handler(Looper.getMainLooper());
        this.f169594F2 = false;
        this.f169597G2 = -1;
        this.f169600H2 = -1;
        this.f169603I2 = 1;
        this.f169606J2 = 3;
        this.f169609K2 = false;
        this.f169612L2 = "";
        this.f169615M2 = null;
        this.f169621O2 = 0;
        this.f169624P2 = new C20151d();
        this.f169627Q2 = new C20152e();
        this.f169630R2 = new C20153f();
        this.f169634S2 = new C20154g();
        this.f169638T2 = 0;
        this.f169642U2 = 0;
        this.f169646V2 = null;
        this.f169650W2 = new C20156i();
        this.f169654X2 = new C20157j();
        this.f169658Y2 = false;
        this.f169662Z2 = false;
        this.f169665a3 = 0L;
        this.f169668b3 = false;
        this.f169671c3 = 0;
        this.f169674d3 = new C20148a();
        this.f169677e3 = 0;
        this.f169680f3 = false;
        this.f169683g3 = false;
        this.f169689i3 = "";
        this.f169692j3 = false;
        this.f169610L0 = str;
        this.f169693k0 = yw00Var;
        this.f169648W0 = (qmr) vlwVar;
        this.f169622P0 = interfaceC17392a;
        this.f169690j1 = new CongressUtil();
        m188144A6(vlwVar);
        zmx zmxVar = this.f14268H;
        zmxVar.f203843d = 261L;
        zmxVar.f203848e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }

    /* JADX INFO: renamed from: A6 */
    private void m188144A6(vlw vlwVar) {
        this.f14281s = vlwVar;
        m188426m7(vlwVar.f177117P);
        this.f169673d2 = vlwVar.f177160q;
        this.f169616N0 = false;
        this.f14269I.m131787l("volcInit", "appid:" + this.f169610L0);
        ArrayList<String> arrayListM121655F0 = fjx.m121638R().m121655F0();
        String str = WeJson.EMPTY_MAP;
        if (arrayListM121655F0 != null) {
            for (String str2 : arrayListM121655F0) {
                if (!TextUtils.isEmpty(this.f169610L0) && this.f169610L0.equals(str2)) {
                    str = "{\"config_hosts\":[\"rtc-test.bytedance.com\"],\"access_hosts\":[\"rtc-access-test.bytedance.com\"]}";
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Log.e("lqdebug", "volc engine init json");
            long jCurrentTimeMillis = System.currentTimeMillis();
            EngineConfig engineConfig = new EngineConfig();
            engineConfig.appID = this.f169610L0;
            engineConfig.parameters = jSONObject;
            engineConfig.context = m19726W1();
            try {
                if (engineConfig.parameters == null) {
                    engineConfig.parameters = new JSONObject();
                }
                engineConfig.parameters.put("rtc.enable_auto_ntp_synchronized", true);
            } catch (Exception unused) {
            }
            yw00 yw00Var = this.f169693k0;
            if (yw00Var != null) {
                engineConfig.eglContext = yw00Var.m216278l();
            }
            this.f169621O2 = 0;
            int i = this.f169648W0.f182041d1;
            if (i >= 0) {
                this.f169621O2 = i;
            } else {
                this.f169621O2 = fjx.m121638R().m121667J0();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f169641U1 = sdp0.m183522b().m183524c(engineConfig, this.f169610L0, this.f169627Q2, this.f169624P2, this.f169621O2 == 0);
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
            if (this.f169641U1 == null) {
                boolean zInitializeNativeLibs = RTCEngineImpl.initializeNativeLibs();
                eyx.m118802c().m118803a("volcCreate", "isLoad:" + zInitializeNativeLibs, LogLevel.FATAL);
                return;
            }
            eyx.m118802c().m118808g("volcCreate", "mRtcKeepAlive:" + this.f169621O2 + ",volcengineHash:" + this.f169641U1.hashCode() + ", cost:" + jCurrentTimeMillis3);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rtc.start_sco_failed_force_to_media", true);
                this.f169641U1.setRuntimeParameters(jSONObject2);
            } catch (Exception unused2) {
            }
            this.f14269I.m131786k("VolcEngine", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Exception e) {
            this.f14269I.m131787l("VolcEngine.create error" + e.toString());
        }
    }

    /* JADX INFO: renamed from: B6 */
    private int m188149B6() {
        int i = 0;
        if (!this.f169669c1 && !this.f169695k2) {
            i = 1;
        }
        return i ^ 1;
    }

    /* JADX INFO: renamed from: C6 */
    private final void m188154C6(String str, int i) {
        RTCEngineEx rTCEngineEx = this.f169641U1;
        if (rTCEngineEx == null) {
            this.f14269I.m131787l("joinChannel", "fatal error mRtcEngine is null");
            return;
        }
        RTCRoomEx rTCRoomExCreateRTCRoomEx = rTCEngineEx.createRTCRoomEx(str);
        this.f169645V1 = rTCRoomExCreateRTCRoomEx;
        if (rTCRoomExCreateRTCRoomEx == null) {
            this.f14269I.m131786k("joinChannel", "fatal error mRTCRoom is null");
            MRtcEventHandler mRtcEventHandler = this.f169713t1;
            if (mRtcEventHandler != null) {
                mRtcEventHandler.onJoinChannelfail(str, i, -6);
                return;
            }
            return;
        }
        sdp0.m183522b().m183525d(this.f169645V1);
        this.f169645V1.setRTCRoomEventHandler(this.f169634S2);
        this.f169645V1.setRTCRoomEventHandlerEx(this.f169630R2);
        this.f14269I.m131787l("volcEngine", "3 createRTCRoom:uid" + i + ",channel:" + str);
        boolean z = this.f169649W1 == 1;
        m188362N7(z);
        this.f14269I.m131787l("volcEngine", "4 setUserVisibility");
        qmr qmrVar = this.f169648W0;
        int i2 = qmrVar.f177152m;
        int i3 = qmrVar.f177154n;
        if (qmrVar.f182017F0) {
            i3 = i2;
            i2 = i3;
        }
        m188376S7(i2, i3, qmrVar.f177109H / 1000);
        this.f14269I.m131787l("volcEngine", "5 setVideoConfig");
        m188411g7();
        this.f14269I.m131787l("volcEngine", "6 setAudioConfig");
        UserInfo userInfo = new UserInfo(String.valueOf(i), null);
        if (!TextUtils.isEmpty(this.f169648W0.f155332n1)) {
            try {
                abc0 abc0Var = new abc0();
                abc0Var.f68642a = this.f169648W0.f155332n1;
                userInfo = new UserInfo(String.valueOf(i), jod0.m142454b().m142456c(abc0Var));
            } catch (Exception unused) {
                userInfo = new UserInfo(String.valueOf(i), null);
            }
        }
        this.f14269I.m131787l("volcEngine", "joinRoom token:" + this.f169656Y0 + ", channelid:" + str + ",uid:" + i);
        int iJoinRoom = this.f169645V1.joinRoom(this.f169656Y0, userInfo, z, new RTCRoomConfig(ChannelProfile.CHANNEL_PROFILE_LIVE, true, true, true, true));
        if (iJoinRoom >= 0) {
            this.f14269I.m131787l("volcEngine", "7 joinRoom");
            this.f169641U1.registerAudioFrameObserver(this.f169654X2);
            this.f169641U1.registerAudioProcessor(this.f169650W2);
            m188386W6(true);
            m188235Z5();
            return;
        }
        MRtcEventHandler mRtcEventHandler2 = this.f169713t1;
        if (mRtcEventHandler2 != null) {
            mRtcEventHandler2.onJoinChannelfail(str, i, iJoinRoom);
        }
        zmx zmxVar = this.f14268H;
        zmxVar.f203901y0 = 810L;
        zmxVar.f203865k0 = iJoinRoom;
    }

    /* JADX INFO: renamed from: D6 */
    private void m188159D6() {
        synchronized (this.f169660Z0) {
            try {
                RTCEngineEx rTCEngineEx = this.f169641U1;
                if (rTCEngineEx != null) {
                    this.f14268H.f203835a0 = "";
                    rTCEngineEx.stopPushMixedStream(this.f169612L2, MixedStreamPushTargetType.PUSH_TO_CDN);
                    this.f169641U1.stopAudioCapture();
                    this.f14269I.m131787l("Volc", "10 stopAudioCapture");
                }
                RTCRoomEx rTCRoomEx = this.f169645V1;
                if (rTCRoomEx != null) {
                    rTCRoomEx.leaveRoom();
                    this.f14269I.m131787l("Volc", "11 leaveRoom");
                }
                this.f169670c2 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H7 */
    public int m188175H7(String str) {
        int iStartPushMixedStream;
        MixedStreamPushTargetConfig mixedStreamPushTargetConfig;
        hgd0 hgd0Var;
        synchronized (this.f169672d1) {
            try {
                this.f14269I.m131787l("setRtcEnginePublishStreamUrl", "rtmpUrl:" + str + "mHavaPublish" + this.f169670c2);
                if (this.f169670c2 || this.f169667b2) {
                    iStartPushMixedStream = 0;
                } else if (this.f169641U1 == null || this.f169657Y1 == null || (mixedStreamPushTargetConfig = this.f169661Z1) == null) {
                    this.f14269I.m131787l("setRtcEnginePublishStreamUrl", "error:pushTargetConfig:" + this.f169661Z1 + ", mixedStreamConfig:" + this.f169657Y1);
                    iStartPushMixedStream = 0;
                } else {
                    mixedStreamPushTargetConfig.pushCDNURL = str;
                    mixedStreamPushTargetConfig.pushTargetType = MixedStreamPushTargetType.PUSH_TO_CDN;
                    String strM188247c6 = m188247c6();
                    iStartPushMixedStream = this.f169641U1.startPushMixedStream(strM188247c6, this.f169661Z1, this.f169657Y1);
                    if (iStartPushMixedStream != 0 && (hgd0Var = this.f169623P1) != null) {
                        hgd0Var.mo19163p(str, iStartPushMixedStream);
                        this.f14269I.m131787l("startPushMixedStream", "error:" + iStartPushMixedStream);
                    }
                    this.f169612L2 = strM188247c6;
                    this.f14269I.m131787l("startPushMixedStream", "ret:" + iStartPushMixedStream);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iStartPushMixedStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M6 */
    public void m188191M6() {
        if (this.f14268H.f203840c == 0) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "AGORA_PUBLISHING");
            this.f14269I.m131787l("notifyPublished", "VOLC PUBLISHING");
            this.f169622P0.mo128349g(4103, 0, 0, this);
            Log.e("lqdebug", "VOLC VOLC_PUBLISHING");
            this.f14268H.f203840c = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M7 */
    public void m188192M7(Object obj, int i, int i2) {
        za1 za1VarM20080C2;
        u3m u3mVar = this.f14271K;
        if (u3mVar == null || (za1VarM20080C2 = ((ExtAudioWrapper) u3mVar).m20080C2()) == null) {
            return;
        }
        za1VarM20080C2.mo18373a(obj, i, i2);
    }

    /* JADX INFO: renamed from: O7 */
    private void m188199O7() {
        qmr qmrVar = this.f169648W0;
        m188376S7(qmrVar.f177152m, qmrVar.f177154n, qmrVar.f177109H / 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V7 */
    public void m188221V7(int i, boolean z) {
        ley leyVar = this.f169598H0.get(Long.valueOf(i));
        if (leyVar != null) {
            leyVar.m149625h(z);
        }
        MRtcEventHandler mRtcEventHandler = this.f169713t1;
        if (mRtcEventHandler != null) {
            mRtcEventHandler.onUserMuteVideo(i, z);
        }
    }

    /* JADX INFO: renamed from: X6 */
    private void m188228X6() {
        this.f14269I.m131787l("release");
        boolean z = true;
        this.f169658Y2 = true;
        synchronized (this.f169660Z0) {
            try {
                this.f14269I.m131787l("release begin");
                RTCRoomEx rTCRoomEx = this.f169645V1;
                if (rTCRoomEx != null) {
                    rTCRoomEx.destroy();
                    this.f169645V1 = null;
                    sdp0.m183522b().m183525d(null);
                }
                this.f169657Y1 = null;
                IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
                if (iMediaPlayerM188334z6 != null) {
                    iMediaPlayerM188334z6.setEventHandler(null);
                }
                this.f169674d3 = null;
                long jCurrentTimeMillis = System.currentTimeMillis();
                sdp0 sdp0VarM183522b = sdp0.m183522b();
                if (this.f169621O2 != 0) {
                    z = false;
                }
                sdp0VarM183522b.m183523a(z);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                eyx.m118802c().m118808g("volcDestroy", "mRtcKeepAlive:" + this.f169621O2 + ",cost:" + jCurrentTimeMillis2);
                this.f169641U1 = null;
                this.f169627Q2 = null;
                this.f169634S2 = null;
                this.f169615M2 = null;
                this.f14269I.m131787l("volc", "12 releaseRTC");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z5 */
    private void m188235Z5() {
        this.f169633S1 = new RunnableC20158k();
    }

    /* JADX INFO: renamed from: a6 */
    private final void m188239a6(int i) {
        this.f14269I.m131787l("volcEngine", "2 setVideoSourceType");
        m188387W7(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b6 */
    public void m188243b6(boolean z, int i, int i2, int i3, int i4, String str, String str2) {
        if (this.f169657Y1 == null) {
            this.f169657Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        if (this.f169661Z1 == null) {
            this.f169661Z1 = new MixedStreamPushTargetConfig();
        }
        this.f14269I.m131787l("configPublisher", "width:" + i + ",height" + i2 + ",url:" + str + ",bitrate:" + i3 + ",fps:" + i4 + ",uid:" + str2);
        MixedStreamConfig mixedStreamConfig = this.f169657Y1;
        mixedStreamConfig.roomID = this.f169648W0.f155325g1;
        mixedStreamConfig.userID = str2;
        MixedStreamPushTargetConfig mixedStreamPushTargetConfig = this.f169661Z1;
        mixedStreamPushTargetConfig.pushCDNURL = str;
        mixedStreamPushTargetConfig.pushTargetType = MixedStreamPushTargetType.PUSH_TO_CDN;
        MixedStreamVideoConfig mixedStreamVideoConfig = new MixedStreamVideoConfig();
        mixedStreamVideoConfig.width = i;
        mixedStreamVideoConfig.height = i2;
        mixedStreamVideoConfig.gop = 1;
        mixedStreamVideoConfig.fps = this.f169636T0;
        mixedStreamVideoConfig.bitrate = i3;
        if (this.f169648W0.f182019H0) {
            mixedStreamVideoConfig.videoCodec = MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1;
        }
        this.f169657Y1.videoConfig = mixedStreamVideoConfig;
        int iM121782r0 = fjx.m121638R().m121782r0();
        MixedStreamAudioConfig mixedStreamAudioConfig = new MixedStreamAudioConfig();
        mixedStreamAudioConfig.sampleRate = 44100;
        mixedStreamAudioConfig.channels = 2;
        mixedStreamAudioConfig.audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
        if (iM121782r0 == 0) {
            iM121782r0 = 128;
        }
        mixedStreamAudioConfig.bitrate = iM121782r0;
        this.f169657Y1.audioConfig = mixedStreamAudioConfig;
    }

    /* JADX INFO: renamed from: c6 */
    private String m188247c6() {
        return "and_" + this.f169648W0.f182013B0 + "_" + Long.toString(System.currentTimeMillis() % 1000000);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ int m188257g3(tdp0 tdp0Var) {
        int i = tdp0Var.f169691j2;
        tdp0Var.f169691j2 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i8 */
    public int m188266i8(String str, String str2) {
        if (this.f169645V1 == null || this.f169594F2) {
            return 0;
        }
        int iStartForwardStreamToRooms = this.f169645V1.startForwardStreamToRooms(Collections.singletonList(new ForwardStreamInfo(str, str2)));
        if (iStartForwardStreamToRooms < 0) {
            this.f169623P1.mo19154f(0L, 3, "");
            eyx.m118802c().m118806e("ConnectOtherRoom", "volc", iStartForwardStreamToRooms, "strartForwardStreamToRoom failed", LogLevel.FATAL.value());
            this.f169594F2 = false;
        } else {
            this.f169594F2 = true;
        }
        this.f14269I.m131787l("subscribeOhterRoom", "channelid:" + str + ",ret = " + iStartForwardStreamToRooms);
        return iStartForwardStreamToRooms;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j7 */
    public void m188270j7(int i, boolean z) {
        ley leyVar = this.f169598H0.get(Long.valueOf(i));
        if (leyVar != null) {
            leyVar.m149624g(z);
        }
        MRtcEventHandler mRtcEventHandler = this.f169713t1;
        if (mRtcEventHandler != null) {
            mRtcEventHandler.onUserMuteAudio(i, z);
        }
    }

    /* JADX INFO: renamed from: m6 */
    private int m188280m6(AudioProfileType audioProfileType) {
        switch (C20150c.f169730b[audioProfileType.ordinal()]) {
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
                return this.f169648W0.f177120S;
        }
    }

    /* JADX INFO: renamed from: m8 */
    private void m188281m8(String str) {
        if (this.f169641U1 == null || this.f169657Y1 == null || this.f169661Z1 == null) {
            this.f14269I.m131787l("updateLiveTransCoding error", "mixedStreamConfig:" + this.f169657Y1 + ", pushTargetConfig:" + this.f169661Z1);
            return;
        }
        synchronized (this.f169672d1) {
            this.f169641U1.updatePushMixedStream(this.f169612L2, this.f169661Z1, this.f169657Y1);
            this.f14269I.m131787l("updateLiveTransCoding:" + this.f169657Y1.toString());
        }
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ bkw m188286o4(tdp0 tdp0Var) {
        tdp0Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: p6 */
    private String m188291p6() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<Long, ley>> it = this.f169598H0.entrySet().iterator();
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

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ int m188305t3(tdp0 tdp0Var) {
        int i = tdp0Var.f169671c3;
        tdp0Var.f169671c3 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: t6 */
    private String m188308t6(String str) {
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
            if (jSONObject.has(BaseSei.CONF) && this.f169666b1) {
                jSONObject.remove(BaseSei.CONF);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: y6 */
    private IAudioEffectPlayer m188329y6() {
        RTCEngineEx rTCEngineEx = this.f169641U1;
        if (rTCEngineEx != null) {
            return rTCEngineEx.getAudioEffectPlayer();
        }
        return null;
    }

    /* JADX INFO: renamed from: z6 */
    private IMediaPlayer m188334z6() {
        RTCEngineEx rTCEngineEx = this.f169641U1;
        if (rTCEngineEx != null) {
            return rTCEngineEx.getMediaPlayer(this.f169699m2);
        }
        return null;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: A0 */
    public int mo19914A0() {
        qmr qmrVar = this.f169648W0;
        return qmrVar.f177148k > 0 ? qmrVar.f177150l : qmrVar.f177166t;
    }

    /* JADX INFO: renamed from: A7 */
    public void m188335A7(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f169625Q0 = f;
        this.f14268H.f203797H0 = f;
        int i = (int) (f * 100.0f);
        this.f14269I.m131787l("setMasterAudioLevel", "level:" + this.f169625Q0 + ", volume:" + i);
        RTCEngineEx rTCEngineEx = this.f169641U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setCaptureVolume(StreamIndex.STREAM_INDEX_MAIN, i);
            this.f169641U1.setEarMonitorVolume(i);
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
        synchronized (this.f169660Z0) {
            this.f169684h1 = str;
            if (!this.f169648W0.f182035X0) {
                m188450z7(str, true);
            }
            eyx.m118802c().m118808g("volc setMergeSei:" + str);
        }
    }

    /* JADX INFO: renamed from: C7 */
    public void m188337C7(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.f169694k1 = pcmdataavailablecallback;
        this.f14269I.m131787l("setRecordPcmDataCallback", "pcmDataCallback = " + pcmdataavailablecallback);
        if (this.f169694k1 != null) {
            m188386W6(true);
        } else {
            m188386W6(false);
        }
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

    /* JADX INFO: renamed from: D7 */
    public void m188338D7(int i) {
        this.f14269I.m131787l("setRole", Integer.valueOf(i));
        this.f169649W1 = i;
        m188362N7(i == 1);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: E0 */
    public void mo19922E0(dxl dxlVar) {
        this.f14266F = dxlVar;
    }

    /* JADX INFO: renamed from: E6 */
    public void m188339E6(boolean z) {
        this.f14269I.m131787l("muteRemoteAudioStream", "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f169645V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeAllStreamsAudio(!z);
        }
    }

    /* JADX INFO: renamed from: E7 */
    public void m188340E7(boolean z) {
        this.f169667b2 = z;
        this.f14269I.m131787l("volcpusher setRoom24hMode:", Boolean.valueOf(z));
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: F */
    public boolean mo19925F() {
        return this.f169619O0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: F0 */
    public int mo19926F0() {
        return this.f169640U0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: F1 */
    public long mo19927F1() {
        RTCRoomStats rTCRoomStats = this.f169718v2;
        if (rTCRoomStats != null) {
            return rTCRoomStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F6 */
    public void m188341F6(boolean z) {
        this.f14269I.m131787l("muteAllRemoteVideoStream", "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f169645V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeAllStreamsVideo(!z);
        }
    }

    /* JADX INFO: renamed from: F7 */
    public void m188342F7(int i, boolean z) {
        this.f169696l1 = i;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: G0 */
    public long mo19930G0() {
        return 0L;
    }

    /* JADX INFO: renamed from: G6 */
    public void m188343G6(boolean z) {
        this.f169697l2 = z;
        this.f14269I.m131787l("muteLocalAudioStream", "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f169645V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.publishStreamAudio(!z);
        }
    }

    /* JADX INFO: renamed from: G7 */
    public void m188344G7(int i) {
        this.f169652X0 = i;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo19650H0(boolean z) {
        this.f169666b1 = z;
    }

    /* JADX INFO: renamed from: H5 */
    public void m188345H5(MRtcEventHandler mRtcEventHandler) {
        this.f169713t1 = mRtcEventHandler;
    }

    /* JADX INFO: renamed from: H6 */
    public void m188346H6(boolean z) {
        this.f14269I.m131787l("muteLocalAudioStreamForEx", "mute:" + z);
        m188343G6(z);
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: I1 */
    public void mo19935I1() {
        this.f169619O0 = true;
    }

    /* JADX INFO: renamed from: I5 */
    public void m188347I5(MRtcExitRoomHandler mRtcExitRoomHandler) {
        this.f169620O1 = mRtcExitRoomHandler;
    }

    /* JADX INFO: renamed from: I6 */
    public void m188348I6(boolean z) {
        this.f169695k2 = z;
        this.f14269I.m131787l("muteLocalVideoStream", "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f169645V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.publishStreamVideo(!z);
        }
    }

    /* JADX INFO: renamed from: I7 */
    public void m188349I7(hgd0 hgd0Var) {
        this.f169623P1 = hgd0Var;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: J */
    public void mo19651J(String str) {
        n8c.m158485c("zk", "setSei" + this.f169684h1);
        eyx.m118802c().m118808g("volc setSei:" + str);
        synchronized (this.f169660Z0) {
            try {
                this.f169681g1 = str;
                if (!this.f169648W0.f182035X0) {
                    if (TextUtils.isEmpty(this.f169684h1)) {
                        m188449y7(str);
                    } else {
                        m188450z7(this.f169684h1, false);
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

    /* JADX INFO: renamed from: J6 */
    public void m188351J6(long j, boolean z) {
        this.f14269I.m131787l("muteRemoteAudioStream", "uid:" + j + "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f169645V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeStreamAudio(String.valueOf(j), !z);
        }
    }

    /* JADX INFO: renamed from: K5 */
    public void m188353K5(MRtcAudioHandler mRtcAudioHandler) {
        this.f169709r1 = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: K6 */
    public void m188354K6(long j, boolean z) {
        this.f14269I.m131787l("muteRemoteVideoStream", "mute:" + z + ",uid:" + j);
        RTCRoomEx rTCRoomEx = this.f169645V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeStreamVideo(String.valueOf(j), !z);
        }
    }

    /* JADX INFO: renamed from: K7 */
    public void m188355K7(boolean z) {
        if (z) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "set Stream ReplaceMode");
        }
        this.f14269I.m131787l("setStreamReplaceMode:" + z);
        this.f169593F1 = z;
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: L */
    public void mo19942L(sml.InterfaceC19992a interfaceC19992a) {
        this.f169613M0 = interfaceC19992a;
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
    public void m188356L5(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f169711s1 = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: L6 */
    public void m188357L6(boolean z) {
        this.f14269I.m131787l("muteSingerAudioStream", "mute:" + z);
        n8c.m158485c("zk", "--ktv,muteSingerAudioStream:" + this.f169599H1 + "-->" + z);
        this.f169599H1 = z;
    }

    /* JADX INFO: renamed from: L7 */
    public void m188358L7(int i) {
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 != null) {
            iMediaPlayerM188334z6.setPosition(i);
        } else {
            this.f14269I.m131787l("setSurroundMusicPos", "audioMixingManager is null");
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
        if (this.f169643V == null && (yw00Var = this.f169693k0) != null) {
            this.f169643V = yw00Var.m216278l();
        }
        if (this.texture_in == 0 || this.f169695k2 || !this.f169653X1) {
            return;
        }
        synchronized (this.f169660Z0) {
            try {
                VideoFrameData videoFrameData = new VideoFrameData();
                videoFrameData.bufferType = VideoBufferType.GL_TEXTURE;
                videoFrameData.pixelFormat = VideoPixelFormat.TEXTURE_2D;
                videoFrameData.eglContext = this.f169643V;
                videoFrameData.textureId = this.texture_in;
                videoFrameData.textureMatrix = f169580k3;
                videoFrameData.seiData = null;
                videoFrameData.roiData = null;
                qmr qmrVar = this.f169648W0;
                videoFrameData.width = qmrVar.f177152m;
                videoFrameData.height = qmrVar.f177154n;
                videoFrameData.rotation = VideoRotation.VIDEO_ROTATION_0;
                videoFrameData.timestampUs = System.currentTimeMillis() * 1000000;
                RTCEngineEx rTCEngineEx = this.f169641U1;
                if (rTCEngineEx != null) {
                    rTCEngineEx.pushExternalVideoFrame(videoFrameData);
                }
                xxx.m211572F().m211584M();
            } catch (Throwable th) {
                throw th;
            }
        }
        long j = this.f169602I1 + 1;
        this.f169602I1 = j;
        if (j >= 30 || this.f169666b1) {
            m188191M6();
            if (this.f169665a3 <= 0) {
                this.f169665a3 = System.currentTimeMillis();
            }
        }
        if (this.f169662Z2 || this.f169665a3 <= 0 || System.currentTimeMillis() - this.f169665a3 <= com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            return;
        }
        this.f169662Z2 = true;
        Log.e("lqdebug", "VOLC PUBLISHED");
        this.f14269I.m131787l("notifyPublished", "VOLC PUBLISHED");
        this.f169622P0.mo128349g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, this);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: N0 */
    public long mo19952N0() {
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: N1 */
    public int mo19953N1() {
        return this.f169592F0;
    }

    /* JADX INFO: renamed from: N5 */
    public void m188360N5(MRtcChannelHandler mRtcChannelHandler) {
        this.f169715u1 = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: N6 */
    public void m188361N6(int i, int i2) {
        this.f14269I.m131787l("onClientRoleChanged", Integer.valueOf(i), Integer.valueOf(i2));
        zmx zmxVar = this.f14268H;
        if (zmxVar.f203837b) {
            if (zmxVar.f203842c1 == 1) {
                mo19739h2();
            } else {
                mo19737f2();
            }
        }
        MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler = this.f169725z1;
        if (mRtcClientRoleChangedHandler != null) {
            mRtcClientRoleChangedHandler.onClientRoleChanged(i, i2);
        }
        hgd0 hgd0Var = this.f169623P1;
        if (hgd0Var != null) {
            hgd0Var.mo19153e(i, i2);
        }
    }

    /* JADX INFO: renamed from: N7 */
    public void m188362N7(boolean z) {
        this.f14269I.m131787l("setUserVisibility", Boolean.valueOf(z));
        JSONObject jSONObject = new JSONObject();
        try {
            RTCRoomEx rTCRoomEx = this.f169645V1;
            if (rTCRoomEx == null || this.f169641U1 == null) {
                return;
            }
            rTCRoomEx.setUserVisibility(z);
            if (z) {
                jSONObject.put("rtc.audio_enable_playback_post", "{\"rtc.audio_enable_playback_post\":true}");
                this.f169641U1.setRuntimeParameters(jSONObject);
                this.f169641U1.startAudioCapture();
            } else {
                jSONObject.put("rtc.audio_enable_playback_post", "{\"rtc.audio_enable_playback_post\":false}");
                this.f169641U1.setRuntimeParameters(jSONObject);
                this.f169641U1.stopAudioCapture();
            }
        } catch (Exception e) {
            this.f14269I.m131787l("setUserVisibility falied:" + e.toString());
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: O0 */
    public long mo19956O0() {
        return this.f169595G0;
    }

    /* JADX INFO: renamed from: O5 */
    public void m188363O5(MRtcConnectHandler mRtcConnectHandler) {
        this.f169723y1 = mRtcConnectHandler;
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
    public void m188364O6(String str) {
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
        String str8 = BaseSei.f13932Z;
        String str9 = "h";
        String str10 = "w";
        String str11 = BaseSei.f13931Y;
        String str12 = BaseSei.f13930X;
        String str13 = "id";
        String str14 = com.clevertap.android.sdk.Constants.SEPARATOR_COMMA;
        String str15 = "regions code:";
        try {
            str2 = "pkmu";
            try {
                jSONObject = new JSONObject(str);
                if (jSONObject.has(com.tencent.connect.common.Constants.f57189TS)) {
                    jSONObject.remove(com.tencent.connect.common.Constants.f57189TS);
                }
                str3 = "renderMode";
                try {
                    jSONObject.put(com.tencent.connect.common.Constants.f57189TS, m19728Y1());
                    if (jSONObject.has("bType")) {
                        jSONObject.remove("bType");
                    }
                    jSONObject.put("bType", this.f14268H.f203888s);
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
                if (jSONObject2.has(BaseSei.MID)) {
                    string2 = jSONObject2.getString(BaseSei.MID);
                } else {
                    string2 = "";
                }
                if (TextUtils.isEmpty(string2)) {
                    return;
                }
                arrayList = new ArrayList();
                if (!jSONObject2.has(BaseSei.CONF)) {
                    jSONArray = jSONObject2.getJSONArray(BaseSei.CONF);
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
                        MixedStreamVideoConfig mixedStreamVideoConfig = this.f169657Y1.videoConfig;
                        mixedStreamLayoutRegionConfig2.width = mixedStreamVideoConfig.width;
                        mixedStreamLayoutRegionConfig2.height = mixedStreamVideoConfig.height;
                        mixedStreamLayoutRegionConfig2.alpha = 1.0d;
                        mixedStreamLayoutRegionConfig2.isLocalUser = true;
                        mixedStreamLayoutRegionConfig2.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                        mixedStreamLayoutRegionConfig2.roomID = this.f169648W0.f155325g1;
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
                    d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
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
                    if (string3.equals(String.valueOf(this.f169648W0.f182013B0))) {
                        mixedStreamLayoutRegionConfig.isLocalUser = true;
                        Log.e("lqdebug", "setLocalUser true id:" + string3);
                    } else {
                        mixedStreamLayoutRegionConfig.isLocalUser = false;
                        Log.e("lqdebug", "setLocalUser false id:" + string3);
                    }
                    mixedStreamLayoutRegionConfig.userID = string3;
                    mixedStreamLayoutRegionConfig.roomID = this.f169648W0.f155325g1;
                    MixedStreamVideoConfig mixedStreamVideoConfig2 = this.f169657Y1.videoConfig;
                    int i3 = mixedStreamVideoConfig2.width;
                    mixedStreamLayoutRegionConfig.locationX = (int) (((double) i3) * d2);
                    int i4 = mixedStreamVideoConfig2.height;
                    mixedStreamLayoutRegionConfig.locationY = (int) (((double) i4) * d6);
                    mixedStreamLayoutRegionConfig.width = (int) (((double) i3) * d3);
                    mixedStreamLayoutRegionConfig.height = (int) (((double) i4) * d4);
                    hmx hmxVar = this.f14269I;
                    StringBuilder sb = new StringBuilder();
                    String str18 = str15;
                    sb.append(str18);
                    sb.append(arrayList2.hashCode());
                    sb.append(", mv.height:");
                    sb.append(this.f169657Y1.videoConfig.height);
                    sb.append(",mv.width:");
                    sb.append(this.f169657Y1.videoConfig.width);
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
                    hmxVar.m131787l(sb.toString());
                    mixedStreamLayoutRegionConfig.alpha = d5;
                    mixedStreamLayoutRegionConfig.zOrder = i2;
                    if (c == 255) {
                        mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY;
                    } else {
                        mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
                    }
                    mixedStreamLayoutRegionConfig.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                    mixedStreamLayoutRegionConfig.regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
                    hmx hmxVar2 = this.f14269I;
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
                    hmxVar2.m131787l(sb2.toString());
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
                MixedStreamConfig mixedStreamConfig = this.f169657Y1;
                mixedStreamConfig.userConfigExtraInfo = this.f169681g1;
                mixedStreamConfig.regions = (MixedStreamLayoutRegionConfig[]) arrayList3.toArray(new MixedStreamLayoutRegionConfig[arrayList3.size()]);
                hmx hmxVar3 = this.f14269I;
                hmxVar3.m131787l("volc setLayout", str4 + arrayList3.size() + ",regions.hashcode" + arrayList3.hashCode());
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
        if (jSONObject2.has(BaseSei.MID)) {
            string2 = jSONObject2.getString(BaseSei.MID);
        } else {
            string2 = "";
        }
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        arrayList = new ArrayList();
        if (!jSONObject2.has(BaseSei.CONF)) {
            jSONArray = jSONObject2.getJSONArray(BaseSei.CONF);
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
                MixedStreamVideoConfig mixedStreamVideoConfig3 = this.f169657Y1.videoConfig;
                mixedStreamLayoutRegionConfig3.width = mixedStreamVideoConfig3.width;
                mixedStreamLayoutRegionConfig3.height = mixedStreamVideoConfig3.height;
                mixedStreamLayoutRegionConfig3.alpha = 1.0d;
                mixedStreamLayoutRegionConfig3.isLocalUser = true;
                mixedStreamLayoutRegionConfig3.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                mixedStreamLayoutRegionConfig3.roomID = this.f169648W0.f155325g1;
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
            d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
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
            if (string3.equals(String.valueOf(this.f169648W0.f182013B0))) {
                mixedStreamLayoutRegionConfig.isLocalUser = true;
                Log.e("lqdebug", "setLocalUser true id:" + string3);
            } else {
                mixedStreamLayoutRegionConfig.isLocalUser = false;
                Log.e("lqdebug", "setLocalUser false id:" + string3);
            }
            mixedStreamLayoutRegionConfig.userID = string3;
            mixedStreamLayoutRegionConfig.roomID = this.f169648W0.f155325g1;
            MixedStreamVideoConfig mixedStreamVideoConfig4 = this.f169657Y1.videoConfig;
            int i5 = mixedStreamVideoConfig4.width;
            mixedStreamLayoutRegionConfig.locationX = (int) (((double) i5) * d2);
            int i6 = mixedStreamVideoConfig4.height;
            mixedStreamLayoutRegionConfig.locationY = (int) (((double) i6) * d7);
            mixedStreamLayoutRegionConfig.width = (int) (((double) i5) * d3);
            mixedStreamLayoutRegionConfig.height = (int) (((double) i6) * d4);
            hmx hmxVar4 = this.f14269I;
            StringBuilder sb3 = new StringBuilder();
            String str112 = str15;
            sb3.append(str112);
            sb3.append(arrayList4.hashCode());
            sb3.append(", mv.height:");
            sb3.append(this.f169657Y1.videoConfig.height);
            sb3.append(",mv.width:");
            sb3.append(this.f169657Y1.videoConfig.width);
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
            hmxVar4.m131787l(sb3.toString());
            mixedStreamLayoutRegionConfig.alpha = d5;
            mixedStreamLayoutRegionConfig.zOrder = i2;
            if (c == 255) {
                mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY;
            } else {
                mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
            }
            mixedStreamLayoutRegionConfig.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
            mixedStreamLayoutRegionConfig.regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
            hmx hmxVar5 = this.f14269I;
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
            hmxVar5.m131787l(sb4.toString());
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
        MixedStreamConfig mixedStreamConfig2 = this.f169657Y1;
        mixedStreamConfig2.userConfigExtraInfo = this.f169681g1;
        mixedStreamConfig2.regions = (MixedStreamLayoutRegionConfig[]) arrayList5.toArray(new MixedStreamLayoutRegionConfig[arrayList5.size()]);
        hmx hmxVar6 = this.f14269I;
        hmxVar6.m131787l("volc setLayout", str4 + arrayList5.size() + ",regions.hashcode" + arrayList5.hashCode());
    }

    @Override // p149l.gw00.InterfaceC17174f
    /* JADX INFO: renamed from: P0 */
    public void mo19959P0(yw00 yw00Var, int i, int i2, int i3, int i4) {
        this.f169636T0 = i4;
        this.f169640U0 = i2;
        this.f169644V0 = i3;
    }

    /* JADX INFO: renamed from: P5 */
    public void m188365P5(ymw ymwVar) {
        this.f14269I.m131787l("addMRtcLRemoteStatsUpdataHandle", "handler:" + ymwVar);
        this.f169719w1 = ymwVar;
    }

    /* JADX INFO: renamed from: P7 */
    public void m188367P7(b2l0 b2l0Var) {
        this.f14269I.m131787l("setVideoChannelTextureViewListener", "listner:" + b2l0Var, "useTexture:" + this.f169648W0.f182037Z0);
        this.f169714t2 = b2l0Var;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: Q0 */
    public int mo19963Q0() {
        return this.f169653X1 ? m188436r6() : m188438s6();
    }

    /* JADX INFO: renamed from: Q5 */
    public void m188368Q5(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        this.f169725z1 = mRtcClientRoleChangedHandler;
    }

    /* JADX INFO: renamed from: Q7 */
    public void m188370Q7(z1l0 z1l0Var) {
        this.f169708q2 = z1l0Var;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo19655R0(vlw vlwVar, EGLContext eGLContext) {
        if (vlwVar == null || this.f169720w2 == 1) {
            return;
        }
        if (this.f169641U1 == null) {
            this.f14269I.m131787l("startRecord", "engine == null, may be appid is null");
            this.f169622P0.mo128349g(4352, 806, 0, this);
            return;
        }
        zmx zmxVar = this.f14268H;
        long j = this.f169649W1;
        zmxVar.f203842c1 = j;
        if (j == 1) {
            zmxVar.f203785B0 = "M".equals(mo20052w1()) ? "VolcMaster" : "VolcSlaver";
        } else {
            zmxVar.f203785B0 = "VolcAudience";
        }
        Log.e("lqdebug", "volc startRecord");
        super.mo19655R0(vlwVar, eGLContext);
        if (!(vlwVar instanceof qmr)) {
            throw new InvalidParameterException("Parameters error");
        }
        qmr qmrVar = (qmr) vlwVar;
        this.f169648W0 = qmrVar;
        this.f14269I.m131787l("volc startRecord");
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "VolcPushFilter startRecord");
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "videoWidth:" + vlwVar.f177164s + ",videoHeight:" + vlwVar.f177166t + ",visualWidth:" + vlwVar.f177168u + ",visualHeight:" + vlwVar.f177169v + ",encodeWidth:" + vlwVar.f177152m + ",encodeHeight:" + vlwVar.f177154n + ",videoBitrate:" + vlwVar.f177109H + ",audioBitrate:" + vlwVar.f177120S + ",videoFPS:" + vlwVar.f177107F + ",codecFPS:" + vlwVar.f182016E0 + ",mergeCanvasWidth:" + qmrVar.f177148k + ",mergeCanvasHeight:" + qmrVar.f177150l + ",codecFPS:" + vlwVar.f182016E0 + ",isHard:" + vlwVar.f182012A0);
        this.f169677e3 = 2;
        this.f169658Y2 = false;
        this.f169670c2 = false;
        this.f169662Z2 = false;
        synchronized (this.f169660Z0) {
            try {
                m188239a6(this.f169649W1);
                zmx zmxVar2 = this.f14268H;
                long jCurrentTimeMillis = System.currentTimeMillis();
                zmxVar2.f203846e = jCurrentTimeMillis;
                this.f169584B2 = jCurrentTimeMillis;
                qmr qmrVar2 = this.f169648W0;
                m188154C6(qmrVar2.f155325g1, qmrVar2.f182013B0);
                if (this.f169681g1 != null) {
                    qmr qmrVar3 = this.f169648W0;
                    if (qmrVar3.f155326h1 && this.f169684h1 == null && !qmrVar3.f182035X0) {
                        m188449y7(this.f169681g1);
                    }
                }
                this.f169720w2 = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        st0.m185792g().m185807p(m19726W1(), st0.f166270f);
        zmx zmxVar3 = this.f14268H;
        zmxVar3.f203826W = this.f169648W0.f182013B0;
        zmxVar3.f203845d1 = vlwVar.m198870d();
        zmx zmxVar4 = this.f14268H;
        zmxVar4.f203839b1 = vlwVar.f177131b0 ? 1L : 0L;
        zmxVar4.f203898x = vlwVar.f182043v0;
        zmxVar4.f203828X = this.f169648W0.f155325g1;
        zmxVar4.f203793F0 = vlwVar.f177109H;
        if (this.f169641U1 != null) {
            zmxVar4.f203879p = RTCEngineEx.getSDKVersion();
        }
        this.f14268H.f203849f = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: R5 */
    public void m188371R5(MRtcPusherHandler mRtcPusherHandler) {
        this.f169686h3 = mRtcPusherHandler;
    }

    /* JADX INFO: renamed from: R6 */
    public void m188372R6() {
        this.f14269I.m131787l("pauseRecording");
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "pauseRecording");
        RTCRoomEx rTCRoomEx = this.f169645V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.publishStreamAudio(false);
        }
    }

    /* JADX INFO: renamed from: R7 */
    public void m188373R7(a2l0 a2l0Var) {
        this.f169710r2 = a2l0Var;
    }

    /* JADX INFO: renamed from: S5 */
    public void m188374S5(MRtcQualityHandler mRtcQualityHandler) {
        this.f169721x1 = mRtcQualityHandler;
    }

    /* JADX INFO: renamed from: S6 */
    public void m188375S6() {
        this.f14269I.m131787l("pauseSurroundMusic");
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 != null) {
            iMediaPlayerM188334z6.pause();
        } else {
            this.f14269I.m131787l("pauseSurroundMusic", "audioMixingManager is null");
        }
    }

    /* JADX INFO: renamed from: S7 */
    public void m188376S7(int i, int i2, int i3) {
        if (this.f169641U1 == null) {
            this.f14269I.m131787l("setVideoConfig", "fatal error mRtcEngine is null");
            return;
        }
        int i4 = this.f169648W0.f182030S0;
        if (i4 == 0) {
            i4 = 15;
        }
        VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig();
        videoEncoderConfig.width = i;
        videoEncoderConfig.height = i2;
        videoEncoderConfig.frameRate = i4;
        videoEncoderConfig.maxBitrate = i3;
        if (fjx.m121638R().m121658G0()) {
            int iM121661H0 = (int) (fjx.m121638R().m121661H0() * i3);
            videoEncoderConfig.minBitrate = iM121661H0;
            this.f14269I.m131787l("setMinBitrate", Integer.valueOf(iM121661H0));
        }
        this.f14269I.m131787l("setVideoConfig", "width:" + i + ",height:" + i2 + ",bitrate:" + i3 + ",fps:" + i4);
        this.f169641U1.setVideoEncoderConfig(videoEncoderConfig);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: T0 */
    public int mo19973T0() {
        return 0;
    }

    /* JADX INFO: renamed from: T5 */
    public void m188377T5(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f169617N1 = mRtcReceiveSeiHandler;
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m188378T6(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        IAudioEffectPlayer iAudioEffectPlayerM188329y6 = m188329y6();
        if (iAudioEffectPlayerM188329y6 == null) {
            this.f14269I.m131786k("playEffect", "volc engine is null");
            return false;
        }
        AudioMixingType audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT;
        if (!z) {
            audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        }
        iAudioEffectPlayerM188329y6.unloadAll();
        iAudioEffectPlayerM188329y6.preload(i, str);
        return iAudioEffectPlayerM188329y6.start(i, str, new AudioEffectPlayerConfig(audioMixingType, 1, 0, 0)) > 0;
    }

    /* JADX INFO: renamed from: T7 */
    public void m188379T7(String str) {
        this.f14269I.m131787l("volc setVideoMixerBackgroundImgUrl", str);
        if (this.f169657Y1 == null) {
            this.f169657Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        this.f169657Y1.backgroundImageURL = str;
    }

    /* JADX INFO: renamed from: U6 */
    public void m188381U6() {
        this.f14268H.f203885r = m188291p6();
        this.f14269I.m131796u();
    }

    /* JADX INFO: renamed from: U7 */
    public void m188382U7(int i, int i2, int i3, int i4) {
        this.f14269I.m131787l("setVideoMixerBitrate", "bitrate:" + i, "Mixfps:" + i2);
        this.f169700n1 = i / 1000;
        this.f169702o1 = i2;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: V0 */
    public long mo19980V0() {
        return 0L;
    }

    /* JADX INFO: renamed from: V5 */
    public void m188383V5(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f169717v1 = mRtcTokenWillExpireHander;
    }

    /* JADX INFO: renamed from: V6 */
    public void m188384V6() {
        this.f14268H.f203788D = mo20054x1();
        this.f14268H.f203792F = mo19956O0();
        this.f14268H.f203794G = mo20038q1();
        this.f14268H.f203784B = mo19927F1();
        this.f14268H.f203808N = mo20052w1();
        this.f14268H.f203810O = mo20014h1();
        this.f14268H.f203812P = mo19992Y0();
        this.f14268H.f203894v = getVideoWidth();
        this.f14268H.f203896w = mo20022k0();
        this.f14268H.f203861j = mo20013h0();
        this.f14268H.f203864k = mo19953N1();
        this.f14268H.f203867l = mo19983W0();
        this.f14268H.f203885r = m188291p6();
        this.f14268H.f203818S = m19729Z1().f177170w;
        this.f14268H.f203820T = m19729Z1().f177171x;
        this.f14268H.f203822U = m188149B6();
        zmx zmxVar = this.f14268H;
        zmxVar.f203824V = this.f169697l2 ? 1L : 0L;
        zmxVar.f203816R = 1000L;
        if (this.f169641U1 != null) {
            zmxVar.f203879p = RTCEngineEx.getSDKVersion();
        }
        zmx zmxVar2 = this.f14268H;
        vlw vlwVar = this.f14281s;
        zmxVar2.f203793F0 = vlwVar.f177109H;
        zmxVar2.f203852g = vlwVar.f182019H0 ? 2L : 0L;
        zmxVar2.f203857h1 = vlwVar.f182035X0 ? 1 : 0;
        zmx zmxVar3 = this.f14268H;
        zmxVar3.f203866k1 = this.f14281s.f182019H0 ? 1 : 0;
        zmxVar3.f203836a1 = this.f169700n1;
        zmxVar3.f203869l1 = xxx.m211572F().m211598a().getWidth();
        this.f14268H.f203872m1 = xxx.m211572F().m211598a().getHeight();
        this.f14268H.f203875n1 = xxx.m211572F().m211638w();
        zmx zmxVar4 = this.f14268H;
        zmxVar4.f203878o1 = this.f14281s.f182030S0;
        zmxVar4.f203862j0 = this.f169588D2;
        zmxVar4.f203884q1.clear();
        this.f14268H.f203887r1.clear();
        this.f14269I.m131770H();
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: W0 */
    public int mo19983W0() {
        return 0;
    }

    /* JADX INFO: renamed from: W5 */
    public void m188385W5(int i) {
        this.f14269I.m131787l("adjustPlaybackSignalVolume", "volume:" + i);
        RTCEngineEx rTCEngineEx = this.f169641U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setPlaybackVolume(i);
        }
    }

    /* JADX INFO: renamed from: W6 */
    public void m188386W6(boolean z) {
        this.f14269I.m131787l("registerAudioFrameObserver", "" + z);
        RTCEngineEx rTCEngineEx = this.f169641U1;
        if (rTCEngineEx != null) {
            AudioFrameCallbackMethod audioFrameCallbackMethod = AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_PLAYBACK;
            AudioProcessorMethod audioProcessorMethod = AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD;
            if (!z) {
                rTCEngineEx.disableAudioFrameCallback(audioFrameCallbackMethod);
                this.f169641U1.disableAudioProcessor(audioProcessorMethod);
            } else {
                AudioFormat audioFormat = new AudioFormat(AudioSampleRate.AUDIO_SAMPLE_RATE_44100, AudioChannel.AUDIO_CHANNEL_STEREO, 1024);
                this.f169641U1.enableAudioFrameCallback(audioFrameCallbackMethod, audioFormat);
                this.f169641U1.enableAudioProcessor(audioProcessorMethod, audioFormat);
            }
        }
    }

    /* JADX INFO: renamed from: W7 */
    public void m188387W7(int i, int i2) {
        this.f14269I.m131787l("setVideoSourceType", "index:" + i + ", sourceType:" + i2);
        StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
        VideoSourceType videoSourceType = VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL;
        RTCEngineEx rTCEngineEx = this.f169641U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setVideoSourceType(streamIndex, videoSourceType);
        }
    }

    @Override // p149l.sml
    /* JADX INFO: renamed from: X */
    public void mo19987X() {
        this.f169619O0 = false;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: X0 */
    public long mo19988X0() {
        return 0L;
    }

    /* JADX INFO: renamed from: X7 */
    public void m188389X7(cbl0 cbl0Var) {
        this.f169712s2 = cbl0Var;
        m188398b8(0);
        m188398b8(1);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo19657Y(yw00 yw00Var, vlw vlwVar) {
        super.mo19657Y(yw00Var, vlwVar);
        this.f169693k0 = yw00Var;
        if (vlwVar == null) {
            return;
        }
        this.f169648W0 = (qmr) vlwVar;
        m188199O7();
        yw00 yw00Var2 = this.f169693k0;
        if (yw00Var2 != null) {
            this.f169643V = yw00Var2.m216278l();
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "videoWidth:" + this.f14281s.f177164s + ",videoHeight:" + this.f14281s.f177166t + ",visualWidth:" + this.f14281s.f177168u + ",visualHeight:" + this.f14281s.f177169v + ",encodeWidth:" + this.f14281s.f177152m + ",encodeHeight:" + this.f14281s.f177154n + ",videoBitrate:" + this.f14281s.f177109H + ",audioBitrate:" + this.f14281s.f177120S + ",videoFPS:" + this.f14281s.f177107F + ",codecFPS:" + this.f14281s.f182016E0 + ",mergeCanvasWidth:" + ((qmr) this.f14281s).f177148k + ",mergeCanvasHeight:" + ((qmr) this.f14281s).f177150l + ",codecFPS:" + this.f14281s.f182016E0 + ",isHard:" + this.f14281s.f182012A0);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: Y0 */
    public int mo19992Y0() {
        RTCRoomStats rTCRoomStats = this.f169718v2;
        if (rTCRoomStats != null) {
            return rTCRoomStats.txVideoKBitRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y5 */
    public int m188390Y5(int i) {
        this.f14269I.m131787l("changeRole", Integer.valueOf(i));
        boolean z = i == 1;
        int i2 = this.f169649W1;
        boolean z2 = i != i2;
        m188362N7(z);
        synchronized (this.f169660Z0) {
            if (1 == i) {
                try {
                    m188199O7();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f169649W1 = i;
        long j = i;
        this.f14268H.f203842c1 = j;
        if (z2) {
            if (j == 2) {
                mo19740i2();
                this.f14268H.f203785B0 = "VolcAudience";
            } else {
                mo19738g2();
                this.f14268H.f203785B0 = "M".equals(mo20052w1()) ? "VolcMaster" : "VolcSlaver";
            }
            m188361N6(i2, this.f169649W1);
            this.f14268H.f203849f = System.currentTimeMillis();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y7 */
    public int m188392Y7(int i) {
        this.f14269I.m131787l("setVoiceReverbType", Integer.valueOf(i));
        if (this.f169641U1 == null) {
            return -1;
        }
        VoiceChangerType voiceChangerTypeM120141d = fa1.m120138b().m120141d(i);
        if (voiceChangerTypeM120141d != null) {
            int voiceChangerType = this.f169641U1.setVoiceChangerType(voiceChangerTypeM120141d);
            this.f14269I.m131787l("setVoiceChangerType", Integer.valueOf(i), Integer.valueOf(voiceChangerType));
            return voiceChangerType;
        }
        VoiceReverbType voiceReverbTypeM120140c = fa1.m120138b().m120140c(i);
        if (voiceReverbTypeM120140c != null) {
            int voiceReverbType = this.f169641U1.setVoiceReverbType(voiceReverbTypeM120140c);
            this.f14269I.m131787l("setVoiceReverbType", Integer.valueOf(i), Integer.valueOf(voiceReverbType));
            return voiceReverbType;
        }
        this.f14269I.m131787l("setVoiceReverbType", "error preset" + i);
        return -1;
    }

    /* JADX INFO: renamed from: Z7 */
    public void m188394Z7(boolean z) {
        RTCEngineEx rTCEngineEx = this.f169641U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setEarMonitorMode(z ? EarMonitorMode.EAR_MONITOR_MODE_ON : EarMonitorMode.EAR_MONITOR_MODE_OFF);
        }
        this.f14269I.m131787l("volc setVoicebackwardsEnable" + z);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: a0 */
    public long mo19998a0() {
        return xxx.m211572F().m211620l();
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: b1 */
    public long mo20001b1() {
        return 0L;
    }

    /* JADX INFO: renamed from: b7 */
    public void m188397b7() {
        this.f14269I.m131787l("resumeRecording");
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "resumeRecording");
        m188343G6(this.f169697l2);
        this.f169653X1 = true;
    }

    /* JADX INFO: renamed from: b8 */
    public void m188398b8(int i) {
        try {
            CongressUtil congressUtil = this.f169690j1;
            if (congressUtil != null) {
                congressUtil.setYuvCallback(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
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
        if (this.f14268H.f203842c1 == 1) {
            mo19739h2();
        } else {
            mo19737f2();
        }
    }

    /* JADX INFO: renamed from: c7 */
    public void m188399c7() {
        this.f14269I.m131787l("resumeSurroundMusic");
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 != null) {
            iMediaPlayerM188334z6.resume();
        } else {
            this.f14269I.m131787l("resumeSurroundMusic", "audioMixingManager is null");
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, p149l.hmx.InterfaceC17343b
    /* JADX INFO: renamed from: d1 */
    public void mo19734d1() {
        if (this.f169676e2) {
            return;
        }
        boolean z = this.f169677e3 > 0;
        if (this.f14268H.f203842c1 == 1) {
            m188384V6();
        } else {
            m188381U6();
        }
        if (z) {
            zmx zmxVar = this.f14268H;
            if (zmxVar.f203854g1 < this.f169677e3 || this.f169609K2) {
                return;
            }
            zmxVar.f203901y0 = 14L;
            zmxVar.f203865k0 = 14;
            this.f14269I.m131787l("MediaError", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_MAKE_FRIEND);
            hu00.InterfaceC17392a interfaceC17392a = this.f169622P0;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(4353, 14, 0, this);
            }
            Handler handler = this.f169591E2;
            if (handler != null) {
                handler.post(new RunnableC20149b());
            }
        }
    }

    /* JADX INFO: renamed from: d7 */
    public void m188402d7(int i) {
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 != null) {
            iMediaPlayerM188334z6.selectAudioTrack(i);
        }
    }

    /* JADX INFO: renamed from: d8 */
    public void m188403d8(String str) {
        if (this.f169678f1) {
            return;
        }
        this.f14269I.m131787l("startSurroundMusic", "" + str);
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 == null) {
            this.f14269I.m131787l("startSurroundMusic", "player is null");
            return;
        }
        MediaPlayerConfig mediaPlayerConfig = new MediaPlayerConfig(AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH, 1);
        mediaPlayerConfig.autoPlay = true;
        iMediaPlayerM188334z6.setEventHandler(this.f169674d3);
        if (iMediaPlayerM188334z6.open(str, mediaPlayerConfig) == 0) {
            iMediaPlayerM188334z6.setProgressInterval(500L);
            this.f169678f1 = true;
            m188192M7(null, 1, 0);
        } else {
            hgd0 hgd0Var = this.f169623P1;
            if (hgd0Var != null) {
                hgd0Var.mo19149a();
            }
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
        super.mo19661e1(u3mVar);
        if (!(u3mVar instanceof ExtAudioWrapper)) {
            throw new InvalidParameterException("ISurroundMusic must implement by ExtAudioWrapper");
        }
        u3m u3mVar2 = this.f14271K;
        if (u3mVar2 != null) {
            ((ExtAudioWrapper) u3mVar2).m152749r2();
            ((ExtAudioWrapper) this.f14271K).m20088J2(new C20155h());
            ((ExtAudioWrapper) this.f14271K).mo20128s1(1);
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m188404e6(boolean z) {
        this.f169608K1 = z;
    }

    /* JADX INFO: renamed from: e7 */
    public int m188405e7(String str) {
        RTCRoomEx rTCRoomEx = this.f169645V1;
        if (rTCRoomEx != null) {
            return (int) rTCRoomEx.sendRoomMessage(str);
        }
        return -1;
    }

    /* JADX INFO: renamed from: e8 */
    public void m188406e8(String str, boolean z, boolean z2, int i) {
        if (this.f169678f1) {
            return;
        }
        this.f14269I.m131787l("startSurroundMusic", "" + str + ",loopback:" + z + ", cycle");
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 != null) {
            AudioMixingType audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
            if (z) {
                audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT;
            }
            MediaPlayerConfig mediaPlayerConfig = new MediaPlayerConfig(audioMixingType, i);
            mediaPlayerConfig.autoPlay = true;
            iMediaPlayerM188334z6.setEventHandler(this.f169674d3);
            if (iMediaPlayerM188334z6.open(str, mediaPlayerConfig) == 0) {
                iMediaPlayerM188334z6.setProgressInterval(500L);
                this.f169678f1 = true;
                m188192M7(null, 1, 0);
            } else {
                hgd0 hgd0Var = this.f169623P1;
                if (hgd0Var != null) {
                    hgd0Var.mo19149a();
                }
            }
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo19662f() {
        this.f14269I.m131787l("volc stopRecord");
        this.f169653X1 = false;
        this.f169720w2 = 0;
        if (this.f14268H.f203842c1 == 1) {
            mo19740i2();
        } else {
            mo19738g2();
        }
        Timer timer = this.f169679f2;
        if (timer != null) {
            timer.cancel();
            this.f169679f2 = null;
        }
        m188159D6();
        m188228X6();
        PipelineConcurrentHashMap pipelineConcurrentHashMap = this.f169703o2;
        if (pipelineConcurrentHashMap != null) {
            pipelineConcurrentHashMap.clear();
        }
        super.m19748p2();
        st0.m185792g().m185808q(st0.f166270f);
        PipelineConcurrentHashMap<Long, ley> pipelineConcurrentHashMap2 = this.f169598H0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            this.f169598H0.clear();
        }
        this.f14270J = MomoCodec.MomoCodecState.STOP;
        this.f169622P0.mo128349g(8193, 0, 0, this);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: f2 */
    public void mo19737f2() {
        this.f14269I.m131787l("pullStart_v3", Boolean.valueOf(this.f169680f3));
        if (this.f169680f3) {
            return;
        }
        this.f169680f3 = true;
        this.f14268H.f203851f1 = (!TextUtils.isEmpty(this.f169610L0) || TextUtils.isEmpty(this.f169656Y0)) ? 0L : 1L;
        this.f14268H.f203834a = System.currentTimeMillis();
        long j = this.f169582A2;
        if (j == -1) {
            zmx zmxVar = this.f14268H;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zmx zmxVar2 = this.f14268H;
            zmxVar.f203846e = jCurrentTimeMillis - zmxVar2.f203846e;
            this.f169582A2 = zmxVar2.f203846e;
        } else {
            this.f169582A2 = j;
        }
        this.f14268H.f203849f = System.currentTimeMillis() - this.f14268H.f203849f;
        super.mo19737f2();
    }

    /* JADX INFO: renamed from: f7 */
    public void m188408f7(boolean z) {
        if (z) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->AGORA", "set double push");
        }
        this.f169590E1 = z;
        this.f169666b1 = z;
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
        this.f169680f3 = false;
        this.f14269I.m131787l("pullStop_v3");
        zmx zmxVar = this.f14268H;
        zmxVar.f203862j0 = this.f169588D2;
        if (zmxVar.f203837b) {
            zmxVar.f203855h = System.currentTimeMillis() - this.f14268H.f203834a;
        }
        super.mo19738g2();
    }

    /* JADX INFO: renamed from: g6 */
    public void m188410g6(boolean z, String str) {
        this.f169707q1 = z;
        this.f169705p1 = str;
    }

    /* JADX INFO: renamed from: g7 */
    public void m188411g7() {
        RTCEngineEx rTCEngineEx = this.f169641U1;
        hmx hmxVar = this.f14269I;
        if (rTCEngineEx == null) {
            hmxVar.m131787l("setAudioConfig", "fatal error mRtcEngine is null");
            return;
        }
        hmxVar.m131787l("mmLiveAudioProfile:" + this.f169597G2 + ",mmLiveAudioScenario:" + this.f169600H2 + ",getAudioProfile() = " + fjx.m121638R().m121787t() + ",getAudioScenario()=" + fjx.m121638R().m121790u());
        int i = this.f169597G2;
        if (i != -1) {
            this.f169722x2 = m188447x6(i);
            this.f14268H.f203877o0 = this.f169597G2;
        } else {
            int iM121787t = fjx.m121638R().m121787t();
            if (iM121787t != -1) {
                this.f169722x2 = m188447x6(iM121787t);
                this.f14268H.f203877o0 = iM121787t;
            } else {
                this.f169722x2 = m188447x6(1);
                this.f14268H.f203877o0 = 1;
            }
        }
        int i2 = this.f169600H2;
        if (i2 != -1) {
            this.f169724y2 = m188427n6(i2);
            this.f14268H.f203880p0 = this.f169600H2;
        } else {
            int iM121790u = fjx.m121638R().m121790u();
            if (iM121790u != -1) {
                this.f169724y2 = m188427n6(iM121790u);
                this.f14268H.f203880p0 = iM121790u;
            } else {
                this.f169724y2 = m188427n6(0);
                this.f14268H.f203880p0 = 0;
            }
        }
        int i3 = this.f169648W0.f182039b1;
        this.f169641U1.setAudioProfile(this.f169722x2);
        this.f169641U1.setAudioScenario(this.f169724y2);
        this.f14269I.m131787l("setAudioConfig", "audioProfile:" + this.f169722x2.value() + ", audioScenario:" + this.f169724y2.value());
        this.f14268H.f203787C0 = (long) m188280m6(this.f169722x2);
    }

    @Override // p149l.ewl
    public int getRoomType() {
        return this.f169652X0;
    }

    @Override // p149l.ewl
    public String getServerIpAddr() {
        return StringUtil.ALL_INTERFACES;
    }

    @Override // p149l.ewl
    public int getVideoWidth() {
        if (this.f169669c1 || this.f169666b1) {
            return 0;
        }
        return this.f14281s.f177152m;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: h0 */
    public int mo20013h0() {
        return 0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: h1 */
    public int mo20014h1() {
        RTCRoomStats rTCRoomStats = this.f169718v2;
        if (rTCRoomStats != null) {
            return rTCRoomStats.txAudioKBitRate;
        }
        return 0;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: h2 */
    public void mo19739h2() {
        this.f14269I.m131787l("pushStart_v3");
        if (this.f169680f3) {
            return;
        }
        this.f169680f3 = true;
        this.f14268H.f203834a = System.currentTimeMillis();
        long j = this.f169582A2;
        zmx zmxVar = this.f14268H;
        if (j == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zmx zmxVar2 = this.f14268H;
            zmxVar.f203846e = jCurrentTimeMillis - zmxVar2.f203846e;
            this.f169582A2 = zmxVar2.f203846e;
        } else {
            zmxVar.f203846e = j;
        }
        this.f14268H.f203894v = getVideoWidth();
        this.f14268H.f203896w = mo20022k0();
        this.f14268H.f203902z = mo20036p1();
        this.f14268H.f203782A = mo19914A0();
        zmx zmxVar3 = this.f14268H;
        vlw vlwVar = this.f14281s;
        zmxVar3.f203852g = vlwVar.f182019H0 ? 2L : 0L;
        zmxVar3.f203857h1 = vlwVar.f182035X0 ? 1 : 0;
        this.f14268H.f203845d1 = this.f14281s.m198870d();
        zmx zmxVar4 = this.f14268H;
        vlw vlwVar2 = this.f14281s;
        zmxVar4.f203839b1 = vlwVar2.f177131b0 ? 1L : 0L;
        zmxVar4.f203898x = vlwVar2.f182043v0;
        zmxVar4.f203828X = this.f169648W0.f155325g1;
        zmxVar4.f203866k1 = vlwVar2.f182019H0 ? 1 : 0;
        super.mo19739h2();
    }

    /* JADX INFO: renamed from: h6 */
    public void m188413h6(boolean z) {
        this.f14269I.m131787l("enableDualStreamMode", Boolean.valueOf(z));
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "call enableDualStreamMode:" + z);
        this.f169673d2 = z;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: i2 */
    public void mo19740i2() {
        this.f14269I.m131787l("pushStop_v3");
        this.f169680f3 = false;
        zmx zmxVar = this.f14268H;
        zmxVar.f203862j0 = this.f169588D2;
        if (zmxVar.f203837b) {
            zmxVar.f203855h = System.currentTimeMillis() - this.f14268H.f203834a;
        }
        super.mo19740i2();
    }

    /* JADX INFO: renamed from: i7 */
    public void m188417i7(int i) {
        float f = i / 100.0f;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f169628R0 = f * 0.8f;
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 != null) {
            iMediaPlayerM188334z6.setVolume(i, AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH);
        } else {
            this.f14269I.m131787l("setAudioMixingVolume audioMixingManager is null");
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: j1 */
    public long mo20019j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j8 */
    public int m188419j8(String str, String str2, String str3) {
        if (this.f14268H.f203837b) {
            return m188266i8(str, str3);
        }
        this.f14269I.m131787l("subscribeOhterRoom", "not join room, stage:channelid:" + str);
        this.f169682g2 = true;
        this.f169685h2 = str3;
        this.f169688i2 = String.valueOf(str);
        return 0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: k0 */
    public int mo20022k0() {
        if (this.f169669c1 || this.f169666b1) {
            return 0;
        }
        return this.f14281s.f177154n;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: k2 */
    public void mo19743k2(String str) {
        String strM188308t6 = m188308t6(str);
        synchronized (this.f169660Z0) {
            try {
                RTCEngineEx rTCEngineEx = this.f169641U1;
                if (rTCEngineEx != null) {
                    rTCEngineEx.sendSEIMessage(StreamIndex.STREAM_INDEX_MAIN, strM188308t6.getBytes(), 0, SEICountPerFrame.SEI_COUNT_PER_FRAME_SINGLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k8 */
    public int m188422k8(String str) {
        this.f14269I.m131787l("unSubscribeOtherRoom");
        RTCRoomEx rTCRoomEx = this.f169645V1;
        if (rTCRoomEx == null) {
            return -4;
        }
        rTCRoomEx.stopForwardStreamToRooms();
        this.f169594F2 = false;
        return 0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: l1 */
    public long mo20025l1() {
        return 0L;
    }

    /* JADX INFO: renamed from: l7 */
    public void m188424l7(int i, int i2) {
        this.f169597G2 = i;
        this.f169600H2 = i2;
        this.f14269I.m131787l("VolcPusherFilter", "setmmLiveAudioProfile:" + this.f169597G2 + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA + this.f169600H2);
    }

    /* JADX INFO: renamed from: l8 */
    public void m188425l8(String str) {
        this.f169656Y0 = str;
        this.f14269I.m131787l("updateChannelkey", "key:" + str);
        if (this.f169645V1 == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f169645V1.updateToken(this.f169656Y0);
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: m0 */
    public int mo20028m0() {
        return 0;
    }

    /* JADX INFO: renamed from: m7 */
    public void m188426m7(int i) {
        this.f169632S0 = i;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: n0 */
    public long mo20030n0() {
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: n1 */
    public int mo20031n1() {
        return this.f169644V0;
    }

    /* JADX INFO: renamed from: n6 */
    public AudioScenarioType m188427n6(int i) {
        if (i != 0) {
            return i != 1 ? AudioScenarioType.GAMESTREAMING : AudioScenarioType.DEFAULT;
        }
        return AudioScenarioType.GAMESTREAMING;
    }

    /* JADX INFO: renamed from: n7 */
    public void m188428n7(int i) {
        this.f14268H.f203858i = i;
    }

    /* JADX INFO: renamed from: n8 */
    public void m188429n8(String str) {
        this.f14269I.m131787l("updateRtmpUrl", str);
        if (this.f169641U1 == null || this.f169622P0 == null || TextUtils.isEmpty(str)) {
            this.f14269I.m131787l("updateRtmpUrl:" + str + ",errorengin is :" + this.f169641U1);
            return;
        }
        if (str.equals(this.f14268H.f203898x)) {
            this.f14269I.m131786k("updateRtmpUrl", "url  is no difference: newUrl:" + str + ",old:is" + this.f14268H.f203898x);
            return;
        }
        this.f14268H.f203898x = str;
        this.f169641U1.stopPushMixedStream(this.f169612L2, MixedStreamPushTargetType.PUSH_TO_CDN);
        this.f169670c2 = false;
        this.f14269I.m131787l("updateRtmpUrl:" + str + ",stopLiveTranscoding:taskId" + this.f169612L2);
        MRtcPusherHandler mRtcPusherHandler = this.f169686h3;
        if (mRtcPusherHandler != null) {
            mRtcPusherHandler.onPushChangeStreamUrl(str);
        }
        m188175H7(str);
    }

    @Override // p149l.fcj, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (fjx.m121638R().m121771n2()) {
            GLES20.glFlush();
        }
        this.texture_in = i;
        mo19653M1();
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: o0 */
    public long mo20034o0() {
        return 0L;
    }

    /* JADX INFO: renamed from: o6 */
    public int m188430o6() {
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 != null) {
            return iMediaPlayerM188334z6.getAudioTrackCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o7 */
    public void m188431o7(int i) {
        this.f14268H.f203888s = i;
        this.f14269I.m131787l("setBusinessType volc", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o8 */
    public void m188432o8(int i, int i2) {
        this.f14269I.m131787l("updateTranscodeVideoWH", "width:" + i, "height:" + i2, "mergeW:" + this.f169648W0.f177148k, "mergeH:" + this.f169648W0.f177150l, "parW:" + this.f169648W0.f177164s, ",parH:" + this.f169648W0.f177166t);
        MixedStreamConfig mixedStreamConfig = this.f169657Y1;
        if (mixedStreamConfig == null) {
            this.f14269I.m131787l("updateTranscodeVideoWH", "mixedStreamConfig is null");
            return;
        }
        MixedStreamVideoConfig mixedStreamVideoConfig = mixedStreamConfig.videoConfig;
        mixedStreamVideoConfig.width = i;
        mixedStreamVideoConfig.height = i2;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: p1 */
    public int mo20036p1() {
        qmr qmrVar = this.f169648W0;
        int i = qmrVar.f177148k;
        return i > 0 ? i : qmrVar.f177164s;
    }

    /* JADX INFO: renamed from: p7 */
    public void m188433p7(String str) {
        this.f14269I.m131787l("setChannelkey", "key:" + str);
        this.f169656Y0 = str;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: q1 */
    public long mo20038q1() {
        return this.f169589E0;
    }

    /* JADX INFO: renamed from: q6 */
    public double m188434q6() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: q7 */
    public void m188435q7(boolean z) {
        this.f169596G1 = z;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: r0 */
    public long mo20041r0() {
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: r1 */
    public boolean mo19669r1() {
        return this.f169590E1;
    }

    /* JADX INFO: renamed from: r6 */
    public int m188436r6() {
        return this.f169604J0;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: s0 */
    public int mo20044s0() {
        return 0;
    }

    /* JADX INFO: renamed from: s6 */
    public int m188438s6() {
        return this.f169607K0;
    }

    /* JADX INFO: renamed from: s7 */
    public void m188439s7(boolean z) {
        this.f169609K2 = z;
        this.f14269I.m131787l("setEnableConferenceReconnect:" + z);
    }

    public void stopSurroundMusic() {
        this.f14269I.m131787l("stopSurroundMusic");
        if (this.f169641U1 != null) {
            IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
            if (iMediaPlayerM188334z6 != null) {
                iMediaPlayerM188334z6.stop();
            } else {
                this.f14269I.m131787l("stopSurroundMusic", "audioMixingManager is null");
            }
            this.f169678f1 = false;
        }
    }

    /* JADX INFO: renamed from: t7 */
    public int m188440t7(boolean z) {
        RTCEngineEx rTCEngineEx = this.f169641U1;
        if (rTCEngineEx != null) {
            return z ? rTCEngineEx.setDefaultAudioRoute(AudioRoute.AUDIO_ROUTE_SPEAKERPHONE) : rTCEngineEx.setDefaultAudioRoute(AudioRoute.AUDIO_ROUTE_EARPIECE);
        }
        return -1;
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

    /* JADX INFO: renamed from: u6 */
    public float m188441u6() {
        return this.f169628R0;
    }

    /* JADX INFO: renamed from: v6 */
    public long m188443v6() {
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 != null && this.f169678f1) {
            return iMediaPlayerM188334z6.getTotalDuration();
        }
        this.f14269I.m131787l("getSurroundMusicDuration", "audioMixingManager is null");
        return 0L;
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: w1 */
    public String mo20052w1() {
        qmr qmrVar = this.f169648W0;
        return (qmrVar == null || qmrVar.f155326h1) ? "M" : j6f.LATITUDE_SOUTH;
    }

    /* JADX INFO: renamed from: w6 */
    public long m188445w6() {
        IMediaPlayer iMediaPlayerM188334z6 = m188334z6();
        if (iMediaPlayerM188334z6 != null && this.f169678f1) {
            return iMediaPlayerM188334z6.getPosition();
        }
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "getSurroundMusicPos");
        return 0L;
    }

    /* JADX INFO: renamed from: w7 */
    public void m188446w7(String str) {
        if (this.f169641U1 == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            eyx.m118802c().m118807f("setEngineParameters", "para", str);
            return;
        }
        try {
            this.f14269I.m131787l("setEngineParameters", "success", Integer.valueOf(this.f169641U1.setRuntimeParameters(new JSONObject(str))));
        } catch (JSONException e) {
            this.f14269I.m131787l("setEngineParameters", "failed", e.getMessage());
        }
    }

    @Override // p149l.ewl
    /* JADX INFO: renamed from: x1 */
    public long mo20054x1() {
        return this.f169691j2 * 1024;
    }

    /* JADX INFO: renamed from: x6 */
    public AudioProfileType m188447x6(int i) {
        if (i == 0) {
            return AudioProfileType.AUDIO_PROFILE_FLUENT;
        }
        if (i != 1) {
            return i != 2 ? AudioProfileType.AUDIO_PROFILE_HD_MONO : AudioProfileType.AUDIO_PROFILE_HD;
        }
        return AudioProfileType.AUDIO_PROFILE_HD_MONO;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y */
    public void mo19671y(int i, int i2) {
        this.f14269I.m131787l("enableAudioVolumeIndication", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f169641U1 != null) {
            float f = i2 / 10.0f;
            Log.e("lqdebug", "enableAudioVolumeIndication:" + i + ",smooth:" + f);
            AudioPropertiesConfig audioPropertiesConfig = new AudioPropertiesConfig(i, false, true, AudioReportMode.AUDIO_REPORT_MODE_NORMAL, f);
            audioPropertiesConfig.enableVoicePitch = true;
            this.f169641U1.enableAudioPropertiesReport(audioPropertiesConfig);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y0 */
    public void mo19672y0(int i, int i2, int i3) {
        this.f14269I.m131787l("enableAudioVolumeIndication", Integer.valueOf(i), Integer.valueOf(i2), "vad:" + i3);
        boolean z = i3 != 0;
        if (this.f169641U1 != null) {
            AudioPropertiesConfig audioPropertiesConfig = new AudioPropertiesConfig(i, false, z, AudioReportMode.AUDIO_REPORT_MODE_NORMAL, i2 / 10.0f);
            audioPropertiesConfig.enableVoicePitch = true;
            this.f169641U1.enableAudioPropertiesReport(audioPropertiesConfig);
        }
    }

    /* JADX INFO: renamed from: y7 */
    public void m188449y7(String str) {
        if (this.f169648W0 == null || str == null) {
            return;
        }
        if (this.f169657Y1 == null) {
            this.f169657Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        qmr qmrVar = this.f169648W0;
        int i = qmrVar.f177148k;
        if (i > 0) {
            m188432o8(i, qmrVar.f177150l);
        } else {
            int i2 = qmrVar.f177164s;
            if (i2 > 0) {
                m188432o8(i2, i2);
            }
        }
        m188364O6(str);
        m188281m8(this.f169648W0.f182043v0);
    }

    /* JADX INFO: renamed from: z7 */
    public void m188450z7(String str, boolean z) {
        if (this.f169648W0 == null || str == null) {
            return;
        }
        if (this.f169657Y1 == null) {
            this.f169657Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        qmr qmrVar = this.f169648W0;
        int i = qmrVar.f177148k;
        if (i > 0) {
            m188432o8(i, qmrVar.f177150l);
        } else {
            int i2 = qmrVar.f177164s;
            if (i2 > 0) {
                m188432o8(i2, i2);
            }
        }
        m188364O6(str);
        if (!this.f169664a2) {
            m188281m8(this.f169648W0.f182043v0);
            return;
        }
        if (this.f14268H.f203837b && this.f14278R != null && z) {
            String string = "" + this.f169681g1;
            try {
                JSONObject jSONObject = new JSONObject(string);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("asr", 44100);
                jSONObject2.put("w", this.f14281s.f177148k);
                jSONObject2.put("h", this.f14281s.f177150l);
                jSONObject2.put("gop", this.f14281s.f177108G);
                jSONObject2.put("fps", this.f14281s.f177107F);
                jSONObject2.put("vbr", this.f14281s.f177109H);
                jSONObject2.put("vcpf", this.f14281s.f182019H0 ? 2 : 1);
                jSONObject.put("mixInfo", jSONObject2);
                string = jSONObject.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String str2 = string;
            dix.C16387d c16387dM111948h = dix.m111940d().m111948h(this.f14278R.m116726b());
            hmx hmxVar = this.f14269I;
            StringBuilder sb = new StringBuilder("server mix update uid:");
            sb.append(this.f169648W0.f182013B0);
            sb.append(",momoid:");
            sb.append(c16387dM111948h.f86450c);
            sb.append("roomid:");
            sb.append(this.f14278R);
            hmxVar.m131787l(this.f14278R.m116732h());
            HttpWrapper httpWrapper = HttpWrapper.getInstance();
            String str3 = c16387dM111948h.f86448a;
            String str4 = c16387dM111948h.f86449b;
            qmr qmrVar2 = this.f169648W0;
            int i3 = qmrVar2.f182013B0;
            String str5 = c16387dM111948h.f86450c;
            eix eixVar = this.f14278R;
            String strM116732h = eixVar != null ? eixVar.m116732h() : qmrVar2.f155325g1;
            String str6 = this.f169648W0.f155325g1;
            zmx zmxVar = this.f14268H;
            httpWrapper.updateChannel(str3, str4, i3, str5, strM116732h, str6, zmxVar.f203783A0, str2, "agora", this.f14281s.f182043v0, (int) zmxVar.f203888s);
        }
    }

    /* JADX INFO: renamed from: l.tdp0$h */
    public class C20155h implements ExtAudioWrapper.InterfaceC4108i {
        public C20155h() {
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

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo19646A() {
    }

    /* JADX INFO: renamed from: P6 */
    public void m188366P6() {
    }

    /* JADX INFO: renamed from: Z6 */
    public void m188393Z6() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: b0 */
    public void mo19658b0() {
    }

    /* JADX INFO: renamed from: c8 */
    public void m188400c8() {
    }

    /* JADX INFO: renamed from: f8 */
    public void m188409f8() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    /* JADX INFO: renamed from: h8 */
    public void m188415h8() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o */
    public void mo19666o() {
    }

    /* JADX INFO: renamed from: l.tdp0$j */
    public class C20157j implements IAudioFrameObserver {
        public C20157j() {
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameObserver
        public void onPlaybackAudioFrame(IAudioFrame iAudioFrame) {
            if (tdp0.this.f169704p0 == null || tdp0.this.f169613M0 == null) {
                return;
            }
            int iData_size = iAudioFrame.data_size();
            byte[] bArrM152744o2 = new byte[iData_size];
            iAudioFrame.getDataBuffer().get(bArrM152744o2, 0, iData_size);
            int i = tdp0.this.f169649W1;
            tdp0 tdp0Var = tdp0.this;
            if (i != 2) {
                if (tdp0Var.f169704p0 != null) {
                    tdp0.this.f169704p0.m202493i(new mpd0(bArrM152744o2, System.currentTimeMillis(), iAudioFrame.channel().value()));
                }
            } else {
                if (tdp0Var.f169648W0.f177119R != 1 && iAudioFrame.channel().value() == 1) {
                    bArrM152744o2 = m300.m152744o2(bArrM152744o2, iData_size);
                }
                tdp0.this.f169613M0.mo128315C(new mpd0(bArrM152744o2, System.currentTimeMillis(), 2));
            }
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameObserver
        public void onRecordAudioFrame(IAudioFrame iAudioFrame) {
            mpd0 mpd0VarMo18364C;
            ByteBuffer byteBuffer;
            int iValue = iAudioFrame.channel().value();
            int unused = tdp0.this.f169691j2;
            tdp0.m188257g3(tdp0.this);
            int iData_size = iAudioFrame.data_size();
            byte[] bArrM152744o2 = new byte[iData_size];
            if (!tdp0.this.f169599H1) {
                iAudioFrame.getDataBuffer().get(bArrM152744o2, 0, iData_size);
            }
            if (tdp0.this.f169694k1 != null) {
                tdp0.this.f169694k1.onPcmDateCallback(tdp0.this.f169648W0.f182013B0, bArrM152744o2, 44100, iValue != 1);
            }
            mpd0 mpd0Var = null;
            if (((MediaBaseCodecFilter) tdp0.this).f14271K != null) {
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).f14271K).mo20101W1(tdp0.this.f169628R0);
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).f14271K).m20087I2(2048, tdp0.this.f169648W0.f177117P, iValue, "Volc");
                mpd0VarMo18364C = ((ExtAudioWrapper) ((MediaBaseCodecFilter) tdp0.this).f14271K).mo18364C(new mpd0(bArrM152744o2, tdp0.this.f169632S0, iValue));
                if (mpd0VarMo18364C != null && (byteBuffer = mpd0VarMo18364C.f135036b) != null) {
                    byteBuffer.get(bArrM152744o2, 0, iData_size);
                    iAudioFrame.getDataBuffer().rewind();
                    iAudioFrame.getDataBuffer().put(bArrM152744o2);
                    iAudioFrame.getDataBuffer().rewind();
                }
            } else {
                mpd0VarMo18364C = null;
            }
            if (tdp0.this.f169613M0 == null || !tdp0.this.f169619O0) {
                return;
            }
            if (((MediaBaseCodecFilter) tdp0.this).f14271K != null) {
                if (tdp0.this.f169704p0 != null) {
                    tdp0.this.f169704p0.m202494j(1.0f);
                    if (tdp0.this.f169648W0.f182035X0) {
                        tdp0.this.f169704p0.m202495k(1.0f);
                    }
                    mpd0Var = tdp0.this.f169704p0.m202491g();
                }
                if (mpd0Var != null) {
                    tdp0 tdp0Var = tdp0.this;
                    ByteBuffer byteBufferM202492h = mpd0VarMo18364C != null ? tdp0Var.f169704p0.m202492h(mpd0VarMo18364C.m155800c(), mpd0Var.m155800c(), mpd0Var.m155802e()) : tdp0Var.f169704p0.m202492h(bArrM152744o2, mpd0Var.m155800c(), mpd0Var.m155802e());
                    if (byteBufferM202492h != null) {
                        mpd0Var = new mpd0(byteBufferM202492h.array(), mpd0Var.m155801d(), iValue);
                    }
                }
            }
            if (mpd0Var != null) {
                mpd0 mpd0Var2 = new mpd0(iValue == 1 ? m300.m152744o2(mpd0Var.m155800c(), mpd0Var.m155802e()) : mpd0Var.m155800c(), tdp0.this.f169632S0, 2);
                mpd0Var2.m155804g(false);
                if (tdp0.this.f169613M0 != null) {
                    tdp0.this.f169613M0.mo128315C(mpd0Var2);
                    if (tdp0.m188305t3(tdp0.this) % 50 == 0) {
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                        return;
                    }
                    return;
                }
                return;
            }
            if (tdp0.this.f169649W1 != 2) {
                if (iValue == 1) {
                    bArrM152744o2 = m300.m152744o2(bArrM152744o2, iData_size);
                }
                mpd0 mpd0Var3 = new mpd0(bArrM152744o2, tdp0.this.f169632S0, 2);
                mpd0Var3.m155804g(false);
                if (tdp0.this.f169613M0 != null) {
                    tdp0.this.f169613M0.mo128315C(mpd0Var3);
                    if (tdp0.m188305t3(tdp0.this) % 50 == 0) {
                        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                    }
                }
            }
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameObserver
        public void onCaptureMixedAudioFrame(IAudioFrame iAudioFrame) {
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameObserver
        public void onMixedAudioFrame(IAudioFrame iAudioFrame) {
        }

        @Override // com.p069ss.bytertc.engine.IAudioFrameObserver
        public void onRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame) {
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m188350J5(wmw wmwVar) {
    }

    /* JADX INFO: renamed from: J7 */
    public void m188352J7(float f) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo19652K1(mpd0 mpd0Var) {
    }

    /* JADX INFO: renamed from: M5 */
    public void m188359M5(xmw xmwVar) {
    }

    /* JADX INFO: renamed from: Q6 */
    public void m188369Q6(int i) {
    }

    /* JADX INFO: renamed from: U5 */
    public void m188380U5(anw anwVar) {
    }

    /* JADX INFO: renamed from: a7 */
    public void m188395a7(int i) {
    }

    /* JADX INFO: renamed from: d6 */
    public void m188401d6(boolean z) {
    }

    /* JADX INFO: renamed from: f6 */
    public void m188407f6(boolean z) {
    }

    /* JADX INFO: renamed from: g8 */
    public void m188412g8(int i) {
    }

    /* JADX INFO: renamed from: h7 */
    public void m188414h7(int i) {
    }

    /* JADX INFO: renamed from: i6 */
    public void m188416i6(boolean z) {
    }

    /* JADX INFO: renamed from: j6 */
    public void m188418j6(boolean z) {
    }

    /* JADX INFO: renamed from: k6 */
    public void m188420k6(boolean z) {
    }

    /* JADX INFO: renamed from: k7 */
    public void m188421k7(boolean z) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: m1 */
    public void mo19665m1(ByteBuffer byteBuffer) {
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: n2 */
    public void mo19746n2(vlw vlwVar) {
    }

    /* JADX INFO: renamed from: r7 */
    public void m188437r7(double d) {
    }

    /* JADX INFO: renamed from: u7 */
    public void m188442u7(String str) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: v0 */
    public void mo19670v0(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: v7 */
    public void m188444v7(String str) {
    }

    /* JADX INFO: renamed from: l.tdp0$a */
    public class C20148a implements IMediaPlayerEventHandler {
        public C20148a() {
        }

        @Override // com.p069ss.bytertc.engine.IMediaPlayerEventHandler
        public void onMediaPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError) {
            ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onMediaPlayerStateChanged", "playerId:" + i + ", state:" + playerState.toString());
            if (i == tdp0.this.f169699m2) {
                if (playerState == PlayerState.FINISHED || playerState == PlayerState.LOOP_FINISHED) {
                    tdp0.this.f169678f1 = false;
                    tdp0.this.m188192M7(null, 2, 0);
                    if (tdp0.this.f169713t1 != null) {
                        tdp0.this.f169713t1.onAudioMixingFinished();
                        ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onAudioMixingFinished");
                        return;
                    }
                    return;
                }
                if (playerState == PlayerState.PLAYING) {
                    if (tdp0.this.f169623P1 != null) {
                        tdp0.this.f169623P1.mo19151c();
                        ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onAudioMixingPlay");
                        return;
                    }
                    return;
                }
                if (playerState == PlayerState.PAUSED) {
                    if (tdp0.this.f169623P1 != null) {
                        tdp0.this.f169623P1.mo19150b();
                        ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onAudioMixingPaused");
                        return;
                    }
                    return;
                }
                if (playerState == PlayerState.STOPPED) {
                    if (tdp0.this.f169623P1 != null) {
                        tdp0.this.f169623P1.mo19152d();
                        ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onAudioMixingStoped");
                        return;
                    }
                    return;
                }
                if (playerState != PlayerState.FAILED || tdp0.this.f169623P1 == null) {
                    return;
                }
                tdp0.this.f169623P1.mo19149a();
                ((MediaBaseCodecFilter) tdp0.this).f14269I.m131787l("onAudioMixingFailed");
            }
        }

        @Override // com.p069ss.bytertc.engine.IMediaPlayerEventHandler
        public void onMediaPlayerPlayingProgress(int i, long j) {
        }

        @Override // com.p069ss.bytertc.engine.IMediaPlayerEventHandler
        public void onMediaPlayerEvent(int i, PlayerEvent playerEvent, String str) {
        }
    }

    /* JADX INFO: renamed from: B7 */
    public void m188336B7(boolean z, int i) {
    }

    /* JADX INFO: renamed from: X5 */
    public void m188388X5(long j, float f) {
    }

    /* JADX INFO: renamed from: Y6 */
    public void m188391Y6(int i, int i2) {
    }

    /* JADX INFO: renamed from: a8 */
    public void m188396a8(int i, double d) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo19664l0(vlw vlwVar, EGLContext eGLContext) {
    }

    /* JADX INFO: renamed from: l6 */
    public void m188423l6(long j, boolean z) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: p */
    public void mo19668p(String str, int i) {
    }

    /* JADX INFO: renamed from: x7 */
    public void m188448x7(boolean z, boolean z2) {
    }

    @RequiresApi(api = 15)
    public tdp0(Context context, yw00 yw00Var, hu00.InterfaceC17392a interfaceC17392a, vlw vlwVar) {
        super(context);
        this.f169631S = "Pipeline_Normal_pip->PIPLINE->VOLC";
        this.f169635T = true;
        this.f169639U = -1;
        this.f169647W = false;
        this.f169651X = false;
        this.f169655Y = true;
        this.f169659Z = null;
        this.f169589E0 = 0L;
        this.f169592F0 = 0;
        this.f169595G0 = 0L;
        this.f169598H0 = new PipelineConcurrentHashMap<>();
        this.f169601I0 = new PipelineConcurrentHashMap<>();
        this.f169604J0 = 0;
        this.f169607K0 = 0;
        this.f169610L0 = null;
        this.f169616N0 = false;
        this.f169619O0 = false;
        this.f169625Q0 = 1.0f;
        this.f169628R0 = 1.0f;
        this.f169632S0 = 44100;
        this.f169636T0 = 0;
        this.f169640U0 = 0;
        this.f169644V0 = 0;
        this.f169652X0 = -1;
        this.f169656Y0 = null;
        this.f169660Z0 = new Object();
        this.f169663a1 = 0;
        this.f169666b1 = false;
        this.f169669c1 = false;
        this.f169672d1 = new Object();
        this.f169675e1 = new PipelineConcurrentHashMap();
        this.f169678f1 = false;
        this.f169687i1 = null;
        this.f169690j1 = null;
        this.f169696l1 = 0;
        this.f169698m1 = 0;
        this.f169700n1 = DetectDelayStopHelper.TYPE_DETECT_PICKNOISE;
        this.f169702o1 = 0;
        this.f169705p1 = "";
        this.f169707q1 = false;
        this.f169581A1 = new zmw();
        this.f169583B1 = new zmw();
        this.f169585C1 = new jjw();
        this.f169587D1 = new vmw();
        this.f169590E1 = false;
        this.f169593F1 = false;
        this.f169596G1 = true;
        this.f169599H1 = false;
        this.f169602I1 = 0L;
        this.f169605J1 = null;
        this.f169608K1 = false;
        this.f169611L1 = Long.MIN_VALUE;
        this.f169614M1 = 1000L;
        this.f169617N1 = null;
        this.f169626Q1 = 1;
        this.f169629R1 = System.currentTimeMillis();
        this.f169633S1 = null;
        this.f169637T1 = -1;
        this.f169641U1 = null;
        this.f169645V1 = null;
        this.f169649W1 = 1;
        this.f169653X1 = false;
        this.f169664a2 = false;
        this.f169667b2 = false;
        this.f169670c2 = false;
        this.f169673d2 = false;
        this.f169676e2 = false;
        this.f169679f2 = null;
        this.f169682g2 = false;
        this.f169685h2 = "";
        this.f169691j2 = 0;
        this.f169695k2 = false;
        this.f169697l2 = false;
        this.f169699m2 = 0;
        this.f169701n2 = 1;
        this.f169703o2 = new PipelineConcurrentHashMap();
        this.f169706p2 = new ArrayList<>();
        this.f169708q2 = null;
        this.f169710r2 = null;
        this.f169712s2 = null;
        this.f169714t2 = null;
        this.f169716u2 = null;
        this.f169720w2 = 0;
        this.f169722x2 = AudioProfileType.AUDIO_PROFILE_HD_MONO;
        this.f169724y2 = AudioScenarioType.GAMESTREAMING;
        this.f169726z2 = null;
        this.f169582A2 = -1L;
        this.f169584B2 = -1L;
        this.f169586C2 = -1L;
        this.f169588D2 = 0;
        this.f169591E2 = new Handler(Looper.getMainLooper());
        this.f169594F2 = false;
        this.f169597G2 = -1;
        this.f169600H2 = -1;
        this.f169603I2 = 1;
        this.f169606J2 = 3;
        this.f169609K2 = false;
        this.f169612L2 = "";
        this.f169615M2 = null;
        this.f169621O2 = 0;
        this.f169624P2 = new C20151d();
        this.f169627Q2 = new C20152e();
        this.f169630R2 = new C20153f();
        this.f169634S2 = new C20154g();
        this.f169638T2 = 0;
        this.f169642U2 = 0;
        this.f169646V2 = null;
        this.f169650W2 = new C20156i();
        this.f169654X2 = new C20157j();
        this.f169658Y2 = false;
        this.f169662Z2 = false;
        this.f169665a3 = 0L;
        this.f169668b3 = false;
        this.f169671c3 = 0;
        this.f169674d3 = new C20148a();
        this.f169677e3 = 0;
        this.f169680f3 = false;
        this.f169683g3 = false;
        this.f169689i3 = "";
        this.f169692j3 = false;
        this.f169693k0 = yw00Var;
        this.f169648W0 = (qmr) vlwVar;
        this.f169622P0 = interfaceC17392a;
        this.f169690j1 = new CongressUtil();
        m188144A6(vlwVar);
        zmx zmxVar = this.f14268H;
        zmxVar.f203843d = 261L;
        zmxVar.f203848e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }
}
