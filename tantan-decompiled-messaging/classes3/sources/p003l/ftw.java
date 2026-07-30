package p003l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.e51;
import l.hfw;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.pvv;
import l.qc2;
import l.qib0;
import l.vwb;
import l.wvv;
import l.x2c0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ftw extends jq2<ttw> implements BaiduMap.OnMapStatusChangeListener {

    /* JADX INFO: renamed from: a */
    public int f3713a;

    /* JADX INFO: renamed from: b */
    public me3 f3714b;

    /* JADX INFO: renamed from: c */
    public dvg0 f3715c;

    /* JADX INFO: renamed from: d */
    public String f3716d;

    /* JADX INFO: renamed from: e */
    public long f3717e;

    /* JADX INFO: renamed from: f */
    public boolean f3718f;

    /* JADX INFO: renamed from: g */
    public Overlay f3719g;

    /* JADX INFO: renamed from: h */
    public BaiduMap f3720h;

    /* JADX INFO: renamed from: i */
    public BitmapDescriptor f3721i;

    /* JADX INFO: renamed from: j */
    public boolean f3722j;

    /* JADX INFO: renamed from: k */
    public GeoCoder f3723k;

    /* JADX INFO: renamed from: l */
    public PoiSearch f3724l;

    /* JADX INFO: renamed from: m */
    public BitmapDescriptor f3725m;

    /* JADX INFO: renamed from: n */
    public boolean f3726n;

    public ftw(mcr mcrVar) {
        super(mcrVar);
        this.f3717e = 0L;
        this.f3722j = false;
        this.f3726n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m4423A0(Throwable th) {
        e51.F(act(), new Runnable() { // from class: l.etw
            @Override // java.lang.Runnable
            public final void run() {
                this.f3377a.m4437z0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m4424C0(c cVar) {
        if (cVar == c.i) {
            qib0.E.w(true);
        } else if (cVar == c.k) {
            zvf0.B("e_map_page_location_info", "", new j760[]{vwb.Y("is_location_success", Boolean.valueOf(qib0.E.q() != null)), vwb.Y("is_search_poi", Boolean.valueOf(((ttw) ((jq2) this).viewModel).m8000G())), vwb.Y("is_search_poi_success", Boolean.valueOf(((ttw) ((jq2) this).viewModel).m7999F()))});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m4435t0(c cVar) {
        if (cVar instanceof c.a) {
            this.f3714b = new me3(this, act());
            this.f3715c = new dvg0(this.f3714b, act(), ((ttw) ((jq2) this).viewModel).f7727E);
        } else if (cVar == c.m && !this.f3718f) {
            zvf0.B("e_map_finish_no_location", "", new j760[0]);
        }
        ((ttw) ((jq2) this).viewModel).m8003J(this.f3713a, this.f3714b, this.f3715c, cVar);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ LatLng m4436u0(Location location) {
        return new LatLng(location.u(), location.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m4437z0() {
        hfw.a("checkPermissionDlg", "show in MapAct");
        CoreDlg.X1(act(), false);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m4438D0(NetworkInfo networkInfo) {
        this.f3722j = false;
        qib0.E.t();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m4439E0(PoiInfo poiInfo) {
        return Boolean.valueOf((poiInfo == null || poiInfo.location == null || !m4440F0(poiInfo.location, this.f3714b.m6355G())) ? false : true);
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m4440F0(LatLng latLng, LatLng latLng2) {
        if (latLng == null && latLng2 == null) {
            return true;
        }
        return latLng != null && latLng2 != null && latLng.latitude == latLng2.latitude && latLng.longitude == latLng2.longitude;
    }

    /* JADX INFO: renamed from: G0 */
    public void m4441G0() {
        ((ttw) ((jq2) this).viewModel).m8016X();
    }

    /* JADX INFO: renamed from: H0 */
    public void m4442H0(List<PoiInfo> list, PoiInfo poiInfo, int i, int i2, boolean z) {
        ((ttw) ((jq2) this).viewModel).m8017Y(list, poiInfo, i, i2, z);
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m4443I0(Menu menu) {
        return ((ttw) ((jq2) this).viewModel).m8018Z(this.f3713a, this.f3714b, this.f3715c, menu);
    }

    /* JADX INFO: renamed from: J0 */
    public void m4444J0(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            intent.getStringExtra("query");
            ((ttw) ((jq2) this).viewModel).m8001H(true);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m4445L0() {
        if (!NullChecker.a(this.f3714b.m6355G())) {
            hfw.a("MapActPresenter", " AddLocationError  adapter is null");
            return;
        }
        me3 me3Var = this.f3714b;
        PoiInfo poiInfo = (PoiInfo) vwb.r(vwb.x(new List[]{me3Var.f5596f, vwb.f0(new PoiInfo[]{me3Var.f5598h, me3Var.f5599i})}), new w9j() { // from class: l.dtw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3112a.m4439E0((PoiInfo) obj);
            }
        });
        if (!NullChecker.a(poiInfo) || "...".equals(poiInfo.address) || TextUtils.isEmpty(poiInfo.address)) {
            hfw.a("MapActPresenter", " AddLocationError  cur = " + poiInfo);
            lsi0.h(R.string.qh);
            return;
        }
        Intent intent = new Intent();
        LatLng latLngA = qc2.a(this.f3714b.m6355G());
        intent.putExtra("map_location", (Serializable) new DoublePair(latLngA.latitude, latLngA.longitude));
        intent.putExtra("map_address", poiInfo.address);
        intent.putExtra("map_name", poiInfo.name.equals(act().string(R.string.th)) ? poiInfo.address : poiInfo.name);
        intent.putExtra("map_city", poiInfo.city);
        Act act = act();
        act();
        act.setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: N0 */
    public void m4446N0(boolean z) {
        ((ttw) ((jq2) this).viewModel).m7998E(z);
    }

    /* JADX INFO: renamed from: O0 */
    public void m4447O0(int i) {
        ((ttw) ((jq2) this).viewModel).m8015W(i);
    }

    /* JADX INFO: renamed from: P0 */
    public void m4448P0(boolean z) {
        ((ttw) ((jq2) this).viewModel).m8020b0(this.f3726n, this.f3714b, z);
    }

    /* JADX INFO: renamed from: a0 */
    public void m4449a0() {
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.vsw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8403a.m4435t0((c) obj);
            }
        }));
        duringCreated(qib0.E.p().map(new w9j() { // from class: l.wsw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ftw.m4436u0((Location) obj);
            }
        })).subscribe((m250) mkd0.G(new e30() { // from class: l.xsw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8831a.m4455x0((LatLng) obj);
            }
        }));
        if (wvv.q()) {
            duringCreated(qib0.E.p()).timeout(3L, TimeUnit.SECONDS).take(1).subscribe((m250) mkd0.K(new e30() { // from class: l.ysw
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9129a.m4456y0((Location) obj);
                }
            }, new e30() { // from class: l.zsw
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9411a.m4423A0((Throwable) obj);
                }
            }, false));
        }
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.atw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2276a.m4424C0((c) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.btw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.ctw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2802a.m4438D0((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m4450o0(boolean z) {
        this.f3726n = z;
    }

    /* JADX INFO: renamed from: p0 */
    public BitmapDescriptor m4451p0() {
        BitmapDescriptor bitmapDescriptor = this.f3721i;
        if (bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null || this.f3721i.getBitmap().isRecycled()) {
            this.f3721i = BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(x2c0.At)).getBitmap());
        }
        return this.f3721i;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m4452q0() {
        return this.f3726n;
    }

    /* JADX INFO: renamed from: r0 */
    public BitmapDescriptor m4453r0() {
        BitmapDescriptor bitmapDescriptor = this.f3725m;
        if (bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null || this.f3725m.getBitmap().isRecycled()) {
            this.f3725m = BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(x2c0.Bt)).getBitmap());
        }
        return this.f3725m;
    }

    /* JADX INFO: renamed from: s0 */
    public View m4454s0(ViewGroup viewGroup, int i) {
        return ((ttw) ((jq2) this).viewModel).m8002I(viewGroup, i);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m4455x0(LatLng latLng) {
        hfw.a("MapActPresenter", " LocationResult latitude = " + latLng.latitude + " longitude = " + latLng.longitude);
        this.f3718f = true;
        zvf0.B("e_baidu_map_get_location_success", "", new j760[]{vwb.Y("location_latitude", Double.valueOf(latLng.latitude)), vwb.Y("location_longitude", Double.valueOf(latLng.longitude))});
        LatLng latLngB = qc2.b(latLng);
        if (NullChecker.a(this.f3719g)) {
            this.f3719g.remove();
        }
        this.f3719g = this.f3720h.addOverlay(new MarkerOptions().draggable(false).position(latLngB).icon(m4451p0()).anchor(0.5f, 0.5f));
        if (this.f3722j) {
            return;
        }
        this.f3720h.setMapStatus(MapStatusUpdateFactory.newLatLng(latLngB));
        this.f3714b.m6353E(latLngB);
        this.f3722j = true;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m4456y0(Location location) {
        if (!pvv.c() || wvv.o()) {
            return;
        }
        CoreDlg.X1(act(), true);
    }

    public void destroy() {
    }
}
