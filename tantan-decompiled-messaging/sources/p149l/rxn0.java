package p149l;

import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class rxn0 {
    /* JADX INFO: renamed from: a */
    public static BLiveUserMask m181617a(userMaskConfig.UserMask userMask) {
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        bLiveUserMaskNew_.color = userMask.getVoiceMaskModeAddition().getColor();
        bLiveUserMaskNew_.gender = userMask.getVoiceMaskModeAddition().getGender();
        bLiveUserMaskNew_.avatar = userMask.getAvatar();
        bLiveUserMaskNew_.userId = userMask.getUserId();
        bLiveUserMaskNew_.originUserId = userMask.getUserId();
        bLiveUserMaskNew_.name = userMask.getName();
        bLiveUserMaskNew_.avatarConfig.frameConfig.staticUrl = userMask.getAvatarConfig().getFrameConfig().getStaticUrl();
        bLiveUserMaskNew_.avatarConfig.frameConfig.dynamicUrl = userMask.getAvatarConfig().getFrameConfig().getDynamicUrl();
        bLiveUserMaskNew_.avatarConfig.frameConfig.mediumDynamicUrl = userMask.getAvatarConfig().getFrameConfig().getMediumDynamicUrl();
        bLiveUserMaskNew_.avatarConfig.frameConfig.smallDynamicUrl = userMask.getAvatarConfig().getFrameConfig().getSmallDynamicUrl();
        bLiveUserMaskNew_.avatarResourceType = userMask.getAvatarResourceType();
        if (!vwb.m200296J(userMask.getUserNameGradientColorsList())) {
            bLiveUserMaskNew_.userNameGradientColors = new ArrayList(userMask.getUserNameGradientColorsList());
        }
        bLiveUserMaskNew_.avatarConfig.frameConfig.funnyUrl = userMask.getAvatarConfig().getFrameConfig().getFunnyUrl();
        bLiveUserMaskNew_.avatarConfig.frameConfig.endMill = userMask.getAvatarConfig().getFrameConfig().getEndMill();
        bLiveUserMaskNew_.avatarConfig.frameConfig.totalSec = (int) userMask.getAvatarConfig().getFrameConfig().getTotalSec();
        bLiveUserMaskNew_.avatarConfig.frameConfig.remainingSec = (int) userMask.getAvatarConfig().getFrameConfig().getRemainingSec();
        bLiveUserMaskNew_.avatarConfig.frameConfig.changeVoiceNo = (int) userMask.getAvatarConfig().getFrameConfig().getChangeVoiceNo();
        return bLiveUserMaskNew_;
    }
}
