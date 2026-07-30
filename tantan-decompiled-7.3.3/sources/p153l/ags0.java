package p153l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ags0 extends dgs0 {
    public ags0(int i, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo97724a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(m115750n(), ((Float) m115749m()).floatValue()));
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo97725b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m115750n())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(m115750n()))) : (Float) m115749m();
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo97726c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(m115750n(), ((Float) m115749m()).floatValue()));
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo97727d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(m115750n(), ((Float) obj).floatValue());
    }
}
