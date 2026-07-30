package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import p153l.k4n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j4n<V extends k4n<?>> extends ar2<V> {

    /* JADX INFO: renamed from: a */
    public String f118311a;

    public j4n(ner nerVar) {
        super(nerVar);
        this.f118311a = URLEncoder.encode(Converter.dateToApiTimeString(pzi0.m174454o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m143436n0(Bundle bundle) {
        ((k4n) this.viewModel).mo111825r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m143437o0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            mo99363r0();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.d4n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85055a.m143436n0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.e4n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92135a.m143437o0((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20420r0.f20778q0).subscribe(psd0.m173596G(new y20() { // from class: l.f4n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97116a.m143440p0((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20420r0.m35081C6()).subscribe(psd0.m173597H(new y20() { // from class: l.g4n
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20420r0.m35127i5();
            }
        }, new y20() { // from class: l.h4n
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20420r0.m35127i5();
            }
        }));
        duringCreated(CoreModule.f18264c.f20420r0.f20775n0).subscribe(psd0.m173596G(new y20() { // from class: l.i4n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112928a.m143441q0((Greeting) obj);
            }
        }));
        mo99364s0(true);
    }

    /* JADX INFO: renamed from: l0 */
    public List<fzq> m143438l0(List<Greeting> list, List<Message> list2) {
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
                        Boolean bool = message.recalled;
                        if (bool != null && bool.booleanValue()) {
                            fzqVar.m128201B(CoreModule.f18263b.getResources().getString(R$string.f21535K4));
                            break;
                        }
                        fzqVar.m128201B(message.value);
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

    /* JADX INFO: renamed from: m0 */
    public List<fzq> m143439m0(vg60<Greeting> vg60Var, List<Message> list) {
        return m143438l0(vg60Var.f184001a, list);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m143440p0(Boolean bool) {
        if (!bool.booleanValue()) {
            mo99362k0();
        }
        mo99363r0();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m143441q0(Greeting greeting) {
        if (((k4n) this.viewModel).f123903c.booleanValue()) {
            List<fzq> listMo111816b = ((k4n) this.viewModel).mo111816b();
            if (NullChecker.m82486a(listMo111816b)) {
                for (int i = 0; i < listMo111816b.size(); i++) {
                    fzq fzqVar = listMo111816b.get(i);
                    if (TextUtils.equals(fzqVar.m128216f(), greeting.f21143id)) {
                        fzqVar.m128209M(0);
                        ((k4n) this.viewModel).mo111817e();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public abstract void mo99363r0();

    /* JADX INFO: renamed from: s0 */
    public abstract void mo99364s0(boolean z);

    /* JADX INFO: renamed from: t0 */
    public abstract void mo99365t0();

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo99362k0() {
    }
}
