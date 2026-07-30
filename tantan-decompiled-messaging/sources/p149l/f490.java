package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceSingleTextView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m87232d2 = {"Ll/f490;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "r", "Lcom/p1/mobile/putong/core/data/Merchandise;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "privilegeEntrancePromotionBottomView", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextView;", "privilegeEntranceSingleTextView", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class f490 extends AbstractC15528a5 {

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
    public f490(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m119293s(f490 f490Var, View view) {
        zvf0.m220396r(f490Var.mo94542h(), f490Var.m94952f());
        if (g6a.m124571t()) {
            String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
            int iMo33589sk = CoreModule.m29935P().m94651a().mo33589sk(strMo33339Ie);
            Coupon couponM181488i = rxa0.m181488i(f490Var.merchandise);
            if (couponM181488i != null) {
                CoreModule.m29935P().m94651a().mo33409Sn(f490Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), "p_privilege,navigation_banner", iMo33589sk, true, couponM181488i.f56011id);
                return;
            } else {
                strMo33339Ie.getClass();
                f490Var.m94957o(strMo33339Ie);
                return;
            }
        }
        if (sj20.m184407a().m184412f()) {
            String strMo33339Ie2 = CoreModule.m29935P().m94651a().mo33339Ie();
            strMo33339Ie2.getClass();
            f490Var.m94957o(strMo33339Ie2);
        } else {
            String strMo33447Y3 = CoreModule.m29935P().m94651a().mo33447Y3();
            strMo33447Y3.getClass();
            f490Var.m94957o(strMo33447Y3);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m119294t(f490 f490Var, View view) {
        zvf0.m220396r(f490Var.m119295r(), f490Var.m94952f());
        zvf0.m220396r("e_mytab_svip_freetrial_banner", OMSDialogPositon.p_navigation_view);
        m6h0.m153225k(f490Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), f490Var.merchandise);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        if (zb90.m217832i()) {
            return false;
        }
        Merchandise merchandiseM153223i = m6h0.m153223i();
        this.merchandise = merchandiseM153223i;
        return NullChecker.m81303a(merchandiseM153223i);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        this.privilegeEntranceSingleTextView = (PrivilegeEntranceSingleTextView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_VIEW);
        this.privilegeEntrancePromotionBottomView = (PrivilegeEntrancePromotionBottomView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(47));
        layoutParams.leftMargin = svq.m186103c(5);
        layoutParams.rightMargin = svq.m186103c(5);
        layoutParams.topMargin = svq.m186103c(5);
        layoutParams.bottomMargin = svq.m186103c(5);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEntranceSingleTextView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.m186103c(76));
        layoutParams2.leftMargin = svq.m186103c(5);
        layoutParams2.rightMargin = svq.m186103c(5);
        layoutParams2.bottomMargin = svq.m186103c(5);
        getPrivilegeEntranceInfo().getRoot().addView(this.privilegeEntrancePromotionBottomView, layoutParams2);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_sviptrai";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        int color = Color.parseColor("#7C4708");
        PrivilegeEntranceSingleTextView privilegeEntranceSingleTextView = this.privilegeEntranceSingleTextView;
        if (privilegeEntranceSingleTextView != null) {
            privilegeEntranceSingleTextView.get_texture().setImageResource(d3c0.f83960i6);
            privilegeEntranceSingleTextView.get_go().setImageResource(d3c0.f84146va);
            privilegeEntranceSingleTextView.get_go().setColorFilter(color);
            privilegeEntranceSingleTextView.get_title().setTextColor(color);
            privilegeEntranceSingleTextView.get_title().setText("我的特权");
            privilegeEntranceSingleTextView.get_title().setTypeface(eqh0.m117752c(3));
            privilegeEntranceSingleTextView.setBackgroundResource(d3c0.f83999l3);
            xdl0.m208329E0(privilegeEntranceSingleTextView, new View.OnClickListener() { // from class: l.d490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f490.m119293s(this.f84286a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.privilegeEntrancePromotionBottomView;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f83971j3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("立即领取");
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E09D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_tip().setBackgroundResource(d3c0.f83568Fa);
            privilegeEntrancePromotionBottomView.get_promotion_tip().setText("限时特惠");
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#FF9D5C36"));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText("1元试用7天");
            privilegeEntrancePromotionBottomView.get_promotion_icon().setImageResource(d3c0.f83610Ia);
            TextView textView = privilegeEntrancePromotionBottomView.get_buy_tip();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textView.setText(String.format("优惠将于%s天后到期", Arrays.copyOf(new Object[]{Integer.valueOf(m6h0.m153218d(m6h0.m153219e(this.merchandise)))}, 1)));
            xdl0.m208329E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.e490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f490.m119294t(this.f89259a, view);
                }
            });
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.f83554Ea);
        }
        zvf0.m220402x("e_mytab_svip_freetrial_banner", OMSDialogPositon.p_navigation_view);
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f83526Ca);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String m119295r() {
        return "e_privilege_button_sviptrai";
    }
}
