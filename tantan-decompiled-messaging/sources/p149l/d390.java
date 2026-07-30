package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceSingleTextView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m87232d2 = {"Ll/d390;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", BaseSei.f13930X, "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "w", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "lowPriceCallback3SVIPMerchandise", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class d390 extends AbstractC15528a5 {

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
    public d390(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static final void m109878A(final d390 d390Var, View view) {
        zvf0.m220396r(d390Var.m109890x(), d390Var.m94952f());
        zvf0.m220399u("e_purchase_button", OMSDialogPositon.p_navigation_view, vwb.m200311Y("purchaseShowFrom", "p_navigation,privilege_button"), vwb.m200311Y("productType", "svip"));
        km80.m146459h0(d390Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), new e30() { // from class: l.c390
            @Override // p149l.e30
            public final void call(Object obj) {
                d390.m109879B(this.f78462a, (Boolean) obj);
            }
        }, zl80.m219252g().m219257d(false), "p_promotion,callback_navigation_banner", null);
    }

    /* JADX INFO: renamed from: B */
    public static final void m109879B(d390 d390Var, Boolean bool) {
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        d390Var.m94957o(strMo33339Ie);
    }

    /* JADX INFO: renamed from: p */
    public static int m109880p(Merchandise merchandise, Merchandise merchandise2) {
        merchandise.getClass();
        merchandise2.getClass();
        return merchandise.quantity - merchandise2.quantity > 0 ? -1 : 1;
    }

    /* JADX INFO: renamed from: q */
    public static int m109881q(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m109884t(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TEnum.equals(merchandise.category, "svip"));
    }

    /* JADX INFO: renamed from: y */
    public static final void m109887y(final d390 d390Var, View view) {
        km80.m146459h0(d390Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), new e30() { // from class: l.b390
            @Override // p149l.e30
            public final void call(Object obj) {
                d390.m109888z(this.f72814a, (Boolean) obj);
            }
        }, zl80.m219252g().m219257d(false), "p_promotion,callback_navigation_banner", null);
        zvf0.m220396r(d390Var.mo94542h(), d390Var.m94952f());
    }

    /* JADX INFO: renamed from: z */
    public static final void m109888z(d390 d390Var, Boolean bool) {
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        d390Var.m94957o(strMo33339Ie);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        if (zb90.m217832i()) {
            return false;
        }
        Merchandise merchandiseM109889w = m109889w(vwb.m200339n(zl80.m219252g().m219257d(false), new w9j() { // from class: l.w290
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return d390.m109884t((Merchandise) obj);
            }
        }));
        this.lowPriceCallback3SVIPMerchandise = merchandiseM109889w;
        return NullChecker.m81303a(merchandiseM109889w);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(1);
        int iM186103c = svq.m186103c(5);
        this._top_view = (PrivilegeEntranceSingleTextView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(47));
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
        return "e_privilege_banner_sviplowpricecallback";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        String str;
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f83526Ca);
        PrivilegeEntranceSingleTextView privilegeEntranceSingleTextView = this._top_view;
        if (privilegeEntranceSingleTextView != null) {
            privilegeEntranceSingleTextView.setBackgroundResource(d3c0.f83999l3);
            privilegeEntranceSingleTextView.get_texture().setImageResource(d3c0.f83960i6);
            privilegeEntranceSingleTextView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72571r));
            privilegeEntranceSingleTextView.get_title().setText("我的特权");
            privilegeEntranceSingleTextView.get_title().setTypeface(eqh0.m117752c(3));
            privilegeEntranceSingleTextView.get_go().setColorFilter(Color.parseColor("#7C4708"));
            privilegeEntranceSingleTextView.get_go().setImageResource(d3c0.f84146va);
            xdl0.m208329E0(privilegeEntranceSingleTextView, new View.OnClickListener() { // from class: l.x290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d390.m109887y(this.f189139a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.f83554Ea);
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), false);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(d3c0.f83610Ia);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setAlpha(0.9f);
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            Merchandise merchandise = this.lowPriceCallback3SVIPMerchandise;
            if (merchandise != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%s卡立减%s元", Arrays.copyOf(new Object[]{merchandise.quantityName(), getPrivilegeEntranceInfo().getNumberFormat().format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())}, 2));
            } else {
                str = null;
            }
            vText.setText(str);
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Merchandise merchandise2 = this.lowPriceCallback3SVIPMerchandise;
            textView.setText(String.format("购买%s个月会员", Arrays.copyOf(new Object[]{merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 1)));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f83971j3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("使用优惠");
            xdl0.m208329E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.y290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d390.m109878A(this.f195501a, view);
                }
            });
            Merchandise merchandise3 = this.lowPriceCallback3SVIPMerchandise;
            zvf0.m220368A("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y(BLiveOperationTitleShowType.duration, (merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null) + "m"), vwb.m200311Y("discount_type", "low_price_recall"), vwb.m200311Y("productType", "svip"));
        }
    }

    /* JADX INFO: renamed from: w */
    public final Merchandise m109889w(List<? extends Merchandise> merchandises) {
        List<? extends Merchandise> list = merchandises;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (merchandises.size() == 1) {
            return merchandises.get(0);
        }
        final Function2 function2 = new Function2() { // from class: l.z290
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(d390.m109880p((Merchandise) obj, (Merchandise) obj2));
            }
        };
        Collections.sort(merchandises, new Comparator() { // from class: l.a390
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d390.m109881q(function2, obj, obj2);
            }
        });
        return merchandises.get(0);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public String m109890x() {
        return "e_privilege_button_sviplowpricecallback";
    }
}
