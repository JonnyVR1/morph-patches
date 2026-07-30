package p009l;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.bbo0;
import l.bsm;
import l.bwr;
import l.ddv;
import l.e30;
import l.ffw;
import l.j760;
import l.jw4;
import l.lsi0;
import l.ltc0;
import l.mqv;
import l.nnn0;
import l.p1k0;
import l.qib0;
import l.qul0;
import l.r610;
import l.u4n0;
import l.ult;
import l.vud0;
import l.vwb;
import l.w8u;
import l.w9j;
import l.wu4;
import l.wxs;
import l.x4s;
import l.xh0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class v4m0<D extends nnn0> extends wjm0<k4m0<D>, D> {

    /* JADX INFO: renamed from: p */
    public static String f21444p = "source_top_manager";

    /* JADX INFO: renamed from: q */
    public static String f21445q = "source_more_func";

    /* JADX INFO: renamed from: k */
    public ltc0 f21446k;

    /* JADX INFO: renamed from: l */
    public bbo0 f21447l;

    /* JADX INFO: renamed from: m */
    public mqv<User> f21448m;

    /* JADX INFO: renamed from: n */
    public p1k0 f21449n;

    /* JADX INFO: renamed from: o */
    public String f21450o;

    public v4m0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f21450o = f21444p;
        C(new k4m0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m23259Q4(Boolean bool) {
        p1k0 p1k0Var = this.f21449n;
        if (p1k0Var != null) {
            p1k0Var.r().isJailed = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: T4 */
    private void m23260T4() {
        Object obj;
        mqv<User> mqvVar = this.f21448m;
        if (mqvVar == null || (obj = mqvVar.a) == null) {
            return;
        }
        String strConcat = "@" + ((User) obj).name + " ";
        int length = strConcat.length();
        int i = jw4.E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        F2().ChatEvent.chatInputClick().j(new wu4(true, strConcat).a(((DbObject) ((User) this.f21448m.a)).id).b("3"));
    }

    /* JADX INFO: renamed from: x4 */
    private void m23271x4() {
        ltc0 ltc0Var = this.f21446k;
        if (ltc0Var != null) {
            ltc0Var.h();
        }
        bbo0 bbo0Var = this.f21447l;
        if (bbo0Var != null) {
            bbo0Var.j();
        }
    }

    /* JADX INFO: renamed from: A4 */
    public List<gzo0> m23272A4(String str) {
        List list;
        final ArrayList arrayList = new ArrayList();
        if (f21444p.equals(str) && m23279H4()) {
            list = this.f21449n.r().manageButtons;
        } else {
            list = (f21445q.equals(str) && m23280I4()) ? this.f21449n.r().moreButtons : null;
        }
        if (!vwb.J(list)) {
            vwb.z(list, new e30() { // from class: l.q4m0
                public final void call(Object obj) {
                    this.f19025a.m23282K4(arrayList, (String) obj);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B4 */
    public final gzo0 m23273B4() {
        List list = (List) F3(new twn0(3800));
        return new gzo0((list == null || !vwb.m(list, new w9j() { // from class: l.u4m0
            public final Object call(Object obj) {
                return this.f20984a.m23283L4((BLiveVoiceManager) obj);
            }
        })) ? w8u.t(R.string.Ih) : "撤销管理员");
    }

    /* JADX INFO: renamed from: C4 */
    public final gzo0 m23274C4() {
        return new gzo0(ypv.f23200e.getString(((idv) ypv.m25491l(fld0.f13076b)).m16499i(ypv.f23196a.m23619D0()).hierarchy.grade < ypv.m25490k().R5() ? R.string.ac : R.string.yb));
    }

    /* JADX INFO: renamed from: D4 */
    public final String m23275D4() {
        if (e0o0.m13618g(this)) {
            return "anchor";
        }
        if (e0o0.m13619h(this)) {
            return "manager";
        }
        return ((Boolean) F3(new qul0(ypv.f23196a.m23619D0()))).booleanValue() ? "member" : "passerby";
    }

    /* JADX INFO: renamed from: E4 */
    public void m23276E4() {
        if (!x4s.b(((BLiveAbsData) E2().V2()).liveMode)) {
            F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().j(((DbObject) ((User) mo21933h4().o().a)).id);
            return;
        }
        String strW = r610.w(((User) mo21933h4().o().a).name, 5);
        String str = String.format("成为管理员后，对方可帮你管理麦位及入驻成员。确认邀请 %s 为管理员吗？", strW);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.indexOf(strW);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strW.length() + iIndexOf, 33);
        }
        new xh0.a(act()).s("邀为管理员").j(spannableStringBuilder).r("确认").o(new View.OnClickListener() { // from class: l.t4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20557a.m23284M4(view);
            }
        }).f("取消").a().g();
    }

    /* JADX INFO: renamed from: F4 */
    public final void m23277F4(String str) {
        duringCreated(LivingNormalApiProvider.h6(E2().o(), str)).subscribe(ffw.e(new e30() { // from class: l.p4m0
            public final void call(Object obj) {
                lsi0.y("已邀请,等待对方同意");
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: G4 */
    public boolean m23278G4() {
        return E2().S0("");
    }

    /* JADX INFO: renamed from: H4 */
    public final boolean m23279H4() {
        p1k0 p1k0Var = this.f21449n;
        return (p1k0Var == null || p1k0Var.r() == null || this.f21449n.r().manageButtons == null) ? false : true;
    }

    /* JADX INFO: renamed from: I4 */
    public final boolean m23280I4() {
        p1k0 p1k0Var = this.f21449n;
        return (p1k0Var == null || p1k0Var.r() == null || this.f21449n.r().moreButtons == null) ? false : true;
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m23281J4(View view) {
        F2().VoiceLiveManagerEvent.onCancelManager().j((User) mo21933h4().o().a);
        zvf0.u("e_audio_room_pop_confirm_button", R2(), new j760[]{new j760("anchorId", E2().j0()), new j760("liveId", E2().k()), new j760("confirm_type", "revoke_manager"), new j760("user_type", m23275D4())});
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ Boolean m23283L4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(((DbObject) ((User) this.f21448m.a)).id));
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m23284M4(View view) {
        F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().j(((DbObject) ((User) mo21933h4().o().a)).id);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ Boolean m23285N4(BLiveVoiceManager bLiveVoiceManager) {
        return Boolean.valueOf(bLiveVoiceManager.userId.equals(((DbObject) ((User) this.f21448m.a)).id));
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m23286O4(String str, View view) {
        m23295Z4(str);
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m23287P4(BLiveEnvelope bLiveEnvelope) {
        zvf0.u("e_audio_room_pop_confirm_button", R2(), new j760[]{new j760("anchorId", E2().j0()), new j760("liveId", E2().k()), new j760("confirm_type", "remove_member"), new j760("user_type", m23275D4())});
        lsi0.y("已移除该用户的成员身份");
        F2().MemberManagerEvent.refreshListData().j(1);
        bbo0 bbo0Var = this.f21447l;
        if (bbo0Var != null && bbo0Var.m()) {
            this.f21447l.j();
        }
        F2().OpenUserCardDialogEvent.dismiss().p();
    }

    /* JADX INFO: renamed from: R4 */
    public final gzo0 m23288R4() {
        String strT;
        if (this.f21448m == null || this.f21449n == null) {
            return null;
        }
        boolean z = true;
        if (E2().P2().l(((DbObject) ((User) this.f21448m.a)).id) != null) {
            strT = w8u.t(R.string.qi);
        } else if (this.f21449n.c(((DbObject) ((User) this.f21448m.a)).id)) {
            strT = w8u.t(R.string.Gh);
            z = false;
        } else {
            strT = w8u.t(R.string.D8);
        }
        gzo0 gzo0Var = new gzo0(strT);
        gzo0Var.m15370d(z);
        return gzo0Var;
    }

    /* JADX INFO: renamed from: S4 */
    public final void m23289S4() {
        if (!x4s.b(((BLiveAbsData) E2().V2()).liveMode)) {
            F2().ManagerPersonEvent.forbiddenWords().j(this.f21448m);
        } else if (this.f21449n.r().isJailed) {
            F2().ManagerPersonEvent.unMuteWords().j(this.f21448m);
        } else {
            F2().ManagerPersonEvent.forbiddenWords().j(this.f21448m);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX INFO: renamed from: U4 */
    public void m23290U4(String str) {
        ((k4m0) ((bwr) this).viewModel).m17297e();
        if (this.f21448m == null) {
            return;
        }
        str.getClass();
        String str2 = "report";
        switch (str) {
            case "sayHello":
                zvf0.u("e_audio_greeting", "p_audio_profile", new j760[]{j760.a("anchorId", j3()), j760.a("liveId", E2().k()), j760.a("receiver_user_id", ((DbObject) ((User) this.f21448m.a)).id)});
                ypv.f23196a.m23645a0(((wxs) this).f, ((DbObject) ((User) this.f21448m.a)).id);
                str2 = "";
                break;
            case "managerInvite":
                if (!m23291V4()) {
                    str2 = "";
                    break;
                } else {
                    str2 = "revoke_manager";
                    break;
                }
                break;
            case "report":
                m23293X4(this.f21448m);
                break;
            case "kickRoom":
                F2().ManagerPersonEvent.kickOff().j(this.f21448m);
                str2 = "kick_user";
                break;
            case "at":
                m23260T4();
                str2 = "";
                break;
            case "jail":
                m23289S4();
                str2 = "block";
                break;
            case "voice":
                m23296a5();
                str2 = "";
                break;
            case "remSettle":
                m23294Y4(((wxs) this).f, ((DbObject) ((User) this.f21448m.a)).id);
                str2 = "remove_member";
                break;
            case "invite-settle":
                m23277F4(((DbObject) ((User) this.f21448m.a)).id);
                str2 = "invite_settle";
                break;
            case "realNamePrivateChat":
                mqv<User> mqvVar = this.f21448m;
                if (mqvVar != null) {
                    m23292W4(((DbObject) ((User) mqvVar.a)).id);
                }
                str2 = "";
                break;
            default:
                str2 = "";
                break;
        }
        zvf0.u("e_audio_user_manegment_memu", R2(), new j760[]{new j760("anchorId", E2().j0()), new j760("liveId", E2().k()), new j760("button_type", str2), new j760("roomId", E2().o()), new j760("user_type", m23275D4())});
    }

    /* JADX INFO: renamed from: V4 */
    public final boolean m23291V4() {
        if (vwb.m((List) F3(new twn0(3800)), new w9j() { // from class: l.o4m0
            public final Object call(Object obj) {
                return this.f17830a.m23285N4((BLiveVoiceManager) obj);
            }
        })) {
            m23301w4();
            return false;
        }
        m23276E4();
        return true;
    }

    /* JADX INFO: renamed from: W4 */
    public void m23292W4(String str) {
        act().startActivity(ypv.f23196a.m23695z0(act(), str, false, false));
    }

    /* JADX INFO: renamed from: X4 */
    public void m23293X4(mqv<User> mqvVar) {
        User userH = mqvVar.h();
        if (E2().n0().isVoiceLive() && !TEnum.equals(qib0.h0, "indonesia")) {
            boolean z = E2().P2().l(((DbObject) ((User) mqvVar.a)).id) != null;
            if (this.f21447l == null) {
                this.f21447l = new bbo0();
            }
            this.f21447l.p(((wxs) this).f, z, mqvVar, E2().k(), E2().o(), m24303g4().getMessageId(), ((DbObject) userH).id.equals(((DbObject) E2().l0()).id), ypv.f23200e.getString(R.string.Li), LongLinkChatMessage.RoomType.voice.getNumber(), ((BLiveAbsData) E2().V2()).liveMode);
            return;
        }
        if (!m24304i0(((DbObject) mqvVar.h()).id) || TEnum.equals(qib0.h0, "indonesia")) {
            if (this.f21446k == null) {
                this.f21446k = new ltc0();
            }
            this.f21446k.q(act(), mqvVar, E2().k(), E2().o(), m24303g4().getMessageId(), ((DbObject) userH).id.equals(((DbObject) E2().l0()).id), ypv.m25490k().j5(), TextUtils.equals("live", E2().A0()) ? LongLinkChatMessage.RoomType.video.getNumber() : LongLinkChatMessage.RoomType.voice.getNumber());
        } else {
            Intent intent = new Intent(C0(), (Class<?>) MkWebViewAct.class);
            intent.putExtra("url", ddv.v);
            intent.putExtra("title", ypv.f23200e.getString(R.string.ac));
            intent.putExtra("hideNavigationBar", true);
            C0().startActivity(intent);
            F2().OpenUserCardDialogEvent.dismiss().p();
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m23294Y4(Act act, final String str) {
        new xh0.a(act).s("确定要移除入驻？").g(true).j("移除后，对方不再是本房间的成员").f("取消").r("确认移除").o(new View.OnClickListener() { // from class: l.n4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17222a.m23286O4(str, view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m23295Z4(String str) {
        duringCreated(LivingNormalApiProvider.W6(E2().o(), str)).subscribe(ffw.e(new e30() { // from class: l.s4m0
            public final void call(Object obj) {
                this.f20092a.m23287P4((BLiveEnvelope) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: a5 */
    public void m23296a5() {
        BLiveVoiceCall bLiveVoiceCallL = E2().P2().l(((DbObject) ((User) mo21933h4().c.a)).id);
        if (bLiveVoiceCallL != null) {
            if (!bLiveVoiceCallL.mutedByAnchor || E2().p() || m23278G4()) {
                if (bLiveVoiceCallL.mutedByUser && E2().p()) {
                    return;
                }
                u4n0.p(this, bLiveVoiceCallL.id, (bLiveVoiceCallL.mutedByUser || bLiveVoiceCallL.mutedByAnchor) ? false : true, E2().S0(((DbObject) ((User) mo21933h4().c.a)).id) ? "voice-manager" : "");
            }
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m23297b5(String str) {
        this.f21450o = str;
        ((k4m0) ((bwr) this).viewModel).m17302k(m23272A4(str));
    }

    @Override // p009l.wjm0
    /* JADX INFO: renamed from: j4 */
    public void mo14704j4(p1k0 p1k0Var) {
        if (p1k0Var == null) {
            return;
        }
        this.f21449n = p1k0Var;
        this.f21448m = p1k0Var.c;
        if (((k4m0) ((bwr) this).viewModel).isShowing()) {
            ((k4m0) ((bwr) this).viewModel).m17301j(m23272A4(this.f21450o));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m23298n() {
        super/*l.h4t*/.n();
        m23271x4();
    }

    /* JADX INFO: renamed from: t */
    public void m23299t() {
        super/*l.k4t*/.t();
        h3(F2().VoiceUserCardEvent.openManageDialogWithSource(), new e30() { // from class: l.l4m0
            public final void call(Object obj) {
                this.f15936a.m23297b5((String) obj);
            }
        });
        duringCreated((c) F2().VoiceUserCardEvent.setJailed().g()).subscribe(ffw.h(new e30() { // from class: l.m4m0
            public final void call(Object obj) {
                this.f16498a.m23259Q4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4, reason: merged with bridge method [inline-methods] */
    public final void m23282K4(List<gzo0> list, String str) {
        gzo0 gzo0Var;
        gzo0 gzo0Var2;
        str.getClass();
        switch (str) {
            case "sayHello":
                gzo0Var = new gzo0("打招呼");
                break;
            case "managerInvite":
                gzo0Var = m23273B4();
                break;
            case "report":
                gzo0Var = m23274C4();
                break;
            case "kickRoom":
                gzo0Var = new gzo0(w8u.t(R.string.ob));
                break;
            case "at":
                gzo0Var2 = new gzo0(m23302y4());
                gzo0Var = gzo0Var2;
                break;
            case "call":
                gzo0Var = m23288R4();
                break;
            case "jail":
                if (!x4s.b(((BLiveAbsData) E2().V2()).liveMode)) {
                    gzo0Var = new gzo0(w8u.t(R.string.t9));
                    break;
                } else {
                    gzo0Var2 = new gzo0(w8u.t(this.f21449n.r().isJailed ? R.string.U1 : R.string.t9));
                    gzo0Var = gzo0Var2;
                    break;
                }
                break;
            case "voice":
                gzo0Var = m23303z4();
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
            gzo0Var.m15371e(str);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public void m23301w4() {
        if (x4s.b(((BLiveAbsData) E2().V2()).liveMode)) {
            new xh0.a(act()).s("确定要撤销管理员？").j("撤销后，对方将不再是本房间的管理员").r("确认").o(new View.OnClickListener() { // from class: l.r4m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19637a.m23281J4(view);
                }
            }).f("取消").a().g();
        } else {
            F2().VoiceLiveManagerEvent.onCancelManager().j((User) mo21933h4().o().a);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final String m23302y4() {
        Object obj;
        String strT = w8u.t(R.string.Qe);
        mqv<User> mqvVar = this.f21448m;
        return (mqvVar == null || (obj = mqvVar.a) == null || !((User) obj).isFemale()) ? strT : w8u.t(R.string.Se);
    }

    /* JADX INFO: renamed from: z4 */
    public final gzo0 m23303z4() {
        int i;
        BLiveVoiceCall bLiveVoiceCallL = E2().P2().l(((DbObject) ((User) mo21933h4().c.a)).id);
        if (bLiveVoiceCallL == null) {
            return null;
        }
        if (m24304i0(bLiveVoiceCallL.user) && !E2().p()) {
            return null;
        }
        boolean z = true;
        if (bLiveVoiceCallL.mutedByUser || bLiveVoiceCallL.mutedByAnchor) {
            int i2 = R.string.oi;
            z = (m23278G4() || E2().p()) && bLiveVoiceCallL.mutedByAnchor;
            i = i2;
        } else {
            i = R.string.oj;
        }
        gzo0 gzo0Var = new gzo0(w8u.t(i));
        gzo0Var.m15370d(z);
        return gzo0Var;
    }
}
