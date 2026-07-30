package p153l;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class jxw implements iam<fxw>, BaiduMap.OnMarkerClickListener, BaiduMap.OnMapClickListener {

    /* JADX INFO: renamed from: a */
    public MapView f123091a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f123092b;

    /* JADX INFO: renamed from: c */
    public VText f123093c;

    /* JADX INFO: renamed from: d */
    public fxw f123094d;

    /* JADX INFO: renamed from: e */
    public BaiduMap f123095e;

    /* JADX INFO: renamed from: f */
    public Context f123096f;

    public jxw(@Nullable Context context) {
        this.f123096f = context;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f123096f;
    }

    /* JADX INFO: renamed from: d */
    public View m147433d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kxw.m151895b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fxw fxwVar) {
        this.f123094d = fxwVar;
    }

    /* JADX INFO: renamed from: f */
    public void m147435f(MessageLocation messageLocation, final LatLng latLng) {
        this.f123091a.showZoomControls(false);
        this.f123095e = this.f123091a.getMap();
        this.f123095e.addOverlay(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(dbc0.f87331pu)).getBitmap())).draggable(false).position(latLng));
        this.f123095e.setMapStatus(MapStatusUpdateFactory.newLatLngZoom(latLng, 17.0f));
        this.f123095e.setOnMarkerClickListener(this);
        this.f123095e.setOnMapClickListener(this);
        this.f123093c.setText(messageLocation.name);
        this.f123093c.invalidate();
        this.f123093c.buildDrawingCache();
        bnl0.m105546b0(this.f123092b, new pcj() { // from class: l.hxw
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f112061a.m147437j(latLng);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m147436i(LatLng latLng) {
        this.f123095e.addOverlay(new MarkerOptions().anchor(0.5f, 1.0f).icon(BitmapDescriptorFactory.fromBitmap(bnl0.m105589x(this.f123092b, 1))).draggable(false).position(latLng));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m147433d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Boolean m147437j(final LatLng latLng) {
        bnl0.m105574p0(this.f123092b);
        act().postDelayed(new Runnable() { // from class: l.ixw
            @Override // java.lang.Runnable
            public final void run() {
                this.f117467a.m147436i(latLng);
            }
        }, 300L);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m147438k(LatLng latLng) {
        this.f123095e.addOverlay(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(dbc0.f87298ou)).getBitmap())).draggable(false).position(latLng));
    }

    /* JADX INFO: renamed from: l */
    public void m147439l() {
        if (NullChecker.m82486a(this.f123091a)) {
            this.f123091a.onDestroy();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m147440m() {
        if (NullChecker.m82486a(this.f123091a)) {
            this.f123091a.onPause();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m147441n() {
        if (NullChecker.m82486a(this.f123091a)) {
            this.f123091a.onResume();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m147442p() {
        if (this.f123091a.getChildCount() > 0) {
            this.f123091a.getChildAt(0).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m147443q(final LatLng latLng) {
        act().postDelayed(new Runnable() { // from class: l.gxw
            @Override // java.lang.Runnable
            public final void run() {
                this.f107005a.m147438k(latLng);
            }
        }, 300L);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
