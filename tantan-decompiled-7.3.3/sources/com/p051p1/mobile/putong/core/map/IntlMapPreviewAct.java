package com.p051p1.mobile.putong.core.map;

import android.annotation.SuppressLint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapPreviewBaseAct;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.location.Location;
import p153l.adc0;
import p153l.bdo;
import p153l.crl;
import p153l.dbc0;
import p153l.edo;
import p153l.psd0;
import p153l.q13;
import p153l.r13;
import p153l.txw;
import p153l.um50;
import p153l.uqb0;
import p153l.w6k;
import p153l.y20;
import p153l.zc4;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMapPreviewAct extends IntlMapPreviewBaseAct implements um50, w6k.InterfaceC21039d, w6k.InterfaceC21038c, crl {

    /* JADX INFO: renamed from: e */
    public LatLng f21299e;

    /* JADX INFO: renamed from: f */
    public MessageLocation f21300f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapPreviewAct$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC7975a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f21301a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w6k f21302b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LatLng f21303c;

        public ViewTreeObserverOnGlobalLayoutListenerC7975a(View view, w6k w6kVar, LatLng latLng) {
            this.f21301a = view;
            this.f21302b = w6kVar;
            this.f21303c = latLng;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
            this.f21301a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f21302b.m205112f(zc4.m219230a(this.f21303c, 17.0f));
        }
    }

    @Override // p153l.w6k.InterfaceC21038c
    /* JADX INFO: renamed from: N */
    public void mo36966N(LatLng latLng) {
        mo36967Y(null);
    }

    @Override // p153l.um50
    /* JADX INFO: renamed from: P2 */
    public void mo36931P2(final w6k w6kVar) {
        w6kVar.m205111e().m117770b(false);
        final q13 q13VarM179323a = r13.m179323a(((BitmapDrawable) act().res.getDrawable(dbc0.f87298ou)).getBitmap());
        uqb0.f180370E.m80047p().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.yco
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198529a.m36970h2(w6kVar, q13VarM179323a, (Location) obj);
            }
        }));
        m36969g2(w6kVar, this.f21300f, this.f21299e);
    }

    @Override // p153l.w6k.InterfaceC21039d
    /* JADX INFO: renamed from: Y */
    public boolean mo36967Y(txw txwVar) {
        return ((bdo) this.f17891c).m103617g0();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapPreviewBaseAct
    /* JADX INFO: renamed from: a2 */
    public void mo36968a2(MessageLocation messageLocation, double d, double d2) {
        this.f21300f = messageLocation;
        this.f21299e = new LatLng(d, d2);
        SupportMapFragment supportMapFragmentM15074W3 = SupportMapFragment.m15074W3();
        getSupportFragmentManager().m2568m().m2812s(adc0.f70101R7, supportMapFragmentM15074W3).mo2708i();
        supportMapFragmentM15074W3.m15075V3(this);
    }

    /* JADX INFO: renamed from: g2 */
    public void m36969g2(final w6k w6kVar, MessageLocation messageLocation, final LatLng latLng) {
        w6kVar.m205107a(new MarkerOptions().m15097g(0.5f, 0.5f).m15105n0(r13.m179323a(((BitmapDrawable) act().res.getDrawable(dbc0.f87331pu)).getBitmap())).m15098h(false).m15109r0(latLng));
        w6kVar.m205116j(this);
        w6kVar.m205115i(this);
        View view = act().getSupportFragmentManager().m2555h0(adc0.f70101R7).getView();
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC7975a(view, w6kVar, latLng));
        }
        ((edo) this.f17892d).m120510j(messageLocation, new y20() { // from class: l.zco
            @Override // p153l.y20
            public final void call(Object obj) {
                w6kVar.m205107a(new MarkerOptions().m15097g(0.5f, 1.0f).m15105n0(r13.m179323a(bnl0.m105589x((View) obj, 1))).m15098h(false).m15109r0(latLng));
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m36970h2(w6k w6kVar, q13 q13Var, Location location) {
        m36971i2(w6kVar, new LatLng(location.m80014u(), location.m80016x()), q13Var);
    }

    /* JADX INFO: renamed from: i2 */
    public void m36971i2(w6k w6kVar, LatLng latLng, q13 q13Var) {
        w6kVar.m205107a(new MarkerOptions().m15097g(0.5f, 0.5f).m15105n0(q13Var).m15098h(false).m15109r0(latLng));
    }
}
