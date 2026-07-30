package p153l;

import com.alibaba.fastjson.JSONObject;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import java.util.List;
import java.util.UUID;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class x8n {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m209741b(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<List<BLiveDanmakuListItem>> m209742c(String str, String str2, String str3) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-gift/voice-bullet-comment-types")).m182288p().m182300c("anchorId", str).m182300c("liveId", str2).m182300c("roomId", str3).m182301d(), "DanmakuList").map(new qcj() { // from class: l.v8n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLiveBulletCommentTypes;
            }
        }).onErrorReturn(new qcj() { // from class: l.w8n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x8n.m209741b((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<BLiveEnvelope> m209743d(String str, BLiveDanmakuListItem bLiveDanmakuListItem, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("originalId", (Object) UUID.randomUUID().toString());
        jSONObject.put("liveId", (Object) str2);
        jSONObject.put("roomId", (Object) str3);
        jSONObject.put("anchorId", (Object) str4);
        jSONObject.put("content", (Object) str);
        jSONObject.put("typeId", (Object) bLiveDanmakuListItem.f45203id);
        jSONObject.put("type", (Object) bLiveDanmakuListItem.type);
        return vrv.m202544e(rnl.m182263l(zvr.m221802b("/live-gift/voice-bullet-comments")), "liveSendDanmaku", jSONObject.toJSONString());
    }
}
