package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.TickleSettingInfo;
import com.p046p1.mobile.putong.core.data.TicklesStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class kme0 extends jq2<pme0> {

    /* JADX INFO: renamed from: a */
    public String f123786a;

    /* JADX INFO: renamed from: b */
    public boolean f123787b;

    /* JADX INFO: renamed from: c */
    public boolean f123788c;

    /* JADX INFO: renamed from: d */
    public String f123789d;

    /* JADX INFO: renamed from: e */
    public String f123790e;

    /* JADX INFO: renamed from: f */
    public TicklesStatus f123791f;

    /* JADX INFO: renamed from: g */
    public TicklesStatus f123792g;

    public kme0(mcr mcrVar) {
        super(mcrVar);
        this.f123789d = "";
        this.f123790e = "";
        this.f123791f = null;
        this.f123792g = null;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m146516i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m146519o0(Envelope envelope) {
        String str;
        this.f123787b = true;
        ((pme0) this.viewModel).m170320w();
        ((pme0) this.viewModel).m170319v();
        List<TickleSettingInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).tickles;
        String str2 = "";
        if (vwb.m200296J(list)) {
            str = "";
        } else {
            str = "";
            for (TickleSettingInfo tickleSettingInfo : list) {
                if (TextUtils.equals(tickleSettingInfo.receiver, CoreModule.m29931H().userId()) && !TextUtils.isEmpty(tickleSettingInfo.receiverSuffix)) {
                    str2 = tickleSettingInfo.receiverSuffix;
                    this.f123791f = tickleSettingInfo.status;
                    this.f123789d = str2;
                } else if (!TextUtils.isEmpty(tickleSettingInfo.receiverSuffix)) {
                    str = tickleSettingInfo.receiverSuffix;
                    this.f123792g = tickleSettingInfo.status;
                    this.f123790e = str;
                }
            }
        }
        ((pme0) this.viewModel).m170321x(str2, this.f123791f, str, this.f123792g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m146520p0(Bundle bundle) {
        ((pme0) this.viewModel).m170316r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        String stringExtra = act().getIntent().getStringExtra("clap_user_id");
        this.f123786a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            act().m66873d2();
        }
        act().duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f123786a).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.dme0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86928a.m146523n0((User) obj);
            }
        }));
        act().duringCreated(CoreModule.f17545c.f19642f0.m33181xg(this.f123786a)).subscribe(mkd0.m154956H(new e30() { // from class: l.eme0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92199a.m146519o0((Envelope) obj);
            }
        }, new e30() { // from class: l.fme0
            @Override // p149l.e30
            public final void call(Object obj) {
                kme0.m146516i0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.gme0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103456a.m146520p0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m146521l0() {
        return this.f123787b;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m146522m0() {
        return this.f123788c;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22306c m146524q0(String str, String str2, Long l2) {
        return CoreModule.f17545c.f19642f0.m32651Fp(this.f123786a, str, str2, this.f123789d, this.f123790e);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m146525r0(String str, String str2, roj0 roj0Var) {
        String str3;
        if (TextUtils.equals(this.f123789d, str) || TextUtils.equals(str2, this.f123790e)) {
            str3 = !TextUtils.equals(this.f123789d, str) ? "general_tickle" : "special_tickle";
        } else {
            str3 = "both";
        }
        o6j0.m162859c("e_finish_tickle", "p_my_tickle", o6j0.C18854a.m162878h("finish_tickle", str3));
        hpd0 hpd0Var = CoreModule.f17545c.f19631b1.f121926R;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19639e0.f149350d1.put(bool);
        act().progressDismiss();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m146526s0(Throwable th) {
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            if (th instanceof TantanException.Client.CoreService) {
                act().progressDismiss();
                return;
            }
            return;
        }
        act().progressDismiss();
        int i = ((TantanException.Client.TantanForbidden) th).code;
        if (i == 40325) {
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f20874U5));
        } else if (i == 40399) {
            act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m146527t0(final String str, final String str2) {
        if (TextUtils.equals(this.f123789d, str) && TextUtils.equals(str2, this.f123790e)) {
            act().m66873d2();
        } else {
            act().progress(R$string.f20775I2);
            duringCreated((C22306c) C22306c.timer(500L, TimeUnit.MILLISECONDS).flatMap(new w9j() { // from class: l.hme0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f108415a.m146524q0(str, str2, (Long) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.ime0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f113913a.m146525r0(str, str2, (roj0) obj);
                }
            }, new e30() { // from class: l.jme0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118628a.m146526s0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m146528u0(boolean z) {
        this.f123788c = z;
    }

    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final void m146523n0(User user) {
        if (!y19.m212148H()) {
            ((pme0) this.viewModel).m170322y(user.name);
            return;
        }
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(user.f56011id);
        if (!TextUtils.isEmpty(strM169561y7)) {
            ((pme0) this.viewModel).m170322y(strM169561y7);
        } else if (!NullChecker.m81303a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
            ((pme0) this.viewModel).m170322y("ta");
        } else {
            ((pme0) this.viewModel).m170322y(user.name);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
