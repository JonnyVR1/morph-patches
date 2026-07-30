package p009l;

import com.p1.mobile.android.app.Act;
import java.util.List;
import kotlin.Metadata;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.ho2;
import l.soj0;
import l.x6s;
import l.z2k;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Ll/xqo0;", "Ll/x6s;", "Ll/ho2;", "Ll/sno0;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "X3", "()V", "", "isShowing", "()Z", "V3", "", "userId", "U3", "(Ljava/lang/String;)V", "W3", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xqo0 extends x6s<ho2, sno0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqo0(@NotNull bsm<?> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        Act act = bsmVar.a;
        act.getClass();
        C(new sno0(act, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m24961S3(xqo0 xqo0Var, soj0 soj0Var) {
        xqo0Var.m24964V3();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m24962T3(xqo0 xqo0Var, soj0 soj0Var) {
        xqo0Var.m24964V3();
    }

    /* JADX INFO: renamed from: U3 */
    public final void m24963U3(@NotNull String userId) {
        userId.getClass();
        duringCreated(bno0.m12177t(E2().k(), "agree", userId)).subscribe(ffw.e(new e30() { // from class: l.vqo0
            public final void call(Object obj) {
                xqo0.m24962T3(this.f21751a, (soj0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m24964V3() {
        c cVarDuringCreated = duringCreated(bno0.m12173p());
        final sno0 sno0Var = ((bwr) this).viewModel;
        cVarDuringCreated.subscribe(ffw.e(new e30() { // from class: l.wqo0
            public final void call(Object obj) {
                sno0Var.m22334V((List) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m24965W3(@NotNull String userId) {
        userId.getClass();
        duringCreated(bno0.m12177t(E2().k(), "refuse", userId)).subscribe(ffw.e(new e30() { // from class: l.uqo0
            public final void call(Object obj) {
                xqo0.m24961S3(this.f21314a, (soj0) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: X3 */
    public final void m24966X3() {
        if (!((bwr) this).viewModel.isShowing()) {
            ((bwr) this).viewModel.E();
        }
        m24964V3();
    }

    public final boolean isShowing() {
        return ((bwr) this).viewModel.isShowing();
    }
}
