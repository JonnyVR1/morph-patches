package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface o8f extends r6j0 {

    /* JADX INFO: renamed from: l.o8f$b */
    public interface InterfaceC18874b {
        /* JADX INFO: renamed from: a */
        o8f[] mo163103a(C18873a[] c18873aArr, fd2 fd2Var, InterfaceC1965i.b bVar, AbstractC1834c0 abstractC1834c0);
    }

    /* JADX INFO: renamed from: a */
    boolean mo11300a(int i, long j);

    /* JADX INFO: renamed from: b */
    int mo11301b();

    /* JADX INFO: renamed from: d */
    boolean mo11303d(int i, long j);

    void disable();

    void enable();

    /* JADX INFO: renamed from: g */
    void mo11306g(long j, long j2, long j3, List<? extends fix> list, gix[] gixVarArr);

    /* JADX INFO: renamed from: i */
    int mo11308i(long j, List<? extends fix> list);

    /* JADX INFO: renamed from: j */
    int mo11309j();

    /* JADX INFO: renamed from: k */
    C1871k mo11310k();

    /* JADX INFO: renamed from: n */
    void mo11313n(float f);

    @Nullable
    /* JADX INFO: renamed from: o */
    Object mo11314o();

    /* JADX INFO: renamed from: p */
    default boolean mo11315p(long j, n35 n35Var, List<? extends fix> list) {
        return false;
    }

    /* JADX INFO: renamed from: s */
    int mo11318s();

    /* JADX INFO: renamed from: e */
    default void mo11304e() {
    }

    /* JADX INFO: renamed from: l */
    default void mo11311l() {
    }

    /* JADX INFO: renamed from: q */
    default void mo11316q(boolean z) {
    }

    /* JADX INFO: renamed from: l.o8f$a */
    public static final class C18873a {

        /* JADX INFO: renamed from: a */
        public final z5j0 f142622a;

        /* JADX INFO: renamed from: b */
        public final int[] f142623b;

        /* JADX INFO: renamed from: c */
        public final int f142624c;

        public C18873a(z5j0 z5j0Var, int[] iArr, int i) {
            if (iArr.length == 0) {
                jwv.m143684d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f142622a = z5j0Var;
            this.f142623b = iArr;
            this.f142624c = i;
        }

        public C18873a(z5j0 z5j0Var, int... iArr) {
            this(z5j0Var, iArr, 0);
        }
    }
}
