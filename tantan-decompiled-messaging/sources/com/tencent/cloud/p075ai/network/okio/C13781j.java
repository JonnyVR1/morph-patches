package com.tencent.cloud.p075ai.network.okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p149l.ig3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.j */
/* JADX INFO: loaded from: classes13.dex */
public class C13781j extends C13795x {

    /* JADX INFO: renamed from: e */
    public C13795x f56981e;

    public C13781j(C13795x c13795x) {
        if (c13795x != null) {
            this.f56981e = c13795x;
        } else {
            ig3.m135964a("delegate == null");
            throw null;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13795x
    /* JADX INFO: renamed from: a */
    public C13795x mo81951a(long j, TimeUnit timeUnit) {
        return this.f56981e.mo81951a(j, timeUnit);
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13795x
    /* JADX INFO: renamed from: b */
    public C13795x mo81952b() {
        return this.f56981e.mo81952b();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13795x
    /* JADX INFO: renamed from: c */
    public long mo81953c() {
        return this.f56981e.mo81953c();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13795x
    /* JADX INFO: renamed from: d */
    public boolean mo81954d() {
        return this.f56981e.mo81954d();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13795x
    /* JADX INFO: renamed from: e */
    public void mo81955e() throws InterruptedIOException {
        this.f56981e.mo81955e();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13795x
    /* JADX INFO: renamed from: f */
    public long mo81956f() {
        return this.f56981e.mo81956f();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13795x
    /* JADX INFO: renamed from: a */
    public C13795x mo81950a(long j) {
        return this.f56981e.mo81950a(j);
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13795x
    /* JADX INFO: renamed from: a */
    public C13795x mo81949a() {
        return this.f56981e.mo81949a();
    }
}
