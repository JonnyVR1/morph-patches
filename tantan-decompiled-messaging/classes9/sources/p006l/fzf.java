package p006l;

import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.mytab.FakeLikersMyTabFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.vwb;
import l.w2b0;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0006¨\u0006\u001f"}, d2 = {"Ll/fzf;", "Ll/jq2;", "Ll/izf;", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;)V", "viewModel", "", "l0", "(Ll/izf;)V", "destroy", "()V", "a0", "m0", "", "realFrom", "Ll/d30;", "onDismiss", "o0", "(Ljava/lang/String;Ll/d30;)V", "Lcom/p1/mobile/putong/data/User;", "user", "n0", "(Lcom/p1/mobile/putong/data/User;)V", "q0", "a", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "setFrag", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m15537e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m15538f0(String str) {
        str.getClass();
        return Boolean.valueOf(Intrinsics.d("all", str) || Intrinsics.d("see", str));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m15539g0(fzf fzfVar, Bundle bundle) {
        fzfVar.m15548m0();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m15540h0(fzf fzfVar, j760 j760Var) {
        List<? extends User> list = (List) j760Var.b;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ((izf) ((jq2) fzfVar).viewModel).m17173s(list);
                ((izf) ((jq2) fzfVar).viewModel).m17174u(false);
                return;
            }
        }
        ((izf) ((jq2) fzfVar).viewModel).m17174u(true);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m15541i0(fzf fzfVar, String str) {
        fzfVar.m15548m0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m15542j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m15543k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m15544p0(fzf fzfVar, String str, d30 d30Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = w2b0.c("p_navigation_see,card_button_pull", 1);
        }
        if ((i & 2) != 0) {
            d30Var = null;
        }
        fzfVar.m15550o0(str, d30Var);
    }

    /* JADX INFO: renamed from: a0 */
    public void m15546a0() {
        super.a0();
        creates(new e30() { // from class: l.yyf
            public final void call(Object obj) {
                fzf.m15539g0(this.f28501a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f1534c.f3676u0.m2341S6()).subscribe(mkd0.H(new e30() { // from class: l.zyf
            public final void call(Object obj) {
                fzf.m15540h0(this.f29040a, (j760) obj);
            }
        }, new e30() { // from class: l.azf
            public final void call(Object obj) {
                fzf.m15537e0((Throwable) obj);
            }
        }));
        c cVarDuringCreated = duringCreated(bzc0.INSTANCE.m13044b().m13041d());
        final Function1 function1 = new Function1() { // from class: l.bzf
            public final Object invoke(Object obj) {
                return fzf.m15538f0((String) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.czf
            public final Object call(Object obj) {
                return fzf.m15543k0(function1, obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.dzf
            public final void call(Object obj) {
                fzf.m15541i0(this.f10669a, (String) obj);
            }
        }, new e30() { // from class: l.ezf
            public final void call(Object obj) {
                fzf.m15542j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void m15545C(@NotNull izf viewModel) {
        viewModel.getClass();
        super.C(viewModel);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m15548m0() {
        if (!xma.m27379e4() || CoreModule.f1534c.f3628e0.m21490p9().isSVIP()) {
            return;
        }
        CoreLikers coreLikers = CoreModule.f1534c.f3676u0;
        Object obj = coreLikers.f3244l0.get();
        obj.getClass();
        coreLikers.m2369g7(50, ((Number) obj).longValue());
    }

    /* JADX INFO: renamed from: n0 */
    public final void m15549n0(@NotNull User user) {
        user.getClass();
        m15551q0(user);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m15550o0(@Nullable String realFrom, @Nullable d30 onDismiss) {
        CoreModule.m1854P().m11706a().showSeeDialog(act(), onDismiss, realFrom);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m15551q0(@NotNull User user) {
        user.getClass();
        Intent intentM5488n8 = CoreModule.m1854P().m11706a().m5488n8(act(), vwb.f0(new String[]{((DbObject) user).id}), CoreModule.m1854P().m11706a().m5445h7(), new ArrayList<>(), w2b0.c("p_navigation,see_module", 1));
        Act act = act();
        if (act != null) {
            act.startActivityWithCustomTransition(intentM5488n8, CoreModule.m1854P().m11706a().m5449hg(act()));
        }
    }

    public void destroy() {
    }
}
