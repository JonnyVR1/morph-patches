package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface p45 {

    /* JADX INFO: renamed from: l.p45$a */
    public interface InterfaceC19291a {
        @Nullable
        /* JADX INFO: renamed from: a */
        p45 mo116023a(int i, C1894k c1894k, boolean z, List<C1894k> list, @Nullable qfj0 qfj0Var, bf80 bf80Var);
    }

    /* JADX INFO: renamed from: l.p45$b */
    public interface InterfaceC19292b {
        /* JADX INFO: renamed from: b */
        qfj0 mo121890b(int i, int i2);
    }

    /* JADX INFO: renamed from: a */
    boolean mo120970a(asf asfVar) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo120971c(@Nullable InterfaceC19292b interfaceC19292b, long j, long j2);

    @Nullable
    /* JADX INFO: renamed from: d */
    r45 mo120972d();

    @Nullable
    /* JADX INFO: renamed from: e */
    C1894k[] mo120973e();

    void release();
}
