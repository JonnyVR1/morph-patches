package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m88121d2 = {"Ll/wd90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "r", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wd90 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceODiamondSingleView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m205850s(wd90 wd90Var, View view) {
        i4g0.m138520r(wd90Var.mo96815h(), wd90Var.m214188f());
        String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
        strMo34450Y3.getClass();
        wd90Var.m214193o(strMo34450Y3);
    }

    /* JADX INFO: renamed from: t */
    public static final void m205851t(wd90 wd90Var, View view) {
        i4g0.m138520r(wd90Var.m205852r(), wd90Var.m214188f());
        i4g0.m138520r("e_diamond_privilege_entrance", OMSDialogPositon.p_navigation_view);
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        wd90Var.m214193o(strMo34318F0);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return !s7a.m184991t() && dk90.m116230i() && CoreModule.m30933P().m143405a().mo180463f() && CoreModule.f18264c.f20340Q1.f20859R.m35763N() && !joa.m146357G3();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this._top_view = (PrivilegeEntranceHasPrivilegeView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this._top_view, new LinearLayout.LayoutParams(-2, txq.m193530c(80)));
        int iM193530c = txq.m193530c(5);
        this._bottom_view = (PrivilegeEntranceODiamondSingleView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(52));
        layoutParams.leftMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.bottomMargin = iM193530c;
        getPrivilegeEntranceInfo().getRoot().addView(this._bottom_view, layoutParams);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_viptood";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119640k3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.setBackgroundResource(jbc0.f119174C3);
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
            bnl0.m105509E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.ud90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wd90.m205850s(this.f178511a, view);
                }
            });
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (s7a.m184986o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(jbc0.f119712p5);
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108347Q));
                privilegeEntranceODiamondSingleView.get_arrow_right().setImageResource(jbc0.f119768t5);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(jbc0.f119696o3);
                uqb0.f180374G.m127138Y0(privilegeEntranceODiamondSingleView.get_texture(), jbc0.f119710p3);
            }
            privilegeEntranceODiamondSingleView.get_title().setTypeface(lyh0.m156283c(3));
            privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
            bnl0.m105524M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
            bnl0.m105524M(privilegeEntranceODiamondSingleView.get_unlock(), true);
            privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
            bnl0.m105509E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.vd90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wd90.m205851t(this.f183548a, view);
                }
            });
            i4g0.m138526x("e_diamond_privilege_entrance", OMSDialogPositon.p_navigation_view);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String m205852r() {
        return "e_privilege_button_viptood";
    }
}
