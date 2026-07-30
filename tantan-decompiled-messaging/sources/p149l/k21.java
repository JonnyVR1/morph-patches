package p149l;

import java.io.IOException;
import java.util.EventListener;

/* JADX INFO: loaded from: classes2.dex */
public interface k21 extends EventListener {
    void onComplete(i21 i21Var) throws IOException;

    void onError(i21 i21Var) throws IOException;

    void onStartAsync(i21 i21Var) throws IOException;

    void onTimeout(i21 i21Var) throws IOException;
}
