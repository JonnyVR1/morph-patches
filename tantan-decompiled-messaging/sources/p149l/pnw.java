package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class pnw {

    /* JADX INFO: renamed from: a */
    private List<ivl> f150416a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private ivl m170468b(String str) {
        for (ivl ivlVar : this.f150416a) {
            if (ivlVar.getKey().equals(str)) {
                return ivlVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m170469a(ivl ivlVar) {
        ivl ivlVarM170468b = m170468b(ivlVar.getKey());
        if (ivlVarM170468b != null) {
            this.f150416a.remove(ivlVarM170468b);
        }
        this.f150416a.add(ivlVar);
    }

    /* JADX INFO: renamed from: c */
    public boolean m170470c() {
        return this.f150416a.size() > 0;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public JSONObject m170471d() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (ivl ivlVar : this.f150416a) {
                if (ivlVar != null && !TextUtils.isEmpty(ivlVar.getKey()) && ivlVar.getValue() != null) {
                    jSONObject.put(ivlVar.getKey(), ivlVar.getValue());
                }
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
