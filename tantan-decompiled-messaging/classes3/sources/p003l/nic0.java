package p003l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.TextPaint;
import com.p1.mobile.putong.core.message.R;
import java.util.Locale;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class nic0 extends v7m {

    /* JADX INFO: renamed from: i */
    public int f5902i;

    /* JADX INFO: renamed from: j */
    public int f5903j;

    /* JADX INFO: renamed from: k */
    public TextPaint f5904k;

    /* JADX INFO: renamed from: l */
    public String[] f5905l;

    /* JADX INFO: renamed from: m */
    public String[] f5906m;

    /* JADX INFO: renamed from: n */
    public int f5907n;

    /* JADX INFO: renamed from: o */
    public String f5908o;

    public nic0(Context context) {
        super(context);
        this.f5907n = 0;
        m6536n();
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: f */
    public void mo3836f(int i, int i2) {
        super.mo3836f(i, i2);
        if (i == 0) {
            this.f5907n = (i2 * 51) / 100;
        } else if (i == 1) {
            this.f5907n = 51;
        } else if (i == 2) {
            this.f5907n = 51 - ((i2 * 51) / 100);
        }
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: g */
    public void mo3837g(Canvas canvas, int i, int i2) {
        this.f5904k.setAlpha(this.f5907n);
        canvas.drawText(m6535m(), this.f5902i, this.f5903j, this.f5904k);
        this.f5904k.setAlpha(this.f5907n / 3);
        canvas.drawText(m6534l(), this.f5902i, this.f5903j, this.f5904k);
    }

    @Override // p003l.v7m
    /* JADX INFO: renamed from: h */
    public void mo3838h(int i, int i2) {
        super.mo3838h(i, i2);
        this.f8230g.set(0.0f, 0.0f, i, m8299a(42));
        this.f5902i = i / 2;
    }

    /* JADX INFO: renamed from: l */
    public final String m6534l() {
        long recordStartTime = this.f8229f.getRecordStartTime();
        int iCeil = (int) Math.ceil((SystemClock.uptimeMillis() - recordStartTime) / 1000.0f);
        if (iCeil < 50 || recordStartTime <= 0) {
            return m8301c() < this.f5905l.length ? this.f5906m[m8301c()] : "";
        }
        return ((long) (60 - iCeil)) <= 0 ? this.f5906m[0] : "";
    }

    /* JADX INFO: renamed from: m */
    public final String m6535m() {
        long recordStartTime = this.f8229f.getRecordStartTime();
        int iCeil = (int) Math.ceil((SystemClock.uptimeMillis() - recordStartTime) / 1000.0f);
        if (iCeil >= 50 && recordStartTime > 0) {
            long j = 60 - iCeil;
            return j <= 0 ? this.f5905l[0] : String.format(this.f5908o, String.valueOf(j));
        }
        int iM8301c = m8301c();
        String[] strArr = this.f5905l;
        return iM8301c < strArr.length ? strArr[m8301c()] : "";
    }

    /* JADX INFO: renamed from: n */
    public final void m6536n() {
        TextPaint textPaint = new TextPaint();
        this.f5904k = textPaint;
        textPaint.setAntiAlias(true);
        String language = Locale.getDefault().getLanguage();
        this.f5904k.setTextSize(m8299a(("in".equals(language) || "id".equals(language)) ? 11 : 13));
        this.f5904k.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f5904k.setAlpha(13);
        this.f5904k.setTextAlign(Paint.Align.CENTER);
        this.f5904k.setFakeBoldText(true);
        Paint.FontMetrics fontMetrics = this.f5904k.getFontMetrics();
        this.f5903j = (int) ((m8299a(21) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
        String str = m8300b().getString(R.string.d1) + "   " + m8300b().getString(R.string.e1);
        this.f5908o = m8300b().getString(R.string.f1);
        this.f5905l = new String[]{str, "", ""};
        this.f5906m = new String[]{"|", "", ""};
    }
}
