package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$¨\u0006'"}, m87232d2 = {"Ll/r190;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", BaseSei.f13930X, "(Z)V", "a", "()Z", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "u", "j", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "privilegeEntrancePromotionBottomView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "privilegeEntranceSingleTextWithIconBgView", "Lcom/p1/mobile/putong/core/data/Merchandise;", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandiseNoRenew", "g", "merchandiseRenew", "Ljava/text/DecimalFormat;", "Ljava/text/DecimalFormat;", "format", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class r190 extends AbstractC15528a5 {

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
    public r190(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
        this.format = new DecimalFormat("#.#");
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m177444p(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && TEnum.equals(merchandise.category, ProductCategory.get("oDiamond")) && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m177447s(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && TEnum.equals(merchandise.category, ProductCategory.get("oDiamond")) && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: v */
    public static final void m177449v(r190 r190Var, View view) {
        zvf0.m220396r(r190Var.mo94542h(), r190Var.m94952f());
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        r190Var.m94957o(strMo33339Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m177450w(r190 r190Var, View view) {
        zvf0.m220396r(r190Var.m177453u(), r190Var.m94952f());
        zvf0.m220399u("e_purchase_button", OMSDialogPositon.p_navigation_view, vwb.m200311Y("productType", "diamond"), vwb.m200311Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        r190Var.m94957o(strMo33315F0);
    }

    /* JADX INFO: renamed from: x */
    private final void m177451x(boolean hidden) {
        final PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false, 1, null);
                xdl0.m208344M(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false);
            } else if (privilegeEntranceSingleTextWithIconBgView.getHeight() == 0) {
                xdl0.m208353Q0(privilegeEntranceSingleTextWithIconBgView, new e30() { // from class: l.m190
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        r190.m177452y(this.f130815a, privilegeEntranceSingleTextWithIconBgView, (int[]) obj);
                    }
                });
            } else {
                AbstractC15528a5.m94949l(this, getPrivilegeEntranceInfo().getRoot(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m177452y(r190 r190Var, PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView, int[] iArr) {
        AbstractC15528a5.m94949l(r190Var, r190Var.getPrivilegeEntranceInfo().getRoot(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        if (!g6a.m124571t() && zb90.m217831h() && CoreModule.m29932K().mo30742a().mo165306f() && !xma.m210043F3() && CoreModule.f17545c.f19598Q1.f20117R.m34760N() && zb90.m217830g()) {
            this.merchandiseNoRenew = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30580E4().m221515e(), new w9j() { // from class: l.p190
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return r190.m177447s((Merchandise) obj);
                }
            });
            this.merchandiseRenew = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30580E4().m221515e(), new w9j() { // from class: l.q190
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return r190.m177444p((Merchandise) obj);
                }
            });
            if (NullChecker.m81303a(this.merchandiseNoRenew) && NullChecker.m81303a(this.merchandiseRenew)) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        this.privilegeEntranceSingleTextWithIconBgView = (PrivilegeEntranceSingleTextWithIconBgView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        this.privilegeEntrancePromotionBottomView = (PrivilegeEntrancePromotionBottomView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(47));
        layoutParams.leftMargin = svq.m186103c(5);
        layoutParams.rightMargin = svq.m186103c(5);
        layoutParams.topMargin = svq.m186103c(5);
        layoutParams.bottomMargin = svq.m186103c(5);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEntranceSingleTextWithIconBgView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.m186103c(76));
        layoutParams2.leftMargin = svq.m186103c(5);
        layoutParams2.rightMargin = svq.m186103c(5);
        layoutParams2.bottomMargin = svq.m186103c(5);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEntrancePromotionBottomView, layoutParams2);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_sviptood";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: j */
    public void mo94543j(boolean hidden) {
        if (hidden) {
            m177451x(hidden);
        }
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f84097s3);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.f83525C9);
            privilegeEntranceSingleTextWithIconBgView.get_go().setColorFilter(Color.parseColor("#D35006"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(zb90.m217827d(SummarizedPrivilegesId.get("svip")));
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.f83491A3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f83918f6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.f83932g6);
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.f84111t3);
            xdl0.m208329E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.n190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r190.m177449v(this.f136621a, view);
                }
            });
            m177451x(false);
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.privilegeEntrancePromotionBottomView;
        if (privilegeEntrancePromotionBottomView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Merchandise merchandise = this.merchandiseRenew;
            zvf0.m220368A("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise != null ? Integer.valueOf(merchandise.quantity) : null}, 1))), vwb.m200311Y("productType", "diamond"));
            if (g6a.m124566o()) {
                privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.f84057p5);
                xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f84071q5);
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72520J));
                privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即升级");
                privilegeEntrancePromotionBottomView.get_promotion_tip().setBackgroundResource(d3c0.f83596Ha);
                privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72527Q));
                double dM217834k = zb90.m217834k();
                String str = String.format(Locale.CHINA, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dM217834k)}, 1));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setText(String.format("升级黑金会员抵扣%s元", Arrays.copyOf(new Object[]{this.format.format(dM217834k)}, 1)));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#B3FFD68C"));
                TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
                DecimalFormat decimalFormat = this.format;
                Merchandise merchandise2 = this.merchandiseRenew;
                merchandise2.getClass();
                textView.setText(String.format("首月会员仅需%s元", decimalFormat.format(merchandise2.defaultStockKeepUnit.prices.price - Double.parseDouble(str))));
            } else {
                privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.f83564F6);
                xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f83578G6);
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#EDD7A3"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即升级");
                privilegeEntrancePromotionBottomView.get_promotion_tip().setBackgroundResource(d3c0.f83596Ha);
                privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E8CB8C"));
                double dM217834k2 = zb90.m217834k();
                String str2 = String.format(Locale.CHINA, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dM217834k2)}, 1));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setText(String.format("升级黑金会员抵扣%s元", Arrays.copyOf(new Object[]{this.format.format(dM217834k2)}, 1)));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E0E8CB8C"));
                TextView textView2 = privilegeEntrancePromotionBottomView.get_buy_tip();
                DecimalFormat decimalFormat2 = this.format;
                Merchandise merchandise3 = this.merchandiseRenew;
                merchandise3.getClass();
                textView2.setText(String.format("首月会员仅需%s元", decimalFormat2.format(merchandise3.defaultStockKeepUnit.prices.price - Double.parseDouble(str2))));
            }
            xdl0.m208329E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.o190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r190.m177450w(this.f141416a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m177453u() {
        return "e_privilege_button_sviptood";
    }
}
