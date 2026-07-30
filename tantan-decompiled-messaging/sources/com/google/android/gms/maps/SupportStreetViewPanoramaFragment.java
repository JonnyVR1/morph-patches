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
import p149l.of50;
import p149l.pd50;
import p149l.puw;
import p149l.r3m;
import p149l.s050;
import p149l.uyl;

/* JADX INFO: loaded from: classes6.dex */
public class SupportStreetViewPanoramaFragment extends Fragment {

    /* JADX INFO: renamed from: z */
    public final C2438b f10419z = new C2438b(this);

    /* JADX INFO: renamed from: com.google.android.gms.maps.SupportStreetViewPanoramaFragment$a */
    @VisibleForTesting
    public static class C2437a implements gcr {

        /* JADX INFO: renamed from: a */
        public final Fragment f10420a;

        /* JADX INFO: renamed from: b */
        public final r3m f10421b;

        public C2437a(Fragment fragment, r3m r3mVar) {
            this.f10421b = (r3m) Preconditions.checkNotNull(r3mVar);
            this.f10420a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: a */
        public final void mo14998a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                aus0.m99088b(bundle2, bundle3);
                this.f10421b.mo175963P4(s050.m181848Y2(activity), null, bundle3);
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
                uyl uylVarMo175964Q = this.f10421b.mo175964Q(s050.m181848Y2(layoutInflater), s050.m181848Y2(viewGroup), bundle2);
                aus0.m99088b(bundle2, bundle);
                return (View) s050.m181847P2(uylVarMo175964Q);
            } catch (RemoteException e) {
                d4k.m109990a(e);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m15027c(of50 of50Var) {
            try {
                this.f10421b.mo175966f0(new BinderC2444f(this, of50Var));
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: d */
        public final void mo15001d() {
            try {
                this.f10421b.mo175965d();
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
                Bundle arguments = this.f10420a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    aus0.m99089c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f10421b.mo175967l(bundle2);
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
                this.f10421b.mo175968m(bundle2);
                aus0.m99088b(bundle2, bundle);
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onDestroy() {
            try {
                this.f10421b.onDestroy();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onLowMemory() {
            try {
                this.f10421b.onLowMemory();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onPause() {
            try {
                this.f10421b.onPause();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onResume() {
            try {
                this.f10421b.onResume();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onStart() {
            try {
                this.f10421b.onStart();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: w */
        public final void mo15004w() {
            try {
                this.f10421b.mo175969w();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.SupportStreetViewPanoramaFragment$b */
    @VisibleForTesting
    public static class C2438b extends jsd<C2437a> {

        /* JADX INFO: renamed from: e */
        public final Fragment f10422e;

        /* JADX INFO: renamed from: f */
        public pd50<C2437a> f10423f;

        /* JADX INFO: renamed from: g */
        public Activity f10424g;

        /* JADX INFO: renamed from: h */
        public final List<of50> f10425h = new ArrayList();

        @VisibleForTesting
        public C2438b(Fragment fragment) {
            this.f10422e = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public final void m15028v(Activity activity) {
            this.f10424g = activity;
            m15030x();
        }

        /* JADX INFO: renamed from: x */
        private final void m15030x() {
            if (this.f10424g == null || this.f10423f == null || m143015b() != null) {
                return;
            }
            try {
                puw.m171483a(this.f10424g);
                this.f10423f.mo156920a(new C2437a(this.f10422e, evs0.m118318c(this.f10424g).mo160799x(s050.m181848Y2(this.f10424g))));
                Iterator<of50> it = this.f10425h.iterator();
                while (it.hasNext()) {
                    m143015b().m15027c(it.next());
                }
                this.f10425h.clear();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }

        @Override // p149l.jsd
        /* JADX INFO: renamed from: a */
        public final void mo15006a(pd50<C2437a> pd50Var) {
            this.f10423f = pd50Var;
            m15030x();
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
        this.f10419z.m15028v(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10419z.m143017d(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10419z.m143018e(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.f10419z.m143019f();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f10419z.m143020g();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f10419z.m15028v(activity);
            this.f10419z.m143021h(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f10419z.m143022i();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f10419z.m143023j();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f10419z.m143024k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f10419z.m143025l(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f10419z.m143026m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f10419z.m143027n();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
