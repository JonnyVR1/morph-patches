package p006l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceDefaultView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.fy80;
import l.j760;
import l.rxa0;
import l.svq;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Ll/s090;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "u", "()V", "", "t", "()Ljava/lang/String;", "", "a", "()Z", "b", "m", "h", "s", "Lcom/p1/mobile/putong/core/data/Merchandise;", "d", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class s090 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceDefaultView _top_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s090(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m23462q(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: t */
    private final String m23464t() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            return "";
        }
        double firstCouponPrice = rxa0.n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        return merchandise.defaultStockKeepUnit.prices.currencySymbol + getPrivilegeEntranceInfo().b().format(firstCouponPrice);
    }

    /* JADX INFO: renamed from: u */
    private final void m23465u() {
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(2);
        this.merchandise = (Merchandise) vwb.r(CoreModule.f1534c.f3643j0.m2507D5(ProductCategory.get("tttVip")), new w9j() { // from class: l.p090
            public final Object call(Object obj) {
                return s090.m23462q((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final void m23466v(s090 s090Var, View view) {
        zvf0.r(s090Var.mo11695h(), s090Var.m11751f());
        if (sj20.m23814a().m23819f()) {
            String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
            strM5276Ie.getClass();
            s090Var.m11756o(strM5276Ie);
        } else {
            s090Var.getPrivilegeEntranceInfo().a().startActivity(CoreModule.m1854P().m11706a().m5489nk(s090Var.getPrivilegeEntranceInfo().a(), "p_privilege,navigation_banner", CoreModule.m1854P().m11706a().m5358Tn()));
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m23467w(s090 s090Var, View view) {
        zvf0.r(s090Var.mo16029s(), s090Var.m11751f());
        zvf0.u("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("privileges_guide_type", "svip")});
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        s090Var.m11756o(strM5276Ie);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        return (xma.m27381f4() || zb90.i() || xma.m27383g4() || !sj20.m23814a().m23816c() || !sj20.m23814a().m23817d()) ? false : true;
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        m23465u();
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(2);
        this._top_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.DEFAULT_PRIVILEGE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(70));
        int iC = svq.c(5);
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
        return "e_privilege_banner_hwbefore24hsvipdefault";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.Ca);
        PrivilegeEntranceDefaultView privilegeEntranceDefaultView = this._top_view;
        if (privilegeEntranceDefaultView != null) {
            privilegeEntranceDefaultView.get_texture().setImageResource(d3c0.h6);
            privilegeEntranceDefaultView.get_border().setImageResource(d3c0.l3);
            privilegeEntranceDefaultView.get_arrow_right().setImageResource(d3c0.A9);
            privilegeEntranceDefaultView.get_title().setText(R.string.Q9);
            privilegeEntranceDefaultView.get_title().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.r));
            privilegeEntranceDefaultView.get_desc().getPaint().setFakeBoldText(false);
            privilegeEntranceDefaultView.get_desc().setAlpha(0.9f);
            privilegeEntranceDefaultView.get_desc().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.r));
            String strM23464t = m23464t();
            if (TextUtils.isEmpty(strM23464t)) {
                privilegeEntranceDefaultView.get_desc().setText("解锁VIP会员");
            } else {
                VText vText = privilegeEntranceDefaultView.get_desc();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strString = getPrivilegeEntranceInfo().a().string(R.string.E6);
                strString.getClass();
                vText.setText(String.format(strString, Arrays.copyOf(new Object[]{strM23464t}, 1)));
            }
            xdl0.E0(privilegeEntranceDefaultView, new View.OnClickListener() { // from class: l.q090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s090.m23466v(this.f19482a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.Ea);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), true);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_icon(), true);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_desc(), true);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTypeface(eqh0.c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setAlpha(0.9f);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setText("解锁");
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_icon(), true);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(d3c0.Ia);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setAlpha(0.9f);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(eqh0.c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText("会员");
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            textView.setText(String.format("立享查看谁喜欢我等%s项特权", Arrays.copyOf(new Object[]{Integer.valueOf(fy80.C())}, 1)));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.j3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(eqh0.c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即解锁");
            xdl0.E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.r090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s090.m23467w(this.f20212a, view);
                }
            });
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("privileges_guide_type", "svip")});
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo16029s() {
        return "e_privilege_button_hwbefore24hsvipdefault";
    }
}
