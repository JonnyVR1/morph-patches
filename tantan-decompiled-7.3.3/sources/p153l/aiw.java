package p153l;

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
public class aiw implements ypl {

    /* JADX INFO: renamed from: q */
    private static boolean f71587q = false;

    /* JADX INFO: renamed from: c */
    private sow f71590c;

    /* JADX INFO: renamed from: d */
    private Camera f71591d;

    /* JADX INFO: renamed from: i */
    private SurfaceTexture f71596i;

    /* JADX INFO: renamed from: j */
    private uje f71597j;

    /* JADX INFO: renamed from: k */
    private ypl.InterfaceC21656a f71598k;

    /* JADX INFO: renamed from: l */
    private ypl.InterfaceC21658c f71599l;

    /* JADX INFO: renamed from: m */
    private ypl.InterfaceC21661f f71600m;

    /* JADX INFO: renamed from: a */
    private final String f71588a = MDLogTag.MOMENT_CAMERA_TAG;

    /* JADX INFO: renamed from: b */
    private final Object f71589b = new Object();

    /* JADX INFO: renamed from: e */
    private int f71592e = 0;

    /* JADX INFO: renamed from: f */
    private int f71593f = 0;

    /* JADX INFO: renamed from: h */
    private int f71595h = 0;

    /* JADX INFO: renamed from: n */
    Camera.CameraInfo f71601n = new Camera.CameraInfo();

    /* JADX INFO: renamed from: o */
    private boolean f71602o = true;

    /* JADX INFO: renamed from: p */
    private ypl.InterfaceC21660e f71603p = null;

    /* JADX INFO: renamed from: g */
    private int f71594g = Camera.getNumberOfCameras();

    /* JADX INFO: renamed from: l.aiw$a */
    public class C15718a implements Camera.PreviewCallback {
        public C15718a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            synchronized (aiw.this.f71589b) {
                try {
                    if (aiw.this.f71598k != null) {
                        aiw.this.f71598k.onData(bArr);
                    }
                    if (aiw.this.f71591d != null && aiw.this.f71590c.f169985y == bArr.length) {
                        aiw.this.f71591d.addCallbackBuffer(bArr);
                    }
                    aiw.m98161D(aiw.this);
                    if (aiw.this.f71597j != null) {
                        try {
                            aiw.this.f71597j.m196327f();
                            if (aiw.this.f71596i != null) {
                                aiw.this.f71596i.updateTexImage();
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

    /* JADX INFO: renamed from: l.aiw$c */
    public class C15720c implements Camera.PictureCallback {
        public C15720c() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            try {
                if (aiw.this.f71599l != null) {
                    aiw.this.f71599l.mo139160a(bArr);
                }
                camera.startPreview();
            } catch (Exception e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera take photo failed !!!" + e.toString());
                if (aiw.this.f71603p != null) {
                    aiw.this.f71603p.onFail(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, "Camera take photo failed !!!" + e.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.aiw$d */
    public class C15721d implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.aiw$e */
    public class C15722e implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.aiw$f */
    public class C15723f implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    @RequiresApi(api = 9)
    public aiw(sow sowVar) {
        this.f71590c = sowVar;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ gql m98161D(aiw aiwVar) {
        aiwVar.getClass();
        return null;
    }

    /* JADX INFO: renamed from: L */
    private boolean m98166L() {
        boolean z;
        try {
            Camera.getCameraInfo(this.f71595h, this.f71601n);
            z = true;
        } catch (Exception e) {
            MDLog.printErrStackTrace(MDLogTag.MOMENT_CAMERA_TAG, e);
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is front error!" + e.getMessage());
            }
            z = false;
        }
        return this.f71595h == 1 || (z && this.f71601n.facing == 1);
    }

    /* JADX INFO: renamed from: M */
    private void m98167M(Exception exc) {
        Camera camera = this.f71591d;
        if (camera != null) {
            camera.setPreviewCallback(null);
            this.f71591d.setPreviewCallbackWithBuffer(null);
            this.f71591d.release();
            SurfaceTexture surfaceTexture = this.f71596i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f71591d = null;
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(4002, "Camera start preview failed !" + exc.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static List<crf0> m98168N(Context context, int i) {
        return m98169O(context, null, i, -1, -1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: O */
    public static List<crf0> m98169O(Context context, crf0 crf0Var, int i, int i2, float f) {
        List<Camera.Size> supportedPreviewSizes;
        List<Camera.Size> list;
        List<Camera.Size> supportedPreviewSizes2;
        int i3;
        ArrayList arrayList = new ArrayList();
        if (m98170P(context, arrayList, Integer.toString(i))) {
            return arrayList;
        }
        int i4 = 0;
        if ((i & 2) != 0) {
            try {
                Camera cameraOpen = Camera.open(0);
                supportedPreviewSizes = cameraOpen.getParameters().getSupportedPreviewSizes();
                cameraOpen.release();
                Collections.sort(supportedPreviewSizes, new C15721d());
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
            Collections.sort(supportedPreviewSizes2, new C15722e());
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
        if (i2 > 0 && f > 0.0f && crf0Var != null && supportedPreviewSizes.size() > 0) {
            int iM112050b = crf0Var.m112050b() * crf0Var.m112049a();
            int i5 = 0;
            for (Camera.Size size3 : supportedPreviewSizes) {
                int iM112050b2 = (size3.width * size3.height) - (crf0Var.m112050b() * crf0Var.m112049a());
                if (i2 == 0) {
                    if (size3.width / f <= size3.height) {
                        if (Math.abs(iM112050b2) < iM112050b) {
                            if (size3.width > crf0Var.m112050b() || size3.height <= crf0Var.m112049a()) {
                                iM112050b = Math.abs(iM112050b2);
                                i4 = size3.width;
                                i5 = size3.height;
                            }
                        } else if (Math.abs(iM112050b2) != iM112050b && i4 < (i3 = size3.width)) {
                            i5 = size3.height;
                            i4 = i3;
                        }
                    }
                } else if (i2 != 1 || size3.height * f <= size3.width) {
                    if (Math.abs(iM112050b2) < iM112050b) {
                        if (size3.width > crf0Var.m112050b()) {
                        }
                        iM112050b = Math.abs(iM112050b2);
                        i4 = size3.width;
                        i5 = size3.height;
                    } else if (Math.abs(iM112050b2) != iM112050b) {
                    }
                }
            }
            if (i4 != 0 && i5 != 0) {
                arrayList.add(new crf0(i4, i5));
            }
        } else if (crf0Var == null) {
            for (Camera.Size size4 : supportedPreviewSizes) {
                arrayList.add(new crf0(size4.width, size4.height));
            }
            Collections.sort(supportedPreviewSizes, new C15723f());
        }
        m98176W(context, arrayList, Integer.toString(i));
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    private static boolean m98170P(Context context, List<crf0> list, String str) {
        String string = cq80.m111883a(context).getString(str, null);
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
                                list.add(new crf0(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1])));
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

    /* JADX INFO: renamed from: Q */
    private boolean m98171Q(Camera.Parameters parameters) {
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
    private boolean m98172R(Camera.Parameters parameters) {
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
    private void m98173S(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        String str;
        Camera camera = this.f71591d;
        if (camera == null) {
            return;
        }
        try {
            camera.cancelAutoFocus();
            try {
                parameters = this.f71591d.getParameters();
            } catch (RuntimeException unused) {
                parameters = null;
            }
            if (parameters == null) {
                return;
            }
            if (m98171Q(parameters)) {
                str = "auto";
            } else if (!m98172R(parameters) && !mo98193i()) {
                return;
            } else {
                str = "continuous-video";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rect, 1000));
            if (!mo98193i()) {
                parameters.setFocusMode(str);
                parameters.setFocusAreas(arrayList);
            }
            try {
                this.f71591d.setParameters(parameters);
                if (mo98193i()) {
                    return;
                }
                this.f71591d.autoFocus(autoFocusCallback);
            } catch (Exception e) {
                ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
                if (interfaceC21660e != null) {
                    interfaceC21660e.onFail(4005, "Set camera autoFocus error!" + e.getMessage());
                }
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            }
        } catch (Exception e2) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: U */
    private void m98174U(sow sowVar) {
        for (int i = 0; i < sowVar.f169986z; i++) {
            this.f71591d.addCallbackBuffer(new byte[sowVar.f169985y]);
        }
    }

    /* JADX INFO: renamed from: V */
    private void m98175V(sow sowVar, crf0 crf0Var) {
        float f;
        int i;
        if (sowVar.f169953a) {
            f = sowVar.f169957c;
            i = sowVar.f169955b;
        } else {
            f = sowVar.f169955b;
            i = sowVar.f169957c;
        }
        float f2 = i / f;
        float f3 = sowVar.f169974n / sowVar.f169973m;
        if (f2 == f3) {
            sowVar.f169983w = 0.0f;
        } else if (f2 > f3) {
            sowVar.f169983w = (1.0f - (f3 / f2)) / 2.0f;
        } else {
            sowVar.f169983w = (-(1.0f - (f2 / f3))) / 2.0f;
        }
        sowVar.f169985y = ((sowVar.f169955b * sowVar.f169957c) * 3) / 2;
    }

    /* JADX INFO: renamed from: W */
    private static void m98176W(Context context, List<crf0> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (crf0 crf0Var : list) {
            sb.append(crf0Var.m112050b() + Constants.SEPARATOR_COMMA + crf0Var.m112049a() + "\r\n");
        }
        cq80.m111884b(context).putString(str, sb.toString()).commit();
    }

    /* JADX INFO: renamed from: X */
    private void m98177X(Rect rect) {
        Camera.Parameters parameters;
        Camera camera = this.f71591d;
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
                this.f71591d.setParameters(parameters);
            } catch (Exception e) {
                ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
                if (interfaceC21660e != null) {
                    interfaceC21660e.onFail(4005, "Set camera setMeteringArea error!" + e.getMessage());
                }
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            }
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: A */
    public boolean mo98181A(int i, qow qowVar) {
        synchronized (this.f71589b) {
            try {
                MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Swap camera");
                Camera camera = this.f71591d;
                if (camera != null) {
                    camera.stopPreview();
                    this.f71591d.setPreviewCallback(null);
                    this.f71591d.setPreviewCallbackWithBuffer(null);
                    this.f71591d.release();
                    this.f71591d = null;
                }
                boolean zM177373y = qowVar.m177373y();
                int i2 = this.f71595h;
                if (zM177373y) {
                    if (i2 == 0) {
                        this.f71595h = 1;
                    } else {
                        this.f71595h = 0;
                    }
                    MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Fixed camera mode, switched to: ".concat(this.f71595h == 1 ? "FRONT" : "BACK"));
                } else {
                    this.f71595h = (i2 + 1) % this.f71594g;
                    MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Cycle all cameras mode, switched to ID: " + this.f71595h);
                }
                qowVar.m177329E(this.f71595h);
                mo98182C(i, qowVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: C */
    public boolean mo98182C(int i, qow qowVar) {
        if (this.f71594g - 1 >= qowVar.m177352d()) {
            this.f71595h = qowVar.m177352d();
        }
        synchronized (this.f71589b) {
            int i2 = 0;
            while (i2 < 2) {
                try {
                    if (!m98186T()) {
                        MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera Open Failed!");
                        return false;
                    }
                    if (this.f71591d != null) {
                        m98185K(i);
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
                        Camera camera = this.f71591d;
                        if (camera != null) {
                            camera.setPreviewCallback(null);
                            this.f71591d.setPreviewCallbackWithBuffer(null);
                            this.f71591d.release();
                            this.f71591d = null;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            try {
                Camera.Parameters parameters = this.f71591d.getParameters();
                t94.m189732e(parameters, this.f71590c, qowVar.m177365q());
                int iM177369u = qowVar.m177369u();
                sow sowVar = this.f71590c;
                int i3 = sowVar.f169933G;
                if (iM177369u > i3 / 1000) {
                    sowVar.f169979s = i3 / 1000;
                } else {
                    sowVar.f169979s = qowVar.m177369u();
                }
                t94.m189731d(parameters, this.f71590c);
                m98175V(this.f71590c, qowVar.m177365q());
                if (!t94.m189730c(parameters, this.f71590c)) {
                    MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.selectCameraColorFormat,Failed");
                    ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
                    if (interfaceC21660e != null) {
                        interfaceC21660e.onFail(ErrorCode.CAMERA_SELECT_COLORFORMAT_FAILED, "CameraHelper.selectCameraColorFormat,Failed");
                    }
                    this.f71590c.m187280a();
                    return false;
                }
                if (!t94.m189728a(this.f71591d, this.f71590c)) {
                    MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.configCamera,Failed");
                    ypl.InterfaceC21660e interfaceC21660e2 = this.f71603p;
                    if (interfaceC21660e2 != null) {
                        interfaceC21660e2.onFail(4005, "CameraHelper.configCamera,Failed");
                    }
                    this.f71590c.m187280a();
                    return false;
                }
                m98174U(this.f71590c);
                sow sowVar2 = this.f71590c;
                int iM177364p = sowVar2.f169955b;
                int iM177364p2 = sowVar2.f169957c;
                if (!qowVar.m177358j()) {
                    if (qowVar.m177363o() == 1) {
                        iM177364p = (int) (iM177364p2 * qowVar.m177364p());
                        if (iM177364p != this.f71590c.f169955b) {
                            iM177364p = (iM177364p >> 4) << 4;
                        }
                    } else if (qowVar.m177363o() == 0 && (iM177364p2 = (int) (iM177364p / qowVar.m177364p())) != this.f71590c.f169957c) {
                        iM177364p2 = (iM177364p2 >> 4) << 4;
                    }
                }
                int i4 = this.f71593f;
                crf0 crf0Var = (i4 == 1 || i4 == 3) ? new crf0(iM177364p2, iM177364p) : new crf0(iM177364p, iM177364p2);
                if (!this.f71590c.f169939M) {
                    crf0 crf0VarM177353e = qowVar.m177353e();
                    if (crf0VarM177353e != null && crf0VarM177353e.m112050b() > 0 && crf0VarM177353e.m112049a() > 0) {
                        this.f71590c.f169967h = crf0VarM177353e.m112050b();
                        this.f71590c.f169969i = crf0VarM177353e.m112049a();
                    }
                } else if (crf0Var.m112050b() > 0 && crf0Var.m112049a() > 0) {
                    this.f71590c.f169967h = crf0Var.m112050b();
                    this.f71590c.f169969i = crf0Var.m112049a();
                    qowVar.m177330F(crf0Var);
                }
                ypl.InterfaceC21661f interfaceC21661f = this.f71600m;
                if (interfaceC21661f != null) {
                    interfaceC21661f.mo117626V(this.f71591d);
                }
                return true;
            } catch (Exception e) {
                MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.prepare failed !" + e.getMessage());
                ypl.InterfaceC21660e interfaceC21660e3 = this.f71603p;
                if (interfaceC21660e3 != null) {
                    interfaceC21660e3.onFail(4001, "CameraHelper.prepare failed !" + e.getMessage());
                }
                return false;
            }
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: E */
    public void mo98183E(String str) {
        Camera.Parameters parameters;
        List<String> supportedFlashModes;
        try {
            Camera camera = this.f71591d;
            if (camera == null || (supportedFlashModes = (parameters = camera.getParameters()).getSupportedFlashModes()) == null || !supportedFlashModes.contains(str)) {
                return;
            }
            parameters.setFlashMode(str);
            this.f71591d.setParameters(parameters);
        } catch (Exception e) {
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(4005, "Set camera flash Mode error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera flash Mode error!" + e.getMessage());
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: F */
    public boolean mo98184F() {
        try {
            return !this.f71591d.getParameters().isSmoothZoomSupported();
        } catch (Exception e) {
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is support zoom error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return true;
        }
    }

    /* JADX INFO: renamed from: K */
    public void m98185K(int i) {
        if (this.f71591d == null) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "请先打开Camera!");
            return;
        }
        int iM189729b = t94.m189729b(i, this.f71595h);
        this.f71592e = iM189729b;
        Rotation rotation = Rotation.NORMAL;
        if (iM189729b == 90) {
            rotation = Rotation.ROTATION_90;
        } else if (iM189729b == 180) {
            rotation = Rotation.ROTATION_180;
        } else if (iM189729b == 270) {
            rotation = Rotation.ROTATION_270;
        }
        this.f71593f = this.f71595h == 1 ? rotation.ordinal() % (Rotation.ROTATION_270.ordinal() + 1) : rotation.ordinal() % (Rotation.ROTATION_270.ordinal() + 1);
        this.f71591d.setDisplayOrientation(this.f71592e);
    }

    @RequiresApi(api = 9)
    /* JADX INFO: renamed from: T */
    public boolean m98186T() {
        try {
            this.f71591d = Camera.open(this.f71595h);
            f71587q = true;
            this.f71602o = m98166L();
            return true;
        } catch (Throwable th) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera open failed !" + th.getMessage());
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e == null) {
                return false;
            }
            interfaceC21660e.onFail(4004, "Camera open failed !" + th.getMessage());
            return false;
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: a */
    public int mo98187a() {
        synchronized (this.f71589b) {
            try {
                Camera camera = this.f71591d;
                if (camera == null) {
                    ypl.InterfaceC21661f interfaceC21661f = this.f71600m;
                    if (interfaceC21661f != null) {
                        interfaceC21661f.mo117612G();
                    }
                    return 1;
                }
                try {
                    camera.stopPreview();
                    this.f71591d.setPreviewCallback(null);
                    this.f71591d.setPreviewCallbackWithBuffer(null);
                    this.f71591d.release();
                    ypl.InterfaceC21661f interfaceC21661f2 = this.f71600m;
                    if (interfaceC21661f2 != null) {
                        interfaceC21661f2.mo117612G();
                    }
                    this.f71591d = null;
                    return 1;
                } catch (Throwable th) {
                    MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera stop preview failed !" + th.getMessage());
                    ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
                    if (interfaceC21660e != null) {
                        interfaceC21660e.onFail(4003, "Camera stop preview failed !" + th.getMessage());
                    }
                    ypl.InterfaceC21661f interfaceC21661f3 = this.f71600m;
                    if (interfaceC21661f3 != null) {
                        interfaceC21661f3.mo117612G();
                    }
                    return -1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: b */
    public void mo98188b(int i) {
        Camera camera;
        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, FirebaseAnalytics.Param.LEVEL + i);
        try {
            if (this.f71591d.getParameters() != null && (camera = this.f71591d) != null) {
                if (i >= camera.getParameters().getMaxZoom()) {
                    i = 0;
                }
                if (this.f71591d.getParameters().isZoomSupported()) {
                    Camera.Parameters parameters = this.f71591d.getParameters();
                    parameters.setZoom(i);
                    this.f71591d.setParameters(parameters);
                }
            }
        } catch (Error e) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera zoom level error!" + e.getMessage());
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(4005, "Set camera zoom level error!" + e.getMessage());
            }
            e.printStackTrace();
        } catch (Exception e2) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera zoom level error!" + e2.getMessage());
            ypl.InterfaceC21660e interfaceC21660e2 = this.f71603p;
            if (interfaceC21660e2 != null) {
                interfaceC21660e2.onFail(4005, "Set camera zoom level error!" + e2.getMessage());
            }
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: c */
    public int mo98189c() {
        try {
            Camera camera = this.f71591d;
            if (camera == null || camera.getParameters() == null) {
                return 0;
            }
            return this.f71591d.getParameters().getMaxZoom() - 1;
        } catch (Exception e) {
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera max support zoom level error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return 0;
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: d */
    public int mo98190d() {
        try {
            if (this.f71591d.getParameters() != null) {
                return this.f71591d.getParameters().getZoom();
            }
            return 0;
        } catch (Exception e) {
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera current zoom level error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return 0;
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: e */
    public void mo98191e(Camera.ErrorCallback errorCallback) {
        Camera camera = this.f71591d;
        if (camera != null) {
            camera.setErrorCallback(errorCallback);
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: f */
    public void mo98192f(int i, int i2, Rect rect, boolean z) {
        if (z) {
            m98177X(ad4.m97010b(i, i2, rect));
        } else {
            m98177X(ad4.m97009a(i, i2, rect, mo98193i()));
        }
    }

    @Override // p153l.ypl
    public crf0 getTextureSize() {
        return null;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: i */
    public boolean mo98193i() {
        return this.f71602o;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: j */
    public boolean mo98194j(SurfaceTexture surfaceTexture) {
        return mo98199o(surfaceTexture, null);
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: k */
    public void mo98195k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        m98173S(rect, autoFocusCallback);
        m98177X(rect);
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: l */
    public void mo98196l(ypl.InterfaceC21661f interfaceC21661f) {
        synchronized (this.f71589b) {
            this.f71600m = interfaceC21661f;
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: m */
    public int mo98197m() {
        return this.f71593f * 90;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: n */
    public int[] mo98198n() {
        sow sowVar = this.f71590c;
        if (sowVar != null) {
            return new int[]{sowVar.f169934H / 1000, sowVar.f169933G / 1000};
        }
        return null;
    }

    @Override // p153l.ypl
    @RequiresApi(api = 14)
    /* JADX INFO: renamed from: o */
    public boolean mo98199o(SurfaceTexture surfaceTexture, uje ujeVar) {
        this.f71596i = surfaceTexture;
        this.f71597j = ujeVar;
        Camera camera = this.f71591d;
        if (camera == null) {
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera is NULL");
            return false;
        }
        if (this.f71598k != null) {
            camera.setPreviewCallbackWithBuffer(new C15718a());
        }
        synchronized (this.f71589b) {
            try {
                try {
                    try {
                        this.f71591d.setPreviewTexture(this.f71596i);
                        this.f71591d.startPreview();
                    } catch (IOException e) {
                        MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Camera start preview failed !" + e.getMessage());
                        m98167M(e);
                        return false;
                    }
                } catch (RuntimeException e2) {
                    m98167M(e2);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: p */
    public void mo98200p(ypl.InterfaceC21660e interfaceC21660e) {
        this.f71603p = interfaceC21660e;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: r */
    public void mo98202r(ypl.InterfaceC21658c interfaceC21658c) {
        this.f71599l = interfaceC21658c;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: s */
    public boolean mo98203s(int i) {
        return false;
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: t */
    public void mo98204t(String str) {
        this.f71591d.takePicture(null, new C15719b(), new C15720c());
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: u */
    public boolean mo98205u(int i, qow qowVar) {
        try {
            synchronized (this.f71589b) {
                try {
                    MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, "Reset camera");
                    Camera camera = this.f71591d;
                    if (camera != null) {
                        camera.stopPreview();
                        this.f71591d.setPreviewCallback(null);
                        this.f71591d.setPreviewCallbackWithBuffer(null);
                        this.f71591d.release();
                        this.f71591d = null;
                    }
                    qowVar.m177329E(this.f71595h);
                    mo98182C(i, qowVar);
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

    @Override // p153l.ypl
    /* JADX INFO: renamed from: v */
    public boolean mo98206v() {
        List<String> supportedFlashModes;
        try {
            Camera camera = this.f71591d;
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
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is Support Flash Torch Mode error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Get camera is Support Flash Torch Mode error!" + e.getMessage());
            return false;
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: w */
    public void mo98207w(ypl.InterfaceC21656a interfaceC21656a) {
        synchronized (this.f71589b) {
            this.f71598k = interfaceC21656a;
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: x */
    public crf0 mo98208x() {
        sow sowVar = this.f71590c;
        return new crf0(sowVar.f169955b, sowVar.f169957c);
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: y */
    public boolean mo98209y() {
        List<String> supportedFlashModes;
        try {
            Camera camera = this.f71591d;
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
            ypl.InterfaceC21660e interfaceC21660e = this.f71603p;
            if (interfaceC21660e != null) {
                interfaceC21660e.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is Support Flash Auto Mode error!" + e.getMessage());
            }
            MDLog.m7445e(MDLogTag.MOMENT_CAMERA_TAG, "Get camera is Support Flash Auto Mode error!" + e.toString());
            return false;
        }
    }

    @Override // p153l.ypl
    /* JADX INFO: renamed from: q */
    public void mo98201q(ypl.InterfaceC21659d interfaceC21659d) {
    }

    /* JADX INFO: renamed from: l.aiw$b */
    public class C15719b implements Camera.PictureCallback {
        public C15719b() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
        }
    }
}
