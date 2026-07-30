package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePrivilegeTopView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.data.MembershipType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m87232d2 = {"Ll/r290;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "u", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/data/Merchandise;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lcom/p1/mobile/putong/core/data/Merchandise;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePrivilegeTopView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class r290 extends AbstractC15528a5 {

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
    public r290(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final Boolean m177593t(Ref.BooleanRef booleanRef, Ref.IntRef intRef, Merchandise merchandise) {
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
    public static final void m177594v(r290 r290Var, View view) {
        zvf0.m220396r(r290Var.mo94542h(), r290Var.m94952f());
        zvf0.m220399u("e_purchase_button", OMSDialogPositon.p_navigation_view, vwb.m200311Y("productType", "svip"), vwb.m200311Y("discount_type", "svip_rebuy"), vwb.m200311Y("purchaseShowFrom", "p_navigation,privilege_button"));
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        r290Var.m94957o(strMo33339Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m177595w(r290 r290Var, View view) {
        zvf0.m220396r(r290Var.m177597u(), r290Var.m94952f());
        zvf0.m220396r("e_diamond_privilege_entrance", OMSDialogPositon.p_navigation_view);
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        r290Var.m94957o(strMo33315F0);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        if (zb90.m217832i() || !xma.m210071e4() || xma.m210043F3() || !src0.m185656r().m185662E() || !CoreModule.m29935P().m94651a().mo158371f() || !CoreModule.f17545c.f19598Q1.f20117R.m34760N()) {
            return false;
        }
        Merchandise merchandiseM177596s = m177596s();
        this.merchandise = merchandiseM177596s;
        return NullChecker.m81303a(merchandiseM177596s);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(1);
        int iM186103c = svq.m186103c(5);
        this._top_view = (PrivilegeEntrancePrivilegeTopView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PRIVILEGE_TOP_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(70));
        layoutParams.leftMargin = iM186103c;
        layoutParams.topMargin = iM186103c;
        layoutParams.rightMargin = iM186103c;
        layoutParams.bottomMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, layoutParams);
        this._bottom_view = (PrivilegeEntranceODiamondSingleView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.m186103c(52));
        layoutParams2.leftMargin = iM186103c;
        layoutParams2.rightMargin = iM186103c;
        layoutParams2.bottomMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams2);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_svipexpiredodpurchase";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f84097s3);
        PrivilegeEntrancePrivilegeTopView privilegeEntrancePrivilegeTopView = this._top_view;
        if (privilegeEntrancePrivilegeTopView != null) {
            privilegeEntrancePrivilegeTopView.get_texture().setImageResource(d3c0.f84181y3);
            privilegeEntrancePrivilegeTopView.get_border().setBackgroundResource(d3c0.f84111t3);
            privilegeEntrancePrivilegeTopView.get_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(d3c0.f84139v3));
            privilegeEntrancePrivilegeTopView.get_privilege_icon().setImageResource(d3c0.f83622J8);
            privilegeEntrancePrivilegeTopView.get_privilege_text().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72577u));
            privilegeEntrancePrivilegeTopView.get_privilege_text().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePrivilegeTopView.get_privilege_text().setText(n6a.m158031s0(CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("svip"))));
            privilegeEntrancePrivilegeTopView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            VText vText = privilegeEntrancePrivilegeTopView.get_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            NumberFormat numberFormat = getPrivilegeEntranceInfo().getNumberFormat();
            Merchandise merchandise = this.merchandise;
            String str = numberFormat.format((merchandise == null || (stockKeepUnit = merchandise.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) ? null : Double.valueOf(prices.price));
            Merchandise merchandise2 = this.merchandise;
            vText.setText(String.format("仅需%1$s元 即可恢复%2$s个月会员", Arrays.copyOf(new Object[]{str, merchandise2 != null ? Integer.valueOf(merchandise2.quantity) : null}, 2)));
            privilegeEntrancePrivilegeTopView.get_action().setBackgroundResource(d3c0.f83538D8);
            privilegeEntrancePrivilegeTopView.get_action().setTextColor(Color.parseColor("#D35006"));
            privilegeEntrancePrivilegeTopView.get_action().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePrivilegeTopView.get_action().setText("立即恢复");
            xdl0.m208329E0(privilegeEntrancePrivilegeTopView, new View.OnClickListener() { // from class: l.o290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r290.m177594v(this.f141513a, view);
                }
            });
            Merchandise merchandise3 = this.merchandise;
            zvf0.m220368A("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y(BLiveOperationTitleShowType.duration, String.format("%sm", Arrays.copyOf(new Object[]{merchandise3 != null ? Integer.valueOf(merchandise3.quantity) : null}, 1))), vwb.m200311Y("discount_type", "svip_rebuy"), vwb.m200311Y("productType", "svip"), vwb.m200311Y("membership_status", m94951e()));
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (g6a.m124566o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.f84057p5);
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72527Q));
                privilegeEntranceODiamondSingleView.get_arrow_right().setImageResource(d3c0.f84113t5);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.f84041o3);
                qib0.f154691G.m102354Y0(privilegeEntranceODiamondSingleView.get_texture(), d3c0.f84055p3);
            }
            privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.m117752c(3));
            privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
            xdl0.m208344M(privilegeEntranceODiamondSingleView.get_arrow_right(), true);
            xdl0.m208344M(privilegeEntranceODiamondSingleView.get_unlock(), false);
            xdl0.m208329E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.p290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r290.m177595w(this.f146824a, view);
                }
            });
            zvf0.m220402x("e_diamond_privilege_entrance", OMSDialogPositon.p_navigation_view);
        }
    }

    /* JADX INFO: renamed from: s */
    public final Merchandise m177596s() {
        Merchandise merchandiseM185680q;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Object objM200346r = null;
        if (src0.m185656r().m185659B(MembershipType.get("svip"))) {
            merchandiseM185680q = src0.m185656r().m185681s();
            booleanRef.element = false;
        } else if (src0.m185656r().m185661D(MembershipType.get("svip"))) {
            merchandiseM185680q = src0.m185656r().m185680q();
            booleanRef.element = true;
        } else {
            merchandiseM185680q = null;
        }
        if (merchandiseM185680q != null) {
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = merchandiseM185680q.quantity;
            if (TEnum.equals(ProductCategory.get("svip"), merchandiseM185680q.category) && merchandiseM185680q.quarterly()) {
                intRef.element = 6;
            }
            objM200346r = vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(merchandiseM185680q.category), new w9j() { // from class: l.q290
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return r290.m177593t(booleanRef, intRef, (Merchandise) obj);
                }
            });
        }
        return (Merchandise) objM200346r;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m177597u() {
        return "e_privilege_button_svipexpiredodpurchase";
    }
}
