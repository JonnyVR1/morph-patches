package p006l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.d3c0;
import l.fy80;
import l.j760;
import l.svq;
import l.vwb;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ll/v090;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "r", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class v090 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v090(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m25641s(v090 v090Var, View view) {
        String strM5384Y3 = CoreModule.m1854P().m11706a().m5384Y3();
        strM5384Y3.getClass();
        v090Var.m11756o(strM5384Y3);
        zvf0.r(v090Var.mo11695h(), v090Var.m11751f());
    }

    /* JADX INFO: renamed from: t */
    public static final void m25642t(v090 v090Var, View view) {
        zvf0.r(v090Var.mo16413r(), v090Var.m11751f());
        zvf0.u("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("privileges_guide_type", "svip")});
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        v090Var.m11756o(strM5276Ie);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        return !xma.m27381f4() && zb90.i() && !xma.m27383g4() && sj20.m23814a().m23816c() && sj20.m23814a().m23817d();
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(2);
        int iC = svq.c(5);
        this._top_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.bottomMargin = iC;
        getPrivilegeEntranceInfo().c().addView((View) this._top_view, (ViewGroup.LayoutParams) layoutParams);
        this._bottom_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(76));
        layoutParams2.leftMargin = iC;
        layoutParams2.rightMargin = iC;
        layoutParams2.bottomMargin = iC;
        getPrivilegeEntranceInfo().c().addView((View) this._bottom_view, (ViewGroup.LayoutParams) layoutParams2);
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_hwbefore24hsvipvip";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.Da);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.D3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.B3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.j6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.l6);
            String strF = zb90.f();
            boolean zM24173N = src0.m24159r().m24173N();
            boolean zM24189y = src0.m24159r().m24189y();
            if (zM24173N && zM24189y) {
                strF = CoreModule.m1854P().m11706a().m5412c7();
            }
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(strF);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            privilegeEntranceSingleTextWithIconBgView.get_go().setColorFilter(Color.parseColor("#9D5C36"));
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.va);
            xdl0.E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.t090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v090.m25641s(this.f21789a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.Ga);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), true);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_desc(), true);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_icon(), true);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setAlpha(0.9f);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setText("解锁");
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(d3c0.Ia);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setAlpha(0.9f);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText("会员");
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textView.setText(String.format("立享查看谁喜欢我等%s项特权", Arrays.copyOf(new Object[]{Integer.valueOf(fy80.C())}, 1)));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.j3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即解锁");
            xdl0.E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.u090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v090.m25642t(this.f22374a, view);
                }
            });
        }
        zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("privileges_guide_type", "svip")});
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo16413r() {
        return "e_privilege_button_hwbefore24hsvipvip";
    }
}
