package com.p000p1.mobile.putong.core.p001ui.boost.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import l.e30;
import l.t100;
import l.xdl0;
import l.xsi0;
import p003l.h9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class OverlapCircleView extends View {

    /* JADX INFO: renamed from: A */
    public int f988A;

    /* JADX INFO: renamed from: B */
    public final C3070a f989B;

    /* JADX INFO: renamed from: a */
    public Paint f990a;

    /* JADX INFO: renamed from: b */
    public Paint f991b;

    /* JADX INFO: renamed from: c */
    public Paint f992c;

    /* JADX INFO: renamed from: d */
    public Paint f993d;

    /* JADX INFO: renamed from: e */
    public Paint f994e;

    /* JADX INFO: renamed from: f */
    public Paint f995f;

    /* JADX INFO: renamed from: g */
    public LinearGradient f996g;

    /* JADX INFO: renamed from: h */
    public LinearGradient f997h;

    /* JADX INFO: renamed from: i */
    public SweepGradient f998i;

    /* JADX INFO: renamed from: j */
    public final int f999j;

    /* JADX INFO: renamed from: k */
    public final int f1000k;

    /* JADX INFO: renamed from: l */
    public final int f1001l;

    /* JADX INFO: renamed from: m */
    public final int f1002m;

    /* JADX INFO: renamed from: n */
    public int f1003n;

    /* JADX INFO: renamed from: o */
    public int f1004o;

    /* JADX INFO: renamed from: p */
    public boolean f1005p;

    /* JADX INFO: renamed from: q */
    public int f1006q;

    /* JADX INFO: renamed from: r */
    public int f1007r;

    /* JADX INFO: renamed from: s */
    public int f1008s;

    /* JADX INFO: renamed from: t */
    public RectF f1009t;

    /* JADX INFO: renamed from: u */
    public boolean f1010u;

    /* JADX INFO: renamed from: v */
    public int f1011v;

    /* JADX INFO: renamed from: w */
    public int f1012w;

    /* JADX INFO: renamed from: x */
    public int f1013x;

    /* JADX INFO: renamed from: y */
    public float f1014y;

    /* JADX INFO: renamed from: z */
    public boolean f1015z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.boost.view.OverlapCircleView$a */
    public static class C3070a {

        /* JADX INFO: renamed from: c */
        public static final Paint f1016c = new Paint();

        /* JADX INFO: renamed from: a */
        public boolean f1017a = false;

        /* JADX INFO: renamed from: b */
        public long f1018b = 0;

        public C3070a() {
            Paint paint = f1016c;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
        }

        /* JADX INFO: renamed from: d */
        public final float m1715d() {
            long jH = xsi0.h();
            if (this.f1018b == 0) {
                this.f1018b = jH;
            }
            float f = (int) ((jH - this.f1018b) % 2000.0f);
            if (f < 500.0f) {
                return 0.0f;
            }
            return (f - 500.0f) / 1500.0f;
        }
    }

    public OverlapCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f999j = 16777215;
        this.f1000k = -2063597569;
        this.f1001l = 513251223;
        this.f1002m = 9934743;
        this.f1003n = t100.d(0.8f);
        this.f1005p = false;
        this.f1006q = -275200;
        this.f1007r = -275200;
        this.f1008s = 0;
        this.f1011v = -2565928;
        this.f1013x = t100.d(1.0f);
        this.f1014y = 0.785f;
        this.f1015z = false;
        this.f988A = 0;
        this.f989B = new C3070a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h9c0.f4844x, i, 0);
        this.f1005p = typedArrayObtainStyledAttributes.getBoolean(h9c0.f4812B, false);
        this.f1012w = typedArrayObtainStyledAttributes.getColor(h9c0.f4813C, -1);
        this.f1004o = typedArrayObtainStyledAttributes.getColor(h9c0.f4815E, -1053208);
        this.f1006q = typedArrayObtainStyledAttributes.getColor(h9c0.f4816F, -275200);
        this.f1007r = typedArrayObtainStyledAttributes.getColor(h9c0.f4817G, -275200);
        this.f1003n = typedArrayObtainStyledAttributes.getDimensionPixelSize(h9c0.f4845y, t100.d(0.8f));
        this.f1013x = typedArrayObtainStyledAttributes.getDimensionPixelSize(h9c0.f4814D, t100.d(1.0f));
        this.f988A = typedArrayObtainStyledAttributes.getDimensionPixelSize(h9c0.f4811A, 0);
        this.f1015z = typedArrayObtainStyledAttributes.getBoolean(h9c0.f4846z, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f990a = new Paint();
        this.f991b = new Paint();
        this.f992c = new Paint();
        this.f993d = new Paint();
        this.f994e = new Paint();
        m1709c();
    }

    /* JADX INFO: renamed from: b */
    public void m1708b(Canvas canvas, float f, float f2, int i) {
        float fM1715d = this.f989B.m1715d();
        float f3 = 1.0f - fM1715d;
        float f4 = f3 <= 0.5f ? f3 * 4.0f : 2.0f - ((f3 - 0.5f) * 2.0f);
        C3070a.f1016c.setStrokeWidth(i);
        C3070a.f1016c.setARGB((int) (f4 * 0.08f * 255.0f), 245, 48, 135);
        canvas.drawCircle(f, f, f2 + ((int) ((((double) fM1715d) - 0.5d) * ((double) i))), C3070a.f1016c);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m1709c() {
        Paint paint = this.f990a;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f990a.setAntiAlias(true);
        this.f990a.setStrokeWidth(this.f1003n);
        xdl0.Q0(this, new e30() { // from class: l.gz50
            public final void call(Object obj) {
                this.f4778a.m1710d((int[]) obj);
            }
        });
        Paint paint2 = this.f992c;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.f992c.setAntiAlias(true);
        this.f992c.setStrokeWidth(this.f1003n);
        this.f991b.setColor(this.f1004o);
        this.f991b.setStyle(style);
        this.f991b.setAntiAlias(true);
        if (this.f1005p) {
            Paint paint3 = new Paint();
            this.f995f = paint3;
            paint3.setStyle(style2);
            this.f995f.setColor(this.f1006q);
            if (this.f1010u) {
                this.f995f.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f995f.setAntiAlias(true);
        } else {
            this.f993d.setColor(this.f1011v);
            this.f993d.setAntiAlias(true);
            this.f993d.setStyle(style);
        }
        this.f994e.setColor(this.f1012w);
        this.f994e.setAntiAlias(true);
        this.f994e.setStyle(style);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1710d(int[] iArr) {
        Paint paint = this.f990a;
        LinearGradient linearGradient = this.f996g;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, Math.min(iArr[0], iArr[1]), 16777215, -2063597569, Shader.TileMode.CLAMP);
            this.f996g = linearGradient2;
            linearGradient = linearGradient2;
        }
        paint.setShader(linearGradient);
        Paint paint2 = this.f992c;
        LinearGradient linearGradient3 = this.f997h;
        if (linearGradient3 == null) {
            LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, 0.0f, Math.min(iArr[0], iArr[1]), 513251223, 9934743, Shader.TileMode.CLAMP);
            this.f997h = linearGradient4;
            linearGradient3 = linearGradient4;
        }
        paint2.setShader(linearGradient3);
    }

    /* JADX INFO: renamed from: e */
    public void m1711e(int i, int i2) {
        if (this.f1006q == i && this.f1007r == i2) {
            return;
        }
        this.f1006q = i;
        this.f1007r = i2;
        m1709c();
    }

    public boolean getHasProgress() {
        return this.f1005p;
    }

    public int getProgress() {
        return this.f1008s;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iMin = Math.min(getWidth(), getHeight());
        int i = iMin / 2;
        int i2 = this.f988A;
        int iRound = i2 > 0 ? i - i2 : Math.round(i * this.f1014y);
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, i, this.f990a);
        canvas.drawCircle(width, width, i - this.f1003n, this.f991b);
        if (this.f992c.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(width, width, i - (this.f1003n * 2), this.f992c);
        }
        if (this.f989B.f1017a) {
            m1708b(canvas, width, iRound, i - iRound);
        }
        if (this.f1005p) {
            if (this.f998i == null) {
                int i3 = this.f1006q;
                this.f998i = new SweepGradient(width, width, new int[]{i3, this.f1007r, i3}, (float[]) null);
                Matrix matrix = new Matrix();
                matrix.preRotate(270.0f, width, width);
                this.f998i.setLocalMatrix(matrix);
            }
            this.f995f.setShader(this.f998i);
            int i4 = i - iRound;
            this.f995f.setStrokeWidth(i4);
            if (this.f1009t == null) {
                this.f1009t = new RectF();
            }
            RectF rectF = this.f1009t;
            int i5 = i4 / 2;
            int i6 = this.f1013x;
            int i7 = iMin - i5;
            rectF.set(i5 - (i6 * 2), i5 - (i6 * 2), (i6 * 2) + i7, i7 + (i6 * 2));
            if (this.f1015z) {
                canvas.drawArc(this.f1009t, -90.0f, this.f1008s, false, this.f995f);
            } else {
                int i8 = this.f1008s;
                RectF rectF2 = this.f1009t;
                if (i8 <= 90) {
                    canvas.drawArc(rectF2, i8 + 270, 360 - i8, false, this.f995f);
                } else {
                    canvas.drawArc(rectF2, i8 - 90, 360 - i8, false, this.f995f);
                }
            }
        } else {
            canvas.drawCircle(width, this.f1013x + width, iRound, this.f993d);
        }
        canvas.drawCircle(width, width, iRound, this.f994e);
    }

    public void setHasProgress(boolean z) {
        this.f1005p = z;
        m1709c();
    }

    public void setInnerBackgroundColor(int i) {
        this.f1012w = i;
        m1709c();
    }

    public void setInnerBorderColor(int i) {
        this.f1011v = i;
        m1709c();
    }

    public void setOuterBackgroundColor(int i) {
        this.f1004o = i;
        m1709c();
    }

    public void setProgress(long j) {
        this.f1008s = Math.round(j * 3.6f);
        invalidate();
    }

    public void setProgressColor(int i) {
        m1711e(i, i);
    }

    public void setRoundProgressCap(boolean z) {
        if (this.f1010u != z) {
            this.f1010u = z;
            m1709c();
        }
    }

    public void setProgress(int i) {
        setProgress(i);
    }

    public OverlapCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlapCircleView(Context context) {
        this(context, null);
    }
}
