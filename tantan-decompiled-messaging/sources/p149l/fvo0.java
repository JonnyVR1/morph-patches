package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/fvo0;", "", "<init>", "()V", "", "roomId", "noticeText", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class fvo0 {

    @NotNull
    public static final fvo0 INSTANCE = new fvo0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C22306c<BLiveEnvelope> m123346a(@NotNull String roomId, @NotNull String noticeText) throws JSONException {
        roomId.getClass();
        noticeText.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/voice-rooms/" + roomId)).m107524p().m107536c("fields", VirtualVoiceMotionType.announcement).m107537d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VirtualVoiceMotionType.announcement, noticeText);
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cllVarM107537d, "patchRoom", jSONObject.toString());
        c22306cM194925m.getClass();
        return c22306cM194925m;
    }
}
