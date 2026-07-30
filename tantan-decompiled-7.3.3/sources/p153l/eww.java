package p153l;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.poi.PoiSearch;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class eww extends ar2<sww> implements BaiduMap.OnMapStatusChangeListener {

    /* JADX INFO: renamed from: a */
    public int f96203a;

    /* JADX INFO: renamed from: b */
    public bf3 f96204b;

    /* JADX INFO: renamed from: c */
    public l3h0 f96205c;

    /* JADX INFO: renamed from: d */
    public String f96206d;

    /* JADX INFO: renamed from: e */
    public long f96207e;

    /* JADX INFO: renamed from: f */
    public boolean f96208f;

    /* JADX INFO: renamed from: g */
    public Overlay f96209g;

    /* JADX INFO: renamed from: h */
    public BaiduMap f96210h;

    /* JADX INFO: renamed from: i */
    public BitmapDescriptor f96211i;

    /* JADX INFO: renamed from: j */
    public boolean f96212j;

    /* JADX INFO: renamed from: k */
    public GeoCoder f96213k;

    /* JADX INFO: renamed from: l */
    public PoiSearch f96214l;

    /* JADX INFO: renamed from: m */
    public BitmapDescriptor f96215m;

    /* JADX INFO: renamed from: n */
    public boolean f96216n;

    public eww(ner nerVar) {
        super(nerVar);
        this.f96207e = 0L;
        this.f96212j = false;
        this.f96216n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m122960A0(Throwable th) {
        l51.m152886F(act(), new Runnable() { // from class: l.dww
            @Override // java.lang.Runnable
            public final void run() {
                this.f91050a.m122974z0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m122961C0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            uqb0.f180370E.m80054w(true);
        } else if (c4470c == C4470c.f16269k) {
            i4g0.m138493B("e_map_page_location_info", "", jyb.m147494Y("is_location_success", Boolean.valueOf(uqb0.f180370E.m80048q() != null)), jyb.m147494Y("is_search_poi", Boolean.valueOf(((sww) this.viewModel).m188392G())), jyb.m147494Y("is_search_poi_success", Boolean.valueOf(((sww) this.viewModel).m188391F())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m122972t0(C4470c c4470c) {
        if (c4470c instanceof C4470c.a) {
            this.f96204b = new bf3(this, act());
            this.f96205c = new l3h0(this.f96204b, act(), ((sww) this.viewModel).f171020E);
        } else if (c4470c == C4470c.f16271m && !this.f96208f) {
            i4g0.m138493B("e_map_finish_no_location", "", new pf60[0]);
        }
        ((sww) this.viewModel).m188395J(this.f96203a, this.f96204b, this.f96205c, c4470c);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ LatLng m122973u0(Location location) {
        return new LatLng(location.m80014u(), location.m80016x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m122974z0() {
        fhw.m125605a("checkPermissionDlg", "show in MapAct");
        CoreDlg.m46221X1(act(), false);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m122975D0(NetworkInfo networkInfo) {
        this.f96212j = false;
        uqb0.f180370E.m80051t();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m122976E0(PoiInfo poiInfo) {
        return Boolean.valueOf((poiInfo == null || poiInfo.location == null || !m122977F0(poiInfo.location, this.f96204b.m103865G())) ? false : true);
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m122977F0(LatLng latLng, LatLng latLng2) {
        if (latLng == null && latLng2 == null) {
            return true;
        }
        return latLng != null && latLng2 != null && latLng.latitude == latLng2.latitude && latLng.longitude == latLng2.longitude;
    }

    /* JADX INFO: renamed from: G0 */
    public void m122978G0() {
        ((sww) this.viewModel).m188408X();
    }

    /* JADX INFO: renamed from: H0 */
    public void m122979H0(List<PoiInfo> list, PoiInfo poiInfo, int i, int i2, boolean z) {
        ((sww) this.viewModel).m188409Y(list, poiInfo, i, i2, z);
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m122980I0(Menu menu) {
        return ((sww) this.viewModel).m188410Z(this.f96203a, this.f96204b, this.f96205c, menu);
    }

    /* JADX INFO: renamed from: J0 */
    public void m122981J0(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            intent.getStringExtra(BLivePkInviteSource.query);
            ((sww) this.viewModel).m188393H(true);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m122982L0() {
        if (!NullChecker.m82486a(this.f96204b.m103865G())) {
            fhw.m125605a("MapActPresenter", " AddLocationError  adapter is null");
            return;
        }
        bf3 bf3Var = this.f96204b;
        PoiInfo poiInfo = (PoiInfo) jyb.m147529r(jyb.m147535x(bf3Var.f76433f, jyb.m147507f0(bf3Var.f76435h, bf3Var.f76436i)), new qcj() { // from class: l.cww
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84152a.m122976E0((PoiInfo) obj);
            }
        });
        if (!NullChecker.m82486a(poiInfo) || "...".equals(poiInfo.address) || TextUtils.isEmpty(poiInfo.address)) {
            fhw.m125605a("MapActPresenter", " AddLocationError  cur = " + poiInfo);
            o1j0.m165634h(R$string.f18644Lh);
            return;
        }
        Intent intent = new Intent();
        LatLng latLngM210087a = xc2.m210087a(this.f96204b.m103865G());
        intent.putExtra("map_location", new DoublePair(latLngM210087a.latitude, latLngM210087a.longitude));
        intent.putExtra("map_address", poiInfo.address);
        intent.putExtra("map_name", poiInfo.name.equals(act().string(R$string.f18734Oh)) ? poiInfo.address : poiInfo.name);
        intent.putExtra("map_city", poiInfo.city);
        Act act = act();
        act();
        act.setResult(-1, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: N0 */
    public void m122983N0(boolean z) {
        ((sww) this.viewModel).m188390E(z);
    }

    /* JADX INFO: renamed from: O0 */
    public void m122984O0(int i) {
        ((sww) this.viewModel).m188407W(i);
    }

    /* JADX INFO: renamed from: P0 */
    public void m122985P0(boolean z) {
        ((sww) this.viewModel).m188412b0(this.f96216n, this.f96204b, z);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.uvw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181178a.m122972t0((C4470c) obj);
            }
        }));
        duringCreated((C22421c) uqb0.f180370E.m80047p().map(new qcj() { // from class: l.vvw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return eww.m122973u0((Location) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.wvw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190995a.m122991x0((LatLng) obj);
            }
        }));
        if (xxv.m213590q()) {
            duringCreated(uqb0.f180370E.m80047p()).timeout(3L, TimeUnit.SECONDS).take(1).subscribe(psd0.m173600K(new y20() { // from class: l.xvw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196441a.m122992y0((Location) obj);
                }
            }, new y20() { // from class: l.yvw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201768a.m122960A0((Throwable) obj);
                }
            }, false));
        }
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.zvw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206297a.m122961C0((C4470c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.aww
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.bww
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78795a.m122975D0((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m122986o0(boolean z) {
        this.f96216n = z;
    }

    /* JADX INFO: renamed from: p0 */
    public BitmapDescriptor m122987p0() {
        BitmapDescriptor bitmapDescriptor = this.f96211i;
        if (bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null || this.f96211i.getBitmap().isRecycled()) {
            this.f96211i = BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(dbc0.f87298ou)).getBitmap());
        }
        return this.f96211i;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m122988q0() {
        return this.f96216n;
    }

    /* JADX INFO: renamed from: r0 */
    public BitmapDescriptor m122989r0() {
        BitmapDescriptor bitmapDescriptor = this.f96215m;
        if (bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null || this.f96215m.getBitmap().isRecycled()) {
            this.f96215m = BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(dbc0.f87331pu)).getBitmap());
        }
        return this.f96215m;
    }

    /* JADX INFO: renamed from: s0 */
    public View m122990s0(ViewGroup viewGroup, int i) {
        return ((sww) this.viewModel).m188394I(viewGroup, i);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m122991x0(LatLng latLng) {
        fhw.m125605a("MapActPresenter", " LocationResult latitude = " + latLng.latitude + " longitude = " + latLng.longitude);
        this.f96208f = true;
        i4g0.m138493B("e_baidu_map_get_location_success", "", jyb.m147494Y("location_latitude", Double.valueOf(latLng.latitude)), jyb.m147494Y("location_longitude", Double.valueOf(latLng.longitude)));
        LatLng latLngM210088b = xc2.m210088b(latLng);
        if (NullChecker.m82486a(this.f96209g)) {
            this.f96209g.remove();
        }
        this.f96209g = this.f96210h.addOverlay(new MarkerOptions().draggable(false).position(latLngM210088b).icon(m122987p0()).anchor(0.5f, 0.5f));
        if (this.f96212j) {
            return;
        }
        this.f96210h.setMapStatus(MapStatusUpdateFactory.newLatLng(latLngM210088b));
        this.f96204b.m103863E(latLngM210088b);
        this.f96212j = true;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m122992y0(Location location) {
        if (!qxv.m178618c() || xxv.m213588o()) {
            return;
        }
        CoreDlg.m46221X1(act(), true);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
