package tv.danmaku.ijk.media.source;

import android.app.Activity;
import android.graphics.PointF;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import l.n8c;
import org.spongycastle.crypto.tls.CipherSuite;
import tv.danmaku.ijk.media.streamer.MomoSurface;
import tv.danmaku.ijk.media.util.helpSurface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ScreenSource extends SourceBase {

    /* JADX INFO: renamed from: a */
    private MomoSurface f11986a;

    /* JADX INFO: renamed from: b */
    private VirtualDisplay f11987b;

    /* JADX INFO: renamed from: c */
    private helpSurface f11988c;

    /* JADX INFO: renamed from: e */
    private ScreenRunnable f11990e;

    /* JADX INFO: renamed from: f */
    private Thread f11991f;

    /* JADX INFO: renamed from: l */
    protected VideoQuality f11997l;

    /* JADX INFO: renamed from: m */
    protected VideoQuality f11998m;

    /* JADX INFO: renamed from: n */
    private float f11999n;

    /* JADX INFO: renamed from: o */
    private NotifyCenter f12000o;

    /* JADX INFO: renamed from: p */
    private int f12001p;

    /* JADX INFO: renamed from: q */
    private int f12002q;

    /* JADX INFO: renamed from: r */
    private int f12003r;

    /* JADX INFO: renamed from: s */
    private int f12004s;

    /* JADX INFO: renamed from: t */
    private int f12005t;

    /* JADX INFO: renamed from: u */
    private int f12006u;

    /* JADX INFO: renamed from: d */
    public boolean f11989d = false;

    /* JADX INFO: renamed from: g */
    public boolean f11992g = false;

    /* JADX INFO: renamed from: h */
    public Object f11993h = new Object();

    /* JADX INFO: renamed from: i */
    public int f11994i = 480;

    /* JADX INFO: renamed from: j */
    public int f11995j = 640;

    /* JADX INFO: renamed from: k */
    private PointF f11996k = new PointF(16.0f, 9.0f);

    public class ScreenRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        private volatile boolean f12007a;

        /* JADX INFO: renamed from: b */
        private MomoSurface f12008b;

        /* JADX INFO: renamed from: c */
        private helpSurface f12009c;

        /* JADX INFO: renamed from: d */
        private int f12010d;

        /* JADX INFO: renamed from: e */
        private int f12011e;

        private ScreenRunnable() {
            this.f12007a = false;
            this.f12008b = null;
            this.f12009c = null;
        }

        /* JADX INFO: renamed from: a */
        public void m10805a() {
            this.f12007a = true;
        }

        /* JADX INFO: renamed from: b */
        public void m10806b(helpSurface helpsurface) {
            this.f12009c = helpsurface;
            if (helpsurface != null) {
                n8c.c("ScreenStream", "----screen: textureID=" + this.f12009c.m11343e() + ",surfaceTexture=" + this.f12009c.m11342d());
            }
        }

        /* JADX INFO: renamed from: c */
        public void m10807c(MomoSurface momoSurface) {
            this.f12008b = momoSurface;
        }

        /* JADX INFO: renamed from: d */
        public void m10808d(int i, int i2) {
            n8c.a("ScreenStream", "screen size: " + i + "," + i2);
            this.f12010d = i2;
            this.f12011e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            helpSurface helpsurface;
            while (!this.f12007a) {
                try {
                    Thread.sleep(20L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MomoSurface momoSurface = this.f12008b;
                if (momoSurface != null && (helpsurface = this.f12009c) != null) {
                    momoSurface.m10949h1(helpsurface.m11342d(), this.f12009c.m11343e(), this.f12011e, this.f12010d);
                }
            }
            n8c.a("ScreenStream", "screen runnable:" + this.f12007a);
            n8c.c("ScreenStream", "screen runnable thread exit success");
        }
    }

    public ScreenSource(MomoSurface momoSurface, NotifyCenter notifyCenter) {
        VideoQuality videoQualityClone = VideoQuality.DEFAULT_VIDEO_QUALITY.clone();
        this.f11997l = videoQualityClone;
        this.f11998m = videoQualityClone.clone();
        this.f11999n = 1.0f;
        this.f12001p = 480;
        this.f12002q = 640;
        this.f12003r = -1;
        this.f12004s = 1;
        this.f12005t = 352;
        this.f12006u = 640;
        this.f11986a = momoSurface;
        this.f12000o = notifyCenter;
    }

    /* JADX INFO: renamed from: S */
    private int m10799S(int i) {
        int i2 = (i / 2) * 2;
        return i2 < 176 ? CipherSuite.TLS_PSK_WITH_NULL_SHA256 : i2;
    }

    /* JADX INFO: renamed from: T */
    private int m10800T(int i) {
        int i2 = (i / 16) * 16;
        return i2 < 176 ? CipherSuite.TLS_PSK_WITH_NULL_SHA256 : i2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0023 A[Catch: all -> 0x0017, TryCatch #0 {, blocks: (B:7:0x000c, B:11:0x0013, B:17:0x001d, B:16:0x001a, B:18:0x001f, B:20:0x0023, B:21:0x0028, B:23:0x002c, B:24:0x0031), top: B:28:0x000c, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x002c A[Catch: all -> 0x0017, TryCatch #0 {, blocks: (B:7:0x000c, B:11:0x0013, B:17:0x001d, B:16:0x001a, B:18:0x001f, B:20:0x0023, B:21:0x0028, B:23:0x002c, B:24:0x0031), top: B:28:0x000c, inners: #1 }] */
    /* JADX INFO: renamed from: U */
    private void m10801U() {
        helpSurface helpsurface;
        VirtualDisplay virtualDisplay;
        if (this.f11991f != null) {
            this.f11990e.m10805a();
        }
        synchronized (this.f11993h) {
            Thread thread = this.f11991f;
            if (thread != null) {
                try {
                    thread.join(50L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f11991f = null;
                helpsurface = this.f11988c;
                if (helpsurface != null) {
                    helpsurface.m11344g();
                    this.f11988c = null;
                }
                virtualDisplay = this.f11987b;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    this.f11987b = null;
                }
            } else {
                helpsurface = this.f11988c;
                if (helpsurface != null) {
                    helpsurface.m11344g();
                    this.f11988c = null;
                }
                virtualDisplay = this.f11987b;
                if (virtualDisplay != null) {
                    virtualDisplay.release();
                    this.f11987b = null;
                }
            }
            throw th;
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: B */
    public void mo10733B(int i, int i2) {
        this.f12001p = i;
        this.f12002q = i2;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: K */
    public void mo10802K(Activity activity, int i, int i2, MediaProjection mediaProjection, int i3) {
        long j;
        C12901 c12901;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f11992g) {
            n8c.a("ScreenStream", "screen capture: last release");
            m10801U();
        }
        synchronized (this.f11993h) {
            helpSurface helpsurface = new helpSurface(null, i, i2);
            this.f11988c = helpsurface;
            try {
                j = jCurrentTimeMillis;
                c12901 = null;
                try {
                    this.f11987b = mediaProjection.createVirtualDisplay("MainScreen", i, i2, 1, 19, helpsurface.m11341c(), null, null);
                    n8c.a("ScreenStream", "width=" + i + ",height=" + i2 + ",angle=" + i3 + ",cost time: " + (System.currentTimeMillis() - j));
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e = e2;
                j = jCurrentTimeMillis;
                c12901 = null;
            }
            int i4 = this.f12004s;
            if (i4 != 1) {
                if (i4 != 2) {
                    this.f12005t = i;
                    this.f12006u = i2;
                    this.f12004s = 3;
                } else if (i > i2) {
                    this.f12005t = i;
                    this.f12006u = i2;
                } else {
                    this.f12005t = i2;
                    this.f12006u = i;
                }
            } else if (i > i2) {
                this.f12005t = i2;
                this.f12006u = i;
            } else {
                this.f12005t = i;
                this.f12006u = i2;
            }
            this.f12003r = i3;
            mo10733B(i, i2);
            m10804V();
            this.f11988c.m11345h(this.f11986a);
            this.f11990e = new ScreenRunnable();
            this.f11991f = new Thread(this.f11990e, "live-media-ScreenSource");
            this.f11990e.m10808d(i, i2);
            this.f11990e.m10806b(this.f11988c);
            this.f11990e.m10807c(this.f11986a);
            this.f11992g = true;
            this.f11991f.start();
            n8c.a("ScreenStream", "switch to screen success, cost time: " + (System.currentTimeMillis() - j));
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: M */
    public void mo10803M() {
        m10801U();
        this.f11992g = false;
        n8c.a("ScreenStream", "screen capture stop success");
    }

    /* JADX INFO: renamed from: V */
    public void m10804V() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f12005t = m10800T(this.f12005t);
        int iM10799S = m10799S(this.f12006u);
        this.f12006u = iM10799S;
        VideoQuality videoQuality = this.f11998m;
        videoQuality.resX = this.f12005t;
        videoQuality.resY = iM10799S;
        n8c.c("ScreenStream", "input:[" + this.f12001p + "," + this.f12002q + "]; output:[" + this.f12005t + "," + this.f12006u + "]");
        MomoSurface momoSurface = this.f11986a;
        if (momoSurface != null) {
            momoSurface.m10935Y0(this.f11998m);
            this.f11986a.m10925R0(this.f12003r);
            n8c.c("ScreenStream", "----!!!!" + this.f12005t + "," + this.f12006u);
            int i = this.f12001p;
            int i2 = this.f12002q;
            MomoSurface momoSurface2 = this.f11986a;
            if (i > i2) {
                momoSurface2.m10944e1(i, i2, false, 90, this.f12004s, 1, this.f12005t, this.f12006u);
            } else {
                momoSurface2.m10944e1(i, i2, false, 0, this.f12004s, 1, this.f12005t, this.f12006u);
            }
        }
        NotifyCenter notifyCenter = this.f12000o;
        if (notifyCenter != null) {
            notifyCenter.notifyUpdateResolution();
            this.f12000o.notifyResumeRecording();
            n8c.c("ScreenStream", "updateResolution, <NotifyResumeRecording> cost time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: n */
    public VideoQuality mo10759n() {
        n8c.c("ScreenStream", "getVideoQuality: width" + this.f11998m.resX + ";heigh:" + this.f11998m.resY);
        return this.f11998m;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: q */
    public void mo10762q() {
        mo10803M();
    }
}
