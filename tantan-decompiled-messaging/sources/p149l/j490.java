package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceGuideSigningView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, m87232d2 = {"Ll/j490;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", "w", "(Z)V", "a", "()Z", "b", "()V", "m", "j", "", "h", "()Ljava/lang/String;", Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_top_view", "Lcom/tantan/library/svga/SVGAnimationView;", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "_svga", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceGuideSigningView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class j490 extends AbstractC15528a5 {

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
    public j490(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: u */
    public static final void m139634u(j490 j490Var, View view) {
        zvf0.m220396r(j490Var.mo94542h(), j490Var.m94952f());
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        j490Var.m94957o(strMo33339Ie);
    }

    /* JADX INFO: renamed from: v */
    public static final void m139635v(j490 j490Var, View view) {
        j490Var.m139638s();
        zvf0.m220396r(j490Var.m139639t(), j490Var.m94952f());
    }

    /* JADX INFO: renamed from: w */
    private final void m139636w(boolean hidden) {
        final SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
                xdl0.m208344M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                xdl0.m208353Q0(sVGAnimationView, new e30() { // from class: l.g490
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        j490.m139637x(this.f100551a, sVGAnimationView, (int[]) obj);
                    }
                });
            } else {
                AbstractC15528a5.m94949l(this, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m139637x(j490 j490Var, SVGAnimationView sVGAnimationView, int[] iArr) {
        AbstractC15528a5.m94949l(j490Var, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return src0.m185656r().m185676l() && src0.m185656r().m185660C();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        LinearLayout linearLayout = new LinearLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        linearLayout.setOrientation(1);
        this._top_view = (PrivilegeEntranceHasPrivilegeView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        linearLayout.addView(this._top_view, new LinearLayout.LayoutParams(-2, svq.m186103c(80)));
        this._bottom_view = (PrivilegeEntranceGuideSigningView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.GUIDE_SIGNING_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(52));
        int iM186103c = svq.m186103c(5);
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
        return "e_privilege_banner_svipautosigning";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: j */
    public void mo94543j(boolean hidden) {
        if (hidden) {
            m139636w(true);
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
            xdl0.m208329E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.h490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j490.m139634u(this.f105819a, view);
                }
            });
        }
        PrivilegeEntranceGuideSigningView privilegeEntranceGuideSigningView = this._bottom_view;
        if (privilegeEntranceGuideSigningView != null) {
            privilegeEntranceGuideSigningView.setBackgroundResource(d3c0.f83553E9);
            privilegeEntranceGuideSigningView.get_title().setTypeface(eqh0.m117752c(3));
            privilegeEntranceGuideSigningView.get_title().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(b1c0.f72577u));
            privilegeEntranceGuideSigningView.get_title().setText(src0.m185644Q(false));
            privilegeEntranceGuideSigningView.get_restore().setTypeface(eqh0.m117752c(3));
            privilegeEntranceGuideSigningView.get_restore().setTextColor(Color.parseColor("#AB3E00"));
            privilegeEntranceGuideSigningView.get_restore().setBackgroundResource(d3c0.f84125u3);
            privilegeEntranceGuideSigningView.get_restore().setText("去开通");
            xdl0.m208329E0(privilegeEntranceGuideSigningView, new View.OnClickListener() { // from class: l.i490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j490.m139635v(this.f111418a, view);
                }
            });
            j760[] j760VarArrM185672R = src0.m185656r().m185672R();
            zvf0.m220368A("e_mypage_auto", OMSDialogPositon.p_navigation_view, (j760[]) Arrays.copyOf(j760VarArrM185672R, j760VarArrM185672R.length));
        }
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            vcl0.m197905a(sVGAnimationView, svq.m186103c(10));
            m139636w(false);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m139638s() {
        j760[] j760VarArrM185672R = src0.m185656r().m185672R();
        zvf0.m220399u("e_mypage_auto", OMSDialogPositon.p_navigation_view, (j760[]) Arrays.copyOf(j760VarArrM185672R, j760VarArrM185672R.length));
        if (src0.m185656r().m185687z()) {
            src0.m185656r().m185673S(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), src0.m185656r().m185676l() ? "my_reauto_button_unauto_order" : "my_reauto_button");
        } else {
            CoreModule.m29935P().m94651a().mo33401Rm(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), w2b0.m201089c("p_navigation,privilege_button", 1));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public String m139639t() {
        return "e_privilege_button_svipautosigning";
    }
}
