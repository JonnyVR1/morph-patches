package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import p149l.k2n;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j2n<V extends k2n<?>> extends jq2<V> {

    /* JADX INFO: renamed from: a */
    public String f115937a;

    public j2n(mcr mcrVar) {
        super(mcrVar);
        this.f115937a = URLEncoder.encode(Converter.dateToApiTimeString(mqi0.m155944o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m139486n0(Bundle bundle) {
        ((k2n) this.viewModel).mo107819r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m139487o0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            mo97799r0();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.d2n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83418a.m139486n0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.e2n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88932a.m139487o0((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19678r0.f20036q0).subscribe(mkd0.m154955G(new e30() { // from class: l.f2n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94223a.m139490p0((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19678r0.m34078C6()).subscribe(mkd0.m154956H(new e30() { // from class: l.g2n
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19678r0.m34124i5();
            }
        }, new e30() { // from class: l.h2n
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19678r0.m34124i5();
            }
        }));
        duringCreated(CoreModule.f17545c.f19678r0.f20033n0).subscribe(mkd0.m154955G(new e30() { // from class: l.i2n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110568a.m139491q0((Greeting) obj);
            }
        }));
        mo97800s0(true);
    }

    /* JADX INFO: renamed from: l0 */
    public List<fxq> m139488l0(List<Greeting> list, List<Message> list2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            for (Greeting greeting : list) {
                fxq fxqVar = new fxq();
                fxqVar.m123676x(greeting.f20401id);
                fxqVar.m123655O(greeting.otherUser);
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(greeting.otherUser);
                if (NullChecker.m81303a(userM169430Pa)) {
                    fxqVar.m123649I(rw6.m181386b(userM169430Pa).profileSmall().formatted());
                    fxqVar.m123652L(greeting.latestTime);
                    fxqVar.m123656P(userM169430Pa.name);
                    fxqVar.m123657Q(userM169430Pa.gender);
                    fxqVar.m123677y(userM169430Pa.isIdAndPicBothVerified());
                    fxqVar.m123647F(userM169430Pa.isPicVerificationVerified());
                    fxqVar.m123654N(userM169430Pa.age.intValue());
                    boolean z = false;
                    fxqVar.m123646C(!userM169430Pa.isHideIconFromSVipWithMe() && userM169430Pa.isODiamond());
                    fxqVar.m123648H(!userM169430Pa.isHideIconFromSVipWithMe() && userM169430Pa.isPlatinum());
                    if (!userM169430Pa.isHideIconFromSVipWithMe() && userM169430Pa.isSupremePartner()) {
                        z = true;
                    }
                    fxqVar.m123651K(z);
                }
                fxqVar.m123650J(greeting.status);
                fxqVar.m123675w(greeting);
                fxqVar.m123653M(greeting.messages.unread);
                for (Message message : list2) {
                    if (message.f56011id.equals(greeting.messages.latestId)) {
                        Boolean bool = message.recalled;
                        if (bool != null && bool.booleanValue()) {
                            fxqVar.m123645B(CoreModule.f17544b.getResources().getString(R$string.f20793K4));
                            break;
                        }
                        fxqVar.m123645B(message.value);
                        break;
                    }
                }
                if (!TextUtils.isEmpty(greeting.moment.f38759id)) {
                    CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m29934N().mo60295Mh(greeting.moment.f38759id, CoreMomentInfo.JSON_ADAPTER);
                    if (NullChecker.m81303a(coreMomentInfo)) {
                        fxqVar.m123678z(coreMomentInfo.value);
                        fxqVar.m123644A(coreMomentInfo.media);
                    }
                }
                arrayList.add(fxqVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m0 */
    public List<fxq> m139489m0(q860<Greeting> q860Var, List<Message> list) {
        return m139488l0(q860Var.f153135a, list);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m139490p0(Boolean bool) {
        if (!bool.booleanValue()) {
            mo97798k0();
        }
        mo97799r0();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m139491q0(Greeting greeting) {
        if (((k2n) this.viewModel).f120751c.booleanValue()) {
            List<fxq> listMo107810b = ((k2n) this.viewModel).mo107810b();
            if (NullChecker.m81303a(listMo107810b)) {
                for (int i = 0; i < listMo107810b.size(); i++) {
                    fxq fxqVar = listMo107810b.get(i);
                    if (TextUtils.equals(fxqVar.m123660f(), greeting.f20401id)) {
                        fxqVar.m123653M(0);
                        ((k2n) this.viewModel).mo107811e();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public abstract void mo97799r0();

    /* JADX INFO: renamed from: s0 */
    public abstract void mo97800s0(boolean z);

    /* JADX INFO: renamed from: t0 */
    public abstract void mo97801t0();

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo97798k0() {
    }
}
