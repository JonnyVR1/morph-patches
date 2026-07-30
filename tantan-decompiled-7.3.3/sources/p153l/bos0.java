package p153l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.messaging.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bos0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get(Constants.ScionAnalytics.PARAM_LABEL);
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                dct0.m115298g("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                dct0.m115298g("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jElapsedRealtime = bxy0.m106918b().elapsedRealtime() + (Long.parseLong(str4) - bxy0.m106918b().currentTimeMillis());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                wit0Var.zzm().m140034c(str2, str3, jElapsedRealtime);
                return;
            } catch (NumberFormatException e) {
                dct0.m115299h("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                dct0.m115298g("No value given for CSI experiment.");
                return;
            } else {
                wit0Var.zzm().m140032a().m149821d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                dct0.m115298g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                dct0.m115298g("No name given for CSI extra.");
            } else {
                wit0Var.zzm().m140032a().m149821d(str6, str7);
            }
        }
    }
}
