package p153l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class lqc0 extends kam {

    /* JADX INFO: renamed from: j */
    public Paint f133182j;

    /* JADX INFO: renamed from: k */
    public float f133183k;

    /* JADX INFO: renamed from: l */
    public int[] f133184l;

    /* JADX INFO: renamed from: m */
    public int f133185m;

    /* JADX INFO: renamed from: n */
    public int f133186n;

    /* JADX INFO: renamed from: o */
    public TextPaint f133187o;

    /* JADX INFO: renamed from: p */
    public float f133188p;

    /* JADX INFO: renamed from: q */
    public String f133189q;

    public lqc0(Context context) {
        super(context);
        int[] iArr = {-98787, -39836};
        this.f133184l = iArr;
        this.f133185m = iArr[0];
        this.f133186n = 0;
        m155480l();
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: f */
    public void mo153511f(int i, int i2) {
        super.mo153511f(i, i2);
        super.mo153511f(i, i2);
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f133186n = (i2 * 255) / 100;
            int[] iArr = this.f133184l;
            this.f133185m = m153510e(iArr[0], iArr[1], i2);
        } else if (i == 2) {
            this.f133186n = 255 - ((i2 * 255) / 100);
        }
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: g */
    public void mo153512g(Canvas canvas, int i, int i2) {
        if (m153508c() == 1) {
            this.f133182j.setColor(this.f133185m);
            this.f133182j.setAlpha(this.f133186n);
            this.f133187o.setAlpha(this.f133186n);
            RectF rectF = this.f124700i;
            float f = this.f133183k;
            canvas.drawRoundRect(rectF, f, f, this.f133182j);
            String str = this.f133189q;
            RectF rectF2 = this.f124700i;
            canvas.drawText(str, (rectF2.left + rectF2.right) / 2.0f, ((rectF2.top + rectF2.bottom) / 2.0f) - this.f133188p, this.f133187o);
        }
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: h */
    public void mo153513h(int i, int i2) {
        super.mo153513h(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public final void m155480l() {
        Paint paint = new Paint();
        this.f133182j = paint;
        paint.setAntiAlias(true);
        this.f133182j.setColor(-98787);
        this.f133183k = m153506a(10);
        TextPaint textPaint = new TextPaint();
        this.f133187o = textPaint;
        textPaint.setColor(-1);
        this.f133187o.setTextAlign(Paint.Align.CENTER);
        this.f133187o.setAntiAlias(true);
        this.f133187o.setFakeBoldText(true);
        String language = Locale.getDefault().getLanguage();
        this.f133187o.setTextSize(m153506a(("in".equals(language) || "id".equals(language)) ? 12 : 14));
        Paint.FontMetrics fontMetrics = this.f133187o.getFontMetrics();
        this.f133188p = (fontMetrics.top / 2.0f) + (fontMetrics.bottom / 2.0f);
        this.f133189q = CoreModule.f18263b.getString(R$string.f21847v4);
    }
}
