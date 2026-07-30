package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceDefaultView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m87232d2 = {"Ll/o090;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "u", "()V", "", Constants.KEY_T, "()Ljava/lang/String;", "", "a", "()Z", "b", "m", "h", BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "Lcom/p1/mobile/putong/core/data/Merchandise;", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class o090 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceDefaultView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceODiamondSingleView _bottom_view;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o090(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m162131q(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: t */
    private final String m162133t() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            return "";
        }
        double firstCouponPrice = rxa0.m181493n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        return merchandise.defaultStockKeepUnit.prices.currencySymbol + getPrivilegeEntranceInfo().getNumberFormat().format(firstCouponPrice);
    }

    /* JADX INFO: renamed from: u */
    private final void m162134u() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(2);
        this.merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get(ProductCategory.tttVip)), new w9j() { // from class: l.n090
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return o090.m162131q((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final void m162135v(o090 o090Var, View view) {
        zvf0.m220396r(o090Var.mo94542h(), o090Var.m94952f());
        if (sj20.m184407a().m184412f()) {
            String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
            strMo33339Ie.getClass();
            o090Var.m94957o(strMo33339Ie);
        } else {
            o090Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().startActivity(CoreModule.m29935P().m94651a().mo33552nk(o090Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", CoreModule.m29935P().m94651a().mo33421Tn()));
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m162136w(o090 o090Var, View view) {
        zvf0.m220399u("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y("privileges_guide_type", "oDiamond"));
        zvf0.m220396r(o090Var.mo123954s(), o090Var.m94952f());
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        o090Var.m94957o(strMo33315F0);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return (xma.m210060Y3() || !sj20.m184407a().m184408b() || zb90.m217832i() || CoreModule.f17545c.f19598Q1.f20117R.m34760N() || !sj20.m184407a().m184410d()) ? false : true;
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        m162134u();
        int iM186103c = svq.m186103c(5);
        this._top_view = (PrivilegeEntranceDefaultView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.DEFAULT_PRIVILEGE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(70));
        layoutParams.leftMargin = iM186103c;
        layoutParams.rightMargin = iM186103c;
        layoutParams.topMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, layoutParams);
        this._bottom_view = (PrivilegeEntranceODiamondSingleView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.m186103c(52));
        layoutParams2.leftMargin = iM186103c;
        layoutParams2.rightMargin = iM186103c;
        layoutParams2.topMargin = iM186103c;
        layoutParams2.bottomMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams2);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_hwbefore24hoddefault";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f83985k3);
        PrivilegeEntranceDefaultView privilegeEntranceDefaultView = this._top_view;
        if (privilegeEntranceDefaultView != null) {
            privilegeEntranceDefaultView.get_texture().setImageResource(d3c0.f83946h6);
            privilegeEntranceDefaultView.get_border().setImageResource(d3c0.f83999l3);
            privilegeEntranceDefaultView.get_arrow_right().setImageResource(d3c0.f83497A9);
            privilegeEntranceDefaultView.get_title().setText(R$string.f27276Q9);
            privilegeEntranceDefaultView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72571r));
            privilegeEntranceDefaultView.get_desc().getPaint().setFakeBoldText(false);
            privilegeEntranceDefaultView.get_desc().setAlpha(0.9f);
            privilegeEntranceDefaultView.get_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72571r));
            String strM162133t = m162133t();
            if (TextUtils.isEmpty(strM162133t)) {
                privilegeEntranceDefaultView.get_desc().setText("解锁VIP会员");
            } else {
                VText vText = privilegeEntranceDefaultView.get_desc();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strString = getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().string(R$string.f27141E6);
                strString.getClass();
                vText.setText(String.format(strString, Arrays.copyOf(new Object[]{strM162133t}, 1)));
            }
            xdl0.m208329E0(privilegeEntranceDefaultView, new View.OnClickListener() { // from class: l.l090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o090.m162135v(this.f125480a, view);
                }
            });
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (g6a.m124566o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.f84057p5);
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.m117752c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72527Q));
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                privilegeEntranceODiamondSingleView.get_unlock().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72520J));
                privilegeEntranceODiamondSingleView.get_unlock().setBackgroundResource(d3c0.f84071q5);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_unlock(), true);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.f84041o3);
                qib0.f154691G.m102354Y0(privilegeEntranceODiamondSingleView.get_texture(), d3c0.f84055p3);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.m117752c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_unlock(), true);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
            }
            xdl0.m208329E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.m090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o090.m162136w(this.f130721a, view);
                }
            });
            zvf0.m220368A("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y("privileges_guide_type", "oDiamond"));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo123954s() {
        return "e_privilege_button_hwbefore24hoddefault";
    }
}
