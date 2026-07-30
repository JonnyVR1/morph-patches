package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class ezv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f96629a;

    /* JADX INFO: renamed from: b */
    public final String f96630b;

    /* JADX INFO: renamed from: c */
    public final jat0 f96631c;

    public ezv0(jat0 jat0Var, xvw0 xvw0Var, String str) {
        this.f96631c = jat0Var;
        this.f96629a = xvw0Var;
        this.f96630b = str;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 47;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        final hpr hprVarM173981h = pvw0.m173981h(null);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168101P5)).booleanValue()) {
            hprVarM173981h = pvw0.m173981h(null);
        }
        final hpr hprVarM173981h2 = pvw0.m173981h(null);
        return pvw0.m173976c(hprVarM173981h, hprVarM173981h2).m169489a(new Callable() { // from class: l.dzv0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new fzv0((String) hprVarM173981h.get(), (String) hprVarM173981h2.get());
            }
        }, oct0.f146733a);
    }
}
