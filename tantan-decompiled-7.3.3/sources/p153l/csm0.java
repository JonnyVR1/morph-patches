package p153l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class csm0<T extends oo2> extends yh2<T> {

    /* JADX INFO: renamed from: o */
    public o9n0 f83466o;

    /* JADX INFO: renamed from: p */
    public boolean f83467p;

    /* JADX INFO: renamed from: l.csm0$a */
    public static /* synthetic */ class C16352a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f83468a;

        static {
            int[] iArr = new int[IChatItemLongClickArea.LongClickArea.values().length];
            f83468a = iArr;
            try {
                iArr[IChatItemLongClickArea.LongClickArea.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83468a[IChatItemLongClickArea.LongClickArea.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public csm0(dum dumVar, ChatListView chatListView) {
        super(dumVar, chatListView);
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m112193V4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m112196Y4(a5s a5sVar, rz4.C19938a c19938a, uxj0 uxj0Var) {
        a5sVar.m96248f(false);
        String str = c19938a.f165487c;
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: H4 */
    public void mo112199H4(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage) {
        IChatItemLongClickArea.LongClickArea longClickArea = iChatItemLongClickArea.getLongClickArea();
        if (longClickArea == null) {
            return;
        }
        int i = C16352a.f83468a[longClickArea.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.f83466o.m166771V3(iChatItemLongClickArea.getClickTarget(), liveMessage);
        } else {
            if (liveMessage.liveUserInfo == null || TextUtils.equals(zrv.f205799a.m207631D0(), liveMessage.liveUserInfo.userId)) {
                return;
            }
            LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
            m112206f5(liveUserInfo.userId, liveUserInfo.userName);
        }
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: I4 */
    public void mo112200I4() {
        this.f83466o.m166764N3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.yh2
    /* JADX INFO: renamed from: J4 */
    public void mo112201J4(LiveMessage liveMessage) {
        super.mo112201J4(liveMessage);
        i35.m138274j(m213810E2(), liveMessage, this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [l.oo2, l.vp20] */
    @Override // p153l.yh2
    /* JADX INFO: renamed from: K4 */
    public void mo103883K4(a5s a5sVar, View view, String str, LiveMessage liveMessage) {
        super.mo103883K4(a5sVar, view, str, liveMessage);
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1441382951:
                if (str.equals("voiceCallInvite")) {
                    b = 0;
                }
                break;
            case -1264717412:
                if (str.equals("anchorInviteCall")) {
                    b = 1;
                }
                break;
            case -826168941:
                if (str.equals("voiceThankNewUser")) {
                    b = 2;
                }
                break;
            case -608019810:
                if (str.equals("voiceCallApply")) {
                    b = 3;
                }
                break;
            case -470236690:
                if (str.equals("voiceFollowUser")) {
                    b = 4;
                }
                break;
            case -436216957:
                if (str.equals("voiceFollow")) {
                    b = 5;
                }
                break;
            case -309425751:
                if (str.equals("profile")) {
                    b = 6;
                }
                break;
            case -202952172:
                if (str.equals("buttonOpenChat")) {
                    b = 7;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    b = 8;
                }
                break;
            case 117350765:
                if (str.equals("buttonOpenProfile")) {
                    b = 9;
                }
                break;
            case 327389058:
                if (str.equals("settleApprove")) {
                    b = 10;
                }
                break;
            case 332706215:
                if (str.equals("inviteVoiceCall")) {
                    b = 11;
                }
                break;
            case 1522514826:
                if (str.equals("auctionApprove")) {
                    b = 12;
                }
                break;
            case 1607657074:
                if (str.equals("chatReply")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1921093160:
                if (str.equals("medalDesc")) {
                    b = 14;
                }
                break;
        }
        switch (b) {
            case 0:
                m112205e5(liveMessage.extInfo.callInviteId);
                break;
            case 1:
            case 11:
                m112207g5(liveMessage, a5sVar, str);
                break;
            case 2:
                if (!a5sVar.m96245c()) {
                    o1j0.m165634h(R$string.f48148ia);
                } else {
                    m112217p5(liveMessage, a5sVar);
                }
                break;
            case 3:
                m112202b5(liveMessage.extInfo.applyCallId, liveMessage.liveUserInfo.userName);
                break;
            case 4:
                m112219r5(liveMessage, a5sVar);
                break;
            case 5:
                m112220s5(liveMessage);
                break;
            case 6:
            case 9:
                if (liveMessage.extInfo == null) {
                    return;
                }
                boolean zEquals = "profile".equals(str);
                LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
                m112215n5(zEquals ? extInfo.atUserInfo : extInfo.buttonUserInfo);
                break;
            case 7:
                BLiveAtUserInfo bLiveAtUserInfo = liveMessage.extInfo.buttonUserInfo;
                String str2 = bLiveAtUserInfo == null ? "" : bLiveAtUserInfo.userId;
                if (!TextUtils.isEmpty(str2)) {
                    act().startActivity(zrv.f205799a.m207707z0(act(), str2, false, false));
                }
                break;
            case 8:
                m112218q5(liveMessage, "welcome");
                break;
            case 10:
                m112204d5(liveMessage, a5sVar, liveMessage.extInfo);
                break;
            case 12:
                m112203c5(liveMessage, a5sVar, liveMessage.extInfo);
                break;
            case 13:
                m112216o5(liveMessage);
                break;
            case 14:
                if (!TextUtils.isEmpty(a5sVar.m96244b())) {
                    m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(100).m174141B(a5sVar.m96244b()).m174152z(1.0d, 0.5d).m174146t(80).m174142p(CommonH5Builder.BgType.DEFAULT_BG).m174143q());
                }
                break;
        }
        if (m112208h5(liveMessage)) {
            afu.m97565n(m213810E2().m202191k(), m213810E2().m168532l0().f56859id, liveMessage.extInfo.buttonUserInfo.userId, str);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m112202b5(String str, String str2) {
        m213811F2().VoiceCallEvent.agreeVoiceCallEvent().mo199273j(new bzm0().m107182c(str).m107189j(str2));
    }

    /* JADX INFO: renamed from: c5 */
    public final void m112203c5(final LiveMessage liveMessage, final a5s a5sVar, LiveMessage.ExtInfo extInfo) {
        duringCreated((C22421c<T>) w61.m205029M(m213810E2().m202191k(), extInfo.applyCallId)).subscribe(dhw.m115826e(new y20() { // from class: l.vrm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185499a.m112209i5(a5sVar, liveMessage, (BLiveEnvelope) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: d5 */
    public final void m112204d5(final LiveMessage liveMessage, final a5s a5sVar, LiveMessage.ExtInfo extInfo) {
        BLiveAtUserInfo bLiveAtUserInfo;
        t3m0.m189102p(this);
        String str = (extInfo == null || (bLiveAtUserInfo = extInfo.buttonUserInfo) == null) ? "" : bLiveAtUserInfo.userId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated((C22421c<T>) LivingNormalApiProvider.m72429I3(m213810E2().m202194o(), str, Boolean.TRUE)).subscribe(dhw.m115826e(new y20() { // from class: l.xrm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195938a.m112210j5(a5sVar, liveMessage, (String) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: e5 */
    public final void m112205e5(String str) {
        m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0().m107183d("invite"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: f5 */
    public final void m112206f5(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strConcat = "@" + str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = ix4.f117314E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(true, strConcat).m202991a(str).m202992b("3"));
        i4g0.m138495D("e_audio_long_press_avatar_send_message", mo78457R2(), jyb.m147494Y("live_id", m213810E2().m202191k()), jyb.m147494Y("to_user_id", str));
    }

    /* JADX INFO: renamed from: g5 */
    public final void m112207g5(final LiveMessage liveMessage, final a5s a5sVar, String str) {
        if (!m112208h5(liveMessage)) {
            o1j0.m165639m("当前参数有误，请确认后端 buttonUserInfo 是否有误");
            return;
        }
        xak0.m209862k(m213810E2().mo118373p(), m213810E2(), str, i9o0.m139140l(this));
        String str2 = liveMessage.extInfo.buttonUserInfo.userId;
        if (!i9o0.m139146r(this, str2)) {
            duringCreated((C22421c<T>) VCallApiProvider.callInvite(m213810E2().m202191k(), str2)).subscribe(dhw.m115826e(new y20() { // from class: l.urm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180659a.m112212k5(a5sVar, liveMessage, (BLiveVoiceCallInvite) obj);
                }
            }, new wnt()));
            return;
        }
        o1j0.m165651y("对方已在麦上");
        a5sVar.mo96250h(false);
        ((ChatListView) this.viewModel).m73874M(liveMessage);
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m112208h5(LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo;
        BLiveAtUserInfo bLiveAtUserInfo;
        return (liveMessage == null || (extInfo = liveMessage.extInfo) == null || (bLiveAtUserInfo = extInfo.buttonUserInfo) == null || TextUtils.isEmpty(bLiveAtUserInfo.userId)) ? false : true;
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m112209i5(a5s a5sVar, LiveMessage liveMessage, BLiveEnvelope bLiveEnvelope) {
        a5sVar.mo96250h(false);
        ((ChatListView) this.viewModel).m73874M(liveMessage);
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m112210j5(a5s a5sVar, LiveMessage liveMessage, String str) {
        a5sVar.mo96250h(false);
        ((ChatListView) this.viewModel).m73874M(liveMessage);
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: k4 */
    public void mo112211k4(final String str, LiveMessage liveMessage) {
        super.mo112211k4(str, liveMessage);
        SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(0);
        tro0 tro0Var = (tro0) jyb.m147530s((tro0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), tro0.class), new qcj() { // from class: l.zrm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((tro0) obj).m192516b().equals(str));
            }
        });
        if (tro0Var != null) {
            tro0Var.setVisible(false);
            ((ChatListView) this.viewModel).m73874M(liveMessage);
        }
        if ("voiceFollowUser".equals(str)) {
            m112214m5(liveMessage);
        }
        if ("voiceFollow".equals(str)) {
            m112213l5(liveMessage);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2] */
    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m112212k5(a5s a5sVar, LiveMessage liveMessage, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        a5sVar.mo96250h(false);
        o1j0.m165649w(R$string.f47554Gh);
        if (y6s.m214494b(m213810E2().m168538n0().liveMode)) {
            ((ChatListView) this.viewModel).m73867F(liveMessage);
        }
        ((ChatListView) this.viewModel).m73874M(liveMessage);
    }

    /* JADX INFO: renamed from: l5 */
    public void m112213l5(LiveMessage liveMessage) {
        int size = liveMessage.spanList.size();
        List<SpannableStringBuilder> list = liveMessage.spanList;
        SpannableStringBuilder spannableStringBuilder = size >= 2 ? list.get(1) : list.get(0);
        agn0 agn0Var = (agn0) jyb.m147530s((agn0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), agn0.class), new qcj() { // from class: l.asm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((agn0) obj).m97704b().equals("voiceFollow"));
            }
        });
        if (agn0Var == null) {
            return;
        }
        bgn0 bgn0Var = (bgn0) jyb.m147530s((bgn0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), bgn0.class), new qcj() { // from class: l.bsm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((bgn0) obj).m104233i().equals("voiceFollow"));
            }
        });
        if (liveMessage.getVoiceFollowSource() == 3) {
            agn0Var.m97710h(false);
        } else {
            agn0Var.m97708f();
        }
        if (bgn0Var != null) {
            bgn0Var.m104234j(false);
        }
        ((ChatListView) this.viewModel).m73874M(liveMessage);
    }

    /* JADX INFO: renamed from: m5 */
    public final void m112214m5(LiveMessage liveMessage) {
        int size = liveMessage.spanList.size();
        List<SpannableStringBuilder> list = liveMessage.spanList;
        SpannableStringBuilder spannableStringBuilder = size >= 2 ? list.get(1) : list.get(0);
        tro0 tro0Var = (tro0) jyb.m147530s((tro0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), tro0.class), new qcj() { // from class: l.srm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((tro0) obj).m192516b().equals("voiceFollowUser"));
            }
        });
        if (tro0Var == null) {
            return;
        }
        tro0Var.setVisible(false);
        ((ChatListView) this.viewModel).m73874M(liveMessage);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX INFO: renamed from: n5 */
    public final void m112215n5(BLiveAtUserInfo bLiveAtUserInfo) {
        if (bLiveAtUserInfo == null || TextUtils.isEmpty(bLiveAtUserInfo.userId)) {
            return;
        }
        ydn0.m215258k(this, m213810E2().m168532l0().f56859id, bLiveAtUserInfo.userId);
    }

    /* JADX INFO: renamed from: o5 */
    public final void m112216o5(LiveMessage liveMessage) {
        if (liveMessage == null || liveMessage.liveUserInfo == null) {
            return;
        }
        m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(true, "@" + liveMessage.liveUserInfo.userName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m202991a(liveMessage.liveUserInfo.userId).m202992b("3"));
    }

    /* JADX INFO: renamed from: p5 */
    public final void m112217p5(LiveMessage liveMessage, final a5s a5sVar) {
        if (liveMessage == null || liveMessage.liveUserInfo == null || TextUtils.isEmpty(a5sVar.m96243a())) {
            return;
        }
        final rz4.C19938a c19938a = new rz4.C19938a();
        LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        c19938a.f165487c = liveUserInfo.userName;
        c19938a.f165486b = liveUserInfo.userId;
        duringCreated((C22421c<T>) m213810E2().m168487V1(a5sVar.m96243a(), c19938a)).subscribe(dhw.m115826e(new y20() { // from class: l.trm0
            @Override // p153l.y20
            public final void call(Object obj) {
                csm0.m112196Y4(a5sVar, c19938a, (uxj0) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: q5 */
    public final void m112218q5(LiveMessage liveMessage, String str) {
        if (m112208h5(liveMessage)) {
            duringCreated((C22421c<T>) itv.m142094R(m213810E2().m202191k(), str, liveMessage.extInfo.buttonUserInfo.userId)).subscribe(dhw.m115826e(new y20() { // from class: l.wrm0
                @Override // p153l.y20
                public final void call(Object obj) {
                    csm0.m112193V4((BLiveEnvelope) obj);
                }
            }, new r5k()));
        }
    }

    /* JADX INFO: renamed from: r5 */
    public void m112219r5(LiveMessage liveMessage, a5s a5sVar) {
        if (m112208h5(liveMessage)) {
            LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
            extInfo.followUserId = extInfo.buttonUserInfo.userId;
            m215927n4(liveMessage, a5sVar, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: s5 */
    public void m112220s5(LiveMessage liveMessage) {
        m213810E2().m168511e0(false, mo78457R2(), afu.m97567p(liveMessage.getVoiceFollowSource()), new x20() { // from class: l.rrm0
            @Override // p153l.x20
            public final void call() {
                o1j0.m165649w(R$string.f47651L4);
            }
        });
        j35.m143328m(this, liveMessage);
    }

    @Override // p153l.yh2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        o9n0 o9n0Var = new o9n0(this.f196918e, new k9n0());
        this.f83466o = o9n0Var;
        m153103z2(o9n0Var);
        duringCreated((C22421c<T>) m213810E2().m168545q1().m98337x0()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.yrm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201334a.m215923h4((gvn0) obj);
            }
        }));
    }

    @Override // p153l.yh2
    /* JADX INFO: renamed from: t4 */
    public boolean mo112221t4() {
        return true;
    }
}
