package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;

/* JADX INFO: loaded from: classes11.dex */
public class p1n0 extends ar2<q2n0> {

    /* JADX INFO: renamed from: b */
    public static final String[] f150185b;

    /* JADX INFO: renamed from: a */
    public String f150186a;

    static {
        f150185b = !wzx.m208784k() ? new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.RECORD_AUDIO"};
    }

    public p1n0(ner nerVar) {
        super(nerVar);
        this.f150186a = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m170218A0(Bundle bundle) {
        xzm0.m213760p().m213764g();
        PermissionHelper.m81065c().m81083r(f150185b).m81088w(false).m81086u(true).m81078m(new x20() { // from class: l.g1n0
            @Override // p153l.x20
            public final void call() {
                jpd0.m146490e();
            }
        }, new y20() { // from class: l.h1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                p1n0.m170228n0((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81074i(((q2n0) this.viewModel).act());
        ((q2n0) this.viewModel).m175086r();
        ((q2n0) this.viewModel).m175080F(w1n0.m204456c());
        ((q2n0) this.viewModel).m175081G(w1n0.m204459f());
        m170238J0();
        m170248y0();
        duringCreated(uqx.m197379C().f180530l).filter(new qcj() { // from class: l.i1n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() > 0);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.j1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117978a.m170249z0((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m170219e0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m170224j0(x20 x20Var, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (x20Var == null || !z) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m170228n0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: t0 */
    private String m170230t0(int i) {
        return CoreModule.f18263b.getResources().getString(i);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m170231C0() {
        ((q2n0) this.viewModel).act().m68056e2();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m170232D0(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            boolean zM213774r = xzm0.m213760p().m213774r();
            String str = this.f150186a;
            if (zM213774r) {
                m170239L0(str);
                this.f150186a = "p_voice_call";
                m170240N0("p_voice_call");
                ((q2n0) this.viewModel).m175076A();
                return;
            }
            m170239L0(str);
            this.f150186a = "p_voice_callme";
            m170240N0("p_voice_callme");
            ((q2n0) this.viewModel).m175087z();
            return;
        }
        if (iIntValue == 2) {
            ((q2n0) this.viewModel).m175079E(m170230t0(R$string.f21702e7));
            return;
        }
        if (iIntValue != 3) {
            if (iIntValue != 4) {
                return;
            }
            ((q2n0) this.viewModel).act().postDelayed(new Runnable() { // from class: l.o1n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144674a.m170231C0();
                }
            }, 1000L);
        } else {
            ((q2n0) this.viewModel).m175081G(w1n0.m204459f());
            ((q2n0) this.viewModel).m175080F(w1n0.m204456c());
            m170239L0(this.f150186a);
            this.f150186a = "p_voice_talking";
            m170240N0("p_voice_talking");
            ((q2n0) this.viewModel).m175077B();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m170233E0() {
        m170239L0(this.f150186a);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m170234F0(User user) {
        ((q2n0) this.viewModel).m175078C(user);
    }

    /* JADX INFO: renamed from: G0 */
    public void m170235G0() {
        boolean zM204459f = w1n0.m204459f();
        boolean z = !zM204459f;
        sfj0.m185596c("e_voice_talking_mute", "p_voice_talking", sfj0.C20032a.m185615h("mute_handsfree", !zM204459f ? "on" : BLiveOperationTitleShowType.off));
        w1n0.m204461h(z);
        ((q2n0) this.viewModel).m175081G(w1n0.m204459f());
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m170236H0(final x20 x20Var) {
        String[] strArr = f150185b;
        if (PermissionHelper.m81064b(strArr)) {
            return false;
        }
        PermissionHelper.m81065c().m81083r(strArr).m81086u(true).m81077l(new PermissionHelper.InterfaceC13292b() { // from class: l.f1n0
            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                p1n0.m170224j0(x20Var, z, permissionDeniedReason);
            }
        }).m81074i(((q2n0) this.viewModel).act());
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public void m170237I0() {
        if (TextUtils.isEmpty(this.f150186a)) {
            return;
        }
        sfj0.m185596c("e_voice_small", this.f150186a, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: J0 */
    public void m170238J0() {
        duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(xzm0.m213760p().m213770m())).subscribe(psd0.m173596G(new y20() { // from class: l.n1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139776a.m170234F0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L0 */
    public void m170239L0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l4g0 l4g0Var = new l4g0(str, VoiceCallAct.class.getName());
        l4g0Var.m152776k();
        l4g0Var.m152775j();
    }

    /* JADX INFO: renamed from: N0 */
    public void m170240N0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l4g0 l4g0Var = new l4g0(str, VoiceCallAct.class.getName());
        l4g0Var.m152774i();
        l4g0Var.m152777l();
    }

    /* JADX INFO: renamed from: O0 */
    public void m170241O0() {
        if (!TextUtils.isEmpty(this.f150186a)) {
            sfj0.m185596c("e_voice_small", this.f150186a, new sfj0.C20032a[0]);
        }
        ((q2n0) this.viewModel).act().m68056e2();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.e1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91640a.m170218A0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m170242p0() {
        xzm0.m213760p().m213771n();
        ((q2n0) this.viewModel).act().m68056e2();
    }

    /* JADX INFO: renamed from: q0 */
    public void m170243q0() {
        xzm0.m213760p().m213771n();
    }

    /* JADX INFO: renamed from: r0 */
    public void m170244r0() {
        xzm0.m213760p().m213771n();
        ((q2n0) this.viewModel).act().m68056e2();
    }

    /* JADX INFO: renamed from: s0 */
    public Pair<Boolean, Integer> m170245s0() {
        String strM213770m = xzm0.m213760p().m213770m();
        if (CoreModule.m30933P().m143412i().mo180570z(strM213770m)) {
            return Pair.create(Boolean.TRUE, Integer.valueOf(R$string.f21495F4));
        }
        return o3z.m165898g().m165901e(strM213770m) ? Pair.create(Boolean.TRUE, Integer.valueOf(R$string.f21503G4)) : Pair.create(Boolean.FALSE, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m170246u0() {
        boolean zM204456c = w1n0.m204456c();
        boolean z = !zM204456c;
        sfj0.m185596c("e_voice_talking_open", "p_voice_talking", sfj0.C20032a.m185615h("mute_handsfree", !zM204456c ? "on" : BLiveOperationTitleShowType.off));
        w1n0.m204460g(z);
        ((q2n0) this.viewModel).m175080F(w1n0.m204456c());
        o1j0.m165651y(w1n0.m204456c() ? m170230t0(R$string.f21720g7) : m170230t0(R$string.f21711f7));
    }

    /* JADX INFO: renamed from: x0 */
    public void m170247x0() {
        xzm0.m213760p().m213762e();
    }

    /* JADX INFO: renamed from: y0 */
    public void m170248y0() {
        duringCreated(xzm0.m213760p().m213766i()).subscribe(psd0.m173596G(new y20() { // from class: l.k1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123519a.m170232D0((Integer) obj);
            }
        }));
        creates(new y20() { // from class: l.l1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                p1n0.m170219e0((Bundle) obj);
            }
        }, new x20() { // from class: l.m1n0
            @Override // p153l.x20
            public final void call() {
                this.f134450a.m170233E0();
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m170249z0(Long l2) {
        ((q2n0) this.viewModel).m175079E(w1n0.m204455b(l2.longValue()));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
