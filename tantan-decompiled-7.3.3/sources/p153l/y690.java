package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0012"}, m88121d2 = {"Ll/y690;", "Ll/k690;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "q", "()Ljava/lang/String;", "", "r", "()Z", "", "m", "()V", "h", "Companion", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class y690 extends k690 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y690(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final void m214405t(y690 y690Var, View view) {
        i4g0.m138523u("e_privileges_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("banner_style", "countdown"));
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        y690Var.m214193o(strMo34318F0);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privileges_banner";
    }

    @Override // p153l.k690, p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = getPrivilegeEnhancedPromotionBannerView();
        if (privilegeEnhancedPromotionBannerView != null) {
            bnl0.m105509E0(privilegeEnhancedPromotionBannerView.f29358a, new View.OnClickListener() { // from class: l.x690
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y690.m214405t(this.f192564a, view);
                }
            });
        }
    }

    @Override // p153l.k690
    @NotNull
    /* JADX INFO: renamed from: q */
    public String mo138923q() {
        return MonetizationPromotionsId.lowPriceODiamond;
    }

    @Override // p153l.k690
    /* JADX INFO: renamed from: r */
    public boolean mo138924r() {
        return s7a.m184985n() && p550.INSTANCE.m170608a().m170606m();
    }
}
