package p153l;

import android.app.Dialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.FreeTrialConfig;
import com.p051p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.tantanapp.common.utils.NullChecker;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class x6d0 extends spl0 {

    /* JADX INFO: renamed from: i */
    public static volatile x6d0 f192572i;

    /* JADX INFO: renamed from: b */
    public jxd0 f192573b;

    /* JADX INFO: renamed from: c */
    public boolean f192574c;

    /* JADX INFO: renamed from: d */
    public jxd0 f192575d;

    /* JADX INFO: renamed from: e */
    public jxd0 f192576e;

    /* JADX INFO: renamed from: f */
    public C22508b<String> f192577f;

    /* JADX INFO: renamed from: g */
    public boolean f192578g;

    /* JADX INFO: renamed from: h */
    public boolean f192579h;

    public x6d0() {
        String str = "have_show_hide_local_guide_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f192573b = new jxd0(str, bool);
        this.f192575d = new jxd0("can_show_real_pic_tips" + CoreModule.m30929H().userId(), bool);
        this.f192576e = new jxd0("can_show_real_id_and_pic_tips" + CoreModule.m30929H().userId(), bool);
        this.f192577f = C22508b.m222767b();
        this.f192578g = false;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m209468c0(String str, Act act) {
        i4g0.m138523u("e_svip_trial_end_popup_confirm", "p_svip_trial_end_popup", jyb.m147494Y("each_prop", y6d0.m214467f(str)));
        CoreModule.m30933P().m143405a().mo34568pr(act, "p_svip_trial_end_popup,e_svip_trial_end_popup_confirm,click", y6d0.m214465d(str));
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m209469d0(l4g0 l4g0Var, x20 x20Var) {
        w1e.m204401e(l4g0Var);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m209470e0(final String str, final Act act, final String str2) {
        i4g0.m138523u("e_svip_trial_popup_confirm", "p_svip_trial_popup", jyb.m147494Y("each_prop", y6d0.m214467f(str)));
        CoreModule.f18264c.f20433v1.m117810j3(str, Boolean.TRUE).subscribe(psd0.m173596G(new y20() { // from class: l.w6d0
            @Override // p153l.y20
            public final void call(Object obj) {
                x6d0.m209474i0(act, str, str2, (FreeTrialOperateResult) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m209473h0(String str) {
        i4g0.m138523u("e_svip_trial_popup_cancel", "p_svip_trial_popup", jyb.m147494Y("each_prop", y6d0.m214467f(str)));
        CoreModule.f18264c.f20433v1.m117810j3(str, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m209474i0(Act act, String str, String str2, FreeTrialOperateResult freeTrialOperateResult) {
        if ("success".equals(freeTrialOperateResult.operateResult)) {
            y6d0.m214481t(act, str, str2);
        } else {
            if (jyb.m147481L(freeTrialOperateResult.msg)) {
                return;
            }
            r1j0.m179420g(freeTrialOperateResult.msg);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static x6d0 m209475l0() {
        if (f192572i == null) {
            synchronized (x6d0.class) {
                try {
                    if (f192572i == null) {
                        f192572i = new x6d0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f192572i;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m209476u0(final Act act, final String str, final x20 x20Var, final String str2) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_svip_trial_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("each_prop", y6d0.m214467f(str)));
        new z8j.C21778a(act).m218989l(y6d0.m214466e(str)).m218994q(y6d0.m214469h(str)).m218996s(y6d0.m214474m(str)).m218995r(y6d0.m214473l(str)).m218992o("立即开启", new x20() { // from class: l.t6d0
            @Override // p153l.x20
            public final void call() {
                x6d0.m209470e0(str, act, str2);
            }
        }).m218991n("不，谢谢", new x20() { // from class: l.u6d0
            @Override // p153l.x20
            public final void call() {
                x6d0.m209473h0(str);
            }
        }).m218990m("haveRead".equals(str) ? null : "*试用期间可在筛选页关闭此功能").m218993p(new x20() { // from class: l.v6d0
            @Override // p153l.x20
            public final void call() {
                x6d0.m209469d0(l4g0VarM204399c, x20Var);
            }
        }).m218997t();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: j0 */
    public void m209477j0() {
        if (CoreModule.f18264c.f20433v1.m117813m3("haveRead", "opening")) {
            dt8 dt8Var = CoreModule.f18264c.f20433v1;
            dt8Var.m117822v3(dt8Var.m117815o3() + 1);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m209478k0() {
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m209479m0() {
        FreeTrialConfig freeTrialConfigM117814n3 = CoreModule.f18264c.f20433v1.m117814n3("haveRead");
        if (!NullChecker.m82486a(freeTrialConfigM117814n3)) {
            return false;
        }
        int i = freeTrialConfigM117814n3.benefitCount;
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public void m209480n0(boolean z) {
        this.f192579h = z;
    }

    /* JADX INFO: renamed from: o0 */
    public void m209481o0(boolean z) {
        this.f192578g = z;
    }

    /* JADX INFO: renamed from: p0 */
    public void m209482p0(boolean z) {
        this.f192576e.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: q0 */
    public void m209483q0(boolean z) {
        this.f192575d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: r0 */
    public void m209484r0(Act act) {
        int iM117815o3 = CoreModule.f18264c.f20433v1.m117815o3();
        FreeTrialConfig freeTrialConfigM117814n3 = CoreModule.f18264c.f20433v1.m117814n3("haveRead");
        if (iM117815o3 > (NullChecker.m82486a(freeTrialConfigM117814n3) ? freeTrialConfigM117814n3.benefitCount : 0)) {
            m209485s0(act, "haveRead");
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m209485s0(final Act act, final String str) {
        m209483q0(false);
        m209482p0(false);
        m209480n0(false);
        CoreModule.f18264c.f20433v1.m117810j3(str, Boolean.FALSE);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_svip_trial_end_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("each_prop", y6d0.m214467f(str)));
        new z8j.C21778a(act).m218989l(y6d0.m214466e(str)).m218994q(y6d0.m214469h(str)).m218996s(y6d0.m214472k(str)).m218995r(y6d0.m214471j(str)).m218992o("继续使用", new x20() { // from class: l.q6d0
            @Override // p153l.x20
            public final void call() {
                x6d0.m209468c0(str, act);
            }
        }).m218991n("不，谢谢", new x20() { // from class: l.r6d0
            @Override // p153l.x20
            public final void call() {
                i4g0.m138523u("e_svip_trial_end_popup_cancel", "p_svip_trial_end_popup", jyb.m147494Y("each_prop", y6d0.m214467f(str)));
            }
        }).m218993p(new x20() { // from class: l.s6d0
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m218997t();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: t0 */
    public void m209486t0(Act act, String str, String str2) {
        m209476u0(act, str, null, str2);
    }
}
