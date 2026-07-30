package p006l;

import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class plh0 {

    /* JADX INFO: renamed from: a */
    public static final C1139a f19187a = new C1139a(1920, 1080);

    /* JADX INFO: renamed from: b */
    public static final C1139a f19188b = new C1139a(3820, 2160);

    /* JADX INFO: renamed from: l.plh0$a */
    public static class C1139a {

        /* JADX INFO: renamed from: a */
        public final Size f19189a;

        /* JADX INFO: renamed from: b */
        public final int f19190b;

        /* JADX INFO: renamed from: c */
        public final int f19191c;

        public C1139a(int i, int i2) {
            Size size = new Size(i, i2);
            this.f19189a = size;
            this.f19190b = Math.max(size.getWidth(), size.getHeight());
            this.f19191c = Math.min(size.getWidth(), size.getHeight());
        }

        /* JADX INFO: renamed from: a */
        public int m21588a() {
            return this.f19190b * this.f19191c;
        }

        /* JADX INFO: renamed from: b */
        public float m21589b() {
            return this.f19190b / (this.f19191c + 0.0f);
        }

        /* JADX INFO: renamed from: c */
        public boolean m21590c(C1139a c1139a) {
            return Math.abs(m21589b() - c1139a.m21589b()) <= 0.15f;
        }

        @NonNull
        public String toString() {
            return this.f19189a.toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m21576c(C1139a c1139a, C1139a c1139a2) {
        return c1139a2.m21588a() - c1139a.m21588a();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C1139a m21577d(Size size) {
        return new C1139a(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C1139a m21578e(Size size) {
        return new C1139a(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m21580g(C1139a c1139a, C1139a c1139a2) {
        return c1139a2.m21588a() - c1139a.m21588a();
    }

    /* JADX INFO: renamed from: i */
    public static C1139a m21582i(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return new C1139a(point.x, point.y);
    }

    /* JADX INFO: renamed from: j */
    public static Camera.Size m21583j(List<Camera.Size> list, int i, int i2) {
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
    public static <T> C1139a m21584k(Display display, CameraCharacteristics cameraCharacteristics, Class<T> cls) {
        final C1139a c1139aM21582i = m21582i(display);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (!StreamConfigurationMap.isOutputSupportedFor(cls) || streamConfigurationMap == null) {
            return f19187a;
        }
        ArrayList arrayList = new ArrayList(vwb.Q(Arrays.asList(streamConfigurationMap.getOutputSizes(cls)), new w9j() { // from class: l.hlh0
            public final Object call(Object obj) {
                return plh0.m21578e((Size) obj);
            }
        }));
        arrayList.toString();
        Collections.sort(arrayList, new Comparator() { // from class: l.ilh0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return plh0.m21576c((plh0.C1139a) obj, (plh0.C1139a) obj2);
            }
        });
        C1139a c1139a = (C1139a) vwb.r(arrayList, new w9j() { // from class: l.jlh0
            public final Object call(Object obj) {
                plh0.C1139a c1139a2 = c1139aM21582i;
                plh0.C1139a c1139a3 = (plh0.C1139a) obj;
                return Boolean.valueOf(c1139a3.f19190b <= c1139a2.f19190b && c1139a3.f19191c <= c1139a2.f19191c && c1139a3.m21590c(c1139a2));
            }
        });
        if (c1139a == null) {
            c1139a = (C1139a) vwb.r(arrayList, new w9j() { // from class: l.klh0
                public final Object call(Object obj) {
                    plh0.C1139a c1139a2 = c1139aM21582i;
                    plh0.C1139a c1139a3 = (plh0.C1139a) obj;
                    return Boolean.valueOf(c1139a3.f19190b <= c1139a2.f19190b && c1139a3.f19191c <= c1139a2.f19191c);
                }
            });
        }
        if (c1139a == null) {
            return f19187a;
        }
        c1139a.toString();
        return c1139a;
    }

    /* JADX INFO: renamed from: l */
    public static <T> C1139a m21585l(CameraCharacteristics cameraCharacteristics, final C1139a c1139a) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (StreamConfigurationMap.isOutputSupportedFor(MediaRecorder.class) && streamConfigurationMap != null) {
            ArrayList arrayList = new ArrayList(vwb.Q(Arrays.asList(streamConfigurationMap.getOutputSizes(MediaRecorder.class)), new w9j() { // from class: l.llh0
                public final Object call(Object obj) {
                    return plh0.m21577d((Size) obj);
                }
            }));
            arrayList.toString();
            Collections.sort(arrayList, new Comparator() { // from class: l.mlh0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return plh0.m21580g((plh0.C1139a) obj, (plh0.C1139a) obj2);
                }
            });
            C1139a c1139a2 = (C1139a) vwb.r(arrayList, new w9j() { // from class: l.nlh0
                public final Object call(Object obj) {
                    plh0.C1139a c1139a3 = c1139a;
                    plh0.C1139a c1139a4 = (plh0.C1139a) obj;
                    return Boolean.valueOf(c1139a4.f19190b <= c1139a3.f19190b && c1139a4.f19191c <= c1139a3.f19191c && c1139a4.m21590c(c1139a3));
                }
            });
            if (c1139a2 == null) {
                c1139a2 = (C1139a) vwb.r(arrayList, new w9j() { // from class: l.olh0
                    public final Object call(Object obj) {
                        plh0.C1139a c1139a3 = c1139a;
                        plh0.C1139a c1139a4 = (plh0.C1139a) obj;
                        return Boolean.valueOf(c1139a4.f19190b <= c1139a3.f19190b && c1139a4.f19191c <= c1139a3.f19191c);
                    }
                });
            }
            if (c1139a2 != null) {
                c1139a2.toString();
                return c1139a2;
            }
        }
        return c1139a;
    }

    /* JADX INFO: renamed from: m */
    public static int m21586m(WindowManager windowManager, int i) {
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
    public static int m21587n(WindowManager windowManager, int i, Camera camera) {
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
