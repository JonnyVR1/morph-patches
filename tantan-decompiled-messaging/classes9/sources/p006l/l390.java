package p006l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
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
import l.d3c0;
import l.e30;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Ll/l390;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "w", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "x", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "lowPriceCallback3SVIPMerchandise", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l390 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Merchandise lowPriceCallback3SVIPMerchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l390(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static final void m18533A(final l390 l390Var, View view) {
        zvf0.r(l390Var.m18545x(), l390Var.m11751f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("purchaseShowFrom", "p_navigation,privilege_button"), vwb.Y("productType", "svip")});
        km80.h0(l390Var.getPrivilegeEntranceInfo().a(), new e30() { // from class: l.k390
            public final void call(Object obj) {
                l390.m18534B(this.f15582a, (Boolean) obj);
            }
        }, zl80.g().d(false), "p_promotion,callback_navigation_banner", (Object) null);
    }

    /* JADX INFO: renamed from: B */
    public static final void m18534B(l390 l390Var, Boolean bool) {
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        l390Var.m11756o(strM5276Ie);
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m18535p(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TEnum.equals(merchandise.category, "svip"));
    }

    /* JADX INFO: renamed from: u */
    public static int m18540u(Merchandise merchandise, Merchandise merchandise2) {
        merchandise.getClass();
        merchandise2.getClass();
        return merchandise.quantity - merchandise2.quantity > 0 ? -1 : 1;
    }

    /* JADX INFO: renamed from: v */
    public static int m18541v(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: w */
    private final Merchandise m18542w(List<? extends Merchandise> merchandises) {
        List<? extends Merchandise> list = merchandises;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (merchandises.size() == 1) {
            return merchandises.get(0);
        }
        final Function2 function2 = new Function2() { // from class: l.h390
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(l390.m18540u((Merchandise) obj, (Merchandise) obj2));
            }
        };
        Collections.sort(merchandises, new Comparator() { // from class: l.i390
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return l390.m18541v(function2, obj, obj2);
            }
        });
        return merchandises.get(0);
    }

    /* JADX INFO: renamed from: y */
    public static final void m18543y(final l390 l390Var, View view) {
        zvf0.r(l390Var.mo11695h(), l390Var.m11751f());
        km80.h0(l390Var.getPrivilegeEntranceInfo().a(), new e30() { // from class: l.j390
            public final void call(Object obj) {
                l390.m18544z(this.f14984a, (Boolean) obj);
            }
        }, zl80.g().d(false), "p_promotion,callback_navigation_banner", (Object) null);
    }

    /* JADX INFO: renamed from: z */
    public static final void m18544z(l390 l390Var, Boolean bool) {
        String strM5384Y3 = CoreModule.m1854P().m11706a().m5384Y3();
        strM5384Y3.getClass();
        l390Var.m11756o(strM5384Y3);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        if (g6a.m15597t() || !zb90.i()) {
            return false;
        }
        Merchandise merchandiseM18542w = m18542w(vwb.n(zl80.g().d(false), new w9j() { // from class: l.e390
            public final Object call(Object obj) {
                return l390.m18535p((Merchandise) obj);
            }
        }));
        this.lowPriceCallback3SVIPMerchandise = merchandiseM18542w;
        return NullChecker.a(merchandiseM18542w);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(1);
        this._top_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
        int iC = svq.c(5);
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
        return "e_privilege_banner_viptosvipcallback";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        String str;
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.Da);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.D3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.B3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.j6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.l6);
            String strF = zb90.f();
            boolean zM24173N = src0.m24159r().m24173N();
            boolean zM24189y = src0.m24159r().m24189y();
            if (zM24173N && zM24189y) {
                strF = CoreModule.m1854P().m11706a().m5412c7();
            }
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(strF);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            privilegeEntranceSingleTextWithIconBgView.get_go().setColorFilter(Color.parseColor("#9D5C36"));
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.va);
            xdl0.E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.f390
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l390.m18543y(this.f11576a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.Ga);
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
            xdl0.E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.g390
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l390.m18533A(this.f13041a, view);
                }
            });
            Merchandise merchandise3 = this.lowPriceCallback3SVIPMerchandise;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", (merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null) + "m"), vwb.Y("discount_type", "low_price_recall"), vwb.Y("productType", "svip")});
        }
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public String m18545x() {
        return "e_privilege_button_viptosvipcallback";
    }
}
