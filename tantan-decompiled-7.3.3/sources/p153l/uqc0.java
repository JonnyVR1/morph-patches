package p153l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.TextPaint;
import com.p051p1.mobile.putong.core.message.R$string;
import java.util.Locale;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class uqc0 extends lam {

    /* JADX INFO: renamed from: i */
    public int f180434i;

    /* JADX INFO: renamed from: j */
    public int f180435j;

    /* JADX INFO: renamed from: k */
    public TextPaint f180436k;

    /* JADX INFO: renamed from: l */
    public String[] f180437l;

    /* JADX INFO: renamed from: m */
    public String[] f180438m;

    /* JADX INFO: renamed from: n */
    public int f180439n;

    /* JADX INFO: renamed from: o */
    public String f180440o;

    public uqc0(Context context) {
        super(context);
        this.f180439n = 0;
        m197318n();
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: f */
    public void mo153511f(int i, int i2) {
        super.mo153511f(i, i2);
        if (i == 0) {
            this.f180439n = (i2 * 51) / 100;
        } else if (i == 1) {
            this.f180439n = 51;
        } else if (i == 2) {
            this.f180439n = 51 - ((i2 * 51) / 100);
        }
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: g */
    public void mo153512g(Canvas canvas, int i, int i2) {
        this.f180436k.setAlpha(this.f180439n);
        canvas.drawText(m197317m(), this.f180434i, this.f180435j, this.f180436k);
        this.f180436k.setAlpha(this.f180439n / 3);
        canvas.drawText(m197316l(), this.f180434i, this.f180435j, this.f180436k);
    }

    @Override // p153l.lam
    /* JADX INFO: renamed from: h */
    public void mo153513h(int i, int i2) {
        super.mo153513h(i, i2);
        this.f130716g.set(0.0f, 0.0f, i, m153506a(42));
        this.f180434i = i / 2;
    }

    /* JADX INFO: renamed from: l */
    public final String m197316l() {
        long recordStartTime = this.f130715f.getRecordStartTime();
        int iCeil = (int) Math.ceil((SystemClock.uptimeMillis() - recordStartTime) / 1000.0f);
        if (iCeil < 50 || recordStartTime <= 0) {
            return m153508c() < this.f180437l.length ? this.f180438m[m153508c()] : "";
        }
        return ((long) (60 - iCeil)) <= 0 ? this.f180438m[0] : "";
    }

    /* JADX INFO: renamed from: m */
    public final String m197317m() {
        long recordStartTime = this.f130715f.getRecordStartTime();
        int iCeil = (int) Math.ceil((SystemClock.uptimeMillis() - recordStartTime) / 1000.0f);
        if (iCeil >= 50 && recordStartTime > 0) {
            long j = 60 - iCeil;
            return j <= 0 ? this.f180437l[0] : String.format(this.f180440o, String.valueOf(j));
        }
        int iM153508c = m153508c();
        String[] strArr = this.f180437l;
        return iM153508c < strArr.length ? strArr[m153508c()] : "";
    }

    /* JADX INFO: renamed from: n */
    public final void m197318n() {
        TextPaint textPaint = new TextPaint();
        this.f180436k = textPaint;
        textPaint.setAntiAlias(true);
        String language = Locale.getDefault().getLanguage();
        this.f180436k.setTextSize(m153506a(("in".equals(language) || "id".equals(language)) ? 11 : 13));
        this.f180436k.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f180436k.setAlpha(13);
        this.f180436k.setTextAlign(Paint.Align.CENTER);
        this.f180436k.setFakeBoldText(true);
        Paint.FontMetrics fontMetrics = this.f180436k.getFontMetrics();
        this.f180435j = (int) ((m153506a(21) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
        String str = m153507b().getString(R$string.f21687d1) + "   " + m153507b().getString(R$string.f21696e1);
        this.f180440o = m153507b().getString(R$string.f21705f1);
        this.f180437l = new String[]{str, "", ""};
        this.f180438m = new String[]{"|", "", ""};
    }
}
