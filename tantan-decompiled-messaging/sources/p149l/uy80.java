package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0012"}, m87232d2 = {"Ll/uy80;", "Ll/gy80;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "q", "()Ljava/lang/String;", "", "r", "()Z", "", "m", "()V", "h", "Companion", "a", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class uy80 extends gy80 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy80(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final void m196261t(uy80 uy80Var, View view) {
        zvf0.m220399u("e_privileges_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y("banner_style", "countdown"));
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        uy80Var.m94957o(strMo33315F0);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privileges_banner";
    }

    @Override // p149l.gy80, p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = getPrivilegeEnhancedPromotionBannerView();
        if (privilegeEnhancedPromotionBannerView != null) {
            xdl0.m208329E0(privilegeEnhancedPromotionBannerView.f28510a, new View.OnClickListener() { // from class: l.ty80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    uy80.m196261t(this.f172564a, view);
                }
            });
        }
    }

    @Override // p149l.gy80
    @NotNull
    /* JADX INFO: renamed from: q */
    public String mo118901q() {
        return MonetizationPromotionsId.lowPriceODiamond;
    }

    @Override // p149l.gy80
    /* JADX INFO: renamed from: r */
    public boolean mo118902r() {
        return g6a.m124565n() && ax40.INSTANCE.m99377a().m99375m();
    }
}
