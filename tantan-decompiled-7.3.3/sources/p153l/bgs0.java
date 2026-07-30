package p153l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bgs0 extends dgs0 {
    public bgs0(int i, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo97724a(JSONObject jSONObject) {
        return jSONObject.optString(m115750n(), (String) m115749m());
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo97725b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m115750n())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(m115750n())) : (String) m115749m();
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo97726c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(m115750n(), (String) m115749m());
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo97727d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(m115750n(), (String) obj);
    }
}
