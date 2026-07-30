package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input;

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
import p153l.qa00;
import p153l.vhc0;

/* JADX INFO: loaded from: classes4.dex */
public class DanmakuToggleButton extends View {

    /* JADX INFO: renamed from: a */
    public float f49620a;

    /* JADX INFO: renamed from: b */
    public float f49621b;

    /* JADX INFO: renamed from: c */
    public final float f49622c;

    /* JADX INFO: renamed from: d */
    public final float f49623d;

    /* JADX INFO: renamed from: e */
    public final int f49624e;

    /* JADX INFO: renamed from: f */
    public final int f49625f;

    /* JADX INFO: renamed from: g */
    public final int f49626g;

    /* JADX INFO: renamed from: h */
    public boolean f49627h;

    /* JADX INFO: renamed from: i */
    public InterfaceC12901a f49628i;

    /* JADX INFO: renamed from: j */
    public int f49629j;

    /* JADX INFO: renamed from: k */
    public Paint f49630k;

    /* JADX INFO: renamed from: l */
    public Paint f49631l;

    /* JADX INFO: renamed from: m */
    public Paint f49632m;

    /* JADX INFO: renamed from: n */
    public final String f49633n;

    /* JADX INFO: renamed from: o */
    public final int f49634o;

    /* JADX INFO: renamed from: p */
    public boolean f49635p;

    /* JADX INFO: renamed from: q */
    public float f49636q;

    /* JADX INFO: renamed from: r */
    public float f49637r;

    /* JADX INFO: renamed from: s */
    public long f49638s;

    /* JADX INFO: renamed from: t */
    public final ArgbEvaluator f49639t;

    /* JADX INFO: renamed from: u */
    public float f49640u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuToggleButton$a */
    public interface InterfaceC12901a {
        /* JADX INFO: renamed from: a */
        void mo73708a(boolean z);
    }

    public DanmakuToggleButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49622c = 1.2f;
        this.f49623d = qa00.m175859d(9.0f);
        this.f49627h = false;
        this.f49629j = 350;
        this.f49635p = false;
        this.f49639t = new ArgbEvaluator();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184114Y);
        this.f49633n = typedArrayObtainStyledAttributes.getString(vhc0.f184121c0);
        this.f49634o = typedArrayObtainStyledAttributes.getDimensionPixelSize(vhc0.f184123d0, qa00.f156326m);
        this.f49624e = typedArrayObtainStyledAttributes.getColor(vhc0.f184119b0, 452984831);
        this.f49625f = typedArrayObtainStyledAttributes.getColor(vhc0.f184117a0, -509799);
        this.f49626g = typedArrayObtainStyledAttributes.getColor(vhc0.f184115Z, -30697);
        typedArrayObtainStyledAttributes.recycle();
        m73705c();
    }

    private int getRectColor() {
        boolean z = this.f49635p;
        int i = this.f49629j;
        if (z) {
            float f = i / 320.0f;
            return f >= 1.0f ? this.f49626g : ((Integer) this.f49639t.evaluate(f, Integer.valueOf(this.f49625f), Integer.valueOf(this.f49626g))).intValue();
        }
        float f2 = i / 220.0f;
        if (f2 >= 1.0f) {
            return 16746519;
        }
        return Color.argb((int) ((1.0f - f2) * 255.0f), 255, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 23);
    }

    private int getTextColor() {
        boolean z = this.f49635p;
        int i = this.f49629j;
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
    public final void m73704b(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = this.f49620a;
        float f6 = (f5 * 1.2f) / 2.0f;
        float f7 = this.f49621b;
        float f8 = (1.2f * f7) / 2.0f;
        float f9 = f5 / 2.0f;
        float f10 = f7 / 2.0f;
        float f11 = this.f49623d;
        if (this.f49635p) {
            int i = this.f49629j;
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
        this.f49632m.setColor(getRectColor());
        canvas.drawRoundRect(new RectF(f, f4, f2, f3), f11, f11, this.f49632m);
    }

    /* JADX INFO: renamed from: c */
    public final void m73705c() {
        Paint paint = new Paint(1);
        this.f49630k = paint;
        paint.setTextSize(this.f49634o);
        this.f49630k.setColor(2063597567);
        Paint.FontMetrics fontMetrics = this.f49630k.getFontMetrics();
        this.f49640u = (-fontMetrics.top) + fontMetrics.bottom;
        Paint paint2 = new Paint(1);
        this.f49631l = paint2;
        paint2.setColor(this.f49624e);
        this.f49632m = new Paint(1);
        this.f49637r = (this.f49630k.descent() + this.f49630k.ascent()) / 2.0f;
        this.f49636q = this.f49630k.measureText(this.f49633n);
        setOnClickListener(new View.OnClickListener() { // from class: l.e3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91948a.m73707e(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m73706d() {
        return this.f49635p;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m73707e(View view) {
        if (this.f49627h) {
            return;
        }
        this.f49635p = !this.f49635p;
        this.f49627h = true;
        this.f49638s = System.currentTimeMillis();
        this.f49629j = 0;
        InterfaceC12901a interfaceC12901a = this.f49628i;
        if (interfaceC12901a != null) {
            interfaceC12901a.mo73708a(this.f49635p);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f49620a;
        float f2 = this.f49621b;
        float f3 = this.f49623d;
        canvas.drawRoundRect((f * 0.20000005f) / 2.0f, (f2 * 0.20000005f) / 2.0f, ((f * 0.20000005f) / 2.0f) + f, ((0.20000005f * f2) / 2.0f) + f2, f3, f3, this.f49631l);
        m73704b(canvas);
        this.f49630k.setColor(getTextColor());
        canvas.drawText(this.f49633n, ((this.f49620a * 1.2f) / 2.0f) - (this.f49636q / 2.0f), ((this.f49621b * 1.2f) / 2.0f) - this.f49637r, this.f49630k);
        if (this.f49627h) {
            if (this.f49629j < 350) {
                this.f49629j = (int) (System.currentTimeMillis() - this.f49638s);
                invalidate();
            } else {
                this.f49629j = 350;
                this.f49627h = false;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((qa00.m175859d(7.0f) << 1) + this.f49636q) * 1.2f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (((qa00.f156318e << 1) + this.f49640u) * 1.2f), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f49620a = i / 1.2f;
        this.f49621b = i2 / 1.2f;
    }

    public void setChecked(boolean z) {
        if (this.f49635p != z) {
            this.f49635p = z;
            InterfaceC12901a interfaceC12901a = this.f49628i;
            if (interfaceC12901a != null) {
                interfaceC12901a.mo73708a(z);
            }
            invalidate();
        }
    }

    public void setOnCheckedChangeListener(@Nullable InterfaceC12901a interfaceC12901a) {
        this.f49628i = interfaceC12901a;
    }

    public DanmakuToggleButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DanmakuToggleButton(Context context) {
        this(context, null);
    }
}
