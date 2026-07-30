package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/bv5;", "", "<init>", "()V", "", "roomId", "liveId", "confessRecordId", "userId", "sendGiftUserId", "Lrx/c;", "Lcom/p1/mobile/putong/data/Meta;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "receiveGiftUserId", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraResponse;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bv5 {

    @NotNull
    public static final bv5 INSTANCE = new bv5();

    /* JADX INFO: renamed from: a */
    public static Meta m106551a(BLiveExtraResponse bLiveExtraResponse) {
        return bLiveExtraResponse.meta;
    }

    /* JADX INFO: renamed from: b */
    public static Meta m106552b(Function1 function1, Object obj) {
        return (Meta) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C22421c<Meta> m106553c(@NotNull String roomId, @NotNull String liveId, @NotNull String confessRecordId, @NotNull String userId, @NotNull String sendGiftUserId) {
        roomId.getClass();
        liveId.getClass();
        confessRecordId.getClass();
        userId.getClass();
        sendGiftUserId.getClass();
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/live-gift/users/" + userId + "/confess/" + sendGiftUserId + "/agree"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("roomId", roomId);
            jSONObject.put("liveId", liveId);
            jSONObject.put("confessRecordId", confessRecordId);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        C22421c c22421cM202545f = vrv.m202545f(c19886aM68490m.m182301d(), "agreeMatchForConfession/" + confessRecordId, BLiveExtraResponse.JSON_ADAPTER, jSONObject.toString());
        final Function1 function1 = new Function1() { // from class: l.zu5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bv5.m106551a((BLiveExtraResponse) obj);
            }
        };
        C22421c<Meta> map = c22421cM202545f.map(new qcj() { // from class: l.av5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bv5.m106552b(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final C22421c<BLiveExtraResponse> m106554d(@NotNull String userId, @NotNull String receiveGiftUserId) {
        userId.getClass();
        receiveGiftUserId.getClass();
        rnl rnlVarM182301d = LiveApiBuilder.m68490m(zvr.m221802b("/live-gift/users/" + userId + "/confess/" + receiveGiftUserId + "/relationship/check")).m182301d();
        StringBuilder sb = new StringBuilder("checkUsersHasMatched/");
        sb.append(userId);
        sb.append("/");
        sb.append(receiveGiftUserId);
        C22421c<BLiveExtraResponse> c22421cM202548i = vrv.m202548i(rnlVarM182301d, sb.toString(), BLiveExtraResponse.JSON_ADAPTER);
        c22421cM202548i.getClass();
        return c22421cM202548i;
    }
}
