package tv.danmaku.ijk.media.util;

import android.app.Activity;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CameraUtils {

    /* JADX INFO: renamed from: a */
    public static final List<String> f208892a;

    /* JADX INFO: renamed from: b */
    public static final List<String> f208893b;

    /* JADX INFO: renamed from: c */
    public static final List<String> f208894c;

    public static class Gravity {
    }

    static {
        ArrayList arrayList = new ArrayList();
        f208892a = arrayList;
        f208893b = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f208894c = arrayList2;
        arrayList.add("Nexus S");
        arrayList.add("SGH-T959");
        arrayList.add("HUAWEI C8812E");
        arrayList.add("HUAWEI U8825D");
        arrayList.add("HUAWEI C8825D");
        arrayList.add("GT-I9220");
        arrayList.add("GT-I9228");
        arrayList.add("SCH-I889");
        arrayList.add("GT-I9100");
        arrayList.add("GT-I9000");
        arrayList.add("HTC X315e");
        arrayList.add("GT-N7005");
        arrayList.add("Lenovo S899t");
        arrayList.add("KFTT");
        arrayList.add("HTC Sensation XE with Beats Audio Z715e");
        arrayList2.add("ZTE-T U880");
        arrayList2.add("MT680");
        arrayList2.add("Lenovo A668t");
    }

    /* JADX INFO: renamed from: a */
    public static int m222861a(Activity activity, int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int iM222862b = m222862b(activity);
        int i2 = cameraInfo.facing;
        int i3 = cameraInfo.orientation;
        return i2 == 1 ? (360 - ((i3 + iM222862b) % 360)) % 360 : ((i3 - iM222862b) + 360) % 360;
    }

    /* JADX INFO: renamed from: b */
    public static int m222862b(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }
}
