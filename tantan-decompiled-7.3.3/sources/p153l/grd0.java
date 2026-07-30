package p153l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class grd0 {
    /* JADX INFO: renamed from: b */
    public final String m131784b(Object obj) {
        try {
            return m131785c(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName().concat(".errorRendering");
        } catch (Throwable th) {
            j6f.m143663e(th);
            return obj.getClass().getName().concat(".errorRendering");
        }
    }

    /* JADX INFO: renamed from: c */
    public String m131785c(Object obj) throws InterruptedException {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m131783a(Throwable th) {
    }
}
