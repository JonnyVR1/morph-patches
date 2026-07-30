package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class smv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final AdvertisingIdClient.C2070a f165384a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f165385b;

    /* JADX INFO: renamed from: c */
    public final acw0 f165386c;

    public smv0(@Nullable AdvertisingIdClient.C2070a c2070a, @Nullable String str, acw0 acw0Var) {
        this.f165384a = c2070a;
        this.f165385b = str;
        this.f165386c = acw0Var;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        try {
            JSONObject jSONObjectM171065f = prs0.m171065f((JSONObject) obj, "pii");
            AdvertisingIdClient.C2070a c2070a = this.f165384a;
            if (c2070a == null || TextUtils.isEmpty(c2070a.m12233a())) {
                String str = this.f165385b;
                if (str != null) {
                    jSONObjectM171065f.put("pdid", str);
                    jSONObjectM171065f.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectM171065f.put("rdid", this.f165384a.m12233a());
            jSONObjectM171065f.put("is_lat", this.f165384a.m12234b());
            jSONObjectM171065f.put("idtype", "adid");
            acw0 acw0Var = this.f165386c;
            if (acw0Var.m95847c()) {
                jSONObjectM171065f.put("paidv1_id_android_3p", acw0Var.m95846b());
                jSONObjectM171065f.put("paidv1_creation_time_android_3p", this.f165386c.m95845a());
            }
        } catch (JSONException e) {
            xsu0.m210835l("Failed putting Ad ID.", e);
        }
    }
}
