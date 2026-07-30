package com.p051p1.mobile.putong.core.map;

import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p051p1.mobile.putong.core.map.IntlHideAndSeekFragment;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.fvf0;
import p153l.hyl;
import p153l.q13;
import p153l.r13;
import p153l.txw;
import p153l.um50;
import p153l.uxj0;
import p153l.w6k;
import p153l.zc4;

/* JADX INFO: loaded from: classes10.dex */
public class IntlHideAndSeekFragment extends SupportMapFragment implements hyl, um50 {

    /* JADX INFO: renamed from: A */
    public final C22507a<uxj0> f21278A = C22507a.m222758b();

    /* JADX INFO: renamed from: B */
    public final fvf0<C7969a> f21279B = new fvf0<>();

    /* JADX INFO: renamed from: C */
    public w6k f21280C;

    /* JADX INFO: renamed from: D */
    public hyl.InterfaceC17599a f21281D;

    /* JADX INFO: renamed from: E */
    public int f21282E;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlHideAndSeekFragment$a */
    public class C7969a implements hyl.InterfaceC17600b {

        /* JADX INFO: renamed from: a */
        public final txw f21283a;

        public C7969a(txw txwVar) {
            this.f21283a = txwVar;
        }

        @Override // p153l.hyl.InterfaceC17600b
        /* JADX INFO: renamed from: a */
        public void mo36940a(int i) {
            IntlHideAndSeekFragment.this.f21279B.m127617k(i);
            this.f21283a.m193539b();
        }

        @Override // p153l.hyl.InterfaceC17600b
        public void remove() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlHideAndSeekFragment$b */
    public static class C7970b implements hyl.InterfaceC17602d {

        /* JADX INFO: renamed from: a */
        public final q13 f21285a;

        public C7970b(q13 q13Var) {
            this.f21285a = q13Var;
        }

        @Override // p153l.hyl.InterfaceC17602d
        public void recycle() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlHideAndSeekFragment$c */
    public class C7971c implements hyl.InterfaceC17601c {

        /* JADX INFO: renamed from: a */
        public MarkerOptions f21286a = new MarkerOptions();

        /* JADX INFO: renamed from: b */
        public int f21287b;

        public C7971c() {
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: a */
        public hyl.InterfaceC17601c mo36942a(int i) {
            this.f21287b = i;
            return this;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: b */
        public hyl.InterfaceC17600b mo36943b() {
            if (!NullChecker.m82486a(IntlHideAndSeekFragment.this.f21280C)) {
                return null;
            }
            IntlHideAndSeekFragment intlHideAndSeekFragment = IntlHideAndSeekFragment.this;
            C7969a c7969a = intlHideAndSeekFragment.new C7969a(intlHideAndSeekFragment.f21280C.m205107a(this.f21286a));
            IntlHideAndSeekFragment.this.f21279B.m127616j(this.f21287b, c7969a);
            return c7969a;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: c */
        public hyl.InterfaceC17601c mo36944c(float f, float f2) {
            this.f21286a.m15097g(f, f2);
            return this;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: d */
        public hyl.InterfaceC17601c mo36945d(hyl.InterfaceC17602d interfaceC17602d) {
            this.f21286a.m15105n0(((C7970b) interfaceC17602d).f21285a);
            return this;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: e */
        public hyl.InterfaceC17601c mo36946e(double d, double d2) {
            this.f21286a.m15109r0(new LatLng(d, d2));
            return this;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: f */
        public hyl.InterfaceC17601c mo36947f(float f) {
            this.f21286a.m15110s0(f);
            return this;
        }

        @Override // p153l.hyl.InterfaceC17601c
        /* JADX INFO: renamed from: g */
        public hyl.InterfaceC17601c mo36948g(boolean z) {
            this.f21286a.m15098h(z);
            return this;
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ boolean m36923Z3(txw txwVar) {
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public static IntlHideAndSeekFragment m36927h4(GoogleMapOptions googleMapOptions) {
        IntlHideAndSeekFragment intlHideAndSeekFragment = new IntlHideAndSeekFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        intlHideAndSeekFragment.setArguments(bundle);
        return intlHideAndSeekFragment;
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: E3 */
    public C22421c<uxj0> mo36929E3() {
        return this.f21278A;
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: K1 */
    public void mo36930K1(double d, double d2, float f) {
        if (NullChecker.m82486a(this.f21280C)) {
            this.f21280C.m205108b(zc4.m219230a(new LatLng(d, d2), f));
        }
    }

    @Override // p153l.um50
    /* JADX INFO: renamed from: P2 */
    public void mo36931P2(final w6k w6kVar) {
        this.f21280C = w6kVar;
        w6kVar.m205114h(new w6k.InterfaceC21037b() { // from class: l.ron
            @Override // p153l.w6k.InterfaceC21037b
            /* JADX INFO: renamed from: b0 */
            public final void mo182417b0(int i) {
                this.f164219a.m36936e4(i);
            }
        });
        w6kVar.m205115i(new w6k.InterfaceC21038c() { // from class: l.son
            @Override // p153l.w6k.InterfaceC21038c
            /* JADX INFO: renamed from: N */
            public final void mo36966N(LatLng latLng) {
                this.f169911a.m36937f4(latLng);
            }
        });
        w6kVar.m205113g(new w6k.InterfaceC21036a() { // from class: l.ton
            @Override // p153l.w6k.InterfaceC21036a
            /* JADX INFO: renamed from: U */
            public final void mo192077U() {
                this.f175430a.m36938g4(w6kVar);
            }
        });
        w6kVar.m205116j(new w6k.InterfaceC21039d() { // from class: l.uon
            @Override // p153l.w6k.InterfaceC21039d
            /* JADX INFO: renamed from: Y */
            public final boolean mo36967Y(txw txwVar) {
                return IntlHideAndSeekFragment.m36923Z3(txwVar);
            }
        });
        w6kVar.m205111e().m117769a(false);
        this.f21278A.onNext(uxj0.f181467a);
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: X2 */
    public hyl.InterfaceC17602d mo36932X2(int i) {
        return new C7970b(r13.m179324b(i));
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: b2 */
    public void mo36933b2() {
        if (NullChecker.m82486a(this.f21280C)) {
            this.f21280C.m205109c();
        }
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: d3 */
    public hyl.InterfaceC17601c mo36934d3() {
        return new C7971c();
    }

    @Override // p153l.hyl
    /* JADX INFO: renamed from: d4, reason: merged with bridge method [inline-methods] */
    public C7969a mo36928B0(int i) {
        return this.f21279B.m127613d(i);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m36936e4(int i) {
        this.f21282E = i;
        if (NullChecker.m82486a(this.f21281D)) {
            this.f21281D.mo137752b(i == 1);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m36937f4(LatLng latLng) {
        if (NullChecker.m82486a(this.f21281D)) {
            this.f21281D.mo137751a();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m36938g4(w6k w6kVar) {
        if (NullChecker.m82486a(this.f21281D)) {
            CameraPosition cameraPositionM205110d = w6kVar.m205110d();
            hyl.InterfaceC17599a interfaceC17599a = this.f21281D;
            LatLng latLng = cameraPositionM205110d.target;
            interfaceC17599a.mo137754d(latLng.latitude, latLng.longitude, cameraPositionM205110d.zoom, this.f21282E == 1);
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
        this.f21281D = interfaceC17599a;
    }
}
