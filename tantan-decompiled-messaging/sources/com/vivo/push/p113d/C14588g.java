package com.vivo.push.p113d;

import com.vivo.push.AbstractC14621o;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14656y;

/* JADX INFO: renamed from: com.vivo.push.d.g */
/* JADX INFO: loaded from: classes2.dex */
final class C14588g extends AbstractC14607z {
    public C14588g(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14647p.m85021d("OnClearCacheTask", "delete push info " + this.f61052a.getPackageName());
        C14656y.m85051b(this.f61052a).m85052a();
    }
}
