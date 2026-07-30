package p153l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class cmp0 {

    /* JADX INFO: renamed from: a */
    public tam f82638a;

    /* JADX INFO: renamed from: l.cmp0$a */
    public static final class C16316a {
        private static final cmp0 INSTANCE = new cmp0();
    }

    /* JADX INFO: renamed from: d */
    public static cmp0 m111299d() {
        return C16316a.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m111300g(rwn0 rwn0Var) {
        if (rwn0Var.mo118373p()) {
            return zrv.m221193k().m203548W5();
        }
        return guk0.m132329h(rwn0Var.m183423Y2()) ? zrv.m221193k().m203572Z5() : zrv.m221193k().m203556X5();
    }

    /* JADX INFO: renamed from: a */
    public void m111301a() {
        if (NullChecker.m82486a(this.f82638a)) {
            this.f82638a.mo135957K0(true, true);
            this.f82638a = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m111302b() {
        if (NullChecker.m82486a(this.f82638a)) {
            this.f82638a.mo135957K0(false, false);
            this.f82638a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public oo2 m111303c() {
        if (NullChecker.m82486a(this.f82638a)) {
            return this.f82638a.mo135964j();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m111304e() {
        return NullChecker.m82486a(this.f82638a) ? this.f82638a.mo135963i() : "";
    }

    /* JADX INFO: renamed from: f */
    public boolean m111305f() {
        return NullChecker.m82486a(this.f82638a) && this.f82638a.isShowing();
    }

    /* JADX INFO: renamed from: h */
    public boolean m111306h() {
        if (NullChecker.m82486a(this.f82638a)) {
            return this.f82638a.mo135959a();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m111307i() {
        if (NullChecker.m82486a(this.f82638a)) {
            this.f82638a.mo135956B0();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m111308j() {
        if (NullChecker.m82486a(this.f82638a)) {
            this.f82638a.mo135966q();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m111309k() {
        tam tamVar = this.f82638a;
        if (tamVar != null) {
            tamVar.mo189914G1();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m111310l(hti<rwn0> htiVar) {
        if (!zrv.f205799a.m207699v0() || htiVar == null || htiVar.m137080e() == null || ((rwn0) htiVar.m137080e()).mo183435j() == null) {
            return false;
        }
        boolean zM214494b = y6s.m214494b(((rwn0) htiVar.m137080e()).mo183435j().liveMode);
        if (zM214494b) {
            this.f82638a = new uem0();
        } else {
            this.f82638a = new hmp0();
        }
        rmp0 rmp0Var = new rmp0(zM214494b);
        this.f82638a.mo52715C(rmp0Var);
        rmp0Var.mo22064i1(this.f82638a);
        i4g0.m138495D("e_audio_room_start_floating_bubble", "", jyb.m147494Y("open_type", htiVar.m137081f()));
        return this.f82638a.mo135965p(htiVar);
    }

    public cmp0() {
    }
}
