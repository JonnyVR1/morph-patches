package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomCallPlaceResource;

/* JADX INFO: loaded from: classes11.dex */
public final class sco0 {
    /* JADX INFO: renamed from: a */
    public static void m183422a(@Nullable BLiveVoiceRoom bLiveVoiceRoom, @Nullable VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        if (bLiveVoiceRoom == null || voiceRoomBgPicUpdateMessage == null) {
            return;
        }
        VoiceChangeRoomBg.VoiceRoomCallPlaceResource callPlaceResource = voiceRoomBgPicUpdateMessage.getCallPlaceResource();
        if (callPlaceResource == null || TextUtils.isEmpty(callPlaceResource.getAddUrl())) {
            bLiveVoiceRoom.callPlaceResource = null;
            return;
        }
        if (bLiveVoiceRoom.callPlaceResource == null) {
            bLiveVoiceRoom.callPlaceResource = BLiveVoiceRoomCallPlaceResource.new_();
        }
        BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource = bLiveVoiceRoom.callPlaceResource;
        if (!TextUtils.isEmpty(callPlaceResource.getBgUrl())) {
            bLiveVoiceRoomCallPlaceResource.bgUrl = callPlaceResource.getBgUrl();
        }
        if (!TextUtils.isEmpty(callPlaceResource.getAddUrl())) {
            bLiveVoiceRoomCallPlaceResource.addUrl = callPlaceResource.getAddUrl();
        }
        if (!TextUtils.isEmpty(callPlaceResource.getBossUrl())) {
            bLiveVoiceRoomCallPlaceResource.bossUrl = callPlaceResource.getBossUrl();
        }
        if (TextUtils.isEmpty(callPlaceResource.getIndexColor())) {
            return;
        }
        bLiveVoiceRoomCallPlaceResource.indexColor = callPlaceResource.getIndexColor();
    }
}
