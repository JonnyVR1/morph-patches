package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import l.ffx;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ProfileImageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f428a;

    /* JADX INFO: renamed from: b */
    public int f429b;

    public ProfileImageView(Context context) {
        super(context);
        this.f429b = t100.d(3.0f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(1);
        if (childAt.getBottom() > getHeight()) {
            childAt.layout(childAt.getLeft(), (getHeight() - childAt.getHeight()) - this.f429b, childAt.getRight(), getHeight() - this.f429b);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        getChildAt(0).measure(ffx.b(size2) - (this.f429b * 2), ffx.a(size));
        getChildAt(1).measure(ffx.b(size2) - (this.f429b * 2), ffx.a(size));
        int iMin = Math.min(getChildAt(0).getMeasuredHeight() + getChildAt(1).getMeasuredHeight(), size);
        if (this.f428a && size2 < iMin) {
            iMin = size2;
        }
        setMeasuredDimension(size2, iMin);
    }

    public void setSquare(boolean z) {
        if (z != this.f428a) {
            this.f428a = z;
            requestLayout();
            invalidate();
        }
    }

    public ProfileImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f429b = t100.d(3.0f);
    }

    public ProfileImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f429b = t100.d(3.0f);
    }
}
