package com.tencent.cloud.p080ai.network.okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p153l.fcg0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.x */
/* JADX INFO: loaded from: classes12.dex */
public class C13958x {

    /* JADX INFO: renamed from: d */
    public static final C13958x f57864d = new a();

    /* JADX INFO: renamed from: a */
    public boolean f57865a;

    /* JADX INFO: renamed from: b */
    public long f57866b;

    /* JADX INFO: renamed from: c */
    public long f57867c;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.x$a */
    public class a extends C13958x {
        @Override // com.tencent.cloud.p080ai.network.okio.C13958x
        /* JADX INFO: renamed from: a */
        public C13958x mo83133a(long j) {
            return this;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.C13958x
        /* JADX INFO: renamed from: e */
        public void mo83138e() {
        }

        @Override // com.tencent.cloud.p080ai.network.okio.C13958x
        /* JADX INFO: renamed from: a */
        public C13958x mo83134a(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public C13958x mo83134a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            fcg0.m125008a("timeout < 0: ", j);
            return null;
        }
        if (timeUnit != null) {
            this.f57867c = timeUnit.toNanos(j);
            return this;
        }
        wg3.m206174a("unit == null");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C13958x mo83135b() {
        this.f57867c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo83136c() {
        if (this.f57865a) {
            return this.f57866b;
        }
        wtq0.m207906a("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo83137d() {
        return this.f57865a;
    }

    /* JADX INFO: renamed from: e */
    public void mo83138e() throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f57865a && this.f57866b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: f */
    public long mo83139f() {
        return this.f57867c;
    }

    /* JADX INFO: renamed from: a */
    public C13958x mo83133a(long j) {
        this.f57865a = true;
        this.f57866b = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13958x mo83132a() {
        this.f57865a = false;
        return this;
    }
}
