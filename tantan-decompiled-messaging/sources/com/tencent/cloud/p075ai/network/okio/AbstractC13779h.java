package com.tencent.cloud.p075ai.network.okio;

import p149l.ig3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.h */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC13779h implements InterfaceC13793v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13793v f56979a;

    public AbstractC13779h(InterfaceC13793v interfaceC13793v) {
        if (interfaceC13793v != null) {
            this.f56979a = interfaceC13793v;
        } else {
            ig3.m135964a("delegate == null");
            throw null;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
    public C13795x timeout() {
        return this.f56979a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f56979a.toString() + ")";
    }
}
