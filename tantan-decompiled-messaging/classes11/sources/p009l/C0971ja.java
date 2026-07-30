package p009l;

import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.BoostResultEntry;
import com.p1.mobile.putong.core.member.R;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import l.c4g0;
import l.d30;
import l.da;
import l.e30;
import l.e51;
import l.lac0;
import l.mkd0;
import l.s9;
import l.t100;
import l.v9j;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.z93;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.ja */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001c\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\nJ\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0013R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Ll/ja;", "Ll/x53;", "Lcom/p1/mobile/android/app/Act;", "act", "Ll/da3;", "viewModel", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/da3;)V", "", "f", "()V", "e", "Lcom/p1/mobile/putong/core/newui/view/BoostViewContainer;", "boostViewContainer", "o", "(Lcom/p1/mobile/putong/core/newui/view/BoostViewContainer;)V", "", "again", "p", "(Z)V", "Ll/v9j;", "", "fromCallback", "k", "(Ll/v9j;)V", "Ll/d30;", "reRunBoost", "condition", "n", "(Lcom/p1/mobile/android/app/Act;Ll/d30;Ll/v9j;)V", "Landroid/widget/FrameLayout;", "_boostViewRoot", "Landroid/view/View;", "boostButton", "m", "(Landroid/widget/FrameLayout;Landroid/view/View;)V", "d", "v", "y", "Ll/c4g0;", "Ll/c4g0;", "acceleratePairingContentSubscribe", "acceleratePairingDefaultSubscribe", "g", "acceleratePairingSubscribe", "", "h", "I", "oldStatus", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0971ja extends x53 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public c4g0 acceleratePairingContentSubscribe;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public c4g0 acceleratePairingDefaultSubscribe;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public c4g0 acceleratePairingSubscribe;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int oldStatus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0971ja(@NotNull Act act, @NotNull da3 da3Var) {
        super(act, da3Var);
        act.getClass();
        da3Var.getClass();
        this.oldStatus = -1;
    }

    /* JADX INFO: renamed from: s */
    public static void m16919s(String str) {
        d.l().k(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m16920t(C0971ja c0971ja, Pair pair) {
        pair.getClass();
        Integer num = (Integer) pair.first;
        if (num != null && num.intValue() == 1 && NullChecker.a(pair.second)) {
            da3 da3Var = c0971ja.f22436b;
            xaj0 xaj0Var = (xaj0) pair.second;
            CharSequence charSequence = (CharSequence) xaj0Var.a;
            Object obj = xaj0Var.b;
            obj.getClass();
            da3Var.m13033l(charSequence, ((Number) obj).intValue());
        } else {
            c0971ja.f22436b.m13032k();
        }
        int i = c0971ja.oldStatus;
        Integer num2 = (Integer) pair.first;
        if ((num2 != null && i == num2.intValue()) || !NullChecker.a(c0971ja.f22438d)) {
            return;
        }
        y93 y93Var = c0971ja.f22438d;
        if (y93Var != null) {
            y93Var.m25205b(c0971ja.oldStatus);
        }
        Object obj2 = pair.first;
        obj2.getClass();
        int iIntValue = ((Number) obj2).intValue();
        c0971ja.oldStatus = iIntValue;
        y93 y93Var2 = c0971ja.f22438d;
        if (y93Var2 != null) {
            y93Var2.mo15344a(iIntValue);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m16921u(C0971ja c0971ja, View view) {
        view.getClass();
        if (CoreModule.c.c2.t3()) {
            da.a aVar = da.Companion;
            Act act = c0971ja.f22435a;
            act.getClass();
            aVar.q(act);
            return;
        }
        z93.c(c0971ja.f22435a);
        if (c0971ja.m24726j()) {
            return;
        }
        c0971ja.m16925y(false);
    }

    /* JADX INFO: renamed from: w */
    public static final void m16922w(gti0 gti0Var, Optional optional) {
        if (!optional.isPresent()) {
            gti0.m15263t(gti0Var, null, null, 3, null);
            return;
        }
        String str = ((BoostResultEntry) optional.get()).text;
        if (str == null) {
            str = "";
        }
        String str2 = ((BoostResultEntry) optional.get()).avatar;
        gti0Var.m15277s(str, str2 != null ? str2 : "");
    }

    /* JADX INFO: renamed from: x */
    public static final void m16923x(gti0 gti0Var, Boolean bool) {
        bool.getClass();
        gti0Var.m15274p(bool.booleanValue());
        if (CoreModule.P().g().Ki() || CoreModule.P().g().yc() || CoreModule.o.d().t8()) {
            gti0Var.m15274p(true);
        }
        gti0.m15263t(gti0Var, null, null, 3, null);
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: d */
    public void mo14322d() {
        mkd0.z(this.acceleratePairingContentSubscribe);
        this.acceleratePairingContentSubscribe = null;
        mkd0.z(this.acceleratePairingDefaultSubscribe);
        this.acceleratePairingDefaultSubscribe = null;
        mkd0.z(this.acceleratePairingSubscribe);
        this.acceleratePairingSubscribe = null;
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: e */
    public void mo14323e() {
        da3 da3Var = this.f22436b;
        View viewM13023b = da3Var != null ? da3Var.m13023b() : null;
        if (NullChecker.a(viewM13023b)) {
            xdl0.E0(viewM13023b, new View.OnClickListener() { // from class: l.ea
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0971ja.m16921u(this.f12462a, view);
                }
            });
        }
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: f */
    public void mo14324f() {
        ba3 ba3Var = this.f22436b.f11683a;
        final gti0 gti0Var = ba3Var instanceof gti0 ? (gti0) ba3Var : null;
        if (gti0Var != null) {
            lac0.a aVar = lac0.Companion;
            this.acceleratePairingContentSubscribe = aVar.a().h().subscribe(mkd0.G(new e30() { // from class: l.ga
                public final void call(Object obj) {
                    C0971ja.m16922w(gti0Var, (Optional) obj);
                }
            }));
            this.acceleratePairingDefaultSubscribe = aVar.a().g().distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ha
                public final void call(Object obj) {
                    C0971ja.m16923x(gti0Var, (Boolean) obj);
                }
            }));
        }
        m16924v();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    @Override // p009l.x53
    /* JADX INFO: renamed from: k */
    public void mo14325k(@Nullable v9j<String> fromCallback) throws NotImplementedError {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: o */
    public void mo14328o(@Nullable BoostViewContainer boostViewContainer) {
        int iO3 = xma.o3();
        if (iO3 <= 0) {
            return;
        }
        final String strT = d.l().t(new a(this.f22435a).B(t100.d(2.0f)).D(this.f22435a.getString(iO3 > 1 ? R.string.V0 : R.string.U0, String.valueOf(iO3))).l(t100.d(7.0f)).p(75).J(13.0f).q(a.N), boostViewContainer);
        e51.H(this.f22435a, new Runnable() { // from class: l.fa
            @Override // java.lang.Runnable
            public final void run() {
                C0971ja.m16919s(strT);
            }
        }, 1000L);
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: p */
    public void mo14329p(boolean again) {
        m16925y(again);
    }

    /* JADX INFO: renamed from: v */
    public final void m16924v() {
        this.acceleratePairingSubscribe = s9.j().o(mkd0.G(new e30() { // from class: l.ia
            public final void call(Object obj) {
                C0971ja.m16920t(this.f14450a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m16925y(boolean again) {
        lac0 lac0VarA = lac0.Companion.a();
        Act act = this.f22435a;
        act.getClass();
        if (lac0VarA.q(act, "p_home,accelerate_guide")) {
            return;
        }
        da.a aVar = da.Companion;
        Act act2 = this.f22435a;
        act2.getClass();
        da.a.v(aVar, act2, again, (String) null, (d30) null, 12, (Object) null);
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: m */
    public void mo14326m(@Nullable FrameLayout _boostViewRoot, @Nullable View boostButton) {
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: n */
    public void mo14327n(@Nullable Act act, @Nullable d30 reRunBoost, @Nullable v9j<Boolean> condition) {
    }
}
