package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class alr0 {

    /* JADX INFO: renamed from: a */
    public final String f70509a;

    /* JADX INFO: renamed from: b */
    public final int f70510b;

    /* JADX INFO: renamed from: c */
    public final int f70511c;

    /* JADX INFO: renamed from: d */
    public int f70512d;

    /* JADX INFO: renamed from: e */
    public String f70513e;

    public alr0(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f70509a = str;
        this.f70510b = i2;
        this.f70511c = i3;
        this.f70512d = Integer.MIN_VALUE;
        this.f70513e = "";
    }

    /* JADX INFO: renamed from: a */
    public final int m97442a() {
        m97445d();
        return this.f70512d;
    }

    /* JADX INFO: renamed from: b */
    public final String m97443b() {
        m97445d();
        return this.f70513e;
    }

    /* JADX INFO: renamed from: c */
    public final void m97444c() {
        int i = this.f70512d;
        int i2 = i == Integer.MIN_VALUE ? this.f70510b : i + this.f70511c;
        this.f70512d = i2;
        this.f70513e = this.f70509a + i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m97445d() {
        if (this.f70512d != Integer.MIN_VALUE) {
            return;
        }
        qkq0.m175383a("generateNewId() must be called before retrieving ids.");
    }
}
