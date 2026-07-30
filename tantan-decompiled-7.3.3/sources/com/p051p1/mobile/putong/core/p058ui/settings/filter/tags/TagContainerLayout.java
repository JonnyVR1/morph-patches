package com.p051p1.mobile.putong.core.p058ui.settings.filter.tags;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p153l.j1i0;
import p153l.jvd;
import p153l.xhc0;

/* JADX INFO: loaded from: classes12.dex */
public class TagContainerLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f37112a;

    /* JADX INFO: renamed from: b */
    public int f37113b;

    /* JADX INFO: renamed from: c */
    public boolean f37114c;

    /* JADX INFO: renamed from: d */
    public int f37115d;

    /* JADX INFO: renamed from: e */
    public boolean f37116e;

    /* JADX INFO: renamed from: f */
    public boolean f37117f;

    /* JADX INFO: renamed from: g */
    public boolean f37118g;

    /* JADX INFO: renamed from: h */
    public boolean f37119h;

    /* JADX INFO: renamed from: i */
    public j1i0 f37120i;

    /* JADX INFO: renamed from: j */
    public C9050a f37121j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.tags.TagContainerLayout$a */
    public class C9050a extends DataSetObserver {
        public C9050a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m56742a() {
            for (int i = 0; i < TagContainerLayout.this.f37120i.mo143134a(); i++) {
                TagContainerLayout.this.addView(TagContainerLayout.this.f37120i.mo143136c(TagContainerLayout.this, i));
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            m56742a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            m56742a();
        }
    }

    public TagContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37116e = false;
        this.f37117f = true;
        this.f37118g = false;
        this.f37119h = false;
        this.f37121j = new C9050a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xhc0.f194328e0);
        this.f37112a = typedArrayObtainStyledAttributes.getDimensionPixelSize(xhc0.f194332g0, jvd.m147011a(getContext(), 16.0f));
        this.f37113b = typedArrayObtainStyledAttributes.getDimensionPixelSize(xhc0.f194336i0, jvd.m147011a(getContext(), 16.0f));
        this.f37115d = typedArrayObtainStyledAttributes.getInt(xhc0.f194330f0, 3);
        this.f37114c = typedArrayObtainStyledAttributes.getBoolean(xhc0.f194334h0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getCOLUMN() {
        return this.f37115d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f37120i)) {
            this.f37120i.m143138e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = i5 + measuredWidth;
                int i10 = this.f37113b;
                int i11 = ((measuredHeight + i10) * i6) + measuredHeight;
                if (i9 > i3 - i || (this.f37116e && i7 >= this.f37115d)) {
                    i6++;
                    i11 = ((i10 + measuredHeight) * i6) + measuredHeight;
                    i7 = 0;
                    i9 = measuredWidth;
                }
                i7++;
                childAt.layout(i9 - measuredWidth, i11 - measuredHeight, i9, i11);
                i5 = i9 + this.f37112a;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        int i4;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        if (childCount <= 0) {
            setMeasuredDimension(size, 0);
            return;
        }
        measureChildren(i, i2);
        if (this.f37114c) {
            if (!this.f37118g || this.f37115d <= 1) {
                int i5 = this.f37115d;
                i4 = (size - ((i5 - 1) * this.f37112a)) / i5;
            } else {
                i4 = getChildAt(0).getLayoutParams().width;
                int i6 = this.f37115d;
                int i7 = (size - (i6 * i4)) / (i6 - 1);
                this.f37112a = i7;
                this.f37113b = i7;
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), this.f37119h ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : this.f37117f ? 150 : View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
            }
            int measuredHeight2 = getChildAt(0).getMeasuredHeight();
            int i9 = this.f37115d;
            int i10 = (childCount / i9) + (childCount % i9 > 0 ? 1 : 0);
            if (!this.f37119h) {
                i4 = measuredHeight2;
            }
            measuredHeight = ((i4 * i10) + (this.f37113b * i10)) - 1;
        } else {
            int i11 = 1;
            int i12 = size;
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                int measuredWidth = getChildAt(i14).getMeasuredWidth();
                if (i12 < measuredWidth || (this.f37116e && i13 >= this.f37115d)) {
                    i11++;
                    i3 = size - measuredWidth;
                    i13 = 1;
                } else {
                    i3 = i12 - measuredWidth;
                    i13++;
                }
                i12 = i3 - this.f37112a;
            }
            measuredHeight = (getChildAt(0).getMeasuredHeight() * i11) + (this.f37113b * (i11 - (1 ^ (this.f37116e ? 1 : 0))));
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public void setAdapter(j1i0 j1i0Var) {
        this.f37120i = j1i0Var;
        j1i0Var.m143137d(this.f37121j);
    }

    public void setAutoAdjustSpace(boolean z) {
        this.f37118g = z;
    }

    public void setCOLUMN(int i) {
        this.f37115d = i;
    }

    public void setCanAdjustChildHeight(boolean z) {
        this.f37117f = z;
    }

    public void setColumnLimitWithoutCenter(boolean z) {
        this.f37116e = z;
    }

    public void setISCENTER(boolean z) {
        this.f37114c = z;
    }

    public void setIsSquare(boolean z) {
        this.f37119h = z;
    }

    public TagContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TagContainerLayout(Context context) {
        this(context, null);
    }
}
