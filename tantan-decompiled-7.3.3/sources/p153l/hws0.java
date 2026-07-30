package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbrm;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hws0 implements pqs0 {

    /* JADX INFO: renamed from: a */
    public final tct0 f111919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ iws0 f111920b;

    public hws0(iws0 iws0Var, tct0 tct0Var) {
        this.f111920b = iws0Var;
        this.f111919a = tct0Var;
    }

    @Override // p153l.pqs0
    /* JADX INFO: renamed from: a */
    public final void mo137504a(JSONObject jSONObject) {
        try {
            this.f111919a.m190494b(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f111919a.m190495c(e);
        }
    }

    @Override // p153l.pqs0
    public final void zza(@Nullable String str) {
        tct0 tct0Var = this.f111919a;
        try {
            if (str == null) {
                tct0Var.m190495c(new zzbrm());
            } else {
                tct0Var.m190495c(new zzbrm(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
