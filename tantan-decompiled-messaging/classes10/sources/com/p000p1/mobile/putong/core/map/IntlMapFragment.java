package com.p000p1.mobile.putong.core.map;

import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.p000p1.mobile.putong.core.map.IntlMapFragment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.ac4;
import l.b13;
import l.c13;
import l.e4k;
import l.ne50;
import l.pvl;
import l.roj0;
import l.uuw;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlMapFragment extends SupportMapFragment implements pvl, ne50 {

    /* JADX INFO: renamed from: A */
    public final a<roj0> f209A = a.b();

    /* JADX INFO: renamed from: B */
    public final List<C3053a> f210B = new ArrayList();

    /* JADX INFO: renamed from: C */
    public e4k f211C;

    /* JADX INFO: renamed from: D */
    public pvl.a f212D;

    /* JADX INFO: renamed from: E */
    public int f213E;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapFragment$a */
    public class C3053a implements pvl.b {

        /* JADX INFO: renamed from: a */
        public final uuw f214a;

        public C3053a(uuw uuwVar) {
            this.f214a = uuwVar;
        }

        public void remove() {
            IntlMapFragment.this.f210B.remove(this);
            this.f214a.b();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapFragment$b */
    public static class C3054b implements pvl.d {

        /* JADX INFO: renamed from: a */
        public final b13 f216a;

        public C3054b(b13 b13Var) {
            this.f216a = b13Var;
        }

        public void recycle() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.map.IntlMapFragment$c */
    public class C3055c implements pvl.c {

        /* JADX INFO: renamed from: a */
        public MarkerOptions f217a = new MarkerOptions();

        public C3055c() {
        }

        /* JADX INFO: renamed from: b */
        public pvl.b m778b() {
            if (!NullChecker.a(IntlMapFragment.this.f211C)) {
                return null;
            }
            IntlMapFragment intlMapFragment = IntlMapFragment.this;
            C3053a c3053a = intlMapFragment.new C3053a(intlMapFragment.f211C.a(this.f217a));
            IntlMapFragment.this.f210B.add(c3053a);
            return c3053a;
        }

        /* JADX INFO: renamed from: c */
        public pvl.c m779c(float f, float f2) {
            this.f217a.g(f, f2);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public pvl.c m780d(pvl.d dVar) {
            this.f217a.m0(((C3054b) dVar).f216a);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public pvl.c m781e(double d, double d2) {
            this.f217a.q0(new LatLng(d, d2));
            return this;
        }

        /* JADX INFO: renamed from: g */
        public pvl.c m782g(boolean z) {
            this.f217a.h(z);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m765d4(int i) {
        this.f213E = i;
        if (NullChecker.a(this.f212D)) {
            this.f212D.b(i == 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ boolean m766f4(final uuw uuwVar) {
        if (!NullChecker.a(this.f212D)) {
            return false;
        }
        this.f212D.c((C3053a) vwb.r(this.f210B, new w9j() { // from class: l.z9o
            public final Object call(Object obj) {
                return Boolean.valueOf(uuwVar.a().equals(((IntlMapFragment.C3053a) obj).f214a.a()));
            }
        }));
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public static IntlMapFragment m767g4(GoogleMapOptions googleMapOptions) {
        IntlMapFragment intlMapFragment = new IntlMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        intlMapFragment.setArguments(bundle);
        return intlMapFragment;
    }

    /* JADX INFO: renamed from: E3 */
    public c<roj0> m768E3() {
        return this.f209A;
    }

    /* JADX INFO: renamed from: K1 */
    public void m769K1(double d, double d2, float f) {
        if (NullChecker.a(this.f211C)) {
            this.f211C.b(ac4.a(new LatLng(d, d2), f));
        }
    }

    /* JADX INFO: renamed from: P2 */
    public void m770P2(final e4k e4kVar) {
        this.f211C = e4kVar;
        e4kVar.h(new e4k.b() { // from class: l.w9o
            /* JADX INFO: renamed from: b0 */
            public final void m10456b0(int i) {
                this.f8148a.m765d4(i);
            }
        });
        e4kVar.g(new e4k.a() { // from class: l.x9o
            /* JADX INFO: renamed from: U */
            public final void m10718U() {
                this.f8431a.m774e4(e4kVar);
            }
        });
        e4kVar.j(new e4k.d() { // from class: l.y9o
            /* JADX INFO: renamed from: X */
            public final boolean m11163X(uuw uuwVar) {
                return this.f9014a.m766f4(uuwVar);
            }
        });
        this.f209A.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: X2 */
    public pvl.d m771X2(int i) {
        return new C3054b(c13.b(i));
    }

    /* JADX INFO: renamed from: b2 */
    public void m772b2() {
        if (NullChecker.a(this.f211C)) {
            this.f211C.c();
        }
    }

    /* JADX INFO: renamed from: d3 */
    public pvl.c m773d3() {
        return new C3055c();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m774e4(e4k e4kVar) {
        if (NullChecker.a(this.f212D)) {
            CameraPosition cameraPositionD = e4kVar.d();
            pvl.a aVar = this.f212D;
            LatLng latLng = cameraPositionD.target;
            aVar.d(latLng.latitude, latLng.longitude, cameraPositionD.zoom, this.f213E == 1);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        V3(this);
    }

    /* JADX INFO: renamed from: r1 */
    public void m775r1(pvl.a aVar) {
        this.f212D = aVar;
    }
}
