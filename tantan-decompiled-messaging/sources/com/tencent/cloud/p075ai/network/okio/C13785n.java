package com.tencent.cloud.p075ai.network.okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import p149l.ig3;
import p149l.rhg0;
import p149l.y3g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.n */
/* JADX INFO: loaded from: classes13.dex */
public final class C13785n {

    /* JADX INFO: renamed from: a */
    public static final Logger f56993a = Logger.getLogger(C13785n.class.getName());

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.n$a */
    public class a implements InterfaceC13794w {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C13795x f56994a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InputStream f56995b;

        public a(C13795x c13795x, InputStream inputStream) {
            this.f56994a = c13795x;
            this.f56995b = inputStream;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        /* JADX INFO: renamed from: a */
        public long mo81631a(C13776e c13776e, long j) {
            if (j < 0) {
                y3g0.m212802a("byteCount < 0: ", j);
                return 0L;
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.f56994a.mo81955e();
                C13790s c13790sM81925d = c13776e.m81925d(1);
                int i = this.f56995b.read(c13790sM81925d.f57005a, c13790sM81925d.f57007c, (int) Math.min(j, 8192 - c13790sM81925d.f57007c));
                if (i == -1) {
                    return -1L;
                }
                c13790sM81925d.f57007c += i;
                long j2 = i;
                c13776e.f56970b += j2;
                return j2;
            } catch (AssertionError e) {
                if (C13785n.m81965a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f56995b.close();
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        public C13795x timeout() {
            return this.f56994a;
        }

        public String toString() {
            return "source(" + this.f56995b + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13793v m81962a(Socket socket) throws IOException {
        if (socket == null) {
            ig3.m135964a("socket == null");
            return null;
        }
        if (socket.getOutputStream() == null) {
            rhg0.m179353a("socket's output stream == null");
            return null;
        }
        C13786o c13786o = new C13786o(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new C13772a(c13786o, new C13784m(c13786o, outputStream));
        }
        ig3.m135964a("out == null");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC13794w m81966b(Socket socket) throws IOException {
        if (socket == null) {
            ig3.m135964a("socket == null");
            return null;
        }
        if (socket.getInputStream() != null) {
            C13786o c13786o = new C13786o(socket);
            return new C13773b(c13786o, m81964a(socket.getInputStream(), c13786o));
        }
        rhg0.m179353a("socket's input stream == null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13777f m81960a(InterfaceC13793v interfaceC13793v) {
        return new C13788q(interfaceC13793v);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13778g m81961a(InterfaceC13794w interfaceC13794w) {
        return new C13789r(interfaceC13794w);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13794w m81964a(InputStream inputStream, C13795x c13795x) {
        if (inputStream != null) {
            return new a(c13795x, inputStream);
        }
        ig3.m135964a("in == null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13794w m81963a(File file) {
        if (file != null) {
            return m81964a(new FileInputStream(file), new C13795x());
        }
        ig3.m135964a("file == null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81965a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
