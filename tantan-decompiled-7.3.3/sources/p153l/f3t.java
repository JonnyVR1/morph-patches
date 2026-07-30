package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class f3t {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static BLiveUserMask m123800a(userMaskConfig.UserMask userMask, BLiveUserMask bLiveUserMask) {
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
        if (!jyb.m147479J(userMask.getUserNameGradientColorsList())) {
            bLiveUserMask.userNameGradientColors = new ArrayList(userMask.getUserNameGradientColorsList());
        }
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveUserMask m123801b(userMaskConfig.UserMask userMask) {
        return m123800a(userMask, BLiveUserMask.new_());
    }

    /* JADX INFO: renamed from: c */
    public static BLiveUserMask m123802c(userMaskConfig.UserMask userMask) {
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        bLiveUserMaskNew_.userId = userMask.getUserId();
        bLiveUserMaskNew_.name = userMask.getName();
        return m123800a(userMask, bLiveUserMaskNew_);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static BLiveUserMask m123803d(BLiveEnvelope bLiveEnvelope, String str) {
        if (bLiveEnvelope != null && !jyb.m147479J(bLiveEnvelope.data.masks)) {
            for (BLiveUserMask bLiveUserMask : bLiveEnvelope.data.masks) {
                if (str.equals(bLiveUserMask.userId)) {
                    return bLiveUserMask;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static BLiveUserMask m123804e(@NotNull nsv<User> nsvVar) {
        if (nsvVar == null) {
            return null;
        }
        if (e3t.m119319a(nsvVar).m119323e()) {
            return e3t.m119319a(nsvVar).f91997a;
        }
        if (l6o0.m153068c(nsvVar).m153071d()) {
            return l6o0.m153068c(nsvVar).f130275b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static nsv<User> m123805f(BLiveEnvelope bLiveEnvelope, String str) {
        User userM123806g = m123806g(bLiveEnvelope, str);
        BLiveUserMask bLiveUserMaskM123803d = m123803d(bLiveEnvelope, str);
        return bLiveUserMaskM123803d != null ? nsv.m164636f(userM123806g).m164641e(bLiveUserMaskM123803d) : nsv.m164636f(userM123806g);
    }

    /* JADX INFO: renamed from: g */
    public static User m123806g(@NotNull BLiveEnvelope bLiveEnvelope, @NotNull String str) {
        for (User user : bLiveEnvelope.data.users) {
            if (str.equals(user.f56859id)) {
                return user;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static nsv<h64> m123807h(@NotNull nsv<h64> nsvVar) {
        if (l6o0.m153068c(nsvVar).m153071d()) {
            BLiveUserMask bLiveUserMask = l6o0.m153068c(nsvVar).f130275b;
            BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveUserMask.avatarConfig.frameConfig;
            if (bLiveAvatarFrameConfig.checkNeedChangeVoice() && !TextUtils.isEmpty(bLiveAvatarFrameConfig.funnyUrl)) {
                BLiveAvatarFrameConfig bLiveAvatarFrameConfigMo225055clone = bLiveUserMask.avatarConfig.frameConfig.mo225055clone();
                bLiveAvatarFrameConfigMo225055clone.staticUrl = bLiveAvatarFrameConfigMo225055clone.funnyUrl;
                bLiveAvatarFrameConfigMo225055clone.dynamicUrl = "";
                bLiveAvatarFrameConfigMo225055clone.smallDynamicUrl = "";
                bLiveAvatarFrameConfigMo225055clone.mediumDynamicUrl = "";
                bLiveUserMask.avatarConfig.frameConfig = bLiveAvatarFrameConfigMo225055clone;
                bLiveAvatarFrameConfigMo225055clone.toString();
            }
        }
        return nsvVar;
    }
}
