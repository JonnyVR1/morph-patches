package p153l;

/* JADX INFO: loaded from: classes13.dex */
public abstract class hk2<T> implements wpl<T> {

    /* JADX INFO: renamed from: a */
    public int f110363a;

    /* JADX INFO: renamed from: b */
    public T f110364b;

    public hk2(int i) {
        this.f110363a = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo95616a();

    /* JADX INFO: renamed from: b */
    public T m135608b() {
        if (this.f110364b == null) {
            this.f110364b = mo95616a();
        }
        return this.f110364b;
    }

    /* JADX INFO: renamed from: c */
    public void m135609c(T t) {
        this.f110364b = t;
    }

    @Override // p153l.xsl
    public int getAction() {
        return 0;
    }

    public hk2() {
    }
}
