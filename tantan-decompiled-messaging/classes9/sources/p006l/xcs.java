package p006l;

import android.view.View;
import com.google.android.gms.ads.AdView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.mkd0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xcs extends o0n {

    /* JADX INFO: renamed from: h */
    public String f27451h = "ca-app-pub-6567608331519569/1198718362";

    /* JADX INFO: renamed from: i */
    public boolean f27452i = false;

    /* JADX INFO: renamed from: b */
    public boolean m27198b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public c<View> m27199c(Act act) {
        if (!r70.m22713g().m22714f()) {
            return c.just((Object) null);
        }
        if (!this.f27452i) {
            mo12565h(act, null);
        }
        return m27201m(act);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AdView m27200l(AdView adView) {
        if (NullChecker.a(this.f17965b)) {
            this.f17965b.a();
        }
        if (NullChecker.a(adView)) {
            this.f17965b = adView;
        }
        return adView;
    }

    /* JADX INFO: renamed from: m */
    public final c<View> m27201m(Act act) {
        return ld2.INSTANCE.m18655f(act, 7, this.f27451h).take(1).map(new w9j() { // from class: l.wcs
            public final Object call(Object obj) {
                return this.f25102a.m27200l((AdView) obj);
            }
        }).compose(mkd0.R());
    }
}
