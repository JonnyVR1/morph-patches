package p007l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class z320 implements Runnable {

    /* JADX INFO: renamed from: a */
    public Runnable f5479a;

    /* JADX INFO: renamed from: b */
    public String f5480b;

    /* JADX INFO: renamed from: c */
    public long f5481c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    public long f5482d;

    public z320(Runnable runnable) {
        this.f5479a = runnable;
        this.f5480b = runnable.toString();
    }

    /* JADX INFO: renamed from: a */
    public long m11964a() {
        return this.f5482d;
    }

    /* JADX INFO: renamed from: b */
    public void m11965b(long j) {
        this.f5482d = j;
    }

    public long getAddedTime() {
        return this.f5481c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5479a.run();
    }
}
