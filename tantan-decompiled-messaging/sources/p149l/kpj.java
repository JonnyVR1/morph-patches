package p149l;

import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class kpj {
    /* JADX INFO: renamed from: b */
    public static C22306c<soj0> m146871b(boolean z) {
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/gift-resource/change-close-status"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isClosed", z);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107499l, "switchGiftEffectSettings", jSONObject.toString()).map(new w9j() { // from class: l.jpj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return soj0.f165695a;
            }
        });
    }
}
