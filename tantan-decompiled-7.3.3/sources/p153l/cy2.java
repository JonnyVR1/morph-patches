package p153l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class cy2 {

    /* JADX INFO: renamed from: a */
    public final by2 f84294a;

    /* JADX INFO: renamed from: b */
    public d13 f84295b;

    public cy2(by2 by2Var) {
        if (by2Var != null) {
            this.f84294a = by2Var;
        } else {
            wg3.m206174a("Binarizer must be non-null.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public d13 m113086a() throws NotFoundException {
        if (this.f84295b == null) {
            this.f84295b = this.f84294a.mo106956b();
        }
        return this.f84295b;
    }

    /* JADX INFO: renamed from: b */
    public b13 m113087b(int i, b13 b13Var) throws NotFoundException {
        return this.f84294a.mo106957c(i, b13Var);
    }

    /* JADX INFO: renamed from: c */
    public int m113088c() {
        return this.f84294a.m106958d();
    }

    /* JADX INFO: renamed from: d */
    public int m113089d() {
        return this.f84294a.m106960f();
    }

    /* JADX INFO: renamed from: e */
    public boolean m113090e() {
        return this.f84294a.m106959e().m196130e();
    }

    /* JADX INFO: renamed from: f */
    public cy2 m113091f() {
        return new cy2(this.f84294a.mo106955a(this.f84294a.m106959e().m196131f()));
    }

    public String toString() {
        try {
            return m113086a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
