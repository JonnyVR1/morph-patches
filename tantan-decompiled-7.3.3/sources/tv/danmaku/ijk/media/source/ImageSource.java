package tv.danmaku.ijk.media.source;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import p153l.t9c;
import tv.danmaku.ijk.media.streamer.MomoSurface;

/* JADX INFO: loaded from: classes3.dex */
public class ImageSource extends SourceBase {

    /* JADX INFO: renamed from: a */
    private MomoSurface f209255a;

    /* JADX INFO: renamed from: b */
    public boolean f209256b = false;

    /* JADX INFO: renamed from: c */
    private boolean f209257c = false;

    /* JADX INFO: renamed from: d */
    protected VideoQuality f209258d;

    /* JADX INFO: renamed from: e */
    protected VideoQuality f209259e;

    /* JADX INFO: renamed from: f */
    private NotifyCenter f209260f;

    /* JADX INFO: renamed from: g */
    private ImageRunnable f209261g;

    /* JADX INFO: renamed from: h */
    private Thread f209262h;

    /* JADX INFO: renamed from: i */
    public Object f209263i;

    /* JADX INFO: renamed from: j */
    private Bitmap f209264j;

    /* JADX INFO: renamed from: k */
    private int f209265k;

    /* JADX INFO: renamed from: l */
    private long f209266l;

    /* JADX INFO: renamed from: m */
    Bitmap f209267m;

    public class ImageRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        private volatile boolean f209268a;

        /* JADX INFO: renamed from: b */
        private MomoSurface f209269b;

        /* JADX INFO: renamed from: c */
        private Bitmap f209270c;

        /* JADX INFO: renamed from: d */
        private boolean f209271d;

        /* JADX INFO: renamed from: e */
        private NotifyCenter f209272e;

        /* JADX INFO: renamed from: f */
        private Object f209273f;

        /* JADX INFO: renamed from: g */
        private int f209274g;

        /* JADX INFO: renamed from: h */
        private int f209275h;

        /* JADX INFO: renamed from: i */
        private int f209276i;

        /* JADX INFO: renamed from: j */
        private int f209277j;

        /* JADX INFO: renamed from: k */
        private int f209278k;

        /* JADX INFO: renamed from: l */
        private Bitmap[] f209279l;

        /* JADX INFO: renamed from: m */
        private int f209280m;

        /* JADX INFO: renamed from: n */
        private int f209281n;

        private ImageRunnable() {
            this.f209268a = false;
            this.f209269b = null;
            this.f209270c = null;
            this.f209271d = true;
            this.f209272e = null;
            this.f209273f = new Object();
            this.f209274g = -1;
            this.f209275h = -1;
            this.f209276i = -1;
            this.f209277j = -1;
            this.f209278k = 0;
            this.f209279l = new Bitmap[10];
            this.f209280m = 0;
            this.f209281n = 50;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x005e  */
        /* JADX INFO: renamed from: b */
        private void m223567b(Bitmap bitmap, int i) {
            int iM223561a0;
            int iM223559Y;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            t9c.m189745c("ImageStream", "--------imageRunning: begin, input:[" + width + Constants.SEPARATOR_COMMA + height + "], " + bitmap + "<--" + this.f209270c);
            boolean z = true;
            if (this.f209278k == 1) {
                iM223561a0 = this.f209276i;
                iM223559Y = this.f209277j;
            } else {
                iM223561a0 = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                if (width >= height) {
                    if (width > 1280) {
                        iM223559Y = ImageSource.this.m223559Y(width, height, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
                    } else {
                        iM223561a0 = width;
                        iM223559Y = height;
                    }
                } else if (height > 1280) {
                    iM223559Y = 1280;
                    iM223561a0 = ImageSource.this.m223561a0(width, height, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
                } else {
                    iM223561a0 = width;
                    iM223559Y = height;
                }
            }
            int iM223560Z = ImageSource.this.m223560Z(iM223561a0);
            int iM223558X = ImageSource.this.m223558X(iM223559Y);
            t9c.m189745c("ImageStream", "-----imageRunning: normal[" + iM223560Z + ", " + iM223558X + "]<----old[" + this.f209276i + Constants.SEPARATOR_COMMA + this.f209277j + Constants.AES_SUFFIX);
            if (iM223560Z == this.f209276i && iM223558X == this.f209277j) {
                z = false;
            }
            this.f209276i = iM223560Z;
            this.f209277j = iM223558X;
            VideoQuality videoQuality = ImageSource.this.f209259e;
            videoQuality.resX = iM223560Z;
            videoQuality.resY = iM223558X;
            if (this.f209275h != height || this.f209274g != width || z) {
                this.f209275h = height;
                this.f209274g = width;
                t9c.m189745c("ImageStream", "-----imageRunning: updateCamera, [" + this.f209274g + Constants.SEPARATOR_COMMA + this.f209275h + "]--->[" + this.f209276i + Constants.SEPARATOR_COMMA + this.f209277j + Constants.AES_SUFFIX);
                this.f209269b.m223710Y0(ImageSource.this.f209259e);
                this.f209269b.m223719e1(this.f209274g, this.f209275h, false, 0, ImageSource.this.f209265k, 1, this.f209276i, this.f209277j);
                this.f209272e.notifyUpdateResolution();
                if (z) {
                    t9c.m189745c("ImageStream", "-----imageRunning: notifyResumeRecording, " + ImageSource.this.f209259e.resX + Constants.SEPARATOR_COMMA + ImageSource.this.f209259e.resY);
                    this.f209272e.notifyResumeRecording();
                }
            }
            t9c.m189745c("ImageStream", "-----imageRunning: end");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public void m223568d(int i) {
            this.f209281n = i;
        }

        /* JADX INFO: renamed from: c */
        public void m223569c() {
            this.f209268a = true;
        }

        /* JADX INFO: renamed from: e */
        public void m223570e(MomoSurface momoSurface) {
            this.f209269b = momoSurface;
            this.f209270c = null;
            for (int i = 0; i < 10; i++) {
                this.f209279l[i] = null;
            }
            this.f209280m = 0;
            this.f209274g = -1;
            this.f209275h = -1;
            this.f209276i = -1;
            this.f209277j = -1;
        }

        /* JADX INFO: renamed from: f */
        public void m223571f(NotifyCenter notifyCenter) {
            this.f209272e = notifyCenter;
        }

        /* JADX INFO: renamed from: g */
        public void m223572g(int i, int i2) {
            this.f209276i = i;
            this.f209277j = i2;
            this.f209278k = 1;
        }

        /* JADX INFO: renamed from: h */
        public void m223573h(Bitmap bitmap, int i, boolean z) {
            synchronized (this.f209273f) {
                try {
                    t9c.m189745c("ImageStream", "----running update: begin " + this.f209280m + Constants.SEPARATOR_COMMA + bitmap);
                    if (z) {
                        this.f209279l[0] = bitmap;
                        this.f209280m = 1;
                    } else {
                        int i2 = this.f209280m;
                        if (i2 < 10) {
                            this.f209279l[i2] = bitmap;
                            this.f209280m = i2 + 1;
                        }
                    }
                    t9c.m189745c("ImageStream", "----running update: end  " + this.f209280m);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f209268a) {
                try {
                    Thread.sleep(this.f209281n);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (this.f209273f) {
                    try {
                        int i = this.f209280m;
                        if (i > 0) {
                            int i2 = i - 1;
                            Bitmap bitmap = this.f209279l[i2];
                            this.f209270c = bitmap;
                            if (bitmap != null) {
                                t9c.m189745c("ImageStream", "----running run " + this.f209270c);
                                if (!this.f209270c.isRecycled()) {
                                    m223567b(this.f209270c, 0);
                                }
                                MomoSurface momoSurface = this.f209269b;
                                if (momoSurface != null) {
                                    momoSurface.m223721f1(this.f209274g, this.f209275h, this.f209270c, true);
                                }
                            }
                            for (int i3 = 0; i3 < i2; i3++) {
                                Bitmap bitmap2 = this.f209279l[i3];
                                if (bitmap2 != null && !bitmap2.isRecycled()) {
                                    this.f209279l[i3].recycle();
                                    this.f209279l[i3] = null;
                                    this.f209280m--;
                                }
                            }
                            t9c.m189745c("ImageStream", "----running run: end " + this.f209280m);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            t9c.m189743a("ImageStream", "----image frame runnable:" + this.f209268a);
            t9c.m189745c("ImageStream", "----image runnable thread exit success");
        }
    }

    public ImageSource(MomoSurface momoSurface, NotifyCenter notifyCenter) {
        VideoQuality videoQualityM225057clone = VideoQuality.DEFAULT_VIDEO_QUALITY.m225057clone();
        this.f209258d = videoQualityM225057clone;
        this.f209259e = videoQualityM225057clone.m225057clone();
        this.f209263i = new Object();
        this.f209264j = null;
        this.f209265k = 1;
        this.f209266l = 0L;
        this.f209267m = null;
        this.f209255a = momoSurface;
        this.f209260f = notifyCenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public int m223558X(int i) {
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
    public int m223559Y(int i, int i2, int i3) {
        return (i3 * i2) / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public int m223560Z(int i) {
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
    public int m223561a0(int i, int i2, int i3) {
        return (i3 * i) / i2;
    }

    /* JADX INFO: renamed from: b0 */
    private void m223562b0() {
        if (this.f209262h != null) {
            this.f209261g.m223569c();
        }
        Bitmap bitmap = this.f209264j;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f209264j.recycle();
            this.f209264j = null;
        }
        synchronized (this.f209263i) {
            Thread thread = this.f209262h;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f209262h = null;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: F */
    public void mo223513F(int i) {
        if (i <= 0) {
            i = 15;
        }
        if (i > 30) {
            i = 30;
        }
        ImageRunnable imageRunnable = this.f209261g;
        if (imageRunnable != null) {
            imageRunnable.m223568d(1000 / i);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: J */
    public void mo223563J(Activity activity, Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (bitmap == null || bitmap.isRecycled() || this.f209255a == null || this.f209260f == null) {
            t9c.m189745c("ImageStream", "----startCaptureImage: mFakeSurface=" + this.f209255a + "; mNotify=" + this.f209260f + ";bitmap=" + bitmap);
            return;
        }
        this.f209266l = System.currentTimeMillis();
        t9c.m189745c("ImageStream", "----startCaptureImage: begin...");
        this.f209261g = new ImageRunnable();
        this.f209262h = new Thread(this.f209261g, "live-media-ImageSource");
        this.f209261g.m223570e(this.f209255a);
        this.f209261g.m223571f(this.f209260f);
        this.f209267m = null;
        if (!bitmap.isRecycled()) {
            if (bitmap.getWidth() % 2 != 0) {
                this.f209267m = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight(), (Matrix) null, false);
                bitmap.recycle();
            } else {
                this.f209267m = bitmap;
            }
        }
        if (i4 == 1) {
            if (i2 < 0 || i3 < 0) {
                t9c.m189745c("ImageStream", "----startCaptureImage: input params error:" + i2 + Constants.SEPARATOR_COMMA + i3);
            } else {
                this.f209261g.m223572g(i2, i3);
            }
        }
        Bitmap bitmap2 = this.f209267m;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.f209261g.m223573h(this.f209267m, i, true);
        }
        this.f209262h.start();
        t9c.m189745c("ImageStream", "----startCaptureImage: end... time:" + (System.currentTimeMillis() - this.f209266l) + "ms");
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: L */
    public void mo223564L() {
        if (this.f209262h != null) {
            this.f209261g.m223569c();
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: Q */
    public void mo223565Q(Bitmap bitmap, int i, int i2, int i3) {
        if (bitmap == null || bitmap.isRecycled() || this.f209261g == null || this.f209260f == null || this.f209255a == null) {
            t9c.m189745c("ImageStream", "----updateCaptureImage: mFakeSurface=" + this.f209255a + "; mNotify=" + this.f209260f + ";bitmap=" + bitmap);
            return;
        }
        t9c.m189745c("ImageStream", "----updateCaptureImage: begin..." + bitmap + "; time:" + (System.currentTimeMillis() - this.f209266l) + "ms");
        if (!bitmap.isRecycled()) {
            this.f209267m = null;
            if (bitmap.getWidth() % 2 != 0) {
                this.f209267m = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight(), (Matrix) null, false);
                bitmap.recycle();
            } else {
                this.f209267m = bitmap;
            }
        }
        Bitmap bitmap2 = this.f209267m;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        t9c.m189745c("ImageStream", "----updateCaptureImage: end..." + this.f209267m + "; time:" + (System.currentTimeMillis() - this.f209266l) + "ms");
        this.f209261g.m223573h(this.f209267m, i, false);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: n */
    public VideoQuality mo223534n() {
        t9c.m189745c("ImageStream", "getVideoQuality: width" + this.f209259e.resX + ";heigh:" + this.f209259e.resY);
        return this.f209259e;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: q */
    public void mo223537q() {
        t9c.m189745c("ImageStream", "----release:");
        m223562b0();
        this.f209256b = false;
    }
}
