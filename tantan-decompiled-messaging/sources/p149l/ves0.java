package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.messaging.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ves0 implements vgs0 {
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get(Constants.ScionAnalytics.PARAM_LABEL);
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                x2t0.m206869g("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                x2t0.m206869g("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jElapsedRealtime = vny0.m199064b().elapsedRealtime() + (Long.parseLong(str4) - vny0.m199064b().currentTimeMillis());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                q9t0Var.zzm().m105820c(str2, str3, jElapsedRealtime);
                return;
            } catch (NumberFormatException e) {
                x2t0.m206870h("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                x2t0.m206869g("No value given for CSI experiment.");
                return;
            } else {
                q9t0Var.zzm().m105818a().m115282d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                x2t0.m206869g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                x2t0.m206869g("No name given for CSI extra.");
            } else {
                q9t0Var.zzm().m105818a().m115282d(str6, str7);
            }
        }
    }
}
