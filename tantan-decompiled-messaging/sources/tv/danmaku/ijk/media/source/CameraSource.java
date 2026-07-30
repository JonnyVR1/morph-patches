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
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.immomo.baseutil.Rotation;
import com.immomo.mediacore.strinf.NotifyCenter;
import com.immomo.mediacore.strinf.VideoQuality;
import com.momocv.videoprocessor.VideoProcessor;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p149l.mkw;
import p149l.n8c;
import p149l.pjw;
import p149l.ts2;
import p149l.vjw;
import tv.danmaku.ijk.media.streamer.MomoSurface;
import tv.danmaku.ijk.media.streamer.Util;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;
import tv.danmaku.ijk.media.util.CameraUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CameraSource extends SourceBase {

    /* JADX INFO: renamed from: A */
    private boolean f208279A;

    /* JADX INFO: renamed from: B */
    private boolean f208280B;

    /* JADX INFO: renamed from: C */
    private final int f208281C;

    /* JADX INFO: renamed from: D */
    private ijkMediaStreamer.OnVideoPreviewSizeSetListener f208282D;

    /* JADX INFO: renamed from: E */
    private MomoSurface f208283E;

    /* JADX INFO: renamed from: F */
    private boolean f208284F;

    /* JADX INFO: renamed from: G */
    private int f208285G;

    /* JADX INFO: renamed from: H */
    private float f208286H;

    /* JADX INFO: renamed from: I */
    private float f208287I;

    /* JADX INFO: renamed from: J */
    private boolean f208288J;

    /* JADX INFO: renamed from: K */
    private boolean f208289K;

    /* JADX INFO: renamed from: L */
    private VideoProcessor f208290L;

    /* JADX INFO: renamed from: M */
    private vjw f208291M;

    /* JADX INFO: renamed from: N */
    private mkw f208292N;

    /* JADX INFO: renamed from: O */
    private List<String> f208293O;

    /* JADX INFO: renamed from: P */
    private int f208294P;

    /* JADX INFO: renamed from: Q */
    private long f208295Q;

    /* JADX INFO: renamed from: R */
    private Handler f208296R;

    /* JADX INFO: renamed from: S */
    private HandlerThread f208297S;

    /* JADX INFO: renamed from: T */
    final Camera.PreviewCallback f208298T;

    /* JADX INFO: renamed from: d */
    private Activity f208302d;

    /* JADX INFO: renamed from: e */
    private NotifyCenter f208303e;

    /* JADX INFO: renamed from: f */
    private volatile Camera f208304f;

    /* JADX INFO: renamed from: m */
    protected VideoQuality f208311m;

    /* JADX INFO: renamed from: n */
    protected VideoQuality f208312n;

    /* JADX INFO: renamed from: o */
    private boolean f208313o;

    /* JADX INFO: renamed from: p */
    int f208314p;

    /* JADX INFO: renamed from: q */
    private boolean f208315q;

    /* JADX INFO: renamed from: r */
    private int f208316r;

    /* JADX INFO: renamed from: s */
    int f208317s;

    /* JADX INFO: renamed from: t */
    int f208318t;

    /* JADX INFO: renamed from: u */
    private int f208319u;

    /* JADX INFO: renamed from: v */
    int f208320v;

    /* JADX INFO: renamed from: w */
    private int f208321w;

    /* JADX INFO: renamed from: x */
    int f208322x;

    /* JADX INFO: renamed from: y */
    public int f208323y;

    /* JADX INFO: renamed from: z */
    public int f208324z;

    /* JADX INFO: renamed from: a */
    protected int f208299a = 0;

    /* JADX INFO: renamed from: b */
    protected int f208300b = 0;

    /* JADX INFO: renamed from: c */
    Camera.Parameters f208301c = null;

    /* JADX INFO: renamed from: g */
    SurfaceTexture f208305g = null;

    /* JADX INFO: renamed from: h */
    private int f208306h = 1;

    /* JADX INFO: renamed from: i */
    private Object f208307i = new Object();

    /* JADX INFO: renamed from: j */
    int f208308j = 0;

    /* JADX INFO: renamed from: k */
    int f208309k = 1;

    /* JADX INFO: renamed from: l */
    private int f208310l = 25;

    public interface OnCameraErrorListener {
    }

    public CameraSource(Activity activity, NotifyCenter notifyCenter) {
        this.f208303e = null;
        VideoQuality videoQualityM223811clone = VideoQuality.DEFAULT_VIDEO_QUALITY.m223811clone();
        this.f208311m = videoQualityM223811clone;
        this.f208312n = videoQualityM223811clone.m223811clone();
        this.f208313o = false;
        this.f208314p = 1;
        this.f208315q = false;
        this.f208316r = 1;
        this.f208317s = 0;
        this.f208318t = 0;
        this.f208319u = 480;
        this.f208320v = 480;
        this.f208321w = 640;
        this.f208322x = 640;
        this.f208323y = 480;
        this.f208324z = 640;
        this.f208279A = false;
        this.f208280B = false;
        this.f208281C = 10;
        this.f208285G = 9;
        this.f208288J = true;
        this.f208291M = new vjw();
        this.f208292N = new mkw(1);
        this.f208293O = null;
        this.f208294P = 1;
        this.f208295Q = 0L;
        this.f208296R = null;
        this.f208297S = null;
        this.f208298T = new Camera.PreviewCallback() { // from class: tv.danmaku.ijk.media.source.CameraSource.4
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(final byte[] bArr, Camera camera) {
                n8c.m158485c("VideoSource", "onPreviewFrame callback invoke:");
                long jCurrentTimeMillis = System.currentTimeMillis() - CameraSource.this.f208295Q;
                CameraSource cameraSource = CameraSource.this;
                if (jCurrentTimeMillis >= 1000 / ((long) (cameraSource.f208312n.framerate + 5))) {
                    cameraSource.f208295Q = System.currentTimeMillis();
                    CameraSource.this.f208296R.post(new Runnable() { // from class: tv.danmaku.ijk.media.source.CameraSource.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (CameraSource.this.f208307i) {
                                try {
                                    if (CameraSource.this.f208304f != null && bArr != null) {
                                        n8c.m158485c("VideoSource", "onPreviewFrame mDofaceDetect:" + CameraSource.this.f208284F);
                                        pjw pjwVar = new pjw();
                                        boolean z = CameraSource.this.f208284F;
                                        C224944 c224944 = C224944.this;
                                        if (z) {
                                            CameraSource.this.f208291M.m198695h(17);
                                            CameraSource.this.f208291M.m198700m(CameraSource.this.f208323y);
                                            CameraSource.this.f208291M.m198697j(CameraSource.this.f208324z);
                                            CameraSource.this.f208291M.m198694g(ByteBuffer.wrap(bArr).array());
                                            CameraSource.this.f208291M.m198693f(bArr.length);
                                            CameraSource.this.f208291M.m198699l(CameraSource.this.f208323y);
                                            CameraSource.this.f208292N.m155066A(CameraSource.this.f208318t * 90);
                                            CameraSource.this.f208292N.m155104z(CameraSource.this.f208318t * 90);
                                            CameraSource.this.f208292N.m155094p(CameraSource.this.f208279A);
                                            CameraSource.this.f208292N.m155089k(false);
                                            CameraSource.this.f208292N.m155087i(true);
                                            CameraSource.this.f208292N.m155090l(CameraSource.this.f208289K);
                                            CameraSource.this.f208292N.m155071F(true);
                                            CameraSource.this.f208292N.m155078M(CameraSource.this.f208285G);
                                            CameraSource.this.f208292N.m155076K(CameraSource.this.f208286H);
                                            CameraSource.this.f208292N.m155077L(CameraSource.this.f208287I);
                                            CameraSource.this.f208292N.m155072G(CameraSource.this.f208288J);
                                            CameraSource.this.f208292N.m155086h(true);
                                            if (CameraSource.this.f208290L == null && CameraSource.this.f208293O != null) {
                                                CameraSource.this.f208290L = new VideoProcessor();
                                                if (CameraSource.this.f208293O.size() >= 2) {
                                                    CameraSource.this.f208290L.LoadModel((String) CameraSource.this.f208293O.get(0), (String) CameraSource.this.f208293O.get(1));
                                                }
                                            }
                                            if (CameraSource.this.f208290L != null) {
                                                CameraSource.this.f208290L.ProcessFrame(CameraSource.this.f208291M.m198689b(), CameraSource.this.f208292N.m155084f(), pjwVar.f149904k);
                                                pjwVar.m169941b(CameraSource.this.f208285G);
                                            }
                                            CameraSource.this.m222227C0(pjwVar, bArr);
                                        } else {
                                            CameraSource.this.m222227C0(pjwVar, bArr);
                                        }
                                        return;
                                    }
                                    n8c.m158485c("VideoSource", "onPreviewFrame return");
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                } else if (cameraSource.f208304f != null) {
                    CameraSource.this.f208304f.addCallbackBuffer(bArr);
                }
            }
        };
        this.f208302d = activity;
        this.f208303e = notifyCenter;
        this.f208295Q = 0L;
        if (this.f208297S == null) {
            HandlerThread handlerThread = new HandlerThread("ijkStrMonitor");
            this.f208297S = handlerThread;
            handlerThread.start();
            this.f208296R = new Handler(this.f208297S.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m222227C0(pjw pjwVar, byte[] bArr) {
        pjwVar.m169962z(this.f208279A);
        pjwVar.m169959w(this.f208318t * 90);
        pjwVar.m169937C(this.f208318t * 90);
        pjwVar.m169961y(bArr);
        pjwVar.m169939E(this.f208323y);
        pjwVar.m169935A(this.f208324z);
        this.f208283E.m222480j1(this.f208304f, bArr, this.f208323y, this.f208324z, pjwVar);
        if (this.f208304f != null) {
            this.f208304f.addCallbackBuffer(bArr);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m222252r0() {
        new AsyncTask<String, Integer, Boolean>() { // from class: tv.danmaku.ijk.media.source.CameraSource.5
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                n8c.m158485c("VideoSource", "initCamera doInBackground");
                boolean zM222257x0 = CameraSource.this.m222257x0();
                for (int i = 0; !zM222257x0 && i < 2; i++) {
                    try {
                        Thread.sleep(2000L);
                        n8c.m158485c("VideoSource", "camera dealay creat");
                    } catch (InterruptedException unused) {
                    }
                    zM222257x0 = CameraSource.this.m222257x0();
                }
                if (!CameraSource.this.f208313o) {
                    CameraSource.this.f208313o = true;
                }
                CameraSource.this.m222253s0();
                CameraSource.this.m222258y0();
                synchronized (CameraSource.this.f208307i) {
                    CameraSource.this.f208307i.notifyAll();
                }
                return Boolean.valueOf(zM222257x0);
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                if (!bool.booleanValue() || CameraSource.this.f208304f == null) {
                    n8c.m158485c("VideoSource", "无法连接到相机");
                } else if (CameraSource.this.f208303e != null) {
                    CameraSource.this.f208303e.setSourceSucess();
                }
            }
        }.execute("start");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m222253s0() {
        NotifyCenter notifyCenter;
        n8c.m158485c("VideoSource", "initCameraPara ");
        if (this.f208304f == null) {
            n8c.m158485c("VideoSource", "mCamera == null");
            return;
        }
        try {
            List<Camera.Size> listM222796a = Util.m222796a(this.f208304f);
            Camera.Size sizeM222292q0 = (listM222796a == null || listM222796a.size() <= 0) ? null : m222292q0(listM222796a, this.f208317s);
            Camera.Size previewSize = this.f208301c.getPreviewSize();
            boolean z = m222254t0() && this.f208309k == 1;
            if (sizeM222292q0 == null || z) {
                this.f208323y = previewSize.width;
                this.f208324z = previewSize.height;
            } else {
                int i = sizeM222292q0.width;
                this.f208323y = i;
                int i2 = sizeM222292q0.height;
                this.f208324z = i2;
                if (i == 0 || i2 == 0) {
                    this.f208323y = previewSize.width;
                    this.f208324z = previewSize.height;
                }
            }
            this.f208301c.setPictureFormat(256);
            this.f208301c.setPreviewSize(this.f208323y, this.f208324z);
            n8c.m158485c("VideoSource", "mCamera.setParameters frameRate " + this.f208312n.framerate);
            VideoQuality videoQuality = this.f208312n;
            int i3 = videoQuality.framerate;
            if (i3 > 25 || i3 <= 0) {
                videoQuality.framerate = 25;
            }
            int[] iArrM222299w0 = m222299w0(this.f208301c, 30);
            this.f208301c.setPreviewFpsRange(iArrM222299w0[0], iArrM222299w0[1]);
            this.f208301c.setPreviewFrameRate(this.f208312n.framerate);
            n8c.m158485c("VideoSource", "mCamera.getPreviewFrameRate " + this.f208301c.getPreviewFrameRate());
            this.f208301c.setPreviewFormat(17);
            this.f208301c.setAntibanding("auto");
            this.f208301c.setWhiteBalance("auto");
            this.f208304f.setParameters(this.f208301c);
        } catch (RuntimeException unused) {
            n8c.m158485c("VideoSource", "mCamera.setParameters fail");
            if (m222257x0()) {
                this.f208301c = this.f208304f.getParameters();
            } else {
                NotifyCenter notifyCenter2 = this.f208303e;
                if (notifyCenter2 != null) {
                    notifyCenter2.notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 2, null);
                    return;
                }
            }
            Camera.Parameters parameters = this.f208301c;
            if (parameters == null && (notifyCenter = this.f208303e) != null) {
                notifyCenter.notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 2, null);
                return;
            } else {
                Camera.Size previewSize2 = parameters.getPreviewSize();
                this.f208323y = previewSize2.width;
                this.f208324z = previewSize2.height;
            }
        }
        m222261A0();
    }

    /* JADX INFO: renamed from: t0 */
    private boolean m222254t0() {
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
    private boolean m222255u0(Camera.Parameters parameters) {
        Iterator<String> it = parameters.getSupportedFocusModes().iterator();
        while (it.hasNext()) {
            if (it.next().equals("auto")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    private boolean m222256v0(Camera.Parameters parameters) {
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
    public boolean m222257x0() {
        int i;
        try {
            this.f208314p = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i2 = 0;
            while (true) {
                i = this.f208314p;
                if (i2 >= i) {
                    break;
                }
                Camera.getCameraInfo(i2, cameraInfo);
                int i3 = cameraInfo.facing;
                if (i3 == this.f208309k) {
                    this.f208308j = i2;
                    if (i3 == 1) {
                        this.f208316r = 1;
                    } else {
                        this.f208316r = 0;
                    }
                }
                i2++;
            }
            if (i == 1) {
                this.f208308j = 0;
                this.f208316r = 0;
            }
            m222259z0();
            if (this.f208304f != null) {
                this.f208304f.setPreviewCallback(null);
                this.f208304f.setPreviewCallbackWithBuffer(null);
                this.f208304f.release();
                this.f208304f = null;
            }
            int i4 = this.f208308j;
            if (i4 >= 0) {
                this.f208304f = Camera.open(i4);
            } else {
                this.f208304f = Camera.open();
            }
            if (this.f208304f == null) {
                return false;
            }
            this.f208317s = CameraUtils.m222861a(this.f208302d, this.f208308j);
            n8c.m158485c("VideoSource", "determineDisplayOrientation displayOrientation:" + this.f208317s + ";defaultCameraId " + this.f208308j + ";numberOfCameras:" + this.f208314p + ";mCameraSelection:" + this.f208309k + ";frontCamera:" + this.f208316r);
            Rotation rotation = Rotation.NORMAL;
            int i5 = this.f208317s;
            if (i5 == 90) {
                rotation = Rotation.ROTATION_90;
            } else if (i5 == 180) {
                rotation = Rotation.ROTATION_180;
            } else if (i5 == 270) {
                rotation = Rotation.ROTATION_270;
            }
            this.f208318t = this.f208316r == 1 ? (this.f208299a + rotation.ordinal()) % (Rotation.ROTATION_270.ordinal() + 1) : (this.f208300b + rotation.ordinal()) % (Rotation.ROTATION_270.ordinal() + 1);
            this.f208301c = this.f208304f.getParameters();
            this.f208304f.setDisplayOrientation(this.f208317s);
            List<String> supportedFocusModes = this.f208301c.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                String str = Build.MODEL;
                n8c.m158487e("video", str);
                if ((str.startsWith("GT-I950") || str.endsWith("SCH-I959") || str.endsWith("MEIZU MX3")) && supportedFocusModes.contains("continuous-picture")) {
                    this.f208301c.setFocusMode("continuous-picture");
                    n8c.m158485c("VideoSource", "FOCUS_MODE_CONTINUOUS_PICTURE");
                } else if (supportedFocusModes.contains("continuous-video")) {
                    n8c.m158485c("VideoSource", "FOCUS_MODE_CONTINUOUS_VIDEO");
                    this.f208301c.setFocusMode("continuous-video");
                } else {
                    this.f208301c.setFocusMode("fixed");
                    n8c.m158485c("VideoSource", "FOCUS_MODE_FIXED");
                }
            }
            this.f208301c.setWhiteBalance("auto");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public void m222258y0() {
        if (this.f208280B || this.f208304f == null) {
            return;
        }
        this.f208280B = true;
        n8c.m158485c("VideoSource", "startPreview cameraSurface:" + this.f208305g);
        if (this.f208305g == null) {
            return;
        }
        try {
            this.f208304f.setPreviewTexture(this.f208305g);
            this.f208304f.startPreview();
            int i = 0;
            while (true) {
                Camera camera = this.f208304f;
                if (i >= 10) {
                    camera.setPreviewCallbackWithBuffer(this.f208298T);
                    n8c.m158485c("VideoSource", "mCamera.setPreviewTexture");
                    return;
                }
                camera.addCallbackBuffer(new byte[((this.f208323y * this.f208324z) * 3) / 2]);
                n8c.m158485c("VideoSource", "mCamera.addCallbackBuffer size:" + (((this.f208323y * this.f208324z) * 3) / 2));
                i++;
            }
        } catch (Exception unused) {
            n8c.m158485c("VideoSource", "mCamera startPreview fail");
        }
    }

    /* JADX INFO: renamed from: z0 */
    private void m222259z0() {
        synchronized (this.f208307i) {
            try {
                try {
                    if (this.f208304f != null) {
                        this.f208304f.setPreviewCallback(null);
                        this.f208304f.setPreviewCallbackWithBuffer(null);
                    }
                    if (this.f208304f != null) {
                        this.f208304f.stopPreview();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (this.f208304f != null) {
                    this.f208304f.release();
                    this.f208304f = null;
                }
                this.f208280B = false;
                this.f208315q = false;
                VideoProcessor videoProcessor = this.f208290L;
                if (videoProcessor != null) {
                    videoProcessor.Release();
                    this.f208290L = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: A */
    public void mo222260A(float f) {
        this.f208286H = f * 0.5f;
    }

    /* JADX INFO: renamed from: A0 */
    public void m222261A0() {
        float f = this.f208303e.getPreviewScale().x;
        float f2 = this.f208303e.getPreviewScale().y;
        float f3 = f2 / f;
        int i = this.f208324z;
        int i2 = this.f208323y;
        float f4 = i / i2;
        VideoQuality videoQuality = this.f208312n;
        if (f3 <= f4) {
            videoQuality.resY = i2;
            videoQuality.resX = ((int) (((i2 * f2) / f) / 16.0f)) * 16;
        } else {
            videoQuality.resX = i;
            videoQuality.resY = ((int) (((i * f) / f2) / 16.0f)) * 16;
        }
        VideoQuality videoQuality2 = this.f208312n;
        videoQuality2.resX = (int) (((double) videoQuality2.resX) * 1.0d * ((double) this.f208303e.getPreviewZoom()));
        VideoQuality videoQuality3 = this.f208312n;
        videoQuality3.resY = (int) (((double) videoQuality3.resY) * 1.0d * ((double) this.f208303e.getPreviewZoom()));
        n8c.m158485c("VideoSource", "----previewWidth:" + this.f208323y + ";previewHeight" + this.f208324z + ";mVideoQuality.resX" + this.f208312n.resX + ";mVideoQuality.resY" + this.f208312n.resY + Constants.SEPARATOR_COMMA + this.f208294P);
        VideoQuality videoQuality4 = this.f208312n;
        if (videoQuality4.resX < 176) {
            videoQuality4.resX = 176;
        }
        if (videoQuality4.resY < 176) {
            videoQuality4.resY = 176;
        }
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            if (this.f208309k == 1) {
                this.f208279A = true;
            } else {
                this.f208279A = false;
            }
            if (this.f208314p == 1) {
                this.f208279A = false;
            }
            int i3 = this.f208294P;
            if (i3 == 2) {
                momoSurface.m222473e1(this.f208323y, this.f208324z, this.f208279A, this.f208318t * 90, i3, 0, videoQuality4.resX, videoQuality4.resY);
                VideoQuality videoQuality5 = this.f208312n;
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
                momoSurface.m222473e1(this.f208323y, this.f208324z, this.f208279A, this.f208318t * 90, i3, 0, videoQuality4.resX, videoQuality4.resY);
            }
            n8c.m158485c("VideoSource", "updateResolution call setVideoQuality():" + this.f208312n.resX + Constants.SEPARATOR_COMMA + this.f208312n.resY);
            this.f208283E.m222464Y0(this.f208312n);
        }
        NotifyCenter notifyCenter = this.f208303e;
        if (notifyCenter != null) {
            notifyCenter.notifyUpdateResolution();
        }
        ijkMediaStreamer.OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener = this.f208282D;
        if (onVideoPreviewSizeSetListener != null) {
            VideoQuality videoQuality6 = this.f208312n;
            onVideoPreviewSizeSetListener.m222835a(videoQuality6.resX, videoQuality6.resY);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: B */
    public void mo222262B(int i, int i2) {
        this.f208320v = i;
        this.f208322x = i2;
        this.f208319u = i;
        this.f208321w = i2;
    }

    /* JADX INFO: renamed from: B0 */
    public void m222263B0(VideoQuality videoQuality) {
        if (videoQuality == null || videoQuality.resX == 0 || videoQuality.resY == 0) {
            return;
        }
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            momoSurface.m222464Y0(videoQuality);
        }
        NotifyCenter notifyCenter = this.f208303e;
        if (notifyCenter != null) {
            notifyCenter.notifyUpdateResolution();
            this.f208303e.notifyResumeRecording();
        }
        n8c.m158485c("VideoSource", "updateVideoVideoQuality:" + this.f208312n.resX + Constants.SEPARATOR_COMMA + this.f208312n.resY);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: C */
    public void mo222264C(Object obj) {
        this.f208282D = (ijkMediaStreamer.OnVideoPreviewSizeSetListener) obj;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: D */
    public void mo222265D(float f) {
        m222261A0();
        mo222266E(0, 1);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: E */
    public void mo222266E(int i, int i2) {
        NotifyCenter notifyCenter = this.f208303e;
        if (notifyCenter == null) {
            return;
        }
        if (notifyCenter.getStreamerCaptureType(i) == i2) {
            n8c.m158485c("VideoSource", "----setStreamerCaptureType repeat, captureType=" + i2 + ", uid=" + i);
            return;
        }
        n8c.m158485c("VideoSource", "----setStreamerCaptureType, captureType=" + i2 + ", uid=" + i);
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            momoSurface.m222477h0(0.0f, 0.0f, 0.0f, 1.0f, true);
        }
        this.f208303e.setStreamerCaptureType(i, i2);
        if (this.f208283E != null) {
            int streamerCaptureType = this.f208303e.getStreamerCaptureType(i);
            NotifyCenter notifyCenter2 = this.f208303e;
            if (streamerCaptureType == 1) {
                this.f208294P = notifyCenter2.getStreamerCaptureType(i);
                this.f208283E.m222477h0(0.0f, 0.0f, 0.0f, 1.0f, false);
                VideoQuality videoQuality = this.f208312n;
                int i3 = videoQuality.resX;
                int i4 = videoQuality.resY;
                if (i3 > i4) {
                    videoQuality.resY = i3;
                    videoQuality.resX = i4;
                }
                this.f208283E.m222473e1(this.f208323y, this.f208324z, this.f208279A, this.f208318t * 90, this.f208294P, i, videoQuality.resX, videoQuality.resY);
            } else {
                this.f208294P = notifyCenter2.getStreamerCaptureType(i);
                this.f208283E.m222477h0(0.0f, 0.0f, 0.0f, 1.0f, false);
                MomoSurface momoSurface2 = this.f208283E;
                int i5 = this.f208323y;
                int i6 = this.f208324z;
                boolean z = this.f208279A;
                int i7 = this.f208318t * 90;
                int i8 = this.f208294P;
                VideoQuality videoQuality2 = this.f208312n;
                momoSurface2.m222473e1(i5, i6, z, i7, i8, i, videoQuality2.resX, videoQuality2.resY);
                VideoQuality videoQuality3 = this.f208312n;
                int i9 = videoQuality3.resY;
                int i10 = videoQuality3.resX;
                if (i9 > i10) {
                    videoQuality3.resY = i10;
                    videoQuality3.resX = i9;
                }
            }
            this.f208283E.m222464Y0(this.f208312n);
        }
        this.f208303e.notifyUpdateResolution();
        ijkMediaStreamer.OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener = this.f208282D;
        if (onVideoPreviewSizeSetListener != null) {
            VideoQuality videoQuality4 = this.f208312n;
            onVideoPreviewSizeSetListener.m222835a(videoQuality4.resX, videoQuality4.resY);
        }
        this.f208303e.notifyResumeRecording();
        n8c.m158485c("VideoSource", "----setStreamerCaptureType, mCurrentScreenOrient=" + this.f208294P + com.meituan.robust.Constants.PACKNAME_END + this.f208312n.resX + Constants.SEPARATOR_COMMA + this.f208312n.resY);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: F */
    public void mo222267F(int i) {
        this.f208312n.framerate = i;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: G */
    public void mo222268G(int i) {
        if (this.f208315q) {
            return;
        }
        this.f208306h = i;
        n8c.m158485c("VideoSource", "setVideoResolution:" + i);
        int i2 = this.f208306h;
        if (i2 == 2) {
            VideoQuality videoQuality = this.f208312n;
            videoQuality.resX = 384;
            videoQuality.resY = 720;
        } else if (i2 == 3) {
            VideoQuality videoQuality2 = this.f208312n;
            videoQuality2.resX = 720;
            videoQuality2.resY = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        } else if (i2 == 1) {
            VideoQuality videoQuality3 = this.f208312n;
            videoQuality3.resX = 352;
            videoQuality3.resY = 640;
        } else {
            VideoQuality videoQuality4 = this.f208312n;
            if (i2 == 5) {
                videoQuality4.resX = 528;
                videoQuality4.resY = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            } else {
                videoQuality4.resX = 180;
                videoQuality4.resY = 320;
            }
        }
        if (this.f208283E != null) {
            n8c.m158485c("VideoSource", "setVideoResolution call setVideoQuality():" + this.f208312n.resX + Constants.SEPARATOR_COMMA + this.f208312n.resY);
            this.f208283E.m222464Y0(this.f208312n);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: H */
    public void mo222269H(int i) {
        this.f208285G = i;
        if (i < 5 || i > 8) {
            return;
        }
        this.f208288J = true;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: I */
    public void mo222270I(int i) {
        if (this.f208301c == null || this.f208304f == null) {
            return;
        }
        try {
            if (i >= this.f208301c.getMaxZoom()) {
                i = 0;
            }
            if (this.f208301c.isSmoothZoomSupported()) {
                this.f208304f.startSmoothZoom(i);
            } else if (this.f208301c.isZoomSupported()) {
                this.f208301c.setZoom(i);
                this.f208304f.setParameters(this.f208301c);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: N */
    public void mo222271N() {
        this.f208309k = this.f208309k == 0 ? 1 : 0;
        n8c.m158485c("VideoSource", BLiveButtonType.switchCamera);
        synchronized (this.f208307i) {
            try {
                try {
                    MomoSurface momoSurface = this.f208283E;
                    if (momoSurface != null) {
                        momoSurface.m222447K0(this.f208309k);
                    }
                    mo222268G(this.f208306h);
                    m222252r0();
                    this.f208307i.wait(4000L);
                    n8c.m158485c("VideoSource", "switchCamera end");
                } catch (Exception unused) {
                    NotifyCenter notifyCenter = this.f208303e;
                    if (notifyCenter != null) {
                        notifyCenter.notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 2, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: O */
    public void mo222272O(Context context, ts2 ts2Var) {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            momoSurface.m222470c1(context, ts2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: P */
    public void mo222273P() {
        m222259z0();
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: R */
    public void mo222274R(VideoQuality videoQuality) {
        m222263B0(videoQuality);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: a */
    public void mo222275a(ts2 ts2Var) {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            momoSurface.m222463Y(ts2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: b */
    public void mo222276b(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        String str;
        if (this.f208304f == null) {
            return;
        }
        try {
            parameters = this.f208304f.getParameters();
        } catch (RuntimeException unused) {
            parameters = null;
        }
        if (parameters == null) {
            return;
        }
        if (m222255u0(parameters)) {
            str = "auto";
        } else if (!m222256v0(parameters)) {
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
            this.f208304f.setParameters(parameters);
            this.f208304f.autoFocus(autoFocusCallback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: c */
    public long mo222277c() {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            return momoSurface.m222481l0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: d */
    public long mo222278d() {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            return momoSurface.m222482m0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: e */
    public Camera mo222279e() {
        return this.f208304f;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: f */
    public int mo222280f() {
        return this.f208294P;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: g */
    public int mo222281g() {
        Camera.Parameters parameters = this.f208301c;
        if (parameters != null) {
            return parameters.getZoom();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: h */
    public long mo222282h() {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            return momoSurface.m222484o0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: i */
    public long mo222283i() {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            return momoSurface.m222485p0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: j */
    public long mo222284j() {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            return momoSurface.m222486q0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: k */
    public long mo222285k() {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            return momoSurface.m222487r0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: l */
    public int mo222286l() {
        Camera.Parameters parameters = this.f208301c;
        if (parameters != null) {
            return parameters.getMaxZoom() - 1;
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: m */
    public int mo222287m() {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            return momoSurface.m222493x0();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: n */
    public VideoQuality mo222288n() {
        n8c.m158485c("VideoSource", "getVideoQuality: width" + this.f208312n.resX + ";heigh:" + this.f208312n.resY);
        return this.f208312n;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: o */
    public boolean mo222289o() {
        return this.f208309k == 1;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: p */
    public boolean mo222290p() {
        return true;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: q */
    public void mo222291q() {
        m222259z0();
        synchronized (this.f208307i) {
            try {
                Handler handler = this.f208296R;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.f208297S.quit();
                    this.f208297S = null;
                    this.f208296R = null;
                }
                mo222332M();
                this.f208282D = null;
                this.f208302d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public Camera.Size m222292q0(List<Camera.Size> list, int i) {
        Camera.Size size;
        if (list == null || list.size() == 0) {
            return null;
        }
        Camera.Size[] sizeArr = (Camera.Size[]) list.toArray(new Camera.Size[list.size()]);
        int i2 = 0;
        if ((i + 360) % 180 == 90) {
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
            n8c.m158485c("VideoSource", "Support Preview Size: width:" + sizeArr[i2].width + ", height:" + sizeArr[i2].height);
            Camera.Size size3 = sizeArr[i2];
            if (size3.width >= this.f208320v && size3.height >= this.f208322x) {
                break;
            }
            i2++;
        }
        if (i2 != sizeArr.length) {
            size = sizeArr[i2];
            this.f208319u = this.f208320v;
            this.f208321w = this.f208322x;
        } else {
            n8c.m158485c("VideoSource", "preferred preview size not in the preview size list");
            size = sizeArr[i2 - 1];
            int i4 = this.f208320v;
            int i5 = size.height;
            int i6 = i4 * i5;
            int i7 = this.f208322x;
            int i8 = size.width;
            if (i6 >= i7 * i8) {
                this.f208319u = i8;
                this.f208321w = (i7 * i8) / i4;
            } else {
                this.f208321w = i5;
                this.f208319u = (i4 * i5) / i7;
            }
        }
        if (i == 90 || i == 270) {
            int i9 = size.width;
            size.width = size.height;
            size.height = i9;
        }
        n8c.m158485c("VideoSource", "preview size:" + size.width + "*" + size.height + "process Size" + this.f208319u + "*" + this.f208321w);
        return size;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: r */
    public synchronized void mo222293r(Activity activity, int i, MomoSurface momoSurface) {
        try {
            n8c.m158485c("VideoSource", "selectCamera");
            this.f208283E = momoSurface;
            this.f208305g = momoSurface.m222491v0();
            this.f208302d = activity;
            this.f208309k = i;
            MomoSurface momoSurface2 = this.f208283E;
            if (momoSurface2 != null) {
                momoSurface2.m222447K0(i);
                MomoSurface momoSurface3 = this.f208283E;
                if (momoSurface3 != null) {
                    momoSurface3.m222450N0(new MomoSurface.FrameRateUpdateListener() { // from class: tv.danmaku.ijk.media.source.CameraSource.1
                    });
                }
            }
            synchronized (this.f208307i) {
                try {
                    mo222268G(this.f208306h);
                    m222252r0();
                    this.f208307i.wait(4000L);
                    NotifyCenter notifyCenter = this.f208303e;
                    if (notifyCenter != null) {
                        notifyCenter.setSourceSucess();
                    }
                } catch (InterruptedException unused) {
                    NotifyCenter notifyCenter2 = this.f208303e;
                    if (notifyCenter2 != null) {
                        notifyCenter2.notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 2, null);
                    }
                    return;
                }
            }
            this.f208315q = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: s */
    public void mo222294s(Context context, ts2 ts2Var) {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            momoSurface.m222445H0(context, ts2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: t */
    public void mo222295t(Context context, ts2 ts2Var) {
        MomoSurface momoSurface = this.f208283E;
        if (momoSurface != null) {
            momoSurface.m222446I0(context, ts2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: u */
    public void mo222296u(boolean z) {
        this.f208289K = z;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: v */
    public void mo222297v(int i) {
        this.f208294P = i;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: w */
    public void mo222298w(boolean z) {
        this.f208284F = z;
    }

    /* JADX INFO: renamed from: w0 */
    public int[] m222299w0(Camera.Parameters parameters, final int i) {
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
    public void mo222300x(int i) {
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: y */
    public void mo222301y(List<String> list) {
        this.f208293O = list;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: z */
    public void mo222302z(float f) {
        this.f208287I = f * 0.8f;
    }
}
