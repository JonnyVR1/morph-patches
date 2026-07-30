package p007l;

import android.text.TextUtils;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.p000p1.mobile.putong.data.DoublePair;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.NearbyLocation;
import com.p000p1.mobile.putong.data.NearbyLocationInfoPois;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.qc2;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class p980 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ k90 m12944a(NearbyLocation nearbyLocation) {
        List<NearbyLocationInfoPois> list = nearbyLocation.data.nearbys.get(0).pois;
        if (vwb.J(list)) {
            return null;
        }
        return new k90(m12948e(list.get(0)));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m12945b(MessageLocation messageLocation, int i, NearbyLocation nearbyLocation) {
        List<NearbyLocationInfoPois> list = nearbyLocation.data.nearbys.get(0).pois;
        if (vwb.J(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (NearbyLocationInfoPois nearbyLocationInfoPois : list) {
            if (messageLocation == null || !TextUtils.equals(nearbyLocationInfoPois.name, messageLocation.name)) {
                arrayList.add(m12946c(nearbyLocationInfoPois));
            }
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static MessageLocation m12946c(NearbyLocationInfoPois nearbyLocationInfoPois) {
        if (nearbyLocationInfoPois == null) {
            return null;
        }
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.name = nearbyLocationInfoPois.name;
        messageLocation.address = nearbyLocationInfoPois.address;
        if (nkg.m12223U()) {
            LatLng latLng = new LatLng(nearbyLocationInfoPois.lat, nearbyLocationInfoPois.lng);
            messageLocation.coordinates = new DoublePair(latLng.latitude, latLng.longitude);
            return messageLocation;
        }
        LatLng latLngA = qc2.a(new LatLng(nearbyLocationInfoPois.lat, nearbyLocationInfoPois.lng));
        messageLocation.coordinates = new DoublePair(latLngA.latitude, latLngA.longitude);
        return messageLocation;
    }

    /* JADX INFO: renamed from: d */
    public static MessageLocation m12947d(k90 k90Var) {
        if (k90Var == null) {
            return null;
        }
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.name = k90Var.m11398c();
        messageLocation.address = k90Var.m11396a();
        messageLocation.coordinates = k90Var.m11397b();
        return messageLocation;
    }

    /* JADX INFO: renamed from: e */
    public static PoiInfo m12948e(NearbyLocationInfoPois nearbyLocationInfoPois) {
        PoiInfo poiInfo = new PoiInfo();
        poiInfo.province = nearbyLocationInfoPois.province;
        poiInfo.city = nearbyLocationInfoPois.city;
        poiInfo.area = nearbyLocationInfoPois.area;
        poiInfo.name = nearbyLocationInfoPois.name;
        poiInfo.address = nearbyLocationInfoPois.address;
        poiInfo.distance = nearbyLocationInfoPois.distance;
        poiInfo.direction = nearbyLocationInfoPois.direction;
        poiInfo.tag = nearbyLocationInfoPois.tag;
        poiInfo.location = new LatLng(nearbyLocationInfoPois.lat, nearbyLocationInfoPois.lng);
        return poiInfo;
    }

    /* JADX INFO: renamed from: f */
    public static c<k90> m12949f(Act act) {
        return act.duringCreated(FeedModule.f316d.m16509N7("NEARBY", "")).map(new w9j() { // from class: l.n980
            public final Object call(Object obj) {
                return p980.m12944a((NearbyLocation) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static c<List<MessageLocation>> m12950g(final MessageLocation messageLocation, final int i) {
        return FeedModule.f316d.m16509N7("NEARBY", "").map(new w9j() { // from class: l.o980
            public final Object call(Object obj) {
                return p980.m12945b(messageLocation, i, (NearbyLocation) obj);
            }
        });
    }
}
