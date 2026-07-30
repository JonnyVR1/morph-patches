package com.sunshine.engine.particle;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.sunshine.engine.base.AbstractC13647a;
import com.sunshine.engine.base.AnimView;
import p153l.v1e0;
import p153l.wg60;
import p153l.x1e0;

/* JADX INFO: loaded from: classes11.dex */
public class SceneView extends AnimView<x1e0> {
    public SceneView(Context context) {
        super(context);
    }

    @Override // com.sunshine.engine.base.AnimView
    /* JADX INFO: renamed from: c */
    public void mo82100c(int i, int i2) {
        RectF rectF = new RectF();
        int size = ((v1e0) ((x1e0) this.f56499a).f56533e).f181951C.size();
        while (true) {
            size--;
            if (size <= -1) {
                return;
            }
            wg60 wg60Var = ((v1e0) ((x1e0) this.f56499a).f56533e).f181951C.get(size);
            if (wg60Var.f138363a) {
                wg60Var.f138364b.mapRect(rectF, wg60Var.f138365c);
                if (rectF.contains(i, i2)) {
                    AbstractC13647a.a aVar = ((v1e0) ((x1e0) this.f56499a).f56533e).f56524x.get(wg60Var.f138366d);
                    if (aVar != null) {
                        if (aVar instanceof AbstractC13647a.c) {
                            ((AbstractC13647a.c) aVar).m82142a(wg60Var.f138366d, wg60Var);
                            return;
                        } else if (aVar instanceof AbstractC13647a.b) {
                            ((AbstractC13647a.b) aVar).onClick(wg60Var.f138366d);
                            return;
                        } else {
                            if (aVar instanceof AbstractC13647a.d) {
                                ((AbstractC13647a.d) aVar).m82143b(wg60Var.f138366d, rectF, i, i2);
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
    public x1e0 mo82098a() {
        return new x1e0();
    }

    public SceneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SceneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
