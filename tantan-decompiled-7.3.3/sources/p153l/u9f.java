package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface u9f extends vfj0 {

    /* JADX INFO: renamed from: l.u9f$b */
    public interface InterfaceC20528b {
        /* JADX INFO: renamed from: a */
        u9f[] mo148661a(C20527a[] c20527aArr, md2 md2Var, InterfaceC1988i.b bVar, AbstractC1857c0 abstractC1857c0);
    }

    /* JADX INFO: renamed from: a */
    boolean mo11354a(int i, long j);

    /* JADX INFO: renamed from: b */
    int mo11355b();

    /* JADX INFO: renamed from: d */
    boolean mo11357d(int i, long j);

    void disable();

    void enable();

    /* JADX INFO: renamed from: g */
    void mo11360g(long j, long j2, long j3, List<? extends crx> list, drx[] drxVarArr);

    /* JADX INFO: renamed from: i */
    int mo11362i(long j, List<? extends crx> list);

    /* JADX INFO: renamed from: j */
    int mo11363j();

    /* JADX INFO: renamed from: k */
    C1894k mo11364k();

    /* JADX INFO: renamed from: n */
    void mo11367n(float f);

    @Nullable
    /* JADX INFO: renamed from: o */
    Object mo11368o();

    /* JADX INFO: renamed from: p */
    default boolean mo11369p(long j, o45 o45Var, List<? extends crx> list) {
        return false;
    }

    /* JADX INFO: renamed from: s */
    int mo11372s();

    /* JADX INFO: renamed from: e */
    default void mo11358e() {
    }

    /* JADX INFO: renamed from: l */
    default void mo11365l() {
    }

    /* JADX INFO: renamed from: q */
    default void mo11370q(boolean z) {
    }

    /* JADX INFO: renamed from: l.u9f$a */
    public static final class C20527a {

        /* JADX INFO: renamed from: a */
        public final dfj0 f178112a;

        /* JADX INFO: renamed from: b */
        public final int[] f178113b;

        /* JADX INFO: renamed from: c */
        public final int f178114c;

        public C20527a(dfj0 dfj0Var, int[] iArr, int i) {
            if (iArr.length == 0) {
                kyv.m152146d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f178112a = dfj0Var;
            this.f178113b = iArr;
            this.f178114c = i;
        }

        public C20527a(dfj0 dfj0Var, int... iArr) {
            this(dfj0Var, iArr, 0);
        }
    }
}
