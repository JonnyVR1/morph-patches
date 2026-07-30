package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DrawFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBorderView extends View {

    /* JADX INFO: renamed from: A */
    public int[] f2165A;

    /* JADX INFO: renamed from: B */
    public float f2166B;

    /* JADX INFO: renamed from: C */
    public final Paint f2167C;

    /* JADX INFO: renamed from: D */
    public final Path f2168D;

    /* JADX INFO: renamed from: E */
    public final int[] f2169E;

    /* JADX INFO: renamed from: F */
    public final float[] f2170F;

    /* JADX INFO: renamed from: G */
    public final int f2171G;

    /* JADX INFO: renamed from: H */
    public final int f2172H;

    /* JADX INFO: renamed from: I */
    public boolean f2173I;

    /* JADX INFO: renamed from: J */
    public DrawFilter f2174J;

    /* JADX INFO: renamed from: K */
    public final Paint f2175K;

    /* JADX INFO: renamed from: a */
    public final int[] f2176a;

    /* JADX INFO: renamed from: b */
    public final int[] f2177b;

    /* JADX INFO: renamed from: c */
    public final int[] f2178c;

    /* JADX INFO: renamed from: d */
    public final float[] f2179d;

    /* JADX INFO: renamed from: e */
    public final int f2180e;

    /* JADX INFO: renamed from: f */
    public int f2181f;

    /* JADX INFO: renamed from: g */
    public int f2182g;

    /* JADX INFO: renamed from: h */
    public int f2183h;

    /* JADX INFO: renamed from: i */
    public int f2184i;

    /* JADX INFO: renamed from: j */
    public int f2185j;

    /* JADX INFO: renamed from: k */
    public final Paint f2186k;

    /* JADX INFO: renamed from: l */
    public final Path f2187l;

    /* JADX INFO: renamed from: m */
    public final RectF f2188m;

    /* JADX INFO: renamed from: n */
    public final RectF f2189n;

    /* JADX INFO: renamed from: o */
    public final PorterDuffXfermode f2190o;

    /* JADX INFO: renamed from: p */
    public int f2191p;

    /* JADX INFO: renamed from: q */
    public int f2192q;

    /* JADX INFO: renamed from: r */
    public Bitmap f2193r;

    /* JADX INFO: renamed from: s */
    public int[] f2194s;

    /* JADX INFO: renamed from: t */
    public final int f2195t;

    /* JADX INFO: renamed from: u */
    public final int[] f2196u;

    /* JADX INFO: renamed from: v */
    public final int[] f2197v;

    /* JADX INFO: renamed from: w */
    public final float[] f2198w;

    /* JADX INFO: renamed from: x */
    public final Paint f2199x;

    /* JADX INFO: renamed from: y */
    public final Path f2200y;

    /* JADX INFO: renamed from: z */
    public final PorterDuffXfermode f2201z;

    public CardBorderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int[] iArr = {Color.parseColor("#ffe78c"), Color.parseColor("#f8c045"), Color.parseColor("#ffe993"), Color.parseColor("#f8c045"), Color.parseColor("#ffe686"), Color.parseColor("#fbc44f")};
        this.f2176a = iArr;
        this.f2177b = new int[]{Color.parseColor("#e4f0ff"), Color.parseColor("#8b9fbb"), Color.parseColor("#cdd9e6"), Color.parseColor("#93a0b4"), Color.parseColor("#cdd9e6"), Color.parseColor("#93a0b4")};
        this.f2178c = new int[]{Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18")};
        this.f2179d = new float[]{0.0f, 0.22f, 0.41f, 0.58f, 0.81f, 1.0f};
        int i2 = t100.o;
        this.f2180e = i2;
        int i3 = t100.m;
        this.f2181f = i3;
        this.f2182g = t100.I;
        this.f2183h = i2;
        this.f2184i = t100.g;
        this.f2185j = t100.d(7.0f);
        this.f2186k = new Paint(1);
        this.f2187l = new Path();
        this.f2188m = new RectF();
        this.f2189n = new RectF();
        this.f2190o = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f2193r = null;
        this.f2194s = iArr;
        this.f2195t = t100.O;
        int[] iArr2 = {Color.parseColor("#00FFFFFF"), Color.parseColor("#CCFFF473"), Color.parseColor("#E5FFFCB1"), Color.parseColor("#CCFFF473"), Color.parseColor("#00FFFFFF")};
        this.f2196u = iArr2;
        this.f2197v = new int[]{Color.parseColor("#00FFFFFF"), Color.parseColor("#CCDBEDFF"), Color.parseColor("#E5E9F4FF"), Color.parseColor("#CCDBEDFF"), Color.parseColor("#00FFFFFF")};
        this.f2198w = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        this.f2199x = new Paint(1);
        this.f2200y = new Path();
        this.f2201z = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f2165A = iArr2;
        this.f2166B = 0.0f;
        this.f2167C = new Paint(1);
        this.f2168D = new Path();
        this.f2169E = new int[]{Color.parseColor("#F2CF94"), Color.parseColor("#E2C088"), Color.parseColor("#FCDD99")};
        this.f2170F = new float[]{0.0f, 0.5f, 1.0f};
        this.f2171G = t100.c;
        this.f2172H = i3;
        this.f2173I = false;
        this.f2174J = new PaintFlagsDrawFilter(0, 3);
        this.f2175K = new Paint(1);
        m2891e();
    }

    /* JADX INFO: renamed from: a */
    public final void m2887a(Canvas canvas) {
        int i = t100.j;
        m2893g(-i);
        canvas.drawPath(this.f2168D, this.f2167C);
        m2893g(0);
        canvas.drawPath(this.f2168D, this.f2167C);
        m2893g(i);
        canvas.drawPath(this.f2168D, this.f2167C);
    }

    /* JADX INFO: renamed from: b */
    public final void m2888b() {
        int i = this.f2191p - this.f2185j;
        this.f2187l.reset();
        Path path = this.f2187l;
        int i2 = this.f2185j;
        path.moveTo(this.f2181f + i2, i2);
        int i3 = i - this.f2182g;
        this.f2187l.lineTo(i3, this.f2185j);
        Path path2 = this.f2187l;
        int i4 = this.f2182g;
        float f = i3 - i4;
        int i5 = this.f2185j;
        float f2 = i;
        path2.arcTo(f, i5, f2, (i4 * 2) + i5, -90.0f, 90.0f, false);
        this.f2187l.lineTo(f2, (this.f2192q - this.f2185j) - this.f2181f);
        Path path3 = this.f2187l;
        int i6 = this.f2181f;
        float f3 = i - (i6 * 2);
        int i7 = this.f2192q;
        int i8 = this.f2185j;
        path3.arcTo(f3, (i7 - i8) - (i6 * 2), f2, i7 - i8, 0.0f, 90.0f, false);
        Path path4 = this.f2187l;
        int i9 = this.f2185j;
        path4.lineTo(this.f2181f + i9, this.f2192q - i9);
        Path path5 = this.f2187l;
        int i10 = this.f2185j;
        int i11 = this.f2192q;
        int i12 = this.f2181f;
        path5.arcTo(i10, (i11 - i10) - (i12 * 2), (i12 * 2) + i10, i11 - i10, 90.0f, 90.0f, false);
        Path path6 = this.f2187l;
        int i13 = this.f2185j;
        path6.lineTo(i13, i13 + this.f2181f);
        Path path7 = this.f2187l;
        int i14 = this.f2185j;
        int i15 = this.f2181f;
        path7.arcTo(i14, i14, (i15 * 2) + i14, i14 + (i15 * 2), 180.0f, 90.0f, false);
        this.f2187l.close();
    }

    /* JADX INFO: renamed from: c */
    public final void m2889c() {
        float f = this.f2192q;
        int[] iArr = this.f2194s;
        float[] fArr = this.f2179d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f2186k.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, iArr, fArr, tileMode));
        this.f2167C.setShader(new LinearGradient(0.0f, this.f2192q, this.f2191p, 0.0f, this.f2169E, this.f2170F, tileMode));
    }

    /* JADX INFO: renamed from: d */
    public final void m2890d() {
        RectF rectF = this.f2189n;
        int i = this.f2191p;
        int i2 = this.f2183h;
        rectF.set(i - i2, 0.0f, i, i2);
        RectF rectF2 = this.f2189n;
        int i3 = this.f2184i;
        rectF2.offset(-i3, i3);
    }

    /* JADX INFO: renamed from: e */
    public final void m2891e() {
        setLayerType(1, null);
        Paint paint = this.f2175K;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f2186k;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.f2199x.setStyle(style2);
        this.f2167C.setStyle(style);
        this.f2167C.setStrokeWidth(this.f2171G);
    }

    /* JADX INFO: renamed from: f */
    public final void m2892f() {
        if (this.f2191p <= 0 || this.f2192q <= 0) {
            return;
        }
        m2890d();
        m2889c();
        m2888b();
    }

    /* JADX INFO: renamed from: g */
    public final void m2893g(int i) {
        int i2 = this.f2185j / 2;
        int i3 = this.f2191p - i2;
        int i4 = this.f2192q - i2;
        this.f2168D.reset();
        float f = i2;
        this.f2168D.moveTo(this.f2172H + i2, f);
        int i5 = t100.G + i;
        int i6 = i3 - i5;
        this.f2168D.lineTo(i6, f);
        float f2 = i3;
        this.f2168D.arcTo(i6 - i5, f, f2, (i5 * 2) + i2, -90.0f, 90.0f, false);
        this.f2168D.lineTo(f2, i4 - this.f2172H);
        Path path = this.f2168D;
        int i7 = this.f2172H;
        float f3 = i4;
        path.arcTo(i3 - (i7 * 2), i4 - (i7 * 2), f2, f3, 0.0f, 90.0f, false);
        this.f2168D.lineTo(this.f2172H + i2, f3);
        Path path2 = this.f2168D;
        int i8 = this.f2172H;
        path2.arcTo(f, i4 - (i8 * 2), (i8 * 2) + i2, f3, 90.0f, 90.0f, false);
        this.f2168D.lineTo(f, this.f2172H + i2);
        Path path3 = this.f2168D;
        int i9 = this.f2172H;
        path3.arcTo(f, f, (i9 * 2) + i2, i2 + (i9 * 2), 180.0f, 90.0f, false);
        this.f2168D.close();
    }

    /* JADX INFO: renamed from: h */
    public final void m2894h(float f) {
        if (this.f2191p <= 0 || this.f2192q <= 0) {
            return;
        }
        float fCos = (float) (((double) this.f2195t) / Math.cos(0.2617993950843811d));
        float fTan = ((float) (Math.tan(0.2617993950843811d) * ((double) this.f2192q))) + fCos;
        float f2 = (this.f2191p + fTan) * f;
        this.f2200y.reset();
        float f3 = (-fTan) + f2;
        this.f2200y.moveTo(f3, 0.0f);
        this.f2200y.lineTo(f3 + fCos, 0.0f);
        this.f2200y.lineTo(f2, this.f2192q);
        this.f2200y.lineTo((-fCos) + f2, this.f2192q);
        this.f2200y.close();
        this.f2199x.setShader(new LinearGradient(f3, 0.0f, (float) (((double) f3) + (((double) this.f2195t) * Math.cos(0.2617993950843811d))), (float) (((double) (-this.f2195t)) * Math.sin(0.2617993950843811d)), this.f2165A, this.f2198w, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.setDrawFilter(this.f2174J);
        if (this.f2187l.isEmpty()) {
            m2892f();
        }
        this.f2188m.set(0.0f, 0.0f, this.f2191p, this.f2192q);
        RectF rectF = this.f2188m;
        int i = this.f2180e;
        canvas.drawRoundRect(rectF, i, i, this.f2186k);
        this.f2186k.setXfermode(this.f2190o);
        canvas.drawPath(this.f2187l, this.f2186k);
        this.f2186k.setXfermode(null);
        if (this.f2173I) {
            m2887a(canvas);
        }
        this.f2199x.setXfermode(this.f2201z);
        m2894h(this.f2166B);
        if (!this.f2200y.isEmpty()) {
            canvas.drawPath(this.f2200y, this.f2199x);
        }
        this.f2199x.setXfermode(null);
        Bitmap bitmap = this.f2193r;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f2189n, this.f2175K);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f2191p = getMeasuredWidth();
        this.f2192q = getMeasuredHeight();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f2191p = i;
        this.f2192q = i2;
        m2892f();
    }

    public CardBorderView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBorderView(Context context) {
        this(context, null);
    }
}
