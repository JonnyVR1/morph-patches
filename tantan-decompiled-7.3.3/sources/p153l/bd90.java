package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.RefundDetail;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 *2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, m88121d2 = {"Ll/bd90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "u", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "", FirebaseAnalytics.Event.REFUND, Constants.KEY_T, "(Ljava/util/List;J)Lcom/p1/mobile/putong/core/data/Merchandise;", "", FirebaseAnalytics.Param.QUANTITY, BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/util/List;IJ)Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "J", "vipUpgradeSVIPRefundAmount", "g", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bd90 extends AbstractC21509y4 {

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
    public bd90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m103598p(int i, Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.quantity == i && merchandise.monthType() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: v */
    public static final void m103601v(bd90 bd90Var, View view) {
        i4g0.m138520r(bd90Var.mo96815h(), bd90Var.m214188f());
        String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
        strMo34450Y3.getClass();
        bd90Var.m214193o(strMo34450Y3);
    }

    /* JADX INFO: renamed from: w */
    public static final void m103602w(bd90 bd90Var, View view) {
        i4g0.m138520r(bd90Var.m103605u(), bd90Var.m214188f());
        i4g0.m138523u("e_purchase_button", OMSDialogPositon.p_navigation_view, jyb.m147494Y("productType", "svip"), jyb.m147494Y("discount_type", "svip_upgrade"), jyb.m147494Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
        strMo34342Ie.getClass();
        bd90Var.m214193o(strMo34342Ie);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        if (dk90.m116230i() && joa.m146386f4()) {
            Optional<RefundDetail> optionalM222761e = CoreModule.f18264c.f20396j0.m31593J4().m222761e();
            if (NullChecker.m82486a(optionalM222761e) && optionalM222761e.isPresent()) {
                RefundDetail refundDetail = optionalM222761e.get();
                if (NullChecker.m82486a(refundDetail) && Math.floor(refundDetail.totalRefundAmount) >= 1.0d) {
                    List<Merchandise> listM31582D5 = CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip"));
                    long jFloor = (long) Math.floor(refundDetail.totalRefundAmount);
                    this.vipUpgradeSVIPRefundAmount = jFloor;
                    Merchandise merchandiseM103604t = m103604t(listM31582D5, jFloor);
                    this.merchandise = merchandiseM103604t;
                    if (NullChecker.m82486a(merchandiseM103604t) && this.vipUpgradeSVIPRefundAmount > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(1);
        this._top_view = (PrivilegeEntranceSingleTextWithIconBgView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(47));
        int iM193530c = txq.m193530c(5);
        layoutParams.leftMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.topMargin = iM193530c;
        layoutParams.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, layoutParams);
        this._bottom_view = (PrivilegeEntrancePromotionBottomView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, txq.m193530c(76));
        layoutParams2.leftMargin = iM193530c;
        layoutParams2.rightMargin = iM193530c;
        layoutParams2.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams2);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_vipupgradesvip";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        String str;
        String str2;
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119195Da);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(jbc0.f119188D3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(jbc0.f119160B3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(jbc0.f119629j6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(jbc0.f119657l6);
            String strM116227f = dk90.m116227f();
            boolean zM213734N = xzc0.m213720r().m213734N();
            boolean zM213750y = xzc0.m213720r().m213750y();
            if (zM213734N && zM213750y) {
                strM116227f = CoreModule.m30933P().m143405a().mo34478c7();
            }
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(strM116227f);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(jbc0.f119801va);
            bnl0.m105509E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.yc90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bd90.m103601v(this.f198397a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(jbc0.f119237Ga);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTextColor(Color.parseColor("#9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setText("升级");
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), true);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(jbc0.f119167Ba);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#9D5C36"));
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vText.setText(String.format("抵扣%s元", Arrays.copyOf(new Object[]{getPrivilegeEntranceInfo().getNumberFormat().format(this.vipUpgradeSVIPRefundAmount)}, 1)));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackground(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(jbc0.f119223Fa));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_tip(), true);
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
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119202E3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即升级");
            bnl0.m105509E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.zc90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bd90.m103602w(this.f203742a, view);
                }
            });
            Merchandise merchandise2 = this.merchandise;
            i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 1))), jyb.m147494Y("discount_type", "svip_upgrade"), jyb.m147494Y("productType", "svip"), jyb.m147494Y("membership_status", m214187e()));
        }
    }

    /* JADX INFO: renamed from: s */
    public final Merchandise m103603s(List<? extends Merchandise> merchandises, final int quantity, long refund) {
        Merchandise merchandise = (Merchandise) jyb.m147529r(merchandises, new qcj() { // from class: l.ad90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bd90.m103598p(quantity, (Merchandise) obj);
            }
        });
        if (!NullChecker.m82486a(merchandise) || ((long) (merchandise.defaultStockKeepUnit.prices.price - refund)) <= 0) {
            return null;
        }
        return merchandise;
    }

    /* JADX INFO: renamed from: t */
    public final Merchandise m103604t(List<? extends Merchandise> merchandises, long refund) {
        Merchandise merchandiseM103603s = m103603s(merchandises, 1, refund);
        if (NullChecker.m82486a(merchandiseM103603s)) {
            return merchandiseM103603s;
        }
        Merchandise merchandiseM103603s2 = m103603s(merchandises, 3, refund);
        if (NullChecker.m82486a(merchandiseM103603s2)) {
            return merchandiseM103603s2;
        }
        Merchandise merchandiseM103603s3 = m103603s(merchandises, 12, refund);
        if (NullChecker.m82486a(merchandiseM103603s3)) {
            return merchandiseM103603s3;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m103605u() {
        return "e_privilege_button_vipupgradesvip";
    }
}
