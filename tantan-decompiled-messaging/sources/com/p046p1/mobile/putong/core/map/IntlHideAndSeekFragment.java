package com.p046p1.mobile.putong.core.map;

import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p046p1.mobile.putong.core.map.IntlHideAndSeekFragment;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ac4;
import p149l.b13;
import p149l.c13;
import p149l.e4k;
import p149l.ne50;
import p149l.pvl;
import p149l.roj0;
import p149l.uuw;
import p149l.wmf0;

/* JADX INFO: loaded from: classes10.dex */
public class IntlHideAndSeekFragment extends SupportMapFragment implements pvl, ne50 {

    /* JADX INFO: renamed from: A */
    public final C22392a<roj0> f20536A = C22392a.m221512b();

    /* JADX INFO: renamed from: B */
    public final wmf0<C7818a> f20537B = new wmf0<>();

    /* JADX INFO: renamed from: C */
    public e4k f20538C;

    /* JADX INFO: renamed from: D */
    public pvl.InterfaceC19345a f20539D;

    /* JADX INFO: renamed from: E */
    public int f20540E;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlHideAndSeekFragment$a */
    public class C7818a implements pvl.InterfaceC19346b {

        /* JADX INFO: renamed from: a */
        public final uuw f20541a;

        public C7818a(uuw uuwVar) {
            this.f20541a = uuwVar;
        }

        @Override // p149l.pvl.InterfaceC19346b
        /* JADX INFO: renamed from: a */
        public void mo35937a(int i) {
            IntlHideAndSeekFragment.this.f20537B.m203987k(i);
            this.f20541a.m196038b();
        }

        @Override // p149l.pvl.InterfaceC19346b
        public void remove() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlHideAndSeekFragment$b */
    public static class C7819b implements pvl.InterfaceC19348d {

        /* JADX INFO: renamed from: a */
        public final b13 f20543a;

        public C7819b(b13 b13Var) {
            this.f20543a = b13Var;
        }

        @Override // p149l.pvl.InterfaceC19348d
        public void recycle() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlHideAndSeekFragment$c */
    public class C7820c implements pvl.InterfaceC19347c {

        /* JADX INFO: renamed from: a */
        public MarkerOptions f20544a = new MarkerOptions();

        /* JADX INFO: renamed from: b */
        public int f20545b;

        public C7820c() {
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: a */
        public pvl.InterfaceC19347c mo35939a(int i) {
            this.f20545b = i;
            return this;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: b */
        public pvl.InterfaceC19346b mo35940b() {
            if (!NullChecker.m81303a(IntlHideAndSeekFragment.this.f20538C)) {
                return null;
            }
            IntlHideAndSeekFragment intlHideAndSeekFragment = IntlHideAndSeekFragment.this;
            C7818a c7818a = intlHideAndSeekFragment.new C7818a(intlHideAndSeekFragment.f20538C.m114685a(this.f20544a));
            IntlHideAndSeekFragment.this.f20537B.m203986j(this.f20545b, c7818a);
            return c7818a;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: c */
        public pvl.InterfaceC19347c mo35941c(float f, float f2) {
            this.f20544a.m15043g(f, f2);
            return this;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: d */
        public pvl.InterfaceC19347c mo35942d(pvl.InterfaceC19348d interfaceC19348d) {
            this.f20544a.m15051m0(((C7819b) interfaceC19348d).f20543a);
            return this;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: e */
        public pvl.InterfaceC19347c mo35943e(double d, double d2) {
            this.f20544a.m15055q0(new LatLng(d, d2));
            return this;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: f */
        public pvl.InterfaceC19347c mo35944f(float f) {
            this.f20544a.m15056r0(f);
            return this;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: g */
        public pvl.InterfaceC19347c mo35945g(boolean z) {
            this.f20544a.m15045h(z);
            return this;
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ boolean m35920Z3(uuw uuwVar) {
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public static IntlHideAndSeekFragment m35924h4(GoogleMapOptions googleMapOptions) {
        IntlHideAndSeekFragment intlHideAndSeekFragment = new IntlHideAndSeekFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        intlHideAndSeekFragment.setArguments(bundle);
        return intlHideAndSeekFragment;
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: E3 */
    public C22306c<roj0> mo35926E3() {
        return this.f20536A;
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: K1 */
    public void mo35927K1(double d, double d2, float f) {
        if (NullChecker.m81303a(this.f20538C)) {
            this.f20538C.m114686b(ac4.m95713a(new LatLng(d, d2), f));
        }
    }

    @Override // p149l.ne50
    /* JADX INFO: renamed from: P2 */
    public void mo35928P2(final e4k e4kVar) {
        this.f20538C = e4kVar;
        e4kVar.m114692h(new e4k.InterfaceC16534b() { // from class: l.rmn
            @Override // p149l.e4k.InterfaceC16534b
            /* JADX INFO: renamed from: b0 */
            public final void mo114696b0(int i) {
                this.f160107a.m35933e4(i);
            }
        });
        e4kVar.m114693i(new e4k.InterfaceC16535c() { // from class: l.smn
            @Override // p149l.e4k.InterfaceC16535c
            /* JADX INFO: renamed from: N */
            public final void mo35963N(LatLng latLng) {
                this.f165361a.m35934f4(latLng);
            }
        });
        e4kVar.m114691g(new e4k.InterfaceC16533a() { // from class: l.tmn
            @Override // p149l.e4k.InterfaceC16533a
            /* JADX INFO: renamed from: U */
            public final void mo114695U() {
                this.f171158a.m35935g4(e4kVar);
            }
        });
        e4kVar.m114694j(new e4k.InterfaceC16536d() { // from class: l.umn
            @Override // p149l.e4k.InterfaceC16536d
            /* JADX INFO: renamed from: X */
            public final boolean mo35964X(uuw uuwVar) {
                return IntlHideAndSeekFragment.m35920Z3(uuwVar);
            }
        });
        e4kVar.m114689e().m96975a(false);
        this.f20536A.onNext(roj0.f160388a);
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: X2 */
    public pvl.InterfaceC19348d mo35929X2(int i) {
        return new C7819b(c13.m104788b(i));
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: b2 */
    public void mo35930b2() {
        if (NullChecker.m81303a(this.f20538C)) {
            this.f20538C.m114687c();
        }
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: d3 */
    public pvl.InterfaceC19347c mo35931d3() {
        return new C7820c();
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: d4, reason: merged with bridge method [inline-methods] */
    public C7818a mo35925B0(int i) {
        return this.f20537B.m203983d(i);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m35933e4(int i) {
        this.f20540E = i;
        if (NullChecker.m81303a(this.f20539D)) {
            this.f20539D.mo171678b(i == 1);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m35934f4(LatLng latLng) {
        if (NullChecker.m81303a(this.f20539D)) {
            this.f20539D.mo171677a();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m35935g4(e4k e4kVar) {
        if (NullChecker.m81303a(this.f20539D)) {
            CameraPosition cameraPositionM114688d = e4kVar.m114688d();
            pvl.InterfaceC19345a interfaceC19345a = this.f20539D;
            LatLng latLng = cameraPositionM114688d.target;
            interfaceC19345a.mo171680d(latLng.latitude, latLng.longitude, cameraPositionM114688d.zoom, this.f20540E == 1);
        }
    }

    @Override // com.google.android.gms.maps.SupportMapFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m15021V3(this);
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: r1 */
    public void mo35936r1(pvl.InterfaceC19345a interfaceC19345a) {
        this.f20539D = interfaceC19345a;
    }
}
