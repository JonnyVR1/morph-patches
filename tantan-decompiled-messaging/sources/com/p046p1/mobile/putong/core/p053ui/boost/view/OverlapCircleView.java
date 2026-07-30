package com.p046p1.mobile.putong.core.p053ui.boost.view;

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
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.e30;
import p149l.h9c0;
import p149l.t100;
import p149l.xdl0;
import p149l.xsi0;

/* JADX INFO: loaded from: classes10.dex */
public class OverlapCircleView extends View {

    /* JADX INFO: renamed from: A */
    public int f28594A;

    /* JADX INFO: renamed from: B */
    public final C8295a f28595B;

    /* JADX INFO: renamed from: a */
    public Paint f28596a;

    /* JADX INFO: renamed from: b */
    public Paint f28597b;

    /* JADX INFO: renamed from: c */
    public Paint f28598c;

    /* JADX INFO: renamed from: d */
    public Paint f28599d;

    /* JADX INFO: renamed from: e */
    public Paint f28600e;

    /* JADX INFO: renamed from: f */
    public Paint f28601f;

    /* JADX INFO: renamed from: g */
    public LinearGradient f28602g;

    /* JADX INFO: renamed from: h */
    public LinearGradient f28603h;

    /* JADX INFO: renamed from: i */
    public SweepGradient f28604i;

    /* JADX INFO: renamed from: j */
    public final int f28605j;

    /* JADX INFO: renamed from: k */
    public final int f28606k;

    /* JADX INFO: renamed from: l */
    public final int f28607l;

    /* JADX INFO: renamed from: m */
    public final int f28608m;

    /* JADX INFO: renamed from: n */
    public int f28609n;

    /* JADX INFO: renamed from: o */
    public int f28610o;

    /* JADX INFO: renamed from: p */
    public boolean f28611p;

    /* JADX INFO: renamed from: q */
    public int f28612q;

    /* JADX INFO: renamed from: r */
    public int f28613r;

    /* JADX INFO: renamed from: s */
    public int f28614s;

    /* JADX INFO: renamed from: t */
    public RectF f28615t;

    /* JADX INFO: renamed from: u */
    public boolean f28616u;

    /* JADX INFO: renamed from: v */
    public int f28617v;

    /* JADX INFO: renamed from: w */
    public int f28618w;

    /* JADX INFO: renamed from: x */
    public int f28619x;

    /* JADX INFO: renamed from: y */
    public float f28620y;

    /* JADX INFO: renamed from: z */
    public boolean f28621z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.boost.view.OverlapCircleView$a */
    public static class C8295a {

        /* JADX INFO: renamed from: c */
        public static final Paint f28622c = new Paint();

        /* JADX INFO: renamed from: a */
        public boolean f28623a = false;

        /* JADX INFO: renamed from: b */
        public long f28624b = 0;

        public C8295a() {
            Paint paint = f28622c;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
        }

        /* JADX INFO: renamed from: d */
        public final float m44416d() {
            long jM210767h = xsi0.m210767h();
            if (this.f28624b == 0) {
                this.f28624b = jM210767h;
            }
            float f = (int) ((jM210767h - this.f28624b) % 2000.0f);
            if (f < 500.0f) {
                return 0.0f;
            }
            return (f - 500.0f) / 1500.0f;
        }
    }

    public OverlapCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28605j = 16777215;
        this.f28606k = -2063597569;
        this.f28607l = 513251223;
        this.f28608m = 9934743;
        this.f28609n = t100.m186890d(0.8f);
        this.f28611p = false;
        this.f28612q = -275200;
        this.f28613r = -275200;
        this.f28614s = 0;
        this.f28617v = -2565928;
        this.f28619x = t100.m186890d(1.0f);
        this.f28620y = 0.785f;
        this.f28621z = false;
        this.f28594A = 0;
        this.f28595B = new C8295a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, h9c0.f106567x, i, 0);
        this.f28611p = typedArrayObtainStyledAttributes.getBoolean(h9c0.f106535B, false);
        this.f28618w = typedArrayObtainStyledAttributes.getColor(h9c0.f106536C, -1);
        this.f28610o = typedArrayObtainStyledAttributes.getColor(h9c0.f106538E, -1053208);
        this.f28612q = typedArrayObtainStyledAttributes.getColor(h9c0.f106539F, -275200);
        this.f28613r = typedArrayObtainStyledAttributes.getColor(h9c0.f106540G, -275200);
        this.f28609n = typedArrayObtainStyledAttributes.getDimensionPixelSize(h9c0.f106568y, t100.m186890d(0.8f));
        this.f28619x = typedArrayObtainStyledAttributes.getDimensionPixelSize(h9c0.f106537D, t100.m186890d(1.0f));
        this.f28594A = typedArrayObtainStyledAttributes.getDimensionPixelSize(h9c0.f106534A, 0);
        this.f28621z = typedArrayObtainStyledAttributes.getBoolean(h9c0.f106569z, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f28596a = new Paint();
        this.f28597b = new Paint();
        this.f28598c = new Paint();
        this.f28599d = new Paint();
        this.f28600e = new Paint();
        m44410c();
    }

    /* JADX INFO: renamed from: b */
    public void m44409b(Canvas canvas, float f, float f2, int i) {
        float fM44416d = this.f28595B.m44416d();
        float f3 = 1.0f - fM44416d;
        float f4 = f3 <= 0.5f ? f3 * 4.0f : 2.0f - ((f3 - 0.5f) * 2.0f);
        C8295a.f28622c.setStrokeWidth(i);
        C8295a.f28622c.setARGB((int) (f4 * 0.08f * 255.0f), 245, 48, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA);
        canvas.drawCircle(f, f, f2 + ((int) ((((double) fM44416d) - 0.5d) * ((double) i))), C8295a.f28622c);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m44410c() {
        Paint paint = this.f28596a;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f28596a.setAntiAlias(true);
        this.f28596a.setStrokeWidth(this.f28609n);
        xdl0.m208353Q0(this, new e30() { // from class: l.gz50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105105a.m44411d((int[]) obj);
            }
        });
        Paint paint2 = this.f28598c;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.f28598c.setAntiAlias(true);
        this.f28598c.setStrokeWidth(this.f28609n);
        this.f28597b.setColor(this.f28610o);
        this.f28597b.setStyle(style);
        this.f28597b.setAntiAlias(true);
        if (this.f28611p) {
            Paint paint3 = new Paint();
            this.f28601f = paint3;
            paint3.setStyle(style2);
            this.f28601f.setColor(this.f28612q);
            if (this.f28616u) {
                this.f28601f.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f28601f.setAntiAlias(true);
        } else {
            this.f28599d.setColor(this.f28617v);
            this.f28599d.setAntiAlias(true);
            this.f28599d.setStyle(style);
        }
        this.f28600e.setColor(this.f28618w);
        this.f28600e.setAntiAlias(true);
        this.f28600e.setStyle(style);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m44411d(int[] iArr) {
        Paint paint = this.f28596a;
        LinearGradient linearGradient = this.f28602g;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, Math.min(iArr[0], iArr[1]), 16777215, -2063597569, Shader.TileMode.CLAMP);
            this.f28602g = linearGradient2;
            linearGradient = linearGradient2;
        }
        paint.setShader(linearGradient);
        Paint paint2 = this.f28598c;
        LinearGradient linearGradient3 = this.f28603h;
        if (linearGradient3 == null) {
            LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, 0.0f, Math.min(iArr[0], iArr[1]), 513251223, 9934743, Shader.TileMode.CLAMP);
            this.f28603h = linearGradient4;
            linearGradient3 = linearGradient4;
        }
        paint2.setShader(linearGradient3);
    }

    /* JADX INFO: renamed from: e */
    public void m44412e(int i, int i2) {
        if (this.f28612q == i && this.f28613r == i2) {
            return;
        }
        this.f28612q = i;
        this.f28613r = i2;
        m44410c();
    }

    public boolean getHasProgress() {
        return this.f28611p;
    }

    public int getProgress() {
        return this.f28614s;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iMin = Math.min(getWidth(), getHeight());
        int i = iMin / 2;
        int i2 = this.f28594A;
        int iRound = i2 > 0 ? i - i2 : Math.round(i * this.f28620y);
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, i, this.f28596a);
        canvas.drawCircle(width, width, i - this.f28609n, this.f28597b);
        if (this.f28598c.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(width, width, i - (this.f28609n * 2), this.f28598c);
        }
        if (this.f28595B.f28623a) {
            m44409b(canvas, width, iRound, i - iRound);
        }
        if (this.f28611p) {
            if (this.f28604i == null) {
                int i3 = this.f28612q;
                this.f28604i = new SweepGradient(width, width, new int[]{i3, this.f28613r, i3}, (float[]) null);
                Matrix matrix = new Matrix();
                matrix.preRotate(270.0f, width, width);
                this.f28604i.setLocalMatrix(matrix);
            }
            this.f28601f.setShader(this.f28604i);
            int i4 = i - iRound;
            this.f28601f.setStrokeWidth(i4);
            if (this.f28615t == null) {
                this.f28615t = new RectF();
            }
            RectF rectF = this.f28615t;
            int i5 = i4 / 2;
            int i6 = this.f28619x;
            int i7 = iMin - i5;
            rectF.set(i5 - (i6 * 2), i5 - (i6 * 2), (i6 * 2) + i7, i7 + (i6 * 2));
            if (this.f28621z) {
                canvas.drawArc(this.f28615t, -90.0f, this.f28614s, false, this.f28601f);
            } else {
                int i8 = this.f28614s;
                RectF rectF2 = this.f28615t;
                if (i8 <= 90) {
                    canvas.drawArc(rectF2, i8 + 270, 360 - i8, false, this.f28601f);
                } else {
                    canvas.drawArc(rectF2, i8 - 90, 360 - i8, false, this.f28601f);
                }
            }
        } else {
            canvas.drawCircle(width, this.f28619x + width, iRound, this.f28599d);
        }
        canvas.drawCircle(width, width, iRound, this.f28600e);
    }

    public void setHasProgress(boolean z) {
        this.f28611p = z;
        m44410c();
    }

    public void setInnerBackgroundColor(int i) {
        this.f28618w = i;
        m44410c();
    }

    public void setInnerBorderColor(int i) {
        this.f28617v = i;
        m44410c();
    }

    public void setOuterBackgroundColor(int i) {
        this.f28610o = i;
        m44410c();
    }

    public void setProgress(long j) {
        this.f28614s = Math.round(j * 3.6f);
        invalidate();
    }

    public void setProgressColor(int i) {
        m44412e(i, i);
    }

    public void setRoundProgressCap(boolean z) {
        if (this.f28616u != z) {
            this.f28616u = z;
            m44410c();
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
