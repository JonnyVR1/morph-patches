package p149l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class v6s0 extends x6s0 {
    public v6s0(int i, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo178095a(JSONObject jSONObject) {
        return jSONObject.optString(m207209n(), (String) m207208m());
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo178096b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m207209n())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(m207209n())) : (String) m207208m();
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo178097c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(m207209n(), (String) m207208m());
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo178098d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(m207209n(), (String) obj);
    }
}
