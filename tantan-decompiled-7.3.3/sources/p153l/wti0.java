package p153l;

import android.app.Activity;
import com.immomo.baseutil.Rotation;

/* JADX INFO: loaded from: classes7.dex */
public class wti0 {

    /* JADX INFO: renamed from: a */
    public static final float[] f190785a = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: b */
    public static final float[] f190786b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: c */
    public static final float[] f190787c = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: d */
    public static final float[] f190788d = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: l.wti0$a */
    public static /* synthetic */ class C21177a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f190789a;

        static {
            int[] iArr = new int[Rotation.values().length];
            f190789a = iArr;
            try {
                iArr[Rotation.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f190789a[Rotation.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f190789a[Rotation.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f190789a[Rotation.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static float m207890a(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public static float[] m207891b(Rotation rotation, boolean z, boolean z2) {
        float[] fArr;
        int i = C21177a.f190789a[rotation.ordinal()];
        if (i == 1) {
            fArr = f190786b;
        } else if (i != 2) {
            fArr = i != 3 ? f190785a : f190788d;
        } else {
            fArr = f190787c;
        }
        if (z) {
            fArr = new float[]{m207890a(fArr[0]), fArr[1], m207890a(fArr[2]), fArr[3], m207890a(fArr[4]), fArr[5], m207890a(fArr[6]), fArr[7]};
        }
        return z2 ? new float[]{fArr[0], m207890a(fArr[1]), fArr[2], m207890a(fArr[3]), fArr[4], m207890a(fArr[5]), fArr[6], m207890a(fArr[7])} : fArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m207892c(Activity activity) {
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
