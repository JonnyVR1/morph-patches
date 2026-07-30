package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.momo.mcamera.mask.Sticker;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItemUser;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m88121d2 = {"Ll/usn0;", "", "<init>", "()V", "", Sticker.GESTURE_TYPE_HEART, "", AuthenticationTokenClaims.JSON_KEY_NAME, "c", "(JLjava/lang/String;)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "(J)Ljava/lang/String;", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;", "_image", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "", "suggestSize", "", "f", "(Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;I)V", BLivePkCategory.rank, "e", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class usn0 {

    @NotNull
    public static final usn0 INSTANCE = new usn0();

    /* JADX INFO: renamed from: a */
    public static String m197947a(User user) {
        user.getClass();
        return user.m61308fp().url;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m197948c(long heart, @NotNull String name) {
        name.getClass();
        if (Intrinsics.m88377d("noble", name) || jcr.f120091b.equals(name)) {
            return INSTANCE.m197952b(heart) + "贡献值";
        }
        if (Intrinsics.m88377d("flower", name) || jcr.f120090a.equals(name)) {
            return INSTANCE.m197952b(heart) + "魅力值";
        }
        if (jcr.f120093d.equals(name)) {
            return INSTANCE.m197952b(heart) + "人气";
        }
        if (jcr.f120092c.equals(name)) {
            return INSTANCE.m197952b(heart) + "奢华度";
        }
        return INSTANCE.m197952b(heart) + "人气值";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m197949d(long heart) {
        return (heart == 0 ? "0" : yau.m214935c(heart)) + "人气";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m197950e(long rank) {
        if (rank <= 0) {
            return "未上榜";
        }
        return rank > 100 ? "100+" : String.valueOf(rank);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m197951f(@NotNull CommonMaskAvatarView _image, @NotNull BLiveVoiceHourLeaderBoardItem item, int suggestSize) {
        _image.getClass();
        item.getClass();
        User userNew_ = User.new_();
        l6o0 l6o0Var = new l6o0();
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        bLiveUserMaskNew_.avatar = item.user.avatar;
        BLiveMaskAvatarConfig bLiveMaskAvatarConfigNew_ = BLiveMaskAvatarConfig.new_();
        BLiveAvatarFrameConfig bLiveAvatarFrameConfigNew_ = BLiveAvatarFrameConfig.new_();
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser = item.user;
        bLiveAvatarFrameConfigNew_.staticUrl = bLiveVoiceHourLeaderBoardItemUser.staticFrame;
        bLiveAvatarFrameConfigNew_.dynamicUrl = bLiveVoiceHourLeaderBoardItemUser.dynamicFrame;
        bLiveAvatarFrameConfigNew_.smallDynamicUrl = bLiveVoiceHourLeaderBoardItemUser.smallDynamicFrame;
        bLiveAvatarFrameConfigNew_.mediumDynamicUrl = bLiveVoiceHourLeaderBoardItemUser.mediumDynamicFrame;
        bLiveMaskAvatarConfigNew_.frameConfig = bLiveAvatarFrameConfigNew_;
        bLiveUserMaskNew_.avatarConfig = bLiveMaskAvatarConfigNew_;
        l6o0Var.f130275b = bLiveUserMaskNew_;
        nsv nsvVarM164640d = nsv.m164636f(userNew_).m164640d(l6o0Var);
        nsvVarM164640d.getClass();
        biv.m104518c(_image, suggestSize, nsvVarM164640d, new qcj() { // from class: l.ssn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return usn0.m197947a((User) obj);
            }
        }, suggestSize > qa00.m175859d(80.0f) ? 2 : 1);
    }

    /* JADX INFO: renamed from: b */
    public final String m197952b(long heart) {
        if (heart == 0) {
            return "0";
        }
        String strM214935c = yau.m214935c(heart);
        strM214935c.getClass();
        return strM214935c;
    }
}
