package com.tencent.could.aicamare;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.WindowManager;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tencent.could.aicamare.callback.CameraEventListener;
import com.tencent.could.aicamare.callback.CameraLoggerCallBack;
import com.tencent.could.aicamare.entity.C13838a;
import com.tencent.could.aicamare.entity.CameraConfig;
import com.tencent.could.aicamare.enums.CameraZoom;
import com.tencent.could.aicamare.util.C13839a;
import com.tencent.could.aicamare.util.CameraLogger;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CameraHolder {
    public static final int EVENT_AUTO_FOCUS_CAMERA = 3;
    public static final int EVENT_CHANGE_CAMERA_PARAMETER = 8;
    public static final int EVENT_CHANGE_ZOOM = 4;
    public static final int EVENT_CLOSE_CAMERA = 2;
    public static final int EVENT_LIFE_CYCLE_START_PREVIEW = 6;
    public static final int EVENT_LIFE_CYCLE_STOP_PREVIEW = 7;
    public static final int EVENT_OPEN_CAMERA = 1;
    public static final int EVENT_START_PREVIEW = 5;
    public static final String PARAMETER_EXPOSURE_COMPENSATION = "camera_param_exposure";
    public static final String PARAMETER_WHITE_BALANCE = "camera_param_white_balance";
    public static final String PARAMETER_ZOOM_VALUE = "camera_param_zoom";
    public static final String TAG = "CameraHolder";
    public CameraEventListener eventListener;
    public volatile Handler handler;
    public HandlerThread handlerThread;
    public CameraLoggerCallBack loggerCallBack;
    public SurfaceHolder surfaceHolder;
    public SurfaceTexture surfaceTexture;
    public Matrix transformMatrix;
    public volatile boolean isUseSurfaceHolder = true;
    public float oldDist = 1.0f;
    public CameraConfig cameraConfig = new CameraConfig();
    public C13837d cameraHolderImp = new C13837d();

    /* JADX INFO: renamed from: com.tencent.could.aicamare.CameraHolder$a */
    public class HandlerC13832a extends Handler {
        public HandlerC13832a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    CameraHolder.this.doOpenCamera();
                    break;
                case 2:
                    CameraHolder.this.doCloseCamera();
                    break;
                case 3:
                    CameraHolder.this.doAutoFocus(message.arg1 == 1);
                    break;
                case 4:
                    CameraHolder.this.doChangeZoom(message.arg1 == 1);
                    break;
                case 5:
                    CameraHolder.this.doStartPreview();
                    break;
                case 6:
                    CameraHolder.this.doLifeResume();
                    break;
                case 7:
                    CameraHolder.this.doLifeOnPause();
                    break;
                case 8:
                    try {
                        CameraHolder.this.doEventChangeCameraParameter((Map) message.obj);
                    } catch (Exception e) {
                        CameraLogger.m82191b(CameraHolder.TAG, "doEventChangeCameraParameter error " + e.getLocalizedMessage(), CameraHolder.this.loggerCallBack);
                        return;
                    }
                    break;
            }
        }
    }

    private void cleanAllListener() {
        if (this.loggerCallBack != null) {
            this.loggerCallBack = null;
        }
        if (this.eventListener != null) {
            this.eventListener = null;
        }
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            if (c13837d.f57228b != null) {
                c13837d.f57228b = null;
            }
            if (c13837d.f57229c != null) {
                c13837d.f57229c = null;
            }
        }
    }

    private Matrix computePreviewMatrix(TextureView textureView, Point point, Point point2) {
        float f;
        float f2;
        float fMax;
        float f3;
        int i;
        int i2;
        Matrix matrix = new Matrix();
        textureView.getTransform(matrix);
        matrix.reset();
        if (point.equals(point2)) {
            return matrix;
        }
        if (getDisplayRotate() % 180 != 0) {
            f = (point2.x * 1.0f) / point.y;
            f2 = (point2.y * 1.0f) / point.x;
            fMax = Math.max(f, f2);
            float f4 = point.y * fMax;
            f3 = point.x * fMax;
            i = (int) ((point2.x - f4) / 2.0f);
            i2 = point2.y;
        } else {
            f = (point2.x * 1.0f) / point.x;
            f2 = (point2.y * 1.0f) / point.y;
            fMax = Math.max(f, f2);
            float f5 = point.x * fMax;
            f3 = point.y * fMax;
            i = (int) ((point2.x - f5) / 2.0f);
            i2 = point2.y;
        }
        int i3 = (int) ((i2 - f3) / 2.0f);
        matrix.preScale(1.0f / f, 1.0f / f2);
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(i, i3);
        return matrix;
    }

    private void createHandlerThread() {
        HandlerThread handlerThread = new HandlerThread("camera-preview");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new HandlerC13832a(this.handlerThread.getLooper());
    }

    private Matrix createTransformMatrix(TextureView textureView) {
        if (textureView == null) {
            CameraLogger.m82191b(TAG, "createTransformMatrix textureView == null", this.loggerCallBack);
            return null;
        }
        Matrix matrix = this.transformMatrix;
        if (matrix != null) {
            return matrix;
        }
        Camera.Size cameraSize = getCameraSize();
        if (cameraSize != null) {
            Matrix matrixComputePreviewMatrix = computePreviewMatrix(textureView, new Point(cameraSize.width, cameraSize.height), new Point(textureView.getWidth(), textureView.getHeight()));
            this.transformMatrix = matrixComputePreviewMatrix;
            return matrixComputePreviewMatrix;
        }
        CameraLogger.m82191b(TAG, "createTransformMatrix size == null", this.loggerCallBack);
        CameraEventListener cameraEventListener = this.eventListener;
        if (cameraEventListener != null) {
            cameraEventListener.onEventError(3, "createTransformMatrix size is null");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAutoFocus(boolean z) {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            if (c13837d.f57231e) {
                c13837d.m82184a(4, "isFocusing!");
                return;
            }
            Camera camera = c13837d.f57227a.f57233a;
            if (camera == null) {
                c13837d.m82184a(4, "current camera is null!");
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters == null) {
                    c13837d.m82184a(4, "current camera  parameters is null!");
                    return;
                }
                c13837d.f57231e = true;
                if ("auto".equals(parameters.getFocusMode()) && !z) {
                    c13837d.f57231e = false;
                    c13837d.m82184a(4, "there is no need change auto mode");
                    return;
                }
                if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                    camera.setParameters(parameters);
                }
                String focusMode = parameters.getFocusMode();
                if ("continuous-video".equals(focusMode)) {
                    c13837d.f57231e = false;
                    c13837d.m82184a(4, "there is no need change auto mode");
                } else {
                    if (!"auto".equals(focusMode)) {
                        parameters.setFocusMode("auto");
                        camera.setParameters(parameters);
                    }
                    camera.autoFocus(new C13834a(c13837d));
                }
            } catch (Exception e) {
                c13837d.m82188b("there is some error with set auto mode + e: " + e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doChangeZoom(boolean z) {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            Camera camera = c13837d.f57227a.f57233a;
            if (camera == null) {
                c13837d.m82184a(4, "current camera is null");
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (!parameters.isZoomSupported()) {
                    CameraLogger.m82189a("CameraHolderImp", "this camera do not support", c13837d.f57229c);
                    return;
                }
                int maxZoom = parameters.getMaxZoom();
                int zoom = parameters.getZoom();
                if (z && zoom < maxZoom) {
                    zoom++;
                } else if (zoom > 0) {
                    zoom--;
                }
                parameters.setZoom(zoom);
                camera.setParameters(parameters);
            } catch (Exception e) {
                c13837d.m82188b("doChangeZoom error: " + e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCloseCamera() {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            CameraLogger.m82189a("CameraHolderImp", "do close camera", c13837d.f57229c);
            Camera camera = c13837d.f57227a.f57233a;
            if (camera == null) {
                CameraLogger.m82191b("CameraHolderImp", "do close camera is null!", c13837d.f57229c);
                return;
            }
            synchronized (C13837d.class) {
                try {
                    C13838a c13838a = c13837d.f57227a;
                    c13838a.f57233a = null;
                    c13838a.f57236d = null;
                    c13838a.f57234b = 0;
                    c13838a.f57235c = 0;
                    c13838a.f57237e = 0;
                    camera.cancelAutoFocus();
                    camera.stopPreview();
                    camera.setOneShotPreviewCallback(null);
                    camera.setPreviewCallback(null);
                    camera.release();
                    CameraLogger.m82189a("CameraHolderImp", "close camera success！", c13837d.f57229c);
                    CameraEventListener cameraEventListener = c13837d.f57228b;
                    if (cameraEventListener != null) {
                        cameraEventListener.onCameraClosed();
                    }
                } catch (Exception e) {
                    String str = "some error happen in close e: " + e.getMessage();
                    c13837d.m82188b(str);
                    c13837d.m82184a(2, str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLifeOnPause() {
        C13838a c13838a;
        Camera camera;
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d == null || (c13838a = c13837d.f57227a) == null || (camera = c13838a.f57233a) == null) {
            return;
        }
        try {
            camera.stopPreview();
        } catch (Exception e) {
            CameraLogger.m82191b(TAG, "doLifeResume error: e " + e.getLocalizedMessage(), this.loggerCallBack);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLifeResume() {
        C13838a c13838a;
        Camera camera;
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d == null || (c13838a = c13837d.f57227a) == null || (camera = c13838a.f57233a) == null) {
            return;
        }
        try {
            this.cameraHolderImp.m82187a(camera);
            camera.startPreview();
        } catch (Exception e) {
            CameraLogger.m82191b(TAG, "doLifeResume error: e " + e.getLocalizedMessage(), this.loggerCallBack);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:109:0x0222 A[EDGE_INSN: B:109:0x0222->B:110:0x0224 BREAK  A[LOOP:1: B:94:0x01e0->B:107:0x020a]] */
    public void doOpenCamera() {
        int i;
        int i2;
        Camera.Size size;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            if (Camera.getNumberOfCameras() < 0) {
                c13837d.m82184a(1, "There are not camera devices found!");
            } else {
                try {
                    boolean z2 = !c13837d.f57230d.isBackCamera();
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= numberOfCameras) {
                            i5 = -808;
                            break;
                        }
                        Camera.getCameraInfo(i5, cameraInfo);
                        if (cameraInfo.facing == z2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i5 == -808) {
                        c13837d.m82184a(1, "can not find a suit camera devices!");
                    } else {
                        C13838a c13838a = c13837d.f57227a;
                        c13838a.f57234b = i5;
                        c13838a.f57233a = Camera.open(i5);
                        WeakReference<Context> weakReference = c13837d.f57232f;
                        Context context = weakReference == null ? null : weakReference.get();
                        if (context != null) {
                            int i6 = !c13837d.f57230d.isBackCamera() ? 1 : 0;
                            int i7 = c13837d.f57227a.f57234b;
                            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                            Camera.getCameraInfo(i7, cameraInfo2);
                            int rotation = ((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).getDefaultDisplay().getRotation();
                            c13837d.m82186a("row DefaultDisplay rotation:" + (rotation * 90));
                            int i8 = 2;
                            if (rotation == 1) {
                                i = 90;
                            } else if (rotation != 2) {
                                i = rotation != 3 ? 0 : 270;
                            } else {
                                i = 180;
                            }
                            int i9 = cameraInfo2.facing;
                            int i10 = cameraInfo2.orientation;
                            int i11 = i9 == 1 ? (360 - ((i10 + i) % 360)) % 360 : ((i10 - i) + 360) % 360;
                            StringBuilder sb = new StringBuilder("CameraInfo.orientation: ");
                            sb.append(cameraInfo2.orientation);
                            sb.append(" | isLand: ");
                            sb.append(c13837d.f57230d.isLand());
                            sb.append(" | DeviceRotation: ");
                            sb.append(i);
                            sb.append(" | FinalOrientation: ");
                            sb.append(i11);
                            sb.append(" | CameraFacing: ");
                            sb.append(cameraInfo2.facing == 1 ? "Front" : "Back");
                            c13837d.m82186a(sb.toString());
                            if (!c13837d.f57230d.isLand()) {
                                CameraLogger.m82189a("CameraHolderImp", "not land, and camera facing front", c13837d.f57229c);
                                if (i11 == 180 && i == 270) {
                                    i11 = 90;
                                }
                            }
                            c13837d.f57227a.f57237e = i11;
                            if (i11 == 90) {
                                i2 = 7;
                            } else if (i11 == 180) {
                                i2 = 3;
                            } else if (i11 == 270) {
                                i2 = 5;
                            } else {
                                c13837d.m82186a("camera rotate not 90 degree or 180 degree, input cameraRotate: " + i11);
                                i2 = 1;
                            }
                            if (i6 == 1) {
                                i8 = i2;
                            } else if (i2 != 1) {
                                if (i2 == 2) {
                                    i8 = 1;
                                } else {
                                    i8 = 4;
                                    if (i2 != 3) {
                                        if (i2 == 4) {
                                            i8 = 3;
                                        } else if (i2 == 5) {
                                            i8 = 8;
                                        } else {
                                            i8 = 6;
                                            if (i2 == 6) {
                                                i8 = 7;
                                            } else if (i2 != 7) {
                                                c13837d.m82186a("[CameraSetting.transBackFacingCameraRatateTag] unsurported rotateTag: " + i2);
                                                i8 = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            c13837d.m82186a("cameraFacing: " + i6 + " rotateTag: " + i8);
                            c13837d.f57227a.f57235c = i8;
                            int preWidth = c13837d.f57230d.getPreWidth();
                            int preHeight = c13837d.f57230d.getPreHeight();
                            Camera camera = c13837d.f57227a.f57233a;
                            if (camera == null) {
                                c13837d.m82184a(1, "init camera fail, current camera is null!");
                            } else {
                                try {
                                    Camera.Parameters parameters = camera.getParameters();
                                    if (c13837d.f57230d.isBackCamera()) {
                                        CameraZoom zoom = c13837d.f57230d.getZoom();
                                        if (zoom == CameraZoom.ZOOM_1X) {
                                            i4 = 0;
                                            break;
                                        }
                                        int i12 = zoom == CameraZoom.ZOOM_1_5X ? 150 : zoom == CameraZoom.ZOOM_2X ? 200 : 0;
                                        try {
                                            Camera camera2 = c13837d.f57227a.f57233a;
                                            if (camera2 == null) {
                                                i4 = 0;
                                                break;
                                            }
                                            List<Integer> zoomRatios = camera2.getParameters().getZoomRatios();
                                            i4 = 0;
                                            while (true) {
                                                if (i4 >= zoomRatios.size()) {
                                                    i4 = 0;
                                                    break;
                                                }
                                                int iIntValue = zoomRatios.get(i4).intValue();
                                                if (iIntValue == i12) {
                                                    break;
                                                }
                                                if (iIntValue > i12) {
                                                    int i13 = i4 - 1;
                                                    if (iIntValue - i12 < i12 - zoomRatios.get(i13).intValue()) {
                                                        break;
                                                    }
                                                    i4 = i13;
                                                    break;
                                                }
                                                i4++;
                                                i4 = 0;
                                                break;
                                            }
                                        } catch (RuntimeException e) {
                                            c13837d.m82188b("getZoomIndex error: " + e.getLocalizedMessage());
                                        }
                                        parameters.setZoom(i4);
                                    }
                                    List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                                    int iMax = Math.max(preWidth, preHeight);
                                    int iMin = Math.min(preWidth, preHeight);
                                    double d = iMax;
                                    double d2 = iMin;
                                    double d3 = d / d2;
                                    ArrayList arrayList = new ArrayList();
                                    for (Camera.Size size2 : supportedPreviewSizes) {
                                        List<Camera.Size> list = supportedPreviewSizes;
                                        double d4 = d2;
                                        double d5 = ((double) size2.height) / ((double) size2.width);
                                        if (d5 == 0.75d) {
                                            arrayList.add(size2);
                                        }
                                        if (d5 == 0.5625d) {
                                            arrayList.add(size2);
                                        }
                                        supportedPreviewSizes = list;
                                        d2 = d4;
                                    }
                                    double d6 = d2;
                                    List<Camera.Size> list2 = arrayList.size() == 0 ? supportedPreviewSizes : arrayList;
                                    Iterator it = list2.iterator();
                                    double d7 = Double.MAX_VALUE;
                                    double d8 = Double.MAX_VALUE;
                                    Camera.Size size3 = null;
                                    while (it.hasNext()) {
                                        Camera.Size size4 = (Camera.Size) it.next();
                                        it = it;
                                        Camera.Size size5 = size3;
                                        if (Math.abs((((double) size4.width) / ((double) size4.height)) - d3) > 0.05d) {
                                            size3 = size5;
                                        } else {
                                            double dAbs = Math.abs(size4.height - iMin);
                                            if (dAbs < d8) {
                                                d8 = dAbs;
                                                size3 = size4;
                                            } else {
                                                size3 = size5;
                                            }
                                        }
                                    }
                                    Camera.Size size6 = size3;
                                    if (size6 == null) {
                                        size = size6;
                                        for (Camera.Size size7 : list2) {
                                            double d9 = d;
                                            Camera.Size size8 = size;
                                            double dAbs2 = (((double) Math.abs(size7.height - iMin)) / d6) + (((double) Math.abs(size7.width - iMax)) / d9);
                                            if (dAbs2 < d7) {
                                                size = size7;
                                                d7 = dAbs2;
                                            } else {
                                                size = size8;
                                            }
                                            d = d9;
                                        }
                                    } else {
                                        size = size6;
                                    }
                                    Log.e("CameraUtil", "optimalSize: " + size + " w: " + iMax + " h: " + iMin);
                                    try {
                                        parameters.setPreviewSize(size.width, size.height);
                                        int minFps = c13837d.f57230d.getMinFps() * 1000;
                                        int maxFps = c13837d.f57230d.getMaxFps() * 1000;
                                        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                                        if (!c13837d.f57230d.isMustDiffMinAndMaxFps() || minFps != maxFps) {
                                            Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    z = false;
                                                    break;
                                                }
                                                int[] next = it2.next();
                                                if (next[0] == minFps && next[1] == maxFps) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        } else {
                                            z = false;
                                            break;
                                        }
                                        if (!z) {
                                            int i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                                            int i15 = 0;
                                            z = z;
                                            while (i15 < supportedPreviewFpsRange.size()) {
                                                int[] iArr = supportedPreviewFpsRange.get(i15);
                                                if (iArr[1] - iArr[0] <= i14 && (!c13837d.f57230d.isMustDiffMinAndMaxFps() || iArr[1] != iArr[0])) {
                                                    int i16 = iArr[1];
                                                    int i17 = iArr[0];
                                                    int i18 = i16 - i17;
                                                    maxFps = i16;
                                                    minFps = i17;
                                                    i14 = i18;
                                                    z = true;
                                                }
                                                i15++;
                                                z = z;
                                            }
                                        }
                                        if (!z) {
                                            c13837d.m82186a("not found, using defaut, min : " + minFps + " max: " + maxFps);
                                            minFps = 30000;
                                            maxFps = 30000;
                                        }
                                        c13837d.m82186a("using range min: " + minFps + " max: " + maxFps);
                                        parameters.setPreviewFpsRange(minFps, maxFps);
                                        camera.setParameters(parameters);
                                        try {
                                            if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                                                parameters.setFocusMode("continuous-video");
                                                camera.setParameters(parameters);
                                            }
                                        } catch (Exception unused) {
                                            CameraLogger.m82189a("CameraHolderImp", "This phone not support AutoFocus", c13837d.f57229c);
                                        }
                                        try {
                                            camera.setDisplayOrientation(c13837d.f57227a.f57237e);
                                            c13837d.f57227a.f57236d = parameters.getPreviewSize();
                                            C13838a c13838a2 = c13837d.f57227a;
                                            Point point = new Point(preWidth, preHeight);
                                            C13838a c13838a3 = c13837d.f57227a;
                                            Camera.Size size9 = c13838a3.f57236d;
                                            int i19 = c13838a3.f57237e % 180;
                                            int i20 = point.x;
                                            if (i19 != 0) {
                                                f = (i20 * 1.0f) / size9.height;
                                                f2 = point.y * 1.0f;
                                                i3 = size9.width;
                                            } else {
                                                f = (i20 * 1.0f) / size9.width;
                                                f2 = point.y * 1.0f;
                                                i3 = size9.height;
                                            }
                                            float f3 = f2 / i3;
                                            Log.e("CameraHolderImp", "scaleX: " + f + " scaleY: " + f3);
                                            float fMax = Math.max(f, f3);
                                            new Point((int) (((float) size9.width) * fMax), (int) (((float) size9.height) * fMax));
                                            c13838a2.getClass();
                                            CameraLogger.m82189a("CameraHolderImp", "initCamera success!", c13837d.f57229c);
                                            CameraEventListener cameraEventListener = c13837d.f57228b;
                                            if (cameraEventListener != null) {
                                                cameraEventListener.onCameraSucceed();
                                                return;
                                            }
                                            return;
                                        } catch (Exception e2) {
                                            Log.e("CameraHolderImp", "Exception e: " + e2.getLocalizedMessage());
                                            c13837d.m82184a(7, "set display orientation error.");
                                        }
                                    } catch (Exception e3) {
                                        Log.e("CameraHolderImp", "Exception e: " + e3.getLocalizedMessage());
                                        c13837d.m82184a(1, "set preview parameter size error");
                                    }
                                } catch (RuntimeException e4) {
                                    Log.e("CameraHolderImp", "RuntimeException e: " + e4.getLocalizedMessage());
                                    c13837d.m82184a(1, "currentCamera, getParameters error!");
                                }
                            }
                            CameraLogger.m82191b("CameraHolderImp", "initCamera fail!", c13837d.f57229c);
                            return;
                        }
                        c13837d.m82184a(1, "open camera context is null!");
                    }
                } catch (RuntimeException e5) {
                    c13837d.m82184a(1, "open camera happen runtime error: " + e5.getLocalizedMessage());
                }
            }
            CameraLogger.m82191b("CameraHolderImp", "localOpenCamera fail!", c13837d.f57229c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStartPreview() {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            boolean z = this.isUseSurfaceHolder;
            SurfaceHolder surfaceHolder = this.surfaceHolder;
            SurfaceTexture surfaceTexture = this.surfaceTexture;
            CameraLogger.m82189a("CameraHolderImp", "start camera preview", c13837d.f57229c);
            Camera camera = c13837d.f57227a.f57233a;
            if (camera == null) {
                CameraLogger.m82191b("CameraHolderImp", "start preview with currentCamera is null!", c13837d.f57229c);
                c13837d.m82184a(6, "current camera is null!");
                return;
            }
            if (!c13837d.m82187a(camera)) {
                c13837d.m82184a(6, "add camera preview fail!");
                return;
            }
            if (z && surfaceHolder != null) {
                try {
                    camera.setPreviewDisplay(surfaceHolder);
                } catch (IOException e) {
                    e = e;
                    c13837d.m82184a(6, "set preview display error : " + e.getMessage());
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    c13837d.m82184a(6, "set preview display error : " + e.getMessage());
                    return;
                }
            }
            if (!z && surfaceTexture != null) {
                camera.setPreviewTexture(surfaceTexture);
            }
            camera.startPreview();
            CameraLogger.m82189a("CameraHolderImp", "start camera preview success", c13837d.f57229c);
            CameraEventListener cameraEventListener = c13837d.f57228b;
            if (cameraEventListener != null) {
                cameraEventListener.onPreviewSucceed();
            } else {
                CameraLogger.m82191b("CameraHolderImp", "start preview fail eventListener is null", c13837d.f57229c);
            }
        }
    }

    private void stopCurrentThread() {
        if (this.handler == null) {
            return;
        }
        CameraLogger.m82189a(TAG, "clean handler and thread", this.loggerCallBack);
        this.handler.removeMessages(1);
        this.handler.removeMessages(2);
        this.handler.removeMessages(3);
        this.handler.removeMessages(4);
        this.handler.removeMessages(5);
        this.handler.removeMessages(7);
        this.handler.removeMessages(6);
        this.handler = null;
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.handlerThread.quitSafely();
    }

    public void closeCamera() {
        if (this.cameraConfig.isMainThread()) {
            doCloseCamera();
            return;
        }
        if (this.handler == null) {
            CameraLogger.m82191b(TAG, "close camera handler == null", this.loggerCallBack);
            doCloseCamera();
        } else {
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 2;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void doEventChangeCameraParameter(Map<String, Object> map) {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            Camera camera = c13837d.f57227a.f57233a;
            if (camera == null || map == null) {
                CameraLogger.m82191b("CameraHolderImp", "setEventChangeCameraParameter, currentCamera is null or parameter is null", c13837d.f57229c);
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (map.containsKey(PARAMETER_EXPOSURE_COMPENSATION)) {
                    parameters.setExposureCompensation(((Integer) map.get(PARAMETER_EXPOSURE_COMPENSATION)).intValue());
                }
                if (map.containsKey(PARAMETER_ZOOM_VALUE)) {
                    parameters.setZoom(((Integer) map.get(PARAMETER_ZOOM_VALUE)).intValue());
                }
                if (map.containsKey(PARAMETER_WHITE_BALANCE)) {
                    parameters.setWhiteBalance((String) map.get(PARAMETER_WHITE_BALANCE));
                }
                camera.setParameters(parameters);
            } catch (RuntimeException e) {
                c13837d.m82188b("changeCameraExposureInfo:" + e.getLocalizedMessage());
            }
        }
    }

    public void doFocus(boolean z) {
        if (this.cameraConfig.isMainThread()) {
            doAutoFocus(z);
            return;
        }
        if (this.handler == null) {
            CameraLogger.m82191b(TAG, "do focus handler == null", this.loggerCallBack);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.what = 3;
        messageObtainMessage.arg1 = z ? 1 : 0;
        this.handler.sendMessage(messageObtainMessage);
    }

    public int getCameraId() {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            return c13837d.f57227a.f57234b;
        }
        return 0;
    }

    public Camera.Size getCameraSize() {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            return c13837d.f57227a.f57236d;
        }
        return null;
    }

    public Camera getCurrentCamera() {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            return c13837d.f57227a.f57233a;
        }
        return null;
    }

    public C13838a getCurrentCameraInfo() {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            return c13837d.f57227a;
        }
        return null;
    }

    public int getCurrentRotate() {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            return c13837d.f57227a.f57235c;
        }
        return 0;
    }

    public int getDisplayRotate() {
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            return c13837d.f57227a.f57237e;
        }
        return 0;
    }

    public void initCameraHolder(Context context, CameraConfig cameraConfig) {
        if (cameraConfig != null) {
            this.cameraConfig = cameraConfig;
        }
        this.cameraHolderImp.m82185a(context);
        this.cameraHolderImp.f57230d = cameraConfig;
        if (cameraConfig.isMainThread()) {
            return;
        }
        createHandlerThread();
    }

    public void onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            doFocus(true);
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                return;
            }
            this.oldDist = C13839a.m82192a(motionEvent);
            return;
        }
        float fM82192a = C13839a.m82192a(motionEvent);
        float f = this.oldDist;
        if (fM82192a > f) {
            zoomCamera(true);
        } else if (fM82192a < f) {
            zoomCamera(false);
        }
        this.oldDist = fM82192a;
    }

    public void openCamera(Context context) {
        this.cameraHolderImp.m82185a(context);
        if (this.cameraConfig.isMainThread()) {
            doOpenCamera();
        } else {
            if (this.handler == null) {
                CameraLogger.m82191b(TAG, "open camera handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 1;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void release() {
        doCloseCamera();
        stopCurrentThread();
        cleanAllListener();
        if (this.surfaceTexture != null) {
            this.surfaceTexture = null;
        }
        if (this.surfaceHolder != null) {
            this.surfaceHolder = null;
        }
        if (this.transformMatrix != null) {
            this.transformMatrix = null;
        }
    }

    public void setEventChangeCameraParameter(Map<String, Object> map) {
        if (this.cameraConfig.isMainThread()) {
            doEventChangeCameraParameter(map);
            return;
        }
        if (this.handler == null) {
            CameraLogger.m82191b(TAG, "set camera parameter handler == null", this.loggerCallBack);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.what = 8;
        messageObtainMessage.obj = map;
        this.handler.sendMessage(messageObtainMessage);
    }

    public void setEventListener(CameraEventListener cameraEventListener) {
        this.eventListener = cameraEventListener;
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            c13837d.f57228b = cameraEventListener;
        }
    }

    public void setLoggerCallBack(CameraLoggerCallBack cameraLoggerCallBack, CameraLogger.LOG_LEVEL log_level) {
        CameraLogger.f57238a = log_level;
        this.loggerCallBack = cameraLoggerCallBack;
        C13837d c13837d = this.cameraHolderImp;
        if (c13837d != null) {
            c13837d.f57229c = cameraLoggerCallBack;
        }
    }

    public void startPreview(SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
        this.isUseSurfaceHolder = true;
        if (this.cameraConfig.isMainThread()) {
            doStartPreview();
        } else {
            if (this.handler == null) {
                CameraLogger.m82191b(TAG, "start camera preview handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 5;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void startPreviewByResume() {
        if (this.cameraConfig.isMainThread()) {
            doLifeResume();
        } else {
            if (this.handler == null) {
                CameraLogger.m82191b(TAG, "do focus handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 6;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void startPreviewWithTexture(TextureView textureView, SurfaceTexture surfaceTexture) {
        if (textureView != null) {
            createTransformMatrix(textureView);
            Matrix matrix = this.transformMatrix;
            if (matrix != null) {
                textureView.setTransform(matrix);
            } else {
                CameraLogger.m82191b(TAG, "transformMatrix do not create is null", this.loggerCallBack);
            }
        }
        this.isUseSurfaceHolder = false;
        this.surfaceTexture = surfaceTexture;
        if (this.cameraConfig.isMainThread()) {
            doStartPreview();
        } else {
            if (this.handler == null) {
                CameraLogger.m82191b(TAG, "start camera preview handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 5;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void stopPreviewByOnPause() {
        if (this.cameraConfig.isMainThread()) {
            doLifeOnPause();
        } else {
            if (this.handler == null) {
                CameraLogger.m82191b(TAG, "do focus handler == null", this.loggerCallBack);
                return;
            }
            Message messageObtainMessage = this.handler.obtainMessage();
            messageObtainMessage.what = 7;
            this.handler.sendMessage(messageObtainMessage);
        }
    }

    public void zoomCamera(boolean z) {
        if (this.cameraConfig.isMainThread()) {
            doChangeZoom(z);
            return;
        }
        if (this.handler == null) {
            CameraLogger.m82191b(TAG, "zoom camera handler == null", this.loggerCallBack);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.what = 4;
        messageObtainMessage.arg1 = z ? 1 : 0;
        this.handler.sendMessage(messageObtainMessage);
    }

    public void setLoggerCallBack(CameraLoggerCallBack cameraLoggerCallBack) {
        setLoggerCallBack(cameraLoggerCallBack, CameraLogger.LOG_LEVEL.LEVEL_VERBOSE);
    }
}
