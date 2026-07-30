package p153l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import p153l.vhi;

/* JADX INFO: loaded from: classes.dex */
public interface vj20<FETCH_STATE extends vhi> {

    /* JADX INFO: renamed from: l.vj20$a */
    public interface InterfaceC20847a {
        /* JADX INFO: renamed from: a */
        void mo196314a();

        /* JADX INFO: renamed from: b */
        void mo196315b(InputStream inputStream, int i) throws IOException;

        void onFailure(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    void mo186971a(FETCH_STATE fetch_state, InterfaceC20847a interfaceC20847a);

    /* JADX INFO: renamed from: b */
    boolean mo168784b(FETCH_STATE fetch_state);

    /* JADX INFO: renamed from: c */
    Map<String, String> mo168785c(FETCH_STATE fetch_state, int i);

    /* JADX INFO: renamed from: d */
    FETCH_STATE mo186972d(z06<n0f> z06Var, yk90 yk90Var);

    /* JADX INFO: renamed from: e */
    void mo168786e(FETCH_STATE fetch_state, int i);
}
