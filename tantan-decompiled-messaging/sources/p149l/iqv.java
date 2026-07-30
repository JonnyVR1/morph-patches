package p149l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iqv {

    /* JADX INFO: renamed from: a */
    public int f114552a;

    public iqv(int i) {
        this.f114552a = i;
    }

    /* JADX INFO: renamed from: a */
    public int m137794a() {
        return this.f114552a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m137795b() {
        return this.f114552a == 5;
    }

    /* JADX INFO: renamed from: c */
    public boolean m137796c() {
        return this.f114552a == 4;
    }

    /* JADX INFO: renamed from: d */
    public boolean m137797d() {
        return this.f114552a == 2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m137798e() {
        return m137797d() || m137800g();
    }

    /* JADX INFO: renamed from: f */
    public boolean m137799f() {
        return this.f114552a == 1;
    }

    /* JADX INFO: renamed from: g */
    public boolean m137800g() {
        return this.f114552a == 3;
    }

    /* JADX INFO: renamed from: h */
    public boolean m137801h() {
        return this.f114552a == 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m137802i(boolean z) {
        return z ? m137803j() : m137804k();
    }

    /* JADX INFO: renamed from: j */
    public boolean m137803j() {
        return this.f114552a == 2;
    }

    /* JADX INFO: renamed from: k */
    public boolean m137804k() {
        int i = this.f114552a;
        return i == 2 || i == 4 || i == 3;
    }
}
