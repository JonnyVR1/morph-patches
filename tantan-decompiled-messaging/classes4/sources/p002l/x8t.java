package p002l;

import android.view.View;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.cul;
import l.e30;
import l.ffw;
import l.hpd0;
import l.rqi;
import l.rwb;
import l.w14;
import l.xh0;
import l.ypv;
import l.z310;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x8t extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public boolean f22172i;

    /* JADX INFO: renamed from: j */
    public boolean f22173j;

    public x8t(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final void m25775L3() {
        if (((pn40) m25547E2()).m14545Y0()) {
            return;
        }
        if ((ypv.a.P(act()) || !ypv.a.C()) && rqi.d().b(this.f22037f)) {
            Boolean bool = (Boolean) m14184F3(new w14(3400, 2));
            Boolean bool2 = (Boolean) m14184F3(new z310(3400, 2));
            if (bool.booleanValue() || bool2.booleanValue()) {
                return;
            }
            cul culVar = (cul) m14184F3(new fxb(2000));
            rwb rwbVar = (rwb) m14184F3(new swb(2000));
            lqi lqiVar = new lqi((pn40) m25547E2(), m14195n3(), (String) m14184F3(new ghc0(2000)), NullChecker.a(rwbVar) ? rwbVar.c : 0.0f);
            if (culVar == null) {
                return;
            }
            lqiVar.m17384i(culVar);
            this.f22173j = pxm.m20743c().m20748f(lqiVar, false);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m25776M3() {
        if (rqi.d().b(this.f22037f)) {
            return;
        }
        hpd0 hpd0Var = new hpd0("live_out_app_float_permission_dialog_shown" + ypv.a.D0(), Boolean.FALSE);
        if (((Boolean) hpd0Var.get()).booleanValue()) {
            return;
        }
        new xh0.a(this.f22037f).h(true).s("悬浮窗播放,精彩不断").j("开启悬浮窗播放功能，退到后台还能继续观看精彩直播").f("暂不使用").r("立即开启").o(new View.OnClickListener() { // from class: l.w8t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21563a.m25778O3(view);
            }
        }).b(true).a().g();
        hpd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: N3 */
    public final void m25777N3(boolean z) {
        if (!z) {
            this.f22172i = true;
            m25775L3();
            return;
        }
        if (this.f22172i) {
            m25776M3();
        }
        if (this.f22173j) {
            m25779P3();
            this.f22173j = false;
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m25778O3(View view) {
        rqi.d().a(this.f22037f);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m25779P3() {
        m25548F2().PlayerEvent.switchMute().j(Boolean.FALSE);
        m25548F2().PlayerEvent.updatePlayerContainer().p();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f22172i = false;
        this.f22173j = false;
    }

    /* JADX INFO: renamed from: t */
    public void m25780t() {
        super.t();
        duringCreated(Act.front()).subscribe(ffw.h(new e30() { // from class: l.v8t
            public final void call(Object obj) {
                this.f21037a.m25777N3(((Boolean) obj).booleanValue());
            }
        }));
    }
}
