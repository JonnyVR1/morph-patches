package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class nqw {

    /* JADX INFO: renamed from: a */
    private List<ayl> f143262a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private ayl m164355b(String str) {
        for (ayl aylVar : this.f143262a) {
            if (aylVar.getKey().equals(str)) {
                return aylVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m164356a(ayl aylVar) {
        ayl aylVarM164355b = m164355b(aylVar.getKey());
        if (aylVarM164355b != null) {
            this.f143262a.remove(aylVarM164355b);
        }
        this.f143262a.add(aylVar);
    }

    /* JADX INFO: renamed from: c */
    public boolean m164357c() {
        return this.f143262a.size() > 0;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public JSONObject m164358d() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (ayl aylVar : this.f143262a) {
                if (aylVar != null && !TextUtils.isEmpty(aylVar.getKey()) && aylVar.getValue() != null) {
                    jSONObject.put(aylVar.getKey(), aylVar.getValue());
                }
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
