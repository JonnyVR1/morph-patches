package com.tencent.cloud.p080ai.network.okio;

import p153l.wg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.i */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC13943i implements InterfaceC13957w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13957w f57828a;

    public AbstractC13943i(InterfaceC13957w interfaceC13957w) {
        if (interfaceC13957w != null) {
            this.f57828a = interfaceC13957w;
        } else {
            wg3.m206174a("delegate == null");
            throw null;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    public C13958x timeout() {
        return this.f57828a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f57828a.toString() + ")";
    }
}
