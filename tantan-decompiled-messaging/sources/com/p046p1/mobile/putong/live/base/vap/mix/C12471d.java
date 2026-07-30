package com.p046p1.mobile.putong.live.base.vap.mix;

import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.vap.mix.d */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R3\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/d;", "", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "Ljava/util/HashMap;", "", "Lcom/p1/mobile/putong/live/base/vap/mix/Src;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "map", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C12471d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Src> map;

    public C12471d(@NotNull JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        jSONObject.getClass();
        this.map = new HashMap<>();
        JSONArray jSONArray = jSONObject.getJSONArray("src");
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArray != null && (jSONObject2 = jSONArray.getJSONObject(i)) != null) {
                Src src = new Src(jSONObject2);
                if (src.getSrcType() != Src.SrcType.UNKNOWN) {
                    this.map.put(src.getSrcId(), src);
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final HashMap<String, Src> m68703a() {
        return this.map;
    }
}
