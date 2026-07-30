package p153l;

import android.os.AsyncTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class hry0 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xuy0 f111395a;

    public /* synthetic */ hry0(xuy0 xuy0Var, roy0 roy0Var) {
        this.f111395a = xuy0Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            xuy0 xuy0Var = this.f111395a;
            xuy0Var.f196341h = (v2s0) xuy0Var.f196336c.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            dct0.m115299h("", e);
        } catch (ExecutionException e2) {
            e = e2;
            dct0.m115299h("", e);
        } catch (TimeoutException e3) {
            dct0.m115299h("", e3);
        }
        return this.f111395a.zzp();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        xuy0 xuy0Var = this.f111395a;
        String str = (String) obj;
        if (xuy0Var.f196339f == null || str == null) {
            return;
        }
        xuy0Var.f196339f.loadUrl(str);
    }
}
