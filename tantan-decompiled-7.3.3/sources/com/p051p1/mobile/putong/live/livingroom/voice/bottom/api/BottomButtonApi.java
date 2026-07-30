package com.p051p1.mobile.putong.live.livingroom.voice.bottom.api;

import com.alibaba.fastjson.JSONObject;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.api.BottomButtonApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.qcj;
import p153l.rnl;
import p153l.vrv;
import p153l.zvr;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/bottom/api/BottomButtonApi;", "", "<init>", "()V", "", "id", "", "liveId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "patchBottomButtonClick", "(ILjava/lang/String;)Lrx/c;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BottomButtonApi {

    @NotNull
    public static final BottomButtonApi INSTANCE = new BottomButtonApi();

    private BottomButtonApi() {
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m78970a(BLiveEnvelope bLiveEnvelope) {
        int i;
        return Boolean.valueOf((bLiveEnvelope != null ? bLiveEnvelope.data : null) != null && 200 <= (i = bLiveEnvelope.meta.code) && i < 300);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m78971b(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveEnvelope> patchBottomButtonClick(int id, @NotNull String liveId) {
        liveId.getClass();
        rnl rnlVarM182265r = rnl.m182265r(zvr.m221802b("/voice-live-bottomMenu/callback"));
        rnlVarM182265r.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", String.valueOf(id));
        jSONObject.put("liveId", liveId);
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnlVarM182265r, "voice-live-bottomMenu/callback", jSONObject.toJSONString());
        final Function1 function1 = new Function1() { // from class: l.kb3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomButtonApi.m78970a((BLiveEnvelope) obj);
            }
        };
        C22421c<BLiveEnvelope> c22421cFilter = c22421cM202552m.filter(new qcj() { // from class: l.lb3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return BottomButtonApi.m78971b(function1, obj);
            }
        });
        c22421cFilter.getClass();
        return c22421cFilter;
    }
}
