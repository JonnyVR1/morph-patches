package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p149l.gbl0;
import p149l.s5c0;
import p149l.u6k;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@Nullable Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static int m540d(View view) {
        int iM125230y = gbl0.m125230y(view);
        if (iM125230y > 0) {
            return iM125230y;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m540d(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m541e(int i, int i2) {
        int iCombineMeasuredStates;
        int iM540d;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == s5c0.f162516V) {
                    view = childAt;
                } else if (id == s5c0.f162528l) {
                    view2 = childAt;
                } else {
                    if ((id != s5c0.f162530n && id != s5c0.f162532p) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iM540d = m540d(view2);
            measuredHeight = view2.getMeasuredHeight() - iM540d;
            paddingTop += iM540d;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM540d = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingTop;
        if (view2 != null) {
            int i5 = paddingTop - iM540d;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iM540d += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM540d, 1073741824));
            paddingTop = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        forceUniformWidth(childCount, i2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    public final void forceUniformWidth(int i, int i2) {
        AlertDialogLayout alertDialogLayout;
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View childAt = this.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.C0131a c0131a = (LinearLayoutCompat.C0131a) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0131a).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) c0131a).height;
                    ((ViewGroup.MarginLayoutParams) c0131a).height = childAt.getMeasuredHeight();
                    alertDialogLayout = this;
                    i3 = i2;
                    alertDialogLayout.measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) c0131a).height = i5;
                } else {
                    alertDialogLayout = this;
                    i3 = i2;
                }
            } else {
                alertDialogLayout = this;
                i3 = i2;
            }
            i4++;
            this = alertDialogLayout;
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        AlertDialogLayout alertDialogLayout;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int i10 = gravity & 8388615;
        if (i9 != 16) {
            paddingTop = i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight;
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        }
        Drawable dividerDrawable = getDividerDrawable();
        int i11 = 0;
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        while (i11 < childCount) {
            View childAt = this.getChildAt(i11);
            if (childAt == null || childAt.getVisibility() == 8) {
                alertDialogLayout = this;
            } else {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.C0131a c0131a = (LinearLayoutCompat.C0131a) childAt.getLayoutParams();
                int i12 = c0131a.f682b;
                if (i12 < 0) {
                    i12 = i10;
                }
                int iM191981b = u6k.m191981b(i12, gbl0.m125228x(this)) & 7;
                if (iM191981b != 1) {
                    if (iM191981b != 5) {
                        i7 = ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + paddingLeft;
                    } else {
                        i5 = paddingRight - measuredWidth;
                        i6 = ((ViewGroup.MarginLayoutParams) c0131a).rightMargin;
                    }
                    int i13 = i7;
                    if (this.hasDividerBeforeChildAt(i11)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i14 = paddingTop + ((ViewGroup.MarginLayoutParams) c0131a).topMargin;
                    alertDialogLayout = this;
                    alertDialogLayout.setChildFrame(childAt, i13, i14, measuredWidth, measuredHeight2);
                    paddingTop = i14 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin;
                } else {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) c0131a).leftMargin;
                    i6 = ((ViewGroup.MarginLayoutParams) c0131a).rightMargin;
                }
                i7 = i5 - i6;
                int i15 = i7;
                if (this.hasDividerBeforeChildAt(i11)) {
                    paddingTop += intrinsicHeight;
                }
                int i16 = paddingTop + ((ViewGroup.MarginLayoutParams) c0131a).topMargin;
                alertDialogLayout = this;
                alertDialogLayout.setChildFrame(childAt, i15, i16, measuredWidth, measuredHeight2);
                paddingTop = i16 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin;
            }
            i11++;
            this = alertDialogLayout;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        if (m541e(i, i2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public AlertDialogLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
