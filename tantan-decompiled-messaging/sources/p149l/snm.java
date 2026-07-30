package p149l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.baidu.mapapi.model.LatLng;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Passby;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class snm {

    /* JADX INFO: renamed from: a */
    public static long f165461a = 300;

    /* JADX INFO: renamed from: b */
    public static long f165462b = 20;

    /* JADX INFO: renamed from: e */
    public static c4g0 f165465e;

    /* JADX INFO: renamed from: f */
    public static WeakReference<dd80> f165466f;

    /* JADX INFO: renamed from: c */
    public static j760<String, Object> f165463c = C4756v.f20124b0;

    /* JADX INFO: renamed from: d */
    public static HeartbeatPushInfo f165464d = null;

    /* JADX INFO: renamed from: g */
    public static boolean f165467g = false;

    /* JADX INFO: renamed from: h */
    public static boolean f165468h = false;

    /* JADX INFO: renamed from: i */
    public static boolean f165469i = false;

    /* JADX INFO: renamed from: j */
    public static boolean f165470j = false;

    /* JADX INFO: renamed from: k */
    public static boolean f165471k = false;

    /* JADX INFO: renamed from: l */
    public static boolean f165472l = false;

    /* JADX INFO: renamed from: m */
    public static HashMap<TabName, WeakReference<Object>> f165473m = new HashMap<>();

    /* JADX INFO: renamed from: C */
    public static void m185072C(User user, Act act, final String str, final e30<String> e30Var, final boolean z) {
        final Passby passby = user.location.passby;
        if (!NullChecker.m81303a(passby)) {
            e30Var.call(str);
            return;
        }
        if (NullChecker.m81303a(passby.location) && NullChecker.m81303a(passby.location.coordinates)) {
            DoublePair doublePair = passby.location.coordinates;
            LatLng latLngM173860b = qc2.m173860b(new LatLng(doublePair.first, doublePair.second));
            mjj.m154842c(act, false).m154844e(act, latLngM173860b.latitude, latLngM173860b.longitude, new e30() { // from class: l.onm
                @Override // p149l.e30
                public final void call(Object obj) {
                    snm.m185126u(str, z, passby, e30Var, (d90) obj);
                }
            }, new e30() { // from class: l.pnm
                @Override // p149l.e30
                public final void call(Object obj) {
                    snm.m185098b(str, passby, z, e30Var, (Throwable) obj);
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
    public static void m185073D(boolean z) {
        m185111h0();
        mkd0.m154992z(f165465e);
        if (z) {
            CoreModule.f17545c.f19571H1.wait("start_heartbeat-match", -1).delay(300L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.inm
                @Override // p149l.e30
                public final void call(Object obj) {
                    snm.m185117l((roj0) obj);
                }
            }, new e30() { // from class: l.jnm
                @Override // p149l.e30
                public final void call(Object obj) {
                    snm.m185131z((Throwable) obj);
                }
            }));
        } else {
            CoreModule.f17545c.f19571H1.m201070c4("search_cancel");
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m185074E(final Act act) {
        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            return false;
        }
        if (ark.m98421F0(act, new Runnable() { // from class: l.qmm
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m47785g2(act2, 1, false, false, true, null, MediaPickerAct.f30623D, false, true, userM169527p9.gender), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            return false;
        }
        if (!userM169527p9.isNameFake()) {
            return true;
        }
        ark.m98449T0(act);
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m185075F(Act act, boolean z, boolean z2, String str, e30<Boolean> e30Var) {
        return m185076G(act, z, z2, str, e30Var, null);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m185076G(Act act, boolean z, final boolean z2, String str, final e30<Boolean> e30Var, e30<String> e30Var2) {
        boolean zM210071e4 = xma.m210071e4();
        boolean zM186201K = swh0.m186201K();
        if (C8609a.m50225I() > 0) {
            return true;
        }
        if (zM210071e4) {
            CoreModule.m29935P().m94651a().mo33565pr(act, str, Privilege.online_match_tickets);
            e30Var.call(Boolean.FALSE);
            if (z2 && m185081L()) {
                m185103d0();
                CoreModule.f17545c.f19571H1.m201077w3("report", m185085P());
            }
            if (e30Var2 != null) {
                e30Var2.call("showSVIPDialog");
            }
            return false;
        }
        if (zM186201K) {
            if (z || !swh0.m186255p0().m186313g1()) {
                return true;
            }
            swh0.m186180B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.mnm
                @Override // p149l.d30
                public final void call() {
                    snm.m185104e(z2, e30Var);
                }
            }, new d30() { // from class: l.nnm
                @Override // p149l.d30
                public final void call() {
                    snm.m185110h(e30Var);
                }
            });
            return false;
        }
        swh0.m186268u1(act, str, null, null);
        e30Var.call(Boolean.FALSE);
        if (z2 && m185081L()) {
            m185103d0();
            CoreModule.f17545c.f19571H1.m201077w3("report", m185085P());
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m185077H() {
        return NullChecker.m81303a(f165464d) && !f165464d.isAbandoned();
    }

    /* JADX INFO: renamed from: I */
    public static void m185078I(TabName tabName) {
        CoreModule.f17545c.f19642f0.f19940h0.onNext(xaj0.m207578a("impress_conv_state_default", PushMessageCustom.new_(), -1L));
        OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20126d0);
        m185079J(tabName);
    }

    /* JADX INFO: renamed from: J */
    public static void m185079J(TabName tabName) {
        m185080K(tabName, true);
    }

    /* JADX INFO: renamed from: K */
    public static void m185080K(TabName tabName, boolean z) {
        if (tabName != TabName.Card) {
            CoreModule.f17545c.f19663m0.m30978A8(VirtualCardType.ImpressSignalCard);
        } else {
            CoreModule.f17545c.f19642f0.f19940h0.onNext(xaj0.m207578a("impress_conv_state_default", PushMessageCustom.new_(), -1L));
            OnlineMatchManager.m50143z().f32594I.onNext(C4756v.f20126d0);
        }
        CoreModule.f17545c.f19571H1.f184099S.onNext(roj0.f160388a);
        HeartbeatPushInfo heartbeatPushInfoM221515e = CoreModule.f17545c.f19571H1.f184101U.m221515e();
        if (NullChecker.m81303a(heartbeatPushInfoM221515e)) {
            heartbeatPushInfoM221515e.setAbandoned();
            CoreModule.f17545c.f19571H1.f184101U.onNext(heartbeatPushInfoM221515e);
        }
        if (z) {
            m185094Y();
        }
        if (NullChecker.m81303a(f165466f) && NullChecker.m81303a(f165466f.get()) && f165466f.get().isShowing()) {
            f165466f.get().dismiss();
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m185081L() {
        if (NullChecker.m81303a(f165464d)) {
            return !f165464d.hasReportDlg();
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static long m185082M(TabName tabName) {
        return tabName == TabName.Moment ? f165462b : f165461a;
    }

    /* JADX INFO: renamed from: N */
    public static int m185083N() {
        return 2;
    }

    /* JADX INFO: renamed from: O */
    public static HeartbeatPushInfo m185084O() {
        return f165464d;
    }

    /* JADX INFO: renamed from: P */
    public static String m185085P() {
        return NullChecker.m81303a(f165464d) ? f165464d.pushMessage.tracker : "";
    }

    /* JADX INFO: renamed from: Q */
    public static int m185086Q() {
        if (NullChecker.m81303a(f165464d) && NullChecker.m81303a(f165464d.pushMessage)) {
            return m185088S(f165464d.pushMessage.tracker);
        }
        return 1;
    }

    /* JADX INFO: renamed from: R */
    public static String m185087R(TabName tabName) {
        if (tabName == TabName.Card) {
            return "p_suggest_users_home_view";
        }
        if (tabName == TabName.Me) {
            return OMSDialogPositon.p_navigation_view;
        }
        return tabName == TabName.Moment ? OMSDialogPositon.p_nearby : OMSDialogPositon.p_messages_view;
    }

    /* JADX INFO: renamed from: S */
    public static int m185088S(String str) {
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
    public static int m185089T() {
        return 3;
    }

    /* JADX INFO: renamed from: U */
    public static List<Tag> m185090U(User user) {
        if (user == null || !NullChecker.m81303a(user.profile) || vwb.m200296J(user.profile.tags)) {
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
        ArrayList<Tag> arrayListM200339n = vwb.m200339n(user.profile.tags, new w9j() { // from class: l.smm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(TextUtils.equals("music", tag.category) || TextUtils.equals("sports", tag.category) || TextUtils.equals("food", tag.category) || TextUtils.equals("movies", tag.category) || TextUtils.equals("literature", tag.category));
            }
        });
        if (vwb.m200296J(arrayListM200339n)) {
            return null;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        for (Tag tag : arrayListM200339n) {
            if (userM169527p9.profile.tags.contains(tag)) {
                arrayList2.add(tag);
            } else {
                arrayList3.add(tag);
            }
        }
        if (!vwb.m200296J(arrayList2)) {
            arrayList.addAll(vwb.m200339n(arrayList2, new w9j() { // from class: l.umm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.m200339n(arrayList2, new w9j() { // from class: l.vmm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("movies", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.m200339n(arrayList2, new w9j() { // from class: l.wmm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.m200339n(arrayList2, new w9j() { // from class: l.xmm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("food", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.m200339n(arrayList2, new w9j() { // from class: l.ymm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
                }
            }));
        }
        if (!vwb.m200296J(arrayList3)) {
            arrayList.addAll(vwb.m200339n(arrayList3, new w9j() { // from class: l.zmm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.m200339n(arrayList3, new w9j() { // from class: l.anm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("movies", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.m200339n(arrayList3, new w9j() { // from class: l.cnm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.m200339n(arrayList3, new w9j() { // from class: l.dnm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("food", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(vwb.m200339n(arrayList3, new w9j() { // from class: l.tmm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m185091V(PartialListOpt<CoreSuggested.UserInfo> partialListOpt) {
        return (partialListOpt == null || vwb.m200296J(partialListOpt.loaded) || !partialListOpt.loaded.get(0).isImpressSignal()) ? false : true;
    }

    /* JADX INFO: renamed from: W */
    public static void m185092W(long j) {
        if (!OnlineMatchManager.m50143z().m50153J()) {
            OnlineMatchManager.m50143z().m50167X("matching", OnlineMatchManager.QuickChatProduce.Heartbeat);
        }
        CoreModule.f17545c.f19685t1.m31516u("heartbeat_search_timeout");
        mkd0.m154992z(f165465e);
        if (j <= 0) {
            return;
        }
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31519c(mqi0.m155944o()).m31522f(mqi0.m155944o() + (j * 1000)).m31517a(true).m31521e(true).m31523g("heartbeat_search_timeout");
        CoreModule.f17545c.f19685t1.m31513r(aVar);
        f165465e = CoreModule.f17545c.f19685t1.m31508m("heartbeat_search_timeout").subscribe(new e30() { // from class: l.gnm
            @Override // p149l.e30
            public final void call(Object obj) {
                snm.m185128w((RunnableC4733c0.b) obj);
            }
        }, new e30() { // from class: l.hnm
            @Override // p149l.e30
            public final void call(Object obj) {
                snm.m185108g((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static void m185093X(PushMessageCustom pushMessageCustom) {
        hfw.m130790a("ImpressSignalHelperOpt", "收到了长链：" + pushMessageCustom.userId + Constants.SEPARATOR_COMMA + pushMessageCustom.noRecommended + Constants.SEPARATOR_COMMA + pushMessageCustom.triggeredUserId);
        CoreModule.f17545c.f19571H1.m201065X3(pushMessageCustom, false, true);
    }

    /* JADX INFO: renamed from: Y */
    public static void m185094Y() {
        f165463c = C4756v.f20124b0;
        f165464d = null;
        CoreModule.f17545c.f19685t1.m31516u("heartbeat_search_timeout");
        mkd0.m154992z(f165465e);
    }

    /* JADX INFO: renamed from: Z */
    public static void m185095Z(boolean z) {
        f165472l = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m185096a(Envelope envelope) {
    }

    /* JADX INFO: renamed from: a0 */
    public static void m185097a0(User user, Act act, boolean z, e30<String> e30Var) {
        String str = user.description;
        if (!TextUtils.isEmpty(str)) {
            m185072C(user, act, "\"" + str + "\"", e30Var, false);
            return;
        }
        String str2 = user.profile.hangouts;
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(user.isFemale() ? "她" : "他");
            sb.append("经常去");
            sb.append(str2);
            m185072C(user, act, sb.toString(), e30Var, false);
            return;
        }
        List<Tag> listM185090U = m185090U(user);
        if (vwb.m200296J(listM185090U)) {
            m185072C(user, act, user.isFemale() ? "她正在等你聊天" : "他正在等你聊天", e30Var, false);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(user.isFemale() ? "她" : "他");
        sb2.append("喜欢");
        sb2.append(m185115j0(listM185090U));
        m185072C(user, act, sb2.toString(), e30Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m185098b(String str, Passby passby, boolean z, e30 e30Var, Throwable th) {
        App.f15368d.m20433k(th);
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
    public static void m185099b0(HeartbeatPushInfo heartbeatPushInfo) {
        f165464d = heartbeatPushInfo;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m185100c(e30 e30Var, TabName tabName) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
        zvf0.m220396r("e_funchat_suggestion_no", m185087R(tabName));
    }

    /* JADX INFO: renamed from: c0 */
    public static void m185101c0(User user, VText vText) {
        StringBuilder sb = new StringBuilder();
        if (!CoreModule.f17545c.f19561E0.m203772B3(user) && NullChecker.m81303a(user.location)) {
            sb.append(i0g0.m133858Y(user.location));
        }
        if (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.zodiac)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(i0g0.m133869j0(user.profile.zodiac));
        }
        if (user.age.intValue() > 0 && !CoreModule.f17545c.f19561E0.m203803z3(user)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(user.age);
            sb.append("岁");
        }
        xdl0.m208335H0(vText, sb.toString());
    }

    /* JADX INFO: renamed from: d0 */
    public static void m185103d0() {
        if (NullChecker.m81303a(f165464d)) {
            f165464d.setSvipDlgShow();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m185104e(boolean z, e30 e30Var) {
        if (m185077H() || !z) {
            swh0.m186255p0().m186303W0();
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m185105e0(User user) {
        return !vwb.m200296J(user.pictures) && user.pictures.size() >= 3;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m185106f(Act act, Boolean bool) {
        if (bool.booleanValue() && m185074E(act)) {
            CoreModule.f17545c.f19571H1.m201074g4().subscribe(mkd0.m154956H(new e30() { // from class: l.enm
                @Override // p149l.e30
                public final void call(Object obj) {
                    snm.m185114j((Envelope) obj);
                }
            }, new e30() { // from class: l.fnm
                @Override // p149l.e30
                public final void call(Object obj) {
                    snm.m185118m((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m185107f0(Act act, final TabName tabName, final e30<Boolean> e30Var) {
        if (CoreModule.m29936Q().isLiving()) {
            return;
        }
        dd80.C16336a c16336aNewDialog = act.newDialog();
        String str = m185083N() + "次";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("每天有" + str + "免费次数可使用心动信号。本次使用将消耗1次次数");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(act.getResources().getColor(w0c0.f183773I)), 3, str.length() + 3, 33);
        int length = str.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(act.getResources().getColor(w0c0.f183773I)), length + 22, length + 24, 33);
        dd80 dd80VarM110989r0 = c16336aNewDialog.m110964S(x2c0.f190006b8).m110996y0("功能全新升级").m110991t0(spannableStringBuilder).m110961P(false).m110974c0("同意并聊天", new Runnable() { // from class: l.bnm
            @Override // java.lang.Runnable
            public final void run() {
                snm.m185129x(e30Var, tabName);
            }
        }).m110969X("不同意", new Runnable() { // from class: l.knm
            @Override // java.lang.Runnable
            public final void run() {
                snm.m185100c(e30Var, tabName);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.lnm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                snm.f165466f = null;
            }
        }).m110989r0();
        zvf0.m220402x("e_funchat_suggestion_yes", m185087R(tabName));
        f165466f = new WeakReference<>(dd80VarM110989r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m185108g(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static void m185109g0(final Act act) {
        if (m185074E(act)) {
            if (!Network.isConnected(act)) {
                lsi0.m151579i(R$string.f18813p4, true);
            } else if (m185075F(act, false, false, "p_quickchat,funchat", new e30() { // from class: l.qnm
                @Override // p149l.e30
                public final void call(Object obj) {
                    snm.m185106f(act, (Boolean) obj);
                }
            })) {
                CoreModule.f17545c.f19571H1.m201074g4().subscribe(mkd0.m154956H(new e30() { // from class: l.rnm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        snm.m185096a((Envelope) obj);
                    }
                }, new e30() { // from class: l.rmm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        snm.m185120o((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m185110h(e30 e30Var) {
        sqb0.m185498O().m185543I();
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m185111h0() {
        if (OnlineMatchManager.m50143z().m50153J()) {
            OnlineMatchManager.m50143z().m50167X("default", OnlineMatchManager.QuickChatProduce.Heartbeat);
            OnlineMatchManager.m50143z().f32594I.onNext(j760.m140076a("notify_normal_state", null));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m185113i0() {
        if (OnlineMatchManager.m50143z().m50153J()) {
            return;
        }
        OnlineMatchManager.m50143z().m50167X("matching", OnlineMatchManager.QuickChatProduce.Heartbeat);
        OnlineMatchManager.m50143z().f32594I.onNext(j760.m140076a("notify_search", null));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m185114j(Envelope envelope) {
    }

    /* JADX INFO: renamed from: j0 */
    public static String m185115j0(List<Tag> list) {
        if (vwb.m200296J(list)) {
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
    public static /* synthetic */ void m185117l(roj0 roj0Var) {
        if (CoreModule.f17545c.f19571H1.m201053L3()) {
            w29 w29Var = CoreModule.f17545c.f19571H1;
            w29Var.m201077w3("cancel", w29Var.m201047F3());
            CoreModule.f17545c.f19571H1.m201070c4("search_cancel");
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m185118m(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m185120o(Throwable th) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m185126u(String str, boolean z, Passby passby, e30 e30Var, d90 d90Var) {
        String str2 = (TextUtils.isEmpty(d90Var.mo110405b()) ? "" : d90Var.mo110405b()) + (TextUtils.isEmpty(d90Var.mo110406c()) ? "" : d90Var.mo110406c()) + (TextUtils.isEmpty(d90Var.mo110409f()) ? "" : d90Var.mo110409f());
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
    public static /* synthetic */ void m185128w(RunnableC4733c0.b bVar) {
        CoreModule.f17545c.f19571H1.m201072e4();
        m185073D(false);
        mkd0.m154992z(f165465e);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m185129x(e30 e30Var, TabName tabName) {
        if (m185077H()) {
            hpd0 hpd0Var = CoreModule.f17545c.f19571H1.f184104X;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(bool);
            }
            zvf0.m220396r("e_funchat_suggestion_yes", m185087R(tabName));
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m185131z(Throwable th) {
    }
}
