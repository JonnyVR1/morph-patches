package p149l;

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
public final class tvs0 extends uvs0 {

    /* JADX INFO: renamed from: a */
    public final Object f172334a = new Object();

    /* JADX INFO: renamed from: b */
    public final Context f172335b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public SharedPreferences f172336c;

    /* JADX INFO: renamed from: d */
    public final yls0 f172337d;

    public tvs0(Context context, yls0 yls0Var) {
        this.f172335b = context.getApplicationContext();
        this.f172337d = yls0Var;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m190783c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzcei.m13558F().zza);
            jSONObject.put("mf", bas0.f74716a.m115379e());
            jSONObject.put("cl", "610756093");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", HttpMethods.HEAD);
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m12475c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // p149l.uvs0
    /* JADX INFO: renamed from: a */
    public final gnr mo190784a() {
        synchronized (this.f172334a) {
            try {
                if (this.f172336c == null) {
                    this.f172336c = this.f172335b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vny0.m199064b().currentTimeMillis() - this.f172336c.getLong("js_last_update", 0L) < ((Long) bas0.f74717b.m115379e()).longValue()) {
            return jmw0.m142235h(null);
        }
        return jmw0.m142240m(this.f172337d.zzb(m190783c(this.f172335b)), new yew0() { // from class: l.svs0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                this.f166591a.m190785b((JSONObject) obj);
                return null;
            }
        }, i3t0.f111377f);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Void m190785b(JSONObject jSONObject) {
        x6s0 x6s0Var = m7s0.f132156a;
        d1s0.m109676b();
        SharedPreferences.Editor editorEdit = z6s0.m217419a(this.f172335b).edit();
        d1s0.m109675a();
        e9s0 e9s0Var = j9s0.f116957a;
        d1s0.m109675a().m213245e(editorEdit, 1, jSONObject);
        d1s0.m109676b();
        editorEdit.commit();
        this.f172336c.edit().putLong("js_last_update", vny0.m199064b().currentTimeMillis()).apply();
        return null;
    }
}
