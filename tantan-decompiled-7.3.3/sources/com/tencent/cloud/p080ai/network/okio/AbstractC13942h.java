package com.tencent.cloud.p080ai.network.okio;

import p153l.wg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.h */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC13942h implements InterfaceC13956v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13956v f57827a;

    public AbstractC13942h(InterfaceC13956v interfaceC13956v) {
        if (interfaceC13956v != null) {
            this.f57827a = interfaceC13956v;
        } else {
            wg3.m206174a("delegate == null");
            throw null;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
    public C13958x timeout() {
        return this.f57827a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f57827a.toString() + ")";
    }
}
