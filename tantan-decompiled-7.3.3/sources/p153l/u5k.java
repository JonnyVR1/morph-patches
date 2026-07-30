package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: classes9.dex */
public class u5k extends owl {

    /* JADX INFO: renamed from: c */
    public long f177657c;

    @Override // p153l.mwl
    /* JADX INFO: renamed from: d */
    public void mo102761d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo102761d(act, str, pushMessageCustom);
        m194606r();
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        m194606r();
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: k */
    public boolean mo102762k(String str) {
        return "live.summary.refresh".equals(str);
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return "live/updateLiveSummary".equals(str);
    }

    /* JADX INFO: renamed from: r */
    public void m194606r() {
        if (!wft.m206159b(2)) {
            ((fk3) tbs.m190077m(itd0.f116820b)).m125942I("live_schema");
        } else if (pzi0.m174454o() - this.f177657c > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            this.f177657c = pzi0.m174454o();
            t4u.f172135e.onNext(Boolean.FALSE);
        }
    }
}
