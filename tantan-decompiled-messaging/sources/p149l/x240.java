package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.p046p1.mobile.putong.data.NearbyLocation;
import com.p046p1.mobile.putong.data.NearbyLocationInfoPois;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.Notification;

/* JADX INFO: loaded from: classes12.dex */
public class x240 extends jq2<g340> {

    /* JADX INFO: renamed from: a */
    public Location f189125a;

    /* JADX INFO: renamed from: b */
    public List<k90> f189126b;

    /* JADX INFO: renamed from: c */
    public String f189127c;

    /* JADX INFO: renamed from: d */
    public double[] f189128d;

    public x240(mcr mcrVar) {
        super(mcrVar);
        this.f189126b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m206828r0() {
        ((g340) this.viewModel).m124235v();
    }

    /* JADX INFO: renamed from: j0 */
    public final PoiInfo m206829j0(NearbyLocationInfoPois nearbyLocationInfoPois) {
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
    public void m206830k0() {
        m206831l0("");
    }

    /* JADX INFO: renamed from: l0 */
    public void m206831l0(final String str) {
        act().duringCreated(FeedModule.f38855d.m209328N7("NEARBY", str)).subscribe(mkd0.m154956H(new e30() { // from class: l.u240
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173068a.m206834o0(str, (NearbyLocation) obj);
            }
        }, new e30() { // from class: l.v240
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179342a.m206835p0(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m206832m0() {
        creates(new e30() { // from class: l.s240
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161959a.m206836q0((Bundle) obj);
            }
        }, new d30() { // from class: l.t240
            @Override // p149l.d30
            public final void call() {
                this.f167441a.m206828r0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m206833n0() {
        if (act() == null || act().getIntent() == null) {
            return;
        }
        this.f189127c = act().getIntent().getStringExtra(NewPostLocationAct.f40645e);
        this.f189128d = act().getIntent().getDoubleArrayExtra(NewPostLocationAct.f40646f);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m206834o0(String str, NearbyLocation nearbyLocation) {
        List<NearbyLocationInfoPois> list = nearbyLocation.data.nearbys.get(0).pois;
        if (NullChecker.m81303a(list)) {
            for (int i = 0; i < list.size(); i++) {
                this.f189126b.add(new k90(m206829j0(list.get(i))));
            }
        } else {
            lsi0.m151580j(act().string(R$string.f39070h3));
        }
        if (this.f189126b.size() == 0) {
            lsi0.m151580j(act().string(R$string.f39070h3));
        }
        this.f189126b.add(0, new k90());
        ((g340) this.viewModel).m124229L(this.f189126b, str);
        this.f189126b.clear();
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m206835p0(String str, Throwable th) {
        if (TextUtils.isEmpty(str)) {
            ((g340) this.viewModel).m124229L(new ArrayList(), "");
        }
        lsi0.m151578h(R$string.f38981U);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m206836q0(Bundle bundle) {
        m206833n0();
        ((g340) this.viewModel).m124222A(bundle);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m206837s0(Notification notification) {
        if (notification.m221300k()) {
            Location location = (Location) notification.m221295f();
            this.f189125a = location;
            ((g340) this.viewModel).m124227J(location);
        } else if (notification.m221298i()) {
            ((g340) this.viewModel).m124206F();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m206838t0() {
        act().duringCreated(qib0.f154687E.m78864p().take(3L, TimeUnit.SECONDS).materialize().first().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.w240
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184086a.m206837s0((Notification) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
