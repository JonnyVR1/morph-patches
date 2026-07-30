package p153l;

import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class xgw0 {

    /* JADX INFO: renamed from: a */
    public JSONObject f194255a;

    /* JADX INFO: renamed from: b */
    public final jhw0 f194256b;

    public xgw0(jhw0 jhw0Var) {
        this.f194256b = jhw0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public final JSONObject m210961a() {
        return this.f194255a;
    }

    /* JADX INFO: renamed from: b */
    public final void m210962b() {
        this.f194256b.m144939b(new khw0(this));
    }

    /* JADX INFO: renamed from: c */
    public final void m210963c(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f194256b.m144939b(new lhw0(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: d */
    public final void m210964d(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f194256b.m144939b(new mhw0(this, hashSet, jSONObject, j));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public final void m210965e(JSONObject jSONObject) {
        this.f194255a = jSONObject;
    }
}
