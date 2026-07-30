package p149l;

/* JADX INFO: loaded from: classes13.dex */
public abstract class zj2<T> implements lnl<T> {

    /* JADX INFO: renamed from: a */
    public int f203374a;

    /* JADX INFO: renamed from: b */
    public T f203375b;

    public zj2(int i) {
        this.f203374a = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo94647a();

    /* JADX INFO: renamed from: b */
    public T m219082b() {
        if (this.f203375b == null) {
            this.f203375b = mo94647a();
        }
        return this.f203375b;
    }

    /* JADX INFO: renamed from: c */
    public void m219083c(T t) {
        this.f203375b = t;
    }

    @Override // p149l.lql
    public int getAction() {
        return 0;
    }

    public zj2() {
    }
}
