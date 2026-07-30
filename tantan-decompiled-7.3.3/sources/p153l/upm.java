package p153l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.baidu.mapapi.model.LatLng;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Passby;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class upm {

    /* JADX INFO: renamed from: a */
    public static long f180284a = 300;

    /* JADX INFO: renamed from: b */
    public static long f180285b = 20;

    /* JADX INFO: renamed from: e */
    public static kcg0 f180288e;

    /* JADX INFO: renamed from: f */
    public static WeakReference<jl80> f180289f;

    /* JADX INFO: renamed from: c */
    public static pf60<String, Object> f180286c = C4907v.f20866b0;

    /* JADX INFO: renamed from: d */
    public static HeartbeatPushInfo f180287d = null;

    /* JADX INFO: renamed from: g */
    public static boolean f180290g = false;

    /* JADX INFO: renamed from: h */
    public static boolean f180291h = false;

    /* JADX INFO: renamed from: i */
    public static boolean f180292i = false;

    /* JADX INFO: renamed from: j */
    public static boolean f180293j = false;

    /* JADX INFO: renamed from: k */
    public static boolean f180294k = false;

    /* JADX INFO: renamed from: l */
    public static boolean f180295l = false;

    /* JADX INFO: renamed from: m */
    public static HashMap<TabName, WeakReference<Object>> f180296m = new HashMap<>();

    /* JADX INFO: renamed from: C */
    public static void m197106C(User user, Act act, final String str, final y20<String> y20Var, final boolean z) {
        final Passby passby = user.location.passby;
        if (!NullChecker.m82486a(passby)) {
            y20Var.call(str);
            return;
        }
        if (NullChecker.m82486a(passby.location) && NullChecker.m82486a(passby.location.coordinates)) {
            DoublePair doublePair = passby.location.coordinates;
            LatLng latLngM210088b = xc2.m210088b(new LatLng(doublePair.first, doublePair.second));
            fmj.m126236c(act, false).m126239e(act, latLngM210088b.latitude, latLngM210088b.longitude, new y20() { // from class: l.qpm
                @Override // p153l.y20
                public final void call(Object obj) {
                    upm.m197160u(str, z, passby, y20Var, (z80) obj);
                }
            }, new y20() { // from class: l.rpm
                @Override // p153l.y20
                public final void call(Object obj) {
                    upm.m197132b(str, passby, z, y20Var, (Throwable) obj);
                }
            });
        } else {
            if (passby.count <= 0) {
                y20Var.call(str);
                return;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append("，");
            sb.append(z ? "我们" : "你们");
            sb.append("擦肩而过");
            sb.append(passby.count);
            sb.append("次");
            y20Var.call(sb.toString());
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m197107D(boolean z) {
        m197145h0();
        psd0.m173633z(f180288e);
        if (z) {
            CoreModule.f18264c.f20313H1.wait("start_heartbeat-match", -1).delay(300L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.kpm
                @Override // p153l.y20
                public final void call(Object obj) {
                    upm.m197151l((uxj0) obj);
                }
            }, new y20() { // from class: l.lpm
                @Override // p153l.y20
                public final void call(Object obj) {
                    upm.m197165z((Throwable) obj);
                }
            }));
        } else {
            CoreModule.f18264c.f20313H1.m123923c4("search_cancel");
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m197108E(final Act act) {
        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            return false;
        }
        if (qtk.m177971F0(act, new Runnable() { // from class: l.som
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                act2.startActivityForResult(MediaPickerAct.m48968h2(act2, 1, false, false, true, null, MediaPickerAct.f31471D, false, true, userM116600p9.gender), PutongAct.REQUEST_CODE_PICKER);
            }
        })) {
            return false;
        }
        if (!userM116600p9.isNameFake()) {
            return true;
        }
        qtk.m177999T0(act);
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m197109F(Act act, boolean z, boolean z2, String str, y20<Boolean> y20Var) {
        return m197110G(act, z, z2, str, y20Var, null);
    }

    /* JADX INFO: renamed from: G */
    public static boolean m197110G(Act act, boolean z, final boolean z2, String str, final y20<Boolean> y20Var, y20<String> y20Var2) {
        boolean zM146386f4 = joa.m146386f4();
        boolean zM96106K = a5i0.m96106K();
        if (C8772a.m51408I() > 0) {
            return true;
        }
        if (zM146386f4) {
            CoreModule.m30933P().m143405a().mo34568pr(act, str, Privilege.online_match_tickets);
            y20Var.call(Boolean.FALSE);
            if (z2 && m197115L()) {
                m197137d0();
                CoreModule.f18264c.f20313H1.m123930w3("report", m197119P());
            }
            if (y20Var2 != null) {
                y20Var2.call("showSVIPDialog");
            }
            return false;
        }
        if (zM96106K) {
            if (z || !a5i0.m96160p0().m96218g1()) {
                return true;
            }
            a5i0.m96085B1(act, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new x20() { // from class: l.opm
                @Override // p153l.x20
                public final void call() {
                    upm.m197138e(z2, y20Var);
                }
            }, new x20() { // from class: l.ppm
                @Override // p153l.x20
                public final void call() {
                    upm.m197144h(y20Var);
                }
            });
            return false;
        }
        a5i0.m96173u1(act, str, null, null);
        y20Var.call(Boolean.FALSE);
        if (z2 && m197115L()) {
            m197137d0();
            CoreModule.f18264c.f20313H1.m123930w3("report", m197119P());
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m197111H() {
        return NullChecker.m82486a(f180287d) && !f180287d.isAbandoned();
    }

    /* JADX INFO: renamed from: I */
    public static void m197112I(TabName tabName) {
        CoreModule.f18264c.f20384f0.f20682h0.onNext(bkj0.m104818a("impress_conv_state_default", PushMessageCustom.new_(), -1L));
        OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20868d0);
        m197113J(tabName);
    }

    /* JADX INFO: renamed from: J */
    public static void m197113J(TabName tabName) {
        m197114K(tabName, true);
    }

    /* JADX INFO: renamed from: K */
    public static void m197114K(TabName tabName, boolean z) {
        if (tabName != TabName.Card) {
            CoreModule.f18264c.f20405m0.m31981A8(VirtualCardType.ImpressSignalCard);
        } else {
            CoreModule.f18264c.f20384f0.f20682h0.onNext(bkj0.m104818a("impress_conv_state_default", PushMessageCustom.new_(), -1L));
            OnlineMatchManager.m51326z().f33442I.onNext(C4907v.f20868d0);
        }
        CoreModule.f18264c.f20313H1.f97065S.onNext(uxj0.f181467a);
        HeartbeatPushInfo heartbeatPushInfoM222761e = CoreModule.f18264c.f20313H1.f97067U.m222761e();
        if (NullChecker.m82486a(heartbeatPushInfoM222761e)) {
            heartbeatPushInfoM222761e.setAbandoned();
            CoreModule.f18264c.f20313H1.f97067U.onNext(heartbeatPushInfoM222761e);
        }
        if (z) {
            m197128Y();
        }
        if (NullChecker.m82486a(f180289f) && NullChecker.m82486a(f180289f.get()) && f180289f.get().isShowing()) {
            f180289f.get().dismiss();
        }
    }

    /* JADX INFO: renamed from: L */
    public static boolean m197115L() {
        if (NullChecker.m82486a(f180287d)) {
            return !f180287d.hasReportDlg();
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static long m197116M(TabName tabName) {
        return tabName == TabName.Moment ? f180285b : f180284a;
    }

    /* JADX INFO: renamed from: N */
    public static int m197117N() {
        return 2;
    }

    /* JADX INFO: renamed from: O */
    public static HeartbeatPushInfo m197118O() {
        return f180287d;
    }

    /* JADX INFO: renamed from: P */
    public static String m197119P() {
        return NullChecker.m82486a(f180287d) ? f180287d.pushMessage.tracker : "";
    }

    /* JADX INFO: renamed from: Q */
    public static int m197120Q() {
        if (NullChecker.m82486a(f180287d) && NullChecker.m82486a(f180287d.pushMessage)) {
            return m197122S(f180287d.pushMessage.tracker);
        }
        return 1;
    }

    /* JADX INFO: renamed from: R */
    public static String m197121R(TabName tabName) {
        if (tabName == TabName.Card) {
            return "p_suggest_users_home_view";
        }
        if (tabName == TabName.Me) {
            return OMSDialogPositon.p_navigation_view;
        }
        return tabName == TabName.Moment ? OMSDialogPositon.p_nearby : OMSDialogPositon.p_messages_view;
    }

    /* JADX INFO: renamed from: S */
    public static int m197122S(String str) {
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
    public static int m197123T() {
        return 3;
    }

    /* JADX INFO: renamed from: U */
    public static List<Tag> m197124U(User user) {
        if (user == null || !NullChecker.m82486a(user.profile) || jyb.m147479J(user.profile.tags)) {
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
        ArrayList<Tag> arrayListM147522n = jyb.m147522n(user.profile.tags, new qcj() { // from class: l.uom
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(TextUtils.equals("music", tag.category) || TextUtils.equals("sports", tag.category) || TextUtils.equals("food", tag.category) || TextUtils.equals("movies", tag.category) || TextUtils.equals("literature", tag.category));
            }
        });
        if (jyb.m147479J(arrayListM147522n)) {
            return null;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        for (Tag tag : arrayListM147522n) {
            if (userM116600p9.profile.tags.contains(tag)) {
                arrayList2.add(tag);
            } else {
                arrayList3.add(tag);
            }
        }
        if (!jyb.m147479J(arrayList2)) {
            arrayList.addAll(jyb.m147522n(arrayList2, new qcj() { // from class: l.wom
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(jyb.m147522n(arrayList2, new qcj() { // from class: l.xom
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("movies", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(jyb.m147522n(arrayList2, new qcj() { // from class: l.yom
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(jyb.m147522n(arrayList2, new qcj() { // from class: l.zom
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("food", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(jyb.m147522n(arrayList2, new qcj() { // from class: l.apm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
                }
            }));
        }
        if (!jyb.m147479J(arrayList3)) {
            arrayList.addAll(jyb.m147522n(arrayList3, new qcj() { // from class: l.bpm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("sports", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(jyb.m147522n(arrayList3, new qcj() { // from class: l.cpm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("movies", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(jyb.m147522n(arrayList3, new qcj() { // from class: l.epm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("literature", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(jyb.m147522n(arrayList3, new qcj() { // from class: l.fpm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("food", ((Tag) obj).category));
                }
            }));
            arrayList.addAll(jyb.m147522n(arrayList3, new qcj() { // from class: l.vom
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals("music", ((Tag) obj).category));
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m197125V(PartialListOpt<CoreSuggested.UserInfo> partialListOpt) {
        return (partialListOpt == null || jyb.m147479J(partialListOpt.loaded) || !partialListOpt.loaded.get(0).isImpressSignal()) ? false : true;
    }

    /* JADX INFO: renamed from: W */
    public static void m197126W(long j) {
        if (!OnlineMatchManager.m51326z().m51336J()) {
            OnlineMatchManager.m51326z().m51350X("matching", OnlineMatchManager.QuickChatProduce.Heartbeat);
        }
        CoreModule.f18264c.f20427t1.m32519u("heartbeat_search_timeout");
        psd0.m173633z(f180288e);
        if (j <= 0) {
            return;
        }
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32522c(pzi0.m174454o()).m32525f(pzi0.m174454o() + (j * 1000)).m32520a(true).m32524e(true).m32526g("heartbeat_search_timeout");
        CoreModule.f18264c.f20427t1.m32516r(aVar);
        f180288e = CoreModule.f18264c.f20427t1.m32511m("heartbeat_search_timeout").subscribe(new y20() { // from class: l.ipm
            @Override // p153l.y20
            public final void call(Object obj) {
                upm.m197162w((RunnableC4884c0.b) obj);
            }
        }, new y20() { // from class: l.jpm
            @Override // p153l.y20
            public final void call(Object obj) {
                upm.m197142g((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static void m197127X(PushMessageCustom pushMessageCustom) {
        fhw.m125605a("ImpressSignalHelperOpt", "收到了长链：" + pushMessageCustom.userId + Constants.SEPARATOR_COMMA + pushMessageCustom.noRecommended + Constants.SEPARATOR_COMMA + pushMessageCustom.triggeredUserId);
        CoreModule.f18264c.f20313H1.m123918X3(pushMessageCustom, false, true);
    }

    /* JADX INFO: renamed from: Y */
    public static void m197128Y() {
        f180286c = C4907v.f20866b0;
        f180287d = null;
        CoreModule.f18264c.f20427t1.m32519u("heartbeat_search_timeout");
        psd0.m173633z(f180288e);
    }

    /* JADX INFO: renamed from: Z */
    public static void m197129Z(boolean z) {
        f180295l = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m197130a(Envelope envelope) {
    }

    /* JADX INFO: renamed from: a0 */
    public static void m197131a0(User user, Act act, boolean z, y20<String> y20Var) {
        String str = user.description;
        if (!TextUtils.isEmpty(str)) {
            m197106C(user, act, "\"" + str + "\"", y20Var, false);
            return;
        }
        String str2 = user.profile.hangouts;
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(user.isFemale() ? "她" : "他");
            sb.append("经常去");
            sb.append(str2);
            m197106C(user, act, sb.toString(), y20Var, false);
            return;
        }
        List<Tag> listM197124U = m197124U(user);
        if (jyb.m147479J(listM197124U)) {
            m197106C(user, act, user.isFemale() ? "她正在等你聊天" : "他正在等你聊天", y20Var, false);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(user.isFemale() ? "她" : "他");
        sb2.append("喜欢");
        sb2.append(m197149j0(listM197124U));
        m197106C(user, act, sb2.toString(), y20Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m197132b(String str, Passby passby, boolean z, y20 y20Var, Throwable th) {
        App.f16087d.m21432k(th);
        StringBuilder sb = new StringBuilder(str);
        if (passby.count > 0) {
            sb.append("，");
            sb.append(z ? "我们" : "你们");
            sb.append("擦肩而过");
            sb.append(passby.count);
            sb.append("次");
        }
        y20Var.call(sb.toString());
    }

    /* JADX INFO: renamed from: b0 */
    public static void m197133b0(HeartbeatPushInfo heartbeatPushInfo) {
        f180287d = heartbeatPushInfo;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m197134c(y20 y20Var, TabName tabName) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.FALSE);
        }
        i4g0.m138520r("e_funchat_suggestion_no", m197121R(tabName));
    }

    /* JADX INFO: renamed from: c0 */
    public static void m197135c0(User user, VText vText) {
        StringBuilder sb = new StringBuilder();
        if (!CoreModule.f18264c.f20303E0.m141060B3(user) && NullChecker.m82486a(user.location)) {
            sb.append(q8g0.m175793Y(user.location));
        }
        if (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.zodiac)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(q8g0.m175804j0(user.profile.zodiac));
        }
        if (user.age.intValue() > 0 && !CoreModule.f18264c.f20303E0.m141091z3(user)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(user.age);
            sb.append("岁");
        }
        bnl0.m105515H0(vText, sb.toString());
    }

    /* JADX INFO: renamed from: d0 */
    public static void m197137d0() {
        if (NullChecker.m82486a(f180287d)) {
            f180287d.setSvipDlgShow();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m197138e(boolean z, y20 y20Var) {
        if (m197111H() || !z) {
            a5i0.m96160p0().m96208W0();
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m197139e0(User user) {
        return !jyb.m147479J(user.pictures) && user.pictures.size() >= 3;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m197140f(Act act, Boolean bool) {
        if (bool.booleanValue() && m197108E(act)) {
            CoreModule.f18264c.f20313H1.m123927g4().subscribe(psd0.m173597H(new y20() { // from class: l.gpm
                @Override // p153l.y20
                public final void call(Object obj) {
                    upm.m197148j((Envelope) obj);
                }
            }, new y20() { // from class: l.hpm
                @Override // p153l.y20
                public final void call(Object obj) {
                    upm.m197152m((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static void m197141f0(Act act, final TabName tabName, final y20<Boolean> y20Var) {
        if (CoreModule.m30934Q().isLiving()) {
            return;
        }
        jl80.C17971a c17971aNewDialog = act.newDialog();
        String str = m197117N() + "次";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("每天有" + str + "免费次数可使用心动信号。本次使用将消耗1次次数");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(act.getResources().getColor(c9c0.f80342I)), 3, str.length() + 3, 33);
        int length = str.length();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(act.getResources().getColor(c9c0.f80342I)), length + 22, length + 24, 33);
        jl80 jl80VarM146049r0 = c17971aNewDialog.m146024S(dbc0.f86883c8).m146056y0("功能全新升级").m146051t0(spannableStringBuilder).m146021P(false).m146034c0("同意并聊天", new Runnable() { // from class: l.dpm
            @Override // java.lang.Runnable
            public final void run() {
                upm.m197163x(y20Var, tabName);
            }
        }).m146029X("不同意", new Runnable() { // from class: l.mpm
            @Override // java.lang.Runnable
            public final void run() {
                upm.m197134c(y20Var, tabName);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.npm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                upm.f180289f = null;
            }
        }).m146049r0();
        i4g0.m138526x("e_funchat_suggestion_yes", m197121R(tabName));
        f180289f = new WeakReference<>(jl80VarM146049r0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m197142g(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static void m197143g0(final Act act) {
        if (m197108E(act)) {
            if (!Network.isConnected(act)) {
                o1j0.m165635i(R$string.f19605r4, true);
            } else if (m197109F(act, false, false, "p_quickchat,funchat", new y20() { // from class: l.spm
                @Override // p153l.y20
                public final void call(Object obj) {
                    upm.m197140f(act, (Boolean) obj);
                }
            })) {
                CoreModule.f18264c.f20313H1.m123927g4().subscribe(psd0.m173597H(new y20() { // from class: l.tpm
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        upm.m197130a((Envelope) obj);
                    }
                }, new y20() { // from class: l.tom
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        upm.m197154o((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m197144h(y20 y20Var) {
        wyb0.m208493O().m208538I();
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m197145h0() {
        if (OnlineMatchManager.m51326z().m51336J()) {
            OnlineMatchManager.m51326z().m51350X("default", OnlineMatchManager.QuickChatProduce.Heartbeat);
            OnlineMatchManager.m51326z().f33442I.onNext(pf60.m172085a("notify_normal_state", null));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m197147i0() {
        if (OnlineMatchManager.m51326z().m51336J()) {
            return;
        }
        OnlineMatchManager.m51326z().m51350X("matching", OnlineMatchManager.QuickChatProduce.Heartbeat);
        OnlineMatchManager.m51326z().f33442I.onNext(pf60.m172085a("notify_search", null));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m197148j(Envelope envelope) {
    }

    /* JADX INFO: renamed from: j0 */
    public static String m197149j0(List<Tag> list) {
        if (jyb.m147479J(list)) {
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
    public static /* synthetic */ void m197151l(uxj0 uxj0Var) {
        if (CoreModule.f18264c.f20313H1.m123906L3()) {
            f49 f49Var = CoreModule.f18264c.f20313H1;
            f49Var.m123930w3("cancel", f49Var.m123900F3());
            CoreModule.f18264c.f20313H1.m123923c4("search_cancel");
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m197152m(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m197154o(Throwable th) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m197160u(String str, boolean z, Passby passby, y20 y20Var, z80 z80Var) {
        String str2 = (TextUtils.isEmpty(z80Var.mo143670b()) ? "" : z80Var.mo143670b()) + (TextUtils.isEmpty(z80Var.mo143671c()) ? "" : z80Var.mo143671c()) + (TextUtils.isEmpty(z80Var.mo143672f()) ? "" : z80Var.mo143672f());
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
        y20Var.call(sb.toString());
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m197162w(RunnableC4884c0.b bVar) {
        CoreModule.f18264c.f20313H1.m123925e4();
        m197107D(false);
        psd0.m173633z(f180288e);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m197163x(y20 y20Var, TabName tabName) {
        if (m197111H()) {
            jxd0 jxd0Var = CoreModule.f18264c.f20313H1.f97070X;
            Boolean bool = Boolean.TRUE;
            jxd0Var.put(bool);
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(bool);
            }
            i4g0.m138520r("e_funchat_suggestion_yes", m197121R(tabName));
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m197165z(Throwable th) {
    }
}
