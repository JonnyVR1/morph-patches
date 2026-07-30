package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface ry3 extends Cloneable {

    /* JADX INFO: renamed from: l.ry3$a */
    public interface InterfaceC19935a {
        /* JADX INFO: renamed from: a */
        ry3 mo181341a(x1d0 x1d0Var);
    }

    void cancel();

    i5d0 execute() throws IOException;

    /* JADX INFO: renamed from: h */
    void mo135840h(w84 w84Var);

    boolean isCanceled();

    boolean isExecuted();

    x1d0 request();
}
