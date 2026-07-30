package p153l;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ihw0 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public jhw0 f115026a;

    /* JADX INFO: renamed from: b */
    public final xgw0 f115027b;

    public ihw0(xgw0 xgw0Var) {
        this.f115027b = xgw0Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        jhw0 jhw0Var = this.f115026a;
        if (jhw0Var != null) {
            jhw0Var.m144938a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m140042b(jhw0 jhw0Var) {
        this.f115026a = jhw0Var;
    }
}
