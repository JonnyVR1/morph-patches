package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2047a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface a5c extends w4c {

    /* JADX INFO: renamed from: l.a5c$a */
    public interface InterfaceC15531a {
        /* JADX INFO: renamed from: a */
        a5c mo95019a();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Uri mo11121a();

    /* JADX INFO: renamed from: b */
    default Map<String, List<String>> mo11122b() {
        return Collections.EMPTY_MAP;
    }

    void close() throws IOException;

    /* JADX INFO: renamed from: e */
    void mo11123e(l7j0 l7j0Var);

    /* JADX INFO: renamed from: n */
    long mo11125n(C2047a c2047a) throws IOException;
}
