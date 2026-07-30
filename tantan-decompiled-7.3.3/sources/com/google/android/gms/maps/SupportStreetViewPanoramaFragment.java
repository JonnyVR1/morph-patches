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
import p153l.i6m;
import p153l.k4t0;
import p153l.oxw;
import p153l.p1m;
import p153l.un50;
import p153l.v6k;
import p153l.wl50;
import p153l.xtd;

/* JADX INFO: loaded from: classes6.dex */
public class SupportStreetViewPanoramaFragment extends Fragment {

    /* JADX INFO: renamed from: z */
    public final C2461b f10456z = new C2461b(this);

    /* JADX INFO: renamed from: com.google.android.gms.maps.SupportStreetViewPanoramaFragment$a */
    @VisibleForTesting
    public static class C2460a implements her {

        /* JADX INFO: renamed from: a */
        public final Fragment f10457a;

        /* JADX INFO: renamed from: b */
        public final i6m f10458b;

        public C2460a(Fragment fragment, i6m i6mVar) {
            this.f10458b = (i6m) Preconditions.checkNotNull(i6mVar);
            this.f10457a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: a */
        public final void mo15052a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                g3t0.m128760b(bundle2, bundle3);
                this.f10458b.mo138828P4(h950.m134038Y2(activity), null, bundle3);
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
                p1m p1mVarMo138829Q = this.f10458b.mo138829Q(h950.m134038Y2(layoutInflater), h950.m134038Y2(viewGroup), bundle2);
                g3t0.m128760b(bundle2, bundle);
                return (View) h950.m134037P2(p1mVarMo138829Q);
            } catch (RemoteException e) {
                v6k.m200076a(e);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m15081c(un50 un50Var) {
            try {
                this.f10458b.mo138831f0(new BinderC2467f(this, un50Var));
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: d */
        public final void mo15055d() {
            try {
                this.f10458b.mo138830d();
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
                Bundle arguments = this.f10457a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    g3t0.m128761c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f10458b.mo138832l(bundle2);
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
                this.f10458b.mo138833m(bundle2);
                g3t0.m128760b(bundle2, bundle);
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onDestroy() {
            try {
                this.f10458b.onDestroy();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onLowMemory() {
            try {
                this.f10458b.onLowMemory();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onPause() {
            try {
                this.f10458b.onPause();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onResume() {
            try {
                this.f10458b.onResume();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onStart() {
            try {
                this.f10458b.onStart();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: w */
        public final void mo15058w() {
            try {
                this.f10458b.mo138834w();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.SupportStreetViewPanoramaFragment$b */
    @VisibleForTesting
    public static class C2461b extends xtd<C2460a> {

        /* JADX INFO: renamed from: e */
        public final Fragment f10459e;

        /* JADX INFO: renamed from: f */
        public wl50<C2460a> f10460f;

        /* JADX INFO: renamed from: g */
        public Activity f10461g;

        /* JADX INFO: renamed from: h */
        public final List<un50> f10462h = new ArrayList();

        @VisibleForTesting
        public C2461b(Fragment fragment) {
            this.f10459e = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public final void m15082v(Activity activity) {
            this.f10461g = activity;
            m15084x();
        }

        /* JADX INFO: renamed from: x */
        private final void m15084x() {
            if (this.f10461g == null || this.f10460f == null || m213054b() != null) {
                return;
            }
            try {
                oxw.m169737a(this.f10461g);
                this.f10460f.mo184919a(new C2460a(this.f10459e, k4t0.m148296c(this.f10461g).mo128140x(h950.m134038Y2(this.f10461g))));
                Iterator<un50> it = this.f10462h.iterator();
                while (it.hasNext()) {
                    m213054b().m15081c(it.next());
                }
                this.f10462h.clear();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }

        @Override // p153l.xtd
        /* JADX INFO: renamed from: a */
        public final void mo15060a(wl50<C2460a> wl50Var) {
            this.f10460f = wl50Var;
            m15084x();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10456z.m15082v(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10456z.m213056d(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10456z.m213057e(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f10456z.m213058f();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f10456z.m213059g();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f10456z.m15082v(activity);
            this.f10456z.m213060h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f10456z.m213061i();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f10456z.m213062j();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f10456z.m213063k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f10456z.m213064l(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f10456z.m213065m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f10456z.m213066n();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
