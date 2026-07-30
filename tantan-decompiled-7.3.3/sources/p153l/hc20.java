package p153l;

/* JADX INFO: loaded from: classes8.dex */
public class hc20 implements Runnable {

    /* JADX INFO: renamed from: a */
    public Runnable f108668a;

    /* JADX INFO: renamed from: b */
    public String f108669b;

    /* JADX INFO: renamed from: c */
    public long f108670c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    public long f108671d;

    public hc20(Runnable runnable) {
        this.f108668a = runnable;
        this.f108669b = runnable.toString();
    }

    /* JADX INFO: renamed from: a */
    public long m134443a() {
        return this.f108671d;
    }

    /* JADX INFO: renamed from: b */
    public void m134444b(long j) {
        this.f108671d = j;
    }

    public long getAddedTime() {
        return this.f108670c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f108668a.run();
    }
}
