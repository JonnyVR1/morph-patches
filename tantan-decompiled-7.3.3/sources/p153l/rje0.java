package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.newui.mytab.biz4.container.see.SeeTabFragment;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/rje0;", "Ll/ar2;", "Ll/sje0;", "Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;)V", "", "a0", "()V", "destroy", "a", "Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rje0 extends ar2<sje0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SeeTabFragment frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rje0(@NotNull SeeTabFragment seeTabFragment) {
        super(seeTabFragment);
        seeTabFragment.getClass();
        this.frag = seeTabFragment;
    }

    /* JADX INFO: renamed from: e0 */
    public static Boolean m181701e0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146361M3());
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m181702f0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g0 */
    public static Boolean m181703g0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m181704h0(User user) {
        user.getClass();
        return Boolean.valueOf(user.isSVIP());
    }

    /* JADX INFO: renamed from: i0 */
    public static void m181705i0(rje0 rje0Var, Boolean bool) {
        sje0 sje0Var = (sje0) rje0Var.viewModel;
        bool.getClass();
        sje0Var.m186066b(bool.booleanValue());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        C22421c<User> c22421cM116596o9 = CoreModule.f18264c.f20381e0.m116596o9();
        final Function1 function1 = new Function1() { // from class: l.mje0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rje0.m181704h0((User) obj);
            }
        };
        C22421c<R> map = c22421cM116596o9.map(new qcj() { // from class: l.nje0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rje0.m181703g0(function1, obj);
            }
        });
        C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"));
        final Function1 function2 = new Function1() { // from class: l.oje0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rje0.m181701e0((UserPrivilege) obj);
            }
        };
        duringCreated(C22421c.merge(map, c22421cM146424v3.map(new qcj() { // from class: l.pje0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rje0.m181702f0(function2, obj);
            }
        }))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.qje0
            @Override // p153l.y20
            public final void call(Object obj) {
                rje0.m181705i0(this.f157963a, (Boolean) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
