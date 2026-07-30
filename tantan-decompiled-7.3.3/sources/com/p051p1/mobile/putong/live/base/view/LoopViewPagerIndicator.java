package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
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
import p153l.hhc0;
import p153l.nkl0;
import p153l.o8c0;
import p153l.u610;
import p153l.v5w;
import p153l.wtq0;

/* JADX INFO: loaded from: classes13.dex */
public class LoopViewPagerIndicator extends View implements LoopViewPager.InterfaceC12642b {

    /* JADX INFO: renamed from: a */
    public float f45621a;

    /* JADX INFO: renamed from: b */
    public final Paint f45622b;

    /* JADX INFO: renamed from: c */
    public final Paint f45623c;

    /* JADX INFO: renamed from: d */
    public final Paint f45624d;

    /* JADX INFO: renamed from: e */
    public LoopViewPager f45625e;

    /* JADX INFO: renamed from: f */
    public int f45626f;

    /* JADX INFO: renamed from: g */
    public int f45627g;

    /* JADX INFO: renamed from: h */
    public int f45628h;

    /* JADX INFO: renamed from: i */
    public boolean f45629i;

    /* JADX INFO: renamed from: j */
    public boolean f45630j;

    /* JADX INFO: renamed from: k */
    public boolean f45631k;

    /* JADX INFO: renamed from: l */
    public int f45632l;

    /* JADX INFO: renamed from: m */
    public float f45633m;

    /* JADX INFO: renamed from: n */
    public int f45634n;

    /* JADX INFO: renamed from: o */
    public boolean f45635o;

    public LoopViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f45622b = paint;
        Paint paint2 = new Paint(1);
        this.f45623c = paint2;
        Paint paint3 = new Paint(1);
        this.f45624d = paint3;
        this.f45630j = true;
        this.f45633m = -1.0f;
        this.f45634n = -1;
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109757j, i, 0);
        this.f45629i = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109778m, true);
        this.f45628h = typedArrayObtainStyledAttributes.getInt(hhc0.f109764k, 0);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(hhc0.f109806q, 0));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(hhc0.f109827t, -1));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(hhc0.f109834u, 0.0f));
        paint3.setStyle(style);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(hhc0.f109792o, -1));
        this.f45621a = typedArrayObtainStyledAttributes.getDimension(hhc0.f109813r, 100.0f);
        this.f45631k = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109785n, true);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(hhc0.f109771l);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f45632l = nkl0.m163648j(ViewConfiguration.get(context));
    }

    @Override // com.p051p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12642b
    /* JADX INFO: renamed from: a */
    public void mo69991a(int i) {
        this.f45626f = i;
        invalidate();
    }

    @Override // com.p051p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12642b
    /* JADX INFO: renamed from: b */
    public void mo69992b(int i) {
        this.f45626f = i;
        this.f45627g = i;
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final int m69993c(int i) {
        LoopViewPager loopViewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (loopViewPager = this.f45625e) == null) {
            return size;
        }
        int count = loopViewPager.getAdapter().getCount();
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        float f = this.f45621a;
        int i2 = (int) (paddingLeft + (count * 2 * f) + ((count - 1) * f * 2.0f) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    /* JADX INFO: renamed from: d */
    public final int m69994d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f45621a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* JADX INFO: renamed from: e */
    public void m69995e(LoopViewPager loopViewPager, int i) {
        setViewPager(loopViewPager);
        setCurrentItem(i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int indicatorCount;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        float f2;
        super.onDraw(canvas);
        LoopViewPager loopViewPager = this.f45625e;
        if (loopViewPager == null || loopViewPager.getAdapter() == null || !(this.f45625e.getAdapter() instanceof v5w) || (indicatorCount = this.f45625e.getIndicatorCount()) == 0) {
            return;
        }
        if (this.f45626f >= indicatorCount) {
            setCurrentItem(indicatorCount - 1);
            return;
        }
        if (this.f45628h == 0) {
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
        float strokeWidth = this.f45621a;
        float f3 = 4.0f * strokeWidth;
        float f4 = paddingLeft + strokeWidth;
        float f5 = paddingTop + strokeWidth;
        if (this.f45629i) {
            f5 += ((((height - paddingTop) - paddingBottom) - ((indicatorCount - 1) * f3)) - (strokeWidth * 2.0f)) / 2.0f;
        }
        if (this.f45623c.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.f45623c.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < indicatorCount; i++) {
            float f6 = (i * f3) + f5;
            if (this.f45628h == 0) {
                f2 = f4;
            } else {
                f2 = f6;
                f6 = f4;
            }
            if (this.f45622b.getAlpha() > 0) {
                canvas.drawCircle(f6, f2, strokeWidth, this.f45622b);
            }
            float f7 = this.f45621a;
            if (strokeWidth != f7) {
                canvas.drawCircle(f6, f2, f7, this.f45623c);
            }
        }
        float f8 = this.f45627g * f3;
        if (this.f45628h == 0) {
            float f9 = f5 + f8;
            f = f4;
            f4 = f9;
        } else {
            f = f5 + f8;
        }
        canvas.drawCircle(f4, f, this.f45621a, this.f45624d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f45628h == 0) {
            setMeasuredDimension(m69993c(i), m69994d(i2));
        } else {
            setMeasuredDimension(m69994d(i), m69993c(i2));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.currentPage;
        this.f45626f = i;
        this.f45627g = i;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.f45626f;
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
        LoopViewPager loopViewPager = this.f45625e;
        if (loopViewPager == null || loopViewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f45634n = u610.m194644d(motionEvent, 0);
            this.f45633m = motionEvent.getX();
        } else if (action == 1) {
            if (!this.f45635o && this.f45631k) {
                count = this.f45625e.getAdapter().getCount();
                float width = getWidth();
                float f = width / 2.0f;
                float f2 = width / 6.0f;
                if (this.f45626f <= 0 && motionEvent.getX() < f - f2) {
                    if (action != 3) {
                        this.f45625e.setCurrentItem(this.f45626f - 1);
                    }
                    return true;
                }
                if (this.f45626f < count - 1 && motionEvent.getX() > f + f2) {
                    if (action != 3) {
                        this.f45625e.setCurrentItem(this.f45626f + 1);
                    }
                    return true;
                }
            }
            this.f45635o = false;
            this.f45634n = -1;
            if (this.f45625e.m4170C()) {
                this.f45625e.m4194s();
            }
        } else if (action == 2) {
            float fM194645e = u610.m194645e(motionEvent, u610.m194641a(motionEvent, this.f45634n));
            float f3 = fM194645e - this.f45633m;
            if (!this.f45635o && Math.abs(f3) > this.f45632l) {
                this.f45635o = true;
            }
            if (this.f45635o) {
                this.f45633m = fM194645e;
                if (this.f45625e.m4170C() || this.f45625e.m4189f()) {
                    this.f45625e.m4196u(f3);
                }
            }
        } else if (action == 3) {
            if (!this.f45635o) {
                count = this.f45625e.getAdapter().getCount();
                float width2 = getWidth();
                float f4 = width2 / 2.0f;
                float f5 = width2 / 6.0f;
                if (this.f45626f <= 0) {
                }
                if (this.f45626f < count - 1) {
                    if (action != 3) {
                        this.f45625e.setCurrentItem(this.f45626f + 1);
                    }
                    return true;
                }
            }
            this.f45635o = false;
            this.f45634n = -1;
            if (this.f45625e.m4170C()) {
                this.f45625e.m4194s();
            }
        } else if (action == 5) {
            int iM194642b = u610.m194642b(motionEvent);
            this.f45633m = u610.m194645e(motionEvent, iM194642b);
            this.f45634n = u610.m194644d(motionEvent, iM194642b);
        } else if (action == 6) {
            int iM194642b2 = u610.m194642b(motionEvent);
            if (u610.m194644d(motionEvent, iM194642b2) == this.f45634n) {
                this.f45634n = u610.m194644d(motionEvent, iM194642b2 == 0 ? 1 : 0);
            }
            this.f45633m = u610.m194645e(motionEvent, u610.m194641a(motionEvent, this.f45634n));
        }
        return true;
    }

    public void setCurrentItem(int i) {
        LoopViewPager loopViewPager = this.f45625e;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            wtq0.m207906a("ViewPager has not been bound.");
            return;
        }
        this.f45625e.m69987l0(i);
        this.f45626f = i;
        this.f45627g = i;
        requestLayout();
    }

    public void setViewPager(LoopViewPager loopViewPager) {
        LoopViewPager loopViewPager2 = this.f45625e;
        if (loopViewPager2 == loopViewPager) {
            return;
        }
        if (loopViewPager2 != null) {
            loopViewPager2.setOnPageChangeListener(null);
        }
        if (loopViewPager.getAdapter() == null) {
            wtq0.m207906a("ViewPager does not have adapter instance.");
            return;
        }
        this.f45625e = loopViewPager;
        loopViewPager.setIndicatorPageChangeListener(this);
        invalidate();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C12644a();
        int currentPage;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoopViewPagerIndicator$SavedState$a */
        public class C12644a implements Parcelable.Creator<SavedState> {
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

    public LoopViewPagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o8c0.f145402l);
    }

    public LoopViewPagerIndicator(Context context) {
        this(context, null);
    }
}
