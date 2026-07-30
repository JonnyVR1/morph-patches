package p003l;

import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import l.a5;
import l.b1c0;
import l.d3c0;
import l.src0;
import l.svq;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Ll/m590;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_vip_privilege_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class m590 extends a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _vip_privilege_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m590(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static final void m7975q(m590 m590Var, View view) {
        zvf0.r(m590Var.m7978h(), m590Var.f());
        String strY3 = CoreModule.P().a().Y3();
        strY3.getClass();
        m590Var.o(strY3);
    }

    /* JADX INFO: renamed from: a */
    public boolean m7976a() {
        return zb90.i();
    }

    /* JADX INFO: renamed from: b */
    public void m7977b() {
        this._vip_privilege_view = (PrivilegeEntranceHasPrivilegeView) i(g().getAct(), g().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        g().getRoot().addView(this._vip_privilege_view, new LinearLayout.LayoutParams(-2, svq.c(80)));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m7978h() {
        return "e_privilege_banner_vip";
    }

    /* JADX INFO: renamed from: m */
    public void m7979m() {
        super.m();
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._vip_privilege_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.setBackgroundResource(d3c0.C3);
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.z3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.D3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(g().getAct().drawable(d3c0.F3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.l6);
            String strD = zb90.d(SummarizedPrivilegesId.get("vip"));
            boolean zN = src0.r().N();
            boolean zY = src0.r().y();
            if (zN && zY) {
                strD = CoreModule.P().a().c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strD);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(g().getAct().color(b1c0.s));
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.A9);
            xdl0.E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.l590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m590.m7975q(this.f5760a, view);
                }
            });
        }
    }
}
