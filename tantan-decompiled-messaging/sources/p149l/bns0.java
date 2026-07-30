package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbrm;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bns0 implements jhs0 {

    /* JADX INFO: renamed from: a */
    public final n3t0 f76435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cns0 f76436b;

    public bns0(cns0 cns0Var, n3t0 n3t0Var) {
        this.f76436b = cns0Var;
        this.f76435a = n3t0Var;
    }

    @Override // p149l.jhs0
    /* JADX INFO: renamed from: a */
    public final void mo102859a(JSONObject jSONObject) {
        try {
            this.f76435a.m157774b(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f76435a.m157775c(e);
        }
    }

    @Override // p149l.jhs0
    public final void zza(@Nullable String str) {
        n3t0 n3t0Var = this.f76435a;
        try {
            if (str == null) {
                n3t0Var.m157775c(new zzbrm());
            } else {
                n3t0Var.m157775c(new zzbrm(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
