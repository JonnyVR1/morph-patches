package p006l;

import android.view.View;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import l.d30;
import l.j760;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zl80;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Ll/iz80;", "Ll/gy80;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "q", "()Ljava/lang/String;", "", "r", "()Z", "", "m", "()V", "h", "v", "Companion", "a", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class iz80 extends gy80 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz80(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m17150t(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TEnum.equals(merchandise.category, ProductCategory.get("tttVip")));
    }

    /* JADX INFO: renamed from: w */
    public static final void m17152w(iz80 iz80Var) {
        zvf0.r(iz80Var.m17154v(), iz80Var.m11751f());
    }

    /* JADX INFO: renamed from: x */
    public static final void m17153x(iz80 iz80Var, View view) {
        String strM5384Y3 = CoreModule.m1854P().m11706a().m5384Y3();
        strM5384Y3.getClass();
        iz80Var.m11756o(strM5384Y3);
        zvf0.r(iz80Var.mo11695h(), iz80Var.m11751f());
        zvf0.u("e_privileges_banner", "p_navigation_view", new j760[]{vwb.Y("banner_style", "countdown")});
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_viplowpricecallbackenhance";
    }

    @Override // p006l.gy80, p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = getPrivilegeEnhancedPromotionBannerView();
        if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m(new d30() { // from class: l.fz80
                public final void call() {
                    iz80.m17152w(this.f12992a);
                }
            });
            xdl0.E0(privilegeEnhancedPromotionBannerView.a, new View.OnClickListener() { // from class: l.gz80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iz80.m17153x(this.f13602a, view);
                }
            });
        }
    }

    @Override // p006l.gy80
    @NotNull
    /* JADX INFO: renamed from: q */
    public String mo14942q() {
        return "lowPriceCallback3VIP";
    }

    @Override // p006l.gy80
    /* JADX INFO: renamed from: r */
    public boolean mo14943r() {
        vwb.n(zl80.g().d(false), new w9j() { // from class: l.hz80
            public final Object call(Object obj) {
                return iz80.m17150t((Merchandise) obj);
            }
        });
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public String m17154v() {
        return "e_privilege_button_viplowpricecallbackenhance";
    }
}
