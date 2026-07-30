package p149l;

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
public final class kxc0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final ncu0 f125097a;

    /* JADX INFO: renamed from: b */
    public final List f125098b = new ArrayList();

    /* JADX INFO: renamed from: c */
    @Nullable
    public k80 f125099c;

    public kxc0(@Nullable ncu0 ncu0Var) {
        this.f125097a = ncu0Var;
        if (ncu0Var != null) {
            try {
                List listZzj = ncu0Var.zzj();
                if (listZzj != null) {
                    Iterator it = listZzj.iterator();
                    while (it.hasNext()) {
                        k80 k80VarM144823e = k80.m144823e((zzu) it.next());
                        if (k80VarM144823e != null) {
                            this.f125098b.add(k80VarM144823e);
                        }
                    }
                }
            } catch (RemoteException e) {
                x2t0.m206867e("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        ncu0 ncu0Var2 = this.f125097a;
        if (ncu0Var2 == null) {
            return;
        }
        try {
            zzu zzuVarZzf = ncu0Var2.zzf();
            if (zzuVarZzf != null) {
                this.f125099c = k80.m144823e(zzuVarZzf);
            }
        } catch (RemoteException e2) {
            x2t0.m206867e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static kxc0 m147729d(@Nullable ncu0 ncu0Var) {
        if (ncu0Var != null) {
            return new kxc0(ncu0Var);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static kxc0 m147730e(@Nullable ncu0 ncu0Var) {
        return new kxc0(ncu0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public String m147731a() {
        try {
            ncu0 ncu0Var = this.f125097a;
            if (ncu0Var != null) {
                return ncu0Var.zzg();
            }
            return null;
        } catch (RemoteException e) {
            x2t0.m206867e("Could not forward getMediationAdapterClassName to ResponseInfo.", e);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Bundle m147732b() {
        try {
            ncu0 ncu0Var = this.f125097a;
            if (ncu0Var != null) {
                return ncu0Var.zze();
            }
        } catch (RemoteException e) {
            x2t0.m206867e("Could not forward getResponseExtras to ResponseInfo.", e);
        }
        return new Bundle();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public String m147733c() {
        try {
            ncu0 ncu0Var = this.f125097a;
            if (ncu0Var != null) {
                return ncu0Var.zzi();
            }
            return null;
        } catch (RemoteException e) {
            x2t0.m206867e("Could not forward getResponseId to ResponseInfo.", e);
            return null;
        }
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public final ncu0 m147734f() {
        return this.f125097a;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final JSONObject m147735g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strM147733c = m147733c();
        if (strM147733c == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strM147733c);
        }
        String strM147731a = m147731a();
        if (strM147731a == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strM147731a);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f125098b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((k80) it.next()).m144828f());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        k80 k80Var = this.f125099c;
        if (k80Var != null) {
            jSONObject.put("Loaded Adapter Response", k80Var.m144828f());
        }
        Bundle bundleM147732b = m147732b();
        if (bundleM147732b != null) {
            jSONObject.put("Response Extras", exr0.m118703b().m134102j(bundleM147732b));
        }
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return m147735g().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
