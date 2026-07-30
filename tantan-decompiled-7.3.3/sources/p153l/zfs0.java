package p153l;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zfs0 extends dgs0 {
    public zfs0(int i, String str, Long l2) {
        super(1, str, l2, null);
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo97724a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(m115750n(), ((Long) m115749m()).longValue()));
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo97725b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(m115750n())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(m115750n()))) : (Long) m115749m();
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo97726c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(m115750n(), ((Long) m115749m()).longValue()));
    }

    @Override // p153l.dgs0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo97727d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(m115750n(), ((Long) obj).longValue());
    }
}
