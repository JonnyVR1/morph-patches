package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo;
import com.google.android.material.badge.BadgeDrawable;
import p149l.aac0;
import p149l.fel0;
import p149l.gbl0;
import p149l.pac0;
import p149l.qri0;
import p149l.u6k;
import p149l.upk0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = BadgeDrawable.TOP_START;
        qri0 qri0VarM175993u = qri0.m175993u(context, attributeSet, aac0.f68430c1, i, 0);
        int iM176004k = qri0VarM175993u.m176004k(aac0.f68440e1, -1);
        if (iM176004k >= 0) {
            setOrientation(iM176004k);
        }
        int iM176004k2 = qri0VarM175993u.m176004k(aac0.f68435d1, -1);
        if (iM176004k2 >= 0) {
            setGravity(iM176004k2);
        }
        boolean zM175994a = qri0VarM175993u.m175994a(aac0.f68445f1, true);
        if (!zM175994a) {
            setBaselineAligned(zM175994a);
        }
        this.mWeightSum = qri0VarM175993u.m176002i(aac0.f68455h1, -1.0f);
        this.mBaselineAlignedChildIndex = qri0VarM175993u.m176004k(aac0.f68450g1, -1);
        this.mUseLargestChild = qri0VarM175993u.m175994a(aac0.f68470k1, false);
        setDividerDrawable(qri0VarM175993u.m176000g(aac0.f68460i1));
        this.mShowDividers = qri0VarM175993u.m176004k(aac0.f68475l1, 0);
        this.mDividerPadding = qri0VarM175993u.m175999f(aac0.f68465j1, 0);
        qri0VarM175993u.m176012v();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformHeight(int i, int i2) {
        LinearLayoutCompat linearLayoutCompat;
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = this.getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                C0131a c0131a = (C0131a) virtualChildAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0131a).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) c0131a).width;
                    ((ViewGroup.MarginLayoutParams) c0131a).width = virtualChildAt.getMeasuredWidth();
                    linearLayoutCompat = this;
                    i3 = i2;
                    linearLayoutCompat.measureChildWithMargins(virtualChildAt, i3, 0, iMakeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) c0131a).width = i5;
                } else {
                    linearLayoutCompat = this;
                    i3 = i2;
                }
            } else {
                linearLayoutCompat = this;
                i3 = i2;
            }
            i4++;
            this = linearLayoutCompat;
            i2 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformWidth(int i, int i2) {
        LinearLayoutCompat linearLayoutCompat;
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = this.getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                C0131a c0131a = (C0131a) virtualChildAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0131a).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) c0131a).height;
                    ((ViewGroup.MarginLayoutParams) c0131a).height = virtualChildAt.getMeasuredHeight();
                    linearLayoutCompat = this;
                    i3 = i2;
                    linearLayoutCompat.measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) c0131a).height = i5;
                } else {
                    linearLayoutCompat = this;
                    i3 = i2;
                }
            } else {
                linearLayoutCompat = this;
                i3 = i2;
            }
            i4++;
            this = linearLayoutCompat;
            i2 = i3;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0131a;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean zM121043b = fel0.m121043b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                C0131a c0131a = (C0131a) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, zM121043b ? virtualChildAt.getRight() + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin : (virtualChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) c0131a).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                C0131a c0131a2 = (C0131a) virtualChildAt2.getLayoutParams();
                if (zM121043b) {
                    left = virtualChildAt2.getLeft() - ((ViewGroup.MarginLayoutParams) c0131a2).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((ViewGroup.MarginLayoutParams) c0131a2).rightMargin;
                }
            } else if (zM121043b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((ViewGroup.MarginLayoutParams) ((C0131a) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0131a) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public C0131a generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new C0131a(-2, -2);
        }
        if (i == 1) {
            return new C0131a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public C0131a generateLayoutParams(AttributeSet attributeSet) {
        return new C0131a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            upk0.m194883a("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            upk0.m194883a("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((C0131a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.mShowDividers;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        char c;
        char c2;
        int i7;
        int childrenSkipCount;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        int i12;
        boolean zM121043b = fel0.m121043b(this);
        int paddingTop = getPaddingTop();
        int i13 = i4 - i2;
        int paddingBottom = i13 - getPaddingBottom();
        int paddingBottom2 = (i13 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i14 = this.mGravity;
        int i15 = i14 & 112;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int iM191981b = u6k.m191981b(8388615 & i14, gbl0.m125228x(this));
        char c3 = 2;
        char c4 = 1;
        if (iM191981b != 1) {
            paddingLeft = iM191981b != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
        }
        if (zM121043b) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i16 = 0;
        while (i16 < virtualChildCount) {
            int i17 = i5 + (i6 * i16);
            int i18 = i16;
            View virtualChildAt = getVirtualChildAt(i17);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i17);
                childrenSkipCount = i18;
                i7 = paddingTop;
                c = c3;
                c2 = c4;
            } else {
                c = c3;
                c2 = c4;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    C0131a c0131a = (C0131a) virtualChildAt.getLayoutParams();
                    int i19 = paddingLeft;
                    if (z) {
                        i8 = measuredHeight2;
                        baseline = ((ViewGroup.MarginLayoutParams) c0131a).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i9 = c0131a.f682b;
                        if (i9 < 0) {
                            i9 = i15;
                        }
                        i10 = i9 & 112;
                        i7 = paddingTop;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i11 = i7 + ((ViewGroup.MarginLayoutParams) c0131a).topMargin;
                                if (baseline != -1) {
                                    i11 += iArr[c2] - baseline;
                                }
                            } else if (i10 != 80) {
                                i11 = i7;
                            } else {
                                i11 = (paddingBottom - i8) - ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c] - (virtualChildAt.getMeasuredHeight() - baseline);
                                }
                            }
                            if (hasDividerBeforeChildAt(i17)) {
                                i12 = i19 + this.mDividerWidth;
                            } else {
                                i12 = i19;
                            }
                            int i20 = ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + i12;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i20, i11, measuredWidth, i8);
                            int nextLocationOffset = i20 + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i17) + i18;
                            paddingLeft = nextLocationOffset;
                        } else {
                            i11 = i7 + ((paddingBottom2 - i8) / 2) + ((ViewGroup.MarginLayoutParams) c0131a).topMargin;
                            measuredHeight = ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        if (hasDividerBeforeChildAt(i17)) {
                            i12 = i19 + this.mDividerWidth;
                        } else {
                            i12 = i19;
                        }
                        int i21 = ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + i12;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i21, i11, measuredWidth, i8);
                        int nextLocationOffset2 = i21 + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i17) + i18;
                        paddingLeft = nextLocationOffset2;
                    } else {
                        i8 = measuredHeight2;
                    }
                    i9 = c0131a.f682b;
                    if (i9 < 0) {
                        i9 = i15;
                    }
                    i10 = i9 & 112;
                    i7 = paddingTop;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i11 = i7 + ((ViewGroup.MarginLayoutParams) c0131a).topMargin;
                            if (baseline != -1) {
                                i11 += iArr[c2] - baseline;
                            }
                        } else if (i10 != 80) {
                            i11 = i7;
                        } else {
                            i11 = (paddingBottom - i8) - ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i17)) {
                            i12 = i19 + this.mDividerWidth;
                        } else {
                            i12 = i19;
                        }
                        int i22 = ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + i12;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i22, i11, measuredWidth, i8);
                        int nextLocationOffset3 = i22 + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i17) + i18;
                        paddingLeft = nextLocationOffset3;
                    } else {
                        i11 = i7 + ((paddingBottom2 - i8) / 2) + ((ViewGroup.MarginLayoutParams) c0131a).topMargin;
                        measuredHeight = ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin;
                    }
                    i11 -= measuredHeight;
                    if (hasDividerBeforeChildAt(i17)) {
                        i12 = i19 + this.mDividerWidth;
                    } else {
                        i12 = i19;
                    }
                    int i23 = ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + i12;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i23, i11, measuredWidth, i8);
                    int nextLocationOffset4 = i23 + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i17) + i18;
                    paddingLeft = nextLocationOffset4;
                } else {
                    i7 = paddingTop;
                    childrenSkipCount = i18;
                }
            }
            i16 = childrenSkipCount + 1;
            c3 = c;
            c4 = c2;
            paddingTop = i7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        LinearLayoutCompat linearLayoutCompat;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.mGravity;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        if (i10 != 16) {
            paddingTop = i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = this.getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop += this.measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    C0131a c0131a = (C0131a) virtualChildAt.getLayoutParams();
                    int i12 = c0131a.f682b;
                    if (i12 < 0) {
                        i12 = i11;
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
                        if (this.hasDividerBeforeChildAt(childrenSkipCount)) {
                            paddingTop += this.mDividerHeight;
                        }
                        int i14 = paddingTop + ((ViewGroup.MarginLayoutParams) c0131a).topMargin;
                        linearLayoutCompat = this;
                        linearLayoutCompat.setChildFrame(virtualChildAt, i13, i14 + this.getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                        paddingTop = i14 + measuredHeight + ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin + linearLayoutCompat.getNextLocationOffset(virtualChildAt);
                        childrenSkipCount += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    } else {
                        i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) c0131a).leftMargin;
                        i6 = ((ViewGroup.MarginLayoutParams) c0131a).rightMargin;
                    }
                    i7 = i5 - i6;
                    int i15 = i7;
                    if (this.hasDividerBeforeChildAt(childrenSkipCount)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i16 = paddingTop + ((ViewGroup.MarginLayoutParams) c0131a).topMargin;
                    linearLayoutCompat = this;
                    linearLayoutCompat.setChildFrame(virtualChildAt, i15, i16 + this.getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    paddingTop = i16 + measuredHeight + ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin + linearLayoutCompat.getNextLocationOffset(virtualChildAt);
                    childrenSkipCount += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                }
                childrenSkipCount++;
                this = linearLayoutCompat;
            }
            linearLayoutCompat = this;
            childrenSkipCount++;
            this = linearLayoutCompat;
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0451  */
    public void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int iMax;
        int i8;
        int baseline;
        int i9;
        int i10;
        byte b;
        int i11;
        int i12;
        int i13;
        boolean z;
        View view;
        boolean z2;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z3 = this.mBaselineAligned;
        boolean z4 = this.mUseLargestChild;
        int i14 = 1073741824;
        boolean z5 = mode == 1073741824;
        boolean z6 = z4;
        int childrenSkipCount = 0;
        int i15 = 0;
        int iMax2 = 0;
        boolean z7 = false;
        int iCombineMeasuredStates = 0;
        boolean z8 = false;
        boolean z9 = true;
        float f2 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i3 = i15;
            if (childrenSkipCount >= virtualChildCount) {
                break;
            }
            boolean z10 = z3;
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    C0131a c0131a = (C0131a) virtualChildAt.getLayoutParams();
                    float f3 = c0131a.f681a;
                    float f4 = f2 + f3;
                    if (mode == i14 && ((ViewGroup.MarginLayoutParams) c0131a).width == 0 && f3 > 0.0f) {
                        int i16 = this.mTotalLength;
                        if (z5) {
                            this.mTotalLength = i16 + ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin;
                        } else {
                            this.mTotalLength = Math.max(i16, ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + i16 + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin);
                        }
                        if (z10) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z7 = true;
                        }
                        i12 = i3;
                        i13 = 1073741824;
                        z = z6;
                        view = virtualChildAt;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) c0131a).width != 0 || f3 <= 0.0f) {
                            b = -2;
                            i11 = Integer.MIN_VALUE;
                        } else {
                            b = -2;
                            ((ViewGroup.MarginLayoutParams) c0131a).width = -2;
                            i11 = 0;
                        }
                        virtualChildCount = virtualChildCount;
                        mode = mode;
                        iArr = iArr;
                        i12 = i3;
                        i13 = 1073741824;
                        z = z6;
                        iArr2 = iArr2;
                        int i17 = i11;
                        measureChildBeforeLayout(virtualChildAt, childrenSkipCount, i, f4 == 0.0f ? this.mTotalLength : 0, i2, 0);
                        view = virtualChildAt;
                        if (i17 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) c0131a).width = i17;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        int i18 = this.mTotalLength;
                        if (z5) {
                            this.mTotalLength = i18 + ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + measuredWidth + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin + getNextLocationOffset(view);
                        } else {
                            this.mTotalLength = Math.max(i18, i18 + measuredWidth + ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin + getNextLocationOffset(view));
                        }
                        if (z) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i13 || ((ViewGroup.MarginLayoutParams) c0131a).height != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z8 = true;
                    }
                    int i19 = ((ViewGroup.MarginLayoutParams) c0131a).topMargin + ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i19;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z10 && (baseline2 = view.getBaseline()) != -1) {
                        int i20 = c0131a.f682b;
                        if (i20 < 0) {
                            i20 = this.mGravity;
                        }
                        int i21 = (((i20 & 112) >> 4) & (-2)) >> 1;
                        iArr[i21] = Math.max(iArr[i21], baseline2);
                        iArr2[i21] = Math.max(iArr2[i21], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i12, measuredHeight);
                    z9 = z9 && ((ViewGroup.MarginLayoutParams) c0131a).height == -1;
                    if (c0131a.f681a > 0.0f) {
                        if (!z2) {
                            i19 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i19);
                    } else {
                        if (z2 == 0) {
                            i19 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i19);
                    }
                    childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                    i15 = iMax5;
                    f2 = f4;
                }
                childrenSkipCount++;
                z6 = z;
                iArr2 = iArr2;
                z3 = z10;
                mode = mode;
                iArr = iArr;
                virtualChildCount = virtualChildCount;
                i14 = 1073741824;
            }
            virtualChildCount = virtualChildCount;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i15 = i3;
            z = z6;
            childrenSkipCount++;
            z6 = z;
            iArr2 = iArr2;
            z3 = z10;
            mode = mode;
            iArr = iArr;
            virtualChildCount = virtualChildCount;
            i14 = 1073741824;
        }
        boolean z11 = z3;
        int i22 = virtualChildCount;
        int i23 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int iCombineMeasuredStates2 = iCombineMeasuredStates;
        boolean z12 = z6;
        if (this.mTotalLength > 0) {
            i4 = i22;
            if (hasDividerBeforeChildAt(i4)) {
                this.mTotalLength += this.mDividerWidth;
            }
        } else {
            i4 = i22;
        }
        int i24 = iArr3[1];
        int iMax6 = (i24 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i3 : Math.max(i3, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i24, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
        if (z12) {
            i5 = i23;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                this.mTotalLength = 0;
                int childrenSkipCount2 = 0;
                while (childrenSkipCount2 < i4) {
                    View virtualChildAt2 = getVirtualChildAt(childrenSkipCount2);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength += measureNullChild(childrenSkipCount2);
                    } else {
                        if (virtualChildAt2.getVisibility() == 8) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount2);
                        } else {
                            C0131a c0131a2 = (C0131a) virtualChildAt2.getLayoutParams();
                            int i25 = this.mTotalLength;
                            if (z5) {
                                this.mTotalLength = i25 + ((ViewGroup.MarginLayoutParams) c0131a2).leftMargin + iMax2 + ((ViewGroup.MarginLayoutParams) c0131a2).rightMargin + getNextLocationOffset(virtualChildAt2);
                            } else {
                                this.mTotalLength = Math.max(i25, i25 + iMax2 + ((ViewGroup.MarginLayoutParams) c0131a2).leftMargin + ((ViewGroup.MarginLayoutParams) c0131a2).rightMargin + getNextLocationOffset(virtualChildAt2));
                            }
                        }
                        childrenSkipCount2++;
                        f2 = f2;
                    }
                    childrenSkipCount2++;
                    f2 = f2;
                }
            }
            f = f2;
        } else {
            f = f2;
            i5 = i23;
        }
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i26 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z7 || (i26 != 0 && f > 0.0f)) {
            float f5 = this.mWeightSum;
            if (f5 > 0.0f) {
                f = f5;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            this.mTotalLength = 0;
            iMax6 = -1;
            int i27 = 0;
            while (i27 < i4) {
                View virtualChildAt3 = getVirtualChildAt(i27);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    C0131a c0131a3 = (C0131a) virtualChildAt3.getLayoutParams();
                    float f6 = c0131a3.f681a;
                    if (f6 > 0.0f) {
                        int i28 = (int) ((i26 * f6) / f);
                        f -= f6;
                        i26 -= i28;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) c0131a3).topMargin + ((ViewGroup.MarginLayoutParams) c0131a3).bottomMargin, ((ViewGroup.MarginLayoutParams) c0131a3).height);
                        if (((ViewGroup.MarginLayoutParams) c0131a3).width == 0) {
                            i10 = 1073741824;
                            if (i5 == 1073741824) {
                                if (i28 <= 0) {
                                    i28 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i28, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & RoundedDrawable.DEFAULT_BORDER_COLOR);
                        } else {
                            i10 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i28;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i10), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & RoundedDrawable.DEFAULT_BORDER_COLOR);
                    }
                    int i29 = this.mTotalLength;
                    if (z5) {
                        this.mTotalLength = i29 + virtualChildAt3.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0131a3).leftMargin + ((ViewGroup.MarginLayoutParams) c0131a3).rightMargin + getNextLocationOffset(virtualChildAt3);
                    } else {
                        this.mTotalLength = Math.max(i29, virtualChildAt3.getMeasuredWidth() + i29 + ((ViewGroup.MarginLayoutParams) c0131a3).leftMargin + ((ViewGroup.MarginLayoutParams) c0131a3).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z13 = mode2 != 1073741824 && ((ViewGroup.MarginLayoutParams) c0131a3).height == -1;
                    int i30 = ((ViewGroup.MarginLayoutParams) c0131a3).topMargin + ((ViewGroup.MarginLayoutParams) c0131a3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i30;
                    iMax6 = Math.max(iMax6, measuredHeight2);
                    if (!z13) {
                        i30 = measuredHeight2;
                    }
                    int iMax7 = Math.max(iMax3, i30);
                    if (z9) {
                        i8 = -1;
                        boolean z14 = ((ViewGroup.MarginLayoutParams) c0131a3).height == -1;
                        if (z11 && (baseline = virtualChildAt3.getBaseline()) != i8) {
                            i9 = c0131a3.f682b;
                            if (i9 < 0) {
                                i9 = this.mGravity;
                            }
                            int i31 = (((i9 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i31] = Math.max(iArr3[i31], baseline);
                            iArr4[i31] = Math.max(iArr4[i31], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax7;
                        z9 = z14;
                    } else {
                        i8 = -1;
                    }
                    if (z11) {
                        i9 = c0131a3.f682b;
                        if (i9 < 0) {
                            i9 = this.mGravity;
                        }
                        int i32 = (((i9 & 112) >> 4) & (-2)) >> 1;
                        iArr3[i32] = Math.max(iArr3[i32], baseline);
                        iArr4[i32] = Math.max(iArr4[i32], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax7;
                    z9 = z14;
                }
                i27++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i6 = iResolveSizeAndState;
            i7 = RoundedDrawable.DEFAULT_BORDER_COLOR;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i33 = iArr3[1];
            if (i33 != -1 || iArr3[0] != -1 || iArr3[2] != -1 || iArr3[3] != -1) {
                iMax6 = Math.max(iMax6, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i33, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
            }
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z12 && i5 != 1073741824) {
                for (int i34 = 0; i34 < i4; i34++) {
                    View virtualChildAt4 = getVirtualChildAt(i34);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((C0131a) virtualChildAt4.getLayoutParams()).f681a > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = iResolveSizeAndState;
            i7 = RoundedDrawable.DEFAULT_BORDER_COLOR;
        }
        int i35 = iCombineMeasuredStates2;
        if (!z9 && mode2 != 1073741824) {
            iMax6 = iMax;
        }
        setMeasuredDimension(i6 | (i35 & i7), View.resolveSizeAndState(Math.max(iMax6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i35 << 16));
        if (z8) {
            forceUniformHeight(i4, i);
        }
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0161  */
    public void measureVertical(int i, int i2) {
        int i3;
        int iMax;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        View view;
        boolean z;
        int iMax2;
        boolean z2;
        int iMax3;
        int i13;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i14 = this.mBaselineAlignedChildIndex;
        boolean z3 = this.mUseLargestChild;
        int childrenSkipCount = 0;
        int i15 = 0;
        int iMax4 = 0;
        int i16 = 0;
        int i17 = 0;
        int iMax5 = 0;
        boolean z4 = false;
        boolean z5 = false;
        float f = 0.0f;
        boolean z6 = true;
        while (true) {
            int i18 = 8;
            if (childrenSkipCount >= virtualChildCount) {
                float f2 = f;
                int i19 = i15;
                int i20 = virtualChildCount;
                int i21 = mode2;
                boolean z7 = z3;
                int i22 = iMax4;
                int iMax6 = i16;
                int iCombineMeasuredStates = i17;
                if (this.mTotalLength > 0) {
                    i3 = i20;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i20;
                }
                int i23 = i21;
                if (z7 && (i23 == Integer.MIN_VALUE || i23 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i3) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength += measureNullChild(childrenSkipCount2);
                        } else if (virtualChildAt.getVisibility() == i18) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            C0131a c0131a = (C0131a) virtualChildAt.getLayoutParams();
                            int i24 = this.mTotalLength;
                            this.mTotalLength = Math.max(i24, i24 + i22 + ((ViewGroup.MarginLayoutParams) c0131a).topMargin + ((ViewGroup.MarginLayoutParams) c0131a).bottomMargin + getNextLocationOffset(virtualChildAt));
                        }
                        childrenSkipCount2++;
                        i18 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i25 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z4 || (i25 != 0 && f2 > 0.0f)) {
                    float f3 = this.mWeightSum;
                    if (f3 <= 0.0f) {
                        f3 = f2;
                    }
                    this.mTotalLength = 0;
                    float f4 = f3;
                    int i26 = i25;
                    int i27 = 0;
                    while (i27 < i3) {
                        View virtualChildAt2 = getVirtualChildAt(i27);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i23 = i23;
                            i27 = i27;
                        } else {
                            C0131a c0131a2 = (C0131a) virtualChildAt2.getLayoutParams();
                            float f5 = c0131a2.f681a;
                            if (f5 > 0.0f) {
                                int i28 = (int) ((i26 * f5) / f4);
                                f4 -= f5;
                                i26 -= i28;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c0131a2).leftMargin + ((ViewGroup.MarginLayoutParams) c0131a2).rightMargin, ((ViewGroup.MarginLayoutParams) c0131a2).width);
                                if (((ViewGroup.MarginLayoutParams) c0131a2).height == 0) {
                                    i5 = 1073741824;
                                    if (i23 == 1073741824) {
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i28 > 0 ? i28 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                                } else {
                                    i5 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i28;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i5));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                            } else {
                                i23 = i23;
                            }
                            int i29 = ((ViewGroup.MarginLayoutParams) c0131a2).leftMargin + ((ViewGroup.MarginLayoutParams) c0131a2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i29;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i4 = -1;
                                if (((ViewGroup.MarginLayoutParams) c0131a2).width == -1) {
                                    measuredWidth = i29;
                                }
                            } else {
                                i4 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z8 = z6 && ((ViewGroup.MarginLayoutParams) c0131a2).width == i4;
                            int i30 = this.mTotalLength;
                            this.mTotalLength = Math.max(i30, i30 + virtualChildAt2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0131a2).topMargin + ((ViewGroup.MarginLayoutParams) c0131a2).bottomMargin + getNextLocationOffset(virtualChildAt2));
                            iMax5 = iMax7;
                            z6 = z8;
                        }
                        i27++;
                        i23 = i23;
                    }
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i19);
                    if (z7 && i23 != 1073741824) {
                        for (int i31 = 0; i31 < i3; i31++) {
                            View virtualChildAt3 = getVirtualChildAt(i31);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((C0131a) virtualChildAt3.getLayoutParams()).f681a > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i22, 1073741824));
                            }
                        }
                    }
                }
                if (!z6 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates), iResolveSizeAndState);
                if (z5) {
                    forceUniformWidth(i3, i2);
                    return;
                }
                return;
            }
            float f6 = f;
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt4.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    C0131a c0131a3 = (C0131a) virtualChildAt4.getLayoutParams();
                    float f7 = c0131a3.f681a;
                    float f8 = f6 + f7;
                    if (mode2 == 1073741824 && ((ViewGroup.MarginLayoutParams) c0131a3).height == 0 && f7 > 0.0f) {
                        int i32 = this.mTotalLength;
                        this.mTotalLength = Math.max(i32, ((ViewGroup.MarginLayoutParams) c0131a3).topMargin + i32 + ((ViewGroup.MarginLayoutParams) c0131a3).bottomMargin);
                        iMax2 = i15;
                        i9 = virtualChildCount;
                        i10 = mode2;
                        z4 = true;
                        i12 = i16;
                        i11 = i17;
                        z = z3;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) c0131a3).height != 0 || f7 <= 0.0f) {
                            i6 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0131a3).height = -2;
                            i6 = 0;
                        }
                        if (f8 == 0.0f) {
                            int i33 = i17;
                            i8 = this.mTotalLength;
                            i7 = i33;
                        } else {
                            i7 = i17;
                            i8 = 0;
                        }
                        int i34 = iMax4;
                        i9 = virtualChildCount;
                        i10 = mode2;
                        i11 = i7;
                        i12 = i16;
                        view = virtualChildAt4;
                        z = z3;
                        iMax2 = i15;
                        measureChildBeforeLayout(view, childrenSkipCount, i, 0, i2, i8);
                        if (i6 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) c0131a3).height = i6;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i35 = this.mTotalLength;
                        this.mTotalLength = Math.max(i35, i35 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0131a3).topMargin + ((ViewGroup.MarginLayoutParams) c0131a3).bottomMargin + getNextLocationOffset(view));
                        iMax4 = z ? Math.max(measuredHeight2, i34) : i34;
                    }
                    if (i14 >= 0 && i14 == childrenSkipCount + 1) {
                        view = virtualChildAt4;
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (childrenSkipCount < i14 && c0131a3.f681a > 0.0f) {
                        upk0.m194883a("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        return;
                    }
                    if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) c0131a3).width != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z5 = true;
                    }
                    int i36 = ((ViewGroup.MarginLayoutParams) c0131a3).leftMargin + ((ViewGroup.MarginLayoutParams) c0131a3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i36;
                    iMax3 = Math.max(i12, measuredWidth2);
                    int i37 = iMax4;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i11, view.getMeasuredState());
                    if (z6) {
                        i13 = iCombineMeasuredStates2;
                        z6 = ((ViewGroup.MarginLayoutParams) c0131a3).width == -1;
                        if (c0131a3.f681a > 0.0f) {
                            if (!z2) {
                                i36 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i36);
                        } else {
                            if (!z2) {
                                i36 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i36);
                        }
                        childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                        f = f8;
                        iMax4 = i37;
                        i17 = i13;
                    } else {
                        i13 = iCombineMeasuredStates2;
                    }
                    if (c0131a3.f681a > 0.0f) {
                        if (!z2) {
                            i36 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i36);
                    } else {
                        if (!z2) {
                            i36 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i36);
                    }
                    childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                    f = f8;
                    iMax4 = i37;
                    i17 = i13;
                }
                childrenSkipCount++;
                i16 = iMax3;
                i15 = iMax2;
                z3 = z;
                mode2 = i10;
                virtualChildCount = i9;
            }
            iMax2 = i15;
            i9 = virtualChildCount;
            i10 = mode2;
            z = z3;
            f = f6;
            iMax3 = i16;
            childrenSkipCount++;
            i16 = iMax3;
            i15 = iMax2;
            z3 = z;
            mode2 = i10;
            virtualChildCount = i9;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            pac0.m168085a("base aligned child index out of range (0, ", getChildCount(), ")");
        } else {
            this.mBaselineAlignedChildIndex = i;
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public C0131a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0131a(layoutParams);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.LinearLayoutCompat$a */
    public static class C0131a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public float f681a;

        /* JADX INFO: renamed from: b */
        public int f682b;

        public C0131a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f682b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aac0.f68480m1);
            this.f681a = typedArrayObtainStyledAttributes.getFloat(aac0.f68490o1, 0.0f);
            this.f682b = typedArrayObtainStyledAttributes.getInt(aac0.f68485n1, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0131a(int i, int i2) {
            super(i, i2);
            this.f682b = -1;
            this.f681a = 0.0f;
        }

        public C0131a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f682b = -1;
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }
}
