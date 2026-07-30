package p149l;

import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BoostResultEntry;
import com.p046p1.mobile.putong.core.data.Condition;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.ja */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001c\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\nJ\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0013R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m87232d2 = {"Ll/ja;", "Ll/x53;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/da3;", "viewModel", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/da3;)V", "", "f", "()V", "e", "Lcom/p1/mobile/putong/core/newui/view/BoostViewContainer;", "boostViewContainer", "o", "(Lcom/p1/mobile/putong/core/newui/view/BoostViewContainer;)V", "", "again", "p", "(Z)V", "Ll/v9j;", "", "fromCallback", "k", "(Ll/v9j;)V", "Ll/d30;", "reRunBoost", Condition.TYPE, "n", "(Lcom/p1/mobile/android/app/Act;Ll/d30;Ll/v9j;)V", "Landroid/widget/FrameLayout;", "_boostViewRoot", "Landroid/view/View;", "boostButton", "m", "(Landroid/widget/FrameLayout;Landroid/view/View;)V", Constants.INAPP_DATA_TAG, ResourceDirection.f38808v, BaseSei.f13931Y, "Ll/c4g0;", "Ll/c4g0;", "acceleratePairingContentSubscribe", "acceleratePairingDefaultSubscribe", "g", "acceleratePairingSubscribe", "", "h", "I", "oldStatus", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C17722ja extends x53 {

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
    public C17722ja(@NotNull Act act, @NotNull da3 da3Var) {
        super(act, da3Var);
        act.getClass();
        da3Var.getClass();
        this.oldStatus = -1;
    }

    /* JADX INFO: renamed from: s */
    public static void m140605s(String str) {
        C4348d.m20896l().m20900k(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static void m140606t(C17722ja c17722ja, Pair pair) {
        pair.getClass();
        Integer num = (Integer) pair.first;
        if (num != null && num.intValue() == 1 && NullChecker.m81303a(pair.second)) {
            da3 da3Var = c17722ja.f191083b;
            xaj0 xaj0Var = (xaj0) pair.second;
            CharSequence charSequence = (CharSequence) xaj0Var.f191751a;
            B b = xaj0Var.f191752b;
            b.getClass();
            da3Var.m110557l(charSequence, ((Number) b).intValue());
        } else {
            c17722ja.f191083b.m110556k();
        }
        int i = c17722ja.oldStatus;
        Integer num2 = (Integer) pair.first;
        if ((num2 != null && i == num2.intValue()) || !NullChecker.m81303a(c17722ja.f191085d)) {
            return;
        }
        y93 y93Var = c17722ja.f191085d;
        if (y93Var != null) {
            y93Var.m213529b(c17722ja.oldStatus);
        }
        Object obj = pair.first;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        c17722ja.oldStatus = iIntValue;
        y93 y93Var2 = c17722ja.f191085d;
        if (y93Var2 != null) {
            y93Var2.mo123970a(iIntValue);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m140607u(C17722ja c17722ja, View view) {
        view.getClass();
        if (CoreModule.f17545c.f19635c2.m99148t3()) {
            C16319da.Companion companion = C16319da.INSTANCE;
            Act act = c17722ja.f191082a;
            act.getClass();
            companion.m110515q(act);
            return;
        }
        z93.m217660c(c17722ja.f191082a);
        if (c17722ja.m207075j()) {
            return;
        }
        c17722ja.m140611y(false);
    }

    /* JADX INFO: renamed from: w */
    public static final void m140608w(gti0 gti0Var, Optional optional) {
        if (!optional.isPresent()) {
            gti0.m127970t(gti0Var, null, null, 3, null);
            return;
        }
        String str = ((BoostResultEntry) optional.get()).text;
        if (str == null) {
            str = "";
        }
        String str2 = ((BoostResultEntry) optional.get()).avatar;
        gti0Var.m127984s(str, str2 != null ? str2 : "");
    }

    /* JADX INFO: renamed from: x */
    public static final void m140609x(gti0 gti0Var, Boolean bool) {
        bool.getClass();
        gti0Var.m127981p(bool.booleanValue());
        if (CoreModule.m29935P().m94656g().mo35017Ki() || CoreModule.m29935P().m94656g().mo35087yc() || CoreModule.f17557o.m195057d().mo33923t8()) {
            gti0Var.m127981p(true);
        }
        gti0.m127970t(gti0Var, null, null, 3, null);
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: d */
    public void mo120064d() {
        mkd0.m154992z(this.acceleratePairingContentSubscribe);
        this.acceleratePairingContentSubscribe = null;
        mkd0.m154992z(this.acceleratePairingDefaultSubscribe);
        this.acceleratePairingDefaultSubscribe = null;
        mkd0.m154992z(this.acceleratePairingSubscribe);
        this.acceleratePairingSubscribe = null;
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: e */
    public void mo120065e() {
        da3 da3Var = this.f191083b;
        View viewM110547b = da3Var != null ? da3Var.m110547b() : null;
        if (NullChecker.m81303a(viewM110547b)) {
            xdl0.m208329E0(viewM110547b, new View.OnClickListener() { // from class: l.ea
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17722ja.m140607u(this.f90162a, view);
                }
            });
        }
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: f */
    public void mo120066f() {
        ba3 ba3Var = this.f191083b.f85180a;
        final gti0 gti0Var = ba3Var instanceof gti0 ? (gti0) ba3Var : null;
        if (gti0Var != null) {
            lac0.Companion companion = lac0.INSTANCE;
            this.acceleratePairingContentSubscribe = companion.m149146a().m149139h().subscribe(mkd0.m154955G(new e30() { // from class: l.ga
                @Override // p149l.e30
                public final void call(Object obj) {
                    C17722ja.m140608w(gti0Var, (Optional) obj);
                }
            }));
            this.acceleratePairingDefaultSubscribe = companion.m149146a().m149138g().distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ha
                @Override // p149l.e30
                public final void call(Object obj) {
                    C17722ja.m140609x(gti0Var, (Boolean) obj);
                }
            }));
        }
        m140610v();
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: k */
    public void mo120067k(@Nullable v9j<String> fromCallback) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: o */
    public void mo120070o(@Nullable BoostViewContainer boostViewContainer) {
        int iM210088o3 = xma.m210088o3();
        if (iM210088o3 <= 0) {
            return;
        }
        final String strM20908t = C4348d.m20896l().m20908t(new C4345a(this.f191082a).m20847B(t100.m186890d(2.0f)).m20849D(this.f191082a.getString(iM210088o3 > 1 ? R$string.f20618V0 : R$string.f20616U0, String.valueOf(iM210088o3))).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20875q(C4345a.f15680N), boostViewContainer);
        e51.m114743H(this.f191082a, new Runnable() { // from class: l.fa
            @Override // java.lang.Runnable
            public final void run() {
                C17722ja.m140605s(strM20908t);
            }
        }, 1000L);
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: p */
    public void mo120071p(boolean again) {
        m140611y(again);
    }

    /* JADX INFO: renamed from: v */
    public final void m140610v() {
        this.acceleratePairingSubscribe = C19873s9.m182675j().m182680o(mkd0.m154955G(new e30() { // from class: l.ia
            @Override // p149l.e30
            public final void call(Object obj) {
                C17722ja.m140606t(this.f112272a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m140611y(boolean again) {
        lac0 lac0VarM149146a = lac0.INSTANCE.m149146a();
        Act act = this.f191082a;
        act.getClass();
        if (lac0VarM149146a.m149145q(act, "p_home,accelerate_guide")) {
            return;
        }
        C16319da.Companion companion = C16319da.INSTANCE;
        Act act2 = this.f191082a;
        act2.getClass();
        C16319da.Companion.m110508v(companion, act2, again, null, null, 12, null);
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: m */
    public void mo120068m(@Nullable FrameLayout _boostViewRoot, @Nullable View boostButton) {
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: n */
    public void mo120069n(@Nullable Act act, @Nullable d30 reRunBoost, @Nullable v9j<Boolean> condition) {
    }
}
