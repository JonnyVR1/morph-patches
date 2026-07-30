package p149l;

import android.location.Address;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.p046p1.mobile.putong.data.DoublePair;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class k90 {

    /* JADX INFO: renamed from: a */
    public PoiInfo f121890a;

    /* JADX INFO: renamed from: b */
    public Address f121891b;

    /* JADX INFO: renamed from: c */
    public SuggestionResult.SuggestionInfo f121892c;

    public k90(PoiInfo poiInfo) {
        this.f121890a = poiInfo;
    }

    /* JADX INFO: renamed from: a */
    public String m144982a() {
        if (NullChecker.m81303a(this.f121892c)) {
            return this.f121892c.getAddress();
        }
        if (NullChecker.m81303a(this.f121890a)) {
            return this.f121890a.address;
        }
        if (!NullChecker.m81303a(this.f121891b)) {
            return "";
        }
        int maxAddressLineIndex = this.f121891b.getMaxAddressLineIndex();
        Address address = this.f121891b;
        return maxAddressLineIndex >= 0 ? address.getAddressLine(0) : address.getFeatureName();
    }

    /* JADX INFO: renamed from: b */
    public DoublePair m144983b() {
        if (NullChecker.m81303a(this.f121892c)) {
            return new DoublePair(this.f121892c.pt.latitude, this.f121892c.pt.longitude);
        }
        if (NullChecker.m81303a(this.f121890a)) {
            return new DoublePair(this.f121890a.location.latitude, this.f121890a.location.longitude);
        }
        if (NullChecker.m81303a(this.f121891b)) {
            return new DoublePair(this.f121891b.getLatitude(), this.f121891b.getLongitude());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public String m144984c() {
        if (NullChecker.m81303a(this.f121892c)) {
            return this.f121892c.key;
        }
        if (NullChecker.m81303a(this.f121890a)) {
            return this.f121890a.name;
        }
        return NullChecker.m81303a(this.f121891b) ? this.f121891b.getFeatureName() : "";
    }

    public k90() {
    }

    public k90(Address address) {
        this.f121891b = address;
    }
}
