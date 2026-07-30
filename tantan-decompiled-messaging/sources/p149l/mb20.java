package p149l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p149l.zei;

/* JADX INFO: loaded from: classes.dex */
public interface mb20<FETCH_STATE extends zei> {

    /* JADX INFO: renamed from: l.mb20$a */
    public interface InterfaceC18431a {
        /* JADX INFO: renamed from: a */
        void mo149197a();

        /* JADX INFO: renamed from: b */
        void mo149198b(InputStream inputStream, int i) throws IOException;

        void onFailure(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    void mo112390a(FETCH_STATE fetch_state, InterfaceC18431a interfaceC18431a);

    /* JADX INFO: renamed from: b */
    boolean mo153860b(FETCH_STATE fetch_state);

    /* JADX INFO: renamed from: c */
    Map<String, String> mo112391c(FETCH_STATE fetch_state, int i);

    /* JADX INFO: renamed from: d */
    FETCH_STATE mo112392d(uz5<jze> uz5Var, uc90 uc90Var);

    /* JADX INFO: renamed from: e */
    void mo112393e(FETCH_STATE fetch_state, int i);
}
