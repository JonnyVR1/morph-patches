package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class jzv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final List f123324a;

    public jzv0(List list) {
        this.f123324a = list;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(Constants.SEPARATOR_COMMA, this.f123324a));
        } catch (JSONException unused) {
            d2v0.m113737k("Failed putting experiment ids.");
        }
    }
}
