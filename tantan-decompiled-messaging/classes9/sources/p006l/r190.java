package p006l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.b1c0;
import l.d3c0;
import l.e30;
import l.j760;
import l.svq;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$¨\u0006'"}, d2 = {"Ll/r190;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", "x", "(Z)V", "a", "()Z", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "u", "j", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "privilegeEntrancePromotionBottomView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "privilegeEntranceSingleTextWithIconBgView", "Lcom/p1/mobile/putong/core/data/Merchandise;", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandiseNoRenew", "g", "merchandiseRenew", "Ljava/text/DecimalFormat;", "Ljava/text/DecimalFormat;", "format", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r190 extends AbstractC0495a5 {

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
    public r190(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
        this.format = new DecimalFormat("#.#");
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m22582p(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && TEnum.equals(merchandise.category, ProductCategory.get("oDiamond")) && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m22585s(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && TEnum.equals(merchandise.category, ProductCategory.get("oDiamond")) && merchandise.noneRenewable());
    }

    /* JADX INFO: renamed from: v */
    public static final void m22587v(r190 r190Var, View view) {
        zvf0.r(r190Var.mo11695h(), r190Var.m11751f());
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        r190Var.m11756o(strM5276Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m22588w(r190 r190Var, View view) {
        zvf0.r(r190Var.m22591u(), r190Var.m11751f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("productType", "diamond"), vwb.Y("purchaseShowFrom", "p_navigation,privilege_button")});
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        r190Var.m11756o(strM5252F0);
    }

    /* JADX INFO: renamed from: x */
    private final void m22589x(boolean hidden) {
        final PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false, 1, (Object) null);
                xdl0.M(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false);
            } else if (privilegeEntranceSingleTextWithIconBgView.getHeight() == 0) {
                xdl0.Q0(privilegeEntranceSingleTextWithIconBgView, new e30() { // from class: l.m190
                    public final void call(Object obj) {
                        r190.m22590y(this.f16746a, privilegeEntranceSingleTextWithIconBgView, (int[]) obj);
                    }
                });
            } else {
                AbstractC0495a5.m11748l(this, getPrivilegeEntranceInfo().c(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m22590y(r190 r190Var, PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView, int[] iArr) {
        AbstractC0495a5.m11748l(r190Var, r190Var.getPrivilegeEntranceInfo().c(), privilegeEntranceSingleTextWithIconBgView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        if (!g6a.m15597t() && zb90.h() && CoreModule.m1851K().a().f() && !xma.m27351F3() && CoreModule.f1534c.f3587Q1.f4106R.m6697N() && zb90.g()) {
            this.merchandiseNoRenew = (Merchandise) vwb.r((Collection) CoreModule.f1534c.f3643j0.m2508E4().e(), new w9j() { // from class: l.p190
                public final Object call(Object obj) {
                    return r190.m22585s((Merchandise) obj);
                }
            });
            this.merchandiseRenew = (Merchandise) vwb.r((Collection) CoreModule.f1534c.f3643j0.m2508E4().e(), new w9j() { // from class: l.q190
                public final Object call(Object obj) {
                    return r190.m22582p((Merchandise) obj);
                }
            });
            if (NullChecker.a(this.merchandiseNoRenew) && NullChecker.a(this.merchandiseRenew)) {
                return true;
            }
        }
        return false;
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        this.privilegeEntranceSingleTextWithIconBgView = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        this.privilegeEntrancePromotionBottomView = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
        layoutParams.leftMargin = svq.c(5);
        layoutParams.rightMargin = svq.c(5);
        layoutParams.topMargin = svq.c(5);
        layoutParams.bottomMargin = svq.c(5);
        getPrivilegeEntranceInfo().c().addView((View) this.privilegeEntranceSingleTextWithIconBgView, (ViewGroup.LayoutParams) layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(76));
        layoutParams2.leftMargin = svq.c(5);
        layoutParams2.rightMargin = svq.c(5);
        layoutParams2.bottomMargin = svq.c(5);
        getPrivilegeEntranceInfo().c().addView((View) this.privilegeEntrancePromotionBottomView, (ViewGroup.LayoutParams) layoutParams2);
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_sviptood";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: j */
    public void mo11696j(boolean hidden) {
        if (hidden) {
            m22589x(hidden);
        }
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.s3);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.C9);
            privilegeEntranceSingleTextWithIconBgView.get_go().setColorFilter(Color.parseColor("#D35006"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(zb90.d(SummarizedPrivilegesId.get("svip")));
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.A3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.g6);
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.t3);
            xdl0.E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.n190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r190.m22587v(this.f17439a, view);
                }
            });
            m22589x(false);
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.privilegeEntrancePromotionBottomView;
        if (privilegeEntrancePromotionBottomView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Merchandise merchandise = this.merchandiseRenew;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", String.format("%sm", Arrays.copyOf(new Object[]{merchandise != null ? Integer.valueOf(merchandise.quantity) : null}, 1))), vwb.Y("productType", "diamond")});
            if (g6a.m15592o()) {
                privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.p5);
                xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.q5);
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.J));
                privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即升级");
                privilegeEntrancePromotionBottomView.get_promotion_tip().setBackgroundResource(d3c0.Ha);
                privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.Q));
                double dK = zb90.k();
                String str = String.format(Locale.CHINA, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dK)}, 1));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setText(String.format("升级黑金会员抵扣%s元", Arrays.copyOf(new Object[]{this.format.format(dK)}, 1)));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#B3FFD68C"));
                TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
                DecimalFormat decimalFormat = this.format;
                Merchandise merchandise2 = this.merchandiseRenew;
                merchandise2.getClass();
                textView.setText(String.format("首月会员仅需%s元", decimalFormat.format(merchandise2.defaultStockKeepUnit.prices.price - Double.parseDouble(str))));
            } else {
                privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.F6);
                xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
                privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.G6);
                privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#EDD7A3"));
                privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即升级");
                privilegeEntrancePromotionBottomView.get_promotion_tip().setBackgroundResource(d3c0.Ha);
                privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时立减");
                privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E8CB8C"));
                double dK2 = zb90.k();
                String str2 = String.format(Locale.CHINA, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dK2)}, 1));
                privilegeEntrancePromotionBottomView.get_promotion_desc().setText(String.format("升级黑金会员抵扣%s元", Arrays.copyOf(new Object[]{this.format.format(dK2)}, 1)));
                privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E0E8CB8C"));
                TextView textView2 = privilegeEntrancePromotionBottomView.get_buy_tip();
                DecimalFormat decimalFormat2 = this.format;
                Merchandise merchandise3 = this.merchandiseRenew;
                merchandise3.getClass();
                textView2.setText(String.format("首月会员仅需%s元", decimalFormat2.format(merchandise3.defaultStockKeepUnit.prices.price - Double.parseDouble(str2))));
            }
            xdl0.E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.o190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r190.m22588w(this.f17977a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m22591u() {
        return "e_privilege_button_sviptood";
    }
}
