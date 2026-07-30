package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.p000p1.mobile.putong.data.NearbyLocation;
import com.p000p1.mobile.putong.data.NearbyLocationInfoPois;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.e30;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.qib0;
import rx.Notification;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class x240 extends jq2<g340> {

    /* JADX INFO: renamed from: a */
    public Location f14741a;

    /* JADX INFO: renamed from: b */
    public List<k90> f14742b;

    /* JADX INFO: renamed from: c */
    public String f14743c;

    /* JADX INFO: renamed from: d */
    public double[] f14744d;

    public x240(mcr mcrVar) {
        super(mcrVar);
        this.f14742b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m15988r0() {
        ((g340) ((jq2) this).viewModel).m10399v();
    }

    /* JADX INFO: renamed from: j0 */
    public final PoiInfo m15989j0(NearbyLocationInfoPois nearbyLocationInfoPois) {
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

    /* JADX INFO: renamed from: k0 */
    public void m15990k0() {
        m15991l0("");
    }

    /* JADX INFO: renamed from: l0 */
    public void m15991l0(final String str) {
        act().duringCreated(FeedModule.f316d.m16509N7("NEARBY", str)).subscribe(mkd0.H(new e30() { // from class: l.u240
            public final void call(Object obj) {
                this.f13501a.m15994o0(str, (NearbyLocation) obj);
            }
        }, new e30() { // from class: l.v240
            public final void call(Object obj) {
                this.f14024a.m15995p0(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m15992m0() {
        creates(new e30() { // from class: l.s240
            public final void call(Object obj) {
                this.f12777a.m15996q0((Bundle) obj);
            }
        }, new d30() { // from class: l.t240
            public final void call() {
                this.f13161a.m15988r0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m15993n0() {
        if (act() == null || act().getIntent() == null) {
            return;
        }
        this.f14743c = act().getIntent().getStringExtra(NewPostLocationAct.f2106e);
        this.f14744d = act().getIntent().getDoubleArrayExtra(NewPostLocationAct.f2107f);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m15994o0(String str, NearbyLocation nearbyLocation) {
        List<NearbyLocationInfoPois> list = nearbyLocation.data.nearbys.get(0).pois;
        if (NullChecker.a(list)) {
            for (int i = 0; i < list.size(); i++) {
                this.f14742b.add(new k90(m15989j0(list.get(i))));
            }
        } else {
            lsi0.j(act().string(R$string.f531h3));
        }
        if (this.f14742b.size() == 0) {
            lsi0.j(act().string(R$string.f531h3));
        }
        this.f14742b.add(0, new k90());
        ((g340) ((jq2) this).viewModel).m10392L(this.f14742b, str);
        this.f14742b.clear();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m15995p0(String str, Throwable th) {
        if (TextUtils.isEmpty(str)) {
            ((g340) ((jq2) this).viewModel).m10392L(new ArrayList(), "");
        }
        lsi0.h(R$string.f442U);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m15996q0(Bundle bundle) {
        m15993n0();
        ((g340) ((jq2) this).viewModel).m10384A(bundle);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m15997s0(Notification notification) {
        if (notification.k()) {
            Location location = (Location) notification.f();
            this.f14741a = location;
            ((g340) ((jq2) this).viewModel).m10390J(location);
        } else if (notification.i()) {
            ((g340) ((jq2) this).viewModel).m10368F();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m15998t0() {
        act().duringCreated(qib0.E.p().take(3L, TimeUnit.SECONDS).materialize().first().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.w240
            public final void call(Object obj) {
                this.f14369a.m15997s0((Notification) obj);
            }
        }));
    }

    public void destroy() {
    }
}
