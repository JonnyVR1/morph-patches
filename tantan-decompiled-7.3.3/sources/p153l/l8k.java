package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class l8k extends y8s<rwn0, t8k> {

    /* JADX INFO: renamed from: j */
    public final nln0 f130466j;

    public l8k(dum<? extends rwn0> dumVar, nln0 nln0Var) {
        super(dumVar);
        mo52715C(new t8k(this));
        this.f130466j = nln0Var;
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m153228U3(Throwable th) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m153232Y3(x20 x20Var, BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        if (fln0.m126164c(bLiveVoiceGrabHatGame)) {
            x20Var.call();
        } else {
            o1j0.m165649w(R$string.f47454C5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m153237l4(Boolean bool) {
        m153243h4(bool.booleanValue(), new x20() { // from class: l.i8k
            @Override // p153l.x20
            public final void call() {
                this.f113350a.m153250q4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public void m153238p4(List<BLiveVoiceGrabHatCP> list) {
        ((t8k) this.viewModel).m73017E();
        ((t8k) this.viewModel).m189673R(list, this.f130466j.f142574i);
    }

    /* JADX INFO: renamed from: d4 */
    public void m153239d4() {
        new th0.C20312a(act()).m191160s(xau.m209910t(R$string.f48118h2)).m191150i(R$string.f48269o0).m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.j8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118786a.m153245j4(view);
            }
        }).m191146e(R$string.f47690N1).m191149h(false).m191148g(false).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: e4 */
    public void m153240e4() {
        if (fln0.m126163b(this.f130466j.f142574i)) {
            new th0.C20312a(act()).m191160s(xau.m209910t(R$string.f47922Y2)).m191150i(R$string.f48291p0).m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.h8k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f108246a.m153246k4(view);
                }
            }).m191146e(R$string.f47690N1).m191149h(false).m191148g(false).m191142a().m191141g();
        } else {
            m153252s4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m153241f4(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        fhw.m125605a("voiceGrabHat", "closeGameSuccess,id=" + bLiveVoiceGrabHatGame.f45348id);
        this.f130466j.m163762N3(bLiveVoiceGrabHatGame);
        ((t8k) this.viewModel).mo73021p();
        ain0.m98000f().m98008k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m153242g4() {
        duringCreated(eln0.m121247e(((rwn0) m213810E2()).m202191k(), m153244i4())).subscribe(dhw.m115826e(new y20() { // from class: l.k8k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124389a.m153241f4((BLiveVoiceGrabHatGame) obj);
            }
        }, new r5k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m153243h4(boolean z, final x20 x20Var) {
        if (z) {
            duringCreated(eln0.m121250h(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.y7k
                @Override // p153l.y20
                public final void call(Object obj) {
                    l8k.m153232Y3(x20Var, (BLiveVoiceGrabHatGame) obj);
                }
            }, new r5k()));
        } else {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final String m153244i4() {
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = this.f130466j.f142574i;
        return bLiveVoiceGrabHatGame == null ? "" : bLiveVoiceGrabHatGame.f45348id;
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m153245j4(View view) {
        m153242g4();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m153246k4(View view) {
        m153254u4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ Boolean m153247m4(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP) {
        return Boolean.valueOf(((t8k) this.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m153248n4(BLiveVoiceGrabHatCP bLiveVoiceGrabHatCP) {
        m153250q4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m153249o4(Integer num) {
        m153242g4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final void m153250q4() {
        duringCreated(eln0.m121249g(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.g8k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102691a.m153238p4((List) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public void m153251r4(String str) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(7010).userId(str).setFromIdentity(csq.m112228b(this, ((rwn0) m213810E2()).m168532l0().f56859id, str, 7010)).setTo(csq.m112231e(this, ((rwn0) m213810E2()).m168532l0().f56859id, str, 7010)).setSource("grabHat").setScene("grabHat").trackFrom("grabHat").build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public void m153252s4() {
        i4g0.m138523u("e_audio_join_hat_game", "p_anchor_audio_room", jyb.m147494Y("live_id", ((rwn0) m213810E2()).m202191k()), jyb.m147494Y("anchor_id", ((rwn0) m213810E2()).m168532l0().f56859id));
        duringCreated(eln0.m121252j(((rwn0) m213810E2()).m202191k(), m153244i4())).subscribe(dhw.m115826e(new y20() { // from class: l.z7k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203252a.m153253t4((BLiveVoiceGrabHatGame) obj);
            }
        }, new r5k()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().VoiceGrabHatEvent.openHatCpDialog(), new y20() { // from class: l.x7k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192730a.m153237l4((Boolean) obj);
            }
        });
        duringCreated(((rwn0) m213810E2()).m168545q1().m98301l()).filter(new qcj() { // from class: l.c8k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f80219a.m153247m4((BLiveVoiceGrabHatCP) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.d8k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85614a.m153248n4((BLiveVoiceGrabHatCP) obj);
            }
        }));
        duringCreated(m213811F2().VoiceGameChangeEvent.stopVoiceGame().m199270g()).filter(new qcj() { // from class: l.e8k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 6);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.f8k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97744a.m153249o4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m153253t4(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        fhw.m125605a("voiceGrabHat", "startGrabSuccess,id=" + bLiveVoiceGrabHatGame.f45348id);
        ((t8k) this.viewModel).m189674S(bLiveVoiceGrabHatGame);
        this.f130466j.m163762N3(bLiveVoiceGrabHatGame);
        ((t8k) this.viewModel).mo73021p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m153254u4() {
        duringCreated(eln0.m121253k(((rwn0) m213810E2()).m202191k(), m153244i4())).subscribe(dhw.m115826e(new y20() { // from class: l.a8k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68929a.m153255v4((BLiveVoiceGrabHatGame) obj);
            }
        }, new y20() { // from class: l.b8k
            @Override // p153l.y20
            public final void call(Object obj) {
                l8k.m153228U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public void m153255v4(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame) {
        fhw.m125605a("voiceGrabHat", "stopGrabSuccess,id=" + bLiveVoiceGrabHatGame.f45348id);
        this.f130466j.m163762N3(bLiveVoiceGrabHatGame);
        ((t8k) this.viewModel).m189674S(bLiveVoiceGrabHatGame);
        ((t8k) this.viewModel).mo73021p();
    }
}
