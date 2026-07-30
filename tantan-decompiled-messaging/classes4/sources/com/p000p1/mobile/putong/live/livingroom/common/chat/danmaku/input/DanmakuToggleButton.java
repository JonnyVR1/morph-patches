package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;
import p002l.p9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class DanmakuToggleButton extends View {

    /* JADX INFO: renamed from: a */
    public float f4814a;

    /* JADX INFO: renamed from: b */
    public float f4815b;

    /* JADX INFO: renamed from: c */
    public final float f4816c;

    /* JADX INFO: renamed from: d */
    public final float f4817d;

    /* JADX INFO: renamed from: e */
    public final int f4818e;

    /* JADX INFO: renamed from: f */
    public final int f4819f;

    /* JADX INFO: renamed from: g */
    public final int f4820g;

    /* JADX INFO: renamed from: h */
    public boolean f4821h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0327a f4822i;

    /* JADX INFO: renamed from: j */
    public int f4823j;

    /* JADX INFO: renamed from: k */
    public Paint f4824k;

    /* JADX INFO: renamed from: l */
    public Paint f4825l;

    /* JADX INFO: renamed from: m */
    public Paint f4826m;

    /* JADX INFO: renamed from: n */
    public final String f4827n;

    /* JADX INFO: renamed from: o */
    public final int f4828o;

    /* JADX INFO: renamed from: p */
    public boolean f4829p;

    /* JADX INFO: renamed from: q */
    public float f4830q;

    /* JADX INFO: renamed from: r */
    public float f4831r;

    /* JADX INFO: renamed from: s */
    public long f4832s;

    /* JADX INFO: renamed from: t */
    public final ArgbEvaluator f4833t;

    /* JADX INFO: renamed from: u */
    public float f4834u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton$a */
    public interface InterfaceC0327a {
        /* JADX INFO: renamed from: a */
        void mo6017a(boolean z);
    }

    public DanmakuToggleButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4816c = 1.2f;
        this.f4817d = t100.d(9.0f);
        this.f4821h = false;
        this.f4823j = 350;
        this.f4829p = false;
        this.f4833t = new ArgbEvaluator();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f17112Y);
        this.f4827n = typedArrayObtainStyledAttributes.getString(p9c0.f17119c0);
        this.f4828o = typedArrayObtainStyledAttributes.getDimensionPixelSize(p9c0.f17121d0, t100.m);
        this.f4818e = typedArrayObtainStyledAttributes.getColor(p9c0.f17117b0, 452984831);
        this.f4819f = typedArrayObtainStyledAttributes.getColor(p9c0.f17115a0, -509799);
        this.f4820g = typedArrayObtainStyledAttributes.getColor(p9c0.f17113Z, -30697);
        typedArrayObtainStyledAttributes.recycle();
        m6014c();
    }

    private int getRectColor() {
        boolean z = this.f4829p;
        int i = this.f4823j;
        if (z) {
            float f = i / 320.0f;
            return f >= 1.0f ? this.f4820g : ((Integer) this.f4833t.evaluate(f, Integer.valueOf(this.f4819f), Integer.valueOf(this.f4820g))).intValue();
        }
        float f2 = i / 220.0f;
        if (f2 >= 1.0f) {
            return 16746519;
        }
        return Color.argb((int) ((1.0f - f2) * 255.0f), 255, 136, 23);
    }

    private int getTextColor() {
        boolean z = this.f4829p;
        int i = this.f4823j;
        if (z) {
            float f = i / 320.0f;
            if (f >= 1.0f) {
                return -1;
            }
            return Color.argb((int) (((f / 2.0f) + 0.5f) * 255.0f), 255, 255, 255);
        }
        float f2 = i / 220.0f;
        if (f2 >= 1.0f) {
            return 2063597567;
        }
        return Color.argb((int) ((1.0f - (f2 / 2.0f)) * 255.0f), 255, 255, 255);
    }

    /* JADX INFO: renamed from: b */
    public final void m6013b(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = this.f4814a;
        float f6 = (f5 * 1.2f) / 2.0f;
        float f7 = this.f4815b;
        float f8 = (1.2f * f7) / 2.0f;
        float f9 = f5 / 2.0f;
        float f10 = f7 / 2.0f;
        float f11 = this.f4817d;
        if (this.f4829p) {
            int i = this.f4823j;
            if (i > 320) {
                float f12 = (i - 320) / 30.0f;
                f = (f6 - (f9 * 0.93f)) - ((f9 * 0.07f) * f12);
                f4 = (f8 - (0.93f * f10)) - ((f10 * 0.07f) * f12);
            } else if (i > 180) {
                float f13 = (i - 180) / 140.0f;
                f = (f6 - (f9 * 0.93f)) * f13;
                f4 = (f8 - (f10 * 0.93f)) * f13;
            } else {
                float f14 = i / 180.0f;
                float f15 = 1.0f - f14;
                f = f6 * f15;
                float f16 = f15 * f8;
                f2 = f6 + (f6 - f);
                f3 = f8 + (f8 - f16);
                f11 *= f14;
                f4 = f16;
            }
            f2 = f6 + (f6 - f);
            f3 = f8 + (f8 - f4);
        } else {
            f = f6 - f9;
            float f17 = f8 - f10;
            f2 = f6 + f9;
            f3 = f8 + f10;
            f4 = f17;
        }
        this.f4826m.setColor(getRectColor());
        canvas.drawRoundRect(new RectF(f, f4, f2, f3), f11, f11, this.f4826m);
    }

    /* JADX INFO: renamed from: c */
    public final void m6014c() {
        Paint paint = new Paint(1);
        this.f4824k = paint;
        paint.setTextSize(this.f4828o);
        this.f4824k.setColor(2063597567);
        Paint.FontMetrics fontMetrics = this.f4824k.getFontMetrics();
        this.f4834u = (-fontMetrics.top) + fontMetrics.bottom;
        Paint paint2 = new Paint(1);
        this.f4825l = paint2;
        paint2.setColor(this.f4818e);
        this.f4826m = new Paint(1);
        this.f4831r = (this.f4824k.descent() + this.f4824k.ascent()) / 2.0f;
        this.f4830q = this.f4824k.measureText(this.f4827n);
        setOnClickListener(new View.OnClickListener() { // from class: l.r1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18317a.m6016e(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m6015d() {
        return this.f4829p;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m6016e(View view) {
        if (this.f4821h) {
            return;
        }
        this.f4829p = !this.f4829p;
        this.f4821h = true;
        this.f4832s = System.currentTimeMillis();
        this.f4823j = 0;
        InterfaceC0327a interfaceC0327a = this.f4822i;
        if (interfaceC0327a != null) {
            interfaceC0327a.mo6017a(this.f4829p);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f4814a;
        float f2 = this.f4815b;
        float f3 = this.f4817d;
        canvas.drawRoundRect((f * 0.20000005f) / 2.0f, (f2 * 0.20000005f) / 2.0f, ((f * 0.20000005f) / 2.0f) + f, ((0.20000005f * f2) / 2.0f) + f2, f3, f3, this.f4825l);
        m6013b(canvas);
        this.f4824k.setColor(getTextColor());
        canvas.drawText(this.f4827n, ((this.f4814a * 1.2f) / 2.0f) - (this.f4830q / 2.0f), ((this.f4815b * 1.2f) / 2.0f) - this.f4831r, this.f4824k);
        if (this.f4821h) {
            if (this.f4823j < 350) {
                this.f4823j = (int) (System.currentTimeMillis() - this.f4832s);
                invalidate();
            } else {
                this.f4823j = 350;
                this.f4821h = false;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((t100.d(7.0f) << 1) + this.f4830q) * 1.2f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (((t100.e << 1) + this.f4834u) * 1.2f), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f4814a = i / 1.2f;
        this.f4815b = i2 / 1.2f;
    }

    public void setChecked(boolean z) {
        if (this.f4829p != z) {
            this.f4829p = z;
            InterfaceC0327a interfaceC0327a = this.f4822i;
            if (interfaceC0327a != null) {
                interfaceC0327a.mo6017a(z);
            }
            invalidate();
        }
    }

    public void setOnCheckedChangeListener(@Nullable InterfaceC0327a interfaceC0327a) {
        this.f4822i = interfaceC0327a;
    }

    public DanmakuToggleButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DanmakuToggleButton(Context context) {
        this(context, null);
    }
}
