package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u001b\u0010\u0016\u001a\u00020\t*\u00020\u00152\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/o990;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "a", "()Z", "", "b", "()V", "m", "hidden", "j", "(Z)V", "", "h", "()Ljava/lang/String;", BaseSei.f14625Y, "A", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", c4s.C_ZONE, "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;Z)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "oDiamondHasPrivilegeView", "Ljava/lang/Runnable;", "e", "Ljava/lang/Runnable;", "backgroundShimmerRunnable", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class o990 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView oDiamondHasPrivilegeView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Runnable backgroundShimmerRunnable;

    /* JADX INFO: renamed from: l.o990$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/o990$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19059b extends AnimListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PrivilegeEntranceHasPrivilegeView f145511b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f145512c;

        public C19059b(PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, boolean z) {
            this.f145511b = privilegeEntranceHasPrivilegeView;
            this.f145512c = z;
        }

        /* JADX INFO: renamed from: a */
        public static void m166690a(o990 o990Var, boolean z) {
            o990Var.m166687A(z);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            if (o990.this.backgroundShimmerRunnable == null) {
                final o990 o990Var = o990.this;
                final boolean z = this.f145512c;
                o990Var.backgroundShimmerRunnable = new Runnable() { // from class: l.p990
                    @Override // java.lang.Runnable
                    public final void run() {
                        o990.C19059b.m166690a(o990Var, z);
                    }
                };
            }
            l51.m152890J(o990.this.backgroundShimmerRunnable);
            l51.m152888H(this.f145511b.getContext(), o990.this.backgroundShimmerRunnable, 6000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o990(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: B */
    public static final void m166676B(o990 o990Var, PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, boolean z, int[] iArr) {
        o990Var.m166688C(privilegeEntranceHasPrivilegeView, z);
    }

    /* JADX INFO: renamed from: w */
    public static final void m166684w(o990 o990Var, View view) {
        i4g0.m138520r(o990Var.mo96815h(), o990Var.m214188f());
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        o990Var.m214193o(strMo34318F0);
    }

    /* JADX INFO: renamed from: x */
    public static final void m166685x(o990 o990Var, View view) {
        i4g0.m138520r(o990Var.mo96815h(), o990Var.m214188f());
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        o990Var.m214193o(strMo34318F0);
    }

    /* JADX INFO: renamed from: z */
    public static final void m166686z(o990 o990Var, PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, int[] iArr) {
        AbstractC21509y4.m214185l(o990Var, o990Var.getPrivilegeEntranceInfo().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
    }

    /* JADX INFO: renamed from: A */
    public final void m166687A(final boolean hidden) {
        final PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this.oDiamondHasPrivilegeView;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceHasPrivilegeView.get_light_svga(), false, 1, null);
                bnl0.m105524M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            } else if (privilegeEntranceHasPrivilegeView.getHeight() == 0) {
                bnl0.m105533Q0(privilegeEntranceHasPrivilegeView, new y20() { // from class: l.k990
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        o990.m166676B(this.f124462a, privilegeEntranceHasPrivilegeView, hidden, (int[]) obj);
                    }
                });
            } else {
                m166688C(privilegeEntranceHasPrivilegeView, hidden);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m166688C(PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, boolean z) {
        l51.m152890J(this.backgroundShimmerRunnable);
        m214191k(getPrivilegeEntranceInfo().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/2342d2f5-62e1-4be9-aea8-97900fbd811f14.pdf", 1, new C19059b(privilegeEntranceHasPrivilegeView, z));
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return CoreModule.m30933P().m143405a().mo180437a2();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this.oDiamondHasPrivilegeView = (PrivilegeEntranceHasPrivilegeView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this.oDiamondHasPrivilegeView, new LinearLayout.LayoutParams(-2, txq.m193530c(80)));
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_odiamond";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: j */
    public void mo96816j(boolean hidden) {
        if (hidden) {
            if (s7a.m184986o()) {
                m166687A(hidden);
            } else {
                m166689y(hidden);
            }
        }
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this.oDiamondHasPrivilegeView;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (s7a.m184986o()) {
                int i = qa00.f156322i;
                qnp0.m177261d1(privilegeEntranceHasPrivilegeView, i);
                privilegeEntranceHasPrivilegeView.setBackground(new i990(false));
                bnl0.m105524M(privilegeEntranceHasPrivilegeView.get_border(), false);
                bnl0.m105524M(privilegeEntranceHasPrivilegeView.get_texture(), false);
                privilegeEntranceHasPrivilegeView.get_light_svga().setScaleType(ImageView.ScaleType.CENTER_CROP);
                qnp0.m177261d1(privilegeEntranceHasPrivilegeView.get_light_svga(), i);
                m166687A(false);
                privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(jbc0.f119796v5));
                privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(jbc0.f119148A5);
                privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(Color.parseColor("#CCFFD68C"));
                privilegeEntranceHasPrivilegeView.get_vip_desc().setText(dk90.m116225d(SummarizedPrivilegesId.get("oDiamond")));
                privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(jbc0.f119768t5);
                bnl0.m105509E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.m990
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        o990.m166684w(this.f135360a, view);
                    }
                });
                return;
            }
            Context context = privilegeEntranceHasPrivilegeView.getContext();
            context.getClass();
            SVGALoader.with(context).repeatCount(-1).autoPlay(false).from("https://auto.tancdn.com/v1/raw/1f20ff80-2be8-4b6b-97e3-1b386ef7ebfe13.pdf").into(privilegeEntranceHasPrivilegeView.get_light_icon_svga());
            bnl0.m105509E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.n990
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o990.m166685x(this.f140753a, view);
                }
            });
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(dk90.m116225d(SummarizedPrivilegesId.get("oDiamond")));
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108399v));
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(jbc0.f119682n3);
            privilegeEntranceHasPrivilegeView.setBackgroundResource(jbc0.f119668m3);
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(jbc0.f119166B9);
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(jbc0.f119808w3);
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(jbc0.f119531c6);
            if (!privilegeEntranceHasPrivilegeView.get_light_icon_svga().isAnimating()) {
                privilegeEntranceHasPrivilegeView.get_light_icon_svga().startAnimation();
            }
            m166689y(false);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m166689y(boolean hidden) {
        final PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this.oDiamondHasPrivilegeView;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceHasPrivilegeView.get_light_svga(), false, 1, null);
                bnl0.m105524M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            } else if (privilegeEntranceHasPrivilegeView.getHeight() == 0) {
                bnl0.m105533Q0(privilegeEntranceHasPrivilegeView, new y20() { // from class: l.l990
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        o990.m166686z(this.f130577a, privilegeEntranceHasPrivilegeView, (int[]) obj);
                    }
                });
            } else {
                AbstractC21509y4.m214185l(this, getPrivilegeEntranceInfo().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/b3a90086-1fcf-43e1-be48-3ada60d12fa913.pdf", 0, null, 24, null);
            }
        }
    }
}
