package com.core.glcore.util;

import android.hardware.Camera;
import android.os.Build;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p153l.erf0;
import p153l.tow;

/* JADX INFO: loaded from: classes.dex */
public class CameraHelper {
    private static final String TAG = "CameraHelper";
    private static int[] supportedSrcVideoFrameColorType = {17, 842094169};
    public static int targetFps = 30000;

    public static boolean configCamera(Camera camera, tow towVar) {
        Camera.Parameters parameters = camera.getParameters();
        parameters.setWhiteBalance("auto");
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            String str = Build.MODEL;
            if ((str.startsWith("GT-I950") || str.endsWith("SCH-I959") || str.endsWith("MEIZU MX3")) && supportedFocusModes.contains("continuous-picture")) {
                parameters.setFocusMode("continuous-picture");
            } else if (supportedFocusModes.contains("continuous-video")) {
                parameters.setFocusMode("continuous-video");
            } else if (supportedFocusModes.contains("auto")) {
                parameters.setFocusMode("auto");
            } else if (supportedFocusModes.contains("fixed")) {
                parameters.setFocusMode("fixed");
            }
        }
        parameters.setPreviewSize(towVar.f175478e, towVar.f175480f);
        parameters.setPreviewFpsRange(towVar.f175464U, towVar.f175463T);
        parameters.setPreviewFrameRate(towVar.f175449F);
        if (towVar.f175497n0) {
            parameters.setRecordingHint(true);
            MDLog.m7445e("lqdebug", "lqdebug setRecordingHint true");
        }
        try {
            camera.setParameters(parameters);
            return true;
        } catch (Exception e) {
            MDLog.m7445e(TAG, e.getMessage());
            camera.release();
            return false;
        }
    }

    public static int determineDisplayOrientation(int i, int i2) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i2, cameraInfo);
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        return i3 == 1 ? (360 - ((i4 + i) % 360)) % 360 : ((i4 - i) + 360) % 360;
    }

    public static boolean selectCameraColorFormat(Camera.Parameters parameters, tow towVar) {
        LinkedList linkedList = new LinkedList();
        List<Integer> supportedPreviewFormats = parameters.getSupportedPreviewFormats();
        for (int i : supportedSrcVideoFrameColorType) {
            if (supportedPreviewFormats.contains(Integer.valueOf(i))) {
                linkedList.add(Integer.valueOf(i));
            }
        }
        towVar.f175454K = 17;
        if (linkedList.contains(17)) {
            towVar.f175454K = 17;
            return true;
        }
        towVar.f175454K = 842094169;
        if (linkedList.contains(842094169)) {
            towVar.f175454K = 842094169;
            return true;
        }
        MDLog.m7445e(TAG, "!!!!!!!!!!!UnSupport,previewColorFormat");
        return false;
    }

    public static void selectCameraFpsRange(Camera.Parameters parameters, tow towVar) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        targetFps = towVar.f175449F * 1000;
        Collections.sort(supportedPreviewFpsRange, new Comparator<int[]>() { // from class: com.core.glcore.util.CameraHelper.1
            @Override // java.util.Comparator
            public int compare(int[] iArr, int[] iArr2) {
                int iAbs = Math.abs(iArr[0] - CameraHelper.targetFps) + Math.abs(iArr[1] - CameraHelper.targetFps);
                int iAbs2 = Math.abs(iArr2[0] - CameraHelper.targetFps) + Math.abs(iArr2[1] - CameraHelper.targetFps);
                if (iAbs > iAbs2) {
                    return 1;
                }
                return iAbs < iAbs2 ? -1 : 0;
            }
        });
        int i = 0;
        while (i < supportedPreviewFpsRange.size()) {
            if (!towVar.f175493l0) {
                if (supportedPreviewFpsRange.get(i)[0] != supportedPreviewFpsRange.get(i)[1]) {
                    break;
                } else {
                    i++;
                }
            } else {
                int iAbs = Math.abs(supportedPreviewFpsRange.get(i)[0] - targetFps) + Math.abs(supportedPreviewFpsRange.get(i)[1] - targetFps);
                if (supportedPreviewFpsRange.get(i)[0] >= targetFps && iAbs <= towVar.f175495m0 * 1000) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i >= supportedPreviewFpsRange.size()) {
            i = 0;
        }
        towVar.f175464U = supportedPreviewFpsRange.get(i)[0];
        towVar.f175463T = supportedPreviewFpsRange.get(i)[1];
        towVar.f175491k0 = supportedPreviewFpsRange;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0056 A[SYNTHETIC] */
    public static void selectCameraPreviewWH(Camera.Parameters parameters, tow towVar, erf0 erf0Var) {
        int i;
        int i2;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        Collections.sort(supportedPreviewSizes, new Comparator<Camera.Size>() { // from class: com.core.glcore.util.CameraHelper.2
            @Override // java.util.Comparator
            public int compare(Camera.Size size, Camera.Size size2) {
                return size.width * size.height > size2.width * size2.height ? 1 : -1;
            }
        });
        towVar.f175499o0.clear();
        for (Camera.Size size : supportedPreviewSizes) {
            towVar.f175499o0.add(size);
            MDLog.m7443d(MDLogTag.MOMENT_CAMERA_TAG, "width = " + size.width + " height = " + size.height);
        }
        int iM122180b = erf0Var.m122180b() * erf0Var.m122179a();
        int i3 = 0;
        int i4 = 0;
        for (Camera.Size size2 : supportedPreviewSizes) {
            int i5 = size2.width;
            if (i5 != 0 && (i = size2.height) != 0) {
                int iM122180b2 = (i5 * i) - (erf0Var.m122180b() * erf0Var.m122179a());
                float f = size2.width / size2.height;
                float fM122180b = erf0Var.m122180b() / erf0Var.m122179a();
                if (Math.abs(f - fM122180b) <= ((double) fM122180b) * 0.3d) {
                    int i6 = towVar.f175467X;
                    if (i6 == 0) {
                        if (size2.width / towVar.f175468Y > size2.height) {
                            continue;
                        } else if (Math.abs(iM122180b2) >= iM122180b) {
                            if (Math.abs(iM122180b2) != iM122180b) {
                                continue;
                            } else if (size2.height != erf0Var.m122179a() && size2.width == erf0Var.m122180b()) {
                                i3 = size2.width;
                                i4 = size2.height;
                                break;
                            } else {
                                i2 = size2.width;
                                if (i3 < i2) {
                                    i4 = size2.height;
                                    i3 = i2;
                                }
                            }
                        } else if (size2.width > erf0Var.m122180b() || size2.height <= erf0Var.m122179a()) {
                            iM122180b = Math.abs(iM122180b2);
                            i3 = size2.width;
                            i4 = size2.height;
                            if (i4 == erf0Var.m122179a() && i3 == erf0Var.m122180b()) {
                                break;
                            }
                        }
                    } else if (i6 != 1 || size2.height * towVar.f175468Y <= size2.width) {
                        if (Math.abs(iM122180b2) >= iM122180b) {
                            if (size2.width > erf0Var.m122180b()) {
                            }
                            iM122180b = Math.abs(iM122180b2);
                            i3 = size2.width;
                            i4 = size2.height;
                            if (i4 == erf0Var.m122179a()) {
                                continue;
                            }
                        } else if (Math.abs(iM122180b2) != iM122180b) {
                            continue;
                        } else {
                            if (size2.height != erf0Var.m122179a()) {
                            }
                            i2 = size2.width;
                            if (i3 < i2) {
                                i4 = size2.height;
                                i3 = i2;
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        if (i3 == 0 || i4 == 0) {
            i3 = supportedPreviewSizes.get(0).width;
            i4 = supportedPreviewSizes.get(0).height;
        }
        if (i3 != 0 && i4 != 0) {
            towVar.f175478e = i3;
            towVar.f175480f = i4;
        }
        MDLog.m7445e(TAG, "targetWidth = " + erf0Var.m122180b() + " targetHeight = " + erf0Var.m122179a() + " preferWidth = " + i3 + " preferHeight = " + i4);
    }

    public static void selectCameraPreviewWH2(Camera.Parameters parameters, tow towVar, erf0 erf0Var) {
        int i;
        int i2;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        Collections.sort(supportedPreviewSizes, new Comparator<Camera.Size>() { // from class: com.core.glcore.util.CameraHelper.3
            @Override // java.util.Comparator
            public int compare(Camera.Size size, Camera.Size size2) {
                return size.width * size.height > size2.width * size2.height ? 1 : -1;
            }
        });
        for (Camera.Size size : supportedPreviewSizes) {
            MDLog.m7445e(TAG, "width = " + size.width + " height = " + size.height);
        }
        erf0Var.m122180b();
        erf0Var.m122179a();
        int iMax = Math.max(erf0Var.m122180b(), erf0Var.m122179a());
        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
        int iIndexOf = -1;
        while (true) {
            if (!it.hasNext()) {
                i = 0;
                i2 = 0;
                break;
            }
            Camera.Size next = it.next();
            if ((next.width * next.height) - (erf0Var.m122180b() * erf0Var.m122179a()) > 0 && (i = next.width) >= iMax) {
                i2 = next.height;
                break;
            }
            if (iIndexOf < 0 && next.width >= 640) {
                iIndexOf = supportedPreviewSizes.indexOf(next);
                MDLog.m7445e(TAG, "selectCameraPreviewWH: w:" + next.width + " , height：" + next.height);
            }
        }
        if (i == 0 || (i2 == 0 && iIndexOf >= 0)) {
            i = supportedPreviewSizes.get(iIndexOf).width;
            i2 = supportedPreviewSizes.get(iIndexOf).height;
        }
        if (i != 0 && i2 != 0) {
            towVar.f175478e = i;
            towVar.f175480f = i2;
        }
        MDLog.m7445e(TAG, "targetWidth = " + erf0Var.m122180b() + " targetHeight = " + erf0Var.m122179a() + " preferWidth = " + i + " preferHeight = " + i2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x005d A[SYNTHETIC] */
    public static erf0 seletecMatchSize(List<erf0> list, erf0 erf0Var, int i, float f) {
        int iM122180b;
        int iM122179a;
        if (list == null) {
            return null;
        }
        int iM122180b2 = erf0Var.m122180b() * erf0Var.m122179a();
        int i2 = 0;
        int i3 = 0;
        for (erf0 erf0Var2 : list) {
            int iM122180b3 = (erf0Var2.m122180b() * erf0Var2.m122179a()) - (erf0Var.m122180b() * erf0Var.m122179a());
            if (i == 0) {
                if (erf0Var2.m122180b() / f <= erf0Var2.m122179a()) {
                    if (Math.abs(iM122180b3) < iM122180b2) {
                        if (erf0Var2.m122180b() > erf0Var.m122180b() || erf0Var2.m122179a() <= erf0Var.m122179a()) {
                            iM122180b2 = Math.abs(iM122180b3);
                            iM122180b = erf0Var2.m122180b();
                            iM122179a = erf0Var2.m122179a();
                            int i4 = iM122179a;
                            i3 = iM122180b;
                            i2 = i4;
                        }
                    } else if (Math.abs(iM122180b3) != iM122180b2 && i3 < erf0Var2.m122180b()) {
                        iM122180b = erf0Var2.m122180b();
                        iM122179a = erf0Var2.m122179a();
                        int i5 = iM122179a;
                        i3 = iM122180b;
                        i2 = i5;
                    }
                }
            } else if (i != 1 || erf0Var2.m122179a() * f <= erf0Var2.m122180b()) {
                if (Math.abs(iM122180b3) < iM122180b2) {
                    if (erf0Var2.m122180b() > erf0Var.m122180b()) {
                    }
                    iM122180b2 = Math.abs(iM122180b3);
                    iM122180b = erf0Var2.m122180b();
                    iM122179a = erf0Var2.m122179a();
                    int i6 = iM122179a;
                    i3 = iM122180b;
                    i2 = i6;
                } else if (Math.abs(iM122180b3) != iM122180b2) {
                }
            }
        }
        if (i2 == 0 || i3 == 0) {
            return null;
        }
        return new erf0(i3, i2);
    }
}
