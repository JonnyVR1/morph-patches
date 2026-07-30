package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.m9c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class FeedTextSeekBar extends View {

    /* JADX INFO: renamed from: A */
    public int f39640A;

    /* JADX INFO: renamed from: B */
    public int f39641B;

    /* JADX INFO: renamed from: C */
    public int f39642C;

    /* JADX INFO: renamed from: D */
    public float f39643D;

    /* JADX INFO: renamed from: E */
    public int f39644E;

    /* JADX INFO: renamed from: F */
    public int f39645F;

    /* JADX INFO: renamed from: G */
    public int f39646G;

    /* JADX INFO: renamed from: H */
    public int f39647H;

    /* JADX INFO: renamed from: I */
    public String f39648I;

    /* JADX INFO: renamed from: a */
    public Paint f39649a;

    /* JADX INFO: renamed from: b */
    public Paint f39650b;

    /* JADX INFO: renamed from: c */
    public int f39651c;

    /* JADX INFO: renamed from: d */
    public int f39652d;

    /* JADX INFO: renamed from: e */
    public int f39653e;

    /* JADX INFO: renamed from: f */
    public int f39654f;

    /* JADX INFO: renamed from: g */
    public int f39655g;

    /* JADX INFO: renamed from: h */
    public boolean f39656h;

    /* JADX INFO: renamed from: i */
    public Drawable f39657i;

    /* JADX INFO: renamed from: j */
    public float f39658j;

    /* JADX INFO: renamed from: k */
    public float f39659k;

    /* JADX INFO: renamed from: l */
    public float f39660l;

    /* JADX INFO: renamed from: m */
    public float f39661m;

    /* JADX INFO: renamed from: n */
    public float f39662n;

    /* JADX INFO: renamed from: o */
    public float f39663o;

    /* JADX INFO: renamed from: p */
    public ClipDrawable f39664p;

    /* JADX INFO: renamed from: q */
    public ClipDrawable f39665q;

    /* JADX INFO: renamed from: r */
    public InterfaceC11170a f39666r;

    /* JADX INFO: renamed from: s */
    public Drawable f39667s;

    /* JADX INFO: renamed from: t */
    public int f39668t;

    /* JADX INFO: renamed from: u */
    public int f39669u;

    /* JADX INFO: renamed from: v */
    public int f39670v;

    /* JADX INFO: renamed from: w */
    public int f39671w;

    /* JADX INFO: renamed from: x */
    public int f39672x;

    /* JADX INFO: renamed from: y */
    public int f39673y;

    /* JADX INFO: renamed from: z */
    public Drawable f39674z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar$a */
    public interface InterfaceC11170a {
        /* JADX INFO: renamed from: a */
        void mo61558a(FeedTextSeekBar feedTextSeekBar, int i, boolean z);

        /* JADX INFO: renamed from: b */
        void mo61559b(FeedTextSeekBar feedTextSeekBar);

        /* JADX INFO: renamed from: c */
        void mo61560c(FeedTextSeekBar feedTextSeekBar);
    }

    public FeedTextSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39653e = 0;
        this.f39654f = 0;
        this.f39672x = 0;
        this.f39673y = 0;
        this.f39640A = 0;
        this.f39641B = 0;
        this.f39643D = 16.0f;
        this.f39644E = 0;
        this.f39648I = "";
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132725d0);
            if (typedArrayObtainStyledAttributes.hasValue(m9c0.f132743m0)) {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(m9c0.f132743m0);
                this.f39667s = drawable;
                if (drawable != null) {
                    this.f39672x = drawable.getIntrinsicWidth();
                    this.f39673y = this.f39667s.getIntrinsicHeight();
                }
            }
            this.f39672x = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f132747o0, this.f39672x);
            this.f39673y = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f132745n0, this.f39673y);
            this.f39658j = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f132729f0, this.f39658j);
            if (typedArrayObtainStyledAttributes.hasValue(m9c0.f132727e0)) {
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(m9c0.f132727e0);
                if (drawable2 instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable2;
                    this.f39657i = layerDrawable.findDrawableByLayerId(R.id.background);
                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                    if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
                        this.f39665q = (ClipDrawable) drawableFindDrawableByLayerId;
                    }
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.progress);
                    if (drawableFindDrawableByLayerId2 instanceof ClipDrawable) {
                        this.f39664p = (ClipDrawable) drawableFindDrawableByLayerId2;
                    }
                }
            }
            this.f39643D = typedArrayObtainStyledAttributes.getDimension(m9c0.f132741l0, 16.0f);
            this.f39647H = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f132739k0, 0.0f);
            this.f39642C = typedArrayObtainStyledAttributes.getColor(m9c0.f132737j0, RoundedDrawable.DEFAULT_BORDER_COLOR);
            if (typedArrayObtainStyledAttributes.hasValue(m9c0.f132731g0)) {
                Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(m9c0.f132731g0);
                this.f39674z = drawable3;
                if (drawable3 != null) {
                    this.f39641B = drawable3.getIntrinsicHeight();
                    this.f39640A = this.f39674z.getIntrinsicWidth();
                }
            }
            this.f39640A = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f132735i0, this.f39640A);
            this.f39641B = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f132733h0, this.f39641B);
            typedArrayObtainStyledAttributes.recycle();
        }
        m61572l();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61561a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = this.f39660l;
        return x >= f - ((float) this.f39668t) && x <= (f + this.f39659k) + ((float) this.f39671w);
    }

    /* JADX INFO: renamed from: b */
    public final void m61562b(Canvas canvas) {
        Drawable drawable;
        if ((this.f39654f != this.f39655g || this.f39665q == null) && (drawable = this.f39657i) != null) {
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m61563c(Canvas canvas) {
        ClipDrawable clipDrawable = this.f39664p;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m61567g(this.f39653e) * 10000.0f));
            this.f39664p.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m61564d(Canvas canvas) {
        ClipDrawable clipDrawable = this.f39665q;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m61567g(this.f39654f) * 10000.0f));
            this.f39665q.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m61565e(Canvas canvas) {
        Drawable drawable = this.f39674z;
        if (drawable != null) {
            drawable.setBounds((int) (m61567g(this.f39653e) * this.f39659k), 0, (int) ((m61567g(this.f39653e) * this.f39659k) + this.f39640A), this.f39641B);
            this.f39674z.draw(canvas);
        }
        if (TextUtils.isEmpty(this.f39648I)) {
            return;
        }
        if (this.f39648I.length() != this.f39644E) {
            this.f39644E = this.f39648I.length();
            this.f39645F = m61570j(this.f39648I, this.f39649a);
            this.f39646G = m61569i(this.f39648I, this.f39649a);
        }
        canvas.drawText(this.f39648I, (((int) (m61567g(this.f39653e) * this.f39659k)) + this.f39660l) - (this.f39645F / 2), ((this.f39641B - this.f39646G) / 2) + this.f39647H, this.f39649a);
    }

    /* JADX INFO: renamed from: f */
    public final void m61566f(Canvas canvas) {
        Drawable drawable = this.f39667s;
        if (drawable != null) {
            drawable.setBounds(((int) (m61567g(this.f39653e) * this.f39659k)) + this.f39668t, this.f39669u, (int) ((m61567g(this.f39653e) * this.f39659k) + this.f39671w), this.f39670v);
            this.f39667s.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m61567g(int i) {
        return (float) ((((double) i) * 1.0d) / ((double) this.f39655g));
    }

    public int getMax() {
        return this.f39655g;
    }

    public int getProgress() {
        return this.f39653e;
    }

    /* JADX INFO: renamed from: h */
    public final int m61568h(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        motionEvent.getY();
        return (int) (Math.min(Math.max(0.0f, (x - this.f39660l) / this.f39659k), 1.0f) * getMax());
    }

    /* JADX INFO: renamed from: i */
    public final int m61569i(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    /* JADX INFO: renamed from: j */
    public final int m61570j(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m61571k(MotionEvent motionEvent) {
        float fM61567g = this.f39660l + (m61567g(this.f39653e) * this.f39659k);
        double x = motionEvent.getX();
        double d = fM61567g;
        int i = this.f39672x;
        return x >= d - (((double) i) * 0.6d) && x <= d + (((double) i) * 0.6d);
    }

    /* JADX INFO: renamed from: l */
    public final void m61572l() {
        Paint paint = new Paint();
        this.f39649a = paint;
        paint.setAntiAlias(true);
        this.f39649a.setColor(this.f39642C);
        this.f39649a.setTextSize(this.f39643D);
        Paint paint2 = new Paint();
        this.f39650b = paint2;
        paint2.setAntiAlias(true);
        this.f39650b.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f39655g = 100;
    }

    /* JADX INFO: renamed from: m */
    public final void m61573m() {
        InterfaceC11170a interfaceC11170a = this.f39666r;
        if (interfaceC11170a != null) {
            interfaceC11170a.mo61558a(this, this.f39653e, this.f39656h);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m61565e(canvas);
        m61562b(canvas);
        m61564d(canvas);
        m61563c(canvas);
        m61566f(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int i3 = this.f39641B;
        Math.max(size + i3, this.f39673y + i3);
        Math.max(this.f39672x + size2, size2 + this.f39640A);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f39651c = i;
        this.f39652d = i2;
        this.f39659k = Math.min(i - this.f39672x, i - this.f39640A);
        float fMax = Math.max(this.f39672x / 2, this.f39640A / 2);
        this.f39660l = fMax;
        this.f39662n = fMax + this.f39659k;
        float f = this.f39673y;
        float f2 = this.f39658j;
        float f3 = ((f - f2) / 2.0f) + this.f39641B;
        this.f39661m = f3;
        this.f39663o = f3 + f2;
        int iMax = Math.max((this.f39640A / 2) - (this.f39672x / 2), 0);
        this.f39668t = iMax;
        int i5 = this.f39641B;
        this.f39669u = i5;
        this.f39671w = iMax + this.f39672x;
        this.f39670v = i5 + this.f39673y;
        Drawable drawable = this.f39657i;
        if (drawable != null) {
            drawable.setBounds((int) this.f39660l, (int) this.f39661m, (int) this.f39662n, (int) this.f39663o);
        }
        ClipDrawable clipDrawable = this.f39664p;
        if (clipDrawable != null) {
            clipDrawable.setBounds((int) this.f39660l, (int) this.f39661m, (int) this.f39662n, (int) this.f39663o);
        }
        ClipDrawable clipDrawable2 = this.f39665q;
        if (clipDrawable2 != null) {
            clipDrawable2.setBounds((int) this.f39660l, (int) this.f39661m, (int) this.f39662n, (int) this.f39663o);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                InterfaceC11170a interfaceC11170a = this.f39666r;
                if (interfaceC11170a != null && this.f39656h) {
                    interfaceC11170a.mo61560c(this);
                }
                this.f39656h = false;
            } else if (action == 2 && this.f39656h && m61561a(motionEvent)) {
                setProgress(m61568h(motionEvent));
                return true;
            }
        } else if (m61571k(motionEvent)) {
            this.f39656h = true;
            InterfaceC11170a interfaceC11170a2 = this.f39666r;
            if (interfaceC11170a2 != null) {
                interfaceC11170a2.mo61559b(this);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMax(int i) {
        this.f39655g = i;
    }

    public void setOnSeekBarChangeListener(InterfaceC11170a interfaceC11170a) {
        this.f39666r = interfaceC11170a;
    }

    public void setProgress(int i) {
        if (this.f39653e == i) {
            return;
        }
        this.f39653e = i;
        invalidate();
        m61573m();
    }

    public void setSecondaryProgress(int i) {
        if (this.f39654f == i) {
            return;
        }
        this.f39654f = i;
        invalidate();
    }

    public void setText(String str) {
        this.f39648I = str;
        invalidate();
    }

    public void setTextBgDrawable(Drawable drawable) {
        this.f39674z = drawable;
    }

    public void setTextBgHeight(int i) {
        this.f39641B = i;
    }

    public void setTextBgWidth(int i) {
        this.f39640A = i;
    }

    public void setTextColor(int i) {
        this.f39642C = i;
    }

    public void setTextPaddingTop(int i) {
        this.f39647H = i;
    }

    public void setTextSize(float f) {
        this.f39643D = f;
    }

    public void setThumbHeight(int i) {
        this.f39673y = i;
    }

    public void setThumbImage(Drawable drawable) {
        this.f39667s = drawable;
    }

    public void setThumbWith(int i) {
        this.f39672x = i;
    }

    public FeedTextSeekBar(Context context) {
        super(context);
        this.f39653e = 0;
        this.f39654f = 0;
        this.f39672x = 0;
        this.f39673y = 0;
        this.f39640A = 0;
        this.f39641B = 0;
        this.f39643D = 16.0f;
        this.f39644E = 0;
        this.f39648I = "";
        m61572l();
    }
}
