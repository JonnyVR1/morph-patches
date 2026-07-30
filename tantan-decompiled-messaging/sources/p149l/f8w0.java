package p149l;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class f8w0 extends b8w0 {
    public f8w0(r7w0 r7w0Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(r7w0Var, hashSet, jSONObject, j);
    }

    @Override // p149l.c8w0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        m120056c(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m120056c(String str) {
        n6w0 n6w0VarM158096a = n6w0.m158096a();
        if (n6w0VarM158096a != null) {
            for (e6w0 e6w0Var : n6w0VarM158096a.m158098c()) {
                if (this.f74182c.contains(e6w0Var.m115116h())) {
                    e6w0Var.m115115g().m115219d(str, this.f74184e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f74183d.toString();
    }

    @Override // p149l.c8w0, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        m120056c(str);
        super.onPostExecute(str);
    }
}
