package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceDefaultView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/s890;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "u", "()V", "", Constants.KEY_T, "()Ljava/lang/String;", "", "a", "()Z", "b", "m", "h", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "Lcom/p1/mobile/putong/core/data/Merchandise;", "f", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class s890 extends AbstractC21509y4 {

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
    public s890(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m185054q(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: t */
    private final String m185056t() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            return "";
        }
        double firstCouponPrice = v5b0.m199788n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        return merchandise.defaultStockKeepUnit.prices.currencySymbol + getPrivilegeEntranceInfo().getNumberFormat().format(firstCouponPrice);
    }

    /* JADX INFO: renamed from: u */
    private final void m185057u() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(2);
        this.merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get(ProductCategory.tttVip)), new qcj() { // from class: l.r890
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return s890.m185054q((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final void m185058v(s890 s890Var, View view) {
        i4g0.m138520r(s890Var.mo96815h(), s890Var.m214188f());
        if (cs20.m112113a().m112118f()) {
            String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
            strMo34342Ie.getClass();
            s890Var.m214193o(strMo34342Ie);
        } else {
            s890Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().startActivity(CoreModule.m30933P().m143405a().mo34555nk(s890Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", CoreModule.m30933P().m143405a().mo34424Tn()));
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m185059w(s890 s890Var, View view) {
        i4g0.m138523u("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("privileges_guide_type", "oDiamond"));
        i4g0.m138520r(s890Var.mo148687s(), s890Var.m214188f());
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        s890Var.m214193o(strMo34318F0);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return (joa.m146374Z3() || !cs20.m112113a().m112114b() || dk90.m116230i() || CoreModule.f18264c.f20340Q1.f20859R.m35763N() || !cs20.m112113a().m112116d()) ? false : true;
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        m185057u();
        int iM193530c = txq.m193530c(5);
        this._top_view = (PrivilegeEntranceDefaultView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.DEFAULT_PRIVILEGE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(70));
        layoutParams.leftMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.topMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, layoutParams);
        this._bottom_view = (PrivilegeEntranceODiamondSingleView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, txq.m193530c(52));
        layoutParams2.leftMargin = iM193530c;
        layoutParams2.rightMargin = iM193530c;
        layoutParams2.topMargin = iM193530c;
        layoutParams2.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams2);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_hwbefore24hoddefault";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119640k3);
        PrivilegeEntranceDefaultView privilegeEntranceDefaultView = this._top_view;
        if (privilegeEntranceDefaultView != null) {
            privilegeEntranceDefaultView.get_texture().setImageResource(jbc0.f119601h6);
            privilegeEntranceDefaultView.get_border().setImageResource(jbc0.f119654l3);
            privilegeEntranceDefaultView.get_arrow_right().setImageResource(jbc0.f119152A9);
            privilegeEntranceDefaultView.get_title().setText(R$string.f28124Q9);
            privilegeEntranceDefaultView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108391r));
            privilegeEntranceDefaultView.get_desc().getPaint().setFakeBoldText(false);
            privilegeEntranceDefaultView.get_desc().setAlpha(0.9f);
            privilegeEntranceDefaultView.get_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108391r));
            String strM185056t = m185056t();
            if (TextUtils.isEmpty(strM185056t)) {
                privilegeEntranceDefaultView.get_desc().setText("解锁VIP会员");
            } else {
                VText vText = privilegeEntranceDefaultView.get_desc();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strString = getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().string(R$string.f27989E6);
                strString.getClass();
                vText.setText(String.format(strString, Arrays.copyOf(new Object[]{strM185056t}, 1)));
            }
            bnl0.m105509E0(privilegeEntranceDefaultView, new View.OnClickListener() { // from class: l.p890
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s890.m185058v(this.f150999a, view);
                }
            });
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (s7a.m184986o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(jbc0.f119712p5);
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(lyh0.m156283c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108347Q));
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                privilegeEntranceODiamondSingleView.get_unlock().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108340J));
                privilegeEntranceODiamondSingleView.get_unlock().setBackgroundResource(jbc0.f119726q5);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_unlock(), true);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(jbc0.f119696o3);
                uqb0.f180374G.m127138Y0(privilegeEntranceODiamondSingleView.get_texture(), jbc0.f119710p3);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(lyh0.m156283c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_unlock(), true);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
            }
            bnl0.m105509E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.q890
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s890.m185059w(this.f156086a, view);
                }
            });
            i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("privileges_guide_type", "oDiamond"));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String mo148687s() {
        return "e_privilege_button_hwbefore24hoddefault";
    }
}
