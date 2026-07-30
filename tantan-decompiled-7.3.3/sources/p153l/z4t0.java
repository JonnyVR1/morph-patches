package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcei;
import org.eclipse.jetty.http.HttpMethods;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class z4t0 extends a5t0 {

    /* JADX INFO: renamed from: a */
    public final Object f202977a = new Object();

    /* JADX INFO: renamed from: b */
    public final Context f202978b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public SharedPreferences f202979c;

    /* JADX INFO: renamed from: d */
    public final evs0 f202980d;

    public z4t0(Context context, evs0 evs0Var) {
        this.f202978b = context.getApplicationContext();
        this.f202980d = evs0Var;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m218612c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcei.m13612F().zza);
            jSONObject.put("mf", hjs0.f110317a.m149974e());
            jSONObject.put("cl", "610756093");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", HttpMethods.HEAD);
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m12529c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // p153l.a5t0
    /* JADX INFO: renamed from: a */
    public final hpr mo96252a() {
        synchronized (this.f202977a) {
            try {
                if (this.f202979c == null) {
                    this.f202979c = this.f202978b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bxy0.m106918b().currentTimeMillis() - this.f202979c.getLong("js_last_update", 0L) < ((Long) hjs0.f110318b.m149974e()).longValue()) {
            return pvw0.m173981h(null);
        }
        return pvw0.m173986m(this.f202980d.zzb(m218612c(this.f202978b)), new eow0() { // from class: l.y4t0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                this.f197515a.m218613b((JSONObject) obj);
                return null;
            }
        }, oct0.f146738f);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Void m218613b(JSONObject jSONObject) {
        dgs0 dgs0Var = sgs0.f168227a;
        jas0.m144074b();
        SharedPreferences.Editor editorEdit = fgs0.m125528a(this.f202978b).edit();
        jas0.m144073a();
        kis0 kis0Var = pis0.f152611a;
        jas0.m144073a().m120800e(editorEdit, 1, jSONObject);
        jas0.m144074b();
        editorEdit.commit();
        this.f202979c.edit().putLong("js_last_update", bxy0.m106918b().currentTimeMillis()).apply();
        return null;
    }
}
