package p009l;

import android.location.Address;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class r3k extends d90 {

    /* JADX INFO: renamed from: c */
    public final Address f19621c;

    public r3k(double d, double d2, @NonNull Address address) {
        super(d, d2);
        this.f19621c = address;
    }

    @Override // p009l.d90
    /* JADX INFO: renamed from: a */
    public String mo13015a() {
        String strMo13017c = mo13017c();
        String strMo13016b = mo13016b();
        String countryName = this.f19621c.getCountryName();
        if (TextUtils.isEmpty(strMo13017c) || TextUtils.isEmpty(strMo13016b) || TextUtils.isEmpty(countryName)) {
            int maxAddressLineIndex = this.f19621c.getMaxAddressLineIndex();
            Address address = this.f19621c;
            return maxAddressLineIndex >= 0 ? address.getAddressLine(0) : address.getFeatureName();
        }
        return strMo13017c + ", " + strMo13016b + ", " + countryName;
    }

    @Override // p009l.d90
    /* JADX INFO: renamed from: b */
    public String mo13016b() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f19621c.getLocality());
        Address address = this.f19621c;
        return !zIsEmpty ? address.getLocality() : address.getAdminArea();
    }

    @Override // p009l.d90
    /* JADX INFO: renamed from: c */
    public String mo13017c() {
        return this.f19621c.getSubLocality();
    }

    @Override // p009l.d90
    /* JADX INFO: renamed from: f */
    public String mo13020f() {
        return this.f19621c.getThoroughfare();
    }
}
