package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import p153l.gic0;
import p153l.kkl0;
import p153l.xdc0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f654a;

    /* JADX INFO: renamed from: b */
    public int f655b;

    /* JADX INFO: renamed from: c */
    public int f656c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        ButtonBarLayout buttonBarLayout;
        super(context, attributeSet);
        this.f655b = -1;
        this.f656c = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gic0.f104280M0);
        if (Build.VERSION.SDK_INT >= 29) {
            buttonBarLayout = this;
            buttonBarLayout.saveAttributeDataForStyleable(context, gic0.f104280M0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        } else {
            buttonBarLayout = this;
        }
        buttonBarLayout.f654a = typedArrayObtainStyledAttributes.getBoolean(gic0.f104285N0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View viewFindViewById = findViewById(xdc0.f193546M);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m560a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m561b() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f656c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f654a) {
            if (size > this.f655b && m561b()) {
                setStacked(false);
            }
            this.f655b = size;
        }
        if (m561b() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f654a && !m561b() && (getMeasuredWidthAndState() & RoundedDrawable.DEFAULT_BORDER_COLOR) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int iM560a = m560a(0);
        if (iM560a >= 0) {
            View childAt = getChildAt(iM560a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (m561b()) {
                int iM560a2 = m560a(iM560a + 1);
                if (iM560a2 >= 0) {
                    paddingTop += getChildAt(iM560a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (kkl0.m150193y(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f654a != z) {
            this.f654a = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
