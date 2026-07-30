package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.moment.camera.config.Rotation;
import com.momo.mcamera.util.MDLogTag;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@RequiresApi(api = 14)
public class cgw implements nnl {

    /* JADX INFO: renamed from: q */
    private static boolean f80804q = false;

    /* JADX INFO: renamed from: c */
    private tlw f80807c;

    /* JADX INFO: renamed from: d */
    private Camera f80808d;

    /* JADX INFO: renamed from: i */
    private SurfaceTexture f80813i;

    /* JADX INFO: renamed from: j */
    private qie f80814j;

    /* JADX INFO: renamed from: k */
    private nnl.InterfaceC18736a f80815k;

    /* JADX INFO: renamed from: l */
    private nnl.InterfaceC18738c f80816l;

    /* JADX INFO: renamed from: m */
    private nnl.InterfaceC18741f f80817m;

    /* JADX INFO: renamed from: a */
    private final String f80805a = MDLogTag.MOMENT_CAMERA_TAG;

    /* JADX INFO: renamed from: b */
    private final Object f80806b = new Object();

    /* JADX INFO: renamed from: e */
    private int f80809e = 0;

    /* JADX INFO: renamed from: f */
    private int f80810f = 0;

    /* JADX INFO: renamed from: h */
    private int f80812h = 0;

    /* JADX INFO: renamed from: n */
    Camera.CameraInfo f80818n = new Camera.CameraInfo();

    /* JADX INFO: renamed from: o */
    private boolean f80819o = true;

    /* JADX INFO: renamed from: p */
    private nnl.InterfaceC18740e f80820p = null;

    /* JADX INFO: renamed from: g */
    private int f80811g = Camera.getNumberOfCameras();

    /* JADX INFO: renamed from: l.cgw$a */
    public class C16138a implements Camera.PreviewCallback {
        public C16138a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            synchronized (cgw.this.f80806b) {
                try {
                    if (cgw.this.f80815k != null) {
                        cgw.this.f80815k.onData(bArr);
                    }
                    if (cgw.this.f80808d != null && cgw.this.f80807c.f171115y == bArr.length) {
                        cgw.this.f80808d.addCallbackBuffer(bArr);
                    }
                    cgw.m106790D(cgw.this);
                    if (cgw.this.f80814j != null) {
                        try {
                            cgw.this.f80814j.m174872f();
                            if (cgw.this.f80813i != null) {
                                cgw.this.f80813i.updateTexImage();
                            }
                        } catch (Exception e) {
                            MDLog.m7392e(MDLogTag.MOMENT_CAMERA_TAG, "updateTextureImage error, contex maybe released by outside !", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.cgw$c */
    public class C16140c implements Camera.PictureCallback {
        public C16140c() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            try {
                if (cgw.this.f80816l != null) {
                    cgw.this.f80816l.mo140501a(bArr);
                }
                camera.startPreview();
            } catch (Exception e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera take photo failed !!!" + e.toString());
                if (cgw.this.f80820p != null) {
                    cgw.this.f80820p.onFail(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, "Camera take photo failed !!!" + e.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.cgw$d */
    public class C16141d implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.cgw$e */
    public class C16142e implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.cgw$f */
    public class C16143f implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    @RequiresApi(api = 9)
    public cgw(tlw tlwVar) {
        this.f80807c = tlwVar;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ vnl m106790D(cgw cgwVar) {
        cgwVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: L */
    private boolean m106795L() {
        boolean z;
        try {
            Camera.getCameraInfo(this.f80812h, this.f80818n);
            z = true;
        } catch (Exception e) {
            MDLog.printErrStackTrace(MDLogTag.MOMENT_CAMERA_TAG, e);
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is front error!" + e.getMessage());
            }
            z = false;
        }
        return this.f80812h == 1 || (z && this.f80818n.facing == 1);
    }

    /* JADX INFO: renamed from: M */
    private void m106796M(Exception exc) {
        Camera camera = this.f80808d;
        if (camera != null) {
            camera.setPreviewCallback(null);
            this.f80808d.setPreviewCallbackWithBuffer(null);
            this.f80808d.release();
            SurfaceTexture surfaceTexture = this.f80813i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f80808d = null;
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(4002, "Camera start preview failed !" + exc.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static List<tif0> m106797N(Context context, int i) {
        return m106798O(context, null, i, -1, -1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: O */
    public static List<tif0> m106798O(Context context, tif0 tif0Var, int i, int i2, float f) {
        List<Camera.Size> supportedPreviewSizes;
        List<Camera.Size> list;
        List<Camera.Size> supportedPreviewSizes2;
        int i3;
        ArrayList arrayList = new ArrayList();
        if (m106799P(context, arrayList, Integer.toString(i))) {
            return arrayList;
        }
        int i4 = 0;
        if ((i & 2) != 0) {
            try {
                Camera cameraOpen = Camera.open(0);
                supportedPreviewSizes = cameraOpen.getParameters().getSupportedPreviewSizes();
                cameraOpen.release();
                Collections.sort(supportedPreviewSizes, new C16141d());
                list = supportedPreviewSizes;
            } catch (Throwable unused) {
                return null;
            }
        } else {
            list = null;
            supportedPreviewSizes = null;
        }
        if ((i & 1) != 0) {
            Camera cameraOpen2 = Camera.open(1);
            supportedPreviewSizes2 = cameraOpen2.getParameters().getSupportedPreviewSizes();
            cameraOpen2.release();
            Collections.sort(supportedPreviewSizes2, new C16142e());
            supportedPreviewSizes = supportedPreviewSizes2;
        } else {
            supportedPreviewSizes2 = null;
        }
        if (i == 3) {
            supportedPreviewSizes = new ArrayList<>();
            for (Camera.Size size : list) {
                for (Camera.Size size2 : supportedPreviewSizes2) {
                    if (size.width == size2.width && size.height == size2.height) {
                        supportedPreviewSizes.add(size);
                    }
                }
            }
        }
        if (i2 > 0 && f > 0.0f && tif0Var != null && supportedPreviewSizes.size() > 0) {
            int iM189184b = tif0Var.m189184b() * tif0Var.m189183a();
            int i5 = 0;
            for (Camera.Size size3 : supportedPreviewSizes) {
                int iM189184b2 = (size3.width * size3.height) - (tif0Var.m189184b() * tif0Var.m189183a());
                if (i2 == 0) {
                    if (size3.width / f <= size3.height) {
                        if (Math.abs(iM189184b2) < iM189184b) {
                            if (size3.width > tif0Var.m189184b() || size3.height <= tif0Var.m189183a()) {
                                iM189184b = Math.abs(iM189184b2);
                                i4 = size3.width;
                                i5 = size3.height;
                            }
                        } else if (Math.abs(iM189184b2) != iM189184b && i4 < (i3 = size3.width)) {
                            i5 = size3.height;
                            i4 = i3;
                        }
                    }
                } else if (i2 != 1 || size3.height * f <= size3.width) {
                    if (Math.abs(iM189184b2) < iM189184b) {
                        if (size3.width > tif0Var.m189184b()) {
                        }
                        iM189184b = Math.abs(iM189184b2);
                        i4 = size3.width;
                        i5 = size3.height;
                    } else if (Math.abs(iM189184b2) != iM189184b) {
                    }
                }
            }
            if (i4 != 0 && i5 != 0) {
                arrayList.add(new tif0(i4, i5));
            }
        } else if (tif0Var == null) {
            for (Camera.Size size4 : supportedPreviewSizes) {
                arrayList.add(new tif0(size4.width, size4.height));
            }
            Collections.sort(supportedPreviewSizes, new C16143f());
        }
        m106805W(context, arrayList, Integer.toString(i));
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    private static boolean m106799P(Context context, List<tif0> list, String str) {
        String string = xh80.m208776a(context).getString(str, null);
        if (string != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(string.getBytes(Charset.forName("utf8"))), Charset.forName("utf8")));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                bufferedReader.close();
                                return true;
                            }
                            String[] strArrSplit = line.split(Constants.SEPARATOR_COMMA);
                            if (strArrSplit.length == 2) {
                                list.add(new tif0(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1])));
                            }
                        } catch (Throwable unused) {
                            bufferedReader.close();
                            return true;
                        }
                    } catch (Exception e) {
                        MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Read camera support resolution failed !!!" + e.toString());
                        bufferedReader.close();
                        return true;
                    }
                }
            } catch (Exception e2) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Read camera support resolution failed !!!" + e2.toString());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    private boolean m106800Q(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return false;
        }
        Iterator<String> it = supportedFocusModes.iterator();
        while (it.hasNext()) {
            if (it.next().equals("auto")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    private boolean m106801R(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return false;
        }
        Iterator<String> it = supportedFocusModes.iterator();
        while (it.hasNext()) {
            if (it.next().equals("fixed")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    private void m106802S(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        String str;
        Camera camera = this.f80808d;
        if (camera == null) {
            return;
        }
        try {
            camera.cancelAutoFocus();
            try {
                parameters = this.f80808d.getParameters();
            } catch (RuntimeException unused) {
                parameters = null;
            }
            if (parameters == null) {
                return;
            }
            if (m106800Q(parameters)) {
                str = "auto";
            } else if (!m106801R(parameters) && !mo106822i()) {
                return;
            } else {
                str = "continuous-video";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rect, 1000));
            if (!mo106822i()) {
                parameters.setFocusMode(str);
                parameters.setFocusAreas(arrayList);
            }
            try {
                this.f80808d.setParameters(parameters);
                if (mo106822i()) {
                    return;
                }
                this.f80808d.autoFocus(autoFocusCallback);
            } catch (Exception e) {
                nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
                if (interfaceC18740e != null) {
                    interfaceC18740e.onFail(4005, "Set camera autoFocus error!" + e.getMessage());
                }
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            }
        } catch (Exception e2) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: U */
    private void m106803U(tlw tlwVar) {
        for (int i = 0; i < tlwVar.f171116z; i++) {
            this.f80808d.addCallbackBuffer(new byte[tlwVar.f171115y]);
        }
    }

    /* JADX INFO: renamed from: V */
    private void m106804V(tlw tlwVar, tif0 tif0Var) {
        float f;
        int i;
        if (tlwVar.f171083a) {
            f = tlwVar.f171087c;
            i = tlwVar.f171085b;
        } else {
            f = tlwVar.f171085b;
            i = tlwVar.f171087c;
        }
        float f2 = i / f;
        float f3 = tlwVar.f171104n / tlwVar.f171103m;
        if (f2 == f3) {
            tlwVar.f171113w = 0.0f;
        } else if (f2 > f3) {
            tlwVar.f171113w = (1.0f - (f3 / f2)) / 2.0f;
        } else {
            tlwVar.f171113w = (-(1.0f - (f2 / f3))) / 2.0f;
        }
        tlwVar.f171115y = ((tlwVar.f171085b * tlwVar.f171087c) * 3) / 2;
    }

    /* JADX INFO: renamed from: W */
    private static void m106805W(Context context, List<tif0> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (tif0 tif0Var : list) {
            sb.append(tif0Var.m189184b() + Constants.SEPARATOR_COMMA + tif0Var.m189183a() + "\r\n");
        }
        xh80.m208777b(context).putString(str, sb.toString()).commit();
    }

    /* JADX INFO: renamed from: X */
    private void m106806X(Rect rect) {
        Camera.Parameters parameters;
        Camera camera = this.f80808d;
        if (camera == null) {
            return;
        }
        try {
            parameters = camera.getParameters();
        } catch (RuntimeException unused) {
            parameters = null;
        }
        if (parameters != null && parameters.getMaxNumMeteringAreas() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rect, 1000));
            parameters.setMeteringAreas(arrayList);
            try {
                this.f80808d.setParameters(parameters);
            } catch (Exception e) {
                nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
                if (interfaceC18740e != null) {
                    interfaceC18740e.onFail(4005, "Set camera setMeteringArea error!" + e.getMessage());
                }
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            }
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: A */
    public boolean mo106810A(int i, rlw rlwVar) {
        synchronized (this.f80806b) {
            try {
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Swap camera");
                Camera camera = this.f80808d;
                if (camera != null) {
                    camera.stopPreview();
                    this.f80808d.setPreviewCallback(null);
                    this.f80808d.setPreviewCallbackWithBuffer(null);
                    this.f80808d.release();
                    this.f80808d = null;
                }
                boolean zM179933y = rlwVar.m179933y();
                int i2 = this.f80812h;
                if (zM179933y) {
                    if (i2 == 0) {
                        this.f80812h = 1;
                    } else {
                        this.f80812h = 0;
                    }
                    MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Fixed camera mode, switched to: ".concat(this.f80812h == 1 ? "FRONT" : "BACK"));
                } else {
                    this.f80812h = (i2 + 1) % this.f80811g;
                    MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Cycle all cameras mode, switched to ID: " + this.f80812h);
                }
                rlwVar.m179889E(this.f80812h);
                mo106811C(i, rlwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: C */
    public boolean mo106811C(int i, rlw rlwVar) {
        if (this.f80811g - 1 >= rlwVar.m179912d()) {
            this.f80812h = rlwVar.m179912d();
        }
        synchronized (this.f80806b) {
            int i2 = 0;
            while (i2 < 2) {
                try {
                    if (!m106815T()) {
                        MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera Open Failed!");
                        return false;
                    }
                    if (this.f80808d != null) {
                        m106814K(i);
                        break;
                    }
                    MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera is NULL");
                    return false;
                } catch (Throwable unused) {
                    i2++;
                    if (i2 >= 2) {
                        return false;
                    }
                    try {
                        Camera camera = this.f80808d;
                        if (camera != null) {
                            camera.setPreviewCallback(null);
                            this.f80808d.setPreviewCallbackWithBuffer(null);
                            this.f80808d.release();
                            this.f80808d = null;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            try {
                Camera.Parameters parameters = this.f80808d.getParameters();
                u84.m192184e(parameters, this.f80807c, rlwVar.m179925q());
                int iM179929u = rlwVar.m179929u();
                tlw tlwVar = this.f80807c;
                int i3 = tlwVar.f171063G;
                if (iM179929u > i3 / 1000) {
                    tlwVar.f171109s = i3 / 1000;
                } else {
                    tlwVar.f171109s = rlwVar.m179929u();
                }
                u84.m192183d(parameters, this.f80807c);
                m106804V(this.f80807c, rlwVar.m179925q());
                if (!u84.m192182c(parameters, this.f80807c)) {
                    MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.selectCameraColorFormat,Failed");
                    nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
                    if (interfaceC18740e != null) {
                        interfaceC18740e.onFail(ErrorCode.CAMERA_SELECT_COLORFORMAT_FAILED, "CameraHelper.selectCameraColorFormat,Failed");
                    }
                    this.f80807c.m189629a();
                    return false;
                }
                if (!u84.m192180a(this.f80808d, this.f80807c)) {
                    MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.configCamera,Failed");
                    nnl.InterfaceC18740e interfaceC18740e2 = this.f80820p;
                    if (interfaceC18740e2 != null) {
                        interfaceC18740e2.onFail(4005, "CameraHelper.configCamera,Failed");
                    }
                    this.f80807c.m189629a();
                    return false;
                }
                m106803U(this.f80807c);
                tlw tlwVar2 = this.f80807c;
                int iM179924p = tlwVar2.f171085b;
                int iM179924p2 = tlwVar2.f171087c;
                if (!rlwVar.m179918j()) {
                    if (rlwVar.m179923o() == 1) {
                        iM179924p = (int) (iM179924p2 * rlwVar.m179924p());
                        if (iM179924p != this.f80807c.f171085b) {
                            iM179924p = (iM179924p >> 4) << 4;
                        }
                    } else if (rlwVar.m179923o() == 0 && (iM179924p2 = (int) (iM179924p / rlwVar.m179924p())) != this.f80807c.f171087c) {
                        iM179924p2 = (iM179924p2 >> 4) << 4;
                    }
                }
                int i4 = this.f80810f;
                tif0 tif0Var = (i4 == 1 || i4 == 3) ? new tif0(iM179924p2, iM179924p) : new tif0(iM179924p, iM179924p2);
                if (!this.f80807c.f171069M) {
                    tif0 tif0VarM179913e = rlwVar.m179913e();
                    if (tif0VarM179913e != null && tif0VarM179913e.m189184b() > 0 && tif0VarM179913e.m189183a() > 0) {
                        this.f80807c.f171097h = tif0VarM179913e.m189184b();
                        this.f80807c.f171099i = tif0VarM179913e.m189183a();
                    }
                } else if (tif0Var.m189184b() > 0 && tif0Var.m189183a() > 0) {
                    this.f80807c.f171097h = tif0Var.m189184b();
                    this.f80807c.f171099i = tif0Var.m189183a();
                    rlwVar.m179890F(tif0Var);
                }
                nnl.InterfaceC18741f interfaceC18741f = this.f80817m;
                if (interfaceC18741f != null) {
                    interfaceC18741f.mo142893V(this.f80808d);
                }
                return true;
            } catch (Exception e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.prepare failed !" + e.getMessage());
                nnl.InterfaceC18740e interfaceC18740e3 = this.f80820p;
                if (interfaceC18740e3 != null) {
                    interfaceC18740e3.onFail(4001, "CameraHelper.prepare failed !" + e.getMessage());
                }
                return false;
            }
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: E */
    public void mo106812E(String str) {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        try {
            Camera camera = this.f80808d;
            if (camera == null || (supportedFlashModes = (parameters = camera.getParameters()).getSupportedFlashModes()) == null || !supportedFlashModes.contains(str)) {
                return;
            }
            parameters.setFlashMode(str);
            this.f80808d.setParameters(parameters);
        } catch (Exception e) {
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(4005, "Set camera flash Mode error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera flash Mode error!" + e.getMessage());
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: F */
    public boolean mo106813F() {
        try {
            return !this.f80808d.getParameters().isSmoothZoomSupported();
        } catch (Exception e) {
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is support zoom error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m106814K(int i) {
        if (this.f80808d == null) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "请先打开Camera!");
            return;
        }
        int iM192181b = u84.m192181b(i, this.f80812h);
        this.f80809e = iM192181b;
        Rotation rotation = Rotation.NORMAL;
        if (iM192181b == 90) {
            rotation = Rotation.ROTATION_90;
        } else if (iM192181b == 180) {
            rotation = Rotation.ROTATION_180;
        } else if (iM192181b == 270) {
            rotation = Rotation.ROTATION_270;
        }
        this.f80810f = this.f80812h == 1 ? rotation.ordinal() % (Rotation.ROTATION_270.ordinal() + 1) : rotation.ordinal() % (Rotation.ROTATION_270.ordinal() + 1);
        this.f80808d.setDisplayOrientation(this.f80809e);
    }

    @RequiresApi(api = 9)
    /* JADX INFO: renamed from: T */
    public boolean m106815T() {
        try {
            this.f80808d = Camera.open(this.f80812h);
            f80804q = true;
            this.f80819o = m106795L();
            return true;
        } catch (Throwable th) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera open failed !" + th.getMessage());
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e == null) {
                return false;
            }
            interfaceC18740e.onFail(4004, "Camera open failed !" + th.getMessage());
            return false;
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: a */
    public int mo106816a() {
        synchronized (this.f80806b) {
            try {
                Camera camera = this.f80808d;
                if (camera == null) {
                    nnl.InterfaceC18741f interfaceC18741f = this.f80817m;
                    if (interfaceC18741f != null) {
                        interfaceC18741f.mo142887G();
                    }
                    return 1;
                }
                try {
                    camera.stopPreview();
                    this.f80808d.setPreviewCallback(null);
                    this.f80808d.setPreviewCallbackWithBuffer(null);
                    this.f80808d.release();
                    nnl.InterfaceC18741f interfaceC18741f2 = this.f80817m;
                    if (interfaceC18741f2 != null) {
                        interfaceC18741f2.mo142887G();
                    }
                    this.f80808d = null;
                    return 1;
                } catch (Throwable th) {
                    MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera stop preview failed !" + th.getMessage());
                    nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
                    if (interfaceC18740e != null) {
                        interfaceC18740e.onFail(4003, "Camera stop preview failed !" + th.getMessage());
                    }
                    nnl.InterfaceC18741f interfaceC18741f3 = this.f80817m;
                    if (interfaceC18741f3 != null) {
                        interfaceC18741f3.mo142887G();
                    }
                    return -1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: b */
    public void mo106817b(int i) {
        Camera camera;
        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, FirebaseAnalytics.Param.LEVEL + i);
        try {
            if (this.f80808d.getParameters() != null && (camera = this.f80808d) != null) {
                if (i >= camera.getParameters().getMaxZoom()) {
                    i = 0;
                }
                if (this.f80808d.getParameters().isZoomSupported()) {
                    Camera.Parameters parameters = this.f80808d.getParameters();
                    parameters.setZoom(i);
                    this.f80808d.setParameters(parameters);
                }
            }
        } catch (Error e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera zoom level error!" + e.getMessage());
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(4005, "Set camera zoom level error!" + e.getMessage());
            }
            e.printStackTrace();
        } catch (Exception e2) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera zoom level error!" + e2.getMessage());
            nnl.InterfaceC18740e interfaceC18740e2 = this.f80820p;
            if (interfaceC18740e2 != null) {
                interfaceC18740e2.onFail(4005, "Set camera zoom level error!" + e2.getMessage());
            }
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: c */
    public int mo106818c() {
        try {
            Camera camera = this.f80808d;
            if (camera == null || camera.getParameters() == null) {
                return 0;
            }
            return this.f80808d.getParameters().getMaxZoom() - 1;
        } catch (Exception e) {
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera max support zoom level error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return 0;
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: d */
    public int mo106819d() {
        try {
            if (this.f80808d.getParameters() != null) {
                return this.f80808d.getParameters().getZoom();
            }
            return 0;
        } catch (Exception e) {
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera current zoom level error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return 0;
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: e */
    public void mo106820e(Camera.ErrorCallback errorCallback) {
        Camera camera = this.f80808d;
        if (camera != null) {
            camera.setErrorCallback(errorCallback);
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: f */
    public void mo106821f(int i, int i2, Rect rect, boolean z) {
        if (z) {
            m106806X(bc4.m101041b(i, i2, rect));
        } else {
            m106806X(bc4.m101040a(i, i2, rect, mo106822i()));
        }
    }

    @Override // p149l.nnl
    public tif0 getTextureSize() {
        return null;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: i */
    public boolean mo106822i() {
        return this.f80819o;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: j */
    public boolean mo106823j(SurfaceTexture surfaceTexture) {
        return mo106828o(surfaceTexture, null);
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: k */
    public void mo106824k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        m106802S(rect, autoFocusCallback);
        m106806X(rect);
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: l */
    public void mo106825l(nnl.InterfaceC18741f interfaceC18741f) {
        synchronized (this.f80806b) {
            this.f80817m = interfaceC18741f;
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: m */
    public int mo106826m() {
        return this.f80810f * 90;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: n */
    public int[] mo106827n() {
        tlw tlwVar = this.f80807c;
        if (tlwVar != null) {
            return new int[]{tlwVar.f171064H / 1000, tlwVar.f171063G / 1000};
        }
        return null;
    }

    @Override // p149l.nnl
    @RequiresApi(api = 14)
    /* JADX INFO: renamed from: o */
    public boolean mo106828o(SurfaceTexture surfaceTexture, qie qieVar) {
        this.f80813i = surfaceTexture;
        this.f80814j = qieVar;
        Camera camera = this.f80808d;
        if (camera == null) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera is NULL");
            return false;
        }
        if (this.f80815k != null) {
            camera.setPreviewCallbackWithBuffer(new C16138a());
        }
        synchronized (this.f80806b) {
            try {
                try {
                    try {
                        this.f80808d.setPreviewTexture(this.f80813i);
                        this.f80808d.startPreview();
                    } catch (IOException e) {
                        MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera start preview failed !" + e.getMessage());
                        m106796M(e);
                        return false;
                    }
                } catch (RuntimeException e2) {
                    m106796M(e2);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: p */
    public void mo106829p(nnl.InterfaceC18740e interfaceC18740e) {
        this.f80820p = interfaceC18740e;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: r */
    public void mo106831r(nnl.InterfaceC18738c interfaceC18738c) {
        this.f80816l = interfaceC18738c;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: s */
    public boolean mo106832s(int i) {
        return false;
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: t */
    public void mo106833t(String str) {
        this.f80808d.takePicture(null, new C16139b(), new C16140c());
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: u */
    public boolean mo106834u(int i, rlw rlwVar) {
        try {
            synchronized (this.f80806b) {
                try {
                    MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Reset camera");
                    Camera camera = this.f80808d;
                    if (camera != null) {
                        camera.stopPreview();
                        this.f80808d.setPreviewCallback(null);
                        this.f80808d.setPreviewCallbackWithBuffer(null);
                        this.f80808d.release();
                        this.f80808d = null;
                    }
                    rlwVar.m179889E(this.f80812h);
                    mo106811C(i, rlwVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return false;
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Reset camera failed !!!" + e.toString());
            return false;
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: v */
    public boolean mo106835v() {
        List<String> supportedFlashModes;
        try {
            Camera camera = this.f80808d;
            if (camera == null || (supportedFlashModes = camera.getParameters().getSupportedFlashModes()) == null) {
                return false;
            }
            Iterator<String> it = supportedFlashModes.iterator();
            while (it.hasNext()) {
                if (it.next().equals("torch")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is Support Flash Torch Mode error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Get camera is Support Flash Torch Mode error!" + e.getMessage());
            return false;
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: w */
    public void mo106836w(nnl.InterfaceC18736a interfaceC18736a) {
        synchronized (this.f80806b) {
            this.f80815k = interfaceC18736a;
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: x */
    public tif0 mo106837x() {
        tlw tlwVar = this.f80807c;
        return new tif0(tlwVar.f171085b, tlwVar.f171087c);
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: y */
    public boolean mo106838y() {
        List<String> supportedFlashModes;
        try {
            Camera camera = this.f80808d;
            if (camera == null || (supportedFlashModes = camera.getParameters().getSupportedFlashModes()) == null) {
                return false;
            }
            Iterator<String> it = supportedFlashModes.iterator();
            while (it.hasNext()) {
                if (it.next().equals("auto")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            nnl.InterfaceC18740e interfaceC18740e = this.f80820p;
            if (interfaceC18740e != null) {
                interfaceC18740e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is Support Flash Auto Mode error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Get camera is Support Flash Auto Mode error!" + e.toString());
            return false;
        }
    }

    @Override // p149l.nnl
    /* JADX INFO: renamed from: q */
    public void mo106830q(nnl.InterfaceC18739d interfaceC18739d) {
    }

    /* JADX INFO: renamed from: l.cgw$b */
    public class C16139b implements Camera.PictureCallback {
        public C16139b() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
        }
    }
}
