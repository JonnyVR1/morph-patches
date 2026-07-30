package com.p046p1.mobile.putong.account.p050ui.camera.view;

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
import p149l.c9c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class AccountTextSeekBar extends View {

    /* JADX INFO: renamed from: A */
    public int f16914A;

    /* JADX INFO: renamed from: B */
    public int f16915B;

    /* JADX INFO: renamed from: C */
    public int f16916C;

    /* JADX INFO: renamed from: D */
    public float f16917D;

    /* JADX INFO: renamed from: E */
    public int f16918E;

    /* JADX INFO: renamed from: F */
    public int f16919F;

    /* JADX INFO: renamed from: G */
    public int f16920G;

    /* JADX INFO: renamed from: H */
    public int f16921H;

    /* JADX INFO: renamed from: I */
    public String f16922I;

    /* JADX INFO: renamed from: a */
    public Paint f16923a;

    /* JADX INFO: renamed from: b */
    public Paint f16924b;

    /* JADX INFO: renamed from: c */
    public int f16925c;

    /* JADX INFO: renamed from: d */
    public int f16926d;

    /* JADX INFO: renamed from: e */
    public int f16927e;

    /* JADX INFO: renamed from: f */
    public int f16928f;

    /* JADX INFO: renamed from: g */
    public int f16929g;

    /* JADX INFO: renamed from: h */
    public boolean f16930h;

    /* JADX INFO: renamed from: i */
    public Drawable f16931i;

    /* JADX INFO: renamed from: j */
    public float f16932j;

    /* JADX INFO: renamed from: k */
    public float f16933k;

    /* JADX INFO: renamed from: l */
    public float f16934l;

    /* JADX INFO: renamed from: m */
    public float f16935m;

    /* JADX INFO: renamed from: n */
    public float f16936n;

    /* JADX INFO: renamed from: o */
    public float f16937o;

    /* JADX INFO: renamed from: p */
    public ClipDrawable f16938p;

    /* JADX INFO: renamed from: q */
    public ClipDrawable f16939q;

    /* JADX INFO: renamed from: r */
    public InterfaceC4665a f16940r;

    /* JADX INFO: renamed from: s */
    public Drawable f16941s;

    /* JADX INFO: renamed from: t */
    public int f16942t;

    /* JADX INFO: renamed from: u */
    public int f16943u;

    /* JADX INFO: renamed from: v */
    public int f16944v;

    /* JADX INFO: renamed from: w */
    public int f16945w;

    /* JADX INFO: renamed from: x */
    public int f16946x;

    /* JADX INFO: renamed from: y */
    public int f16947y;

    /* JADX INFO: renamed from: z */
    public Drawable f16948z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountTextSeekBar$a */
    public interface InterfaceC4665a {
        /* JADX INFO: renamed from: a */
        void mo28980a(AccountTextSeekBar accountTextSeekBar, int i, boolean z);

        /* JADX INFO: renamed from: b */
        void mo28981b(AccountTextSeekBar accountTextSeekBar);

        /* JADX INFO: renamed from: c */
        void mo28982c(AccountTextSeekBar accountTextSeekBar);
    }

    public AccountTextSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16927e = 0;
        this.f16928f = 0;
        this.f16946x = 0;
        this.f16947y = 0;
        this.f16914A = 0;
        this.f16915B = 0;
        this.f16917D = 16.0f;
        this.f16918E = 0;
        this.f16922I = "";
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f79918t);
            if (typedArrayObtainStyledAttributes.hasValue(c9c0.f79882B)) {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(c9c0.f79882B);
                this.f16941s = drawable;
                if (drawable != null) {
                    this.f16946x = drawable.getIntrinsicWidth();
                    this.f16947y = this.f16941s.getIntrinsicHeight();
                }
            }
            this.f16946x = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f79884D, this.f16946x);
            this.f16947y = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f79883C, this.f16947y);
            this.f16932j = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f79920v, this.f16932j);
            if (typedArrayObtainStyledAttributes.hasValue(c9c0.f79919u)) {
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(c9c0.f79919u);
                if (drawable2 instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable2;
                    this.f16931i = layerDrawable.findDrawableByLayerId(R.id.background);
                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                    if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
                        this.f16939q = (ClipDrawable) drawableFindDrawableByLayerId;
                    }
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.progress);
                    if (drawableFindDrawableByLayerId2 instanceof ClipDrawable) {
                        this.f16938p = (ClipDrawable) drawableFindDrawableByLayerId2;
                    }
                }
            }
            this.f16917D = typedArrayObtainStyledAttributes.getDimension(c9c0.f79881A, 16.0f);
            this.f16921H = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f79924z, 0.0f);
            if (typedArrayObtainStyledAttributes.hasValue(c9c0.f79921w)) {
                Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(c9c0.f79921w);
                this.f16948z = drawable3;
                if (drawable3 != null) {
                    this.f16915B = drawable3.getIntrinsicHeight();
                    this.f16914A = this.f16948z.getIntrinsicWidth();
                }
            }
            this.f16914A = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f79923y, this.f16914A);
            this.f16915B = (int) typedArrayObtainStyledAttributes.getDimension(c9c0.f79922x, this.f16915B);
            typedArrayObtainStyledAttributes.recycle();
        }
        m29127l();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29116a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = this.f16934l;
        return x >= f - ((float) this.f16942t) && x <= (f + this.f16933k) + ((float) this.f16945w);
    }

    /* JADX INFO: renamed from: b */
    public final void m29117b(Canvas canvas) {
        Drawable drawable;
        if ((this.f16928f != this.f16929g || this.f16939q == null) && (drawable = this.f16931i) != null) {
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m29118c(Canvas canvas) {
        ClipDrawable clipDrawable = this.f16938p;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m29122g(this.f16927e) * 10000.0f));
            this.f16938p.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m29119d(Canvas canvas) {
        ClipDrawable clipDrawable = this.f16939q;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m29122g(this.f16928f) * 10000.0f));
            this.f16939q.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m29120e(Canvas canvas) {
        Drawable drawable = this.f16948z;
        if (drawable != null) {
            drawable.setBounds((int) (m29122g(this.f16927e) * this.f16933k), 0, (int) ((m29122g(this.f16927e) * this.f16933k) + this.f16914A), this.f16915B);
            this.f16948z.draw(canvas);
        }
        if (TextUtils.isEmpty(this.f16922I)) {
            return;
        }
        if (this.f16922I.length() != this.f16918E) {
            this.f16918E = this.f16922I.length();
            this.f16919F = m29125j(this.f16922I, this.f16923a);
            this.f16920G = m29124i(this.f16922I, this.f16923a);
        }
        canvas.drawText(this.f16922I, (((int) (m29122g(this.f16927e) * this.f16933k)) + this.f16934l) - (this.f16919F / 2), ((this.f16915B - this.f16920G) / 2) + this.f16921H, this.f16923a);
    }

    /* JADX INFO: renamed from: f */
    public final void m29121f(Canvas canvas) {
        Drawable drawable = this.f16941s;
        if (drawable != null) {
            drawable.setBounds(((int) (m29122g(this.f16927e) * this.f16933k)) + this.f16942t, this.f16943u, (int) ((m29122g(this.f16927e) * this.f16933k) + this.f16945w), this.f16944v);
            this.f16941s.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m29122g(int i) {
        return (float) ((((double) i) * 1.0d) / ((double) this.f16929g));
    }

    public int getMax() {
        return this.f16929g;
    }

    public int getProgress() {
        return this.f16927e;
    }

    /* JADX INFO: renamed from: h */
    public final int m29123h(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        motionEvent.getY();
        return (int) (Math.min(Math.max(0.0f, (x - this.f16934l) / this.f16933k), 1.0f) * getMax());
    }

    /* JADX INFO: renamed from: i */
    public final int m29124i(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    /* JADX INFO: renamed from: j */
    public final int m29125j(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m29126k(MotionEvent motionEvent) {
        float fM29122g = this.f16934l + (m29122g(this.f16927e) * this.f16933k);
        double x = motionEvent.getX();
        double d = fM29122g;
        int i = this.f16946x;
        return x >= d - (((double) i) * 0.6d) && x <= d + (((double) i) * 0.6d);
    }

    /* JADX INFO: renamed from: l */
    public final void m29127l() {
        Paint paint = new Paint();
        this.f16923a = paint;
        paint.setAntiAlias(true);
        this.f16923a.setColor(-1);
        this.f16923a.setTextSize(this.f16917D);
        Paint paint2 = new Paint();
        this.f16924b = paint2;
        paint2.setAntiAlias(true);
        this.f16924b.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f16929g = 100;
    }

    /* JADX INFO: renamed from: m */
    public final void m29128m() {
        InterfaceC4665a interfaceC4665a = this.f16940r;
        if (interfaceC4665a != null) {
            interfaceC4665a.mo28980a(this, this.f16927e, this.f16930h);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m29120e(canvas);
        m29117b(canvas);
        m29119d(canvas);
        m29118c(canvas);
        m29121f(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int i3 = this.f16915B;
        Math.max(size + i3, this.f16947y + i3);
        Math.max(this.f16946x + size2, size2 + this.f16914A);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f16925c = i;
        this.f16926d = i2;
        this.f16933k = Math.min(i - this.f16946x, i - this.f16914A);
        float fMax = Math.max(this.f16946x / 2, this.f16914A / 2);
        this.f16934l = fMax;
        this.f16936n = fMax + this.f16933k;
        float f = this.f16947y;
        float f2 = this.f16932j;
        float f3 = ((f - f2) / 2.0f) + this.f16915B;
        this.f16935m = f3;
        this.f16937o = f3 + f2;
        int iMax = Math.max((this.f16914A / 2) - (this.f16946x / 2), 0);
        this.f16942t = iMax;
        int i5 = this.f16915B;
        this.f16943u = i5;
        this.f16945w = iMax + this.f16946x;
        this.f16944v = i5 + this.f16947y;
        Drawable drawable = this.f16931i;
        if (drawable != null) {
            drawable.setBounds((int) this.f16934l, (int) this.f16935m, (int) this.f16936n, (int) this.f16937o);
        }
        ClipDrawable clipDrawable = this.f16938p;
        if (clipDrawable != null) {
            clipDrawable.setBounds((int) this.f16934l, (int) this.f16935m, (int) this.f16936n, (int) this.f16937o);
        }
        ClipDrawable clipDrawable2 = this.f16939q;
        if (clipDrawable2 != null) {
            clipDrawable2.setBounds((int) this.f16934l, (int) this.f16935m, (int) this.f16936n, (int) this.f16937o);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                InterfaceC4665a interfaceC4665a = this.f16940r;
                if (interfaceC4665a != null && this.f16930h) {
                    interfaceC4665a.mo28981b(this);
                }
                this.f16930h = false;
            } else if (action == 2 && this.f16930h && m29116a(motionEvent)) {
                setProgress(m29123h(motionEvent));
                return true;
            }
        } else if (m29126k(motionEvent)) {
            this.f16930h = true;
            InterfaceC4665a interfaceC4665a2 = this.f16940r;
            if (interfaceC4665a2 != null) {
                interfaceC4665a2.mo28982c(this);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMax(int i) {
        this.f16929g = i;
    }

    public void setOnSeekBarChangeListener(InterfaceC4665a interfaceC4665a) {
        this.f16940r = interfaceC4665a;
    }

    public void setProgress(int i) {
        if (this.f16927e == i) {
            return;
        }
        this.f16927e = i;
        invalidate();
        m29128m();
    }

    public void setSecondaryProgress(int i) {
        if (this.f16928f == i) {
            return;
        }
        this.f16928f = i;
        invalidate();
    }

    public void setText(String str) {
        this.f16922I = str;
        invalidate();
    }

    public void setTextBgDrawable(Drawable drawable) {
        this.f16948z = drawable;
    }

    public void setTextBgHeight(int i) {
        this.f16915B = i;
    }

    public void setTextBgWidth(int i) {
        this.f16914A = i;
    }

    public void setTextColor(int i) {
        this.f16916C = i;
    }

    public void setTextPaddingTop(int i) {
        this.f16921H = i;
    }

    public void setTextSize(float f) {
        this.f16917D = f;
    }

    public void setThumbHeight(int i) {
        this.f16947y = i;
    }

    public void setThumbImage(Drawable drawable) {
        this.f16941s = drawable;
    }

    public void setThumbWith(int i) {
        this.f16946x = i;
    }

    public AccountTextSeekBar(Context context) {
        super(context);
        this.f16927e = 0;
        this.f16928f = 0;
        this.f16946x = 0;
        this.f16947y = 0;
        this.f16914A = 0;
        this.f16915B = 0;
        this.f16917D = 16.0f;
        this.f16918E = 0;
        this.f16922I = "";
        m29127l();
    }
}
