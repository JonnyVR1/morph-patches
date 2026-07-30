package p003l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class eic0 extends u7m {

    /* JADX INFO: renamed from: j */
    public Paint f3278j;

    /* JADX INFO: renamed from: k */
    public float f3279k;

    /* JADX INFO: renamed from: l */
    public int[] f3280l;

    /* JADX INFO: renamed from: m */
    public int f3281m;

    /* JADX INFO: renamed from: n */
    public int f3282n;

    /* JADX INFO: renamed from: o */
    public TextPaint f3283o;

    /* JADX INFO: renamed from: p */
    public float f3284p;

    /* JADX INFO: renamed from: q */
    public String f3285q;

    public eic0(Context context) {
        super(context);
        int[] iArr = {-98787, -39836};
        this.f3280l = iArr;
        this.f3281m = iArr[0];
        this.f3282n = 0;
        m3839l();
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: f */
    public void mo3836f(int i, int i2) {
        super.mo3836f(i, i2);
        super.mo3836f(i, i2);
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f3282n = (i2 * 255) / 100;
            int[] iArr = this.f3280l;
            this.f3281m = m8303e(iArr[0], iArr[1], i2);
        } else if (i == 2) {
            this.f3282n = 255 - ((i2 * 255) / 100);
        }
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: g */
    public void mo3837g(Canvas canvas, int i, int i2) {
        if (m8301c() == 1) {
            this.f3278j.setColor(this.f3281m);
            this.f3278j.setAlpha(this.f3282n);
            this.f3283o.setAlpha(this.f3282n);
            RectF rectF = this.f7932i;
            float f = this.f3279k;
            canvas.drawRoundRect(rectF, f, f, this.f3278j);
            String str = this.f3285q;
            RectF rectF2 = this.f7932i;
            canvas.drawText(str, (rectF2.left + rectF2.right) / 2.0f, ((rectF2.top + rectF2.bottom) / 2.0f) - this.f3284p, this.f3283o);
        }
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: h */
    public void mo3838h(int i, int i2) {
        super.mo3838h(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public final void m3839l() {
        Paint paint = new Paint();
        this.f3278j = paint;
        paint.setAntiAlias(true);
        this.f3278j.setColor(-98787);
        this.f3279k = m8299a(10);
        TextPaint textPaint = new TextPaint();
        this.f3283o = textPaint;
        textPaint.setColor(-1);
        this.f3283o.setTextAlign(Paint.Align.CENTER);
        this.f3283o.setAntiAlias(true);
        this.f3283o.setFakeBoldText(true);
        String language = Locale.getDefault().getLanguage();
        this.f3283o.setTextSize(m8299a(("in".equals(language) || "id".equals(language)) ? 12 : 14));
        Paint.FontMetrics fontMetrics = this.f3283o.getFontMetrics();
        this.f3284p = (fontMetrics.top / 2.0f) + (fontMetrics.bottom / 2.0f);
        this.f3285q = CoreModule.b.getString(R.string.v4);
    }
}
