package p003l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mic0 extends u7m {

    /* JADX INFO: renamed from: j */
    public TextPaint f5654j;

    /* JADX INFO: renamed from: k */
    public float f5655k;

    /* JADX INFO: renamed from: l */
    public int f5656l;

    /* JADX INFO: renamed from: m */
    public int f5657m;

    /* JADX INFO: renamed from: n */
    public String f5658n;

    /* JADX INFO: renamed from: o */
    public long f5659o;

    public mic0(Context context) {
        super(context);
        this.f5657m = 0;
        this.f5658n = "0:00";
        this.f5659o = -1L;
        m6400l();
    }

    /* JADX INFO: renamed from: l */
    private void m6400l() {
        TextPaint textPaint = new TextPaint();
        this.f5654j = textPaint;
        textPaint.setAntiAlias(true);
        this.f5654j.setColor(-1);
        this.f5654j.setTextSize(m8299a(14));
        this.f5654j.setTextAlign(Paint.Align.CENTER);
        this.f5656l = m8299a(58);
        Paint.FontMetrics fontMetrics = this.f5654j.getFontMetrics();
        this.f5655k = (fontMetrics.top / 2.0f) + (fontMetrics.bottom / 2.0f);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: f */
    public void mo3836f(int i, int i2) {
        super.mo3836f(i, i2);
        if (i == 0) {
            this.f5657m = (i2 * 255) / 100;
        } else if (i == 1) {
            this.f5657m = 255;
        } else if (i == 2) {
            this.f5657m = 255 - ((i2 * 255) / 100);
        }
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: g */
    public void mo3837g(Canvas canvas, int i, int i2) {
        this.f5654j.setAlpha(this.f5657m);
        m6401n();
        String str = this.f5658n;
        RectF rectF = this.f7932i;
        canvas.drawText(str, rectF.right - (this.f5656l / 2), ((rectF.top + rectF.bottom) / 2.0f) - this.f5655k, this.f5654j);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: h */
    public void mo3838h(int i, int i2) {
        super.mo3838h(i, i2);
    }

    /* JADX INFO: renamed from: n */
    public final void m6401n() {
        long recordStartTime = this.f8229f.getRecordStartTime();
        long jUptimeMillis = SystemClock.uptimeMillis() - recordStartTime;
        float fUptimeMillis = (SystemClock.uptimeMillis() - recordStartTime) / 1000.0f;
        if (fUptimeMillis <= 0.0f || recordStartTime <= 0) {
            this.f5658n = "0:00";
            this.f5659o = -1L;
            return;
        }
        if (jUptimeMillis <= 250) {
            this.f5658n = "0:00";
            return;
        }
        int iMax = Math.max(1, (int) Math.ceil(fUptimeMillis));
        long j = iMax;
        if (j != this.f5659o) {
            if (iMax < 60) {
                StringBuilder sb = new StringBuilder("0:");
                sb.append(iMax >= 10 ? "" : "0");
                sb.append(iMax);
                this.f5658n = sb.toString();
            } else {
                this.f5658n = "0:60";
            }
            this.f5659o = j;
        }
    }
}
