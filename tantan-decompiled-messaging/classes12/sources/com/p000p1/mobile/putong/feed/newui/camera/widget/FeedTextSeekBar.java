package com.p000p1.mobile.putong.feed.newui.camera.widget;

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
import p007l.m9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedTextSeekBar extends View {

    /* JADX INFO: renamed from: A */
    public int f1101A;

    /* JADX INFO: renamed from: B */
    public int f1102B;

    /* JADX INFO: renamed from: C */
    public int f1103C;

    /* JADX INFO: renamed from: D */
    public float f1104D;

    /* JADX INFO: renamed from: E */
    public int f1105E;

    /* JADX INFO: renamed from: F */
    public int f1106F;

    /* JADX INFO: renamed from: G */
    public int f1107G;

    /* JADX INFO: renamed from: H */
    public int f1108H;

    /* JADX INFO: renamed from: I */
    public String f1109I;

    /* JADX INFO: renamed from: a */
    public Paint f1110a;

    /* JADX INFO: renamed from: b */
    public Paint f1111b;

    /* JADX INFO: renamed from: c */
    public int f1112c;

    /* JADX INFO: renamed from: d */
    public int f1113d;

    /* JADX INFO: renamed from: e */
    public int f1114e;

    /* JADX INFO: renamed from: f */
    public int f1115f;

    /* JADX INFO: renamed from: g */
    public int f1116g;

    /* JADX INFO: renamed from: h */
    public boolean f1117h;

    /* JADX INFO: renamed from: i */
    public Drawable f1118i;

    /* JADX INFO: renamed from: j */
    public float f1119j;

    /* JADX INFO: renamed from: k */
    public float f1120k;

    /* JADX INFO: renamed from: l */
    public float f1121l;

    /* JADX INFO: renamed from: m */
    public float f1122m;

    /* JADX INFO: renamed from: n */
    public float f1123n;

    /* JADX INFO: renamed from: o */
    public float f1124o;

    /* JADX INFO: renamed from: p */
    public ClipDrawable f1125p;

    /* JADX INFO: renamed from: q */
    public ClipDrawable f1126q;

    /* JADX INFO: renamed from: r */
    public InterfaceC2014a f1127r;

    /* JADX INFO: renamed from: s */
    public Drawable f1128s;

    /* JADX INFO: renamed from: t */
    public int f1129t;

    /* JADX INFO: renamed from: u */
    public int f1130u;

    /* JADX INFO: renamed from: v */
    public int f1131v;

    /* JADX INFO: renamed from: w */
    public int f1132w;

    /* JADX INFO: renamed from: x */
    public int f1133x;

    /* JADX INFO: renamed from: y */
    public int f1134y;

    /* JADX INFO: renamed from: z */
    public Drawable f1135z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar$a */
    public interface InterfaceC2014a {
        /* JADX INFO: renamed from: a */
        void mo2510a(FeedTextSeekBar feedTextSeekBar, int i, boolean z);

        /* JADX INFO: renamed from: b */
        void mo2511b(FeedTextSeekBar feedTextSeekBar);

        /* JADX INFO: renamed from: c */
        void mo2512c(FeedTextSeekBar feedTextSeekBar);
    }

    public FeedTextSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1114e = 0;
        this.f1115f = 0;
        this.f1133x = 0;
        this.f1134y = 0;
        this.f1101A = 0;
        this.f1102B = 0;
        this.f1104D = 16.0f;
        this.f1105E = 0;
        this.f1109I = "";
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10316d0);
            if (typedArrayObtainStyledAttributes.hasValue(m9c0.f10334m0)) {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(m9c0.f10334m0);
                this.f1128s = drawable;
                if (drawable != null) {
                    this.f1133x = drawable.getIntrinsicWidth();
                    this.f1134y = this.f1128s.getIntrinsicHeight();
                }
            }
            this.f1133x = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f10338o0, this.f1133x);
            this.f1134y = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f10336n0, this.f1134y);
            this.f1119j = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f10320f0, this.f1119j);
            if (typedArrayObtainStyledAttributes.hasValue(m9c0.f10318e0)) {
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(m9c0.f10318e0);
                if (drawable2 instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable2;
                    this.f1118i = layerDrawable.findDrawableByLayerId(R.id.background);
                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                    if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
                        this.f1126q = (ClipDrawable) drawableFindDrawableByLayerId;
                    }
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.progress);
                    if (drawableFindDrawableByLayerId2 instanceof ClipDrawable) {
                        this.f1125p = (ClipDrawable) drawableFindDrawableByLayerId2;
                    }
                }
            }
            this.f1104D = typedArrayObtainStyledAttributes.getDimension(m9c0.f10332l0, 16.0f);
            this.f1108H = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f10330k0, 0.0f);
            this.f1103C = typedArrayObtainStyledAttributes.getColor(m9c0.f10328j0, -16777216);
            if (typedArrayObtainStyledAttributes.hasValue(m9c0.f10322g0)) {
                Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(m9c0.f10322g0);
                this.f1135z = drawable3;
                if (drawable3 != null) {
                    this.f1102B = drawable3.getIntrinsicHeight();
                    this.f1101A = this.f1135z.getIntrinsicWidth();
                }
            }
            this.f1101A = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f10326i0, this.f1101A);
            this.f1102B = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f10324h0, this.f1102B);
            typedArrayObtainStyledAttributes.recycle();
        }
        m2524l();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2513a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = this.f1121l;
        return x >= f - ((float) this.f1129t) && x <= (f + this.f1120k) + ((float) this.f1132w);
    }

    /* JADX INFO: renamed from: b */
    public final void m2514b(Canvas canvas) {
        Drawable drawable;
        if ((this.f1115f != this.f1116g || this.f1126q == null) && (drawable = this.f1118i) != null) {
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2515c(Canvas canvas) {
        ClipDrawable clipDrawable = this.f1125p;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m2519g(this.f1114e) * 10000.0f));
            this.f1125p.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2516d(Canvas canvas) {
        ClipDrawable clipDrawable = this.f1126q;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m2519g(this.f1115f) * 10000.0f));
            this.f1126q.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2517e(Canvas canvas) {
        Drawable drawable = this.f1135z;
        if (drawable != null) {
            drawable.setBounds((int) (m2519g(this.f1114e) * this.f1120k), 0, (int) ((m2519g(this.f1114e) * this.f1120k) + this.f1101A), this.f1102B);
            this.f1135z.draw(canvas);
        }
        if (TextUtils.isEmpty(this.f1109I)) {
            return;
        }
        if (this.f1109I.length() != this.f1105E) {
            this.f1105E = this.f1109I.length();
            this.f1106F = m2522j(this.f1109I, this.f1110a);
            this.f1107G = m2521i(this.f1109I, this.f1110a);
        }
        canvas.drawText(this.f1109I, (((int) (m2519g(this.f1114e) * this.f1120k)) + this.f1121l) - (this.f1106F / 2), ((this.f1102B - this.f1107G) / 2) + this.f1108H, this.f1110a);
    }

    /* JADX INFO: renamed from: f */
    public final void m2518f(Canvas canvas) {
        Drawable drawable = this.f1128s;
        if (drawable != null) {
            drawable.setBounds(((int) (m2519g(this.f1114e) * this.f1120k)) + this.f1129t, this.f1130u, (int) ((m2519g(this.f1114e) * this.f1120k) + this.f1132w), this.f1131v);
            this.f1128s.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m2519g(int i) {
        return (float) ((((double) i) * 1.0d) / ((double) this.f1116g));
    }

    public int getMax() {
        return this.f1116g;
    }

    public int getProgress() {
        return this.f1114e;
    }

    /* JADX INFO: renamed from: h */
    public final int m2520h(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        motionEvent.getY();
        return (int) (Math.min(Math.max(0.0f, (x - this.f1121l) / this.f1120k), 1.0f) * getMax());
    }

    /* JADX INFO: renamed from: i */
    public final int m2521i(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    /* JADX INFO: renamed from: j */
    public final int m2522j(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2523k(MotionEvent motionEvent) {
        float fM2519g = this.f1121l + (m2519g(this.f1114e) * this.f1120k);
        double x = motionEvent.getX();
        double d = fM2519g;
        int i = this.f1133x;
        return x >= d - (((double) i) * 0.6d) && x <= d + (((double) i) * 0.6d);
    }

    /* JADX INFO: renamed from: l */
    public final void m2524l() {
        Paint paint = new Paint();
        this.f1110a = paint;
        paint.setAntiAlias(true);
        this.f1110a.setColor(this.f1103C);
        this.f1110a.setTextSize(this.f1104D);
        Paint paint2 = new Paint();
        this.f1111b = paint2;
        paint2.setAntiAlias(true);
        this.f1111b.setColor(-16777216);
        this.f1116g = 100;
    }

    /* JADX INFO: renamed from: m */
    public final void m2525m() {
        InterfaceC2014a interfaceC2014a = this.f1127r;
        if (interfaceC2014a != null) {
            interfaceC2014a.mo2510a(this, this.f1114e, this.f1117h);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m2517e(canvas);
        m2514b(canvas);
        m2516d(canvas);
        m2515c(canvas);
        m2518f(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int i3 = this.f1102B;
        Math.max(size + i3, this.f1134y + i3);
        Math.max(this.f1133x + size2, size2 + this.f1101A);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1112c = i;
        this.f1113d = i2;
        this.f1120k = Math.min(i - this.f1133x, i - this.f1101A);
        float fMax = Math.max(this.f1133x / 2, this.f1101A / 2);
        this.f1121l = fMax;
        this.f1123n = fMax + this.f1120k;
        float f = this.f1134y;
        float f2 = this.f1119j;
        float f3 = ((f - f2) / 2.0f) + this.f1102B;
        this.f1122m = f3;
        this.f1124o = f3 + f2;
        int iMax = Math.max((this.f1101A / 2) - (this.f1133x / 2), 0);
        this.f1129t = iMax;
        int i5 = this.f1102B;
        this.f1130u = i5;
        this.f1132w = iMax + this.f1133x;
        this.f1131v = i5 + this.f1134y;
        Drawable drawable = this.f1118i;
        if (drawable != null) {
            drawable.setBounds((int) this.f1121l, (int) this.f1122m, (int) this.f1123n, (int) this.f1124o);
        }
        ClipDrawable clipDrawable = this.f1125p;
        if (clipDrawable != null) {
            clipDrawable.setBounds((int) this.f1121l, (int) this.f1122m, (int) this.f1123n, (int) this.f1124o);
        }
        ClipDrawable clipDrawable2 = this.f1126q;
        if (clipDrawable2 != null) {
            clipDrawable2.setBounds((int) this.f1121l, (int) this.f1122m, (int) this.f1123n, (int) this.f1124o);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                InterfaceC2014a interfaceC2014a = this.f1127r;
                if (interfaceC2014a != null && this.f1117h) {
                    interfaceC2014a.mo2512c(this);
                }
                this.f1117h = false;
            } else if (action == 2 && this.f1117h && m2513a(motionEvent)) {
                setProgress(m2520h(motionEvent));
                return true;
            }
        } else if (m2523k(motionEvent)) {
            this.f1117h = true;
            InterfaceC2014a interfaceC2014a2 = this.f1127r;
            if (interfaceC2014a2 != null) {
                interfaceC2014a2.mo2511b(this);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMax(int i) {
        this.f1116g = i;
    }

    public void setOnSeekBarChangeListener(InterfaceC2014a interfaceC2014a) {
        this.f1127r = interfaceC2014a;
    }

    public void setProgress(int i) {
        if (this.f1114e == i) {
            return;
        }
        this.f1114e = i;
        invalidate();
        m2525m();
    }

    public void setSecondaryProgress(int i) {
        if (this.f1115f == i) {
            return;
        }
        this.f1115f = i;
        invalidate();
    }

    public void setText(String str) {
        this.f1109I = str;
        invalidate();
    }

    public void setTextBgDrawable(Drawable drawable) {
        this.f1135z = drawable;
    }

    public void setTextBgHeight(int i) {
        this.f1102B = i;
    }

    public void setTextBgWidth(int i) {
        this.f1101A = i;
    }

    public void setTextColor(int i) {
        this.f1103C = i;
    }

    public void setTextPaddingTop(int i) {
        this.f1108H = i;
    }

    public void setTextSize(float f) {
        this.f1104D = f;
    }

    public void setThumbHeight(int i) {
        this.f1134y = i;
    }

    public void setThumbImage(Drawable drawable) {
        this.f1128s = drawable;
    }

    public void setThumbWith(int i) {
        this.f1133x = i;
    }

    public FeedTextSeekBar(Context context) {
        super(context);
        this.f1114e = 0;
        this.f1115f = 0;
        this.f1133x = 0;
        this.f1134y = 0;
        this.f1101A = 0;
        this.f1102B = 0;
        this.f1104D = 16.0f;
        this.f1105E = 0;
        this.f1109I = "";
        m2524l();
    }
}
