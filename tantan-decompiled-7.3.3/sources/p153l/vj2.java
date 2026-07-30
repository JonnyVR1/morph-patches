package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import p153l.wj2;

/* JADX INFO: loaded from: classes11.dex */
public abstract class vj2<V extends wj2<?>> extends ar2<V> {

    /* JADX INFO: renamed from: a */
    public String f184344a;

    public vj2(ner nerVar) {
        super(nerVar);
        this.f184344a = URLEncoder.encode(Converter.dateToApiTimeString(pzi0.m174454o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m201452p0(Bundle bundle) {
        ((wj2) this.viewModel).mo158508r();
        if (CoreModule.f18264c.f20420r0.f20753R.get().booleanValue()) {
            return;
        }
        ((wj2) this.viewModel).mo158504i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m201453q0(Boolean bool) {
        ((wj2) this.viewModel).mo158503f(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m201454r0(Throwable th) {
        ((wj2) this.viewModel).mo158503f(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m201455s0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            mo154370z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m201456u0(uxj0 uxj0Var) {
        if (((wj2) this.viewModel).f189411a.m37460a2()) {
            CoreModule.f18264c.f20420r0.m35125h5();
        } else {
            CoreModule.f18264c.f20420r0.m35127i5();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo154362A0(boolean z);

    /* JADX INFO: renamed from: C0 */
    public abstract void mo154363C0();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.nj2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142261a.m201452p0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20420r0.m35137n5()).subscribe(psd0.m173597H(new y20() { // from class: l.oj2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147631a.m201453q0((Boolean) obj);
            }
        }, new y20() { // from class: l.pj2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152647a.m201454r0((Throwable) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.qj2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157914a.m201455s0((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20420r0.f20778q0).subscribe(psd0.m173596G(new y20() { // from class: l.rj2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163411a.m201460t0((Boolean) obj);
            }
        }));
        duringCreated(((wj2) this.viewModel).f189411a.m37460a2() ? CoreModule.f18264c.f20420r0.m35162z6() : CoreModule.f18264c.f20420r0.m35081C6()).subscribe(psd0.m173597H(new y20() { // from class: l.sj2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168892a.m201456u0((uxj0) obj);
            }
        }, new y20() { // from class: l.tj2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174523a.m201461x0((Throwable) obj);
            }
        }));
        duringCreated(((wj2) this.viewModel).f189411a.m37460a2() ? CoreModule.f18264c.f20420r0.f20776o0 : CoreModule.f18264c.f20420r0.f20775n0).subscribe(psd0.m173596G(new y20() { // from class: l.uj2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179172a.m201462y0((Greeting) obj);
            }
        }));
        mo154362A0(true);
    }

    /* JADX INFO: renamed from: n0 */
    public List<fzq> m201458n0(List<Greeting> list, List<Message> list2) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            for (Greeting greeting : list) {
                fzq fzqVar = new fzq();
                fzqVar.m128232x(greeting.f21143id);
                fzqVar.m128211O(greeting.otherUser);
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(greeting.otherUser);
                if (NullChecker.m82486a(userM116503Pa)) {
                    fzqVar.m128205I(ux6.m198404b(userM116503Pa).profileSmall().formatted());
                    fzqVar.m128208L(greeting.latestTime);
                    fzqVar.m128212P(userM116503Pa.name);
                    fzqVar.m128213Q(userM116503Pa.gender);
                    fzqVar.m128233y(userM116503Pa.isIdAndPicBothVerified());
                    fzqVar.m128203F(userM116503Pa.isPicVerificationVerified());
                    fzqVar.m128210N(userM116503Pa.age.intValue());
                    boolean z = false;
                    fzqVar.m128202C(!userM116503Pa.isHideIconFromSVipWithMe() && userM116503Pa.isODiamond());
                    fzqVar.m128204H(!userM116503Pa.isHideIconFromSVipWithMe() && userM116503Pa.isPlatinum());
                    if (!userM116503Pa.isHideIconFromSVipWithMe() && userM116503Pa.isSupremePartner()) {
                        z = true;
                    }
                    fzqVar.m128207K(z);
                }
                fzqVar.m128206J(greeting.status);
                fzqVar.m128231w(greeting);
                fzqVar.m128209M(greeting.messages.unread);
                for (Message message : list2) {
                    if (message.f56859id.equals(greeting.messages.latestId)) {
                        if (message.messageType() != MessageType.get(MessageType.chat_gift)) {
                            if (message.messageType() != MessageType.get("picture")) {
                                Boolean bool = message.recalled;
                                if (bool != null && bool.booleanValue()) {
                                    fzqVar.m128201B(CoreModule.f18263b.getResources().getString(R$string.f21535K4));
                                    break;
                                }
                                fzqVar.m128201B(message.value);
                                break;
                            }
                            fzqVar.m128201B(CoreModule.f18263b.getResources().getString(R$string.f21807q4));
                            break;
                        }
                        fzqVar.m128201B(CoreModule.f18276o.m132214d().mo34657Ac(message).toString());
                        break;
                    }
                }
                if (!TextUtils.isEmpty(greeting.moment.f39607id)) {
                    CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m30932N().mo61479Mh(greeting.moment.f39607id, CoreMomentInfo.JSON_ADAPTER);
                    if (NullChecker.m82486a(coreMomentInfo)) {
                        fzqVar.m128234z(coreMomentInfo.value);
                        fzqVar.m128200A(coreMomentInfo.media);
                    }
                }
                arrayList.add(fzqVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o0 */
    public List<fzq> m201459o0(vg60<Greeting> vg60Var, List<Message> list) {
        return m201458n0(vg60Var.f184001a, list);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m201460t0(Boolean bool) {
        if (bool.booleanValue()) {
            mo154370z0();
        } else {
            m201457m0();
            mo154370z0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m201461x0(Throwable th) {
        if (((wj2) this.viewModel).f189411a.m37460a2()) {
            CoreModule.f18264c.f20420r0.m35125h5();
        } else {
            CoreModule.f18264c.f20420r0.m35127i5();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m201462y0(Greeting greeting) {
        if (((wj2) this.viewModel).f189414d.booleanValue()) {
            List<fzq> listMo158500b = ((wj2) this.viewModel).mo158500b();
            for (int i = 0; i < listMo158500b.size(); i++) {
                fzq fzqVar = listMo158500b.get(i);
                if (TextUtils.equals(fzqVar.m128216f(), greeting.f21143id)) {
                    fzqVar.m128209M(0);
                    ((wj2) this.viewModel).mo158501d();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public abstract void mo154370z0();

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: m0 */
    public void m201457m0() {
    }
}
