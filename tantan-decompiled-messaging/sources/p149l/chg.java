package p149l;

import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public class chg {

    /* JADX INFO: renamed from: a */
    public final String f80868a;

    /* JADX INFO: renamed from: b */
    public TextPaint f80869b;

    /* JADX INFO: renamed from: c */
    public float f80870c;

    /* JADX INFO: renamed from: d */
    public float f80871d;

    public chg(String str) {
        this.f80868a = str;
    }

    /* JADX INFO: renamed from: a */
    public chg m106867a(gyl gylVar) {
        TextPaint textPaint = new TextPaint();
        this.f80869b = textPaint;
        textPaint.setAntiAlias(true);
        this.f80869b.setTextSize(t100.m186892f(gylVar.mo136961c()));
        this.f80869b.setTextAlign(Paint.Align.CENTER);
        this.f80869b.setColor(gylVar.mo136959a());
        Paint.FontMetrics fontMetrics = this.f80869b.getFontMetrics();
        float f = fontMetrics.bottom;
        this.f80870c = ((f - fontMetrics.top) / 2.0f) - f;
        this.f80871d = uep0.m193333t(gylVar.mo136961c(), this.f80868a, gylVar.mo136960b());
        return this;
    }

    /* JADX INFO: renamed from: b */
    public chg m106868b(z2m z2mVar) {
        TextPaint textPaint = new TextPaint();
        this.f80869b = textPaint;
        textPaint.setAntiAlias(true);
        this.f80869b.setTextSize(t100.m186892f(z2mVar.mo136961c()));
        this.f80869b.setTextAlign(Paint.Align.CENTER);
        this.f80869b.setColor(z2mVar.mo136959a());
        Paint.FontMetrics fontMetrics = this.f80869b.getFontMetrics();
        float f = fontMetrics.bottom;
        this.f80870c = ((f - fontMetrics.top) / 2.0f) - f;
        this.f80871d = uep0.m193333t(z2mVar.mo136961c(), this.f80868a, z2mVar.mo136960b());
        return this;
    }

    /* JADX INFO: renamed from: c */
    public float m106869c() {
        return this.f80870c;
    }

    /* JADX INFO: renamed from: d */
    public float m106870d() {
        return this.f80871d;
    }

    /* JADX INFO: renamed from: e */
    public String m106871e() {
        return this.f80868a;
    }

    /* JADX INFO: renamed from: f */
    public TextPaint m106872f() {
        return this.f80869b;
    }
}
