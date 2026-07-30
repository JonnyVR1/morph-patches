package p153l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public class mqc0 extends kam {

    /* JADX INFO: renamed from: j */
    public Paint f138035j;

    /* JADX INFO: renamed from: k */
    public float f138036k;

    /* JADX INFO: renamed from: l */
    public int[] f138037l;

    /* JADX INFO: renamed from: m */
    public int f138038m;

    /* JADX INFO: renamed from: n */
    public int f138039n;

    public mqc0(Context context) {
        super(context);
        int[] iArr = {-98787, -39836};
        this.f138037l = iArr;
        this.f138038m = iArr[0];
        this.f138039n = 0;
        m159506l();
    }

    /* JADX INFO: renamed from: l */
    private void m159506l() {
        Paint paint = new Paint();
        this.f138035j = paint;
        paint.setAntiAlias(true);
        this.f138035j.setColor(-98787);
        this.f138036k = m153506a(10);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: f */
    public void mo153511f(int i, int i2) {
        super.mo153511f(i, i2);
        if (i == 0) {
            this.f138038m = this.f138037l[0];
            this.f138039n = (i2 * 255) / 100;
        } else if (i == 1) {
            int[] iArr = this.f138037l;
            this.f138038m = m153510e(iArr[0], iArr[1], i2);
            this.f138039n = 255;
        } else if (i == 2) {
            this.f138039n = 255 - ((i2 * 255) / 100);
        }
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: g */
    public void mo153512g(Canvas canvas, int i, int i2) {
        this.f138035j.setColor(this.f138038m);
        this.f138035j.setAlpha(this.f138039n);
        RectF rectF = this.f124700i;
        float f = this.f138036k;
        canvas.drawRoundRect(rectF, f, f, this.f138035j);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: h */
    public void mo153513h(int i, int i2) {
        super.mo153513h(i, i2);
    }
}
