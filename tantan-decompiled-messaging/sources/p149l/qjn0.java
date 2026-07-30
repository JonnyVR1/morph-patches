package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.momo.mcamera.mask.Sticker;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItemUser;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, m87232d2 = {"Ll/qjn0;", "", "<init>", "()V", "", Sticker.GESTURE_TYPE_HEART, "", AuthenticationTokenClaims.JSON_KEY_NAME, "c", "(JLjava/lang/String;)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "(J)Ljava/lang/String;", "Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;", "_image", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;", Item.TYPE, "", "suggestSize", "", "f", "(Lcom/p1/mobile/putong/live/livingroom/common/avatar/CommonMaskAvatarView;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceHourLeaderBoardItem;I)V", BLivePkCategory.rank, "e", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qjn0 {

    @NotNull
    public static final qjn0 INSTANCE = new qjn0();

    /* JADX INFO: renamed from: a */
    public static String m175021a(User user) {
        user.getClass();
        return user.m60124fp().url;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m175022c(long heart, @NotNull String name) {
        name.getClass();
        if (Intrinsics.m87488d("noble", name) || har.f106812b.equals(name)) {
            return INSTANCE.m175026b(heart) + "贡献值";
        }
        if (Intrinsics.m87488d("flower", name) || har.f106811a.equals(name)) {
            return INSTANCE.m175026b(heart) + "魅力值";
        }
        if (har.f106814d.equals(name)) {
            return INSTANCE.m175026b(heart) + "人气";
        }
        if (har.f106813c.equals(name)) {
            return INSTANCE.m175026b(heart) + "奢华度";
        }
        return INSTANCE.m175026b(heart) + "人气值";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m175023d(long heart) {
        return (heart == 0 ? "0" : x8u.m207433c(heart)) + "人气";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m175024e(long rank) {
        if (rank <= 0) {
            return "未上榜";
        }
        return rank > 100 ? "100+" : String.valueOf(rank);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m175025f(@NotNull CommonMaskAvatarView _image, @NotNull BLiveVoiceHourLeaderBoardItem item, int suggestSize) {
        _image.getClass();
        item.getClass();
        User userNew_ = User.new_();
        hxn0 hxn0Var = new hxn0();
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
        hxn0Var.f109896b = bLiveUserMaskNew_;
        mqv mqvVarM156002d = mqv.m155998f(userNew_).m156002d(hxn0Var);
        mqvVarM156002d.getClass();
        agv.m96345c(_image, suggestSize, mqvVarM156002d, new w9j() { // from class: l.ojn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qjn0.m175021a((User) obj);
            }
        }, suggestSize > t100.m186890d(80.0f) ? 2 : 1);
    }

    /* JADX INFO: renamed from: b */
    public final String m175026b(long heart) {
        if (heart == 0) {
            return "0";
        }
        String strM207433c = x8u.m207433c(heart);
        strM207433c.getClass();
        return strM207433c;
    }
}
