package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class cmn0 {

    /* JADX INFO: renamed from: a */
    public final BLiveVoiceCall f81588a;

    /* JADX INFO: renamed from: b */
    public final int f81589b;

    /* JADX INFO: renamed from: c */
    public final String f81590c;

    /* JADX INFO: renamed from: d */
    public final String f81591d;

    /* JADX INFO: renamed from: e */
    public final mqv<i54> f81592e;

    /* JADX INFO: renamed from: f */
    public final boolean f81593f;

    /* JADX INFO: renamed from: g */
    public final String f81594g;

    public cmn0(LongLinkLiveMessage.VoiceCall voiceCall, int i) {
        this.f81589b = i;
        this.f81590c = voiceCall.getInviteId();
        this.f81591d = voiceCall.getId();
        this.f81588a = m107675c(voiceCall);
        this.f81592e = m107676d(voiceCall);
        this.f81593f = voiceCall.getFromManager();
        this.f81594g = voiceCall.getManagerUserName();
    }

    /* JADX INFO: renamed from: a */
    public boolean m107673a(boolean z) {
        int i = this.f81589b;
        if (z) {
            return i == 1 || i == 6;
        }
        return i == 3 || i == 1 || i == 6;
    }

    /* JADX INFO: renamed from: b */
    public final BLiveCallEffectConfig m107674b(LongLinkLiveMessage.VoiceCall voiceCall) {
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
    public final BLiveVoiceCall m107675c(LongLinkLiveMessage.VoiceCall voiceCall) {
        if (voiceCall == null) {
            return null;
        }
        BLiveVoiceCall bLiveVoiceCall = new BLiveVoiceCall();
        bLiveVoiceCall.f44485id = voiceCall.getId();
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
            bLiveVoiceCall.awayReason = jkk0.f118394d;
        } else if (voiceCall.getAwayReason().ordinal() == 2) {
            bLiveVoiceCall.awayReason = jkk0.f118395e;
        }
        if (voiceCall.getStartTime() > 0) {
            bLiveVoiceCall.startTime = String.valueOf(voiceCall.getStartTime());
        }
        if (voiceCall.getBossModeInfo() != null) {
            bLiveVoiceCall.popularity = voiceCall.getBossModeInfo().getPopularity();
            bLiveVoiceCall.contribution = voiceCall.getBossModeInfo().getContribution();
        }
        bLiveVoiceCall.callEffect = m107674b(voiceCall);
        if (voiceCall.getUserNameGradientColorsCount() > 0) {
            bLiveVoiceCall.userNameGradientColors = new ArrayList(voiceCall.getUserNameGradientColorsList());
        }
        return bLiveVoiceCall;
    }

    /* JADX INFO: renamed from: d */
    public final mqv<i54> m107676d(LongLinkLiveMessage.VoiceCall voiceCall) {
        i54 i54Var = new i54(voiceCall.getUserId(), voiceCall.getUserName(), voiceCall.getUserProfile().getPictureUrl());
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        userMaskConfig.UserMask userMask = voiceCall.getUserProfile().getUserMask();
        bLiveUserMaskNew_.color = userMask.getVoiceMaskModeAddition().getColor();
        bLiveUserMaskNew_.gender = userMask.getVoiceMaskModeAddition().getGender();
        bLiveUserMaskNew_.userId = userMask.getUserId();
        bLiveUserMaskNew_.avatar = userMask.getAvatar();
        bLiveUserMaskNew_.avatarConfig.frameConfig = m107686n(userMask.getAvatarConfig().getFrameConfig());
        if (userMask.getUserNameGradientColorsCount() > 0) {
            bLiveUserMaskNew_.userNameGradientColors = new ArrayList(userMask.getUserNameGradientColorsList());
        }
        return mqv.m155998f(i54Var).m156001c(i54Var.f111520a, bLiveUserMaskNew_, voiceCall.getUserProfile().getMaskMode());
    }

    /* JADX INFO: renamed from: e */
    public BLiveVoiceCall m107677e() {
        return this.f81588a;
    }

    /* JADX INFO: renamed from: f */
    public String m107678f() {
        return this.f81591d;
    }

    /* JADX INFO: renamed from: g */
    public mqv<i54> m107679g() {
        return this.f81592e;
    }

    /* JADX INFO: renamed from: h */
    public String m107680h() {
        return this.f81590c;
    }

    /* JADX INFO: renamed from: i */
    public String m107681i() {
        return this.f81594g;
    }

    /* JADX INFO: renamed from: j */
    public int m107682j() {
        return this.f81589b;
    }

    /* JADX INFO: renamed from: k */
    public boolean m107683k(int i) {
        return this.f81589b == i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m107684l() {
        return this.f81593f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m107685m() {
        return ypv.f199493a.m199309D0().equals(this.f81592e.f135304a.f111520a);
    }

    /* JADX INFO: renamed from: n */
    public final BLiveAvatarFrameConfig m107686n(userMaskConfig.PictureConfig pictureConfig) {
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
