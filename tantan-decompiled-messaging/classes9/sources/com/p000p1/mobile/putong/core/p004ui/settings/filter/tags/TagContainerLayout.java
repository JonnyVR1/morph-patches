package com.p000p1.mobile.putong.core.p004ui.settings.filter.tags;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import l.r9c0;
import l.vtd;
import p006l.bth0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TagContainerLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f6045a;

    /* JADX INFO: renamed from: b */
    public int f6046b;

    /* JADX INFO: renamed from: c */
    public boolean f6047c;

    /* JADX INFO: renamed from: d */
    public int f6048d;

    /* JADX INFO: renamed from: e */
    public boolean f6049e;

    /* JADX INFO: renamed from: f */
    public boolean f6050f;

    /* JADX INFO: renamed from: g */
    public boolean f6051g;

    /* JADX INFO: renamed from: h */
    public boolean f6052h;

    /* JADX INFO: renamed from: i */
    public bth0 f6053i;

    /* JADX INFO: renamed from: j */
    public C0323a f6054j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.tags.TagContainerLayout$a */
    public class C0323a extends DataSetObserver {
        public C0323a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m8952a() {
            for (int i = 0; i < TagContainerLayout.this.f6053i.mo12578a(); i++) {
                TagContainerLayout.this.addView(TagContainerLayout.this.f6053i.mo12898c(TagContainerLayout.this, i));
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            m8952a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            m8952a();
        }
    }

    public TagContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6049e = false;
        this.f6050f = true;
        this.f6051g = false;
        this.f6052h = false;
        this.f6054j = new C0323a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9c0.e0);
        this.f6045a = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.g0, vtd.a(getContext(), 16.0f));
        this.f6046b = typedArrayObtainStyledAttributes.getDimensionPixelSize(r9c0.i0, vtd.a(getContext(), 16.0f));
        this.f6048d = typedArrayObtainStyledAttributes.getInt(r9c0.f0, 3);
        this.f6047c = typedArrayObtainStyledAttributes.getBoolean(r9c0.h0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getCOLUMN() {
        return this.f6048d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f6053i)) {
            this.f6053i.m12900e();
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
                int i10 = this.f6046b;
                int i11 = ((measuredHeight + i10) * i6) + measuredHeight;
                if (i9 > i3 - i || (this.f6049e && i7 >= this.f6048d)) {
                    i6++;
                    i11 = ((i10 + measuredHeight) * i6) + measuredHeight;
                    i7 = 0;
                    i9 = measuredWidth;
                }
                i7++;
                childAt.layout(i9 - measuredWidth, i11 - measuredHeight, i9, i11);
                i5 = i9 + this.f6045a;
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
        if (this.f6047c) {
            if (!this.f6051g || this.f6048d <= 1) {
                int i5 = this.f6048d;
                i4 = (size - ((i5 - 1) * this.f6045a)) / i5;
            } else {
                i4 = getChildAt(0).getLayoutParams().width;
                int i6 = this.f6048d;
                int i7 = (size - (i6 * i4)) / (i6 - 1);
                this.f6045a = i7;
                this.f6046b = i7;
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), this.f6052h ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : this.f6050f ? 150 : View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
            }
            int measuredHeight2 = getChildAt(0).getMeasuredHeight();
            int i9 = this.f6048d;
            int i10 = (childCount / i9) + (childCount % i9 > 0 ? 1 : 0);
            if (!this.f6052h) {
                i4 = measuredHeight2;
            }
            measuredHeight = ((i4 * i10) + (this.f6046b * i10)) - 1;
        } else {
            int i11 = 1;
            int i12 = size;
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                int measuredWidth = getChildAt(i14).getMeasuredWidth();
                if (i12 < measuredWidth || (this.f6049e && i13 >= this.f6048d)) {
                    i11++;
                    i3 = size - measuredWidth;
                    i13 = 1;
                } else {
                    i3 = i12 - measuredWidth;
                    i13++;
                }
                i12 = i3 - this.f6045a;
            }
            measuredHeight = (getChildAt(0).getMeasuredHeight() * i11) + (this.f6046b * (i11 - (1 ^ (this.f6049e ? 1 : 0))));
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public void setAdapter(bth0 bth0Var) {
        this.f6053i = bth0Var;
        bth0Var.m12899d(this.f6054j);
    }

    public void setAutoAdjustSpace(boolean z) {
        this.f6051g = z;
    }

    public void setCOLUMN(int i) {
        this.f6048d = i;
    }

    public void setCanAdjustChildHeight(boolean z) {
        this.f6050f = z;
    }

    public void setColumnLimitWithoutCenter(boolean z) {
        this.f6049e = z;
    }

    public void setISCENTER(boolean z) {
        this.f6047c = z;
    }

    public void setIsSquare(boolean z) {
        this.f6052h = z;
    }

    public TagContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TagContainerLayout(Context context) {
        this(context, null);
    }
}
