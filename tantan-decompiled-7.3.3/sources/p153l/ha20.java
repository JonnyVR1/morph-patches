package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.visitor.myvisitors.MyVisitorsFrag;
import com.p051p1.mobile.putong.data.Visitor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Ll/ha20;", "Ll/ar2;", "Ll/ka20;", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;)V", "", "a0", "()V", "", "clearAll", "", "next", "j0", "(ZLjava/lang/String;)V", "destroy", "a", "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsFrag;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ha20 extends ar2<ka20> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MyVisitorsFrag frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha20(@NotNull MyVisitorsFrag myVisitorsFrag) {
        super(myVisitorsFrag);
        myVisitorsFrag.getClass();
        this.frag = myVisitorsFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m134118e0(ha20 ha20Var, Bundle bundle) {
        ((ka20) ha20Var.viewModel).m148936r();
        ha20Var.m134123j0(true, "");
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m134119f0(UserPrivilege userPrivilege) {
        return Boolean.valueOf(joa.m146369U3(userPrivilege));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m134120g0(ha20 ha20Var, Boolean bool) {
        ka20 ka20Var = (ka20) ha20Var.viewModel;
        bool.getClass();
        ka20Var.m148934p(bool.booleanValue());
    }

    /* JADX INFO: renamed from: h0 */
    public static Boolean m134121h0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static void m134122i0(ha20 ha20Var, pf60 pf60Var) {
        pf60Var.getClass();
        List<? extends Visitor> list = (List) pf60Var.f152156a;
        if (list != null) {
            ((ka20) ha20Var.viewModel).m148935q(list, (String) pf60Var.f152157b);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ca20
            @Override // p153l.y20
            public final void call(Object obj) {
                ha20.m134118e0(this.f80541a, (Bundle) obj);
            }
        });
        C22421c<UserPrivilege> c22421cM146424v3 = CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond"));
        final Function1 function1 = new Function1() { // from class: l.da20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ha20.m134119f0((UserPrivilege) obj);
            }
        };
        duringCreated((C22421c) c22421cM146424v3.map(new qcj() { // from class: l.ea20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ha20.m134121h0(function1, obj);
            }
        })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.fa20
            @Override // p153l.y20
            public final void call(Object obj) {
                ha20.m134120g0(this.f97932a, (Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20410n2.m121485e4()).subscribe(psd0.m173596G(new y20() { // from class: l.ga20
            @Override // p153l.y20
            public final void call(Object obj) {
                ha20.m134122i0(this.f102950a, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m134123j0(boolean clearAll, @Nullable String next) {
        CoreModule.f18264c.f20410n2.m121484d4(CoreModule.f18264c.f20410n2.m121460F3(), clearAll, next);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
