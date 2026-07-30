package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.TickleSettingInfo;
import com.p1.mobile.putong.core.data.TicklesStatus;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.hpd0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.y19;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class kme0 extends jq2<pme0> {

    /* JADX INFO: renamed from: a */
    public String f15903a;

    /* JADX INFO: renamed from: b */
    public boolean f15904b;

    /* JADX INFO: renamed from: c */
    public boolean f15905c;

    /* JADX INFO: renamed from: d */
    public String f15906d;

    /* JADX INFO: renamed from: e */
    public String f15907e;

    /* JADX INFO: renamed from: f */
    public TicklesStatus f15908f;

    /* JADX INFO: renamed from: g */
    public TicklesStatus f15909g;

    public kme0(mcr mcrVar) {
        super(mcrVar);
        this.f15906d = "";
        this.f15907e = "";
        this.f15908f = null;
        this.f15909g = null;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m18198i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m18201o0(Envelope envelope) {
        String str;
        this.f15904b = true;
        ((pme0) ((jq2) this).viewModel).m21612w();
        ((pme0) ((jq2) this).viewModel).m21611v();
        List<TickleSettingInfo> list = envelope.getModuleData(CoreData.class).tickles;
        String str2 = "";
        if (vwb.J(list)) {
            str = "";
        } else {
            str = "";
            for (TickleSettingInfo tickleSettingInfo : list) {
                if (TextUtils.equals(tickleSettingInfo.receiver, CoreModule.m1850H().userId()) && !TextUtils.isEmpty(tickleSettingInfo.receiverSuffix)) {
                    str2 = tickleSettingInfo.receiverSuffix;
                    this.f15908f = tickleSettingInfo.status;
                    this.f15906d = str2;
                } else if (!TextUtils.isEmpty(tickleSettingInfo.receiverSuffix)) {
                    str = tickleSettingInfo.receiverSuffix;
                    this.f15909g = tickleSettingInfo.status;
                    this.f15907e = str;
                }
            }
        }
        ((pme0) ((jq2) this).viewModel).m21613x(str2, this.f15908f, str, this.f15909g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m18202p0(Bundle bundle) {
        ((pme0) ((jq2) this).viewModel).m21608r();
    }

    /* JADX INFO: renamed from: Z */
    public void m18203Z() {
        super.Z();
        String stringExtra = act().getIntent().getStringExtra("clap_user_id");
        this.f15903a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            act().finish();
        }
        act().duringCreated(CoreModule.f1534c.f3628e0.m21373Ka(this.f15903a).take(1)).subscribe(mkd0.G(new e30() { // from class: l.dme0
            public final void call(Object obj) {
                this.f10479a.m18207n0((User) obj);
            }
        }));
        act().duringCreated(CoreModule.f1534c.f3631f0.m5111xg(this.f15903a)).subscribe(mkd0.H(new e30() { // from class: l.eme0
            public final void call(Object obj) {
                this.f11274a.m18201o0((Envelope) obj);
            }
        }, new e30() { // from class: l.fme0
            public final void call(Object obj) {
                kme0.m18198i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m18204a0() {
        super.a0();
        creates(new e30() { // from class: l.gme0
            public final void call(Object obj) {
                this.f13388a.m18202p0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m18205l0() {
        return this.f15904b;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m18206m0() {
        return this.f15905c;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ c m18208q0(String str, String str2, Long l2) {
        return CoreModule.f1534c.f3631f0.m4581Fp(this.f15903a, str, str2, this.f15906d, this.f15907e);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m18209r0(String str, String str2, roj0 roj0Var) {
        String str3;
        if (TextUtils.equals(this.f15906d, str) || TextUtils.equals(str2, this.f15907e)) {
            str3 = !TextUtils.equals(this.f15906d, str) ? "general_tickle" : "special_tickle";
        } else {
            str3 = "both";
        }
        o6j0.c("e_finish_tickle", "p_my_tickle", new o6j0.a[]{o6j0.a.h("finish_tickle", str3)});
        hpd0 hpd0Var = CoreModule.f1534c.f3620b1.f15661R;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        CoreModule.f1534c.f3628e0.f18962d1.put(bool);
        act().progressDismiss();
        act().finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m18210s0(Throwable th) {
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
            lsi0.y(CoreModule.f1533b.getString(R.string.U5));
        } else if (i == 40399) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m18211t0(final String str, final String str2) {
        if (TextUtils.equals(this.f15906d, str) && TextUtils.equals(str2, this.f15907e)) {
            act().finish();
        } else {
            act().progress(R.string.I2);
            duringCreated(c.timer(500L, TimeUnit.MILLISECONDS).flatMap(new w9j() { // from class: l.hme0
                public final Object call(Object obj) {
                    return this.f13942a.m18208q0(str, str2, (Long) obj);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.ime0
                public final void call(Object obj) {
                    this.f14561a.m18209r0(str, str2, (roj0) obj);
                }
            }, new e30() { // from class: l.jme0
                public final void call(Object obj) {
                    this.f15268a.m18210s0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m18212u0(boolean z) {
        this.f15905c = z;
    }

    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final void m18207n0(User user) {
        if (!y19.H()) {
            ((pme0) ((jq2) this).viewModel).m21614y(user.name);
            return;
        }
        String strM21524y7 = CoreModule.f1534c.f3628e0.m21524y7(((DbObject) user).id);
        if (!TextUtils.isEmpty(strM21524y7)) {
            ((pme0) ((jq2) this).viewModel).m21614y(strM21524y7);
        } else if (!NullChecker.a(user) || user.inactivated || user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
            ((pme0) ((jq2) this).viewModel).m21614y("ta");
        } else {
            ((pme0) ((jq2) this).viewModel).m21614y(user.name);
        }
    }

    public void destroy() {
    }
}
