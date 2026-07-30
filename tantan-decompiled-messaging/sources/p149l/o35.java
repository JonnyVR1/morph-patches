package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface o35 {

    /* JADX INFO: renamed from: l.o35$a */
    public interface InterfaceC18829a {
        @Nullable
        /* JADX INFO: renamed from: a */
        o35 mo162410a(int i, C1871k c1871k, boolean z, List<C1871k> list, @Nullable m6j0 m6j0Var, v680 v680Var);
    }

    /* JADX INFO: renamed from: l.o35$b */
    public interface InterfaceC18830b {
        /* JADX INFO: renamed from: b */
        m6j0 mo160443b(int i, int i2);
    }

    /* JADX INFO: renamed from: a */
    boolean mo162406a(tqf tqfVar) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo162407c(@Nullable InterfaceC18830b interfaceC18830b, long j, long j2);

    @Nullable
    /* JADX INFO: renamed from: d */
    q35 mo162408d();

    @Nullable
    /* JADX INFO: renamed from: e */
    C1871k[] mo162409e();

    void release();
}
