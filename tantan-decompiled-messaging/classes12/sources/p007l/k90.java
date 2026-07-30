package p007l;

import android.location.Address;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.p000p1.mobile.putong.data.DoublePair;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class k90 {

    /* JADX INFO: renamed from: a */
    public PoiInfo f9638a;

    /* JADX INFO: renamed from: b */
    public Address f9639b;

    /* JADX INFO: renamed from: c */
    public SuggestionResult.SuggestionInfo f9640c;

    public k90(PoiInfo poiInfo) {
        this.f9638a = poiInfo;
    }

    /* JADX INFO: renamed from: a */
    public String m11396a() {
        if (NullChecker.a(this.f9640c)) {
            return this.f9640c.getAddress();
        }
        if (NullChecker.a(this.f9638a)) {
            return this.f9638a.address;
        }
        if (!NullChecker.a(this.f9639b)) {
            return "";
        }
        int maxAddressLineIndex = this.f9639b.getMaxAddressLineIndex();
        Address address = this.f9639b;
        return maxAddressLineIndex >= 0 ? address.getAddressLine(0) : address.getFeatureName();
    }

    /* JADX INFO: renamed from: b */
    public DoublePair m11397b() {
        if (NullChecker.a(this.f9640c)) {
            return new DoublePair(this.f9640c.pt.latitude, this.f9640c.pt.longitude);
        }
        if (NullChecker.a(this.f9638a)) {
            return new DoublePair(this.f9638a.location.latitude, this.f9638a.location.longitude);
        }
        if (NullChecker.a(this.f9639b)) {
            return new DoublePair(this.f9639b.getLatitude(), this.f9639b.getLongitude());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public String m11398c() {
        if (NullChecker.a(this.f9640c)) {
            return this.f9640c.key;
        }
        if (NullChecker.a(this.f9638a)) {
            return this.f9638a.name;
        }
        return NullChecker.a(this.f9639b) ? this.f9639b.getFeatureName() : "";
    }

    public k90() {
    }

    public k90(Address address) {
        this.f9639b = address;
    }
}
