package p153l;

/* JADX INFO: loaded from: classes.dex */
public class ryk {
    /* JADX INFO: renamed from: a */
    public static int m183610a(int i, int i2) {
        return ((i + 31) * 31) + i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m183611b(Object obj, Object obj2) {
        return m183610a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }
}
