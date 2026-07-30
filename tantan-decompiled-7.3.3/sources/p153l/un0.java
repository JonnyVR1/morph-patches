package p153l;

import android.hardware.Camera;
import android.os.Build;
import com.clevertap.android.sdk.Constants;
import com.idv.identity.platform.log.RecordLevel;
import com.idv.identity.platform.log.RecordService;
import com.momo.mcamera.util.MDLogTag;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class un0 {

    /* JADX INFO: renamed from: b */
    private static un0 f179688b;

    /* JADX INFO: renamed from: a */
    private C20601b f179689a = new C20601b();

    /* JADX INFO: renamed from: l.un0$a */
    public class C20600a implements Comparator<Camera.Size> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f179690a;

        public C20600a(float f) {
            this.f179690a = f;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            float fAbs = Math.abs((size.width / size.height) - this.f179690a) - Math.abs((size2.width / size2.height) - this.f179690a);
            int i = size.width > size2.width ? -1 : 1;
            if (Math.abs(fAbs) < 0.01d) {
                return i;
            }
            if (fAbs < 0.0f) {
                return -1;
            }
            return fAbs > 0.0f ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: l.un0$b */
    public class C20601b implements Comparator<Camera.Size> {
        public C20601b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            o6r0.m166284d("PREVIEW_SIZE", "compare:" + size.width + Constants.SEPARATOR_COMMA + size.height + "  " + size2.width + Constants.SEPARATOR_COMMA + size2.height);
            int i = size.width;
            int i2 = size.height;
            int i3 = size2.width;
            if (i == i2) {
                if (i3 != size2.height) {
                    return 1;
                }
                return i - i3;
            }
            int i4 = size2.height;
            if (i3 == i4) {
                return -1;
            }
            if (i == i3) {
                return i2 - i4;
            }
            return i > i3 ? 1 : -1;
        }
    }

    private un0() {
    }

    /* JADX INFO: renamed from: a */
    public static int m196815a() {
        int numberOfCameras;
        try {
            numberOfCameras = Integer.parseInt(Build.VERSION.SDK) > 8 ? Camera.getNumberOfCameras() : 0;
        } catch (Throwable th) {
            RecordService.getInstance().recordException(th);
            o6r0.m166283c("findBackFacingCamera error: " + th.toString());
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_DEBUG, MDLogTag.MOMENT_CAMERA_TAG, "findBackFacingCamera", "numberOfCameras", numberOfCameras + "");
        for (int i = 0; i < numberOfCameras; i++) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i;
                }
            } catch (Throwable th2) {
                RecordService.getInstance().recordException(th2);
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m196816b() {
        int numberOfCameras;
        try {
            if (Integer.parseInt(Build.VERSION.SDK) > 8) {
                numberOfCameras = Camera.getNumberOfCameras();
                if (numberOfCameras == 0) {
                    try {
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "noCamera", new String[0]);
                    } catch (Throwable th) {
                        th = th;
                        RecordService.getInstance().recordException(th);
                        o6r0.m166283c("findFrontFacingCamera error: " + th.toString());
                    }
                }
            } else {
                numberOfCameras = 0;
            }
        } catch (Throwable th2) {
            th = th2;
            numberOfCameras = 0;
        }
        for (int i = 0; i < numberOfCameras; i++) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return i;
                }
            } catch (Throwable th3) {
                RecordService.getInstance().recordException(th3);
                o6r0.m166283c("findFrontFacingCamera error: " + th3.toString());
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized un0 m196817c() {
        un0 un0Var = f179688b;
        if (un0Var != null) {
            return un0Var;
        }
        un0 un0Var2 = new un0();
        f179688b = un0Var2;
        return un0Var2;
    }

    /* JADX INFO: renamed from: d */
    public Camera.Size m196818d(List<Camera.Size> list, float f, int i) {
        Camera.Size next;
        int i2;
        if (list == null) {
            return null;
        }
        o6r0.m166282b("PREVIEW_SIZE", "th:" + f);
        Collections.sort(list, new C20600a(f));
        for (Camera.Size size : list) {
            o6r0.m166282b("PREVIEW_SIZE", "getPropPreviewSize:" + size.width + Constants.SEPARATOR_COMMA + size.height);
        }
        o6r0.m166282b("PREVIEW_SIZE", "------------------------------");
        Iterator<Camera.Size> it = list.iterator();
        int size2 = 0;
        while (it.hasNext() && (i2 = (next = it.next()).height) < i) {
            if (next.width == i2) {
                size2 = -1;
                break;
            }
            size2++;
        }
        if (size2 == list.size()) {
            size2 = list.size() - 1;
        }
        return list.get(size2);
    }

    /* JADX INFO: renamed from: e */
    public Camera.Size m196819e(List<Camera.Size> list, int i, int i2) {
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f179689a);
        for (Camera.Size size2 : list) {
            int i3 = size2.width;
            if (i3 >= i && size2.height >= i2) {
                o6r0.m166284d("PropPreviewSize", "w:" + size2.width + " h:" + size2.height);
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "PropPreviewSize", "Width:", "" + size2.width, " Height:", "" + size2.height);
                return size2;
            }
            if (size2.height != i3) {
                size = size2;
            }
        }
        return size;
    }
}
