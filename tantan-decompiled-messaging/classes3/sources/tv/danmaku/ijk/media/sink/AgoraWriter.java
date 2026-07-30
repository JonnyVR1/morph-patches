package tv.danmaku.ijk.media.sink;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import com.immomo.mediacore.audio.AudioProcess;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.immomo.mediacore.coninf.MRtcAudioHandlerEx;
import com.immomo.mediacore.coninf.MRtcChannelHandler;
import com.immomo.mediacore.coninf.MRtcEventHandler;
import com.immomo.mediacore.sink.CongressUtil;
import com.immomo.mediacore.sink.SinkBase;
import com.immomo.mediacore.strinf.VideoQuality;
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
import l.n8c;
import l.z1l0;
import org.eclipse.jetty.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.seamless.xhtml.XHTMLElement;
import org.spongycastle.crypto.tls.CipherSuite;
import p003l.ldq0;
import p003l.upk0;
import tv.danmaku.ijk.media.streamer.StreamProducer;
import tv.danmaku.ijk.media.streamer.agora.EngineConfig;
import tv.danmaku.ijk.media.streamer.agora.MyEngineEventHandler;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;
import tv.danmaku.ijk.media.util.helpSurface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AgoraWriter extends SinkBase implements IAudioFrameObserver {

    /* JADX INFO: renamed from: Y */
    private static final float[] f11809Y = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A */
    private boolean f11810A;

    /* JADX INFO: renamed from: B */
    private SinkBase.PcmDateCallback f11811B;

    /* JADX INFO: renamed from: C */
    private SinkBase.PlaybackDateCallback f11812C;

    /* JADX INFO: renamed from: D */
    private SinkBase.RecordDateCallback f11813D;

    /* JADX INFO: renamed from: E */
    VideoQuality f11814E;

    /* JADX INFO: renamed from: F */
    private boolean f11815F;

    /* JADX INFO: renamed from: G */
    private Object f11816G;

    /* JADX INFO: renamed from: H */
    private boolean f11817H;

    /* JADX INFO: renamed from: I */
    private boolean f11818I;

    /* JADX INFO: renamed from: J */
    private boolean f11819J;

    /* JADX INFO: renamed from: K */
    Runnable f11820K;

    /* JADX INFO: renamed from: L */
    private int f11821L;

    /* JADX INFO: renamed from: M */
    private int f11822M;

    /* JADX INFO: renamed from: N */
    private boolean f11823N;

    /* JADX INFO: renamed from: O */
    private float f11824O;

    /* JADX INFO: renamed from: P */
    private float f11825P;

    /* JADX INFO: renamed from: Q */
    private CongressUtil f11826Q;

    /* JADX INFO: renamed from: R */
    private int f11827R;

    /* JADX INFO: renamed from: S */
    public int f11828S;

    /* JADX INFO: renamed from: T */
    private int f11829T;

    /* JADX INFO: renamed from: U */
    private z1l0 f11830U;

    /* JADX INFO: renamed from: V */
    private int f11831V;

    /* JADX INFO: renamed from: W */
    private boolean f11832W;

    /* JADX INFO: renamed from: X */
    private MRtcEventHandler f11833X;

    /* JADX INFO: renamed from: a */
    private EngineConfig f11834a;

    /* JADX INFO: renamed from: b */
    private MyEngineEventHandler f11835b;

    /* JADX INFO: renamed from: c */
    private RtcEngine f11836c;

    /* JADX INFO: renamed from: d */
    private EGLContext f11837d;

    /* JADX INFO: renamed from: e */
    private Context f11838e;

    /* JADX INFO: renamed from: f */
    private boolean f11839f;

    /* JADX INFO: renamed from: g */
    private boolean f11840g;

    /* JADX INFO: renamed from: h */
    private boolean f11841h;

    /* JADX INFO: renamed from: i */
    private Handler f11842i;

    /* JADX INFO: renamed from: j */
    private MRtcEventHandler f11843j;

    /* JADX INFO: renamed from: k */
    private float f11844k;

    /* JADX INFO: renamed from: l */
    private float f11845l;

    /* JADX INFO: renamed from: m */
    private AudioProcess f11846m;

    /* JADX INFO: renamed from: n */
    private StreamProducer f11847n;

    /* JADX INFO: renamed from: o */
    protected ijkMediaStreamer.OnSurroundMusicStatusListener f11848o;

    /* JADX INFO: renamed from: p */
    private boolean f11849p;

    /* JADX INFO: renamed from: q */
    private boolean f11850q;

    /* JADX INFO: renamed from: r */
    private String f11851r;

    /* JADX INFO: renamed from: s */
    private String f11852s;

    /* JADX INFO: renamed from: t */
    private boolean f11853t;

    /* JADX INFO: renamed from: u */
    private boolean f11854u;

    /* JADX INFO: renamed from: v */
    private int f11855v;

    /* JADX INFO: renamed from: w */
    private int f11856w;

    /* JADX INFO: renamed from: x */
    private boolean[] f11857x;

    /* JADX INFO: renamed from: y */
    private HashMap f11858y;

    /* JADX INFO: renamed from: z */
    private Map f11859z;

    public AgoraWriter(Context context, EGLContext eGLContext, StreamProducer streamProducer, String str, boolean z) {
        this.f11839f = true;
        this.f11840g = false;
        this.f11841h = false;
        this.f11842i = new Handler(Looper.getMainLooper());
        this.f11844k = 1.0f;
        this.f11845l = 1.0f;
        this.f11849p = false;
        this.f11850q = false;
        this.f11851r = null;
        this.f11852s = null;
        this.f11853t = false;
        this.f11854u = false;
        this.f11855v = 0;
        this.f11856w = 7;
        this.f11857x = new boolean[7 + 1];
        this.f11858y = new HashMap();
        this.f11859z = new HashMap();
        this.f11810A = false;
        this.f11814E = null;
        this.f11815F = false;
        this.f11816G = new Object();
        this.f11817H = false;
        this.f11818I = false;
        this.f11819J = false;
        this.f11820K = null;
        this.f11821L = 0;
        this.f11822M = 0;
        this.f11823N = false;
        this.f11824O = 1.0f;
        this.f11825P = 0.7f;
        this.f11826Q = null;
        this.f11827R = -1;
        this.f11828S = 44100;
        this.f11829T = 1;
        this.f11831V = 2;
        this.f11832W = true;
        this.f11833X = new MRtcEventHandler() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.1
            public void onAudioMixingFinished() {
                AgoraWriter agoraWriter = AgoraWriter.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = agoraWriter.f11848o;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m11305a(agoraWriter.f11847n.f12261C, 2, 0);
                }
            }

            public void onConnectionLost() {
                Log.e("AgoraWriter", "onConnectionLost");
                AgoraWriter.this.f11847n.notify(HttpStatus.MULTIPLE_CHOICES_300, -304, 10, this);
            }

            public void onError(final int i) {
                Log.e("AgoraWriter", "onError" + i);
                if (i == 17 || i == 18 || i == 1603 || i == 1 || i == 109 || i == 110 || i == 106) {
                    return;
                }
                AgoraWriter.this.setErrorCode(i);
                AgoraWriter.this.f11842i.post(new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!AgoraWriter.this.isHost() || AgoraWriter.this.f11847n == null) {
                            AgoraWriter.this.stopRecording();
                            if (AgoraWriter.this.f11847n != null) {
                                AgoraWriter.this.f11847n.notify(HttpStatus.MULTIPLE_CHOICES_300, -304, i, this);
                            }
                            if (AgoraWriter.this.f11843j != null) {
                                AgoraWriter.this.f11843j.onUserOffline(AgoraWriter.this.getUserID(), i);
                                return;
                            }
                            return;
                        }
                        int i2 = i;
                        C12691 c12691 = C12691.this;
                        if (i2 != 0) {
                            AgoraWriter.this.f11847n.notify(HttpStatus.MULTIPLE_CHOICES_300, -304, i, this);
                        } else {
                            AgoraWriter.this.f11847n.notify(HttpStatus.MULTIPLE_CHOICES_300, -304, 12, this);
                        }
                    }
                });
            }

            public void onFirstRemoteVideoDecoded(long j, int i, int i2, int i3) {
                Log.e("AgoraWriter", "onFirstRemoteVideoDecoded texture: " + j + ";width:" + i + ";height" + i2);
                AgoraWriter.this.m10649v(j, i, i2);
            }

            public void onJoinChannelSuccess(String str2, final long j, int i) {
                synchronized (AgoraWriter.this.f11816G) {
                    try {
                        AgoraWriter.this.f11847n.notify(100, 0, 0, this);
                        if (AgoraWriter.this.f11836c == null) {
                            return;
                        }
                        if ((AgoraWriter.this.f11853t || AgoraWriter.this.f11854u) && AgoraWriter.this.getUserID() != j) {
                            AgoraWriter.this.f11842i.post(new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    SurfaceView surfaceView = AgoraWriter.this.f11838e != null ? new SurfaceView(AgoraWriter.this.f11838e) : null;
                                    if (AgoraWriter.this.f11830U == null || surfaceView == null) {
                                        return;
                                    }
                                    n8c.c("AgoraWriter", "receiveVideoData: call onVideoChannelAdded()" + j);
                                    AgoraWriter.this.f11830U.a((long) ((int) j), surfaceView, CipherSuite.TLS_PSK_WITH_NULL_SHA256, CipherSuite.TLS_PSK_WITH_NULL_SHA256);
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            public void onJoinChannelfail(String str2, long j, int i) {
            }

            public void onUserMuteAudio(int i, boolean z2) {
            }

            public void onUserMuteVideo(int i, boolean z2) {
            }

            public void onUserOffline(long j, int i) {
                if (AgoraWriter.this.f11859z != null && AgoraWriter.this.f11859z.containsKey(Long.valueOf(j))) {
                    helpSurface helpsurface = (helpSurface) AgoraWriter.this.f11859z.get(Long.valueOf(j));
                    AgoraWriter.this.f11859z.remove(Long.valueOf(j));
                    if (AgoraWriter.this.f11826Q != null) {
                        AgoraWriter.this.f11826Q.setVideoSurface(j, (Surface) null);
                    }
                    helpsurface.m11344g();
                }
                long jM10627I = AgoraWriter.this.m10627I(j);
                if (jM10627I == -1 || !AgoraWriter.this.f11810A) {
                    return;
                }
                AgoraWriter.this.f11847n.m11130J1(jM10627I, true);
                AgoraWriter.this.f11847n.m11134L1(jM10627I, 0, 0, 0, 5);
                AgoraWriter.this.f11847n.m11189n2(jM10627I, null, 0, null);
                AgoraWriter.this.f11857x[(int) jM10627I] = false;
                AgoraWriter.this.f11858y.remove(Long.valueOf(j));
            }

            public void onWarning(int i) {
                AgoraWriter agoraWriter;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener;
                if (i != 701 || (onSurroundMusicStatusListener = (agoraWriter = AgoraWriter.this).f11848o) == null) {
                    return;
                }
                onSurroundMusicStatusListener.m11305a(agoraWriter.f11847n.f12261C, -1, 0);
            }
        };
        this.f11852s = str;
        n8c.c("AgoraWriter", "AgoraWriter:");
        this.f11838e = context;
        this.f11847n = streamProducer;
        this.f11837d = eGLContext;
        EngineConfig engineConfig = new EngineConfig();
        this.f11834a = engineConfig;
        engineConfig.f12462c = 0;
        MyEngineEventHandler myEngineEventHandler = new MyEngineEventHandler(this.f11838e, engineConfig, this, this.f11847n);
        this.f11835b = myEngineEventHandler;
        myEngineEventHandler.m11289q(this.f11833X);
        this.f11853t = z;
        this.f11826Q = new CongressUtil();
        m10650w();
        this.f11849p = false;
        this.f11815F = false;
        this.f11855v = 0;
        AudioProcess audioProcess = new AudioProcess();
        this.f11846m = audioProcess;
        int i = this.f11828S;
        audioProcess.openSabineEf(i, 1, (i * 10) / 1000);
        this.f11846m.setSlaveAudioGain(1.0f);
        this.f11846m.setSlaveAudioLevel(1.0f);
        this.f11846m.setMasterAudioLevel(1.0f);
    }

    /* JADX INFO: renamed from: A */
    private final void m10621A(String str, int i) {
        synchronized (this.f11816G) {
            try {
                if (this.f11836c == null) {
                    return;
                }
                if (this.f11850q) {
                    m10622B("1");
                }
                m10624E();
                RtcEngine rtcEngine = this.f11836c;
                if (rtcEngine != null && this.f11832W) {
                    rtcEngine.setDefaultAudioRoutetoSpeakerphone(true);
                }
                this.f11836c.joinChannel(this.f11851r, str, (String) null, i);
                this.f11834a.f12463d = str;
                this.f11850q = true;
                if (this.f11818I || this.f11853t) {
                    m10623C();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m10622B(String str) {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.leaveChannel();
        }
        EngineConfig engineConfig = this.f11834a;
        if (engineConfig != null) {
            int i = engineConfig.f12460a;
            engineConfig.m11270a();
            n8c.c("AgoraWriter", "leaveChannel " + str + " " + i);
        }
        this.f11850q = false;
    }

    /* JADX INFO: renamed from: C */
    private void m10623C() {
        if (this.f11849p) {
            return;
        }
        this.f11847n.notify(102, 0, 0, this);
        this.f11849p = true;
    }

    /* JADX INFO: renamed from: E */
    private void m10624E() {
        VideoQuality videoQuality;
        int iM11144R0;
        boolean z = this.f11810A;
        StreamProducer streamProducer = this.f11847n;
        if (z) {
            videoQuality = streamProducer.m11211y0();
            iM11144R0 = this.f11847n.m11213z0() / 1000;
        } else {
            videoQuality = streamProducer.getVideoQuality();
            iM11144R0 = this.f11847n.m11144R0() / 1000;
        }
        if (videoQuality == null) {
            return;
        }
        if (videoQuality.resX < 176) {
            videoQuality.resX = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        if (videoQuality.resY < 176) {
            videoQuality.resY = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        n8c.c("AgoraWriter", "setVideoProfileEx1 bitrate:" + iM11144R0);
        enableVideo(this.f11853t ^ true);
    }

    /* JADX INFO: renamed from: G */
    private void m10625G() {
        if (this.f11817H) {
            return;
        }
        this.f11817H = true;
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.registerAudioFrameObserver((IAudioFrameObserver) null);
            this.f11836c.registerAudioFrameObserver(this);
        }
    }

    /* JADX INFO: renamed from: H */
    private void m10626H() {
        if (this.f11817H) {
            this.f11817H = false;
            RtcEngine rtcEngine = this.f11836c;
            if (rtcEngine != null) {
                rtcEngine.registerAudioFrameObserver((IAudioFrameObserver) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public long m10627I(long j) {
        long j2;
        if (getUserID() == j || j == this.f11856w || this.f11858y.size() > this.f11856w) {
            return -1L;
        }
        if (!this.f11858y.containsKey(Long.valueOf(j))) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i > this.f11856w) {
                    j2 = 0;
                    break;
                }
                boolean[] zArr = this.f11857x;
                if (!zArr[i]) {
                    j2 = i;
                    z = true;
                    zArr[i] = true;
                    break;
                }
                i++;
            }
            if (z) {
                this.f11858y.put(Long.valueOf(j), Long.valueOf(j2));
            }
        }
        Object obj = this.f11858y.get(Long.valueOf(j));
        if (obj != null) {
            return ((Long) obj).longValue();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: K */
    private void m10628K() {
    }

    /* JADX INFO: renamed from: t */
    private void m10647t() {
        this.f11813D = null;
        this.f11811B = null;
        this.f11812C = null;
    }

    /* JADX INFO: renamed from: u */
    private final void m10648u(int i, int i2) {
        synchronized (this.f11816G) {
            try {
                RtcEngine rtcEngine = this.f11836c;
                if (rtcEngine == null) {
                    return;
                }
                EngineConfig engineConfig = this.f11834a;
                engineConfig.f12460a = i;
                engineConfig.f12461b = i2;
                rtcEngine.setClientRole(i);
                m10628K();
                n8c.c("AgoraWriter", "configEngine " + i + " " + this.f11834a.f12461b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m10649v(final long j, final int i, final int i2) {
        if (this.f11853t) {
            return;
        }
        this.f11842i.post(new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.3
            @Override // java.lang.Runnable
            public void run() {
                SurfaceView surfaceView = new SurfaceView(AgoraWriter.this.f11838e);
                boolean z = AgoraWriter.this.f11810A;
                AgoraWriter agoraWriter = AgoraWriter.this;
                if (z) {
                    if (agoraWriter.f11830U != null) {
                        AgoraWriter.this.f11830U.a(j, (SurfaceView) null, i, i2);
                        if (AgoraWriter.this.f11846m != null) {
                            AgoraWriter.this.f11846m.clearSurroundFrames();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (agoraWriter.f11836c != null) {
                    AgoraWriter.this.f11836c.setupRemoteVideo(new VideoCanvas(surfaceView, 1, (int) j));
                }
                n8c.c("AgoraWriter", "doRenderRemoteUi:" + AgoraWriter.this.f11830U);
                if (AgoraWriter.this.f11830U != null) {
                    AgoraWriter.this.f11830U.a(j, surfaceView, i, i2);
                }
            }
        });
        if (this.f11859z.containsKey(Long.valueOf(j)) || !this.f11810A) {
            return;
        }
        long jM10627I = m10627I(j);
        helpSurface helpsurface = new helpSurface(null, jM10627I);
        CongressUtil congressUtil = this.f11826Q;
        if (congressUtil != null) {
            congressUtil.setVideoSurface(j, helpsurface.m11341c());
        }
        if (jM10627I != -1) {
            this.f11847n.m11134L1(jM10627I, i, i2, 0, 5);
        }
        helpsurface.m11345h(this.f11847n.m11129J0());
        this.f11859z.put(Long.valueOf(j), helpsurface);
    }

    /* JADX INFO: renamed from: w */
    private RtcEngine m10650w() {
        if (this.f11836c == null) {
            String strM10657z = m10657z(new byte[]{1, 1, 1});
            if (TextUtils.isEmpty(strM10657z)) {
                upk0.m8197a("NEED TO use your vendor key, get your own key at https://dashboard.agora.io/");
                return null;
            }
            try {
                String str = this.f11852s;
                if (str == null || TextUtils.isEmpty(str)) {
                    this.f11836c = RtcEngine.create(this.f11838e, strM10657z, this.f11835b.f12485v);
                } else {
                    this.f11836c = RtcEngine.create(this.f11838e, this.f11852s, this.f11835b.f12485v);
                }
                boolean z = n8c.a;
            } catch (Exception unused) {
                StreamProducer streamProducer = this.f11847n;
                if (streamProducer != null) {
                    streamProducer.notify(HttpStatus.MULTIPLE_CHOICES_300, -304, -1, this);
                }
            }
            this.f11836c.setRecordingAudioFrameParameters(this.f11828S, 1, 2, 1024);
            this.f11836c.setPlaybackAudioFrameParameters(this.f11828S, 1, 0, 1024);
            this.f11836c.setChannelProfile(1);
            this.f11836c.enableDualStreamMode(false);
            boolean z2 = this.f11853t;
            RtcEngine rtcEngine = this.f11836c;
            if (z2) {
                rtcEngine.disableVideo();
            } else {
                rtcEngine.enableVideo();
            }
        }
        this.f11839f = this.f11836c.isTextureEncodeSupported();
        return this.f11836c;
    }

    /* JADX INFO: renamed from: y */
    private boolean m10651y() {
        return (this.f11813D == null && this.f11811B == null && this.f11812C == null) ? false : true;
    }

    /* JADX INFO: renamed from: D */
    public void m10652D() {
        Log.e("AgoraWriter", "onMediaEngineLoadSuccess");
    }

    /* JADX INFO: renamed from: F */
    public void m10653F(int i) {
        try {
            CongressUtil congressUtil = this.f11826Q;
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
    public void m10654J(long j, ByteBuffer byteBuffer, int i) {
        n8c.c("AgoraWriter", "writevideo:" + i + ";timeStamp:" + j);
        VideoQuality videoQuality = this.f11847n.getVideoQuality();
        if (videoQuality == null) {
            return;
        }
        if (videoQuality.resX < 176) {
            videoQuality.resX = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        if (videoQuality.resY < 176) {
            videoQuality.resY = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        if (this.f11839f || !this.f11840g || this.f11853t) {
            return;
        }
        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
        agoraVideoFrame.format = 1;
        agoraVideoFrame.timeStamp = System.currentTimeMillis();
        agoraVideoFrame.stride = videoQuality.resX;
        agoraVideoFrame.height = videoQuality.resY;
        agoraVideoFrame.rotation = 0;
        agoraVideoFrame.buf = byteBuffer.array();
        synchronized (this.f11816G) {
            try {
                RtcEngine rtcEngine = this.f11836c;
                if (rtcEngine != null && !this.f11818I) {
                    rtcEngine.pushExternalVideoFrame(agoraVideoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = this.f11855v + 1;
        this.f11855v = i2;
        if (i2 > 20) {
            m10623C();
        }
    }

    public void SabineEffectReset() {
        AudioProcess audioProcess = this.f11846m;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset();
        }
    }

    public void SabineEffectSet(int i, int i2, float f) {
        AudioProcess audioProcess = this.f11846m;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet(i, i2, f);
        }
    }

    public void SetSubVideoPos(long j, int i, int i2, int i3, int i4) {
        if (getUserID() == j || !this.f11840g) {
            return;
        }
        long jM10627I = m10627I(j);
        if (jM10627I != -1) {
            this.f11847n.m11132K1(jM10627I, i, i2, i3, i4, 0);
        }
    }

    public void addEventHandler(MRtcEventHandler mRtcEventHandler) {
        this.f11843j = mRtcEventHandler;
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m11289q(mRtcEventHandler);
        }
    }

    public void addMRtcAudioHandler(MRtcAudioHandler mRtcAudioHandler) {
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m11290r(mRtcAudioHandler);
        }
    }

    public void addMRtcAudioHandlerEx(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m11291s(mRtcAudioHandlerEx);
        }
    }

    public void addMRtcChannelHandler(MRtcChannelHandler mRtcChannelHandler) {
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m11292t(mRtcChannelHandler);
        }
    }

    public void adjustEQ(int i, boolean z) {
        AudioProcess audioProcess = this.f11846m;
        if (audioProcess != null) {
            audioProcess.adjustEQ(i, z);
        }
    }

    public void adjustEf(int i, int i2) {
        AudioProcess audioProcess = this.f11846m;
        if (audioProcess != null) {
            audioProcess.adjustEf(i, i2);
        }
    }

    public void adjustTune(int i, boolean z) {
        AudioProcess audioProcess = this.f11846m;
        if (audioProcess != null) {
            audioProcess.adjustTune(i, z);
        }
    }

    public int changeRole(int i) {
        n8c.c("AgoraWriter", "changeRole:" + i);
        setErrorCode(0);
        int clientRole = -1;
        if (i == this.f11829T) {
            return -1;
        }
        this.f11829T = i;
        this.f11847n.m11202s1(false);
        synchronized (this.f11816G) {
            try {
                if (1 == i) {
                    this.f11840g = true;
                    if (!this.f11839f) {
                        this.f11847n.f12261C.addSoftListener(new ldq0.InterfaceC0404a() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.5
                            @Override // p003l.ldq0.InterfaceC0404a
                            /* JADX INFO: renamed from: a */
                            public void mo6003a(ByteBuffer byteBuffer, long j) {
                                if (AgoraWriter.this.f11818I) {
                                    return;
                                }
                                AgoraWriter.this.m10654J(System.currentTimeMillis(), byteBuffer, byteBuffer.limit());
                            }
                        });
                    }
                } else {
                    this.f11841h = true;
                    this.f11840g = false;
                }
                if ((1 == i && this.f11814E != null) || 2 == i || this.f11818I || this.f11853t) {
                    n8c.c("AgoraWriter", "changeRole:" + i);
                    m10624E();
                    clientRole = this.f11836c.setClientRole(i);
                } else {
                    this.f11815F = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (1 == i && (this.f11818I || this.f11853t)) {
            m10623C();
        }
        return clientRole;
    }

    public void enableAudio(boolean z) {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            if (z) {
                rtcEngine.enableAudio();
            } else {
                rtcEngine.disableAudio();
            }
        }
    }

    public void enableAudioVolumeIndication(int i, int i2) {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.enableAudioVolumeIndication(i, i2, false);
        }
    }

    public void enableCommMode(boolean z) {
        RtcEngine rtcEngine;
        if (z && (rtcEngine = this.f11836c) != null) {
            rtcEngine.setParameters("{\"che.audio.live_for_comm\":true}");
            return;
        }
        RtcEngine rtcEngine2 = this.f11836c;
        if (rtcEngine2 != null) {
            rtcEngine2.setParameters("{\"che.audio.live_for_comm\":false}");
        }
    }

    public void enableVideo(boolean z) {
        VideoQuality videoQuality;
        int iM11144R0;
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            if (!z) {
                rtcEngine.disableVideo();
                return;
            }
            rtcEngine.enableVideo();
            boolean z2 = this.f11810A;
            StreamProducer streamProducer = this.f11847n;
            if (z2) {
                videoQuality = streamProducer.m11211y0();
                iM11144R0 = this.f11847n.m11213z0() / 1000;
            } else {
                videoQuality = streamProducer.getVideoQuality();
                iM11144R0 = this.f11847n.m11144R0() / 1000;
            }
            if (videoQuality == null) {
                return;
            }
            if (videoQuality.resX < 176) {
                videoQuality.resX = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
            }
            if (videoQuality.resY < 176) {
                videoQuality.resY = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
            }
            n8c.c("AgoraWriter", "setVideoProfileEx1 bitrate:" + iM11144R0);
            this.f11836c.setParameters("{\"che.video.keyFrameInterval\":1}");
            this.f11821L = videoQuality.resX;
            this.f11822M = videoQuality.resY;
        }
    }

    public int getAudioBitRate() {
        IRtcEngineEventHandler.RtcStats rtcStatsM11298z;
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        if (myEngineEventHandler == null || (rtcStatsM11298z = myEngineEventHandler.m11298z()) == null) {
            return 0;
        }
        return rtcStatsM11298z.txAudioKBitRate;
    }

    public long getAudioRxbytes() {
        return 0L;
    }

    public String getAudioVideoStatics() {
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        return myEngineEventHandler != null ? myEngineEventHandler.m11293u() : "[(0)]";
    }

    public int getAvFlag() {
        if (this.f11853t) {
            return 2;
        }
        return super.getAvFlag();
    }

    public long getAverageSendBitRateB() {
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        IRtcEngineEventHandler.RtcStats rtcStatsM11298z = myEngineEventHandler != null ? myEngineEventHandler.m11298z() : null;
        if (rtcStatsM11298z != null) {
            return (rtcStatsM11298z.txKBitRate * 1000) / 8;
        }
        return 0L;
    }

    public AudioParams getEarMonitoringAudioParams() {
        return null;
    }

    public float getMasterAudioLevel() {
        return this.f11844k;
    }

    public AudioParams getMixedAudioParams() {
        return null;
    }

    public boolean getMuteStatus() {
        return super.getMuteStatus() | (this.f11829T != 1);
    }

    public int getObservedAudioFramePosition() {
        return 0;
    }

    public AudioParams getPlaybackAudioParams() {
        return null;
    }

    public int getPublisherVideoHigh() {
        if (this.f11853t) {
            return 0;
        }
        return this.f11822M;
    }

    public int getPublisherVideoWidth() {
        if (this.f11853t) {
            return 0;
        }
        return this.f11821L;
    }

    public AudioParams getRecordAudioParams() {
        return null;
    }

    public long getRxbytes() {
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        IRtcEngineEventHandler.RtcStats rtcStatsM11298z = myEngineEventHandler != null ? myEngineEventHandler.m11298z() : null;
        if (rtcStatsM11298z != null) {
            return rtcStatsM11298z.rxBytes;
        }
        return 0L;
    }

    public float getSlaveAudioLevel() {
        return this.f11845l;
    }

    public int getStreamerType() {
        return 1;
    }

    public long getSurroundMusicDuration() {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingDuration();
        }
        return 0L;
    }

    public long getSurroundMusicPos() {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingCurrentPosition();
        }
        return 0L;
    }

    public long getTxbytes() {
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        IRtcEngineEventHandler.RtcStats rtcStatsM11298z = myEngineEventHandler != null ? myEngineEventHandler.m11298z() : null;
        if (rtcStatsM11298z != null) {
            return rtcStatsM11298z.txBytes;
        }
        return 0L;
    }

    public int getVideoBitRate() {
        IRtcEngineEventHandler.LocalVideoStats localVideoStatsM11296x;
        boolean z = this.f11840g;
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        if (z) {
            localVideoStatsM11296x = myEngineEventHandler != null ? myEngineEventHandler.m11294v() : null;
            if (localVideoStatsM11296x != null) {
                return localVideoStatsM11296x.sentBitrate;
            }
            return 0;
        }
        localVideoStatsM11296x = myEngineEventHandler != null ? myEngineEventHandler.m11296x() : null;
        if (localVideoStatsM11296x != null) {
            return ((IRtcEngineEventHandler.RemoteVideoStats) localVideoStatsM11296x).receivedBitrate;
        }
        return 0;
    }

    public int getVideoFrameRate() {
        IRtcEngineEventHandler.LocalVideoStats localVideoStatsM11296x;
        boolean z = this.f11840g;
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        if (z) {
            localVideoStatsM11296x = myEngineEventHandler != null ? myEngineEventHandler.m11294v() : null;
            if (localVideoStatsM11296x != null) {
                return localVideoStatsM11296x.sentFrameRate;
            }
            return 0;
        }
        localVideoStatsM11296x = myEngineEventHandler != null ? myEngineEventHandler.m11296x() : null;
        if (localVideoStatsM11296x != null) {
            return ((IRtcEngineEventHandler.RemoteVideoStats) localVideoStatsM11296x).rendererOutputFrameRate;
        }
        return 0;
    }

    public int getVideoFreezeCount() {
        boolean z = this.f11840g;
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        if (z) {
            if (myEngineEventHandler != null) {
                return myEngineEventHandler.m11295w();
            }
            return 0;
        }
        if (myEngineEventHandler != null) {
            return myEngineEventHandler.m11297y();
        }
        return 0;
    }

    public long getVideoRxbytes() {
        MyEngineEventHandler myEngineEventHandler = this.f11835b;
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM11296x = myEngineEventHandler != null ? myEngineEventHandler.m11296x() : null;
        if (remoteVideoStatsM11296x != null) {
            return remoteVideoStatsM11296x.receivedBitrate;
        }
        return 0L;
    }

    public long getWriteByte() {
        return getTxbytes();
    }

    public void ignoreWriterSEI(boolean z) {
        this.f11854u = z;
    }

    public boolean isPlaying() {
        return this.f11841h;
    }

    public void muteAllRemoteAudioStream(boolean z) {
        n8c.c("AgoraWriter", "muteAllRemoteAudioStream mute" + z);
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(z);
        }
    }

    public void muteAllRemoteVideoStream(boolean z) {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteVideoStreams(z);
        }
    }

    public void muteLocalAudioStream(boolean z) {
        RtcEngine rtcEngine = this.f11836c;
        if (z) {
            if (rtcEngine != null) {
                rtcEngine.adjustRecordingSignalVolume(0);
            }
        } else if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(false);
            this.f11836c.adjustRecordingSignalVolume((int) (this.f11844k * 100.0f));
        }
        setMuteStatus(z);
    }

    public void muteLocalAudioStreamForGame(boolean z) {
        n8c.c("AgoraWriter", "muteLocalAudioStreamForGame " + z);
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
        setMuteStatus(z);
    }

    public void muteLocalVideoStream(boolean z) {
        this.f11818I = z;
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalVideoStream(z);
        }
    }

    public void muteRemoteAudioStream(long j, boolean z) {
        n8c.c("AgoraWriter", "muteRemoteAudioStream uid" + j + ";mute:" + z);
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteRemoteAudioStream((int) j, z);
        }
    }

    public void muteRemoteVideoStream(long j, boolean z) {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteRemoteVideoStream((int) j, z);
        }
    }

    public void notifyUpdateResolution() {
        n8c.c("AgoraWriter", "notifyUpdateResolution:");
        synchronized (this.f11816G) {
            try {
                StreamProducer streamProducer = this.f11847n;
                if (streamProducer == null) {
                    return;
                }
                if (this.f11810A) {
                    this.f11814E = streamProducer.m11211y0();
                } else {
                    this.f11814E = streamProducer.getVideoQuality();
                }
                if (this.f11814E == null) {
                    return;
                }
                n8c.c("AgoraWriter", "setVideoBitrate width:" + this.f11814E.resX + ";heigh:" + this.f11814E.resY);
                if (this.f11815F) {
                    n8c.c("AgoraWriter", "dealyed changeRole:1");
                    m10624E();
                    this.f11836c.setClientRole(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean onEarMonitoringAudioFrame(int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        return false;
    }

    public boolean onMixedAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        return false;
    }

    public boolean onPlaybackAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        return false;
    }

    public boolean onPlaybackAudioFrameBeforeMixing(String str, int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, long j, int i7, int i8, long j2) {
        return false;
    }

    public boolean onRecordAudioFrame(String str, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer, long j, int i6) {
        return false;
    }

    public void pause() {
    }

    public void pausePlaying() {
        Log.e("AgoraWriter", "pausePlaying");
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(true);
            this.f11836c.muteAllRemoteVideoStreams(true);
        }
    }

    public void pauseRecording() {
        Log.e("AgoraWriter", "pauseRecording");
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(true);
        }
        Runnable runnable = new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zIsHost = AgoraWriter.this.isHost();
                AgoraWriter agoraWriter = AgoraWriter.this;
                if (zIsHost) {
                    agoraWriter.f11847n.notify(HttpStatus.MULTIPLE_CHOICES_300, -304, HttpStatus.CREATED_201, this);
                } else if (agoraWriter.f11843j != null) {
                    AgoraWriter.this.f11843j.onUserOffline(AgoraWriter.this.getUserID(), HttpStatus.CREATED_201);
                }
            }
        };
        this.f11820K = runnable;
        this.f11842i.postDelayed(runnable, 30000L);
    }

    public void pauseSurroundMusic() {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.pauseAudioMixing();
        }
    }

    public void postDrawImage(int i) {
        if (!this.f11839f || i == 0 || !this.f11840g || this.f11853t) {
            return;
        }
        n8c.c("AgoraWriter", "postDrawImage texture: " + i);
        int i2 = this.f11855v + 1;
        this.f11855v = i2;
        if (i2 > 20) {
            m10623C();
        }
        boolean z = this.f11810A;
        StreamProducer streamProducer = this.f11847n;
        VideoQuality videoQualityM11211y0 = z ? streamProducer.m11211y0() : streamProducer.getVideoQuality();
        if (videoQualityM11211y0 == null) {
            return;
        }
        if (videoQualityM11211y0.resX < 176) {
            videoQualityM11211y0.resX = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        if (videoQualityM11211y0.resY < 176) {
            videoQualityM11211y0.resY = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        n8c.c("AgoraWriter", "postDrawImage texture: " + i + "qu.resX:" + videoQualityM11211y0.resX + "qu.resY" + videoQualityM11211y0.resY);
        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
        agoraVideoFrame.format = 10;
        agoraVideoFrame.timeStamp = System.currentTimeMillis();
        agoraVideoFrame.stride = videoQualityM11211y0.resX;
        agoraVideoFrame.height = videoQualityM11211y0.resY;
        agoraVideoFrame.textureID = i;
        agoraVideoFrame.transform = f11809Y;
        synchronized (this.f11816G) {
            try {
                RtcEngine rtcEngine = this.f11836c;
                if (rtcEngine != null && !this.f11818I) {
                    rtcEngine.pushExternalVideoFrame(agoraVideoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean prepare() {
        return true;
    }

    public void release() {
        stopRecording();
        stopSurroundMusic();
        addMRtcAudioHandler(null);
        addMRtcAudioHandlerEx(null);
        addMRtcChannelHandler(null);
        Handler handler = this.f11842i;
        if (handler != null) {
            handler.removeCallbacks(null, null);
            this.f11842i.removeCallbacksAndMessages(null);
        }
        DeinitAudioTracks();
        synchronized (this.f11816G) {
            try {
                this.f11840g = false;
                this.f11841h = false;
                RtcEngine rtcEngine = this.f11836c;
                if (rtcEngine != null) {
                    rtcEngine.registerAudioFrameObserver((IAudioFrameObserver) null);
                    RtcEngine.destroy();
                    this.f11836c = null;
                }
                MyEngineEventHandler myEngineEventHandler = this.f11835b;
                if (myEngineEventHandler != null) {
                    myEngineEventHandler.m11288B(this.f11833X);
                    this.f11835b.m11288B(this.f11843j);
                    MyEngineEventHandler myEngineEventHandler2 = this.f11835b;
                    myEngineEventHandler2.f12485v = null;
                    myEngineEventHandler2.m11287A();
                    this.f11835b = null;
                }
                this.f11833X = null;
                this.f11843j = null;
                AudioProcess audioProcess = this.f11846m;
                if (audioProcess != null) {
                    audioProcess.clear();
                    this.f11846m.release();
                    this.f11846m = null;
                }
                this.f11847n = null;
                this.f11838e = null;
                this.f11834a = null;
                this.f11835b = null;
                this.f11837d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resume() {
    }

    public void resumePlaying() {
        Log.e("AgoraWriter", "resumePlaying");
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(false);
            this.f11836c.muteAllRemoteVideoStreams(false);
        }
    }

    public void resumeRecording() {
        Log.e("AgoraWriter", "resumeRecording");
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(false);
            this.f11840g = true;
        }
        Handler handler = this.f11842i;
        if (handler != null) {
            handler.removeCallbacks(this.f11820K);
        }
    }

    public void resumeSurroundMusic() {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.resumeAudioMixing();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m10655s() {
        try {
            CongressUtil congressUtil = this.f11826Q;
            if (congressUtil != null) {
                congressUtil.clearPcmCallback();
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAudioHighQualityParameters(boolean z) {
        this.f11823N = z;
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine == null || !z) {
            return;
        }
        rtcEngine.setParameters("{\"che.audio.high.quality.mode\":true}");
    }

    public void setAudioSamplingRate(int i) {
        this.f11828S = i;
    }

    public void setChannalName(String str) {
        this.f11834a.f12463d = str;
        super.setChannalName(str);
    }

    public void setChannelkey(String str) {
        this.f11851r = str;
    }

    public void setDefaultAudioRoutetoSpeakerphone(boolean z) {
        this.f11832W = z;
    }

    public int setEnableSpeakerphone(boolean z) {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            return rtcEngine.setEnableSpeakerphone(z);
        }
        return -1;
    }

    public void setEncryptionMode(String str) {
    }

    public void setEncryptionSecret(String str) {
    }

    public void setJsonForPostion(String str) {
        JSONArray jSONArray;
        super.setJsonForPostion(str);
        boolean z = this.f11810A;
        StreamProducer streamProducer = this.f11847n;
        if ((z ? streamProducer.m11211y0() : streamProducer.getVideoQuality()) == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (TextUtils.isEmpty(jSONObject.has("mid") ? jSONObject.getString("mid") : "")) {
                return;
            }
            if (jSONObject.has("conf")) {
                jSONArray = jSONObject.getJSONArray("conf");
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
                    if (jSONObject2 != null && jSONObject2.has("x")) {
                        jSONObject2.getDouble("x");
                    }
                    if (jSONObject2 != null && jSONObject2.has("y")) {
                        jSONObject2.getDouble("y");
                    }
                    if (jSONObject2 != null && jSONObject2.has("w")) {
                        jSONObject2.getDouble("w");
                    }
                    if (jSONObject2 != null && jSONObject2.has(XHTMLElement.XPATH_PREFIX)) {
                        jSONObject2.getDouble(XHTMLElement.XPATH_PREFIX);
                    }
                    if (jSONObject2 != null && jSONObject2.has("z")) {
                        jSONObject2.getInt("z");
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

    public void setMasterAudioLevel(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f11824O * f;
        this.f11844k = f2;
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.adjustRecordingSignalVolume((int) (f2 * 100.0f));
        }
        AudioProcess audioProcess = this.f11846m;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
    }

    public void setOnSurroundMusicStatusListener(Object obj) {
        this.f11848o = (ijkMediaStreamer.OnSurroundMusicStatusListener) obj;
    }

    public void setParameters(String str) {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.setParameters(str);
        }
    }

    public void setPcmDataCallback(SinkBase.PcmDateCallback pcmDateCallback) {
        this.f11811B = pcmDateCallback;
        if (m10651y()) {
            m10625G();
        } else {
            m10626H();
        }
    }

    public void setPlayBackAudioLevel(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.adjustPlaybackSignalVolume((int) (f * 100.0f));
        }
    }

    public void setPlaybackDateCallback(SinkBase.PlaybackDateCallback playbackDateCallback) {
        this.f11812C = playbackDateCallback;
        if (m10651y()) {
            m10625G();
        } else {
            m10626H();
        }
    }

    public void setRecordDateCallback(SinkBase.RecordDateCallback recordDateCallback) {
        this.f11813D = recordDateCallback;
        if (m10651y()) {
            m10625G();
        } else {
            m10626H();
        }
    }

    public void setRole(int i) {
        this.f11829T = i;
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.setClientRole(i);
        }
    }

    public void setRoomMode(int i) {
        this.f11827R = 2;
    }

    public void setRtmpPath(String str) {
        super.setRtmpPath(str);
    }

    public void setSlaveAudioLevel(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f11825P * f;
        this.f11845l = f2;
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.adjustAudioMixingVolume((int) (f2 * 100.0f));
        }
        AudioProcess audioProcess = this.f11846m;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
    }

    public void setStreamerInOutAndType(int i, String str, String str2) {
    }

    public void setUserID(int i) {
        this.f11834a.f12462c = i;
        super.setUserID(i);
    }

    public void setVideoChannellistener(Object obj) {
        this.f11830U = (z1l0) obj;
    }

    public void startAttachStreamer() {
        this.f11810A = true;
        startRecording();
    }

    public void startPlaying() {
        n8c.c("AgoraWriter", "startPlaying:");
        if (TextUtils.isEmpty(getChannalName())) {
            upk0.m8197a("startPlaying getChannalName null exception");
            return;
        }
        if (getUserID() == 0) {
            upk0.m8197a("startRecording getUserID =0");
            return;
        }
        setErrorCode(0);
        this.f11847n.m11202s1(false);
        if (this.f11814E == null) {
            this.f11847n.m11141P1(200000);
            this.f11847n.m11145R1(CipherSuite.TLS_PSK_WITH_NULL_SHA256, CipherSuite.TLS_PSK_WITH_NULL_SHA256);
        }
        m10648u(2, 33);
        this.f11841h = true;
        m10621A(getChannalName(), (int) getUserID());
    }

    public void startRecording() {
        n8c.c("AgoraWriter", "startRecording");
        if (TextUtils.isEmpty(getChannalName())) {
            upk0.m8197a("startRecording getChannalName null exception");
            return;
        }
        if (getUserID() == 0) {
            upk0.m8197a("startRecording getUserID =0");
            return;
        }
        setErrorCode(0);
        this.f11815F = false;
        this.f11847n.m11202s1(false);
        m10648u(this.f11829T, 33);
        this.f11840g = true;
        if (!this.f11839f) {
            this.f11847n.f12261C.addSoftListener(new ldq0.InterfaceC0404a() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.4
                @Override // p003l.ldq0.InterfaceC0404a
                /* JADX INFO: renamed from: a */
                public void mo6003a(ByteBuffer byteBuffer, long j) {
                    if (AgoraWriter.this.f11818I) {
                        return;
                    }
                    AgoraWriter.this.m10654J(System.currentTimeMillis(), byteBuffer, byteBuffer.limit());
                }
            });
        }
        this.f11849p = false;
        this.f11855v = 0;
        m10621A(getChannalName(), (int) getUserID());
        AudioProcess audioProcess = this.f11846m;
        if (audioProcess != null) {
            audioProcess.clear();
        }
        if (this.f11810A) {
            m10653F(1);
        }
    }

    public void startSurroundMusic(String str, int i, long j) {
        ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener;
        if (this.f11836c == null || (onSurroundMusicStatusListener = this.f11848o) == null) {
            return;
        }
        onSurroundMusicStatusListener.m11305a(this.f11847n.f12261C, 1, 0);
    }

    public void startSurroundMusicEx(String str, boolean z, boolean z2, int i) {
        ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener;
        if (this.f11836c == null || (onSurroundMusicStatusListener = this.f11848o) == null) {
            return;
        }
        onSurroundMusicStatusListener.m11305a(this.f11847n.f12261C, 1, 0);
    }

    public void stopPlaying() {
        n8c.c("AgoraWriter", "stopPlaying:");
        synchronized (this.f11816G) {
            this.f11841h = false;
            this.f11840g = false;
            m10622B("1");
            m10653F(0);
            this.f11815F = false;
        }
        m10647t();
    }

    public void stopRecording() {
        n8c.c("AgoraWriter", "stopRecording:");
        synchronized (this.f11816G) {
            super.stopRecording();
            this.f11840g = false;
            m10622B("1");
            m10655s();
            m10653F(0);
            this.f11815F = false;
        }
        m10647t();
    }

    public void stopSurroundMusic() {
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.stopAudioMixing();
            ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = this.f11848o;
            if (onSurroundMusicStatusListener != null) {
                onSurroundMusicStatusListener.m11305a(this.f11847n.f12261C, 2, 0);
            }
        }
    }

    public void updateChannelkey(String str) {
        this.f11851r = str;
        RtcEngine rtcEngine = this.f11836c;
        if (rtcEngine != null) {
            rtcEngine.renewToken(str);
        }
    }

    public void writeAudio(long j, ByteBuffer byteBuffer, long j2) {
    }

    public void writeAudioExtradata(ByteBuffer byteBuffer, long j) {
    }

    public void writeVideo(long j, ByteBuffer byteBuffer, long j2) {
    }

    public void writeVideoExtradata(ByteBuffer byteBuffer, long j) {
    }

    public void writeVideoTexture(int i, EGLContext eGLContext, int i2, int i3, long j) {
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public RtcEngine getAgoraEngine() {
        return this.f11836c;
    }

    /* JADX INFO: renamed from: z */
    public String m10657z(byte[] bArr) {
        try {
            CongressUtil congressUtil = this.f11826Q;
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
