package p153l;

import android.location.Address;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class j6k extends z80 {

    /* JADX INFO: renamed from: c */
    public final Address f118567c;

    public j6k(double d, double d2, @NonNull Address address) {
        super(d, d2);
        this.f118567c = address;
    }

    @Override // p153l.z80
    /* JADX INFO: renamed from: a */
    public String mo143669a() {
        String strMo143671c = mo143671c();
        String strMo143670b = mo143670b();
        String countryName = this.f118567c.getCountryName();
        if (TextUtils.isEmpty(strMo143671c) || TextUtils.isEmpty(strMo143670b) || TextUtils.isEmpty(countryName)) {
            int maxAddressLineIndex = this.f118567c.getMaxAddressLineIndex();
            Address address = this.f118567c;
            return maxAddressLineIndex >= 0 ? address.getAddressLine(0) : address.getFeatureName();
        }
        return strMo143671c + ", " + strMo143670b + ", " + countryName;
    }

    @Override // p153l.z80
    /* JADX INFO: renamed from: b */
    public String mo143670b() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f118567c.getLocality());
        Address address = this.f118567c;
        return !zIsEmpty ? address.getLocality() : address.getAdminArea();
    }

    @Override // p153l.z80
    /* JADX INFO: renamed from: c */
    public String mo143671c() {
        return this.f118567c.getSubLocality();
    }

    @Override // p153l.z80
    /* JADX INFO: renamed from: f */
    public String mo143672f() {
        return this.f118567c.getThoroughfare();
    }
}
