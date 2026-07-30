package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.MembershipType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/xc90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "Lcom/p1/mobile/putong/core/data/Merchandise;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lcom/p1/mobile/putong/core/data/Merchandise;", "", "a", "()Z", "", "b", "()V", "m", "", "u", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xc90 extends AbstractC21509y4 {

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
    public xc90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: s */
    private final Merchandise m210138s() {
        final Merchandise merchandiseM213744q;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (xzc0.m213720r().m213723B(MembershipType.get("vip"))) {
            merchandiseM213744q = xzc0.m213720r().m213745s();
            booleanRef.element = false;
        } else if (xzc0.m213720r().m213725D(MembershipType.get("vip"))) {
            merchandiseM213744q = xzc0.m213720r().m213744q();
            booleanRef.element = true;
        } else {
            merchandiseM213744q = null;
        }
        return (Merchandise) (merchandiseM213744q != null ? jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(merchandiseM213744q.category), new qcj() { // from class: l.uc90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xc90.m210139t(booleanRef, merchandiseM213744q, (Merchandise) obj);
            }
        }) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Boolean m210139t(Ref.BooleanRef booleanRef, Merchandise merchandise, Merchandise merchandise2) {
        merchandise2.getClass();
        boolean z = false;
        if (booleanRef.element) {
            if (merchandise2.quantity == merchandise.quantity && merchandise2.autoRenewable() && merchandise2.monthType()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (merchandise2.quantity == merchandise.quantity && merchandise2.noneRenewable() && merchandise2.monthType()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: v */
    public static final void m210140v(xc90 xc90Var, View view) {
        i4g0.m138520r(xc90Var.mo96815h(), xc90Var.m214188f());
        String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
        strMo34450Y3.getClass();
        xc90Var.m214193o(strMo34450Y3);
    }

    /* JADX INFO: renamed from: w */
    public static final void m210141w(xc90 xc90Var, View view) {
        i4g0.m138520r(xc90Var.m210142u(), xc90Var.m214188f());
        i4g0.m138523u("e_purchase_button", OMSDialogPositon.p_navigation_view, jyb.m147494Y("productType", "vip"), jyb.m147494Y("discount_type", "vip_rebuy"), jyb.m147494Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
        strMo34450Y3.getClass();
        xc90Var.m214193o(strMo34450Y3);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        if (!CoreModule.f18264c.f20381e0.m116600p9().isVIPExpired() || joa.m146388g4() || !xzc0.m213720r().m213726E()) {
            return false;
        }
        Merchandise merchandiseM210138s = m210138s();
        this.merchandise = merchandiseM210138s;
        return NullChecker.m82486a(merchandiseM210138s);
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
        return "e_privilege_banner_viprestore";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119181Ca);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(jbc0.f119188D3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(jbc0.f119160B3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(jbc0.f119629j6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(jbc0.f119657l6);
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(jbc0.f119801va);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(z7a.m218876s0(CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("vip"))));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            bnl0.m105509E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.vc90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xc90.m210140v(this.f183349a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(jbc0.f119335Na);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTextColor(Color.parseColor("#9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setText("恢复");
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), true);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(jbc0.f119390Ra);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#9D5C36"));
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            NumberFormat numberFormat = getPrivilegeEntranceInfo().getNumberFormat();
            Merchandise merchandise = this.merchandise;
            vText.setText(String.format("仅需%s元", Arrays.copyOf(new Object[]{numberFormat.format((merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) ? null : Double.valueOf(prices.price))}, 1)));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackground(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(jbc0.f119223Fa));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_tip(), true);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E69D5C36"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            Merchandise merchandise2 = this.merchandise;
            textView.setText(merchandise2 != null ? String.format("购买%s个月会员", Arrays.copyOf(new Object[]{Integer.valueOf(merchandise2.quantity)}, 1)) : null);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119202E3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即解锁");
            bnl0.m105509E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.wc90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xc90.m210141w(this.f188399a, view);
                }
            });
            Merchandise merchandise3 = this.merchandise;
            i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null}, 1))), jyb.m147494Y("discount_type", "vip_rebuy"), jyb.m147494Y("productType", "vip"), jyb.m147494Y("membership_status", m214187e()));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m210142u() {
        return "e_privilege_button_viprestore";
    }
}
