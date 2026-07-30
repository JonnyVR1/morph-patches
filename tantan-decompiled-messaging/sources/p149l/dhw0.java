package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class dhw0 {
    /* JADX INFO: renamed from: a */
    public static int m111842a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: b */
    public static int m111843b(Object obj) {
        return m111842a(obj == null ? 0 : obj.hashCode());
    }
}
