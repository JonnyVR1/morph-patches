package p153l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceODiamondSingleView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, m88121d2 = {"Ll/e990;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "u", "()V", "", "a", "()Z", "b", "m", "hidden", "j", "(Z)V", "", "h", "()Ljava/lang/String;", Constants.KEY_T, BaseSei.f14624X, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/tantan/library/svga/SVGAnimationView;", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "_svga", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceODiamondSingleView;", "_bottom_view", "Lcom/p1/mobile/putong/core/data/Merchandise;", "g", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class e990 extends AbstractC21509y4 {

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
    public e990(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m119873r(Merchandise merchandise) {
        merchandise.getClass();
        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
    }

    /* JADX INFO: renamed from: u */
    private final void m119875u() {
        this.merchandise = (Merchandise) jyb.m147529r(CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get(ProductCategory.tttVip)), new qcj() { // from class: l.d990
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return e990.m119873r((Merchandise) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final void m119876v(e990 e990Var, View view) {
        i4g0.m138520r(e990Var.mo96815h(), e990Var.m214188f());
        String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
        strMo34342Ie.getClass();
        e990Var.m214193o(strMo34342Ie);
    }

    /* JADX INFO: renamed from: w */
    public static final void m119877w(e990 e990Var, View view) {
        i4g0.m138520r(e990Var.mo119879t(), e990Var.m214188f());
        i4g0.m138523u("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("privileges_guide_type", "oDiamond"));
        String strMo34318F0 = CoreModule.m30933P().m143405a().mo34318F0();
        strMo34318F0.getClass();
        e990Var.m214193o(strMo34318F0);
    }

    /* JADX INFO: renamed from: y */
    public static final void m119878y(e990 e990Var, SVGAnimationView sVGAnimationView, int[] iArr) {
        AbstractC21509y4.m214185l(e990Var, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return !joa.m146374Z3() && cs20.m112113a().m112114b() && joa.m146361M3() && !CoreModule.f18264c.f20340Q1.f20859R.m35763N() && cs20.m112113a().m112116d();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        m119875u();
        LinearLayout linearLayout = new LinearLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        linearLayout.setOrientation(1);
        this._top_view = (PrivilegeEntranceHasPrivilegeView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        linearLayout.addView(this._top_view, new LinearLayout.LayoutParams(-2, txq.m193530c(80)));
        int iM193530c = txq.m193530c(5);
        this._bottom_view = (PrivilegeEntranceODiamondSingleView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.ODIAMOND_SINGLE_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(52));
        layoutParams.leftMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.bottomMargin = iM193530c;
        linearLayout.addView(this._bottom_view, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), null, 0, 0, 14, null);
        this._svga = sVGAnimationView;
        sVGAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(this._svga, new FrameLayout.LayoutParams(-1, txq.m193530c(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA)));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        getPrivilegeEntranceInfo().getRoot().addView(frameLayout);
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_hwbefore24hodsvip";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: j */
    public void mo96816j(boolean hidden) {
        if (hidden) {
            m119880x(true);
        }
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(jbc0.f119752s3);
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._top_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(jbc0.f119836y3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(jbc0.f119766t3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(jbc0.f119794v3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(jbc0.f119587g6);
            String strM116225d = dk90.m116225d(SummarizedPrivilegesId.get("svip"));
            boolean zM213733M = xzc0.m213720r().m213733M();
            boolean zM213750y = xzc0.m213720r().m213750y();
            if (zM213733M && zM213750y) {
                strM116225d = CoreModule.m30933P().m143405a().mo34478c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strM116225d);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108397u));
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(jbc0.f119180C9);
            bnl0.m105524M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            bnl0.m105509E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.b990
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e990.m119876v(this.f75527a, view);
                }
            });
        }
        PrivilegeEntranceODiamondSingleView privilegeEntranceODiamondSingleView = this._bottom_view;
        if (privilegeEntranceODiamondSingleView != null) {
            if (s7a.m184986o()) {
                privilegeEntranceODiamondSingleView.setBackgroundResource(jbc0.f119712p5);
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_texture(), false);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(lyh0.m156283c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                privilegeEntranceODiamondSingleView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108347Q));
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                privilegeEntranceODiamondSingleView.get_unlock().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108340J));
                privilegeEntranceODiamondSingleView.get_unlock().setBackgroundResource(jbc0.f119726q5);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_unlock(), true);
            } else {
                privilegeEntranceODiamondSingleView.setBackgroundResource(jbc0.f119696o3);
                uqb0.f180374G.m127138Y0(privilegeEntranceODiamondSingleView.get_texture(), jbc0.f119710p3);
                privilegeEntranceODiamondSingleView.get_title().setTypeface(lyh0.m156283c(3));
                privilegeEntranceODiamondSingleView.get_title().setText("解锁黑金会员，尊享全平台权益!");
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_arrow_right(), false);
                bnl0.m105524M(privilegeEntranceODiamondSingleView.get_unlock(), true);
                privilegeEntranceODiamondSingleView.get_unlock().setText("去解锁");
            }
            bnl0.m105509E0(privilegeEntranceODiamondSingleView, new View.OnClickListener() { // from class: l.c990
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e990.m119877w(this.f80314a, view);
                }
            });
            i4g0.m138492A("e_purchase_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("privileges_guide_type", "oDiamond"));
        }
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            zll0.m220292a(sVGAnimationView, txq.m193530c(10));
            m119880x(false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public String mo119879t() {
        return "e_privilege_button_hwbefore24hodsvip";
    }

    /* JADX INFO: renamed from: x */
    public final void m119880x(boolean hidden) {
        final SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
                bnl0.m105524M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                bnl0.m105533Q0(sVGAnimationView, new y20() { // from class: l.a990
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        e990.m119878y(this.f69005a, sVGAnimationView, (int[]) obj);
                    }
                });
            } else {
                AbstractC21509y4.m214185l(this, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }
}
