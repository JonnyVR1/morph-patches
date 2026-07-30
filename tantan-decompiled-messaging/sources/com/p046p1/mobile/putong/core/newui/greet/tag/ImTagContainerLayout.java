package com.p046p1.mobile.putong.core.newui.greet.tag;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p149l.i9c0;
import p149l.sdm;
import p149l.vtd;

/* JADX INFO: loaded from: classes11.dex */
public class ImTagContainerLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f21528a;

    /* JADX INFO: renamed from: b */
    public int f21529b;

    /* JADX INFO: renamed from: c */
    public boolean f21530c;

    /* JADX INFO: renamed from: d */
    public int f21531d;

    /* JADX INFO: renamed from: e */
    public boolean f21532e;

    /* JADX INFO: renamed from: f */
    public boolean f21533f;

    /* JADX INFO: renamed from: g */
    public boolean f21534g;

    /* JADX INFO: renamed from: h */
    public boolean f21535h;

    /* JADX INFO: renamed from: i */
    public sdm f21536i;

    /* JADX INFO: renamed from: j */
    public final C7847a f21537j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.greet.tag.ImTagContainerLayout$a */
    public class C7847a extends DataSetObserver {
        public C7847a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m36497a() {
            for (int i = 0; i < ImTagContainerLayout.this.f21536i.mo110558a(); i++) {
                ImTagContainerLayout.this.addView(ImTagContainerLayout.this.f21536i.mo183507c(ImTagContainerLayout.this, i));
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            m36497a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            m36497a();
        }
    }

    public ImTagContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21532e = false;
        this.f21533f = true;
        this.f21534g = false;
        this.f21535h = false;
        this.f21537j = new C7847a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f112192r);
        this.f21528a = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.f112196t, vtd.m199996a(getContext(), 16.0f));
        this.f21529b = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.f112200v, vtd.m199996a(getContext(), 16.0f));
        this.f21531d = typedArrayObtainStyledAttributes.getInt(i9c0.f112194s, 3);
        this.f21530c = typedArrayObtainStyledAttributes.getBoolean(i9c0.f112198u, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getCOLUMN() {
        return this.f21531d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f21536i)) {
            this.f21536i.m183509e();
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
                int i10 = this.f21529b;
                int i11 = ((measuredHeight + i10) * i6) + measuredHeight;
                if (i9 > i3 - i || (this.f21532e && i7 >= this.f21531d)) {
                    i6++;
                    i11 = ((i10 + measuredHeight) * i6) + measuredHeight;
                    i7 = 0;
                    i9 = measuredWidth;
                }
                i7++;
                childAt.layout(i9 - measuredWidth, i11 - measuredHeight, i9, i11);
                i5 = i9 + this.f21528a;
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
        if (this.f21530c) {
            if (!this.f21534g || this.f21531d <= 1) {
                int i5 = this.f21531d;
                i4 = (size - ((i5 - 1) * this.f21528a)) / i5;
            } else {
                i4 = getChildAt(0).getLayoutParams().width;
                int i6 = this.f21531d;
                int i7 = (size - (i6 * i4)) / (i6 - 1);
                this.f21528a = i7;
                this.f21529b = i7;
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), this.f21535h ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : this.f21533f ? 150 : View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
            }
            int measuredHeight2 = getChildAt(0).getMeasuredHeight();
            int i9 = this.f21531d;
            int i10 = (childCount / i9) + (childCount % i9 > 0 ? 1 : 0);
            if (!this.f21535h) {
                i4 = measuredHeight2;
            }
            measuredHeight = ((i4 * i10) + (this.f21529b * i10)) - 1;
        } else {
            int i11 = 1;
            int i12 = size;
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                int measuredWidth = getChildAt(i14).getMeasuredWidth();
                if (i12 < measuredWidth || (this.f21532e && i13 >= this.f21531d)) {
                    i11++;
                    i3 = size - measuredWidth;
                    i13 = 1;
                } else {
                    i3 = i12 - measuredWidth;
                    i13++;
                }
                i12 = i3 - this.f21528a;
            }
            measuredHeight = (getChildAt(0).getMeasuredHeight() * i11) + (this.f21529b * (i11 - (1 ^ (this.f21532e ? 1 : 0))));
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public void setAdapter(sdm sdmVar) {
        this.f21536i = sdmVar;
        sdmVar.m183508d(this.f21537j);
    }

    public void setAutoAdjustSpace(boolean z) {
        this.f21534g = z;
    }

    public void setCOLUMN(int i) {
        this.f21531d = i;
    }

    public void setCanAdjustChildHeight(boolean z) {
        this.f21533f = z;
    }

    public void setColumnLimitWithoutCenter(boolean z) {
        this.f21532e = z;
    }

    public void setISCENTER(boolean z) {
        this.f21530c = z;
    }

    public void setIsSquare(boolean z) {
        this.f21535h = z;
    }

    public ImTagContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImTagContainerLayout(Context context) {
        this(context, null);
    }
}
