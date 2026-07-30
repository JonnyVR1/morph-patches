package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m88121d2 = {"Ll/hd90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "u", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", ResourceDirection.f39656v, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "lowPriceCallback3VIPMerchandise", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class hd90 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Merchandise lowPriceCallback3VIPMerchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m134578q(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TEnum.equals(merchandise.category, ProductCategory.get(ProductCategory.tttVip)));
    }

    /* JADX INFO: renamed from: s */
    public static int m134580s(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: t */
    public static int m134581t(Merchandise merchandise, Merchandise merchandise2) {
        merchandise.getClass();
        merchandise2.getClass();
        return merchandise.quantity - merchandise2.quantity > 0 ? -1 : 1;
    }

    /* JADX INFO: renamed from: u */
    private final Merchandise m134582u(List<? extends Merchandise> merchandises) {
        List<? extends Merchandise> list = merchandises;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (merchandises.size() == 1) {
            return merchandises.get(0);
        }
        final Function2 function2 = new Function2() { // from class: l.fd90
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(hd90.m134581t((Merchandise) obj, (Merchandise) obj2));
            }
        };
        Collections.sort(merchandises, new Comparator() { // from class: l.gd90
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hd90.m134580s(function2, obj, obj2);
            }
        });
        return merchandises.get(0);
    }

    /* JADX INFO: renamed from: w */
    public static final void m134583w(hd90 hd90Var, View view) {
        i4g0.m138520r(hd90Var.mo96815h(), hd90Var.m214188f());
        if (cs20.m112113a().m112118f()) {
            String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
            strMo34342Ie.getClass();
            hd90Var.m214193o(strMo34342Ie);
        } else {
            String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
            strMo34450Y3.getClass();
            hd90Var.m214193o(strMo34450Y3);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m134584x(hd90 hd90Var, View view) {
        i4g0.m138520r(hd90Var.m134585v(), hd90Var.m214188f());
        i4g0.m138523u("e_purchase_button", OMSDialogPositon.p_navigation_view, jyb.m147494Y("purchaseShowFrom", "p_navigation,privilege_button"), jyb.m147494Y("productType", "vip"));
        String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
        strMo34450Y3.getClass();
        hd90Var.m214193o(strMo34450Y3);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        Merchandise merchandiseM134582u = m134582u(jyb.m147522n(du80.m118106g().m118111d(false), new qcj() { // from class: l.cd90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hd90.m134578q((Merchandise) obj);
            }
        }));
        this.lowPriceCallback3VIPMerchandise = merchandiseM134582u;
        return NullChecker.m82486a(merchandiseM134582u);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(1);
        int iM193530c = txq.m193530c(5);
        this._top_view = (PrivilegeEntranceSingleTextView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(47));
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
        return "e_privilege_banner_viplowpricecallback";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        String str;
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119181Ca);
        PrivilegeEntranceSingleTextView privilegeEntranceSingleTextView = this._top_view;
        if (privilegeEntranceSingleTextView != null) {
            privilegeEntranceSingleTextView.setBackgroundResource(jbc0.f119654l3);
            privilegeEntranceSingleTextView.get_texture().setImageResource(jbc0.f119615i6);
            privilegeEntranceSingleTextView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108391r));
            privilegeEntranceSingleTextView.get_title().setText("我的特权");
            privilegeEntranceSingleTextView.get_title().setTypeface(lyh0.m156283c(3));
            privilegeEntranceSingleTextView.get_go().setColorFilter(Color.parseColor("#7C4708"));
            privilegeEntranceSingleTextView.get_go().setImageResource(jbc0.f119801va);
            bnl0.m105509E0(privilegeEntranceSingleTextView, new View.OnClickListener() { // from class: l.dd90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hd90.m134583w(this.f87867a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(jbc0.f119209Ea);
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_desc_left(), false);
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(jbc0.f119293Ka);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setAlpha(0.9f);
            VText vText = privilegeEntrancePromotionBottomView.get_promotion_desc();
            Merchandise merchandise = this.lowPriceCallback3VIPMerchandise;
            if (merchandise != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%s卡立减%s元", Arrays.copyOf(new Object[]{merchandise.quantityName(), getPrivilegeEntranceInfo().getNumberFormat().format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())}, 2));
            } else {
                str = null;
            }
            vText.setText(str);
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Merchandise merchandise2 = this.lowPriceCallback3VIPMerchandise;
            textView.setText(String.format("购买%s个月会员", Arrays.copyOf(new Object[]{merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 1)));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119626j3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("使用优惠");
            bnl0.m105509E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.ed90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hd90.m134584x(this.f93154a, view);
                }
            });
            Merchandise merchandise3 = this.lowPriceCallback3VIPMerchandise;
            i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y(BLiveOperationTitleShowType.duration, (merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null) + "m"), jyb.m147494Y("discount_type", "low_price_recall"), jyb.m147494Y("productType", "vip"));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public String m134585v() {
        return "e_privilege_button_viplowpricecallback";
    }
}
