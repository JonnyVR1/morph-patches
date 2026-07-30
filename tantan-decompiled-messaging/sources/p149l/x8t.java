package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class x8t extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public boolean f191545i;

    /* JADX INFO: renamed from: j */
    public boolean f191546j;

    public x8t(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final void m207426L3() {
        if (((pn40) m206027E2()).m132109Y0()) {
            return;
        }
        if ((ypv.f199493a.m199323P(act()) || !ypv.f199493a.m199306C()) && rqi.m180453d().m180455b(this.f188513f)) {
            Boolean bool = (Boolean) m129297F3(new w14(3400, 2));
            Boolean bool2 = (Boolean) m129297F3(new z310(3400, 2));
            if (bool.booleanValue() || bool2.booleanValue()) {
                return;
            }
            cul culVar = (cul) m129297F3(new fxb(2000));
            rwb rwbVar = (rwb) m129297F3(new swb(2000));
            lqi lqiVar = new lqi((pn40) m206027E2(), m129308n3(), (String) m129297F3(new ghc0(2000)), NullChecker.m81303a(rwbVar) ? rwbVar.f161326c : 0.0f);
            if (culVar == null) {
                return;
            }
            lqiVar.m151028i(culVar);
            this.f191546j = pxm.m171910c().m171915f(lqiVar, false);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m207427M3() {
        if (rqi.m180453d().m180455b(this.f188513f)) {
            return;
        }
        hpd0 hpd0Var = new hpd0("live_out_app_float_permission_dialog_shown" + ypv.f199493a.m199309D0(), Boolean.FALSE);
        if (hpd0Var.get().booleanValue()) {
            return;
        }
        new xh0.C21150a(this.f188513f).m208729h(true).m208740s("悬浮窗播放,精彩不断").m208731j("开启悬浮窗播放功能，退到后台还能继续观看精彩直播").m208727f("暂不使用").m208739r("立即开启").m208736o(new View.OnClickListener() { // from class: l.w8t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185254a.m207429O3(view);
            }
        }).m208723b(true).m208722a().m208721g();
        hpd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: N3 */
    public final void m207428N3(boolean z) {
        if (!z) {
            this.f191545i = true;
            m207426L3();
            return;
        }
        if (this.f191545i) {
            m207427M3();
        }
        if (this.f191546j) {
            m207430P3();
            this.f191546j = false;
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m207429O3(View view) {
        rqi.m180453d().m180454a(this.f188513f);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m207430P3() {
        m206028F2().PlayerEvent.switchMute().mo172463j(Boolean.FALSE);
        m206028F2().PlayerEvent.updatePlayerContainer().m172467p();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f191545i = false;
        this.f191546j = false;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(Act.front()).subscribe(ffw.m121197h(new e30() { // from class: l.v8t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180589a.m207428N3(((Boolean) obj).booleanValue());
            }
        }));
    }
}
