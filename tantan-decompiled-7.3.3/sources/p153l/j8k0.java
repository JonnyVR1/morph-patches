package p153l;

import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveMaskProfileConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardButtonColorConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardButtonConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class j8k0<D extends oo2> extends ms2<i8k0, D> {
    public j8k0(dum<D> dumVar, VText vText) {
        super(dumVar);
        mo52715C(new i8k0(vText));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        ((i8k0) this.viewModel).m139014d();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        BLiveUserMask bLiveUserMaskM123804e;
        super.mo96837P3();
        if (mo159733g4() == null || (bLiveUserMaskM123804e = f3t.m123804e(mo159733g4().f183108c)) == null) {
            return;
        }
        BLiveMaskProfileConfig bLiveMaskProfileConfig = bLiveUserMaskM123804e.profileConfig;
        if (NullChecker.m82486a(bLiveMaskProfileConfig)) {
            ((i8k0) this.viewModel).m139019k(bLiveMaskProfileConfig.buttonConfig);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public LongLinkChatMessage.LiveChatShadingConfig m143836j4(BLiveUserCardButtonConfig bLiveUserCardButtonConfig) {
        LongLinkChatMessage.LiveChatShadingConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveChatShadingConfig.newBuilder();
        builderNewBuilder.setBackgroundColorConfig(m143838l4(bLiveUserCardButtonConfig.backgroundColorConfig));
        builderNewBuilder.setBorderColorConfig(m143838l4(bLiveUserCardButtonConfig.borderColorConfig));
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: k4 */
    public void m143837k4(BLiveUserCardButtonConfig bLiveUserCardButtonConfig) {
        m159727a4();
        if (m213815L2()) {
            mo138869p3(3800, bLiveUserCardButtonConfig.anchorJumpUrl);
        } else {
            mo138869p3(3800, bLiveUserCardButtonConfig.userJumpUrl);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m143838l4(BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(bLiveUserCardButtonColorConfig.gradientDirection);
        builderNewBuilder.addAllColors(bLiveUserCardButtonColorConfig.colors);
        builderNewBuilder.setTransparency(bLiveUserCardButtonColorConfig.transparency);
        return builderNewBuilder.build();
    }
}
