package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/j4p0;", "", "<init>", "()V", "", "roomId", "noticeText", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class j4p0 {

    @NotNull
    public static final j4p0 INSTANCE = new j4p0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C22421c<BLiveEnvelope> m143446a(@NotNull String roomId, @NotNull String noticeText) throws JSONException {
        roomId.getClass();
        noticeText.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/voice-rooms/" + roomId)).m182288p().m182300c("fields", VirtualVoiceMotionType.announcement).m182301d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VirtualVoiceMotionType.announcement, noticeText);
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnlVarM182301d, "patchRoom", jSONObject.toString());
        c22421cM202552m.getClass();
        return c22421cM202552m;
    }
}
