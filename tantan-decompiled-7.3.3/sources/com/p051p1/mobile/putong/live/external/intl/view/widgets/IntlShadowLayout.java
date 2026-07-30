package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p153l.bnl0;
import p153l.thc0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlShadowLayout extends FrameLayout {

    /* JADX INFO: renamed from: s */
    public static final float f46707s = bnl0.m105587w(5.0f);

    /* JADX INFO: renamed from: t */
    public static final float f46708t = bnl0.m105587w(20.0f);

    /* JADX INFO: renamed from: u */
    public static final float f46709u = bnl0.m105587w(20.0f);

    /* JADX INFO: renamed from: v */
    public static final float f46710v = bnl0.m105587w(5.0f);

    /* JADX INFO: renamed from: a */
    public int f46711a;

    /* JADX INFO: renamed from: b */
    public float f46712b;

    /* JADX INFO: renamed from: c */
    public float f46713c;

    /* JADX INFO: renamed from: d */
    public float f46714d;

    /* JADX INFO: renamed from: e */
    public float f46715e;

    /* JADX INFO: renamed from: f */
    public int f46716f;

    /* JADX INFO: renamed from: g */
    public boolean f46717g;

    /* JADX INFO: renamed from: h */
    public int f46718h;

    /* JADX INFO: renamed from: i */
    public int f46719i;

    /* JADX INFO: renamed from: j */
    public int f46720j;

    /* JADX INFO: renamed from: k */
    public int f46721k;

    /* JADX INFO: renamed from: l */
    public InterfaceC12725a f46722l;

    /* JADX INFO: renamed from: m */
    public RectF f46723m;

    /* JADX INFO: renamed from: n */
    public RectF f46724n;

    /* JADX INFO: renamed from: o */
    public float f46725o;

    /* JADX INFO: renamed from: p */
    public float f46726p;

    /* JADX INFO: renamed from: q */
    public Paint f46727q;

    /* JADX INFO: renamed from: r */
    public Paint f46728r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlShadowLayout$a */
    public interface InterfaceC12725a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlShadowLayout$b */
    public class C12726b implements InterfaceC12725a {

        /* JADX INFO: renamed from: a */
        public IntlShadowLayout f46729a;

        public C12726b(IntlShadowLayout intlShadowLayout) {
            this.f46729a = intlShadowLayout;
        }
    }

    public IntlShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46711a = Color.parseColor("#333333");
        this.f46712b = 0.0f;
        float f = f46710v;
        this.f46713c = f;
        this.f46714d = bnl0.m105587w(10.0f);
        this.f46715e = bnl0.m105587w(10.0f);
        this.f46716f = -1;
        this.f46717g = false;
        this.f46718h = 0;
        this.f46719i = 0;
        this.f46720j = 0;
        this.f46721k = 0;
        this.f46722l = new C12726b(this);
        this.f46723m = new RectF();
        this.f46724n = new RectF();
        this.f46727q = new Paint();
        this.f46728r = new Paint();
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174311U);
        this.f46711a = typedArrayObtainStyledAttributes.getColor(thc0.f174315Y, -16776961);
        this.f46713c = typedArrayObtainStyledAttributes.getDimension(thc0.f174312V, f);
        this.f46712b = typedArrayObtainStyledAttributes.getDimension(thc0.f174316Z, 0.0f);
        this.f46717g = typedArrayObtainStyledAttributes.getBoolean(thc0.f174313W, false);
        this.f46714d = typedArrayObtainStyledAttributes.getDimension(thc0.f174318a0, bnl0.m105587w(10.0f));
        this.f46715e = typedArrayObtainStyledAttributes.getDimension(thc0.f174320b0, bnl0.m105587w(10.0f));
        this.f46716f = typedArrayObtainStyledAttributes.getColor(thc0.f174314X, -1);
        typedArrayObtainStyledAttributes.recycle();
        float f2 = this.f46712b;
        if (f2 < 0.0f) {
            this.f46712b = -f2;
        }
        float f3 = this.f46713c;
        if (f3 < 0.0f) {
            this.f46713c = -f3;
        }
        this.f46713c = Math.min(f46709u, this.f46713c);
        float fAbs = Math.abs(this.f46714d);
        float f4 = f46708t;
        if (fAbs > f4) {
            float f5 = this.f46714d;
            this.f46714d = (f5 / Math.abs(f5)) * f4;
        }
        if (Math.abs(this.f46715e) > f4) {
            float f6 = this.f46715e;
            this.f46715e = (f6 / Math.abs(f6)) * f4;
        }
        setBackgroundColor(Color.parseColor("#00ffffff"));
        m71558b();
    }

    /* JADX INFO: renamed from: a */
    public final void m71557a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        this.f46725o = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        this.f46726p = measuredHeight;
        float f5 = this.f46714d;
        int i = this.f46719i;
        if (f5 == 0.0f) {
            f = i;
            f2 = this.f46725o - this.f46713c;
        } else {
            float f6 = i;
            float f7 = this.f46713c;
            f = f6 + f7;
            f2 = (this.f46725o - this.f46718h) - f7;
        }
        float f8 = this.f46715e;
        int i2 = this.f46721k;
        if (f8 == 0.0f) {
            f4 = i2;
            f3 = this.f46713c;
        } else {
            float f9 = i2;
            f3 = this.f46713c;
            f4 = f9 + f3;
            measuredHeight -= this.f46720j;
        }
        float f10 = measuredHeight - f3;
        if (this.f46713c > 0.0f) {
            this.f46727q.setMaskFilter(new BlurMaskFilter(this.f46713c, BlurMaskFilter.Blur.NORMAL));
        }
        this.f46727q.setColor(this.f46711a);
        this.f46727q.setAntiAlias(true);
        this.f46723m.set(f, f4, f2, f10);
        this.f46724n.set(this.f46718h, this.f46720j, this.f46725o - this.f46719i, this.f46726p - this.f46721k);
        float f11 = this.f46712b;
        RectF rectF = this.f46723m;
        if (f11 == 0.0f) {
            canvas.drawRect(rectF, this.f46727q);
        } else {
            canvas.drawRoundRect(rectF, f11, f11, this.f46727q);
        }
        this.f46728r.setColor(this.f46716f);
        this.f46728r.setAntiAlias(true);
        float f12 = this.f46712b;
        RectF rectF2 = this.f46724n;
        if (f12 == 0.0f) {
            canvas.drawRect(rectF2, this.f46728r);
        } else {
            canvas.drawRoundRect(rectF2, f12, f12, this.f46728r);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m71558b() {
        float f = this.f46714d;
        if (f > 0.0f) {
            this.f46719i = (int) (this.f46713c + Math.abs(f));
        } else {
            float f2 = this.f46713c;
            if (f == 0.0f) {
                this.f46718h = (int) f2;
                this.f46719i = (int) f2;
            } else {
                this.f46718h = (int) (f2 + Math.abs(f));
            }
        }
        float f3 = this.f46715e;
        if (f3 > 0.0f) {
            this.f46721k = (int) (this.f46713c + Math.abs(f3));
        } else {
            float f4 = this.f46713c;
            if (f3 == 0.0f) {
                this.f46720j = (int) f4;
                this.f46721k = (int) f4;
            } else {
                this.f46720j = (int) (f4 + Math.abs(f3));
            }
        }
        setPadding(this.f46718h, this.f46720j, this.f46719i, this.f46721k);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m71557a(canvas);
        super.dispatchDraw(canvas);
    }

    public IntlShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlShadowLayout(Context context) {
        super(context, null);
        this.f46711a = Color.parseColor("#333333");
        this.f46712b = 0.0f;
        this.f46713c = f46710v;
        this.f46714d = bnl0.m105587w(10.0f);
        this.f46715e = bnl0.m105587w(10.0f);
        this.f46716f = -1;
        this.f46717g = false;
        this.f46718h = 0;
        this.f46719i = 0;
        this.f46720j = 0;
        this.f46721k = 0;
        this.f46722l = new C12726b(this);
        this.f46723m = new RectF();
        this.f46724n = new RectF();
        this.f46727q = new Paint();
        this.f46728r = new Paint();
    }
}
