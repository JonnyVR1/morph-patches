package p147v;

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
import p149l.b9c0;
import p149l.ig3;
import p149l.j0c0;
import p149l.jbl0;
import p149l.ky00;
import p149l.qkq0;
import p149l.t0c0;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class VPagerCircleIndicator extends View implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public float f209235a;

    /* JADX INFO: renamed from: b */
    public final Paint f209236b;

    /* JADX INFO: renamed from: c */
    public final Paint f209237c;

    /* JADX INFO: renamed from: d */
    public final Paint f209238d;

    /* JADX INFO: renamed from: e */
    public ViewPager f209239e;

    /* JADX INFO: renamed from: f */
    public ViewPager.InterfaceC0716j f209240f;

    /* JADX INFO: renamed from: g */
    public int f209241g;

    /* JADX INFO: renamed from: h */
    public int f209242h;

    /* JADX INFO: renamed from: i */
    public float f209243i;

    /* JADX INFO: renamed from: j */
    public int f209244j;

    /* JADX INFO: renamed from: k */
    public int f209245k;

    /* JADX INFO: renamed from: l */
    public boolean f209246l;

    /* JADX INFO: renamed from: m */
    public boolean f209247m;

    /* JADX INFO: renamed from: n */
    public boolean f209248n;

    /* JADX INFO: renamed from: o */
    public float f209249o;

    /* JADX INFO: renamed from: p */
    public int f209250p;

    /* JADX INFO: renamed from: q */
    public float f209251q;

    /* JADX INFO: renamed from: r */
    public int f209252r;

    /* JADX INFO: renamed from: s */
    public boolean f209253s;

    public VPagerCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f209236b = paint;
        Paint paint2 = new Paint(1);
        this.f209237c = paint2;
        Paint paint3 = new Paint(1);
        this.f209238d = paint3;
        this.f209251q = -1.0f;
        this.f209252r = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(t0c0.f167166r);
        int color2 = resources.getColor(t0c0.f167168t);
        float fM186890d = t100.m186890d(3.5f);
        float f = t100.f167259h;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74448j, i, 0);
        this.f209246l = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74469m, true);
        this.f209245k = typedArrayObtainStyledAttributes.getInt(b9c0.f74455k, 0);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(b9c0.f74497q, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(b9c0.f74518t, -1));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(b9c0.f74525u, 0.0f));
        paint3.setStyle(style);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(b9c0.f74483o, color2));
        this.f209235a = typedArrayObtainStyledAttributes.getDimension(b9c0.f74504r, fM186890d);
        this.f209247m = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74511s, true);
        this.f209248n = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74476n, true);
        this.f209249o = typedArrayObtainStyledAttributes.getDimension(b9c0.f74490p, f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b9c0.f74462l);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f209250p = jbl0.m140793j(ViewConfiguration.get(context));
    }

    /* JADX INFO: renamed from: a */
    public final int m223141a(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.f209239e) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (count * 2 * this.f209235a) + ((count - 1) * this.f209249o) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    /* JADX INFO: renamed from: b */
    public final int m223142b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f209235a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* JADX INFO: renamed from: c */
    public void m223143c(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public int getFillColor() {
        return this.f209238d.getColor();
    }

    public int getOrientation() {
        return this.f209245k;
    }

    public int getPageColor() {
        return this.f209236b.getColor();
    }

    public float getRadius() {
        return this.f209235a;
    }

    public int getStrokeColor() {
        return this.f209237c.getColor();
    }

    public float getStrokeWidth() {
        return this.f209237c.getStrokeWidth();
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
        ViewPager viewPager = this.f209239e;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f209241g >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.f209245k == 0) {
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
        float strokeWidth = this.f209235a;
        float f3 = (strokeWidth * 2.0f) + this.f209249o;
        float f4 = paddingLeft + strokeWidth;
        float f5 = paddingTop + strokeWidth;
        if (this.f209246l) {
            f5 += ((((height - paddingTop) - paddingBottom) - ((count - 1) * f3)) - (strokeWidth * 2.0f)) / 2.0f;
        }
        if (this.f209237c.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.f209237c.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < count; i++) {
            float f6 = (i * f3) + f5;
            if (this.f209245k == 0) {
                f2 = f4;
            } else {
                f2 = f6;
                f6 = f4;
            }
            if (this.f209236b.getAlpha() > 0) {
                canvas.drawCircle(f6, f2, strokeWidth, this.f209236b);
            }
            float f7 = this.f209235a;
            if (strokeWidth != f7) {
                canvas.drawCircle(f6, f2, f7, this.f209237c);
            }
        }
        boolean z = this.f209247m;
        float f8 = (z ? this.f209242h : this.f209241g) * f3;
        if (!z) {
            f8 += this.f209243i * f3;
        }
        if (this.f209245k == 0) {
            float f9 = f5 + f8;
            f = f4;
            f4 = f9;
        } else {
            f = f5 + f8;
        }
        canvas.drawCircle(f4, f, this.f209235a, this.f209238d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f209245k == 0) {
            setMeasuredDimension(m223141a(i), m223142b(i2));
        } else {
            setMeasuredDimension(m223142b(i), m223141a(i2));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
        this.f209244j = i;
        ViewPager.InterfaceC0716j interfaceC0716j = this.f209240f;
        if (interfaceC0716j != null) {
            interfaceC0716j.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
        this.f209241g = i;
        this.f209243i = f;
        invalidate();
        ViewPager.InterfaceC0716j interfaceC0716j = this.f209240f;
        if (interfaceC0716j != null) {
            interfaceC0716j.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        if (this.f209247m || this.f209244j == 0) {
            this.f209241g = i;
            this.f209242h = i;
            invalidate();
        }
        ViewPager.InterfaceC0716j interfaceC0716j = this.f209240f;
        if (interfaceC0716j != null) {
            interfaceC0716j.onPageSelected(i);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.currentPage;
        this.f209241g = i;
        this.f209242h = i;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.f209241g;
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
        ViewPager viewPager = this.f209239e;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f209252r = ky00.m147818d(motionEvent, 0);
            this.f209251q = motionEvent.getX();
        } else if (action == 1) {
            if (!this.f209253s && this.f209248n) {
                count = this.f209239e.getAdapter().getCount();
                float width = getWidth();
                float f = width / 2.0f;
                float f2 = width / 6.0f;
                if (this.f209241g <= 0 && motionEvent.getX() < f - f2) {
                    if (action != 3) {
                        this.f209239e.setCurrentItem(this.f209241g - 1);
                    }
                    return true;
                }
                if (this.f209241g < count - 1 && motionEvent.getX() > f + f2) {
                    if (action != 3) {
                        this.f209239e.setCurrentItem(this.f209241g + 1);
                    }
                    return true;
                }
            }
            this.f209253s = false;
            this.f209252r = -1;
            if (this.f209239e.m4168C()) {
                this.f209239e.m4192s();
            }
        } else if (action == 2) {
            float fM147819e = ky00.m147819e(motionEvent, ky00.m147815a(motionEvent, this.f209252r));
            float f3 = fM147819e - this.f209251q;
            if (!this.f209253s && Math.abs(f3) > this.f209250p) {
                this.f209253s = true;
            }
            if (this.f209253s) {
                this.f209251q = fM147819e;
                if (this.f209239e.m4168C() || this.f209239e.m4187f()) {
                    this.f209239e.m4194u(f3);
                }
            }
        } else if (action == 3) {
            if (!this.f209253s) {
                count = this.f209239e.getAdapter().getCount();
                float width2 = getWidth();
                float f4 = width2 / 2.0f;
                float f5 = width2 / 6.0f;
                if (this.f209241g <= 0) {
                }
                if (this.f209241g < count - 1) {
                    if (action != 3) {
                        this.f209239e.setCurrentItem(this.f209241g + 1);
                    }
                    return true;
                }
            }
            this.f209253s = false;
            this.f209252r = -1;
            if (this.f209239e.m4168C()) {
                this.f209239e.m4192s();
            }
        } else if (action == 5) {
            int iM147816b = ky00.m147816b(motionEvent);
            this.f209251q = ky00.m147819e(motionEvent, iM147816b);
            this.f209252r = ky00.m147818d(motionEvent, iM147816b);
        } else if (action == 6) {
            int iM147816b2 = ky00.m147816b(motionEvent);
            if (ky00.m147818d(motionEvent, iM147816b2) == this.f209252r) {
                this.f209252r = ky00.m147818d(motionEvent, iM147816b2 == 0 ? 1 : 0);
            }
            this.f209251q = ky00.m147819e(motionEvent, ky00.m147815a(motionEvent, this.f209252r));
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.f209246l = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f209239e;
        if (viewPager == null) {
            qkq0.m175383a("ViewPager has not been bound.");
            return;
        }
        viewPager.setCurrentItem(i);
        this.f209241g = this.f209239e.getCurrentItem();
        this.f209242h = i;
        invalidate();
    }

    public void setFillColor(int i) {
        this.f209238d.setColor(i);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0716j interfaceC0716j) {
        this.f209240f = interfaceC0716j;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            ig3.m135964a("Orientation must be either HORIZONTAL or VERTICAL.");
        } else {
            this.f209245k = i;
            requestLayout();
        }
    }

    public void setPageColor(int i) {
        this.f209236b.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.f209235a = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.f209247m = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f209237c.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f209237c.setStrokeWidth(f);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f209239e;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.m4175P(this);
        }
        if (viewPager.getAdapter() == null) {
            qkq0.m175383a("ViewPager does not have adapter instance.");
            return;
        }
        this.f209239e = viewPager;
        viewPager.m4185d(this);
        invalidate();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C22555a();
        int currentPage;

        /* JADX INFO: renamed from: v.VPagerCircleIndicator$SavedState$a */
        public class C22555a implements Parcelable.Creator<SavedState> {
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
        this(context, attributeSet, j0c0.f115668l);
    }

    public VPagerCircleIndicator(Context context) {
        this(context, null);
    }
}
