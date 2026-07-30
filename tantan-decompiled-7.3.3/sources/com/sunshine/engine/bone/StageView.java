package com.sunshine.engine.bone;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.sunshine.engine.base.AbstractC13647a;
import com.sunshine.engine.base.AnimView;
import p153l.c53;
import p153l.g1g0;
import p153l.h1g0;
import p153l.p60;

/* JADX INFO: loaded from: classes11.dex */
public class StageView extends AnimView<h1g0> {
    public StageView(Context context) {
        super(context);
    }

    @Override // com.sunshine.engine.base.AnimView
    /* JADX INFO: renamed from: c */
    public void mo82100c(int i, int i2) {
        RectF rectF = new RectF();
        Matrix matrix = new Matrix();
        int size = ((g1g0) ((h1g0) this.f56499a).f56533e).f101750A.size();
        while (true) {
            size--;
            if (size <= -1) {
                return;
            }
            p60 p60Var = ((g1g0) ((h1g0) this.f56499a).f56533e).f101750A.get(size);
            if (p60Var.f138363a) {
                for (int size2 = p60Var.f150716g.size() - 1; size2 > -1; size2--) {
                    c53 c53Var = p60Var.f150716g.get(size2);
                    if (c53Var.f138363a) {
                        matrix.set(p60Var.f138364b);
                        matrix.preConcat(c53Var.f138364b);
                        matrix.mapRect(rectF, c53Var.f138365c);
                        if (rectF.contains(i, i2)) {
                            AbstractC13647a.a aVar = ((g1g0) ((h1g0) this.f56499a).f56533e).f56524x.get(c53Var.f138366d);
                            if (aVar != null) {
                                if (!(aVar instanceof AbstractC13647a.d)) {
                                    if (!(aVar instanceof AbstractC13647a.b)) {
                                        break;
                                    }
                                    ((AbstractC13647a.b) aVar).onClick(c53Var.f138366d);
                                    break;
                                }
                                ((AbstractC13647a.d) aVar).m82143b(c53Var.f138366d, rectF, i, i2);
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
    public StageView m82166f(boolean z) {
        T t = this.f56499a;
        if (((h1g0) t).f56533e != 0) {
            ((g1g0) ((h1g0) t).f56533e).f101752C = z;
        }
        return this;
    }

    @Override // com.sunshine.engine.base.AnimView
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h1g0 mo82098a() {
        return new h1g0();
    }

    /* JADX INFO: renamed from: h */
    public void m82168h(float f, float f2, int i) {
        ((h1g0) this.f56499a).m133331u(f, f2, i);
        invalidate();
    }

    public void setOnRepeat(Runnable runnable) {
        ((h1g0) this.f56499a).m133330t(runnable);
    }

    public void setPercent(float f) {
        ((h1g0) this.f56499a).m133331u(f, f, 0);
        invalidate();
    }

    public StageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
