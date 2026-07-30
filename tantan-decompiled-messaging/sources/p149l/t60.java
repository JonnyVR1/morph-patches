package p149l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class t60 extends lo0.AbstractC18269a {

    /* JADX INFO: renamed from: f */
    public xsf0 f167893f;

    /* JADX INFO: renamed from: g */
    public List<m43> f167894g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f167895h = 255;

    public t60(xsf0 xsf0Var) {
        this.f167893f = null;
        this.f167893f = xsf0Var;
    }

    /* JADX INFO: renamed from: f */
    private void m187351f(xsf0 xsf0Var, Canvas canvas) {
        Iterator<m43> it = this.f167894g.iterator();
        while (it.hasNext()) {
            it.next().m152990e(xsf0Var, canvas);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Float] */
    /* JADX INFO: renamed from: d */
    public lo0 m187352d() {
        lo0 lo0Var = new lo0();
        float fIntValue = this.f167893f.f55660h.f176651a.intValue() / 2.0f;
        float fIntValue2 = this.f167893f.f55660h.f176652b.intValue() / 2.0f;
        lo0Var.f129047b.mo125467i(Float.valueOf(fIntValue), Float.valueOf(fIntValue));
        lo0Var.f129048c.mo125467i(Float.valueOf(fIntValue2), Float.valueOf(fIntValue2));
        float f = fIntValue / 2.0f;
        float f2 = fIntValue2 / 2.0f;
        lo0Var.f129049d.f176651a = Float.valueOf(f);
        lo0Var.f129049d.f176652b = Float.valueOf(f2);
        lo0Var.f129052g.m120162a(Float.valueOf(f), Float.valueOf(f2));
        return lo0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m187353e(xsf0 xsf0Var, Canvas canvas) {
        m150760c();
        if (this.f167894g.size() > 0) {
            lo0 lo0VarM150758a = m150758a(xsf0Var.m80954f());
            if (lo0VarM150758a == null) {
                this.f167895h = 255;
                this.f86528a = true;
                m187351f(xsf0Var, canvas);
                return;
            }
            if (lo0VarM150758a.m150756a(lo0VarM150758a.f129046a.m168507b(xsf0Var.m80954f()), xsf0Var)) {
                this.f167895h = xsf0Var.f55671s.f197190f;
                this.f86528a = true;
                lo0VarM150758a.m150757b(xsf0Var);
                xsf0Var.m80955g(this.f86529b);
                this.f86529b.reset();
                int iSave = canvas.save();
                Matrix matrix = this.f86529b;
                float fIntValue = lo0VarM150758a.f129053h.m145367f().intValue();
                PointF pointF = xsf0Var.f55671s.f197189e;
                matrix.preRotate(fIntValue, pointF.x, pointF.y);
                this.f86529b.preScale(lo0VarM150758a.f129050e.m145367f().floatValue(), lo0VarM150758a.f129051f.m145367f().floatValue(), xsf0Var.f55671s.f197187c.centerX(), xsf0Var.f55671s.f197187c.centerY());
                this.f86529b.preTranslate((lo0VarM150758a.f129047b.m145367f().floatValue() - (xsf0Var.f55660h.f176651a.intValue() / 2)) * xsf0Var.f55659g, (lo0VarM150758a.f129048c.m145367f().floatValue() - (xsf0Var.f55660h.f176652b.intValue() / 2)) * xsf0Var.f55659g);
                canvas.concat(this.f86529b);
                m187351f(xsf0Var, canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public m43 m187354g() {
        if (this.f167894g.size() <= 0) {
            return null;
        }
        List<m43> list = this.f167894g;
        return list.get(list.size() - 1);
    }
}
