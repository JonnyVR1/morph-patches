package p006l;

import android.view.View;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import kotlin.Metadata;
import l.ax40;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0012"}, d2 = {"Ll/uy80;", "Ll/gy80;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "q", "()Ljava/lang/String;", "", "r", "()Z", "", "m", "()V", "h", "Companion", "a", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class uy80 extends gy80 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy80(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final void m25607t(uy80 uy80Var, View view) {
        zvf0.u("e_privileges_banner", "p_navigation_view", new j760[]{vwb.Y("banner_style", "countdown")});
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        uy80Var.m11756o(strM5252F0);
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privileges_banner";
    }

    @Override // p006l.gy80, p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = getPrivilegeEnhancedPromotionBannerView();
        if (privilegeEnhancedPromotionBannerView != null) {
            xdl0.E0(privilegeEnhancedPromotionBannerView.a, new View.OnClickListener() { // from class: l.ty80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    uy80.m25607t(this.f22331a, view);
                }
            });
        }
    }

    @Override // p006l.gy80
    @NotNull
    /* JADX INFO: renamed from: q */
    public String mo14942q() {
        return "lowPriceODiamond";
    }

    @Override // p006l.gy80
    /* JADX INFO: renamed from: r */
    public boolean mo14943r() {
        return g6a.m15591n() && ax40.Companion.a().m();
    }
}
