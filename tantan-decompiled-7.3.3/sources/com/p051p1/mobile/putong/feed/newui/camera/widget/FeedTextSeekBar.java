package com.p051p1.mobile.putong.feed.newui.camera.widget;

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
import p153l.shc0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class FeedTextSeekBar extends View {

    /* JADX INFO: renamed from: A */
    public int f40488A;

    /* JADX INFO: renamed from: B */
    public int f40489B;

    /* JADX INFO: renamed from: C */
    public int f40490C;

    /* JADX INFO: renamed from: D */
    public float f40491D;

    /* JADX INFO: renamed from: E */
    public int f40492E;

    /* JADX INFO: renamed from: F */
    public int f40493F;

    /* JADX INFO: renamed from: G */
    public int f40494G;

    /* JADX INFO: renamed from: H */
    public int f40495H;

    /* JADX INFO: renamed from: I */
    public String f40496I;

    /* JADX INFO: renamed from: a */
    public Paint f40497a;

    /* JADX INFO: renamed from: b */
    public Paint f40498b;

    /* JADX INFO: renamed from: c */
    public int f40499c;

    /* JADX INFO: renamed from: d */
    public int f40500d;

    /* JADX INFO: renamed from: e */
    public int f40501e;

    /* JADX INFO: renamed from: f */
    public int f40502f;

    /* JADX INFO: renamed from: g */
    public int f40503g;

    /* JADX INFO: renamed from: h */
    public boolean f40504h;

    /* JADX INFO: renamed from: i */
    public Drawable f40505i;

    /* JADX INFO: renamed from: j */
    public float f40506j;

    /* JADX INFO: renamed from: k */
    public float f40507k;

    /* JADX INFO: renamed from: l */
    public float f40508l;

    /* JADX INFO: renamed from: m */
    public float f40509m;

    /* JADX INFO: renamed from: n */
    public float f40510n;

    /* JADX INFO: renamed from: o */
    public float f40511o;

    /* JADX INFO: renamed from: p */
    public ClipDrawable f40512p;

    /* JADX INFO: renamed from: q */
    public ClipDrawable f40513q;

    /* JADX INFO: renamed from: r */
    public InterfaceC11333a f40514r;

    /* JADX INFO: renamed from: s */
    public Drawable f40515s;

    /* JADX INFO: renamed from: t */
    public int f40516t;

    /* JADX INFO: renamed from: u */
    public int f40517u;

    /* JADX INFO: renamed from: v */
    public int f40518v;

    /* JADX INFO: renamed from: w */
    public int f40519w;

    /* JADX INFO: renamed from: x */
    public int f40520x;

    /* JADX INFO: renamed from: y */
    public int f40521y;

    /* JADX INFO: renamed from: z */
    public Drawable f40522z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar$a */
    public interface InterfaceC11333a {
        /* JADX INFO: renamed from: a */
        void mo62742a(FeedTextSeekBar feedTextSeekBar, int i, boolean z);

        /* JADX INFO: renamed from: b */
        void mo62743b(FeedTextSeekBar feedTextSeekBar);

        /* JADX INFO: renamed from: c */
        void mo62744c(FeedTextSeekBar feedTextSeekBar);
    }

    public FeedTextSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40501e = 0;
        this.f40502f = 0;
        this.f40520x = 0;
        this.f40521y = 0;
        this.f40488A = 0;
        this.f40489B = 0;
        this.f40491D = 16.0f;
        this.f40492E = 0;
        this.f40496I = "";
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168647d0);
            if (typedArrayObtainStyledAttributes.hasValue(shc0.f168665m0)) {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(shc0.f168665m0);
                this.f40515s = drawable;
                if (drawable != null) {
                    this.f40520x = drawable.getIntrinsicWidth();
                    this.f40521y = this.f40515s.getIntrinsicHeight();
                }
            }
            this.f40520x = (int) typedArrayObtainStyledAttributes.getDimension(shc0.f168669o0, this.f40520x);
            this.f40521y = (int) typedArrayObtainStyledAttributes.getDimension(shc0.f168667n0, this.f40521y);
            this.f40506j = (int) typedArrayObtainStyledAttributes.getDimension(shc0.f168651f0, this.f40506j);
            if (typedArrayObtainStyledAttributes.hasValue(shc0.f168649e0)) {
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(shc0.f168649e0);
                if (drawable2 instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable2;
                    this.f40505i = layerDrawable.findDrawableByLayerId(R.id.background);
                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                    if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
                        this.f40513q = (ClipDrawable) drawableFindDrawableByLayerId;
                    }
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.progress);
                    if (drawableFindDrawableByLayerId2 instanceof ClipDrawable) {
                        this.f40512p = (ClipDrawable) drawableFindDrawableByLayerId2;
                    }
                }
            }
            this.f40491D = typedArrayObtainStyledAttributes.getDimension(shc0.f168663l0, 16.0f);
            this.f40495H = (int) typedArrayObtainStyledAttributes.getDimension(shc0.f168661k0, 0.0f);
            this.f40490C = typedArrayObtainStyledAttributes.getColor(shc0.f168659j0, RoundedDrawable.DEFAULT_BORDER_COLOR);
            if (typedArrayObtainStyledAttributes.hasValue(shc0.f168653g0)) {
                Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(shc0.f168653g0);
                this.f40522z = drawable3;
                if (drawable3 != null) {
                    this.f40489B = drawable3.getIntrinsicHeight();
                    this.f40488A = this.f40522z.getIntrinsicWidth();
                }
            }
            this.f40488A = (int) typedArrayObtainStyledAttributes.getDimension(shc0.f168657i0, this.f40488A);
            this.f40489B = (int) typedArrayObtainStyledAttributes.getDimension(shc0.f168655h0, this.f40489B);
            typedArrayObtainStyledAttributes.recycle();
        }
        m62756l();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m62745a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = this.f40508l;
        return x >= f - ((float) this.f40516t) && x <= (f + this.f40507k) + ((float) this.f40519w);
    }

    /* JADX INFO: renamed from: b */
    public final void m62746b(Canvas canvas) {
        Drawable drawable;
        if ((this.f40502f != this.f40503g || this.f40513q == null) && (drawable = this.f40505i) != null) {
            drawable.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m62747c(Canvas canvas) {
        ClipDrawable clipDrawable = this.f40512p;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m62751g(this.f40501e) * 10000.0f));
            this.f40512p.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m62748d(Canvas canvas) {
        ClipDrawable clipDrawable = this.f40513q;
        if (clipDrawable != null) {
            clipDrawable.setLevel((int) (m62751g(this.f40502f) * 10000.0f));
            this.f40513q.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m62749e(Canvas canvas) {
        Drawable drawable = this.f40522z;
        if (drawable != null) {
            drawable.setBounds((int) (m62751g(this.f40501e) * this.f40507k), 0, (int) ((m62751g(this.f40501e) * this.f40507k) + this.f40488A), this.f40489B);
            this.f40522z.draw(canvas);
        }
        if (TextUtils.isEmpty(this.f40496I)) {
            return;
        }
        if (this.f40496I.length() != this.f40492E) {
            this.f40492E = this.f40496I.length();
            this.f40493F = m62754j(this.f40496I, this.f40497a);
            this.f40494G = m62753i(this.f40496I, this.f40497a);
        }
        canvas.drawText(this.f40496I, (((int) (m62751g(this.f40501e) * this.f40507k)) + this.f40508l) - (this.f40493F / 2), ((this.f40489B - this.f40494G) / 2) + this.f40495H, this.f40497a);
    }

    /* JADX INFO: renamed from: f */
    public final void m62750f(Canvas canvas) {
        Drawable drawable = this.f40515s;
        if (drawable != null) {
            drawable.setBounds(((int) (m62751g(this.f40501e) * this.f40507k)) + this.f40516t, this.f40517u, (int) ((m62751g(this.f40501e) * this.f40507k) + this.f40519w), this.f40518v);
            this.f40515s.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m62751g(int i) {
        return (float) ((((double) i) * 1.0d) / ((double) this.f40503g));
    }

    public int getMax() {
        return this.f40503g;
    }

    public int getProgress() {
        return this.f40501e;
    }

    /* JADX INFO: renamed from: h */
    public final int m62752h(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        motionEvent.getY();
        return (int) (Math.min(Math.max(0.0f, (x - this.f40508l) / this.f40507k), 1.0f) * getMax());
    }

    /* JADX INFO: renamed from: i */
    public final int m62753i(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    /* JADX INFO: renamed from: j */
    public final int m62754j(String str, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m62755k(MotionEvent motionEvent) {
        float fM62751g = this.f40508l + (m62751g(this.f40501e) * this.f40507k);
        double x = motionEvent.getX();
        double d = fM62751g;
        int i = this.f40520x;
        return x >= d - (((double) i) * 0.6d) && x <= d + (((double) i) * 0.6d);
    }

    /* JADX INFO: renamed from: l */
    public final void m62756l() {
        Paint paint = new Paint();
        this.f40497a = paint;
        paint.setAntiAlias(true);
        this.f40497a.setColor(this.f40490C);
        this.f40497a.setTextSize(this.f40491D);
        Paint paint2 = new Paint();
        this.f40498b = paint2;
        paint2.setAntiAlias(true);
        this.f40498b.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f40503g = 100;
    }

    /* JADX INFO: renamed from: m */
    public final void m62757m() {
        InterfaceC11333a interfaceC11333a = this.f40514r;
        if (interfaceC11333a != null) {
            interfaceC11333a.mo62742a(this, this.f40501e, this.f40504h);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m62749e(canvas);
        m62746b(canvas);
        m62748d(canvas);
        m62747c(canvas);
        m62750f(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int i3 = this.f40489B;
        Math.max(size + i3, this.f40521y + i3);
        Math.max(this.f40520x + size2, size2 + this.f40488A);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f40499c = i;
        this.f40500d = i2;
        this.f40507k = Math.min(i - this.f40520x, i - this.f40488A);
        float fMax = Math.max(this.f40520x / 2, this.f40488A / 2);
        this.f40508l = fMax;
        this.f40510n = fMax + this.f40507k;
        float f = this.f40521y;
        float f2 = this.f40506j;
        float f3 = ((f - f2) / 2.0f) + this.f40489B;
        this.f40509m = f3;
        this.f40511o = f3 + f2;
        int iMax = Math.max((this.f40488A / 2) - (this.f40520x / 2), 0);
        this.f40516t = iMax;
        int i5 = this.f40489B;
        this.f40517u = i5;
        this.f40519w = iMax + this.f40520x;
        this.f40518v = i5 + this.f40521y;
        Drawable drawable = this.f40505i;
        if (drawable != null) {
            drawable.setBounds((int) this.f40508l, (int) this.f40509m, (int) this.f40510n, (int) this.f40511o);
        }
        ClipDrawable clipDrawable = this.f40512p;
        if (clipDrawable != null) {
            clipDrawable.setBounds((int) this.f40508l, (int) this.f40509m, (int) this.f40510n, (int) this.f40511o);
        }
        ClipDrawable clipDrawable2 = this.f40513q;
        if (clipDrawable2 != null) {
            clipDrawable2.setBounds((int) this.f40508l, (int) this.f40509m, (int) this.f40510n, (int) this.f40511o);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                InterfaceC11333a interfaceC11333a = this.f40514r;
                if (interfaceC11333a != null && this.f40504h) {
                    interfaceC11333a.mo62744c(this);
                }
                this.f40504h = false;
            } else if (action == 2 && this.f40504h && m62745a(motionEvent)) {
                setProgress(m62752h(motionEvent));
                return true;
            }
        } else if (m62755k(motionEvent)) {
            this.f40504h = true;
            InterfaceC11333a interfaceC11333a2 = this.f40514r;
            if (interfaceC11333a2 != null) {
                interfaceC11333a2.mo62743b(this);
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setMax(int i) {
        this.f40503g = i;
    }

    public void setOnSeekBarChangeListener(InterfaceC11333a interfaceC11333a) {
        this.f40514r = interfaceC11333a;
    }

    public void setProgress(int i) {
        if (this.f40501e == i) {
            return;
        }
        this.f40501e = i;
        invalidate();
        m62757m();
    }

    public void setSecondaryProgress(int i) {
        if (this.f40502f == i) {
            return;
        }
        this.f40502f = i;
        invalidate();
    }

    public void setText(String str) {
        this.f40496I = str;
        invalidate();
    }

    public void setTextBgDrawable(Drawable drawable) {
        this.f40522z = drawable;
    }

    public void setTextBgHeight(int i) {
        this.f40489B = i;
    }

    public void setTextBgWidth(int i) {
        this.f40488A = i;
    }

    public void setTextColor(int i) {
        this.f40490C = i;
    }

    public void setTextPaddingTop(int i) {
        this.f40495H = i;
    }

    public void setTextSize(float f) {
        this.f40491D = f;
    }

    public void setThumbHeight(int i) {
        this.f40521y = i;
    }

    public void setThumbImage(Drawable drawable) {
        this.f40515s = drawable;
    }

    public void setThumbWith(int i) {
        this.f40520x = i;
    }

    public FeedTextSeekBar(Context context) {
        super(context);
        this.f40501e = 0;
        this.f40502f = 0;
        this.f40520x = 0;
        this.f40521y = 0;
        this.f40488A = 0;
        this.f40489B = 0;
        this.f40491D = 16.0f;
        this.f40492E = 0;
        this.f40496I = "";
        m62756l();
    }
}
