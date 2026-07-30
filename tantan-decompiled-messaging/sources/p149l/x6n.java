package p149l;

import com.alibaba.fastjson.JSONObject;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import java.util.List;
import java.util.UUID;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class x6n {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m207182b(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<List<BLiveDanmakuListItem>> m207183c(String str, String str2, String str3) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-gift/voice-bullet-comment-types")).m107524p().m107536c("anchorId", str).m107536c("liveId", str2).m107536c("roomId", str3).m107537d(), "DanmakuList").map(new w9j() { // from class: l.v6n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLiveBulletCommentTypes;
            }
        }).onErrorReturn(new w9j() { // from class: l.w6n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return x6n.m207182b((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<BLiveEnvelope> m207184d(String str, BLiveDanmakuListItem bLiveDanmakuListItem, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("originalId", (Object) UUID.randomUUID().toString());
        jSONObject.put("liveId", (Object) str2);
        jSONObject.put("roomId", (Object) str3);
        jSONObject.put("anchorId", (Object) str4);
        jSONObject.put("content", (Object) str);
        jSONObject.put("typeId", (Object) bLiveDanmakuListItem.f44355id);
        jSONObject.put("type", (Object) bLiveDanmakuListItem.type);
        return upv.m194917e(cll.m107499l(ytr.m216073b("/live-gift/voice-bullet-comments")), "liveSendDanmaku", jSONObject.toJSONString());
    }
}
