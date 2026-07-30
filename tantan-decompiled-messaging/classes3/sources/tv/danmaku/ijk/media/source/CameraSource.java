package tv.danmaku.ijk.media.source;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.immomo.baseutil.Rotation;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import com.momocv.videoprocessor.VideoProcessor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l.mkw;
import l.n8c;
import l.pjw;
import l.vjw;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;
import p003l.ts2;
import tv.danmaku.ijk.media.streamer.MomoSurface;
import tv.danmaku.ijk.media.streamer.Util;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;
import tv.danmaku.ijk.media.util.CameraUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CameraSource extends SourceBase {

    /* JADX INFO: renamed from: A */
    private boolean f11904A;

    /* JADX INFO: renamed from: B */
    private boolean f11905B;

    /* JADX INFO: renamed from: C */
    private final int f11906C;

    /* JADX INFO: renamed from: D */
    private ijkMediaStreamer.OnVideoPreviewSizeSetListener f11907D;

    /* JADX INFO: renamed from: E */
    private MomoSurface f11908E;

    /* JADX INFO: renamed from: F */
    private boolean f11909F;

    /* JADX INFO: renamed from: G */
    private int f11910G;

    /* JADX INFO: renamed from: H */
    private float f11911H;

    /* JADX INFO: renamed from: I */
    private float f11912I;

    /* JADX INFO: renamed from: J */
    private boolean f11913J;

    /* JADX INFO: renamed from: K */
    private boolean f11914K;

    /* JADX INFO: renamed from: L */
    private VideoProcessor f11915L;

    /* JADX INFO: renamed from: M */
    private vjw f11916M;

    /* JADX INFO: renamed from: N */
    private mkw f11917N;

    /* JADX INFO: renamed from: O */
    private List<String> f11918O;

    /* JADX INFO: renamed from: P */
    private int f11919P;

    /* JADX INFO: renamed from: Q */
    private long f11920Q;

    /* JADX INFO: renamed from: R */
    private Handler f11921R;

    /* JADX INFO: renamed from: S */
    private HandlerThread f11922S;

    /* JADX INFO: renamed from: T */
    final Camera.PreviewCallback f11923T;

    /* JADX INFO: renamed from: d */
    private Activity f11927d;

    /* JADX INFO: renamed from: e */
    private NotifyCenter f11928e;

    /* JADX INFO: renamed from: f */
    private volatile Camera f11929f;

    /* JADX INFO: renamed from: m */
    protected VideoQuality f11936m;

    /* JADX INFO: renamed from: n */
    protected VideoQuality f11937n;

    /* JADX INFO: renamed from: o */
    private boolean f11938o;

    /* JADX INFO: renamed from: p */
    int f11939p;

    /* JADX INFO: renamed from: q */
    private boolean f11940q;

    /* JADX INFO: renamed from: r */
    private int f11941r;

    /* JADX INFO: renamed from: s */
    int f11942s;

    /* JADX INFO: renamed from: t */
    int f11943t;

    /* JADX INFO: renamed from: u */
    private int f11944u;

    /* JADX INFO: renamed from: v */
    int f11945v;

    /* JADX INFO: renamed from: w */
    private int f11946w;

    /* JADX INFO: renamed from: x */
    int f11947x;

    /* JADX INFO: renamed from: y */
    public int f11948y;

    /* JADX INFO: renamed from: z */
    public int f11949z;

    /* JADX INFO: renamed from: a */
    protected int f11924a = 0;

    /* JADX INFO: renamed from: b */
    protected int f11925b = 0;

    /* JADX INFO: renamed from: c */
    Camera.Parameters f11926c = null;

    /* JADX INFO: renamed from: g */
    SurfaceTexture f11930g = null;

    /* JADX INFO: renamed from: h */
    private int f11931h = 1;

    /* JADX INFO: renamed from: i */
    private Object f11932i = new Object();

    /* JADX INFO: renamed from: j */
    int f11933j = 0;

    /* JADX INFO: renamed from: k */
    int f11934k = 1;

    /* JADX INFO: renamed from: l */
    private int f11935l = 25;

    public interface OnCameraErrorListener {
    }

    public CameraSource(Activity activity, NotifyCenter notifyCenter) {
        this.f11928e = null;
        VideoQuality videoQualityClone = VideoQuality.DEFAULT_VIDEO_QUALITY.clone();
        this.f11936m = videoQualityClone;
        this.f11937n = videoQualityClone.clone();
        this.f11938o = false;
        this.f11939p = 1;
        this.f11940q = false;
        this.f11941r = 1;
        this.f11942s = 0;
        this.f11943t = 0;
        this.f11944u = 480;
        this.f11945v = 480;
        this.f11946w = 640;
        this.f11947x = 640;
        this.f11948y = 480;
        this.f11949z = 640;
        this.f11904A = false;
        this.f11905B = false;
        this.f11906C = 10;
        this.f11910G = 9;
        this.f11913J = true;
        this.f11916M = new vjw();
        this.f11917N = new mkw(1);
        this.f11918O = null;
        this.f11919P = 1;
        this.f11920Q = 0L;
        this.f11921R = null;
        this.f11922S = null;
        this.f11923T = new Camera.PreviewCallback() { // from class: tv.danmaku.ijk.media.source.CameraSource.4
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(final byte[] bArr, Camera camera) {
                n8c.c("VideoSource", "onPreviewFrame callback invoke:");
                long jCurrentTimeMillis = System.currentTimeMillis() - CameraSource.this.f11920Q;
                CameraSource cameraSource = CameraSource.this;
                if (jCurrentTimeMillis >= 1000 / ((long) (cameraSource.f11937n.framerate + 5))) {
                    cameraSource.f11920Q = System.currentTimeMillis();
                    CameraSource.this.f11921R.post(new Runnable() { // from class: tv.danmaku.ijk.media.source.CameraSource.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (CameraSource.this.f11932i) {
                                try {
                                    if (CameraSource.this.f11929f != null && bArr != null) {
                                        n8c.c("VideoSource", "onPreviewFrame mDofaceDetect:" + CameraSource.this.f11909F);
                                        pjw pjwVar = new pjw();
                                        boolean z = CameraSource.this.f11909F;
                                        C12874 c12874 = C12874.this;
                                        if (z) {
                                            CameraSource.this.f11916M.h(17);
                                            CameraSource.this.f11916M.m(CameraSource.this.f11948y);
                                            CameraSource.this.f11916M.j(CameraSource.this.f11949z);
                                            CameraSource.this.f11916M.g(ByteBuffer.wrap(bArr).array());
                                            CameraSource.this.f11916M.f(bArr.length);
                                            CameraSource.this.f11916M.l(CameraSource.this.f11948y);
                                            CameraSource.this.f11917N.A(CameraSource.this.f11943t * 90);
                                            CameraSource.this.f11917N.z(CameraSource.this.f11943t * 90);
                                            CameraSource.this.f11917N.p(CameraSource.this.f11904A);
                                            CameraSource.this.f11917N.k(false);
                                            CameraSource.this.f11917N.i(true);
                                            CameraSource.this.f11917N.l(CameraSource.this.f11914K);
                                            CameraSource.this.f11917N.F(true);
                                            CameraSource.this.f11917N.M(CameraSource.this.f11910G);
                                            CameraSource.this.f11917N.K(CameraSource.this.f11911H);
                                            CameraSource.this.f11917N.L(CameraSource.this.f11912I);
                                            CameraSource.this.f11917N.G(CameraSource.this.f11913J);
                                            CameraSource.this.f11917N.h(true);
                                            if (CameraSource.this.f11915L == null && CameraSource.this.f11918O != null) {
                                                CameraSource.this.f11915L = new VideoProcessor();
                                                if (CameraSource.this.f11918O.size() >= 2) {
                                                    CameraSource.this.f11915L.LoadModel((String) CameraSource.this.f11918O.get(0), (String) CameraSource.this.f11918O.get(1));
                                                }
                                            }
                                            if (CameraSource.this.f11915L != null) {
                                                CameraSource.this.f11915L.ProcessFrame(CameraSource.this.f11916M.b(), CameraSource.this.f11917N.f(), pjwVar.k);
                                                pjwVar.b(CameraSource.this.f11910G);
                                            }
                                            CameraSource.this.m10698C0(pjwVar, bArr);
                                        } else {
                                            CameraSource.this.m10698C0(pjwVar, bArr);
                                        }
                                        return;
                                    }
                                    n8c.c("VideoSource", "onPreviewFrame return");
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                } else if (cameraSource.f11929f != null) {
                    CameraSource.this.f11929f.addCallbackBuffer(bArr);
                }
            }
        };
        this.f11927d = activity;
        this.f11928e = notifyCenter;
        this.f11920Q = 0L;
        if (this.f11922S == null) {
            HandlerThread handlerThread = new HandlerThread("ijkStrMonitor");
            this.f11922S = handlerThread;
            handlerThread.start();
            this.f11921R = new Handler(this.f11922S.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m10698C0(pjw pjwVar, byte[] bArr) {
        pjwVar.z(this.f11904A);
        pjwVar.w(this.f11943t * 90);
        pjwVar.C(this.f11943t * 90);
        pjwVar.y(bArr);
        pjwVar.E(this.f11948y);
        pjwVar.A(this.f11949z);
        this.f11908E.m10951j1(this.f11929f, bArr, this.f11948y, this.f11949z, pjwVar);
        if (this.f11929f != null) {
            this.f11929f.addCallbackBuffer(bArr);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m10723r0() {
        new AsyncTask<String, Integer, Boolean>() { // from class: tv.danmaku.ijk.media.source.CameraSource.5
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                n8c.c("VideoSource", "initCamera doInBackground");
                boolean zM10728x0 = CameraSource.this.m10728x0();
                for (int i = 0; !zM10728x0 && i < 2; i++) {
                    try {
                        Thread.sleep(2000L);
                        n8c.c("VideoSource", "camera dealay creat");
                    } catch (InterruptedException unused) {
                    }
                    zM10728x0 = CameraSource.this.m10728x0();
                }
                if (!CameraSource.this.f11938o) {
                    CameraSource.this.f11938o = true;
                }
                CameraSource.this.m10724s0();
                CameraSource.this.m10729y0();
                synchronized (CameraSource.this.f11932i) {
                    CameraSource.this.f11932i.notifyAll();
                }
                return Boolean.valueOf(zM10728x0);
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                if (!bool.booleanValue() || CameraSource.this.f11929f == null) {
                    n8c.c("VideoSource", "无法连接到相机");
                } else if (CameraSource.this.f11928e != null) {
                    CameraSource.this.f11928e.setSourceSucess();
                }
            }
        }.execute("start");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m10724s0() {
        NotifyCenter notifyCenter;
        n8c.c("VideoSource", "initCameraPara ");
        if (this.f11929f == null) {
            n8c.c("VideoSource", "mCamera == null");
            return;
        }
        try {
            List<Camera.Size> listM11267a = Util.m11267a(this.f11929f);
            Camera.Size sizeM10763q0 = (listM11267a == null || listM11267a.size() <= 0) ? null : m10763q0(listM11267a, this.f11942s);
            Camera.Size previewSize = this.f11926c.getPreviewSize();
            boolean z = m10725t0() && this.f11934k == 1;
            if (sizeM10763q0 == null || z) {
                this.f11948y = previewSize.width;
                this.f11949z = previewSize.height;
            } else {
                int i = sizeM10763q0.width;
                this.f11948y = i;
                int i2 = sizeM10763q0.height;
                this.f11949z = i2;
                if (i == 0 || i2 == 0) {
                    this.f11948y = previewSize.width;
                    this.f11949z = previewSize.height;
                }
            }
            this.f11926c.setPictureFormat(256);
            this.f11926c.setPreviewSize(this.f11948y, this.f11949z);
            n8c.c("VideoSource", "mCamera.setParameters frameRate " + this.f11937n.framerate);
            VideoQuality videoQuality = this.f11937n;
            int i3 = videoQuality.framerate;
            if (i3 > 25 || i3 <= 0) {
                videoQuality.framerate = 25;
            }
            int[] iArrM10770w0 = m10770w0(this.f11926c, 30);
            this.f11926c.setPreviewFpsRange(iArrM10770w0[0], iArrM10770w0[1]);
            this.f11926c.setPreviewFrameRate(this.f11937n.framerate);
            n8c.c("VideoSource", "mCamera.getPreviewFrameRate " + this.f11926c.getPreviewFrameRate());
            this.f11926c.setPreviewFormat(17);
            this.f11926c.setAntibanding("auto");
            this.f11926c.setWhiteBalance("auto");
            this.f11929f.setParameters(this.f11926c);
        } catch (RuntimeException unused) {
            n8c.c("VideoSource", "mCamera.setParameters fail");
            if (m10728x0()) {
                this.f11926c = this.f11929f.getParameters();
            } else {
                NotifyCenter notifyCenter2 = this.f11928e;
                if (notifyCenter2 != null) {
                    notifyCenter2.notify(HttpStatus.MULTIPLE_CHOICES_300, -303, 2, (Object) null);
                    return;
                }
            }
            Camera.Parameters parameters = this.f11926c;
            if (parameters == null && (notifyCenter = this.f11928e) != null) {
                notifyCenter.notify(HttpStatus.MULTIPLE_CHOICES_300, -303, 2, (Object) null);
                return;
            } else {
                Camera.Size previewSize2 = parameters.getPreviewSize();
                this.f11948y = previewSize2.width;
                this.f11949z = previewSize2.height;
            }
        }
        m10732A0();
    }

    /* JADX INFO: renamed from: t0 */
    private boolean m10725t0() {
        String[] strArr = {"GN9000", "GN9005", "F301", "F103", "GN5001", "Bird L5", "ATH-AL00", "Coolpad 8720L", "Coolpad 8705", "Che1-CL10", "V3MAX_L8", "HUAWEITIT-AL00", "HUAWEIG628-TL00", "DOOV_D910T"};
        for (int i = 0; i < 14; i++) {
            String str = strArr[i];
            if (str != null && Build.MODEL.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    private boolean m10726u0(Camera.Parameters parameters) {
        Iterator<String> it = parameters.getSupportedFocusModes().iterator();
        while (it.hasNext()) {
            if (it.next().equals("auto")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    private boolean m10727v0(Camera.Parameters parameters) {
        Iterator<String> it = parameters.getSupportedFocusModes().iterator();
        while (it.hasNext()) {
            if (it.next().equals("fixed")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public boolean m10728x0() {
        int i;
        try {
            this.f11939p = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i2 = 0;
            while (true) {
                i = this.f11939p;
                if (i2 >= i) {
                    break;
                }
                Camera.getCameraInfo(i2, cameraInfo);
                int i3 = cameraInfo.facing;
                if (i3 == this.f11934k) {
                    this.f11933j = i2;
                    if (i3 == 1) {
                        this.f11941r = 1;
                    } else {
                        this.f11941r = 0;
                    }
                }
                i2++;
            }
            if (i == 1) {
                this.f11933j = 0;
                this.f11941r = 0;
            }
            m10730z0();
            if (this.f11929f != null) {
                this.f11929f.setPreviewCallback(null);
                this.f11929f.setPreviewCallbackWithBuffer(null);
                this.f11929f.release();
                this.f11929f = null;
            }
            int i4 = this.f11933j;
            if (i4 >= 0) {
                this.f11929f = Camera.open(i4);
            } else {
                this.f11929f = Camera.open();
            }
            if (this.f11929f == null) {
                return false;
            }
            this.f11942s = CameraUtils.m11332a(this.f11927d, this.f11933j);
            n8c.c("VideoSource", "determineDisplayOrientation displayOrientation:" + this.f11942s + ";defaultCameraId " + this.f11933j + ";numberOfCameras:" + this.f11939p + ";mCameraSelection:" + this.f11934k + ";frontCamera:" + this.f11941r);
            Rotation rotation = Rotation.NORMAL;
            int i5 = this.f11942s;
            if (i5 == 90) {
                rotation = Rotation.ROTATION_90;
            } else if (i5 == 180) {
                rotation = Rotation.ROTATION_180;
            } else if (i5 == 270) {
                rotation = Rotation.ROTATION_270;
            }
            this.f11943t = this.f11941r == 1 ? (this.f11924a + rotation.ordinal()) % (Rotation.ROTATION_270.ordinal() + 1) : (this.f11925b + rotation.ordinal()) % (Rotation.ROTATION_270.ordinal() + 1);
            this.f11926c = this.f11929f.getParameters();
            this.f11929f.setDisplayOrientation(this.f11942s);
            List<String> supportedFocusModes = this.f11926c.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                String str = Build.MODEL;
                n8c.e("video", str);
                if ((str.startsWith("GT-I950") || str.endsWith("SCH-I959") || str.endsWith("MEIZU MX3")) && supportedFocusModes.contains("continuous-picture")) {
                    this.f11926c.setFocusMode("continuous-picture");
                    n8c.c("VideoSource", "FOCUS_MODE_CONTINUOUS_PICTURE");
                } else if (supportedFocusModes.contains("continuous-video")) {
                    n8c.c("VideoSource", "FOCUS_MODE_CONTINUOUS_VIDEO");
                    this.f11926c.setFocusMode("continuous-video");
                } else {
                    this.f11926c.setFocusMode("fixed");
                    n8c.c("VideoSource", "FOCUS_MODE_FIXED");
                }
            }
            this.f11926c.setWhiteBalance("auto");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public void m10729y0() {
        if (this.f11905B || this.f11929f == null) {
            return;
        }
        this.f11905B = true;
        n8c.c("VideoSource", "startPreview cameraSurface:" + this.f11930g);
        if (this.f11930g == null) {
            return;
        }
        try {
            this.f11929f.setPreviewTexture(this.f11930g);
            this.f11929f.startPreview();
            int i = 0;
            while (true) {
                Camera camera = this.f11929f;
                if (i >= 10) {
                    camera.setPreviewCallbackWithBuffer(this.f11923T);
                    n8c.c("VideoSource", "mCamera.setPreviewTexture");
                    return;
                }
                camera.addCallbackBuffer(new byte[((this.f11948y * this.f11949z) * 3) / 2]);
                n8c.c("VideoSource", "mCamera.addCallbackBuffer size:" + (((this.f11948y * this.f11949z) * 3) / 2));
                i++;
            }
        } catch (Exception unused) {
            n8c.c("VideoSource", "mCamera startPreview fail");
        }
    }

    /* JADX INFO: renamed from: z0 */
    private void m10730z0() {
        synchronized (this.f11932i) {
            try {
                try {
                    if (this.f11929f != null) {
                        this.f11929f.setPreviewCallback(null);
                        this.f11929f.setPreviewCallbackWithBuffer(null);
                    }
                    if (this.f11929f != null) {
                        this.f11929f.stopPreview();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (this.f11929f != null) {
                    this.f11929f.release();
                    this.f11929f = null;
                }
                this.f11905B = false;
                this.f11940q = false;
                VideoProcessor videoProcessor = this.f11915L;
                if (videoProcessor != null) {
                    videoProcessor.Release();
                    this.f11915L = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: A */
    public void mo10731A(float f) {
        this.f11911H = f * 0.5f;
    }

    /* JADX INFO: renamed from: A0 */
    public void m10732A0() {
        float f = this.f11928e.getPreviewScale().x;
        float f2 = this.f11928e.getPreviewScale().y;
        float f3 = f2 / f;
        int i = this.f11949z;
        int i2 = this.f11948y;
        float f4 = i / i2;
        VideoQuality videoQuality = this.f11937n;
        if (f3 <= f4) {
            videoQuality.resY = i2;
            videoQuality.resX = ((int) (((i2 * f2) / f) / 16.0f)) * 16;
        } else {
            videoQuality.resX = i;
            videoQuality.resY = ((int) (((i * f) / f2) / 16.0f)) * 16;
        }
        VideoQuality videoQuality2 = this.f11937n;
        videoQuality2.resX = (int) (((double) videoQuality2.resX) * 1.0d * ((double) this.f11928e.getPreviewZoom()));
        VideoQuality videoQuality3 = this.f11937n;
        videoQuality3.resY = (int) (((double) videoQuality3.resY) * 1.0d * ((double) this.f11928e.getPreviewZoom()));
        n8c.c("VideoSource", "----previewWidth:" + this.f11948y + ";previewHeight" + this.f11949z + ";mVideoQuality.resX" + this.f11937n.resX + ";mVideoQuality.resY" + this.f11937n.resY + "," + this.f11919P);
        VideoQuality videoQuality4 = this.f11937n;
        if (videoQuality4.resX < 176) {
            videoQuality4.resX = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        if (videoQuality4.resY < 176) {
            videoQuality4.resY = CipherSuite.TLS_PSK_WITH_NULL_SHA256;
        }
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            if (this.f11934k == 1) {
                this.f11904A = true;
            } else {
                this.f11904A = false;
            }
            if (this.f11939p == 1) {
                this.f11904A = false;
            }
            int i3 = this.f11919P;
            if (i3 == 2) {
                momoSurface.m10944e1(this.f11948y, this.f11949z, this.f11904A, this.f11943t * 90, i3, 0, videoQuality4.resX, videoQuality4.resY);
                VideoQuality videoQuality5 = this.f11937n;
                int i4 = videoQuality5.resY;
                int i5 = videoQuality5.resX;
                if (i4 > i5) {
                    videoQuality5.resY = i5;
                    videoQuality5.resX = i4;
                }
            } else {
                int i6 = videoQuality4.resX;
                int i7 = videoQuality4.resY;
                if (i6 > i7) {
                    videoQuality4.resY = i6;
                    videoQuality4.resX = i7;
                }
                momoSurface.m10944e1(this.f11948y, this.f11949z, this.f11904A, this.f11943t * 90, i3, 0, videoQuality4.resX, videoQuality4.resY);
            }
            n8c.c("VideoSource", "updateResolution call setVideoQuality():" + this.f11937n.resX + "," + this.f11937n.resY);
            this.f11908E.m10935Y0(this.f11937n);
        }
        NotifyCenter notifyCenter = this.f11928e;
        if (notifyCenter != null) {
            notifyCenter.notifyUpdateResolution();
        }
        ijkMediaStreamer.OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener = this.f11907D;
        if (onVideoPreviewSizeSetListener != null) {
            VideoQuality videoQuality6 = this.f11937n;
            onVideoPreviewSizeSetListener.m11306a(videoQuality6.resX, videoQuality6.resY);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: B */
    public void mo10733B(int i, int i2) {
        this.f11945v = i;
        this.f11947x = i2;
        this.f11944u = i;
        this.f11946w = i2;
    }

    /* JADX INFO: renamed from: B0 */
    public void m10734B0(VideoQuality videoQuality) {
        if (videoQuality == null || videoQuality.resX == 0 || videoQuality.resY == 0) {
            return;
        }
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            momoSurface.m10935Y0(videoQuality);
        }
        NotifyCenter notifyCenter = this.f11928e;
        if (notifyCenter != null) {
            notifyCenter.notifyUpdateResolution();
            this.f11928e.notifyResumeRecording();
        }
        n8c.c("VideoSource", "updateVideoVideoQuality:" + this.f11937n.resX + "," + this.f11937n.resY);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: C */
    public void mo10735C(Object obj) {
        this.f11907D = (ijkMediaStreamer.OnVideoPreviewSizeSetListener) obj;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: D */
    public void mo10736D(float f) {
        m10732A0();
        mo10737E(0, 1);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: E */
    public void mo10737E(int i, int i2) {
        NotifyCenter notifyCenter = this.f11928e;
        if (notifyCenter == null) {
            return;
        }
        if (notifyCenter.getStreamerCaptureType(i) == i2) {
            n8c.c("VideoSource", "----setStreamerCaptureType repeat, captureType=" + i2 + ", uid=" + i);
            return;
        }
        n8c.c("VideoSource", "----setStreamerCaptureType, captureType=" + i2 + ", uid=" + i);
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            momoSurface.m10948h0(0.0f, 0.0f, 0.0f, 1.0f, true);
        }
        this.f11928e.setStreamerCaptureType(i, i2);
        if (this.f11908E != null) {
            int streamerCaptureType = this.f11928e.getStreamerCaptureType(i);
            NotifyCenter notifyCenter2 = this.f11928e;
            if (streamerCaptureType == 1) {
                this.f11919P = notifyCenter2.getStreamerCaptureType(i);
                this.f11908E.m10948h0(0.0f, 0.0f, 0.0f, 1.0f, false);
                VideoQuality videoQuality = this.f11937n;
                int i3 = videoQuality.resX;
                int i4 = videoQuality.resY;
                if (i3 > i4) {
                    videoQuality.resY = i3;
                    videoQuality.resX = i4;
                }
                this.f11908E.m10944e1(this.f11948y, this.f11949z, this.f11904A, this.f11943t * 90, this.f11919P, i, videoQuality.resX, videoQuality.resY);
            } else {
                this.f11919P = notifyCenter2.getStreamerCaptureType(i);
                this.f11908E.m10948h0(0.0f, 0.0f, 0.0f, 1.0f, false);
                MomoSurface momoSurface2 = this.f11908E;
                int i5 = this.f11948y;
                int i6 = this.f11949z;
                boolean z = this.f11904A;
                int i7 = this.f11943t * 90;
                int i8 = this.f11919P;
                VideoQuality videoQuality2 = this.f11937n;
                momoSurface2.m10944e1(i5, i6, z, i7, i8, i, videoQuality2.resX, videoQuality2.resY);
                VideoQuality videoQuality3 = this.f11937n;
                int i9 = videoQuality3.resY;
                int i10 = videoQuality3.resX;
                if (i9 > i10) {
                    videoQuality3.resY = i10;
                    videoQuality3.resX = i9;
                }
            }
            this.f11908E.m10935Y0(this.f11937n);
        }
        this.f11928e.notifyUpdateResolution();
        ijkMediaStreamer.OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener = this.f11907D;
        if (onVideoPreviewSizeSetListener != null) {
            VideoQuality videoQuality4 = this.f11937n;
            onVideoPreviewSizeSetListener.m11306a(videoQuality4.resX, videoQuality4.resY);
        }
        this.f11928e.notifyResumeRecording();
        n8c.c("VideoSource", "----setStreamerCaptureType, mCurrentScreenOrient=" + this.f11919P + ";" + this.f11937n.resX + "," + this.f11937n.resY);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: F */
    public void mo10738F(int i) {
        this.f11937n.framerate = i;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: G */
    public void mo10739G(int i) {
        if (this.f11940q) {
            return;
        }
        this.f11931h = i;
        n8c.c("VideoSource", "setVideoResolution:" + i);
        int i2 = this.f11931h;
        if (i2 == 2) {
            VideoQuality videoQuality = this.f11937n;
            videoQuality.resX = 384;
            videoQuality.resY = 720;
        } else if (i2 == 3) {
            VideoQuality videoQuality2 = this.f11937n;
            videoQuality2.resX = 720;
            videoQuality2.resY = 1280;
        } else if (i2 == 1) {
            VideoQuality videoQuality3 = this.f11937n;
            videoQuality3.resX = 352;
            videoQuality3.resY = 640;
        } else {
            VideoQuality videoQuality4 = this.f11937n;
            if (i2 == 5) {
                videoQuality4.resX = 528;
                videoQuality4.resY = 960;
            } else {
                videoQuality4.resX = CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
                videoQuality4.resY = 320;
            }
        }
        if (this.f11908E != null) {
            n8c.c("VideoSource", "setVideoResolution call setVideoQuality():" + this.f11937n.resX + "," + this.f11937n.resY);
            this.f11908E.m10935Y0(this.f11937n);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: H */
    public void mo10740H(int i) {
        this.f11910G = i;
        if (i < 5 || i > 8) {
            return;
        }
        this.f11913J = true;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: I */
    public void mo10741I(int i) {
        if (this.f11926c == null || this.f11929f == null) {
            return;
        }
        try {
            if (i >= this.f11926c.getMaxZoom()) {
                i = 0;
            }
            if (this.f11926c.isSmoothZoomSupported()) {
                this.f11929f.startSmoothZoom(i);
            } else if (this.f11926c.isZoomSupported()) {
                this.f11926c.setZoom(i);
                this.f11929f.setParameters(this.f11926c);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: N */
    public void mo10742N() {
        this.f11934k = this.f11934k == 0 ? 1 : 0;
        n8c.c("VideoSource", "switchCamera");
        synchronized (this.f11932i) {
            try {
                try {
                    MomoSurface momoSurface = this.f11908E;
                    if (momoSurface != null) {
                        momoSurface.m10918K0(this.f11934k);
                    }
                    mo10739G(this.f11931h);
                    m10723r0();
                    this.f11932i.wait(4000L);
                    n8c.c("VideoSource", "switchCamera end");
                } catch (Exception unused) {
                    NotifyCenter notifyCenter = this.f11928e;
                    if (notifyCenter != null) {
                        notifyCenter.notify(HttpStatus.MULTIPLE_CHOICES_300, -303, 2, (Object) null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: O */
    public void mo10743O(Context context, ts2 ts2Var) {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            momoSurface.m10941c1(context, ts2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: P */
    public void mo10744P() {
        m10730z0();
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: R */
    public void mo10745R(VideoQuality videoQuality) {
        m10734B0(videoQuality);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: a */
    public void mo10746a(ts2 ts2Var) {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            momoSurface.m10934Y(ts2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: b */
    public void mo10747b(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        String str;
        if (this.f11929f == null) {
            return;
        }
        try {
            parameters = this.f11929f.getParameters();
        } catch (RuntimeException unused) {
            parameters = null;
        }
        if (parameters == null) {
            return;
        }
        if (m10726u0(parameters)) {
            str = "auto";
        } else if (!m10727v0(parameters)) {
            return;
        } else {
            str = "continuous-video";
        }
        parameters.setFocusMode(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new Camera.Area(rect, 1000));
        arrayList2.add(new Camera.Area(rect, 1000));
        parameters.setFocusAreas(arrayList);
        if (parameters.getMaxNumMeteringAreas() > 0) {
            parameters.setMeteringAreas(arrayList2);
        }
        try {
            this.f11929f.setParameters(parameters);
            this.f11929f.autoFocus(autoFocusCallback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: c */
    public long mo10748c() {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            return momoSurface.m10952l0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: d */
    public long mo10749d() {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            return momoSurface.m10953m0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: e */
    public Camera mo10750e() {
        return this.f11929f;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: f */
    public int mo10751f() {
        return this.f11919P;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: g */
    public int mo10752g() {
        Camera.Parameters parameters = this.f11926c;
        if (parameters != null) {
            return parameters.getZoom();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: h */
    public long mo10753h() {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            return momoSurface.m10955o0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: i */
    public long mo10754i() {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            return momoSurface.m10956p0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: j */
    public long mo10755j() {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            return momoSurface.m10957q0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: k */
    public long mo10756k() {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            return momoSurface.m10958r0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: l */
    public int mo10757l() {
        Camera.Parameters parameters = this.f11926c;
        if (parameters != null) {
            return parameters.getMaxZoom() - 1;
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: m */
    public int mo10758m() {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            return momoSurface.m10964x0();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: n */
    public VideoQuality mo10759n() {
        n8c.c("VideoSource", "getVideoQuality: width" + this.f11937n.resX + ";heigh:" + this.f11937n.resY);
        return this.f11937n;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: o */
    public boolean mo10760o() {
        return this.f11934k == 1;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: p */
    public boolean mo10761p() {
        return true;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: q */
    public void mo10762q() {
        m10730z0();
        synchronized (this.f11932i) {
            try {
                Handler handler = this.f11921R;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.f11922S.quit();
                    this.f11922S = null;
                    this.f11921R = null;
                }
                mo10803M();
                this.f11907D = null;
                this.f11927d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public Camera.Size m10763q0(List<Camera.Size> list, int i) {
        Camera.Size size;
        if (list == null || list.size() == 0) {
            return null;
        }
        Camera.Size[] sizeArr = (Camera.Size[]) list.toArray(new Camera.Size[list.size()]);
        int i2 = 0;
        if ((i + 360) % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 90) {
            for (Camera.Size size2 : sizeArr) {
                int i3 = size2.width;
                size2.width = size2.height;
                size2.height = i3;
            }
        }
        Arrays.sort(sizeArr, new Comparator<Camera.Size>() { // from class: tv.danmaku.ijk.media.source.CameraSource.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Camera.Size size3, Camera.Size size4) {
                int i4 = size3.height;
                int i5 = size4.height;
                return i4 != i5 ? i4 - i5 : size3.width - size4.width;
            }
        });
        while (i2 < sizeArr.length) {
            n8c.c("VideoSource", "Support Preview Size: width:" + sizeArr[i2].width + ", height:" + sizeArr[i2].height);
            Camera.Size size3 = sizeArr[i2];
            if (size3.width >= this.f11945v && size3.height >= this.f11947x) {
                break;
            }
            i2++;
        }
        if (i2 != sizeArr.length) {
            size = sizeArr[i2];
            this.f11944u = this.f11945v;
            this.f11946w = this.f11947x;
        } else {
            n8c.c("VideoSource", "preferred preview size not in the preview size list");
            size = sizeArr[i2 - 1];
            int i4 = this.f11945v;
            int i5 = size.height;
            int i6 = i4 * i5;
            int i7 = this.f11947x;
            int i8 = size.width;
            if (i6 >= i7 * i8) {
                this.f11944u = i8;
                this.f11946w = (i7 * i8) / i4;
            } else {
                this.f11946w = i5;
                this.f11944u = (i4 * i5) / i7;
            }
        }
        if (i == 90 || i == 270) {
            int i9 = size.width;
            size.width = size.height;
            size.height = i9;
        }
        n8c.c("VideoSource", "preview size:" + size.width + "*" + size.height + "process Size" + this.f11944u + "*" + this.f11946w);
        return size;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: r */
    public synchronized void mo10764r(Activity activity, int i, MomoSurface momoSurface) {
        try {
            n8c.c("VideoSource", "selectCamera");
            this.f11908E = momoSurface;
            this.f11930g = momoSurface.m10962v0();
            this.f11927d = activity;
            this.f11934k = i;
            MomoSurface momoSurface2 = this.f11908E;
            if (momoSurface2 != null) {
                momoSurface2.m10918K0(i);
                MomoSurface momoSurface3 = this.f11908E;
                if (momoSurface3 != null) {
                    momoSurface3.m10921N0(new MomoSurface.FrameRateUpdateListener() { // from class: tv.danmaku.ijk.media.source.CameraSource.1
                    });
                }
            }
            synchronized (this.f11932i) {
                try {
                    mo10739G(this.f11931h);
                    m10723r0();
                    this.f11932i.wait(4000L);
                    NotifyCenter notifyCenter = this.f11928e;
                    if (notifyCenter != null) {
                        notifyCenter.setSourceSucess();
                    }
                } catch (InterruptedException unused) {
                    NotifyCenter notifyCenter2 = this.f11928e;
                    if (notifyCenter2 != null) {
                        notifyCenter2.notify(HttpStatus.MULTIPLE_CHOICES_300, -303, 2, (Object) null);
                    }
                    return;
                }
            }
            this.f11940q = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: s */
    public void mo10765s(Context context, ts2 ts2Var) {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            momoSurface.m10916H0(context, ts2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: t */
    public void mo10766t(Context context, ts2 ts2Var) {
        MomoSurface momoSurface = this.f11908E;
        if (momoSurface != null) {
            momoSurface.m10917I0(context, ts2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: u */
    public void mo10767u(boolean z) {
        this.f11914K = z;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: v */
    public void mo10768v(int i) {
        this.f11919P = i;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: w */
    public void mo10769w(boolean z) {
        this.f11909F = z;
    }

    /* JADX INFO: renamed from: w0 */
    public int[] m10770w0(Camera.Parameters parameters, final int i) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Collections.sort(supportedPreviewFpsRange, new Comparator<int[]>() { // from class: tv.danmaku.ijk.media.source.CameraSource.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(int[] iArr, int[] iArr2) {
                int iAbs = Math.abs(iArr[0] - i) + Math.abs(iArr[1] - i);
                int iAbs2 = Math.abs(iArr2[0] - i) + Math.abs(iArr2[1] - i);
                if (iAbs > iAbs2) {
                    return 1;
                }
                return iAbs < iAbs2 ? -1 : 0;
            }
        });
        int i2 = 0;
        while (i2 < supportedPreviewFpsRange.size() && supportedPreviewFpsRange.get(i2)[0] == supportedPreviewFpsRange.get(i2)[1]) {
            i2++;
        }
        if (i2 >= supportedPreviewFpsRange.size()) {
            i2 = 0;
        }
        return new int[]{supportedPreviewFpsRange.get(i2)[0], supportedPreviewFpsRange.get(i2)[1]};
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: x */
    public void mo10771x(int i) {
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: y */
    public void mo10772y(List<String> list) {
        this.f11918O = list;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: z */
    public void mo10773z(float f) {
        this.f11912I = f * 0.8f;
    }
}
