package p006l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceDefaultView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.b1c0;
import l.d3c0;
import l.rxa0;
import l.svq;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Ll/yz80;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "s", "r", "Lcom/p1/mobile/putong/core/data/Merchandise;", "d", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceDefaultView;", "_default_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yz80 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceDefaultView _default_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz80(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m28475p(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: t */
    public static final void m28477t(yz80 yz80Var, View view) {
        zvf0.r(yz80Var.mo11695h(), yz80Var.m11751f());
        if (sj20.m23814a().m23819f()) {
            String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
            strM5276Ie.getClass();
            yz80Var.m11756o(strM5276Ie);
        } else {
            yz80Var.getPrivilegeEntranceInfo().a().startActivity(CoreModule.m1854P().m11706a().m5489nk(yz80Var.getPrivilegeEntranceInfo().a(), "p_privilege,navigation_banner", CoreModule.m1854P().m11706a().m5358Tn()));
        }
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        return true;
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        m28479s();
        if (this._default_view == null) {
            this._default_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.DEFAULT_PRIVILEGE_VIEW);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(70));
        int iC = svq.c(5);
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.bottomMargin = iC;
        getPrivilegeEntranceInfo().c().addView((View) this._default_view, (ViewGroup.LayoutParams) layoutParams);
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_default";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.k3);
        PrivilegeEntranceDefaultView privilegeEntranceDefaultView = this._default_view;
        if (privilegeEntranceDefaultView != null) {
            privilegeEntranceDefaultView.get_texture().setImageResource(d3c0.h6);
            privilegeEntranceDefaultView.get_border().setImageResource(d3c0.l3);
            privilegeEntranceDefaultView.get_arrow_right().setImageResource(d3c0.A9);
            privilegeEntranceDefaultView.get_title().setText(R.string.Q9);
            privilegeEntranceDefaultView.get_title().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.r));
            privilegeEntranceDefaultView.get_desc().getPaint().setFakeBoldText(false);
            privilegeEntranceDefaultView.get_desc().setAlpha(0.9f);
            privilegeEntranceDefaultView.get_desc().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.r));
            String strM28478r = m28478r();
            if (TextUtils.isEmpty(strM28478r)) {
                privilegeEntranceDefaultView.get_desc().setText("解锁VIP会员");
            } else {
                VText vText = privilegeEntranceDefaultView.get_desc();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strString = getPrivilegeEntranceInfo().a().string(R.string.E6);
                strString.getClass();
                vText.setText(String.format(strString, Arrays.copyOf(new Object[]{strM28478r}, 1)));
            }
            xdl0.E0(privilegeEntranceDefaultView, new View.OnClickListener() { // from class: l.wz80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yz80.m28477t(this.f25506a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final String m28478r() {
        Merchandise merchandise = this.merchandise;
        if (merchandise == null) {
            return "";
        }
        double firstCouponPrice = rxa0.n(merchandise) ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        return merchandise.defaultStockKeepUnit.prices.currencySymbol + getPrivilegeEntranceInfo().b().format(firstCouponPrice);
    }

    /* JADX INFO: renamed from: s */
    public final void m28479s() {
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(2);
        this.merchandise = (Merchandise) vwb.r(CoreModule.f1534c.f3643j0.m2507D5(ProductCategory.get("tttVip")), new w9j() { // from class: l.xz80
            public final Object call(Object obj) {
                return yz80.m28475p((Merchandise) obj);
            }
        });
    }
}
