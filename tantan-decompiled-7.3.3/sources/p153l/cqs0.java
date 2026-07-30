package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cqs0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final dqs0 f83114a;

    public cqs0(dqs0 dqs0Var) {
        this.f83114a = dqs0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            dct0.m115296e("Fail to parse float", e);
        }
        this.f83114a.m117570c(zEquals);
        this.f83114a.m117569b(zEquals2, f);
        wit0Var.mo13706C(zEquals);
    }
}
