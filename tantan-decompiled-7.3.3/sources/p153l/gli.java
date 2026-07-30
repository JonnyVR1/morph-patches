package p153l;

import java.io.IOException;
import javax.servlet.ServletException;

/* JADX INFO: loaded from: classes2.dex */
public interface gli {
    void destroy();

    void doFilter(gse0 gse0Var, lse0 lse0Var, nli nliVar) throws ServletException, IOException;

    void init(sli sliVar) throws ServletException;
}
