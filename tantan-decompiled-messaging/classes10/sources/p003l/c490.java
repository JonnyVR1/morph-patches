package p003l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.Coupon;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.a5;
import l.d3c0;
import l.g6a;
import l.m6h0;
import l.rxa0;
import l.svq;
import l.xdl0;
import l.xma;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ll/c490;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "r", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "privilegeEntrancePromotionBottomView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "privilegeEntranceSingleTextWithIconBgView", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class c490 extends a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c490(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m5852s(c490 c490Var, Merchandise merchandise, View view) {
        zvf0.r(c490Var.m5856h(), c490Var.f());
        if (!g6a.t()) {
            String strY3 = CoreModule.P().a().Y3();
            strY3.getClass();
            c490Var.o(strY3);
            return;
        }
        String strIe = CoreModule.P().a().Ie();
        int iSk = CoreModule.P().a().sk(strIe);
        Coupon couponI = rxa0.i(merchandise);
        if (couponI != null) {
            CoreModule.P().a().Sn(c490Var.g().getAct(), "p_privilege,navigation_banner", iSk, true, ((DbObject) couponI).id);
        } else {
            strIe.getClass();
            c490Var.o(strIe);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m5853t(c490 c490Var, Merchandise merchandise, View view) {
        zvf0.r(c490Var.m5858r(), c490Var.f());
        zvf0.r("e_mytab_svip_freetrial_banner", "p_navigation_view");
        m6h0.k(c490Var.g().getAct(), merchandise);
    }

    /* JADX INFO: renamed from: a */
    public boolean m5854a() {
        return zb90.i() && xma.e4() && NullChecker.a(m6h0.i());
    }

    /* JADX INFO: renamed from: b */
    public void m5855b() {
        this.privilegeEntranceSingleTextWithIconBgView = (PrivilegeEntranceSingleTextWithIconBgView) i(g().getAct(), g().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        this.privilegeEntrancePromotionBottomView = (PrivilegeEntrancePromotionBottomView) i(g().getAct(), g().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
        layoutParams.leftMargin = svq.c(5);
        layoutParams.rightMargin = svq.c(5);
        layoutParams.topMargin = svq.c(5);
        layoutParams.bottomMargin = svq.c(5);
        g().getRoot().addView((View) this.privilegeEntranceSingleTextWithIconBgView, (ViewGroup.LayoutParams) layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(76));
        layoutParams2.leftMargin = svq.c(5);
        layoutParams2.rightMargin = svq.c(5);
        layoutParams2.bottomMargin = svq.c(5);
        g().getRoot().addView((View) this.privilegeEntrancePromotionBottomView, (ViewGroup.LayoutParams) layoutParams2);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m5856h() {
        return "e_privilege_banner_viptosviptrail";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView] */
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
    public void m5857m() {
        super.m();
        final Merchandise merchandiseI = m6h0.i();
        if (merchandiseI == null) {
            return;
        }
        ?? r1 = this.privilegeEntranceSingleTextWithIconBgView;
        if (r1 != 0) {
            r1.get_go().setImageResource(d3c0.va);
            r1.get_go().setColorFilter(Color.parseColor("#9D5C36"));
            r1.get_desc().setTextColor(Color.parseColor("#9D5C36"));
            r1.get_desc().setAlpha(0.9f);
            r1.get_desc().setText(zb90.f());
            r1.get_texture().setImageResource(d3c0.Oa);
            r1.get_privilege_icon_simple().setImageResource(d3c0.k6);
            r1.get_privilege_icon().setImageResource(d3c0.l6);
            r1.setBackgroundResource(d3c0.D3);
            xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.a490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c490.m5852s(this.f2725a, merchandiseI, view);
                }
            });
        }
        ?? r2 = this.privilegeEntrancePromotionBottomView;
        if (r2 != 0) {
            r2.get_goto_buy().setBackgroundResource(d3c0.E3);
            r2.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            r2.get_goto_buy().setText("立即领取");
            r2.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            r2.get_promotion_tip().setBackgroundResource(d3c0.Fa);
            r2.get_promotion_tip().setText("限时特惠");
            r2.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            r2.get_promotion_desc().setText("1元试用7天");
            r2.get_promotion_icon().setImageResource(d3c0.Ja);
            TextView textView = r2.get_buy_tip();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textView.setText(String.format("优惠将于%s天后到期", Arrays.copyOf(new Object[]{Integer.valueOf(m6h0.d(m6h0.e(merchandiseI)))}, 1)));
            xdl0.E0(r2.get_goto_buy(), new View.OnClickListener() { // from class: l.b490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c490.m5853t(this.f3310a, merchandiseI, view);
                }
            });
            r2.setBackgroundResource(d3c0.Ga);
        }
        zvf0.x("e_mytab_svip_freetrial_banner", "p_navigation_view");
        g().getRoot().setBackgroundResource(d3c0.Da);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String m5858r() {
        return "e_privilege_button_viptosviptrail";
    }
}
