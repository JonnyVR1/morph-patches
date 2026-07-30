package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class yat extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public boolean f198239i;

    /* JADX INFO: renamed from: j */
    public boolean f198240j;

    public yat(dum dumVar) {
        super(dumVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final void m214918L3() {
        if (((dw40) m213810E2()).m168495Y0()) {
            return;
        }
        if ((zrv.f205799a.m207645P(act()) || !zrv.f205799a.m207628C()) && nti.m164730d().m164732b(this.f196919f)) {
            Boolean bool = (Boolean) m138856F3(new v24(3400, 2));
            Boolean bool2 = (Boolean) m138856F3(new jc10(3400, 2));
            if (bool.booleanValue() || bool2.booleanValue()) {
                return;
            }
            qwl qwlVar = (qwl) m138856F3(new tyb(2000));
            fyb fybVar = (fyb) m138856F3(new gyb(2000));
            hti htiVar = new hti((dw40) m213810E2(), m138867n3(), (String) m138856F3(new npc0(2000)), NullChecker.m82486a(fybVar) ? fybVar.f101359c : 0.0f);
            if (qwlVar == null) {
                return;
            }
            htiVar.m137084i(qwlVar);
            this.f198240j = pzm.m174537c().m174542f(htiVar, false);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m214919M3() {
        if (nti.m164730d().m164732b(this.f196919f)) {
            return;
        }
        jxd0 jxd0Var = new jxd0("live_out_app_float_permission_dialog_shown" + zrv.f205799a.m207631D0(), Boolean.FALSE);
        if (jxd0Var.get().booleanValue()) {
            return;
        }
        new th0.C20312a(this.f196919f).m191149h(true).m191160s("悬浮窗播放,精彩不断").m191151j("开启悬浮窗播放功能，退到后台还能继续观看精彩直播").m191147f("暂不使用").m191159r("立即开启").m191156o(new View.OnClickListener() { // from class: l.xat
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193073a.m214921O3(view);
            }
        }).m191143b(true).m191142a().m191141g();
        jxd0Var.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: N3 */
    public final void m214920N3(boolean z) {
        if (!z) {
            this.f198239i = true;
            m214918L3();
            return;
        }
        if (this.f198239i) {
            m214919M3();
        }
        if (this.f198240j) {
            m214922P3();
            this.f198240j = false;
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m214921O3(View view) {
        nti.m164730d().m164731a(this.f196919f);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m214922P3() {
        m213811F2().PlayerEvent.switchMute().mo199273j(Boolean.FALSE);
        m213811F2().PlayerEvent.updatePlayerContainer().m199277p();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f198239i = false;
        this.f198240j = false;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(Act.front()).subscribe(dhw.m115829h(new y20() { // from class: l.wat
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188165a.m214920N3(((Boolean) obj).booleanValue());
            }
        }));
    }
}
