package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class e1t {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static BLiveUserMask m114439a(userMaskConfig.UserMask userMask, BLiveUserMask bLiveUserMask) {
        bLiveUserMask.avatar = userMask.getAvatar();
        bLiveUserMask.name = userMask.getName();
        bLiveUserMask.color = userMask.getVoiceMaskModeAddition().getColor();
        bLiveUserMask.gender = userMask.getVoiceMaskModeAddition().getGender();
        bLiveUserMask.avatarConfig.frameConfig.staticUrl = userMask.getAvatarConfig().getFrameConfig().getStaticUrl();
        bLiveUserMask.avatarConfig.frameConfig.dynamicUrl = userMask.getAvatarConfig().getFrameConfig().getDynamicUrl();
        bLiveUserMask.avatarConfig.frameConfig.smallDynamicUrl = userMask.getAvatarConfig().getFrameConfig().getSmallDynamicUrl();
        bLiveUserMask.avatarConfig.frameConfig.mediumDynamicUrl = userMask.getAvatarConfig().getFrameConfig().getMediumDynamicUrl();
        bLiveUserMask.avatarConfig.frameConfig.funnyUrl = userMask.getAvatarConfig().getFrameConfig().getFunnyUrl();
        bLiveUserMask.avatarResourceType = userMask.getAvatarResourceType();
        if (!vwb.m200296J(userMask.getUserNameGradientColorsList())) {
            bLiveUserMask.userNameGradientColors = new ArrayList(userMask.getUserNameGradientColorsList());
        }
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveUserMask m114440b(userMaskConfig.UserMask userMask) {
        return m114439a(userMask, BLiveUserMask.new_());
    }

    /* JADX INFO: renamed from: c */
    public static BLiveUserMask m114441c(userMaskConfig.UserMask userMask) {
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        bLiveUserMaskNew_.userId = userMask.getUserId();
        bLiveUserMaskNew_.name = userMask.getName();
        return m114439a(userMask, bLiveUserMaskNew_);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static BLiveUserMask m114442d(BLiveEnvelope bLiveEnvelope, String str) {
        if (bLiveEnvelope != null && !vwb.m200296J(bLiveEnvelope.data.masks)) {
            for (BLiveUserMask bLiveUserMask : bLiveEnvelope.data.masks) {
                if (str.equals(bLiveUserMask.userId)) {
                    return bLiveUserMask;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static BLiveUserMask m114443e(@NotNull mqv<User> mqvVar) {
        if (mqvVar == null) {
            return null;
        }
        if (d1t.m109678a(mqvVar).m109682e()) {
            return d1t.m109678a(mqvVar).f83297a;
        }
        if (hxn0.m133350c(mqvVar).m133353d()) {
            return hxn0.m133350c(mqvVar).f109896b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static mqv<User> m114444f(BLiveEnvelope bLiveEnvelope, String str) {
        User userM114445g = m114445g(bLiveEnvelope, str);
        BLiveUserMask bLiveUserMaskM114442d = m114442d(bLiveEnvelope, str);
        return bLiveUserMaskM114442d != null ? mqv.m155998f(userM114445g).m156003e(bLiveUserMaskM114442d) : mqv.m155998f(userM114445g);
    }

    /* JADX INFO: renamed from: g */
    public static User m114445g(@NotNull BLiveEnvelope bLiveEnvelope, @NotNull String str) {
        for (User user : bLiveEnvelope.data.users) {
            if (str.equals(user.f56011id)) {
                return user;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static mqv<i54> m114446h(@NotNull mqv<i54> mqvVar) {
        if (hxn0.m133350c(mqvVar).m133353d()) {
            BLiveUserMask bLiveUserMask = hxn0.m133350c(mqvVar).f109896b;
            BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveUserMask.avatarConfig.frameConfig;
            if (bLiveAvatarFrameConfig.checkNeedChangeVoice() && !TextUtils.isEmpty(bLiveAvatarFrameConfig.funnyUrl)) {
                BLiveAvatarFrameConfig bLiveAvatarFrameConfigMo223809clone = bLiveUserMask.avatarConfig.frameConfig.mo223809clone();
                bLiveAvatarFrameConfigMo223809clone.staticUrl = bLiveAvatarFrameConfigMo223809clone.funnyUrl;
                bLiveAvatarFrameConfigMo223809clone.dynamicUrl = "";
                bLiveAvatarFrameConfigMo223809clone.smallDynamicUrl = "";
                bLiveAvatarFrameConfigMo223809clone.mediumDynamicUrl = "";
                bLiveUserMask.avatarConfig.frameConfig = bLiveAvatarFrameConfigMo223809clone;
                bLiveAvatarFrameConfigMo223809clone.toString();
            }
        }
        return mqvVar;
    }
}
