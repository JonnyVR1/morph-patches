package tv.danmaku.ijk.media.source;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import p149l.n8c;
import tv.danmaku.ijk.media.streamer.MomoSurface;

/* JADX INFO: loaded from: classes3.dex */
public class ImageSource extends SourceBase {

    /* JADX INFO: renamed from: a */
    private MomoSurface f208333a;

    /* JADX INFO: renamed from: b */
    public boolean f208334b = false;

    /* JADX INFO: renamed from: c */
    private boolean f208335c = false;

    /* JADX INFO: renamed from: d */
    protected VideoQuality f208336d;

    /* JADX INFO: renamed from: e */
    protected VideoQuality f208337e;

    /* JADX INFO: renamed from: f */
    private NotifyCenter f208338f;

    /* JADX INFO: renamed from: g */
    private ImageRunnable f208339g;

    /* JADX INFO: renamed from: h */
    private Thread f208340h;

    /* JADX INFO: renamed from: i */
    public Object f208341i;

    /* JADX INFO: renamed from: j */
    private Bitmap f208342j;

    /* JADX INFO: renamed from: k */
    private int f208343k;

    /* JADX INFO: renamed from: l */
    private long f208344l;

    /* JADX INFO: renamed from: m */
    Bitmap f208345m;

    public class ImageRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        private volatile boolean f208346a;

        /* JADX INFO: renamed from: b */
        private MomoSurface f208347b;

        /* JADX INFO: renamed from: c */
        private Bitmap f208348c;

        /* JADX INFO: renamed from: d */
        private boolean f208349d;

        /* JADX INFO: renamed from: e */
        private NotifyCenter f208350e;

        /* JADX INFO: renamed from: f */
        private Object f208351f;

        /* JADX INFO: renamed from: g */
        private int f208352g;

        /* JADX INFO: renamed from: h */
        private int f208353h;

        /* JADX INFO: renamed from: i */
        private int f208354i;

        /* JADX INFO: renamed from: j */
        private int f208355j;

        /* JADX INFO: renamed from: k */
        private int f208356k;

        /* JADX INFO: renamed from: l */
        private Bitmap[] f208357l;

        /* JADX INFO: renamed from: m */
        private int f208358m;

        /* JADX INFO: renamed from: n */
        private int f208359n;

        private ImageRunnable() {
            this.f208346a = false;
            this.f208347b = null;
            this.f208348c = null;
            this.f208349d = true;
            this.f208350e = null;
            this.f208351f = new Object();
            this.f208352g = -1;
            this.f208353h = -1;
            this.f208354i = -1;
            this.f208355j = -1;
            this.f208356k = 0;
            this.f208357l = new Bitmap[10];
            this.f208358m = 0;
            this.f208359n = 50;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x005e  */
        /* JADX INFO: renamed from: b */
        private void m222321b(Bitmap bitmap, int i) {
            int iM222315a0;
            int iM222313Y;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            n8c.m158485c("ImageStream", "--------imageRunning: begin, input:[" + width + Constants.SEPARATOR_COMMA + height + "], " + bitmap + "<--" + this.f208348c);
            boolean z = true;
            if (this.f208356k == 1) {
                iM222315a0 = this.f208354i;
                iM222313Y = this.f208355j;
            } else {
                iM222315a0 = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                if (width >= height) {
                    if (width > 1280) {
                        iM222313Y = ImageSource.this.m222313Y(width, height, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
                    } else {
                        iM222315a0 = width;
                        iM222313Y = height;
                    }
                } else if (height > 1280) {
                    iM222313Y = 1280;
                    iM222315a0 = ImageSource.this.m222315a0(width, height, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
                } else {
                    iM222315a0 = width;
                    iM222313Y = height;
                }
            }
            int iM222314Z = ImageSource.this.m222314Z(iM222315a0);
            int iM222312X = ImageSource.this.m222312X(iM222313Y);
            n8c.m158485c("ImageStream", "-----imageRunning: normal[" + iM222314Z + ", " + iM222312X + "]<----old[" + this.f208354i + Constants.SEPARATOR_COMMA + this.f208355j + Constants.AES_SUFFIX);
            if (iM222314Z == this.f208354i && iM222312X == this.f208355j) {
                z = false;
            }
            this.f208354i = iM222314Z;
            this.f208355j = iM222312X;
            VideoQuality videoQuality = ImageSource.this.f208337e;
            videoQuality.resX = iM222314Z;
            videoQuality.resY = iM222312X;
            if (this.f208353h != height || this.f208352g != width || z) {
                this.f208353h = height;
                this.f208352g = width;
                n8c.m158485c("ImageStream", "-----imageRunning: updateCamera, [" + this.f208352g + Constants.SEPARATOR_COMMA + this.f208353h + "]--->[" + this.f208354i + Constants.SEPARATOR_COMMA + this.f208355j + Constants.AES_SUFFIX);
                this.f208347b.m222464Y0(ImageSource.this.f208337e);
                this.f208347b.m222473e1(this.f208352g, this.f208353h, false, 0, ImageSource.this.f208343k, 1, this.f208354i, this.f208355j);
                this.f208350e.notifyUpdateResolution();
                if (z) {
                    n8c.m158485c("ImageStream", "-----imageRunning: notifyResumeRecording, " + ImageSource.this.f208337e.resX + Constants.SEPARATOR_COMMA + ImageSource.this.f208337e.resY);
                    this.f208350e.notifyResumeRecording();
                }
            }
            n8c.m158485c("ImageStream", "-----imageRunning: end");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m222322d(int i) {
            this.f208359n = i;
        }

        /* JADX INFO: renamed from: c */
        public void m222323c() {
            this.f208346a = true;
        }

        /* JADX INFO: renamed from: e */
        public void m222324e(MomoSurface momoSurface) {
            this.f208347b = momoSurface;
            this.f208348c = null;
            for (int i = 0; i < 10; i++) {
                this.f208357l[i] = null;
            }
            this.f208358m = 0;
            this.f208352g = -1;
            this.f208353h = -1;
            this.f208354i = -1;
            this.f208355j = -1;
        }

        /* JADX INFO: renamed from: f */
        public void m222325f(NotifyCenter notifyCenter) {
            this.f208350e = notifyCenter;
        }

        /* JADX INFO: renamed from: g */
        public void m222326g(int i, int i2) {
            this.f208354i = i;
            this.f208355j = i2;
            this.f208356k = 1;
        }

        /* JADX INFO: renamed from: h */
        public void m222327h(Bitmap bitmap, int i, boolean z) {
            synchronized (this.f208351f) {
                try {
                    n8c.m158485c("ImageStream", "----running update: begin " + this.f208358m + Constants.SEPARATOR_COMMA + bitmap);
                    if (z) {
                        this.f208357l[0] = bitmap;
                        this.f208358m = 1;
                    } else {
                        int i2 = this.f208358m;
                        if (i2 < 10) {
                            this.f208357l[i2] = bitmap;
                            this.f208358m = i2 + 1;
                        }
                    }
                    n8c.m158485c("ImageStream", "----running update: end  " + this.f208358m);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f208346a) {
                try {
                    Thread.sleep(this.f208359n);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (this.f208351f) {
                    try {
                        int i = this.f208358m;
                        if (i > 0) {
                            int i2 = i - 1;
                            Bitmap bitmap = this.f208357l[i2];
                            this.f208348c = bitmap;
                            if (bitmap != null) {
                                n8c.m158485c("ImageStream", "----running run " + this.f208348c);
                                if (!this.f208348c.isRecycled()) {
                                    m222321b(this.f208348c, 0);
                                }
                                MomoSurface momoSurface = this.f208347b;
                                if (momoSurface != null) {
                                    momoSurface.m222475f1(this.f208352g, this.f208353h, this.f208348c, true);
                                }
                            }
                            for (int i3 = 0; i3 < i2; i3++) {
                                Bitmap bitmap2 = this.f208357l[i3];
                                if (bitmap2 != null && !bitmap2.isRecycled()) {
                                    this.f208357l[i3].recycle();
                                    this.f208357l[i3] = null;
                                    this.f208358m--;
                                }
                            }
                            n8c.m158485c("ImageStream", "----running run: end " + this.f208358m);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            n8c.m158483a("ImageStream", "----image frame runnable:" + this.f208346a);
            n8c.m158485c("ImageStream", "----image runnable thread exit success");
        }
    }

    public ImageSource(MomoSurface momoSurface, NotifyCenter notifyCenter) {
        VideoQuality videoQualityM223811clone = VideoQuality.DEFAULT_VIDEO_QUALITY.m223811clone();
        this.f208336d = videoQualityM223811clone;
        this.f208337e = videoQualityM223811clone.m223811clone();
        this.f208341i = new Object();
        this.f208342j = null;
        this.f208343k = 1;
        this.f208344l = 0L;
        this.f208345m = null;
        this.f208333a = momoSurface;
        this.f208338f = notifyCenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public int m222312X(int i) {
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
    public int m222313Y(int i, int i2, int i3) {
        return (i3 * i2) / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public int m222314Z(int i) {
        if (i <= 0) {
            return 352;
        }
        int i2 = (i / 16) * 16;
        if (i2 < 176) {
            return 176;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public int m222315a0(int i, int i2, int i3) {
        return (i3 * i) / i2;
    }

    /* JADX INFO: renamed from: b0 */
    private void m222316b0() {
        if (this.f208340h != null) {
            this.f208339g.m222323c();
        }
        Bitmap bitmap = this.f208342j;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f208342j.recycle();
            this.f208342j = null;
        }
        synchronized (this.f208341i) {
            Thread thread = this.f208340h;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f208340h = null;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: F */
    public void mo222267F(int i) {
        if (i <= 0) {
            i = 15;
        }
        if (i > 30) {
            i = 30;
        }
        ImageRunnable imageRunnable = this.f208339g;
        if (imageRunnable != null) {
            imageRunnable.m222322d(1000 / i);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: J */
    public void mo222317J(Activity activity, Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (bitmap == null || bitmap.isRecycled() || this.f208333a == null || this.f208338f == null) {
            n8c.m158485c("ImageStream", "----startCaptureImage: mFakeSurface=" + this.f208333a + "; mNotify=" + this.f208338f + ";bitmap=" + bitmap);
            return;
        }
        this.f208344l = System.currentTimeMillis();
        n8c.m158485c("ImageStream", "----startCaptureImage: begin...");
        this.f208339g = new ImageRunnable();
        this.f208340h = new Thread(this.f208339g, "live-media-ImageSource");
        this.f208339g.m222324e(this.f208333a);
        this.f208339g.m222325f(this.f208338f);
        this.f208345m = null;
        if (!bitmap.isRecycled()) {
            if (bitmap.getWidth() % 2 != 0) {
                this.f208345m = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight(), (Matrix) null, false);
                bitmap.recycle();
            } else {
                this.f208345m = bitmap;
            }
        }
        if (i4 == 1) {
            if (i2 < 0 || i3 < 0) {
                n8c.m158485c("ImageStream", "----startCaptureImage: input params error:" + i2 + Constants.SEPARATOR_COMMA + i3);
            } else {
                this.f208339g.m222326g(i2, i3);
            }
        }
        Bitmap bitmap2 = this.f208345m;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f208339g.m222327h(this.f208345m, i, true);
        }
        this.f208340h.start();
        n8c.m158485c("ImageStream", "----startCaptureImage: end... time:" + (System.currentTimeMillis() - this.f208344l) + "ms");
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: L */
    public void mo222318L() {
        if (this.f208340h != null) {
            this.f208339g.m222323c();
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: Q */
    public void mo222319Q(Bitmap bitmap, int i, int i2, int i3) {
        if (bitmap == null || bitmap.isRecycled() || this.f208339g == null || this.f208338f == null || this.f208333a == null) {
            n8c.m158485c("ImageStream", "----updateCaptureImage: mFakeSurface=" + this.f208333a + "; mNotify=" + this.f208338f + ";bitmap=" + bitmap);
            return;
        }
        n8c.m158485c("ImageStream", "----updateCaptureImage: begin..." + bitmap + "; time:" + (System.currentTimeMillis() - this.f208344l) + "ms");
        if (!bitmap.isRecycled()) {
            this.f208345m = null;
            if (bitmap.getWidth() % 2 != 0) {
                this.f208345m = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight(), (Matrix) null, false);
                bitmap.recycle();
            } else {
                this.f208345m = bitmap;
            }
        }
        Bitmap bitmap2 = this.f208345m;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        n8c.m158485c("ImageStream", "----updateCaptureImage: end..." + this.f208345m + "; time:" + (System.currentTimeMillis() - this.f208344l) + "ms");
        this.f208339g.m222327h(this.f208345m, i, false);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: n */
    public VideoQuality mo222288n() {
        n8c.m158485c("ImageStream", "getVideoQuality: width" + this.f208337e.resX + ";heigh:" + this.f208337e.resY);
        return this.f208337e;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: q */
    public void mo222291q() {
        n8c.m158485c("ImageStream", "----release:");
        m222316b0();
        this.f208334b = false;
    }
}
