package p149l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class djd0 {
    /* JADX INFO: renamed from: b */
    public final String m112024b(Object obj) {
        try {
            return m112025c(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName().concat(".errorRendering");
        } catch (Throwable th) {
            f5f.m119491e(th);
            return obj.getClass().getName().concat(".errorRendering");
        }
    }

    /* JADX INFO: renamed from: c */
    public String m112025c(Object obj) throws InterruptedException {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m112023a(Throwable th) {
    }
}
