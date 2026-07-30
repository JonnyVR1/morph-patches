package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import l.a5;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.g6a;
import l.qib0;
import l.src0;
import l.svq;
import l.xdl0;
import l.xma;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ll/s590;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "", "r", "()Ljava/lang/String;", "h", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class s590 extends a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceODiamondSingleView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s590(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: s */
    public static final void m9225s(s590 s590Var, View view) {
        zvf0.r(s590Var.m9229h(), s590Var.f());
        String strY3 = CoreModule.P().a().Y3();
        strY3.getClass();
        s590Var.o(strY3);
    }

    /* JADX INFO: renamed from: t */
    public static final void m9226t(s590 s590Var, View view) {
        zvf0.r(s590Var.m9231r(), s590Var.f());
        zvf0.r("e_diamond_privilege_entrance", "p_navigation_view");
        String strF0 = CoreModule.P().a().F0();
        strF0.getClass();
        s590Var.o(strF0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m9227a() {
        return !g6a.t() && zb90.i() && CoreModule.P().a().f() && CoreModule.c.Q1.R.N() && !xma.F3();
    }

    /* JADX INFO: renamed from: b */
    public void m9228b() {
        this._top_view = (PrivilegeEntranceHasPrivilegeView) i(g().getAct(), g().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        g().getRoot().addView(this._top_view, new LinearLayout.LayoutParams(-2, svq.c(80)));
        int iC = svq.c(5);
        this._bottom_view = (PrivilegeEntranceODiamondSingleView) i(g().getAct(), g().getRoot(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(52));
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.bottomMargin = iC;
        g().getRoot().addView((View) this._bottom_view, (ViewGroup.LayoutParams) layoutParams);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m9229h() {
        return "e_privilege_banner_viptood";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceODiamondSingleView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public void m9230m() {
        super.m();
        g().getRoot().setBackgroundResource(d3c0.k3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.setBackgroundResource(d3c0.C3);
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
            xdl0.E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.q590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s590.m9225s(this.f6971a, view);
                }
            });
        }
        ?? r0 = this._bottom_view;
        if (r0 != 0) {
            if (g6a.o()) {
                r0.setBackgroundResource(d3c0.p5);
                xdl0.M(r0.get_texture(), false);
                r0.get_title().setTextColor(g().getAct().color(b1c0.Q));
                r0.get_arrow_right().setImageResource(d3c0.t5);
            } else {
                r0.setBackgroundResource(d3c0.o3);
                qib0.G.Y0(r0.get_texture(), d3c0.p3);
            }
            r0.get_title().setTypeface(eqh0.c(3));
            r0.get_title().setText("解锁黑金会员，尊享全平台权益!");
            xdl0.M(r0.get_arrow_right(), false);
            xdl0.M(r0.get_unlock(), true);
            r0.get_unlock().setText("去解锁");
            xdl0.E0((View) r0, new View.OnClickListener() { // from class: l.r590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s590.m9226t(this.f7124a, view);
                }
            });
            zvf0.x("e_diamond_privilege_entrance", "p_navigation_view");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public String m9231r() {
        return "e_privilege_button_viptood";
    }
}
