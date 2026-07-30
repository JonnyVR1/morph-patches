package p153l;

import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceGuideSigningView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, m88121d2 = {"Ll/nc90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", "w", "(Z)V", "a", "()Z", "b", "()V", "m", "j", "", "h", "()Ljava/lang/String;", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/tantan/library/svga/SVGAnimationView;", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "_svga", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class nc90 extends AbstractC21509y4 {

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
    public nc90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: u */
    public static final void m162513u(nc90 nc90Var, View view) {
        i4g0.m138520r(nc90Var.mo96815h(), nc90Var.m214188f());
        String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
        strMo34342Ie.getClass();
        nc90Var.m214193o(strMo34342Ie);
    }

    /* JADX INFO: renamed from: v */
    public static final void m162514v(nc90 nc90Var, View view) {
        nc90Var.m162517s();
        i4g0.m138520r(nc90Var.m162518t(), nc90Var.m214188f());
    }

    /* JADX INFO: renamed from: w */
    private final void m162515w(boolean hidden) {
        final SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
                bnl0.m105524M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                bnl0.m105533Q0(sVGAnimationView, new y20() { // from class: l.kc90
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        nc90.m162516x(this.f125031a, sVGAnimationView, (int[]) obj);
                    }
                });
            } else {
                AbstractC21509y4.m214185l(this, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m162516x(nc90 nc90Var, SVGAnimationView sVGAnimationView, int[] iArr) {
        AbstractC21509y4.m214185l(nc90Var, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return xzc0.m213720r().m213740l() && xzc0.m213720r().m213724C();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        LinearLayout linearLayout = new LinearLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        linearLayout.setOrientation(1);
        this._top_view = (PrivilegeEntranceHasPrivilegeView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        linearLayout.addView(this._top_view, new LinearLayout.LayoutParams(-2, txq.m193530c(80)));
        this._bottom_view = (PrivilegeEntranceGuideSigningView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.GUIDE_SIGNING_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(52));
        int iM193530c = txq.m193530c(5);
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
        return "e_privilege_banner_svipautosigning";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: j */
    public void mo96816j(boolean hidden) {
        if (hidden) {
            m162515w(true);
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
            bnl0.m105509E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.lc90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nc90.m162513u(this.f131288a, view);
                }
            });
        }
        PrivilegeEntranceGuideSigningView privilegeEntranceGuideSigningView = this._bottom_view;
        if (privilegeEntranceGuideSigningView != null) {
            privilegeEntranceGuideSigningView.setBackgroundResource(jbc0.f119208E9);
            privilegeEntranceGuideSigningView.get_title().setTypeface(lyh0.m156283c(3));
            privilegeEntranceGuideSigningView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108397u));
            privilegeEntranceGuideSigningView.get_title().setText(xzc0.m213708Q(false));
            privilegeEntranceGuideSigningView.get_restore().setTypeface(lyh0.m156283c(3));
            privilegeEntranceGuideSigningView.get_restore().setTextColor(Color.parseColor("#AB3E00"));
            privilegeEntranceGuideSigningView.get_restore().setBackgroundResource(jbc0.f119780u3);
            privilegeEntranceGuideSigningView.get_restore().setText("去开通");
            bnl0.m105509E0(privilegeEntranceGuideSigningView, new View.OnClickListener() { // from class: l.mc90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nc90.m162514v(this.f135800a, view);
                }
            });
            pf60[] pf60VarArrM213736R = xzc0.m213720r().m213736R();
            i4g0.m138492A("e_mypage_auto", OMSDialogPositon.p_navigation_view, (pf60[]) Arrays.copyOf(pf60VarArrM213736R, pf60VarArrM213736R.length));
        }
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            zll0.m220292a(sVGAnimationView, txq.m193530c(10));
            m162515w(false);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m162517s() {
        pf60[] pf60VarArrM213736R = xzc0.m213720r().m213736R();
        i4g0.m138523u("e_mypage_auto", OMSDialogPositon.p_navigation_view, (pf60[]) Arrays.copyOf(pf60VarArrM213736R, pf60VarArrM213736R.length));
        if (xzc0.m213720r().m213751z()) {
            xzc0.m213720r().m213737S(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), xzc0.m213720r().m213740l() ? "my_reauto_button_unauto_order" : "my_reauto_button");
        } else {
            CoreModule.m30933P().m143405a().mo34404Rm(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), abb0.m96736c("p_navigation,privilege_button", 1));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public String m162518t() {
        return "e_privilege_button_svipautosigning";
    }
}
