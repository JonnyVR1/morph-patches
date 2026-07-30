package p009l;

import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.data.DialogShowInfo;
import com.p1.mobile.putong.data.OMSConfigEnvelope;
import com.p1.mobile.putong.data.OMSConstraint;
import com.p1.mobile.putong.data.OMSCounterInfo;
import com.p1.mobile.putong.data.OMSData;
import com.p1.mobile.putong.data.OMSDialogShowInfo;
import com.p1.mobile.putong.data.OmsCounter;
import com.p1.mobile.putong.data.OmsCounterEnvelope;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.ia20;
import l.j760;
import l.ka20;
import l.mkd0;
import l.qib0;
import l.sh50;
import l.utc0;
import l.v9j;
import l.vwb;
import l.xh5;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wa50 extends xh5 {

    /* JADX INFO: renamed from: a */
    public ArrayList<ac50> f21963a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<ac50> f21964b = new ArrayList<>();

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m24012A(OmsCounterEnvelope omsCounterEnvelope) {
        if (NullChecker.a(omsCounterEnvelope)) {
            if (ic50.m16316j().m16322f().m17410e0()) {
                ic50.m16316j().m16322f().m17428w0(false);
            }
            ic50.m16316j().m16322f().f15577f.m17188i(omsCounterEnvelope.data);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m24016y(Throwable th) {
        if (th instanceof ApiExcep) {
            zvf0.B("e_oms_counters", "", new j760[]{vwb.Y("network_state", "fail")});
        }
    }

    /* JADX INFO: renamed from: D */
    public final List<DialogShowInfo> m24018D() {
        if (vwb.J(this.f21964b)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ac50 ac50Var : this.f21964b) {
            DialogShowInfo dialogShowInfo = new DialogShowInfo();
            dialogShowInfo.resourceId = ac50Var.f9379a;
            dialogShowInfo.totalShownCount = ac50Var.f9380b;
            dialogShowInfo.lastShowTime = ac50Var.f9381c;
            arrayList.add(dialogShowInfo);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final OmsCounter m24019E() {
        if (vwb.J(this.f21963a)) {
            return null;
        }
        OmsCounter omsCounterNew_ = OmsCounter.new_();
        for (ac50 ac50Var : this.f21963a) {
            omsCounterNew_.counters.add(m24023I(ac50Var.f9379a, ac50Var.f9380b, ac50Var.f9381c));
        }
        return omsCounterNew_;
    }

    /* JADX INFO: renamed from: F */
    public OMSCounterInfo m24020F(DialogShowInfo dialogShowInfo) {
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = dialogShowInfo.totalShownCount;
        oMSConstraint.latestMs = dialogShowInfo.lastShowTime;
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.version = dialogShowInfo.version;
        oMSCounterInfo.id = dialogShowInfo.resourceId;
        oMSCounterInfo.constraint = oMSConstraint;
        return oMSCounterInfo;
    }

    /* JADX INFO: renamed from: G */
    public final void m24021G() {
        if (vwb.J(this.f21964b)) {
            return;
        }
        ic50.m16316j().m16322f().f15576e.m17189j(m24018D());
    }

    /* JADX INFO: renamed from: H */
    public void m24022H(boolean z) {
        m24021G();
        m24024J(z);
    }

    /* JADX INFO: renamed from: I */
    public final OMSCounterInfo m24023I(String str, int i, long j) {
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.id = str;
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = i;
        oMSConstraint.latestMs = j;
        oMSCounterInfo.constraint = oMSConstraint;
        return oMSCounterInfo;
    }

    /* JADX INFO: renamed from: J */
    public final void m24024J(boolean z) {
        OmsCounter omsCounterM24019E = m24019E();
        if (omsCounterM24019E == null || vwb.J(omsCounterM24019E.counters)) {
            omsCounterM24019E = OmsCounter.new_();
            OMSDialogShowInfo oMSDialogShowInfo = (OMSDialogShowInfo) ic50.m16316j().m16322f().f15577f.get();
            if (NullChecker.a(oMSDialogShowInfo)) {
                Iterator it = oMSDialogShowInfo.showInfos.values().iterator();
                while (it.hasNext()) {
                    omsCounterM24019E.counters.add(m24020F((DialogShowInfo) it.next()));
                }
            }
        }
        m24029O(omsCounterM24019E, z);
    }

    /* JADX INFO: renamed from: K */
    public boolean m24025K() {
        return ((OMSDialogShowInfo) ic50.m16316j().m16322f().f15576e.get()).showInfos.size() <= 0;
    }

    /* JADX INFO: renamed from: L */
    public boolean m24026L() {
        if (!ic50.m16316j().m16322f().m17410e0() && ((OMSDialogShowInfo) ic50.m16316j().m16322f().f15577f.get()).showInfos.size() > 0) {
            return false;
        }
        if (!ic50.m16316j().m16322f().m17410e0()) {
            return true;
        }
        ((OMSDialogShowInfo) ic50.m16316j().m16322f().f15577f.get()).showInfos.clear();
        return true;
    }

    /* JADX INFO: renamed from: M */
    public void m24027M(List<ac50> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f21964b.addAll(list);
    }

    /* JADX INFO: renamed from: N */
    public void m24028N(List<ac50> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f21963a.addAll(list);
    }

    /* JADX INFO: renamed from: O */
    public void m24029O(final OmsCounter omsCounter, final boolean z) {
        scheduled("post_oms_counter", -1, new v9j() { // from class: l.qa50
            public final Object call() {
                return new ka20(new v9j() { // from class: l.ua50
                    public final Object call() {
                        return xh5.network.auth().q(xh5.i(String.format(Locale.US, "/oms/me/counters?version=%s&deviceID=%s&login=%b&reinstallTimestamp=%d", "3.1.0", sh50.d(), Boolean.valueOf(z), qib0.w.get()))).l(utc0.create(Network.JSON, omsCounter.toJson())).b();
                    }
                }, OmsCounterEnvelope.JSON_ADAPTER).compose(mkd0.C());
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ra50
            public final void call(Object obj) {
                wa50.m24012A((OmsCounterEnvelope) obj);
            }
        }, new e30() { // from class: l.sa50
            public final void call(Object obj) {
                wa50.m24016y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public c<OMSConfigEnvelope> m24030P(OMSData oMSData) {
        return m24031Q(oMSData, "default");
    }

    /* JADX INFO: renamed from: Q */
    public c<OMSConfigEnvelope> m24031Q(final OMSData oMSData, String str) {
        return scheduled("oms_counter_refresh_" + str, 0, new v9j() { // from class: l.ta50
            public final Object call() {
                return ia20.c(new v9j() { // from class: l.va50
                    public final Object call() {
                        return xh5.network.auth().q(xh5.i("/oms/me/counters?deviceID=" + sh50.d())).l(utc0.create(Network.JSON, oMSData.toJson())).b();
                    }
                }, OMSConfigEnvelope.JSON_ADAPTER);
            }
        });
    }
}
