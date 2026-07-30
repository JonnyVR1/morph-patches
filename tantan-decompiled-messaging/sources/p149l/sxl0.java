package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.annotation.CallSuper;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLivePayGuideConfig;
import com.p046p1.mobile.putong.live.base.data.BLivePayGuideInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import p133rx.C22306c;
import p147v.VText;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class sxl0<D extends nnn0> extends wjm0<gwl0<D>, D> {

    /* JADX INFO: renamed from: k */
    public final r1k0 f166802k;

    /* JADX INFO: renamed from: l */
    public UserCardBean f166803l;

    /* JADX INFO: renamed from: m */
    public String f166804m;

    /* JADX INFO: renamed from: n */
    public UserCardData f166805n;

    /* JADX INFO: renamed from: o */
    public BLiveVoiceCall f166806o;

    public sxl0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f166802k = new r1k0();
        mo51532C(new gwl0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m186460a5(soj0 soj0Var) {
        m186482J4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public /* synthetic */ void m186461b5(soj0 soj0Var) {
        m186509m5(mo181707h4());
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ p1k0 m186465o4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: r5 */
    private void m186469r5() {
        if (m186484L4() == null || m186484L4().isFromJs()) {
            return;
        }
        m206031K2().m182470m(LiveDialogEnum.WEBVIEW);
    }

    /* JADX INFO: renamed from: F4 */
    public void m186478F4(BLivePayGuideInfo bLivePayGuideInfo) {
        zvf0.m220399u("e_audio_add_apply_button", "p_audio_profile", vwb.m200311Y("anchorId", m206027E2().m132140j0()), vwb.m200311Y("roomId", m206027E2().m149818o()), vwb.m200311Y("liveId", m206027E2().m149814k()), vwb.m200311Y("other_user_id", mo181707h4().m167095o().f135304a.f56011id), vwb.m200311Y("button_type", "agree"));
        duringCreated(VirtualVoiceRoomApiProvider.postLike(ypv.f199493a.m199309D0(), m203475f4().f56011id)).flatMap(new w9j() { // from class: l.hxl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f109885a.m186488P4((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ixl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115376a.m186489Q4((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G4 */
    public void m186479G4(BLivePayGuideConfig bLivePayGuideConfig) {
        if (bLivePayGuideConfig == null) {
            return;
        }
        BLiveGiftItem bLiveGiftItemM132171w0 = m206027E2().m132171w0(bLivePayGuideConfig.giftId);
        zvf0.m220399u("e_gift", "p_audio_profile", vwb.m200311Y("giftId", Integer.valueOf(bLivePayGuideConfig.giftId)), vwb.m200311Y("giftUnitPrice", Long.valueOf(bLiveGiftItemM132171w0 == null ? 0L : bLiveGiftItemM132171w0.getPrice())), vwb.m200311Y("module", BLiveTraceServerBiz.audio_pay_guide_profile_add), vwb.m200311Y("giftCombos", ""), vwb.m200311Y("gift_receiver_id", mo181707h4().m167095o().f135304a.f56011id));
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106531v(bLivePayGuideConfig.giftId + "", new C20063a(), bLivePayGuideConfig.giftCount, BLiveTraceServerBiz.audio_pay_guide_profile_add, BLiveTraceServerBiz.audio_pay_guide_profile_add, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_profile_add)), mo181707h4().f146688c.f135304a.f56011id, "source_voice_gift_guide").m106529t());
    }

    /* JADX INFO: renamed from: H4 */
    public void m186480H4(User user) {
        m206028F2().VoiceLiveManagerEvent.onCancelManager().mo172463j(user);
    }

    /* JADX INFO: renamed from: I4 */
    public void m186481I4(final User user) {
        final BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(user.f56011id);
        if (bLiveVoiceCallM102063l == null) {
            r1k0.m177473j(m206027E2().mo97490p(), m206027E2().m132146l0().f56011id, m206027E2().m149814k());
            duringCreated(VCallApiProvider.callInvite(m206027E2().m149814k(), user.f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.fxl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99776a.m186490R4(user, (BLiveVoiceCallInvite) obj);
                }
            }, new ult()));
            return;
        }
        if (m206027E2().m132067H0().mo138338d().mo133471a() instanceof js2) {
            if (!x4s.m207013c(m206027E2().mo149813j().liveMode) || !TextUtils.equals(ypv.f199493a.m199309D0(), user.f56011id)) {
                m186500d5(bLiveVoiceCallM102063l, user.f56011id);
                return;
            }
            u25 u25Var = new u25(7012);
            u25Var.f173071d = user.f56011id;
            Boolean bool = (Boolean) m129297F3(u25Var);
            if (!u25Var.f173070c) {
                m186500d5(bLiveVoiceCallM102063l, user.f56011id);
            } else if (bool.booleanValue()) {
                new xh0.C21150a(this.f188513f).m208731j("确认要离开主持位？").m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.gxl0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f104904a.m186491S4(bLiveVoiceCallM102063l, user, view);
                    }
                }).m208726e(R$string.f46734I1).m208722a().m208721g();
            } else {
                osi0.m165783g("游戏中，不能下主持位");
            }
        }
    }

    /* JADX INFO: renamed from: J4 */
    public void m186482J4() {
        this.f166802k.m177475b();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((gwl0) v2).mo71838p();
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final void m186483K4(Throwable th) {
        if (th != null) {
            hfw.m130790a("voiceUserCard", th.toString());
        }
        ((gwl0) this.viewModel).m128465Q0(m186484L4().isShowShadow(), null, null);
        mo123913j4(null);
        m186469r5();
    }

    /* JADX INFO: renamed from: L4 */
    public UserCardData m186484L4() {
        UserCardData userCardData;
        UserCardBean userCardBean = this.f166803l;
        return (userCardBean == null || (userCardData = userCardBean.userCardData) == null) ? this.f166805n : userCardData;
    }

    /* JADX INFO: renamed from: M4 */
    public String m186485M4() {
        return BLiveType.voiceLive;
    }

    /* JADX INFO: renamed from: N4 */
    public String m186486N4() {
        return "voiceroom-" + m186484L4().getSource();
    }

    /* JADX INFO: renamed from: O4 */
    public void m186487O4(String str) {
        if (!x4s.m207012b(m206027E2().mo149813j().liveMode)) {
            m206028F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo172463j(mo181707h4().m167095o().f135304a.f56011id);
            return;
        }
        String strM178016w = r610.m178016w(mo181707h4().m167095o().f135304a.name, 5);
        String str2 = String.format("成为管理员后，对方可帮你管理麦位及入驻成员。确认邀请 %s 为管理员吗？", strM178016w);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int iIndexOf = str2.indexOf(strM178016w);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strM178016w.length() + iIndexOf, 33);
        }
        new xh0.C21150a(act()).m208740s("邀为管理员").m208731j(spannableStringBuilder).m208739r("确认").m208736o(new View.OnClickListener() { // from class: l.exl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93678a.m186492T4(view);
            }
        }).m208727f("取消").m208722a().m208721g();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        vzo0.m200776c(this.f121122b.values(), this.f166803l);
        super.mo99576P3();
        mo123913j4(mo181707h4());
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ C22306c m186488P4(BLiveEnvelope bLiveEnvelope) {
        return LivingNormalApiProvider.m71554q5(m203475f4().f56011id);
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m186489Q4(User user) {
        m186508l5(this.f166805n);
        if (User.isRelationshipMatched(user)) {
            ypv.f199493a.m199367q0(this.f188513f, user, "chatroom_male");
        }
    }

    @Override // p149l.x6s
    @CallSuper
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        m144512z2(new rwl0(this.f188512e, ((gwl0) this.viewModel).f104737v));
        m144512z2(new v4m0(this.f188512e));
        m144512z2(new ibp0(this.f188512e, ((gwl0) this.viewModel).f104733r));
        m144512z2(new xwl0(this.f188512e, ((gwl0) this.viewModel).f104730o));
        m144512z2(new z3m0(this.f188512e, ((gwl0) this.viewModel).f104732q));
        m144512z2(new cyl0(this.f188512e));
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m186490R4(User user, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (x4s.m207012b(m206027E2().mo149813j().liveMode)) {
            lsi0.m151595y(w8u.m202218u(R$string.f47217ef, user.name));
        } else {
            lsi0.m151595y(this.f188513f.getString(R$string.f47591vg, user.name));
        }
        if (mo181707h4() != null) {
            mo181707h4().m167082b(bLiveVoiceCallInvite);
        }
        ((gwl0) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m186491S4(BLiveVoiceCall bLiveVoiceCall, User user, View view) {
        m186500d5(bLiveVoiceCall, user.f56011id);
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m186492T4(View view) {
        m206028F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().mo172463j(mo181707h4().m167095o().f135304a.f56011id);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m186493U4(View view) {
        m186511o5(false);
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ C22306c m186494V4(UserCardData userCardData, roj0 roj0Var) {
        return new a2k0().m94619q(userCardData.userId(), m206027E2().m149814k(), userCardData.getFromIdentity(), userCardData.getTo(), m186485M4(), m186486N4(), m206027E2().m149818o(), true, "voiceFollowships,relationships");
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m186495W4(UserCardData userCardData) {
        this.f166805n = userCardData;
        this.f166806o = m206027E2().m160249P2().m102063l(userCardData.userId());
        this.f166802k.m177476c("p_audio_profile", m206027E2().m149814k(), m206027E2().mo149813j().anchor.f44419id, mo77274R2(), userCardData);
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m186496X4(UserCardData userCardData, p1k0 p1k0Var) {
        this.f166803l = new UserCardBean(p1k0Var, userCardData);
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m186497Y4(p1k0 p1k0Var) {
        if (mo181707h4() == null) {
            m186483K4(null);
        } else {
            ((gwl0) this.viewModel).m128465Q0(m186484L4().isShowShadow(), mo181707h4(), this.f166806o);
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m186498Z4(boolean z, Relationship relationship) {
        if (z) {
            lsi0.m151595y("喜欢已发送");
        } else {
            lsi0.m151595y("喜欢已取消");
        }
        m186512p5(m186484L4());
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: c4 */
    public String mo181706c4() {
        return "voiceLiveRoom";
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m186499c5(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        UserCardData userCardData;
        if (!((gwl0) this.viewModel).isShowing() || (userCardData = this.f166805n) == null) {
            return;
        }
        m186512p5(userCardData);
    }

    /* JADX INFO: renamed from: d5 */
    public void m186500d5(BLiveVoiceCall bLiveVoiceCall, String str) {
        boolean zEquals = TextUtils.equals(str, ypv.f199493a.m199309D0());
        BLiveMember bLiveMemberM201354G = m206027E2().m160249P2().m102069r().m201354G(str);
        String str2 = (zEquals || ((bLiveMemberM201354G == null || !bLiveMemberM201354G.isManager) && !m206027E2().mo97490p())) ? "" : "voice-manager";
        zvf0.m220399u("e_audio_remove", m206027E2().mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("scene", "AudioProfileCard"));
        u4n0.m191748g(this, bLiveVoiceCall, str2);
        ((gwl0) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: e5 */
    public void m186501e5(String str) {
        m186482J4();
        m206028F2().MemberEvent.dismiss().m172467p();
        m206031K2().m182470m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(true, str).m205591a(this.f166803l.userCardData.userId()).m205592b("3"));
    }

    /* JADX INFO: renamed from: f5 */
    public void m186502f5(String str) {
        if (m203473d4() != null) {
            ayj0.m99567b(act(), m203473d4(), false, true, VoiceVirtualApi.getVirtualLikeFromJson("profilePage", "voice_live_profile_page", m206027E2().m149814k(), m206027E2().m149818o()), ayj0.m99569d(VoiceLive.TYPE, m206027E2() != null ? m206027E2().m149818o() : null));
        }
        m186482J4();
    }

    /* JADX INFO: renamed from: g5 */
    public void m186503g5(VText vText, String str, String str2) {
        if (mo181707h4() == null) {
            return;
        }
        boolean zM205843a = ww5.m205843a(str2);
        zvf0.m220399u("e_audio_like", "p_audio_profile", j760.m140076a("anchorId", mo96662j3()), j760.m140076a("click_type", !zM205843a ? "like" : "cancel"), j760.m140076a("liveId", m206027E2().m149814k()), j760.m140076a("receiver_user_id", str));
        if (zM205843a) {
            new xh0.C21150a(this.f188513f).m208731j("确定要取消喜欢吗？").m208738q(R$string.f47639xk).m208736o(new View.OnClickListener() { // from class: l.bxl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f77802a.m186493U4(view);
                }
            }).m208737p(h1c0.f105357d).m208727f(act().getString(R$string.f47662z)).m208722a().m208721g();
        } else {
            m186511o5(true);
        }
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: h4 */
    public p1k0 mo181707h4() {
        return this.f166803l.profileData;
    }

    /* JADX INFO: renamed from: h5 */
    public void m186504h5(String str) {
        zvf0.m220399u("e_anonymous_chat_button", "p_audio_profile", j760.m140076a("receiver_user_id", str), j760.m140076a("message_from", "AudioProfileCard"));
        ypv.f199493a.m199335a0(this.f188513f, str);
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: i4 */
    public void mo181708i4() {
        super.mo181708i4();
        ((gwl0) this.viewModel).m128459I0();
    }

    /* JADX INFO: renamed from: i5 */
    public void m186505i5(String str) {
        hfw.m130790a("voiceUserCard", "check act is null:" + act());
        act().startActivity(ypv.f199493a.m199385z0(act(), str, false, false));
        m186482J4();
    }

    /* JADX INFO: renamed from: j5 */
    public void m186506j5(String str) {
        zvf0.m220399u("e_audio_greeting", "p_audio_profile", j760.m140076a("anchorId", mo96662j3()), j760.m140076a("liveId", m206027E2().m149814k()), j760.m140076a("receiver_user_id", str));
        ypv.f199493a.m199335a0(this.f188513f, str);
        m186482J4();
    }

    /* JADX INFO: renamed from: k5 */
    public void m186507k5(User user) {
        m206028F2().VirtualUserDressUpDlgEvent.openDressUpDialog().mo172463j(user);
    }

    /* JADX INFO: renamed from: l5 */
    public final void m186508l5(final UserCardData userCardData) {
        duringCreated(m206027E2().m132151m2().onErrorReturn(new w9j() { // from class: l.nxl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.oxl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f146221a.m186494V4(userCardData, (roj0) obj);
            }
        })).onErrorReturn(new w9j() { // from class: l.pxl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sxl0.m186465o4((Throwable) obj);
            }
        }).doOnSubscribe(new d30() { // from class: l.qxl0
            @Override // p149l.d30
            public final void call() {
                this.f156850a.m186495W4(userCardData);
            }
        }).doOnNext(new e30() { // from class: l.rxl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161484a.m186496X4(userCardData, (p1k0) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.zwl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205239a.m186497Y4((p1k0) obj);
            }
        }, new e30() { // from class: l.axl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72193a.m186483K4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m5 */
    public void m186509m5(p1k0 p1k0Var) {
        m186482J4();
        if (p1k0Var == null) {
            return;
        }
        mqv<User> mqvVar = p1k0Var.f146688c;
        User user = mqvVar.f135304a;
        mqv<i54> mqvVarM102064m = m206027E2().m160249P2().m102064m(user.f56011id);
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(user.f56011id);
        if (bLiveVoiceCallM102063l == null) {
            u4n0.m191745d(this, mqvVar);
        } else if (mqvVarM102064m != null) {
            u4n0.m191749h(this, bLiveVoiceCallM102063l, mqvVarM102064m);
        }
    }

    /* JADX INFO: renamed from: n5 */
    public void m186510n5(mqv<User> mqvVar) {
        m186482J4();
        u4n0.m191745d(this, mqvVar);
    }

    /* JADX INFO: renamed from: o5 */
    public final void m186511o5(final boolean z) {
        duringCreated(m206027E2().m160263a3(this.f188513f, m203475f4(), z, "profileCard", "p_audio_profile")).doOnError(new e30() { // from class: l.cxl0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("操作失败，请稍后再试");
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.dxl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88310a.m186498Z4(z, (Relationship) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p5 */
    public void m186512p5(UserCardData userCardData) {
        this.f166804m = userCardData.userId();
        m186508l5(userCardData);
    }

    /* JADX INFO: renamed from: q5 */
    public void m186513q5() {
        m206028F2().VoiceUserCardEvent.openManageDialogWithSource().mo172463j(v4m0.f179942q);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129302f3(m206028F2().OpenUserCardDialogEvent.show()).m129322b(new e30() { // from class: l.ywl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200514a.m186512p5((UserCardData) obj);
            }
        });
        m129302f3(m206028F2().OpenUserCardDialogEvent.dismiss()).m129322b(new e30() { // from class: l.jxl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120234a.m186460a5((soj0) obj);
            }
        });
        m129302f3(m206028F2().GiftWallDialogEvent.openGiftDialogFromGiftWall()).m129322b(new e30() { // from class: l.kxl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125141a.m186461b5((soj0) obj);
            }
        });
        m129315u3(new w9j() { // from class: l.lxl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((ti1) obj).m189069R0();
            }
        }).m129322b(new e30() { // from class: l.mxl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136183a.m186499c5((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l.sxl0$a */
    public class C20063a implements zfv.C21687a.a {
        public C20063a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            osi0.m165783g("好友申请已发出");
            sxl0 sxl0Var = sxl0.this;
            sxl0Var.m186508l5(sxl0Var.f166805n);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
        }
    }
}
