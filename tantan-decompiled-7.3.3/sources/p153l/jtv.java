package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class jtv extends b70 {

    /* JADX INFO: renamed from: e */
    @Nullable
    public final n5d0 f122626e;

    public jtv(int i, @NonNull String str, @NonNull String str2, @Nullable b70 b70Var, @Nullable n5d0 n5d0Var) {
        super(i, str, str2, b70Var);
        this.f122626e = n5d0Var;
    }

    @Override // p153l.b70
    @NonNull
    /* JADX INFO: renamed from: e */
    public final JSONObject mo102806e() throws JSONException {
        JSONObject jSONObjectMo102806e = super.mo102806e();
        n5d0 n5d0VarM146920f = m146920f();
        if (n5d0VarM146920f == null) {
            jSONObjectMo102806e.put("Response Info", "null");
            return jSONObjectMo102806e;
        }
        jSONObjectMo102806e.put("Response Info", n5d0VarM146920f.m161704g());
        return jSONObjectMo102806e;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public n5d0 m146920f() {
        return this.f122626e;
    }

    @Override // p153l.b70
    @NonNull
    public String toString() {
        try {
            return mo102806e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
