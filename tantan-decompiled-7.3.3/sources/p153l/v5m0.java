package p153l;

import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import p151v.VImage;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class v5m0<D extends rwn0> extends atm0<t5m0<D>, D> {

    /* JADX INFO: renamed from: k */
    public nsv<User> f182557k;

    /* JADX INFO: renamed from: l */
    public fko0 f182558l;

    public v5m0(dum<D> dumVar, VImage vImage) {
        super(dumVar);
        mo52715C(new t5m0(vImage));
    }

    /* JADX INFO: renamed from: m4 */
    private void m199908m4() {
        fko0 fko0Var = this.f182558l;
        if (fko0Var != null) {
            fko0Var.m126046j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m199909o4(ArrayList arrayList) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((t5m0) v2).m189412f(this.f182557k);
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        m199908m4();
        this.f182557k = null;
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        nsv<User> nsvVar = mo100219h4() == null ? null : mo100219h4().f183108c;
        this.f182557k = nsvVar;
        ((t5m0) this.viewModel).m189412f(nsvVar);
        m214779N3(m213810E2().m168481T1()).subscribe(dhw.m115825d(new y20() { // from class: l.u5m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177664a.m199909o4((ArrayList) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m199908m4();
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m199910n4(String str) {
        return m213810E2().m168477S0(str);
    }

    /* JADX INFO: renamed from: p4 */
    public void m199911p4(nsv<User> nsvVar) {
        User userM164643h = nsvVar.m164643h();
        if (this.f182558l == null) {
            this.f182558l = new fko0();
        }
        this.f182558l.m126052p(this.f196919f, m213810E2().m183411P2().m136873l(nsvVar.f143542a.f56859id) != null, nsvVar, m213810E2().m202191k(), m213810E2().m202194o(), m100218g4().getMessageId(), userM164643h.f56859id.equals(m213810E2().m168532l0().f56859id), zrv.f205803e.getString(R$string.f47665Li), LongLinkChatMessage.RoomType.voice.getNumber(), m213810E2().mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: q4 */
    public void m199912q4(String str) {
        i4g0.m138523u("e_audio_user_managment_button", "p_audio_profile", new pf60("anchorId", m213810E2().m168526j0()), new pf60("liveId", m213810E2().m202191k()));
        m213811F2().VoiceUserCardEvent.openManageDialogWithSource().mo199273j(str);
    }
}
