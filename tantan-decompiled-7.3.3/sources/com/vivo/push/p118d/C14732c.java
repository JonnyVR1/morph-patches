package com.vivo.push.p118d;

import com.vivo.push.AbstractC14769o;
import com.vivo.push.AbstractRunnableC14764l;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.util.C14795p;

/* JADX INFO: renamed from: com.vivo.push.d.c */
/* JADX INFO: loaded from: classes2.dex */
final class C14732c extends AbstractRunnableC14764l {
    public C14732c(AbstractC14769o abstractC14769o) {
        super(abstractC14769o);
    }

    @Override // com.vivo.push.AbstractRunnableC14764l
    /* JADX INFO: renamed from: a */
    public final void mo85986a(AbstractC14769o abstractC14769o) {
        C14795p.m86184a(ClientConfigManagerImpl.getInstance(this.f61899a).isDebug());
    }
}
