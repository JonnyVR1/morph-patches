package p153l;

import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class tin0 extends nin0<rwn0> {
    public tin0(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: B6 */
    public static /* synthetic */ void m191339B6(coj cojVar, l6o0 l6o0Var) {
        cojVar.f82885a = l6o0Var.f130276c;
        cojVar.f82886b = l6o0Var.f130275b;
    }

    /* JADX INFO: renamed from: E6 */
    public static /* synthetic */ void m191342E6(coj cojVar, l6o0 l6o0Var) {
        cojVar.f82886b = l6o0Var.f130275b;
        cojVar.f82885a = l6o0Var.f130276c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F6 */
    public /* synthetic */ fik0.C16979a m191343F6(fik0 fik0Var) {
        return new fik0.C16979a(((rwn0) m213810E2()).m202191k(), ((rwn0) m213810E2()).m202194o(), ((rwn0) m213810E2()).m168532l0().f56859id, ((rwn0) m213810E2()).m168532l0().name, ((rwn0) m213810E2()).mo118362A0(), ((rwn0) m213810E2()).mo183435j().liveMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.bjs
    /* JADX INFO: renamed from: F4 */
    public List<coj> mo104702F4() {
        return cpj.m111778N((rwn0) m213810E2());
    }

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ void m191344G6(hrk0.C17564a c17564a) {
        m191346I6(1501);
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ void m191345H6(hrk0.C17564a c17564a) {
        m191346I6(1503);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I6 */
    public final void m191346I6(int i) {
        User userM168532l0 = ((rwn0) m213810E2()).m168532l0();
        ((rwn0) m213810E2()).m168502a2("");
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(userM168532l0.f56859id);
        String str = bLiveVoiceCallM136873l != null ? bLiveVoiceCallM136873l.f45333id : "";
        nsv<h64> nsvVarM136874m = ((rwn0) m213810E2()).m183411P2().m136874m(userM168532l0.f56859id);
        if (nsvVarM136874m == null) {
            nsvVarM136874m = nsv.m164636f(new h64(userM168532l0.f56859id, userM168532l0.name, userM168532l0.m61308fp().profileSmall().formatted())).m164639c(userM168532l0.f56859id, null, ((rwn0) m213810E2()).mo168489W0());
        }
        h64 h64Var = nsvVarM136874m.f143542a;
        final coj cojVarM111661c = coj.m111661c(new h64(h64Var.f107997a, h64Var.f107998b, h64Var.f107999c), p54.m170592b(str, "gift-audience-none-voiceLiveMain", 0));
        l6o0.m153068c(nsvVarM136874m).m153069a(new y20() { // from class: l.sin0
            @Override // p153l.y20
            public final void call(Object obj) {
                tin0.m191339B6(cojVarM111661c, (l6o0) obj);
            }
        });
        m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156158h(new cqj.C16337a().m111927h(cojVarM111661c).m111923d()).m156159i(i).m156160j("voiceLiveMain"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.bjs
    /* JADX INFO: renamed from: J4 */
    public cqj mo104710J4() {
        coj cojVarM111661c;
        User userM168532l0 = ((rwn0) m213810E2()).m168532l0();
        BLiveVoiceCall bLiveVoiceCallM136873l = ((rwn0) m213810E2()).m183411P2().m136873l(userM168532l0.f56859id);
        if (bLiveVoiceCallM136873l == null) {
            cojVarM111661c = coj.m111661c(new h64(userM168532l0.f56859id, userM168532l0.name, userM168532l0.m61308fp().url), p54.m170592b("", m213815L2() ? "" : "gift-audience-none-voiceLiveMain", 0));
        } else {
            final coj cojVarM111661c2 = coj.m111661c(new h64(bLiveVoiceCallM136873l.user, bLiveVoiceCallM136873l.userName, bLiveVoiceCallM136873l.userPicture), p54.m170592b(bLiveVoiceCallM136873l.f45333id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM136873l.position));
            l6o0.m153068c(((rwn0) m213810E2()).m183411P2().m136874m(bLiveVoiceCallM136873l.user)).m153069a(new y20() { // from class: l.rin0
                @Override // p153l.y20
                public final void call(Object obj) {
                    tin0.m191342E6(cojVarM111661c2, (l6o0) obj);
                }
            });
            cojVarM111661c = cojVarM111661c2;
        }
        return new cqj.C16337a().m111927h(cojVarM111661c).m111923d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J6 */
    public void m191347J6() {
        if (AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT.equals(((rwn0) m213810E2()).m168465M0())) {
            duringCreated(((rwn0) m213810E2()).m183413Q2()).first().subscribe(dhw.m115829h(new y20() { // from class: l.oin0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147557a.m191344G6((hrk0.C17564a) obj);
                }
            }));
        } else if (AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR_SHOW_PACKAGE.equals(((rwn0) m213810E2()).m168465M0())) {
            duringCreated(((rwn0) m213810E2()).m183413Q2()).first().subscribe(dhw.m115829h(new y20() { // from class: l.pin0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f152548a.m191345H6((hrk0.C17564a) obj);
                }
            }));
        }
    }

    @Override // p153l.bjs
    /* JADX INFO: renamed from: K4 */
    public String mo104711K4() {
        return "voiceLiveMain";
    }

    @Override // p153l.nin0, p153l.bjs, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(fik0.class, new qcj() { // from class: l.qin0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157852a.m191343F6((fik0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.bjs, p153l.i6t
    /* JADX INFO: renamed from: j3 */
    public String mo104749j3() {
        return ((rwn0) m213810E2()).m168532l0().f56859id;
    }

    @Override // p153l.bjs, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m191347J6();
    }
}
