package p149l;

import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeViewType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantan.library.svga.SVGAnimationView;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m87232d2 = {"Ll/w390;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", ResourceDirection.f38808v, "(Z)V", "a", "()Z", "b", "()V", "m", "j", "", "h", "()Ljava/lang/String;", BLiveStormDanmakuGiftResourceType.f44446s, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "_top_view", "Lcom/tantan/library/svga/SVGAnimationView;", "e", "Lcom/tantan/library/svga/SVGAnimationView;", "_svga", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "_bottom_view", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class w390 extends AbstractC15528a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView _top_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView _svga;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView _bottom_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w390(@NotNull PrivilegeEntranceView.C8293a c8293a) {
        super(c8293a);
        c8293a.getClass();
    }

    /* JADX INFO: renamed from: t */
    public static final void m201274t(w390 w390Var, View view) {
        zvf0.m220396r(w390Var.mo94542h(), w390Var.m94952f());
        String strMo33339Ie = CoreModule.m29935P().m94651a().mo33339Ie();
        strMo33339Ie.getClass();
        w390Var.m94957o(strMo33339Ie);
    }

    /* JADX INFO: renamed from: u */
    public static final void m201275u(w390 w390Var, View view) {
        j760[] j760VarArrM185672R = src0.m185656r().m185672R();
        zvf0.m220399u("e_mypage_auto", OMSDialogPositon.p_navigation_view, (j760[]) Arrays.copyOf(j760VarArrM185672R, j760VarArrM185672R.length));
        zvf0.m220396r(w390Var.m201278s(), w390Var.m94952f());
        if (src0.m185656r().m185687z()) {
            src0.m185656r().m185673S(w390Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), src0.m185656r().m185676l() ? "my_reauto_button_unauto_order" : "my_reauto_button");
            return;
        }
        String strM201089c = w2b0.m201089c("p_navigation,privilege_button", 1);
        if (src0.m185656r().m185669M()) {
            CoreModule.m29935P().m94651a().mo33401Rm(w390Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), strM201089c);
            return;
        }
        Act act = w390Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String();
        strM201089c.getClass();
        C8764c.m53418O1(act, strM201089c, null, null, null, false, null, null, null, 508, null);
    }

    /* JADX INFO: renamed from: v */
    private final void m201276v(boolean hidden) {
        final SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(sVGAnimationView, false, 1, null);
                xdl0.m208344M(sVGAnimationView, false);
            } else if (sVGAnimationView.getHeight() == 0) {
                xdl0.m208353Q0(sVGAnimationView, new e30() { // from class: l.t390
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        w390.m201277w(this.f167603a, sVGAnimationView, (int[]) obj);
                    }
                });
            } else {
                AbstractC15528a5.m94949l(this, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m201277w(w390 w390Var, SVGAnimationView sVGAnimationView, int[] iArr) {
        AbstractC15528a5.m94949l(w390Var, sVGAnimationView, sVGAnimationView, "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo94540a() {
        return zb90.m217831h() && !xma.m210043F3() && src0.m185656r().m185669M() && !src0.m185656r().m185686y();
    }

    @Override // p149l.s0m
    /* JADX INFO: renamed from: b */
    public void mo94541b() {
        LinearLayout linearLayout = new LinearLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        linearLayout.setOrientation(1);
        this._top_view = (PrivilegeEntranceSingleTextWithIconBgView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.m186103c(47));
        int iM186103c = svq.m186103c(5);
        layoutParams.leftMargin = iM186103c;
        layoutParams.rightMargin = iM186103c;
        layoutParams.topMargin = iM186103c;
        layoutParams.bottomMargin = iM186103c;
        linearLayout.addView(this._top_view, layoutParams);
        this._bottom_view = (PrivilegeEntrancePromotionBottomView) m94954i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.m186103c(76));
        layoutParams2.leftMargin = iM186103c;
        layoutParams2.rightMargin = iM186103c;
        layoutParams2.bottomMargin = iM186103c;
        linearLayout.addView(this._bottom_view, layoutParams2);
        FrameLayout frameLayout = new FrameLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), null, 0, 0, 14, null);
        this._svga = sVGAnimationView;
        sVGAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(this._svga, new FrameLayout.LayoutParams(-1, svq.m186103c(CipherSuite.TLS_PSK_WITH_RC4_128_SHA)));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        getPrivilegeEntranceInfo().getRoot().addView(frameLayout);
    }

    @Override // p149l.AbstractC15528a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo94542h() {
        return "e_privilege_banner_svipautorecovery";
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: j */
    public void mo94543j(boolean hidden) {
        if (hidden) {
            m201276v(true);
        }
    }

    @Override // p149l.AbstractC15528a5
    /* JADX INFO: renamed from: m */
    public void mo94544m() {
        super.mo94544m();
        getPrivilegeEntranceInfo().getRoot().setBackgroundResource(d3c0.f84158w8);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this._top_view;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            privilegeEntranceSingleTextWithIconBgView.setBackgroundResource(d3c0.f84111t3);
            privilegeEntranceSingleTextWithIconBgView.get_texture().setImageResource(d3c0.f83491A3);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon_simple().setImageResource(d3c0.f83918f6);
            privilegeEntranceSingleTextWithIconBgView.get_privilege_icon().setImageResource(d3c0.f83932g6);
            privilegeEntranceSingleTextWithIconBgView.get_go().setImageResource(d3c0.f84074q8);
            privilegeEntranceSingleTextWithIconBgView.get_desc().setText(zb90.m217827d(SummarizedPrivilegesId.get("svip")));
            privilegeEntranceSingleTextWithIconBgView.get_desc().setTextColor(Color.parseColor("#E6D35006"));
            xdl0.m208344M(privilegeEntranceSingleTextWithIconBgView.get_light_svga(), false);
            xdl0.m208329E0(privilegeEntranceSingleTextWithIconBgView, new View.OnClickListener() { // from class: l.u390
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w390.m201274t(this.f173585a, view);
                }
            });
        }
        PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this._bottom_view;
        if (privilegeEntrancePromotionBottomView != null) {
            privilegeEntrancePromotionBottomView.setBackgroundResource(d3c0.f83552E8);
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_icon(), false);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setText(R$string.f27492j7);
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_promotion_desc().setTextColor(Color.parseColor("#E6D35006"));
            xdl0.m208344M(privilegeEntrancePromotionBottomView.get_promotion_tip(), false);
            privilegeEntrancePromotionBottomView.get_buy_tip().setTextColor(Color.parseColor("#CCD35006"));
            privilegeEntrancePromotionBottomView.get_buy_tip().setText("开通订阅即可限时恢复");
            privilegeEntrancePromotionBottomView.get_goto_buy().setTextColor(Color.parseColor("#AB3E00"));
            privilegeEntrancePromotionBottomView.get_goto_buy().setTypeface(eqh0.m117752c(3));
            privilegeEntrancePromotionBottomView.get_goto_buy().setBackgroundResource(d3c0.f84172x8);
            privilegeEntrancePromotionBottomView.get_goto_buy().setText("去恢复");
            xdl0.m208329E0(privilegeEntrancePromotionBottomView.get_goto_buy(), new View.OnClickListener() { // from class: l.v390
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w390.m201275u(this.f179758a, view);
                }
            });
        }
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            vcl0.m197905a(sVGAnimationView, svq.m186103c(10));
            m201276v(false);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public String m201278s() {
        return "e_privilege_button_svipautorecovery";
    }
}
