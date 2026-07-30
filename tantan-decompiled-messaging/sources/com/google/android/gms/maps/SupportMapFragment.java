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
import p149l.aus0;
import p149l.d4k;
import p149l.evs0;
import p149l.gcr;
import p149l.jsd;
import p149l.ne50;
import p149l.pd50;
import p149l.puw;
import p149l.qvl;
import p149l.s050;
import p149l.uyl;

/* JADX INFO: loaded from: classes6.dex */
public class SupportMapFragment extends Fragment {

    /* JADX INFO: renamed from: z */
    public final C2436b f10412z = new C2436b(this);

    /* JADX INFO: renamed from: com.google.android.gms.maps.SupportMapFragment$a */
    @VisibleForTesting
    public static class C2435a implements gcr {

        /* JADX INFO: renamed from: a */
        public final Fragment f10413a;

        /* JADX INFO: renamed from: b */
        public final qvl f10414b;

        public C2435a(Fragment fragment, qvl qvlVar) {
            this.f10414b = (qvl) Preconditions.checkNotNull(qvlVar);
            this.f10413a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: a */
        public final void mo14998a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                aus0.m99088b(bundle2, bundle3);
                this.f10414b.mo108201W1(s050.m181848Y2(activity), googleMapOptions, bundle3);
                aus0.m99088b(bundle3, bundle2);
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: b */
        public final View mo14999b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                aus0.m99088b(bundle, bundle2);
                uyl uylVarMo108200Q = this.f10414b.mo108200Q(s050.m181848Y2(layoutInflater), s050.m181848Y2(viewGroup), bundle2);
                aus0.m99088b(bundle2, bundle);
                return (View) s050.m181847P2(uylVarMo108200Q);
            } catch (RemoteException e) {
                d4k.m109990a(e);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m15022c(ne50 ne50Var) {
            try {
                this.f10414b.mo108203e0(new BinderC2443e(this, ne50Var));
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: d */
        public final void mo15001d() {
            try {
                this.f10414b.mo108202d();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: l */
        public final void mo15002l(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                aus0.m99088b(bundle, bundle2);
                Bundle arguments = this.f10413a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    aus0.m99089c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f10414b.mo108204l(bundle2);
                aus0.m99088b(bundle2, bundle);
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: m */
        public final void mo15003m(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                aus0.m99088b(bundle, bundle2);
                this.f10414b.mo108205m(bundle2);
                aus0.m99088b(bundle2, bundle);
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onDestroy() {
            try {
                this.f10414b.onDestroy();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onLowMemory() {
            try {
                this.f10414b.onLowMemory();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onPause() {
            try {
                this.f10414b.onPause();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onResume() {
            try {
                this.f10414b.onResume();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onStart() {
            try {
                this.f10414b.onStart();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: w */
        public final void mo15004w() {
            try {
                this.f10414b.mo108206w();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.SupportMapFragment$b */
    @VisibleForTesting
    public static class C2436b extends jsd<C2435a> {

        /* JADX INFO: renamed from: e */
        public final Fragment f10415e;

        /* JADX INFO: renamed from: f */
        public pd50<C2435a> f10416f;

        /* JADX INFO: renamed from: g */
        public Activity f10417g;

        /* JADX INFO: renamed from: h */
        public final List<ne50> f10418h = new ArrayList();

        @VisibleForTesting
        public C2436b(Fragment fragment) {
            this.f10415e = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public final void m15023w(Activity activity) {
            this.f10417g = activity;
            m15025y();
        }

        /* JADX INFO: renamed from: y */
        private final void m15025y() {
            if (this.f10417g == null || this.f10416f == null || m143015b() != null) {
                return;
            }
            try {
                puw.m171483a(this.f10417g);
                qvl qvlVarMo160795R = evs0.m118318c(this.f10417g).mo160795R(s050.m181848Y2(this.f10417g));
                if (qvlVarMo160795R == null) {
                    return;
                }
                this.f10416f.mo156920a(new C2435a(this.f10415e, qvlVarMo160795R));
                Iterator<ne50> it = this.f10418h.iterator();
                while (it.hasNext()) {
                    m143015b().m15022c(it.next());
                }
                this.f10418h.clear();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }

        @Override // p149l.jsd
        /* JADX INFO: renamed from: a */
        public final void mo15006a(pd50<C2435a> pd50Var) {
            this.f10416f = pd50Var;
            m15025y();
        }

        /* JADX INFO: renamed from: v */
        public final void m15026v(ne50 ne50Var) {
            if (m143015b() != null) {
                m143015b().m15022c(ne50Var);
            } else {
                this.f10418h.add(ne50Var);
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static SupportMapFragment m15020W3() {
        return new SupportMapFragment();
    }

    /* JADX INFO: renamed from: V3 */
    public void m15021V3(ne50 ne50Var) {
        Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
        this.f10412z.m15026v(ne50Var);
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
        this.f10412z.m15023w(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10412z.m143017d(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM143018e = this.f10412z.m143018e(layoutInflater, viewGroup, bundle);
        viewM143018e.setClickable(true);
        return viewM143018e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f10412z.m143019f();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f10412z.m143020g();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f10412z.m15023w(activity);
            GoogleMapOptions googleMapOptionsM14973F = GoogleMapOptions.m14973F(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsM14973F);
            this.f10412z.m143021h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f10412z.m143022i();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f10412z.m143023j();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f10412z.m143024k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f10412z.m143025l(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f10412z.m143026m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f10412z.m143027n();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
