package p149l;

import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class p9n0 extends j9n0<nnn0> {
    public p9n0(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: B6 */
    public static /* synthetic */ void m167867B6(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f134440a = hxn0Var.f109897c;
        mljVar.f134441b = hxn0Var.f109896b;
    }

    /* JADX INFO: renamed from: E6 */
    public static /* synthetic */ void m167870E6(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f134441b = hxn0Var.f109896b;
        mljVar.f134440a = hxn0Var.f109897c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F6 */
    public /* synthetic */ z8k0.C21648a m167871F6(z8k0 z8k0Var) {
        return new z8k0.C21648a(((nnn0) m206027E2()).m149814k(), ((nnn0) m206027E2()).m149818o(), ((nnn0) m206027E2()).m132146l0().f56011id, ((nnn0) m206027E2()).m132146l0().name, ((nnn0) m206027E2()).mo132054A0(), ((nnn0) m206027E2()).mo149813j().liveMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.ahs
    /* JADX INFO: renamed from: F4 */
    public List<mlj> mo96615F4() {
        return mmj.m155411N((nnn0) m206027E2());
    }

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ void m167872G6(bik0.C15867a c15867a) {
        m167874I6(1501);
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ void m167873H6(bik0.C15867a c15867a) {
        m167874I6(1503);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I6 */
    public final void m167874I6(int i) {
        User userM132146l0 = ((nnn0) m206027E2()).m132146l0();
        ((nnn0) m206027E2()).m132116a2("");
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(userM132146l0.f56011id);
        String str = bLiveVoiceCallM102063l != null ? bLiveVoiceCallM102063l.f44485id : "";
        mqv<i54> mqvVarM102064m = ((nnn0) m206027E2()).m160249P2().m102064m(userM132146l0.f56011id);
        if (mqvVarM102064m == null) {
            mqvVarM102064m = mqv.m155998f(new i54(userM132146l0.f56011id, userM132146l0.name, userM132146l0.m60124fp().profileSmall().formatted())).m156001c(userM132146l0.f56011id, null, ((nnn0) m206027E2()).mo132103W0());
        }
        i54 i54Var = mqvVarM102064m.f135304a;
        final mlj mljVarM155154c = mlj.m155154c(new i54(i54Var.f111520a, i54Var.f111521b, i54Var.f111522c), q44.m172922b(str, "gift-audience-none-voiceLiveMain", 0));
        hxn0.m133350c(mqvVarM102064m).m133351a(new e30() { // from class: l.o9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                p9n0.m167867B6(mljVarM155154c, (hxn0) obj);
            }
        });
        m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122564h(new mnj.C18509a().m155527h(mljVarM155154c).m155523d()).m122565i(i).m122566j("voiceLiveMain"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.ahs
    /* JADX INFO: renamed from: J4 */
    public mnj mo96623J4() {
        mlj mljVarM155154c;
        User userM132146l0 = ((nnn0) m206027E2()).m132146l0();
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(userM132146l0.f56011id);
        if (bLiveVoiceCallM102063l == null) {
            mljVarM155154c = mlj.m155154c(new i54(userM132146l0.f56011id, userM132146l0.name, userM132146l0.m60124fp().url), q44.m172922b("", m206032L2() ? "" : "gift-audience-none-voiceLiveMain", 0));
        } else {
            final mlj mljVarM155154c2 = mlj.m155154c(new i54(bLiveVoiceCallM102063l.user, bLiveVoiceCallM102063l.userName, bLiveVoiceCallM102063l.userPicture), q44.m172922b(bLiveVoiceCallM102063l.f44485id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM102063l.position));
            hxn0.m133350c(((nnn0) m206027E2()).m160249P2().m102064m(bLiveVoiceCallM102063l.user)).m133351a(new e30() { // from class: l.n9n0
                @Override // p149l.e30
                public final void call(Object obj) {
                    p9n0.m167870E6(mljVarM155154c2, (hxn0) obj);
                }
            });
            mljVarM155154c = mljVarM155154c2;
        }
        return new mnj.C18509a().m155527h(mljVarM155154c).m155523d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J6 */
    public void m167875J6() {
        if (AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT.equals(((nnn0) m206027E2()).m132077M0())) {
            duringCreated(((nnn0) m206027E2()).m160251Q2()).first().subscribe(ffw.m121197h(new e30() { // from class: l.k9n0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f122053a.m167872G6((bik0.C15867a) obj);
                }
            }));
        } else if (AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR_SHOW_PACKAGE.equals(((nnn0) m206027E2()).m132077M0())) {
            duringCreated(((nnn0) m206027E2()).m160251Q2()).first().subscribe(ffw.m121197h(new e30() { // from class: l.l9n0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127132a.m167873H6((bik0.C15867a) obj);
                }
            }));
        }
    }

    @Override // p149l.ahs
    /* JADX INFO: renamed from: K4 */
    public String mo96624K4() {
        return "voiceLiveMain";
    }

    @Override // p149l.j9n0, p149l.ahs, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(z8k0.class, new w9j() { // from class: l.m9n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f132786a.m167871F6((z8k0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.ahs, p149l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo96662j3() {
        return ((nnn0) m206027E2()).m132146l0().f56011id;
    }

    @Override // p149l.ahs, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m167875J6();
    }
}
