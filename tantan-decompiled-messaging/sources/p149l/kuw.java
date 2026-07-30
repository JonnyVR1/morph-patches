package p149l;

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
import com.p046p1.mobile.putong.data.MessageLocation;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class kuw implements s7m<guw>, BaiduMap.OnMarkerClickListener, BaiduMap.OnMapClickListener {

    /* JADX INFO: renamed from: a */
    public MapView f124724a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f124725b;

    /* JADX INFO: renamed from: c */
    public VText f124726c;

    /* JADX INFO: renamed from: d */
    public guw f124727d;

    /* JADX INFO: renamed from: e */
    public BaiduMap f124728e;

    /* JADX INFO: renamed from: f */
    public Context f124729f;

    public kuw(@Nullable Context context) {
        this.f124729f = context;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f124729f;
    }

    /* JADX INFO: renamed from: d */
    public View m147331d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return luw.m151824b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(guw guwVar) {
        this.f124727d = guwVar;
    }

    /* JADX INFO: renamed from: f */
    public void m147333f(MessageLocation messageLocation, final LatLng latLng) {
        this.f124724a.showZoomControls(false);
        this.f124728e = this.f124724a.getMap();
        this.f124728e.addOverlay(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(x2c0.f189215Bt)).getBitmap())).draggable(false).position(latLng));
        this.f124728e.setMapStatus(MapStatusUpdateFactory.newLatLngZoom(latLng, 17.0f));
        this.f124728e.setOnMarkerClickListener(this);
        this.f124728e.setOnMapClickListener(this);
        this.f124726c.setText(messageLocation.name);
        this.f124726c.invalidate();
        this.f124726c.buildDrawingCache();
        xdl0.m208366b0(this.f124725b, new v9j() { // from class: l.iuw
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f115058a.m147335j(latLng);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m147334i(LatLng latLng) {
        this.f124728e.addOverlay(new MarkerOptions().anchor(0.5f, 1.0f).icon(BitmapDescriptorFactory.fromBitmap(xdl0.m208409x(this.f124725b, 1))).draggable(false).position(latLng));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m147331d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Boolean m147335j(final LatLng latLng) {
        xdl0.m208394p0(this.f124725b);
        act().postDelayed(new Runnable() { // from class: l.juw
            @Override // java.lang.Runnable
            public final void run() {
                this.f119819a.m147334i(latLng);
            }
        }, 300L);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m147336k(LatLng latLng) {
        this.f124728e.addOverlay(new MarkerOptions().anchor(0.5f, 0.5f).icon(BitmapDescriptorFactory.fromBitmap(((BitmapDrawable) act().res.getDrawable(x2c0.f189183At)).getBitmap())).draggable(false).position(latLng));
    }

    /* JADX INFO: renamed from: l */
    public void m147337l() {
        if (NullChecker.m81303a(this.f124724a)) {
            this.f124724a.onDestroy();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m147338m() {
        if (NullChecker.m81303a(this.f124724a)) {
            this.f124724a.onPause();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m147339n() {
        if (NullChecker.m81303a(this.f124724a)) {
            this.f124724a.onResume();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m147340p() {
        if (this.f124724a.getChildCount() > 0) {
            this.f124724a.getChildAt(0).setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m147341q(final LatLng latLng) {
        act().postDelayed(new Runnable() { // from class: l.huw
            @Override // java.lang.Runnable
            public final void run() {
                this.f109591a.m147336k(latLng);
            }
        }, 300L);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
