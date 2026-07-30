package tech.sud.runtime.component.p025g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.core.C1241g;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.g */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1222g {

    /* JADX INFO: renamed from: a */
    private final C1241g f11397a;

    /* JADX INFO: renamed from: b */
    private final C1216a f11398b;

    /* JADX INFO: renamed from: c */
    private TextPaint f11399c = null;

    /* JADX INFO: renamed from: d */
    private int f11400d;

    /* JADX INFO: renamed from: e */
    private int f11401e;

    /* JADX INFO: renamed from: f */
    private boolean f11402f;

    public C1222g(C1241g c1241g) {
        this.f11397a = c1241g;
        this.f11398b = c1241g.m10464b();
    }

    /* JADX INFO: renamed from: a */
    private static int m10310a(int i) {
        return (i & 16777215) | RoundedDrawable.DEFAULT_BORDER_COLOR;
    }

    public int cutTextWithWidth(String str, float f) {
        this.f11399c.setSubpixelText(true);
        String strReplace = str.replace('\t', ' ');
        return strReplace.substring(0, this.f11399c.breakText(strReplace, true, f, null)).getBytes().length;
    }

    public float fontAscent() {
        return -this.f11401e;
    }

    public float fontDescent() {
        return this.f11400d - (-this.f11401e);
    }

    public void generateTextBitmapData(String str, int i, boolean z, float f, float f2) {
        int i2;
        float f3;
        float f4;
        int i3;
        String strReplace = str.replace('\t', ' ');
        int iRound = Math.round(this.f11399c.measureText(strReplace));
        int i4 = this.f11400d;
        if (z) {
            int iRound2 = Math.round(f);
            iRound += iRound2;
            i4 += iRound2;
        }
        int i5 = i4;
        if (iRound == 0 || i5 == 0) {
            return;
        }
        if (z && f == 0.0f) {
            return;
        }
        float f5 = iRound;
        int i6 = (int) (f5 * f2);
        float f6 = i5;
        int i7 = (int) (f6 * f2);
        int iM10281b = this.f11398b.m10281b();
        if (i6 > iM10281b) {
            f3 = iM10281b / f5;
            i2 = iM10281b;
        } else {
            i2 = i6;
            f3 = f2;
        }
        if (i7 > iM10281b) {
            f4 = iM10281b / f6;
            i3 = iM10281b;
        } else {
            f4 = f2;
            i3 = i7;
        }
        Canvas canvasM10277a = this.f11398b.m10277a(i2, i3);
        canvasM10277a.setMatrix(null);
        canvasM10277a.scale(f3, f4);
        if (z && f != 0.0f) {
            float f7 = 0.5f * f;
            canvasM10277a.translate(f7, f7);
        }
        TextPaint textPaint = this.f11399c;
        if (z) {
            textPaint.setStyle(Paint.Style.STROKE);
            this.f11399c.setStrokeWidth(f);
            this.f11399c.setStrokeCap(Paint.Cap.ROUND);
            this.f11399c.setStrokeJoin(Paint.Join.ROUND);
        } else {
            textPaint.setStyle(Paint.Style.FILL);
        }
        this.f11399c.setColor(m10310a(i));
        canvasM10277a.drawText(strReplace, 0, strReplace.length(), 0.0f, -this.f11401e, (Paint) this.f11399c);
        this.f11397a.m10458a(i2, i3, this.f11398b.m10283c(), iRound, i5);
    }

    public void init(float f, boolean z, boolean z2, String str) {
        TextPaint textPaint = new TextPaint();
        this.f11399c = textPaint;
        textPaint.setTextSize(f);
        this.f11399c.setTextAlign(Paint.Align.LEFT);
        this.f11399c.setAntiAlias(true);
        this.f11399c.setTypeface(this.f11398b.m10278a(str));
        this.f11399c.setFakeBoldText(z);
        if (z2) {
            this.f11399c.setTextSkewX(-0.12f);
        }
        this.f11402f = z;
        this.f11401e = Math.round(this.f11399c.getFontMetrics().ascent);
        this.f11400d = Math.round(this.f11399c.getFontMetrics().descent) - this.f11401e;
    }

    public float textHeight(String str) {
        return this.f11400d;
    }

    public float textWidth(String str) {
        return this.f11399c.measureText(str.replace('\t', ' '));
    }
}
