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
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextView;
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
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m88121d2 = {"Ll/jc90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "r", "Lcom/p1/mobile/putong/core/data/Merchandise;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "privilegeEntrancePromotionBottomView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "privilegeEntranceSingleTextView", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jc90 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextView privilegeEntranceSingleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m144352s(jc90 jc90Var, View view) {
        i4g0.m138520r(jc90Var.mo96815h(), jc90Var.m214188f());
        if (s7a.m184991t()) {
            String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
            int iMo34592sk = CoreModule.m30933P().m143405a().mo34592sk(strMo34342Ie);
            Coupon couponM199783i = v5b0.m199783i(jc90Var.merchandise);
            if (couponM199783i != null) {
                CoreModule.m30933P().m143405a().mo34412Sn(jc90Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", iMo34592sk, true, couponM199783i.f56859id);
                return;
            } else {
                strMo34342Ie.getClass();
                jc90Var.m214193o(strMo34342Ie);
                return;
            }
        }
        if (cs20.m112113a().m112118f()) {
            String strMo34342Ie2 = CoreModule.m30933P().m143405a().mo34342Ie();
            strMo34342Ie2.getClass();
            jc90Var.m214193o(strMo34342Ie2);
        } else {
            String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
            strMo34450Y3.getClass();
            jc90Var.m214193o(strMo34450Y3);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m144353t(jc90 jc90Var, View view) {
        i4g0.m138520r(jc90Var.m144354r(), jc90Var.m214188f());
        i4g0.m138520r("e_mytab_svip_freetrial_banner", OMSDialogPositon.p_navigation_view);
        ueh0.m195757k(jc90Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), jc90Var.merchandise);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        if (dk90.m116230i()) {
            return false;
        }
        Merchandise merchandiseM195755i = ueh0.m195755i();
        this.merchandise = merchandiseM195755i;
        return NullChecker.m82486a(merchandiseM195755i);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this.privilegeEntranceSingleTextView = (PrivilegeEntranceSingleTextView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_VIEW);
        this.privilegeEntrancePromotionBottomView = (PrivilegeEntrancePromotionBottomView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(47));
        layoutParams.leftMargin = txq.m193530c(5);
        layoutParams.rightMargin = txq.m193530c(5);
        layoutParams.topMargin = txq.m193530c(5);
        layoutParams.bottomMargin = txq.m193530c(5);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEntranceSingleTextView, layoutParams);
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
        return "e_privilege_banner_sviptrai";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        int color = Color.parseColor("#7C4708");
        PrivilegeEntranceSingleTextView privilegeEntranceSingleTextView = this.privilegeEntranceSingleTextView;
        if (privilegeEntranceSingleTextView != null) {
            privilegeEntranceSingleTextView.get_texture().setImageResource(jbc0.f119615i6);
            privilegeEntranceSingleTextView.get_go().setImageResource(jbc0.f119801va);
            privilegeEntranceSingleTextView.get_go().setColorFilter(color);
            privilegeEntranceSingleTextView.get_title().setTextColor(color);
            privilegeEntranceSingleTextView.get_title().setText("我的特权");
            privilegeEntranceSingleTextView.get_title().setTypeface(lyh0.m156283c(3));
            privilegeEntranceSingleTextView.setBackgroundResource(jbc0.f119654l3);
            bnl0.m105509E0(privilegeEntranceSingleTextView, new View.OnClickListener() { // from class: l.hc90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jc90.m144352s(this.f108683a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.privilegeEntrancePromotionBottomView;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119626j3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即领取");
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackgroundResource(jbc0.f119223Fa);
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时特惠");
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText("1元试用7天");
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(jbc0.f119265Ia);
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textView.setText(String.format("优惠将于%s天后到期", Arrays.copyOf(new Object[]{Integer.valueOf(ueh0.m195750d(ueh0.m195751e(this.merchandise)))}, 1)));
            bnl0.m105509E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.ic90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jc90.m144353t(this.f114290a, view);
                }
            });
            privilegeEntrancePromotionBottomView.setBackgroundResource(jbc0.f119209Ea);
        }
        i4g0.m138526x("e_mytab_svip_freetrial_banner", OMSDialogPositon.p_navigation_view);
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119181Ca);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String m144354r() {
        return "e_privilege_button_sviptrai";
    }
}
