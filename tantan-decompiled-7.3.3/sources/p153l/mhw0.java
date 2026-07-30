package p153l;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mhw0 extends hhw0 {
    public mhw0(xgw0 xgw0Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(xgw0Var, hashSet, jSONObject, j);
    }

    @Override // p153l.ihw0
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        tfw0 tfw0VarM190995a;
        if (!TextUtils.isEmpty(str) && (tfw0VarM190995a = tfw0.m190995a()) != null) {
            for (kfw0 kfw0Var : tfw0VarM190995a.m190997c()) {
                if (this.f109944c.contains(kfw0Var.m149628h())) {
                    kfw0Var.m149627g().m149769f(str, this.f109946e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (qgw0.m176527g(this.f109945d, this.f115027b.m210961a())) {
            return null;
        }
        this.f115027b.m210965e(this.f109945d);
        return this.f109945d.toString();
    }

    @Override // p153l.ihw0, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
