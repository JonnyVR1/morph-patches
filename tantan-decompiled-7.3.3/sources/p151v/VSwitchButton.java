package p151v;

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
import p153l.bge;
import p153l.ezf0;
import p153l.hhc0;
import p153l.tyf0;
import p153l.z8c0;
import p153l.zsi;

/* JADX INFO: loaded from: classes3.dex */
public class VSwitchButton extends CompoundButton {

    /* JADX INFO: renamed from: U */
    public static final int[] f210281U = {R.attr.state_checked, R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: V */
    public static final int[] f210282V = {-16842912, R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: A */
    public float f210283A;

    /* JADX INFO: renamed from: B */
    public int f210284B;

    /* JADX INFO: renamed from: C */
    public int f210285C;

    /* JADX INFO: renamed from: D */
    public CharSequence f210286D;

    /* JADX INFO: renamed from: E */
    public CharSequence f210287E;

    /* JADX INFO: renamed from: F */
    public TextPaint f210288F;

    /* JADX INFO: renamed from: G */
    public Layout f210289G;

    /* JADX INFO: renamed from: H */
    public Layout f210290H;

    /* JADX INFO: renamed from: I */
    public float f210291I;

    /* JADX INFO: renamed from: J */
    public float f210292J;

    /* JADX INFO: renamed from: K */
    public int f210293K;

    /* JADX INFO: renamed from: L */
    public int f210294L;

    /* JADX INFO: renamed from: M */
    public int f210295M;

    /* JADX INFO: renamed from: N */
    public boolean f210296N;

    /* JADX INFO: renamed from: O */
    public boolean f210297O;

    /* JADX INFO: renamed from: P */
    public boolean f210298P;

    /* JADX INFO: renamed from: Q */
    public RunnableC22690a f210299Q;

    /* JADX INFO: renamed from: R */
    public CompoundButton.OnCheckedChangeListener f210300R;

    /* JADX INFO: renamed from: S */
    public int f210301S;

    /* JADX INFO: renamed from: T */
    public int f210302T;

    /* JADX INFO: renamed from: a */
    public final int f210303a;

    /* JADX INFO: renamed from: b */
    public Paint f210304b;

    /* JADX INFO: renamed from: c */
    public Paint f210305c;

    /* JADX INFO: renamed from: d */
    public tyf0 f210306d;

    /* JADX INFO: renamed from: e */
    public final ArgbEvaluator f210307e;

    /* JADX INFO: renamed from: f */
    public float f210308f;

    /* JADX INFO: renamed from: g */
    public float f210309g;

    /* JADX INFO: renamed from: h */
    public RectF f210310h;

    /* JADX INFO: renamed from: i */
    public float f210311i;

    /* JADX INFO: renamed from: j */
    public int f210312j;

    /* JADX INFO: renamed from: k */
    public float f210313k;

    /* JADX INFO: renamed from: l */
    public float f210314l;

    /* JADX INFO: renamed from: m */
    public int f210315m;

    /* JADX INFO: renamed from: n */
    public int f210316n;

    /* JADX INFO: renamed from: o */
    public int f210317o;

    /* JADX INFO: renamed from: p */
    public int f210318p;

    /* JADX INFO: renamed from: q */
    public RectF f210319q;

    /* JADX INFO: renamed from: r */
    public RectF f210320r;

    /* JADX INFO: renamed from: s */
    public RectF f210321s;

    /* JADX INFO: renamed from: t */
    public RectF f210322t;

    /* JADX INFO: renamed from: u */
    public RectF f210323u;

    /* JADX INFO: renamed from: v */
    public RectF f210324v;

    /* JADX INFO: renamed from: w */
    public float f210325w;

    /* JADX INFO: renamed from: x */
    public RectF f210326x;

    /* JADX INFO: renamed from: y */
    public float f210327y;

    /* JADX INFO: renamed from: z */
    public float f210328z;

    /* JADX INFO: renamed from: v.VSwitchButton$a */
    public final class RunnableC22690a implements Runnable {
        public RunnableC22690a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VSwitchButton.this.setPressed(false);
        }
    }

    public VSwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210303a = getResources().getColor(z8c0.f203359t);
        this.f210307e = new ArgbEvaluator();
        this.f210308f = -1.0f;
        this.f210309g = -1.0f;
        this.f210312j = getResources().getColor(z8c0.f203359t);
        this.f210296N = false;
        this.f210297O = false;
        this.f210298P = false;
        this.f210301S = getResources().getColor(z8c0.f203356q);
        this.f210302T = -1;
        m224473g(context, attributeSet);
    }

    private float getProgress() {
        return this.f210325w;
    }

    private void setProgress(float f) {
        this.f210325w = f;
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m224468b(boolean z) {
        if (this.f210306d == null) {
            return;
        }
        m224469c();
        tyf0 tyf0Var = this.f210306d;
        if (z) {
            tyf0Var.m104127j(this.f210325w * 16.0f).m193592o(16.0f);
        } else {
            tyf0Var.m104127j(this.f210325w * 16.0f).m193592o(0.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m224469c() {
        tyf0 tyf0Var = this.f210306d;
        if (tyf0Var == null || !tyf0Var.m104125g()) {
            return;
        }
        this.f210306d.m104121c();
    }

    /* JADX INFO: renamed from: d */
    public final void m224470d() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        this.f210298P = true;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            int defaultColor = textColors.getDefaultColor();
            this.f210317o = textColors.getColorForState(f210281U, defaultColor);
            this.f210318p = textColors.getColorForState(f210282V, defaultColor);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m224471e(double d) {
        return (int) Math.ceil(d);
    }

    /* JADX INFO: renamed from: f */
    public final float m224472f(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: g */
    public final void m224473g(Context context, AttributeSet attributeSet) {
        float dimension;
        float dimension2;
        float dimension3;
        float dimension4;
        this.f210284B = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f210285C = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.f210304b = new Paint(1);
        Paint paint = new Paint(1);
        this.f210305c = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f210305c.setStrokeWidth(getResources().getDisplayMetrics().density * 2.0f);
        this.f210305c.setStrokeCap(Paint.Cap.ROUND);
        this.f210288F = getPaint();
        this.f210319q = new RectF();
        this.f210320r = new RectF();
        this.f210324v = new RectF();
        this.f210321s = new RectF();
        this.f210310h = new RectF();
        this.f210322t = new RectF();
        this.f210323u = new RectF();
        this.f210326x = new RectF();
        float f = getResources().getDisplayMetrics().density * 4.0f;
        TypedArray typedArrayObtainStyledAttributes = attributeSet == null ? null : context.obtainStyledAttributes(attributeSet, hhc0.f109582H4);
        if (typedArrayObtainStyledAttributes != null) {
            float dimension5 = typedArrayObtainStyledAttributes.getDimension(hhc0.f109645R4, f);
            dimension2 = typedArrayObtainStyledAttributes.getDimension(hhc0.f109657T4, dimension5);
            dimension3 = typedArrayObtainStyledAttributes.getDimension(hhc0.f109663U4, dimension5);
            dimension4 = typedArrayObtainStyledAttributes.getDimension(hhc0.f109669V4, dimension5);
            dimension = typedArrayObtainStyledAttributes.getDimension(hhc0.f109651S4, dimension5);
            this.f210313k = typedArrayObtainStyledAttributes.getDimension(hhc0.f109687Y4, 0.0f);
            this.f210314l = typedArrayObtainStyledAttributes.getDimension(hhc0.f109639Q4, 0.0f);
            this.f210308f = typedArrayObtainStyledAttributes.getDimension(hhc0.f109675W4, -1.0f);
            this.f210309g = typedArrayObtainStyledAttributes.getDimension(hhc0.f109596J4, -1.0f);
            this.f210311i = typedArrayObtainStyledAttributes.getFloat(hhc0.f109681X4, 1.727f);
            this.f210312j = typedArrayObtainStyledAttributes.getColor(hhc0.f109589I4, this.f210303a);
            this.f210301S = typedArrayObtainStyledAttributes.getColor(hhc0.f109603K4, getResources().getColor(z8c0.f203356q));
            this.f210286D = typedArrayObtainStyledAttributes.getString(hhc0.f109627O4);
            this.f210287E = typedArrayObtainStyledAttributes.getString(hhc0.f109621N4);
            this.f210293K = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109633P4, 0);
            this.f210294L = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109615M4, 0);
            this.f210295M = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109609L4, 0);
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
        this.f210310h.set(dimension2, dimension4, dimension3, dimension);
        float fWidth = this.f210310h.width();
        float fMax = this.f210311i;
        if (fWidth >= 0.0f) {
            fMax = Math.max(fMax, 1.0f);
        }
        this.f210311i = fMax;
        if (isChecked()) {
            setProgress(1.0f);
        }
        m224474h();
    }

    public float getBackRadius() {
        return this.f210309g;
    }

    public PointF getBackSizeF() {
        return new PointF(this.f210320r.width(), this.f210320r.height());
    }

    public CharSequence getTextOff() {
        return this.f210287E;
    }

    public CharSequence getTextOn() {
        return this.f210286D;
    }

    public float getThumbHeight() {
        return this.f210314l;
    }

    public RectF getThumbMargin() {
        return this.f210310h;
    }

    public float getThumbRadius() {
        return this.f210308f;
    }

    public float getThumbRangeRatio() {
        return this.f210311i;
    }

    public float getThumbWidth() {
        return this.f210313k;
    }

    /* JADX INFO: renamed from: h */
    public final void m224474h() {
        if (this.f210306d == null) {
            boolean zIsChecked = isChecked();
            tyf0 tyf0VarM104127j = new tyf0(new zsi(zIsChecked ? 16.0f : 0.0f)).m193595r(new ezf0().m123347d(0.61f).m123349f(600.0f)).m104127j(zIsChecked ? 16.0f : 0.0f);
            this.f210306d = tyf0VarM104127j;
            tyf0VarM104127j.m104120b(new bge.InterfaceC16001r() { // from class: l.tzk0
                @Override // p153l.bge.InterfaceC16001r
                /* JADX INFO: renamed from: a */
                public final void mo21887a(bge bgeVar, float f, float f2) {
                    this.f176783a.m224476j(bgeVar, f, f2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m224475i() {
        return getProgress() > 0.5f;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m224476j(bge bgeVar, float f, float f2) {
        setProgress(f / 16.0f);
    }

    /* JADX INFO: renamed from: k */
    public final Layout m224477k(CharSequence charSequence) {
        TextPaint textPaint = this.f210288F;
        return new StaticLayout(charSequence, textPaint, (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: l */
    public final int m224478l(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        float f = this.f210314l;
        if (mode != 1073741824) {
            if (f == 0.0f) {
                this.f210314l = m224471e(getResources().getDisplayMetrics().density * 22.0f);
            }
            float f2 = this.f210314l;
            RectF rectF = this.f210310h;
            int iM224471e = m224471e(f2 + rectF.top + rectF.bottom);
            this.f210316n = iM224471e;
            if (iM224471e < 0) {
                this.f210316n = 0;
                this.f210314l = 0.0f;
                return size;
            }
            int iM224471e2 = m224471e(this.f210292J - iM224471e);
            if (iM224471e2 > 0) {
                this.f210316n += iM224471e2;
                this.f210314l += iM224471e2;
            }
            int iMax = (int) Math.max(this.f210314l, this.f210316n);
            return Math.max(Math.max(iMax, getPaddingTop() + iMax + getPaddingBottom()), getSuggestedMinimumHeight());
        }
        if (f != 0.0f) {
            RectF rectF2 = this.f210310h;
            int iM224471e3 = m224471e(f + rectF2.top + rectF2.bottom);
            this.f210316n = iM224471e3;
            int iM224471e4 = m224471e(Math.max(iM224471e3, this.f210292J));
            this.f210316n = iM224471e4;
            if ((((iM224471e4 + getPaddingTop()) + getPaddingBottom()) - Math.min(0.0f, this.f210310h.top)) - Math.min(0.0f, this.f210310h.bottom) > size) {
                this.f210314l = 0.0f;
            }
        }
        if (this.f210314l == 0.0f) {
            int iM224471e5 = m224471e(((size - getPaddingTop()) - getPaddingBottom()) + Math.min(0.0f, this.f210310h.top) + Math.min(0.0f, this.f210310h.bottom));
            this.f210316n = iM224471e5;
            if (iM224471e5 < 0) {
                this.f210316n = 0;
                this.f210314l = 0.0f;
                return size;
            }
            RectF rectF3 = this.f210310h;
            this.f210314l = m224471e((iM224471e5 - rectF3.top) - rectF3.bottom);
        }
        if (this.f210314l < 0.0f) {
            this.f210316n = 0;
            this.f210314l = 0.0f;
        }
        return size;
    }

    /* JADX INFO: renamed from: m */
    public final int m224479m(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int iM224471e = m224471e(this.f210291I);
        if (this.f210311i == 0.0f) {
            this.f210311i = 1.727f;
        }
        if (mode != 1073741824) {
            if (this.f210313k == 0.0f) {
                this.f210313k = m224471e(getResources().getDisplayMetrics().density * 22.0f);
            }
            if (this.f210311i == 0.0f) {
                this.f210311i = 1.727f;
            }
            int iM224471e2 = m224471e(this.f210313k * this.f210311i);
            float f = iM224471e + this.f210294L;
            float f2 = iM224471e2;
            float f3 = f2 - this.f210313k;
            RectF rectF = this.f210310h;
            int iM224471e3 = m224471e(f - ((f3 + Math.max(rectF.left, rectF.right)) + this.f210293K));
            RectF rectF2 = this.f210310h;
            int iM224471e4 = m224471e(rectF2.left + f2 + rectF2.right + Math.max(0, iM224471e3));
            this.f210315m = iM224471e4;
            if (iM224471e4 >= 0) {
                int iM224471e5 = m224471e(f2 + Math.max(0.0f, this.f210310h.left) + Math.max(0.0f, this.f210310h.right) + Math.max(0, iM224471e3));
                return Math.max(iM224471e5, getPaddingLeft() + iM224471e5 + getPaddingRight());
            }
            this.f210313k = 0.0f;
            this.f210315m = 0;
            return size;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        float f4 = this.f210313k;
        if (f4 != 0.0f) {
            int iM224471e6 = m224471e(f4 * this.f210311i);
            float f5 = this.f210294L + iM224471e;
            float f6 = iM224471e6;
            float f7 = f6 - this.f210313k;
            RectF rectF3 = this.f210310h;
            int iM224471e7 = (int) (f5 - (f7 + m224471e(Math.max(rectF3.left, rectF3.right))));
            RectF rectF4 = this.f210310h;
            int iM224471e8 = m224471e(rectF4.left + f6 + rectF4.right + Math.max(iM224471e7, 0));
            this.f210315m = iM224471e8;
            if (iM224471e8 < 0) {
                this.f210313k = 0.0f;
            }
            if (f6 + Math.max(this.f210310h.left, 0.0f) + Math.max(this.f210310h.right, 0.0f) + Math.max(iM224471e7, 0) > paddingLeft) {
                this.f210313k = 0.0f;
            }
        }
        if (this.f210313k == 0.0f) {
            int iM224471e9 = m224471e((((size - getPaddingLeft()) - getPaddingRight()) - Math.max(this.f210310h.left, 0.0f)) - Math.max(this.f210310h.right, 0.0f));
            if (iM224471e9 < 0) {
                this.f210313k = 0.0f;
                this.f210315m = 0;
                return size;
            }
            float f8 = iM224471e9;
            this.f210313k = m224471e(f8 / this.f210311i);
            RectF rectF5 = this.f210310h;
            int iM224471e10 = m224471e(rectF5.left + f8 + rectF5.right);
            this.f210315m = iM224471e10;
            if (iM224471e10 < 0) {
                this.f210313k = 0.0f;
                this.f210315m = 0;
                return size;
            }
            float f9 = iM224471e + this.f210294L;
            float f10 = f8 - this.f210313k;
            RectF rectF6 = this.f210310h;
            int iM224471e11 = (int) (f9 - (f10 + m224471e(Math.max(rectF6.left, rectF6.right))));
            if (iM224471e11 > 0) {
                this.f210313k -= iM224471e11;
            }
            if (this.f210313k < 0.0f) {
                this.f210313k = 0.0f;
                this.f210315m = 0;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: n */
    public void m224480n(CharSequence charSequence, CharSequence charSequence2) {
        this.f210286D = charSequence;
        this.f210287E = charSequence2;
        this.f210289G = null;
        this.f210290H = null;
        this.f210297O = false;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: o */
    public void m224481o(float f, float f2, float f3, float f4) {
        this.f210310h.set(f, f2, f3, f4);
        this.f210297O = false;
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (!this.f210297O) {
            m224482p();
        }
        if (this.f210297O) {
            float fM224472f = m224472f(getProgress());
            this.f210304b.setColor(((Integer) this.f210307e.evaluate(fM224472f, Integer.valueOf(this.f210302T), Integer.valueOf(this.f210312j))).intValue());
            RectF rectF = this.f210320r;
            float f2 = this.f210309g;
            canvas.drawRoundRect(rectF, f2, f2, this.f210304b);
            this.f210305c.setColor(((Integer) this.f210307e.evaluate(fM224472f, Integer.valueOf(this.f210301S), Integer.valueOf(this.f210312j))).intValue());
            RectF rectF2 = this.f210324v;
            float f3 = this.f210309g;
            canvas.drawRoundRect(rectF2, f3, f3, this.f210305c);
            double d = fM224472f;
            Layout layout = d > 0.5d ? this.f210289G : this.f210290H;
            RectF rectF3 = d > 0.5d ? this.f210322t : this.f210323u;
            if (layout != null && rectF3 != null) {
                if (d >= 0.75d) {
                    f = (4.0f * fM224472f) - 3.0f;
                } else {
                    f = d < 0.25d ? 1.0f - (4.0f * fM224472f) : 0.0f;
                }
                int i = (int) (f * 255.0f);
                int i2 = d > 0.5d ? this.f210317o : this.f210318p;
                layout.getPaint().setARGB((Color.alpha(i2) * i) / 255, Color.red(i2), Color.green(i2), Color.blue(i2));
                canvas.save();
                canvas.translate(rectF3.left, rectF3.top);
                layout.draw(canvas);
                canvas.restore();
            }
            this.f210326x.set(this.f210319q);
            this.f210326x.offset(getProgress() * this.f210321s.width(), 0.0f);
            this.f210304b.setColor(((Integer) this.f210307e.evaluate(fM224472f, Integer.valueOf(this.f210301S), Integer.valueOf(this.f210302T))).intValue());
            RectF rectF4 = this.f210326x;
            float f4 = this.f210308f;
            canvas.drawRoundRect(rectF4, f4, f4, this.f210304b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f210289G == null && !TextUtils.isEmpty(this.f210286D)) {
            this.f210289G = m224477k(this.f210286D);
        }
        if (this.f210290H == null && !TextUtils.isEmpty(this.f210287E)) {
            this.f210290H = m224477k(this.f210287E);
        }
        Layout layout = this.f210289G;
        float width = layout != null ? layout.getWidth() : 0.0f;
        Layout layout2 = this.f210290H;
        float width2 = layout2 != null ? layout2.getWidth() : 0.0f;
        if (width == 0.0f && width2 == 0.0f) {
            this.f210291I = 0.0f;
        } else {
            this.f210291I = Math.max(width, width2);
        }
        Layout layout3 = this.f210289G;
        float height = layout3 != null ? layout3.getHeight() : 0.0f;
        Layout layout4 = this.f210290H;
        float height2 = layout4 != null ? layout4.getHeight() : 0.0f;
        if (height == 0.0f && height2 == 0.0f) {
            this.f210292J = 0.0f;
        } else {
            this.f210292J = Math.max(height, height2);
        }
        setMeasuredDimension(m224479m(i), m224478l(i2));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        m224480n(savedState.onText, savedState.offText);
        this.f210296N = true;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f210296N = false;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.onText = this.f210286D;
        savedState.offText = this.f210287E;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m224482p();
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
        boolean zM224475i;
        if (!isEnabled() || !isClickable() || !isFocusable() || !this.f210297O) {
            return false;
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX() - this.f210327y;
        float y = motionEvent.getY() - this.f210328z;
        if (action == 0) {
            this.f210327y = motionEvent.getX();
            this.f210328z = motionEvent.getY();
            this.f210283A = this.f210327y;
            setPressed(true);
        } else if (action == 1) {
            this.f210298P = false;
            float eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            if (Math.abs(x) < this.f210284B || Math.abs(y) >= this.f210284B || eventTime >= this.f210285C) {
                zM224475i = m224475i();
                if (zM224475i != isChecked()) {
                    playSoundEffect(0);
                    setChecked(zM224475i);
                } else {
                    m224468b(zM224475i);
                }
            } else {
                performClick();
            }
            if (isPressed()) {
                if (this.f210299Q == null) {
                    this.f210299Q = new RunnableC22690a();
                }
                if (!post(this.f210299Q)) {
                    this.f210299Q.run();
                }
            }
        } else if (action == 2) {
            float x2 = motionEvent.getX();
            setProgress(m224472f(getProgress() + ((x2 - this.f210283A) / this.f210321s.width())));
            this.f210283A = x2;
            if (!this.f210298P && (Math.abs(x) > this.f210284B / 2.0f || Math.abs(y) > this.f210284B / 2.0f)) {
                if (y == 0.0f || Math.abs(x) > Math.abs(y)) {
                    m224470d();
                } else if (Math.abs(y) > Math.abs(x)) {
                    return false;
                }
            }
        } else if (action == 3) {
            this.f210298P = false;
            float eventTime2 = motionEvent.getEventTime() - motionEvent.getDownTime();
            if (Math.abs(x) < this.f210284B) {
                zM224475i = m224475i();
                if (zM224475i != isChecked()) {
                    playSoundEffect(0);
                    setChecked(zM224475i);
                } else {
                    m224468b(zM224475i);
                }
            } else {
                zM224475i = m224475i();
                if (zM224475i != isChecked()) {
                    playSoundEffect(0);
                    setChecked(zM224475i);
                } else {
                    m224468b(zM224475i);
                }
            }
            if (isPressed()) {
                if (this.f210299Q == null) {
                    this.f210299Q = new RunnableC22690a();
                }
                if (!post(this.f210299Q)) {
                    this.f210299Q.run();
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m224482p() {
        float paddingTop;
        float paddingLeft;
        float f = this.f210313k;
        if (f != 0.0f) {
            float f2 = this.f210314l;
            if (f2 == 0.0f || this.f210315m == 0 || this.f210316n == 0) {
                return;
            }
            if (this.f210308f == -1.0f) {
                this.f210308f = Math.min(f, f2) / 2.0f;
            }
            if (this.f210309g == -1.0f) {
                this.f210309g = Math.min(this.f210315m, this.f210316n) / 2.0f;
            }
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int iM224471e = m224471e((this.f210315m - Math.min(0.0f, this.f210310h.left)) - Math.min(0.0f, this.f210310h.right));
            int iM224471e2 = m224471e((this.f210316n - Math.min(0.0f, this.f210310h.top)) - Math.min(0.0f, this.f210310h.bottom));
            if (measuredHeight <= iM224471e2) {
                paddingTop = getPaddingTop() + Math.max(0.0f, this.f210310h.top);
            } else {
                paddingTop = (((measuredHeight - iM224471e2) + 1) / 2.0f) + getPaddingTop() + Math.max(0.0f, this.f210310h.top);
            }
            if (measuredWidth <= this.f210315m) {
                paddingLeft = getPaddingLeft() + Math.max(0.0f, this.f210310h.left);
            } else {
                paddingLeft = (((measuredWidth - iM224471e) + 1) / 2.0f) + getPaddingLeft() + Math.max(0.0f, this.f210310h.left);
            }
            this.f210319q.set(paddingLeft, paddingTop, this.f210313k + paddingLeft, this.f210314l + paddingTop);
            RectF rectF = this.f210319q;
            float f3 = rectF.left;
            RectF rectF2 = this.f210310h;
            float f4 = f3 - rectF2.left;
            RectF rectF3 = this.f210320r;
            float f5 = rectF.top;
            float f6 = rectF2.top;
            rectF3.set(f4, f5 - f6, this.f210315m + f4, (f5 - f6) + this.f210316n);
            float f7 = (getResources().getDisplayMetrics().density * 2.0f) / 2.0f;
            float f8 = this.f210319q.top;
            float f9 = this.f210310h.top;
            this.f210324v.set(f4 + f7, (f8 - f9) + f7, (f4 + this.f210315m) - f7, ((f8 - f9) + this.f210316n) - f7);
            RectF rectF4 = this.f210321s;
            RectF rectF5 = this.f210319q;
            rectF4.set(rectF5.left, 0.0f, (this.f210320r.right - this.f210310h.right) - rectF5.width(), 0.0f);
            this.f210309g = Math.min(Math.min(this.f210320r.width(), this.f210320r.height()) / 2.0f, this.f210309g);
            if (this.f210289G != null) {
                RectF rectF6 = this.f210320r;
                float fWidth = (rectF6.left + (((((rectF6.width() + this.f210293K) - this.f210313k) - this.f210310h.right) - this.f210289G.getWidth()) / 2.0f)) - this.f210295M;
                RectF rectF7 = this.f210320r;
                float fHeight = rectF7.top + ((rectF7.height() - this.f210289G.getHeight()) / 2.0f);
                this.f210322t.set(fWidth, fHeight, this.f210289G.getWidth() + fWidth, this.f210289G.getHeight() + fHeight);
            }
            if (this.f210290H != null) {
                RectF rectF8 = this.f210320r;
                float fWidth2 = ((rectF8.right - (((((rectF8.width() + this.f210293K) - this.f210313k) - this.f210310h.left) - this.f210290H.getWidth()) / 2.0f)) - this.f210290H.getWidth()) + this.f210295M;
                RectF rectF9 = this.f210320r;
                float fHeight2 = rectF9.top + ((rectF9.height() - this.f210290H.getHeight()) / 2.0f);
                this.f210323u.set(fWidth2, fHeight2, this.f210290H.getWidth() + fWidth2, this.f210290H.getHeight() + fHeight2);
            }
            this.f210297O = true;
        }
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setActiveSliderColor(@ColorInt int i) {
        this.f210302T = i;
        invalidate();
    }

    public void setBackRadius(float f) {
        this.f210309g = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (isChecked() != z) {
            m224468b(z);
        }
        if (this.f210296N) {
            setCheckedImmediatelyNoEvent(z);
        } else {
            super.setChecked(z);
        }
    }

    public void setCheckedImmediately(boolean z) {
        super.setChecked(z);
        m224469c();
        setProgress(z ? 1.0f : 0.0f);
        invalidate();
    }

    public void setCheckedImmediatelyNoEvent(boolean z) {
        if (this.f210300R == null) {
            setCheckedImmediately(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setCheckedImmediately(z);
        super.setOnCheckedChangeListener(this.f210300R);
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.f210300R == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.f210300R);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f210300R = onCheckedChangeListener;
    }

    public void setTextAdjust(int i) {
        this.f210295M = i;
        this.f210297O = false;
        requestLayout();
        invalidate();
    }

    public void setTextExtra(int i) {
        this.f210294L = i;
        this.f210297O = false;
        requestLayout();
        invalidate();
    }

    public void setTextThumbInset(int i) {
        this.f210293K = i;
        this.f210297O = false;
        requestLayout();
        invalidate();
    }

    public void setThumbActiveColor(@ColorInt int i) {
        this.f210312j = i;
        invalidate();
    }

    public void setThumbInActiveColor(@ColorInt int i) {
        this.f210301S = i;
        invalidate();
    }

    public void setThumbMargin(RectF rectF) {
        if (rectF == null) {
            m224481o(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            m224481o(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public void setThumbRadius(float f) {
        this.f210308f = f;
        invalidate();
    }

    public void setThumbRangeRatio(float f) {
        this.f210311i = f;
        this.f210297O = false;
        requestLayout();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C22689a();
        CharSequence offText;
        CharSequence onText;

        /* JADX INFO: renamed from: v.VSwitchButton$SavedState$a */
        public class C22689a implements Parcelable.Creator<SavedState> {
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
