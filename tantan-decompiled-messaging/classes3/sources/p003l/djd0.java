package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class djd0 {
    /* JADX INFO: renamed from: b */
    public final String m3589b(Object obj) {
        try {
            return m3590c(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName().concat(".errorRendering");
        } catch (Throwable th) {
            f5f.m3964e(th);
            return obj.getClass().getName().concat(".errorRendering");
        }
    }

    /* JADX INFO: renamed from: c */
    public String m3590c(Object obj) throws InterruptedException {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m3588a(Throwable th) {
    }
}
