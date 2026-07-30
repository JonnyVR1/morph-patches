package p153l;

import com.jiechic.library.android.snappy.SnappyNative;

/* JADX INFO: loaded from: classes7.dex */
public class vsf0 {

    /* JADX INFO: renamed from: a */
    private static boolean f185603a = false;

    /* JADX INFO: renamed from: b */
    private static volatile SnappyNative f185604b;

    /* JADX INFO: renamed from: a */
    private static synchronized void m202610a() {
        if (!f185603a) {
            System.loadLibrary("snappy-android");
            f185603a = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized SnappyNative m202611b() {
        if (f185604b != null) {
            return f185604b;
        }
        m202610a();
        m202612c(new SnappyNative());
        return f185604b;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m202612c(SnappyNative snappyNative) {
        f185604b = snappyNative;
    }
}
