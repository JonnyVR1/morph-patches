package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.p051p1.mobile.putong.data.User;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class x8t0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final Context f192871a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f192872b;

    /* JADX INFO: renamed from: c */
    public final grw0 f192873c;

    /* JADX INFO: renamed from: d */
    public final s9t0 f192874d;

    /* JADX INFO: renamed from: e */
    public String f192875e = User.ID_TEAM_ACCOUNT;

    /* JADX INFO: renamed from: f */
    public int f192876f = -1;

    public x8t0(Context context, grw0 grw0Var, s9t0 s9t0Var) {
        this.f192872b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f192873c = grw0Var;
        this.f192871a = context;
        this.f192874d = s9t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m209752a() {
        this.f192872b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f192872b, "gad_has_consent_for_cookies");
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168534y0)).booleanValue();
        SharedPreferences sharedPreferences = this.f192872b;
        if (!zBooleanValue) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.f192872b, "IABTCF_TCString");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m209753b() {
        this.f192873c.mo131897g(true);
        yer0.m215444c(this.f192871a);
    }

    /* JADX INFO: renamed from: c */
    public final void m209754c(String str, int i) {
        Context context;
        boolean z = true;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168510w0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals(User.ID_TEAM_ACCOUNT)))) {
            z = false;
        }
        this.f192873c.mo131897g(z);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168351j6)).booleanValue() && z && (context = this.f192871a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168534y0)).booleanValue()) {
            if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                if (i != this.f192873c.zzb()) {
                    m209753b();
                }
                this.f192873c.zzE(i);
                return;
            }
            if (Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, User.ID_TEAM_ACCOUNT);
                if (string != null && !string.equals(this.f192873c.mo131912v(str))) {
                    m209753b();
                }
                this.f192873c.mo131892b(str, string);
                return;
            }
            return;
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", User.ID_TEAM_ACCOUNT);
        int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String strValueOf = String.valueOf(str);
        int iHashCode = strValueOf.hashCode();
        if (iHashCode == -2004976699) {
            if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals(User.ID_TEAM_ACCOUNT) || this.f192875e.equals(string2)) {
                return;
            }
            this.f192875e = string2;
            m209754c(string2, i2);
            return;
        }
        if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168510w0)).booleanValue() || i2 == -1 || this.f192876f == i2) {
                return;
            }
            this.f192876f = i2;
            m209754c(string2, i2);
        }
    }
}
