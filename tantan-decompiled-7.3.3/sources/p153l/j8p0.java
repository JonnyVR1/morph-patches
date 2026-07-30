package p153l;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class j8p0<D extends rwn0> extends atm0<b8p0<D>, D> {

    /* JADX INFO: renamed from: k */
    public q1d0 f118798k;

    /* JADX INFO: renamed from: l */
    public fko0 f118799l;

    /* JADX INFO: renamed from: m */
    public nsv<User> f118800m;

    /* JADX INFO: renamed from: n */
    public vak0 f118801n;

    public j8p0(dum<D> dumVar) {
        super(dumVar);
        mo52715C(new b8p0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m143850F4(vxj0 vxj0Var) {
        ((b8p0) this.viewModel).m103035k(m143877v4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m143851G4(Boolean bool) {
        vak0 vak0Var = this.f118801n;
        if (vak0Var != null) {
            vak0Var.m200543r().isJailed = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: H4 */
    private k8p0 m143852H4() {
        String strM209910t;
        if (this.f118800m == null || this.f118801n == null) {
            return null;
        }
        boolean z = true;
        if (m213810E2().m183411P2().m136873l(this.f118800m.f143542a.f56859id) != null) {
            strM209910t = xau.m209910t(R$string.f48331qi);
        } else if (this.f118801n.m200528c(this.f118800m.f143542a.f56859id)) {
            strM209910t = xau.m209910t(R$string.f47554Gh);
            z = false;
        } else {
            strM209910t = xau.m209910t(R$string.f47479D8);
        }
        k8p0 k8p0Var = new k8p0(strM209910t);
        k8p0Var.m148744d(z);
        return k8p0Var;
    }

    /* JADX INFO: renamed from: I4 */
    private void m143853I4() {
        if (!y6s.m214494b(m213810E2().mo183435j().liveMode)) {
            m213811F2().ManagerPersonEvent.forbiddenWords().mo199273j(this.f118800m);
        } else if (this.f118801n.m200543r().isJailed) {
            m213811F2().ManagerPersonEvent.unMuteWords().mo199273j(this.f118800m);
        } else {
            m213811F2().ManagerPersonEvent.forbiddenWords().mo199273j(this.f118800m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4, reason: merged with bridge method [inline-methods] */
    public void m143867C4(List<k8p0> list, String str) {
        k8p0 k8p0Var;
        str.getClass();
        switch (str) {
            case "sayHello":
                k8p0Var = new k8p0("打招呼");
                break;
            case "managerInvite":
                k8p0Var = m143863w4();
                break;
            case "report":
                k8p0Var = m143864x4();
                break;
            case "kickRoom":
                k8p0Var = new k8p0(xau.m209910t(R$string.f48280ob));
                break;
            case "unblock":
                k8p0Var = new k8p0(xau.m209910t(R$string.f47464Cf));
                break;
            case "blocked":
                k8p0Var = new k8p0(xau.m209910t(R$string.f47442Bf));
                break;
            case "call":
                k8p0Var = m143852H4();
                break;
            case "jail":
                if (!y6s.m214494b(m213810E2().mo183435j().liveMode)) {
                    k8p0Var = new k8p0(xau.m209910t(R$string.f48388t9));
                    break;
                } else {
                    k8p0Var = new k8p0(xau.m209910t(this.f118801n.m200543r().isJailed ? R$string.f47837U1 : R$string.f48388t9));
                    break;
                }
                break;
            case "voice":
                k8p0Var = m143862u4();
                break;
            default:
                k8p0Var = null;
                break;
        }
        if (k8p0Var != null) {
            list.add(k8p0Var);
            k8p0Var.m148745e(str);
        }
    }

    /* JADX INFO: renamed from: t4 */
    private void m143861t4() {
        q1d0 q1d0Var = this.f118798k;
        if (q1d0Var != null) {
            q1d0Var.m174859h();
        }
        fko0 fko0Var = this.f118799l;
        if (fko0Var != null) {
            fko0Var.m126046j();
        }
    }

    /* JADX INFO: renamed from: u4 */
    private k8p0 m143862u4() {
        int i;
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(mo100219h4().f183108c.f143542a.f56859id);
        if (bLiveVoiceCallM136873l == null) {
            return null;
        }
        if (m100220i0(bLiveVoiceCallM136873l.user) && !m213815L2()) {
            return null;
        }
        boolean z = true;
        if (bLiveVoiceCallM136873l.mutedByUser || bLiveVoiceCallM136873l.mutedByAnchor) {
            int i2 = R$string.f48287oi;
            z = (m143879z4() || m213815L2()) && bLiveVoiceCallM136873l.mutedByAnchor;
            i = i2;
        } else {
            i = R$string.f48288oj;
        }
        k8p0 k8p0Var = new k8p0(xau.m209910t(i));
        k8p0Var.m148744d(z);
        return k8p0Var;
    }

    /* JADX INFO: renamed from: w4 */
    private k8p0 m143863w4() {
        List list = (List) m138856F3(new x5o0(3800));
        return new k8p0((list == null || !jyb.m147520m(list, new qcj() { // from class: l.h8p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f108260a.m143868D4((BLiveVoiceManager) obj);
            }
        })) ? xau.m209910t(R$string.f47598Ih) : xau.m209910t(R$string.f47704Nf));
    }

    /* JADX INFO: renamed from: x4 */
    private k8p0 m143864x4() {
        return new k8p0(zrv.f205803e.getString(((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0()).hierarchy.grade < zrv.m221193k().m203508R5() ? R$string.f47974ac : R$string.f48500yb));
    }

    /* JADX INFO: renamed from: A4 */
    public final boolean m143865A4() {
        vak0 vak0Var = this.f118801n;
        return (vak0Var == null || vak0Var.m200543r() == null || this.f118801n.m200543r().manageButtons == null) ? false : true;
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m143866B4(View view) {
        m213811F2().VoiceLiveManagerEvent.onCancelManager().mo199273j(mo100219h4().m200540o().f143542a);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ Boolean m143868D4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(this.f118800m.f143542a.f56859id));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ Boolean m143869E4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(this.f118800m.f143542a.f56859id));
    }

    /* JADX INFO: renamed from: J4 */
    public void m143870J4(String str) {
        ((b8p0) this.viewModel).m103031e();
        if (this.f118800m == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "sayHello":
                i4g0.m138523u("e_audio_greeting", "p_audio_profile", pf60.m172085a("anchorId", mo104749j3()), pf60.m172085a("liveId", m213810E2().m202191k()), pf60.m172085a("receiver_user_id", this.f118800m.f143542a.f56859id));
                zrv.f205799a.m207657a0(this.f196919f, this.f118800m.f143542a.f56859id);
                break;
            case "managerInvite":
                m143871K4();
                break;
            case "report":
                m143873M4(this.f118800m);
                break;
            case "kickRoom":
                m213811F2().ManagerPersonEvent.kickOff().mo199273j(this.f118800m);
                break;
            case "unblock":
                if (this.f118800m != null) {
                    m213811F2().VoiceBlackListEvent.addBlackList().mo199273j(this.f118800m.f143542a);
                    break;
                }
                break;
            case "jail":
                m143853I4();
                break;
            case "voice":
                m143874N4();
                break;
            case "realNamePrivateChat":
                nsv<User> nsvVar = this.f118800m;
                if (nsvVar != null) {
                    m143872L4(nsvVar.f143542a.f56859id);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final void m143871K4() {
        if (jyb.m147520m((List) m138856F3(new x5o0(3800)), new qcj() { // from class: l.f8p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97754a.m143869E4((BLiveVoiceManager) obj);
            }
        })) {
            m143876s4();
        } else {
            m143878y4();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m143872L4(String str) {
        act().startActivity(zrv.f205799a.m207707z0(act(), str, false, false));
    }

    /* JADX INFO: renamed from: M4 */
    public void m143873M4(nsv<User> nsvVar) {
        User userM164643h = nsvVar.m164643h();
        if (m213810E2().m168538n0().isVoiceLive() && !TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            boolean z = m213810E2().m183411P2().m136873l(nsvVar.f143542a.f56859id) != null;
            if (this.f118799l == null) {
                this.f118799l = new fko0();
            }
            this.f118799l.m126052p(this.f196919f, z, nsvVar, m213810E2().m202191k(), m213810E2().m202194o(), m100218g4().getMessageId(), userM164643h.f56859id.equals(m213810E2().m168532l0().f56859id), zrv.f205803e.getString(R$string.f47665Li), LongLinkChatMessage.RoomType.voice.getNumber(), m213810E2().mo183435j().liveMode);
            return;
        }
        if (!m100220i0(nsvVar.m164643h().f56859id) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            if (this.f118798k == null) {
                this.f118798k = new q1d0();
            }
            this.f118798k.m174868q(act(), nsvVar, m213810E2().m202191k(), m213810E2().m202194o(), m100218g4().getMessageId(), userM164643h.f56859id.equals(m213810E2().m168532l0().f56859id), zrv.m221193k().m203651j5(), TextUtils.equals("live", m213810E2().mo118362A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
        } else {
            Intent intent = new Intent(m113230C0(), (Class<?>) MkWebViewAct.class);
            intent.putExtra("url", efv.f93865v);
            intent.putExtra("title", zrv.f205803e.getString(R$string.f47974ac));
            intent.putExtra("hideNavigationBar", true);
            m113230C0().startActivity(intent);
            m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m143874N4() {
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(mo100219h4().f183108c.f143542a.f56859id);
        if (bLiveVoiceCallM136873l != null) {
            if (!bLiveVoiceCallM136873l.mutedByAnchor || m213815L2() || m143879z4()) {
                if (bLiveVoiceCallM136873l.mutedByUser && m213815L2()) {
                    return;
                }
                ydn0.m215263p(this, bLiveVoiceCallM136873l.f45333id, (bLiveVoiceCallM136873l.mutedByUser || bLiveVoiceCallM136873l.mutedByAnchor) ? false : true, m213810E2().m168477S0(mo100219h4().f183108c.f143542a.f56859id) ? "voice-manager" : "");
            }
        }
    }

    /* JADX INFO: renamed from: O4 */
    public void m143875O4(String str) {
        vak0 vak0Var;
        int iIndexOf;
        nsv<User> nsvVar = this.f118800m;
        if (nsvVar == null || nsvVar.f143542a == null || (vak0Var = this.f118801n) == null || vak0Var.m200543r() == null || !TextUtils.equals(this.f118800m.f143542a.f56859id, str) || !this.f118801n.m200543r().manageButtons.contains("unblock") || (iIndexOf = this.f118801n.m200543r().manageButtons.indexOf("unblock")) >= this.f118801n.m200543r().manageButtons.size() || iIndexOf < 0) {
            return;
        }
        this.f118801n.m200543r().manageButtons.set(iIndexOf, "blocked");
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: j4 */
    public void mo100222j4(vak0 vak0Var) {
        if (vak0Var == null) {
            return;
        }
        this.f118801n = vak0Var;
        this.f118800m = vak0Var.f183108c;
        if (((b8p0) this.viewModel).isShowing()) {
            ((b8p0) this.viewModel).m103034j(m143877v4());
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m143861t4();
    }

    /* JADX INFO: renamed from: s4 */
    public void m143876s4() {
        if (!y6s.m214494b(m213810E2().mo183435j().liveMode)) {
            m213811F2().VoiceLiveManagerEvent.onCancelManager().mo199273j(mo100219h4().m200540o().f143542a);
            return;
        }
        String strM103845w = bf10.m103845w(mo100219h4().m200540o().f143542a.name, 5);
        String strM209911u = xau.m209911u(R$string.f47977af, strM103845w);
        int iIndexOf = strM209911u.indexOf(strM103845w);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM209911u);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strM103845w.length() + iIndexOf, 33);
        }
        new th0.C20312a(act()).m191151j(spannableStringBuilder).m191158q(R$string.f48021cf).m191156o(new View.OnClickListener() { // from class: l.i8p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113365a.m143866B4(view);
            }
        }).m191146e(R$string.f47999bf).m191142a().m191141g();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().VoiceUserCardEvent.openManageDialog(), new y20() { // from class: l.c8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80232a.m143850F4((vxj0) obj);
            }
        });
        duringCreated((C22421c) m213811F2().VoiceUserCardEvent.setJailed().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.d8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85661a.m143851G4((Boolean) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().VoiceBlackListEvent.updateBlackStatus().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.e8p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92554a.m143875O4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public List<k8p0> m143877v4() {
        final ArrayList arrayList = new ArrayList();
        if (m143865A4()) {
            jyb.m147537z(this.f118801n.m200543r().manageButtons, new y20() { // from class: l.g8p0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102702a.m143867C4(arrayList, (String) obj);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y4 */
    public void m143878y4() {
        m213811F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo199273j(mo100219h4().m200540o().f143542a.f56859id);
    }

    /* JADX INFO: renamed from: z4 */
    public boolean m143879z4() {
        return m213810E2().m168477S0("");
    }
}
