package p153l;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class egw0 implements ufw0 {

    /* JADX INFO: renamed from: f */
    public static egw0 f93980f;

    /* JADX INFO: renamed from: a */
    public float f93981a = 0.0f;

    /* JADX INFO: renamed from: b */
    public final qfw0 f93982b;

    /* JADX INFO: renamed from: c */
    public final ofw0 f93983c;

    /* JADX INFO: renamed from: d */
    public pfw0 f93984d;

    /* JADX INFO: renamed from: e */
    public tfw0 f93985e;

    public egw0(qfw0 qfw0Var, ofw0 ofw0Var) {
        this.f93982b = qfw0Var;
        this.f93983c = ofw0Var;
    }

    /* JADX INFO: renamed from: c */
    public static egw0 m120810c() {
        if (f93980f == null) {
            f93980f = new egw0(new qfw0(), new ofw0());
        }
        return f93980f;
    }

    @Override // p153l.ufw0
    /* JADX INFO: renamed from: a */
    public final void mo120811a(boolean z) {
        if (z) {
            ghw0.m130266d().m130272i();
        } else {
            ghw0.m130266d().m130271h();
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m120812b() {
        return this.f93981a;
    }

    /* JADX INFO: renamed from: d */
    public final void m120813d(Context context) {
        this.f93984d = new pfw0(new Handler(), context, new nfw0(), this);
    }

    /* JADX INFO: renamed from: e */
    public final void m120814e(float f) {
        this.f93981a = f;
        if (this.f93985e == null) {
            this.f93985e = tfw0.m190995a();
        }
        Iterator it = this.f93985e.m190996b().iterator();
        while (it.hasNext()) {
            ((kfw0) it.next()).m149627g().m149772i(f);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m120815f() {
        sfw0.m185674i().m201192e(this);
        sfw0.m185674i().m201193f();
        ghw0.m130266d().m130272i();
        this.f93984d.m172159a();
    }

    /* JADX INFO: renamed from: g */
    public final void m120816g() {
        ghw0.m130266d().m130273j();
        sfw0.m185674i().m201194g();
        this.f93984d.m172160b();
    }
}
