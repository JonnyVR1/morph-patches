package p149l;

import android.hardware.Camera;
import android.os.Build;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class u84 {

    /* JADX INFO: renamed from: a */
    public static int f175095a = 30000;

    /* JADX INFO: renamed from: b */
    private static int[] f175096b = {17, 842094169};

    /* JADX INFO: renamed from: l.u84$a */
    public class C20377a implements Comparator<int[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            int iAbs = Math.abs(iArr[0] - u84.f175095a) + Math.abs(iArr[1] - u84.f175095a);
            int iAbs2 = Math.abs(iArr2[0] - u84.f175095a) + Math.abs(iArr2[1] - u84.f175095a);
            if (iAbs > iAbs2) {
                return 1;
            }
            return iAbs < iAbs2 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: l.u84$b */
    public class C20378b implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m192180a(Camera camera, tlw tlwVar) {
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
        parameters.setPreviewSize(tlwVar.f171085b, tlwVar.f171087c);
        parameters.setPreviewFpsRange(tlwVar.f171064H, tlwVar.f171063G);
        parameters.setPreviewFrameRate(tlwVar.f171109s);
        if (tlwVar.f171084a0) {
            parameters.setRecordingHint(true);
            MDLog.m7391e("lqdebug", "lqdebug setRecordingHint true");
        }
        try {
            camera.setParameters(parameters);
            return true;
        } catch (Exception e) {
            MDLog.m7391e("CameraHelper", e.getMessage());
            camera.release();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m192181b(int i, int i2) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i2, cameraInfo);
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        return i3 == 1 ? (360 - ((i4 + i) % 360)) % 360 : ((i4 - i) + 360) % 360;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m192182c(Camera.Parameters parameters, tlw tlwVar) {
        LinkedList linkedList = new LinkedList();
        List<Integer> supportedPreviewFormats = parameters.getSupportedPreviewFormats();
        for (int i : f175096b) {
            if (supportedPreviewFormats.contains(Integer.valueOf(i))) {
                linkedList.add(Integer.valueOf(i));
            }
        }
        tlwVar.f171114x = 17;
        if (linkedList.contains(17)) {
            tlwVar.f171114x = 17;
            return true;
        }
        tlwVar.f171114x = 842094169;
        if (linkedList.contains(842094169)) {
            tlwVar.f171114x = 842094169;
            return true;
        }
        MDLog.m7391e("CameraHelper", "!!!!!!!!!!!UnSupport,previewColorFormat");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m192183d(Camera.Parameters parameters, tlw tlwVar) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        f175095a = tlwVar.f171109s * 1000;
        Collections.sort(supportedPreviewFpsRange, new C20377a());
        int i = 0;
        while (i < supportedPreviewFpsRange.size()) {
            if (!tlwVar.f171081Y) {
                if (supportedPreviewFpsRange.get(i)[0] != supportedPreviewFpsRange.get(i)[1]) {
                    break;
                } else {
                    i++;
                }
            } else {
                int iAbs = Math.abs(supportedPreviewFpsRange.get(i)[0] - f175095a) + Math.abs(supportedPreviewFpsRange.get(i)[1] - f175095a);
                if (supportedPreviewFpsRange.get(i)[0] >= f175095a && iAbs <= tlwVar.f171082Z * 1000) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i >= supportedPreviewFpsRange.size()) {
            i = 0;
        }
        tlwVar.f171064H = supportedPreviewFpsRange.get(i)[0];
        tlwVar.f171063G = supportedPreviewFpsRange.get(i)[1];
        tlwVar.f171080X = supportedPreviewFpsRange;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0056 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static void m192184e(Camera.Parameters parameters, tlw tlwVar, tif0 tif0Var) {
        int i;
        int i2;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        Collections.sort(supportedPreviewSizes, new C20378b());
        tlwVar.f171086b0.clear();
        for (Camera.Size size : supportedPreviewSizes) {
            tlwVar.f171086b0.add(size);
            MDLog.m7389d(MDLogTag.MOMENT_CAMERA_TAG, "width = " + size.width + " height = " + size.height);
        }
        int iM189184b = tif0Var.m189184b() * tif0Var.m189183a();
        int i3 = 0;
        int i4 = 0;
        for (Camera.Size size2 : supportedPreviewSizes) {
            int i5 = size2.width;
            if (i5 != 0 && (i = size2.height) != 0) {
                int iM189184b2 = (i5 * i) - (tif0Var.m189184b() * tif0Var.m189183a());
                float f = size2.width / size2.height;
                float fM189184b = tif0Var.m189184b() / tif0Var.m189183a();
                if (Math.abs(f - fM189184b) <= ((double) fM189184b) * 0.3d) {
                    int i6 = tlwVar.f171067K;
                    if (i6 == 0) {
                        if (size2.width / tlwVar.f171068L > size2.height) {
                            continue;
                        } else if (Math.abs(iM189184b2) >= iM189184b) {
                            if (Math.abs(iM189184b2) != iM189184b) {
                                continue;
                            } else if (size2.height != tif0Var.m189183a() && size2.width == tif0Var.m189184b()) {
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
                        } else if (size2.width > tif0Var.m189184b() || size2.height <= tif0Var.m189183a()) {
                            iM189184b = Math.abs(iM189184b2);
                            i3 = size2.width;
                            i4 = size2.height;
                            if (i4 == tif0Var.m189183a() && i3 == tif0Var.m189184b()) {
                                break;
                            }
                        }
                    } else if (i6 != 1 || size2.height * tlwVar.f171068L <= size2.width) {
                        if (Math.abs(iM189184b2) >= iM189184b) {
                            if (size2.width > tif0Var.m189184b()) {
                            }
                            iM189184b = Math.abs(iM189184b2);
                            i3 = size2.width;
                            i4 = size2.height;
                            if (i4 == tif0Var.m189183a()) {
                                continue;
                            }
                        } else if (Math.abs(iM189184b2) != iM189184b) {
                            continue;
                        } else {
                            if (size2.height != tif0Var.m189183a()) {
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
            tlwVar.f171085b = i3;
            tlwVar.f171087c = i4;
        }
        MDLog.m7391e("CameraHelper", "targetWidth = " + tif0Var.m189184b() + " targetHeight = " + tif0Var.m189183a() + " preferWidth = " + i3 + " preferHeight = " + i4);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x005d A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static tif0 m192185f(List<tif0> list, tif0 tif0Var, int i, float f) {
        int iM189184b;
        int iM189183a;
        if (list == null) {
            return null;
        }
        int iM189184b2 = tif0Var.m189184b() * tif0Var.m189183a();
        int i2 = 0;
        int i3 = 0;
        for (tif0 tif0Var2 : list) {
            int iM189184b3 = (tif0Var2.m189184b() * tif0Var2.m189183a()) - (tif0Var.m189184b() * tif0Var.m189183a());
            if (i == 0) {
                if (tif0Var2.m189184b() / f <= tif0Var2.m189183a()) {
                    if (Math.abs(iM189184b3) < iM189184b2) {
                        if (tif0Var2.m189184b() > tif0Var.m189184b() || tif0Var2.m189183a() <= tif0Var.m189183a()) {
                            iM189184b2 = Math.abs(iM189184b3);
                            iM189184b = tif0Var2.m189184b();
                            iM189183a = tif0Var2.m189183a();
                            int i4 = iM189183a;
                            i3 = iM189184b;
                            i2 = i4;
                        }
                    } else if (Math.abs(iM189184b3) != iM189184b2 && i3 < tif0Var2.m189184b()) {
                        iM189184b = tif0Var2.m189184b();
                        iM189183a = tif0Var2.m189183a();
                        int i5 = iM189183a;
                        i3 = iM189184b;
                        i2 = i5;
                    }
                }
            } else if (i != 1 || tif0Var2.m189183a() * f <= tif0Var2.m189184b()) {
                if (Math.abs(iM189184b3) < iM189184b2) {
                    if (tif0Var2.m189184b() > tif0Var.m189184b()) {
                    }
                    iM189184b2 = Math.abs(iM189184b3);
                    iM189184b = tif0Var2.m189184b();
                    iM189183a = tif0Var2.m189183a();
                    int i6 = iM189183a;
                    i3 = iM189184b;
                    i2 = i6;
                } else if (Math.abs(iM189184b3) != iM189184b2) {
                }
            }
        }
        if (i2 == 0 || i3 == 0) {
            return null;
        }
        return new tif0(i3, i2);
    }
}
