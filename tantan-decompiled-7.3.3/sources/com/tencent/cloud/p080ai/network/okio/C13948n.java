package com.tencent.cloud.p080ai.network.okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import p153l.fcg0;
import p153l.wg3;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.n */
/* JADX INFO: loaded from: classes12.dex */
public final class C13948n {

    /* JADX INFO: renamed from: a */
    public static final Logger f57841a = Logger.getLogger(C13948n.class.getName());

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.n$a */
    public class a implements InterfaceC13957w {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C13958x f57842a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InputStream f57843b;

        public a(C13958x c13958x, InputStream inputStream) {
            this.f57842a = c13958x;
            this.f57843b = inputStream;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        /* JADX INFO: renamed from: a */
        public long mo82814a(C13939e c13939e, long j) {
            if (j < 0) {
                fcg0.m125008a("byteCount < 0: ", j);
                return 0L;
            }
            if (j == 0) {
                return 0L;
            }
            try {
                this.f57842a.mo83138e();
                C13953s c13953sM83108d = c13939e.m83108d(1);
                int i = this.f57843b.read(c13953sM83108d.f57853a, c13953sM83108d.f57855c, (int) Math.min(j, 8192 - c13953sM83108d.f57855c));
                if (i == -1) {
                    return -1L;
                }
                c13953sM83108d.f57855c += i;
                long j2 = i;
                c13939e.f57818b += j2;
                return j2;
            } catch (AssertionError e) {
                if (C13948n.m83148a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f57843b.close();
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        public C13958x timeout() {
            return this.f57842a;
        }

        public String toString() {
            return "source(" + this.f57843b + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13956v m83145a(Socket socket) throws IOException {
        if (socket == null) {
            wg3.m206174a("socket == null");
            return null;
        }
        if (socket.getOutputStream() == null) {
            zpg0.m220844a("socket's output stream == null");
            return null;
        }
        C13949o c13949o = new C13949o(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new C13935a(c13949o, new C13947m(c13949o, outputStream));
        }
        wg3.m206174a("out == null");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC13957w m83149b(Socket socket) throws IOException {
        if (socket == null) {
            wg3.m206174a("socket == null");
            return null;
        }
        if (socket.getInputStream() != null) {
            C13949o c13949o = new C13949o(socket);
            return new C13936b(c13949o, m83147a(socket.getInputStream(), c13949o));
        }
        zpg0.m220844a("socket's input stream == null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13940f m83143a(InterfaceC13956v interfaceC13956v) {
        return new C13951q(interfaceC13956v);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13941g m83144a(InterfaceC13957w interfaceC13957w) {
        return new C13952r(interfaceC13957w);
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13957w m83147a(InputStream inputStream, C13958x c13958x) {
        if (inputStream != null) {
            return new a(c13958x, inputStream);
        }
        wg3.m206174a("in == null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13957w m83146a(File file) {
        if (file != null) {
            return m83147a(new FileInputStream(file), new C13958x());
        }
        wg3.m206174a("file == null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83148a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
