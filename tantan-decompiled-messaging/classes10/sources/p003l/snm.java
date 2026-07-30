package p003l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.baidu.mapapi.model.LatLng;
import com.p000p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p000p1.mobile.putong.core.data.KnowMyselfShareParams;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.api.v;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Passby;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.d90;
import l.dd80;
import l.e30;
import l.g30;
import l.hfw;
import l.hpd0;
import l.i0g0;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mjj;
import l.mkd0;
import l.mqi0;
import l.qc2;
import l.roj0;
import l.sqb0;
import l.swh0;
import l.vwb;
import l.w0c0;
import l.w29;
import l.w9j;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class snm {

    /* JADX INFO: renamed from: a */
    public static long f7395a = 300;

    /* JADX INFO: renamed from: b */
    public static long f7396b = 20;

    /* JADX INFO: renamed from: e */
    public static c4g0 f7399e;

    /* JADX INFO: renamed from: f */
    public static WeakReference<dd80> f7400f;

    /* JADX INFO: renamed from: c */
    public static j760<String, Object> f7397c = v.b0;

    /* JADX INFO: renamed from: d */
    public static HeartbeatPushInfo f7398d = null;

    /* JADX INFO: renamed from: g */
    public static boolean f7401g = false;

    /* JADX INFO: renamed from: h */
    public static boolean f7402h = false;

    /* JADX INFO: renamed from: i */
    public static boolean f7403i = false;

    /* JADX INFO: renamed from: j */
    public static boolean f7404j = false;

    /* JADX INFO: renamed from: k */
    public static boolean f7405k = false;

    /* JADX INFO: renamed from: l */
    public static boolean f7406l = false;

    /* JADX INFO: renamed from: m */
    public static HashMap<TabName, WeakReference<Object>> f7407m = new HashMap<>();

    /* JADX INFO: renamed from: C */
    public static void m9374C(User user, Act act, final String str, final e30<String> e30Var, final boolean z) {
        final Passby passby = user.location.passby;
        if (!NullChecker.a(passby)) {
            e30Var.call(str);
            return;
        }
        if (NullChecker.a(passby.location) && NullChecker.a(passby.location.coordinates)) {
            DoublePair doublePair = passby.location.coordinates;
            LatLng latLngB = qc2.b(new LatLng(doublePair.first, doublePair.second));
            mjj.c(act, false).e(act, latLngB.latitude, latLngB.longitude, new e30() { // from class: l.onm
                public final void call(Object obj) {
                    snm.m9428u(str, z, passby, e30Var, (d90) obj);
                }
            }, new e30() { // from class: l.pnm
                public final void call(Object obj) {
                    snm.m9400b(str, passby, z, e30Var, (Throwable) obj);
                }
            });
        } else {
            if (passby.count <= 0) {
                e30Var.call(str);
                return;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append("，");
            sb.append(z ? "我们" : "你们");
            sb.append("擦肩而过");
            sb.append(passby.count);
            sb.append("次");
            e30Var.call(sb.toString());
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m9375D(boolean z) {
        m9413h0();
        mkd0.z(f7399e);
        if (z) {
            CoreModule.c.H1.wait("start_heartbeat-match", -1).delay(300L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.inm
                public final void call(Object obj) {
                    snm.m9419l((roj0) obj);
                }
            }, new e30() { // from class: l.jnm
                public final void call(Object obj) {
                    snm.m9433z((Throwable) obj);
                }
            }));
        } else {
            CoreModule.c.H1.c4("search_cancel");
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m9376E(final Act act) {
        final User userP9 = CoreModule.c.e0.p9();
        if (userP9.isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            return false;
        }
        if (ark.m5528F0(act, new Runnable() { // from class: l.qmm
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.g2(act2, 1, false, false, true, (String) null, MediaPickerAct.D, false, true, userP9.gender), 786);
            }
        })) {
            return false;
        }
        if (!userP9.isNameFake()) {
            return true;
        }
        ark.m5556T0(act);
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m9377F(Act act, boolean z, boolean z2, String str, e30<Boolean> e30Var) {
        return m9378G(act, z, z2, str, e30Var, null);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m9378G(Act act, boolean z, final boolean z2, String str, final e30<Boolean> e30Var, e30<String> e30Var2) {
        boolean zE4 = xma.e4();
        boolean zK = swh0.K();
        if (a.I() > 0) {
            return true;
        }
        if (zE4) {
            CoreModule.P().a().pr(act, str, Privilege.online_match_tickets);
            e30Var.call(Boolean.FALSE);
            if (z2 && m9383L()) {
                m9405d0();
                CoreModule.c.H1.w3(KnowMyselfShareParams.TYPE_REPORT, m9387P());
            }
            if (e30Var2 != null) {
                e30Var2.call("showSVIPDialog");
            }
            return false;
        }
        if (zK) {
            if (z || !swh0.p0().g1()) {
                return true;
            }
            swh0.B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.mnm
                public final void call() {
                    snm.m9406e(z2, e30Var);
                }
            }, new d30() { // from class: l.nnm
                public final void call() {
                    snm.m9412h(e30Var);
                }
            });
            return false;
        }
        swh0.u1(act, str, (g30) null, (d30) null);
        e30Var.call(Boolean.FALSE);
        if (z2 && m9383L()) {
            m9405d0();
            CoreModule.c.H1.w3(KnowMyselfShareParams.TYPE_REPORT, m9387P());
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m9379H() {
        return NullChecker.a(f7398d) && !f7398d.isAbandoned();
    }

    /* JADX INFO: renamed from: I */
    public static void m9380I(TabName tabName) {
        CoreModule.c.f0.h0.onNext(xaj0.a("impress_conv_state_default", PushMessageCustom.new_(), -1L));
        OnlineMatchManager.z().I.onNext(v.d0);
        m9381J(tabName);
    }

    /* JADX INFO: renamed from: J */
    public static void m9381J(TabName tabName) {
        m9382K(tabName, true);
    }

    /* JADX INFO: renamed from: K */
    public static void m9382K(TabName tabName, boolean z) {
        if (tabName != TabName.Card) {
            CoreModule.c.m0.A8(VirtualCardType.ImpressSignalCard);
        } else {
            CoreModule.c.f0.h0.onNext(xaj0.a("impress_conv_state_default", PushMessageCustom.new_(), -1L));
            OnlineMatchManager.z().I.onNext(v.d0);
        }
        CoreModule.c.H1.S.onNext(roj0.a);
        HeartbeatPushInfo heartbeatPushInfo = (HeartbeatPushInfo) CoreModule.c.H1.U.e();
        if (NullChecker.a(heartbeatPushInfo)) {
            heartbeatPushInfo.setAbandoned();
            CoreModule.c.H1.U.onNext(heartbeatPushInfo);
        }
        if (z) {
            m9396Y();
        }
        if (NullChecker.a(f7400f) && NullChecker.a(f7400f.get()) && f7400f.get().isShowing()) {
            f7400f.get().dismiss();
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m9383L() {
        if (NullChecker.a(f7398d)) {
            return !f7398d.hasReportDlg();
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static long m9384M(TabName tabName) {
        return tabName == TabName.Moment ? f7396b : f7395a;
    }

    /* JADX INFO: renamed from: N */
    public static int m9385N() {
        return 2;
    }

    /* JADX INFO: renamed from: O */
    public static HeartbeatPushInfo m9386O() {
        return f7398d;
    }

    /* JADX INFO: renamed from: P */
    public static String m9387P() {
        return NullChecker.a(f7398d) ? f7398d.pushMessage.tracker : "";
    }

    /* JADX INFO: renamed from: Q */
    public static int m9388Q() {
        if (NullChecker.a(f7398d) && NullChecker.a(f7398d.pushMessage)) {
            return m9390S(f7398d.pushMessage.tracker);
        }
        return 1;
    }

    /* JADX INFO: renamed from: R */
    public static String m9389R(TabName tabName) {
        if (tabName == TabName.Card) {
            return "p_suggest_users_home_view";
        }
        if (tabName == TabName.Me) {
            return "p_navigation_view";
        }
        return tabName == TabName.Moment ? "p_nearby" : "p_messages_view";
    }

    /* JADX INFO: renamed from: S */
    public static int m9390S(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.endsWith("scheduledTask")) {
                return 2;
            }
            if (!str.endsWith("userTrigger") && str.endsWith("tagFill")) {
                return 3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: T */
    public static int m9391T() {
        return 3;
    }

    /* JADX INFO: renamed from: U */
    public static List<Tag> m9392U(User user) {
        if (user == null || !NullChecker.a(user.profile) || vwb.J(user.profile.tags)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        ArrayList<Tag> arrayListN = vwb.n(user.profile.tags, new w9j() { // from class: l.smm
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.music, tag.category) || TextUtils.equals(ProfileLikeCategoryType.sports, tag.category) || TextUtils.equals(ProfileLikeCategoryType.food, tag.category) || TextUtils.equals(ProfileLikeCategoryType.movies, tag.category) || TextUtils.equals("literature", tag.category));
            }
        });
        if (vwb.J(arrayListN)) {
            return null;
        }
        User userP9 = CoreModule.c.e0.p9();
        for (Tag tag : arrayListN) {
            if (userP9.profile.tags.contains(tag)) {
                arrayList2.add(tag);
            } else {
                arrayList3.add(tag);
            }
        }
        if (!vwb.J(arrayList2)) {
            arrayList.addAll(vwb.n(arrayList2, new w9j() { // from class: l.umm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.sports, ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.n(arrayList2, new w9j() { // from class: l.vmm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.movies, ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.n(arrayList2, new w9j() { // from class: l.wmm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.n(arrayList2, new w9j() { // from class: l.xmm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.food, ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.n(arrayList2, new w9j() { // from class: l.ymm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.music, ((Tag) obj).category));
                }
            }));
        }
        if (!vwb.J(arrayList3)) {
            arrayList.addAll(vwb.n(arrayList3, new w9j() { // from class: l.zmm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.sports, ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.n(arrayList3, new w9j() { // from class: l.anm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.movies, ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.n(arrayList3, new w9j() { // from class: l.cnm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.n(arrayList3, new w9j() { // from class: l.dnm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.food, ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.n(arrayList3, new w9j() { // from class: l.tmm
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(ProfileLikeCategoryType.music, ((Tag) obj).category));
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m9393V(PartialListOpt<CoreSuggested.UserInfo> partialListOpt) {
        return (partialListOpt == null || vwb.J(partialListOpt.loaded) || !partialListOpt.loaded.get(0).isImpressSignal()) ? false : true;
    }

    /* JADX INFO: renamed from: W */
    public static void m9394W(long j) {
        if (!OnlineMatchManager.z().J()) {
            OnlineMatchManager.z().X("matching", OnlineMatchManager.QuickChatProduce.Heartbeat);
        }
        CoreModule.c.t1.u("heartbeat_search_timeout");
        mkd0.z(f7399e);
        if (j <= 0) {
            return;
        }
        c0.a aVar = new c0.a();
        aVar.c(mqi0.o()).f(mqi0.o() + (j * 1000)).a(true).e(true).g("heartbeat_search_timeout");
        CoreModule.c.t1.r(aVar);
        f7399e = CoreModule.c.t1.m("heartbeat_search_timeout").subscribe(new e30() { // from class: l.gnm
            public final void call(Object obj) {
                snm.m9430w((c0.b) obj);
            }
        }, new e30() { // from class: l.hnm
            public final void call(Object obj) {
                snm.m9410g((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static void m9395X(PushMessageCustom pushMessageCustom) {
        hfw.a("ImpressSignalHelperOpt", "收到了长链：" + pushMessageCustom.userId + "," + pushMessageCustom.noRecommended + "," + pushMessageCustom.triggeredUserId);
        CoreModule.c.H1.X3(pushMessageCustom, false, true);
    }

    /* JADX INFO: renamed from: Y */
    public static void m9396Y() {
        f7397c = v.b0;
        f7398d = null;
        CoreModule.c.t1.u("heartbeat_search_timeout");
        mkd0.z(f7399e);
    }

    /* JADX INFO: renamed from: Z */
    public static void m9397Z(boolean z) {
        f7406l = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9398a(Envelope envelope) {
    }

    /* JADX INFO: renamed from: a0 */
    public static void m9399a0(User user, Act act, boolean z, e30<String> e30Var) {
        String str = user.description;
        if (!TextUtils.isEmpty(str)) {
            m9374C(user, act, "\"" + str + "\"", e30Var, false);
            return;
        }
        String str2 = user.profile.hangouts;
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(user.isFemale() ? "她" : "他");
            sb.append("经常去");
            sb.append(str2);
            m9374C(user, act, sb.toString(), e30Var, false);
            return;
        }
        List<Tag> listM9392U = m9392U(user);
        if (vwb.J(listM9392U)) {
            m9374C(user, act, user.isFemale() ? "她正在等你聊天" : "他正在等你聊天", e30Var, false);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(user.isFemale() ? "她" : "他");
        sb2.append("喜欢");
        sb2.append(m9417j0(listM9392U));
        m9374C(user, act, sb2.toString(), e30Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9400b(String str, Passby passby, boolean z, e30 e30Var, Throwable th) {
        App.d.k(th);
        StringBuilder sb = new StringBuilder(str);
        if (passby.count > 0) {
            sb.append("，");
            sb.append(z ? "我们" : "你们");
            sb.append("擦肩而过");
            sb.append(passby.count);
            sb.append("次");
        }
        e30Var.call(sb.toString());
    }

    /* JADX INFO: renamed from: b0 */
    public static void m9401b0(HeartbeatPushInfo heartbeatPushInfo) {
        f7398d = heartbeatPushInfo;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9402c(e30 e30Var, TabName tabName) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
        zvf0.r("e_funchat_suggestion_no", m9389R(tabName));
    }

    /* JADX INFO: renamed from: c0 */
    public static void m9403c0(User user, VText vText) {
        StringBuilder sb = new StringBuilder();
        if (!CoreModule.c.E0.B3(user) && NullChecker.a(user.location)) {
            sb.append(i0g0.Y(user.location));
        }
        if (NullChecker.a(user.profile) && NullChecker.a(user.profile.zodiac)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(i0g0.j0(user.profile.zodiac));
        }
        if (user.age.intValue() > 0 && !CoreModule.c.E0.z3(user)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(user.age);
            sb.append("岁");
        }
        xdl0.H0(vText, sb.toString());
    }

    /* JADX INFO: renamed from: d0 */
    public static void m9405d0() {
        if (NullChecker.a(f7398d)) {
            f7398d.setSvipDlgShow();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m9406e(boolean z, e30 e30Var) {
        if (m9379H() || !z) {
            swh0.p0().W0();
            if (NullChecker.a(e30Var)) {
                e30Var.call(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m9407e0(User user) {
        return !vwb.J(user.pictures) && user.pictures.size() >= 3;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m9408f(Act act, Boolean bool) {
        if (bool.booleanValue() && m9376E(act)) {
            CoreModule.c.H1.g4().subscribe(mkd0.H(new e30() { // from class: l.enm
                public final void call(Object obj) {
                    snm.m9416j((Envelope) obj);
                }
            }, new e30() { // from class: l.fnm
                public final void call(Object obj) {
                    snm.m9420m((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m9409f0(Act act, final TabName tabName, final e30<Boolean> e30Var) {
        if (CoreModule.Q().isLiving()) {
            return;
        }
        dd80.a aVarNewDialog = act.newDialog();
        String str = m9385N() + "次";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("每天有" + str + "免费次数可使用心动信号。本次使用将消耗1次次数");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(act.getResources().getColor(w0c0.I)), 3, str.length() + 3, 33);
        int length = str.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(act.getResources().getColor(w0c0.I)), length + 22, length + 24, 33);
        dd80 dd80VarR0 = aVarNewDialog.S(x2c0.b8).y0("功能全新升级").t0(spannableStringBuilder).P(false).c0("同意并聊天", new Runnable() { // from class: l.bnm
            @Override // java.lang.Runnable
            public final void run() {
                snm.m9431x(e30Var, tabName);
            }
        }).X("不同意", new Runnable() { // from class: l.knm
            @Override // java.lang.Runnable
            public final void run() {
                snm.m9402c(e30Var, tabName);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.lnm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                snm.f7400f = null;
            }
        }).r0();
        zvf0.x("e_funchat_suggestion_yes", m9389R(tabName));
        f7400f = new WeakReference<>(dd80VarR0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m9410g(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static void m9411g0(final Act act) {
        if (m9376E(act)) {
            if (!Network.isConnected(act)) {
                lsi0.i(R.string.p4, true);
            } else if (m9377F(act, false, false, "p_quickchat,funchat", new e30() { // from class: l.qnm
                public final void call(Object obj) {
                    snm.m9408f(act, (Boolean) obj);
                }
            })) {
                CoreModule.c.H1.g4().subscribe(mkd0.H(new e30() { // from class: l.rnm
                    public final void call(Object obj) {
                        snm.m9398a((Envelope) obj);
                    }
                }, new e30() { // from class: l.rmm
                    public final void call(Object obj) {
                        snm.m9422o((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m9412h(e30 e30Var) {
        sqb0.O().I();
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m9413h0() {
        if (OnlineMatchManager.z().J()) {
            OnlineMatchManager.z().X("default", OnlineMatchManager.QuickChatProduce.Heartbeat);
            OnlineMatchManager.z().I.onNext(j760.a("notify_normal_state", (Object) null));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m9415i0() {
        if (OnlineMatchManager.z().J()) {
            return;
        }
        OnlineMatchManager.z().X("matching", OnlineMatchManager.QuickChatProduce.Heartbeat);
        OnlineMatchManager.z().I.onNext(j760.a("notify_search", (Object) null));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m9416j(Envelope envelope) {
    }

    /* JADX INFO: renamed from: j0 */
    public static String m9417j0(List<Tag> list) {
        if (vwb.J(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(list.size() - 1, 2);
        for (int i = 0; i <= iMin; i++) {
            sb.append(list.get(i).value);
            if (i < iMin) {
                sb.append("、");
            }
        }
        if (list.size() > 3) {
            sb.append("等");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m9419l(roj0 roj0Var) {
        if (CoreModule.c.H1.L3()) {
            w29 w29Var = CoreModule.c.H1;
            w29Var.w3("cancel", w29Var.F3());
            CoreModule.c.H1.c4("search_cancel");
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m9420m(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m9422o(Throwable th) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m9428u(String str, boolean z, Passby passby, e30 e30Var, d90 d90Var) {
        String str2 = (TextUtils.isEmpty(d90Var.b()) ? "" : d90Var.b()) + (TextUtils.isEmpty(d90Var.c()) ? "" : d90Var.c()) + (TextUtils.isEmpty(d90Var.f()) ? "" : d90Var.f());
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append("，");
            sb.append(z ? "我们" : "你们");
            sb.append("曾经在");
            sb.append(str2);
            sb.append("擦肩而过");
        } else if (passby.count > 0) {
            sb.append("，");
            sb.append(z ? "我们" : "你们");
            sb.append("擦肩而过");
            sb.append(passby.count);
            sb.append("次");
        }
        e30Var.call(sb.toString());
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m9430w(c0.b bVar) {
        CoreModule.c.H1.e4();
        m9375D(false);
        mkd0.z(f7399e);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m9431x(e30 e30Var, TabName tabName) {
        if (m9379H()) {
            hpd0 hpd0Var = CoreModule.c.H1.X;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            if (NullChecker.a(e30Var)) {
                e30Var.call(bool);
            }
            zvf0.r("e_funchat_suggestion_yes", m9389R(tabName));
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m9433z(Throwable th) {
    }
}
