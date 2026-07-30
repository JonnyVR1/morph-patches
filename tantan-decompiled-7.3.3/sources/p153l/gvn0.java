package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class gvn0 {

    /* JADX INFO: renamed from: a */
    public final BLiveVoiceCall f106656a;

    /* JADX INFO: renamed from: b */
    public final int f106657b;

    /* JADX INFO: renamed from: c */
    public final String f106658c;

    /* JADX INFO: renamed from: d */
    public final String f106659d;

    /* JADX INFO: renamed from: e */
    public final nsv<h64> f106660e;

    /* JADX INFO: renamed from: f */
    public final boolean f106661f;

    /* JADX INFO: renamed from: g */
    public final String f106662g;

    public gvn0(LongLinkLiveMessage.VoiceCall voiceCall, int i) {
        this.f106657b = i;
        this.f106658c = voiceCall.getInviteId();
        this.f106659d = voiceCall.getId();
        this.f106656a = m132562c(voiceCall);
        this.f106660e = m132563d(voiceCall);
        this.f106661f = voiceCall.getFromManager();
        this.f106662g = voiceCall.getManagerUserName();
    }

    /* JADX INFO: renamed from: a */
    public boolean m132560a(boolean z) {
        int i = this.f106657b;
        if (z) {
            return i == 1 || i == 6;
        }
        return i == 3 || i == 1 || i == 6;
    }

    /* JADX INFO: renamed from: b */
    public final BLiveCallEffectConfig m132561b(LongLinkLiveMessage.VoiceCall voiceCall) {
        if (!voiceCall.hasCallEffect()) {
            return null;
        }
        LongLinkLiveMessage.CallEffectConfig callEffect = voiceCall.getCallEffect();
        BLiveCallEffectConfig bLiveCallEffectConfigNew_ = BLiveCallEffectConfig.new_();
        bLiveCallEffectConfigNew_.defaultIcon = callEffect.getDefaultIcon();
        bLiveCallEffectConfigNew_.muteIcon = callEffect.getMuteIcon();
        bLiveCallEffectConfigNew_.verticalBg = callEffect.getVerticalBg();
        bLiveCallEffectConfigNew_.horizontalBg = callEffect.getHorizontalBg();
        bLiveCallEffectConfigNew_.verticalVoicingUrl = callEffect.getVerticalVoicingUrl();
        bLiveCallEffectConfigNew_.horizontalVoicingUrl = callEffect.getHorizontalVoicingUrl();
        bLiveCallEffectConfigNew_.circleVoicingUrl = callEffect.getCircleVoicingUrl();
        return bLiveCallEffectConfigNew_;
    }

    /* JADX INFO: renamed from: c */
    public final BLiveVoiceCall m132562c(LongLinkLiveMessage.VoiceCall voiceCall) {
        if (voiceCall == null) {
            return null;
        }
        BLiveVoiceCall bLiveVoiceCall = new BLiveVoiceCall();
        bLiveVoiceCall.f45333id = voiceCall.getId();
        bLiveVoiceCall.voiceLiveId = voiceCall.getVoiceLiveId();
        bLiveVoiceCall.state = voiceCall.getState();
        bLiveVoiceCall.source = voiceCall.getSource();
        bLiveVoiceCall.userSendRewardPoint = voiceCall.getUserSendRewardPoint();
        bLiveVoiceCall.userRecvRewardPoint = voiceCall.getUserRecvRewardPoint();
        bLiveVoiceCall.intendPosition = voiceCall.getIntendPosition();
        bLiveVoiceCall.position = voiceCall.getPosition();
        bLiveVoiceCall.mutedByAnchor = voiceCall.getMutedByAnchor();
        bLiveVoiceCall.mutedByUser = voiceCall.getMutedByUser();
        bLiveVoiceCall.user = voiceCall.getUserId();
        bLiveVoiceCall.anchor = voiceCall.getAnchorUserId();
        bLiveVoiceCall.inviteId = voiceCall.getInviteId();
        bLiveVoiceCall.userName = voiceCall.getUserName();
        bLiveVoiceCall.isAway = voiceCall.getIsAway();
        bLiveVoiceCall.anchorUserName = voiceCall.getAnchorUserName();
        bLiveVoiceCall.hangupReason = voiceCall.getHangupReason();
        if (voiceCall.getUserProfile() != null) {
            bLiveVoiceCall.userPicture = voiceCall.getUserProfile().getPictureUrl();
        }
        if (voiceCall.getAnchorUserProfile() != null) {
            bLiveVoiceCall.anchorPicture = voiceCall.getAnchorUserProfile().getPictureUrl();
        }
        bLiveVoiceCall.hangupReason = voiceCall.getHangupReason();
        bLiveVoiceCall.role = voiceCall.getRole();
        if (voiceCall.getAwayReason().ordinal() == 1) {
            bLiveVoiceCall.awayReason = ptk0.f154094d;
        } else if (voiceCall.getAwayReason().ordinal() == 2) {
            bLiveVoiceCall.awayReason = ptk0.f154095e;
        }
        if (voiceCall.getStartTime() > 0) {
            bLiveVoiceCall.startTime = String.valueOf(voiceCall.getStartTime());
        }
        if (voiceCall.getBossModeInfo() != null) {
            bLiveVoiceCall.popularity = voiceCall.getBossModeInfo().getPopularity();
            bLiveVoiceCall.contribution = voiceCall.getBossModeInfo().getContribution();
        }
        bLiveVoiceCall.callEffect = m132561b(voiceCall);
        if (voiceCall.getUserNameGradientColorsCount() > 0) {
            bLiveVoiceCall.userNameGradientColors = new ArrayList(voiceCall.getUserNameGradientColorsList());
        }
        return bLiveVoiceCall;
    }

    /* JADX INFO: renamed from: d */
    public final nsv<h64> m132563d(LongLinkLiveMessage.VoiceCall voiceCall) {
        h64 h64Var = new h64(voiceCall.getUserId(), voiceCall.getUserName(), voiceCall.getUserProfile().getPictureUrl());
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        userMaskConfig.UserMask userMask = voiceCall.getUserProfile().getUserMask();
        bLiveUserMaskNew_.color = userMask.getVoiceMaskModeAddition().getColor();
        bLiveUserMaskNew_.gender = userMask.getVoiceMaskModeAddition().getGender();
        bLiveUserMaskNew_.userId = userMask.getUserId();
        bLiveUserMaskNew_.avatar = userMask.getAvatar();
        bLiveUserMaskNew_.avatarConfig.frameConfig = m132573n(userMask.getAvatarConfig().getFrameConfig());
        if (userMask.getUserNameGradientColorsCount() > 0) {
            bLiveUserMaskNew_.userNameGradientColors = new ArrayList(userMask.getUserNameGradientColorsList());
        }
        return nsv.m164636f(h64Var).m164639c(h64Var.f107997a, bLiveUserMaskNew_, voiceCall.getUserProfile().getMaskMode());
    }

    /* JADX INFO: renamed from: e */
    public BLiveVoiceCall m132564e() {
        return this.f106656a;
    }

    /* JADX INFO: renamed from: f */
    public String m132565f() {
        return this.f106659d;
    }

    /* JADX INFO: renamed from: g */
    public nsv<h64> m132566g() {
        return this.f106660e;
    }

    /* JADX INFO: renamed from: h */
    public String m132567h() {
        return this.f106658c;
    }

    /* JADX INFO: renamed from: i */
    public String m132568i() {
        return this.f106662g;
    }

    /* JADX INFO: renamed from: j */
    public int m132569j() {
        return this.f106657b;
    }

    /* JADX INFO: renamed from: k */
    public boolean m132570k(int i) {
        return this.f106657b == i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m132571l() {
        return this.f106661f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m132572m() {
        return zrv.f205799a.m207631D0().equals(this.f106660e.f143542a.f107997a);
    }

    /* JADX INFO: renamed from: n */
    public final BLiveAvatarFrameConfig m132573n(userMaskConfig.PictureConfig pictureConfig) {
        BLiveAvatarFrameConfig bLiveAvatarFrameConfigNew_ = BLiveAvatarFrameConfig.new_();
        bLiveAvatarFrameConfigNew_.staticUrl = pictureConfig.getStaticUrl();
        bLiveAvatarFrameConfigNew_.dynamicUrl = pictureConfig.getDynamicUrl();
        bLiveAvatarFrameConfigNew_.smallDynamicUrl = pictureConfig.getSmallDynamicUrl();
        bLiveAvatarFrameConfigNew_.mediumDynamicUrl = pictureConfig.getMediumDynamicUrl();
        bLiveAvatarFrameConfigNew_.totalSec = (int) pictureConfig.getTotalSec();
        bLiveAvatarFrameConfigNew_.remainingSec = (int) pictureConfig.getRemainingSec();
        bLiveAvatarFrameConfigNew_.changeVoiceNo = (int) pictureConfig.getChangeVoiceNo();
        bLiveAvatarFrameConfigNew_.endMill = pictureConfig.getEndMill();
        bLiveAvatarFrameConfigNew_.funnyUrl = pictureConfig.getFunnyUrl();
        return bLiveAvatarFrameConfigNew_;
    }
}
