package p153l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gc20 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final String f103517a;

    public gc20(String str, Object... objArr) {
        this.f103517a = zlk0.m220255q(str, objArr);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo117004k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f103517a);
        try {
            mo117004k();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
