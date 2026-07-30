package p153l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class xfs0 extends dgs0 {
    public xfs0(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo97724a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(m115750n(), ((Boolean) m115749m()).booleanValue()));
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo97725b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m115750n())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(m115750n()))) : (Boolean) m115749m();
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo97726c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(m115750n(), ((Boolean) m115749m()).booleanValue()));
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo97727d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(m115750n(), ((Boolean) obj).booleanValue());
    }
}
