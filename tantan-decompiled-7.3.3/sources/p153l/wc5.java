package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class wc5 {

    /* JADX INFO: renamed from: a */
    public final int f188386a;

    /* JADX INFO: renamed from: b */
    public final int f188387b;

    /* JADX INFO: renamed from: c */
    public final int f188388c;

    /* JADX INFO: renamed from: d */
    public final int f188389d;

    /* JADX INFO: renamed from: e */
    public int f188390e = -1;

    public wc5(int i, int i2, int i3, int i4) {
        this.f188386a = i;
        this.f188387b = i2;
        this.f188388c = i3;
        this.f188389d = i4;
    }

    /* JADX INFO: renamed from: a */
    public int m205783a() {
        return this.f188388c;
    }

    /* JADX INFO: renamed from: b */
    public int m205784b() {
        return this.f188387b;
    }

    /* JADX INFO: renamed from: c */
    public int m205785c() {
        return this.f188390e;
    }

    /* JADX INFO: renamed from: d */
    public int m205786d() {
        return this.f188386a;
    }

    /* JADX INFO: renamed from: e */
    public int m205787e() {
        return this.f188389d;
    }

    /* JADX INFO: renamed from: f */
    public int m205788f() {
        return this.f188387b - this.f188386a;
    }

    /* JADX INFO: renamed from: g */
    public boolean m205789g() {
        return m205790h(this.f188390e);
    }

    /* JADX INFO: renamed from: h */
    public boolean m205790h(int i) {
        return i != -1 && this.f188388c == (i % 3) * 3;
    }

    /* JADX INFO: renamed from: i */
    public void m205791i(int i) {
        this.f188390e = i;
    }

    /* JADX INFO: renamed from: j */
    public void m205792j() {
        this.f188390e = ((this.f188389d / 30) * 3) + (this.f188388c / 3);
    }

    public String toString() {
        return this.f188390e + "|" + this.f188389d;
    }
}
