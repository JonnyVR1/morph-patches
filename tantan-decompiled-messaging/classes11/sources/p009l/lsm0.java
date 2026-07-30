package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import l.cwf0;
import l.d30;
import l.e30;
import l.ghd0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.ruy;
import l.w9j;
import l.xhx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lsm0 extends jq2<mtm0> {

    /* JADX INFO: renamed from: b */
    public static final String[] f16399b;

    /* JADX INFO: renamed from: a */
    public String f16400a;

    static {
        f16399b = !zqx.m25938k() ? new String[]{"android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.RECORD_AUDIO"};
    }

    public lsm0(mcr mcrVar) {
        super(mcrVar);
        this.f16400a = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m18012A0(Bundle bundle) {
        tqm0.m22637p().m22641g();
        PermissionHelper.m10211c().m10229r(f16399b).m10234w(false).m10232u(true).m10224m(new d30() { // from class: l.csm0
            public final void call() {
                ghd0.e();
            }
        }, new e30() { // from class: l.dsm0
            public final void call(Object obj) {
                lsm0.m18022n0((PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m10220i(((mtm0) ((jq2) this).viewModel).act());
        ((mtm0) ((jq2) this).viewModel).m18625r();
        ((mtm0) ((jq2) this).viewModel).m18618F(ssm0.m22367c());
        ((mtm0) ((jq2) this).viewModel).m18619G(ssm0.m22370f());
        m18032J0();
        m18043y0();
        duringCreated(xhx.C().l).filter(new w9j() { // from class: l.esm0
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() > 0);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.fsm0
            public final void call(Object obj) {
                this.f13153a.m18044z0((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m18013e0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m18018j0(d30 d30Var, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (d30Var == null || !z) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m18022n0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: t0 */
    private String m18024t0(int i) {
        return CoreModule.b.getResources().getString(i);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m18025C0() {
        ((mtm0) ((jq2) this).viewModel).act().finish();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m18026D0(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            boolean zM22651r = tqm0.m22637p().m22651r();
            String str = this.f16400a;
            if (zM22651r) {
                m18033L0(str);
                this.f16400a = "p_voice_call";
                m18034N0("p_voice_call");
                ((mtm0) ((jq2) this).viewModel).m18613A();
                return;
            }
            m18033L0(str);
            this.f16400a = "p_voice_callme";
            m18034N0("p_voice_callme");
            ((mtm0) ((jq2) this).viewModel).m18626z();
            return;
        }
        if (iIntValue == 2) {
            ((mtm0) ((jq2) this).viewModel).m18617E(m18024t0(R.string.e7));
            return;
        }
        if (iIntValue != 3) {
            if (iIntValue != 4) {
                return;
            }
            ((mtm0) ((jq2) this).viewModel).act().postDelayed(new Runnable() { // from class: l.ksm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15839a.m18025C0();
                }
            }, 1000L);
        } else {
            ((mtm0) ((jq2) this).viewModel).m18619G(ssm0.m22370f());
            ((mtm0) ((jq2) this).viewModel).m18618F(ssm0.m22367c());
            m18033L0(this.f16400a);
            this.f16400a = "p_voice_talking";
            m18034N0("p_voice_talking");
            ((mtm0) ((jq2) this).viewModel).m18614B();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m18027E0() {
        m18033L0(this.f16400a);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m18028F0(User user) {
        ((mtm0) ((jq2) this).viewModel).m18615C(user);
    }

    /* JADX INFO: renamed from: G0 */
    public void m18029G0() {
        boolean zM22370f = ssm0.m22370f();
        boolean z = !zM22370f;
        o6j0.c("e_voice_talking_mute", "p_voice_talking", new o6j0.a[]{o6j0.a.h("mute_handsfree", !zM22370f ? "on" : "off")});
        ssm0.m22372h(z);
        ((mtm0) ((jq2) this).viewModel).m18619G(ssm0.m22370f());
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m18030H0(final d30 d30Var) {
        String[] strArr = f16399b;
        if (PermissionHelper.m10210b(strArr)) {
            return false;
        }
        PermissionHelper.m10211c().m10229r(strArr).m10232u(true).m10223l(new PermissionHelper.InterfaceC0531b() { // from class: l.bsm0
            @Override // com.p000p1.mobile.putong.p004ui.permission.PermissionHelper.InterfaceC0531b
            /* JADX INFO: renamed from: a */
            public final void mo10235a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                lsm0.m18018j0(d30Var, z, permissionDeniedReason);
            }
        }).m10220i(((mtm0) ((jq2) this).viewModel).act());
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public void m18031I0() {
        if (TextUtils.isEmpty(this.f16400a)) {
            return;
        }
        o6j0.c("e_voice_small", this.f16400a, new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: J0 */
    public void m18032J0() {
        duringCreated(CoreModule.c.e0.Ka(tqm0.m22637p().m22647m())).subscribe(mkd0.G(new e30() { // from class: l.jsm0
            public final void call(Object obj) {
                this.f15275a.m18028F0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L0 */
    public void m18033L0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cwf0 cwf0Var = new cwf0(str, VoiceCallAct.class.getName());
        cwf0Var.k();
        cwf0Var.j();
    }

    /* JADX INFO: renamed from: N0 */
    public void m18034N0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cwf0 cwf0Var = new cwf0(str, VoiceCallAct.class.getName());
        cwf0Var.i();
        cwf0Var.l();
    }

    /* JADX INFO: renamed from: O0 */
    public void m18035O0() {
        if (!TextUtils.isEmpty(this.f16400a)) {
            o6j0.c("e_voice_small", this.f16400a, new o6j0.a[0]);
        }
        ((mtm0) ((jq2) this).viewModel).act().finish();
    }

    /* JADX INFO: renamed from: a0 */
    public void m18036a0() {
        super.a0();
        creates(new e30() { // from class: l.asm0
            public final void call(Object obj) {
                this.f9667a.m18012A0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m18037p0() {
        tqm0.m22637p().m22648n();
        ((mtm0) ((jq2) this).viewModel).act().finish();
    }

    /* JADX INFO: renamed from: q0 */
    public void m18038q0() {
        tqm0.m22637p().m22648n();
    }

    /* JADX INFO: renamed from: r0 */
    public void m18039r0() {
        tqm0.m22637p().m22648n();
        ((mtm0) ((jq2) this).viewModel).act().finish();
    }

    /* JADX INFO: renamed from: s0 */
    public Pair<Boolean, Integer> m18040s0() {
        String strM22647m = tqm0.m22637p().m22647m();
        if (CoreModule.P().i().z(strM22647m)) {
            return Pair.create(Boolean.TRUE, Integer.valueOf(R.string.F4));
        }
        return ruy.g().e(strM22647m) ? Pair.create(Boolean.TRUE, Integer.valueOf(R.string.G4)) : Pair.create(Boolean.FALSE, 0);
    }

    /* JADX INFO: renamed from: u0 */
    public void m18041u0() {
        boolean zM22367c = ssm0.m22367c();
        boolean z = !zM22367c;
        o6j0.c("e_voice_talking_open", "p_voice_talking", new o6j0.a[]{o6j0.a.h("mute_handsfree", !zM22367c ? "on" : "off")});
        ssm0.m22371g(z);
        ((mtm0) ((jq2) this).viewModel).m18618F(ssm0.m22367c());
        lsi0.y(ssm0.m22367c() ? m18024t0(R.string.g7) : m18024t0(R.string.f7));
    }

    /* JADX INFO: renamed from: x0 */
    public void m18042x0() {
        tqm0.m22637p().m22639e();
    }

    /* JADX INFO: renamed from: y0 */
    public void m18043y0() {
        duringCreated(tqm0.m22637p().m22643i()).subscribe(mkd0.G(new e30() { // from class: l.gsm0
            public final void call(Object obj) {
                this.f13715a.m18026D0((Integer) obj);
            }
        }));
        creates(new e30() { // from class: l.hsm0
            public final void call(Object obj) {
                lsm0.m18013e0((Bundle) obj);
            }
        }, new d30() { // from class: l.ism0
            public final void call() {
                this.f14788a.m18027E0();
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m18044z0(Long l2) {
        ((mtm0) ((jq2) this).viewModel).m18617E(ssm0.m22366b(l2.longValue()));
    }

    public void destroy() {
    }
}
