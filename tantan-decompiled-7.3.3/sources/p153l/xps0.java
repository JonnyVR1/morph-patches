package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xps0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            wit0Var.mo13736d0();
        } else if ("resume".equals(str)) {
            wit0Var.mo13756o0();
        }
    }
}
