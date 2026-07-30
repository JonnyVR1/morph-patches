package com.p046p1.mobile.putong.core.map;

import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p046p1.mobile.putong.core.map.IntlMapFragment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
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
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMapFragment extends SupportMapFragment implements pvl, ne50 {

    /* JADX INFO: renamed from: A */
    public final C22392a<roj0> f20547A = C22392a.m221512b();

    /* JADX INFO: renamed from: B */
    public final List<C7821a> f20548B = new ArrayList();

    /* JADX INFO: renamed from: C */
    public e4k f20549C;

    /* JADX INFO: renamed from: D */
    public pvl.InterfaceC19345a f20550D;

    /* JADX INFO: renamed from: E */
    public int f20551E;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapFragment$a */
    public class C7821a implements pvl.InterfaceC19346b {

        /* JADX INFO: renamed from: a */
        public final uuw f20552a;

        public C7821a(uuw uuwVar) {
            this.f20552a = uuwVar;
        }

        @Override // p149l.pvl.InterfaceC19346b
        public void remove() {
            IntlMapFragment.this.f20548B.remove(this);
            this.f20552a.m196038b();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapFragment$b */
    public static class C7822b implements pvl.InterfaceC19348d {

        /* JADX INFO: renamed from: a */
        public final b13 f20554a;

        public C7822b(b13 b13Var) {
            this.f20554a = b13Var;
        }

        @Override // p149l.pvl.InterfaceC19348d
        public void recycle() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapFragment$c */
    public class C7823c implements pvl.InterfaceC19347c {

        /* JADX INFO: renamed from: a */
        public MarkerOptions f20555a = new MarkerOptions();

        public C7823c() {
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: b */
        public pvl.InterfaceC19346b mo35940b() {
            if (!NullChecker.m81303a(IntlMapFragment.this.f20549C)) {
                return null;
            }
            IntlMapFragment intlMapFragment = IntlMapFragment.this;
            C7821a c7821a = intlMapFragment.new C7821a(intlMapFragment.f20549C.m114685a(this.f20555a));
            IntlMapFragment.this.f20548B.add(c7821a);
            return c7821a;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: c */
        public pvl.InterfaceC19347c mo35941c(float f, float f2) {
            this.f20555a.m15043g(f, f2);
            return this;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: d */
        public pvl.InterfaceC19347c mo35942d(pvl.InterfaceC19348d interfaceC19348d) {
            this.f20555a.m15051m0(((C7822b) interfaceC19348d).f20554a);
            return this;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: e */
        public pvl.InterfaceC19347c mo35943e(double d, double d2) {
            this.f20555a.m15055q0(new LatLng(d, d2));
            return this;
        }

        @Override // p149l.pvl.InterfaceC19347c
        /* JADX INFO: renamed from: g */
        public pvl.InterfaceC19347c mo35945g(boolean z) {
            this.f20555a.m15045h(z);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m35955d4(int i) {
        this.f20551E = i;
        if (NullChecker.m81303a(this.f20550D)) {
            this.f20550D.mo171678b(i == 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ boolean m35956f4(final uuw uuwVar) {
        if (!NullChecker.m81303a(this.f20550D)) {
            return false;
        }
        this.f20550D.mo171679c((C7821a) vwb.m200346r(this.f20548B, new w9j() { // from class: l.z9o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(uuwVar.m196037a().equals(((IntlMapFragment.C7821a) obj).f20552a.m196037a()));
            }
        }));
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public static IntlMapFragment m35957g4(GoogleMapOptions googleMapOptions) {
        IntlMapFragment intlMapFragment = new IntlMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        intlMapFragment.setArguments(bundle);
        return intlMapFragment;
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: E3 */
    public C22306c<roj0> mo35926E3() {
        return this.f20547A;
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: K1 */
    public void mo35927K1(double d, double d2, float f) {
        if (NullChecker.m81303a(this.f20549C)) {
            this.f20549C.m114686b(ac4.m95713a(new LatLng(d, d2), f));
        }
    }

    @Override // p149l.ne50
    /* JADX INFO: renamed from: P2 */
    public void mo35928P2(final e4k e4kVar) {
        this.f20549C = e4kVar;
        e4kVar.m114692h(new e4k.InterfaceC16534b() { // from class: l.w9o
            @Override // p149l.e4k.InterfaceC16534b
            /* JADX INFO: renamed from: b0 */
            public final void mo114696b0(int i) {
                this.f185389a.m35955d4(i);
            }
        });
        e4kVar.m114691g(new e4k.InterfaceC16533a() { // from class: l.x9o
            @Override // p149l.e4k.InterfaceC16533a
            /* JADX INFO: renamed from: U */
            public final void mo114695U() {
                this.f191636a.m35958e4(e4kVar);
            }
        });
        e4kVar.m114694j(new e4k.InterfaceC16536d() { // from class: l.y9o
            @Override // p149l.e4k.InterfaceC16536d
            /* JADX INFO: renamed from: X */
            public final boolean mo35964X(uuw uuwVar) {
                return this.f196984a.m35956f4(uuwVar);
            }
        });
        this.f20547A.onNext(roj0.f160388a);
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: X2 */
    public pvl.InterfaceC19348d mo35929X2(int i) {
        return new C7822b(c13.m104788b(i));
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: b2 */
    public void mo35930b2() {
        if (NullChecker.m81303a(this.f20549C)) {
            this.f20549C.m114687c();
        }
    }

    @Override // p149l.pvl
    /* JADX INFO: renamed from: d3 */
    public pvl.InterfaceC19347c mo35931d3() {
        return new C7823c();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m35958e4(e4k e4kVar) {
        if (NullChecker.m81303a(this.f20550D)) {
            CameraPosition cameraPositionM114688d = e4kVar.m114688d();
            pvl.InterfaceC19345a interfaceC19345a = this.f20550D;
            LatLng latLng = cameraPositionM114688d.target;
            interfaceC19345a.mo171680d(latLng.latitude, latLng.longitude, cameraPositionM114688d.zoom, this.f20551E == 1);
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
        this.f20550D = interfaceC19345a;
    }
}
