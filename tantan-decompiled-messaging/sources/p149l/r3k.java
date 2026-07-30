package p149l;

import android.location.Address;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class r3k extends d90 {

    /* JADX INFO: renamed from: c */
    public final Address f157539c;

    public r3k(double d, double d2, @NonNull Address address) {
        super(d, d2);
        this.f157539c = address;
    }

    @Override // p149l.d90
    /* JADX INFO: renamed from: a */
    public String mo110404a() {
        String strMo110406c = mo110406c();
        String strMo110405b = mo110405b();
        String countryName = this.f157539c.getCountryName();
        if (TextUtils.isEmpty(strMo110406c) || TextUtils.isEmpty(strMo110405b) || TextUtils.isEmpty(countryName)) {
            int maxAddressLineIndex = this.f157539c.getMaxAddressLineIndex();
            Address address = this.f157539c;
            return maxAddressLineIndex >= 0 ? address.getAddressLine(0) : address.getFeatureName();
        }
        return strMo110406c + ", " + strMo110405b + ", " + countryName;
    }

    @Override // p149l.d90
    /* JADX INFO: renamed from: b */
    public String mo110405b() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f157539c.getLocality());
        Address address = this.f157539c;
        return !zIsEmpty ? address.getLocality() : address.getAdminArea();
    }

    @Override // p149l.d90
    /* JADX INFO: renamed from: c */
    public String mo110406c() {
        return this.f157539c.getSubLocality();
    }

    @Override // p149l.d90
    /* JADX INFO: renamed from: f */
    public String mo110409f() {
        return this.f157539c.getThoroughfare();
    }
}
