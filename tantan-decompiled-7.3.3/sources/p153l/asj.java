package p153l;

import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class asj {
    /* JADX INFO: renamed from: b */
    public static C22421c<vxj0> m99927b(boolean z) {
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/gift-resource/change-close-status"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isClosed", z);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182263l, "switchGiftEffectSettings", jSONObject.toString()).map(new qcj() { // from class: l.zrj
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vxj0.f186265a;
            }
        });
    }
}
