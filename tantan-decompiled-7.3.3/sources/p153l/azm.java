package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface azm {

    /* JADX INFO: renamed from: l.azm$a */
    public interface InterfaceC15867a {
        /* JADX INFO: renamed from: a */
        i5d0 mo101076a(x1d0 x1d0Var) throws IOException;

        int connectTimeoutMillis();

        bx5 connection();

        int readTimeoutMillis();

        x1d0 request();

        int writeTimeoutMillis();
    }

    i5d0 intercept(InterfaceC15867a interfaceC15867a) throws IOException;
}
