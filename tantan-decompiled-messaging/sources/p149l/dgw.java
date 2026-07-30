package p149l;

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
public class dgw implements mnl {

    /* JADX INFO: renamed from: q */
    private static boolean f86176q = false;

    /* JADX INFO: renamed from: c */
    private ulw f86179c;

    /* JADX INFO: renamed from: d */
    private Camera f86180d;

    /* JADX INFO: renamed from: i */
    private SurfaceTexture f86185i;

    /* JADX INFO: renamed from: j */
    private sie f86186j;

    /* JADX INFO: renamed from: k */
    private mnl.InterfaceC18510a f86187k;

    /* JADX INFO: renamed from: l */
    private mnl.InterfaceC18513d f86188l;

    /* JADX INFO: renamed from: p */
    private tg3 f86192p;

    /* JADX INFO: renamed from: a */
    private final String f86177a = MDLogTag.MOMENT_CAMERA_TAG;

    /* JADX INFO: renamed from: b */
    private final Object f86178b = new Object();

    /* JADX INFO: renamed from: e */
    private int f86181e = 0;

    /* JADX INFO: renamed from: f */
    private int f86182f = 0;

    /* JADX INFO: renamed from: h */
    private int f86184h = 0;

    /* JADX INFO: renamed from: m */
    Camera.CameraInfo f86189m = new Camera.CameraInfo();

    /* JADX INFO: renamed from: n */
    private boolean f86190n = true;

    /* JADX INFO: renamed from: o */
    private mnl.InterfaceC18512c f86191o = null;

    /* JADX INFO: renamed from: g */
    private int f86183g = Camera.getNumberOfCameras();

    /* JADX INFO: renamed from: l.dgw$a */
    public class C16369a implements Camera.PreviewCallback {
        public C16369a() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            synchronized (dgw.this.f86178b) {
                try {
                    if (dgw.this.f86187k != null) {
                        dgw.this.f86187k.onData(bArr);
                    }
                    if (dgw.this.f86180d != null && dgw.this.f86179c.f177113L == bArr.length) {
                        dgw.this.f86180d.addCallbackBuffer(bArr);
                    }
                    if (dgw.this.f86186j != null) {
                        try {
                            dgw.this.f86186j.m184333i();
                            if (dgw.this.f86185i != null) {
                                dgw.this.f86185i.updateTexImage();
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

    /* JADX INFO: renamed from: l.dgw$b */
    public class C16370b implements Camera.PreviewCallback {
        public C16370b() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            synchronized (dgw.this.f86178b) {
                try {
                    if (dgw.this.f86187k != null) {
                        dgw.this.f86187k.onData(bArr);
                    }
                    if (dgw.this.f86180d != null) {
                        dgw.this.f86180d.addCallbackBuffer(bArr);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.dgw$c */
    public class C16371c implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.dgw$d */
    public class C16372d implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: l.dgw$e */
    public class C16373e implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    @RequiresApi(api = 9)
    public dgw(ulw ulwVar) {
        this.f86179c = ulwVar;
    }

    /* JADX INFO: renamed from: A */
    private void m111735A(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        Camera.Parameters parameters;
        String str;
        Camera camera = this.f86180d;
        if (camera == null) {
            return;
        }
        try {
            camera.cancelAutoFocus();
            try {
                parameters = this.f86180d.getParameters();
            } catch (RuntimeException unused) {
                parameters = null;
            }
            if (parameters == null) {
                return;
            }
            if (m111752y(parameters)) {
                str = "auto";
            } else if (!m111753z(parameters) && !mo111771i()) {
                return;
            } else {
                str = "continuous-video";
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(rect, 1000));
            if (!mo111771i()) {
                parameters.setFocusMode(str);
                parameters.setFocusAreas(arrayList);
            }
            try {
                this.f86180d.setParameters(parameters);
                if (mo111771i()) {
                    return;
                }
                this.f86180d.autoFocus(autoFocusCallback);
            } catch (Exception e) {
                mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
                if (interfaceC18512c != null) {
                    interfaceC18512c.onFail(4005, "Set camera autoFocus error!" + e.getMessage());
                }
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            }
        } catch (Exception e2) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: C */
    private void m111736C(ulw ulwVar) {
        tg3 tg3Var = this.f86192p;
        if (tg3Var == null) {
            this.f86192p = new tg3();
        } else {
            tg3Var.m188802b();
        }
        for (int i = 0; i < ulwVar.f177114M; i++) {
            try {
                this.f86180d.addCallbackBuffer(this.f86192p.m188801a(ulwVar.f177113L));
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private void m111737D(ulw ulwVar, vif0 vif0Var) {
        float f;
        int i;
        int i2 = ulwVar.f177132c;
        boolean z = ulwVar.f177134d;
        if (i2 != 2) {
            if (z) {
                f = ulwVar.f177138f;
                i = ulwVar.f177136e;
            } else {
                f = ulwVar.f177136e;
                i = ulwVar.f177138f;
            }
            float f2 = i / f;
            float f3 = ulwVar.f177166t / ulwVar.f177164s;
            if (f2 == f3) {
                ulwVar.f177111J = 0.0f;
            } else if (f2 > f3) {
                ulwVar.f177111J = (1.0f - (f3 / f2)) / 2.0f;
            } else {
                ulwVar.f177111J = (-(1.0f - (f2 / f3))) / 2.0f;
            }
        }
        ulwVar.f177113L = ((ulwVar.f177136e * ulwVar.f177138f) * 3) / 2;
    }

    /* JADX INFO: renamed from: M */
    private static void m111738M(Context context, List<vif0> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (vif0 vif0Var : list) {
            sb.append(vif0Var.m198562b() + Constants.SEPARATOR_COMMA + vif0Var.m198561a() + "\r\n");
        }
        PreferenceUtil.getEditor(context).putString(str, sb.toString()).commit();
    }

    /* JADX INFO: renamed from: N */
    private void m111739N(Rect rect) {
        Camera.Parameters parameters;
        Camera camera = this.f86180d;
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
                this.f86180d.setParameters(parameters);
            } catch (Exception e) {
                mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
                if (interfaceC18512c != null) {
                    interfaceC18512c.onFail(4005, "Set camera setMeteringArea error!" + e.getMessage());
                }
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static synchronized void m111746s() {
    }

    /* JADX INFO: renamed from: t */
    private boolean m111747t() {
        boolean z;
        try {
            Camera.getCameraInfo(this.f86184h, this.f86189m);
            z = true;
        } catch (Exception e) {
            MDLog.printErrStackTrace(MDLogTag.MOMENT_CAMERA_TAG, e);
            mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera is front error!" + e.getMessage());
            }
            z = false;
        }
        return this.f86184h == 1 || (z && this.f86189m.facing == 1);
    }

    /* JADX INFO: renamed from: u */
    private void m111748u(Exception exc) {
        Camera camera = this.f86180d;
        if (camera != null) {
            camera.setPreviewCallback(null);
            this.f86180d.setPreviewCallbackWithBuffer(null);
            this.f86180d.release();
            SurfaceTexture surfaceTexture = this.f86185i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f86180d = null;
            mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(4002, "Camera start preview failed !" + exc.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static List<vif0> m111749v(Context context, int i) {
        return m111750w(context, null, i, -1, -1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public static List<vif0> m111750w(Context context, vif0 vif0Var, int i, int i2, float f) {
        List<Camera.Size> supportedPreviewSizes;
        List<Camera.Size> list;
        List<Camera.Size> supportedPreviewSizes2;
        int i3;
        ArrayList arrayList = new ArrayList();
        if (m111751x(context, arrayList, Integer.toString(i))) {
            return arrayList;
        }
        int i4 = 0;
        if ((i & 2) != 0) {
            try {
                Camera cameraOpen = Camera.open(0);
                supportedPreviewSizes = cameraOpen.getParameters().getSupportedPreviewSizes();
                cameraOpen.release();
                Collections.sort(supportedPreviewSizes, new C16371c());
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
            Collections.sort(supportedPreviewSizes2, new C16372d());
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
        if (i2 > 0 && f > 0.0f && vif0Var != null && supportedPreviewSizes.size() > 0) {
            int iM198562b = vif0Var.m198562b() * vif0Var.m198561a();
            int i5 = 0;
            for (Camera.Size size3 : supportedPreviewSizes) {
                int iM198562b2 = (size3.width * size3.height) - (vif0Var.m198562b() * vif0Var.m198561a());
                if (i2 == 0) {
                    if (size3.width / f <= size3.height) {
                        if (Math.abs(iM198562b2) < iM198562b) {
                            if (size3.width > vif0Var.m198562b() || size3.height <= vif0Var.m198561a()) {
                                iM198562b = Math.abs(iM198562b2);
                                i4 = size3.width;
                                i5 = size3.height;
                            }
                        } else if (Math.abs(iM198562b2) != iM198562b && i4 < (i3 = size3.width)) {
                            i5 = size3.height;
                            i4 = i3;
                        }
                    }
                } else if (i2 != 1 || size3.height * f <= size3.width) {
                    if (Math.abs(iM198562b2) < iM198562b) {
                        if (size3.width > vif0Var.m198562b()) {
                        }
                        iM198562b = Math.abs(iM198562b2);
                        i4 = size3.width;
                        i5 = size3.height;
                    } else if (Math.abs(iM198562b2) != iM198562b) {
                    }
                }
            }
            if (i4 != 0 && i5 != 0) {
                arrayList.add(new vif0(i4, i5));
            }
        } else if (vif0Var == null) {
            for (Camera.Size size4 : supportedPreviewSizes) {
                arrayList.add(new vif0(size4.width, size4.height));
            }
            Collections.sort(supportedPreviewSizes, new C16373e());
        }
        m111738M(context, arrayList, Integer.toString(i));
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    private static boolean m111751x(Context context, List<vif0> list, String str) {
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
                                list.add(new vif0(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1])));
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

    /* JADX INFO: renamed from: y */
    private boolean m111752y(Camera.Parameters parameters) {
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
    private boolean m111753z(Camera.Parameters parameters) {
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
    public boolean m111754B() {
        try {
            this.f86180d = Camera.open(this.f86184h);
            f86176q = true;
            this.f86190n = m111747t();
            return true;
        } catch (Throwable th) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera open failed !" + th.getMessage());
            mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
            if (interfaceC18512c == null) {
                return false;
            }
            interfaceC18512c.onFail(4004, "Camera open failed !" + th.getMessage());
            return false;
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: E */
    public boolean mo111755E(int i, slw slwVar) {
        synchronized (this.f86178b) {
            try {
                MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Swap camera");
                Camera camera = this.f86180d;
                if (camera != null) {
                    camera.stopPreview();
                    this.f86180d.setPreviewCallback(null);
                    this.f86180d.setPreviewCallbackWithBuffer(null);
                    this.f86180d.release();
                    this.f86180d = null;
                }
                int i2 = (this.f86184h + 1) % this.f86183g;
                this.f86184h = i2;
                slwVar.m184887q(i2);
                mo111757G(i, slwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: F */
    public boolean mo111756F(int i, slw slwVar) {
        try {
            synchronized (this.f86178b) {
                try {
                    MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, "Reset camera");
                    Camera camera = this.f86180d;
                    if (camera != null) {
                        camera.stopPreview();
                        this.f86180d.setPreviewCallback(null);
                        this.f86180d.setPreviewCallbackWithBuffer(null);
                        this.f86180d.release();
                        this.f86180d = null;
                    }
                    slwVar.m184887q(this.f86184h);
                    mo111757G(i, slwVar);
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

    @Override // p149l.mnl
    /* JADX INFO: renamed from: G */
    public boolean mo111757G(int i, slw slwVar) {
        if (this.f86183g - 1 >= slwVar.m184872a()) {
            this.f86184h = slwVar.m184872a();
        }
        synchronized (this.f86178b) {
            int i2 = 0;
            while (i2 < 2) {
                try {
                    if (!m111754B()) {
                        MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera Open Failed!");
                        return false;
                    }
                    if (this.f86180d != null) {
                        m111775r(i);
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
                        Camera camera = this.f86180d;
                        if (camera != null) {
                            camera.setPreviewCallback(null);
                            this.f86180d.setPreviewCallbackWithBuffer(null);
                            this.f86180d.release();
                            this.f86180d = null;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            try {
                Camera.Parameters parameters = this.f86180d.getParameters();
                CameraHelper.selectCameraPreviewWH(parameters, this.f86179c, slwVar.m184877f());
                int iM184879h = slwVar.m184879h();
                ulw ulwVar = this.f86179c;
                int i3 = ulwVar.f177121T;
                if (iM184879h > i3 / 1000) {
                    ulwVar.f177107F = i3 / 1000;
                } else {
                    ulwVar.f177107F = slwVar.m184879h();
                }
                CameraHelper.selectCameraFpsRange(parameters, this.f86179c);
                m111737D(this.f86179c, slwVar.m184877f());
                if (!CameraHelper.selectCameraColorFormat(parameters, this.f86179c)) {
                    MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.selectCameraColorFormat,Failed");
                    mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
                    if (interfaceC18512c != null) {
                        interfaceC18512c.onFail(ErrorCode.CAMERA_SELECT_COLORFORMAT_FAILED, "CameraHelper.selectCameraColorFormat,Failed");
                    }
                    this.f86179c.m194271a();
                    return false;
                }
                if (!CameraHelper.configCamera(this.f86180d, this.f86179c)) {
                    MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.configCamera,Failed");
                    mnl.InterfaceC18512c interfaceC18512c2 = this.f86191o;
                    if (interfaceC18512c2 != null) {
                        interfaceC18512c2.onFail(4005, "CameraHelper.configCamera,Failed");
                    }
                    this.f86179c.m194271a();
                    return false;
                }
                m111736C(this.f86179c);
                ulw ulwVar2 = this.f86179c;
                int iM184876e = ulwVar2.f177136e;
                int iM184876e2 = ulwVar2.f177138f;
                if (!slwVar.m184874c()) {
                    if (slwVar.m184875d() == 1) {
                        iM184876e = (int) (iM184876e2 * slwVar.m184876e());
                        if (iM184876e != this.f86179c.f177136e) {
                            iM184876e = (iM184876e >> 4) << 4;
                        }
                    } else if (slwVar.m184875d() == 0 && (iM184876e2 = (int) (iM184876e / slwVar.m184876e())) != this.f86179c.f177138f) {
                        iM184876e2 = (iM184876e2 >> 4) << 4;
                    }
                }
                int i4 = this.f86182f;
                vif0 vif0Var = (i4 == 1 || i4 == 3) ? new vif0(iM184876e2, iM184876e) : new vif0(iM184876e, iM184876e2);
                if (!this.f86179c.f177127Z) {
                    vif0 vif0VarM184873b = slwVar.m184873b();
                    if (vif0VarM184873b != null && vif0VarM184873b.m198562b() > 0 && vif0VarM184873b.m198561a() > 0) {
                        this.f86179c.f177152m = vif0VarM184873b.m198562b();
                        this.f86179c.f177154n = vif0VarM184873b.m198561a();
                    }
                } else if (vif0Var.m198562b() > 0 && vif0Var.m198561a() > 0) {
                    this.f86179c.f177152m = vif0Var.m198562b();
                    this.f86179c.f177154n = vif0Var.m198561a();
                    slwVar.m184888r(vif0Var);
                }
                mnl.InterfaceC18513d interfaceC18513d = this.f86188l;
                if (interfaceC18513d != null) {
                    interfaceC18513d.mo140652V(this.f86180d);
                }
                return true;
            } catch (Exception e) {
                MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "CameraHelper.prepare failed !" + e.getMessage());
                mnl.InterfaceC18512c interfaceC18512c3 = this.f86191o;
                if (interfaceC18512c3 != null) {
                    interfaceC18512c3.onFail(4001, "CameraHelper.prepare failed !" + e.getMessage());
                }
                return false;
            }
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: H */
    public void mo111758H() {
        Camera camera = this.f86180d;
        if (camera != null) {
            if (this.f86187k != null) {
                camera.setPreviewCallbackWithBuffer(new C16370b());
            }
            this.f86180d.startPreview();
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: I */
    public void mo111759I(mnl.InterfaceC18513d interfaceC18513d) {
        synchronized (this.f86178b) {
            this.f86188l = interfaceC18513d;
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: J */
    public void mo111760J(mnl.InterfaceC18512c interfaceC18512c) {
        this.f86191o = interfaceC18512c;
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: K */
    public void mo111761K(mnl.InterfaceC18510a interfaceC18510a) {
        synchronized (this.f86178b) {
            this.f86187k = interfaceC18510a;
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: L */
    public void mo111762L() {
        synchronized (this.f86178b) {
            try {
                Camera camera = this.f86180d;
                if (camera != null) {
                    try {
                        camera.stopPreview();
                    } catch (Throwable th) {
                        MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera pauseCamera failed !" + th.getMessage());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @RequiresApi(api = 14)
    /* JADX INFO: renamed from: O */
    public boolean m111763O(SurfaceTexture surfaceTexture, sie sieVar) {
        this.f86185i = surfaceTexture;
        this.f86186j = sieVar;
        Camera camera = this.f86180d;
        if (camera == null) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera is NULL");
            return false;
        }
        if (this.f86187k != null) {
            camera.setPreviewCallbackWithBuffer(new C16369a());
        }
        synchronized (this.f86178b) {
            try {
                try {
                    try {
                        this.f86180d.setPreviewTexture(this.f86185i);
                        this.f86180d.startPreview();
                    } catch (IOException e) {
                        MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera start preview failed !" + e.getMessage());
                        m111748u(e);
                        return false;
                    }
                } catch (RuntimeException e2) {
                    m111748u(e2);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: a */
    public int mo111764a() {
        mnl.InterfaceC18513d interfaceC18513d = this.f86188l;
        if (interfaceC18513d != null && !this.f86179c.f177162r) {
            interfaceC18513d.mo140652V(null);
        }
        synchronized (this.f86178b) {
            try {
                Camera camera = this.f86180d;
                if (camera == null) {
                    mnl.InterfaceC18513d interfaceC18513d2 = this.f86188l;
                    if (interfaceC18513d2 != null) {
                        interfaceC18513d2.mo140642G();
                    }
                    return 1;
                }
                try {
                    camera.stopPreview();
                    this.f86180d.setPreviewCallback(null);
                    this.f86180d.setPreviewCallbackWithBuffer(null);
                    this.f86180d.release();
                    mnl.InterfaceC18513d interfaceC18513d3 = this.f86188l;
                    if (interfaceC18513d3 != null) {
                        interfaceC18513d3.mo140642G();
                    }
                    this.f86180d = null;
                    return 1;
                } catch (Throwable th) {
                    MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Camera stop preview failed !" + th.getMessage());
                    mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
                    if (interfaceC18512c != null) {
                        interfaceC18512c.onFail(4003, "Camera stop preview failed !" + th.getMessage());
                    }
                    mnl.InterfaceC18513d interfaceC18513d4 = this.f86188l;
                    if (interfaceC18513d4 != null) {
                        interfaceC18513d4.mo140642G();
                    }
                    return -1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: b */
    public void mo111765b(int i) {
        Camera camera;
        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, FirebaseAnalytics.Param.LEVEL + i);
        try {
            if (this.f86180d.getParameters() != null && (camera = this.f86180d) != null) {
                if (i >= camera.getParameters().getMaxZoom()) {
                    i = 0;
                }
                if (this.f86180d.getParameters().isZoomSupported()) {
                    Camera.Parameters parameters = this.f86180d.getParameters();
                    parameters.setZoom(i);
                    this.f86180d.setParameters(parameters);
                }
            }
        } catch (Error e) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera zoom level error!" + e.getMessage());
            mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(4005, "Set camera zoom level error!" + e.getMessage());
            }
            e.printStackTrace();
        } catch (Exception e2) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera zoom level error!" + e2.getMessage());
            mnl.InterfaceC18512c interfaceC18512c2 = this.f86191o;
            if (interfaceC18512c2 != null) {
                interfaceC18512c2.onFail(4005, "Set camera zoom level error!" + e2.getMessage());
            }
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: c */
    public int mo111766c() {
        try {
            Camera camera = this.f86180d;
            if (camera == null || camera.getParameters() == null) {
                return 0;
            }
            return this.f86180d.getParameters().getMaxZoom() - 1;
        } catch (Exception e) {
            mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera max support zoom level error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return 0;
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: d */
    public int mo111767d() {
        try {
            if (this.f86180d.getParameters() != null) {
                return this.f86180d.getParameters().getZoom();
            }
            return 0;
        } catch (Exception e) {
            mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera current zoom level error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, e.getMessage());
            return 0;
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: e */
    public void mo111768e(Camera.ErrorCallback errorCallback) {
        Camera camera = this.f86180d;
        if (camera != null) {
            camera.setErrorCallback(errorCallback);
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: g */
    public int mo111769g() {
        try {
            Camera camera = this.f86180d;
            if (camera != null) {
                return camera.getParameters().getMinExposureCompensation();
            }
            return 0;
        } catch (Exception e) {
            mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera Min Exposure Compensation error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Get camera Min Exposure Compensation error!" + e.getMessage());
            return 0;
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: h */
    public int mo111770h() {
        try {
            Camera camera = this.f86180d;
            if (camera != null) {
                return camera.getParameters().getMaxExposureCompensation();
            }
            return 0;
        } catch (Exception e) {
            mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(ErrorCode.CAMEAR_GET_STATUS_FAILED, "Get camera Max Exposure Compensation error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Get camera Max Exposure Compensation error!" + e.getMessage());
            return 0;
        }
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: i */
    public boolean mo111771i() {
        return this.f86190n;
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: j */
    public boolean mo111772j(SurfaceTexture surfaceTexture) {
        return m111763O(surfaceTexture, null);
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: k */
    public void mo111773k(Rect rect, Camera.AutoFocusCallback autoFocusCallback) {
        m111735A(rect, autoFocusCallback);
        m111739N(rect);
    }

    @Override // p149l.mnl
    /* JADX INFO: renamed from: m */
    public int mo111774m() {
        return this.f86182f * 90;
    }

    /* JADX INFO: renamed from: r */
    public void m111775r(int i) {
        if (this.f86180d == null) {
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "请先打开Camera!");
            return;
        }
        int iDetermineDisplayOrientation = CameraHelper.determineDisplayOrientation(i, this.f86184h);
        this.f86181e = iDetermineDisplayOrientation;
        Rotation rotation = Rotation.NORMAL;
        if (iDetermineDisplayOrientation == 90) {
            rotation = Rotation.ROTATION_90;
        } else if (iDetermineDisplayOrientation == 180) {
            rotation = Rotation.ROTATION_180;
        } else if (iDetermineDisplayOrientation == 270) {
            rotation = Rotation.ROTATION_270;
        }
        this.f86182f = this.f86184h == 1 ? rotation.ordinal() % (Rotation.ROTATION_270.ordinal() + 1) : rotation.ordinal() % (Rotation.ROTATION_270.ordinal() + 1);
        this.f86180d.setDisplayOrientation(this.f86181e);
    }

    @Override // p149l.mnl
    @RequiresApi(api = 8)
    public void release() {
        synchronized (this.f86178b) {
            try {
                Camera camera = this.f86180d;
                if (camera != null) {
                    camera.setPreviewCallback(null);
                    this.f86180d.setPreviewCallbackWithBuffer(null);
                    this.f86180d.release();
                    this.f86180d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f86186j = null;
        m111746s();
        f86176q = false;
    }

    @Override // p149l.mnl
    public void setExposureCompensation(int i) {
        try {
            Camera camera = this.f86180d;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                if (i > mo111770h()) {
                    i = mo111770h();
                }
                if (i < mo111769g()) {
                    i = mo111769g();
                }
                parameters.setExposureCompensation(i);
                this.f86180d.setParameters(parameters);
            }
        } catch (Exception e) {
            mnl.InterfaceC18512c interfaceC18512c = this.f86191o;
            if (interfaceC18512c != null) {
                interfaceC18512c.onFail(4005, "Set camera Exposure Compensation error!" + e.getMessage());
            }
            MDLog.m7391e(MDLogTag.MOMENT_CAMERA_TAG, "Set camera Exposure Compensation error!" + e.getMessage());
        }
    }
}
