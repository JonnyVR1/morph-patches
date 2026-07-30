package p149l;

import android.app.Activity;
import com.immomo.baseutil.Rotation;

/* JADX INFO: loaded from: classes7.dex */
public class wki0 {

    /* JADX INFO: renamed from: a */
    public static final float[] f186772a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: b */
    public static final float[] f186773b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: c */
    public static final float[] f186774c = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d */
    public static final float[] f186775d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: l.wki0$a */
    public static /* synthetic */ class C20884a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f186776a;

        static {
            int[] iArr = new int[Rotation.values().length];
            f186776a = iArr;
            try {
                iArr[Rotation.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f186776a[Rotation.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f186776a[Rotation.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f186776a[Rotation.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static float m203671a(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public static float[] m203672b(Rotation rotation, boolean z, boolean z2) {
        float[] fArr;
        int i = C20884a.f186776a[rotation.ordinal()];
        if (i == 1) {
            fArr = f186773b;
        } else if (i != 2) {
            fArr = i != 3 ? f186772a : f186775d;
        } else {
            fArr = f186774c;
        }
        if (z) {
            fArr = new float[]{m203671a(fArr[0]), fArr[1], m203671a(fArr[2]), fArr[3], m203671a(fArr[4]), fArr[5], m203671a(fArr[6]), fArr[7]};
        }
        return z2 ? new float[]{fArr[0], m203671a(fArr[1]), fArr[2], m203671a(fArr[3]), fArr[4], m203671a(fArr[5]), fArr[6], m203671a(fArr[7])} : fArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m203673c(Activity activity) {
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
