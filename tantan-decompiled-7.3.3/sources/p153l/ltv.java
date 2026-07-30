package p153l;

import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.InterfaceC2089x;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface ltv {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final fyx f133577a = new fyx(new Object());

    /* JADX INFO: renamed from: a */
    void mo155813a();

    /* JADX INFO: renamed from: b */
    boolean mo155814b();

    @Deprecated
    /* JADX INFO: renamed from: c */
    default void m155815c(InterfaceC2089x[] interfaceC2089xArr, ffj0 ffj0Var, u9f[] u9fVarArr) {
        mo155818f(AbstractC1857c0.f7326a, f133577a, interfaceC2089xArr, ffj0Var, u9fVarArr);
    }

    /* JADX INFO: renamed from: d */
    void mo155816d();

    /* JADX INFO: renamed from: e */
    boolean mo155817e(long j, long j2, float f);

    /* JADX INFO: renamed from: f */
    default void mo155818f(AbstractC1857c0 abstractC1857c0, fyx fyxVar, InterfaceC2089x[] interfaceC2089xArr, ffj0 ffj0Var, u9f[] u9fVarArr) {
        m155815c(interfaceC2089xArr, ffj0Var, u9fVarArr);
    }

    /* JADX INFO: renamed from: g */
    long mo155819g();

    @Deprecated
    /* JADX INFO: renamed from: h */
    default boolean m155820h(long j, float f, boolean z, long j2) {
        return mo155823k(AbstractC1857c0.f7326a, f133577a, j, f, z, j2);
    }

    /* JADX INFO: renamed from: i */
    oj0 mo155821i();

    /* JADX INFO: renamed from: j */
    void mo155822j();

    /* JADX INFO: renamed from: k */
    default boolean mo155823k(AbstractC1857c0 abstractC1857c0, fyx fyxVar, long j, float f, boolean z, long j2) {
        return m155820h(j, f, z, j2);
    }
}
