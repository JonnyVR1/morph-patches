package com.p000p1.mobile.putong.core.map;

import android.annotation.SuppressLint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.ui.map.intl.IntlMapPreviewBaseAct;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.location.Location;
import l.ac4;
import l.b13;
import l.c13;
import l.e30;
import l.e4k;
import l.mkd0;
import l.ne50;
import l.qib0;
import l.rol;
import l.u4c0;
import l.uuw;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlMapPreviewAct extends IntlMapPreviewBaseAct implements ne50, e4k.d, e4k.c, rol {

    /* JADX INFO: renamed from: e */
    public LatLng f219e;

    /* JADX INFO: renamed from: f */
    public MessageLocation f220f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapPreviewAct$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC3056a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f221a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e4k f222b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LatLng f223c;

        public ViewTreeObserverOnGlobalLayoutListenerC3056a(View view, e4k e4kVar, LatLng latLng) {
            this.f221a = view;
            this.f222b = e4kVar;
            this.f223c = latLng;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
            this.f221a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f222b.f(ac4.a(this.f223c, 17.0f));
        }
    }

    /* JADX INFO: renamed from: N */
    public void m785N(LatLng latLng) {
        m787X(null);
    }

    /* JADX INFO: renamed from: P2 */
    public void m786P2(final e4k e4kVar) {
        e4kVar.e().b(false);
        final b13 b13VarA = c13.a(((BitmapDrawable) act().res.getDrawable(x2c0.At)).getBitmap());
        qib0.E.p().take(1).subscribe(mkd0.G(new e30() { // from class: l.yao
            public final void call(Object obj) {
                this.f9016a.m790g2(e4kVar, b13VarA, (Location) obj);
            }
        }));
        m789e2(e4kVar, this.f220f, this.f219e);
    }

    /* JADX INFO: renamed from: X */
    public boolean m787X(uuw uuwVar) {
        return ((PutongMvpAct) this).c.g0();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m788Z1(MessageLocation messageLocation, double d, double d2) {
        this.f220f = messageLocation;
        this.f219e = new LatLng(d, d2);
        SupportMapFragment supportMapFragmentW3 = SupportMapFragment.W3();
        getSupportFragmentManager().m().s(u4c0.P7, supportMapFragmentW3).i();
        supportMapFragmentW3.V3(this);
    }

    /* JADX INFO: renamed from: e2 */
    public void m789e2(final e4k e4kVar, MessageLocation messageLocation, final LatLng latLng) {
        e4kVar.a(new MarkerOptions().g(0.5f, 0.5f).m0(c13.a(((BitmapDrawable) act().res.getDrawable(x2c0.Bt)).getBitmap())).h(false).q0(latLng));
        e4kVar.j(this);
        e4kVar.i(this);
        View view = act().getSupportFragmentManager().h0(u4c0.P7).getView();
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3056a(view, e4kVar, latLng));
        }
        ((PutongMvpAct) this).d.j(messageLocation, new e30() { // from class: l.zao
            public final void call(Object obj) {
                e4kVar.a(new MarkerOptions().g(0.5f, 1.0f).m0(c13.a(xdl0.x((View) obj, 1))).h(false).q0(latLng));
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m790g2(e4k e4kVar, b13 b13Var, Location location) {
        m791h2(e4kVar, new LatLng(location.u(), location.x()), b13Var);
    }

    /* JADX INFO: renamed from: h2 */
    public void m791h2(e4k e4kVar, LatLng latLng, b13 b13Var) {
        e4kVar.a(new MarkerOptions().g(0.5f, 0.5f).m0(b13Var).h(false).q0(latLng));
    }
}
