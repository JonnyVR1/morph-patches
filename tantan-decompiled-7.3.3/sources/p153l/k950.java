package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class k950 extends xrf {
    /* JADX INFO: renamed from: a */
    public static boolean m148863a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m148864b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
