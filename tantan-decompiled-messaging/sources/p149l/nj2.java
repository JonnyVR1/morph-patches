package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import p149l.oj2;

/* JADX INFO: loaded from: classes11.dex */
public abstract class nj2<V extends oj2<?>> extends jq2<V> {

    /* JADX INFO: renamed from: a */
    public String f139172a;

    public nj2(mcr mcrVar) {
        super(mcrVar);
        this.f139172a = URLEncoder.encode(Converter.dateToApiTimeString(mqi0.m155944o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m159589p0(Bundle bundle) {
        ((oj2) this.viewModel).mo136199r();
        if (CoreModule.f17545c.f19678r0.f20011R.get().booleanValue()) {
            return;
        }
        ((oj2) this.viewModel).mo136195i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m159590q0(Boolean bool) {
        ((oj2) this.viewModel).mo136194f(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m159591r0(Throwable th) {
        ((oj2) this.viewModel).mo136194f(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m159592s0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            mo130967z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m159593u0(roj0 roj0Var) {
        if (((oj2) this.viewModel).f144220a.m36457Z1()) {
            CoreModule.f17545c.f19678r0.m34122h5();
        } else {
            CoreModule.f17545c.f19678r0.m34124i5();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo130959A0(boolean z);

    /* JADX INFO: renamed from: C0 */
    public abstract void mo130960C0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.fj2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97749a.m159589p0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19678r0.m34134n5()).subscribe(mkd0.m154956H(new e30() { // from class: l.gj2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102996a.m159590q0((Boolean) obj);
            }
        }, new e30() { // from class: l.hj2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108023a.m159591r0((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ij2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113486a.m159592s0((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19678r0.f20036q0).subscribe(mkd0.m154955G(new e30() { // from class: l.jj2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118216a.m159597t0((Boolean) obj);
            }
        }));
        duringCreated(((oj2) this.viewModel).f144220a.m36457Z1() ? CoreModule.f17545c.f19678r0.m34159z6() : CoreModule.f17545c.f19678r0.m34078C6()).subscribe(mkd0.m154956H(new e30() { // from class: l.kj2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123422a.m159593u0((roj0) obj);
            }
        }, new e30() { // from class: l.lj2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128277a.m159598x0((Throwable) obj);
            }
        }));
        duringCreated(((oj2) this.viewModel).f144220a.m36457Z1() ? CoreModule.f17545c.f19678r0.f20034o0 : CoreModule.f17545c.f19678r0.f20033n0).subscribe(mkd0.m154955G(new e30() { // from class: l.mj2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134091a.m159599y0((Greeting) obj);
            }
        }));
        mo130959A0(true);
    }

    /* JADX INFO: renamed from: n0 */
    public List<fxq> m159595n0(List<Greeting> list, List<Message> list2) {
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
                        if (message.messageType() != MessageType.get(MessageType.chat_gift)) {
                            if (message.messageType() != MessageType.get("picture")) {
                                Boolean bool = message.recalled;
                                if (bool != null && bool.booleanValue()) {
                                    fxqVar.m123645B(CoreModule.f17544b.getResources().getString(R$string.f20793K4));
                                    break;
                                }
                                fxqVar.m123645B(message.value);
                                break;
                            }
                            fxqVar.m123645B(CoreModule.f17544b.getResources().getString(R$string.f21065q4));
                            break;
                        }
                        fxqVar.m123645B(CoreModule.f17557o.m195057d().mo33654Ac(message).toString());
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

    /* JADX INFO: renamed from: o0 */
    public List<fxq> m159596o0(q860<Greeting> q860Var, List<Message> list) {
        return m159595n0(q860Var.f153135a, list);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m159597t0(Boolean bool) {
        if (bool.booleanValue()) {
            mo130967z0();
        } else {
            m159594m0();
            mo130967z0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m159598x0(Throwable th) {
        if (((oj2) this.viewModel).f144220a.m36457Z1()) {
            CoreModule.f17545c.f19678r0.m34122h5();
        } else {
            CoreModule.f17545c.f19678r0.m34124i5();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m159599y0(Greeting greeting) {
        if (((oj2) this.viewModel).f144223d.booleanValue()) {
            List<fxq> listMo136191b = ((oj2) this.viewModel).mo136191b();
            for (int i = 0; i < listMo136191b.size(); i++) {
                fxq fxqVar = listMo136191b.get(i);
                if (TextUtils.equals(fxqVar.m123660f(), greeting.f20401id)) {
                    fxqVar.m123653M(0);
                    ((oj2) this.viewModel).mo136192d();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public abstract void mo130967z0();

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: m0 */
    public void m159594m0() {
    }
}
