package p149l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y5l extends AbstractC18834o4 {

    /* JADX INFO: renamed from: a */
    public String f196450a;

    /* JADX INFO: renamed from: b */
    public boolean f196451b;

    public y5l(String str, boolean z) {
        this.f196450a = str;
        this.f196451b = z;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(z5l.C21640a c21640a) {
        boolean zMo122878d = mo122878d(c21640a);
        if (zMo122878d && ogl0.m164227F()) {
            ic50.m135327j().m135333f().m145241b0(this.f196450a, 0, this.f196451b);
        }
        return Boolean.valueOf(zMo122878d);
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo122878d(z5l.C21640a c21640a);

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        if (!mo122879f(c21640a)) {
            return false;
        }
        if (ogl0.m164227F()) {
            return ic50.m135327j().m135333f().m145226M(this.f196450a, this.f196451b);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo122879f(z5l.C21640a c21640a);
}
