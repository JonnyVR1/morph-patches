package p153l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.idv.identity.platform.config.DeviceSetting;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"InlinedApi"})
public class yn0 implements dql {

    /* JADX INFO: renamed from: s */
    private static yn0 f200740s;

    /* JADX INFO: renamed from: a */
    private Context f200741a;

    /* JADX INFO: renamed from: b */
    private Activity f200742b;

    /* JADX INFO: renamed from: c */
    private Camera f200743c;

    /* JADX INFO: renamed from: d */
    private Camera.Parameters f200744d;

    /* JADX INFO: renamed from: e */
    private zpl f200745e;

    /* JADX INFO: renamed from: g */
    private int f200747g;

    /* JADX INFO: renamed from: f */
    private int f200746f = 90;

    /* JADX INFO: renamed from: h */
    private boolean f200748h = true;

    /* JADX INFO: renamed from: i */
    private DeviceSetting f200749i = new DeviceSetting();

    /* JADX INFO: renamed from: j */
    private final Object f200750j = new Object();

    /* JADX INFO: renamed from: k */
    private int f200751k = 0;

    /* JADX INFO: renamed from: l */
    private int f200752l = 0;

    /* JADX INFO: renamed from: m */
    private int f200753m = 0;

    /* JADX INFO: renamed from: n */
    private int f200754n = 0;

    /* JADX INFO: renamed from: r */
    private boolean f200758r = false;

    /* JADX INFO: renamed from: o */
    private boolean f200755o = false;

    /* JADX INFO: renamed from: p */
    private boolean f200756p = false;

    /* JADX INFO: renamed from: q */
    private boolean f200757q = false;

    /* JADX INFO: renamed from: l.yn0$a */
    public class C21637a implements Camera.PreviewCallback {
        public C21637a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (bArr == null || yn0.this.f200745e == null) {
                return;
            }
            p94 p94Var = new p94(ByteBuffer.wrap(bArr), yn0.this.f200751k, yn0.this.f200752l, 0, null, 0, 0, yn0.this.f200753m, yn0.this.f200754n);
            p94Var.f151106q = bArr;
            p94Var.m171341h(yn0.this.f200746f);
            if (yn0.this.f200745e != null) {
                yn0.this.f200745e.mo18976p0(p94Var);
            }
            t0g0.m188742e(t0g0.C20202a.f171514b, null);
        }
    }

    /* JADX INFO: renamed from: l.yn0$b */
    public class C21638b implements Camera.AutoFocusMoveCallback {
        public C21638b() {
        }

        @Override // android.hardware.Camera.AutoFocusMoveCallback
        public void onAutoFocusMoving(boolean z, Camera camera) {
            o6r0.m166282b("AndroidImpl", "takePhoto autoFocusMoving: " + z);
        }
    }

    /* JADX INFO: renamed from: l.yn0$c */
    public class C21639c implements Camera.AutoFocusCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean[] f200761a;

        public C21639c(boolean[] zArr) {
            this.f200761a = zArr;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            this.f200761a[0] = true;
            o6r0.m166282b("AndroidImpl", "takePhoto autoFocus: " + z);
        }
    }

    /* JADX INFO: renamed from: l.yn0$d */
    public class RunnableC21640d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ iql f200763a;

        /* JADX INFO: renamed from: l.yn0$d$a */
        public class a implements Camera.PictureCallback {
            public a() {
            }

            @Override // android.hardware.Camera.PictureCallback
            public void onPictureTaken(byte[] bArr, Camera camera) {
                try {
                    if (bArr == null) {
                        throw new Exception("taken photo exception, image data null");
                    }
                    int iM216750F = yn0.f200740s.m216750F(yn0.this.f200749i);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    o6r0.m166282b("AndroidImpl", "takePhoto bitmap width: " + bitmapDecodeByteArray.getWidth() + " height: " + bitmapDecodeByteArray.getHeight() + " getPreviewWidth:" + yn0.this.mo117544m());
                    if (bitmapDecodeByteArray.getWidth() != yn0.this.mo117544m()) {
                        bitmapDecodeByteArray = ac00.m96794m(bitmapDecodeByteArray, yn0.this.mo117544m());
                    }
                    o6r0.m166282b("AndroidImpl", "resize bitmap width: " + bitmapDecodeByteArray.getWidth() + " height: " + bitmapDecodeByteArray.getHeight() + " getPreviewWidth:" + yn0.this.mo117544m());
                    Matrix matrix = new Matrix();
                    matrix.setRotate((float) iM216750F);
                    Bitmap bitmap = bitmapDecodeByteArray;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    iql iqlVar = RunnableC21640d.this.f200763a;
                    if (iqlVar != null) {
                        iqlVar.mo18987a(bitmapCreateBitmap, false);
                    }
                    yn0.this.f200743c.cancelAutoFocus();
                    yn0.this.mo117542k("continuous-picture");
                } catch (Exception e) {
                    RecordService.getInstance().recordException(e);
                    iql iqlVar2 = RunnableC21640d.this.f200763a;
                    if (iqlVar2 != null) {
                        iqlVar2.mo18987a(null, false);
                    }
                    yn0.this.f200743c.cancelAutoFocus();
                    yn0.this.mo117542k("continuous-picture");
                }
            }
        }

        public RunnableC21640d(iql iqlVar) {
            this.f200763a = iqlVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                yn0.this.f200743c.takePicture(null, null, new a());
            } catch (Exception e) {
                RecordService.getInstance().recordException(e);
            }
        }
    }

    private yn0() {
    }

    /* JADX INFO: renamed from: D */
    private void m216748D() {
        Camera.Size sizeM196819e;
        int iMin;
        Camera.Size sizeM196818d;
        if (this.f200744d != null) {
            DeviceSetting deviceSetting = this.f200749i;
            if (deviceSetting == null || deviceSetting.isWidthAuto()) {
                sizeM196819e = this.f200758r ? un0.m196817c().m196819e(this.f200744d.getSupportedPreviewSizes(), n94.f140739a, n94.f140740b) : un0.m196817c().m196818d(this.f200744d.getSupportedPreviewSizes(), x5e.m209359c(this.f200741a, this.f200748h), n94.f140741c);
            } else {
                sizeM196819e = un0.m196817c().m196819e(this.f200744d.getSupportedPreviewSizes(), this.f200749i.getWidth(), 0);
            }
            if (sizeM196819e != null) {
                int i = sizeM196819e.width;
                this.f200753m = i;
                int i2 = sizeM196819e.height;
                this.f200754n = i2;
                this.f200751k = i;
                this.f200752l = i2;
                o6r0.m166285e("AndroidImpl", "setPreviewSize(): mPreviewWidth:" + this.f200753m + " mPreviewHeight:" + this.f200754n);
                this.f200744d.setPreviewSize(this.f200753m, this.f200754n);
                if (!this.f200758r && (sizeM196818d = un0.m196817c().m196818d(this.f200744d.getSupportedPictureSizes(), x5e.m209359c(this.f200741a, this.f200748h), n94.f140742d)) != null) {
                    Iterator<Camera.Size> it = this.f200744d.getSupportedPictureSizes().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            this.f200744d.setPictureSize(sizeM196818d.width, sizeM196818d.height);
                            break;
                        }
                        Camera.Size next = it.next();
                        if (next.width == this.f200753m && next.height == this.f200754n) {
                            o6r0.m166285e("AndroidImpl", "setPictureSize: size.width:" + next.width + " size.height:" + next.height);
                            this.f200744d.setPictureSize(this.f200753m, this.f200754n);
                            break;
                        }
                    }
                }
            }
            DeviceSetting deviceSetting2 = this.f200749i;
            if (deviceSetting2 != null) {
                this.f200746f = m216750F(deviceSetting2);
                o6r0.m166285e("TAG", " setting mCameraViewRotationAngle:" + this.f200746f);
                this.f200743c.setDisplayOrientation(this.f200746f);
            }
            if (this.f200749i != null && this.f200744d.isZoomSupported() && (iMin = Math.min(Math.max(this.f200749i.getZoom(), 0), this.f200744d.getMaxZoom())) != this.f200744d.getZoom()) {
                this.f200744d.setZoom(iMin);
            }
            List<String> supportedFocusModes = this.f200744d.getSupportedFocusModes();
            Iterator<String> it2 = supportedFocusModes.iterator();
            while (it2.hasNext()) {
                o6r0.m166285e("AndroidImpl", "focusMode:" + it2.next());
            }
            if (this.f200758r) {
                if (supportedFocusModes.contains("continuous-video")) {
                    this.f200744d.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("auto")) {
                    this.f200744d.setFocusMode("auto");
                }
            } else if (supportedFocusModes.contains("continuous-picture")) {
                this.f200744d.setFocusMode("continuous-picture");
            } else if (supportedFocusModes.contains("auto")) {
                this.f200744d.setFocusMode("auto");
            }
            List<Integer> supportedPreviewFormats = this.f200744d.getSupportedPreviewFormats();
            if (supportedPreviewFormats == null || !supportedPreviewFormats.contains(17)) {
                return;
            }
            this.f200744d.setPreviewFormat(17);
        }
    }

    /* JADX INFO: renamed from: E */
    private int m216749E(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) this.f200741a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        return i3 == 1 ? (360 - ((i4 + i2) % 360)) % 360 : ((i4 - i2) + 360) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public int m216750F(DeviceSetting deviceSetting) {
        if (deviceSetting == null) {
            wg3.m206174a("deviceSetting can't be null");
            return 0;
        }
        int iM216749E = deviceSetting.isDisplayAuto() ? m216749E(this.f200747g) : deviceSetting.getDisplayAngle();
        Activity activity = this.f200742b;
        if (activity != null && x5e.m209360d()) {
            int iM209357a = x5e.m209357a(activity);
            if (iM209357a == 1) {
                return 90;
            }
            if (iM209357a == 2) {
                return 0;
            }
            if (iM209357a == 3) {
                return 180;
            }
        }
        return iM216749E;
    }

    /* JADX INFO: renamed from: G */
    public static synchronized yn0 m216751G() {
        try {
            if (f200740s == null) {
                f200740s = new yn0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f200740s;
    }

    /* JADX INFO: renamed from: H */
    private void m216752H(Context context) {
        if (context instanceof Activity) {
            this.f200742b = (Activity) context;
        }
        this.f200741a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: I */
    private boolean m216753I(int i) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "realStartCamera", "cameraId", Integer.toString(i));
        try {
            Camera cameraOpen = Camera.open(i);
            this.f200743c = cameraOpen;
            if (cameraOpen == null) {
                zpl zplVar = this.f200745e;
                if (zplVar != null) {
                    zplVar.mo18952T(101, new Throwable("mCamera == null"));
                }
                return false;
            }
            this.f200747g = i;
            this.f200744d = cameraOpen.getParameters();
            m216748D();
            Camera.Parameters parameters = this.f200744d;
            if (parameters == null) {
                return true;
            }
            this.f200743c.setParameters(parameters);
            return true;
        } catch (Exception e) {
            zpl zplVar2 = this.f200745e;
            if (zplVar2 != null) {
                zplVar2.mo18952T(101, e);
            }
            return false;
        }
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: a */
    public void mo117532a() {
        synchronized (this.f200750j) {
            try {
                if (this.f200757q) {
                    if (this.f200743c != null) {
                        synchronized (this.f200750j) {
                            try {
                                this.f200743c.setOneShotPreviewCallback(null);
                                this.f200743c.setPreviewCallback(null);
                                this.f200743c.stopPreview();
                            } catch (Exception e) {
                                RecordService.getInstance().recordException(e);
                            }
                        }
                        this.f200757q = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: b */
    public Camera mo117533b() {
        return this.f200743c;
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: c */
    public void mo117534c(iql iqlVar) {
        Camera camera = this.f200743c;
        if (camera == null) {
            if (iqlVar != null) {
                iqlVar.mo18987a(null, false);
                return;
            }
            return;
        }
        o6r0.m166282b("AndroidImpl", "takePhoto focusMode: " + camera.getParameters().getFocusMode());
        this.f200743c.setAutoFocusMoveCallback(new C21638b());
        this.f200743c.autoFocus(new C21639c(new boolean[]{false}));
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC21640d(iqlVar), 200L);
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: d */
    public void mo117535d(SurfaceHolder surfaceHolder, float f, int i, int i2) {
        synchronized (this.f200750j) {
            try {
                if (this.f200757q) {
                    return;
                }
                Camera camera = this.f200743c;
                if (camera != null) {
                    try {
                        camera.cancelAutoFocus();
                        if (surfaceHolder != null) {
                            this.f200743c.setPreviewDisplay(surfaceHolder);
                        }
                        this.f200743c.setPreviewCallback(new C21637a());
                        this.f200743c.startPreview();
                        this.f200757q = true;
                    } catch (Exception e) {
                        zpl zplVar = this.f200745e;
                        if (zplVar != null) {
                            zplVar.mo18952T(101, e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: e */
    public void mo117536e(zpl zplVar) {
        this.f200745e = zplVar;
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: f */
    public void mo117537f() {
        if (this.f200755o) {
            this.f200755o = false;
        }
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: g */
    public void mo117538g() {
        Camera.Parameters parameters;
        Camera camera = this.f200743c;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return;
        }
        parameters.setFlashMode(BLiveOperationTitleShowType.off);
        this.f200743c.setParameters(parameters);
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: h */
    public int mo117539h() {
        return this.f200751k;
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: i */
    public int mo117540i() {
        return this.f200752l;
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: j */
    public int mo117541j() {
        return this.f200754n;
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: k */
    public void mo117542k(String str) {
        Camera.Parameters parameters;
        Camera camera = this.f200743c;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return;
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null && supportedFocusModes.contains(str)) {
            parameters.setFocusMode(str);
            this.f200743c.setParameters(parameters);
        }
        this.f200743c.startPreview();
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: l */
    public void mo117543l() {
        synchronized (this.f200750j) {
            Camera camera = this.f200743c;
            if (camera != null) {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setAutoExposureLock(true);
                    parameters.setAutoWhiteBalanceLock(true);
                    this.f200743c.setParameters(parameters);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: m */
    public int mo117544m() {
        return this.f200753m;
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: n */
    public void mo117545n() {
        synchronized (this.f200750j) {
            try {
                if (this.f200756p) {
                    return;
                }
                int iM196815a = un0.m196815a();
                if (this.f200748h) {
                    iM196815a = un0.m196816b();
                }
                if (m216753I(iM196815a)) {
                    this.f200756p = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: o */
    public int mo117546o() {
        return this.f200746f;
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: p */
    public void mo117547p(Context context, boolean z, boolean z2, DeviceSetting deviceSetting) {
        this.f200748h = z;
        this.f200758r = z2;
        if (deviceSetting != null) {
            this.f200749i = deviceSetting;
        }
        if (!z) {
            this.f200746f = 270;
        }
        m216752H(context);
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: q */
    public void mo117548q() {
        Camera.Parameters parameters;
        Camera camera = this.f200743c;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return;
        }
        parameters.setFlashMode("torch");
        this.f200743c.setParameters(parameters);
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: r */
    public void mo117549r() {
        this.f200742b = null;
    }

    @Override // p153l.dql
    /* JADX INFO: renamed from: s */
    public void mo117550s() {
        mo117532a();
        synchronized (this.f200750j) {
            try {
                if (this.f200756p) {
                    this.f200745e = null;
                    Camera camera = this.f200743c;
                    if (camera != null) {
                        try {
                            camera.release();
                            this.f200743c = null;
                            this.f200756p = false;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
