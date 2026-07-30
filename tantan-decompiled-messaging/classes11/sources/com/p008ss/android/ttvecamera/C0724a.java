package com.p008ss.android.ttvecamera;

import android.content.Context;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bytedance.bpea.basics.Cert;
import com.p008ss.android.ttvecamera.cameracapabilitycollector.TECameraCapabilityCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l.ig3;
import l.qkq0;
import org.json.JSONArray;
import org.json.JSONObject;
import p009l.ajh0;
import p009l.cjh0;
import p009l.gjh0;
import p009l.jih0;
import p009l.kih0;
import p009l.lih0;
import p009l.wjh0;

/* JADX INFO: renamed from: com.ss.android.ttvecamera.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0724a extends AbstractC0726c {

    /* JADX INFO: renamed from: A */
    private gjh0 f9008A;

    /* JADX INFO: renamed from: B */
    private String f9009B;

    /* JADX INFO: renamed from: C */
    private int f9010C;

    /* JADX INFO: renamed from: D */
    private List<TEFrameSizei> f9011D;

    /* JADX INFO: renamed from: E */
    private List<TEFrameSizei> f9012E;

    /* JADX INFO: renamed from: F */
    private List<TEFrameSizei> f9013F;

    /* JADX INFO: renamed from: G */
    private List<Integer> f9014G;

    /* JADX INFO: renamed from: H */
    private float f9015H;

    /* JADX INFO: renamed from: I */
    private int f9016I;

    /* JADX INFO: renamed from: J */
    private AtomicBoolean f9017J;

    /* JADX INFO: renamed from: K */
    private long f9018K;

    /* JADX INFO: renamed from: L */
    private int f9019L;

    /* JADX INFO: renamed from: M */
    private boolean f9020M;

    /* JADX INFO: renamed from: y */
    Camera f9021y;

    /* JADX INFO: renamed from: z */
    private Camera.Parameters f9022z;

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$a */
    public class a implements Camera.ErrorCallback {
        public a() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i, Camera camera) {
            String str;
            int i2;
            ajh0.m11494b("te_record_camera_err_ret", i);
            if (i == 100) {
                str = "Camera server died!";
                i2 = -407;
            } else if (i == 2) {
                str = "Camera disconnected: " + i;
                i2 = -409;
            } else if (i != 1) {
                C0743g.m11174j("TECamera1", "Ignore camera error here: " + i);
                return;
            } else {
                str = "Camera unknown error: " + i;
                i2 = -410;
            }
            C0743g.m11166b("TECamera1", str);
            C0724a c0724a = C0724a.this;
            c0724a.mo10932f(c0724a.f9080t);
            C0724a.this.m11018z0();
            C0724a c0724a2 = C0724a.this;
            AbstractC0726c.a aVar = c0724a2.f9064d;
            if (aVar != null) {
                aVar.mo10845b(1, i2, str, c0724a2.f9021y);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$b */
    public class b implements Camera.PictureCallback {
        public b(TECameraSettings.InterfaceC0713l interfaceC0713l) {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$c */
    public class c implements Camera.PictureCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f9025a;

        public c(long j, TECameraSettings.InterfaceC0713l interfaceC0713l) {
            this.f9025a = j;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            C0743g.m11169e("TECamera1", "capture data arrive consume: " + (System.currentTimeMillis() - this.f9025a));
            Camera camera2 = C0724a.this.f9021y;
            if (camera2 != null) {
                camera2.stopPreview();
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$d */
    public class d implements Camera.AutoFocusCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TEFocusSettings f9027a;

        public d(TEFocusSettings tEFocusSettings) {
            this.f9027a = tEFocusSettings;
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z, Camera camera) {
            String str;
            TEFocusSettings tEFocusSettings = this.f9027a;
            if (z) {
                str = "Camera Focus Succeed!";
                tEFocusSettings.m10871g().mo10885a(this.f9027a.m10872h(), C0724a.this.f9062b.f8939d, "Camera Focus Succeed!");
            } else {
                str = "Camera Focus Failed!";
                tEFocusSettings.m10871g().mo10885a(-1, C0724a.this.f9062b.f8939d, "Camera Focus Failed!");
            }
            C0743g.m11169e("TECamera1", str);
            if (this.f9027a.m10878n() && z) {
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFocusMode("continuous-video");
                camera.setParameters(parameters);
                C0724a c0724a = C0724a.this;
                c0724a.m10925T0(c0724a.f9019L);
            } catch (Exception e) {
                String str2 = "Error: focusAtPoint failed: " + e.toString();
                C0743g.m11166b("TECamera1", str2);
                C0724a c0724a2 = C0724a.this;
                c0724a2.f9064d.mo10846c(1, -411, str2, c0724a2.f9021y);
            }
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f9029a;

        public e(int i) {
            this.f9029a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0724a.this.mo10913C0(this.f9029a);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.a$f */
    public class f implements Camera.OnZoomChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TECameraSettings.InterfaceC0717p f9031a;

        public f(TECameraSettings.InterfaceC0717p interfaceC0717p) {
            this.f9031a = interfaceC0717p;
        }

        @Override // android.hardware.Camera.OnZoomChangeListener
        public void onZoomChange(int i, boolean z, Camera camera) {
            TECameraSettings.InterfaceC0717p interfaceC0717p = this.f9031a;
            if (interfaceC0717p != null) {
                interfaceC0717p.onChange(1, i, z);
            }
        }
    }

    private C0724a(Context context, AbstractC0726c.a aVar, Handler handler, AbstractC0726c.d dVar) {
        super(context, aVar, handler, dVar);
        this.f9009B = "";
        this.f9010C = 0;
        this.f9011D = new ArrayList();
        this.f9012E = new ArrayList();
        this.f9013F = new ArrayList();
        this.f9014G = null;
        this.f9015H = 100.0f;
        this.f9016I = 0;
        this.f9017J = new AtomicBoolean(false);
        this.f9018K = 0L;
        this.f9019L = 0;
        this.f9020M = false;
        this.f9062b = new TECameraSettings(context, 1);
        this.f9008A = new gjh0(1);
        this.f9080t = null;
    }

    /* JADX INFO: renamed from: J0 */
    private void m10899J0() {
        if (this.f9062b.f8932Z) {
            try {
                this.f9022z.setRecordingHint(false);
                this.f9021y.setParameters(this.f9022z);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: K0 */
    private void m10900K0() {
        if (this.f9062b.f8932Z) {
            try {
                this.f9022z.setRecordingHint(true);
                this.f9021y.setParameters(this.f9022z);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static List<TEFrameRateRange> m10901L0(List<int[]> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int[] iArr : list) {
            arrayList.add(new TEFrameRateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M0 */
    public static List<TEFrameSizei> m10902M0(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N0 */
    public static C0724a m10903N0(Context context, AbstractC0726c.a aVar, Handler handler, AbstractC0726c.d dVar) {
        return new C0724a(context, aVar, handler, dVar);
    }

    /* JADX INFO: renamed from: O0 */
    private int m10904O0(int i) {
        List<Integer> list;
        int size = this.f9014G.size() - 1;
        int i2 = 0;
        while (true) {
            int i3 = size - i2;
            list = this.f9014G;
            if (i3 <= 1) {
                break;
            }
            int i4 = (i2 + size) / 2;
            if (i > list.get(i4).intValue()) {
                i2 = i4;
            } else {
                size = i4;
            }
        }
        return Math.abs(i - list.get(i2).intValue()) > Math.abs(i - this.f9014G.get(size).intValue()) ? size : i2;
    }

    /* JADX INFO: renamed from: P0 */
    private List<TEFrameRateRange> m10905P0() {
        Camera.Parameters parameters = this.f9022z;
        if (parameters == null) {
            return null;
        }
        return m10901L0(parameters.getSupportedPreviewFpsRange());
    }

    /* JADX INFO: renamed from: Q0 */
    private List<TEFrameSizei> m10906Q0() {
        Camera.Parameters parameters = this.f9022z;
        if (parameters == null || parameters.getSupportedVideoSizes() == null) {
            this.f9013F.clear();
            return this.f9013F;
        }
        List<TEFrameSizei> listM10902M0 = m10902M0(this.f9022z.getSupportedVideoSizes());
        this.f9013F = listM10902M0;
        return listM10902M0;
    }

    /* JADX INFO: renamed from: R0 */
    private int m10907R0() {
        int[] iArrM11068s;
        TEFrameSizei tEFrameSizeiMo10854a;
        Camera camera = this.f9021y;
        if (camera == null) {
            C0743g.m11166b("TECamera1", "initCamera: Camera is not opened!");
            this.f9064d.mo10846c(1, -401, "initCamera: Camera is not opened!", this.f9021y);
            return -401;
        }
        Camera.Parameters parameters = camera.getParameters();
        this.f9022z = parameters;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (this.f9076p != null) {
            int size = supportedPreviewFpsRange.size();
            ArrayList arrayList = new ArrayList(size);
            boolean z = true;
            int i = 0;
            while (i < size) {
                int[] iArr = supportedPreviewFpsRange.get(i);
                int i2 = iArr[0];
                boolean z2 = i2 >= 1000;
                if (i2 >= 1000) {
                    i2 /= 1000;
                }
                int i3 = iArr[1];
                if (i3 >= 1000) {
                    i3 /= 1000;
                }
                arrayList.add(new int[]{i2, i3});
                i++;
                z = z2;
            }
            iArrM11068s = this.f9076p.mo10853a(arrayList);
            if (z && iArrM11068s != null) {
                iArrM11068s[0] = iArrM11068s[0] * 1000;
                iArrM11068s[1] = iArrM11068s[1] * 1000;
            }
        } else {
            iArrM11068s = null;
        }
        if (iArrM11068s == null) {
            int iM10886a = TEFrameRateRange.m10886a(supportedPreviewFpsRange);
            TECameraSettings tECameraSettings = this.f9062b;
            iArrM11068s = C0735f.m11068s(tECameraSettings.f8921O, tECameraSettings.f8939d, tECameraSettings.f8937c.m10888c(iM10886a), supportedPreviewFpsRange);
            if (iArrM11068s == null && supportedPreviewFpsRange.size() > 0) {
                iArrM11068s = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
            }
        }
        if (iArrM11068s == null) {
            qkq0.a("fps config failed");
            return 0;
        }
        C0743g.m11169e("TECamera1", "Selected FPS Range: " + iArrM11068s[0] + "," + iArrM11068s[1]);
        this.f9064d.mo10848e(121, 0, new TEFrameRateRange(iArrM11068s[0], iArrM11068s[1]).toString(), null);
        AbstractC0726c.e eVar = this.f9075o;
        if (eVar != null) {
            TEFrameSizei previewSize = eVar.getPreviewSize(mo10921O());
            TECameraSettings tECameraSettings2 = this.f9062b;
            if (previewSize != null) {
                tECameraSettings2.f8965q = previewSize;
            } else {
                tECameraSettings2.f8965q = C0735f.m11051b(mo10921O(), this.f9062b.f8965q);
            }
        } else {
            this.f9062b.f8965q = C0735f.m11051b(mo10921O(), this.f9062b.f8965q);
        }
        C0743g.m11169e("TECamera1", "Preview Size:" + this.f9062b.f8965q);
        List<Integer> supportedPictureFormats = this.f9022z.getSupportedPictureFormats();
        int i4 = (this.f9062b.f8966q0 && supportedPictureFormats != null && supportedPictureFormats.contains(17)) ? 17 : 256;
        this.f9022z.setPictureFormat(i4);
        if (i4 == 256) {
            this.f9022z.setJpegQuality(100);
        }
        TECameraSettings tECameraSettings3 = this.f9062b;
        if (tECameraSettings3.f8983z) {
            List<TEFrameSizei> listM10902M0 = m10902M0(this.f9022z.getSupportedPictureSizes());
            TEFrameSizei tEFrameSizeiM10855a = this.f9062b.m10855a();
            TECameraSettings tECameraSettings4 = this.f9062b;
            tECameraSettings3.f8967r = C0735f.m11064o(listM10902M0, tEFrameSizeiM10855a, tECameraSettings4.f8973u, tECameraSettings4.f8981y);
        } else {
            if (this.f9074n != null) {
                List<TEFrameSizei> listM10902M1 = m10902M0(this.f9022z.getSupportedPictureSizes());
                ArrayList arrayList2 = new ArrayList();
                if (i4 == 17 && listM10902M1 != null) {
                    for (TEFrameSizei tEFrameSizei : listM10902M1) {
                        if (tEFrameSizei.width % 16 == 0 && tEFrameSizei.height % 16 == 0) {
                            arrayList2.add(tEFrameSizei);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        C0743g.m11166b("TECamera1", "final pic sizes is empty...");
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.addAll(listM10902M1);
                }
                tEFrameSizeiMo10854a = this.f9074n.mo10854a(arrayList2, m10902M0(this.f9022z.getSupportedPreviewSizes()));
            } else {
                tEFrameSizeiMo10854a = null;
            }
            TECameraSettings tECameraSettings5 = this.f9062b;
            if (tEFrameSizeiMo10854a != null) {
                tECameraSettings5.f8967r = tEFrameSizeiMo10854a;
            } else {
                List<TEFrameSizei> listMo10920N = mo10920N();
                TECameraSettings tECameraSettings6 = this.f9062b;
                tECameraSettings5.f8967r = C0735f.m11065p(listMo10920N, tECameraSettings6.f8965q, tECameraSettings6.f8967r);
            }
        }
        TEFrameSizei tEFrameSizei2 = this.f9062b.f8967r;
        if (tEFrameSizei2 != null) {
            this.f9022z.setPictureSize(tEFrameSizei2.width, tEFrameSizei2.height);
            C0743g.m11169e("TECamera1", "Picture Size:" + this.f9062b.f8967r);
        } else {
            C0743g.m11166b("TECamera1", "No closest supported picture size");
        }
        Camera.Parameters parameters2 = this.f9022z;
        TEFrameSizei tEFrameSizei3 = this.f9062b.f8965q;
        parameters2.setPreviewSize(tEFrameSizei3.width, tEFrameSizei3.height);
        Bundle bundle = this.f9062b.f8911E;
        if (bundle == null || !bundle.getBoolean("enable_dim_light_quality") || iArrM11068s[0] <= iArrM11068s[1]) {
            this.f9022z.setPreviewFpsRange(iArrM11068s[0], iArrM11068s[1]);
            if (this.f9062b.f8922P) {
                C0743g.m11165a("TECamera1", "use setRecordingHint");
                this.f9022z.setRecordingHint(true);
            }
        }
        this.f9022z.setWhiteBalance("auto");
        this.f9022z.setSceneMode("auto");
        this.f9022z.setPreviewFormat(this.f9062b.f8945g);
        this.f9022z.setExposureCompensation(this.f9016I);
        if (this.f9062b.f8927U) {
            if (this.f9022z.isVideoStabilizationSupported()) {
                this.f9022z.setVideoStabilization(true);
                ajh0.m11494b("te_record_camera_stabilization", 1L);
                this.f9064d.mo10848e(113, 1, "", this.f9021y);
            } else {
                ajh0.m11494b("te_record_camera_stabilization", 0L);
            }
        }
        gjh0 gjh0Var = this.f9008A;
        TECameraSettings tECameraSettings7 = this.f9062b;
        String strM15086g = gjh0Var.m15086g(tECameraSettings7.f8939d, this.f9022z, tECameraSettings7.f8911E.getBoolean("enableFrontFacingVideoContinueFocus"));
        this.f9009B = strM15086g;
        if (strM15086g != "") {
            this.f9022z.setFocusMode(strM15086g);
        } else {
            C0743g.m11174j("TECamera1", "No Supported Focus Mode for Facing" + this.f9062b.f8939d);
        }
        this.f9062b.f8917K.f8990a = this.f9022z.getMaxExposureCompensation();
        this.f9062b.f8917K.f8992c = this.f9022z.getMinExposureCompensation();
        this.f9062b.f8917K.f8993d = this.f9022z.getExposureCompensationStep();
        this.f9062b.f8917K.f8991b = this.f9022z.getExposureCompensation();
        if (this.f9062b.f8949i) {
            String str = this.f9022z.get("zsl-values");
            if ("off".equals(this.f9022z.get("zsl")) && str != null && str.contains("on")) {
                this.f9022z.set("zsl", "on");
            }
            boolean zEquals = "on".equals(this.f9022z.get("zsl"));
            this.f9061a = zEquals;
            if (!zEquals && this.f9062b.f8949i && TextUtils.isEmpty(str) && kih0.m17504a() && kih0.m17505b()) {
                String str2 = this.f9022z.get("zsd-mode-values");
                if ("off".equals(this.f9022z.get("zsd-mode")) && str2 != null && str2.contains("on")) {
                    this.f9022z.set("zsd-mode", "on");
                }
                this.f9061a = "on".equals(this.f9022z.get("zsd-mode"));
            }
        }
        C0743g.m11169e("TECamera1", String.format("%s zsl", this.f9061a ? "Enable" : "Disable"));
        this.f9014G = null;
        if (this.f9022z.isZoomSupported()) {
            this.f9014G = this.f9022z.getZoomRatios();
            this.f9072l = this.f9022z.getMaxZoom();
            Collections.sort(this.f9014G);
            this.f9015H = 100.0f;
        } else {
            C0743g.m11166b("TECamera1", "camera don't support zoom");
        }
        if (this.f9062b.f8911E.containsKey("enableShutterSound")) {
            try {
                this.f9021y.enableShutterSound(this.f9062b.f8911E.getBoolean("enableShutterSound"));
            } catch (Exception e2) {
                C0743g.m11166b("TECamera1", "unsupport enableShutterSound, " + e2.getMessage());
            }
        }
        this.f9021y.setParameters(this.f9022z);
        try {
            this.f9021y.setDisplayOrientation(0);
        } catch (Throwable unused) {
        }
        this.f9020M = false;
        return 0;
    }

    /* JADX INFO: renamed from: S0 */
    private int m10908S0(Cert cert) {
        int iM10907R0;
        wjh0.m24289a("TECamera1-innerOpen");
        int i = 0;
        this.f9016I = 0;
        this.f9080t = cert;
        int i2 = -401;
        try {
            TECameraSettings tECameraSettings = this.f9062b;
            if (!tECameraSettings.f8956l0 || TextUtils.isEmpty(tECameraSettings.f8916J)) {
                int numberOfCameras = Camera.getNumberOfCameras();
                this.f9010C = numberOfCameras;
                ajh0.m11494b("te_record_camera_size", numberOfCameras);
                C0743g.m11169e("TECamera1", "innerOpen mNumberOfCameras: " + this.f9010C + ", current mDefaultCameraID:" + this.f9062b.f8943f);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                for (int i3 = 0; i3 < this.f9010C; i3++) {
                    Camera.getCameraInfo(i3, cameraInfo);
                    C0743g.m11169e("TECamera1", "innerOpen cameraInfo facing: " + cameraInfo.facing + ", mCameraSettings.mFacing:" + this.f9062b.f8939d);
                    int i4 = cameraInfo.facing;
                    TECameraSettings tECameraSettings2 = this.f9062b;
                    if (i4 == tECameraSettings2.f8939d) {
                        tECameraSettings2.f8943f = i3;
                        break;
                    }
                }
            } else {
                Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                int i5 = Integer.parseInt(this.f9062b.f8916J);
                Camera.getCameraInfo(i5, cameraInfo2);
                TECameraSettings tECameraSettings3 = this.f9062b;
                tECameraSettings3.f8943f = i5;
                this.f9069i = tECameraSettings3.f8939d;
            }
            TECameraSettings tECameraSettings4 = this.f9062b;
            int i6 = tECameraSettings4.f8943f;
            if (i6 == -1 && this.f9010C > 0 && tECameraSettings4.f8952j0) {
                C0743g.m11174j("TECamera1", "innerOpen: camera info check error");
                throw new RuntimeException("CameraIDError");
            }
            if (i6 == -1 && this.f9010C > 0 && tECameraSettings4.f8950i0) {
                C0743g.m11174j("TECamera1", "innerOpen: camera info check, set CameraID to 0");
                this.f9062b.f8943f = 0;
            }
            C0743g.m11169e("TECamera1", "innerOpen: " + this.f9062b.f8943f);
            this.f9064d.mo10848e(106, 0, "will start camera1", null);
            wjh0.m24289a("TECamera1-innerOpen-openCamera");
            int i7 = this.f9062b.f8943f;
            if (i7 >= 0) {
                this.f9021y = lih0.m17894c(cert, i7);
            } else {
                this.f9021y = lih0.m17894c(cert, i7);
                this.f9062b.f8939d = 0;
                this.f9069i = 0;
                Camera.CameraInfo cameraInfo3 = new Camera.CameraInfo();
                for (int i8 = 0; i8 < this.f9010C; i8++) {
                    Camera.getCameraInfo(i8, cameraInfo3);
                    if (cameraInfo3.facing == this.f9069i) {
                        this.f9062b.f8943f = i8;
                        break;
                    }
                }
            }
            wjh0.m24290b();
            C0743g.m11169e("TECamera1", "innerOpen mNewFacing: " + this.f9069i);
            C0743g.m11169e("TECamera1", "innerOpen mCameraSettings.mDefaultCameraID: " + this.f9062b.f8943f);
            this.f9064d.mo10848e(107, 0, "did start camera1", null);
            if (this.f9021y == null) {
                C0743g.m11166b("TECamera1", "Open Camera Failed with ID:" + this.f9062b.f8943f);
                i2 = this.f9062b.f8943f == -1 ? -405 : -401;
                this.f9064d.mo10849f(1, i2, null, this.f9021y);
                return i2;
            }
            try {
                wjh0.m24289a("TECamera1-initCamera");
                iM10907R0 = m10907R0();
                try {
                    wjh0.m24290b();
                    wjh0.m24289a("TECamera1-fillFeatures");
                    mo10939l();
                    wjh0.m24290b();
                    this.f9064d.mo10848e(1, 0, "TECamera1 features is ready", this.f9021y);
                } catch (Exception e2) {
                    e = e2;
                    i = iM10907R0;
                    C0743g.m11166b("TECamera1", "Open init Camera Failed!: " + Log.getStackTraceString(e));
                    C0734e.m11049a(e);
                    iM10907R0 = i;
                }
            } catch (Exception e3) {
                e = e3;
            }
            this.f9064d.mo10849f(1, iM10907R0, this, this.f9021y);
            wjh0.m24290b();
            return iM10907R0;
        } catch (RuntimeException e4) {
            C0743g.m11166b("TECamera1", "Open Camera Failed!: " + Log.getStackTraceString(e4));
            if (e4.getMessage() != null) {
                if (e4.getMessage().equals("Fail to connect to camera service")) {
                    i2 = -410;
                } else if (e4.getMessage().equals("Camera initialization failed")) {
                    i2 = -407;
                }
            }
            C0734e.m11049a(e4);
            this.f9064d.mo10849f(1, i2, null, this.f9021y);
            this.f9021y = null;
            return i2;
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: A0 */
    public void mo10909A0(TECameraSettings.InterfaceC0717p interfaceC0717p) {
        Camera camera = this.f9021y;
        if (camera == null) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C0743g.m11166b("TECamera1", "stopZoom : Camera is null!");
            this.f9064d.mo10846c(1, -439, "stopZoom : Camera is null!", this.f9021y);
            return;
        }
        try {
            if (camera.getParameters().isSmoothZoomSupported() && interfaceC0717p != null && interfaceC0717p.enableSmooth()) {
                this.f9021y.stopSmoothZoom();
            }
        } catch (Exception e2) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -420. Reason: " + e2);
            String str = "Stop zoom failed : " + e2.toString();
            C0743g.m11166b("TECamera1", str);
            this.f9064d.mo10846c(1, -420, str, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: B */
    public int mo10910B() {
        String flashMode;
        Camera camera = this.f9021y;
        if (camera != null) {
            try {
                flashMode = camera.getParameters().getFlashMode();
            } catch (Exception e2) {
                e2.printStackTrace();
                flashMode = null;
            }
            if ("on".equals(flashMode)) {
                return 1;
            }
            if ("auto".equals(flashMode)) {
                return 3;
            }
            if ("off".equals(flashMode)) {
                return 0;
            }
            if ("torch".equals(flashMode)) {
                return 2;
            }
            if ("red-eye".equals(flashMode)) {
                return 4;
            }
        }
        return -1;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: B0 */
    public void mo10911B0(int i) {
        C0743g.m11174j("TECamera1", "Does not support switch mode for camera1");
        this.f9064d.mo10848e(-200, -200, "Does not support switch mode for camera1", this.f9021y);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: C */
    public int mo10912C() {
        int iM11066q = this.f9071k;
        if (iM11066q < 0) {
            iM11066q = C0735f.m11066q(this.f9066f);
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f9068h = this.f9069i;
        try {
            Camera.getCameraInfo(this.f9062b.f8943f, cameraInfo);
            int i = this.f9068h;
            int i2 = cameraInfo.orientation;
            if (i == 1) {
                this.f9070j = (540 - ((i2 + iM11066q) % 360)) % 360;
            } else {
                this.f9070j = ((i2 - iM11066q) + 360) % 360;
            }
            return this.f9070j;
        } catch (Exception e2) {
            this.f9064d.mo10846c(1, -405, "getFrameOrientation :" + e2.getMessage(), this.f9021y);
            return 0;
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: C0 */
    public void mo10913C0(int i) {
        String str;
        String str2;
        Handler handler;
        if (this.f9021y == null) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C0743g.m11166b("TECamera1", "switchFlashMode failed: Camera is not ready!");
            this.f9064d.mo10846c(1, -439, "switchFlashMode failed: Camera is not ready!", this.f9021y);
            this.f9064d.mo10850g(1, -439, i == 0 ? 0 : 1, "switchFlashMode failed: Camera is not ready!", this.f9021y);
            return;
        }
        if (this.f9018K != 0 && System.currentTimeMillis() - this.f9018K < 200 && (handler = this.f9065e) != null) {
            handler.postDelayed(new e(i), 200L);
            return;
        }
        this.f9020M = false;
        try {
            Camera.Parameters parameters = this.f9021y.getParameters();
            this.f9022z = parameters;
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null) {
                if (i == 0) {
                    str2 = "off";
                } else if (i == 1) {
                    str2 = "on";
                    this.f9020M = true;
                } else if (i == 2) {
                    str2 = "torch";
                } else if (i != 3) {
                    str2 = i != 4 ? null : "red-eye";
                } else {
                    str2 = "auto";
                }
                if (str2 != null && supportedFlashModes.contains(str2)) {
                    this.f9064d.mo10848e(104, 0, "camera1 will change flash mode ".concat(str2), null);
                    this.f9022z.setFlashMode(str2);
                    this.f9021y.setParameters(this.f9022z);
                    if ("off".equalsIgnoreCase(str2) && this.f9062b.f8911E.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                    this.f9064d.mo10848e(105, 0, "camera1 did change flash mode ".concat(str2), null);
                    this.f9064d.mo10851h(1, 0, i == 0 ? 0 : 1, "torch success", this.f9021y);
                    return;
                }
            }
            if (supportedFlashModes != null) {
                str = "Camera does not support flash mode: " + i + "support list: " + supportedFlashModes.toString();
            } else {
                str = "Camera does not support flash mode: " + i;
            }
            String str3 = str;
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: not support flash mode " + i);
            C0743g.m11166b("TECamera1", str3);
            this.f9064d.mo10846c(1, -419, str3, this.f9021y);
            this.f9064d.mo10850g(1, -419, i == 0 ? 0 : 1, str3, this.f9021y);
        } catch (Exception e3) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -419. Reason: " + e3);
            String str4 = "Switch flash mode failed: " + e3.toString();
            C0743g.m11166b("TECamera1", str4);
            this.f9064d.mo10846c(1, -418, str4, this.f9021y);
            this.f9064d.mo10850g(1, -418, i == 0 ? 0 : 1, str4, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: D0 */
    public void mo10914D0(int i, int i2, TECameraSettings.InterfaceC0713l interfaceC0713l) {
        Camera camera = this.f9021y;
        if (camera == null) {
            C0743g.m11166b("TECamera1", "takePicture : camera is null");
            this.f9064d.mo10846c(1, -439, "takePicture : camera is null", this.f9021y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f9022z = parameters;
            if (parameters.getPictureSize().width != i || this.f9022z.getPictureSize().height != i2) {
                TEFrameSizei tEFrameSizeiM11065p = C0735f.m11065p(m10902M0(this.f9022z.getSupportedPictureSizes()), this.f9062b.m10855a(), new TEFrameSizei(i, i2));
                this.f9022z.setPictureSize(tEFrameSizeiM11065p.width, tEFrameSizeiM11065p.height);
                List<Integer> supportedPictureFormats = this.f9022z.getSupportedPictureFormats();
                if (this.f9062b.f8966q0 && supportedPictureFormats != null && supportedPictureFormats.contains(17)) {
                    this.f9022z.setPictureFormat(17);
                } else {
                    this.f9022z.setPictureFormat(256);
                    this.f9022z.setJpegQuality(100);
                }
                this.f9021y.setParameters(this.f9022z);
            }
            this.f9063c = false;
            this.f9021y.takePicture(null, null, new b(interfaceC0713l));
        } catch (Exception e2) {
            C0734e.m11049a(e2);
            if (interfaceC0713l != null) {
                interfaceC0713l.m10861a(m11008h(e2, -1000));
            }
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: E0 */
    public void mo10915E0(TECameraSettings.InterfaceC0713l interfaceC0713l) {
        if (this.f9021y == null) {
            C0743g.m11166b("TECamera1", "takePicture: camera is null.");
            this.f9064d.mo10846c(1, -439, "takePicture: camera is null.", this.f9021y);
            return;
        }
        try {
            this.f9063c = false;
            C0743g.m11169e("TECamera1", "takePicture size: " + this.f9062b.f8967r.toString());
            this.f9021y.takePicture(null, null, new c(System.currentTimeMillis(), interfaceC0713l));
        } catch (Exception e2) {
            C0734e.m11049a(e2);
            if (interfaceC0713l != null) {
                interfaceC0713l.m10861a(m11008h(e2, -1000));
            }
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: F0 */
    public void mo10916F0(boolean z) {
        this.f9020M = false;
        if (this.f9021y == null) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -439. Reason: mCameraDevice is null");
            C0743g.m11166b("TECamera1", "toggleTorch : Camera is not ready!");
            this.f9064d.mo10846c(1, -439, "toggleTorch : Camera is not ready!", this.f9021y);
            this.f9064d.mo10850g(1, -439, z ? 1 : 0, "toggleTorch : Camera is not ready!", this.f9021y);
            return;
        }
        if (this.f9062b.f8939d == 1) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -416. Reason: not support torch");
            C0743g.m11174j("TECamera1", "Front camera does not support torch!");
            this.f9064d.mo10848e(-416, -416, "Front camera does not support torch!", this.f9021y);
            this.f9064d.mo10850g(1, -416, z ? 1 : 0, "Front camera does not support torch!", this.f9021y);
            return;
        }
        try {
            this.f9064d.mo10848e(104, 0, "camera1 will change flash mode " + z, null);
            Camera.Parameters parameters = this.f9021y.getParameters();
            this.f9022z = parameters;
            parameters.setFlashMode(z ? "torch" : "off");
            this.f9021y.setParameters(this.f9022z);
            this.f9064d.mo10848e(105, 0, "camera1 did change flash mode " + z, null);
            this.f9064d.mo10851h(1, 0, z ? 1 : 0, "toggleTorch " + z, this.f9021y);
        } catch (Exception e2) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -417. Reason: " + e2);
            String str = "Toggle torch failed: " + e2.toString();
            C0743g.m11166b("TECamera1", str);
            this.f9064d.mo10846c(1, -417, str, this.f9021y);
            this.f9064d.mo10850g(1, -417, z ? 1 : 0, str, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: H0 */
    public void mo10917H0(float f2, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        List<Integer> list = this.f9014G;
        if (list == null || this.f9021y == null) {
            return;
        }
        float f3 = this.f9015H * f2;
        this.f9015H = f3;
        try {
            if (f3 < list.get(0).intValue()) {
                this.f9015H = this.f9014G.get(0).intValue();
            }
            float f4 = this.f9015H;
            List<Integer> list2 = this.f9014G;
            if (f4 > list2.get(list2.size() - 1).intValue()) {
                List<Integer> list3 = this.f9014G;
                this.f9015H = list3.get(list3.size() - 1).intValue();
            }
            Camera.Parameters parameters = this.f9021y.getParameters();
            if (parameters == null || !parameters.isZoomSupported()) {
                C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: getParameters is null");
                C0743g.m11166b("TECamera1", "setZoom failed for getParameters null");
                return;
            }
            int iM10904O0 = m10904O0((int) this.f9015H);
            if (parameters.getZoom() != iM10904O0) {
                parameters.setZoom(iM10904O0);
                this.f9021y.setParameters(parameters);
                if (interfaceC0717p != null) {
                    interfaceC0717p.onChange(1, this.f9014G.get(iM10904O0).intValue() / 100.0f, true);
                }
            }
        } catch (Exception e2) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: SET_ZOOM. Code: -420. Reason: " + e2);
            C0743g.m11166b("TECamera1", "setZoom failed, " + e2.getMessage());
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: I */
    public int[] mo10918I() {
        Camera.Size pictureSize;
        Camera camera = this.f9021y;
        if (camera != null) {
            try {
                pictureSize = camera.getParameters().getPictureSize();
            } catch (Exception e2) {
                e2.printStackTrace();
                pictureSize = null;
            }
        } else {
            pictureSize = null;
        }
        if (pictureSize == null) {
            return null;
        }
        return new int[]{pictureSize.width, pictureSize.height};
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: J */
    public int[] mo10919J() {
        Camera camera = this.f9021y;
        if (camera == null) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            camera.getParameters().getPreviewFpsRange(iArr);
            iArr[0] = iArr[0] / 1000;
            iArr[1] = iArr[1] / 1000;
            return iArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: N */
    public List<TEFrameSizei> mo10920N() {
        Camera.Parameters parameters = this.f9022z;
        if (parameters == null) {
            this.f9012E.clear();
            return this.f9012E;
        }
        List<TEFrameSizei> listM10902M0 = m10902M0(parameters.getSupportedPictureSizes());
        this.f9012E = listM10902M0;
        return listM10902M0;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: O */
    public List<TEFrameSizei> mo10921O() {
        Camera.Parameters parameters = this.f9022z;
        if (parameters == null) {
            this.f9011D.clear();
            return this.f9011D;
        }
        List<TEFrameSizei> listM10902M0 = m10902M0(parameters.getSupportedPreviewSizes());
        this.f9011D = listM10902M0;
        return listM10902M0;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: Q */
    public boolean mo10922Q() {
        Camera.Parameters parameters;
        C0743g.m11169e("TECamera1", "isAutoExposureLockSupported...");
        if (this.f9021y == null || (parameters = this.f9022z) == null || !this.f9063c) {
            return false;
        }
        return parameters.isAutoExposureLockSupported();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: R */
    public boolean mo10923R() {
        Camera.Parameters parameters;
        C0743g.m11169e("TECamera1", "isAutoFocusLockSupported...");
        Camera camera = this.f9021y;
        if (camera == null || (parameters = this.f9022z) == null || !this.f9063c) {
            this.f9064d.mo10846c(1, -439, "setAutoFocusLock failed. ： Camera is null.", camera);
            return false;
        }
        try {
            return parameters.getSupportedFocusModes().contains("fixed");
        } catch (Exception unused) {
            this.f9064d.mo10848e(-433, -433, "isAutoFocusLockSupported failed", this.f9021y);
            return false;
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: T */
    public boolean mo10924T() {
        Camera.Parameters parameters;
        try {
            return (this.f9021y == null || (parameters = this.f9022z) == null || parameters.getSupportedWhiteBalance() == null || !this.f9022z.isAutoWhiteBalanceLockSupported()) ? false : true;
        } catch (Exception e2) {
            C0743g.m11166b("TECamera1", "Unsupported whileBalance!: " + e2.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m10925T0(int i) {
        C0743g.m11165a("TECamera1", "Camera start face detect");
        if (!this.f9063c || this.f9021y == null || this.f9022z.getMaxNumDetectedFaces() <= 0) {
            return;
        }
        try {
            if (i == 1) {
                if (this.f9068h == 1) {
                    this.f9021y.startFaceDetection();
                    C0743g.m11169e("TECamera1", "use faceae for front");
                    return;
                }
                return;
            }
            if (i == 2) {
                if (this.f9068h == 0) {
                    this.f9021y.startFaceDetection();
                    C0743g.m11169e("TECamera1", "use faceae for rear");
                    return;
                }
                return;
            }
            if (i == 3) {
                this.f9021y.startFaceDetection();
                C0743g.m11169e("TECamera1", "use faceae for all");
            }
        } catch (Exception unused) {
            C0743g.m11166b("TECamera1", "camera start face detect failed");
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: U */
    public boolean mo10926U() {
        C0743g.m11169e("TECamera1", "isSupportedExposureCompensation...");
        if (this.f9021y == null || this.f9022z == null || !this.f9063c) {
            return false;
        }
        return this.f9062b.f8917K.m10857a();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: V */
    public boolean mo10927V() {
        Bundle bundle = m10992A().get(this.f9062b.f8914H);
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean("camera_torch_supported", false);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: W */
    public int mo10928W(TECameraSettings tECameraSettings, Cert cert) {
        super.mo10928W(tECameraSettings, cert);
        this.f9062b = tECameraSettings;
        this.f9069i = tECameraSettings.f8939d;
        return m10908S0(cert);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: Z */
    public void mo10929Z(TECameraSettings.InterfaceC0715n interfaceC0715n) {
        if (interfaceC0715n == null) {
            C0743g.m11166b("TECamera1", "ShaderZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f9021y;
        if (camera == null) {
            C0743g.m11166b("TECamera1", "queryShaderZoomStep : Camera is null!");
            this.f9064d.mo10846c(1, -439, "queryShaderZoomStep : Camera is null!", this.f9021y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            if (parameters == null || !parameters.isZoomSupported()) {
                return;
            }
            int maxZoom = parameters.getMaxZoom();
            if (maxZoom > 99) {
                maxZoom = 99;
            }
            List<Integer> zoomRatios = parameters.getZoomRatios();
            if (maxZoom <= 0) {
                interfaceC0715n.m10862a(0.0f);
            } else {
                interfaceC0715n.m10862a(((float) Math.pow(((zoomRatios.get(1).intValue() - zoomRatios.get(0).intValue()) / 100.0f) + 1.0f, 0.5d)) - 1.0f);
            }
        } catch (Exception e2) {
            String str = "Query shader zoom step failed : " + e2.toString();
            C0743g.m11166b("TECamera1", str);
            this.f9064d.mo10846c(1, -420, str, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: a0 */
    public void mo10930a0(TECameraSettings.InterfaceC0717p interfaceC0717p, boolean z) {
        if (interfaceC0717p == null) {
            C0743g.m11166b("TECamera1", "ZoomCallback is null, do nothing!");
            return;
        }
        Camera camera = this.f9021y;
        if (camera == null) {
            C0743g.m11166b("TECamera1", "queryZoomAbility : Camera is null!");
            this.f9064d.mo10846c(1, -439, "queryZoomAbility : Camera is null!", this.f9021y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            float maxZoom = parameters.getMaxZoom();
            this.f9072l = maxZoom;
            if (!z) {
                interfaceC0717p.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), parameters.getMaxZoom(), parameters.getZoomRatios());
            } else {
                interfaceC0717p.onZoomSupport(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), this.f9014G.get((int) maxZoom).intValue() / 100.0f, parameters.getZoomRatios());
            }
        } catch (Exception e2) {
            String str = "Query zoom ability failed : " + e2.toString();
            C0743g.m11166b("TECamera1", str);
            this.f9064d.mo10846c(1, -420, str, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: c */
    public void mo10931c() {
        C0743g.m11165a("TECamera1", "cancelFocus...");
        Camera camera = this.f9021y;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: f */
    public void mo10932f(Cert cert) {
        this.f9020M = false;
        C0743g.m11169e("TECamera1", "Camera close start...");
        if (this.f9021y != null) {
            if (this.f9063c) {
                try {
                    C0743g.m11169e("TECamera1", "Camera close torch...");
                    Camera.Parameters parameters = this.f9021y.getParameters();
                    this.f9022z = parameters;
                    parameters.setFlashMode("off");
                    this.f9021y.setParameters(this.f9022z);
                    C0743g.m11169e("TECamera1", "Camera stopPreview...");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f9021y.stopPreview();
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C0743g.m11169e("TECamera1", "Camera stopPreview end...");
                    ajh0.m11494b("te_record_camera1_stop_preview_cost", jCurrentTimeMillis2);
                    C0743g.m11170f("te_record_camera1_stop_preview_cost", Long.valueOf(jCurrentTimeMillis2));
                    int iM12620g = this.f9067g.m12620g();
                    cjh0 cjh0Var = this.f9067g;
                    if (iM12620g == 1) {
                        cjh0Var.m12621h().setOnFrameAvailableListener(null, null);
                    } else if (cjh0Var.m12620g() == 4) {
                        this.f9021y.setPreviewCallbackWithBuffer(null);
                    }
                } catch (Exception e2) {
                    C0743g.m11166b("TECamera1", "Close camera failed: " + e2.getMessage());
                }
                this.f9063c = false;
            }
            try {
                this.f9021y.setErrorCallback(null);
                this.f9064d.mo10848e(108, 0, "will close camera1", null);
                lih0.m17893b(cert, this.f9021y);
                this.f9064d.mo10848e(109, 0, "did close camera1", null);
            } catch (Exception e3) {
                C0743g.m11166b("TECamera1", "Camera release failed: " + e3.getMessage());
            }
            this.f9017J.set(false);
            this.f9021y = null;
            C0743g.m11169e("TECamera1", "Camera closed end!");
            this.f9064d.mo10852i(1, this, this.f9021y);
        }
        this.f9080t = null;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: g */
    public void mo10933g() {
        wjh0.m24289a("TECamera1-collectCameraCapabilities");
        if (!m10999S()) {
            wjh0.m24290b();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f9022z != null) {
                this.f9082v.putOpt("camera_id", Integer.valueOf(this.f9062b.f8943f));
                if (this.f9022z.isZoomSupported()) {
                    this.f9082v.putOpt("camera_zoom_max_ability", Integer.valueOf(this.f9022z.getMaxZoom()));
                }
                List<TEFrameSizei> listMo10921O = mo10921O();
                if (listMo10921O != null) {
                    this.f9081u.m11019a(new TECameraCapabilityCollector.C0730a(TECameraCapabilityCollector.Capability.PREVIEW_SIZE, TECameraCapabilityCollector.DataType.STRING, this.f9062b.f8914H + "=" + listMo10921O.toString()));
                    JSONArray jSONArray = new JSONArray();
                    for (TEFrameSizei tEFrameSizei : listMo10921O) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("width", Integer.valueOf(tEFrameSizei.width));
                        jSONObject.putOpt("height", Integer.valueOf(tEFrameSizei.height));
                        jSONArray.put(jSONObject);
                    }
                    this.f9082v.putOpt("preview_size_lit", jSONArray);
                }
            }
        } catch (Exception unused) {
        }
        List<int[]> supportedPreviewFpsRange = this.f9022z.getSupportedPreviewFpsRange();
        StringBuilder sb = new StringBuilder(this.f9062b.f8914H + "=");
        try {
            JSONArray jSONArray2 = new JSONArray();
            if (supportedPreviewFpsRange != null) {
                for (int[] iArr : supportedPreviewFpsRange) {
                    sb.append("[");
                    sb.append(iArr[0] / 1000);
                    sb.append(",");
                    sb.append(iArr[1] / 1000);
                    sb.append("]");
                    if (supportedPreviewFpsRange.indexOf(iArr) != supportedPreviewFpsRange.size() - 1) {
                        sb.append(", ");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("fps_min", Integer.valueOf(iArr[0] / 1000));
                    jSONObject2.putOpt("fps_max", Integer.valueOf(iArr[1] / 1000));
                    jSONArray2.put(jSONObject2);
                }
                this.f9081u.m11019a(new TECameraCapabilityCollector.C0730a(TECameraCapabilityCollector.Capability.FPS_RANGE, TECameraCapabilityCollector.DataType.STRING, sb.toString()));
                this.f9082v.putOpt("fps_range_list", jSONArray2);
            }
        } catch (Exception unused2) {
        }
        this.f9081u.m11022d();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0743g.m11169e("TECamera1", "collectCameraCapabilities consume: " + jCurrentTimeMillis2);
        ajh0.m11494b("te_record_camera_collect_capbilities_cost", jCurrentTimeMillis2);
        this.f9083w = true;
        wjh0.m24290b();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: g0 */
    public void mo10934g0(boolean z) {
        Camera.Parameters parameters;
        C0743g.m11169e("TECamera1", "setAutoExposureLock...");
        Camera camera = this.f9021y;
        if (camera == null || (parameters = this.f9022z) == null || !this.f9063c) {
            this.f9064d.mo10846c(1, -439, "setAutoExposureLock failed. ： Camera is null.", camera);
            return;
        }
        if (!parameters.isAutoExposureLockSupported()) {
            C0743g.m11174j("TECamera1", "Current camera doesn't support ae lock.");
            this.f9064d.mo10848e(-426, -426, "Current camera doesn't support ae lock.", this.f9021y);
            return;
        }
        try {
            this.f9022z.setAutoExposureLock(z);
            this.f9021y.setParameters(this.f9022z);
        } catch (Exception e2) {
            String str = "Error: setAutoExposureLock failed: " + e2.toString();
            C0743g.m11166b("TECamera1", str);
            this.f9064d.mo10848e(-427, -427, str, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: h0 */
    public void mo10935h0(boolean z) {
        C0743g.m11169e("TECamera1", "setAutoFocusLock...");
        Camera camera = this.f9021y;
        if (camera == null || this.f9022z == null || !this.f9063c) {
            this.f9064d.mo10846c(1, -439, "setAutoFocusLock failed. ： Camera is null.", camera);
            return;
        }
        if (!mo10923R()) {
            C0743g.m11174j("TECamera1", "Current camera doesn't support af lock.");
            this.f9064d.mo10848e(-433, -433, "Current camera doesn't support af lock.", this.f9021y);
            return;
        }
        Camera.Parameters parameters = this.f9022z;
        try {
            if (z) {
                parameters.setFocusMode("fixed");
            } else {
                parameters.setFocusMode("continuous-video");
            }
            this.f9021y.setParameters(this.f9022z);
        } catch (Exception e2) {
            String str = "Error: setAutoFocusLock failed: " + e2.toString();
            C0743g.m11166b("TECamera1", str);
            this.f9064d.mo10848e(-427, -427, str, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: j */
    public void mo10936j() {
        if (this.f9021y == null || this.f9022z == null) {
            return;
        }
        C0743g.m11165a("TECamera1", "enableCaf...");
        try {
            if (this.f9022z.getSupportedFocusModes().contains("continuous-video")) {
                this.f9021y.cancelAutoFocus();
                this.f9022z.setFocusMode("continuous-video");
                this.f9021y.setParameters(this.f9022z);
            }
        } catch (Throwable th) {
            String str = "Error: focusAtPoint failed: " + th.toString();
            C0743g.m11166b("TECamera1", str);
            this.f9064d.mo10846c(1, -411, str, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: j0 */
    public boolean mo10937j0(int i) {
        String str;
        int i2;
        this.f9016I = i;
        C0743g.m11169e("TECamera1", "setExposureCompensation... value: " + i);
        int i3 = -413;
        if (this.f9021y == null || this.f9022z == null || !this.f9063c || !this.f9062b.f8917K.m10857a()) {
            Camera camera = this.f9021y;
            if (camera == null || this.f9022z == null || !this.f9063c) {
                this.f9064d.mo10846c(1, -439, "setExposureCompensation ： Camera is null.", camera);
                str = "setExposureCompensation ： Camera is null.";
            } else {
                i3 = -414;
                str = "Unsupported exposure compensation!";
            }
            this.f9064d.mo10846c(1, i3, str, this.f9021y);
            i2 = i3;
        } else {
            TECameraSettings.C0705d c0705d = this.f9062b.f8917K;
            if (i > c0705d.f8990a || i < c0705d.f8992c) {
                this.f9064d.mo10846c(1, -415, "Invalid exposure: " + i, this.f9021y);
                return false;
            }
            try {
                this.f9022z.setExposureCompensation(i);
                this.f9021y.setParameters(this.f9022z);
                this.f9062b.f8917K.f8991b = this.f9022z.getExposureCompensation();
                StringBuilder sb = new StringBuilder("EC = ");
                sb.append(this.f9062b.f8917K.f8991b);
                sb.append(", EV = ");
                TECameraSettings.C0705d c0705d2 = this.f9062b.f8917K;
                sb.append(c0705d2.f8991b * c0705d2.f8993d);
                C0743g.m11165a("TECamera1", sb.toString());
                str = null;
                i2 = 0;
            } catch (Exception e2) {
                str = "Error: setExposureCompensation failed: " + e2.toString();
                this.f9064d.mo10846c(1, -413, str, this.f9021y);
                i2 = -1;
            }
        }
        boolean z = i2 == 0;
        if (!z) {
            C0743g.m11166b("TECamera1", "setExposureCompensation failed: " + str);
        }
        return z;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: k0 */
    public void mo10938k0(Bundle bundle) {
        super.mo10938k0(bundle);
        if (bundle == null) {
            return;
        }
        Bundle bundle2 = this.f9078r.get(this.f9062b.f8914H);
        for (String str : bundle.keySet()) {
            if (TECameraSettings.C0712k.m10860a(str, bundle.get(str)) && TextUtils.equals(str, "support_light_soft")) {
                bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
            }
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    @RequiresApi(api = 21)
    /* JADX INFO: renamed from: l */
    public Bundle mo10939l() {
        Camera.Parameters parameters;
        this.f9062b.f8914H = this.f9062b.f8939d + "";
        Bundle bundleMo10939l = super.mo10939l();
        if (bundleMo10939l != null) {
            bundleMo10939l.putParcelableArrayList("support_preview_sizes", (ArrayList) mo10921O());
            bundleMo10939l.putParcelableArrayList("support_picture_sizes", (ArrayList) mo10920N());
            bundleMo10939l.putParcelableArrayList("support_video_sizes", (ArrayList) m10906Q0());
            bundleMo10939l.putParcelableArrayList("camera_support_fps_range", (ArrayList) m10905P0());
            bundleMo10939l.putParcelable("camera_preview_size", this.f9062b.f8965q);
            try {
                bundleMo10939l.putBoolean("camera_torch_supported", (this.f9021y == null || (parameters = this.f9022z) == null || parameters.getSupportedFlashModes() == null) ? false : true);
                return bundleMo10939l;
            } catch (Exception e2) {
                C0743g.m11166b("TECamera1", "Get camera torch information failed: " + e2.toString());
                bundleMo10939l.putBoolean("camera_torch_supported", false);
            }
        }
        return bundleMo10939l;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: m */
    public void mo10940m(TEFocusSettings tEFocusSettings) {
        Camera camera = this.f9021y;
        if (camera == null) {
            C0743g.m11166b("TECamera1", "focusAtPoint: camera is null.");
            tEFocusSettings.m10871g().mo10885a(-439, this.f9062b.f8939d, "focusAtPoint: camera is null.");
            this.f9064d.mo10846c(1, -439, "focusAtPoint: camera is null.", this.f9021y);
            return;
        }
        boolean z = false;
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f9022z = parameters;
            if (!this.f9008A.m15084e(parameters, this.f9009B)) {
                C0743g.m11166b("TECamera1", "Error: not support focus.");
                this.f9064d.mo10848e(-412, -412, "Error: not support focus.", this.f9021y);
                if (!this.f9008A.m15085f(this.f9062b.f8939d, this.f9022z) || !tEFocusSettings.m10880p()) {
                    tEFocusSettings.m10871g().mo10885a(-412, this.f9062b.f8939d, "Error: not support focus.");
                    return;
                }
                tEFocusSettings.m10868d();
                this.f9022z.setMeteringAreas(this.f9008A.m15081b(tEFocusSettings.m10874j(), tEFocusSettings.m10873i(), tEFocusSettings.m10870f(), tEFocusSettings.m10875k(), tEFocusSettings.m10876l(), this.f9062b.f8941e, tEFocusSettings.m10869e()));
                this.f9021y.setParameters(this.f9022z);
                return;
            }
            if (tEFocusSettings.m10880p() && this.f9008A.m15085f(this.f9062b.f8939d, this.f9022z)) {
                tEFocusSettings.m10868d();
                this.f9022z.setMeteringAreas(this.f9008A.m15081b(tEFocusSettings.m10874j(), tEFocusSettings.m10873i(), tEFocusSettings.m10870f(), tEFocusSettings.m10875k(), tEFocusSettings.m10876l(), this.f9062b.f8941e, tEFocusSettings.m10869e()));
            }
            if (!tEFocusSettings.m10879o()) {
                this.f9021y.setParameters(this.f9022z);
                C0743g.m11169e("TECamera1", "focus is not enable!");
                return;
            }
            tEFocusSettings.m10867c();
            this.f9022z.setFocusAreas(this.f9008A.m15080a(tEFocusSettings.m10874j(), tEFocusSettings.m10873i(), tEFocusSettings.m10870f(), tEFocusSettings.m10875k(), tEFocusSettings.m10876l(), this.f9062b.f8941e, tEFocusSettings.m10869e()));
            this.f9021y.cancelAutoFocus();
            this.f9022z.setFocusMode("auto");
            if (this.f9020M && !tEFocusSettings.m10877m()) {
                this.f9022z.setFlashMode("off");
                z = true;
            }
            this.f9021y.setParameters(this.f9022z);
            this.f9021y.autoFocus(new d(tEFocusSettings));
            if (z) {
                try {
                    this.f9022z.setFlashMode("on");
                    this.f9021y.setParameters(this.f9022z);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            String str = "Error: focusAtPoint failed: " + e2.toString();
            C0743g.m11166b("TECamera1", str);
            tEFocusSettings.m10871g().mo10885a(-411, this.f9062b.f8939d, str);
            this.f9064d.mo10846c(1, -411, str, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: n */
    public void mo10941n(Cert cert) {
        super.mo10941n(cert);
        C0743g.m11169e("TECamera1", "force close camera: " + this.f9021y);
        try {
            Camera camera = this.f9021y;
            if (camera != null) {
                lih0.m17893b(cert, camera);
                this.f9021y = null;
            }
        } catch (Exception unused) {
            C0743g.m11166b("TECamera1", "force close camera failed");
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: n0 */
    public void mo10942n0(int i, int i2) {
        TECameraSettings tECameraSettings = this.f9062b;
        tECameraSettings.f8907A = true;
        TEFrameSizei tEFrameSizei = tECameraSettings.f8967r;
        tEFrameSizei.width = i;
        tEFrameSizei.height = i2;
        mo10953x0();
        mo10949u0();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: o0 */
    public void mo10943o0() {
        Camera.Parameters parameters = this.f9022z;
        if (parameters == null) {
            return;
        }
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        int iM10886a = TEFrameRateRange.m10886a(supportedPreviewFpsRange);
        TECameraSettings tECameraSettings = this.f9062b;
        int[] iArrM11068s = C0735f.m11068s(tECameraSettings.f8921O, tECameraSettings.f8939d, tECameraSettings.f8937c.m10888c(iM10886a), supportedPreviewFpsRange);
        this.f9022z.setPreviewFpsRange(iArrM11068s[0], iArrM11068s[1]);
        this.f9064d.mo10848e(121, 0, new TEFrameRateRange(iArrM11068s[0], iArrM11068s[1]).toString(), null);
        this.f9021y.setParameters(this.f9022z);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: p */
    public TEFrameSizei mo10944p(float f2, TEFrameSizei tEFrameSizei) {
        Camera camera = this.f9021y;
        if (camera == null) {
            C0743g.m11166b("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.f9022z == null) {
            this.f9022z = camera.getParameters();
        }
        return tEFrameSizei != null ? C0735f.m11051b(mo10921O(), tEFrameSizei) : C0735f.m11052c(mo10921O(), f2);
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: q */
    public JSONObject mo10945q() {
        return this.f9082v;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: r */
    public int[] mo10946r() {
        Camera camera = this.f9021y;
        if (camera == null) {
            return null;
        }
        try {
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: r0 */
    public void mo10947r0(int i) {
        super.mo10947r0(i);
        if (i == 0) {
            m10899J0();
        } else if (i == 1) {
            m10900K0();
        } else {
            ig3.a("un support scene");
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: t0 */
    public void mo10948t0(boolean z, String str) {
        Camera camera = this.f9021y;
        if (camera == null || !this.f9063c) {
            C0743g.m11166b("TECamera1", "setWhileBalance : Camera is null!");
            this.f9064d.mo10846c(1, -439, "setWhileBalance : Camera is null!", this.f9021y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f9022z = parameters;
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            if (supportedWhiteBalance != null && supportedWhiteBalance.contains(str)) {
                this.f9022z.setWhiteBalance(str);
                this.f9021y.setParameters(this.f9022z);
                return;
            }
            String str2 = "SupportWBList has no value: " + str;
            C0743g.m11166b("TECamera1", str2);
            this.f9064d.mo10846c(1, -424, str2, this.f9021y);
        } catch (Exception e2) {
            String str3 = "Set WhileBalance failed: " + e2.toString();
            C0743g.m11166b("TECamera1", str3);
            this.f9064d.mo10846c(1, -424, str3, this.f9021y);
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x02c8  */
    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: u0 */
    public void mo10949u0() {
        int i;
        wjh0.m24289a("TECamera1-startCapture");
        C0743g.m11169e("TECamera1", "Camera startPreview...");
        if (this.f9063c) {
            C0743g.m11174j("TECamera1", "Camera is previewing...");
            return;
        }
        if (this.f9021y != null) {
            try {
                cjh0 cjh0Var = this.f9067g;
                if (cjh0Var == null) {
                    throw new AndroidRuntimeException("ProviderManager is null");
                }
                AbstractC0726c.e eVar = this.f9075o;
                if (eVar != null) {
                    cjh0Var.m12625l(eVar);
                }
                if (this.f9022z == null) {
                    this.f9022z = this.f9021y.getParameters();
                }
                int iM12623j = this.f9067g.m12623j(m10902M0(this.f9022z.getSupportedPreviewSizes()), this.f9062b.f8965q);
                if (iM12623j != 0) {
                    C0743g.m11166b("TECamera1", "Init provider failed, ret = " + iM12623j);
                    return;
                }
                int iM12620g = this.f9067g.m12620g();
                cjh0 cjh0Var2 = this.f9067g;
                if (iM12620g == 1) {
                    if (cjh0Var2.m12621h() == null) {
                        C0743g.m11166b("TECamera1", "SurfaceTexture is null");
                        throw new AndroidRuntimeException("SurfaceTexture is null");
                    }
                    this.f9021y.setPreviewTexture(this.f9067g.m12621h());
                } else {
                    if (cjh0Var2.m12620g() != 4) {
                        C0743g.m11166b("TECamera1", "Unsupported camera provider type : " + this.f9067g.m12620g());
                        return;
                    }
                    jih0 jih0Var = (jih0) this.f9067g.m12619f();
                    if (jih0Var == null) {
                        throw new AndroidRuntimeException("Provider is null");
                    }
                    if (this.f9017J.compareAndSet(false, true)) {
                        for (byte[] bArr : jih0Var.m17122r(3)) {
                            this.f9021y.addCallbackBuffer(bArr);
                        }
                    }
                    this.f9021y.setPreviewCallbackWithBuffer(jih0Var.m17123s());
                    if (this.f9067g.m12621h() != null) {
                        this.f9021y.setPreviewTexture(this.f9067g.m12621h());
                    }
                }
                if (this.f9014G != null && Float.compare(this.f9062b.f8980x0, 1.0f) != 0) {
                    float f2 = this.f9015H * this.f9062b.f8980x0;
                    this.f9015H = f2;
                    if (f2 < this.f9014G.get(0).intValue()) {
                        this.f9015H = this.f9014G.get(0).intValue();
                    } else {
                        float f3 = this.f9015H;
                        List<Integer> list = this.f9014G;
                        if (f3 > list.get(list.size() - 1).intValue()) {
                            List<Integer> list2 = this.f9014G;
                            this.f9015H = list2.get(list2.size() - 1).intValue();
                        }
                    }
                    this.f9022z.setZoom(m10904O0((int) this.f9015H));
                    this.f9021y.setParameters(this.f9022z);
                }
                TEFrameSizei tEFrameSizeiM12616c = this.f9067g.m12616c();
                if (tEFrameSizeiM12616c != null) {
                    if (this.f9022z.getPreviewSize().width != tEFrameSizeiM12616c.width || this.f9022z.getPreviewSize().height != tEFrameSizeiM12616c.height) {
                        this.f9022z.setPreviewSize(tEFrameSizeiM12616c.width, tEFrameSizeiM12616c.height);
                        TECameraSettings tECameraSettings = this.f9062b;
                        if (tECameraSettings.f8983z) {
                            if (tECameraSettings.f8907A) {
                                tECameraSettings.f8907A = false;
                            } else {
                                List<TEFrameSizei> listM10902M0 = m10902M0(this.f9022z.getSupportedPictureSizes());
                                TECameraSettings tECameraSettings2 = this.f9062b;
                                tECameraSettings.f8967r = C0735f.m11064o(listM10902M0, tEFrameSizeiM12616c, tECameraSettings2.f8973u, tECameraSettings2.f8981y);
                            }
                            Camera.Parameters parameters = this.f9022z;
                            TEFrameSizei tEFrameSizei = this.f9062b.f8967r;
                            parameters.setPictureSize(tEFrameSizei.width, tEFrameSizei.height);
                        }
                        this.f9021y.setParameters(this.f9022z);
                    }
                    this.f9064d.mo10848e(50, 0, tEFrameSizeiM12616c.toString(), this.f9021y);
                }
                TECameraSettings tECameraSettings3 = this.f9062b;
                if (tECameraSettings3.f8907A) {
                    tECameraSettings3.f8907A = false;
                    Camera.Parameters parameters2 = this.f9022z;
                    TEFrameSizei tEFrameSizei2 = tECameraSettings3.f8967r;
                    parameters2.setPictureSize(tEFrameSizei2.width, tEFrameSizei2.height);
                    this.f9021y.setParameters(this.f9022z);
                    C0743g.m11169e("TECamera1", "force set picture size: " + this.f9062b.f8967r.width + "x" + this.f9062b.f8967r.height);
                }
                this.f9021y.setErrorCallback(new a());
                this.f9062b.f8941e = mo10912C();
                C0743g.m11165a("TECamera1", "Camera rotation = " + this.f9062b.f8941e);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0743g.m11169e("TECamera1", "Camera startPreview start");
                this.f9021y.startPreview();
                C0743g.m11169e("TECamera1", "Camera startPreview end");
                int i2 = this.f9062b.f8911E.getInt("useCameraFaceDetect");
                this.f9019L = i2;
                m10925T0(i2);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.f9018K = jCurrentTimeMillis2;
                long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                ajh0.m11494b("te_record_camera1_start_preview_cost", j);
                C0743g.m11170f("te_record_camera1_start_preview_cost", Long.valueOf(j));
                this.f9063c = true;
                this.f9064d.mo10844a(1, 0, 0, "TECamera1 preview", this.f9021y);
            } catch (Exception e2) {
                C0743g.m11166b("TECamera1", "startPreview: Error " + e2.getMessage());
                if (e2.getMessage() == null) {
                    i = -425;
                } else if (e2.getMessage().equals("setParameters failed")) {
                    i = -402;
                } else if (e2.getMessage().equals("startPreview failed")) {
                    i = -410;
                } else {
                    i = -425;
                }
                int i3 = i;
                C0734e.m11049a(e2);
                this.f9063c = false;
                try {
                    if (this.f9073m == 0) {
                        this.f9064d.mo10848e(108, 0, "preview error will close camera1", null);
                        lih0.m17893b(this.f9080t, this.f9021y);
                        this.f9064d.mo10848e(109, 0, "preview error did close camera1", null);
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                if (this.f9073m == 0) {
                    this.f9021y = null;
                }
                this.f9064d.mo10845b(1, i3, e2.getMessage(), this.f9021y);
            }
        }
        wjh0.m24290b();
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: v */
    public int mo10950v() {
        return 1;
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: w0 */
    public void mo10951w0(float f2, TECameraSettings.InterfaceC0717p interfaceC0717p) {
        Camera camera = this.f9021y;
        if (camera == null) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -439. Reason: mCameraDevice is null");
            C0743g.m11166b("TECamera1", "startZoom : Camera is null!");
            this.f9064d.mo10846c(1, -439, "startZoom : Camera is null!", this.f9021y);
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f9022z = parameters;
            if (!parameters.isZoomSupported() && !this.f9022z.isSmoothZoomSupported()) {
                C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -421. Reason: camera is not support zoom");
                C0743g.m11166b("TECamera1", "Camera is not support zoom!");
                this.f9064d.mo10846c(1, -421, "Camera is not support zoom!", this.f9021y);
                return;
            }
            int iMin = (int) Math.min(this.f9022z.getMaxZoom(), f2);
            if (this.f9022z.isSmoothZoomSupported() && interfaceC0717p != null && interfaceC0717p.enableSmooth()) {
                this.f9021y.startSmoothZoom(iMin);
                this.f9021y.setZoomChangeListener(new f(interfaceC0717p));
                return;
            }
            this.f9022z.setZoom(iMin);
            this.f9021y.setParameters(this.f9022z);
            if (interfaceC0717p != null) {
                interfaceC0717p.onChange(1, iMin, true);
            }
        } catch (Exception e2) {
            C0743g.m11166b("TECamera1", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -420. Reason: " + e2);
            String str = "Start zoom failed : " + e2.toString();
            C0743g.m11166b("TECamera1", str);
            this.f9064d.mo10846c(1, -420, str, this.f9021y);
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: x */
    public float[] mo10952x() {
        Camera camera = this.f9021y;
        if (camera == null) {
            C0743g.m11166b("TECamera1", "getFOV: camera device is null.");
            this.f9064d.mo10846c(1, -439, "getFOV: camera device is null.", this.f9021y);
            return new float[]{-2.0f, -2.0f};
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            this.f9022z = parameters;
            float[] fArr = {parameters.getVerticalViewAngle(), this.f9022z.getHorizontalViewAngle()};
            C0743g.m11165a("TECamera1", "Camera1:verticalFOV = " + fArr[0] + ",horizontalFOV = " + fArr[1]);
            return fArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return new float[]{-2.0f, -2.0f};
        }
    }

    @Override // com.p008ss.android.ttvecamera.AbstractC0726c
    /* JADX INFO: renamed from: x0 */
    public void mo10953x0() {
        C0743g.m11165a("TECamera1", "Camera stopPreview...");
        if (!this.f9063c || this.f9021y == null) {
            return;
        }
        this.f9063c = false;
        this.f9017J.set(false);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f9021y.stopPreview();
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            ajh0.m11494b("te_record_camera1_stop_preview_cost", jCurrentTimeMillis2);
            C0743g.m11170f("te_record_camera1_stop_preview_cost", Long.valueOf(jCurrentTimeMillis2));
        } catch (Exception e2) {
            C0743g.m11166b("TECamera1", "camera stopcapture failed: " + e2.getMessage());
        }
        this.f9018K = 0L;
        C0743g.m11169e("TECamera1", "Camera preview stopped!");
        this.f9064d.mo10847d(1, 4, 0, "TECamera1 preview stoped", this.f9021y);
    }
}
