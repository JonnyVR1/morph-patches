package p149l;

/* JADX INFO: loaded from: classes.dex */
public abstract class wig0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f186539a;

    public wig0(String str) {
        this.f186539a = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo171018a();

    /* JADX INFO: renamed from: b */
    public abstract void mo171019b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f186539a);
        try {
            mo171018a();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } finally {
            Thread.currentThread().setName(name);
            mo171019b();
        }
    }
}
