package p153l;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class zdm0<D extends rwn0> extends atm0<odm0<D>, D> {

    /* JADX INFO: renamed from: p */
    public static String f203894p = "source_top_manager";

    /* JADX INFO: renamed from: q */
    public static String f203895q = "source_more_func";

    /* JADX INFO: renamed from: k */
    public q1d0 f203896k;

    /* JADX INFO: renamed from: l */
    public fko0 f203897l;

    /* JADX INFO: renamed from: m */
    public nsv<User> f203898m;

    /* JADX INFO: renamed from: n */
    public vak0 f203899n;

    /* JADX INFO: renamed from: o */
    public String f203900o;

    public zdm0(dum<D> dumVar) {
        super(dumVar);
        this.f203900o = f203894p;
        mo52715C(new odm0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m219303Q4(Boolean bool) {
        vak0 vak0Var = this.f203899n;
        if (vak0Var != null) {
            vak0Var.m200543r().isJailed = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: T4 */
    private void m219304T4() {
        User user;
        nsv<User> nsvVar = this.f203898m;
        if (nsvVar == null || (user = nsvVar.f143542a) == null) {
            return;
        }
        String strConcat = "@" + user.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = ix4.f117314E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(true, strConcat).m202991a(this.f203898m.f143542a.f56859id).m202992b("3"));
    }

    /* JADX INFO: renamed from: x4 */
    private void m219315x4() {
        q1d0 q1d0Var = this.f203896k;
        if (q1d0Var != null) {
            q1d0Var.m174859h();
        }
        fko0 fko0Var = this.f203897l;
        if (fko0Var != null) {
            fko0Var.m126046j();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public List<k8p0> m219316A4(String str) {
        List<String> list;
        final ArrayList arrayList = new ArrayList();
        if (f203894p.equals(str) && m219323H4()) {
            list = this.f203899n.m200543r().manageButtons;
        } else {
            list = (f203895q.equals(str) && m219324I4()) ? this.f203899n.m200543r().moreButtons : null;
        }
        if (!jyb.m147479J(list)) {
            jyb.m147537z(list, new y20() { // from class: l.udm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178554a.m219326K4(arrayList, (String) obj);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B4 */
    public final k8p0 m219317B4() {
        List list = (List) m138856F3(new x5o0(3800));
        return new k8p0((list == null || !jyb.m147520m(list, new qcj() { // from class: l.ydm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f198612a.m219327L4((BLiveVoiceManager) obj);
            }
        })) ? xau.m209910t(R$string.f47598Ih) : "撤销管理员");
    }

    /* JADX INFO: renamed from: C4 */
    public final k8p0 m219318C4() {
        return new k8p0(zrv.f205803e.getString(((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0()).hierarchy.grade < zrv.m221193k().m203508R5() ? R$string.f47974ac : R$string.f48500yb));
    }

    /* JADX INFO: renamed from: D4 */
    public final String m219319D4() {
        if (i9o0.m139136g(this)) {
            return "anchor";
        }
        if (i9o0.m139137h(this)) {
            return "manager";
        }
        return ((Boolean) m138856F3(new u3m0(zrv.f205799a.m207631D0()))).booleanValue() ? "member" : "passerby";
    }

    /* JADX INFO: renamed from: E4 */
    public void m219320E4() {
        if (!y6s.m214494b(m213810E2().mo183435j().liveMode)) {
            m213811F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo199273j(mo100219h4().m200540o().f143542a.f56859id);
            return;
        }
        String strM103845w = bf10.m103845w(mo100219h4().m200540o().f143542a.name, 5);
        String str = String.format("成为管理员后，对方可帮你管理麦位及入驻成员。确认邀请 %s 为管理员吗？", strM103845w);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.indexOf(strM103845w);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strM103845w.length() + iIndexOf, 33);
        }
        new th0.C20312a(act()).m191160s("邀为管理员").m191151j(spannableStringBuilder).m191159r("确认").m191156o(new View.OnClickListener() { // from class: l.xdm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193614a.m219328M4(view);
            }
        }).m191147f("取消").m191142a().m191141g();
    }

    /* JADX INFO: renamed from: F4 */
    public final void m219321F4(String str) {
        duringCreated(LivingNormalApiProvider.m72657h6(m213810E2().m202194o(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.tdm0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("已邀请,等待对方同意");
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: G4 */
    public boolean m219322G4() {
        return m213810E2().m168477S0("");
    }

    /* JADX INFO: renamed from: H4 */
    public final boolean m219323H4() {
        vak0 vak0Var = this.f203899n;
        return (vak0Var == null || vak0Var.m200543r() == null || this.f203899n.m200543r().manageButtons == null) ? false : true;
    }

    /* JADX INFO: renamed from: I4 */
    public final boolean m219324I4() {
        vak0 vak0Var = this.f203899n;
        return (vak0Var == null || vak0Var.m200543r() == null || this.f203899n.m200543r().moreButtons == null) ? false : true;
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m219325J4(View view) {
        m213811F2().VoiceLiveManagerEvent.onCancelManager().mo199273j(mo100219h4().m200540o().f143542a);
        i4g0.m138523u("e_audio_room_pop_confirm_button", mo78457R2(), new pf60("anchorId", m213810E2().m168526j0()), new pf60("liveId", m213810E2().m202191k()), new pf60("confirm_type", "revoke_manager"), new pf60("user_type", m219319D4()));
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ Boolean m219327L4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(this.f203898m.f143542a.f56859id));
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m219328M4(View view) {
        m213811F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo199273j(mo100219h4().m200540o().f143542a.f56859id);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ Boolean m219329N4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(this.f203898m.f143542a.f56859id));
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m219330O4(String str, View view) {
        m219339Z4(str);
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m219331P4(BLiveEnvelope bLiveEnvelope) {
        i4g0.m138523u("e_audio_room_pop_confirm_button", mo78457R2(), new pf60("anchorId", m213810E2().m168526j0()), new pf60("liveId", m213810E2().m202191k()), new pf60("confirm_type", "remove_member"), new pf60("user_type", m219319D4()));
        o1j0.m165651y("已移除该用户的成员身份");
        m213811F2().MemberManagerEvent.refreshListData().mo199273j(1);
        fko0 fko0Var = this.f203897l;
        if (fko0Var != null && fko0Var.m126049m()) {
            this.f203897l.m126046j();
        }
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
    }

    /* JADX INFO: renamed from: R4 */
    public final k8p0 m219332R4() {
        String strM209910t;
        if (this.f203898m == null || this.f203899n == null) {
            return null;
        }
        boolean z = true;
        if (m213810E2().m183411P2().m136873l(this.f203898m.f143542a.f56859id) != null) {
            strM209910t = xau.m209910t(R$string.f48331qi);
        } else if (this.f203899n.m200528c(this.f203898m.f143542a.f56859id)) {
            strM209910t = xau.m209910t(R$string.f47554Gh);
            z = false;
        } else {
            strM209910t = xau.m209910t(R$string.f47479D8);
        }
        k8p0 k8p0Var = new k8p0(strM209910t);
        k8p0Var.m148744d(z);
        return k8p0Var;
    }

    /* JADX INFO: renamed from: S4 */
    public final void m219333S4() {
        if (!y6s.m214494b(m213810E2().mo183435j().liveMode)) {
            m213811F2().ManagerPersonEvent.forbiddenWords().mo199273j(this.f203898m);
        } else if (this.f203899n.m200543r().isJailed) {
            m213811F2().ManagerPersonEvent.unMuteWords().mo199273j(this.f203898m);
        } else {
            m213811F2().ManagerPersonEvent.forbiddenWords().mo199273j(this.f203898m);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX INFO: renamed from: U4 */
    public void m219334U4(String str) {
        ((odm0) this.viewModel).m167323e();
        if (this.f203898m == null) {
            return;
        }
        str.getClass();
        String str2 = "report";
        switch (str) {
            case "sayHello":
                i4g0.m138523u("e_audio_greeting", "p_audio_profile", pf60.m172085a("anchorId", mo104749j3()), pf60.m172085a("liveId", m213810E2().m202191k()), pf60.m172085a("receiver_user_id", this.f203898m.f143542a.f56859id));
                zrv.f205799a.m207657a0(this.f196919f, this.f203898m.f143542a.f56859id);
                str2 = "";
                break;
            case "managerInvite":
                if (!m219335V4()) {
                    str2 = "";
                    break;
                } else {
                    str2 = "revoke_manager";
                    break;
                }
                break;
            case "report":
                m219337X4(this.f203898m);
                break;
            case "kickRoom":
                m213811F2().ManagerPersonEvent.kickOff().mo199273j(this.f203898m);
                str2 = "kick_user";
                break;
            case "at":
                m219304T4();
                str2 = "";
                break;
            case "jail":
                m219333S4();
                str2 = "block";
                break;
            case "voice":
                m219340a5();
                str2 = "";
                break;
            case "remSettle":
                m219338Y4(this.f196919f, this.f203898m.f143542a.f56859id);
                str2 = "remove_member";
                break;
            case "invite-settle":
                m219321F4(this.f203898m.f143542a.f56859id);
                str2 = "invite_settle";
                break;
            case "realNamePrivateChat":
                nsv<User> nsvVar = this.f203898m;
                if (nsvVar != null) {
                    m219336W4(nsvVar.f143542a.f56859id);
                }
                str2 = "";
                break;
            default:
                str2 = "";
                break;
        }
        i4g0.m138523u("e_audio_user_manegment_memu", mo78457R2(), new pf60("anchorId", m213810E2().m168526j0()), new pf60("liveId", m213810E2().m202191k()), new pf60("button_type", str2), new pf60("roomId", m213810E2().m202194o()), new pf60("user_type", m219319D4()));
    }

    /* JADX INFO: renamed from: V4 */
    public final boolean m219335V4() {
        if (jyb.m147520m((List) m138856F3(new x5o0(3800)), new qcj() { // from class: l.sdm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167445a.m219329N4((BLiveVoiceManager) obj);
            }
        })) {
            m219343w4();
            return false;
        }
        m219320E4();
        return true;
    }

    /* JADX INFO: renamed from: W4 */
    public void m219336W4(String str) {
        act().startActivity(zrv.f205799a.m207707z0(act(), str, false, false));
    }

    /* JADX INFO: renamed from: X4 */
    public void m219337X4(nsv<User> nsvVar) {
        User userM164643h = nsvVar.m164643h();
        if (m213810E2().m168538n0().isVoiceLive() && !TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            boolean z = m213810E2().m183411P2().m136873l(nsvVar.f143542a.f56859id) != null;
            if (this.f203897l == null) {
                this.f203897l = new fko0();
            }
            this.f203897l.m126052p(this.f196919f, z, nsvVar, m213810E2().m202191k(), m213810E2().m202194o(), m100218g4().getMessageId(), userM164643h.f56859id.equals(m213810E2().m168532l0().f56859id), zrv.f205803e.getString(R$string.f47665Li), LongLinkChatMessage.RoomType.voice.getNumber(), m213810E2().mo183435j().liveMode);
            return;
        }
        if (!m100220i0(nsvVar.m164643h().f56859id) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) {
            if (this.f203896k == null) {
                this.f203896k = new q1d0();
            }
            this.f203896k.m174868q(act(), nsvVar, m213810E2().m202191k(), m213810E2().m202194o(), m100218g4().getMessageId(), userM164643h.f56859id.equals(m213810E2().m168532l0().f56859id), zrv.m221193k().m203651j5(), TextUtils.equals("live", m213810E2().mo118362A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
        } else {
            Intent intent = new Intent(m113230C0(), (Class<?>) MkWebViewAct.class);
            intent.putExtra("url", efv.f93865v);
            intent.putExtra("title", zrv.f205803e.getString(R$string.f47974ac));
            intent.putExtra("hideNavigationBar", true);
            m113230C0().startActivity(intent);
            m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m219338Y4(Act act, final String str) {
        new th0.C20312a(act).m191160s("确定要移除入驻？").m191148g(true).m191151j("移除后，对方不再是本房间的成员").m191147f("取消").m191159r("确认移除").m191156o(new View.OnClickListener() { // from class: l.rdm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162320a.m219330O4(str, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m219339Z4(String str) {
        duringCreated(LivingNormalApiProvider.m72558W6(m213810E2().m202194o(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.wdm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188622a.m219331P4((BLiveEnvelope) obj);
            }
        }, new wnt()));
    }

    /* JADX INFO: renamed from: a5 */
    public void m219340a5() {
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(mo100219h4().f183108c.f143542a.f56859id);
        if (bLiveVoiceCallM136873l != null) {
            if (!bLiveVoiceCallM136873l.mutedByAnchor || m213810E2().mo118373p() || m219322G4()) {
                if (bLiveVoiceCallM136873l.mutedByUser && m213810E2().mo118373p()) {
                    return;
                }
                ydn0.m215263p(this, bLiveVoiceCallM136873l.f45333id, (bLiveVoiceCallM136873l.mutedByUser || bLiveVoiceCallM136873l.mutedByAnchor) ? false : true, m213810E2().m168477S0(mo100219h4().f183108c.f143542a.f56859id) ? "voice-manager" : "");
            }
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m219341b5(String str) {
        this.f203900o = str;
        ((odm0) this.viewModel).m167327k(m219316A4(str));
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: j4 */
    public void mo100222j4(vak0 vak0Var) {
        if (vak0Var == null) {
            return;
        }
        this.f203899n = vak0Var;
        this.f203898m = vak0Var.f183108c;
        if (((odm0) this.viewModel).isShowing()) {
            ((odm0) this.viewModel).m167326j(m219316A4(this.f203900o));
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m219315x4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().VoiceUserCardEvent.openManageDialogWithSource(), new y20() { // from class: l.pdm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151814a.m219341b5((String) obj);
            }
        });
        duringCreated((C22421c) m213811F2().VoiceUserCardEvent.setJailed().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.qdm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156749a.m219303Q4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public final void m219326K4(List<k8p0> list, String str) {
        k8p0 k8p0Var;
        k8p0 k8p0Var2;
        str.getClass();
        switch (str) {
            case "sayHello":
                k8p0Var = new k8p0("打招呼");
                break;
            case "managerInvite":
                k8p0Var = m219317B4();
                break;
            case "report":
                k8p0Var = m219318C4();
                break;
            case "kickRoom":
                k8p0Var = new k8p0(xau.m209910t(R$string.f48280ob));
                break;
            case "at":
                k8p0Var2 = new k8p0(m219344y4());
                k8p0Var = k8p0Var2;
                break;
            case "call":
                k8p0Var = m219332R4();
                break;
            case "jail":
                if (!y6s.m214494b(m213810E2().mo183435j().liveMode)) {
                    k8p0Var = new k8p0(xau.m209910t(R$string.f48388t9));
                    break;
                } else {
                    k8p0Var2 = new k8p0(xau.m209910t(this.f203899n.m200543r().isJailed ? R$string.f47837U1 : R$string.f48388t9));
                    k8p0Var = k8p0Var2;
                    break;
                }
                break;
            case "voice":
                k8p0Var = m219345z4();
                break;
            case "remSettle":
                k8p0Var = new k8p0("移除入驻");
                break;
            case "invite-settle":
                k8p0Var = new k8p0("邀请入驻");
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

    /* JADX INFO: renamed from: w4 */
    public void m219343w4() {
        if (y6s.m214494b(m213810E2().mo183435j().liveMode)) {
            new th0.C20312a(act()).m191160s("确定要撤销管理员？").m191151j("撤销后，对方将不再是本房间的管理员").m191159r("确认").m191156o(new View.OnClickListener() { // from class: l.vdm0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183641a.m219325J4(view);
                }
            }).m191147f("取消").m191142a().m191141g();
        } else {
            m213811F2().VoiceLiveManagerEvent.onCancelManager().mo199273j(mo100219h4().m200540o().f143542a);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final String m219344y4() {
        User user;
        String strM209910t = xau.m209910t(R$string.f47766Qe);
        nsv<User> nsvVar = this.f203898m;
        return (nsvVar == null || (user = nsvVar.f143542a) == null || !user.isFemale()) ? strM209910t : xau.m209910t(R$string.f47808Se);
    }

    /* JADX INFO: renamed from: z4 */
    public final k8p0 m219345z4() {
        int i;
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(mo100219h4().f183108c.f143542a.f56859id);
        if (bLiveVoiceCallM136873l == null) {
            return null;
        }
        if (m100220i0(bLiveVoiceCallM136873l.user) && !m213810E2().mo118373p()) {
            return null;
        }
        boolean z = true;
        if (bLiveVoiceCallM136873l.mutedByUser || bLiveVoiceCallM136873l.mutedByAnchor) {
            int i2 = R$string.f48287oi;
            z = (m219322G4() || m213810E2().mo118373p()) && bLiveVoiceCallM136873l.mutedByAnchor;
            i = i2;
        } else {
            i = R$string.f48288oj;
        }
        k8p0 k8p0Var = new k8p0(xau.m209910t(i));
        k8p0Var.m148744d(z);
        return k8p0Var;
    }
}
