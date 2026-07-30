package p003l;

import android.location.Address;
import com.p000p1.mobile.putong.core.data.PlaceDetailsResult;
import com.p1.mobile.putong.data.PlaceLocation;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ytw {

    /* JADX INFO: renamed from: a */
    public String f9139a;

    /* JADX INFO: renamed from: b */
    public String f9140b;

    /* JADX INFO: renamed from: c */
    public double f9141c;

    /* JADX INFO: renamed from: d */
    public double f9142d;

    public ytw(String str, String str2, double d, double d2) {
        this.f9139a = str;
        this.f9140b = str2;
        this.f9141c = d;
        this.f9142d = d2;
    }

    /* JADX INFO: renamed from: a */
    public static ytw m11307a(Address address) {
        return new ytw(address.getFeatureName(), address.getAddressLine(0), address.getLatitude(), address.getLongitude());
    }

    /* JADX INFO: renamed from: b */
    public static ytw m11308b(PlaceDetailsResult placeDetailsResult) {
        String str = placeDetailsResult.name;
        String str2 = placeDetailsResult.formatted_address;
        PlaceLocation placeLocation = placeDetailsResult.geometry.location;
        return new ytw(str, str2, placeLocation.lat, placeLocation.lng);
    }

    /* JADX INFO: renamed from: c */
    public String m11309c() {
        return this.f9140b;
    }

    /* JADX INFO: renamed from: d */
    public double m11310d() {
        return this.f9141c;
    }

    /* JADX INFO: renamed from: e */
    public double m11311e() {
        return this.f9142d;
    }

    /* JADX INFO: renamed from: f */
    public String m11312f() {
        return this.f9139a;
    }
}
