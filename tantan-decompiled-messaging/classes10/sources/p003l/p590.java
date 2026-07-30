package p003l;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceGuideSigningView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.User;
import java.util.Arrays;
import kotlin.Metadata;
import l.a5;
import l.b1c0;
import l.d30;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.j760;
import l.src0;
import l.svq;
import l.w2b0;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Ll/p590;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "s", "()Ljava/lang/String;", "h", "isSvip", "r", "(Z)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class p590 extends a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceGuideSigningView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p590(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final void m8705t(p590 p590Var, View view) {
        zvf0.r(p590Var.m8709h(), p590Var.f());
        String strY3 = CoreModule.P().a().Y3();
        strY3.getClass();
        p590Var.o(strY3);
    }

    /* JADX INFO: renamed from: u */
    public static final void m8706u(p590 p590Var, View view) {
        p590Var.m8711r(false);
        zvf0.r(p590Var.m8712s(), p590Var.f());
    }

    /* JADX INFO: renamed from: a */
    public boolean m8707a() {
        return src0.r().l() && src0.r().F();
    }

    /* JADX INFO: renamed from: b */
    public void m8708b() {
        this._top_view = (PrivilegeEntranceHasPrivilegeView) i(g().getAct(), g().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        g().getRoot().addView(this._top_view, new LinearLayout.LayoutParams(-2, svq.c(80)));
        this._bottom_view = (PrivilegeEntranceGuideSigningView) i(g().getAct(), g().getRoot(), PrivilegeViewType.GUIDE_SIGNING_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(52));
        int iC = svq.c(5);
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.bottomMargin = iC;
        g().getRoot().addView(this._bottom_view, layoutParams);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m8709h() {
        return "e_privilege_banner_vipautopurchase";
    }

    /* JADX INFO: renamed from: m */
    public void m8710m() {
        super.m();
        g().getRoot().setBackgroundResource(d3c0.C3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.z3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.D3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(g().getAct().drawable(d3c0.F3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.l6);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(g().getAct().color(b1c0.s));
            String strD = zb90.d(SummarizedPrivilegesId.get("vip"));
            boolean zN = src0.r().N();
            boolean zY = src0.r().y();
            if (zN && zY) {
                strD = CoreModule.P().a().c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strD);
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.A9);
            xdl0.E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.n590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p590.m8705t(this.f6479a, view);
                }
            });
        }
        PrivilegeEntranceGuideSigningView privilegeEntranceGuideSigningView = this._bottom_view;
        if (privilegeEntranceGuideSigningView != null) {
            privilegeEntranceGuideSigningView.setBackgroundResource(d3c0.D9);
            privilegeEntranceGuideSigningView.get_title().setTypeface(eqh0.c(3));
            privilegeEntranceGuideSigningView.get_title().setTextColor(g().getAct().color(b1c0.s));
            privilegeEntranceGuideSigningView.get_title().setText(src0.Q(false));
            privilegeEntranceGuideSigningView.get_restore().setTypeface(eqh0.c(3));
            privilegeEntranceGuideSigningView.get_restore().setTextColor(Color.parseColor("#9B4918"));
            privilegeEntranceGuideSigningView.get_restore().setBackgroundResource(d3c0.E3);
            privilegeEntranceGuideSigningView.get_restore().setText("去开通");
            xdl0.E0(privilegeEntranceGuideSigningView, new View.OnClickListener() { // from class: l.o590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p590.m8706u(this.f6597a, view);
                }
            });
            j760[] j760VarArrR = src0.r().R();
            zvf0.A("e_mypage_auto", "p_navigation_view", (j760[]) Arrays.copyOf(j760VarArrR, j760VarArrR.length));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8711r(boolean isSvip) {
        j760[] j760VarArrR = src0.r().R();
        zvf0.u("e_mypage_auto", "p_navigation_view", (j760[]) Arrays.copyOf(j760VarArrR, j760VarArrR.length));
        if (src0.r().z()) {
            src0.r().S(g().getAct(), src0.r().l() ? "my_reauto_button_unauto_order" : "my_reauto_button");
            return;
        }
        Act act = g().getAct();
        String strC = w2b0.c("p_navigation,privilege_button", 1);
        strC.getClass();
        c.O1(act, strC, (Privilege) null, (d30) null, (d30) null, false, (User) null, (Object) null, (e30) null, 508, (Object) null);
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String m8712s() {
        return "e_privilege_button_vipautopurchase";
    }
}
