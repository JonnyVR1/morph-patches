package p028v;

import android.R;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import l.b9c0;
import l.dqi;
import l.kqf0;
import l.t0c0;
import l.vqf0;
import l.xee;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VSwitchButton extends CompoundButton {

    /* JADX INFO: renamed from: U */
    public static final int[] f12984U = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: V */
    public static final int[] f12985V = {-16842912, R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: A */
    public float f12986A;

    /* JADX INFO: renamed from: B */
    public int f12987B;

    /* JADX INFO: renamed from: C */
    public int f12988C;

    /* JADX INFO: renamed from: D */
    public CharSequence f12989D;

    /* JADX INFO: renamed from: E */
    public CharSequence f12990E;

    /* JADX INFO: renamed from: F */
    public TextPaint f12991F;

    /* JADX INFO: renamed from: G */
    public Layout f12992G;

    /* JADX INFO: renamed from: H */
    public Layout f12993H;

    /* JADX INFO: renamed from: I */
    public float f12994I;

    /* JADX INFO: renamed from: J */
    public float f12995J;

    /* JADX INFO: renamed from: K */
    public int f12996K;

    /* JADX INFO: renamed from: L */
    public int f12997L;

    /* JADX INFO: renamed from: M */
    public int f12998M;

    /* JADX INFO: renamed from: N */
    public boolean f12999N;

    /* JADX INFO: renamed from: O */
    public boolean f13000O;

    /* JADX INFO: renamed from: P */
    public boolean f13001P;

    /* JADX INFO: renamed from: Q */
    public RunnableC1368a f13002Q;

    /* JADX INFO: renamed from: R */
    public CompoundButton.OnCheckedChangeListener f13003R;

    /* JADX INFO: renamed from: S */
    public int f13004S;

    /* JADX INFO: renamed from: T */
    public int f13005T;

    /* JADX INFO: renamed from: a */
    public final int f13006a;

    /* JADX INFO: renamed from: b */
    public Paint f13007b;

    /* JADX INFO: renamed from: c */
    public Paint f13008c;

    /* JADX INFO: renamed from: d */
    public kqf0 f13009d;

    /* JADX INFO: renamed from: e */
    public final ArgbEvaluator f13010e;

    /* JADX INFO: renamed from: f */
    public float f13011f;

    /* JADX INFO: renamed from: g */
    public float f13012g;

    /* JADX INFO: renamed from: h */
    public RectF f13013h;

    /* JADX INFO: renamed from: i */
    public float f13014i;

    /* JADX INFO: renamed from: j */
    public int f13015j;

    /* JADX INFO: renamed from: k */
    public float f13016k;

    /* JADX INFO: renamed from: l */
    public float f13017l;

    /* JADX INFO: renamed from: m */
    public int f13018m;

    /* JADX INFO: renamed from: n */
    public int f13019n;

    /* JADX INFO: renamed from: o */
    public int f13020o;

    /* JADX INFO: renamed from: p */
    public int f13021p;

    /* JADX INFO: renamed from: q */
    public RectF f13022q;

    /* JADX INFO: renamed from: r */
    public RectF f13023r;

    /* JADX INFO: renamed from: s */
    public RectF f13024s;

    /* JADX INFO: renamed from: t */
    public RectF f13025t;

    /* JADX INFO: renamed from: u */
    public RectF f13026u;

    /* JADX INFO: renamed from: v */
    public RectF f13027v;

    /* JADX INFO: renamed from: w */
    public float f13028w;

    /* JADX INFO: renamed from: x */
    public RectF f13029x;

    /* JADX INFO: renamed from: y */
    public float f13030y;

    /* JADX INFO: renamed from: z */
    public float f13031z;

    /* JADX INFO: renamed from: v.VSwitchButton$a */
    public final class RunnableC1368a implements Runnable {
        public RunnableC1368a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VSwitchButton.this.setPressed(false);
        }
    }

    public VSwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13006a = getResources().getColor(t0c0.t);
        this.f13010e = new ArgbEvaluator();
        this.f13011f = -1.0f;
        this.f13012g = -1.0f;
        this.f13015j = getResources().getColor(t0c0.t);
        this.f12999N = false;
        this.f13000O = false;
        this.f13001P = false;
        this.f13004S = getResources().getColor(t0c0.q);
        this.f13005T = -1;
        m11713g(context, attributeSet);
    }

    private float getProgress() {
        return this.f13028w;
    }

    private void setProgress(float f) {
        this.f13028w = f;
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m11708b(boolean z) {
        if (this.f13009d == null) {
            return;
        }
        m11709c();
        kqf0 kqf0Var = this.f13009d;
        if (z) {
            kqf0Var.j(this.f13028w * 16.0f).o(16.0f);
        } else {
            kqf0Var.j(this.f13028w * 16.0f).o(0.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11709c() {
        kqf0 kqf0Var = this.f13009d;
        if (kqf0Var == null || !kqf0Var.g()) {
            return;
        }
        this.f13009d.c();
    }

    /* JADX INFO: renamed from: d */
    public final void m11710d() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.f13001P = true;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f13020o = textColors.getColorForState(f12984U, defaultColor);
            this.f13021p = textColors.getColorForState(f12985V, defaultColor);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m11711e(double d) {
        return (int) Math.ceil(d);
    }

    /* JADX INFO: renamed from: f */
    public final float m11712f(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: g */
    public final void m11713g(Context context, AttributeSet attributeSet) {
        float dimension;
        float dimension2;
        float dimension3;
        float dimension4;
        this.f12987B = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f12988C = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.f13007b = new Paint(1);
        Paint paint = new Paint(1);
        this.f13008c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f13008c.setStrokeWidth(getResources().getDisplayMetrics().density * 2.0f);
        this.f13008c.setStrokeCap(Paint.Cap.ROUND);
        this.f12991F = getPaint();
        this.f13022q = new RectF();
        this.f13023r = new RectF();
        this.f13027v = new RectF();
        this.f13024s = new RectF();
        this.f13013h = new RectF();
        this.f13025t = new RectF();
        this.f13026u = new RectF();
        this.f13029x = new RectF();
        float f = getResources().getDisplayMetrics().density * 4.0f;
        TypedArray typedArrayObtainStyledAttributes = attributeSet == null ? null : context.obtainStyledAttributes(attributeSet, b9c0.H4);
        if (typedArrayObtainStyledAttributes != null) {
            float dimension5 = typedArrayObtainStyledAttributes.getDimension(b9c0.R4, f);
            dimension2 = typedArrayObtainStyledAttributes.getDimension(b9c0.T4, dimension5);
            dimension3 = typedArrayObtainStyledAttributes.getDimension(b9c0.U4, dimension5);
            dimension4 = typedArrayObtainStyledAttributes.getDimension(b9c0.V4, dimension5);
            dimension = typedArrayObtainStyledAttributes.getDimension(b9c0.S4, dimension5);
            this.f13016k = typedArrayObtainStyledAttributes.getDimension(b9c0.Y4, 0.0f);
            this.f13017l = typedArrayObtainStyledAttributes.getDimension(b9c0.Q4, 0.0f);
            this.f13011f = typedArrayObtainStyledAttributes.getDimension(b9c0.W4, -1.0f);
            this.f13012g = typedArrayObtainStyledAttributes.getDimension(b9c0.J4, -1.0f);
            this.f13014i = typedArrayObtainStyledAttributes.getFloat(b9c0.X4, 1.727f);
            this.f13015j = typedArrayObtainStyledAttributes.getColor(b9c0.I4, this.f13006a);
            this.f13004S = typedArrayObtainStyledAttributes.getColor(b9c0.K4, getResources().getColor(t0c0.q));
            this.f12989D = typedArrayObtainStyledAttributes.getString(b9c0.O4);
            this.f12990E = typedArrayObtainStyledAttributes.getString(b9c0.N4);
            this.f12996K = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.P4, 0);
            this.f12997L = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.M4, 0);
            this.f12998M = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.L4, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            dimension = 0.0f;
            dimension2 = 0.0f;
            dimension3 = 0.0f;
            dimension4 = 0.0f;
        }
        TypedArray typedArrayObtainStyledAttributes2 = attributeSet != null ? context.obtainStyledAttributes(attributeSet, new int[]{R.attr.focusable, R.attr.clickable}) : null;
        if (typedArrayObtainStyledAttributes2 != null) {
            boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
            boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(1, z);
            setFocusable(z);
            setClickable(z2);
            typedArrayObtainStyledAttributes2.recycle();
        } else {
            setFocusable(true);
            setClickable(true);
        }
        this.f13013h.set(dimension2, dimension4, dimension3, dimension);
        float fWidth = this.f13013h.width();
        float fMax = this.f13014i;
        if (fWidth >= 0.0f) {
            fMax = Math.max(fMax, 1.0f);
        }
        this.f13014i = fMax;
        if (isChecked()) {
            setProgress(1.0f);
        }
        m11714h();
    }

    public float getBackRadius() {
        return this.f13012g;
    }

    public PointF getBackSizeF() {
        return new PointF(this.f13023r.width(), this.f13023r.height());
    }

    public CharSequence getTextOff() {
        return this.f12990E;
    }

    public CharSequence getTextOn() {
        return this.f12989D;
    }

    public float getThumbHeight() {
        return this.f13017l;
    }

    public RectF getThumbMargin() {
        return this.f13013h;
    }

    public float getThumbRadius() {
        return this.f13011f;
    }

    public float getThumbRangeRatio() {
        return this.f13014i;
    }

    public float getThumbWidth() {
        return this.f13016k;
    }

    /* JADX INFO: renamed from: h */
    public final void m11714h() {
        if (this.f13009d == null) {
            boolean zIsChecked = isChecked();
            kqf0 kqf0VarJ = new kqf0(new dqi(zIsChecked ? 16.0f : 0.0f)).r(new vqf0().d(0.61f).f(600.0f)).j(zIsChecked ? 16.0f : 0.0f);
            this.f13009d = kqf0VarJ;
            kqf0VarJ.b(new xee.r() { // from class: l.nqk0
                /* JADX INFO: renamed from: a */
                public final void m6559a(xee xeeVar, float f, float f2) {
                    this.f5953a.m11716j(xeeVar, f, f2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11715i() {
        return getProgress() > 0.5f;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m11716j(xee xeeVar, float f, float f2) {
        setProgress(f / 16.0f);
    }

    /* JADX INFO: renamed from: k */
    public final Layout m11717k(CharSequence charSequence) {
        TextPaint textPaint = this.f12991F;
        return new StaticLayout(charSequence, textPaint, (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: l */
    public final int m11718l(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        float f = this.f13017l;
        if (mode != 1073741824) {
            if (f == 0.0f) {
                this.f13017l = m11711e(getResources().getDisplayMetrics().density * 22.0f);
            }
            float f2 = this.f13017l;
            RectF rectF = this.f13013h;
            int iM11711e = m11711e(f2 + rectF.top + rectF.bottom);
            this.f13019n = iM11711e;
            if (iM11711e < 0) {
                this.f13019n = 0;
                this.f13017l = 0.0f;
                return size;
            }
            int iM11711e2 = m11711e(this.f12995J - iM11711e);
            if (iM11711e2 > 0) {
                this.f13019n += iM11711e2;
                this.f13017l += iM11711e2;
            }
            int iMax = (int) Math.max(this.f13017l, this.f13019n);
            return Math.max(Math.max(iMax, getPaddingTop() + iMax + getPaddingBottom()), getSuggestedMinimumHeight());
        }
        if (f != 0.0f) {
            RectF rectF2 = this.f13013h;
            int iM11711e3 = m11711e(f + rectF2.top + rectF2.bottom);
            this.f13019n = iM11711e3;
            int iM11711e4 = m11711e(Math.max(iM11711e3, this.f12995J));
            this.f13019n = iM11711e4;
            if ((((iM11711e4 + getPaddingTop()) + getPaddingBottom()) - Math.min(0.0f, this.f13013h.top)) - Math.min(0.0f, this.f13013h.bottom) > size) {
                this.f13017l = 0.0f;
            }
        }
        if (this.f13017l == 0.0f) {
            int iM11711e5 = m11711e(((size - getPaddingTop()) - getPaddingBottom()) + Math.min(0.0f, this.f13013h.top) + Math.min(0.0f, this.f13013h.bottom));
            this.f13019n = iM11711e5;
            if (iM11711e5 < 0) {
                this.f13019n = 0;
                this.f13017l = 0.0f;
                return size;
            }
            RectF rectF3 = this.f13013h;
            this.f13017l = m11711e((iM11711e5 - rectF3.top) - rectF3.bottom);
        }
        if (this.f13017l < 0.0f) {
            this.f13019n = 0;
            this.f13017l = 0.0f;
        }
        return size;
    }

    /* JADX INFO: renamed from: m */
    public final int m11719m(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int iM11711e = m11711e(this.f12994I);
        if (this.f13014i == 0.0f) {
            this.f13014i = 1.727f;
        }
        if (mode != 1073741824) {
            if (this.f13016k == 0.0f) {
                this.f13016k = m11711e(getResources().getDisplayMetrics().density * 22.0f);
            }
            if (this.f13014i == 0.0f) {
                this.f13014i = 1.727f;
            }
            int iM11711e2 = m11711e(this.f13016k * this.f13014i);
            float f = iM11711e + this.f12997L;
            float f2 = iM11711e2;
            float f3 = f2 - this.f13016k;
            RectF rectF = this.f13013h;
            int iM11711e3 = m11711e(f - ((f3 + Math.max(rectF.left, rectF.right)) + this.f12996K));
            RectF rectF2 = this.f13013h;
            int iM11711e4 = m11711e(rectF2.left + f2 + rectF2.right + Math.max(0, iM11711e3));
            this.f13018m = iM11711e4;
            if (iM11711e4 >= 0) {
                int iM11711e5 = m11711e(f2 + Math.max(0.0f, this.f13013h.left) + Math.max(0.0f, this.f13013h.right) + Math.max(0, iM11711e3));
                return Math.max(iM11711e5, getPaddingLeft() + iM11711e5 + getPaddingRight());
            }
            this.f13016k = 0.0f;
            this.f13018m = 0;
            return size;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        float f4 = this.f13016k;
        if (f4 != 0.0f) {
            int iM11711e6 = m11711e(f4 * this.f13014i);
            float f5 = this.f12997L + iM11711e;
            float f6 = iM11711e6;
            float f7 = f6 - this.f13016k;
            RectF rectF3 = this.f13013h;
            int iM11711e7 = (int) (f5 - (f7 + m11711e(Math.max(rectF3.left, rectF3.right))));
            RectF rectF4 = this.f13013h;
            int iM11711e8 = m11711e(rectF4.left + f6 + rectF4.right + Math.max(iM11711e7, 0));
            this.f13018m = iM11711e8;
            if (iM11711e8 < 0) {
                this.f13016k = 0.0f;
            }
            if (f6 + Math.max(this.f13013h.left, 0.0f) + Math.max(this.f13013h.right, 0.0f) + Math.max(iM11711e7, 0) > paddingLeft) {
                this.f13016k = 0.0f;
            }
        }
        if (this.f13016k == 0.0f) {
            int iM11711e9 = m11711e((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.f13013h.left, 0.0f)) - Math.max(this.f13013h.right, 0.0f));
            if (iM11711e9 < 0) {
                this.f13016k = 0.0f;
                this.f13018m = 0;
                return size;
            }
            float f8 = iM11711e9;
            this.f13016k = m11711e(f8 / this.f13014i);
            RectF rectF5 = this.f13013h;
            int iM11711e10 = m11711e(rectF5.left + f8 + rectF5.right);
            this.f13018m = iM11711e10;
            if (iM11711e10 < 0) {
                this.f13016k = 0.0f;
                this.f13018m = 0;
                return size;
            }
            float f9 = iM11711e + this.f12997L;
            float f10 = f8 - this.f13016k;
            RectF rectF6 = this.f13013h;
            int iM11711e11 = (int) (f9 - (f10 + m11711e(Math.max(rectF6.left, rectF6.right))));
            if (iM11711e11 > 0) {
                this.f13016k -= iM11711e11;
            }
            if (this.f13016k < 0.0f) {
                this.f13016k = 0.0f;
                this.f13018m = 0;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: n */
    public void m11720n(CharSequence charSequence, CharSequence charSequence2) {
        this.f12989D = charSequence;
        this.f12990E = charSequence2;
        this.f12992G = null;
        this.f12993H = null;
        this.f13000O = false;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: o */
    public void m11721o(float f, float f2, float f3, float f4) {
        this.f13013h.set(f, f2, f3, f4);
        this.f13000O = false;
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (!this.f13000O) {
            m11722p();
        }
        if (this.f13000O) {
            float fM11712f = m11712f(getProgress());
            this.f13007b.setColor(((Integer) this.f13010e.evaluate(fM11712f, Integer.valueOf(this.f13005T), Integer.valueOf(this.f13015j))).intValue());
            RectF rectF = this.f13023r;
            float f2 = this.f13012g;
            canvas.drawRoundRect(rectF, f2, f2, this.f13007b);
            this.f13008c.setColor(((Integer) this.f13010e.evaluate(fM11712f, Integer.valueOf(this.f13004S), Integer.valueOf(this.f13015j))).intValue());
            RectF rectF2 = this.f13027v;
            float f3 = this.f13012g;
            canvas.drawRoundRect(rectF2, f3, f3, this.f13008c);
            double d = fM11712f;
            Layout layout = d > 0.5d ? this.f12992G : this.f12993H;
            RectF rectF3 = d > 0.5d ? this.f13025t : this.f13026u;
            if (layout != null && rectF3 != null) {
                if (d >= 0.75d) {
                    f = (4.0f * fM11712f) - 3.0f;
                } else {
                    f = d < 0.25d ? 1.0f - (4.0f * fM11712f) : 0.0f;
                }
                int i = (int) (f * 255.0f);
                int i2 = d > 0.5d ? this.f13020o : this.f13021p;
                layout.getPaint().setARGB((Color.alpha(i2) * i) / 255, Color.red(i2), Color.green(i2), Color.blue(i2));
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                layout.draw(canvas);
                canvas.restore();
            }
            this.f13029x.set(this.f13022q);
            this.f13029x.offset(getProgress() * this.f13024s.width(), 0.0f);
            this.f13007b.setColor(((Integer) this.f13010e.evaluate(fM11712f, Integer.valueOf(this.f13004S), Integer.valueOf(this.f13005T))).intValue());
            RectF rectF4 = this.f13029x;
            float f4 = this.f13011f;
            canvas.drawRoundRect(rectF4, f4, f4, this.f13007b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f12992G == null && !TextUtils.isEmpty(this.f12989D)) {
            this.f12992G = m11717k(this.f12989D);
        }
        if (this.f12993H == null && !TextUtils.isEmpty(this.f12990E)) {
            this.f12993H = m11717k(this.f12990E);
        }
        Layout layout = this.f12992G;
        float width = layout != null ? layout.getWidth() : 0.0f;
        Layout layout2 = this.f12993H;
        float width2 = layout2 != null ? layout2.getWidth() : 0.0f;
        if (width == 0.0f && width2 == 0.0f) {
            this.f12994I = 0.0f;
        } else {
            this.f12994I = Math.max(width, width2);
        }
        Layout layout3 = this.f12992G;
        float height = layout3 != null ? layout3.getHeight() : 0.0f;
        Layout layout4 = this.f12993H;
        float height2 = layout4 != null ? layout4.getHeight() : 0.0f;
        if (height == 0.0f && height2 == 0.0f) {
            this.f12995J = 0.0f;
        } else {
            this.f12995J = Math.max(height, height2);
        }
        setMeasuredDimension(m11719m(i), m11718l(i2));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        m11720n(savedState.onText, savedState.offText);
        this.f12999N = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f12999N = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.onText = this.f12989D;
        savedState.offText = this.f12990E;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m11722p();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM11715i;
        if (!isEnabled() || !isClickable() || !isFocusable() || !this.f13000O) {
            return false;
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX() - this.f13030y;
        float y = motionEvent.getY() - this.f13031z;
        if (action == 0) {
            this.f13030y = motionEvent.getX();
            this.f13031z = motionEvent.getY();
            this.f12986A = this.f13030y;
            setPressed(true);
        } else if (action == 1) {
            this.f13001P = false;
            float eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            if (Math.abs(x) < this.f12987B || Math.abs(y) >= this.f12987B || eventTime >= this.f12988C) {
                zM11715i = m11715i();
                if (zM11715i != isChecked()) {
                    playSoundEffect(0);
                    setChecked(zM11715i);
                } else {
                    m11708b(zM11715i);
                }
            } else {
                performClick();
            }
            if (isPressed()) {
                if (this.f13002Q == null) {
                    this.f13002Q = new RunnableC1368a();
                }
                if (!post(this.f13002Q)) {
                    this.f13002Q.run();
                }
            }
        } else if (action == 2) {
            float x2 = motionEvent.getX();
            setProgress(m11712f(getProgress() + ((x2 - this.f12986A) / this.f13024s.width())));
            this.f12986A = x2;
            if (!this.f13001P && (Math.abs(x) > this.f12987B / 2.0f || Math.abs(y) > this.f12987B / 2.0f)) {
                if (y == 0.0f || Math.abs(x) > Math.abs(y)) {
                    m11710d();
                } else if (Math.abs(y) > Math.abs(x)) {
                    return false;
                }
            }
        } else if (action == 3) {
            this.f13001P = false;
            float eventTime2 = motionEvent.getEventTime() - motionEvent.getDownTime();
            if (Math.abs(x) < this.f12987B) {
                zM11715i = m11715i();
                if (zM11715i != isChecked()) {
                    playSoundEffect(0);
                    setChecked(zM11715i);
                } else {
                    m11708b(zM11715i);
                }
            } else {
                zM11715i = m11715i();
                if (zM11715i != isChecked()) {
                    playSoundEffect(0);
                    setChecked(zM11715i);
                } else {
                    m11708b(zM11715i);
                }
            }
            if (isPressed()) {
                if (this.f13002Q == null) {
                    this.f13002Q = new RunnableC1368a();
                }
                if (!post(this.f13002Q)) {
                    this.f13002Q.run();
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m11722p() {
        float paddingTop;
        float paddingLeft;
        float f = this.f13016k;
        if (f != 0.0f) {
            float f2 = this.f13017l;
            if (f2 == 0.0f || this.f13018m == 0 || this.f13019n == 0) {
                return;
            }
            if (this.f13011f == -1.0f) {
                this.f13011f = Math.min(f, f2) / 2.0f;
            }
            if (this.f13012g == -1.0f) {
                this.f13012g = Math.min(this.f13018m, this.f13019n) / 2.0f;
            }
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int iM11711e = m11711e((this.f13018m - Math.min(0.0f, this.f13013h.left)) - Math.min(0.0f, this.f13013h.right));
            int iM11711e2 = m11711e((this.f13019n - Math.min(0.0f, this.f13013h.top)) - Math.min(0.0f, this.f13013h.bottom));
            if (measuredHeight <= iM11711e2) {
                paddingTop = getPaddingTop() + Math.max(0.0f, this.f13013h.top);
            } else {
                paddingTop = (((measuredHeight - iM11711e2) + 1) / 2.0f) + getPaddingTop() + Math.max(0.0f, this.f13013h.top);
            }
            if (measuredWidth <= this.f13018m) {
                paddingLeft = getPaddingLeft() + Math.max(0.0f, this.f13013h.left);
            } else {
                paddingLeft = (((measuredWidth - iM11711e) + 1) / 2.0f) + getPaddingLeft() + Math.max(0.0f, this.f13013h.left);
            }
            this.f13022q.set(paddingLeft, paddingTop, this.f13016k + paddingLeft, this.f13017l + paddingTop);
            RectF rectF = this.f13022q;
            float f3 = rectF.left;
            RectF rectF2 = this.f13013h;
            float f4 = f3 - rectF2.left;
            RectF rectF3 = this.f13023r;
            float f5 = rectF.top;
            float f6 = rectF2.top;
            rectF3.set(f4, f5 - f6, this.f13018m + f4, (f5 - f6) + this.f13019n);
            float f7 = (getResources().getDisplayMetrics().density * 2.0f) / 2.0f;
            float f8 = this.f13022q.top;
            float f9 = this.f13013h.top;
            this.f13027v.set(f4 + f7, (f8 - f9) + f7, (f4 + this.f13018m) - f7, ((f8 - f9) + this.f13019n) - f7);
            RectF rectF4 = this.f13024s;
            RectF rectF5 = this.f13022q;
            rectF4.set(rectF5.left, 0.0f, (this.f13023r.right - this.f13013h.right) - rectF5.width(), 0.0f);
            this.f13012g = Math.min(Math.min(this.f13023r.width(), this.f13023r.height()) / 2.0f, this.f13012g);
            if (this.f12992G != null) {
                RectF rectF6 = this.f13023r;
                float fWidth = (rectF6.left + (((((rectF6.width() + this.f12996K) - this.f13016k) - this.f13013h.right) - this.f12992G.getWidth()) / 2.0f)) - this.f12998M;
                RectF rectF7 = this.f13023r;
                float fHeight = rectF7.top + ((rectF7.height() - this.f12992G.getHeight()) / 2.0f);
                this.f13025t.set(fWidth, fHeight, this.f12992G.getWidth() + fWidth, this.f12992G.getHeight() + fHeight);
            }
            if (this.f12993H != null) {
                RectF rectF8 = this.f13023r;
                float fWidth2 = ((rectF8.right - (((((rectF8.width() + this.f12996K) - this.f13016k) - this.f13013h.left) - this.f12993H.getWidth()) / 2.0f)) - this.f12993H.getWidth()) + this.f12998M;
                RectF rectF9 = this.f13023r;
                float fHeight2 = rectF9.top + ((rectF9.height() - this.f12993H.getHeight()) / 2.0f);
                this.f13026u.set(fWidth2, fHeight2, this.f12993H.getWidth() + fWidth2, this.f12993H.getHeight() + fHeight2);
            }
            this.f13000O = true;
        }
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setActiveSliderColor(@ColorInt int i) {
        this.f13005T = i;
        invalidate();
    }

    public void setBackRadius(float f) {
        this.f13012g = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (isChecked() != z) {
            m11708b(z);
        }
        if (this.f12999N) {
            setCheckedImmediatelyNoEvent(z);
        } else {
            super.setChecked(z);
        }
    }

    public void setCheckedImmediately(boolean z) {
        super.setChecked(z);
        m11709c();
        setProgress(z ? 1.0f : 0.0f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z) {
        if (this.f13003R == null) {
            setCheckedImmediately(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z);
        super.setOnCheckedChangeListener(this.f13003R);
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.f13003R == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.f13003R);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f13003R = onCheckedChangeListener;
    }

    public void setTextAdjust(int i) {
        this.f12998M = i;
        this.f13000O = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i) {
        this.f12997L = i;
        this.f13000O = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i) {
        this.f12996K = i;
        this.f13000O = false;
        requestLayout();
        invalidate();
    }

    public void setThumbActiveColor(@ColorInt int i) {
        this.f13015j = i;
        invalidate();
    }

    public void setThumbInActiveColor(@ColorInt int i) {
        this.f13004S = i;
        invalidate();
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            m11721o(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            m11721o(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbRadius(float f) {
        this.f13011f = f;
        invalidate();
    }

    public void setThumbRangeRatio(float f) {
        this.f13014i = f;
        this.f13000O = false;
        requestLayout();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1367a();
        CharSequence offText;
        CharSequence onText;

        /* JADX INFO: renamed from: v.VSwitchButton$SavedState$a */
        public class C1367a implements Parcelable.Creator<SavedState> {
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
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.onText = (CharSequence) creator.createFromParcel(parcel);
            this.offText = (CharSequence) creator.createFromParcel(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.onText, parcel, i);
            TextUtils.writeToParcel(this.offText, parcel, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public VSwitchButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VSwitchButton(Context context) {
        this(context, null);
    }
}
