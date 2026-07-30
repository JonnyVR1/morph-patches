package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.jfd0;
import l.k9c0;
import l.lwm;
import l.ura;
import l.vwb;
import l.y1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class WheelPicker extends View implements Runnable {

    /* JADX INFO: renamed from: A */
    public int f2087A;

    /* JADX INFO: renamed from: B */
    public int f2088B;

    /* JADX INFO: renamed from: C */
    public int f2089C;

    /* JADX INFO: renamed from: D */
    public int f2090D;

    /* JADX INFO: renamed from: E */
    public int f2091E;

    /* JADX INFO: renamed from: E0 */
    public boolean f2092E0;

    /* JADX INFO: renamed from: F */
    public int f2093F;

    /* JADX INFO: renamed from: F0 */
    public boolean f2094F0;

    /* JADX INFO: renamed from: G */
    public int f2095G;

    /* JADX INFO: renamed from: G0 */
    public boolean f2096G0;

    /* JADX INFO: renamed from: H */
    public int f2097H;

    /* JADX INFO: renamed from: H0 */
    public boolean f2098H0;

    /* JADX INFO: renamed from: I */
    public int f2099I;

    /* JADX INFO: renamed from: I0 */
    public boolean f2100I0;

    /* JADX INFO: renamed from: J */
    public int f2101J;

    /* JADX INFO: renamed from: K */
    public int f2102K;

    /* JADX INFO: renamed from: L */
    public int f2103L;

    /* JADX INFO: renamed from: M */
    public int f2104M;

    /* JADX INFO: renamed from: N */
    public int f2105N;

    /* JADX INFO: renamed from: O */
    public int f2106O;

    /* JADX INFO: renamed from: P */
    public int f2107P;

    /* JADX INFO: renamed from: Q */
    public int f2108Q;

    /* JADX INFO: renamed from: R */
    public int f2109R;

    /* JADX INFO: renamed from: S */
    public int f2110S;

    /* JADX INFO: renamed from: T */
    public int f2111T;

    /* JADX INFO: renamed from: U */
    public int f2112U;

    /* JADX INFO: renamed from: V */
    public int f2113V;

    /* JADX INFO: renamed from: W */
    public boolean f2114W;

    /* JADX INFO: renamed from: a */
    public final Handler f2115a;

    /* JADX INFO: renamed from: b */
    public Paint f2116b;

    /* JADX INFO: renamed from: c */
    public Scroller f2117c;

    /* JADX INFO: renamed from: d */
    public VelocityTracker f2118d;

    /* JADX INFO: renamed from: e */
    public boolean f2119e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0174a f2120f;

    /* JADX INFO: renamed from: g */
    public Rect f2121g;

    /* JADX INFO: renamed from: h */
    public Rect f2122h;

    /* JADX INFO: renamed from: i */
    public Rect f2123i;

    /* JADX INFO: renamed from: j */
    public Rect f2124j;

    /* JADX INFO: renamed from: k */
    public Rect f2125k;

    /* JADX INFO: renamed from: k0 */
    public boolean f2126k0;

    /* JADX INFO: renamed from: l */
    public Camera f2127l;

    /* JADX INFO: renamed from: m */
    public Matrix f2128m;

    /* JADX INFO: renamed from: n */
    public Matrix f2129n;

    /* JADX INFO: renamed from: o */
    public List f2130o;

    /* JADX INFO: renamed from: p */
    public String f2131p;

    /* JADX INFO: renamed from: p0 */
    public boolean f2132p0;

    /* JADX INFO: renamed from: q */
    public int f2133q;

    /* JADX INFO: renamed from: r */
    public int f2134r;

    /* JADX INFO: renamed from: s */
    public int f2135s;

    /* JADX INFO: renamed from: t */
    public int f2136t;

    /* JADX INFO: renamed from: u */
    public int f2137u;

    /* JADX INFO: renamed from: v */
    public int f2138v;

    /* JADX INFO: renamed from: w */
    public int f2139w;

    /* JADX INFO: renamed from: x */
    public int f2140x;

    /* JADX INFO: renamed from: y */
    public int f2141y;

    /* JADX INFO: renamed from: z */
    public int f2142z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.WheelPicker$a */
    public interface InterfaceC0174a {
        /* JADX INFO: renamed from: a */
        void mo3621a(WheelPicker wheelPicker, Object obj, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.WheelPicker$b */
    public interface InterfaceC0175b {
    }

    public WheelPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2115a = new Handler();
        this.f2130o = new ArrayList();
        this.f2133q = 7;
        this.f2140x = 0;
        this.f2141y = 0;
        this.f2103L = 50;
        this.f2104M = 8000;
        this.f2113V = 8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.Q);
        this.f2133q = typedArrayObtainStyledAttributes.getInt(k9c0.i0, 7);
        this.f2097H = typedArrayObtainStyledAttributes.getInt(k9c0.g0, 0);
        this.f2114W = typedArrayObtainStyledAttributes.getBoolean(k9c0.f0, false);
        this.f2110S = typedArrayObtainStyledAttributes.getInt(k9c0.e0, -1);
        this.f2131p = typedArrayObtainStyledAttributes.getString(k9c0.d0);
        this.f2088B = typedArrayObtainStyledAttributes.getDimensionPixelSize(k9c0.a0, getContext().getResources().getDimensionPixelSize(y1c0.a));
        this.f2089C = typedArrayObtainStyledAttributes.getDimensionPixelSize(k9c0.V, getContext().getResources().getDimensionPixelSize(y1c0.a));
        this.f2140x = typedArrayObtainStyledAttributes.getDimensionPixelSize(k9c0.c0, getContext().getResources().getDimensionPixelSize(y1c0.b));
        this.f2139w = typedArrayObtainStyledAttributes.getColor(k9c0.h0, -14606047);
        this.f2138v = typedArrayObtainStyledAttributes.getColor(k9c0.b0, -7829368);
        this.f2094F0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.X, false);
        this.f2126k0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.Y, false);
        this.f2142z = typedArrayObtainStyledAttributes.getColor(k9c0.Z, -1166541);
        this.f2132p0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.T, false);
        this.f2087A = typedArrayObtainStyledAttributes.getColor(k9c0.U, -1996488705);
        this.f2092E0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.S, false);
        this.f2096G0 = typedArrayObtainStyledAttributes.getBoolean(k9c0.W, false);
        this.f2090D = typedArrayObtainStyledAttributes.getInt(k9c0.R, 0);
        typedArrayObtainStyledAttributes.recycle();
        m3615j();
    }

    /* JADX INFO: renamed from: a */
    public final void m3606a() {
        if (this.f2132p0 || this.f2139w != -1) {
            Rect rect = this.f2124j;
            Rect rect2 = this.f2121g;
            int i = rect2.left;
            int i2 = this.f2106O;
            int i3 = this.f2093F;
            rect.set(i, i2 - i3, rect2.right, i2 + i3);
            Rect rect3 = this.f2125k;
            Rect rect4 = this.f2121g;
            int i4 = rect4.left;
            int i5 = this.f2106O;
            int i6 = this.f2089C;
            rect3.set(i4, i5 - (i6 / 2), rect4.right, i5 + (i6 / 2));
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3607b(int i) {
        return (int) (((double) this.f2095G) - (Math.cos(Math.toRadians(i)) * ((double) this.f2095G)));
    }

    /* JADX INFO: renamed from: c */
    public final int m3608c(int i) {
        if (Math.abs(i) <= this.f2093F) {
            return -i;
        }
        int i2 = this.f2109R;
        int i3 = this.f2091E;
        return i2 < 0 ? (-i3) - i : i3 - i;
    }

    /* JADX INFO: renamed from: d */
    public final void m3609d() {
        int i = this.f2090D;
        if (i == 1) {
            this.f2107P = this.f2121g.left;
        } else if (i != 2) {
            this.f2107P = this.f2105N;
        } else {
            this.f2107P = this.f2121g.right;
        }
        this.f2108Q = (int) (this.f2106O - ((this.f2116b.ascent() + this.f2116b.descent()) / 2.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m3610e() {
        int i = this.f2097H;
        int i2 = this.f2091E;
        int i3 = i * i2;
        this.f2101J = this.f2094F0 ? Integer.MIN_VALUE : ((-i2) * (this.f2130o.size() - 1)) + i3;
        if (this.f2094F0) {
            i3 = Integer.MAX_VALUE;
        }
        this.f2102K = i3;
    }

    /* JADX INFO: renamed from: f */
    public final void m3611f() {
        if (this.f2126k0) {
            int i = this.f2141y / 2;
            int i2 = this.f2106O;
            int i3 = this.f2093F;
            int i4 = i2 + i3;
            int i5 = i2 - i3;
            Rect rect = this.f2122h;
            Rect rect2 = this.f2121g;
            rect.set(rect2.left, i4 - i, rect2.right, i4 + i);
            Rect rect3 = this.f2123i;
            Rect rect4 = this.f2121g;
            rect3.set(rect4.left, i5 - i, rect4.right, i5 + i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m3612g(int i) {
        return (int) (Math.sin(Math.toRadians(i)) * ((double) this.f2095G));
    }

    public int getCurrentItemPosition() {
        return this.f2099I;
    }

    public int getCurtainColor() {
        return this.f2087A;
    }

    public List getData() {
        return this.f2130o;
    }

    public int getIndicatorColor() {
        return this.f2142z;
    }

    public int getIndicatorSize() {
        return this.f2141y;
    }

    public int getItemAlign() {
        return this.f2090D;
    }

    public int getItemSpace() {
        return this.f2088B;
    }

    public int getItemTextColor() {
        return this.f2138v;
    }

    public int getItemTextSize() {
        return this.f2140x;
    }

    public String getMaximumWidthText() {
        return this.f2131p;
    }

    public int getMaximumWidthTextPosition() {
        return this.f2110S;
    }

    public Object getSelectItem() {
        return this.f2130o.get(this.f2099I);
    }

    public int getSelectedItemPosition() {
        return this.f2097H;
    }

    public int getSelectedItemTextColor() {
        return this.f2139w;
    }

    public Typeface getTypeface() {
        Paint paint = this.f2116b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    public int getVisibleItemCount() {
        return this.f2133q;
    }

    /* JADX INFO: renamed from: h */
    public void m3613h() {
        this.f2137u = 0;
        this.f2136t = 0;
        if (vwb.J(this.f2130o)) {
            return;
        }
        if (this.f2114W) {
            this.f2136t = (int) this.f2116b.measureText(String.valueOf(this.f2130o.get(0)));
        } else if (m3616k(this.f2110S)) {
            this.f2136t = (int) this.f2116b.measureText(String.valueOf(this.f2130o.get(this.f2110S)));
        } else if (TextUtils.isEmpty(this.f2131p)) {
            Iterator it = this.f2130o.iterator();
            while (it.hasNext()) {
                this.f2136t = Math.max(this.f2136t, (int) this.f2116b.measureText(String.valueOf(it.next())));
            }
        } else {
            this.f2136t = (int) this.f2116b.measureText(this.f2131p);
        }
        Paint.FontMetrics fontMetrics = this.f2116b.getFontMetrics();
        this.f2137u = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    /* JADX INFO: renamed from: i */
    public final String m3614i(String str) {
        return ((float) getWidth()) < this.f2116b.measureText(str) ? TextUtils.ellipsize(str, new TextPaint(this.f2116b), getWidth(), TextUtils.TruncateAt.END).toString() : str;
    }

    /* JADX INFO: renamed from: j */
    public final void m3615j() {
        m3620o();
        Paint paint = new Paint(69);
        this.f2116b = paint;
        paint.setTextSize(this.f2140x);
        m3619n();
        m3613h();
        this.f2117c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2103L = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2104M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2113V = viewConfiguration.getScaledTouchSlop();
        this.f2121g = new Rect();
        this.f2122h = new Rect();
        this.f2123i = new Rect();
        this.f2124j = new Rect();
        this.f2125k = new Rect();
        this.f2127l = new Camera();
        this.f2128m = new Matrix();
        this.f2129n = new Matrix();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3616k(int i) {
        return i >= 0 && i < this.f2130o.size();
    }

    /* JADX INFO: renamed from: l */
    public final int m3617l(int i, int i2, int i3) {
        if (i == 1073741824) {
            return i2;
        }
        return i == Integer.MIN_VALUE ? Math.min(i3, i2) : i3;
    }

    /* JADX INFO: renamed from: m */
    public void m3618m(int i, boolean z) {
        this.f2119e = false;
        if (!z || !this.f2117c.isFinished()) {
            if (!this.f2117c.isFinished()) {
                this.f2117c.abortAnimation();
            }
            int iMax = Math.max(Math.min(i, this.f2130o.size() - 1), 0);
            this.f2097H = iMax;
            this.f2099I = iMax;
            this.f2109R = 0;
            m3610e();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i2 = i - this.f2099I;
        if (i2 == 0) {
            return;
        }
        if (this.f2094F0 && Math.abs(i2) > size / 2) {
            if (i2 > 0) {
                size = -size;
            }
            i2 += size;
        }
        Scroller scroller = this.f2117c;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i2) * this.f2091E);
        this.f2115a.post(this);
    }

    /* JADX INFO: renamed from: n */
    public void m3619n() {
        int i = this.f2090D;
        if (i == 1) {
            this.f2116b.setTextAlign(Paint.Align.LEFT);
            return;
        }
        Paint paint = this.f2116b;
        if (i != 2) {
            paint.setTextAlign(Paint.Align.CENTER);
        } else {
            paint.setTextAlign(Paint.Align.RIGHT);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m3620o() {
        int i = this.f2133q;
        if (i < 2) {
            lwm.a("Wheel's visible item count can not be less than 2!");
            return;
        }
        if (i % 2 == 0) {
            this.f2133q = i + 1;
        }
        int i2 = this.f2133q + 2;
        this.f2134r = i2;
        this.f2135s = i2 / 2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String strValueOf;
        int iM3612g;
        int i;
        if (this.f2130o.size() == 0) {
            return;
        }
        if (this.f2132p0) {
            this.f2116b.setColor(this.f2087A);
            this.f2116b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f2125k, this.f2116b);
        }
        int i2 = (-this.f2109R) / this.f2091E;
        int i3 = this.f2135s;
        int i4 = i2 - i3;
        int i5 = this.f2097H + i4;
        int i6 = -i3;
        while (i5 < this.f2097H + i4 + this.f2134r) {
            if (this.f2094F0) {
                int size = i5 % this.f2130o.size();
                if (size < 0) {
                    size += this.f2130o.size();
                }
                strValueOf = String.valueOf(this.f2130o.get(size));
            } else {
                strValueOf = m3616k(i5) ? String.valueOf(this.f2130o.get(i5)) : "";
            }
            if (ura.e().d().w()) {
                this.f2116b.setFakeBoldText(true);
            }
            this.f2116b.setColor(this.f2138v);
            this.f2116b.setStyle(Paint.Style.FILL);
            int i7 = this.f2108Q;
            int i8 = this.f2091E;
            int i9 = (i6 * i8) + i7 + (this.f2109R % i8);
            if (this.f2096G0) {
                int iAbs = i7 - Math.abs(i7 - i9);
                int i10 = this.f2121g.top;
                int i11 = this.f2108Q;
                float f = ((iAbs - i10) * 1.0f) / (i11 - i10);
                if (i9 > i11) {
                    i = 1;
                } else {
                    i = i9 < i11 ? -1 : 0;
                }
                float f2 = (-(1.0f - f)) * 90.0f * i;
                if (f2 < -90.0f) {
                    f2 = -90.0f;
                }
                float f3 = f2 <= 90.0f ? f2 : 90.0f;
                int i12 = (int) f3;
                iM3612g = m3612g(i12);
                int i13 = this.f2105N;
                int i14 = this.f2090D;
                if (i14 == 1) {
                    i13 = this.f2121g.left;
                } else if (i14 == 2) {
                    i13 = this.f2121g.right;
                }
                int i15 = this.f2106O - iM3612g;
                this.f2127l.save();
                this.f2127l.rotateX(f3);
                this.f2127l.getMatrix(this.f2128m);
                this.f2127l.restore();
                float f4 = -i13;
                float f5 = -i15;
                this.f2128m.preTranslate(f4, f5);
                float f6 = i13;
                float f7 = i15;
                this.f2128m.postTranslate(f6, f7);
                this.f2127l.save();
                this.f2127l.translate(0.0f, 0.0f, m3607b(i12));
                this.f2127l.getMatrix(this.f2129n);
                this.f2127l.restore();
                this.f2129n.preTranslate(f4, f5);
                this.f2129n.postTranslate(f6, f7);
                this.f2128m.postConcat(this.f2129n);
            } else {
                iM3612g = 0;
            }
            if (this.f2092E0) {
                int i16 = this.f2108Q;
                int iAbs2 = (int) ((((i16 - Math.abs(i16 - i9)) * 1.0f) / this.f2108Q) * 255.0f);
                this.f2116b.setAlpha(iAbs2 < 0 ? 0 : iAbs2);
            }
            if (this.f2096G0) {
                i9 = this.f2108Q - iM3612g;
            }
            if (this.f2139w != -1) {
                canvas.save();
                if (this.f2096G0) {
                    canvas.concat(this.f2128m);
                }
                canvas.clipRect(this.f2124j, Region.Op.DIFFERENCE);
                float f8 = i9;
                canvas.drawText(m3614i(strValueOf), this.f2107P, f8, this.f2116b);
                canvas.restore();
                this.f2116b.setColor(this.f2139w);
                canvas.save();
                if (this.f2096G0) {
                    canvas.concat(this.f2128m);
                }
                canvas.clipRect(this.f2124j);
                canvas.drawText(m3614i(strValueOf), this.f2107P, f8, this.f2116b);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.f2121g);
                if (this.f2096G0) {
                    canvas.concat(this.f2128m);
                }
                canvas.drawText(m3614i(strValueOf), this.f2107P, i9, this.f2116b);
                canvas.restore();
            }
            i5++;
            i6++;
        }
        if (this.f2126k0) {
            this.f2116b.setColor(this.f2142z);
            this.f2116b.setStyle(Paint.Style.FILL);
            canvas.drawRect(this.f2122h, this.f2116b);
            canvas.drawRect(this.f2123i, this.f2116b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f2136t;
        int i4 = this.f2137u;
        int i5 = this.f2133q;
        int i6 = (i4 * i5) + (this.f2088B * (i5 - 1));
        if (this.f2096G0) {
            i6 = (int) (((double) (i6 * 2)) / 3.141592653589793d);
        }
        setMeasuredDimension(m3617l(mode, size, i3 + getPaddingLeft() + getPaddingRight()), m3617l(mode2, size2, i6 + getPaddingTop() + getPaddingBottom()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f2121g.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f2105N = this.f2121g.centerX();
        this.f2106O = this.f2121g.centerY();
        m3609d();
        this.f2095G = this.f2121g.height() / 2;
        int iHeight = this.f2121g.height() / this.f2133q;
        this.f2091E = iHeight;
        this.f2093F = iHeight / 2;
        m3610e();
        m3611f();
        m3606a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2119e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f2118d;
            if (velocityTracker == null) {
                this.f2118d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f2118d.addMovement(motionEvent);
            if (!this.f2117c.isFinished()) {
                this.f2117c.abortAnimation();
                this.f2100I0 = true;
            }
            int y = (int) motionEvent.getY();
            this.f2111T = y;
            this.f2112U = y;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f2098H0 || this.f2100I0) {
                this.f2118d.addMovement(motionEvent);
                this.f2118d.computeCurrentVelocity(1000, this.f2104M);
                this.f2100I0 = false;
                int yVelocity = (int) this.f2118d.getYVelocity();
                int iAbs = Math.abs(yVelocity);
                int i = this.f2103L;
                Scroller scroller = this.f2117c;
                if (iAbs > i) {
                    scroller.fling(0, this.f2109R, 0, yVelocity, 0, 0, this.f2101J, this.f2102K);
                    Scroller scroller2 = this.f2117c;
                    scroller2.setFinalY(scroller2.getFinalY() + m3608c(this.f2117c.getFinalY() % this.f2091E));
                } else {
                    int i2 = this.f2109R;
                    scroller.startScroll(0, i2, 0, m3608c(i2 % this.f2091E));
                }
                if (!this.f2094F0) {
                    int finalY = this.f2117c.getFinalY();
                    int i3 = this.f2102K;
                    Scroller scroller3 = this.f2117c;
                    if (finalY > i3) {
                        scroller3.setFinalY(i3);
                    } else {
                        int finalY2 = scroller3.getFinalY();
                        int i4 = this.f2101J;
                        if (finalY2 < i4) {
                            this.f2117c.setFinalY(i4);
                        }
                    }
                }
                this.f2115a.post(this);
                VelocityTracker velocityTracker2 = this.f2118d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2118d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f2118d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2118d = null;
                }
            }
        } else if (Math.abs(this.f2112U - motionEvent.getY()) < this.f2113V) {
            this.f2098H0 = true;
        } else {
            this.f2098H0 = false;
            this.f2118d.addMovement(motionEvent);
            float y2 = motionEvent.getY() - this.f2111T;
            if (Math.abs(y2) >= 1.0f) {
                this.f2109R = (int) (this.f2109R + y2);
                this.f2111T = (int) motionEvent.getY();
                invalidate();
            }
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f2130o;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f2117c.isFinished() && !this.f2100I0) {
            int i = this.f2091E;
            if (i == 0) {
                return;
            }
            int size = (((-this.f2109R) / i) + this.f2097H) % this.f2130o.size();
            if (size < 0) {
                size += this.f2130o.size();
            }
            this.f2099I = size;
            InterfaceC0174a interfaceC0174a = this.f2120f;
            if (interfaceC0174a != null && this.f2119e) {
                interfaceC0174a.mo3621a(this, this.f2130o.get(size), size);
            }
        }
        if (this.f2117c.computeScrollOffset()) {
            this.f2109R = this.f2117c.getCurrY();
            postInvalidate();
            this.f2115a.postDelayed(this, 16L);
        }
    }

    public void setAtmospheric(boolean z) {
        this.f2092E0 = z;
        invalidate();
    }

    public void setCurtain(boolean z) {
        this.f2132p0 = z;
        m3606a();
        invalidate();
    }

    public void setCurtainColor(int i) {
        this.f2087A = i;
        invalidate();
    }

    public void setCurtainHeight(int i) {
        this.f2089C = i;
    }

    public void setCurved(boolean z) {
        this.f2096G0 = z;
        requestLayout();
        invalidate();
    }

    public void setCyclic(boolean z) {
        this.f2094F0 = z;
        m3610e();
        invalidate();
    }

    public void setData(List list) {
        if (vwb.J(list)) {
            jfd0.a("WheelPicker's data can not be null!");
            return;
        }
        this.f2130o = list;
        this.f2099I = 0;
        this.f2097H = 0;
        this.f2109R = 0;
        m3613h();
        m3610e();
        requestLayout();
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f2126k0 = z;
        m3611f();
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f2142z = i;
        invalidate();
    }

    public void setIndicatorSize(int i) {
        this.f2141y = i;
        m3611f();
        invalidate();
    }

    public void setItemAlign(int i) {
        this.f2090D = i;
        m3619n();
        m3609d();
        invalidate();
    }

    public void setItemSpace(int i) {
        this.f2088B = i;
        requestLayout();
        invalidate();
    }

    public void setItemTextColor(int i) {
        this.f2138v = i;
        invalidate();
    }

    public void setItemTextSize(int i) {
        this.f2140x = i;
        this.f2116b.setTextSize(i);
        m3613h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthText(String str) {
        if (str == null) {
            jfd0.a("Maximum width text can not be null!");
            return;
        }
        this.f2131p = str;
        m3613h();
        requestLayout();
        invalidate();
    }

    public void setMaximumWidthTextPosition(int i) {
        if (m3616k(i)) {
            this.f2110S = i;
            m3613h();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f2130o.size() + "), but current is " + i);
    }

    public void setOnItemSelectedListener(InterfaceC0174a interfaceC0174a) {
        this.f2120f = interfaceC0174a;
    }

    public void setOnWheelChangeListener(InterfaceC0175b interfaceC0175b) {
    }

    public void setSameWidth(boolean z) {
        this.f2114W = z;
        m3613h();
        requestLayout();
        invalidate();
    }

    public void setSelectedItemPosition(int i) {
        m3618m(i, false);
    }

    public void setSelectedItemTextColor(int i) {
        this.f2139w = i;
        m3606a();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        Paint paint = this.f2116b;
        if (paint != null) {
            paint.setTypeface(typeface);
        }
        m3613h();
        requestLayout();
        invalidate();
    }

    public void setVisibleItemCount(int i) {
        this.f2133q = i;
        m3620o();
        requestLayout();
    }

    public WheelPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WheelPicker(Context context) {
        super(context);
        this.f2115a = new Handler();
        this.f2130o = new ArrayList();
        this.f2133q = 7;
        this.f2140x = 0;
        this.f2141y = 0;
        this.f2103L = 50;
        this.f2104M = 8000;
        this.f2113V = 8;
        m3615j();
    }
}
