package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.myvisitors.MyVisitorsFrag;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.Visitor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ll/z120;", "Ll/jq2;", "Ll/c220;", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;)V", "", "a0", "()V", "", "clearAll", "", "next", "j0", "(ZLjava/lang/String;)V", "destroy", "a", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class z120 extends jq2<c220> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MyVisitorsFrag frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z120(@NotNull MyVisitorsFrag myVisitorsFrag) {
        super(myVisitorsFrag);
        myVisitorsFrag.getClass();
        this.frag = myVisitorsFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m28541e0(z120 z120Var, Bundle bundle) {
        ((c220) ((jq2) z120Var).viewModel).m13082r();
        z120Var.m28547j0(true, "");
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m28542f0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m27363T3(userPrivilege));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m28543g0(z120 z120Var, Boolean bool) {
        c220 c220Var = (c220) ((jq2) z120Var).viewModel;
        bool.getClass();
        c220Var.m13080p(bool.booleanValue());
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m28544h0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m28545i0(z120 z120Var, j760 j760Var) {
        j760Var.getClass();
        List<? extends Visitor> list = (List) j760Var.a;
        if (list != null) {
            ((c220) ((jq2) z120Var).viewModel).m13081q(list, (String) j760Var.b);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m28546a0() {
        super.a0();
        creates(new e30() { // from class: l.u120
            public final void call(Object obj) {
                z120.m28541e0(this.f22418a, (Bundle) obj);
            }
        });
        c<UserPrivilege> cVarM27419u3 = CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("oDiamond"));
        final Function1 function1 = new Function1() { // from class: l.v120
            public final Object invoke(Object obj) {
                return z120.m28542f0((UserPrivilege) obj);
            }
        };
        duringCreated(cVarM27419u3.map(new w9j() { // from class: l.w120
            public final Object call(Object obj) {
                return z120.m28544h0(function1, obj);
            }
        })).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.x120
            public final void call(Object obj) {
                z120.m28543g0(this.f25666a, (Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3657n2.m22270e4()).subscribe(mkd0.G(new e30() { // from class: l.y120
            public final void call(Object obj) {
                z120.m28545i0(this.f27854a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m28547j0(boolean clearAll, @Nullable String next) {
        CoreModule.f1534c.f3657n2.m22269d4(CoreModule.f1534c.f3657n2.m22245F3(), clearAll, next);
    }

    public void destroy() {
    }
}
