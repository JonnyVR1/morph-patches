package p153l;

import android.location.Address;
import com.p051p1.mobile.putong.core.data.PlaceDetailsResult;
import com.p051p1.mobile.putong.data.PlaceLocation;

/* JADX INFO: loaded from: classes10.dex */
public class xww {

    /* JADX INFO: renamed from: a */
    public String f196562a;

    /* JADX INFO: renamed from: b */
    public String f196563b;

    /* JADX INFO: renamed from: c */
    public double f196564c;

    /* JADX INFO: renamed from: d */
    public double f196565d;

    public xww(String str, String str2, double d, double d2) {
        this.f196562a = str;
        this.f196563b = str2;
        this.f196564c = d;
        this.f196565d = d2;
    }

    /* JADX INFO: renamed from: a */
    public static xww m213446a(Address address) {
        return new xww(address.getFeatureName(), address.getAddressLine(0), address.getLatitude(), address.getLongitude());
    }

    /* JADX INFO: renamed from: b */
    public static xww m213447b(PlaceDetailsResult placeDetailsResult) {
        String str = placeDetailsResult.name;
        String str2 = placeDetailsResult.formatted_address;
        PlaceLocation placeLocation = placeDetailsResult.geometry.location;
        return new xww(str, str2, placeLocation.lat, placeLocation.lng);
    }

    /* JADX INFO: renamed from: c */
    public String m213448c() {
        return this.f196563b;
    }

    /* JADX INFO: renamed from: d */
    public double m213449d() {
        return this.f196564c;
    }

    /* JADX INFO: renamed from: e */
    public double m213450e() {
        return this.f196565d;
    }

    /* JADX INFO: renamed from: f */
    public String m213451f() {
        return this.f196562a;
    }
}
