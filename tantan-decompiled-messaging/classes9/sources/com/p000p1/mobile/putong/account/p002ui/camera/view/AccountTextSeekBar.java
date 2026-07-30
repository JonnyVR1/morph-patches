package com.p000p1.mobile.putong.account.p002ui.camera.view;

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
import p006l.c9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountTextSeekBar extends View {

    /* JADX INFO: renamed from: A */
    public int f903A;

    /* JADX INFO: renamed from: B */
    public int f904B;

    /* JADX INFO: renamed from: C */
    public int f905C;

    /* JADX INFO: renamed from: D */
    public float f906D;

    /* JADX INFO: renamed from: E */
    public int f907E;

    /* JADX INFO: renamed from: F */
    public int f908F;

    /* JADX INFO: renamed from: G */
    public int f909G;

    /* JADX INFO: renamed from: H */
    public int f910H;

    /* JADX INFO: renamed from: I */
    public String f911I;

    /* JADX INFO: renamed from: a */
    public Paint f912a;

    /* JADX INFO: renamed from: b */
    public Paint f913b;

    /* JADX INFO: renamed from: c */
    public int f914c;

    /* JADX INFO: renamed from: d */
    public int f915d;

    /* JADX INFO: renamed from: e */
    public int f916e;

    /* JADX INFO: renamed from: f */
    public int f917f;

    /* JADX INFO: renamed from: g */
    public int f918g;

    /* JADX INFO: renamed from: h */
    public boolean f919h;

    /* JADX INFO: renamed from: i */
    public Drawable f920i;

    /* JADX INFO: renamed from: j */
    public float f921j;

    /* JADX INFO: renamed from: k */
    public float f922k;

    /* JADX INFO: renamed from: l */
    public float f923l;

    /* JADX INFO: renamed from: m */
    public float f924m;

    /* JADX INFO: renamed from: n */
    public float f925n;

    /* JADX INFO: renamed from: o */
    public float f926o;

    /* JADX INFO: renamed from: p */
    public ClipDrawable f927p;

    /* JADX INFO: renamed from: q */
    public ClipDrawable f928q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0091a f929r;

    /* JADX INFO: renamed from: s */
    public Drawable f930s;

    /* JADX INFO: renamed from: t */
    public int f931t;

    /* JADX INFO: renamed from: u */
    public int f932u;

    /* JADX INFO: renamed from: v */
    public int f933v;

    /* JADX INFO: renamed from: w */
    public int f934w;

    /* JADX INFO: renamed from: x */
    public int f935x;

    /* JADX INFO: renamed from: y */
    public int f936y;

    /* JADX INFO: renamed from: z */
    public Drawable f937z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountTextSeekBar$a */
    public interface InterfaceC0091a {
        /* JADX INFO: renamed from: a */
        void mo886a(AccountTextSeekBar accountTextSeekBar, int i, boolean z);

        /* JADX INFO: renamed from: b */
        void mo887b(AccountTextSeekBar accountTextSeekBar);

        /* JADX INFO: renamed from: c */
        void mo888c(AccountTextSeekBar accountTextSeekBar);
    }

    public AccountTextSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f916e = 0;
        this.f917f = 0;
        this.f935x = 0;
        this.f936y = 0;
        this.f903A = 0;
        this.f904B = 0;
        this.f906D = 16.0f;
        this.f907E = 0;
        this.f911I = "";
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f9541t);
            if (typedArrayObtainStyledAttributes.hasValue(c9c0.f9505B)) {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(c9c0.f9505B);
                this.f930s = drawable;
                if (drawable != null) {
                    this.f935x = drawable.getIntrinsicWidth();
                    this.f936y = this.f930s.getIntrinsicHeight();
                }
            }
            this.f935x = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f9507D, this.f935x);
            this.f936y = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f9506C, this.f936y);
            this.f921j = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f9543v, this.f921j);
            if (typedArrayObtainStyledAttributes.hasValue(c9c0.f9542u)) {
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(c9c0.f9542u);
                if (drawable2 instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable2;
                    this.f920i = layerDrawable.findDrawableByLayerId(R.id.background);
                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                    if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
                        this.f928q = (ClipDrawable) drawableFindDrawableByLayerId;
                    }
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.progress);
                    if (drawableFindDrawableByLayerId2 instanceof ClipDrawable) {
                        this.f927p = (ClipDrawable) drawableFindDrawableByLayerId2;
                    }
                }
            }
            this.f906D = typedArrayObtainStyledAttributes.getDimension(c9c0.f9504A, 16.0f);
            this.f910H = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f9547z, 0.0f);
            if (typedArrayObtainStyledAttributes.hasValue(c9c0.f9544w)) {
                Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(c9c0.f9544w);
                this.f937z = drawable3;
                if (drawable3 != null) {
                    this.f904B = drawable3.getIntrinsicHeight();
                    this.f903A = this.f937z.getIntrinsicWidth();
                }
            }
            this.f903A = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f9546y, this.f903A);
            this.f904B = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f9545x, this.f904B);
            typedArrayObtainStyledAttributes.recycle();
        }
        m1033l();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1022a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = this.f923l;
        return x >= f - ((float) this.f931t) && x <= (f + this.f922k) + ((float) this.f934w);
    }

    /* JADX INFO: renamed from: b */
    public final void m1023b(Canvas canvas) {
        Drawable drawable;
        if ((this.f917f != this.f918g || this.f928q == null) && (drawable = this.f920i) != null) {
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1024c(Canvas canvas) {
        ClipDrawable clipDrawable = this.f927p;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m1028g(this.f916e) * 10000.0f));
            this.f927p.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1025d(Canvas canvas) {
        ClipDrawable clipDrawable = this.f928q;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m1028g(this.f917f) * 10000.0f));
            this.f928q.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1026e(Canvas canvas) {
        Drawable drawable = this.f937z;
        if (drawable != null) {
            drawable.setBounds((int) (m1028g(this.f916e) * this.f922k), 0, (int) ((m1028g(this.f916e) * this.f922k) + this.f903A), this.f904B);
            this.f937z.draw(canvas);
        }
        if (TextUtils.isEmpty(this.f911I)) {
            return;
        }
        if (this.f911I.length() != this.f907E) {
            this.f907E = this.f911I.length();
            this.f908F = m1031j(this.f911I, this.f912a);
            this.f909G = m1030i(this.f911I, this.f912a);
        }
        canvas.drawText(this.f911I, (((int) (m1028g(this.f916e) * this.f922k)) + this.f923l) - (this.f908F / 2), ((this.f904B - this.f909G) / 2) + this.f910H, this.f912a);
    }

    /* JADX INFO: renamed from: f */
    public final void m1027f(Canvas canvas) {
        Drawable drawable = this.f930s;
        if (drawable != null) {
            drawable.setBounds(((int) (m1028g(this.f916e) * this.f922k)) + this.f931t, this.f932u, (int) ((m1028g(this.f916e) * this.f922k) + this.f934w), this.f933v);
            this.f930s.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m1028g(int i) {
        return (float) ((((double) i) * 1.0d) / ((double) this.f918g));
    }

    public int getMax() {
        return this.f918g;
    }

    public int getProgress() {
        return this.f916e;
    }

    /* JADX INFO: renamed from: h */
    public final int m1029h(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        motionEvent.getY();
        return (int) (Math.min(Math.max(0.0f, (x - this.f923l) / this.f922k), 1.0f) * getMax());
    }

    /* JADX INFO: renamed from: i */
    public final int m1030i(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    /* JADX INFO: renamed from: j */
    public final int m1031j(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1032k(MotionEvent motionEvent) {
        float fM1028g = this.f923l + (m1028g(this.f916e) * this.f922k);
        double x = motionEvent.getX();
        double d = fM1028g;
        int i = this.f935x;
        return x >= d - (((double) i) * 0.6d) && x <= d + (((double) i) * 0.6d);
    }

    /* JADX INFO: renamed from: l */
    public final void m1033l() {
        Paint paint = new Paint();
        this.f912a = paint;
        paint.setAntiAlias(true);
        this.f912a.setColor(-1);
        this.f912a.setTextSize(this.f906D);
        Paint paint2 = new Paint();
        this.f913b = paint2;
        paint2.setAntiAlias(true);
        this.f913b.setColor(-16777216);
        this.f918g = 100;
    }

    /* JADX INFO: renamed from: m */
    public final void m1034m() {
        InterfaceC0091a interfaceC0091a = this.f929r;
        if (interfaceC0091a != null) {
            interfaceC0091a.mo886a(this, this.f916e, this.f919h);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m1026e(canvas);
        m1023b(canvas);
        m1025d(canvas);
        m1024c(canvas);
        m1027f(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int i3 = this.f904B;
        Math.max(size + i3, this.f936y + i3);
        Math.max(this.f935x + size2, size2 + this.f903A);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f914c = i;
        this.f915d = i2;
        this.f922k = Math.min(i - this.f935x, i - this.f903A);
        float fMax = Math.max(this.f935x / 2, this.f903A / 2);
        this.f923l = fMax;
        this.f925n = fMax + this.f922k;
        float f = this.f936y;
        float f2 = this.f921j;
        float f3 = ((f - f2) / 2.0f) + this.f904B;
        this.f924m = f3;
        this.f926o = f3 + f2;
        int iMax = Math.max((this.f903A / 2) - (this.f935x / 2), 0);
        this.f931t = iMax;
        int i5 = this.f904B;
        this.f932u = i5;
        this.f934w = iMax + this.f935x;
        this.f933v = i5 + this.f936y;
        Drawable drawable = this.f920i;
        if (drawable != null) {
            drawable.setBounds((int) this.f923l, (int) this.f924m, (int) this.f925n, (int) this.f926o);
        }
        ClipDrawable clipDrawable = this.f927p;
        if (clipDrawable != null) {
            clipDrawable.setBounds((int) this.f923l, (int) this.f924m, (int) this.f925n, (int) this.f926o);
        }
        ClipDrawable clipDrawable2 = this.f928q;
        if (clipDrawable2 != null) {
            clipDrawable2.setBounds((int) this.f923l, (int) this.f924m, (int) this.f925n, (int) this.f926o);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                InterfaceC0091a interfaceC0091a = this.f929r;
                if (interfaceC0091a != null && this.f919h) {
                    interfaceC0091a.mo887b(this);
                }
                this.f919h = false;
            } else if (action == 2 && this.f919h && m1022a(motionEvent)) {
                setProgress(m1029h(motionEvent));
                return true;
            }
        } else if (m1032k(motionEvent)) {
            this.f919h = true;
            InterfaceC0091a interfaceC0091a2 = this.f929r;
            if (interfaceC0091a2 != null) {
                interfaceC0091a2.mo888c(this);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMax(int i) {
        this.f918g = i;
    }

    public void setOnSeekBarChangeListener(InterfaceC0091a interfaceC0091a) {
        this.f929r = interfaceC0091a;
    }

    public void setProgress(int i) {
        if (this.f916e == i) {
            return;
        }
        this.f916e = i;
        invalidate();
        m1034m();
    }

    public void setSecondaryProgress(int i) {
        if (this.f917f == i) {
            return;
        }
        this.f917f = i;
        invalidate();
    }

    public void setText(String str) {
        this.f911I = str;
        invalidate();
    }

    public void setTextBgDrawable(Drawable drawable) {
        this.f937z = drawable;
    }

    public void setTextBgHeight(int i) {
        this.f904B = i;
    }

    public void setTextBgWidth(int i) {
        this.f903A = i;
    }

    public void setTextColor(int i) {
        this.f905C = i;
    }

    public void setTextPaddingTop(int i) {
        this.f910H = i;
    }

    public void setTextSize(float f) {
        this.f906D = f;
    }

    public void setThumbHeight(int i) {
        this.f936y = i;
    }

    public void setThumbImage(Drawable drawable) {
        this.f930s = drawable;
    }

    public void setThumbWith(int i) {
        this.f935x = i;
    }

    public AccountTextSeekBar(Context context) {
        super(context);
        this.f916e = 0;
        this.f917f = 0;
        this.f935x = 0;
        this.f936y = 0;
        this.f903A = 0;
        this.f904B = 0;
        this.f906D = 16.0f;
        this.f907E = 0;
        this.f911I = "";
        m1033l();
    }
}
