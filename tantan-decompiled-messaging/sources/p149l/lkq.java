package p149l;

import android.text.TextUtils;
import com.immomo.mwc.sdk.WebResourcePool;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class lkq extends WebResourcePool.AbstractC3926b<String> {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ mkq f128596g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkq(mkq mkqVar, String str, String str2, String str3, JSONObject jSONObject) {
        super(str, str2, str3, jSONObject);
        this.f128596g = mkqVar;
    }

    @Override // com.immomo.mwc.sdk.WebResourcePool.AbstractC3926b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int mo19417d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return str.getBytes(StandardCharsets.UTF_8).length;
    }
}
