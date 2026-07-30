package com.p000p1.mobile.putong.core.map;

import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p000p1.mobile.putong.core.map.IntlHideAndSeekFragment;
import com.tantanapp.common.utils.NullChecker;
import l.ac4;
import l.b13;
import l.c13;
import l.e4k;
import l.ne50;
import l.pvl;
import l.roj0;
import l.uuw;
import l.wmf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlHideAndSeekFragment extends SupportMapFragment implements pvl, ne50 {

    /* JADX INFO: renamed from: A */
    public final a<roj0> f198A = a.b();

    /* JADX INFO: renamed from: B */
    public final wmf0<C3050a> f199B = new wmf0<>();

    /* JADX INFO: renamed from: C */
    public e4k f200C;

    /* JADX INFO: renamed from: D */
    public pvl.a f201D;

    /* JADX INFO: renamed from: E */
    public int f202E;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlHideAndSeekFragment$a */
    public class C3050a implements pvl.b {

        /* JADX INFO: renamed from: a */
        public final uuw f203a;

        public C3050a(uuw uuwVar) {
            this.f203a = uuwVar;
        }

        /* JADX INFO: renamed from: a */
        public void m747a(int i) {
            IntlHideAndSeekFragment.this.f199B.k(i);
            this.f203a.b();
        }

        public void remove() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlHideAndSeekFragment$b */
    public static class C3051b implements pvl.d {

        /* JADX INFO: renamed from: a */
        public final b13 f205a;

        public C3051b(b13 b13Var) {
            this.f205a = b13Var;
        }

        public void recycle() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlHideAndSeekFragment$c */
    public class C3052c implements pvl.c {

        /* JADX INFO: renamed from: a */
        public MarkerOptions f206a = new MarkerOptions();

        /* JADX INFO: renamed from: b */
        public int f207b;

        public C3052c() {
        }

        /* JADX INFO: renamed from: a */
        public pvl.c m749a(int i) {
            this.f207b = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public pvl.b m750b() {
            if (!NullChecker.a(IntlHideAndSeekFragment.this.f200C)) {
                return null;
            }
            IntlHideAndSeekFragment intlHideAndSeekFragment = IntlHideAndSeekFragment.this;
            C3050a c3050a = intlHideAndSeekFragment.new C3050a(intlHideAndSeekFragment.f200C.a(this.f206a));
            IntlHideAndSeekFragment.this.f199B.j(this.f207b, c3050a);
            return c3050a;
        }

        /* JADX INFO: renamed from: c */
        public pvl.c m751c(float f, float f2) {
            this.f206a.g(f, f2);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public pvl.c m752d(pvl.d dVar) {
            this.f206a.m0(((C3051b) dVar).f205a);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public pvl.c m753e(double d, double d2) {
            this.f206a.q0(new LatLng(d, d2));
            return this;
        }

        /* JADX INFO: renamed from: f */
        public pvl.c m754f(float f) {
            this.f206a.r0(f);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public pvl.c m755g(boolean z) {
            this.f206a.h(z);
            return this;
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ boolean m730Z3(uuw uuwVar) {
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public static IntlHideAndSeekFragment m734h4(GoogleMapOptions googleMapOptions) {
        IntlHideAndSeekFragment intlHideAndSeekFragment = new IntlHideAndSeekFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        intlHideAndSeekFragment.setArguments(bundle);
        return intlHideAndSeekFragment;
    }

    /* JADX INFO: renamed from: E3 */
    public c<roj0> m736E3() {
        return this.f198A;
    }

    /* JADX INFO: renamed from: K1 */
    public void m737K1(double d, double d2, float f) {
        if (NullChecker.a(this.f200C)) {
            this.f200C.b(ac4.a(new LatLng(d, d2), f));
        }
    }

    /* JADX INFO: renamed from: P2 */
    public void m738P2(final e4k e4kVar) {
        this.f200C = e4kVar;
        e4kVar.h(new e4k.b() { // from class: l.rmn
            /* JADX INFO: renamed from: b0 */
            public final void m9152b0(int i) {
                this.f7193a.m743e4(i);
            }
        });
        e4kVar.i(new e4k.c() { // from class: l.smn
            /* JADX INFO: renamed from: N */
            public final void m9368N(LatLng latLng) {
                this.f7387a.m744f4(latLng);
            }
        });
        e4kVar.g(new e4k.a() { // from class: l.tmn
            /* JADX INFO: renamed from: U */
            public final void m9593U() {
                this.f7586a.m745g4(e4kVar);
            }
        });
        e4kVar.j(new e4k.d() { // from class: l.umn
            /* JADX INFO: renamed from: X */
            public final boolean m9750X(uuw uuwVar) {
                return IntlHideAndSeekFragment.m730Z3(uuwVar);
            }
        });
        e4kVar.e().a(false);
        this.f198A.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: X2 */
    public pvl.d m739X2(int i) {
        return new C3051b(c13.b(i));
    }

    /* JADX INFO: renamed from: b2 */
    public void m740b2() {
        if (NullChecker.a(this.f200C)) {
            this.f200C.c();
        }
    }

    /* JADX INFO: renamed from: d3 */
    public pvl.c m741d3() {
        return new C3052c();
    }

    /* JADX INFO: renamed from: d4, reason: merged with bridge method [inline-methods] */
    public C3050a m735B0(int i) {
        return (C3050a) this.f199B.d(i);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m743e4(int i) {
        this.f202E = i;
        if (NullChecker.a(this.f201D)) {
            this.f201D.b(i == 1);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m744f4(LatLng latLng) {
        if (NullChecker.a(this.f201D)) {
            this.f201D.a();
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m745g4(e4k e4kVar) {
        if (NullChecker.a(this.f201D)) {
            CameraPosition cameraPositionD = e4kVar.d();
            pvl.a aVar = this.f201D;
            LatLng latLng = cameraPositionD.target;
            aVar.d(latLng.latitude, latLng.longitude, cameraPositionD.zoom, this.f202E == 1);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        V3(this);
    }

    /* JADX INFO: renamed from: r1 */
    public void m746r1(pvl.a aVar) {
        this.f201D = aVar;
    }
}
