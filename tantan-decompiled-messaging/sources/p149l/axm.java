package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface axm {

    /* JADX INFO: renamed from: l.axm$a */
    public interface InterfaceC15754a {
        /* JADX INFO: renamed from: a */
        exc0 mo99454a(stc0 stc0Var) throws IOException;

        int connectTimeoutMillis();

        wv5 connection();

        int readTimeoutMillis();

        stc0 request();

        int writeTimeoutMillis();
    }

    exc0 intercept(InterfaceC15754a interfaceC15754a) throws IOException;
}
