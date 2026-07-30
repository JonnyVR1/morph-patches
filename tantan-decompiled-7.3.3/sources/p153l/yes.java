package p153l;

import android.view.View;
import com.google.android.gms.ads.AdView;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class yes extends o2n {

    /* JADX INFO: renamed from: h */
    public String f199394h = "ca-app-pub-6567608331519569/1198718362";

    /* JADX INFO: renamed from: i */
    public boolean f199395i = false;

    @Override // p153l.z60
    /* JADX INFO: renamed from: b */
    public boolean mo109583b() {
        return true;
    }

    @Override // p153l.z60
    /* JADX INFO: renamed from: c */
    public C22421c<View> mo109584c(Act act) {
        if (!n70.m161856g().m161857f()) {
            return C22421c.just(null);
        }
        if (!this.f199395i) {
            mo125406h(act, null);
        }
        return m215447m(act);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AdView m215446l(AdView adView) {
        if (NullChecker.m82486a(this.f144750b)) {
            this.f144750b.m12272a();
        }
        if (NullChecker.m82486a(adView)) {
            this.f144750b = adView;
        }
        return adView;
    }

    /* JADX INFO: renamed from: m */
    public final C22421c<View> m215447m(Act act) {
        return sd2.INSTANCE.m185428f(act, 7, this.f199394h).take(1).map(new qcj() { // from class: l.xes
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f193976a.m215446l((AdView) obj);
            }
        }).compose(psd0.m173607R());
    }
}
