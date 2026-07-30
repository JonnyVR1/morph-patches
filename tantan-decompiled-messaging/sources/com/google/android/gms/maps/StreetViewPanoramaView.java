package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import p149l.s050;
import p149l.s3m;

/* JADX INFO: loaded from: classes6.dex */
public class StreetViewPanoramaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C2434b f10403a;

    /* JADX INFO: renamed from: com.google.android.gms.maps.StreetViewPanoramaView$a */
    @VisibleForTesting
    public static class C2433a implements gcr {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f10404a;

        /* JADX INFO: renamed from: b */
        public final s3m f10405b;

        /* JADX INFO: renamed from: c */
        public View f10406c;

        public C2433a(ViewGroup viewGroup, s3m s3mVar) {
            this.f10405b = (s3m) Preconditions.checkNotNull(s3mVar);
            this.f10404a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: a */
        public final void mo14998a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: b */
        public final View mo14999b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        /* JADX INFO: renamed from: c */
        public final void m15019c(of50 of50Var) {
            try {
                this.f10405b.mo182197f0(new BinderC2442d(this, of50Var));
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: d */
        public final void mo15001d() {
            try {
                this.f10405b.mo182196d();
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
                this.f10405b.mo182198l(bundle2);
                aus0.m99088b(bundle2, bundle);
                this.f10406c = (View) s050.m181847P2(this.f10405b.getView());
                this.f10404a.removeAllViews();
                this.f10404a.addView(this.f10406c);
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
                this.f10405b.mo182199m(bundle2);
                aus0.m99088b(bundle2, bundle);
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onDestroy() {
            try {
                this.f10405b.onDestroy();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onLowMemory() {
            try {
                this.f10405b.onLowMemory();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onPause() {
            try {
                this.f10405b.onPause();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onResume() {
            try {
                this.f10405b.onResume();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onStart() {
            try {
                this.f10405b.onStart();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: w */
        public final void mo15004w() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.StreetViewPanoramaView$b */
    @VisibleForTesting
    public static class C2434b extends jsd<C2433a> {

        /* JADX INFO: renamed from: e */
        public final ViewGroup f10407e;

        /* JADX INFO: renamed from: f */
        public final Context f10408f;

        /* JADX INFO: renamed from: g */
        public pd50<C2433a> f10409g;

        /* JADX INFO: renamed from: h */
        public final StreetViewPanoramaOptions f10410h;

        /* JADX INFO: renamed from: i */
        public final List<of50> f10411i = new ArrayList();

        @VisibleForTesting
        public C2434b(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.f10407e = viewGroup;
            this.f10408f = context;
            this.f10410h = streetViewPanoramaOptions;
        }

        @Override // p149l.jsd
        /* JADX INFO: renamed from: a */
        public final void mo15006a(pd50<C2433a> pd50Var) {
            this.f10409g = pd50Var;
            if (pd50Var == null || m143015b() != null) {
                return;
            }
            try {
                puw.m171483a(this.f10408f);
                this.f10409g.mo156920a(new C2433a(this.f10407e, evs0.m118318c(this.f10408f).mo160796Y7(s050.m181848Y2(this.f10408f), this.f10410h)));
                Iterator<of50> it = this.f10411i.iterator();
                while (it.hasNext()) {
                    m143015b().m15019c(it.next());
                }
                this.f10411i.clear();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.f10403a = new C2434b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10403a = new C2434b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10403a = new C2434b(this, context, null);
    }
}
