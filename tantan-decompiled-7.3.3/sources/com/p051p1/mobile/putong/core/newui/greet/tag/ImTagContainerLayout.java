package com.p051p1.mobile.putong.core.newui.greet.tag;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p153l.igm;
import p153l.jvd;
import p153l.ohc0;

/* JADX INFO: loaded from: classes11.dex */
public class ImTagContainerLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f22270a;

    /* JADX INFO: renamed from: b */
    public int f22271b;

    /* JADX INFO: renamed from: c */
    public boolean f22272c;

    /* JADX INFO: renamed from: d */
    public int f22273d;

    /* JADX INFO: renamed from: e */
    public boolean f22274e;

    /* JADX INFO: renamed from: f */
    public boolean f22275f;

    /* JADX INFO: renamed from: g */
    public boolean f22276g;

    /* JADX INFO: renamed from: h */
    public boolean f22277h;

    /* JADX INFO: renamed from: i */
    public igm f22278i;

    /* JADX INFO: renamed from: j */
    public final C7998a f22279j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.greet.tag.ImTagContainerLayout$a */
    public class C7998a extends DataSetObserver {
        public C7998a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m37500a() {
            for (int i = 0; i < ImTagContainerLayout.this.f22278i.mo139944a(); i++) {
                ImTagContainerLayout.this.addView(ImTagContainerLayout.this.f22278i.mo139946c(ImTagContainerLayout.this, i));
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            m37500a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            m37500a();
        }
    }

    public ImTagContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22274e = false;
        this.f22275f = true;
        this.f22276g = false;
        this.f22277h = false;
        this.f22279j = new C7998a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohc0.f147417r);
        this.f22270a = typedArrayObtainStyledAttributes.getDimensionPixelSize(ohc0.f147421t, jvd.m147011a(getContext(), 16.0f));
        this.f22271b = typedArrayObtainStyledAttributes.getDimensionPixelSize(ohc0.f147425v, jvd.m147011a(getContext(), 16.0f));
        this.f22273d = typedArrayObtainStyledAttributes.getInt(ohc0.f147419s, 3);
        this.f22272c = typedArrayObtainStyledAttributes.getBoolean(ohc0.f147423u, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getCOLUMN() {
        return this.f22273d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f22278i)) {
            this.f22278i.m139948e();
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
                int i10 = this.f22271b;
                int i11 = ((measuredHeight + i10) * i6) + measuredHeight;
                if (i9 > i3 - i || (this.f22274e && i7 >= this.f22273d)) {
                    i6++;
                    i11 = ((i10 + measuredHeight) * i6) + measuredHeight;
                    i7 = 0;
                    i9 = measuredWidth;
                }
                i7++;
                childAt.layout(i9 - measuredWidth, i11 - measuredHeight, i9, i11);
                i5 = i9 + this.f22270a;
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
        if (this.f22272c) {
            if (!this.f22276g || this.f22273d <= 1) {
                int i5 = this.f22273d;
                i4 = (size - ((i5 - 1) * this.f22270a)) / i5;
            } else {
                i4 = getChildAt(0).getLayoutParams().width;
                int i6 = this.f22273d;
                int i7 = (size - (i6 * i4)) / (i6 - 1);
                this.f22270a = i7;
                this.f22271b = i7;
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), this.f22277h ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : this.f22275f ? 150 : View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
            }
            int measuredHeight2 = getChildAt(0).getMeasuredHeight();
            int i9 = this.f22273d;
            int i10 = (childCount / i9) + (childCount % i9 > 0 ? 1 : 0);
            if (!this.f22277h) {
                i4 = measuredHeight2;
            }
            measuredHeight = ((i4 * i10) + (this.f22271b * i10)) - 1;
        } else {
            int i11 = 1;
            int i12 = size;
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                int measuredWidth = getChildAt(i14).getMeasuredWidth();
                if (i12 < measuredWidth || (this.f22274e && i13 >= this.f22273d)) {
                    i11++;
                    i3 = size - measuredWidth;
                    i13 = 1;
                } else {
                    i3 = i12 - measuredWidth;
                    i13++;
                }
                i12 = i3 - this.f22270a;
            }
            measuredHeight = (getChildAt(0).getMeasuredHeight() * i11) + (this.f22271b * (i11 - (1 ^ (this.f22274e ? 1 : 0))));
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public void setAdapter(igm igmVar) {
        this.f22278i = igmVar;
        igmVar.m139947d(this.f22279j);
    }

    public void setAutoAdjustSpace(boolean z) {
        this.f22276g = z;
    }

    public void setCOLUMN(int i) {
        this.f22273d = i;
    }

    public void setCanAdjustChildHeight(boolean z) {
        this.f22275f = z;
    }

    public void setColumnLimitWithoutCenter(boolean z) {
        this.f22274e = z;
    }

    public void setISCENTER(boolean z) {
        this.f22272c = z;
    }

    public void setIsSquare(boolean z) {
        this.f22277h = z;
    }

    public ImTagContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImTagContainerLayout(Context context) {
        this(context, null);
    }
}
