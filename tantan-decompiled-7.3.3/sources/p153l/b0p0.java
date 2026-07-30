package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, m88121d2 = {"Ll/b0p0;", "Ll/y8s;", "Ll/oo2;", "Ll/wwo0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "X3", "()V", "", "isShowing", "()Z", "V3", "", "userId", "U3", "(Ljava/lang/String;)V", "W3", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class b0p0 extends y8s<oo2, wwo0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0p0(@NotNull dum<?> dumVar) {
        super(dumVar);
        dumVar.getClass();
        Act act = dumVar.f90815a;
        act.getClass();
        mo52715C(new wwo0(act, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m101331S3(b0p0 b0p0Var, vxj0 vxj0Var) {
        b0p0Var.m101334V3();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m101332T3(b0p0 b0p0Var, vxj0 vxj0Var) {
        b0p0Var.m101334V3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: U3 */
    public final void m101333U3(@NotNull String userId) {
        userId.getClass();
        duringCreated(fwo0.m127827t(m213810E2().m202191k(), "agree", userId)).subscribe(dhw.m115826e(new y20() { // from class: l.zzo0
            @Override // p153l.y20
            public final void call(Object obj) {
                b0p0.m101332T3(this.f206732a, (vxj0) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m101334V3() {
        C22421c<T> c22421cDuringCreated = duringCreated(fwo0.m127823p());
        final wwo0 wwo0Var = (wwo0) this.viewModel;
        c22421cDuringCreated.subscribe(dhw.m115826e(new y20() { // from class: l.a0p0
            @Override // p153l.y20
            public final void call(Object obj) {
                wwo0Var.m208280V((List) obj);
            }
        }, new r5k()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: W3 */
    public final void m101335W3(@NotNull String userId) {
        userId.getClass();
        duringCreated(fwo0.m127827t(m213810E2().m202191k(), "refuse", userId)).subscribe(dhw.m115826e(new y20() { // from class: l.yzo0
            @Override // p153l.y20
            public final void call(Object obj) {
                b0p0.m101331S3(this.f202211a, (vxj0) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: X3 */
    public final void m101336X3() {
        if (!((wwo0) this.viewModel).isShowing()) {
            ((wwo0) this.viewModel).m73017E();
        }
        m101334V3();
    }

    public final boolean isShowing() {
        return ((wwo0) this.viewModel).isShowing();
    }
}
