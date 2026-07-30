package com.p046p1.mobile.putong.core.p053ui.settings.filter.tags;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p149l.bth0;
import p149l.r9c0;
import p149l.vtd;

/* JADX INFO: loaded from: classes9.dex */
public class TagContainerLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f36264a;

    /* JADX INFO: renamed from: b */
    public int f36265b;

    /* JADX INFO: renamed from: c */
    public boolean f36266c;

    /* JADX INFO: renamed from: d */
    public int f36267d;

    /* JADX INFO: renamed from: e */
    public boolean f36268e;

    /* JADX INFO: renamed from: f */
    public boolean f36269f;

    /* JADX INFO: renamed from: g */
    public boolean f36270g;

    /* JADX INFO: renamed from: h */
    public boolean f36271h;

    /* JADX INFO: renamed from: i */
    public bth0 f36272i;

    /* JADX INFO: renamed from: j */
    public C8887a f36273j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.tags.TagContainerLayout$a */
    public class C8887a extends DataSetObserver {
        public C8887a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m55559a() {
            for (int i = 0; i < TagContainerLayout.this.f36272i.mo100890a(); i++) {
                TagContainerLayout.this.addView(TagContainerLayout.this.f36272i.mo103835c(TagContainerLayout.this, i));
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            m55559a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            m55559a();
        }
    }

    public TagContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36268e = false;
        this.f36269f = true;
        this.f36270g = false;
        this.f36271h = false;
        this.f36273j = new C8887a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.f158328e0);
        this.f36264a = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.f158332g0, vtd.m199996a(getContext(), 16.0f));
        this.f36265b = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.f158336i0, vtd.m199996a(getContext(), 16.0f));
        this.f36267d = typedArrayObtainStyledAttributes.getInt(r9c0.f158330f0, 3);
        this.f36266c = typedArrayObtainStyledAttributes.getBoolean(r9c0.f158334h0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getCOLUMN() {
        return this.f36267d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f36272i)) {
            this.f36272i.m103837e();
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
                int i10 = this.f36265b;
                int i11 = ((measuredHeight + i10) * i6) + measuredHeight;
                if (i9 > i3 - i || (this.f36268e && i7 >= this.f36267d)) {
                    i6++;
                    i11 = ((i10 + measuredHeight) * i6) + measuredHeight;
                    i7 = 0;
                    i9 = measuredWidth;
                }
                i7++;
                childAt.layout(i9 - measuredWidth, i11 - measuredHeight, i9, i11);
                i5 = i9 + this.f36264a;
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
        if (this.f36266c) {
            if (!this.f36270g || this.f36267d <= 1) {
                int i5 = this.f36267d;
                i4 = (size - ((i5 - 1) * this.f36264a)) / i5;
            } else {
                i4 = getChildAt(0).getLayoutParams().width;
                int i6 = this.f36267d;
                int i7 = (size - (i6 * i4)) / (i6 - 1);
                this.f36264a = i7;
                this.f36265b = i7;
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), this.f36271h ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : this.f36269f ? 150 : View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
            }
            int measuredHeight2 = getChildAt(0).getMeasuredHeight();
            int i9 = this.f36267d;
            int i10 = (childCount / i9) + (childCount % i9 > 0 ? 1 : 0);
            if (!this.f36271h) {
                i4 = measuredHeight2;
            }
            measuredHeight = ((i4 * i10) + (this.f36265b * i10)) - 1;
        } else {
            int i11 = 1;
            int i12 = size;
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                int measuredWidth = getChildAt(i14).getMeasuredWidth();
                if (i12 < measuredWidth || (this.f36268e && i13 >= this.f36267d)) {
                    i11++;
                    i3 = size - measuredWidth;
                    i13 = 1;
                } else {
                    i3 = i12 - measuredWidth;
                    i13++;
                }
                i12 = i3 - this.f36264a;
            }
            measuredHeight = (getChildAt(0).getMeasuredHeight() * i11) + (this.f36265b * (i11 - (1 ^ (this.f36268e ? 1 : 0))));
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public void setAdapter(bth0 bth0Var) {
        this.f36272i = bth0Var;
        bth0Var.m103836d(this.f36273j);
    }

    public void setAutoAdjustSpace(boolean z) {
        this.f36270g = z;
    }

    public void setCOLUMN(int i) {
        this.f36267d = i;
    }

    public void setCanAdjustChildHeight(boolean z) {
        this.f36269f = z;
    }

    public void setColumnLimitWithoutCenter(boolean z) {
        this.f36268e = z;
    }

    public void setISCENTER(boolean z) {
        this.f36266c = z;
    }

    public void setIsSquare(boolean z) {
        this.f36271h = z;
    }

    public TagContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TagContainerLayout(Context context) {
        this(context, null);
    }
}
