package tv.danmaku.ijk.media.source;

import android.app.Activity;
import android.graphics.PointF;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import p149l.n8c;
import tv.danmaku.ijk.media.streamer.MomoSurface;
import tv.danmaku.ijk.media.util.helpSurface;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenSource extends SourceBase {

    /* JADX INFO: renamed from: a */
    private MomoSurface f208361a;

    /* JADX INFO: renamed from: b */
    private VirtualDisplay f208362b;

    /* JADX INFO: renamed from: c */
    private helpSurface f208363c;

    /* JADX INFO: renamed from: e */
    private ScreenRunnable f208365e;

    /* JADX INFO: renamed from: f */
    private Thread f208366f;

    /* JADX INFO: renamed from: l */
    protected VideoQuality f208372l;

    /* JADX INFO: renamed from: m */
    protected VideoQuality f208373m;

    /* JADX INFO: renamed from: n */
    private float f208374n;

    /* JADX INFO: renamed from: o */
    private NotifyCenter f208375o;

    /* JADX INFO: renamed from: p */
    private int f208376p;

    /* JADX INFO: renamed from: q */
    private int f208377q;

    /* JADX INFO: renamed from: r */
    private int f208378r;

    /* JADX INFO: renamed from: s */
    private int f208379s;

    /* JADX INFO: renamed from: t */
    private int f208380t;

    /* JADX INFO: renamed from: u */
    private int f208381u;

    /* JADX INFO: renamed from: d */
    public boolean f208364d = false;

    /* JADX INFO: renamed from: g */
    public boolean f208367g = false;

    /* JADX INFO: renamed from: h */
    public Object f208368h = new Object();

    /* JADX INFO: renamed from: i */
    public int f208369i = 480;

    /* JADX INFO: renamed from: j */
    public int f208370j = 640;

    /* JADX INFO: renamed from: k */
    private PointF f208371k = new PointF(16.0f, 9.0f);

    public class ScreenRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        private volatile boolean f208382a;

        /* JADX INFO: renamed from: b */
        private MomoSurface f208383b;

        /* JADX INFO: renamed from: c */
        private helpSurface f208384c;

        /* JADX INFO: renamed from: d */
        private int f208385d;

        /* JADX INFO: renamed from: e */
        private int f208386e;

        private ScreenRunnable() {
            this.f208382a = false;
            this.f208383b = null;
            this.f208384c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m222334a() {
            this.f208382a = true;
        }

        /* JADX INFO: renamed from: b */
        public void m222335b(helpSurface helpsurface) {
            this.f208384c = helpsurface;
            if (helpsurface != null) {
                n8c.m158485c("ScreenStream", "----screen: textureID=" + this.f208384c.m222872e() + ",surfaceTexture=" + this.f208384c.m222871d());
            }
        }

        /* JADX INFO: renamed from: c */
        public void m222336c(MomoSurface momoSurface) {
            this.f208383b = momoSurface;
        }

        /* JADX INFO: renamed from: d */
        public void m222337d(int i, int i2) {
            n8c.m158483a("ScreenStream", "screen size: " + i + Constants.SEPARATOR_COMMA + i2);
            this.f208385d = i2;
            this.f208386e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            helpSurface helpsurface;
            while (!this.f208382a) {
                try {
                    Thread.sleep(20L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MomoSurface momoSurface = this.f208383b;
                if (momoSurface != null && (helpsurface = this.f208384c) != null) {
                    momoSurface.m222478h1(helpsurface.m222871d(), this.f208384c.m222872e(), this.f208386e, this.f208385d);
                }
            }
            n8c.m158483a("ScreenStream", "screen runnable:" + this.f208382a);
            n8c.m158485c("ScreenStream", "screen runnable thread exit success");
        }
    }

    public ScreenSource(MomoSurface momoSurface, NotifyCenter notifyCenter) {
        VideoQuality videoQualityM223811clone = VideoQuality.DEFAULT_VIDEO_QUALITY.m223811clone();
        this.f208372l = videoQualityM223811clone;
        this.f208373m = videoQualityM223811clone.m223811clone();
        this.f208374n = 1.0f;
        this.f208376p = 480;
        this.f208377q = 640;
        this.f208378r = -1;
        this.f208379s = 1;
        this.f208380t = 352;
        this.f208381u = 640;
        this.f208361a = momoSurface;
        this.f208375o = notifyCenter;
    }

    /* JADX INFO: renamed from: S */
    private int m222328S(int i) {
        int i2 = (i / 2) * 2;
        if (i2 < 176) {
            return 176;
        }
        return i2;
    }

    /* JADX INFO: renamed from: T */
    private int m222329T(int i) {
        int i2 = (i / 16) * 16;
        if (i2 < 176) {
            return 176;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0023 A[Catch: all -> 0x0017, TryCatch #0 {, blocks: (B:7:0x000c, B:11:0x0013, B:17:0x001d, B:16:0x001a, B:18:0x001f, B:20:0x0023, B:21:0x0028, B:23:0x002c, B:24:0x0031), top: B:28:0x000c, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x002c A[Catch: all -> 0x0017, TryCatch #0 {, blocks: (B:7:0x000c, B:11:0x0013, B:17:0x001d, B:16:0x001a, B:18:0x001f, B:20:0x0023, B:21:0x0028, B:23:0x002c, B:24:0x0031), top: B:28:0x000c, inners: #1 }] */
    /* JADX INFO: renamed from: U */
    private void m222330U() {
        helpSurface helpsurface;
        VirtualDisplay virtualDisplay;
        if (this.f208366f != null) {
            this.f208365e.m222334a();
        }
        synchronized (this.f208368h) {
            Thread thread = this.f208366f;
            if (thread != null) {
                try {
                    thread.join(50L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f208366f = null;
                helpsurface = this.f208363c;
                if (helpsurface != null) {
                    helpsurface.m222873g();
                    this.f208363c = null;
                }
                virtualDisplay = this.f208362b;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    this.f208362b = null;
                }
            } else {
                helpsurface = this.f208363c;
                if (helpsurface != null) {
                    helpsurface.m222873g();
                    this.f208363c = null;
                }
                virtualDisplay = this.f208362b;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    this.f208362b = null;
                }
            }
            throw th;
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: B */
    public void mo222262B(int i, int i2) {
        this.f208376p = i;
        this.f208377q = i2;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: K */
    public void mo222331K(Activity activity, int i, int i2, MediaProjection mediaProjection, int i3) {
        long j;
        C224971 c224971;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f208367g) {
            n8c.m158483a("ScreenStream", "screen capture: last release");
            m222330U();
        }
        synchronized (this.f208368h) {
            helpSurface helpsurface = new helpSurface(null, i, i2);
            this.f208363c = helpsurface;
            try {
                j = jCurrentTimeMillis;
                c224971 = null;
                try {
                    this.f208362b = mediaProjection.createVirtualDisplay("MainScreen", i, i2, 1, 19, helpsurface.m222870c(), null, null);
                    n8c.m158483a("ScreenStream", "width=" + i + ",height=" + i2 + ",angle=" + i3 + ",cost time: " + (System.currentTimeMillis() - j));
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e = e2;
                j = jCurrentTimeMillis;
                c224971 = null;
            }
            int i4 = this.f208379s;
            if (i4 != 1) {
                if (i4 != 2) {
                    this.f208380t = i;
                    this.f208381u = i2;
                    this.f208379s = 3;
                } else if (i > i2) {
                    this.f208380t = i;
                    this.f208381u = i2;
                } else {
                    this.f208380t = i2;
                    this.f208381u = i;
                }
            } else if (i > i2) {
                this.f208380t = i2;
                this.f208381u = i;
            } else {
                this.f208380t = i;
                this.f208381u = i2;
            }
            this.f208378r = i3;
            mo222262B(i, i2);
            m222333V();
            this.f208363c.m222874h(this.f208361a);
            this.f208365e = new ScreenRunnable();
            this.f208366f = new Thread(this.f208365e, "live-media-ScreenSource");
            this.f208365e.m222337d(i, i2);
            this.f208365e.m222335b(this.f208363c);
            this.f208365e.m222336c(this.f208361a);
            this.f208367g = true;
            this.f208366f.start();
            n8c.m158483a("ScreenStream", "switch to screen success, cost time: " + (System.currentTimeMillis() - j));
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: M */
    public void mo222332M() {
        m222330U();
        this.f208367g = false;
        n8c.m158483a("ScreenStream", "screen capture stop success");
    }

    /* JADX INFO: renamed from: V */
    public void m222333V() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f208380t = m222329T(this.f208380t);
        int iM222328S = m222328S(this.f208381u);
        this.f208381u = iM222328S;
        VideoQuality videoQuality = this.f208373m;
        videoQuality.resX = this.f208380t;
        videoQuality.resY = iM222328S;
        n8c.m158485c("ScreenStream", "input:[" + this.f208376p + Constants.SEPARATOR_COMMA + this.f208377q + "]; output:[" + this.f208380t + Constants.SEPARATOR_COMMA + this.f208381u + Constants.AES_SUFFIX);
        MomoSurface momoSurface = this.f208361a;
        if (momoSurface != null) {
            momoSurface.m222464Y0(this.f208373m);
            this.f208361a.m222454R0(this.f208378r);
            n8c.m158485c("ScreenStream", "----!!!!" + this.f208380t + Constants.SEPARATOR_COMMA + this.f208381u);
            int i = this.f208376p;
            int i2 = this.f208377q;
            MomoSurface momoSurface2 = this.f208361a;
            if (i > i2) {
                momoSurface2.m222473e1(i, i2, false, 90, this.f208379s, 1, this.f208380t, this.f208381u);
            } else {
                momoSurface2.m222473e1(i, i2, false, 0, this.f208379s, 1, this.f208380t, this.f208381u);
            }
        }
        NotifyCenter notifyCenter = this.f208375o;
        if (notifyCenter != null) {
            notifyCenter.notifyUpdateResolution();
            this.f208375o.notifyResumeRecording();
            n8c.m158485c("ScreenStream", "updateResolution, <NotifyResumeRecording> cost time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: n */
    public VideoQuality mo222288n() {
        n8c.m158485c("ScreenStream", "getVideoQuality: width" + this.f208373m.resX + ";heigh:" + this.f208373m.resY);
        return this.f208373m;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: q */
    public void mo222291q() {
        mo222332M();
    }
}
