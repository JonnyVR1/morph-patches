package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.mytab.FakeLikersMyTabFrag;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0006¨\u0006\u001f"}, m88121d2 = {"Ll/t0g;", "Ll/ar2;", "Ll/w0g;", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;)V", "viewModel", "", "l0", "(Ll/w0g;)V", "destroy", "()V", "a0", "m0", "", "realFrom", "Ll/x20;", "onDismiss", "o0", "(Ljava/lang/String;Ll/x20;)V", "Lcom/p1/mobile/putong/data/User;", "user", "n0", "(Lcom/p1/mobile/putong/data/User;)V", "q0", "a", "Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/seepage/likers/mytab/FakeLikersMyTabFrag;", "setFrag", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class t0g extends ar2<w0g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public FakeLikersMyTabFrag frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0g(@NotNull FakeLikersMyTabFrag fakeLikersMyTabFrag) {
        super(fakeLikersMyTabFrag);
        fakeLikersMyTabFrag.getClass();
        this.frag = fakeLikersMyTabFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m188725e0(Throwable th) {
    }

    /* JADX INFO: renamed from: f0 */
    public static Boolean m188726f0(String str) {
        str.getClass();
        return Boolean.valueOf(Intrinsics.m88377d("all", str) || Intrinsics.m88377d("see", str));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m188727g0(t0g t0gVar, Bundle bundle) {
        t0gVar.m188734m0();
    }

    /* JADX INFO: renamed from: h0 */
    public static void m188728h0(t0g t0gVar, pf60 pf60Var) {
        List<? extends User> list = (List) pf60Var.f152157b;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ((w0g) t0gVar.viewModel).m204177s(list);
                ((w0g) t0gVar.viewModel).m204178u(false);
                return;
            }
        }
        ((w0g) t0gVar.viewModel).m204178u(true);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m188729i0(t0g t0gVar, String str) {
        t0gVar.m188734m0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m188730j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static Boolean m188731k0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m188732p0(t0g t0gVar, String str, x20 x20Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = abb0.m96736c("p_navigation_see,card_button_pull", 1);
        }
        if ((i & 2) != 0) {
            x20Var = null;
        }
        t0gVar.m188736o0(str, x20Var);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.m0g
            @Override // p153l.y20
            public final void call(Object obj) {
                t0g.m188727g0(this.f134310a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20429u0.m31423W6()).subscribe(psd0.m173597H(new y20() { // from class: l.n0g
            @Override // p153l.y20
            public final void call(Object obj) {
                t0g.m188728h0(this.f139626a, (pf60) obj);
            }
        }, new y20() { // from class: l.o0g
            @Override // p153l.y20
            public final void call(Object obj) {
                t0g.m188725e0((Throwable) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(e7d0.INSTANCE.m119701b().m119698d());
        final Function1 function1 = new Function1() { // from class: l.p0g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0g.m188726f0((String) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.q0g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return t0g.m188731k0(function1, obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.r0g
            @Override // p153l.y20
            public final void call(Object obj) {
                t0g.m188729i0(this.f160630a, (String) obj);
            }
        }, new y20() { // from class: l.s0g
            @Override // p153l.y20
            public final void call(Object obj) {
                t0g.m188730j0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(@NotNull w0g viewModel) {
        viewModel.getClass();
        super.mo52715C(viewModel);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m188734m0() {
        if (!joa.m146386f4() || CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
            return;
        }
        CoreLikers coreLikers = CoreModule.f18264c.f20429u0;
        Long l2 = coreLikers.f19997m0.get();
        l2.getClass();
        coreLikers.m31454k7(50, l2.longValue());
    }

    /* JADX INFO: renamed from: n0 */
    public final void m188735n0(@NotNull User user) {
        user.getClass();
        m188737q0(user);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m188736o0(@Nullable String realFrom, @Nullable x20 onDismiss) {
        CoreModule.m30933P().m143405a().showSeeDialog(act(), onDismiss, realFrom);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m188737q0(@NotNull User user) {
        user.getClass();
        Intent intentMo34554n8 = CoreModule.m30933P().m143405a().mo34554n8(act(), jyb.m147507f0(user.f56859id), CoreModule.m30933P().m143405a().mo34511h7(), new ArrayList<>(), abb0.m96736c("p_navigation,see_module", 1));
        Act act = act();
        if (act != null) {
            act.startActivityWithCustomTransition(intentMo34554n8, CoreModule.m30933P().m143405a().mo34515hg(act()));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
