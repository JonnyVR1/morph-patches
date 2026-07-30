package p009l;

import android.content.Context;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fnf extends erw {
    public fnf(Context context) {
        super(context);
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: e */
    public cj2 mo14530e() {
        return upa.N3() ? new bnf(m26035r(), this) : super.mo14530e();
    }

    @Override // p009l.zw2
    /* JADX INFO: renamed from: g */
    public fr2 mo14531g() {
        return (!upa.N3() || IntlCountryCodeController.v()) ? super.mo14531g() : new hnf();
    }
}
