package p149l;

import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.InterfaceC2066x;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface krv {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final ipx f124398a = new ipx(new Object());

    /* JADX INFO: renamed from: a */
    void mo147017a();

    /* JADX INFO: renamed from: b */
    boolean mo147018b();

    @Deprecated
    /* JADX INFO: renamed from: c */
    default void m147019c(InterfaceC2066x[] interfaceC2066xArr, b6j0 b6j0Var, o8f[] o8fVarArr) {
        mo147022f(AbstractC1834c0.f7289a, f124398a, interfaceC2066xArr, b6j0Var, o8fVarArr);
    }

    /* JADX INFO: renamed from: d */
    void mo147020d();

    /* JADX INFO: renamed from: e */
    boolean mo147021e(long j, long j2, float f);

    /* JADX INFO: renamed from: f */
    default void mo147022f(AbstractC1834c0 abstractC1834c0, ipx ipxVar, InterfaceC2066x[] interfaceC2066xArr, b6j0 b6j0Var, o8f[] o8fVarArr) {
        m147019c(interfaceC2066xArr, b6j0Var, o8fVarArr);
    }

    /* JADX INFO: renamed from: g */
    long mo147023g();

    @Deprecated
    /* JADX INFO: renamed from: h */
    default boolean m147024h(long j, float f, boolean z, long j2) {
        return mo147027k(AbstractC1834c0.f7289a, f124398a, j, f, z, j2);
    }

    /* JADX INFO: renamed from: i */
    sj0 mo147025i();

    /* JADX INFO: renamed from: j */
    void mo147026j();

    /* JADX INFO: renamed from: k */
    default boolean mo147027k(AbstractC1834c0 abstractC1834c0, ipx ipxVar, long j, float f, boolean z, long j2) {
        return m147024h(j, f, z, j2);
    }
}
