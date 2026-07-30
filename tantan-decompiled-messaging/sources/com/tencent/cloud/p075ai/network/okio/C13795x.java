package com.tencent.cloud.p075ai.network.okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p149l.ig3;
import p149l.qkq0;
import p149l.y3g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.x */
/* JADX INFO: loaded from: classes13.dex */
public class C13795x {

    /* JADX INFO: renamed from: d */
    public static final C13795x f57016d = new a();

    /* JADX INFO: renamed from: a */
    public boolean f57017a;

    /* JADX INFO: renamed from: b */
    public long f57018b;

    /* JADX INFO: renamed from: c */
    public long f57019c;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.x$a */
    public class a extends C13795x {
        @Override // com.tencent.cloud.p075ai.network.okio.C13795x
        /* JADX INFO: renamed from: a */
        public C13795x mo81950a(long j) {
            return this;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.C13795x
        /* JADX INFO: renamed from: e */
        public void mo81955e() {
        }

        @Override // com.tencent.cloud.p075ai.network.okio.C13795x
        /* JADX INFO: renamed from: a */
        public C13795x mo81951a(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13795x mo81951a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            y3g0.m212802a("timeout < 0: ", j);
            return null;
        }
        if (timeUnit != null) {
            this.f57019c = timeUnit.toNanos(j);
            return this;
        }
        ig3.m135964a("unit == null");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C13795x mo81952b() {
        this.f57019c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo81953c() {
        if (this.f57017a) {
            return this.f57018b;
        }
        qkq0.m175383a("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo81954d() {
        return this.f57017a;
    }

    /* JADX INFO: renamed from: e */
    public void mo81955e() throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f57017a && this.f57018b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: f */
    public long mo81956f() {
        return this.f57019c;
    }

    /* JADX INFO: renamed from: a */
    public C13795x mo81950a(long j) {
        this.f57017a = true;
        this.f57018b = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13795x mo81949a() {
        this.f57017a = false;
        return this;
    }
}
