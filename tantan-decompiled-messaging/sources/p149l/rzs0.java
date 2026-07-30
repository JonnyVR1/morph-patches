package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.p046p1.mobile.putong.data.User;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class rzs0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final Context f161677a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f161678b;

    /* JADX INFO: renamed from: c */
    public final aiw0 f161679c;

    /* JADX INFO: renamed from: d */
    public final m0t0 f161680d;

    /* JADX INFO: renamed from: e */
    public String f161681e = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: f */
    public int f161682f = -1;

    public rzs0(Context context, aiw0 aiw0Var, m0t0 m0t0Var) {
        this.f161678b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f161679c = aiw0Var;
        this.f161677a = context;
        this.f161680d = m0t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m181762a() {
        this.f161678b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f161678b, "gad_has_consent_for_cookies");
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132463y0)).booleanValue();
        SharedPreferences sharedPreferences = this.f161678b;
        if (!zBooleanValue) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.f161678b, "IABTCF_TCString");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m181763b() {
        this.f161679c.mo96948g(true);
        s5r0.m182373c(this.f161677a);
    }

    /* JADX INFO: renamed from: c */
    public final void m181764c(String str, int i) {
        Context context;
        boolean z = true;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132439w0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals(User.ID_TEAM_ACCOUNT)))) {
            z = false;
        }
        this.f161679c.mo96948g(z);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132280j6)).booleanValue() && z && (context = this.f161677a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132463y0)).booleanValue()) {
            if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                if (i != this.f161679c.zzb()) {
                    m181763b();
                }
                this.f161679c.zzE(i);
                return;
            }
            if (Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, User.ID_TEAM_ACCOUNT);
                if (string != null && !string.equals(this.f161679c.mo96963v(str))) {
                    m181763b();
                }
                this.f161679c.mo96943b(str, string);
                return;
            }
            return;
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", User.ID_TEAM_ACCOUNT);
        int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String strValueOf = String.valueOf(str);
        int iHashCode = strValueOf.hashCode();
        if (iHashCode == -2004976699) {
            if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals(User.ID_TEAM_ACCOUNT) || this.f161681e.equals(string2)) {
                return;
            }
            this.f161681e = string2;
            m181764c(string2, i2);
            return;
        }
        if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132439w0)).booleanValue() || i2 == -1 || this.f161682f == i2) {
                return;
            }
            this.f161682f = i2;
            m181764c(string2, i2);
        }
    }
}
