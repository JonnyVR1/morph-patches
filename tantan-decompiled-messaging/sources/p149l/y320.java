package p149l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y320 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f195742a;

    public y320(String str, Object... objArr) {
        this.f195742a = tck0.m188016q(str, objArr);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo96078k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f195742a);
        try {
            mo96078k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
