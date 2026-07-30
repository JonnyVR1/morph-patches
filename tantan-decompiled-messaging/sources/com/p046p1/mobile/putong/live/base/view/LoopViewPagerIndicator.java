package com.p046p1.mobile.putong.live.base.view;

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
import p149l.b9c0;
import p149l.j0c0;
import p149l.jbl0;
import p149l.ky00;
import p149l.qkq0;
import p149l.x3w;

/* JADX INFO: loaded from: classes13.dex */
public class LoopViewPagerIndicator extends View implements LoopViewPager.InterfaceC12479b {

    /* JADX INFO: renamed from: a */
    public float f44773a;

    /* JADX INFO: renamed from: b */
    public final Paint f44774b;

    /* JADX INFO: renamed from: c */
    public final Paint f44775c;

    /* JADX INFO: renamed from: d */
    public final Paint f44776d;

    /* JADX INFO: renamed from: e */
    public LoopViewPager f44777e;

    /* JADX INFO: renamed from: f */
    public int f44778f;

    /* JADX INFO: renamed from: g */
    public int f44779g;

    /* JADX INFO: renamed from: h */
    public int f44780h;

    /* JADX INFO: renamed from: i */
    public boolean f44781i;

    /* JADX INFO: renamed from: j */
    public boolean f44782j;

    /* JADX INFO: renamed from: k */
    public boolean f44783k;

    /* JADX INFO: renamed from: l */
    public int f44784l;

    /* JADX INFO: renamed from: m */
    public float f44785m;

    /* JADX INFO: renamed from: n */
    public int f44786n;

    /* JADX INFO: renamed from: o */
    public boolean f44787o;

    public LoopViewPagerIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f44774b = paint;
        Paint paint2 = new Paint(1);
        this.f44775c = paint2;
        Paint paint3 = new Paint(1);
        this.f44776d = paint3;
        this.f44782j = true;
        this.f44785m = -1.0f;
        this.f44786n = -1;
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74448j, i, 0);
        this.f44781i = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74469m, true);
        this.f44780h = typedArrayObtainStyledAttributes.getInt(b9c0.f74455k, 0);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(b9c0.f74497q, 0));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(b9c0.f74518t, -1));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(b9c0.f74525u, 0.0f));
        paint3.setStyle(style);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(b9c0.f74483o, -1));
        this.f44773a = typedArrayObtainStyledAttributes.getDimension(b9c0.f74504r, 100.0f);
        this.f44783k = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74476n, true);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b9c0.f74462l);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f44784l = jbl0.m140793j(ViewConfiguration.get(context));
    }

    @Override // com.p046p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12479b
    /* JADX INFO: renamed from: a */
    public void mo68808a(int i) {
        this.f44778f = i;
        invalidate();
    }

    @Override // com.p046p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12479b
    /* JADX INFO: renamed from: b */
    public void mo68809b(int i) {
        this.f44778f = i;
        this.f44779g = i;
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final int m68810c(int i) {
        LoopViewPager loopViewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (loopViewPager = this.f44777e) == null) {
            return size;
        }
        int count = loopViewPager.getAdapter().getCount();
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        float f = this.f44773a;
        int i2 = (int) (paddingLeft + (count * 2 * f) + ((count - 1) * f * 2.0f) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    /* JADX INFO: renamed from: d */
    public final int m68811d(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f44773a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* JADX INFO: renamed from: e */
    public void m68812e(LoopViewPager loopViewPager, int i) {
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
        LoopViewPager loopViewPager = this.f44777e;
        if (loopViewPager == null || loopViewPager.getAdapter() == null || !(this.f44777e.getAdapter() instanceof x3w) || (indicatorCount = this.f44777e.getIndicatorCount()) == 0) {
            return;
        }
        if (this.f44778f >= indicatorCount) {
            setCurrentItem(indicatorCount - 1);
            return;
        }
        if (this.f44780h == 0) {
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
        float strokeWidth = this.f44773a;
        float f3 = 4.0f * strokeWidth;
        float f4 = paddingLeft + strokeWidth;
        float f5 = paddingTop + strokeWidth;
        if (this.f44781i) {
            f5 += ((((height - paddingTop) - paddingBottom) - ((indicatorCount - 1) * f3)) - (strokeWidth * 2.0f)) / 2.0f;
        }
        if (this.f44775c.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.f44775c.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < indicatorCount; i++) {
            float f6 = (i * f3) + f5;
            if (this.f44780h == 0) {
                f2 = f4;
            } else {
                f2 = f6;
                f6 = f4;
            }
            if (this.f44774b.getAlpha() > 0) {
                canvas.drawCircle(f6, f2, strokeWidth, this.f44774b);
            }
            float f7 = this.f44773a;
            if (strokeWidth != f7) {
                canvas.drawCircle(f6, f2, f7, this.f44775c);
            }
        }
        float f8 = this.f44779g * f3;
        if (this.f44780h == 0) {
            float f9 = f5 + f8;
            f = f4;
            f4 = f9;
        } else {
            f = f5 + f8;
        }
        canvas.drawCircle(f4, f, this.f44773a, this.f44776d);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f44780h == 0) {
            setMeasuredDimension(m68810c(i), m68811d(i2));
        } else {
            setMeasuredDimension(m68811d(i), m68810c(i2));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.currentPage;
        this.f44778f = i;
        this.f44779g = i;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.f44778f;
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
        LoopViewPager loopViewPager = this.f44777e;
        if (loopViewPager == null || loopViewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f44786n = ky00.m147818d(motionEvent, 0);
            this.f44785m = motionEvent.getX();
        } else if (action == 1) {
            if (!this.f44787o && this.f44783k) {
                count = this.f44777e.getAdapter().getCount();
                float width = getWidth();
                float f = width / 2.0f;
                float f2 = width / 6.0f;
                if (this.f44778f <= 0 && motionEvent.getX() < f - f2) {
                    if (action != 3) {
                        this.f44777e.setCurrentItem(this.f44778f - 1);
                    }
                    return true;
                }
                if (this.f44778f < count - 1 && motionEvent.getX() > f + f2) {
                    if (action != 3) {
                        this.f44777e.setCurrentItem(this.f44778f + 1);
                    }
                    return true;
                }
            }
            this.f44787o = false;
            this.f44786n = -1;
            if (this.f44777e.m4168C()) {
                this.f44777e.m4192s();
            }
        } else if (action == 2) {
            float fM147819e = ky00.m147819e(motionEvent, ky00.m147815a(motionEvent, this.f44786n));
            float f3 = fM147819e - this.f44785m;
            if (!this.f44787o && Math.abs(f3) > this.f44784l) {
                this.f44787o = true;
            }
            if (this.f44787o) {
                this.f44785m = fM147819e;
                if (this.f44777e.m4168C() || this.f44777e.m4187f()) {
                    this.f44777e.m4194u(f3);
                }
            }
        } else if (action == 3) {
            if (!this.f44787o) {
                count = this.f44777e.getAdapter().getCount();
                float width2 = getWidth();
                float f4 = width2 / 2.0f;
                float f5 = width2 / 6.0f;
                if (this.f44778f <= 0) {
                }
                if (this.f44778f < count - 1) {
                    if (action != 3) {
                        this.f44777e.setCurrentItem(this.f44778f + 1);
                    }
                    return true;
                }
            }
            this.f44787o = false;
            this.f44786n = -1;
            if (this.f44777e.m4168C()) {
                this.f44777e.m4192s();
            }
        } else if (action == 5) {
            int iM147816b = ky00.m147816b(motionEvent);
            this.f44785m = ky00.m147819e(motionEvent, iM147816b);
            this.f44786n = ky00.m147818d(motionEvent, iM147816b);
        } else if (action == 6) {
            int iM147816b2 = ky00.m147816b(motionEvent);
            if (ky00.m147818d(motionEvent, iM147816b2) == this.f44786n) {
                this.f44786n = ky00.m147818d(motionEvent, iM147816b2 == 0 ? 1 : 0);
            }
            this.f44785m = ky00.m147819e(motionEvent, ky00.m147815a(motionEvent, this.f44786n));
        }
        return true;
    }

    public void setCurrentItem(int i) {
        LoopViewPager loopViewPager = this.f44777e;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            qkq0.m175383a("ViewPager has not been bound.");
            return;
        }
        this.f44777e.m68804l0(i);
        this.f44778f = i;
        this.f44779g = i;
        requestLayout();
    }

    public void setViewPager(LoopViewPager loopViewPager) {
        LoopViewPager loopViewPager2 = this.f44777e;
        if (loopViewPager2 == loopViewPager) {
            return;
        }
        if (loopViewPager2 != null) {
            loopViewPager2.setOnPageChangeListener(null);
        }
        if (loopViewPager.getAdapter() == null) {
            qkq0.m175383a("ViewPager does not have adapter instance.");
            return;
        }
        this.f44777e = loopViewPager;
        loopViewPager.setIndicatorPageChangeListener(this);
        invalidate();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C12481a();
        int currentPage;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LoopViewPagerIndicator$SavedState$a */
        public class C12481a implements Parcelable.Creator<SavedState> {
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
        this(context, attributeSet, j0c0.f115668l);
    }

    public LoopViewPagerIndicator(Context context) {
        this(context, null);
    }
}
