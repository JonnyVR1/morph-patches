package p149l;

import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class plh0 {

    /* JADX INFO: renamed from: a */
    public static final C19269a f150133a = new C19269a(WBConstants.SDK_NEW_PAY_VERSION, 1080);

    /* JADX INFO: renamed from: b */
    public static final C19269a f150134b = new C19269a(3820, 2160);

    /* JADX INFO: renamed from: l.plh0$a */
    public static class C19269a {

        /* JADX INFO: renamed from: a */
        public final Size f150135a;

        /* JADX INFO: renamed from: b */
        public final int f150136b;

        /* JADX INFO: renamed from: c */
        public final int f150137c;

        public C19269a(int i, int i2) {
            Size size = new Size(i, i2);
            this.f150135a = size;
            this.f150136b = Math.max(size.getWidth(), size.getHeight());
            this.f150137c = Math.min(size.getWidth(), size.getHeight());
        }

        /* JADX INFO: renamed from: a */
        public int m170197a() {
            return this.f150136b * this.f150137c;
        }

        /* JADX INFO: renamed from: b */
        public float m170198b() {
            return this.f150136b / (this.f150137c + 0.0f);
        }

        /* JADX INFO: renamed from: c */
        public boolean m170199c(C19269a c19269a) {
            return Math.abs(m170198b() - c19269a.m170198b()) <= 0.15f;
        }

        @NonNull
        public String toString() {
            return this.f150135a.toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m170185c(C19269a c19269a, C19269a c19269a2) {
        return c19269a2.m170197a() - c19269a.m170197a();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C19269a m170186d(Size size) {
        return new C19269a(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C19269a m170187e(Size size) {
        return new C19269a(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m170189g(C19269a c19269a, C19269a c19269a2) {
        return c19269a2.m170197a() - c19269a.m170197a();
    }

    /* JADX INFO: renamed from: i */
    public static C19269a m170191i(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return new C19269a(point.x, point.y);
    }

    /* JADX INFO: renamed from: j */
    public static Camera.Size m170192j(List<Camera.Size> list, int i, int i2) {
        double d = ((double) i) / ((double) i2);
        Camera.Size size = null;
        if (list == null) {
            return null;
        }
        double dAbs = Double.MAX_VALUE;
        double dAbs2 = Double.MAX_VALUE;
        for (Camera.Size size2 : list) {
            if (Math.abs((((double) size2.width) / ((double) size2.height)) - d) <= 0.1d && Math.abs(size2.height - i2) < dAbs2) {
                dAbs2 = Math.abs(size2.height - i2);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : list) {
                if (Math.abs(size3.height - i2) < dAbs) {
                    size = size3;
                    dAbs = Math.abs(size3.height - i2);
                }
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: k */
    public static <T> C19269a m170193k(Display display, CameraCharacteristics cameraCharacteristics, Class<T> cls) {
        final C19269a c19269aM170191i = m170191i(display);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (!StreamConfigurationMap.isOutputSupportedFor(cls) || streamConfigurationMap == null) {
            return f150133a;
        }
        ArrayList arrayList = new ArrayList(vwb.m200303Q(Arrays.asList(streamConfigurationMap.getOutputSizes(cls)), new w9j() { // from class: l.hlh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return plh0.m170187e((Size) obj);
            }
        }));
        arrayList.toString();
        Collections.sort(arrayList, new Comparator() { // from class: l.ilh0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return plh0.m170185c((plh0.C19269a) obj, (plh0.C19269a) obj2);
            }
        });
        C19269a c19269a = (C19269a) vwb.m200346r(arrayList, new w9j() { // from class: l.jlh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                plh0.C19269a c19269a2 = c19269aM170191i;
                plh0.C19269a c19269a3 = (plh0.C19269a) obj;
                return Boolean.valueOf(c19269a3.f150136b <= c19269a2.f150136b && c19269a3.f150137c <= c19269a2.f150137c && c19269a3.m170199c(c19269a2));
            }
        });
        if (c19269a == null) {
            c19269a = (C19269a) vwb.m200346r(arrayList, new w9j() { // from class: l.klh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    plh0.C19269a c19269a2 = c19269aM170191i;
                    plh0.C19269a c19269a3 = (plh0.C19269a) obj;
                    return Boolean.valueOf(c19269a3.f150136b <= c19269a2.f150136b && c19269a3.f150137c <= c19269a2.f150137c);
                }
            });
        }
        if (c19269a == null) {
            return f150133a;
        }
        c19269a.toString();
        return c19269a;
    }

    /* JADX INFO: renamed from: l */
    public static <T> C19269a m170194l(CameraCharacteristics cameraCharacteristics, final C19269a c19269a) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (StreamConfigurationMap.isOutputSupportedFor(MediaRecorder.class) && streamConfigurationMap != null) {
            ArrayList arrayList = new ArrayList(vwb.m200303Q(Arrays.asList(streamConfigurationMap.getOutputSizes(MediaRecorder.class)), new w9j() { // from class: l.llh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return plh0.m170186d((Size) obj);
                }
            }));
            arrayList.toString();
            Collections.sort(arrayList, new Comparator() { // from class: l.mlh0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return plh0.m170189g((plh0.C19269a) obj, (plh0.C19269a) obj2);
                }
            });
            C19269a c19269a2 = (C19269a) vwb.m200346r(arrayList, new w9j() { // from class: l.nlh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    plh0.C19269a c19269a3 = c19269a;
                    plh0.C19269a c19269a4 = (plh0.C19269a) obj;
                    return Boolean.valueOf(c19269a4.f150136b <= c19269a3.f150136b && c19269a4.f150137c <= c19269a3.f150137c && c19269a4.m170199c(c19269a3));
                }
            });
            if (c19269a2 == null) {
                c19269a2 = (C19269a) vwb.m200346r(arrayList, new w9j() { // from class: l.olh0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        plh0.C19269a c19269a3 = c19269a;
                        plh0.C19269a c19269a4 = (plh0.C19269a) obj;
                        return Boolean.valueOf(c19269a4.f150136b <= c19269a3.f150136b && c19269a4.f150137c <= c19269a3.f150137c);
                    }
                });
            }
            if (c19269a2 != null) {
                c19269a2.toString();
                return c19269a2;
            }
        }
        return c19269a;
    }

    /* JADX INFO: renamed from: m */
    public static int m170195m(WindowManager windowManager, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = windowManager.getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        return i3 == 1 ? (i4 + i2) % 360 : ((i4 - i2) + 360) % 360;
    }

    /* JADX INFO: renamed from: n */
    public static int m170196n(WindowManager windowManager, int i, Camera camera) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = windowManager.getDefaultDisplay().getRotation();
        int i2 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = 180;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        int i5 = i3 == 1 ? (360 - ((i4 + i2) % 360)) % 360 : ((i4 - i2) + 360) % 360;
        camera.setDisplayOrientation(i5);
        return i5;
    }
}
