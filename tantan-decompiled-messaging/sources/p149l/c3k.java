package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PushMessageCustom;

/* JADX INFO: loaded from: classes13.dex */
public class c3k extends aul {

    /* JADX INFO: renamed from: c */
    public long f78951c;

    @Override // p149l.ytl
    /* JADX INFO: renamed from: d */
    public void mo100100d(Act act, String str, PushMessageCustom pushMessageCustom) {
        super.mo100100d(act, str, pushMessageCustom);
        m105031r();
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        m105031r();
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: k */
    public boolean mo100101k(String str) {
        return "live.summary.refresh".equals(str);
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return "live/updateLiveSummary".equals(str);
    }

    /* JADX INFO: renamed from: r */
    public void m105031r() {
        if (!vdt.m198092b(2)) {
            ((nj3) s9s.m182763m(gld0.f103312b)).m159611I("live_schema");
        } else if (mqi0.m155944o() - this.f78951c > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            this.f78951c = mqi0.m155944o();
            s2u.f162012e.onNext(Boolean.FALSE);
        }
    }
}
