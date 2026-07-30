package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import p153l.kkl0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f657a;

    /* JADX INFO: renamed from: b */
    public TypedValue f658b;

    /* JADX INFO: renamed from: c */
    public TypedValue f659c;

    /* JADX INFO: renamed from: d */
    public TypedValue f660d;

    /* JADX INFO: renamed from: e */
    public TypedValue f661e;

    /* JADX INFO: renamed from: f */
    public TypedValue f662f;

    /* JADX INFO: renamed from: g */
    public final Rect f663g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0129a f664h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0129a {
        /* JADX INFO: renamed from: a */
        void mo345a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f663g = new Rect();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public void m562a(Rect rect) {
        fitSystemWindows(rect);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: b */
    public void m563b(int i, int i2, int i3, int i4) {
        this.f663g.set(i, i2, i3, i4);
        if (kkl0.m150134P(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f661e == null) {
            this.f661e = new TypedValue();
        }
        return this.f661e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f662f == null) {
            this.f662f = new TypedValue();
        }
        return this.f662f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f659c == null) {
            this.f659c = new TypedValue();
        }
        return this.f659c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f660d == null) {
            this.f660d = new TypedValue();
        }
        return this.f660d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f657a == null) {
            this.f657a = new TypedValue();
        }
        return this.f657a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f658b == null) {
            this.f658b = new TypedValue();
        }
        return this.f658b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0129a interfaceC0129a = this.f664h;
        if (interfaceC0129a != null) {
            interfaceC0129a.mo345a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0129a interfaceC0129a = this.f664h;
        if (interfaceC0129a != null) {
            interfaceC0129a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f660d : this.f659c;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        Rect rect = this.f663g;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    Rect rect2 = this.f663g;
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f661e : this.f662f;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        Rect rect3 = this.f663g;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    Rect rect4 = this.f663g;
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f658b : this.f657a;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        Rect rect5 = this.f663g;
                        i4 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    Rect rect6 = this.f663g;
                    i4 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public void setAttachListener(InterfaceC0129a interfaceC0129a) {
        this.f664h = interfaceC0129a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
