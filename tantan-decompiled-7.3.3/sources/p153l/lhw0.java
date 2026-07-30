package p153l;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lhw0 extends hhw0 {
    public lhw0(xgw0 xgw0Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(xgw0Var, hashSet, jSONObject, j);
    }

    @Override // p153l.ihw0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        m154255c(str);
        super.onPostExecute(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m154255c(String str) {
        tfw0 tfw0VarM190995a = tfw0.m190995a();
        if (tfw0VarM190995a != null) {
            for (kfw0 kfw0Var : tfw0VarM190995a.m190997c()) {
                if (this.f109944c.contains(kfw0Var.m149628h())) {
                    kfw0Var.m149627g().m149767d(str, this.f109946e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f109945d.toString();
    }

    @Override // p153l.ihw0, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        m154255c(str);
        super.onPostExecute(str);
    }
}
