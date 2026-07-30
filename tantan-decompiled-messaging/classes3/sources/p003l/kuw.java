package p003l;

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
import com.p1.mobile.putong.data.MessageLocation;
import com.tantanapp.common.utils.NullChecker;
import l.luw;
import l.s7m;
import l.x2c0;
import l.xdl0;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kuw implements s7m<guw>, BaiduMap.OnMarkerClickListener, BaiduMap.OnMapClickListener {

    /* JADX INFO: renamed from: a */
    public MapView f5075a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5076b;

    /* JADX INFO: renamed from: c */
    public VText f5077c;

    /* JADX INFO: renamed from: d */
    public guw f5078d;

    /* JADX INFO: renamed from: e */
    public BaiduMap f5079e;

    /* JADX INFO: renamed from: f */
    public Context f5080f;

    public kuw(@Nullable Context context) {
        this.f5080f = context;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5848C0() {
        return this.f5080f;
    }

    /* JADX INFO: renamed from: d */
    public View m5849d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return luw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m5853i1(guw guwVar) {
        this.f5078d = guwVar;
    }

    /* JADX INFO: renamed from: f */
    public void m5851f(MessageLocation messageLocation, final LatLng latLng) {
        this.f5075a.showZoomControls(false);
        this.f5079e = this.f5075a.getMap();
        this.f5079e.addOverlay(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(x2c0.Bt)).getBitmap())).draggable(false).position(latLng));
        this.f5079e.setMapStatus(MapStatusUpdateFactory.newLatLngZoom(latLng, 17.0f));
        this.f5079e.setOnMarkerClickListener(this);
        this.f5079e.setOnMapClickListener(this);
        this.f5077c.setText(messageLocation.name);
        this.f5077c.invalidate();
        this.f5077c.buildDrawingCache();
        xdl0.b0(this.f5076b, new v9j() { // from class: l.iuw
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f4502a.m5854j(latLng);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m5852i(LatLng latLng) {
        this.f5079e.addOverlay(new MarkerOptions().anchor(0.5f, 1.0f).icon(BitmapDescriptorFactory.fromBitmap(xdl0.x(this.f5076b, 1))).draggable(false).position(latLng));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m5849d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Boolean m5854j(final LatLng latLng) {
        xdl0.p0(this.f5076b);
        act().postDelayed(new Runnable() { // from class: l.juw
            @Override // java.lang.Runnable
            public final void run() {
                this.f4738a.m5852i(latLng);
            }
        }, 300L);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m5855k(LatLng latLng) {
        this.f5079e.addOverlay(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(x2c0.At)).getBitmap())).draggable(false).position(latLng));
    }

    /* JADX INFO: renamed from: l */
    public void m5856l() {
        if (NullChecker.a(this.f5075a)) {
            this.f5075a.onDestroy();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m5857m() {
        if (NullChecker.a(this.f5075a)) {
            this.f5075a.onPause();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m5858n() {
        if (NullChecker.a(this.f5075a)) {
            this.f5075a.onResume();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m5859p() {
        if (this.f5075a.getChildCount() > 0) {
            this.f5075a.getChildAt(0).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m5860q(final LatLng latLng) {
        act().postDelayed(new Runnable() { // from class: l.huw
            @Override // java.lang.Runnable
            public final void run() {
                this.f4280a.m5855k(latLng);
            }
        }, 300L);
    }

    public void destroy() {
    }
}
