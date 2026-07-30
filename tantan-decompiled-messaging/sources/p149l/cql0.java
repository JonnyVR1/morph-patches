package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes5.dex */
public class cql0 {
    /* JADX INFO: renamed from: a */
    public static void m108279a(LiveMessage liveMessage, und undVar) {
        if (liveMessage == null || liveMessage.isErrorMessage || liveMessage.extInfo == null) {
            return;
        }
        BLiveAbsData bLiveAbsDataM194414a = undVar.m194414a();
        zvf0.m220368A("e_audio_anonymous_follow", undVar.m194418e(), j760.m140076a("anchorId", bLiveAbsDataM194414a.anchor.f44419id), j760.m140076a("liveId", bLiveAbsDataM194414a.f44323id), j760.m140076a("liveStatus", bLiveAbsDataM194414a.isLiving() ? "on" : BLiveOperationTitleShowType.off), j760.m140076a("receiver_user_id", liveMessage.extInfo.followUserId), j760.m140076a("liveFollow_from", zcu.m218101p(liveMessage.getVoiceFollowSource())));
    }
}
