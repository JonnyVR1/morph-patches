package p149l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.TextPaint;
import com.p046p1.mobile.putong.core.message.R$string;
import java.util.Locale;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class nic0 extends v7m {

    /* JADX INFO: renamed from: i */
    public int f139071i;

    /* JADX INFO: renamed from: j */
    public int f139072j;

    /* JADX INFO: renamed from: k */
    public TextPaint f139073k;

    /* JADX INFO: renamed from: l */
    public String[] f139074l;

    /* JADX INFO: renamed from: m */
    public String[] f139075m;

    /* JADX INFO: renamed from: n */
    public int f139076n;

    /* JADX INFO: renamed from: o */
    public String f139077o;

    public nic0(Context context) {
        super(context);
        this.f139076n = 0;
        m159499n();
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: f */
    public void mo116668f(int i, int i2) {
        super.mo116668f(i, i2);
        if (i == 0) {
            this.f139076n = (i2 * 51) / 100;
        } else if (i == 1) {
            this.f139076n = 51;
        } else if (i == 2) {
            this.f139076n = 51 - ((i2 * 51) / 100);
        }
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: g */
    public void mo116669g(Canvas canvas, int i, int i2) {
        this.f139073k.setAlpha(this.f139076n);
        canvas.drawText(m159498m(), this.f139071i, this.f139072j, this.f139073k);
        this.f139073k.setAlpha(this.f139076n / 3);
        canvas.drawText(m159497l(), this.f139071i, this.f139072j, this.f139073k);
    }

    @Override // p149l.v7m
    /* JADX INFO: renamed from: h */
    public void mo116670h(int i, int i2) {
        super.mo116670h(i, i2);
        this.f180403g.set(0.0f, 0.0f, i, m197377a(42));
        this.f139071i = i / 2;
    }

    /* JADX INFO: renamed from: l */
    public final String m159497l() {
        long recordStartTime = this.f180402f.getRecordStartTime();
        int iCeil = (int) Math.ceil((SystemClock.uptimeMillis() - recordStartTime) / 1000.0f);
        if (iCeil < 50 || recordStartTime <= 0) {
            return m197379c() < this.f139074l.length ? this.f139075m[m197379c()] : "";
        }
        return ((long) (60 - iCeil)) <= 0 ? this.f139075m[0] : "";
    }

    /* JADX INFO: renamed from: m */
    public final String m159498m() {
        long recordStartTime = this.f180402f.getRecordStartTime();
        int iCeil = (int) Math.ceil((SystemClock.uptimeMillis() - recordStartTime) / 1000.0f);
        if (iCeil >= 50 && recordStartTime > 0) {
            long j = 60 - iCeil;
            return j <= 0 ? this.f139074l[0] : String.format(this.f139077o, String.valueOf(j));
        }
        int iM197379c = m197379c();
        String[] strArr = this.f139074l;
        return iM197379c < strArr.length ? strArr[m197379c()] : "";
    }

    /* JADX INFO: renamed from: n */
    public final void m159499n() {
        TextPaint textPaint = new TextPaint();
        this.f139073k = textPaint;
        textPaint.setAntiAlias(true);
        String language = Locale.getDefault().getLanguage();
        this.f139073k.setTextSize(m197377a(("in".equals(language) || "id".equals(language)) ? 11 : 13));
        this.f139073k.setColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f139073k.setAlpha(13);
        this.f139073k.setTextAlign(Paint.Align.CENTER);
        this.f139073k.setFakeBoldText(true);
        Paint.FontMetrics fontMetrics = this.f139073k.getFontMetrics();
        this.f139072j = (int) ((m197377a(21) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f));
        String str = m197378b().getString(R$string.f20945d1) + "   " + m197378b().getString(R$string.f20954e1);
        this.f139077o = m197378b().getString(R$string.f20963f1);
        this.f139074l = new String[]{str, "", ""};
        this.f139075m = new String[]{"|", "", ""};
    }
}
