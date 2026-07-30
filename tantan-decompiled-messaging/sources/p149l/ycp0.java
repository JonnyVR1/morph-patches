package p149l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class ycp0 {

    /* JADX INFO: renamed from: a */
    public d8m f197475a;

    /* JADX INFO: renamed from: l.ycp0$a */
    public static final class C21367a {
        private static final ycp0 INSTANCE = new ycp0();
    }

    /* JADX INFO: renamed from: d */
    public static ycp0 m214190d() {
        return C21367a.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m214191g(nnn0 nnn0Var) {
        if (nnn0Var.mo97490p()) {
            return ypv.m215672k().m195761W5();
        }
        return alk0.m97309h(nnn0Var.m160261Y2()) ? ypv.m215672k().m195785Z5() : ypv.m215672k().m195769X5();
    }

    /* JADX INFO: renamed from: a */
    public void m214192a() {
        if (NullChecker.m81303a(this.f197475a)) {
            this.f197475a.mo110328K0(true, true);
            this.f197475a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m214193b() {
        if (NullChecker.m81303a(this.f197475a)) {
            this.f197475a.mo110328K0(false, false);
            this.f197475a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public ho2 m214194c() {
        if (NullChecker.m81303a(this.f197475a)) {
            return this.f197475a.mo110332j();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m214195e() {
        return NullChecker.m81303a(this.f197475a) ? this.f197475a.mo110331i() : "";
    }

    /* JADX INFO: renamed from: f */
    public boolean m214196f() {
        return NullChecker.m81303a(this.f197475a) && this.f197475a.isShowing();
    }

    /* JADX INFO: renamed from: h */
    public boolean m214197h() {
        if (NullChecker.m81303a(this.f197475a)) {
            return this.f197475a.mo110330a();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m214198i() {
        if (NullChecker.m81303a(this.f197475a)) {
            this.f197475a.mo110326B0();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m214199j() {
        if (NullChecker.m81303a(this.f197475a)) {
            this.f197475a.mo110334q();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m214200k() {
        d8m d8mVar = this.f197475a;
        if (d8mVar != null) {
            d8mVar.mo110327G1();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m214201l(lqi<nnn0> lqiVar) {
        if (!ypv.f199493a.m199377v0() || lqiVar == null || lqiVar.m151024e() == null || ((nnn0) lqiVar.m151024e()).mo149813j() == null) {
            return false;
        }
        boolean zM207012b = x4s.m207012b(((nnn0) lqiVar.m151024e()).mo149813j().liveMode);
        if (zM207012b) {
            this.f197475a = new q5m0();
        } else {
            this.f197475a = new ddp0();
        }
        ndp0 ndp0Var = new ndp0(zM207012b);
        this.f197475a.mo51532C(ndp0Var);
        ndp0Var.mo21065i1(this.f197475a);
        zvf0.m220371D("e_audio_room_start_floating_bubble", "", vwb.m200311Y("open_type", lqiVar.m151025f()));
        return this.f197475a.mo110333p(lqiVar);
    }

    public ycp0() {
    }
}
