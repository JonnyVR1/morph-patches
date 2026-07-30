package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m88121d2 = {"Ll/qd90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_vip_privilege_view", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qd90 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _vip_privilege_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static final void m176158q(qd90 qd90Var, View view) {
        i4g0.m138520r(qd90Var.mo96815h(), qd90Var.m214188f());
        String strMo34450Y3 = CoreModule.m30933P().m143405a().mo34450Y3();
        strMo34450Y3.getClass();
        qd90Var.m214193o(strMo34450Y3);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return dk90.m116230i();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this._vip_privilege_view = (PrivilegeEntranceHasPrivilegeView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this._vip_privilege_view, new LinearLayout.LayoutParams(-2, txq.m193530c(80)));
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_vip";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._vip_privilege_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.setBackgroundResource(jbc0.f119174C3);
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(jbc0.f119850z3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(jbc0.f119188D3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(jbc0.f119216F3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(jbc0.f119657l6);
            String strM116225d = dk90.m116225d(SummarizedPrivilegesId.get("vip"));
            boolean zM213734N = xzc0.m213720r().m213734N();
            boolean zM213750y = xzc0.m213720r().m213750y();
            if (zM213734N && zM213750y) {
                strM116225d = CoreModule.m30933P().m143405a().mo34478c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strM116225d);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108393s));
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(jbc0.f119152A9);
            bnl0.m105509E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.pd90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qd90.m176158q(this.f151724a, view);
                }
            });
        }
    }
}
