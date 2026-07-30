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
import p153l.azk0;
import p153l.ebl0;
import p153l.qmq0;
import p153l.t9c;
import tv.danmaku.ijk.media.streamer.StreamProducer;
import tv.danmaku.ijk.media.streamer.agora.EngineConfig;
import tv.danmaku.ijk.media.streamer.agora.MyEngineEventHandler;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;
import tv.danmaku.ijk.media.util.helpSurface;

/* JADX INFO: loaded from: classes3.dex */
public class AgoraWriter extends SinkBase implements IAudioFrameObserver {

    /* JADX INFO: renamed from: Y */
    private static final float[] f209106Y = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A */
    private boolean f209107A;

    /* JADX INFO: renamed from: B */
    private SinkBase.PcmDateCallback f209108B;

    /* JADX INFO: renamed from: C */
    private SinkBase.PlaybackDateCallback f209109C;

    /* JADX INFO: renamed from: D */
    private SinkBase.RecordDateCallback f209110D;

    /* JADX INFO: renamed from: E */
    VideoQuality f209111E;

    /* JADX INFO: renamed from: F */
    private boolean f209112F;

    /* JADX INFO: renamed from: G */
    private Object f209113G;

    /* JADX INFO: renamed from: H */
    private boolean f209114H;

    /* JADX INFO: renamed from: I */
    private boolean f209115I;

    /* JADX INFO: renamed from: J */
    private boolean f209116J;

    /* JADX INFO: renamed from: K */
    Runnable f209117K;

    /* JADX INFO: renamed from: L */
    private int f209118L;

    /* JADX INFO: renamed from: M */
    private int f209119M;

    /* JADX INFO: renamed from: N */
    private boolean f209120N;

    /* JADX INFO: renamed from: O */
    private float f209121O;

    /* JADX INFO: renamed from: P */
    private float f209122P;

    /* JADX INFO: renamed from: Q */
    private CongressUtil f209123Q;

    /* JADX INFO: renamed from: R */
    private int f209124R;

    /* JADX INFO: renamed from: S */
    public int f209125S;

    /* JADX INFO: renamed from: T */
    private int f209126T;

    /* JADX INFO: renamed from: U */
    private ebl0 f209127U;

    /* JADX INFO: renamed from: V */
    private int f209128V;

    /* JADX INFO: renamed from: W */
    private boolean f209129W;

    /* JADX INFO: renamed from: X */
    private MRtcEventHandler f209130X;

    /* JADX INFO: renamed from: a */
    private EngineConfig f209131a;

    /* JADX INFO: renamed from: b */
    private MyEngineEventHandler f209132b;

    /* JADX INFO: renamed from: c */
    private RtcEngine f209133c;

    /* JADX INFO: renamed from: d */
    private EGLContext f209134d;

    /* JADX INFO: renamed from: e */
    private Context f209135e;

    /* JADX INFO: renamed from: f */
    private boolean f209136f;

    /* JADX INFO: renamed from: g */
    private boolean f209137g;

    /* JADX INFO: renamed from: h */
    private boolean f209138h;

    /* JADX INFO: renamed from: i */
    private Handler f209139i;

    /* JADX INFO: renamed from: j */
    private MRtcEventHandler f209140j;

    /* JADX INFO: renamed from: k */
    private float f209141k;

    /* JADX INFO: renamed from: l */
    private float f209142l;

    /* JADX INFO: renamed from: m */
    private AudioProcess f209143m;

    /* JADX INFO: renamed from: n */
    private StreamProducer f209144n;

    /* JADX INFO: renamed from: o */
    protected ijkMediaStreamer.OnSurroundMusicStatusListener f209145o;

    /* JADX INFO: renamed from: p */
    private boolean f209146p;

    /* JADX INFO: renamed from: q */
    private boolean f209147q;

    /* JADX INFO: renamed from: r */
    private String f209148r;

    /* JADX INFO: renamed from: s */
    private String f209149s;

    /* JADX INFO: renamed from: t */
    private boolean f209150t;

    /* JADX INFO: renamed from: u */
    private boolean f209151u;

    /* JADX INFO: renamed from: v */
    private int f209152v;

    /* JADX INFO: renamed from: w */
    private int f209153w;

    /* JADX INFO: renamed from: x */
    private boolean[] f209154x;

    /* JADX INFO: renamed from: y */
    private HashMap f209155y;

    /* JADX INFO: renamed from: z */
    private Map f209156z;

    public AgoraWriter(Context context, EGLContext eGLContext, StreamProducer streamProducer, String str, boolean z) {
        this.f209136f = true;
        this.f209137g = false;
        this.f209138h = false;
        this.f209139i = new Handler(Looper.getMainLooper());
        this.f209141k = 1.0f;
        this.f209142l = 1.0f;
        this.f209146p = false;
        this.f209147q = false;
        this.f209148r = null;
        this.f209149s = null;
        this.f209150t = false;
        this.f209151u = false;
        this.f209152v = 0;
        this.f209153w = 7;
        this.f209154x = new boolean[7 + 1];
        this.f209155y = new HashMap();
        this.f209156z = new HashMap();
        this.f209107A = false;
        this.f209111E = null;
        this.f209112F = false;
        this.f209113G = new Object();
        this.f209114H = false;
        this.f209115I = false;
        this.f209116J = false;
        this.f209117K = null;
        this.f209118L = 0;
        this.f209119M = 0;
        this.f209120N = false;
        this.f209121O = 1.0f;
        this.f209122P = 0.7f;
        this.f209123Q = null;
        this.f209124R = -1;
        this.f209125S = 44100;
        this.f209126T = 1;
        this.f209128V = 2;
        this.f209129W = true;
        this.f209130X = new MRtcEventHandler() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.1
            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onAudioMixingFinished() {
                AgoraWriter agoraWriter = AgoraWriter.this;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = agoraWriter.f209145o;
                if (onSurroundMusicStatusListener != null) {
                    onSurroundMusicStatusListener.m224080a(agoraWriter.f209144n.f209558C, 2, 0);
                }
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onConnectionLost() {
                Log.e("AgoraWriter", "onConnectionLost");
                AgoraWriter.this.f209144n.notify(300, -304, 10, this);
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onError(final int i) {
                Log.e("AgoraWriter", "onError" + i);
                if (i == 17 || i == 18 || i == 1603 || i == 1 || i == 109 || i == 110 || i == 106) {
                    return;
                }
                AgoraWriter.this.setErrorCode(i);
                AgoraWriter.this.f209139i.post(new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!AgoraWriter.this.isHost() || AgoraWriter.this.f209144n == null) {
                            AgoraWriter.this.stopRecording();
                            if (AgoraWriter.this.f209144n != null) {
                                AgoraWriter.this.f209144n.notify(300, -304, i, this);
                            }
                            if (AgoraWriter.this.f209140j != null) {
                                AgoraWriter.this.f209140j.onUserOffline(AgoraWriter.this.getUserID(), i);
                                return;
                            }
                            return;
                        }
                        int i2 = i;
                        C225911 c225911 = C225911.this;
                        if (i2 != 0) {
                            AgoraWriter.this.f209144n.notify(300, -304, i, this);
                        } else {
                            AgoraWriter.this.f209144n.notify(300, -304, 12, this);
                        }
                    }
                });
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onFirstRemoteVideoDecoded(long j, int i, int i2, int i3) {
                Log.e("AgoraWriter", "onFirstRemoteVideoDecoded texture: " + j + ";width:" + i + ";height" + i2);
                AgoraWriter.this.m223424v(j, i, i2);
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onJoinChannelSuccess(String str2, final long j, int i) {
                synchronized (AgoraWriter.this.f209113G) {
                    try {
                        AgoraWriter.this.f209144n.notify(100, 0, 0, this);
                        if (AgoraWriter.this.f209133c == null) {
                            return;
                        }
                        if ((AgoraWriter.this.f209150t || AgoraWriter.this.f209151u) && AgoraWriter.this.getUserID() != j) {
                            AgoraWriter.this.f209139i.post(new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    SurfaceView surfaceView = AgoraWriter.this.f209135e != null ? new SurfaceView(AgoraWriter.this.f209135e) : null;
                                    if (AgoraWriter.this.f209127U == null || surfaceView == null) {
                                        return;
                                    }
                                    t9c.m189745c("AgoraWriter", "receiveVideoData: call onVideoChannelAdded()" + j);
                                    AgoraWriter.this.f209127U.mo20117a((long) ((int) j), surfaceView, 176, 176);
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
                if (AgoraWriter.this.f209156z != null && AgoraWriter.this.f209156z.containsKey(Long.valueOf(j))) {
                    helpSurface helpsurface = (helpSurface) AgoraWriter.this.f209156z.get(Long.valueOf(j));
                    AgoraWriter.this.f209156z.remove(Long.valueOf(j));
                    if (AgoraWriter.this.f209123Q != null) {
                        AgoraWriter.this.f209123Q.setVideoSurface(j, null);
                    }
                    helpsurface.m224119g();
                }
                long jM223402I = AgoraWriter.this.m223402I(j);
                if (jM223402I == -1 || !AgoraWriter.this.f209107A) {
                    return;
                }
                AgoraWriter.this.f209144n.m223905J1(jM223402I, true);
                AgoraWriter.this.f209144n.m223909L1(jM223402I, 0, 0, 0, 5);
                AgoraWriter.this.f209144n.m223964n2(jM223402I, null, 0, null);
                AgoraWriter.this.f209154x[(int) jM223402I] = false;
                AgoraWriter.this.f209155y.remove(Long.valueOf(j));
            }

            @Override // com.immomo.mediacore.coninf.MRtcEventHandler
            public void onWarning(int i) {
                AgoraWriter agoraWriter;
                ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener;
                if (i != 701 || (onSurroundMusicStatusListener = (agoraWriter = AgoraWriter.this).f209145o) == null) {
                    return;
                }
                onSurroundMusicStatusListener.m224080a(agoraWriter.f209144n.f209558C, -1, 0);
            }
        };
        this.f209149s = str;
        t9c.m189745c("AgoraWriter", "AgoraWriter:");
        this.f209135e = context;
        this.f209144n = streamProducer;
        this.f209134d = eGLContext;
        EngineConfig engineConfig = new EngineConfig();
        this.f209131a = engineConfig;
        engineConfig.f209759c = 0;
        MyEngineEventHandler myEngineEventHandler = new MyEngineEventHandler(this.f209135e, engineConfig, this, this.f209144n);
        this.f209132b = myEngineEventHandler;
        myEngineEventHandler.m224064q(this.f209130X);
        this.f209150t = z;
        this.f209123Q = new CongressUtil();
        m223425w();
        this.f209146p = false;
        this.f209112F = false;
        this.f209152v = 0;
        AudioProcess audioProcess = new AudioProcess();
        this.f209143m = audioProcess;
        int i = this.f209125S;
        audioProcess.openSabineEf(i, 1, (i * 10) / 1000);
        this.f209143m.setSlaveAudioGain(1.0f);
        this.f209143m.setSlaveAudioLevel(1.0f);
        this.f209143m.setMasterAudioLevel(1.0f);
    }

    /* JADX INFO: renamed from: A */
    private final void m223396A(String str, int i) {
        synchronized (this.f209113G) {
            try {
                if (this.f209133c == null) {
                    return;
                }
                if (this.f209147q) {
                    m223397B("1");
                }
                m223399E();
                RtcEngine rtcEngine = this.f209133c;
                if (rtcEngine != null && this.f209129W) {
                    rtcEngine.setDefaultAudioRoutetoSpeakerphone(true);
                }
                this.f209133c.joinChannel(this.f209148r, str, (String) null, i);
                this.f209131a.f209760d = str;
                this.f209147q = true;
                if (this.f209115I || this.f209150t) {
                    m223398C();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m223397B(String str) {
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.leaveChannel();
        }
        EngineConfig engineConfig = this.f209131a;
        if (engineConfig != null) {
            int i = engineConfig.f209757a;
            engineConfig.m224045a();
            t9c.m189745c("AgoraWriter", "leaveChannel " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i);
        }
        this.f209147q = false;
    }

    /* JADX INFO: renamed from: C */
    private void m223398C() {
        if (this.f209146p) {
            return;
        }
        this.f209144n.notify(102, 0, 0, this);
        this.f209146p = true;
    }

    /* JADX INFO: renamed from: E */
    private void m223399E() {
        VideoQuality videoQuality;
        int iM223919R0;
        boolean z = this.f209107A;
        StreamProducer streamProducer = this.f209144n;
        if (z) {
            videoQuality = streamProducer.m223986y0();
            iM223919R0 = this.f209144n.m223988z0() / 1000;
        } else {
            videoQuality = streamProducer.getVideoQuality();
            iM223919R0 = this.f209144n.m223919R0() / 1000;
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
        t9c.m189745c("AgoraWriter", "setVideoProfileEx1 bitrate:" + iM223919R0);
        enableVideo(this.f209150t ^ true);
    }

    /* JADX INFO: renamed from: G */
    private void m223400G() {
        if (this.f209114H) {
            return;
        }
        this.f209114H = true;
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.registerAudioFrameObserver(null);
            this.f209133c.registerAudioFrameObserver(this);
        }
    }

    /* JADX INFO: renamed from: H */
    private void m223401H() {
        if (this.f209114H) {
            this.f209114H = false;
            RtcEngine rtcEngine = this.f209133c;
            if (rtcEngine != null) {
                rtcEngine.registerAudioFrameObserver(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public long m223402I(long j) {
        long j2;
        if (getUserID() == j || j == this.f209153w || this.f209155y.size() > this.f209153w) {
            return -1L;
        }
        if (!this.f209155y.containsKey(Long.valueOf(j))) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i > this.f209153w) {
                    j2 = 0;
                    break;
                }
                boolean[] zArr = this.f209154x;
                if (!zArr[i]) {
                    j2 = i;
                    z = true;
                    zArr[i] = true;
                    break;
                }
                i++;
            }
            if (z) {
                this.f209155y.put(Long.valueOf(j), Long.valueOf(j2));
            }
        }
        Object obj = this.f209155y.get(Long.valueOf(j));
        if (obj != null) {
            return ((Long) obj).longValue();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: K */
    private void m223403K() {
    }

    /* JADX INFO: renamed from: t */
    private void m223422t() {
        this.f209110D = null;
        this.f209108B = null;
        this.f209109C = null;
    }

    /* JADX INFO: renamed from: u */
    private final void m223423u(int i, int i2) {
        synchronized (this.f209113G) {
            try {
                RtcEngine rtcEngine = this.f209133c;
                if (rtcEngine == null) {
                    return;
                }
                EngineConfig engineConfig = this.f209131a;
                engineConfig.f209757a = i;
                engineConfig.f209758b = i2;
                rtcEngine.setClientRole(i);
                m223403K();
                t9c.m189745c("AgoraWriter", "configEngine " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f209131a.f209758b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m223424v(final long j, final int i, final int i2) {
        if (this.f209150t) {
            return;
        }
        this.f209139i.post(new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.3
            @Override // java.lang.Runnable
            public void run() {
                SurfaceView surfaceView = new SurfaceView(AgoraWriter.this.f209135e);
                boolean z = AgoraWriter.this.f209107A;
                AgoraWriter agoraWriter = AgoraWriter.this;
                if (z) {
                    if (agoraWriter.f209127U != null) {
                        AgoraWriter.this.f209127U.mo20117a(j, null, i, i2);
                        if (AgoraWriter.this.f209143m != null) {
                            AgoraWriter.this.f209143m.clearSurroundFrames();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (agoraWriter.f209133c != null) {
                    AgoraWriter.this.f209133c.setupRemoteVideo(new VideoCanvas(surfaceView, 1, (int) j));
                }
                t9c.m189745c("AgoraWriter", "doRenderRemoteUi:" + AgoraWriter.this.f209127U);
                if (AgoraWriter.this.f209127U != null) {
                    AgoraWriter.this.f209127U.mo20117a(j, surfaceView, i, i2);
                }
            }
        });
        if (this.f209156z.containsKey(Long.valueOf(j)) || !this.f209107A) {
            return;
        }
        long jM223402I = m223402I(j);
        helpSurface helpsurface = new helpSurface(null, jM223402I);
        CongressUtil congressUtil = this.f209123Q;
        if (congressUtil != null) {
            congressUtil.setVideoSurface(j, helpsurface.m224116c());
        }
        if (jM223402I != -1) {
            this.f209144n.m223909L1(jM223402I, i, i2, 0, 5);
        }
        helpsurface.m224120h(this.f209144n.m223904J0());
        this.f209156z.put(Long.valueOf(j), helpsurface);
    }

    /* JADX INFO: renamed from: w */
    private RtcEngine m223425w() {
        if (this.f209133c == null) {
            String strM223432z = m223432z(new byte[]{1, 1, 1});
            if (TextUtils.isEmpty(strM223432z)) {
                azk0.m101074a("NEED TO use your vendor key, get your own key at https://dashboard.agora.io/");
                return null;
            }
            try {
                String str = this.f209149s;
                if (str == null || TextUtils.isEmpty(str)) {
                    this.f209133c = RtcEngine.create(this.f209135e, strM223432z, this.f209132b.f209782v);
                } else {
                    this.f209133c = RtcEngine.create(this.f209135e, this.f209149s, this.f209132b.f209782v);
                }
                boolean z = t9c.f172625a;
            } catch (Exception unused) {
                StreamProducer streamProducer = this.f209144n;
                if (streamProducer != null) {
                    streamProducer.notify(300, -304, -1, this);
                }
            }
            this.f209133c.setRecordingAudioFrameParameters(this.f209125S, 1, 2, 1024);
            this.f209133c.setPlaybackAudioFrameParameters(this.f209125S, 1, 0, 1024);
            this.f209133c.setChannelProfile(1);
            this.f209133c.enableDualStreamMode(false);
            boolean z2 = this.f209150t;
            RtcEngine rtcEngine = this.f209133c;
            if (z2) {
                rtcEngine.disableVideo();
            } else {
                rtcEngine.enableVideo();
            }
        }
        this.f209136f = this.f209133c.isTextureEncodeSupported();
        return this.f209133c;
    }

    /* JADX INFO: renamed from: y */
    private boolean m223426y() {
        return (this.f209110D == null && this.f209108B == null && this.f209109C == null) ? false : true;
    }

    /* JADX INFO: renamed from: D */
    public void m223427D() {
        Log.e("AgoraWriter", "onMediaEngineLoadSuccess");
    }

    /* JADX INFO: renamed from: F */
    public void m223428F(int i) {
        try {
            CongressUtil congressUtil = this.f209123Q;
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
    public void m223429J(long j, ByteBuffer byteBuffer, int i) {
        t9c.m189745c("AgoraWriter", "writevideo:" + i + ";timeStamp:" + j);
        VideoQuality videoQuality = this.f209144n.getVideoQuality();
        if (videoQuality == null) {
            return;
        }
        if (videoQuality.resX < 176) {
            videoQuality.resX = 176;
        }
        if (videoQuality.resY < 176) {
            videoQuality.resY = 176;
        }
        if (this.f209136f || !this.f209137g || this.f209150t) {
            return;
        }
        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
        agoraVideoFrame.format = 1;
        agoraVideoFrame.timeStamp = System.currentTimeMillis();
        agoraVideoFrame.stride = videoQuality.resX;
        agoraVideoFrame.height = videoQuality.resY;
        agoraVideoFrame.rotation = 0;
        agoraVideoFrame.buf = byteBuffer.array();
        synchronized (this.f209113G) {
            try {
                RtcEngine rtcEngine = this.f209133c;
                if (rtcEngine != null && !this.f209115I) {
                    rtcEngine.pushExternalVideoFrame(agoraVideoFrame);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = this.f209152v + 1;
        this.f209152v = i2;
        if (i2 > 20) {
            m223398C();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void SabineEffectReset() {
        AudioProcess audioProcess = this.f209143m;
        if (audioProcess != null) {
            audioProcess.SabineEffectReset();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void SabineEffectSet(int i, int i2, float f) {
        AudioProcess audioProcess = this.f209143m;
        if (audioProcess != null) {
            audioProcess.SabineEffectSet(i, i2, f);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void SetSubVideoPos(long j, int i, int i2, int i3, int i4) {
        if (getUserID() == j || !this.f209137g) {
            return;
        }
        long jM223402I = m223402I(j);
        if (jM223402I != -1) {
            this.f209144n.m223907K1(jM223402I, i, i2, i3, i4, 0);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void addEventHandler(MRtcEventHandler mRtcEventHandler) {
        this.f209140j = mRtcEventHandler;
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m224064q(mRtcEventHandler);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void addMRtcAudioHandler(MRtcAudioHandler mRtcAudioHandler) {
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m224065r(mRtcAudioHandler);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void addMRtcAudioHandlerEx(MRtcAudioHandlerEx mRtcAudioHandlerEx) {
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m224066s(mRtcAudioHandlerEx);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void addMRtcChannelHandler(MRtcChannelHandler mRtcChannelHandler) {
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        if (myEngineEventHandler != null) {
            myEngineEventHandler.m224067t(mRtcChannelHandler);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void adjustEQ(int i, boolean z) {
        AudioProcess audioProcess = this.f209143m;
        if (audioProcess != null) {
            audioProcess.adjustEQ(i, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void adjustEf(int i, int i2) {
        AudioProcess audioProcess = this.f209143m;
        if (audioProcess != null) {
            audioProcess.adjustEf(i, i2);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void adjustTune(int i, boolean z) {
        AudioProcess audioProcess = this.f209143m;
        if (audioProcess != null) {
            audioProcess.adjustTune(i, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int changeRole(int i) {
        t9c.m189745c("AgoraWriter", "changeRole:" + i);
        setErrorCode(0);
        int clientRole = -1;
        if (i == this.f209126T) {
            return -1;
        }
        this.f209126T = i;
        this.f209144n.m223977s1(false);
        synchronized (this.f209113G) {
            try {
                if (1 == i) {
                    this.f209137g = true;
                    if (!this.f209136f) {
                        this.f209144n.f209558C.addSoftListener(new qmq0.InterfaceC19603a() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.5
                            @Override // p153l.qmq0.InterfaceC19603a
                            /* JADX INFO: renamed from: a */
                            public void mo128845a(ByteBuffer byteBuffer, long j) {
                                if (AgoraWriter.this.f209115I) {
                                    return;
                                }
                                AgoraWriter.this.m223429J(System.currentTimeMillis(), byteBuffer, byteBuffer.limit());
                            }
                        });
                    }
                } else {
                    this.f209138h = true;
                    this.f209137g = false;
                }
                if ((1 == i && this.f209111E != null) || 2 == i || this.f209115I || this.f209150t) {
                    t9c.m189745c("AgoraWriter", "changeRole:" + i);
                    m223399E();
                    clientRole = this.f209133c.setClientRole(i);
                } else {
                    this.f209112F = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (1 == i && (this.f209115I || this.f209150t)) {
            m223398C();
        }
        return clientRole;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void enableAudio(boolean z) {
        RtcEngine rtcEngine = this.f209133c;
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
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.enableAudioVolumeIndication(i, i2, false);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void enableCommMode(boolean z) {
        RtcEngine rtcEngine;
        if (z && (rtcEngine = this.f209133c) != null) {
            rtcEngine.setParameters("{\"che.audio.live_for_comm\":true}");
            return;
        }
        RtcEngine rtcEngine2 = this.f209133c;
        if (rtcEngine2 != null) {
            rtcEngine2.setParameters("{\"che.audio.live_for_comm\":false}");
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void enableVideo(boolean z) {
        VideoQuality videoQuality;
        int iM223919R0;
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            if (!z) {
                rtcEngine.disableVideo();
                return;
            }
            rtcEngine.enableVideo();
            boolean z2 = this.f209107A;
            StreamProducer streamProducer = this.f209144n;
            if (z2) {
                videoQuality = streamProducer.m223986y0();
                iM223919R0 = this.f209144n.m223988z0() / 1000;
            } else {
                videoQuality = streamProducer.getVideoQuality();
                iM223919R0 = this.f209144n.m223919R0() / 1000;
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
            t9c.m189745c("AgoraWriter", "setVideoProfileEx1 bitrate:" + iM223919R0);
            this.f209133c.setParameters("{\"che.video.keyFrameInterval\":1}");
            this.f209118L = videoQuality.resX;
            this.f209119M = videoQuality.resY;
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getAudioBitRate() {
        IRtcEngineEventHandler.RtcStats rtcStatsM224073z;
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        if (myEngineEventHandler == null || (rtcStatsM224073z = myEngineEventHandler.m224073z()) == null) {
            return 0;
        }
        return rtcStatsM224073z.txAudioKBitRate;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAudioRxbytes() {
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public String getAudioVideoStatics() {
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        return myEngineEventHandler != null ? myEngineEventHandler.m224068u() : "[(0)]";
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getAvFlag() {
        if (this.f209150t) {
            return 2;
        }
        return super.getAvFlag();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getAverageSendBitRateB() {
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        IRtcEngineEventHandler.RtcStats rtcStatsM224073z = myEngineEventHandler != null ? myEngineEventHandler.m224073z() : null;
        if (rtcStatsM224073z != null) {
            return (rtcStatsM224073z.txKBitRate * 1000) / 8;
        }
        return 0L;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getEarMonitoringAudioParams() {
        return null;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public float getMasterAudioLevel() {
        return this.f209141k;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getMixedAudioParams() {
        return null;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public boolean getMuteStatus() {
        return super.getMuteStatus() | (this.f209126T != 1);
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
        if (this.f209150t) {
            return 0;
        }
        return this.f209119M;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getPublisherVideoWidth() {
        if (this.f209150t) {
            return 0;
        }
        return this.f209118L;
    }

    @Override // io.agora.rtc2.IAudioFrameObserver
    public AudioParams getRecordAudioParams() {
        return null;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getRxbytes() {
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        IRtcEngineEventHandler.RtcStats rtcStatsM224073z = myEngineEventHandler != null ? myEngineEventHandler.m224073z() : null;
        if (rtcStatsM224073z != null) {
            return rtcStatsM224073z.rxBytes;
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public float getSlaveAudioLevel() {
        return this.f209142l;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getStreamerType() {
        return 1;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getSurroundMusicDuration() {
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingDuration();
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getSurroundMusicPos() {
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            return rtcEngine.getAudioMixingCurrentPosition();
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getTxbytes() {
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        IRtcEngineEventHandler.RtcStats rtcStatsM224073z = myEngineEventHandler != null ? myEngineEventHandler.m224073z() : null;
        if (rtcStatsM224073z != null) {
            return rtcStatsM224073z.txBytes;
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getVideoBitRate() {
        boolean z = this.f209137g;
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        if (z) {
            IRtcEngineEventHandler.LocalVideoStats localVideoStatsM224069v = myEngineEventHandler != null ? myEngineEventHandler.m224069v() : null;
            if (localVideoStatsM224069v != null) {
                return localVideoStatsM224069v.sentBitrate;
            }
            return 0;
        }
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM224071x = myEngineEventHandler != null ? myEngineEventHandler.m224071x() : null;
        if (remoteVideoStatsM224071x != null) {
            return remoteVideoStatsM224071x.receivedBitrate;
        }
        return 0;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getVideoFrameRate() {
        boolean z = this.f209137g;
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        if (z) {
            IRtcEngineEventHandler.LocalVideoStats localVideoStatsM224069v = myEngineEventHandler != null ? myEngineEventHandler.m224069v() : null;
            if (localVideoStatsM224069v != null) {
                return localVideoStatsM224069v.sentFrameRate;
            }
            return 0;
        }
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM224071x = myEngineEventHandler != null ? myEngineEventHandler.m224071x() : null;
        if (remoteVideoStatsM224071x != null) {
            return remoteVideoStatsM224071x.rendererOutputFrameRate;
        }
        return 0;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int getVideoFreezeCount() {
        boolean z = this.f209137g;
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        if (z) {
            if (myEngineEventHandler != null) {
                return myEngineEventHandler.m224070w();
            }
            return 0;
        }
        if (myEngineEventHandler != null) {
            return myEngineEventHandler.m224072y();
        }
        return 0;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getVideoRxbytes() {
        MyEngineEventHandler myEngineEventHandler = this.f209132b;
        IRtcEngineEventHandler.RemoteVideoStats remoteVideoStatsM224071x = myEngineEventHandler != null ? myEngineEventHandler.m224071x() : null;
        if (remoteVideoStatsM224071x != null) {
            return remoteVideoStatsM224071x.receivedBitrate;
        }
        return 0L;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public long getWriteByte() {
        return getTxbytes();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void ignoreWriterSEI(boolean z) {
        this.f209151u = z;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public boolean isPlaying() {
        return this.f209138h;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteAllRemoteAudioStream(boolean z) {
        t9c.m189745c("AgoraWriter", "muteAllRemoteAudioStream mute" + z);
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteAllRemoteVideoStream(boolean z) {
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteVideoStreams(z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteLocalAudioStream(boolean z) {
        RtcEngine rtcEngine = this.f209133c;
        if (z) {
            if (rtcEngine != null) {
                rtcEngine.adjustRecordingSignalVolume(0);
            }
        } else if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(false);
            this.f209133c.adjustRecordingSignalVolume((int) (this.f209141k * 100.0f));
        }
        setMuteStatus(z);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteLocalAudioStreamForGame(boolean z) {
        t9c.m189745c("AgoraWriter", "muteLocalAudioStreamForGame " + z);
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(z);
        }
        setMuteStatus(z);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteLocalVideoStream(boolean z) {
        this.f209115I = z;
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalVideoStream(z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteRemoteAudioStream(long j, boolean z) {
        t9c.m189745c("AgoraWriter", "muteRemoteAudioStream uid" + j + ";mute:" + z);
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteRemoteAudioStream((int) j, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void muteRemoteVideoStream(long j, boolean z) {
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteRemoteVideoStream((int) j, z);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void notifyUpdateResolution() {
        t9c.m189745c("AgoraWriter", "notifyUpdateResolution:");
        synchronized (this.f209113G) {
            try {
                StreamProducer streamProducer = this.f209144n;
                if (streamProducer == null) {
                    return;
                }
                if (this.f209107A) {
                    this.f209111E = streamProducer.m223986y0();
                } else {
                    this.f209111E = streamProducer.getVideoQuality();
                }
                if (this.f209111E == null) {
                    return;
                }
                t9c.m189745c("AgoraWriter", "setVideoBitrate width:" + this.f209111E.resX + ";heigh:" + this.f209111E.resY);
                if (this.f209112F) {
                    t9c.m189745c("AgoraWriter", "dealyed changeRole:1");
                    m223399E();
                    this.f209133c.setClientRole(1);
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
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(true);
            this.f209133c.muteAllRemoteVideoStreams(true);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void pauseRecording() {
        Log.e("AgoraWriter", "pauseRecording");
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(true);
        }
        Runnable runnable = new Runnable() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.2
            @Override // java.lang.Runnable
            public void run() {
                boolean zIsHost = AgoraWriter.this.isHost();
                AgoraWriter agoraWriter = AgoraWriter.this;
                if (zIsHost) {
                    agoraWriter.f209144n.notify(300, -304, 201, this);
                } else if (agoraWriter.f209140j != null) {
                    AgoraWriter.this.f209140j.onUserOffline(AgoraWriter.this.getUserID(), 201);
                }
            }
        };
        this.f209117K = runnable;
        this.f209139i.postDelayed(runnable, HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void pauseSurroundMusic() {
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.pauseAudioMixing();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void postDrawImage(int i) {
        if (!this.f209136f || i == 0 || !this.f209137g || this.f209150t) {
            return;
        }
        t9c.m189745c("AgoraWriter", "postDrawImage texture: " + i);
        int i2 = this.f209152v + 1;
        this.f209152v = i2;
        if (i2 > 20) {
            m223398C();
        }
        boolean z = this.f209107A;
        StreamProducer streamProducer = this.f209144n;
        VideoQuality videoQualityM223986y0 = z ? streamProducer.m223986y0() : streamProducer.getVideoQuality();
        if (videoQualityM223986y0 == null) {
            return;
        }
        if (videoQualityM223986y0.resX < 176) {
            videoQualityM223986y0.resX = 176;
        }
        if (videoQualityM223986y0.resY < 176) {
            videoQualityM223986y0.resY = 176;
        }
        t9c.m189745c("AgoraWriter", "postDrawImage texture: " + i + "qu.resX:" + videoQualityM223986y0.resX + "qu.resY" + videoQualityM223986y0.resY);
        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
        agoraVideoFrame.format = 10;
        agoraVideoFrame.timeStamp = System.currentTimeMillis();
        agoraVideoFrame.stride = videoQualityM223986y0.resX;
        agoraVideoFrame.height = videoQualityM223986y0.resY;
        agoraVideoFrame.textureID = i;
        agoraVideoFrame.transform = f209106Y;
        synchronized (this.f209113G) {
            try {
                RtcEngine rtcEngine = this.f209133c;
                if (rtcEngine != null && !this.f209115I) {
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
        Handler handler = this.f209139i;
        if (handler != null) {
            handler.removeCallbacks(null, null);
            this.f209139i.removeCallbacksAndMessages(null);
        }
        DeinitAudioTracks();
        synchronized (this.f209113G) {
            try {
                this.f209137g = false;
                this.f209138h = false;
                RtcEngine rtcEngine = this.f209133c;
                if (rtcEngine != null) {
                    rtcEngine.registerAudioFrameObserver(null);
                    RtcEngine.destroy();
                    this.f209133c = null;
                }
                MyEngineEventHandler myEngineEventHandler = this.f209132b;
                if (myEngineEventHandler != null) {
                    myEngineEventHandler.m224063B(this.f209130X);
                    this.f209132b.m224063B(this.f209140j);
                    MyEngineEventHandler myEngineEventHandler2 = this.f209132b;
                    myEngineEventHandler2.f209782v = null;
                    myEngineEventHandler2.m224062A();
                    this.f209132b = null;
                }
                this.f209130X = null;
                this.f209140j = null;
                AudioProcess audioProcess = this.f209143m;
                if (audioProcess != null) {
                    audioProcess.clear();
                    this.f209143m.release();
                    this.f209143m = null;
                }
                this.f209144n = null;
                this.f209135e = null;
                this.f209131a = null;
                this.f209132b = null;
                this.f209134d = null;
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
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteAllRemoteAudioStreams(false);
            this.f209133c.muteAllRemoteVideoStreams(false);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void resumeRecording() {
        Log.e("AgoraWriter", "resumeRecording");
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.muteLocalAudioStream(false);
            this.f209137g = true;
        }
        Handler handler = this.f209139i;
        if (handler != null) {
            handler.removeCallbacks(this.f209117K);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void resumeSurroundMusic() {
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.resumeAudioMixing();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m223430s() {
        try {
            CongressUtil congressUtil = this.f209123Q;
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
        this.f209120N = z;
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine == null || !z) {
            return;
        }
        rtcEngine.setParameters("{\"che.audio.high.quality.mode\":true}");
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setAudioSamplingRate(int i) {
        this.f209125S = i;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setChannalName(String str) {
        this.f209131a.f209760d = str;
        super.setChannalName(str);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setChannelkey(String str) {
        this.f209148r = str;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setDefaultAudioRoutetoSpeakerphone(boolean z) {
        this.f209129W = z;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public int setEnableSpeakerphone(boolean z) {
        RtcEngine rtcEngine = this.f209133c;
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
        boolean z = this.f209107A;
        StreamProducer streamProducer = this.f209144n;
        if ((z ? streamProducer.m223986y0() : streamProducer.getVideoQuality()) == null) {
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
                    if (jSONObject2 != null && jSONObject2.has(BaseSei.f14624X)) {
                        jSONObject2.getDouble(BaseSei.f14624X);
                    }
                    if (jSONObject2 != null && jSONObject2.has(BaseSei.f14625Y)) {
                        jSONObject2.getDouble(BaseSei.f14625Y);
                    }
                    if (jSONObject2 != null && jSONObject2.has("w")) {
                        jSONObject2.getDouble("w");
                    }
                    if (jSONObject2 != null && jSONObject2.has("h")) {
                        jSONObject2.getDouble("h");
                    }
                    if (jSONObject2 != null && jSONObject2.has(BaseSei.f14626Z)) {
                        jSONObject2.getInt(BaseSei.f14626Z);
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
        float f2 = this.f209121O * f;
        this.f209141k = f2;
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.adjustRecordingSignalVolume((int) (f2 * 100.0f));
        }
        AudioProcess audioProcess = this.f209143m;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setOnSurroundMusicStatusListener(Object obj) {
        this.f209145o = (ijkMediaStreamer.OnSurroundMusicStatusListener) obj;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setParameters(String str) {
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.setParameters(str);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setPcmDataCallback(SinkBase.PcmDateCallback pcmDateCallback) {
        this.f209108B = pcmDateCallback;
        if (m223426y()) {
            m223400G();
        } else {
            m223401H();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setPlayBackAudioLevel(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.adjustPlaybackSignalVolume((int) (f * 100.0f));
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setPlaybackDateCallback(SinkBase.PlaybackDateCallback playbackDateCallback) {
        this.f209109C = playbackDateCallback;
        if (m223426y()) {
            m223400G();
        } else {
            m223401H();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setRecordDateCallback(SinkBase.RecordDateCallback recordDateCallback) {
        this.f209110D = recordDateCallback;
        if (m223426y()) {
            m223400G();
        } else {
            m223401H();
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setRole(int i) {
        this.f209126T = i;
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.setClientRole(i);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setRoomMode(int i) {
        this.f209124R = 2;
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
        float f2 = this.f209122P * f;
        this.f209142l = f2;
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.adjustAudioMixingVolume((int) (f2 * 100.0f));
        }
        AudioProcess audioProcess = this.f209143m;
        if (audioProcess != null) {
            audioProcess.setSlaveAudioLevel(f);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setStreamerInOutAndType(int i, String str, String str2) {
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setUserID(int i) {
        this.f209131a.f209759c = i;
        super.setUserID(i);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void setVideoChannellistener(Object obj) {
        this.f209127U = (ebl0) obj;
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startAttachStreamer() {
        this.f209107A = true;
        startRecording();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startPlaying() {
        t9c.m189745c("AgoraWriter", "startPlaying:");
        if (TextUtils.isEmpty(getChannalName())) {
            azk0.m101074a("startPlaying getChannalName null exception");
            return;
        }
        if (getUserID() == 0) {
            azk0.m101074a("startRecording getUserID =0");
            return;
        }
        setErrorCode(0);
        this.f209144n.m223977s1(false);
        if (this.f209111E == null) {
            this.f209144n.m223916P1(200000);
            this.f209144n.m223920R1(176, 176);
        }
        m223423u(2, 33);
        this.f209138h = true;
        m223396A(getChannalName(), (int) getUserID());
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startRecording() {
        t9c.m189745c("AgoraWriter", "startRecording");
        if (TextUtils.isEmpty(getChannalName())) {
            azk0.m101074a("startRecording getChannalName null exception");
            return;
        }
        if (getUserID() == 0) {
            azk0.m101074a("startRecording getUserID =0");
            return;
        }
        setErrorCode(0);
        this.f209112F = false;
        this.f209144n.m223977s1(false);
        m223423u(this.f209126T, 33);
        this.f209137g = true;
        if (!this.f209136f) {
            this.f209144n.f209558C.addSoftListener(new qmq0.InterfaceC19603a() { // from class: tv.danmaku.ijk.media.sink.AgoraWriter.4
                @Override // p153l.qmq0.InterfaceC19603a
                /* JADX INFO: renamed from: a */
                public void mo128845a(ByteBuffer byteBuffer, long j) {
                    if (AgoraWriter.this.f209115I) {
                        return;
                    }
                    AgoraWriter.this.m223429J(System.currentTimeMillis(), byteBuffer, byteBuffer.limit());
                }
            });
        }
        this.f209146p = false;
        this.f209152v = 0;
        m223396A(getChannalName(), (int) getUserID());
        AudioProcess audioProcess = this.f209143m;
        if (audioProcess != null) {
            audioProcess.clear();
        }
        if (this.f209107A) {
            m223428F(1);
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startSurroundMusic(String str, int i, long j) {
        ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener;
        if (this.f209133c == null || (onSurroundMusicStatusListener = this.f209145o) == null) {
            return;
        }
        onSurroundMusicStatusListener.m224080a(this.f209144n.f209558C, 1, 0);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void startSurroundMusicEx(String str, boolean z, boolean z2, int i) {
        ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener;
        if (this.f209133c == null || (onSurroundMusicStatusListener = this.f209145o) == null) {
            return;
        }
        onSurroundMusicStatusListener.m224080a(this.f209144n.f209558C, 1, 0);
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void stopPlaying() {
        t9c.m189745c("AgoraWriter", "stopPlaying:");
        synchronized (this.f209113G) {
            this.f209138h = false;
            this.f209137g = false;
            m223397B("1");
            m223428F(0);
            this.f209112F = false;
        }
        m223422t();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void stopRecording() {
        t9c.m189745c("AgoraWriter", "stopRecording:");
        synchronized (this.f209113G) {
            super.stopRecording();
            this.f209137g = false;
            m223397B("1");
            m223430s();
            m223428F(0);
            this.f209112F = false;
        }
        m223422t();
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void stopSurroundMusic() {
        RtcEngine rtcEngine = this.f209133c;
        if (rtcEngine != null) {
            rtcEngine.stopAudioMixing();
            ijkMediaStreamer.OnSurroundMusicStatusListener onSurroundMusicStatusListener = this.f209145o;
            if (onSurroundMusicStatusListener != null) {
                onSurroundMusicStatusListener.m224080a(this.f209144n.f209558C, 2, 0);
            }
        }
    }

    @Override // com.immomo.mediacore.sink.SinkBase
    public void updateChannelkey(String str) {
        this.f209148r = str;
        RtcEngine rtcEngine = this.f209133c;
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
        return this.f209133c;
    }

    /* JADX INFO: renamed from: z */
    public String m223432z(byte[] bArr) {
        try {
            CongressUtil congressUtil = this.f209123Q;
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
