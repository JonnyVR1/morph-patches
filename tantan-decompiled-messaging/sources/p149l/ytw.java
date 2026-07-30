package p149l;

import android.location.Address;
import com.p046p1.mobile.putong.core.data.PlaceDetailsResult;
import com.p046p1.mobile.putong.data.PlaceLocation;

/* JADX INFO: loaded from: classes10.dex */
public class ytw {

    /* JADX INFO: renamed from: a */
    public String f200025a;

    /* JADX INFO: renamed from: b */
    public String f200026b;

    /* JADX INFO: renamed from: c */
    public double f200027c;

    /* JADX INFO: renamed from: d */
    public double f200028d;

    public ytw(String str, String str2, double d, double d2) {
        this.f200025a = str;
        this.f200026b = str2;
        this.f200027c = d;
        this.f200028d = d2;
    }

    /* JADX INFO: renamed from: a */
    public static ytw m216088a(Address address) {
        return new ytw(address.getFeatureName(), address.getAddressLine(0), address.getLatitude(), address.getLongitude());
    }

    /* JADX INFO: renamed from: b */
    public static ytw m216089b(PlaceDetailsResult placeDetailsResult) {
        String str = placeDetailsResult.name;
        String str2 = placeDetailsResult.formatted_address;
        PlaceLocation placeLocation = placeDetailsResult.geometry.location;
        return new ytw(str, str2, placeLocation.lat, placeLocation.lng);
    }

    /* JADX INFO: renamed from: c */
    public String m216090c() {
        return this.f200026b;
    }

    /* JADX INFO: renamed from: d */
    public double m216091d() {
        return this.f200027c;
    }

    /* JADX INFO: renamed from: e */
    public double m216092e() {
        return this.f200028d;
    }

    /* JADX INFO: renamed from: f */
    public String m216093f() {
        return this.f200025a;
    }
}
