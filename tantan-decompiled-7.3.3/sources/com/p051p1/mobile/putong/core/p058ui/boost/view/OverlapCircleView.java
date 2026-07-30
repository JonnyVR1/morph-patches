package com.p051p1.mobile.putong.core.p058ui.boost.view;

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
import p153l.a2j0;
import p153l.bnl0;
import p153l.nhc0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class OverlapCircleView extends View {

    /* JADX INFO: renamed from: A */
    public int f29442A;

    /* JADX INFO: renamed from: B */
    public final C8458a f29443B;

    /* JADX INFO: renamed from: a */
    public Paint f29444a;

    /* JADX INFO: renamed from: b */
    public Paint f29445b;

    /* JADX INFO: renamed from: c */
    public Paint f29446c;

    /* JADX INFO: renamed from: d */
    public Paint f29447d;

    /* JADX INFO: renamed from: e */
    public Paint f29448e;

    /* JADX INFO: renamed from: f */
    public Paint f29449f;

    /* JADX INFO: renamed from: g */
    public LinearGradient f29450g;

    /* JADX INFO: renamed from: h */
    public LinearGradient f29451h;

    /* JADX INFO: renamed from: i */
    public SweepGradient f29452i;

    /* JADX INFO: renamed from: j */
    public final int f29453j;

    /* JADX INFO: renamed from: k */
    public final int f29454k;

    /* JADX INFO: renamed from: l */
    public final int f29455l;

    /* JADX INFO: renamed from: m */
    public final int f29456m;

    /* JADX INFO: renamed from: n */
    public int f29457n;

    /* JADX INFO: renamed from: o */
    public int f29458o;

    /* JADX INFO: renamed from: p */
    public boolean f29459p;

    /* JADX INFO: renamed from: q */
    public int f29460q;

    /* JADX INFO: renamed from: r */
    public int f29461r;

    /* JADX INFO: renamed from: s */
    public int f29462s;

    /* JADX INFO: renamed from: t */
    public RectF f29463t;

    /* JADX INFO: renamed from: u */
    public boolean f29464u;

    /* JADX INFO: renamed from: v */
    public int f29465v;

    /* JADX INFO: renamed from: w */
    public int f29466w;

    /* JADX INFO: renamed from: x */
    public int f29467x;

    /* JADX INFO: renamed from: y */
    public float f29468y;

    /* JADX INFO: renamed from: z */
    public boolean f29469z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.boost.view.OverlapCircleView$a */
    public static class C8458a {

        /* JADX INFO: renamed from: c */
        public static final Paint f29470c = new Paint();

        /* JADX INFO: renamed from: a */
        public boolean f29471a = false;

        /* JADX INFO: renamed from: b */
        public long f29472b = 0;

        public C8458a() {
            Paint paint = f29470c;
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
        }

        /* JADX INFO: renamed from: d */
        public final float m45599d() {
            long jM95705h = a2j0.m95705h();
            if (this.f29472b == 0) {
                this.f29472b = jM95705h;
            }
            float f = (int) ((jM95705h - this.f29472b) % 2000.0f);
            if (f < 500.0f) {
                return 0.0f;
            }
            return (f - 500.0f) / 1500.0f;
        }
    }

    public OverlapCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29453j = 16777215;
        this.f29454k = -2063597569;
        this.f29455l = 513251223;
        this.f29456m = 9934743;
        this.f29457n = qa00.m175859d(0.8f);
        this.f29459p = false;
        this.f29460q = -275200;
        this.f29461r = -275200;
        this.f29462s = 0;
        this.f29465v = -2565928;
        this.f29467x = qa00.m175859d(1.0f);
        this.f29468y = 0.785f;
        this.f29469z = false;
        this.f29442A = 0;
        this.f29443B = new C8458a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, nhc0.f141984x, i, 0);
        this.f29459p = typedArrayObtainStyledAttributes.getBoolean(nhc0.f141952B, false);
        this.f29466w = typedArrayObtainStyledAttributes.getColor(nhc0.f141953C, -1);
        this.f29458o = typedArrayObtainStyledAttributes.getColor(nhc0.f141955E, -1053208);
        this.f29460q = typedArrayObtainStyledAttributes.getColor(nhc0.f141956F, -275200);
        this.f29461r = typedArrayObtainStyledAttributes.getColor(nhc0.f141957G, -275200);
        this.f29457n = typedArrayObtainStyledAttributes.getDimensionPixelSize(nhc0.f141985y, qa00.m175859d(0.8f));
        this.f29467x = typedArrayObtainStyledAttributes.getDimensionPixelSize(nhc0.f141954D, qa00.m175859d(1.0f));
        this.f29442A = typedArrayObtainStyledAttributes.getDimensionPixelSize(nhc0.f141951A, 0);
        this.f29469z = typedArrayObtainStyledAttributes.getBoolean(nhc0.f141986z, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f29444a = new Paint();
        this.f29445b = new Paint();
        this.f29446c = new Paint();
        this.f29447d = new Paint();
        this.f29448e = new Paint();
        m45593c();
    }

    /* JADX INFO: renamed from: b */
    public void m45592b(Canvas canvas, float f, float f2, int i) {
        float fM45599d = this.f29443B.m45599d();
        float f3 = 1.0f - fM45599d;
        float f4 = f3 <= 0.5f ? f3 * 4.0f : 2.0f - ((f3 - 0.5f) * 2.0f);
        C8458a.f29470c.setStrokeWidth(i);
        C8458a.f29470c.setARGB((int) (f4 * 0.08f * 255.0f), 245, 48, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA);
        canvas.drawCircle(f, f, f2 + ((int) ((((double) fM45599d) - 0.5d) * ((double) i))), C8458a.f29470c);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m45593c() {
        Paint paint = this.f29444a;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f29444a.setAntiAlias(true);
        this.f29444a.setStrokeWidth(this.f29457n);
        bnl0.m105533Q0(this, new y20() { // from class: l.l760
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130325a.m45594d((int[]) obj);
            }
        });
        Paint paint2 = this.f29446c;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.f29446c.setAntiAlias(true);
        this.f29446c.setStrokeWidth(this.f29457n);
        this.f29445b.setColor(this.f29458o);
        this.f29445b.setStyle(style);
        this.f29445b.setAntiAlias(true);
        if (this.f29459p) {
            Paint paint3 = new Paint();
            this.f29449f = paint3;
            paint3.setStyle(style2);
            this.f29449f.setColor(this.f29460q);
            if (this.f29464u) {
                this.f29449f.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f29449f.setAntiAlias(true);
        } else {
            this.f29447d.setColor(this.f29465v);
            this.f29447d.setAntiAlias(true);
            this.f29447d.setStyle(style);
        }
        this.f29448e.setColor(this.f29466w);
        this.f29448e.setAntiAlias(true);
        this.f29448e.setStyle(style);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m45594d(int[] iArr) {
        Paint paint = this.f29444a;
        LinearGradient linearGradient = this.f29450g;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, Math.min(iArr[0], iArr[1]), 16777215, -2063597569, Shader.TileMode.CLAMP);
            this.f29450g = linearGradient2;
            linearGradient = linearGradient2;
        }
        paint.setShader(linearGradient);
        Paint paint2 = this.f29446c;
        LinearGradient linearGradient3 = this.f29451h;
        if (linearGradient3 == null) {
            LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, 0.0f, Math.min(iArr[0], iArr[1]), 513251223, 9934743, Shader.TileMode.CLAMP);
            this.f29451h = linearGradient4;
            linearGradient3 = linearGradient4;
        }
        paint2.setShader(linearGradient3);
    }

    /* JADX INFO: renamed from: e */
    public void m45595e(int i, int i2) {
        if (this.f29460q == i && this.f29461r == i2) {
            return;
        }
        this.f29460q = i;
        this.f29461r = i2;
        m45593c();
    }

    public boolean getHasProgress() {
        return this.f29459p;
    }

    public int getProgress() {
        return this.f29462s;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iMin = Math.min(getWidth(), getHeight());
        int i = iMin / 2;
        int i2 = this.f29442A;
        int iRound = i2 > 0 ? i - i2 : Math.round(i * this.f29468y);
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, i, this.f29444a);
        canvas.drawCircle(width, width, i - this.f29457n, this.f29445b);
        if (this.f29446c.getStrokeWidth() > 0.0f) {
            canvas.drawCircle(width, width, i - (this.f29457n * 2), this.f29446c);
        }
        if (this.f29443B.f29471a) {
            m45592b(canvas, width, iRound, i - iRound);
        }
        if (this.f29459p) {
            if (this.f29452i == null) {
                int i3 = this.f29460q;
                this.f29452i = new SweepGradient(width, width, new int[]{i3, this.f29461r, i3}, (float[]) null);
                Matrix matrix = new Matrix();
                matrix.preRotate(270.0f, width, width);
                this.f29452i.setLocalMatrix(matrix);
            }
            this.f29449f.setShader(this.f29452i);
            int i4 = i - iRound;
            this.f29449f.setStrokeWidth(i4);
            if (this.f29463t == null) {
                this.f29463t = new RectF();
            }
            RectF rectF = this.f29463t;
            int i5 = i4 / 2;
            int i6 = this.f29467x;
            int i7 = iMin - i5;
            rectF.set(i5 - (i6 * 2), i5 - (i6 * 2), (i6 * 2) + i7, i7 + (i6 * 2));
            if (this.f29469z) {
                canvas.drawArc(this.f29463t, -90.0f, this.f29462s, false, this.f29449f);
            } else {
                int i8 = this.f29462s;
                RectF rectF2 = this.f29463t;
                if (i8 <= 90) {
                    canvas.drawArc(rectF2, i8 + 270, 360 - i8, false, this.f29449f);
                } else {
                    canvas.drawArc(rectF2, i8 - 90, 360 - i8, false, this.f29449f);
                }
            }
        } else {
            canvas.drawCircle(width, this.f29467x + width, iRound, this.f29447d);
        }
        canvas.drawCircle(width, width, iRound, this.f29448e);
    }

    public void setHasProgress(boolean z) {
        this.f29459p = z;
        m45593c();
    }

    public void setInnerBackgroundColor(int i) {
        this.f29466w = i;
        m45593c();
    }

    public void setInnerBorderColor(int i) {
        this.f29465v = i;
        m45593c();
    }

    public void setOuterBackgroundColor(int i) {
        this.f29458o = i;
        m45593c();
    }

    public void setProgress(long j) {
        this.f29462s = Math.round(j * 3.6f);
        invalidate();
    }

    public void setProgressColor(int i) {
        m45595e(i, i);
    }

    public void setRoundProgressCap(boolean z) {
        if (this.f29464u != z) {
            this.f29464u = z;
            m45593c();
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
