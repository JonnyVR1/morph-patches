package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.newui.mytab.biz4.container.see.SeeTabFragment;
import com.p046p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/mbe0;", "Ll/jq2;", "Ll/nbe0;", "Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;)V", "", "a0", "()V", "destroy", "a", "Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class mbe0 extends jq2<nbe0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SeeTabFragment frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbe0(@NotNull SeeTabFragment seeTabFragment) {
        super(seeTabFragment);
        seeTabFragment.getClass();
        this.frag = seeTabFragment;
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m153885e0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(xma.m210047L3());
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m153886f0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m153887g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m153888h0(User user) {
        user.getClass();
        return Boolean.valueOf(user.isSVIP());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m153889i0(mbe0 mbe0Var, Boolean bool) {
        nbe0 nbe0Var = (nbe0) mbe0Var.viewModel;
        bool.getClass();
        nbe0Var.m158774b(bool.booleanValue());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        C22306c<User> c22306cM169523o9 = CoreModule.f17545c.f19639e0.m169523o9();
        final Function1 function1 = new Function1() { // from class: l.hbe0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mbe0.m153888h0((User) obj);
            }
        };
        C22306c<R> map = c22306cM169523o9.map(new w9j() { // from class: l.ibe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mbe0.m153887g0(function1, obj);
            }
        });
        C22306c<UserPrivilege> c22306cM210111u3 = CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"));
        final Function1 function2 = new Function1() { // from class: l.jbe0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mbe0.m153885e0((UserPrivilege) obj);
            }
        };
        duringCreated(C22306c.merge(map, c22306cM210111u3.map(new w9j() { // from class: l.kbe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mbe0.m153886f0(function2, obj);
            }
        }))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.lbe0
            @Override // p149l.e30
            public final void call(Object obj) {
                mbe0.m153889i0(this.f127290a, (Boolean) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
