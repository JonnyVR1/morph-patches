package p003l;

import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.MyVisitorsShowType;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceGuideSigningView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceView;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.a5;
import l.b1c0;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Ll/j490;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", MyVisitorsShowType.hidden, "", "w", "(Z)V", "a", "()Z", "b", "()V", "m", "j", "", "h", "()Ljava/lang/String;", "t", "s", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/tantan/library/svga/SVGAnimationView;", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "_svga", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class j490 extends a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView _svga;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceGuideSigningView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j490(@NotNull PrivilegeEntranceView.C3068a c3068a) {
        super(c3068a);
        c3068a.getClass();
    }

    /* JADX INFO: renamed from: u */
    public static final void m7338u(j490 j490Var, View view) {
        zvf0.r(j490Var.m7344h(), j490Var.f());
        String strIe = CoreModule.P().a().Ie();
        strIe.getClass();
        j490Var.o(strIe);
    }

    /* JADX INFO: renamed from: v */
    public static final void m7339v(j490 j490Var, View view) {
        j490Var.m7347s();
        zvf0.r(j490Var.m7348t(), j490Var.f());
    }

    /* JADX INFO: renamed from: w */
    private final void m7340w(boolean hidden) {
        final SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, (Object) null);
                xdl0.M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                xdl0.Q0(sVGAnimationView, new e30() { // from class: l.g490
                    public final void call(Object obj) {
                        j490.m7341x(this.f4541a, sVGAnimationView, (int[]) obj);
                    }
                });
            } else {
                a5.l(this, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, (AnimListener) null, 24, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m7341x(j490 j490Var, SVGAnimationView sVGAnimationView, int[] iArr) {
        a5.l(j490Var, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, (AnimListener) null, 24, (Object) null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m7342a() {
        return src0.r().l() && src0.r().C();
    }

    /* JADX INFO: renamed from: b */
    public void m7343b() {
        LinearLayout linearLayout = new LinearLayout(g().getAct());
        linearLayout.setOrientation(1);
        this._top_view = (PrivilegeEntranceHasPrivilegeView) i(g().getAct(), g().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        linearLayout.addView(this._top_view, new LinearLayout.LayoutParams(-2, svq.c(80)));
        this._bottom_view = (PrivilegeEntranceGuideSigningView) i(g().getAct(), g().getRoot(), PrivilegeViewType.GUIDE_SIGNING_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(52));
        int iC = svq.c(5);
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.bottomMargin = iC;
        linearLayout.addView(this._bottom_view, layoutParams);
        FrameLayout frameLayout = new FrameLayout(g().getAct());
        SVGAnimationView sVGAnimationView = new SVGAnimationView(g().getAct(), (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        this._svga = sVGAnimationView;
        sVGAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(this._svga, new FrameLayout.LayoutParams(-1, svq.c(137)));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        g().getRoot().addView(frameLayout);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public String m7344h() {
        return "e_privilege_banner_svipautosigning";
    }

    /* JADX INFO: renamed from: j */
    public void m7345j(boolean hidden) {
        if (hidden) {
            m7340w(true);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m7346m() {
        super.m();
        g().getRoot().setBackgroundResource(d3c0.s3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.y3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.t3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(g().getAct().drawable(d3c0.v3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.g6);
            String strD = zb90.d(SummarizedPrivilegesId.get("svip"));
            boolean zM = src0.r().M();
            boolean zY = src0.r().y();
            if (zM && zY) {
                strD = CoreModule.P().a().c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strD);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(g().getAct().color(b1c0.u));
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.C9);
            xdl0.M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            xdl0.E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.h490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j490.m7338u(this.f4788a, view);
                }
            });
        }
        PrivilegeEntranceGuideSigningView privilegeEntranceGuideSigningView = this._bottom_view;
        if (privilegeEntranceGuideSigningView != null) {
            privilegeEntranceGuideSigningView.setBackgroundResource(d3c0.E9);
            privilegeEntranceGuideSigningView.get_title().setTypeface(eqh0.c(3));
            privilegeEntranceGuideSigningView.get_title().setTextColor(g().getAct().color(b1c0.u));
            privilegeEntranceGuideSigningView.get_title().setText(src0.Q(false));
            privilegeEntranceGuideSigningView.get_restore().setTypeface(eqh0.c(3));
            privilegeEntranceGuideSigningView.get_restore().setTextColor(Color.parseColor("#AB3E00"));
            privilegeEntranceGuideSigningView.get_restore().setBackgroundResource(d3c0.u3);
            privilegeEntranceGuideSigningView.get_restore().setText("去开通");
            xdl0.E0(privilegeEntranceGuideSigningView, new View.OnClickListener() { // from class: l.i490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j490.m7339v(this.f4988a, view);
                }
            });
            j760[] j760VarArrR = src0.r().R();
            zvf0.A("e_mypage_auto", "p_navigation_view", (j760[]) Arrays.copyOf(j760VarArrR, j760VarArrR.length));
        }
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            vcl0.m10212a(sVGAnimationView, svq.c(10));
            m7340w(false);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7347s() {
        j760[] j760VarArrR = src0.r().R();
        zvf0.u("e_mypage_auto", "p_navigation_view", (j760[]) Arrays.copyOf(j760VarArrR, j760VarArrR.length));
        if (src0.r().z()) {
            src0.r().S(g().getAct(), src0.r().l() ? "my_reauto_button_unauto_order" : "my_reauto_button");
        } else {
            CoreModule.P().a().Rm(g().getAct(), w2b0.c("p_navigation,privilege_button", 1));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public String m7348t() {
        return "e_privilege_button_svipautosigning";
    }
}
