package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class ohv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Context f144052a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f144053b;

    public ohv0(Context context, rmw0 rmw0Var) {
        this.f144052a = context;
        this.f144053b = rmw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nhv0 m164462a() throws Exception {
        Bundle bundle;
        vny0.m199080r();
        String string = !((Boolean) d1s0.m109677c().m144697a(m7s0.f132189c6)).booleanValue() ? "" : this.f144052a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132215e6)).booleanValue() ? this.f144052a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        vny0.m199080r();
        Context context = this.f144052a;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132202d6)).booleanValue()) {
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
        return new nhv0(string, string2, bundle, null);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 18;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f144053b.mo122102R(new Callable() { // from class: l.lhv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f128144a.m164462a();
            }
        });
    }
}
