package com.tencent.liteav.capturer;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14213d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.capturer.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14268a implements Camera.AutoFocusCallback, Camera.ErrorCallback, Camera.PreviewCallback {

    /* JADX INFO: renamed from: c */
    private Camera f59921c;

    /* JADX INFO: renamed from: e */
    private InterfaceC14269b f59923e;

    /* JADX INFO: renamed from: h */
    private int f59926h;

    /* JADX INFO: renamed from: i */
    private int f59927i;

    /* JADX INFO: renamed from: j */
    private int f59928j;

    /* JADX INFO: renamed from: k */
    private int f59929k;

    /* JADX INFO: renamed from: l */
    private SurfaceTexture f59930l;

    /* JADX INFO: renamed from: m */
    private boolean f59931m;

    /* JADX INFO: renamed from: n */
    private boolean f59932n;

    /* JADX INFO: renamed from: o */
    private boolean f59933o;

    /* JADX INFO: renamed from: q */
    private int f59935q;

    /* JADX INFO: renamed from: r */
    private int f59936r;

    /* JADX INFO: renamed from: a */
    private Matrix f59919a = new Matrix();

    /* JADX INFO: renamed from: b */
    private int f59920b = 0;

    /* JADX INFO: renamed from: d */
    private boolean f59922d = true;

    /* JADX INFO: renamed from: f */
    private int f59924f = 15;

    /* JADX INFO: renamed from: g */
    private int f59925g = 1;

    /* JADX INFO: renamed from: p */
    private boolean f59934p = false;

    /* JADX INFO: renamed from: s */
    private boolean f59937s = false;

    /* JADX INFO: renamed from: t */
    private boolean f59938t = false;

    /* JADX INFO: renamed from: a */
    private static C14213d m84565a(Camera.Parameters parameters, int i, int i2) {
        int i3;
        TXCLog.m84148d("TXCCameraCapturer", "camera preview wanted: %d x %d", Integer.valueOf(i), Integer.valueOf(i2));
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        float f = (i * 1.0f) / i2;
        ArrayList<Camera.Size> arrayList = new ArrayList();
        int i4 = Integer.MAX_VALUE;
        for (Camera.Size size : supportedPreviewSizes) {
            TXCLog.m84148d("TXCCameraCapturer", "camera support preview size: %dx%d", Integer.valueOf(size.width), Integer.valueOf(size.height));
            int i5 = size.width;
            int iRound = (i5 < 640 || (i3 = size.height) < 480) ? Integer.MAX_VALUE : Math.round(Math.abs(((i5 * 1.0f) / i3) - f) * 10.0f);
            if (iRound < i4) {
                arrayList.clear();
                arrayList.add(size);
                i4 = iRound;
            } else if (iRound == i4) {
                arrayList.add(size);
            }
        }
        Collections.sort(arrayList, new Comparator<Camera.Size>() { // from class: com.tencent.liteav.capturer.a.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Camera.Size size2, Camera.Size size3) {
                return (size3.width * size3.height) - (size2.width * size2.height);
            }
        });
        Camera.Size size2 = (Camera.Size) arrayList.get(0);
        float f2 = i * i2;
        float fAbs = 2.1474836E9f;
        for (Camera.Size size3 : arrayList) {
            TXCLog.m84153i("TXCCameraCapturer", "size in same buck: %dx%d", Integer.valueOf(size3.width), Integer.valueOf(size3.height));
            float f3 = size3.width * size3.height;
            if (f3 / f2 >= 0.9d) {
                float f4 = f3 - f2;
                if (Math.abs(f4) < fAbs) {
                    fAbs = Math.abs(f4);
                    size2 = size3;
                }
            }
        }
        TXCLog.m84153i("TXCCameraCapturer", "best match preview size: %d x %d", Integer.valueOf(size2.width), Integer.valueOf(size2.height));
        return new C14213d(size2.width, size2.height);
    }

    /* JADX INFO: renamed from: e */
    private int[] m84568e(int i) {
        List<int[]> supportedPreviewFpsRange;
        int i2 = i * 1000;
        String str = "camera supported preview fps range: wantFPS = " + i2 + SignParameters.NEW_LINE;
        Camera.Parameters parametersM84570a = m84570a();
        if (parametersM84570a == null || (supportedPreviewFpsRange = parametersM84570a.getSupportedPreviewFpsRange()) == null || supportedPreviewFpsRange.size() <= 0) {
            return null;
        }
        int[] iArr = supportedPreviewFpsRange.get(0);
        Collections.sort(supportedPreviewFpsRange, new Comparator<int[]>() { // from class: com.tencent.liteav.capturer.a.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(int[] iArr2, int[] iArr3) {
                return iArr2[1] - iArr3[1];
            }
        });
        for (int[] iArr2 : supportedPreviewFpsRange) {
            str = str + "camera supported preview fps range: " + iArr2[0] + " - " + iArr2[1] + SignParameters.NEW_LINE;
        }
        for (int[] iArr3 : supportedPreviewFpsRange) {
            if (iArr3[0] <= i2 && i2 <= iArr3[1]) {
                iArr = iArr3;
                break;
            }
        }
        TXCLog.m84152i("TXCCameraCapturer", str + "choose preview fps range: " + iArr[0] + " - " + iArr[1]);
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    private int m84569f(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        StringBuilder sb = new StringBuilder("vsize camera orientation ");
        sb.append(cameraInfo.orientation);
        sb.append(", front ");
        sb.append(cameraInfo.facing == 1);
        TXCLog.m84152i("TXCCameraCapturer", sb.toString());
        int i2 = cameraInfo.orientation;
        if (i2 == 0 || i2 == 180) {
            i2 += 90;
        }
        return cameraInfo.facing == 1 ? (360 - i2) % 360 : (i2 + 360) % 360;
    }

    /* JADX INFO: renamed from: b */
    public boolean m84580b(int i) {
        if (this.f59921c != null) {
            Camera.Parameters parametersM84570a = m84570a();
            if (parametersM84570a != null && parametersM84570a.getMaxZoom() > 0 && parametersM84570a.isZoomSupported()) {
                if (i < 0 || i > parametersM84570a.getMaxZoom()) {
                    TXCLog.m84149e("TXCCameraCapturer", "invalid zoom value : " + i + ", while max zoom is " + parametersM84570a.getMaxZoom());
                    return false;
                }
                try {
                    parametersM84570a.setZoom(i);
                    this.f59921c.setParameters(parametersM84570a);
                    return true;
                } catch (Exception e) {
                    TXCLog.m84150e("TXCCameraCapturer", "set zoom failed.", e);
                    return false;
                }
            }
            TXCLog.m84149e("TXCCameraCapturer", "camera not support zoom!");
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m84581c(int i) {
        TXCLog.m84156w("TXCCameraCapturer", "vsize setHomeOrientation " + i);
        this.f59925g = i;
        this.f59928j = (((this.f59929k + (-90)) + (i * 90)) + 360) % 360;
    }

    /* JADX INFO: renamed from: d */
    public int m84584d(boolean z) {
        try {
            TXCLog.m84152i("TXCCameraCapturer", "trtc_capture: start capture");
            if (this.f59930l == null) {
                return -2;
            }
            if (this.f59921c != null) {
                m84588g();
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < Camera.getNumberOfCameras(); i3++) {
                Camera.getCameraInfo(i3, cameraInfo);
                TXCLog.m84152i("TXCCameraCapturer", "camera index " + i3 + ", facing = " + cameraInfo.facing);
                int i4 = cameraInfo.facing;
                if (i4 == 1 && i == -1) {
                    i = i3;
                }
                if (i4 == 0 && i2 == -1) {
                    i2 = i3;
                }
            }
            TXCLog.m84152i("TXCCameraCapturer", "camera front, id = " + i);
            TXCLog.m84152i("TXCCameraCapturer", "camera back , id = " + i2);
            if (i == -1 && i2 != -1) {
                i = i2;
            }
            if (i2 == -1 && i != -1) {
                i2 = i;
            }
            this.f59922d = z;
            if (z) {
                this.f59921c = Camera.open(i);
            } else {
                this.f59921c = Camera.open(i2);
            }
            Camera.Parameters parameters = this.f59921c.getParameters();
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (this.f59937s && supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                TXCLog.m84152i("TXCCameraCapturer", "support FOCUS_MODE_AUTO");
                parameters.setFocusMode("auto");
            } else if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                TXCLog.m84152i("TXCCameraCapturer", "support FOCUS_MODE_CONTINUOUS_VIDEO");
                parameters.setFocusMode("continuous-video");
            }
            if (parameters.getMaxNumFocusAreas() > 0) {
                this.f59931m = true;
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                this.f59932n = true;
            }
            if (this.f59934p) {
                parameters.setPreviewFormat(17);
                this.f59921c.setPreviewCallback(this);
            }
            C14213d c14213dM84566b = m84566b(this.f59938t, this.f59935q, this.f59936r);
            C14213d c14213dM84565a = m84565a(parameters, Math.max(c14213dM84566b.f59350a, c14213dM84566b.f59351b), Math.min(c14213dM84566b.f59350a, c14213dM84566b.f59351b));
            int i5 = c14213dM84565a.f59350a;
            this.f59926h = i5;
            int i6 = c14213dM84565a.f59351b;
            this.f59927i = i6;
            parameters.setPreviewSize(i5, i6);
            int[] iArrM84568e = m84568e(this.f59924f);
            if (iArrM84568e != null) {
                parameters.setPreviewFpsRange(iArrM84568e[0], iArrM84568e[1]);
            } else {
                parameters.setPreviewFrameRate(m84567d(this.f59924f));
            }
            if (!this.f59922d) {
                i = i2;
            }
            int iM84569f = m84569f(i);
            this.f59929k = iM84569f;
            this.f59928j = (((iM84569f - 90) + (this.f59925g * 90)) + 360) % 360;
            this.f59921c.setDisplayOrientation(0);
            TXCLog.m84152i("TXCCameraCapturer", "vsize camera orientation " + this.f59929k + ", preview " + this.f59928j + ", home orientation " + this.f59925g);
            this.f59921c.setPreviewTexture(this.f59930l);
            this.f59921c.setParameters(parameters);
            this.f59921c.setErrorCallback(this);
            this.f59921c.startPreview();
            return 0;
        } catch (IOException e) {
            TXCLog.m84149e("TXCCameraCapturer", "open camera failed." + e.getMessage());
            return -1;
        } catch (Exception e2) {
            TXCLog.m84149e("TXCCameraCapturer", "open camera failed." + e2.getMessage());
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public void m84588g() {
        Camera camera = this.f59921c;
        if (camera != null) {
            try {
                try {
                    camera.setErrorCallback(null);
                    this.f59921c.setPreviewCallback(null);
                    this.f59921c.stopPreview();
                    this.f59921c.release();
                } catch (Exception e) {
                    TXCLog.m84150e("TXCCameraCapturer", "stop capture failed.", e);
                }
            } finally {
                this.f59921c = null;
                this.f59930l = null;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public int m84589h() {
        return this.f59928j;
    }

    /* JADX INFO: renamed from: i */
    public boolean m84590i() {
        return this.f59922d;
    }

    /* JADX INFO: renamed from: j */
    public int m84591j() {
        return this.f59926h;
    }

    /* JADX INFO: renamed from: k */
    public int m84592k() {
        return this.f59927i;
    }

    /* JADX INFO: renamed from: l */
    public Camera m84593l() {
        return this.f59921c;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        if (z) {
            TXCLog.m84152i("TXCCameraCapturer", "AUTO focus success");
        } else {
            TXCLog.m84152i("TXCCameraCapturer", "AUTO focus failed");
        }
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i, Camera camera) {
        InterfaceC14269b interfaceC14269b;
        TXCLog.m84156w("TXCCameraCapturer", "camera catch error " + i);
        if ((i == 1 || i == 2 || i == 100) && (interfaceC14269b = this.f59923e) != null) {
            interfaceC14269b.mo84551m();
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        InterfaceC14269b interfaceC14269b = this.f59923e;
        if (interfaceC14269b != null) {
            interfaceC14269b.mo84527a(bArr);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.capturer.a$a */
    public enum a {
        RESOLUTION_INVALID(-1, -1),
        RESOLUTION_180_320(180, 320),
        RESOLUTION_270_480(270, 480),
        RESOLUTION_320_480(320, 480),
        RESOLUTION_360_640(360, 640),
        RESOLUTION_540_960(540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM),
        RESOLUTION_720_1280(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK),
        RESOLUTION_1080_1920(1080, WBConstants.SDK_NEW_PAY_VERSION),
        RESOLUTION_HIGHEST(1080, WBConstants.SDK_NEW_PAY_VERSION);

        private final int mHeight;
        private final int mWidth;

        a(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public int m84596a() {
            return this.mWidth;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public int m84598b() {
            return this.mHeight;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m84582c(boolean z) {
        this.f59937s = z;
    }

    /* JADX INFO: renamed from: c */
    public boolean m84583c() {
        Camera.Parameters parametersM84570a;
        List<String> supportedFlashModes;
        return (this.f59921c == null || (parametersM84570a = m84570a()) == null || (supportedFlashModes = parametersM84570a.getSupportedFlashModes()) == null || !supportedFlashModes.contains("torch")) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public int m84587f() {
        Camera.Parameters parametersM84570a = m84570a();
        if (parametersM84570a == null || parametersM84570a.getMaxZoom() <= 0 || !parametersM84570a.isZoomSupported()) {
            return 0;
        }
        return parametersM84570a.getMaxZoom();
    }

    /* JADX INFO: renamed from: b */
    public void m84578b(boolean z) {
        this.f59938t = z;
        TXCLog.m84152i("TXCCameraCapturer", "set performance mode to " + z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m84579b() {
        Camera.Parameters parametersM84570a;
        return this.f59921c != null && (parametersM84570a = m84570a()) != null && parametersM84570a.getMaxZoom() > 0 && parametersM84570a.isZoomSupported();
    }

    /* JADX INFO: renamed from: b */
    private static C14213d m84566b(boolean z, int i, int i2) {
        if (z) {
            return new C14213d(i, i2);
        }
        C14213d[] c14213dArr = {new C14213d(1080, WBConstants.SDK_NEW_PAY_VERSION)};
        float fMin = Math.min(i, i2);
        float fMax = Math.max(i, i2);
        C14213d c14213d = c14213dArr[0];
        int i3 = c14213d.f59350a;
        if (fMin <= i3) {
            int i4 = c14213d.f59351b;
            if (fMax <= i4) {
                float fMin2 = Math.min(i3 / fMin, i4 / fMax);
                i = (int) (i * fMin2);
                i2 = (int) (i2 * fMin2);
            }
        }
        return new C14213d(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public boolean m84586e() {
        Camera.Parameters parametersM84570a;
        return (this.f59921c == null || (parametersM84570a = m84570a()) == null || parametersM84570a.getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public void m84573a(SurfaceTexture surfaceTexture) {
        this.f59930l = surfaceTexture;
    }

    /* JADX INFO: renamed from: a */
    public Camera.Parameters m84570a() {
        Camera camera = this.f59921c;
        if (camera == null) {
            return null;
        }
        try {
            return camera.getParameters();
        } catch (Exception e) {
            TXCLog.m84150e("TXCCameraCapturer", "getCameraParameters error ", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX INFO: renamed from: a */
    public boolean m84577a(boolean z) {
        Camera.Parameters parametersM84570a;
        boolean z2;
        this.f59933o = z;
        if (this.f59921c == null || (parametersM84570a = m84570a()) == null) {
            return false;
        }
        List<String> supportedFlashModes = parametersM84570a.getSupportedFlashModes();
        if (z) {
            if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
                z2 = false;
            } else {
                TXCLog.m84152i("TXCCameraCapturer", "set FLASH_MODE_TORCH");
                parametersM84570a.setFlashMode("torch");
                z2 = true;
            }
        } else if (supportedFlashModes == null || !supportedFlashModes.contains(BLiveOperationTitleShowType.off)) {
            z2 = false;
        } else {
            TXCLog.m84152i("TXCCameraCapturer", "set FLASH_MODE_OFF");
            parametersM84570a.setFlashMode(BLiveOperationTitleShowType.off);
            z2 = true;
        }
        try {
            this.f59921c.setParameters(parametersM84570a);
            return z2;
        } catch (Exception e) {
            TXCLog.m84150e("TXCCameraCapturer", "setParameters failed.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84574a(a aVar) {
        if (aVar != a.RESOLUTION_INVALID) {
            this.f59935q = aVar.m84596a();
            this.f59936r = aVar.m84598b();
        }
        TXCLog.m84152i("TXCCameraCapturer", "set resolution " + aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m84572a(int i) {
        this.f59924f = i;
    }

    /* JADX INFO: renamed from: a */
    public void m84571a(float f, float f2) {
        if (this.f59937s) {
            try {
                this.f59921c.cancelAutoFocus();
                Camera.Parameters parameters = this.f59921c.getParameters();
                if (this.f59931m) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(m84564a(f, f2, 2.0f), 1000));
                    parameters.setFocusAreas(arrayList);
                }
                if (this.f59932n) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new Camera.Area(m84564a(f, f2, 3.0f), 1000));
                    parameters.setMeteringAreas(arrayList2);
                }
                this.f59921c.setParameters(parameters);
                this.f59921c.autoFocus(this);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private Rect m84564a(float f, float f2, float f3) {
        float f4 = f3 * 200.0f;
        if (this.f59922d) {
            f = 1.0f - f;
        }
        int i = 0;
        while (i < this.f59928j / 90) {
            float f5 = (-(-(f2 - 0.5f))) + 0.5f;
            i++;
            f2 = (-(f - 0.5f)) + 0.5f;
            f = f5;
        }
        int i2 = (int) ((f * 2000.0f) - 1000.0f);
        int i3 = (int) ((f2 * 2000.0f) - 1000.0f);
        if (i2 < -1000) {
            i2 = -1000;
        }
        if (i3 < -1000) {
            i3 = -1000;
        }
        int i4 = (int) f4;
        int i5 = i2 + i4;
        int i6 = i4 + i3;
        if (i5 > 1000) {
            i5 = 1000;
        }
        if (i6 > 1000) {
            i6 = 1000;
        }
        return new Rect(i2, i3, i5, i6);
    }

    /* JADX INFO: renamed from: a */
    public void m84576a(boolean z, int i, int i2) {
        this.f59934p = z;
        this.f59935q = i;
        this.f59936r = i2;
        TXCLog.m84153i("TXCCameraCapturer", "setCaptureBuffer %b, width: %d, height: %d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: a */
    public void m84575a(InterfaceC14269b interfaceC14269b) {
        this.f59923e = interfaceC14269b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m84585d() {
        return this.f59931m;
    }

    /* JADX INFO: renamed from: d */
    private int m84567d(int i) {
        Camera.Parameters parametersM84570a = m84570a();
        if (parametersM84570a == null) {
            return 1;
        }
        List<Integer> supportedPreviewFrameRates = parametersM84570a.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates == null) {
            TXCLog.m84149e("TXCCameraCapturer", "getSupportedFPS error");
            return 1;
        }
        int iIntValue = supportedPreviewFrameRates.get(0).intValue();
        for (int i2 = 0; i2 < supportedPreviewFrameRates.size(); i2++) {
            int iIntValue2 = supportedPreviewFrameRates.get(i2).intValue();
            if (Math.abs(iIntValue2 - i) - Math.abs(iIntValue - i) < 0) {
                iIntValue = iIntValue2;
            }
        }
        TXCLog.m84152i("TXCCameraCapturer", "choose fps=" + iIntValue);
        return iIntValue;
    }
}
