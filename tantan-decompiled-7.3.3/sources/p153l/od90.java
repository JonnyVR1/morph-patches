package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m88121d2 = {"Ll/od90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "r", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class od90 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m167284s(od90 od90Var, View view) {
        i4g0.m138520r(od90Var.mo96815h(), od90Var.m214188f());
        String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
        strMo34450Y3.getClass();
        od90Var.m214193o(strMo34450Y3);
    }

    /* JADX INFO: renamed from: t */
    public static final void m167285t(od90 od90Var, View view) {
        i4g0.m138520r(od90Var.m167286r(), od90Var.m214188f());
        pf60[] pf60VarArrM213736R = xzc0.m213720r().m213736R();
        i4g0.m138523u("e_mypage_auto", OMSDialogPositon.p_navigation_view, (pf60[]) Arrays.copyOf(pf60VarArrM213736R, pf60VarArrM213736R.length));
        String str = xzc0.m213720r().m213740l() ? "my_reauto_button_unauto_order" : "my_reauto_button";
        if (xzc0.m213720r().m213751z()) {
            xzc0.m213720r().m213737S(od90Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), str);
            return;
        }
        Act act = od90Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String();
        String strM96736c = abb0.m96736c("p_navigation,privilege_button", 1);
        strM96736c.getClass();
        C8927c.m54601O1(act, strM96736c, null, null, null, false, null, null, null, 508, null);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return dk90.m116230i() && joa.m146386f4() && xzc0.m213720r().m213734N() && !xzc0.m213720r().m213750y();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this._top_view = (PrivilegeEntranceSingleTextWithIconBgView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(47));
        int iM193530c = txq.m193530c(5);
        layoutParams.leftMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.topMargin = iM193530c;
        layoutParams.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, layoutParams);
        this._bottom_view = (PrivilegeEntrancePromotionBottomView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, txq.m193530c(76));
        layoutParams2.leftMargin = iM193530c;
        layoutParams2.rightMargin = iM193530c;
        layoutParams2.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams2);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_vipautorecovery";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119195Da);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(jbc0.f119188D3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(jbc0.f119160B3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(jbc0.f119629j6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(jbc0.f119657l6);
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(jbc0.f119801va);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(dk90.m116227f());
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E69D5C36"));
            bnl0.m105509E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.md90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    od90.m167284s(this.f135880a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(jbc0.f119335Na);
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText(R$string.f28340j7);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#9D5C36"));
            bnl0.m105524M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#E69D5C36"));
            privilegeEntrancePromotionBottomView.get_buy_tip().setText("开通订阅即可限时恢复");
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(lyh0.m156283c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(jbc0.f119202E3);
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("去恢复");
            bnl0.m105509E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.nd90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    od90.m167285t(this.f141468a, view);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String m167286r() {
        return "e_privilege_button_vipautorecovery";
    }
}
