package p149l;

/* JADX INFO: loaded from: classes.dex */
public class bwk {
    /* JADX INFO: renamed from: a */
    public static int m104157a(int i, int i2) {
        return ((i + 31) * 31) + i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m104158b(Object obj, Object obj2) {
        return m104157a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }
}
