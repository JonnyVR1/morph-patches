package p153l;

import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BoostResultEntry;
import com.p051p1.mobile.putong.core.data.Condition;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l.ea */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001c\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\nJ\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0013R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m88121d2 = {"Ll/ea;", "Ll/n63;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/sa3;", "viewModel", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/sa3;)V", "", "f", "()V", "e", "Lcom/p1/mobile/putong/core/newui/view/BoostViewContainer;", "boostViewContainer", "o", "(Lcom/p1/mobile/putong/core/newui/view/BoostViewContainer;)V", "", "again", "p", "(Z)V", "Ll/pcj;", "", "fromCallback", "k", "(Ll/pcj;)V", "Ll/x20;", "reRunBoost", Condition.TYPE, "n", "(Lcom/p1/mobile/android/app/Act;Ll/x20;Ll/pcj;)V", "Landroid/widget/FrameLayout;", "_boostViewRoot", "Landroid/view/View;", "boostButton", "m", "(Landroid/widget/FrameLayout;Landroid/view/View;)V", Constants.INAPP_DATA_TAG, ResourceDirection.f39656v, BaseSei.f14625Y, "Ll/kcg0;", "Ll/kcg0;", "acceleratePairingContentSubscribe", "acceleratePairingDefaultSubscribe", "g", "acceleratePairingSubscribe", "", "h", "I", "oldStatus", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C16738ea extends n63 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public kcg0 acceleratePairingContentSubscribe;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public kcg0 acceleratePairingDefaultSubscribe;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public kcg0 acceleratePairingSubscribe;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int oldStatus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16738ea(@NotNull Act act, @NotNull sa3 sa3Var) {
        super(act, sa3Var);
        act.getClass();
        sa3Var.getClass();
        this.oldStatus = -1;
    }

    /* JADX INFO: renamed from: s */
    public static void m119972s(String str) {
        C4499d.m21895l().m21899k(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static void m119973t(C16738ea c16738ea, Pair pair) {
        pair.getClass();
        Integer num = (Integer) pair.first;
        if (num != null && num.intValue() == 1 && NullChecker.m82486a(pair.second)) {
            sa3 sa3Var = c16738ea.f140424b;
            bkj0 bkj0Var = (bkj0) pair.second;
            CharSequence charSequence = (CharSequence) bkj0Var.f77081a;
            B b = bkj0Var.f77082b;
            b.getClass();
            sa3Var.m185264l(charSequence, ((Number) b).intValue());
        } else {
            c16738ea.f140424b.m185263k();
        }
        int i = c16738ea.oldStatus;
        Integer num2 = (Integer) pair.first;
        if ((num2 != null && i == num2.intValue()) || !NullChecker.m82486a(c16738ea.f140426d)) {
            return;
        }
        na3 na3Var = c16738ea.f140426d;
        if (na3Var != null) {
            na3Var.m162055b(c16738ea.oldStatus);
        }
        Object obj = pair.first;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        c16738ea.oldStatus = iIntValue;
        na3 na3Var2 = c16738ea.f140426d;
        if (na3Var2 != null) {
            na3Var2.mo115522a(iIntValue);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m119974u(C16738ea c16738ea, View view) {
        view.getClass();
        if (CoreModule.f18264c.f20377c2.m118408t3()) {
            C21545y9.Companion companion = C21545y9.INSTANCE;
            Act act = c16738ea.f140423a;
            act.getClass();
            companion.m214802q(act);
            return;
        }
        oa3.m166821c(c16738ea.f140423a);
        if (c16738ea.m161756j()) {
            return;
        }
        c16738ea.m119986y(false);
    }

    /* JADX INFO: renamed from: w */
    public static final void m119975w(k2j0 k2j0Var, Optional optional) {
        if (!optional.isPresent()) {
            k2j0.m147948t(k2j0Var, null, null, 3, null);
            return;
        }
        String str = ((BoostResultEntry) optional.get()).text;
        if (str == null) {
            str = "";
        }
        String str2 = ((BoostResultEntry) optional.get()).avatar;
        k2j0Var.m147967s(str, str2 != null ? str2 : "");
    }

    /* JADX INFO: renamed from: x */
    public static final void m119976x(k2j0 k2j0Var, Boolean bool) {
        bool.getClass();
        k2j0Var.m147964p(bool.booleanValue());
        if (CoreModule.m30933P().m143410g().mo36020Ki() || CoreModule.m30933P().m143410g().mo36090yc() || CoreModule.f18276o.m132214d().mo34926t8()) {
            k2j0Var.m147964p(true);
        }
        k2j0.m147948t(k2j0Var, null, null, 3, null);
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: d */
    public void mo119977d() {
        psd0.m173633z(this.acceleratePairingContentSubscribe);
        this.acceleratePairingContentSubscribe = null;
        psd0.m173633z(this.acceleratePairingDefaultSubscribe);
        this.acceleratePairingDefaultSubscribe = null;
        psd0.m173633z(this.acceleratePairingSubscribe);
        this.acceleratePairingSubscribe = null;
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: e */
    public void mo119978e() {
        sa3 sa3Var = this.f140424b;
        View viewM185254b = sa3Var != null ? sa3Var.m185254b() : null;
        if (NullChecker.m82486a(viewM185254b)) {
            bnl0.m105509E0(viewM185254b, new View.OnClickListener() { // from class: l.z9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16738ea.m119974u(this.f203431a, view);
                }
            });
        }
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: f */
    public void mo119979f() {
        qa3 qa3Var = this.f140424b.f166998a;
        final k2j0 k2j0Var = qa3Var instanceof k2j0 ? (k2j0) qa3Var : null;
        if (k2j0Var != null) {
            ric0.Companion companion = ric0.INSTANCE;
            this.acceleratePairingContentSubscribe = companion.m181593a().m181586h().subscribe(psd0.m173596G(new y20() { // from class: l.ba
                @Override // p153l.y20
                public final void call(Object obj) {
                    C16738ea.m119975w(k2j0Var, (Optional) obj);
                }
            }));
            this.acceleratePairingDefaultSubscribe = companion.m181593a().m181585g().distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.ca
                @Override // p153l.y20
                public final void call(Object obj) {
                    C16738ea.m119976x(k2j0Var, (Boolean) obj);
                }
            }));
        }
        m119985v();
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: k */
    public void mo119980k(@Nullable pcj<String> fromCallback) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: o */
    public void mo119983o(@Nullable BoostViewContainer boostViewContainer) {
        int iM146402o3 = joa.m146402o3();
        if (iM146402o3 <= 0) {
            return;
        }
        final String strM21907t = C4499d.m21895l().m21907t(new C4496a(this.f140423a).m21846B(qa00.m175859d(2.0f)).m21848D(this.f140423a.getString(iM146402o3 > 1 ? R$string.f21360V0 : R$string.f21358U0, String.valueOf(iM146402o3))).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21874q(C4496a.f16399N), boostViewContainer);
        l51.m152888H(this.f140423a, new Runnable() { // from class: l.aa
            @Override // java.lang.Runnable
            public final void run() {
                C16738ea.m119972s(strM21907t);
            }
        }, 1000L);
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: p */
    public void mo119984p(boolean again) {
        m119986y(again);
    }

    /* JADX INFO: renamed from: v */
    public final void m119985v() {
        this.acceleratePairingSubscribe = C18823n9.m161958j().m161963o(psd0.m173596G(new y20() { // from class: l.da
            @Override // p153l.y20
            public final void call(Object obj) {
                C16738ea.m119973t(this.f85832a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m119986y(boolean again) {
        ric0 ric0VarM181593a = ric0.INSTANCE.m181593a();
        Act act = this.f140423a;
        act.getClass();
        if (ric0VarM181593a.m181592q(act, "p_home,accelerate_guide")) {
            return;
        }
        C21545y9.Companion companion = C21545y9.INSTANCE;
        Act act2 = this.f140423a;
        act2.getClass();
        C21545y9.Companion.m214795v(companion, act2, again, null, null, 12, null);
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: m */
    public void mo119981m(@Nullable FrameLayout _boostViewRoot, @Nullable View boostButton) {
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: n */
    public void mo119982n(@Nullable Act act, @Nullable x20 reRunBoost, @Nullable pcj<Boolean> condition) {
    }
}
