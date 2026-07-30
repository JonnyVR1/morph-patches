package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.data.MembershipType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m87232d2 = {"Ll/v290;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lcom/p1/mobile/putong/core/data/Merchandise;", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "u", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class v290 extends AbstractC15528a5 {

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
    public v290(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final Merchandise m196749s() {
        Merchandise merchandiseM185680q;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Object objM200346r = null;
        if (src0.m185656r().m185659B(MembershipType.get("svip"))) {
            merchandiseM185680q = src0.m185656r().m185681s();
            booleanRef.element = false;
        } else if (src0.m185656r().m185661D(MembershipType.get("svip"))) {
            merchandiseM185680q = src0.m185656r().m185680q();
            booleanRef.element = true;
        } else {
            merchandiseM185680q = null;
        }
        if (merchandiseM185680q != null) {
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = merchandiseM185680q.quantity;
            if (TEnum.equals(ProductCategory.get("svip"), merchandiseM185680q.category) && merchandiseM185680q.quarterly()) {
                intRef.element = 6;
            }
            objM200346r = vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(merchandiseM185680q.category), new w9j() { // from class: l.s290
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return v290.m196750t(booleanRef, intRef, (Merchandise) obj);
                }
            });
        }
        return (Merchandise) objM200346r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Boolean m196750t(Ref.BooleanRef booleanRef, Ref.IntRef intRef, Merchandise merchandise) {
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
    public static final void m196751v(v290 v290Var, View view) {
        zvf0.m220396r(v290Var.mo94542h(), v290Var.m94952f());
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        v290Var.m94957o(strMo33339Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m196752w(v290 v290Var, View view) {
        zvf0.m220396r(v290Var.m196753u(), v290Var.m94952f());
        zvf0.m220399u("e_purchase_button", OMSDialogPositon.p_navigation_view, vwb.m200311Y("productType", "svip"), vwb.m200311Y("discount_type", "svip_rebuy"), vwb.m200311Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        v290Var.m94957o(strMo33339Ie);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        if (g6a.m124571t() || zb90.m217832i() || !xma.m210071e4() || !src0.m185656r().m185662E()) {
            return false;
        }
        Merchandise merchandiseM196749s = m196749s();
        this.merchandise = merchandiseM196749s;
        return NullChecker.m81303a(merchandiseM196749s);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(1);
        this._top_view = (PrivilegeEntranceSingleTextWithIconBgView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(47));
        int iM186103c = svq.m186103c(5);
        layoutParams.leftMargin = iM186103c;
        layoutParams.rightMargin = iM186103c;
        layoutParams.topMargin = iM186103c;
        layoutParams.bottomMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, layoutParams);
        this._bottom_view = (PrivilegeEntrancePromotionBottomView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.m186103c(76));
        layoutParams2.leftMargin = iM186103c;
        layoutParams2.rightMargin = iM186103c;
        layoutParams2.bottomMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams2);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_svipexpired";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f84158w8);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.f84111t3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.f83491A3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f83918f6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.f83932g6);
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.f84074q8);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(n6a.m158031s0(CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("svip"))));
            xdl0.m208329E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.t290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v290.m196751v(this.f167452a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.f83552E8);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTextColor(Color.parseColor("#E6D35006"));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setText("恢复");
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), true);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(d3c0.f83622J8);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E6D35006"));
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            NumberFormat numberFormat = getPrivilegeEntranceInfo().getNumberFormat();
            Merchandise merchandise = this.merchandise;
            vText.setText(String.format("仅需%s元", Arrays.copyOf(new Object[]{numberFormat.format((merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) ? null : Double.valueOf(prices.price))}, 1)));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackground(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(d3c0.f83568Fa));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_tip(), true);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#CCD35006"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            Merchandise merchandise2 = this.merchandise;
            textView.setText(merchandise2 != null ? String.format("购买%s个月会员", Arrays.copyOf(new Object[]{Integer.valueOf(merchandise2.quantity)}, 1)) : null);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#AB3E00"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f84172x8);
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即恢复");
            xdl0.m208329E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.u290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v290.m196752w(this.f173089a, view);
                }
            });
            Merchandise merchandise3 = this.merchandise;
            zvf0.m220368A("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null}, 1))), vwb.m200311Y("discount_type", "svip_rebuy"), vwb.m200311Y("productType", "svip"), vwb.m200311Y("membership_status", m94951e()));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m196753u() {
        return "e_privilege_button_svipexpired";
    }
}
