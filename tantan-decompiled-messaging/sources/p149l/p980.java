package p149l;

import android.text.TextUtils;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.NearbyLocation;
import com.p046p1.mobile.putong.data.NearbyLocationInfoPois;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class p980 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ k90 m167858a(NearbyLocation nearbyLocation) {
        List<NearbyLocationInfoPois> list = nearbyLocation.data.nearbys.get(0).pois;
        if (vwb.m200296J(list)) {
            return null;
        }
        return new k90(m167862e(list.get(0)));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m167859b(MessageLocation messageLocation, int i, NearbyLocation nearbyLocation) {
        List<NearbyLocationInfoPois> list = nearbyLocation.data.nearbys.get(0).pois;
        if (vwb.m200296J(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (NearbyLocationInfoPois nearbyLocationInfoPois : list) {
            if (messageLocation == null || !TextUtils.equals(nearbyLocationInfoPois.name, messageLocation.name)) {
                arrayList.add(m167860c(nearbyLocationInfoPois));
            }
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static MessageLocation m167860c(NearbyLocationInfoPois nearbyLocationInfoPois) {
        if (nearbyLocationInfoPois == null) {
            return null;
        }
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.name = nearbyLocationInfoPois.name;
        messageLocation.address = nearbyLocationInfoPois.address;
        if (nkg.m159864U()) {
            LatLng latLng = new LatLng(nearbyLocationInfoPois.lat, nearbyLocationInfoPois.lng);
            messageLocation.coordinates = new DoublePair(latLng.latitude, latLng.longitude);
            return messageLocation;
        }
        LatLng latLngM173859a = qc2.m173859a(new LatLng(nearbyLocationInfoPois.lat, nearbyLocationInfoPois.lng));
        messageLocation.coordinates = new DoublePair(latLngM173859a.latitude, latLngM173859a.longitude);
        return messageLocation;
    }

    /* JADX INFO: renamed from: d */
    public static MessageLocation m167861d(k90 k90Var) {
        if (k90Var == null) {
            return null;
        }
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.name = k90Var.m144984c();
        messageLocation.address = k90Var.m144982a();
        messageLocation.coordinates = k90Var.m144983b();
        return messageLocation;
    }

    /* JADX INFO: renamed from: e */
    public static PoiInfo m167862e(NearbyLocationInfoPois nearbyLocationInfoPois) {
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
    public static C22306c<k90> m167863f(Act act) {
        return act.duringCreated(FeedModule.f38855d.m209328N7("NEARBY", "")).map(new w9j() { // from class: l.n980
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p980.m167858a((NearbyLocation) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<List<MessageLocation>> m167864g(final MessageLocation messageLocation, final int i) {
        return FeedModule.f38855d.m209328N7("NEARBY", "").map(new w9j() { // from class: l.o980
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return p980.m167859b(messageLocation, i, (NearbyLocation) obj);
            }
        });
    }
}
