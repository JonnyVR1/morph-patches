package com.tencent.cloud.p080ai.network.okio;

import java.nio.ByteBuffer;
import p153l.mnd0;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.q */
/* JADX INFO: loaded from: classes12.dex */
public final class C13951q implements InterfaceC13940f {

    /* JADX INFO: renamed from: a */
    public final C13939e f57846a = new C13939e();

    /* JADX INFO: renamed from: b */
    public final InterfaceC13956v f57847b;

    /* JADX INFO: renamed from: c */
    public boolean f57848c;

    public C13951q(InterfaceC13956v interfaceC13956v) {
        if (interfaceC13956v != null) {
            this.f57847b = interfaceC13956v;
        } else {
            mnd0.m159157a("sink == null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public long m83150a(InterfaceC13957w interfaceC13957w) {
        long j = 0;
        while (true) {
            long jMo82814a = ((C13948n.a) interfaceC13957w).mo82814a(this.f57846a, 8192L);
            if (jMo82814a == -1) {
                return j;
            }
            j += jMo82814a;
            mo83115f();
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: b */
    public InterfaceC13940f mo83102b(int i) {
        if (this.f57848c) {
            wtq0.m207906a("closed");
            return null;
        }
        this.f57846a.mo83102b(i);
        return mo83115f();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: c */
    public InterfaceC13940f mo83106c(int i) {
        if (this.f57848c) {
            wtq0.m207906a("closed");
            return null;
        }
        this.f57846a.mo83106c(i);
        return mo83115f();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f57848c) {
            return;
        }
        C13939e c13939e = this.f57846a;
        long j = c13939e.f57818b;
        if (j > 0) {
            this.f57847b.write(c13939e, j);
        }
        th = null;
        try {
            this.f57847b.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f57848c = true;
        if (th == null) {
            return;
        }
        C13959y.m83165a(th);
        throw null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: e */
    public InterfaceC13940f mo83112e(long j) {
        if (this.f57848c) {
            wtq0.m207906a("closed");
            return null;
        }
        this.f57846a.mo83112e(j);
        return mo83115f();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: f */
    public InterfaceC13940f mo83115f() {
        if (this.f57848c) {
            wtq0.m207906a("closed");
            return null;
        }
        long jM83128l = this.f57846a.m83128l();
        if (jM83128l > 0) {
            this.f57847b.write(this.f57846a, jM83128l);
        }
        return this;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f, com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Flushable
    public void flush() {
        if (this.f57848c) {
            wtq0.m207906a("closed");
            return;
        }
        C13939e c13939e = this.f57846a;
        long j = c13939e.f57818b;
        if (j > 0) {
            this.f57847b.write(c13939e, j);
        }
        this.f57847b.flush();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: i */
    public InterfaceC13940f mo83123i() {
        if (this.f57848c) {
            wtq0.m207906a("closed");
            return null;
        }
        C13939e c13939e = this.f57846a;
        long j = c13939e.f57818b;
        if (j > 0) {
            this.f57847b.write(c13939e, j);
        }
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f57848c;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
    public C13958x timeout() {
        return this.f57847b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f57847b + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (this.f57848c) {
            wtq0.m207906a("closed");
            return 0;
        }
        int iWrite = this.f57846a.write(byteBuffer);
        mo83115f();
        return iWrite;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
    public void write(C13939e c13939e, long j) {
        if (!this.f57848c) {
            this.f57846a.write(c13939e, j);
            mo83115f();
        } else {
            wtq0.m207906a("closed");
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13940f m83151a(ByteString byteString) {
        if (!this.f57848c) {
            this.f57846a.m83098b(byteString);
            return mo83115f();
        }
        wtq0.m207906a("closed");
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: a */
    public InterfaceC13940f mo83092a(String str) {
        if (!this.f57848c) {
            this.f57846a.mo83092a(str);
            return mo83115f();
        }
        wtq0.m207906a("closed");
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: a */
    public InterfaceC13940f mo83093a(byte[] bArr) {
        if (!this.f57848c) {
            this.f57846a.mo83093a(bArr);
            return mo83115f();
        }
        wtq0.m207906a("closed");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13940f m83152a(byte[] bArr, int i, int i2) {
        if (!this.f57848c) {
            this.f57846a.m83101b(bArr, i, i2);
            return mo83115f();
        }
        wtq0.m207906a("closed");
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: a */
    public C13939e mo83087a() {
        return this.f57846a;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13940f
    /* JADX INFO: renamed from: a */
    public InterfaceC13940f mo83091a(int i) {
        if (!this.f57848c) {
            this.f57846a.mo83091a(i);
            return mo83115f();
        }
        wtq0.m207906a("closed");
        return null;
    }
}
