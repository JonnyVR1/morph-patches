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
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p153l.jt2;
import p153l.lnw;
import p153l.omw;
import p153l.t9c;
import p153l.umw;
import tv.danmaku.ijk.media.streamer.MomoSurface;
import tv.danmaku.ijk.media.streamer.Util;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;
import tv.danmaku.ijk.media.util.CameraUtils;

/* JADX INFO: loaded from: classes3.dex */
public class CameraSource extends SourceBase {

    /* JADX INFO: renamed from: A */
    private boolean f209201A;

    /* JADX INFO: renamed from: B */
    private boolean f209202B;

    /* JADX INFO: renamed from: C */
    private final int f209203C;

    /* JADX INFO: renamed from: D */
    private ijkMediaStreamer.OnVideoPreviewSizeSetListener f209204D;

    /* JADX INFO: renamed from: E */
    private MomoSurface f209205E;

    /* JADX INFO: renamed from: F */
    private boolean f209206F;

    /* JADX INFO: renamed from: G */
    private int f209207G;

    /* JADX INFO: renamed from: H */
    private float f209208H;

    /* JADX INFO: renamed from: I */
    private float f209209I;

    /* JADX INFO: renamed from: J */
    private boolean f209210J;

    /* JADX INFO: renamed from: K */
    private boolean f209211K;

    /* JADX INFO: renamed from: L */
    private VideoProcessor f209212L;

    /* JADX INFO: renamed from: M */
    private umw f209213M;

    /* JADX INFO: renamed from: N */
    private lnw f209214N;

    /* JADX INFO: renamed from: O */
    private List<String> f209215O;

    /* JADX INFO: renamed from: P */
    private int f209216P;

    /* JADX INFO: renamed from: Q */
    private long f209217Q;

    /* JADX INFO: renamed from: R */
    private Handler f209218R;

    /* JADX INFO: renamed from: S */
    private HandlerThread f209219S;

    /* JADX INFO: renamed from: T */
    final Camera.PreviewCallback f209220T;

    /* JADX INFO: renamed from: d */
    private Activity f209224d;

    /* JADX INFO: renamed from: e */
    private NotifyCenter f209225e;

    /* JADX INFO: renamed from: f */
    private volatile Camera f209226f;

    /* JADX INFO: renamed from: m */
    protected VideoQuality f209233m;

    /* JADX INFO: renamed from: n */
    protected VideoQuality f209234n;

    /* JADX INFO: renamed from: o */
    private boolean f209235o;

    /* JADX INFO: renamed from: p */
    int f209236p;

    /* JADX INFO: renamed from: q */
    private boolean f209237q;

    /* JADX INFO: renamed from: r */
    private int f209238r;

    /* JADX INFO: renamed from: s */
    int f209239s;

    /* JADX INFO: renamed from: t */
    int f209240t;

    /* JADX INFO: renamed from: u */
    private int f209241u;

    /* JADX INFO: renamed from: v */
    int f209242v;

    /* JADX INFO: renamed from: w */
    private int f209243w;

    /* JADX INFO: renamed from: x */
    int f209244x;

    /* JADX INFO: renamed from: y */
    public int f209245y;

    /* JADX INFO: renamed from: z */
    public int f209246z;

    /* JADX INFO: renamed from: a */
    protected int f209221a = 0;

    /* JADX INFO: renamed from: b */
    protected int f209222b = 0;

    /* JADX INFO: renamed from: c */
    Camera.Parameters f209223c = null;

    /* JADX INFO: renamed from: g */
    SurfaceTexture f209227g = null;

    /* JADX INFO: renamed from: h */
    private int f209228h = 1;

    /* JADX INFO: renamed from: i */
    private Object f209229i = new Object();

    /* JADX INFO: renamed from: j */
    int f209230j = 0;

    /* JADX INFO: renamed from: k */
    int f209231k = 1;

    /* JADX INFO: renamed from: l */
    private int f209232l = 25;

    public interface OnCameraErrorListener {
    }

    public CameraSource(Activity activity, NotifyCenter notifyCenter) {
        this.f209225e = null;
        VideoQuality videoQualityM225057clone = VideoQuality.DEFAULT_VIDEO_QUALITY.m225057clone();
        this.f209233m = videoQualityM225057clone;
        this.f209234n = videoQualityM225057clone.m225057clone();
        this.f209235o = false;
        this.f209236p = 1;
        this.f209237q = false;
        this.f209238r = 1;
        this.f209239s = 0;
        this.f209240t = 0;
        this.f209241u = 480;
        this.f209242v = 480;
        this.f209243w = 640;
        this.f209244x = 640;
        this.f209245y = 480;
        this.f209246z = 640;
        this.f209201A = false;
        this.f209202B = false;
        this.f209203C = 10;
        this.f209207G = 9;
        this.f209210J = true;
        this.f209213M = new umw();
        this.f209214N = new lnw(1);
        this.f209215O = null;
        this.f209216P = 1;
        this.f209217Q = 0L;
        this.f209218R = null;
        this.f209219S = null;
        this.f209220T = new Camera.PreviewCallback() { // from class: tv.danmaku.ijk.media.source.CameraSource.4
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(final byte[] bArr, Camera camera) {
                t9c.m189745c("VideoSource", "onPreviewFrame callback invoke:");
                long jCurrentTimeMillis = System.currentTimeMillis() - CameraSource.this.f209217Q;
                CameraSource cameraSource = CameraSource.this;
                if (jCurrentTimeMillis >= 1000 / ((long) (cameraSource.f209234n.framerate + 5))) {
                    cameraSource.f209217Q = System.currentTimeMillis();
                    CameraSource.this.f209218R.post(new Runnable() { // from class: tv.danmaku.ijk.media.source.CameraSource.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (CameraSource.this.f209229i) {
                                try {
                                    if (CameraSource.this.f209226f != null && bArr != null) {
                                        t9c.m189745c("VideoSource", "onPreviewFrame mDofaceDetect:" + CameraSource.this.f209206F);
                                        omw omwVar = new omw();
                                        boolean z = CameraSource.this.f209206F;
                                        C226094 c226094 = C226094.this;
                                        if (z) {
                                            CameraSource.this.f209213M.m196802h(17);
                                            CameraSource.this.f209213M.m196807m(CameraSource.this.f209245y);
                                            CameraSource.this.f209213M.m196804j(CameraSource.this.f209246z);
                                            CameraSource.this.f209213M.m196801g(ByteBuffer.wrap(bArr).array());
                                            CameraSource.this.f209213M.m196800f(bArr.length);
                                            CameraSource.this.f209213M.m196806l(CameraSource.this.f209245y);
                                            CameraSource.this.f209214N.m154993A(CameraSource.this.f209240t * 90);
                                            CameraSource.this.f209214N.m155031z(CameraSource.this.f209240t * 90);
                                            CameraSource.this.f209214N.m155021p(CameraSource.this.f209201A);
                                            CameraSource.this.f209214N.m155016k(false);
                                            CameraSource.this.f209214N.m155014i(true);
                                            CameraSource.this.f209214N.m155017l(CameraSource.this.f209211K);
                                            CameraSource.this.f209214N.m154998F(true);
                                            CameraSource.this.f209214N.m155005M(CameraSource.this.f209207G);
                                            CameraSource.this.f209214N.m155003K(CameraSource.this.f209208H);
                                            CameraSource.this.f209214N.m155004L(CameraSource.this.f209209I);
                                            CameraSource.this.f209214N.m154999G(CameraSource.this.f209210J);
                                            CameraSource.this.f209214N.m155013h(true);
                                            if (CameraSource.this.f209212L == null && CameraSource.this.f209215O != null) {
                                                CameraSource.this.f209212L = new VideoProcessor();
                                                if (CameraSource.this.f209215O.size() >= 2) {
                                                    CameraSource.this.f209212L.LoadModel((String) CameraSource.this.f209215O.get(0), (String) CameraSource.this.f209215O.get(1));
                                                }
                                            }
                                            if (CameraSource.this.f209212L != null) {
                                                CameraSource.this.f209212L.ProcessFrame(CameraSource.this.f209213M.m196796b(), CameraSource.this.f209214N.m155011f(), omwVar.f148024k);
                                                omwVar.m168290b(CameraSource.this.f209207G);
                                            }
                                            CameraSource.this.m223473C0(omwVar, bArr);
                                        } else {
                                            CameraSource.this.m223473C0(omwVar, bArr);
                                        }
                                        return;
                                    }
                                    t9c.m189745c("VideoSource", "onPreviewFrame return");
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                } else if (cameraSource.f209226f != null) {
                    CameraSource.this.f209226f.addCallbackBuffer(bArr);
                }
            }
        };
        this.f209224d = activity;
        this.f209225e = notifyCenter;
        this.f209217Q = 0L;
        if (this.f209219S == null) {
            HandlerThread handlerThread = new HandlerThread("ijkStrMonitor");
            this.f209219S = handlerThread;
            handlerThread.start();
            this.f209218R = new Handler(this.f209219S.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public void m223473C0(omw omwVar, byte[] bArr) {
        omwVar.m168311z(this.f209201A);
        omwVar.m168308w(this.f209240t * 90);
        omwVar.m168286C(this.f209240t * 90);
        omwVar.m168310y(bArr);
        omwVar.m168288E(this.f209245y);
        omwVar.m168284A(this.f209246z);
        this.f209205E.m223726j1(this.f209226f, bArr, this.f209245y, this.f209246z, omwVar);
        if (this.f209226f != null) {
            this.f209226f.addCallbackBuffer(bArr);
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m223498r0() {
        new AsyncTask<String, Integer, Boolean>() { // from class: tv.danmaku.ijk.media.source.CameraSource.5
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                t9c.m189745c("VideoSource", "initCamera doInBackground");
                boolean zM223503x0 = CameraSource.this.m223503x0();
                for (int i = 0; !zM223503x0 && i < 2; i++) {
                    try {
                        Thread.sleep(2000L);
                        t9c.m189745c("VideoSource", "camera dealay creat");
                    } catch (InterruptedException unused) {
                    }
                    zM223503x0 = CameraSource.this.m223503x0();
                }
                if (!CameraSource.this.f209235o) {
                    CameraSource.this.f209235o = true;
                }
                CameraSource.this.m223499s0();
                CameraSource.this.m223504y0();
                synchronized (CameraSource.this.f209229i) {
                    CameraSource.this.f209229i.notifyAll();
                }
                return Boolean.valueOf(zM223503x0);
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                if (!bool.booleanValue() || CameraSource.this.f209226f == null) {
                    t9c.m189745c("VideoSource", "无法连接到相机");
                } else if (CameraSource.this.f209225e != null) {
                    CameraSource.this.f209225e.setSourceSucess();
                }
            }
        }.execute("start");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public void m223499s0() {
        NotifyCenter notifyCenter;
        t9c.m189745c("VideoSource", "initCameraPara ");
        if (this.f209226f == null) {
            t9c.m189745c("VideoSource", "mCamera == null");
            return;
        }
        try {
            List<Camera.Size> listM224042a = Util.m224042a(this.f209226f);
            Camera.Size sizeM223538q0 = (listM224042a == null || listM224042a.size() <= 0) ? null : m223538q0(listM224042a, this.f209239s);
            Camera.Size previewSize = this.f209223c.getPreviewSize();
            boolean z = m223500t0() && this.f209231k == 1;
            if (sizeM223538q0 == null || z) {
                this.f209245y = previewSize.width;
                this.f209246z = previewSize.height;
            } else {
                int i = sizeM223538q0.width;
                this.f209245y = i;
                int i2 = sizeM223538q0.height;
                this.f209246z = i2;
                if (i == 0 || i2 == 0) {
                    this.f209245y = previewSize.width;
                    this.f209246z = previewSize.height;
                }
            }
            this.f209223c.setPictureFormat(256);
            this.f209223c.setPreviewSize(this.f209245y, this.f209246z);
            t9c.m189745c("VideoSource", "mCamera.setParameters frameRate " + this.f209234n.framerate);
            VideoQuality videoQuality = this.f209234n;
            int i3 = videoQuality.framerate;
            if (i3 > 25 || i3 <= 0) {
                videoQuality.framerate = 25;
            }
            int[] iArrM223545w0 = m223545w0(this.f209223c, 30);
            this.f209223c.setPreviewFpsRange(iArrM223545w0[0], iArrM223545w0[1]);
            this.f209223c.setPreviewFrameRate(this.f209234n.framerate);
            t9c.m189745c("VideoSource", "mCamera.getPreviewFrameRate " + this.f209223c.getPreviewFrameRate());
            this.f209223c.setPreviewFormat(17);
            this.f209223c.setAntibanding("auto");
            this.f209223c.setWhiteBalance("auto");
            this.f209226f.setParameters(this.f209223c);
        } catch (RuntimeException unused) {
            t9c.m189745c("VideoSource", "mCamera.setParameters fail");
            if (m223503x0()) {
                this.f209223c = this.f209226f.getParameters();
            } else {
                NotifyCenter notifyCenter2 = this.f209225e;
                if (notifyCenter2 != null) {
                    notifyCenter2.notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 2, null);
                    return;
                }
            }
            Camera.Parameters parameters = this.f209223c;
            if (parameters == null && (notifyCenter = this.f209225e) != null) {
                notifyCenter.notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 2, null);
                return;
            } else {
                Camera.Size previewSize2 = parameters.getPreviewSize();
                this.f209245y = previewSize2.width;
                this.f209246z = previewSize2.height;
            }
        }
        m223507A0();
    }

    /* JADX INFO: renamed from: t0 */
    private boolean m223500t0() {
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
    private boolean m223501u0(Camera.Parameters parameters) {
        Iterator<String> it = parameters.getSupportedFocusModes().iterator();
        while (it.hasNext()) {
            if (it.next().equals("auto")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    private boolean m223502v0(Camera.Parameters parameters) {
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
    public boolean m223503x0() {
        int i;
        try {
            this.f209236p = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i2 = 0;
            while (true) {
                i = this.f209236p;
                if (i2 >= i) {
                    break;
                }
                Camera.getCameraInfo(i2, cameraInfo);
                int i3 = cameraInfo.facing;
                if (i3 == this.f209231k) {
                    this.f209230j = i2;
                    if (i3 == 1) {
                        this.f209238r = 1;
                    } else {
                        this.f209238r = 0;
                    }
                }
                i2++;
            }
            if (i == 1) {
                this.f209230j = 0;
                this.f209238r = 0;
            }
            m223505z0();
            if (this.f209226f != null) {
                this.f209226f.setPreviewCallback(null);
                this.f209226f.setPreviewCallbackWithBuffer(null);
                this.f209226f.release();
                this.f209226f = null;
            }
            int i4 = this.f209230j;
            if (i4 >= 0) {
                this.f209226f = Camera.open(i4);
            } else {
                this.f209226f = Camera.open();
            }
            if (this.f209226f == null) {
                return false;
            }
            this.f209239s = CameraUtils.m224107a(this.f209224d, this.f209230j);
            t9c.m189745c("VideoSource", "determineDisplayOrientation displayOrientation:" + this.f209239s + ";defaultCameraId " + this.f209230j + ";numberOfCameras:" + this.f209236p + ";mCameraSelection:" + this.f209231k + ";frontCamera:" + this.f209238r);
            Rotation rotation = Rotation.NORMAL;
            int i5 = this.f209239s;
            if (i5 == 90) {
                rotation = Rotation.ROTATION_90;
            } else if (i5 == 180) {
                rotation = Rotation.ROTATION_180;
            } else if (i5 == 270) {
                rotation = Rotation.ROTATION_270;
            }
            this.f209240t = this.f209238r == 1 ? (this.f209221a + rotation.ordinal()) % (Rotation.ROTATION_270.ordinal() + 1) : (this.f209222b + rotation.ordinal()) % (Rotation.ROTATION_270.ordinal() + 1);
            this.f209223c = this.f209226f.getParameters();
            this.f209226f.setDisplayOrientation(this.f209239s);
            List<String> supportedFocusModes = this.f209223c.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                String str = Build.MODEL;
                t9c.m189747e("video", str);
                if ((str.startsWith("GT-I950") || str.endsWith("SCH-I959") || str.endsWith("MEIZU MX3")) && supportedFocusModes.contains("continuous-picture")) {
                    this.f209223c.setFocusMode("continuous-picture");
                    t9c.m189745c("VideoSource", "FOCUS_MODE_CONTINUOUS_PICTURE");
                } else if (supportedFocusModes.contains("continuous-video")) {
                    t9c.m189745c("VideoSource", "FOCUS_MODE_CONTINUOUS_VIDEO");
                    this.f209223c.setFocusMode("continuous-video");
                } else {
                    this.f209223c.setFocusMode("fixed");
                    t9c.m189745c("VideoSource", "FOCUS_MODE_FIXED");
                }
            }
            this.f209223c.setWhiteBalance("auto");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public void m223504y0() {
        if (this.f209202B || this.f209226f == null) {
            return;
        }
        this.f209202B = true;
        t9c.m189745c("VideoSource", "startPreview cameraSurface:" + this.f209227g);
        if (this.f209227g == null) {
            return;
        }
        try {
            this.f209226f.setPreviewTexture(this.f209227g);
            this.f209226f.startPreview();
            int i = 0;
            while (true) {
                Camera camera = this.f209226f;
                if (i >= 10) {
                    camera.setPreviewCallbackWithBuffer(this.f209220T);
                    t9c.m189745c("VideoSource", "mCamera.setPreviewTexture");
                    return;
                }
                camera.addCallbackBuffer(new byte[((this.f209245y * this.f209246z) * 3) / 2]);
                t9c.m189745c("VideoSource", "mCamera.addCallbackBuffer size:" + (((this.f209245y * this.f209246z) * 3) / 2));
                i++;
            }
        } catch (Exception unused) {
            t9c.m189745c("VideoSource", "mCamera startPreview fail");
        }
    }

    /* JADX INFO: renamed from: z0 */
    private void m223505z0() {
        synchronized (this.f209229i) {
            try {
                try {
                    if (this.f209226f != null) {
                        this.f209226f.setPreviewCallback(null);
                        this.f209226f.setPreviewCallbackWithBuffer(null);
                    }
                    if (this.f209226f != null) {
                        this.f209226f.stopPreview();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (this.f209226f != null) {
                    this.f209226f.release();
                    this.f209226f = null;
                }
                this.f209202B = false;
                this.f209237q = false;
                VideoProcessor videoProcessor = this.f209212L;
                if (videoProcessor != null) {
                    videoProcessor.Release();
                    this.f209212L = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: A */
    public void mo223506A(float f) {
        this.f209208H = f * 0.5f;
    }

    /* JADX INFO: renamed from: A0 */
    public void m223507A0() {
        float f = this.f209225e.getPreviewScale().x;
        float f2 = this.f209225e.getPreviewScale().y;
        float f3 = f2 / f;
        int i = this.f209246z;
        int i2 = this.f209245y;
        float f4 = i / i2;
        VideoQuality videoQuality = this.f209234n;
        if (f3 <= f4) {
            videoQuality.resY = i2;
            videoQuality.resX = ((int) (((i2 * f2) / f) / 16.0f)) * 16;
        } else {
            videoQuality.resX = i;
            videoQuality.resY = ((int) (((i * f) / f2) / 16.0f)) * 16;
        }
        VideoQuality videoQuality2 = this.f209234n;
        videoQuality2.resX = (int) (((double) videoQuality2.resX) * 1.0d * ((double) this.f209225e.getPreviewZoom()));
        VideoQuality videoQuality3 = this.f209234n;
        videoQuality3.resY = (int) (((double) videoQuality3.resY) * 1.0d * ((double) this.f209225e.getPreviewZoom()));
        t9c.m189745c("VideoSource", "----previewWidth:" + this.f209245y + ";previewHeight" + this.f209246z + ";mVideoQuality.resX" + this.f209234n.resX + ";mVideoQuality.resY" + this.f209234n.resY + Constants.SEPARATOR_COMMA + this.f209216P);
        VideoQuality videoQuality4 = this.f209234n;
        if (videoQuality4.resX < 176) {
            videoQuality4.resX = 176;
        }
        if (videoQuality4.resY < 176) {
            videoQuality4.resY = 176;
        }
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            if (this.f209231k == 1) {
                this.f209201A = true;
            } else {
                this.f209201A = false;
            }
            if (this.f209236p == 1) {
                this.f209201A = false;
            }
            int i3 = this.f209216P;
            if (i3 == 2) {
                momoSurface.m223719e1(this.f209245y, this.f209246z, this.f209201A, this.f209240t * 90, i3, 0, videoQuality4.resX, videoQuality4.resY);
                VideoQuality videoQuality5 = this.f209234n;
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
                momoSurface.m223719e1(this.f209245y, this.f209246z, this.f209201A, this.f209240t * 90, i3, 0, videoQuality4.resX, videoQuality4.resY);
            }
            t9c.m189745c("VideoSource", "updateResolution call setVideoQuality():" + this.f209234n.resX + Constants.SEPARATOR_COMMA + this.f209234n.resY);
            this.f209205E.m223710Y0(this.f209234n);
        }
        NotifyCenter notifyCenter = this.f209225e;
        if (notifyCenter != null) {
            notifyCenter.notifyUpdateResolution();
        }
        ijkMediaStreamer.OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener = this.f209204D;
        if (onVideoPreviewSizeSetListener != null) {
            VideoQuality videoQuality6 = this.f209234n;
            onVideoPreviewSizeSetListener.m224081a(videoQuality6.resX, videoQuality6.resY);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: B */
    public void mo223508B(int i, int i2) {
        this.f209242v = i;
        this.f209244x = i2;
        this.f209241u = i;
        this.f209243w = i2;
    }

    /* JADX INFO: renamed from: B0 */
    public void m223509B0(VideoQuality videoQuality) {
        if (videoQuality == null || videoQuality.resX == 0 || videoQuality.resY == 0) {
            return;
        }
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            momoSurface.m223710Y0(videoQuality);
        }
        NotifyCenter notifyCenter = this.f209225e;
        if (notifyCenter != null) {
            notifyCenter.notifyUpdateResolution();
            this.f209225e.notifyResumeRecording();
        }
        t9c.m189745c("VideoSource", "updateVideoVideoQuality:" + this.f209234n.resX + Constants.SEPARATOR_COMMA + this.f209234n.resY);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: C */
    public void mo223510C(Object obj) {
        this.f209204D = (ijkMediaStreamer.OnVideoPreviewSizeSetListener) obj;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: D */
    public void mo223511D(float f) {
        m223507A0();
        mo223512E(0, 1);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: E */
    public void mo223512E(int i, int i2) {
        NotifyCenter notifyCenter = this.f209225e;
        if (notifyCenter == null) {
            return;
        }
        if (notifyCenter.getStreamerCaptureType(i) == i2) {
            t9c.m189745c("VideoSource", "----setStreamerCaptureType repeat, captureType=" + i2 + ", uid=" + i);
            return;
        }
        t9c.m189745c("VideoSource", "----setStreamerCaptureType, captureType=" + i2 + ", uid=" + i);
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            momoSurface.m223723h0(0.0f, 0.0f, 0.0f, 1.0f, true);
        }
        this.f209225e.setStreamerCaptureType(i, i2);
        if (this.f209205E != null) {
            int streamerCaptureType = this.f209225e.getStreamerCaptureType(i);
            NotifyCenter notifyCenter2 = this.f209225e;
            if (streamerCaptureType == 1) {
                this.f209216P = notifyCenter2.getStreamerCaptureType(i);
                this.f209205E.m223723h0(0.0f, 0.0f, 0.0f, 1.0f, false);
                VideoQuality videoQuality = this.f209234n;
                int i3 = videoQuality.resX;
                int i4 = videoQuality.resY;
                if (i3 > i4) {
                    videoQuality.resY = i3;
                    videoQuality.resX = i4;
                }
                this.f209205E.m223719e1(this.f209245y, this.f209246z, this.f209201A, this.f209240t * 90, this.f209216P, i, videoQuality.resX, videoQuality.resY);
            } else {
                this.f209216P = notifyCenter2.getStreamerCaptureType(i);
                this.f209205E.m223723h0(0.0f, 0.0f, 0.0f, 1.0f, false);
                MomoSurface momoSurface2 = this.f209205E;
                int i5 = this.f209245y;
                int i6 = this.f209246z;
                boolean z = this.f209201A;
                int i7 = this.f209240t * 90;
                int i8 = this.f209216P;
                VideoQuality videoQuality2 = this.f209234n;
                momoSurface2.m223719e1(i5, i6, z, i7, i8, i, videoQuality2.resX, videoQuality2.resY);
                VideoQuality videoQuality3 = this.f209234n;
                int i9 = videoQuality3.resY;
                int i10 = videoQuality3.resX;
                if (i9 > i10) {
                    videoQuality3.resY = i10;
                    videoQuality3.resX = i9;
                }
            }
            this.f209205E.m223710Y0(this.f209234n);
        }
        this.f209225e.notifyUpdateResolution();
        ijkMediaStreamer.OnVideoPreviewSizeSetListener onVideoPreviewSizeSetListener = this.f209204D;
        if (onVideoPreviewSizeSetListener != null) {
            VideoQuality videoQuality4 = this.f209234n;
            onVideoPreviewSizeSetListener.m224081a(videoQuality4.resX, videoQuality4.resY);
        }
        this.f209225e.notifyResumeRecording();
        t9c.m189745c("VideoSource", "----setStreamerCaptureType, mCurrentScreenOrient=" + this.f209216P + com.meituan.robust.Constants.PACKNAME_END + this.f209234n.resX + Constants.SEPARATOR_COMMA + this.f209234n.resY);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: F */
    public void mo223513F(int i) {
        this.f209234n.framerate = i;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: G */
    public void mo223514G(int i) {
        if (this.f209237q) {
            return;
        }
        this.f209228h = i;
        t9c.m189745c("VideoSource", "setVideoResolution:" + i);
        int i2 = this.f209228h;
        if (i2 == 2) {
            VideoQuality videoQuality = this.f209234n;
            videoQuality.resX = 384;
            videoQuality.resY = 720;
        } else if (i2 == 3) {
            VideoQuality videoQuality2 = this.f209234n;
            videoQuality2.resX = 720;
            videoQuality2.resY = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
        } else if (i2 == 1) {
            VideoQuality videoQuality3 = this.f209234n;
            videoQuality3.resX = 352;
            videoQuality3.resY = 640;
        } else {
            VideoQuality videoQuality4 = this.f209234n;
            if (i2 == 5) {
                videoQuality4.resX = 528;
                videoQuality4.resY = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
            } else {
                videoQuality4.resX = 180;
                videoQuality4.resY = 320;
            }
        }
        if (this.f209205E != null) {
            t9c.m189745c("VideoSource", "setVideoResolution call setVideoQuality():" + this.f209234n.resX + Constants.SEPARATOR_COMMA + this.f209234n.resY);
            this.f209205E.m223710Y0(this.f209234n);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: H */
    public void mo223515H(int i) {
        this.f209207G = i;
        if (i < 5 || i > 8) {
            return;
        }
        this.f209210J = true;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: I */
    public void mo223516I(int i) {
        if (this.f209223c == null || this.f209226f == null) {
            return;
        }
        try {
            if (i >= this.f209223c.getMaxZoom()) {
                i = 0;
            }
            if (this.f209223c.isSmoothZoomSupported()) {
                this.f209226f.startSmoothZoom(i);
            } else if (this.f209223c.isZoomSupported()) {
                this.f209223c.setZoom(i);
                this.f209226f.setParameters(this.f209223c);
            }
        } catch (Error e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: N */
    public void mo223517N() {
        this.f209231k = this.f209231k == 0 ? 1 : 0;
        t9c.m189745c("VideoSource", BLiveButtonType.switchCamera);
        synchronized (this.f209229i) {
            try {
                try {
                    MomoSurface momoSurface = this.f209205E;
                    if (momoSurface != null) {
                        momoSurface.m223693K0(this.f209231k);
                    }
                    mo223514G(this.f209228h);
                    m223498r0();
                    this.f209229i.wait(4000L);
                    t9c.m189745c("VideoSource", "switchCamera end");
                } catch (Exception unused) {
                    NotifyCenter notifyCenter = this.f209225e;
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
    public void mo223518O(Context context, jt2 jt2Var) {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            momoSurface.m223716c1(context, jt2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: P */
    public void mo223519P() {
        m223505z0();
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: R */
    public void mo223520R(VideoQuality videoQuality) {
        m223509B0(videoQuality);
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: a */
    public void mo223521a(jt2 jt2Var) {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            momoSurface.m223709Y(jt2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: b */
    public void mo223522b(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        String str;
        if (this.f209226f == null) {
            return;
        }
        try {
            parameters = this.f209226f.getParameters();
        } catch (RuntimeException unused) {
            parameters = null;
        }
        if (parameters == null) {
            return;
        }
        if (m223501u0(parameters)) {
            str = "auto";
        } else if (!m223502v0(parameters)) {
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
            this.f209226f.setParameters(parameters);
            this.f209226f.autoFocus(autoFocusCallback);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: c */
    public long mo223523c() {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            return momoSurface.m223727l0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: d */
    public long mo223524d() {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            return momoSurface.m223728m0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: e */
    public Camera mo223525e() {
        return this.f209226f;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: f */
    public int mo223526f() {
        return this.f209216P;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: g */
    public int mo223527g() {
        Camera.Parameters parameters = this.f209223c;
        if (parameters != null) {
            return parameters.getZoom();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: h */
    public long mo223528h() {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            return momoSurface.m223730o0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: i */
    public long mo223529i() {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            return momoSurface.m223731p0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: j */
    public long mo223530j() {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            return momoSurface.m223732q0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: k */
    public long mo223531k() {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            return momoSurface.m223733r0();
        }
        return 0L;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: l */
    public int mo223532l() {
        Camera.Parameters parameters = this.f209223c;
        if (parameters != null) {
            return parameters.getMaxZoom() - 1;
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: m */
    public int mo223533m() {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            return momoSurface.m223739x0();
        }
        return 0;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: n */
    public VideoQuality mo223534n() {
        t9c.m189745c("VideoSource", "getVideoQuality: width" + this.f209234n.resX + ";heigh:" + this.f209234n.resY);
        return this.f209234n;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: o */
    public boolean mo223535o() {
        return this.f209231k == 1;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: p */
    public boolean mo223536p() {
        return true;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: q */
    public void mo223537q() {
        m223505z0();
        synchronized (this.f209229i) {
            try {
                Handler handler = this.f209218R;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.f209219S.quit();
                    this.f209219S = null;
                    this.f209218R = null;
                }
                mo223578M();
                this.f209204D = null;
                this.f209224d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public Camera.Size m223538q0(List<Camera.Size> list, int i) {
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
            t9c.m189745c("VideoSource", "Support Preview Size: width:" + sizeArr[i2].width + ", height:" + sizeArr[i2].height);
            Camera.Size size3 = sizeArr[i2];
            if (size3.width >= this.f209242v && size3.height >= this.f209244x) {
                break;
            }
            i2++;
        }
        if (i2 != sizeArr.length) {
            size = sizeArr[i2];
            this.f209241u = this.f209242v;
            this.f209243w = this.f209244x;
        } else {
            t9c.m189745c("VideoSource", "preferred preview size not in the preview size list");
            size = sizeArr[i2 - 1];
            int i4 = this.f209242v;
            int i5 = size.height;
            int i6 = i4 * i5;
            int i7 = this.f209244x;
            int i8 = size.width;
            if (i6 >= i7 * i8) {
                this.f209241u = i8;
                this.f209243w = (i7 * i8) / i4;
            } else {
                this.f209243w = i5;
                this.f209241u = (i4 * i5) / i7;
            }
        }
        if (i == 90 || i == 270) {
            int i9 = size.width;
            size.width = size.height;
            size.height = i9;
        }
        t9c.m189745c("VideoSource", "preview size:" + size.width + "*" + size.height + "process Size" + this.f209241u + "*" + this.f209243w);
        return size;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: r */
    public synchronized void mo223539r(Activity activity, int i, MomoSurface momoSurface) {
        try {
            t9c.m189745c("VideoSource", "selectCamera");
            this.f209205E = momoSurface;
            this.f209227g = momoSurface.m223737v0();
            this.f209224d = activity;
            this.f209231k = i;
            MomoSurface momoSurface2 = this.f209205E;
            if (momoSurface2 != null) {
                momoSurface2.m223693K0(i);
                MomoSurface momoSurface3 = this.f209205E;
                if (momoSurface3 != null) {
                    momoSurface3.m223696N0(new MomoSurface.FrameRateUpdateListener() { // from class: tv.danmaku.ijk.media.source.CameraSource.1
                    });
                }
            }
            synchronized (this.f209229i) {
                try {
                    mo223514G(this.f209228h);
                    m223498r0();
                    this.f209229i.wait(4000L);
                    NotifyCenter notifyCenter = this.f209225e;
                    if (notifyCenter != null) {
                        notifyCenter.setSourceSucess();
                    }
                } catch (InterruptedException unused) {
                    NotifyCenter notifyCenter2 = this.f209225e;
                    if (notifyCenter2 != null) {
                        notifyCenter2.notify(300, WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_INVALID_STATE, 2, null);
                    }
                    return;
                }
            }
            this.f209237q = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: s */
    public void mo223540s(Context context, jt2 jt2Var) {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            momoSurface.m223691H0(context, jt2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: t */
    public void mo223541t(Context context, jt2 jt2Var) {
        MomoSurface momoSurface = this.f209205E;
        if (momoSurface != null) {
            momoSurface.m223692I0(context, jt2Var);
        }
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: u */
    public void mo223542u(boolean z) {
        this.f209211K = z;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: v */
    public void mo223543v(int i) {
        this.f209216P = i;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: w */
    public void mo223544w(boolean z) {
        this.f209206F = z;
    }

    /* JADX INFO: renamed from: w0 */
    public int[] m223545w0(Camera.Parameters parameters, final int i) {
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
    public void mo223546x(int i) {
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: y */
    public void mo223547y(List<String> list) {
        this.f209215O = list;
    }

    @Override // tv.danmaku.ijk.media.source.SourceBase
    /* JADX INFO: renamed from: z */
    public void mo223548z(float f) {
        this.f209209I = f * 0.8f;
    }
}
