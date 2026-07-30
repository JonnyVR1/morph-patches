package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m88121d2 = {"Ll/gc90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "r", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "privilegeEntrancePromotionBottomView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "privilegeEntranceSingleTextWithIconBgView", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gc90 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m129863s(gc90 gc90Var, Merchandise merchandise, View view) {
        i4g0.m138520r(gc90Var.mo96815h(), gc90Var.m214188f());
        if (!s7a.m184991t()) {
            String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
            strMo34450Y3.getClass();
            gc90Var.m214193o(strMo34450Y3);
            return;
        }
        String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
        int iMo34592sk = CoreModule.m30933P().m143405a().mo34592sk(strMo34342Ie);
        Coupon couponM199783i = v5b0.m199783i(merchandise);
        if (couponM199783i != null) {
            CoreModule.m30933P().m143405a().mo34412Sn(gc90Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", iMo34592sk, true, couponM199783i.f56859id);
        } else {
            strMo34342Ie.getClass();
            gc90Var.m214193o(strMo34342Ie);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m129864t(gc90 gc90Var, Merchandise merchandise, View view) {
        i4g0.m138520r(gc90Var.m129865r(), gc90Var.m214188f());
        i4g0.m138520r("e_mytab_svip_freetrial_banner", OMSDialogPositon.p_navigation_view);
        ueh0.m195757k(gc90Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), merchandise);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return dk90.m116230i() && joa.m146386f4() && NullChecker.m82486a(ueh0.m195755i());
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this.privilegeEntranceSingleTextWithIconBgView = (PrivilegeEntranceSingleTextWithIconBgView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        this.privilegeEntrancePromotionBottomView = (PrivilegeEntrancePromotionBottomView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(47));
        layoutParams.leftMargin = txq.m193530c(5);
        layoutParams.rightMargin = txq.m193530c(5);
        layoutParams.topMargin = txq.m193530c(5);
        layoutParams.bottomMargin = txq.m193530c(5);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEntranceSingleTextWithIconBgView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, txq.m193530c(76));
        layoutParams2.leftMargin = txq.m193530c(5);
        layoutParams2.rightMargin = txq.m193530c(5);
        layoutParams2.bottomMargin = txq.m193530c(5);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEntrancePromotionBottomView, layoutParams2);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_viptosviptrail";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        final Merchandise merchandiseM195755i = ueh0.m195755i();
        if (merchandiseM195755i == null) {
            return;
        }
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.privilegeEntranceSingleTextWithIconBgView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(jbc0.f119801va);
            privilegeEntranceSingleTextWithIconBgView.get_go().setColorFilter(Color.parseColor("#9D5C36"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#9D5C36"));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setAlpha(0.9f);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(dk90.m116227f());
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(jbc0.f119349Oa);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(jbc0.f119643k6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(jbc0.f119657l6);
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(jbc0.f119188D3);
            bnl0.m105509E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.ec90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gc90.m129863s(this.f93021a, merchandiseM195755i, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.privilegeEntrancePromotionBottomView;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119202E3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即领取");
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackgroundResource(jbc0.f119223Fa);
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时特惠");
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText("1元试用7天");
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(jbc0.f119279Ja);
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textView.setText(String.format("优惠将于%s天后到期", Arrays.copyOf(new Object[]{Integer.valueOf(ueh0.m195750d(ueh0.m195751e(merchandiseM195755i)))}, 1)));
            bnl0.m105509E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.fc90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    gc90.m129864t(this.f98204a, merchandiseM195755i, view);
                }
            });
            privilegeEntrancePromotionBottomView.setBackgroundResource(jbc0.f119237Ga);
        }
        i4g0.m138526x("e_mytab_svip_freetrial_banner", OMSDialogPositon.p_navigation_view);
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119195Da);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String m129865r() {
        return "e_privilege_button_viptosviptrail";
    }
}
