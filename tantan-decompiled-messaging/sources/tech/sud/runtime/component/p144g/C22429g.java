package tech.sud.runtime.component.p144g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.core.C22448g;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.g */
/* JADX INFO: loaded from: classes3.dex */
public class C22429g {

    /* JADX INFO: renamed from: a */
    private final C22448g f207772a;

    /* JADX INFO: renamed from: b */
    private final C22423a f207773b;

    /* JADX INFO: renamed from: c */
    private TextPaint f207774c = null;

    /* JADX INFO: renamed from: d */
    private int f207775d;

    /* JADX INFO: renamed from: e */
    private int f207776e;

    /* JADX INFO: renamed from: f */
    private boolean f207777f;

    public C22429g(C22448g c22448g) {
        this.f207772a = c22448g;
        this.f207773b = c22448g.m221993b();
    }

    /* JADX INFO: renamed from: a */
    private static int m221839a(int i) {
        return (i & 16777215) | RoundedDrawable.DEFAULT_BORDER_COLOR;
    }

    public int cutTextWithWidth(String str, float f) {
        this.f207774c.setSubpixelText(true);
        String strReplace = str.replace('\t', ' ');
        return strReplace.substring(0, this.f207774c.breakText(strReplace, true, f, null)).getBytes().length;
    }

    public float fontAscent() {
        return -this.f207776e;
    }

    public float fontDescent() {
        return this.f207775d - (-this.f207776e);
    }

    public void generateTextBitmapData(String str, int i, boolean z, float f, float f2) {
        int i2;
        float f3;
        float f4;
        int i3;
        String strReplace = str.replace('\t', ' ');
        int iRound = Math.round(this.f207774c.measureText(strReplace));
        int i4 = this.f207775d;
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
        int iM221810b = this.f207773b.m221810b();
        if (i6 > iM221810b) {
            f3 = iM221810b / f5;
            i2 = iM221810b;
        } else {
            i2 = i6;
            f3 = f2;
        }
        if (i7 > iM221810b) {
            f4 = iM221810b / f6;
            i3 = iM221810b;
        } else {
            f4 = f2;
            i3 = i7;
        }
        Canvas canvasM221806a = this.f207773b.m221806a(i2, i3);
        canvasM221806a.setMatrix(null);
        canvasM221806a.scale(f3, f4);
        if (z && f != 0.0f) {
            float f7 = 0.5f * f;
            canvasM221806a.translate(f7, f7);
        }
        TextPaint textPaint = this.f207774c;
        if (z) {
            textPaint.setStyle(Paint.Style.STROKE);
            this.f207774c.setStrokeWidth(f);
            this.f207774c.setStrokeCap(Paint.Cap.ROUND);
            this.f207774c.setStrokeJoin(Paint.Join.ROUND);
        } else {
            textPaint.setStyle(Paint.Style.FILL);
        }
        this.f207774c.setColor(m221839a(i));
        canvasM221806a.drawText(strReplace, 0, strReplace.length(), 0.0f, -this.f207776e, (Paint) this.f207774c);
        this.f207772a.m221987a(i2, i3, this.f207773b.m221812c(), iRound, i5);
    }

    public void init(float f, boolean z, boolean z2, String str) {
        TextPaint textPaint = new TextPaint();
        this.f207774c = textPaint;
        textPaint.setTextSize(f);
        this.f207774c.setTextAlign(Paint.Align.LEFT);
        this.f207774c.setAntiAlias(true);
        this.f207774c.setTypeface(this.f207773b.m221807a(str));
        this.f207774c.setFakeBoldText(z);
        if (z2) {
            this.f207774c.setTextSkewX(-0.12f);
        }
        this.f207777f = z;
        this.f207776e = Math.round(this.f207774c.getFontMetrics().ascent);
        this.f207775d = Math.round(this.f207774c.getFontMetrics().descent) - this.f207776e;
    }

    public float textHeight(String str) {
        return this.f207775d;
    }

    public float textWidth(String str) {
        return this.f207774c.measureText(str.replace('\t', ' '));
    }
}
