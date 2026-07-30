package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceDefaultView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m88121d2 = {"Ll/c890;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f45294s, "r", "Lcom/p1/mobile/putong/core/data/Merchandise;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "_default_view", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class c890 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceDefaultView _default_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c890(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m108348p(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: t */
    public static final void m108350t(c890 c890Var, View view) {
        i4g0.m138520r(c890Var.mo96815h(), c890Var.m214188f());
        if (cs20.m112113a().m112118f()) {
            String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
            strMo34342Ie.getClass();
            c890Var.m214193o(strMo34342Ie);
        } else {
            c890Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().startActivity(CoreModule.m30933P().m143405a().mo34555nk(c890Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", CoreModule.m30933P().m143405a().mo34424Tn()));
        }
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return true;
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        m108352s();
        if (this._default_view == null) {
            this._default_view = (PrivilegeEntranceDefaultView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.DEFAULT_PRIVILEGE_VIEW);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(70));
        int iM193530c = txq.m193530c(5);
        layoutParams.leftMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.topMargin = iM193530c;
        layoutParams.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._default_view, layoutParams);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_default";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119640k3);
        PrivilegeEntranceDefaultView privilegeEntranceDefaultView = this._default_view;
        if (privilegeEntranceDefaultView != null) {
            privilegeEntranceDefaultView.get_texture().setImageResource(jbc0.f119601h6);
            privilegeEntranceDefaultView.get_border().setImageResource(jbc0.f119654l3);
            privilegeEntranceDefaultView.get_arrow_right().setImageResource(jbc0.f119152A9);
            privilegeEntranceDefaultView.get_title().setText(R$string.f28124Q9);
            privilegeEntranceDefaultView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108391r));
            privilegeEntranceDefaultView.get_desc().getPaint().setFakeBoldText(false);
            privilegeEntranceDefaultView.get_desc().setAlpha(0.9f);
            privilegeEntranceDefaultView.get_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108391r));
            String strM108351r = m108351r();
            if (TextUtils.isEmpty(strM108351r)) {
                privilegeEntranceDefaultView.get_desc().setText("解锁VIP会员");
            } else {
                VText vText = privilegeEntranceDefaultView.get_desc();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strString = getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().string(R$string.f27989E6);
                strString.getClass();
                vText.setText(String.format(strString, Arrays.copyOf(new Object[]{strM108351r}, 1)));
            }
            bnl0.m105509E0(privilegeEntranceDefaultView, new View.OnClickListener() { // from class: l.a890
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c890.m108350t(this.f68891a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final String m108351r() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            return "";
        }
        double firstCouponPrice = v5b0.m199788n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        return merchandise.defaultStockKeepUnit.prices.currencySymbol + getPrivilegeEntranceInfo().getNumberFormat().format(firstCouponPrice);
    }

    /* JADX INFO: renamed from: s */
    public final void m108352s() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(2);
        this.merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get(ProductCategory.tttVip)), new qcj() { // from class: l.b890
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return c890.m108348p((Merchandise) obj);
            }
        });
    }
}
