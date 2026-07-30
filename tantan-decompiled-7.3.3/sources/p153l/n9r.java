package p153l;

import com.sunshine.engine.base.AbstractC13647a;
import com.sunshine.engine.base.LayoutType;

/* JADX INFO: loaded from: classes11.dex */
public class n9r {
    /* JADX INFO: renamed from: a */
    public static void m162003a(AbstractC13647a abstractC13647a) {
        if (abstractC13647a == null || abstractC13647a.f56508h.f90384a.intValue() == 0 || abstractC13647a.f56508h.f90385b.intValue() == 0) {
            return;
        }
        fz0 fz0Var = abstractC13647a.f56509i;
        if (fz0Var.f101435f == 0 || fz0Var.f101436g == 0) {
            return;
        }
        LayoutType layoutType = LayoutType.match_height;
        if (layoutType.toString().equals(abstractC13647a.f56511k)) {
            layoutType.resize(abstractC13647a);
            return;
        }
        float fIntValue = (abstractC13647a.f56509i.f101435f * 1.0f) / abstractC13647a.f56508h.f90384a.intValue();
        float fIntValue2 = abstractC13647a.f56508h.f90385b.intValue() * fIntValue;
        int i = abstractC13647a.f56509i.f101436g;
        float f = i;
        drf0<Integer> drf0Var = abstractC13647a.f56508h;
        if (fIntValue2 > f) {
            fIntValue = (i * 1.0f) / drf0Var.f90385b.intValue();
        } else {
            float fIntValue3 = (i * 1.0f) / drf0Var.f90385b.intValue();
            if (abstractC13647a.f56508h.f90384a.intValue() * fIntValue3 <= abstractC13647a.f56509i.f101435f) {
                fIntValue = Math.max(fIntValue3, fIntValue);
            }
        }
        abstractC13647a.f56507g = fIntValue;
        abstractC13647a.f56510j.f101435f = (int) (fIntValue * abstractC13647a.f56508h.f90384a.intValue());
        abstractC13647a.f56510j.f101436g = (int) (abstractC13647a.f56507g * abstractC13647a.f56508h.f90385b.intValue());
        fz0 fz0Var2 = abstractC13647a.f56510j;
        fz0 fz0Var3 = abstractC13647a.f56509i;
        fz0Var2.f101431b = ((fz0Var3.f101435f - fz0Var2.f101435f) / 2) + fz0Var3.f101431b;
        try {
            LayoutType.valueOf(abstractC13647a.f56511k).resize(abstractC13647a);
        } catch (Exception unused) {
            LayoutType.center.resize(abstractC13647a);
        }
    }
}
