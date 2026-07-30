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
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m88121d2 = {"Ll/w690;", "Ll/k690;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "q", "()Ljava/lang/String;", "", "r", "()Z", "", "m", "()V", "u", "h", "Companion", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class w690 extends k690 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w690(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: v */
    public static final void m205084v(w690 w690Var) {
        i4g0.m138520r(w690Var.m205086u(), w690Var.m214188f());
    }

    /* JADX INFO: renamed from: w */
    public static final void m205085w(w690 w690Var, View view) {
        i4g0.m138520r(w690Var.mo96815h(), w690Var.m214188f());
        i4g0.m138523u("e_privileges_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("banner_style", "countdown"));
        String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
        strMo34450Y3.getClass();
        w690Var.m214193o(strMo34450Y3);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_viplowpricecustomerenhance";
    }

    @Override // p153l.k690, p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = getPrivilegeEnhancedPromotionBannerView();
        if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m45564m(new x20() { // from class: l.u690
                @Override // p153l.x20
                public final void call() {
                    w690.m205084v(this.f177743a);
                }
            });
            bnl0.m105509E0(privilegeEnhancedPromotionBannerView.f29358a, new View.OnClickListener() { // from class: l.v690
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w690.m205085w(this.f182625a, view);
                }
            });
        }
    }

    @Override // p153l.k690
    @NotNull
    /* JADX INFO: renamed from: q */
    public String mo138923q() {
        return MonetizationPromotionsId.lowPriceCustomerVIP;
    }

    @Override // p153l.k690
    /* JADX INFO: renamed from: r */
    public boolean mo138924r() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public String m205086u() {
        return "e_privilege_button_viplowpricecustomerenhance";
    }
}
