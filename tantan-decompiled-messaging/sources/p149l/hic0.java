package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class hic0 extends v7m {

    /* JADX INFO: renamed from: i */
    public Bitmap f107900i;

    /* JADX INFO: renamed from: j */
    public Rect f107901j;

    /* JADX INFO: renamed from: k */
    public RectF f107902k;

    /* JADX INFO: renamed from: l */
    public Paint f107903l;

    /* JADX INFO: renamed from: m */
    public Paint f107904m;

    /* JADX INFO: renamed from: n */
    public RectF f107905n;

    /* JADX INFO: renamed from: o */
    public int f107906o;

    /* JADX INFO: renamed from: p */
    public int f107907p;

    /* JADX INFO: renamed from: q */
    public int f107908q;

    /* JADX INFO: renamed from: r */
    public int f107909r;

    /* JADX INFO: renamed from: s */
    public float f107910s;

    /* JADX INFO: renamed from: t */
    public int f107911t;

    /* JADX INFO: renamed from: u */
    public int f107912u;

    /* JADX INFO: renamed from: v */
    public float f107913v;

    /* JADX INFO: renamed from: w */
    public float f107914w;

    /* JADX INFO: renamed from: x */
    public int[] f107915x;

    /* JADX INFO: renamed from: y */
    public int f107916y;

    /* JADX INFO: renamed from: z */
    public int f107917z;

    public hic0(Context context) {
        super(context);
        this.f107913v = 1.0f;
        this.f107914w = 0.0f;
        int[] iArr = {-98787, -39836};
        this.f107915x = iArr;
        this.f107916y = iArr[0];
        this.f107917z = 0;
        m131249l();
    }

    /* JADX INFO: renamed from: l */
    private void m131249l() {
        this.f107900i = BitmapFactory.decodeResource(m197378b().getResources(), c3c0.f78724d4);
        Paint paint = new Paint();
        this.f107903l = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f107904m = paint2;
        paint2.setAntiAlias(true);
        this.f107905n = new RectF();
        this.f107901j = new Rect(0, 0, this.f107900i.getWidth(), this.f107900i.getHeight());
        this.f107902k = new RectF();
        this.f107908q = m197377a(42);
        this.f107909r = m197377a(56);
        this.f107906o = m197377a(16);
        this.f107907p = m197377a(42);
        this.f107911t = m197377a(24);
        this.f107912u = m197377a(24);
        this.f107910s = m197377a(12);
        RectF rectF = this.f107905n;
        int i = this.f107906o;
        int i2 = this.f107907p;
        rectF.set(i, i2, i + this.f107908q, i2 + this.f107909r);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: f */
    public void mo116668f(int i, int i2) {
        super.mo116668f(i, i2);
        if (i == 0) {
            m131250m();
            this.f107917z = (i2 * 255) / 100;
            this.f107916y = this.f107915x[0];
            int i3 = this.f107908q;
            int i4 = (-i3) + ((i2 * (this.f107906o + i3)) / 100);
            int i5 = this.f107907p;
            this.f180403g.set(i4, i5, i4 + i3, i5 + this.f107909r);
            RectF rectF = this.f107905n;
            RectF rectF2 = this.f180403g;
            rectF.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
            m131251n();
            return;
        }
        if (i == 1) {
            m131250m();
            this.f107917z = 255;
            int[] iArr = this.f107915x;
            this.f107916y = m197381e(iArr[0], iArr[1], i2);
            float f = i2;
            this.f107913v = ((0.3f * f) / 100.0f) + 1.0f;
            int i6 = this.f107908q;
            float f2 = i6 + (((i6 * 0.4f) * f) / 100.0f);
            this.f107914w = ((f * 0.25f) / 100.0f) * (-90.0f);
            RectF rectF3 = this.f180403g;
            int i7 = this.f107906o;
            int i8 = this.f107907p;
            rectF3.set(i7, i8, i7 + f2, i8 + this.f107909r);
            RectF rectF4 = this.f107905n;
            RectF rectF5 = this.f180403g;
            rectF4.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom);
            m131251n();
            return;
        }
        if (i == 2) {
            float f3 = this.f180403g.right + dic0.f86374b;
            float f4 = dic0.f86373a;
            int i9 = this.f107907p;
            float fM197380d = i9;
            float fM197380d2 = this.f107909r + i9;
            RectF rectF6 = this.f180404h;
            if (rectF6 != null) {
                f4 = rectF6.left;
                fM197380d = m197380d(i9, this.f180399c - rectF6.top, i2);
                fM197380d2 = m197380d(fM197380d2, this.f180399c - this.f180404h.bottom, i2);
            }
            RectF rectF7 = this.f180403g;
            float f5 = rectF7.left;
            float f6 = i2;
            float f7 = (f5 - (((f3 - f4) * f6) / 100.0f)) - (((f4 - f5) * f6) / 100.0f);
            this.f107917z = 255 - ((i2 * 255) / 100);
            this.f107905n.set(f7, fM197380d, (rectF7.right - f5) + f7, fM197380d2);
            m131251n();
        }
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: g */
    public void mo116669g(Canvas canvas, int i, int i2) {
        this.f107903l.setColor(this.f107916y);
        this.f107903l.setAlpha(this.f107917z);
        RectF rectF = this.f107905n;
        float f = this.f107910s;
        canvas.drawRoundRect(rectF, f, f, this.f107903l);
        int iSave = canvas.save();
        float f2 = this.f107914w;
        RectF rectF2 = this.f107902k;
        canvas.rotate(f2, (rectF2.left + rectF2.right) / 2.0f, (rectF2.top + rectF2.bottom) / 2.0f);
        canvas.drawBitmap(this.f107900i, this.f107901j, this.f107902k, this.f107904m);
        canvas.restoreToCount(iSave);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: h */
    public void mo116670h(int i, int i2) {
        super.mo116670h(i, i2);
        mo116668f(this.f180400d, this.f180401e);
    }

    /* JADX INFO: renamed from: m */
    public final void m131250m() {
        this.f107913v = 1.0f;
        this.f107914w = 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public final void m131251n() {
        RectF rectF = this.f107905n;
        float f = (rectF.right + rectF.left) / 2.0f;
        float f2 = (rectF.top + rectF.bottom) / 2.0f;
        RectF rectF2 = this.f107902k;
        int i = this.f107911t;
        float f3 = this.f107913v;
        rectF2.set(f - ((i * f3) / 2.0f), f2 - ((i * f3) / 2.0f), f + ((i * f3) / 2.0f), f2 + ((this.f107912u * f3) / 2.0f));
    }
}
