package p149l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class s6s0 extends x6s0 {
    public s6s0(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo178095a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(m207209n(), ((Integer) m207208m()).intValue()));
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo178096b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m207209n())) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(m207209n()))) : (Integer) m207208m();
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo178097c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(m207209n(), ((Integer) m207208m()).intValue()));
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo178098d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(m207209n(), ((Integer) obj).intValue());
    }
}
