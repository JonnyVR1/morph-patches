package p149l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class u6s0 extends x6s0 {
    public u6s0(int i, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo178095a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(m207209n(), ((Float) m207208m()).floatValue()));
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo178096b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m207209n())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(m207209n()))) : (Float) m207208m();
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo178097c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(m207209n(), ((Float) m207208m()).floatValue()));
    }

    @Override // p149l.x6s0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo178098d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(m207209n(), ((Float) obj).floatValue());
    }
}
