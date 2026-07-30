package p153l;

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
import com.p074ss.bytertc.engine.IAudioFrameObserver;
import com.p074ss.bytertc.engine.IAudioFrameProcessor;
import com.p074ss.bytertc.engine.IMediaPlayerEventHandler;
import com.p074ss.bytertc.engine.RTCEngineEx;
import com.p074ss.bytertc.engine.RTCRoomConfig;
import com.p074ss.bytertc.engine.RTCRoomEx;
import com.p074ss.bytertc.engine.UserInfo;
import com.p074ss.bytertc.engine.VideoCanvas;
import com.p074ss.bytertc.engine.VideoEncoderConfig;
import com.p074ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.p074ss.bytertc.engine.audio.IMediaPlayer;
import com.p074ss.bytertc.engine.data.AudioChannel;
import com.p074ss.bytertc.engine.data.AudioEffectPlayerConfig;
import com.p074ss.bytertc.engine.data.AudioFormat;
import com.p074ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.p074ss.bytertc.engine.data.AudioMixingType;
import com.p074ss.bytertc.engine.data.AudioProcessorMethod;
import com.p074ss.bytertc.engine.data.AudioPropertiesConfig;
import com.p074ss.bytertc.engine.data.AudioPropertiesInfo;
import com.p074ss.bytertc.engine.data.AudioReportMode;
import com.p074ss.bytertc.engine.data.AudioRoute;
import com.p074ss.bytertc.engine.data.AudioSampleRate;
import com.p074ss.bytertc.engine.data.EarMonitorMode;
import com.p074ss.bytertc.engine.data.EngineConfig;
import com.p074ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.p074ss.bytertc.engine.data.ForwardStreamInfo;
import com.p074ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.p074ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.p074ss.bytertc.engine.data.LocalAudioStreamError;
import com.p074ss.bytertc.engine.data.LocalAudioStreamState;
import com.p074ss.bytertc.engine.data.MediaPlayerConfig;
import com.p074ss.bytertc.engine.data.PlayerError;
import com.p074ss.bytertc.engine.data.PlayerEvent;
import com.p074ss.bytertc.engine.data.PlayerState;
import com.p074ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.p074ss.bytertc.engine.data.RemoteAudioState;
import com.p074ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.p074ss.bytertc.engine.data.RemoteStreamKey;
import com.p074ss.bytertc.engine.data.SEICountPerFrame;
import com.p074ss.bytertc.engine.data.StreamIndex;
import com.p074ss.bytertc.engine.data.StreamKey;
import com.p074ss.bytertc.engine.data.StreamSyncInfoConfig;
import com.p074ss.bytertc.engine.data.SubscribeState;
import com.p074ss.bytertc.engine.data.SubscribeStateChangeReason;
import com.p074ss.bytertc.engine.data.VideoBufferType;
import com.p074ss.bytertc.engine.data.VideoFrameData;
import com.p074ss.bytertc.engine.data.VideoFrameInfo;
import com.p074ss.bytertc.engine.data.VideoPixelFormat;
import com.p074ss.bytertc.engine.data.VideoRotation;
import com.p074ss.bytertc.engine.data.VideoSourceType;
import com.p074ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.p074ss.bytertc.engine.handler.IRTCEngineEventHandlerEx;
import com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.p074ss.bytertc.engine.handler.IRTCRoomEventHandlerEx;
import com.p074ss.bytertc.engine.live.MixedStreamAudioConfig;
import com.p074ss.bytertc.engine.live.MixedStreamAudioProfile;
import com.p074ss.bytertc.engine.live.MixedStreamConfig;
import com.p074ss.bytertc.engine.live.MixedStreamLayoutRegionConfig;
import com.p074ss.bytertc.engine.live.MixedStreamLayoutRegionType;
import com.p074ss.bytertc.engine.live.MixedStreamMediaType;
import com.p074ss.bytertc.engine.live.MixedStreamPushTargetConfig;
import com.p074ss.bytertc.engine.live.MixedStreamPushTargetType;
import com.p074ss.bytertc.engine.live.MixedStreamRenderMode;
import com.p074ss.bytertc.engine.live.MixedStreamTaskErrorCode;
import com.p074ss.bytertc.engine.live.MixedStreamTaskEvent;
import com.p074ss.bytertc.engine.live.MixedStreamTaskInfo;
import com.p074ss.bytertc.engine.live.MixedStreamVideoCodecType;
import com.p074ss.bytertc.engine.live.MixedStreamVideoConfig;
import com.p074ss.bytertc.engine.type.AudioDeviceType;
import com.p074ss.bytertc.engine.type.AudioProfileType;
import com.p074ss.bytertc.engine.type.AudioScenarioType;
import com.p074ss.bytertc.engine.type.ChannelProfile;
import com.p074ss.bytertc.engine.type.LocalStreamStats;
import com.p074ss.bytertc.engine.type.LocalVideoStreamError;
import com.p074ss.bytertc.engine.type.LocalVideoStreamState;
import com.p074ss.bytertc.engine.type.MediaStreamType;
import com.p074ss.bytertc.engine.type.NetworkQualityStats;
import com.p074ss.bytertc.engine.type.RTCRoomStats;
import com.p074ss.bytertc.engine.type.RemoteAudioStats;
import com.p074ss.bytertc.engine.type.RemoteStreamStats;
import com.p074ss.bytertc.engine.type.RemoteVideoState;
import com.p074ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.p074ss.bytertc.engine.type.RemoteVideoStats;
import com.p074ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.p074ss.bytertc.engine.type.StreamRemoveReason;
import com.p074ss.bytertc.engine.type.SubtitleErrorCode;
import com.p074ss.bytertc.engine.type.SubtitleMessage;
import com.p074ss.bytertc.engine.type.SubtitleMode;
import com.p074ss.bytertc.engine.type.SubtitleState;
import com.p074ss.bytertc.engine.type.VoiceChangerType;
import com.p074ss.bytertc.engine.type.VoiceReverbType;
import com.p074ss.bytertc.engine.utils.IAudioFrame;
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
public class xmp0 extends MediaBaseCodecFilter implements dpl, wyl, o410.InterfaceC19026f {

    /* JADX INFO: renamed from: k3 */
    private static final float[] f195115k3 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A1 */
    private xpw f195116A1;

    /* JADX INFO: renamed from: A2 */
    private long f195117A2;

    /* JADX INFO: renamed from: B1 */
    private xpw f195118B1;

    /* JADX INFO: renamed from: B2 */
    private long f195119B2;

    /* JADX INFO: renamed from: C1 */
    private imw f195120C1;

    /* JADX INFO: renamed from: C2 */
    private long f195121C2;

    /* JADX INFO: renamed from: D1 */
    private tpw f195122D1;

    /* JADX INFO: renamed from: D2 */
    private int f195123D2;

    /* JADX INFO: renamed from: E0 */
    private long f195124E0;

    /* JADX INFO: renamed from: E1 */
    private boolean f195125E1;

    /* JADX INFO: renamed from: E2 */
    private Handler f195126E2;

    /* JADX INFO: renamed from: F0 */
    private int f195127F0;

    /* JADX INFO: renamed from: F1 */
    private boolean f195128F1;

    /* JADX INFO: renamed from: F2 */
    private boolean f195129F2;

    /* JADX INFO: renamed from: G0 */
    private long f195130G0;

    /* JADX INFO: renamed from: G1 */
    private boolean f195131G1;

    /* JADX INFO: renamed from: G2 */
    private int f195132G2;

    /* JADX INFO: renamed from: H0 */
    private PipelineConcurrentHashMap<Long, iny> f195133H0;

    /* JADX INFO: renamed from: H1 */
    private boolean f195134H1;

    /* JADX INFO: renamed from: H2 */
    private int f195135H2;

    /* JADX INFO: renamed from: I0 */
    private PipelineConcurrentHashMap<Long, xhy> f195136I0;

    /* JADX INFO: renamed from: I1 */
    private long f195137I1;

    /* JADX INFO: renamed from: I2 */
    public final int f195138I2;

    /* JADX INFO: renamed from: J0 */
    private int f195139J0;

    /* JADX INFO: renamed from: J1 */
    private MRtcRealLayoutNotifyHander f195140J1;

    /* JADX INFO: renamed from: J2 */
    public final int f195141J2;

    /* JADX INFO: renamed from: K0 */
    private int f195142K0;

    /* JADX INFO: renamed from: K1 */
    private boolean f195143K1;

    /* JADX INFO: renamed from: K2 */
    private boolean f195144K2;

    /* JADX INFO: renamed from: L0 */
    private String f195145L0;

    /* JADX INFO: renamed from: L1 */
    private long f195146L1;

    /* JADX INFO: renamed from: L2 */
    private String f195147L2;

    /* JADX INFO: renamed from: M0 */
    private dpl.InterfaceC16599a f195148M0;

    /* JADX INFO: renamed from: M1 */
    private long f195149M1;

    /* JADX INFO: renamed from: M2 */
    private f5m f195150M2;

    /* JADX INFO: renamed from: N0 */
    private boolean f195151N0;

    /* JADX INFO: renamed from: N1 */
    MRtcReceiveSeiHandler f195152N1;

    /* JADX INFO: renamed from: N2 */
    private inw f195153N2;

    /* JADX INFO: renamed from: O0 */
    private boolean f195154O0;

    /* JADX INFO: renamed from: O1 */
    private MRtcExitRoomHandler f195155O1;

    /* JADX INFO: renamed from: O2 */
    private int f195156O2;

    /* JADX INFO: renamed from: P0 */
    private q210.InterfaceC19500a f195157P0;

    /* JADX INFO: renamed from: P1 */
    private kod0 f195158P1;

    /* JADX INFO: renamed from: P2 */
    IRTCEngineEventHandlerEx f195159P2;

    /* JADX INFO: renamed from: Q0 */
    private float f195160Q0;

    /* JADX INFO: renamed from: Q1 */
    private int f195161Q1;

    /* JADX INFO: renamed from: Q2 */
    IRTCEngineEventHandler f195162Q2;

    /* JADX INFO: renamed from: R0 */
    private float f195163R0;

    /* JADX INFO: renamed from: R1 */
    private long f195164R1;

    /* JADX INFO: renamed from: R2 */
    private IRTCRoomEventHandlerEx f195165R2;

    /* JADX INFO: renamed from: S */
    private final String f195166S;

    /* JADX INFO: renamed from: S0 */
    public int f195167S0;

    /* JADX INFO: renamed from: S1 */
    private Runnable f195168S1;

    /* JADX INFO: renamed from: S2 */
    private IRTCRoomEventHandler f195169S2;

    /* JADX INFO: renamed from: T */
    private boolean f195170T;

    /* JADX INFO: renamed from: T0 */
    private int f195171T0;

    /* JADX INFO: renamed from: T1 */
    private int f195172T1;

    /* JADX INFO: renamed from: T2 */
    private int f195173T2;

    /* JADX INFO: renamed from: U */
    private int f195174U;

    /* JADX INFO: renamed from: U0 */
    private int f195175U0;

    /* JADX INFO: renamed from: U1 */
    RTCEngineEx f195176U1;

    /* JADX INFO: renamed from: U2 */
    private int f195177U2;

    /* JADX INFO: renamed from: V */
    private EGLContext f195178V;

    /* JADX INFO: renamed from: V0 */
    private int f195179V0;

    /* JADX INFO: renamed from: V1 */
    RTCRoomEx f195180V1;

    /* JADX INFO: renamed from: V2 */
    private FileOutputStream f195181V2;

    /* JADX INFO: renamed from: W */
    private boolean f195182W;

    /* JADX INFO: renamed from: W0 */
    private ror f195183W0;

    /* JADX INFO: renamed from: W1 */
    private int f195184W1;

    /* JADX INFO: renamed from: W2 */
    private IAudioFrameProcessor f195185W2;

    /* JADX INFO: renamed from: X */
    private boolean f195186X;

    /* JADX INFO: renamed from: X0 */
    protected int f195187X0;

    /* JADX INFO: renamed from: X1 */
    private volatile boolean f195188X1;

    /* JADX INFO: renamed from: X2 */
    private IAudioFrameObserver f195189X2;

    /* JADX INFO: renamed from: Y */
    private boolean f195190Y;

    /* JADX INFO: renamed from: Y0 */
    private String f195191Y0;

    /* JADX INFO: renamed from: Y1 */
    MixedStreamConfig f195192Y1;

    /* JADX INFO: renamed from: Y2 */
    private volatile boolean f195193Y2;

    /* JADX INFO: renamed from: Z */
    private String f195194Z;

    /* JADX INFO: renamed from: Z0 */
    private Object f195195Z0;

    /* JADX INFO: renamed from: Z1 */
    MixedStreamPushTargetConfig f195196Z1;

    /* JADX INFO: renamed from: Z2 */
    private boolean f195197Z2;

    /* JADX INFO: renamed from: a1 */
    private int f195198a1;

    /* JADX INFO: renamed from: a2 */
    private boolean f195199a2;

    /* JADX INFO: renamed from: a3 */
    private long f195200a3;

    /* JADX INFO: renamed from: b1 */
    private boolean f195201b1;

    /* JADX INFO: renamed from: b2 */
    private boolean f195202b2;

    /* JADX INFO: renamed from: b3 */
    private boolean f195203b3;

    /* JADX INFO: renamed from: c1 */
    private boolean f195204c1;

    /* JADX INFO: renamed from: c2 */
    private boolean f195205c2;

    /* JADX INFO: renamed from: c3 */
    private int f195206c3;

    /* JADX INFO: renamed from: d1 */
    private Object f195207d1;

    /* JADX INFO: renamed from: d2 */
    private boolean f195208d2;

    /* JADX INFO: renamed from: d3 */
    IMediaPlayerEventHandler f195209d3;

    /* JADX INFO: renamed from: e1 */
    private PipelineConcurrentHashMap f195210e1;

    /* JADX INFO: renamed from: e2 */
    private boolean f195211e2;

    /* JADX INFO: renamed from: e3 */
    private int f195212e3;

    /* JADX INFO: renamed from: f1 */
    private volatile boolean f195213f1;

    /* JADX INFO: renamed from: f2 */
    Timer f195214f2;

    /* JADX INFO: renamed from: f3 */
    private volatile boolean f195215f3;

    /* JADX INFO: renamed from: g1 */
    private String f195216g1;

    /* JADX INFO: renamed from: g2 */
    private boolean f195217g2;

    /* JADX INFO: renamed from: g3 */
    private boolean f195218g3;

    /* JADX INFO: renamed from: h1 */
    private String f195219h1;

    /* JADX INFO: renamed from: h2 */
    private String f195220h2;

    /* JADX INFO: renamed from: h3 */
    private MRtcPusherHandler f195221h3;

    /* JADX INFO: renamed from: i1 */
    public SurfaceTexture f195222i1;

    /* JADX INFO: renamed from: i2 */
    private String f195223i2;

    /* JADX INFO: renamed from: i3 */
    private String f195224i3;

    /* JADX INFO: renamed from: j1 */
    private CongressUtil f195225j1;

    /* JADX INFO: renamed from: j2 */
    private int f195226j2;

    /* JADX INFO: renamed from: j3 */
    private boolean f195227j3;

    /* JADX INFO: renamed from: k0 */
    private g510 f195228k0;

    /* JADX INFO: renamed from: k1 */
    private pcmDataAvailableCallback f195229k1;

    /* JADX INFO: renamed from: k2 */
    private boolean f195230k2;

    /* JADX INFO: renamed from: l1 */
    private int f195231l1;

    /* JADX INFO: renamed from: l2 */
    private boolean f195232l2;

    /* JADX INFO: renamed from: m1 */
    private int f195233m1;

    /* JADX INFO: renamed from: m2 */
    private int f195234m2;

    /* JADX INFO: renamed from: n1 */
    private int f195235n1;

    /* JADX INFO: renamed from: n2 */
    private int f195236n2;

    /* JADX INFO: renamed from: o1 */
    private int f195237o1;

    /* JADX INFO: renamed from: o2 */
    private PipelineConcurrentHashMap f195238o2;

    /* JADX INFO: renamed from: p0 */
    private dc1 f195239p0;

    /* JADX INFO: renamed from: p1 */
    private String f195240p1;

    /* JADX INFO: renamed from: p2 */
    private ArrayList<String> f195241p2;

    /* JADX INFO: renamed from: q1 */
    private boolean f195242q1;

    /* JADX INFO: renamed from: q2 */
    private ebl0 f195243q2;

    /* JADX INFO: renamed from: r1 */
    private MRtcAudioHandler f195244r1;

    /* JADX INFO: renamed from: r2 */
    private fbl0 f195245r2;

    /* JADX INFO: renamed from: s1 */
    private MRtcAudioHandlerEx f195246s1;

    /* JADX INFO: renamed from: s2 */
    private gkl0 f195247s2;

    /* JADX INFO: renamed from: t1 */
    private MRtcEventHandler f195248t1;

    /* JADX INFO: renamed from: t2 */
    private gbl0 f195249t2;

    /* JADX INFO: renamed from: u1 */
    private MRtcChannelHandler f195250u1;

    /* JADX INFO: renamed from: u2 */
    private RemoteAudioPropertiesInfo[] f195251u2;

    /* JADX INFO: renamed from: v1 */
    private MRtcTokenWillExpireHander f195252v1;

    /* JADX INFO: renamed from: v2 */
    private RTCRoomStats f195253v2;

    /* JADX INFO: renamed from: w1 */
    private wpw f195254w1;

    /* JADX INFO: renamed from: w2 */
    private volatile int f195255w2;

    /* JADX INFO: renamed from: x1 */
    private MRtcQualityHandler f195256x1;

    /* JADX INFO: renamed from: x2 */
    private AudioProfileType f195257x2;

    /* JADX INFO: renamed from: y1 */
    private MRtcConnectHandler f195258y1;

    /* JADX INFO: renamed from: y2 */
    private AudioScenarioType f195259y2;

    /* JADX INFO: renamed from: z1 */
    private MRtcClientRoleChangedHandler f195260z1;

    /* JADX INFO: renamed from: z2 */
    Runnable f195261z2;

    /* JADX INFO: renamed from: l.xmp0$b */
    public class RunnableC21376b implements Runnable {
        public RunnableC21376b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xmp0.this.mo20661f();
        }
    }

    /* JADX INFO: renamed from: l.xmp0$c */
    public static /* synthetic */ class C21377c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f195264a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f195265b;

        static {
            int[] iArr = new int[AudioProfileType.values().length];
            f195265b = iArr;
            try {
                iArr[AudioProfileType.AUDIO_PROFILE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f195265b[AudioProfileType.AUDIO_PROFILE_FLUENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f195265b[AudioProfileType.AUDIO_PROFILE_STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f195265b[AudioProfileType.AUDIO_PROFILE_HD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f195265b[AudioProfileType.AUDIO_PROFILE_STANDARD_STEREO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f195265b[AudioProfileType.AUDIO_PROFILE_HD_MONO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[ForwardStreamStateInfo.ForwardStreamState.values().length];
            f195264a = iArr2;
            try {
                iArr2[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f195264a[ForwardStreamStateInfo.ForwardStreamState.FORWARD_STREAM_STATE_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: l.xmp0$d */
    public class C21378d extends IRTCEngineEventHandlerEx {
        public C21378d() {
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandlerEx
        public void onLocalStreamStats(StreamIndex streamIndex, LocalStreamStats localStreamStats) {
            super.onLocalStreamStats(streamIndex, localStreamStats);
            if (streamIndex == StreamIndex.STREAM_INDEX_MAIN && localStreamStats != null) {
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191068g = ((MediaBaseCodecFilter) xmp0.this).f15000s.f180163H0 ? 2L : 0L;
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191012H = localStreamStats.videoStats.encodedFrameCount;
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191030Q = localStreamStats.videoStats.encoderOutputFrameRate;
            }
            xmp0.m211897o4(xmp0.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandlerEx
        public void onRemoteStreamStats(StreamKey streamKey, RemoteStreamStats remoteStreamStats) {
            iny inyVar;
            super.onRemoteStreamStats(streamKey, remoteStreamStats);
            if (streamKey.getStreamIndex() != StreamIndex.STREAM_INDEX_MAIN) {
                if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_3RD) {
                    xmp0.m211897o4(xmp0.this);
                    return;
                }
                return;
            }
            if (remoteStreamStats == null || (inyVar = (iny) xmp0.this.f195133H0.get(Long.valueOf(remoteStreamStats.uid))) == null) {
                return;
            }
            RemoteAudioStats remoteAudioStats = remoteStreamStats.audioStats;
            if (remoteAudioStats != null) {
                float f = remoteAudioStats.receivedKBitrate;
                inyVar.f116023a = (long) f;
                int i = inyVar.f116042t;
                int i2 = remoteAudioStats.concealmentEvent;
                inyVar.f116042t = i + i2;
                inyVar.f116043u += i2;
                float f2 = inyVar.f116048z;
                float f3 = remoteAudioStats.audioLossRate;
                inyVar.f116048z = (int) (f2 + (10.0f * f3));
                inyVar.f116012A = inyVar.f116012A;
                inyVar.f116033k = ((int) f3) * 100;
                inyVar.f116032j = (int) (((long) inyVar.f116032j) + remoteAudioStats.e2eDelay);
                inyVar.f116013B++;
                inyVar.f116028f += (long) ((((int) f) / 8) * 2000);
                inyVar.f116017F += remoteAudioStats.stallDuration;
            }
            RemoteVideoStats remoteVideoStats = remoteStreamStats.videoStats;
            if (remoteVideoStats != null) {
                inyVar.m141184k((int) remoteVideoStats.receivedKBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
                RemoteVideoStats remoteVideoStats2 = remoteStreamStats.videoStats;
                inyVar.f116035m = ((int) remoteVideoStats2.videoLossRate) * 100;
                inyVar.f116027e += (long) ((((int) remoteVideoStats2.receivedKBitrate) / 8) * 2000);
                inyVar.f116025c += (long) remoteVideoStats2.decoderOutputFrameRate;
                inyVar.f116014C++;
                inyVar.f116034l = (int) remoteVideoStats2.e2eDelay;
                inyVar.f116018G += remoteVideoStats2.stallDuration;
            }
        }
    }

    /* JADX INFO: renamed from: l.xmp0$e */
    public class C21379e extends IRTCEngineEventHandler {

        /* JADX INFO: renamed from: l.xmp0$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ long f195268a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ RemoteStreamKey f195269b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ int f195270c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f195271d;

            /* JADX INFO: renamed from: l.xmp0$e$a$a, reason: collision with other inner class name */
            public class SurfaceHolderCallbackC22845a implements SurfaceHolder.Callback {
                public SurfaceHolderCallbackC22845a() {
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("surfaceChanged", "uid:" + a.this.f195268a + "w:" + i2 + ",h:" + i3);
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("surfaceCreated", "uid:" + a.this.f195268a);
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("surfaceDestroyed", "uid:" + a.this.f195268a);
                }
            }

            public a(long j, RemoteStreamKey remoteStreamKey, int i, int i2) {
                this.f195268a = j;
                this.f195269b = remoteStreamKey;
                this.f195270c = i;
                this.f195271d = i2;
            }

            @Override // java.lang.Runnable
            @RequiresApi(api = 15)
            public void run() {
                RTCEngineEx rTCEngineEx;
                ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onFirstRemoteVideoFrameDecoded", "mIsAttachedMode:" + xmp0.this.f195125E1 + ",mVideoTextureListener is" + xmp0.this.f195247s2 + ",isUseTextureView" + xmp0.this.f195183W0.f180181Z0);
                if (xmp0.this.f195125E1 || xmp0.this.f195247s2 != null || xmp0.this.f195183W0.f180181Z0) {
                    if (xmp0.this.f195183W0.f180181Z0) {
                        ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("useTextureView", "width:" + xmp0.this.width + ",height:" + xmp0.this.height);
                        TextureView textureView = new TextureView(xmp0.this.m20725W1());
                        VideoCanvas videoCanvas = new VideoCanvas();
                        String userId = this.f195269b.getUserId();
                        videoCanvas.renderView = textureView;
                        videoCanvas.renderMode = 1;
                        RemoteStreamKey remoteStreamKey = new RemoteStreamKey(xmp0.this.f195183W0.f164226g1, userId, StreamIndex.STREAM_INDEX_MAIN);
                        if (xmp0.this.f195249t2 == null || (rTCEngineEx = xmp0.this.f195176U1) == null) {
                            return;
                        }
                        rTCEngineEx.setRemoteVideoCanvas(remoteStreamKey, videoCanvas);
                        xmp0.this.f195238o2.put(userId, textureView);
                        ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onVideoChannelAdded use textureView");
                        xmp0.this.f195249t2.mo20121a(Integer.valueOf(userId).intValue(), textureView, xmp0.this.width, xmp0.this.height);
                        return;
                    }
                    return;
                }
                SurfaceView surfaceView = new SurfaceView(xmp0.this.m20725W1());
                surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC22845a());
                VideoCanvas videoCanvas2 = new VideoCanvas();
                String userId2 = this.f195269b.getUserId();
                videoCanvas2.renderView = surfaceView;
                videoCanvas2.renderMode = 1;
                ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onFirstRemoteVideoFrameDecoded", "roomid:" + xmp0.this.f195183W0.f164226g1 + ",rtcEngine is" + xmp0.this.f195176U1);
                RemoteStreamKey remoteStreamKey2 = new RemoteStreamKey(xmp0.this.f195183W0.f164226g1, userId2, StreamIndex.STREAM_INDEX_MAIN);
                RTCEngineEx rTCEngineEx2 = xmp0.this.f195176U1;
                if (rTCEngineEx2 != null) {
                    rTCEngineEx2.setRemoteVideoCanvas(remoteStreamKey2, videoCanvas2);
                    xmp0.this.f195241p2.add(userId2);
                    if (xmp0.this.f195243q2 != null) {
                        xmp0.this.f195243q2.mo20117a(Integer.valueOf(userId2).intValue(), surfaceView, this.f195270c, this.f195271d);
                    }
                }
            }
        }

        public C21379e() {
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
            super.onAudioDeviceStateChanged(str, audioDeviceType, i, i2);
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onAudioDeviceStateChanged", "device_type:" + audioDeviceType + ",error:" + i2);
            AudioDeviceType audioDeviceType2 = AudioDeviceType.AUDIO_DEVICE_TYPE_UNKNOWN;
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onAudioMixingPlayingProgress(int i, long j) {
            super.onAudioMixingPlayingProgress(i, j);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004d A[PHI: r0
          0x004d: PHI (r0v3 int) = (r0v2 int), (r0v8 int), (r0v9 int), (r0v10 int), (r0v10 int), (r0v10 int), (r0v11 int), (r0v11 int) binds: [B:3:0x0029, B:5:0x002c, B:7:0x002f, B:24:0x0088, B:26:0x0090, B:27:0x0092, B:16:0x0042, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onConnectionStateChanged(int i, int i2) {
            super.onConnectionStateChanged(i, i2);
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onConnectionStateChanged", "state:" + i + ",reason:" + i2);
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
                                if (xmp0.this.f195126E2 != null) {
                                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onConnectionStateChanged", "CONNECTION_STATE_RECONNECTED");
                                    xmp0.this.f195126E2.removeCallbacks(xmp0.this.f195168S1);
                                    xmp0.this.f195123D2 = 0;
                                    xmp0.m211897o4(xmp0.this);
                                }
                                i = 6;
                            } else if (i == 7) {
                                if (xmp0.this.f195258y1 != null) {
                                    xmp0.this.f195258y1.onReconnectTimeout();
                                }
                            }
                        } else if (xmp0.this.f195126E2 != null && !xmp0.this.f195144K2) {
                            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onConnectionStateChanged", "CONNECTION_STATE_RECONNECTING");
                            xmp0.this.f195126E2.post(xmp0.this.f195168S1);
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
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("volc onConnectionStateChanged callback", "state:" + i + ",reason:" + i2);
            if (xmp0.this.f195158P1 != null) {
                xmp0.this.f195158P1.mo20136h(i, i2);
            }
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onError(int i) {
            super.onError(i);
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("RTCVideo onError", "err:" + i);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
            super.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
            super.onFirstRemoteAudioFrame(remoteStreamKey);
            Long lValueOf = Long.valueOf(remoteStreamKey.getUserId());
            long jLongValue = lValueOf.longValue();
            xhy xhyVar = (xhy) xmp0.this.f195136I0.get(lValueOf);
            if (xhyVar == null || xhyVar.m211086e()) {
                return;
            }
            xhyVar.m211089h(true);
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122835b(xhyVar.m211084c(), jLongValue, xmp0.this.f195117A2, xhyVar.m211082a(), System.currentTimeMillis() - xhyVar.m211083b());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            super.onFirstRemoteVideoFrameDecoded(remoteStreamKey, videoFrameInfo);
            if (xmp0.this.m20725W1() == null) {
                ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onFirstRemoteVideoFrameDecoded", "context is null");
                return;
            }
            int width = videoFrameInfo.getWidth();
            int height = videoFrameInfo.getHeight();
            Long lValueOf = Long.valueOf(remoteStreamKey.getUserId());
            long jLongValue = lValueOf.longValue();
            xhy xhyVar = (xhy) xmp0.this.f195136I0.get(lValueOf);
            if (xhyVar != null && !xhyVar.m211085d()) {
                t9c.m189743a("zhengjijian", "agora get first idr");
                xhyVar.m211088g(true);
                ((MediaBaseCodecFilter) xmp0.this).f14988I.m122836c(true, xhyVar.m211084c(), jLongValue, xmp0.this.f195117A2, xhyVar.m211082a(), System.currentTimeMillis() - xhyVar.m211083b());
                xmp0.this.f195157P0.mo165950g(8198, (int) jLongValue, 0, xmp0.this);
            }
            if (xmp0.this.f195248t1 != null) {
                xmp0.this.f195248t1.onFirstRemoteVideoDecoded(jLongValue, width, height, 0);
                jLongValue = jLongValue;
            }
            xmp0.this.f195126E2.postAtFrontOfQueue(new a(jLongValue, remoteStreamKey, width, height));
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            super.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
            super.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
            int length = (xmp0.this.f195251u2 == null || xmp0.this.f195251u2.length == 0) ? 1 : xmp0.this.f195251u2.length + 1;
            AudioVolumeWeight[] audioVolumeWeightArr = new AudioVolumeWeight[length];
            int i = 0;
            audioVolumeWeightArr[0] = new AudioVolumeWeight();
            if (xmp0.this.f195232l2) {
                audioVolumeWeightArr[0].volume = 0.0f;
            } else {
                audioVolumeWeightArr[0].volume = (localAudioPropertiesInfoArr[0].audioPropertiesInfo.linearVolume * 1.0f) / 100.0f;
            }
            audioVolumeWeightArr[0].uid = xmp0.this.f195183W0.f180157B0;
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
                audioVolumeWeight2.uid = Integer.valueOf(xmp0.this.f195251u2[i].streamKey.getUserId()).intValue();
                audioVolumeWeight2.volume = (xmp0.this.f195251u2[i].audioPropertiesInfo.linearVolume * 1.0f) / 100.0f;
                audioVolumeWeight2.voicePitch = xmp0.this.f195251u2[i].audioPropertiesInfo.voicePitch;
                i++;
                audioVolumeWeightArr[i] = audioVolumeWeight2;
            }
            if (xmp0.this.f195244r1 != null) {
                xmp0.this.f195244r1.onAudioVolumeIndication(audioVolumeWeightArr, 100);
            }
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
            super.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
            super.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
            super.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLogReport(String str, JSONObject jSONObject) {
            super.onLogReport(str, jSONObject);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLoginResult(String str, int i, int i2) {
            super.onLoginResult(str, i, i2);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onLogout(int i) {
            super.onLogout(i);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onMixedStreamEvent(MixedStreamTaskInfo mixedStreamTaskInfo, MixedStreamTaskEvent mixedStreamTaskEvent, MixedStreamTaskErrorCode mixedStreamTaskErrorCode) {
            super.onMixedStreamEvent(mixedStreamTaskInfo, mixedStreamTaskEvent, mixedStreamTaskErrorCode);
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onMixedStreamEvent", "event:" + mixedStreamTaskEvent.value() + ",error:" + mixedStreamTaskErrorCode.value());
            if (mixedStreamTaskEvent == MixedStreamTaskEvent.START_SUCCESS) {
                xmp0.this.f195205c2 = true;
                xmp0 xmp0Var = xmp0.this;
                MixedStreamConfig mixedStreamConfig = xmp0Var.f195192Y1;
                MixedStreamLayoutRegionConfig[] mixedStreamLayoutRegionConfigArr = mixedStreamConfig.regions;
                int length = mixedStreamLayoutRegionConfigArr != null ? mixedStreamLayoutRegionConfigArr.length : 0;
                if (mixedStreamConfig != null && length > 0) {
                    RTCEngineEx rTCEngineEx = xmp0Var.f195176U1;
                    String str = xmp0Var.f195147L2;
                    xmp0 xmp0Var2 = xmp0.this;
                    rTCEngineEx.updatePushMixedStream(str, xmp0Var2.f195196Z1, xmp0Var2.f195192Y1);
                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onMixedStreamEvent", "rtmpState updateRtmpTranscoding regilen " + length);
                }
                if (!xmp0.this.f195197Z2) {
                    xmp0.this.f195197Z2 = true;
                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("notifyPublished", "onStreamMixingEvent  notifyPublished");
                    xmp0.this.f195157P0.mo165950g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, xmp0.this);
                }
            } else if (mixedStreamTaskEvent == MixedStreamTaskEvent.START_FAILED && xmp0.this.f195158P1 != null) {
                xmp0.this.f195158P1.mo20143p("", mixedStreamTaskErrorCode.value());
            }
            if (xmp0.this.f195158P1 != null) {
                xmp0.this.f195158P1.mo20144q("", mixedStreamTaskEvent.value(), mixedStreamTaskErrorCode.value(), "volc", xmp0.this.f195183W0.f164226g1, xmp0.this.f195183W0.f180157B0);
            }
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onNetworkTimeSynchronized() {
            super.onNetworkTimeSynchronized();
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
            super.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
            if (xmp0.this.f195184W1 == 1) {
                xmp0.this.f195251u2 = remoteAudioPropertiesInfoArr;
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
            if (xmp0.this.f195244r1 != null) {
                xmp0.this.f195244r1.onAudioVolumeIndication(audioVolumeWeightArr, 100);
            }
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
            super.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
            super.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
            super.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
            super.onSEIMessageReceived(remoteStreamKey, byteBuffer);
            byte[] bArr = new byte[byteBuffer.limit()];
            byteBuffer.get(bArr);
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                if (jSONObject.has("bType")) {
                    int iOptInt = jSONObject.optInt("bType");
                    ((MediaBaseCodecFilter) xmp0.this).f14987H.f191104s = iOptInt;
                    xmp0.m211897o4(xmp0.this);
                    esx.m122399d("Pipeline_Normal_pip->PIPLINE->VOLC", "onReceiveSEI getbType: " + iOptInt);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
            super.onSEIStreamUpdate(remoteStreamKey, sEIStreamUpdateEvent);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCEngineEventHandler
        public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, StreamSyncInfoConfig.SyncInfoStreamType syncInfoStreamType, ByteBuffer byteBuffer) {
            super.onStreamSyncInfoReceived(remoteStreamKey, syncInfoStreamType, byteBuffer);
            xmp0.m211897o4(xmp0.this);
        }
    }

    /* JADX INFO: renamed from: l.xmp0$f */
    public class C21380f extends IRTCRoomEventHandlerEx {
        public C21380f() {
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCRoomEventHandlerEx
        public void onUserPublishStream(RemoteStreamKey remoteStreamKey, boolean z, MediaStreamType mediaStreamType) {
            super.onUserPublishStream(remoteStreamKey, z, mediaStreamType);
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onUserPublishStream", "uid:" + remoteStreamKey.userId + ",type:" + mediaStreamType);
            int iIntValue = Integer.valueOf(remoteStreamKey.userId).intValue();
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
                xmp0.this.m211881j7(iIntValue, false);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO) {
                xmp0.this.m211832V7(iIntValue, false);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH) {
                xmp0.this.m211881j7(iIntValue, false);
                xmp0.this.m211832V7(iIntValue, false);
            }
            xmp0.m211897o4(xmp0.this);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCRoomEventHandlerEx
        public void onUserUnpublishStream(RemoteStreamKey remoteStreamKey, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
            super.onUserUnpublishStream(remoteStreamKey, mediaStreamType, streamRemoveReason);
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onUserUnpublishStream", "uid:" + remoteStreamKey.userId + ",type:" + mediaStreamType + ", reason:" + streamRemoveReason.toString());
            int iIntValue = Integer.valueOf(remoteStreamKey.userId).intValue();
            if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
                xmp0.this.m211881j7(iIntValue, true);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO) {
                xmp0.this.m211832V7(iIntValue, true);
            } else if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH) {
                xmp0.this.m211832V7(iIntValue, true);
                xmp0.this.m211881j7(iIntValue, true);
            }
            xmp0.m211897o4(xmp0.this);
        }
    }

    /* JADX INFO: renamed from: l.xmp0$g */
    public class C21381g extends gjc0 {

        /* JADX INFO: renamed from: l.xmp0$g$a */
        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                boolean z = xmp0.this.f195227j3;
                C21381g c21381g = C21381g.this;
                if (z) {
                    if (TextUtils.isEmpty(xmp0.this.f195224i3)) {
                        return;
                    }
                    xmp0 xmp0Var = xmp0.this;
                    xmp0Var.mo20742k2(xmp0Var.f195224i3);
                    return;
                }
                if (TextUtils.isEmpty(xmp0.this.f195216g1)) {
                    return;
                }
                xmp0 xmp0Var2 = xmp0.this;
                xmp0Var2.mo20742k2(xmp0Var2.f195216g1);
            }
        }

        /* JADX INFO: renamed from: l.xmp0$g$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ long f195277a;

            public b(long j) {
                this.f195277a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (xmp0.this.f195243q2 != null) {
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + "----onVideoChannelAdded Audio: userID=" + this.f195277a);
                    xmp0.this.f195243q2.mo20117a((long) ((int) this.f195277a), null, 176, 176);
                }
            }
        }

        public C21381g() {
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onAudioSubscribeStateChanged(String str, String str2, SubscribeState subscribeState, SubscribeStateChangeReason subscribeStateChangeReason) {
            super.onAudioSubscribeStateChanged(str, str2, subscribeState, subscribeStateChangeReason);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onForwardStreamEvent", "eventInfos:" + forwardStreamEventInfoArr[0].event);
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onForwardStreamStateChanged", "stateInfo:" + forwardStreamStateInfoArr[0].state);
            if (forwardStreamStateInfoArr.length == 0) {
                return;
            }
            int i = C21377c.f195264a[forwardStreamStateInfoArr[0].state.ordinal()];
            if (i == 1) {
                if (xmp0.this.f195158P1 != null) {
                    xmp0.this.f195158P1.mo20134f(0L, 1, "connect_success");
                }
            } else {
                if (i != 2) {
                    return;
                }
                if (xmp0.this.f195158P1 != null) {
                    xmp0.this.f195158P1.mo20134f(0L, 3, "connect_failed,code:" + forwardStreamStateInfoArr[0].error.value());
                }
                b7y.m102882c().m102886e("ConnectOtherRoom", "volc", forwardStreamStateInfoArr[0].error.value(), "strartForwardStreamToRoom failed", LogLevel.FATAL.value());
                xmp0.this.f195129F2 = false;
            }
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("volc onLeaveRoom");
            if (rTCRoomStats != null) {
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191000B = rTCRoomStats.txBytes;
            }
            if (xmp0.this.f195155O1 != null) {
                xmp0.this.f195155O1.onExitRoom();
            }
            if (xmp0.this.f195136I0 == null || xmp0.this.f195136I0.isEmpty()) {
                return;
            }
            Log.e("lqdebug", "onLeaveRoom");
            t9c.m189743a("lqdebug", "stopRecord memberInfoMap " + xmp0.this.f195136I0.size());
            xmp0.this.f195136I0.clear();
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onLocalStreamStats(LocalStreamStats localStreamStats) {
            if (localStreamStats != null) {
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191068g = ((MediaBaseCodecFilter) xmp0.this).f15000s.f180163H0 ? 2L : 0L;
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191012H = localStreamStats.videoStats.encodedFrameCount;
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191030Q = localStreamStats.videoStats.encoderOutputFrameRate;
            }
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
            super.onNetworkQuality(networkQualityStats, networkQualityStatsArr);
            if (networkQualityStats != null) {
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191099q0 = networkQualityStats.txQuality;
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191102r0 = networkQualityStats.rxQuality;
            }
            try {
                if (xmp0.this.f195158P1 == null || networkQualityStats == null) {
                    return;
                }
                xmp0.this.f195158P1.mo20139l(Integer.parseInt(networkQualityStats.uid), networkQualityStats.txQuality, networkQualityStats.rxQuality);
            } catch (Exception unused) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
            iny inyVar;
            if (remoteStreamStats == null || (inyVar = (iny) xmp0.this.f195133H0.get(Long.valueOf(remoteStreamStats.uid))) == null) {
                return;
            }
            RemoteAudioStats remoteAudioStats = remoteStreamStats.audioStats;
            if (remoteAudioStats != null) {
                float f = remoteAudioStats.receivedKBitrate;
                inyVar.f116023a = (long) f;
                int i = inyVar.f116042t;
                int i2 = remoteAudioStats.concealmentEvent;
                inyVar.f116042t = i + i2;
                inyVar.f116043u += i2;
                float f2 = inyVar.f116048z;
                float f3 = remoteAudioStats.audioLossRate;
                inyVar.f116048z = (int) (f2 + (10.0f * f3));
                inyVar.f116012A = inyVar.f116012A;
                inyVar.f116033k = ((int) f3) * 100;
                inyVar.f116032j = (int) (((long) inyVar.f116032j) + remoteAudioStats.e2eDelay);
                inyVar.f116013B++;
                inyVar.f116028f += (long) ((((int) f) / 8) * 2000);
                inyVar.f116017F += remoteAudioStats.stallDuration;
            }
            RemoteVideoStats remoteVideoStats = remoteStreamStats.videoStats;
            if (remoteVideoStats != null) {
                inyVar.m141184k((int) remoteVideoStats.receivedKBitrate, remoteVideoStats.rendererOutputFrameRate, remoteVideoStats.width, remoteVideoStats.height);
                RemoteVideoStats remoteVideoStats2 = remoteStreamStats.videoStats;
                inyVar.f116035m = ((int) remoteVideoStats2.videoLossRate) * 100;
                inyVar.f116027e += (long) ((((int) remoteVideoStats2.receivedKBitrate) / 8) * 2000);
                inyVar.f116025c += (long) remoteVideoStats2.decoderOutputFrameRate;
                inyVar.f116014C++;
                inyVar.f116034l = (int) remoteVideoStats2.e2eDelay;
                inyVar.f116018G += remoteVideoStats2.stallDuration;
            }
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
            super.onRoomBinaryMessageReceived(str, byteBuffer);
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomMessageReceived(String str, String str2) {
            super.onRoomMessageReceived(str, str2);
            if (xmp0.this.f195250u1 != null) {
                xmp0.this.f195250u1.onStreamMessage(Integer.valueOf(str).intValue(), 0, str2.getBytes());
            }
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomMessageSendResult(long j, int i) {
            super.onRoomMessageSendResult(j, i);
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomStateChanged(String str, String str2, int i, String str3) {
            int i2;
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onRoomStateChanged", "roomId:" + str + ",enterRoomState:" + i + ", host：" + xmp0.this.f195183W0.f164227h1);
            xmp0 xmp0Var = xmp0.this;
            if (i != 0) {
                ((MediaBaseCodecFilter) xmp0Var).f14988I.m122843l("onRoomStateChanged", "进房失败:roomState:" + i);
                if (xmp0.this.f195157P0 != null) {
                    if (i != -1084 && i != -1010 && i != -1009 && i != -1007) {
                        if (i == -1006) {
                            ((MediaBaseCodecFilter) xmp0.this).f14987H.f191117y0 = 814L;
                            ((MediaBaseCodecFilter) xmp0.this).f14987H.f191081k0 = i;
                            if (xmp0.this.f195158P1 != null) {
                                xmp0.this.f195158P1.mo20135g(i);
                                return;
                            }
                            return;
                        }
                        if (i != -1001 && i != -1000) {
                            return;
                        }
                    }
                    int iM102289a = b3f.m102289a(i);
                    ((MediaBaseCodecFilter) xmp0.this).f14987H.f191117y0 = iM102289a;
                    ((MediaBaseCodecFilter) xmp0.this).f14987H.f191081k0 = i;
                    xmp0.this.f195157P0.mo165950g(4352, iM102289a, 0, xmp0.this);
                    return;
                }
                return;
            }
            ((MediaBaseCodecFilter) xmp0Var).f14989J = MomoCodec.MomoCodecState.START;
            ((MediaBaseCodecFilter) xmp0.this).f14987H.f191053b = true;
            if (xmp0.this.f195183W0.f164227h1) {
                int i3 = xmp0.this.f195237o1;
                xmp0 xmp0Var2 = xmp0.this;
                if (i3 > 0) {
                    i2 = xmp0Var2.f195237o1;
                } else {
                    i2 = xmp0Var2.f195183W0.f180174S0 != 0 ? xmp0.this.f195183W0.f180174S0 : 15;
                }
                int i4 = i2;
                xmp0 xmp0Var3 = xmp0.this;
                xmp0Var3.m211854b6(xmp0Var3.f195183W0.f164227h1, xmp0.this.f195183W0.f175490k, xmp0.this.f195183W0.f175492l, xmp0.this.f195235n1, i4, xmp0.this.f195183W0.f180187v0, str2);
                if (xmp0.this.f195183W0.f164227h1 && !xmp0.this.f195199a2 && !TextUtils.isEmpty(xmp0.this.f195183W0.f180187v0)) {
                    xmp0 xmp0Var4 = xmp0.this;
                    xmp0Var4.m211786H7(xmp0Var4.f195183W0.f180187v0);
                }
                xmp0 xmp0Var5 = xmp0.this;
                if (xmp0Var5.f195214f2 == null) {
                    xmp0Var5.f195214f2 = new Timer();
                    xmp0.this.f195214f2.schedule(new a(), 100L, 1000L);
                }
            }
            if ((xmp0.this.f195204c1 || xmp0.this.f195201b1) && xmp0.this.f195231l1 != 0) {
                xmp0.this.m211802M6();
            }
            if (xmp0.this.f195217g2) {
                xmp0 xmp0Var6 = xmp0.this;
                xmp0Var6.m211877i8(xmp0Var6.f195223i2, xmp0.this.f195220h2);
                xmp0.this.f195217g2 = false;
            }
            try {
                if (new JSONObject(str3).getInt("join_type") == 0) {
                    if (xmp0.this.f195248t1 != null) {
                        xmp0.this.f195248t1.onJoinChannelSuccess(str, xmp0.this.f195183W0.f180157B0, 0);
                    }
                    xmp0.this.f195121C2 = System.currentTimeMillis();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            xmp0.this.f195188X1 = true;
            xmp0.this.f195157P0.mo165950g(8192, 0, 0, xmp0.this);
            xmp0.this.mo20731c2();
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onRoomStats(RTCRoomStats rTCRoomStats) {
            super.onRoomStats(rTCRoomStats);
            xmp0.this.f195253v2 = rTCRoomStats;
            if (rTCRoomStats != null) {
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191000B += xmp0.this.f195253v2.txBytes;
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191026O = xmp0.this.f195253v2.txAudioKBitRate;
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191077j += xmp0.this.f195253v2.rxBytes;
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191080k += (long) ((xmp0.this.f195253v2.rxVideoKBitRate * 2000) / 8);
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191083l += (long) ((xmp0.this.f195253v2.rxAudioKBitRate * 2000) / 8);
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191017J0 += (long) ((xmp0.this.f195253v2.txVideoKBitRate * 2000) / 8);
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191015I0 += (long) ((xmp0.this.f195253v2.txAudioKBitRate * 2000) / 8);
                xmp0.this.f195124E0 += (long) ((xmp0.this.f195253v2.txVideoKBitRate * 2000) / 8);
                xmp0.this.f195130G0 += (long) ((xmp0.this.f195253v2.txAudioKBitRate * 2000) / 8);
                xmp0.this.f195127F0 += (xmp0.this.f195253v2.rxVideoKBitRate * 2000) / 8;
            }
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onSubtitleMessageReceived(SubtitleMessage[] subtitleMessageArr) {
            super.onSubtitleMessageReceived(subtitleMessageArr);
            if (xmp0.this.f195150M2 == null) {
                return;
            }
            if (subtitleMessageArr == null) {
                xmp0.this.f195150M2.mo20148b(null);
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
                    inw inwVar = xmp0.this.f195153N2;
                    xmp0 xmp0Var = xmp0.this;
                    if (inwVar == null) {
                        xmp0Var.f195153N2 = new inw(str, str2, str3, mMLiveSubtitleModeFromId, i, z);
                    } else {
                        xmp0Var.f195153N2.f116005a = str;
                        xmp0.this.f195153N2.f116006b = str2;
                        xmp0.this.f195153N2.f116007c = str3;
                        xmp0.this.f195153N2.f116008d = mMLiveSubtitleModeFromId;
                        xmp0.this.f195153N2.f116009e = i;
                        xmp0.this.f195153N2.f116010f = z;
                    }
                    xmp0.this.f195150M2.mo20148b(xmp0.this.f195153N2);
                }
            }
        }

        @Override // com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onSubtitleStateChanged(SubtitleState subtitleState, SubtitleErrorCode subtitleErrorCode, String str) {
            super.onSubtitleStateChanged(subtitleState, subtitleErrorCode, str);
            b7y.m102882c().m102888g("onSubtitleStateChanged state：" + subtitleState + " error code：" + subtitleErrorCode + " error message：" + str);
            if (subtitleState == SubtitleState.SUBTITLE_STATE_STARTED) {
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191097p1 = 1;
            } else if (subtitleState == SubtitleState.SUBTITLE_STATE_STOPED) {
                ((MediaBaseCodecFilter) xmp0.this).f14987H.f191097p1 = 0;
            }
            if (xmp0.this.f195150M2 != null) {
                xmp0.this.f195150M2.mo20147a(MMLiveSubtitleState.fromId(subtitleState.value()), MMLiveSubtitleErrorCode.fromId(subtitleErrorCode.value()), str);
            }
            if (subtitleState == SubtitleState.SUBTITLE_STATE_ERROR) {
                b7y.m102882c().m102890i("volc", subtitleErrorCode.value(), str);
            }
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onTokenWillExpire() {
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onTokenWillExpire");
            if (xmp0.this.f195252v1 != null) {
                xmp0.this.f195252v1.onTokenPrivilegeWillExpire("");
            }
            if (xmp0.this.f195250u1 != null) {
                xmp0.this.f195250u1.onRequestChannelKey();
            }
        }

        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserJoined(UserInfo userInfo) {
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onUserJoined", "uid:" + userInfo.getUid());
            Long lValueOf = Long.valueOf(userInfo.getUid());
            long jLongValue = lValueOf.longValue();
            xhy xhyVar = new xhy(Long.valueOf(userInfo.getUid()).longValue(), p7f.LATITUDE_SOUTH.equals(xmp0.this.mo21051w1()) ? 1 : 2);
            xmp0.this.f195136I0.put(lValueOf, xhyVar);
            if (xmp0.this.f195121C2 != -1) {
                xhyVar.m211091j(System.currentTimeMillis());
                xhyVar.m211090i(System.currentTimeMillis() - xmp0.this.f195121C2);
            }
            if (((MediaBaseCodecFilter) xmp0.this).f14987H.f191058c1 == 1) {
                ((MediaBaseCodecFilter) xmp0.this).f14988I.m122838e(true, xhyVar.m211084c(), jLongValue, xmp0.this.f195117A2, xhyVar.m211082a());
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + " onUserJoined:uid:" + jLongValue);
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onUserJoined", "isAudioOnly:" + xmp0.this.f195204c1 + ",mIsAgnoreSET:" + xmp0.this.f195201b1);
            if ((xmp0.this.f195204c1 || xmp0.this.f195201b1) && xmp0.this.f195183W0.f164228i1 != jLongValue) {
                xhyVar.m211087f(true);
                xhyVar.m211088g(true);
                ((MediaBaseCodecFilter) xmp0.this).f14988I.m122836c(true, xhyVar.m211084c(), jLongValue, xmp0.this.f195117A2, xhyVar.m211082a(), -1L);
                xmp0.this.f195157P0.mo165950g(8198, (int) jLongValue, 0, xmp0.this);
                xmp0.this.f195126E2.post(new b(jLongValue));
            }
            xmp0.this.f195133H0.put(lValueOf, new iny(jLongValue));
            if (xmp0.this.f195248t1 != null) {
                xmp0.this.f195248t1.onJoinChannelSuccess("", jLongValue, 0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserLeave(String str, int i) {
            int i2 = i;
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onUserOffline uid:" + str + ",reason:" + i2);
            StringBuilder sb = new StringBuilder("onUserLeave,userid:");
            sb.append(str);
            Log.e("lqdebug", sb.toString());
            Long lValueOf = Long.valueOf(str);
            long jLongValue = lValueOf.longValue();
            long j = 0;
            if (xmp0.this.f195133H0 != null && xmp0.this.f195133H0.containsKey(lValueOf)) {
                iny inyVar = (iny) xmp0.this.f195133H0.get(lValueOf);
                j = inyVar != null ? inyVar.f116026d : 0L;
                xmp0.this.f195133H0.remove(lValueOf);
            }
            if (xmp0.this.f195136I0 != null && xmp0.this.f195136I0.containsKey(lValueOf)) {
                t9c.m189743a("zhengjijian", "onMemberExit userid " + jLongValue + " reason " + i2);
                StringBuilder sb2 = new StringBuilder("onUserLeave,userid:");
                sb2.append(str);
                Log.e("lqdebug", sb2.toString());
                if (((MediaBaseCodecFilter) xmp0.this).f14987H.f191058c1 == 1) {
                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122837d(true, ((xhy) xmp0.this.f195136I0.get(lValueOf)).m211084c(), jLongValue, i2);
                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122839f(true, ((xhy) xmp0.this.f195136I0.get(lValueOf)).m211084c(), j, 0L, jLongValue, i);
                    jLongValue = jLongValue;
                    i2 = i;
                }
                xmp0.this.f195157P0.mo165950g(8199, (int) jLongValue, 0, xmp0.this);
            }
            if (xmp0.this.f195243q2 != null && (!xmp0.this.f195125E1 || xmp0.this.f195204c1 || xmp0.this.f195201b1)) {
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + "----onVideoChannelRemove userID=" + jLongValue);
                xmp0.this.f195243q2.mo20118b(jLongValue, i2);
                xmp0 xmp0Var = xmp0.this;
                if (xmp0Var.f195176U1 != null && xmp0Var.f195241p2.contains(str)) {
                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("setRemoteVideoCanvas 0531");
                    xmp0.this.f195176U1.setRemoteVideoCanvas(new RemoteStreamKey(xmp0.this.f195183W0.f164226g1, str, StreamIndex.STREAM_INDEX_MAIN), null);
                    xmp0.this.f195241p2.remove(lValueOf);
                }
                ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onVideoChannelRemove uid:" + jLongValue + ",reason:" + i2);
            }
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("isUseTextureView", Boolean.valueOf(xmp0.this.f195183W0.f180181Z0));
            if (xmp0.this.f195183W0.f180181Z0) {
                xmp0 xmp0Var2 = xmp0.this;
                if (xmp0Var2.f195176U1 != null && xmp0Var2.f195238o2 != null && xmp0.this.f195238o2.containsKey(str)) {
                    ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("setupRemoteVideoview null");
                    xmp0.this.f195238o2.remove(str);
                    if (xmp0.this.f195249t2 != null) {
                        xmp0.this.f195249t2.mo20122b(jLongValue, i2);
                    }
                }
            }
            if (xmp0.this.f195248t1 != null) {
                xmp0.this.f195248t1.onUserOffline(jLongValue, i2);
            }
            if (xmp0.this.f195210e1 != null) {
                if (xmp0.this.f195210e1.containsKey(lValueOf) || jLongValue == xmp0.this.f195183W0.f180157B0) {
                    if (jLongValue != xmp0.this.f195183W0.f180157B0) {
                        xmp0.this.f195210e1.remove(lValueOf);
                    }
                    boolean z = xmp0.this.f195125E1;
                    xmp0 xmp0Var3 = xmp0.this;
                    if (!z) {
                        if (xmp0Var3.f195247s2 != null) {
                            xmp0.this.f195247s2.mo20124b(jLongValue, i2);
                        }
                    } else if (xmp0Var3.f195245r2 != null) {
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", getClass().getSimpleName() + "----onVideoChannelRemoveExt userID=" + jLongValue);
                        xmp0.this.f195245r2.mo109338b(jLongValue, i2);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserPublishStreamAudio(String str, String str2, boolean z) {
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onUserPublishStreamAudio", "uid:" + str2 + ",isPublish:" + z);
            iny inyVar = (iny) xmp0.this.f195133H0.get(Long.valueOf(str2));
            if (inyVar != null) {
                inyVar.m141180g(!z);
            }
            if (xmp0.this.f195248t1 != null) {
                xmp0.this.f195248t1.onUserMuteAudio(Integer.valueOf(str2).intValue(), !z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.gjc0, com.p074ss.bytertc.engine.handler.IRTCRoomEventHandler
        public void onUserPublishStreamVideo(String str, String str2, boolean z) {
            super.onUserPublishStreamVideo(str, str2, z);
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onUserPublishStreamVideo", "uid:" + str2 + ",isPublish:" + z);
            iny inyVar = (iny) xmp0.this.f195133H0.get(Long.valueOf(str2));
            if (inyVar != null) {
                inyVar.m141181h(!z);
            }
            if (xmp0.this.f195248t1 != null) {
                xmp0.this.f195248t1.onUserMuteVideo(Integer.valueOf(str2).intValue(), !z);
            }
        }
    }

    /* JADX INFO: renamed from: l.xmp0$i */
    public class C21383i implements IAudioFrameProcessor {
        public C21383i() {
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessEarMonitorAudioFrame(IAudioFrame iAudioFrame) {
            return 0;
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessPlayBackAudioFrame(IAudioFrame iAudioFrame) {
            return 0;
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessRecordAudioFrame(IAudioFrame iAudioFrame) {
            oxd0 oxd0VarMo19373C;
            ByteBuffer byteBuffer;
            int iValue = iAudioFrame.channel().value();
            int iData_size = iAudioFrame.data_size();
            int iValue2 = iAudioFrame.sample_rate().value();
            int unused = xmp0.this.f195226j2;
            xmp0.m211868g3(xmp0.this);
            int iData_size2 = iAudioFrame.data_size();
            byte[] bArrM144336o2 = new byte[iData_size2];
            if (!xmp0.this.f195134H1) {
                iAudioFrame.getDataBuffer().get(bArrM144336o2, 0, iData_size2);
            }
            if (xmp0.this.f195229k1 != null) {
                xmp0.this.f195229k1.onPcmDateCallback(xmp0.this.f195183W0.f180157B0, bArrM144336o2, 44100, iValue != 1);
            }
            oxd0 oxd0Var = null;
            if (((MediaBaseCodecFilter) xmp0.this).f14990K != null) {
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) xmp0.this).f14990K).mo21100W1(xmp0.this.f195163R0);
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) xmp0.this).f14990K).m21086I2(iData_size, xmp0.this.f195183W0.f175459P, iValue, "Volc");
                oxd0VarMo19373C = ((ExtAudioWrapper) ((MediaBaseCodecFilter) xmp0.this).f14990K).mo19373C(new oxd0(bArrM144336o2, xmp0.this.f195167S0, iValue));
                if (oxd0VarMo19373C != null && (byteBuffer = oxd0VarMo19373C.f149639b) != null) {
                    byteBuffer.get(bArrM144336o2, 0, iData_size2);
                    iAudioFrame.getDataBuffer().rewind();
                    iAudioFrame.getDataBuffer().put(bArrM144336o2);
                    iAudioFrame.getDataBuffer().rewind();
                }
            } else {
                oxd0VarMo19373C = null;
            }
            if (xmp0.this.f195158P1 != null) {
                xmp0.this.f195158P1.mo20142o(bArrM144336o2, iValue2, iValue);
            }
            if (xmp0.this.f195148M0 != null && xmp0.this.f195154O0) {
                if (((MediaBaseCodecFilter) xmp0.this).f14990K != null) {
                    if (xmp0.this.f195239p0 != null) {
                        xmp0.this.f195239p0.m115192j(1.0f);
                        if (xmp0.this.f195183W0.f180179X0) {
                            xmp0.this.f195239p0.m115193k(1.0f);
                        }
                        oxd0Var = xmp0.this.f195239p0.m115189g();
                    }
                    if (oxd0Var != null) {
                        xmp0 xmp0Var = xmp0.this;
                        ByteBuffer byteBufferM115190h = oxd0VarMo19373C != null ? xmp0Var.f195239p0.m115190h(oxd0VarMo19373C.m169687c(), oxd0Var.m169687c(), oxd0Var.m169689e()) : xmp0Var.f195239p0.m115190h(bArrM144336o2, oxd0Var.m169687c(), oxd0Var.m169689e());
                        if (byteBufferM115190h != null) {
                            oxd0Var = new oxd0(byteBufferM115190h.array(), oxd0Var.m169688d(), iValue);
                        }
                    }
                }
                if (oxd0Var != null) {
                    oxd0 oxd0Var2 = new oxd0(iValue == 1 ? jc00.m144336o2(oxd0Var.m169687c(), oxd0Var.m169689e()) : oxd0Var.m169687c(), xmp0.this.f195167S0, 2);
                    oxd0Var2.m169691g(false);
                    if (xmp0.this.f195148M0 != null) {
                        xmp0.this.f195148M0.mo109339C(oxd0Var2);
                        if (xmp0.m211916t3(xmp0.this) % 50 == 0) {
                            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                        }
                    }
                } else if (xmp0.this.f195184W1 != 2) {
                    if (iValue == 1) {
                        bArrM144336o2 = jc00.m144336o2(bArrM144336o2, iData_size2);
                    }
                    oxd0 oxd0Var3 = new oxd0(bArrM144336o2, xmp0.this.f195167S0, 2);
                    oxd0Var3.m169691g(false);
                    if (xmp0.this.f195148M0 != null) {
                        xmp0.this.f195148M0.mo109339C(oxd0Var3);
                        if (xmp0.m211916t3(xmp0.this) % 50 == 0) {
                            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                        }
                    }
                }
            }
            return 0;
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame) {
            return 0;
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameProcessor
        public int onProcessScreenAudioFrame(IAudioFrame iAudioFrame) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: l.xmp0$k */
    public class RunnableC21385k implements Runnable {
        public RunnableC21385k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("configConnectLost", "errorcode 10");
            if (xmp0.this.f195157P0 != null) {
                xmp0.this.f195157P0.mo165950g(4353, 10, 0, xmp0.this);
            }
            if (xmp0.this.f195248t1 != null) {
                xmp0.this.f195248t1.onConnectionLost();
            }
            xmp0.this.f195123D2 = 1;
            xmp0.m211897o4(xmp0.this);
            ((MediaBaseCodecFilter) xmp0.this).f14987H.f191117y0 = 812L;
            ((MediaBaseCodecFilter) xmp0.this).f14987H.f191081k0 = Constants.RHYTHM_PLAYER_STATE_DECODING;
            xmp0.this.m20735e2(4353, 10);
            if (((MediaBaseCodecFilter) xmp0.this).f14988I != null) {
                ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onConnectionLost");
            }
            xmp0.this.mo20661f();
        }
    }

    public xmp0(Context context, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar, String str) {
        super(context);
        this.f195166S = "Pipeline_Normal_pip->PIPLINE->VOLC";
        this.f195170T = true;
        this.f195174U = -1;
        this.f195182W = false;
        this.f195186X = false;
        this.f195190Y = true;
        this.f195194Z = null;
        this.f195124E0 = 0L;
        this.f195127F0 = 0;
        this.f195130G0 = 0L;
        this.f195133H0 = new PipelineConcurrentHashMap<>();
        this.f195136I0 = new PipelineConcurrentHashMap<>();
        this.f195139J0 = 0;
        this.f195142K0 = 0;
        this.f195145L0 = null;
        this.f195151N0 = false;
        this.f195154O0 = false;
        this.f195160Q0 = 1.0f;
        this.f195163R0 = 1.0f;
        this.f195167S0 = 44100;
        this.f195171T0 = 0;
        this.f195175U0 = 0;
        this.f195179V0 = 0;
        this.f195187X0 = -1;
        this.f195191Y0 = null;
        this.f195195Z0 = new Object();
        this.f195198a1 = 0;
        this.f195201b1 = false;
        this.f195204c1 = false;
        this.f195207d1 = new Object();
        this.f195210e1 = new PipelineConcurrentHashMap();
        this.f195213f1 = false;
        this.f195222i1 = null;
        this.f195225j1 = null;
        this.f195231l1 = 0;
        this.f195233m1 = 0;
        this.f195235n1 = DetectDelayStopHelper.TYPE_DETECT_PICKNOISE;
        this.f195237o1 = 0;
        this.f195240p1 = "";
        this.f195242q1 = false;
        this.f195116A1 = new xpw();
        this.f195118B1 = new xpw();
        this.f195120C1 = new imw();
        this.f195122D1 = new tpw();
        this.f195125E1 = false;
        this.f195128F1 = false;
        this.f195131G1 = true;
        this.f195134H1 = false;
        this.f195137I1 = 0L;
        this.f195140J1 = null;
        this.f195143K1 = false;
        this.f195146L1 = Long.MIN_VALUE;
        this.f195149M1 = 1000L;
        this.f195152N1 = null;
        this.f195161Q1 = 1;
        this.f195164R1 = System.currentTimeMillis();
        this.f195168S1 = null;
        this.f195172T1 = -1;
        this.f195176U1 = null;
        this.f195180V1 = null;
        this.f195184W1 = 1;
        this.f195188X1 = false;
        this.f195199a2 = false;
        this.f195202b2 = false;
        this.f195205c2 = false;
        this.f195208d2 = false;
        this.f195211e2 = false;
        this.f195214f2 = null;
        this.f195217g2 = false;
        this.f195220h2 = "";
        this.f195226j2 = 0;
        this.f195230k2 = false;
        this.f195232l2 = false;
        this.f195234m2 = 0;
        this.f195236n2 = 1;
        this.f195238o2 = new PipelineConcurrentHashMap();
        this.f195241p2 = new ArrayList<>();
        this.f195243q2 = null;
        this.f195245r2 = null;
        this.f195247s2 = null;
        this.f195249t2 = null;
        this.f195251u2 = null;
        this.f195255w2 = 0;
        this.f195257x2 = AudioProfileType.AUDIO_PROFILE_HD_MONO;
        this.f195259y2 = AudioScenarioType.GAMESTREAMING;
        this.f195261z2 = null;
        this.f195117A2 = -1L;
        this.f195119B2 = -1L;
        this.f195121C2 = -1L;
        this.f195123D2 = 0;
        this.f195126E2 = new Handler(Looper.getMainLooper());
        this.f195129F2 = false;
        this.f195132G2 = -1;
        this.f195135H2 = -1;
        this.f195138I2 = 1;
        this.f195141J2 = 3;
        this.f195144K2 = false;
        this.f195147L2 = "";
        this.f195150M2 = null;
        this.f195156O2 = 0;
        this.f195159P2 = new C21378d();
        this.f195162Q2 = new C21379e();
        this.f195165R2 = new C21380f();
        this.f195169S2 = new C21381g();
        this.f195173T2 = 0;
        this.f195177U2 = 0;
        this.f195181V2 = null;
        this.f195185W2 = new C21383i();
        this.f195189X2 = new C21384j();
        this.f195193Y2 = false;
        this.f195197Z2 = false;
        this.f195200a3 = 0L;
        this.f195203b3 = false;
        this.f195206c3 = 0;
        this.f195209d3 = new C21375a();
        this.f195212e3 = 0;
        this.f195215f3 = false;
        this.f195218g3 = false;
        this.f195224i3 = "";
        this.f195227j3 = false;
        this.f195145L0 = str;
        this.f195228k0 = g510Var;
        this.f195183W0 = (ror) uowVar;
        this.f195157P0 = interfaceC19500a;
        this.f195225j1 = new CongressUtil();
        m211755A6(uowVar);
        wvx wvxVar = this.f14987H;
        wvxVar.f191059d = 261L;
        wvxVar.f191064e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }

    /* JADX INFO: renamed from: A6 */
    private void m211755A6(uow uowVar) {
        this.f15000s = uowVar;
        m212037m7(uowVar.f175459P);
        this.f195208d2 = uowVar.f175502q;
        this.f195151N0 = false;
        this.f14988I.m122843l("volcInit", "appid:" + this.f195145L0);
        ArrayList<String> arrayListM112252F0 = csx.m112235R().m112252F0();
        String str = WeJson.EMPTY_MAP;
        if (arrayListM112252F0 != null) {
            for (String str2 : arrayListM112252F0) {
                if (!TextUtils.isEmpty(this.f195145L0) && this.f195145L0.equals(str2)) {
                    str = "{\"config_hosts\":[\"rtc-test.bytedance.com\"],\"access_hosts\":[\"rtc-access-test.bytedance.com\"]}";
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Log.e("lqdebug", "volc engine init json");
            long jCurrentTimeMillis = System.currentTimeMillis();
            EngineConfig engineConfig = new EngineConfig();
            engineConfig.appID = this.f195145L0;
            engineConfig.parameters = jSONObject;
            engineConfig.context = m20725W1();
            try {
                if (engineConfig.parameters == null) {
                    engineConfig.parameters = new JSONObject();
                }
                engineConfig.parameters.put("rtc.enable_auto_ntp_synchronized", true);
            } catch (Exception unused) {
            }
            g510 g510Var = this.f195228k0;
            if (g510Var != null) {
                engineConfig.eglContext = g510Var.m128993l();
            }
            this.f195156O2 = 0;
            int i = this.f195183W0.f180185d1;
            if (i >= 0) {
                this.f195156O2 = i;
            } else {
                this.f195156O2 = csx.m112235R().m112264J0();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f195176U1 = wmp0.m207117b().m207119c(engineConfig, this.f195145L0, this.f195162Q2, this.f195159P2, this.f195156O2 == 0);
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
            if (this.f195176U1 == null) {
                boolean zInitializeNativeLibs = RTCEngineImpl.initializeNativeLibs();
                b7y.m102882c().m102883a("volcCreate", "isLoad:" + zInitializeNativeLibs, LogLevel.FATAL);
                return;
            }
            b7y.m102882c().m102888g("volcCreate", "mRtcKeepAlive:" + this.f195156O2 + ",volcengineHash:" + this.f195176U1.hashCode() + ", cost:" + jCurrentTimeMillis3);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rtc.start_sco_failed_force_to_media", true);
                this.f195176U1.setRuntimeParameters(jSONObject2);
            } catch (Exception unused2) {
            }
            this.f14988I.m122842k("VolcEngine", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Exception e) {
            this.f14988I.m122843l("VolcEngine.create error" + e.toString());
        }
    }

    /* JADX INFO: renamed from: B6 */
    private int m211760B6() {
        int i = 0;
        if (!this.f195204c1 && !this.f195230k2) {
            i = 1;
        }
        return i ^ 1;
    }

    /* JADX INFO: renamed from: C6 */
    private final void m211765C6(String str, int i) {
        RTCEngineEx rTCEngineEx = this.f195176U1;
        if (rTCEngineEx == null) {
            this.f14988I.m122843l("joinChannel", "fatal error mRtcEngine is null");
            return;
        }
        RTCRoomEx rTCRoomExCreateRTCRoomEx = rTCEngineEx.createRTCRoomEx(str);
        this.f195180V1 = rTCRoomExCreateRTCRoomEx;
        if (rTCRoomExCreateRTCRoomEx == null) {
            this.f14988I.m122842k("joinChannel", "fatal error mRTCRoom is null");
            MRtcEventHandler mRtcEventHandler = this.f195248t1;
            if (mRtcEventHandler != null) {
                mRtcEventHandler.onJoinChannelfail(str, i, -6);
                return;
            }
            return;
        }
        wmp0.m207117b().m207120d(this.f195180V1);
        this.f195180V1.setRTCRoomEventHandler(this.f195169S2);
        this.f195180V1.setRTCRoomEventHandlerEx(this.f195165R2);
        this.f14988I.m122843l("volcEngine", "3 createRTCRoom:uid" + i + ",channel:" + str);
        boolean z = this.f195184W1 == 1;
        m211973N7(z);
        this.f14988I.m122843l("volcEngine", "4 setUserVisibility");
        ror rorVar = this.f195183W0;
        int i2 = rorVar.f175494m;
        int i3 = rorVar.f175496n;
        if (rorVar.f180161F0) {
            i3 = i2;
            i2 = i3;
        }
        m211987S7(i2, i3, rorVar.f175451H / 1000);
        this.f14988I.m122843l("volcEngine", "5 setVideoConfig");
        m212022g7();
        this.f14988I.m122843l("volcEngine", "6 setAudioConfig");
        UserInfo userInfo = new UserInfo(String.valueOf(i), null);
        if (!TextUtils.isEmpty(this.f195183W0.f164233n1)) {
            try {
                hjc0 hjc0Var = new hjc0();
                hjc0Var.f110173a = this.f195183W0.f164233n1;
                userInfo = new UserInfo(String.valueOf(i), lwd0.m156040b().m156042c(hjc0Var));
            } catch (Exception unused) {
                userInfo = new UserInfo(String.valueOf(i), null);
            }
        }
        this.f14988I.m122843l("volcEngine", "joinRoom token:" + this.f195191Y0 + ", channelid:" + str + ",uid:" + i);
        int iJoinRoom = this.f195180V1.joinRoom(this.f195191Y0, userInfo, z, new RTCRoomConfig(ChannelProfile.CHANNEL_PROFILE_LIVE, true, true, true, true));
        if (iJoinRoom >= 0) {
            this.f14988I.m122843l("volcEngine", "7 joinRoom");
            this.f195176U1.registerAudioFrameObserver(this.f195189X2);
            this.f195176U1.registerAudioProcessor(this.f195185W2);
            m211997W6(true);
            m211846Z5();
            return;
        }
        MRtcEventHandler mRtcEventHandler2 = this.f195248t1;
        if (mRtcEventHandler2 != null) {
            mRtcEventHandler2.onJoinChannelfail(str, i, iJoinRoom);
        }
        wvx wvxVar = this.f14987H;
        wvxVar.f191117y0 = 810L;
        wvxVar.f191081k0 = iJoinRoom;
    }

    /* JADX INFO: renamed from: D6 */
    private void m211770D6() {
        synchronized (this.f195195Z0) {
            try {
                RTCEngineEx rTCEngineEx = this.f195176U1;
                if (rTCEngineEx != null) {
                    this.f14987H.f191051a0 = "";
                    rTCEngineEx.stopPushMixedStream(this.f195147L2, MixedStreamPushTargetType.PUSH_TO_CDN);
                    this.f195176U1.stopAudioCapture();
                    this.f14988I.m122843l("Volc", "10 stopAudioCapture");
                }
                RTCRoomEx rTCRoomEx = this.f195180V1;
                if (rTCRoomEx != null) {
                    rTCRoomEx.leaveRoom();
                    this.f14988I.m122843l("Volc", "11 leaveRoom");
                }
                this.f195205c2 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H7 */
    public int m211786H7(String str) {
        int iStartPushMixedStream;
        MixedStreamPushTargetConfig mixedStreamPushTargetConfig;
        kod0 kod0Var;
        synchronized (this.f195207d1) {
            try {
                this.f14988I.m122843l("setRtcEnginePublishStreamUrl", "rtmpUrl:" + str + "mHavaPublish" + this.f195205c2);
                if (this.f195205c2 || this.f195202b2) {
                    iStartPushMixedStream = 0;
                } else if (this.f195176U1 == null || this.f195192Y1 == null || (mixedStreamPushTargetConfig = this.f195196Z1) == null) {
                    this.f14988I.m122843l("setRtcEnginePublishStreamUrl", "error:pushTargetConfig:" + this.f195196Z1 + ", mixedStreamConfig:" + this.f195192Y1);
                    iStartPushMixedStream = 0;
                } else {
                    mixedStreamPushTargetConfig.pushCDNURL = str;
                    mixedStreamPushTargetConfig.pushTargetType = MixedStreamPushTargetType.PUSH_TO_CDN;
                    String strM211858c6 = m211858c6();
                    iStartPushMixedStream = this.f195176U1.startPushMixedStream(strM211858c6, this.f195196Z1, this.f195192Y1);
                    if (iStartPushMixedStream != 0 && (kod0Var = this.f195158P1) != null) {
                        kod0Var.mo20143p(str, iStartPushMixedStream);
                        this.f14988I.m122843l("startPushMixedStream", "error:" + iStartPushMixedStream);
                    }
                    this.f195147L2 = strM211858c6;
                    this.f14988I.m122843l("startPushMixedStream", "ret:" + iStartPushMixedStream);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iStartPushMixedStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M6 */
    public void m211802M6() {
        if (this.f14987H.f191056c == 0) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "AGORA_PUBLISHING");
            this.f14988I.m122843l("notifyPublished", "VOLC PUBLISHING");
            this.f195157P0.mo165950g(4103, 0, 0, this);
            Log.e("lqdebug", "VOLC VOLC_PUBLISHING");
            this.f14987H.f191056c = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M7 */
    public void m211803M7(Object obj, int i, int i2) {
        gb1 gb1VarM21079C2;
        l6m l6mVar = this.f14990K;
        if (l6mVar == null || (gb1VarM21079C2 = ((ExtAudioWrapper) l6mVar).m21079C2()) == null) {
            return;
        }
        gb1VarM21079C2.mo19382a(obj, i, i2);
    }

    /* JADX INFO: renamed from: O7 */
    private void m211810O7() {
        ror rorVar = this.f195183W0;
        m211987S7(rorVar.f175494m, rorVar.f175496n, rorVar.f175451H / 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V7 */
    public void m211832V7(int i, boolean z) {
        iny inyVar = this.f195133H0.get(Long.valueOf(i));
        if (inyVar != null) {
            inyVar.m141181h(z);
        }
        MRtcEventHandler mRtcEventHandler = this.f195248t1;
        if (mRtcEventHandler != null) {
            mRtcEventHandler.onUserMuteVideo(i, z);
        }
    }

    /* JADX INFO: renamed from: X6 */
    private void m211839X6() {
        this.f14988I.m122843l("release");
        boolean z = true;
        this.f195193Y2 = true;
        synchronized (this.f195195Z0) {
            try {
                this.f14988I.m122843l("release begin");
                RTCRoomEx rTCRoomEx = this.f195180V1;
                if (rTCRoomEx != null) {
                    rTCRoomEx.destroy();
                    this.f195180V1 = null;
                    wmp0.m207117b().m207120d(null);
                }
                this.f195192Y1 = null;
                IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
                if (iMediaPlayerM211945z6 != null) {
                    iMediaPlayerM211945z6.setEventHandler(null);
                }
                this.f195209d3 = null;
                long jCurrentTimeMillis = System.currentTimeMillis();
                wmp0 wmp0VarM207117b = wmp0.m207117b();
                if (this.f195156O2 != 0) {
                    z = false;
                }
                wmp0VarM207117b.m207118a(z);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                b7y.m102882c().m102888g("volcDestroy", "mRtcKeepAlive:" + this.f195156O2 + ",cost:" + jCurrentTimeMillis2);
                this.f195176U1 = null;
                this.f195162Q2 = null;
                this.f195169S2 = null;
                this.f195150M2 = null;
                this.f14988I.m122843l("volc", "12 releaseRTC");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z5 */
    private void m211846Z5() {
        this.f195168S1 = new RunnableC21385k();
    }

    /* JADX INFO: renamed from: a6 */
    private final void m211850a6(int i) {
        this.f14988I.m122843l("volcEngine", "2 setVideoSourceType");
        m211998W7(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b6 */
    public void m211854b6(boolean z, int i, int i2, int i3, int i4, String str, String str2) {
        if (this.f195192Y1 == null) {
            this.f195192Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        if (this.f195196Z1 == null) {
            this.f195196Z1 = new MixedStreamPushTargetConfig();
        }
        this.f14988I.m122843l("configPublisher", "width:" + i + ",height" + i2 + ",url:" + str + ",bitrate:" + i3 + ",fps:" + i4 + ",uid:" + str2);
        MixedStreamConfig mixedStreamConfig = this.f195192Y1;
        mixedStreamConfig.roomID = this.f195183W0.f164226g1;
        mixedStreamConfig.userID = str2;
        MixedStreamPushTargetConfig mixedStreamPushTargetConfig = this.f195196Z1;
        mixedStreamPushTargetConfig.pushCDNURL = str;
        mixedStreamPushTargetConfig.pushTargetType = MixedStreamPushTargetType.PUSH_TO_CDN;
        MixedStreamVideoConfig mixedStreamVideoConfig = new MixedStreamVideoConfig();
        mixedStreamVideoConfig.width = i;
        mixedStreamVideoConfig.height = i2;
        mixedStreamVideoConfig.gop = 1;
        mixedStreamVideoConfig.fps = this.f195171T0;
        mixedStreamVideoConfig.bitrate = i3;
        if (this.f195183W0.f180163H0) {
            mixedStreamVideoConfig.videoCodec = MixedStreamVideoCodecType.MIXED_STREAM_VIDEO_CODEC_TYPE_BYTEVC1;
        }
        this.f195192Y1.videoConfig = mixedStreamVideoConfig;
        int iM112379r0 = csx.m112235R().m112379r0();
        MixedStreamAudioConfig mixedStreamAudioConfig = new MixedStreamAudioConfig();
        mixedStreamAudioConfig.sampleRate = 44100;
        mixedStreamAudioConfig.channels = 2;
        mixedStreamAudioConfig.audioProfile = MixedStreamAudioProfile.MIXED_STREAM_AUDIO_PROFILE_LC;
        if (iM112379r0 == 0) {
            iM112379r0 = 128;
        }
        mixedStreamAudioConfig.bitrate = iM112379r0;
        this.f195192Y1.audioConfig = mixedStreamAudioConfig;
    }

    /* JADX INFO: renamed from: c6 */
    private String m211858c6() {
        return "and_" + this.f195183W0.f180157B0 + "_" + Long.toString(System.currentTimeMillis() % 1000000);
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ int m211868g3(xmp0 xmp0Var) {
        int i = xmp0Var.f195226j2;
        xmp0Var.f195226j2 = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i8 */
    public int m211877i8(String str, String str2) {
        if (this.f195180V1 == null || this.f195129F2) {
            return 0;
        }
        int iStartForwardStreamToRooms = this.f195180V1.startForwardStreamToRooms(Collections.singletonList(new ForwardStreamInfo(str, str2)));
        if (iStartForwardStreamToRooms < 0) {
            this.f195158P1.mo20134f(0L, 3, "");
            b7y.m102882c().m102886e("ConnectOtherRoom", "volc", iStartForwardStreamToRooms, "strartForwardStreamToRoom failed", LogLevel.FATAL.value());
            this.f195129F2 = false;
        } else {
            this.f195129F2 = true;
        }
        this.f14988I.m122843l("subscribeOhterRoom", "channelid:" + str + ",ret = " + iStartForwardStreamToRooms);
        return iStartForwardStreamToRooms;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j7 */
    public void m211881j7(int i, boolean z) {
        iny inyVar = this.f195133H0.get(Long.valueOf(i));
        if (inyVar != null) {
            inyVar.m141180g(z);
        }
        MRtcEventHandler mRtcEventHandler = this.f195248t1;
        if (mRtcEventHandler != null) {
            mRtcEventHandler.onUserMuteAudio(i, z);
        }
    }

    /* JADX INFO: renamed from: m6 */
    private int m211891m6(AudioProfileType audioProfileType) {
        switch (C21377c.f195265b[audioProfileType.ordinal()]) {
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
                return this.f195183W0.f175462S;
        }
    }

    /* JADX INFO: renamed from: m8 */
    private void m211892m8(String str) {
        if (this.f195176U1 == null || this.f195192Y1 == null || this.f195196Z1 == null) {
            this.f14988I.m122843l("updateLiveTransCoding error", "mixedStreamConfig:" + this.f195192Y1 + ", pushTargetConfig:" + this.f195196Z1);
            return;
        }
        synchronized (this.f195207d1) {
            this.f195176U1.updatePushMixedStream(this.f195147L2, this.f195196Z1, this.f195192Y1);
            this.f14988I.m122843l("updateLiveTransCoding:" + this.f195192Y1.toString());
        }
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ anw m211897o4(xmp0 xmp0Var) {
        xmp0Var.getClass();
        return null;
    }

    /* JADX INFO: renamed from: p6 */
    private String m211902p6() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<Long, iny>> it = this.f195133H0.entrySet().iterator();
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

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ int m211916t3(xmp0 xmp0Var) {
        int i = xmp0Var.f195206c3;
        xmp0Var.f195206c3 = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: t6 */
    private String m211919t6(String str) {
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
            if (jSONObject.has(BaseSei.CONF) && this.f195201b1) {
                jSONObject.remove(BaseSei.CONF);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: y6 */
    private IAudioEffectPlayer m211940y6() {
        RTCEngineEx rTCEngineEx = this.f195176U1;
        if (rTCEngineEx != null) {
            return rTCEngineEx.getAudioEffectPlayer();
        }
        return null;
    }

    /* JADX INFO: renamed from: z6 */
    private IMediaPlayer m211945z6() {
        RTCEngineEx rTCEngineEx = this.f195176U1;
        if (rTCEngineEx != null) {
            return rTCEngineEx.getMediaPlayer(this.f195234m2);
        }
        return null;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: A0 */
    public int mo20913A0() {
        ror rorVar = this.f195183W0;
        return rorVar.f175490k > 0 ? rorVar.f175492l : rorVar.f175508t;
    }

    /* JADX INFO: renamed from: A7 */
    public void m211946A7(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f195160Q0 = f;
        this.f14987H.f191013H0 = f;
        int i = (int) (f * 100.0f);
        this.f14988I.m122843l("setMasterAudioLevel", "level:" + this.f195160Q0 + ", volume:" + i);
        RTCEngineEx rTCEngineEx = this.f195176U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setCaptureVolume(StreamIndex.STREAM_INDEX_MAIN, i);
            this.f195176U1.setEarMonitorVolume(i);
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
        synchronized (this.f195195Z0) {
            this.f195219h1 = str;
            if (!this.f195183W0.f180179X0) {
                m212061z7(str, true);
            }
            b7y.m102882c().m102888g("volc setMergeSei:" + str);
        }
    }

    /* JADX INFO: renamed from: C7 */
    public void m211948C7(pcmDataAvailableCallback pcmdataavailablecallback) {
        this.f195229k1 = pcmdataavailablecallback;
        this.f14988I.m122843l("setRecordPcmDataCallback", "pcmDataCallback = " + pcmdataavailablecallback);
        if (this.f195229k1 != null) {
            m211997W6(true);
        } else {
            m211997W6(false);
        }
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

    /* JADX INFO: renamed from: D7 */
    public void m211949D7(int i) {
        this.f14988I.m122843l("setRole", Integer.valueOf(i));
        this.f195184W1 = i;
        m211973N7(i == 1);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: E0 */
    public void mo20921E0(wzl wzlVar) {
        this.f14985F = wzlVar;
    }

    /* JADX INFO: renamed from: E6 */
    public void m211950E6(boolean z) {
        this.f14988I.m122843l("muteRemoteAudioStream", "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f195180V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeAllStreamsAudio(!z);
        }
    }

    /* JADX INFO: renamed from: E7 */
    public void m211951E7(boolean z) {
        this.f195202b2 = z;
        this.f14988I.m122843l("volcpusher setRoom24hMode:", Boolean.valueOf(z));
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: F */
    public boolean mo20924F() {
        return this.f195154O0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: F0 */
    public int mo20925F0() {
        return this.f195175U0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: F1 */
    public long mo20926F1() {
        RTCRoomStats rTCRoomStats = this.f195253v2;
        if (rTCRoomStats != null) {
            return rTCRoomStats.txBytes;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: F6 */
    public void m211952F6(boolean z) {
        this.f14988I.m122843l("muteAllRemoteVideoStream", "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f195180V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeAllStreamsVideo(!z);
        }
    }

    /* JADX INFO: renamed from: F7 */
    public void m211953F7(int i, boolean z) {
        this.f195231l1 = i;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: G0 */
    public long mo20929G0() {
        return 0L;
    }

    /* JADX INFO: renamed from: G6 */
    public void m211954G6(boolean z) {
        this.f195232l2 = z;
        this.f14988I.m122843l("muteLocalAudioStream", "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f195180V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.publishStreamAudio(!z);
        }
    }

    /* JADX INFO: renamed from: G7 */
    public void m211955G7(int i) {
        this.f195187X0 = i;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: H0 */
    public void mo20649H0(boolean z) {
        this.f195201b1 = z;
    }

    /* JADX INFO: renamed from: H5 */
    public void m211956H5(MRtcEventHandler mRtcEventHandler) {
        this.f195248t1 = mRtcEventHandler;
    }

    /* JADX INFO: renamed from: H6 */
    public void m211957H6(boolean z) {
        this.f14988I.m122843l("muteLocalAudioStreamForEx", "mute:" + z);
        m211954G6(z);
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: I1 */
    public void mo20934I1() {
        this.f195154O0 = true;
    }

    /* JADX INFO: renamed from: I5 */
    public void m211958I5(MRtcExitRoomHandler mRtcExitRoomHandler) {
        this.f195155O1 = mRtcExitRoomHandler;
    }

    /* JADX INFO: renamed from: I6 */
    public void m211959I6(boolean z) {
        this.f195230k2 = z;
        this.f14988I.m122843l("muteLocalVideoStream", "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f195180V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.publishStreamVideo(!z);
        }
    }

    /* JADX INFO: renamed from: I7 */
    public void m211960I7(kod0 kod0Var) {
        this.f195158P1 = kod0Var;
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: J */
    public void mo20650J(String str) {
        t9c.m189745c("zk", "setSei" + this.f195219h1);
        b7y.m102882c().m102888g("volc setSei:" + str);
        synchronized (this.f195195Z0) {
            try {
                this.f195216g1 = str;
                if (!this.f195183W0.f180179X0) {
                    if (TextUtils.isEmpty(this.f195219h1)) {
                        m212060y7(str);
                    } else {
                        m212061z7(this.f195219h1, false);
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

    /* JADX INFO: renamed from: J6 */
    public void m211962J6(long j, boolean z) {
        this.f14988I.m122843l("muteRemoteAudioStream", "uid:" + j + "mute:" + z);
        RTCRoomEx rTCRoomEx = this.f195180V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeStreamAudio(String.valueOf(j), !z);
        }
    }

    /* JADX INFO: renamed from: K5 */
    public void m211964K5(MRtcAudioHandler mRtcAudioHandler) {
        this.f195244r1 = mRtcAudioHandler;
    }

    /* JADX INFO: renamed from: K6 */
    public void m211965K6(long j, boolean z) {
        this.f14988I.m122843l("muteRemoteVideoStream", "mute:" + z + ",uid:" + j);
        RTCRoomEx rTCRoomEx = this.f195180V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.subscribeStreamVideo(String.valueOf(j), !z);
        }
    }

    /* JADX INFO: renamed from: K7 */
    public void m211966K7(boolean z) {
        if (z) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "set Stream ReplaceMode");
        }
        this.f14988I.m122843l("setStreamReplaceMode:" + z);
        this.f195128F1 = z;
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: L */
    public void mo20941L(dpl.InterfaceC16599a interfaceC16599a) {
        this.f195148M0 = interfaceC16599a;
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
    public void m211967L5(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        this.f195246s1 = mRtcAudioHandlerEx;
    }

    /* JADX INFO: renamed from: L6 */
    public void m211968L6(boolean z) {
        this.f14988I.m122843l("muteSingerAudioStream", "mute:" + z);
        t9c.m189745c("zk", "--ktv,muteSingerAudioStream:" + this.f195134H1 + "-->" + z);
        this.f195134H1 = z;
    }

    /* JADX INFO: renamed from: L7 */
    public void m211969L7(int i) {
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 != null) {
            iMediaPlayerM211945z6.setPosition(i);
        } else {
            this.f14988I.m122843l("setSurroundMusicPos", "audioMixingManager is null");
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
        if (this.f195178V == null && (g510Var = this.f195228k0) != null) {
            this.f195178V = g510Var.m128993l();
        }
        if (this.texture_in == 0 || this.f195230k2 || !this.f195188X1) {
            return;
        }
        synchronized (this.f195195Z0) {
            try {
                VideoFrameData videoFrameData = new VideoFrameData();
                videoFrameData.bufferType = VideoBufferType.GL_TEXTURE;
                videoFrameData.pixelFormat = VideoPixelFormat.TEXTURE_2D;
                videoFrameData.eglContext = this.f195178V;
                videoFrameData.textureId = this.texture_in;
                videoFrameData.textureMatrix = f195115k3;
                videoFrameData.seiData = null;
                videoFrameData.roiData = null;
                ror rorVar = this.f195183W0;
                videoFrameData.width = rorVar.f175494m;
                videoFrameData.height = rorVar.f175496n;
                videoFrameData.rotation = VideoRotation.VIDEO_ROTATION_0;
                videoFrameData.timestampUs = System.currentTimeMillis() * 1000000;
                RTCEngineEx rTCEngineEx = this.f195176U1;
                if (rTCEngineEx != null) {
                    rTCEngineEx.pushExternalVideoFrame(videoFrameData);
                }
                u6y.m194722F().m194734M();
            } catch (Throwable th) {
                throw th;
            }
        }
        long j = this.f195137I1 + 1;
        this.f195137I1 = j;
        if (j >= 30 || this.f195201b1) {
            m211802M6();
            if (this.f195200a3 <= 0) {
                this.f195200a3 = System.currentTimeMillis();
            }
        }
        if (this.f195197Z2 || this.f195200a3 <= 0 || System.currentTimeMillis() - this.f195200a3 <= com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            return;
        }
        this.f195197Z2 = true;
        Log.e("lqdebug", "VOLC PUBLISHED");
        this.f14988I.m122843l("notifyPublished", "VOLC PUBLISHED");
        this.f195157P0.mo165950g(MessageCenter.MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED, 0, 0, this);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: N0 */
    public long mo20951N0() {
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: N1 */
    public int mo20952N1() {
        return this.f195127F0;
    }

    /* JADX INFO: renamed from: N5 */
    public void m211971N5(MRtcChannelHandler mRtcChannelHandler) {
        this.f195250u1 = mRtcChannelHandler;
    }

    /* JADX INFO: renamed from: N6 */
    public void m211972N6(int i, int i2) {
        this.f14988I.m122843l("onClientRoleChanged", Integer.valueOf(i), Integer.valueOf(i2));
        wvx wvxVar = this.f14987H;
        if (wvxVar.f191053b) {
            if (wvxVar.f191058c1 == 1) {
                mo20738h2();
            } else {
                mo20736f2();
            }
        }
        MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler = this.f195260z1;
        if (mRtcClientRoleChangedHandler != null) {
            mRtcClientRoleChangedHandler.onClientRoleChanged(i, i2);
        }
        kod0 kod0Var = this.f195158P1;
        if (kod0Var != null) {
            kod0Var.mo20133e(i, i2);
        }
    }

    /* JADX INFO: renamed from: N7 */
    public void m211973N7(boolean z) {
        this.f14988I.m122843l("setUserVisibility", Boolean.valueOf(z));
        JSONObject jSONObject = new JSONObject();
        try {
            RTCRoomEx rTCRoomEx = this.f195180V1;
            if (rTCRoomEx == null || this.f195176U1 == null) {
                return;
            }
            rTCRoomEx.setUserVisibility(z);
            if (z) {
                jSONObject.put("rtc.audio_enable_playback_post", "{\"rtc.audio_enable_playback_post\":true}");
                this.f195176U1.setRuntimeParameters(jSONObject);
                this.f195176U1.startAudioCapture();
            } else {
                jSONObject.put("rtc.audio_enable_playback_post", "{\"rtc.audio_enable_playback_post\":false}");
                this.f195176U1.setRuntimeParameters(jSONObject);
                this.f195176U1.stopAudioCapture();
            }
        } catch (Exception e) {
            this.f14988I.m122843l("setUserVisibility falied:" + e.toString());
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: O0 */
    public long mo20955O0() {
        return this.f195130G0;
    }

    /* JADX INFO: renamed from: O5 */
    public void m211974O5(MRtcConnectHandler mRtcConnectHandler) {
        this.f195258y1 = mRtcConnectHandler;
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
    public void m211975O6(String str) {
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
        String str8 = BaseSei.f14626Z;
        String str9 = "h";
        String str10 = "w";
        String str11 = BaseSei.f14625Y;
        String str12 = BaseSei.f14624X;
        String str13 = "id";
        String str14 = com.clevertap.android.sdk.Constants.SEPARATOR_COMMA;
        String str15 = "regions code:";
        try {
            str2 = "pkmu";
            try {
                jSONObject = new JSONObject(str);
                if (jSONObject.has(com.tencent.connect.common.Constants.f58037TS)) {
                    jSONObject.remove(com.tencent.connect.common.Constants.f58037TS);
                }
                str3 = "renderMode";
                try {
                    jSONObject.put(com.tencent.connect.common.Constants.f58037TS, m20727Y1());
                    if (jSONObject.has("bType")) {
                        jSONObject.remove("bType");
                    }
                    jSONObject.put("bType", this.f14987H.f191104s);
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
                        MixedStreamVideoConfig mixedStreamVideoConfig = this.f195192Y1.videoConfig;
                        mixedStreamLayoutRegionConfig2.width = mixedStreamVideoConfig.width;
                        mixedStreamLayoutRegionConfig2.height = mixedStreamVideoConfig.height;
                        mixedStreamLayoutRegionConfig2.alpha = 1.0d;
                        mixedStreamLayoutRegionConfig2.isLocalUser = true;
                        mixedStreamLayoutRegionConfig2.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                        mixedStreamLayoutRegionConfig2.roomID = this.f195183W0.f164226g1;
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
                    if (string3.equals(String.valueOf(this.f195183W0.f180157B0))) {
                        mixedStreamLayoutRegionConfig.isLocalUser = true;
                        Log.e("lqdebug", "setLocalUser true id:" + string3);
                    } else {
                        mixedStreamLayoutRegionConfig.isLocalUser = false;
                        Log.e("lqdebug", "setLocalUser false id:" + string3);
                    }
                    mixedStreamLayoutRegionConfig.userID = string3;
                    mixedStreamLayoutRegionConfig.roomID = this.f195183W0.f164226g1;
                    MixedStreamVideoConfig mixedStreamVideoConfig2 = this.f195192Y1.videoConfig;
                    int i3 = mixedStreamVideoConfig2.width;
                    mixedStreamLayoutRegionConfig.locationX = (int) (((double) i3) * d2);
                    int i4 = mixedStreamVideoConfig2.height;
                    mixedStreamLayoutRegionConfig.locationY = (int) (((double) i4) * d6);
                    mixedStreamLayoutRegionConfig.width = (int) (((double) i3) * d3);
                    mixedStreamLayoutRegionConfig.height = (int) (((double) i4) * d4);
                    evx evxVar = this.f14988I;
                    StringBuilder sb = new StringBuilder();
                    String str18 = str15;
                    sb.append(str18);
                    sb.append(arrayList2.hashCode());
                    sb.append(", mv.height:");
                    sb.append(this.f195192Y1.videoConfig.height);
                    sb.append(",mv.width:");
                    sb.append(this.f195192Y1.videoConfig.width);
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
                    evxVar.m122843l(sb.toString());
                    mixedStreamLayoutRegionConfig.alpha = d5;
                    mixedStreamLayoutRegionConfig.zOrder = i2;
                    if (c == 255) {
                        mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY;
                    } else {
                        mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
                    }
                    mixedStreamLayoutRegionConfig.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                    mixedStreamLayoutRegionConfig.regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
                    evx evxVar2 = this.f14988I;
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
                    evxVar2.m122843l(sb2.toString());
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
                MixedStreamConfig mixedStreamConfig = this.f195192Y1;
                mixedStreamConfig.userConfigExtraInfo = this.f195216g1;
                mixedStreamConfig.regions = (MixedStreamLayoutRegionConfig[]) arrayList3.toArray(new MixedStreamLayoutRegionConfig[arrayList3.size()]);
                evx evxVar3 = this.f14988I;
                evxVar3.m122843l("volc setLayout", str4 + arrayList3.size() + ",regions.hashcode" + arrayList3.hashCode());
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
                MixedStreamVideoConfig mixedStreamVideoConfig3 = this.f195192Y1.videoConfig;
                mixedStreamLayoutRegionConfig3.width = mixedStreamVideoConfig3.width;
                mixedStreamLayoutRegionConfig3.height = mixedStreamVideoConfig3.height;
                mixedStreamLayoutRegionConfig3.alpha = 1.0d;
                mixedStreamLayoutRegionConfig3.isLocalUser = true;
                mixedStreamLayoutRegionConfig3.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
                mixedStreamLayoutRegionConfig3.roomID = this.f195183W0.f164226g1;
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
            if (string3.equals(String.valueOf(this.f195183W0.f180157B0))) {
                mixedStreamLayoutRegionConfig.isLocalUser = true;
                Log.e("lqdebug", "setLocalUser true id:" + string3);
            } else {
                mixedStreamLayoutRegionConfig.isLocalUser = false;
                Log.e("lqdebug", "setLocalUser false id:" + string3);
            }
            mixedStreamLayoutRegionConfig.userID = string3;
            mixedStreamLayoutRegionConfig.roomID = this.f195183W0.f164226g1;
            MixedStreamVideoConfig mixedStreamVideoConfig4 = this.f195192Y1.videoConfig;
            int i5 = mixedStreamVideoConfig4.width;
            mixedStreamLayoutRegionConfig.locationX = (int) (((double) i5) * d2);
            int i6 = mixedStreamVideoConfig4.height;
            mixedStreamLayoutRegionConfig.locationY = (int) (((double) i6) * d7);
            mixedStreamLayoutRegionConfig.width = (int) (((double) i5) * d3);
            mixedStreamLayoutRegionConfig.height = (int) (((double) i6) * d4);
            evx evxVar4 = this.f14988I;
            StringBuilder sb3 = new StringBuilder();
            String str112 = str15;
            sb3.append(str112);
            sb3.append(arrayList4.hashCode());
            sb3.append(", mv.height:");
            sb3.append(this.f195192Y1.videoConfig.height);
            sb3.append(",mv.width:");
            sb3.append(this.f195192Y1.videoConfig.width);
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
            evxVar4.m122843l(sb3.toString());
            mixedStreamLayoutRegionConfig.alpha = d5;
            mixedStreamLayoutRegionConfig.zOrder = i2;
            if (c == 255) {
                mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_VIDEO_ONLY;
            } else {
                mixedStreamLayoutRegionConfig.mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
            }
            mixedStreamLayoutRegionConfig.renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
            mixedStreamLayoutRegionConfig.regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
            evx evxVar5 = this.f14988I;
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
            evxVar5.m122843l(sb4.toString());
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
        MixedStreamConfig mixedStreamConfig2 = this.f195192Y1;
        mixedStreamConfig2.userConfigExtraInfo = this.f195216g1;
        mixedStreamConfig2.regions = (MixedStreamLayoutRegionConfig[]) arrayList5.toArray(new MixedStreamLayoutRegionConfig[arrayList5.size()]);
        evx evxVar6 = this.f14988I;
        evxVar6.m122843l("volc setLayout", str4 + arrayList5.size() + ",regions.hashcode" + arrayList5.hashCode());
    }

    @Override // p153l.o410.InterfaceC19026f
    /* JADX INFO: renamed from: P0 */
    public void mo20958P0(g510 g510Var, int i, int i2, int i3, int i4) {
        this.f195171T0 = i4;
        this.f195175U0 = i2;
        this.f195179V0 = i3;
    }

    /* JADX INFO: renamed from: P5 */
    public void m211976P5(wpw wpwVar) {
        this.f14988I.m122843l("addMRtcLRemoteStatsUpdataHandle", "handler:" + wpwVar);
        this.f195254w1 = wpwVar;
    }

    /* JADX INFO: renamed from: P7 */
    public void m211978P7(gbl0 gbl0Var) {
        this.f14988I.m122843l("setVideoChannelTextureViewListener", "listner:" + gbl0Var, "useTexture:" + this.f195183W0.f180181Z0);
        this.f195249t2 = gbl0Var;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: Q0 */
    public int mo20962Q0() {
        return this.f195188X1 ? m212047r6() : m212049s6();
    }

    /* JADX INFO: renamed from: Q5 */
    public void m211979Q5(MRtcClientRoleChangedHandler mRtcClientRoleChangedHandler) {
        this.f195260z1 = mRtcClientRoleChangedHandler;
    }

    /* JADX INFO: renamed from: Q7 */
    public void m211981Q7(ebl0 ebl0Var) {
        this.f195243q2 = ebl0Var;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: R0 */
    public void mo20654R0(uow uowVar, EGLContext eGLContext) {
        if (uowVar == null || this.f195255w2 == 1) {
            return;
        }
        if (this.f195176U1 == null) {
            this.f14988I.m122843l("startRecord", "engine == null, may be appid is null");
            this.f195157P0.mo165950g(4352, 806, 0, this);
            return;
        }
        wvx wvxVar = this.f14987H;
        long j = this.f195184W1;
        wvxVar.f191058c1 = j;
        if (j == 1) {
            wvxVar.f191001B0 = "M".equals(mo21051w1()) ? "VolcMaster" : "VolcSlaver";
        } else {
            wvxVar.f191001B0 = "VolcAudience";
        }
        Log.e("lqdebug", "volc startRecord");
        super.mo20654R0(uowVar, eGLContext);
        if (!(uowVar instanceof ror)) {
            throw new InvalidParameterException("Parameters error");
        }
        ror rorVar = (ror) uowVar;
        this.f195183W0 = rorVar;
        this.f14988I.m122843l("volc startRecord");
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "VolcPushFilter startRecord");
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "videoWidth:" + uowVar.f175506s + ",videoHeight:" + uowVar.f175508t + ",visualWidth:" + uowVar.f175510u + ",visualHeight:" + uowVar.f175511v + ",encodeWidth:" + uowVar.f175494m + ",encodeHeight:" + uowVar.f175496n + ",videoBitrate:" + uowVar.f175451H + ",audioBitrate:" + uowVar.f175462S + ",videoFPS:" + uowVar.f175449F + ",codecFPS:" + uowVar.f180160E0 + ",mergeCanvasWidth:" + rorVar.f175490k + ",mergeCanvasHeight:" + rorVar.f175492l + ",codecFPS:" + uowVar.f180160E0 + ",isHard:" + uowVar.f180156A0);
        this.f195212e3 = 2;
        this.f195193Y2 = false;
        this.f195205c2 = false;
        this.f195197Z2 = false;
        synchronized (this.f195195Z0) {
            try {
                m211850a6(this.f195184W1);
                wvx wvxVar2 = this.f14987H;
                long jCurrentTimeMillis = System.currentTimeMillis();
                wvxVar2.f191062e = jCurrentTimeMillis;
                this.f195119B2 = jCurrentTimeMillis;
                ror rorVar2 = this.f195183W0;
                m211765C6(rorVar2.f164226g1, rorVar2.f180157B0);
                if (this.f195216g1 != null) {
                    ror rorVar3 = this.f195183W0;
                    if (rorVar3.f164227h1 && this.f195219h1 == null && !rorVar3.f180179X0) {
                        m212060y7(this.f195216g1);
                    }
                }
                this.f195255w2 = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        yt0.m217280g().m217295p(m20725W1(), yt0.f201475f);
        wvx wvxVar3 = this.f14987H;
        wvxVar3.f191042W = this.f195183W0.f180157B0;
        wvxVar3.f191061d1 = uowVar.m197027d();
        wvx wvxVar4 = this.f14987H;
        wvxVar4.f191055b1 = uowVar.f175473b0 ? 1L : 0L;
        wvxVar4.f191114x = uowVar.f180187v0;
        wvxVar4.f191044X = this.f195183W0.f164226g1;
        wvxVar4.f191009F0 = uowVar.f175451H;
        if (this.f195176U1 != null) {
            wvxVar4.f191095p = RTCEngineEx.getSDKVersion();
        }
        this.f14987H.f191065f = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: R5 */
    public void m211982R5(MRtcPusherHandler mRtcPusherHandler) {
        this.f195221h3 = mRtcPusherHandler;
    }

    /* JADX INFO: renamed from: R6 */
    public void m211983R6() {
        this.f14988I.m122843l("pauseRecording");
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "pauseRecording");
        RTCRoomEx rTCRoomEx = this.f195180V1;
        if (rTCRoomEx != null) {
            rTCRoomEx.publishStreamAudio(false);
        }
    }

    /* JADX INFO: renamed from: R7 */
    public void m211984R7(fbl0 fbl0Var) {
        this.f195245r2 = fbl0Var;
    }

    /* JADX INFO: renamed from: S5 */
    public void m211985S5(MRtcQualityHandler mRtcQualityHandler) {
        this.f195256x1 = mRtcQualityHandler;
    }

    /* JADX INFO: renamed from: S6 */
    public void m211986S6() {
        this.f14988I.m122843l("pauseSurroundMusic");
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 != null) {
            iMediaPlayerM211945z6.pause();
        } else {
            this.f14988I.m122843l("pauseSurroundMusic", "audioMixingManager is null");
        }
    }

    /* JADX INFO: renamed from: S7 */
    public void m211987S7(int i, int i2, int i3) {
        if (this.f195176U1 == null) {
            this.f14988I.m122843l("setVideoConfig", "fatal error mRtcEngine is null");
            return;
        }
        int i4 = this.f195183W0.f180174S0;
        if (i4 == 0) {
            i4 = 15;
        }
        VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig();
        videoEncoderConfig.width = i;
        videoEncoderConfig.height = i2;
        videoEncoderConfig.frameRate = i4;
        videoEncoderConfig.maxBitrate = i3;
        if (csx.m112235R().m112255G0()) {
            int iM112258H0 = (int) (csx.m112235R().m112258H0() * i3);
            videoEncoderConfig.minBitrate = iM112258H0;
            this.f14988I.m122843l("setMinBitrate", Integer.valueOf(iM112258H0));
        }
        this.f14988I.m122843l("setVideoConfig", "width:" + i + ",height:" + i2 + ",bitrate:" + i3 + ",fps:" + i4);
        this.f195176U1.setVideoEncoderConfig(videoEncoderConfig);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: T0 */
    public int mo20972T0() {
        return 0;
    }

    /* JADX INFO: renamed from: T5 */
    public void m211988T5(MRtcReceiveSeiHandler mRtcReceiveSeiHandler) {
        this.f195152N1 = mRtcReceiveSeiHandler;
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m211989T6(int i, String str, int i2, double d, double d2, boolean z, double d3) {
        IAudioEffectPlayer iAudioEffectPlayerM211940y6 = m211940y6();
        if (iAudioEffectPlayerM211940y6 == null) {
            this.f14988I.m122842k("playEffect", "volc engine is null");
            return false;
        }
        AudioMixingType audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT;
        if (!z) {
            audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        }
        iAudioEffectPlayerM211940y6.unloadAll();
        iAudioEffectPlayerM211940y6.preload(i, str);
        return iAudioEffectPlayerM211940y6.start(i, str, new AudioEffectPlayerConfig(audioMixingType, 1, 0, 0)) > 0;
    }

    /* JADX INFO: renamed from: T7 */
    public void m211990T7(String str) {
        this.f14988I.m122843l("volc setVideoMixerBackgroundImgUrl", str);
        if (this.f195192Y1 == null) {
            this.f195192Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        this.f195192Y1.backgroundImageURL = str;
    }

    /* JADX INFO: renamed from: U6 */
    public void m211992U6() {
        this.f14987H.f191101r = m211902p6();
        this.f14988I.m122852u();
    }

    /* JADX INFO: renamed from: U7 */
    public void m211993U7(int i, int i2, int i3, int i4) {
        this.f14988I.m122843l("setVideoMixerBitrate", "bitrate:" + i, "Mixfps:" + i2);
        this.f195235n1 = i / 1000;
        this.f195237o1 = i2;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: V0 */
    public long mo20979V0() {
        return 0L;
    }

    /* JADX INFO: renamed from: V5 */
    public void m211994V5(MRtcTokenWillExpireHander mRtcTokenWillExpireHander) {
        this.f195252v1 = mRtcTokenWillExpireHander;
    }

    /* JADX INFO: renamed from: V6 */
    public void m211995V6() {
        this.f14987H.f191004D = mo21053x1();
        this.f14987H.f191008F = mo20955O0();
        this.f14987H.f191010G = mo21037q1();
        this.f14987H.f191000B = mo20926F1();
        this.f14987H.f191024N = mo21051w1();
        this.f14987H.f191026O = mo21013h1();
        this.f14987H.f191028P = mo20991Y0();
        this.f14987H.f191110v = getVideoWidth();
        this.f14987H.f191112w = mo21021k0();
        this.f14987H.f191077j = mo21012h0();
        this.f14987H.f191080k = mo20952N1();
        this.f14987H.f191083l = mo20982W0();
        this.f14987H.f191101r = m211902p6();
        this.f14987H.f191034S = m20728Z1().f175512w;
        this.f14987H.f191036T = m20728Z1().f175513x;
        this.f14987H.f191038U = m211760B6();
        wvx wvxVar = this.f14987H;
        wvxVar.f191040V = this.f195232l2 ? 1L : 0L;
        wvxVar.f191032R = 1000L;
        if (this.f195176U1 != null) {
            wvxVar.f191095p = RTCEngineEx.getSDKVersion();
        }
        wvx wvxVar2 = this.f14987H;
        uow uowVar = this.f15000s;
        wvxVar2.f191009F0 = uowVar.f175451H;
        wvxVar2.f191068g = uowVar.f180163H0 ? 2L : 0L;
        wvxVar2.f191073h1 = uowVar.f180179X0 ? 1 : 0;
        wvx wvxVar3 = this.f14987H;
        wvxVar3.f191082k1 = this.f15000s.f180163H0 ? 1 : 0;
        wvxVar3.f191052a1 = this.f195235n1;
        wvxVar3.f191085l1 = u6y.m194722F().m194748a().getWidth();
        this.f14987H.f191088m1 = u6y.m194722F().m194748a().getHeight();
        this.f14987H.f191091n1 = u6y.m194722F().m194788w();
        wvx wvxVar4 = this.f14987H;
        wvxVar4.f191094o1 = this.f15000s.f180174S0;
        wvxVar4.f191078j0 = this.f195123D2;
        wvxVar4.f191100q1.clear();
        this.f14987H.f191103r1.clear();
        this.f14988I.m122826H();
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: W0 */
    public int mo20982W0() {
        return 0;
    }

    /* JADX INFO: renamed from: W5 */
    public void m211996W5(int i) {
        this.f14988I.m122843l("adjustPlaybackSignalVolume", "volume:" + i);
        RTCEngineEx rTCEngineEx = this.f195176U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setPlaybackVolume(i);
        }
    }

    /* JADX INFO: renamed from: W6 */
    public void m211997W6(boolean z) {
        this.f14988I.m122843l("registerAudioFrameObserver", "" + z);
        RTCEngineEx rTCEngineEx = this.f195176U1;
        if (rTCEngineEx != null) {
            AudioFrameCallbackMethod audioFrameCallbackMethod = AudioFrameCallbackMethod.AUDIO_FRAME_CALLBACK_PLAYBACK;
            AudioProcessorMethod audioProcessorMethod = AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD;
            if (!z) {
                rTCEngineEx.disableAudioFrameCallback(audioFrameCallbackMethod);
                this.f195176U1.disableAudioProcessor(audioProcessorMethod);
            } else {
                AudioFormat audioFormat = new AudioFormat(AudioSampleRate.AUDIO_SAMPLE_RATE_44100, AudioChannel.AUDIO_CHANNEL_STEREO, 1024);
                this.f195176U1.enableAudioFrameCallback(audioFrameCallbackMethod, audioFormat);
                this.f195176U1.enableAudioProcessor(audioProcessorMethod, audioFormat);
            }
        }
    }

    /* JADX INFO: renamed from: W7 */
    public void m211998W7(int i, int i2) {
        this.f14988I.m122843l("setVideoSourceType", "index:" + i + ", sourceType:" + i2);
        StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
        VideoSourceType videoSourceType = VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL;
        RTCEngineEx rTCEngineEx = this.f195176U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setVideoSourceType(streamIndex, videoSourceType);
        }
    }

    @Override // p153l.dpl
    /* JADX INFO: renamed from: X */
    public void mo20986X() {
        this.f195154O0 = false;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: X0 */
    public long mo20987X0() {
        return 0L;
    }

    /* JADX INFO: renamed from: X7 */
    public void m212000X7(gkl0 gkl0Var) {
        this.f195247s2 = gkl0Var;
        m212009b8(0);
        m212009b8(1);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: Y */
    public void mo20656Y(g510 g510Var, uow uowVar) {
        super.mo20656Y(g510Var, uowVar);
        this.f195228k0 = g510Var;
        if (uowVar == null) {
            return;
        }
        this.f195183W0 = (ror) uowVar;
        m211810O7();
        g510 g510Var2 = this.f195228k0;
        if (g510Var2 != null) {
            this.f195178V = g510Var2.m128993l();
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "videoWidth:" + this.f15000s.f175506s + ",videoHeight:" + this.f15000s.f175508t + ",visualWidth:" + this.f15000s.f175510u + ",visualHeight:" + this.f15000s.f175511v + ",encodeWidth:" + this.f15000s.f175494m + ",encodeHeight:" + this.f15000s.f175496n + ",videoBitrate:" + this.f15000s.f175451H + ",audioBitrate:" + this.f15000s.f175462S + ",videoFPS:" + this.f15000s.f175449F + ",codecFPS:" + this.f15000s.f180160E0 + ",mergeCanvasWidth:" + ((ror) this.f15000s).f175490k + ",mergeCanvasHeight:" + ((ror) this.f15000s).f175492l + ",codecFPS:" + this.f15000s.f180160E0 + ",isHard:" + this.f15000s.f180156A0);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: Y0 */
    public int mo20991Y0() {
        RTCRoomStats rTCRoomStats = this.f195253v2;
        if (rTCRoomStats != null) {
            return rTCRoomStats.txVideoKBitRate;
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y5 */
    public int m212001Y5(int i) {
        this.f14988I.m122843l("changeRole", Integer.valueOf(i));
        boolean z = i == 1;
        int i2 = this.f195184W1;
        boolean z2 = i != i2;
        m211973N7(z);
        synchronized (this.f195195Z0) {
            if (1 == i) {
                try {
                    m211810O7();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f195184W1 = i;
        long j = i;
        this.f14987H.f191058c1 = j;
        if (z2) {
            if (j == 2) {
                mo20739i2();
                this.f14987H.f191001B0 = "VolcAudience";
            } else {
                mo20737g2();
                this.f14987H.f191001B0 = "M".equals(mo21051w1()) ? "VolcMaster" : "VolcSlaver";
            }
            m211972N6(i2, this.f195184W1);
            this.f14987H.f191065f = System.currentTimeMillis();
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y7 */
    public int m212003Y7(int i) {
        this.f14988I.m122843l("setVoiceReverbType", Integer.valueOf(i));
        if (this.f195176U1 == null) {
            return -1;
        }
        VoiceChangerType voiceChangerTypeM157617d = ma1.m157614b().m157617d(i);
        if (voiceChangerTypeM157617d != null) {
            int voiceChangerType = this.f195176U1.setVoiceChangerType(voiceChangerTypeM157617d);
            this.f14988I.m122843l("setVoiceChangerType", Integer.valueOf(i), Integer.valueOf(voiceChangerType));
            return voiceChangerType;
        }
        VoiceReverbType voiceReverbTypeM157616c = ma1.m157614b().m157616c(i);
        if (voiceReverbTypeM157616c != null) {
            int voiceReverbType = this.f195176U1.setVoiceReverbType(voiceReverbTypeM157616c);
            this.f14988I.m122843l("setVoiceReverbType", Integer.valueOf(i), Integer.valueOf(voiceReverbType));
            return voiceReverbType;
        }
        this.f14988I.m122843l("setVoiceReverbType", "error preset" + i);
        return -1;
    }

    /* JADX INFO: renamed from: Z7 */
    public void m212005Z7(boolean z) {
        RTCEngineEx rTCEngineEx = this.f195176U1;
        if (rTCEngineEx != null) {
            rTCEngineEx.setEarMonitorMode(z ? EarMonitorMode.EAR_MONITOR_MODE_ON : EarMonitorMode.EAR_MONITOR_MODE_OFF);
        }
        this.f14988I.m122843l("volc setVoicebackwardsEnable" + z);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: a0 */
    public long mo20997a0() {
        return u6y.m194722F().m194770l();
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: b1 */
    public long mo21000b1() {
        return 0L;
    }

    /* JADX INFO: renamed from: b7 */
    public void m212008b7() {
        this.f14988I.m122843l("resumeRecording");
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "resumeRecording");
        m211954G6(this.f195232l2);
        this.f195188X1 = true;
    }

    /* JADX INFO: renamed from: b8 */
    public void m212009b8(int i) {
        try {
            CongressUtil congressUtil = this.f195225j1;
            if (congressUtil != null) {
                congressUtil.setYuvCallback(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
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
        if (this.f14987H.f191058c1 == 1) {
            mo20738h2();
        } else {
            mo20736f2();
        }
    }

    /* JADX INFO: renamed from: c7 */
    public void m212010c7() {
        this.f14988I.m122843l("resumeSurroundMusic");
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 != null) {
            iMediaPlayerM211945z6.resume();
        } else {
            this.f14988I.m122843l("resumeSurroundMusic", "audioMixingManager is null");
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, p153l.evx.InterfaceC16844b
    /* JADX INFO: renamed from: d1 */
    public void mo20733d1() {
        if (this.f195211e2) {
            return;
        }
        boolean z = this.f195212e3 > 0;
        if (this.f14987H.f191058c1 == 1) {
            m211995V6();
        } else {
            m211992U6();
        }
        if (z) {
            wvx wvxVar = this.f14987H;
            if (wvxVar.f191070g1 < this.f195212e3 || this.f195144K2) {
                return;
            }
            wvxVar.f191117y0 = 14L;
            wvxVar.f191081k0 = 14;
            this.f14988I.m122843l("MediaError", com.tencent.connect.common.Constants.VIA_REPORT_TYPE_MAKE_FRIEND);
            q210.InterfaceC19500a interfaceC19500a = this.f195157P0;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(4353, 14, 0, this);
            }
            Handler handler = this.f195126E2;
            if (handler != null) {
                handler.post(new RunnableC21376b());
            }
        }
    }

    /* JADX INFO: renamed from: d7 */
    public void m212013d7(int i) {
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 != null) {
            iMediaPlayerM211945z6.selectAudioTrack(i);
        }
    }

    /* JADX INFO: renamed from: d8 */
    public void m212014d8(String str) {
        if (this.f195213f1) {
            return;
        }
        this.f14988I.m122843l("startSurroundMusic", "" + str);
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 == null) {
            this.f14988I.m122843l("startSurroundMusic", "player is null");
            return;
        }
        MediaPlayerConfig mediaPlayerConfig = new MediaPlayerConfig(AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH, 1);
        mediaPlayerConfig.autoPlay = true;
        iMediaPlayerM211945z6.setEventHandler(this.f195209d3);
        if (iMediaPlayerM211945z6.open(str, mediaPlayerConfig) == 0) {
            iMediaPlayerM211945z6.setProgressInterval(500L);
            this.f195213f1 = true;
            m211803M7(null, 1, 0);
        } else {
            kod0 kod0Var = this.f195158P1;
            if (kod0Var != null) {
                kod0Var.mo20129a();
            }
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
        super.mo20660e1(l6mVar);
        if (!(l6mVar instanceof ExtAudioWrapper)) {
            throw new InvalidParameterException("ISurroundMusic must implement by ExtAudioWrapper");
        }
        l6m l6mVar2 = this.f14990K;
        if (l6mVar2 != null) {
            ((ExtAudioWrapper) l6mVar2).m144341r2();
            ((ExtAudioWrapper) this.f14990K).m21087J2(new C21382h());
            ((ExtAudioWrapper) this.f14990K).mo21127s1(1);
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m212015e6(boolean z) {
        this.f195143K1 = z;
    }

    /* JADX INFO: renamed from: e7 */
    public int m212016e7(String str) {
        RTCRoomEx rTCRoomEx = this.f195180V1;
        if (rTCRoomEx != null) {
            return (int) rTCRoomEx.sendRoomMessage(str);
        }
        return -1;
    }

    /* JADX INFO: renamed from: e8 */
    public void m212017e8(String str, boolean z, boolean z2, int i) {
        if (this.f195213f1) {
            return;
        }
        this.f14988I.m122843l("startSurroundMusic", "" + str + ",loopback:" + z + ", cycle");
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 != null) {
            AudioMixingType audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
            if (z) {
                audioMixingType = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT;
            }
            MediaPlayerConfig mediaPlayerConfig = new MediaPlayerConfig(audioMixingType, i);
            mediaPlayerConfig.autoPlay = true;
            iMediaPlayerM211945z6.setEventHandler(this.f195209d3);
            if (iMediaPlayerM211945z6.open(str, mediaPlayerConfig) == 0) {
                iMediaPlayerM211945z6.setProgressInterval(500L);
                this.f195213f1 = true;
                m211803M7(null, 1, 0);
            } else {
                kod0 kod0Var = this.f195158P1;
                if (kod0Var != null) {
                    kod0Var.mo20129a();
                }
            }
        }
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: f */
    public void mo20661f() {
        this.f14988I.m122843l("volc stopRecord");
        this.f195188X1 = false;
        this.f195255w2 = 0;
        if (this.f14987H.f191058c1 == 1) {
            mo20739i2();
        } else {
            mo20737g2();
        }
        Timer timer = this.f195214f2;
        if (timer != null) {
            timer.cancel();
            this.f195214f2 = null;
        }
        m211770D6();
        m211839X6();
        PipelineConcurrentHashMap pipelineConcurrentHashMap = this.f195238o2;
        if (pipelineConcurrentHashMap != null) {
            pipelineConcurrentHashMap.clear();
        }
        super.m20747p2();
        yt0.m217280g().m217296q(yt0.f201475f);
        PipelineConcurrentHashMap<Long, iny> pipelineConcurrentHashMap2 = this.f195133H0;
        if (pipelineConcurrentHashMap2 != null && !pipelineConcurrentHashMap2.isEmpty()) {
            this.f195133H0.clear();
        }
        this.f14989J = MomoCodec.MomoCodecState.STOP;
        this.f195157P0.mo165950g(8193, 0, 0, this);
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: f2 */
    public void mo20736f2() {
        this.f14988I.m122843l("pullStart_v3", Boolean.valueOf(this.f195215f3));
        if (this.f195215f3) {
            return;
        }
        this.f195215f3 = true;
        this.f14987H.f191067f1 = (!TextUtils.isEmpty(this.f195145L0) || TextUtils.isEmpty(this.f195191Y0)) ? 0L : 1L;
        this.f14987H.f191050a = System.currentTimeMillis();
        long j = this.f195117A2;
        if (j == -1) {
            wvx wvxVar = this.f14987H;
            long jCurrentTimeMillis = System.currentTimeMillis();
            wvx wvxVar2 = this.f14987H;
            wvxVar.f191062e = jCurrentTimeMillis - wvxVar2.f191062e;
            this.f195117A2 = wvxVar2.f191062e;
        } else {
            this.f195117A2 = j;
        }
        this.f14987H.f191065f = System.currentTimeMillis() - this.f14987H.f191065f;
        super.mo20736f2();
    }

    /* JADX INFO: renamed from: f7 */
    public void m212019f7(boolean z) {
        if (z) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->AGORA", "set double push");
        }
        this.f195125E1 = z;
        this.f195201b1 = z;
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
        this.f195215f3 = false;
        this.f14988I.m122843l("pullStop_v3");
        wvx wvxVar = this.f14987H;
        wvxVar.f191078j0 = this.f195123D2;
        if (wvxVar.f191053b) {
            wvxVar.f191071h = System.currentTimeMillis() - this.f14987H.f191050a;
        }
        super.mo20737g2();
    }

    /* JADX INFO: renamed from: g6 */
    public void m212021g6(boolean z, String str) {
        this.f195242q1 = z;
        this.f195240p1 = str;
    }

    /* JADX INFO: renamed from: g7 */
    public void m212022g7() {
        RTCEngineEx rTCEngineEx = this.f195176U1;
        evx evxVar = this.f14988I;
        if (rTCEngineEx == null) {
            evxVar.m122843l("setAudioConfig", "fatal error mRtcEngine is null");
            return;
        }
        evxVar.m122843l("mmLiveAudioProfile:" + this.f195132G2 + ",mmLiveAudioScenario:" + this.f195135H2 + ",getAudioProfile() = " + csx.m112235R().m112384t() + ",getAudioScenario()=" + csx.m112235R().m112387u());
        int i = this.f195132G2;
        if (i != -1) {
            this.f195257x2 = m212058x6(i);
            this.f14987H.f191093o0 = this.f195132G2;
        } else {
            int iM112384t = csx.m112235R().m112384t();
            if (iM112384t != -1) {
                this.f195257x2 = m212058x6(iM112384t);
                this.f14987H.f191093o0 = iM112384t;
            } else {
                this.f195257x2 = m212058x6(1);
                this.f14987H.f191093o0 = 1;
            }
        }
        int i2 = this.f195135H2;
        if (i2 != -1) {
            this.f195259y2 = m212038n6(i2);
            this.f14987H.f191096p0 = this.f195135H2;
        } else {
            int iM112387u = csx.m112235R().m112387u();
            if (iM112387u != -1) {
                this.f195259y2 = m212038n6(iM112387u);
                this.f14987H.f191096p0 = iM112387u;
            } else {
                this.f195259y2 = m212038n6(0);
                this.f14987H.f191096p0 = 0;
            }
        }
        int i3 = this.f195183W0.f180183b1;
        this.f195176U1.setAudioProfile(this.f195257x2);
        this.f195176U1.setAudioScenario(this.f195259y2);
        this.f14988I.m122843l("setAudioConfig", "audioProfile:" + this.f195257x2.value() + ", audioScenario:" + this.f195259y2.value());
        this.f14987H.f191003C0 = (long) m211891m6(this.f195257x2);
    }

    @Override // p153l.wyl
    public int getRoomType() {
        return this.f195187X0;
    }

    @Override // p153l.wyl
    public String getServerIpAddr() {
        return StringUtil.ALL_INTERFACES;
    }

    @Override // p153l.wyl
    public int getVideoWidth() {
        if (this.f195204c1 || this.f195201b1) {
            return 0;
        }
        return this.f15000s.f175494m;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: h0 */
    public int mo21012h0() {
        return 0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: h1 */
    public int mo21013h1() {
        RTCRoomStats rTCRoomStats = this.f195253v2;
        if (rTCRoomStats != null) {
            return rTCRoomStats.txAudioKBitRate;
        }
        return 0;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: h2 */
    public void mo20738h2() {
        this.f14988I.m122843l("pushStart_v3");
        if (this.f195215f3) {
            return;
        }
        this.f195215f3 = true;
        this.f14987H.f191050a = System.currentTimeMillis();
        long j = this.f195117A2;
        wvx wvxVar = this.f14987H;
        if (j == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            wvx wvxVar2 = this.f14987H;
            wvxVar.f191062e = jCurrentTimeMillis - wvxVar2.f191062e;
            this.f195117A2 = wvxVar2.f191062e;
        } else {
            wvxVar.f191062e = j;
        }
        this.f14987H.f191110v = getVideoWidth();
        this.f14987H.f191112w = mo21021k0();
        this.f14987H.f191118z = mo21035p1();
        this.f14987H.f190998A = mo20913A0();
        wvx wvxVar3 = this.f14987H;
        uow uowVar = this.f15000s;
        wvxVar3.f191068g = uowVar.f180163H0 ? 2L : 0L;
        wvxVar3.f191073h1 = uowVar.f180179X0 ? 1 : 0;
        this.f14987H.f191061d1 = this.f15000s.m197027d();
        wvx wvxVar4 = this.f14987H;
        uow uowVar2 = this.f15000s;
        wvxVar4.f191055b1 = uowVar2.f175473b0 ? 1L : 0L;
        wvxVar4.f191114x = uowVar2.f180187v0;
        wvxVar4.f191044X = this.f195183W0.f164226g1;
        wvxVar4.f191082k1 = uowVar2.f180163H0 ? 1 : 0;
        super.mo20738h2();
    }

    /* JADX INFO: renamed from: h6 */
    public void m212024h6(boolean z) {
        this.f14988I.m122843l("enableDualStreamMode", Boolean.valueOf(z));
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "call enableDualStreamMode:" + z);
        this.f195208d2 = z;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: i2 */
    public void mo20739i2() {
        this.f14988I.m122843l("pushStop_v3");
        this.f195215f3 = false;
        wvx wvxVar = this.f14987H;
        wvxVar.f191078j0 = this.f195123D2;
        if (wvxVar.f191053b) {
            wvxVar.f191071h = System.currentTimeMillis() - this.f14987H.f191050a;
        }
        super.mo20739i2();
    }

    /* JADX INFO: renamed from: i7 */
    public void m212028i7(int i) {
        float f = i / 100.0f;
        if (f <= 0.0f) {
            f = 0.0f;
        }
        this.f195163R0 = f * 0.8f;
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 != null) {
            iMediaPlayerM211945z6.setVolume(i, AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH);
        } else {
            this.f14988I.m122843l("setAudioMixingVolume audioMixingManager is null");
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: j1 */
    public long mo21018j1(int i, int i2, Object obj) {
        return 0L;
    }

    /* JADX INFO: renamed from: j8 */
    public int m212030j8(String str, String str2, String str3) {
        if (this.f14987H.f191053b) {
            return m211877i8(str, str3);
        }
        this.f14988I.m122843l("subscribeOhterRoom", "not join room, stage:channelid:" + str);
        this.f195217g2 = true;
        this.f195220h2 = str3;
        this.f195223i2 = String.valueOf(str);
        return 0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: k0 */
    public int mo21021k0() {
        if (this.f195204c1 || this.f195201b1) {
            return 0;
        }
        return this.f15000s.f175496n;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: k2 */
    public void mo20742k2(String str) {
        String strM211919t6 = m211919t6(str);
        synchronized (this.f195195Z0) {
            try {
                RTCEngineEx rTCEngineEx = this.f195176U1;
                if (rTCEngineEx != null) {
                    rTCEngineEx.sendSEIMessage(StreamIndex.STREAM_INDEX_MAIN, strM211919t6.getBytes(), 0, SEICountPerFrame.SEI_COUNT_PER_FRAME_SINGLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k8 */
    public int m212033k8(String str) {
        this.f14988I.m122843l("unSubscribeOtherRoom");
        RTCRoomEx rTCRoomEx = this.f195180V1;
        if (rTCRoomEx == null) {
            return -4;
        }
        rTCRoomEx.stopForwardStreamToRooms();
        this.f195129F2 = false;
        return 0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: l1 */
    public long mo21024l1() {
        return 0L;
    }

    /* JADX INFO: renamed from: l7 */
    public void m212035l7(int i, int i2) {
        this.f195132G2 = i;
        this.f195135H2 = i2;
        this.f14988I.m122843l("VolcPusherFilter", "setmmLiveAudioProfile:" + this.f195132G2 + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA + this.f195135H2);
    }

    /* JADX INFO: renamed from: l8 */
    public void m212036l8(String str) {
        this.f195191Y0 = str;
        this.f14988I.m122843l("updateChannelkey", "key:" + str);
        if (this.f195180V1 == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f195180V1.updateToken(this.f195191Y0);
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: m0 */
    public int mo21027m0() {
        return 0;
    }

    /* JADX INFO: renamed from: m7 */
    public void m212037m7(int i) {
        this.f195167S0 = i;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: n0 */
    public long mo21029n0() {
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: n1 */
    public int mo21030n1() {
        return this.f195179V0;
    }

    /* JADX INFO: renamed from: n6 */
    public AudioScenarioType m212038n6(int i) {
        if (i != 0) {
            return i != 1 ? AudioScenarioType.GAMESTREAMING : AudioScenarioType.DEFAULT;
        }
        return AudioScenarioType.GAMESTREAMING;
    }

    /* JADX INFO: renamed from: n7 */
    public void m212039n7(int i) {
        this.f14987H.f191074i = i;
    }

    /* JADX INFO: renamed from: n8 */
    public void m212040n8(String str) {
        this.f14988I.m122843l("updateRtmpUrl", str);
        if (this.f195176U1 == null || this.f195157P0 == null || TextUtils.isEmpty(str)) {
            this.f14988I.m122843l("updateRtmpUrl:" + str + ",errorengin is :" + this.f195176U1);
            return;
        }
        if (str.equals(this.f14987H.f191114x)) {
            this.f14988I.m122842k("updateRtmpUrl", "url  is no difference: newUrl:" + str + ",old:is" + this.f14987H.f191114x);
            return;
        }
        this.f14987H.f191114x = str;
        this.f195176U1.stopPushMixedStream(this.f195147L2, MixedStreamPushTargetType.PUSH_TO_CDN);
        this.f195205c2 = false;
        this.f14988I.m122843l("updateRtmpUrl:" + str + ",stopLiveTranscoding:taskId" + this.f195147L2);
        MRtcPusherHandler mRtcPusherHandler = this.f195221h3;
        if (mRtcPusherHandler != null) {
            mRtcPusherHandler.onPushChangeStreamUrl(str);
        }
        m211786H7(str);
    }

    @Override // p153l.zej, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (csx.m112235R().m112368n2()) {
            GLES20.glFlush();
        }
        this.texture_in = i;
        mo20652M1();
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: o0 */
    public long mo21033o0() {
        return 0L;
    }

    /* JADX INFO: renamed from: o6 */
    public int m212041o6() {
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 != null) {
            return iMediaPlayerM211945z6.getAudioTrackCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o7 */
    public void m212042o7(int i) {
        this.f14987H.f191104s = i;
        this.f14988I.m122843l("setBusinessType volc", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o8 */
    public void m212043o8(int i, int i2) {
        this.f14988I.m122843l("updateTranscodeVideoWH", "width:" + i, "height:" + i2, "mergeW:" + this.f195183W0.f175490k, "mergeH:" + this.f195183W0.f175492l, "parW:" + this.f195183W0.f175506s, ",parH:" + this.f195183W0.f175508t);
        MixedStreamConfig mixedStreamConfig = this.f195192Y1;
        if (mixedStreamConfig == null) {
            this.f14988I.m122843l("updateTranscodeVideoWH", "mixedStreamConfig is null");
            return;
        }
        MixedStreamVideoConfig mixedStreamVideoConfig = mixedStreamConfig.videoConfig;
        mixedStreamVideoConfig.width = i;
        mixedStreamVideoConfig.height = i2;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: p1 */
    public int mo21035p1() {
        ror rorVar = this.f195183W0;
        int i = rorVar.f175490k;
        return i > 0 ? i : rorVar.f175506s;
    }

    /* JADX INFO: renamed from: p7 */
    public void m212044p7(String str) {
        this.f14988I.m122843l("setChannelkey", "key:" + str);
        this.f195191Y0 = str;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: q1 */
    public long mo21037q1() {
        return this.f195124E0;
    }

    /* JADX INFO: renamed from: q6 */
    public double m212045q6() {
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: q7 */
    public void m212046q7(boolean z) {
        this.f195131G1 = z;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: r0 */
    public long mo21040r0() {
        return 0L;
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: r1 */
    public boolean mo20668r1() {
        return this.f195125E1;
    }

    /* JADX INFO: renamed from: r6 */
    public int m212047r6() {
        return this.f195139J0;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: s0 */
    public int mo21043s0() {
        return 0;
    }

    /* JADX INFO: renamed from: s6 */
    public int m212049s6() {
        return this.f195142K0;
    }

    /* JADX INFO: renamed from: s7 */
    public void m212050s7(boolean z) {
        this.f195144K2 = z;
        this.f14988I.m122843l("setEnableConferenceReconnect:" + z);
    }

    public void stopSurroundMusic() {
        this.f14988I.m122843l("stopSurroundMusic");
        if (this.f195176U1 != null) {
            IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
            if (iMediaPlayerM211945z6 != null) {
                iMediaPlayerM211945z6.stop();
            } else {
                this.f14988I.m122843l("stopSurroundMusic", "audioMixingManager is null");
            }
            this.f195213f1 = false;
        }
    }

    /* JADX INFO: renamed from: t7 */
    public int m212051t7(boolean z) {
        RTCEngineEx rTCEngineEx = this.f195176U1;
        if (rTCEngineEx != null) {
            return z ? rTCEngineEx.setDefaultAudioRoute(AudioRoute.AUDIO_ROUTE_SPEAKERPHONE) : rTCEngineEx.setDefaultAudioRoute(AudioRoute.AUDIO_ROUTE_EARPIECE);
        }
        return -1;
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

    /* JADX INFO: renamed from: u6 */
    public float m212052u6() {
        return this.f195163R0;
    }

    /* JADX INFO: renamed from: v6 */
    public long m212054v6() {
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 != null && this.f195213f1) {
            return iMediaPlayerM211945z6.getTotalDuration();
        }
        this.f14988I.m122843l("getSurroundMusicDuration", "audioMixingManager is null");
        return 0L;
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: w1 */
    public String mo21051w1() {
        ror rorVar = this.f195183W0;
        return (rorVar == null || rorVar.f164227h1) ? "M" : p7f.LATITUDE_SOUTH;
    }

    /* JADX INFO: renamed from: w6 */
    public long m212056w6() {
        IMediaPlayer iMediaPlayerM211945z6 = m211945z6();
        if (iMediaPlayerM211945z6 != null && this.f195213f1) {
            return iMediaPlayerM211945z6.getPosition();
        }
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "getSurroundMusicPos");
        return 0L;
    }

    /* JADX INFO: renamed from: w7 */
    public void m212057w7(String str) {
        if (this.f195176U1 == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            b7y.m102882c().m102887f("setEngineParameters", "para", str);
            return;
        }
        try {
            this.f14988I.m122843l("setEngineParameters", "success", Integer.valueOf(this.f195176U1.setRuntimeParameters(new JSONObject(str))));
        } catch (JSONException e) {
            this.f14988I.m122843l("setEngineParameters", "failed", e.getMessage());
        }
    }

    @Override // p153l.wyl
    /* JADX INFO: renamed from: x1 */
    public long mo21053x1() {
        return this.f195226j2 * 1024;
    }

    /* JADX INFO: renamed from: x6 */
    public AudioProfileType m212058x6(int i) {
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
    public void mo20670y(int i, int i2) {
        this.f14988I.m122843l("enableAudioVolumeIndication", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f195176U1 != null) {
            float f = i2 / 10.0f;
            Log.e("lqdebug", "enableAudioVolumeIndication:" + i + ",smooth:" + f);
            AudioPropertiesConfig audioPropertiesConfig = new AudioPropertiesConfig(i, false, true, AudioReportMode.AUDIO_REPORT_MODE_NORMAL, f);
            audioPropertiesConfig.enableVoicePitch = true;
            this.f195176U1.enableAudioPropertiesReport(audioPropertiesConfig);
        }
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: y0 */
    public void mo20671y0(int i, int i2, int i3) {
        this.f14988I.m122843l("enableAudioVolumeIndication", Integer.valueOf(i), Integer.valueOf(i2), "vad:" + i3);
        boolean z = i3 != 0;
        if (this.f195176U1 != null) {
            AudioPropertiesConfig audioPropertiesConfig = new AudioPropertiesConfig(i, false, z, AudioReportMode.AUDIO_REPORT_MODE_NORMAL, i2 / 10.0f);
            audioPropertiesConfig.enableVoicePitch = true;
            this.f195176U1.enableAudioPropertiesReport(audioPropertiesConfig);
        }
    }

    /* JADX INFO: renamed from: y7 */
    public void m212060y7(String str) {
        if (this.f195183W0 == null || str == null) {
            return;
        }
        if (this.f195192Y1 == null) {
            this.f195192Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        ror rorVar = this.f195183W0;
        int i = rorVar.f175490k;
        if (i > 0) {
            m212043o8(i, rorVar.f175492l);
        } else {
            int i2 = rorVar.f175506s;
            if (i2 > 0) {
                m212043o8(i2, i2);
            }
        }
        m211975O6(str);
        m211892m8(this.f195183W0.f180187v0);
    }

    /* JADX INFO: renamed from: z7 */
    public void m212061z7(String str, boolean z) {
        if (this.f195183W0 == null || str == null) {
            return;
        }
        if (this.f195192Y1 == null) {
            this.f195192Y1 = MixedStreamConfig.defaultMixedStreamConfig();
        }
        ror rorVar = this.f195183W0;
        int i = rorVar.f175490k;
        if (i > 0) {
            m212043o8(i, rorVar.f175492l);
        } else {
            int i2 = rorVar.f175506s;
            if (i2 > 0) {
                m212043o8(i2, i2);
            }
        }
        m211975O6(str);
        if (!this.f195199a2) {
            m211892m8(this.f195183W0.f180187v0);
            return;
        }
        if (this.f14987H.f191053b && this.f14997R != null && z) {
            String string = "" + this.f195216g1;
            try {
                JSONObject jSONObject = new JSONObject(string);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("asr", 44100);
                jSONObject2.put("w", this.f15000s.f175490k);
                jSONObject2.put("h", this.f15000s.f175492l);
                jSONObject2.put("gop", this.f15000s.f175450G);
                jSONObject2.put("fps", this.f15000s.f175449F);
                jSONObject2.put("vbr", this.f15000s.f175451H);
                jSONObject2.put("vcpf", this.f15000s.f180163H0 ? 2 : 1);
                jSONObject.put("mixInfo", jSONObject2);
                string = jSONObject.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            String str2 = string;
            arx.C15814d c15814dM99797h = arx.m99789d().m99797h(this.f14997R.m106170b());
            evx evxVar = this.f14988I;
            StringBuilder sb = new StringBuilder("server mix update uid:");
            sb.append(this.f195183W0.f180157B0);
            sb.append(",momoid:");
            sb.append(c15814dM99797h.f73010c);
            sb.append("roomid:");
            sb.append(this.f14997R);
            evxVar.m122843l(this.f14997R.m106176h());
            HttpWrapper httpWrapper = HttpWrapper.getInstance();
            String str3 = c15814dM99797h.f73008a;
            String str4 = c15814dM99797h.f73009b;
            ror rorVar2 = this.f195183W0;
            int i3 = rorVar2.f180157B0;
            String str5 = c15814dM99797h.f73010c;
            brx brxVar = this.f14997R;
            String strM106176h = brxVar != null ? brxVar.m106176h() : rorVar2.f164226g1;
            String str6 = this.f195183W0.f164226g1;
            wvx wvxVar = this.f14987H;
            httpWrapper.updateChannel(str3, str4, i3, str5, strM106176h, str6, wvxVar.f190999A0, str2, "agora", this.f15000s.f180187v0, (int) wvxVar.f191104s);
        }
    }

    /* JADX INFO: renamed from: l.xmp0$h */
    public class C21382h implements ExtAudioWrapper.InterfaceC4259i {
        public C21382h() {
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

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter, com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: A */
    public void mo20645A() {
    }

    /* JADX INFO: renamed from: P6 */
    public void m211977P6() {
    }

    /* JADX INFO: renamed from: Z6 */
    public void m212004Z6() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: b0 */
    public void mo20657b0() {
    }

    /* JADX INFO: renamed from: c8 */
    public void m212011c8() {
    }

    /* JADX INFO: renamed from: f8 */
    public void m212020f8() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    public MediaBaseCodecFilter getFilter() {
        return this;
    }

    /* JADX INFO: renamed from: h8 */
    public void m212026h8() {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: o */
    public void mo20665o() {
    }

    /* JADX INFO: renamed from: l.xmp0$j */
    public class C21384j implements IAudioFrameObserver {
        public C21384j() {
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameObserver
        public void onPlaybackAudioFrame(IAudioFrame iAudioFrame) {
            if (xmp0.this.f195239p0 == null || xmp0.this.f195148M0 == null) {
                return;
            }
            int iData_size = iAudioFrame.data_size();
            byte[] bArrM144336o2 = new byte[iData_size];
            iAudioFrame.getDataBuffer().get(bArrM144336o2, 0, iData_size);
            int i = xmp0.this.f195184W1;
            xmp0 xmp0Var = xmp0.this;
            if (i != 2) {
                if (xmp0Var.f195239p0 != null) {
                    xmp0.this.f195239p0.m115191i(new oxd0(bArrM144336o2, System.currentTimeMillis(), iAudioFrame.channel().value()));
                }
            } else {
                if (xmp0Var.f195183W0.f175461R != 1 && iAudioFrame.channel().value() == 1) {
                    bArrM144336o2 = jc00.m144336o2(bArrM144336o2, iData_size);
                }
                xmp0.this.f195148M0.mo109339C(new oxd0(bArrM144336o2, System.currentTimeMillis(), 2));
            }
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameObserver
        public void onRecordAudioFrame(IAudioFrame iAudioFrame) {
            oxd0 oxd0VarMo19373C;
            ByteBuffer byteBuffer;
            int iValue = iAudioFrame.channel().value();
            int unused = xmp0.this.f195226j2;
            xmp0.m211868g3(xmp0.this);
            int iData_size = iAudioFrame.data_size();
            byte[] bArrM144336o2 = new byte[iData_size];
            if (!xmp0.this.f195134H1) {
                iAudioFrame.getDataBuffer().get(bArrM144336o2, 0, iData_size);
            }
            if (xmp0.this.f195229k1 != null) {
                xmp0.this.f195229k1.onPcmDateCallback(xmp0.this.f195183W0.f180157B0, bArrM144336o2, 44100, iValue != 1);
            }
            oxd0 oxd0Var = null;
            if (((MediaBaseCodecFilter) xmp0.this).f14990K != null) {
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) xmp0.this).f14990K).mo21100W1(xmp0.this.f195163R0);
                ((ExtAudioWrapper) ((MediaBaseCodecFilter) xmp0.this).f14990K).m21086I2(2048, xmp0.this.f195183W0.f175459P, iValue, "Volc");
                oxd0VarMo19373C = ((ExtAudioWrapper) ((MediaBaseCodecFilter) xmp0.this).f14990K).mo19373C(new oxd0(bArrM144336o2, xmp0.this.f195167S0, iValue));
                if (oxd0VarMo19373C != null && (byteBuffer = oxd0VarMo19373C.f149639b) != null) {
                    byteBuffer.get(bArrM144336o2, 0, iData_size);
                    iAudioFrame.getDataBuffer().rewind();
                    iAudioFrame.getDataBuffer().put(bArrM144336o2);
                    iAudioFrame.getDataBuffer().rewind();
                }
            } else {
                oxd0VarMo19373C = null;
            }
            if (xmp0.this.f195148M0 == null || !xmp0.this.f195154O0) {
                return;
            }
            if (((MediaBaseCodecFilter) xmp0.this).f14990K != null) {
                if (xmp0.this.f195239p0 != null) {
                    xmp0.this.f195239p0.m115192j(1.0f);
                    if (xmp0.this.f195183W0.f180179X0) {
                        xmp0.this.f195239p0.m115193k(1.0f);
                    }
                    oxd0Var = xmp0.this.f195239p0.m115189g();
                }
                if (oxd0Var != null) {
                    xmp0 xmp0Var = xmp0.this;
                    ByteBuffer byteBufferM115190h = oxd0VarMo19373C != null ? xmp0Var.f195239p0.m115190h(oxd0VarMo19373C.m169687c(), oxd0Var.m169687c(), oxd0Var.m169689e()) : xmp0Var.f195239p0.m115190h(bArrM144336o2, oxd0Var.m169687c(), oxd0Var.m169689e());
                    if (byteBufferM115190h != null) {
                        oxd0Var = new oxd0(byteBufferM115190h.array(), oxd0Var.m169688d(), iValue);
                    }
                }
            }
            if (oxd0Var != null) {
                oxd0 oxd0Var2 = new oxd0(iValue == 1 ? jc00.m144336o2(oxd0Var.m169687c(), oxd0Var.m169689e()) : oxd0Var.m169687c(), xmp0.this.f195167S0, 2);
                oxd0Var2.m169691g(false);
                if (xmp0.this.f195148M0 != null) {
                    xmp0.this.f195148M0.mo109339C(oxd0Var2);
                    if (xmp0.m211916t3(xmp0.this) % 50 == 0) {
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                        return;
                    }
                    return;
                }
                return;
            }
            if (xmp0.this.f195184W1 != 2) {
                if (iValue == 1) {
                    bArrM144336o2 = jc00.m144336o2(bArrM144336o2, iData_size);
                }
                oxd0 oxd0Var3 = new oxd0(bArrM144336o2, xmp0.this.f195167S0, 2);
                oxd0Var3.m169691g(false);
                if (xmp0.this.f195148M0 != null) {
                    xmp0.this.f195148M0.mo109339C(oxd0Var3);
                    if (xmp0.m211916t3(xmp0.this) % 50 == 0) {
                        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE->VOLC", "=====replace======:Agora send pcm to IJK ");
                    }
                }
            }
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameObserver
        public void onCaptureMixedAudioFrame(IAudioFrame iAudioFrame) {
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameObserver
        public void onMixedAudioFrame(IAudioFrame iAudioFrame) {
        }

        @Override // com.p074ss.bytertc.engine.IAudioFrameObserver
        public void onRemoteUserAudioFrame(RemoteStreamKey remoteStreamKey, IAudioFrame iAudioFrame) {
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m211961J5(upw upwVar) {
    }

    /* JADX INFO: renamed from: J7 */
    public void m211963J7(float f) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: K1 */
    public void mo20651K1(oxd0 oxd0Var) {
    }

    /* JADX INFO: renamed from: M5 */
    public void m211970M5(vpw vpwVar) {
    }

    /* JADX INFO: renamed from: Q6 */
    public void m211980Q6(int i) {
    }

    /* JADX INFO: renamed from: U5 */
    public void m211991U5(ypw ypwVar) {
    }

    /* JADX INFO: renamed from: a7 */
    public void m212006a7(int i) {
    }

    /* JADX INFO: renamed from: d6 */
    public void m212012d6(boolean z) {
    }

    /* JADX INFO: renamed from: f6 */
    public void m212018f6(boolean z) {
    }

    /* JADX INFO: renamed from: g8 */
    public void m212023g8(int i) {
    }

    /* JADX INFO: renamed from: h7 */
    public void m212025h7(int i) {
    }

    /* JADX INFO: renamed from: i6 */
    public void m212027i6(boolean z) {
    }

    /* JADX INFO: renamed from: j6 */
    public void m212029j6(boolean z) {
    }

    /* JADX INFO: renamed from: k6 */
    public void m212031k6(boolean z) {
    }

    /* JADX INFO: renamed from: k7 */
    public void m212032k7(boolean z) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: m1 */
    public void mo20664m1(ByteBuffer byteBuffer) {
    }

    @Override // com.momo.pipline.codec.MediaBaseCodecFilter
    /* JADX INFO: renamed from: n2 */
    public void mo20745n2(uow uowVar) {
    }

    /* JADX INFO: renamed from: r7 */
    public void m212048r7(double d) {
    }

    /* JADX INFO: renamed from: u7 */
    public void m212053u7(String str) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: v0 */
    public void mo20669v0(ByteBuffer byteBuffer) {
    }

    /* JADX INFO: renamed from: v7 */
    public void m212055v7(String str) {
    }

    /* JADX INFO: renamed from: l.xmp0$a */
    public class C21375a implements IMediaPlayerEventHandler {
        public C21375a() {
        }

        @Override // com.p074ss.bytertc.engine.IMediaPlayerEventHandler
        public void onMediaPlayerStateChanged(int i, PlayerState playerState, PlayerError playerError) {
            ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onMediaPlayerStateChanged", "playerId:" + i + ", state:" + playerState.toString());
            if (i == xmp0.this.f195234m2) {
                if (playerState == PlayerState.FINISHED || playerState == PlayerState.LOOP_FINISHED) {
                    xmp0.this.f195213f1 = false;
                    xmp0.this.m211803M7(null, 2, 0);
                    if (xmp0.this.f195248t1 != null) {
                        xmp0.this.f195248t1.onAudioMixingFinished();
                        ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onAudioMixingFinished");
                        return;
                    }
                    return;
                }
                if (playerState == PlayerState.PLAYING) {
                    if (xmp0.this.f195158P1 != null) {
                        xmp0.this.f195158P1.mo20131c();
                        ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onAudioMixingPlay");
                        return;
                    }
                    return;
                }
                if (playerState == PlayerState.PAUSED) {
                    if (xmp0.this.f195158P1 != null) {
                        xmp0.this.f195158P1.mo20130b();
                        ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onAudioMixingPaused");
                        return;
                    }
                    return;
                }
                if (playerState == PlayerState.STOPPED) {
                    if (xmp0.this.f195158P1 != null) {
                        xmp0.this.f195158P1.mo20132d();
                        ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onAudioMixingStoped");
                        return;
                    }
                    return;
                }
                if (playerState != PlayerState.FAILED || xmp0.this.f195158P1 == null) {
                    return;
                }
                xmp0.this.f195158P1.mo20129a();
                ((MediaBaseCodecFilter) xmp0.this).f14988I.m122843l("onAudioMixingFailed");
            }
        }

        @Override // com.p074ss.bytertc.engine.IMediaPlayerEventHandler
        public void onMediaPlayerPlayingProgress(int i, long j) {
        }

        @Override // com.p074ss.bytertc.engine.IMediaPlayerEventHandler
        public void onMediaPlayerEvent(int i, PlayerEvent playerEvent, String str) {
        }
    }

    /* JADX INFO: renamed from: B7 */
    public void m211947B7(boolean z, int i) {
    }

    /* JADX INFO: renamed from: X5 */
    public void m211999X5(long j, float f) {
    }

    /* JADX INFO: renamed from: Y6 */
    public void m212002Y6(int i, int i2) {
    }

    /* JADX INFO: renamed from: a8 */
    public void m212007a8(int i, double d) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: l0 */
    public void mo20663l0(uow uowVar, EGLContext eGLContext) {
    }

    /* JADX INFO: renamed from: l6 */
    public void m212034l6(long j, boolean z) {
    }

    @Override // com.momo.pipline.MomoInterface.MomoCodec
    /* JADX INFO: renamed from: p */
    public void mo20667p(String str, int i) {
    }

    /* JADX INFO: renamed from: x7 */
    public void m212059x7(boolean z, boolean z2) {
    }

    @RequiresApi(api = 15)
    public xmp0(Context context, g510 g510Var, q210.InterfaceC19500a interfaceC19500a, uow uowVar) {
        super(context);
        this.f195166S = "Pipeline_Normal_pip->PIPLINE->VOLC";
        this.f195170T = true;
        this.f195174U = -1;
        this.f195182W = false;
        this.f195186X = false;
        this.f195190Y = true;
        this.f195194Z = null;
        this.f195124E0 = 0L;
        this.f195127F0 = 0;
        this.f195130G0 = 0L;
        this.f195133H0 = new PipelineConcurrentHashMap<>();
        this.f195136I0 = new PipelineConcurrentHashMap<>();
        this.f195139J0 = 0;
        this.f195142K0 = 0;
        this.f195145L0 = null;
        this.f195151N0 = false;
        this.f195154O0 = false;
        this.f195160Q0 = 1.0f;
        this.f195163R0 = 1.0f;
        this.f195167S0 = 44100;
        this.f195171T0 = 0;
        this.f195175U0 = 0;
        this.f195179V0 = 0;
        this.f195187X0 = -1;
        this.f195191Y0 = null;
        this.f195195Z0 = new Object();
        this.f195198a1 = 0;
        this.f195201b1 = false;
        this.f195204c1 = false;
        this.f195207d1 = new Object();
        this.f195210e1 = new PipelineConcurrentHashMap();
        this.f195213f1 = false;
        this.f195222i1 = null;
        this.f195225j1 = null;
        this.f195231l1 = 0;
        this.f195233m1 = 0;
        this.f195235n1 = DetectDelayStopHelper.TYPE_DETECT_PICKNOISE;
        this.f195237o1 = 0;
        this.f195240p1 = "";
        this.f195242q1 = false;
        this.f195116A1 = new xpw();
        this.f195118B1 = new xpw();
        this.f195120C1 = new imw();
        this.f195122D1 = new tpw();
        this.f195125E1 = false;
        this.f195128F1 = false;
        this.f195131G1 = true;
        this.f195134H1 = false;
        this.f195137I1 = 0L;
        this.f195140J1 = null;
        this.f195143K1 = false;
        this.f195146L1 = Long.MIN_VALUE;
        this.f195149M1 = 1000L;
        this.f195152N1 = null;
        this.f195161Q1 = 1;
        this.f195164R1 = System.currentTimeMillis();
        this.f195168S1 = null;
        this.f195172T1 = -1;
        this.f195176U1 = null;
        this.f195180V1 = null;
        this.f195184W1 = 1;
        this.f195188X1 = false;
        this.f195199a2 = false;
        this.f195202b2 = false;
        this.f195205c2 = false;
        this.f195208d2 = false;
        this.f195211e2 = false;
        this.f195214f2 = null;
        this.f195217g2 = false;
        this.f195220h2 = "";
        this.f195226j2 = 0;
        this.f195230k2 = false;
        this.f195232l2 = false;
        this.f195234m2 = 0;
        this.f195236n2 = 1;
        this.f195238o2 = new PipelineConcurrentHashMap();
        this.f195241p2 = new ArrayList<>();
        this.f195243q2 = null;
        this.f195245r2 = null;
        this.f195247s2 = null;
        this.f195249t2 = null;
        this.f195251u2 = null;
        this.f195255w2 = 0;
        this.f195257x2 = AudioProfileType.AUDIO_PROFILE_HD_MONO;
        this.f195259y2 = AudioScenarioType.GAMESTREAMING;
        this.f195261z2 = null;
        this.f195117A2 = -1L;
        this.f195119B2 = -1L;
        this.f195121C2 = -1L;
        this.f195123D2 = 0;
        this.f195126E2 = new Handler(Looper.getMainLooper());
        this.f195129F2 = false;
        this.f195132G2 = -1;
        this.f195135H2 = -1;
        this.f195138I2 = 1;
        this.f195141J2 = 3;
        this.f195144K2 = false;
        this.f195147L2 = "";
        this.f195150M2 = null;
        this.f195156O2 = 0;
        this.f195159P2 = new C21378d();
        this.f195162Q2 = new C21379e();
        this.f195165R2 = new C21380f();
        this.f195169S2 = new C21381g();
        this.f195173T2 = 0;
        this.f195177U2 = 0;
        this.f195181V2 = null;
        this.f195185W2 = new C21383i();
        this.f195189X2 = new C21384j();
        this.f195193Y2 = false;
        this.f195197Z2 = false;
        this.f195200a3 = 0L;
        this.f195203b3 = false;
        this.f195206c3 = 0;
        this.f195209d3 = new C21375a();
        this.f195212e3 = 0;
        this.f195215f3 = false;
        this.f195218g3 = false;
        this.f195224i3 = "";
        this.f195227j3 = false;
        this.f195228k0 = g510Var;
        this.f195183W0 = (ror) uowVar;
        this.f195157P0 = interfaceC19500a;
        this.f195225j1 = new CongressUtil();
        m211755A6(uowVar);
        wvx wvxVar = this.f14987H;
        wvxVar.f191059d = 261L;
        wvxVar.f191064e1 = String.valueOf(hashCode());
        new IntentFilter().addAction("android.intent.action.HEADSET_PLUG");
    }
}
