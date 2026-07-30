package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class gur0 {

    /* JADX INFO: renamed from: a */
    public final String f106567a;

    /* JADX INFO: renamed from: b */
    public final int f106568b;

    /* JADX INFO: renamed from: c */
    public final int f106569c;

    /* JADX INFO: renamed from: d */
    public int f106570d;

    /* JADX INFO: renamed from: e */
    public String f106571e;

    public gur0(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f106567a = str;
        this.f106568b = i2;
        this.f106569c = i3;
        this.f106570d = Integer.MIN_VALUE;
        this.f106571e = "";
    }

    /* JADX INFO: renamed from: a */
    public final int m132384a() {
        m132387d();
        return this.f106570d;
    }

    /* JADX INFO: renamed from: b */
    public final String m132385b() {
        m132387d();
        return this.f106571e;
    }

    /* JADX INFO: renamed from: c */
    public final void m132386c() {
        int i = this.f106570d;
        int i2 = i == Integer.MIN_VALUE ? this.f106568b : i + this.f106569c;
        this.f106570d = i2;
        this.f106571e = this.f106567a + i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m132387d() {
        if (this.f106570d != Integer.MIN_VALUE) {
            return;
        }
        wtq0.m207906a("generateNewId() must be called before retrieving ids.");
    }
}
