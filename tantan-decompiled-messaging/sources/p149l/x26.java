package p149l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class x26 implements c36 {

    /* JADX INFO: renamed from: a */
    public int f189129a;

    /* JADX INFO: renamed from: b */
    public int f189130b;

    public x26(int i, int i2) {
        this.f189129a = i;
        this.f189130b = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m206845b(int i) {
        this.f189129a += i;
        this.f189130b += i;
    }

    @Override // p149l.c36
    public final j760<Integer, Integer> getIndex(String str) {
        return new j760<>(Integer.valueOf(this.f189129a), Integer.valueOf(this.f189130b));
    }
}
