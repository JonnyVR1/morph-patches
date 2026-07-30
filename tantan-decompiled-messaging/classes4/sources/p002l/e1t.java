package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.d1t;
import l.hxn0;
import l.i54;
import l.mqv;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e1t {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static BLiveUserMask m12107a(userMaskConfig.UserMask userMask, BLiveUserMask bLiveUserMask) {
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
        if (!vwb.J(userMask.getUserNameGradientColorsList())) {
            bLiveUserMask.userNameGradientColors = new ArrayList(userMask.getUserNameGradientColorsList());
        }
        return bLiveUserMask;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveUserMask m12108b(userMaskConfig.UserMask userMask) {
        return m12107a(userMask, BLiveUserMask.new_());
    }

    /* JADX INFO: renamed from: c */
    public static BLiveUserMask m12109c(userMaskConfig.UserMask userMask) {
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        bLiveUserMaskNew_.userId = userMask.getUserId();
        bLiveUserMaskNew_.name = userMask.getName();
        return m12107a(userMask, bLiveUserMaskNew_);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static BLiveUserMask m12110d(BLiveEnvelope bLiveEnvelope, String str) {
        if (bLiveEnvelope != null && !vwb.J(bLiveEnvelope.data.masks)) {
            for (BLiveUserMask bLiveUserMask : bLiveEnvelope.data.masks) {
                if (str.equals(bLiveUserMask.userId)) {
                    return bLiveUserMask;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static BLiveUserMask m12111e(@NotNull mqv<User> mqvVar) {
        if (mqvVar == null) {
            return null;
        }
        if (d1t.a(mqvVar).e()) {
            return d1t.a(mqvVar).a;
        }
        if (hxn0.c(mqvVar).d()) {
            return hxn0.c(mqvVar).b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static mqv<User> m12112f(BLiveEnvelope bLiveEnvelope, String str) {
        User userM12113g = m12113g(bLiveEnvelope, str);
        BLiveUserMask bLiveUserMaskM12110d = m12110d(bLiveEnvelope, str);
        return bLiveUserMaskM12110d != null ? mqv.f(userM12113g).e(bLiveUserMaskM12110d) : mqv.f(userM12113g);
    }

    /* JADX INFO: renamed from: g */
    public static User m12113g(@NotNull BLiveEnvelope bLiveEnvelope, @NotNull String str) {
        for (User user : bLiveEnvelope.data.users) {
            if (str.equals(((DbObject) user).id)) {
                return user;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static mqv<i54> m12114h(@NotNull mqv<i54> mqvVar) {
        if (hxn0.c(mqvVar).d()) {
            BLiveUserMask bLiveUserMask = hxn0.c(mqvVar).b;
            BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveUserMask.avatarConfig.frameConfig;
            if (bLiveAvatarFrameConfig.checkNeedChangeVoice() && !TextUtils.isEmpty(bLiveAvatarFrameConfig.funnyUrl)) {
                BLiveAvatarFrameConfig bLiveAvatarFrameConfigClone = bLiveUserMask.avatarConfig.frameConfig.clone();
                bLiveAvatarFrameConfigClone.staticUrl = bLiveAvatarFrameConfigClone.funnyUrl;
                bLiveAvatarFrameConfigClone.dynamicUrl = "";
                bLiveAvatarFrameConfigClone.smallDynamicUrl = "";
                bLiveAvatarFrameConfigClone.mediumDynamicUrl = "";
                bLiveUserMask.avatarConfig.frameConfig = bLiveAvatarFrameConfigClone;
                bLiveAvatarFrameConfigClone.toString();
            }
        }
        return mqvVar;
    }
}
