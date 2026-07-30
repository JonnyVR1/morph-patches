package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.DialogShowInfo;
import com.p046p1.mobile.putong.data.OMSConfigEnvelope;
import com.p046p1.mobile.putong.data.OMSConstraint;
import com.p046p1.mobile.putong.data.OMSCounterInfo;
import com.p046p1.mobile.putong.data.OMSData;
import com.p046p1.mobile.putong.data.OMSDialogShowInfo;
import com.p046p1.mobile.putong.data.OmsCounter;
import com.p046p1.mobile.putong.data.OmsCounterEnvelope;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class wa50 extends xh5 {

    /* JADX INFO: renamed from: a */
    public ArrayList<ac50> f185433a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<ac50> f185434b = new ArrayList<>();

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m202356A(OmsCounterEnvelope omsCounterEnvelope) {
        if (NullChecker.m81303a(omsCounterEnvelope)) {
            if (ic50.m135327j().m135333f().m145244e0()) {
                ic50.m135327j().m135333f().m145262w0(false);
            }
            ic50.m135327j().m135333f().f122208f.m142678i(omsCounterEnvelope.data);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m202360y(Throwable th) {
        if (th instanceof ApiExcep) {
            zvf0.m220369B("e_oms_counters", "", vwb.m200311Y("network_state", "fail"));
        }
    }

    /* JADX INFO: renamed from: D */
    public final List<DialogShowInfo> m202362D() {
        if (vwb.m200296J(this.f185434b)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ac50 ac50Var : this.f185434b) {
            DialogShowInfo dialogShowInfo = new DialogShowInfo();
            dialogShowInfo.resourceId = ac50Var.f68776a;
            dialogShowInfo.totalShownCount = ac50Var.f68777b;
            dialogShowInfo.lastShowTime = ac50Var.f68778c;
            arrayList.add(dialogShowInfo);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final OmsCounter m202363E() {
        if (vwb.m200296J(this.f185433a)) {
            return null;
        }
        OmsCounter omsCounterNew_ = OmsCounter.new_();
        for (ac50 ac50Var : this.f185433a) {
            omsCounterNew_.counters.add(m202367I(ac50Var.f68776a, ac50Var.f68777b, ac50Var.f68778c));
        }
        return omsCounterNew_;
    }

    /* JADX INFO: renamed from: F */
    public OMSCounterInfo m202364F(DialogShowInfo dialogShowInfo) {
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = dialogShowInfo.totalShownCount;
        oMSConstraint.latestMs = dialogShowInfo.lastShowTime;
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.version = dialogShowInfo.version;
        oMSCounterInfo.f38784id = dialogShowInfo.resourceId;
        oMSCounterInfo.constraint = oMSConstraint;
        return oMSCounterInfo;
    }

    /* JADX INFO: renamed from: G */
    public final void m202365G() {
        if (vwb.m200296J(this.f185434b)) {
            return;
        }
        ic50.m135327j().m135333f().f122207e.m142679j(m202362D());
    }

    /* JADX INFO: renamed from: H */
    public void m202366H(boolean z) {
        m202365G();
        m202368J(z);
    }

    /* JADX INFO: renamed from: I */
    public final OMSCounterInfo m202367I(String str, int i, long j) {
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.f38784id = str;
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = i;
        oMSConstraint.latestMs = j;
        oMSCounterInfo.constraint = oMSConstraint;
        return oMSCounterInfo;
    }

    /* JADX INFO: renamed from: J */
    public final void m202368J(boolean z) {
        OmsCounter omsCounterM202363E = m202363E();
        if (omsCounterM202363E == null || vwb.m200296J(omsCounterM202363E.counters)) {
            omsCounterM202363E = OmsCounter.new_();
            OMSDialogShowInfo oMSDialogShowInfo = ic50.m135327j().m135333f().f122208f.get();
            if (NullChecker.m81303a(oMSDialogShowInfo)) {
                Iterator<DialogShowInfo> it = oMSDialogShowInfo.showInfos.values().iterator();
                while (it.hasNext()) {
                    omsCounterM202363E.counters.add(m202364F(it.next()));
                }
            }
        }
        m202373O(omsCounterM202363E, z);
    }

    /* JADX INFO: renamed from: K */
    public boolean m202369K() {
        return ic50.m135327j().m135333f().f122207e.get().showInfos.size() <= 0;
    }

    /* JADX INFO: renamed from: L */
    public boolean m202370L() {
        if (!ic50.m135327j().m135333f().m145244e0() && ic50.m135327j().m135333f().f122208f.get().showInfos.size() > 0) {
            return false;
        }
        if (!ic50.m135327j().m135333f().m145244e0()) {
            return true;
        }
        ic50.m135327j().m135333f().f122208f.get().showInfos.clear();
        return true;
    }

    /* JADX INFO: renamed from: M */
    public void m202371M(List<ac50> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f185434b.addAll(list);
    }

    /* JADX INFO: renamed from: N */
    public void m202372N(List<ac50> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f185433a.addAll(list);
    }

    /* JADX INFO: renamed from: O */
    public void m202373O(final OmsCounter omsCounter, final boolean z) {
        scheduled("post_oms_counter", -1, new v9j() { // from class: l.qa50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(new v9j() { // from class: l.ua50
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return xh5.network.auth().m185898q(xh5.m208761i(String.format(Locale.US, "/oms/me/counters?version=%s&deviceID=%s&login=%b&reinstallTimestamp=%d", OMSData.OMS_CONFIG_VERSION, sh50.m184159d(), Boolean.valueOf(z), qib0.f154738w.get()))).m185893l(utc0.create(Network.JSON, omsCounter.toJson())).m185883b();
                    }
                }, OmsCounterEnvelope.JSON_ADAPTER).compose(mkd0.m154951C());
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ra50
            @Override // p149l.e30
            public final void call(Object obj) {
                wa50.m202356A((OmsCounterEnvelope) obj);
            }
        }, new e30() { // from class: l.sa50
            @Override // p149l.e30
            public final void call(Object obj) {
                wa50.m202360y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public C22306c<OMSConfigEnvelope> m202374P(OMSData oMSData) {
        return m202375Q(oMSData, "default");
    }

    /* JADX INFO: renamed from: Q */
    public C22306c<OMSConfigEnvelope> m202375Q(final OMSData oMSData, String str) {
        return scheduled("oms_counter_refresh_" + str, 0, new v9j() { // from class: l.ta50
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.va50
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return xh5.network.auth().m185898q(xh5.m208761i("/oms/me/counters?deviceID=" + sh50.m184159d())).m185893l(utc0.create(Network.JSON, oMSData.toJson())).m185883b();
                    }
                }, OMSConfigEnvelope.JSON_ADAPTER);
            }
        });
    }
}
