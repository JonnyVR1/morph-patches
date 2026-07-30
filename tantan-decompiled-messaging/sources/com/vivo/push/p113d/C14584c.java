package com.vivo.push.p113d;

import com.vivo.push.AbstractC14621o;
import com.vivo.push.AbstractRunnableC14616l;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.util.C14647p;

/* JADX INFO: renamed from: com.vivo.push.d.c */
/* JADX INFO: loaded from: classes2.dex */
final class C14584c extends AbstractRunnableC14616l {
    public C14584c(AbstractC14621o abstractC14621o) {
        super(abstractC14621o);
    }

    @Override // com.vivo.push.AbstractRunnableC14616l
    /* JADX INFO: renamed from: a */
    public final void mo84815a(AbstractC14621o abstractC14621o) {
        C14647p.m85013a(ClientConfigManagerImpl.getInstance(this.f61052a).isDebug());
    }
}
