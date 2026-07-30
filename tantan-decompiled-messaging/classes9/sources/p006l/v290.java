package p006l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.data.MembershipType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import l.d3c0;
import l.eqh0;
import l.j760;
import l.n6a;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Ll/v290;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", "s", "()Lcom/p1/mobile/putong/core/data/Merchandise;", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "u", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class v290 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v290(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final Merchandise m25681s() {
        Merchandise merchandiseM24183q;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Object objR = null;
        if (src0.m24159r().m24162B(MembershipType.get("svip"))) {
            merchandiseM24183q = src0.m24159r().m24184s();
            booleanRef.element = false;
        } else if (src0.m24159r().m24164D(MembershipType.get("svip"))) {
            merchandiseM24183q = src0.m24159r().m24183q();
            booleanRef.element = true;
        } else {
            merchandiseM24183q = null;
        }
        if (merchandiseM24183q != null) {
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = merchandiseM24183q.quantity;
            if (TEnum.equals(ProductCategory.get("svip"), merchandiseM24183q.category) && merchandiseM24183q.quarterly()) {
                intRef.element = 6;
            }
            objR = vwb.r(CoreModule.f1534c.f3643j0.m2507D5(merchandiseM24183q.category), new w9j() { // from class: l.s290
                public final Object call(Object obj) {
                    return v290.m25682t(booleanRef, intRef, (Merchandise) obj);
                }
            });
        }
        return (Merchandise) objR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Boolean m25682t(Ref.BooleanRef booleanRef, Ref.IntRef intRef, Merchandise merchandise) {
        merchandise.getClass();
        boolean z = false;
        if (booleanRef.element) {
            if (merchandise.quantity == intRef.element && merchandise.autoRenewable() && merchandise.monthType()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (merchandise.quantity == intRef.element && merchandise.noneRenewable() && merchandise.monthType()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: v */
    public static final void m25683v(v290 v290Var, View view) {
        zvf0.r(v290Var.mo11695h(), v290Var.m11751f());
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        v290Var.m11756o(strM5276Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m25684w(v290 v290Var, View view) {
        zvf0.r(v290Var.m25685u(), v290Var.m11751f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("productType", "svip"), vwb.Y("discount_type", "svip_rebuy"), vwb.Y("purchaseShowFrom", "p_navigation,privilege_button")});
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        v290Var.m11756o(strM5276Ie);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        if (g6a.m15597t() || zb90.i() || !xma.m27379e4() || !src0.m24159r().m24165E()) {
            return false;
        }
        Merchandise merchandiseM25681s = m25681s();
        this.merchandise = merchandiseM25681s;
        return NullChecker.a(merchandiseM25681s);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(1);
        this._top_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
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
        return "e_privilege_banner_svipexpired";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.w8);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.t3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.A3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.g6);
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.q8);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(n6a.s0(CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("svip"))));
            xdl0.E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.t290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v290.m25683v(this.f21842a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.E8);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTypeface(eqh0.c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTextColor(Color.parseColor("#E6D35006"));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setText("恢复");
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), true);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(d3c0.J8);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(eqh0.c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E6D35006"));
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            NumberFormat numberFormatB = getPrivilegeEntranceInfo().b();
            Merchandise merchandise = this.merchandise;
            vText.setText(String.format("仅需%s元", Arrays.copyOf(new Object[]{numberFormatB.format((merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) ? null : Double.valueOf(prices.price))}, 1)));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackground(getPrivilegeEntranceInfo().a().drawable(d3c0.Fa));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_tip(), true);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#CCD35006"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            Merchandise merchandise2 = this.merchandise;
            textView.setText(merchandise2 != null ? String.format("购买%s个月会员", Arrays.copyOf(new Object[]{Integer.valueOf(merchandise2.quantity)}, 1)) : null);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#AB3E00"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(eqh0.c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.x8);
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即恢复");
            xdl0.E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.u290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v290.m25684w(this.f22434a, view);
                }
            });
            Merchandise merchandise3 = this.merchandise;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", String.format("%sm", Arrays.copyOf(new Object[]{merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null}, 1))), vwb.Y("discount_type", "svip_rebuy"), vwb.Y("productType", "svip"), vwb.Y("membership_status", m11750e())});
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m25685u() {
        return "e_privilege_button_svipexpired";
    }
}
