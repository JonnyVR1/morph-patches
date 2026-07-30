package p151v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import p153l.hhc0;
import p153l.nkl0;
import p153l.o8c0;
import p153l.qa00;
import p153l.u610;
import p153l.wg3;
import p153l.wtq0;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VPagerCircleIndicator extends View implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public float f210157a;

    /* JADX INFO: renamed from: b */
    public final Paint f210158b;

    /* JADX INFO: renamed from: c */
    public final Paint f210159c;

    /* JADX INFO: renamed from: d */
    public final Paint f210160d;

    /* JADX INFO: renamed from: e */
    public ViewPager f210161e;

    /* JADX INFO: renamed from: f */
    public ViewPager.InterfaceC0718j f210162f;

    /* JADX INFO: renamed from: g */
    public int f210163g;

    /* JADX INFO: renamed from: h */
    public int f210164h;

    /* JADX INFO: renamed from: i */
    public float f210165i;

    /* JADX INFO: renamed from: j */
    public int f210166j;

    /* JADX INFO: renamed from: k */
    public int f210167k;

    /* JADX INFO: renamed from: l */
    public boolean f210168l;

    /* JADX INFO: renamed from: m */
    public boolean f210169m;

    /* JADX INFO: renamed from: n */
    public boolean f210170n;

    /* JADX INFO: renamed from: o */
    public float f210171o;

    /* JADX INFO: renamed from: p */
    public int f210172p;

    /* JADX INFO: renamed from: q */
    public float f210173q;

    /* JADX INFO: renamed from: r */
    public int f210174r;

    /* JADX INFO: renamed from: s */
    public boolean f210175s;

    public VPagerCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f210158b = paint;
        Paint paint2 = new Paint(1);
        this.f210159c = paint2;
        Paint paint3 = new Paint(1);
        this.f210160d = paint3;
        this.f210173q = -1.0f;
        this.f210174r = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(z8c0.f203357r);
        int color2 = resources.getColor(z8c0.f203359t);
        float fM175859d = qa00.m175859d(3.5f);
        float f = qa00.f156321h;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109757j, i, 0);
        this.f210168l = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109778m, true);
        this.f210167k = typedArrayObtainStyledAttributes.getInt(hhc0.f109764k, 0);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(hhc0.f109806q, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(hhc0.f109827t, -1));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(hhc0.f109834u, 0.0f));
        paint3.setStyle(style);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(hhc0.f109792o, color2));
        this.f210157a = typedArrayObtainStyledAttributes.getDimension(hhc0.f109813r, fM175859d);
        this.f210169m = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109820s, true);
        this.f210170n = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109785n, true);
        this.f210171o = typedArrayObtainStyledAttributes.getDimension(hhc0.f109799p, f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(hhc0.f109771l);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f210172p = nkl0.m163648j(ViewConfiguration.get(context));
    }

    /* JADX INFO: renamed from: a */
    public final int m224387a(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.f210161e) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (count * 2 * this.f210157a) + ((count - 1) * this.f210171o) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    /* JADX INFO: renamed from: b */
    public final int m224388b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f210157a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* JADX INFO: renamed from: c */
    public void m224389c(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public int getFillColor() {
        return this.f210160d.getColor();
    }

    public int getOrientation() {
        return this.f210167k;
    }

    public int getPageColor() {
        return this.f210158b.getColor();
    }

    public float getRadius() {
        return this.f210157a;
    }

    public int getStrokeColor() {
        return this.f210159c.getColor();
    }

    public float getStrokeWidth() {
        return this.f210159c.getStrokeWidth();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        float f2;
        super.onDraw(canvas);
        ViewPager viewPager = this.f210161e;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f210163g >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.f210167k == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float strokeWidth = this.f210157a;
        float f3 = (strokeWidth * 2.0f) + this.f210171o;
        float f4 = paddingLeft + strokeWidth;
        float f5 = paddingTop + strokeWidth;
        if (this.f210168l) {
            f5 += ((((height - paddingTop) - paddingBottom) - ((count - 1) * f3)) - (strokeWidth * 2.0f)) / 2.0f;
        }
        if (this.f210159c.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.f210159c.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < count; i++) {
            float f6 = (i * f3) + f5;
            if (this.f210167k == 0) {
                f2 = f4;
            } else {
                f2 = f6;
                f6 = f4;
            }
            if (this.f210158b.getAlpha() > 0) {
                canvas.drawCircle(f6, f2, strokeWidth, this.f210158b);
            }
            float f7 = this.f210157a;
            if (strokeWidth != f7) {
                canvas.drawCircle(f6, f2, f7, this.f210159c);
            }
        }
        boolean z = this.f210169m;
        float f8 = (z ? this.f210164h : this.f210163g) * f3;
        if (!z) {
            f8 += this.f210165i * f3;
        }
        if (this.f210167k == 0) {
            float f9 = f5 + f8;
            f = f4;
            f4 = f9;
        } else {
            f = f5 + f8;
        }
        canvas.drawCircle(f4, f, this.f210157a, this.f210160d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f210167k == 0) {
            setMeasuredDimension(m224387a(i), m224388b(i2));
        } else {
            setMeasuredDimension(m224388b(i), m224387a(i2));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
        this.f210166j = i;
        ViewPager.InterfaceC0718j interfaceC0718j = this.f210162f;
        if (interfaceC0718j != null) {
            interfaceC0718j.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
        this.f210163g = i;
        this.f210165i = f;
        invalidate();
        ViewPager.InterfaceC0718j interfaceC0718j = this.f210162f;
        if (interfaceC0718j != null) {
            interfaceC0718j.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        if (this.f210169m || this.f210166j == 0) {
            this.f210163g = i;
            this.f210164h = i;
            invalidate();
        }
        ViewPager.InterfaceC0718j interfaceC0718j = this.f210162f;
        if (interfaceC0718j != null) {
            interfaceC0718j.onPageSelected(i);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.currentPage;
        this.f210163g = i;
        this.f210164h = i;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.f210163g;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int count;
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f210161e;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f210174r = u610.m194644d(motionEvent, 0);
            this.f210173q = motionEvent.getX();
        } else if (action == 1) {
            if (!this.f210175s && this.f210170n) {
                count = this.f210161e.getAdapter().getCount();
                float width = getWidth();
                float f = width / 2.0f;
                float f2 = width / 6.0f;
                if (this.f210163g <= 0 && motionEvent.getX() < f - f2) {
                    if (action != 3) {
                        this.f210161e.setCurrentItem(this.f210163g - 1);
                    }
                    return true;
                }
                if (this.f210163g < count - 1 && motionEvent.getX() > f + f2) {
                    if (action != 3) {
                        this.f210161e.setCurrentItem(this.f210163g + 1);
                    }
                    return true;
                }
            }
            this.f210175s = false;
            this.f210174r = -1;
            if (this.f210161e.m4170C()) {
                this.f210161e.m4194s();
            }
        } else if (action == 2) {
            float fM194645e = u610.m194645e(motionEvent, u610.m194641a(motionEvent, this.f210174r));
            float f3 = fM194645e - this.f210173q;
            if (!this.f210175s && Math.abs(f3) > this.f210172p) {
                this.f210175s = true;
            }
            if (this.f210175s) {
                this.f210173q = fM194645e;
                if (this.f210161e.m4170C() || this.f210161e.m4189f()) {
                    this.f210161e.m4196u(f3);
                }
            }
        } else if (action == 3) {
            if (!this.f210175s) {
                count = this.f210161e.getAdapter().getCount();
                float width2 = getWidth();
                float f4 = width2 / 2.0f;
                float f5 = width2 / 6.0f;
                if (this.f210163g <= 0) {
                }
                if (this.f210163g < count - 1) {
                    if (action != 3) {
                        this.f210161e.setCurrentItem(this.f210163g + 1);
                    }
                    return true;
                }
            }
            this.f210175s = false;
            this.f210174r = -1;
            if (this.f210161e.m4170C()) {
                this.f210161e.m4194s();
            }
        } else if (action == 5) {
            int iM194642b = u610.m194642b(motionEvent);
            this.f210173q = u610.m194645e(motionEvent, iM194642b);
            this.f210174r = u610.m194644d(motionEvent, iM194642b);
        } else if (action == 6) {
            int iM194642b2 = u610.m194642b(motionEvent);
            if (u610.m194644d(motionEvent, iM194642b2) == this.f210174r) {
                this.f210174r = u610.m194644d(motionEvent, iM194642b2 == 0 ? 1 : 0);
            }
            this.f210173q = u610.m194645e(motionEvent, u610.m194641a(motionEvent, this.f210174r));
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.f210168l = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f210161e;
        if (viewPager == null) {
            wtq0.m207906a("ViewPager has not been bound.");
            return;
        }
        viewPager.setCurrentItem(i);
        this.f210163g = this.f210161e.getCurrentItem();
        this.f210164h = i;
        invalidate();
    }

    public void setFillColor(int i) {
        this.f210160d.setColor(i);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0718j interfaceC0718j) {
        this.f210162f = interfaceC0718j;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            wg3.m206174a("Orientation must be either HORIZONTAL or VERTICAL.");
        } else {
            this.f210167k = i;
            requestLayout();
        }
    }

    public void setPageColor(int i) {
        this.f210158b.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.f210157a = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.f210169m = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f210159c.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f210159c.setStrokeWidth(f);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f210161e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.m4177P(this);
        }
        if (viewPager.getAdapter() == null) {
            wtq0.m207906a("ViewPager does not have adapter instance.");
            return;
        }
        this.f210161e = viewPager;
        viewPager.m4187d(this);
        invalidate();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C22670a();
        int currentPage;

        /* JADX INFO: renamed from: v.VPagerCircleIndicator$SavedState$a */
        public class C22670a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPage);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public VPagerCircleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o8c0.f145402l);
    }

    public VPagerCircleIndicator(Context context) {
        this(context, null);
    }
}
