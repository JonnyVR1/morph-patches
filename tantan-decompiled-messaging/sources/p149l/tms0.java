package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbrm;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class tms0 implements jhs0 {

    /* JADX INFO: renamed from: a */
    public final pls0 f171171a;

    /* JADX INFO: renamed from: b */
    public final n3t0 f171172b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ums0 f171173c;

    public tms0(ums0 ums0Var, pls0 pls0Var, n3t0 n3t0Var) {
        this.f171173c = ums0Var;
        this.f171171a = pls0Var;
        this.f171172b = n3t0Var;
    }

    @Override // p149l.jhs0
    /* JADX INFO: renamed from: a */
    public final void mo102859a(JSONObject jSONObject) {
        try {
            try {
                this.f171172b.m157774b(this.f171173c.f177298a.mo97686a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.f171172b.m157775c(e);
            }
        } finally {
            this.f171171a.m170255g();
        }
    }

    @Override // p149l.jhs0
    public final void zza(@Nullable String str) {
        n3t0 n3t0Var = this.f171172b;
        try {
            if (str == null) {
                n3t0Var.m157775c(new zzbrm());
            } else {
                n3t0Var.m157775c(new zzbrm(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.f171171a.m170255g();
        }
    }
}
