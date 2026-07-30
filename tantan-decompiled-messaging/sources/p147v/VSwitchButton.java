package p147v;

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
import p149l.b9c0;
import p149l.dqi;
import p149l.kqf0;
import p149l.t0c0;
import p149l.vqf0;
import p149l.xee;

/* JADX INFO: loaded from: classes3.dex */
public class VSwitchButton extends CompoundButton {

    /* JADX INFO: renamed from: U */
    public static final int[] f209359U = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: V */
    public static final int[] f209360V = {-16842912, R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: A */
    public float f209361A;

    /* JADX INFO: renamed from: B */
    public int f209362B;

    /* JADX INFO: renamed from: C */
    public int f209363C;

    /* JADX INFO: renamed from: D */
    public CharSequence f209364D;

    /* JADX INFO: renamed from: E */
    public CharSequence f209365E;

    /* JADX INFO: renamed from: F */
    public TextPaint f209366F;

    /* JADX INFO: renamed from: G */
    public Layout f209367G;

    /* JADX INFO: renamed from: H */
    public Layout f209368H;

    /* JADX INFO: renamed from: I */
    public float f209369I;

    /* JADX INFO: renamed from: J */
    public float f209370J;

    /* JADX INFO: renamed from: K */
    public int f209371K;

    /* JADX INFO: renamed from: L */
    public int f209372L;

    /* JADX INFO: renamed from: M */
    public int f209373M;

    /* JADX INFO: renamed from: N */
    public boolean f209374N;

    /* JADX INFO: renamed from: O */
    public boolean f209375O;

    /* JADX INFO: renamed from: P */
    public boolean f209376P;

    /* JADX INFO: renamed from: Q */
    public RunnableC22575a f209377Q;

    /* JADX INFO: renamed from: R */
    public CompoundButton.OnCheckedChangeListener f209378R;

    /* JADX INFO: renamed from: S */
    public int f209379S;

    /* JADX INFO: renamed from: T */
    public int f209380T;

    /* JADX INFO: renamed from: a */
    public final int f209381a;

    /* JADX INFO: renamed from: b */
    public Paint f209382b;

    /* JADX INFO: renamed from: c */
    public Paint f209383c;

    /* JADX INFO: renamed from: d */
    public kqf0 f209384d;

    /* JADX INFO: renamed from: e */
    public final ArgbEvaluator f209385e;

    /* JADX INFO: renamed from: f */
    public float f209386f;

    /* JADX INFO: renamed from: g */
    public float f209387g;

    /* JADX INFO: renamed from: h */
    public RectF f209388h;

    /* JADX INFO: renamed from: i */
    public float f209389i;

    /* JADX INFO: renamed from: j */
    public int f209390j;

    /* JADX INFO: renamed from: k */
    public float f209391k;

    /* JADX INFO: renamed from: l */
    public float f209392l;

    /* JADX INFO: renamed from: m */
    public int f209393m;

    /* JADX INFO: renamed from: n */
    public int f209394n;

    /* JADX INFO: renamed from: o */
    public int f209395o;

    /* JADX INFO: renamed from: p */
    public int f209396p;

    /* JADX INFO: renamed from: q */
    public RectF f209397q;

    /* JADX INFO: renamed from: r */
    public RectF f209398r;

    /* JADX INFO: renamed from: s */
    public RectF f209399s;

    /* JADX INFO: renamed from: t */
    public RectF f209400t;

    /* JADX INFO: renamed from: u */
    public RectF f209401u;

    /* JADX INFO: renamed from: v */
    public RectF f209402v;

    /* JADX INFO: renamed from: w */
    public float f209403w;

    /* JADX INFO: renamed from: x */
    public RectF f209404x;

    /* JADX INFO: renamed from: y */
    public float f209405y;

    /* JADX INFO: renamed from: z */
    public float f209406z;

    /* JADX INFO: renamed from: v.VSwitchButton$a */
    public final class RunnableC22575a implements Runnable {
        public RunnableC22575a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VSwitchButton.this.setPressed(false);
        }
    }

    public VSwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209381a = getResources().getColor(t0c0.f167168t);
        this.f209385e = new ArgbEvaluator();
        this.f209386f = -1.0f;
        this.f209387g = -1.0f;
        this.f209390j = getResources().getColor(t0c0.f167168t);
        this.f209374N = false;
        this.f209375O = false;
        this.f209376P = false;
        this.f209379S = getResources().getColor(t0c0.f167165q);
        this.f209380T = -1;
        m223227g(context, attributeSet);
    }

    private float getProgress() {
        return this.f209403w;
    }

    private void setProgress(float f) {
        this.f209403w = f;
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m223222b(boolean z) {
        if (this.f209384d == null) {
            return;
        }
        m223223c();
        kqf0 kqf0Var = this.f209384d;
        if (z) {
            kqf0Var.m208547j(this.f209403w * 16.0f).m146940o(16.0f);
        } else {
            kqf0Var.m208547j(this.f209403w * 16.0f).m146940o(0.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m223223c() {
        kqf0 kqf0Var = this.f209384d;
        if (kqf0Var == null || !kqf0Var.m208545g()) {
            return;
        }
        this.f209384d.m208541c();
    }

    /* JADX INFO: renamed from: d */
    public final void m223224d() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.f209376P = true;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f209395o = textColors.getColorForState(f209359U, defaultColor);
            this.f209396p = textColors.getColorForState(f209360V, defaultColor);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m223225e(double d) {
        return (int) Math.ceil(d);
    }

    /* JADX INFO: renamed from: f */
    public final float m223226f(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: g */
    public final void m223227g(Context context, AttributeSet attributeSet) {
        float dimension;
        float dimension2;
        float dimension3;
        float dimension4;
        this.f209362B = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f209363C = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.f209382b = new Paint(1);
        Paint paint = new Paint(1);
        this.f209383c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f209383c.setStrokeWidth(getResources().getDisplayMetrics().density * 2.0f);
        this.f209383c.setStrokeCap(Paint.Cap.ROUND);
        this.f209366F = getPaint();
        this.f209397q = new RectF();
        this.f209398r = new RectF();
        this.f209402v = new RectF();
        this.f209399s = new RectF();
        this.f209388h = new RectF();
        this.f209400t = new RectF();
        this.f209401u = new RectF();
        this.f209404x = new RectF();
        float f = getResources().getDisplayMetrics().density * 4.0f;
        TypedArray typedArrayObtainStyledAttributes = attributeSet == null ? null : context.obtainStyledAttributes(attributeSet, b9c0.f74273H4);
        if (typedArrayObtainStyledAttributes != null) {
            float dimension5 = typedArrayObtainStyledAttributes.getDimension(b9c0.f74336R4, f);
            dimension2 = typedArrayObtainStyledAttributes.getDimension(b9c0.f74348T4, dimension5);
            dimension3 = typedArrayObtainStyledAttributes.getDimension(b9c0.f74354U4, dimension5);
            dimension4 = typedArrayObtainStyledAttributes.getDimension(b9c0.f74360V4, dimension5);
            dimension = typedArrayObtainStyledAttributes.getDimension(b9c0.f74342S4, dimension5);
            this.f209391k = typedArrayObtainStyledAttributes.getDimension(b9c0.f74378Y4, 0.0f);
            this.f209392l = typedArrayObtainStyledAttributes.getDimension(b9c0.f74330Q4, 0.0f);
            this.f209386f = typedArrayObtainStyledAttributes.getDimension(b9c0.f74366W4, -1.0f);
            this.f209387g = typedArrayObtainStyledAttributes.getDimension(b9c0.f74287J4, -1.0f);
            this.f209389i = typedArrayObtainStyledAttributes.getFloat(b9c0.f74372X4, 1.727f);
            this.f209390j = typedArrayObtainStyledAttributes.getColor(b9c0.f74280I4, this.f209381a);
            this.f209379S = typedArrayObtainStyledAttributes.getColor(b9c0.f74294K4, getResources().getColor(t0c0.f167165q));
            this.f209364D = typedArrayObtainStyledAttributes.getString(b9c0.f74318O4);
            this.f209365E = typedArrayObtainStyledAttributes.getString(b9c0.f74312N4);
            this.f209371K = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74324P4, 0);
            this.f209372L = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74306M4, 0);
            this.f209373M = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74300L4, 0);
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
        this.f209388h.set(dimension2, dimension4, dimension3, dimension);
        float fWidth = this.f209388h.width();
        float fMax = this.f209389i;
        if (fWidth >= 0.0f) {
            fMax = Math.max(fMax, 1.0f);
        }
        this.f209389i = fMax;
        if (isChecked()) {
            setProgress(1.0f);
        }
        m223228h();
    }

    public float getBackRadius() {
        return this.f209387g;
    }

    public PointF getBackSizeF() {
        return new PointF(this.f209398r.width(), this.f209398r.height());
    }

    public CharSequence getTextOff() {
        return this.f209365E;
    }

    public CharSequence getTextOn() {
        return this.f209364D;
    }

    public float getThumbHeight() {
        return this.f209392l;
    }

    public RectF getThumbMargin() {
        return this.f209388h;
    }

    public float getThumbRadius() {
        return this.f209386f;
    }

    public float getThumbRangeRatio() {
        return this.f209389i;
    }

    public float getThumbWidth() {
        return this.f209391k;
    }

    /* JADX INFO: renamed from: h */
    public final void m223228h() {
        if (this.f209384d == null) {
            boolean zIsChecked = isChecked();
            kqf0 kqf0VarM208547j = new kqf0(new dqi(zIsChecked ? 16.0f : 0.0f)).m146943r(new vqf0().m199490d(0.61f).m199492f(600.0f)).m208547j(zIsChecked ? 16.0f : 0.0f);
            this.f209384d = kqf0VarM208547j;
            kqf0VarM208547j.m208540b(new xee.InterfaceC21139r() { // from class: l.nqk0
                @Override // p149l.xee.InterfaceC21139r
                /* JADX INFO: renamed from: a */
                public final void mo20888a(xee xeeVar, float f, float f2) {
                    this.f140078a.m223230j(xeeVar, f, f2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m223229i() {
        return getProgress() > 0.5f;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m223230j(xee xeeVar, float f, float f2) {
        setProgress(f / 16.0f);
    }

    /* JADX INFO: renamed from: k */
    public final Layout m223231k(CharSequence charSequence) {
        TextPaint textPaint = this.f209366F;
        return new StaticLayout(charSequence, textPaint, (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: l */
    public final int m223232l(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        float f = this.f209392l;
        if (mode != 1073741824) {
            if (f == 0.0f) {
                this.f209392l = m223225e(getResources().getDisplayMetrics().density * 22.0f);
            }
            float f2 = this.f209392l;
            RectF rectF = this.f209388h;
            int iM223225e = m223225e(f2 + rectF.top + rectF.bottom);
            this.f209394n = iM223225e;
            if (iM223225e < 0) {
                this.f209394n = 0;
                this.f209392l = 0.0f;
                return size;
            }
            int iM223225e2 = m223225e(this.f209370J - iM223225e);
            if (iM223225e2 > 0) {
                this.f209394n += iM223225e2;
                this.f209392l += iM223225e2;
            }
            int iMax = (int) Math.max(this.f209392l, this.f209394n);
            return Math.max(Math.max(iMax, getPaddingTop() + iMax + getPaddingBottom()), getSuggestedMinimumHeight());
        }
        if (f != 0.0f) {
            RectF rectF2 = this.f209388h;
            int iM223225e3 = m223225e(f + rectF2.top + rectF2.bottom);
            this.f209394n = iM223225e3;
            int iM223225e4 = m223225e(Math.max(iM223225e3, this.f209370J));
            this.f209394n = iM223225e4;
            if ((((iM223225e4 + getPaddingTop()) + getPaddingBottom()) - Math.min(0.0f, this.f209388h.top)) - Math.min(0.0f, this.f209388h.bottom) > size) {
                this.f209392l = 0.0f;
            }
        }
        if (this.f209392l == 0.0f) {
            int iM223225e5 = m223225e(((size - getPaddingTop()) - getPaddingBottom()) + Math.min(0.0f, this.f209388h.top) + Math.min(0.0f, this.f209388h.bottom));
            this.f209394n = iM223225e5;
            if (iM223225e5 < 0) {
                this.f209394n = 0;
                this.f209392l = 0.0f;
                return size;
            }
            RectF rectF3 = this.f209388h;
            this.f209392l = m223225e((iM223225e5 - rectF3.top) - rectF3.bottom);
        }
        if (this.f209392l < 0.0f) {
            this.f209394n = 0;
            this.f209392l = 0.0f;
        }
        return size;
    }

    /* JADX INFO: renamed from: m */
    public final int m223233m(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int iM223225e = m223225e(this.f209369I);
        if (this.f209389i == 0.0f) {
            this.f209389i = 1.727f;
        }
        if (mode != 1073741824) {
            if (this.f209391k == 0.0f) {
                this.f209391k = m223225e(getResources().getDisplayMetrics().density * 22.0f);
            }
            if (this.f209389i == 0.0f) {
                this.f209389i = 1.727f;
            }
            int iM223225e2 = m223225e(this.f209391k * this.f209389i);
            float f = iM223225e + this.f209372L;
            float f2 = iM223225e2;
            float f3 = f2 - this.f209391k;
            RectF rectF = this.f209388h;
            int iM223225e3 = m223225e(f - ((f3 + Math.max(rectF.left, rectF.right)) + this.f209371K));
            RectF rectF2 = this.f209388h;
            int iM223225e4 = m223225e(rectF2.left + f2 + rectF2.right + Math.max(0, iM223225e3));
            this.f209393m = iM223225e4;
            if (iM223225e4 >= 0) {
                int iM223225e5 = m223225e(f2 + Math.max(0.0f, this.f209388h.left) + Math.max(0.0f, this.f209388h.right) + Math.max(0, iM223225e3));
                return Math.max(iM223225e5, getPaddingLeft() + iM223225e5 + getPaddingRight());
            }
            this.f209391k = 0.0f;
            this.f209393m = 0;
            return size;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        float f4 = this.f209391k;
        if (f4 != 0.0f) {
            int iM223225e6 = m223225e(f4 * this.f209389i);
            float f5 = this.f209372L + iM223225e;
            float f6 = iM223225e6;
            float f7 = f6 - this.f209391k;
            RectF rectF3 = this.f209388h;
            int iM223225e7 = (int) (f5 - (f7 + m223225e(Math.max(rectF3.left, rectF3.right))));
            RectF rectF4 = this.f209388h;
            int iM223225e8 = m223225e(rectF4.left + f6 + rectF4.right + Math.max(iM223225e7, 0));
            this.f209393m = iM223225e8;
            if (iM223225e8 < 0) {
                this.f209391k = 0.0f;
            }
            if (f6 + Math.max(this.f209388h.left, 0.0f) + Math.max(this.f209388h.right, 0.0f) + Math.max(iM223225e7, 0) > paddingLeft) {
                this.f209391k = 0.0f;
            }
        }
        if (this.f209391k == 0.0f) {
            int iM223225e9 = m223225e((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.f209388h.left, 0.0f)) - Math.max(this.f209388h.right, 0.0f));
            if (iM223225e9 < 0) {
                this.f209391k = 0.0f;
                this.f209393m = 0;
                return size;
            }
            float f8 = iM223225e9;
            this.f209391k = m223225e(f8 / this.f209389i);
            RectF rectF5 = this.f209388h;
            int iM223225e10 = m223225e(rectF5.left + f8 + rectF5.right);
            this.f209393m = iM223225e10;
            if (iM223225e10 < 0) {
                this.f209391k = 0.0f;
                this.f209393m = 0;
                return size;
            }
            float f9 = iM223225e + this.f209372L;
            float f10 = f8 - this.f209391k;
            RectF rectF6 = this.f209388h;
            int iM223225e11 = (int) (f9 - (f10 + m223225e(Math.max(rectF6.left, rectF6.right))));
            if (iM223225e11 > 0) {
                this.f209391k -= iM223225e11;
            }
            if (this.f209391k < 0.0f) {
                this.f209391k = 0.0f;
                this.f209393m = 0;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: n */
    public void m223234n(CharSequence charSequence, CharSequence charSequence2) {
        this.f209364D = charSequence;
        this.f209365E = charSequence2;
        this.f209367G = null;
        this.f209368H = null;
        this.f209375O = false;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: o */
    public void m223235o(float f, float f2, float f3, float f4) {
        this.f209388h.set(f, f2, f3, f4);
        this.f209375O = false;
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (!this.f209375O) {
            m223236p();
        }
        if (this.f209375O) {
            float fM223226f = m223226f(getProgress());
            this.f209382b.setColor(((Integer) this.f209385e.evaluate(fM223226f, Integer.valueOf(this.f209380T), Integer.valueOf(this.f209390j))).intValue());
            RectF rectF = this.f209398r;
            float f2 = this.f209387g;
            canvas.drawRoundRect(rectF, f2, f2, this.f209382b);
            this.f209383c.setColor(((Integer) this.f209385e.evaluate(fM223226f, Integer.valueOf(this.f209379S), Integer.valueOf(this.f209390j))).intValue());
            RectF rectF2 = this.f209402v;
            float f3 = this.f209387g;
            canvas.drawRoundRect(rectF2, f3, f3, this.f209383c);
            double d = fM223226f;
            Layout layout = d > 0.5d ? this.f209367G : this.f209368H;
            RectF rectF3 = d > 0.5d ? this.f209400t : this.f209401u;
            if (layout != null && rectF3 != null) {
                if (d >= 0.75d) {
                    f = (4.0f * fM223226f) - 3.0f;
                } else {
                    f = d < 0.25d ? 1.0f - (4.0f * fM223226f) : 0.0f;
                }
                int i = (int) (f * 255.0f);
                int i2 = d > 0.5d ? this.f209395o : this.f209396p;
                layout.getPaint().setARGB((Color.alpha(i2) * i) / 255, Color.red(i2), Color.green(i2), Color.blue(i2));
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                layout.draw(canvas);
                canvas.restore();
            }
            this.f209404x.set(this.f209397q);
            this.f209404x.offset(getProgress() * this.f209399s.width(), 0.0f);
            this.f209382b.setColor(((Integer) this.f209385e.evaluate(fM223226f, Integer.valueOf(this.f209379S), Integer.valueOf(this.f209380T))).intValue());
            RectF rectF4 = this.f209404x;
            float f4 = this.f209386f;
            canvas.drawRoundRect(rectF4, f4, f4, this.f209382b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f209367G == null && !TextUtils.isEmpty(this.f209364D)) {
            this.f209367G = m223231k(this.f209364D);
        }
        if (this.f209368H == null && !TextUtils.isEmpty(this.f209365E)) {
            this.f209368H = m223231k(this.f209365E);
        }
        Layout layout = this.f209367G;
        float width = layout != null ? layout.getWidth() : 0.0f;
        Layout layout2 = this.f209368H;
        float width2 = layout2 != null ? layout2.getWidth() : 0.0f;
        if (width == 0.0f && width2 == 0.0f) {
            this.f209369I = 0.0f;
        } else {
            this.f209369I = Math.max(width, width2);
        }
        Layout layout3 = this.f209367G;
        float height = layout3 != null ? layout3.getHeight() : 0.0f;
        Layout layout4 = this.f209368H;
        float height2 = layout4 != null ? layout4.getHeight() : 0.0f;
        if (height == 0.0f && height2 == 0.0f) {
            this.f209370J = 0.0f;
        } else {
            this.f209370J = Math.max(height, height2);
        }
        setMeasuredDimension(m223233m(i), m223232l(i2));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        m223234n(savedState.onText, savedState.offText);
        this.f209374N = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f209374N = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.onText = this.f209364D;
        savedState.offText = this.f209365E;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m223236p();
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
        boolean zM223229i;
        if (!isEnabled() || !isClickable() || !isFocusable() || !this.f209375O) {
            return false;
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX() - this.f209405y;
        float y = motionEvent.getY() - this.f209406z;
        if (action == 0) {
            this.f209405y = motionEvent.getX();
            this.f209406z = motionEvent.getY();
            this.f209361A = this.f209405y;
            setPressed(true);
        } else if (action == 1) {
            this.f209376P = false;
            float eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            if (Math.abs(x) < this.f209362B || Math.abs(y) >= this.f209362B || eventTime >= this.f209363C) {
                zM223229i = m223229i();
                if (zM223229i != isChecked()) {
                    playSoundEffect(0);
                    setChecked(zM223229i);
                } else {
                    m223222b(zM223229i);
                }
            } else {
                performClick();
            }
            if (isPressed()) {
                if (this.f209377Q == null) {
                    this.f209377Q = new RunnableC22575a();
                }
                if (!post(this.f209377Q)) {
                    this.f209377Q.run();
                }
            }
        } else if (action == 2) {
            float x2 = motionEvent.getX();
            setProgress(m223226f(getProgress() + ((x2 - this.f209361A) / this.f209399s.width())));
            this.f209361A = x2;
            if (!this.f209376P && (Math.abs(x) > this.f209362B / 2.0f || Math.abs(y) > this.f209362B / 2.0f)) {
                if (y == 0.0f || Math.abs(x) > Math.abs(y)) {
                    m223224d();
                } else if (Math.abs(y) > Math.abs(x)) {
                    return false;
                }
            }
        } else if (action == 3) {
            this.f209376P = false;
            float eventTime2 = motionEvent.getEventTime() - motionEvent.getDownTime();
            if (Math.abs(x) < this.f209362B) {
                zM223229i = m223229i();
                if (zM223229i != isChecked()) {
                    playSoundEffect(0);
                    setChecked(zM223229i);
                } else {
                    m223222b(zM223229i);
                }
            } else {
                zM223229i = m223229i();
                if (zM223229i != isChecked()) {
                    playSoundEffect(0);
                    setChecked(zM223229i);
                } else {
                    m223222b(zM223229i);
                }
            }
            if (isPressed()) {
                if (this.f209377Q == null) {
                    this.f209377Q = new RunnableC22575a();
                }
                if (!post(this.f209377Q)) {
                    this.f209377Q.run();
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m223236p() {
        float paddingTop;
        float paddingLeft;
        float f = this.f209391k;
        if (f != 0.0f) {
            float f2 = this.f209392l;
            if (f2 == 0.0f || this.f209393m == 0 || this.f209394n == 0) {
                return;
            }
            if (this.f209386f == -1.0f) {
                this.f209386f = Math.min(f, f2) / 2.0f;
            }
            if (this.f209387g == -1.0f) {
                this.f209387g = Math.min(this.f209393m, this.f209394n) / 2.0f;
            }
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int iM223225e = m223225e((this.f209393m - Math.min(0.0f, this.f209388h.left)) - Math.min(0.0f, this.f209388h.right));
            int iM223225e2 = m223225e((this.f209394n - Math.min(0.0f, this.f209388h.top)) - Math.min(0.0f, this.f209388h.bottom));
            if (measuredHeight <= iM223225e2) {
                paddingTop = getPaddingTop() + Math.max(0.0f, this.f209388h.top);
            } else {
                paddingTop = (((measuredHeight - iM223225e2) + 1) / 2.0f) + getPaddingTop() + Math.max(0.0f, this.f209388h.top);
            }
            if (measuredWidth <= this.f209393m) {
                paddingLeft = getPaddingLeft() + Math.max(0.0f, this.f209388h.left);
            } else {
                paddingLeft = (((measuredWidth - iM223225e) + 1) / 2.0f) + getPaddingLeft() + Math.max(0.0f, this.f209388h.left);
            }
            this.f209397q.set(paddingLeft, paddingTop, this.f209391k + paddingLeft, this.f209392l + paddingTop);
            RectF rectF = this.f209397q;
            float f3 = rectF.left;
            RectF rectF2 = this.f209388h;
            float f4 = f3 - rectF2.left;
            RectF rectF3 = this.f209398r;
            float f5 = rectF.top;
            float f6 = rectF2.top;
            rectF3.set(f4, f5 - f6, this.f209393m + f4, (f5 - f6) + this.f209394n);
            float f7 = (getResources().getDisplayMetrics().density * 2.0f) / 2.0f;
            float f8 = this.f209397q.top;
            float f9 = this.f209388h.top;
            this.f209402v.set(f4 + f7, (f8 - f9) + f7, (f4 + this.f209393m) - f7, ((f8 - f9) + this.f209394n) - f7);
            RectF rectF4 = this.f209399s;
            RectF rectF5 = this.f209397q;
            rectF4.set(rectF5.left, 0.0f, (this.f209398r.right - this.f209388h.right) - rectF5.width(), 0.0f);
            this.f209387g = Math.min(Math.min(this.f209398r.width(), this.f209398r.height()) / 2.0f, this.f209387g);
            if (this.f209367G != null) {
                RectF rectF6 = this.f209398r;
                float fWidth = (rectF6.left + (((((rectF6.width() + this.f209371K) - this.f209391k) - this.f209388h.right) - this.f209367G.getWidth()) / 2.0f)) - this.f209373M;
                RectF rectF7 = this.f209398r;
                float fHeight = rectF7.top + ((rectF7.height() - this.f209367G.getHeight()) / 2.0f);
                this.f209400t.set(fWidth, fHeight, this.f209367G.getWidth() + fWidth, this.f209367G.getHeight() + fHeight);
            }
            if (this.f209368H != null) {
                RectF rectF8 = this.f209398r;
                float fWidth2 = ((rectF8.right - (((((rectF8.width() + this.f209371K) - this.f209391k) - this.f209388h.left) - this.f209368H.getWidth()) / 2.0f)) - this.f209368H.getWidth()) + this.f209373M;
                RectF rectF9 = this.f209398r;
                float fHeight2 = rectF9.top + ((rectF9.height() - this.f209368H.getHeight()) / 2.0f);
                this.f209401u.set(fWidth2, fHeight2, this.f209368H.getWidth() + fWidth2, this.f209368H.getHeight() + fHeight2);
            }
            this.f209375O = true;
        }
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setActiveSliderColor(@ColorInt int i) {
        this.f209380T = i;
        invalidate();
    }

    public void setBackRadius(float f) {
        this.f209387g = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (isChecked() != z) {
            m223222b(z);
        }
        if (this.f209374N) {
            setCheckedImmediatelyNoEvent(z);
        } else {
            super.setChecked(z);
        }
    }

    public void setCheckedImmediately(boolean z) {
        super.setChecked(z);
        m223223c();
        setProgress(z ? 1.0f : 0.0f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z) {
        if (this.f209378R == null) {
            setCheckedImmediately(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z);
        super.setOnCheckedChangeListener(this.f209378R);
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.f209378R == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.f209378R);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f209378R = onCheckedChangeListener;
    }

    public void setTextAdjust(int i) {
        this.f209373M = i;
        this.f209375O = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i) {
        this.f209372L = i;
        this.f209375O = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i) {
        this.f209371K = i;
        this.f209375O = false;
        requestLayout();
        invalidate();
    }

    public void setThumbActiveColor(@ColorInt int i) {
        this.f209390j = i;
        invalidate();
    }

    public void setThumbInActiveColor(@ColorInt int i) {
        this.f209379S = i;
        invalidate();
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            m223235o(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            m223235o(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbRadius(float f) {
        this.f209386f = f;
        invalidate();
    }

    public void setThumbRangeRatio(float f) {
        this.f209389i = f;
        this.f209375O = false;
        requestLayout();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C22574a();
        CharSequence offText;
        CharSequence onText;

        /* JADX INFO: renamed from: v.VSwitchButton$SavedState$a */
        public class C22574a implements Parcelable.Creator<SavedState> {
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
