package p149l;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class g8w0 extends b8w0 {
    public g8w0(r7w0 r7w0Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(r7w0Var, hashSet, jSONObject, j);
    }

    @Override // p149l.c8w0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        n6w0 n6w0VarM158096a;
        if (!TextUtils.isEmpty(str) && (n6w0VarM158096a = n6w0.m158096a()) != null) {
            for (e6w0 e6w0Var : n6w0VarM158096a.m158098c()) {
                if (this.f74182c.contains(e6w0Var.m115116h())) {
                    e6w0Var.m115115g().m115221f(str, this.f74184e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (k7w0.m144710g(this.f74183d, this.f79823b.m178212a())) {
            return null;
        }
        this.f79823b.m178216e(this.f74183d);
        return this.f74183d.toString();
    }

    @Override // p149l.c8w0, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
