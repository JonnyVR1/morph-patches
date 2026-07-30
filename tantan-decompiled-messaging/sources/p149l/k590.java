package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m87232d2 = {"Ll/k590;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "r", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class k590 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k590(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m144524s(k590 k590Var, View view) {
        zvf0.m220396r(k590Var.mo94542h(), k590Var.m94952f());
        String strMo33447Y3 = CoreModule.m29935P().m94651a().mo33447Y3();
        strMo33447Y3.getClass();
        k590Var.m94957o(strMo33447Y3);
    }

    /* JADX INFO: renamed from: t */
    public static final void m144525t(k590 k590Var, View view) {
        zvf0.m220396r(k590Var.m144526r(), k590Var.m94952f());
        j760[] j760VarArrM185672R = src0.m185656r().m185672R();
        zvf0.m220399u("e_mypage_auto", OMSDialogPositon.p_navigation_view, (j760[]) Arrays.copyOf(j760VarArrM185672R, j760VarArrM185672R.length));
        String str = src0.m185656r().m185676l() ? "my_reauto_button_unauto_order" : "my_reauto_button";
        if (src0.m185656r().m185687z()) {
            src0.m185656r().m185673S(k590Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), str);
            return;
        }
        Act act = k590Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String();
        String strM201089c = w2b0.m201089c("p_navigation,privilege_button", 1);
        strM201089c.getClass();
        C8764c.m53418O1(act, strM201089c, null, null, null, false, null, null, null, 508, null);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return zb90.m217832i() && xma.m210071e4() && src0.m185656r().m185670N() && !src0.m185656r().m185686y();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        this._top_view = (PrivilegeEntranceSingleTextWithIconBgView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(47));
        int iM186103c = svq.m186103c(5);
        layoutParams.leftMargin = iM186103c;
        layoutParams.rightMargin = iM186103c;
        layoutParams.topMargin = iM186103c;
        layoutParams.bottomMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, layoutParams);
        this._bottom_view = (PrivilegeEntrancePromotionBottomView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.m186103c(76));
        layoutParams2.leftMargin = iM186103c;
        layoutParams2.rightMargin = iM186103c;
        layoutParams2.bottomMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams2);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_vipautorecovery";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f83540Da);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.f83533D3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.f83505B3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f83974j6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.f84002l6);
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.f84146va);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(zb90.m217829f());
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            xdl0.m208329E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.i590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k590.m144524s(this.f111537a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.f83680Na);
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText(R$string.f27492j7);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#9D5C36"));
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E69D5C36"));
            privilegeEntrancePromotionBottomView.get_buy_tip().setText("开通订阅即可限时恢复");
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f83547E3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("去恢复");
            xdl0.m208329E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.j590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k590.m144525t(this.f116280a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String m144526r() {
        return "e_privilege_button_vipautorecovery";
    }
}
