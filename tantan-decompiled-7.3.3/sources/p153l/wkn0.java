package p153l;

import com.google.gson.JsonObject;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallListDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItem;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class wkn0 {
    /* JADX INFO: renamed from: e */
    public static C22421c<BLiveVoiceGiftWall> m206852e(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-gift/voice-gift-wall/summary")).m182288p().m182300c("toUserId", str).m182300c("roomId", str2).m182300c("source", BLiveType.voiceLive).m182301d(), "getGiftWallBrief").map(new qcj() { // from class: l.skn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceGiftWall;
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<List<BLiveVoiceGiftWallListDetail>> m206853f(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-gift/voice-gift-wall/detail")).m182288p().m182300c("toUserId", str).m182300c("roomId", str2).m182300c("source", BLiveType.voiceLive).m182301d(), "getGiftWallList").map(new qcj() { // from class: l.ukn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceGiftWall.detail;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<List<BLiveVoiceMedalWallItem>> m206854g(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-gift/voice-medal-wall/detail")).m182288p().m182300c("toUserId", str).m182300c("roomId", str2).m182300c("source", BLiveType.voiceLive).m182301d(), "getMedalsList").map(new qcj() { // from class: l.tkn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceMedalWall.medals;
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<uxj0> m206855h(String str, String str2) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/live-gift/voice-medal-wall/reward")).m182288p().m182301d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("originalId", str2);
        jsonObject.addProperty("id", str);
        return vrv.m202555p(rnlVarM182301d, "rewardMedal", jsonObject.toString()).map(new qcj() { // from class: l.vkn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }
}
