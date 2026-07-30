package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.mytab.FakeLikersMyTabFrag;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0006¨\u0006\u001f"}, m87232d2 = {"Ll/fzf;", "Ll/jq2;", "Ll/izf;", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;)V", "viewModel", "", "l0", "(Ll/izf;)V", "destroy", "()V", "a0", "m0", "", "realFrom", "Ll/d30;", "onDismiss", "o0", "(Ljava/lang/String;Ll/d30;)V", "Lcom/p1/mobile/putong/data/User;", "user", "n0", "(Lcom/p1/mobile/putong/data/User;)V", "q0", "a", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "setFrag", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class fzf extends jq2<izf> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public FakeLikersMyTabFrag frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzf(@NotNull FakeLikersMyTabFrag fakeLikersMyTabFrag) {
        super(fakeLikersMyTabFrag);
        fakeLikersMyTabFrag.getClass();
        this.frag = fakeLikersMyTabFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m123829e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m123830f0(String str) {
        str.getClass();
        return Boolean.valueOf(Intrinsics.m87488d("all", str) || Intrinsics.m87488d("see", str));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m123831g0(fzf fzfVar, Bundle bundle) {
        fzfVar.m123838m0();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m123832h0(fzf fzfVar, j760 j760Var) {
        List<? extends User> list = (List) j760Var.f116565b;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ((izf) fzfVar.viewModel).m139059s(list);
                ((izf) fzfVar.viewModel).m139060u(false);
                return;
            }
        }
        ((izf) fzfVar.viewModel).m139060u(true);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m123833i0(fzf fzfVar, String str) {
        fzfVar.m123838m0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m123834j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m123835k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m123836p0(fzf fzfVar, String str, d30 d30Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = w2b0.m201089c("p_navigation_see,card_button_pull", 1);
        }
        if ((i & 2) != 0) {
            d30Var = null;
        }
        fzfVar.m123840o0(str, d30Var);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.yyf
            @Override // p149l.e30
            public final void call(Object obj) {
                fzf.m123831g0(this.f200729a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19687u0.m30413S6()).subscribe(mkd0.m154956H(new e30() { // from class: l.zyf
            @Override // p149l.e30
            public final void call(Object obj) {
                fzf.m123832h0(this.f205676a, (j760) obj);
            }
        }, new e30() { // from class: l.azf
            @Override // p149l.e30
            public final void call(Object obj) {
                fzf.m123829e0((Throwable) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(bzc0.INSTANCE.m104570b().m104567d());
        final Function1 function1 = new Function1() { // from class: l.bzf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fzf.m123830f0((String) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.czf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return fzf.m123835k0(function1, obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.dzf
            @Override // p149l.e30
            public final void call(Object obj) {
                fzf.m123833i0(this.f88479a, (String) obj);
            }
        }, new e30() { // from class: l.ezf
            @Override // p149l.e30
            public final void call(Object obj) {
                fzf.m123834j0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(@NotNull izf viewModel) {
        viewModel.getClass();
        super.mo51532C(viewModel);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m123838m0() {
        if (!xma.m210071e4() || CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
            return;
        }
        CoreLikers coreLikers = CoreModule.f17545c.f19687u0;
        Long l2 = coreLikers.f19255l0.get();
        l2.getClass();
        coreLikers.m30441g7(50, l2.longValue());
    }

    /* JADX INFO: renamed from: n0 */
    public final void m123839n0(@NotNull User user) {
        user.getClass();
        m123841q0(user);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m123840o0(@Nullable String realFrom, @Nullable d30 onDismiss) {
        CoreModule.m29935P().m94651a().showSeeDialog(act(), onDismiss, realFrom);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m123841q0(@NotNull User user) {
        user.getClass();
        Intent intentMo33551n8 = CoreModule.m29935P().m94651a().mo33551n8(act(), vwb.m200324f0(user.f56011id), CoreModule.m29935P().m94651a().mo33508h7(), new ArrayList<>(), w2b0.m201089c("p_navigation,see_module", 1));
        Act act = act();
        if (act != null) {
            act.startActivityWithCustomTransition(intentMo33551n8, CoreModule.m29935P().m94651a().mo33512hg(act()));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
