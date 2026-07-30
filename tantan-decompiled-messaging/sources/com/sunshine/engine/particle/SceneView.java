package com.sunshine.engine.particle;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.sunshine.engine.base.AbstractC13484a;
import com.sunshine.engine.base.AnimView;
import p149l.r860;
import p149l.ttd0;
import p149l.vtd0;

/* JADX INFO: loaded from: classes13.dex */
public class SceneView extends AnimView<vtd0> {
    public SceneView(Context context) {
        super(context);
    }

    @Override // com.sunshine.engine.base.AnimView
    /* JADX INFO: renamed from: c */
    public void mo80917c(int i, int i2) {
        RectF rectF = new RectF();
        int size = ((ttd0) ((vtd0) this.f55651a).f55685e).f172011C.size();
        while (true) {
            size--;
            if (size <= -1) {
                return;
            }
            r860 r860Var = ((ttd0) ((vtd0) this.f55651a).f55685e).f172011C.get(size);
            if (r860Var.f86528a) {
                r860Var.f86529b.mapRect(rectF, r860Var.f86530c);
                if (rectF.contains(i, i2)) {
                    AbstractC13484a.a aVar = ((ttd0) ((vtd0) this.f55651a).f55685e).f55676x.get(r860Var.f86531d);
                    if (aVar != null) {
                        if (aVar instanceof AbstractC13484a.c) {
                            ((AbstractC13484a.c) aVar).m80959a(r860Var.f86531d, r860Var);
                            return;
                        } else if (aVar instanceof AbstractC13484a.b) {
                            ((AbstractC13484a.b) aVar).onClick(r860Var.f86531d);
                            return;
                        } else {
                            if (aVar instanceof AbstractC13484a.d) {
                                ((AbstractC13484a.d) aVar).m80960b(r860Var.f86531d, rectF, i, i2);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override // com.sunshine.engine.base.AnimView
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public vtd0 mo80915a() {
        return new vtd0();
    }

    public SceneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SceneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
