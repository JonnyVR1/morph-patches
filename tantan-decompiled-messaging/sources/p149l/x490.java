package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.RefundDetail;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 *2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, m87232d2 = {"Ll/x490;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "u", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "", FirebaseAnalytics.Event.REFUND, Constants.KEY_T, "(Ljava/util/List;J)Lcom/p1/mobile/putong/core/data/Merchandise;", "", FirebaseAnalytics.Param.QUANTITY, BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/util/List;IJ)Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "J", "vipUpgradeSVIPRefundAmount", "g", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class x490 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long vipUpgradeSVIPRefundAmount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x490(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m206960p(int i, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.quantity == i && merchandise.monthType() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: v */
    public static final void m206963v(x490 x490Var, View view) {
        zvf0.m220396r(x490Var.mo94542h(), x490Var.m94952f());
        String strMo33447Y3 = CoreModule.m29935P().m94651a().mo33447Y3();
        strMo33447Y3.getClass();
        x490Var.m94957o(strMo33447Y3);
    }

    /* JADX INFO: renamed from: w */
    public static final void m206964w(x490 x490Var, View view) {
        zvf0.m220396r(x490Var.m206967u(), x490Var.m94952f());
        zvf0.m220399u("e_purchase_button", OMSDialogPositon.p_navigation_view, vwb.m200311Y("productType", "svip"), vwb.m200311Y("discount_type", "svip_upgrade"), vwb.m200311Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        x490Var.m94957o(strMo33339Ie);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        if (zb90.m217832i() && xma.m210071e4()) {
            Optional<RefundDetail> optionalM221515e = CoreModule.f17545c.f19654j0.m30590J4().m221515e();
            if (NullChecker.m81303a(optionalM221515e) && optionalM221515e.isPresent()) {
                RefundDetail refundDetail = optionalM221515e.get();
                if (NullChecker.m81303a(refundDetail) && Math.floor(refundDetail.totalRefundAmount) >= 1.0d) {
                    List<Merchandise> listM30579D5 = CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip"));
                    long jFloor = (long) Math.floor(refundDetail.totalRefundAmount);
                    this.vipUpgradeSVIPRefundAmount = jFloor;
                    Merchandise merchandiseM206966t = m206966t(listM30579D5, jFloor);
                    this.merchandise = merchandiseM206966t;
                    if (NullChecker.m81303a(merchandiseM206966t) && this.vipUpgradeSVIPRefundAmount > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
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
        return "e_privilege_banner_vipupgradesvip";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        String str;
        String str2;
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f83540Da);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.f83533D3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.f83505B3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f83974j6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.f84002l6);
            String strM217829f = zb90.m217829f();
            boolean zM185670N = src0.m185656r().m185670N();
            boolean zM185686y = src0.m185656r().m185686y();
            if (zM185670N && zM185686y) {
                strM217829f = CoreModule.m29935P().m94651a().mo33475c7();
            }
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(strM217829f);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.f84146va);
            xdl0.m208329E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.u490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x490.m206963v(this.f173709a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.f83582Ga);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTextColor(Color.parseColor("#9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setText("升级");
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), true);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(d3c0.f83512Ba);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#9D5C36"));
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vText.setText(String.format("抵扣%s元", Arrays.copyOf(new Object[]{getPrivilegeEntranceInfo().getNumberFormat().format(this.vipUpgradeSVIPRefundAmount)}, 1)));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackground(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(d3c0.f83568Fa));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_tip(), true);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E69D5C36"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            Merchandise merchandise = this.merchandise;
            if (merchandise != null) {
                if (merchandise.quarterly()) {
                    str2 = "首季会员仅需%s元";
                } else {
                    str2 = merchandise.yearly() ? "首年会员仅需%s元" : "首月会员仅需%s元";
                }
                str = String.format(str2, Arrays.copyOf(new Object[]{getPrivilegeEntranceInfo().getNumberFormat().format(merchandise.defaultStockKeepUnit.prices.price - this.vipUpgradeSVIPRefundAmount)}, 1));
            } else {
                str = null;
            }
            textView.setText(str);
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f83547E3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即升级");
            xdl0.m208329E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.v490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x490.m206964w(this.f179891a, view);
                }
            });
            Merchandise merchandise2 = this.merchandise;
            zvf0.m220368A("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 1))), vwb.m200311Y("discount_type", "svip_upgrade"), vwb.m200311Y("productType", "svip"), vwb.m200311Y("membership_status", m94951e()));
        }
    }

    /* JADX INFO: renamed from: s */
    public final Merchandise m206965s(List<? extends Merchandise> merchandises, final int quantity, long refund) {
        Merchandise merchandise = (Merchandise) vwb.m200346r(merchandises, new w9j() { // from class: l.w490
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x490.m206960p(quantity, (Merchandise) obj);
            }
        });
        if (!NullChecker.m81303a(merchandise) || ((long) (merchandise.defaultStockKeepUnit.prices.price - refund)) <= 0) {
            return null;
        }
        return merchandise;
    }

    /* JADX INFO: renamed from: t */
    public final Merchandise m206966t(List<? extends Merchandise> merchandises, long refund) {
        Merchandise merchandiseM206965s = m206965s(merchandises, 1, refund);
        if (NullChecker.m81303a(merchandiseM206965s)) {
            return merchandiseM206965s;
        }
        Merchandise merchandiseM206965s2 = m206965s(merchandises, 3, refund);
        if (NullChecker.m81303a(merchandiseM206965s2)) {
            return merchandiseM206965s2;
        }
        Merchandise merchandiseM206965s3 = m206965s(merchandises, 12, refund);
        if (NullChecker.m81303a(merchandiseM206965s3)) {
            return merchandiseM206965s3;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m206967u() {
        return "e_privilege_button_vipupgradesvip";
    }
}
