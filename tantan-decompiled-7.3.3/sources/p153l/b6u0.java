package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class b6u0 extends mku0 {

    /* JADX INFO: renamed from: a */
    public final String f75208a;

    /* JADX INFO: renamed from: b */
    public final String f75209b;

    /* JADX INFO: renamed from: c */
    public final String f75210c;

    /* JADX INFO: renamed from: d */
    public final String f75211d;

    /* JADX INFO: renamed from: e */
    public final List f75212e;

    /* JADX INFO: renamed from: f */
    public final long f75213f;

    /* JADX INFO: renamed from: g */
    public final String f75214g;

    /* JADX INFO: renamed from: h */
    public final tcv0 f75215h;

    /* JADX INFO: renamed from: i */
    public final Bundle f75216i;

    public b6u0(q6w0 q6w0Var, String str, tcv0 tcv0Var, t6w0 t6w0Var, String str2) {
        String string = null;
        this.f75209b = q6w0Var == null ? null : q6w0Var.f155878c0;
        this.f75210c = str2;
        this.f75211d = t6w0Var == null ? null : t6w0Var.f172368b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = q6w0Var.f155916w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f75208a = string != null ? string : str;
        this.f75212e = tcv0Var.m190511c();
        this.f75215h = tcv0Var;
        this.f75213f = bxy0.m106918b().currentTimeMillis() / 1000;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168114Q6)).booleanValue() || t6w0Var == null) {
            this.f75216i = new Bundle();
        } else {
            this.f75216i = t6w0Var.f172376j;
        }
        this.f75214g = (!((Boolean) jas0.m144075c().m176505a(sgs0.f168289e9)).booleanValue() || t6w0Var == null || TextUtils.isEmpty(t6w0Var.f172374h)) ? "" : t6w0Var.f172374h;
    }

    public final long zzc() {
        return this.f75213f;
    }

    public final String zzd() {
        return this.f75214g;
    }

    @Override // p153l.tlu0
    public final Bundle zze() {
        return this.f75216i;
    }

    @Override // p153l.tlu0
    @Nullable
    public final zzu zzf() {
        tcv0 tcv0Var = this.f75215h;
        if (tcv0Var != null) {
            return tcv0Var.m190509a();
        }
        return null;
    }

    @Override // p153l.tlu0
    public final String zzg() {
        return this.f75208a;
    }

    @Override // p153l.tlu0
    public final String zzh() {
        return this.f75210c;
    }

    @Override // p153l.tlu0
    public final String zzi() {
        return this.f75209b;
    }

    @Override // p153l.tlu0
    public final List zzj() {
        return this.f75212e;
    }

    public final String zzk() {
        return this.f75211d;
    }
}
