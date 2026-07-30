package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class g80 {

    /* JADX INFO: renamed from: a */
    public final zzu f102636a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final b70 f102637b;

    public g80(zzu zzuVar) {
        this.f102636a = zzuVar;
        zze zzeVar = zzuVar.zzc;
        this.f102637b = zzeVar == null ? null : zzeVar.m12304F();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static g80 m129366e(@Nullable zzu zzuVar) {
        if (zzuVar != null) {
            return new g80(zzuVar);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m129367a() {
        return this.f102636a.zzf;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m129368b() {
        return this.f102636a.zzh;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m129369c() {
        return this.f102636a.zzg;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m129370d() {
        return this.f102636a.zze;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final JSONObject m129371f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f102636a.zza);
        jSONObject.put("Latency", this.f102636a.zzb);
        String strM129370d = m129370d();
        if (strM129370d == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", strM129370d);
        }
        String strM129367a = m129367a();
        if (strM129367a == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", strM129367a);
        }
        String strM129369c = m129369c();
        if (strM129369c == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", strM129369c);
        }
        String strM129368b = m129368b();
        if (strM129368b == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", strM129368b);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f102636a.zzd.keySet()) {
            jSONObject2.put(str, this.f102636a.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        b70 b70Var = this.f102637b;
        if (b70Var == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", b70Var.mo102806e());
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return m129371f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
