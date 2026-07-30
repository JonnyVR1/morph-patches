package p149l;

import com.google.gson.JsonObject;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallListDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class sbn0 {
    /* JADX INFO: renamed from: e */
    public static C22306c<BLiveVoiceGiftWall> m183237e(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-gift/voice-gift-wall/summary")).m107524p().m107536c("toUserId", str).m107536c("roomId", str2).m107536c("source", BLiveType.voiceLive).m107537d(), "getGiftWallBrief").map(new w9j() { // from class: l.obn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceGiftWall;
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<List<BLiveVoiceGiftWallListDetail>> m183238f(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-gift/voice-gift-wall/detail")).m107524p().m107536c("toUserId", str).m107536c("roomId", str2).m107536c("source", BLiveType.voiceLive).m107537d(), "getGiftWallList").map(new w9j() { // from class: l.qbn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceGiftWall.detail;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<List<BLiveVoiceMedalWallItem>> m183239g(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-gift/voice-medal-wall/detail")).m107524p().m107536c("toUserId", str).m107536c("roomId", str2).m107536c("source", BLiveType.voiceLive).m107537d(), "getMedalsList").map(new w9j() { // from class: l.pbn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceMedalWall.medals;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<roj0> m183240h(String str, String str2) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/live-gift/voice-medal-wall/reward")).m107524p().m107537d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("originalId", str2);
        jsonObject.addProperty("id", str);
        return upv.m194928p(cllVarM107537d, "rewardMedal", jsonObject.toString()).map(new w9j() { // from class: l.rbn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }
}
