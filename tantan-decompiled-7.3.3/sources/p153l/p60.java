package p153l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class p60 extends ho0.AbstractC17525a {

    /* JADX INFO: renamed from: f */
    public g1g0 f150715f;

    /* JADX INFO: renamed from: g */
    public List<c53> f150716g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f150717h = 255;

    public p60(g1g0 g1g0Var) {
        this.f150715f = null;
        this.f150715f = g1g0Var;
    }

    /* JADX INFO: renamed from: f */
    private void m170706f(g1g0 g1g0Var, Canvas canvas) {
        Iterator<c53> it = this.f150716g.iterator();
        while (it.hasNext()) {
            it.next().m107978e(g1g0Var, canvas);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Float] */
    /* JADX INFO: renamed from: d */
    public ho0 m170707d() {
        ho0 ho0Var = new ho0();
        float fIntValue = this.f150715f.f56508h.f90384a.intValue() / 2.0f;
        float fIntValue2 = this.f150715f.f56508h.f90385b.intValue() / 2.0f;
        ho0Var.f110854b.mo150086i(Float.valueOf(fIntValue), Float.valueOf(fIntValue));
        ho0Var.f110855c.mo150086i(Float.valueOf(fIntValue2), Float.valueOf(fIntValue2));
        float f = fIntValue / 2.0f;
        float f2 = fIntValue2 / 2.0f;
        ho0Var.f110856d.f90384a = Float.valueOf(f);
        ho0Var.f110856d.f90385b = Float.valueOf(f2);
        ho0Var.f110859g.m154306a(Float.valueOf(f), Float.valueOf(f2));
        return ho0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m170708e(g1g0 g1g0Var, Canvas canvas) {
        m136377c();
        if (this.f150716g.size() > 0) {
            ho0 ho0VarM136375a = m136375a(g1g0Var.m82137f());
            if (ho0VarM136375a == null) {
                this.f150717h = 255;
                this.f138363a = true;
                m170706f(g1g0Var, canvas);
                return;
            }
            if (ho0VarM136375a.m136373a(ho0VarM136375a.f110853a.m190928b(g1g0Var.m82137f()), g1g0Var)) {
                this.f150717h = g1g0Var.f56519s.f80955f;
                this.f138363a = true;
                ho0VarM136375a.m136374b(g1g0Var);
                g1g0Var.m82138g(this.f138364b);
                this.f138364b.reset();
                int iSave = canvas.save();
                Matrix matrix = this.f138364b;
                float fIntValue = ho0VarM136375a.f110860h.m167991f().intValue();
                PointF pointF = g1g0Var.f56519s.f80954e;
                matrix.preRotate(fIntValue, pointF.x, pointF.y);
                this.f138364b.preScale(ho0VarM136375a.f110857e.m167991f().floatValue(), ho0VarM136375a.f110858f.m167991f().floatValue(), g1g0Var.f56519s.f80952c.centerX(), g1g0Var.f56519s.f80952c.centerY());
                this.f138364b.preTranslate((ho0VarM136375a.f110854b.m167991f().floatValue() - (g1g0Var.f56508h.f90384a.intValue() / 2)) * g1g0Var.f56507g, (ho0VarM136375a.f110855c.m167991f().floatValue() - (g1g0Var.f56508h.f90385b.intValue() / 2)) * g1g0Var.f56507g);
                canvas.concat(this.f138364b);
                m170706f(g1g0Var, canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public c53 m170709g() {
        if (this.f150716g.size() <= 0) {
            return null;
        }
        List<c53> list = this.f150716g;
        return list.get(list.size() - 1);
    }
}
