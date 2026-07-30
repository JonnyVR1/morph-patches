package p006l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePrivilegeTopView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.data.MembershipType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.j760;
import l.n6a;
import l.svq;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Ll/r290;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "u", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/data/Merchandise;", "s", "()Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r290 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePrivilegeTopView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceODiamondSingleView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r290(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final Boolean m22613t(Ref.BooleanRef booleanRef, Ref.IntRef intRef, Merchandise merchandise) {
        merchandise.getClass();
        boolean z = false;
        if (booleanRef.element) {
            if (merchandise.quantity == intRef.element && merchandise.autoRenewable() && merchandise.monthType()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (merchandise.quantity == intRef.element && merchandise.noneRenewable() && merchandise.monthType()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: v */
    public static final void m22614v(r290 r290Var, View view) {
        zvf0.r(r290Var.mo11695h(), r290Var.m11751f());
        zvf0.u("e_purchase_button", "p_navigation_view", new j760[]{vwb.Y("productType", "svip"), vwb.Y("discount_type", "svip_rebuy"), vwb.Y("purchaseShowFrom", "p_navigation,privilege_button")});
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        r290Var.m11756o(strM5276Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m22615w(r290 r290Var, View view) {
        zvf0.r(r290Var.m22617u(), r290Var.m11751f());
        zvf0.r("e_diamond_privilege_entrance", "p_navigation_view");
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        r290Var.m11756o(strM5252F0);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        if (zb90.i() || !xma.m27379e4() || xma.m27351F3() || !src0.m24159r().m24165E() || !CoreModule.m1854P().m11706a().m19879f() || !CoreModule.f1534c.f3587Q1.f4106R.m6697N()) {
            return false;
        }
        Merchandise merchandiseM22616s = m22616s();
        this.merchandise = merchandiseM22616s;
        return NullChecker.a(merchandiseM22616s);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(1);
        int iC = svq.c(5);
        this._top_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.PRIVILEGE_TOP_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(70));
        layoutParams.leftMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.bottomMargin = iC;
        getPrivilegeEntranceInfo().c().addView((View) this._top_view, (ViewGroup.LayoutParams) layoutParams);
        this._bottom_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(52));
        layoutParams2.leftMargin = iC;
        layoutParams2.rightMargin = iC;
        layoutParams2.bottomMargin = iC;
        getPrivilegeEntranceInfo().c().addView((View) this._bottom_view, (ViewGroup.LayoutParams) layoutParams2);
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_svipexpiredodpurchase";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.s3);
        PrivilegeEntrancePrivilegeTopView privilegeEntrancePrivilegeTopView = this._top_view;
        if (privilegeEntrancePrivilegeTopView != null) {
            privilegeEntrancePrivilegeTopView.get_texture().setImageResource(d3c0.y3);
            privilegeEntrancePrivilegeTopView.get_border().setBackgroundResource(d3c0.t3);
            privilegeEntrancePrivilegeTopView.get_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().a().drawable(d3c0.v3));
            privilegeEntrancePrivilegeTopView.get_privilege_icon().setImageResource(d3c0.J8);
            privilegeEntrancePrivilegeTopView.get_privilege_text().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.u));
            privilegeEntrancePrivilegeTopView.get_privilege_text().setTypeface(eqh0.c(3));
            privilegeEntrancePrivilegeTopView.get_privilege_text().setText(n6a.s0(CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("svip"))));
            privilegeEntrancePrivilegeTopView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            VText vText = privilegeEntrancePrivilegeTopView.get_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            NumberFormat numberFormatB = getPrivilegeEntranceInfo().b();
            Merchandise merchandise = this.merchandise;
            String str = numberFormatB.format((merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) ? null : Double.valueOf(prices.price));
            Merchandise merchandise2 = this.merchandise;
            vText.setText(String.format("仅需%1$s元 即可恢复%2$s个月会员", Arrays.copyOf(new Object[]{str, merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 2)));
            privilegeEntrancePrivilegeTopView.get_action().setBackgroundResource(d3c0.D8);
            privilegeEntrancePrivilegeTopView.get_action().setTextColor(Color.parseColor("#D35006"));
            privilegeEntrancePrivilegeTopView.get_action().setTypeface(eqh0.c(3));
            privilegeEntrancePrivilegeTopView.get_action().setText("立即恢复");
            xdl0.E0(privilegeEntrancePrivilegeTopView, new View.OnClickListener() { // from class: l.o290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r290.m22614v(this.f17983a, view);
                }
            });
            Merchandise merchandise3 = this.merchandise;
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("duration", String.format("%sm", Arrays.copyOf(new Object[]{merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null}, 1))), vwb.Y("discount_type", "svip_rebuy"), vwb.Y("productType", "svip"), vwb.Y("membership_status", m11750e())});
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (g6a.m15592o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.p5);
                xdl0.M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.Q));
                privilegeEntranceODiamondSingleView.get_arrow_right().setImageResource(d3c0.t5);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.o3);
                qib0.f19782G.m12767Y0(privilegeEntranceODiamondSingleView.get_texture(), d3c0.p3);
            }
            privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.c(3));
            privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
            xdl0.M(privilegeEntranceODiamondSingleView.get_arrow_right(), true);
            xdl0.M(privilegeEntranceODiamondSingleView.get_unlock(), false);
            xdl0.E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.p290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r290.m22615w(this.f18564a, view);
                }
            });
            zvf0.x("e_diamond_privilege_entrance", "p_navigation_view");
        }
    }

    /* JADX INFO: renamed from: s */
    public final Merchandise m22616s() {
        Merchandise merchandiseM24183q;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Object objR = null;
        if (src0.m24159r().m24162B(MembershipType.get("svip"))) {
            merchandiseM24183q = src0.m24159r().m24184s();
            booleanRef.element = false;
        } else if (src0.m24159r().m24164D(MembershipType.get("svip"))) {
            merchandiseM24183q = src0.m24159r().m24183q();
            booleanRef.element = true;
        } else {
            merchandiseM24183q = null;
        }
        if (merchandiseM24183q != null) {
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = merchandiseM24183q.quantity;
            if (TEnum.equals(ProductCategory.get("svip"), merchandiseM24183q.category) && merchandiseM24183q.quarterly()) {
                intRef.element = 6;
            }
            objR = vwb.r(CoreModule.f1534c.f3643j0.m2507D5(merchandiseM24183q.category), new w9j() { // from class: l.q290
                public final Object call(Object obj) {
                    return r290.m22613t(booleanRef, intRef, (Merchandise) obj);
                }
            });
        }
        return (Merchandise) objR;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m22617u() {
        return "e_privilege_button_svipexpiredodpurchase";
    }
}
