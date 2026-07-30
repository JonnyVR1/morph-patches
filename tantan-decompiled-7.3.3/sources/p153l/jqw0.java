package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class jqw0 {
    /* JADX INFO: renamed from: a */
    public static int m146640a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: b */
    public static int m146641b(Object obj) {
        return m146640a(obj == null ? 0 : obj.hashCode());
    }
}
