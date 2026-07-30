package p149l;

import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m87232d2 = {"Ll/m590;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_vip_privilege_view", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class m590 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _vip_privilege_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m590(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static final void m153131q(m590 m590Var, View view) {
        zvf0.m220396r(m590Var.mo94542h(), m590Var.m94952f());
        String strMo33447Y3 = CoreModule.m29935P().m94651a().mo33447Y3();
        strMo33447Y3.getClass();
        m590Var.m94957o(strMo33447Y3);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return zb90.m217832i();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        this._vip_privilege_view = (PrivilegeEntranceHasPrivilegeView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this._vip_privilege_view, new LinearLayout.LayoutParams(-2, svq.m186103c(80)));
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_vip";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._vip_privilege_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.setBackgroundResource(d3c0.f83519C3);
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.f84195z3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.f83533D3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(d3c0.f83561F3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.f84002l6);
            String strM217827d = zb90.m217827d(SummarizedPrivilegesId.get("vip"));
            boolean zM185670N = src0.m185656r().m185670N();
            boolean zM185686y = src0.m185656r().m185686y();
            if (zM185670N && zM185686y) {
                strM217827d = CoreModule.m29935P().m94651a().mo33475c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strM217827d);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72573s));
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.f83497A9);
            xdl0.m208329E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.l590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m590.m153131q(this.f126097a, view);
                }
            });
        }
    }
}
