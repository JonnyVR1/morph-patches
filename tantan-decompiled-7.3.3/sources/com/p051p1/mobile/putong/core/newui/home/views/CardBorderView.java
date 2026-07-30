package com.p051p1.mobile.putong.core.newui.home.views;

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
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class CardBorderView extends View {

    /* JADX INFO: renamed from: A */
    public int[] f24129A;

    /* JADX INFO: renamed from: B */
    public float f24130B;

    /* JADX INFO: renamed from: C */
    public final Paint f24131C;

    /* JADX INFO: renamed from: D */
    public final Path f24132D;

    /* JADX INFO: renamed from: E */
    public final int[] f24133E;

    /* JADX INFO: renamed from: F */
    public final float[] f24134F;

    /* JADX INFO: renamed from: G */
    public final int f24135G;

    /* JADX INFO: renamed from: H */
    public final int f24136H;

    /* JADX INFO: renamed from: I */
    public boolean f24137I;

    /* JADX INFO: renamed from: J */
    public DrawFilter f24138J;

    /* JADX INFO: renamed from: K */
    public final Paint f24139K;

    /* JADX INFO: renamed from: a */
    public final int[] f24140a;

    /* JADX INFO: renamed from: b */
    public final int[] f24141b;

    /* JADX INFO: renamed from: c */
    public final int[] f24142c;

    /* JADX INFO: renamed from: d */
    public final float[] f24143d;

    /* JADX INFO: renamed from: e */
    public final int f24144e;

    /* JADX INFO: renamed from: f */
    public int f24145f;

    /* JADX INFO: renamed from: g */
    public int f24146g;

    /* JADX INFO: renamed from: h */
    public int f24147h;

    /* JADX INFO: renamed from: i */
    public int f24148i;

    /* JADX INFO: renamed from: j */
    public int f24149j;

    /* JADX INFO: renamed from: k */
    public final Paint f24150k;

    /* JADX INFO: renamed from: l */
    public final Path f24151l;

    /* JADX INFO: renamed from: m */
    public final RectF f24152m;

    /* JADX INFO: renamed from: n */
    public final RectF f24153n;

    /* JADX INFO: renamed from: o */
    public final PorterDuffXfermode f24154o;

    /* JADX INFO: renamed from: p */
    public int f24155p;

    /* JADX INFO: renamed from: q */
    public int f24156q;

    /* JADX INFO: renamed from: r */
    public Bitmap f24157r;

    /* JADX INFO: renamed from: s */
    public int[] f24158s;

    /* JADX INFO: renamed from: t */
    public final int f24159t;

    /* JADX INFO: renamed from: u */
    public final int[] f24160u;

    /* JADX INFO: renamed from: v */
    public final int[] f24161v;

    /* JADX INFO: renamed from: w */
    public final float[] f24162w;

    /* JADX INFO: renamed from: x */
    public final Paint f24163x;

    /* JADX INFO: renamed from: y */
    public final Path f24164y;

    /* JADX INFO: renamed from: z */
    public final PorterDuffXfermode f24165z;

    public CardBorderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int[] iArr = {Color.parseColor("#ffe78c"), Color.parseColor("#f8c045"), Color.parseColor("#ffe993"), Color.parseColor("#f8c045"), Color.parseColor("#ffe686"), Color.parseColor("#fbc44f")};
        this.f24140a = iArr;
        this.f24141b = new int[]{Color.parseColor("#e4f0ff"), Color.parseColor("#8b9fbb"), Color.parseColor("#cdd9e6"), Color.parseColor("#93a0b4"), Color.parseColor("#cdd9e6"), Color.parseColor("#93a0b4")};
        this.f24142c = new int[]{Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18")};
        this.f24143d = new float[]{0.0f, 0.22f, 0.41f, 0.58f, 0.81f, 1.0f};
        int i2 = qa00.f156328o;
        this.f24144e = i2;
        int i3 = qa00.f156326m;
        this.f24145f = i3;
        this.f24146g = qa00.f156296I;
        this.f24147h = i2;
        this.f24148i = qa00.f156320g;
        this.f24149j = qa00.m175859d(7.0f);
        this.f24150k = new Paint(1);
        this.f24151l = new Path();
        this.f24152m = new RectF();
        this.f24153n = new RectF();
        this.f24154o = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f24157r = null;
        this.f24158s = iArr;
        this.f24159t = qa00.f156302O;
        int[] iArr2 = {Color.parseColor("#00FFFFFF"), Color.parseColor("#CCFFF473"), Color.parseColor("#E5FFFCB1"), Color.parseColor("#CCFFF473"), Color.parseColor("#00FFFFFF")};
        this.f24160u = iArr2;
        this.f24161v = new int[]{Color.parseColor("#00FFFFFF"), Color.parseColor("#CCDBEDFF"), Color.parseColor("#E5E9F4FF"), Color.parseColor("#CCDBEDFF"), Color.parseColor("#00FFFFFF")};
        this.f24162w = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        this.f24163x = new Paint(1);
        this.f24164y = new Path();
        this.f24165z = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f24129A = iArr2;
        this.f24130B = 0.0f;
        this.f24131C = new Paint(1);
        this.f24132D = new Path();
        this.f24133E = new int[]{Color.parseColor("#F2CF94"), Color.parseColor("#E2C088"), Color.parseColor("#FCDD99")};
        this.f24134F = new float[]{0.0f, 0.5f, 1.0f};
        this.f24135G = qa00.f156316c;
        this.f24136H = i3;
        this.f24137I = false;
        this.f24138J = new PaintFlagsDrawFilter(0, 3);
        this.f24139K = new Paint(1);
        m39887e();
    }

    /* JADX INFO: renamed from: a */
    public final void m39883a(Canvas canvas) {
        int i = qa00.f156323j;
        m39889g(-i);
        canvas.drawPath(this.f24132D, this.f24131C);
        m39889g(0);
        canvas.drawPath(this.f24132D, this.f24131C);
        m39889g(i);
        canvas.drawPath(this.f24132D, this.f24131C);
    }

    /* JADX INFO: renamed from: b */
    public final void m39884b() {
        int i = this.f24155p - this.f24149j;
        this.f24151l.reset();
        Path path = this.f24151l;
        int i2 = this.f24149j;
        path.moveTo(this.f24145f + i2, i2);
        int i3 = i - this.f24146g;
        this.f24151l.lineTo(i3, this.f24149j);
        Path path2 = this.f24151l;
        int i4 = this.f24146g;
        float f = i3 - i4;
        int i5 = this.f24149j;
        float f2 = i;
        path2.arcTo(f, i5, f2, (i4 * 2) + i5, -90.0f, 90.0f, false);
        this.f24151l.lineTo(f2, (this.f24156q - this.f24149j) - this.f24145f);
        Path path3 = this.f24151l;
        int i6 = this.f24145f;
        float f3 = i - (i6 * 2);
        int i7 = this.f24156q;
        int i8 = this.f24149j;
        path3.arcTo(f3, (i7 - i8) - (i6 * 2), f2, i7 - i8, 0.0f, 90.0f, false);
        Path path4 = this.f24151l;
        int i9 = this.f24149j;
        path4.lineTo(this.f24145f + i9, this.f24156q - i9);
        Path path5 = this.f24151l;
        int i10 = this.f24149j;
        int i11 = this.f24156q;
        int i12 = this.f24145f;
        path5.arcTo(i10, (i11 - i10) - (i12 * 2), (i12 * 2) + i10, i11 - i10, 90.0f, 90.0f, false);
        Path path6 = this.f24151l;
        int i13 = this.f24149j;
        path6.lineTo(i13, i13 + this.f24145f);
        Path path7 = this.f24151l;
        int i14 = this.f24149j;
        int i15 = this.f24145f;
        path7.arcTo(i14, i14, (i15 * 2) + i14, i14 + (i15 * 2), 180.0f, 90.0f, false);
        this.f24151l.close();
    }

    /* JADX INFO: renamed from: c */
    public final void m39885c() {
        float f = this.f24156q;
        int[] iArr = this.f24158s;
        float[] fArr = this.f24143d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f24150k.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, iArr, fArr, tileMode));
        this.f24131C.setShader(new LinearGradient(0.0f, this.f24156q, this.f24155p, 0.0f, this.f24133E, this.f24134F, tileMode));
    }

    /* JADX INFO: renamed from: d */
    public final void m39886d() {
        RectF rectF = this.f24153n;
        int i = this.f24155p;
        int i2 = this.f24147h;
        rectF.set(i - i2, 0.0f, i, i2);
        RectF rectF2 = this.f24153n;
        int i3 = this.f24148i;
        rectF2.offset(-i3, i3);
    }

    /* JADX INFO: renamed from: e */
    public final void m39887e() {
        setLayerType(1, null);
        Paint paint = this.f24139K;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f24150k;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.f24163x.setStyle(style2);
        this.f24131C.setStyle(style);
        this.f24131C.setStrokeWidth(this.f24135G);
    }

    /* JADX INFO: renamed from: f */
    public final void m39888f() {
        if (this.f24155p <= 0 || this.f24156q <= 0) {
            return;
        }
        m39886d();
        m39885c();
        m39884b();
    }

    /* JADX INFO: renamed from: g */
    public final void m39889g(int i) {
        int i2 = this.f24149j / 2;
        int i3 = this.f24155p - i2;
        int i4 = this.f24156q - i2;
        this.f24132D.reset();
        float f = i2;
        this.f24132D.moveTo(this.f24136H + i2, f);
        int i5 = qa00.f156294G + i;
        int i6 = i3 - i5;
        this.f24132D.lineTo(i6, f);
        float f2 = i3;
        this.f24132D.arcTo(i6 - i5, f, f2, (i5 * 2) + i2, -90.0f, 90.0f, false);
        this.f24132D.lineTo(f2, i4 - this.f24136H);
        Path path = this.f24132D;
        int i7 = this.f24136H;
        float f3 = i4;
        path.arcTo(i3 - (i7 * 2), i4 - (i7 * 2), f2, f3, 0.0f, 90.0f, false);
        this.f24132D.lineTo(this.f24136H + i2, f3);
        Path path2 = this.f24132D;
        int i8 = this.f24136H;
        path2.arcTo(f, i4 - (i8 * 2), (i8 * 2) + i2, f3, 90.0f, 90.0f, false);
        this.f24132D.lineTo(f, this.f24136H + i2);
        Path path3 = this.f24132D;
        int i9 = this.f24136H;
        path3.arcTo(f, f, (i9 * 2) + i2, i2 + (i9 * 2), 180.0f, 90.0f, false);
        this.f24132D.close();
    }

    /* JADX INFO: renamed from: h */
    public final void m39890h(float f) {
        if (this.f24155p <= 0 || this.f24156q <= 0) {
            return;
        }
        float fCos = (float) (((double) this.f24159t) / Math.cos(0.2617993950843811d));
        float fTan = ((float) (Math.tan(0.2617993950843811d) * ((double) this.f24156q))) + fCos;
        float f2 = (this.f24155p + fTan) * f;
        this.f24164y.reset();
        float f3 = (-fTan) + f2;
        this.f24164y.moveTo(f3, 0.0f);
        this.f24164y.lineTo(f3 + fCos, 0.0f);
        this.f24164y.lineTo(f2, this.f24156q);
        this.f24164y.lineTo((-fCos) + f2, this.f24156q);
        this.f24164y.close();
        this.f24163x.setShader(new LinearGradient(f3, 0.0f, (float) (((double) f3) + (((double) this.f24159t) * Math.cos(0.2617993950843811d))), (float) (((double) (-this.f24159t)) * Math.sin(0.2617993950843811d)), this.f24129A, this.f24162w, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.setDrawFilter(this.f24138J);
        if (this.f24151l.isEmpty()) {
            m39888f();
        }
        this.f24152m.set(0.0f, 0.0f, this.f24155p, this.f24156q);
        RectF rectF = this.f24152m;
        int i = this.f24144e;
        canvas.drawRoundRect(rectF, i, i, this.f24150k);
        this.f24150k.setXfermode(this.f24154o);
        canvas.drawPath(this.f24151l, this.f24150k);
        this.f24150k.setXfermode(null);
        if (this.f24137I) {
            m39883a(canvas);
        }
        this.f24163x.setXfermode(this.f24165z);
        m39890h(this.f24130B);
        if (!this.f24164y.isEmpty()) {
            canvas.drawPath(this.f24164y, this.f24163x);
        }
        this.f24163x.setXfermode(null);
        Bitmap bitmap = this.f24157r;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f24153n, this.f24139K);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f24155p = getMeasuredWidth();
        this.f24156q = getMeasuredHeight();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f24155p = i;
        this.f24156q = i2;
        m39888f();
    }

    public CardBorderView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBorderView(Context context) {
        this(context, null);
    }
}
