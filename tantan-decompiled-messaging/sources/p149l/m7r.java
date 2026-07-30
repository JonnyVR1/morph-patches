package p149l;

import com.sunshine.engine.base.AbstractC13484a;
import com.sunshine.engine.base.LayoutType;

/* JADX INFO: loaded from: classes13.dex */
public class m7r {
    /* JADX INFO: renamed from: a */
    public static void m153385a(AbstractC13484a abstractC13484a) {
        if (abstractC13484a == null || abstractC13484a.f55660h.f176651a.intValue() == 0 || abstractC13484a.f55660h.f176652b.intValue() == 0) {
            return;
        }
        yy0 yy0Var = abstractC13484a.f55661i;
        if (yy0Var.f200689f == 0 || yy0Var.f200690g == 0) {
            return;
        }
        LayoutType layoutType = LayoutType.match_height;
        if (layoutType.toString().equals(abstractC13484a.f55663k)) {
            layoutType.resize(abstractC13484a);
            return;
        }
        float fIntValue = (abstractC13484a.f55661i.f200689f * 1.0f) / abstractC13484a.f55660h.f176651a.intValue();
        float fIntValue2 = abstractC13484a.f55660h.f176652b.intValue() * fIntValue;
        int i = abstractC13484a.f55661i.f200690g;
        float f = i;
        uif0<Integer> uif0Var = abstractC13484a.f55660h;
        if (fIntValue2 > f) {
            fIntValue = (i * 1.0f) / uif0Var.f176652b.intValue();
        } else {
            float fIntValue3 = (i * 1.0f) / uif0Var.f176652b.intValue();
            if (abstractC13484a.f55660h.f176651a.intValue() * fIntValue3 <= abstractC13484a.f55661i.f200689f) {
                fIntValue = Math.max(fIntValue3, fIntValue);
            }
        }
        abstractC13484a.f55659g = fIntValue;
        abstractC13484a.f55662j.f200689f = (int) (fIntValue * abstractC13484a.f55660h.f176651a.intValue());
        abstractC13484a.f55662j.f200690g = (int) (abstractC13484a.f55659g * abstractC13484a.f55660h.f176652b.intValue());
        yy0 yy0Var2 = abstractC13484a.f55662j;
        yy0 yy0Var3 = abstractC13484a.f55661i;
        yy0Var2.f200685b = ((yy0Var3.f200689f - yy0Var2.f200689f) / 2) + yy0Var3.f200685b;
        try {
            LayoutType.valueOf(abstractC13484a.f55663k).resize(abstractC13484a);
        } catch (Exception unused) {
            LayoutType.center.resize(abstractC13484a);
        }
    }
}
