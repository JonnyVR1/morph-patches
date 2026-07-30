package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class irv extends f70 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public final kxc0 f114689e;

    public irv(int i, @NonNull String str, @NonNull String str2, @Nullable f70 f70Var, @Nullable kxc0 kxc0Var) {
        super(i, str, str2, f70Var);
        this.f114689e = kxc0Var;
    }

    @Override // p149l.f70
    @NonNull
    /* JADX INFO: renamed from: e */
    public final JSONObject mo119707e() throws JSONException {
        JSONObject jSONObjectMo119707e = super.mo119707e();
        kxc0 kxc0VarM137917f = m137917f();
        if (kxc0VarM137917f == null) {
            jSONObjectMo119707e.put("Response Info", "null");
            return jSONObjectMo119707e;
        }
        jSONObjectMo119707e.put("Response Info", kxc0VarM137917f.m147735g());
        return jSONObjectMo119707e;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public kxc0 m137917f() {
        return this.f114689e;
    }

    @Override // p149l.f70
    @NonNull
    public String toString() {
        try {
            return mo119707e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
