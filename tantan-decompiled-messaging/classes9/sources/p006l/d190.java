package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import kotlin.Metadata;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.j760;
import l.svq;
import l.vwb;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ll/d190;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "r", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class d190 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceODiamondSingleView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d190(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m13740s(d190 d190Var, View view) {
        zvf0.r(d190Var.mo11695h(), d190Var.m11751f());
        String strM5384Y3 = CoreModule.m1854P().m11706a().m5384Y3();
        strM5384Y3.getClass();
        d190Var.m11756o(strM5384Y3);
    }

    /* JADX INFO: renamed from: t */
    public static final void m13741t(d190 d190Var, View view) {
        zvf0.r(d190Var.mo13742r(), d190Var.m11751f());
        zvf0.u("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("privileges_guide_type", "oDiamond")});
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        d190Var.m11756o(strM5252F0);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        return !xma.m27368Y3() && sj20.m23814a().m23815b() && zb90.i() && !CoreModule.f1534c.f3587Q1.f4106R.m6697N() && sj20.m23814a().m23817d();
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        this._top_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().c().addView((View) this._top_view, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-2, svq.c(80)));
        int iC = svq.c(5);
        this._bottom_view = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(52));
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.bottomMargin = iC;
        getPrivilegeEntranceInfo().c().addView((View) this._bottom_view, (ViewGroup.LayoutParams) layoutParams);
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_hwbefore24hodvip";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        getPrivilegeEntranceInfo().c().setBackgroundResource(d3c0.k3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.setBackgroundResource(d3c0.C3);
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.z3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.D3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().a().drawable(d3c0.F3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.l6);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.s));
            String strD = zb90.d(SummarizedPrivilegesId.get("vip"));
            boolean zM24173N = src0.m24159r().m24173N();
            boolean zM24189y = src0.m24159r().m24189y();
            if (zM24173N && zM24189y) {
                strD = CoreModule.m1854P().m11706a().m5412c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strD);
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.A9);
            xdl0.E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.b190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d190.m13740s(this.f8657a, view);
                }
            });
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (g6a.m15592o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.p5);
                xdl0.M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.Q));
                xdl0.M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                privilegeEntranceODiamondSingleView.get_unlock().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.J));
                privilegeEntranceODiamondSingleView.get_unlock().setBackgroundResource(d3c0.q5);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
                xdl0.M(privilegeEntranceODiamondSingleView.get_unlock(), true);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.o3);
                qib0.f19782G.m12767Y0(privilegeEntranceODiamondSingleView.get_texture(), d3c0.p3);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                xdl0.M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                xdl0.M(privilegeEntranceODiamondSingleView.get_unlock(), true);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
            }
            xdl0.E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.c190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d190.m13741t(this.f9278a, view);
                }
            });
            zvf0.A("e_purchase_banner", "p_navigation_view", new j760[]{vwb.Y("privileges_guide_type", "oDiamond")});
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String mo13742r() {
        return "e_privilege_button_hwbefore24hodvip";
    }
}
