package com.tencent.cloud.p075ai.network.okio;

import p149l.ig3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.i */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC13780i implements InterfaceC13794w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13794w f56980a;

    public AbstractC13780i(InterfaceC13794w interfaceC13794w) {
        if (interfaceC13794w != null) {
            this.f56980a = interfaceC13794w;
        } else {
            ig3.m135964a("delegate == null");
            throw null;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    public C13795x timeout() {
        return this.f56980a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f56980a.toString() + ")";
    }
}
