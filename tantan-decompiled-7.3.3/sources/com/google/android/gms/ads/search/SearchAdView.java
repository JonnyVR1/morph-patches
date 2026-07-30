package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p153l.d70;
import p153l.dct0;
import p153l.o2v0;
import p153l.w70;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchAdView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    @NotOnlyInitialized
    public final o2v0 f9787a;

    public SearchAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9787a = new o2v0(this, attributeSet, false);
    }

    @NonNull
    public d70 getAdListener() {
        return this.f9787a.m165773d();
    }

    @Nullable
    public w70 getAdSize() {
        return this.f9787a.m165774e();
    }

    @NonNull
    public String getAdUnitId() {
        return this.f9787a.m165781m();
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

    public void setAdListener(@NonNull d70 d70Var) {
        this.f9787a.m165788t(d70Var);
    }

    public void setAdSize(@NonNull w70 w70Var) {
        this.f9787a.m165789u(w70Var);
    }

    public void setAdUnitId(@NonNull String str) {
        this.f9787a.m165791w(str);
    }

    public SearchAdView(@NonNull Context context) {
        super(context);
        this.f9787a = new o2v0(this);
    }

    public SearchAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9787a = new o2v0(this, attributeSet, false);
    }
}
