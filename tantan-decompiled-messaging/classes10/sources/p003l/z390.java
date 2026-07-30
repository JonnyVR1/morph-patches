package p003l;

import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import l.a5;
import l.b1c0;
import l.d3c0;
import l.e30;
import l.src0;
import l.svq;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Ll/z390;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", MyVisitorsShowType.hidden, "", "s", "(Z)V", "a", "()Z", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "j", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_privilege_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class z390 extends a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _privilege_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z390(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: r */
    public static final void m11331r(z390 z390Var, View view) {
        zvf0.r(z390Var.m11336h(), z390Var.f());
        String strIe = CoreModule.P().a().Ie();
        strIe.getClass();
        z390Var.o(strIe);
    }

    /* JADX INFO: renamed from: s */
    private final void m11332s(boolean hidden) {
        final PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._privilege_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceHasPrivilegeView.get_light_svga(), false, 1, (Object) null);
                xdl0.M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            } else if (privilegeEntranceHasPrivilegeView.getHeight() == 0) {
                xdl0.Q0(privilegeEntranceHasPrivilegeView, new e30() { // from class: l.x390
                    public final void call(Object obj) {
                        z390.m11333t(this.f8298a, privilegeEntranceHasPrivilegeView, (int[]) obj);
                    }
                });
            } else {
                a5.l(this, g().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, (AnimListener) null, 24, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m11333t(z390 z390Var, PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, int[] iArr) {
        a5.l(z390Var, z390Var.g().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, (AnimListener) null, 24, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m11334a() {
        return zb90.h();
    }

    /* JADX INFO: renamed from: b */
    public void m11335b() {
        this._privilege_view = (PrivilegeEntranceHasPrivilegeView) i(g().getAct(), g().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        g().getRoot().addView(this._privilege_view, new LinearLayout.LayoutParams(-2, svq.c(80)));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m11336h() {
        return "e_privilege_banner_svip";
    }

    /* JADX INFO: renamed from: j */
    public void m11337j(boolean hidden) {
        if (hidden) {
            m11332s(true);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m11338m() {
        super.m();
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._privilege_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.setBackgroundResource(d3c0.s3);
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.y3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.t3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(g().getAct().drawable(d3c0.v3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.g6);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(g().getAct().color(b1c0.u));
            String strD = zb90.d(SummarizedPrivilegesId.get("svip"));
            boolean zM = src0.r().M();
            boolean zY = src0.r().y();
            if (zM && zY) {
                strD = CoreModule.P().a().c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strD);
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.C9);
            m11332s(false);
            xdl0.E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.y390
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z390.m11331r(this.f8628a, view);
                }
            });
        }
    }
}
