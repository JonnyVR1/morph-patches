package com.tencent.cloud.p080ai.network.okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p153l.wg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.j */
/* JADX INFO: loaded from: classes12.dex */
public class C13944j extends C13958x {

    /* JADX INFO: renamed from: e */
    public C13958x f57829e;

    public C13944j(C13958x c13958x) {
        if (c13958x != null) {
            this.f57829e = c13958x;
        } else {
            wg3.m206174a("delegate == null");
            throw null;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13958x
    /* JADX INFO: renamed from: a */
    public C13958x mo83134a(long j, TimeUnit timeUnit) {
        return this.f57829e.mo83134a(j, timeUnit);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13958x
    /* JADX INFO: renamed from: b */
    public C13958x mo83135b() {
        return this.f57829e.mo83135b();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13958x
    /* JADX INFO: renamed from: c */
    public long mo83136c() {
        return this.f57829e.mo83136c();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13958x
    /* JADX INFO: renamed from: d */
    public boolean mo83137d() {
        return this.f57829e.mo83137d();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13958x
    /* JADX INFO: renamed from: e */
    public void mo83138e() throws InterruptedIOException {
        this.f57829e.mo83138e();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13958x
    /* JADX INFO: renamed from: f */
    public long mo83139f() {
        return this.f57829e.mo83139f();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13958x
    /* JADX INFO: renamed from: a */
    public C13958x mo83133a(long j) {
        return this.f57829e.mo83133a(j);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13958x
    /* JADX INFO: renamed from: a */
    public C13958x mo83132a() {
        return this.f57829e.mo83132a();
    }
}
