package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, m87232d2 = {"Ll/k610;", "Ll/x6s;", "Ll/yl40;", "Ll/g610;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "O3", "P3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class k610 extends x6s<yl40, g610> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k610(@NotNull bsm<yl40> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        Act act = this.f188513f;
        act.getClass();
        mo51532C(new g610(act, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m144571S3(k610 k610Var, Boolean bool) {
        return Boolean.valueOf(!((g610) k610Var.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: T3 */
    public static void m144572T3(k610 k610Var, Boolean bool) {
        ((hdv) ypv.m215673l(fld0.f98150e)).f107301g.m189988a(1);
        ((g610) k610Var.viewModel).m71834E();
    }

    /* JADX INFO: renamed from: U3 */
    public static Boolean m144573U3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        bsm<? extends T> bsmVar = this.f188512e;
        bsmVar.getClass();
        r610.m177993a0(this, bsmVar, -1, 4);
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        ((g610) this.viewModel).m124550K();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<T> c22306cDuringCreated = duringCreated(m206028F2().MultiCallEvent.showMultiCallUpgradeEntryDlg().m172460g());
        final Function1 function1 = new Function1() { // from class: l.h610
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k610.m144571S3(this.f106003a, (Boolean) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.i610
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return k610.m144573U3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.j610
            @Override // p149l.e30
            public final void call(Object obj) {
                k610.m144572T3(this.f116375a, (Boolean) obj);
            }
        }));
    }
}
