package p002l;

import android.graphics.Paint;
import android.text.TextPaint;
import l.t100;
import l.uep0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class chg {

    /* JADX INFO: renamed from: a */
    public final String f8675a;

    /* JADX INFO: renamed from: b */
    public TextPaint f8676b;

    /* JADX INFO: renamed from: c */
    public float f8677c;

    /* JADX INFO: renamed from: d */
    public float f8678d;

    public chg(String str) {
        this.f8675a = str;
    }

    /* JADX INFO: renamed from: a */
    public chg m11042a(gyl gylVar) {
        TextPaint textPaint = new TextPaint();
        this.f8676b = textPaint;
        textPaint.setAntiAlias(true);
        this.f8676b.setTextSize(t100.f(gylVar.mo15237c()));
        this.f8676b.setTextAlign(Paint.Align.CENTER);
        this.f8676b.setColor(gylVar.mo15235a());
        Paint.FontMetrics fontMetrics = this.f8676b.getFontMetrics();
        float f = fontMetrics.bottom;
        this.f8677c = ((f - fontMetrics.top) / 2.0f) - f;
        this.f8678d = uep0.t(gylVar.mo15237c(), this.f8675a, gylVar.mo15236b());
        return this;
    }

    /* JADX INFO: renamed from: b */
    public chg m11043b(z2m z2mVar) {
        TextPaint textPaint = new TextPaint();
        this.f8676b = textPaint;
        textPaint.setAntiAlias(true);
        this.f8676b.setTextSize(t100.f(z2mVar.mo15237c()));
        this.f8676b.setTextAlign(Paint.Align.CENTER);
        this.f8676b.setColor(z2mVar.mo15235a());
        Paint.FontMetrics fontMetrics = this.f8676b.getFontMetrics();
        float f = fontMetrics.bottom;
        this.f8677c = ((f - fontMetrics.top) / 2.0f) - f;
        this.f8678d = uep0.t(z2mVar.mo15237c(), this.f8675a, z2mVar.mo15236b());
        return this;
    }

    /* JADX INFO: renamed from: c */
    public float m11044c() {
        return this.f8677c;
    }

    /* JADX INFO: renamed from: d */
    public float m11045d() {
        return this.f8678d;
    }

    /* JADX INFO: renamed from: e */
    public String m11046e() {
        return this.f8675a;
    }

    /* JADX INFO: renamed from: f */
    public TextPaint m11047f() {
        return this.f8676b;
    }
}
