package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public class oqc0 extends lam {

    /* JADX INFO: renamed from: i */
    public Bitmap f148565i;

    /* JADX INFO: renamed from: j */
    public Rect f148566j;

    /* JADX INFO: renamed from: k */
    public RectF f148567k;

    /* JADX INFO: renamed from: l */
    public Paint f148568l;

    /* JADX INFO: renamed from: m */
    public Paint f148569m;

    /* JADX INFO: renamed from: n */
    public RectF f148570n;

    /* JADX INFO: renamed from: o */
    public int f148571o;

    /* JADX INFO: renamed from: p */
    public int f148572p;

    /* JADX INFO: renamed from: q */
    public int f148573q;

    /* JADX INFO: renamed from: r */
    public int f148574r;

    /* JADX INFO: renamed from: s */
    public float f148575s;

    /* JADX INFO: renamed from: t */
    public int f148576t;

    /* JADX INFO: renamed from: u */
    public int f148577u;

    /* JADX INFO: renamed from: v */
    public float f148578v;

    /* JADX INFO: renamed from: w */
    public float f148579w;

    /* JADX INFO: renamed from: x */
    public int[] f148580x;

    /* JADX INFO: renamed from: y */
    public int f148581y;

    /* JADX INFO: renamed from: z */
    public int f148582z;

    public oqc0(Context context) {
        super(context);
        this.f148578v = 1.0f;
        this.f148579w = 0.0f;
        int[] iArr = {-98787, -39836};
        this.f148580x = iArr;
        this.f148581y = iArr[0];
        this.f148582z = 0;
        m168804l();
    }

    /* JADX INFO: renamed from: l */
    private void m168804l() {
        this.f148565i = BitmapFactory.decodeResource(m153507b().getResources(), ibc0.f113999d4);
        Paint paint = new Paint();
        this.f148568l = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f148569m = paint2;
        paint2.setAntiAlias(true);
        this.f148570n = new RectF();
        this.f148566j = new Rect(0, 0, this.f148565i.getWidth(), this.f148565i.getHeight());
        this.f148567k = new RectF();
        this.f148573q = m153506a(42);
        this.f148574r = m153506a(56);
        this.f148571o = m153506a(16);
        this.f148572p = m153506a(42);
        this.f148576t = m153506a(24);
        this.f148577u = m153506a(24);
        this.f148575s = m153506a(12);
        RectF rectF = this.f148570n;
        int i = this.f148571o;
        int i2 = this.f148572p;
        rectF.set(i, i2, i + this.f148573q, i2 + this.f148574r);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: f */
    public void mo153511f(int i, int i2) {
        super.mo153511f(i, i2);
        if (i == 0) {
            m168805m();
            this.f148582z = (i2 * 255) / 100;
            this.f148581y = this.f148580x[0];
            int i3 = this.f148573q;
            int i4 = (-i3) + ((i2 * (this.f148571o + i3)) / 100);
            int i5 = this.f148572p;
            this.f130716g.set(i4, i5, i4 + i3, i5 + this.f148574r);
            RectF rectF = this.f148570n;
            RectF rectF2 = this.f130716g;
            rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
            m168806n();
            return;
        }
        if (i == 1) {
            m168805m();
            this.f148582z = 255;
            int[] iArr = this.f148580x;
            this.f148581y = m153510e(iArr[0], iArr[1], i2);
            float f = i2;
            this.f148578v = ((0.3f * f) / 100.0f) + 1.0f;
            int i6 = this.f148573q;
            float f2 = i6 + (((i6 * 0.4f) * f) / 100.0f);
            this.f148579w = ((f * 0.25f) / 100.0f) * (-90.0f);
            RectF rectF3 = this.f130716g;
            int i7 = this.f148571o;
            int i8 = this.f148572p;
            rectF3.set(i7, i8, i7 + f2, i8 + this.f148574r);
            RectF rectF4 = this.f148570n;
            RectF rectF5 = this.f130716g;
            rectF4.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom);
            m168806n();
            return;
        }
        if (i == 2) {
            float f3 = this.f130716g.right + kqc0.f128210b;
            float f4 = kqc0.f128209a;
            int i9 = this.f148572p;
            float fM153509d = i9;
            float fM153509d2 = this.f148574r + i9;
            RectF rectF6 = this.f130717h;
            if (rectF6 != null) {
                f4 = rectF6.left;
                fM153509d = m153509d(i9, this.f130712c - rectF6.top, i2);
                fM153509d2 = m153509d(fM153509d2, this.f130712c - this.f130717h.bottom, i2);
            }
            RectF rectF7 = this.f130716g;
            float f5 = rectF7.left;
            float f6 = i2;
            float f7 = (f5 - (((f3 - f4) * f6) / 100.0f)) - (((f4 - f5) * f6) / 100.0f);
            this.f148582z = 255 - ((i2 * 255) / 100);
            this.f148570n.set(f7, fM153509d, (rectF7.right - f5) + f7, fM153509d2);
            m168806n();
        }
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: g */
    public void mo153512g(Canvas canvas, int i, int i2) {
        this.f148568l.setColor(this.f148581y);
        this.f148568l.setAlpha(this.f148582z);
        RectF rectF = this.f148570n;
        float f = this.f148575s;
        canvas.drawRoundRect(rectF, f, f, this.f148568l);
        int iSave = canvas.save();
        float f2 = this.f148579w;
        RectF rectF2 = this.f148567k;
        canvas.rotate(f2, (rectF2.left + rectF2.right) / 2.0f, (rectF2.top + rectF2.bottom) / 2.0f);
        canvas.drawBitmap(this.f148565i, this.f148566j, this.f148567k, this.f148569m);
        canvas.restoreToCount(iSave);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: h */
    public void mo153513h(int i, int i2) {
        super.mo153513h(i, i2);
        mo153511f(this.f130713d, this.f130714e);
    }

    /* JADX INFO: renamed from: m */
    public final void m168805m() {
        this.f148578v = 1.0f;
        this.f148579w = 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public final void m168806n() {
        RectF rectF = this.f148570n;
        float f = (rectF.right + rectF.left) / 2.0f;
        float f2 = (rectF.top + rectF.bottom) / 2.0f;
        RectF rectF2 = this.f148567k;
        int i = this.f148576t;
        float f3 = this.f148578v;
        rectF2.set(f - ((i * f3) / 2.0f), f2 - ((i * f3) / 2.0f), f + ((i * f3) / 2.0f), f2 + ((this.f148577u * f3) / 2.0f));
    }
}
