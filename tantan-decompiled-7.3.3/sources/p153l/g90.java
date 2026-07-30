package p153l;

import android.location.Address;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.p051p1.mobile.putong.data.DoublePair;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class g90 {

    /* JADX INFO: renamed from: a */
    public PoiInfo f102729a;

    /* JADX INFO: renamed from: b */
    public Address f102730b;

    /* JADX INFO: renamed from: c */
    public SuggestionResult.SuggestionInfo f102731c;

    public g90(PoiInfo poiInfo) {
        this.f102729a = poiInfo;
    }

    /* JADX INFO: renamed from: a */
    public String m129466a() {
        if (NullChecker.m82486a(this.f102731c)) {
            return this.f102731c.getAddress();
        }
        if (NullChecker.m82486a(this.f102729a)) {
            return this.f102729a.address;
        }
        if (!NullChecker.m82486a(this.f102730b)) {
            return "";
        }
        int maxAddressLineIndex = this.f102730b.getMaxAddressLineIndex();
        Address address = this.f102730b;
        return maxAddressLineIndex >= 0 ? address.getAddressLine(0) : address.getFeatureName();
    }

    /* JADX INFO: renamed from: b */
    public DoublePair m129467b() {
        if (NullChecker.m82486a(this.f102731c)) {
            return new DoublePair(this.f102731c.pt.latitude, this.f102731c.pt.longitude);
        }
        if (NullChecker.m82486a(this.f102729a)) {
            return new DoublePair(this.f102729a.location.latitude, this.f102729a.location.longitude);
        }
        if (NullChecker.m82486a(this.f102730b)) {
            return new DoublePair(this.f102730b.getLatitude(), this.f102730b.getLongitude());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public String m129468c() {
        if (NullChecker.m82486a(this.f102731c)) {
            return this.f102731c.key;
        }
        if (NullChecker.m82486a(this.f102729a)) {
            return this.f102729a.name;
        }
        return NullChecker.m82486a(this.f102730b) ? this.f102730b.getFeatureName() : "";
    }

    public g90() {
    }

    public g90(Address address) {
        this.f102730b = address;
    }
}
