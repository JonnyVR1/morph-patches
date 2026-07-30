package tv.danmaku.ijk.media.sink;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.mediacore.audio.AudioProcess;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.sink.CongressUtil;
import com.immomo.mediacore.sink.SinkBase;
import com.immomo.mediacore.strinf.VideoQuality;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import io.agora.rtc2.IAudioFrameObserver;
import io.agora.rtc2.IRtcEngineEventHandler;
import io.agora.rtc2.RtcEngine;
import io.agora.rtc2.audio.AudioParams;
import io.agora.rtc2.video.AgoraVideoFrame;
import io.agora.rtc2.video.VideoCanvas;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ldq0;
import p149l.n8c;
import p149l.upk0;
import p149l.z1l0;
import tv.danmaku.ijk.media.streamer.StreamProducer;
import tv.danmaku.ijk.media.streamer.agora.EngineConfig;
import tv.danmaku.ijk.media.streamer.agora.MyEngineEventHandler;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;
import tv.danmaku.ijk.media.util.helpSurface;

/* JADX INFO: loaded from: classes3.dex */
public class AgoraWriter extends SinkBase implements IAudioFrameObserver {

    /* JADX INFO: renamed from: Y */
    private static final float[] f208184Y = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A */
    private boolean f208185A;

    /* JADX INFO: renamed from: B */
    private SinkBase.PcmDateCallback f208186B;

    /* JADX INFO: renamed from: C */
    private SinkBase.PlaybackDateCallback f208187C;

    /* JADX INFO: renamed from: D */
    private SinkBase.RecordDateCallback f208188D;

    /* JADX INFO: renamed from: E */
    VideoQuality f208189E;

    /* JADX INFO: renamed from: F */
    private boolean f208190F;

    /* JADX INFO: renamed from: G */
    private Object f208191G;

    /* JADX INFO: renamed from: H */
    private boolean f208192H;

    /* JADX INFO: renamed from: I */
    private boolean f208193I;

    /* JADX INFO: renamed from: J */
    private boolean f208194J;

    /* JADX INFO: renamed from: K */
    Runnable f208195K;

    /* JADX INFO: renamed from: L */
    private int f208196L;

    /* JADX INFO: renamed from: M */
    private int f208197M;

    /* JADX INFO: renamed from: N */
    private boolean f208198N;

    /* JADX INFO: renamed from: O */
    private float f208199O;

    /* JADX INFO: renamed from: P */
    private float f208200P;

    /* JADX INFO: renamed from: Q */
    private CongressUtil f208201Q;

    /* JADX INFO: renamed from: R */
    private int f208202R;

    /* JADX INFO: renamed from: S */
    public int f208203S;

    /* JADX INFO: renamed from: T */
    private int f208204T;

    /* JADX INFO: renamed from: U */
    private z1l0 f208205U;

    /* JADX INFO: renamed from: V */
    private int f208206V;

    /* JADX INFO: renamed from: W */
    private boolean f208207W;

    /* JADX INFO: renamed from: X */
    private MRtcEventHandler f208208X;

    /* JADX INFO: renamed from: a */
    private EngineConfig f208209a;

    /* JADX INFO: renamed from: b */
    private MyEngineEventHandler f208210b;

    /* JADX INFO: renamed from: c */
    private RtcEngine f208211c;

    /* JADX INFO: renamed from: d */
    private EGLContext f208212d;

    /* JADX INFO: renamed from: e */
    private Context f208213e;

    /* JADX INFO: renamed from: f */
    private boolean f208214f;

    /* JADX INFO: renamed from: g */
    private boolean f208215g;

    /* JADX INFO: renamed from: h */
    private boolean f208216h;

    /* JADX INFO: renamed from: i */
    private Handler f208217i;

    /* JADX INFO: renamed from: j */
    private MRtcEventHandler f208218j;

    /* JADX INFO: renamed from: k */
    private float f208219k;

    /* JADX INFO: renamed from: l */
    private float f208220l;

    /* JADX INFO: renamed from: m */
    private AudioProcess f208221m;

    /* JADX INFO: renamed from: n */
    private StreamProducer f208222n;

    /* JADX INFO: renamed from: o */
    protected ijkMediaStreamer.OnSurroundMusicStatusListener f208223o;

    /* JADX INFO: renamed from: p */
    private boolean f208224p;

    /* JADX INFO: renamed from: q */
    private boolean f208225q;

    /* JADX INFO: renamed from: r */
    private String f208226r;

    /* JADX INFO: renamed from: s */
    private String f208227s;

    /* JADX INFO: renamed from: t */
    private boolean f208228t;

    /* JADX INFO: renamed from: u */
    private boolean f208229u;

    /* JADX INFO: renamed from: v */
    private int f208230v;

    /* JADX INFO: renamed from: w */
    private int f208231w;

    /* JADX INFO: renamed from: x */
    private boolean[] f208232x;

    /* JADX INFO: renamed from: y */
    private HashMap f208233y;

    /* JADX INFO: renamed from: z */
    private Map f208234z;

    public AgoraWriter(Context context, EGLContext eGLContext, StreamProducer streamProducer, String str, boolean z) {
        this.f208214f = true;
        this.f208215g = false;
        this.f208216h = false;
        this.f208217i = new Handler(Looper.getMainLooper());
        this.f208219k = 1.0f;
        this.f208220l = 1.0f;
        this.f208224p = false;
        this.f208225q = false;
        this.f208226r = null;
        this.f208227s = null;
        this.f208228t = false;
        this.f208229u = false;
        this.f208230v = 0;
        this.f208231w = 7;
        this.f208232x = new boolean[7 + 1];
        this.f208233y = new HashMap();
        this.f208234z = new HashMap();
        this.f208185A = false;
        this.f208189E = null;
        this.f208190F = false;
        this.f208191G = new Object();
        this.f208192H = false;
        this.f208193I = false;
        this.f208194J = false;
        this.f208195K = null;
        this.f208196L = 0;
        this.f208197M = 0;
        this.f208198N = false;
        this.f208199O = 1.0f;
        this.f208200P = 0.7f;
        this.f208201Q = null;
        this.f208202R = -1;
        this.f208203S = 44100;
        this.f208204T = 1;
        this.f208206V = 2;
        this.f208207W = true;
        this.f208208X = new MRtcEventHandler() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.1
            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onAudioMixingFinished() {
                AgoraWriter agoraWriter = AgoraWriter.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = agoraWriter.f208223o;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m222834a(agoraWriter.f208222n.f208636C, 2, 0);
                }
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onConnectionLost() {
                Log.e("AgoraWriter", "onConnectionLost");
                AgoraWriter.this.f208222n.notify(300, -304, 10, this);
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onError(final int i) {
                Log.e("AgoraWriter", "onError" + i);
                if (i == 17 || i == 18 || i == 1603 || i == 1 || i == 109 || i == 110 || i == 106) {
                    return;
                }
                AgoraWriter.this.setErrorCode(i);
                AgoraWriter.this.f208217i.post(new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!AgoraWriter.this.isHost() || AgoraWriter.this.f208222n == null) {
                            AgoraWriter.this.stopRecording();
                            if (AgoraWriter.this.f208222n != null) {
                                AgoraWriter.this.f208222n.notify(300, -304, i, this);
                            }
                            if (AgoraWriter.this.f208218j != null) {
                                AgoraWriter.this.f208218j.onUserOffline(AgoraWriter.this.getUserID(), i);
                                return;
                            }
                            return;
                        }
                        int i2 = i;
                        C224761 c224761 = C224761.this;
                        if (i2 != 0) {
                            AgoraWriter.this.f208222n.notify(300, -304, i, this);
                        } else {
                            AgoraWriter.this.f208222n.notify(300, -304, 12, this);
                        }
                    }
                });
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onFirstRemoteVideoDecoded(long j, int i, int i2, int i3) {
                Log.e("AgoraWriter", "onFirstRemoteVideoDecoded texture: " + j + ";width:" + i + ";height" + i2);
                AgoraWriter.this.m222178v(j, i, i2);
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onJoinChannelSuccess(String str2, final long j, int i) {
                synchronized (AgoraWriter.this.f208191G) {
                    try {
                        AgoraWriter.this.f208222n.notify(100, 0, 0, this);
                        if (AgoraWriter.this.f208211c == null) {
                            return;
                        }
                        if ((AgoraWriter.this.f208228t || AgoraWriter.this.f208229u) && AgoraWriter.this.getUserID() != j) {
                            AgoraWriter.this.f208217i.post(new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    SurfaceView surfaceView = AgoraWriter.this.f208213e != null ? new SurfaceView(AgoraWriter.this.f208213e) : null;
                                    if (AgoraWriter.this.f208205U == null || surfaceView == null) {
                                        return;
                                    }
                                    n8c.m158485c("AgoraWriter", "receiveVideoData: call onVideoChannelAdded()" + j);
                                    AgoraWriter.this.f208205U.mo19137a((long) ((int) j), surfaceView, 176, 176);
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onJoinChannelfail(String str2, long j, int i) {
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onUserMuteAudio(int i, boolean z2) {
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onUserMuteVideo(int i, boolean z2) {
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onUserOffline(long j, int i) {
                if (AgoraWriter.this.f208234z != null && AgoraWriter.this.f208234z.containsKey(Long.valueOf(j))) {
                    helpSurface helpsurface = (helpSurface) AgoraWriter.this.f208234z.get(Long.valueOf(j));
                    AgoraWriter.this.f208234z.remove(Long.valueOf(j));
                    if (AgoraWriter.this.f208201Q != null) {
                        AgoraWriter.this.f208201Q.setVideoSurface(j, null);
                    }
                    helpsurface.m222873g();
                }
                long jM222156I = AgoraWriter.this.m222156I(j);
                if (jM222156I == -1 || !AgoraWriter.this.f208185A) {
                    return;
                }
                AgoraWriter.this.f208222n.m222659J1(jM222156I, true);
                AgoraWriter.this.f208222n.m222663L1(jM222156I, 0, 0, 0, 5);
                AgoraWriter.this.f208222n.m222718n2(jM222156I, null, 0, null);
                AgoraWriter.this.f208232x[(int) jM222156I] = false;
                AgoraWriter.this.f208233y.remove(Long.valueOf(j));
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onWarning(int i) {
                AgoraWriter agoraWriter;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener;
                if (i != 701 || (onSurroundMusicStatusListener = (agoraWriter = AgoraWriter.this).f208223o) == null) {
                    return;
                }
                onSurroundMusicStatusListener.m222834a(agoraWriter.f208222n.f208636C, -1, 0);
            }
        };
        this.f208227s = str;
        n8c.m158485c("AgoraWriter", "AgoraWriter:");
        this.f208213e = context;
        this.f208222n = streamProducer;
        this.f208212d = eGLContext;
        EngineConfig engineConfig = new EngineConfig();
        this.f208209a = engineConfig;
        engineConfig.f208837c = 0;
        MyEngineEventHandler myEngineEventHandler = new MyEngineEventHandler(this.f208213e, engineConfig, this, this.f208222n);
        this.f208210b = myEngineEventHandler;
        myEngineEventHandler.m222818q(this.f208208X);
        this.f208228t = z;
        this.f208201Q = new CongressUtil();
        m222179w();
        this.f208224p = false;
        this.f208190F = false;
        this.f208230v = 0;
        AudioProcess audioProcess = new AudioProcess();
        this.f208221m = audioProcess;
        int i = this.f208203S;
        audioProcess.openSabineEf(i, 1, (i * 10) / 1000);
        this.f208221m.setSlaveAudioGain(1.0f);
        this.f208221m.setSlaveAudioLevel(1.0f);
        this.f208221m.setMasterAudioLevel(1.0f);
    }

    /* JADX INFO: renamed from: A */
    private final void m222150A(String str, int i) {
        synchronized (this.f208191G) {
            try {
                if (this.f208211c == null) {
                    return;
                }
                if (this.f208225q) {
                    m222151B("1");
                }
                m222153E();
                RtcEngine rtcEngine = this.f208211c;
                if (rtcEngine != null && this.f208207W) {
                    rtcEngine.setDefaultAudioRoutetoSpeakerphone(true);
                }
                this.f208211c.joinChannel(this.f208226r, str, (String) null, i);
                this.f208209a.f208838d = str;
                this.f208225q = true;
                if (this.f208193I || this.f208228t) {
                    m222152C();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m222151B(String str) {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.leaveChannel();
        }
        EngineConfig engineConfig = this.f208209a;
        if (engineConfig != null) {
            int i = engineConfig.f208835a;
            engineConfig.m222799a();
            n8c.m158485c("AgoraWriter", "leaveChannel " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i);
        }
        this.f208225q = false;
    }

    /* JADX INFO: renamed from: C */
    private void m222152C() {
        if (this.f208224p) {
            return;
        }
        this.f208222n.notify(102, 0, 0, this);
        this.f208224p = true;
    }

    /* JADX INFO: renamed from: E */
    private void m222153E() {
        VideoQuality videoQuality;
        int iM222673R0;
        boolean z = this.f208185A;
        StreamProducer streamProducer = this.f208222n;
        if (z) {
            videoQuality = streamProducer.m222740y0();
            iM222673R0 = this.f208222n.m222742z0() / 1000;
        } else {
            videoQuality = streamProducer.getVideoQuality();
            iM222673R0 = this.f208222n.m222673R0() / 1000;
        }
        if (videoQuality == null) {
            return;
        }
        if (videoQuality.resX < 176) {
            videoQuality.resX = 176;
        }
        if (videoQuality.resY < 176) {
            videoQuality.resY = 176;
        }
        n8c.m158485c("AgoraWriter", "setVideoProfileEx1 bitrate:" + iM222673R0);
        enableVideo(this.f208228t ^ true);
    }

    /* JADX INFO: renamed from: G */
    private void m222154G() {
        if (this.f208192H) {
            return;
        }
        this.f208192H = true;
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.registerAudioFrameObserver(null);
            this.f208211c.registerAudioFrameObserver(this);
        }
    }

    /* JADX INFO: renamed from: H */
    private void m222155H() {
        if (this.f208192H) {
            this.f208192H = false;
            RtcEngine rtcEngine = this.f208211c;
            if (rtcEngine != null) {
                rtcEngine.registerAudioFrameObserver(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public long m222156I(long j) {
        long j2;
        if (getUserID() == j || j == this.f208231w || this.f208233y.size() > this.f208231w) {
            return -1L;
        }
        if (!this.f208233y.containsKey(Long.valueOf(j))) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i > this.f208231w) {
                    j2 = 0;
                    break;
                }
                boolean[] zArr = this.f208232x;
                if (!zArr[i]) {
                    j2 = i;
                    z = true;
                    zArr[i] = true;
                    break;
                }
                i++;
            }
            if (z) {
                this.f208233y.put(Long.valueOf(j), Long.valueOf(j2));
            }
        }
        Object obj = this.f208233y.get(Long.valueOf(j));
        if (obj != null) {
            return ((Long) obj).longValue();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: K */
    private void m222157K() {
    }

    /* JADX INFO: renamed from: t */
    private void m222176t() {
        this.f208188D = null;
        this.f208186B = null;
        this.f208187C = null;
    }

    /* JADX INFO: renamed from: u */
    private final void m222177u(int i, int i2) {
        synchronized (this.f208191G) {
            try {
                RtcEngine rtcEngine = this.f208211c;
                if (rtcEngine == null) {
                    return;
                }
                EngineConfig engineConfig = this.f208209a;
                engineConfig.f208835a = i;
                engineConfig.f208836b = i2;
                rtcEngine.setClientRole(i);
                m222157K();
                n8c.m158485c("AgoraWriter", "configEngine " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f208209a.f208836b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m222178v(final long j, final int i, final int i2) {
        if (this.f208228t) {
            return;
        }
        this.f208217i.post(new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.3
            @Override // java.lang.Runnable
            public void run() {
                SurfaceView surfaceView = new SurfaceView(AgoraWriter.this.f208213e);
                boolean z = AgoraWriter.this.f208185A;
                AgoraWriter agoraWriter = AgoraWriter.this;
                if (z) {
                    if (agoraWriter.f208205U != null) {
                        AgoraWriter.this.f208205U.mo19137a(j, null, i, i2);
                        if (AgoraWriter.this.f208221m != null) {
                            AgoraWriter.this.f208221m.clearSurroundFrames();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (agoraWriter.f208211c != null) {
                    AgoraWriter.this.f208211c.setupRemoteVideo(new VideoCanvas(surfaceView, 1, (int) j));
                }
                n8c.m158485c("AgoraWriter", "doRenderRemoteUi:" + AgoraWriter.this.f208205U);
                if (AgoraWriter.this.f208205U != null) {
                    AgoraWriter.this.f208205U.mo19137a(j, surfaceView, i, i2);
                }
            }
        });
        if (this.f208234z.containsKey(Long.valueOf(j)) || !this.f208185A) {
            return;
        }
        long jM222156I = m222156I(j);
        helpSurface helpsurface = new helpSurface(null, jM222156I);
        CongressUtil congressUtil = this.f208201Q;
        if (congressUtil != null) {
            congressUtil.setVideoSurface(j, helpsurface.m222870c());
        }
        if (jM222156I != -1) {
            this.f208222n.m222663L1(jM222156I, i, i2, 0, 5);
        }
        helpsurface.m222874h(this.f208222n.m222658J0());
        this.f208234z.put(Long.valueOf(j), helpsurface);
    }

    /* JADX INFO: renamed from: w */
    private RtcEngine m222179w() {
        if (this.f208211c == null) {
            String strM222186z = m222186z(new byte[]{1, 1, 1});
            if (TextUtils.isEmpty(strM222186z)) {
                upk0.m194883a("NEED TO use your vendor key, get your own key at https://dashboard.agora.io/");
                return null;
            }
            try {
                String str = this.f208227s;
                if (str == null || TextUtils.isEmpty(str)) {
                    this.f208211c = RtcEngine.create(this.f208213e, strM222186z, this.f208210b.f208860v);
                } else {
                    this.f208211c = RtcEngine.create(this.f208213e, this.f208227s, this.f208210b.f208860v);
                }
                boolean z = n8c.f137612a;
            } catch (Exception unused) {
                StreamProducer streamProducer = this.f208222n;
                if (streamProducer != null) {
                    streamProducer.notify(300, -304, -1, this);
                }
            }
            this.f208211c.setRecordingAudioFrameParameters(this.f208203S, 1, 2, 1024);
            this.f208211c.setPlaybackAudioFrameParameters(this.f208203S, 1, 0, 1024);
            this.f208211c.setChannelProfile(1);
            this.f208211c.enableDualStreamMode(false);
            boolean z2 = this.f208228t;
            RtcEngine rtcEngine = this.f208211c;
            if (z2) {
                rtcEngine.disableVideo();
            } else {
                rtcEngine.enableVideo();
            }
        }
        this.f208214f = this.f208211c.isTextureEncodeSupported();
        return this.f208211c;
    }

    /* JADX INFO: renamed from: y */
    private boolean m222180y() {
        return (this.f208188D == null && this.f208186B == null && this.f208187C == null) ? false : true;
    }

    /* JADX INFO: renamed from: D */
    public void m222181D() {
        Log.e("AgoraWriter", "onMediaEngineLoadSuccess");
    }

    /* JADX INFO: renamed from: F */
    public void m222182F(int i) {
        try {
            CongressUtil congressUtil = this.f208201Q;
            if (congressUtil != null) {
                congressUtil.setYuvCallback(i);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: J */
    public void m222183J(long j, ByteBuffer byteBuffer, int i) {
        n8c.m158485c("AgoraWriter", "writevideo:" + i + ";timeStamp:" + j);
        VideoQuality videoQuality = this.f208222n.getVideoQuality();
        if (videoQuality == null) {
            return;
        }
        if (videoQuality.resX < 176) {
            videoQuality.resX = 176;
        }
        if (videoQuality.resY < 176) {
            videoQuality.resY = 176;
        }
        if (this.f208214f || !this.f208215g || this.f208228t) {
            return;
        }
        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
        agoraVideoFrame.format = 1;
        agoraVideoFrame.timeStamp = System.currentTimeMillis();
        agoraVideoFrame.stride = videoQuality.resX;
        agoraVideoFrame.height = videoQuality.resY;
        agoraVideoFrame.rotation = 0;
        agoraVideoFrame.buf = byteBuffer.array();
        synchronized (this.f208191G) {
            try {
                RtcEngine rtcEngine = this.f208211c;
                if (rtcEngine != null && !this.f208193I) {
                    rtcEngine.pushExternalVideoFrame(agoraVideoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = this.f208230v + 1;
        this.f208230v = i2;
        if (i2 > 20) {
            m222152C();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void SabineEffectReset() {
        AudioProcess audioProcess = this.f208221m;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void SabineEffectSet(int i, int i2, float f) {
        AudioProcess audioProcess = this.f208221m;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet(i, i2, f);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void SetSubVideoPos(long j, int i, int i2, int i3, int i4) {
        if (getUserID() == j || !this.f208215g) {
            return;
        }
        long jM222156I = m222156I(j);
        if (jM222156I != -1) {
            this.f208222n.m222661K1(jM222156I, i, i2, i3, i4, 0);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void addEventHandler(MRtcEventHandler mRtcEventHandler) {
        this.f208218j = mRtcEventHandler;
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m222818q(mRtcEventHandler);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void addMRtcAudioHandler(MRtcAudioHandler mRtcAudioHandler) {
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m222819r(mRtcAudioHandler);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void addMRtcAudioHandlerEx(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m222820s(mRtcAudioHandlerEx);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void addMRtcChannelHandler(MRtcChannelHandler mRtcChannelHandler) {
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m222821t(mRtcChannelHandler);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void adjustEQ(int i, boolean z) {
        AudioProcess audioProcess = this.f208221m;
        if (audioProcess != null) {
            audioProcess.adjustEQ(i, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void adjustEf(int i, int i2) {
        AudioProcess audioProcess = this.f208221m;
        if (audioProcess != null) {
            audioProcess.adjustEf(i, i2);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void adjustTune(int i, boolean z) {
        AudioProcess audioProcess = this.f208221m;
        if (audioProcess != null) {
            audioProcess.adjustTune(i, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int changeRole(int i) {
        n8c.m158485c("AgoraWriter", "changeRole:" + i);
        setErrorCode(0);
        int clientRole = -1;
        if (i == this.f208204T) {
            return -1;
        }
        this.f208204T = i;
        this.f208222n.m222731s1(false);
        synchronized (this.f208191G) {
            try {
                if (1 == i) {
                    this.f208215g = true;
                    if (!this.f208214f) {
                        this.f208222n.f208636C.addSoftListener(new ldq0.InterfaceC18199a() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.5
                            @Override // p149l.ldq0.InterfaceC18199a
                            /* JADX INFO: renamed from: a */
                            public void mo149469a(ByteBuffer byteBuffer, long j) {
                                if (AgoraWriter.this.f208193I) {
                                    return;
                                }
                                AgoraWriter.this.m222183J(System.currentTimeMillis(), byteBuffer, byteBuffer.limit());
                            }
                        });
                    }
                } else {
                    this.f208216h = true;
                    this.f208215g = false;
                }
                if ((1 == i && this.f208189E != null) || 2 == i || this.f208193I || this.f208228t) {
                    n8c.m158485c("AgoraWriter", "changeRole:" + i);
                    m222153E();
                    clientRole = this.f208211c.setClientRole(i);
                } else {
                    this.f208190F = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (1 == i && (this.f208193I || this.f208228t)) {
            m222152C();
        }
        return clientRole;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void enableAudio(boolean z) {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            if (z) {
                rtcEngine.enableAudio();
            } else {
                rtcEngine.disableAudio();
            }
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void enableAudioVolumeIndication(int i, int i2) {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.enableAudioVolumeIndication(i, i2, false);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void enableCommMode(boolean z) {
        RtcEngine rtcEngine;
        if (z && (rtcEngine = this.f208211c) != null) {
            rtcEngine.setParameters("{\"che.audio.live_for_comm\":true}");
            return;
        }
        RtcEngine rtcEngine2 = this.f208211c;
        if (rtcEngine2 != null) {
            rtcEngine2.setParameters("{\"che.audio.live_for_comm\":false}");
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void enableVideo(boolean z) {
        VideoQuality videoQuality;
        int iM222673R0;
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            if (!z) {
                rtcEngine.disableVideo();
                return;
            }
            rtcEngine.enableVideo();
            boolean z2 = this.f208185A;
            StreamProducer streamProducer = this.f208222n;
            if (z2) {
                videoQuality = streamProducer.m222740y0();
                iM222673R0 = this.f208222n.m222742z0() / 1000;
            } else {
                videoQuality = streamProducer.getVideoQuality();
                iM222673R0 = this.f208222n.m222673R0() / 1000;
            }
            if (videoQuality == null) {
                return;
            }
            if (videoQuality.resX < 176) {
                videoQuality.resX = 176;
            }
            if (videoQuality.resY < 176) {
                videoQuality.resY = 176;
            }
            n8c.m158485c("AgoraWriter", "setVideoProfileEx1 bitrate:" + iM222673R0);
            this.f208211c.setParameters("{\"che.video.keyFrameInterval\":1}");
            this.f208196L = videoQuality.resX;
            this.f208197M = videoQuality.resY;
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getAudioBitRate() {
        IRtcEngineEventHandler.RtcStats rtcStatsM222827z;
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        if (myEngineEventHandler == null || (rtcStatsM222827z = myEngineEventHandler.m222827z()) == null) {
            return 0;
        }
        return rtcStatsM222827z.txAudioKBitRate;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAudioRxbytes() {
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public String getAudioVideoStatics() {
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        return myEngineEventHandler != null ? myEngineEventHandler.m222822u() : "[(0)]";
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getAvFlag() {
        if (this.f208228t) {
            return 2;
        }
        return super.getAvFlag();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAverageSendBitRateB() {
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        IRtcEngineEventHandler.RtcStats rtcStatsM222827z = myEngineEventHandler != null ? myEngineEventHandler.m222827z() : null;
        if (rtcStatsM222827z != null) {
            return (rtcStatsM222827z.txKBitRate * 1000) / 8;
        }
        return 0L;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getEarMonitoringAudioParams() {
        return null;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public float getMasterAudioLevel() {
        return this.f208219k;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getMixedAudioParams() {
        return null;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public boolean getMuteStatus() {
        return super.getMuteStatus() | (this.f208204T != 1);
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public int getObservedAudioFramePosition() {
        return 0;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getPlaybackAudioParams() {
        return null;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getPublisherVideoHigh() {
        if (this.f208228t) {
            return 0;
        }
        return this.f208197M;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getPublisherVideoWidth() {
        if (this.f208228t) {
            return 0;
        }
        return this.f208196L;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getRecordAudioParams() {
        return null;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getRxbytes() {
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        IRtcEngineEventHandler.RtcStats rtcStatsM222827z = myEngineEventHandler != null ? myEngineEventHandler.m222827z() : null;
        if (rtcStatsM222827z != null) {
            return rtcStatsM222827z.rxBytes;
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public float getSlaveAudioLevel() {
        return this.f208220l;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getStreamerType() {
        return 1;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getSurroundMusicDuration() {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingDuration();
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getSurroundMusicPos() {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingCurrentPosition();
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getTxbytes() {
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        IRtcEngineEventHandler.RtcStats rtcStatsM222827z = myEngineEventHandler != null ? myEngineEventHandler.m222827z() : null;
        if (rtcStatsM222827z != null) {
            return rtcStatsM222827z.txBytes;
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getVideoBitRate() {
        boolean z = this.f208215g;
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        if (z) {
            IRtcEngineEventHandler.LocalVideoStats localVideoStatsM222823v = myEngineEventHandler != null ? myEngineEventHandler.m222823v() : null;
            if (localVideoStatsM222823v != null) {
                return localVideoStatsM222823v.sentBitrate;
            }
            return 0;
        }
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM222825x = myEngineEventHandler != null ? myEngineEventHandler.m222825x() : null;
        if (remoteVideoStatsM222825x != null) {
            return remoteVideoStatsM222825x.receivedBitrate;
        }
        return 0;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getVideoFrameRate() {
        boolean z = this.f208215g;
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        if (z) {
            IRtcEngineEventHandler.LocalVideoStats localVideoStatsM222823v = myEngineEventHandler != null ? myEngineEventHandler.m222823v() : null;
            if (localVideoStatsM222823v != null) {
                return localVideoStatsM222823v.sentFrameRate;
            }
            return 0;
        }
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM222825x = myEngineEventHandler != null ? myEngineEventHandler.m222825x() : null;
        if (remoteVideoStatsM222825x != null) {
            return remoteVideoStatsM222825x.rendererOutputFrameRate;
        }
        return 0;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getVideoFreezeCount() {
        boolean z = this.f208215g;
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        if (z) {
            if (myEngineEventHandler != null) {
                return myEngineEventHandler.m222824w();
            }
            return 0;
        }
        if (myEngineEventHandler != null) {
            return myEngineEventHandler.m222826y();
        }
        return 0;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getVideoRxbytes() {
        MyEngineEventHandler myEngineEventHandler = this.f208210b;
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM222825x = myEngineEventHandler != null ? myEngineEventHandler.m222825x() : null;
        if (remoteVideoStatsM222825x != null) {
            return remoteVideoStatsM222825x.receivedBitrate;
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getWriteByte() {
        return getTxbytes();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void ignoreWriterSEI(boolean z) {
        this.f208229u = z;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public boolean isPlaying() {
        return this.f208216h;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteAllRemoteAudioStream(boolean z) {
        n8c.m158485c("AgoraWriter", "muteAllRemoteAudioStream mute" + z);
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteAllRemoteVideoStream(boolean z) {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteVideoStreams(z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteLocalAudioStream(boolean z) {
        RtcEngine rtcEngine = this.f208211c;
        if (z) {
            if (rtcEngine != null) {
                rtcEngine.adjustRecordingSignalVolume(0);
            }
        } else if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(false);
            this.f208211c.adjustRecordingSignalVolume((int) (this.f208219k * 100.0f));
        }
        setMuteStatus(z);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteLocalAudioStreamForGame(boolean z) {
        n8c.m158485c("AgoraWriter", "muteLocalAudioStreamForGame " + z);
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
        setMuteStatus(z);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteLocalVideoStream(boolean z) {
        this.f208193I = z;
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalVideoStream(z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteRemoteAudioStream(long j, boolean z) {
        n8c.m158485c("AgoraWriter", "muteRemoteAudioStream uid" + j + ";mute:" + z);
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteRemoteAudioStream((int) j, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteRemoteVideoStream(long j, boolean z) {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteRemoteVideoStream((int) j, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void notifyUpdateResolution() {
        n8c.m158485c("AgoraWriter", "notifyUpdateResolution:");
        synchronized (this.f208191G) {
            try {
                StreamProducer streamProducer = this.f208222n;
                if (streamProducer == null) {
                    return;
                }
                if (this.f208185A) {
                    this.f208189E = streamProducer.m222740y0();
                } else {
                    this.f208189E = streamProducer.getVideoQuality();
                }
                if (this.f208189E == null) {
                    return;
                }
                n8c.m158485c("AgoraWriter", "setVideoBitrate width:" + this.f208189E.resX + ";heigh:" + this.f208189E.resY);
                if (this.f208190F) {
                    n8c.m158485c("AgoraWriter", "dealyed changeRole:1");
                    m222153E();
                    this.f208211c.setClientRole(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
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
        return false;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public boolean onPlaybackAudioFrameBeforeMixing(String str, int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, long j, int i7, int i8, long j2) {
        return false;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public boolean onRecordAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        return false;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void pause() {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void pausePlaying() {
        Log.e("AgoraWriter", "pausePlaying");
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(true);
            this.f208211c.muteAllRemoteVideoStreams(true);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void pauseRecording() {
        Log.e("AgoraWriter", "pauseRecording");
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(true);
        }
        Runnable runnable = new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zIsHost = AgoraWriter.this.isHost();
                AgoraWriter agoraWriter = AgoraWriter.this;
                if (zIsHost) {
                    agoraWriter.f208222n.notify(300, -304, 201, this);
                } else if (agoraWriter.f208218j != null) {
                    AgoraWriter.this.f208218j.onUserOffline(AgoraWriter.this.getUserID(), 201);
                }
            }
        };
        this.f208195K = runnable;
        this.f208217i.postDelayed(runnable, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void pauseSurroundMusic() {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.pauseAudioMixing();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void postDrawImage(int i) {
        if (!this.f208214f || i == 0 || !this.f208215g || this.f208228t) {
            return;
        }
        n8c.m158485c("AgoraWriter", "postDrawImage texture: " + i);
        int i2 = this.f208230v + 1;
        this.f208230v = i2;
        if (i2 > 20) {
            m222152C();
        }
        boolean z = this.f208185A;
        StreamProducer streamProducer = this.f208222n;
        VideoQuality videoQualityM222740y0 = z ? streamProducer.m222740y0() : streamProducer.getVideoQuality();
        if (videoQualityM222740y0 == null) {
            return;
        }
        if (videoQualityM222740y0.resX < 176) {
            videoQualityM222740y0.resX = 176;
        }
        if (videoQualityM222740y0.resY < 176) {
            videoQualityM222740y0.resY = 176;
        }
        n8c.m158485c("AgoraWriter", "postDrawImage texture: " + i + "qu.resX:" + videoQualityM222740y0.resX + "qu.resY" + videoQualityM222740y0.resY);
        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
        agoraVideoFrame.format = 10;
        agoraVideoFrame.timeStamp = System.currentTimeMillis();
        agoraVideoFrame.stride = videoQualityM222740y0.resX;
        agoraVideoFrame.height = videoQualityM222740y0.resY;
        agoraVideoFrame.textureID = i;
        agoraVideoFrame.transform = f208184Y;
        synchronized (this.f208191G) {
            try {
                RtcEngine rtcEngine = this.f208211c;
                if (rtcEngine != null && !this.f208193I) {
                    rtcEngine.pushExternalVideoFrame(agoraVideoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public boolean prepare() {
        return true;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void release() {
        stopRecording();
        stopSurroundMusic();
        addMRtcAudioHandler(null);
        addMRtcAudioHandlerEx(null);
        addMRtcChannelHandler(null);
        Handler handler = this.f208217i;
        if (handler != null) {
            handler.removeCallbacks(null, null);
            this.f208217i.removeCallbacksAndMessages(null);
        }
        DeinitAudioTracks();
        synchronized (this.f208191G) {
            try {
                this.f208215g = false;
                this.f208216h = false;
                RtcEngine rtcEngine = this.f208211c;
                if (rtcEngine != null) {
                    rtcEngine.registerAudioFrameObserver(null);
                    RtcEngine.destroy();
                    this.f208211c = null;
                }
                MyEngineEventHandler myEngineEventHandler = this.f208210b;
                if (myEngineEventHandler != null) {
                    myEngineEventHandler.m222817B(this.f208208X);
                    this.f208210b.m222817B(this.f208218j);
                    MyEngineEventHandler myEngineEventHandler2 = this.f208210b;
                    myEngineEventHandler2.f208860v = null;
                    myEngineEventHandler2.m222816A();
                    this.f208210b = null;
                }
                this.f208208X = null;
                this.f208218j = null;
                AudioProcess audioProcess = this.f208221m;
                if (audioProcess != null) {
                    audioProcess.clear();
                    this.f208221m.release();
                    this.f208221m = null;
                }
                this.f208222n = null;
                this.f208213e = null;
                this.f208209a = null;
                this.f208210b = null;
                this.f208212d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void resume() {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void resumePlaying() {
        Log.e("AgoraWriter", "resumePlaying");
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(false);
            this.f208211c.muteAllRemoteVideoStreams(false);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void resumeRecording() {
        Log.e("AgoraWriter", "resumeRecording");
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(false);
            this.f208215g = true;
        }
        Handler handler = this.f208217i;
        if (handler != null) {
            handler.removeCallbacks(this.f208195K);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void resumeSurroundMusic() {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.resumeAudioMixing();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m222184s() {
        try {
            CongressUtil congressUtil = this.f208201Q;
            if (congressUtil != null) {
                congressUtil.clearPcmCallback();
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setAudioHighQualityParameters(boolean z) {
        this.f208198N = z;
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine == null || !z) {
            return;
        }
        rtcEngine.setParameters("{\"che.audio.high.quality.mode\":true}");
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setAudioSamplingRate(int i) {
        this.f208203S = i;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setChannalName(String str) {
        this.f208209a.f208838d = str;
        super.setChannalName(str);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setChannelkey(String str) {
        this.f208226r = str;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setDefaultAudioRoutetoSpeakerphone(boolean z) {
        this.f208207W = z;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int setEnableSpeakerphone(boolean z) {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            return rtcEngine.setEnableSpeakerphone(z);
        }
        return -1;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setEncryptionMode(String str) {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setEncryptionSecret(String str) {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setJsonForPostion(String str) {
        JSONArray jSONArray;
        super.setJsonForPostion(str);
        boolean z = this.f208185A;
        StreamProducer streamProducer = this.f208222n;
        if ((z ? streamProducer.m222740y0() : streamProducer.getVideoQuality()) == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (TextUtils.isEmpty(jSONObject.has(BaseSei.MID) ? jSONObject.getString(BaseSei.MID) : "")) {
                return;
            }
            if (jSONObject.has(BaseSei.CONF)) {
                jSONArray = jSONObject.getJSONArray(BaseSei.CONF);
            } else if (!jSONObject.has("has")) {
                return;
            } else {
                jSONArray = jSONObject.getJSONArray("has");
            }
            if (jSONArray != null && jSONArray.length() != 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    if (jSONObject2 != null && jSONObject2.has("id")) {
                        jSONObject2.getString("id");
                    }
                    if (jSONObject2 != null && jSONObject2.has(BaseSei.f13930X)) {
                        jSONObject2.getDouble(BaseSei.f13930X);
                    }
                    if (jSONObject2 != null && jSONObject2.has(BaseSei.f13931Y)) {
                        jSONObject2.getDouble(BaseSei.f13931Y);
                    }
                    if (jSONObject2 != null && jSONObject2.has("w")) {
                        jSONObject2.getDouble("w");
                    }
                    if (jSONObject2 != null && jSONObject2.has("h")) {
                        jSONObject2.getDouble("h");
                    }
                    if (jSONObject2 != null && jSONObject2.has(BaseSei.f13932Z)) {
                        jSONObject2.getInt(BaseSei.f13932Z);
                    }
                    if (jSONObject2 != null && jSONObject2.has("alpha")) {
                        jSONObject2.getDouble("alpha");
                    }
                    if (jSONObject2 != null && jSONObject2.has("renderMode")) {
                        jSONObject2.getString("renderMode");
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setMasterAudioLevel(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f208199O * f;
        this.f208219k = f2;
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.adjustRecordingSignalVolume((int) (f2 * 100.0f));
        }
        AudioProcess audioProcess = this.f208221m;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setOnSurroundMusicStatusListener(Object obj) {
        this.f208223o = (ijkMediaStreamer.OnSurroundMusicStatusListener) obj;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setParameters(String str) {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.setParameters(str);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setPcmDataCallback(SinkBase.PcmDateCallback pcmDateCallback) {
        this.f208186B = pcmDateCallback;
        if (m222180y()) {
            m222154G();
        } else {
            m222155H();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setPlayBackAudioLevel(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.adjustPlaybackSignalVolume((int) (f * 100.0f));
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setPlaybackDateCallback(SinkBase.PlaybackDateCallback playbackDateCallback) {
        this.f208187C = playbackDateCallback;
        if (m222180y()) {
            m222154G();
        } else {
            m222155H();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setRecordDateCallback(SinkBase.RecordDateCallback recordDateCallback) {
        this.f208188D = recordDateCallback;
        if (m222180y()) {
            m222154G();
        } else {
            m222155H();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setRole(int i) {
        this.f208204T = i;
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.setClientRole(i);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setRoomMode(int i) {
        this.f208202R = 2;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setRtmpPath(String str) {
        super.setRtmpPath(str);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setSlaveAudioLevel(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f208200P * f;
        this.f208220l = f2;
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.adjustAudioMixingVolume((int) (f2 * 100.0f));
        }
        AudioProcess audioProcess = this.f208221m;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setStreamerInOutAndType(int i, String str, String str2) {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setUserID(int i) {
        this.f208209a.f208837c = i;
        super.setUserID(i);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setVideoChannellistener(Object obj) {
        this.f208205U = (z1l0) obj;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startAttachStreamer() {
        this.f208185A = true;
        startRecording();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startPlaying() {
        n8c.m158485c("AgoraWriter", "startPlaying:");
        if (TextUtils.isEmpty(getChannalName())) {
            upk0.m194883a("startPlaying getChannalName null exception");
            return;
        }
        if (getUserID() == 0) {
            upk0.m194883a("startRecording getUserID =0");
            return;
        }
        setErrorCode(0);
        this.f208222n.m222731s1(false);
        if (this.f208189E == null) {
            this.f208222n.m222670P1(200000);
            this.f208222n.m222674R1(176, 176);
        }
        m222177u(2, 33);
        this.f208216h = true;
        m222150A(getChannalName(), (int) getUserID());
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startRecording() {
        n8c.m158485c("AgoraWriter", "startRecording");
        if (TextUtils.isEmpty(getChannalName())) {
            upk0.m194883a("startRecording getChannalName null exception");
            return;
        }
        if (getUserID() == 0) {
            upk0.m194883a("startRecording getUserID =0");
            return;
        }
        setErrorCode(0);
        this.f208190F = false;
        this.f208222n.m222731s1(false);
        m222177u(this.f208204T, 33);
        this.f208215g = true;
        if (!this.f208214f) {
            this.f208222n.f208636C.addSoftListener(new ldq0.InterfaceC18199a() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.4
                @Override // p149l.ldq0.InterfaceC18199a
                /* JADX INFO: renamed from: a */
                public void mo149469a(ByteBuffer byteBuffer, long j) {
                    if (AgoraWriter.this.f208193I) {
                        return;
                    }
                    AgoraWriter.this.m222183J(System.currentTimeMillis(), byteBuffer, byteBuffer.limit());
                }
            });
        }
        this.f208224p = false;
        this.f208230v = 0;
        m222150A(getChannalName(), (int) getUserID());
        AudioProcess audioProcess = this.f208221m;
        if (audioProcess != null) {
            audioProcess.clear();
        }
        if (this.f208185A) {
            m222182F(1);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startSurroundMusic(String str, int i, long j) {
        ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener;
        if (this.f208211c == null || (onSurroundMusicStatusListener = this.f208223o) == null) {
            return;
        }
        onSurroundMusicStatusListener.m222834a(this.f208222n.f208636C, 1, 0);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startSurroundMusicEx(String str, boolean z, boolean z2, int i) {
        ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener;
        if (this.f208211c == null || (onSurroundMusicStatusListener = this.f208223o) == null) {
            return;
        }
        onSurroundMusicStatusListener.m222834a(this.f208222n.f208636C, 1, 0);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void stopPlaying() {
        n8c.m158485c("AgoraWriter", "stopPlaying:");
        synchronized (this.f208191G) {
            this.f208216h = false;
            this.f208215g = false;
            m222151B("1");
            m222182F(0);
            this.f208190F = false;
        }
        m222176t();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void stopRecording() {
        n8c.m158485c("AgoraWriter", "stopRecording:");
        synchronized (this.f208191G) {
            super.stopRecording();
            this.f208215g = false;
            m222151B("1");
            m222184s();
            m222182F(0);
            this.f208190F = false;
        }
        m222176t();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void stopSurroundMusic() {
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.stopAudioMixing();
            ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = this.f208223o;
            if (onSurroundMusicStatusListener != null) {
                onSurroundMusicStatusListener.m222834a(this.f208222n.f208636C, 2, 0);
            }
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void updateChannelkey(String str) {
        this.f208226r = str;
        RtcEngine rtcEngine = this.f208211c;
        if (rtcEngine != null) {
            rtcEngine.renewToken(str);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeAudio(long j, ByteBuffer byteBuffer, long j2) {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeAudioExtradata(ByteBuffer byteBuffer, long j) {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeVideo(long j, ByteBuffer byteBuffer, long j2) {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeVideoExtradata(ByteBuffer byteBuffer, long j) {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void writeVideoTexture(int i, EGLContext eGLContext, int i2, int i3, long j) {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public RtcEngine getAgoraEngine() {
        return this.f208211c;
    }

    /* JADX INFO: renamed from: z */
    public String m222186z(byte[] bArr) {
        try {
            CongressUtil congressUtil = this.f208201Q;
            return congressUtil != null ? congressUtil.getPara(bArr) : "xxoo";
        } catch (Error e) {
            e.printStackTrace();
            return "xxoo";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "xxoo";
        }
    }

    public AgoraWriter(Context context, EGLContext eGLContext, StreamProducer streamProducer, boolean z) {
        this(context, eGLContext, streamProducer, null, z);
    }
}
