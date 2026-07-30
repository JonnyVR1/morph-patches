package p028v;

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
import l.b9c0;
import l.ig3;
import l.j0c0;
import l.jbl0;
import l.ky00;
import l.qkq0;
import l.t0c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VPagerCircleIndicator extends View implements ViewPager.j {

    /* JADX INFO: renamed from: a */
    public float f12860a;

    /* JADX INFO: renamed from: b */
    public final Paint f12861b;

    /* JADX INFO: renamed from: c */
    public final Paint f12862c;

    /* JADX INFO: renamed from: d */
    public final Paint f12863d;

    /* JADX INFO: renamed from: e */
    public ViewPager f12864e;

    /* JADX INFO: renamed from: f */
    public ViewPager.j f12865f;

    /* JADX INFO: renamed from: g */
    public int f12866g;

    /* JADX INFO: renamed from: h */
    public int f12867h;

    /* JADX INFO: renamed from: i */
    public float f12868i;

    /* JADX INFO: renamed from: j */
    public int f12869j;

    /* JADX INFO: renamed from: k */
    public int f12870k;

    /* JADX INFO: renamed from: l */
    public boolean f12871l;

    /* JADX INFO: renamed from: m */
    public boolean f12872m;

    /* JADX INFO: renamed from: n */
    public boolean f12873n;

    /* JADX INFO: renamed from: o */
    public float f12874o;

    /* JADX INFO: renamed from: p */
    public int f12875p;

    /* JADX INFO: renamed from: q */
    public float f12876q;

    /* JADX INFO: renamed from: r */
    public int f12877r;

    /* JADX INFO: renamed from: s */
    public boolean f12878s;

    public VPagerCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f12861b = paint;
        Paint paint2 = new Paint(1);
        this.f12862c = paint2;
        Paint paint3 = new Paint(1);
        this.f12863d = paint3;
        this.f12876q = -1.0f;
        this.f12877r = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(t0c0.r);
        int color2 = resources.getColor(t0c0.t);
        float fD = t100.d(3.5f);
        float f = t100.h;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.j, i, 0);
        this.f12871l = typedArrayObtainStyledAttributes.getBoolean(b9c0.m, true);
        this.f12870k = typedArrayObtainStyledAttributes.getInt(b9c0.k, 0);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(b9c0.q, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(b9c0.t, -1));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(b9c0.u, 0.0f));
        paint3.setStyle(style);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(b9c0.o, color2));
        this.f12860a = typedArrayObtainStyledAttributes.getDimension(b9c0.r, fD);
        this.f12872m = typedArrayObtainStyledAttributes.getBoolean(b9c0.s, true);
        this.f12873n = typedArrayObtainStyledAttributes.getBoolean(b9c0.n, true);
        this.f12874o = typedArrayObtainStyledAttributes.getDimension(b9c0.p, f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b9c0.l);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f12875p = jbl0.j(ViewConfiguration.get(context));
    }

    /* JADX INFO: renamed from: a */
    public final int m11622a(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.f12864e) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (count * 2 * this.f12860a) + ((count - 1) * this.f12874o) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    /* JADX INFO: renamed from: b */
    public final int m11623b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f12860a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* JADX INFO: renamed from: c */
    public void m11624c(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public int getFillColor() {
        return this.f12863d.getColor();
    }

    public int getOrientation() {
        return this.f12870k;
    }

    public int getPageColor() {
        return this.f12861b.getColor();
    }

    public float getRadius() {
        return this.f12860a;
    }

    public int getStrokeColor() {
        return this.f12862c.getColor();
    }

    public float getStrokeWidth() {
        return this.f12862c.getStrokeWidth();
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
        ViewPager viewPager = this.f12864e;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f12866g >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.f12870k == 0) {
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
        float strokeWidth = this.f12860a;
        float f3 = (strokeWidth * 2.0f) + this.f12874o;
        float f4 = paddingLeft + strokeWidth;
        float f5 = paddingTop + strokeWidth;
        if (this.f12871l) {
            f5 += ((((height - paddingTop) - paddingBottom) - ((count - 1) * f3)) - (strokeWidth * 2.0f)) / 2.0f;
        }
        if (this.f12862c.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.f12862c.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < count; i++) {
            float f6 = (i * f3) + f5;
            if (this.f12870k == 0) {
                f2 = f4;
            } else {
                f2 = f6;
                f6 = f4;
            }
            if (this.f12861b.getAlpha() > 0) {
                canvas.drawCircle(f6, f2, strokeWidth, this.f12861b);
            }
            float f7 = this.f12860a;
            if (strokeWidth != f7) {
                canvas.drawCircle(f6, f2, f7, this.f12862c);
            }
        }
        boolean z = this.f12872m;
        float f8 = (z ? this.f12867h : this.f12866g) * f3;
        if (!z) {
            f8 += this.f12868i * f3;
        }
        if (this.f12870k == 0) {
            float f9 = f5 + f8;
            f = f4;
            f4 = f9;
        } else {
            f = f5 + f8;
        }
        canvas.drawCircle(f4, f, this.f12860a, this.f12863d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f12870k == 0) {
            setMeasuredDimension(m11622a(i), m11623b(i2));
        } else {
            setMeasuredDimension(m11623b(i), m11622a(i2));
        }
    }

    public void onPageScrollStateChanged(int i) {
        this.f12869j = i;
        ViewPager.j jVar = this.f12865f;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.f12866g = i;
        this.f12868i = f;
        invalidate();
        ViewPager.j jVar = this.f12865f;
        if (jVar != null) {
            jVar.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        if (this.f12872m || this.f12869j == 0) {
            this.f12866g = i;
            this.f12867h = i;
            invalidate();
        }
        ViewPager.j jVar = this.f12865f;
        if (jVar != null) {
            jVar.onPageSelected(i);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.currentPage;
        this.f12866g = i;
        this.f12867h = i;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.f12866g;
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
        ViewPager viewPager = this.f12864e;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f12877r = ky00.d(motionEvent, 0);
            this.f12876q = motionEvent.getX();
        } else if (action == 1) {
            if (!this.f12878s && this.f12873n) {
                count = this.f12864e.getAdapter().getCount();
                float width = getWidth();
                float f = width / 2.0f;
                float f2 = width / 6.0f;
                if (this.f12866g <= 0 && motionEvent.getX() < f - f2) {
                    if (action != 3) {
                        this.f12864e.setCurrentItem(this.f12866g - 1);
                    }
                    return true;
                }
                if (this.f12866g < count - 1 && motionEvent.getX() > f + f2) {
                    if (action != 3) {
                        this.f12864e.setCurrentItem(this.f12866g + 1);
                    }
                    return true;
                }
            }
            this.f12878s = false;
            this.f12877r = -1;
            if (this.f12864e.C()) {
                this.f12864e.s();
            }
        } else if (action == 2) {
            float fE = ky00.e(motionEvent, ky00.a(motionEvent, this.f12877r));
            float f3 = fE - this.f12876q;
            if (!this.f12878s && Math.abs(f3) > this.f12875p) {
                this.f12878s = true;
            }
            if (this.f12878s) {
                this.f12876q = fE;
                if (this.f12864e.C() || this.f12864e.f()) {
                    this.f12864e.u(f3);
                }
            }
        } else if (action == 3) {
            if (!this.f12878s) {
                count = this.f12864e.getAdapter().getCount();
                float width2 = getWidth();
                float f4 = width2 / 2.0f;
                float f5 = width2 / 6.0f;
                if (this.f12866g <= 0) {
                }
                if (this.f12866g < count - 1) {
                    if (action != 3) {
                        this.f12864e.setCurrentItem(this.f12866g + 1);
                    }
                    return true;
                }
            }
            this.f12878s = false;
            this.f12877r = -1;
            if (this.f12864e.C()) {
                this.f12864e.s();
            }
        } else if (action == 5) {
            int iB = ky00.b(motionEvent);
            this.f12876q = ky00.e(motionEvent, iB);
            this.f12877r = ky00.d(motionEvent, iB);
        } else if (action == 6) {
            int iB2 = ky00.b(motionEvent);
            if (ky00.d(motionEvent, iB2) == this.f12877r) {
                this.f12877r = ky00.d(motionEvent, iB2 == 0 ? 1 : 0);
            }
            this.f12876q = ky00.e(motionEvent, ky00.a(motionEvent, this.f12877r));
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.f12871l = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f12864e;
        if (viewPager == null) {
            qkq0.a("ViewPager has not been bound.");
            return;
        }
        viewPager.setCurrentItem(i);
        this.f12866g = this.f12864e.getCurrentItem();
        this.f12867h = i;
        invalidate();
    }

    public void setFillColor(int i) {
        this.f12863d.setColor(i);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.f12865f = jVar;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            ig3.a("Orientation must be either HORIZONTAL or VERTICAL.");
        } else {
            this.f12870k = i;
            requestLayout();
        }
    }

    public void setPageColor(int i) {
        this.f12861b.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.f12860a = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.f12872m = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f12862c.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f12862c.setStrokeWidth(f);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f12864e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.P(this);
        }
        if (viewPager.getAdapter() == null) {
            qkq0.a("ViewPager does not have adapter instance.");
            return;
        }
        this.f12864e = viewPager;
        viewPager.d(this);
        invalidate();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1348a();
        int currentPage;

        /* JADX INFO: renamed from: v.VPagerCircleIndicator$SavedState$a */
        public class C1348a implements Parcelable.Creator<SavedState> {
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
        this(context, attributeSet, j0c0.l);
    }

    public VPagerCircleIndicator(Context context) {
        this(context, null);
    }
}
