package p149l;

/* JADX INFO: loaded from: classes.dex */
public final class spi0 {
    /* JADX INFO: renamed from: a */
    public static RuntimeException m185369a(Throwable th) throws Throwable {
        m185371c((Throwable) rf80.m179116g(th));
        throw new RuntimeException(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    /* JADX INFO: renamed from: b */
    public static <X extends Throwable> void m185370b(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m185371c(Throwable th) throws Throwable {
        m185370b(th, Error.class);
        m185370b(th, RuntimeException.class);
    }
}
