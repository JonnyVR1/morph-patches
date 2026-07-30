package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.ArrayList;
import p151v.VImage;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class y6p0<D extends rwn0> extends atm0<w6p0<D>, D> {

    /* JADX INFO: renamed from: k */
    public nsv<User> f197702k;

    /* JADX INFO: renamed from: l */
    public q1d0 f197703l;

    /* JADX INFO: renamed from: m */
    public fko0 f197704m;

    public y6p0(dum<D> dumVar, VImage vImage) {
        super(dumVar);
        mo52715C(new w6p0(vImage));
    }

    /* JADX INFO: renamed from: m4 */
    private void m214487m4() {
        q1d0 q1d0Var = this.f197703l;
        if (q1d0Var != null) {
            q1d0Var.m174859h();
        }
        fko0 fko0Var = this.f197704m;
        if (fko0Var != null) {
            fko0Var.m126046j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m214488p4(ArrayList arrayList) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((w6p0) v2).m205194f(this.f197702k);
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        m214487m4();
        this.f197702k = null;
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        nsv<User> nsvVar = mo100219h4() == null ? null : mo100219h4().f183108c;
        this.f197702k = nsvVar;
        ((w6p0) this.viewModel).m205194f(nsvVar);
        m214779N3(m213810E2().m168481T1()).subscribe(dhw.m115825d(new y20() { // from class: l.x6p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192604a.m214488p4((ArrayList) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m214487m4();
    }

    /* JADX INFO: renamed from: n4 */
    public boolean m214489n4(String str) {
        return m213810E2().m168477S0(str);
    }

    /* JADX INFO: renamed from: o4 */
    public boolean m214490o4() {
        vak0 vak0VarMo100219h4 = mo100219h4();
        if (vak0VarMo100219h4 != null) {
            if (m213810E2().m183411P2().m136879r().m97111G(vak0VarMo100219h4.m200540o().m164643h().f56859id) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q4 */
    public void m214491q4(nsv<User> nsvVar) {
        User userM164643h = nsvVar.m164643h();
        if (m213810E2().m168538n0().isVoiceLive() && !TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            if (this.f197704m == null) {
                this.f197704m = new fko0();
            }
            this.f197704m.m126052p(this.f196919f, m213810E2().m183411P2().m136873l(nsvVar.f143542a.f56859id) != null, nsvVar, m213810E2().m202191k(), m213810E2().m202194o(), m100218g4().getMessageId(), userM164643h.f56859id.equals(m213810E2().m168532l0().f56859id), zrv.f205803e.getString(R$string.f47665Li), LongLinkChatMessage.RoomType.voice.getNumber(), m213810E2().mo183435j().liveMode);
        } else if (!m100220i0(nsvVar.m164643h().f56859id) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            if (this.f197703l == null) {
                this.f197703l = new q1d0();
            }
            this.f197703l.m174868q(act(), nsvVar, m213810E2().m202191k(), m213810E2().m202194o(), m100218g4().getMessageId(), userM164643h.f56859id.equals(m213810E2().m168532l0().f56859id), zrv.m221193k().m203651j5(), TextUtils.equals("live", m213810E2().mo118362A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
        } else {
            Intent intent = new Intent(m113230C0(), (Class<?>) MkWebViewAct.class);
            intent.putExtra("url", efv.f93865v);
            intent.putExtra("title", zrv.f205803e.getString(R$string.f47974ac));
            intent.putExtra("hideNavigationBar", true);
            m113230C0().startActivity(intent);
            m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public void m214492r4() {
        m213811F2().VoiceUserCardEvent.openManageDialog().m199277p();
    }
}
