package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.visitor.myvisitors.MyVisitorsFrag;
import com.p046p1.mobile.putong.data.Visitor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Ll/z120;", "Ll/jq2;", "Ll/c220;", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;)V", "", "a0", "()V", "", "clearAll", "", "next", "j0", "(ZLjava/lang/String;)V", "destroy", "a", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m216780e0(z120 z120Var, Bundle bundle) {
        ((c220) z120Var.viewModel).m104903r();
        z120Var.m216785j0(true, "");
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m216781f0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210055T3(userPrivilege));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m216782g0(z120 z120Var, Boolean bool) {
        c220 c220Var = (c220) z120Var.viewModel;
        bool.getClass();
        c220Var.m104901p(bool.booleanValue());
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m216783h0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static void m216784i0(z120 z120Var, j760 j760Var) {
        j760Var.getClass();
        List<? extends Visitor> list = (List) j760Var.f116564a;
        if (list != null) {
            ((c220) z120Var.viewModel).m104902q(list, (String) j760Var.f116565b);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.u120
            @Override // p149l.e30
            public final void call(Object obj) {
                z120.m216780e0(this.f172966a, (Bundle) obj);
            }
        });
        C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("oDiamond"));
        final Function1 function1 = new Function1() { // from class: l.v120
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z120.m216781f0((UserPrivilege) obj);
            }
        };
        duringCreated((C22306c) c22306cM210111u3.map(new w9j() { // from class: l.w120
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return z120.m216783h0(function1, obj);
            }
        })).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.x120
            @Override // p149l.e30
            public final void call(Object obj) {
                z120.m216782g0(this.f189013a, (Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19668n2.m175454e4()).subscribe(mkd0.m154955G(new e30() { // from class: l.y120
            @Override // p149l.e30
            public final void call(Object obj) {
                z120.m216784i0(this.f195371a, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m216785j0(boolean clearAll, @Nullable String next) {
        CoreModule.f17545c.f19668n2.m175453d4(CoreModule.f17545c.f19668n2.m175429F3(), clearAll, next);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
