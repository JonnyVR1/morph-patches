package com.tencent.liteav.capturer;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14050d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.capturer.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14105a implements Camera.AutoFocusCallback, Camera.ErrorCallback, Camera.PreviewCallback {

    /* JADX INFO: renamed from: c */
    private Camera f59073c;

    /* JADX INFO: renamed from: e */
    private InterfaceC14106b f59075e;

    /* JADX INFO: renamed from: h */
    private int f59078h;

    /* JADX INFO: renamed from: i */
    private int f59079i;

    /* JADX INFO: renamed from: j */
    private int f59080j;

    /* JADX INFO: renamed from: k */
    private int f59081k;

    /* JADX INFO: renamed from: l */
    private SurfaceTexture f59082l;

    /* JADX INFO: renamed from: m */
    private boolean f59083m;

    /* JADX INFO: renamed from: n */
    private boolean f59084n;

    /* JADX INFO: renamed from: o */
    private boolean f59085o;

    /* JADX INFO: renamed from: q */
    private int f59087q;

    /* JADX INFO: renamed from: r */
    private int f59088r;

    /* JADX INFO: renamed from: a */
    private Matrix f59071a = new Matrix();

    /* JADX INFO: renamed from: b */
    private int f59072b = 0;

    /* JADX INFO: renamed from: d */
    private boolean f59074d = true;

    /* JADX INFO: renamed from: f */
    private int f59076f = 15;

    /* JADX INFO: renamed from: g */
    private int f59077g = 1;

    /* JADX INFO: renamed from: p */
    private boolean f59086p = false;

    /* JADX INFO: renamed from: s */
    private boolean f59089s = false;

    /* JADX INFO: renamed from: t */
    private boolean f59090t = false;

    /* JADX INFO: renamed from: a */
    private static C14050d m83382a(Camera.Parameters parameters, int i, int i2) {
        int i3;
        TXCLog.m82965d("TXCCameraCapturer", "camera preview wanted: %d x %d", Integer.valueOf(i), Integer.valueOf(i2));
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        float f = (i * 1.0f) / i2;
        ArrayList<Camera.Size> arrayList = new ArrayList();
        int i4 = Integer.MAX_VALUE;
        for (Camera.Size size : supportedPreviewSizes) {
            TXCLog.m82965d("TXCCameraCapturer", "camera support preview size: %dx%d", Integer.valueOf(size.width), Integer.valueOf(size.height));
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
            TXCLog.m82970i("TXCCameraCapturer", "size in same buck: %dx%d", Integer.valueOf(size3.width), Integer.valueOf(size3.height));
            float f3 = size3.width * size3.height;
            if (f3 / f2 >= 0.9d) {
                float f4 = f3 - f2;
                if (Math.abs(f4) < fAbs) {
                    fAbs = Math.abs(f4);
                    size2 = size3;
                }
            }
        }
        TXCLog.m82970i("TXCCameraCapturer", "best match preview size: %d x %d", Integer.valueOf(size2.width), Integer.valueOf(size2.height));
        return new C14050d(size2.width, size2.height);
    }

    /* JADX INFO: renamed from: e */
    private int[] m83385e(int i) {
        List<int[]> supportedPreviewFpsRange;
        int i2 = i * 1000;
        String str = "camera supported preview fps range: wantFPS = " + i2 + SignParameters.NEW_LINE;
        Camera.Parameters parametersM83387a = m83387a();
        if (parametersM83387a == null || (supportedPreviewFpsRange = parametersM83387a.getSupportedPreviewFpsRange()) == null || supportedPreviewFpsRange.size() <= 0) {
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
        TXCLog.m82969i("TXCCameraCapturer", str + "choose preview fps range: " + iArr[0] + " - " + iArr[1]);
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    private int m83386f(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        StringBuilder sb = new StringBuilder("vsize camera orientation ");
        sb.append(cameraInfo.orientation);
        sb.append(", front ");
        sb.append(cameraInfo.facing == 1);
        TXCLog.m82969i("TXCCameraCapturer", sb.toString());
        int i2 = cameraInfo.orientation;
        if (i2 == 0 || i2 == 180) {
            i2 += 90;
        }
        return cameraInfo.facing == 1 ? (360 - i2) % 360 : (i2 + 360) % 360;
    }

    /* JADX INFO: renamed from: b */
    public boolean m83397b(int i) {
        if (this.f59073c != null) {
            Camera.Parameters parametersM83387a = m83387a();
            if (parametersM83387a != null && parametersM83387a.getMaxZoom() > 0 && parametersM83387a.isZoomSupported()) {
                if (i < 0 || i > parametersM83387a.getMaxZoom()) {
                    TXCLog.m82966e("TXCCameraCapturer", "invalid zoom value : " + i + ", while max zoom is " + parametersM83387a.getMaxZoom());
                    return false;
                }
                try {
                    parametersM83387a.setZoom(i);
                    this.f59073c.setParameters(parametersM83387a);
                    return true;
                } catch (Exception e) {
                    TXCLog.m82967e("TXCCameraCapturer", "set zoom failed.", e);
                    return false;
                }
            }
            TXCLog.m82966e("TXCCameraCapturer", "camera not support zoom!");
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m83398c(int i) {
        TXCLog.m82973w("TXCCameraCapturer", "vsize setHomeOrientation " + i);
        this.f59077g = i;
        this.f59080j = (((this.f59081k + (-90)) + (i * 90)) + 360) % 360;
    }

    /* JADX INFO: renamed from: d */
    public int m83401d(boolean z) {
        try {
            TXCLog.m82969i("TXCCameraCapturer", "trtc_capture: start capture");
            if (this.f59082l == null) {
                return -2;
            }
            if (this.f59073c != null) {
                m83405g();
            }
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < Camera.getNumberOfCameras(); i3++) {
                Camera.getCameraInfo(i3, cameraInfo);
                TXCLog.m82969i("TXCCameraCapturer", "camera index " + i3 + ", facing = " + cameraInfo.facing);
                int i4 = cameraInfo.facing;
                if (i4 == 1 && i == -1) {
                    i = i3;
                }
                if (i4 == 0 && i2 == -1) {
                    i2 = i3;
                }
            }
            TXCLog.m82969i("TXCCameraCapturer", "camera front, id = " + i);
            TXCLog.m82969i("TXCCameraCapturer", "camera back , id = " + i2);
            if (i == -1 && i2 != -1) {
                i = i2;
            }
            if (i2 == -1 && i != -1) {
                i2 = i;
            }
            this.f59074d = z;
            if (z) {
                this.f59073c = Camera.open(i);
            } else {
                this.f59073c = Camera.open(i2);
            }
            Camera.Parameters parameters = this.f59073c.getParameters();
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (this.f59089s && supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                TXCLog.m82969i("TXCCameraCapturer", "support FOCUS_MODE_AUTO");
                parameters.setFocusMode("auto");
            } else if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
                TXCLog.m82969i("TXCCameraCapturer", "support FOCUS_MODE_CONTINUOUS_VIDEO");
                parameters.setFocusMode("continuous-video");
            }
            if (parameters.getMaxNumFocusAreas() > 0) {
                this.f59083m = true;
            }
            if (parameters.getMaxNumMeteringAreas() > 0) {
                this.f59084n = true;
            }
            if (this.f59086p) {
                parameters.setPreviewFormat(17);
                this.f59073c.setPreviewCallback(this);
            }
            C14050d c14050dM83383b = m83383b(this.f59090t, this.f59087q, this.f59088r);
            C14050d c14050dM83382a = m83382a(parameters, Math.max(c14050dM83383b.f58502a, c14050dM83383b.f58503b), Math.min(c14050dM83383b.f58502a, c14050dM83383b.f58503b));
            int i5 = c14050dM83382a.f58502a;
            this.f59078h = i5;
            int i6 = c14050dM83382a.f58503b;
            this.f59079i = i6;
            parameters.setPreviewSize(i5, i6);
            int[] iArrM83385e = m83385e(this.f59076f);
            if (iArrM83385e != null) {
                parameters.setPreviewFpsRange(iArrM83385e[0], iArrM83385e[1]);
            } else {
                parameters.setPreviewFrameRate(m83384d(this.f59076f));
            }
            if (!this.f59074d) {
                i = i2;
            }
            int iM83386f = m83386f(i);
            this.f59081k = iM83386f;
            this.f59080j = (((iM83386f - 90) + (this.f59077g * 90)) + 360) % 360;
            this.f59073c.setDisplayOrientation(0);
            TXCLog.m82969i("TXCCameraCapturer", "vsize camera orientation " + this.f59081k + ", preview " + this.f59080j + ", home orientation " + this.f59077g);
            this.f59073c.setPreviewTexture(this.f59082l);
            this.f59073c.setParameters(parameters);
            this.f59073c.setErrorCallback(this);
            this.f59073c.startPreview();
            return 0;
        } catch (IOException e) {
            TXCLog.m82966e("TXCCameraCapturer", "open camera failed." + e.getMessage());
            return -1;
        } catch (Exception e2) {
            TXCLog.m82966e("TXCCameraCapturer", "open camera failed." + e2.getMessage());
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public void m83405g() {
        Camera camera = this.f59073c;
        if (camera != null) {
            try {
                try {
                    camera.setErrorCallback(null);
                    this.f59073c.setPreviewCallback(null);
                    this.f59073c.stopPreview();
                    this.f59073c.release();
                } catch (Exception e) {
                    TXCLog.m82967e("TXCCameraCapturer", "stop capture failed.", e);
                }
            } finally {
                this.f59073c = null;
                this.f59082l = null;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public int m83406h() {
        return this.f59080j;
    }

    /* JADX INFO: renamed from: i */
    public boolean m83407i() {
        return this.f59074d;
    }

    /* JADX INFO: renamed from: j */
    public int m83408j() {
        return this.f59078h;
    }

    /* JADX INFO: renamed from: k */
    public int m83409k() {
        return this.f59079i;
    }

    /* JADX INFO: renamed from: l */
    public Camera m83410l() {
        return this.f59073c;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        if (z) {
            TXCLog.m82969i("TXCCameraCapturer", "AUTO focus success");
        } else {
            TXCLog.m82969i("TXCCameraCapturer", "AUTO focus failed");
        }
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int i, Camera camera) {
        InterfaceC14106b interfaceC14106b;
        TXCLog.m82973w("TXCCameraCapturer", "camera catch error " + i);
        if ((i == 1 || i == 2 || i == 100) && (interfaceC14106b = this.f59075e) != null) {
            interfaceC14106b.mo83368m();
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        InterfaceC14106b interfaceC14106b = this.f59075e;
        if (interfaceC14106b != null) {
            interfaceC14106b.mo83344a(bArr);
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
        public int m83413a() {
            return this.mWidth;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public int m83415b() {
            return this.mHeight;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m83399c(boolean z) {
        this.f59089s = z;
    }

    /* JADX INFO: renamed from: c */
    public boolean m83400c() {
        Camera.Parameters parametersM83387a;
        List<String> supportedFlashModes;
        return (this.f59073c == null || (parametersM83387a = m83387a()) == null || (supportedFlashModes = parametersM83387a.getSupportedFlashModes()) == null || !supportedFlashModes.contains("torch")) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public int m83404f() {
        Camera.Parameters parametersM83387a = m83387a();
        if (parametersM83387a == null || parametersM83387a.getMaxZoom() <= 0 || !parametersM83387a.isZoomSupported()) {
            return 0;
        }
        return parametersM83387a.getMaxZoom();
    }

    /* JADX INFO: renamed from: b */
    public void m83395b(boolean z) {
        this.f59090t = z;
        TXCLog.m82969i("TXCCameraCapturer", "set performance mode to " + z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m83396b() {
        Camera.Parameters parametersM83387a;
        return this.f59073c != null && (parametersM83387a = m83387a()) != null && parametersM83387a.getMaxZoom() > 0 && parametersM83387a.isZoomSupported();
    }

    /* JADX INFO: renamed from: b */
    private static C14050d m83383b(boolean z, int i, int i2) {
        if (z) {
            return new C14050d(i, i2);
        }
        C14050d[] c14050dArr = {new C14050d(1080, WBConstants.SDK_NEW_PAY_VERSION)};
        float fMin = Math.min(i, i2);
        float fMax = Math.max(i, i2);
        C14050d c14050d = c14050dArr[0];
        int i3 = c14050d.f58502a;
        if (fMin <= i3) {
            int i4 = c14050d.f58503b;
            if (fMax <= i4) {
                float fMin2 = Math.min(i3 / fMin, i4 / fMax);
                i = (int) (i * fMin2);
                i2 = (int) (i2 * fMin2);
            }
        }
        return new C14050d(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public boolean m83403e() {
        Camera.Parameters parametersM83387a;
        return (this.f59073c == null || (parametersM83387a = m83387a()) == null || parametersM83387a.getMaxNumDetectedFaces() <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public void m83390a(SurfaceTexture surfaceTexture) {
        this.f59082l = surfaceTexture;
    }

    /* JADX INFO: renamed from: a */
    public Camera.Parameters m83387a() {
        Camera camera = this.f59073c;
        if (camera == null) {
            return null;
        }
        try {
            return camera.getParameters();
        } catch (Exception e) {
            TXCLog.m82967e("TXCCameraCapturer", "getCameraParameters error ", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX INFO: renamed from: a */
    public boolean m83394a(boolean z) {
        Camera.Parameters parametersM83387a;
        boolean z2;
        this.f59085o = z;
        if (this.f59073c == null || (parametersM83387a = m83387a()) == null) {
            return false;
        }
        List<String> supportedFlashModes = parametersM83387a.getSupportedFlashModes();
        if (z) {
            if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
                z2 = false;
            } else {
                TXCLog.m82969i("TXCCameraCapturer", "set FLASH_MODE_TORCH");
                parametersM83387a.setFlashMode("torch");
                z2 = true;
            }
        } else if (supportedFlashModes == null || !supportedFlashModes.contains(BLiveOperationTitleShowType.off)) {
            z2 = false;
        } else {
            TXCLog.m82969i("TXCCameraCapturer", "set FLASH_MODE_OFF");
            parametersM83387a.setFlashMode(BLiveOperationTitleShowType.off);
            z2 = true;
        }
        try {
            this.f59073c.setParameters(parametersM83387a);
            return z2;
        } catch (Exception e) {
            TXCLog.m82967e("TXCCameraCapturer", "setParameters failed.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83391a(a aVar) {
        if (aVar != a.RESOLUTION_INVALID) {
            this.f59087q = aVar.m83413a();
            this.f59088r = aVar.m83415b();
        }
        TXCLog.m82969i("TXCCameraCapturer", "set resolution " + aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m83389a(int i) {
        this.f59076f = i;
    }

    /* JADX INFO: renamed from: a */
    public void m83388a(float f, float f2) {
        if (this.f59089s) {
            try {
                this.f59073c.cancelAutoFocus();
                Camera.Parameters parameters = this.f59073c.getParameters();
                if (this.f59083m) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(m83381a(f, f2, 2.0f), 1000));
                    parameters.setFocusAreas(arrayList);
                }
                if (this.f59084n) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new Camera.Area(m83381a(f, f2, 3.0f), 1000));
                    parameters.setMeteringAreas(arrayList2);
                }
                this.f59073c.setParameters(parameters);
                this.f59073c.autoFocus(this);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private Rect m83381a(float f, float f2, float f3) {
        float f4 = f3 * 200.0f;
        if (this.f59074d) {
            f = 1.0f - f;
        }
        int i = 0;
        while (i < this.f59080j / 90) {
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
    public void m83393a(boolean z, int i, int i2) {
        this.f59086p = z;
        this.f59087q = i;
        this.f59088r = i2;
        TXCLog.m82970i("TXCCameraCapturer", "setCaptureBuffer %b, width: %d, height: %d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: a */
    public void m83392a(InterfaceC14106b interfaceC14106b) {
        this.f59075e = interfaceC14106b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m83402d() {
        return this.f59083m;
    }

    /* JADX INFO: renamed from: d */
    private int m83384d(int i) {
        Camera.Parameters parametersM83387a = m83387a();
        if (parametersM83387a == null) {
            return 1;
        }
        List<Integer> supportedPreviewFrameRates = parametersM83387a.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates == null) {
            TXCLog.m82966e("TXCCameraCapturer", "getSupportedFPS error");
            return 1;
        }
        int iIntValue = supportedPreviewFrameRates.get(0).intValue();
        for (int i2 = 0; i2 < supportedPreviewFrameRates.size(); i2++) {
            int iIntValue2 = supportedPreviewFrameRates.get(i2).intValue();
            if (Math.abs(iIntValue2 - i) - Math.abs(iIntValue - i) < 0) {
                iIntValue = iIntValue2;
            }
        }
        TXCLog.m82969i("TXCCameraCapturer", "choose fps=" + iIntValue);
        return iIntValue;
    }
}
