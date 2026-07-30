package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input;

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
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.p9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuToggleButton extends View {

    /* JADX INFO: renamed from: a */
    public float f48772a;

    /* JADX INFO: renamed from: b */
    public float f48773b;

    /* JADX INFO: renamed from: c */
    public final float f48774c;

    /* JADX INFO: renamed from: d */
    public final float f48775d;

    /* JADX INFO: renamed from: e */
    public final int f48776e;

    /* JADX INFO: renamed from: f */
    public final int f48777f;

    /* JADX INFO: renamed from: g */
    public final int f48778g;

    /* JADX INFO: renamed from: h */
    public boolean f48779h;

    /* JADX INFO: renamed from: i */
    public InterfaceC12738a f48780i;

    /* JADX INFO: renamed from: j */
    public int f48781j;

    /* JADX INFO: renamed from: k */
    public Paint f48782k;

    /* JADX INFO: renamed from: l */
    public Paint f48783l;

    /* JADX INFO: renamed from: m */
    public Paint f48784m;

    /* JADX INFO: renamed from: n */
    public final String f48785n;

    /* JADX INFO: renamed from: o */
    public final int f48786o;

    /* JADX INFO: renamed from: p */
    public boolean f48787p;

    /* JADX INFO: renamed from: q */
    public float f48788q;

    /* JADX INFO: renamed from: r */
    public float f48789r;

    /* JADX INFO: renamed from: s */
    public long f48790s;

    /* JADX INFO: renamed from: t */
    public final ArgbEvaluator f48791t;

    /* JADX INFO: renamed from: u */
    public float f48792u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton$a */
    public interface InterfaceC12738a {
        /* JADX INFO: renamed from: a */
        void mo72525a(boolean z);
    }

    public DanmakuToggleButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48774c = 1.2f;
        this.f48775d = t100.m186890d(9.0f);
        this.f48779h = false;
        this.f48781j = 350;
        this.f48787p = false;
        this.f48791t = new ArgbEvaluator();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147715Y);
        this.f48785n = typedArrayObtainStyledAttributes.getString(p9c0.f147722c0);
        this.f48786o = typedArrayObtainStyledAttributes.getDimensionPixelSize(p9c0.f147724d0, t100.f167264m);
        this.f48776e = typedArrayObtainStyledAttributes.getColor(p9c0.f147720b0, 452984831);
        this.f48777f = typedArrayObtainStyledAttributes.getColor(p9c0.f147718a0, -509799);
        this.f48778g = typedArrayObtainStyledAttributes.getColor(p9c0.f147716Z, -30697);
        typedArrayObtainStyledAttributes.recycle();
        m72522c();
    }

    private int getRectColor() {
        boolean z = this.f48787p;
        int i = this.f48781j;
        if (z) {
            float f = i / 320.0f;
            return f >= 1.0f ? this.f48778g : ((Integer) this.f48791t.evaluate(f, Integer.valueOf(this.f48777f), Integer.valueOf(this.f48778g))).intValue();
        }
        float f2 = i / 220.0f;
        if (f2 >= 1.0f) {
            return 16746519;
        }
        return Color.argb((int) ((1.0f - f2) * 255.0f), 255, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 23);
    }

    private int getTextColor() {
        boolean z = this.f48787p;
        int i = this.f48781j;
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
    public final void m72521b(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = this.f48772a;
        float f6 = (f5 * 1.2f) / 2.0f;
        float f7 = this.f48773b;
        float f8 = (1.2f * f7) / 2.0f;
        float f9 = f5 / 2.0f;
        float f10 = f7 / 2.0f;
        float f11 = this.f48775d;
        if (this.f48787p) {
            int i = this.f48781j;
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
        this.f48784m.setColor(getRectColor());
        canvas.drawRoundRect(new RectF(f, f4, f2, f3), f11, f11, this.f48784m);
    }

    /* JADX INFO: renamed from: c */
    public final void m72522c() {
        Paint paint = new Paint(1);
        this.f48782k = paint;
        paint.setTextSize(this.f48786o);
        this.f48782k.setColor(2063597567);
        Paint.FontMetrics fontMetrics = this.f48782k.getFontMetrics();
        this.f48792u = (-fontMetrics.top) + fontMetrics.bottom;
        Paint paint2 = new Paint(1);
        this.f48783l = paint2;
        paint2.setColor(this.f48776e);
        this.f48784m = new Paint(1);
        this.f48789r = (this.f48782k.descent() + this.f48782k.ascent()) / 2.0f;
        this.f48788q = this.f48782k.measureText(this.f48785n);
        setOnClickListener(new View.OnClickListener() { // from class: l.r1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157260a.m72524e(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m72523d() {
        return this.f48787p;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m72524e(View view) {
        if (this.f48779h) {
            return;
        }
        this.f48787p = !this.f48787p;
        this.f48779h = true;
        this.f48790s = System.currentTimeMillis();
        this.f48781j = 0;
        InterfaceC12738a interfaceC12738a = this.f48780i;
        if (interfaceC12738a != null) {
            interfaceC12738a.mo72525a(this.f48787p);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f48772a;
        float f2 = this.f48773b;
        float f3 = this.f48775d;
        canvas.drawRoundRect((f * 0.20000005f) / 2.0f, (f2 * 0.20000005f) / 2.0f, ((f * 0.20000005f) / 2.0f) + f, ((0.20000005f * f2) / 2.0f) + f2, f3, f3, this.f48783l);
        m72521b(canvas);
        this.f48782k.setColor(getTextColor());
        canvas.drawText(this.f48785n, ((this.f48772a * 1.2f) / 2.0f) - (this.f48788q / 2.0f), ((this.f48773b * 1.2f) / 2.0f) - this.f48789r, this.f48782k);
        if (this.f48779h) {
            if (this.f48781j < 350) {
                this.f48781j = (int) (System.currentTimeMillis() - this.f48790s);
                invalidate();
            } else {
                this.f48781j = 350;
                this.f48779h = false;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((t100.m186890d(7.0f) << 1) + this.f48788q) * 1.2f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (((t100.f167256e << 1) + this.f48792u) * 1.2f), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f48772a = i / 1.2f;
        this.f48773b = i2 / 1.2f;
    }

    public void setChecked(boolean z) {
        if (this.f48787p != z) {
            this.f48787p = z;
            InterfaceC12738a interfaceC12738a = this.f48780i;
            if (interfaceC12738a != null) {
                interfaceC12738a.mo72525a(z);
            }
            invalidate();
        }
    }

    public void setOnCheckedChangeListener(@Nullable InterfaceC12738a interfaceC12738a) {
        this.f48780i = interfaceC12738a;
    }

    public DanmakuToggleButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DanmakuToggleButton(Context context) {
        this(context, null);
    }
}
