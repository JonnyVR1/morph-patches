package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class k80 {

    /* JADX INFO: renamed from: a */
    public final zzu f121710a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final f70 f121711b;

    public k80(zzu zzuVar) {
        this.f121710a = zzuVar;
        zze zzeVar = zzuVar.zzc;
        this.f121711b = zzeVar == null ? null : zzeVar.m12250F();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static k80 m144823e(@Nullable zzu zzuVar) {
        if (zzuVar != null) {
            return new k80(zzuVar);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m144824a() {
        return this.f121710a.zzf;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m144825b() {
        return this.f121710a.zzh;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m144826c() {
        return this.f121710a.zzg;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m144827d() {
        return this.f121710a.zze;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final JSONObject m144828f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f121710a.zza);
        jSONObject.put("Latency", this.f121710a.zzb);
        String strM144827d = m144827d();
        if (strM144827d == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", strM144827d);
        }
        String strM144824a = m144824a();
        if (strM144824a == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", strM144824a);
        }
        String strM144826c = m144826c();
        if (strM144826c == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", strM144826c);
        }
        String strM144825b = m144825b();
        if (strM144825b == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", strM144825b);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f121710a.zzd.keySet()) {
            jSONObject2.put(str, this.f121710a.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        f70 f70Var = this.f121711b;
        if (f70Var == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", f70Var.mo119707e());
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return m144828f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
