package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import p149l.aac0;
import p149l.gbl0;
import p149l.s5c0;
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aac0.f68354M0);
        if (Build.VERSION.SDK_INT >= 29) {
            buttonBarLayout = this;
            buttonBarLayout.saveAttributeDataForStyleable(context, aac0.f68354M0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        } else {
            buttonBarLayout = this;
        }
        buttonBarLayout.f654a = typedArrayObtainStyledAttributes.getBoolean(aac0.f68359N0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View viewFindViewById = findViewById(s5c0.f162507M);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m559a(int i) {
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
    public final boolean m560b() {
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
            if (size > this.f655b && m560b()) {
                setStacked(false);
            }
            this.f655b = size;
        }
        if (m560b() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f654a && !m560b() && (getMeasuredWidthAndState() & RoundedDrawable.DEFAULT_BORDER_COLOR) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int iM559a = m559a(0);
        if (iM559a >= 0) {
            View childAt = getChildAt(iM559a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (m560b()) {
                int iM559a2 = m559a(iM559a + 1);
                if (iM559a2 >= 0) {
                    paddingTop += getChildAt(iM559a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (gbl0.m125230y(this) != paddingBottom) {
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
