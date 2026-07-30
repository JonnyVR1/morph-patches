package com.p046p1.mobile.putong.core.map;

import android.annotation.SuppressLint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapPreviewBaseAct;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.location.Location;
import p149l.ac4;
import p149l.b13;
import p149l.bbo;
import p149l.c13;
import p149l.e30;
import p149l.e4k;
import p149l.ebo;
import p149l.mkd0;
import p149l.ne50;
import p149l.qib0;
import p149l.rol;
import p149l.u4c0;
import p149l.uuw;
import p149l.x2c0;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMapPreviewAct extends IntlMapPreviewBaseAct implements ne50, e4k.InterfaceC16536d, e4k.InterfaceC16535c, rol {

    /* JADX INFO: renamed from: e */
    public LatLng f20557e;

    /* JADX INFO: renamed from: f */
    public MessageLocation f20558f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapPreviewAct$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC7824a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f20559a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e4k f20560b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LatLng f20561c;

        public ViewTreeObserverOnGlobalLayoutListenerC7824a(View view, e4k e4kVar, LatLng latLng) {
            this.f20559a = view;
            this.f20560b = e4kVar;
            this.f20561c = latLng;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
            this.f20559a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f20560b.m114690f(ac4.m95713a(this.f20561c, 17.0f));
        }
    }

    @Override // p149l.e4k.InterfaceC16535c
    /* JADX INFO: renamed from: N */
    public void mo35963N(LatLng latLng) {
        mo35964X(null);
    }

    @Override // p149l.ne50
    /* JADX INFO: renamed from: P2 */
    public void mo35928P2(final e4k e4kVar) {
        e4kVar.m114689e().m96976b(false);
        final b13 b13VarM104787a = c13.m104787a(((BitmapDrawable) act().res.getDrawable(x2c0.f189183At)).getBitmap());
        qib0.f154687E.m78864p().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.yao
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197227a.m35967g2(e4kVar, b13VarM104787a, (Location) obj);
            }
        }));
        m35966e2(e4kVar, this.f20558f, this.f20557e);
    }

    @Override // p149l.e4k.InterfaceC16536d
    /* JADX INFO: renamed from: X */
    public boolean mo35964X(uuw uuwVar) {
        return ((bbo) this.f17172c).m100992g0();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapPreviewBaseAct
    /* JADX INFO: renamed from: Z1 */
    public void mo35965Z1(MessageLocation messageLocation, double d, double d2) {
        this.f20558f = messageLocation;
        this.f20557e = new LatLng(d, d2);
        SupportMapFragment supportMapFragmentM15020W3 = SupportMapFragment.m15020W3();
        getSupportFragmentManager().m2567m().m2811s(u4c0.f173979P7, supportMapFragmentM15020W3).mo2707i();
        supportMapFragmentM15020W3.m15021V3(this);
    }

    /* JADX INFO: renamed from: e2 */
    public void m35966e2(final e4k e4kVar, MessageLocation messageLocation, final LatLng latLng) {
        e4kVar.m114685a(new MarkerOptions().m15043g(0.5f, 0.5f).m15051m0(c13.m104787a(((BitmapDrawable) act().res.getDrawable(x2c0.f189215Bt)).getBitmap())).m15045h(false).m15055q0(latLng));
        e4kVar.m114694j(this);
        e4kVar.m114693i(this);
        View view = act().getSupportFragmentManager().m2554h0(u4c0.f173979P7).getView();
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC7824a(view, e4kVar, latLng));
        }
        ((ebo) this.f17173d).m115515j(messageLocation, new e30() { // from class: l.zao
            @Override // p149l.e30
            public final void call(Object obj) {
                e4kVar.m114685a(new MarkerOptions().m15043g(0.5f, 1.0f).m15051m0(c13.m104787a(xdl0.m208409x((View) obj, 1))).m15045h(false).m15055q0(latLng));
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m35967g2(e4k e4kVar, b13 b13Var, Location location) {
        m35968h2(e4kVar, new LatLng(location.m78831u(), location.m78833x()), b13Var);
    }

    /* JADX INFO: renamed from: h2 */
    public void m35968h2(e4k e4kVar, LatLng latLng, b13 b13Var) {
        e4kVar.m114685a(new MarkerOptions().m15043g(0.5f, 0.5f).m15051m0(b13Var).m15045h(false).m15055q0(latLng));
    }
}
