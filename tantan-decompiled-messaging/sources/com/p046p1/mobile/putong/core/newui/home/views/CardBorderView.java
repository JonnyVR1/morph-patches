package com.p046p1.mobile.putong.core.newui.home.views;

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
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class CardBorderView extends View {

    /* JADX INFO: renamed from: A */
    public int[] f23387A;

    /* JADX INFO: renamed from: B */
    public float f23388B;

    /* JADX INFO: renamed from: C */
    public final Paint f23389C;

    /* JADX INFO: renamed from: D */
    public final Path f23390D;

    /* JADX INFO: renamed from: E */
    public final int[] f23391E;

    /* JADX INFO: renamed from: F */
    public final float[] f23392F;

    /* JADX INFO: renamed from: G */
    public final int f23393G;

    /* JADX INFO: renamed from: H */
    public final int f23394H;

    /* JADX INFO: renamed from: I */
    public boolean f23395I;

    /* JADX INFO: renamed from: J */
    public DrawFilter f23396J;

    /* JADX INFO: renamed from: K */
    public final Paint f23397K;

    /* JADX INFO: renamed from: a */
    public final int[] f23398a;

    /* JADX INFO: renamed from: b */
    public final int[] f23399b;

    /* JADX INFO: renamed from: c */
    public final int[] f23400c;

    /* JADX INFO: renamed from: d */
    public final float[] f23401d;

    /* JADX INFO: renamed from: e */
    public final int f23402e;

    /* JADX INFO: renamed from: f */
    public int f23403f;

    /* JADX INFO: renamed from: g */
    public int f23404g;

    /* JADX INFO: renamed from: h */
    public int f23405h;

    /* JADX INFO: renamed from: i */
    public int f23406i;

    /* JADX INFO: renamed from: j */
    public int f23407j;

    /* JADX INFO: renamed from: k */
    public final Paint f23408k;

    /* JADX INFO: renamed from: l */
    public final Path f23409l;

    /* JADX INFO: renamed from: m */
    public final RectF f23410m;

    /* JADX INFO: renamed from: n */
    public final RectF f23411n;

    /* JADX INFO: renamed from: o */
    public final PorterDuffXfermode f23412o;

    /* JADX INFO: renamed from: p */
    public int f23413p;

    /* JADX INFO: renamed from: q */
    public int f23414q;

    /* JADX INFO: renamed from: r */
    public Bitmap f23415r;

    /* JADX INFO: renamed from: s */
    public int[] f23416s;

    /* JADX INFO: renamed from: t */
    public final int f23417t;

    /* JADX INFO: renamed from: u */
    public final int[] f23418u;

    /* JADX INFO: renamed from: v */
    public final int[] f23419v;

    /* JADX INFO: renamed from: w */
    public final float[] f23420w;

    /* JADX INFO: renamed from: x */
    public final Paint f23421x;

    /* JADX INFO: renamed from: y */
    public final Path f23422y;

    /* JADX INFO: renamed from: z */
    public final PorterDuffXfermode f23423z;

    public CardBorderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int[] iArr = {Color.parseColor("#ffe78c"), Color.parseColor("#f8c045"), Color.parseColor("#ffe993"), Color.parseColor("#f8c045"), Color.parseColor("#ffe686"), Color.parseColor("#fbc44f")};
        this.f23398a = iArr;
        this.f23399b = new int[]{Color.parseColor("#e4f0ff"), Color.parseColor("#8b9fbb"), Color.parseColor("#cdd9e6"), Color.parseColor("#93a0b4"), Color.parseColor("#cdd9e6"), Color.parseColor("#93a0b4")};
        this.f23400c = new int[]{Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18"), Color.parseColor("#211d18")};
        this.f23401d = new float[]{0.0f, 0.22f, 0.41f, 0.58f, 0.81f, 1.0f};
        int i2 = t100.f167266o;
        this.f23402e = i2;
        int i3 = t100.f167264m;
        this.f23403f = i3;
        this.f23404g = t100.f167234I;
        this.f23405h = i2;
        this.f23406i = t100.f167258g;
        this.f23407j = t100.m186890d(7.0f);
        this.f23408k = new Paint(1);
        this.f23409l = new Path();
        this.f23410m = new RectF();
        this.f23411n = new RectF();
        this.f23412o = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f23415r = null;
        this.f23416s = iArr;
        this.f23417t = t100.f167240O;
        int[] iArr2 = {Color.parseColor("#00FFFFFF"), Color.parseColor("#CCFFF473"), Color.parseColor("#E5FFFCB1"), Color.parseColor("#CCFFF473"), Color.parseColor("#00FFFFFF")};
        this.f23418u = iArr2;
        this.f23419v = new int[]{Color.parseColor("#00FFFFFF"), Color.parseColor("#CCDBEDFF"), Color.parseColor("#E5E9F4FF"), Color.parseColor("#CCDBEDFF"), Color.parseColor("#00FFFFFF")};
        this.f23420w = new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f};
        this.f23421x = new Paint(1);
        this.f23422y = new Path();
        this.f23423z = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        this.f23387A = iArr2;
        this.f23388B = 0.0f;
        this.f23389C = new Paint(1);
        this.f23390D = new Path();
        this.f23391E = new int[]{Color.parseColor("#F2CF94"), Color.parseColor("#E2C088"), Color.parseColor("#FCDD99")};
        this.f23392F = new float[]{0.0f, 0.5f, 1.0f};
        this.f23393G = t100.f167254c;
        this.f23394H = i3;
        this.f23395I = false;
        this.f23396J = new PaintFlagsDrawFilter(0, 3);
        this.f23397K = new Paint(1);
        m38884e();
    }

    /* JADX INFO: renamed from: a */
    public final void m38880a(Canvas canvas) {
        int i = t100.f167261j;
        m38886g(-i);
        canvas.drawPath(this.f23390D, this.f23389C);
        m38886g(0);
        canvas.drawPath(this.f23390D, this.f23389C);
        m38886g(i);
        canvas.drawPath(this.f23390D, this.f23389C);
    }

    /* JADX INFO: renamed from: b */
    public final void m38881b() {
        int i = this.f23413p - this.f23407j;
        this.f23409l.reset();
        Path path = this.f23409l;
        int i2 = this.f23407j;
        path.moveTo(this.f23403f + i2, i2);
        int i3 = i - this.f23404g;
        this.f23409l.lineTo(i3, this.f23407j);
        Path path2 = this.f23409l;
        int i4 = this.f23404g;
        float f = i3 - i4;
        int i5 = this.f23407j;
        float f2 = i;
        path2.arcTo(f, i5, f2, (i4 * 2) + i5, -90.0f, 90.0f, false);
        this.f23409l.lineTo(f2, (this.f23414q - this.f23407j) - this.f23403f);
        Path path3 = this.f23409l;
        int i6 = this.f23403f;
        float f3 = i - (i6 * 2);
        int i7 = this.f23414q;
        int i8 = this.f23407j;
        path3.arcTo(f3, (i7 - i8) - (i6 * 2), f2, i7 - i8, 0.0f, 90.0f, false);
        Path path4 = this.f23409l;
        int i9 = this.f23407j;
        path4.lineTo(this.f23403f + i9, this.f23414q - i9);
        Path path5 = this.f23409l;
        int i10 = this.f23407j;
        int i11 = this.f23414q;
        int i12 = this.f23403f;
        path5.arcTo(i10, (i11 - i10) - (i12 * 2), (i12 * 2) + i10, i11 - i10, 90.0f, 90.0f, false);
        Path path6 = this.f23409l;
        int i13 = this.f23407j;
        path6.lineTo(i13, i13 + this.f23403f);
        Path path7 = this.f23409l;
        int i14 = this.f23407j;
        int i15 = this.f23403f;
        path7.arcTo(i14, i14, (i15 * 2) + i14, i14 + (i15 * 2), 180.0f, 90.0f, false);
        this.f23409l.close();
    }

    /* JADX INFO: renamed from: c */
    public final void m38882c() {
        float f = this.f23414q;
        int[] iArr = this.f23416s;
        float[] fArr = this.f23401d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f23408k.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, iArr, fArr, tileMode));
        this.f23389C.setShader(new LinearGradient(0.0f, this.f23414q, this.f23413p, 0.0f, this.f23391E, this.f23392F, tileMode));
    }

    /* JADX INFO: renamed from: d */
    public final void m38883d() {
        RectF rectF = this.f23411n;
        int i = this.f23413p;
        int i2 = this.f23405h;
        rectF.set(i - i2, 0.0f, i, i2);
        RectF rectF2 = this.f23411n;
        int i3 = this.f23406i;
        rectF2.offset(-i3, i3);
    }

    /* JADX INFO: renamed from: e */
    public final void m38884e() {
        setLayerType(1, null);
        Paint paint = this.f23397K;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f23408k;
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        this.f23421x.setStyle(style2);
        this.f23389C.setStyle(style);
        this.f23389C.setStrokeWidth(this.f23393G);
    }

    /* JADX INFO: renamed from: f */
    public final void m38885f() {
        if (this.f23413p <= 0 || this.f23414q <= 0) {
            return;
        }
        m38883d();
        m38882c();
        m38881b();
    }

    /* JADX INFO: renamed from: g */
    public final void m38886g(int i) {
        int i2 = this.f23407j / 2;
        int i3 = this.f23413p - i2;
        int i4 = this.f23414q - i2;
        this.f23390D.reset();
        float f = i2;
        this.f23390D.moveTo(this.f23394H + i2, f);
        int i5 = t100.f167232G + i;
        int i6 = i3 - i5;
        this.f23390D.lineTo(i6, f);
        float f2 = i3;
        this.f23390D.arcTo(i6 - i5, f, f2, (i5 * 2) + i2, -90.0f, 90.0f, false);
        this.f23390D.lineTo(f2, i4 - this.f23394H);
        Path path = this.f23390D;
        int i7 = this.f23394H;
        float f3 = i4;
        path.arcTo(i3 - (i7 * 2), i4 - (i7 * 2), f2, f3, 0.0f, 90.0f, false);
        this.f23390D.lineTo(this.f23394H + i2, f3);
        Path path2 = this.f23390D;
        int i8 = this.f23394H;
        path2.arcTo(f, i4 - (i8 * 2), (i8 * 2) + i2, f3, 90.0f, 90.0f, false);
        this.f23390D.lineTo(f, this.f23394H + i2);
        Path path3 = this.f23390D;
        int i9 = this.f23394H;
        path3.arcTo(f, f, (i9 * 2) + i2, i2 + (i9 * 2), 180.0f, 90.0f, false);
        this.f23390D.close();
    }

    /* JADX INFO: renamed from: h */
    public final void m38887h(float f) {
        if (this.f23413p <= 0 || this.f23414q <= 0) {
            return;
        }
        float fCos = (float) (((double) this.f23417t) / Math.cos(0.2617993950843811d));
        float fTan = ((float) (Math.tan(0.2617993950843811d) * ((double) this.f23414q))) + fCos;
        float f2 = (this.f23413p + fTan) * f;
        this.f23422y.reset();
        float f3 = (-fTan) + f2;
        this.f23422y.moveTo(f3, 0.0f);
        this.f23422y.lineTo(f3 + fCos, 0.0f);
        this.f23422y.lineTo(f2, this.f23414q);
        this.f23422y.lineTo((-fCos) + f2, this.f23414q);
        this.f23422y.close();
        this.f23421x.setShader(new LinearGradient(f3, 0.0f, (float) (((double) f3) + (((double) this.f23417t) * Math.cos(0.2617993950843811d))), (float) (((double) (-this.f23417t)) * Math.sin(0.2617993950843811d)), this.f23387A, this.f23420w, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.setDrawFilter(this.f23396J);
        if (this.f23409l.isEmpty()) {
            m38885f();
        }
        this.f23410m.set(0.0f, 0.0f, this.f23413p, this.f23414q);
        RectF rectF = this.f23410m;
        int i = this.f23402e;
        canvas.drawRoundRect(rectF, i, i, this.f23408k);
        this.f23408k.setXfermode(this.f23412o);
        canvas.drawPath(this.f23409l, this.f23408k);
        this.f23408k.setXfermode(null);
        if (this.f23395I) {
            m38880a(canvas);
        }
        this.f23421x.setXfermode(this.f23423z);
        m38887h(this.f23388B);
        if (!this.f23422y.isEmpty()) {
            canvas.drawPath(this.f23422y, this.f23421x);
        }
        this.f23421x.setXfermode(null);
        Bitmap bitmap = this.f23415r;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f23411n, this.f23397K);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f23413p = getMeasuredWidth();
        this.f23414q = getMeasuredHeight();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f23413p = i;
        this.f23414q = i2;
        m38885f();
    }

    public CardBorderView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBorderView(Context context) {
        this(context, null);
    }
}
