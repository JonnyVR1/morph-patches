package p153l;

/* JADX INFO: loaded from: classes.dex */
public abstract class erg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f95473a;

    public erg0(String str) {
        this.f95473a = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo122181a();

    /* JADX INFO: renamed from: b */
    public abstract void mo122182b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f95473a);
        try {
            mo122181a();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } finally {
            Thread.currentThread().setName(name);
            mo122182b();
        }
    }
}
