package p153l;

import java.io.IOException;
import java.util.EventListener;

/* JADX INFO: loaded from: classes2.dex */
public interface r21 extends EventListener {
    void onComplete(p21 p21Var) throws IOException;

    void onError(p21 p21Var) throws IOException;

    void onStartAsync(p21 p21Var) throws IOException;

    void onTimeout(p21 p21Var) throws IOException;
}
