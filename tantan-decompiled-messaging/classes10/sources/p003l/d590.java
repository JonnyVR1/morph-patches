package p003l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceSingleTextView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import l.a5;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.j760;
import l.sj20;
import l.svq;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zl80;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Ll/d590;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "u", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/data/Merchandise;", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "v", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "lowPriceCallback3VIPMerchandise", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class d590 extends a5 {

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
    public d590(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m6062q(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TEnum.equals(merchandise.category, ProductCategory.get(ProductCategory.tttVip)));
    }

    /* JADX INFO: renamed from: s */
    public static int m6064s(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: t */
    public static int m6065t(Merchandise merchandise, Merchandise merchandise2) {
        merchandise.getClass();
        merchandise2.getClass();
        return merchandise.quantity - merchandise2.quantity > 0 ? -1 : 1;
    }

    /* JADX INFO: renamed from: u */
    private final Merchandise m6066u(List<? extends Merchandise> merchandises) {
        List<? extends Merchandise> list = merchandises;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (merchandises.size() == 1) {
            return merchandises.get(0);
        }
        final Function2 function2 = new Function2() { // from class: l.b590
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(d590.m6065t((Merchandise) obj, (Merchandise) obj2));
            }
        };
        Collections.sort(merchandises, new Comparator() { // from class: l.c590
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d590.m6064s(function2, obj, obj2);
            }
        });
        return merchandises.get(0);
    }

    /* JADX INFO: renamed from: w */
    public static final void m6067w(d590 d590Var, View view) {
        zvf0.r(d590Var.m6071h(), d590Var.f());
        if (sj20.a().f()) {
            String strIe = CoreModule.P().a().Ie();
            strIe.getClass();
            d590Var.o(strIe);
        } else {
            String strY3 = CoreModule.P().a().Y3();
            strY3.getClass();
            d590Var.o(strY3);
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m6068x(d590 d590Var, View view) {
        zvf0.r(d590Var.m6073v(), d590Var.f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("purchaseShowFrom", "p_navigation,privilege_button"), vwb.Y("productType", "vip")});
        String strY3 = CoreModule.P().a().Y3();
        strY3.getClass();
        d590Var.o(strY3);
    }

    /* JADX INFO: renamed from: a */
    public boolean m6069a() {
        Merchandise merchandiseM6066u = m6066u(vwb.n(zl80.g().d(false), new w9j() { // from class: l.y490
            public final Object call(Object obj) {
                return d590.m6062q((Merchandise) obj);
            }
        }));
        this.lowPriceCallback3VIPMerchandise = merchandiseM6066u;
        return NullChecker.a(merchandiseM6066u);
    }

    /* JADX INFO: renamed from: b */
    public void m6070b() {
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
    public String m6071h() {
        return "e_privilege_banner_viplowpricecallback";
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
    public void m6072m() {
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
            xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.z490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d590.m6067w(this.f9187a, view);
                }
            });
        }
        ?? r1 = this._bottom_view;
        if (r1 != 0) {
            r1.setBackgroundResource(d3c0.Ea);
            xdl0.M(r1.get_promotion_desc_left(), false);
            r1.get_promotion_icon().setImageResource(d3c0.Ka);
            r1.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            r1.get_promotion_desc().setAlpha(0.9f);
            VText vText = r1.get_promotion_desc();
            Merchandise merchandise = this.lowPriceCallback3VIPMerchandise;
            if (merchandise != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%s卡立减%s元", Arrays.copyOf(new Object[]{merchandise.quantityName(), g().getNumberFormat().format(merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice())}, 2));
            } else {
                str = null;
            }
            vText.setText(str);
            xdl0.M(r1.get_promotion_tip(), false);
            r1.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            TextView textView = r1.get_buy_tip();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Merchandise merchandise2 = this.lowPriceCallback3VIPMerchandise;
            textView.setText(String.format("购买%s个月会员", Arrays.copyOf(new Object[]{merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 1)));
            r1.get_goto_buy().setBackgroundResource(d3c0.j3);
            r1.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            r1.get_goto_buy().setText("使用优惠");
            xdl0.E0(r1.get_goto_buy(), new View.OnClickListener() { // from class: l.a590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d590.m6068x(this.f2732a, view);
                }
            });
            Merchandise merchandise3 = this.lowPriceCallback3VIPMerchandise;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", (merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null) + "m"), vwb.Y("discount_type", "low_price_recall"), vwb.Y("productType", "vip")});
        }
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public String m6073v() {
        return "e_privilege_button_viplowpricecallback";
    }
}
