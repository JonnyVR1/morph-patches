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
import p153l.g3t0;
import p153l.h950;
import p153l.her;
import p153l.j6m;
import p153l.k4t0;
import p153l.oxw;
import p153l.un50;
import p153l.v6k;
import p153l.wl50;
import p153l.xtd;

/* JADX INFO: loaded from: classes6.dex */
public class StreetViewPanoramaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C2457b f10440a;

    /* JADX INFO: renamed from: com.google.android.gms.maps.StreetViewPanoramaView$a */
    @VisibleForTesting
    public static class C2456a implements her {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f10441a;

        /* JADX INFO: renamed from: b */
        public final j6m f10442b;

        /* JADX INFO: renamed from: c */
        public View f10443c;

        public C2456a(ViewGroup viewGroup, j6m j6mVar) {
            this.f10442b = (j6m) Preconditions.checkNotNull(j6mVar);
            this.f10441a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: a */
        public final void mo15052a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: b */
        public final View mo15053b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        /* JADX INFO: renamed from: c */
        public final void m15073c(un50 un50Var) {
            try {
                this.f10442b.mo107659f0(new BinderC2465d(this, un50Var));
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: d */
        public final void mo15055d() {
            try {
                this.f10442b.mo107658d();
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
                this.f10442b.mo107660l(bundle2);
                g3t0.m128760b(bundle2, bundle);
                this.f10443c = (View) h950.m134037P2(this.f10442b.getView());
                this.f10441a.removeAllViews();
                this.f10441a.addView(this.f10443c);
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
                this.f10442b.mo107661m(bundle2);
                g3t0.m128760b(bundle2, bundle);
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onDestroy() {
            try {
                this.f10442b.onDestroy();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onLowMemory() {
            try {
                this.f10442b.onLowMemory();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onPause() {
            try {
                this.f10442b.onPause();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onResume() {
            try {
                this.f10442b.onResume();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onStart() {
            try {
                this.f10442b.onStart();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: w */
        public final void mo15058w() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.StreetViewPanoramaView$b */
    @VisibleForTesting
    public static class C2457b extends xtd<C2456a> {

        /* JADX INFO: renamed from: e */
        public final ViewGroup f10444e;

        /* JADX INFO: renamed from: f */
        public final Context f10445f;

        /* JADX INFO: renamed from: g */
        public wl50<C2456a> f10446g;

        /* JADX INFO: renamed from: h */
        public final StreetViewPanoramaOptions f10447h;

        /* JADX INFO: renamed from: i */
        public final List<un50> f10448i = new ArrayList();

        @VisibleForTesting
        public C2457b(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.f10444e = viewGroup;
            this.f10445f = context;
            this.f10447h = streetViewPanoramaOptions;
        }

        @Override // p153l.xtd
        /* JADX INFO: renamed from: a */
        public final void mo15060a(wl50<C2456a> wl50Var) {
            this.f10446g = wl50Var;
            if (wl50Var == null || m213054b() != null) {
                return;
            }
            try {
                oxw.m169737a(this.f10445f);
                this.f10446g.mo184919a(new C2456a(this.f10444e, k4t0.m148296c(this.f10445f).mo128137Y7(h950.m134038Y2(this.f10445f), this.f10447h)));
                Iterator<un50> it = this.f10448i.iterator();
                while (it.hasNext()) {
                    m213054b().m15073c(it.next());
                }
                this.f10448i.clear();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.f10440a = new C2457b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10440a = new C2457b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10440a = new C2457b(this, context, null);
    }
}
