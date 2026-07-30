package p002l;

import com.tantanapp.common.utils.CrashHelper;
import l.cll;
import l.soj0;
import l.upv;
import l.w9j;
import l.ytr;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kpj {
    /* JADX INFO: renamed from: b */
    public static c<soj0> m16734b(boolean z) {
        cll cllVarL = cll.l(ytr.b("/gift-resource/change-close-status"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isClosed", z);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.p(cllVarL, "switchGiftEffectSettings", jSONObject.toString()).map(new w9j() { // from class: l.jpj
            public final Object call(Object obj) {
                return soj0.a;
            }
        });
    }
}
