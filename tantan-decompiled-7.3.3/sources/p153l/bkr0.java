package p153l;

import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes6.dex */
@NullMarked
public final class bkr0 {
    /* JADX INFO: renamed from: a */
    public static Object[] m104843a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                psw0.m173697a(i2);
                return null;
            }
        }
        return objArr;
    }
}
