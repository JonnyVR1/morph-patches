package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class fic0 extends u7m {

    /* JADX INFO: renamed from: j */
    public Paint f97650j;

    /* JADX INFO: renamed from: k */
    public float f97651k;

    /* JADX INFO: renamed from: l */
    public int[] f97652l;

    /* JADX INFO: renamed from: m */
    public int f97653m;

    /* JADX INFO: renamed from: n */
    public int f97654n;

    public fic0(Context context) {
        super(context);
        int[] iArr = {-98787, -39836};
        this.f97652l = iArr;
        this.f97653m = iArr[0];
        this.f97654n = 0;
        m121505l();
    }

    /* JADX INFO: renamed from: l */
    private void m121505l() {
        Paint paint = new Paint();
        this.f97650j = paint;
        paint.setAntiAlias(true);
        this.f97650j.setColor(-98787);
        this.f97651k = m197377a(10);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: f */
    public void mo116668f(int i, int i2) {
        super.mo116668f(i, i2);
        if (i == 0) {
            this.f97653m = this.f97652l[0];
            this.f97654n = (i2 * 255) / 100;
        } else if (i == 1) {
            int[] iArr = this.f97652l;
            this.f97653m = m197381e(iArr[0], iArr[1], i2);
            this.f97654n = 255;
        } else if (i == 2) {
            this.f97654n = 255 - ((i2 * 255) / 100);
        }
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: g */
    public void mo116669g(Canvas canvas, int i, int i2) {
        this.f97650j.setColor(this.f97653m);
        this.f97650j.setAlpha(this.f97654n);
        RectF rectF = this.f175024i;
        float f = this.f97651k;
        canvas.drawRoundRect(rectF, f, f, this.f97650j);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: h */
    public void mo116670h(int i, int i2) {
        super.mo116670h(i, i2);
    }
}
