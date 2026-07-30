package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes5.dex */
public class gzl0 {
    /* JADX INFO: renamed from: a */
    public static void m133104a(LiveMessage liveMessage, zod zodVar) {
        if (liveMessage == null || liveMessage.isErrorMessage || liveMessage.extInfo == null) {
            return;
        }
        BLiveAbsData bLiveAbsDataM220733a = zodVar.m220733a();
        i4g0.m138492A("e_audio_anonymous_follow", zodVar.m220737e(), pf60.m172085a("anchorId", bLiveAbsDataM220733a.anchor.f45267id), pf60.m172085a("liveId", bLiveAbsDataM220733a.f45171id), pf60.m172085a("liveStatus", bLiveAbsDataM220733a.isLiving() ? "on" : BLiveOperationTitleShowType.off), pf60.m172085a("receiver_user_id", liveMessage.extInfo.followUserId), pf60.m172085a("liveFollow_from", afu.m97567p(liveMessage.getVoiceFollowSource())));
    }
}
