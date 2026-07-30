package tech.sud.runtime.component.p148g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.core.C22563g;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.g */
/* JADX INFO: loaded from: classes3.dex */
public class C22544g {

    /* JADX INFO: renamed from: a */
    private final C22563g f208694a;

    /* JADX INFO: renamed from: b */
    private final C22538a f208695b;

    /* JADX INFO: renamed from: c */
    private TextPaint f208696c = null;

    /* JADX INFO: renamed from: d */
    private int f208697d;

    /* JADX INFO: renamed from: e */
    private int f208698e;

    /* JADX INFO: renamed from: f */
    private boolean f208699f;

    public C22544g(C22563g c22563g) {
        this.f208694a = c22563g;
        this.f208695b = c22563g.m223239b();
    }

    /* JADX INFO: renamed from: a */
    private static int m223085a(int i) {
        return (i & 16777215) | RoundedDrawable.DEFAULT_BORDER_COLOR;
    }

    public int cutTextWithWidth(String str, float f) {
        this.f208696c.setSubpixelText(true);
        String strReplace = str.replace('\t', ' ');
        return strReplace.substring(0, this.f208696c.breakText(strReplace, true, f, null)).getBytes().length;
    }

    public float fontAscent() {
        return -this.f208698e;
    }

    public float fontDescent() {
        return this.f208697d - (-this.f208698e);
    }

    public void generateTextBitmapData(String str, int i, boolean z, float f, float f2) {
        int i2;
        float f3;
        float f4;
        int i3;
        String strReplace = str.replace('\t', ' ');
        int iRound = Math.round(this.f208696c.measureText(strReplace));
        int i4 = this.f208697d;
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
        int iM223056b = this.f208695b.m223056b();
        if (i6 > iM223056b) {
            f3 = iM223056b / f5;
            i2 = iM223056b;
        } else {
            i2 = i6;
            f3 = f2;
        }
        if (i7 > iM223056b) {
            f4 = iM223056b / f6;
            i3 = iM223056b;
        } else {
            f4 = f2;
            i3 = i7;
        }
        Canvas canvasM223052a = this.f208695b.m223052a(i2, i3);
        canvasM223052a.setMatrix(null);
        canvasM223052a.scale(f3, f4);
        if (z && f != 0.0f) {
            float f7 = 0.5f * f;
            canvasM223052a.translate(f7, f7);
        }
        TextPaint textPaint = this.f208696c;
        if (z) {
            textPaint.setStyle(Paint.Style.STROKE);
            this.f208696c.setStrokeWidth(f);
            this.f208696c.setStrokeCap(Paint.Cap.ROUND);
            this.f208696c.setStrokeJoin(Paint.Join.ROUND);
        } else {
            textPaint.setStyle(Paint.Style.FILL);
        }
        this.f208696c.setColor(m223085a(i));
        canvasM223052a.drawText(strReplace, 0, strReplace.length(), 0.0f, -this.f208698e, (Paint) this.f208696c);
        this.f208694a.m223233a(i2, i3, this.f208695b.m223058c(), iRound, i5);
    }

    public void init(float f, boolean z, boolean z2, String str) {
        TextPaint textPaint = new TextPaint();
        this.f208696c = textPaint;
        textPaint.setTextSize(f);
        this.f208696c.setTextAlign(Paint.Align.LEFT);
        this.f208696c.setAntiAlias(true);
        this.f208696c.setTypeface(this.f208695b.m223053a(str));
        this.f208696c.setFakeBoldText(z);
        if (z2) {
            this.f208696c.setTextSkewX(-0.12f);
        }
        this.f208699f = z;
        this.f208698e = Math.round(this.f208696c.getFontMetrics().ascent);
        this.f208697d = Math.round(this.f208696c.getFontMetrics().descent) - this.f208698e;
    }

    public float textHeight(String str) {
        return this.f208697d;
    }

    public float textWidth(String str) {
        return this.f208696c.measureText(str.replace('\t', ' '));
    }
}
