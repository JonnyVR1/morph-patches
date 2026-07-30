package com.p051p1.mobile.putong.account.p055ui.camera.view;

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
import p153l.ihc0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class AccountTextSeekBar extends View {

    /* JADX INFO: renamed from: A */
    public int f17633A;

    /* JADX INFO: renamed from: B */
    public int f17634B;

    /* JADX INFO: renamed from: C */
    public int f17635C;

    /* JADX INFO: renamed from: D */
    public float f17636D;

    /* JADX INFO: renamed from: E */
    public int f17637E;

    /* JADX INFO: renamed from: F */
    public int f17638F;

    /* JADX INFO: renamed from: G */
    public int f17639G;

    /* JADX INFO: renamed from: H */
    public int f17640H;

    /* JADX INFO: renamed from: I */
    public String f17641I;

    /* JADX INFO: renamed from: a */
    public Paint f17642a;

    /* JADX INFO: renamed from: b */
    public Paint f17643b;

    /* JADX INFO: renamed from: c */
    public int f17644c;

    /* JADX INFO: renamed from: d */
    public int f17645d;

    /* JADX INFO: renamed from: e */
    public int f17646e;

    /* JADX INFO: renamed from: f */
    public int f17647f;

    /* JADX INFO: renamed from: g */
    public int f17648g;

    /* JADX INFO: renamed from: h */
    public boolean f17649h;

    /* JADX INFO: renamed from: i */
    public Drawable f17650i;

    /* JADX INFO: renamed from: j */
    public float f17651j;

    /* JADX INFO: renamed from: k */
    public float f17652k;

    /* JADX INFO: renamed from: l */
    public float f17653l;

    /* JADX INFO: renamed from: m */
    public float f17654m;

    /* JADX INFO: renamed from: n */
    public float f17655n;

    /* JADX INFO: renamed from: o */
    public float f17656o;

    /* JADX INFO: renamed from: p */
    public ClipDrawable f17657p;

    /* JADX INFO: renamed from: q */
    public ClipDrawable f17658q;

    /* JADX INFO: renamed from: r */
    public InterfaceC4816a f17659r;

    /* JADX INFO: renamed from: s */
    public Drawable f17660s;

    /* JADX INFO: renamed from: t */
    public int f17661t;

    /* JADX INFO: renamed from: u */
    public int f17662u;

    /* JADX INFO: renamed from: v */
    public int f17663v;

    /* JADX INFO: renamed from: w */
    public int f17664w;

    /* JADX INFO: renamed from: x */
    public int f17665x;

    /* JADX INFO: renamed from: y */
    public int f17666y;

    /* JADX INFO: renamed from: z */
    public Drawable f17667z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountTextSeekBar$a */
    public interface InterfaceC4816a {
        /* JADX INFO: renamed from: a */
        void mo29979a(AccountTextSeekBar accountTextSeekBar, int i, boolean z);

        /* JADX INFO: renamed from: b */
        void mo29980b(AccountTextSeekBar accountTextSeekBar);

        /* JADX INFO: renamed from: c */
        void mo29981c(AccountTextSeekBar accountTextSeekBar);
    }

    public AccountTextSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17646e = 0;
        this.f17647f = 0;
        this.f17665x = 0;
        this.f17666y = 0;
        this.f17633A = 0;
        this.f17634B = 0;
        this.f17636D = 16.0f;
        this.f17637E = 0;
        this.f17641I = "";
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ihc0.f114923t);
            if (typedArrayObtainStyledAttributes.hasValue(ihc0.f114887B)) {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(ihc0.f114887B);
                this.f17660s = drawable;
                if (drawable != null) {
                    this.f17665x = drawable.getIntrinsicWidth();
                    this.f17666y = this.f17660s.getIntrinsicHeight();
                }
            }
            this.f17665x = (int) typedArrayObtainStyledAttributes.getDimension(ihc0.f114889D, this.f17665x);
            this.f17666y = (int) typedArrayObtainStyledAttributes.getDimension(ihc0.f114888C, this.f17666y);
            this.f17651j = (int) typedArrayObtainStyledAttributes.getDimension(ihc0.f114925v, this.f17651j);
            if (typedArrayObtainStyledAttributes.hasValue(ihc0.f114924u)) {
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(ihc0.f114924u);
                if (drawable2 instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable2;
                    this.f17650i = layerDrawable.findDrawableByLayerId(R.id.background);
                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                    if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
                        this.f17658q = (ClipDrawable) drawableFindDrawableByLayerId;
                    }
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.progress);
                    if (drawableFindDrawableByLayerId2 instanceof ClipDrawable) {
                        this.f17657p = (ClipDrawable) drawableFindDrawableByLayerId2;
                    }
                }
            }
            this.f17636D = typedArrayObtainStyledAttributes.getDimension(ihc0.f114886A, 16.0f);
            this.f17640H = (int) typedArrayObtainStyledAttributes.getDimension(ihc0.f114929z, 0.0f);
            if (typedArrayObtainStyledAttributes.hasValue(ihc0.f114926w)) {
                Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(ihc0.f114926w);
                this.f17667z = drawable3;
                if (drawable3 != null) {
                    this.f17634B = drawable3.getIntrinsicHeight();
                    this.f17633A = this.f17667z.getIntrinsicWidth();
                }
            }
            this.f17633A = (int) typedArrayObtainStyledAttributes.getDimension(ihc0.f114928y, this.f17633A);
            this.f17634B = (int) typedArrayObtainStyledAttributes.getDimension(ihc0.f114927x, this.f17634B);
            typedArrayObtainStyledAttributes.recycle();
        }
        m30126l();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30115a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = this.f17653l;
        return x >= f - ((float) this.f17661t) && x <= (f + this.f17652k) + ((float) this.f17664w);
    }

    /* JADX INFO: renamed from: b */
    public final void m30116b(Canvas canvas) {
        Drawable drawable;
        if ((this.f17647f != this.f17648g || this.f17658q == null) && (drawable = this.f17650i) != null) {
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m30117c(Canvas canvas) {
        ClipDrawable clipDrawable = this.f17657p;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m30121g(this.f17646e) * 10000.0f));
            this.f17657p.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m30118d(Canvas canvas) {
        ClipDrawable clipDrawable = this.f17658q;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m30121g(this.f17647f) * 10000.0f));
            this.f17658q.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m30119e(Canvas canvas) {
        Drawable drawable = this.f17667z;
        if (drawable != null) {
            drawable.setBounds((int) (m30121g(this.f17646e) * this.f17652k), 0, (int) ((m30121g(this.f17646e) * this.f17652k) + this.f17633A), this.f17634B);
            this.f17667z.draw(canvas);
        }
        if (TextUtils.isEmpty(this.f17641I)) {
            return;
        }
        if (this.f17641I.length() != this.f17637E) {
            this.f17637E = this.f17641I.length();
            this.f17638F = m30124j(this.f17641I, this.f17642a);
            this.f17639G = m30123i(this.f17641I, this.f17642a);
        }
        canvas.drawText(this.f17641I, (((int) (m30121g(this.f17646e) * this.f17652k)) + this.f17653l) - (this.f17638F / 2), ((this.f17634B - this.f17639G) / 2) + this.f17640H, this.f17642a);
    }

    /* JADX INFO: renamed from: f */
    public final void m30120f(Canvas canvas) {
        Drawable drawable = this.f17660s;
        if (drawable != null) {
            drawable.setBounds(((int) (m30121g(this.f17646e) * this.f17652k)) + this.f17661t, this.f17662u, (int) ((m30121g(this.f17646e) * this.f17652k) + this.f17664w), this.f17663v);
            this.f17660s.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m30121g(int i) {
        return (float) ((((double) i) * 1.0d) / ((double) this.f17648g));
    }

    public int getMax() {
        return this.f17648g;
    }

    public int getProgress() {
        return this.f17646e;
    }

    /* JADX INFO: renamed from: h */
    public final int m30122h(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        motionEvent.getY();
        return (int) (Math.min(Math.max(0.0f, (x - this.f17653l) / this.f17652k), 1.0f) * getMax());
    }

    /* JADX INFO: renamed from: i */
    public final int m30123i(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    /* JADX INFO: renamed from: j */
    public final int m30124j(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m30125k(MotionEvent motionEvent) {
        float fM30121g = this.f17653l + (m30121g(this.f17646e) * this.f17652k);
        double x = motionEvent.getX();
        double d = fM30121g;
        int i = this.f17665x;
        return x >= d - (((double) i) * 0.6d) && x <= d + (((double) i) * 0.6d);
    }

    /* JADX INFO: renamed from: l */
    public final void m30126l() {
        Paint paint = new Paint();
        this.f17642a = paint;
        paint.setAntiAlias(true);
        this.f17642a.setColor(-1);
        this.f17642a.setTextSize(this.f17636D);
        Paint paint2 = new Paint();
        this.f17643b = paint2;
        paint2.setAntiAlias(true);
        this.f17643b.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f17648g = 100;
    }

    /* JADX INFO: renamed from: m */
    public final void m30127m() {
        InterfaceC4816a interfaceC4816a = this.f17659r;
        if (interfaceC4816a != null) {
            interfaceC4816a.mo29979a(this, this.f17646e, this.f17649h);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m30119e(canvas);
        m30116b(canvas);
        m30118d(canvas);
        m30117c(canvas);
        m30120f(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int i3 = this.f17634B;
        Math.max(size + i3, this.f17666y + i3);
        Math.max(this.f17665x + size2, size2 + this.f17633A);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f17644c = i;
        this.f17645d = i2;
        this.f17652k = Math.min(i - this.f17665x, i - this.f17633A);
        float fMax = Math.max(this.f17665x / 2, this.f17633A / 2);
        this.f17653l = fMax;
        this.f17655n = fMax + this.f17652k;
        float f = this.f17666y;
        float f2 = this.f17651j;
        float f3 = ((f - f2) / 2.0f) + this.f17634B;
        this.f17654m = f3;
        this.f17656o = f3 + f2;
        int iMax = Math.max((this.f17633A / 2) - (this.f17665x / 2), 0);
        this.f17661t = iMax;
        int i5 = this.f17634B;
        this.f17662u = i5;
        this.f17664w = iMax + this.f17665x;
        this.f17663v = i5 + this.f17666y;
        Drawable drawable = this.f17650i;
        if (drawable != null) {
            drawable.setBounds((int) this.f17653l, (int) this.f17654m, (int) this.f17655n, (int) this.f17656o);
        }
        ClipDrawable clipDrawable = this.f17657p;
        if (clipDrawable != null) {
            clipDrawable.setBounds((int) this.f17653l, (int) this.f17654m, (int) this.f17655n, (int) this.f17656o);
        }
        ClipDrawable clipDrawable2 = this.f17658q;
        if (clipDrawable2 != null) {
            clipDrawable2.setBounds((int) this.f17653l, (int) this.f17654m, (int) this.f17655n, (int) this.f17656o);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                InterfaceC4816a interfaceC4816a = this.f17659r;
                if (interfaceC4816a != null && this.f17649h) {
                    interfaceC4816a.mo29980b(this);
                }
                this.f17649h = false;
            } else if (action == 2 && this.f17649h && m30115a(motionEvent)) {
                setProgress(m30122h(motionEvent));
                return true;
            }
        } else if (m30125k(motionEvent)) {
            this.f17649h = true;
            InterfaceC4816a interfaceC4816a2 = this.f17659r;
            if (interfaceC4816a2 != null) {
                interfaceC4816a2.mo29981c(this);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMax(int i) {
        this.f17648g = i;
    }

    public void setOnSeekBarChangeListener(InterfaceC4816a interfaceC4816a) {
        this.f17659r = interfaceC4816a;
    }

    public void setProgress(int i) {
        if (this.f17646e == i) {
            return;
        }
        this.f17646e = i;
        invalidate();
        m30127m();
    }

    public void setSecondaryProgress(int i) {
        if (this.f17647f == i) {
            return;
        }
        this.f17647f = i;
        invalidate();
    }

    public void setText(String str) {
        this.f17641I = str;
        invalidate();
    }

    public void setTextBgDrawable(Drawable drawable) {
        this.f17667z = drawable;
    }

    public void setTextBgHeight(int i) {
        this.f17634B = i;
    }

    public void setTextBgWidth(int i) {
        this.f17633A = i;
    }

    public void setTextColor(int i) {
        this.f17635C = i;
    }

    public void setTextPaddingTop(int i) {
        this.f17640H = i;
    }

    public void setTextSize(float f) {
        this.f17636D = f;
    }

    public void setThumbHeight(int i) {
        this.f17666y = i;
    }

    public void setThumbImage(Drawable drawable) {
        this.f17660s = drawable;
    }

    public void setThumbWith(int i) {
        this.f17665x = i;
    }

    public AccountTextSeekBar(Context context) {
        super(context);
        this.f17646e = 0;
        this.f17647f = 0;
        this.f17665x = 0;
        this.f17666y = 0;
        this.f17633A = 0;
        this.f17634B = 0;
        this.f17636D = 16.0f;
        this.f17637E = 0;
        this.f17641I = "";
        m30126l();
    }
}
