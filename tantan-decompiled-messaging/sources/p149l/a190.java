package p149l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, m87232d2 = {"Ll/a190;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "u", "()V", "", "a", "()Z", "b", "m", "hidden", "j", "(Z)V", "", "h", "()Ljava/lang/String;", Constants.KEY_T, BaseSei.f13930X, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/tantan/library/svga/SVGAnimationView;", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "_svga", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "Lcom/p1/mobile/putong/core/data/Merchandise;", "g", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class a190 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView _svga;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceODiamondSingleView _bottom_view;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Merchandise merchandise;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a190(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m94534r(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: u */
    private final void m94536u() {
        this.merchandise = (Merchandise) vwb.m200346r(CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get(ProductCategory.tttVip)), new w9j() { // from class: l.z090
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return a190.m94534r((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final void m94537v(a190 a190Var, View view) {
        zvf0.m220396r(a190Var.mo94542h(), a190Var.m94952f());
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        a190Var.m94957o(strMo33339Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m94538w(a190 a190Var, View view) {
        zvf0.m220396r(a190Var.mo94545t(), a190Var.m94952f());
        zvf0.m220399u("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y("privileges_guide_type", "oDiamond"));
        String strMo33315F0 = CoreModule.m29935P().m94651a().mo33315F0();
        strMo33315F0.getClass();
        a190Var.m94957o(strMo33315F0);
    }

    /* JADX INFO: renamed from: y */
    public static final void m94539y(a190 a190Var, SVGAnimationView sVGAnimationView, int[] iArr) {
        AbstractC15528a5.m94949l(a190Var, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return !xma.m210060Y3() && sj20.m184407a().m184408b() && xma.m210047L3() && !CoreModule.f17545c.f19598Q1.f20117R.m34760N() && sj20.m184407a().m184410d();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        m94536u();
        LinearLayout linearLayout = new LinearLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        linearLayout.setOrientation(1);
        this._top_view = (PrivilegeEntranceHasPrivilegeView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        linearLayout.addView(this._top_view, new LinearLayout.LayoutParams(-2, svq.m186103c(80)));
        int iM186103c = svq.m186103c(5);
        this._bottom_view = (PrivilegeEntranceODiamondSingleView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(52));
        layoutParams.leftMargin = iM186103c;
        layoutParams.rightMargin = iM186103c;
        layoutParams.bottomMargin = iM186103c;
        linearLayout.addView(this._bottom_view, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), null, 0, 0, 14, null);
        this._svga = sVGAnimationView;
        sVGAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(this._svga, new FrameLayout.LayoutParams(-1, svq.m186103c(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA)));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        getPrivilegeEntranceInfo().getRoot().addView(frameLayout);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_hwbefore24hodsvip";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: j */
    public void mo94543j(boolean hidden) {
        if (hidden) {
            m94546x(true);
        }
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f84097s3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(d3c0.f84181y3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(d3c0.f84111t3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(d3c0.f84139v3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(d3c0.f83932g6);
            String strM217827d = zb90.m217827d(SummarizedPrivilegesId.get("svip"));
            boolean zM185669M = src0.m185656r().m185669M();
            boolean zM185686y = src0.m185656r().m185686y();
            if (zM185669M && zM185686y) {
                strM217827d = CoreModule.m29935P().m94651a().mo33475c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strM217827d);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72577u));
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(d3c0.f83525C9);
            xdl0.m208344M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            xdl0.m208329E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.x090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a190.m94537v(this.f188941a, view);
                }
            });
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (g6a.m124566o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.f84057p5);
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.m117752c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72527Q));
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                privilegeEntranceODiamondSingleView.get_unlock().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72520J));
                privilegeEntranceODiamondSingleView.get_unlock().setBackgroundResource(d3c0.f84071q5);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_unlock(), true);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(d3c0.f84041o3);
                qib0.f154691G.m102354Y0(privilegeEntranceODiamondSingleView.get_texture(), d3c0.f84055p3);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(eqh0.m117752c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                xdl0.m208344M(privilegeEntranceODiamondSingleView.get_unlock(), true);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
            }
            xdl0.m208329E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.y090
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a190.m94538w(this.f195283a, view);
                }
            });
            zvf0.m220368A("e_purchase_banner", OMSDialogPositon.p_navigation_view, vwb.m200311Y("privileges_guide_type", "oDiamond"));
        }
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            vcl0.m197905a(sVGAnimationView, svq.m186103c(10));
            m94546x(false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public String mo94545t() {
        return "e_privilege_button_hwbefore24hodsvip";
    }

    /* JADX INFO: renamed from: x */
    public final void m94546x(boolean hidden) {
        final SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
                xdl0.m208344M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                xdl0.m208353Q0(sVGAnimationView, new e30() { // from class: l.w090
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        a190.m94539y(this.f183736a, sVGAnimationView, (int[]) obj);
                    }
                });
            } else {
                AbstractC15528a5.m94949l(this, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }
}
