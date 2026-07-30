package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/xt5;", "", "<init>", "()V", "", "roomId", "liveId", "confessRecordId", "userId", "sendGiftUserId", "Lrx/c;", "Lcom/p1/mobile/putong/data/Meta;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "receiveGiftUserId", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraResponse;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xt5 {

    @NotNull
    public static final xt5 INSTANCE = new xt5();

    /* JADX INFO: renamed from: a */
    public static Meta m210958a(BLiveExtraResponse bLiveExtraResponse) {
        return bLiveExtraResponse.meta;
    }

    /* JADX INFO: renamed from: b */
    public static Meta m210959b(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C22306c<Meta> m210960c(@NotNull String roomId, @NotNull String liveId, @NotNull String confessRecordId, @NotNull String userId, @NotNull String sendGiftUserId) {
        roomId.getClass();
        liveId.getClass();
        confessRecordId.getClass();
        userId.getClass();
        sendGiftUserId.getClass();
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/live-gift/users/" + userId + "/confess/" + sendGiftUserId + "/agree"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("roomId", roomId);
            jSONObject.put("liveId", liveId);
            jSONObject.put("confessRecordId", confessRecordId);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        C22306c c22306cM194918f = upv.m194918f(c16188aM67307m.m107537d(), "agreeMatchForConfession/" + confessRecordId, BLiveExtraResponse.JSON_ADAPTER, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.vt5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xt5.m210958a((BLiveExtraResponse) obj);
            }
        };
        C22306c<Meta> map = c22306cM194918f.map(new w9j() { // from class: l.wt5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xt5.m210959b(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C22306c<BLiveExtraResponse> m210961d(@NotNull String userId, @NotNull String receiveGiftUserId) {
        userId.getClass();
        receiveGiftUserId.getClass();
        cll cllVarM107537d = LiveApiBuilder.m67307m(ytr.m216073b("/live-gift/users/" + userId + "/confess/" + receiveGiftUserId + "/relationship/check")).m107537d();
        StringBuilder sb = new StringBuilder("checkUsersHasMatched/");
        sb.append(userId);
        sb.append("/");
        sb.append(receiveGiftUserId);
        C22306c<BLiveExtraResponse> c22306cM194921i = upv.m194921i(cllVarM107537d, sb.toString(), BLiveExtraResponse.JSON_ADAPTER);
        c22306cM194921i.getClass();
        return c22306cM194921i;
    }
}
