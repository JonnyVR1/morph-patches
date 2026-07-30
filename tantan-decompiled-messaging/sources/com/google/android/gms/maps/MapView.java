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
import p149l.ne50;
import p149l.pd50;
import p149l.puw;
import p149l.rvl;
import p149l.s050;

/* JADX INFO: loaded from: classes6.dex */
public class MapView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C2430b f10387a;

    /* JADX INFO: renamed from: com.google.android.gms.maps.MapView$a */
    @VisibleForTesting
    public static class C2429a implements gcr {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f10388a;

        /* JADX INFO: renamed from: b */
        public final rvl f10389b;

        /* JADX INFO: renamed from: c */
        public View f10390c;

        public C2429a(ViewGroup viewGroup, rvl rvlVar) {
            this.f10389b = (rvl) Preconditions.checkNotNull(rvlVar);
            this.f10388a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: a */
        public final void mo14998a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: b */
        public final View mo14999b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        /* JADX INFO: renamed from: c */
        public final void m15009c(ne50 ne50Var) {
            try {
                this.f10389b.mo123223e0(new BinderC2440b(this, ne50Var));
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: d */
        public final void mo15001d() {
            try {
                this.f10389b.mo123222d();
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
                this.f10389b.mo123224l(bundle2);
                aus0.m99088b(bundle2, bundle);
                this.f10390c = (View) s050.m181847P2(this.f10389b.getView());
                this.f10388a.removeAllViews();
                this.f10388a.addView(this.f10390c);
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
                this.f10389b.mo123225m(bundle2);
                aus0.m99088b(bundle2, bundle);
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onDestroy() {
            try {
                this.f10389b.onDestroy();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onLowMemory() {
            try {
                this.f10389b.onLowMemory();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onPause() {
            try {
                this.f10389b.onPause();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onResume() {
            try {
                this.f10389b.onResume();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        public final void onStart() {
            try {
                this.f10389b.onStart();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            }
        }

        @Override // p149l.gcr
        /* JADX INFO: renamed from: w */
        public final void mo15004w() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.MapView$b */
    @VisibleForTesting
    public static class C2430b extends jsd<C2429a> {

        /* JADX INFO: renamed from: e */
        public final ViewGroup f10391e;

        /* JADX INFO: renamed from: f */
        public final Context f10392f;

        /* JADX INFO: renamed from: g */
        public pd50<C2429a> f10393g;

        /* JADX INFO: renamed from: h */
        public final GoogleMapOptions f10394h;

        /* JADX INFO: renamed from: i */
        public final List<ne50> f10395i = new ArrayList();

        @VisibleForTesting
        public C2430b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f10391e = viewGroup;
            this.f10392f = context;
            this.f10394h = googleMapOptions;
        }

        @Override // p149l.jsd
        /* JADX INFO: renamed from: a */
        public final void mo15006a(pd50<C2429a> pd50Var) {
            this.f10393g = pd50Var;
            if (pd50Var == null || m143015b() != null) {
                return;
            }
            try {
                puw.m171483a(this.f10392f);
                rvl rvlVarMo160798j7 = evs0.m118318c(this.f10392f).mo160798j7(s050.m181848Y2(this.f10392f), this.f10394h);
                if (rvlVarMo160798j7 == null) {
                    return;
                }
                this.f10393g.mo156920a(new C2429a(this.f10391e, rvlVarMo160798j7));
                Iterator<ne50> it = this.f10395i.iterator();
                while (it.hasNext()) {
                    m143015b().m15009c(it.next());
                }
                this.f10395i.clear();
            } catch (RemoteException e) {
                d4k.m109990a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10387a = new C2430b(this, context, GoogleMapOptions.m14973F(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context) {
        super(context);
        this.f10387a = new C2430b(this, context, null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10387a = new C2430b(this, context, GoogleMapOptions.m14973F(context, attributeSet));
        setClickable(true);
    }
}
