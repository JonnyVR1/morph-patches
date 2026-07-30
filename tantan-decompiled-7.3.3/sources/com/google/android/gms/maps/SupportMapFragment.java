package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.g3t0;
import p153l.h950;
import p153l.her;
import p153l.iyl;
import p153l.k4t0;
import p153l.oxw;
import p153l.p1m;
import p153l.um50;
import p153l.v6k;
import p153l.wl50;
import p153l.xtd;

/* JADX INFO: loaded from: classes6.dex */
public class SupportMapFragment extends Fragment {

    /* JADX INFO: renamed from: z */
    public final C2459b f10449z = new C2459b(this);

    /* JADX INFO: renamed from: com.google.android.gms.maps.SupportMapFragment$a */
    @VisibleForTesting
    public static class C2458a implements her {

        /* JADX INFO: renamed from: a */
        public final Fragment f10450a;

        /* JADX INFO: renamed from: b */
        public final iyl f10451b;

        public C2458a(Fragment fragment, iyl iylVar) {
            this.f10451b = (iyl) Preconditions.checkNotNull(iylVar);
            this.f10450a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: a */
        public final void mo15052a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                g3t0.m128760b(bundle2, bundle3);
                this.f10451b.mo142695W1(h950.m134038Y2(activity), googleMapOptions, bundle3);
                g3t0.m128760b(bundle3, bundle2);
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: b */
        public final View mo15053b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                g3t0.m128760b(bundle, bundle2);
                p1m p1mVarMo142694Q = this.f10451b.mo142694Q(h950.m134038Y2(layoutInflater), h950.m134038Y2(viewGroup), bundle2);
                g3t0.m128760b(bundle2, bundle);
                return (View) h950.m134037P2(p1mVarMo142694Q);
            } catch (RemoteException e) {
                v6k.m200076a(e);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m15076c(um50 um50Var) {
            try {
                this.f10451b.mo142697e0(new BinderC2466e(this, um50Var));
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: d */
        public final void mo15055d() {
            try {
                this.f10451b.mo142696d();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: l */
        public final void mo15056l(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                g3t0.m128760b(bundle, bundle2);
                Bundle arguments = this.f10450a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    g3t0.m128761c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f10451b.mo142698l(bundle2);
                g3t0.m128760b(bundle2, bundle);
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: m */
        public final void mo15057m(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                g3t0.m128760b(bundle, bundle2);
                this.f10451b.mo142699m(bundle2);
                g3t0.m128760b(bundle2, bundle);
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onDestroy() {
            try {
                this.f10451b.onDestroy();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onLowMemory() {
            try {
                this.f10451b.onLowMemory();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onPause() {
            try {
                this.f10451b.onPause();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onResume() {
            try {
                this.f10451b.onResume();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onStart() {
            try {
                this.f10451b.onStart();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: w */
        public final void mo15058w() {
            try {
                this.f10451b.mo142700w();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.SupportMapFragment$b */
    @VisibleForTesting
    public static class C2459b extends xtd<C2458a> {

        /* JADX INFO: renamed from: e */
        public final Fragment f10452e;

        /* JADX INFO: renamed from: f */
        public wl50<C2458a> f10453f;

        /* JADX INFO: renamed from: g */
        public Activity f10454g;

        /* JADX INFO: renamed from: h */
        public final List<um50> f10455h = new ArrayList();

        @VisibleForTesting
        public C2459b(Fragment fragment) {
            this.f10452e = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public final void m15077w(Activity activity) {
            this.f10454g = activity;
            m15079y();
        }

        /* JADX INFO: renamed from: y */
        private final void m15079y() {
            if (this.f10454g == null || this.f10453f == null || m213054b() != null) {
                return;
            }
            try {
                oxw.m169737a(this.f10454g);
                iyl iylVarMo128136R = k4t0.m148296c(this.f10454g).mo128136R(h950.m134038Y2(this.f10454g));
                if (iylVarMo128136R == null) {
                    return;
                }
                this.f10453f.mo184919a(new C2458a(this.f10452e, iylVarMo128136R));
                Iterator<um50> it = this.f10455h.iterator();
                while (it.hasNext()) {
                    m213054b().m15076c(it.next());
                }
                this.f10455h.clear();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }

        @Override // p153l.xtd
        /* JADX INFO: renamed from: a */
        public final void mo15060a(wl50<C2458a> wl50Var) {
            this.f10453f = wl50Var;
            m15079y();
        }

        /* JADX INFO: renamed from: v */
        public final void m15080v(um50 um50Var) {
            if (m213054b() != null) {
                m213054b().m15076c(um50Var);
            } else {
                this.f10455h.add(um50Var);
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static SupportMapFragment m15074W3() {
        return new SupportMapFragment();
    }

    /* JADX INFO: renamed from: V3 */
    public void m15075V3(um50 um50Var) {
        Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        this.f10449z.m15080v(um50Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10449z.m15077w(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10449z.m213056d(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM213057e = this.f10449z.m213057e(layoutInflater, viewGroup, bundle);
        viewM213057e.setClickable(true);
        return viewM213057e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f10449z.m213058f();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f10449z.m213059g();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f10449z.m15077w(activity);
            GoogleMapOptions googleMapOptionsM15027F = GoogleMapOptions.m15027F(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsM15027F);
            this.f10449z.m213060h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f10449z.m213061i();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f10449z.m213062j();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f10449z.m213063k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f10449z.m213064l(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f10449z.m213065m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f10449z.m213066n();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
