package p149l;

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
public class yn0 {

    /* JADX INFO: renamed from: b */
    private static yn0 f199132b;

    /* JADX INFO: renamed from: a */
    private C21445b f199133a = new C21445b();

    /* JADX INFO: renamed from: l.yn0$a */
    public class C21444a implements Comparator<Camera.Size> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f199134a;

        public C21444a(float f) {
            this.f199134a = f;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            float fAbs = Math.abs((size.width / size.height) - this.f199134a) - Math.abs((size2.width / size2.height) - this.f199134a);
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

    /* JADX INFO: renamed from: l.yn0$b */
    public class C21445b implements Comparator<Camera.Size> {
        public C21445b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            ixq0.m138887d("PREVIEW_SIZE", "compare:" + size.width + Constants.SEPARATOR_COMMA + size.height + "  " + size2.width + Constants.SEPARATOR_COMMA + size2.height);
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

    private yn0() {
    }

    /* JADX INFO: renamed from: a */
    public static int m215382a() {
        int numberOfCameras;
        try {
            numberOfCameras = Integer.parseInt(Build.VERSION.SDK) > 8 ? Camera.getNumberOfCameras() : 0;
        } catch (Throwable th) {
            RecordService.getInstance().recordException(th);
            ixq0.m138886c("findBackFacingCamera error: " + th.toString());
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
    public static int m215383b() {
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
                        ixq0.m138886c("findFrontFacingCamera error: " + th.toString());
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
                ixq0.m138886c("findFrontFacingCamera error: " + th3.toString());
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized yn0 m215384c() {
        yn0 yn0Var = f199132b;
        if (yn0Var != null) {
            return yn0Var;
        }
        yn0 yn0Var2 = new yn0();
        f199132b = yn0Var2;
        return yn0Var2;
    }

    /* JADX INFO: renamed from: d */
    public Camera.Size m215385d(List<Camera.Size> list, float f, int i) {
        Camera.Size next;
        int i2;
        if (list == null) {
            return null;
        }
        ixq0.m138885b("PREVIEW_SIZE", "th:" + f);
        Collections.sort(list, new C21444a(f));
        for (Camera.Size size : list) {
            ixq0.m138885b("PREVIEW_SIZE", "getPropPreviewSize:" + size.width + Constants.SEPARATOR_COMMA + size.height);
        }
        ixq0.m138885b("PREVIEW_SIZE", "------------------------------");
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
    public Camera.Size m215386e(List<Camera.Size> list, int i, int i2) {
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f199133a);
        for (Camera.Size size2 : list) {
            int i3 = size2.width;
            if (i3 >= i && size2.height >= i2) {
                ixq0.m138887d("PropPreviewSize", "w:" + size2.width + " h:" + size2.height);
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
