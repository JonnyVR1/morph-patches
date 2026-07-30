package p006l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import l.b1c0;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.j760;
import l.km80;
import l.svq;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zb90;
import l.zl80;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Ll/d390;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "x", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "w", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "lowPriceCallback3SVIPMerchandise", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d390 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Merchandise lowPriceCallback3SVIPMerchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d390(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static final void m13747A(final d390 d390Var, View view) {
        zvf0.r(d390Var.m13759x(), d390Var.m11751f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("purchaseShowFrom", "p_navigation,privilege_button"), vwb.Y("productType", "svip")});
        km80.h0(d390Var.getPrivilegeEntranceInfo().a(), new e30() { // from class: l.c390
            public final void call(Object obj) {
                d390.m13748B(this.f9319a, (Boolean) obj);
            }
        }, zl80.g().d(false), "p_promotion,callback_navigation_banner", (Object) null);
    }

    /* JADX INFO: renamed from: B */
    public static final void m13748B(d390 d390Var, Boolean bool) {
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        d390Var.m11756o(strM5276Ie);
    }

    /* JADX INFO: renamed from: p */
    public static int m13749p(Merchandise merchandise, Merchandise merchandise2) {
        merchandise.getClass();
        merchandise2.getClass();
        return merchandise.quantity - merchandise2.quantity > 0 ? -1 : 1;
    }

    /* JADX INFO: renamed from: q */
    public static int m13750q(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m13753t(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TEnum.equals(merchandise.category, "svip"));
    }

    /* JADX INFO: renamed from: y */
    public static final void m13756y(final d390 d390Var, View view) {
        km80.h0(d390Var.getPrivilegeEntranceInfo().a(), new e30() { // from class: l.b390
            public final void call(Object obj) {
                d390.m13757z(this.f8697a, (Boolean) obj);
            }
        }, zl80.g().d(false), "p_promotion,callback_navigation_banner", (Object) null);
        zvf0.r(d390Var.mo11695h(), d390Var.m11751f());
    }

    /* JADX INFO: renamed from: z */
    public static final void m13757z(d390 d390Var, Boolean bool) {
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        d390Var.m11756o(strM5276Ie);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        if (zb90.i()) {
            return false;
        }
        Merchandise merchandiseM13758w = m13758w(vwb.n(zl80.g().d(false), new w9j() { // from class: l.w290
            public final Object call(Object obj) {
                return d390.m13753t((Merchandise) obj);
            }
        }));
        this.lowPriceCallback3SVIPMerchandise = merchandiseM13758w;
        return NullChecker.a(merchandiseM13758w);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(1);
        int iC = svq.c(5);
        this._top_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.SINGLE_TEXT_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
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
        return "e_privilege_banner_sviplowpricecallback";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        String str;
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.Ca);
        PrivilegeEntranceSingleTextView privilegeEntranceSingleTextView = this._top_view;
        if (privilegeEntranceSingleTextView != null) {
            privilegeEntranceSingleTextView.setBackgroundResource(d3c0.l3);
            privilegeEntranceSingleTextView.get_texture().setImageResource(d3c0.i6);
            privilegeEntranceSingleTextView.get_title().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.r));
            privilegeEntranceSingleTextView.get_title().setText("我的特权");
            privilegeEntranceSingleTextView.get_title().setTypeface(eqh0.c(3));
            privilegeEntranceSingleTextView.get_go().setColorFilter(Color.parseColor("#7C4708"));
            privilegeEntranceSingleTextView.get_go().setImageResource(d3c0.va);
            xdl0.E0(privilegeEntranceSingleTextView, new View.OnClickListener() { // from class: l.x290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d390.m13756y(this.f25676a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.Ea);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), false);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(d3c0.Ia);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setAlpha(0.9f);
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            Merchandise merchandise = this.lowPriceCallback3SVIPMerchandise;
            if (merchandise != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%s卡立减%s元", Arrays.copyOf(new Object[]{merchandise.quantityName(), getPrivilegeEntranceInfo().b().format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())}, 2));
            } else {
                str = null;
            }
            vText.setText(str);
            xdl0.M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Merchandise merchandise2 = this.lowPriceCallback3SVIPMerchandise;
            textView.setText(String.format("购买%s个月会员", Arrays.copyOf(new Object[]{merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 1)));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.j3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("使用优惠");
            xdl0.E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.y290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d390.m13747A(this.f27863a, view);
                }
            });
            Merchandise merchandise3 = this.lowPriceCallback3SVIPMerchandise;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", (merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null) + "m"), vwb.Y("discount_type", "low_price_recall"), vwb.Y("productType", "svip")});
        }
    }

    /* JADX INFO: renamed from: w */
    public final Merchandise m13758w(List<? extends Merchandise> merchandises) {
        List<? extends Merchandise> list = merchandises;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (merchandises.size() == 1) {
            return merchandises.get(0);
        }
        final Function2 function2 = new Function2() { // from class: l.z290
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(d390.m13749p((Merchandise) obj, (Merchandise) obj2));
            }
        };
        Collections.sort(merchandises, new Comparator() { // from class: l.a390
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d390.m13750q(function2, obj, obj2);
            }
        });
        return merchandises.get(0);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public String m13759x() {
        return "e_privilege_button_sviplowpricecallback";
    }
}
