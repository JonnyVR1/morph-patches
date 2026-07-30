package com.p051p1.mobile.putong.core.p058ui.onlinematch;

import android.annotation.SuppressLint;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.a5i0;
import p153l.a8d0;
import p153l.byd0;
import p153l.gra;
import p153l.gs50;
import p153l.hl3;
import p153l.i4g0;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.kcg0;
import p153l.lqb;
import p153l.m600;
import p153l.o1j0;
import p153l.of7;
import p153l.pb1;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.q4f;
import p153l.qcj;
import p153l.rm50;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vxd0;
import p153l.wyb0;
import p153l.wyd0;
import p153l.x20;
import p153l.xyd0;
import p153l.y20;
import p153l.z7i0;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchManager {

    /* JADX INFO: renamed from: L */
    public static volatile OnlineMatchManager f33433L;

    /* JADX INFO: renamed from: A */
    public C22507a<String> f33434A;

    /* JADX INFO: renamed from: B */
    public kcg0 f33435B;

    /* JADX INFO: renamed from: C */
    public kcg0 f33436C;

    /* JADX INFO: renamed from: D */
    public kcg0 f33437D;

    /* JADX INFO: renamed from: E */
    public kcg0 f33438E;

    /* JADX INFO: renamed from: F */
    public C8773b f33439F;

    /* JADX INFO: renamed from: G */
    public OnlineMatchPushUser f33440G;

    /* JADX INFO: renamed from: H */
    public C22508b<OnlineMatchPushUser> f33441H;

    /* JADX INFO: renamed from: I */
    public C22507a<pf60<String, Object>> f33442I;

    /* JADX INFO: renamed from: J */
    public final xyd0 f33443J;

    /* JADX INFO: renamed from: K */
    public final byd0 f33444K;

    /* JADX INFO: renamed from: a */
    public final jxd0 f33445a;

    /* JADX INFO: renamed from: b */
    public vxd0 f33446b;

    /* JADX INFO: renamed from: c */
    public final vxd0 f33447c;

    /* JADX INFO: renamed from: d */
    public final byd0 f33448d;

    /* JADX INFO: renamed from: e */
    public final byd0 f33449e;

    /* JADX INFO: renamed from: f */
    public boolean f33450f;

    /* JADX INFO: renamed from: g */
    public final byd0 f33451g;

    /* JADX INFO: renamed from: h */
    public final byd0 f33452h;

    /* JADX INFO: renamed from: i */
    public final wyd0 f33453i;

    /* JADX INFO: renamed from: j */
    public final byd0 f33454j;

    /* JADX INFO: renamed from: k */
    public final byd0 f33455k;

    /* JADX INFO: renamed from: l */
    public jxd0 f33456l;

    /* JADX INFO: renamed from: m */
    public jxd0 f33457m;

    /* JADX INFO: renamed from: n */
    public jxd0 f33458n;

    /* JADX INFO: renamed from: o */
    public jxd0 f33459o;

    /* JADX INFO: renamed from: p */
    public boolean f33460p;

    /* JADX INFO: renamed from: q */
    public final vxd0 f33461q;

    /* JADX INFO: renamed from: r */
    public byd0 f33462r;

    /* JADX INFO: renamed from: s */
    public vxd0 f33463s;

    /* JADX INFO: renamed from: t */
    public byd0 f33464t;

    /* JADX INFO: renamed from: u */
    public byd0 f33465u;

    /* JADX INFO: renamed from: v */
    public byd0 f33466v;

    /* JADX INFO: renamed from: w */
    public C22507a<pf60<String, String>> f33467w;

    /* JADX INFO: renamed from: x */
    public final Map<String, String> f33468x;

    /* JADX INFO: renamed from: y */
    public C22507a<pf60<String, QuickChatProduce>> f33469y;

    /* JADX INFO: renamed from: z */
    public C22508b<String> f33470z;

    public enum QuickChatProduce {
        QuickChat,
        QuickAudioChat,
        Heartbeat
    }

    public enum QuickChatStartClickFrom {
        ChatTop,
        Default,
        Home
    }

    public OnlineMatchManager() {
        String str = "quickchatMessageChatShowCurrentDayIsShow" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f33445a = new jxd0(str, bool);
        this.f33446b = new vxd0("quickchatMessageChatCount" + CoreModule.m30929H().userId(), 0);
        this.f33447c = new vxd0("quickchatMessageChatShowTime" + CoreModule.m30929H().userId(), 0);
        this.f33448d = new byd0("quickchatMessageChatShowCurrentDay" + CoreModule.m30929H().userId(), 0L);
        this.f33449e = new byd0("quickchatMessageChatShowCurrentDayFirstShow" + CoreModule.m30929H().userId(), 0L);
        this.f33450f = false;
        this.f33451g = new byd0("online_match_show_time_" + CoreModule.m30929H().userId(), 0L);
        this.f33452h = new byd0("om_mess_tip_show_time_" + CoreModule.m30929H().userId(), 0L);
        this.f33453i = new wyd0("om_mess_tip_show_id_" + CoreModule.m30929H().userId(), "");
        this.f33454j = new byd0("online_match_assistant_fir_time_" + CoreModule.m30929H().userId(), 0L);
        this.f33455k = new byd0("online_match_assistant_time_" + CoreModule.m30929H().userId(), 0L);
        this.f33456l = new jxd0("show_matched_dismissed_" + CoreModule.m30929H().userId(), bool);
        this.f33457m = new jxd0("online_match_limit_positive_" + CoreModule.m30929H().userId(), bool);
        this.f33458n = new jxd0("online_match_limit_negative_" + CoreModule.m30929H().userId(), bool);
        this.f33459o = new jxd0("isNoChatCallDialogCanShow_" + CoreModule.m30929H().userId(), Boolean.TRUE);
        this.f33460p = false;
        this.f33461q = new vxd0("today_quick_chat_insert_card_count_" + CoreModule.m30929H().userId(), 0);
        this.f33462r = new byd0("last_timestamp_quick_chat_insert_card_" + CoreModule.m30929H().userId(), 0L);
        this.f33463s = new vxd0("square_data_tab_count_" + CoreModule.m30929H().userId(), 0);
        this.f33464t = new byd0("square_data_tab_show_time_" + CoreModule.m30929H().userId(), 0L);
        this.f33465u = new byd0("QuickChatV2ShowNormalTips" + CoreModule.m30929H().userId(), 0L);
        this.f33466v = new byd0("QuickChatV2ShowVideoTips" + CoreModule.m30929H().userId(), 0L);
        this.f33467w = C22507a.m222758b();
        this.f33468x = new HashMap();
        this.f33469y = C22507a.m222759c(pf60.m172085a("default", QuickChatProduce.QuickChat));
        this.f33470z = C22508b.m222767b();
        this.f33434A = C22507a.m222758b();
        this.f33441H = C22508b.m222767b();
        this.f33442I = C22507a.m222758b();
        this.f33443J = new xyd0("om_notify_close_set" + CoreModule.m30929H().userId(), new HashSet());
        this.f33444K = new byd0("om_notify_update_time" + CoreModule.m30929H().userId(), 0L);
        m51356d0();
        m51354b0();
        m51355c0();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m51305a(Act act, OnlineMatchPushUser onlineMatchPushUser, x20 x20Var, String str) {
        a5i0.m96160p0().m96208W0();
        C8772a.m51403D(act, onlineMatchPushUser, true, x20Var, false, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m51308d(pf60 pf60Var) {
        return (String) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m51310e0() {
        if (NullChecker.m82486a(f33433L)) {
            synchronized (OnlineMatchManager.class) {
                try {
                    if (NullChecker.m82486a(f33433L)) {
                        if (NullChecker.m82486a(f33433L.f33435B) && !f33433L.f33435B.isUnsubscribed()) {
                            f33433L.f33435B.unsubscribe();
                        }
                        if (NullChecker.m82486a(f33433L.f33436C) && !f33433L.f33436C.isUnsubscribed()) {
                            f33433L.f33436C.unsubscribe();
                        }
                        if (NullChecker.m82486a(f33433L.f33437D) && !f33433L.f33437D.isUnsubscribed()) {
                            f33433L.f33437D.unsubscribe();
                        }
                        if (NullChecker.m82486a(f33433L.f33438E) && !f33433L.f33438E.isUnsubscribed()) {
                            f33433L.f33438E.unsubscribe();
                        }
                        if (NullChecker.m82486a(f33433L.f33439F)) {
                            f33433L.f33439F.m51471d();
                        }
                        f33433L.m51375w();
                        C4907v.f20864Z.onNext("");
                        f33433L = null;
                    }
                    C8774c.INSTANCE.m51486b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m51313h(y20 y20Var) {
        wyb0.m208493O().m208538I();
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m51316k(Boolean bool) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m51318m(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m51322q(Boolean bool) {
    }

    /* JADX INFO: renamed from: z */
    public static OnlineMatchManager m51326z() {
        if (f33433L == null) {
            synchronized (OnlineMatchManager.class) {
                try {
                    if (f33433L == null) {
                        f33433L = new OnlineMatchManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33433L;
    }

    /* JADX INFO: renamed from: A */
    public QuickChatProduce m51327A() {
        return this.f33469y.m222761e().f152157b;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: B */
    public final String m51328B(OnlineMatchPushUser onlineMatchPushUser) {
        boolean z = onlineMatchPushUser.isUserInSquare;
        boolean z2 = onlineMatchPushUser.isBell;
        if (z) {
            if (z2) {
                return "p_quickchat,e_quickchat_adpopup_bell,click";
            }
            if (TextUtils.equals(onlineMatchPushUser.radioType, "grab")) {
                return "p_quickchat,e_quickchat_adpopup_grab,click";
            }
            return (TextUtils.equals(onlineMatchPushUser.radioType, "broadcast-bubble") || TextUtils.equals(onlineMatchPushUser.radioType, "broadcast")) ? "p_quickchat,e_quickchat_adpopup_broadcast,click" : "p_message,quickchat_pop";
        }
        if (z2 || TextUtils.equals(onlineMatchPushUser.radioType, "grab") || TextUtils.equals(onlineMatchPushUser.radioType, "broadcast")) {
            return "p_message,quickchat_pop";
        }
        TextUtils.equals(onlineMatchPushUser.radioType, "pool");
        return "p_message,quickchat_pop";
    }

    /* JADX INFO: renamed from: C */
    public String m51329C() {
        return this.f33469y.m222761e().f152156a;
    }

    /* JADX INFO: renamed from: D */
    public C22421c<String> m51330D() {
        return this.f33469y.asObservable().map(new qcj() { // from class: l.iu50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return OnlineMatchManager.m51308d((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public C22421c<pf60<String, QuickChatProduce>> m51331E() {
        return this.f33469y.asObservable();
    }

    /* JADX INFO: renamed from: F */
    public boolean m51332F(String str) {
        if (pzi0.m174439D(this.f33444K.get().longValue())) {
            return this.f33443J.get().contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final void m51333G() {
        boolean zM174439D = pzi0.m174439D(this.f33462r.get().longValue());
        vxd0 vxd0Var = this.f33461q;
        if (zM174439D) {
            vxd0Var.m203841a(1);
        } else {
            vxd0Var.put(1);
            this.f33462r.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m51334H(User user) {
        if (NullChecker.m82486a(user)) {
            return user.isFemale();
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public boolean m51335I() {
        return false;
    }

    /* JADX INFO: renamed from: J */
    public boolean m51336J() {
        return "matching".equals(m51329C()) && m51327A() == QuickChatProduce.Heartbeat;
    }

    /* JADX INFO: renamed from: K */
    public boolean m51337K(Conversation conversation) {
        if (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.property) && NullChecker.m82486a(conversation.property.quickchat)) {
            return conversation.property.quickchat.bellPrivilegeIntercept;
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public boolean m51338L() {
        return "matching".equals(m51329C());
    }

    /* JADX INFO: renamed from: M */
    public boolean m51339M() {
        return this.f33445a.get().booleanValue();
    }

    /* JADX INFO: renamed from: N */
    public boolean m51340N() {
        return this.f33449e.get().longValue() != pzi0.m174453n();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m51341O(Act act, boolean z, y20 y20Var) {
        a5i0.m96160p0().m96208W0();
        m51377y(act, true, z);
        y20Var.call(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m51342P(String str, final Act act, pf60 pf60Var) {
        if (!NullChecker.m82486a(pf60Var.f152156a)) {
            i4g0.m138495D("e_quickchat_askend", "p_suggest_users_home_view", jyb.m147494Y("quickchat_ask_result", Boolean.FALSE));
            m51374v();
            return;
        }
        i4g0.m138495D("e_quickchat_askend", "p_suggest_users_home_view", jyb.m147494Y("quickchat_ask_result", Boolean.TRUE));
        final String str2 = ((User) pf60Var.f152156a).f56859id;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m51368q0(str2);
        CoreModule.f18264c.f20405m0.m32005G8(str2);
        if (TextUtils.equals("planA", str) && !TextUtils.isEmpty(((User) pf60Var.f152156a).name)) {
            of7 of7VarM167420o = of7.m167420o();
            F f = pf60Var.f152156a;
            of7VarM167420o.m167427C(act, ((User) f).name, ((User) f).m61308fp().profileSmall().formatted(), new x20() { // from class: l.zt50
                @Override // p153l.x20
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(MessagesAct.m50132q2(act2, str2, false, false, false, false, null, 7, null));
                }
            });
        } else if (TextUtils.equals("planB", str)) {
            of7.m167420o().m167428D(act, "chat", "", "", new x20() { // from class: l.bu50
                @Override // p153l.x20
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(MessagesAct.m50132q2(act2, str2, false, false, false, false, null, 7, null));
                }
            });
        }
        m51349W("default");
        this.f33439F.m51471d();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m51343Q(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).subCode == 601010) {
            o1j0.m165636j("正在语音闪聊匹配中");
        }
        m51349W("default");
        this.f33439F.m51471d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m51344R(pf60 pf60Var) {
        if (!NullChecker.m82486a(pf60Var.f152156a)) {
            C8772a.m51445j0(uqb0.f180376H.guessedCurrentServerTime());
            m51349W("matching");
            m51348V("start_match_from_user");
            return;
        }
        m51368q0(((User) pf60Var.f152156a).f56859id);
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        F f = pf60Var.f152156a;
        onlineMatchMatchUser.user = (User) f;
        onlineMatchMatchUser.userId = ((User) f).f56859id;
        C4907v.f20865a0.onNext(jyb.m147494Y("match_success", onlineMatchMatchUser));
        C4907v.f20864Z.onNext(((User) pf60Var.f152156a).f56859id);
        CoreModule.f18264c.f20405m0.m32005G8(((User) pf60Var.f152156a).f56859id);
        m51349W("default");
        this.f33439F.m51471d();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m51345S(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).subCode == 601010) {
            o1j0.m165636j("正在语音闪聊匹配中");
        }
        m51349W("default");
        this.f33439F.m51471d();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m51346T(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m82467g() || !m51338L()) {
            return;
        }
        m51349W("default");
        m51348V("match_stop");
        this.f33439F.m51471d();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m51347U(Throwable th) {
        m51349W("matching");
    }

    /* JADX INFO: renamed from: V */
    public void m51348V(String str) {
        this.f33470z.onNext(str);
    }

    /* JADX INFO: renamed from: W */
    public void m51349W(String str) {
        m51350X(str, QuickChatProduce.QuickChat);
    }

    /* JADX INFO: renamed from: X */
    public void m51350X(String str, QuickChatProduce quickChatProduce) {
        this.f33469y.onNext(jyb.m147494Y(str, quickChatProduce));
    }

    /* JADX INFO: renamed from: Y */
    public final void m51351Y(Act act, String str) {
        C8927c.m54662o1(act, null, C8772a.m51457p0(), str);
    }

    /* JADX INFO: renamed from: Z */
    public final void m51352Z(String str) {
        m51348V("match_success");
        this.f33439F.m51471d();
        m51349W("default");
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: a0 */
    public void m51353a0(String str) {
        double dM80016x;
        double dM80014u;
        if (rm50.m182040a() && C8772a.m51429b0() > rm50.m182041b()) {
            this.f33451g.put(Long.valueOf(pzi0.m174454o()));
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        Location locationM80048q = uqb0.f180370E.m80048q();
        if (NullChecker.m82486a(locationM80048q)) {
            dM80016x = locationM80048q.m80016x();
            dM80014u = locationM80048q.m80014u();
        } else {
            dM80016x = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            dM80014u = 0.0d;
        }
        i4g0.m138495D("e_quickchat_position_distance", "", pf60.m172085a("longitude", Double.valueOf(dM80016x)), pf60.m172085a("latitude", Double.valueOf(dM80014u)), pf60.m172085a("distance", Integer.valueOf(userM116503Pa.location.distance)), pf60.m172085a("match_id", String.format("(%s,%s)", CoreModule.m30929H().userId(), str)));
        a8d0.m96437x0().m96443t0(str);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m51354b0() {
        this.f33437D = C4907v.f20864Z.filter(new qcj() { // from class: l.pt50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.au50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73469a.m51352Z((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m51355c0() {
        this.f33438E = ConnectivityReceiver.m82473m().skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.du50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90742a.m51346T((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m51356d0() {
        this.f33439F = new C8773b(new C8773b.a() { // from class: l.cu50
            @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.C8773b.a
            /* JADX INFO: renamed from: a */
            public final void mo51472a() {
                this.f83817a.m51367p0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m51357f0() {
        if (NullChecker.m82486a(this.f33436C) && !this.f33436C.isUnsubscribed()) {
            this.f33436C.unsubscribe();
        }
        this.f33436C = CoreModule.f18264c.f20300D0.m35846S4().subscribe(psd0.m173597H(new y20() { // from class: l.eu50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineMatchManager.m51318m((uxj0) obj);
            }
        }, new y20() { // from class: l.fu50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100880a.m51347U((Throwable) obj);
            }
        }));
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: g0 */
    public void m51358g0(String str) {
        HashSet<String> hashSet = this.f33443J.get();
        if (!pzi0.m174439D(this.f33444K.get().longValue())) {
            hashSet.clear();
            this.f33444K.put(Long.valueOf(pzi0.m174454o()));
        }
        hashSet.add(str);
        this.f33443J.put(hashSet);
    }

    /* JADX INFO: renamed from: h0 */
    public void m51359h0(boolean z) {
        this.f33445a.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i0 */
    public void m51360i0() {
        this.f33450f = true;
        this.f33449e.put(Long.valueOf(pzi0.m174453n()));
    }

    /* JADX INFO: renamed from: j0 */
    public void m51361j0() {
        this.f33466v.put(Long.valueOf(pzi0.m174453n()));
        this.f33465u.put(Long.valueOf(pzi0.m174453n()));
    }

    /* JADX INFO: renamed from: k0 */
    public void m51362k0() {
        if (this.f33448d.get().longValue() != pzi0.m174453n()) {
            this.f33448d.put(Long.valueOf(pzi0.m174453n()));
            this.f33447c.put(0);
        }
        this.f33450f = true;
        this.f33447c.put(Integer.valueOf(this.f33447c.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m51363l0(Settings settings) {
        if (settings.getSearchMaxAge().intValue() - settings.getSearchMinAge().intValue() >= 3.0f) {
            return false;
        }
        if (this.f33454j.get().longValue() == 0) {
            this.f33454j.put(Long.valueOf(pzi0.m174454o()));
            return true;
        }
        if (pzi0.m174439D(this.f33455k.get().longValue())) {
            return false;
        }
        int iCeil = (int) Math.ceil((pzi0.m174454o() - this.f33454j.get().longValue()) / 8.64E7d);
        if (iCeil != 2 && iCeil != 3 && iCeil != 5 && (iCeil <= 0 || iCeil % 8 != 0)) {
            return false;
        }
        this.f33455k.put(Long.valueOf(pzi0.m174454o()));
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m51364m0() {
        return (C8772a.m51429b0() <= rm50.m182041b() && this.f33451g.get().longValue() + 7200000 > pzi0.m174454o()) || C8772a.m51429b0() < 1;
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m51365n0() {
        return (this.f33448d.get().longValue() != pzi0.m174453n() || (this.f33448d.get().longValue() == pzi0.m174453n() && this.f33447c.get().intValue() < 3)) && !this.f33450f;
    }

    /* JADX INFO: renamed from: o0 */
    public void m51366o0(Act act, boolean z) {
        if (m51338L()) {
            return;
        }
        m51372u(act, z, "", new y20() { // from class: l.qt50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineMatchManager.m51322q((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m51367p0() {
        m51326z().f33442I.onNext(jyb.m147494Y("match_timeout", null));
        m51374v();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m51368q0(String str) {
        MatchScData matchScDataBuild = new MatchScData.MatchBuilder().isLike(true).isSuperLiked(false).user(str).pageId(m600.m157130c()).isFromButton(true).matchSource(HomeStatisticsHelper.ScActionFrom.QUICK_CHAT.getFrom()).build();
        q4f q4fVar = new q4f();
        q4fVar.f155581s = MatchScData.MID;
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        i4g0.m138516n(q4fVar, matchScDataBuild.toTrackParamMap());
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m51369r0(final Act act, final OnlineMatchPushUser onlineMatchPushUser, final x20 x20Var, final String str) {
        boolean zM51334H = m51334H(CoreModule.f18264c.f20381e0.m116593na());
        boolean z = a5i0.m96091E0() && a5i0.m96106K();
        if (NullChecker.m82486a(onlineMatchPushUser) && onlineMatchPushUser.isMaleQuickChatRing && gra.m131666c2() && !zM51334H) {
            C8772a.m51403D(act, onlineMatchPushUser, z, x20Var, false, str);
            return true;
        }
        if (C8772a.m51429b0() > 0 || (a5i0.m96168s0() >= 1 && !zM51334H)) {
            if (z && a5i0.m96160p0().m96218g1()) {
                a5i0.m96085B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new x20() { // from class: l.xt50
                    @Override // p153l.x20
                    public final void call() {
                        OnlineMatchManager.m51305a(act, onlineMatchPushUser, x20Var, str);
                    }
                }, null);
            } else {
                C8772a.m51403D(act, onlineMatchPushUser, z, x20Var, false, str);
            }
            return true;
        }
        if (zM51334H) {
            gs50.m131966O().m131993H(act, "use_up");
        } else if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34568pr(act, m51328B(onlineMatchPushUser), Privilege.online_match_tickets);
        } else {
            m51351Y(act, m51328B(onlineMatchPushUser));
        }
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m51370s0(Act act, QuickChatStartClickFrom quickChatStartClickFrom, String str) {
        return m51371t0(act, quickChatStartClickFrom, str, new y20() { // from class: l.ju50
            @Override // p153l.y20
            public final void call(Object obj) {
                OnlineMatchManager.m51316k((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m51371t0(Act act, QuickChatStartClickFrom quickChatStartClickFrom, String str, @NonNull y20<Boolean> y20Var) {
        if (!NullChecker.m82487b(act)) {
            y20Var.call(Boolean.FALSE);
            return false;
        }
        m51348V("try_start");
        CoreModule.f18264c.f20297C0.m146425v4();
        if (TextUtils.equals(m51329C(), "default")) {
            boolean zM51372u = m51372u(act, false, str, y20Var);
            C8772a.m51429b0();
            return zM51372u;
        }
        if (m51338L()) {
            m51374v();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m51372u(final Act act, final boolean z, String str, @NonNull final y20<Boolean> y20Var) {
        boolean z2 = false;
        if (rm50.m182040a() && m51364m0()) {
            gs50.m131966O().m131993H(act, "overheat_protection");
            m51326z().f33442I.onNext(new pf60<>("notify_normal_state", null));
            y20Var.call(Boolean.FALSE);
            return false;
        }
        Settings settings = CoreModule.f18264c.f20381e0.m116593na().settings;
        if (!NullChecker.m82487b(settings)) {
            return false;
        }
        if (m51363l0(settings)) {
            hl3.m135668K(act, settings);
            y20Var.call(Boolean.FALSE);
            return false;
        }
        if (!rm50.m182040a() && a5i0.m96168s0() <= 0) {
            if (jyb.m147481L(str)) {
                str = "p_quickchat,quickchat_button";
            }
            m51351Y(act, str);
            y20Var.call(Boolean.FALSE);
            return false;
        }
        if (!Network.isConnected(act)) {
            o1j0.m165640n(R$string.f19605r4);
            y20Var.call(Boolean.FALSE);
            return false;
        }
        if (a5i0.m96091E0() && a5i0.m96106K()) {
            z2 = true;
        }
        if (z2 && a5i0.m96160p0().m96218g1() && !(act instanceof QuickChatSearchingAct)) {
            a5i0.m96085B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new x20() { // from class: l.gu50
                @Override // p153l.x20
                public final void call() {
                    this.f106465a.m51341O(act, z, y20Var);
                }
            }, new x20() { // from class: l.hu50
                @Override // p153l.x20
                public final void call() {
                    OnlineMatchManager.m51313h(y20Var);
                }
            });
        } else {
            m51377y(act, z2, z);
            y20Var.call(Boolean.TRUE);
        }
        this.f33439F.m51470c();
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m51373u0(Act act, @NonNull y20<Boolean> y20Var) {
        boolean zM51334H = m51334H(CoreModule.f18264c.f20381e0.m116593na());
        boolean z = a5i0.m96091E0() && a5i0.m96106K();
        if ((a5i0.m96168s0() >= 1 && !zM51334H) || (rm50.m182040a() && C8772a.m51429b0() >= 1)) {
            if (z && a5i0.m96160p0().m96218g1()) {
                y20Var.call(Boolean.FALSE);
            }
            m51326z().m51371t0(act, QuickChatStartClickFrom.ChatTop, "p_wallet,vas", y20Var);
            return;
        }
        if (zM51334H) {
            gs50.m131966O().m131993H(act, "use_up");
        } else {
            boolean z2 = act instanceof DropDownAct;
            String str = "p_quickchat,quickchat_button";
            if (!z2 || !((DropDownAct) act).m55635h2()) {
                if (z2 && ((DropDownAct) act).m55637k2()) {
                    str = "p_message,quickchat_entrance";
                } else if (z2 && ((DropDownAct) act).m55640n2()) {
                    str = "p_quickchat_party,quickchat";
                } else if (z2 && ((DropDownAct) act).m55638l2()) {
                    str = "p_playground,quickchat";
                } else if (z2 && ((DropDownAct) act).m55639m2()) {
                    str = "p_pay_result,e_quickchat_button,click";
                }
            }
            if (joa.m146386f4()) {
                CoreModule.m30933P().m143405a().mo34568pr(act, str, Privilege.online_match_tickets);
            } else {
                m51351Y(act, str);
            }
        }
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: v */
    public void m51374v() {
        pb1.m171472b().mo171476e(wyb0.m208494Q());
        m51349W("default");
        m51348V("match_stop");
        if (Network.isConnected(CoreModule.f18263b)) {
            m51357f0();
            this.f33439F.m51471d();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m51375w() {
        this.f33440G = null;
    }

    /* JADX INFO: renamed from: x */
    public void m51376x(final Act act, final String str) {
        if (TextUtils.equals(m51329C(), "default")) {
            CoreModule.f18264c.f20297C0.m146425v4();
            psd0.m173633z(this.f33435B);
            i4g0.m138495D("e_quickchat_ask", "p_suggest_users_home_view", new pf60[0]);
            this.f33435B = CoreModule.f18264c.f20300D0.m35844Q4(false).flatMap(new qcj() { // from class: l.ut50
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return psd0.m173625r(C22421c.just(user), user == null ? C22421c.just(uxj0.f181467a) : CoreModule.f18264c.f20384f0.m33905ap(user.f56859id), new yt50());
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.vt50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f185688a.m51342P(str, act, (pf60) obj);
                }
            }, new y20() { // from class: l.wt50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190715a.m51343Q((Throwable) obj);
                }
            }));
            CoreModule.f18264c.f20297C0.m146425v4();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m51377y(Act act, boolean z, boolean z2) {
        m51326z().f33442I.onNext(new pf60<>("notify_search", null));
        m51349W("matching");
        if (z2) {
            o1j0.m165649w(R$string.f19692tt);
        }
        if (NullChecker.m82486a(this.f33435B) && !this.f33435B.isUnsubscribed()) {
            this.f33435B.unsubscribe();
        }
        this.f33435B = CoreModule.f18264c.f20300D0.m35844Q4(z).compose(z7i0.m218893e(CoreModule.f18264c.f20312H0.m155465s5(lqb.m155388i4(z), SummarizedPrivilegesId.get("quickchatNumber")))).flatMap(new qcj() { // from class: l.rt50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return psd0.m173625r(C22421c.just(user), user == null ? C22421c.just(uxj0.f181467a) : CoreModule.f18264c.f20384f0.m33905ap(user.f56859id), new yt50());
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.st50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170546a.m51344R((pf60) obj);
            }
        }, new y20() { // from class: l.tt50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176055a.m51345S((Throwable) obj);
            }
        }));
        CoreModule.f18264c.f20297C0.m146425v4();
    }
}
