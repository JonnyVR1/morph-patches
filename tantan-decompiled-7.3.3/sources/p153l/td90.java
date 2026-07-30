package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceGuideSigningView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m88121d2 = {"Ll/td90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", BLiveStormDanmakuGiftResourceType.f45294s, "()Ljava/lang/String;", "h", "isSvip", "r", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class td90 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceGuideSigningView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final void m190616t(td90 td90Var, View view) {
        i4g0.m138520r(td90Var.mo96815h(), td90Var.m214188f());
        String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
        strMo34450Y3.getClass();
        td90Var.m214193o(strMo34450Y3);
    }

    /* JADX INFO: renamed from: u */
    public static final void m190617u(td90 td90Var, View view) {
        td90Var.m190618r(false);
        i4g0.m138520r(td90Var.m190619s(), td90Var.m214188f());
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return xzc0.m213720r().m213740l() && xzc0.m213720r().m213727F();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this._top_view = (PrivilegeEntranceHasPrivilegeView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, new LinearLayout.LayoutParams(-2, txq.m193530c(80)));
        this._bottom_view = (PrivilegeEntranceGuideSigningView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.GUIDE_SIGNING_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(52));
        int iM193530c = txq.m193530c(5);
        layoutParams.leftMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_vipautopurchase";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119174C3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(jbc0.f119850z3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(jbc0.f119188D3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(jbc0.f119216F3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(jbc0.f119657l6);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108393s));
            String strM116225d = dk90.m116225d(SummarizedPrivilegesId.get("vip"));
            boolean zM213734N = xzc0.m213720r().m213734N();
            boolean zM213750y = xzc0.m213720r().m213750y();
            if (zM213734N && zM213750y) {
                strM116225d = CoreModule.m30933P().m143405a().mo34478c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strM116225d);
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(jbc0.f119152A9);
            bnl0.m105509E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.rd90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    td90.m190616t(this.f162296a, view);
                }
            });
        }
        PrivilegeEntranceGuideSigningView privilegeEntranceGuideSigningView = this._bottom_view;
        if (privilegeEntranceGuideSigningView != null) {
            privilegeEntranceGuideSigningView.setBackgroundResource(jbc0.f119194D9);
            privilegeEntranceGuideSigningView.get_title().setTypeface(lyh0.m156283c(3));
            privilegeEntranceGuideSigningView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108393s));
            privilegeEntranceGuideSigningView.get_title().setText(xzc0.m213708Q(false));
            privilegeEntranceGuideSigningView.get_restore().setTypeface(lyh0.m156283c(3));
            privilegeEntranceGuideSigningView.get_restore().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntranceGuideSigningView.get_restore().setBackgroundResource(jbc0.f119202E3);
            privilegeEntranceGuideSigningView.get_restore().setText("去开通");
            bnl0.m105509E0(privilegeEntranceGuideSigningView, new View.OnClickListener() { // from class: l.sd90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    td90.m190617u(this.f167391a, view);
                }
            });
            pf60[] pf60VarArrM213736R = xzc0.m213720r().m213736R();
            i4g0.m138492A("e_mypage_auto", OMSDialogPositon.p_navigation_view, (pf60[]) Arrays.copyOf(pf60VarArrM213736R, pf60VarArrM213736R.length));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m190618r(boolean isSvip) {
        pf60[] pf60VarArrM213736R = xzc0.m213720r().m213736R();
        i4g0.m138523u("e_mypage_auto", OMSDialogPositon.p_navigation_view, (pf60[]) Arrays.copyOf(pf60VarArrM213736R, pf60VarArrM213736R.length));
        if (xzc0.m213720r().m213751z()) {
            xzc0.m213720r().m213737S(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), xzc0.m213720r().m213740l() ? "my_reauto_button_unauto_order" : "my_reauto_button");
            return;
        }
        Act act = getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String();
        String strM96736c = abb0.m96736c("p_navigation,privilege_button", 1);
        strM96736c.getClass();
        C8927c.m54601O1(act, strM96736c, null, null, null, false, null, null, null, 508, null);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String m190619s() {
        return "e_privilege_button_vipautopurchase";
    }
}
