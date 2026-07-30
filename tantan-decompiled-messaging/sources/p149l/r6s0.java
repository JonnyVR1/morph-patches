package p149l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r6s0 extends x6s0 {
    public r6s0(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo178095a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(m207209n(), ((Boolean) m207208m()).booleanValue()));
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo178096b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m207209n())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(m207209n()))) : (Boolean) m207208m();
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo178097c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(m207209n(), ((Boolean) m207208m()).booleanValue()));
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo178098d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(m207209n(), ((Boolean) obj).booleanValue());
    }
}
