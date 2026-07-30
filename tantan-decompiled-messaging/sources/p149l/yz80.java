package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceDefaultView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m87232d2 = {"Ll/yz80;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44446s, "r", "Lcom/p1/mobile/putong/core/data/Merchandise;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "_default_view", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class yz80 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceDefaultView _default_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz80(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m216599p(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: t */
    public static final void m216601t(yz80 yz80Var, View view) {
        zvf0.m220396r(yz80Var.mo94542h(), yz80Var.m94952f());
        if (sj20.m184407a().m184412f()) {
            String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
            strMo33339Ie.getClass();
            yz80Var.m94957o(strMo33339Ie);
        } else {
            yz80Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().startActivity(CoreModule.m29935P().m94651a().mo33552nk(yz80Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", CoreModule.m29935P().m94651a().mo33421Tn()));
        }
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return true;
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        m216603s();
        if (this._default_view == null) {
            this._default_view = (PrivilegeEntranceDefaultView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.DEFAULT_PRIVILEGE_VIEW);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(70));
        int iM186103c = svq.m186103c(5);
        layoutParams.leftMargin = iM186103c;
        layoutParams.rightMargin = iM186103c;
        layoutParams.topMargin = iM186103c;
        layoutParams.bottomMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._default_view, layoutParams);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_default";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f83985k3);
        PrivilegeEntranceDefaultView privilegeEntranceDefaultView = this._default_view;
        if (privilegeEntranceDefaultView != null) {
            privilegeEntranceDefaultView.get_texture().setImageResource(d3c0.f83946h6);
            privilegeEntranceDefaultView.get_border().setImageResource(d3c0.f83999l3);
            privilegeEntranceDefaultView.get_arrow_right().setImageResource(d3c0.f83497A9);
            privilegeEntranceDefaultView.get_title().setText(R$string.f27276Q9);
            privilegeEntranceDefaultView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72571r));
            privilegeEntranceDefaultView.get_desc().getPaint().setFakeBoldText(false);
            privilegeEntranceDefaultView.get_desc().setAlpha(0.9f);
            privilegeEntranceDefaultView.get_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72571r));
            String strM216602r = m216602r();
            if (TextUtils.isEmpty(strM216602r)) {
                privilegeEntranceDefaultView.get_desc().setText("解锁VIP会员");
            } else {
                VText vText = privilegeEntranceDefaultView.get_desc();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strString = getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().string(R$string.f27141E6);
                strString.getClass();
                vText.setText(String.format(strString, Arrays.copyOf(new Object[]{strM216602r}, 1)));
            }
            xdl0.m208329E0(privilegeEntranceDefaultView, new View.OnClickListener() { // from class: l.wz80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yz80.m216601t(this.f188711a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final String m216602r() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            return "";
        }
        double firstCouponPrice = rxa0.m181493n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        return merchandise.defaultStockKeepUnit.prices.currencySymbol + getPrivilegeEntranceInfo().getNumberFormat().format(firstCouponPrice);
    }

    /* JADX INFO: renamed from: s */
    public final void m216603s() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(2);
        this.merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get(ProductCategory.tttVip)), new w9j() { // from class: l.xz80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return yz80.m216599p((Merchandise) obj);
            }
        });
    }
}
