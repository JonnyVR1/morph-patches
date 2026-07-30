package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"InlinedApi"})
public class co0 implements snl {

    /* JADX INFO: renamed from: s */
    private static co0 f81703s;

    /* JADX INFO: renamed from: a */
    private Context f81704a;

    /* JADX INFO: renamed from: b */
    private Activity f81705b;

    /* JADX INFO: renamed from: c */
    private Camera f81706c;

    /* JADX INFO: renamed from: d */
    private Camera.Parameters f81707d;

    /* JADX INFO: renamed from: e */
    private onl f81708e;

    /* JADX INFO: renamed from: g */
    private int f81710g;

    /* JADX INFO: renamed from: f */
    private int f81709f = 90;

    /* JADX INFO: renamed from: h */
    private boolean f81711h = true;

    /* JADX INFO: renamed from: i */
    private DeviceSetting f81712i = new DeviceSetting();

    /* JADX INFO: renamed from: j */
    private final Object f81713j = new Object();

    /* JADX INFO: renamed from: k */
    private int f81714k = 0;

    /* JADX INFO: renamed from: l */
    private int f81715l = 0;

    /* JADX INFO: renamed from: m */
    private int f81716m = 0;

    /* JADX INFO: renamed from: n */
    private int f81717n = 0;

    /* JADX INFO: renamed from: r */
    private boolean f81721r = false;

    /* JADX INFO: renamed from: o */
    private boolean f81718o = false;

    /* JADX INFO: renamed from: p */
    private boolean f81719p = false;

    /* JADX INFO: renamed from: q */
    private boolean f81720q = false;

    /* JADX INFO: renamed from: l.co0$a */
    public class C16199a implements Camera.PreviewCallback {
        public C16199a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            if (bArr == null || co0.this.f81708e == null) {
                return;
            }
            q84 q84Var = new q84(ByteBuffer.wrap(bArr), co0.this.f81714k, co0.this.f81715l, 0, null, 0, 0, co0.this.f81716m, co0.this.f81717n);
            q84Var.f153131q = bArr;
            q84Var.m173339h(co0.this.f81709f);
            if (co0.this.f81708e != null) {
                co0.this.f81708e.mo17900o0(q84Var);
            }
            ksf0.m147071e(ksf0.C18071a.f124464b, null);
        }
    }

    /* JADX INFO: renamed from: l.co0$b */
    public class C16200b implements Camera.AutoFocusMoveCallback {
        public C16200b() {
        }

        @Override // android.hardware.Camera.AutoFocusMoveCallback
        public void onAutoFocusMoving(boolean z, Camera camera) {
            ixq0.m138885b("AndroidImpl", "takePhoto autoFocusMoving: " + z);
        }
    }

    /* JADX INFO: renamed from: l.co0$c */
    public class C16201c implements Camera.AutoFocusCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean[] f81724a;

        public C16201c(boolean[] zArr) {
            this.f81724a = zArr;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            this.f81724a[0] = true;
            ixq0.m138885b("AndroidImpl", "takePhoto autoFocus: " + z);
        }
    }

    /* JADX INFO: renamed from: l.co0$d */
    public class RunnableC16202d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ xnl f81726a;

        /* JADX INFO: renamed from: l.co0$d$a */
        public class a implements Camera.PictureCallback {
            public a() {
            }

            @Override // android.hardware.Camera.PictureCallback
            public void onPictureTaken(byte[] bArr, Camera camera) {
                try {
                    if (bArr == null) {
                        throw new Exception("taken photo exception, image data null");
                    }
                    int iM107843F = co0.f81703s.m107843F(co0.this.f81712i);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    ixq0.m138885b("AndroidImpl", "takePhoto bitmap width: " + bitmapDecodeByteArray.getWidth() + " height: " + bitmapDecodeByteArray.getHeight() + " getPreviewWidth:" + co0.this.mo107866m());
                    if (bitmapDecodeByteArray.getWidth() != co0.this.mo107866m()) {
                        bitmapDecodeByteArray = d300.m109849m(bitmapDecodeByteArray, co0.this.mo107866m());
                    }
                    ixq0.m138885b("AndroidImpl", "resize bitmap width: " + bitmapDecodeByteArray.getWidth() + " height: " + bitmapDecodeByteArray.getHeight() + " getPreviewWidth:" + co0.this.mo107866m());
                    Matrix matrix = new Matrix();
                    matrix.setRotate((float) iM107843F);
                    Bitmap bitmap = bitmapDecodeByteArray;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    xnl xnlVar = RunnableC16202d.this.f81726a;
                    if (xnlVar != null) {
                        xnlVar.mo17910a(bitmapCreateBitmap, false);
                    }
                    co0.this.f81706c.cancelAutoFocus();
                    co0.this.mo107864k("continuous-picture");
                } catch (Exception e) {
                    RecordService.getInstance().recordException(e);
                    xnl xnlVar2 = RunnableC16202d.this.f81726a;
                    if (xnlVar2 != null) {
                        xnlVar2.mo17910a(null, false);
                    }
                    co0.this.f81706c.cancelAutoFocus();
                    co0.this.mo107864k("continuous-picture");
                }
            }
        }

        public RunnableC16202d(xnl xnlVar) {
            this.f81726a = xnlVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                co0.this.f81706c.takePicture(null, null, new a());
            } catch (Exception e) {
                RecordService.getInstance().recordException(e);
            }
        }
    }

    private co0() {
    }

    /* JADX INFO: renamed from: D */
    private void m107841D() {
        Camera.Size sizeM215386e;
        int iMin;
        Camera.Size sizeM215385d;
        if (this.f81707d != null) {
            DeviceSetting deviceSetting = this.f81712i;
            if (deviceSetting == null || deviceSetting.isWidthAuto()) {
                sizeM215386e = this.f81721r ? yn0.m215384c().m215386e(this.f81707d.getSupportedPreviewSizes(), o84.f142594a, o84.f142595b) : yn0.m215384c().m215385d(this.f81707d.getSupportedPreviewSizes(), j4e.m139645c(this.f81704a, this.f81711h), o84.f142596c);
            } else {
                sizeM215386e = yn0.m215384c().m215386e(this.f81707d.getSupportedPreviewSizes(), this.f81712i.getWidth(), 0);
            }
            if (sizeM215386e != null) {
                int i = sizeM215386e.width;
                this.f81716m = i;
                int i2 = sizeM215386e.height;
                this.f81717n = i2;
                this.f81714k = i;
                this.f81715l = i2;
                ixq0.m138888e("AndroidImpl", "setPreviewSize(): mPreviewWidth:" + this.f81716m + " mPreviewHeight:" + this.f81717n);
                this.f81707d.setPreviewSize(this.f81716m, this.f81717n);
                if (!this.f81721r && (sizeM215385d = yn0.m215384c().m215385d(this.f81707d.getSupportedPictureSizes(), j4e.m139645c(this.f81704a, this.f81711h), o84.f142597d)) != null) {
                    Iterator<Camera.Size> it = this.f81707d.getSupportedPictureSizes().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            this.f81707d.setPictureSize(sizeM215385d.width, sizeM215385d.height);
                            break;
                        }
                        Camera.Size next = it.next();
                        if (next.width == this.f81716m && next.height == this.f81717n) {
                            ixq0.m138888e("AndroidImpl", "setPictureSize: size.width:" + next.width + " size.height:" + next.height);
                            this.f81707d.setPictureSize(this.f81716m, this.f81717n);
                            break;
                        }
                    }
                }
            }
            DeviceSetting deviceSetting2 = this.f81712i;
            if (deviceSetting2 != null) {
                this.f81709f = m107843F(deviceSetting2);
                ixq0.m138888e("TAG", " setting mCameraViewRotationAngle:" + this.f81709f);
                this.f81706c.setDisplayOrientation(this.f81709f);
            }
            if (this.f81712i != null && this.f81707d.isZoomSupported() && (iMin = Math.min(Math.max(this.f81712i.getZoom(), 0), this.f81707d.getMaxZoom())) != this.f81707d.getZoom()) {
                this.f81707d.setZoom(iMin);
            }
            List<String> supportedFocusModes = this.f81707d.getSupportedFocusModes();
            Iterator<String> it2 = supportedFocusModes.iterator();
            while (it2.hasNext()) {
                ixq0.m138888e("AndroidImpl", "focusMode:" + it2.next());
            }
            if (this.f81721r) {
                if (supportedFocusModes.contains("continuous-video")) {
                    this.f81707d.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("auto")) {
                    this.f81707d.setFocusMode("auto");
                }
            } else if (supportedFocusModes.contains("continuous-picture")) {
                this.f81707d.setFocusMode("continuous-picture");
            } else if (supportedFocusModes.contains("auto")) {
                this.f81707d.setFocusMode("auto");
            }
            List<Integer> supportedPreviewFormats = this.f81707d.getSupportedPreviewFormats();
            if (supportedPreviewFormats == null || !supportedPreviewFormats.contains(17)) {
                return;
            }
            this.f81707d.setPreviewFormat(17);
        }
    }

    /* JADX INFO: renamed from: E */
    private int m107842E(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((WindowManager) this.f81704a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRotation();
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
    public int m107843F(DeviceSetting deviceSetting) {
        if (deviceSetting == null) {
            ig3.m135964a("deviceSetting can't be null");
            return 0;
        }
        int iM107842E = deviceSetting.isDisplayAuto() ? m107842E(this.f81710g) : deviceSetting.getDisplayAngle();
        Activity activity = this.f81705b;
        if (activity != null && j4e.m139646d()) {
            int iM139643a = j4e.m139643a(activity);
            if (iM139643a == 1) {
                return 90;
            }
            if (iM139643a == 2) {
                return 0;
            }
            if (iM139643a == 3) {
                return 180;
            }
        }
        return iM107842E;
    }

    /* JADX INFO: renamed from: G */
    public static synchronized co0 m107844G() {
        try {
            if (f81703s == null) {
                f81703s = new co0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f81703s;
    }

    /* JADX INFO: renamed from: H */
    private void m107845H(Context context) {
        if (context instanceof Activity) {
            this.f81705b = (Activity) context;
        }
        this.f81704a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: I */
    private boolean m107846I(int i) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "realStartCamera", "cameraId", Integer.toString(i));
        try {
            Camera cameraOpen = Camera.open(i);
            this.f81706c = cameraOpen;
            if (cameraOpen == null) {
                onl onlVar = this.f81708e;
                if (onlVar != null) {
                    onlVar.mo17875S(101, new Throwable("mCamera == null"));
                }
                return false;
            }
            this.f81710g = i;
            this.f81707d = cameraOpen.getParameters();
            m107841D();
            Camera.Parameters parameters = this.f81707d;
            if (parameters == null) {
                return true;
            }
            this.f81706c.setParameters(parameters);
            return true;
        } catch (Exception e) {
            onl onlVar2 = this.f81708e;
            if (onlVar2 != null) {
                onlVar2.mo17875S(101, e);
            }
            return false;
        }
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: a */
    public void mo107854a() {
        synchronized (this.f81713j) {
            try {
                if (this.f81720q) {
                    if (this.f81706c != null) {
                        synchronized (this.f81713j) {
                            try {
                                this.f81706c.setOneShotPreviewCallback(null);
                                this.f81706c.setPreviewCallback(null);
                                this.f81706c.stopPreview();
                            } catch (Exception e) {
                                RecordService.getInstance().recordException(e);
                            }
                        }
                        this.f81720q = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: b */
    public Camera mo107855b() {
        return this.f81706c;
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: c */
    public void mo107856c(xnl xnlVar) {
        Camera camera = this.f81706c;
        if (camera == null) {
            if (xnlVar != null) {
                xnlVar.mo17910a(null, false);
                return;
            }
            return;
        }
        ixq0.m138885b("AndroidImpl", "takePhoto focusMode: " + camera.getParameters().getFocusMode());
        this.f81706c.setAutoFocusMoveCallback(new C16200b());
        this.f81706c.autoFocus(new C16201c(new boolean[]{false}));
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC16202d(xnlVar), 200L);
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: d */
    public void mo107857d(SurfaceHolder surfaceHolder, float f, int i, int i2) {
        synchronized (this.f81713j) {
            try {
                if (this.f81720q) {
                    return;
                }
                Camera camera = this.f81706c;
                if (camera != null) {
                    try {
                        camera.cancelAutoFocus();
                        if (surfaceHolder != null) {
                            this.f81706c.setPreviewDisplay(surfaceHolder);
                        }
                        this.f81706c.setPreviewCallback(new C16199a());
                        this.f81706c.startPreview();
                        this.f81720q = true;
                    } catch (Exception e) {
                        onl onlVar = this.f81708e;
                        if (onlVar != null) {
                            onlVar.mo17875S(101, e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: e */
    public void mo107858e(onl onlVar) {
        this.f81708e = onlVar;
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: f */
    public void mo107859f() {
        if (this.f81718o) {
            this.f81718o = false;
        }
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: g */
    public void mo107860g() {
        Camera.Parameters parameters;
        Camera camera = this.f81706c;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return;
        }
        parameters.setFlashMode(BLiveOperationTitleShowType.off);
        this.f81706c.setParameters(parameters);
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: h */
    public int mo107861h() {
        return this.f81714k;
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: i */
    public int mo107862i() {
        return this.f81715l;
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: j */
    public int mo107863j() {
        return this.f81717n;
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: k */
    public void mo107864k(String str) {
        Camera.Parameters parameters;
        Camera camera = this.f81706c;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return;
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null && supportedFocusModes.contains(str)) {
            parameters.setFocusMode(str);
            this.f81706c.setParameters(parameters);
        }
        this.f81706c.startPreview();
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: l */
    public void mo107865l() {
        synchronized (this.f81713j) {
            Camera camera = this.f81706c;
            if (camera != null) {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setAutoExposureLock(true);
                    parameters.setAutoWhiteBalanceLock(true);
                    this.f81706c.setParameters(parameters);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: m */
    public int mo107866m() {
        return this.f81716m;
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: n */
    public void mo107867n() {
        synchronized (this.f81713j) {
            try {
                if (this.f81719p) {
                    return;
                }
                int iM215382a = yn0.m215382a();
                if (this.f81711h) {
                    iM215382a = yn0.m215383b();
                }
                if (m107846I(iM215382a)) {
                    this.f81719p = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: o */
    public int mo107868o() {
        return this.f81709f;
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: p */
    public void mo107869p(Context context, boolean z, boolean z2, DeviceSetting deviceSetting) {
        this.f81711h = z;
        this.f81721r = z2;
        if (deviceSetting != null) {
            this.f81712i = deviceSetting;
        }
        if (!z) {
            this.f81709f = 270;
        }
        m107845H(context);
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: q */
    public void mo107870q() {
        Camera.Parameters parameters;
        Camera camera = this.f81706c;
        if (camera == null || (parameters = camera.getParameters()) == null) {
            return;
        }
        parameters.setFlashMode("torch");
        this.f81706c.setParameters(parameters);
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: r */
    public void mo107871r() {
        this.f81705b = null;
    }

    @Override // p149l.snl
    /* JADX INFO: renamed from: s */
    public void mo107872s() {
        mo107854a();
        synchronized (this.f81713j) {
            try {
                if (this.f81719p) {
                    this.f81708e = null;
                    Camera camera = this.f81706c;
                    if (camera != null) {
                        try {
                            camera.release();
                            this.f81706c = null;
                            this.f81719p = false;
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
