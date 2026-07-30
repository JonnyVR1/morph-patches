package p009l;

import l.ogl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class y5l extends AbstractC1065o4 {

    /* JADX INFO: renamed from: a */
    public String f22902a;

    /* JADX INFO: renamed from: b */
    public boolean f22903b;

    public y5l(String str, boolean z) {
        this.f22902a = str;
        this.f22903b = z;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(z5l.C1346a c1346a) {
        boolean zMo14564d = mo14564d(c1346a);
        if (zMo14564d && ogl0.F()) {
            ic50.m16316j().m16322f().m17407b0(this.f22902a, 0, this.f22903b);
        }
        return Boolean.valueOf(zMo14564d);
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo14564d(z5l.C1346a c1346a);

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        if (!mo14565f(c1346a)) {
            return false;
        }
        if (ogl0.F()) {
            return ic50.m16316j().m16322f().m17392M(this.f22902a, this.f22903b);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo14565f(z5l.C1346a c1346a);
}
