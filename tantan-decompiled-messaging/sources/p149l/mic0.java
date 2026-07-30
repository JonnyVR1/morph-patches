package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes3.dex */
public class mic0 extends u7m {

    /* JADX INFO: renamed from: j */
    public TextPaint f133957j;

    /* JADX INFO: renamed from: k */
    public float f133958k;

    /* JADX INFO: renamed from: l */
    public int f133959l;

    /* JADX INFO: renamed from: m */
    public int f133960m;

    /* JADX INFO: renamed from: n */
    public String f133961n;

    /* JADX INFO: renamed from: o */
    public long f133962o;

    public mic0(Context context) {
        super(context);
        this.f133960m = 0;
        this.f133961n = "0:00";
        this.f133962o = -1L;
        m154669l();
    }

    /* JADX INFO: renamed from: l */
    private void m154669l() {
        TextPaint textPaint = new TextPaint();
        this.f133957j = textPaint;
        textPaint.setAntiAlias(true);
        this.f133957j.setColor(-1);
        this.f133957j.setTextSize(m197377a(14));
        this.f133957j.setTextAlign(Paint.Align.CENTER);
        this.f133959l = m197377a(58);
        Paint.FontMetrics fontMetrics = this.f133957j.getFontMetrics();
        this.f133958k = (fontMetrics.top / 2.0f) + (fontMetrics.bottom / 2.0f);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: f */
    public void mo116668f(int i, int i2) {
        super.mo116668f(i, i2);
        if (i == 0) {
            this.f133960m = (i2 * 255) / 100;
        } else if (i == 1) {
            this.f133960m = 255;
        } else if (i == 2) {
            this.f133960m = 255 - ((i2 * 255) / 100);
        }
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: g */
    public void mo116669g(Canvas canvas, int i, int i2) {
        this.f133957j.setAlpha(this.f133960m);
        m154670n();
        String str = this.f133961n;
        RectF rectF = this.f175024i;
        canvas.drawText(str, rectF.right - (this.f133959l / 2), ((rectF.top + rectF.bottom) / 2.0f) - this.f133958k, this.f133957j);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: h */
    public void mo116670h(int i, int i2) {
        super.mo116670h(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public final void m154670n() {
        long recordStartTime = this.f180402f.getRecordStartTime();
        long jUptimeMillis = SystemClock.uptimeMillis() - recordStartTime;
        float fUptimeMillis = (SystemClock.uptimeMillis() - recordStartTime) / 1000.0f;
        if (fUptimeMillis <= 0.0f || recordStartTime <= 0) {
            this.f133961n = "0:00";
            this.f133962o = -1L;
            return;
        }
        if (jUptimeMillis <= 250) {
            this.f133961n = "0:00";
            return;
        }
        int iMax = Math.max(1, (int) Math.ceil(fUptimeMillis));
        long j = iMax;
        if (j != this.f133962o) {
            if (iMax < 60) {
                StringBuilder sb = new StringBuilder("0:");
                sb.append(iMax >= 10 ? "" : "0");
                sb.append(iMax);
                this.f133961n = sb.toString();
            } else {
                this.f133961n = "0:60";
            }
            this.f133962o = j;
        }
    }
}
