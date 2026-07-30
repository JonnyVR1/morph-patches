package p006l;

import android.app.Dialog;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.FreeTrialConfig;
import com.p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.e30;
import l.f6j;
import l.hpd0;
import l.i0e;
import l.j760;
import l.mkd0;
import l.osi0;
import l.vwb;
import l.vyc0;
import l.zvf0;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class uyc0 extends ogl0 {

    /* JADX INFO: renamed from: i */
    public static volatile uyc0 f23808i;

    /* JADX INFO: renamed from: b */
    public hpd0 f23809b;

    /* JADX INFO: renamed from: c */
    public boolean f23810c;

    /* JADX INFO: renamed from: d */
    public hpd0 f23811d;

    /* JADX INFO: renamed from: e */
    public hpd0 f23812e;

    /* JADX INFO: renamed from: f */
    public b<String> f23813f;

    /* JADX INFO: renamed from: g */
    public boolean f23814g;

    /* JADX INFO: renamed from: h */
    public boolean f23815h;

    public uyc0() {
        String str = "have_show_hide_local_guide_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f23809b = new hpd0(str, bool);
        this.f23811d = new hpd0("can_show_real_pic_tips" + CoreModule.m1850H().userId(), bool);
        this.f23812e = new hpd0("can_show_real_id_and_pic_tips" + CoreModule.m1850H().userId(), bool);
        this.f23813f = b.b();
        this.f23814g = false;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m25608c0(String str, Act act) {
        zvf0.u("e_svip_trial_end_popup_confirm", "p_svip_trial_end_popup", new j760[]{vwb.Y("each_prop", vyc0.f(str))});
        CoreModule.m1854P().m11706a().m5502pr(act, "p_svip_trial_end_popup,e_svip_trial_end_popup_confirm,click", vyc0.d(str));
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m25609d0(cwf0 cwf0Var, d30 d30Var) {
        i0e.e(cwf0Var);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m25610e0(final String str, final Act act, final String str2) {
        zvf0.u("e_svip_trial_popup_confirm", "p_svip_trial_popup", new j760[]{vwb.Y("each_prop", vyc0.f(str))});
        CoreModule.f1534c.f3680v1.m26670j3(str, Boolean.TRUE).subscribe(mkd0.G(new e30() { // from class: l.tyc0
            public final void call(Object obj) {
                uyc0.m25614i0(act, str, str2, (FreeTrialOperateResult) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m25613h0(String str) {
        zvf0.u("e_svip_trial_popup_cancel", "p_svip_trial_popup", new j760[]{vwb.Y("each_prop", vyc0.f(str))});
        CoreModule.f1534c.f3680v1.m26670j3(str, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m25614i0(Act act, String str, String str2, FreeTrialOperateResult freeTrialOperateResult) {
        if ("success".equals(freeTrialOperateResult.operateResult)) {
            vyc0.t(act, str, str2);
        } else {
            if (vwb.L(freeTrialOperateResult.msg)) {
                return;
            }
            osi0.g(freeTrialOperateResult.msg);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static uyc0 m25615l0() {
        if (f23808i == null) {
            synchronized (uyc0.class) {
                try {
                    if (f23808i == null) {
                        f23808i = new uyc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f23808i;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m25616u0(final Act act, final String str, final d30 d30Var, final String str2) {
        final cwf0 cwf0VarC = i0e.c("p_svip_trial_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("each_prop", vyc0.f(str))});
        new f6j.a(act).l(vyc0.e(str)).q(vyc0.h(str)).s(vyc0.m(str)).r(vyc0.l(str)).o("立即开启", new d30() { // from class: l.qyc0
            public final void call() {
                uyc0.m25610e0(str, act, str2);
            }
        }).n("不，谢谢", new d30() { // from class: l.ryc0
            public final void call() {
                uyc0.m25613h0(str);
            }
        }).m("haveRead".equals(str) ? null : "*试用期间可在筛选页关闭此功能").p(new d30() { // from class: l.syc0
            public final void call() {
                uyc0.m25609d0(cwf0VarC, d30Var);
            }
        }).t();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: j0 */
    public void m25617j0() {
        if (CoreModule.f1534c.f3680v1.m26673m3("haveRead", "opening")) {
            wr8 wr8Var = CoreModule.f1534c.f3680v1;
            wr8Var.m26682v3(wr8Var.m26675o3() + 1);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m25618k0() {
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m25619m0() {
        FreeTrialConfig freeTrialConfigM26674n3 = CoreModule.f1534c.f3680v1.m26674n3("haveRead");
        if (!NullChecker.a(freeTrialConfigM26674n3)) {
            return false;
        }
        int i = freeTrialConfigM26674n3.benefitCount;
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public void m25620n0(boolean z) {
        this.f23815h = z;
    }

    /* JADX INFO: renamed from: o0 */
    public void m25621o0(boolean z) {
        this.f23814g = z;
    }

    /* JADX INFO: renamed from: p0 */
    public void m25622p0(boolean z) {
        this.f23812e.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: q0 */
    public void m25623q0(boolean z) {
        this.f23811d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r0 */
    public void m25624r0(Act act) {
        int iM26675o3 = CoreModule.f1534c.f3680v1.m26675o3();
        FreeTrialConfig freeTrialConfigM26674n3 = CoreModule.f1534c.f3680v1.m26674n3("haveRead");
        if (iM26675o3 > (NullChecker.a(freeTrialConfigM26674n3) ? freeTrialConfigM26674n3.benefitCount : 0)) {
            m25625s0(act, "haveRead");
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m25625s0(final Act act, final String str) {
        m25623q0(false);
        m25622p0(false);
        m25620n0(false);
        CoreModule.f1534c.f3680v1.m26670j3(str, Boolean.FALSE);
        final cwf0 cwf0VarC = i0e.c("p_svip_trial_end_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("each_prop", vyc0.f(str))});
        new f6j.a(act).l(vyc0.e(str)).q(vyc0.h(str)).s(vyc0.k(str)).r(vyc0.j(str)).o("继续使用", new d30() { // from class: l.nyc0
            public final void call() {
                uyc0.m25608c0(str, act);
            }
        }).n("不，谢谢", new d30() { // from class: l.oyc0
            public final void call() {
                zvf0.u("e_svip_trial_end_popup_cancel", "p_svip_trial_end_popup", new j760[]{vwb.Y("each_prop", vyc0.f(str))});
            }
        }).p(new d30() { // from class: l.pyc0
            public final void call() {
                i0e.e(cwf0VarC);
            }
        }).t();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: t0 */
    public void m25626t0(Act act, String str, String str2) {
        m25616u0(act, str, null, str2);
    }
}
