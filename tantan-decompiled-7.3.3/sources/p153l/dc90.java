package p153l;

import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceHasPrivilegeView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m88121d2 = {"Ll/dc90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "hidden", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Z)V", "a", "()Z", "b", "()V", "m", "", "h", "()Ljava/lang/String;", "j", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceHasPrivilegeView;", "_privilege_view", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dc90 extends AbstractC21509y4 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceHasPrivilegeView _privilege_view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
    }

    /* JADX INFO: renamed from: r */
    public static final void m115241r(dc90 dc90Var, View view) {
        i4g0.m138520r(dc90Var.mo96815h(), dc90Var.m214188f());
        String strMo34342Ie = CoreModule.m30933P().m143405a().mo34342Ie();
        strMo34342Ie.getClass();
        dc90Var.m214193o(strMo34342Ie);
    }

    /* JADX INFO: renamed from: s */
    private final void m115242s(boolean hidden) {
        final PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._privilege_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            if (hidden) {
                SVGAnimationView.stopAnimation$default(privilegeEntranceHasPrivilegeView.get_light_svga(), false, 1, null);
                bnl0.m105524M(privilegeEntranceHasPrivilegeView.get_light_svga(), false);
            } else if (privilegeEntranceHasPrivilegeView.getHeight() == 0) {
                bnl0.m105533Q0(privilegeEntranceHasPrivilegeView, new y20() { // from class: l.bc90
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        dc90.m115243t(this.f76112a, privilegeEntranceHasPrivilegeView, (int[]) obj);
                    }
                });
            } else {
                AbstractC21509y4.m214185l(this, getPrivilegeEntranceInfo().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m115243t(dc90 dc90Var, PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView, int[] iArr) {
        AbstractC21509y4.m214185l(dc90Var, dc90Var.getPrivilegeEntranceInfo().getRoot(), privilegeEntranceHasPrivilegeView.get_light_svga(), "https://auto.tancdn.com/v1/raw/f02f282a-b010-44d2-97a6-26182984414a12.pdf", 0, null, 24, null);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        return dk90.m116229h();
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        this._privilege_view = (PrivilegeEntranceHasPrivilegeView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.HAS_PRIVILEGE_VIEW);
        getPrivilegeEntranceInfo().getRoot().addView(this._privilege_view, new LinearLayout.LayoutParams(-2, txq.m193530c(80)));
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_svip";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: j */
    public void mo96816j(boolean hidden) {
        if (hidden) {
            m115242s(true);
        }
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        super.mo96817m();
        PrivilegeEntranceHasPrivilegeView privilegeEntranceHasPrivilegeView = this._privilege_view;
        if (privilegeEntranceHasPrivilegeView != null) {
            privilegeEntranceHasPrivilegeView.setBackgroundResource(jbc0.f119752s3);
            privilegeEntranceHasPrivilegeView.get_texture().setImageResource(jbc0.f119836y3);
            privilegeEntranceHasPrivilegeView.get_border().setBackgroundResource(jbc0.f119766t3);
            privilegeEntranceHasPrivilegeView.get_light_icon_svga().setImageDrawable(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().drawable(jbc0.f119794v3));
            privilegeEntranceHasPrivilegeView.get_iv_privilege_icon().setImageResource(jbc0.f119587g6);
            privilegeEntranceHasPrivilegeView.get_vip_desc().setTextColor(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108397u));
            String strM116225d = dk90.m116225d(SummarizedPrivilegesId.get("svip"));
            boolean zM213733M = xzc0.m213720r().m213733M();
            boolean zM213750y = xzc0.m213720r().m213750y();
            if (zM213733M && zM213750y) {
                strM116225d = CoreModule.m30933P().m143405a().mo34478c7();
            }
            privilegeEntranceHasPrivilegeView.get_vip_desc().setText(strM116225d);
            privilegeEntranceHasPrivilegeView.get_vip_go().setImageResource(jbc0.f119180C9);
            m115242s(false);
            bnl0.m105509E0(privilegeEntranceHasPrivilegeView, new View.OnClickListener() { // from class: l.cc90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dc90.m115241r(this.f80897a, view);
                }
            });
        }
    }
}
