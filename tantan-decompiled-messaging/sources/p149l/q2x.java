package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.marry.audit.MarryInfoAuditStatusAct;
import com.p046p1.mobile.putong.core.p053ui.marry.status.MarryStatusSetAct;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.Purpose;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q2x extends jq2<u2x> {

    /* JADX INFO: renamed from: a */
    public List<j760<Purpose, String>> f152324a;

    public q2x(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: k0 */
    private void m172525k0() {
        ArrayList arrayList = new ArrayList();
        this.f152324a = arrayList;
        arrayList.add(j760.m140076a(Purpose.get(Purpose.thinking), ""));
        this.f152324a.add(j760.m140076a(Purpose.get("friend"), ""));
        this.f152324a.add(j760.m140076a(Purpose.get("date"), ""));
        this.f152324a.add(j760.m140076a(Purpose.get("relationship"), ""));
        this.f152324a.add(j760.m140076a(Purpose.get("marriage"), "in_one_year"));
        this.f152324a.add(j760.m140076a(Purpose.get("marriage"), "in_two_years"));
        this.f152324a.add(j760.m140076a(Purpose.get("marriage"), "at_right_time"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m172526n0(Bundle bundle) {
        ((u2x) this.viewModel).m191556r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m172525k0();
        creates(new e30() { // from class: l.n2x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136882a.m172526n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public MarryStatusSetAct m172527h0() {
        return (MarryStatusSetAct) super.act();
    }

    /* JADX INFO: renamed from: i0 */
    public void m172528i0(int i) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        if (!NullChecker.m81303a(userMo223809clone.profile)) {
            userMo223809clone.profile = new Profile();
        }
        if (!NullChecker.m81303a(userMo223809clone.profile.extensions)) {
            userMo223809clone.profile.extensions = new Extensions();
        }
        if (!NullChecker.m81303a(userMo223809clone.profile.extensions.basic)) {
            userMo223809clone.profile.extensions.basic = new ProfileExtensionBasic();
        }
        final j760<Purpose, String> j760Var = this.f152324a.get(i);
        userMo223809clone.profile.extensions.basic.friendPurpose = vwb.m200299M(j760Var.f116564a);
        if (TEnum.equals(j760Var.f116564a, "marriage")) {
            if (!NullChecker.m81303a(userMo223809clone.profile.extensions.marriage)) {
                userMo223809clone.profile.extensions.marriage = new ProfileExtensionMarriage();
            }
            userMo223809clone.profile.extensions.marriage.expectedTime = vwb.m200299M(j760Var.f116565b);
        }
        User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169520na());
        if (!NullChecker.m81303a(userSubtract)) {
            m172529j0(j760Var.f116564a);
        } else {
            m172527h0().progress(R$string.f17842J5);
            duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.o2x
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141562a.m172530l0(j760Var, (roj0) obj);
                }
            }, new e30() { // from class: l.p2x
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146936a.m172531m0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m172529j0(Purpose purpose) {
        if (TEnum.equals(purpose, "marriage")) {
            m172527h0().startActivity(MarryInfoAuditStatusAct.m47401Z1(m172527h0(), "purpose_switching"));
            m172527h0().m66873d2();
        }
        m172527h0().m66873d2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m172530l0(j760 j760Var, roj0 roj0Var) {
        m172527h0().progressDismiss();
        m172529j0((Purpose) j760Var.f116564a);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m172531m0(Throwable th) {
        m172527h0().progressDismiss();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
