package p002l;

import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.putong.live.base.data.BLiveMaskProfileConfig;
import com.p1.mobile.putong.live.base.data.BLiveUserCardButtonColorConfig;
import com.p1.mobile.putong.live.base.data.BLiveUserCardButtonConfig;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.utils.NullChecker;
import l.bwr;
import p002l.ho2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dzj0<D extends ho2> extends wr2<czj0, D> {
    public dzj0(bsm<D> bsmVar, VText vText) {
        super(bsmVar);
        C(new czj0(vText));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        ((czj0) ((bwr) this).viewModel).m11539d();
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        BLiveUserMask bLiveUserMaskM12111e;
        super.mo10254P3();
        if (mo18414g4() == null || (bLiveUserMaskM12111e = e1t.m12111e(mo18414g4().f16959c)) == null) {
            return;
        }
        BLiveMaskProfileConfig bLiveMaskProfileConfig = bLiveUserMaskM12111e.profileConfig;
        if (NullChecker.a(bLiveMaskProfileConfig)) {
            ((czj0) ((bwr) this).viewModel).m11545k(bLiveMaskProfileConfig.buttonConfig);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public LongLinkChatMessage.LiveChatShadingConfig m12091j4(BLiveUserCardButtonConfig bLiveUserCardButtonConfig) {
        LongLinkChatMessage.LiveChatShadingConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveChatShadingConfig.newBuilder();
        builderNewBuilder.setBackgroundColorConfig(m12093l4(bLiveUserCardButtonConfig.backgroundColorConfig));
        builderNewBuilder.setBorderColorConfig(m12093l4(bLiveUserCardButtonConfig.borderColorConfig));
        return builderNewBuilder.build();
    }

    /* JADX INFO: renamed from: k4 */
    public void m12092k4(BLiveUserCardButtonConfig bLiveUserCardButtonConfig) {
        m25331a4();
        if (m25552L2()) {
            mo14197p3(3800, bLiveUserCardButtonConfig.anchorJumpUrl);
        } else {
            mo14197p3(3800, bLiveUserCardButtonConfig.userJumpUrl);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final LongLinkChatMessage.LiveBackgroundColorConfig m12093l4(BLiveUserCardButtonColorConfig bLiveUserCardButtonColorConfig) {
        LongLinkChatMessage.LiveBackgroundColorConfig.Builder builderNewBuilder = LongLinkChatMessage.LiveBackgroundColorConfig.newBuilder();
        builderNewBuilder.setGradientDirection(bLiveUserCardButtonColorConfig.gradientDirection);
        builderNewBuilder.addAllColors(bLiveUserCardButtonColorConfig.colors);
        builderNewBuilder.setTransparency(bLiveUserCardButtonColorConfig.transparency);
        return builderNewBuilder.build();
    }
}
