package p002l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class iqv {

    /* JADX INFO: renamed from: a */
    public int f13366a;

    public iqv(int i) {
        this.f13366a = i;
    }

    /* JADX INFO: renamed from: a */
    public int m15298a() {
        return this.f13366a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m15299b() {
        return this.f13366a == 5;
    }

    /* JADX INFO: renamed from: c */
    public boolean m15300c() {
        return this.f13366a == 4;
    }

    /* JADX INFO: renamed from: d */
    public boolean m15301d() {
        return this.f13366a == 2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m15302e() {
        return m15301d() || m15304g();
    }

    /* JADX INFO: renamed from: f */
    public boolean m15303f() {
        return this.f13366a == 1;
    }

    /* JADX INFO: renamed from: g */
    public boolean m15304g() {
        return this.f13366a == 3;
    }

    /* JADX INFO: renamed from: h */
    public boolean m15305h() {
        return this.f13366a == 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m15306i(boolean z) {
        return z ? m15307j() : m15308k();
    }

    /* JADX INFO: renamed from: j */
    public boolean m15307j() {
        return this.f13366a == 2;
    }

    /* JADX INFO: renamed from: k */
    public boolean m15308k() {
        int i = this.f13366a;
        return i == 2 || i == 4 || i == 3;
    }
}
