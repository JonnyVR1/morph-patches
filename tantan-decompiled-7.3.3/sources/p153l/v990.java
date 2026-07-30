package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$¨\u0006'"}, m88121d2 = {"Ll/v990;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", BaseSei.f14624X, "(Z)V", "a", "()Z", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "u", "j", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "privilegeEntrancePromotionBottomView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "privilegeEntranceSingleTextWithIconBgView", "Lcom/p1/mobile/putong/core/data/Merchandise;", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandiseNoRenew", "g", "merchandiseRenew", "Ljava/text/DecimalFormat;", "Ljava/text/DecimalFormat;", "format", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class v990 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandiseNoRenew;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandiseRenew;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final DecimalFormat format;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v990(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
        this.format = new DecimalFormat("#.#");
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m200407p(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && TEnum.equals(merchandise.category, ProductCategory.get("oDiamond")) && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m200410s(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && TEnum.equals(merchandise.category, ProductCategory.get("oDiamond")) && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: v */
    public static final void m200412v(v990 v990Var, View view) {
        i4g0.m138520r(v990Var.mo96815h(), v990Var.m214188f());
        String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
        strMo34342Ie.getClass();
        v990Var.m214193o(strMo34342Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m200413w(v990 v990Var, View view) {
        i4g0.m138520r(v990Var.m200416u(), v990Var.m214188f());
        i4g0.m138523u("e_purchase_button", OMSDialogPositon.p_navigation_view, jyb.m147494Y("productType", "diamond"), jyb.m147494Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        v990Var.m214193o(strMo34318F0);
    }

    /* JADX INFO: renamed from: x */
    private final void m200414x(boolean hidden) {
        final PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false, 1, null);
                bnl0.m105524M(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false);
            } else if (privilegeEntranceSingleTextWithIconBgView.getHeight() == 0) {
                bnl0.m105533Q0(privilegeEntranceSingleTextWithIconBgView, new y20() { // from class: l.q990
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        v990.m200415y(this.f156203a, privilegeEntranceSingleTextWithIconBgView, (int[]) obj);
                    }
                });
            } else {
                AbstractC21509y4.m214185l(this, getPrivilegeEntranceInfo().getRoot(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m200415y(v990 v990Var, PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView, int[] iArr) {
        AbstractC21509y4.m214185l(v990Var, v990Var.getPrivilegeEntranceInfo().getRoot(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        if (!s7a.m184991t() && dk90.m116229h() && CoreModule.m30930K().mo31745a().mo192249f() && !joa.m146357G3() && CoreModule.f18264c.f20340Q1.f20859R.m35763N() && dk90.m116228g()) {
            this.merchandiseNoRenew = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31583E4().m222761e(), new qcj() { // from class: l.t990
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return v990.m200410s((Merchandise) obj);
                }
            });
            this.merchandiseRenew = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31583E4().m222761e(), new qcj() { // from class: l.u990
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return v990.m200407p((Merchandise) obj);
                }
            });
            if (NullChecker.m82486a(this.merchandiseNoRenew) && NullChecker.m82486a(this.merchandiseRenew)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this.privilegeEntranceSingleTextWithIconBgView = (PrivilegeEntranceSingleTextWithIconBgView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        this.privilegeEntrancePromotionBottomView = (PrivilegeEntrancePromotionBottomView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(47));
        layoutParams.leftMargin = txq.m193530c(5);
        layoutParams.rightMargin = txq.m193530c(5);
        layoutParams.topMargin = txq.m193530c(5);
        layoutParams.bottomMargin = txq.m193530c(5);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEntranceSingleTextWithIconBgView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, txq.m193530c(76));
        layoutParams2.leftMargin = txq.m193530c(5);
        layoutParams2.rightMargin = txq.m193530c(5);
        layoutParams2.bottomMargin = txq.m193530c(5);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEntrancePromotionBottomView, layoutParams2);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_sviptood";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: j */
    public void mo96816j(boolean hidden) {
        if (hidden) {
            m200414x(hidden);
        }
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119752s3);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(jbc0.f119180C9);
            privilegeEntranceSingleTextWithIconBgView.get_go().setColorFilter(Color.parseColor("#D35006"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(dk90.m116225d(SummarizedPrivilegesId.get("svip")));
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(jbc0.f119146A3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(jbc0.f119573f6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(jbc0.f119587g6);
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(jbc0.f119766t3);
            bnl0.m105509E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.r990
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v990.m200412v(this.f161798a, view);
                }
            });
            m200414x(false);
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.privilegeEntrancePromotionBottomView;
        if (privilegeEntrancePromotionBottomView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Merchandise merchandise = this.merchandiseRenew;
            i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise != null ? Integer.valueOf(merchandise.quantity) : null}, 1))), jyb.m147494Y("productType", "diamond"));
            if (s7a.m184986o()) {
                privilegeEntrancePromotionBottomView.setBackgroundResource(jbc0.f119712p5);
                bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119726q5);
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108340J));
                privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即升级");
                privilegeEntrancePromotionBottomView.get_promotion_tip().setBackgroundResource(jbc0.f119251Ha);
                privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108347Q));
                double dM116232k = dk90.m116232k();
                String str = String.format(Locale.CHINA, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dM116232k)}, 1));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setText(String.format("升级黑金会员抵扣%s元", Arrays.copyOf(new Object[]{this.format.format(dM116232k)}, 1)));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#B3FFD68C"));
                TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
                DecimalFormat decimalFormat = this.format;
                Merchandise merchandise2 = this.merchandiseRenew;
                merchandise2.getClass();
                textView.setText(String.format("首月会员仅需%s元", decimalFormat.format(merchandise2.defaultStockKeepUnit.prices.price - Double.parseDouble(str))));
            } else {
                privilegeEntrancePromotionBottomView.setBackgroundResource(jbc0.f119219F6);
                bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119233G6);
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#EDD7A3"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即升级");
                privilegeEntrancePromotionBottomView.get_promotion_tip().setBackgroundResource(jbc0.f119251Ha);
                privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E8CB8C"));
                double dM116232k2 = dk90.m116232k();
                String str2 = String.format(Locale.CHINA, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dM116232k2)}, 1));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setText(String.format("升级黑金会员抵扣%s元", Arrays.copyOf(new Object[]{this.format.format(dM116232k2)}, 1)));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E0E8CB8C"));
                TextView textView2 = privilegeEntrancePromotionBottomView.get_buy_tip();
                DecimalFormat decimalFormat2 = this.format;
                Merchandise merchandise3 = this.merchandiseRenew;
                merchandise3.getClass();
                textView2.setText(String.format("首月会员仅需%s元", decimalFormat2.format(merchandise3.defaultStockKeepUnit.prices.price - Double.parseDouble(str2))));
            }
            bnl0.m105509E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.s990
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    v990.m200413w(this.f166915a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m200416u() {
        return "e_privilege_button_sviptood";
    }
}
