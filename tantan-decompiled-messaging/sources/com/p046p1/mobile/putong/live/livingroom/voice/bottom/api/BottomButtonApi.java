package com.p046p1.mobile.putong.live.livingroom.voice.bottom.api;

import com.alibaba.fastjson.JSONObject;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.api.BottomButtonApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.cll;
import p149l.upv;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/bottom/api/BottomButtonApi;", "", "<init>", "()V", "", "id", "", "liveId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "patchBottomButtonClick", "(ILjava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BottomButtonApi {

    @NotNull
    public static final BottomButtonApi INSTANCE = new BottomButtonApi();

    private BottomButtonApi() {
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m77787a(BLiveEnvelope bLiveEnvelope) {
        int i;
        return Boolean.valueOf((bLiveEnvelope != null ? bLiveEnvelope.data : null) != null && 200 <= (i = bLiveEnvelope.meta.code) && i < 300);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m77788b(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveEnvelope> patchBottomButtonClick(int id, @NotNull String liveId) {
        liveId.getClass();
        cll cllVarM107501r = cll.m107501r(ytr.m216073b("/voice-live-bottomMenu/callback"));
        cllVarM107501r.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", String.valueOf(id));
        jSONObject.put("liveId", liveId);
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cllVarM107501r, "voice-live-bottomMenu/callback", jSONObject.toJSONString());
        final Function1 function1 = new Function1() { // from class: l.va3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomButtonApi.m77787a((BLiveEnvelope) obj);
            }
        };
        C22306c<BLiveEnvelope> c22306cFilter = c22306cM194925m.filter(new w9j() { // from class: l.wa3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return BottomButtonApi.m77788b(function1, obj);
            }
        });
        c22306cFilter.getClass();
        return c22306cFilter;
    }
}
