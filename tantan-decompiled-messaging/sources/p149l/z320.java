package p149l;

/* JADX INFO: loaded from: classes8.dex */
public class z320 implements Runnable {

    /* JADX INFO: renamed from: a */
    public Runnable f201300a;

    /* JADX INFO: renamed from: b */
    public String f201301b;

    /* JADX INFO: renamed from: c */
    public long f201302c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    public long f201303d;

    public z320(Runnable runnable) {
        this.f201300a = runnable;
        this.f201301b = runnable.toString();
    }

    /* JADX INFO: renamed from: a */
    public long m217011a() {
        return this.f201303d;
    }

    /* JADX INFO: renamed from: b */
    public void m217012b(long j) {
        this.f201303d = j;
    }

    public long getAddedTime() {
        return this.f201302c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f201300a.run();
    }
}
