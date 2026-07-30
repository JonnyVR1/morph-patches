package p006l;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import l.b1c0;
import l.d3c0;
import l.e190;
import l.e30;
import l.e51;
import l.mep0;
import l.svq;
import l.t100;
import l.xdl0;
import l.zb90;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u001b\u0010\u0016\u001a\u00020\t*\u00020\u00152\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Ll/k190;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "hidden", "j", "(Z)V", "", "h", "()Ljava/lang/String;", "y", "A", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "C", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;Z)V", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "oDiamondHasPrivilegeView", "Ljava/lang/Runnable;", "e", "Ljava/lang/Runnable;", "backgroundShimmerRunnable", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k190 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView oDiamondHasPrivilegeView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Runnable backgroundShimmerRunnable;

    /* JADX INFO: renamed from: l.k190$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/k190$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0914b extends AnimListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PrivilegeEntranceHasPrivilegeView f15543b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f15544c;

        public C0914b(PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, boolean z) {
            this.f15543b = privilegeEntranceHasPrivilegeView;
            this.f15544c = z;
        }

        /* JADX INFO: renamed from: a */
        public static void m17912a(k190 k190Var, boolean z) {
            k190Var.m17909A(z);
        }

        public void onFinished() {
            if (k190.this.backgroundShimmerRunnable == null) {
                final k190 k190Var = k190.this;
                final boolean z = this.f15544c;
                k190Var.backgroundShimmerRunnable = new Runnable() { // from class: l.l190
                    @Override // java.lang.Runnable
                    public final void run() {
                        k190.C0914b.m17912a(k190Var, z);
                    }
                };
            }
            e51.J(k190.this.backgroundShimmerRunnable);
            e51.H(this.f15543b.getContext(), k190.this.backgroundShimmerRunnable, 6000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k190(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
    }

    /* JADX INFO: renamed from: B */
    public static final void m17898B(k190 k190Var, PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, boolean z, int[] iArr) {
        k190Var.m17910C(privilegeEntranceHasPrivilegeView, z);
    }

    /* JADX INFO: renamed from: w */
    public static final void m17906w(k190 k190Var, View view) {
        zvf0.r(k190Var.mo11695h(), k190Var.m11751f());
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        k190Var.m11756o(strM5252F0);
    }

    /* JADX INFO: renamed from: x */
    public static final void m17907x(k190 k190Var, View view) {
        zvf0.r(k190Var.mo11695h(), k190Var.m11751f());
        String strM5252F0 = CoreModule.m1854P().m11706a().m5252F0();
        strM5252F0.getClass();
        k190Var.m11756o(strM5252F0);
    }

    /* JADX INFO: renamed from: z */
    public static final void m17908z(k190 k190Var, PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, int[] iArr) {
        AbstractC0495a5.m11748l(k190Var, k190Var.getPrivilegeEntranceInfo().c(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m17909A(final boolean hidden) {
        final PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this.oDiamondHasPrivilegeView;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceHasPrivilegeView.get_light_svga(), false, 1, (Object) null);
                xdl0.M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            } else if (privilegeEntranceHasPrivilegeView.getHeight() == 0) {
                xdl0.Q0(privilegeEntranceHasPrivilegeView, new e30() { // from class: l.g190
                    public final void call(Object obj) {
                        k190.m17898B(this.f13021a, privilegeEntranceHasPrivilegeView, hidden, (int[]) obj);
                    }
                });
            } else {
                m17910C(privilegeEntranceHasPrivilegeView, hidden);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m17910C(PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, boolean z) {
        e51.J(this.backgroundShimmerRunnable);
        m11754k(getPrivilegeEntranceInfo().c(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/2342d2f5-62e1-4be9-aea8-97900fbd811f14.pdf", 1, new C0914b(privilegeEntranceHasPrivilegeView, z));
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        return CoreModule.m1854P().m11706a().m19853a2();
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        this.oDiamondHasPrivilegeView = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().c().addView((View) this.oDiamondHasPrivilegeView, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-2, svq.c(80)));
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_odiamond";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: j */
    public void mo11696j(boolean hidden) {
        if (hidden) {
            if (g6a.m15592o()) {
                m17909A(hidden);
            } else {
                m17911y(hidden);
            }
        }
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        super.mo11697m();
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this.oDiamondHasPrivilegeView;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (g6a.m15592o()) {
                int i = t100.i;
                mep0.d1(privilegeEntranceHasPrivilegeView, i);
                privilegeEntranceHasPrivilegeView.setBackground(new e190(false));
                xdl0.M(privilegeEntranceHasPrivilegeView.get_border(), false);
                xdl0.M(privilegeEntranceHasPrivilegeView.get_texture(), false);
                privilegeEntranceHasPrivilegeView.get_light_svga().setScaleType(ImageView.ScaleType.CENTER_CROP);
                mep0.d1(privilegeEntranceHasPrivilegeView.get_light_svga(), i);
                m17909A(false);
                privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().a().drawable(d3c0.v5));
                privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.A5);
                privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(Color.parseColor("#CCFFD68C"));
                privilegeEntranceHasPrivilegeView.get_vip_desc().setText(zb90.d(SummarizedPrivilegesId.get("oDiamond")));
                privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.t5);
                xdl0.E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.i190
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k190.m17906w(this.f14192a, view);
                    }
                });
                return;
            }
            Context context = privilegeEntranceHasPrivilegeView.getContext();
            context.getClass();
            SVGALoader.with(context).repeatCount(-1).autoPlay(false).from("https://auto.tancdn.com/v1/raw/1f20ff80-2be8-4b6b-97e3-1b386ef7ebfe13.pdf").into(privilegeEntranceHasPrivilegeView.get_light_icon_svga());
            xdl0.E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.j190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k190.m17907x(this.f14955a, view);
                }
            });
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(zb90.d(SummarizedPrivilegesId.get("oDiamond")));
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().a().color(b1c0.v));
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.n3);
            privilegeEntranceHasPrivilegeView.setBackgroundResource(d3c0.m3);
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.B9);
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.w3);
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.c6);
            if (!privilegeEntranceHasPrivilegeView.get_light_icon_svga().isAnimating()) {
                privilegeEntranceHasPrivilegeView.get_light_icon_svga().startAnimation();
            }
            m17911y(false);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m17911y(boolean hidden) {
        final PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this.oDiamondHasPrivilegeView;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceHasPrivilegeView.get_light_svga(), false, 1, (Object) null);
                xdl0.M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            } else if (privilegeEntranceHasPrivilegeView.getHeight() == 0) {
                xdl0.Q0(privilegeEntranceHasPrivilegeView, new e30() { // from class: l.h190
                    public final void call(Object obj) {
                        k190.m17908z(this.f13627a, privilegeEntranceHasPrivilegeView, (int[]) obj);
                    }
                });
            } else {
                AbstractC0495a5.m11748l(this, getPrivilegeEntranceInfo().c(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
            }
        }
    }
}
