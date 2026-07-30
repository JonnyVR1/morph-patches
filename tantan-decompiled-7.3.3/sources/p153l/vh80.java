package p153l;

import android.text.TextUtils;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.NearbyLocation;
import com.p051p1.mobile.putong.data.NearbyLocationInfoPois;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class vh80 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ g90 m201257a(NearbyLocation nearbyLocation) {
        List<NearbyLocationInfoPois> list = nearbyLocation.data.nearbys.get(0).pois;
        if (jyb.m147479J(list)) {
            return null;
        }
        return new g90(m201261e(list.get(0)));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m201258b(MessageLocation messageLocation, int i, NearbyLocation nearbyLocation) {
        List<NearbyLocationInfoPois> list = nearbyLocation.data.nearbys.get(0).pois;
        if (jyb.m147479J(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (NearbyLocationInfoPois nearbyLocationInfoPois : list) {
            if (messageLocation == null || !TextUtils.equals(nearbyLocationInfoPois.name, messageLocation.name)) {
                arrayList.add(m201259c(nearbyLocationInfoPois));
            }
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static MessageLocation m201259c(NearbyLocationInfoPois nearbyLocationInfoPois) {
        if (nearbyLocationInfoPois == null) {
            return null;
        }
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.name = nearbyLocationInfoPois.name;
        messageLocation.address = nearbyLocationInfoPois.address;
        if (cmg.m111193U()) {
            LatLng latLng = new LatLng(nearbyLocationInfoPois.lat, nearbyLocationInfoPois.lng);
            messageLocation.coordinates = new DoublePair(latLng.latitude, latLng.longitude);
            return messageLocation;
        }
        LatLng latLngM210087a = xc2.m210087a(new LatLng(nearbyLocationInfoPois.lat, nearbyLocationInfoPois.lng));
        messageLocation.coordinates = new DoublePair(latLngM210087a.latitude, latLngM210087a.longitude);
        return messageLocation;
    }

    /* JADX INFO: renamed from: d */
    public static MessageLocation m201260d(g90 g90Var) {
        if (g90Var == null) {
            return null;
        }
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.name = g90Var.m129468c();
        messageLocation.address = g90Var.m129466a();
        messageLocation.coordinates = g90Var.m129467b();
        return messageLocation;
    }

    /* JADX INFO: renamed from: e */
    public static PoiInfo m201261e(NearbyLocationInfoPois nearbyLocationInfoPois) {
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
    public static C22421c<g90> m201262f(Act act) {
        return act.duringCreated(FeedModule.f39703d.m145569N7("NEARBY", "")).map(new qcj() { // from class: l.th80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vh80.m201257a((NearbyLocation) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<List<MessageLocation>> m201263g(final MessageLocation messageLocation, final int i) {
        return FeedModule.f39703d.m145569N7("NEARBY", "").map(new qcj() { // from class: l.uh80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vh80.m201258b(messageLocation, i, (NearbyLocation) obj);
            }
        });
    }
}
