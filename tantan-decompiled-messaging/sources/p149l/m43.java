package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.sunshine.engine.base.C13501r;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class m43 extends lo0.AbstractC18269a {

    /* JADX INFO: renamed from: k */
    private static Rect f131218k = new Rect();

    /* JADX INFO: renamed from: l */
    private static RectF f131219l = new RectF();

    /* JADX INFO: renamed from: f */
    public List<Rect> f131220f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public String f131221g = null;

    /* JADX INFO: renamed from: h */
    public lo0 f131222h = null;

    /* JADX INFO: renamed from: i */
    public Integer f131223i = null;

    /* JADX INFO: renamed from: j */
    public t60 f131224j;

    public m43(t60 t60Var) {
        this.f131224j = t60Var;
    }

    /* JADX INFO: renamed from: f */
    private void m152988f(xsf0 xsf0Var) {
        int i = this.f131224j.f167895h;
        if (i != 255) {
            yae yaeVar = xsf0Var.f55671s;
            yaeVar.f197190f = (yaeVar.f197190f * i) / 255;
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Float] */
    /* JADX INFO: renamed from: d */
    public lo0 m152989d() {
        lo0 lo0Var = new lo0();
        lo0Var.f129049d.f176651a = Float.valueOf(this.f131220f.get(0).width() / 2.0f);
        lo0Var.f129049d.f176652b = Float.valueOf(this.f131220f.get(0).height() / 2.0f);
        return lo0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m152990e(xsf0 xsf0Var, Canvas canvas) {
        lo0 lo0VarM150758a;
        float fWidth;
        m150760c();
        float fWidth2 = 0.0f;
        this.f86530c.set(0.0f, 0.0f, 0.0f, 0.0f);
        Bitmap bitmap = xsf0Var.f55657e;
        Rect rect = this.f131220f.get(0);
        String str = this.f131221g;
        C13501r.a aVar = null;
        if (str != null) {
            bitmap = xsf0Var.f55673u.get(str);
            aVar = xsf0Var.f55675w.get(this.f131221g);
            rect = null;
        }
        if (bitmap == null && aVar == null) {
            return;
        }
        if (!xsf0Var.f194238B || (lo0VarM150758a = this.f131222h) == null) {
            lo0VarM150758a = m150758a(xsf0Var.m80954f());
        }
        if (lo0VarM150758a != null) {
            float fM168507b = lo0VarM150758a.f129046a.m168507b(xsf0Var.m80954f());
            if (lo0VarM150758a.m150756a(fM168507b, xsf0Var)) {
                m152988f(xsf0Var);
                lo0VarM150758a.m150757b(xsf0Var);
                this.f86530c.set(xsf0Var.f55671s.f197185a);
                xsf0Var.m80955g(this.f86529b);
                this.f86528a = true;
                if (this.f131220f.size() > 1) {
                    List<Rect> list = this.f131220f;
                    rect = list.get((int) ((list.size() - 1) * fM168507b));
                }
                if (this.f131223i == null) {
                    if (aVar == null) {
                        C13501r.m80961a(canvas, bitmap, rect, xsf0Var.f55671s);
                        return;
                    } else {
                        C13501r.m80962b(canvas, aVar, fM168507b, xsf0Var);
                        return;
                    }
                }
                if (bitmap != null) {
                    f131218k.set(rect);
                    f131219l.set(xsf0Var.f55671s.f197187c);
                    if (this.f131223i.intValue() <= 0 || this.f131223i.intValue() > rect.height()) {
                        return;
                    }
                    if (this.f131223i.intValue() > 1) {
                        Rect rect2 = f131218k;
                        int i = rect.left;
                        int i2 = rect.top;
                        rect2.set(i, i2, rect.right, (this.f131223i.intValue() + i2) - 1);
                        fWidth = (xsf0Var.f55671s.f197187c.width() * f131218k.height()) / f131218k.width();
                        RectF rectF = xsf0Var.f55671s.f197187c;
                        RectF rectF2 = f131219l;
                        float f = rectF2.left;
                        float f2 = rectF2.top;
                        rectF.set(f, f2, rectF2.right, f2 + fWidth);
                        C13501r.m80961a(canvas, bitmap, f131218k, xsf0Var.f55671s);
                    } else {
                        fWidth = 0.0f;
                    }
                    if (this.f131223i.intValue() < rect.height()) {
                        f131218k.set(rect.left, rect.top + this.f131223i.intValue(), rect.right, rect.bottom);
                        fWidth2 = (xsf0Var.f55671s.f197187c.width() * f131218k.height()) / f131218k.width();
                        RectF rectF3 = xsf0Var.f55671s.f197187c;
                        RectF rectF4 = f131219l;
                        float f3 = rectF4.left;
                        float f4 = rectF4.bottom;
                        rectF3.set(f3, f4 - fWidth2, rectF4.right, f4);
                        C13501r.m80961a(canvas, bitmap, f131218k, xsf0Var.f55671s);
                    }
                    f131218k.set(rect.left, (rect.top + this.f131223i.intValue()) - 1, rect.right, rect.top + this.f131223i.intValue());
                    RectF rectF5 = xsf0Var.f55671s.f197187c;
                    RectF rectF6 = f131219l;
                    rectF5.set(rectF6.left, (rectF6.top + fWidth) - 1.0f, rectF6.right, (rectF6.bottom - fWidth2) + 1.0f);
                    C13501r.m80961a(canvas, bitmap, f131218k, xsf0Var.f55671s);
                }
            }
        }
    }
}
