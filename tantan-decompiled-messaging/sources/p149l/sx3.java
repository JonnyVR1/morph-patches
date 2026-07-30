package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface sx3 extends Cloneable {

    /* JADX INFO: renamed from: l.sx3$a */
    public interface InterfaceC20060a {
        /* JADX INFO: renamed from: a */
        sx3 mo144849a(stc0 stc0Var);
    }

    void cancel();

    exc0 execute() throws IOException;

    /* JADX INFO: renamed from: h */
    void mo96077h(x74 x74Var);

    boolean isCanceled();

    boolean isExecuted();

    stc0 request();
}
