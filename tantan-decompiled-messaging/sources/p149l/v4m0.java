package p149l;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class v4m0<D extends nnn0> extends wjm0<k4m0<D>, D> {

    /* JADX INFO: renamed from: p */
    public static String f179941p = "source_top_manager";

    /* JADX INFO: renamed from: q */
    public static String f179942q = "source_more_func";

    /* JADX INFO: renamed from: k */
    public ltc0 f179943k;

    /* JADX INFO: renamed from: l */
    public bbo0 f179944l;

    /* JADX INFO: renamed from: m */
    public mqv<User> f179945m;

    /* JADX INFO: renamed from: n */
    public p1k0 f179946n;

    /* JADX INFO: renamed from: o */
    public String f179947o;

    public v4m0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f179947o = f179941p;
        mo51532C(new k4m0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m197001Q4(Boolean bool) {
        p1k0 p1k0Var = this.f179946n;
        if (p1k0Var != null) {
            p1k0Var.m167098r().isJailed = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: T4 */
    private void m197002T4() {
        User user;
        mqv<User> mqvVar = this.f179945m;
        if (mqvVar == null || (user = mqvVar.f135304a) == null) {
            return;
        }
        String strConcat = "@" + user.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = jw4.f120018E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(true, strConcat).m205591a(this.f179945m.f135304a.f56011id).m205592b("3"));
    }

    /* JADX INFO: renamed from: x4 */
    private void m197013x4() {
        ltc0 ltc0Var = this.f179943k;
        if (ltc0Var != null) {
            ltc0Var.m151679h();
        }
        bbo0 bbo0Var = this.f179944l;
        if (bbo0Var != null) {
            bbo0Var.m101004j();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public List<gzo0> m197014A4(String str) {
        List<String> list;
        final ArrayList arrayList = new ArrayList();
        if (f179941p.equals(str) && m197021H4()) {
            list = this.f179946n.m167098r().manageButtons;
        } else {
            list = (f179942q.equals(str) && m197022I4()) ? this.f179946n.m167098r().moreButtons : null;
        }
        if (!vwb.m200296J(list)) {
            vwb.m200354z(list, new e30() { // from class: l.q4m0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f152649a.m197024K4(arrayList, (String) obj);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B4 */
    public final gzo0 m197015B4() {
        List list = (List) m129297F3(new twn0(3800));
        return new gzo0((list == null || !vwb.m200337m(list, new w9j() { // from class: l.u4m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f174609a.m197025L4((BLiveVoiceManager) obj);
            }
        })) ? w8u.m202217t(R$string.f46750Ih) : "撤销管理员");
    }

    /* JADX INFO: renamed from: C4 */
    public final gzo0 m197016C4() {
        return new gzo0(ypv.f199497e.getString(((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0()).hierarchy.grade < ypv.m215672k().m195721R5() ? R$string.f47126ac : R$string.f47652yb));
    }

    /* JADX INFO: renamed from: D4 */
    public final String m197017D4() {
        if (e0o0.m114321g(this)) {
            return "anchor";
        }
        if (e0o0.m114322h(this)) {
            return "manager";
        }
        return ((Boolean) m129297F3(new qul0(ypv.f199493a.m199309D0()))).booleanValue() ? "member" : "passerby";
    }

    /* JADX INFO: renamed from: E4 */
    public void m197018E4() {
        if (!x4s.m207012b(m206027E2().mo149813j().liveMode)) {
            m206028F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo172463j(mo181707h4().m167095o().f135304a.f56011id);
            return;
        }
        String strM178016w = r610.m178016w(mo181707h4().m167095o().f135304a.name, 5);
        String str = String.format("成为管理员后，对方可帮你管理麦位及入驻成员。确认邀请 %s 为管理员吗？", strM178016w);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.indexOf(strM178016w);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strM178016w.length() + iIndexOf, 33);
        }
        new xh0.C21150a(act()).m208740s("邀为管理员").m208731j(spannableStringBuilder).m208739r("确认").m208736o(new View.OnClickListener() { // from class: l.t4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167737a.m197026M4(view);
            }
        }).m208727f("取消").m208722a().m208721g();
    }

    /* JADX INFO: renamed from: F4 */
    public final void m197019F4(String str) {
        duringCreated(LivingNormalApiProvider.m71474h6(m206027E2().m149818o(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.p4m0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("已邀请,等待对方同意");
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: G4 */
    public boolean m197020G4() {
        return m206027E2().m132091S0("");
    }

    /* JADX INFO: renamed from: H4 */
    public final boolean m197021H4() {
        p1k0 p1k0Var = this.f179946n;
        return (p1k0Var == null || p1k0Var.m167098r() == null || this.f179946n.m167098r().manageButtons == null) ? false : true;
    }

    /* JADX INFO: renamed from: I4 */
    public final boolean m197022I4() {
        p1k0 p1k0Var = this.f179946n;
        return (p1k0Var == null || p1k0Var.m167098r() == null || this.f179946n.m167098r().moreButtons == null) ? false : true;
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m197023J4(View view) {
        m206028F2().VoiceLiveManagerEvent.onCancelManager().mo172463j(mo181707h4().m167095o().f135304a);
        zvf0.m220399u("e_audio_room_pop_confirm_button", mo77274R2(), new j760("anchorId", m206027E2().m132140j0()), new j760("liveId", m206027E2().m149814k()), new j760("confirm_type", "revoke_manager"), new j760("user_type", m197017D4()));
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ Boolean m197025L4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(this.f179945m.f135304a.f56011id));
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m197026M4(View view) {
        m206028F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo172463j(mo181707h4().m167095o().f135304a.f56011id);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ Boolean m197027N4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(this.f179945m.f135304a.f56011id));
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m197028O4(String str, View view) {
        m197037Z4(str);
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m197029P4(BLiveEnvelope bLiveEnvelope) {
        zvf0.m220399u("e_audio_room_pop_confirm_button", mo77274R2(), new j760("anchorId", m206027E2().m132140j0()), new j760("liveId", m206027E2().m149814k()), new j760("confirm_type", "remove_member"), new j760("user_type", m197017D4()));
        lsi0.m151595y("已移除该用户的成员身份");
        m206028F2().MemberManagerEvent.refreshListData().mo172463j(1);
        bbo0 bbo0Var = this.f179944l;
        if (bbo0Var != null && bbo0Var.m101007m()) {
            this.f179944l.m101004j();
        }
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
    }

    /* JADX INFO: renamed from: R4 */
    public final gzo0 m197030R4() {
        String strM202217t;
        if (this.f179945m == null || this.f179946n == null) {
            return null;
        }
        boolean z = true;
        if (m206027E2().m160249P2().m102063l(this.f179945m.f135304a.f56011id) != null) {
            strM202217t = w8u.m202217t(R$string.f47483qi);
        } else if (this.f179946n.m167083c(this.f179945m.f135304a.f56011id)) {
            strM202217t = w8u.m202217t(R$string.f46706Gh);
            z = false;
        } else {
            strM202217t = w8u.m202217t(R$string.f46631D8);
        }
        gzo0 gzo0Var = new gzo0(strM202217t);
        gzo0Var.m128907d(z);
        return gzo0Var;
    }

    /* JADX INFO: renamed from: S4 */
    public final void m197031S4() {
        if (!x4s.m207012b(m206027E2().mo149813j().liveMode)) {
            m206028F2().ManagerPersonEvent.forbiddenWords().mo172463j(this.f179945m);
        } else if (this.f179946n.m167098r().isJailed) {
            m206028F2().ManagerPersonEvent.unMuteWords().mo172463j(this.f179945m);
        } else {
            m206028F2().ManagerPersonEvent.forbiddenWords().mo172463j(this.f179945m);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX INFO: renamed from: U4 */
    public void m197032U4(String str) {
        ((k4m0) this.viewModel).m144493e();
        if (this.f179945m == null) {
            return;
        }
        str.getClass();
        String str2 = "report";
        switch (str) {
            case "sayHello":
                zvf0.m220399u("e_audio_greeting", "p_audio_profile", j760.m140076a("anchorId", mo96662j3()), j760.m140076a("liveId", m206027E2().m149814k()), j760.m140076a("receiver_user_id", this.f179945m.f135304a.f56011id));
                ypv.f199493a.m199335a0(this.f188513f, this.f179945m.f135304a.f56011id);
                str2 = "";
                break;
            case "managerInvite":
                if (!m197033V4()) {
                    str2 = "";
                    break;
                } else {
                    str2 = "revoke_manager";
                    break;
                }
                break;
            case "report":
                m197035X4(this.f179945m);
                break;
            case "kickRoom":
                m206028F2().ManagerPersonEvent.kickOff().mo172463j(this.f179945m);
                str2 = "kick_user";
                break;
            case "at":
                m197002T4();
                str2 = "";
                break;
            case "jail":
                m197031S4();
                str2 = "block";
                break;
            case "voice":
                m197038a5();
                str2 = "";
                break;
            case "remSettle":
                m197036Y4(this.f188513f, this.f179945m.f135304a.f56011id);
                str2 = "remove_member";
                break;
            case "invite-settle":
                m197019F4(this.f179945m.f135304a.f56011id);
                str2 = "invite_settle";
                break;
            case "realNamePrivateChat":
                mqv<User> mqvVar = this.f179945m;
                if (mqvVar != null) {
                    m197034W4(mqvVar.f135304a.f56011id);
                }
                str2 = "";
                break;
            default:
                str2 = "";
                break;
        }
        zvf0.m220399u("e_audio_user_manegment_memu", mo77274R2(), new j760("anchorId", m206027E2().m132140j0()), new j760("liveId", m206027E2().m149814k()), new j760("button_type", str2), new j760("roomId", m206027E2().m149818o()), new j760("user_type", m197017D4()));
    }

    /* JADX INFO: renamed from: V4 */
    public final boolean m197033V4() {
        if (vwb.m200337m((List) m129297F3(new twn0(3800)), new w9j() { // from class: l.o4m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141801a.m197027N4((BLiveVoiceManager) obj);
            }
        })) {
            m197041w4();
            return false;
        }
        m197018E4();
        return true;
    }

    /* JADX INFO: renamed from: W4 */
    public void m197034W4(String str) {
        act().startActivity(ypv.f199493a.m199385z0(act(), str, false, false));
    }

    /* JADX INFO: renamed from: X4 */
    public void m197035X4(mqv<User> mqvVar) {
        User userM156005h = mqvVar.m156005h();
        if (m206027E2().m132152n0().isVoiceLive() && !TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            boolean z = m206027E2().m160249P2().m102063l(mqvVar.f135304a.f56011id) != null;
            if (this.f179944l == null) {
                this.f179944l = new bbo0();
            }
            this.f179944l.m101010p(this.f188513f, z, mqvVar, m206027E2().m149814k(), m206027E2().m149818o(), m203476g4().getMessageId(), userM156005h.f56011id.equals(m206027E2().m132146l0().f56011id), ypv.f199497e.getString(R$string.f46817Li), LongLinkChatMessage.RoomType.voice.getNumber(), m206027E2().mo149813j().liveMode);
            return;
        }
        if (!m203477i0(mqvVar.m156005h().f56011id) || TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            if (this.f179943k == null) {
                this.f179943k = new ltc0();
            }
            this.f179943k.m151688q(act(), mqvVar, m206027E2().m149814k(), m206027E2().m149818o(), m203476g4().getMessageId(), userM156005h.f56011id.equals(m206027E2().m132146l0().f56011id), ypv.m215672k().m195864j5(), TextUtils.equals("live", m206027E2().mo132054A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
        } else {
            Intent intent = new Intent(m104249C0(), (Class<?>) MkWebViewAct.class);
            intent.putExtra("url", ddv.f85672v);
            intent.putExtra("title", ypv.f199497e.getString(R$string.f47126ac));
            intent.putExtra("hideNavigationBar", true);
            m104249C0().startActivity(intent);
            m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m197036Y4(Act act, final String str) {
        new xh0.C21150a(act).m208740s("确定要移除入驻？").m208728g(true).m208731j("移除后，对方不再是本房间的成员").m208727f("取消").m208739r("确认移除").m208736o(new View.OnClickListener() { // from class: l.n4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137114a.m197028O4(str, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m197037Z4(String str) {
        duringCreated(LivingNormalApiProvider.m71375W6(m206027E2().m149818o(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.s4m0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162452a.m197029P4((BLiveEnvelope) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: a5 */
    public void m197038a5() {
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(mo181707h4().f146688c.f135304a.f56011id);
        if (bLiveVoiceCallM102063l != null) {
            if (!bLiveVoiceCallM102063l.mutedByAnchor || m206027E2().mo97490p() || m197020G4()) {
                if (bLiveVoiceCallM102063l.mutedByUser && m206027E2().mo97490p()) {
                    return;
                }
                u4n0.m191757p(this, bLiveVoiceCallM102063l.f44485id, (bLiveVoiceCallM102063l.mutedByUser || bLiveVoiceCallM102063l.mutedByAnchor) ? false : true, m206027E2().m132091S0(mo181707h4().f146688c.f135304a.f56011id) ? "voice-manager" : "");
            }
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m197039b5(String str) {
        this.f179947o = str;
        ((k4m0) this.viewModel).m144497k(m197014A4(str));
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: j4 */
    public void mo123913j4(p1k0 p1k0Var) {
        if (p1k0Var == null) {
            return;
        }
        this.f179946n = p1k0Var;
        this.f179945m = p1k0Var.f146688c;
        if (((k4m0) this.viewModel).isShowing()) {
            ((k4m0) this.viewModel).m144496j(m197014A4(this.f179947o));
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m197013x4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().VoiceUserCardEvent.openManageDialogWithSource(), new e30() { // from class: l.l4m0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126043a.m197039b5((String) obj);
            }
        });
        duringCreated((C22306c) m206028F2().VoiceUserCardEvent.setJailed().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.m4m0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131308a.m197001Q4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public final void m197024K4(List<gzo0> list, String str) {
        gzo0 gzo0Var;
        gzo0 gzo0Var2;
        str.getClass();
        switch (str) {
            case "sayHello":
                gzo0Var = new gzo0("打招呼");
                break;
            case "managerInvite":
                gzo0Var = m197015B4();
                break;
            case "report":
                gzo0Var = m197016C4();
                break;
            case "kickRoom":
                gzo0Var = new gzo0(w8u.m202217t(R$string.f47432ob));
                break;
            case "at":
                gzo0Var2 = new gzo0(m197042y4());
                gzo0Var = gzo0Var2;
                break;
            case "call":
                gzo0Var = m197030R4();
                break;
            case "jail":
                if (!x4s.m207012b(m206027E2().mo149813j().liveMode)) {
                    gzo0Var = new gzo0(w8u.m202217t(R$string.f47540t9));
                    break;
                } else {
                    gzo0Var2 = new gzo0(w8u.m202217t(this.f179946n.m167098r().isJailed ? R$string.f46989U1 : R$string.f47540t9));
                    gzo0Var = gzo0Var2;
                    break;
                }
                break;
            case "voice":
                gzo0Var = m197043z4();
                break;
            case "remSettle":
                gzo0Var = new gzo0("移除入驻");
                break;
            case "invite-settle":
                gzo0Var = new gzo0("邀请入驻");
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

    /* JADX INFO: renamed from: w4 */
    public void m197041w4() {
        if (x4s.m207012b(m206027E2().mo149813j().liveMode)) {
            new xh0.C21150a(act()).m208740s("确定要撤销管理员？").m208731j("撤销后，对方将不再是本房间的管理员").m208739r("确认").m208736o(new View.OnClickListener() { // from class: l.r4m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f157711a.m197023J4(view);
                }
            }).m208727f("取消").m208722a().m208721g();
        } else {
            m206028F2().VoiceLiveManagerEvent.onCancelManager().mo172463j(mo181707h4().m167095o().f135304a);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final String m197042y4() {
        User user;
        String strM202217t = w8u.m202217t(R$string.f46918Qe);
        mqv<User> mqvVar = this.f179945m;
        return (mqvVar == null || (user = mqvVar.f135304a) == null || !user.isFemale()) ? strM202217t : w8u.m202217t(R$string.f46960Se);
    }

    /* JADX INFO: renamed from: z4 */
    public final gzo0 m197043z4() {
        int i;
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(mo181707h4().f146688c.f135304a.f56011id);
        if (bLiveVoiceCallM102063l == null) {
            return null;
        }
        if (m203477i0(bLiveVoiceCallM102063l.user) && !m206027E2().mo97490p()) {
            return null;
        }
        boolean z = true;
        if (bLiveVoiceCallM102063l.mutedByUser || bLiveVoiceCallM102063l.mutedByAnchor) {
            int i2 = R$string.f47439oi;
            z = (m197020G4() || m206027E2().mo97490p()) && bLiveVoiceCallM102063l.mutedByAnchor;
            i = i2;
        } else {
            i = R$string.f47440oj;
        }
        gzo0 gzo0Var = new gzo0(w8u.m202217t(i));
        gzo0Var.m128907d(z);
        return gzo0Var;
    }
}
