package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ynv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    @VisibleForTesting
    public final String f199223a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final int f199224b;

    public ynv0(@Nullable String str, int i) {
        this.f199223a = str;
        this.f199224b = i;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.f199223a) || this.f199224b == -1) {
            return;
        }
        try {
            JSONObject jSONObjectM171065f = prs0.m171065f(jSONObject, "pii");
            jSONObjectM171065f.put("pvid", this.f199223a);
            jSONObjectM171065f.put("pvid_s", this.f199224b);
        } catch (JSONException e) {
            xsu0.m210835l("Failed putting gms core app set ID info.", e);
        }
    }
}
