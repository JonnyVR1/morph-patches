package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class ftw extends jq2<ttw> implements BaiduMap.OnMapStatusChangeListener {

    /* JADX INFO: renamed from: a */
    public int f99274a;

    /* JADX INFO: renamed from: b */
    public me3 f99275b;

    /* JADX INFO: renamed from: c */
    public dvg0 f99276c;

    /* JADX INFO: renamed from: d */
    public String f99277d;

    /* JADX INFO: renamed from: e */
    public long f99278e;

    /* JADX INFO: renamed from: f */
    public boolean f99279f;

    /* JADX INFO: renamed from: g */
    public Overlay f99280g;

    /* JADX INFO: renamed from: h */
    public BaiduMap f99281h;

    /* JADX INFO: renamed from: i */
    public BitmapDescriptor f99282i;

    /* JADX INFO: renamed from: j */
    public boolean f99283j;

    /* JADX INFO: renamed from: k */
    public GeoCoder f99284k;

    /* JADX INFO: renamed from: l */
    public PoiSearch f99285l;

    /* JADX INFO: renamed from: m */
    public BitmapDescriptor f99286m;

    /* JADX INFO: renamed from: n */
    public boolean f99287n;

    public ftw(mcr mcrVar) {
        super(mcrVar);
        this.f99278e = 0L;
        this.f99283j = false;
        this.f99287n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m123089A0(Throwable th) {
        e51.m114741F(act(), new Runnable() { // from class: l.etw
            @Override // java.lang.Runnable
            public final void run() {
                this.f93188a.m123103z0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m123090C0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            qib0.f154687E.m78871w(true);
        } else if (c4319c == C4319c.f15550k) {
            zvf0.m220369B("e_map_page_location_info", "", vwb.m200311Y("is_location_success", Boolean.valueOf(qib0.f154687E.m78865q() != null)), vwb.m200311Y("is_search_poi", Boolean.valueOf(((ttw) this.viewModel).m190650G())), vwb.m200311Y("is_search_poi_success", Boolean.valueOf(((ttw) this.viewModel).m190649F())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m123101t0(C4319c c4319c) {
        if (c4319c instanceof C4319c.a) {
            this.f99275b = new me3(this, act());
            this.f99276c = new dvg0(this.f99275b, act(), ((ttw) this.viewModel).f172068E);
        } else if (c4319c == C4319c.f15552m && !this.f99279f) {
            zvf0.m220369B("e_map_finish_no_location", "", new j760[0]);
        }
        ((ttw) this.viewModel).m190653J(this.f99274a, this.f99275b, this.f99276c, c4319c);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ LatLng m123102u0(Location location) {
        return new LatLng(location.m78831u(), location.m78833x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m123103z0() {
        hfw.m130790a("checkPermissionDlg", "show in MapAct");
        CoreDlg.m45038X1(act(), false);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m123104D0(NetworkInfo networkInfo) {
        this.f99283j = false;
        qib0.f154687E.m78868t();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m123105E0(PoiInfo poiInfo) {
        return Boolean.valueOf((poiInfo == null || poiInfo.location == null || !m123106F0(poiInfo.location, this.f99275b.m154121G())) ? false : true);
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m123106F0(LatLng latLng, LatLng latLng2) {
        if (latLng == null && latLng2 == null) {
            return true;
        }
        return latLng != null && latLng2 != null && latLng.latitude == latLng2.latitude && latLng.longitude == latLng2.longitude;
    }

    /* JADX INFO: renamed from: G0 */
    public void m123107G0() {
        ((ttw) this.viewModel).m190666X();
    }

    /* JADX INFO: renamed from: H0 */
    public void m123108H0(List<PoiInfo> list, PoiInfo poiInfo, int i, int i2, boolean z) {
        ((ttw) this.viewModel).m190667Y(list, poiInfo, i, i2, z);
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m123109I0(Menu menu) {
        return ((ttw) this.viewModel).m190668Z(this.f99274a, this.f99275b, this.f99276c, menu);
    }

    /* JADX INFO: renamed from: J0 */
    public void m123110J0(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            intent.getStringExtra(BLivePkInviteSource.query);
            ((ttw) this.viewModel).m190651H(true);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m123111L0() {
        if (!NullChecker.m81303a(this.f99275b.m154121G())) {
            hfw.m130790a("MapActPresenter", " AddLocationError  adapter is null");
            return;
        }
        me3 me3Var = this.f99275b;
        PoiInfo poiInfo = (PoiInfo) vwb.m200346r(vwb.m200352x(me3Var.f133342f, vwb.m200324f0(me3Var.f133344h, me3Var.f133345i)), new w9j() { // from class: l.dtw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f87909a.m123105E0((PoiInfo) obj);
            }
        });
        if (!NullChecker.m81303a(poiInfo) || "...".equals(poiInfo.address) || TextUtils.isEmpty(poiInfo.address)) {
            hfw.m130790a("MapActPresenter", " AddLocationError  cur = " + poiInfo);
            lsi0.m151578h(R$string.f18856qh);
            return;
        }
        Intent intent = new Intent();
        LatLng latLngM173859a = qc2.m173859a(this.f99275b.m154121G());
        intent.putExtra("map_location", new DoublePair(latLngM173859a.latitude, latLngM173859a.longitude));
        intent.putExtra("map_address", poiInfo.address);
        intent.putExtra("map_name", poiInfo.name.equals(act().string(R$string.f18946th)) ? poiInfo.address : poiInfo.name);
        intent.putExtra("map_city", poiInfo.city);
        Act act = act();
        act();
        act.setResult(-1, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: N0 */
    public void m123112N0(boolean z) {
        ((ttw) this.viewModel).m190648E(z);
    }

    /* JADX INFO: renamed from: O0 */
    public void m123113O0(int i) {
        ((ttw) this.viewModel).m190665W(i);
    }

    /* JADX INFO: renamed from: P0 */
    public void m123114P0(boolean z) {
        ((ttw) this.viewModel).m190670b0(this.f99287n, this.f99275b, z);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.vsw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182890a.m123101t0((C4319c) obj);
            }
        }));
        duringCreated((C22306c) qib0.f154687E.m78864p().map(new w9j() { // from class: l.wsw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ftw.m123102u0((Location) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.xsw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194318a.m123120x0((LatLng) obj);
            }
        }));
        if (wvv.m205777q()) {
            duringCreated(qib0.f154687E.m78864p()).timeout(3L, TimeUnit.SECONDS).take(1).subscribe(mkd0.m154959K(new e30() { // from class: l.ysw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199843a.m123121y0((Location) obj);
                }
            }, new e30() { // from class: l.zsw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204649a.m123089A0((Throwable) obj);
                }
            }, false));
        }
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.atw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71687a.m123090C0((C4319c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.btw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ctw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82508a.m123104D0((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m123115o0(boolean z) {
        this.f99287n = z;
    }

    /* JADX INFO: renamed from: p0 */
    public BitmapDescriptor m123116p0() {
        BitmapDescriptor bitmapDescriptor = this.f99282i;
        if (bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null || this.f99282i.getBitmap().isRecycled()) {
            this.f99282i = BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(x2c0.f189183At)).getBitmap());
        }
        return this.f99282i;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m123117q0() {
        return this.f99287n;
    }

    /* JADX INFO: renamed from: r0 */
    public BitmapDescriptor m123118r0() {
        BitmapDescriptor bitmapDescriptor = this.f99286m;
        if (bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null || this.f99286m.getBitmap().isRecycled()) {
            this.f99286m = BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(x2c0.f189215Bt)).getBitmap());
        }
        return this.f99286m;
    }

    /* JADX INFO: renamed from: s0 */
    public View m123119s0(ViewGroup viewGroup, int i) {
        return ((ttw) this.viewModel).m190652I(viewGroup, i);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m123120x0(LatLng latLng) {
        hfw.m130790a("MapActPresenter", " LocationResult latitude = " + latLng.latitude + " longitude = " + latLng.longitude);
        this.f99279f = true;
        zvf0.m220369B("e_baidu_map_get_location_success", "", vwb.m200311Y("location_latitude", Double.valueOf(latLng.latitude)), vwb.m200311Y("location_longitude", Double.valueOf(latLng.longitude)));
        LatLng latLngM173860b = qc2.m173860b(latLng);
        if (NullChecker.m81303a(this.f99280g)) {
            this.f99280g.remove();
        }
        this.f99280g = this.f99281h.addOverlay(new MarkerOptions().draggable(false).position(latLngM173860b).icon(m123116p0()).anchor(0.5f, 0.5f));
        if (this.f99283j) {
            return;
        }
        this.f99281h.setMapStatus(MapStatusUpdateFactory.newLatLng(latLngM173860b));
        this.f99275b.m154119E(latLngM173860b);
        this.f99283j = true;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m123121y0(Location location) {
        if (!pvv.m171693c() || wvv.m205775o()) {
            return;
        }
        CoreDlg.m45038X1(act(), true);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
