package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceDefaultView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/w890;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "u", "()V", "", Constants.KEY_T, "()Ljava/lang/String;", "", "a", "()Z", "b", "m", "h", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/core/data/Merchandise;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class w890 extends AbstractC21509y4 {

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
    public w890(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m205402q(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: t */
    private final String m205404t() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            return "";
        }
        double firstCouponPrice = v5b0.m199788n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        return merchandise.defaultStockKeepUnit.prices.currencySymbol + getPrivilegeEntranceInfo().getNumberFormat().format(firstCouponPrice);
    }

    /* JADX INFO: renamed from: u */
    private final void m205405u() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(2);
        this.merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get(ProductCategory.tttVip)), new qcj() { // from class: l.t890
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w890.m205402q((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final void m205406v(w890 w890Var, View view) {
        i4g0.m138520r(w890Var.mo96815h(), w890Var.m214188f());
        if (cs20.m112113a().m112118f()) {
            String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
            strMo34342Ie.getClass();
            w890Var.m214193o(strMo34342Ie);
        } else {
            w890Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().startActivity(CoreModule.m30933P().m143405a().mo34555nk(w890Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", CoreModule.m30933P().m143405a().mo34424Tn()));
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m205407w(w890 w890Var, View view) {
        i4g0.m138520r(w890Var.mo153167s(), w890Var.m214188f());
        i4g0.m138523u("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("privileges_guide_type", "svip"));
        String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
        strMo34342Ie.getClass();
        w890Var.m214193o(strMo34342Ie);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return (joa.m146388g4() || dk90.m116230i() || joa.m146390h4() || !cs20.m112113a().m112115c() || !cs20.m112113a().m112116d()) ? false : true;
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        m205405u();
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(2);
        this._top_view = (PrivilegeEntranceDefaultView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.DEFAULT_PRIVILEGE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(70));
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
        return "e_privilege_banner_hwbefore24hsvipdefault";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119181Ca);
        PrivilegeEntranceDefaultView privilegeEntranceDefaultView = this._top_view;
        if (privilegeEntranceDefaultView != null) {
            privilegeEntranceDefaultView.get_texture().setImageResource(jbc0.f119601h6);
            privilegeEntranceDefaultView.get_border().setImageResource(jbc0.f119654l3);
            privilegeEntranceDefaultView.get_arrow_right().setImageResource(jbc0.f119152A9);
            privilegeEntranceDefaultView.get_title().setText(R$string.f28124Q9);
            privilegeEntranceDefaultView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108391r));
            privilegeEntranceDefaultView.get_desc().getPaint().setFakeBoldText(false);
            privilegeEntranceDefaultView.get_desc().setAlpha(0.9f);
            privilegeEntranceDefaultView.get_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108391r));
            String strM205404t = m205404t();
            if (TextUtils.isEmpty(strM205404t)) {
                privilegeEntranceDefaultView.get_desc().setText("解锁VIP会员");
            } else {
                VText vText = privilegeEntranceDefaultView.get_desc();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strString = getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().string(R$string.f27989E6);
                strString.getClass();
                vText.setText(String.format(strString, Arrays.copyOf(new Object[]{strM205404t}, 1)));
            }
            bnl0.m105509E0(privilegeEntranceDefaultView, new View.OnClickListener() { // from class: l.u890
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w890.m205406v(this.f177995a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(jbc0.f119209Ea);
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), true);
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_icon(), true);
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_desc(), true);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setAlpha(0.9f);
            privilegeEntrancePromotionBottomView.get_promotion_desc_left().setText("解锁");
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_icon(), true);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(jbc0.f119265Ia);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setAlpha(0.9f);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText("会员");
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            textView.setText(String.format("立享查看谁喜欢我等%s项特权", Arrays.copyOf(new Object[]{Integer.valueOf(j690.m143608C())}, 1)));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119626j3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即解锁");
            bnl0.m105509E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.v890
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w890.m205407w(this.f182863a, view);
                }
            });
            i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("privileges_guide_type", "svip"));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo153167s() {
        return "e_privilege_button_hwbefore24hsvipdefault";
    }
}
