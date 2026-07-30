package p153l;

import android.text.TextUtils;
import com.immomo.mwc.sdk.WebResourcePool;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class kmq extends WebResourcePool.AbstractC4069b<String> {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ lmq f127528g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmq(lmq lmqVar, String str, String str2, String str3, JSONObject jSONObject) {
        super(str, str2, str3, jSONObject);
        this.f127528g = lmqVar;
    }

    @Override // com.immomo.mwc.sdk.WebResourcePool.AbstractC4069b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int mo20397d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return str.getBytes(StandardCharsets.UTF_8).length;
    }
}
