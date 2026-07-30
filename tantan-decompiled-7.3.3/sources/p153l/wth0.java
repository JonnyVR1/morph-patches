package p153l;

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
public class wth0 {

    /* JADX INFO: renamed from: a */
    public static final C21176a f190779a = new C21176a(WBConstants.SDK_NEW_PAY_VERSION, 1080);

    /* JADX INFO: renamed from: b */
    public static final C21176a f190780b = new C21176a(3820, 2160);

    /* JADX INFO: renamed from: l.wth0$a */
    public static class C21176a {

        /* JADX INFO: renamed from: a */
        public final Size f190781a;

        /* JADX INFO: renamed from: b */
        public final int f190782b;

        /* JADX INFO: renamed from: c */
        public final int f190783c;

        public C21176a(int i, int i2) {
            Size size = new Size(i, i2);
            this.f190781a = size;
            this.f190782b = Math.max(size.getWidth(), size.getHeight());
            this.f190783c = Math.min(size.getWidth(), size.getHeight());
        }

        /* JADX INFO: renamed from: a */
        public int m207887a() {
            return this.f190782b * this.f190783c;
        }

        /* JADX INFO: renamed from: b */
        public float m207888b() {
            return this.f190782b / (this.f190783c + 0.0f);
        }

        /* JADX INFO: renamed from: c */
        public boolean m207889c(C21176a c21176a) {
            return Math.abs(m207888b() - c21176a.m207888b()) <= 0.15f;
        }

        @NonNull
        public String toString() {
            return this.f190781a.toString();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m207875c(C21176a c21176a, C21176a c21176a2) {
        return c21176a2.m207887a() - c21176a.m207887a();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C21176a m207876d(Size size) {
        return new C21176a(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C21176a m207877e(Size size) {
        return new C21176a(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m207879g(C21176a c21176a, C21176a c21176a2) {
        return c21176a2.m207887a() - c21176a.m207887a();
    }

    /* JADX INFO: renamed from: i */
    public static C21176a m207881i(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return new C21176a(point.x, point.y);
    }

    /* JADX INFO: renamed from: j */
    public static Camera.Size m207882j(List<Camera.Size> list, int i, int i2) {
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
    public static <T> C21176a m207883k(Display display, CameraCharacteristics cameraCharacteristics, Class<T> cls) {
        final C21176a c21176aM207881i = m207881i(display);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (!StreamConfigurationMap.isOutputSupportedFor(cls) || streamConfigurationMap == null) {
            return f190779a;
        }
        ArrayList arrayList = new ArrayList(jyb.m147486Q(Arrays.asList(streamConfigurationMap.getOutputSizes(cls)), new qcj() { // from class: l.oth0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wth0.m207877e((Size) obj);
            }
        }));
        arrayList.toString();
        Collections.sort(arrayList, new Comparator() { // from class: l.pth0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return wth0.m207875c((wth0.C21176a) obj, (wth0.C21176a) obj2);
            }
        });
        C21176a c21176a = (C21176a) jyb.m147529r(arrayList, new qcj() { // from class: l.qth0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                wth0.C21176a c21176a2 = c21176aM207881i;
                wth0.C21176a c21176a3 = (wth0.C21176a) obj;
                return Boolean.valueOf(c21176a3.f190782b <= c21176a2.f190782b && c21176a3.f190783c <= c21176a2.f190783c && c21176a3.m207889c(c21176a2));
            }
        });
        if (c21176a == null) {
            c21176a = (C21176a) jyb.m147529r(arrayList, new qcj() { // from class: l.rth0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    wth0.C21176a c21176a2 = c21176aM207881i;
                    wth0.C21176a c21176a3 = (wth0.C21176a) obj;
                    return Boolean.valueOf(c21176a3.f190782b <= c21176a2.f190782b && c21176a3.f190783c <= c21176a2.f190783c);
                }
            });
        }
        if (c21176a == null) {
            return f190779a;
        }
        c21176a.toString();
        return c21176a;
    }

    /* JADX INFO: renamed from: l */
    public static <T> C21176a m207884l(CameraCharacteristics cameraCharacteristics, final C21176a c21176a) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (StreamConfigurationMap.isOutputSupportedFor(MediaRecorder.class) && streamConfigurationMap != null) {
            ArrayList arrayList = new ArrayList(jyb.m147486Q(Arrays.asList(streamConfigurationMap.getOutputSizes(MediaRecorder.class)), new qcj() { // from class: l.sth0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return wth0.m207876d((Size) obj);
                }
            }));
            arrayList.toString();
            Collections.sort(arrayList, new Comparator() { // from class: l.tth0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return wth0.m207879g((wth0.C21176a) obj, (wth0.C21176a) obj2);
                }
            });
            C21176a c21176a2 = (C21176a) jyb.m147529r(arrayList, new qcj() { // from class: l.uth0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    wth0.C21176a c21176a3 = c21176a;
                    wth0.C21176a c21176a4 = (wth0.C21176a) obj;
                    return Boolean.valueOf(c21176a4.f190782b <= c21176a3.f190782b && c21176a4.f190783c <= c21176a3.f190783c && c21176a4.m207889c(c21176a3));
                }
            });
            if (c21176a2 == null) {
                c21176a2 = (C21176a) jyb.m147529r(arrayList, new qcj() { // from class: l.vth0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        wth0.C21176a c21176a3 = c21176a;
                        wth0.C21176a c21176a4 = (wth0.C21176a) obj;
                        return Boolean.valueOf(c21176a4.f190782b <= c21176a3.f190782b && c21176a4.f190783c <= c21176a3.f190783c);
                    }
                });
            }
            if (c21176a2 != null) {
                c21176a2.toString();
                return c21176a2;
            }
        }
        return c21176a;
    }

    /* JADX INFO: renamed from: m */
    public static int m207885m(WindowManager windowManager, int i) {
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
    public static int m207886n(WindowManager windowManager, int i, Camera camera) {
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
