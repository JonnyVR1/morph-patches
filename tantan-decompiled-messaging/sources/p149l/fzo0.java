package p149l;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class fzo0<D extends nnn0> extends wjm0<xyo0<D>, D> {

    /* JADX INFO: renamed from: k */
    public ltc0 f99986k;

    /* JADX INFO: renamed from: l */
    public bbo0 f99987l;

    /* JADX INFO: renamed from: m */
    public mqv<User> f99988m;

    /* JADX INFO: renamed from: n */
    public p1k0 f99989n;

    public fzo0(bsm<D> bsmVar) {
        super(bsmVar);
        mo51532C(new xyo0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m123887F4(soj0 soj0Var) {
        ((xyo0) this.viewModel).m211871k(m123915v4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m123888G4(Boolean bool) {
        p1k0 p1k0Var = this.f99989n;
        if (p1k0Var != null) {
            p1k0Var.m167098r().isJailed = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: H4 */
    private gzo0 m123889H4() {
        String strM202217t;
        if (this.f99988m == null || this.f99989n == null) {
            return null;
        }
        boolean z = true;
        if (m206027E2().m160249P2().m102063l(this.f99988m.f135304a.f56011id) != null) {
            strM202217t = w8u.m202217t(R$string.f47483qi);
        } else if (this.f99989n.m167083c(this.f99988m.f135304a.f56011id)) {
            strM202217t = w8u.m202217t(R$string.f46706Gh);
            z = false;
        } else {
            strM202217t = w8u.m202217t(R$string.f46631D8);
        }
        gzo0 gzo0Var = new gzo0(strM202217t);
        gzo0Var.m128907d(z);
        return gzo0Var;
    }

    /* JADX INFO: renamed from: I4 */
    private void m123890I4() {
        if (!x4s.m207012b(m206027E2().mo149813j().liveMode)) {
            m206028F2().ManagerPersonEvent.forbiddenWords().mo172463j(this.f99988m);
        } else if (this.f99989n.m167098r().isJailed) {
            m206028F2().ManagerPersonEvent.unMuteWords().mo172463j(this.f99988m);
        } else {
            m206028F2().ManagerPersonEvent.forbiddenWords().mo172463j(this.f99988m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4, reason: merged with bridge method [inline-methods] */
    public void m123904C4(List<gzo0> list, String str) {
        gzo0 gzo0Var;
        str.getClass();
        switch (str) {
            case "sayHello":
                gzo0Var = new gzo0("打招呼");
                break;
            case "managerInvite":
                gzo0Var = m123900w4();
                break;
            case "report":
                gzo0Var = m123901x4();
                break;
            case "kickRoom":
                gzo0Var = new gzo0(w8u.m202217t(R$string.f47432ob));
                break;
            case "unblock":
                gzo0Var = new gzo0(w8u.m202217t(R$string.f46616Cf));
                break;
            case "blocked":
                gzo0Var = new gzo0(w8u.m202217t(R$string.f46594Bf));
                break;
            case "call":
                gzo0Var = m123889H4();
                break;
            case "jail":
                if (!x4s.m207012b(m206027E2().mo149813j().liveMode)) {
                    gzo0Var = new gzo0(w8u.m202217t(R$string.f47540t9));
                    break;
                } else {
                    gzo0Var = new gzo0(w8u.m202217t(this.f99989n.m167098r().isJailed ? R$string.f46989U1 : R$string.f47540t9));
                    break;
                }
                break;
            case "voice":
                gzo0Var = m123899u4();
                break;
            default:
                gzo0Var = null;
                break;
        }
        if (gzo0Var != null) {
            list.add(gzo0Var);
            gzo0Var.m128908e(str);
        }
    }

    /* JADX INFO: renamed from: t4 */
    private void m123898t4() {
        ltc0 ltc0Var = this.f99986k;
        if (ltc0Var != null) {
            ltc0Var.m151679h();
        }
        bbo0 bbo0Var = this.f99987l;
        if (bbo0Var != null) {
            bbo0Var.m101004j();
        }
    }

    /* JADX INFO: renamed from: u4 */
    private gzo0 m123899u4() {
        int i;
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(mo181707h4().f146688c.f135304a.f56011id);
        if (bLiveVoiceCallM102063l == null) {
            return null;
        }
        if (m203477i0(bLiveVoiceCallM102063l.user) && !m206032L2()) {
            return null;
        }
        boolean z = true;
        if (bLiveVoiceCallM102063l.mutedByUser || bLiveVoiceCallM102063l.mutedByAnchor) {
            int i2 = R$string.f47439oi;
            z = (m123917z4() || m206032L2()) && bLiveVoiceCallM102063l.mutedByAnchor;
            i = i2;
        } else {
            i = R$string.f47440oj;
        }
        gzo0 gzo0Var = new gzo0(w8u.m202217t(i));
        gzo0Var.m128907d(z);
        return gzo0Var;
    }

    /* JADX INFO: renamed from: w4 */
    private gzo0 m123900w4() {
        List list = (List) m129297F3(new twn0(3800));
        return new gzo0((list == null || !vwb.m200337m(list, new w9j() { // from class: l.dzo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88499a.m123905D4((BLiveVoiceManager) obj);
            }
        })) ? w8u.m202217t(R$string.f46750Ih) : w8u.m202217t(R$string.f46856Nf));
    }

    /* JADX INFO: renamed from: x4 */
    private gzo0 m123901x4() {
        return new gzo0(ypv.f199497e.getString(((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0()).hierarchy.grade < ypv.m215672k().m195721R5() ? R$string.f47126ac : R$string.f47652yb));
    }

    /* JADX INFO: renamed from: A4 */
    public final boolean m123902A4() {
        p1k0 p1k0Var = this.f99989n;
        return (p1k0Var == null || p1k0Var.m167098r() == null || this.f99989n.m167098r().manageButtons == null) ? false : true;
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m123903B4(View view) {
        m206028F2().VoiceLiveManagerEvent.onCancelManager().mo172463j(mo181707h4().m167095o().f135304a);
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ Boolean m123905D4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(this.f99988m.f135304a.f56011id));
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ Boolean m123906E4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(this.f99988m.f135304a.f56011id));
    }

    /* JADX INFO: renamed from: J4 */
    public void m123907J4(String str) {
        ((xyo0) this.viewModel).m211867e();
        if (this.f99988m == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "sayHello":
                zvf0.m220399u("e_audio_greeting", "p_audio_profile", j760.m140076a("anchorId", mo96662j3()), j760.m140076a("liveId", m206027E2().m149814k()), j760.m140076a("receiver_user_id", this.f99988m.f135304a.f56011id));
                ypv.f199493a.m199335a0(this.f188513f, this.f99988m.f135304a.f56011id);
                break;
            case "managerInvite":
                m123908K4();
                break;
            case "report":
                m123910M4(this.f99988m);
                break;
            case "kickRoom":
                m206028F2().ManagerPersonEvent.kickOff().mo172463j(this.f99988m);
                break;
            case "unblock":
                if (this.f99988m != null) {
                    m206028F2().VoiceBlackListEvent.addBlackList().mo172463j(this.f99988m.f135304a);
                    break;
                }
                break;
            case "jail":
                m123890I4();
                break;
            case "voice":
                m123911N4();
                break;
            case "realNamePrivateChat":
                mqv<User> mqvVar = this.f99988m;
                if (mqvVar != null) {
                    m123909L4(mqvVar.f135304a.f56011id);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final void m123908K4() {
        if (vwb.m200337m((List) m129297F3(new twn0(3800)), new w9j() { // from class: l.bzo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f78049a.m123906E4((BLiveVoiceManager) obj);
            }
        })) {
            m123914s4();
        } else {
            m123916y4();
        }
    }

    /* JADX INFO: renamed from: L4 */
    public void m123909L4(String str) {
        act().startActivity(ypv.f199493a.m199385z0(act(), str, false, false));
    }

    /* JADX INFO: renamed from: M4 */
    public void m123910M4(mqv<User> mqvVar) {
        User userM156005h = mqvVar.m156005h();
        if (m206027E2().m132152n0().isVoiceLive() && !TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            boolean z = m206027E2().m160249P2().m102063l(mqvVar.f135304a.f56011id) != null;
            if (this.f99987l == null) {
                this.f99987l = new bbo0();
            }
            this.f99987l.m101010p(this.f188513f, z, mqvVar, m206027E2().m149814k(), m206027E2().m149818o(), m203476g4().getMessageId(), userM156005h.f56011id.equals(m206027E2().m132146l0().f56011id), ypv.f199497e.getString(R$string.f46817Li), LongLinkChatMessage.RoomType.voice.getNumber(), m206027E2().mo149813j().liveMode);
            return;
        }
        if (!m203477i0(mqvVar.m156005h().f56011id) || TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            if (this.f99986k == null) {
                this.f99986k = new ltc0();
            }
            this.f99986k.m151688q(act(), mqvVar, m206027E2().m149814k(), m206027E2().m149818o(), m203476g4().getMessageId(), userM156005h.f56011id.equals(m206027E2().m132146l0().f56011id), ypv.m215672k().m195864j5(), TextUtils.equals("live", m206027E2().mo132054A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
        } else {
            Intent intent = new Intent(m104249C0(), (Class<?>) MkWebViewAct.class);
            intent.putExtra("url", ddv.f85672v);
            intent.putExtra("title", ypv.f199497e.getString(R$string.f47126ac));
            intent.putExtra("hideNavigationBar", true);
            m104249C0().startActivity(intent);
            m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m123911N4() {
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(mo181707h4().f146688c.f135304a.f56011id);
        if (bLiveVoiceCallM102063l != null) {
            if (!bLiveVoiceCallM102063l.mutedByAnchor || m206032L2() || m123917z4()) {
                if (bLiveVoiceCallM102063l.mutedByUser && m206032L2()) {
                    return;
                }
                u4n0.m191757p(this, bLiveVoiceCallM102063l.f44485id, (bLiveVoiceCallM102063l.mutedByUser || bLiveVoiceCallM102063l.mutedByAnchor) ? false : true, m206027E2().m132091S0(mo181707h4().f146688c.f135304a.f56011id) ? "voice-manager" : "");
            }
        }
    }

    /* JADX INFO: renamed from: O4 */
    public void m123912O4(String str) {
        p1k0 p1k0Var;
        int iIndexOf;
        mqv<User> mqvVar = this.f99988m;
        if (mqvVar == null || mqvVar.f135304a == null || (p1k0Var = this.f99989n) == null || p1k0Var.m167098r() == null || !TextUtils.equals(this.f99988m.f135304a.f56011id, str) || !this.f99989n.m167098r().manageButtons.contains("unblock") || (iIndexOf = this.f99989n.m167098r().manageButtons.indexOf("unblock")) >= this.f99989n.m167098r().manageButtons.size() || iIndexOf < 0) {
            return;
        }
        this.f99989n.m167098r().manageButtons.set(iIndexOf, "blocked");
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: j4 */
    public void mo123913j4(p1k0 p1k0Var) {
        if (p1k0Var == null) {
            return;
        }
        this.f99989n = p1k0Var;
        this.f99988m = p1k0Var.f146688c;
        if (((xyo0) this.viewModel).isShowing()) {
            ((xyo0) this.viewModel).m211870j(m123915v4());
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m123898t4();
    }

    /* JADX INFO: renamed from: s4 */
    public void m123914s4() {
        if (!x4s.m207012b(m206027E2().mo149813j().liveMode)) {
            m206028F2().VoiceLiveManagerEvent.onCancelManager().mo172463j(mo181707h4().m167095o().f135304a);
            return;
        }
        String strM178016w = r610.m178016w(mo181707h4().m167095o().f135304a.name, 5);
        String strM202218u = w8u.m202218u(R$string.f47129af, strM178016w);
        int iIndexOf = strM202218u.indexOf(strM178016w);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM202218u);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strM178016w.length() + iIndexOf, 33);
        }
        new xh0.C21150a(act()).m208731j(spannableStringBuilder).m208738q(R$string.f47173cf).m208736o(new View.OnClickListener() { // from class: l.ezo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93933a.m123903B4(view);
            }
        }).m208726e(R$string.f47151bf).m208722a().m208721g();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().VoiceUserCardEvent.openManageDialog(), new e30() { // from class: l.yyo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200792a.m123887F4((soj0) obj);
            }
        });
        duringCreated((C22306c) m206028F2().VoiceUserCardEvent.setJailed().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.zyo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205704a.m123888G4((Boolean) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().VoiceBlackListEvent.updateBlackStatus().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.azo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72367a.m123912O4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public List<gzo0> m123915v4() {
        final ArrayList arrayList = new ArrayList();
        if (m123902A4()) {
            vwb.m200354z(this.f99989n.m167098r().manageButtons, new e30() { // from class: l.czo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f83101a.m123904C4(arrayList, (String) obj);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y4 */
    public void m123916y4() {
        m206028F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo172463j(mo181707h4().m167095o().f135304a.f56011id);
    }

    /* JADX INFO: renamed from: z4 */
    public boolean m123917z4() {
        return m206027E2().m132091S0("");
    }
}
