package p002l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p000p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.bwr;
import l.cmn0;
import l.d30;
import l.e0o0;
import l.e30;
import l.ffw;
import l.g0n0;
import l.j760;
import l.jo0;
import l.k0n0;
import l.lsi0;
import l.p61;
import l.pul0;
import l.roj0;
import l.u4n0;
import l.ult;
import l.vud0;
import l.vwb;
import l.w9j;
import l.x4s;
import l.xpm0;
import l.ypv;
import l.z2k;
import l.zcu;
import l.zvf0;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class yim0<T extends ho2> extends rh2<T> {

    /* JADX INFO: renamed from: o */
    public k0n0 f22909o;

    /* JADX INFO: renamed from: p */
    public boolean f22910p;

    /* JADX INFO: renamed from: l.yim0$a */
    public static /* synthetic */ class C0920a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22911a;

        static {
            int[] iArr = new int[IChatItemLongClickArea.LongClickArea.values().length];
            f22911a = iArr;
            try {
                iArr[IChatItemLongClickArea.LongClickArea.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22911a[IChatItemLongClickArea.LongClickArea.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public yim0(bsm bsmVar, ChatListView chatListView) {
        super(bsmVar, chatListView);
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m26731V4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m26734Y4(z2s z2sVar, sy4.C0832a c0832a, roj0 roj0Var) {
        z2sVar.m27048f(false);
        String str = c0832a.f19335c;
    }

    @Override // p002l.rh2
    /* JADX INFO: renamed from: H4 */
    public void mo21963H4(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage) {
        IChatItemLongClickArea.LongClickArea longClickArea = iChatItemLongClickArea.getLongClickArea();
        if (longClickArea == null) {
            return;
        }
        int i = C0920a.f22911a[longClickArea.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.f22909o.V3(iChatItemLongClickArea.getClickTarget(), liveMessage);
        } else {
            if (liveMessage.liveUserInfo == null || TextUtils.equals(ypv.a.D0(), liveMessage.liveUserInfo.userId)) {
                return;
            }
            LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
            m26741f5(liveUserInfo.userId, liveUserInfo.userName);
        }
    }

    @Override // p002l.rh2
    /* JADX INFO: renamed from: I4 */
    public void mo21964I4() {
        this.f22909o.N3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p002l.rh2
    /* JADX INFO: renamed from: J4 */
    public void mo21965J4(LiveMessage liveMessage) {
        super.mo21965J4(liveMessage);
        j25.m15565j(m25547E2(), liveMessage, this);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [l.ho2, l.lh20] */
    @Override // p002l.rh2
    /* JADX INFO: renamed from: K4 */
    public void mo17682K4(z2s z2sVar, View view, String str, LiveMessage liveMessage) {
        super.mo17682K4(z2sVar, view, str, liveMessage);
        str.getClass();
        switch (str) {
            case "voiceCallInvite":
                m26740e5(liveMessage.extInfo.callInviteId);
                break;
            case "anchorInviteCall":
            case "inviteVoiceCall":
                m26742g5(liveMessage, z2sVar, str);
                break;
            case "voiceThankNewUser":
                if (!z2sVar.m27046c()) {
                    lsi0.h(R$string.f3342ia);
                    break;
                } else {
                    m26751p5(liveMessage, z2sVar);
                    break;
                }
                break;
            case "voiceCallApply":
                m26737b5(liveMessage.extInfo.applyCallId, liveMessage.liveUserInfo.userName);
                break;
            case "voiceFollowUser":
                m26753r5(liveMessage, z2sVar);
                break;
            case "voiceFollow":
                m26754s5(liveMessage);
                break;
            case "profile":
            case "buttonOpenProfile":
                if (liveMessage.extInfo != null) {
                    boolean zEquals = "profile".equals(str);
                    LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
                    m26749n5(zEquals ? extInfo.atUserInfo : extInfo.buttonUserInfo);
                    break;
                } else {
                    return;
                }
                break;
            case "buttonOpenChat":
                BLiveAtUserInfo bLiveAtUserInfo = liveMessage.extInfo.buttonUserInfo;
                String str2 = bLiveAtUserInfo == null ? "" : bLiveAtUserInfo.userId;
                if (!TextUtils.isEmpty(str2)) {
                    act().startActivity(ypv.a.z0(act(), str2, false, false));
                    break;
                }
                break;
            case "chat":
                m26752q5(liveMessage, "welcome");
                break;
            case "settleApprove":
                m26739d5(liveMessage, z2sVar, liveMessage.extInfo);
                break;
            case "auctionApprove":
                m26738c5(liveMessage, z2sVar, liveMessage.extInfo);
                break;
            case "chatReply":
                m26750o5(liveMessage);
                break;
            case "medalDesc":
                if (!TextUtils.isEmpty(z2sVar.m27045b())) {
                    m25548F2().OpenH5Event.open().j(jp50.m16064c(100).m16094B(z2sVar.m27045b()).m16105z(1.0d, 0.5d).m16099t(80).m16095p(CommonH5Builder.BgType.DEFAULT_BG).m16096q());
                    break;
                }
                break;
        }
        if (m26743h5(liveMessage)) {
            zcu.n(m25547E2().m17235k(), ((DbObject) m25547E2().m14582l0()).id, liveMessage.extInfo.buttonUserInfo.userId, str);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m26737b5(String str, String str2) {
        m25548F2().VoiceCallEvent.agreeVoiceCallEvent().j(new xpm0().c(str).j(str2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c5 */
    public final void m26738c5(final LiveMessage liveMessage, final z2s z2sVar, LiveMessage.ExtInfo extInfo) {
        duringCreated(p61.M(m25547E2().m17235k(), extInfo.applyCallId)).subscribe(ffw.e(new e30() { // from class: l.rim0
            public final void call(Object obj) {
                this.f18532a.m26744i5(z2sVar, liveMessage, (BLiveEnvelope) obj);
            }
        }, new vud0()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d5 */
    public final void m26739d5(final LiveMessage liveMessage, final z2s z2sVar, LiveMessage.ExtInfo extInfo) {
        BLiveAtUserInfo bLiveAtUserInfo;
        pul0.p(this);
        String str = (extInfo == null || (bLiveAtUserInfo = extInfo.buttonUserInfo) == null) ? "" : bLiveAtUserInfo.userId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m4612I3(m25547E2().m17239o(), str, Boolean.TRUE)).subscribe(ffw.e(new e30() { // from class: l.tim0
            public final void call(Object obj) {
                this.f20244a.m26745j5(z2sVar, liveMessage, (String) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: e5 */
    public final void m26740e5(String str) {
        m25548F2().VoiceCallEvent.callApplyEvent().j(new xpm0().d("invite"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f5 */
    public final void m26741f5(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strConcat = "@" + str2 + " ";
        int length = strConcat.length();
        int i = jw4.f14064E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        m25548F2().ChatEvent.chatInputClick().j(new wu4(true, strConcat).m25481a(str).m25482b("3"));
        zvf0.D("e_audio_long_press_avatar_send_message", mo21430R2(), new j760[]{vwb.Y("live_id", m25547E2().m17235k()), vwb.Y("to_user_id", str)});
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: g5 */
    public final void m26742g5(final LiveMessage liveMessage, final z2s z2sVar, String str) {
        if (!m26743h5(liveMessage)) {
            lsi0.m("当前参数有误，请确认后端 buttonUserInfo 是否有误");
            return;
        }
        r1k0.m21729k(m25547E2().mo9893p(), m25547E2(), str, e0o0.l(this));
        String str2 = liveMessage.extInfo.buttonUserInfo.userId;
        if (!e0o0.r(this, str2)) {
            duringCreated(VCallApiProvider.callInvite(m25547E2().m17235k(), str2)).subscribe(ffw.e(new e30() { // from class: l.qim0
                public final void call(Object obj) {
                    this.f18001a.m26746k5(z2sVar, liveMessage, (BLiveVoiceCallInvite) obj);
                }
            }, new ult()));
            return;
        }
        lsi0.y("对方已在麦上");
        z2sVar.mo25700h(false);
        ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m26743h5(LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo;
        BLiveAtUserInfo bLiveAtUserInfo;
        return (liveMessage == null || (extInfo = liveMessage.extInfo) == null || (bLiveAtUserInfo = extInfo.buttonUserInfo) == null || TextUtils.isEmpty(bLiveAtUserInfo.userId)) ? false : true;
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m26744i5(z2s z2sVar, LiveMessage liveMessage, BLiveEnvelope bLiveEnvelope) {
        z2sVar.mo25700h(false);
        ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m26745j5(z2s z2sVar, LiveMessage liveMessage, String str) {
        z2sVar.mo25700h(false);
        ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
    }

    @Override // p002l.rh2
    /* JADX INFO: renamed from: k4 */
    public void mo21980k4(final String str, LiveMessage liveMessage) {
        super.mo21980k4(str, liveMessage);
        SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(0);
        pio0 pio0Var = (pio0) vwb.s((pio0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pio0.class), new w9j() { // from class: l.vim0
            public final Object call(Object obj) {
                return Boolean.valueOf(((pio0) obj).m20342b().equals(str));
            }
        });
        if (pio0Var != null) {
            pio0Var.setVisible(false);
            ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
        }
        if ("voiceFollowUser".equals(str)) {
            m26748m5(liveMessage);
        }
        if ("voiceFollow".equals(str)) {
            m26747l5(liveMessage);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m26746k5(z2s z2sVar, LiveMessage liveMessage, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        z2sVar.mo25700h(false);
        lsi0.w(R$string.f2748Gh);
        if (x4s.b(m25547E2().m14588n0().liveMode)) {
            ((ChatListView) ((bwr) this).viewModel).m6187F(liveMessage);
        }
        ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
    }

    /* JADX INFO: renamed from: l5 */
    public void m26747l5(LiveMessage liveMessage) {
        int size = liveMessage.spanList.size();
        List<SpannableStringBuilder> list = liveMessage.spanList;
        SpannableStringBuilder spannableStringBuilder = size >= 2 ? list.get(1) : list.get(0);
        w6n0 w6n0Var = (w6n0) vwb.s((w6n0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), w6n0.class), new w9j() { // from class: l.wim0
            public final Object call(Object obj) {
                return Boolean.valueOf(((w6n0) obj).m24355b().equals("voiceFollow"));
            }
        });
        if (w6n0Var == null) {
            return;
        }
        x6n0 x6n0Var = (x6n0) vwb.s((x6n0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x6n0.class), new w9j() { // from class: l.xim0
            public final Object call(Object obj) {
                return Boolean.valueOf(((x6n0) obj).m25701i().equals("voiceFollow"));
            }
        });
        if (liveMessage.getVoiceFollowSource() == 3) {
            w6n0Var.m24361h(false);
        } else {
            w6n0Var.m24359f();
        }
        if (x6n0Var != null) {
            x6n0Var.m25702j(false);
        }
        ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
    }

    /* JADX INFO: renamed from: m5 */
    public final void m26748m5(LiveMessage liveMessage) {
        int size = liveMessage.spanList.size();
        List<SpannableStringBuilder> list = liveMessage.spanList;
        SpannableStringBuilder spannableStringBuilder = size >= 2 ? list.get(1) : list.get(0);
        pio0 pio0Var = (pio0) vwb.s((pio0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pio0.class), new w9j() { // from class: l.oim0
            public final Object call(Object obj) {
                return Boolean.valueOf(((pio0) obj).m20342b().equals("voiceFollowUser"));
            }
        });
        if (pio0Var == null) {
            return;
        }
        pio0Var.setVisible(false);
        ((ChatListView) ((bwr) this).viewModel).m6194M(liveMessage);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: n5 */
    public final void m26749n5(BLiveAtUserInfo bLiveAtUserInfo) {
        if (bLiveAtUserInfo == null || TextUtils.isEmpty(bLiveAtUserInfo.userId)) {
            return;
        }
        u4n0.k(this, ((DbObject) m25547E2().m14582l0()).id, bLiveAtUserInfo.userId);
    }

    /* JADX INFO: renamed from: o5 */
    public final void m26750o5(LiveMessage liveMessage) {
        if (liveMessage == null || liveMessage.liveUserInfo == null) {
            return;
        }
        m25548F2().ChatEvent.chatInputClick().j(new wu4(true, "@" + liveMessage.liveUserInfo.userName + " ").m25481a(liveMessage.liveUserInfo.userId).m25482b("3"));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.ho2] */
    /* JADX INFO: renamed from: p5 */
    public final void m26751p5(LiveMessage liveMessage, final z2s z2sVar) {
        if (liveMessage == null || liveMessage.liveUserInfo == null || TextUtils.isEmpty(z2sVar.m27044a())) {
            return;
        }
        final sy4.C0832a c0832a = new sy4.C0832a();
        LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        c0832a.f19335c = liveUserInfo.userName;
        c0832a.f19334b = liveUserInfo.userId;
        duringCreated(m25547E2().m14537V1(z2sVar.m27044a(), c0832a)).subscribe(ffw.e(new e30() { // from class: l.pim0
            public final void call(Object obj) {
                yim0.m26734Y4(z2sVar, c0832a, (roj0) obj);
            }
        }, new z2k()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: q5 */
    public final void m26752q5(LiveMessage liveMessage, String str) {
        if (m26743h5(liveMessage)) {
            duringCreated(hrv.m14771R(m25547E2().m17235k(), str, liveMessage.extInfo.buttonUserInfo.userId)).subscribe(ffw.e(new e30() { // from class: l.sim0
                public final void call(Object obj) {
                    yim0.m26731V4((BLiveEnvelope) obj);
                }
            }, new z2k()));
        }
    }

    /* JADX INFO: renamed from: r5 */
    public void m26753r5(LiveMessage liveMessage, z2s z2sVar) {
        if (m26743h5(liveMessage)) {
            LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
            extInfo.followUserId = extInfo.buttonUserInfo.userId;
            m21983n4(liveMessage, z2sVar, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: s5 */
    public void m26754s5(LiveMessage liveMessage) {
        m25547E2().m14561e0(false, mo21430R2(), zcu.p(liveMessage.getVoiceFollowSource()), new d30() { // from class: l.nim0
            public final void call() {
                lsi0.w(R$string.f2845L4);
            }
        });
        k25.m16477m(this, liveMessage);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p002l.rh2
    /* JADX INFO: renamed from: t */
    public void mo10955t() {
        super.mo10955t();
        k0n0 k0n0Var = new k0n0(this.f22036e, new g0n0());
        this.f22909o = k0n0Var;
        z2(k0n0Var);
        duringCreated(m25547E2().m14596q1().x0()).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.uim0
            public final void call(Object obj) {
                this.f20665a.m21977h4((cmn0) obj);
            }
        }));
    }

    @Override // p002l.rh2
    /* JADX INFO: renamed from: t4 */
    public boolean mo21986t4() {
        return true;
    }
}
