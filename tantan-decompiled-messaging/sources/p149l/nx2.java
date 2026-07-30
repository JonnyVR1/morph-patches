package p149l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class nx2 {

    /* JADX INFO: renamed from: a */
    public final mx2 f140991a;

    /* JADX INFO: renamed from: b */
    public o03 f140992b;

    public nx2(mx2 mx2Var) {
        if (mx2Var != null) {
            this.f140991a = mx2Var;
        } else {
            ig3.m135964a("Binarizer must be non-null.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public o03 m161925a() throws NotFoundException {
        if (this.f140992b == null) {
            this.f140992b = this.f140991a.mo156827b();
        }
        return this.f140992b;
    }

    /* JADX INFO: renamed from: b */
    public m03 m161926b(int i, m03 m03Var) throws NotFoundException {
        return this.f140991a.mo156828c(i, m03Var);
    }

    /* JADX INFO: renamed from: c */
    public int m161927c() {
        return this.f140991a.m156829d();
    }

    /* JADX INFO: renamed from: d */
    public int m161928d() {
        return this.f140991a.m156831f();
    }

    /* JADX INFO: renamed from: e */
    public boolean m161929e() {
        return this.f140991a.m156830e().m202993e();
    }

    /* JADX INFO: renamed from: f */
    public nx2 m161930f() {
        return new nx2(this.f140991a.mo156826a(this.f140991a.m156830e().m202994f()));
    }

    public String toString() {
        try {
            return m161925a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
