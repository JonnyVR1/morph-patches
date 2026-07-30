package com.p000p1.mobile.putong.core.p001ui.onlinematch;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.OnlineMatchManager;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.v;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.quickaudio.DropDownAct;
import com.p1.mobile.putong.core.ui.quickaudio.newquickchat.searchingPage.QuickChatSearchingAct;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import l.ak50;
import l.c4g0;
import l.d30;
import l.e30;
import l.hpd0;
import l.ib1;
import l.j760;
import l.ke50;
import l.ke7;
import l.l3f;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.ok3;
import l.qib0;
import l.roj0;
import l.rzh0;
import l.sqb0;
import l.swh0;
import l.tpd0;
import l.upa;
import l.uqd0;
import l.vqd0;
import l.vwb;
import l.w9j;
import l.xma;
import l.xob;
import l.xzc0;
import l.zpd0;
import l.zvf0;
import p002l.pxz;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnlineMatchManager {

    /* JADX INFO: renamed from: L */
    public static volatile OnlineMatchManager f407L;

    /* JADX INFO: renamed from: A */
    public a<String> f408A;

    /* JADX INFO: renamed from: B */
    public c4g0 f409B;

    /* JADX INFO: renamed from: C */
    public c4g0 f410C;

    /* JADX INFO: renamed from: D */
    public c4g0 f411D;

    /* JADX INFO: renamed from: E */
    public c4g0 f412E;

    /* JADX INFO: renamed from: F */
    public C0035b f413F;

    /* JADX INFO: renamed from: G */
    public OnlineMatchPushUser f414G;

    /* JADX INFO: renamed from: H */
    public b<OnlineMatchPushUser> f415H;

    /* JADX INFO: renamed from: I */
    public a<j760<String, Object>> f416I;

    /* JADX INFO: renamed from: J */
    public final vqd0 f417J;

    /* JADX INFO: renamed from: K */
    public final zpd0 f418K;

    /* JADX INFO: renamed from: a */
    public final hpd0 f419a;

    /* JADX INFO: renamed from: b */
    public tpd0 f420b;

    /* JADX INFO: renamed from: c */
    public final tpd0 f421c;

    /* JADX INFO: renamed from: d */
    public final zpd0 f422d;

    /* JADX INFO: renamed from: e */
    public final zpd0 f423e;

    /* JADX INFO: renamed from: f */
    public boolean f424f;

    /* JADX INFO: renamed from: g */
    public final zpd0 f425g;

    /* JADX INFO: renamed from: h */
    public final zpd0 f426h;

    /* JADX INFO: renamed from: i */
    public final uqd0 f427i;

    /* JADX INFO: renamed from: j */
    public final zpd0 f428j;

    /* JADX INFO: renamed from: k */
    public final zpd0 f429k;

    /* JADX INFO: renamed from: l */
    public hpd0 f430l;

    /* JADX INFO: renamed from: m */
    public hpd0 f431m;

    /* JADX INFO: renamed from: n */
    public hpd0 f432n;

    /* JADX INFO: renamed from: o */
    public hpd0 f433o;

    /* JADX INFO: renamed from: p */
    public boolean f434p;

    /* JADX INFO: renamed from: q */
    public final tpd0 f435q;

    /* JADX INFO: renamed from: r */
    public zpd0 f436r;

    /* JADX INFO: renamed from: s */
    public tpd0 f437s;

    /* JADX INFO: renamed from: t */
    public zpd0 f438t;

    /* JADX INFO: renamed from: u */
    public zpd0 f439u;

    /* JADX INFO: renamed from: v */
    public zpd0 f440v;

    /* JADX INFO: renamed from: w */
    public a<j760<String, String>> f441w;

    /* JADX INFO: renamed from: x */
    public final Map<String, String> f442x;

    /* JADX INFO: renamed from: y */
    public a<j760<String, QuickChatProduce>> f443y;

    /* JADX INFO: renamed from: z */
    public b<String> f444z;

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
        String str = "quickchatMessageChatShowCurrentDayIsShow" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        this.f419a = new hpd0(str, bool);
        this.f420b = new tpd0("quickchatMessageChatCount" + CoreModule.H().userId(), 0);
        this.f421c = new tpd0("quickchatMessageChatShowTime" + CoreModule.H().userId(), 0);
        this.f422d = new zpd0("quickchatMessageChatShowCurrentDay" + CoreModule.H().userId(), 0L);
        this.f423e = new zpd0("quickchatMessageChatShowCurrentDayFirstShow" + CoreModule.H().userId(), 0L);
        this.f424f = false;
        this.f425g = new zpd0("online_match_show_time_" + CoreModule.H().userId(), 0L);
        this.f426h = new zpd0("om_mess_tip_show_time_" + CoreModule.H().userId(), 0L);
        this.f427i = new uqd0("om_mess_tip_show_id_" + CoreModule.H().userId(), "");
        this.f428j = new zpd0("online_match_assistant_fir_time_" + CoreModule.H().userId(), 0L);
        this.f429k = new zpd0("online_match_assistant_time_" + CoreModule.H().userId(), 0L);
        this.f430l = new hpd0("show_matched_dismissed_" + CoreModule.H().userId(), bool);
        this.f431m = new hpd0("online_match_limit_positive_" + CoreModule.H().userId(), bool);
        this.f432n = new hpd0("online_match_limit_negative_" + CoreModule.H().userId(), bool);
        this.f433o = new hpd0("isNoChatCallDialogCanShow_" + CoreModule.H().userId(), Boolean.TRUE);
        this.f434p = false;
        this.f435q = new tpd0("today_quick_chat_insert_card_count_" + CoreModule.H().userId(), 0);
        this.f436r = new zpd0("last_timestamp_quick_chat_insert_card_" + CoreModule.H().userId(), 0L);
        this.f437s = new tpd0("square_data_tab_count_" + CoreModule.H().userId(), 0);
        this.f438t = new zpd0("square_data_tab_show_time_" + CoreModule.H().userId(), 0L);
        this.f439u = new zpd0("QuickChatV2ShowNormalTips" + CoreModule.H().userId(), 0L);
        this.f440v = new zpd0("QuickChatV2ShowVideoTips" + CoreModule.H().userId(), 0L);
        this.f441w = a.b();
        this.f442x = new HashMap();
        this.f443y = a.c(j760.a("default", QuickChatProduce.QuickChat));
        this.f444z = b.b();
        this.f408A = a.b();
        this.f415H = b.b();
        this.f416I = a.b();
        this.f417J = new vqd0("om_notify_close_set" + CoreModule.H().userId(), new HashSet());
        this.f418K = new zpd0("om_notify_update_time" + CoreModule.H().userId(), 0L);
        m604d0();
        m602b0();
        m603c0();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m553a(Act act, OnlineMatchPushUser onlineMatchPushUser, d30 d30Var, String str) {
        swh0.p0().W0();
        C0034a.m651D(act, onlineMatchPushUser, true, d30Var, false, str);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m556d(j760 j760Var) {
        return (String) j760Var.a;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m558e0() {
        if (NullChecker.a(f407L)) {
            synchronized (OnlineMatchManager.class) {
                try {
                    if (NullChecker.a(f407L)) {
                        if (NullChecker.a(f407L.f409B) && !f407L.f409B.isUnsubscribed()) {
                            f407L.f409B.unsubscribe();
                        }
                        if (NullChecker.a(f407L.f410C) && !f407L.f410C.isUnsubscribed()) {
                            f407L.f410C.unsubscribe();
                        }
                        if (NullChecker.a(f407L.f411D) && !f407L.f411D.isUnsubscribed()) {
                            f407L.f411D.unsubscribe();
                        }
                        if (NullChecker.a(f407L.f412E) && !f407L.f412E.isUnsubscribed()) {
                            f407L.f412E.unsubscribe();
                        }
                        if (NullChecker.a(f407L.f413F)) {
                            f407L.f413F.m719d();
                        }
                        f407L.m623w();
                        v.Z.onNext("");
                        f407L = null;
                    }
                    C0036c.INSTANCE.m734b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m561h(e30 e30Var) {
        sqb0.O().I();
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m564k(Boolean bool) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m566m(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m570q(Boolean bool) {
    }

    /* JADX INFO: renamed from: z */
    public static OnlineMatchManager m574z() {
        if (f407L == null) {
            synchronized (OnlineMatchManager.class) {
                try {
                    if (f407L == null) {
                        f407L = new OnlineMatchManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f407L;
    }

    /* JADX INFO: renamed from: A */
    public QuickChatProduce m575A() {
        return (QuickChatProduce) ((j760) this.f443y.e()).b;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: B */
    public final String m576B(OnlineMatchPushUser onlineMatchPushUser) {
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
    public String m577C() {
        return (String) ((j760) this.f443y.e()).a;
    }

    /* JADX INFO: renamed from: D */
    public c<String> m578D() {
        return this.f443y.asObservable().map(new w9j() { // from class: l.cm50
            public final Object call(Object obj) {
                return OnlineMatchManager.m556d((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public c<j760<String, QuickChatProduce>> m579E() {
        return this.f443y.asObservable();
    }

    /* JADX INFO: renamed from: F */
    public boolean m580F(String str) {
        if (mqi0.D(((Long) this.f418K.get()).longValue())) {
            return ((HashSet) this.f417J.get()).contains(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final void m581G() {
        boolean zD = mqi0.D(((Long) this.f436r.get()).longValue());
        tpd0 tpd0Var = this.f435q;
        if (zD) {
            tpd0Var.a(1);
        } else {
            tpd0Var.put(1);
            this.f436r.put(Long.valueOf(mqi0.o()));
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m582H(User user) {
        if (NullChecker.a(user)) {
            return user.isFemale();
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public boolean m583I() {
        return false;
    }

    /* JADX INFO: renamed from: J */
    public boolean m584J() {
        return "matching".equals(m577C()) && m575A() == QuickChatProduce.Heartbeat;
    }

    /* JADX INFO: renamed from: K */
    public boolean m585K(Conversation conversation) {
        if (NullChecker.a(conversation) && NullChecker.a(conversation.property) && NullChecker.a(conversation.property.quickchat)) {
            return conversation.property.quickchat.bellPrivilegeIntercept;
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public boolean m586L() {
        return "matching".equals(m577C());
    }

    /* JADX INFO: renamed from: M */
    public boolean m587M() {
        return ((Boolean) this.f419a.get()).booleanValue();
    }

    /* JADX INFO: renamed from: N */
    public boolean m588N() {
        return ((Long) this.f423e.get()).longValue() != mqi0.n();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m589O(Act act, boolean z, e30 e30Var) {
        swh0.p0().W0();
        m625y(act, true, z);
        e30Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m590P(String str, final Act act, j760 j760Var) {
        if (!NullChecker.a(j760Var.a)) {
            zvf0.D("e_quickchat_askend", "p_suggest_users_home_view", new j760[]{vwb.Y("quickchat_ask_result", Boolean.FALSE)});
            m622v();
            return;
        }
        zvf0.D("e_quickchat_askend", "p_suggest_users_home_view", new j760[]{vwb.Y("quickchat_ask_result", Boolean.TRUE)});
        final String str2 = ((DbObject) ((User) j760Var.a)).id;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m616q0(str2);
        CoreModule.c.m0.G8(str2);
        if (TextUtils.equals("planA", str) && !TextUtils.isEmpty(((User) j760Var.a).name)) {
            ke7 ke7VarO = ke7.o();
            Object obj = j760Var.a;
            ke7VarO.C(act, ((User) obj).name, ((User) obj).fp().profileSmall().formatted(), new d30() { // from class: l.tl50
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(MessagesAct.p2(act2, str2, false, false, false, false, (Intent) null, 7, (String) null));
                }
            });
        } else if (TextUtils.equals("planB", str)) {
            ke7.o().D(act, "chat", "", "", new d30() { // from class: l.vl50
                public final void call() {
                    Act act2 = act;
                    act2.startActivity(MessagesAct.p2(act2, str2, false, false, false, false, (Intent) null, 7, (String) null));
                }
            });
        }
        m597W("default");
        this.f413F.m719d();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m591Q(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).subCode == 601010) {
            lsi0.j("正在语音闪聊匹配中");
        }
        m597W("default");
        this.f413F.m719d();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m592R(j760 j760Var) {
        if (!NullChecker.a(j760Var.a)) {
            C0034a.m693j0(qib0.H.guessedCurrentServerTime());
            m597W("matching");
            m596V("start_match_from_user");
            return;
        }
        m616q0(((DbObject) ((User) j760Var.a)).id);
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        Object obj = j760Var.a;
        onlineMatchMatchUser.user = (User) obj;
        onlineMatchMatchUser.userId = ((DbObject) ((User) obj)).id;
        v.a0.onNext(vwb.Y("match_success", onlineMatchMatchUser));
        v.Z.onNext(((DbObject) ((User) j760Var.a)).id);
        CoreModule.c.m0.G8(((DbObject) ((User) j760Var.a)).id);
        m597W("default");
        this.f413F.m719d();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m593S(Throwable th) {
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).subCode == 601010) {
            lsi0.j("正在语音闪聊匹配中");
        }
        m597W("default");
        this.f413F.m719d();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m594T(NetworkInfo networkInfo) {
        if (ConnectivityReceiver.g() || !m586L()) {
            return;
        }
        m597W("default");
        m596V("match_stop");
        this.f413F.m719d();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m595U(Throwable th) {
        m597W("matching");
    }

    /* JADX INFO: renamed from: V */
    public void m596V(String str) {
        this.f444z.onNext(str);
    }

    /* JADX INFO: renamed from: W */
    public void m597W(String str) {
        m598X(str, QuickChatProduce.QuickChat);
    }

    /* JADX INFO: renamed from: X */
    public void m598X(String str, QuickChatProduce quickChatProduce) {
        this.f443y.onNext(vwb.Y(str, quickChatProduce));
    }

    /* JADX INFO: renamed from: Y */
    public final void m599Y(Act act, String str) {
        C0189c.m4045o1(act, null, C0034a.m705p0(), str);
    }

    /* JADX INFO: renamed from: Z */
    public final void m600Z(String str) {
        m596V("match_success");
        this.f413F.m719d();
        m597W("default");
        CoreModule.c.C0.u4();
    }

    /* JADX INFO: renamed from: a0 */
    public void m601a0(String str) {
        double dX;
        double dU;
        if (ke50.a() && C0034a.m677b0() > ke50.b()) {
            this.f425g.put(Long.valueOf(mqi0.o()));
        }
        User userPa = CoreModule.c.e0.Pa(str);
        Location locationQ = qib0.E.q();
        if (NullChecker.a(locationQ)) {
            dX = locationQ.x();
            dU = locationQ.u();
        } else {
            dX = 0.0d;
            dU = 0.0d;
        }
        zvf0.D("e_quickchat_position_distance", "", new j760[]{j760.a("longitude", Double.valueOf(dX)), j760.a("latitude", Double.valueOf(dU)), j760.a("distance", Integer.valueOf(userPa.location.distance)), j760.a("match_id", String.format("(%s,%s)", CoreModule.H().userId(), str))});
        xzc0.x0().t0(str);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m602b0() {
        this.f411D = v.Z.filter(new w9j() { // from class: l.jl50
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ul50
            public final void call(Object obj) {
                this.f20693a.m600Z((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m603c0() {
        this.f412E = ConnectivityReceiver.m().skip(1).subscribe(mkd0.G(new e30() { // from class: l.xl50
            public final void call(Object obj) {
                this.f22344a.m594T((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m604d0() {
        this.f413F = new C0035b(new C0035b.a() { // from class: l.wl50
            @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.C0035b.a
            /* JADX INFO: renamed from: a */
            public final void mo720a() {
                this.f21820a.m615p0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m605f0() {
        if (NullChecker.a(this.f410C) && !this.f410C.isUnsubscribed()) {
            this.f410C.unsubscribe();
        }
        this.f410C = CoreModule.c.D0.S4().subscribe(mkd0.H(new e30() { // from class: l.yl50
            public final void call(Object obj) {
                OnlineMatchManager.m566m((roj0) obj);
            }
        }, new e30() { // from class: l.zl50
            public final void call(Object obj) {
                this.f23484a.m595U((Throwable) obj);
            }
        }));
        CoreModule.c.C0.u4();
    }

    /* JADX INFO: renamed from: g0 */
    public void m606g0(String str) {
        HashSet hashSet = (HashSet) this.f417J.get();
        if (!mqi0.D(((Long) this.f418K.get()).longValue())) {
            hashSet.clear();
            this.f418K.put(Long.valueOf(mqi0.o()));
        }
        hashSet.add(str);
        this.f417J.put(hashSet);
    }

    /* JADX INFO: renamed from: h0 */
    public void m607h0(boolean z) {
        this.f419a.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i0 */
    public void m608i0() {
        this.f424f = true;
        this.f423e.put(Long.valueOf(mqi0.n()));
    }

    /* JADX INFO: renamed from: j0 */
    public void m609j0() {
        this.f440v.put(Long.valueOf(mqi0.n()));
        this.f439u.put(Long.valueOf(mqi0.n()));
    }

    /* JADX INFO: renamed from: k0 */
    public void m610k0() {
        if (((Long) this.f422d.get()).longValue() != mqi0.n()) {
            this.f422d.put(Long.valueOf(mqi0.n()));
            this.f421c.put(0);
        }
        this.f424f = true;
        this.f421c.put(Integer.valueOf(((Integer) this.f421c.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m611l0(Settings settings) {
        if (settings.getSearchMaxAge().intValue() - settings.getSearchMinAge().intValue() >= 3.0f) {
            return false;
        }
        if (((Long) this.f428j.get()).longValue() == 0) {
            this.f428j.put(Long.valueOf(mqi0.o()));
            return true;
        }
        if (mqi0.D(((Long) this.f429k.get()).longValue())) {
            return false;
        }
        int iCeil = (int) Math.ceil((mqi0.o() - ((Long) this.f428j.get()).longValue()) / 8.64E7d);
        if (iCeil != 2 && iCeil != 3 && iCeil != 5 && (iCeil <= 0 || iCeil % 8 != 0)) {
            return false;
        }
        this.f429k.put(Long.valueOf(mqi0.o()));
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m612m0() {
        return (C0034a.m677b0() <= ke50.b() && ((Long) this.f425g.get()).longValue() + 7200000 > mqi0.o()) || C0034a.m677b0() < 1;
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m613n0() {
        return (((Long) this.f422d.get()).longValue() != mqi0.n() || (((Long) this.f422d.get()).longValue() == mqi0.n() && ((Integer) this.f421c.get()).intValue() < 3)) && !this.f424f;
    }

    /* JADX INFO: renamed from: o0 */
    public void m614o0(Act act, boolean z) {
        if (m586L()) {
            return;
        }
        m620u(act, z, "", new e30() { // from class: l.kl50
            public final void call(Object obj) {
                OnlineMatchManager.m570q((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m615p0() {
        m574z().f416I.onNext(vwb.Y("match_timeout", (Object) null));
        m622v();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m616q0(String str) {
        MatchScData matchScDataBuild = new MatchScData.MatchBuilder().isLike(true).isSuperLiked(false).user(str).pageId(pxz.m20755c()).isFromButton(true).matchSource(HomeStatisticsHelper.ScActionFrom.QUICK_CHAT.getFrom()).build();
        l3f l3fVar = new l3f();
        l3fVar.s = "e_gotmatch";
        l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        zvf0.n(l3fVar, matchScDataBuild.toTrackParamMap());
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m617r0(final Act act, final OnlineMatchPushUser onlineMatchPushUser, final d30 d30Var, final String str) {
        boolean zM582H = m582H(CoreModule.c.e0.na());
        boolean z = swh0.E0() && swh0.K();
        if (NullChecker.a(onlineMatchPushUser) && onlineMatchPushUser.isMaleQuickChatRing && upa.c2() && !zM582H) {
            C0034a.m651D(act, onlineMatchPushUser, z, d30Var, false, str);
            return true;
        }
        if (C0034a.m677b0() > 0 || (swh0.s0() >= 1 && !zM582H)) {
            if (z && swh0.p0().g1()) {
                swh0.B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.rl50
                    public final void call() {
                        OnlineMatchManager.m553a(act, onlineMatchPushUser, d30Var, str);
                    }
                }, (d30) null);
            } else {
                C0034a.m651D(act, onlineMatchPushUser, z, d30Var, false, str);
            }
            return true;
        }
        if (zM582H) {
            ak50.O().H(act, "use_up");
        } else if (xma.e4()) {
            CoreModule.P().a().pr(act, m576B(onlineMatchPushUser), Privilege.online_match_tickets);
        } else {
            m599Y(act, m576B(onlineMatchPushUser));
        }
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m618s0(Act act, QuickChatStartClickFrom quickChatStartClickFrom, String str) {
        return m619t0(act, quickChatStartClickFrom, str, new e30() { // from class: l.dm50
            public final void call(Object obj) {
                OnlineMatchManager.m564k((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m619t0(Act act, QuickChatStartClickFrom quickChatStartClickFrom, String str, @NonNull e30<Boolean> e30Var) {
        if (!NullChecker.b(act)) {
            e30Var.call(Boolean.FALSE);
            return false;
        }
        m596V("try_start");
        CoreModule.c.C0.u4();
        if (TextUtils.equals(m577C(), "default")) {
            boolean zM620u = m620u(act, false, str, e30Var);
            C0034a.m677b0();
            return zM620u;
        }
        if (m586L()) {
            m622v();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m620u(final Act act, final boolean z, String str, @NonNull final e30<Boolean> e30Var) {
        boolean z2 = false;
        if (ke50.a() && m612m0()) {
            ak50.O().H(act, "overheat_protection");
            m574z().f416I.onNext(new j760("notify_normal_state", (Object) null));
            e30Var.call(Boolean.FALSE);
            return false;
        }
        Settings settings = CoreModule.c.e0.na().settings;
        if (!NullChecker.b(settings)) {
            return false;
        }
        if (m611l0(settings)) {
            ok3.K(act, settings);
            e30Var.call(Boolean.FALSE);
            return false;
        }
        if (!ke50.a() && swh0.s0() <= 0) {
            if (vwb.L(str)) {
                str = "p_quickchat,quickchat_button";
            }
            m599Y(act, str);
            e30Var.call(Boolean.FALSE);
            return false;
        }
        if (!Network.isConnected(act)) {
            lsi0.n(R.string.p4);
            e30Var.call(Boolean.FALSE);
            return false;
        }
        if (swh0.E0() && swh0.K()) {
            z2 = true;
        }
        if (z2 && swh0.p0().g1() && !(act instanceof QuickChatSearchingAct)) {
            swh0.B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.am50
                public final void call() {
                    this.f7732a.m589O(act, z, e30Var);
                }
            }, new d30() { // from class: l.bm50
                public final void call() {
                    OnlineMatchManager.m561h(e30Var);
                }
            });
        } else {
            m625y(act, z2, z);
            e30Var.call(Boolean.TRUE);
        }
        this.f413F.m718c();
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m621u0(Act act, @NonNull e30<Boolean> e30Var) {
        boolean zM582H = m582H(CoreModule.c.e0.na());
        boolean z = swh0.E0() && swh0.K();
        if ((swh0.s0() >= 1 && !zM582H) || (ke50.a() && C0034a.m677b0() >= 1)) {
            if (z && swh0.p0().g1()) {
                e30Var.call(Boolean.FALSE);
            }
            m574z().m619t0(act, QuickChatStartClickFrom.ChatTop, "p_wallet,vas", e30Var);
            return;
        }
        if (zM582H) {
            ak50.O().H(act, "use_up");
        } else {
            boolean z2 = act instanceof DropDownAct;
            String str = "p_quickchat,quickchat_button";
            if (!z2 || !((DropDownAct) act).g2()) {
                if (z2 && ((DropDownAct) act).i2()) {
                    str = "p_message,quickchat_entrance";
                } else if (z2 && ((DropDownAct) act).m2()) {
                    str = "p_quickchat_party,quickchat";
                } else if (z2 && ((DropDownAct) act).k2()) {
                    str = "p_playground,quickchat";
                } else if (z2 && ((DropDownAct) act).l2()) {
                    str = "p_pay_result,e_quickchat_button,click";
                }
            }
            if (xma.e4()) {
                CoreModule.P().a().pr(act, str, Privilege.online_match_tickets);
            } else {
                m599Y(act, str);
            }
        }
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: v */
    public void m622v() {
        ib1.b().e(sqb0.Q());
        m597W("default");
        m596V("match_stop");
        if (Network.isConnected(CoreModule.b)) {
            m605f0();
            this.f413F.m719d();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m623w() {
        this.f414G = null;
    }

    /* JADX INFO: renamed from: x */
    public void m624x(final Act act, final String str) {
        if (TextUtils.equals(m577C(), "default")) {
            CoreModule.c.C0.u4();
            mkd0.z(this.f409B);
            zvf0.D("e_quickchat_ask", "p_suggest_users_home_view", new j760[0]);
            this.f409B = CoreModule.c.D0.Q4(false).flatMap(new w9j() { // from class: l.ol50
                public final Object call(Object obj) {
                    User user = (User) obj;
                    return mkd0.r(c.just(user), user == null ? c.just(roj0.a) : CoreModule.c.f0.ap(((DbObject) user).id), new sl50());
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.pl50
                public final void call(Object obj) {
                    this.f17483a.m590P(str, act, (j760) obj);
                }
            }, new e30() { // from class: l.ql50
                public final void call(Object obj) {
                    this.f18079a.m591Q((Throwable) obj);
                }
            }));
            CoreModule.c.C0.u4();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m625y(Act act, boolean z, boolean z2) {
        m574z().f416I.onNext(new j760("notify_search", (Object) null));
        m597W("matching");
        if (z2) {
            lsi0.w(R.string.Ws);
        }
        if (NullChecker.a(this.f409B) && !this.f409B.isUnsubscribed()) {
            this.f409B.unsubscribe();
        }
        this.f409B = CoreModule.c.D0.Q4(z).compose(rzh0.e(CoreModule.c.H0.s5(xob.i4(z), SummarizedPrivilegesId.get("quickchatNumber")))).flatMap(new w9j() { // from class: l.ll50
            public final Object call(Object obj) {
                User user = (User) obj;
                return mkd0.r(c.just(user), user == null ? c.just(roj0.a) : CoreModule.c.f0.ap(((DbObject) user).id), new sl50());
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ml50
            public final void call(Object obj) {
                this.f15438a.m592R((j760) obj);
            }
        }, new e30() { // from class: l.nl50
            public final void call(Object obj) {
                this.f16093a.m593S((Throwable) obj);
            }
        }));
        CoreModule.c.C0.u4();
    }
}
