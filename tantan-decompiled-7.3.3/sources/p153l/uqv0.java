package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class uqv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Context f180511a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f180512b;

    public uqv0(Context context, xvw0 xvw0Var) {
        this.f180511a = context;
        this.f180512b = xvw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tqv0 m197377a() throws Exception {
        Bundle bundle;
        bxy0.m106934r();
        String string = !((Boolean) jas0.m144075c().m176505a(sgs0.f168260c6)).booleanValue() ? "" : this.f180511a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) jas0.m144075c().m176505a(sgs0.f168286e6)).booleanValue() ? this.f180511a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        bxy0.m106934r();
        Context context = this.f180511a;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168273d6)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new tqv0(string, string2, bundle, null);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 18;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f180512b.mo155969R(new Callable() { // from class: l.rqv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f164525a.m197377a();
            }
        });
    }
}
