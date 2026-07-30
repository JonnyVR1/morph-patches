package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p149l.a80;
import p149l.h70;
import p149l.itu0;
import p149l.x2t0;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchAdView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    @NotOnlyInitialized
    public final itu0 f9750a;

    public SearchAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9750a = new itu0(this, attributeSet, false);
    }

    @NonNull
    public h70 getAdListener() {
        return this.f9750a.m138256d();
    }

    @Nullable
    public a80 getAdSize() {
        return this.f9750a.m138257e();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f9750a.m138264m();
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

    public void setAdListener(@NonNull h70 h70Var) {
        this.f9750a.m138271t(h70Var);
    }

    public void setAdSize(@NonNull a80 a80Var) {
        this.f9750a.m138272u(a80Var);
    }

    public void setAdUnitId(@NonNull String str) {
        this.f9750a.m138274w(str);
    }

    public SearchAdView(@NonNull Context context) {
        super(context);
        this.f9750a = new itu0(this);
    }

    public SearchAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9750a = new itu0(this, attributeSet, false);
    }
}
