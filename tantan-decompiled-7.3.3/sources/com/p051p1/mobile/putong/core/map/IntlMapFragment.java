package com.p051p1.mobile.putong.core.map;

import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p051p1.mobile.putong.core.map.IntlMapFragment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.hyl;
import p153l.jyb;
import p153l.q13;
import p153l.qcj;
import p153l.r13;
import p153l.txw;
import p153l.um50;
import p153l.uxj0;
import p153l.w6k;
import p153l.zc4;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMapFragment extends SupportMapFragment implements hyl, um50 {

    /* JADX INFO: renamed from: A */
    public final C22507a<uxj0> f21289A = C22507a.m222758b();

    /* JADX INFO: renamed from: B */
    public final List<C7972a> f21290B = new ArrayList();

    /* JADX INFO: renamed from: C */
    public w6k f21291C;

    /* JADX INFO: renamed from: D */
    public hyl.InterfaceC17599a f21292D;

    /* JADX INFO: renamed from: E */
    public int f21293E;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapFragment$a */
    public class C7972a implements hyl.InterfaceC17600b {

        /* JADX INFO: renamed from: a */
        public final txw f21294a;

        public C7972a(txw txwVar) {
            this.f21294a = txwVar;
        }

        @Override // p153l.hyl.InterfaceC17600b
        public void remove() {
            IntlMapFragment.this.f21290B.remove(this);
            this.f21294a.m193539b();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapFragment$b */
    public static class C7973b implements hyl.InterfaceC17602d {

        /* JADX INFO: renamed from: a */
        public final q13 f21296a;

        public C7973b(q13 q13Var) {
            this.f21296a = q13Var;
        }

        @Override // p153l.hyl.InterfaceC17602d
        public void recycle() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapFragment$c */
    public class C7974c implements hyl.InterfaceC17601c {

        /* JADX INFO: renamed from: a */
        public MarkerOptions f21297a = new MarkerOptions();

        public C7974c() {
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: b */
        public hyl.InterfaceC17600b mo36943b() {
            if (!NullChecker.m82486a(IntlMapFragment.this.f21291C)) {
                return null;
            }
            IntlMapFragment intlMapFragment = IntlMapFragment.this;
            C7972a c7972a = intlMapFragment.new C7972a(intlMapFragment.f21291C.m205107a(this.f21297a));
            IntlMapFragment.this.f21290B.add(c7972a);
            return c7972a;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: c */
        public hyl.InterfaceC17601c mo36944c(float f, float f2) {
            this.f21297a.m15097g(f, f2);
            return this;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: d */
        public hyl.InterfaceC17601c mo36945d(hyl.InterfaceC17602d interfaceC17602d) {
            this.f21297a.m15105n0(((C7973b) interfaceC17602d).f21296a);
            return this;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: e */
        public hyl.InterfaceC17601c mo36946e(double d, double d2) {
            this.f21297a.m15109r0(new LatLng(d, d2));
            return this;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: g */
        public hyl.InterfaceC17601c mo36948g(boolean z) {
            this.f21297a.m15098h(z);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m36958d4(int i) {
        this.f21293E = i;
        if (NullChecker.m82486a(this.f21292D)) {
            this.f21292D.mo137752b(i == 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ boolean m36959f4(final txw txwVar) {
        if (!NullChecker.m82486a(this.f21292D)) {
            return false;
        }
        this.f21292D.mo137753c((C7972a) jyb.m147529r(this.f21290B, new qcj() { // from class: l.zbo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(txwVar.m193538a().equals(((IntlMapFragment.C7972a) obj).f21294a.m193538a()));
            }
        }));
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public static IntlMapFragment m36960g4(GoogleMapOptions googleMapOptions) {
        IntlMapFragment intlMapFragment = new IntlMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        intlMapFragment.setArguments(bundle);
        return intlMapFragment;
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: E3 */
    public C22421c<uxj0> mo36929E3() {
        return this.f21289A;
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: K1 */
    public void mo36930K1(double d, double d2, float f) {
        if (NullChecker.m82486a(this.f21291C)) {
            this.f21291C.m205108b(zc4.m219230a(new LatLng(d, d2), f));
        }
    }

    @Override // p153l.um50
    /* JADX INFO: renamed from: P2 */
    public void mo36931P2(final w6k w6kVar) {
        this.f21291C = w6kVar;
        w6kVar.m205114h(new w6k.InterfaceC21037b() { // from class: l.wbo
            @Override // p153l.w6k.InterfaceC21037b
            /* JADX INFO: renamed from: b0 */
            public final void mo182417b0(int i) {
                this.f188260a.m36958d4(i);
            }
        });
        w6kVar.m205113g(new w6k.InterfaceC21036a() { // from class: l.xbo
            @Override // p153l.w6k.InterfaceC21036a
            /* JADX INFO: renamed from: U */
            public final void mo192077U() {
                this.f193178a.m36961e4(w6kVar);
            }
        });
        w6kVar.m205116j(new w6k.InterfaceC21039d() { // from class: l.ybo
            @Override // p153l.w6k.InterfaceC21039d
            /* JADX INFO: renamed from: Y */
            public final boolean mo36967Y(txw txwVar) {
                return this.f198352a.m36959f4(txwVar);
            }
        });
        this.f21289A.onNext(uxj0.f181467a);
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: X2 */
    public hyl.InterfaceC17602d mo36932X2(int i) {
        return new C7973b(r13.m179324b(i));
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: b2 */
    public void mo36933b2() {
        if (NullChecker.m82486a(this.f21291C)) {
            this.f21291C.m205109c();
        }
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: d3 */
    public hyl.InterfaceC17601c mo36934d3() {
        return new C7974c();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m36961e4(w6k w6kVar) {
        if (NullChecker.m82486a(this.f21292D)) {
            CameraPosition cameraPositionM205110d = w6kVar.m205110d();
            hyl.InterfaceC17599a interfaceC17599a = this.f21292D;
            LatLng latLng = cameraPositionM205110d.target;
            interfaceC17599a.mo137754d(latLng.latitude, latLng.longitude, cameraPositionM205110d.zoom, this.f21293E == 1);
        }
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m15075V3(this);
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: r1 */
    public void mo36939r1(hyl.InterfaceC17599a interfaceC17599a) {
        this.f21292D = interfaceC17599a;
    }
}
