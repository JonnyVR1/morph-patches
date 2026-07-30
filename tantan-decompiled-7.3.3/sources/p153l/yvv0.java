package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class yvv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final AdvertisingIdClient.C2093a f201765a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f201766b;

    /* JADX INFO: renamed from: c */
    public final glw0 f201767c;

    public yvv0(@Nullable AdvertisingIdClient.C2093a c2093a, @Nullable String str, glw0 glw0Var) {
        this.f201765a = c2093a;
        this.f201766b = str;
        this.f201767c = glw0Var;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        try {
            JSONObject jSONObjectM198934f = v0t0.m198934f((JSONObject) obj, "pii");
            AdvertisingIdClient.C2093a c2093a = this.f201765a;
            if (c2093a == null || TextUtils.isEmpty(c2093a.m12287a())) {
                String str = this.f201766b;
                if (str != null) {
                    jSONObjectM198934f.put("pdid", str);
                    jSONObjectM198934f.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectM198934f.put("rdid", this.f201765a.m12287a());
            jSONObjectM198934f.put("is_lat", this.f201765a.m12288b());
            jSONObjectM198934f.put("idtype", "adid");
            glw0 glw0Var = this.f201767c;
            if (glw0Var.m130721c()) {
                jSONObjectM198934f.put("paidv1_id_android_3p", glw0Var.m130720b());
                jSONObjectM198934f.put("paidv1_creation_time_android_3p", this.f201767c.m130719a());
            }
        } catch (JSONException e) {
            d2v0.m113738l("Failed putting Ad ID.", e);
        }
    }
}
