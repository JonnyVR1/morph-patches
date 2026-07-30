package p149l;

import java.io.IOException;
import javax.servlet.ServletException;

/* JADX INFO: loaded from: classes2.dex */
public interface jii {
    void destroy();

    void doFilter(bke0 bke0Var, gke0 gke0Var, qii qiiVar) throws ServletException, IOException;

    void init(vii viiVar) throws ServletException;
}
