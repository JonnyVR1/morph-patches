package tv.danmaku.ijk.media.source;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import l.n8c;
import org.spongycastle.crypto.tls.CipherSuite;
import tv.danmaku.ijk.media.streamer.MomoSurface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ImageSource extends SourceBase {

    /* JADX INFO: renamed from: a */
    private MomoSurface f11958a;

    /* JADX INFO: renamed from: b */
    public boolean f11959b = false;

    /* JADX INFO: renamed from: c */
    private boolean f11960c = false;

    /* JADX INFO: renamed from: d */
    protected VideoQuality f11961d;

    /* JADX INFO: renamed from: e */
    protected VideoQuality f11962e;

    /* JADX INFO: renamed from: f */
    private NotifyCenter f11963f;

    /* JADX INFO: renamed from: g */
    private ImageRunnable f11964g;

    /* JADX INFO: renamed from: h */
    private Thread f11965h;

    /* JADX INFO: renamed from: i */
    public Object f11966i;

    /* JADX INFO: renamed from: j */
    private Bitmap f11967j;

    /* JADX INFO: renamed from: k */
    private int f11968k;

    /* JADX INFO: renamed from: l */
    private long f11969l;

    /* JADX INFO: renamed from: m */
    Bitmap f11970m;

    public class ImageRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        private volatile boolean f11971a;

        /* JADX INFO: renamed from: b */
        private MomoSurface f11972b;

        /* JADX INFO: renamed from: c */
        private Bitmap f11973c;

        /* JADX INFO: renamed from: d */
        private boolean f11974d;

        /* JADX INFO: renamed from: e */
        private NotifyCenter f11975e;

        /* JADX INFO: renamed from: f */
        private Object f11976f;

        /* JADX INFO: renamed from: g */
        private int f11977g;

        /* JADX INFO: renamed from: h */
        private int f11978h;

        /* JADX INFO: renamed from: i */
        private int f11979i;

        /* JADX INFO: renamed from: j */
        private int f11980j;

        /* JADX INFO: renamed from: k */
        private int f11981k;

        /* JADX INFO: renamed from: l */
        private Bitmap[] f11982l;

        /* JADX INFO: renamed from: m */
        private int f11983m;

        /* JADX INFO: renamed from: n */
        private int f11984n;

        private ImageRunnable() {
            this.f11971a = false;
            this.f11972b = null;
            this.f11973c = null;
            this.f11974d = true;
            this.f11975e = null;
            this.f11976f = new Object();
            this.f11977g = -1;
            this.f11978h = -1;
            this.f11979i = -1;
            this.f11980j = -1;
            this.f11981k = 0;
            this.f11982l = new Bitmap[10];
            this.f11983m = 0;
            this.f11984n = 50;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x005e  */
        /* JADX INFO: renamed from: b */
        private void m10792b(Bitmap bitmap, int i) {
            int iM10786a0;
            int iM10784Y;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            n8c.c("ImageStream", "--------imageRunning: begin, input:[" + width + "," + height + "], " + bitmap + "<--" + this.f11973c);
            boolean z = true;
            if (this.f11981k == 1) {
                iM10786a0 = this.f11979i;
                iM10784Y = this.f11980j;
            } else {
                iM10786a0 = 1280;
                if (width >= height) {
                    if (width > 1280) {
                        iM10784Y = ImageSource.this.m10784Y(width, height, 1280);
                    } else {
                        iM10786a0 = width;
                        iM10784Y = height;
                    }
                } else if (height > 1280) {
                    iM10784Y = 1280;
                    iM10786a0 = ImageSource.this.m10786a0(width, height, 1280);
                } else {
                    iM10786a0 = width;
                    iM10784Y = height;
                }
            }
            int iM10785Z = ImageSource.this.m10785Z(iM10786a0);
            int iM10783X = ImageSource.this.m10783X(iM10784Y);
            n8c.c("ImageStream", "-----imageRunning: normal[" + iM10785Z + ", " + iM10783X + "]<----old[" + this.f11979i + "," + this.f11980j + "]");
            if (iM10785Z == this.f11979i && iM10783X == this.f11980j) {
                z = false;
            }
            this.f11979i = iM10785Z;
            this.f11980j = iM10783X;
            VideoQuality videoQuality = ImageSource.this.f11962e;
            videoQuality.resX = iM10785Z;
            videoQuality.resY = iM10783X;
            if (this.f11978h != height || this.f11977g != width || z) {
                this.f11978h = height;
                this.f11977g = width;
                n8c.c("ImageStream", "-----imageRunning: updateCamera, [" + this.f11977g + "," + this.f11978h + "]--->[" + this.f11979i + "," + this.f11980j + "]");
                this.f11972b.m10935Y0(ImageSource.this.f11962e);
                this.f11972b.m10944e1(this.f11977g, this.f11978h, false, 0, ImageSource.this.f11968k, 1, this.f11979i, this.f11980j);
                this.f11975e.notifyUpdateResolution();
                if (z) {
                    n8c.c("ImageStream", "-----imageRunning: notifyResumeRecording, " + ImageSource.this.f11962e.resX + "," + ImageSource.this.f11962e.resY);
                    this.f11975e.notifyResumeRecording();
                }
            }
            n8c.c("ImageStream", "-----imageRunning: end");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m10793d(int i) {
            this.f11984n = i;
        }

        /* JADX INFO: renamed from: c */
        public void m10794c() {
            this.f11971a = true;
        }

        /* JADX INFO: renamed from: e */
        public void m10795e(MomoSurface momoSurface) {
            this.f11972b = momoSurface;
            this.f11973c = null;
            for (int i = 0; i < 10; i++) {
                this.f11982l[i] = null;
            }
            this.f11983m = 0;
            this.f11977g = -1;
            this.f11978h = -1;
            this.f11979i = -1;
            this.f11980j = -1;
        }

        /* JADX INFO: renamed from: f */
        public void m10796f(NotifyCenter notifyCenter) {
            this.f11975e = notifyCenter;
        }

        /* JADX INFO: renamed from: g */
        public void m10797g(int i, int i2) {
            this.f11979i = i;
            this.f11980j = i2;
            this.f11981k = 1;
        }

        /* JADX INFO: renamed from: h */
        public void m10798h(Bitmap bitmap, int i, boolean z) {
            synchronized (this.f11976f) {
                try {
                    n8c.c("ImageStream", "----running update: begin " + this.f11983m + "," + bitmap);
                    if (z) {
                        this.f11982l[0] = bitmap;
                        this.f11983m = 1;
                    } else {
                        int i2 = this.f11983m;
                        if (i2 < 10) {
                            this.f11982l[i2] = bitmap;
                            this.f11983m = i2 + 1;
                        }
                    }
                    n8c.c("ImageStream", "----running update: end  " + this.f11983m);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f11971a) {
                try {
                    Thread.sleep(this.f11984n);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (this.f11976f) {
                    try {
                        int i = this.f11983m;
                        if (i > 0) {
                            int i2 = i - 1;
                            Bitmap bitmap = this.f11982l[i2];
                            this.f11973c = bitmap;
                            if (bitmap != null) {
                                n8c.c("ImageStream", "----running run " + this.f11973c);
                                if (!this.f11973c.isRecycled()) {
                                    m10792b(this.f11973c, 0);
                                }
                                MomoSurface momoSurface = this.f11972b;
                                if (momoSurface != null) {
                                    momoSurface.m10946f1(this.f11977g, this.f11978h, this.f11973c, true);
                                }
                            }
                            for (int i3 = 0; i3 < i2; i3++) {
                                Bitmap bitmap2 = this.f11982l[i3];
                                if (bitmap2 != null && !bitmap2.isRecycled()) {
                                    this.f11982l[i3].recycle();
                                    this.f11982l[i3] = null;
                                    this.f11983m--;
                                }
                            }
                            n8c.c("ImageStream", "----running run: end " + this.f11983m);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            n8c.a("ImageStream", "----image frame runnable:" + this.f11971a);
            n8c.c("ImageStream", "----image runnable thread exit success");
        }
    }

    public ImageSource(MomoSurface momoSurface, NotifyCenter notifyCenter) {
        VideoQuality videoQualityClone = VideoQuality.DEFAULT_VIDEO_QUALITY.clone();
        this.f11961d = videoQualityClone;
        this.f11962e = videoQualityClone.clone();
        this.f11966i = new Object();
        this.f11967j = null;
        this.f11968k = 1;
        this.f11969l = 0L;
        this.f11970m = null;
        this.f11958a = momoSurface;
        this.f11963f = notifyCenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public int m10783X(int i) {
        if (i <= 0) {
            return 640;
        }
        int i2 = (i / 2) * 2;
        if (i2 < 32) {
            return 32;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public int m10784Y(int i, int i2, int i3) {
        return (i3 * i2) / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public int m10785Z(int i) {
        if (i <= 0) {
            return 352;
        }
        int i2 = (i / 16) * 16;
        return i2 < 176 ? CipherSuite.TLS_PSK_WITH_NULL_SHA256 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public int m10786a0(int i, int i2, int i3) {
        return (i3 * i) / i2;
    }

    /* JADX INFO: renamed from: b0 */
    private void m10787b0() {
        if (this.f11965h != null) {
            this.f11964g.m10794c();
        }
        Bitmap bitmap = this.f11967j;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f11967j.recycle();
            this.f11967j = null;
        }
        synchronized (this.f11966i) {
            Thread thread = this.f11965h;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f11965h = null;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: F */
    public void mo10738F(int i) {
        if (i <= 0) {
            i = 15;
        }
        if (i > 30) {
            i = 30;
        }
        ImageRunnable imageRunnable = this.f11964g;
        if (imageRunnable != null) {
            imageRunnable.m10793d(1000 / i);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: J */
    public void mo10788J(Activity activity, Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (bitmap == null || bitmap.isRecycled() || this.f11958a == null || this.f11963f == null) {
            n8c.c("ImageStream", "----startCaptureImage: mFakeSurface=" + this.f11958a + "; mNotify=" + this.f11963f + ";bitmap=" + bitmap);
            return;
        }
        this.f11969l = System.currentTimeMillis();
        n8c.c("ImageStream", "----startCaptureImage: begin...");
        this.f11964g = new ImageRunnable();
        this.f11965h = new Thread(this.f11964g, "live-media-ImageSource");
        this.f11964g.m10795e(this.f11958a);
        this.f11964g.m10796f(this.f11963f);
        this.f11970m = null;
        if (!bitmap.isRecycled()) {
            if (bitmap.getWidth() % 2 != 0) {
                this.f11970m = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight(), (Matrix) null, false);
                bitmap.recycle();
            } else {
                this.f11970m = bitmap;
            }
        }
        if (i4 == 1) {
            if (i2 < 0 || i3 < 0) {
                n8c.c("ImageStream", "----startCaptureImage: input params error:" + i2 + "," + i3);
            } else {
                this.f11964g.m10797g(i2, i3);
            }
        }
        Bitmap bitmap2 = this.f11970m;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f11964g.m10798h(this.f11970m, i, true);
        }
        this.f11965h.start();
        n8c.c("ImageStream", "----startCaptureImage: end... time:" + (System.currentTimeMillis() - this.f11969l) + "ms");
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: L */
    public void mo10789L() {
        if (this.f11965h != null) {
            this.f11964g.m10794c();
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: Q */
    public void mo10790Q(Bitmap bitmap, int i, int i2, int i3) {
        if (bitmap == null || bitmap.isRecycled() || this.f11964g == null || this.f11963f == null || this.f11958a == null) {
            n8c.c("ImageStream", "----updateCaptureImage: mFakeSurface=" + this.f11958a + "; mNotify=" + this.f11963f + ";bitmap=" + bitmap);
            return;
        }
        n8c.c("ImageStream", "----updateCaptureImage: begin..." + bitmap + "; time:" + (System.currentTimeMillis() - this.f11969l) + "ms");
        if (!bitmap.isRecycled()) {
            this.f11970m = null;
            if (bitmap.getWidth() % 2 != 0) {
                this.f11970m = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight(), (Matrix) null, false);
                bitmap.recycle();
            } else {
                this.f11970m = bitmap;
            }
        }
        Bitmap bitmap2 = this.f11970m;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        n8c.c("ImageStream", "----updateCaptureImage: end..." + this.f11970m + "; time:" + (System.currentTimeMillis() - this.f11969l) + "ms");
        this.f11964g.m10798h(this.f11970m, i, false);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: n */
    public VideoQuality mo10759n() {
        n8c.c("ImageStream", "getVideoQuality: width" + this.f11962e.resX + ";heigh:" + this.f11962e.resY);
        return this.f11962e;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: q */
    public void mo10762q() {
        n8c.c("ImageStream", "----release:");
        m10787b0();
        this.f11959b = false;
    }
}
