package p149l;

import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveMaskProfileConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardButtonColorConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardButtonConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class dzj0<D extends ho2> extends wr2<czj0, D> {
    public dzj0(bsm<D> bsmVar, VText vText) {
        super(bsmVar);
        mo51532C(new czj0(vText));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        ((czj0) this.viewModel).m109416d();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        BLiveUserMask bLiveUserMaskM114443e;
        super.mo99576P3();
        if (mo157426g4() == null || (bLiveUserMaskM114443e = e1t.m114443e(mo157426g4().f146688c)) == null) {
            return;
        }
        BLiveMaskProfileConfig bLiveMaskProfileConfig = bLiveUserMaskM114443e.profileConfig;
        if (NullChecker.m81303a(bLiveMaskProfileConfig)) {
            ((czj0) this.viewModel).m109421k(bLiveMaskProfileConfig.buttonConfig);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public LongLinkChatMessage.LiveChatShadingConfig m114124j4(BLiveUserCardButtonConfig bLiveUserCardButtonConfig) {
        LongLinkChatMessage.LiveChatShadingConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveChatShadingConfig.newBuilder();
        builderNewBuilder.setBackgroundColorConfig(m114126l4(bLiveUserCardButtonConfig.backgroundColorConfig));
        builderNewBuilder.setBorderColorConfig(m114126l4(bLiveUserCardButtonConfig.borderColorConfig));
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: k4 */
    public void m114125k4(BLiveUserCardButtonConfig bLiveUserCardButtonConfig) {
        m205081a4();
        if (m206032L2()) {
            mo129310p3(3800, bLiveUserCardButtonConfig.anchorJumpUrl);
        } else {
            mo129310p3(3800, bLiveUserCardButtonConfig.userJumpUrl);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m114126l4(BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(bLiveUserCardButtonColorConfig.gradientDirection);
        builderNewBuilder.addAllColors(bLiveUserCardButtonColorConfig.colors);
        builderNewBuilder.setTransparency(bLiveUserCardButtonColorConfig.transparency);
        return builderNewBuilder.build();
    }
}
