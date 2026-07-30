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
@TargetApi(11)
public class MapFragment extends Fragment {

    /* JADX INFO: renamed from: a */
    public final C2428b f10380a = new C2428b(this);

    /* JADX INFO: renamed from: com.google.android.gms.maps.MapFragment$a */
    @VisibleForTesting
    public static class C2427a implements gcr {

        /* JADX INFO: renamed from: a */
        public final Fragment f10381a;

        /* JADX INFO: renamed from: b */
        public final qvl f10382b;

        public C2427a(Fragment fragment, qvl qvlVar) {
            this.f10382b = (qvl) Preconditions.checkNotNull(qvlVar);
            this.f10381a = (Fragment) Preconditions.checkNotNull(fragment);
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: a */
        public final void mo14998a(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                aus0.m99088b(bundle2, bundle3);
                this.f10382b.mo108201W1(s050.m181848Y2(activity), googleMapOptions, bundle3);
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
                uyl uylVarMo108200Q = this.f10382b.mo108200Q(s050.m181848Y2(layoutInflater), s050.m181848Y2(viewGroup), bundle2);
                aus0.m99088b(bundle2, bundle);
                return (View) s050.m181847P2(uylVarMo108200Q);
            } catch (RemoteException e) {
                d4k.m109990a(e);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m15000c(ne50 ne50Var) {
            try {
                this.f10382b.mo108203e0(new BinderC2439a(this, ne50Var));
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: d */
        public final void mo15001d() {
            try {
                this.f10382b.mo108202d();
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
                Bundle arguments = this.f10381a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    aus0.m99089c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f10382b.mo108204l(bundle2);
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
                this.f10382b.mo108205m(bundle2);
                aus0.m99088b(bundle2, bundle);
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onDestroy() {
            try {
                this.f10382b.onDestroy();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onLowMemory() {
            try {
                this.f10382b.onLowMemory();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onPause() {
            try {
                this.f10382b.onPause();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onResume() {
            try {
                this.f10382b.onResume();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onStart() {
            try {
                this.f10382b.onStart();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: w */
        public final void mo15004w() {
            try {
                this.f10382b.mo108206w();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.MapFragment$b */
    @VisibleForTesting
    public static class C2428b extends jsd<C2427a> {

        /* JADX INFO: renamed from: e */
        public final Fragment f10383e;

        /* JADX INFO: renamed from: f */
        public pd50<C2427a> f10384f;

        /* JADX INFO: renamed from: g */
        public Activity f10385g;

        /* JADX INFO: renamed from: h */
        public final List<ne50> f10386h = new ArrayList();

        @VisibleForTesting
        public C2428b(Fragment fragment) {
            this.f10383e = fragment;
        }

        @Override // p149l.jsd
        /* JADX INFO: renamed from: a */
        public final void mo15006a(pd50<C2427a> pd50Var) {
            this.f10384f = pd50Var;
            m15008x();
        }

        /* JADX INFO: renamed from: v */
        public final void m15007v(Activity activity) {
            this.f10385g = activity;
            m15008x();
        }

        /* JADX INFO: renamed from: x */
        public final void m15008x() {
            if (this.f10385g == null || this.f10384f == null || m143015b() != null) {
                return;
            }
            try {
                puw.m171483a(this.f10385g);
                qvl qvlVarMo160795R = evs0.m118318c(this.f10385g).mo160795R(s050.m181848Y2(this.f10385g));
                if (qvlVarMo160795R == null) {
                    return;
                }
                this.f10384f.mo156920a(new C2427a(this.f10383e, qvlVarMo160795R));
                Iterator<ne50> it = this.f10386h.iterator();
                while (it.hasNext()) {
                    m143015b().m15000c(it.next());
                }
                this.f10386h.clear();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f10380a.m15007v(activity);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10380a.m143017d(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewM143018e = this.f10380a.m143018e(layoutInflater, viewGroup, bundle);
        viewM143018e.setClickable(true);
        return viewM143018e;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f10380a.m143019f();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f10380a.m143020g();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.f10380a.m15007v(activity);
            GoogleMapOptions googleMapOptionsM14973F = GoogleMapOptions.m14973F(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsM14973F);
            this.f10380a.m143021h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f10380a.m143022i();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.f10380a.m143023j();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f10380a.m143024k();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f10380a.m143025l(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f10380a.m143026m();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.f10380a.m143027n();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
