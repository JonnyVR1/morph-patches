package p003l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.Coupon;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceSingleTextView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.a5;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.g6a;
import l.j760;
import l.rxa0;
import l.sj20;
import l.svq;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xni;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Ll/h590;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "s", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "Lcom/p1/mobile/putong/core/data/Merchandise;", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class h590 extends a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h590(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final void m6920t(h590 h590Var, View view) {
        zvf0.r(h590Var.m6925h(), h590Var.f());
        if (sj20.a().f()) {
            String strIe = CoreModule.P().a().Ie();
            strIe.getClass();
            h590Var.o(strIe);
        } else {
            String strY3 = CoreModule.P().a().Y3();
            strY3.getClass();
            h590Var.o(strY3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final void m6921u(h590 h590Var, PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView, View view) {
        zvf0.r(h590Var.m6927s(), h590Var.f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("purchaseShowFrom", "p_navigation,privilege_button"), vwb.Y("productType", "vip")});
        String strY3 = CoreModule.P().a().Y3();
        int iSk = CoreModule.P().a().sk(strY3);
        Merchandise merchandise = h590Var.merchandise;
        List<Coupon> list = merchandise != null ? merchandise.localCoupons : null;
        if (list == null || list.isEmpty()) {
            return;
        }
        Merchandise merchandise2 = h590Var.merchandise;
        Coupon coupon = (Coupon) vwb.r(merchandise2 != null ? merchandise2.localCoupons : null, new w9j() { // from class: l.g590
            public final Object call(Object obj) {
                return h590.m6922v((Coupon) obj);
            }
        });
        if (coupon != null) {
            CoreModule.P().a().Sn(privilegeEntrancePromotionBottomView.getContext(), "p_privilege,navigation_banner", iSk, true, ((DbObject) coupon).id);
        } else {
            strY3.getClass();
            h590Var.o(strY3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Boolean m6922v(Coupon coupon) {
        coupon.getClass();
        return Boolean.valueOf(coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP) && rxa0.r(((DbObject) coupon).id));
    }

    /* JADX INFO: renamed from: a */
    public boolean m6923a() {
        if (!g6a.t() && xni.c() && NullChecker.a(CoreModule.c.j0.D5(ProductCategory.get(ProductCategory.tttVip)))) {
            for (Merchandise merchandise : CoreModule.c.j0.D5(ProductCategory.get(ProductCategory.tttVip))) {
                if (rxa0.l(merchandise, MonetizationPromotionsId.lowPriceCustomerVIP)) {
                    this.merchandise = merchandise;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m6924b() {
        g().getNumberFormat().setMaximumFractionDigits(1);
        int iC = svq.c(5);
        this._top_view = (PrivilegeEntranceSingleTextView) i(g().getAct(), g().getRoot(), PrivilegeViewType.SINGLE_TEXT_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.bottomMargin = iC;
        g().getRoot().addView((View) this._top_view, (ViewGroup.LayoutParams) layoutParams);
        this._bottom_view = (PrivilegeEntrancePromotionBottomView) i(g().getAct(), g().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(76));
        layoutParams2.leftMargin = iC;
        layoutParams2.rightMargin = iC;
        layoutParams2.bottomMargin = iC;
        g().getRoot().addView((View) this._bottom_view, (ViewGroup.LayoutParams) layoutParams2);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m6925h() {
        return "e_privilege_banner_viplowpricecustomer";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextView] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public void m6926m() {
        String str;
        super.m();
        g().getRoot().setBackgroundResource(d3c0.Ca);
        ?? r0 = this._top_view;
        if (r0 != 0) {
            r0.setBackgroundResource(d3c0.l3);
            r0.get_texture().setImageResource(d3c0.i6);
            r0.get_title().setTextColor(g().getAct().color(b1c0.r));
            r0.get_title().setText("我的特权");
            r0.get_title().setTypeface(eqh0.c(3));
            r0.get_go().setColorFilter(Color.parseColor("#7C4708"));
            r0.get_go().setImageResource(d3c0.va);
            xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.e590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h590.m6920t(this.f4257a, view);
                }
            });
        }
        final ?? r1 = this._bottom_view;
        if (r1 != 0) {
            r1.setBackgroundResource(d3c0.Ea);
            xdl0.M(r1.get_promotion_desc_left(), false);
            r1.get_promotion_icon().setImageResource(d3c0.Ka);
            r1.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            r1.get_promotion_desc().setAlpha(0.9f);
            VText vText = r1.get_promotion_desc();
            Merchandise merchandise = this.merchandise;
            if (merchandise != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("首%s%s元", Arrays.copyOf(new Object[]{merchandise.quantityName(), g().getNumberFormat().format(merchandise.getFirstCouponPrice())}, 2));
            } else {
                str = null;
            }
            vText.setText(str);
            r1.get_promotion_tip().setBackgroundResource(d3c0.Fa);
            r1.get_promotion_tip().setText("新客优惠");
            xdl0.M(r1.get_promotion_tip(), true);
            r1.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            Merchandise merchandise2 = this.merchandise;
            if (merchandise2 == null || !merchandise2.weekly()) {
                TextView textView = r1.get_buy_tip();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                Merchandise merchandise3 = this.merchandise;
                textView.setText(String.format("购买%s个月会员", Arrays.copyOf(new Object[]{merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null}, 1)));
            } else {
                TextView textView2 = r1.get_buy_tip();
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                Merchandise merchandise4 = this.merchandise;
                textView2.setText(String.format("购买%s周会员", Arrays.copyOf(new Object[]{merchandise4 != null ? Integer.valueOf(merchandise4.quantity) : null}, 1)));
            }
            r1.get_goto_buy().setBackgroundResource(d3c0.j3);
            r1.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            r1.get_goto_buy().setText("立即解锁");
            xdl0.E0(r1.get_goto_buy(), new View.OnClickListener() { // from class: l.f590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h590.m6921u(this.f4391a, r1, view);
                }
            });
            Merchandise merchandise5 = this.merchandise;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", (merchandise5 != null ? Integer.valueOf(merchandise5.quantity) : null) + "m"), vwb.Y("discount_type", "new_customer"), vwb.Y("productType", "vip")});
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String m6927s() {
        return "e_privilege_button_viplowpricecustomer";
    }
}
