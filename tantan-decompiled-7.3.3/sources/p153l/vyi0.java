package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class vyi0 {
    /* JADX INFO: renamed from: a */
    public static RuntimeException m203997a(Throwable th) throws Throwable {
        m203999c((Throwable) wn80.m207182g(th));
        throw new RuntimeException(th);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    /* JADX INFO: renamed from: b */
    public static <X extends Throwable> void m203998b(Throwable th, Class<X> cls) throws Throwable {
        if (th != null && cls.isInstance(th)) {
            throw cls.cast(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m203999c(Throwable th) throws Throwable {
        m203998b(th, Error.class);
        m203998b(th, RuntimeException.class);
    }
}
