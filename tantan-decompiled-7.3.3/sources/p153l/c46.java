package p153l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c46 implements h46 {

    /* JADX INFO: renamed from: a */
    public int f79671a;

    /* JADX INFO: renamed from: b */
    public int f79672b;

    public c46(int i, int i2) {
        this.f79671a = i;
        this.f79672b = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m107861b(int i) {
        this.f79671a += i;
        this.f79672b += i;
    }

    @Override // p153l.h46
    public final pf60<Integer, Integer> getIndex(String str) {
        return new pf60<>(Integer.valueOf(this.f79671a), Integer.valueOf(this.f79672b));
    }
}
