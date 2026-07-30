package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.common.internal.Preconditions;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p153l.an50;
import p153l.d70;
import p153l.dct0;
import p153l.har0;
import p153l.jas0;
import p153l.kbt0;
import p153l.mv0;
import p153l.n5d0;
import p153l.o2v0;
import p153l.s70;
import p153l.sgs0;
import p153l.w70;
import p153l.wis0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseAdView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    @NotOnlyInitialized
    public final o2v0 f9676a;

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f9676a = new o2v0(this, attributeSet, false, i);
    }

    /* JADX INFO: renamed from: a */
    public void m12272a() {
        sgs0.m185829a(getContext());
        if (((Boolean) wis0.f189388e.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167962Da)).booleanValue()) {
                kbt0.f124977b.execute(new Runnable() { // from class: l.k4u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f123927a;
                        try {
                            baseAdView.f9676a.m165782n();
                        } catch (IllegalStateException e) {
                            w2t0.m204592c(baseAdView.getContext()).mo204598b(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f9676a.m165782n();
    }

    @RequiresPermission("android.permission.INTERNET")
    /* JADX INFO: renamed from: b */
    public void m12273b(@NonNull final s70 s70Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        sgs0.m185829a(getContext());
        if (((Boolean) wis0.f189389f.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                kbt0.f124977b.execute(new Runnable() { // from class: l.uyv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f181663a;
                        try {
                            baseAdView.f9676a.m165784p(s70Var.f166632a);
                        } catch (IllegalStateException e) {
                            w2t0.m204592c(baseAdView.getContext()).mo204598b(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f9676a.m165784p(s70Var.f166632a);
    }

    /* JADX INFO: renamed from: c */
    public void m12274c() {
        sgs0.m185829a(getContext());
        if (((Boolean) wis0.f189390g.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167974Ea)).booleanValue()) {
                kbt0.f124977b.execute(new Runnable() { // from class: l.q1v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f155224a;
                        try {
                            baseAdView.f9676a.m165785q();
                        } catch (IllegalStateException e) {
                            w2t0.m204592c(baseAdView.getContext()).mo204598b(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f9676a.m165785q();
    }

    /* JADX INFO: renamed from: d */
    public void m12275d() {
        sgs0.m185829a(getContext());
        if (((Boolean) wis0.f189391h.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167950Ca)).booleanValue()) {
                kbt0.f124977b.execute(new Runnable() { // from class: l.r6t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f161496a;
                        try {
                            baseAdView.f9676a.m165786r();
                        } catch (IllegalStateException e) {
                            w2t0.m204592c(baseAdView.getContext()).mo204598b(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f9676a.m165786r();
    }

    @NonNull
    public d70 getAdListener() {
        return this.f9676a.m165773d();
    }

    @Nullable
    public w70 getAdSize() {
        return this.f9676a.m165774e();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f9676a.m165781m();
    }

    @Nullable
    public an50 getOnPaidEventListener() {
        this.f9676a.m165775f();
        return null;
    }

    @Nullable
    public n5d0 getResponseInfo() {
        return this.f9676a.m165776g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        w70 adSize;
        int iM205214b;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                dct0.m115296e("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int iM205216e = adSize.m205216e(context);
                iM205214b = adSize.m205214b(context);
                measuredWidth = iM205216e;
            } else {
                iM205214b = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            iM205214b = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(iM205214b, getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@NonNull d70 d70Var) {
        this.f9676a.m165788t(d70Var);
        if (d70Var == 0) {
            this.f9676a.m165787s(null);
            return;
        }
        if (d70Var instanceof har0) {
            this.f9676a.m165787s((har0) d70Var);
        }
        if (d70Var instanceof mv0) {
            this.f9676a.m165792x((mv0) d70Var);
        }
    }

    public void setAdSize(@NonNull w70 w70Var) {
        this.f9676a.m165789u(w70Var);
    }

    public void setAdUnitId(@NonNull String str) {
        this.f9676a.m165791w(str);
    }

    public void setOnPaidEventListener(@Nullable an50 an50Var) {
        this.f9676a.m165794z(an50Var);
    }

    public BaseAdView(@NonNull Context context, int i) {
        super(context);
        this.f9676a = new o2v0(this, i);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f9676a = new o2v0(this, attributeSet, false, i2);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.f9676a = new o2v0(this, attributeSet, z, i2);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f9676a = new o2v0(this, attributeSet, z);
    }
}
