package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.p004ui.webview.AccessTokenWebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.DialogShowInfo;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.p1.mobile.putong.data.OMSConfigEnvelope;
import com.p1.mobile.putong.data.OMSData;
import com.p1.mobile.putong.data.OMSDialogGlobalConstraint;
import com.p1.mobile.putong.data.OMSDialogInfo;
import com.p1.mobile.putong.data.OMSDialogShowInfo;
import com.p1.mobile.putong.data.OmsCounter;
import com.p1.mobile.putong.data.TriggerEvent;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.hpd0;
import l.ia20;
import l.j760;
import l.jo0;
import l.mkd0;
import l.qib0;
import l.tpd0;
import l.u0f;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xh5;
import l.zpd0;
import org.json.JSONObject;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kb50 extends xh5 {

    /* JADX INFO: renamed from: a */
    public b<OMSDialogInfo> f15572a = b.b();

    /* JADX INFO: renamed from: b */
    public zpd0 f15573b = new zpd0("limitDialogLastShowTime" + qib0.c0.userId(), 0L);

    /* JADX INFO: renamed from: c */
    public tpd0 f15574c = new tpd0("limitDialogShowCountByDay" + qib0.c0.userId(), 0);

    /* JADX INFO: renamed from: d */
    public hpd0 f15575d = new hpd0("isFirstToMerge" + qib0.c0.userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: e */
    public jpd0 f15576e = new jpd0("dialog_show_info_device", true);

    /* JADX INFO: renamed from: f */
    public jpd0 f15577f = new jpd0("dialog_show_info_v1" + qib0.c0.userId(), true);

    /* JADX INFO: renamed from: g */
    public HashMap<String, Integer> f15578g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<OMSDialogInfo> f15579h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public HashMap<String, u0f> f15580i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public boolean f15581j;

    /* JADX INFO: renamed from: k */
    public int f15582k;

    /* JADX INFO: renamed from: l.kb50$a */
    public class C0990a implements Comparator<OMSDialogInfo> {
        public C0990a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(OMSDialogInfo oMSDialogInfo, OMSDialogInfo oMSDialogInfo2) {
            return oMSDialogInfo2.constraint.priority - oMSDialogInfo.constraint.priority;
        }
    }

    public kb50() {
        m17408c0();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m17377A(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m17379C(Act act, OMSDialogInfo oMSDialogInfo, boolean z, e30 e30Var, AuthData authData) {
        if (!NullChecker.a(authData) || TextUtils.isEmpty(authData.accessToken)) {
            return;
        }
        xc50.m24774h((PutongAct) act, oMSDialogInfo, authData.accessToken, z);
        if (NullChecker.a(e30Var)) {
            e30Var.call(oMSDialogInfo.identifier);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m17381E(Throwable th) {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ OMSDialogInfo m17389z(final String str, OMSConfigEnvelope oMSConfigEnvelope) {
        if (vwb.J(oMSConfigEnvelope.data.dialogs)) {
            return null;
        }
        OMSData oMSDataM16320d = ic50.m16316j().m16320d();
        OMSDialogInfo oMSDialogInfo = (OMSDialogInfo) vwb.r(oMSDataM16320d.dialogs, new w9j() { // from class: l.ab50
            public final Object call(Object obj) {
                return Boolean.valueOf(((OMSDialogInfo) obj).id.equals(str));
            }
        });
        if (NullChecker.a(oMSDialogInfo)) {
            oMSDataM16320d.dialogs.remove(oMSDialogInfo);
        }
        oMSDataM16320d.dialogs.add((OMSDialogInfo) oMSConfigEnvelope.data.dialogs.get(0));
        ic50.m16316j().m16336u(oMSDataM16320d);
        return (OMSDialogInfo) oMSConfigEnvelope.data.dialogs.get(0);
    }

    /* JADX INFO: renamed from: K */
    public boolean m17390K(String str) {
        OMSDialogInfo oMSDialogInfoM17398S = m17398S(str);
        return NullChecker.a(oMSDialogInfoM17398S) && oMSDialogInfoM17398S.blockCard;
    }

    /* JADX INFO: renamed from: L */
    public void m17391L(Act act, boolean z, e30<String> e30Var) {
        if (vwb.J(this.f15579h)) {
            return;
        }
        for (OMSDialogInfo oMSDialogInfo : this.f15579h) {
            if (qib0.i0.a(m17404Y(oMSDialogInfo.identifier, "e_swipe_after", "p_suggest_users_home_view")) && m17392M(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension)) {
                m17426u0(act, oMSDialogInfo, z, e30Var);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean m17392M(String str, boolean z) {
        DialogShowInfo dialogShowInfoM17396Q = z ? m17396Q(str) : m17395P(str);
        OMSDialogInfo oMSDialogInfoM17398S = m17398S(str);
        if (oMSDialogInfoM17398S == null || dialogShowInfoM17396Q.noRemind || m17417l0(oMSDialogInfoM17398S.constraint.count, dialogShowInfoM17396Q) || m17411f0(oMSDialogInfoM17398S.constraint.frequency, dialogShowInfoM17396Q) || m17416k0(oMSDialogInfoM17398S.constraint.timeRange) || m17414i0(oMSDialogInfoM17398S.constraint.timePerDay, dialogShowInfoM17396Q, 0) || m17415j0(oMSDialogInfoM17398S.constraint.timePerWeek, dialogShowInfoM17396Q) || m17413h0(oMSDialogInfoM17398S.constraint.sessionCount, str)) {
            return false;
        }
        return oMSDialogInfoM17398S.independent || m17422q0();
    }

    /* JADX INFO: renamed from: N */
    public boolean m17393N(String str, boolean z) {
        DialogShowInfo dialogShowInfoM17396Q = z ? m17396Q(str) : m17395P(str);
        OMSAdCardInfo oMSAdCardInfoM17397R = m17397R(str);
        return (oMSAdCardInfoM17397R == null || dialogShowInfoM17396Q.noRemind || m17417l0(oMSAdCardInfoM17397R.constraint.count, dialogShowInfoM17396Q) || m17411f0(oMSAdCardInfoM17397R.constraint.frequency, dialogShowInfoM17396Q) || m17416k0(oMSAdCardInfoM17397R.constraint.timeRange) || m17414i0(oMSAdCardInfoM17397R.constraint.timePerDay, dialogShowInfoM17396Q, 0) || m17415j0(oMSAdCardInfoM17397R.constraint.timePerWeek, dialogShowInfoM17396Q) || m17413h0(oMSAdCardInfoM17397R.constraint.sessionCount, str)) ? false : true;
    }

    /* JADX INFO: renamed from: O */
    public final int m17394O(String str) {
        if (this.f15578g.containsKey(str)) {
            return this.f15578g.get(str).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: P */
    public DialogShowInfo m17395P(String str) {
        DialogShowInfo dialogShowInfo = (DialogShowInfo) ((OMSDialogShowInfo) this.f15577f.get()).showInfos.get(str);
        if (dialogShowInfo != null) {
            return dialogShowInfo;
        }
        DialogShowInfo dialogShowInfoNew_ = DialogShowInfo.new_();
        dialogShowInfoNew_.resourceId = str;
        return dialogShowInfoNew_;
    }

    /* JADX INFO: renamed from: Q */
    public DialogShowInfo m17396Q(String str) {
        DialogShowInfo dialogShowInfo = (DialogShowInfo) ((OMSDialogShowInfo) this.f15576e.get()).showInfos.get(str);
        if (dialogShowInfo != null) {
            return dialogShowInfo;
        }
        DialogShowInfo dialogShowInfoNew_ = DialogShowInfo.new_();
        dialogShowInfoNew_.resourceId = str;
        return dialogShowInfoNew_;
    }

    /* JADX INFO: renamed from: R */
    public OMSAdCardInfo m17397R(final String str) {
        List<OMSAdCardInfo> listM16324h = ic50.m16316j().m16324h();
        if (vwb.J(listM16324h)) {
            return null;
        }
        return (OMSAdCardInfo) vwb.r(listM16324h, new w9j() { // from class: l.db50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((OMSAdCardInfo) obj).identifier));
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public OMSDialogInfo m17398S(final String str) {
        List<OMSDialogInfo> listM16325i = ic50.m16316j().m16325i();
        if (vwb.J(listM16325i)) {
            return null;
        }
        return (OMSDialogInfo) vwb.r(listM16325i, new w9j() { // from class: l.cb50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((OMSDialogInfo) obj).identifier));
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public List<j760<String, String>> m17399T(String str) {
        OMSDialogInfo oMSDialogInfoM17398S = m17398S(str);
        if (oMSDialogInfoM17398S != null) {
            Map map = oMSDialogInfoM17398S.mercury.server;
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new j760((String) entry.getKey(), (String) entry.getValue()));
                }
                return arrayList;
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: U */
    public JSONObject m17400U(String str, JSONObject jSONObject) {
        OMSDialogInfo oMSDialogInfoM17398S;
        if (!TextUtils.isEmpty(str) && (oMSDialogInfoM17398S = m17398S(str)) != null) {
            Map map = oMSDialogInfoM17398S.mercury.server;
            if (!map.isEmpty()) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                } catch (Exception unused) {
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: V */
    public j760[] m17401V(String str, j760... j760VarArr) {
        OMSDialogInfo oMSDialogInfoM17398S;
        if (!TextUtils.isEmpty(str) && (oMSDialogInfoM17398S = m17398S(str)) != null) {
            Map map = oMSDialogInfoM17398S.mercury.server;
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new j760((String) entry.getKey(), (String) entry.getValue()));
                }
                if (j760VarArr != null && j760VarArr.length > 0) {
                    for (j760 j760Var : j760VarArr) {
                        arrayList.add(j760Var);
                    }
                }
                j760[] j760VarArr2 = new j760[arrayList.size()];
                arrayList.toArray(j760VarArr2);
                return j760VarArr2;
            }
        }
        return j760VarArr;
    }

    /* JADX INFO: renamed from: W */
    public List<OMSDialogInfo> m17402W(String str, String str2) {
        ArrayList arrayList = null;
        if (str != null && str2 != null) {
            List<OMSDialogInfo> listM16325i = ic50.m16316j().m16325i();
            if (vwb.J(listM16325i)) {
                return null;
            }
            for (OMSDialogInfo oMSDialogInfo : listM16325i) {
                if (!vwb.J(oMSDialogInfo.events)) {
                    for (TriggerEvent triggerEvent : oMSDialogInfo.events) {
                        if (TextUtils.equals(str, triggerEvent.eventID) && TextUtils.equals(str2, triggerEvent.properties.pageID)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(oMSDialogInfo);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public int m17403X(final String str) {
        OMSDialogInfo oMSDialogInfo;
        List<OMSDialogInfo> listM16325i = ic50.m16316j().m16325i();
        if (vwb.J(listM16325i) || (oMSDialogInfo = (OMSDialogInfo) vwb.r(listM16325i, new w9j() { // from class: l.jb50
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((OMSDialogInfo) obj).identifier));
            }
        })) == null) {
            return 0;
        }
        return oMSDialogInfo.constraint.priority;
    }

    /* JADX INFO: renamed from: Y */
    public u0f m17404Y(String str, String str2, String str3) {
        return this.f15580i.get(m17420o0(str, str2, str3));
    }

    /* JADX INFO: renamed from: Z */
    public boolean m17405Z(String str, int i, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f15578g.put(str, Integer.valueOf(m17394O(str) + 1));
        DialogShowInfo dialogShowInfoM17396Q = z ? m17396Q(str) : m17395P(str);
        if (i > 0 ? mqi0.m18536E(dialogShowInfoM17396Q.lastShowTime, i) : mqi0.m18535D(dialogShowInfoM17396Q.lastShowTime)) {
            dialogShowInfoM17396Q.countByDay++;
        } else {
            dialogShowInfoM17396Q.countByDay = 1;
        }
        if (mqi0.m18557v(dialogShowInfoM17396Q.lastShowTime)) {
            dialogShowInfoM17396Q.countByWeek++;
        } else {
            dialogShowInfoM17396Q.countByWeek = 1;
        }
        dialogShowInfoM17396Q.lastShowTime = mqi0.m18550o();
        dialogShowInfoM17396Q.totalShownCount++;
        if (z) {
            this.f15576e.m17187h(dialogShowInfoM17396Q);
        } else {
            this.f15577f.m17187h(dialogShowInfoM17396Q);
        }
        if (!z) {
            OmsCounter omsCounterNew_ = OmsCounter.new_();
            omsCounterNew_.counters.add(ic50.m16316j().m16319c().m24020F(dialogShowInfoM17396Q));
            ic50.m16316j().m16319c().m24029O(omsCounterNew_, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m17406a0(String str) {
        DialogShowInfo dialogShowInfoM17395P = m17395P(str);
        dialogShowInfoM17395P.noRemind = true;
        this.f15577f.m17187h(dialogShowInfoM17395P);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m17407b0(String str, int i, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        m17409d0(str);
        this.f15578g.put(str, Integer.valueOf(m17394O(str) + 1));
        DialogShowInfo dialogShowInfoM17396Q = z ? m17396Q(str) : m17395P(str);
        if (i > 0 ? mqi0.m18536E(dialogShowInfoM17396Q.lastShowTime, i) : mqi0.m18535D(dialogShowInfoM17396Q.lastShowTime)) {
            dialogShowInfoM17396Q.countByDay++;
        } else {
            dialogShowInfoM17396Q.countByDay = 1;
        }
        if (mqi0.m18557v(dialogShowInfoM17396Q.lastShowTime)) {
            dialogShowInfoM17396Q.countByWeek++;
        } else {
            dialogShowInfoM17396Q.countByWeek = 1;
        }
        dialogShowInfoM17396Q.lastShowTime = mqi0.m18550o();
        dialogShowInfoM17396Q.totalShownCount++;
        if (z) {
            this.f15576e.m17187h(dialogShowInfoM17396Q);
        } else {
            this.f15577f.m17187h(dialogShowInfoM17396Q);
        }
        if (!z) {
            OmsCounter omsCounterNew_ = OmsCounter.new_();
            omsCounterNew_.counters.add(ic50.m16316j().m16319c().m24020F(dialogShowInfoM17396Q));
            ic50.m16316j().m16319c().m24029O(omsCounterNew_, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m17408c0() {
        ic50.m16316j().m16334s().map(new w9j() { // from class: l.xa50
            public final Object call(Object obj) {
                return ((OMSData) obj).dialogs;
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.bb50
            public final void call(Object obj) {
                this.f9997a.m17418m0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m17409d0(String str) {
        OMSDialogInfo oMSDialogInfoM17398S = m17398S(str);
        if (NullChecker.a(oMSDialogInfoM17398S) && oMSDialogInfoM17398S.independent) {
            return;
        }
        this.f15573b.put(Long.valueOf(mqi0.m18550o()));
        tpd0 tpd0Var = this.f15574c;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        this.f15582k++;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m17410e0() {
        return ((Boolean) this.f15575d.get()).booleanValue();
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m17411f0(List<Integer> list, DialogShowInfo dialogShowInfo) {
        if (vwb.J(list)) {
            return false;
        }
        return mqi0.m18550o() - dialogShowInfo.lastShowTime < ((long) (dialogShowInfo.totalShownCount >= list.size() ? list.get(list.size() - 1).intValue() : list.get(dialogShowInfo.totalShownCount).intValue())) * 1000;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m17412g0() {
        return this.f15581j;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m17413h0(int i, String str) {
        return i != -1 && m17394O(str) >= i;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m17414i0(int i, DialogShowInfo dialogShowInfo, int i2) {
        if (i == -1) {
            return false;
        }
        if (i2 > 0) {
            return mqi0.m18536E(dialogShowInfo.lastShowTime, i2) && dialogShowInfo.countByDay >= i;
        }
        return mqi0.m18535D(dialogShowInfo.lastShowTime) && dialogShowInfo.countByDay >= i;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m17415j0(int i, DialogShowInfo dialogShowInfo) {
        return i != -1 && mqi0.m18557v(dialogShowInfo.lastShowTime) && dialogShowInfo.countByWeek >= i;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m17416k0(List<Long> list) {
        if (vwb.J(list) || list.size() < 2) {
            return false;
        }
        return mqi0.m18550o() < list.get(0).longValue() * 1000 || mqi0.m18550o() > list.get(1).longValue() * 1000;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m17417l0(int i, DialogShowInfo dialogShowInfo) {
        return i != -1 && dialogShowInfo.totalShownCount >= i;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m17419n0(Act act, boolean z, e30 e30Var, OMSDialogInfo oMSDialogInfo) {
        if (NullChecker.a(oMSDialogInfo) && m17392M(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension)) {
            m17425t0(act, oMSDialogInfo, z, false, e30Var);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final String m17420o0(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: p0 */
    public c<OMSDialogInfo> m17421p0(final String str) {
        return scheduled("oms_dialog_refresh_" + str, 0, new v9j() { // from class: l.ib50
            public final Object call() {
                String str2 = str;
                return ia20.c(new v9j() { // from class: l.ya50
                    public final Object call() {
                        return xh5.network.auth().q(xc50.m24772f(str2, null)).f().b();
                    }
                }, OMSConfigEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.za50
                    public final Object call(Object obj) {
                        return kb50.m17389z(str2, (OMSConfigEnvelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m17422q0() {
        OMSData oMSDataM16320d = ic50.m16316j().m16320d();
        OMSDialogGlobalConstraint oMSDialogGlobalConstraint = vwb.J(oMSDataM16320d.globalConstraints) ? null : (OMSDialogGlobalConstraint) oMSDataM16320d.globalConstraints.get(0);
        if (oMSDialogGlobalConstraint == null) {
            return true;
        }
        if (!mqi0.m18535D(((Long) this.f15573b.get()).longValue())) {
            this.f15574c.put(0);
        }
        int iIntValue = ((Integer) this.f15574c.get()).intValue();
        int i = oMSDialogGlobalConstraint.count;
        if (iIntValue < i || i < 0) {
            int i2 = this.f15582k;
            int i3 = oMSDialogGlobalConstraint.sessionCount;
            if (i2 < i3 || i3 < 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public void m17423r0(boolean z) {
        this.f15581j = z;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m17424s0(Act act, String str) {
        try {
            OMSDialogInfo oMSDialogInfoM17398S = m17398S(str);
            if (oMSDialogInfoM17398S == null) {
                return false;
            }
            return nc50.m18839f().m18852n(act, oMSDialogInfoM17398S);
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m17425t0(final Act act, final OMSDialogInfo oMSDialogInfo, final boolean z, boolean z2, final e30<String> e30Var) {
        this.f15581j = false;
        if ((z2 && Act.foreground_() == null) || oMSDialogInfo == null) {
            return;
        }
        try {
            if (TEnum.equals(oMSDialogInfo.contentType, "morph")) {
                if (nc50.m18839f().m18852n(act, oMSDialogInfo)) {
                    if (z) {
                        m17407b0(oMSDialogInfo.identifier, 0, !oMSDialogInfo.constraint.userDimension);
                    }
                    if (NullChecker.a(e30Var)) {
                        e30Var.call(oMSDialogInfo.identifier);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!TEnum.equals(oMSDialogInfo.contentType, "webPage")) {
                if (TEnum.equals(oMSDialogInfo.contentType, "webDialog") && (act instanceof PutongAct) && !TextUtils.isEmpty(oMSDialogInfo.content.web.url)) {
                    act.duringCreated(qib0.c0.accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.gb50
                        public final void call(Object obj) {
                            kb50.m17379C(act, oMSDialogInfo, z, e30Var, (AuthData) obj);
                        }
                    }, new e30() { // from class: l.hb50
                        public final void call(Object obj) {
                            kb50.m17377A((Throwable) obj);
                        }
                    }));
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(oMSDialogInfo.content.web.url)) {
                return;
            }
            act.startActivity(AccessTokenWebViewAct.m10482Z1(act, "", oMSDialogInfo.content.web.url));
            if (z) {
                m17407b0(oMSDialogInfo.identifier, 0, !oMSDialogInfo.constraint.userDimension);
            }
            if (NullChecker.a(e30Var)) {
                e30Var.call(oMSDialogInfo.identifier);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m17426u0(final Act act, OMSDialogInfo oMSDialogInfo, final boolean z, final e30<String> e30Var) {
        if (oMSDialogInfo.remote) {
            m17421p0(oMSDialogInfo.id).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.eb50
                public final void call(Object obj) {
                    this.f12478a.m17419n0(act, z, e30Var, (OMSDialogInfo) obj);
                }
            }, new e30() { // from class: l.fb50
                public final void call(Object obj) {
                    kb50.m17381E((Throwable) obj);
                }
            }));
        } else {
            m17425t0(act, oMSDialogInfo, z, false, e30Var);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m17427v0(String str, long j) {
        DialogShowInfo dialogShowInfoM17396Q = m17396Q(str);
        dialogShowInfoM17396Q.lastShowTime = j;
        this.f15576e.m17187h(dialogShowInfoM17396Q);
    }

    /* JADX INFO: renamed from: w0 */
    public void m17428w0(boolean z) {
        this.f15575d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final void m17418m0(List<OMSDialogInfo> list) {
        this.f15579h.clear();
        if (vwb.J(list)) {
            return;
        }
        for (OMSDialogInfo oMSDialogInfo : list) {
            if (oMSDialogInfo != null && !vwb.J(oMSDialogInfo.events)) {
                for (TriggerEvent triggerEvent : oMSDialogInfo.events) {
                    if (!TextUtils.isEmpty(triggerEvent.dsl)) {
                        this.f15580i.put(m17420o0(oMSDialogInfo.identifier, triggerEvent.eventID, triggerEvent.properties.pageID), qib0.i0.c(triggerEvent.dsl));
                        if (TextUtils.equals("e_swipe_after", triggerEvent.eventID) && !TEnum.equals(oMSDialogInfo.contentType, "local")) {
                            this.f15579h.add(oMSDialogInfo);
                        }
                    }
                }
            }
        }
        if (vwb.J(this.f15579h)) {
            return;
        }
        Collections.sort(this.f15579h, new C0990a());
    }
}
