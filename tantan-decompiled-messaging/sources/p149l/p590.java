package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceGuideSigningView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m87232d2 = {"Ll/p590;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", BLiveStormDanmakuGiftResourceType.f44446s, "()Ljava/lang/String;", "h", "isSvip", "r", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class p590 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceGuideSigningView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p590(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final void m167464t(p590 p590Var, View view) {
        zvf0.m220396r(p590Var.mo94542h(), p590Var.m94952f());
        String strMo33447Y3 = CoreModule.m29935P().m94651a().mo33447Y3();
        strMo33447Y3.getClass();
        p590Var.m94957o(strMo33447Y3);
    }

    /* JADX INFO: renamed from: u */
    public static final void m167465u(p590 p590Var, View view) {
        p590Var.m167466r(false);
        zvf0.m220396r(p590Var.m167467s(), p590Var.m94952f());
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return src0.m185656r().m185676l() && src0.m185656r().m185663F();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        this._top_view = (PrivilegeEntranceHasPrivilegeView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, new LinearLayout.LayoutParams(-2, svq.m186103c(80)));
        this._bottom_view = (PrivilegeEntranceGuideSigningView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.GUIDE_SIGNING_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(52));
        int iM186103c = svq.m186103c(5);
        layoutParams.leftMargin = iM186103c;
        layoutParams.rightMargin = iM186103c;
        layoutParams.bottomMargin = iM186103c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_vipautopurchase";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f83519C3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.f84195z3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.f83533D3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(d3c0.f83561F3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.f84002l6);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72573s));
            String strM217827d = zb90.m217827d(SummarizedPrivilegesId.get("vip"));
            boolean zM185670N = src0.m185656r().m185670N();
            boolean zM185686y = src0.m185656r().m185686y();
            if (zM185670N && zM185686y) {
                strM217827d = CoreModule.m29935P().m94651a().mo33475c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strM217827d);
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.f83497A9);
            xdl0.m208329E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.n590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p590.m167464t(this.f137198a, view);
                }
            });
        }
        PrivilegeEntranceGuideSigningView privilegeEntranceGuideSigningView = this._bottom_view;
        if (privilegeEntranceGuideSigningView != null) {
            privilegeEntranceGuideSigningView.setBackgroundResource(d3c0.f83539D9);
            privilegeEntranceGuideSigningView.get_title().setTypeface(eqh0.m117752c(3));
            privilegeEntranceGuideSigningView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72573s));
            privilegeEntranceGuideSigningView.get_title().setText(src0.m185644Q(false));
            privilegeEntranceGuideSigningView.get_restore().setTypeface(eqh0.m117752c(3));
            privilegeEntranceGuideSigningView.get_restore().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntranceGuideSigningView.get_restore().setBackgroundResource(d3c0.f83547E3);
            privilegeEntranceGuideSigningView.get_restore().setText("去开通");
            xdl0.m208329E0(privilegeEntranceGuideSigningView, new View.OnClickListener() { // from class: l.o590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p590.m167465u(this.f141884a, view);
                }
            });
            j760[] j760VarArrM185672R = src0.m185656r().m185672R();
            zvf0.m220368A("e_mypage_auto", OMSDialogPositon.p_navigation_view, (j760[]) Arrays.copyOf(j760VarArrM185672R, j760VarArrM185672R.length));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m167466r(boolean isSvip) {
        j760[] j760VarArrM185672R = src0.m185656r().m185672R();
        zvf0.m220399u("e_mypage_auto", OMSDialogPositon.p_navigation_view, (j760[]) Arrays.copyOf(j760VarArrM185672R, j760VarArrM185672R.length));
        if (src0.m185656r().m185687z()) {
            src0.m185656r().m185673S(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), src0.m185656r().m185676l() ? "my_reauto_button_unauto_order" : "my_reauto_button");
            return;
        }
        Act act = getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String();
        String strM201089c = w2b0.m201089c("p_navigation,privilege_button", 1);
        strM201089c.getClass();
        C8764c.m53418O1(act, strM201089c, null, null, null, false, null, null, null, 508, null);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String m167467s() {
        return "e_privilege_button_vipautopurchase";
    }
}
