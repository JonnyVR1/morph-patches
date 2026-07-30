package com.google.android.gms.maps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
@TargetApi(11)
public class StreetViewPanoramaFragment extends Fragment {

    /* JADX INFO: renamed from: a */
    public final C2455b f10433a = new C2455b(this);

    /* JADX INFO: renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$a */
    @VisibleForTesting
    public static class C2454a implements her {

        /* JADX INFO: renamed from: a */
        public final Fragment f10434a;

        /* JADX INFO: renamed from: b */
        public final i6m f10435b;

        public C2454a(Fragment fragment, i6m i6mVar) {
            this.f10435b = (i6m) Preconditions.checkNotNull(i6mVar);
            this.f10434a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: a */
        public final void mo15052a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                g3t0.m128760b(bundle2, bundle3);
                this.f10435b.mo138828P4(h950.m134038Y2(activity), null, bundle3);
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
                p1m p1mVarMo138829Q = this.f10435b.mo138829Q(h950.m134038Y2(layoutInflater), h950.m134038Y2(viewGroup), bundle2);
                g3t0.m128760b(bundle2, bundle);
                return (View) h950.m134037P2(p1mVarMo138829Q);
            } catch (RemoteException e) {
                v6k.m200076a(e);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m15064c(un50 un50Var) {
            try {
                this.f10435b.mo138831f0(new BinderC2464c(this, un50Var));
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: d */
        public final void mo15055d() {
            try {
                this.f10435b.mo138830d();
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
                Bundle arguments = this.f10434a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    g3t0.m128761c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f10435b.mo138832l(bundle2);
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
                this.f10435b.mo138833m(bundle2);
                g3t0.m128760b(bundle2, bundle);
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onDestroy() {
            try {
                this.f10435b.onDestroy();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onLowMemory() {
            try {
                this.f10435b.onLowMemory();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onPause() {
            try {
                this.f10435b.onPause();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onResume() {
            try {
                this.f10435b.onResume();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onStart() {
            try {
                this.f10435b.onStart();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: w */
        public final void mo15058w() {
            try {
                this.f10435b.mo138834w();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$b */
    @VisibleForTesting
    public static class C2455b extends xtd<C2454a> {

        /* JADX INFO: renamed from: e */
        public final Fragment f10436e;

        /* JADX INFO: renamed from: f */
        public wl50<C2454a> f10437f;

        /* JADX INFO: renamed from: g */
        public Activity f10438g;

        /* JADX INFO: renamed from: h */
        public final List<un50> f10439h = new ArrayList();

        @VisibleForTesting
        public C2455b(Fragment fragment) {
            this.f10436e = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public final void m15065v(Activity activity) {
            this.f10438g = activity;
            m15067x();
        }

        /* JADX INFO: renamed from: x */
        private final void m15067x() {
            if (this.f10438g == null || this.f10437f == null || m213054b() != null) {
                return;
            }
            try {
                oxw.m169737a(this.f10438g);
                this.f10437f.mo184919a(new C2454a(this.f10436e, k4t0.m148296c(this.f10438g).mo128140x(h950.m134038Y2(this.f10438g))));
                Iterator<un50> it = this.f10439h.iterator();
                while (it.hasNext()) {
                    m213054b().m15064c(it.next());
                }
                this.f10439h.clear();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }

        @Override // p153l.xtd
        /* JADX INFO: renamed from: a */
        public final void mo15060a(wl50<C2454a> wl50Var) {
            this.f10437f = wl50Var;
            m15067x();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10433a.m15065v(activity);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10433a.m213056d(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10433a.m213057e(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f10433a.m213058f();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f10433a.m213059g();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f10433a.m15065v(activity);
            this.f10433a.m213060h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f10433a.m213061i();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.f10433a.m213062j();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f10433a.m213063k();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f10433a.m213064l(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f10433a.m213065m();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.f10433a.m213066n();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
