package com.sunshine.engine.bone;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.sunshine.engine.base.AbstractC13484a;
import com.sunshine.engine.base.AnimView;
import p149l.m43;
import p149l.t60;
import p149l.xsf0;
import p149l.ysf0;

/* JADX INFO: loaded from: classes13.dex */
public class StageView extends AnimView<ysf0> {
    public StageView(Context context) {
        super(context);
    }

    @Override // com.sunshine.engine.base.AnimView
    /* JADX INFO: renamed from: c */
    public void mo80917c(int i, int i2) {
        RectF rectF = new RectF();
        Matrix matrix = new Matrix();
        int size = ((xsf0) ((ysf0) this.f55651a).f55685e).f194237A.size();
        while (true) {
            size--;
            if (size <= -1) {
                return;
            }
            t60 t60Var = ((xsf0) ((ysf0) this.f55651a).f55685e).f194237A.get(size);
            if (t60Var.f86528a) {
                for (int size2 = t60Var.f167894g.size() - 1; size2 > -1; size2--) {
                    m43 m43Var = t60Var.f167894g.get(size2);
                    if (m43Var.f86528a) {
                        matrix.set(t60Var.f86529b);
                        matrix.preConcat(m43Var.f86529b);
                        matrix.mapRect(rectF, m43Var.f86530c);
                        if (rectF.contains(i, i2)) {
                            AbstractC13484a.a aVar = ((xsf0) ((ysf0) this.f55651a).f55685e).f55676x.get(m43Var.f86531d);
                            if (aVar != null) {
                                if (!(aVar instanceof AbstractC13484a.d)) {
                                    if (!(aVar instanceof AbstractC13484a.b)) {
                                        break;
                                    }
                                    ((AbstractC13484a.b) aVar).onClick(m43Var.f86531d);
                                    break;
                                }
                                ((AbstractC13484a.d) aVar).m80960b(m43Var.f86531d, rectF, i, i2);
                                break;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public StageView m80983f(boolean z) {
        T t = this.f55651a;
        if (((ysf0) t).f55685e != 0) {
            ((xsf0) ((ysf0) t).f55685e).f194239C = z;
        }
        return this;
    }

    @Override // com.sunshine.engine.base.AnimView
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ysf0 mo80915a() {
        return new ysf0();
    }

    /* JADX INFO: renamed from: h */
    public void m80985h(float f, float f2, int i) {
        ((ysf0) this.f55651a).m215907u(f, f2, i);
        invalidate();
    }

    public void setOnRepeat(Runnable runnable) {
        ((ysf0) this.f55651a).m215906t(runnable);
    }

    public void setPercent(float f) {
        ((ysf0) this.f55651a).m215907u(f, f, 0);
        invalidate();
    }

    public StageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
