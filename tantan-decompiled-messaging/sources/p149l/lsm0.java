package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;

/* JADX INFO: loaded from: classes11.dex */
public class lsm0 extends jq2<mtm0> {

    /* JADX INFO: renamed from: b */
    public static final String[] f129883b;

    /* JADX INFO: renamed from: a */
    public String f129884a;

    static {
        f129883b = !zqx.m219898k() ? new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.RECORD_AUDIO"};
    }

    public lsm0(mcr mcrVar) {
        super(mcrVar);
        this.f129884a = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m151598A0(Bundle bundle) {
        tqm0.m190131p().m190135g();
        PermissionHelper.m79882c().m79900r(f129883b).m79905w(false).m79903u(true).m79895m(new d30() { // from class: l.csm0
            @Override // p149l.d30
            public final void call() {
                ghd0.m126181e();
            }
        }, new e30() { // from class: l.dsm0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsm0.m151608n0((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79891i(((mtm0) this.viewModel).act());
        ((mtm0) this.viewModel).m156307r();
        ((mtm0) this.viewModel).m156301F(ssm0.m185759c());
        ((mtm0) this.viewModel).m156302G(ssm0.m185762f());
        m151618J0();
        m151628y0();
        duringCreated(xhx.m208850C().f192943l).filter(new w9j() { // from class: l.esm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() > 0);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.fsm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99088a.m151629z0((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m151599e0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m151604j0(d30 d30Var, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (d30Var == null || !z) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m151608n0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: t0 */
    private String m151610t0(int i) {
        return CoreModule.f17544b.getResources().getString(i);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m151611C0() {
        ((mtm0) this.viewModel).act().m66873d2();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m151612D0(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            boolean zM190145r = tqm0.m190131p().m190145r();
            String str = this.f129884a;
            if (zM190145r) {
                m151619L0(str);
                this.f129884a = "p_voice_call";
                m151620N0("p_voice_call");
                ((mtm0) this.viewModel).m156297A();
                return;
            }
            m151619L0(str);
            this.f129884a = "p_voice_callme";
            m151620N0("p_voice_callme");
            ((mtm0) this.viewModel).m156308z();
            return;
        }
        if (iIntValue == 2) {
            ((mtm0) this.viewModel).m156300E(m151610t0(R$string.f20960e7));
            return;
        }
        if (iIntValue != 3) {
            if (iIntValue != 4) {
                return;
            }
            ((mtm0) this.viewModel).act().postDelayed(new Runnable() { // from class: l.ksm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124492a.m151611C0();
                }
            }, 1000L);
        } else {
            ((mtm0) this.viewModel).m156302G(ssm0.m185762f());
            ((mtm0) this.viewModel).m156301F(ssm0.m185759c());
            m151619L0(this.f129884a);
            this.f129884a = "p_voice_talking";
            m151620N0("p_voice_talking");
            ((mtm0) this.viewModel).m156298B();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m151613E0() {
        m151619L0(this.f129884a);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m151614F0(User user) {
        ((mtm0) this.viewModel).m156299C(user);
    }

    /* JADX INFO: renamed from: G0 */
    public void m151615G0() {
        boolean zM185762f = ssm0.m185762f();
        boolean z = !zM185762f;
        o6j0.m162859c("e_voice_talking_mute", "p_voice_talking", o6j0.C18854a.m162878h("mute_handsfree", !zM185762f ? "on" : BLiveOperationTitleShowType.off));
        ssm0.m185764h(z);
        ((mtm0) this.viewModel).m156302G(ssm0.m185762f());
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m151616H0(final d30 d30Var) {
        String[] strArr = f129883b;
        if (PermissionHelper.m79881b(strArr)) {
            return false;
        }
        PermissionHelper.m79882c().m79900r(strArr).m79903u(true).m79894l(new PermissionHelper.InterfaceC13129b() { // from class: l.bsm0
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                lsm0.m151604j0(d30Var, z, permissionDeniedReason);
            }
        }).m79891i(((mtm0) this.viewModel).act());
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public void m151617I0() {
        if (TextUtils.isEmpty(this.f129884a)) {
            return;
        }
        o6j0.m162859c("e_voice_small", this.f129884a, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: J0 */
    public void m151618J0() {
        duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(tqm0.m190131p().m190141m())).subscribe(mkd0.m154955G(new e30() { // from class: l.jsm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119525a.m151614F0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L0 */
    public void m151619L0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cwf0 cwf0Var = new cwf0(str, VoiceCallAct.class.getName());
        cwf0Var.m109035k();
        cwf0Var.m109034j();
    }

    /* JADX INFO: renamed from: N0 */
    public void m151620N0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cwf0 cwf0Var = new cwf0(str, VoiceCallAct.class.getName());
        cwf0Var.m109033i();
        cwf0Var.m109036l();
    }

    /* JADX INFO: renamed from: O0 */
    public void m151621O0() {
        if (!TextUtils.isEmpty(this.f129884a)) {
            o6j0.m162859c("e_voice_small", this.f129884a, new o6j0.C18854a[0]);
        }
        ((mtm0) this.viewModel).act().m66873d2();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.asm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71462a.m151598A0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m151622p0() {
        tqm0.m190131p().m190142n();
        ((mtm0) this.viewModel).act().m66873d2();
    }

    /* JADX INFO: renamed from: q0 */
    public void m151623q0() {
        tqm0.m190131p().m190142n();
    }

    /* JADX INFO: renamed from: r0 */
    public void m151624r0() {
        tqm0.m190131p().m190142n();
        ((mtm0) this.viewModel).act().m66873d2();
    }

    /* JADX INFO: renamed from: s0 */
    public Pair<Boolean, Integer> m151625s0() {
        String strM190141m = tqm0.m190131p().m190141m();
        if (CoreModule.m29935P().m94658i().mo158478z(strM190141m)) {
            return Pair.create(Boolean.TRUE, Integer.valueOf(R$string.f20753F4));
        }
        return ruy.m181215g().m181218e(strM190141m) ? Pair.create(Boolean.TRUE, Integer.valueOf(R$string.f20761G4)) : Pair.create(Boolean.FALSE, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m151626u0() {
        boolean zM185759c = ssm0.m185759c();
        boolean z = !zM185759c;
        o6j0.m162859c("e_voice_talking_open", "p_voice_talking", o6j0.C18854a.m162878h("mute_handsfree", !zM185759c ? "on" : BLiveOperationTitleShowType.off));
        ssm0.m185763g(z);
        ((mtm0) this.viewModel).m156301F(ssm0.m185759c());
        lsi0.m151595y(ssm0.m185759c() ? m151610t0(R$string.f20978g7) : m151610t0(R$string.f20969f7));
    }

    /* JADX INFO: renamed from: x0 */
    public void m151627x0() {
        tqm0.m190131p().m190133e();
    }

    /* JADX INFO: renamed from: y0 */
    public void m151628y0() {
        duringCreated(tqm0.m190131p().m190137i()).subscribe(mkd0.m154955G(new e30() { // from class: l.gsm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104189a.m151612D0((Integer) obj);
            }
        }));
        creates(new e30() { // from class: l.hsm0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsm0.m151599e0((Bundle) obj);
            }
        }, new d30() { // from class: l.ism0
            @Override // p149l.d30
            public final void call() {
                this.f114781a.m151613E0();
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m151629z0(Long l2) {
        ((mtm0) this.viewModel).m156300E(ssm0.m185758b(l2.longValue()));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
