package tv.danmaku.ijk.media.source;

import android.app.Activity;
import android.graphics.PointF;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import p153l.t9c;
import tv.danmaku.ijk.media.streamer.MomoSurface;
import tv.danmaku.ijk.media.util.helpSurface;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenSource extends SourceBase {

    /* JADX INFO: renamed from: a */
    private MomoSurface f209283a;

    /* JADX INFO: renamed from: b */
    private VirtualDisplay f209284b;

    /* JADX INFO: renamed from: c */
    private helpSurface f209285c;

    /* JADX INFO: renamed from: e */
    private ScreenRunnable f209287e;

    /* JADX INFO: renamed from: f */
    private Thread f209288f;

    /* JADX INFO: renamed from: l */
    protected VideoQuality f209294l;

    /* JADX INFO: renamed from: m */
    protected VideoQuality f209295m;

    /* JADX INFO: renamed from: n */
    private float f209296n;

    /* JADX INFO: renamed from: o */
    private NotifyCenter f209297o;

    /* JADX INFO: renamed from: p */
    private int f209298p;

    /* JADX INFO: renamed from: q */
    private int f209299q;

    /* JADX INFO: renamed from: r */
    private int f209300r;

    /* JADX INFO: renamed from: s */
    private int f209301s;

    /* JADX INFO: renamed from: t */
    private int f209302t;

    /* JADX INFO: renamed from: u */
    private int f209303u;

    /* JADX INFO: renamed from: d */
    public boolean f209286d = false;

    /* JADX INFO: renamed from: g */
    public boolean f209289g = false;

    /* JADX INFO: renamed from: h */
    public Object f209290h = new Object();

    /* JADX INFO: renamed from: i */
    public int f209291i = 480;

    /* JADX INFO: renamed from: j */
    public int f209292j = 640;

    /* JADX INFO: renamed from: k */
    private PointF f209293k = new PointF(16.0f, 9.0f);

    public class ScreenRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        private volatile boolean f209304a;

        /* JADX INFO: renamed from: b */
        private MomoSurface f209305b;

        /* JADX INFO: renamed from: c */
        private helpSurface f209306c;

        /* JADX INFO: renamed from: d */
        private int f209307d;

        /* JADX INFO: renamed from: e */
        private int f209308e;

        private ScreenRunnable() {
            this.f209304a = false;
            this.f209305b = null;
            this.f209306c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m223580a() {
            this.f209304a = true;
        }

        /* JADX INFO: renamed from: b */
        public void m223581b(helpSurface helpsurface) {
            this.f209306c = helpsurface;
            if (helpsurface != null) {
                t9c.m189745c("ScreenStream", "----screen: textureID=" + this.f209306c.m224118e() + ",surfaceTexture=" + this.f209306c.m224117d());
            }
        }

        /* JADX INFO: renamed from: c */
        public void m223582c(MomoSurface momoSurface) {
            this.f209305b = momoSurface;
        }

        /* JADX INFO: renamed from: d */
        public void m223583d(int i, int i2) {
            t9c.m189743a("ScreenStream", "screen size: " + i + Constants.SEPARATOR_COMMA + i2);
            this.f209307d = i2;
            this.f209308e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            helpSurface helpsurface;
            while (!this.f209304a) {
                try {
                    Thread.sleep(20L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MomoSurface momoSurface = this.f209305b;
                if (momoSurface != null && (helpsurface = this.f209306c) != null) {
                    momoSurface.m223724h1(helpsurface.m224117d(), this.f209306c.m224118e(), this.f209308e, this.f209307d);
                }
            }
            t9c.m189743a("ScreenStream", "screen runnable:" + this.f209304a);
            t9c.m189745c("ScreenStream", "screen runnable thread exit success");
        }
    }

    public ScreenSource(MomoSurface momoSurface, NotifyCenter notifyCenter) {
        VideoQuality videoQualityM225057clone = VideoQuality.DEFAULT_VIDEO_QUALITY.m225057clone();
        this.f209294l = videoQualityM225057clone;
        this.f209295m = videoQualityM225057clone.m225057clone();
        this.f209296n = 1.0f;
        this.f209298p = 480;
        this.f209299q = 640;
        this.f209300r = -1;
        this.f209301s = 1;
        this.f209302t = 352;
        this.f209303u = 640;
        this.f209283a = momoSurface;
        this.f209297o = notifyCenter;
    }

    /* JADX INFO: renamed from: S */
    private int m223574S(int i) {
        int i2 = (i / 2) * 2;
        if (i2 < 176) {
            return 176;
        }
        return i2;
    }

    /* JADX INFO: renamed from: T */
    private int m223575T(int i) {
        int i2 = (i / 16) * 16;
        if (i2 < 176) {
            return 176;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0023 A[Catch: all -> 0x0017, TryCatch #0 {, blocks: (B:7:0x000c, B:11:0x0013, B:17:0x001d, B:16:0x001a, B:18:0x001f, B:20:0x0023, B:21:0x0028, B:23:0x002c, B:24:0x0031), top: B:28:0x000c, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x002c A[Catch: all -> 0x0017, TryCatch #0 {, blocks: (B:7:0x000c, B:11:0x0013, B:17:0x001d, B:16:0x001a, B:18:0x001f, B:20:0x0023, B:21:0x0028, B:23:0x002c, B:24:0x0031), top: B:28:0x000c, inners: #1 }] */
    /* JADX INFO: renamed from: U */
    private void m223576U() {
        helpSurface helpsurface;
        VirtualDisplay virtualDisplay;
        if (this.f209288f != null) {
            this.f209287e.m223580a();
        }
        synchronized (this.f209290h) {
            Thread thread = this.f209288f;
            if (thread != null) {
                try {
                    thread.join(50L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f209288f = null;
                helpsurface = this.f209285c;
                if (helpsurface != null) {
                    helpsurface.m224119g();
                    this.f209285c = null;
                }
                virtualDisplay = this.f209284b;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    this.f209284b = null;
                }
            } else {
                helpsurface = this.f209285c;
                if (helpsurface != null) {
                    helpsurface.m224119g();
                    this.f209285c = null;
                }
                virtualDisplay = this.f209284b;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    this.f209284b = null;
                }
            }
            throw th;
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: B */
    public void mo223508B(int i, int i2) {
        this.f209298p = i;
        this.f209299q = i2;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: K */
    public void mo223577K(Activity activity, int i, int i2, MediaProjection mediaProjection, int i3) {
        long j;
        C226121 c226121;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f209289g) {
            t9c.m189743a("ScreenStream", "screen capture: last release");
            m223576U();
        }
        synchronized (this.f209290h) {
            helpSurface helpsurface = new helpSurface(null, i, i2);
            this.f209285c = helpsurface;
            try {
                j = jCurrentTimeMillis;
                c226121 = null;
                try {
                    this.f209284b = mediaProjection.createVirtualDisplay("MainScreen", i, i2, 1, 19, helpsurface.m224116c(), null, null);
                    t9c.m189743a("ScreenStream", "width=" + i + ",height=" + i2 + ",angle=" + i3 + ",cost time: " + (System.currentTimeMillis() - j));
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e = e2;
                j = jCurrentTimeMillis;
                c226121 = null;
            }
            int i4 = this.f209301s;
            if (i4 != 1) {
                if (i4 != 2) {
                    this.f209302t = i;
                    this.f209303u = i2;
                    this.f209301s = 3;
                } else if (i > i2) {
                    this.f209302t = i;
                    this.f209303u = i2;
                } else {
                    this.f209302t = i2;
                    this.f209303u = i;
                }
            } else if (i > i2) {
                this.f209302t = i2;
                this.f209303u = i;
            } else {
                this.f209302t = i;
                this.f209303u = i2;
            }
            this.f209300r = i3;
            mo223508B(i, i2);
            m223579V();
            this.f209285c.m224120h(this.f209283a);
            this.f209287e = new ScreenRunnable();
            this.f209288f = new Thread(this.f209287e, "live-media-ScreenSource");
            this.f209287e.m223583d(i, i2);
            this.f209287e.m223581b(this.f209285c);
            this.f209287e.m223582c(this.f209283a);
            this.f209289g = true;
            this.f209288f.start();
            t9c.m189743a("ScreenStream", "switch to screen success, cost time: " + (System.currentTimeMillis() - j));
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: M */
    public void mo223578M() {
        m223576U();
        this.f209289g = false;
        t9c.m189743a("ScreenStream", "screen capture stop success");
    }

    /* JADX INFO: renamed from: V */
    public void m223579V() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f209302t = m223575T(this.f209302t);
        int iM223574S = m223574S(this.f209303u);
        this.f209303u = iM223574S;
        VideoQuality videoQuality = this.f209295m;
        videoQuality.resX = this.f209302t;
        videoQuality.resY = iM223574S;
        t9c.m189745c("ScreenStream", "input:[" + this.f209298p + Constants.SEPARATOR_COMMA + this.f209299q + "]; output:[" + this.f209302t + Constants.SEPARATOR_COMMA + this.f209303u + Constants.AES_SUFFIX);
        MomoSurface momoSurface = this.f209283a;
        if (momoSurface != null) {
            momoSurface.m223710Y0(this.f209295m);
            this.f209283a.m223700R0(this.f209300r);
            t9c.m189745c("ScreenStream", "----!!!!" + this.f209302t + Constants.SEPARATOR_COMMA + this.f209303u);
            int i = this.f209298p;
            int i2 = this.f209299q;
            MomoSurface momoSurface2 = this.f209283a;
            if (i > i2) {
                momoSurface2.m223719e1(i, i2, false, 90, this.f209301s, 1, this.f209302t, this.f209303u);
            } else {
                momoSurface2.m223719e1(i, i2, false, 0, this.f209301s, 1, this.f209302t, this.f209303u);
            }
        }
        NotifyCenter notifyCenter = this.f209297o;
        if (notifyCenter != null) {
            notifyCenter.notifyUpdateResolution();
            this.f209297o.notifyResumeRecording();
            t9c.m189745c("ScreenStream", "updateResolution, <NotifyResumeRecording> cost time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: n */
    public VideoQuality mo223534n() {
        t9c.m189745c("ScreenStream", "getVideoQuality: width" + this.f209295m.resX + ";heigh:" + this.f209295m.resY);
        return this.f209295m;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: q */
    public void mo223537q() {
        mo223578M();
    }
}
