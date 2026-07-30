package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.marry.audit.MarryInfoAuditStatusAct;
import com.p000p1.mobile.putong.core.p001ui.marry.status.MarryStatusSetAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class q2x extends jq2<u2x> {

    /* JADX INFO: renamed from: a */
    public List<j760<Purpose, String>> f6580a;

    public q2x(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: k0 */
    private void m6993k0() {
        ArrayList arrayList = new ArrayList();
        this.f6580a = arrayList;
        arrayList.add(j760.a(Purpose.get("thinking"), ""));
        this.f6580a.add(j760.a(Purpose.get("friend"), ""));
        this.f6580a.add(j760.a(Purpose.get("date"), ""));
        this.f6580a.add(j760.a(Purpose.get("relationship"), ""));
        this.f6580a.add(j760.a(Purpose.get("marriage"), "in_one_year"));
        this.f6580a.add(j760.a(Purpose.get("marriage"), "in_two_years"));
        this.f6580a.add(j760.a(Purpose.get("marriage"), "at_right_time"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m6994n0(Bundle bundle) {
        ((u2x) ((jq2) this).viewModel).m8098r();
    }

    /* JADX INFO: renamed from: Z */
    public void m6995Z() {
        super.Z();
        m6993k0();
        creates(new e30() { // from class: l.n2x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5825a.m6994n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public MarryStatusSetAct m6996h0() {
        return super.act();
    }

    /* JADX INFO: renamed from: i0 */
    public void m6997i0(int i) {
        User userClone = CoreModule.c.e0.na().clone();
        if (!NullChecker.a(userClone.profile)) {
            userClone.profile = new Profile();
        }
        if (!NullChecker.a(userClone.profile.extensions)) {
            userClone.profile.extensions = new Extensions();
        }
        if (!NullChecker.a(userClone.profile.extensions.basic)) {
            userClone.profile.extensions.basic = new ProfileExtensionBasic();
        }
        final j760<Purpose, String> j760Var = this.f6580a.get(i);
        userClone.profile.extensions.basic.friendPurpose = vwb.M((Purpose) j760Var.a);
        if (TEnum.equals((Purpose) j760Var.a, "marriage")) {
            if (!NullChecker.a(userClone.profile.extensions.marriage)) {
                userClone.profile.extensions.marriage = new ProfileExtensionMarriage();
            }
            userClone.profile.extensions.marriage.expectedTime = vwb.M((String) j760Var.b);
        }
        User userSubtract = userClone.subtract(CoreModule.c.e0.na());
        if (!NullChecker.a(userSubtract)) {
            m6998j0((Purpose) j760Var.a);
        } else {
            m6996h0().progress(R.string.J5);
            duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe((m250) mkd0.H(new e30() { // from class: l.o2x
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6027a.m6999l0(j760Var, (roj0) obj);
                }
            }, new e30() { // from class: l.p2x
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6307a.m7000m0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m6998j0(Purpose purpose) {
        if (TEnum.equals(purpose, "marriage")) {
            m6996h0().startActivity(MarryInfoAuditStatusAct.m440Z1(m6996h0(), "purpose_switching"));
            m6996h0().finish();
        }
        m6996h0().finish();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m6999l0(j760 j760Var, roj0 roj0Var) {
        m6996h0().progressDismiss();
        m6998j0((Purpose) j760Var.a);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m7000m0(Throwable th) {
        m6996h0().progressDismiss();
    }

    public void destroy() {
    }
}
