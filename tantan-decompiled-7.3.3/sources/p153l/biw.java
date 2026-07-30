package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.config.Rotation;
import com.core.glcore.util.CameraHelper;
import com.core.glcore.util.ErrorCode;
import com.core.glcore.util.PreferenceUtil;
import com.cosmos.mdlog.MDLog;
import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 14)
public class biw implements xpl {

    /* JADX INFO: renamed from: q */
    private static boolean f76922q = false;

    /* JADX INFO: renamed from: c */
    private tow f76925c;

    /* JADX INFO: renamed from: d */
    private Camera f76926d;

    /* JADX INFO: renamed from: i */
    private SurfaceTexture f76931i;

    /* JADX INFO: renamed from: j */
    private wje f76932j;

    /* JADX INFO: renamed from: k */
    private xpl.InterfaceC21407a f76933k;

    /* JADX INFO: renamed from: l */
    private xpl.InterfaceC21410d f76934l;

    /* JADX INFO: renamed from: p */
    private hh3 f76938p;

    /* JADX INFO: renamed from: a */
    private final String f76923a = MDLogTag.MOMENT_CAMERA_TAG;

    /* JADX INFO: renamed from: b */
    private final Object f76924b = new Object();

    /* JADX INFO: renamed from: e */
    private int f76927e = 0;

    /* JADX INFO: renamed from: f */
    private int f76928f = 0;

    /* JADX INFO: renamed from: h */
    private int f76930h = 0;

    /* JADX INFO: renamed from: m */
    Camera.CameraInfo f76935m = new Camera.CameraInfo();

    /* JADX INFO: renamed from: n */
    private boolean f76936n = true;

    /* JADX INFO: renamed from: o */
    private xpl.InterfaceC21409c f76937o = null;

    /* JADX INFO: renamed from: g */
    private int f76929g = Camera.getNumberOfCameras();

    /* JADX INFO: renamed from: l.biw$a */
    public class C16018a implements Camera.PreviewCallback {
        public C16018a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            synchronized (biw.this.f76924b) {
                try {
                    if (biw.this.f76933k != null) {
                        biw.this.f76933k.onData(bArr);
                    }
                    if (biw.this.f76926d != null && biw.this.f76925c.f175455L == bArr.length) {
                        biw.this.f76926d.addCallbackBuffer(bArr);
                    }
                    if (biw.this.f76932j != null) {
                        try {
                            biw.this.f76932j.m206637i();
                            if (biw.this.f76931i != null) {
                                biw.this.f76931i.updateTexImage();
                            }
                        } catch (Exception e) {
                            MDLog.m7446e(MDLogTag.MOMENT_CAMERA_TAG, "updateTextureImage error, contex maybe released by outside !", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.biw$b */
    public class C16019b implements Camera.PreviewCallback {
        public C16019b() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            synchronized (biw.this.f76924b) {
                try {
                    if (biw.this.f76933k != null) {
                        biw.this.f76933k.onData(bArr);
                    }
                    if (biw.this.f76926d != null) {
                        biw.this.f76926d.addCallbackBuffer(bArr);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.biw$c */
    public class C16020c implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.biw$d */
    public class C16021d implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.biw$e */
    public class C16022e implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    @RequiresApi(api = 9)
    public biw(tow towVar) {
        this.f76925c = towVar;
    }

    /* JADX INFO: renamed from: A */
    private void m104532A(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        String str;
        Camera camera = this.f76926d;
        if (camera == null) {
            return;
        }
        try {
            camera.cancelAutoFocus();
            try {
                parameters = this.f76926d.getParameters();
            } catch (RuntimeException unused) {
                parameters = null;
            }
            if (parameters == null) {
                return;
            }
            if (m104549y(parameters)) {
                str = "auto";
            } else if (!m104550z(parameters) && !mo104568i()) {
                return;
            } else {
                str = "continuous-video";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rect, 1000));
            if (!mo104568i()) {
                parameters.setFocusMode(str);
                parameters.setFocusAreas(arrayList);
            }
            try {
                this.f76926d.setParameters(parameters);
                if (mo104568i()) {
                    return;
                }
                this.f76926d.autoFocus(autoFocusCallback);
            } catch (Exception e) {
                xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
                if (interfaceC21409c != null) {
                    interfaceC21409c.onFail(4005, "Set camera autoFocus error!" + e.getMessage());
                }
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            }
        } catch (Exception e2) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: C */
    private void m104533C(tow towVar) {
        hh3 hh3Var = this.f76938p;
        if (hh3Var == null) {
            this.f76938p = new hh3();
        } else {
            hh3Var.m135013b();
        }
        for (int i = 0; i < towVar.f175456M; i++) {
            try {
                this.f76926d.addCallbackBuffer(this.f76938p.m135012a(towVar.f175455L));
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private void m104534D(tow towVar, erf0 erf0Var) {
        float f;
        int i;
        int i2 = towVar.f175474c;
        boolean z = towVar.f175476d;
        if (i2 != 2) {
            if (z) {
                f = towVar.f175480f;
                i = towVar.f175478e;
            } else {
                f = towVar.f175478e;
                i = towVar.f175480f;
            }
            float f2 = i / f;
            float f3 = towVar.f175508t / towVar.f175506s;
            if (f2 == f3) {
                towVar.f175453J = 0.0f;
            } else if (f2 > f3) {
                towVar.f175453J = (1.0f - (f3 / f2)) / 2.0f;
            } else {
                towVar.f175453J = (-(1.0f - (f2 / f3))) / 2.0f;
            }
        }
        towVar.f175455L = ((towVar.f175478e * towVar.f175480f) * 3) / 2;
    }

    /* JADX INFO: renamed from: M */
    private static void m104535M(Context context, List<erf0> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (erf0 erf0Var : list) {
            sb.append(erf0Var.m122180b() + Constants.SEPARATOR_COMMA + erf0Var.m122179a() + "\r\n");
        }
        PreferenceUtil.getEditor(context).putString(str, sb.toString()).commit();
    }

    /* JADX INFO: renamed from: N */
    private void m104536N(Rect rect) {
        Camera.Parameters parameters;
        Camera camera = this.f76926d;
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
                this.f76926d.setParameters(parameters);
            } catch (Exception e) {
                xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
                if (interfaceC21409c != null) {
                    interfaceC21409c.onFail(4005, "Set camera setMeteringArea error!" + e.getMessage());
                }
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static synchronized void m104543s() {
    }

    /* JADX INFO: renamed from: t */
    private boolean m104544t() {
        boolean z;
        try {
            Camera.getCameraInfo(this.f76930h, this.f76935m);
            z = true;
        } catch (Exception e) {
            MDLog.printErrStackTrace(MDLogTag.MOMENT_CAMERA_TAG, e);
            xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is front error!" + e.getMessage());
            }
            z = false;
        }
        return this.f76930h == 1 || (z && this.f76935m.facing == 1);
    }

    /* JADX INFO: renamed from: u */
    private void m104545u(Exception exc) {
        Camera camera = this.f76926d;
        if (camera != null) {
            camera.setPreviewCallback(null);
            this.f76926d.setPreviewCallbackWithBuffer(null);
            this.f76926d.release();
            SurfaceTexture surfaceTexture = this.f76931i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f76926d = null;
            xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(4002, "Camera start preview failed !" + exc.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static List<erf0> m104546v(Context context, int i) {
        return m104547w(context, null, i, -1, -1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public static List<erf0> m104547w(Context context, erf0 erf0Var, int i, int i2, float f) {
        List<Camera.Size> supportedPreviewSizes;
        List<Camera.Size> list;
        List<Camera.Size> supportedPreviewSizes2;
        int i3;
        ArrayList arrayList = new ArrayList();
        if (m104548x(context, arrayList, Integer.toString(i))) {
            return arrayList;
        }
        int i4 = 0;
        if ((i & 2) != 0) {
            try {
                Camera cameraOpen = Camera.open(0);
                supportedPreviewSizes = cameraOpen.getParameters().getSupportedPreviewSizes();
                cameraOpen.release();
                Collections.sort(supportedPreviewSizes, new C16020c());
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
            Collections.sort(supportedPreviewSizes2, new C16021d());
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
        if (i2 > 0 && f > 0.0f && erf0Var != null && supportedPreviewSizes.size() > 0) {
            int iM122180b = erf0Var.m122180b() * erf0Var.m122179a();
            int i5 = 0;
            for (Camera.Size size3 : supportedPreviewSizes) {
                int iM122180b2 = (size3.width * size3.height) - (erf0Var.m122180b() * erf0Var.m122179a());
                if (i2 == 0) {
                    if (size3.width / f <= size3.height) {
                        if (Math.abs(iM122180b2) < iM122180b) {
                            if (size3.width > erf0Var.m122180b() || size3.height <= erf0Var.m122179a()) {
                                iM122180b = Math.abs(iM122180b2);
                                i4 = size3.width;
                                i5 = size3.height;
                            }
                        } else if (Math.abs(iM122180b2) != iM122180b && i4 < (i3 = size3.width)) {
                            i5 = size3.height;
                            i4 = i3;
                        }
                    }
                } else if (i2 != 1 || size3.height * f <= size3.width) {
                    if (Math.abs(iM122180b2) < iM122180b) {
                        if (size3.width > erf0Var.m122180b()) {
                        }
                        iM122180b = Math.abs(iM122180b2);
                        i4 = size3.width;
                        i5 = size3.height;
                    } else if (Math.abs(iM122180b2) != iM122180b) {
                    }
                }
            }
            if (i4 != 0 && i5 != 0) {
                arrayList.add(new erf0(i4, i5));
            }
        } else if (erf0Var == null) {
            for (Camera.Size size4 : supportedPreviewSizes) {
                arrayList.add(new erf0(size4.width, size4.height));
            }
            Collections.sort(supportedPreviewSizes, new C16022e());
        }
        m104535M(context, arrayList, Integer.toString(i));
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    private static boolean m104548x(Context context, List<erf0> list, String str) {
        String string = PreferenceUtil.getDefault(context).getString(str, null);
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
                                list.add(new erf0(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1])));
                            }
                        } catch (Throwable unused) {
                            bufferedReader.close();
                            return true;
                        }
                    } catch (Exception e) {
                        MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Read camera support resolution failed !!!" + e.toString());
                        bufferedReader.close();
                        return true;
                    }
                }
            } catch (Exception e2) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Read camera support resolution failed !!!" + e2.toString());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    private boolean m104549y(Camera.Parameters parameters) {
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

    /* JADX INFO: renamed from: z */
    private boolean m104550z(Camera.Parameters parameters) {
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

    @RequiresApi(api = 9)
    /* JADX INFO: renamed from: B */
    public boolean m104551B() {
        try {
            this.f76926d = Camera.open(this.f76930h);
            f76922q = true;
            this.f76936n = m104544t();
            return true;
        } catch (Throwable th) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera open failed !" + th.getMessage());
            xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
            if (interfaceC21409c == null) {
                return false;
            }
            interfaceC21409c.onFail(4004, "Camera open failed !" + th.getMessage());
            return false;
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: E */
    public boolean mo104552E(int i, row rowVar) {
        synchronized (this.f76924b) {
            try {
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Swap camera");
                Camera camera = this.f76926d;
                if (camera != null) {
                    camera.stopPreview();
                    this.f76926d.setPreviewCallback(null);
                    this.f76926d.setPreviewCallbackWithBuffer(null);
                    this.f76926d.release();
                    this.f76926d = null;
                }
                int i2 = (this.f76930h + 1) % this.f76929g;
                this.f76930h = i2;
                rowVar.m182478q(i2);
                mo104554G(i, rowVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: F */
    public boolean mo104553F(int i, row rowVar) {
        try {
            synchronized (this.f76924b) {
                try {
                    MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Reset camera");
                    Camera camera = this.f76926d;
                    if (camera != null) {
                        camera.stopPreview();
                        this.f76926d.setPreviewCallback(null);
                        this.f76926d.setPreviewCallbackWithBuffer(null);
                        this.f76926d.release();
                        this.f76926d = null;
                    }
                    rowVar.m182478q(this.f76930h);
                    mo104554G(i, rowVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return false;
        } catch (Exception e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Reset camera failed !!!" + e.toString());
            return false;
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: G */
    public boolean mo104554G(int i, row rowVar) {
        if (this.f76929g - 1 >= rowVar.m182463a()) {
            this.f76930h = rowVar.m182463a();
        }
        synchronized (this.f76924b) {
            int i2 = 0;
            while (i2 < 2) {
                try {
                    if (!m104551B()) {
                        MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera Open Failed!");
                        return false;
                    }
                    if (this.f76926d != null) {
                        m104572r(i);
                        break;
                    }
                    MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera is NULL");
                    return false;
                } catch (Throwable unused) {
                    i2++;
                    if (i2 >= 2) {
                        return false;
                    }
                    try {
                        Camera camera = this.f76926d;
                        if (camera != null) {
                            camera.setPreviewCallback(null);
                            this.f76926d.setPreviewCallbackWithBuffer(null);
                            this.f76926d.release();
                            this.f76926d = null;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            try {
                Camera.Parameters parameters = this.f76926d.getParameters();
                CameraHelper.selectCameraPreviewWH(parameters, this.f76925c, rowVar.m182468f());
                int iM182470h = rowVar.m182470h();
                tow towVar = this.f76925c;
                int i3 = towVar.f175463T;
                if (iM182470h > i3 / 1000) {
                    towVar.f175449F = i3 / 1000;
                } else {
                    towVar.f175449F = rowVar.m182470h();
                }
                CameraHelper.selectCameraFpsRange(parameters, this.f76925c);
                m104534D(this.f76925c, rowVar.m182468f());
                if (!CameraHelper.selectCameraColorFormat(parameters, this.f76925c)) {
                    MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.selectCameraColorFormat,Failed");
                    xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
                    if (interfaceC21409c != null) {
                        interfaceC21409c.onFail(ErrorCode.CAMERA_SELECT_COLORFORMAT_FAILED, "CameraHelper.selectCameraColorFormat,Failed");
                    }
                    this.f76925c.m192085a();
                    return false;
                }
                if (!CameraHelper.configCamera(this.f76926d, this.f76925c)) {
                    MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.configCamera,Failed");
                    xpl.InterfaceC21409c interfaceC21409c2 = this.f76937o;
                    if (interfaceC21409c2 != null) {
                        interfaceC21409c2.onFail(4005, "CameraHelper.configCamera,Failed");
                    }
                    this.f76925c.m192085a();
                    return false;
                }
                m104533C(this.f76925c);
                tow towVar2 = this.f76925c;
                int iM182467e = towVar2.f175478e;
                int iM182467e2 = towVar2.f175480f;
                if (!rowVar.m182465c()) {
                    if (rowVar.m182466d() == 1) {
                        iM182467e = (int) (iM182467e2 * rowVar.m182467e());
                        if (iM182467e != this.f76925c.f175478e) {
                            iM182467e = (iM182467e >> 4) << 4;
                        }
                    } else if (rowVar.m182466d() == 0 && (iM182467e2 = (int) (iM182467e / rowVar.m182467e())) != this.f76925c.f175480f) {
                        iM182467e2 = (iM182467e2 >> 4) << 4;
                    }
                }
                int i4 = this.f76928f;
                erf0 erf0Var = (i4 == 1 || i4 == 3) ? new erf0(iM182467e2, iM182467e) : new erf0(iM182467e, iM182467e2);
                if (!this.f76925c.f175469Z) {
                    erf0 erf0VarM182464b = rowVar.m182464b();
                    if (erf0VarM182464b != null && erf0VarM182464b.m122180b() > 0 && erf0VarM182464b.m122179a() > 0) {
                        this.f76925c.f175494m = erf0VarM182464b.m122180b();
                        this.f76925c.f175496n = erf0VarM182464b.m122179a();
                    }
                } else if (erf0Var.m122180b() > 0 && erf0Var.m122179a() > 0) {
                    this.f76925c.f175494m = erf0Var.m122180b();
                    this.f76925c.f175496n = erf0Var.m122179a();
                    rowVar.m182479r(erf0Var);
                }
                xpl.InterfaceC21410d interfaceC21410d = this.f76934l;
                if (interfaceC21410d != null) {
                    interfaceC21410d.mo139267V(this.f76926d);
                }
                return true;
            } catch (Exception e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.prepare failed !" + e.getMessage());
                xpl.InterfaceC21409c interfaceC21409c3 = this.f76937o;
                if (interfaceC21409c3 != null) {
                    interfaceC21409c3.onFail(4001, "CameraHelper.prepare failed !" + e.getMessage());
                }
                return false;
            }
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: H */
    public void mo104555H() {
        Camera camera = this.f76926d;
        if (camera != null) {
            if (this.f76933k != null) {
                camera.setPreviewCallbackWithBuffer(new C16019b());
            }
            this.f76926d.startPreview();
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: I */
    public void mo104556I(xpl.InterfaceC21410d interfaceC21410d) {
        synchronized (this.f76924b) {
            this.f76934l = interfaceC21410d;
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: J */
    public void mo104557J(xpl.InterfaceC21409c interfaceC21409c) {
        this.f76937o = interfaceC21409c;
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: K */
    public void mo104558K(xpl.InterfaceC21407a interfaceC21407a) {
        synchronized (this.f76924b) {
            this.f76933k = interfaceC21407a;
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: L */
    public void mo104559L() {
        synchronized (this.f76924b) {
            try {
                Camera camera = this.f76926d;
                if (camera != null) {
                    try {
                        camera.stopPreview();
                    } catch (Throwable th) {
                        MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera pauseCamera failed !" + th.getMessage());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RequiresApi(api = 14)
    /* JADX INFO: renamed from: O */
    public boolean m104560O(SurfaceTexture surfaceTexture, wje wjeVar) {
        this.f76931i = surfaceTexture;
        this.f76932j = wjeVar;
        Camera camera = this.f76926d;
        if (camera == null) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera is NULL");
            return false;
        }
        if (this.f76933k != null) {
            camera.setPreviewCallbackWithBuffer(new C16018a());
        }
        synchronized (this.f76924b) {
            try {
                try {
                    try {
                        this.f76926d.setPreviewTexture(this.f76931i);
                        this.f76926d.startPreview();
                    } catch (IOException e) {
                        MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera start preview failed !" + e.getMessage());
                        m104545u(e);
                        return false;
                    }
                } catch (RuntimeException e2) {
                    m104545u(e2);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: a */
    public int mo104561a() {
        xpl.InterfaceC21410d interfaceC21410d = this.f76934l;
        if (interfaceC21410d != null && !this.f76925c.f175504r) {
            interfaceC21410d.mo139267V(null);
        }
        synchronized (this.f76924b) {
            try {
                Camera camera = this.f76926d;
                if (camera == null) {
                    xpl.InterfaceC21410d interfaceC21410d2 = this.f76934l;
                    if (interfaceC21410d2 != null) {
                        interfaceC21410d2.mo139266G();
                    }
                    return 1;
                }
                try {
                    camera.stopPreview();
                    this.f76926d.setPreviewCallback(null);
                    this.f76926d.setPreviewCallbackWithBuffer(null);
                    this.f76926d.release();
                    xpl.InterfaceC21410d interfaceC21410d3 = this.f76934l;
                    if (interfaceC21410d3 != null) {
                        interfaceC21410d3.mo139266G();
                    }
                    this.f76926d = null;
                    return 1;
                } catch (Throwable th) {
                    MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera stop preview failed !" + th.getMessage());
                    xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
                    if (interfaceC21409c != null) {
                        interfaceC21409c.onFail(4003, "Camera stop preview failed !" + th.getMessage());
                    }
                    xpl.InterfaceC21410d interfaceC21410d4 = this.f76934l;
                    if (interfaceC21410d4 != null) {
                        interfaceC21410d4.mo139266G();
                    }
                    return -1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: b */
    public void mo104562b(int i) {
        Camera camera;
        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, FirebaseAnalytics.Param.LEVEL + i);
        try {
            if (this.f76926d.getParameters() != null && (camera = this.f76926d) != null) {
                if (i >= camera.getParameters().getMaxZoom()) {
                    i = 0;
                }
                if (this.f76926d.getParameters().isZoomSupported()) {
                    Camera.Parameters parameters = this.f76926d.getParameters();
                    parameters.setZoom(i);
                    this.f76926d.setParameters(parameters);
                }
            }
        } catch (Error e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera zoom level error!" + e.getMessage());
            xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(4005, "Set camera zoom level error!" + e.getMessage());
            }
            e.printStackTrace();
        } catch (Exception e2) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera zoom level error!" + e2.getMessage());
            xpl.InterfaceC21409c interfaceC21409c2 = this.f76937o;
            if (interfaceC21409c2 != null) {
                interfaceC21409c2.onFail(4005, "Set camera zoom level error!" + e2.getMessage());
            }
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: c */
    public int mo104563c() {
        try {
            Camera camera = this.f76926d;
            if (camera == null || camera.getParameters() == null) {
                return 0;
            }
            return this.f76926d.getParameters().getMaxZoom() - 1;
        } catch (Exception e) {
            xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera max support zoom level error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return 0;
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: d */
    public int mo104564d() {
        try {
            if (this.f76926d.getParameters() != null) {
                return this.f76926d.getParameters().getZoom();
            }
            return 0;
        } catch (Exception e) {
            xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera current zoom level error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return 0;
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: e */
    public void mo104565e(Camera.ErrorCallback errorCallback) {
        Camera camera = this.f76926d;
        if (camera != null) {
            camera.setErrorCallback(errorCallback);
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: g */
    public int mo104566g() {
        try {
            Camera camera = this.f76926d;
            if (camera != null) {
                return camera.getParameters().getMinExposureCompensation();
            }
            return 0;
        } catch (Exception e) {
            xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera Min Exposure Compensation error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Get camera Min Exposure Compensation error!" + e.getMessage());
            return 0;
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: h */
    public int mo104567h() {
        try {
            Camera camera = this.f76926d;
            if (camera != null) {
                return camera.getParameters().getMaxExposureCompensation();
            }
            return 0;
        } catch (Exception e) {
            xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera Max Exposure Compensation error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Get camera Max Exposure Compensation error!" + e.getMessage());
            return 0;
        }
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: i */
    public boolean mo104568i() {
        return this.f76936n;
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: j */
    public boolean mo104569j(SurfaceTexture surfaceTexture) {
        return m104560O(surfaceTexture, null);
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: k */
    public void mo104570k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        m104532A(rect, autoFocusCallback);
        m104536N(rect);
    }

    @Override // p153l.xpl
    /* JADX INFO: renamed from: m */
    public int mo104571m() {
        return this.f76928f * 90;
    }

    /* JADX INFO: renamed from: r */
    public void m104572r(int i) {
        if (this.f76926d == null) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "请先打开Camera!");
            return;
        }
        int iDetermineDisplayOrientation = CameraHelper.determineDisplayOrientation(i, this.f76930h);
        this.f76927e = iDetermineDisplayOrientation;
        Rotation rotation = Rotation.NORMAL;
        if (iDetermineDisplayOrientation == 90) {
            rotation = Rotation.ROTATION_90;
        } else if (iDetermineDisplayOrientation == 180) {
            rotation = Rotation.ROTATION_180;
        } else if (iDetermineDisplayOrientation == 270) {
            rotation = Rotation.ROTATION_270;
        }
        this.f76928f = this.f76930h == 1 ? rotation.ordinal() % (Rotation.ROTATION_270.ordinal() + 1) : rotation.ordinal() % (Rotation.ROTATION_270.ordinal() + 1);
        this.f76926d.setDisplayOrientation(this.f76927e);
    }

    @Override // p153l.xpl
    @RequiresApi(api = 8)
    public void release() {
        synchronized (this.f76924b) {
            try {
                Camera camera = this.f76926d;
                if (camera != null) {
                    camera.setPreviewCallback(null);
                    this.f76926d.setPreviewCallbackWithBuffer(null);
                    this.f76926d.release();
                    this.f76926d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f76932j = null;
        m104543s();
        f76922q = false;
    }

    @Override // p153l.xpl
    public void setExposureCompensation(int i) {
        try {
            Camera camera = this.f76926d;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                if (i > mo104567h()) {
                    i = mo104567h();
                }
                if (i < mo104566g()) {
                    i = mo104566g();
                }
                parameters.setExposureCompensation(i);
                this.f76926d.setParameters(parameters);
            }
        } catch (Exception e) {
            xpl.InterfaceC21409c interfaceC21409c = this.f76937o;
            if (interfaceC21409c != null) {
                interfaceC21409c.onFail(4005, "Set camera Exposure Compensation error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera Exposure Compensation error!" + e.getMessage());
        }
    }
}
