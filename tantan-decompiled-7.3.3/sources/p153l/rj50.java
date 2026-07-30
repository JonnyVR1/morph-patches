package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.DialogShowInfo;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.data.OMSConfigEnvelope;
import com.p051p1.mobile.putong.data.OMSData;
import com.p051p1.mobile.putong.data.OMSDialogGlobalConstraint;
import com.p051p1.mobile.putong.data.OMSDialogInfo;
import com.p051p1.mobile.putong.data.OMSDialogType;
import com.p051p1.mobile.putong.data.OMSEventId;
import com.p051p1.mobile.putong.data.OmsCounter;
import com.p051p1.mobile.putong.data.TriggerEvent;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public class rj50 extends xi5 {

    /* JADX INFO: renamed from: a */
    public C22508b<OMSDialogInfo> f163421a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public byd0 f163422b = new byd0("limitDialogLastShowTime" + uqb0.f180397c0.userId(), 0L);

    /* JADX INFO: renamed from: c */
    public vxd0 f163423c = new vxd0("limitDialogShowCountByDay" + uqb0.f180397c0.userId(), 0);

    /* JADX INFO: renamed from: d */
    public jxd0 f163424d = new jxd0("isFirstToMerge" + uqb0.f180397c0.userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: e */
    public lxd0 f163425e = new lxd0("dialog_show_info_device", true);

    /* JADX INFO: renamed from: f */
    public lxd0 f163426f = new lxd0("dialog_show_info_v1" + uqb0.f180397c0.userId(), true);

    /* JADX INFO: renamed from: g */
    public HashMap<String, Integer> f163427g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<OMSDialogInfo> f163428h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public HashMap<String, y1f> f163429i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public boolean f163430j;

    /* JADX INFO: renamed from: k */
    public int f163431k;

    /* JADX INFO: renamed from: l.rj50$a */
    public class C19855a implements Comparator<OMSDialogInfo> {
        public C19855a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(OMSDialogInfo oMSDialogInfo, OMSDialogInfo oMSDialogInfo2) {
            return oMSDialogInfo2.constraint.priority - oMSDialogInfo.constraint.priority;
        }
    }

    public rj50() {
        m181665c0();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m181634A(Throwable th) {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m181636C(Act act, OMSDialogInfo oMSDialogInfo, boolean z, y20 y20Var, AuthData authData) {
        if (!NullChecker.m82486a(authData) || TextUtils.isEmpty(authData.accessToken)) {
            return;
        }
        el50.m121105h((PutongAct) act, oMSDialogInfo, authData.accessToken, z);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(oMSDialogInfo.identifier);
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m181638E(Throwable th) {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ OMSDialogInfo m181646z(final String str, OMSConfigEnvelope oMSConfigEnvelope) {
        if (jyb.m147479J(oMSConfigEnvelope.data.dialogs)) {
            return null;
        }
        OMSData oMSDataM172572d = pk50.m172568j().m172572d();
        OMSDialogInfo oMSDialogInfo = (OMSDialogInfo) jyb.m147529r(oMSDataM172572d.dialogs, new qcj() { // from class: l.hj50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((OMSDialogInfo) obj).f39633id.equals(str));
            }
        });
        if (NullChecker.m82486a(oMSDialogInfo)) {
            oMSDataM172572d.dialogs.remove(oMSDialogInfo);
        }
        oMSDataM172572d.dialogs.add(oMSConfigEnvelope.data.dialogs.get(0));
        pk50.m172568j().m172588u(oMSDataM172572d);
        return oMSConfigEnvelope.data.dialogs.get(0);
    }

    /* JADX INFO: renamed from: K */
    public boolean m181647K(String str) {
        OMSDialogInfo oMSDialogInfoM181655S = m181655S(str);
        return NullChecker.m82486a(oMSDialogInfoM181655S) && oMSDialogInfoM181655S.blockCard;
    }

    /* JADX INFO: renamed from: L */
    public void m181648L(Act act, boolean z, y20<String> y20Var) {
        if (jyb.m147479J(this.f163428h)) {
            return;
        }
        for (OMSDialogInfo oMSDialogInfo : this.f163428h) {
            if (uqb0.f180403i0.m218282a(m181661Y(oMSDialogInfo.identifier, OMSEventId.e_swipe_after, "p_suggest_users_home_view")) && m181649M(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension)) {
                m181683u0(act, oMSDialogInfo, z, y20Var);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean m181649M(String str, boolean z) {
        DialogShowInfo dialogShowInfoM181653Q = z ? m181653Q(str) : m181652P(str);
        OMSDialogInfo oMSDialogInfoM181655S = m181655S(str);
        if (oMSDialogInfoM181655S == null || dialogShowInfoM181653Q.noRemind || m181674l0(oMSDialogInfoM181655S.constraint.count, dialogShowInfoM181653Q) || m181668f0(oMSDialogInfoM181655S.constraint.frequency, dialogShowInfoM181653Q) || m181673k0(oMSDialogInfoM181655S.constraint.timeRange) || m181671i0(oMSDialogInfoM181655S.constraint.timePerDay, dialogShowInfoM181653Q, 0) || m181672j0(oMSDialogInfoM181655S.constraint.timePerWeek, dialogShowInfoM181653Q) || m181670h0(oMSDialogInfoM181655S.constraint.sessionCount, str)) {
            return false;
        }
        return oMSDialogInfoM181655S.independent || m181679q0();
    }

    /* JADX INFO: renamed from: N */
    public boolean m181650N(String str, boolean z) {
        DialogShowInfo dialogShowInfoM181653Q = z ? m181653Q(str) : m181652P(str);
        OMSAdCardInfo oMSAdCardInfoM181654R = m181654R(str);
        return (oMSAdCardInfoM181654R == null || dialogShowInfoM181653Q.noRemind || m181674l0(oMSAdCardInfoM181654R.constraint.count, dialogShowInfoM181653Q) || m181668f0(oMSAdCardInfoM181654R.constraint.frequency, dialogShowInfoM181653Q) || m181673k0(oMSAdCardInfoM181654R.constraint.timeRange) || m181671i0(oMSAdCardInfoM181654R.constraint.timePerDay, dialogShowInfoM181653Q, 0) || m181672j0(oMSAdCardInfoM181654R.constraint.timePerWeek, dialogShowInfoM181653Q) || m181670h0(oMSAdCardInfoM181654R.constraint.sessionCount, str)) ? false : true;
    }

    /* JADX INFO: renamed from: O */
    public final int m181651O(String str) {
        if (this.f163427g.containsKey(str)) {
            return this.f163427g.get(str).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: P */
    public DialogShowInfo m181652P(String str) {
        DialogShowInfo dialogShowInfo = this.f163426f.get().showInfos.get(str);
        if (dialogShowInfo != null) {
            return dialogShowInfo;
        }
        DialogShowInfo dialogShowInfoNew_ = DialogShowInfo.new_();
        dialogShowInfoNew_.resourceId = str;
        return dialogShowInfoNew_;
    }

    /* JADX INFO: renamed from: Q */
    public DialogShowInfo m181653Q(String str) {
        DialogShowInfo dialogShowInfo = this.f163425e.get().showInfos.get(str);
        if (dialogShowInfo != null) {
            return dialogShowInfo;
        }
        DialogShowInfo dialogShowInfoNew_ = DialogShowInfo.new_();
        dialogShowInfoNew_.resourceId = str;
        return dialogShowInfoNew_;
    }

    /* JADX INFO: renamed from: R */
    public OMSAdCardInfo m181654R(final String str) {
        List<OMSAdCardInfo> listM172576h = pk50.m172568j().m172576h();
        if (jyb.m147479J(listM172576h)) {
            return null;
        }
        return (OMSAdCardInfo) jyb.m147529r(listM172576h, new qcj() { // from class: l.kj50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((OMSAdCardInfo) obj).identifier));
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public OMSDialogInfo m181655S(final String str) {
        List<OMSDialogInfo> listM172577i = pk50.m172568j().m172577i();
        if (jyb.m147479J(listM172577i)) {
            return null;
        }
        return (OMSDialogInfo) jyb.m147529r(listM172577i, new qcj() { // from class: l.jj50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((OMSDialogInfo) obj).identifier));
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public List<pf60<String, String>> m181656T(String str) {
        OMSDialogInfo oMSDialogInfoM181655S = m181655S(str);
        if (oMSDialogInfoM181655S != null) {
            Map<String, String> map = oMSDialogInfoM181655S.mercury.server;
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new pf60(entry.getKey(), entry.getValue()));
                }
                return arrayList;
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: U */
    public JSONObject m181657U(String str, JSONObject jSONObject) {
        OMSDialogInfo oMSDialogInfoM181655S;
        if (!TextUtils.isEmpty(str) && (oMSDialogInfoM181655S = m181655S(str)) != null) {
            Map<String, String> map = oMSDialogInfoM181655S.mercury.server;
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
    public pf60[] m181658V(String str, pf60... pf60VarArr) {
        OMSDialogInfo oMSDialogInfoM181655S;
        if (!TextUtils.isEmpty(str) && (oMSDialogInfoM181655S = m181655S(str)) != null) {
            Map<String, String> map = oMSDialogInfoM181655S.mercury.server;
            if (!map.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new pf60(entry.getKey(), entry.getValue()));
                }
                if (pf60VarArr != null && pf60VarArr.length > 0) {
                    for (pf60 pf60Var : pf60VarArr) {
                        arrayList.add(pf60Var);
                    }
                }
                pf60[] pf60VarArr2 = new pf60[arrayList.size()];
                arrayList.toArray(pf60VarArr2);
                return pf60VarArr2;
            }
        }
        return pf60VarArr;
    }

    /* JADX INFO: renamed from: W */
    public List<OMSDialogInfo> m181659W(String str, String str2) {
        ArrayList arrayList = null;
        if (str != null && str2 != null) {
            List<OMSDialogInfo> listM172577i = pk50.m172568j().m172577i();
            if (jyb.m147479J(listM172577i)) {
                return null;
            }
            for (OMSDialogInfo oMSDialogInfo : listM172577i) {
                if (!jyb.m147479J(oMSDialogInfo.events)) {
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
    public int m181660X(final String str) {
        OMSDialogInfo oMSDialogInfo;
        List<OMSDialogInfo> listM172577i = pk50.m172568j().m172577i();
        if (jyb.m147479J(listM172577i) || (oMSDialogInfo = (OMSDialogInfo) jyb.m147529r(listM172577i, new qcj() { // from class: l.qj50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((OMSDialogInfo) obj).identifier));
            }
        })) == null) {
            return 0;
        }
        return oMSDialogInfo.constraint.priority;
    }

    /* JADX INFO: renamed from: Y */
    public y1f m181661Y(String str, String str2, String str3) {
        return this.f163429i.get(m181677o0(str, str2, str3));
    }

    /* JADX INFO: renamed from: Z */
    public boolean m181662Z(String str, int i, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f163427g.put(str, Integer.valueOf(m181651O(str) + 1));
        DialogShowInfo dialogShowInfoM181653Q = z ? m181653Q(str) : m181652P(str);
        if (i > 0 ? pzi0.m174440E(dialogShowInfoM181653Q.lastShowTime, i) : pzi0.m174439D(dialogShowInfoM181653Q.lastShowTime)) {
            dialogShowInfoM181653Q.countByDay++;
        } else {
            dialogShowInfoM181653Q.countByDay = 1;
        }
        if (pzi0.m174461v(dialogShowInfoM181653Q.lastShowTime)) {
            dialogShowInfoM181653Q.countByWeek++;
        } else {
            dialogShowInfoM181653Q.countByWeek = 1;
        }
        dialogShowInfoM181653Q.lastShowTime = pzi0.m174454o();
        dialogShowInfoM181653Q.totalShownCount++;
        if (z) {
            this.f163425e.m156168h(dialogShowInfoM181653Q);
        } else {
            this.f163426f.m156168h(dialogShowInfoM181653Q);
        }
        if (!z) {
            OmsCounter omsCounterNew_ = OmsCounter.new_();
            omsCounterNew_.counters.add(pk50.m172568j().m172571c().m116044F(dialogShowInfoM181653Q));
            pk50.m172568j().m172571c().m116053O(omsCounterNew_, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m181663a0(String str) {
        DialogShowInfo dialogShowInfoM181652P = m181652P(str);
        dialogShowInfoM181652P.noRemind = true;
        this.f163426f.m156168h(dialogShowInfoM181652P);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m181664b0(String str, int i, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        m181666d0(str);
        this.f163427g.put(str, Integer.valueOf(m181651O(str) + 1));
        DialogShowInfo dialogShowInfoM181653Q = z ? m181653Q(str) : m181652P(str);
        if (i > 0 ? pzi0.m174440E(dialogShowInfoM181653Q.lastShowTime, i) : pzi0.m174439D(dialogShowInfoM181653Q.lastShowTime)) {
            dialogShowInfoM181653Q.countByDay++;
        } else {
            dialogShowInfoM181653Q.countByDay = 1;
        }
        if (pzi0.m174461v(dialogShowInfoM181653Q.lastShowTime)) {
            dialogShowInfoM181653Q.countByWeek++;
        } else {
            dialogShowInfoM181653Q.countByWeek = 1;
        }
        dialogShowInfoM181653Q.lastShowTime = pzi0.m174454o();
        dialogShowInfoM181653Q.totalShownCount++;
        if (z) {
            this.f163425e.m156168h(dialogShowInfoM181653Q);
        } else {
            this.f163426f.m156168h(dialogShowInfoM181653Q);
        }
        if (!z) {
            OmsCounter omsCounterNew_ = OmsCounter.new_();
            omsCounterNew_.counters.add(pk50.m172568j().m172571c().m116044F(dialogShowInfoM181653Q));
            pk50.m172568j().m172571c().m116053O(omsCounterNew_, false);
        }
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m181665c0() {
        pk50.m172568j().m172586s().map(new qcj() { // from class: l.ej50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((OMSData) obj).dialogs;
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ij50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115190a.m181675m0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m181666d0(String str) {
        OMSDialogInfo oMSDialogInfoM181655S = m181655S(str);
        if (NullChecker.m82486a(oMSDialogInfoM181655S) && oMSDialogInfoM181655S.independent) {
            return;
        }
        this.f163422b.put(Long.valueOf(pzi0.m174454o()));
        vxd0 vxd0Var = this.f163423c;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        this.f163431k++;
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m181667e0() {
        return this.f163424d.get().booleanValue();
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m181668f0(List<Integer> list, DialogShowInfo dialogShowInfo) {
        if (jyb.m147479J(list)) {
            return false;
        }
        return pzi0.m174454o() - dialogShowInfo.lastShowTime < ((long) (dialogShowInfo.totalShownCount >= list.size() ? list.get(list.size() - 1).intValue() : list.get(dialogShowInfo.totalShownCount).intValue())) * 1000;
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m181669g0() {
        return this.f163430j;
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m181670h0(int i, String str) {
        return i != -1 && m181651O(str) >= i;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m181671i0(int i, DialogShowInfo dialogShowInfo, int i2) {
        if (i == -1) {
            return false;
        }
        if (i2 > 0) {
            return pzi0.m174440E(dialogShowInfo.lastShowTime, i2) && dialogShowInfo.countByDay >= i;
        }
        return pzi0.m174439D(dialogShowInfo.lastShowTime) && dialogShowInfo.countByDay >= i;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m181672j0(int i, DialogShowInfo dialogShowInfo) {
        return i != -1 && pzi0.m174461v(dialogShowInfo.lastShowTime) && dialogShowInfo.countByWeek >= i;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m181673k0(List<Long> list) {
        if (jyb.m147479J(list) || list.size() < 2) {
            return false;
        }
        return pzi0.m174454o() < list.get(0).longValue() * 1000 || pzi0.m174454o() > list.get(1).longValue() * 1000;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m181674l0(int i, DialogShowInfo dialogShowInfo) {
        return i != -1 && dialogShowInfo.totalShownCount >= i;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m181676n0(Act act, boolean z, y20 y20Var, OMSDialogInfo oMSDialogInfo) {
        if (NullChecker.m82486a(oMSDialogInfo) && m181649M(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension)) {
            m181682t0(act, oMSDialogInfo, z, false, y20Var);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final String m181677o0(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* JADX INFO: renamed from: p0 */
    public C22421c<OMSDialogInfo> m181678p0(final String str) {
        return scheduled("oms_dialog_refresh_" + str, 0, new pcj() { // from class: l.pj50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return qi20.m176656c(new pcj() { // from class: l.fj50
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return xi5.network.auth().m209043q(el50.m121103f(str2, null)).m209032f().m209028b();
                    }
                }, OMSConfigEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.gj50
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return rj50.m181646z(str2, (OMSConfigEnvelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m181679q0() {
        OMSData oMSDataM172572d = pk50.m172568j().m172572d();
        OMSDialogGlobalConstraint oMSDialogGlobalConstraint = jyb.m147479J(oMSDataM172572d.globalConstraints) ? null : oMSDataM172572d.globalConstraints.get(0);
        if (oMSDialogGlobalConstraint == null) {
            return true;
        }
        if (!pzi0.m174439D(this.f163422b.get().longValue())) {
            this.f163423c.put(0);
        }
        int iIntValue = this.f163423c.get().intValue();
        int i = oMSDialogGlobalConstraint.count;
        if (iIntValue < i || i < 0) {
            int i2 = this.f163431k;
            int i3 = oMSDialogGlobalConstraint.sessionCount;
            if (i2 < i3 || i3 < 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public void m181680r0(boolean z) {
        this.f163430j = z;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m181681s0(Act act, String str) {
        try {
            OMSDialogInfo oMSDialogInfoM181655S = m181655S(str);
            if (oMSDialogInfoM181655S == null) {
                return false;
            }
            return uk50.m196472f().m196485n(act, oMSDialogInfoM181655S);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m181682t0(final Act act, final OMSDialogInfo oMSDialogInfo, final boolean z, boolean z2, final y20<String> y20Var) {
        this.f163430j = false;
        if ((z2 && Act.foreground_() == null) || oMSDialogInfo == null) {
            return;
        }
        try {
            if (TEnum.equals(oMSDialogInfo.contentType, OMSDialogType.morph)) {
                if (uk50.m196472f().m196485n(act, oMSDialogInfo)) {
                    if (z) {
                        m181664b0(oMSDialogInfo.identifier, 0, !oMSDialogInfo.constraint.userDimension);
                    }
                    if (NullChecker.m82486a(y20Var)) {
                        y20Var.call(oMSDialogInfo.identifier);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!TEnum.equals(oMSDialogInfo.contentType, OMSDialogType.webPage)) {
                if (TEnum.equals(oMSDialogInfo.contentType, OMSDialogType.webDialog) && (act instanceof PutongAct) && !TextUtils.isEmpty(oMSDialogInfo.content.web.url)) {
                    act.duringCreated(uqb0.f180397c0.accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.nj50
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            rj50.m181636C(act, oMSDialogInfo, z, y20Var, (AuthData) obj);
                        }
                    }, new y20() { // from class: l.oj50
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            rj50.m181634A((Throwable) obj);
                        }
                    }));
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(oMSDialogInfo.content.web.url)) {
                return;
            }
            act.startActivity(AccessTokenWebViewAct.m81333a2(act, "", oMSDialogInfo.content.web.url));
            if (z) {
                m181664b0(oMSDialogInfo.identifier, 0, !oMSDialogInfo.constraint.userDimension);
            }
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(oMSDialogInfo.identifier);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m181683u0(final Act act, OMSDialogInfo oMSDialogInfo, final boolean z, final y20<String> y20Var) {
        if (oMSDialogInfo.remote) {
            m181678p0(oMSDialogInfo.f39633id).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.lj50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f132306a.m181676n0(act, z, y20Var, (OMSDialogInfo) obj);
                }
            }, new y20() { // from class: l.mj50
                @Override // p153l.y20
                public final void call(Object obj) {
                    rj50.m181638E((Throwable) obj);
                }
            }));
        } else {
            m181682t0(act, oMSDialogInfo, z, false, y20Var);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m181684v0(String str, long j) {
        DialogShowInfo dialogShowInfoM181653Q = m181653Q(str);
        dialogShowInfoM181653Q.lastShowTime = j;
        this.f163425e.m156168h(dialogShowInfoM181653Q);
    }

    /* JADX INFO: renamed from: w0 */
    public void m181685w0(boolean z) {
        this.f163424d.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final void m181675m0(List<OMSDialogInfo> list) {
        this.f163428h.clear();
        if (jyb.m147479J(list)) {
            return;
        }
        for (OMSDialogInfo oMSDialogInfo : list) {
            if (oMSDialogInfo != null && !jyb.m147479J(oMSDialogInfo.events)) {
                for (TriggerEvent triggerEvent : oMSDialogInfo.events) {
                    if (!TextUtils.isEmpty(triggerEvent.dsl)) {
                        this.f163429i.put(m181677o0(oMSDialogInfo.identifier, triggerEvent.eventID, triggerEvent.properties.pageID), uqb0.f180403i0.m218284c(triggerEvent.dsl));
                        if (TextUtils.equals(OMSEventId.e_swipe_after, triggerEvent.eventID) && !TEnum.equals(oMSDialogInfo.contentType, "local")) {
                            this.f163428h.add(oMSDialogInfo);
                        }
                    }
                }
            }
        }
        if (jyb.m147479J(this.f163428h)) {
            return;
        }
        Collections.sort(this.f163428h, new C19855a());
    }
}
