package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2070a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface g6c extends e6c {

    /* JADX INFO: renamed from: l.g6c$a */
    public interface InterfaceC17163a {
        /* JADX INFO: renamed from: a */
        g6c mo129219a();
    }

    /* JADX INFO: renamed from: a */
    default Map<String, List<String>> mo11175a() {
        return Collections.EMPTY_MAP;
    }

    void close() throws IOException;

    @Nullable
    /* JADX INFO: renamed from: d */
    Uri mo11176d();

    /* JADX INFO: renamed from: e */
    void mo11177e(pgj0 pgj0Var);

    /* JADX INFO: renamed from: n */
    long mo11179n(C2070a c2070a) throws IOException;
}
