package p003l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fic0 extends u7m {

    /* JADX INFO: renamed from: j */
    public Paint f3625j;

    /* JADX INFO: renamed from: k */
    public float f3626k;

    /* JADX INFO: renamed from: l */
    public int[] f3627l;

    /* JADX INFO: renamed from: m */
    public int f3628m;

    /* JADX INFO: renamed from: n */
    public int f3629n;

    public fic0(Context context) {
        super(context);
        int[] iArr = {-98787, -39836};
        this.f3627l = iArr;
        this.f3628m = iArr[0];
        this.f3629n = 0;
        m4374l();
    }

    /* JADX INFO: renamed from: l */
    private void m4374l() {
        Paint paint = new Paint();
        this.f3625j = paint;
        paint.setAntiAlias(true);
        this.f3625j.setColor(-98787);
        this.f3626k = m8299a(10);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: f */
    public void mo3836f(int i, int i2) {
        super.mo3836f(i, i2);
        if (i == 0) {
            this.f3628m = this.f3627l[0];
            this.f3629n = (i2 * 255) / 100;
        } else if (i == 1) {
            int[] iArr = this.f3627l;
            this.f3628m = m8303e(iArr[0], iArr[1], i2);
            this.f3629n = 255;
        } else if (i == 2) {
            this.f3629n = 255 - ((i2 * 255) / 100);
        }
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: g */
    public void mo3837g(Canvas canvas, int i, int i2) {
        this.f3625j.setColor(this.f3628m);
        this.f3625j.setAlpha(this.f3629n);
        RectF rectF = this.f7932i;
        float f = this.f3626k;
        canvas.drawRoundRect(rectF, f, f, this.f3625j);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: h */
    public void mo3838h(int i, int i2) {
        super.mo3838h(i, i2);
    }
}
