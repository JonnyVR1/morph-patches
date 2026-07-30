package p153l;

import android.hardware.Camera;
import android.os.Build;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class t94 {

    /* JADX INFO: renamed from: a */
    public static int f172606a = 30000;

    /* JADX INFO: renamed from: b */
    private static int[] f172607b = {17, 842094169};

    /* JADX INFO: renamed from: l.t94$a */
    public class C20260a implements Comparator<int[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            int iAbs = Math.abs(iArr[0] - t94.f172606a) + Math.abs(iArr[1] - t94.f172606a);
            int iAbs2 = Math.abs(iArr2[0] - t94.f172606a) + Math.abs(iArr2[1] - t94.f172606a);
            if (iAbs > iAbs2) {
                return 1;
            }
            return iAbs < iAbs2 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: l.t94$b */
    public class C20261b implements Comparator<Camera.Size> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return size.width * size.height > size2.width * size2.height ? 1 : -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m189728a(Camera camera, sow sowVar) {
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
        parameters.setPreviewSize(sowVar.f169955b, sowVar.f169957c);
        parameters.setPreviewFpsRange(sowVar.f169934H, sowVar.f169933G);
        parameters.setPreviewFrameRate(sowVar.f169979s);
        if (sowVar.f169954a0) {
            parameters.setRecordingHint(true);
            MDLog.m7445e("lqdebug", "lqdebug setRecordingHint true");
        }
        try {
            camera.setParameters(parameters);
            return true;
        } catch (Exception e) {
            MDLog.m7445e("CameraHelper", e.getMessage());
            camera.release();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m189729b(int i, int i2) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i2, cameraInfo);
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        return i3 == 1 ? (360 - ((i4 + i) % 360)) % 360 : ((i4 - i) + 360) % 360;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m189730c(Camera.Parameters parameters, sow sowVar) {
        LinkedList linkedList = new LinkedList();
        List<Integer> supportedPreviewFormats = parameters.getSupportedPreviewFormats();
        for (int i : f172607b) {
            if (supportedPreviewFormats.contains(Integer.valueOf(i))) {
                linkedList.add(Integer.valueOf(i));
            }
        }
        sowVar.f169984x = 17;
        if (linkedList.contains(17)) {
            sowVar.f169984x = 17;
            return true;
        }
        sowVar.f169984x = 842094169;
        if (linkedList.contains(842094169)) {
            sowVar.f169984x = 842094169;
            return true;
        }
        MDLog.m7445e("CameraHelper", "!!!!!!!!!!!UnSupport,previewColorFormat");
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m189731d(Camera.Parameters parameters, sow sowVar) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        f172606a = sowVar.f169979s * 1000;
        Collections.sort(supportedPreviewFpsRange, new C20260a());
        int i = 0;
        while (i < supportedPreviewFpsRange.size()) {
            if (!sowVar.f169951Y) {
                if (supportedPreviewFpsRange.get(i)[0] != supportedPreviewFpsRange.get(i)[1]) {
                    break;
                } else {
                    i++;
                }
            } else {
                int iAbs = Math.abs(supportedPreviewFpsRange.get(i)[0] - f172606a) + Math.abs(supportedPreviewFpsRange.get(i)[1] - f172606a);
                if (supportedPreviewFpsRange.get(i)[0] >= f172606a && iAbs <= sowVar.f169952Z * 1000) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i >= supportedPreviewFpsRange.size()) {
            i = 0;
        }
        sowVar.f169934H = supportedPreviewFpsRange.get(i)[0];
        sowVar.f169933G = supportedPreviewFpsRange.get(i)[1];
        sowVar.f169950X = supportedPreviewFpsRange;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0056 A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static void m189732e(Camera.Parameters parameters, sow sowVar, crf0 crf0Var) {
        int i;
        int i2;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        Collections.sort(supportedPreviewSizes, new C20261b());
        sowVar.f169956b0.clear();
        for (Camera.Size size : supportedPreviewSizes) {
            sowVar.f169956b0.add(size);
            MDLog.m7443d(MDLogTag.MOMENT_CAMERA_TAG, "width = " + size.width + " height = " + size.height);
        }
        int iM112050b = crf0Var.m112050b() * crf0Var.m112049a();
        int i3 = 0;
        int i4 = 0;
        for (Camera.Size size2 : supportedPreviewSizes) {
            int i5 = size2.width;
            if (i5 != 0 && (i = size2.height) != 0) {
                int iM112050b2 = (i5 * i) - (crf0Var.m112050b() * crf0Var.m112049a());
                float f = size2.width / size2.height;
                float fM112050b = crf0Var.m112050b() / crf0Var.m112049a();
                if (Math.abs(f - fM112050b) <= ((double) fM112050b) * 0.3d) {
                    int i6 = sowVar.f169937K;
                    if (i6 == 0) {
                        if (size2.width / sowVar.f169938L > size2.height) {
                            continue;
                        } else if (Math.abs(iM112050b2) >= iM112050b) {
                            if (Math.abs(iM112050b2) != iM112050b) {
                                continue;
                            } else if (size2.height != crf0Var.m112049a() && size2.width == crf0Var.m112050b()) {
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
                        } else if (size2.width > crf0Var.m112050b() || size2.height <= crf0Var.m112049a()) {
                            iM112050b = Math.abs(iM112050b2);
                            i3 = size2.width;
                            i4 = size2.height;
                            if (i4 == crf0Var.m112049a() && i3 == crf0Var.m112050b()) {
                                break;
                            }
                        }
                    } else if (i6 != 1 || size2.height * sowVar.f169938L <= size2.width) {
                        if (Math.abs(iM112050b2) >= iM112050b) {
                            if (size2.width > crf0Var.m112050b()) {
                            }
                            iM112050b = Math.abs(iM112050b2);
                            i3 = size2.width;
                            i4 = size2.height;
                            if (i4 == crf0Var.m112049a()) {
                                continue;
                            }
                        } else if (Math.abs(iM112050b2) != iM112050b) {
                            continue;
                        } else {
                            if (size2.height != crf0Var.m112049a()) {
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
            sowVar.f169955b = i3;
            sowVar.f169957c = i4;
        }
        MDLog.m7445e("CameraHelper", "targetWidth = " + crf0Var.m112050b() + " targetHeight = " + crf0Var.m112049a() + " preferWidth = " + i3 + " preferHeight = " + i4);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x005d A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static crf0 m189733f(List<crf0> list, crf0 crf0Var, int i, float f) {
        int iM112050b;
        int iM112049a;
        if (list == null) {
            return null;
        }
        int iM112050b2 = crf0Var.m112050b() * crf0Var.m112049a();
        int i2 = 0;
        int i3 = 0;
        for (crf0 crf0Var2 : list) {
            int iM112050b3 = (crf0Var2.m112050b() * crf0Var2.m112049a()) - (crf0Var.m112050b() * crf0Var.m112049a());
            if (i == 0) {
                if (crf0Var2.m112050b() / f <= crf0Var2.m112049a()) {
                    if (Math.abs(iM112050b3) < iM112050b2) {
                        if (crf0Var2.m112050b() > crf0Var.m112050b() || crf0Var2.m112049a() <= crf0Var.m112049a()) {
                            iM112050b2 = Math.abs(iM112050b3);
                            iM112050b = crf0Var2.m112050b();
                            iM112049a = crf0Var2.m112049a();
                            int i4 = iM112049a;
                            i3 = iM112050b;
                            i2 = i4;
                        }
                    } else if (Math.abs(iM112050b3) != iM112050b2 && i3 < crf0Var2.m112050b()) {
                        iM112050b = crf0Var2.m112050b();
                        iM112049a = crf0Var2.m112049a();
                        int i5 = iM112049a;
                        i3 = iM112050b;
                        i2 = i5;
                    }
                }
            } else if (i != 1 || crf0Var2.m112049a() * f <= crf0Var2.m112050b()) {
                if (Math.abs(iM112050b3) < iM112050b2) {
                    if (crf0Var2.m112050b() > crf0Var.m112050b()) {
                    }
                    iM112050b2 = Math.abs(iM112050b3);
                    iM112050b = crf0Var2.m112050b();
                    iM112049a = crf0Var2.m112049a();
                    int i6 = iM112049a;
                    i3 = iM112050b;
                    i2 = i6;
                } else if (Math.abs(iM112050b3) != iM112050b2) {
                }
            }
        }
        if (i2 == 0 || i3 == 0) {
            return null;
        }
        return new crf0(i3, i2);
    }
}
