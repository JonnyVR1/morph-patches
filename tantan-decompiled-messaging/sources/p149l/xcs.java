package p149l;

import android.view.View;
import com.google.android.gms.ads.AdView;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class xcs extends o0n {

    /* JADX INFO: renamed from: h */
    public String f192254h = "ca-app-pub-6567608331519569/1198718362";

    /* JADX INFO: renamed from: i */
    public boolean f192255i = false;

    @Override // p149l.d70
    /* JADX INFO: renamed from: b */
    public boolean mo100436b() {
        return true;
    }

    @Override // p149l.d70
    /* JADX INFO: renamed from: c */
    public C22306c<View> mo100437c(Act act) {
        if (!r70.m178118g().m178119f()) {
            return C22306c.just(null);
        }
        if (!this.f192255i) {
            mo100438h(act, null);
        }
        return m208131m(act);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AdView m208130l(AdView adView) {
        if (NullChecker.m81303a(this.f141344b)) {
            this.f141344b.m12218a();
        }
        if (NullChecker.m81303a(adView)) {
            this.f141344b = adView;
        }
        return adView;
    }

    /* JADX INFO: renamed from: m */
    public final C22306c<View> m208131m(Act act) {
        return ld2.INSTANCE.m149388f(act, 7, this.f192254h).take(1).map(new w9j() { // from class: l.wcs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185709a.m208130l((AdView) obj);
            }
        }).compose(mkd0.m154966R());
    }
}
