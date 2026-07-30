package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class eic0 extends u7m {

    /* JADX INFO: renamed from: j */
    public Paint f91582j;

    /* JADX INFO: renamed from: k */
    public float f91583k;

    /* JADX INFO: renamed from: l */
    public int[] f91584l;

    /* JADX INFO: renamed from: m */
    public int f91585m;

    /* JADX INFO: renamed from: n */
    public int f91586n;

    /* JADX INFO: renamed from: o */
    public TextPaint f91587o;

    /* JADX INFO: renamed from: p */
    public float f91588p;

    /* JADX INFO: renamed from: q */
    public String f91589q;

    public eic0(Context context) {
        super(context);
        int[] iArr = {-98787, -39836};
        this.f91584l = iArr;
        this.f91585m = iArr[0];
        this.f91586n = 0;
        m116671l();
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: f */
    public void mo116668f(int i, int i2) {
        super.mo116668f(i, i2);
        super.mo116668f(i, i2);
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f91586n = (i2 * 255) / 100;
            int[] iArr = this.f91584l;
            this.f91585m = m197381e(iArr[0], iArr[1], i2);
        } else if (i == 2) {
            this.f91586n = 255 - ((i2 * 255) / 100);
        }
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: g */
    public void mo116669g(Canvas canvas, int i, int i2) {
        if (m197379c() == 1) {
            this.f91582j.setColor(this.f91585m);
            this.f91582j.setAlpha(this.f91586n);
            this.f91587o.setAlpha(this.f91586n);
            RectF rectF = this.f175024i;
            float f = this.f91583k;
            canvas.drawRoundRect(rectF, f, f, this.f91582j);
            String str = this.f91589q;
            RectF rectF2 = this.f175024i;
            canvas.drawText(str, (rectF2.left + rectF2.right) / 2.0f, ((rectF2.top + rectF2.bottom) / 2.0f) - this.f91588p, this.f91587o);
        }
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: h */
    public void mo116670h(int i, int i2) {
        super.mo116670h(i, i2);
    }

    /* JADX INFO: renamed from: l */
    public final void m116671l() {
        Paint paint = new Paint();
        this.f91582j = paint;
        paint.setAntiAlias(true);
        this.f91582j.setColor(-98787);
        this.f91583k = m197377a(10);
        TextPaint textPaint = new TextPaint();
        this.f91587o = textPaint;
        textPaint.setColor(-1);
        this.f91587o.setTextAlign(Paint.Align.CENTER);
        this.f91587o.setAntiAlias(true);
        this.f91587o.setFakeBoldText(true);
        String language = Locale.getDefault().getLanguage();
        this.f91587o.setTextSize(m197377a(("in".equals(language) || "id".equals(language)) ? 12 : 14));
        Paint.FontMetrics fontMetrics = this.f91587o.getFontMetrics();
        this.f91588p = (fontMetrics.top / 2.0f) + (fontMetrics.bottom / 2.0f);
        this.f91589q = CoreModule.f17544b.getString(R$string.f21105v4);
    }
}
