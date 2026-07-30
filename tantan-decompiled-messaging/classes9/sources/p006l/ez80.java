package p006l;

import android.view.View;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import l.d30;
import l.e30;
import l.j760;
import l.km80;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zl80;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Ll/ez80;", "Ll/gy80;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "q", "()Ljava/lang/String;", "", "r", "()Z", "", "m", "()V", "h", "w", "Companion", "a", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ez80 extends gy80 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez80(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: v */
    public static Boolean m14938v(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TEnum.equals(merchandise.category, "svip"));
    }

    /* JADX INFO: renamed from: x */
    public static final void m14939x(ez80 ez80Var) {
        zvf0.r(ez80Var.m14944w(), ez80Var.m11751f());
    }

    /* JADX INFO: renamed from: y */
    public static final void m14940y(final ez80 ez80Var, View view) {
        zvf0.r(ez80Var.mo11695h(), ez80Var.m11751f());
        zvf0.u("e_privileges_banner", "p_navigation_view", new j760[]{vwb.Y("banner_style", "countdown")});
        km80.h0(ez80Var.getPrivilegeEntranceInfo().a(), new e30() { // from class: l.dz80
            public final void call(Object obj) {
                ez80.m14941z(this.f10665a, (Boolean) obj);
            }
        }, zl80.g().d(false), "p_promotion,callback_navigation_banner", (Object) null);
    }

    /* JADX INFO: renamed from: z */
    public static final void m14941z(ez80 ez80Var, Boolean bool) {
        String strM5276Ie = CoreModule.m1854P().m11706a().m5276Ie();
        strM5276Ie.getClass();
        ez80Var.m11756o(strM5276Ie);
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_sviplowpricecallbackenhance";
    }

    @Override // p006l.gy80, p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = getPrivilegeEnhancedPromotionBannerView();
        if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m(new d30() { // from class: l.bz80
                public final void call() {
                    ez80.m14939x(this.f9236a);
                }
            });
            xdl0.E0(privilegeEnhancedPromotionBannerView.a, new View.OnClickListener() { // from class: l.cz80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ez80.m14940y(this.f9944a, view);
                }
            });
        }
    }

    @Override // p006l.gy80
    @NotNull
    /* JADX INFO: renamed from: q */
    public String mo14942q() {
        return "lowPriceCallback3SVIP";
    }

    @Override // p006l.gy80
    /* JADX INFO: renamed from: r */
    public boolean mo14943r() {
        vwb.n(zl80.g().d(false), new w9j() { // from class: l.az80
            public final Object call(Object obj) {
                return ez80.m14938v((Merchandise) obj);
            }
        });
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public String m14944w() {
        return "e_privilege_button_sviplowpricecallbackenhance";
    }
}
