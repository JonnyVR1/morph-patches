package com.tencent.cloud.p075ai.network.okio;

import java.nio.ByteBuffer;
import p149l.jfd0;
import p149l.qkq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.q */
/* JADX INFO: loaded from: classes13.dex */
public final class C13788q implements InterfaceC13777f {

    /* JADX INFO: renamed from: a */
    public final C13776e f56998a = new C13776e();

    /* JADX INFO: renamed from: b */
    public final InterfaceC13793v f56999b;

    /* JADX INFO: renamed from: c */
    public boolean f57000c;

    public C13788q(InterfaceC13793v interfaceC13793v) {
        if (interfaceC13793v != null) {
            this.f56999b = interfaceC13793v;
        } else {
            jfd0.m141176a("sink == null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public long m81967a(InterfaceC13794w interfaceC13794w) {
        long j = 0;
        while (true) {
            long jMo81631a = ((C13785n.a) interfaceC13794w).mo81631a(this.f56998a, 8192L);
            if (jMo81631a == -1) {
                return j;
            }
            j += jMo81631a;
            mo81932f();
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: b */
    public InterfaceC13777f mo81919b(int i) {
        if (this.f57000c) {
            qkq0.m175383a("closed");
            return null;
        }
        this.f56998a.mo81919b(i);
        return mo81932f();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: c */
    public InterfaceC13777f mo81923c(int i) {
        if (this.f57000c) {
            qkq0.m175383a("closed");
            return null;
        }
        this.f56998a.mo81923c(i);
        return mo81932f();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f57000c) {
            return;
        }
        C13776e c13776e = this.f56998a;
        long j = c13776e.f56970b;
        if (j > 0) {
            this.f56999b.write(c13776e, j);
        }
        th = null;
        try {
            this.f56999b.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f57000c = true;
        if (th == null) {
            return;
        }
        C13796y.m81982a(th);
        throw null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: e */
    public InterfaceC13777f mo81929e(long j) {
        if (this.f57000c) {
            qkq0.m175383a("closed");
            return null;
        }
        this.f56998a.mo81929e(j);
        return mo81932f();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: f */
    public InterfaceC13777f mo81932f() {
        if (this.f57000c) {
            qkq0.m175383a("closed");
            return null;
        }
        long jM81945l = this.f56998a.m81945l();
        if (jM81945l > 0) {
            this.f56999b.write(this.f56998a, jM81945l);
        }
        return this;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f, com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Flushable
    public void flush() {
        if (this.f57000c) {
            qkq0.m175383a("closed");
            return;
        }
        C13776e c13776e = this.f56998a;
        long j = c13776e.f56970b;
        if (j > 0) {
            this.f56999b.write(c13776e, j);
        }
        this.f56999b.flush();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: i */
    public InterfaceC13777f mo81940i() {
        if (this.f57000c) {
            qkq0.m175383a("closed");
            return null;
        }
        C13776e c13776e = this.f56998a;
        long j = c13776e.f56970b;
        if (j > 0) {
            this.f56999b.write(c13776e, j);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f57000c;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
    public C13795x timeout() {
        return this.f56999b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f56999b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (this.f57000c) {
            qkq0.m175383a("closed");
            return 0;
        }
        int iWrite = this.f56998a.write(byteBuffer);
        mo81932f();
        return iWrite;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
    public void write(C13776e c13776e, long j) {
        if (!this.f57000c) {
            this.f56998a.write(c13776e, j);
            mo81932f();
        } else {
            qkq0.m175383a("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13777f m81968a(ByteString byteString) {
        if (!this.f57000c) {
            this.f56998a.m81915b(byteString);
            return mo81932f();
        }
        qkq0.m175383a("closed");
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: a */
    public InterfaceC13777f mo81909a(String str) {
        if (!this.f57000c) {
            this.f56998a.mo81909a(str);
            return mo81932f();
        }
        qkq0.m175383a("closed");
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: a */
    public InterfaceC13777f mo81910a(byte[] bArr) {
        if (!this.f57000c) {
            this.f56998a.mo81910a(bArr);
            return mo81932f();
        }
        qkq0.m175383a("closed");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13777f m81969a(byte[] bArr, int i, int i2) {
        if (!this.f57000c) {
            this.f56998a.m81918b(bArr, i, i2);
            return mo81932f();
        }
        qkq0.m175383a("closed");
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: a */
    public C13776e mo81904a() {
        return this.f56998a;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13777f
    /* JADX INFO: renamed from: a */
    public InterfaceC13777f mo81908a(int i) {
        if (!this.f57000c) {
            this.f56998a.mo81908a(i);
            return mo81932f();
        }
        qkq0.m175383a("closed");
        return null;
    }
}
