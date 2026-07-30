package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.DialogShowInfo;
import com.p051p1.mobile.putong.data.OMSConfigEnvelope;
import com.p051p1.mobile.putong.data.OMSConstraint;
import com.p051p1.mobile.putong.data.OMSCounterInfo;
import com.p051p1.mobile.putong.data.OMSData;
import com.p051p1.mobile.putong.data.OMSDialogShowInfo;
import com.p051p1.mobile.putong.data.OmsCounter;
import com.p051p1.mobile.putong.data.OmsCounterEnvelope;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class dj50 extends xi5 {

    /* JADX INFO: renamed from: a */
    public ArrayList<hk50> f88779a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<hk50> f88780b = new ArrayList<>();

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m116036A(OmsCounterEnvelope omsCounterEnvelope) {
        if (NullChecker.m82486a(omsCounterEnvelope)) {
            if (pk50.m172568j().m172574f().m181667e0()) {
                pk50.m172568j().m172574f().m181685w0(false);
            }
            pk50.m172568j().m172574f().f163426f.m156169i(omsCounterEnvelope.data);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m116040y(Throwable th) {
        if (th instanceof ApiExcep) {
            i4g0.m138493B("e_oms_counters", "", jyb.m147494Y("network_state", "fail"));
        }
    }

    /* JADX INFO: renamed from: D */
    public final List<DialogShowInfo> m116042D() {
        if (jyb.m147479J(this.f88780b)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (hk50 hk50Var : this.f88780b) {
            DialogShowInfo dialogShowInfo = new DialogShowInfo();
            dialogShowInfo.resourceId = hk50Var.f110380a;
            dialogShowInfo.totalShownCount = hk50Var.f110381b;
            dialogShowInfo.lastShowTime = hk50Var.f110382c;
            arrayList.add(dialogShowInfo);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public final OmsCounter m116043E() {
        if (jyb.m147479J(this.f88779a)) {
            return null;
        }
        OmsCounter omsCounterNew_ = OmsCounter.new_();
        for (hk50 hk50Var : this.f88779a) {
            omsCounterNew_.counters.add(m116047I(hk50Var.f110380a, hk50Var.f110381b, hk50Var.f110382c));
        }
        return omsCounterNew_;
    }

    /* JADX INFO: renamed from: F */
    public OMSCounterInfo m116044F(DialogShowInfo dialogShowInfo) {
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = dialogShowInfo.totalShownCount;
        oMSConstraint.latestMs = dialogShowInfo.lastShowTime;
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.version = dialogShowInfo.version;
        oMSCounterInfo.f39632id = dialogShowInfo.resourceId;
        oMSCounterInfo.constraint = oMSConstraint;
        return oMSCounterInfo;
    }

    /* JADX INFO: renamed from: G */
    public final void m116045G() {
        if (jyb.m147479J(this.f88780b)) {
            return;
        }
        pk50.m172568j().m172574f().f163425e.m156170j(m116042D());
    }

    /* JADX INFO: renamed from: H */
    public void m116046H(boolean z) {
        m116045G();
        m116048J(z);
    }

    /* JADX INFO: renamed from: I */
    public final OMSCounterInfo m116047I(String str, int i, long j) {
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.f39632id = str;
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.count = i;
        oMSConstraint.latestMs = j;
        oMSCounterInfo.constraint = oMSConstraint;
        return oMSCounterInfo;
    }

    /* JADX INFO: renamed from: J */
    public final void m116048J(boolean z) {
        OmsCounter omsCounterM116043E = m116043E();
        if (omsCounterM116043E == null || jyb.m147479J(omsCounterM116043E.counters)) {
            omsCounterM116043E = OmsCounter.new_();
            OMSDialogShowInfo oMSDialogShowInfo = pk50.m172568j().m172574f().f163426f.get();
            if (NullChecker.m82486a(oMSDialogShowInfo)) {
                Iterator<DialogShowInfo> it = oMSDialogShowInfo.showInfos.values().iterator();
                while (it.hasNext()) {
                    omsCounterM116043E.counters.add(m116044F(it.next()));
                }
            }
        }
        m116053O(omsCounterM116043E, z);
    }

    /* JADX INFO: renamed from: K */
    public boolean m116049K() {
        return pk50.m172568j().m172574f().f163425e.get().showInfos.size() <= 0;
    }

    /* JADX INFO: renamed from: L */
    public boolean m116050L() {
        if (!pk50.m172568j().m172574f().m181667e0() && pk50.m172568j().m172574f().f163426f.get().showInfos.size() > 0) {
            return false;
        }
        if (!pk50.m172568j().m172574f().m181667e0()) {
            return true;
        }
        pk50.m172568j().m172574f().f163426f.get().showInfos.clear();
        return true;
    }

    /* JADX INFO: renamed from: M */
    public void m116051M(List<hk50> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f88780b.addAll(list);
    }

    /* JADX INFO: renamed from: N */
    public void m116052N(List<hk50> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f88779a.addAll(list);
    }

    /* JADX INFO: renamed from: O */
    public void m116053O(final OmsCounter omsCounter, final boolean z) {
        scheduled("post_oms_counter", -1, new pcj() { // from class: l.xi50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(new pcj() { // from class: l.bj50
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return xi5.network.auth().m209043q(xi5.m211107i(String.format(Locale.US, "/oms/me/counters?version=%s&deviceID=%s&login=%b&reinstallTimestamp=%d", OMSData.OMS_CONFIG_VERSION, yp50.m217001d(), Boolean.valueOf(z), uqb0.f180421w.get()))).m209038l(z1d0.create(Network.JSON, omsCounter.toJson())).m209028b();
                    }
                }, OmsCounterEnvelope.JSON_ADAPTER).compose(psd0.m173592C());
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.yi50
            @Override // p153l.y20
            public final void call(Object obj) {
                dj50.m116036A((OmsCounterEnvelope) obj);
            }
        }, new y20() { // from class: l.zi50
            @Override // p153l.y20
            public final void call(Object obj) {
                dj50.m116040y((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public C22421c<OMSConfigEnvelope> m116054P(OMSData oMSData) {
        return m116055Q(oMSData, "default");
    }

    /* JADX INFO: renamed from: Q */
    public C22421c<OMSConfigEnvelope> m116055Q(final OMSData oMSData, String str) {
        return scheduled("oms_counter_refresh_" + str, 0, new pcj() { // from class: l.aj50
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.cj50
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return xi5.network.auth().m209043q(xi5.m211107i("/oms/me/counters?deviceID=" + yp50.m217001d())).m209038l(z1d0.create(Network.JSON, oMSData.toJson())).m209028b();
                    }
                }, OMSConfigEnvelope.JSON_ADAPTER);
            }
        });
    }
}
