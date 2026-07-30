package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class dqv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final List f87512a;

    public dqv0(List list) {
        this.f87512a = list;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(Constants.SEPARATOR_COMMA, this.f87512a));
        } catch (JSONException unused) {
            xsu0.m210834k("Failed putting experiment ids.");
        }
    }
}
