package org.eclipse.jetty.util.component;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface Dumpable {
    String dump();

    void dump(Appendable appendable, String str) throws IOException;
}
