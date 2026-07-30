package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.annotation.CallSuper;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLivePayGuideConfig;
import com.p051p1.mobile.putong.live.base.data.BLivePayGuideInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import p137rx.C22421c;
import p151v.VText;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class w6m0<D extends rwn0> extends atm0<k5m0<D>, D> {

    /* JADX INFO: renamed from: k */
    public final xak0 f187630k;

    /* JADX INFO: renamed from: l */
    public UserCardBean f187631l;

    /* JADX INFO: renamed from: m */
    public String f187632m;

    /* JADX INFO: renamed from: n */
    public UserCardData f187633n;

    /* JADX INFO: renamed from: o */
    public BLiveVoiceCall f187634o;

    public w6m0(dum<D> dumVar) {
        super(dumVar);
        this.f187630k = new xak0();
        mo52715C(new k5m0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m205122a5(vxj0 vxj0Var) {
        m205144J4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public /* synthetic */ void m205123b5(vxj0 vxj0Var) {
        m205171m5(mo100219h4());
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ vak0 m205127o4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: r5 */
    private void m205131r5() {
        if (m205146L4() == null || m205146L4().isFromJs()) {
            return;
        }
        m213814K2().m189706m(LiveDialogEnum.WEBVIEW);
    }

    /* JADX INFO: renamed from: F4 */
    public void m205140F4(BLivePayGuideInfo bLivePayGuideInfo) {
        i4g0.m138523u("e_audio_add_apply_button", "p_audio_profile", jyb.m147494Y("anchorId", m213810E2().m168526j0()), jyb.m147494Y("roomId", m213810E2().m202194o()), jyb.m147494Y("liveId", m213810E2().m202191k()), jyb.m147494Y("other_user_id", mo100219h4().m200540o().f143542a.f56859id), jyb.m147494Y("button_type", "agree"));
        duringCreated(VirtualVoiceRoomApiProvider.postLike(zrv.f205799a.m207631D0(), m100217f4().f56859id)).flatMap(new qcj() { // from class: l.l6m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130268a.m205150P4((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.m6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135015a.m205151Q4((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G4 */
    public void m205141G4(BLivePayGuideConfig bLivePayGuideConfig) {
        if (bLivePayGuideConfig == null) {
            return;
        }
        BLiveGiftItem bLiveGiftItemM168555w0 = m213810E2().m168555w0(bLivePayGuideConfig.giftId);
        i4g0.m138523u("e_gift", "p_audio_profile", jyb.m147494Y("giftId", Integer.valueOf(bLivePayGuideConfig.giftId)), jyb.m147494Y("giftUnitPrice", Long.valueOf(bLiveGiftItemM168555w0 == null ? 0L : bLiveGiftItemM168555w0.getPrice())), jyb.m147494Y("module", BLiveTraceServerBiz.audio_pay_guide_profile_add), jyb.m147494Y("giftCombos", ""), jyb.m147494Y("gift_receiver_id", mo100219h4().m200540o().f143542a.f56859id));
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136085v(bLivePayGuideConfig.giftId + "", new C21040a(), bLivePayGuideConfig.giftCount, BLiveTraceServerBiz.audio_pay_guide_profile_add, BLiveTraceServerBiz.audio_pay_guide_profile_add, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_profile_add)), mo100219h4().f183108c.f143542a.f56859id, "source_voice_gift_guide").m136083t());
    }

    /* JADX INFO: renamed from: H4 */
    public void m205142H4(User user) {
        m213811F2().VoiceLiveManagerEvent.onCancelManager().mo199273j(user);
    }

    /* JADX INFO: renamed from: I4 */
    public void m205143I4(final User user) {
        final BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(user.f56859id);
        if (bLiveVoiceCallM136873l == null) {
            xak0.m209861j(m213810E2().mo118373p(), m213810E2().m168532l0().f56859id, m213810E2().m202191k());
            duringCreated(VCallApiProvider.callInvite(m213810E2().m202191k(), user.f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.j6m0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118570a.m205152R4(user, (BLiveVoiceCallInvite) obj);
                }
            }, new wnt()));
            return;
        }
        if (m213810E2().m168456H0().mo107433d().mo133182a() instanceof zs2) {
            if (!y6s.m214495c(m213810E2().mo183435j().liveMode) || !TextUtils.equals(zrv.f205799a.m207631D0(), user.f56859id)) {
                m205162d5(bLiveVoiceCallM136873l, user.f56859id);
                return;
            }
            u35 u35Var = new u35(7012);
            u35Var.f177285d = user.f56859id;
            Boolean bool = (Boolean) m138856F3(u35Var);
            if (!u35Var.f177284c) {
                m205162d5(bLiveVoiceCallM136873l, user.f56859id);
            } else if (bool.booleanValue()) {
                new th0.C20312a(this.f196919f).m191151j("确认要离开主持位？").m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.k6m0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f124189a.m205153S4(bLiveVoiceCallM136873l, user, view);
                    }
                }).m191146e(R$string.f47582I1).m191142a().m191141g();
            } else {
                r1j0.m179420g("游戏中，不能下主持位");
            }
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m205144J4() {
        this.f187630k.m209863b();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((k5m0) v2).mo73021p();
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final void m205145K4(Throwable th) {
        if (th != null) {
            fhw.m125605a("voiceUserCard", th.toString());
        }
        ((k5m0) this.viewModel).m148454Q0(m205146L4().isShowShadow(), null, null);
        mo100222j4(null);
        m205131r5();
    }

    /* JADX INFO: renamed from: L4 */
    public UserCardData m205146L4() {
        UserCardData userCardData;
        UserCardBean userCardBean = this.f187631l;
        return (userCardBean == null || (userCardData = userCardBean.userCardData) == null) ? this.f187633n : userCardData;
    }

    /* JADX INFO: renamed from: M4 */
    public String m205147M4() {
        return BLiveType.voiceLive;
    }

    /* JADX INFO: renamed from: N4 */
    public String m205148N4() {
        return "voiceroom-" + m205146L4().getSource();
    }

    /* JADX INFO: renamed from: O4 */
    public void m205149O4(String str) {
        if (!y6s.m214494b(m213810E2().mo183435j().liveMode)) {
            m213811F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo199273j(mo100219h4().m200540o().f143542a.f56859id);
            return;
        }
        String strM103845w = bf10.m103845w(mo100219h4().m200540o().f143542a.name, 5);
        String str2 = String.format("成为管理员后，对方可帮你管理麦位及入驻成员。确认邀请 %s 为管理员吗？", strM103845w);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int iIndexOf = str2.indexOf(strM103845w);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strM103845w.length() + iIndexOf, 33);
        }
        new th0.C20312a(act()).m191160s("邀为管理员").m191151j(spannableStringBuilder).m191159r("确认").m191156o(new View.OnClickListener() { // from class: l.i6m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113177a.m205154T4(view);
            }
        }).m191147f("取消").m191142a().m191141g();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        z8p0.m219019c(this.f130285b.values(), this.f187631l);
        super.mo96837P3();
        mo100222j4(mo100219h4());
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ C22421c m205150P4(BLiveEnvelope bLiveEnvelope) {
        return LivingNormalApiProvider.m72737q5(m100217f4().f56859id);
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m205151Q4(User user) {
        m205170l5(this.f187633n);
        if (User.isRelationshipMatched(user)) {
            zrv.f205799a.m207689q0(this.f196919f, user, "chatroom_male");
        }
    }

    @Override // p153l.y8s
    @CallSuper
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        m153103z2(new v5m0(this.f196918e, ((k5m0) this.viewModel).f124098v));
        m153103z2(new zdm0(this.f196918e));
        m153103z2(new mkp0(this.f196918e, ((k5m0) this.viewModel).f124094r));
        m153103z2(new b6m0(this.f196918e, ((k5m0) this.viewModel).f124091o));
        m153103z2(new ddm0(this.f196918e, ((k5m0) this.viewModel).f124093q));
        m153103z2(new g7m0(this.f196918e));
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m205152R4(User user, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (y6s.m214494b(m213810E2().mo183435j().liveMode)) {
            o1j0.m165651y(xau.m209911u(R$string.f48065ef, user.name));
        } else {
            o1j0.m165651y(this.f196919f.getString(R$string.f48439vg, user.name));
        }
        if (mo100219h4() != null) {
            mo100219h4().m200527b(bLiveVoiceCallInvite);
        }
        ((k5m0) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m205153S4(BLiveVoiceCall bLiveVoiceCall, User user, View view) {
        m205162d5(bLiveVoiceCall, user.f56859id);
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m205154T4(View view) {
        m213811F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo199273j(mo100219h4().m200540o().f143542a.f56859id);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m205155U4(View view) {
        m205173o5(false);
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ C22421c m205156V4(UserCardData userCardData, uxj0 uxj0Var) {
        return new gbk0().m129797q(userCardData.userId(), m213810E2().m202191k(), userCardData.getFromIdentity(), userCardData.getTo(), m205147M4(), m205148N4(), m213810E2().m202194o(), true, "voiceFollowships,relationships");
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m205157W4(UserCardData userCardData) {
        this.f187633n = userCardData;
        this.f187634o = m213810E2().m183411P2().m136873l(userCardData.userId());
        this.f187630k.m209864c("p_audio_profile", m213810E2().m202191k(), m213810E2().mo183435j().anchor.f45267id, mo78457R2(), userCardData);
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m205158X4(UserCardData userCardData, vak0 vak0Var) {
        this.f187631l = new UserCardBean(vak0Var, userCardData);
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m205159Y4(vak0 vak0Var) {
        if (mo100219h4() == null) {
            m205145K4(null);
        } else {
            ((k5m0) this.viewModel).m148454Q0(m205146L4().isShowShadow(), mo100219h4(), this.f187634o);
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m205160Z4(boolean z, Relationship relationship) {
        if (z) {
            o1j0.m165651y("喜欢已发送");
        } else {
            o1j0.m165651y("喜欢已取消");
        }
        m205174p5(m205146L4());
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: c4 */
    public String mo100214c4() {
        return "voiceLiveRoom";
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m205161c5(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        UserCardData userCardData;
        if (!((k5m0) this.viewModel).isShowing() || (userCardData = this.f187633n) == null) {
            return;
        }
        m205174p5(userCardData);
    }

    /* JADX INFO: renamed from: d5 */
    public void m205162d5(BLiveVoiceCall bLiveVoiceCall, String str) {
        boolean zEquals = TextUtils.equals(str, zrv.f205799a.m207631D0());
        BLiveMember bLiveMemberM97111G = m213810E2().m183411P2().m136879r().m97111G(str);
        String str2 = (zEquals || ((bLiveMemberM97111G == null || !bLiveMemberM97111G.isManager) && !m213810E2().mo118373p())) ? "" : "voice-manager";
        i4g0.m138523u("e_audio_remove", m213810E2().mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("scene", "AudioProfileCard"));
        ydn0.m215254g(this, bLiveVoiceCall, str2);
        ((k5m0) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: e5 */
    public void m205163e5(String str) {
        m205144J4();
        m213811F2().MemberEvent.dismiss().m199277p();
        m213814K2().m189706m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(true, str).m202991a(this.f187631l.userCardData.userId()).m202992b("3"));
    }

    /* JADX INFO: renamed from: f5 */
    public void m205164f5(String str) {
        if (m100215d4() != null) {
            g7k0.m129332b(act(), m100215d4(), false, true, VoiceVirtualApi.getVirtualLikeFromJson("profilePage", "voice_live_profile_page", m213810E2().m202191k(), m213810E2().m202194o()), g7k0.m129334d(VoiceLive.TYPE, m213810E2() != null ? m213810E2().m202194o() : null));
        }
        m205144J4();
    }

    /* JADX INFO: renamed from: g5 */
    public void m205165g5(VText vText, String str, String str2) {
        if (mo100219h4() == null) {
            return;
        }
        boolean zM106991a = by5.m106991a(str2);
        i4g0.m138523u("e_audio_like", "p_audio_profile", pf60.m172085a("anchorId", mo104749j3()), pf60.m172085a("click_type", !zM106991a ? "like" : "cancel"), pf60.m172085a("liveId", m213810E2().m202191k()), pf60.m172085a("receiver_user_id", str));
        if (zM106991a) {
            new th0.C20312a(this.f196919f).m191151j("确定要取消喜欢吗？").m191158q(R$string.f48487xk).m191156o(new View.OnClickListener() { // from class: l.f6m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f97414a.m205155U4(view);
                }
            }).m191157p(n9c0.f140818d).m191147f(act().getString(R$string.f48510z)).m191142a().m191141g();
        } else {
            m205173o5(true);
        }
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: h4 */
    public vak0 mo100219h4() {
        return this.f187631l.profileData;
    }

    /* JADX INFO: renamed from: h5 */
    public void m205166h5(String str) {
        i4g0.m138523u("e_anonymous_chat_button", "p_audio_profile", pf60.m172085a("receiver_user_id", str), pf60.m172085a("message_from", "AudioProfileCard"));
        zrv.f205799a.m207657a0(this.f196919f, str);
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: i4 */
    public void mo100221i4() {
        super.mo100221i4();
        ((k5m0) this.viewModel).m148448I0();
    }

    /* JADX INFO: renamed from: i5 */
    public void m205167i5(String str) {
        fhw.m125605a("voiceUserCard", "check act is null:" + act());
        act().startActivity(zrv.f205799a.m207707z0(act(), str, false, false));
        m205144J4();
    }

    /* JADX INFO: renamed from: j5 */
    public void m205168j5(String str) {
        i4g0.m138523u("e_audio_greeting", "p_audio_profile", pf60.m172085a("anchorId", mo104749j3()), pf60.m172085a("liveId", m213810E2().m202191k()), pf60.m172085a("receiver_user_id", str));
        zrv.f205799a.m207657a0(this.f196919f, str);
        m205144J4();
    }

    /* JADX INFO: renamed from: k5 */
    public void m205169k5(User user) {
        m213811F2().VirtualUserDressUpDlgEvent.openDressUpDialog().mo199273j(user);
    }

    /* JADX INFO: renamed from: l5 */
    public final void m205170l5(final UserCardData userCardData) {
        duringCreated(m213810E2().m168537m2().onErrorReturn(new qcj() { // from class: l.r6m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.s6m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166589a.m205156V4(userCardData, (uxj0) obj);
            }
        })).onErrorReturn(new qcj() { // from class: l.t6m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w6m0.m205127o4((Throwable) obj);
            }
        }).doOnSubscribe(new x20() { // from class: l.u6m0
            @Override // p153l.x20
            public final void call() {
                this.f177794a.m205157W4(userCardData);
            }
        }).doOnNext(new y20() { // from class: l.v6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182670a.m205158X4(userCardData, (vak0) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.d6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85385a.m205159Y4((vak0) obj);
            }
        }, new y20() { // from class: l.e6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92290a.m205145K4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m5 */
    public void m205171m5(vak0 vak0Var) {
        m205144J4();
        if (vak0Var == null) {
            return;
        }
        nsv<User> nsvVar = vak0Var.f183108c;
        User user = nsvVar.f143542a;
        nsv<h64> nsvVarM136874m = m213810E2().m183411P2().m136874m(user.f56859id);
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(user.f56859id);
        if (bLiveVoiceCallM136873l == null) {
            ydn0.m215251d(this, nsvVar);
        } else if (nsvVarM136874m != null) {
            ydn0.m215255h(this, bLiveVoiceCallM136873l, nsvVarM136874m);
        }
    }

    /* JADX INFO: renamed from: n5 */
    public void m205172n5(nsv<User> nsvVar) {
        m205144J4();
        ydn0.m215251d(this, nsvVar);
    }

    /* JADX INFO: renamed from: o5 */
    public final void m205173o5(final boolean z) {
        duringCreated(m213810E2().m183425a3(this.f196919f, m100217f4(), z, "profileCard", "p_audio_profile")).doOnError(new y20() { // from class: l.g6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("操作失败，请稍后再试");
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.h6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108038a.m205160Z4(z, (Relationship) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p5 */
    public void m205174p5(UserCardData userCardData) {
        this.f187632m = userCardData.userId();
        m205170l5(userCardData);
    }

    /* JADX INFO: renamed from: q5 */
    public void m205175q5() {
        m213811F2().VoiceUserCardEvent.openManageDialogWithSource().mo199273j(zdm0.f203895q);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138861f3(m213811F2().OpenUserCardDialogEvent.show()).m138881b(new y20() { // from class: l.c6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79980a.m205174p5((UserCardData) obj);
            }
        });
        m138861f3(m213811F2().OpenUserCardDialogEvent.dismiss()).m138881b(new y20() { // from class: l.n6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140475a.m205122a5((vxj0) obj);
            }
        });
        m138861f3(m213811F2().GiftWallDialogEvent.openGiftDialogFromGiftWall()).m138881b(new y20() { // from class: l.o6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145192a.m205123b5((vxj0) obj);
            }
        });
        m138874u3(new qcj() { // from class: l.p6m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((aj1) obj).m98251R0();
            }
        }).m138881b(new y20() { // from class: l.q6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155823a.m205161c5((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l.w6m0$a */
    public class C21040a implements aiv.C15716a.a {
        public C21040a() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            r1j0.m179420g("好友申请已发出");
            w6m0 w6m0Var = w6m0.this;
            w6m0Var.m205170l5(w6m0Var.f187633n);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
        }
    }
}
