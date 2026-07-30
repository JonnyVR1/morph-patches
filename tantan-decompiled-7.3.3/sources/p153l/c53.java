package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.sunshine.engine.base.C13664r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class c53 extends ho0.AbstractC17525a {

    /* JADX INFO: renamed from: k */
    private static Rect f79753k = new Rect();

    /* JADX INFO: renamed from: l */
    private static RectF f79754l = new RectF();

    /* JADX INFO: renamed from: f */
    public List<Rect> f79755f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public String f79756g = null;

    /* JADX INFO: renamed from: h */
    public ho0 f79757h = null;

    /* JADX INFO: renamed from: i */
    public Integer f79758i = null;

    /* JADX INFO: renamed from: j */
    public p60 f79759j;

    public c53(p60 p60Var) {
        this.f79759j = p60Var;
    }

    /* JADX INFO: renamed from: f */
    private void m107976f(g1g0 g1g0Var) {
        int i = this.f79759j.f150717h;
        if (i != 255) {
            cce cceVar = g1g0Var.f56519s;
            cceVar.f80955f = (cceVar.f80955f * i) / 255;
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Float] */
    /* JADX INFO: renamed from: d */
    public ho0 m107977d() {
        ho0 ho0Var = new ho0();
        ho0Var.f110856d.f90384a = Float.valueOf(this.f79755f.get(0).width() / 2.0f);
        ho0Var.f110856d.f90385b = Float.valueOf(this.f79755f.get(0).height() / 2.0f);
        return ho0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m107978e(g1g0 g1g0Var, Canvas canvas) {
        ho0 ho0VarM136375a;
        float fWidth;
        m136377c();
        float fWidth2 = 0.0f;
        this.f138365c.set(0.0f, 0.0f, 0.0f, 0.0f);
        Bitmap bitmap = g1g0Var.f56505e;
        Rect rect = this.f79755f.get(0);
        String str = this.f79756g;
        C13664r.a aVar = null;
        if (str != null) {
            bitmap = g1g0Var.f56521u.get(str);
            aVar = g1g0Var.f56523w.get(this.f79756g);
            rect = null;
        }
        if (bitmap == null && aVar == null) {
            return;
        }
        if (!g1g0Var.f101751B || (ho0VarM136375a = this.f79757h) == null) {
            ho0VarM136375a = m136375a(g1g0Var.m82137f());
        }
        if (ho0VarM136375a != null) {
            float fM190928b = ho0VarM136375a.f110853a.m190928b(g1g0Var.m82137f());
            if (ho0VarM136375a.m136373a(fM190928b, g1g0Var)) {
                m107976f(g1g0Var);
                ho0VarM136375a.m136374b(g1g0Var);
                this.f138365c.set(g1g0Var.f56519s.f80950a);
                g1g0Var.m82138g(this.f138364b);
                this.f138363a = true;
                if (this.f79755f.size() > 1) {
                    List<Rect> list = this.f79755f;
                    rect = list.get((int) ((list.size() - 1) * fM190928b));
                }
                if (this.f79758i == null) {
                    if (aVar == null) {
                        C13664r.m82144a(canvas, bitmap, rect, g1g0Var.f56519s);
                        return;
                    } else {
                        C13664r.m82145b(canvas, aVar, fM190928b, g1g0Var);
                        return;
                    }
                }
                if (bitmap != null) {
                    f79753k.set(rect);
                    f79754l.set(g1g0Var.f56519s.f80952c);
                    if (this.f79758i.intValue() <= 0 || this.f79758i.intValue() > rect.height()) {
                        return;
                    }
                    if (this.f79758i.intValue() > 1) {
                        Rect rect2 = f79753k;
                        int i = rect.left;
                        int i2 = rect.top;
                        rect2.set(i, i2, rect.right, (this.f79758i.intValue() + i2) - 1);
                        fWidth = (g1g0Var.f56519s.f80952c.width() * f79753k.height()) / f79753k.width();
                        RectF rectF = g1g0Var.f56519s.f80952c;
                        RectF rectF2 = f79754l;
                        float f = rectF2.left;
                        float f2 = rectF2.top;
                        rectF.set(f, f2, rectF2.right, f2 + fWidth);
                        C13664r.m82144a(canvas, bitmap, f79753k, g1g0Var.f56519s);
                    } else {
                        fWidth = 0.0f;
                    }
                    if (this.f79758i.intValue() < rect.height()) {
                        f79753k.set(rect.left, rect.top + this.f79758i.intValue(), rect.right, rect.bottom);
                        fWidth2 = (g1g0Var.f56519s.f80952c.width() * f79753k.height()) / f79753k.width();
                        RectF rectF3 = g1g0Var.f56519s.f80952c;
                        RectF rectF4 = f79754l;
                        float f3 = rectF4.left;
                        float f4 = rectF4.bottom;
                        rectF3.set(f3, f4 - fWidth2, rectF4.right, f4);
                        C13664r.m82144a(canvas, bitmap, f79753k, g1g0Var.f56519s);
                    }
                    f79753k.set(rect.left, (rect.top + this.f79758i.intValue()) - 1, rect.right, rect.top + this.f79758i.intValue());
                    RectF rectF5 = g1g0Var.f56519s.f80952c;
                    RectF rectF6 = f79754l;
                    rectF5.set(rectF6.left, (rectF6.top + fWidth) - 1.0f, rectF6.right, (rectF6.bottom - fWidth2) + 1.0f);
                    C13664r.m82144a(canvas, bitmap, f79753k, g1g0Var.f56519s);
                }
            }
        }
    }
}
