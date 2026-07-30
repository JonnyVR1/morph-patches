package com.vivo.push.p118d;

import com.vivo.push.AbstractC14769o;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14804y;

/* JADX INFO: renamed from: com.vivo.push.d.g */
/* JADX INFO: loaded from: classes2.dex */
final class C14736g extends AbstractC14755z {
    public C14736g(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        C14795p.m86192d("OnClearCacheTask", "delete push info " + this.f61899a.getPackageName());
        C14804y.m86222b(this.f61899a).m86223a();
    }
}
