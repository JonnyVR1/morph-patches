package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.p051p1.mobile.putong.data.NearbyLocation;
import com.p051p1.mobile.putong.data.NearbyLocationInfoPois;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.Notification;

/* JADX INFO: loaded from: classes13.dex */
public class lb40 extends ar2<ub40> {

    /* JADX INFO: renamed from: a */
    public Location f130771a;

    /* JADX INFO: renamed from: b */
    public List<g90> f130772b;

    /* JADX INFO: renamed from: c */
    public String f130773c;

    /* JADX INFO: renamed from: d */
    public double[] f130774d;

    public lb40(ner nerVar) {
        super(nerVar);
        this.f130772b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m153563r0() {
        ((ub40) this.viewModel).m195241v();
    }

    /* JADX INFO: renamed from: j0 */
    public final PoiInfo m153564j0(NearbyLocationInfoPois nearbyLocationInfoPois) {
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
    public void m153565k0() {
        m153566l0("");
    }

    /* JADX INFO: renamed from: l0 */
    public void m153566l0(final String str) {
        act().duringCreated(FeedModule.f39703d.m145569N7("NEARBY", str)).subscribe(psd0.m173597H(new y20() { // from class: l.ib40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113721a.m153569o0(str, (NearbyLocation) obj);
            }
        }, new y20() { // from class: l.jb40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119127a.m153570p0(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m153567m0() {
        creates(new y20() { // from class: l.gb40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103045a.m153571q0((Bundle) obj);
            }
        }, new x20() { // from class: l.hb40
            @Override // p153l.x20
            public final void call() {
                this.f108568a.m153563r0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m153568n0() {
        if (act() == null || act().getIntent() == null) {
            return;
        }
        this.f130773c = act().getIntent().getStringExtra(NewPostLocationAct.f41493e);
        this.f130774d = act().getIntent().getDoubleArrayExtra(NewPostLocationAct.f41494f);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m153569o0(String str, NearbyLocation nearbyLocation) {
        List<NearbyLocationInfoPois> list = nearbyLocation.data.nearbys.get(0).pois;
        if (NullChecker.m82486a(list)) {
            for (int i = 0; i < list.size(); i++) {
                this.f130772b.add(new g90(m153564j0(list.get(i))));
            }
        } else {
            o1j0.m165636j(act().string(R$string.f39918h3));
        }
        if (this.f130772b.size() == 0) {
            o1j0.m165636j(act().string(R$string.f39918h3));
        }
        this.f130772b.add(0, new g90());
        ((ub40) this.viewModel).m195235L(this.f130772b, str);
        this.f130772b.clear();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m153570p0(String str, Throwable th) {
        if (TextUtils.isEmpty(str)) {
            ((ub40) this.viewModel).m195235L(new ArrayList(), "");
        }
        o1j0.m165634h(R$string.f39829U);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m153571q0(Bundle bundle) {
        m153568n0();
        ((ub40) this.viewModel).m195228A(bundle);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m153572s0(Notification notification) {
        if (notification.m222546k()) {
            Location location = (Location) notification.m222541f();
            this.f130771a = location;
            ((ub40) this.viewModel).m195233J(location);
        } else if (notification.m222544i()) {
            ((ub40) this.viewModel).m195212F();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m153573t0() {
        act().duringCreated(uqb0.f180370E.m80047p().take(3L, TimeUnit.SECONDS).materialize().first().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.kb40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124752a.m153572s0((Notification) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
