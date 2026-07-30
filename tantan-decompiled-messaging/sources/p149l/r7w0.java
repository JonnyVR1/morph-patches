package p149l;

import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class r7w0 {

    /* JADX INFO: renamed from: a */
    public JSONObject f158099a;

    /* JADX INFO: renamed from: b */
    public final d8w0 f158100b;

    public r7w0(d8w0 d8w0Var) {
        this.f158100b = d8w0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public final JSONObject m178212a() {
        return this.f158099a;
    }

    /* JADX INFO: renamed from: b */
    public final void m178213b() {
        this.f158100b.m110395b(new e8w0(this));
    }

    /* JADX INFO: renamed from: c */
    public final void m178214c(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f158100b.m110395b(new f8w0(this, hashSet, jSONObject, j));
    }

    /* JADX INFO: renamed from: d */
    public final void m178215d(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f158100b.m110395b(new g8w0(this, hashSet, jSONObject, j));
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public final void m178216e(JSONObject jSONObject) {
        this.f158099a = jSONObject;
    }
}
