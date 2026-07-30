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
import p153l.jyl;
import p153l.k4t0;
import p153l.oxw;
import p153l.um50;
import p153l.v6k;
import p153l.wl50;
import p153l.xtd;

/* JADX INFO: loaded from: classes6.dex */
public class MapView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C2453b f10424a;

    /* JADX INFO: renamed from: com.google.android.gms.maps.MapView$a */
    @VisibleForTesting
    public static class C2452a implements her {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f10425a;

        /* JADX INFO: renamed from: b */
        public final jyl f10426b;

        /* JADX INFO: renamed from: c */
        public View f10427c;

        public C2452a(ViewGroup viewGroup, jyl jylVar) {
            this.f10426b = (jyl) Preconditions.checkNotNull(jylVar);
            this.f10425a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: a */
        public final void mo15052a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: b */
        public final View mo15053b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        /* JADX INFO: renamed from: c */
        public final void m15063c(um50 um50Var) {
            try {
                this.f10426b.mo147600e0(new BinderC2463b(this, um50Var));
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: d */
        public final void mo15055d() {
            try {
                this.f10426b.mo147599d();
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
                this.f10426b.mo147601l(bundle2);
                g3t0.m128760b(bundle2, bundle);
                this.f10427c = (View) h950.m134037P2(this.f10426b.getView());
                this.f10425a.removeAllViews();
                this.f10425a.addView(this.f10427c);
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
                this.f10426b.mo147602m(bundle2);
                g3t0.m128760b(bundle2, bundle);
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onDestroy() {
            try {
                this.f10426b.onDestroy();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onLowMemory() {
            try {
                this.f10426b.onLowMemory();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onPause() {
            try {
                this.f10426b.onPause();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onResume() {
            try {
                this.f10426b.onResume();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        public final void onStart() {
            try {
                this.f10426b.onStart();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            }
        }

        @Override // p153l.her
        /* JADX INFO: renamed from: w */
        public final void mo15058w() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.maps.MapView$b */
    @VisibleForTesting
    public static class C2453b extends xtd<C2452a> {

        /* JADX INFO: renamed from: e */
        public final ViewGroup f10428e;

        /* JADX INFO: renamed from: f */
        public final Context f10429f;

        /* JADX INFO: renamed from: g */
        public wl50<C2452a> f10430g;

        /* JADX INFO: renamed from: h */
        public final GoogleMapOptions f10431h;

        /* JADX INFO: renamed from: i */
        public final List<um50> f10432i = new ArrayList();

        @VisibleForTesting
        public C2453b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f10428e = viewGroup;
            this.f10429f = context;
            this.f10431h = googleMapOptions;
        }

        @Override // p153l.xtd
        /* JADX INFO: renamed from: a */
        public final void mo15060a(wl50<C2452a> wl50Var) {
            this.f10430g = wl50Var;
            if (wl50Var == null || m213054b() != null) {
                return;
            }
            try {
                oxw.m169737a(this.f10429f);
                jyl jylVarMo128139j7 = k4t0.m148296c(this.f10429f).mo128139j7(h950.m134038Y2(this.f10429f), this.f10431h);
                if (jylVarMo128139j7 == null) {
                    return;
                }
                this.f10430g.mo184919a(new C2452a(this.f10428e, jylVarMo128139j7));
                Iterator<um50> it = this.f10432i.iterator();
                while (it.hasNext()) {
                    m213054b().m15063c(it.next());
                }
                this.f10432i.clear();
            } catch (RemoteException e) {
                v6k.m200076a(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10424a = new C2453b(this, context, GoogleMapOptions.m15027F(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context) {
        super(context);
        this.f10424a = new C2453b(this, context, null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10424a = new C2453b(this, context, GoogleMapOptions.m15027F(context, attributeSet));
        setClickable(true);
    }
}
