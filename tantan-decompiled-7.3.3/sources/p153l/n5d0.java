package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n5d0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final tlu0 f140328a;

    /* JADX INFO: renamed from: b */
    public final List f140329b = new ArrayList();

    /* JADX INFO: renamed from: c */
    @Nullable
    public g80 f140330c;

    public n5d0(@Nullable tlu0 tlu0Var) {
        this.f140328a = tlu0Var;
        if (tlu0Var != null) {
            try {
                List listZzj = tlu0Var.zzj();
                if (listZzj != null) {
                    Iterator it = listZzj.iterator();
                    while (it.hasNext()) {
                        g80 g80VarM129366e = g80.m129366e((zzu) it.next());
                        if (g80VarM129366e != null) {
                            this.f140329b.add(g80VarM129366e);
                        }
                    }
                }
            } catch (RemoteException e) {
                dct0.m115296e("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        tlu0 tlu0Var2 = this.f140328a;
        if (tlu0Var2 == null) {
            return;
        }
        try {
            zzu zzuVarZzf = tlu0Var2.zzf();
            if (zzuVarZzf != null) {
                this.f140330c = g80.m129366e(zzuVarZzf);
            }
        } catch (RemoteException e2) {
            dct0.m115296e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static n5d0 m161698d(@Nullable tlu0 tlu0Var) {
        if (tlu0Var != null) {
            return new n5d0(tlu0Var);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static n5d0 m161699e(@Nullable tlu0 tlu0Var) {
        return new n5d0(tlu0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public String m161700a() {
        try {
            tlu0 tlu0Var = this.f140328a;
            if (tlu0Var != null) {
                return tlu0Var.zzg();
            }
            return null;
        } catch (RemoteException e) {
            dct0.m115296e("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Bundle m161701b() {
        try {
            tlu0 tlu0Var = this.f140328a;
            if (tlu0Var != null) {
                return tlu0Var.zze();
            }
        } catch (RemoteException e) {
            dct0.m115296e("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public String m161702c() {
        try {
            tlu0 tlu0Var = this.f140328a;
            if (tlu0Var != null) {
                return tlu0Var.zzi();
            }
            return null;
        } catch (RemoteException e) {
            dct0.m115296e("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public final tlu0 m161703f() {
        return this.f140328a;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final JSONObject m161704g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strM161702c = m161702c();
        if (strM161702c == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strM161702c);
        }
        String strM161700a = m161700a();
        if (strM161700a == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strM161700a);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f140329b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((g80) it.next()).m129371f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        g80 g80Var = this.f140330c;
        if (g80Var != null) {
            jSONObject.put("Loaded Adapter Response", g80Var.m129371f());
        }
        Bundle bundleM161701b = m161701b();
        if (bundleM161701b != null) {
            jSONObject.put("Response Extras", k6s0.m148569b().m167055j(bundleM161701b));
        }
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return m161704g().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
