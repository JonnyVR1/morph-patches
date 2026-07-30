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
import p149l.a80;
import p149l.b1r0;
import p149l.d1s0;
import p149l.e2t0;
import p149l.fv0;
import p149l.h70;
import p149l.itu0;
import p149l.kxc0;
import p149l.m7s0;
import p149l.q9s0;
import p149l.te50;
import p149l.w70;
import p149l.x2t0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseAdView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    @NotOnlyInitialized
    public final itu0 f9639a;

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f9639a = new itu0(this, attributeSet, false, i);
    }

    /* JADX INFO: renamed from: a */
    public void m12218a() {
        m7s0.m153417a(getContext());
        if (((Boolean) q9s0.f153474e.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131891Da)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.evt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f93381a;
                        try {
                            baseAdView.f9639a.m138265n();
                        } catch (IllegalStateException e) {
                            qts0.m176477c(baseAdView.getContext()).mo176483b(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f9639a.m138265n();
    }

    @RequiresPermission("android.permission.INTERNET")
    /* JADX INFO: renamed from: b */
    public void m12219b(@NonNull final w70 w70Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        m7s0.m153417a(getContext());
        if (((Boolean) q9s0.f153475f.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.opv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f145050a;
                        try {
                            baseAdView.f9639a.m138267p(w70Var.f185014a);
                        } catch (IllegalStateException e) {
                            qts0.m176477c(baseAdView.getContext()).mo176483b(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f9639a.m138267p(w70Var.f185014a);
    }

    /* JADX INFO: renamed from: c */
    public void m12220c() {
        m7s0.m153417a(getContext());
        if (((Boolean) q9s0.f153476g.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131903Ea)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.ksu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f124507a;
                        try {
                            baseAdView.f9639a.m138268q();
                        } catch (IllegalStateException e) {
                            qts0.m176477c(baseAdView.getContext()).mo176483b(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f9639a.m138268q();
    }

    /* JADX INFO: renamed from: d */
    public void m12221d() {
        m7s0.m153417a(getContext());
        if (((Boolean) q9s0.f153477h.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131879Ca)).booleanValue()) {
                e2t0.f88943b.execute(new Runnable() { // from class: l.lxs0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f130432a;
                        try {
                            baseAdView.f9639a.m138269r();
                        } catch (IllegalStateException e) {
                            qts0.m176477c(baseAdView.getContext()).mo176483b(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f9639a.m138269r();
    }

    @NonNull
    public h70 getAdListener() {
        return this.f9639a.m138256d();
    }

    @Nullable
    public a80 getAdSize() {
        return this.f9639a.m138257e();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f9639a.m138264m();
    }

    @Nullable
    public te50 getOnPaidEventListener() {
        this.f9639a.m138258f();
        return null;
    }

    @Nullable
    public kxc0 getResponseInfo() {
        return this.f9639a.m138259g();
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
        a80 adSize;
        int iM95311b;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                x2t0.m206867e("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int iM95313e = adSize.m95313e(context);
                iM95311b = adSize.m95311b(context);
                measuredWidth = iM95313e;
            } else {
                iM95311b = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            iM95311b = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(iM95311b, getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@NonNull h70 h70Var) {
        this.f9639a.m138271t(h70Var);
        if (h70Var == 0) {
            this.f9639a.m138270s(null);
            return;
        }
        if (h70Var instanceof b1r0) {
            this.f9639a.m138270s((b1r0) h70Var);
        }
        if (h70Var instanceof fv0) {
            this.f9639a.m138275x((fv0) h70Var);
        }
    }

    public void setAdSize(@NonNull a80 a80Var) {
        this.f9639a.m138272u(a80Var);
    }

    public void setAdUnitId(@NonNull String str) {
        this.f9639a.m138274w(str);
    }

    public void setOnPaidEventListener(@Nullable te50 te50Var) {
        this.f9639a.m138277z(te50Var);
    }

    public BaseAdView(@NonNull Context context, int i) {
        super(context);
        this.f9639a = new itu0(this, i);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f9639a = new itu0(this, attributeSet, false, i2);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.f9639a = new itu0(this, attributeSet, z, i2);
    }

    public BaseAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f9639a = new itu0(this, attributeSet, z);
    }
}
