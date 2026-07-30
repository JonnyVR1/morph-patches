package com.p046p1.mobile.putong.core.p053ui.onlinematch;

import android.annotation.SuppressLint;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.ak50;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.hpd0;
import p149l.ib1;
import p149l.j760;
import p149l.ke50;
import p149l.ke7;
import p149l.l3f;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.ok3;
import p149l.pxz;
import p149l.qib0;
import p149l.roj0;
import p149l.rzh0;
import p149l.sqb0;
import p149l.swh0;
import p149l.tpd0;
import p149l.upa;
import p149l.uqd0;
import p149l.vqd0;
import p149l.vwb;
import p149l.w9j;
import p149l.xma;
import p149l.xob;
import p149l.xzc0;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchManager {

    /* JADX INFO: renamed from: L */
    public static volatile OnlineMatchManager f32585L;

    /* JADX INFO: renamed from: A */
    public C22392a<String> f32586A;

    /* JADX INFO: renamed from: B */
    public c4g0 f32587B;

    /* JADX INFO: renamed from: C */
    public c4g0 f32588C;

    /* JADX INFO: renamed from: D */
    public c4g0 f32589D;

    /* JADX INFO: renamed from: E */
    public c4g0 f32590E;

    /* JADX INFO: renamed from: F */
    public C8610b f32591F;

    /* JADX INFO: renamed from: G */
    public OnlineMatchPushUser f32592G;

    /* JADX INFO: renamed from: H */
    public C22393b<OnlineMatchPushUser> f32593H;

    /* JADX INFO: renamed from: I */
    public C22392a<j760<String, Object>> f32594I;

    /* JADX INFO: renamed from: J */
    public final vqd0 f32595J;

    /* JADX INFO: renamed from: K */
    public final zpd0 f32596K;

    /* JADX INFO: renamed from: a */
    public final hpd0 f32597a;

    /* JADX INFO: renamed from: b */
    public tpd0 f32598b;

    /* JADX INFO: renamed from: c */
    public final tpd0 f32599c;

    /* JADX INFO: renamed from: d */
    public final zpd0 f32600d;

    /* JADX INFO: renamed from: e */
    public final zpd0 f32601e;

    /* JADX INFO: renamed from: f */
    public boolean f32602f;

    /* JADX INFO: renamed from: g */
    public final zpd0 f32603g;

    /* JADX INFO: renamed from: h */
    public final zpd0 f32604h;

    /* JADX INFO: renamed from: i */
    public final uqd0 f32605i;

    /* JADX INFO: renamed from: j */
    public final zpd0 f32606j;

    /* JADX INFO: renamed from: k */
    public final zpd0 f32607k;

    /* JADX INFO: renamed from: l */
    public hpd0 f32608l;

    /* JADX INFO: renamed from: m */
    public hpd0 f32609m;

    /* JADX INFO: renamed from: n */
    public hpd0 f32610n;

    /* JADX INFO: renamed from: o */
    public hpd0 f32611o;

    /* JADX INFO: renamed from: p */
    public boolean f32612p;

    /* JADX INFO: renamed from: q */
    public final tpd0 f32613q;

    /* JADX INFO: renamed from: r */
    public zpd0 f32614r;

    /* JADX INFO: renamed from: s */
    public tpd0 f32615s;

    /* JADX INFO: renamed from: t */
    public zpd0 f32616t;

    /* JADX INFO: renamed from: u */
    public zpd0 f32617u;

    /* JADX INFO: renamed from: v */
    public zpd0 f32618v;

    /* JADX INFO: renamed from: w */
    public C22392a<j760<String, String>> f32619w;

    /* JADX INFO: renamed from: x */
    public final Map<String, String> f32620x;

    /* JADX INFO: renamed from: y */
    public C22392a<j760<String, QuickChatProduce>> f32621y;

    /* JADX INFO: renamed from: z */
    public C22393b<String> f32622z;

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
        String str = "quickchatMessageChatShowCurrentDayIsShow" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f32597a = new hpd0(str, bool);
        this.f32598b = new tpd0("quickchatMessageChatCount" + CoreModule.m29931H().userId(), 0);
        this.f32599c = new tpd0("quickchatMessageChatShowTime" + CoreModule.m29931H().userId(), 0);
        this.f32600d = new zpd0("quickchatMessageChatShowCurrentDay" + CoreModule.m29931H().userId(), 0L);
        this.f32601e = new zpd0("quickchatMessageChatShowCurrentDayFirstShow" + CoreModule.m29931H().userId(), 0L);
        this.f32602f = false;
        this.f32603g = new zpd0("online_match_show_time_" + CoreModule.m29931H().userId(), 0L);
        this.f32604h = new zpd0("om_mess_tip_show_time_" + CoreModule.m29931H().userId(), 0L);
        this.f32605i = new uqd0("om_mess_tip_show_id_" + CoreModule.m29931H().userId(), "");
        this.f32606j = new zpd0("online_match_assistant_fir_time_" + CoreModule.m29931H().userId(), 0L);
        this.f32607k = new zpd0("online_match_assistant_time_" + CoreModule.m29931H().userId(), 0L);
        this.f32608l = new hpd0("show_matched_dismissed_" + CoreModule.m29931H().userId(), bool);
        this.f32609m = new hpd0("online_match_limit_positive_" + CoreModule.m29931H().userId(), bool);
        this.f32610n = new hpd0("online_match_limit_negative_" + CoreModule.m29931H().userId(), bool);
        this.f32611o = new hpd0("isNoChatCallDialogCanShow_" + CoreModule.m29931H().userId(), Boolean.TRUE);
        this.f32612p = false;
        this.f32613q = new tpd0("today_quick_chat_insert_card_count_" + CoreModule.m29931H().userId(), 0);
        this.f32614r = new zpd0("last_timestamp_quick_chat_insert_card_" + CoreModule.m29931H().userId(), 0L);
        this.f32615s = new tpd0("square_data_tab_count_" + CoreModule.m29931H().userId(), 0);
        this.f32616t = new zpd0("square_data_tab_show_time_" + CoreModule.m29931H().userId(), 0L);
        this.f32617u = new zpd0("QuickChatV2ShowNormalTips" + CoreModule.m29931H().userId(), 0L);
        this.f32618v = new zpd0("QuickChatV2ShowVideoTips" + CoreModule.m29931H().userId(), 0L);
        this.f32619w = C22392a.m221512b();
        this.f32620x = new HashMap();
        this.f32621y = C22392a.m221513c(j760.m140076a("default", QuickChatProduce.QuickChat));
        this.f32622z = C22393b.m221521b();
        this.f32586A = C22392a.m221512b();
        this.f32593H = C22393b.m221521b();
        this.f32594I = C22392a.m221512b();
        this.f32595J = new vqd0("om_notify_close_set" + CoreModule.m29931H().userId(), new HashSet());
        this.f32596K = new zpd0("om_notify_update_time" + CoreModule.m29931H().userId(), 0L);
        m50173d0();
        m50171b0();
        m50172c0();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50122a(Act act, OnlineMatchPushUser onlineMatchPushUser, d30 d30Var, String str) {
        swh0.m186255p0().m186303W0();
        C8609a.m50220D(act, onlineMatchPushUser, true, d30Var, false, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m50125d(j760 j760Var) {
        return (String) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m50127e0() {
        if (NullChecker.m81303a(f32585L)) {
            synchronized (OnlineMatchManager.class) {
                try {
                    if (NullChecker.m81303a(f32585L)) {
                        if (NullChecker.m81303a(f32585L.f32587B) && !f32585L.f32587B.isUnsubscribed()) {
                            f32585L.f32587B.unsubscribe();
                        }
                        if (NullChecker.m81303a(f32585L.f32588C) && !f32585L.f32588C.isUnsubscribed()) {
                            f32585L.f32588C.unsubscribe();
                        }
                        if (NullChecker.m81303a(f32585L.f32589D) && !f32585L.f32589D.isUnsubscribed()) {
                            f32585L.f32589D.unsubscribe();
                        }
                        if (NullChecker.m81303a(f32585L.f32590E) && !f32585L.f32590E.isUnsubscribed()) {
                            f32585L.f32590E.unsubscribe();
                        }
                        if (NullChecker.m81303a(f32585L.f32591F)) {
                            f32585L.f32591F.m50288d();
                        }
                        f32585L.m50192w();
                        C4756v.f20122Z.onNext("");
                        f32585L = null;
                    }
                    C8611c.INSTANCE.m50303b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m50130h(e30 e30Var) {
        sqb0.m185498O().m185543I();
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m50133k(Boolean bool) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m50135m(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m50139q(Boolean bool) {
    }

    /* JADX INFO: renamed from: z */
    public static OnlineMatchManager m50143z() {
        if (f32585L == null) {
            synchronized (OnlineMatchManager.class) {
                try {
                    if (f32585L == null) {
                        f32585L = new OnlineMatchManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f32585L;
    }

    /* JADX INFO: renamed from: A */
    public QuickChatProduce m50144A() {
        return this.f32621y.m221515e().f116565b;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: B */
    public final String m50145B(OnlineMatchPushUser onlineMatchPushUser) {
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
    public String m50146C() {
        return this.f32621y.m221515e().f116564a;
    }

    /* JADX INFO: renamed from: D */
    public C22306c<String> m50147D() {
        return this.f32621y.asObservable().map(new w9j() { // from class: l.cm50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return OnlineMatchManager.m50125d((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public C22306c<j760<String, QuickChatProduce>> m50148E() {
        return this.f32621y.asObservable();
    }

    /* JADX INFO: renamed from: F */
    public boolean m50149F(String str) {
        if (mqi0.m155929D(this.f32596K.get().longValue())) {
            return this.f32595J.get().contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final void m50150G() {
        boolean zM155929D = mqi0.m155929D(this.f32614r.get().longValue());
        tpd0 tpd0Var = this.f32613q;
        if (zM155929D) {
            tpd0Var.m189988a(1);
        } else {
            tpd0Var.put(1);
            this.f32614r.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m50151H(User user) {
        if (NullChecker.m81303a(user)) {
            return user.isFemale();
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public boolean m50152I() {
        return false;
    }

    /* JADX INFO: renamed from: J */
    public boolean m50153J() {
        return "matching".equals(m50146C()) && m50144A() == QuickChatProduce.Heartbeat;
    }

    /* JADX INFO: renamed from: K */
    public boolean m50154K(Conversation conversation) {
        if (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.property) && NullChecker.m81303a(conversation.property.quickchat)) {
            return conversation.property.quickchat.bellPrivilegeIntercept;
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public boolean m50155L() {
        return "matching".equals(m50146C());
    }

    /* JADX INFO: renamed from: M */
    public boolean m50156M() {
        return this.f32597a.get().booleanValue();
    }

    /* JADX INFO: renamed from: N */
    public boolean m50157N() {
        return this.f32601e.get().longValue() != mqi0.m155943n();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m50158O(Act act, boolean z, e30 e30Var) {
        swh0.m186255p0().m186303W0();
        m50194y(act, true, z);
        e30Var.call(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m50159P(String str, final Act act, j760 j760Var) {
        if (!NullChecker.m81303a(j760Var.f116564a)) {
            zvf0.m220371D("e_quickchat_askend", "p_suggest_users_home_view", vwb.m200311Y("quickchat_ask_result", Boolean.FALSE));
            m50191v();
            return;
        }
        zvf0.m220371D("e_quickchat_askend", "p_suggest_users_home_view", vwb.m200311Y("quickchat_ask_result", Boolean.TRUE));
        final String str2 = ((User) j760Var.f116564a).f56011id;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m50185q0(str2);
        CoreModule.f17545c.f19663m0.m31002G8(str2);
        if (TextUtils.equals("planA", str) && !TextUtils.isEmpty(((User) j760Var.f116564a).name)) {
            ke7 ke7VarM145732o = ke7.m145732o();
            F f = j760Var.f116564a;
            ke7VarM145732o.m145739C(act, ((User) f).name, ((User) f).m60124fp().profileSmall().formatted(), new d30() { // from class: l.tl50
                @Override // p149l.d30
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(MessagesAct.m48949p2(act2, str2, false, false, false, false, null, 7, null));
                }
            });
        } else if (TextUtils.equals("planB", str)) {
            ke7.m145732o().m145740D(act, "chat", "", "", new d30() { // from class: l.vl50
                @Override // p149l.d30
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(MessagesAct.m48949p2(act2, str2, false, false, false, false, null, 7, null));
                }
            });
        }
        m50166W("default");
        this.f32591F.m50288d();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m50160Q(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).subCode == 601010) {
            lsi0.m151580j("正在语音闪聊匹配中");
        }
        m50166W("default");
        this.f32591F.m50288d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m50161R(j760 j760Var) {
        if (!NullChecker.m81303a(j760Var.f116564a)) {
            C8609a.m50262j0(qib0.f154693H.guessedCurrentServerTime());
            m50166W("matching");
            m50165V("start_match_from_user");
            return;
        }
        m50185q0(((User) j760Var.f116564a).f56011id);
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        F f = j760Var.f116564a;
        onlineMatchMatchUser.user = (User) f;
        onlineMatchMatchUser.userId = ((User) f).f56011id;
        C4756v.f20123a0.onNext(vwb.m200311Y("match_success", onlineMatchMatchUser));
        C4756v.f20122Z.onNext(((User) j760Var.f116564a).f56011id);
        CoreModule.f17545c.f19663m0.m31002G8(((User) j760Var.f116564a).f56011id);
        m50166W("default");
        this.f32591F.m50288d();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m50162S(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).subCode == 601010) {
            lsi0.m151580j("正在语音闪聊匹配中");
        }
        m50166W("default");
        this.f32591F.m50288d();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m50163T(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.m81284g() || !m50155L()) {
            return;
        }
        m50166W("default");
        m50165V("match_stop");
        this.f32591F.m50288d();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m50164U(Throwable th) {
        m50166W("matching");
    }

    /* JADX INFO: renamed from: V */
    public void m50165V(String str) {
        this.f32622z.onNext(str);
    }

    /* JADX INFO: renamed from: W */
    public void m50166W(String str) {
        m50167X(str, QuickChatProduce.QuickChat);
    }

    /* JADX INFO: renamed from: X */
    public void m50167X(String str, QuickChatProduce quickChatProduce) {
        this.f32621y.onNext(vwb.m200311Y(str, quickChatProduce));
    }

    /* JADX INFO: renamed from: Y */
    public final void m50168Y(Act act, String str) {
        C8764c.m53479o1(act, null, C8609a.m50274p0(), str);
    }

    /* JADX INFO: renamed from: Z */
    public final void m50169Z(String str) {
        m50165V("match_success");
        this.f32591F.m50288d();
        m50166W("default");
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: a0 */
    public void m50170a0(String str) {
        double dM78833x;
        double dM78831u;
        if (ke50.m145714a() && C8609a.m50246b0() > ke50.m145715b()) {
            this.f32603g.put(Long.valueOf(mqi0.m155944o()));
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        Location locationM78865q = qib0.f154687E.m78865q();
        if (NullChecker.m81303a(locationM78865q)) {
            dM78833x = locationM78865q.m78833x();
            dM78831u = locationM78865q.m78831u();
        } else {
            dM78833x = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            dM78831u = 0.0d;
        }
        zvf0.m220371D("e_quickchat_position_distance", "", j760.m140076a("longitude", Double.valueOf(dM78833x)), j760.m140076a("latitude", Double.valueOf(dM78831u)), j760.m140076a("distance", Integer.valueOf(userM169430Pa.location.distance)), j760.m140076a("match_id", String.format("(%s,%s)", CoreModule.m29931H().userId(), str)));
        xzc0.m211974x0().m211980t0(str);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m50171b0() {
        this.f32589D = C4756v.f20122Z.filter(new w9j() { // from class: l.jl50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ul50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177014a.m50169Z((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m50172c0() {
        this.f32590E = ConnectivityReceiver.m81290m().skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.xl50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193384a.m50163T((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m50173d0() {
        this.f32591F = new C8610b(new C8610b.a() { // from class: l.wl50
            @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.C8610b.a
            /* JADX INFO: renamed from: a */
            public final void mo50289a() {
                this.f186874a.m50184p0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m50174f0() {
        if (NullChecker.m81303a(this.f32588C) && !this.f32588C.isUnsubscribed()) {
            this.f32588C.unsubscribe();
        }
        this.f32588C = CoreModule.f17545c.f19558D0.m34843S4().subscribe(mkd0.m154956H(new e30() { // from class: l.yl50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineMatchManager.m50135m((roj0) obj);
            }
        }, new e30() { // from class: l.zl50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203594a.m50164U((Throwable) obj);
            }
        }));
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: g0 */
    public void m50175g0(String str) {
        HashSet<String> hashSet = this.f32595J.get();
        if (!mqi0.m155929D(this.f32596K.get().longValue())) {
            hashSet.clear();
            this.f32596K.put(Long.valueOf(mqi0.m155944o()));
        }
        hashSet.add(str);
        this.f32595J.put(hashSet);
    }

    /* JADX INFO: renamed from: h0 */
    public void m50176h0(boolean z) {
        this.f32597a.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i0 */
    public void m50177i0() {
        this.f32602f = true;
        this.f32601e.put(Long.valueOf(mqi0.m155943n()));
    }

    /* JADX INFO: renamed from: j0 */
    public void m50178j0() {
        this.f32618v.put(Long.valueOf(mqi0.m155943n()));
        this.f32617u.put(Long.valueOf(mqi0.m155943n()));
    }

    /* JADX INFO: renamed from: k0 */
    public void m50179k0() {
        if (this.f32600d.get().longValue() != mqi0.m155943n()) {
            this.f32600d.put(Long.valueOf(mqi0.m155943n()));
            this.f32599c.put(0);
        }
        this.f32602f = true;
        this.f32599c.put(Integer.valueOf(this.f32599c.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m50180l0(Settings settings) {
        if (settings.getSearchMaxAge().intValue() - settings.getSearchMinAge().intValue() >= 3.0f) {
            return false;
        }
        if (this.f32606j.get().longValue() == 0) {
            this.f32606j.put(Long.valueOf(mqi0.m155944o()));
            return true;
        }
        if (mqi0.m155929D(this.f32607k.get().longValue())) {
            return false;
        }
        int iCeil = (int) Math.ceil((mqi0.m155944o() - this.f32606j.get().longValue()) / 8.64E7d);
        if (iCeil != 2 && iCeil != 3 && iCeil != 5 && (iCeil <= 0 || iCeil % 8 != 0)) {
            return false;
        }
        this.f32607k.put(Long.valueOf(mqi0.m155944o()));
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m50181m0() {
        return (C8609a.m50246b0() <= ke50.m145715b() && this.f32603g.get().longValue() + 7200000 > mqi0.m155944o()) || C8609a.m50246b0() < 1;
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m50182n0() {
        return (this.f32600d.get().longValue() != mqi0.m155943n() || (this.f32600d.get().longValue() == mqi0.m155943n() && this.f32599c.get().intValue() < 3)) && !this.f32602f;
    }

    /* JADX INFO: renamed from: o0 */
    public void m50183o0(Act act, boolean z) {
        if (m50155L()) {
            return;
        }
        m50189u(act, z, "", new e30() { // from class: l.kl50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineMatchManager.m50139q((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m50184p0() {
        m50143z().f32594I.onNext(vwb.m200311Y("match_timeout", null));
        m50191v();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m50185q0(String str) {
        MatchScData matchScDataBuild = new MatchScData.MatchBuilder().isLike(true).isSuperLiked(false).user(str).pageId(pxz.m171966c()).isFromButton(true).matchSource(HomeStatisticsHelper.ScActionFrom.QUICK_CHAT.getFrom()).build();
        l3f l3fVar = new l3f();
        l3fVar.f125900s = MatchScData.MID;
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        zvf0.m220392n(l3fVar, matchScDataBuild.toTrackParamMap());
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m50186r0(final Act act, final OnlineMatchPushUser onlineMatchPushUser, final d30 d30Var, final String str) {
        boolean zM50151H = m50151H(CoreModule.f17545c.f19639e0.m169520na());
        boolean z = swh0.m186186E0() && swh0.m186201K();
        if (NullChecker.m81303a(onlineMatchPushUser) && onlineMatchPushUser.isMaleQuickChatRing && upa.m194735c2() && !zM50151H) {
            C8609a.m50220D(act, onlineMatchPushUser, z, d30Var, false, str);
            return true;
        }
        if (C8609a.m50246b0() > 0 || (swh0.m186263s0() >= 1 && !zM50151H)) {
            if (z && swh0.m186255p0().m186313g1()) {
                swh0.m186180B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.rl50
                    @Override // p149l.d30
                    public final void call() {
                        OnlineMatchManager.m50122a(act, onlineMatchPushUser, d30Var, str);
                    }
                }, null);
            } else {
                C8609a.m50220D(act, onlineMatchPushUser, z, d30Var, false, str);
            }
            return true;
        }
        if (zM50151H) {
            ak50.m97109O().m97136H(act, "use_up");
        } else if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33565pr(act, m50145B(onlineMatchPushUser), Privilege.online_match_tickets);
        } else {
            m50168Y(act, m50145B(onlineMatchPushUser));
        }
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m50187s0(Act act, QuickChatStartClickFrom quickChatStartClickFrom, String str) {
        return m50188t0(act, quickChatStartClickFrom, str, new e30() { // from class: l.dm50
            @Override // p149l.e30
            public final void call(Object obj) {
                OnlineMatchManager.m50133k((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m50188t0(Act act, QuickChatStartClickFrom quickChatStartClickFrom, String str, @NonNull e30<Boolean> e30Var) {
        if (!NullChecker.m81304b(act)) {
            e30Var.call(Boolean.FALSE);
            return false;
        }
        m50165V("try_start");
        CoreModule.f17545c.f19555C0.m210112u4();
        if (TextUtils.equals(m50146C(), "default")) {
            boolean zM50189u = m50189u(act, false, str, e30Var);
            C8609a.m50246b0();
            return zM50189u;
        }
        if (m50155L()) {
            m50191v();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m50189u(final Act act, final boolean z, String str, @NonNull final e30<Boolean> e30Var) {
        boolean z2 = false;
        if (ke50.m145714a() && m50181m0()) {
            ak50.m97109O().m97136H(act, "overheat_protection");
            m50143z().f32594I.onNext(new j760<>("notify_normal_state", null));
            e30Var.call(Boolean.FALSE);
            return false;
        }
        Settings settings = CoreModule.f17545c.f19639e0.m169520na().settings;
        if (!NullChecker.m81304b(settings)) {
            return false;
        }
        if (m50180l0(settings)) {
            ok3.m164812K(act, settings);
            e30Var.call(Boolean.FALSE);
            return false;
        }
        if (!ke50.m145714a() && swh0.m186263s0() <= 0) {
            if (vwb.m200298L(str)) {
                str = "p_quickchat,quickchat_button";
            }
            m50168Y(act, str);
            e30Var.call(Boolean.FALSE);
            return false;
        }
        if (!Network.isConnected(act)) {
            lsi0.m151584n(R$string.f18813p4);
            e30Var.call(Boolean.FALSE);
            return false;
        }
        if (swh0.m186186E0() && swh0.m186201K()) {
            z2 = true;
        }
        if (z2 && swh0.m186255p0().m186313g1() && !(act instanceof QuickChatSearchingAct)) {
            swh0.m186180B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.am50
                @Override // p149l.d30
                public final void call() {
                    this.f70561a.m50158O(act, z, e30Var);
                }
            }, new d30() { // from class: l.bm50
                @Override // p149l.d30
                public final void call() {
                    OnlineMatchManager.m50130h(e30Var);
                }
            });
        } else {
            m50194y(act, z2, z);
            e30Var.call(Boolean.TRUE);
        }
        this.f32591F.m50287c();
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m50190u0(Act act, @NonNull e30<Boolean> e30Var) {
        boolean zM50151H = m50151H(CoreModule.f17545c.f19639e0.m169520na());
        boolean z = swh0.m186186E0() && swh0.m186201K();
        if ((swh0.m186263s0() >= 1 && !zM50151H) || (ke50.m145714a() && C8609a.m50246b0() >= 1)) {
            if (z && swh0.m186255p0().m186313g1()) {
                e30Var.call(Boolean.FALSE);
            }
            m50143z().m50188t0(act, QuickChatStartClickFrom.ChatTop, "p_wallet,vas", e30Var);
            return;
        }
        if (zM50151H) {
            ak50.m97109O().m97136H(act, "use_up");
        } else {
            boolean z2 = act instanceof DropDownAct;
            String str = "p_quickchat,quickchat_button";
            if (!z2 || !((DropDownAct) act).m54452g2()) {
                if (z2 && ((DropDownAct) act).m54454i2()) {
                    str = "p_message,quickchat_entrance";
                } else if (z2 && ((DropDownAct) act).m54457m2()) {
                    str = "p_quickchat_party,quickchat";
                } else if (z2 && ((DropDownAct) act).m54455k2()) {
                    str = "p_playground,quickchat";
                } else if (z2 && ((DropDownAct) act).m54456l2()) {
                    str = "p_pay_result,e_quickchat_button,click";
                }
            }
            if (xma.m210071e4()) {
                CoreModule.m29935P().m94651a().mo33565pr(act, str, Privilege.online_match_tickets);
            } else {
                m50168Y(act, str);
            }
        }
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: v */
    public void m50191v() {
        ib1.m135233b().mo135237e(sqb0.m185499Q());
        m50166W("default");
        m50165V("match_stop");
        if (Network.isConnected(CoreModule.f17544b)) {
            m50174f0();
            this.f32591F.m50288d();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m50192w() {
        this.f32592G = null;
    }

    /* JADX INFO: renamed from: x */
    public void m50193x(final Act act, final String str) {
        if (TextUtils.equals(m50146C(), "default")) {
            CoreModule.f17545c.f19555C0.m210112u4();
            mkd0.m154992z(this.f32587B);
            zvf0.m220371D("e_quickchat_ask", "p_suggest_users_home_view", new j760[0]);
            this.f32587B = CoreModule.f17545c.f19558D0.m34841Q4(false).flatMap(new w9j() { // from class: l.ol50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return mkd0.m154984r(C22306c.just(user), user == null ? C22306c.just(roj0.f160388a) : CoreModule.f17545c.f19642f0.m32902ap(user.f56011id), new sl50());
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.pl50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150074a.m50159P(str, act, (j760) obj);
                }
            }, new e30() { // from class: l.ql50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155192a.m50160Q((Throwable) obj);
                }
            }));
            CoreModule.f17545c.f19555C0.m210112u4();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m50194y(Act act, boolean z, boolean z2) {
        m50143z().f32594I.onNext(new j760<>("notify_search", null));
        m50166W("matching");
        if (z2) {
            lsi0.m151593w(R$string.f18255Ws);
        }
        if (NullChecker.m81303a(this.f32587B) && !this.f32587B.isUnsubscribed()) {
            this.f32587B.unsubscribe();
        }
        this.f32587B = CoreModule.f17545c.f19558D0.m34841Q4(z).compose(rzh0.m181751e(CoreModule.f17545c.f19570H0.m210377s5(xob.m210300i4(z), SummarizedPrivilegesId.get("quickchatNumber")))).flatMap(new w9j() { // from class: l.ll50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return mkd0.m154984r(C22306c.just(user), user == null ? C22306c.just(roj0.f160388a) : CoreModule.f17545c.f19642f0.m32902ap(user.f56011id), new sl50());
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ml50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134406a.m50161R((j760) obj);
            }
        }, new e30() { // from class: l.nl50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139507a.m50162S((Throwable) obj);
            }
        }));
        CoreModule.f17545c.f19555C0.m210112u4();
    }
}
