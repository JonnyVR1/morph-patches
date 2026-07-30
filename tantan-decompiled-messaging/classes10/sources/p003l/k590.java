package p003l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.User;
import java.util.Arrays;
import kotlin.Metadata;
import l.a5;
import l.d30;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.j760;
import l.src0;
import l.svq;
import l.w2b0;
import l.xdl0;
import l.xma;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ll/k590;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "r", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class k590 extends a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k590(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m7535s(k590 k590Var, View view) {
        zvf0.r(k590Var.m7539h(), k590Var.f());
        String strY3 = CoreModule.P().a().Y3();
        strY3.getClass();
        k590Var.o(strY3);
    }

    /* JADX INFO: renamed from: t */
    public static final void m7536t(k590 k590Var, View view) {
        zvf0.r(k590Var.m7541r(), k590Var.f());
        j760[] j760VarArrR = src0.r().R();
        zvf0.u("e_mypage_auto", "p_navigation_view", (j760[]) Arrays.copyOf(j760VarArrR, j760VarArrR.length));
        String str = src0.r().l() ? "my_reauto_button_unauto_order" : "my_reauto_button";
        if (src0.r().z()) {
            src0.r().S(k590Var.g().getAct(), str);
            return;
        }
        Act act = k590Var.g().getAct();
        String strC = w2b0.c("p_navigation,privilege_button", 1);
        strC.getClass();
        c.O1(act, strC, (Privilege) null, (d30) null, (d30) null, false, (User) null, (Object) null, (e30) null, 508, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m7537a() {
        return zb90.i() && xma.e4() && src0.r().N() && !src0.r().y();
    }

    /* JADX INFO: renamed from: b */
    public void m7538b() {
        this._top_view = (PrivilegeEntranceSingleTextWithIconBgView) i(g().getAct(), g().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
        int iC = svq.c(5);
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.bottomMargin = iC;
        g().getRoot().addView((View) this._top_view, (ViewGroup.LayoutParams) layoutParams);
        this._bottom_view = (PrivilegeEntrancePromotionBottomView) i(g().getAct(), g().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(76));
        layoutParams2.leftMargin = iC;
        layoutParams2.rightMargin = iC;
        layoutParams2.bottomMargin = iC;
        g().getRoot().addView((View) this._bottom_view, (ViewGroup.LayoutParams) layoutParams2);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m7539h() {
        return "e_privilege_banner_vipautorecovery";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public void m7540m() {
        super.m();
        g().getRoot().setBackgroundResource(d3c0.Da);
        ?? r0 = this._top_view;
        if (r0 != 0) {
            r0.setBackgroundResource(d3c0.D3);
            r0.get_texture().setImageResource(d3c0.B3);
            r0.get_privilege_icon_simple().setImageResource(d3c0.j6);
            r0.get_privilege_icon().setImageResource(d3c0.l6);
            r0.get_go().setImageResource(d3c0.va);
            r0.get_desc().setText(zb90.f());
            r0.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.i590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k590.m7535s(this.f4995a, view);
                }
            });
        }
        ?? r1 = this._bottom_view;
        if (r1 != 0) {
            r1.setBackgroundResource(d3c0.Na);
            xdl0.M(r1.get_promotion_icon(), false);
            r1.get_promotion_desc().setText(R.string.j7);
            r1.get_promotion_desc().setTypeface(eqh0.c(3));
            r1.get_promotion_desc().setTextColor(Color.parseColor("#9D5C36"));
            xdl0.M(r1.get_promotion_tip(), false);
            r1.get_buy_tip().setTextColor(Color.parseColor("#E69D5C36"));
            r1.get_buy_tip().setText("开通订阅即可限时恢复");
            r1.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            r1.get_goto_buy().setTypeface(eqh0.c(3));
            r1.get_goto_buy().setBackgroundResource(d3c0.E3);
            r1.get_goto_buy().setText("去恢复");
            xdl0.E0(r1.get_goto_buy(), new View.OnClickListener() { // from class: l.j590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k590.m7536t(this.f5248a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String m7541r() {
        return "e_privilege_button_vipautorecovery";
    }
}
