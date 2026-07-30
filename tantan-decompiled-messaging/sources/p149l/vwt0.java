package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public final class vwt0 extends gbu0 {

    /* JADX INFO: renamed from: a */
    public final String f183365a;

    /* JADX INFO: renamed from: b */
    public final String f183366b;

    /* JADX INFO: renamed from: c */
    public final String f183367c;

    /* JADX INFO: renamed from: d */
    public final String f183368d;

    /* JADX INFO: renamed from: e */
    public final List f183369e;

    /* JADX INFO: renamed from: f */
    public final long f183370f;

    /* JADX INFO: renamed from: g */
    public final String f183371g;

    /* JADX INFO: renamed from: h */
    public final n3v0 f183372h;

    /* JADX INFO: renamed from: i */
    public final Bundle f183373i;

    public vwt0(kxv0 kxv0Var, String str, n3v0 n3v0Var, nxv0 nxv0Var, String str2) {
        String string = null;
        this.f183366b = kxv0Var == null ? null : kxv0Var.f125188c0;
        this.f183367c = str2;
        this.f183368d = nxv0Var == null ? null : nxv0Var.f141055b;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = kxv0Var.f125226w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f183365a = string != null ? string : str;
        this.f183369e = n3v0Var.m157779c();
        this.f183372h = n3v0Var;
        this.f183370f = vny0.m199064b().currentTimeMillis() / 1000;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132043Q6)).booleanValue() || nxv0Var == null) {
            this.f183373i = new Bundle();
        } else {
            this.f183373i = nxv0Var.f141063j;
        }
        this.f183371g = (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132218e9)).booleanValue() || nxv0Var == null || TextUtils.isEmpty(nxv0Var.f141061h)) ? "" : nxv0Var.f141061h;
    }

    public final long zzc() {
        return this.f183370f;
    }

    public final String zzd() {
        return this.f183371g;
    }

    @Override // p149l.ncu0
    public final Bundle zze() {
        return this.f183373i;
    }

    @Override // p149l.ncu0
    @Nullable
    public final zzu zzf() {
        n3v0 n3v0Var = this.f183372h;
        if (n3v0Var != null) {
            return n3v0Var.m157777a();
        }
        return null;
    }

    @Override // p149l.ncu0
    public final String zzg() {
        return this.f183365a;
    }

    @Override // p149l.ncu0
    public final String zzh() {
        return this.f183367c;
    }

    @Override // p149l.ncu0
    public final String zzi() {
        return this.f183366b;
    }

    @Override // p149l.ncu0
    public final List zzj() {
        return this.f183369e;
    }

    public final String zzk() {
        return this.f183368d;
    }
}
