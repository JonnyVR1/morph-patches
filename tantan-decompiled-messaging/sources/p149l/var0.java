package p149l;

import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes6.dex */
@NullMarked
public final class var0 {
    /* JADX INFO: renamed from: a */
    public static Object[] m197648a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                jjw0.m141817a(i2);
                return null;
            }
        }
        return objArr;
    }
}
