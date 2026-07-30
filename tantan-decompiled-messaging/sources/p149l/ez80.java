package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEnhancedPromotionBannerView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0013"}, m87232d2 = {"Ll/ez80;", "Ll/gy80;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "q", "()Ljava/lang/String;", "", "r", "()Z", "", "m", "()V", "h", "w", "Companion", "a", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ez80 extends gy80 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez80(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: v */
    public static Boolean m118897v(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(TEnum.equals(merchandise.category, "svip"));
    }

    /* JADX INFO: renamed from: x */
    public static final void m118898x(ez80 ez80Var) {
        zvf0.m220396r(ez80Var.m118903w(), ez80Var.m94952f());
    }

    /* JADX INFO: renamed from: y */
    public static final void m118899y(final ez80 ez80Var, View view) {
        zvf0.m220396r(ez80Var.mo94542h(), ez80Var.m94952f());
        zvf0.m220399u("e_privileges_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y("banner_style", "countdown"));
        km80.m146459h0(ez80Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), new e30() { // from class: l.dz80
            @Override // p149l.e30
            public final void call(Object obj) {
                ez80.m118900z(this.f88461a, (Boolean) obj);
            }
        }, zl80.m219252g().m219257d(false), "p_promotion,callback_navigation_banner", null);
    }

    /* JADX INFO: renamed from: z */
    public static final void m118900z(ez80 ez80Var, Boolean bool) {
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        ez80Var.m94957o(strMo33339Ie);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_sviplowpricecallbackenhance";
    }

    @Override // p149l.gy80, p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        PrivilegeEnhancedPromotionBannerView privilegeEnhancedPromotionBannerView = getPrivilegeEnhancedPromotionBannerView();
        if (privilegeEnhancedPromotionBannerView != null) {
            privilegeEnhancedPromotionBannerView.m44381m(new d30() { // from class: l.bz80
                @Override // p149l.d30
                public final void call() {
                    ez80.m118898x(this.f78009a);
                }
            });
            xdl0.m208329E0(privilegeEnhancedPromotionBannerView.f28510a, new View.OnClickListener() { // from class: l.cz80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ez80.m118899y(this.f83070a, view);
                }
            });
        }
    }

    @Override // p149l.gy80
    @NotNull
    /* JADX INFO: renamed from: q */
    public String mo118901q() {
        return MonetizationPromotionsId.lowPriceCallback3SVIP;
    }

    @Override // p149l.gy80
    /* JADX INFO: renamed from: r */
    public boolean mo118902r() {
        vwb.m200339n(zl80.m219252g().m219257d(false), new w9j() { // from class: l.az80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ez80.m118897v((Merchandise) obj);
            }
        });
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public String m118903w() {
        return "e_privilege_button_sviplowpricecallbackenhance";
    }
}
