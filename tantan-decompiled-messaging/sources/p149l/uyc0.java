package p149l;

import android.app.Dialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.FreeTrialConfig;
import com.p046p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.tantanapp.common.utils.NullChecker;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class uyc0 extends ogl0 {

    /* JADX INFO: renamed from: i */
    public static volatile uyc0 f178848i;

    /* JADX INFO: renamed from: b */
    public hpd0 f178849b;

    /* JADX INFO: renamed from: c */
    public boolean f178850c;

    /* JADX INFO: renamed from: d */
    public hpd0 f178851d;

    /* JADX INFO: renamed from: e */
    public hpd0 f178852e;

    /* JADX INFO: renamed from: f */
    public C22393b<String> f178853f;

    /* JADX INFO: renamed from: g */
    public boolean f178854g;

    /* JADX INFO: renamed from: h */
    public boolean f178855h;

    public uyc0() {
        String str = "have_show_hide_local_guide_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f178849b = new hpd0(str, bool);
        this.f178851d = new hpd0("can_show_real_pic_tips" + CoreModule.m29931H().userId(), bool);
        this.f178852e = new hpd0("can_show_real_id_and_pic_tips" + CoreModule.m29931H().userId(), bool);
        this.f178853f = C22393b.m221521b();
        this.f178854g = false;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m196265c0(String str, Act act) {
        zvf0.m220399u("e_svip_trial_end_popup_confirm", "p_svip_trial_end_popup", vwb.m200311Y("each_prop", vyc0.m200631f(str)));
        CoreModule.m29935P().m94651a().mo33565pr(act, "p_svip_trial_end_popup,e_svip_trial_end_popup_confirm,click", vyc0.m200629d(str));
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m196266d0(cwf0 cwf0Var, d30 d30Var) {
        i0e.m133796e(cwf0Var);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m196267e0(final String str, final Act act, final String str2) {
        zvf0.m220399u("e_svip_trial_popup_confirm", "p_svip_trial_popup", vwb.m200311Y("each_prop", vyc0.m200631f(str)));
        CoreModule.f17545c.f19691v1.m205154j3(str, Boolean.TRUE).subscribe(mkd0.m154955G(new e30() { // from class: l.tyc0
            @Override // p149l.e30
            public final void call(Object obj) {
                uyc0.m196271i0(act, str, str2, (FreeTrialOperateResult) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m196270h0(String str) {
        zvf0.m220399u("e_svip_trial_popup_cancel", "p_svip_trial_popup", vwb.m200311Y("each_prop", vyc0.m200631f(str)));
        CoreModule.f17545c.f19691v1.m205154j3(str, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m196271i0(Act act, String str, String str2, FreeTrialOperateResult freeTrialOperateResult) {
        if ("success".equals(freeTrialOperateResult.operateResult)) {
            vyc0.m200645t(act, str, str2);
        } else {
            if (vwb.m200298L(freeTrialOperateResult.msg)) {
                return;
            }
            osi0.m165783g(freeTrialOperateResult.msg);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static uyc0 m196272l0() {
        if (f178848i == null) {
            synchronized (uyc0.class) {
                try {
                    if (f178848i == null) {
                        f178848i = new uyc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f178848i;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m196273u0(final Act act, final String str, final d30 d30Var, final String str2) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_svip_trial_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("each_prop", vyc0.m200631f(str)));
        new f6j.C16767a(act).m119610l(vyc0.m200630e(str)).m119615q(vyc0.m200633h(str)).m119617s(vyc0.m200638m(str)).m119616r(vyc0.m200637l(str)).m119613o("立即开启", new d30() { // from class: l.qyc0
            @Override // p149l.d30
            public final void call() {
                uyc0.m196267e0(str, act, str2);
            }
        }).m119612n("不，谢谢", new d30() { // from class: l.ryc0
            @Override // p149l.d30
            public final void call() {
                uyc0.m196270h0(str);
            }
        }).m119611m("haveRead".equals(str) ? null : "*试用期间可在筛选页关闭此功能").m119614p(new d30() { // from class: l.syc0
            @Override // p149l.d30
            public final void call() {
                uyc0.m196266d0(cwf0VarM133794c, d30Var);
            }
        }).m119618t();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: j0 */
    public void m196274j0() {
        if (CoreModule.f17545c.f19691v1.m205157m3("haveRead", "opening")) {
            wr8 wr8Var = CoreModule.f17545c.f19691v1;
            wr8Var.m205166v3(wr8Var.m205159o3() + 1);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m196275k0() {
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m196276m0() {
        FreeTrialConfig freeTrialConfigM205158n3 = CoreModule.f17545c.f19691v1.m205158n3("haveRead");
        if (!NullChecker.m81303a(freeTrialConfigM205158n3)) {
            return false;
        }
        int i = freeTrialConfigM205158n3.benefitCount;
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public void m196277n0(boolean z) {
        this.f178855h = z;
    }

    /* JADX INFO: renamed from: o0 */
    public void m196278o0(boolean z) {
        this.f178854g = z;
    }

    /* JADX INFO: renamed from: p0 */
    public void m196279p0(boolean z) {
        this.f178852e.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: q0 */
    public void m196280q0(boolean z) {
        this.f178851d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r0 */
    public void m196281r0(Act act) {
        int iM205159o3 = CoreModule.f17545c.f19691v1.m205159o3();
        FreeTrialConfig freeTrialConfigM205158n3 = CoreModule.f17545c.f19691v1.m205158n3("haveRead");
        if (iM205159o3 > (NullChecker.m81303a(freeTrialConfigM205158n3) ? freeTrialConfigM205158n3.benefitCount : 0)) {
            m196282s0(act, "haveRead");
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m196282s0(final Act act, final String str) {
        m196280q0(false);
        m196279p0(false);
        m196277n0(false);
        CoreModule.f17545c.f19691v1.m205154j3(str, Boolean.FALSE);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_svip_trial_end_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("each_prop", vyc0.m200631f(str)));
        new f6j.C16767a(act).m119610l(vyc0.m200630e(str)).m119615q(vyc0.m200633h(str)).m119617s(vyc0.m200636k(str)).m119616r(vyc0.m200635j(str)).m119613o("继续使用", new d30() { // from class: l.nyc0
            @Override // p149l.d30
            public final void call() {
                uyc0.m196265c0(str, act);
            }
        }).m119612n("不，谢谢", new d30() { // from class: l.oyc0
            @Override // p149l.d30
            public final void call() {
                zvf0.m220399u("e_svip_trial_end_popup_cancel", "p_svip_trial_end_popup", vwb.m200311Y("each_prop", vyc0.m200631f(str)));
            }
        }).m119614p(new d30() { // from class: l.pyc0
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m119618t();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: t0 */
    public void m196283t0(Act act, String str, String str2) {
        m196273u0(act, str, null, str2);
    }
}
