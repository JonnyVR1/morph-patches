package com.p000p1.mobile.putong.core.newui.greet.tag;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import l.i9c0;
import p009l.sdm;
import p009l.vtd;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ImTagContainerLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f306a;

    /* JADX INFO: renamed from: b */
    public int f307b;

    /* JADX INFO: renamed from: c */
    public boolean f308c;

    /* JADX INFO: renamed from: d */
    public int f309d;

    /* JADX INFO: renamed from: e */
    public boolean f310e;

    /* JADX INFO: renamed from: f */
    public boolean f311f;

    /* JADX INFO: renamed from: g */
    public boolean f312g;

    /* JADX INFO: renamed from: h */
    public boolean f313h;

    /* JADX INFO: renamed from: i */
    public sdm f314i;

    /* JADX INFO: renamed from: j */
    public final C0011a f315j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.greet.tag.ImTagContainerLayout$a */
    public class C0011a extends DataSetObserver {
        public C0011a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m426a() {
            for (int i = 0; i < ImTagContainerLayout.this.f314i.mo13034a(); i++) {
                ImTagContainerLayout.this.addView(ImTagContainerLayout.this.f314i.mo22103c(ImTagContainerLayout.this, i));
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            m426a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            m426a();
        }
    }

    public ImTagContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f310e = false;
        this.f311f = true;
        this.f312g = false;
        this.f313h = false;
        this.f315j = new C0011a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.r);
        this.f306a = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.t, vtd.m23720a(getContext(), 16.0f));
        this.f307b = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.v, vtd.m23720a(getContext(), 16.0f));
        this.f309d = typedArrayObtainStyledAttributes.getInt(i9c0.s, 3);
        this.f308c = typedArrayObtainStyledAttributes.getBoolean(i9c0.u, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getCOLUMN() {
        return this.f309d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.a(this.f314i)) {
            this.f314i.m22105e();
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
                int i10 = this.f307b;
                int i11 = ((measuredHeight + i10) * i6) + measuredHeight;
                if (i9 > i3 - i || (this.f310e && i7 >= this.f309d)) {
                    i6++;
                    i11 = ((i10 + measuredHeight) * i6) + measuredHeight;
                    i7 = 0;
                    i9 = measuredWidth;
                }
                i7++;
                childAt.layout(i9 - measuredWidth, i11 - measuredHeight, i9, i11);
                i5 = i9 + this.f306a;
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
        if (this.f308c) {
            if (!this.f312g || this.f309d <= 1) {
                int i5 = this.f309d;
                i4 = (size - ((i5 - 1) * this.f306a)) / i5;
            } else {
                i4 = getChildAt(0).getLayoutParams().width;
                int i6 = this.f309d;
                int i7 = (size - (i6 * i4)) / (i6 - 1);
                this.f306a = i7;
                this.f307b = i7;
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), this.f313h ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : this.f311f ? 150 : View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
            }
            int measuredHeight2 = getChildAt(0).getMeasuredHeight();
            int i9 = this.f309d;
            int i10 = (childCount / i9) + (childCount % i9 > 0 ? 1 : 0);
            if (!this.f313h) {
                i4 = measuredHeight2;
            }
            measuredHeight = ((i4 * i10) + (this.f307b * i10)) - 1;
        } else {
            int i11 = 1;
            int i12 = size;
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                int measuredWidth = getChildAt(i14).getMeasuredWidth();
                if (i12 < measuredWidth || (this.f310e && i13 >= this.f309d)) {
                    i11++;
                    i3 = size - measuredWidth;
                    i13 = 1;
                } else {
                    i3 = i12 - measuredWidth;
                    i13++;
                }
                i12 = i3 - this.f306a;
            }
            measuredHeight = (getChildAt(0).getMeasuredHeight() * i11) + (this.f307b * (i11 - (1 ^ (this.f310e ? 1 : 0))));
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public void setAdapter(sdm sdmVar) {
        this.f314i = sdmVar;
        sdmVar.m22104d(this.f315j);
    }

    public void setAutoAdjustSpace(boolean z) {
        this.f312g = z;
    }

    public void setCOLUMN(int i) {
        this.f309d = i;
    }

    public void setCanAdjustChildHeight(boolean z) {
        this.f311f = z;
    }

    public void setColumnLimitWithoutCenter(boolean z) {
        this.f310e = z;
    }

    public void setISCENTER(boolean z) {
        this.f308c = z;
    }

    public void setIsSquare(boolean z) {
        this.f313h = z;
    }

    public ImTagContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImTagContainerLayout(Context context) {
        this(context, null);
    }
}
