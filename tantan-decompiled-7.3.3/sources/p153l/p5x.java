package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.marry.audit.MarryInfoAuditStatusAct;
import com.p051p1.mobile.putong.core.p058ui.marry.status.MarryStatusSetAct;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.Purpose;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class p5x extends ar2<t5x> {

    /* JADX INFO: renamed from: a */
    public List<pf60<Purpose, String>> f150704a;

    public p5x(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: k0 */
    private void m170694k0() {
        ArrayList arrayList = new ArrayList();
        this.f150704a = arrayList;
        arrayList.add(pf60.m172085a(Purpose.get(Purpose.thinking), ""));
        this.f150704a.add(pf60.m172085a(Purpose.get("friend"), ""));
        this.f150704a.add(pf60.m172085a(Purpose.get("date"), ""));
        this.f150704a.add(pf60.m172085a(Purpose.get("relationship"), ""));
        this.f150704a.add(pf60.m172085a(Purpose.get("marriage"), "in_one_year"));
        this.f150704a.add(pf60.m172085a(Purpose.get("marriage"), "in_two_years"));
        this.f150704a.add(pf60.m172085a(Purpose.get("marriage"), "at_right_time"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m170695n0(Bundle bundle) {
        ((t5x) this.viewModel).m189439r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m170694k0();
        creates(new y20() { // from class: l.m5x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134951a.m170695n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public MarryStatusSetAct m170696h0() {
        return (MarryStatusSetAct) super.act();
    }

    /* JADX INFO: renamed from: i0 */
    public void m170697i0(int i) {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        if (!NullChecker.m82486a(userMo225055clone.profile)) {
            userMo225055clone.profile = new Profile();
        }
        if (!NullChecker.m82486a(userMo225055clone.profile.extensions)) {
            userMo225055clone.profile.extensions = new Extensions();
        }
        if (!NullChecker.m82486a(userMo225055clone.profile.extensions.basic)) {
            userMo225055clone.profile.extensions.basic = new ProfileExtensionBasic();
        }
        final pf60<Purpose, String> pf60Var = this.f150704a.get(i);
        userMo225055clone.profile.extensions.basic.friendPurpose = jyb.m147482M(pf60Var.f152156a);
        if (TEnum.equals(pf60Var.f152156a, "marriage")) {
            if (!NullChecker.m82486a(userMo225055clone.profile.extensions.marriage)) {
                userMo225055clone.profile.extensions.marriage = new ProfileExtensionMarriage();
            }
            userMo225055clone.profile.extensions.marriage.expectedTime = jyb.m147482M(pf60Var.f152157b);
        }
        User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116593na());
        if (!NullChecker.m82486a(userSubtract)) {
            m170698j0(pf60Var.f152156a);
        } else {
            m170696h0().progress(R$string.f18632L5);
            duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.n5x
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140401a.m170699l0(pf60Var, (uxj0) obj);
                }
            }, new y20() { // from class: l.o5x
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145120a.m170700m0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m170698j0(Purpose purpose) {
        if (TEnum.equals(purpose, "marriage")) {
            m170696h0().startActivity(MarryInfoAuditStatusAct.m48584a2(m170696h0(), "purpose_switching"));
            m170696h0().m68056e2();
        }
        m170696h0().m68056e2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m170699l0(pf60 pf60Var, uxj0 uxj0Var) {
        m170696h0().progressDismiss();
        m170698j0((Purpose) pf60Var.f152156a);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m170700m0(Throwable th) {
        m170696h0().progressDismiss();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
