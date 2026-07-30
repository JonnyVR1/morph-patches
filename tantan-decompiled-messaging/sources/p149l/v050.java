package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class v050 extends qqf {
    /* JADX INFO: renamed from: a */
    public static boolean m196470a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m196471b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
