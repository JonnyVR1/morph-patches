package p153l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public class tqc0 extends kam {

    /* JADX INFO: renamed from: j */
    public TextPaint f175695j;

    /* JADX INFO: renamed from: k */
    public float f175696k;

    /* JADX INFO: renamed from: l */
    public int f175697l;

    /* JADX INFO: renamed from: m */
    public int f175698m;

    /* JADX INFO: renamed from: n */
    public String f175699n;

    /* JADX INFO: renamed from: o */
    public long f175700o;

    public tqc0(Context context) {
        super(context);
        this.f175698m = 0;
        this.f175699n = "0:00";
        this.f175700o = -1L;
        m192274l();
    }

    /* JADX INFO: renamed from: l */
    private void m192274l() {
        TextPaint textPaint = new TextPaint();
        this.f175695j = textPaint;
        textPaint.setAntiAlias(true);
        this.f175695j.setColor(-1);
        this.f175695j.setTextSize(m153506a(14));
        this.f175695j.setTextAlign(Paint.Align.CENTER);
        this.f175697l = m153506a(58);
        Paint.FontMetrics fontMetrics = this.f175695j.getFontMetrics();
        this.f175696k = (fontMetrics.top / 2.0f) + (fontMetrics.bottom / 2.0f);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: f */
    public void mo153511f(int i, int i2) {
        super.mo153511f(i, i2);
        if (i == 0) {
            this.f175698m = (i2 * 255) / 100;
        } else if (i == 1) {
            this.f175698m = 255;
        } else if (i == 2) {
            this.f175698m = 255 - ((i2 * 255) / 100);
        }
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: g */
    public void mo153512g(Canvas canvas, int i, int i2) {
        this.f175695j.setAlpha(this.f175698m);
        m192275n();
        String str = this.f175699n;
        RectF rectF = this.f124700i;
        canvas.drawText(str, rectF.right - (this.f175697l / 2), ((rectF.top + rectF.bottom) / 2.0f) - this.f175696k, this.f175695j);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: h */
    public void mo153513h(int i, int i2) {
        super.mo153513h(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public final void m192275n() {
        long recordStartTime = this.f130715f.getRecordStartTime();
        long jUptimeMillis = SystemClock.uptimeMillis() - recordStartTime;
        float fUptimeMillis = (SystemClock.uptimeMillis() - recordStartTime) / 1000.0f;
        if (fUptimeMillis <= 0.0f || recordStartTime <= 0) {
            this.f175699n = "0:00";
            this.f175700o = -1L;
            return;
        }
        if (jUptimeMillis <= 250) {
            this.f175699n = "0:00";
            return;
        }
        int iMax = Math.max(1, (int) Math.ceil(fUptimeMillis));
        long j = iMax;
        if (j != this.f175700o) {
            if (iMax < 60) {
                StringBuilder sb = new StringBuilder("0:");
                sb.append(iMax >= 10 ? "" : "0");
                sb.append(iMax);
                this.f175699n = sb.toString();
            } else {
                this.f175699n = "0:60";
            }
            this.f175700o = j;
        }
    }
}
