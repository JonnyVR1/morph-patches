package p153l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jsv {

    /* JADX INFO: renamed from: a */
    public int f122531a;

    public jsv(int i) {
        this.f122531a = i;
    }

    /* JADX INFO: renamed from: a */
    public int m146875a() {
        return this.f122531a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m146876b() {
        return this.f122531a == 5;
    }

    /* JADX INFO: renamed from: c */
    public boolean m146877c() {
        return this.f122531a == 4;
    }

    /* JADX INFO: renamed from: d */
    public boolean m146878d() {
        return this.f122531a == 2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m146879e() {
        return m146878d() || m146881g();
    }

    /* JADX INFO: renamed from: f */
    public boolean m146880f() {
        return this.f122531a == 1;
    }

    /* JADX INFO: renamed from: g */
    public boolean m146881g() {
        return this.f122531a == 3;
    }

    /* JADX INFO: renamed from: h */
    public boolean m146882h() {
        return this.f122531a == 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m146883i(boolean z) {
        return z ? m146884j() : m146885k();
    }

    /* JADX INFO: renamed from: j */
    public boolean m146884j() {
        return this.f122531a == 2;
    }

    /* JADX INFO: renamed from: k */
    public boolean m146885k() {
        int i = this.f122531a;
        return i == 2 || i == 4 || i == 3;
    }
}
