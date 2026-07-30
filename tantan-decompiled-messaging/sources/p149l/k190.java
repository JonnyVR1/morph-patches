package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u001b\u0010\u0016\u001a\u00020\t*\u00020\u00152\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m87232d2 = {"Ll/k190;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "hidden", "j", "(Z)V", "", "h", "()Ljava/lang/String;", BaseSei.f13931Y, "A", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", b2s.C_ZONE, "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;Z)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "oDiamondHasPrivilegeView", "Ljava/lang/Runnable;", "e", "Ljava/lang/Runnable;", "backgroundShimmerRunnable", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class k190 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView oDiamondHasPrivilegeView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Runnable backgroundShimmerRunnable;

    /* JADX INFO: renamed from: l.k190$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/k190$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17904b extends AnimListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PrivilegeEntranceHasPrivilegeView f120552b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f120553c;

        public C17904b(PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, boolean z) {
            this.f120552b = privilegeEntranceHasPrivilegeView;
            this.f120553c = z;
        }

        /* JADX INFO: renamed from: a */
        public static void m144154a(k190 k190Var, boolean z) {
            k190Var.m144151A(z);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            if (k190.this.backgroundShimmerRunnable == null) {
                final k190 k190Var = k190.this;
                final boolean z = this.f120553c;
                k190Var.backgroundShimmerRunnable = new Runnable() { // from class: l.l190
                    @Override // java.lang.Runnable
                    public final void run() {
                        k190.C17904b.m144154a(k190Var, z);
                    }
                };
            }
            e51.m114745J(k190.this.backgroundShimmerRunnable);
            e51.m114743H(this.f120552b.getContext(), k190.this.backgroundShimmerRunnable, 6000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k190(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: B */
    public static final void m144140B(k190 k190Var, PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, boolean z, int[] iArr) {
        k190Var.m144152C(privilegeEntranceHasPrivilegeView, z);
    }

    /* JADX INFO: renamed from: w */
    public static final void m144148w(k190 k190Var, View view) {
        zvf0.m220396r(k190Var.mo94542h(), k190Var.m94952f());
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        k190Var.m94957o(strMo33315F0);
    }

    /* JADX INFO: renamed from: x */
    public static final void m144149x(k190 k190Var, View view) {
        zvf0.m220396r(k190Var.mo94542h(), k190Var.m94952f());
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        k190Var.m94957o(strMo33315F0);
    }

    /* JADX INFO: renamed from: z */
    public static final void m144150z(k190 k190Var, PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, int[] iArr) {
        AbstractC15528a5.m94949l(k190Var, k190Var.getPrivilegeEntranceInfo().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m144151A(final boolean hidden) {
        final PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this.oDiamondHasPrivilegeView;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceHasPrivilegeView.get_light_svga(), false, 1, null);
                xdl0.m208344M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            } else if (privilegeEntranceHasPrivilegeView.getHeight() == 0) {
                xdl0.m208353Q0(privilegeEntranceHasPrivilegeView, new e30() { // from class: l.g190
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        k190.m144140B(this.f100128a, privilegeEntranceHasPrivilegeView, hidden, (int[]) obj);
                    }
                });
            } else {
                m144152C(privilegeEntranceHasPrivilegeView, hidden);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m144152C(PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, boolean z) {
        e51.m114745J(this.backgroundShimmerRunnable);
        m94955k(getPrivilegeEntranceInfo().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/2342d2f5-62e1-4be9-aea8-97900fbd811f14.pdf", 1, new C17904b(privilegeEntranceHasPrivilegeView, z));
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return CoreModule.m29935P().m94651a().mo158345a2();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        this.oDiamondHasPrivilegeView = (PrivilegeEntranceHasPrivilegeView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this.oDiamondHasPrivilegeView, new LinearLayout.LayoutParams(-2, svq.m186103c(80)));
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_odiamond";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: j */
    public void mo94543j(boolean hidden) {
        if (hidden) {
            if (g6a.m124566o()) {
                m144151A(hidden);
            } else {
                m144153y(hidden);
            }
        }
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this.oDiamondHasPrivilegeView;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (g6a.m124566o()) {
                int i = t100.f167260i;
                mep0.m154302d1(privilegeEntranceHasPrivilegeView, i);
                privilegeEntranceHasPrivilegeView.setBackground(new e190(false));
                xdl0.m208344M(privilegeEntranceHasPrivilegeView.get_border(), false);
                xdl0.m208344M(privilegeEntranceHasPrivilegeView.get_texture(), false);
                privilegeEntranceHasPrivilegeView.get_light_svga().setScaleType(ImageView.ScaleType.CENTER_CROP);
                mep0.m154302d1(privilegeEntranceHasPrivilegeView.get_light_svga(), i);
                m144151A(false);
                privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(d3c0.f84141v5));
                privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.f83493A5);
                privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(Color.parseColor("#CCFFD68C"));
                privilegeEntranceHasPrivilegeView.get_vip_desc().setText(zb90.m217827d(SummarizedPrivilegesId.get("oDiamond")));
                privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.f84113t5);
                xdl0.m208329E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.i190
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        k190.m144148w(this.f110433a, view);
                    }
                });
                return;
            }
            Context context = privilegeEntranceHasPrivilegeView.getContext();
            context.getClass();
            SVGALoader.with(context).repeatCount(-1).autoPlay(false).from("https://auto.tancdn.com/v1/raw/1f20ff80-2be8-4b6b-97e3-1b386ef7ebfe13.pdf").into(privilegeEntranceHasPrivilegeView.get_light_icon_svga());
            xdl0.m208329E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.j190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k190.m144149x(this.f115776a, view);
                }
            });
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(zb90.m217827d(SummarizedPrivilegesId.get("oDiamond")));
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72579v));
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.f84027n3);
            privilegeEntranceHasPrivilegeView.setBackgroundResource(d3c0.f84013m3);
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.f83511B9);
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.f84153w3);
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.f83876c6);
            if (!privilegeEntranceHasPrivilegeView.get_light_icon_svga().isAnimating()) {
                privilegeEntranceHasPrivilegeView.get_light_icon_svga().startAnimation();
            }
            m144153y(false);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m144153y(boolean hidden) {
        final PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this.oDiamondHasPrivilegeView;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceHasPrivilegeView.get_light_svga(), false, 1, null);
                xdl0.m208344M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            } else if (privilegeEntranceHasPrivilegeView.getHeight() == 0) {
                xdl0.m208353Q0(privilegeEntranceHasPrivilegeView, new e30() { // from class: l.h190
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        k190.m144150z(this.f105289a, privilegeEntranceHasPrivilegeView, (int[]) obj);
                    }
                });
            } else {
                AbstractC15528a5.m94949l(this, getPrivilegeEntranceInfo().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
            }
        }
    }
}
