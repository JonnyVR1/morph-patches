package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbrm;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zvs0 implements pqs0 {

    /* JADX INFO: renamed from: a */
    public final vus0 f206283a;

    /* JADX INFO: renamed from: b */
    public final tct0 f206284b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aws0 f206285c;

    public zvs0(aws0 aws0Var, vus0 vus0Var, tct0 tct0Var) {
        this.f206285c = aws0Var;
        this.f206283a = vus0Var;
        this.f206284b = tct0Var;
    }

    @Override // p153l.pqs0
    /* JADX INFO: renamed from: a */
    public final void mo137504a(JSONObject jSONObject) {
        try {
            try {
                this.f206284b.m190494b(this.f206285c.f73790a.mo124251a(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.f206284b.m190495c(e);
            }
        } finally {
            this.f206283a.m202889g();
        }
    }

    @Override // p153l.pqs0
    public final void zza(@Nullable String str) {
        tct0 tct0Var = this.f206284b;
        try {
            if (str == null) {
                tct0Var.m190495c(new zzbrm());
            } else {
                tct0Var.m190495c(new zzbrm(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.f206283a.m202889g();
        }
    }
}
