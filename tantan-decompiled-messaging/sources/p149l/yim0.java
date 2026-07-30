package p149l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yim0<T extends ho2> extends rh2<T> {

    /* JADX INFO: renamed from: o */
    public k0n0 f198520o;

    /* JADX INFO: renamed from: p */
    public boolean f198521p;

    /* JADX INFO: renamed from: l.yim0$a */
    public static /* synthetic */ class C21413a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f198522a;

        static {
            int[] iArr = new int[IChatItemLongClickArea.LongClickArea.values().length];
            f198522a = iArr;
            try {
                iArr[IChatItemLongClickArea.LongClickArea.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f198522a[IChatItemLongClickArea.LongClickArea.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public yim0(bsm bsmVar, ChatListView chatListView) {
        super(bsmVar, chatListView);
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m214978V4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m214981Y4(z2s z2sVar, sy4.C20071a c20071a, roj0 roj0Var) {
        z2sVar.m216990f(false);
        String str = c20071a.f166891c;
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: H4 */
    public void mo179298H4(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage) {
        IChatItemLongClickArea.LongClickArea longClickArea = iChatItemLongClickArea.getLongClickArea();
        if (longClickArea == null) {
            return;
        }
        int i = C21413a.f198522a[longClickArea.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.f198520o.m144083V3(iChatItemLongClickArea.getClickTarget(), liveMessage);
        } else {
            if (liveMessage.liveUserInfo == null || TextUtils.equals(ypv.f199493a.m199309D0(), liveMessage.liveUserInfo.userId)) {
                return;
            }
            LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
            m214988f5(liveUserInfo.userId, liveUserInfo.userName);
        }
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: I4 */
    public void mo179299I4() {
        this.f198520o.m144076N3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.rh2
    /* JADX INFO: renamed from: J4 */
    public void mo179300J4(LiveMessage liveMessage) {
        super.mo179300J4(liveMessage);
        j25.m139414j(m206027E2(), liveMessage, this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v2, types: [l.ho2, l.lh20] */
    @Override // p149l.rh2
    /* JADX INFO: renamed from: K4 */
    public void mo152703K4(z2s z2sVar, View view, String str, LiveMessage liveMessage) {
        super.mo152703K4(z2sVar, view, str, liveMessage);
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
                m214987e5(liveMessage.extInfo.callInviteId);
                break;
            case 1:
            case 11:
                m214989g5(liveMessage, z2sVar, str);
                break;
            case 2:
                if (!z2sVar.m216988c()) {
                    lsi0.m151578h(R$string.f47300ia);
                } else {
                    m214998p5(liveMessage, z2sVar);
                }
                break;
            case 3:
                m214984b5(liveMessage.extInfo.applyCallId, liveMessage.liveUserInfo.userName);
                break;
            case 4:
                m215000r5(liveMessage, z2sVar);
                break;
            case 5:
                m215001s5(liveMessage);
                break;
            case 6:
            case 9:
                if (liveMessage.extInfo == null) {
                    return;
                }
                boolean zEquals = "profile".equals(str);
                LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
                m214996n5(zEquals ? extInfo.atUserInfo : extInfo.buttonUserInfo);
                break;
            case 7:
                BLiveAtUserInfo bLiveAtUserInfo = liveMessage.extInfo.buttonUserInfo;
                String str2 = bLiveAtUserInfo == null ? "" : bLiveAtUserInfo.userId;
                if (!TextUtils.isEmpty(str2)) {
                    act().startActivity(ypv.f199493a.m199385z0(act(), str2, false, false));
                }
                break;
            case 8:
                m214999q5(liveMessage, "welcome");
                break;
            case 10:
                m214986d5(liveMessage, z2sVar, liveMessage.extInfo);
                break;
            case 12:
                m214985c5(liveMessage, z2sVar, liveMessage.extInfo);
                break;
            case 13:
                m214997o5(liveMessage);
                break;
            case 14:
                if (!TextUtils.isEmpty(z2sVar.m216987b())) {
                    m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(100).m142598B(z2sVar.m216987b()).m142609z(1.0d, 0.5d).m142603t(80).m142599p(CommonH5Builder.BgType.DEFAULT_BG).m142600q());
                }
                break;
        }
        if (m214990h5(liveMessage)) {
            zcu.m218099n(m206027E2().m149814k(), m206027E2().m132146l0().f56011id, liveMessage.extInfo.buttonUserInfo.userId, str);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m214984b5(String str, String str2) {
        m206028F2().VoiceCallEvent.agreeVoiceCallEvent().mo172463j(new xpm0().m210509c(str).m210516j(str2));
    }

    /* JADX INFO: renamed from: c5 */
    public final void m214985c5(final LiveMessage liveMessage, final z2s z2sVar, LiveMessage.ExtInfo extInfo) {
        duringCreated((C22306c<T>) p61.m167530M(m206027E2().m149814k(), extInfo.applyCallId)).subscribe(ffw.m121194e(new e30() { // from class: l.rim0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159567a.m214991i5(z2sVar, liveMessage, (BLiveEnvelope) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: d5 */
    public final void m214986d5(final LiveMessage liveMessage, final z2s z2sVar, LiveMessage.ExtInfo extInfo) {
        BLiveAtUserInfo bLiveAtUserInfo;
        pul0.m171458p(this);
        String str = (extInfo == null || (bLiveAtUserInfo = extInfo.buttonUserInfo) == null) ? "" : bLiveAtUserInfo.userId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        duringCreated((C22306c<T>) LivingNormalApiProvider.m71246I3(m206027E2().m149818o(), str, Boolean.TRUE)).subscribe(ffw.m121194e(new e30() { // from class: l.tim0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170593a.m214992j5(z2sVar, liveMessage, (String) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: e5 */
    public final void m214987e5(String str) {
        m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0().m210510d("invite"));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f5 */
    public final void m214988f5(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strConcat = "@" + str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = jw4.f120018E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(true, strConcat).m205591a(str).m205592b("3"));
        zvf0.m220371D("e_audio_long_press_avatar_send_message", mo77274R2(), vwb.m200311Y("live_id", m206027E2().m149814k()), vwb.m200311Y("to_user_id", str));
    }

    /* JADX INFO: renamed from: g5 */
    public final void m214989g5(final LiveMessage liveMessage, final z2s z2sVar, String str) {
        if (!m214990h5(liveMessage)) {
            lsi0.m151583m("当前参数有误，请确认后端 buttonUserInfo 是否有误");
            return;
        }
        r1k0.m177474k(m206027E2().mo97490p(), m206027E2(), str, e0o0.m114325l(this));
        String str2 = liveMessage.extInfo.buttonUserInfo.userId;
        if (!e0o0.m114331r(this, str2)) {
            duringCreated((C22306c<T>) VCallApiProvider.callInvite(m206027E2().m149814k(), str2)).subscribe(ffw.m121194e(new e30() { // from class: l.qim0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154786a.m214993k5(z2sVar, liveMessage, (BLiveVoiceCallInvite) obj);
                }
            }, new ult()));
            return;
        }
        lsi0.m151595y("对方已在麦上");
        z2sVar.mo207186h(false);
        ((ChatListView) this.viewModel).m72691M(liveMessage);
    }

    /* JADX INFO: renamed from: h5 */
    public boolean m214990h5(LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo;
        BLiveAtUserInfo bLiveAtUserInfo;
        return (liveMessage == null || (extInfo = liveMessage.extInfo) == null || (bLiveAtUserInfo = extInfo.buttonUserInfo) == null || TextUtils.isEmpty(bLiveAtUserInfo.userId)) ? false : true;
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m214991i5(z2s z2sVar, LiveMessage liveMessage, BLiveEnvelope bLiveEnvelope) {
        z2sVar.mo207186h(false);
        ((ChatListView) this.viewModel).m72691M(liveMessage);
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m214992j5(z2s z2sVar, LiveMessage liveMessage, String str) {
        z2sVar.mo207186h(false);
        ((ChatListView) this.viewModel).m72691M(liveMessage);
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: k4 */
    public void mo179315k4(final String str, LiveMessage liveMessage) {
        super.mo179315k4(str, liveMessage);
        SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(0);
        pio0 pio0Var = (pio0) vwb.m200347s((pio0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pio0.class), new w9j() { // from class: l.vim0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((pio0) obj).m169613b().equals(str));
            }
        });
        if (pio0Var != null) {
            pio0Var.setVisible(false);
            ((ChatListView) this.viewModel).m72691M(liveMessage);
        }
        if ("voiceFollowUser".equals(str)) {
            m214995m5(liveMessage);
        }
        if ("voiceFollow".equals(str)) {
            m214994l5(liveMessage);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m214993k5(z2s z2sVar, LiveMessage liveMessage, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        z2sVar.mo207186h(false);
        lsi0.m151593w(R$string.f46706Gh);
        if (x4s.m207012b(m206027E2().m132152n0().liveMode)) {
            ((ChatListView) this.viewModel).m72684F(liveMessage);
        }
        ((ChatListView) this.viewModel).m72691M(liveMessage);
    }

    /* JADX INFO: renamed from: l5 */
    public void m214994l5(LiveMessage liveMessage) {
        int size = liveMessage.spanList.size();
        List<SpannableStringBuilder> list = liveMessage.spanList;
        SpannableStringBuilder spannableStringBuilder = size >= 2 ? list.get(1) : list.get(0);
        w6n0 w6n0Var = (w6n0) vwb.m200347s((w6n0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), w6n0.class), new w9j() { // from class: l.wim0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((w6n0) obj).m201886b().equals("voiceFollow"));
            }
        });
        if (w6n0Var == null) {
            return;
        }
        x6n0 x6n0Var = (x6n0) vwb.m200347s((x6n0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x6n0.class), new w9j() { // from class: l.xim0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((x6n0) obj).m207187i().equals("voiceFollow"));
            }
        });
        if (liveMessage.getVoiceFollowSource() == 3) {
            w6n0Var.m201892h(false);
        } else {
            w6n0Var.m201890f();
        }
        if (x6n0Var != null) {
            x6n0Var.m207188j(false);
        }
        ((ChatListView) this.viewModel).m72691M(liveMessage);
    }

    /* JADX INFO: renamed from: m5 */
    public final void m214995m5(LiveMessage liveMessage) {
        int size = liveMessage.spanList.size();
        List<SpannableStringBuilder> list = liveMessage.spanList;
        SpannableStringBuilder spannableStringBuilder = size >= 2 ? list.get(1) : list.get(0);
        pio0 pio0Var = (pio0) vwb.m200347s((pio0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pio0.class), new w9j() { // from class: l.oim0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((pio0) obj).m169613b().equals("voiceFollowUser"));
            }
        });
        if (pio0Var == null) {
            return;
        }
        pio0Var.setVisible(false);
        ((ChatListView) this.viewModel).m72691M(liveMessage);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: n5 */
    public final void m214996n5(BLiveAtUserInfo bLiveAtUserInfo) {
        if (bLiveAtUserInfo == null || TextUtils.isEmpty(bLiveAtUserInfo.userId)) {
            return;
        }
        u4n0.m191752k(this, m206027E2().m132146l0().f56011id, bLiveAtUserInfo.userId);
    }

    /* JADX INFO: renamed from: o5 */
    public final void m214997o5(LiveMessage liveMessage) {
        if (liveMessage == null || liveMessage.liveUserInfo == null) {
            return;
        }
        m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(true, "@" + liveMessage.liveUserInfo.userName + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m205591a(liveMessage.liveUserInfo.userId).m205592b("3"));
    }

    /* JADX INFO: renamed from: p5 */
    public final void m214998p5(LiveMessage liveMessage, final z2s z2sVar) {
        if (liveMessage == null || liveMessage.liveUserInfo == null || TextUtils.isEmpty(z2sVar.m216986a())) {
            return;
        }
        final sy4.C20071a c20071a = new sy4.C20071a();
        LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        c20071a.f166891c = liveUserInfo.userName;
        c20071a.f166890b = liveUserInfo.userId;
        duringCreated((C22306c<T>) m206027E2().m132101V1(z2sVar.m216986a(), c20071a)).subscribe(ffw.m121194e(new e30() { // from class: l.pim0
            @Override // p149l.e30
            public final void call(Object obj) {
                yim0.m214981Y4(z2sVar, c20071a, (roj0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: q5 */
    public final void m214999q5(LiveMessage liveMessage, String str) {
        if (m214990h5(liveMessage)) {
            duringCreated((C22306c<T>) hrv.m132735R(m206027E2().m149814k(), str, liveMessage.extInfo.buttonUserInfo.userId)).subscribe(ffw.m121194e(new e30() { // from class: l.sim0
                @Override // p149l.e30
                public final void call(Object obj) {
                    yim0.m214978V4((BLiveEnvelope) obj);
                }
            }, new z2k()));
        }
    }

    /* JADX INFO: renamed from: r5 */
    public void m215000r5(LiveMessage liveMessage, z2s z2sVar) {
        if (m214990h5(liveMessage)) {
            LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
            extInfo.followUserId = extInfo.buttonUserInfo.userId;
            m179318n4(liveMessage, z2sVar, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: s5 */
    public void m215001s5(LiveMessage liveMessage) {
        m206027E2().m132125e0(false, mo77274R2(), zcu.m218101p(liveMessage.getVoiceFollowSource()), new d30() { // from class: l.nim0
            @Override // p149l.d30
            public final void call() {
                lsi0.m151593w(R$string.f46803L4);
            }
        });
        k25.m144272m(this, liveMessage);
    }

    @Override // p149l.rh2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        k0n0 k0n0Var = new k0n0(this.f188512e, new g0n0());
        this.f198520o = k0n0Var;
        m144512z2(k0n0Var);
        duringCreated((C22306c<T>) m206027E2().m132160q1().m189155x0()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.uim0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176661a.m179312h4((cmn0) obj);
            }
        }));
    }

    @Override // p149l.rh2
    /* JADX INFO: renamed from: t4 */
    public boolean mo179321t4() {
        return true;
    }
}
