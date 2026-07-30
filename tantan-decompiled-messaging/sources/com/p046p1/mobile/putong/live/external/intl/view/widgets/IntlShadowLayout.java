package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p149l.n9c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlShadowLayout extends FrameLayout {

    /* JADX INFO: renamed from: s */
    public static final float f45859s = xdl0.m208407w(5.0f);

    /* JADX INFO: renamed from: t */
    public static final float f45860t = xdl0.m208407w(20.0f);

    /* JADX INFO: renamed from: u */
    public static final float f45861u = xdl0.m208407w(20.0f);

    /* JADX INFO: renamed from: v */
    public static final float f45862v = xdl0.m208407w(5.0f);

    /* JADX INFO: renamed from: a */
    public int f45863a;

    /* JADX INFO: renamed from: b */
    public float f45864b;

    /* JADX INFO: renamed from: c */
    public float f45865c;

    /* JADX INFO: renamed from: d */
    public float f45866d;

    /* JADX INFO: renamed from: e */
    public float f45867e;

    /* JADX INFO: renamed from: f */
    public int f45868f;

    /* JADX INFO: renamed from: g */
    public boolean f45869g;

    /* JADX INFO: renamed from: h */
    public int f45870h;

    /* JADX INFO: renamed from: i */
    public int f45871i;

    /* JADX INFO: renamed from: j */
    public int f45872j;

    /* JADX INFO: renamed from: k */
    public int f45873k;

    /* JADX INFO: renamed from: l */
    public InterfaceC12562a f45874l;

    /* JADX INFO: renamed from: m */
    public RectF f45875m;

    /* JADX INFO: renamed from: n */
    public RectF f45876n;

    /* JADX INFO: renamed from: o */
    public float f45877o;

    /* JADX INFO: renamed from: p */
    public float f45878p;

    /* JADX INFO: renamed from: q */
    public Paint f45879q;

    /* JADX INFO: renamed from: r */
    public Paint f45880r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlShadowLayout$a */
    public interface InterfaceC12562a {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlShadowLayout$b */
    public class C12563b implements InterfaceC12562a {

        /* JADX INFO: renamed from: a */
        public IntlShadowLayout f45881a;

        public C12563b(IntlShadowLayout intlShadowLayout) {
            this.f45881a = intlShadowLayout;
        }
    }

    public IntlShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45863a = Color.parseColor("#333333");
        this.f45864b = 0.0f;
        float f = f45862v;
        this.f45865c = f;
        this.f45866d = xdl0.m208407w(10.0f);
        this.f45867e = xdl0.m208407w(10.0f);
        this.f45868f = -1;
        this.f45869g = false;
        this.f45870h = 0;
        this.f45871i = 0;
        this.f45872j = 0;
        this.f45873k = 0;
        this.f45874l = new C12563b(this);
        this.f45875m = new RectF();
        this.f45876n = new RectF();
        this.f45879q = new Paint();
        this.f45880r = new Paint();
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137753U);
        this.f45863a = typedArrayObtainStyledAttributes.getColor(n9c0.f137757Y, -16776961);
        this.f45865c = typedArrayObtainStyledAttributes.getDimension(n9c0.f137754V, f);
        this.f45864b = typedArrayObtainStyledAttributes.getDimension(n9c0.f137758Z, 0.0f);
        this.f45869g = typedArrayObtainStyledAttributes.getBoolean(n9c0.f137755W, false);
        this.f45866d = typedArrayObtainStyledAttributes.getDimension(n9c0.f137760a0, xdl0.m208407w(10.0f));
        this.f45867e = typedArrayObtainStyledAttributes.getDimension(n9c0.f137762b0, xdl0.m208407w(10.0f));
        this.f45868f = typedArrayObtainStyledAttributes.getColor(n9c0.f137756X, -1);
        typedArrayObtainStyledAttributes.recycle();
        float f2 = this.f45864b;
        if (f2 < 0.0f) {
            this.f45864b = -f2;
        }
        float f3 = this.f45865c;
        if (f3 < 0.0f) {
            this.f45865c = -f3;
        }
        this.f45865c = Math.min(f45861u, this.f45865c);
        float fAbs = Math.abs(this.f45866d);
        float f4 = f45860t;
        if (fAbs > f4) {
            float f5 = this.f45866d;
            this.f45866d = (f5 / Math.abs(f5)) * f4;
        }
        if (Math.abs(this.f45867e) > f4) {
            float f6 = this.f45867e;
            this.f45867e = (f6 / Math.abs(f6)) * f4;
        }
        setBackgroundColor(Color.parseColor("#00ffffff"));
        m70375b();
    }

    /* JADX INFO: renamed from: a */
    public final void m70374a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        this.f45877o = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        this.f45878p = measuredHeight;
        float f5 = this.f45866d;
        int i = this.f45871i;
        if (f5 == 0.0f) {
            f = i;
            f2 = this.f45877o - this.f45865c;
        } else {
            float f6 = i;
            float f7 = this.f45865c;
            f = f6 + f7;
            f2 = (this.f45877o - this.f45870h) - f7;
        }
        float f8 = this.f45867e;
        int i2 = this.f45873k;
        if (f8 == 0.0f) {
            f4 = i2;
            f3 = this.f45865c;
        } else {
            float f9 = i2;
            f3 = this.f45865c;
            f4 = f9 + f3;
            measuredHeight -= this.f45872j;
        }
        float f10 = measuredHeight - f3;
        if (this.f45865c > 0.0f) {
            this.f45879q.setMaskFilter(new BlurMaskFilter(this.f45865c, BlurMaskFilter.Blur.NORMAL));
        }
        this.f45879q.setColor(this.f45863a);
        this.f45879q.setAntiAlias(true);
        this.f45875m.set(f, f4, f2, f10);
        this.f45876n.set(this.f45870h, this.f45872j, this.f45877o - this.f45871i, this.f45878p - this.f45873k);
        float f11 = this.f45864b;
        RectF rectF = this.f45875m;
        if (f11 == 0.0f) {
            canvas.drawRect(rectF, this.f45879q);
        } else {
            canvas.drawRoundRect(rectF, f11, f11, this.f45879q);
        }
        this.f45880r.setColor(this.f45868f);
        this.f45880r.setAntiAlias(true);
        float f12 = this.f45864b;
        RectF rectF2 = this.f45876n;
        if (f12 == 0.0f) {
            canvas.drawRect(rectF2, this.f45880r);
        } else {
            canvas.drawRoundRect(rectF2, f12, f12, this.f45880r);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m70375b() {
        float f = this.f45866d;
        if (f > 0.0f) {
            this.f45871i = (int) (this.f45865c + Math.abs(f));
        } else {
            float f2 = this.f45865c;
            if (f == 0.0f) {
                this.f45870h = (int) f2;
                this.f45871i = (int) f2;
            } else {
                this.f45870h = (int) (f2 + Math.abs(f));
            }
        }
        float f3 = this.f45867e;
        if (f3 > 0.0f) {
            this.f45873k = (int) (this.f45865c + Math.abs(f3));
        } else {
            float f4 = this.f45865c;
            if (f3 == 0.0f) {
                this.f45872j = (int) f4;
                this.f45873k = (int) f4;
            } else {
                this.f45872j = (int) (f4 + Math.abs(f3));
            }
        }
        setPadding(this.f45870h, this.f45872j, this.f45871i, this.f45873k);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m70374a(canvas);
        super.dispatchDraw(canvas);
    }

    public IntlShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlShadowLayout(Context context) {
        super(context, null);
        this.f45863a = Color.parseColor("#333333");
        this.f45864b = 0.0f;
        this.f45865c = f45862v;
        this.f45866d = xdl0.m208407w(10.0f);
        this.f45867e = xdl0.m208407w(10.0f);
        this.f45868f = -1;
        this.f45869g = false;
        this.f45870h = 0;
        this.f45871i = 0;
        this.f45872j = 0;
        this.f45873k = 0;
        this.f45874l = new C12563b(this);
        this.f45875m = new RectF();
        this.f45876n = new RectF();
        this.f45879q = new Paint();
        this.f45880r = new Paint();
    }
}
