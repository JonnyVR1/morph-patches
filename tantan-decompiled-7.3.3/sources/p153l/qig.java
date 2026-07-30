package p153l;

import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes4.dex */
public class qig {

    /* JADX INFO: renamed from: a */
    public final String f157837a;

    /* JADX INFO: renamed from: b */
    public TextPaint f157838b;

    /* JADX INFO: renamed from: c */
    public float f157839c;

    /* JADX INFO: renamed from: d */
    public float f157840d;

    public qig(String str) {
        this.f157837a = str;
    }

    /* JADX INFO: renamed from: a */
    public qig m176744a(z0m z0mVar) {
        TextPaint textPaint = new TextPaint();
        this.f157838b = textPaint;
        textPaint.setAntiAlias(true);
        this.f157838b.setTextSize(qa00.m175861f(z0mVar.mo146510c()));
        this.f157838b.setTextAlign(Paint.Align.CENTER);
        this.f157838b.setColor(z0mVar.mo146508a());
        Paint.FontMetrics fontMetrics = this.f157838b.getFontMetrics();
        float f = fontMetrics.bottom;
        this.f157839c = ((f - fontMetrics.top) / 2.0f) - f;
        this.f157840d = ynp0.m216943t(z0mVar.mo146510c(), this.f157837a, z0mVar.mo146509b());
        return this;
    }

    /* JADX INFO: renamed from: b */
    public qig m176745b(r5m r5mVar) {
        TextPaint textPaint = new TextPaint();
        this.f157838b = textPaint;
        textPaint.setAntiAlias(true);
        this.f157838b.setTextSize(qa00.m175861f(r5mVar.mo146510c()));
        this.f157838b.setTextAlign(Paint.Align.CENTER);
        this.f157838b.setColor(r5mVar.mo146508a());
        Paint.FontMetrics fontMetrics = this.f157838b.getFontMetrics();
        float f = fontMetrics.bottom;
        this.f157839c = ((f - fontMetrics.top) / 2.0f) - f;
        this.f157840d = ynp0.m216943t(r5mVar.mo146510c(), this.f157837a, r5mVar.mo146509b());
        return this;
    }

    /* JADX INFO: renamed from: c */
    public float m176746c() {
        return this.f157839c;
    }

    /* JADX INFO: renamed from: d */
    public float m176747d() {
        return this.f157840d;
    }

    /* JADX INFO: renamed from: e */
    public String m176748e() {
        return this.f157837a;
    }

    /* JADX INFO: renamed from: f */
    public TextPaint m176749f() {
        return this.f157838b;
    }
}
