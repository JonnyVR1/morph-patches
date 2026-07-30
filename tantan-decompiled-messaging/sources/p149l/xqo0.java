package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, m87232d2 = {"Ll/xqo0;", "Ll/x6s;", "Ll/ho2;", "Ll/sno0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "X3", "()V", "", "isShowing", "()Z", "V3", "", "userId", "U3", "(Ljava/lang/String;)V", "W3", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xqo0 extends x6s<ho2, sno0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqo0(@NotNull bsm<?> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        Act act = bsmVar.f77095a;
        act.getClass();
        mo51532C(new sno0(act, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m210585S3(xqo0 xqo0Var, soj0 soj0Var) {
        xqo0Var.m210588V3();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m210586T3(xqo0 xqo0Var, soj0 soj0Var) {
        xqo0Var.m210588V3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: U3 */
    public final void m210587U3(@NotNull String userId) {
        userId.getClass();
        duringCreated(bno0.m102817t(m206027E2().m149814k(), "agree", userId)).subscribe(ffw.m121194e(new e30() { // from class: l.vqo0
            @Override // p149l.e30
            public final void call(Object obj) {
                xqo0.m210586T3(this.f182666a, (soj0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m210588V3() {
        C22306c<T> c22306cDuringCreated = duringCreated(bno0.m102813p());
        final sno0 sno0Var = (sno0) this.viewModel;
        c22306cDuringCreated.subscribe(ffw.m121194e(new e30() { // from class: l.wqo0
            @Override // p149l.e30
            public final void call(Object obj) {
                sno0Var.m185181V((List) obj);
            }
        }, new z2k()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: W3 */
    public final void m210589W3(@NotNull String userId) {
        userId.getClass();
        duringCreated(bno0.m102817t(m206027E2().m149814k(), "refuse", userId)).subscribe(ffw.m121194e(new e30() { // from class: l.uqo0
            @Override // p149l.e30
            public final void call(Object obj) {
                xqo0.m210585S3(this.f177762a, (soj0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: X3 */
    public final void m210590X3() {
        if (!((sno0) this.viewModel).isShowing()) {
            ((sno0) this.viewModel).m71834E();
        }
        m210588V3();
    }

    public final boolean isShowing() {
        return ((sno0) this.viewModel).isShowing();
    }
}
