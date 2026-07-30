package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.DialogShowInfo;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.OMSConfigEnvelope;
import com.p046p1.mobile.putong.data.OMSData;
import com.p046p1.mobile.putong.data.OMSDialogGlobalConstraint;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.OMSDialogType;
import com.p046p1.mobile.putong.data.OMSEventId;
import com.p046p1.mobile.putong.data.OmsCounter;
import com.p046p1.mobile.putong.data.TriggerEvent;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class kb50 extends xh5 {

    /* JADX INFO: renamed from: a */
    public C22393b<OMSDialogInfo> f122203a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public zpd0 f122204b = new zpd0("limitDialogLastShowTime" + qib0.f154714c0.userId(), 0L);

    /* JADX INFO: renamed from: c */
    public tpd0 f122205c = new tpd0("limitDialogShowCountByDay" + qib0.f154714c0.userId(), 0);

    /* JADX INFO: renamed from: d */
    public hpd0 f122206d = new hpd0("isFirstToMerge" + qib0.f154714c0.userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: e */
    public jpd0 f122207e = new jpd0("dialog_show_info_device", true);

    /* JADX INFO: renamed from: f */
    public jpd0 f122208f = new jpd0("dialog_show_info_v1" + qib0.f154714c0.userId(), true);

    /* JADX INFO: renamed from: g */
    public HashMap<String, Integer> f122209g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<OMSDialogInfo> f122210h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public HashMap<String, u0f> f122211i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public boolean f122212j;

    /* JADX INFO: renamed from: k */
    public int f122213k;

    /* JADX INFO: renamed from: l.kb50$a */
    public class C17977a implements Comparator<OMSDialogInfo> {
        public C17977a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(OMSDialogInfo oMSDialogInfo, OMSDialogInfo oMSDialogInfo2) {
            return oMSDialogInfo2.constraint.priority - oMSDialogInfo.constraint.priority;
        }
    }

    public kb50() {
        m145242c0();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m145211A(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m145213C(Act act, OMSDialogInfo oMSDialogInfo, boolean z, e30 e30Var, AuthData authData) {
        if (!NullChecker.m81303a(authData) || TextUtils.isEmpty(authData.accessToken)) {
            return;
        }
        xc50.m208078h((PutongAct) act, oMSDialogInfo, authData.accessToken, z);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(oMSDialogInfo.identifier);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m145215E(Throwable th) {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ OMSDialogInfo m145223z(final String str, OMSConfigEnvelope oMSConfigEnvelope) {
        if (vwb.m200296J(oMSConfigEnvelope.data.dialogs)) {
            return null;
        }
        OMSData oMSDataM135331d = ic50.m135327j().m135331d();
        OMSDialogInfo oMSDialogInfo = (OMSDialogInfo) vwb.m200346r(oMSDataM135331d.dialogs, new w9j() { // from class: l.ab50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((OMSDialogInfo) obj).f38785id.equals(str));
            }
        });
        if (NullChecker.m81303a(oMSDialogInfo)) {
            oMSDataM135331d.dialogs.remove(oMSDialogInfo);
        }
        oMSDataM135331d.dialogs.add(oMSConfigEnvelope.data.dialogs.get(0));
        ic50.m135327j().m135347u(oMSDataM135331d);
        return oMSConfigEnvelope.data.dialogs.get(0);
    }

    /* JADX INFO: renamed from: K */
    public boolean m145224K(String str) {
        OMSDialogInfo oMSDialogInfoM145232S = m145232S(str);
        return NullChecker.m81303a(oMSDialogInfoM145232S) && oMSDialogInfoM145232S.blockCard;
    }

    /* JADX INFO: renamed from: L */
    public void m145225L(Act act, boolean z, e30<String> e30Var) {
        if (vwb.m200296J(this.f122210h)) {
            return;
        }
        for (OMSDialogInfo oMSDialogInfo : this.f122210h) {
            if (qib0.f154720i0.m196493a(m145238Y(oMSDialogInfo.identifier, OMSEventId.e_swipe_after, "p_suggest_users_home_view")) && m145226M(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension)) {
                m145260u0(act, oMSDialogInfo, z, e30Var);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean m145226M(String str, boolean z) {
        DialogShowInfo dialogShowInfoM145230Q = z ? m145230Q(str) : m145229P(str);
        OMSDialogInfo oMSDialogInfoM145232S = m145232S(str);
        if (oMSDialogInfoM145232S == null || dialogShowInfoM145230Q.noRemind || m145251l0(oMSDialogInfoM145232S.constraint.count, dialogShowInfoM145230Q) || m145245f0(oMSDialogInfoM145232S.constraint.frequency, dialogShowInfoM145230Q) || m145250k0(oMSDialogInfoM145232S.constraint.timeRange) || m145248i0(oMSDialogInfoM145232S.constraint.timePerDay, dialogShowInfoM145230Q, 0) || m145249j0(oMSDialogInfoM145232S.constraint.timePerWeek, dialogShowInfoM145230Q) || m145247h0(oMSDialogInfoM145232S.constraint.sessionCount, str)) {
            return false;
        }
        return oMSDialogInfoM145232S.independent || m145256q0();
    }

    /* JADX INFO: renamed from: N */
    public boolean m145227N(String str, boolean z) {
        DialogShowInfo dialogShowInfoM145230Q = z ? m145230Q(str) : m145229P(str);
        OMSAdCardInfo oMSAdCardInfoM145231R = m145231R(str);
        return (oMSAdCardInfoM145231R == null || dialogShowInfoM145230Q.noRemind || m145251l0(oMSAdCardInfoM145231R.constraint.count, dialogShowInfoM145230Q) || m145245f0(oMSAdCardInfoM145231R.constraint.frequency, dialogShowInfoM145230Q) || m145250k0(oMSAdCardInfoM145231R.constraint.timeRange) || m145248i0(oMSAdCardInfoM145231R.constraint.timePerDay, dialogShowInfoM145230Q, 0) || m145249j0(oMSAdCardInfoM145231R.constraint.timePerWeek, dialogShowInfoM145230Q) || m145247h0(oMSAdCardInfoM145231R.constraint.sessionCount, str)) ? false : true;
    }

    /* JADX INFO: renamed from: O */
    public final int m145228O(String str) {
        if (this.f122209g.containsKey(str)) {
            return this.f122209g.get(str).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: P */
    public DialogShowInfo m145229P(String str) {
        DialogShowInfo dialogShowInfo = this.f122208f.get().showInfos.get(str);
        if (dialogShowInfo != null) {
            return dialogShowInfo;
        }
        DialogShowInfo dialogShowInfoNew_ = DialogShowInfo.new_();
        dialogShowInfoNew_.resourceId = str;
        return dialogShowInfoNew_;
    }

    /* JADX INFO: renamed from: Q */
    public DialogShowInfo m145230Q(String str) {
        DialogShowInfo dialogShowInfo = this.f122207e.get().showInfos.get(str);
        if (dialogShowInfo != null) {
            return dialogShowInfo;
        }
        DialogShowInfo dialogShowInfoNew_ = DialogShowInfo.new_();
        dialogShowInfoNew_.resourceId = str;
        return dialogShowInfoNew_;
    }

    /* JADX INFO: renamed from: R */
    public OMSAdCardInfo m145231R(final String str) {
        List<OMSAdCardInfo> listM135335h = ic50.m135327j().m135335h();
        if (vwb.m200296J(listM135335h)) {
            return null;
        }
        return (OMSAdCardInfo) vwb.m200346r(listM135335h, new w9j() { // from class: l.db50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((OMSAdCardInfo) obj).identifier));
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public OMSDialogInfo m145232S(final String str) {
        List<OMSDialogInfo> listM135336i = ic50.m135327j().m135336i();
        if (vwb.m200296J(listM135336i)) {
            return null;
        }
        return (OMSDialogInfo) vwb.m200346r(listM135336i, new w9j() { // from class: l.cb50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((OMSDialogInfo) obj).identifier));
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public List<j760<String, String>> m145233T(String str) {
        OMSDialogInfo oMSDialogInfoM145232S = m145232S(str);
        if (oMSDialogInfoM145232S != null) {
            Map<String, String> map = oMSDialogInfoM145232S.mercury.server;
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new j760(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: U */
    public JSONObject m145234U(String str, JSONObject jSONObject) {
        OMSDialogInfo oMSDialogInfoM145232S;
        if (!TextUtils.isEmpty(str) && (oMSDialogInfoM145232S = m145232S(str)) != null) {
            Map<String, String> map = oMSDialogInfoM145232S.mercury.server;
            if (!map.isEmpty()) {
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (Exception unused) {
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: V */
    public j760[] m145235V(String str, j760... j760VarArr) {
        OMSDialogInfo oMSDialogInfoM145232S;
        if (!TextUtils.isEmpty(str) && (oMSDialogInfoM145232S = m145232S(str)) != null) {
            Map<String, String> map = oMSDialogInfoM145232S.mercury.server;
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new j760(entry.getKey(), entry.getValue()));
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
    public List<OMSDialogInfo> m145236W(String str, String str2) {
        ArrayList arrayList = null;
        if (str != null && str2 != null) {
            List<OMSDialogInfo> listM135336i = ic50.m135327j().m135336i();
            if (vwb.m200296J(listM135336i)) {
                return null;
            }
            for (OMSDialogInfo oMSDialogInfo : listM135336i) {
                if (!vwb.m200296J(oMSDialogInfo.events)) {
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
    public int m145237X(final String str) {
        OMSDialogInfo oMSDialogInfo;
        List<OMSDialogInfo> listM135336i = ic50.m135327j().m135336i();
        if (vwb.m200296J(listM135336i) || (oMSDialogInfo = (OMSDialogInfo) vwb.m200346r(listM135336i, new w9j() { // from class: l.jb50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((OMSDialogInfo) obj).identifier));
            }
        })) == null) {
            return 0;
        }
        return oMSDialogInfo.constraint.priority;
    }

    /* JADX INFO: renamed from: Y */
    public u0f m145238Y(String str, String str2, String str3) {
        return this.f122211i.get(m145254o0(str, str2, str3));
    }

    /* JADX INFO: renamed from: Z */
    public boolean m145239Z(String str, int i, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f122209g.put(str, Integer.valueOf(m145228O(str) + 1));
        DialogShowInfo dialogShowInfoM145230Q = z ? m145230Q(str) : m145229P(str);
        if (i > 0 ? mqi0.m155930E(dialogShowInfoM145230Q.lastShowTime, i) : mqi0.m155929D(dialogShowInfoM145230Q.lastShowTime)) {
            dialogShowInfoM145230Q.countByDay++;
        } else {
            dialogShowInfoM145230Q.countByDay = 1;
        }
        if (mqi0.m155951v(dialogShowInfoM145230Q.lastShowTime)) {
            dialogShowInfoM145230Q.countByWeek++;
        } else {
            dialogShowInfoM145230Q.countByWeek = 1;
        }
        dialogShowInfoM145230Q.lastShowTime = mqi0.m155944o();
        dialogShowInfoM145230Q.totalShownCount++;
        if (z) {
            this.f122207e.m142677h(dialogShowInfoM145230Q);
        } else {
            this.f122208f.m142677h(dialogShowInfoM145230Q);
        }
        if (!z) {
            OmsCounter omsCounterNew_ = OmsCounter.new_();
            omsCounterNew_.counters.add(ic50.m135327j().m135330c().m202364F(dialogShowInfoM145230Q));
            ic50.m135327j().m135330c().m202373O(omsCounterNew_, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m145240a0(String str) {
        DialogShowInfo dialogShowInfoM145229P = m145229P(str);
        dialogShowInfoM145229P.noRemind = true;
        this.f122208f.m142677h(dialogShowInfoM145229P);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m145241b0(String str, int i, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        m145243d0(str);
        this.f122209g.put(str, Integer.valueOf(m145228O(str) + 1));
        DialogShowInfo dialogShowInfoM145230Q = z ? m145230Q(str) : m145229P(str);
        if (i > 0 ? mqi0.m155930E(dialogShowInfoM145230Q.lastShowTime, i) : mqi0.m155929D(dialogShowInfoM145230Q.lastShowTime)) {
            dialogShowInfoM145230Q.countByDay++;
        } else {
            dialogShowInfoM145230Q.countByDay = 1;
        }
        if (mqi0.m155951v(dialogShowInfoM145230Q.lastShowTime)) {
            dialogShowInfoM145230Q.countByWeek++;
        } else {
            dialogShowInfoM145230Q.countByWeek = 1;
        }
        dialogShowInfoM145230Q.lastShowTime = mqi0.m155944o();
        dialogShowInfoM145230Q.totalShownCount++;
        if (z) {
            this.f122207e.m142677h(dialogShowInfoM145230Q);
        } else {
            this.f122208f.m142677h(dialogShowInfoM145230Q);
        }
        if (!z) {
            OmsCounter omsCounterNew_ = OmsCounter.new_();
            omsCounterNew_.counters.add(ic50.m135327j().m135330c().m202364F(dialogShowInfoM145230Q));
            ic50.m135327j().m135330c().m202373O(omsCounterNew_, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m145242c0() {
        ic50.m135327j().m135345s().map(new w9j() { // from class: l.xa50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((OMSData) obj).dialogs;
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.bb50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74785a.m145252m0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m145243d0(String str) {
        OMSDialogInfo oMSDialogInfoM145232S = m145232S(str);
        if (NullChecker.m81303a(oMSDialogInfoM145232S) && oMSDialogInfoM145232S.independent) {
            return;
        }
        this.f122204b.put(Long.valueOf(mqi0.m155944o()));
        tpd0 tpd0Var = this.f122205c;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        this.f122213k++;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m145244e0() {
        return this.f122206d.get().booleanValue();
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m145245f0(List<Integer> list, DialogShowInfo dialogShowInfo) {
        if (vwb.m200296J(list)) {
            return false;
        }
        return mqi0.m155944o() - dialogShowInfo.lastShowTime < ((long) (dialogShowInfo.totalShownCount >= list.size() ? list.get(list.size() - 1).intValue() : list.get(dialogShowInfo.totalShownCount).intValue())) * 1000;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m145246g0() {
        return this.f122212j;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m145247h0(int i, String str) {
        return i != -1 && m145228O(str) >= i;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m145248i0(int i, DialogShowInfo dialogShowInfo, int i2) {
        if (i == -1) {
            return false;
        }
        if (i2 > 0) {
            return mqi0.m155930E(dialogShowInfo.lastShowTime, i2) && dialogShowInfo.countByDay >= i;
        }
        return mqi0.m155929D(dialogShowInfo.lastShowTime) && dialogShowInfo.countByDay >= i;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m145249j0(int i, DialogShowInfo dialogShowInfo) {
        return i != -1 && mqi0.m155951v(dialogShowInfo.lastShowTime) && dialogShowInfo.countByWeek >= i;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m145250k0(List<Long> list) {
        if (vwb.m200296J(list) || list.size() < 2) {
            return false;
        }
        return mqi0.m155944o() < list.get(0).longValue() * 1000 || mqi0.m155944o() > list.get(1).longValue() * 1000;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m145251l0(int i, DialogShowInfo dialogShowInfo) {
        return i != -1 && dialogShowInfo.totalShownCount >= i;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m145253n0(Act act, boolean z, e30 e30Var, OMSDialogInfo oMSDialogInfo) {
        if (NullChecker.m81303a(oMSDialogInfo) && m145226M(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension)) {
            m145259t0(act, oMSDialogInfo, z, false, e30Var);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final String m145254o0(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: p0 */
    public C22306c<OMSDialogInfo> m145255p0(final String str) {
        return scheduled("oms_dialog_refresh_" + str, 0, new v9j() { // from class: l.ib50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return ia20.m135119c(new v9j() { // from class: l.ya50
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return xh5.network.auth().m185898q(xc50.m208076f(str2, null)).m185887f().m185883b();
                    }
                }, OMSConfigEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.za50
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return kb50.m145223z(str2, (OMSConfigEnvelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m145256q0() {
        OMSData oMSDataM135331d = ic50.m135327j().m135331d();
        OMSDialogGlobalConstraint oMSDialogGlobalConstraint = vwb.m200296J(oMSDataM135331d.globalConstraints) ? null : oMSDataM135331d.globalConstraints.get(0);
        if (oMSDialogGlobalConstraint == null) {
            return true;
        }
        if (!mqi0.m155929D(this.f122204b.get().longValue())) {
            this.f122205c.put(0);
        }
        int iIntValue = this.f122205c.get().intValue();
        int i = oMSDialogGlobalConstraint.count;
        if (iIntValue < i || i < 0) {
            int i2 = this.f122213k;
            int i3 = oMSDialogGlobalConstraint.sessionCount;
            if (i2 < i3 || i3 < 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public void m145257r0(boolean z) {
        this.f122212j = z;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m145258s0(Act act, String str) {
        try {
            OMSDialogInfo oMSDialogInfoM145232S = m145232S(str);
            if (oMSDialogInfoM145232S == null) {
                return false;
            }
            return nc50.m158912f().m158925n(act, oMSDialogInfoM145232S);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m145259t0(final Act act, final OMSDialogInfo oMSDialogInfo, final boolean z, boolean z2, final e30<String> e30Var) {
        this.f122212j = false;
        if ((z2 && Act.foreground_() == null) || oMSDialogInfo == null) {
            return;
        }
        try {
            if (TEnum.equals(oMSDialogInfo.contentType, OMSDialogType.morph)) {
                if (nc50.m158912f().m158925n(act, oMSDialogInfo)) {
                    if (z) {
                        m145241b0(oMSDialogInfo.identifier, 0, !oMSDialogInfo.constraint.userDimension);
                    }
                    if (NullChecker.m81303a(e30Var)) {
                        e30Var.call(oMSDialogInfo.identifier);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!TEnum.equals(oMSDialogInfo.contentType, OMSDialogType.webPage)) {
                if (TEnum.equals(oMSDialogInfo.contentType, OMSDialogType.webDialog) && (act instanceof PutongAct) && !TextUtils.isEmpty(oMSDialogInfo.content.web.url)) {
                    act.duringCreated(qib0.f154714c0.accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.gb50
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            kb50.m145213C(act, oMSDialogInfo, z, e30Var, (AuthData) obj);
                        }
                    }, new e30() { // from class: l.hb50
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            kb50.m145211A((Throwable) obj);
                        }
                    }));
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(oMSDialogInfo.content.web.url)) {
                return;
            }
            act.startActivity(AccessTokenWebViewAct.m80150Z1(act, "", oMSDialogInfo.content.web.url));
            if (z) {
                m145241b0(oMSDialogInfo.identifier, 0, !oMSDialogInfo.constraint.userDimension);
            }
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(oMSDialogInfo.identifier);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m145260u0(final Act act, OMSDialogInfo oMSDialogInfo, final boolean z, final e30<String> e30Var) {
        if (oMSDialogInfo.remote) {
            m145255p0(oMSDialogInfo.f38785id).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.eb50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f90300a.m145253n0(act, z, e30Var, (OMSDialogInfo) obj);
                }
            }, new e30() { // from class: l.fb50
                @Override // p149l.e30
                public final void call(Object obj) {
                    kb50.m145215E((Throwable) obj);
                }
            }));
        } else {
            m145259t0(act, oMSDialogInfo, z, false, e30Var);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m145261v0(String str, long j) {
        DialogShowInfo dialogShowInfoM145230Q = m145230Q(str);
        dialogShowInfoM145230Q.lastShowTime = j;
        this.f122207e.m142677h(dialogShowInfoM145230Q);
    }

    /* JADX INFO: renamed from: w0 */
    public void m145262w0(boolean z) {
        this.f122206d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final void m145252m0(List<OMSDialogInfo> list) {
        this.f122210h.clear();
        if (vwb.m200296J(list)) {
            return;
        }
        for (OMSDialogInfo oMSDialogInfo : list) {
            if (oMSDialogInfo != null && !vwb.m200296J(oMSDialogInfo.events)) {
                for (TriggerEvent triggerEvent : oMSDialogInfo.events) {
                    if (!TextUtils.isEmpty(triggerEvent.dsl)) {
                        this.f122211i.put(m145254o0(oMSDialogInfo.identifier, triggerEvent.eventID, triggerEvent.properties.pageID), qib0.f154720i0.m196495c(triggerEvent.dsl));
                        if (TextUtils.equals(OMSEventId.e_swipe_after, triggerEvent.eventID) && !TEnum.equals(oMSDialogInfo.contentType, "local")) {
                            this.f122210h.add(oMSDialogInfo);
                        }
                    }
                }
            }
        }
        if (vwb.m200296J(this.f122210h)) {
            return;
        }
        Collections.sort(this.f122210h, new C17977a());
    }
}
