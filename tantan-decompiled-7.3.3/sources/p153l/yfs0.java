package p153l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class yfs0 extends dgs0 {
    public yfs0(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo97724a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(m115750n(), ((Integer) m115749m()).intValue()));
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo97725b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m115750n())) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(m115750n()))) : (Integer) m115749m();
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo97726c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(m115750n(), ((Integer) m115749m()).intValue()));
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo97727d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(m115750n(), ((Integer) obj).intValue());
    }
}
